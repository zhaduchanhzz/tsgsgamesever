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

public final class FairylandMsg {
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandInfo_4701_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandInfo_4701_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandInfo_4702_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandInfo_4702_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandHero_4703_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandHero_4703_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandHero_4704_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandHero_4704_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandExplore_4705_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandExplore_4705_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandExplore_4706_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandExplore_4706_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_ExploreInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_ExploreInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandBattle_4707_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandBattle_4707_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandBattle_4708_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandBattle_4708_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandRank_4709_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandRank_4709_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandRank_4710_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandRank_4710_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_ExploreRankData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_ExploreRankData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_S2S_FairylandHero_4711_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_S2S_FairylandHero_4711_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_S2S_FairylandExplore_4712_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_S2S_FairylandExplore_4712_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_S2S_ExploreAward_4713_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_S2S_ExploreAward_4713_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_C2S_StageSweep_4714_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_C2S_StageSweep_4714_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_S2C_StageSweep_4715_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_S2C_StageSweep_4715_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_S2C_BattleEnd_4716_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_S2C_BattleEnd_4716_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveCommonAward_4717_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveCommonAward_4717_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveCommonAward_4718_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveCommonAward_4718_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveExtraAward_4719_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveExtraAward_4719_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveExtraAward_4720_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveExtraAward_4720_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_S2S_UpdateHero_4721_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_S2S_UpdateHero_4721_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_S2S_SendRankAward_4722_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_S2S_SendRankAward_4722_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_S2S_NotifyBattle_4723_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_S2S_NotifyBattle_4723_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_C2S_BattleRecord_4724_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_C2S_BattleRecord_4724_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_S2C_BattleRecord_4725_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_S2C_BattleRecord_4725_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_RecordData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_RecordData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveRecordAward_4726_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveRecordAward_4726_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveRecordAward_4727_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveRecordAward_4727_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandGuanJia_4728_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandGuanJia_4728_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandGuanJia_4729_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandGuanJia_4729_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private FairylandMsg() {
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
      String[] descriptorData = new String[]{"\n\u000fFairyland.proto\u0012\u001bfairyland.com.gzbz.protobuf\u001a\fcommon.proto\u001a\fbattle.proto\"½\u0002\n\u0016C2S_FairylandInfo_4701\u0012\u0010\n\bserverId\u0018\u0001 \u0001(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0001(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\u0012\u000b\n\u0003sex\u0018\u0004 \u0001(\u0005\u0012\n\n\u0002lv\u0018\u0005 \u0001(\u0005\u0012\u0013\n\u000bcombatPower\u0018\u0006 \u0001(\u0003\u0012\u000e\n\u0006headId\u0018\u0007 \u0001(\u0005\u0012\u0011\n\theadFrame\u0018\b \u0001(\u0005\u0012\u0010\n\bprestige\u0018\t \u0001(\u0005\u0012\u0011\n\tmonarchId\u0018\n \u0001(\u0005\u0012\u000f\n\u0007unionId\u0018\u000b \u0001(\u0005\u0012\u0011\n\tunionName\u0018\f \u0001(\t\u0012\u000e\n\u0006vipLev\u0018\u000e \u0001(\u0005\u0012\u000e\n\u0006stepId\u0018\u000f \u0001(\u0005\u0012\u0010\n\bprovince\u0018\u0010 \u0001(\t\u0012\f\n\u0004city\u0018\u0011 \u0001(\t\u0012\u0011\n\tticketNum\u0018\u0012 \u0001(\u0005\"í\u0001\n\u0016S2C_FairylandInfo_4702\u0012\u000f\n\u0007stageId\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rreceivedAward\u0018\u0002 \u0003(\u0005\u0012\u0012\n\nextraAward\u0018\u0003 \u0003(\u0005\u0012\"\n\bheroInfo\u0018\u0004 \u0001(\u000b2\u0010.common.HeroInfo\u0012\u0013\n\u000bcommonSweep\u0018\u0005 \u0002(\u0005\u0012\u0011\n\tticketNum\u0018\u0006 \u0002(\u0005\u00128\n\u0007records\u0018\u0007 \u0003(\u000b2'.fairyland.com.gzbz.protobuf.RecordData\u0012\u0011\n\tpassState\u0018\b \u0002(\u0005\"*\n\u0016C2S_FairylandHero_4703\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\"N\n\u0016S2C_FairylandHero_4704\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012\"\n\bheroInfo\u0018\u0002 \u0002(\u000b2\u0010.common.HeroInfo\"T\n\u0019C2S_FairylandExplore_4705\u0012\u0011\n\theroPower\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tflushHero\u0018\u0002 \u0001(\b\u0012\u0011\n\tticketNum\u0018\u0003 \u0001(\u0005\"S\n\u0019S2C_FairylandExplore_4706\u00126\n\u0004info\u0018\u0001 \u0003(\u000b2(.fairyland.com.gzbz.protobuf.ExploreInfo\"\u009a\u0001\n\u000bExploreInfo\u0012\u0012\n\ndegreeType\u0018\u0001 \u0002(\u0005\u0012\"\n\bheroInfo\u0018\u0002 \u0002(\u000b2\u0010.common.HeroInfo\u0012\u0010\n\bserverId\u0018\u0003 \u0001(\u0005\u0012\u0012\n\nplayerName\u0018\u0004 \u0001(\t\u0012\r\n\u0005level\u0018\u0005 \u0001(\u0005\u0012\f\n\u0004head\u0018\u0006 \u0001(\u0005\u0012\u0010\n\bplayerId\u0018\u0007 \u0001(\u0005\"\u00ad\u0001\n\u0018C2S_FairylandBattle_4707\u0012\u0012\n\ndegreeType\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tisSpecial\u0018\u0002 \u0001(\b\u0012\u0011\n\theroPower\u0018\u0003 \u0001(\u0005\u0012\u0010\n\barraying\u0018\u0004 \u0001(\f\u0012\u0010\n\bmaxPower\u0018\u0005 \u0001(\u0003\u0012\u000f\n\u0007stageId\u0018\u0006 \u0001(\u0005\u0012\u0011\n\tticketNum\u0018\u0007 \u0001(\u0005\u0012\u000f\n\u0007isSweep\u0018\b \u0001(\b\"¦\u0001\n\u0018S2C_FairylandBattle_4708\u00126\n\u0004info\u0018\u0001 \u0002(\u000b2(.fairyland.com.gzbz.protobuf.ExploreInfo\u0012\u0011\n\tticketNum\u0018\u0002 \u0002(\u0005\u0012?\n\u0006result\u0018\u0003 \u0001(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\"\u0018\n\u0016C2S_FairylandRank_4709\"\u0096\u0001\n\u0016S2C_FairylandRank_4710\u0012<\n\u0006myData\u0018\u0001 \u0002(\u000b2,.fairyland.com.gzbz.protobuf.ExploreRankData\u0012>\n\brankData\u0018\u0002 \u0003(\u000b2,.fairyland.com.gzbz.protobuf.ExploreRankData\"ò\u0001\n\u000fExploreRankData\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bwinScore\u0018\u0002 \u0002(\u0003\u0012\u0010\n\bplayerId\u0018\u0003 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0004 \u0001(\t\u0012\f\n\u0004head\u0018\u0005 \u0001(\u0005\u0012\u0011\n\theadFrame\u0018\u0006 \u0001(\u0005\u0012\r\n\u0005level\u0018\u0007 \u0001(\u0005\u0012\r\n\u0005power\u0018\b \u0001(\u0003\u0012\u0011\n\tmonarchId\u0018\t \u0001(\u0005\u0012\u0010\n\bserverId\u0018\u000b \u0001(\u0005\u0012\u0011\n\tunionName\u0018\f \u0001(\t\u0012\"\n\bheroInfo\u0018\r \u0001(\u000b2\u0010.common.HeroInfo\"=\n\u0016S2S_FairylandHero_4711\u0012\u0010\n\bheroData\u0018\u0001 \u0002(\f\u0012\u0011\n\theroPower\u0018\u0002 \u0002(\u0005\"e\n\u0019S2S_FairylandExplore_4712\u00126\n\u0004info\u0018\u0001 \u0002(\u000b2(.fairyland.com.gzbz.protobuf.ExploreInfo\u0012\u0010\n\bheroData\u0018\u0002 \u0002(\f\"\u008b\u0001\n\u0015S2S_ExploreAward_4713\u0012\u0012\n\ndegreeType\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005isWin\u0018\u0002 \u0002(\b\u0012\u000e\n\u0006isShow\u0018\u0003 \u0002(\b\u0012?\n\u0006result\u0018\u0004 \u0001(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\"\u0015\n\u0013C2S_StageSweep_4714\")\n\u0013S2C_StageSweep_4715\u0012\u0012\n\nstageSweep\u0018\u0001 \u0002(\u0005\"8\n\u0012S2C_BattleEnd_4716\u0012\u000f\n\u0007stageId\u0018\u0002 \u0002(\u0005\u0012\u0011\n\tpassState\u0018\u0003 \u0002(\u0005\"/\n\u001bC2S_ReceiveCommonAward_4717\u0012\u0010\n\bstageSum\u0018\u0002 \u0002(\u0005\"U\n\u001bS2C_ReceiveCommonAward_4718\u0012\u0010\n\bstageSum\u0018\u0002 \u0002(\u0005\u0012\u0014\n\freceiveAward\u0018\u0003 \u0003(\u0005\u0012\u000e\n\u0006result\u0018\u0004 \u0002(\u0005\".\n\u001aC2S_ReceiveExtraAward_4719\u0012\u0010\n\bstageSum\u0018\u0001 \u0002(\u0005\"T\n\u001aS2C_ReceiveExtraAward_4720\u0012\u0010\n\bstageSum\u0018\u0001 \u0002(\u0005\u0012\u0014\n\freceiveExtra\u0018\u0003 \u0003(\u0005\u0012\u000e\n\u0006result\u0018\u0002 \u0002(\u0005\"\u0015\n\u0013S2S_UpdateHero_4721\";\n\u0016S2S_SendRankAward_4722\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bchangeCross\u0018\u0002 \u0002(\b\"«\u0001\n\u0015S2S_NotifyBattle_4723\u0012\u0010\n\bserverId\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0003 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0004 \u0002(\t\u0012\f\n\u0004head\u0018\u0005 \u0002(\u0005\u0012\u0011\n\theadFrame\u0018\u0006 \u0002(\u0005\u0012\f\n\u0004time\u0018\b \u0002(\u0005\u0012\r\n\u0005point\u0018\t \u0002(\u0005\u0012\r\n\u0005isWin\u0018\n \u0002(\b\u0012\r\n\u0005level\u0018\f \u0002(\u0005\"\u0017\n\u0015C2S_BattleRecord_4724\"Q\n\u0015S2C_BattleRecord_4725\u00128\n\u0007records\u0018\u0001 \u0003(\u000b2'.fairyland.com.gzbz.protobuf.RecordData\"Ð\u0001\n\nRecordData\u0012\u0010\n\brecordId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bserverId\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0003 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0004 \u0002(\t\u0012\f\n\u0004head\u0018\u0005 \u0002(\u0005\u0012\u0011\n\theadFrame\u0018\u0006 \u0002(\u0005\u0012\u000f\n\u0007stageId\u0018\u0007 \u0002(\u0005\u0012\f\n\u0004time\u0018\b \u0002(\u0005\u0012\r\n\u0005point\u0018\t \u0002(\u0005\u0012\r\n\u0005isWin\u0018\n \u0002(\b\u0012\u000b\n\u0003end\u0018\u000b \u0002(\b\u0012\r\n\u0005level\u0018\f \u0002(\u0005\"/\n\u001bC2S_ReceiveRecordAward_4726\u0012\u0010\n\brecordId\u0018\u0001 \u0002(\u0005\"/\n\u001bS2C_ReceiveRecordAward_4727\u0012\u0010\n\brecordId\u0018\u0001 \u0002(\u0005\"»\u0001\n\u0019C2S_FairylandGuanJia_4728\u0012\u0012\n\ndegreeType\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tisSpecial\u0018\u0002 \u0001(\b\u0012\u0011\n\theroPower\u0018\u0003 \u0001(\u0005\u0012\u0010\n\barraying\u0018\u0004 \u0001(\f\u0012\u0010\n\bmaxPower\u0018\u0005 \u0001(\u0003\u0012\u000f\n\u0007stageId\u0018\u0006 \u0001(\u0005\u0012\u0011\n\tticketNum\u0018\u0007 \u0001(\u0005\u0012\u000f\n\u0007isSweep\u0018\b \u0001(\b\u0012\u000b\n\u0003num\u0018\t \u0002(\u0005\"®\u0001\n\u0019S2C_FairylandGuanJia_4729\u0012\u0012\n\ndegreeType\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005isWin\u0018\u0002 \u0002(\b\u0012?\n\u0006result\u0018\u0004 \u0001(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\u0012\u000b\n\u0003num\u0018\u0005 \u0002(\u0005\u0012\u0010\n\btotalNum\u0018\u0006 \u0002(\u0005\u0012\u000e\n\u0006winNum\u0018\u0007 \u0002(\u0005B#\n\u0011com.gzbz.protobufB\fFairylandMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), BattleMsg.getDescriptor()});
      internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandInfo_4701_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandInfo_4701_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandInfo_4701_descriptor, new String[]{"ServerId", "PlayerId", "PlayerName", "Sex", "Lv", "CombatPower", "HeadId", "HeadFrame", "Prestige", "MonarchId", "UnionId", "UnionName", "VipLev", "StepId", "Province", "City", "TicketNum"});
      internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandInfo_4702_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandInfo_4702_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandInfo_4702_descriptor, new String[]{"StageId", "ReceivedAward", "ExtraAward", "HeroInfo", "CommonSweep", "TicketNum", "Records", "PassState"});
      internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandHero_4703_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandHero_4703_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandHero_4703_descriptor, new String[]{"HeroCode"});
      internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandHero_4704_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandHero_4704_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandHero_4704_descriptor, new String[]{"HeroCode", "HeroInfo"});
      internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandExplore_4705_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandExplore_4705_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandExplore_4705_descriptor, new String[]{"HeroPower", "FlushHero", "TicketNum"});
      internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandExplore_4706_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandExplore_4706_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandExplore_4706_descriptor, new String[]{"Info"});
      internal_static_fairyland_com_gzbz_protobuf_ExploreInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_fairyland_com_gzbz_protobuf_ExploreInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_ExploreInfo_descriptor, new String[]{"DegreeType", "HeroInfo", "ServerId", "PlayerName", "Level", "Head", "PlayerId"});
      internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandBattle_4707_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandBattle_4707_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandBattle_4707_descriptor, new String[]{"DegreeType", "IsSpecial", "HeroPower", "Arraying", "MaxPower", "StageId", "TicketNum", "IsSweep"});
      internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandBattle_4708_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandBattle_4708_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandBattle_4708_descriptor, new String[]{"Info", "TicketNum", "Result"});
      internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandRank_4709_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandRank_4709_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandRank_4709_descriptor, new String[0]);
      internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandRank_4710_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandRank_4710_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandRank_4710_descriptor, new String[]{"MyData", "RankData"});
      internal_static_fairyland_com_gzbz_protobuf_ExploreRankData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_fairyland_com_gzbz_protobuf_ExploreRankData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_ExploreRankData_descriptor, new String[]{"Rank", "WinScore", "PlayerId", "PlayerName", "Head", "HeadFrame", "Level", "Power", "MonarchId", "ServerId", "UnionName", "HeroInfo"});
      internal_static_fairyland_com_gzbz_protobuf_S2S_FairylandHero_4711_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_fairyland_com_gzbz_protobuf_S2S_FairylandHero_4711_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_S2S_FairylandHero_4711_descriptor, new String[]{"HeroData", "HeroPower"});
      internal_static_fairyland_com_gzbz_protobuf_S2S_FairylandExplore_4712_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_fairyland_com_gzbz_protobuf_S2S_FairylandExplore_4712_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_S2S_FairylandExplore_4712_descriptor, new String[]{"Info", "HeroData"});
      internal_static_fairyland_com_gzbz_protobuf_S2S_ExploreAward_4713_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_fairyland_com_gzbz_protobuf_S2S_ExploreAward_4713_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_S2S_ExploreAward_4713_descriptor, new String[]{"DegreeType", "IsWin", "IsShow", "Result"});
      internal_static_fairyland_com_gzbz_protobuf_C2S_StageSweep_4714_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_fairyland_com_gzbz_protobuf_C2S_StageSweep_4714_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_C2S_StageSweep_4714_descriptor, new String[0]);
      internal_static_fairyland_com_gzbz_protobuf_S2C_StageSweep_4715_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_fairyland_com_gzbz_protobuf_S2C_StageSweep_4715_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_S2C_StageSweep_4715_descriptor, new String[]{"StageSweep"});
      internal_static_fairyland_com_gzbz_protobuf_S2C_BattleEnd_4716_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_fairyland_com_gzbz_protobuf_S2C_BattleEnd_4716_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_S2C_BattleEnd_4716_descriptor, new String[]{"StageId", "PassState"});
      internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveCommonAward_4717_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveCommonAward_4717_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveCommonAward_4717_descriptor, new String[]{"StageSum"});
      internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveCommonAward_4718_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveCommonAward_4718_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveCommonAward_4718_descriptor, new String[]{"StageSum", "ReceiveAward", "Result"});
      internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveExtraAward_4719_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveExtraAward_4719_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveExtraAward_4719_descriptor, new String[]{"StageSum"});
      internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveExtraAward_4720_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveExtraAward_4720_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveExtraAward_4720_descriptor, new String[]{"StageSum", "ReceiveExtra", "Result"});
      internal_static_fairyland_com_gzbz_protobuf_S2S_UpdateHero_4721_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_fairyland_com_gzbz_protobuf_S2S_UpdateHero_4721_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_S2S_UpdateHero_4721_descriptor, new String[0]);
      internal_static_fairyland_com_gzbz_protobuf_S2S_SendRankAward_4722_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_fairyland_com_gzbz_protobuf_S2S_SendRankAward_4722_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_S2S_SendRankAward_4722_descriptor, new String[]{"Rank", "ChangeCross"});
      internal_static_fairyland_com_gzbz_protobuf_S2S_NotifyBattle_4723_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_fairyland_com_gzbz_protobuf_S2S_NotifyBattle_4723_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_S2S_NotifyBattle_4723_descriptor, new String[]{"ServerId", "PlayerId", "PlayerName", "Head", "HeadFrame", "Time", "Point", "IsWin", "Level"});
      internal_static_fairyland_com_gzbz_protobuf_C2S_BattleRecord_4724_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_fairyland_com_gzbz_protobuf_C2S_BattleRecord_4724_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_C2S_BattleRecord_4724_descriptor, new String[0]);
      internal_static_fairyland_com_gzbz_protobuf_S2C_BattleRecord_4725_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_fairyland_com_gzbz_protobuf_S2C_BattleRecord_4725_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_S2C_BattleRecord_4725_descriptor, new String[]{"Records"});
      internal_static_fairyland_com_gzbz_protobuf_RecordData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_fairyland_com_gzbz_protobuf_RecordData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_RecordData_descriptor, new String[]{"RecordId", "ServerId", "PlayerId", "PlayerName", "Head", "HeadFrame", "StageId", "Time", "Point", "IsWin", "End", "Level"});
      internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveRecordAward_4726_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveRecordAward_4726_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveRecordAward_4726_descriptor, new String[]{"RecordId"});
      internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveRecordAward_4727_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveRecordAward_4727_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveRecordAward_4727_descriptor, new String[]{"RecordId"});
      internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandGuanJia_4728_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandGuanJia_4728_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandGuanJia_4728_descriptor, new String[]{"DegreeType", "IsSpecial", "HeroPower", "Arraying", "MaxPower", "StageId", "TicketNum", "IsSweep", "Num"});
      internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandGuanJia_4729_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandGuanJia_4729_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandGuanJia_4729_descriptor, new String[]{"DegreeType", "IsWin", "Result", "Num", "TotalNum", "WinNum"});
      CommonMsg.getDescriptor();
      BattleMsg.getDescriptor();
   }

   public static final class C2S_FairylandInfo_4701 extends GeneratedMessageV3 implements C2S_FairylandInfo_4701OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SERVERID_FIELD_NUMBER = 1;
      private int serverId_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 3;
      private volatile Object playerName_;
      public static final int SEX_FIELD_NUMBER = 4;
      private int sex_;
      public static final int LV_FIELD_NUMBER = 5;
      private int lv_;
      public static final int COMBATPOWER_FIELD_NUMBER = 6;
      private long combatPower_;
      public static final int HEADID_FIELD_NUMBER = 7;
      private int headId_;
      public static final int HEADFRAME_FIELD_NUMBER = 8;
      private int headFrame_;
      public static final int PRESTIGE_FIELD_NUMBER = 9;
      private int prestige_;
      public static final int MONARCHID_FIELD_NUMBER = 10;
      private int monarchId_;
      public static final int UNIONID_FIELD_NUMBER = 11;
      private int unionId_;
      public static final int UNIONNAME_FIELD_NUMBER = 12;
      private volatile Object unionName_;
      public static final int VIPLEV_FIELD_NUMBER = 14;
      private int vipLev_;
      public static final int STEPID_FIELD_NUMBER = 15;
      private int stepId_;
      public static final int PROVINCE_FIELD_NUMBER = 16;
      private volatile Object province_;
      public static final int CITY_FIELD_NUMBER = 17;
      private volatile Object city_;
      public static final int TICKETNUM_FIELD_NUMBER = 18;
      private int ticketNum_;
      private byte memoizedIsInitialized;
      private static final C2S_FairylandInfo_4701 DEFAULT_INSTANCE = new C2S_FairylandInfo_4701();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FairylandInfo_4701> PARSER = new AbstractParser<C2S_FairylandInfo_4701>() {
         public C2S_FairylandInfo_4701 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FairylandInfo_4701(input, extensionRegistry);
         }
      };

      private C2S_FairylandInfo_4701(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FairylandInfo_4701() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
         this.unionName_ = "";
         this.province_ = "";
         this.city_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FairylandInfo_4701();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FairylandInfo_4701(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.sex_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.lv_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.combatPower_ = input.readInt64();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.headId_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.headFrame_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.prestige_ = input.readInt32();
                        break;
                     case 80:
                        this.bitField0_ |= 512;
                        this.monarchId_ = input.readInt32();
                        break;
                     case 88:
                        this.bitField0_ |= 1024;
                        this.unionId_ = input.readInt32();
                        break;
                     case 98:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2048;
                        this.unionName_ = bs;
                        break;
                     case 112:
                        this.bitField0_ |= 4096;
                        this.vipLev_ = input.readInt32();
                        break;
                     case 120:
                        this.bitField0_ |= 8192;
                        this.stepId_ = input.readInt32();
                        break;
                     case 130:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 16384;
                        this.province_ = bs;
                        break;
                     case 138:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 32768;
                        this.city_ = bs;
                        break;
                     case 144:
                        this.bitField0_ |= 65536;
                        this.ticketNum_ = input.readInt32();
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandInfo_4701_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandInfo_4701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FairylandInfo_4701.class, Builder.class);
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

      public boolean hasSex() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getSex() {
         return this.sex_;
      }

      public boolean hasLv() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getLv() {
         return this.lv_;
      }

      public boolean hasCombatPower() {
         return (this.bitField0_ & 32) != 0;
      }

      public long getCombatPower() {
         return this.combatPower_;
      }

      public boolean hasHeadId() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getHeadId() {
         return this.headId_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public boolean hasPrestige() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getPrestige() {
         return this.prestige_;
      }

      public boolean hasMonarchId() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getMonarchId() {
         return this.monarchId_;
      }

      public boolean hasUnionId() {
         return (this.bitField0_ & 1024) != 0;
      }

      public int getUnionId() {
         return this.unionId_;
      }

      public boolean hasUnionName() {
         return (this.bitField0_ & 2048) != 0;
      }

      public String getUnionName() {
         Object ref = this.unionName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.unionName_ = s;
            }

            return s;
         }
      }

      public ByteString getUnionNameBytes() {
         Object ref = this.unionName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.unionName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasVipLev() {
         return (this.bitField0_ & 4096) != 0;
      }

      public int getVipLev() {
         return this.vipLev_;
      }

      public boolean hasStepId() {
         return (this.bitField0_ & 8192) != 0;
      }

      public int getStepId() {
         return this.stepId_;
      }

      public boolean hasProvince() {
         return (this.bitField0_ & 16384) != 0;
      }

      public String getProvince() {
         Object ref = this.province_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.province_ = s;
            }

            return s;
         }
      }

      public ByteString getProvinceBytes() {
         Object ref = this.province_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.province_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasCity() {
         return (this.bitField0_ & '耀') != 0;
      }

      public String getCity() {
         Object ref = this.city_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.city_ = s;
            }

            return s;
         }
      }

      public ByteString getCityBytes() {
         Object ref = this.city_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.city_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasTicketNum() {
         return (this.bitField0_ & 65536) != 0;
      }

      public int getTicketNum() {
         return this.ticketNum_;
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
            output.writeInt32(1, this.serverId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.playerName_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.sex_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.lv_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt64(6, this.combatPower_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.headId_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.headFrame_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.prestige_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(10, this.monarchId_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            output.writeInt32(11, this.unionId_);
         }

         if ((this.bitField0_ & 2048) != 0) {
            GeneratedMessageV3.writeString(output, 12, this.unionName_);
         }

         if ((this.bitField0_ & 4096) != 0) {
            output.writeInt32(14, this.vipLev_);
         }

         if ((this.bitField0_ & 8192) != 0) {
            output.writeInt32(15, this.stepId_);
         }

         if ((this.bitField0_ & 16384) != 0) {
            GeneratedMessageV3.writeString(output, 16, this.province_);
         }

         if ((this.bitField0_ & '耀') != 0) {
            GeneratedMessageV3.writeString(output, 17, this.city_);
         }

         if ((this.bitField0_ & 65536) != 0) {
            output.writeInt32(18, this.ticketNum_);
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
               size += CodedOutputStream.computeInt32Size(4, this.sex_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.lv_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt64Size(6, this.combatPower_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.headId_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.headFrame_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.prestige_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.monarchId_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.unionId_);
            }

            if ((this.bitField0_ & 2048) != 0) {
               size += GeneratedMessageV3.computeStringSize(12, this.unionName_);
            }

            if ((this.bitField0_ & 4096) != 0) {
               size += CodedOutputStream.computeInt32Size(14, this.vipLev_);
            }

            if ((this.bitField0_ & 8192) != 0) {
               size += CodedOutputStream.computeInt32Size(15, this.stepId_);
            }

            if ((this.bitField0_ & 16384) != 0) {
               size += GeneratedMessageV3.computeStringSize(16, this.province_);
            }

            if ((this.bitField0_ & '耀') != 0) {
               size += GeneratedMessageV3.computeStringSize(17, this.city_);
            }

            if ((this.bitField0_ & 65536) != 0) {
               size += CodedOutputStream.computeInt32Size(18, this.ticketNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FairylandInfo_4701)) {
            return super.equals(obj);
         } else {
            C2S_FairylandInfo_4701 other = (C2S_FairylandInfo_4701)obj;
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
            } else if (this.hasSex() != other.hasSex()) {
               return false;
            } else if (this.hasSex() && this.getSex() != other.getSex()) {
               return false;
            } else if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
               return false;
            } else if (this.hasCombatPower() != other.hasCombatPower()) {
               return false;
            } else if (this.hasCombatPower() && this.getCombatPower() != other.getCombatPower()) {
               return false;
            } else if (this.hasHeadId() != other.hasHeadId()) {
               return false;
            } else if (this.hasHeadId() && this.getHeadId() != other.getHeadId()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
               return false;
            } else if (this.hasPrestige() != other.hasPrestige()) {
               return false;
            } else if (this.hasPrestige() && this.getPrestige() != other.getPrestige()) {
               return false;
            } else if (this.hasMonarchId() != other.hasMonarchId()) {
               return false;
            } else if (this.hasMonarchId() && this.getMonarchId() != other.getMonarchId()) {
               return false;
            } else if (this.hasUnionId() != other.hasUnionId()) {
               return false;
            } else if (this.hasUnionId() && this.getUnionId() != other.getUnionId()) {
               return false;
            } else if (this.hasUnionName() != other.hasUnionName()) {
               return false;
            } else if (this.hasUnionName() && !this.getUnionName().equals(other.getUnionName())) {
               return false;
            } else if (this.hasVipLev() != other.hasVipLev()) {
               return false;
            } else if (this.hasVipLev() && this.getVipLev() != other.getVipLev()) {
               return false;
            } else if (this.hasStepId() != other.hasStepId()) {
               return false;
            } else if (this.hasStepId() && this.getStepId() != other.getStepId()) {
               return false;
            } else if (this.hasProvince() != other.hasProvince()) {
               return false;
            } else if (this.hasProvince() && !this.getProvince().equals(other.getProvince())) {
               return false;
            } else if (this.hasCity() != other.hasCity()) {
               return false;
            } else if (this.hasCity() && !this.getCity().equals(other.getCity())) {
               return false;
            } else if (this.hasTicketNum() != other.hasTicketNum()) {
               return false;
            } else if (this.hasTicketNum() && this.getTicketNum() != other.getTicketNum()) {
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

            if (this.hasSex()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSex();
            }

            if (this.hasLv()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getLv();
            }

            if (this.hasCombatPower()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashLong(this.getCombatPower());
            }

            if (this.hasHeadId()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getHeadId();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasPrestige()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getPrestige();
            }

            if (this.hasMonarchId()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getMonarchId();
            }

            if (this.hasUnionId()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getUnionId();
            }

            if (this.hasUnionName()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getUnionName().hashCode();
            }

            if (this.hasVipLev()) {
               hash = 37 * hash + 14;
               hash = 53 * hash + this.getVipLev();
            }

            if (this.hasStepId()) {
               hash = 37 * hash + 15;
               hash = 53 * hash + this.getStepId();
            }

            if (this.hasProvince()) {
               hash = 37 * hash + 16;
               hash = 53 * hash + this.getProvince().hashCode();
            }

            if (this.hasCity()) {
               hash = 37 * hash + 17;
               hash = 53 * hash + this.getCity().hashCode();
            }

            if (this.hasTicketNum()) {
               hash = 37 * hash + 18;
               hash = 53 * hash + this.getTicketNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FairylandInfo_4701 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FairylandInfo_4701)PARSER.parseFrom(data);
      }

      public static C2S_FairylandInfo_4701 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FairylandInfo_4701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FairylandInfo_4701 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FairylandInfo_4701)PARSER.parseFrom(data);
      }

      public static C2S_FairylandInfo_4701 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FairylandInfo_4701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FairylandInfo_4701 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FairylandInfo_4701)PARSER.parseFrom(data);
      }

      public static C2S_FairylandInfo_4701 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FairylandInfo_4701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FairylandInfo_4701 parseFrom(InputStream input) throws IOException {
         return (C2S_FairylandInfo_4701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FairylandInfo_4701 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FairylandInfo_4701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FairylandInfo_4701 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FairylandInfo_4701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FairylandInfo_4701 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FairylandInfo_4701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FairylandInfo_4701 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FairylandInfo_4701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FairylandInfo_4701 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FairylandInfo_4701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FairylandInfo_4701 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FairylandInfo_4701 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FairylandInfo_4701> parser() {
         return PARSER;
      }

      public Parser<C2S_FairylandInfo_4701> getParserForType() {
         return PARSER;
      }

      public C2S_FairylandInfo_4701 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FairylandInfo_4701OrBuilder {
         private int bitField0_;
         private int serverId_;
         private int playerId_;
         private Object playerName_;
         private int sex_;
         private int lv_;
         private long combatPower_;
         private int headId_;
         private int headFrame_;
         private int prestige_;
         private int monarchId_;
         private int unionId_;
         private Object unionName_;
         private int vipLev_;
         private int stepId_;
         private Object province_;
         private Object city_;
         private int ticketNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandInfo_4701_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandInfo_4701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FairylandInfo_4701.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.unionName_ = "";
            this.province_ = "";
            this.city_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.unionName_ = "";
            this.province_ = "";
            this.city_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.C2S_FairylandInfo_4701.alwaysUseFieldBuilders) {
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
            this.sex_ = 0;
            this.bitField0_ &= -9;
            this.lv_ = 0;
            this.bitField0_ &= -17;
            this.combatPower_ = 0L;
            this.bitField0_ &= -33;
            this.headId_ = 0;
            this.bitField0_ &= -65;
            this.headFrame_ = 0;
            this.bitField0_ &= -129;
            this.prestige_ = 0;
            this.bitField0_ &= -257;
            this.monarchId_ = 0;
            this.bitField0_ &= -513;
            this.unionId_ = 0;
            this.bitField0_ &= -1025;
            this.unionName_ = "";
            this.bitField0_ &= -2049;
            this.vipLev_ = 0;
            this.bitField0_ &= -4097;
            this.stepId_ = 0;
            this.bitField0_ &= -8193;
            this.province_ = "";
            this.bitField0_ &= -16385;
            this.city_ = "";
            this.bitField0_ &= -32769;
            this.ticketNum_ = 0;
            this.bitField0_ &= -65537;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandInfo_4701_descriptor;
         }

         public C2S_FairylandInfo_4701 getDefaultInstanceForType() {
            return FairylandMsg.C2S_FairylandInfo_4701.getDefaultInstance();
         }

         public C2S_FairylandInfo_4701 build() {
            C2S_FairylandInfo_4701 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FairylandInfo_4701 buildPartial() {
            C2S_FairylandInfo_4701 result = new C2S_FairylandInfo_4701(this);
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
               result.sex_ = this.sex_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.lv_ = this.lv_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.combatPower_ = this.combatPower_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.headId_ = this.headId_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.prestige_ = this.prestige_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.monarchId_ = this.monarchId_;
               to_bitField0_ |= 512;
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.unionId_ = this.unionId_;
               to_bitField0_ |= 1024;
            }

            if ((from_bitField0_ & 2048) != 0) {
               to_bitField0_ |= 2048;
            }

            result.unionName_ = this.unionName_;
            if ((from_bitField0_ & 4096) != 0) {
               result.vipLev_ = this.vipLev_;
               to_bitField0_ |= 4096;
            }

            if ((from_bitField0_ & 8192) != 0) {
               result.stepId_ = this.stepId_;
               to_bitField0_ |= 8192;
            }

            if ((from_bitField0_ & 16384) != 0) {
               to_bitField0_ |= 16384;
            }

            result.province_ = this.province_;
            if ((from_bitField0_ & '耀') != 0) {
               to_bitField0_ |= 32768;
            }

            result.city_ = this.city_;
            if ((from_bitField0_ & 65536) != 0) {
               result.ticketNum_ = this.ticketNum_;
               to_bitField0_ |= 65536;
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
            if (other instanceof C2S_FairylandInfo_4701) {
               return this.mergeFrom((C2S_FairylandInfo_4701)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FairylandInfo_4701 other) {
            if (other == FairylandMsg.C2S_FairylandInfo_4701.getDefaultInstance()) {
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

               if (other.hasSex()) {
                  this.setSex(other.getSex());
               }

               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               if (other.hasCombatPower()) {
                  this.setCombatPower(other.getCombatPower());
               }

               if (other.hasHeadId()) {
                  this.setHeadId(other.getHeadId());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               if (other.hasPrestige()) {
                  this.setPrestige(other.getPrestige());
               }

               if (other.hasMonarchId()) {
                  this.setMonarchId(other.getMonarchId());
               }

               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               if (other.hasUnionName()) {
                  this.bitField0_ |= 2048;
                  this.unionName_ = other.unionName_;
                  this.onChanged();
               }

               if (other.hasVipLev()) {
                  this.setVipLev(other.getVipLev());
               }

               if (other.hasStepId()) {
                  this.setStepId(other.getStepId());
               }

               if (other.hasProvince()) {
                  this.bitField0_ |= 16384;
                  this.province_ = other.province_;
                  this.onChanged();
               }

               if (other.hasCity()) {
                  this.bitField0_ |= 32768;
                  this.city_ = other.city_;
                  this.onChanged();
               }

               if (other.hasTicketNum()) {
                  this.setTicketNum(other.getTicketNum());
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
            C2S_FairylandInfo_4701 parsedMessage = null;

            try {
               parsedMessage = (C2S_FairylandInfo_4701)FairylandMsg.C2S_FairylandInfo_4701.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FairylandInfo_4701)e.getUnfinishedMessage();
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
            this.playerName_ = FairylandMsg.C2S_FairylandInfo_4701.getDefaultInstance().getPlayerName();
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

         public boolean hasSex() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getSex() {
            return this.sex_;
         }

         public Builder setSex(int value) {
            this.bitField0_ |= 8;
            this.sex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSex() {
            this.bitField0_ &= -9;
            this.sex_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLv() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getLv() {
            return this.lv_;
         }

         public Builder setLv(int value) {
            this.bitField0_ |= 16;
            this.lv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLv() {
            this.bitField0_ &= -17;
            this.lv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCombatPower() {
            return (this.bitField0_ & 32) != 0;
         }

         public long getCombatPower() {
            return this.combatPower_;
         }

         public Builder setCombatPower(long value) {
            this.bitField0_ |= 32;
            this.combatPower_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCombatPower() {
            this.bitField0_ &= -33;
            this.combatPower_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasHeadId() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getHeadId() {
            return this.headId_;
         }

         public Builder setHeadId(int value) {
            this.bitField0_ |= 64;
            this.headId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadId() {
            this.bitField0_ &= -65;
            this.headId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeadFrame() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getHeadFrame() {
            return this.headFrame_;
         }

         public Builder setHeadFrame(int value) {
            this.bitField0_ |= 128;
            this.headFrame_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadFrame() {
            this.bitField0_ &= -129;
            this.headFrame_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPrestige() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getPrestige() {
            return this.prestige_;
         }

         public Builder setPrestige(int value) {
            this.bitField0_ |= 256;
            this.prestige_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrestige() {
            this.bitField0_ &= -257;
            this.prestige_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMonarchId() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getMonarchId() {
            return this.monarchId_;
         }

         public Builder setMonarchId(int value) {
            this.bitField0_ |= 512;
            this.monarchId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMonarchId() {
            this.bitField0_ &= -513;
            this.monarchId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionId() {
            return (this.bitField0_ & 1024) != 0;
         }

         public int getUnionId() {
            return this.unionId_;
         }

         public Builder setUnionId(int value) {
            this.bitField0_ |= 1024;
            this.unionId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionId() {
            this.bitField0_ &= -1025;
            this.unionId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionName() {
            return (this.bitField0_ & 2048) != 0;
         }

         public String getUnionName() {
            Object ref = this.unionName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.unionName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getUnionNameBytes() {
            Object ref = this.unionName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.unionName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setUnionName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2048;
               this.unionName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearUnionName() {
            this.bitField0_ &= -2049;
            this.unionName_ = FairylandMsg.C2S_FairylandInfo_4701.getDefaultInstance().getUnionName();
            this.onChanged();
            return this;
         }

         public Builder setUnionNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2048;
               this.unionName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasVipLev() {
            return (this.bitField0_ & 4096) != 0;
         }

         public int getVipLev() {
            return this.vipLev_;
         }

         public Builder setVipLev(int value) {
            this.bitField0_ |= 4096;
            this.vipLev_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearVipLev() {
            this.bitField0_ &= -4097;
            this.vipLev_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStepId() {
            return (this.bitField0_ & 8192) != 0;
         }

         public int getStepId() {
            return this.stepId_;
         }

         public Builder setStepId(int value) {
            this.bitField0_ |= 8192;
            this.stepId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStepId() {
            this.bitField0_ &= -8193;
            this.stepId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasProvince() {
            return (this.bitField0_ & 16384) != 0;
         }

         public String getProvince() {
            Object ref = this.province_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.province_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getProvinceBytes() {
            Object ref = this.province_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.province_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setProvince(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16384;
               this.province_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearProvince() {
            this.bitField0_ &= -16385;
            this.province_ = FairylandMsg.C2S_FairylandInfo_4701.getDefaultInstance().getProvince();
            this.onChanged();
            return this;
         }

         public Builder setProvinceBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16384;
               this.province_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasCity() {
            return (this.bitField0_ & '耀') != 0;
         }

         public String getCity() {
            Object ref = this.city_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.city_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getCityBytes() {
            Object ref = this.city_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.city_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setCity(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 32768;
               this.city_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearCity() {
            this.bitField0_ &= -32769;
            this.city_ = FairylandMsg.C2S_FairylandInfo_4701.getDefaultInstance().getCity();
            this.onChanged();
            return this;
         }

         public Builder setCityBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 32768;
               this.city_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasTicketNum() {
            return (this.bitField0_ & 65536) != 0;
         }

         public int getTicketNum() {
            return this.ticketNum_;
         }

         public Builder setTicketNum(int value) {
            this.bitField0_ |= 65536;
            this.ticketNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTicketNum() {
            this.bitField0_ &= -65537;
            this.ticketNum_ = 0;
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

   public static final class S2C_FairylandInfo_4702 extends GeneratedMessageV3 implements S2C_FairylandInfo_4702OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGEID_FIELD_NUMBER = 1;
      private int stageId_;
      public static final int RECEIVEDAWARD_FIELD_NUMBER = 2;
      private Internal.IntList receivedAward_;
      public static final int EXTRAAWARD_FIELD_NUMBER = 3;
      private Internal.IntList extraAward_;
      public static final int HEROINFO_FIELD_NUMBER = 4;
      private CommonMsg.HeroInfo heroInfo_;
      public static final int COMMONSWEEP_FIELD_NUMBER = 5;
      private int commonSweep_;
      public static final int TICKETNUM_FIELD_NUMBER = 6;
      private int ticketNum_;
      public static final int RECORDS_FIELD_NUMBER = 7;
      private List<RecordData> records_;
      public static final int PASSSTATE_FIELD_NUMBER = 8;
      private int passState_;
      private byte memoizedIsInitialized;
      private static final S2C_FairylandInfo_4702 DEFAULT_INSTANCE = new S2C_FairylandInfo_4702();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FairylandInfo_4702> PARSER = new AbstractParser<S2C_FairylandInfo_4702>() {
         public S2C_FairylandInfo_4702 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FairylandInfo_4702(input, extensionRegistry);
         }
      };

      private S2C_FairylandInfo_4702(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FairylandInfo_4702() {
         this.memoizedIsInitialized = -1;
         this.receivedAward_ = emptyIntList();
         this.extraAward_ = emptyIntList();
         this.records_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FairylandInfo_4702();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FairylandInfo_4702(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.stageId_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.receivedAward_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.receivedAward_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.receivedAward_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.extraAward_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.extraAward_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.extraAward_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.extraAward_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 34:
                        CommonMsg.HeroInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.heroInfo_.toBuilder();
                        }

                        this.heroInfo_ = (CommonMsg.HeroInfo)input.readMessage(CommonMsg.HeroInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.heroInfo_);
                           this.heroInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        continue;
                     case 40:
                        this.bitField0_ |= 4;
                        this.commonSweep_ = input.readInt32();
                        continue;
                     case 48:
                        this.bitField0_ |= 8;
                        this.ticketNum_ = input.readInt32();
                        continue;
                     case 58:
                        if ((mutable_bitField0_ & 64) == 0) {
                           this.records_ = new ArrayList();
                           mutable_bitField0_ |= 64;
                        }

                        this.records_.add(input.readMessage(FairylandMsg.RecordData.PARSER, extensionRegistry));
                        continue;
                     case 64:
                        this.bitField0_ |= 16;
                        this.passState_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.receivedAward_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.receivedAward_.makeImmutable();
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.extraAward_.makeImmutable();
               }

               if ((mutable_bitField0_ & 64) != 0) {
                  this.records_ = Collections.unmodifiableList(this.records_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandInfo_4702_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandInfo_4702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FairylandInfo_4702.class, Builder.class);
      }

      public boolean hasStageId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStageId() {
         return this.stageId_;
      }

      public List<Integer> getReceivedAwardList() {
         return this.receivedAward_;
      }

      public int getReceivedAwardCount() {
         return this.receivedAward_.size();
      }

      public int getReceivedAward(int index) {
         return this.receivedAward_.getInt(index);
      }

      public List<Integer> getExtraAwardList() {
         return this.extraAward_;
      }

      public int getExtraAwardCount() {
         return this.extraAward_.size();
      }

      public int getExtraAward(int index) {
         return this.extraAward_.getInt(index);
      }

      public boolean hasHeroInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.HeroInfo getHeroInfo() {
         return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
      }

      public CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder() {
         return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
      }

      public boolean hasCommonSweep() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getCommonSweep() {
         return this.commonSweep_;
      }

      public boolean hasTicketNum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getTicketNum() {
         return this.ticketNum_;
      }

      public List<RecordData> getRecordsList() {
         return this.records_;
      }

      public List<? extends RecordDataOrBuilder> getRecordsOrBuilderList() {
         return this.records_;
      }

      public int getRecordsCount() {
         return this.records_.size();
      }

      public RecordData getRecords(int index) {
         return (RecordData)this.records_.get(index);
      }

      public RecordDataOrBuilder getRecordsOrBuilder(int index) {
         return (RecordDataOrBuilder)this.records_.get(index);
      }

      public boolean hasPassState() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getPassState() {
         return this.passState_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStageId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCommonSweep()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTicketNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPassState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasHeroInfo() && !this.getHeroInfo().isInitialized()) {
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
            output.writeInt32(1, this.stageId_);
         }

         for(int i = 0; i < this.receivedAward_.size(); ++i) {
            output.writeInt32(2, this.receivedAward_.getInt(i));
         }

         for(int i = 0; i < this.extraAward_.size(); ++i) {
            output.writeInt32(3, this.extraAward_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(4, this.getHeroInfo());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(5, this.commonSweep_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(6, this.ticketNum_);
         }

         for(int i = 0; i < this.records_.size(); ++i) {
            output.writeMessage(7, (MessageLite)this.records_.get(i));
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(8, this.passState_);
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
               size += CodedOutputStream.computeInt32Size(1, this.stageId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.receivedAward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.receivedAward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getReceivedAwardList().size();
            dataSize = 0;

            for(int i = 0; i < this.extraAward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.extraAward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getExtraAwardList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(4, this.getHeroInfo());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.commonSweep_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.ticketNum_);
            }

            for(int i = 0; i < this.records_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(7, (MessageLite)this.records_.get(i));
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.passState_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FairylandInfo_4702)) {
            return super.equals(obj);
         } else {
            S2C_FairylandInfo_4702 other = (S2C_FairylandInfo_4702)obj;
            if (this.hasStageId() != other.hasStageId()) {
               return false;
            } else if (this.hasStageId() && this.getStageId() != other.getStageId()) {
               return false;
            } else if (!this.getReceivedAwardList().equals(other.getReceivedAwardList())) {
               return false;
            } else if (!this.getExtraAwardList().equals(other.getExtraAwardList())) {
               return false;
            } else if (this.hasHeroInfo() != other.hasHeroInfo()) {
               return false;
            } else if (this.hasHeroInfo() && !this.getHeroInfo().equals(other.getHeroInfo())) {
               return false;
            } else if (this.hasCommonSweep() != other.hasCommonSweep()) {
               return false;
            } else if (this.hasCommonSweep() && this.getCommonSweep() != other.getCommonSweep()) {
               return false;
            } else if (this.hasTicketNum() != other.hasTicketNum()) {
               return false;
            } else if (this.hasTicketNum() && this.getTicketNum() != other.getTicketNum()) {
               return false;
            } else if (!this.getRecordsList().equals(other.getRecordsList())) {
               return false;
            } else if (this.hasPassState() != other.hasPassState()) {
               return false;
            } else if (this.hasPassState() && this.getPassState() != other.getPassState()) {
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
            if (this.hasStageId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStageId();
            }

            if (this.getReceivedAwardCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getReceivedAwardList().hashCode();
            }

            if (this.getExtraAwardCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getExtraAwardList().hashCode();
            }

            if (this.hasHeroInfo()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHeroInfo().hashCode();
            }

            if (this.hasCommonSweep()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getCommonSweep();
            }

            if (this.hasTicketNum()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getTicketNum();
            }

            if (this.getRecordsCount() > 0) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getRecordsList().hashCode();
            }

            if (this.hasPassState()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getPassState();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FairylandInfo_4702 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FairylandInfo_4702)PARSER.parseFrom(data);
      }

      public static S2C_FairylandInfo_4702 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FairylandInfo_4702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FairylandInfo_4702 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FairylandInfo_4702)PARSER.parseFrom(data);
      }

      public static S2C_FairylandInfo_4702 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FairylandInfo_4702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FairylandInfo_4702 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FairylandInfo_4702)PARSER.parseFrom(data);
      }

      public static S2C_FairylandInfo_4702 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FairylandInfo_4702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FairylandInfo_4702 parseFrom(InputStream input) throws IOException {
         return (S2C_FairylandInfo_4702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FairylandInfo_4702 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FairylandInfo_4702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FairylandInfo_4702 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FairylandInfo_4702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FairylandInfo_4702 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FairylandInfo_4702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FairylandInfo_4702 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FairylandInfo_4702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FairylandInfo_4702 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FairylandInfo_4702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FairylandInfo_4702 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FairylandInfo_4702 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FairylandInfo_4702> parser() {
         return PARSER;
      }

      public Parser<S2C_FairylandInfo_4702> getParserForType() {
         return PARSER;
      }

      public S2C_FairylandInfo_4702 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FairylandInfo_4702OrBuilder {
         private int bitField0_;
         private int stageId_;
         private Internal.IntList receivedAward_;
         private Internal.IntList extraAward_;
         private CommonMsg.HeroInfo heroInfo_;
         private SingleFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> heroInfoBuilder_;
         private int commonSweep_;
         private int ticketNum_;
         private List<RecordData> records_;
         private RepeatedFieldBuilderV3<RecordData, RecordData.Builder, RecordDataOrBuilder> recordsBuilder_;
         private int passState_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandInfo_4702_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandInfo_4702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FairylandInfo_4702.class, Builder.class);
         }

         private Builder() {
            this.receivedAward_ = FairylandMsg.S2C_FairylandInfo_4702.emptyIntList();
            this.extraAward_ = FairylandMsg.S2C_FairylandInfo_4702.emptyIntList();
            this.records_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.receivedAward_ = FairylandMsg.S2C_FairylandInfo_4702.emptyIntList();
            this.extraAward_ = FairylandMsg.S2C_FairylandInfo_4702.emptyIntList();
            this.records_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.S2C_FairylandInfo_4702.alwaysUseFieldBuilders) {
               this.getHeroInfoFieldBuilder();
               this.getRecordsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.stageId_ = 0;
            this.bitField0_ &= -2;
            this.receivedAward_ = FairylandMsg.S2C_FairylandInfo_4702.emptyIntList();
            this.bitField0_ &= -3;
            this.extraAward_ = FairylandMsg.S2C_FairylandInfo_4702.emptyIntList();
            this.bitField0_ &= -5;
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -9;
            this.commonSweep_ = 0;
            this.bitField0_ &= -17;
            this.ticketNum_ = 0;
            this.bitField0_ &= -33;
            if (this.recordsBuilder_ == null) {
               this.records_ = Collections.emptyList();
               this.bitField0_ &= -65;
            } else {
               this.recordsBuilder_.clear();
            }

            this.passState_ = 0;
            this.bitField0_ &= -129;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandInfo_4702_descriptor;
         }

         public S2C_FairylandInfo_4702 getDefaultInstanceForType() {
            return FairylandMsg.S2C_FairylandInfo_4702.getDefaultInstance();
         }

         public S2C_FairylandInfo_4702 build() {
            S2C_FairylandInfo_4702 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FairylandInfo_4702 buildPartial() {
            S2C_FairylandInfo_4702 result = new S2C_FairylandInfo_4702(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stageId_ = this.stageId_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.receivedAward_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.receivedAward_ = this.receivedAward_;
            if ((this.bitField0_ & 4) != 0) {
               this.extraAward_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.extraAward_ = this.extraAward_;
            if ((from_bitField0_ & 8) != 0) {
               if (this.heroInfoBuilder_ == null) {
                  result.heroInfo_ = this.heroInfo_;
               } else {
                  result.heroInfo_ = (CommonMsg.HeroInfo)this.heroInfoBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.commonSweep_ = this.commonSweep_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.ticketNum_ = this.ticketNum_;
               to_bitField0_ |= 8;
            }

            if (this.recordsBuilder_ == null) {
               if ((this.bitField0_ & 64) != 0) {
                  this.records_ = Collections.unmodifiableList(this.records_);
                  this.bitField0_ &= -65;
               }

               result.records_ = this.records_;
            } else {
               result.records_ = this.recordsBuilder_.build();
            }

            if ((from_bitField0_ & 128) != 0) {
               result.passState_ = this.passState_;
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
            if (other instanceof S2C_FairylandInfo_4702) {
               return this.mergeFrom((S2C_FairylandInfo_4702)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FairylandInfo_4702 other) {
            if (other == FairylandMsg.S2C_FairylandInfo_4702.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStageId()) {
                  this.setStageId(other.getStageId());
               }

               if (!other.receivedAward_.isEmpty()) {
                  if (this.receivedAward_.isEmpty()) {
                     this.receivedAward_ = other.receivedAward_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureReceivedAwardIsMutable();
                     this.receivedAward_.addAll(other.receivedAward_);
                  }

                  this.onChanged();
               }

               if (!other.extraAward_.isEmpty()) {
                  if (this.extraAward_.isEmpty()) {
                     this.extraAward_ = other.extraAward_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureExtraAwardIsMutable();
                     this.extraAward_.addAll(other.extraAward_);
                  }

                  this.onChanged();
               }

               if (other.hasHeroInfo()) {
                  this.mergeHeroInfo(other.getHeroInfo());
               }

               if (other.hasCommonSweep()) {
                  this.setCommonSweep(other.getCommonSweep());
               }

               if (other.hasTicketNum()) {
                  this.setTicketNum(other.getTicketNum());
               }

               if (this.recordsBuilder_ == null) {
                  if (!other.records_.isEmpty()) {
                     if (this.records_.isEmpty()) {
                        this.records_ = other.records_;
                        this.bitField0_ &= -65;
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
                     this.bitField0_ &= -65;
                     this.recordsBuilder_ = FairylandMsg.S2C_FairylandInfo_4702.alwaysUseFieldBuilders ? this.getRecordsFieldBuilder() : null;
                  } else {
                     this.recordsBuilder_.addAllMessages(other.records_);
                  }
               }

               if (other.hasPassState()) {
                  this.setPassState(other.getPassState());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStageId()) {
               return false;
            } else if (!this.hasCommonSweep()) {
               return false;
            } else if (!this.hasTicketNum()) {
               return false;
            } else if (!this.hasPassState()) {
               return false;
            } else if (this.hasHeroInfo() && !this.getHeroInfo().isInitialized()) {
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
            S2C_FairylandInfo_4702 parsedMessage = null;

            try {
               parsedMessage = (S2C_FairylandInfo_4702)FairylandMsg.S2C_FairylandInfo_4702.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FairylandInfo_4702)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStageId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStageId() {
            return this.stageId_;
         }

         public Builder setStageId(int value) {
            this.bitField0_ |= 1;
            this.stageId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageId() {
            this.bitField0_ &= -2;
            this.stageId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureReceivedAwardIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.receivedAward_ = FairylandMsg.S2C_FairylandInfo_4702.mutableCopy(this.receivedAward_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getReceivedAwardList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.receivedAward_) : this.receivedAward_);
         }

         public int getReceivedAwardCount() {
            return this.receivedAward_.size();
         }

         public int getReceivedAward(int index) {
            return this.receivedAward_.getInt(index);
         }

         public Builder setReceivedAward(int index, int value) {
            this.ensureReceivedAwardIsMutable();
            this.receivedAward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addReceivedAward(int value) {
            this.ensureReceivedAwardIsMutable();
            this.receivedAward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllReceivedAward(Iterable<? extends Integer> values) {
            this.ensureReceivedAwardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.receivedAward_);
            this.onChanged();
            return this;
         }

         public Builder clearReceivedAward() {
            this.receivedAward_ = FairylandMsg.S2C_FairylandInfo_4702.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         private void ensureExtraAwardIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.extraAward_ = FairylandMsg.S2C_FairylandInfo_4702.mutableCopy(this.extraAward_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getExtraAwardList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.extraAward_) : this.extraAward_);
         }

         public int getExtraAwardCount() {
            return this.extraAward_.size();
         }

         public int getExtraAward(int index) {
            return this.extraAward_.getInt(index);
         }

         public Builder setExtraAward(int index, int value) {
            this.ensureExtraAwardIsMutable();
            this.extraAward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addExtraAward(int value) {
            this.ensureExtraAwardIsMutable();
            this.extraAward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllExtraAward(Iterable<? extends Integer> values) {
            this.ensureExtraAwardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.extraAward_);
            this.onChanged();
            return this;
         }

         public Builder clearExtraAward() {
            this.extraAward_ = FairylandMsg.S2C_FairylandInfo_4702.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         public boolean hasHeroInfo() {
            return (this.bitField0_ & 8) != 0;
         }

         public CommonMsg.HeroInfo getHeroInfo() {
            if (this.heroInfoBuilder_ == null) {
               return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
            } else {
               return (CommonMsg.HeroInfo)this.heroInfoBuilder_.getMessage();
            }
         }

         public Builder setHeroInfo(CommonMsg.HeroInfo value) {
            if (this.heroInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.heroInfo_ = value;
               this.onChanged();
            } else {
               this.heroInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder setHeroInfo(CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.heroInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder mergeHeroInfo(CommonMsg.HeroInfo value) {
            if (this.heroInfoBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0 && this.heroInfo_ != null && this.heroInfo_ != CommonMsg.HeroInfo.getDefaultInstance()) {
                  this.heroInfo_ = CommonMsg.HeroInfo.newBuilder(this.heroInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.heroInfo_ = value;
               }

               this.onChanged();
            } else {
               this.heroInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder clearHeroInfo() {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
               this.onChanged();
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public CommonMsg.HeroInfo.Builder getHeroInfoBuilder() {
            this.bitField0_ |= 8;
            this.onChanged();
            return (CommonMsg.HeroInfo.Builder)this.getHeroInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder() {
            if (this.heroInfoBuilder_ != null) {
               return (CommonMsg.HeroInfoOrBuilder)this.heroInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> getHeroInfoFieldBuilder() {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfoBuilder_ = new SingleFieldBuilderV3(this.getHeroInfo(), this.getParentForChildren(), this.isClean());
               this.heroInfo_ = null;
            }

            return this.heroInfoBuilder_;
         }

         public boolean hasCommonSweep() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getCommonSweep() {
            return this.commonSweep_;
         }

         public Builder setCommonSweep(int value) {
            this.bitField0_ |= 16;
            this.commonSweep_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCommonSweep() {
            this.bitField0_ &= -17;
            this.commonSweep_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTicketNum() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getTicketNum() {
            return this.ticketNum_;
         }

         public Builder setTicketNum(int value) {
            this.bitField0_ |= 32;
            this.ticketNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTicketNum() {
            this.bitField0_ &= -33;
            this.ticketNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRecordsIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
               this.records_ = new ArrayList(this.records_);
               this.bitField0_ |= 64;
            }

         }

         public List<RecordData> getRecordsList() {
            return this.recordsBuilder_ == null ? Collections.unmodifiableList(this.records_) : this.recordsBuilder_.getMessageList();
         }

         public int getRecordsCount() {
            return this.recordsBuilder_ == null ? this.records_.size() : this.recordsBuilder_.getCount();
         }

         public RecordData getRecords(int index) {
            return this.recordsBuilder_ == null ? (RecordData)this.records_.get(index) : (RecordData)this.recordsBuilder_.getMessage(index);
         }

         public Builder setRecords(int index, RecordData value) {
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

         public Builder setRecords(int index, RecordData.Builder builderForValue) {
            if (this.recordsBuilder_ == null) {
               this.ensureRecordsIsMutable();
               this.records_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRecords(RecordData value) {
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

         public Builder addRecords(int index, RecordData value) {
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

         public Builder addRecords(RecordData.Builder builderForValue) {
            if (this.recordsBuilder_ == null) {
               this.ensureRecordsIsMutable();
               this.records_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.recordsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRecords(int index, RecordData.Builder builderForValue) {
            if (this.recordsBuilder_ == null) {
               this.ensureRecordsIsMutable();
               this.records_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecords(Iterable<? extends RecordData> values) {
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
               this.bitField0_ &= -65;
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

         public RecordData.Builder getRecordsBuilder(int index) {
            return (RecordData.Builder)this.getRecordsFieldBuilder().getBuilder(index);
         }

         public RecordDataOrBuilder getRecordsOrBuilder(int index) {
            return this.recordsBuilder_ == null ? (RecordDataOrBuilder)this.records_.get(index) : (RecordDataOrBuilder)this.recordsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RecordDataOrBuilder> getRecordsOrBuilderList() {
            return this.recordsBuilder_ != null ? this.recordsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.records_);
         }

         public RecordData.Builder addRecordsBuilder() {
            return (RecordData.Builder)this.getRecordsFieldBuilder().addBuilder(FairylandMsg.RecordData.getDefaultInstance());
         }

         public RecordData.Builder addRecordsBuilder(int index) {
            return (RecordData.Builder)this.getRecordsFieldBuilder().addBuilder(index, FairylandMsg.RecordData.getDefaultInstance());
         }

         public List<RecordData.Builder> getRecordsBuilderList() {
            return this.getRecordsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RecordData, RecordData.Builder, RecordDataOrBuilder> getRecordsFieldBuilder() {
            if (this.recordsBuilder_ == null) {
               this.recordsBuilder_ = new RepeatedFieldBuilderV3(this.records_, (this.bitField0_ & 64) != 0, this.getParentForChildren(), this.isClean());
               this.records_ = null;
            }

            return this.recordsBuilder_;
         }

         public boolean hasPassState() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getPassState() {
            return this.passState_;
         }

         public Builder setPassState(int value) {
            this.bitField0_ |= 128;
            this.passState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPassState() {
            this.bitField0_ &= -129;
            this.passState_ = 0;
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

   public static final class C2S_FairylandHero_4703 extends GeneratedMessageV3 implements C2S_FairylandHero_4703OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_FairylandHero_4703 DEFAULT_INSTANCE = new C2S_FairylandHero_4703();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FairylandHero_4703> PARSER = new AbstractParser<C2S_FairylandHero_4703>() {
         public C2S_FairylandHero_4703 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FairylandHero_4703(input, extensionRegistry);
         }
      };

      private C2S_FairylandHero_4703(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FairylandHero_4703() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FairylandHero_4703();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FairylandHero_4703(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandHero_4703_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandHero_4703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FairylandHero_4703.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FairylandHero_4703)) {
            return super.equals(obj);
         } else {
            C2S_FairylandHero_4703 other = (C2S_FairylandHero_4703)obj;
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

      public static C2S_FairylandHero_4703 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FairylandHero_4703)PARSER.parseFrom(data);
      }

      public static C2S_FairylandHero_4703 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FairylandHero_4703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FairylandHero_4703 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FairylandHero_4703)PARSER.parseFrom(data);
      }

      public static C2S_FairylandHero_4703 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FairylandHero_4703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FairylandHero_4703 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FairylandHero_4703)PARSER.parseFrom(data);
      }

      public static C2S_FairylandHero_4703 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FairylandHero_4703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FairylandHero_4703 parseFrom(InputStream input) throws IOException {
         return (C2S_FairylandHero_4703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FairylandHero_4703 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FairylandHero_4703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FairylandHero_4703 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FairylandHero_4703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FairylandHero_4703 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FairylandHero_4703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FairylandHero_4703 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FairylandHero_4703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FairylandHero_4703 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FairylandHero_4703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FairylandHero_4703 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FairylandHero_4703 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FairylandHero_4703> parser() {
         return PARSER;
      }

      public Parser<C2S_FairylandHero_4703> getParserForType() {
         return PARSER;
      }

      public C2S_FairylandHero_4703 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FairylandHero_4703OrBuilder {
         private int bitField0_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandHero_4703_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandHero_4703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FairylandHero_4703.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.C2S_FairylandHero_4703.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandHero_4703_descriptor;
         }

         public C2S_FairylandHero_4703 getDefaultInstanceForType() {
            return FairylandMsg.C2S_FairylandHero_4703.getDefaultInstance();
         }

         public C2S_FairylandHero_4703 build() {
            C2S_FairylandHero_4703 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FairylandHero_4703 buildPartial() {
            C2S_FairylandHero_4703 result = new C2S_FairylandHero_4703(this);
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
            if (other instanceof C2S_FairylandHero_4703) {
               return this.mergeFrom((C2S_FairylandHero_4703)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FairylandHero_4703 other) {
            if (other == FairylandMsg.C2S_FairylandHero_4703.getDefaultInstance()) {
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
            C2S_FairylandHero_4703 parsedMessage = null;

            try {
               parsedMessage = (C2S_FairylandHero_4703)FairylandMsg.C2S_FairylandHero_4703.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FairylandHero_4703)e.getUnfinishedMessage();
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

   public static final class S2C_FairylandHero_4704 extends GeneratedMessageV3 implements S2C_FairylandHero_4704OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int HEROINFO_FIELD_NUMBER = 2;
      private CommonMsg.HeroInfo heroInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_FairylandHero_4704 DEFAULT_INSTANCE = new S2C_FairylandHero_4704();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FairylandHero_4704> PARSER = new AbstractParser<S2C_FairylandHero_4704>() {
         public S2C_FairylandHero_4704 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FairylandHero_4704(input, extensionRegistry);
         }
      };

      private S2C_FairylandHero_4704(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FairylandHero_4704() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FairylandHero_4704();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FairylandHero_4704(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        CommonMsg.HeroInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.heroInfo_.toBuilder();
                        }

                        this.heroInfo_ = (CommonMsg.HeroInfo)input.readMessage(CommonMsg.HeroInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.heroInfo_);
                           this.heroInfo_ = subBuilder.buildPartial();
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandHero_4704_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandHero_4704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FairylandHero_4704.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasHeroInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.HeroInfo getHeroInfo() {
         return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
      }

      public CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder() {
         return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
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
         } else if (!this.hasHeroInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getHeroInfo().isInitialized()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getHeroInfo());
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
               size += CodedOutputStream.computeMessageSize(2, this.getHeroInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FairylandHero_4704)) {
            return super.equals(obj);
         } else {
            S2C_FairylandHero_4704 other = (S2C_FairylandHero_4704)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasHeroInfo() != other.hasHeroInfo()) {
               return false;
            } else if (this.hasHeroInfo() && !this.getHeroInfo().equals(other.getHeroInfo())) {
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

            if (this.hasHeroInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FairylandHero_4704 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FairylandHero_4704)PARSER.parseFrom(data);
      }

      public static S2C_FairylandHero_4704 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FairylandHero_4704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FairylandHero_4704 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FairylandHero_4704)PARSER.parseFrom(data);
      }

      public static S2C_FairylandHero_4704 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FairylandHero_4704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FairylandHero_4704 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FairylandHero_4704)PARSER.parseFrom(data);
      }

      public static S2C_FairylandHero_4704 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FairylandHero_4704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FairylandHero_4704 parseFrom(InputStream input) throws IOException {
         return (S2C_FairylandHero_4704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FairylandHero_4704 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FairylandHero_4704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FairylandHero_4704 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FairylandHero_4704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FairylandHero_4704 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FairylandHero_4704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FairylandHero_4704 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FairylandHero_4704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FairylandHero_4704 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FairylandHero_4704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FairylandHero_4704 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FairylandHero_4704 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FairylandHero_4704> parser() {
         return PARSER;
      }

      public Parser<S2C_FairylandHero_4704> getParserForType() {
         return PARSER;
      }

      public S2C_FairylandHero_4704 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FairylandHero_4704OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private CommonMsg.HeroInfo heroInfo_;
         private SingleFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> heroInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandHero_4704_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandHero_4704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FairylandHero_4704.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.S2C_FairylandHero_4704.alwaysUseFieldBuilders) {
               this.getHeroInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandHero_4704_descriptor;
         }

         public S2C_FairylandHero_4704 getDefaultInstanceForType() {
            return FairylandMsg.S2C_FairylandHero_4704.getDefaultInstance();
         }

         public S2C_FairylandHero_4704 build() {
            S2C_FairylandHero_4704 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FairylandHero_4704 buildPartial() {
            S2C_FairylandHero_4704 result = new S2C_FairylandHero_4704(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.heroInfoBuilder_ == null) {
                  result.heroInfo_ = this.heroInfo_;
               } else {
                  result.heroInfo_ = (CommonMsg.HeroInfo)this.heroInfoBuilder_.build();
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
            if (other instanceof S2C_FairylandHero_4704) {
               return this.mergeFrom((S2C_FairylandHero_4704)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FairylandHero_4704 other) {
            if (other == FairylandMsg.S2C_FairylandHero_4704.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasHeroInfo()) {
                  this.mergeHeroInfo(other.getHeroInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasHeroInfo()) {
               return false;
            } else {
               return this.getHeroInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FairylandHero_4704 parsedMessage = null;

            try {
               parsedMessage = (S2C_FairylandHero_4704)FairylandMsg.S2C_FairylandHero_4704.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FairylandHero_4704)e.getUnfinishedMessage();
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

         public boolean hasHeroInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.HeroInfo getHeroInfo() {
            if (this.heroInfoBuilder_ == null) {
               return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
            } else {
               return (CommonMsg.HeroInfo)this.heroInfoBuilder_.getMessage();
            }
         }

         public Builder setHeroInfo(CommonMsg.HeroInfo value) {
            if (this.heroInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.heroInfo_ = value;
               this.onChanged();
            } else {
               this.heroInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setHeroInfo(CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.heroInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeHeroInfo(CommonMsg.HeroInfo value) {
            if (this.heroInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.heroInfo_ != null && this.heroInfo_ != CommonMsg.HeroInfo.getDefaultInstance()) {
                  this.heroInfo_ = CommonMsg.HeroInfo.newBuilder(this.heroInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.heroInfo_ = value;
               }

               this.onChanged();
            } else {
               this.heroInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearHeroInfo() {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
               this.onChanged();
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.HeroInfo.Builder getHeroInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.HeroInfo.Builder)this.getHeroInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder() {
            if (this.heroInfoBuilder_ != null) {
               return (CommonMsg.HeroInfoOrBuilder)this.heroInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> getHeroInfoFieldBuilder() {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfoBuilder_ = new SingleFieldBuilderV3(this.getHeroInfo(), this.getParentForChildren(), this.isClean());
               this.heroInfo_ = null;
            }

            return this.heroInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_FairylandExplore_4705 extends GeneratedMessageV3 implements C2S_FairylandExplore_4705OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROPOWER_FIELD_NUMBER = 1;
      private int heroPower_;
      public static final int FLUSHHERO_FIELD_NUMBER = 2;
      private boolean flushHero_;
      public static final int TICKETNUM_FIELD_NUMBER = 3;
      private int ticketNum_;
      private byte memoizedIsInitialized;
      private static final C2S_FairylandExplore_4705 DEFAULT_INSTANCE = new C2S_FairylandExplore_4705();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FairylandExplore_4705> PARSER = new AbstractParser<C2S_FairylandExplore_4705>() {
         public C2S_FairylandExplore_4705 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FairylandExplore_4705(input, extensionRegistry);
         }
      };

      private C2S_FairylandExplore_4705(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FairylandExplore_4705() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FairylandExplore_4705();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FairylandExplore_4705(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroPower_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.flushHero_ = input.readBool();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.ticketNum_ = input.readInt32();
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandExplore_4705_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandExplore_4705_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FairylandExplore_4705.class, Builder.class);
      }

      public boolean hasHeroPower() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroPower() {
         return this.heroPower_;
      }

      public boolean hasFlushHero() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getFlushHero() {
         return this.flushHero_;
      }

      public boolean hasTicketNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getTicketNum() {
         return this.ticketNum_;
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
            output.writeInt32(1, this.heroPower_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.flushHero_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.ticketNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroPower_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.flushHero_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.ticketNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FairylandExplore_4705)) {
            return super.equals(obj);
         } else {
            C2S_FairylandExplore_4705 other = (C2S_FairylandExplore_4705)obj;
            if (this.hasHeroPower() != other.hasHeroPower()) {
               return false;
            } else if (this.hasHeroPower() && this.getHeroPower() != other.getHeroPower()) {
               return false;
            } else if (this.hasFlushHero() != other.hasFlushHero()) {
               return false;
            } else if (this.hasFlushHero() && this.getFlushHero() != other.getFlushHero()) {
               return false;
            } else if (this.hasTicketNum() != other.hasTicketNum()) {
               return false;
            } else if (this.hasTicketNum() && this.getTicketNum() != other.getTicketNum()) {
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
            if (this.hasHeroPower()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroPower();
            }

            if (this.hasFlushHero()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getFlushHero());
            }

            if (this.hasTicketNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTicketNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FairylandExplore_4705 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FairylandExplore_4705)PARSER.parseFrom(data);
      }

      public static C2S_FairylandExplore_4705 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FairylandExplore_4705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FairylandExplore_4705 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FairylandExplore_4705)PARSER.parseFrom(data);
      }

      public static C2S_FairylandExplore_4705 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FairylandExplore_4705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FairylandExplore_4705 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FairylandExplore_4705)PARSER.parseFrom(data);
      }

      public static C2S_FairylandExplore_4705 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FairylandExplore_4705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FairylandExplore_4705 parseFrom(InputStream input) throws IOException {
         return (C2S_FairylandExplore_4705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FairylandExplore_4705 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FairylandExplore_4705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FairylandExplore_4705 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FairylandExplore_4705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FairylandExplore_4705 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FairylandExplore_4705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FairylandExplore_4705 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FairylandExplore_4705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FairylandExplore_4705 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FairylandExplore_4705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FairylandExplore_4705 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FairylandExplore_4705 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FairylandExplore_4705> parser() {
         return PARSER;
      }

      public Parser<C2S_FairylandExplore_4705> getParserForType() {
         return PARSER;
      }

      public C2S_FairylandExplore_4705 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FairylandExplore_4705OrBuilder {
         private int bitField0_;
         private int heroPower_;
         private boolean flushHero_;
         private int ticketNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandExplore_4705_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandExplore_4705_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FairylandExplore_4705.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.C2S_FairylandExplore_4705.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroPower_ = 0;
            this.bitField0_ &= -2;
            this.flushHero_ = false;
            this.bitField0_ &= -3;
            this.ticketNum_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandExplore_4705_descriptor;
         }

         public C2S_FairylandExplore_4705 getDefaultInstanceForType() {
            return FairylandMsg.C2S_FairylandExplore_4705.getDefaultInstance();
         }

         public C2S_FairylandExplore_4705 build() {
            C2S_FairylandExplore_4705 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FairylandExplore_4705 buildPartial() {
            C2S_FairylandExplore_4705 result = new C2S_FairylandExplore_4705(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroPower_ = this.heroPower_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.flushHero_ = this.flushHero_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.ticketNum_ = this.ticketNum_;
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
            if (other instanceof C2S_FairylandExplore_4705) {
               return this.mergeFrom((C2S_FairylandExplore_4705)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FairylandExplore_4705 other) {
            if (other == FairylandMsg.C2S_FairylandExplore_4705.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroPower()) {
                  this.setHeroPower(other.getHeroPower());
               }

               if (other.hasFlushHero()) {
                  this.setFlushHero(other.getFlushHero());
               }

               if (other.hasTicketNum()) {
                  this.setTicketNum(other.getTicketNum());
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
            C2S_FairylandExplore_4705 parsedMessage = null;

            try {
               parsedMessage = (C2S_FairylandExplore_4705)FairylandMsg.C2S_FairylandExplore_4705.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FairylandExplore_4705)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroPower() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroPower() {
            return this.heroPower_;
         }

         public Builder setHeroPower(int value) {
            this.bitField0_ |= 1;
            this.heroPower_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroPower() {
            this.bitField0_ &= -2;
            this.heroPower_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFlushHero() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getFlushHero() {
            return this.flushHero_;
         }

         public Builder setFlushHero(boolean value) {
            this.bitField0_ |= 2;
            this.flushHero_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFlushHero() {
            this.bitField0_ &= -3;
            this.flushHero_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasTicketNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getTicketNum() {
            return this.ticketNum_;
         }

         public Builder setTicketNum(int value) {
            this.bitField0_ |= 4;
            this.ticketNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTicketNum() {
            this.bitField0_ &= -5;
            this.ticketNum_ = 0;
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

   public static final class S2C_FairylandExplore_4706 extends GeneratedMessageV3 implements S2C_FairylandExplore_4706OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFO_FIELD_NUMBER = 1;
      private List<ExploreInfo> info_;
      private byte memoizedIsInitialized;
      private static final S2C_FairylandExplore_4706 DEFAULT_INSTANCE = new S2C_FairylandExplore_4706();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FairylandExplore_4706> PARSER = new AbstractParser<S2C_FairylandExplore_4706>() {
         public S2C_FairylandExplore_4706 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FairylandExplore_4706(input, extensionRegistry);
         }
      };

      private S2C_FairylandExplore_4706(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FairylandExplore_4706() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FairylandExplore_4706();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FairylandExplore_4706(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.info_.add(input.readMessage(FairylandMsg.ExploreInfo.PARSER, extensionRegistry));
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandExplore_4706_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandExplore_4706_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FairylandExplore_4706.class, Builder.class);
      }

      public List<ExploreInfo> getInfoList() {
         return this.info_;
      }

      public List<? extends ExploreInfoOrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public ExploreInfo getInfo(int index) {
         return (ExploreInfo)this.info_.get(index);
      }

      public ExploreInfoOrBuilder getInfoOrBuilder(int index) {
         return (ExploreInfoOrBuilder)this.info_.get(index);
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
         } else if (!(obj instanceof S2C_FairylandExplore_4706)) {
            return super.equals(obj);
         } else {
            S2C_FairylandExplore_4706 other = (S2C_FairylandExplore_4706)obj;
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

      public static S2C_FairylandExplore_4706 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FairylandExplore_4706)PARSER.parseFrom(data);
      }

      public static S2C_FairylandExplore_4706 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FairylandExplore_4706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FairylandExplore_4706 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FairylandExplore_4706)PARSER.parseFrom(data);
      }

      public static S2C_FairylandExplore_4706 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FairylandExplore_4706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FairylandExplore_4706 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FairylandExplore_4706)PARSER.parseFrom(data);
      }

      public static S2C_FairylandExplore_4706 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FairylandExplore_4706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FairylandExplore_4706 parseFrom(InputStream input) throws IOException {
         return (S2C_FairylandExplore_4706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FairylandExplore_4706 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FairylandExplore_4706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FairylandExplore_4706 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FairylandExplore_4706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FairylandExplore_4706 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FairylandExplore_4706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FairylandExplore_4706 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FairylandExplore_4706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FairylandExplore_4706 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FairylandExplore_4706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FairylandExplore_4706 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FairylandExplore_4706 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FairylandExplore_4706> parser() {
         return PARSER;
      }

      public Parser<S2C_FairylandExplore_4706> getParserForType() {
         return PARSER;
      }

      public S2C_FairylandExplore_4706 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FairylandExplore_4706OrBuilder {
         private int bitField0_;
         private List<ExploreInfo> info_;
         private RepeatedFieldBuilderV3<ExploreInfo, ExploreInfo.Builder, ExploreInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandExplore_4706_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandExplore_4706_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FairylandExplore_4706.class, Builder.class);
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
            if (FairylandMsg.S2C_FairylandExplore_4706.alwaysUseFieldBuilders) {
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
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandExplore_4706_descriptor;
         }

         public S2C_FairylandExplore_4706 getDefaultInstanceForType() {
            return FairylandMsg.S2C_FairylandExplore_4706.getDefaultInstance();
         }

         public S2C_FairylandExplore_4706 build() {
            S2C_FairylandExplore_4706 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FairylandExplore_4706 buildPartial() {
            S2C_FairylandExplore_4706 result = new S2C_FairylandExplore_4706(this);
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
            if (other instanceof S2C_FairylandExplore_4706) {
               return this.mergeFrom((S2C_FairylandExplore_4706)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FairylandExplore_4706 other) {
            if (other == FairylandMsg.S2C_FairylandExplore_4706.getDefaultInstance()) {
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
                     this.infoBuilder_ = FairylandMsg.S2C_FairylandExplore_4706.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
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
            S2C_FairylandExplore_4706 parsedMessage = null;

            try {
               parsedMessage = (S2C_FairylandExplore_4706)FairylandMsg.S2C_FairylandExplore_4706.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FairylandExplore_4706)e.getUnfinishedMessage();
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

         public List<ExploreInfo> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public ExploreInfo getInfo(int index) {
            return this.infoBuilder_ == null ? (ExploreInfo)this.info_.get(index) : (ExploreInfo)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, ExploreInfo value) {
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

         public Builder setInfo(int index, ExploreInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(ExploreInfo value) {
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

         public Builder addInfo(int index, ExploreInfo value) {
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

         public Builder addInfo(ExploreInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, ExploreInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends ExploreInfo> values) {
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

         public ExploreInfo.Builder getInfoBuilder(int index) {
            return (ExploreInfo.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public ExploreInfoOrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (ExploreInfoOrBuilder)this.info_.get(index) : (ExploreInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ExploreInfoOrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public ExploreInfo.Builder addInfoBuilder() {
            return (ExploreInfo.Builder)this.getInfoFieldBuilder().addBuilder(FairylandMsg.ExploreInfo.getDefaultInstance());
         }

         public ExploreInfo.Builder addInfoBuilder(int index) {
            return (ExploreInfo.Builder)this.getInfoFieldBuilder().addBuilder(index, FairylandMsg.ExploreInfo.getDefaultInstance());
         }

         public List<ExploreInfo.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ExploreInfo, ExploreInfo.Builder, ExploreInfoOrBuilder> getInfoFieldBuilder() {
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

   public static final class ExploreInfo extends GeneratedMessageV3 implements ExploreInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DEGREETYPE_FIELD_NUMBER = 1;
      private int degreeType_;
      public static final int HEROINFO_FIELD_NUMBER = 2;
      private CommonMsg.HeroInfo heroInfo_;
      public static final int SERVERID_FIELD_NUMBER = 3;
      private int serverId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 4;
      private volatile Object playerName_;
      public static final int LEVEL_FIELD_NUMBER = 5;
      private int level_;
      public static final int HEAD_FIELD_NUMBER = 6;
      private int head_;
      public static final int PLAYERID_FIELD_NUMBER = 7;
      private int playerId_;
      private byte memoizedIsInitialized;
      private static final ExploreInfo DEFAULT_INSTANCE = new ExploreInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<ExploreInfo> PARSER = new AbstractParser<ExploreInfo>() {
         public ExploreInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new ExploreInfo(input, extensionRegistry);
         }
      };

      private ExploreInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ExploreInfo() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new ExploreInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ExploreInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.degreeType_ = input.readInt32();
                        break;
                     case 18:
                        CommonMsg.HeroInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.heroInfo_.toBuilder();
                        }

                        this.heroInfo_ = (CommonMsg.HeroInfo)input.readMessage(CommonMsg.HeroInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.heroInfo_);
                           this.heroInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.serverId_ = input.readInt32();
                        break;
                     case 34:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 8;
                        this.playerName_ = bs;
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.level_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.head_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.playerId_ = input.readInt32();
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_ExploreInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_ExploreInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ExploreInfo.class, Builder.class);
      }

      public boolean hasDegreeType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDegreeType() {
         return this.degreeType_;
      }

      public boolean hasHeroInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.HeroInfo getHeroInfo() {
         return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
      }

      public CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder() {
         return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getServerId() {
         return this.serverId_;
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

      public boolean hasLevel() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public boolean hasHead() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDegreeType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getHeroInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.degreeType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getHeroInfo());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.serverId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            GeneratedMessageV3.writeString(output, 4, this.playerName_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.level_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.head_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.playerId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.degreeType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getHeroInfo());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.serverId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += GeneratedMessageV3.computeStringSize(4, this.playerName_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.level_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.head_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.playerId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof ExploreInfo)) {
            return super.equals(obj);
         } else {
            ExploreInfo other = (ExploreInfo)obj;
            if (this.hasDegreeType() != other.hasDegreeType()) {
               return false;
            } else if (this.hasDegreeType() && this.getDegreeType() != other.getDegreeType()) {
               return false;
            } else if (this.hasHeroInfo() != other.hasHeroInfo()) {
               return false;
            } else if (this.hasHeroInfo() && !this.getHeroInfo().equals(other.getHeroInfo())) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
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
            if (this.hasDegreeType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDegreeType();
            }

            if (this.hasHeroInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroInfo().hashCode();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getLevel();
            }

            if (this.hasHead()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getPlayerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static ExploreInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (ExploreInfo)PARSER.parseFrom(data);
      }

      public static ExploreInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ExploreInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ExploreInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (ExploreInfo)PARSER.parseFrom(data);
      }

      public static ExploreInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ExploreInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ExploreInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (ExploreInfo)PARSER.parseFrom(data);
      }

      public static ExploreInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ExploreInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ExploreInfo parseFrom(InputStream input) throws IOException {
         return (ExploreInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ExploreInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ExploreInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static ExploreInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (ExploreInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static ExploreInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ExploreInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static ExploreInfo parseFrom(CodedInputStream input) throws IOException {
         return (ExploreInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ExploreInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ExploreInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(ExploreInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static ExploreInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<ExploreInfo> parser() {
         return PARSER;
      }

      public Parser<ExploreInfo> getParserForType() {
         return PARSER;
      }

      public ExploreInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ExploreInfoOrBuilder {
         private int bitField0_;
         private int degreeType_;
         private CommonMsg.HeroInfo heroInfo_;
         private SingleFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> heroInfoBuilder_;
         private int serverId_;
         private Object playerName_;
         private int level_;
         private int head_;
         private int playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_ExploreInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_ExploreInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ExploreInfo.class, Builder.class);
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
            if (FairylandMsg.ExploreInfo.alwaysUseFieldBuilders) {
               this.getHeroInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.degreeType_ = 0;
            this.bitField0_ &= -2;
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            this.serverId_ = 0;
            this.bitField0_ &= -5;
            this.playerName_ = "";
            this.bitField0_ &= -9;
            this.level_ = 0;
            this.bitField0_ &= -17;
            this.head_ = 0;
            this.bitField0_ &= -33;
            this.playerId_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_ExploreInfo_descriptor;
         }

         public ExploreInfo getDefaultInstanceForType() {
            return FairylandMsg.ExploreInfo.getDefaultInstance();
         }

         public ExploreInfo build() {
            ExploreInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public ExploreInfo buildPartial() {
            ExploreInfo result = new ExploreInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.degreeType_ = this.degreeType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.heroInfoBuilder_ == null) {
                  result.heroInfo_ = this.heroInfo_;
               } else {
                  result.heroInfo_ = (CommonMsg.HeroInfo)this.heroInfoBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 16) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.head_ = this.head_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.playerId_ = this.playerId_;
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
            if (other instanceof ExploreInfo) {
               return this.mergeFrom((ExploreInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(ExploreInfo other) {
            if (other == FairylandMsg.ExploreInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDegreeType()) {
                  this.setDegreeType(other.getDegreeType());
               }

               if (other.hasHeroInfo()) {
                  this.mergeHeroInfo(other.getHeroInfo());
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 8;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDegreeType()) {
               return false;
            } else if (!this.hasHeroInfo()) {
               return false;
            } else {
               return this.getHeroInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            ExploreInfo parsedMessage = null;

            try {
               parsedMessage = (ExploreInfo)FairylandMsg.ExploreInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (ExploreInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDegreeType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDegreeType() {
            return this.degreeType_;
         }

         public Builder setDegreeType(int value) {
            this.bitField0_ |= 1;
            this.degreeType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDegreeType() {
            this.bitField0_ &= -2;
            this.degreeType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.HeroInfo getHeroInfo() {
            if (this.heroInfoBuilder_ == null) {
               return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
            } else {
               return (CommonMsg.HeroInfo)this.heroInfoBuilder_.getMessage();
            }
         }

         public Builder setHeroInfo(CommonMsg.HeroInfo value) {
            if (this.heroInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.heroInfo_ = value;
               this.onChanged();
            } else {
               this.heroInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setHeroInfo(CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.heroInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeHeroInfo(CommonMsg.HeroInfo value) {
            if (this.heroInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.heroInfo_ != null && this.heroInfo_ != CommonMsg.HeroInfo.getDefaultInstance()) {
                  this.heroInfo_ = CommonMsg.HeroInfo.newBuilder(this.heroInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.heroInfo_ = value;
               }

               this.onChanged();
            } else {
               this.heroInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearHeroInfo() {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
               this.onChanged();
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.HeroInfo.Builder getHeroInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.HeroInfo.Builder)this.getHeroInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder() {
            if (this.heroInfoBuilder_ != null) {
               return (CommonMsg.HeroInfoOrBuilder)this.heroInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> getHeroInfoFieldBuilder() {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfoBuilder_ = new SingleFieldBuilderV3(this.getHeroInfo(), this.getParentForChildren(), this.isClean());
               this.heroInfo_ = null;
            }

            return this.heroInfoBuilder_;
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 4;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -5;
            this.serverId_ = 0;
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
            this.playerName_ = FairylandMsg.ExploreInfo.getDefaultInstance().getPlayerName();
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

         public boolean hasLevel() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 16;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -17;
            this.level_ = 0;
            this.onChanged();
            return this;
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

         public boolean hasPlayerId() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getPlayerId() {
            return this.playerId_;
         }

         public Builder setPlayerId(int value) {
            this.bitField0_ |= 64;
            this.playerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.bitField0_ &= -65;
            this.playerId_ = 0;
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

   public static final class C2S_FairylandBattle_4707 extends GeneratedMessageV3 implements C2S_FairylandBattle_4707OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DEGREETYPE_FIELD_NUMBER = 1;
      private int degreeType_;
      public static final int ISSPECIAL_FIELD_NUMBER = 2;
      private boolean isSpecial_;
      public static final int HEROPOWER_FIELD_NUMBER = 3;
      private int heroPower_;
      public static final int ARRAYING_FIELD_NUMBER = 4;
      private ByteString arraying_;
      public static final int MAXPOWER_FIELD_NUMBER = 5;
      private long maxPower_;
      public static final int STAGEID_FIELD_NUMBER = 6;
      private int stageId_;
      public static final int TICKETNUM_FIELD_NUMBER = 7;
      private int ticketNum_;
      public static final int ISSWEEP_FIELD_NUMBER = 8;
      private boolean isSweep_;
      private byte memoizedIsInitialized;
      private static final C2S_FairylandBattle_4707 DEFAULT_INSTANCE = new C2S_FairylandBattle_4707();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FairylandBattle_4707> PARSER = new AbstractParser<C2S_FairylandBattle_4707>() {
         public C2S_FairylandBattle_4707 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FairylandBattle_4707(input, extensionRegistry);
         }
      };

      private C2S_FairylandBattle_4707(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FairylandBattle_4707() {
         this.memoizedIsInitialized = -1;
         this.arraying_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FairylandBattle_4707();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FairylandBattle_4707(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.degreeType_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.isSpecial_ = input.readBool();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.heroPower_ = input.readInt32();
                        break;
                     case 34:
                        this.bitField0_ |= 8;
                        this.arraying_ = input.readBytes();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.maxPower_ = input.readInt64();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.stageId_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.ticketNum_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.isSweep_ = input.readBool();
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandBattle_4707_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandBattle_4707_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FairylandBattle_4707.class, Builder.class);
      }

      public boolean hasDegreeType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDegreeType() {
         return this.degreeType_;
      }

      public boolean hasIsSpecial() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsSpecial() {
         return this.isSpecial_;
      }

      public boolean hasHeroPower() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHeroPower() {
         return this.heroPower_;
      }

      public boolean hasArraying() {
         return (this.bitField0_ & 8) != 0;
      }

      public ByteString getArraying() {
         return this.arraying_;
      }

      public boolean hasMaxPower() {
         return (this.bitField0_ & 16) != 0;
      }

      public long getMaxPower() {
         return this.maxPower_;
      }

      public boolean hasStageId() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getStageId() {
         return this.stageId_;
      }

      public boolean hasTicketNum() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getTicketNum() {
         return this.ticketNum_;
      }

      public boolean hasIsSweep() {
         return (this.bitField0_ & 128) != 0;
      }

      public boolean getIsSweep() {
         return this.isSweep_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDegreeType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.degreeType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.isSpecial_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.heroPower_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBytes(4, this.arraying_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt64(5, this.maxPower_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.stageId_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.ticketNum_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeBool(8, this.isSweep_);
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
               size += CodedOutputStream.computeInt32Size(1, this.degreeType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.isSpecial_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.heroPower_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBytesSize(4, this.arraying_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt64Size(5, this.maxPower_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.stageId_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.ticketNum_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeBoolSize(8, this.isSweep_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FairylandBattle_4707)) {
            return super.equals(obj);
         } else {
            C2S_FairylandBattle_4707 other = (C2S_FairylandBattle_4707)obj;
            if (this.hasDegreeType() != other.hasDegreeType()) {
               return false;
            } else if (this.hasDegreeType() && this.getDegreeType() != other.getDegreeType()) {
               return false;
            } else if (this.hasIsSpecial() != other.hasIsSpecial()) {
               return false;
            } else if (this.hasIsSpecial() && this.getIsSpecial() != other.getIsSpecial()) {
               return false;
            } else if (this.hasHeroPower() != other.hasHeroPower()) {
               return false;
            } else if (this.hasHeroPower() && this.getHeroPower() != other.getHeroPower()) {
               return false;
            } else if (this.hasArraying() != other.hasArraying()) {
               return false;
            } else if (this.hasArraying() && !this.getArraying().equals(other.getArraying())) {
               return false;
            } else if (this.hasMaxPower() != other.hasMaxPower()) {
               return false;
            } else if (this.hasMaxPower() && this.getMaxPower() != other.getMaxPower()) {
               return false;
            } else if (this.hasStageId() != other.hasStageId()) {
               return false;
            } else if (this.hasStageId() && this.getStageId() != other.getStageId()) {
               return false;
            } else if (this.hasTicketNum() != other.hasTicketNum()) {
               return false;
            } else if (this.hasTicketNum() && this.getTicketNum() != other.getTicketNum()) {
               return false;
            } else if (this.hasIsSweep() != other.hasIsSweep()) {
               return false;
            } else if (this.hasIsSweep() && this.getIsSweep() != other.getIsSweep()) {
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
            if (this.hasDegreeType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDegreeType();
            }

            if (this.hasIsSpecial()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsSpecial());
            }

            if (this.hasHeroPower()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHeroPower();
            }

            if (this.hasArraying()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getArraying().hashCode();
            }

            if (this.hasMaxPower()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashLong(this.getMaxPower());
            }

            if (this.hasStageId()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getStageId();
            }

            if (this.hasTicketNum()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getTicketNum();
            }

            if (this.hasIsSweep()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + Internal.hashBoolean(this.getIsSweep());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FairylandBattle_4707 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FairylandBattle_4707)PARSER.parseFrom(data);
      }

      public static C2S_FairylandBattle_4707 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FairylandBattle_4707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FairylandBattle_4707 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FairylandBattle_4707)PARSER.parseFrom(data);
      }

      public static C2S_FairylandBattle_4707 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FairylandBattle_4707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FairylandBattle_4707 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FairylandBattle_4707)PARSER.parseFrom(data);
      }

      public static C2S_FairylandBattle_4707 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FairylandBattle_4707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FairylandBattle_4707 parseFrom(InputStream input) throws IOException {
         return (C2S_FairylandBattle_4707)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FairylandBattle_4707 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FairylandBattle_4707)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FairylandBattle_4707 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FairylandBattle_4707)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FairylandBattle_4707 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FairylandBattle_4707)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FairylandBattle_4707 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FairylandBattle_4707)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FairylandBattle_4707 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FairylandBattle_4707)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FairylandBattle_4707 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FairylandBattle_4707 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FairylandBattle_4707> parser() {
         return PARSER;
      }

      public Parser<C2S_FairylandBattle_4707> getParserForType() {
         return PARSER;
      }

      public C2S_FairylandBattle_4707 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FairylandBattle_4707OrBuilder {
         private int bitField0_;
         private int degreeType_;
         private boolean isSpecial_;
         private int heroPower_;
         private ByteString arraying_;
         private long maxPower_;
         private int stageId_;
         private int ticketNum_;
         private boolean isSweep_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandBattle_4707_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandBattle_4707_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FairylandBattle_4707.class, Builder.class);
         }

         private Builder() {
            this.arraying_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.arraying_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.C2S_FairylandBattle_4707.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.degreeType_ = 0;
            this.bitField0_ &= -2;
            this.isSpecial_ = false;
            this.bitField0_ &= -3;
            this.heroPower_ = 0;
            this.bitField0_ &= -5;
            this.arraying_ = ByteString.EMPTY;
            this.bitField0_ &= -9;
            this.maxPower_ = 0L;
            this.bitField0_ &= -17;
            this.stageId_ = 0;
            this.bitField0_ &= -33;
            this.ticketNum_ = 0;
            this.bitField0_ &= -65;
            this.isSweep_ = false;
            this.bitField0_ &= -129;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandBattle_4707_descriptor;
         }

         public C2S_FairylandBattle_4707 getDefaultInstanceForType() {
            return FairylandMsg.C2S_FairylandBattle_4707.getDefaultInstance();
         }

         public C2S_FairylandBattle_4707 build() {
            C2S_FairylandBattle_4707 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FairylandBattle_4707 buildPartial() {
            C2S_FairylandBattle_4707 result = new C2S_FairylandBattle_4707(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.degreeType_ = this.degreeType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isSpecial_ = this.isSpecial_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.heroPower_ = this.heroPower_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.arraying_ = this.arraying_;
            if ((from_bitField0_ & 16) != 0) {
               result.maxPower_ = this.maxPower_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.stageId_ = this.stageId_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.ticketNum_ = this.ticketNum_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.isSweep_ = this.isSweep_;
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
            if (other instanceof C2S_FairylandBattle_4707) {
               return this.mergeFrom((C2S_FairylandBattle_4707)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FairylandBattle_4707 other) {
            if (other == FairylandMsg.C2S_FairylandBattle_4707.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDegreeType()) {
                  this.setDegreeType(other.getDegreeType());
               }

               if (other.hasIsSpecial()) {
                  this.setIsSpecial(other.getIsSpecial());
               }

               if (other.hasHeroPower()) {
                  this.setHeroPower(other.getHeroPower());
               }

               if (other.hasArraying()) {
                  this.setArraying(other.getArraying());
               }

               if (other.hasMaxPower()) {
                  this.setMaxPower(other.getMaxPower());
               }

               if (other.hasStageId()) {
                  this.setStageId(other.getStageId());
               }

               if (other.hasTicketNum()) {
                  this.setTicketNum(other.getTicketNum());
               }

               if (other.hasIsSweep()) {
                  this.setIsSweep(other.getIsSweep());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasDegreeType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_FairylandBattle_4707 parsedMessage = null;

            try {
               parsedMessage = (C2S_FairylandBattle_4707)FairylandMsg.C2S_FairylandBattle_4707.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FairylandBattle_4707)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDegreeType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDegreeType() {
            return this.degreeType_;
         }

         public Builder setDegreeType(int value) {
            this.bitField0_ |= 1;
            this.degreeType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDegreeType() {
            this.bitField0_ &= -2;
            this.degreeType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsSpecial() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsSpecial() {
            return this.isSpecial_;
         }

         public Builder setIsSpecial(boolean value) {
            this.bitField0_ |= 2;
            this.isSpecial_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsSpecial() {
            this.bitField0_ &= -3;
            this.isSpecial_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasHeroPower() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getHeroPower() {
            return this.heroPower_;
         }

         public Builder setHeroPower(int value) {
            this.bitField0_ |= 4;
            this.heroPower_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroPower() {
            this.bitField0_ &= -5;
            this.heroPower_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasArraying() {
            return (this.bitField0_ & 8) != 0;
         }

         public ByteString getArraying() {
            return this.arraying_;
         }

         public Builder setArraying(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.arraying_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearArraying() {
            this.bitField0_ &= -9;
            this.arraying_ = FairylandMsg.C2S_FairylandBattle_4707.getDefaultInstance().getArraying();
            this.onChanged();
            return this;
         }

         public boolean hasMaxPower() {
            return (this.bitField0_ & 16) != 0;
         }

         public long getMaxPower() {
            return this.maxPower_;
         }

         public Builder setMaxPower(long value) {
            this.bitField0_ |= 16;
            this.maxPower_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMaxPower() {
            this.bitField0_ &= -17;
            this.maxPower_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasStageId() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getStageId() {
            return this.stageId_;
         }

         public Builder setStageId(int value) {
            this.bitField0_ |= 32;
            this.stageId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageId() {
            this.bitField0_ &= -33;
            this.stageId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTicketNum() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getTicketNum() {
            return this.ticketNum_;
         }

         public Builder setTicketNum(int value) {
            this.bitField0_ |= 64;
            this.ticketNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTicketNum() {
            this.bitField0_ &= -65;
            this.ticketNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsSweep() {
            return (this.bitField0_ & 128) != 0;
         }

         public boolean getIsSweep() {
            return this.isSweep_;
         }

         public Builder setIsSweep(boolean value) {
            this.bitField0_ |= 128;
            this.isSweep_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsSweep() {
            this.bitField0_ &= -129;
            this.isSweep_ = false;
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

   public static final class S2C_FairylandBattle_4708 extends GeneratedMessageV3 implements S2C_FairylandBattle_4708OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private ExploreInfo info_;
      public static final int TICKETNUM_FIELD_NUMBER = 2;
      private int ticketNum_;
      public static final int RESULT_FIELD_NUMBER = 3;
      private BattleMsg.S2C_BattleResult_6102 result_;
      private byte memoizedIsInitialized;
      private static final S2C_FairylandBattle_4708 DEFAULT_INSTANCE = new S2C_FairylandBattle_4708();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FairylandBattle_4708> PARSER = new AbstractParser<S2C_FairylandBattle_4708>() {
         public S2C_FairylandBattle_4708 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FairylandBattle_4708(input, extensionRegistry);
         }
      };

      private S2C_FairylandBattle_4708(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FairylandBattle_4708() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FairylandBattle_4708();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FairylandBattle_4708(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ExploreInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (ExploreInfo)input.readMessage(FairylandMsg.ExploreInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.ticketNum_ = input.readInt32();
                        break;
                     case 26:
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.result_.toBuilder();
                        }

                        this.result_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.result_);
                           this.result_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4;
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandBattle_4708_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandBattle_4708_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FairylandBattle_4708.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public ExploreInfo getInfo() {
         return this.info_ == null ? FairylandMsg.ExploreInfo.getDefaultInstance() : this.info_;
      }

      public ExploreInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? FairylandMsg.ExploreInfo.getDefaultInstance() : this.info_;
      }

      public boolean hasTicketNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTicketNum() {
         return this.ticketNum_;
      }

      public boolean hasResult() {
         return (this.bitField0_ & 4) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getResult() {
         return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getResultOrBuilder() {
         return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
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
         } else if (!this.hasTicketNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasResult() && !this.getResult().isInitialized()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.ticketNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(3, this.getResult());
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.ticketNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getResult());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FairylandBattle_4708)) {
            return super.equals(obj);
         } else {
            S2C_FairylandBattle_4708 other = (S2C_FairylandBattle_4708)obj;
            if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
               return false;
            } else if (this.hasTicketNum() != other.hasTicketNum()) {
               return false;
            } else if (this.hasTicketNum() && this.getTicketNum() != other.getTicketNum()) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && !this.getResult().equals(other.getResult())) {
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

            if (this.hasTicketNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTicketNum();
            }

            if (this.hasResult()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getResult().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FairylandBattle_4708 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FairylandBattle_4708)PARSER.parseFrom(data);
      }

      public static S2C_FairylandBattle_4708 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FairylandBattle_4708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FairylandBattle_4708 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FairylandBattle_4708)PARSER.parseFrom(data);
      }

      public static S2C_FairylandBattle_4708 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FairylandBattle_4708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FairylandBattle_4708 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FairylandBattle_4708)PARSER.parseFrom(data);
      }

      public static S2C_FairylandBattle_4708 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FairylandBattle_4708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FairylandBattle_4708 parseFrom(InputStream input) throws IOException {
         return (S2C_FairylandBattle_4708)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FairylandBattle_4708 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FairylandBattle_4708)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FairylandBattle_4708 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FairylandBattle_4708)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FairylandBattle_4708 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FairylandBattle_4708)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FairylandBattle_4708 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FairylandBattle_4708)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FairylandBattle_4708 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FairylandBattle_4708)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FairylandBattle_4708 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FairylandBattle_4708 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FairylandBattle_4708> parser() {
         return PARSER;
      }

      public Parser<S2C_FairylandBattle_4708> getParserForType() {
         return PARSER;
      }

      public S2C_FairylandBattle_4708 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FairylandBattle_4708OrBuilder {
         private int bitField0_;
         private ExploreInfo info_;
         private SingleFieldBuilderV3<ExploreInfo, ExploreInfo.Builder, ExploreInfoOrBuilder> infoBuilder_;
         private int ticketNum_;
         private BattleMsg.S2C_BattleResult_6102 result_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> resultBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandBattle_4708_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandBattle_4708_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FairylandBattle_4708.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.S2C_FairylandBattle_4708.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
               this.getResultFieldBuilder();
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
            this.ticketNum_ = 0;
            this.bitField0_ &= -3;
            if (this.resultBuilder_ == null) {
               this.result_ = null;
            } else {
               this.resultBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandBattle_4708_descriptor;
         }

         public S2C_FairylandBattle_4708 getDefaultInstanceForType() {
            return FairylandMsg.S2C_FairylandBattle_4708.getDefaultInstance();
         }

         public S2C_FairylandBattle_4708 build() {
            S2C_FairylandBattle_4708 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FairylandBattle_4708 buildPartial() {
            S2C_FairylandBattle_4708 result = new S2C_FairylandBattle_4708(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (ExploreInfo)this.infoBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.ticketNum_ = this.ticketNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.resultBuilder_ == null) {
                  result.result_ = this.result_;
               } else {
                  result.result_ = (BattleMsg.S2C_BattleResult_6102)this.resultBuilder_.build();
               }

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
            if (other instanceof S2C_FairylandBattle_4708) {
               return this.mergeFrom((S2C_FairylandBattle_4708)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FairylandBattle_4708 other) {
            if (other == FairylandMsg.S2C_FairylandBattle_4708.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               if (other.hasTicketNum()) {
                  this.setTicketNum(other.getTicketNum());
               }

               if (other.hasResult()) {
                  this.mergeResult(other.getResult());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasInfo()) {
               return false;
            } else if (!this.hasTicketNum()) {
               return false;
            } else if (!this.getInfo().isInitialized()) {
               return false;
            } else {
               return !this.hasResult() || this.getResult().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FairylandBattle_4708 parsedMessage = null;

            try {
               parsedMessage = (S2C_FairylandBattle_4708)FairylandMsg.S2C_FairylandBattle_4708.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FairylandBattle_4708)e.getUnfinishedMessage();
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

         public ExploreInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? FairylandMsg.ExploreInfo.getDefaultInstance() : this.info_;
            } else {
               return (ExploreInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(ExploreInfo value) {
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

         public Builder setInfo(ExploreInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(ExploreInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != FairylandMsg.ExploreInfo.getDefaultInstance()) {
                  this.info_ = FairylandMsg.ExploreInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public ExploreInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (ExploreInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public ExploreInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (ExploreInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? FairylandMsg.ExploreInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<ExploreInfo, ExploreInfo.Builder, ExploreInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public boolean hasTicketNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTicketNum() {
            return this.ticketNum_;
         }

         public Builder setTicketNum(int value) {
            this.bitField0_ |= 2;
            this.ticketNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTicketNum() {
            this.bitField0_ &= -3;
            this.ticketNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 4) != 0;
         }

         public BattleMsg.S2C_BattleResult_6102 getResult() {
            if (this.resultBuilder_ == null) {
               return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
            } else {
               return (BattleMsg.S2C_BattleResult_6102)this.resultBuilder_.getMessage();
            }
         }

         public Builder setResult(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.resultBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.result_ = value;
               this.onChanged();
            } else {
               this.resultBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setResult(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.resultBuilder_ == null) {
               this.result_ = builderForValue.build();
               this.onChanged();
            } else {
               this.resultBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeResult(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.resultBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.result_ != null && this.result_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.result_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.result_).mergeFrom(value).buildPartial();
               } else {
                  this.result_ = value;
               }

               this.onChanged();
            } else {
               this.resultBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearResult() {
            if (this.resultBuilder_ == null) {
               this.result_ = null;
               this.onChanged();
            } else {
               this.resultBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getResultBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (BattleMsg.S2C_BattleResult_6102.Builder)this.getResultFieldBuilder().getBuilder();
         }

         public BattleMsg.S2C_BattleResult_6102OrBuilder getResultOrBuilder() {
            if (this.resultBuilder_ != null) {
               return (BattleMsg.S2C_BattleResult_6102OrBuilder)this.resultBuilder_.getMessageOrBuilder();
            } else {
               return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
            }
         }

         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> getResultFieldBuilder() {
            if (this.resultBuilder_ == null) {
               this.resultBuilder_ = new SingleFieldBuilderV3(this.getResult(), this.getParentForChildren(), this.isClean());
               this.result_ = null;
            }

            return this.resultBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_FairylandRank_4709 extends GeneratedMessageV3 implements C2S_FairylandRank_4709OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_FairylandRank_4709 DEFAULT_INSTANCE = new C2S_FairylandRank_4709();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FairylandRank_4709> PARSER = new AbstractParser<C2S_FairylandRank_4709>() {
         public C2S_FairylandRank_4709 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FairylandRank_4709(input, extensionRegistry);
         }
      };

      private C2S_FairylandRank_4709(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FairylandRank_4709() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FairylandRank_4709();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FairylandRank_4709(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandRank_4709_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandRank_4709_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FairylandRank_4709.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FairylandRank_4709)) {
            return super.equals(obj);
         } else {
            C2S_FairylandRank_4709 other = (C2S_FairylandRank_4709)obj;
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

      public static C2S_FairylandRank_4709 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FairylandRank_4709)PARSER.parseFrom(data);
      }

      public static C2S_FairylandRank_4709 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FairylandRank_4709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FairylandRank_4709 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FairylandRank_4709)PARSER.parseFrom(data);
      }

      public static C2S_FairylandRank_4709 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FairylandRank_4709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FairylandRank_4709 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FairylandRank_4709)PARSER.parseFrom(data);
      }

      public static C2S_FairylandRank_4709 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FairylandRank_4709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FairylandRank_4709 parseFrom(InputStream input) throws IOException {
         return (C2S_FairylandRank_4709)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FairylandRank_4709 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FairylandRank_4709)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FairylandRank_4709 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FairylandRank_4709)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FairylandRank_4709 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FairylandRank_4709)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FairylandRank_4709 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FairylandRank_4709)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FairylandRank_4709 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FairylandRank_4709)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FairylandRank_4709 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FairylandRank_4709 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FairylandRank_4709> parser() {
         return PARSER;
      }

      public Parser<C2S_FairylandRank_4709> getParserForType() {
         return PARSER;
      }

      public C2S_FairylandRank_4709 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FairylandRank_4709OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandRank_4709_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandRank_4709_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FairylandRank_4709.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.C2S_FairylandRank_4709.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandRank_4709_descriptor;
         }

         public C2S_FairylandRank_4709 getDefaultInstanceForType() {
            return FairylandMsg.C2S_FairylandRank_4709.getDefaultInstance();
         }

         public C2S_FairylandRank_4709 build() {
            C2S_FairylandRank_4709 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FairylandRank_4709 buildPartial() {
            C2S_FairylandRank_4709 result = new C2S_FairylandRank_4709(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_FairylandRank_4709) {
               return this.mergeFrom((C2S_FairylandRank_4709)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FairylandRank_4709 other) {
            if (other == FairylandMsg.C2S_FairylandRank_4709.getDefaultInstance()) {
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
            C2S_FairylandRank_4709 parsedMessage = null;

            try {
               parsedMessage = (C2S_FairylandRank_4709)FairylandMsg.C2S_FairylandRank_4709.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FairylandRank_4709)e.getUnfinishedMessage();
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

   public static final class S2C_FairylandRank_4710 extends GeneratedMessageV3 implements S2C_FairylandRank_4710OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MYDATA_FIELD_NUMBER = 1;
      private ExploreRankData myData_;
      public static final int RANKDATA_FIELD_NUMBER = 2;
      private List<ExploreRankData> rankData_;
      private byte memoizedIsInitialized;
      private static final S2C_FairylandRank_4710 DEFAULT_INSTANCE = new S2C_FairylandRank_4710();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FairylandRank_4710> PARSER = new AbstractParser<S2C_FairylandRank_4710>() {
         public S2C_FairylandRank_4710 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FairylandRank_4710(input, extensionRegistry);
         }
      };

      private S2C_FairylandRank_4710(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FairylandRank_4710() {
         this.memoizedIsInitialized = -1;
         this.rankData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FairylandRank_4710();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FairylandRank_4710(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ExploreRankData.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.myData_.toBuilder();
                        }

                        this.myData_ = (ExploreRankData)input.readMessage(FairylandMsg.ExploreRankData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.myData_);
                           this.myData_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.rankData_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.rankData_.add(input.readMessage(FairylandMsg.ExploreRankData.PARSER, extensionRegistry));
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
                  this.rankData_ = Collections.unmodifiableList(this.rankData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandRank_4710_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandRank_4710_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FairylandRank_4710.class, Builder.class);
      }

      public boolean hasMyData() {
         return (this.bitField0_ & 1) != 0;
      }

      public ExploreRankData getMyData() {
         return this.myData_ == null ? FairylandMsg.ExploreRankData.getDefaultInstance() : this.myData_;
      }

      public ExploreRankDataOrBuilder getMyDataOrBuilder() {
         return this.myData_ == null ? FairylandMsg.ExploreRankData.getDefaultInstance() : this.myData_;
      }

      public List<ExploreRankData> getRankDataList() {
         return this.rankData_;
      }

      public List<? extends ExploreRankDataOrBuilder> getRankDataOrBuilderList() {
         return this.rankData_;
      }

      public int getRankDataCount() {
         return this.rankData_.size();
      }

      public ExploreRankData getRankData(int index) {
         return (ExploreRankData)this.rankData_.get(index);
      }

      public ExploreRankDataOrBuilder getRankDataOrBuilder(int index) {
         return (ExploreRankDataOrBuilder)this.rankData_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMyData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getMyData().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRankDataCount(); ++i) {
               if (!this.getRankData(i).isInitialized()) {
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
            output.writeMessage(1, this.getMyData());
         }

         for(int i = 0; i < this.rankData_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.rankData_.get(i));
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
               size += CodedOutputStream.computeMessageSize(1, this.getMyData());
            }

            for(int i = 0; i < this.rankData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.rankData_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FairylandRank_4710)) {
            return super.equals(obj);
         } else {
            S2C_FairylandRank_4710 other = (S2C_FairylandRank_4710)obj;
            if (this.hasMyData() != other.hasMyData()) {
               return false;
            } else if (this.hasMyData() && !this.getMyData().equals(other.getMyData())) {
               return false;
            } else if (!this.getRankDataList().equals(other.getRankDataList())) {
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
            if (this.hasMyData()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMyData().hashCode();
            }

            if (this.getRankDataCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRankDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FairylandRank_4710 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FairylandRank_4710)PARSER.parseFrom(data);
      }

      public static S2C_FairylandRank_4710 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FairylandRank_4710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FairylandRank_4710 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FairylandRank_4710)PARSER.parseFrom(data);
      }

      public static S2C_FairylandRank_4710 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FairylandRank_4710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FairylandRank_4710 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FairylandRank_4710)PARSER.parseFrom(data);
      }

      public static S2C_FairylandRank_4710 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FairylandRank_4710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FairylandRank_4710 parseFrom(InputStream input) throws IOException {
         return (S2C_FairylandRank_4710)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FairylandRank_4710 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FairylandRank_4710)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FairylandRank_4710 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FairylandRank_4710)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FairylandRank_4710 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FairylandRank_4710)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FairylandRank_4710 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FairylandRank_4710)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FairylandRank_4710 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FairylandRank_4710)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FairylandRank_4710 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FairylandRank_4710 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FairylandRank_4710> parser() {
         return PARSER;
      }

      public Parser<S2C_FairylandRank_4710> getParserForType() {
         return PARSER;
      }

      public S2C_FairylandRank_4710 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FairylandRank_4710OrBuilder {
         private int bitField0_;
         private ExploreRankData myData_;
         private SingleFieldBuilderV3<ExploreRankData, ExploreRankData.Builder, ExploreRankDataOrBuilder> myDataBuilder_;
         private List<ExploreRankData> rankData_;
         private RepeatedFieldBuilderV3<ExploreRankData, ExploreRankData.Builder, ExploreRankDataOrBuilder> rankDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandRank_4710_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandRank_4710_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FairylandRank_4710.class, Builder.class);
         }

         private Builder() {
            this.rankData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rankData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.S2C_FairylandRank_4710.alwaysUseFieldBuilders) {
               this.getMyDataFieldBuilder();
               this.getRankDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.myDataBuilder_ == null) {
               this.myData_ = null;
            } else {
               this.myDataBuilder_.clear();
            }

            this.bitField0_ &= -2;
            if (this.rankDataBuilder_ == null) {
               this.rankData_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.rankDataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandRank_4710_descriptor;
         }

         public S2C_FairylandRank_4710 getDefaultInstanceForType() {
            return FairylandMsg.S2C_FairylandRank_4710.getDefaultInstance();
         }

         public S2C_FairylandRank_4710 build() {
            S2C_FairylandRank_4710 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FairylandRank_4710 buildPartial() {
            S2C_FairylandRank_4710 result = new S2C_FairylandRank_4710(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.myDataBuilder_ == null) {
                  result.myData_ = this.myData_;
               } else {
                  result.myData_ = (ExploreRankData)this.myDataBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if (this.rankDataBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.rankData_ = Collections.unmodifiableList(this.rankData_);
                  this.bitField0_ &= -3;
               }

               result.rankData_ = this.rankData_;
            } else {
               result.rankData_ = this.rankDataBuilder_.build();
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
            if (other instanceof S2C_FairylandRank_4710) {
               return this.mergeFrom((S2C_FairylandRank_4710)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FairylandRank_4710 other) {
            if (other == FairylandMsg.S2C_FairylandRank_4710.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMyData()) {
                  this.mergeMyData(other.getMyData());
               }

               if (this.rankDataBuilder_ == null) {
                  if (!other.rankData_.isEmpty()) {
                     if (this.rankData_.isEmpty()) {
                        this.rankData_ = other.rankData_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureRankDataIsMutable();
                        this.rankData_.addAll(other.rankData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.rankData_.isEmpty()) {
                  if (this.rankDataBuilder_.isEmpty()) {
                     this.rankDataBuilder_.dispose();
                     this.rankDataBuilder_ = null;
                     this.rankData_ = other.rankData_;
                     this.bitField0_ &= -3;
                     this.rankDataBuilder_ = FairylandMsg.S2C_FairylandRank_4710.alwaysUseFieldBuilders ? this.getRankDataFieldBuilder() : null;
                  } else {
                     this.rankDataBuilder_.addAllMessages(other.rankData_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasMyData()) {
               return false;
            } else if (!this.getMyData().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getRankDataCount(); ++i) {
                  if (!this.getRankData(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FairylandRank_4710 parsedMessage = null;

            try {
               parsedMessage = (S2C_FairylandRank_4710)FairylandMsg.S2C_FairylandRank_4710.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FairylandRank_4710)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMyData() {
            return (this.bitField0_ & 1) != 0;
         }

         public ExploreRankData getMyData() {
            if (this.myDataBuilder_ == null) {
               return this.myData_ == null ? FairylandMsg.ExploreRankData.getDefaultInstance() : this.myData_;
            } else {
               return (ExploreRankData)this.myDataBuilder_.getMessage();
            }
         }

         public Builder setMyData(ExploreRankData value) {
            if (this.myDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.myData_ = value;
               this.onChanged();
            } else {
               this.myDataBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setMyData(ExploreRankData.Builder builderForValue) {
            if (this.myDataBuilder_ == null) {
               this.myData_ = builderForValue.build();
               this.onChanged();
            } else {
               this.myDataBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeMyData(ExploreRankData value) {
            if (this.myDataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.myData_ != null && this.myData_ != FairylandMsg.ExploreRankData.getDefaultInstance()) {
                  this.myData_ = FairylandMsg.ExploreRankData.newBuilder(this.myData_).mergeFrom(value).buildPartial();
               } else {
                  this.myData_ = value;
               }

               this.onChanged();
            } else {
               this.myDataBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearMyData() {
            if (this.myDataBuilder_ == null) {
               this.myData_ = null;
               this.onChanged();
            } else {
               this.myDataBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public ExploreRankData.Builder getMyDataBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (ExploreRankData.Builder)this.getMyDataFieldBuilder().getBuilder();
         }

         public ExploreRankDataOrBuilder getMyDataOrBuilder() {
            if (this.myDataBuilder_ != null) {
               return (ExploreRankDataOrBuilder)this.myDataBuilder_.getMessageOrBuilder();
            } else {
               return this.myData_ == null ? FairylandMsg.ExploreRankData.getDefaultInstance() : this.myData_;
            }
         }

         private SingleFieldBuilderV3<ExploreRankData, ExploreRankData.Builder, ExploreRankDataOrBuilder> getMyDataFieldBuilder() {
            if (this.myDataBuilder_ == null) {
               this.myDataBuilder_ = new SingleFieldBuilderV3(this.getMyData(), this.getParentForChildren(), this.isClean());
               this.myData_ = null;
            }

            return this.myDataBuilder_;
         }

         private void ensureRankDataIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.rankData_ = new ArrayList(this.rankData_);
               this.bitField0_ |= 2;
            }

         }

         public List<ExploreRankData> getRankDataList() {
            return this.rankDataBuilder_ == null ? Collections.unmodifiableList(this.rankData_) : this.rankDataBuilder_.getMessageList();
         }

         public int getRankDataCount() {
            return this.rankDataBuilder_ == null ? this.rankData_.size() : this.rankDataBuilder_.getCount();
         }

         public ExploreRankData getRankData(int index) {
            return this.rankDataBuilder_ == null ? (ExploreRankData)this.rankData_.get(index) : (ExploreRankData)this.rankDataBuilder_.getMessage(index);
         }

         public Builder setRankData(int index, ExploreRankData value) {
            if (this.rankDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankDataIsMutable();
               this.rankData_.set(index, value);
               this.onChanged();
            } else {
               this.rankDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRankData(int index, ExploreRankData.Builder builderForValue) {
            if (this.rankDataBuilder_ == null) {
               this.ensureRankDataIsMutable();
               this.rankData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRankData(ExploreRankData value) {
            if (this.rankDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankDataIsMutable();
               this.rankData_.add(value);
               this.onChanged();
            } else {
               this.rankDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRankData(int index, ExploreRankData value) {
            if (this.rankDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankDataIsMutable();
               this.rankData_.add(index, value);
               this.onChanged();
            } else {
               this.rankDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRankData(ExploreRankData.Builder builderForValue) {
            if (this.rankDataBuilder_ == null) {
               this.ensureRankDataIsMutable();
               this.rankData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rankDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRankData(int index, ExploreRankData.Builder builderForValue) {
            if (this.rankDataBuilder_ == null) {
               this.ensureRankDataIsMutable();
               this.rankData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRankData(Iterable<? extends ExploreRankData> values) {
            if (this.rankDataBuilder_ == null) {
               this.ensureRankDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rankData_);
               this.onChanged();
            } else {
               this.rankDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRankData() {
            if (this.rankDataBuilder_ == null) {
               this.rankData_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.rankDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeRankData(int index) {
            if (this.rankDataBuilder_ == null) {
               this.ensureRankDataIsMutable();
               this.rankData_.remove(index);
               this.onChanged();
            } else {
               this.rankDataBuilder_.remove(index);
            }

            return this;
         }

         public ExploreRankData.Builder getRankDataBuilder(int index) {
            return (ExploreRankData.Builder)this.getRankDataFieldBuilder().getBuilder(index);
         }

         public ExploreRankDataOrBuilder getRankDataOrBuilder(int index) {
            return this.rankDataBuilder_ == null ? (ExploreRankDataOrBuilder)this.rankData_.get(index) : (ExploreRankDataOrBuilder)this.rankDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ExploreRankDataOrBuilder> getRankDataOrBuilderList() {
            return this.rankDataBuilder_ != null ? this.rankDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rankData_);
         }

         public ExploreRankData.Builder addRankDataBuilder() {
            return (ExploreRankData.Builder)this.getRankDataFieldBuilder().addBuilder(FairylandMsg.ExploreRankData.getDefaultInstance());
         }

         public ExploreRankData.Builder addRankDataBuilder(int index) {
            return (ExploreRankData.Builder)this.getRankDataFieldBuilder().addBuilder(index, FairylandMsg.ExploreRankData.getDefaultInstance());
         }

         public List<ExploreRankData.Builder> getRankDataBuilderList() {
            return this.getRankDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ExploreRankData, ExploreRankData.Builder, ExploreRankDataOrBuilder> getRankDataFieldBuilder() {
            if (this.rankDataBuilder_ == null) {
               this.rankDataBuilder_ = new RepeatedFieldBuilderV3(this.rankData_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.rankData_ = null;
            }

            return this.rankDataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class ExploreRankData extends GeneratedMessageV3 implements ExploreRankDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int WINSCORE_FIELD_NUMBER = 2;
      private long winScore_;
      public static final int PLAYERID_FIELD_NUMBER = 3;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 4;
      private volatile Object playerName_;
      public static final int HEAD_FIELD_NUMBER = 5;
      private int head_;
      public static final int HEADFRAME_FIELD_NUMBER = 6;
      private int headFrame_;
      public static final int LEVEL_FIELD_NUMBER = 7;
      private int level_;
      public static final int POWER_FIELD_NUMBER = 8;
      private long power_;
      public static final int MONARCHID_FIELD_NUMBER = 9;
      private int monarchId_;
      public static final int SERVERID_FIELD_NUMBER = 11;
      private int serverId_;
      public static final int UNIONNAME_FIELD_NUMBER = 12;
      private volatile Object unionName_;
      public static final int HEROINFO_FIELD_NUMBER = 13;
      private CommonMsg.HeroInfo heroInfo_;
      private byte memoizedIsInitialized;
      private static final ExploreRankData DEFAULT_INSTANCE = new ExploreRankData();
      /** @deprecated */
      @Deprecated
      public static final Parser<ExploreRankData> PARSER = new AbstractParser<ExploreRankData>() {
         public ExploreRankData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new ExploreRankData(input, extensionRegistry);
         }
      };

      private ExploreRankData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ExploreRankData() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
         this.unionName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new ExploreRankData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ExploreRankData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.winScore_ = input.readInt64();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.playerId_ = input.readInt32();
                        break;
                     case 34:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 8;
                        this.playerName_ = bs;
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.head_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.headFrame_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.level_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.power_ = input.readInt64();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.monarchId_ = input.readInt32();
                        break;
                     case 88:
                        this.bitField0_ |= 512;
                        this.serverId_ = input.readInt32();
                        break;
                     case 98:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 1024;
                        this.unionName_ = bs;
                        break;
                     case 106:
                        CommonMsg.HeroInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2048) != 0) {
                           subBuilder = this.heroInfo_.toBuilder();
                        }

                        this.heroInfo_ = (CommonMsg.HeroInfo)input.readMessage(CommonMsg.HeroInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.heroInfo_);
                           this.heroInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2048;
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_ExploreRankData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_ExploreRankData_fieldAccessorTable.ensureFieldAccessorsInitialized(ExploreRankData.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasWinScore() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getWinScore() {
         return this.winScore_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
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

      public boolean hasHead() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public boolean hasPower() {
         return (this.bitField0_ & 128) != 0;
      }

      public long getPower() {
         return this.power_;
      }

      public boolean hasMonarchId() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getMonarchId() {
         return this.monarchId_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasUnionName() {
         return (this.bitField0_ & 1024) != 0;
      }

      public String getUnionName() {
         Object ref = this.unionName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.unionName_ = s;
            }

            return s;
         }
      }

      public ByteString getUnionNameBytes() {
         Object ref = this.unionName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.unionName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasHeroInfo() {
         return (this.bitField0_ & 2048) != 0;
      }

      public CommonMsg.HeroInfo getHeroInfo() {
         return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
      }

      public CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder() {
         return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
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
         } else if (!this.hasWinScore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasHeroInfo() && !this.getHeroInfo().isInitialized()) {
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
            output.writeInt64(2, this.winScore_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.playerId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            GeneratedMessageV3.writeString(output, 4, this.playerName_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.head_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.headFrame_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.level_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt64(8, this.power_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.monarchId_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(11, this.serverId_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            GeneratedMessageV3.writeString(output, 12, this.unionName_);
         }

         if ((this.bitField0_ & 2048) != 0) {
            output.writeMessage(13, this.getHeroInfo());
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
               size += CodedOutputStream.computeInt64Size(2, this.winScore_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.playerId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += GeneratedMessageV3.computeStringSize(4, this.playerName_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.head_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.headFrame_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.level_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt64Size(8, this.power_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.monarchId_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.serverId_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += GeneratedMessageV3.computeStringSize(12, this.unionName_);
            }

            if ((this.bitField0_ & 2048) != 0) {
               size += CodedOutputStream.computeMessageSize(13, this.getHeroInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof ExploreRankData)) {
            return super.equals(obj);
         } else {
            ExploreRankData other = (ExploreRankData)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasWinScore() != other.hasWinScore()) {
               return false;
            } else if (this.hasWinScore() && this.getWinScore() != other.getWinScore()) {
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
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (this.hasPower() != other.hasPower()) {
               return false;
            } else if (this.hasPower() && this.getPower() != other.getPower()) {
               return false;
            } else if (this.hasMonarchId() != other.hasMonarchId()) {
               return false;
            } else if (this.hasMonarchId() && this.getMonarchId() != other.getMonarchId()) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasUnionName() != other.hasUnionName()) {
               return false;
            } else if (this.hasUnionName() && !this.getUnionName().equals(other.getUnionName())) {
               return false;
            } else if (this.hasHeroInfo() != other.hasHeroInfo()) {
               return false;
            } else if (this.hasHeroInfo() && !this.getHeroInfo().equals(other.getHeroInfo())) {
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

            if (this.hasWinScore()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getWinScore());
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasHead()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getLevel();
            }

            if (this.hasPower()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + Internal.hashLong(this.getPower());
            }

            if (this.hasMonarchId()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getMonarchId();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasUnionName()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getUnionName().hashCode();
            }

            if (this.hasHeroInfo()) {
               hash = 37 * hash + 13;
               hash = 53 * hash + this.getHeroInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static ExploreRankData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (ExploreRankData)PARSER.parseFrom(data);
      }

      public static ExploreRankData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ExploreRankData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ExploreRankData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (ExploreRankData)PARSER.parseFrom(data);
      }

      public static ExploreRankData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ExploreRankData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ExploreRankData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (ExploreRankData)PARSER.parseFrom(data);
      }

      public static ExploreRankData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ExploreRankData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ExploreRankData parseFrom(InputStream input) throws IOException {
         return (ExploreRankData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ExploreRankData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ExploreRankData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static ExploreRankData parseDelimitedFrom(InputStream input) throws IOException {
         return (ExploreRankData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static ExploreRankData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ExploreRankData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static ExploreRankData parseFrom(CodedInputStream input) throws IOException {
         return (ExploreRankData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ExploreRankData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ExploreRankData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(ExploreRankData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static ExploreRankData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<ExploreRankData> parser() {
         return PARSER;
      }

      public Parser<ExploreRankData> getParserForType() {
         return PARSER;
      }

      public ExploreRankData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ExploreRankDataOrBuilder {
         private int bitField0_;
         private int rank_;
         private long winScore_;
         private int playerId_;
         private Object playerName_;
         private int head_;
         private int headFrame_;
         private int level_;
         private long power_;
         private int monarchId_;
         private int serverId_;
         private Object unionName_;
         private CommonMsg.HeroInfo heroInfo_;
         private SingleFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> heroInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_ExploreRankData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_ExploreRankData_fieldAccessorTable.ensureFieldAccessorsInitialized(ExploreRankData.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.unionName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.unionName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.ExploreRankData.alwaysUseFieldBuilders) {
               this.getHeroInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.winScore_ = 0L;
            this.bitField0_ &= -3;
            this.playerId_ = 0;
            this.bitField0_ &= -5;
            this.playerName_ = "";
            this.bitField0_ &= -9;
            this.head_ = 0;
            this.bitField0_ &= -17;
            this.headFrame_ = 0;
            this.bitField0_ &= -33;
            this.level_ = 0;
            this.bitField0_ &= -65;
            this.power_ = 0L;
            this.bitField0_ &= -129;
            this.monarchId_ = 0;
            this.bitField0_ &= -257;
            this.serverId_ = 0;
            this.bitField0_ &= -513;
            this.unionName_ = "";
            this.bitField0_ &= -1025;
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -2049;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_ExploreRankData_descriptor;
         }

         public ExploreRankData getDefaultInstanceForType() {
            return FairylandMsg.ExploreRankData.getDefaultInstance();
         }

         public ExploreRankData build() {
            ExploreRankData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public ExploreRankData buildPartial() {
            ExploreRankData result = new ExploreRankData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.winScore_ = this.winScore_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 16) != 0) {
               result.head_ = this.head_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.power_ = this.power_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.monarchId_ = this.monarchId_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 512;
            }

            if ((from_bitField0_ & 1024) != 0) {
               to_bitField0_ |= 1024;
            }

            result.unionName_ = this.unionName_;
            if ((from_bitField0_ & 2048) != 0) {
               if (this.heroInfoBuilder_ == null) {
                  result.heroInfo_ = this.heroInfo_;
               } else {
                  result.heroInfo_ = (CommonMsg.HeroInfo)this.heroInfoBuilder_.build();
               }

               to_bitField0_ |= 2048;
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
            if (other instanceof ExploreRankData) {
               return this.mergeFrom((ExploreRankData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(ExploreRankData other) {
            if (other == FairylandMsg.ExploreRankData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasWinScore()) {
                  this.setWinScore(other.getWinScore());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 8;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (other.hasPower()) {
                  this.setPower(other.getPower());
               }

               if (other.hasMonarchId()) {
                  this.setMonarchId(other.getMonarchId());
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasUnionName()) {
                  this.bitField0_ |= 1024;
                  this.unionName_ = other.unionName_;
                  this.onChanged();
               }

               if (other.hasHeroInfo()) {
                  this.mergeHeroInfo(other.getHeroInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRank()) {
               return false;
            } else if (!this.hasWinScore()) {
               return false;
            } else if (!this.hasPlayerId()) {
               return false;
            } else {
               return !this.hasHeroInfo() || this.getHeroInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            ExploreRankData parsedMessage = null;

            try {
               parsedMessage = (ExploreRankData)FairylandMsg.ExploreRankData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (ExploreRankData)e.getUnfinishedMessage();
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

         public boolean hasWinScore() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getWinScore() {
            return this.winScore_;
         }

         public Builder setWinScore(long value) {
            this.bitField0_ |= 2;
            this.winScore_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWinScore() {
            this.bitField0_ &= -3;
            this.winScore_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getPlayerId() {
            return this.playerId_;
         }

         public Builder setPlayerId(int value) {
            this.bitField0_ |= 4;
            this.playerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.bitField0_ &= -5;
            this.playerId_ = 0;
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
            this.playerName_ = FairylandMsg.ExploreRankData.getDefaultInstance().getPlayerName();
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

         public boolean hasHead() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getHead() {
            return this.head_;
         }

         public Builder setHead(int value) {
            this.bitField0_ |= 16;
            this.head_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHead() {
            this.bitField0_ &= -17;
            this.head_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeadFrame() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getHeadFrame() {
            return this.headFrame_;
         }

         public Builder setHeadFrame(int value) {
            this.bitField0_ |= 32;
            this.headFrame_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadFrame() {
            this.bitField0_ &= -33;
            this.headFrame_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 64;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -65;
            this.level_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPower() {
            return (this.bitField0_ & 128) != 0;
         }

         public long getPower() {
            return this.power_;
         }

         public Builder setPower(long value) {
            this.bitField0_ |= 128;
            this.power_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPower() {
            this.bitField0_ &= -129;
            this.power_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasMonarchId() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getMonarchId() {
            return this.monarchId_;
         }

         public Builder setMonarchId(int value) {
            this.bitField0_ |= 256;
            this.monarchId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMonarchId() {
            this.bitField0_ &= -257;
            this.monarchId_ = 0;
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

         public boolean hasUnionName() {
            return (this.bitField0_ & 1024) != 0;
         }

         public String getUnionName() {
            Object ref = this.unionName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.unionName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getUnionNameBytes() {
            Object ref = this.unionName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.unionName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setUnionName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1024;
               this.unionName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearUnionName() {
            this.bitField0_ &= -1025;
            this.unionName_ = FairylandMsg.ExploreRankData.getDefaultInstance().getUnionName();
            this.onChanged();
            return this;
         }

         public Builder setUnionNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1024;
               this.unionName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasHeroInfo() {
            return (this.bitField0_ & 2048) != 0;
         }

         public CommonMsg.HeroInfo getHeroInfo() {
            if (this.heroInfoBuilder_ == null) {
               return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
            } else {
               return (CommonMsg.HeroInfo)this.heroInfoBuilder_.getMessage();
            }
         }

         public Builder setHeroInfo(CommonMsg.HeroInfo value) {
            if (this.heroInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.heroInfo_ = value;
               this.onChanged();
            } else {
               this.heroInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2048;
            return this;
         }

         public Builder setHeroInfo(CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.heroInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2048;
            return this;
         }

         public Builder mergeHeroInfo(CommonMsg.HeroInfo value) {
            if (this.heroInfoBuilder_ == null) {
               if ((this.bitField0_ & 2048) != 0 && this.heroInfo_ != null && this.heroInfo_ != CommonMsg.HeroInfo.getDefaultInstance()) {
                  this.heroInfo_ = CommonMsg.HeroInfo.newBuilder(this.heroInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.heroInfo_ = value;
               }

               this.onChanged();
            } else {
               this.heroInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2048;
            return this;
         }

         public Builder clearHeroInfo() {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
               this.onChanged();
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -2049;
            return this;
         }

         public CommonMsg.HeroInfo.Builder getHeroInfoBuilder() {
            this.bitField0_ |= 2048;
            this.onChanged();
            return (CommonMsg.HeroInfo.Builder)this.getHeroInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder() {
            if (this.heroInfoBuilder_ != null) {
               return (CommonMsg.HeroInfoOrBuilder)this.heroInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> getHeroInfoFieldBuilder() {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfoBuilder_ = new SingleFieldBuilderV3(this.getHeroInfo(), this.getParentForChildren(), this.isClean());
               this.heroInfo_ = null;
            }

            return this.heroInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2S_FairylandHero_4711 extends GeneratedMessageV3 implements S2S_FairylandHero_4711OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HERODATA_FIELD_NUMBER = 1;
      private ByteString heroData_;
      public static final int HEROPOWER_FIELD_NUMBER = 2;
      private int heroPower_;
      private byte memoizedIsInitialized;
      private static final S2S_FairylandHero_4711 DEFAULT_INSTANCE = new S2S_FairylandHero_4711();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_FairylandHero_4711> PARSER = new AbstractParser<S2S_FairylandHero_4711>() {
         public S2S_FairylandHero_4711 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_FairylandHero_4711(input, extensionRegistry);
         }
      };

      private S2S_FairylandHero_4711(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_FairylandHero_4711() {
         this.memoizedIsInitialized = -1;
         this.heroData_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_FairylandHero_4711();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_FairylandHero_4711(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bitField0_ |= 1;
                        this.heroData_ = input.readBytes();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.heroPower_ = input.readInt32();
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_FairylandHero_4711_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_FairylandHero_4711_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_FairylandHero_4711.class, Builder.class);
      }

      public boolean hasHeroData() {
         return (this.bitField0_ & 1) != 0;
      }

      public ByteString getHeroData() {
         return this.heroData_;
      }

      public boolean hasHeroPower() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHeroPower() {
         return this.heroPower_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroPower()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBytes(1, this.heroData_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.heroPower_);
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
               size += CodedOutputStream.computeBytesSize(1, this.heroData_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.heroPower_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_FairylandHero_4711)) {
            return super.equals(obj);
         } else {
            S2S_FairylandHero_4711 other = (S2S_FairylandHero_4711)obj;
            if (this.hasHeroData() != other.hasHeroData()) {
               return false;
            } else if (this.hasHeroData() && !this.getHeroData().equals(other.getHeroData())) {
               return false;
            } else if (this.hasHeroPower() != other.hasHeroPower()) {
               return false;
            } else if (this.hasHeroPower() && this.getHeroPower() != other.getHeroPower()) {
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
            if (this.hasHeroData()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroData().hashCode();
            }

            if (this.hasHeroPower()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroPower();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_FairylandHero_4711 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_FairylandHero_4711)PARSER.parseFrom(data);
      }

      public static S2S_FairylandHero_4711 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_FairylandHero_4711)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_FairylandHero_4711 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_FairylandHero_4711)PARSER.parseFrom(data);
      }

      public static S2S_FairylandHero_4711 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_FairylandHero_4711)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_FairylandHero_4711 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_FairylandHero_4711)PARSER.parseFrom(data);
      }

      public static S2S_FairylandHero_4711 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_FairylandHero_4711)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_FairylandHero_4711 parseFrom(InputStream input) throws IOException {
         return (S2S_FairylandHero_4711)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_FairylandHero_4711 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_FairylandHero_4711)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_FairylandHero_4711 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_FairylandHero_4711)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_FairylandHero_4711 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_FairylandHero_4711)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_FairylandHero_4711 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_FairylandHero_4711)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_FairylandHero_4711 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_FairylandHero_4711)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_FairylandHero_4711 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_FairylandHero_4711 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_FairylandHero_4711> parser() {
         return PARSER;
      }

      public Parser<S2S_FairylandHero_4711> getParserForType() {
         return PARSER;
      }

      public S2S_FairylandHero_4711 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_FairylandHero_4711OrBuilder {
         private int bitField0_;
         private ByteString heroData_;
         private int heroPower_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_FairylandHero_4711_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_FairylandHero_4711_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_FairylandHero_4711.class, Builder.class);
         }

         private Builder() {
            this.heroData_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroData_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.S2S_FairylandHero_4711.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroData_ = ByteString.EMPTY;
            this.bitField0_ &= -2;
            this.heroPower_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_FairylandHero_4711_descriptor;
         }

         public S2S_FairylandHero_4711 getDefaultInstanceForType() {
            return FairylandMsg.S2S_FairylandHero_4711.getDefaultInstance();
         }

         public S2S_FairylandHero_4711 build() {
            S2S_FairylandHero_4711 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_FairylandHero_4711 buildPartial() {
            S2S_FairylandHero_4711 result = new S2S_FairylandHero_4711(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.heroData_ = this.heroData_;
            if ((from_bitField0_ & 2) != 0) {
               result.heroPower_ = this.heroPower_;
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
            if (other instanceof S2S_FairylandHero_4711) {
               return this.mergeFrom((S2S_FairylandHero_4711)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_FairylandHero_4711 other) {
            if (other == FairylandMsg.S2S_FairylandHero_4711.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroData()) {
                  this.setHeroData(other.getHeroData());
               }

               if (other.hasHeroPower()) {
                  this.setHeroPower(other.getHeroPower());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroData()) {
               return false;
            } else {
               return this.hasHeroPower();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_FairylandHero_4711 parsedMessage = null;

            try {
               parsedMessage = (S2S_FairylandHero_4711)FairylandMsg.S2S_FairylandHero_4711.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_FairylandHero_4711)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroData() {
            return (this.bitField0_ & 1) != 0;
         }

         public ByteString getHeroData() {
            return this.heroData_;
         }

         public Builder setHeroData(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.heroData_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearHeroData() {
            this.bitField0_ &= -2;
            this.heroData_ = FairylandMsg.S2S_FairylandHero_4711.getDefaultInstance().getHeroData();
            this.onChanged();
            return this;
         }

         public boolean hasHeroPower() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHeroPower() {
            return this.heroPower_;
         }

         public Builder setHeroPower(int value) {
            this.bitField0_ |= 2;
            this.heroPower_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroPower() {
            this.bitField0_ &= -3;
            this.heroPower_ = 0;
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

   public static final class S2S_FairylandExplore_4712 extends GeneratedMessageV3 implements S2S_FairylandExplore_4712OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private ExploreInfo info_;
      public static final int HERODATA_FIELD_NUMBER = 2;
      private ByteString heroData_;
      private byte memoizedIsInitialized;
      private static final S2S_FairylandExplore_4712 DEFAULT_INSTANCE = new S2S_FairylandExplore_4712();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_FairylandExplore_4712> PARSER = new AbstractParser<S2S_FairylandExplore_4712>() {
         public S2S_FairylandExplore_4712 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_FairylandExplore_4712(input, extensionRegistry);
         }
      };

      private S2S_FairylandExplore_4712(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_FairylandExplore_4712() {
         this.memoizedIsInitialized = -1;
         this.heroData_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_FairylandExplore_4712();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_FairylandExplore_4712(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ExploreInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (ExploreInfo)input.readMessage(FairylandMsg.ExploreInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        this.bitField0_ |= 2;
                        this.heroData_ = input.readBytes();
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_FairylandExplore_4712_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_FairylandExplore_4712_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_FairylandExplore_4712.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public ExploreInfo getInfo() {
         return this.info_ == null ? FairylandMsg.ExploreInfo.getDefaultInstance() : this.info_;
      }

      public ExploreInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? FairylandMsg.ExploreInfo.getDefaultInstance() : this.info_;
      }

      public boolean hasHeroData() {
         return (this.bitField0_ & 2) != 0;
      }

      public ByteString getHeroData() {
         return this.heroData_;
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
         } else if (!this.hasHeroData()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeBytes(2, this.heroData_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBytesSize(2, this.heroData_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_FairylandExplore_4712)) {
            return super.equals(obj);
         } else {
            S2S_FairylandExplore_4712 other = (S2S_FairylandExplore_4712)obj;
            if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
               return false;
            } else if (this.hasHeroData() != other.hasHeroData()) {
               return false;
            } else if (this.hasHeroData() && !this.getHeroData().equals(other.getHeroData())) {
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

            if (this.hasHeroData()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroData().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_FairylandExplore_4712 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_FairylandExplore_4712)PARSER.parseFrom(data);
      }

      public static S2S_FairylandExplore_4712 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_FairylandExplore_4712)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_FairylandExplore_4712 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_FairylandExplore_4712)PARSER.parseFrom(data);
      }

      public static S2S_FairylandExplore_4712 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_FairylandExplore_4712)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_FairylandExplore_4712 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_FairylandExplore_4712)PARSER.parseFrom(data);
      }

      public static S2S_FairylandExplore_4712 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_FairylandExplore_4712)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_FairylandExplore_4712 parseFrom(InputStream input) throws IOException {
         return (S2S_FairylandExplore_4712)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_FairylandExplore_4712 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_FairylandExplore_4712)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_FairylandExplore_4712 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_FairylandExplore_4712)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_FairylandExplore_4712 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_FairylandExplore_4712)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_FairylandExplore_4712 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_FairylandExplore_4712)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_FairylandExplore_4712 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_FairylandExplore_4712)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_FairylandExplore_4712 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_FairylandExplore_4712 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_FairylandExplore_4712> parser() {
         return PARSER;
      }

      public Parser<S2S_FairylandExplore_4712> getParserForType() {
         return PARSER;
      }

      public S2S_FairylandExplore_4712 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_FairylandExplore_4712OrBuilder {
         private int bitField0_;
         private ExploreInfo info_;
         private SingleFieldBuilderV3<ExploreInfo, ExploreInfo.Builder, ExploreInfoOrBuilder> infoBuilder_;
         private ByteString heroData_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_FairylandExplore_4712_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_FairylandExplore_4712_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_FairylandExplore_4712.class, Builder.class);
         }

         private Builder() {
            this.heroData_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroData_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.S2S_FairylandExplore_4712.alwaysUseFieldBuilders) {
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
            this.heroData_ = ByteString.EMPTY;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_FairylandExplore_4712_descriptor;
         }

         public S2S_FairylandExplore_4712 getDefaultInstanceForType() {
            return FairylandMsg.S2S_FairylandExplore_4712.getDefaultInstance();
         }

         public S2S_FairylandExplore_4712 build() {
            S2S_FairylandExplore_4712 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_FairylandExplore_4712 buildPartial() {
            S2S_FairylandExplore_4712 result = new S2S_FairylandExplore_4712(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (ExploreInfo)this.infoBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.heroData_ = this.heroData_;
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
            if (other instanceof S2S_FairylandExplore_4712) {
               return this.mergeFrom((S2S_FairylandExplore_4712)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_FairylandExplore_4712 other) {
            if (other == FairylandMsg.S2S_FairylandExplore_4712.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               if (other.hasHeroData()) {
                  this.setHeroData(other.getHeroData());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasInfo()) {
               return false;
            } else if (!this.hasHeroData()) {
               return false;
            } else {
               return this.getInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_FairylandExplore_4712 parsedMessage = null;

            try {
               parsedMessage = (S2S_FairylandExplore_4712)FairylandMsg.S2S_FairylandExplore_4712.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_FairylandExplore_4712)e.getUnfinishedMessage();
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

         public ExploreInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? FairylandMsg.ExploreInfo.getDefaultInstance() : this.info_;
            } else {
               return (ExploreInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(ExploreInfo value) {
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

         public Builder setInfo(ExploreInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(ExploreInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != FairylandMsg.ExploreInfo.getDefaultInstance()) {
                  this.info_ = FairylandMsg.ExploreInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public ExploreInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (ExploreInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public ExploreInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (ExploreInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? FairylandMsg.ExploreInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<ExploreInfo, ExploreInfo.Builder, ExploreInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public boolean hasHeroData() {
            return (this.bitField0_ & 2) != 0;
         }

         public ByteString getHeroData() {
            return this.heroData_;
         }

         public Builder setHeroData(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.heroData_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearHeroData() {
            this.bitField0_ &= -3;
            this.heroData_ = FairylandMsg.S2S_FairylandExplore_4712.getDefaultInstance().getHeroData();
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

   public static final class S2S_ExploreAward_4713 extends GeneratedMessageV3 implements S2S_ExploreAward_4713OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DEGREETYPE_FIELD_NUMBER = 1;
      private int degreeType_;
      public static final int ISWIN_FIELD_NUMBER = 2;
      private boolean isWin_;
      public static final int ISSHOW_FIELD_NUMBER = 3;
      private boolean isShow_;
      public static final int RESULT_FIELD_NUMBER = 4;
      private BattleMsg.S2C_BattleResult_6102 result_;
      private byte memoizedIsInitialized;
      private static final S2S_ExploreAward_4713 DEFAULT_INSTANCE = new S2S_ExploreAward_4713();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_ExploreAward_4713> PARSER = new AbstractParser<S2S_ExploreAward_4713>() {
         public S2S_ExploreAward_4713 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_ExploreAward_4713(input, extensionRegistry);
         }
      };

      private S2S_ExploreAward_4713(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_ExploreAward_4713() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_ExploreAward_4713();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_ExploreAward_4713(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.degreeType_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.isWin_ = input.readBool();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.isShow_ = input.readBool();
                        break;
                     case 34:
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 8) != 0) {
                           subBuilder = this.result_.toBuilder();
                        }

                        this.result_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.result_);
                           this.result_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 8;
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_ExploreAward_4713_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_ExploreAward_4713_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_ExploreAward_4713.class, Builder.class);
      }

      public boolean hasDegreeType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDegreeType() {
         return this.degreeType_;
      }

      public boolean hasIsWin() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsWin() {
         return this.isWin_;
      }

      public boolean hasIsShow() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsShow() {
         return this.isShow_;
      }

      public boolean hasResult() {
         return (this.bitField0_ & 8) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getResult() {
         return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getResultOrBuilder() {
         return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDegreeType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsWin()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsShow()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasResult() && !this.getResult().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.degreeType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.isWin_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.isShow_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeMessage(4, this.getResult());
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
               size += CodedOutputStream.computeInt32Size(1, this.degreeType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.isWin_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.isShow_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeMessageSize(4, this.getResult());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_ExploreAward_4713)) {
            return super.equals(obj);
         } else {
            S2S_ExploreAward_4713 other = (S2S_ExploreAward_4713)obj;
            if (this.hasDegreeType() != other.hasDegreeType()) {
               return false;
            } else if (this.hasDegreeType() && this.getDegreeType() != other.getDegreeType()) {
               return false;
            } else if (this.hasIsWin() != other.hasIsWin()) {
               return false;
            } else if (this.hasIsWin() && this.getIsWin() != other.getIsWin()) {
               return false;
            } else if (this.hasIsShow() != other.hasIsShow()) {
               return false;
            } else if (this.hasIsShow() && this.getIsShow() != other.getIsShow()) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && !this.getResult().equals(other.getResult())) {
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
            if (this.hasDegreeType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDegreeType();
            }

            if (this.hasIsWin()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsWin());
            }

            if (this.hasIsShow()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getIsShow());
            }

            if (this.hasResult()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getResult().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_ExploreAward_4713 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_ExploreAward_4713)PARSER.parseFrom(data);
      }

      public static S2S_ExploreAward_4713 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_ExploreAward_4713)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_ExploreAward_4713 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_ExploreAward_4713)PARSER.parseFrom(data);
      }

      public static S2S_ExploreAward_4713 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_ExploreAward_4713)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_ExploreAward_4713 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_ExploreAward_4713)PARSER.parseFrom(data);
      }

      public static S2S_ExploreAward_4713 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_ExploreAward_4713)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_ExploreAward_4713 parseFrom(InputStream input) throws IOException {
         return (S2S_ExploreAward_4713)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_ExploreAward_4713 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_ExploreAward_4713)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_ExploreAward_4713 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_ExploreAward_4713)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_ExploreAward_4713 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_ExploreAward_4713)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_ExploreAward_4713 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_ExploreAward_4713)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_ExploreAward_4713 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_ExploreAward_4713)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_ExploreAward_4713 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_ExploreAward_4713 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_ExploreAward_4713> parser() {
         return PARSER;
      }

      public Parser<S2S_ExploreAward_4713> getParserForType() {
         return PARSER;
      }

      public S2S_ExploreAward_4713 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_ExploreAward_4713OrBuilder {
         private int bitField0_;
         private int degreeType_;
         private boolean isWin_;
         private boolean isShow_;
         private BattleMsg.S2C_BattleResult_6102 result_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> resultBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_ExploreAward_4713_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_ExploreAward_4713_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_ExploreAward_4713.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.S2S_ExploreAward_4713.alwaysUseFieldBuilders) {
               this.getResultFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.degreeType_ = 0;
            this.bitField0_ &= -2;
            this.isWin_ = false;
            this.bitField0_ &= -3;
            this.isShow_ = false;
            this.bitField0_ &= -5;
            if (this.resultBuilder_ == null) {
               this.result_ = null;
            } else {
               this.resultBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_ExploreAward_4713_descriptor;
         }

         public S2S_ExploreAward_4713 getDefaultInstanceForType() {
            return FairylandMsg.S2S_ExploreAward_4713.getDefaultInstance();
         }

         public S2S_ExploreAward_4713 build() {
            S2S_ExploreAward_4713 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_ExploreAward_4713 buildPartial() {
            S2S_ExploreAward_4713 result = new S2S_ExploreAward_4713(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.degreeType_ = this.degreeType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isWin_ = this.isWin_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.isShow_ = this.isShow_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               if (this.resultBuilder_ == null) {
                  result.result_ = this.result_;
               } else {
                  result.result_ = (BattleMsg.S2C_BattleResult_6102)this.resultBuilder_.build();
               }

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
            if (other instanceof S2S_ExploreAward_4713) {
               return this.mergeFrom((S2S_ExploreAward_4713)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_ExploreAward_4713 other) {
            if (other == FairylandMsg.S2S_ExploreAward_4713.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDegreeType()) {
                  this.setDegreeType(other.getDegreeType());
               }

               if (other.hasIsWin()) {
                  this.setIsWin(other.getIsWin());
               }

               if (other.hasIsShow()) {
                  this.setIsShow(other.getIsShow());
               }

               if (other.hasResult()) {
                  this.mergeResult(other.getResult());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDegreeType()) {
               return false;
            } else if (!this.hasIsWin()) {
               return false;
            } else if (!this.hasIsShow()) {
               return false;
            } else {
               return !this.hasResult() || this.getResult().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_ExploreAward_4713 parsedMessage = null;

            try {
               parsedMessage = (S2S_ExploreAward_4713)FairylandMsg.S2S_ExploreAward_4713.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_ExploreAward_4713)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDegreeType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDegreeType() {
            return this.degreeType_;
         }

         public Builder setDegreeType(int value) {
            this.bitField0_ |= 1;
            this.degreeType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDegreeType() {
            this.bitField0_ &= -2;
            this.degreeType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsWin() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsWin() {
            return this.isWin_;
         }

         public Builder setIsWin(boolean value) {
            this.bitField0_ |= 2;
            this.isWin_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsWin() {
            this.bitField0_ &= -3;
            this.isWin_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasIsShow() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getIsShow() {
            return this.isShow_;
         }

         public Builder setIsShow(boolean value) {
            this.bitField0_ |= 4;
            this.isShow_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsShow() {
            this.bitField0_ &= -5;
            this.isShow_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 8) != 0;
         }

         public BattleMsg.S2C_BattleResult_6102 getResult() {
            if (this.resultBuilder_ == null) {
               return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
            } else {
               return (BattleMsg.S2C_BattleResult_6102)this.resultBuilder_.getMessage();
            }
         }

         public Builder setResult(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.resultBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.result_ = value;
               this.onChanged();
            } else {
               this.resultBuilder_.setMessage(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder setResult(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.resultBuilder_ == null) {
               this.result_ = builderForValue.build();
               this.onChanged();
            } else {
               this.resultBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder mergeResult(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.resultBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0 && this.result_ != null && this.result_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.result_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.result_).mergeFrom(value).buildPartial();
               } else {
                  this.result_ = value;
               }

               this.onChanged();
            } else {
               this.resultBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder clearResult() {
            if (this.resultBuilder_ == null) {
               this.result_ = null;
               this.onChanged();
            } else {
               this.resultBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getResultBuilder() {
            this.bitField0_ |= 8;
            this.onChanged();
            return (BattleMsg.S2C_BattleResult_6102.Builder)this.getResultFieldBuilder().getBuilder();
         }

         public BattleMsg.S2C_BattleResult_6102OrBuilder getResultOrBuilder() {
            if (this.resultBuilder_ != null) {
               return (BattleMsg.S2C_BattleResult_6102OrBuilder)this.resultBuilder_.getMessageOrBuilder();
            } else {
               return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
            }
         }

         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> getResultFieldBuilder() {
            if (this.resultBuilder_ == null) {
               this.resultBuilder_ = new SingleFieldBuilderV3(this.getResult(), this.getParentForChildren(), this.isClean());
               this.result_ = null;
            }

            return this.resultBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_StageSweep_4714 extends GeneratedMessageV3 implements C2S_StageSweep_4714OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_StageSweep_4714 DEFAULT_INSTANCE = new C2S_StageSweep_4714();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StageSweep_4714> PARSER = new AbstractParser<C2S_StageSweep_4714>() {
         public C2S_StageSweep_4714 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StageSweep_4714(input, extensionRegistry);
         }
      };

      private C2S_StageSweep_4714(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StageSweep_4714() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StageSweep_4714();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StageSweep_4714(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_StageSweep_4714_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_StageSweep_4714_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StageSweep_4714.class, Builder.class);
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
         } else if (!(obj instanceof C2S_StageSweep_4714)) {
            return super.equals(obj);
         } else {
            C2S_StageSweep_4714 other = (C2S_StageSweep_4714)obj;
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

      public static C2S_StageSweep_4714 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StageSweep_4714)PARSER.parseFrom(data);
      }

      public static C2S_StageSweep_4714 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StageSweep_4714)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StageSweep_4714 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StageSweep_4714)PARSER.parseFrom(data);
      }

      public static C2S_StageSweep_4714 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StageSweep_4714)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StageSweep_4714 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StageSweep_4714)PARSER.parseFrom(data);
      }

      public static C2S_StageSweep_4714 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StageSweep_4714)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StageSweep_4714 parseFrom(InputStream input) throws IOException {
         return (C2S_StageSweep_4714)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StageSweep_4714 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StageSweep_4714)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StageSweep_4714 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StageSweep_4714)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StageSweep_4714 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StageSweep_4714)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StageSweep_4714 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StageSweep_4714)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StageSweep_4714 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StageSweep_4714)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StageSweep_4714 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StageSweep_4714 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StageSweep_4714> parser() {
         return PARSER;
      }

      public Parser<C2S_StageSweep_4714> getParserForType() {
         return PARSER;
      }

      public C2S_StageSweep_4714 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StageSweep_4714OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_StageSweep_4714_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_StageSweep_4714_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StageSweep_4714.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.C2S_StageSweep_4714.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_StageSweep_4714_descriptor;
         }

         public C2S_StageSweep_4714 getDefaultInstanceForType() {
            return FairylandMsg.C2S_StageSweep_4714.getDefaultInstance();
         }

         public C2S_StageSweep_4714 build() {
            C2S_StageSweep_4714 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StageSweep_4714 buildPartial() {
            C2S_StageSweep_4714 result = new C2S_StageSweep_4714(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_StageSweep_4714) {
               return this.mergeFrom((C2S_StageSweep_4714)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StageSweep_4714 other) {
            if (other == FairylandMsg.C2S_StageSweep_4714.getDefaultInstance()) {
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
            C2S_StageSweep_4714 parsedMessage = null;

            try {
               parsedMessage = (C2S_StageSweep_4714)FairylandMsg.C2S_StageSweep_4714.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StageSweep_4714)e.getUnfinishedMessage();
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

   public static final class S2C_StageSweep_4715 extends GeneratedMessageV3 implements S2C_StageSweep_4715OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGESWEEP_FIELD_NUMBER = 1;
      private int stageSweep_;
      private byte memoizedIsInitialized;
      private static final S2C_StageSweep_4715 DEFAULT_INSTANCE = new S2C_StageSweep_4715();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_StageSweep_4715> PARSER = new AbstractParser<S2C_StageSweep_4715>() {
         public S2C_StageSweep_4715 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_StageSweep_4715(input, extensionRegistry);
         }
      };

      private S2C_StageSweep_4715(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_StageSweep_4715() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_StageSweep_4715();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_StageSweep_4715(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.stageSweep_ = input.readInt32();
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_StageSweep_4715_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_StageSweep_4715_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StageSweep_4715.class, Builder.class);
      }

      public boolean hasStageSweep() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStageSweep() {
         return this.stageSweep_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStageSweep()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.stageSweep_);
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
               size += CodedOutputStream.computeInt32Size(1, this.stageSweep_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_StageSweep_4715)) {
            return super.equals(obj);
         } else {
            S2C_StageSweep_4715 other = (S2C_StageSweep_4715)obj;
            if (this.hasStageSweep() != other.hasStageSweep()) {
               return false;
            } else if (this.hasStageSweep() && this.getStageSweep() != other.getStageSweep()) {
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
            if (this.hasStageSweep()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStageSweep();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_StageSweep_4715 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_StageSweep_4715)PARSER.parseFrom(data);
      }

      public static S2C_StageSweep_4715 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StageSweep_4715)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StageSweep_4715 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_StageSweep_4715)PARSER.parseFrom(data);
      }

      public static S2C_StageSweep_4715 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StageSweep_4715)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StageSweep_4715 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_StageSweep_4715)PARSER.parseFrom(data);
      }

      public static S2C_StageSweep_4715 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StageSweep_4715)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StageSweep_4715 parseFrom(InputStream input) throws IOException {
         return (S2C_StageSweep_4715)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StageSweep_4715 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StageSweep_4715)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StageSweep_4715 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_StageSweep_4715)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_StageSweep_4715 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StageSweep_4715)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StageSweep_4715 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_StageSweep_4715)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StageSweep_4715 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StageSweep_4715)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_StageSweep_4715 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_StageSweep_4715 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_StageSweep_4715> parser() {
         return PARSER;
      }

      public Parser<S2C_StageSweep_4715> getParserForType() {
         return PARSER;
      }

      public S2C_StageSweep_4715 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_StageSweep_4715OrBuilder {
         private int bitField0_;
         private int stageSweep_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_StageSweep_4715_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_StageSweep_4715_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StageSweep_4715.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.S2C_StageSweep_4715.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.stageSweep_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_StageSweep_4715_descriptor;
         }

         public S2C_StageSweep_4715 getDefaultInstanceForType() {
            return FairylandMsg.S2C_StageSweep_4715.getDefaultInstance();
         }

         public S2C_StageSweep_4715 build() {
            S2C_StageSweep_4715 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_StageSweep_4715 buildPartial() {
            S2C_StageSweep_4715 result = new S2C_StageSweep_4715(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stageSweep_ = this.stageSweep_;
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
            if (other instanceof S2C_StageSweep_4715) {
               return this.mergeFrom((S2C_StageSweep_4715)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_StageSweep_4715 other) {
            if (other == FairylandMsg.S2C_StageSweep_4715.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStageSweep()) {
                  this.setStageSweep(other.getStageSweep());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasStageSweep();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_StageSweep_4715 parsedMessage = null;

            try {
               parsedMessage = (S2C_StageSweep_4715)FairylandMsg.S2C_StageSweep_4715.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_StageSweep_4715)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStageSweep() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStageSweep() {
            return this.stageSweep_;
         }

         public Builder setStageSweep(int value) {
            this.bitField0_ |= 1;
            this.stageSweep_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageSweep() {
            this.bitField0_ &= -2;
            this.stageSweep_ = 0;
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

   public static final class S2C_BattleEnd_4716 extends GeneratedMessageV3 implements S2C_BattleEnd_4716OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGEID_FIELD_NUMBER = 2;
      private int stageId_;
      public static final int PASSSTATE_FIELD_NUMBER = 3;
      private int passState_;
      private byte memoizedIsInitialized;
      private static final S2C_BattleEnd_4716 DEFAULT_INSTANCE = new S2C_BattleEnd_4716();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BattleEnd_4716> PARSER = new AbstractParser<S2C_BattleEnd_4716>() {
         public S2C_BattleEnd_4716 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BattleEnd_4716(input, extensionRegistry);
         }
      };

      private S2C_BattleEnd_4716(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BattleEnd_4716() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BattleEnd_4716();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BattleEnd_4716(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.stageId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.passState_ = input.readInt32();
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_BattleEnd_4716_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_BattleEnd_4716_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleEnd_4716.class, Builder.class);
      }

      public boolean hasStageId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStageId() {
         return this.stageId_;
      }

      public boolean hasPassState() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPassState() {
         return this.passState_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStageId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPassState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.stageId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.passState_);
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
               size += CodedOutputStream.computeInt32Size(2, this.stageId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.passState_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BattleEnd_4716)) {
            return super.equals(obj);
         } else {
            S2C_BattleEnd_4716 other = (S2C_BattleEnd_4716)obj;
            if (this.hasStageId() != other.hasStageId()) {
               return false;
            } else if (this.hasStageId() && this.getStageId() != other.getStageId()) {
               return false;
            } else if (this.hasPassState() != other.hasPassState()) {
               return false;
            } else if (this.hasPassState() && this.getPassState() != other.getPassState()) {
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
            if (this.hasStageId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStageId();
            }

            if (this.hasPassState()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPassState();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BattleEnd_4716 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BattleEnd_4716)PARSER.parseFrom(data);
      }

      public static S2C_BattleEnd_4716 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleEnd_4716)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleEnd_4716 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BattleEnd_4716)PARSER.parseFrom(data);
      }

      public static S2C_BattleEnd_4716 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleEnd_4716)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleEnd_4716 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BattleEnd_4716)PARSER.parseFrom(data);
      }

      public static S2C_BattleEnd_4716 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleEnd_4716)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleEnd_4716 parseFrom(InputStream input) throws IOException {
         return (S2C_BattleEnd_4716)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleEnd_4716 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleEnd_4716)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleEnd_4716 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BattleEnd_4716)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BattleEnd_4716 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleEnd_4716)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleEnd_4716 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BattleEnd_4716)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleEnd_4716 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleEnd_4716)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BattleEnd_4716 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BattleEnd_4716 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BattleEnd_4716> parser() {
         return PARSER;
      }

      public Parser<S2C_BattleEnd_4716> getParserForType() {
         return PARSER;
      }

      public S2C_BattleEnd_4716 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BattleEnd_4716OrBuilder {
         private int bitField0_;
         private int stageId_;
         private int passState_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_BattleEnd_4716_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_BattleEnd_4716_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleEnd_4716.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.S2C_BattleEnd_4716.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.stageId_ = 0;
            this.bitField0_ &= -2;
            this.passState_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_BattleEnd_4716_descriptor;
         }

         public S2C_BattleEnd_4716 getDefaultInstanceForType() {
            return FairylandMsg.S2C_BattleEnd_4716.getDefaultInstance();
         }

         public S2C_BattleEnd_4716 build() {
            S2C_BattleEnd_4716 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BattleEnd_4716 buildPartial() {
            S2C_BattleEnd_4716 result = new S2C_BattleEnd_4716(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stageId_ = this.stageId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.passState_ = this.passState_;
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
            if (other instanceof S2C_BattleEnd_4716) {
               return this.mergeFrom((S2C_BattleEnd_4716)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BattleEnd_4716 other) {
            if (other == FairylandMsg.S2C_BattleEnd_4716.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStageId()) {
                  this.setStageId(other.getStageId());
               }

               if (other.hasPassState()) {
                  this.setPassState(other.getPassState());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStageId()) {
               return false;
            } else {
               return this.hasPassState();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BattleEnd_4716 parsedMessage = null;

            try {
               parsedMessage = (S2C_BattleEnd_4716)FairylandMsg.S2C_BattleEnd_4716.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BattleEnd_4716)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStageId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStageId() {
            return this.stageId_;
         }

         public Builder setStageId(int value) {
            this.bitField0_ |= 1;
            this.stageId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageId() {
            this.bitField0_ &= -2;
            this.stageId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPassState() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPassState() {
            return this.passState_;
         }

         public Builder setPassState(int value) {
            this.bitField0_ |= 2;
            this.passState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPassState() {
            this.bitField0_ &= -3;
            this.passState_ = 0;
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

   public static final class C2S_ReceiveCommonAward_4717 extends GeneratedMessageV3 implements C2S_ReceiveCommonAward_4717OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGESUM_FIELD_NUMBER = 2;
      private int stageSum_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveCommonAward_4717 DEFAULT_INSTANCE = new C2S_ReceiveCommonAward_4717();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveCommonAward_4717> PARSER = new AbstractParser<C2S_ReceiveCommonAward_4717>() {
         public C2S_ReceiveCommonAward_4717 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveCommonAward_4717(input, extensionRegistry);
         }
      };

      private C2S_ReceiveCommonAward_4717(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveCommonAward_4717() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveCommonAward_4717();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveCommonAward_4717(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.stageSum_ = input.readInt32();
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveCommonAward_4717_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveCommonAward_4717_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveCommonAward_4717.class, Builder.class);
      }

      public boolean hasStageSum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStageSum() {
         return this.stageSum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStageSum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.stageSum_);
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
               size += CodedOutputStream.computeInt32Size(2, this.stageSum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ReceiveCommonAward_4717)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveCommonAward_4717 other = (C2S_ReceiveCommonAward_4717)obj;
            if (this.hasStageSum() != other.hasStageSum()) {
               return false;
            } else if (this.hasStageSum() && this.getStageSum() != other.getStageSum()) {
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
            if (this.hasStageSum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStageSum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ReceiveCommonAward_4717 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveCommonAward_4717)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveCommonAward_4717 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveCommonAward_4717)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveCommonAward_4717 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveCommonAward_4717)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveCommonAward_4717 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveCommonAward_4717)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveCommonAward_4717 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveCommonAward_4717)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveCommonAward_4717 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveCommonAward_4717)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveCommonAward_4717 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveCommonAward_4717)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveCommonAward_4717 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveCommonAward_4717)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveCommonAward_4717 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveCommonAward_4717)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveCommonAward_4717 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveCommonAward_4717)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveCommonAward_4717 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveCommonAward_4717)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveCommonAward_4717 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveCommonAward_4717)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveCommonAward_4717 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveCommonAward_4717 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveCommonAward_4717> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveCommonAward_4717> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveCommonAward_4717 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveCommonAward_4717OrBuilder {
         private int bitField0_;
         private int stageSum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveCommonAward_4717_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveCommonAward_4717_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveCommonAward_4717.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.C2S_ReceiveCommonAward_4717.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.stageSum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveCommonAward_4717_descriptor;
         }

         public C2S_ReceiveCommonAward_4717 getDefaultInstanceForType() {
            return FairylandMsg.C2S_ReceiveCommonAward_4717.getDefaultInstance();
         }

         public C2S_ReceiveCommonAward_4717 build() {
            C2S_ReceiveCommonAward_4717 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveCommonAward_4717 buildPartial() {
            C2S_ReceiveCommonAward_4717 result = new C2S_ReceiveCommonAward_4717(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stageSum_ = this.stageSum_;
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
            if (other instanceof C2S_ReceiveCommonAward_4717) {
               return this.mergeFrom((C2S_ReceiveCommonAward_4717)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveCommonAward_4717 other) {
            if (other == FairylandMsg.C2S_ReceiveCommonAward_4717.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStageSum()) {
                  this.setStageSum(other.getStageSum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasStageSum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ReceiveCommonAward_4717 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveCommonAward_4717)FairylandMsg.C2S_ReceiveCommonAward_4717.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveCommonAward_4717)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStageSum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStageSum() {
            return this.stageSum_;
         }

         public Builder setStageSum(int value) {
            this.bitField0_ |= 1;
            this.stageSum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageSum() {
            this.bitField0_ &= -2;
            this.stageSum_ = 0;
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

   public static final class S2C_ReceiveCommonAward_4718 extends GeneratedMessageV3 implements S2C_ReceiveCommonAward_4718OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGESUM_FIELD_NUMBER = 2;
      private int stageSum_;
      public static final int RECEIVEAWARD_FIELD_NUMBER = 3;
      private Internal.IntList receiveAward_;
      public static final int RESULT_FIELD_NUMBER = 4;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_ReceiveCommonAward_4718 DEFAULT_INSTANCE = new S2C_ReceiveCommonAward_4718();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ReceiveCommonAward_4718> PARSER = new AbstractParser<S2C_ReceiveCommonAward_4718>() {
         public S2C_ReceiveCommonAward_4718 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ReceiveCommonAward_4718(input, extensionRegistry);
         }
      };

      private S2C_ReceiveCommonAward_4718(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ReceiveCommonAward_4718() {
         this.memoizedIsInitialized = -1;
         this.receiveAward_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ReceiveCommonAward_4718();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ReceiveCommonAward_4718(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 1;
                        this.stageSum_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.receiveAward_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.receiveAward_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.receiveAward_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 2;
                        this.result_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.receiveAward_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.receiveAward_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveCommonAward_4718_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveCommonAward_4718_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveCommonAward_4718.class, Builder.class);
      }

      public boolean hasStageSum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStageSum() {
         return this.stageSum_;
      }

      public List<Integer> getReceiveAwardList() {
         return this.receiveAward_;
      }

      public int getReceiveAwardCount() {
         return this.receiveAward_.size();
      }

      public int getReceiveAward(int index) {
         return this.receiveAward_.getInt(index);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasStageSum()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(2, this.stageSum_);
         }

         for(int i = 0; i < this.receiveAward_.size(); ++i) {
            output.writeInt32(3, this.receiveAward_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(4, this.result_);
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
               size += CodedOutputStream.computeInt32Size(2, this.stageSum_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.receiveAward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.receiveAward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getReceiveAwardList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.result_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ReceiveCommonAward_4718)) {
            return super.equals(obj);
         } else {
            S2C_ReceiveCommonAward_4718 other = (S2C_ReceiveCommonAward_4718)obj;
            if (this.hasStageSum() != other.hasStageSum()) {
               return false;
            } else if (this.hasStageSum() && this.getStageSum() != other.getStageSum()) {
               return false;
            } else if (!this.getReceiveAwardList().equals(other.getReceiveAwardList())) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
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
            if (this.hasStageSum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStageSum();
            }

            if (this.getReceiveAwardCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getReceiveAwardList().hashCode();
            }

            if (this.hasResult()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getResult();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ReceiveCommonAward_4718 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveCommonAward_4718)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveCommonAward_4718 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveCommonAward_4718)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveCommonAward_4718 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveCommonAward_4718)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveCommonAward_4718 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveCommonAward_4718)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveCommonAward_4718 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveCommonAward_4718)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveCommonAward_4718 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveCommonAward_4718)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveCommonAward_4718 parseFrom(InputStream input) throws IOException {
         return (S2C_ReceiveCommonAward_4718)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveCommonAward_4718 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveCommonAward_4718)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveCommonAward_4718 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ReceiveCommonAward_4718)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ReceiveCommonAward_4718 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveCommonAward_4718)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveCommonAward_4718 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ReceiveCommonAward_4718)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveCommonAward_4718 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveCommonAward_4718)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ReceiveCommonAward_4718 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ReceiveCommonAward_4718 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ReceiveCommonAward_4718> parser() {
         return PARSER;
      }

      public Parser<S2C_ReceiveCommonAward_4718> getParserForType() {
         return PARSER;
      }

      public S2C_ReceiveCommonAward_4718 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ReceiveCommonAward_4718OrBuilder {
         private int bitField0_;
         private int stageSum_;
         private Internal.IntList receiveAward_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveCommonAward_4718_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveCommonAward_4718_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveCommonAward_4718.class, Builder.class);
         }

         private Builder() {
            this.receiveAward_ = FairylandMsg.S2C_ReceiveCommonAward_4718.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.receiveAward_ = FairylandMsg.S2C_ReceiveCommonAward_4718.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.S2C_ReceiveCommonAward_4718.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.stageSum_ = 0;
            this.bitField0_ &= -2;
            this.receiveAward_ = FairylandMsg.S2C_ReceiveCommonAward_4718.emptyIntList();
            this.bitField0_ &= -3;
            this.result_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveCommonAward_4718_descriptor;
         }

         public S2C_ReceiveCommonAward_4718 getDefaultInstanceForType() {
            return FairylandMsg.S2C_ReceiveCommonAward_4718.getDefaultInstance();
         }

         public S2C_ReceiveCommonAward_4718 build() {
            S2C_ReceiveCommonAward_4718 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ReceiveCommonAward_4718 buildPartial() {
            S2C_ReceiveCommonAward_4718 result = new S2C_ReceiveCommonAward_4718(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stageSum_ = this.stageSum_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.receiveAward_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.receiveAward_ = this.receiveAward_;
            if ((from_bitField0_ & 4) != 0) {
               result.result_ = this.result_;
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
            if (other instanceof S2C_ReceiveCommonAward_4718) {
               return this.mergeFrom((S2C_ReceiveCommonAward_4718)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ReceiveCommonAward_4718 other) {
            if (other == FairylandMsg.S2C_ReceiveCommonAward_4718.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStageSum()) {
                  this.setStageSum(other.getStageSum());
               }

               if (!other.receiveAward_.isEmpty()) {
                  if (this.receiveAward_.isEmpty()) {
                     this.receiveAward_ = other.receiveAward_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureReceiveAwardIsMutable();
                     this.receiveAward_.addAll(other.receiveAward_);
                  }

                  this.onChanged();
               }

               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStageSum()) {
               return false;
            } else {
               return this.hasResult();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ReceiveCommonAward_4718 parsedMessage = null;

            try {
               parsedMessage = (S2C_ReceiveCommonAward_4718)FairylandMsg.S2C_ReceiveCommonAward_4718.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ReceiveCommonAward_4718)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStageSum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStageSum() {
            return this.stageSum_;
         }

         public Builder setStageSum(int value) {
            this.bitField0_ |= 1;
            this.stageSum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageSum() {
            this.bitField0_ &= -2;
            this.stageSum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureReceiveAwardIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.receiveAward_ = FairylandMsg.S2C_ReceiveCommonAward_4718.mutableCopy(this.receiveAward_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getReceiveAwardList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.receiveAward_) : this.receiveAward_);
         }

         public int getReceiveAwardCount() {
            return this.receiveAward_.size();
         }

         public int getReceiveAward(int index) {
            return this.receiveAward_.getInt(index);
         }

         public Builder setReceiveAward(int index, int value) {
            this.ensureReceiveAwardIsMutable();
            this.receiveAward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addReceiveAward(int value) {
            this.ensureReceiveAwardIsMutable();
            this.receiveAward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllReceiveAward(Iterable<? extends Integer> values) {
            this.ensureReceiveAwardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.receiveAward_);
            this.onChanged();
            return this;
         }

         public Builder clearReceiveAward() {
            this.receiveAward_ = FairylandMsg.S2C_ReceiveCommonAward_4718.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 4;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -5;
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

   public static final class C2S_ReceiveExtraAward_4719 extends GeneratedMessageV3 implements C2S_ReceiveExtraAward_4719OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGESUM_FIELD_NUMBER = 1;
      private int stageSum_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveExtraAward_4719 DEFAULT_INSTANCE = new C2S_ReceiveExtraAward_4719();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveExtraAward_4719> PARSER = new AbstractParser<C2S_ReceiveExtraAward_4719>() {
         public C2S_ReceiveExtraAward_4719 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveExtraAward_4719(input, extensionRegistry);
         }
      };

      private C2S_ReceiveExtraAward_4719(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveExtraAward_4719() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveExtraAward_4719();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveExtraAward_4719(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.stageSum_ = input.readInt32();
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveExtraAward_4719_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveExtraAward_4719_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveExtraAward_4719.class, Builder.class);
      }

      public boolean hasStageSum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStageSum() {
         return this.stageSum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStageSum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.stageSum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.stageSum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ReceiveExtraAward_4719)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveExtraAward_4719 other = (C2S_ReceiveExtraAward_4719)obj;
            if (this.hasStageSum() != other.hasStageSum()) {
               return false;
            } else if (this.hasStageSum() && this.getStageSum() != other.getStageSum()) {
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
            if (this.hasStageSum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStageSum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ReceiveExtraAward_4719 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveExtraAward_4719)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveExtraAward_4719 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveExtraAward_4719)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveExtraAward_4719 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveExtraAward_4719)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveExtraAward_4719 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveExtraAward_4719)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveExtraAward_4719 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveExtraAward_4719)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveExtraAward_4719 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveExtraAward_4719)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveExtraAward_4719 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveExtraAward_4719)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveExtraAward_4719 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveExtraAward_4719)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveExtraAward_4719 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveExtraAward_4719)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveExtraAward_4719 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveExtraAward_4719)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveExtraAward_4719 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveExtraAward_4719)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveExtraAward_4719 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveExtraAward_4719)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveExtraAward_4719 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveExtraAward_4719 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveExtraAward_4719> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveExtraAward_4719> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveExtraAward_4719 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveExtraAward_4719OrBuilder {
         private int bitField0_;
         private int stageSum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveExtraAward_4719_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveExtraAward_4719_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveExtraAward_4719.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.C2S_ReceiveExtraAward_4719.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.stageSum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveExtraAward_4719_descriptor;
         }

         public C2S_ReceiveExtraAward_4719 getDefaultInstanceForType() {
            return FairylandMsg.C2S_ReceiveExtraAward_4719.getDefaultInstance();
         }

         public C2S_ReceiveExtraAward_4719 build() {
            C2S_ReceiveExtraAward_4719 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveExtraAward_4719 buildPartial() {
            C2S_ReceiveExtraAward_4719 result = new C2S_ReceiveExtraAward_4719(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stageSum_ = this.stageSum_;
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
            if (other instanceof C2S_ReceiveExtraAward_4719) {
               return this.mergeFrom((C2S_ReceiveExtraAward_4719)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveExtraAward_4719 other) {
            if (other == FairylandMsg.C2S_ReceiveExtraAward_4719.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStageSum()) {
                  this.setStageSum(other.getStageSum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasStageSum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ReceiveExtraAward_4719 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveExtraAward_4719)FairylandMsg.C2S_ReceiveExtraAward_4719.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveExtraAward_4719)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStageSum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStageSum() {
            return this.stageSum_;
         }

         public Builder setStageSum(int value) {
            this.bitField0_ |= 1;
            this.stageSum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageSum() {
            this.bitField0_ &= -2;
            this.stageSum_ = 0;
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

   public static final class S2C_ReceiveExtraAward_4720 extends GeneratedMessageV3 implements S2C_ReceiveExtraAward_4720OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGESUM_FIELD_NUMBER = 1;
      private int stageSum_;
      public static final int RECEIVEEXTRA_FIELD_NUMBER = 3;
      private Internal.IntList receiveExtra_;
      public static final int RESULT_FIELD_NUMBER = 2;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_ReceiveExtraAward_4720 DEFAULT_INSTANCE = new S2C_ReceiveExtraAward_4720();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ReceiveExtraAward_4720> PARSER = new AbstractParser<S2C_ReceiveExtraAward_4720>() {
         public S2C_ReceiveExtraAward_4720 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ReceiveExtraAward_4720(input, extensionRegistry);
         }
      };

      private S2C_ReceiveExtraAward_4720(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ReceiveExtraAward_4720() {
         this.memoizedIsInitialized = -1;
         this.receiveExtra_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ReceiveExtraAward_4720();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ReceiveExtraAward_4720(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.stageSum_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.result_ = input.readInt32();
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.receiveExtra_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.receiveExtra_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.receiveExtra_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.receiveExtra_.addInt(input.readInt32());
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
                  this.receiveExtra_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveExtraAward_4720_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveExtraAward_4720_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveExtraAward_4720.class, Builder.class);
      }

      public boolean hasStageSum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStageSum() {
         return this.stageSum_;
      }

      public List<Integer> getReceiveExtraList() {
         return this.receiveExtra_;
      }

      public int getReceiveExtraCount() {
         return this.receiveExtra_.size();
      }

      public int getReceiveExtra(int index) {
         return this.receiveExtra_.getInt(index);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasStageSum()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.stageSum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.result_);
         }

         for(int i = 0; i < this.receiveExtra_.size(); ++i) {
            output.writeInt32(3, this.receiveExtra_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.stageSum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.result_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.receiveExtra_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.receiveExtra_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getReceiveExtraList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ReceiveExtraAward_4720)) {
            return super.equals(obj);
         } else {
            S2C_ReceiveExtraAward_4720 other = (S2C_ReceiveExtraAward_4720)obj;
            if (this.hasStageSum() != other.hasStageSum()) {
               return false;
            } else if (this.hasStageSum() && this.getStageSum() != other.getStageSum()) {
               return false;
            } else if (!this.getReceiveExtraList().equals(other.getReceiveExtraList())) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
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
            if (this.hasStageSum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStageSum();
            }

            if (this.getReceiveExtraCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getReceiveExtraList().hashCode();
            }

            if (this.hasResult()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getResult();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ReceiveExtraAward_4720 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveExtraAward_4720)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveExtraAward_4720 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveExtraAward_4720)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveExtraAward_4720 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveExtraAward_4720)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveExtraAward_4720 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveExtraAward_4720)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveExtraAward_4720 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveExtraAward_4720)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveExtraAward_4720 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveExtraAward_4720)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveExtraAward_4720 parseFrom(InputStream input) throws IOException {
         return (S2C_ReceiveExtraAward_4720)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveExtraAward_4720 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveExtraAward_4720)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveExtraAward_4720 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ReceiveExtraAward_4720)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ReceiveExtraAward_4720 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveExtraAward_4720)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveExtraAward_4720 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ReceiveExtraAward_4720)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveExtraAward_4720 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveExtraAward_4720)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ReceiveExtraAward_4720 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ReceiveExtraAward_4720 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ReceiveExtraAward_4720> parser() {
         return PARSER;
      }

      public Parser<S2C_ReceiveExtraAward_4720> getParserForType() {
         return PARSER;
      }

      public S2C_ReceiveExtraAward_4720 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ReceiveExtraAward_4720OrBuilder {
         private int bitField0_;
         private int stageSum_;
         private Internal.IntList receiveExtra_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveExtraAward_4720_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveExtraAward_4720_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveExtraAward_4720.class, Builder.class);
         }

         private Builder() {
            this.receiveExtra_ = FairylandMsg.S2C_ReceiveExtraAward_4720.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.receiveExtra_ = FairylandMsg.S2C_ReceiveExtraAward_4720.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.S2C_ReceiveExtraAward_4720.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.stageSum_ = 0;
            this.bitField0_ &= -2;
            this.receiveExtra_ = FairylandMsg.S2C_ReceiveExtraAward_4720.emptyIntList();
            this.bitField0_ &= -3;
            this.result_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveExtraAward_4720_descriptor;
         }

         public S2C_ReceiveExtraAward_4720 getDefaultInstanceForType() {
            return FairylandMsg.S2C_ReceiveExtraAward_4720.getDefaultInstance();
         }

         public S2C_ReceiveExtraAward_4720 build() {
            S2C_ReceiveExtraAward_4720 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ReceiveExtraAward_4720 buildPartial() {
            S2C_ReceiveExtraAward_4720 result = new S2C_ReceiveExtraAward_4720(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stageSum_ = this.stageSum_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.receiveExtra_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.receiveExtra_ = this.receiveExtra_;
            if ((from_bitField0_ & 4) != 0) {
               result.result_ = this.result_;
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
            if (other instanceof S2C_ReceiveExtraAward_4720) {
               return this.mergeFrom((S2C_ReceiveExtraAward_4720)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ReceiveExtraAward_4720 other) {
            if (other == FairylandMsg.S2C_ReceiveExtraAward_4720.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStageSum()) {
                  this.setStageSum(other.getStageSum());
               }

               if (!other.receiveExtra_.isEmpty()) {
                  if (this.receiveExtra_.isEmpty()) {
                     this.receiveExtra_ = other.receiveExtra_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureReceiveExtraIsMutable();
                     this.receiveExtra_.addAll(other.receiveExtra_);
                  }

                  this.onChanged();
               }

               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStageSum()) {
               return false;
            } else {
               return this.hasResult();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ReceiveExtraAward_4720 parsedMessage = null;

            try {
               parsedMessage = (S2C_ReceiveExtraAward_4720)FairylandMsg.S2C_ReceiveExtraAward_4720.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ReceiveExtraAward_4720)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStageSum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStageSum() {
            return this.stageSum_;
         }

         public Builder setStageSum(int value) {
            this.bitField0_ |= 1;
            this.stageSum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageSum() {
            this.bitField0_ &= -2;
            this.stageSum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureReceiveExtraIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.receiveExtra_ = FairylandMsg.S2C_ReceiveExtraAward_4720.mutableCopy(this.receiveExtra_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getReceiveExtraList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.receiveExtra_) : this.receiveExtra_);
         }

         public int getReceiveExtraCount() {
            return this.receiveExtra_.size();
         }

         public int getReceiveExtra(int index) {
            return this.receiveExtra_.getInt(index);
         }

         public Builder setReceiveExtra(int index, int value) {
            this.ensureReceiveExtraIsMutable();
            this.receiveExtra_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addReceiveExtra(int value) {
            this.ensureReceiveExtraIsMutable();
            this.receiveExtra_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllReceiveExtra(Iterable<? extends Integer> values) {
            this.ensureReceiveExtraIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.receiveExtra_);
            this.onChanged();
            return this;
         }

         public Builder clearReceiveExtra() {
            this.receiveExtra_ = FairylandMsg.S2C_ReceiveExtraAward_4720.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 4;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -5;
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

   public static final class S2S_UpdateHero_4721 extends GeneratedMessageV3 implements S2S_UpdateHero_4721OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2S_UpdateHero_4721 DEFAULT_INSTANCE = new S2S_UpdateHero_4721();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_UpdateHero_4721> PARSER = new AbstractParser<S2S_UpdateHero_4721>() {
         public S2S_UpdateHero_4721 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_UpdateHero_4721(input, extensionRegistry);
         }
      };

      private S2S_UpdateHero_4721(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_UpdateHero_4721() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_UpdateHero_4721();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_UpdateHero_4721(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_UpdateHero_4721_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_UpdateHero_4721_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_UpdateHero_4721.class, Builder.class);
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
         } else if (!(obj instanceof S2S_UpdateHero_4721)) {
            return super.equals(obj);
         } else {
            S2S_UpdateHero_4721 other = (S2S_UpdateHero_4721)obj;
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

      public static S2S_UpdateHero_4721 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_UpdateHero_4721)PARSER.parseFrom(data);
      }

      public static S2S_UpdateHero_4721 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_UpdateHero_4721)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_UpdateHero_4721 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_UpdateHero_4721)PARSER.parseFrom(data);
      }

      public static S2S_UpdateHero_4721 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_UpdateHero_4721)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_UpdateHero_4721 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_UpdateHero_4721)PARSER.parseFrom(data);
      }

      public static S2S_UpdateHero_4721 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_UpdateHero_4721)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_UpdateHero_4721 parseFrom(InputStream input) throws IOException {
         return (S2S_UpdateHero_4721)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_UpdateHero_4721 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_UpdateHero_4721)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_UpdateHero_4721 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_UpdateHero_4721)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_UpdateHero_4721 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_UpdateHero_4721)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_UpdateHero_4721 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_UpdateHero_4721)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_UpdateHero_4721 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_UpdateHero_4721)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_UpdateHero_4721 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_UpdateHero_4721 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_UpdateHero_4721> parser() {
         return PARSER;
      }

      public Parser<S2S_UpdateHero_4721> getParserForType() {
         return PARSER;
      }

      public S2S_UpdateHero_4721 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_UpdateHero_4721OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_UpdateHero_4721_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_UpdateHero_4721_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_UpdateHero_4721.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.S2S_UpdateHero_4721.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_UpdateHero_4721_descriptor;
         }

         public S2S_UpdateHero_4721 getDefaultInstanceForType() {
            return FairylandMsg.S2S_UpdateHero_4721.getDefaultInstance();
         }

         public S2S_UpdateHero_4721 build() {
            S2S_UpdateHero_4721 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_UpdateHero_4721 buildPartial() {
            S2S_UpdateHero_4721 result = new S2S_UpdateHero_4721(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2S_UpdateHero_4721) {
               return this.mergeFrom((S2S_UpdateHero_4721)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_UpdateHero_4721 other) {
            if (other == FairylandMsg.S2S_UpdateHero_4721.getDefaultInstance()) {
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
            S2S_UpdateHero_4721 parsedMessage = null;

            try {
               parsedMessage = (S2S_UpdateHero_4721)FairylandMsg.S2S_UpdateHero_4721.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_UpdateHero_4721)e.getUnfinishedMessage();
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

   public static final class S2S_SendRankAward_4722 extends GeneratedMessageV3 implements S2S_SendRankAward_4722OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int CHANGECROSS_FIELD_NUMBER = 2;
      private boolean changeCross_;
      private byte memoizedIsInitialized;
      private static final S2S_SendRankAward_4722 DEFAULT_INSTANCE = new S2S_SendRankAward_4722();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_SendRankAward_4722> PARSER = new AbstractParser<S2S_SendRankAward_4722>() {
         public S2S_SendRankAward_4722 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_SendRankAward_4722(input, extensionRegistry);
         }
      };

      private S2S_SendRankAward_4722(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_SendRankAward_4722() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_SendRankAward_4722();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_SendRankAward_4722(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.changeCross_ = input.readBool();
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_SendRankAward_4722_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_SendRankAward_4722_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_SendRankAward_4722.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasChangeCross() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getChangeCross() {
         return this.changeCross_;
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
         } else if (!this.hasChangeCross()) {
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
            output.writeBool(2, this.changeCross_);
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
               size += CodedOutputStream.computeBoolSize(2, this.changeCross_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_SendRankAward_4722)) {
            return super.equals(obj);
         } else {
            S2S_SendRankAward_4722 other = (S2S_SendRankAward_4722)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasChangeCross() != other.hasChangeCross()) {
               return false;
            } else if (this.hasChangeCross() && this.getChangeCross() != other.getChangeCross()) {
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

            if (this.hasChangeCross()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getChangeCross());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_SendRankAward_4722 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_SendRankAward_4722)PARSER.parseFrom(data);
      }

      public static S2S_SendRankAward_4722 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_SendRankAward_4722)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_SendRankAward_4722 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_SendRankAward_4722)PARSER.parseFrom(data);
      }

      public static S2S_SendRankAward_4722 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_SendRankAward_4722)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_SendRankAward_4722 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_SendRankAward_4722)PARSER.parseFrom(data);
      }

      public static S2S_SendRankAward_4722 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_SendRankAward_4722)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_SendRankAward_4722 parseFrom(InputStream input) throws IOException {
         return (S2S_SendRankAward_4722)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_SendRankAward_4722 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_SendRankAward_4722)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_SendRankAward_4722 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_SendRankAward_4722)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_SendRankAward_4722 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_SendRankAward_4722)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_SendRankAward_4722 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_SendRankAward_4722)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_SendRankAward_4722 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_SendRankAward_4722)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_SendRankAward_4722 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_SendRankAward_4722 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_SendRankAward_4722> parser() {
         return PARSER;
      }

      public Parser<S2S_SendRankAward_4722> getParserForType() {
         return PARSER;
      }

      public S2S_SendRankAward_4722 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_SendRankAward_4722OrBuilder {
         private int bitField0_;
         private int rank_;
         private boolean changeCross_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_SendRankAward_4722_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_SendRankAward_4722_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_SendRankAward_4722.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.S2S_SendRankAward_4722.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.changeCross_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_SendRankAward_4722_descriptor;
         }

         public S2S_SendRankAward_4722 getDefaultInstanceForType() {
            return FairylandMsg.S2S_SendRankAward_4722.getDefaultInstance();
         }

         public S2S_SendRankAward_4722 build() {
            S2S_SendRankAward_4722 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_SendRankAward_4722 buildPartial() {
            S2S_SendRankAward_4722 result = new S2S_SendRankAward_4722(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.changeCross_ = this.changeCross_;
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
            if (other instanceof S2S_SendRankAward_4722) {
               return this.mergeFrom((S2S_SendRankAward_4722)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_SendRankAward_4722 other) {
            if (other == FairylandMsg.S2S_SendRankAward_4722.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasChangeCross()) {
                  this.setChangeCross(other.getChangeCross());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRank()) {
               return false;
            } else {
               return this.hasChangeCross();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_SendRankAward_4722 parsedMessage = null;

            try {
               parsedMessage = (S2S_SendRankAward_4722)FairylandMsg.S2S_SendRankAward_4722.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_SendRankAward_4722)e.getUnfinishedMessage();
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

         public boolean hasChangeCross() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getChangeCross() {
            return this.changeCross_;
         }

         public Builder setChangeCross(boolean value) {
            this.bitField0_ |= 2;
            this.changeCross_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChangeCross() {
            this.bitField0_ &= -3;
            this.changeCross_ = false;
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

   public static final class S2S_NotifyBattle_4723 extends GeneratedMessageV3 implements S2S_NotifyBattle_4723OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SERVERID_FIELD_NUMBER = 2;
      private int serverId_;
      public static final int PLAYERID_FIELD_NUMBER = 3;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 4;
      private volatile Object playerName_;
      public static final int HEAD_FIELD_NUMBER = 5;
      private int head_;
      public static final int HEADFRAME_FIELD_NUMBER = 6;
      private int headFrame_;
      public static final int TIME_FIELD_NUMBER = 8;
      private int time_;
      public static final int POINT_FIELD_NUMBER = 9;
      private int point_;
      public static final int ISWIN_FIELD_NUMBER = 10;
      private boolean isWin_;
      public static final int LEVEL_FIELD_NUMBER = 12;
      private int level_;
      private byte memoizedIsInitialized;
      private static final S2S_NotifyBattle_4723 DEFAULT_INSTANCE = new S2S_NotifyBattle_4723();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_NotifyBattle_4723> PARSER = new AbstractParser<S2S_NotifyBattle_4723>() {
         public S2S_NotifyBattle_4723 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_NotifyBattle_4723(input, extensionRegistry);
         }
      };

      private S2S_NotifyBattle_4723(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_NotifyBattle_4723() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_NotifyBattle_4723();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_NotifyBattle_4723(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.serverId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.playerId_ = input.readInt32();
                        break;
                     case 34:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.playerName_ = bs;
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.head_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 16;
                        this.headFrame_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 32;
                        this.time_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 64;
                        this.point_ = input.readInt32();
                        break;
                     case 80:
                        this.bitField0_ |= 128;
                        this.isWin_ = input.readBool();
                        break;
                     case 96:
                        this.bitField0_ |= 256;
                        this.level_ = input.readInt32();
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_NotifyBattle_4723_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_NotifyBattle_4723_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_NotifyBattle_4723.class, Builder.class);
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

      public boolean hasHead() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public boolean hasTime() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getTime() {
         return this.time_;
      }

      public boolean hasPoint() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getPoint() {
         return this.point_;
      }

      public boolean hasIsWin() {
         return (this.bitField0_ & 128) != 0;
      }

      public boolean getIsWin() {
         return this.isWin_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getLevel() {
         return this.level_;
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
         } else if (!this.hasHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeadFrame()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsWin()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.serverId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 4, this.playerName_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.head_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(6, this.headFrame_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(8, this.time_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(9, this.point_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeBool(10, this.isWin_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(12, this.level_);
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
               size += CodedOutputStream.computeInt32Size(2, this.serverId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(4, this.playerName_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.head_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.headFrame_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.time_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.point_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeBoolSize(10, this.isWin_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(12, this.level_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_NotifyBattle_4723)) {
            return super.equals(obj);
         } else {
            S2S_NotifyBattle_4723 other = (S2S_NotifyBattle_4723)obj;
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
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
               return false;
            } else if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
               return false;
            } else if (this.hasPoint() != other.hasPoint()) {
               return false;
            } else if (this.hasPoint() && this.getPoint() != other.getPoint()) {
               return false;
            } else if (this.hasIsWin() != other.hasIsWin()) {
               return false;
            } else if (this.hasIsWin() && this.getIsWin() != other.getIsWin()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
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
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasHead()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasTime()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getTime();
            }

            if (this.hasPoint()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getPoint();
            }

            if (this.hasIsWin()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + Internal.hashBoolean(this.getIsWin());
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getLevel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_NotifyBattle_4723 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_NotifyBattle_4723)PARSER.parseFrom(data);
      }

      public static S2S_NotifyBattle_4723 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_NotifyBattle_4723)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_NotifyBattle_4723 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_NotifyBattle_4723)PARSER.parseFrom(data);
      }

      public static S2S_NotifyBattle_4723 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_NotifyBattle_4723)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_NotifyBattle_4723 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_NotifyBattle_4723)PARSER.parseFrom(data);
      }

      public static S2S_NotifyBattle_4723 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_NotifyBattle_4723)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_NotifyBattle_4723 parseFrom(InputStream input) throws IOException {
         return (S2S_NotifyBattle_4723)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_NotifyBattle_4723 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_NotifyBattle_4723)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_NotifyBattle_4723 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_NotifyBattle_4723)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_NotifyBattle_4723 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_NotifyBattle_4723)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_NotifyBattle_4723 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_NotifyBattle_4723)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_NotifyBattle_4723 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_NotifyBattle_4723)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_NotifyBattle_4723 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_NotifyBattle_4723 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_NotifyBattle_4723> parser() {
         return PARSER;
      }

      public Parser<S2S_NotifyBattle_4723> getParserForType() {
         return PARSER;
      }

      public S2S_NotifyBattle_4723 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_NotifyBattle_4723OrBuilder {
         private int bitField0_;
         private int serverId_;
         private int playerId_;
         private Object playerName_;
         private int head_;
         private int headFrame_;
         private int time_;
         private int point_;
         private boolean isWin_;
         private int level_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_NotifyBattle_4723_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_NotifyBattle_4723_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_NotifyBattle_4723.class, Builder.class);
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
            if (FairylandMsg.S2S_NotifyBattle_4723.alwaysUseFieldBuilders) {
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
            this.head_ = 0;
            this.bitField0_ &= -9;
            this.headFrame_ = 0;
            this.bitField0_ &= -17;
            this.time_ = 0;
            this.bitField0_ &= -33;
            this.point_ = 0;
            this.bitField0_ &= -65;
            this.isWin_ = false;
            this.bitField0_ &= -129;
            this.level_ = 0;
            this.bitField0_ &= -257;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2S_NotifyBattle_4723_descriptor;
         }

         public S2S_NotifyBattle_4723 getDefaultInstanceForType() {
            return FairylandMsg.S2S_NotifyBattle_4723.getDefaultInstance();
         }

         public S2S_NotifyBattle_4723 build() {
            S2S_NotifyBattle_4723 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_NotifyBattle_4723 buildPartial() {
            S2S_NotifyBattle_4723 result = new S2S_NotifyBattle_4723(this);
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
               result.head_ = this.head_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.time_ = this.time_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.point_ = this.point_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.isWin_ = this.isWin_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.level_ = this.level_;
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
            if (other instanceof S2S_NotifyBattle_4723) {
               return this.mergeFrom((S2S_NotifyBattle_4723)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_NotifyBattle_4723 other) {
            if (other == FairylandMsg.S2S_NotifyBattle_4723.getDefaultInstance()) {
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

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               if (other.hasTime()) {
                  this.setTime(other.getTime());
               }

               if (other.hasPoint()) {
                  this.setPoint(other.getPoint());
               }

               if (other.hasIsWin()) {
                  this.setIsWin(other.getIsWin());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
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
            } else if (!this.hasHead()) {
               return false;
            } else if (!this.hasHeadFrame()) {
               return false;
            } else if (!this.hasTime()) {
               return false;
            } else if (!this.hasPoint()) {
               return false;
            } else if (!this.hasIsWin()) {
               return false;
            } else {
               return this.hasLevel();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_NotifyBattle_4723 parsedMessage = null;

            try {
               parsedMessage = (S2S_NotifyBattle_4723)FairylandMsg.S2S_NotifyBattle_4723.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_NotifyBattle_4723)e.getUnfinishedMessage();
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
            this.playerName_ = FairylandMsg.S2S_NotifyBattle_4723.getDefaultInstance().getPlayerName();
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

         public boolean hasHeadFrame() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getHeadFrame() {
            return this.headFrame_;
         }

         public Builder setHeadFrame(int value) {
            this.bitField0_ |= 16;
            this.headFrame_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadFrame() {
            this.bitField0_ &= -17;
            this.headFrame_ = 0;
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

         public boolean hasPoint() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getPoint() {
            return this.point_;
         }

         public Builder setPoint(int value) {
            this.bitField0_ |= 64;
            this.point_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPoint() {
            this.bitField0_ &= -65;
            this.point_ = 0;
            this.onChanged();
            return this;
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_BattleRecord_4724 extends GeneratedMessageV3 implements C2S_BattleRecord_4724OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_BattleRecord_4724 DEFAULT_INSTANCE = new C2S_BattleRecord_4724();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BattleRecord_4724> PARSER = new AbstractParser<C2S_BattleRecord_4724>() {
         public C2S_BattleRecord_4724 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BattleRecord_4724(input, extensionRegistry);
         }
      };

      private C2S_BattleRecord_4724(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BattleRecord_4724() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BattleRecord_4724();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BattleRecord_4724(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_BattleRecord_4724_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_BattleRecord_4724_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleRecord_4724.class, Builder.class);
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
         } else if (!(obj instanceof C2S_BattleRecord_4724)) {
            return super.equals(obj);
         } else {
            C2S_BattleRecord_4724 other = (C2S_BattleRecord_4724)obj;
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

      public static C2S_BattleRecord_4724 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BattleRecord_4724)PARSER.parseFrom(data);
      }

      public static C2S_BattleRecord_4724 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleRecord_4724)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleRecord_4724 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BattleRecord_4724)PARSER.parseFrom(data);
      }

      public static C2S_BattleRecord_4724 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleRecord_4724)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleRecord_4724 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BattleRecord_4724)PARSER.parseFrom(data);
      }

      public static C2S_BattleRecord_4724 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleRecord_4724)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleRecord_4724 parseFrom(InputStream input) throws IOException {
         return (C2S_BattleRecord_4724)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleRecord_4724 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleRecord_4724)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleRecord_4724 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BattleRecord_4724)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BattleRecord_4724 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleRecord_4724)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleRecord_4724 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BattleRecord_4724)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleRecord_4724 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleRecord_4724)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BattleRecord_4724 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BattleRecord_4724 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BattleRecord_4724> parser() {
         return PARSER;
      }

      public Parser<C2S_BattleRecord_4724> getParserForType() {
         return PARSER;
      }

      public C2S_BattleRecord_4724 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BattleRecord_4724OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_BattleRecord_4724_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_BattleRecord_4724_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleRecord_4724.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.C2S_BattleRecord_4724.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_BattleRecord_4724_descriptor;
         }

         public C2S_BattleRecord_4724 getDefaultInstanceForType() {
            return FairylandMsg.C2S_BattleRecord_4724.getDefaultInstance();
         }

         public C2S_BattleRecord_4724 build() {
            C2S_BattleRecord_4724 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BattleRecord_4724 buildPartial() {
            C2S_BattleRecord_4724 result = new C2S_BattleRecord_4724(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_BattleRecord_4724) {
               return this.mergeFrom((C2S_BattleRecord_4724)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BattleRecord_4724 other) {
            if (other == FairylandMsg.C2S_BattleRecord_4724.getDefaultInstance()) {
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
            C2S_BattleRecord_4724 parsedMessage = null;

            try {
               parsedMessage = (C2S_BattleRecord_4724)FairylandMsg.C2S_BattleRecord_4724.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BattleRecord_4724)e.getUnfinishedMessage();
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

   public static final class S2C_BattleRecord_4725 extends GeneratedMessageV3 implements S2C_BattleRecord_4725OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECORDS_FIELD_NUMBER = 1;
      private List<RecordData> records_;
      private byte memoizedIsInitialized;
      private static final S2C_BattleRecord_4725 DEFAULT_INSTANCE = new S2C_BattleRecord_4725();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BattleRecord_4725> PARSER = new AbstractParser<S2C_BattleRecord_4725>() {
         public S2C_BattleRecord_4725 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BattleRecord_4725(input, extensionRegistry);
         }
      };

      private S2C_BattleRecord_4725(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BattleRecord_4725() {
         this.memoizedIsInitialized = -1;
         this.records_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BattleRecord_4725();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BattleRecord_4725(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.records_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.records_.add(input.readMessage(FairylandMsg.RecordData.PARSER, extensionRegistry));
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
                  this.records_ = Collections.unmodifiableList(this.records_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_BattleRecord_4725_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_BattleRecord_4725_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleRecord_4725.class, Builder.class);
      }

      public List<RecordData> getRecordsList() {
         return this.records_;
      }

      public List<? extends RecordDataOrBuilder> getRecordsOrBuilderList() {
         return this.records_;
      }

      public int getRecordsCount() {
         return this.records_.size();
      }

      public RecordData getRecords(int index) {
         return (RecordData)this.records_.get(index);
      }

      public RecordDataOrBuilder getRecordsOrBuilder(int index) {
         return (RecordDataOrBuilder)this.records_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
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
         for(int i = 0; i < this.records_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.records_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.records_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.records_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BattleRecord_4725)) {
            return super.equals(obj);
         } else {
            S2C_BattleRecord_4725 other = (S2C_BattleRecord_4725)obj;
            if (!this.getRecordsList().equals(other.getRecordsList())) {
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
            if (this.getRecordsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecordsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BattleRecord_4725 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BattleRecord_4725)PARSER.parseFrom(data);
      }

      public static S2C_BattleRecord_4725 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleRecord_4725)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleRecord_4725 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BattleRecord_4725)PARSER.parseFrom(data);
      }

      public static S2C_BattleRecord_4725 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleRecord_4725)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleRecord_4725 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BattleRecord_4725)PARSER.parseFrom(data);
      }

      public static S2C_BattleRecord_4725 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleRecord_4725)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleRecord_4725 parseFrom(InputStream input) throws IOException {
         return (S2C_BattleRecord_4725)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleRecord_4725 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleRecord_4725)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleRecord_4725 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BattleRecord_4725)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BattleRecord_4725 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleRecord_4725)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleRecord_4725 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BattleRecord_4725)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleRecord_4725 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleRecord_4725)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BattleRecord_4725 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BattleRecord_4725 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BattleRecord_4725> parser() {
         return PARSER;
      }

      public Parser<S2C_BattleRecord_4725> getParserForType() {
         return PARSER;
      }

      public S2C_BattleRecord_4725 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BattleRecord_4725OrBuilder {
         private int bitField0_;
         private List<RecordData> records_;
         private RepeatedFieldBuilderV3<RecordData, RecordData.Builder, RecordDataOrBuilder> recordsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_BattleRecord_4725_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_BattleRecord_4725_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleRecord_4725.class, Builder.class);
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
            if (FairylandMsg.S2C_BattleRecord_4725.alwaysUseFieldBuilders) {
               this.getRecordsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.recordsBuilder_ == null) {
               this.records_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.recordsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_BattleRecord_4725_descriptor;
         }

         public S2C_BattleRecord_4725 getDefaultInstanceForType() {
            return FairylandMsg.S2C_BattleRecord_4725.getDefaultInstance();
         }

         public S2C_BattleRecord_4725 build() {
            S2C_BattleRecord_4725 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BattleRecord_4725 buildPartial() {
            S2C_BattleRecord_4725 result = new S2C_BattleRecord_4725(this);
            int from_bitField0_ = this.bitField0_;
            if (this.recordsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.records_ = Collections.unmodifiableList(this.records_);
                  this.bitField0_ &= -2;
               }

               result.records_ = this.records_;
            } else {
               result.records_ = this.recordsBuilder_.build();
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
            if (other instanceof S2C_BattleRecord_4725) {
               return this.mergeFrom((S2C_BattleRecord_4725)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BattleRecord_4725 other) {
            if (other == FairylandMsg.S2C_BattleRecord_4725.getDefaultInstance()) {
               return this;
            } else {
               if (this.recordsBuilder_ == null) {
                  if (!other.records_.isEmpty()) {
                     if (this.records_.isEmpty()) {
                        this.records_ = other.records_;
                        this.bitField0_ &= -2;
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
                     this.bitField0_ &= -2;
                     this.recordsBuilder_ = FairylandMsg.S2C_BattleRecord_4725.alwaysUseFieldBuilders ? this.getRecordsFieldBuilder() : null;
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
            for(int i = 0; i < this.getRecordsCount(); ++i) {
               if (!this.getRecords(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BattleRecord_4725 parsedMessage = null;

            try {
               parsedMessage = (S2C_BattleRecord_4725)FairylandMsg.S2C_BattleRecord_4725.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BattleRecord_4725)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRecordsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.records_ = new ArrayList(this.records_);
               this.bitField0_ |= 1;
            }

         }

         public List<RecordData> getRecordsList() {
            return this.recordsBuilder_ == null ? Collections.unmodifiableList(this.records_) : this.recordsBuilder_.getMessageList();
         }

         public int getRecordsCount() {
            return this.recordsBuilder_ == null ? this.records_.size() : this.recordsBuilder_.getCount();
         }

         public RecordData getRecords(int index) {
            return this.recordsBuilder_ == null ? (RecordData)this.records_.get(index) : (RecordData)this.recordsBuilder_.getMessage(index);
         }

         public Builder setRecords(int index, RecordData value) {
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

         public Builder setRecords(int index, RecordData.Builder builderForValue) {
            if (this.recordsBuilder_ == null) {
               this.ensureRecordsIsMutable();
               this.records_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRecords(RecordData value) {
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

         public Builder addRecords(int index, RecordData value) {
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

         public Builder addRecords(RecordData.Builder builderForValue) {
            if (this.recordsBuilder_ == null) {
               this.ensureRecordsIsMutable();
               this.records_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.recordsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRecords(int index, RecordData.Builder builderForValue) {
            if (this.recordsBuilder_ == null) {
               this.ensureRecordsIsMutable();
               this.records_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecords(Iterable<? extends RecordData> values) {
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
               this.bitField0_ &= -2;
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

         public RecordData.Builder getRecordsBuilder(int index) {
            return (RecordData.Builder)this.getRecordsFieldBuilder().getBuilder(index);
         }

         public RecordDataOrBuilder getRecordsOrBuilder(int index) {
            return this.recordsBuilder_ == null ? (RecordDataOrBuilder)this.records_.get(index) : (RecordDataOrBuilder)this.recordsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RecordDataOrBuilder> getRecordsOrBuilderList() {
            return this.recordsBuilder_ != null ? this.recordsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.records_);
         }

         public RecordData.Builder addRecordsBuilder() {
            return (RecordData.Builder)this.getRecordsFieldBuilder().addBuilder(FairylandMsg.RecordData.getDefaultInstance());
         }

         public RecordData.Builder addRecordsBuilder(int index) {
            return (RecordData.Builder)this.getRecordsFieldBuilder().addBuilder(index, FairylandMsg.RecordData.getDefaultInstance());
         }

         public List<RecordData.Builder> getRecordsBuilderList() {
            return this.getRecordsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RecordData, RecordData.Builder, RecordDataOrBuilder> getRecordsFieldBuilder() {
            if (this.recordsBuilder_ == null) {
               this.recordsBuilder_ = new RepeatedFieldBuilderV3(this.records_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class RecordData extends GeneratedMessageV3 implements RecordDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECORDID_FIELD_NUMBER = 1;
      private int recordId_;
      public static final int SERVERID_FIELD_NUMBER = 2;
      private int serverId_;
      public static final int PLAYERID_FIELD_NUMBER = 3;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 4;
      private volatile Object playerName_;
      public static final int HEAD_FIELD_NUMBER = 5;
      private int head_;
      public static final int HEADFRAME_FIELD_NUMBER = 6;
      private int headFrame_;
      public static final int STAGEID_FIELD_NUMBER = 7;
      private int stageId_;
      public static final int TIME_FIELD_NUMBER = 8;
      private int time_;
      public static final int POINT_FIELD_NUMBER = 9;
      private int point_;
      public static final int ISWIN_FIELD_NUMBER = 10;
      private boolean isWin_;
      public static final int END_FIELD_NUMBER = 11;
      private boolean end_;
      public static final int LEVEL_FIELD_NUMBER = 12;
      private int level_;
      private byte memoizedIsInitialized;
      private static final RecordData DEFAULT_INSTANCE = new RecordData();
      /** @deprecated */
      @Deprecated
      public static final Parser<RecordData> PARSER = new AbstractParser<RecordData>() {
         public RecordData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RecordData(input, extensionRegistry);
         }
      };

      private RecordData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RecordData() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RecordData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RecordData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.serverId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.playerId_ = input.readInt32();
                        break;
                     case 34:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 8;
                        this.playerName_ = bs;
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.head_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.headFrame_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.stageId_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.time_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.point_ = input.readInt32();
                        break;
                     case 80:
                        this.bitField0_ |= 512;
                        this.isWin_ = input.readBool();
                        break;
                     case 88:
                        this.bitField0_ |= 1024;
                        this.end_ = input.readBool();
                        break;
                     case 96:
                        this.bitField0_ |= 2048;
                        this.level_ = input.readInt32();
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_RecordData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_RecordData_fieldAccessorTable.ensureFieldAccessorsInitialized(RecordData.class, Builder.class);
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRecordId() {
         return this.recordId_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
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

      public boolean hasHead() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public boolean hasStageId() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getStageId() {
         return this.stageId_;
      }

      public boolean hasTime() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getTime() {
         return this.time_;
      }

      public boolean hasPoint() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getPoint() {
         return this.point_;
      }

      public boolean hasIsWin() {
         return (this.bitField0_ & 512) != 0;
      }

      public boolean getIsWin() {
         return this.isWin_;
      }

      public boolean hasEnd() {
         return (this.bitField0_ & 1024) != 0;
      }

      public boolean getEnd() {
         return this.end_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 2048) != 0;
      }

      public int getLevel() {
         return this.level_;
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
         } else if (!this.hasServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeadFrame()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStageId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsWin()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEnd()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.recordId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.serverId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.playerId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            GeneratedMessageV3.writeString(output, 4, this.playerName_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.head_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.headFrame_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.stageId_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.time_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.point_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeBool(10, this.isWin_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            output.writeBool(11, this.end_);
         }

         if ((this.bitField0_ & 2048) != 0) {
            output.writeInt32(12, this.level_);
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
               size += CodedOutputStream.computeInt32Size(2, this.serverId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.playerId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += GeneratedMessageV3.computeStringSize(4, this.playerName_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.head_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.headFrame_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.stageId_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.time_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.point_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeBoolSize(10, this.isWin_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += CodedOutputStream.computeBoolSize(11, this.end_);
            }

            if ((this.bitField0_ & 2048) != 0) {
               size += CodedOutputStream.computeInt32Size(12, this.level_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RecordData)) {
            return super.equals(obj);
         } else {
            RecordData other = (RecordData)obj;
            if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
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
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
               return false;
            } else if (this.hasStageId() != other.hasStageId()) {
               return false;
            } else if (this.hasStageId() && this.getStageId() != other.getStageId()) {
               return false;
            } else if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
               return false;
            } else if (this.hasPoint() != other.hasPoint()) {
               return false;
            } else if (this.hasPoint() && this.getPoint() != other.getPoint()) {
               return false;
            } else if (this.hasIsWin() != other.hasIsWin()) {
               return false;
            } else if (this.hasIsWin() && this.getIsWin() != other.getIsWin()) {
               return false;
            } else if (this.hasEnd() != other.hasEnd()) {
               return false;
            } else if (this.hasEnd() && this.getEnd() != other.getEnd()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
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

            if (this.hasServerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasHead()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasStageId()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getStageId();
            }

            if (this.hasTime()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getTime();
            }

            if (this.hasPoint()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getPoint();
            }

            if (this.hasIsWin()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + Internal.hashBoolean(this.getIsWin());
            }

            if (this.hasEnd()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + Internal.hashBoolean(this.getEnd());
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getLevel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RecordData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RecordData)PARSER.parseFrom(data);
      }

      public static RecordData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecordData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RecordData)PARSER.parseFrom(data);
      }

      public static RecordData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecordData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RecordData)PARSER.parseFrom(data);
      }

      public static RecordData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecordData parseFrom(InputStream input) throws IOException {
         return (RecordData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RecordData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecordData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RecordData parseDelimitedFrom(InputStream input) throws IOException {
         return (RecordData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RecordData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecordData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RecordData parseFrom(CodedInputStream input) throws IOException {
         return (RecordData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RecordData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecordData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RecordData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RecordData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RecordData> parser() {
         return PARSER;
      }

      public Parser<RecordData> getParserForType() {
         return PARSER;
      }

      public RecordData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RecordDataOrBuilder {
         private int bitField0_;
         private int recordId_;
         private int serverId_;
         private int playerId_;
         private Object playerName_;
         private int head_;
         private int headFrame_;
         private int stageId_;
         private int time_;
         private int point_;
         private boolean isWin_;
         private boolean end_;
         private int level_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_RecordData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_RecordData_fieldAccessorTable.ensureFieldAccessorsInitialized(RecordData.class, Builder.class);
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
            if (FairylandMsg.RecordData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.recordId_ = 0;
            this.bitField0_ &= -2;
            this.serverId_ = 0;
            this.bitField0_ &= -3;
            this.playerId_ = 0;
            this.bitField0_ &= -5;
            this.playerName_ = "";
            this.bitField0_ &= -9;
            this.head_ = 0;
            this.bitField0_ &= -17;
            this.headFrame_ = 0;
            this.bitField0_ &= -33;
            this.stageId_ = 0;
            this.bitField0_ &= -65;
            this.time_ = 0;
            this.bitField0_ &= -129;
            this.point_ = 0;
            this.bitField0_ &= -257;
            this.isWin_ = false;
            this.bitField0_ &= -513;
            this.end_ = false;
            this.bitField0_ &= -1025;
            this.level_ = 0;
            this.bitField0_ &= -2049;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_RecordData_descriptor;
         }

         public RecordData getDefaultInstanceForType() {
            return FairylandMsg.RecordData.getDefaultInstance();
         }

         public RecordData build() {
            RecordData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RecordData buildPartial() {
            RecordData result = new RecordData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.recordId_ = this.recordId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 16) != 0) {
               result.head_ = this.head_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.stageId_ = this.stageId_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.time_ = this.time_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.point_ = this.point_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.isWin_ = this.isWin_;
               to_bitField0_ |= 512;
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.end_ = this.end_;
               to_bitField0_ |= 1024;
            }

            if ((from_bitField0_ & 2048) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 2048;
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
            if (other instanceof RecordData) {
               return this.mergeFrom((RecordData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RecordData other) {
            if (other == FairylandMsg.RecordData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 8;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               if (other.hasStageId()) {
                  this.setStageId(other.getStageId());
               }

               if (other.hasTime()) {
                  this.setTime(other.getTime());
               }

               if (other.hasPoint()) {
                  this.setPoint(other.getPoint());
               }

               if (other.hasIsWin()) {
                  this.setIsWin(other.getIsWin());
               }

               if (other.hasEnd()) {
                  this.setEnd(other.getEnd());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRecordId()) {
               return false;
            } else if (!this.hasServerId()) {
               return false;
            } else if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasHead()) {
               return false;
            } else if (!this.hasHeadFrame()) {
               return false;
            } else if (!this.hasStageId()) {
               return false;
            } else if (!this.hasTime()) {
               return false;
            } else if (!this.hasPoint()) {
               return false;
            } else if (!this.hasIsWin()) {
               return false;
            } else if (!this.hasEnd()) {
               return false;
            } else {
               return this.hasLevel();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RecordData parsedMessage = null;

            try {
               parsedMessage = (RecordData)FairylandMsg.RecordData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RecordData)e.getUnfinishedMessage();
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

         public boolean hasServerId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 2;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -3;
            this.serverId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getPlayerId() {
            return this.playerId_;
         }

         public Builder setPlayerId(int value) {
            this.bitField0_ |= 4;
            this.playerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.bitField0_ &= -5;
            this.playerId_ = 0;
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
            this.playerName_ = FairylandMsg.RecordData.getDefaultInstance().getPlayerName();
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

         public boolean hasHead() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getHead() {
            return this.head_;
         }

         public Builder setHead(int value) {
            this.bitField0_ |= 16;
            this.head_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHead() {
            this.bitField0_ &= -17;
            this.head_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeadFrame() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getHeadFrame() {
            return this.headFrame_;
         }

         public Builder setHeadFrame(int value) {
            this.bitField0_ |= 32;
            this.headFrame_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadFrame() {
            this.bitField0_ &= -33;
            this.headFrame_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStageId() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getStageId() {
            return this.stageId_;
         }

         public Builder setStageId(int value) {
            this.bitField0_ |= 64;
            this.stageId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageId() {
            this.bitField0_ &= -65;
            this.stageId_ = 0;
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

         public boolean hasPoint() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getPoint() {
            return this.point_;
         }

         public Builder setPoint(int value) {
            this.bitField0_ |= 256;
            this.point_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPoint() {
            this.bitField0_ &= -257;
            this.point_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsWin() {
            return (this.bitField0_ & 512) != 0;
         }

         public boolean getIsWin() {
            return this.isWin_;
         }

         public Builder setIsWin(boolean value) {
            this.bitField0_ |= 512;
            this.isWin_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsWin() {
            this.bitField0_ &= -513;
            this.isWin_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasEnd() {
            return (this.bitField0_ & 1024) != 0;
         }

         public boolean getEnd() {
            return this.end_;
         }

         public Builder setEnd(boolean value) {
            this.bitField0_ |= 1024;
            this.end_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEnd() {
            this.bitField0_ &= -1025;
            this.end_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 2048) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 2048;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -2049;
            this.level_ = 0;
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

   public static final class C2S_ReceiveRecordAward_4726 extends GeneratedMessageV3 implements C2S_ReceiveRecordAward_4726OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECORDID_FIELD_NUMBER = 1;
      private int recordId_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveRecordAward_4726 DEFAULT_INSTANCE = new C2S_ReceiveRecordAward_4726();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveRecordAward_4726> PARSER = new AbstractParser<C2S_ReceiveRecordAward_4726>() {
         public C2S_ReceiveRecordAward_4726 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveRecordAward_4726(input, extensionRegistry);
         }
      };

      private C2S_ReceiveRecordAward_4726(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveRecordAward_4726() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveRecordAward_4726();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveRecordAward_4726(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveRecordAward_4726_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveRecordAward_4726_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveRecordAward_4726.class, Builder.class);
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRecordId() {
         return this.recordId_;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.recordId_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ReceiveRecordAward_4726)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveRecordAward_4726 other = (C2S_ReceiveRecordAward_4726)obj;
            if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ReceiveRecordAward_4726 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveRecordAward_4726)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveRecordAward_4726 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveRecordAward_4726)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveRecordAward_4726 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveRecordAward_4726)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveRecordAward_4726 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveRecordAward_4726)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveRecordAward_4726 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveRecordAward_4726)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveRecordAward_4726 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveRecordAward_4726)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveRecordAward_4726 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveRecordAward_4726)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveRecordAward_4726 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveRecordAward_4726)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveRecordAward_4726 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveRecordAward_4726)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveRecordAward_4726 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveRecordAward_4726)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveRecordAward_4726 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveRecordAward_4726)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveRecordAward_4726 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveRecordAward_4726)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveRecordAward_4726 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveRecordAward_4726 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveRecordAward_4726> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveRecordAward_4726> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveRecordAward_4726 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveRecordAward_4726OrBuilder {
         private int bitField0_;
         private int recordId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveRecordAward_4726_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveRecordAward_4726_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveRecordAward_4726.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.C2S_ReceiveRecordAward_4726.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.recordId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_ReceiveRecordAward_4726_descriptor;
         }

         public C2S_ReceiveRecordAward_4726 getDefaultInstanceForType() {
            return FairylandMsg.C2S_ReceiveRecordAward_4726.getDefaultInstance();
         }

         public C2S_ReceiveRecordAward_4726 build() {
            C2S_ReceiveRecordAward_4726 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveRecordAward_4726 buildPartial() {
            C2S_ReceiveRecordAward_4726 result = new C2S_ReceiveRecordAward_4726(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.recordId_ = this.recordId_;
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
            if (other instanceof C2S_ReceiveRecordAward_4726) {
               return this.mergeFrom((C2S_ReceiveRecordAward_4726)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveRecordAward_4726 other) {
            if (other == FairylandMsg.C2S_ReceiveRecordAward_4726.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRecordId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ReceiveRecordAward_4726 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveRecordAward_4726)FairylandMsg.C2S_ReceiveRecordAward_4726.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveRecordAward_4726)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_ReceiveRecordAward_4727 extends GeneratedMessageV3 implements S2C_ReceiveRecordAward_4727OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECORDID_FIELD_NUMBER = 1;
      private int recordId_;
      private byte memoizedIsInitialized;
      private static final S2C_ReceiveRecordAward_4727 DEFAULT_INSTANCE = new S2C_ReceiveRecordAward_4727();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ReceiveRecordAward_4727> PARSER = new AbstractParser<S2C_ReceiveRecordAward_4727>() {
         public S2C_ReceiveRecordAward_4727 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ReceiveRecordAward_4727(input, extensionRegistry);
         }
      };

      private S2C_ReceiveRecordAward_4727(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ReceiveRecordAward_4727() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ReceiveRecordAward_4727();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ReceiveRecordAward_4727(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveRecordAward_4727_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveRecordAward_4727_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveRecordAward_4727.class, Builder.class);
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRecordId() {
         return this.recordId_;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.recordId_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ReceiveRecordAward_4727)) {
            return super.equals(obj);
         } else {
            S2C_ReceiveRecordAward_4727 other = (S2C_ReceiveRecordAward_4727)obj;
            if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ReceiveRecordAward_4727 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveRecordAward_4727)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveRecordAward_4727 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveRecordAward_4727)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveRecordAward_4727 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveRecordAward_4727)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveRecordAward_4727 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveRecordAward_4727)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveRecordAward_4727 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveRecordAward_4727)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveRecordAward_4727 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveRecordAward_4727)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveRecordAward_4727 parseFrom(InputStream input) throws IOException {
         return (S2C_ReceiveRecordAward_4727)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveRecordAward_4727 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveRecordAward_4727)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveRecordAward_4727 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ReceiveRecordAward_4727)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ReceiveRecordAward_4727 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveRecordAward_4727)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveRecordAward_4727 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ReceiveRecordAward_4727)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveRecordAward_4727 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveRecordAward_4727)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ReceiveRecordAward_4727 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ReceiveRecordAward_4727 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ReceiveRecordAward_4727> parser() {
         return PARSER;
      }

      public Parser<S2C_ReceiveRecordAward_4727> getParserForType() {
         return PARSER;
      }

      public S2C_ReceiveRecordAward_4727 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ReceiveRecordAward_4727OrBuilder {
         private int bitField0_;
         private int recordId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveRecordAward_4727_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveRecordAward_4727_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveRecordAward_4727.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.S2C_ReceiveRecordAward_4727.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.recordId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_ReceiveRecordAward_4727_descriptor;
         }

         public S2C_ReceiveRecordAward_4727 getDefaultInstanceForType() {
            return FairylandMsg.S2C_ReceiveRecordAward_4727.getDefaultInstance();
         }

         public S2C_ReceiveRecordAward_4727 build() {
            S2C_ReceiveRecordAward_4727 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ReceiveRecordAward_4727 buildPartial() {
            S2C_ReceiveRecordAward_4727 result = new S2C_ReceiveRecordAward_4727(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.recordId_ = this.recordId_;
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
            if (other instanceof S2C_ReceiveRecordAward_4727) {
               return this.mergeFrom((S2C_ReceiveRecordAward_4727)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ReceiveRecordAward_4727 other) {
            if (other == FairylandMsg.S2C_ReceiveRecordAward_4727.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRecordId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ReceiveRecordAward_4727 parsedMessage = null;

            try {
               parsedMessage = (S2C_ReceiveRecordAward_4727)FairylandMsg.S2C_ReceiveRecordAward_4727.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ReceiveRecordAward_4727)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_FairylandGuanJia_4728 extends GeneratedMessageV3 implements C2S_FairylandGuanJia_4728OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DEGREETYPE_FIELD_NUMBER = 1;
      private int degreeType_;
      public static final int ISSPECIAL_FIELD_NUMBER = 2;
      private boolean isSpecial_;
      public static final int HEROPOWER_FIELD_NUMBER = 3;
      private int heroPower_;
      public static final int ARRAYING_FIELD_NUMBER = 4;
      private ByteString arraying_;
      public static final int MAXPOWER_FIELD_NUMBER = 5;
      private long maxPower_;
      public static final int STAGEID_FIELD_NUMBER = 6;
      private int stageId_;
      public static final int TICKETNUM_FIELD_NUMBER = 7;
      private int ticketNum_;
      public static final int ISSWEEP_FIELD_NUMBER = 8;
      private boolean isSweep_;
      public static final int NUM_FIELD_NUMBER = 9;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_FairylandGuanJia_4728 DEFAULT_INSTANCE = new C2S_FairylandGuanJia_4728();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FairylandGuanJia_4728> PARSER = new AbstractParser<C2S_FairylandGuanJia_4728>() {
         public C2S_FairylandGuanJia_4728 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FairylandGuanJia_4728(input, extensionRegistry);
         }
      };

      private C2S_FairylandGuanJia_4728(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FairylandGuanJia_4728() {
         this.memoizedIsInitialized = -1;
         this.arraying_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FairylandGuanJia_4728();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FairylandGuanJia_4728(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.degreeType_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.isSpecial_ = input.readBool();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.heroPower_ = input.readInt32();
                        break;
                     case 34:
                        this.bitField0_ |= 8;
                        this.arraying_ = input.readBytes();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.maxPower_ = input.readInt64();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.stageId_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.ticketNum_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.isSweep_ = input.readBool();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandGuanJia_4728_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandGuanJia_4728_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FairylandGuanJia_4728.class, Builder.class);
      }

      public boolean hasDegreeType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDegreeType() {
         return this.degreeType_;
      }

      public boolean hasIsSpecial() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsSpecial() {
         return this.isSpecial_;
      }

      public boolean hasHeroPower() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHeroPower() {
         return this.heroPower_;
      }

      public boolean hasArraying() {
         return (this.bitField0_ & 8) != 0;
      }

      public ByteString getArraying() {
         return this.arraying_;
      }

      public boolean hasMaxPower() {
         return (this.bitField0_ & 16) != 0;
      }

      public long getMaxPower() {
         return this.maxPower_;
      }

      public boolean hasStageId() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getStageId() {
         return this.stageId_;
      }

      public boolean hasTicketNum() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getTicketNum() {
         return this.ticketNum_;
      }

      public boolean hasIsSweep() {
         return (this.bitField0_ & 128) != 0;
      }

      public boolean getIsSweep() {
         return this.isSweep_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 256) != 0;
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
         } else if (!this.hasDegreeType()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.degreeType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.isSpecial_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.heroPower_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBytes(4, this.arraying_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt64(5, this.maxPower_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.stageId_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.ticketNum_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeBool(8, this.isSweep_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.num_);
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
               size += CodedOutputStream.computeInt32Size(1, this.degreeType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.isSpecial_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.heroPower_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBytesSize(4, this.arraying_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt64Size(5, this.maxPower_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.stageId_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.ticketNum_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeBoolSize(8, this.isSweep_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.num_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FairylandGuanJia_4728)) {
            return super.equals(obj);
         } else {
            C2S_FairylandGuanJia_4728 other = (C2S_FairylandGuanJia_4728)obj;
            if (this.hasDegreeType() != other.hasDegreeType()) {
               return false;
            } else if (this.hasDegreeType() && this.getDegreeType() != other.getDegreeType()) {
               return false;
            } else if (this.hasIsSpecial() != other.hasIsSpecial()) {
               return false;
            } else if (this.hasIsSpecial() && this.getIsSpecial() != other.getIsSpecial()) {
               return false;
            } else if (this.hasHeroPower() != other.hasHeroPower()) {
               return false;
            } else if (this.hasHeroPower() && this.getHeroPower() != other.getHeroPower()) {
               return false;
            } else if (this.hasArraying() != other.hasArraying()) {
               return false;
            } else if (this.hasArraying() && !this.getArraying().equals(other.getArraying())) {
               return false;
            } else if (this.hasMaxPower() != other.hasMaxPower()) {
               return false;
            } else if (this.hasMaxPower() && this.getMaxPower() != other.getMaxPower()) {
               return false;
            } else if (this.hasStageId() != other.hasStageId()) {
               return false;
            } else if (this.hasStageId() && this.getStageId() != other.getStageId()) {
               return false;
            } else if (this.hasTicketNum() != other.hasTicketNum()) {
               return false;
            } else if (this.hasTicketNum() && this.getTicketNum() != other.getTicketNum()) {
               return false;
            } else if (this.hasIsSweep() != other.hasIsSweep()) {
               return false;
            } else if (this.hasIsSweep() && this.getIsSweep() != other.getIsSweep()) {
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
            if (this.hasDegreeType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDegreeType();
            }

            if (this.hasIsSpecial()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsSpecial());
            }

            if (this.hasHeroPower()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHeroPower();
            }

            if (this.hasArraying()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getArraying().hashCode();
            }

            if (this.hasMaxPower()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashLong(this.getMaxPower());
            }

            if (this.hasStageId()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getStageId();
            }

            if (this.hasTicketNum()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getTicketNum();
            }

            if (this.hasIsSweep()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + Internal.hashBoolean(this.getIsSweep());
            }

            if (this.hasNum()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FairylandGuanJia_4728 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FairylandGuanJia_4728)PARSER.parseFrom(data);
      }

      public static C2S_FairylandGuanJia_4728 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FairylandGuanJia_4728)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FairylandGuanJia_4728 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FairylandGuanJia_4728)PARSER.parseFrom(data);
      }

      public static C2S_FairylandGuanJia_4728 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FairylandGuanJia_4728)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FairylandGuanJia_4728 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FairylandGuanJia_4728)PARSER.parseFrom(data);
      }

      public static C2S_FairylandGuanJia_4728 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FairylandGuanJia_4728)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FairylandGuanJia_4728 parseFrom(InputStream input) throws IOException {
         return (C2S_FairylandGuanJia_4728)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FairylandGuanJia_4728 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FairylandGuanJia_4728)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FairylandGuanJia_4728 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FairylandGuanJia_4728)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FairylandGuanJia_4728 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FairylandGuanJia_4728)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FairylandGuanJia_4728 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FairylandGuanJia_4728)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FairylandGuanJia_4728 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FairylandGuanJia_4728)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FairylandGuanJia_4728 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FairylandGuanJia_4728 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FairylandGuanJia_4728> parser() {
         return PARSER;
      }

      public Parser<C2S_FairylandGuanJia_4728> getParserForType() {
         return PARSER;
      }

      public C2S_FairylandGuanJia_4728 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FairylandGuanJia_4728OrBuilder {
         private int bitField0_;
         private int degreeType_;
         private boolean isSpecial_;
         private int heroPower_;
         private ByteString arraying_;
         private long maxPower_;
         private int stageId_;
         private int ticketNum_;
         private boolean isSweep_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandGuanJia_4728_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandGuanJia_4728_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FairylandGuanJia_4728.class, Builder.class);
         }

         private Builder() {
            this.arraying_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.arraying_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.C2S_FairylandGuanJia_4728.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.degreeType_ = 0;
            this.bitField0_ &= -2;
            this.isSpecial_ = false;
            this.bitField0_ &= -3;
            this.heroPower_ = 0;
            this.bitField0_ &= -5;
            this.arraying_ = ByteString.EMPTY;
            this.bitField0_ &= -9;
            this.maxPower_ = 0L;
            this.bitField0_ &= -17;
            this.stageId_ = 0;
            this.bitField0_ &= -33;
            this.ticketNum_ = 0;
            this.bitField0_ &= -65;
            this.isSweep_ = false;
            this.bitField0_ &= -129;
            this.num_ = 0;
            this.bitField0_ &= -257;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_C2S_FairylandGuanJia_4728_descriptor;
         }

         public C2S_FairylandGuanJia_4728 getDefaultInstanceForType() {
            return FairylandMsg.C2S_FairylandGuanJia_4728.getDefaultInstance();
         }

         public C2S_FairylandGuanJia_4728 build() {
            C2S_FairylandGuanJia_4728 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FairylandGuanJia_4728 buildPartial() {
            C2S_FairylandGuanJia_4728 result = new C2S_FairylandGuanJia_4728(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.degreeType_ = this.degreeType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isSpecial_ = this.isSpecial_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.heroPower_ = this.heroPower_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.arraying_ = this.arraying_;
            if ((from_bitField0_ & 16) != 0) {
               result.maxPower_ = this.maxPower_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.stageId_ = this.stageId_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.ticketNum_ = this.ticketNum_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.isSweep_ = this.isSweep_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.num_ = this.num_;
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
            if (other instanceof C2S_FairylandGuanJia_4728) {
               return this.mergeFrom((C2S_FairylandGuanJia_4728)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FairylandGuanJia_4728 other) {
            if (other == FairylandMsg.C2S_FairylandGuanJia_4728.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDegreeType()) {
                  this.setDegreeType(other.getDegreeType());
               }

               if (other.hasIsSpecial()) {
                  this.setIsSpecial(other.getIsSpecial());
               }

               if (other.hasHeroPower()) {
                  this.setHeroPower(other.getHeroPower());
               }

               if (other.hasArraying()) {
                  this.setArraying(other.getArraying());
               }

               if (other.hasMaxPower()) {
                  this.setMaxPower(other.getMaxPower());
               }

               if (other.hasStageId()) {
                  this.setStageId(other.getStageId());
               }

               if (other.hasTicketNum()) {
                  this.setTicketNum(other.getTicketNum());
               }

               if (other.hasIsSweep()) {
                  this.setIsSweep(other.getIsSweep());
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
            if (!this.hasDegreeType()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_FairylandGuanJia_4728 parsedMessage = null;

            try {
               parsedMessage = (C2S_FairylandGuanJia_4728)FairylandMsg.C2S_FairylandGuanJia_4728.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FairylandGuanJia_4728)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDegreeType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDegreeType() {
            return this.degreeType_;
         }

         public Builder setDegreeType(int value) {
            this.bitField0_ |= 1;
            this.degreeType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDegreeType() {
            this.bitField0_ &= -2;
            this.degreeType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsSpecial() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsSpecial() {
            return this.isSpecial_;
         }

         public Builder setIsSpecial(boolean value) {
            this.bitField0_ |= 2;
            this.isSpecial_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsSpecial() {
            this.bitField0_ &= -3;
            this.isSpecial_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasHeroPower() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getHeroPower() {
            return this.heroPower_;
         }

         public Builder setHeroPower(int value) {
            this.bitField0_ |= 4;
            this.heroPower_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroPower() {
            this.bitField0_ &= -5;
            this.heroPower_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasArraying() {
            return (this.bitField0_ & 8) != 0;
         }

         public ByteString getArraying() {
            return this.arraying_;
         }

         public Builder setArraying(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.arraying_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearArraying() {
            this.bitField0_ &= -9;
            this.arraying_ = FairylandMsg.C2S_FairylandGuanJia_4728.getDefaultInstance().getArraying();
            this.onChanged();
            return this;
         }

         public boolean hasMaxPower() {
            return (this.bitField0_ & 16) != 0;
         }

         public long getMaxPower() {
            return this.maxPower_;
         }

         public Builder setMaxPower(long value) {
            this.bitField0_ |= 16;
            this.maxPower_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMaxPower() {
            this.bitField0_ &= -17;
            this.maxPower_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasStageId() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getStageId() {
            return this.stageId_;
         }

         public Builder setStageId(int value) {
            this.bitField0_ |= 32;
            this.stageId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageId() {
            this.bitField0_ &= -33;
            this.stageId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTicketNum() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getTicketNum() {
            return this.ticketNum_;
         }

         public Builder setTicketNum(int value) {
            this.bitField0_ |= 64;
            this.ticketNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTicketNum() {
            this.bitField0_ &= -65;
            this.ticketNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsSweep() {
            return (this.bitField0_ & 128) != 0;
         }

         public boolean getIsSweep() {
            return this.isSweep_;
         }

         public Builder setIsSweep(boolean value) {
            this.bitField0_ |= 128;
            this.isSweep_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsSweep() {
            this.bitField0_ &= -129;
            this.isSweep_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasNum() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 256;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -257;
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

   public static final class S2C_FairylandGuanJia_4729 extends GeneratedMessageV3 implements S2C_FairylandGuanJia_4729OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DEGREETYPE_FIELD_NUMBER = 1;
      private int degreeType_;
      public static final int ISWIN_FIELD_NUMBER = 2;
      private boolean isWin_;
      public static final int RESULT_FIELD_NUMBER = 4;
      private BattleMsg.S2C_BattleResult_6102 result_;
      public static final int NUM_FIELD_NUMBER = 5;
      private int num_;
      public static final int TOTALNUM_FIELD_NUMBER = 6;
      private int totalNum_;
      public static final int WINNUM_FIELD_NUMBER = 7;
      private int winNum_;
      private byte memoizedIsInitialized;
      private static final S2C_FairylandGuanJia_4729 DEFAULT_INSTANCE = new S2C_FairylandGuanJia_4729();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FairylandGuanJia_4729> PARSER = new AbstractParser<S2C_FairylandGuanJia_4729>() {
         public S2C_FairylandGuanJia_4729 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FairylandGuanJia_4729(input, extensionRegistry);
         }
      };

      private S2C_FairylandGuanJia_4729(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FairylandGuanJia_4729() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FairylandGuanJia_4729();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FairylandGuanJia_4729(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.degreeType_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.isWin_ = input.readBool();
                        break;
                     case 34:
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.result_.toBuilder();
                        }

                        this.result_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.result_);
                           this.result_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4;
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.num_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 16;
                        this.totalNum_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 32;
                        this.winNum_ = input.readInt32();
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
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandGuanJia_4729_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandGuanJia_4729_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FairylandGuanJia_4729.class, Builder.class);
      }

      public boolean hasDegreeType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDegreeType() {
         return this.degreeType_;
      }

      public boolean hasIsWin() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsWin() {
         return this.isWin_;
      }

      public boolean hasResult() {
         return (this.bitField0_ & 4) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getResult() {
         return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getResultOrBuilder() {
         return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public boolean hasTotalNum() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getTotalNum() {
         return this.totalNum_;
      }

      public boolean hasWinNum() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getWinNum() {
         return this.winNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDegreeType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsWin()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasWinNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasResult() && !this.getResult().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.degreeType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.isWin_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(4, this.getResult());
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.num_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(6, this.totalNum_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(7, this.winNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.degreeType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.isWin_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(4, this.getResult());
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.num_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.totalNum_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.winNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FairylandGuanJia_4729)) {
            return super.equals(obj);
         } else {
            S2C_FairylandGuanJia_4729 other = (S2C_FairylandGuanJia_4729)obj;
            if (this.hasDegreeType() != other.hasDegreeType()) {
               return false;
            } else if (this.hasDegreeType() && this.getDegreeType() != other.getDegreeType()) {
               return false;
            } else if (this.hasIsWin() != other.hasIsWin()) {
               return false;
            } else if (this.hasIsWin() && this.getIsWin() != other.getIsWin()) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && !this.getResult().equals(other.getResult())) {
               return false;
            } else if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
               return false;
            } else if (this.hasTotalNum() != other.hasTotalNum()) {
               return false;
            } else if (this.hasTotalNum() && this.getTotalNum() != other.getTotalNum()) {
               return false;
            } else if (this.hasWinNum() != other.hasWinNum()) {
               return false;
            } else if (this.hasWinNum() && this.getWinNum() != other.getWinNum()) {
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
            if (this.hasDegreeType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDegreeType();
            }

            if (this.hasIsWin()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsWin());
            }

            if (this.hasResult()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getResult().hashCode();
            }

            if (this.hasNum()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getNum();
            }

            if (this.hasTotalNum()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getTotalNum();
            }

            if (this.hasWinNum()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getWinNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FairylandGuanJia_4729 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FairylandGuanJia_4729)PARSER.parseFrom(data);
      }

      public static S2C_FairylandGuanJia_4729 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FairylandGuanJia_4729)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FairylandGuanJia_4729 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FairylandGuanJia_4729)PARSER.parseFrom(data);
      }

      public static S2C_FairylandGuanJia_4729 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FairylandGuanJia_4729)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FairylandGuanJia_4729 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FairylandGuanJia_4729)PARSER.parseFrom(data);
      }

      public static S2C_FairylandGuanJia_4729 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FairylandGuanJia_4729)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FairylandGuanJia_4729 parseFrom(InputStream input) throws IOException {
         return (S2C_FairylandGuanJia_4729)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FairylandGuanJia_4729 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FairylandGuanJia_4729)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FairylandGuanJia_4729 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FairylandGuanJia_4729)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FairylandGuanJia_4729 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FairylandGuanJia_4729)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FairylandGuanJia_4729 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FairylandGuanJia_4729)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FairylandGuanJia_4729 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FairylandGuanJia_4729)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FairylandGuanJia_4729 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FairylandGuanJia_4729 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FairylandGuanJia_4729> parser() {
         return PARSER;
      }

      public Parser<S2C_FairylandGuanJia_4729> getParserForType() {
         return PARSER;
      }

      public S2C_FairylandGuanJia_4729 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FairylandGuanJia_4729OrBuilder {
         private int bitField0_;
         private int degreeType_;
         private boolean isWin_;
         private BattleMsg.S2C_BattleResult_6102 result_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> resultBuilder_;
         private int num_;
         private int totalNum_;
         private int winNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandGuanJia_4729_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandGuanJia_4729_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FairylandGuanJia_4729.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FairylandMsg.S2C_FairylandGuanJia_4729.alwaysUseFieldBuilders) {
               this.getResultFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.degreeType_ = 0;
            this.bitField0_ &= -2;
            this.isWin_ = false;
            this.bitField0_ &= -3;
            if (this.resultBuilder_ == null) {
               this.result_ = null;
            } else {
               this.resultBuilder_.clear();
            }

            this.bitField0_ &= -5;
            this.num_ = 0;
            this.bitField0_ &= -9;
            this.totalNum_ = 0;
            this.bitField0_ &= -17;
            this.winNum_ = 0;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FairylandMsg.internal_static_fairyland_com_gzbz_protobuf_S2C_FairylandGuanJia_4729_descriptor;
         }

         public S2C_FairylandGuanJia_4729 getDefaultInstanceForType() {
            return FairylandMsg.S2C_FairylandGuanJia_4729.getDefaultInstance();
         }

         public S2C_FairylandGuanJia_4729 build() {
            S2C_FairylandGuanJia_4729 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FairylandGuanJia_4729 buildPartial() {
            S2C_FairylandGuanJia_4729 result = new S2C_FairylandGuanJia_4729(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.degreeType_ = this.degreeType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isWin_ = this.isWin_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.resultBuilder_ == null) {
                  result.result_ = this.result_;
               } else {
                  result.result_ = (BattleMsg.S2C_BattleResult_6102)this.resultBuilder_.build();
               }

               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.num_ = this.num_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.totalNum_ = this.totalNum_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.winNum_ = this.winNum_;
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
            if (other instanceof S2C_FairylandGuanJia_4729) {
               return this.mergeFrom((S2C_FairylandGuanJia_4729)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FairylandGuanJia_4729 other) {
            if (other == FairylandMsg.S2C_FairylandGuanJia_4729.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDegreeType()) {
                  this.setDegreeType(other.getDegreeType());
               }

               if (other.hasIsWin()) {
                  this.setIsWin(other.getIsWin());
               }

               if (other.hasResult()) {
                  this.mergeResult(other.getResult());
               }

               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               if (other.hasTotalNum()) {
                  this.setTotalNum(other.getTotalNum());
               }

               if (other.hasWinNum()) {
                  this.setWinNum(other.getWinNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDegreeType()) {
               return false;
            } else if (!this.hasIsWin()) {
               return false;
            } else if (!this.hasNum()) {
               return false;
            } else if (!this.hasTotalNum()) {
               return false;
            } else if (!this.hasWinNum()) {
               return false;
            } else {
               return !this.hasResult() || this.getResult().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FairylandGuanJia_4729 parsedMessage = null;

            try {
               parsedMessage = (S2C_FairylandGuanJia_4729)FairylandMsg.S2C_FairylandGuanJia_4729.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FairylandGuanJia_4729)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDegreeType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDegreeType() {
            return this.degreeType_;
         }

         public Builder setDegreeType(int value) {
            this.bitField0_ |= 1;
            this.degreeType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDegreeType() {
            this.bitField0_ &= -2;
            this.degreeType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsWin() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsWin() {
            return this.isWin_;
         }

         public Builder setIsWin(boolean value) {
            this.bitField0_ |= 2;
            this.isWin_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsWin() {
            this.bitField0_ &= -3;
            this.isWin_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 4) != 0;
         }

         public BattleMsg.S2C_BattleResult_6102 getResult() {
            if (this.resultBuilder_ == null) {
               return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
            } else {
               return (BattleMsg.S2C_BattleResult_6102)this.resultBuilder_.getMessage();
            }
         }

         public Builder setResult(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.resultBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.result_ = value;
               this.onChanged();
            } else {
               this.resultBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setResult(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.resultBuilder_ == null) {
               this.result_ = builderForValue.build();
               this.onChanged();
            } else {
               this.resultBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeResult(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.resultBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.result_ != null && this.result_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.result_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.result_).mergeFrom(value).buildPartial();
               } else {
                  this.result_ = value;
               }

               this.onChanged();
            } else {
               this.resultBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearResult() {
            if (this.resultBuilder_ == null) {
               this.result_ = null;
               this.onChanged();
            } else {
               this.resultBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getResultBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (BattleMsg.S2C_BattleResult_6102.Builder)this.getResultFieldBuilder().getBuilder();
         }

         public BattleMsg.S2C_BattleResult_6102OrBuilder getResultOrBuilder() {
            if (this.resultBuilder_ != null) {
               return (BattleMsg.S2C_BattleResult_6102OrBuilder)this.resultBuilder_.getMessageOrBuilder();
            } else {
               return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
            }
         }

         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> getResultFieldBuilder() {
            if (this.resultBuilder_ == null) {
               this.resultBuilder_ = new SingleFieldBuilderV3(this.getResult(), this.getParentForChildren(), this.isClean());
               this.result_ = null;
            }

            return this.resultBuilder_;
         }

         public boolean hasNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 8;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -9;
            this.num_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTotalNum() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getTotalNum() {
            return this.totalNum_;
         }

         public Builder setTotalNum(int value) {
            this.bitField0_ |= 16;
            this.totalNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalNum() {
            this.bitField0_ &= -17;
            this.totalNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasWinNum() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getWinNum() {
            return this.winNum_;
         }

         public Builder setWinNum(int value) {
            this.bitField0_ |= 32;
            this.winNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWinNum() {
            this.bitField0_ &= -33;
            this.winNum_ = 0;
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

   public interface C2S_BattleRecord_4724OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_FairylandBattle_4707OrBuilder extends MessageOrBuilder {
      boolean hasDegreeType();

      int getDegreeType();

      boolean hasIsSpecial();

      boolean getIsSpecial();

      boolean hasHeroPower();

      int getHeroPower();

      boolean hasArraying();

      ByteString getArraying();

      boolean hasMaxPower();

      long getMaxPower();

      boolean hasStageId();

      int getStageId();

      boolean hasTicketNum();

      int getTicketNum();

      boolean hasIsSweep();

      boolean getIsSweep();
   }

   public interface C2S_FairylandExplore_4705OrBuilder extends MessageOrBuilder {
      boolean hasHeroPower();

      int getHeroPower();

      boolean hasFlushHero();

      boolean getFlushHero();

      boolean hasTicketNum();

      int getTicketNum();
   }

   public interface C2S_FairylandGuanJia_4728OrBuilder extends MessageOrBuilder {
      boolean hasDegreeType();

      int getDegreeType();

      boolean hasIsSpecial();

      boolean getIsSpecial();

      boolean hasHeroPower();

      int getHeroPower();

      boolean hasArraying();

      ByteString getArraying();

      boolean hasMaxPower();

      long getMaxPower();

      boolean hasStageId();

      int getStageId();

      boolean hasTicketNum();

      int getTicketNum();

      boolean hasIsSweep();

      boolean getIsSweep();

      boolean hasNum();

      int getNum();
   }

   public interface C2S_FairylandHero_4703OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_FairylandInfo_4701OrBuilder extends MessageOrBuilder {
      boolean hasServerId();

      int getServerId();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasSex();

      int getSex();

      boolean hasLv();

      int getLv();

      boolean hasCombatPower();

      long getCombatPower();

      boolean hasHeadId();

      int getHeadId();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasPrestige();

      int getPrestige();

      boolean hasMonarchId();

      int getMonarchId();

      boolean hasUnionId();

      int getUnionId();

      boolean hasUnionName();

      String getUnionName();

      ByteString getUnionNameBytes();

      boolean hasVipLev();

      int getVipLev();

      boolean hasStepId();

      int getStepId();

      boolean hasProvince();

      String getProvince();

      ByteString getProvinceBytes();

      boolean hasCity();

      String getCity();

      ByteString getCityBytes();

      boolean hasTicketNum();

      int getTicketNum();
   }

   public interface C2S_FairylandRank_4709OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ReceiveCommonAward_4717OrBuilder extends MessageOrBuilder {
      boolean hasStageSum();

      int getStageSum();
   }

   public interface C2S_ReceiveExtraAward_4719OrBuilder extends MessageOrBuilder {
      boolean hasStageSum();

      int getStageSum();
   }

   public interface C2S_ReceiveRecordAward_4726OrBuilder extends MessageOrBuilder {
      boolean hasRecordId();

      int getRecordId();
   }

   public interface C2S_StageSweep_4714OrBuilder extends MessageOrBuilder {
   }

   public interface ExploreInfoOrBuilder extends MessageOrBuilder {
      boolean hasDegreeType();

      int getDegreeType();

      boolean hasHeroInfo();

      CommonMsg.HeroInfo getHeroInfo();

      CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder();

      boolean hasServerId();

      int getServerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasLevel();

      int getLevel();

      boolean hasHead();

      int getHead();

      boolean hasPlayerId();

      int getPlayerId();
   }

   public interface ExploreRankDataOrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasWinScore();

      long getWinScore();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasHead();

      int getHead();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasLevel();

      int getLevel();

      boolean hasPower();

      long getPower();

      boolean hasMonarchId();

      int getMonarchId();

      boolean hasServerId();

      int getServerId();

      boolean hasUnionName();

      String getUnionName();

      ByteString getUnionNameBytes();

      boolean hasHeroInfo();

      CommonMsg.HeroInfo getHeroInfo();

      CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder();
   }

   public interface RecordDataOrBuilder extends MessageOrBuilder {
      boolean hasRecordId();

      int getRecordId();

      boolean hasServerId();

      int getServerId();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasHead();

      int getHead();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasStageId();

      int getStageId();

      boolean hasTime();

      int getTime();

      boolean hasPoint();

      int getPoint();

      boolean hasIsWin();

      boolean getIsWin();

      boolean hasEnd();

      boolean getEnd();

      boolean hasLevel();

      int getLevel();
   }

   public interface S2C_BattleEnd_4716OrBuilder extends MessageOrBuilder {
      boolean hasStageId();

      int getStageId();

      boolean hasPassState();

      int getPassState();
   }

   public interface S2C_BattleRecord_4725OrBuilder extends MessageOrBuilder {
      List<RecordData> getRecordsList();

      RecordData getRecords(int index);

      int getRecordsCount();

      List<? extends RecordDataOrBuilder> getRecordsOrBuilderList();

      RecordDataOrBuilder getRecordsOrBuilder(int index);
   }

   public interface S2C_FairylandBattle_4708OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      ExploreInfo getInfo();

      ExploreInfoOrBuilder getInfoOrBuilder();

      boolean hasTicketNum();

      int getTicketNum();

      boolean hasResult();

      BattleMsg.S2C_BattleResult_6102 getResult();

      BattleMsg.S2C_BattleResult_6102OrBuilder getResultOrBuilder();
   }

   public interface S2C_FairylandExplore_4706OrBuilder extends MessageOrBuilder {
      List<ExploreInfo> getInfoList();

      ExploreInfo getInfo(int index);

      int getInfoCount();

      List<? extends ExploreInfoOrBuilder> getInfoOrBuilderList();

      ExploreInfoOrBuilder getInfoOrBuilder(int index);
   }

   public interface S2C_FairylandGuanJia_4729OrBuilder extends MessageOrBuilder {
      boolean hasDegreeType();

      int getDegreeType();

      boolean hasIsWin();

      boolean getIsWin();

      boolean hasResult();

      BattleMsg.S2C_BattleResult_6102 getResult();

      BattleMsg.S2C_BattleResult_6102OrBuilder getResultOrBuilder();

      boolean hasNum();

      int getNum();

      boolean hasTotalNum();

      int getTotalNum();

      boolean hasWinNum();

      int getWinNum();
   }

   public interface S2C_FairylandHero_4704OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasHeroInfo();

      CommonMsg.HeroInfo getHeroInfo();

      CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder();
   }

   public interface S2C_FairylandInfo_4702OrBuilder extends MessageOrBuilder {
      boolean hasStageId();

      int getStageId();

      List<Integer> getReceivedAwardList();

      int getReceivedAwardCount();

      int getReceivedAward(int index);

      List<Integer> getExtraAwardList();

      int getExtraAwardCount();

      int getExtraAward(int index);

      boolean hasHeroInfo();

      CommonMsg.HeroInfo getHeroInfo();

      CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder();

      boolean hasCommonSweep();

      int getCommonSweep();

      boolean hasTicketNum();

      int getTicketNum();

      List<RecordData> getRecordsList();

      RecordData getRecords(int index);

      int getRecordsCount();

      List<? extends RecordDataOrBuilder> getRecordsOrBuilderList();

      RecordDataOrBuilder getRecordsOrBuilder(int index);

      boolean hasPassState();

      int getPassState();
   }

   public interface S2C_FairylandRank_4710OrBuilder extends MessageOrBuilder {
      boolean hasMyData();

      ExploreRankData getMyData();

      ExploreRankDataOrBuilder getMyDataOrBuilder();

      List<ExploreRankData> getRankDataList();

      ExploreRankData getRankData(int index);

      int getRankDataCount();

      List<? extends ExploreRankDataOrBuilder> getRankDataOrBuilderList();

      ExploreRankDataOrBuilder getRankDataOrBuilder(int index);
   }

   public interface S2C_ReceiveCommonAward_4718OrBuilder extends MessageOrBuilder {
      boolean hasStageSum();

      int getStageSum();

      List<Integer> getReceiveAwardList();

      int getReceiveAwardCount();

      int getReceiveAward(int index);

      boolean hasResult();

      int getResult();
   }

   public interface S2C_ReceiveExtraAward_4720OrBuilder extends MessageOrBuilder {
      boolean hasStageSum();

      int getStageSum();

      List<Integer> getReceiveExtraList();

      int getReceiveExtraCount();

      int getReceiveExtra(int index);

      boolean hasResult();

      int getResult();
   }

   public interface S2C_ReceiveRecordAward_4727OrBuilder extends MessageOrBuilder {
      boolean hasRecordId();

      int getRecordId();
   }

   public interface S2C_StageSweep_4715OrBuilder extends MessageOrBuilder {
      boolean hasStageSweep();

      int getStageSweep();
   }

   public interface S2S_ExploreAward_4713OrBuilder extends MessageOrBuilder {
      boolean hasDegreeType();

      int getDegreeType();

      boolean hasIsWin();

      boolean getIsWin();

      boolean hasIsShow();

      boolean getIsShow();

      boolean hasResult();

      BattleMsg.S2C_BattleResult_6102 getResult();

      BattleMsg.S2C_BattleResult_6102OrBuilder getResultOrBuilder();
   }

   public interface S2S_FairylandExplore_4712OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      ExploreInfo getInfo();

      ExploreInfoOrBuilder getInfoOrBuilder();

      boolean hasHeroData();

      ByteString getHeroData();
   }

   public interface S2S_FairylandHero_4711OrBuilder extends MessageOrBuilder {
      boolean hasHeroData();

      ByteString getHeroData();

      boolean hasHeroPower();

      int getHeroPower();
   }

   public interface S2S_NotifyBattle_4723OrBuilder extends MessageOrBuilder {
      boolean hasServerId();

      int getServerId();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasHead();

      int getHead();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasTime();

      int getTime();

      boolean hasPoint();

      int getPoint();

      boolean hasIsWin();

      boolean getIsWin();

      boolean hasLevel();

      int getLevel();
   }

   public interface S2S_SendRankAward_4722OrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasChangeCross();

      boolean getChangeCross();
   }

   public interface S2S_UpdateHero_4721OrBuilder extends MessageOrBuilder {
   }
}
