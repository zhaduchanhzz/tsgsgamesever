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

public final class ExpeditionMsg {
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_ChapterInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_ChapterInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_HpData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_HpData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_RecordInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_RecordInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_MercenaryInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_MercenaryInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_C2S_Chapters_10301_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_C2S_Chapters_10301_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_S2C_Chapters_10302_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_S2C_Chapters_10302_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_C2S_EnterChapter_10303_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_C2S_EnterChapter_10303_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_S2C_EnterChapter_10304_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_S2C_EnterChapter_10304_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_C2S_ExitChapter_10305_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_C2S_ExitChapter_10305_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_S2C_ExitChapter_10306_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_S2C_ExitChapter_10306_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_C2S_Move_10307_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_C2S_Move_10307_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_S2C_Move_10308_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_S2C_Move_10308_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_C2S_SelectBuff_10309_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_C2S_SelectBuff_10309_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_S2C_SelectBuff_10310_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_S2C_SelectBuff_10310_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_S2C_UpdateGridInfo_10312_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_S2C_UpdateGridInfo_10312_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_S2C_GridInfo_10314_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_S2C_GridInfo_10314_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_C2S_BuffList_10315_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_C2S_BuffList_10315_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_S2C_BuffList_10316_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_S2C_BuffList_10316_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_C2S_OtherBuff_10317_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_C2S_OtherBuff_10317_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_S2C_OtherBuff_10318_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_S2C_OtherBuff_10318_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHeroList_10319_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHeroList_10319_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHeroList_10320_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHeroList_10320_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHero_10321_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHero_10321_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHero_10322_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHero_10322_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_C2S_EnemyData_10323_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_C2S_EnemyData_10323_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_S2C_EnemyData_10324_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_S2C_EnemyData_10324_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHeroData_10325_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHeroData_10325_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHeroData_10326_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHeroData_10326_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_C2S_HeroHpData_10327_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_C2S_HeroHpData_10327_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_S2C_HeroHpData_10328_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_S2C_HeroHpData_10328_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_S2C_UnlockSeeGrids_10330_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_S2C_UnlockSeeGrids_10330_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_S2C_UpdateHeroPos_10332_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_S2C_UpdateHeroPos_10332_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_C2S_BattleRecord_10333_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_C2S_BattleRecord_10333_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_S2C_BattleRecord_10334_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_S2C_BattleRecord_10334_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_C2S_DispatchHero_10337_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_C2S_DispatchHero_10337_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_S2C_DispatchHero_10338_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_S2C_DispatchHero_10338_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_C2S_EmployHero_10339_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_C2S_EmployHero_10339_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_S2C_EmployHero_10340_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_S2C_EmployHero_10340_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_C2S_DispatchList_10341_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_C2S_DispatchList_10341_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_S2C_DispatchList_10342_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_S2C_DispatchList_10342_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_S2C_ChangeHeroIdle_10344_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_S2C_ChangeHeroIdle_10344_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_S2C_TempProps_10346_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_S2C_TempProps_10346_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_expedition_com_gzbz_protobuf_S2C_UpdatePassNum_10348_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_expedition_com_gzbz_protobuf_S2C_UpdatePassNum_10348_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ExpeditionMsg() {
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
      String[] descriptorData = new String[]{"\n\u0010Expedition.proto\u0012\u001cexpedition.com.gzbz.protobuf\u001a\fcommon.proto\"¥\u0001\n\u000bChapterInfo\u0012\u0011\n\tchapterId\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005state\u0018\u0002 \u0002(\u0005\u0012\u0013\n\u000bcompleteNum\u0018\u0003 \u0002(\u0005\u0012\u001e\n\u0003box\u0018\u0004 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0015\n\rfirstPlayerId\u0018\u0005 \u0001(\u0005\u0012\u0017\n\u000ffirstPlayerName\u0018\u0006 \u0001(\t\u0012\u000f\n\u0007passNum\u0018\u0007 \u0001(\u0005\"\"\n\u0006HpData\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002hp\u0018\u0002 \u0002(\u0005\"\u00ad\u0001\n\nRecordInfo\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0002 \u0002(\t\u0012\f\n\u0004type\u0018\u0003 \u0002(\u0005\u0012\u0012\n\ncrossPower\u0018\u0004 \u0002(\u0003\u0012\u0011\n\tcrossTime\u0018\u0005 \u0002(\u0005\u0012\f\n\u0004head\u0018\u0006 \u0002(\u0005\u0012\u0011\n\theadFrame\u0018\u0007 \u0002(\u0005\u0012#\n\theroInfos\u0018\b \u0003(\u000b2\u0010.common.HeroInfo\"V\n\rMercenaryInfo\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\"\n\bheroInfo\u0018\u0002 \u0002(\u000b2\u0010.common.HeroInfo\u0012\u000f\n\u0007bEmploy\u0018\u0003 \u0001(\b\"\u0014\n\u0012C2S_Chapters_10301\"f\n\u0012S2C_Chapters_10302\u0012>\n\u000bchapterInfo\u0018\u0001 \u0003(\u000b2).expedition.com.gzbz.protobuf.ChapterInfo\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005\"?\n\u0016C2S_EnterChapter_10303\u0012\u0011\n\tchapterId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nactivityId\u0018\u0002 \u0001(\u0005\"Ä\u0001\n\u0016S2C_EnterChapter_10304\u0012\u0011\n\tchapterId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007curGrid\u0018\u0002 \u0002(\u0005\u0012B\n\bgridInfo\u0018\u0003 \u0003(\u000b20.expedition.com.gzbz.protobuf.S2C_GridInfo_10314\u0012\r\n\u0005buffs\u0018\u0004 \u0003(\u0005\u0012\u000e\n\u0006heroId\u0018\u0005 \u0002(\u0005\u0012#\n\ttempProps\u0018\u0006 \u0003(\u000b2\u0010.common.ItemInfo\"*\n\u0015C2S_ExitChapter_10305\u0012\u0011\n\tchapterId\u0018\u0001 \u0002(\u0005\"*\n\u0015S2C_ExitChapter_10306\u0012\u0011\n\tchapterId\u0018\u0001 \u0002(\u0005\"E\n\u000eC2S_Move_10307\u0012\u000f\n\u0007oriGrid\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bdestGrid\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bpassGrid\u0018\u0003 \u0003(\u0005\"2\n\u000eS2C_Move_10308\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bdestGrid\u0018\u0002 \u0002(\u0005\"4\n\u0014C2S_SelectBuff_10309\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006buffId\u0018\u0002 \u0002(\u0005\"4\n\u0014S2C_SelectBuff_10310\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006buffId\u0018\u0002 \u0002(\u0005\"Z\n\u0018S2C_UpdateGridInfo_10312\u0012>\n\u0004info\u0018\u0001 \u0003(\u000b20.expedition.com.gzbz.protobuf.S2C_GridInfo_10314\"X\n\u0012S2C_GridInfo_10314\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\u0012\u0010\n\beventIdx\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bgridIcon\u0018\u0003 \u0001(\u0005\u0012\u0010\n\bgridType\u0018\u0004 \u0001(\u0005\"\"\n\u0012C2S_BuffList_10315\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\"4\n\u0012S2C_BuffList_10316\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bbuffList\u0018\u0002 \u0003(\u0005\"#\n\u0013C2S_OtherBuff_10317\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\"#\n\u0013S2C_OtherBuff_10318\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\")\n\u0019C2S_RecruitHeroList_10319\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\"I\n\u0019S2C_RecruitHeroList_10320\u0012\f\n\u0004gird\u0018\u0001 \u0002(\u0005\u0012\u001e\n\u0004hero\u0018\u0002 \u0003(\u000b2\u0010.common.HeroInfo\"5\n\u0015C2S_RecruitHero_10321\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006codeId\u0018\u0002 \u0002(\u0005\"5\n\u0015S2C_RecruitHero_10322\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006codeId\u0018\u0002 \u0002(\u0005\"#\n\u0013C2S_EnemyData_10323\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\"i\n\u0013S2C_EnemyData_10324\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006passed\u0018\u0002 \u0002(\b\u00124\n\u0006hpData\u0018\u0003 \u0003(\u000b2$.expedition.com.gzbz.protobuf.HpData\"\u001b\n\u0019C2S_RecruitHeroData_10325\";\n\u0019S2C_RecruitHeroData_10326\u0012\u001e\n\u0004hero\u0018\u0002 \u0003(\u000b2\u0010.common.HeroInfo\"\u0016\n\u0014C2S_HeroHpData_10327\"L\n\u0014S2C_HeroHpData_10328\u00124\n\u0006hpData\u0018\u0001 \u0003(\u000b2$.expedition.com.gzbz.protobuf.HpData\"(\n\u0018S2C_UnlockSeeGrids_10330\u0012\f\n\u0004grid\u0018\u0001 \u0003(\u0005\"*\n\u0017S2C_UpdateHeroPos_10332\u0012\u000f\n\u0007curGrid\u0018\u0001 \u0002(\u0005\"+\n\u0016C2S_BattleRecord_10333\u0012\u0011\n\tchapterId\u0018\u0001 \u0002(\u0005\"f\n\u0016S2C_BattleRecord_10334\u0012\u0011\n\tchapterId\u0018\u0001 \u0002(\u0005\u00129\n\u0007records\u0018\u0002 \u0003(\u000b2(.expedition.com.gzbz.protobuf.RecordInfo\"*\n\u0016C2S_DispatchHero_10337\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\"*\n\u0016S2C_DispatchHero_10338\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\">\n\u0014C2S_EmployHero_10339\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u0014\n\fdispatchCode\u0018\u0002 \u0002(\u0005\">\n\u0014S2C_EmployHero_10340\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u0014\n\fdispatchCode\u0018\u0002 \u0002(\u0005\"\u0018\n\u0016C2S_DispatchList_10341\"\\\n\u0016S2C_DispatchList_10342\u0012B\n\rmercenaryInfo\u0018\u0001 \u0003(\u000b2+.expedition.com.gzbz.protobuf.MercenaryInfo\"*\n\u0018S2C_ChangeHeroIdle_10344\u0012\u000e\n\u0006heroId\u0018\u0001 \u0002(\u0005\":\n\u0013S2C_TempProps_10346\u0012#\n\ttempProps\u0018\u0001 \u0003(\u000b2\u0010.common.ItemInfo\"V\n\u0017S2C_UpdatePassNum_10348\u0012\u0011\n\tchapterId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007passNum\u0018\u0002 \u0002(\u0005\u0012\u0017\n\u000ffirstPlayerName\u0018\u0003 \u0001(\tB$\n\u0011com.gzbz.protobufB\rExpeditionMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_expedition_com_gzbz_protobuf_ChapterInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_expedition_com_gzbz_protobuf_ChapterInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_ChapterInfo_descriptor, new String[]{"ChapterId", "State", "CompleteNum", "Box", "FirstPlayerId", "FirstPlayerName", "PassNum"});
      internal_static_expedition_com_gzbz_protobuf_HpData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_expedition_com_gzbz_protobuf_HpData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_HpData_descriptor, new String[]{"Code", "Hp"});
      internal_static_expedition_com_gzbz_protobuf_RecordInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_expedition_com_gzbz_protobuf_RecordInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_RecordInfo_descriptor, new String[]{"PlayerId", "PlayerName", "Type", "CrossPower", "CrossTime", "Head", "HeadFrame", "HeroInfos"});
      internal_static_expedition_com_gzbz_protobuf_MercenaryInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_expedition_com_gzbz_protobuf_MercenaryInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_MercenaryInfo_descriptor, new String[]{"PlayerId", "HeroInfo", "BEmploy"});
      internal_static_expedition_com_gzbz_protobuf_C2S_Chapters_10301_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_expedition_com_gzbz_protobuf_C2S_Chapters_10301_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_C2S_Chapters_10301_descriptor, new String[0]);
      internal_static_expedition_com_gzbz_protobuf_S2C_Chapters_10302_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_expedition_com_gzbz_protobuf_S2C_Chapters_10302_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_S2C_Chapters_10302_descriptor, new String[]{"ChapterInfo", "HeroCode"});
      internal_static_expedition_com_gzbz_protobuf_C2S_EnterChapter_10303_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_expedition_com_gzbz_protobuf_C2S_EnterChapter_10303_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_C2S_EnterChapter_10303_descriptor, new String[]{"ChapterId", "ActivityId"});
      internal_static_expedition_com_gzbz_protobuf_S2C_EnterChapter_10304_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_expedition_com_gzbz_protobuf_S2C_EnterChapter_10304_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_S2C_EnterChapter_10304_descriptor, new String[]{"ChapterId", "CurGrid", "GridInfo", "Buffs", "HeroId", "TempProps"});
      internal_static_expedition_com_gzbz_protobuf_C2S_ExitChapter_10305_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_expedition_com_gzbz_protobuf_C2S_ExitChapter_10305_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_C2S_ExitChapter_10305_descriptor, new String[]{"ChapterId"});
      internal_static_expedition_com_gzbz_protobuf_S2C_ExitChapter_10306_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_expedition_com_gzbz_protobuf_S2C_ExitChapter_10306_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_S2C_ExitChapter_10306_descriptor, new String[]{"ChapterId"});
      internal_static_expedition_com_gzbz_protobuf_C2S_Move_10307_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_expedition_com_gzbz_protobuf_C2S_Move_10307_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_C2S_Move_10307_descriptor, new String[]{"OriGrid", "DestGrid", "PassGrid"});
      internal_static_expedition_com_gzbz_protobuf_S2C_Move_10308_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_expedition_com_gzbz_protobuf_S2C_Move_10308_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_S2C_Move_10308_descriptor, new String[]{"Result", "DestGrid"});
      internal_static_expedition_com_gzbz_protobuf_C2S_SelectBuff_10309_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_expedition_com_gzbz_protobuf_C2S_SelectBuff_10309_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_C2S_SelectBuff_10309_descriptor, new String[]{"Grid", "BuffId"});
      internal_static_expedition_com_gzbz_protobuf_S2C_SelectBuff_10310_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_expedition_com_gzbz_protobuf_S2C_SelectBuff_10310_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_S2C_SelectBuff_10310_descriptor, new String[]{"Grid", "BuffId"});
      internal_static_expedition_com_gzbz_protobuf_S2C_UpdateGridInfo_10312_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_expedition_com_gzbz_protobuf_S2C_UpdateGridInfo_10312_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_S2C_UpdateGridInfo_10312_descriptor, new String[]{"Info"});
      internal_static_expedition_com_gzbz_protobuf_S2C_GridInfo_10314_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_expedition_com_gzbz_protobuf_S2C_GridInfo_10314_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_S2C_GridInfo_10314_descriptor, new String[]{"Grid", "EventIdx", "GridIcon", "GridType"});
      internal_static_expedition_com_gzbz_protobuf_C2S_BuffList_10315_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_expedition_com_gzbz_protobuf_C2S_BuffList_10315_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_C2S_BuffList_10315_descriptor, new String[]{"Grid"});
      internal_static_expedition_com_gzbz_protobuf_S2C_BuffList_10316_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_expedition_com_gzbz_protobuf_S2C_BuffList_10316_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_S2C_BuffList_10316_descriptor, new String[]{"Grid", "BuffList"});
      internal_static_expedition_com_gzbz_protobuf_C2S_OtherBuff_10317_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_expedition_com_gzbz_protobuf_C2S_OtherBuff_10317_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_C2S_OtherBuff_10317_descriptor, new String[]{"Grid"});
      internal_static_expedition_com_gzbz_protobuf_S2C_OtherBuff_10318_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_expedition_com_gzbz_protobuf_S2C_OtherBuff_10318_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_S2C_OtherBuff_10318_descriptor, new String[]{"Grid"});
      internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHeroList_10319_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHeroList_10319_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHeroList_10319_descriptor, new String[]{"Grid"});
      internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHeroList_10320_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHeroList_10320_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHeroList_10320_descriptor, new String[]{"Gird", "Hero"});
      internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHero_10321_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHero_10321_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHero_10321_descriptor, new String[]{"Grid", "CodeId"});
      internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHero_10322_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHero_10322_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHero_10322_descriptor, new String[]{"Grid", "CodeId"});
      internal_static_expedition_com_gzbz_protobuf_C2S_EnemyData_10323_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_expedition_com_gzbz_protobuf_C2S_EnemyData_10323_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_C2S_EnemyData_10323_descriptor, new String[]{"Grid"});
      internal_static_expedition_com_gzbz_protobuf_S2C_EnemyData_10324_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_expedition_com_gzbz_protobuf_S2C_EnemyData_10324_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_S2C_EnemyData_10324_descriptor, new String[]{"Grid", "Passed", "HpData"});
      internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHeroData_10325_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHeroData_10325_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHeroData_10325_descriptor, new String[0]);
      internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHeroData_10326_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHeroData_10326_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHeroData_10326_descriptor, new String[]{"Hero"});
      internal_static_expedition_com_gzbz_protobuf_C2S_HeroHpData_10327_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_expedition_com_gzbz_protobuf_C2S_HeroHpData_10327_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_C2S_HeroHpData_10327_descriptor, new String[0]);
      internal_static_expedition_com_gzbz_protobuf_S2C_HeroHpData_10328_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_expedition_com_gzbz_protobuf_S2C_HeroHpData_10328_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_S2C_HeroHpData_10328_descriptor, new String[]{"HpData"});
      internal_static_expedition_com_gzbz_protobuf_S2C_UnlockSeeGrids_10330_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_expedition_com_gzbz_protobuf_S2C_UnlockSeeGrids_10330_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_S2C_UnlockSeeGrids_10330_descriptor, new String[]{"Grid"});
      internal_static_expedition_com_gzbz_protobuf_S2C_UpdateHeroPos_10332_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_expedition_com_gzbz_protobuf_S2C_UpdateHeroPos_10332_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_S2C_UpdateHeroPos_10332_descriptor, new String[]{"CurGrid"});
      internal_static_expedition_com_gzbz_protobuf_C2S_BattleRecord_10333_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_expedition_com_gzbz_protobuf_C2S_BattleRecord_10333_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_C2S_BattleRecord_10333_descriptor, new String[]{"ChapterId"});
      internal_static_expedition_com_gzbz_protobuf_S2C_BattleRecord_10334_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_expedition_com_gzbz_protobuf_S2C_BattleRecord_10334_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_S2C_BattleRecord_10334_descriptor, new String[]{"ChapterId", "Records"});
      internal_static_expedition_com_gzbz_protobuf_C2S_DispatchHero_10337_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_expedition_com_gzbz_protobuf_C2S_DispatchHero_10337_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_C2S_DispatchHero_10337_descriptor, new String[]{"HeroCode"});
      internal_static_expedition_com_gzbz_protobuf_S2C_DispatchHero_10338_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(35);
      internal_static_expedition_com_gzbz_protobuf_S2C_DispatchHero_10338_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_S2C_DispatchHero_10338_descriptor, new String[]{"HeroCode"});
      internal_static_expedition_com_gzbz_protobuf_C2S_EmployHero_10339_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(36);
      internal_static_expedition_com_gzbz_protobuf_C2S_EmployHero_10339_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_C2S_EmployHero_10339_descriptor, new String[]{"PlayerId", "DispatchCode"});
      internal_static_expedition_com_gzbz_protobuf_S2C_EmployHero_10340_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(37);
      internal_static_expedition_com_gzbz_protobuf_S2C_EmployHero_10340_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_S2C_EmployHero_10340_descriptor, new String[]{"PlayerId", "DispatchCode"});
      internal_static_expedition_com_gzbz_protobuf_C2S_DispatchList_10341_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(38);
      internal_static_expedition_com_gzbz_protobuf_C2S_DispatchList_10341_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_C2S_DispatchList_10341_descriptor, new String[0]);
      internal_static_expedition_com_gzbz_protobuf_S2C_DispatchList_10342_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(39);
      internal_static_expedition_com_gzbz_protobuf_S2C_DispatchList_10342_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_S2C_DispatchList_10342_descriptor, new String[]{"MercenaryInfo"});
      internal_static_expedition_com_gzbz_protobuf_S2C_ChangeHeroIdle_10344_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(40);
      internal_static_expedition_com_gzbz_protobuf_S2C_ChangeHeroIdle_10344_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_S2C_ChangeHeroIdle_10344_descriptor, new String[]{"HeroId"});
      internal_static_expedition_com_gzbz_protobuf_S2C_TempProps_10346_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(41);
      internal_static_expedition_com_gzbz_protobuf_S2C_TempProps_10346_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_S2C_TempProps_10346_descriptor, new String[]{"TempProps"});
      internal_static_expedition_com_gzbz_protobuf_S2C_UpdatePassNum_10348_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(42);
      internal_static_expedition_com_gzbz_protobuf_S2C_UpdatePassNum_10348_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_expedition_com_gzbz_protobuf_S2C_UpdatePassNum_10348_descriptor, new String[]{"ChapterId", "PassNum", "FirstPlayerName"});
      CommonMsg.getDescriptor();
   }

   public static final class ChapterInfo extends GeneratedMessageV3 implements ChapterInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHAPTERID_FIELD_NUMBER = 1;
      private int chapterId_;
      public static final int STATE_FIELD_NUMBER = 2;
      private int state_;
      public static final int COMPLETENUM_FIELD_NUMBER = 3;
      private int completeNum_;
      public static final int BOX_FIELD_NUMBER = 4;
      private List<CommonMsg.MapDataII> box_;
      public static final int FIRSTPLAYERID_FIELD_NUMBER = 5;
      private int firstPlayerId_;
      public static final int FIRSTPLAYERNAME_FIELD_NUMBER = 6;
      private volatile Object firstPlayerName_;
      public static final int PASSNUM_FIELD_NUMBER = 7;
      private int passNum_;
      private byte memoizedIsInitialized;
      private static final ChapterInfo DEFAULT_INSTANCE = new ChapterInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<ChapterInfo> PARSER = new AbstractParser<ChapterInfo>() {
         public ChapterInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new ChapterInfo(input, extensionRegistry);
         }
      };

      private ChapterInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ChapterInfo() {
         this.memoizedIsInitialized = -1;
         this.box_ = Collections.emptyList();
         this.firstPlayerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new ChapterInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ChapterInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.state_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.completeNum_ = input.readInt32();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.box_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.box_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.firstPlayerId_ = input.readInt32();
                        break;
                     case 50:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 16;
                        this.firstPlayerName_ = bs;
                        break;
                     case 56:
                        this.bitField0_ |= 32;
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
               if ((mutable_bitField0_ & 8) != 0) {
                  this.box_ = Collections.unmodifiableList(this.box_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_ChapterInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_ChapterInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ChapterInfo.class, Builder.class);
      }

      public boolean hasChapterId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChapterId() {
         return this.chapterId_;
      }

      public boolean hasState() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getState() {
         return this.state_;
      }

      public boolean hasCompleteNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getCompleteNum() {
         return this.completeNum_;
      }

      public List<CommonMsg.MapDataII> getBoxList() {
         return this.box_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getBoxOrBuilderList() {
         return this.box_;
      }

      public int getBoxCount() {
         return this.box_.size();
      }

      public CommonMsg.MapDataII getBox(int index) {
         return (CommonMsg.MapDataII)this.box_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getBoxOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.box_.get(index);
      }

      public boolean hasFirstPlayerId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getFirstPlayerId() {
         return this.firstPlayerId_;
      }

      public boolean hasFirstPlayerName() {
         return (this.bitField0_ & 16) != 0;
      }

      public String getFirstPlayerName() {
         Object ref = this.firstPlayerName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.firstPlayerName_ = s;
            }

            return s;
         }
      }

      public ByteString getFirstPlayerNameBytes() {
         Object ref = this.firstPlayerName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.firstPlayerName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasPassNum() {
         return (this.bitField0_ & 32) != 0;
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
         } else if (!this.hasChapterId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCompleteNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getBoxCount(); ++i) {
               if (!this.getBox(i).isInitialized()) {
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
            output.writeInt32(1, this.chapterId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.state_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.completeNum_);
         }

         for(int i = 0; i < this.box_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.box_.get(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.firstPlayerId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            GeneratedMessageV3.writeString(output, 6, this.firstPlayerName_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(7, this.passNum_);
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
               size += CodedOutputStream.computeInt32Size(2, this.state_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.completeNum_);
            }

            for(int i = 0; i < this.box_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.box_.get(i));
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.firstPlayerId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += GeneratedMessageV3.computeStringSize(6, this.firstPlayerName_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.passNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof ChapterInfo)) {
            return super.equals(obj);
         } else {
            ChapterInfo other = (ChapterInfo)obj;
            if (this.hasChapterId() != other.hasChapterId()) {
               return false;
            } else if (this.hasChapterId() && this.getChapterId() != other.getChapterId()) {
               return false;
            } else if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
               return false;
            } else if (this.hasCompleteNum() != other.hasCompleteNum()) {
               return false;
            } else if (this.hasCompleteNum() && this.getCompleteNum() != other.getCompleteNum()) {
               return false;
            } else if (!this.getBoxList().equals(other.getBoxList())) {
               return false;
            } else if (this.hasFirstPlayerId() != other.hasFirstPlayerId()) {
               return false;
            } else if (this.hasFirstPlayerId() && this.getFirstPlayerId() != other.getFirstPlayerId()) {
               return false;
            } else if (this.hasFirstPlayerName() != other.hasFirstPlayerName()) {
               return false;
            } else if (this.hasFirstPlayerName() && !this.getFirstPlayerName().equals(other.getFirstPlayerName())) {
               return false;
            } else if (this.hasPassNum() != other.hasPassNum()) {
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
            if (this.hasChapterId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChapterId();
            }

            if (this.hasState()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getState();
            }

            if (this.hasCompleteNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCompleteNum();
            }

            if (this.getBoxCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getBoxList().hashCode();
            }

            if (this.hasFirstPlayerId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getFirstPlayerId();
            }

            if (this.hasFirstPlayerName()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getFirstPlayerName().hashCode();
            }

            if (this.hasPassNum()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getPassNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static ChapterInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (ChapterInfo)PARSER.parseFrom(data);
      }

      public static ChapterInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ChapterInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ChapterInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (ChapterInfo)PARSER.parseFrom(data);
      }

      public static ChapterInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ChapterInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ChapterInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (ChapterInfo)PARSER.parseFrom(data);
      }

      public static ChapterInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ChapterInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ChapterInfo parseFrom(InputStream input) throws IOException {
         return (ChapterInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ChapterInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ChapterInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static ChapterInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (ChapterInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static ChapterInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ChapterInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static ChapterInfo parseFrom(CodedInputStream input) throws IOException {
         return (ChapterInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ChapterInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ChapterInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(ChapterInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static ChapterInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<ChapterInfo> parser() {
         return PARSER;
      }

      public Parser<ChapterInfo> getParserForType() {
         return PARSER;
      }

      public ChapterInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ChapterInfoOrBuilder {
         private int bitField0_;
         private int chapterId_;
         private int state_;
         private int completeNum_;
         private List<CommonMsg.MapDataII> box_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> boxBuilder_;
         private int firstPlayerId_;
         private Object firstPlayerName_;
         private int passNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_ChapterInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_ChapterInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ChapterInfo.class, Builder.class);
         }

         private Builder() {
            this.box_ = Collections.emptyList();
            this.firstPlayerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.box_ = Collections.emptyList();
            this.firstPlayerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.ChapterInfo.alwaysUseFieldBuilders) {
               this.getBoxFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.chapterId_ = 0;
            this.bitField0_ &= -2;
            this.state_ = 0;
            this.bitField0_ &= -3;
            this.completeNum_ = 0;
            this.bitField0_ &= -5;
            if (this.boxBuilder_ == null) {
               this.box_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.boxBuilder_.clear();
            }

            this.firstPlayerId_ = 0;
            this.bitField0_ &= -17;
            this.firstPlayerName_ = "";
            this.bitField0_ &= -33;
            this.passNum_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_ChapterInfo_descriptor;
         }

         public ChapterInfo getDefaultInstanceForType() {
            return ExpeditionMsg.ChapterInfo.getDefaultInstance();
         }

         public ChapterInfo build() {
            ChapterInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public ChapterInfo buildPartial() {
            ChapterInfo result = new ChapterInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.chapterId_ = this.chapterId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.state_ = this.state_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.completeNum_ = this.completeNum_;
               to_bitField0_ |= 4;
            }

            if (this.boxBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.box_ = Collections.unmodifiableList(this.box_);
                  this.bitField0_ &= -9;
               }

               result.box_ = this.box_;
            } else {
               result.box_ = this.boxBuilder_.build();
            }

            if ((from_bitField0_ & 16) != 0) {
               result.firstPlayerId_ = this.firstPlayerId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 32) != 0) {
               to_bitField0_ |= 16;
            }

            result.firstPlayerName_ = this.firstPlayerName_;
            if ((from_bitField0_ & 64) != 0) {
               result.passNum_ = this.passNum_;
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
            if (other instanceof ChapterInfo) {
               return this.mergeFrom((ChapterInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(ChapterInfo other) {
            if (other == ExpeditionMsg.ChapterInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChapterId()) {
                  this.setChapterId(other.getChapterId());
               }

               if (other.hasState()) {
                  this.setState(other.getState());
               }

               if (other.hasCompleteNum()) {
                  this.setCompleteNum(other.getCompleteNum());
               }

               if (this.boxBuilder_ == null) {
                  if (!other.box_.isEmpty()) {
                     if (this.box_.isEmpty()) {
                        this.box_ = other.box_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureBoxIsMutable();
                        this.box_.addAll(other.box_);
                     }

                     this.onChanged();
                  }
               } else if (!other.box_.isEmpty()) {
                  if (this.boxBuilder_.isEmpty()) {
                     this.boxBuilder_.dispose();
                     this.boxBuilder_ = null;
                     this.box_ = other.box_;
                     this.bitField0_ &= -9;
                     this.boxBuilder_ = ExpeditionMsg.ChapterInfo.alwaysUseFieldBuilders ? this.getBoxFieldBuilder() : null;
                  } else {
                     this.boxBuilder_.addAllMessages(other.box_);
                  }
               }

               if (other.hasFirstPlayerId()) {
                  this.setFirstPlayerId(other.getFirstPlayerId());
               }

               if (other.hasFirstPlayerName()) {
                  this.bitField0_ |= 32;
                  this.firstPlayerName_ = other.firstPlayerName_;
                  this.onChanged();
               }

               if (other.hasPassNum()) {
                  this.setPassNum(other.getPassNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChapterId()) {
               return false;
            } else if (!this.hasState()) {
               return false;
            } else if (!this.hasCompleteNum()) {
               return false;
            } else {
               for(int i = 0; i < this.getBoxCount(); ++i) {
                  if (!this.getBox(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            ChapterInfo parsedMessage = null;

            try {
               parsedMessage = (ChapterInfo)ExpeditionMsg.ChapterInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (ChapterInfo)e.getUnfinishedMessage();
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

         public boolean hasCompleteNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getCompleteNum() {
            return this.completeNum_;
         }

         public Builder setCompleteNum(int value) {
            this.bitField0_ |= 4;
            this.completeNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCompleteNum() {
            this.bitField0_ &= -5;
            this.completeNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureBoxIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.box_ = new ArrayList(this.box_);
               this.bitField0_ |= 8;
            }

         }

         public List<CommonMsg.MapDataII> getBoxList() {
            return this.boxBuilder_ == null ? Collections.unmodifiableList(this.box_) : this.boxBuilder_.getMessageList();
         }

         public int getBoxCount() {
            return this.boxBuilder_ == null ? this.box_.size() : this.boxBuilder_.getCount();
         }

         public CommonMsg.MapDataII getBox(int index) {
            return this.boxBuilder_ == null ? (CommonMsg.MapDataII)this.box_.get(index) : (CommonMsg.MapDataII)this.boxBuilder_.getMessage(index);
         }

         public Builder setBox(int index, CommonMsg.MapDataII value) {
            if (this.boxBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBoxIsMutable();
               this.box_.set(index, value);
               this.onChanged();
            } else {
               this.boxBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setBox(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.boxBuilder_ == null) {
               this.ensureBoxIsMutable();
               this.box_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.boxBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addBox(CommonMsg.MapDataII value) {
            if (this.boxBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBoxIsMutable();
               this.box_.add(value);
               this.onChanged();
            } else {
               this.boxBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addBox(int index, CommonMsg.MapDataII value) {
            if (this.boxBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBoxIsMutable();
               this.box_.add(index, value);
               this.onChanged();
            } else {
               this.boxBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addBox(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.boxBuilder_ == null) {
               this.ensureBoxIsMutable();
               this.box_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.boxBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addBox(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.boxBuilder_ == null) {
               this.ensureBoxIsMutable();
               this.box_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.boxBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllBox(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.boxBuilder_ == null) {
               this.ensureBoxIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.box_);
               this.onChanged();
            } else {
               this.boxBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearBox() {
            if (this.boxBuilder_ == null) {
               this.box_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.boxBuilder_.clear();
            }

            return this;
         }

         public Builder removeBox(int index) {
            if (this.boxBuilder_ == null) {
               this.ensureBoxIsMutable();
               this.box_.remove(index);
               this.onChanged();
            } else {
               this.boxBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getBoxBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getBoxFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getBoxOrBuilder(int index) {
            return this.boxBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.box_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.boxBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getBoxOrBuilderList() {
            return this.boxBuilder_ != null ? this.boxBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.box_);
         }

         public CommonMsg.MapDataII.Builder addBoxBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getBoxFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addBoxBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getBoxFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getBoxBuilderList() {
            return this.getBoxFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getBoxFieldBuilder() {
            if (this.boxBuilder_ == null) {
               this.boxBuilder_ = new RepeatedFieldBuilderV3(this.box_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.box_ = null;
            }

            return this.boxBuilder_;
         }

         public boolean hasFirstPlayerId() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getFirstPlayerId() {
            return this.firstPlayerId_;
         }

         public Builder setFirstPlayerId(int value) {
            this.bitField0_ |= 16;
            this.firstPlayerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFirstPlayerId() {
            this.bitField0_ &= -17;
            this.firstPlayerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFirstPlayerName() {
            return (this.bitField0_ & 32) != 0;
         }

         public String getFirstPlayerName() {
            Object ref = this.firstPlayerName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.firstPlayerName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getFirstPlayerNameBytes() {
            Object ref = this.firstPlayerName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.firstPlayerName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setFirstPlayerName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 32;
               this.firstPlayerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearFirstPlayerName() {
            this.bitField0_ &= -33;
            this.firstPlayerName_ = ExpeditionMsg.ChapterInfo.getDefaultInstance().getFirstPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setFirstPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 32;
               this.firstPlayerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasPassNum() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getPassNum() {
            return this.passNum_;
         }

         public Builder setPassNum(int value) {
            this.bitField0_ |= 64;
            this.passNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPassNum() {
            this.bitField0_ &= -65;
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

   public static final class HpData extends GeneratedMessageV3 implements HpDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int HP_FIELD_NUMBER = 2;
      private int hp_;
      private byte memoizedIsInitialized;
      private static final HpData DEFAULT_INSTANCE = new HpData();
      /** @deprecated */
      @Deprecated
      public static final Parser<HpData> PARSER = new AbstractParser<HpData>() {
         public HpData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new HpData(input, extensionRegistry);
         }
      };

      private HpData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private HpData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new HpData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private HpData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.hp_ = input.readInt32();
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_HpData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_HpData_fieldAccessorTable.ensureFieldAccessorsInitialized(HpData.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasHp() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHp() {
         return this.hp_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.hp_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.hp_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof HpData)) {
            return super.equals(obj);
         } else {
            HpData other = (HpData)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasHp() != other.hasHp()) {
               return false;
            } else if (this.hasHp() && this.getHp() != other.getHp()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasHp()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHp();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static HpData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (HpData)PARSER.parseFrom(data);
      }

      public static HpData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HpData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HpData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (HpData)PARSER.parseFrom(data);
      }

      public static HpData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HpData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HpData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (HpData)PARSER.parseFrom(data);
      }

      public static HpData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HpData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HpData parseFrom(InputStream input) throws IOException {
         return (HpData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HpData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HpData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static HpData parseDelimitedFrom(InputStream input) throws IOException {
         return (HpData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static HpData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HpData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static HpData parseFrom(CodedInputStream input) throws IOException {
         return (HpData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HpData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HpData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(HpData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static HpData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<HpData> parser() {
         return PARSER;
      }

      public Parser<HpData> getParserForType() {
         return PARSER;
      }

      public HpData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HpDataOrBuilder {
         private int bitField0_;
         private int code_;
         private int hp_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_HpData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_HpData_fieldAccessorTable.ensureFieldAccessorsInitialized(HpData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.HpData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.hp_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_HpData_descriptor;
         }

         public HpData getDefaultInstanceForType() {
            return ExpeditionMsg.HpData.getDefaultInstance();
         }

         public HpData build() {
            HpData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public HpData buildPartial() {
            HpData result = new HpData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.hp_ = this.hp_;
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
            if (other instanceof HpData) {
               return this.mergeFrom((HpData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(HpData other) {
            if (other == ExpeditionMsg.HpData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasHp()) {
                  this.setHp(other.getHp());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else {
               return this.hasHp();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            HpData parsedMessage = null;

            try {
               parsedMessage = (HpData)ExpeditionMsg.HpData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (HpData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 1;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHp() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHp() {
            return this.hp_;
         }

         public Builder setHp(int value) {
            this.bitField0_ |= 2;
            this.hp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHp() {
            this.bitField0_ &= -3;
            this.hp_ = 0;
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

   public static final class RecordInfo extends GeneratedMessageV3 implements RecordInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 2;
      private volatile Object playerName_;
      public static final int TYPE_FIELD_NUMBER = 3;
      private int type_;
      public static final int CROSSPOWER_FIELD_NUMBER = 4;
      private long crossPower_;
      public static final int CROSSTIME_FIELD_NUMBER = 5;
      private int crossTime_;
      public static final int HEAD_FIELD_NUMBER = 6;
      private int head_;
      public static final int HEADFRAME_FIELD_NUMBER = 7;
      private int headFrame_;
      public static final int HEROINFOS_FIELD_NUMBER = 8;
      private List<CommonMsg.HeroInfo> heroInfos_;
      private byte memoizedIsInitialized;
      private static final RecordInfo DEFAULT_INSTANCE = new RecordInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<RecordInfo> PARSER = new AbstractParser<RecordInfo>() {
         public RecordInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RecordInfo(input, extensionRegistry);
         }
      };

      private RecordInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RecordInfo() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
         this.heroInfos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RecordInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RecordInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.playerName_ = bs;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.type_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.crossPower_ = input.readInt64();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.crossTime_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.head_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.headFrame_ = input.readInt32();
                        break;
                     case 66:
                        if ((mutable_bitField0_ & 128) == 0) {
                           this.heroInfos_ = new ArrayList();
                           mutable_bitField0_ |= 128;
                        }

                        this.heroInfos_.add(input.readMessage(CommonMsg.HeroInfo.PARSER, extensionRegistry));
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
               if ((mutable_bitField0_ & 128) != 0) {
                  this.heroInfos_ = Collections.unmodifiableList(this.heroInfos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_RecordInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_RecordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RecordInfo.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 2) != 0;
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

      public boolean hasType() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasCrossPower() {
         return (this.bitField0_ & 8) != 0;
      }

      public long getCrossPower() {
         return this.crossPower_;
      }

      public boolean hasCrossTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getCrossTime() {
         return this.crossTime_;
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

      public List<CommonMsg.HeroInfo> getHeroInfosList() {
         return this.heroInfos_;
      }

      public List<? extends CommonMsg.HeroInfoOrBuilder> getHeroInfosOrBuilderList() {
         return this.heroInfos_;
      }

      public int getHeroInfosCount() {
         return this.heroInfos_.size();
      }

      public CommonMsg.HeroInfo getHeroInfos(int index) {
         return (CommonMsg.HeroInfo)this.heroInfos_.get(index);
      }

      public CommonMsg.HeroInfoOrBuilder getHeroInfosOrBuilder(int index) {
         return (CommonMsg.HeroInfoOrBuilder)this.heroInfos_.get(index);
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
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCrossPower()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCrossTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeadFrame()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getHeroInfosCount(); ++i) {
               if (!this.getHeroInfos(i).isInitialized()) {
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

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.playerName_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.type_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt64(4, this.crossPower_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.crossTime_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.head_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.headFrame_);
         }

         for(int i = 0; i < this.heroInfos_.size(); ++i) {
            output.writeMessage(8, (MessageLite)this.heroInfos_.get(i));
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
               size += GeneratedMessageV3.computeStringSize(2, this.playerName_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.type_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt64Size(4, this.crossPower_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.crossTime_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.head_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.headFrame_);
            }

            for(int i = 0; i < this.heroInfos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(8, (MessageLite)this.heroInfos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RecordInfo)) {
            return super.equals(obj);
         } else {
            RecordInfo other = (RecordInfo)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasCrossPower() != other.hasCrossPower()) {
               return false;
            } else if (this.hasCrossPower() && this.getCrossPower() != other.getCrossPower()) {
               return false;
            } else if (this.hasCrossTime() != other.hasCrossTime()) {
               return false;
            } else if (this.hasCrossTime() && this.getCrossTime() != other.getCrossTime()) {
               return false;
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
               return false;
            } else if (!this.getHeroInfosList().equals(other.getHeroInfosList())) {
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

            if (this.hasPlayerName()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasType()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getType();
            }

            if (this.hasCrossPower()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashLong(this.getCrossPower());
            }

            if (this.hasCrossTime()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getCrossTime();
            }

            if (this.hasHead()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.getHeroInfosCount() > 0) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getHeroInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RecordInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RecordInfo)PARSER.parseFrom(data);
      }

      public static RecordInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecordInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RecordInfo)PARSER.parseFrom(data);
      }

      public static RecordInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecordInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RecordInfo)PARSER.parseFrom(data);
      }

      public static RecordInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecordInfo parseFrom(InputStream input) throws IOException {
         return (RecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RecordInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RecordInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (RecordInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RecordInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecordInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RecordInfo parseFrom(CodedInputStream input) throws IOException {
         return (RecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RecordInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RecordInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RecordInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RecordInfo> parser() {
         return PARSER;
      }

      public Parser<RecordInfo> getParserForType() {
         return PARSER;
      }

      public RecordInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RecordInfoOrBuilder {
         private int bitField0_;
         private int playerId_;
         private Object playerName_;
         private int type_;
         private long crossPower_;
         private int crossTime_;
         private int head_;
         private int headFrame_;
         private List<CommonMsg.HeroInfo> heroInfos_;
         private RepeatedFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> heroInfosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_RecordInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_RecordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RecordInfo.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.heroInfos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.heroInfos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.RecordInfo.alwaysUseFieldBuilders) {
               this.getHeroInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.playerName_ = "";
            this.bitField0_ &= -3;
            this.type_ = 0;
            this.bitField0_ &= -5;
            this.crossPower_ = 0L;
            this.bitField0_ &= -9;
            this.crossTime_ = 0;
            this.bitField0_ &= -17;
            this.head_ = 0;
            this.bitField0_ &= -33;
            this.headFrame_ = 0;
            this.bitField0_ &= -65;
            if (this.heroInfosBuilder_ == null) {
               this.heroInfos_ = Collections.emptyList();
               this.bitField0_ &= -129;
            } else {
               this.heroInfosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_RecordInfo_descriptor;
         }

         public RecordInfo getDefaultInstanceForType() {
            return ExpeditionMsg.RecordInfo.getDefaultInstance();
         }

         public RecordInfo build() {
            RecordInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RecordInfo buildPartial() {
            RecordInfo result = new RecordInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 4) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.crossPower_ = this.crossPower_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.crossTime_ = this.crossTime_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.head_ = this.head_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 64;
            }

            if (this.heroInfosBuilder_ == null) {
               if ((this.bitField0_ & 128) != 0) {
                  this.heroInfos_ = Collections.unmodifiableList(this.heroInfos_);
                  this.bitField0_ &= -129;
               }

               result.heroInfos_ = this.heroInfos_;
            } else {
               result.heroInfos_ = this.heroInfosBuilder_.build();
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
            if (other instanceof RecordInfo) {
               return this.mergeFrom((RecordInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RecordInfo other) {
            if (other == ExpeditionMsg.RecordInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 2;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasCrossPower()) {
                  this.setCrossPower(other.getCrossPower());
               }

               if (other.hasCrossTime()) {
                  this.setCrossTime(other.getCrossTime());
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               if (this.heroInfosBuilder_ == null) {
                  if (!other.heroInfos_.isEmpty()) {
                     if (this.heroInfos_.isEmpty()) {
                        this.heroInfos_ = other.heroInfos_;
                        this.bitField0_ &= -129;
                     } else {
                        this.ensureHeroInfosIsMutable();
                        this.heroInfos_.addAll(other.heroInfos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.heroInfos_.isEmpty()) {
                  if (this.heroInfosBuilder_.isEmpty()) {
                     this.heroInfosBuilder_.dispose();
                     this.heroInfosBuilder_ = null;
                     this.heroInfos_ = other.heroInfos_;
                     this.bitField0_ &= -129;
                     this.heroInfosBuilder_ = ExpeditionMsg.RecordInfo.alwaysUseFieldBuilders ? this.getHeroInfosFieldBuilder() : null;
                  } else {
                     this.heroInfosBuilder_.addAllMessages(other.heroInfos_);
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
            } else if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasType()) {
               return false;
            } else if (!this.hasCrossPower()) {
               return false;
            } else if (!this.hasCrossTime()) {
               return false;
            } else if (!this.hasHead()) {
               return false;
            } else if (!this.hasHeadFrame()) {
               return false;
            } else {
               for(int i = 0; i < this.getHeroInfosCount(); ++i) {
                  if (!this.getHeroInfos(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RecordInfo parsedMessage = null;

            try {
               parsedMessage = (RecordInfo)ExpeditionMsg.RecordInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RecordInfo)e.getUnfinishedMessage();
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

         public boolean hasPlayerName() {
            return (this.bitField0_ & 2) != 0;
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
               this.bitField0_ |= 2;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -3;
            this.playerName_ = ExpeditionMsg.RecordInfo.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
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

         public boolean hasCrossPower() {
            return (this.bitField0_ & 8) != 0;
         }

         public long getCrossPower() {
            return this.crossPower_;
         }

         public Builder setCrossPower(long value) {
            this.bitField0_ |= 8;
            this.crossPower_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCrossPower() {
            this.bitField0_ &= -9;
            this.crossPower_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasCrossTime() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getCrossTime() {
            return this.crossTime_;
         }

         public Builder setCrossTime(int value) {
            this.bitField0_ |= 16;
            this.crossTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCrossTime() {
            this.bitField0_ &= -17;
            this.crossTime_ = 0;
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

         private void ensureHeroInfosIsMutable() {
            if ((this.bitField0_ & 128) == 0) {
               this.heroInfos_ = new ArrayList(this.heroInfos_);
               this.bitField0_ |= 128;
            }

         }

         public List<CommonMsg.HeroInfo> getHeroInfosList() {
            return this.heroInfosBuilder_ == null ? Collections.unmodifiableList(this.heroInfos_) : this.heroInfosBuilder_.getMessageList();
         }

         public int getHeroInfosCount() {
            return this.heroInfosBuilder_ == null ? this.heroInfos_.size() : this.heroInfosBuilder_.getCount();
         }

         public CommonMsg.HeroInfo getHeroInfos(int index) {
            return this.heroInfosBuilder_ == null ? (CommonMsg.HeroInfo)this.heroInfos_.get(index) : (CommonMsg.HeroInfo)this.heroInfosBuilder_.getMessage(index);
         }

         public Builder setHeroInfos(int index, CommonMsg.HeroInfo value) {
            if (this.heroInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroInfosIsMutable();
               this.heroInfos_.set(index, value);
               this.onChanged();
            } else {
               this.heroInfosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setHeroInfos(int index, CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.heroInfosBuilder_ == null) {
               this.ensureHeroInfosIsMutable();
               this.heroInfos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroInfosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHeroInfos(CommonMsg.HeroInfo value) {
            if (this.heroInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroInfosIsMutable();
               this.heroInfos_.add(value);
               this.onChanged();
            } else {
               this.heroInfosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addHeroInfos(int index, CommonMsg.HeroInfo value) {
            if (this.heroInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroInfosIsMutable();
               this.heroInfos_.add(index, value);
               this.onChanged();
            } else {
               this.heroInfosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addHeroInfos(CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.heroInfosBuilder_ == null) {
               this.ensureHeroInfosIsMutable();
               this.heroInfos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.heroInfosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHeroInfos(int index, CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.heroInfosBuilder_ == null) {
               this.ensureHeroInfosIsMutable();
               this.heroInfos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroInfosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHeroInfos(Iterable<? extends CommonMsg.HeroInfo> values) {
            if (this.heroInfosBuilder_ == null) {
               this.ensureHeroInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroInfos_);
               this.onChanged();
            } else {
               this.heroInfosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearHeroInfos() {
            if (this.heroInfosBuilder_ == null) {
               this.heroInfos_ = Collections.emptyList();
               this.bitField0_ &= -129;
               this.onChanged();
            } else {
               this.heroInfosBuilder_.clear();
            }

            return this;
         }

         public Builder removeHeroInfos(int index) {
            if (this.heroInfosBuilder_ == null) {
               this.ensureHeroInfosIsMutable();
               this.heroInfos_.remove(index);
               this.onChanged();
            } else {
               this.heroInfosBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.HeroInfo.Builder getHeroInfosBuilder(int index) {
            return (CommonMsg.HeroInfo.Builder)this.getHeroInfosFieldBuilder().getBuilder(index);
         }

         public CommonMsg.HeroInfoOrBuilder getHeroInfosOrBuilder(int index) {
            return this.heroInfosBuilder_ == null ? (CommonMsg.HeroInfoOrBuilder)this.heroInfos_.get(index) : (CommonMsg.HeroInfoOrBuilder)this.heroInfosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.HeroInfoOrBuilder> getHeroInfosOrBuilderList() {
            return this.heroInfosBuilder_ != null ? this.heroInfosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.heroInfos_);
         }

         public CommonMsg.HeroInfo.Builder addHeroInfosBuilder() {
            return (CommonMsg.HeroInfo.Builder)this.getHeroInfosFieldBuilder().addBuilder(CommonMsg.HeroInfo.getDefaultInstance());
         }

         public CommonMsg.HeroInfo.Builder addHeroInfosBuilder(int index) {
            return (CommonMsg.HeroInfo.Builder)this.getHeroInfosFieldBuilder().addBuilder(index, CommonMsg.HeroInfo.getDefaultInstance());
         }

         public List<CommonMsg.HeroInfo.Builder> getHeroInfosBuilderList() {
            return this.getHeroInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> getHeroInfosFieldBuilder() {
            if (this.heroInfosBuilder_ == null) {
               this.heroInfosBuilder_ = new RepeatedFieldBuilderV3(this.heroInfos_, (this.bitField0_ & 128) != 0, this.getParentForChildren(), this.isClean());
               this.heroInfos_ = null;
            }

            return this.heroInfosBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class MercenaryInfo extends GeneratedMessageV3 implements MercenaryInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int HEROINFO_FIELD_NUMBER = 2;
      private CommonMsg.HeroInfo heroInfo_;
      public static final int BEMPLOY_FIELD_NUMBER = 3;
      private boolean bEmploy_;
      private byte memoizedIsInitialized;
      private static final MercenaryInfo DEFAULT_INSTANCE = new MercenaryInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<MercenaryInfo> PARSER = new AbstractParser<MercenaryInfo>() {
         public MercenaryInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MercenaryInfo(input, extensionRegistry);
         }
      };

      private MercenaryInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private MercenaryInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new MercenaryInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private MercenaryInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bEmploy_ = input.readBool();
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_MercenaryInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_MercenaryInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MercenaryInfo.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
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

      public boolean hasBEmploy() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getBEmploy() {
         return this.bEmploy_;
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
            output.writeInt32(1, this.playerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getHeroInfo());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.bEmploy_);
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
               size += CodedOutputStream.computeMessageSize(2, this.getHeroInfo());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.bEmploy_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MercenaryInfo)) {
            return super.equals(obj);
         } else {
            MercenaryInfo other = (MercenaryInfo)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasHeroInfo() != other.hasHeroInfo()) {
               return false;
            } else if (this.hasHeroInfo() && !this.getHeroInfo().equals(other.getHeroInfo())) {
               return false;
            } else if (this.hasBEmploy() != other.hasBEmploy()) {
               return false;
            } else if (this.hasBEmploy() && this.getBEmploy() != other.getBEmploy()) {
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

            if (this.hasHeroInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroInfo().hashCode();
            }

            if (this.hasBEmploy()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getBEmploy());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MercenaryInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MercenaryInfo)PARSER.parseFrom(data);
      }

      public static MercenaryInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MercenaryInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MercenaryInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MercenaryInfo)PARSER.parseFrom(data);
      }

      public static MercenaryInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MercenaryInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MercenaryInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MercenaryInfo)PARSER.parseFrom(data);
      }

      public static MercenaryInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MercenaryInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MercenaryInfo parseFrom(InputStream input) throws IOException {
         return (MercenaryInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MercenaryInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MercenaryInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MercenaryInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (MercenaryInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MercenaryInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MercenaryInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MercenaryInfo parseFrom(CodedInputStream input) throws IOException {
         return (MercenaryInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MercenaryInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MercenaryInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(MercenaryInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static MercenaryInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MercenaryInfo> parser() {
         return PARSER;
      }

      public Parser<MercenaryInfo> getParserForType() {
         return PARSER;
      }

      public MercenaryInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MercenaryInfoOrBuilder {
         private int bitField0_;
         private int playerId_;
         private CommonMsg.HeroInfo heroInfo_;
         private SingleFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> heroInfoBuilder_;
         private boolean bEmploy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_MercenaryInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_MercenaryInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MercenaryInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.MercenaryInfo.alwaysUseFieldBuilders) {
               this.getHeroInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            this.bEmploy_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_MercenaryInfo_descriptor;
         }

         public MercenaryInfo getDefaultInstanceForType() {
            return ExpeditionMsg.MercenaryInfo.getDefaultInstance();
         }

         public MercenaryInfo build() {
            MercenaryInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MercenaryInfo buildPartial() {
            MercenaryInfo result = new MercenaryInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
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
               result.bEmploy_ = this.bEmploy_;
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
            if (other instanceof MercenaryInfo) {
               return this.mergeFrom((MercenaryInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(MercenaryInfo other) {
            if (other == ExpeditionMsg.MercenaryInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasHeroInfo()) {
                  this.mergeHeroInfo(other.getHeroInfo());
               }

               if (other.hasBEmploy()) {
                  this.setBEmploy(other.getBEmploy());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasHeroInfo()) {
               return false;
            } else {
               return this.getHeroInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MercenaryInfo parsedMessage = null;

            try {
               parsedMessage = (MercenaryInfo)ExpeditionMsg.MercenaryInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (MercenaryInfo)e.getUnfinishedMessage();
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

         public boolean hasBEmploy() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getBEmploy() {
            return this.bEmploy_;
         }

         public Builder setBEmploy(boolean value) {
            this.bitField0_ |= 4;
            this.bEmploy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBEmploy() {
            this.bitField0_ &= -5;
            this.bEmploy_ = false;
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

   public static final class C2S_Chapters_10301 extends GeneratedMessageV3 implements C2S_Chapters_10301OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Chapters_10301 DEFAULT_INSTANCE = new C2S_Chapters_10301();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Chapters_10301> PARSER = new AbstractParser<C2S_Chapters_10301>() {
         public C2S_Chapters_10301 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Chapters_10301(input, extensionRegistry);
         }
      };

      private C2S_Chapters_10301(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Chapters_10301() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Chapters_10301();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Chapters_10301(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_Chapters_10301_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_Chapters_10301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Chapters_10301.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Chapters_10301)) {
            return super.equals(obj);
         } else {
            C2S_Chapters_10301 other = (C2S_Chapters_10301)obj;
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

      public static C2S_Chapters_10301 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Chapters_10301)PARSER.parseFrom(data);
      }

      public static C2S_Chapters_10301 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Chapters_10301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Chapters_10301 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Chapters_10301)PARSER.parseFrom(data);
      }

      public static C2S_Chapters_10301 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Chapters_10301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Chapters_10301 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Chapters_10301)PARSER.parseFrom(data);
      }

      public static C2S_Chapters_10301 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Chapters_10301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Chapters_10301 parseFrom(InputStream input) throws IOException {
         return (C2S_Chapters_10301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Chapters_10301 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Chapters_10301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Chapters_10301 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Chapters_10301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Chapters_10301 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Chapters_10301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Chapters_10301 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Chapters_10301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Chapters_10301 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Chapters_10301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Chapters_10301 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Chapters_10301 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Chapters_10301> parser() {
         return PARSER;
      }

      public Parser<C2S_Chapters_10301> getParserForType() {
         return PARSER;
      }

      public C2S_Chapters_10301 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Chapters_10301OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_Chapters_10301_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_Chapters_10301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Chapters_10301.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.C2S_Chapters_10301.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_Chapters_10301_descriptor;
         }

         public C2S_Chapters_10301 getDefaultInstanceForType() {
            return ExpeditionMsg.C2S_Chapters_10301.getDefaultInstance();
         }

         public C2S_Chapters_10301 build() {
            C2S_Chapters_10301 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Chapters_10301 buildPartial() {
            C2S_Chapters_10301 result = new C2S_Chapters_10301(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_Chapters_10301) {
               return this.mergeFrom((C2S_Chapters_10301)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Chapters_10301 other) {
            if (other == ExpeditionMsg.C2S_Chapters_10301.getDefaultInstance()) {
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
            C2S_Chapters_10301 parsedMessage = null;

            try {
               parsedMessage = (C2S_Chapters_10301)ExpeditionMsg.C2S_Chapters_10301.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Chapters_10301)e.getUnfinishedMessage();
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

   public static final class S2C_Chapters_10302 extends GeneratedMessageV3 implements S2C_Chapters_10302OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHAPTERINFO_FIELD_NUMBER = 1;
      private List<ChapterInfo> chapterInfo_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final S2C_Chapters_10302 DEFAULT_INSTANCE = new S2C_Chapters_10302();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Chapters_10302> PARSER = new AbstractParser<S2C_Chapters_10302>() {
         public S2C_Chapters_10302 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Chapters_10302(input, extensionRegistry);
         }
      };

      private S2C_Chapters_10302(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Chapters_10302() {
         this.memoizedIsInitialized = -1;
         this.chapterInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Chapters_10302();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Chapters_10302(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.chapterInfo_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.chapterInfo_.add(input.readMessage(ExpeditionMsg.ChapterInfo.PARSER, extensionRegistry));
                        break;
                     case 16:
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
               if ((mutable_bitField0_ & 1) != 0) {
                  this.chapterInfo_ = Collections.unmodifiableList(this.chapterInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_Chapters_10302_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_Chapters_10302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Chapters_10302.class, Builder.class);
      }

      public List<ChapterInfo> getChapterInfoList() {
         return this.chapterInfo_;
      }

      public List<? extends ChapterInfoOrBuilder> getChapterInfoOrBuilderList() {
         return this.chapterInfo_;
      }

      public int getChapterInfoCount() {
         return this.chapterInfo_.size();
      }

      public ChapterInfo getChapterInfo(int index) {
         return (ChapterInfo)this.chapterInfo_.get(index);
      }

      public ChapterInfoOrBuilder getChapterInfoOrBuilder(int index) {
         return (ChapterInfoOrBuilder)this.chapterInfo_.get(index);
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
            for(int i = 0; i < this.getChapterInfoCount(); ++i) {
               if (!this.getChapterInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.chapterInfo_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.chapterInfo_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.heroCode_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.chapterInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.chapterInfo_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.heroCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Chapters_10302)) {
            return super.equals(obj);
         } else {
            S2C_Chapters_10302 other = (S2C_Chapters_10302)obj;
            if (!this.getChapterInfoList().equals(other.getChapterInfoList())) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
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
            if (this.getChapterInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChapterInfoList().hashCode();
            }

            if (this.hasHeroCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Chapters_10302 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Chapters_10302)PARSER.parseFrom(data);
      }

      public static S2C_Chapters_10302 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Chapters_10302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Chapters_10302 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Chapters_10302)PARSER.parseFrom(data);
      }

      public static S2C_Chapters_10302 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Chapters_10302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Chapters_10302 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Chapters_10302)PARSER.parseFrom(data);
      }

      public static S2C_Chapters_10302 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Chapters_10302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Chapters_10302 parseFrom(InputStream input) throws IOException {
         return (S2C_Chapters_10302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Chapters_10302 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Chapters_10302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Chapters_10302 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Chapters_10302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Chapters_10302 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Chapters_10302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Chapters_10302 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Chapters_10302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Chapters_10302 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Chapters_10302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Chapters_10302 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Chapters_10302 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Chapters_10302> parser() {
         return PARSER;
      }

      public Parser<S2C_Chapters_10302> getParserForType() {
         return PARSER;
      }

      public S2C_Chapters_10302 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Chapters_10302OrBuilder {
         private int bitField0_;
         private List<ChapterInfo> chapterInfo_;
         private RepeatedFieldBuilderV3<ChapterInfo, ChapterInfo.Builder, ChapterInfoOrBuilder> chapterInfoBuilder_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_Chapters_10302_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_Chapters_10302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Chapters_10302.class, Builder.class);
         }

         private Builder() {
            this.chapterInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.chapterInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.S2C_Chapters_10302.alwaysUseFieldBuilders) {
               this.getChapterInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.chapterInfoBuilder_ == null) {
               this.chapterInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.chapterInfoBuilder_.clear();
            }

            this.heroCode_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_Chapters_10302_descriptor;
         }

         public S2C_Chapters_10302 getDefaultInstanceForType() {
            return ExpeditionMsg.S2C_Chapters_10302.getDefaultInstance();
         }

         public S2C_Chapters_10302 build() {
            S2C_Chapters_10302 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Chapters_10302 buildPartial() {
            S2C_Chapters_10302 result = new S2C_Chapters_10302(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.chapterInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.chapterInfo_ = Collections.unmodifiableList(this.chapterInfo_);
                  this.bitField0_ &= -2;
               }

               result.chapterInfo_ = this.chapterInfo_;
            } else {
               result.chapterInfo_ = this.chapterInfoBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
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
            if (other instanceof S2C_Chapters_10302) {
               return this.mergeFrom((S2C_Chapters_10302)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Chapters_10302 other) {
            if (other == ExpeditionMsg.S2C_Chapters_10302.getDefaultInstance()) {
               return this;
            } else {
               if (this.chapterInfoBuilder_ == null) {
                  if (!other.chapterInfo_.isEmpty()) {
                     if (this.chapterInfo_.isEmpty()) {
                        this.chapterInfo_ = other.chapterInfo_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureChapterInfoIsMutable();
                        this.chapterInfo_.addAll(other.chapterInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.chapterInfo_.isEmpty()) {
                  if (this.chapterInfoBuilder_.isEmpty()) {
                     this.chapterInfoBuilder_.dispose();
                     this.chapterInfoBuilder_ = null;
                     this.chapterInfo_ = other.chapterInfo_;
                     this.bitField0_ &= -2;
                     this.chapterInfoBuilder_ = ExpeditionMsg.S2C_Chapters_10302.alwaysUseFieldBuilders ? this.getChapterInfoFieldBuilder() : null;
                  } else {
                     this.chapterInfoBuilder_.addAllMessages(other.chapterInfo_);
                  }
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else {
               for(int i = 0; i < this.getChapterInfoCount(); ++i) {
                  if (!this.getChapterInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Chapters_10302 parsedMessage = null;

            try {
               parsedMessage = (S2C_Chapters_10302)ExpeditionMsg.S2C_Chapters_10302.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Chapters_10302)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureChapterInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.chapterInfo_ = new ArrayList(this.chapterInfo_);
               this.bitField0_ |= 1;
            }

         }

         public List<ChapterInfo> getChapterInfoList() {
            return this.chapterInfoBuilder_ == null ? Collections.unmodifiableList(this.chapterInfo_) : this.chapterInfoBuilder_.getMessageList();
         }

         public int getChapterInfoCount() {
            return this.chapterInfoBuilder_ == null ? this.chapterInfo_.size() : this.chapterInfoBuilder_.getCount();
         }

         public ChapterInfo getChapterInfo(int index) {
            return this.chapterInfoBuilder_ == null ? (ChapterInfo)this.chapterInfo_.get(index) : (ChapterInfo)this.chapterInfoBuilder_.getMessage(index);
         }

         public Builder setChapterInfo(int index, ChapterInfo value) {
            if (this.chapterInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.set(index, value);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setChapterInfo(int index, ChapterInfo.Builder builderForValue) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addChapterInfo(ChapterInfo value) {
            if (this.chapterInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.add(value);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addChapterInfo(int index, ChapterInfo value) {
            if (this.chapterInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.add(index, value);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addChapterInfo(ChapterInfo.Builder builderForValue) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addChapterInfo(int index, ChapterInfo.Builder builderForValue) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllChapterInfo(Iterable<? extends ChapterInfo> values) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.chapterInfo_);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearChapterInfo() {
            if (this.chapterInfoBuilder_ == null) {
               this.chapterInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeChapterInfo(int index) {
            if (this.chapterInfoBuilder_ == null) {
               this.ensureChapterInfoIsMutable();
               this.chapterInfo_.remove(index);
               this.onChanged();
            } else {
               this.chapterInfoBuilder_.remove(index);
            }

            return this;
         }

         public ChapterInfo.Builder getChapterInfoBuilder(int index) {
            return (ChapterInfo.Builder)this.getChapterInfoFieldBuilder().getBuilder(index);
         }

         public ChapterInfoOrBuilder getChapterInfoOrBuilder(int index) {
            return this.chapterInfoBuilder_ == null ? (ChapterInfoOrBuilder)this.chapterInfo_.get(index) : (ChapterInfoOrBuilder)this.chapterInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ChapterInfoOrBuilder> getChapterInfoOrBuilderList() {
            return this.chapterInfoBuilder_ != null ? this.chapterInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.chapterInfo_);
         }

         public ChapterInfo.Builder addChapterInfoBuilder() {
            return (ChapterInfo.Builder)this.getChapterInfoFieldBuilder().addBuilder(ExpeditionMsg.ChapterInfo.getDefaultInstance());
         }

         public ChapterInfo.Builder addChapterInfoBuilder(int index) {
            return (ChapterInfo.Builder)this.getChapterInfoFieldBuilder().addBuilder(index, ExpeditionMsg.ChapterInfo.getDefaultInstance());
         }

         public List<ChapterInfo.Builder> getChapterInfoBuilderList() {
            return this.getChapterInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ChapterInfo, ChapterInfo.Builder, ChapterInfoOrBuilder> getChapterInfoFieldBuilder() {
            if (this.chapterInfoBuilder_ == null) {
               this.chapterInfoBuilder_ = new RepeatedFieldBuilderV3(this.chapterInfo_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.chapterInfo_ = null;
            }

            return this.chapterInfoBuilder_;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 2;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -3;
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

   public static final class C2S_EnterChapter_10303 extends GeneratedMessageV3 implements C2S_EnterChapter_10303OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHAPTERID_FIELD_NUMBER = 1;
      private int chapterId_;
      public static final int ACTIVITYID_FIELD_NUMBER = 2;
      private int activityId_;
      private byte memoizedIsInitialized;
      private static final C2S_EnterChapter_10303 DEFAULT_INSTANCE = new C2S_EnterChapter_10303();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_EnterChapter_10303> PARSER = new AbstractParser<C2S_EnterChapter_10303>() {
         public C2S_EnterChapter_10303 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_EnterChapter_10303(input, extensionRegistry);
         }
      };

      private C2S_EnterChapter_10303(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_EnterChapter_10303() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_EnterChapter_10303();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_EnterChapter_10303(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.activityId_ = input.readInt32();
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_EnterChapter_10303_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_EnterChapter_10303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnterChapter_10303.class, Builder.class);
      }

      public boolean hasChapterId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChapterId() {
         return this.chapterId_;
      }

      public boolean hasActivityId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getActivityId() {
         return this.activityId_;
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
            output.writeInt32(2, this.activityId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.activityId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_EnterChapter_10303)) {
            return super.equals(obj);
         } else {
            C2S_EnterChapter_10303 other = (C2S_EnterChapter_10303)obj;
            if (this.hasChapterId() != other.hasChapterId()) {
               return false;
            } else if (this.hasChapterId() && this.getChapterId() != other.getChapterId()) {
               return false;
            } else if (this.hasActivityId() != other.hasActivityId()) {
               return false;
            } else if (this.hasActivityId() && this.getActivityId() != other.getActivityId()) {
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

            if (this.hasActivityId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getActivityId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_EnterChapter_10303 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_EnterChapter_10303)PARSER.parseFrom(data);
      }

      public static C2S_EnterChapter_10303 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterChapter_10303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterChapter_10303 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_EnterChapter_10303)PARSER.parseFrom(data);
      }

      public static C2S_EnterChapter_10303 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterChapter_10303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterChapter_10303 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_EnterChapter_10303)PARSER.parseFrom(data);
      }

      public static C2S_EnterChapter_10303 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterChapter_10303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterChapter_10303 parseFrom(InputStream input) throws IOException {
         return (C2S_EnterChapter_10303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnterChapter_10303 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterChapter_10303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnterChapter_10303 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_EnterChapter_10303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_EnterChapter_10303 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterChapter_10303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnterChapter_10303 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_EnterChapter_10303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnterChapter_10303 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterChapter_10303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_EnterChapter_10303 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_EnterChapter_10303 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_EnterChapter_10303> parser() {
         return PARSER;
      }

      public Parser<C2S_EnterChapter_10303> getParserForType() {
         return PARSER;
      }

      public C2S_EnterChapter_10303 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_EnterChapter_10303OrBuilder {
         private int bitField0_;
         private int chapterId_;
         private int activityId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_EnterChapter_10303_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_EnterChapter_10303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnterChapter_10303.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.C2S_EnterChapter_10303.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.chapterId_ = 0;
            this.bitField0_ &= -2;
            this.activityId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_EnterChapter_10303_descriptor;
         }

         public C2S_EnterChapter_10303 getDefaultInstanceForType() {
            return ExpeditionMsg.C2S_EnterChapter_10303.getDefaultInstance();
         }

         public C2S_EnterChapter_10303 build() {
            C2S_EnterChapter_10303 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_EnterChapter_10303 buildPartial() {
            C2S_EnterChapter_10303 result = new C2S_EnterChapter_10303(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.chapterId_ = this.chapterId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.activityId_ = this.activityId_;
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
            if (other instanceof C2S_EnterChapter_10303) {
               return this.mergeFrom((C2S_EnterChapter_10303)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_EnterChapter_10303 other) {
            if (other == ExpeditionMsg.C2S_EnterChapter_10303.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChapterId()) {
                  this.setChapterId(other.getChapterId());
               }

               if (other.hasActivityId()) {
                  this.setActivityId(other.getActivityId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasChapterId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_EnterChapter_10303 parsedMessage = null;

            try {
               parsedMessage = (C2S_EnterChapter_10303)ExpeditionMsg.C2S_EnterChapter_10303.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_EnterChapter_10303)e.getUnfinishedMessage();
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

         public boolean hasActivityId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getActivityId() {
            return this.activityId_;
         }

         public Builder setActivityId(int value) {
            this.bitField0_ |= 2;
            this.activityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityId() {
            this.bitField0_ &= -3;
            this.activityId_ = 0;
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

   public static final class S2C_EnterChapter_10304 extends GeneratedMessageV3 implements S2C_EnterChapter_10304OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHAPTERID_FIELD_NUMBER = 1;
      private int chapterId_;
      public static final int CURGRID_FIELD_NUMBER = 2;
      private int curGrid_;
      public static final int GRIDINFO_FIELD_NUMBER = 3;
      private List<S2C_GridInfo_10314> gridInfo_;
      public static final int BUFFS_FIELD_NUMBER = 4;
      private Internal.IntList buffs_;
      public static final int HEROID_FIELD_NUMBER = 5;
      private int heroId_;
      public static final int TEMPPROPS_FIELD_NUMBER = 6;
      private List<CommonMsg.ItemInfo> tempProps_;
      private byte memoizedIsInitialized;
      private static final S2C_EnterChapter_10304 DEFAULT_INSTANCE = new S2C_EnterChapter_10304();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_EnterChapter_10304> PARSER = new AbstractParser<S2C_EnterChapter_10304>() {
         public S2C_EnterChapter_10304 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_EnterChapter_10304(input, extensionRegistry);
         }
      };

      private S2C_EnterChapter_10304(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_EnterChapter_10304() {
         this.memoizedIsInitialized = -1;
         this.gridInfo_ = Collections.emptyList();
         this.buffs_ = emptyIntList();
         this.tempProps_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_EnterChapter_10304();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_EnterChapter_10304(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.chapterId_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.curGrid_ = input.readInt32();
                        continue;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.gridInfo_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.gridInfo_.add(input.readMessage(ExpeditionMsg.S2C_GridInfo_10314.PARSER, extensionRegistry));
                        continue;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.buffs_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.buffs_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.buffs_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }
                        break;
                     case 40:
                        this.bitField0_ |= 4;
                        this.heroId_ = input.readInt32();
                        continue;
                     case 50:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.tempProps_ = new ArrayList();
                           mutable_bitField0_ |= 32;
                        }

                        this.tempProps_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.buffs_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.gridInfo_ = Collections.unmodifiableList(this.gridInfo_);
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.buffs_.makeImmutable();
               }

               if ((mutable_bitField0_ & 32) != 0) {
                  this.tempProps_ = Collections.unmodifiableList(this.tempProps_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_EnterChapter_10304_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_EnterChapter_10304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnterChapter_10304.class, Builder.class);
      }

      public boolean hasChapterId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChapterId() {
         return this.chapterId_;
      }

      public boolean hasCurGrid() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCurGrid() {
         return this.curGrid_;
      }

      public List<S2C_GridInfo_10314> getGridInfoList() {
         return this.gridInfo_;
      }

      public List<? extends S2C_GridInfo_10314OrBuilder> getGridInfoOrBuilderList() {
         return this.gridInfo_;
      }

      public int getGridInfoCount() {
         return this.gridInfo_.size();
      }

      public S2C_GridInfo_10314 getGridInfo(int index) {
         return (S2C_GridInfo_10314)this.gridInfo_.get(index);
      }

      public S2C_GridInfo_10314OrBuilder getGridInfoOrBuilder(int index) {
         return (S2C_GridInfo_10314OrBuilder)this.gridInfo_.get(index);
      }

      public List<Integer> getBuffsList() {
         return this.buffs_;
      }

      public int getBuffsCount() {
         return this.buffs_.size();
      }

      public int getBuffs(int index) {
         return this.buffs_.getInt(index);
      }

      public boolean hasHeroId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHeroId() {
         return this.heroId_;
      }

      public List<CommonMsg.ItemInfo> getTempPropsList() {
         return this.tempProps_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getTempPropsOrBuilderList() {
         return this.tempProps_;
      }

      public int getTempPropsCount() {
         return this.tempProps_.size();
      }

      public CommonMsg.ItemInfo getTempProps(int index) {
         return (CommonMsg.ItemInfo)this.tempProps_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getTempPropsOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.tempProps_.get(index);
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
         } else if (!this.hasCurGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getGridInfoCount(); ++i) {
               if (!this.getGridInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getTempPropsCount(); ++i) {
               if (!this.getTempProps(i).isInitialized()) {
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
            output.writeInt32(1, this.chapterId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.curGrid_);
         }

         for(int i = 0; i < this.gridInfo_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.gridInfo_.get(i));
         }

         for(int i = 0; i < this.buffs_.size(); ++i) {
            output.writeInt32(4, this.buffs_.getInt(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(5, this.heroId_);
         }

         for(int i = 0; i < this.tempProps_.size(); ++i) {
            output.writeMessage(6, (MessageLite)this.tempProps_.get(i));
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
               size += CodedOutputStream.computeInt32Size(2, this.curGrid_);
            }

            for(int i = 0; i < this.gridInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.gridInfo_.get(i));
            }

            int dataSize = 0;

            for(int i = 0; i < this.buffs_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.buffs_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getBuffsList().size();
            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.heroId_);
            }

            for(int i = 0; i < this.tempProps_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(6, (MessageLite)this.tempProps_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_EnterChapter_10304)) {
            return super.equals(obj);
         } else {
            S2C_EnterChapter_10304 other = (S2C_EnterChapter_10304)obj;
            if (this.hasChapterId() != other.hasChapterId()) {
               return false;
            } else if (this.hasChapterId() && this.getChapterId() != other.getChapterId()) {
               return false;
            } else if (this.hasCurGrid() != other.hasCurGrid()) {
               return false;
            } else if (this.hasCurGrid() && this.getCurGrid() != other.getCurGrid()) {
               return false;
            } else if (!this.getGridInfoList().equals(other.getGridInfoList())) {
               return false;
            } else if (!this.getBuffsList().equals(other.getBuffsList())) {
               return false;
            } else if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
               return false;
            } else if (!this.getTempPropsList().equals(other.getTempPropsList())) {
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

            if (this.hasCurGrid()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCurGrid();
            }

            if (this.getGridInfoCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGridInfoList().hashCode();
            }

            if (this.getBuffsCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getBuffsList().hashCode();
            }

            if (this.hasHeroId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getHeroId();
            }

            if (this.getTempPropsCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getTempPropsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_EnterChapter_10304 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_EnterChapter_10304)PARSER.parseFrom(data);
      }

      public static S2C_EnterChapter_10304 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnterChapter_10304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnterChapter_10304 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_EnterChapter_10304)PARSER.parseFrom(data);
      }

      public static S2C_EnterChapter_10304 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnterChapter_10304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnterChapter_10304 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_EnterChapter_10304)PARSER.parseFrom(data);
      }

      public static S2C_EnterChapter_10304 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnterChapter_10304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnterChapter_10304 parseFrom(InputStream input) throws IOException {
         return (S2C_EnterChapter_10304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnterChapter_10304 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnterChapter_10304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnterChapter_10304 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_EnterChapter_10304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_EnterChapter_10304 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnterChapter_10304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnterChapter_10304 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_EnterChapter_10304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnterChapter_10304 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnterChapter_10304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_EnterChapter_10304 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_EnterChapter_10304 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_EnterChapter_10304> parser() {
         return PARSER;
      }

      public Parser<S2C_EnterChapter_10304> getParserForType() {
         return PARSER;
      }

      public S2C_EnterChapter_10304 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_EnterChapter_10304OrBuilder {
         private int bitField0_;
         private int chapterId_;
         private int curGrid_;
         private List<S2C_GridInfo_10314> gridInfo_;
         private RepeatedFieldBuilderV3<S2C_GridInfo_10314, S2C_GridInfo_10314.Builder, S2C_GridInfo_10314OrBuilder> gridInfoBuilder_;
         private Internal.IntList buffs_;
         private int heroId_;
         private List<CommonMsg.ItemInfo> tempProps_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> tempPropsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_EnterChapter_10304_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_EnterChapter_10304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnterChapter_10304.class, Builder.class);
         }

         private Builder() {
            this.gridInfo_ = Collections.emptyList();
            this.buffs_ = ExpeditionMsg.S2C_EnterChapter_10304.emptyIntList();
            this.tempProps_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gridInfo_ = Collections.emptyList();
            this.buffs_ = ExpeditionMsg.S2C_EnterChapter_10304.emptyIntList();
            this.tempProps_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.S2C_EnterChapter_10304.alwaysUseFieldBuilders) {
               this.getGridInfoFieldBuilder();
               this.getTempPropsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.chapterId_ = 0;
            this.bitField0_ &= -2;
            this.curGrid_ = 0;
            this.bitField0_ &= -3;
            if (this.gridInfoBuilder_ == null) {
               this.gridInfo_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.gridInfoBuilder_.clear();
            }

            this.buffs_ = ExpeditionMsg.S2C_EnterChapter_10304.emptyIntList();
            this.bitField0_ &= -9;
            this.heroId_ = 0;
            this.bitField0_ &= -17;
            if (this.tempPropsBuilder_ == null) {
               this.tempProps_ = Collections.emptyList();
               this.bitField0_ &= -33;
            } else {
               this.tempPropsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_EnterChapter_10304_descriptor;
         }

         public S2C_EnterChapter_10304 getDefaultInstanceForType() {
            return ExpeditionMsg.S2C_EnterChapter_10304.getDefaultInstance();
         }

         public S2C_EnterChapter_10304 build() {
            S2C_EnterChapter_10304 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_EnterChapter_10304 buildPartial() {
            S2C_EnterChapter_10304 result = new S2C_EnterChapter_10304(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.chapterId_ = this.chapterId_;
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

            if ((this.bitField0_ & 8) != 0) {
               this.buffs_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.buffs_ = this.buffs_;
            if ((from_bitField0_ & 16) != 0) {
               result.heroId_ = this.heroId_;
               to_bitField0_ |= 4;
            }

            if (this.tempPropsBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0) {
                  this.tempProps_ = Collections.unmodifiableList(this.tempProps_);
                  this.bitField0_ &= -33;
               }

               result.tempProps_ = this.tempProps_;
            } else {
               result.tempProps_ = this.tempPropsBuilder_.build();
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
            if (other instanceof S2C_EnterChapter_10304) {
               return this.mergeFrom((S2C_EnterChapter_10304)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_EnterChapter_10304 other) {
            if (other == ExpeditionMsg.S2C_EnterChapter_10304.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChapterId()) {
                  this.setChapterId(other.getChapterId());
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
                     this.gridInfoBuilder_ = ExpeditionMsg.S2C_EnterChapter_10304.alwaysUseFieldBuilders ? this.getGridInfoFieldBuilder() : null;
                  } else {
                     this.gridInfoBuilder_.addAllMessages(other.gridInfo_);
                  }
               }

               if (!other.buffs_.isEmpty()) {
                  if (this.buffs_.isEmpty()) {
                     this.buffs_ = other.buffs_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureBuffsIsMutable();
                     this.buffs_.addAll(other.buffs_);
                  }

                  this.onChanged();
               }

               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               if (this.tempPropsBuilder_ == null) {
                  if (!other.tempProps_.isEmpty()) {
                     if (this.tempProps_.isEmpty()) {
                        this.tempProps_ = other.tempProps_;
                        this.bitField0_ &= -33;
                     } else {
                        this.ensureTempPropsIsMutable();
                        this.tempProps_.addAll(other.tempProps_);
                     }

                     this.onChanged();
                  }
               } else if (!other.tempProps_.isEmpty()) {
                  if (this.tempPropsBuilder_.isEmpty()) {
                     this.tempPropsBuilder_.dispose();
                     this.tempPropsBuilder_ = null;
                     this.tempProps_ = other.tempProps_;
                     this.bitField0_ &= -33;
                     this.tempPropsBuilder_ = ExpeditionMsg.S2C_EnterChapter_10304.alwaysUseFieldBuilders ? this.getTempPropsFieldBuilder() : null;
                  } else {
                     this.tempPropsBuilder_.addAllMessages(other.tempProps_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChapterId()) {
               return false;
            } else if (!this.hasCurGrid()) {
               return false;
            } else if (!this.hasHeroId()) {
               return false;
            } else {
               for(int i = 0; i < this.getGridInfoCount(); ++i) {
                  if (!this.getGridInfo(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getTempPropsCount(); ++i) {
                  if (!this.getTempProps(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_EnterChapter_10304 parsedMessage = null;

            try {
               parsedMessage = (S2C_EnterChapter_10304)ExpeditionMsg.S2C_EnterChapter_10304.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_EnterChapter_10304)e.getUnfinishedMessage();
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

         public List<S2C_GridInfo_10314> getGridInfoList() {
            return this.gridInfoBuilder_ == null ? Collections.unmodifiableList(this.gridInfo_) : this.gridInfoBuilder_.getMessageList();
         }

         public int getGridInfoCount() {
            return this.gridInfoBuilder_ == null ? this.gridInfo_.size() : this.gridInfoBuilder_.getCount();
         }

         public S2C_GridInfo_10314 getGridInfo(int index) {
            return this.gridInfoBuilder_ == null ? (S2C_GridInfo_10314)this.gridInfo_.get(index) : (S2C_GridInfo_10314)this.gridInfoBuilder_.getMessage(index);
         }

         public Builder setGridInfo(int index, S2C_GridInfo_10314 value) {
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

         public Builder setGridInfo(int index, S2C_GridInfo_10314.Builder builderForValue) {
            if (this.gridInfoBuilder_ == null) {
               this.ensureGridInfoIsMutable();
               this.gridInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.gridInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addGridInfo(S2C_GridInfo_10314 value) {
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

         public Builder addGridInfo(int index, S2C_GridInfo_10314 value) {
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

         public Builder addGridInfo(S2C_GridInfo_10314.Builder builderForValue) {
            if (this.gridInfoBuilder_ == null) {
               this.ensureGridInfoIsMutable();
               this.gridInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.gridInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addGridInfo(int index, S2C_GridInfo_10314.Builder builderForValue) {
            if (this.gridInfoBuilder_ == null) {
               this.ensureGridInfoIsMutable();
               this.gridInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.gridInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllGridInfo(Iterable<? extends S2C_GridInfo_10314> values) {
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

         public S2C_GridInfo_10314.Builder getGridInfoBuilder(int index) {
            return (S2C_GridInfo_10314.Builder)this.getGridInfoFieldBuilder().getBuilder(index);
         }

         public S2C_GridInfo_10314OrBuilder getGridInfoOrBuilder(int index) {
            return this.gridInfoBuilder_ == null ? (S2C_GridInfo_10314OrBuilder)this.gridInfo_.get(index) : (S2C_GridInfo_10314OrBuilder)this.gridInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends S2C_GridInfo_10314OrBuilder> getGridInfoOrBuilderList() {
            return this.gridInfoBuilder_ != null ? this.gridInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.gridInfo_);
         }

         public S2C_GridInfo_10314.Builder addGridInfoBuilder() {
            return (S2C_GridInfo_10314.Builder)this.getGridInfoFieldBuilder().addBuilder(ExpeditionMsg.S2C_GridInfo_10314.getDefaultInstance());
         }

         public S2C_GridInfo_10314.Builder addGridInfoBuilder(int index) {
            return (S2C_GridInfo_10314.Builder)this.getGridInfoFieldBuilder().addBuilder(index, ExpeditionMsg.S2C_GridInfo_10314.getDefaultInstance());
         }

         public List<S2C_GridInfo_10314.Builder> getGridInfoBuilderList() {
            return this.getGridInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<S2C_GridInfo_10314, S2C_GridInfo_10314.Builder, S2C_GridInfo_10314OrBuilder> getGridInfoFieldBuilder() {
            if (this.gridInfoBuilder_ == null) {
               this.gridInfoBuilder_ = new RepeatedFieldBuilderV3(this.gridInfo_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.gridInfo_ = null;
            }

            return this.gridInfoBuilder_;
         }

         private void ensureBuffsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.buffs_ = ExpeditionMsg.S2C_EnterChapter_10304.mutableCopy(this.buffs_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getBuffsList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.buffs_) : this.buffs_);
         }

         public int getBuffsCount() {
            return this.buffs_.size();
         }

         public int getBuffs(int index) {
            return this.buffs_.getInt(index);
         }

         public Builder setBuffs(int index, int value) {
            this.ensureBuffsIsMutable();
            this.buffs_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addBuffs(int value) {
            this.ensureBuffsIsMutable();
            this.buffs_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllBuffs(Iterable<? extends Integer> values) {
            this.ensureBuffsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.buffs_);
            this.onChanged();
            return this;
         }

         public Builder clearBuffs() {
            this.buffs_ = ExpeditionMsg.S2C_EnterChapter_10304.emptyIntList();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         public boolean hasHeroId() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getHeroId() {
            return this.heroId_;
         }

         public Builder setHeroId(int value) {
            this.bitField0_ |= 16;
            this.heroId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroId() {
            this.bitField0_ &= -17;
            this.heroId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureTempPropsIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.tempProps_ = new ArrayList(this.tempProps_);
               this.bitField0_ |= 32;
            }

         }

         public List<CommonMsg.ItemInfo> getTempPropsList() {
            return this.tempPropsBuilder_ == null ? Collections.unmodifiableList(this.tempProps_) : this.tempPropsBuilder_.getMessageList();
         }

         public int getTempPropsCount() {
            return this.tempPropsBuilder_ == null ? this.tempProps_.size() : this.tempPropsBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getTempProps(int index) {
            return this.tempPropsBuilder_ == null ? (CommonMsg.ItemInfo)this.tempProps_.get(index) : (CommonMsg.ItemInfo)this.tempPropsBuilder_.getMessage(index);
         }

         public Builder setTempProps(int index, CommonMsg.ItemInfo value) {
            if (this.tempPropsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTempPropsIsMutable();
               this.tempProps_.set(index, value);
               this.onChanged();
            } else {
               this.tempPropsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTempProps(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.tempPropsBuilder_ == null) {
               this.ensureTempPropsIsMutable();
               this.tempProps_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.tempPropsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTempProps(CommonMsg.ItemInfo value) {
            if (this.tempPropsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTempPropsIsMutable();
               this.tempProps_.add(value);
               this.onChanged();
            } else {
               this.tempPropsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTempProps(int index, CommonMsg.ItemInfo value) {
            if (this.tempPropsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTempPropsIsMutable();
               this.tempProps_.add(index, value);
               this.onChanged();
            } else {
               this.tempPropsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTempProps(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.tempPropsBuilder_ == null) {
               this.ensureTempPropsIsMutable();
               this.tempProps_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.tempPropsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTempProps(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.tempPropsBuilder_ == null) {
               this.ensureTempPropsIsMutable();
               this.tempProps_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.tempPropsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTempProps(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.tempPropsBuilder_ == null) {
               this.ensureTempPropsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.tempProps_);
               this.onChanged();
            } else {
               this.tempPropsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTempProps() {
            if (this.tempPropsBuilder_ == null) {
               this.tempProps_ = Collections.emptyList();
               this.bitField0_ &= -33;
               this.onChanged();
            } else {
               this.tempPropsBuilder_.clear();
            }

            return this;
         }

         public Builder removeTempProps(int index) {
            if (this.tempPropsBuilder_ == null) {
               this.ensureTempPropsIsMutable();
               this.tempProps_.remove(index);
               this.onChanged();
            } else {
               this.tempPropsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getTempPropsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getTempPropsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getTempPropsOrBuilder(int index) {
            return this.tempPropsBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.tempProps_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.tempPropsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getTempPropsOrBuilderList() {
            return this.tempPropsBuilder_ != null ? this.tempPropsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.tempProps_);
         }

         public CommonMsg.ItemInfo.Builder addTempPropsBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getTempPropsFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addTempPropsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getTempPropsFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getTempPropsBuilderList() {
            return this.getTempPropsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getTempPropsFieldBuilder() {
            if (this.tempPropsBuilder_ == null) {
               this.tempPropsBuilder_ = new RepeatedFieldBuilderV3(this.tempProps_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean());
               this.tempProps_ = null;
            }

            return this.tempPropsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ExitChapter_10305 extends GeneratedMessageV3 implements C2S_ExitChapter_10305OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHAPTERID_FIELD_NUMBER = 1;
      private int chapterId_;
      private byte memoizedIsInitialized;
      private static final C2S_ExitChapter_10305 DEFAULT_INSTANCE = new C2S_ExitChapter_10305();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ExitChapter_10305> PARSER = new AbstractParser<C2S_ExitChapter_10305>() {
         public C2S_ExitChapter_10305 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ExitChapter_10305(input, extensionRegistry);
         }
      };

      private C2S_ExitChapter_10305(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ExitChapter_10305() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ExitChapter_10305();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ExitChapter_10305(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_ExitChapter_10305_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_ExitChapter_10305_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ExitChapter_10305.class, Builder.class);
      }

      public boolean hasChapterId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChapterId() {
         return this.chapterId_;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.chapterId_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ExitChapter_10305)) {
            return super.equals(obj);
         } else {
            C2S_ExitChapter_10305 other = (C2S_ExitChapter_10305)obj;
            if (this.hasChapterId() != other.hasChapterId()) {
               return false;
            } else if (this.hasChapterId() && this.getChapterId() != other.getChapterId()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ExitChapter_10305 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ExitChapter_10305)PARSER.parseFrom(data);
      }

      public static C2S_ExitChapter_10305 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ExitChapter_10305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ExitChapter_10305 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ExitChapter_10305)PARSER.parseFrom(data);
      }

      public static C2S_ExitChapter_10305 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ExitChapter_10305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ExitChapter_10305 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ExitChapter_10305)PARSER.parseFrom(data);
      }

      public static C2S_ExitChapter_10305 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ExitChapter_10305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ExitChapter_10305 parseFrom(InputStream input) throws IOException {
         return (C2S_ExitChapter_10305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ExitChapter_10305 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ExitChapter_10305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ExitChapter_10305 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ExitChapter_10305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ExitChapter_10305 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ExitChapter_10305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ExitChapter_10305 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ExitChapter_10305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ExitChapter_10305 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ExitChapter_10305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ExitChapter_10305 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ExitChapter_10305 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ExitChapter_10305> parser() {
         return PARSER;
      }

      public Parser<C2S_ExitChapter_10305> getParserForType() {
         return PARSER;
      }

      public C2S_ExitChapter_10305 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ExitChapter_10305OrBuilder {
         private int bitField0_;
         private int chapterId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_ExitChapter_10305_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_ExitChapter_10305_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ExitChapter_10305.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.C2S_ExitChapter_10305.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.chapterId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_ExitChapter_10305_descriptor;
         }

         public C2S_ExitChapter_10305 getDefaultInstanceForType() {
            return ExpeditionMsg.C2S_ExitChapter_10305.getDefaultInstance();
         }

         public C2S_ExitChapter_10305 build() {
            C2S_ExitChapter_10305 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ExitChapter_10305 buildPartial() {
            C2S_ExitChapter_10305 result = new C2S_ExitChapter_10305(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.chapterId_ = this.chapterId_;
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
            if (other instanceof C2S_ExitChapter_10305) {
               return this.mergeFrom((C2S_ExitChapter_10305)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ExitChapter_10305 other) {
            if (other == ExpeditionMsg.C2S_ExitChapter_10305.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChapterId()) {
                  this.setChapterId(other.getChapterId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasChapterId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ExitChapter_10305 parsedMessage = null;

            try {
               parsedMessage = (C2S_ExitChapter_10305)ExpeditionMsg.C2S_ExitChapter_10305.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ExitChapter_10305)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_ExitChapter_10306 extends GeneratedMessageV3 implements S2C_ExitChapter_10306OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHAPTERID_FIELD_NUMBER = 1;
      private int chapterId_;
      private byte memoizedIsInitialized;
      private static final S2C_ExitChapter_10306 DEFAULT_INSTANCE = new S2C_ExitChapter_10306();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ExitChapter_10306> PARSER = new AbstractParser<S2C_ExitChapter_10306>() {
         public S2C_ExitChapter_10306 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ExitChapter_10306(input, extensionRegistry);
         }
      };

      private S2C_ExitChapter_10306(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ExitChapter_10306() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ExitChapter_10306();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ExitChapter_10306(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_ExitChapter_10306_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_ExitChapter_10306_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ExitChapter_10306.class, Builder.class);
      }

      public boolean hasChapterId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChapterId() {
         return this.chapterId_;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.chapterId_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ExitChapter_10306)) {
            return super.equals(obj);
         } else {
            S2C_ExitChapter_10306 other = (S2C_ExitChapter_10306)obj;
            if (this.hasChapterId() != other.hasChapterId()) {
               return false;
            } else if (this.hasChapterId() && this.getChapterId() != other.getChapterId()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ExitChapter_10306 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ExitChapter_10306)PARSER.parseFrom(data);
      }

      public static S2C_ExitChapter_10306 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ExitChapter_10306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ExitChapter_10306 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ExitChapter_10306)PARSER.parseFrom(data);
      }

      public static S2C_ExitChapter_10306 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ExitChapter_10306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ExitChapter_10306 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ExitChapter_10306)PARSER.parseFrom(data);
      }

      public static S2C_ExitChapter_10306 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ExitChapter_10306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ExitChapter_10306 parseFrom(InputStream input) throws IOException {
         return (S2C_ExitChapter_10306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ExitChapter_10306 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ExitChapter_10306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ExitChapter_10306 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ExitChapter_10306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ExitChapter_10306 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ExitChapter_10306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ExitChapter_10306 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ExitChapter_10306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ExitChapter_10306 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ExitChapter_10306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ExitChapter_10306 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ExitChapter_10306 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ExitChapter_10306> parser() {
         return PARSER;
      }

      public Parser<S2C_ExitChapter_10306> getParserForType() {
         return PARSER;
      }

      public S2C_ExitChapter_10306 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ExitChapter_10306OrBuilder {
         private int bitField0_;
         private int chapterId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_ExitChapter_10306_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_ExitChapter_10306_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ExitChapter_10306.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.S2C_ExitChapter_10306.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.chapterId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_ExitChapter_10306_descriptor;
         }

         public S2C_ExitChapter_10306 getDefaultInstanceForType() {
            return ExpeditionMsg.S2C_ExitChapter_10306.getDefaultInstance();
         }

         public S2C_ExitChapter_10306 build() {
            S2C_ExitChapter_10306 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ExitChapter_10306 buildPartial() {
            S2C_ExitChapter_10306 result = new S2C_ExitChapter_10306(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.chapterId_ = this.chapterId_;
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
            if (other instanceof S2C_ExitChapter_10306) {
               return this.mergeFrom((S2C_ExitChapter_10306)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ExitChapter_10306 other) {
            if (other == ExpeditionMsg.S2C_ExitChapter_10306.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChapterId()) {
                  this.setChapterId(other.getChapterId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasChapterId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ExitChapter_10306 parsedMessage = null;

            try {
               parsedMessage = (S2C_ExitChapter_10306)ExpeditionMsg.S2C_ExitChapter_10306.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ExitChapter_10306)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_Move_10307 extends GeneratedMessageV3 implements C2S_Move_10307OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ORIGRID_FIELD_NUMBER = 1;
      private int oriGrid_;
      public static final int DESTGRID_FIELD_NUMBER = 2;
      private int destGrid_;
      public static final int PASSGRID_FIELD_NUMBER = 3;
      private Internal.IntList passGrid_;
      private byte memoizedIsInitialized;
      private static final C2S_Move_10307 DEFAULT_INSTANCE = new C2S_Move_10307();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Move_10307> PARSER = new AbstractParser<C2S_Move_10307>() {
         public C2S_Move_10307 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Move_10307(input, extensionRegistry);
         }
      };

      private C2S_Move_10307(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Move_10307() {
         this.memoizedIsInitialized = -1;
         this.passGrid_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Move_10307();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Move_10307(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_Move_10307_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_Move_10307_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Move_10307.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Move_10307)) {
            return super.equals(obj);
         } else {
            C2S_Move_10307 other = (C2S_Move_10307)obj;
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

      public static C2S_Move_10307 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Move_10307)PARSER.parseFrom(data);
      }

      public static C2S_Move_10307 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Move_10307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Move_10307 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Move_10307)PARSER.parseFrom(data);
      }

      public static C2S_Move_10307 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Move_10307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Move_10307 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Move_10307)PARSER.parseFrom(data);
      }

      public static C2S_Move_10307 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Move_10307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Move_10307 parseFrom(InputStream input) throws IOException {
         return (C2S_Move_10307)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Move_10307 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Move_10307)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Move_10307 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Move_10307)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Move_10307 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Move_10307)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Move_10307 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Move_10307)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Move_10307 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Move_10307)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Move_10307 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Move_10307 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Move_10307> parser() {
         return PARSER;
      }

      public Parser<C2S_Move_10307> getParserForType() {
         return PARSER;
      }

      public C2S_Move_10307 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Move_10307OrBuilder {
         private int bitField0_;
         private int oriGrid_;
         private int destGrid_;
         private Internal.IntList passGrid_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_Move_10307_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_Move_10307_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Move_10307.class, Builder.class);
         }

         private Builder() {
            this.passGrid_ = ExpeditionMsg.C2S_Move_10307.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.passGrid_ = ExpeditionMsg.C2S_Move_10307.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.C2S_Move_10307.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.oriGrid_ = 0;
            this.bitField0_ &= -2;
            this.destGrid_ = 0;
            this.bitField0_ &= -3;
            this.passGrid_ = ExpeditionMsg.C2S_Move_10307.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_Move_10307_descriptor;
         }

         public C2S_Move_10307 getDefaultInstanceForType() {
            return ExpeditionMsg.C2S_Move_10307.getDefaultInstance();
         }

         public C2S_Move_10307 build() {
            C2S_Move_10307 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Move_10307 buildPartial() {
            C2S_Move_10307 result = new C2S_Move_10307(this);
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
            if (other instanceof C2S_Move_10307) {
               return this.mergeFrom((C2S_Move_10307)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Move_10307 other) {
            if (other == ExpeditionMsg.C2S_Move_10307.getDefaultInstance()) {
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
            C2S_Move_10307 parsedMessage = null;

            try {
               parsedMessage = (C2S_Move_10307)ExpeditionMsg.C2S_Move_10307.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Move_10307)e.getUnfinishedMessage();
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
               this.passGrid_ = ExpeditionMsg.C2S_Move_10307.mutableCopy(this.passGrid_);
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
            this.passGrid_ = ExpeditionMsg.C2S_Move_10307.emptyIntList();
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

   public static final class S2C_Move_10308 extends GeneratedMessageV3 implements S2C_Move_10308OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int DESTGRID_FIELD_NUMBER = 2;
      private int destGrid_;
      private byte memoizedIsInitialized;
      private static final S2C_Move_10308 DEFAULT_INSTANCE = new S2C_Move_10308();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Move_10308> PARSER = new AbstractParser<S2C_Move_10308>() {
         public S2C_Move_10308 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Move_10308(input, extensionRegistry);
         }
      };

      private S2C_Move_10308(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Move_10308() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Move_10308();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Move_10308(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_Move_10308_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_Move_10308_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Move_10308.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Move_10308)) {
            return super.equals(obj);
         } else {
            S2C_Move_10308 other = (S2C_Move_10308)obj;
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

      public static S2C_Move_10308 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Move_10308)PARSER.parseFrom(data);
      }

      public static S2C_Move_10308 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Move_10308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Move_10308 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Move_10308)PARSER.parseFrom(data);
      }

      public static S2C_Move_10308 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Move_10308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Move_10308 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Move_10308)PARSER.parseFrom(data);
      }

      public static S2C_Move_10308 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Move_10308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Move_10308 parseFrom(InputStream input) throws IOException {
         return (S2C_Move_10308)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Move_10308 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Move_10308)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Move_10308 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Move_10308)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Move_10308 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Move_10308)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Move_10308 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Move_10308)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Move_10308 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Move_10308)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Move_10308 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Move_10308 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Move_10308> parser() {
         return PARSER;
      }

      public Parser<S2C_Move_10308> getParserForType() {
         return PARSER;
      }

      public S2C_Move_10308 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Move_10308OrBuilder {
         private int bitField0_;
         private int result_;
         private int destGrid_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_Move_10308_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_Move_10308_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Move_10308.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.S2C_Move_10308.alwaysUseFieldBuilders) {
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
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_Move_10308_descriptor;
         }

         public S2C_Move_10308 getDefaultInstanceForType() {
            return ExpeditionMsg.S2C_Move_10308.getDefaultInstance();
         }

         public S2C_Move_10308 build() {
            S2C_Move_10308 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Move_10308 buildPartial() {
            S2C_Move_10308 result = new S2C_Move_10308(this);
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
            if (other instanceof S2C_Move_10308) {
               return this.mergeFrom((S2C_Move_10308)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Move_10308 other) {
            if (other == ExpeditionMsg.S2C_Move_10308.getDefaultInstance()) {
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
            S2C_Move_10308 parsedMessage = null;

            try {
               parsedMessage = (S2C_Move_10308)ExpeditionMsg.S2C_Move_10308.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Move_10308)e.getUnfinishedMessage();
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

   public static final class C2S_SelectBuff_10309 extends GeneratedMessageV3 implements C2S_SelectBuff_10309OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      public static final int BUFFID_FIELD_NUMBER = 2;
      private int buffId_;
      private byte memoizedIsInitialized;
      private static final C2S_SelectBuff_10309 DEFAULT_INSTANCE = new C2S_SelectBuff_10309();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SelectBuff_10309> PARSER = new AbstractParser<C2S_SelectBuff_10309>() {
         public C2S_SelectBuff_10309 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SelectBuff_10309(input, extensionRegistry);
         }
      };

      private C2S_SelectBuff_10309(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SelectBuff_10309() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SelectBuff_10309();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SelectBuff_10309(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buffId_ = input.readInt32();
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_SelectBuff_10309_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_SelectBuff_10309_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SelectBuff_10309.class, Builder.class);
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public boolean hasBuffId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBuffId() {
         return this.buffId_;
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
         } else if (!this.hasBuffId()) {
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
            output.writeInt32(2, this.buffId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.buffId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SelectBuff_10309)) {
            return super.equals(obj);
         } else {
            C2S_SelectBuff_10309 other = (C2S_SelectBuff_10309)obj;
            if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
               return false;
            } else if (this.hasBuffId() != other.hasBuffId()) {
               return false;
            } else if (this.hasBuffId() && this.getBuffId() != other.getBuffId()) {
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

            if (this.hasBuffId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuffId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SelectBuff_10309 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SelectBuff_10309)PARSER.parseFrom(data);
      }

      public static C2S_SelectBuff_10309 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SelectBuff_10309)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SelectBuff_10309 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SelectBuff_10309)PARSER.parseFrom(data);
      }

      public static C2S_SelectBuff_10309 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SelectBuff_10309)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SelectBuff_10309 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SelectBuff_10309)PARSER.parseFrom(data);
      }

      public static C2S_SelectBuff_10309 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SelectBuff_10309)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SelectBuff_10309 parseFrom(InputStream input) throws IOException {
         return (C2S_SelectBuff_10309)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SelectBuff_10309 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SelectBuff_10309)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SelectBuff_10309 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SelectBuff_10309)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SelectBuff_10309 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SelectBuff_10309)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SelectBuff_10309 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SelectBuff_10309)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SelectBuff_10309 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SelectBuff_10309)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SelectBuff_10309 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SelectBuff_10309 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SelectBuff_10309> parser() {
         return PARSER;
      }

      public Parser<C2S_SelectBuff_10309> getParserForType() {
         return PARSER;
      }

      public C2S_SelectBuff_10309 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SelectBuff_10309OrBuilder {
         private int bitField0_;
         private int grid_;
         private int buffId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_SelectBuff_10309_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_SelectBuff_10309_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SelectBuff_10309.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.C2S_SelectBuff_10309.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            this.buffId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_SelectBuff_10309_descriptor;
         }

         public C2S_SelectBuff_10309 getDefaultInstanceForType() {
            return ExpeditionMsg.C2S_SelectBuff_10309.getDefaultInstance();
         }

         public C2S_SelectBuff_10309 build() {
            C2S_SelectBuff_10309 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SelectBuff_10309 buildPartial() {
            C2S_SelectBuff_10309 result = new C2S_SelectBuff_10309(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.grid_ = this.grid_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.buffId_ = this.buffId_;
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
            if (other instanceof C2S_SelectBuff_10309) {
               return this.mergeFrom((C2S_SelectBuff_10309)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SelectBuff_10309 other) {
            if (other == ExpeditionMsg.C2S_SelectBuff_10309.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               if (other.hasBuffId()) {
                  this.setBuffId(other.getBuffId());
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
               return this.hasBuffId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_SelectBuff_10309 parsedMessage = null;

            try {
               parsedMessage = (C2S_SelectBuff_10309)ExpeditionMsg.C2S_SelectBuff_10309.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SelectBuff_10309)e.getUnfinishedMessage();
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

         public boolean hasBuffId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBuffId() {
            return this.buffId_;
         }

         public Builder setBuffId(int value) {
            this.bitField0_ |= 2;
            this.buffId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuffId() {
            this.bitField0_ &= -3;
            this.buffId_ = 0;
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

   public static final class S2C_SelectBuff_10310 extends GeneratedMessageV3 implements S2C_SelectBuff_10310OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      public static final int BUFFID_FIELD_NUMBER = 2;
      private int buffId_;
      private byte memoizedIsInitialized;
      private static final S2C_SelectBuff_10310 DEFAULT_INSTANCE = new S2C_SelectBuff_10310();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SelectBuff_10310> PARSER = new AbstractParser<S2C_SelectBuff_10310>() {
         public S2C_SelectBuff_10310 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SelectBuff_10310(input, extensionRegistry);
         }
      };

      private S2C_SelectBuff_10310(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SelectBuff_10310() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SelectBuff_10310();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SelectBuff_10310(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buffId_ = input.readInt32();
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_SelectBuff_10310_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_SelectBuff_10310_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SelectBuff_10310.class, Builder.class);
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public boolean hasBuffId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBuffId() {
         return this.buffId_;
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
         } else if (!this.hasBuffId()) {
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
            output.writeInt32(2, this.buffId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.buffId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SelectBuff_10310)) {
            return super.equals(obj);
         } else {
            S2C_SelectBuff_10310 other = (S2C_SelectBuff_10310)obj;
            if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
               return false;
            } else if (this.hasBuffId() != other.hasBuffId()) {
               return false;
            } else if (this.hasBuffId() && this.getBuffId() != other.getBuffId()) {
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

            if (this.hasBuffId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuffId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SelectBuff_10310 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SelectBuff_10310)PARSER.parseFrom(data);
      }

      public static S2C_SelectBuff_10310 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SelectBuff_10310)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SelectBuff_10310 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SelectBuff_10310)PARSER.parseFrom(data);
      }

      public static S2C_SelectBuff_10310 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SelectBuff_10310)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SelectBuff_10310 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SelectBuff_10310)PARSER.parseFrom(data);
      }

      public static S2C_SelectBuff_10310 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SelectBuff_10310)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SelectBuff_10310 parseFrom(InputStream input) throws IOException {
         return (S2C_SelectBuff_10310)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SelectBuff_10310 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SelectBuff_10310)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SelectBuff_10310 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SelectBuff_10310)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SelectBuff_10310 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SelectBuff_10310)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SelectBuff_10310 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SelectBuff_10310)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SelectBuff_10310 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SelectBuff_10310)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SelectBuff_10310 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SelectBuff_10310 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SelectBuff_10310> parser() {
         return PARSER;
      }

      public Parser<S2C_SelectBuff_10310> getParserForType() {
         return PARSER;
      }

      public S2C_SelectBuff_10310 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SelectBuff_10310OrBuilder {
         private int bitField0_;
         private int grid_;
         private int buffId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_SelectBuff_10310_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_SelectBuff_10310_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SelectBuff_10310.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.S2C_SelectBuff_10310.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            this.buffId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_SelectBuff_10310_descriptor;
         }

         public S2C_SelectBuff_10310 getDefaultInstanceForType() {
            return ExpeditionMsg.S2C_SelectBuff_10310.getDefaultInstance();
         }

         public S2C_SelectBuff_10310 build() {
            S2C_SelectBuff_10310 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SelectBuff_10310 buildPartial() {
            S2C_SelectBuff_10310 result = new S2C_SelectBuff_10310(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.grid_ = this.grid_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.buffId_ = this.buffId_;
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
            if (other instanceof S2C_SelectBuff_10310) {
               return this.mergeFrom((S2C_SelectBuff_10310)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SelectBuff_10310 other) {
            if (other == ExpeditionMsg.S2C_SelectBuff_10310.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               if (other.hasBuffId()) {
                  this.setBuffId(other.getBuffId());
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
               return this.hasBuffId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SelectBuff_10310 parsedMessage = null;

            try {
               parsedMessage = (S2C_SelectBuff_10310)ExpeditionMsg.S2C_SelectBuff_10310.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SelectBuff_10310)e.getUnfinishedMessage();
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

         public boolean hasBuffId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBuffId() {
            return this.buffId_;
         }

         public Builder setBuffId(int value) {
            this.bitField0_ |= 2;
            this.buffId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuffId() {
            this.bitField0_ &= -3;
            this.buffId_ = 0;
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

   public static final class S2C_UpdateGridInfo_10312 extends GeneratedMessageV3 implements S2C_UpdateGridInfo_10312OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFO_FIELD_NUMBER = 1;
      private List<S2C_GridInfo_10314> info_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateGridInfo_10312 DEFAULT_INSTANCE = new S2C_UpdateGridInfo_10312();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateGridInfo_10312> PARSER = new AbstractParser<S2C_UpdateGridInfo_10312>() {
         public S2C_UpdateGridInfo_10312 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateGridInfo_10312(input, extensionRegistry);
         }
      };

      private S2C_UpdateGridInfo_10312(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateGridInfo_10312() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateGridInfo_10312();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateGridInfo_10312(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.info_.add(input.readMessage(ExpeditionMsg.S2C_GridInfo_10314.PARSER, extensionRegistry));
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_UpdateGridInfo_10312_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_UpdateGridInfo_10312_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateGridInfo_10312.class, Builder.class);
      }

      public List<S2C_GridInfo_10314> getInfoList() {
         return this.info_;
      }

      public List<? extends S2C_GridInfo_10314OrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public S2C_GridInfo_10314 getInfo(int index) {
         return (S2C_GridInfo_10314)this.info_.get(index);
      }

      public S2C_GridInfo_10314OrBuilder getInfoOrBuilder(int index) {
         return (S2C_GridInfo_10314OrBuilder)this.info_.get(index);
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
         } else if (!(obj instanceof S2C_UpdateGridInfo_10312)) {
            return super.equals(obj);
         } else {
            S2C_UpdateGridInfo_10312 other = (S2C_UpdateGridInfo_10312)obj;
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

      public static S2C_UpdateGridInfo_10312 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateGridInfo_10312)PARSER.parseFrom(data);
      }

      public static S2C_UpdateGridInfo_10312 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateGridInfo_10312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateGridInfo_10312 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateGridInfo_10312)PARSER.parseFrom(data);
      }

      public static S2C_UpdateGridInfo_10312 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateGridInfo_10312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateGridInfo_10312 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateGridInfo_10312)PARSER.parseFrom(data);
      }

      public static S2C_UpdateGridInfo_10312 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateGridInfo_10312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateGridInfo_10312 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateGridInfo_10312)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateGridInfo_10312 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateGridInfo_10312)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateGridInfo_10312 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateGridInfo_10312)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateGridInfo_10312 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateGridInfo_10312)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateGridInfo_10312 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateGridInfo_10312)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateGridInfo_10312 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateGridInfo_10312)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateGridInfo_10312 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateGridInfo_10312 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateGridInfo_10312> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateGridInfo_10312> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateGridInfo_10312 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateGridInfo_10312OrBuilder {
         private int bitField0_;
         private List<S2C_GridInfo_10314> info_;
         private RepeatedFieldBuilderV3<S2C_GridInfo_10314, S2C_GridInfo_10314.Builder, S2C_GridInfo_10314OrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_UpdateGridInfo_10312_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_UpdateGridInfo_10312_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateGridInfo_10312.class, Builder.class);
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
            if (ExpeditionMsg.S2C_UpdateGridInfo_10312.alwaysUseFieldBuilders) {
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
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_UpdateGridInfo_10312_descriptor;
         }

         public S2C_UpdateGridInfo_10312 getDefaultInstanceForType() {
            return ExpeditionMsg.S2C_UpdateGridInfo_10312.getDefaultInstance();
         }

         public S2C_UpdateGridInfo_10312 build() {
            S2C_UpdateGridInfo_10312 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateGridInfo_10312 buildPartial() {
            S2C_UpdateGridInfo_10312 result = new S2C_UpdateGridInfo_10312(this);
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
            if (other instanceof S2C_UpdateGridInfo_10312) {
               return this.mergeFrom((S2C_UpdateGridInfo_10312)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateGridInfo_10312 other) {
            if (other == ExpeditionMsg.S2C_UpdateGridInfo_10312.getDefaultInstance()) {
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
                     this.infoBuilder_ = ExpeditionMsg.S2C_UpdateGridInfo_10312.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
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
            S2C_UpdateGridInfo_10312 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateGridInfo_10312)ExpeditionMsg.S2C_UpdateGridInfo_10312.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateGridInfo_10312)e.getUnfinishedMessage();
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

         public List<S2C_GridInfo_10314> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public S2C_GridInfo_10314 getInfo(int index) {
            return this.infoBuilder_ == null ? (S2C_GridInfo_10314)this.info_.get(index) : (S2C_GridInfo_10314)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, S2C_GridInfo_10314 value) {
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

         public Builder setInfo(int index, S2C_GridInfo_10314.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(S2C_GridInfo_10314 value) {
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

         public Builder addInfo(int index, S2C_GridInfo_10314 value) {
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

         public Builder addInfo(S2C_GridInfo_10314.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, S2C_GridInfo_10314.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends S2C_GridInfo_10314> values) {
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

         public S2C_GridInfo_10314.Builder getInfoBuilder(int index) {
            return (S2C_GridInfo_10314.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public S2C_GridInfo_10314OrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (S2C_GridInfo_10314OrBuilder)this.info_.get(index) : (S2C_GridInfo_10314OrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends S2C_GridInfo_10314OrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public S2C_GridInfo_10314.Builder addInfoBuilder() {
            return (S2C_GridInfo_10314.Builder)this.getInfoFieldBuilder().addBuilder(ExpeditionMsg.S2C_GridInfo_10314.getDefaultInstance());
         }

         public S2C_GridInfo_10314.Builder addInfoBuilder(int index) {
            return (S2C_GridInfo_10314.Builder)this.getInfoFieldBuilder().addBuilder(index, ExpeditionMsg.S2C_GridInfo_10314.getDefaultInstance());
         }

         public List<S2C_GridInfo_10314.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<S2C_GridInfo_10314, S2C_GridInfo_10314.Builder, S2C_GridInfo_10314OrBuilder> getInfoFieldBuilder() {
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

   public static final class S2C_GridInfo_10314 extends GeneratedMessageV3 implements S2C_GridInfo_10314OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      public static final int EVENTIDX_FIELD_NUMBER = 2;
      private int eventIdx_;
      public static final int GRIDICON_FIELD_NUMBER = 3;
      private int gridIcon_;
      public static final int GRIDTYPE_FIELD_NUMBER = 4;
      private int gridType_;
      private byte memoizedIsInitialized;
      private static final S2C_GridInfo_10314 DEFAULT_INSTANCE = new S2C_GridInfo_10314();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GridInfo_10314> PARSER = new AbstractParser<S2C_GridInfo_10314>() {
         public S2C_GridInfo_10314 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GridInfo_10314(input, extensionRegistry);
         }
      };

      private S2C_GridInfo_10314(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GridInfo_10314() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GridInfo_10314();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GridInfo_10314(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.gridIcon_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.gridType_ = input.readInt32();
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_GridInfo_10314_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_GridInfo_10314_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GridInfo_10314.class, Builder.class);
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

      public boolean hasGridIcon() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getGridIcon() {
         return this.gridIcon_;
      }

      public boolean hasGridType() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getGridType() {
         return this.gridType_;
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
            output.writeInt32(3, this.gridIcon_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.gridType_);
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
               size += CodedOutputStream.computeInt32Size(3, this.gridIcon_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.gridType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GridInfo_10314)) {
            return super.equals(obj);
         } else {
            S2C_GridInfo_10314 other = (S2C_GridInfo_10314)obj;
            if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
               return false;
            } else if (this.hasEventIdx() != other.hasEventIdx()) {
               return false;
            } else if (this.hasEventIdx() && this.getEventIdx() != other.getEventIdx()) {
               return false;
            } else if (this.hasGridIcon() != other.hasGridIcon()) {
               return false;
            } else if (this.hasGridIcon() && this.getGridIcon() != other.getGridIcon()) {
               return false;
            } else if (this.hasGridType() != other.hasGridType()) {
               return false;
            } else if (this.hasGridType() && this.getGridType() != other.getGridType()) {
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

            if (this.hasGridIcon()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGridIcon();
            }

            if (this.hasGridType()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getGridType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GridInfo_10314 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GridInfo_10314)PARSER.parseFrom(data);
      }

      public static S2C_GridInfo_10314 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GridInfo_10314)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GridInfo_10314 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GridInfo_10314)PARSER.parseFrom(data);
      }

      public static S2C_GridInfo_10314 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GridInfo_10314)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GridInfo_10314 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GridInfo_10314)PARSER.parseFrom(data);
      }

      public static S2C_GridInfo_10314 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GridInfo_10314)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GridInfo_10314 parseFrom(InputStream input) throws IOException {
         return (S2C_GridInfo_10314)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GridInfo_10314 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GridInfo_10314)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GridInfo_10314 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GridInfo_10314)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GridInfo_10314 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GridInfo_10314)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GridInfo_10314 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GridInfo_10314)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GridInfo_10314 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GridInfo_10314)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GridInfo_10314 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GridInfo_10314 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GridInfo_10314> parser() {
         return PARSER;
      }

      public Parser<S2C_GridInfo_10314> getParserForType() {
         return PARSER;
      }

      public S2C_GridInfo_10314 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GridInfo_10314OrBuilder {
         private int bitField0_;
         private int grid_;
         private int eventIdx_;
         private int gridIcon_;
         private int gridType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_GridInfo_10314_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_GridInfo_10314_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GridInfo_10314.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.S2C_GridInfo_10314.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            this.eventIdx_ = 0;
            this.bitField0_ &= -3;
            this.gridIcon_ = 0;
            this.bitField0_ &= -5;
            this.gridType_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_GridInfo_10314_descriptor;
         }

         public S2C_GridInfo_10314 getDefaultInstanceForType() {
            return ExpeditionMsg.S2C_GridInfo_10314.getDefaultInstance();
         }

         public S2C_GridInfo_10314 build() {
            S2C_GridInfo_10314 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GridInfo_10314 buildPartial() {
            S2C_GridInfo_10314 result = new S2C_GridInfo_10314(this);
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
               result.gridIcon_ = this.gridIcon_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.gridType_ = this.gridType_;
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
            if (other instanceof S2C_GridInfo_10314) {
               return this.mergeFrom((S2C_GridInfo_10314)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GridInfo_10314 other) {
            if (other == ExpeditionMsg.S2C_GridInfo_10314.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               if (other.hasEventIdx()) {
                  this.setEventIdx(other.getEventIdx());
               }

               if (other.hasGridIcon()) {
                  this.setGridIcon(other.getGridIcon());
               }

               if (other.hasGridType()) {
                  this.setGridType(other.getGridType());
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
               return this.hasEventIdx();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GridInfo_10314 parsedMessage = null;

            try {
               parsedMessage = (S2C_GridInfo_10314)ExpeditionMsg.S2C_GridInfo_10314.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GridInfo_10314)e.getUnfinishedMessage();
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

         public boolean hasGridIcon() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getGridIcon() {
            return this.gridIcon_;
         }

         public Builder setGridIcon(int value) {
            this.bitField0_ |= 4;
            this.gridIcon_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGridIcon() {
            this.bitField0_ &= -5;
            this.gridIcon_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGridType() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getGridType() {
            return this.gridType_;
         }

         public Builder setGridType(int value) {
            this.bitField0_ |= 8;
            this.gridType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGridType() {
            this.bitField0_ &= -9;
            this.gridType_ = 0;
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

   public static final class C2S_BuffList_10315 extends GeneratedMessageV3 implements C2S_BuffList_10315OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      private byte memoizedIsInitialized;
      private static final C2S_BuffList_10315 DEFAULT_INSTANCE = new C2S_BuffList_10315();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BuffList_10315> PARSER = new AbstractParser<C2S_BuffList_10315>() {
         public C2S_BuffList_10315 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BuffList_10315(input, extensionRegistry);
         }
      };

      private C2S_BuffList_10315(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BuffList_10315() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BuffList_10315();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BuffList_10315(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_BuffList_10315_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_BuffList_10315_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuffList_10315.class, Builder.class);
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
         } else if (!(obj instanceof C2S_BuffList_10315)) {
            return super.equals(obj);
         } else {
            C2S_BuffList_10315 other = (C2S_BuffList_10315)obj;
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

      public static C2S_BuffList_10315 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BuffList_10315)PARSER.parseFrom(data);
      }

      public static C2S_BuffList_10315 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuffList_10315)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuffList_10315 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BuffList_10315)PARSER.parseFrom(data);
      }

      public static C2S_BuffList_10315 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuffList_10315)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuffList_10315 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BuffList_10315)PARSER.parseFrom(data);
      }

      public static C2S_BuffList_10315 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuffList_10315)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuffList_10315 parseFrom(InputStream input) throws IOException {
         return (C2S_BuffList_10315)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuffList_10315 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuffList_10315)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuffList_10315 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BuffList_10315)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BuffList_10315 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuffList_10315)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuffList_10315 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BuffList_10315)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuffList_10315 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuffList_10315)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BuffList_10315 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BuffList_10315 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BuffList_10315> parser() {
         return PARSER;
      }

      public Parser<C2S_BuffList_10315> getParserForType() {
         return PARSER;
      }

      public C2S_BuffList_10315 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BuffList_10315OrBuilder {
         private int bitField0_;
         private int grid_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_BuffList_10315_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_BuffList_10315_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuffList_10315.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.C2S_BuffList_10315.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_BuffList_10315_descriptor;
         }

         public C2S_BuffList_10315 getDefaultInstanceForType() {
            return ExpeditionMsg.C2S_BuffList_10315.getDefaultInstance();
         }

         public C2S_BuffList_10315 build() {
            C2S_BuffList_10315 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BuffList_10315 buildPartial() {
            C2S_BuffList_10315 result = new C2S_BuffList_10315(this);
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
            if (other instanceof C2S_BuffList_10315) {
               return this.mergeFrom((C2S_BuffList_10315)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BuffList_10315 other) {
            if (other == ExpeditionMsg.C2S_BuffList_10315.getDefaultInstance()) {
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
            C2S_BuffList_10315 parsedMessage = null;

            try {
               parsedMessage = (C2S_BuffList_10315)ExpeditionMsg.C2S_BuffList_10315.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BuffList_10315)e.getUnfinishedMessage();
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

   public static final class S2C_BuffList_10316 extends GeneratedMessageV3 implements S2C_BuffList_10316OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      public static final int BUFFLIST_FIELD_NUMBER = 2;
      private Internal.IntList buffList_;
      private byte memoizedIsInitialized;
      private static final S2C_BuffList_10316 DEFAULT_INSTANCE = new S2C_BuffList_10316();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BuffList_10316> PARSER = new AbstractParser<S2C_BuffList_10316>() {
         public S2C_BuffList_10316 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BuffList_10316(input, extensionRegistry);
         }
      };

      private S2C_BuffList_10316(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BuffList_10316() {
         this.memoizedIsInitialized = -1;
         this.buffList_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BuffList_10316();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BuffList_10316(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.buffList_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.buffList_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.buffList_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.buffList_.addInt(input.readInt32());
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
                  this.buffList_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_BuffList_10316_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_BuffList_10316_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuffList_10316.class, Builder.class);
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public List<Integer> getBuffListList() {
         return this.buffList_;
      }

      public int getBuffListCount() {
         return this.buffList_.size();
      }

      public int getBuffList(int index) {
         return this.buffList_.getInt(index);
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

         for(int i = 0; i < this.buffList_.size(); ++i) {
            output.writeInt32(2, this.buffList_.getInt(i));
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

            int dataSize = 0;

            for(int i = 0; i < this.buffList_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.buffList_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getBuffListList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BuffList_10316)) {
            return super.equals(obj);
         } else {
            S2C_BuffList_10316 other = (S2C_BuffList_10316)obj;
            if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
               return false;
            } else if (!this.getBuffListList().equals(other.getBuffListList())) {
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

            if (this.getBuffListCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuffListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BuffList_10316 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BuffList_10316)PARSER.parseFrom(data);
      }

      public static S2C_BuffList_10316 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuffList_10316)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuffList_10316 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BuffList_10316)PARSER.parseFrom(data);
      }

      public static S2C_BuffList_10316 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuffList_10316)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuffList_10316 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BuffList_10316)PARSER.parseFrom(data);
      }

      public static S2C_BuffList_10316 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuffList_10316)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuffList_10316 parseFrom(InputStream input) throws IOException {
         return (S2C_BuffList_10316)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuffList_10316 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuffList_10316)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuffList_10316 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BuffList_10316)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BuffList_10316 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuffList_10316)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuffList_10316 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BuffList_10316)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuffList_10316 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuffList_10316)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BuffList_10316 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BuffList_10316 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BuffList_10316> parser() {
         return PARSER;
      }

      public Parser<S2C_BuffList_10316> getParserForType() {
         return PARSER;
      }

      public S2C_BuffList_10316 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BuffList_10316OrBuilder {
         private int bitField0_;
         private int grid_;
         private Internal.IntList buffList_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_BuffList_10316_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_BuffList_10316_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuffList_10316.class, Builder.class);
         }

         private Builder() {
            this.buffList_ = ExpeditionMsg.S2C_BuffList_10316.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.buffList_ = ExpeditionMsg.S2C_BuffList_10316.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.S2C_BuffList_10316.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            this.buffList_ = ExpeditionMsg.S2C_BuffList_10316.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_BuffList_10316_descriptor;
         }

         public S2C_BuffList_10316 getDefaultInstanceForType() {
            return ExpeditionMsg.S2C_BuffList_10316.getDefaultInstance();
         }

         public S2C_BuffList_10316 build() {
            S2C_BuffList_10316 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BuffList_10316 buildPartial() {
            S2C_BuffList_10316 result = new S2C_BuffList_10316(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.grid_ = this.grid_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.buffList_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.buffList_ = this.buffList_;
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
            if (other instanceof S2C_BuffList_10316) {
               return this.mergeFrom((S2C_BuffList_10316)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BuffList_10316 other) {
            if (other == ExpeditionMsg.S2C_BuffList_10316.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               if (!other.buffList_.isEmpty()) {
                  if (this.buffList_.isEmpty()) {
                     this.buffList_ = other.buffList_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureBuffListIsMutable();
                     this.buffList_.addAll(other.buffList_);
                  }

                  this.onChanged();
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
            S2C_BuffList_10316 parsedMessage = null;

            try {
               parsedMessage = (S2C_BuffList_10316)ExpeditionMsg.S2C_BuffList_10316.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BuffList_10316)e.getUnfinishedMessage();
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

         private void ensureBuffListIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.buffList_ = ExpeditionMsg.S2C_BuffList_10316.mutableCopy(this.buffList_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getBuffListList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.buffList_) : this.buffList_);
         }

         public int getBuffListCount() {
            return this.buffList_.size();
         }

         public int getBuffList(int index) {
            return this.buffList_.getInt(index);
         }

         public Builder setBuffList(int index, int value) {
            this.ensureBuffListIsMutable();
            this.buffList_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addBuffList(int value) {
            this.ensureBuffListIsMutable();
            this.buffList_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllBuffList(Iterable<? extends Integer> values) {
            this.ensureBuffListIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.buffList_);
            this.onChanged();
            return this;
         }

         public Builder clearBuffList() {
            this.buffList_ = ExpeditionMsg.S2C_BuffList_10316.emptyIntList();
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

   public static final class C2S_OtherBuff_10317 extends GeneratedMessageV3 implements C2S_OtherBuff_10317OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      private byte memoizedIsInitialized;
      private static final C2S_OtherBuff_10317 DEFAULT_INSTANCE = new C2S_OtherBuff_10317();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OtherBuff_10317> PARSER = new AbstractParser<C2S_OtherBuff_10317>() {
         public C2S_OtherBuff_10317 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OtherBuff_10317(input, extensionRegistry);
         }
      };

      private C2S_OtherBuff_10317(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OtherBuff_10317() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OtherBuff_10317();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OtherBuff_10317(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_OtherBuff_10317_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_OtherBuff_10317_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OtherBuff_10317.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OtherBuff_10317)) {
            return super.equals(obj);
         } else {
            C2S_OtherBuff_10317 other = (C2S_OtherBuff_10317)obj;
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

      public static C2S_OtherBuff_10317 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OtherBuff_10317)PARSER.parseFrom(data);
      }

      public static C2S_OtherBuff_10317 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OtherBuff_10317)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OtherBuff_10317 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OtherBuff_10317)PARSER.parseFrom(data);
      }

      public static C2S_OtherBuff_10317 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OtherBuff_10317)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OtherBuff_10317 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OtherBuff_10317)PARSER.parseFrom(data);
      }

      public static C2S_OtherBuff_10317 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OtherBuff_10317)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OtherBuff_10317 parseFrom(InputStream input) throws IOException {
         return (C2S_OtherBuff_10317)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OtherBuff_10317 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OtherBuff_10317)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OtherBuff_10317 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OtherBuff_10317)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OtherBuff_10317 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OtherBuff_10317)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OtherBuff_10317 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OtherBuff_10317)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OtherBuff_10317 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OtherBuff_10317)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OtherBuff_10317 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OtherBuff_10317 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OtherBuff_10317> parser() {
         return PARSER;
      }

      public Parser<C2S_OtherBuff_10317> getParserForType() {
         return PARSER;
      }

      public C2S_OtherBuff_10317 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OtherBuff_10317OrBuilder {
         private int bitField0_;
         private int grid_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_OtherBuff_10317_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_OtherBuff_10317_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OtherBuff_10317.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.C2S_OtherBuff_10317.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_OtherBuff_10317_descriptor;
         }

         public C2S_OtherBuff_10317 getDefaultInstanceForType() {
            return ExpeditionMsg.C2S_OtherBuff_10317.getDefaultInstance();
         }

         public C2S_OtherBuff_10317 build() {
            C2S_OtherBuff_10317 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OtherBuff_10317 buildPartial() {
            C2S_OtherBuff_10317 result = new C2S_OtherBuff_10317(this);
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
            if (other instanceof C2S_OtherBuff_10317) {
               return this.mergeFrom((C2S_OtherBuff_10317)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OtherBuff_10317 other) {
            if (other == ExpeditionMsg.C2S_OtherBuff_10317.getDefaultInstance()) {
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
            C2S_OtherBuff_10317 parsedMessage = null;

            try {
               parsedMessage = (C2S_OtherBuff_10317)ExpeditionMsg.C2S_OtherBuff_10317.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OtherBuff_10317)e.getUnfinishedMessage();
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

   public static final class S2C_OtherBuff_10318 extends GeneratedMessageV3 implements S2C_OtherBuff_10318OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      private byte memoizedIsInitialized;
      private static final S2C_OtherBuff_10318 DEFAULT_INSTANCE = new S2C_OtherBuff_10318();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OtherBuff_10318> PARSER = new AbstractParser<S2C_OtherBuff_10318>() {
         public S2C_OtherBuff_10318 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OtherBuff_10318(input, extensionRegistry);
         }
      };

      private S2C_OtherBuff_10318(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OtherBuff_10318() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OtherBuff_10318();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OtherBuff_10318(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_OtherBuff_10318_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_OtherBuff_10318_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OtherBuff_10318.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OtherBuff_10318)) {
            return super.equals(obj);
         } else {
            S2C_OtherBuff_10318 other = (S2C_OtherBuff_10318)obj;
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

      public static S2C_OtherBuff_10318 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OtherBuff_10318)PARSER.parseFrom(data);
      }

      public static S2C_OtherBuff_10318 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OtherBuff_10318)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OtherBuff_10318 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OtherBuff_10318)PARSER.parseFrom(data);
      }

      public static S2C_OtherBuff_10318 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OtherBuff_10318)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OtherBuff_10318 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OtherBuff_10318)PARSER.parseFrom(data);
      }

      public static S2C_OtherBuff_10318 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OtherBuff_10318)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OtherBuff_10318 parseFrom(InputStream input) throws IOException {
         return (S2C_OtherBuff_10318)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OtherBuff_10318 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OtherBuff_10318)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OtherBuff_10318 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OtherBuff_10318)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OtherBuff_10318 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OtherBuff_10318)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OtherBuff_10318 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OtherBuff_10318)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OtherBuff_10318 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OtherBuff_10318)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OtherBuff_10318 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OtherBuff_10318 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OtherBuff_10318> parser() {
         return PARSER;
      }

      public Parser<S2C_OtherBuff_10318> getParserForType() {
         return PARSER;
      }

      public S2C_OtherBuff_10318 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OtherBuff_10318OrBuilder {
         private int bitField0_;
         private int grid_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_OtherBuff_10318_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_OtherBuff_10318_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OtherBuff_10318.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.S2C_OtherBuff_10318.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_OtherBuff_10318_descriptor;
         }

         public S2C_OtherBuff_10318 getDefaultInstanceForType() {
            return ExpeditionMsg.S2C_OtherBuff_10318.getDefaultInstance();
         }

         public S2C_OtherBuff_10318 build() {
            S2C_OtherBuff_10318 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OtherBuff_10318 buildPartial() {
            S2C_OtherBuff_10318 result = new S2C_OtherBuff_10318(this);
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
            if (other instanceof S2C_OtherBuff_10318) {
               return this.mergeFrom((S2C_OtherBuff_10318)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OtherBuff_10318 other) {
            if (other == ExpeditionMsg.S2C_OtherBuff_10318.getDefaultInstance()) {
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
            S2C_OtherBuff_10318 parsedMessage = null;

            try {
               parsedMessage = (S2C_OtherBuff_10318)ExpeditionMsg.S2C_OtherBuff_10318.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OtherBuff_10318)e.getUnfinishedMessage();
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

   public static final class C2S_RecruitHeroList_10319 extends GeneratedMessageV3 implements C2S_RecruitHeroList_10319OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      private byte memoizedIsInitialized;
      private static final C2S_RecruitHeroList_10319 DEFAULT_INSTANCE = new C2S_RecruitHeroList_10319();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecruitHeroList_10319> PARSER = new AbstractParser<C2S_RecruitHeroList_10319>() {
         public C2S_RecruitHeroList_10319 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecruitHeroList_10319(input, extensionRegistry);
         }
      };

      private C2S_RecruitHeroList_10319(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecruitHeroList_10319() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecruitHeroList_10319();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecruitHeroList_10319(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHeroList_10319_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHeroList_10319_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecruitHeroList_10319.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RecruitHeroList_10319)) {
            return super.equals(obj);
         } else {
            C2S_RecruitHeroList_10319 other = (C2S_RecruitHeroList_10319)obj;
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

      public static C2S_RecruitHeroList_10319 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecruitHeroList_10319)PARSER.parseFrom(data);
      }

      public static C2S_RecruitHeroList_10319 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitHeroList_10319)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitHeroList_10319 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecruitHeroList_10319)PARSER.parseFrom(data);
      }

      public static C2S_RecruitHeroList_10319 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitHeroList_10319)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitHeroList_10319 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecruitHeroList_10319)PARSER.parseFrom(data);
      }

      public static C2S_RecruitHeroList_10319 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitHeroList_10319)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitHeroList_10319 parseFrom(InputStream input) throws IOException {
         return (C2S_RecruitHeroList_10319)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecruitHeroList_10319 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitHeroList_10319)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecruitHeroList_10319 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecruitHeroList_10319)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecruitHeroList_10319 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitHeroList_10319)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecruitHeroList_10319 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecruitHeroList_10319)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecruitHeroList_10319 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitHeroList_10319)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecruitHeroList_10319 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecruitHeroList_10319 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecruitHeroList_10319> parser() {
         return PARSER;
      }

      public Parser<C2S_RecruitHeroList_10319> getParserForType() {
         return PARSER;
      }

      public C2S_RecruitHeroList_10319 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecruitHeroList_10319OrBuilder {
         private int bitField0_;
         private int grid_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHeroList_10319_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHeroList_10319_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecruitHeroList_10319.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.C2S_RecruitHeroList_10319.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHeroList_10319_descriptor;
         }

         public C2S_RecruitHeroList_10319 getDefaultInstanceForType() {
            return ExpeditionMsg.C2S_RecruitHeroList_10319.getDefaultInstance();
         }

         public C2S_RecruitHeroList_10319 build() {
            C2S_RecruitHeroList_10319 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecruitHeroList_10319 buildPartial() {
            C2S_RecruitHeroList_10319 result = new C2S_RecruitHeroList_10319(this);
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
            if (other instanceof C2S_RecruitHeroList_10319) {
               return this.mergeFrom((C2S_RecruitHeroList_10319)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecruitHeroList_10319 other) {
            if (other == ExpeditionMsg.C2S_RecruitHeroList_10319.getDefaultInstance()) {
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
            C2S_RecruitHeroList_10319 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecruitHeroList_10319)ExpeditionMsg.C2S_RecruitHeroList_10319.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecruitHeroList_10319)e.getUnfinishedMessage();
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

   public static final class S2C_RecruitHeroList_10320 extends GeneratedMessageV3 implements S2C_RecruitHeroList_10320OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GIRD_FIELD_NUMBER = 1;
      private int gird_;
      public static final int HERO_FIELD_NUMBER = 2;
      private List<CommonMsg.HeroInfo> hero_;
      private byte memoizedIsInitialized;
      private static final S2C_RecruitHeroList_10320 DEFAULT_INSTANCE = new S2C_RecruitHeroList_10320();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecruitHeroList_10320> PARSER = new AbstractParser<S2C_RecruitHeroList_10320>() {
         public S2C_RecruitHeroList_10320 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecruitHeroList_10320(input, extensionRegistry);
         }
      };

      private S2C_RecruitHeroList_10320(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecruitHeroList_10320() {
         this.memoizedIsInitialized = -1;
         this.hero_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecruitHeroList_10320();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecruitHeroList_10320(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.gird_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.hero_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.hero_.add(input.readMessage(CommonMsg.HeroInfo.PARSER, extensionRegistry));
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
                  this.hero_ = Collections.unmodifiableList(this.hero_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHeroList_10320_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHeroList_10320_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitHeroList_10320.class, Builder.class);
      }

      public boolean hasGird() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGird() {
         return this.gird_;
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

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGird()) {
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
            output.writeInt32(1, this.gird_);
         }

         for(int i = 0; i < this.hero_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.hero_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.gird_);
            }

            for(int i = 0; i < this.hero_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.hero_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RecruitHeroList_10320)) {
            return super.equals(obj);
         } else {
            S2C_RecruitHeroList_10320 other = (S2C_RecruitHeroList_10320)obj;
            if (this.hasGird() != other.hasGird()) {
               return false;
            } else if (this.hasGird() && this.getGird() != other.getGird()) {
               return false;
            } else if (!this.getHeroList().equals(other.getHeroList())) {
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
            if (this.hasGird()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGird();
            }

            if (this.getHeroCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RecruitHeroList_10320 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecruitHeroList_10320)PARSER.parseFrom(data);
      }

      public static S2C_RecruitHeroList_10320 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitHeroList_10320)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitHeroList_10320 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecruitHeroList_10320)PARSER.parseFrom(data);
      }

      public static S2C_RecruitHeroList_10320 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitHeroList_10320)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitHeroList_10320 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecruitHeroList_10320)PARSER.parseFrom(data);
      }

      public static S2C_RecruitHeroList_10320 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitHeroList_10320)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitHeroList_10320 parseFrom(InputStream input) throws IOException {
         return (S2C_RecruitHeroList_10320)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitHeroList_10320 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitHeroList_10320)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitHeroList_10320 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecruitHeroList_10320)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecruitHeroList_10320 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitHeroList_10320)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitHeroList_10320 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecruitHeroList_10320)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitHeroList_10320 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitHeroList_10320)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecruitHeroList_10320 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecruitHeroList_10320 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecruitHeroList_10320> parser() {
         return PARSER;
      }

      public Parser<S2C_RecruitHeroList_10320> getParserForType() {
         return PARSER;
      }

      public S2C_RecruitHeroList_10320 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecruitHeroList_10320OrBuilder {
         private int bitField0_;
         private int gird_;
         private List<CommonMsg.HeroInfo> hero_;
         private RepeatedFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> heroBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHeroList_10320_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHeroList_10320_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitHeroList_10320.class, Builder.class);
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
            if (ExpeditionMsg.S2C_RecruitHeroList_10320.alwaysUseFieldBuilders) {
               this.getHeroFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.gird_ = 0;
            this.bitField0_ &= -2;
            if (this.heroBuilder_ == null) {
               this.hero_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.heroBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHeroList_10320_descriptor;
         }

         public S2C_RecruitHeroList_10320 getDefaultInstanceForType() {
            return ExpeditionMsg.S2C_RecruitHeroList_10320.getDefaultInstance();
         }

         public S2C_RecruitHeroList_10320 build() {
            S2C_RecruitHeroList_10320 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecruitHeroList_10320 buildPartial() {
            S2C_RecruitHeroList_10320 result = new S2C_RecruitHeroList_10320(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.gird_ = this.gird_;
               to_bitField0_ |= 1;
            }

            if (this.heroBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.hero_ = Collections.unmodifiableList(this.hero_);
                  this.bitField0_ &= -3;
               }

               result.hero_ = this.hero_;
            } else {
               result.hero_ = this.heroBuilder_.build();
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
            if (other instanceof S2C_RecruitHeroList_10320) {
               return this.mergeFrom((S2C_RecruitHeroList_10320)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecruitHeroList_10320 other) {
            if (other == ExpeditionMsg.S2C_RecruitHeroList_10320.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGird()) {
                  this.setGird(other.getGird());
               }

               if (this.heroBuilder_ == null) {
                  if (!other.hero_.isEmpty()) {
                     if (this.hero_.isEmpty()) {
                        this.hero_ = other.hero_;
                        this.bitField0_ &= -3;
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
                     this.bitField0_ &= -3;
                     this.heroBuilder_ = ExpeditionMsg.S2C_RecruitHeroList_10320.alwaysUseFieldBuilders ? this.getHeroFieldBuilder() : null;
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
            if (!this.hasGird()) {
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
            S2C_RecruitHeroList_10320 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecruitHeroList_10320)ExpeditionMsg.S2C_RecruitHeroList_10320.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecruitHeroList_10320)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGird() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGird() {
            return this.gird_;
         }

         public Builder setGird(int value) {
            this.bitField0_ |= 1;
            this.gird_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGird() {
            this.bitField0_ &= -2;
            this.gird_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureHeroIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.hero_ = new ArrayList(this.hero_);
               this.bitField0_ |= 2;
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
               this.bitField0_ &= -3;
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
               this.heroBuilder_ = new RepeatedFieldBuilderV3(this.hero_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class C2S_RecruitHero_10321 extends GeneratedMessageV3 implements C2S_RecruitHero_10321OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      public static final int CODEID_FIELD_NUMBER = 2;
      private int codeId_;
      private byte memoizedIsInitialized;
      private static final C2S_RecruitHero_10321 DEFAULT_INSTANCE = new C2S_RecruitHero_10321();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecruitHero_10321> PARSER = new AbstractParser<C2S_RecruitHero_10321>() {
         public C2S_RecruitHero_10321 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecruitHero_10321(input, extensionRegistry);
         }
      };

      private C2S_RecruitHero_10321(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecruitHero_10321() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecruitHero_10321();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecruitHero_10321(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.codeId_ = input.readInt32();
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHero_10321_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHero_10321_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecruitHero_10321.class, Builder.class);
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public boolean hasCodeId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCodeId() {
         return this.codeId_;
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
         } else if (!this.hasCodeId()) {
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
            output.writeInt32(2, this.codeId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.codeId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RecruitHero_10321)) {
            return super.equals(obj);
         } else {
            C2S_RecruitHero_10321 other = (C2S_RecruitHero_10321)obj;
            if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
               return false;
            } else if (this.hasCodeId() != other.hasCodeId()) {
               return false;
            } else if (this.hasCodeId() && this.getCodeId() != other.getCodeId()) {
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

            if (this.hasCodeId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCodeId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RecruitHero_10321 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecruitHero_10321)PARSER.parseFrom(data);
      }

      public static C2S_RecruitHero_10321 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitHero_10321)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitHero_10321 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecruitHero_10321)PARSER.parseFrom(data);
      }

      public static C2S_RecruitHero_10321 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitHero_10321)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitHero_10321 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecruitHero_10321)PARSER.parseFrom(data);
      }

      public static C2S_RecruitHero_10321 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitHero_10321)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitHero_10321 parseFrom(InputStream input) throws IOException {
         return (C2S_RecruitHero_10321)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecruitHero_10321 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitHero_10321)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecruitHero_10321 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecruitHero_10321)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecruitHero_10321 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitHero_10321)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecruitHero_10321 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecruitHero_10321)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecruitHero_10321 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitHero_10321)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecruitHero_10321 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecruitHero_10321 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecruitHero_10321> parser() {
         return PARSER;
      }

      public Parser<C2S_RecruitHero_10321> getParserForType() {
         return PARSER;
      }

      public C2S_RecruitHero_10321 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecruitHero_10321OrBuilder {
         private int bitField0_;
         private int grid_;
         private int codeId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHero_10321_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHero_10321_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecruitHero_10321.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.C2S_RecruitHero_10321.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            this.codeId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHero_10321_descriptor;
         }

         public C2S_RecruitHero_10321 getDefaultInstanceForType() {
            return ExpeditionMsg.C2S_RecruitHero_10321.getDefaultInstance();
         }

         public C2S_RecruitHero_10321 build() {
            C2S_RecruitHero_10321 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecruitHero_10321 buildPartial() {
            C2S_RecruitHero_10321 result = new C2S_RecruitHero_10321(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.grid_ = this.grid_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.codeId_ = this.codeId_;
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
            if (other instanceof C2S_RecruitHero_10321) {
               return this.mergeFrom((C2S_RecruitHero_10321)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecruitHero_10321 other) {
            if (other == ExpeditionMsg.C2S_RecruitHero_10321.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               if (other.hasCodeId()) {
                  this.setCodeId(other.getCodeId());
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
               return this.hasCodeId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RecruitHero_10321 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecruitHero_10321)ExpeditionMsg.C2S_RecruitHero_10321.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecruitHero_10321)e.getUnfinishedMessage();
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

         public boolean hasCodeId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCodeId() {
            return this.codeId_;
         }

         public Builder setCodeId(int value) {
            this.bitField0_ |= 2;
            this.codeId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCodeId() {
            this.bitField0_ &= -3;
            this.codeId_ = 0;
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

   public static final class S2C_RecruitHero_10322 extends GeneratedMessageV3 implements S2C_RecruitHero_10322OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      public static final int CODEID_FIELD_NUMBER = 2;
      private int codeId_;
      private byte memoizedIsInitialized;
      private static final S2C_RecruitHero_10322 DEFAULT_INSTANCE = new S2C_RecruitHero_10322();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecruitHero_10322> PARSER = new AbstractParser<S2C_RecruitHero_10322>() {
         public S2C_RecruitHero_10322 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecruitHero_10322(input, extensionRegistry);
         }
      };

      private S2C_RecruitHero_10322(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecruitHero_10322() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecruitHero_10322();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecruitHero_10322(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.codeId_ = input.readInt32();
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHero_10322_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHero_10322_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitHero_10322.class, Builder.class);
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public boolean hasCodeId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCodeId() {
         return this.codeId_;
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
         } else if (!this.hasCodeId()) {
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
            output.writeInt32(2, this.codeId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.codeId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RecruitHero_10322)) {
            return super.equals(obj);
         } else {
            S2C_RecruitHero_10322 other = (S2C_RecruitHero_10322)obj;
            if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
               return false;
            } else if (this.hasCodeId() != other.hasCodeId()) {
               return false;
            } else if (this.hasCodeId() && this.getCodeId() != other.getCodeId()) {
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

            if (this.hasCodeId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCodeId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RecruitHero_10322 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecruitHero_10322)PARSER.parseFrom(data);
      }

      public static S2C_RecruitHero_10322 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitHero_10322)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitHero_10322 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecruitHero_10322)PARSER.parseFrom(data);
      }

      public static S2C_RecruitHero_10322 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitHero_10322)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitHero_10322 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecruitHero_10322)PARSER.parseFrom(data);
      }

      public static S2C_RecruitHero_10322 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitHero_10322)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitHero_10322 parseFrom(InputStream input) throws IOException {
         return (S2C_RecruitHero_10322)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitHero_10322 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitHero_10322)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitHero_10322 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecruitHero_10322)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecruitHero_10322 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitHero_10322)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitHero_10322 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecruitHero_10322)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitHero_10322 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitHero_10322)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecruitHero_10322 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecruitHero_10322 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecruitHero_10322> parser() {
         return PARSER;
      }

      public Parser<S2C_RecruitHero_10322> getParserForType() {
         return PARSER;
      }

      public S2C_RecruitHero_10322 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecruitHero_10322OrBuilder {
         private int bitField0_;
         private int grid_;
         private int codeId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHero_10322_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHero_10322_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitHero_10322.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.S2C_RecruitHero_10322.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            this.codeId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHero_10322_descriptor;
         }

         public S2C_RecruitHero_10322 getDefaultInstanceForType() {
            return ExpeditionMsg.S2C_RecruitHero_10322.getDefaultInstance();
         }

         public S2C_RecruitHero_10322 build() {
            S2C_RecruitHero_10322 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecruitHero_10322 buildPartial() {
            S2C_RecruitHero_10322 result = new S2C_RecruitHero_10322(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.grid_ = this.grid_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.codeId_ = this.codeId_;
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
            if (other instanceof S2C_RecruitHero_10322) {
               return this.mergeFrom((S2C_RecruitHero_10322)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecruitHero_10322 other) {
            if (other == ExpeditionMsg.S2C_RecruitHero_10322.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               if (other.hasCodeId()) {
                  this.setCodeId(other.getCodeId());
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
               return this.hasCodeId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RecruitHero_10322 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecruitHero_10322)ExpeditionMsg.S2C_RecruitHero_10322.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecruitHero_10322)e.getUnfinishedMessage();
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

         public boolean hasCodeId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCodeId() {
            return this.codeId_;
         }

         public Builder setCodeId(int value) {
            this.bitField0_ |= 2;
            this.codeId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCodeId() {
            this.bitField0_ &= -3;
            this.codeId_ = 0;
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

   public static final class C2S_EnemyData_10323 extends GeneratedMessageV3 implements C2S_EnemyData_10323OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      private byte memoizedIsInitialized;
      private static final C2S_EnemyData_10323 DEFAULT_INSTANCE = new C2S_EnemyData_10323();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_EnemyData_10323> PARSER = new AbstractParser<C2S_EnemyData_10323>() {
         public C2S_EnemyData_10323 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_EnemyData_10323(input, extensionRegistry);
         }
      };

      private C2S_EnemyData_10323(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_EnemyData_10323() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_EnemyData_10323();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_EnemyData_10323(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_EnemyData_10323_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_EnemyData_10323_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnemyData_10323.class, Builder.class);
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
         } else if (!(obj instanceof C2S_EnemyData_10323)) {
            return super.equals(obj);
         } else {
            C2S_EnemyData_10323 other = (C2S_EnemyData_10323)obj;
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

      public static C2S_EnemyData_10323 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_EnemyData_10323)PARSER.parseFrom(data);
      }

      public static C2S_EnemyData_10323 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnemyData_10323)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnemyData_10323 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_EnemyData_10323)PARSER.parseFrom(data);
      }

      public static C2S_EnemyData_10323 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnemyData_10323)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnemyData_10323 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_EnemyData_10323)PARSER.parseFrom(data);
      }

      public static C2S_EnemyData_10323 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnemyData_10323)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnemyData_10323 parseFrom(InputStream input) throws IOException {
         return (C2S_EnemyData_10323)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnemyData_10323 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnemyData_10323)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnemyData_10323 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_EnemyData_10323)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_EnemyData_10323 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnemyData_10323)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnemyData_10323 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_EnemyData_10323)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnemyData_10323 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnemyData_10323)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_EnemyData_10323 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_EnemyData_10323 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_EnemyData_10323> parser() {
         return PARSER;
      }

      public Parser<C2S_EnemyData_10323> getParserForType() {
         return PARSER;
      }

      public C2S_EnemyData_10323 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_EnemyData_10323OrBuilder {
         private int bitField0_;
         private int grid_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_EnemyData_10323_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_EnemyData_10323_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnemyData_10323.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.C2S_EnemyData_10323.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_EnemyData_10323_descriptor;
         }

         public C2S_EnemyData_10323 getDefaultInstanceForType() {
            return ExpeditionMsg.C2S_EnemyData_10323.getDefaultInstance();
         }

         public C2S_EnemyData_10323 build() {
            C2S_EnemyData_10323 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_EnemyData_10323 buildPartial() {
            C2S_EnemyData_10323 result = new C2S_EnemyData_10323(this);
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
            if (other instanceof C2S_EnemyData_10323) {
               return this.mergeFrom((C2S_EnemyData_10323)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_EnemyData_10323 other) {
            if (other == ExpeditionMsg.C2S_EnemyData_10323.getDefaultInstance()) {
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
            C2S_EnemyData_10323 parsedMessage = null;

            try {
               parsedMessage = (C2S_EnemyData_10323)ExpeditionMsg.C2S_EnemyData_10323.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_EnemyData_10323)e.getUnfinishedMessage();
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

   public static final class S2C_EnemyData_10324 extends GeneratedMessageV3 implements S2C_EnemyData_10324OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      public static final int PASSED_FIELD_NUMBER = 2;
      private boolean passed_;
      public static final int HPDATA_FIELD_NUMBER = 3;
      private List<HpData> hpData_;
      private byte memoizedIsInitialized;
      private static final S2C_EnemyData_10324 DEFAULT_INSTANCE = new S2C_EnemyData_10324();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_EnemyData_10324> PARSER = new AbstractParser<S2C_EnemyData_10324>() {
         public S2C_EnemyData_10324 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_EnemyData_10324(input, extensionRegistry);
         }
      };

      private S2C_EnemyData_10324(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_EnemyData_10324() {
         this.memoizedIsInitialized = -1;
         this.hpData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_EnemyData_10324();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_EnemyData_10324(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.passed_ = input.readBool();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.hpData_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.hpData_.add(input.readMessage(ExpeditionMsg.HpData.PARSER, extensionRegistry));
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
                  this.hpData_ = Collections.unmodifiableList(this.hpData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_EnemyData_10324_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_EnemyData_10324_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnemyData_10324.class, Builder.class);
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public boolean hasPassed() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getPassed() {
         return this.passed_;
      }

      public List<HpData> getHpDataList() {
         return this.hpData_;
      }

      public List<? extends HpDataOrBuilder> getHpDataOrBuilderList() {
         return this.hpData_;
      }

      public int getHpDataCount() {
         return this.hpData_.size();
      }

      public HpData getHpData(int index) {
         return (HpData)this.hpData_.get(index);
      }

      public HpDataOrBuilder getHpDataOrBuilder(int index) {
         return (HpDataOrBuilder)this.hpData_.get(index);
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
         } else if (!this.hasPassed()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getHpDataCount(); ++i) {
               if (!this.getHpData(i).isInitialized()) {
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
            output.writeInt32(1, this.grid_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.passed_);
         }

         for(int i = 0; i < this.hpData_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.hpData_.get(i));
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
               size += CodedOutputStream.computeBoolSize(2, this.passed_);
            }

            for(int i = 0; i < this.hpData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.hpData_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_EnemyData_10324)) {
            return super.equals(obj);
         } else {
            S2C_EnemyData_10324 other = (S2C_EnemyData_10324)obj;
            if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
               return false;
            } else if (this.hasPassed() != other.hasPassed()) {
               return false;
            } else if (this.hasPassed() && this.getPassed() != other.getPassed()) {
               return false;
            } else if (!this.getHpDataList().equals(other.getHpDataList())) {
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

            if (this.hasPassed()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getPassed());
            }

            if (this.getHpDataCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHpDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_EnemyData_10324 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_EnemyData_10324)PARSER.parseFrom(data);
      }

      public static S2C_EnemyData_10324 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnemyData_10324)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnemyData_10324 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_EnemyData_10324)PARSER.parseFrom(data);
      }

      public static S2C_EnemyData_10324 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnemyData_10324)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnemyData_10324 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_EnemyData_10324)PARSER.parseFrom(data);
      }

      public static S2C_EnemyData_10324 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnemyData_10324)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnemyData_10324 parseFrom(InputStream input) throws IOException {
         return (S2C_EnemyData_10324)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnemyData_10324 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnemyData_10324)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnemyData_10324 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_EnemyData_10324)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_EnemyData_10324 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnemyData_10324)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnemyData_10324 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_EnemyData_10324)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnemyData_10324 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnemyData_10324)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_EnemyData_10324 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_EnemyData_10324 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_EnemyData_10324> parser() {
         return PARSER;
      }

      public Parser<S2C_EnemyData_10324> getParserForType() {
         return PARSER;
      }

      public S2C_EnemyData_10324 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_EnemyData_10324OrBuilder {
         private int bitField0_;
         private int grid_;
         private boolean passed_;
         private List<HpData> hpData_;
         private RepeatedFieldBuilderV3<HpData, HpData.Builder, HpDataOrBuilder> hpDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_EnemyData_10324_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_EnemyData_10324_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnemyData_10324.class, Builder.class);
         }

         private Builder() {
            this.hpData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.hpData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.S2C_EnemyData_10324.alwaysUseFieldBuilders) {
               this.getHpDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            this.passed_ = false;
            this.bitField0_ &= -3;
            if (this.hpDataBuilder_ == null) {
               this.hpData_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.hpDataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_EnemyData_10324_descriptor;
         }

         public S2C_EnemyData_10324 getDefaultInstanceForType() {
            return ExpeditionMsg.S2C_EnemyData_10324.getDefaultInstance();
         }

         public S2C_EnemyData_10324 build() {
            S2C_EnemyData_10324 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_EnemyData_10324 buildPartial() {
            S2C_EnemyData_10324 result = new S2C_EnemyData_10324(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.grid_ = this.grid_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.passed_ = this.passed_;
               to_bitField0_ |= 2;
            }

            if (this.hpDataBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.hpData_ = Collections.unmodifiableList(this.hpData_);
                  this.bitField0_ &= -5;
               }

               result.hpData_ = this.hpData_;
            } else {
               result.hpData_ = this.hpDataBuilder_.build();
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
            if (other instanceof S2C_EnemyData_10324) {
               return this.mergeFrom((S2C_EnemyData_10324)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_EnemyData_10324 other) {
            if (other == ExpeditionMsg.S2C_EnemyData_10324.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               if (other.hasPassed()) {
                  this.setPassed(other.getPassed());
               }

               if (this.hpDataBuilder_ == null) {
                  if (!other.hpData_.isEmpty()) {
                     if (this.hpData_.isEmpty()) {
                        this.hpData_ = other.hpData_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureHpDataIsMutable();
                        this.hpData_.addAll(other.hpData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.hpData_.isEmpty()) {
                  if (this.hpDataBuilder_.isEmpty()) {
                     this.hpDataBuilder_.dispose();
                     this.hpDataBuilder_ = null;
                     this.hpData_ = other.hpData_;
                     this.bitField0_ &= -5;
                     this.hpDataBuilder_ = ExpeditionMsg.S2C_EnemyData_10324.alwaysUseFieldBuilders ? this.getHpDataFieldBuilder() : null;
                  } else {
                     this.hpDataBuilder_.addAllMessages(other.hpData_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGrid()) {
               return false;
            } else if (!this.hasPassed()) {
               return false;
            } else {
               for(int i = 0; i < this.getHpDataCount(); ++i) {
                  if (!this.getHpData(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_EnemyData_10324 parsedMessage = null;

            try {
               parsedMessage = (S2C_EnemyData_10324)ExpeditionMsg.S2C_EnemyData_10324.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_EnemyData_10324)e.getUnfinishedMessage();
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

         public boolean hasPassed() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getPassed() {
            return this.passed_;
         }

         public Builder setPassed(boolean value) {
            this.bitField0_ |= 2;
            this.passed_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPassed() {
            this.bitField0_ &= -3;
            this.passed_ = false;
            this.onChanged();
            return this;
         }

         private void ensureHpDataIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.hpData_ = new ArrayList(this.hpData_);
               this.bitField0_ |= 4;
            }

         }

         public List<HpData> getHpDataList() {
            return this.hpDataBuilder_ == null ? Collections.unmodifiableList(this.hpData_) : this.hpDataBuilder_.getMessageList();
         }

         public int getHpDataCount() {
            return this.hpDataBuilder_ == null ? this.hpData_.size() : this.hpDataBuilder_.getCount();
         }

         public HpData getHpData(int index) {
            return this.hpDataBuilder_ == null ? (HpData)this.hpData_.get(index) : (HpData)this.hpDataBuilder_.getMessage(index);
         }

         public Builder setHpData(int index, HpData value) {
            if (this.hpDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHpDataIsMutable();
               this.hpData_.set(index, value);
               this.onChanged();
            } else {
               this.hpDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setHpData(int index, HpData.Builder builderForValue) {
            if (this.hpDataBuilder_ == null) {
               this.ensureHpDataIsMutable();
               this.hpData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.hpDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHpData(HpData value) {
            if (this.hpDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHpDataIsMutable();
               this.hpData_.add(value);
               this.onChanged();
            } else {
               this.hpDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addHpData(int index, HpData value) {
            if (this.hpDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHpDataIsMutable();
               this.hpData_.add(index, value);
               this.onChanged();
            } else {
               this.hpDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addHpData(HpData.Builder builderForValue) {
            if (this.hpDataBuilder_ == null) {
               this.ensureHpDataIsMutable();
               this.hpData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.hpDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHpData(int index, HpData.Builder builderForValue) {
            if (this.hpDataBuilder_ == null) {
               this.ensureHpDataIsMutable();
               this.hpData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.hpDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHpData(Iterable<? extends HpData> values) {
            if (this.hpDataBuilder_ == null) {
               this.ensureHpDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.hpData_);
               this.onChanged();
            } else {
               this.hpDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearHpData() {
            if (this.hpDataBuilder_ == null) {
               this.hpData_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.hpDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeHpData(int index) {
            if (this.hpDataBuilder_ == null) {
               this.ensureHpDataIsMutable();
               this.hpData_.remove(index);
               this.onChanged();
            } else {
               this.hpDataBuilder_.remove(index);
            }

            return this;
         }

         public HpData.Builder getHpDataBuilder(int index) {
            return (HpData.Builder)this.getHpDataFieldBuilder().getBuilder(index);
         }

         public HpDataOrBuilder getHpDataOrBuilder(int index) {
            return this.hpDataBuilder_ == null ? (HpDataOrBuilder)this.hpData_.get(index) : (HpDataOrBuilder)this.hpDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HpDataOrBuilder> getHpDataOrBuilderList() {
            return this.hpDataBuilder_ != null ? this.hpDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.hpData_);
         }

         public HpData.Builder addHpDataBuilder() {
            return (HpData.Builder)this.getHpDataFieldBuilder().addBuilder(ExpeditionMsg.HpData.getDefaultInstance());
         }

         public HpData.Builder addHpDataBuilder(int index) {
            return (HpData.Builder)this.getHpDataFieldBuilder().addBuilder(index, ExpeditionMsg.HpData.getDefaultInstance());
         }

         public List<HpData.Builder> getHpDataBuilderList() {
            return this.getHpDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HpData, HpData.Builder, HpDataOrBuilder> getHpDataFieldBuilder() {
            if (this.hpDataBuilder_ == null) {
               this.hpDataBuilder_ = new RepeatedFieldBuilderV3(this.hpData_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.hpData_ = null;
            }

            return this.hpDataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_RecruitHeroData_10325 extends GeneratedMessageV3 implements C2S_RecruitHeroData_10325OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_RecruitHeroData_10325 DEFAULT_INSTANCE = new C2S_RecruitHeroData_10325();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecruitHeroData_10325> PARSER = new AbstractParser<C2S_RecruitHeroData_10325>() {
         public C2S_RecruitHeroData_10325 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecruitHeroData_10325(input, extensionRegistry);
         }
      };

      private C2S_RecruitHeroData_10325(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecruitHeroData_10325() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecruitHeroData_10325();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecruitHeroData_10325(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHeroData_10325_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHeroData_10325_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecruitHeroData_10325.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RecruitHeroData_10325)) {
            return super.equals(obj);
         } else {
            C2S_RecruitHeroData_10325 other = (C2S_RecruitHeroData_10325)obj;
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

      public static C2S_RecruitHeroData_10325 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecruitHeroData_10325)PARSER.parseFrom(data);
      }

      public static C2S_RecruitHeroData_10325 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitHeroData_10325)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitHeroData_10325 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecruitHeroData_10325)PARSER.parseFrom(data);
      }

      public static C2S_RecruitHeroData_10325 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitHeroData_10325)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitHeroData_10325 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecruitHeroData_10325)PARSER.parseFrom(data);
      }

      public static C2S_RecruitHeroData_10325 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitHeroData_10325)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitHeroData_10325 parseFrom(InputStream input) throws IOException {
         return (C2S_RecruitHeroData_10325)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecruitHeroData_10325 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitHeroData_10325)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecruitHeroData_10325 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecruitHeroData_10325)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecruitHeroData_10325 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitHeroData_10325)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecruitHeroData_10325 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecruitHeroData_10325)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecruitHeroData_10325 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitHeroData_10325)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecruitHeroData_10325 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecruitHeroData_10325 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecruitHeroData_10325> parser() {
         return PARSER;
      }

      public Parser<C2S_RecruitHeroData_10325> getParserForType() {
         return PARSER;
      }

      public C2S_RecruitHeroData_10325 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecruitHeroData_10325OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHeroData_10325_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHeroData_10325_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecruitHeroData_10325.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.C2S_RecruitHeroData_10325.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_RecruitHeroData_10325_descriptor;
         }

         public C2S_RecruitHeroData_10325 getDefaultInstanceForType() {
            return ExpeditionMsg.C2S_RecruitHeroData_10325.getDefaultInstance();
         }

         public C2S_RecruitHeroData_10325 build() {
            C2S_RecruitHeroData_10325 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecruitHeroData_10325 buildPartial() {
            C2S_RecruitHeroData_10325 result = new C2S_RecruitHeroData_10325(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_RecruitHeroData_10325) {
               return this.mergeFrom((C2S_RecruitHeroData_10325)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecruitHeroData_10325 other) {
            if (other == ExpeditionMsg.C2S_RecruitHeroData_10325.getDefaultInstance()) {
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
            C2S_RecruitHeroData_10325 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecruitHeroData_10325)ExpeditionMsg.C2S_RecruitHeroData_10325.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecruitHeroData_10325)e.getUnfinishedMessage();
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

   public static final class S2C_RecruitHeroData_10326 extends GeneratedMessageV3 implements S2C_RecruitHeroData_10326OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int HERO_FIELD_NUMBER = 2;
      private List<CommonMsg.HeroInfo> hero_;
      private byte memoizedIsInitialized;
      private static final S2C_RecruitHeroData_10326 DEFAULT_INSTANCE = new S2C_RecruitHeroData_10326();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecruitHeroData_10326> PARSER = new AbstractParser<S2C_RecruitHeroData_10326>() {
         public S2C_RecruitHeroData_10326 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecruitHeroData_10326(input, extensionRegistry);
         }
      };

      private S2C_RecruitHeroData_10326(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecruitHeroData_10326() {
         this.memoizedIsInitialized = -1;
         this.hero_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecruitHeroData_10326();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecruitHeroData_10326(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.hero_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.hero_.add(input.readMessage(CommonMsg.HeroInfo.PARSER, extensionRegistry));
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHeroData_10326_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHeroData_10326_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitHeroData_10326.class, Builder.class);
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

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
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
         for(int i = 0; i < this.hero_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.hero_.get(i));
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
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.hero_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RecruitHeroData_10326)) {
            return super.equals(obj);
         } else {
            S2C_RecruitHeroData_10326 other = (S2C_RecruitHeroData_10326)obj;
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
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RecruitHeroData_10326 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecruitHeroData_10326)PARSER.parseFrom(data);
      }

      public static S2C_RecruitHeroData_10326 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitHeroData_10326)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitHeroData_10326 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecruitHeroData_10326)PARSER.parseFrom(data);
      }

      public static S2C_RecruitHeroData_10326 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitHeroData_10326)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitHeroData_10326 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecruitHeroData_10326)PARSER.parseFrom(data);
      }

      public static S2C_RecruitHeroData_10326 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitHeroData_10326)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitHeroData_10326 parseFrom(InputStream input) throws IOException {
         return (S2C_RecruitHeroData_10326)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitHeroData_10326 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitHeroData_10326)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitHeroData_10326 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecruitHeroData_10326)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecruitHeroData_10326 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitHeroData_10326)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitHeroData_10326 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecruitHeroData_10326)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitHeroData_10326 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitHeroData_10326)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecruitHeroData_10326 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecruitHeroData_10326 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecruitHeroData_10326> parser() {
         return PARSER;
      }

      public Parser<S2C_RecruitHeroData_10326> getParserForType() {
         return PARSER;
      }

      public S2C_RecruitHeroData_10326 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecruitHeroData_10326OrBuilder {
         private int bitField0_;
         private List<CommonMsg.HeroInfo> hero_;
         private RepeatedFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> heroBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHeroData_10326_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHeroData_10326_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitHeroData_10326.class, Builder.class);
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
            if (ExpeditionMsg.S2C_RecruitHeroData_10326.alwaysUseFieldBuilders) {
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
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_RecruitHeroData_10326_descriptor;
         }

         public S2C_RecruitHeroData_10326 getDefaultInstanceForType() {
            return ExpeditionMsg.S2C_RecruitHeroData_10326.getDefaultInstance();
         }

         public S2C_RecruitHeroData_10326 build() {
            S2C_RecruitHeroData_10326 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecruitHeroData_10326 buildPartial() {
            S2C_RecruitHeroData_10326 result = new S2C_RecruitHeroData_10326(this);
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
            if (other instanceof S2C_RecruitHeroData_10326) {
               return this.mergeFrom((S2C_RecruitHeroData_10326)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecruitHeroData_10326 other) {
            if (other == ExpeditionMsg.S2C_RecruitHeroData_10326.getDefaultInstance()) {
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
                     this.heroBuilder_ = ExpeditionMsg.S2C_RecruitHeroData_10326.alwaysUseFieldBuilders ? this.getHeroFieldBuilder() : null;
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
            for(int i = 0; i < this.getHeroCount(); ++i) {
               if (!this.getHero(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RecruitHeroData_10326 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecruitHeroData_10326)ExpeditionMsg.S2C_RecruitHeroData_10326.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecruitHeroData_10326)e.getUnfinishedMessage();
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

   public static final class C2S_HeroHpData_10327 extends GeneratedMessageV3 implements C2S_HeroHpData_10327OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_HeroHpData_10327 DEFAULT_INSTANCE = new C2S_HeroHpData_10327();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HeroHpData_10327> PARSER = new AbstractParser<C2S_HeroHpData_10327>() {
         public C2S_HeroHpData_10327 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HeroHpData_10327(input, extensionRegistry);
         }
      };

      private C2S_HeroHpData_10327(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HeroHpData_10327() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HeroHpData_10327();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HeroHpData_10327(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_HeroHpData_10327_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_HeroHpData_10327_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroHpData_10327.class, Builder.class);
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
         } else if (!(obj instanceof C2S_HeroHpData_10327)) {
            return super.equals(obj);
         } else {
            C2S_HeroHpData_10327 other = (C2S_HeroHpData_10327)obj;
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

      public static C2S_HeroHpData_10327 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HeroHpData_10327)PARSER.parseFrom(data);
      }

      public static C2S_HeroHpData_10327 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroHpData_10327)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroHpData_10327 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HeroHpData_10327)PARSER.parseFrom(data);
      }

      public static C2S_HeroHpData_10327 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroHpData_10327)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroHpData_10327 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HeroHpData_10327)PARSER.parseFrom(data);
      }

      public static C2S_HeroHpData_10327 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroHpData_10327)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroHpData_10327 parseFrom(InputStream input) throws IOException {
         return (C2S_HeroHpData_10327)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroHpData_10327 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroHpData_10327)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroHpData_10327 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HeroHpData_10327)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HeroHpData_10327 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroHpData_10327)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroHpData_10327 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HeroHpData_10327)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroHpData_10327 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroHpData_10327)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HeroHpData_10327 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HeroHpData_10327 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HeroHpData_10327> parser() {
         return PARSER;
      }

      public Parser<C2S_HeroHpData_10327> getParserForType() {
         return PARSER;
      }

      public C2S_HeroHpData_10327 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HeroHpData_10327OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_HeroHpData_10327_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_HeroHpData_10327_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroHpData_10327.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.C2S_HeroHpData_10327.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_HeroHpData_10327_descriptor;
         }

         public C2S_HeroHpData_10327 getDefaultInstanceForType() {
            return ExpeditionMsg.C2S_HeroHpData_10327.getDefaultInstance();
         }

         public C2S_HeroHpData_10327 build() {
            C2S_HeroHpData_10327 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HeroHpData_10327 buildPartial() {
            C2S_HeroHpData_10327 result = new C2S_HeroHpData_10327(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_HeroHpData_10327) {
               return this.mergeFrom((C2S_HeroHpData_10327)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HeroHpData_10327 other) {
            if (other == ExpeditionMsg.C2S_HeroHpData_10327.getDefaultInstance()) {
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
            C2S_HeroHpData_10327 parsedMessage = null;

            try {
               parsedMessage = (C2S_HeroHpData_10327)ExpeditionMsg.C2S_HeroHpData_10327.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HeroHpData_10327)e.getUnfinishedMessage();
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

   public static final class S2C_HeroHpData_10328 extends GeneratedMessageV3 implements S2C_HeroHpData_10328OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int HPDATA_FIELD_NUMBER = 1;
      private List<HpData> hpData_;
      private byte memoizedIsInitialized;
      private static final S2C_HeroHpData_10328 DEFAULT_INSTANCE = new S2C_HeroHpData_10328();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroHpData_10328> PARSER = new AbstractParser<S2C_HeroHpData_10328>() {
         public S2C_HeroHpData_10328 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroHpData_10328(input, extensionRegistry);
         }
      };

      private S2C_HeroHpData_10328(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroHpData_10328() {
         this.memoizedIsInitialized = -1;
         this.hpData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroHpData_10328();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroHpData_10328(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.hpData_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.hpData_.add(input.readMessage(ExpeditionMsg.HpData.PARSER, extensionRegistry));
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
                  this.hpData_ = Collections.unmodifiableList(this.hpData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_HeroHpData_10328_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_HeroHpData_10328_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroHpData_10328.class, Builder.class);
      }

      public List<HpData> getHpDataList() {
         return this.hpData_;
      }

      public List<? extends HpDataOrBuilder> getHpDataOrBuilderList() {
         return this.hpData_;
      }

      public int getHpDataCount() {
         return this.hpData_.size();
      }

      public HpData getHpData(int index) {
         return (HpData)this.hpData_.get(index);
      }

      public HpDataOrBuilder getHpDataOrBuilder(int index) {
         return (HpDataOrBuilder)this.hpData_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getHpDataCount(); ++i) {
               if (!this.getHpData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.hpData_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.hpData_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.hpData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.hpData_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HeroHpData_10328)) {
            return super.equals(obj);
         } else {
            S2C_HeroHpData_10328 other = (S2C_HeroHpData_10328)obj;
            if (!this.getHpDataList().equals(other.getHpDataList())) {
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
            if (this.getHpDataCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHpDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HeroHpData_10328 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroHpData_10328)PARSER.parseFrom(data);
      }

      public static S2C_HeroHpData_10328 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroHpData_10328)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroHpData_10328 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroHpData_10328)PARSER.parseFrom(data);
      }

      public static S2C_HeroHpData_10328 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroHpData_10328)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroHpData_10328 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroHpData_10328)PARSER.parseFrom(data);
      }

      public static S2C_HeroHpData_10328 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroHpData_10328)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroHpData_10328 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroHpData_10328)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroHpData_10328 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroHpData_10328)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroHpData_10328 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroHpData_10328)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroHpData_10328 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroHpData_10328)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroHpData_10328 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroHpData_10328)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroHpData_10328 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroHpData_10328)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroHpData_10328 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroHpData_10328 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroHpData_10328> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroHpData_10328> getParserForType() {
         return PARSER;
      }

      public S2C_HeroHpData_10328 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroHpData_10328OrBuilder {
         private int bitField0_;
         private List<HpData> hpData_;
         private RepeatedFieldBuilderV3<HpData, HpData.Builder, HpDataOrBuilder> hpDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_HeroHpData_10328_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_HeroHpData_10328_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroHpData_10328.class, Builder.class);
         }

         private Builder() {
            this.hpData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.hpData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.S2C_HeroHpData_10328.alwaysUseFieldBuilders) {
               this.getHpDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.hpDataBuilder_ == null) {
               this.hpData_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.hpDataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_HeroHpData_10328_descriptor;
         }

         public S2C_HeroHpData_10328 getDefaultInstanceForType() {
            return ExpeditionMsg.S2C_HeroHpData_10328.getDefaultInstance();
         }

         public S2C_HeroHpData_10328 build() {
            S2C_HeroHpData_10328 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroHpData_10328 buildPartial() {
            S2C_HeroHpData_10328 result = new S2C_HeroHpData_10328(this);
            int from_bitField0_ = this.bitField0_;
            if (this.hpDataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.hpData_ = Collections.unmodifiableList(this.hpData_);
                  this.bitField0_ &= -2;
               }

               result.hpData_ = this.hpData_;
            } else {
               result.hpData_ = this.hpDataBuilder_.build();
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
            if (other instanceof S2C_HeroHpData_10328) {
               return this.mergeFrom((S2C_HeroHpData_10328)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroHpData_10328 other) {
            if (other == ExpeditionMsg.S2C_HeroHpData_10328.getDefaultInstance()) {
               return this;
            } else {
               if (this.hpDataBuilder_ == null) {
                  if (!other.hpData_.isEmpty()) {
                     if (this.hpData_.isEmpty()) {
                        this.hpData_ = other.hpData_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureHpDataIsMutable();
                        this.hpData_.addAll(other.hpData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.hpData_.isEmpty()) {
                  if (this.hpDataBuilder_.isEmpty()) {
                     this.hpDataBuilder_.dispose();
                     this.hpDataBuilder_ = null;
                     this.hpData_ = other.hpData_;
                     this.bitField0_ &= -2;
                     this.hpDataBuilder_ = ExpeditionMsg.S2C_HeroHpData_10328.alwaysUseFieldBuilders ? this.getHpDataFieldBuilder() : null;
                  } else {
                     this.hpDataBuilder_.addAllMessages(other.hpData_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getHpDataCount(); ++i) {
               if (!this.getHpData(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_HeroHpData_10328 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroHpData_10328)ExpeditionMsg.S2C_HeroHpData_10328.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroHpData_10328)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureHpDataIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.hpData_ = new ArrayList(this.hpData_);
               this.bitField0_ |= 1;
            }

         }

         public List<HpData> getHpDataList() {
            return this.hpDataBuilder_ == null ? Collections.unmodifiableList(this.hpData_) : this.hpDataBuilder_.getMessageList();
         }

         public int getHpDataCount() {
            return this.hpDataBuilder_ == null ? this.hpData_.size() : this.hpDataBuilder_.getCount();
         }

         public HpData getHpData(int index) {
            return this.hpDataBuilder_ == null ? (HpData)this.hpData_.get(index) : (HpData)this.hpDataBuilder_.getMessage(index);
         }

         public Builder setHpData(int index, HpData value) {
            if (this.hpDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHpDataIsMutable();
               this.hpData_.set(index, value);
               this.onChanged();
            } else {
               this.hpDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setHpData(int index, HpData.Builder builderForValue) {
            if (this.hpDataBuilder_ == null) {
               this.ensureHpDataIsMutable();
               this.hpData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.hpDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHpData(HpData value) {
            if (this.hpDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHpDataIsMutable();
               this.hpData_.add(value);
               this.onChanged();
            } else {
               this.hpDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addHpData(int index, HpData value) {
            if (this.hpDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHpDataIsMutable();
               this.hpData_.add(index, value);
               this.onChanged();
            } else {
               this.hpDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addHpData(HpData.Builder builderForValue) {
            if (this.hpDataBuilder_ == null) {
               this.ensureHpDataIsMutable();
               this.hpData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.hpDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHpData(int index, HpData.Builder builderForValue) {
            if (this.hpDataBuilder_ == null) {
               this.ensureHpDataIsMutable();
               this.hpData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.hpDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHpData(Iterable<? extends HpData> values) {
            if (this.hpDataBuilder_ == null) {
               this.ensureHpDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.hpData_);
               this.onChanged();
            } else {
               this.hpDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearHpData() {
            if (this.hpDataBuilder_ == null) {
               this.hpData_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.hpDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeHpData(int index) {
            if (this.hpDataBuilder_ == null) {
               this.ensureHpDataIsMutable();
               this.hpData_.remove(index);
               this.onChanged();
            } else {
               this.hpDataBuilder_.remove(index);
            }

            return this;
         }

         public HpData.Builder getHpDataBuilder(int index) {
            return (HpData.Builder)this.getHpDataFieldBuilder().getBuilder(index);
         }

         public HpDataOrBuilder getHpDataOrBuilder(int index) {
            return this.hpDataBuilder_ == null ? (HpDataOrBuilder)this.hpData_.get(index) : (HpDataOrBuilder)this.hpDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HpDataOrBuilder> getHpDataOrBuilderList() {
            return this.hpDataBuilder_ != null ? this.hpDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.hpData_);
         }

         public HpData.Builder addHpDataBuilder() {
            return (HpData.Builder)this.getHpDataFieldBuilder().addBuilder(ExpeditionMsg.HpData.getDefaultInstance());
         }

         public HpData.Builder addHpDataBuilder(int index) {
            return (HpData.Builder)this.getHpDataFieldBuilder().addBuilder(index, ExpeditionMsg.HpData.getDefaultInstance());
         }

         public List<HpData.Builder> getHpDataBuilderList() {
            return this.getHpDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HpData, HpData.Builder, HpDataOrBuilder> getHpDataFieldBuilder() {
            if (this.hpDataBuilder_ == null) {
               this.hpDataBuilder_ = new RepeatedFieldBuilderV3(this.hpData_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.hpData_ = null;
            }

            return this.hpDataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_UnlockSeeGrids_10330 extends GeneratedMessageV3 implements S2C_UnlockSeeGrids_10330OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int GRID_FIELD_NUMBER = 1;
      private Internal.IntList grid_;
      private byte memoizedIsInitialized;
      private static final S2C_UnlockSeeGrids_10330 DEFAULT_INSTANCE = new S2C_UnlockSeeGrids_10330();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UnlockSeeGrids_10330> PARSER = new AbstractParser<S2C_UnlockSeeGrids_10330>() {
         public S2C_UnlockSeeGrids_10330 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UnlockSeeGrids_10330(input, extensionRegistry);
         }
      };

      private S2C_UnlockSeeGrids_10330(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UnlockSeeGrids_10330() {
         this.memoizedIsInitialized = -1;
         this.grid_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UnlockSeeGrids_10330();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UnlockSeeGrids_10330(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_UnlockSeeGrids_10330_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_UnlockSeeGrids_10330_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnlockSeeGrids_10330.class, Builder.class);
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
         } else if (!(obj instanceof S2C_UnlockSeeGrids_10330)) {
            return super.equals(obj);
         } else {
            S2C_UnlockSeeGrids_10330 other = (S2C_UnlockSeeGrids_10330)obj;
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

      public static S2C_UnlockSeeGrids_10330 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UnlockSeeGrids_10330)PARSER.parseFrom(data);
      }

      public static S2C_UnlockSeeGrids_10330 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockSeeGrids_10330)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockSeeGrids_10330 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UnlockSeeGrids_10330)PARSER.parseFrom(data);
      }

      public static S2C_UnlockSeeGrids_10330 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockSeeGrids_10330)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockSeeGrids_10330 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UnlockSeeGrids_10330)PARSER.parseFrom(data);
      }

      public static S2C_UnlockSeeGrids_10330 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockSeeGrids_10330)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockSeeGrids_10330 parseFrom(InputStream input) throws IOException {
         return (S2C_UnlockSeeGrids_10330)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnlockSeeGrids_10330 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockSeeGrids_10330)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnlockSeeGrids_10330 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UnlockSeeGrids_10330)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UnlockSeeGrids_10330 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockSeeGrids_10330)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnlockSeeGrids_10330 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UnlockSeeGrids_10330)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnlockSeeGrids_10330 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockSeeGrids_10330)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UnlockSeeGrids_10330 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UnlockSeeGrids_10330 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UnlockSeeGrids_10330> parser() {
         return PARSER;
      }

      public Parser<S2C_UnlockSeeGrids_10330> getParserForType() {
         return PARSER;
      }

      public S2C_UnlockSeeGrids_10330 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UnlockSeeGrids_10330OrBuilder {
         private int bitField0_;
         private Internal.IntList grid_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_UnlockSeeGrids_10330_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_UnlockSeeGrids_10330_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnlockSeeGrids_10330.class, Builder.class);
         }

         private Builder() {
            this.grid_ = ExpeditionMsg.S2C_UnlockSeeGrids_10330.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.grid_ = ExpeditionMsg.S2C_UnlockSeeGrids_10330.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.S2C_UnlockSeeGrids_10330.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = ExpeditionMsg.S2C_UnlockSeeGrids_10330.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_UnlockSeeGrids_10330_descriptor;
         }

         public S2C_UnlockSeeGrids_10330 getDefaultInstanceForType() {
            return ExpeditionMsg.S2C_UnlockSeeGrids_10330.getDefaultInstance();
         }

         public S2C_UnlockSeeGrids_10330 build() {
            S2C_UnlockSeeGrids_10330 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UnlockSeeGrids_10330 buildPartial() {
            S2C_UnlockSeeGrids_10330 result = new S2C_UnlockSeeGrids_10330(this);
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
            if (other instanceof S2C_UnlockSeeGrids_10330) {
               return this.mergeFrom((S2C_UnlockSeeGrids_10330)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UnlockSeeGrids_10330 other) {
            if (other == ExpeditionMsg.S2C_UnlockSeeGrids_10330.getDefaultInstance()) {
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
            S2C_UnlockSeeGrids_10330 parsedMessage = null;

            try {
               parsedMessage = (S2C_UnlockSeeGrids_10330)ExpeditionMsg.S2C_UnlockSeeGrids_10330.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UnlockSeeGrids_10330)e.getUnfinishedMessage();
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
               this.grid_ = ExpeditionMsg.S2C_UnlockSeeGrids_10330.mutableCopy(this.grid_);
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
            this.grid_ = ExpeditionMsg.S2C_UnlockSeeGrids_10330.emptyIntList();
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

   public static final class S2C_UpdateHeroPos_10332 extends GeneratedMessageV3 implements S2C_UpdateHeroPos_10332OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CURGRID_FIELD_NUMBER = 1;
      private int curGrid_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateHeroPos_10332 DEFAULT_INSTANCE = new S2C_UpdateHeroPos_10332();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateHeroPos_10332> PARSER = new AbstractParser<S2C_UpdateHeroPos_10332>() {
         public S2C_UpdateHeroPos_10332 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateHeroPos_10332(input, extensionRegistry);
         }
      };

      private S2C_UpdateHeroPos_10332(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateHeroPos_10332() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateHeroPos_10332();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateHeroPos_10332(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.curGrid_ = input.readInt32();
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_UpdateHeroPos_10332_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_UpdateHeroPos_10332_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateHeroPos_10332.class, Builder.class);
      }

      public boolean hasCurGrid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCurGrid() {
         return this.curGrid_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCurGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.curGrid_);
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
               size += CodedOutputStream.computeInt32Size(1, this.curGrid_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpdateHeroPos_10332)) {
            return super.equals(obj);
         } else {
            S2C_UpdateHeroPos_10332 other = (S2C_UpdateHeroPos_10332)obj;
            if (this.hasCurGrid() != other.hasCurGrid()) {
               return false;
            } else if (this.hasCurGrid() && this.getCurGrid() != other.getCurGrid()) {
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
            if (this.hasCurGrid()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCurGrid();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpdateHeroPos_10332 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateHeroPos_10332)PARSER.parseFrom(data);
      }

      public static S2C_UpdateHeroPos_10332 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateHeroPos_10332)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateHeroPos_10332 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateHeroPos_10332)PARSER.parseFrom(data);
      }

      public static S2C_UpdateHeroPos_10332 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateHeroPos_10332)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateHeroPos_10332 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateHeroPos_10332)PARSER.parseFrom(data);
      }

      public static S2C_UpdateHeroPos_10332 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateHeroPos_10332)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateHeroPos_10332 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateHeroPos_10332)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateHeroPos_10332 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateHeroPos_10332)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateHeroPos_10332 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateHeroPos_10332)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateHeroPos_10332 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateHeroPos_10332)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateHeroPos_10332 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateHeroPos_10332)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateHeroPos_10332 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateHeroPos_10332)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateHeroPos_10332 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateHeroPos_10332 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateHeroPos_10332> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateHeroPos_10332> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateHeroPos_10332 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateHeroPos_10332OrBuilder {
         private int bitField0_;
         private int curGrid_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_UpdateHeroPos_10332_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_UpdateHeroPos_10332_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateHeroPos_10332.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.S2C_UpdateHeroPos_10332.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.curGrid_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_UpdateHeroPos_10332_descriptor;
         }

         public S2C_UpdateHeroPos_10332 getDefaultInstanceForType() {
            return ExpeditionMsg.S2C_UpdateHeroPos_10332.getDefaultInstance();
         }

         public S2C_UpdateHeroPos_10332 build() {
            S2C_UpdateHeroPos_10332 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateHeroPos_10332 buildPartial() {
            S2C_UpdateHeroPos_10332 result = new S2C_UpdateHeroPos_10332(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.curGrid_ = this.curGrid_;
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
            if (other instanceof S2C_UpdateHeroPos_10332) {
               return this.mergeFrom((S2C_UpdateHeroPos_10332)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateHeroPos_10332 other) {
            if (other == ExpeditionMsg.S2C_UpdateHeroPos_10332.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCurGrid()) {
                  this.setCurGrid(other.getCurGrid());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCurGrid();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpdateHeroPos_10332 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateHeroPos_10332)ExpeditionMsg.S2C_UpdateHeroPos_10332.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateHeroPos_10332)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCurGrid() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCurGrid() {
            return this.curGrid_;
         }

         public Builder setCurGrid(int value) {
            this.bitField0_ |= 1;
            this.curGrid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurGrid() {
            this.bitField0_ &= -2;
            this.curGrid_ = 0;
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

   public static final class C2S_BattleRecord_10333 extends GeneratedMessageV3 implements C2S_BattleRecord_10333OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHAPTERID_FIELD_NUMBER = 1;
      private int chapterId_;
      private byte memoizedIsInitialized;
      private static final C2S_BattleRecord_10333 DEFAULT_INSTANCE = new C2S_BattleRecord_10333();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BattleRecord_10333> PARSER = new AbstractParser<C2S_BattleRecord_10333>() {
         public C2S_BattleRecord_10333 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BattleRecord_10333(input, extensionRegistry);
         }
      };

      private C2S_BattleRecord_10333(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BattleRecord_10333() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BattleRecord_10333();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BattleRecord_10333(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_BattleRecord_10333_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_BattleRecord_10333_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleRecord_10333.class, Builder.class);
      }

      public boolean hasChapterId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChapterId() {
         return this.chapterId_;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.chapterId_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_BattleRecord_10333)) {
            return super.equals(obj);
         } else {
            C2S_BattleRecord_10333 other = (C2S_BattleRecord_10333)obj;
            if (this.hasChapterId() != other.hasChapterId()) {
               return false;
            } else if (this.hasChapterId() && this.getChapterId() != other.getChapterId()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_BattleRecord_10333 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BattleRecord_10333)PARSER.parseFrom(data);
      }

      public static C2S_BattleRecord_10333 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleRecord_10333)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleRecord_10333 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BattleRecord_10333)PARSER.parseFrom(data);
      }

      public static C2S_BattleRecord_10333 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleRecord_10333)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleRecord_10333 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BattleRecord_10333)PARSER.parseFrom(data);
      }

      public static C2S_BattleRecord_10333 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleRecord_10333)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleRecord_10333 parseFrom(InputStream input) throws IOException {
         return (C2S_BattleRecord_10333)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleRecord_10333 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleRecord_10333)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleRecord_10333 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BattleRecord_10333)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BattleRecord_10333 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleRecord_10333)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleRecord_10333 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BattleRecord_10333)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleRecord_10333 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleRecord_10333)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BattleRecord_10333 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BattleRecord_10333 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BattleRecord_10333> parser() {
         return PARSER;
      }

      public Parser<C2S_BattleRecord_10333> getParserForType() {
         return PARSER;
      }

      public C2S_BattleRecord_10333 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BattleRecord_10333OrBuilder {
         private int bitField0_;
         private int chapterId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_BattleRecord_10333_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_BattleRecord_10333_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleRecord_10333.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.C2S_BattleRecord_10333.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.chapterId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_BattleRecord_10333_descriptor;
         }

         public C2S_BattleRecord_10333 getDefaultInstanceForType() {
            return ExpeditionMsg.C2S_BattleRecord_10333.getDefaultInstance();
         }

         public C2S_BattleRecord_10333 build() {
            C2S_BattleRecord_10333 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BattleRecord_10333 buildPartial() {
            C2S_BattleRecord_10333 result = new C2S_BattleRecord_10333(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.chapterId_ = this.chapterId_;
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
            if (other instanceof C2S_BattleRecord_10333) {
               return this.mergeFrom((C2S_BattleRecord_10333)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BattleRecord_10333 other) {
            if (other == ExpeditionMsg.C2S_BattleRecord_10333.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChapterId()) {
                  this.setChapterId(other.getChapterId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasChapterId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_BattleRecord_10333 parsedMessage = null;

            try {
               parsedMessage = (C2S_BattleRecord_10333)ExpeditionMsg.C2S_BattleRecord_10333.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BattleRecord_10333)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_BattleRecord_10334 extends GeneratedMessageV3 implements S2C_BattleRecord_10334OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHAPTERID_FIELD_NUMBER = 1;
      private int chapterId_;
      public static final int RECORDS_FIELD_NUMBER = 2;
      private List<RecordInfo> records_;
      private byte memoizedIsInitialized;
      private static final S2C_BattleRecord_10334 DEFAULT_INSTANCE = new S2C_BattleRecord_10334();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BattleRecord_10334> PARSER = new AbstractParser<S2C_BattleRecord_10334>() {
         public S2C_BattleRecord_10334 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BattleRecord_10334(input, extensionRegistry);
         }
      };

      private S2C_BattleRecord_10334(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BattleRecord_10334() {
         this.memoizedIsInitialized = -1;
         this.records_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BattleRecord_10334();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BattleRecord_10334(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.records_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.records_.add(input.readMessage(ExpeditionMsg.RecordInfo.PARSER, extensionRegistry));
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_BattleRecord_10334_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_BattleRecord_10334_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleRecord_10334.class, Builder.class);
      }

      public boolean hasChapterId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChapterId() {
         return this.chapterId_;
      }

      public List<RecordInfo> getRecordsList() {
         return this.records_;
      }

      public List<? extends RecordInfoOrBuilder> getRecordsOrBuilderList() {
         return this.records_;
      }

      public int getRecordsCount() {
         return this.records_.size();
      }

      public RecordInfo getRecords(int index) {
         return (RecordInfo)this.records_.get(index);
      }

      public RecordInfoOrBuilder getRecordsOrBuilder(int index) {
         return (RecordInfoOrBuilder)this.records_.get(index);
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
            output.writeInt32(1, this.chapterId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.chapterId_);
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
         } else if (!(obj instanceof S2C_BattleRecord_10334)) {
            return super.equals(obj);
         } else {
            S2C_BattleRecord_10334 other = (S2C_BattleRecord_10334)obj;
            if (this.hasChapterId() != other.hasChapterId()) {
               return false;
            } else if (this.hasChapterId() && this.getChapterId() != other.getChapterId()) {
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
            if (this.hasChapterId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChapterId();
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

      public static S2C_BattleRecord_10334 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BattleRecord_10334)PARSER.parseFrom(data);
      }

      public static S2C_BattleRecord_10334 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleRecord_10334)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleRecord_10334 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BattleRecord_10334)PARSER.parseFrom(data);
      }

      public static S2C_BattleRecord_10334 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleRecord_10334)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleRecord_10334 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BattleRecord_10334)PARSER.parseFrom(data);
      }

      public static S2C_BattleRecord_10334 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleRecord_10334)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleRecord_10334 parseFrom(InputStream input) throws IOException {
         return (S2C_BattleRecord_10334)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleRecord_10334 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleRecord_10334)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleRecord_10334 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BattleRecord_10334)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BattleRecord_10334 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleRecord_10334)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleRecord_10334 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BattleRecord_10334)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleRecord_10334 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleRecord_10334)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BattleRecord_10334 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BattleRecord_10334 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BattleRecord_10334> parser() {
         return PARSER;
      }

      public Parser<S2C_BattleRecord_10334> getParserForType() {
         return PARSER;
      }

      public S2C_BattleRecord_10334 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BattleRecord_10334OrBuilder {
         private int bitField0_;
         private int chapterId_;
         private List<RecordInfo> records_;
         private RepeatedFieldBuilderV3<RecordInfo, RecordInfo.Builder, RecordInfoOrBuilder> recordsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_BattleRecord_10334_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_BattleRecord_10334_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleRecord_10334.class, Builder.class);
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
            if (ExpeditionMsg.S2C_BattleRecord_10334.alwaysUseFieldBuilders) {
               this.getRecordsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.chapterId_ = 0;
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
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_BattleRecord_10334_descriptor;
         }

         public S2C_BattleRecord_10334 getDefaultInstanceForType() {
            return ExpeditionMsg.S2C_BattleRecord_10334.getDefaultInstance();
         }

         public S2C_BattleRecord_10334 build() {
            S2C_BattleRecord_10334 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BattleRecord_10334 buildPartial() {
            S2C_BattleRecord_10334 result = new S2C_BattleRecord_10334(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.chapterId_ = this.chapterId_;
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
            if (other instanceof S2C_BattleRecord_10334) {
               return this.mergeFrom((S2C_BattleRecord_10334)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BattleRecord_10334 other) {
            if (other == ExpeditionMsg.S2C_BattleRecord_10334.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChapterId()) {
                  this.setChapterId(other.getChapterId());
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
                     this.recordsBuilder_ = ExpeditionMsg.S2C_BattleRecord_10334.alwaysUseFieldBuilders ? this.getRecordsFieldBuilder() : null;
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
            if (!this.hasChapterId()) {
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
            S2C_BattleRecord_10334 parsedMessage = null;

            try {
               parsedMessage = (S2C_BattleRecord_10334)ExpeditionMsg.S2C_BattleRecord_10334.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BattleRecord_10334)e.getUnfinishedMessage();
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

         private void ensureRecordsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.records_ = new ArrayList(this.records_);
               this.bitField0_ |= 2;
            }

         }

         public List<RecordInfo> getRecordsList() {
            return this.recordsBuilder_ == null ? Collections.unmodifiableList(this.records_) : this.recordsBuilder_.getMessageList();
         }

         public int getRecordsCount() {
            return this.recordsBuilder_ == null ? this.records_.size() : this.recordsBuilder_.getCount();
         }

         public RecordInfo getRecords(int index) {
            return this.recordsBuilder_ == null ? (RecordInfo)this.records_.get(index) : (RecordInfo)this.recordsBuilder_.getMessage(index);
         }

         public Builder setRecords(int index, RecordInfo value) {
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

         public Builder setRecords(int index, RecordInfo.Builder builderForValue) {
            if (this.recordsBuilder_ == null) {
               this.ensureRecordsIsMutable();
               this.records_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRecords(RecordInfo value) {
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

         public Builder addRecords(int index, RecordInfo value) {
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

         public Builder addRecords(RecordInfo.Builder builderForValue) {
            if (this.recordsBuilder_ == null) {
               this.ensureRecordsIsMutable();
               this.records_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.recordsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRecords(int index, RecordInfo.Builder builderForValue) {
            if (this.recordsBuilder_ == null) {
               this.ensureRecordsIsMutable();
               this.records_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecords(Iterable<? extends RecordInfo> values) {
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

         public RecordInfo.Builder getRecordsBuilder(int index) {
            return (RecordInfo.Builder)this.getRecordsFieldBuilder().getBuilder(index);
         }

         public RecordInfoOrBuilder getRecordsOrBuilder(int index) {
            return this.recordsBuilder_ == null ? (RecordInfoOrBuilder)this.records_.get(index) : (RecordInfoOrBuilder)this.recordsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RecordInfoOrBuilder> getRecordsOrBuilderList() {
            return this.recordsBuilder_ != null ? this.recordsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.records_);
         }

         public RecordInfo.Builder addRecordsBuilder() {
            return (RecordInfo.Builder)this.getRecordsFieldBuilder().addBuilder(ExpeditionMsg.RecordInfo.getDefaultInstance());
         }

         public RecordInfo.Builder addRecordsBuilder(int index) {
            return (RecordInfo.Builder)this.getRecordsFieldBuilder().addBuilder(index, ExpeditionMsg.RecordInfo.getDefaultInstance());
         }

         public List<RecordInfo.Builder> getRecordsBuilderList() {
            return this.getRecordsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RecordInfo, RecordInfo.Builder, RecordInfoOrBuilder> getRecordsFieldBuilder() {
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

   public static final class C2S_DispatchHero_10337 extends GeneratedMessageV3 implements C2S_DispatchHero_10337OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_DispatchHero_10337 DEFAULT_INSTANCE = new C2S_DispatchHero_10337();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DispatchHero_10337> PARSER = new AbstractParser<C2S_DispatchHero_10337>() {
         public C2S_DispatchHero_10337 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DispatchHero_10337(input, extensionRegistry);
         }
      };

      private C2S_DispatchHero_10337(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DispatchHero_10337() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DispatchHero_10337();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DispatchHero_10337(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_DispatchHero_10337_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_DispatchHero_10337_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DispatchHero_10337.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DispatchHero_10337)) {
            return super.equals(obj);
         } else {
            C2S_DispatchHero_10337 other = (C2S_DispatchHero_10337)obj;
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

      public static C2S_DispatchHero_10337 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DispatchHero_10337)PARSER.parseFrom(data);
      }

      public static C2S_DispatchHero_10337 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DispatchHero_10337)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DispatchHero_10337 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DispatchHero_10337)PARSER.parseFrom(data);
      }

      public static C2S_DispatchHero_10337 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DispatchHero_10337)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DispatchHero_10337 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DispatchHero_10337)PARSER.parseFrom(data);
      }

      public static C2S_DispatchHero_10337 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DispatchHero_10337)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DispatchHero_10337 parseFrom(InputStream input) throws IOException {
         return (C2S_DispatchHero_10337)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DispatchHero_10337 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DispatchHero_10337)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DispatchHero_10337 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DispatchHero_10337)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DispatchHero_10337 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DispatchHero_10337)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DispatchHero_10337 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DispatchHero_10337)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DispatchHero_10337 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DispatchHero_10337)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DispatchHero_10337 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DispatchHero_10337 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DispatchHero_10337> parser() {
         return PARSER;
      }

      public Parser<C2S_DispatchHero_10337> getParserForType() {
         return PARSER;
      }

      public C2S_DispatchHero_10337 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DispatchHero_10337OrBuilder {
         private int bitField0_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_DispatchHero_10337_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_DispatchHero_10337_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DispatchHero_10337.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.C2S_DispatchHero_10337.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_DispatchHero_10337_descriptor;
         }

         public C2S_DispatchHero_10337 getDefaultInstanceForType() {
            return ExpeditionMsg.C2S_DispatchHero_10337.getDefaultInstance();
         }

         public C2S_DispatchHero_10337 build() {
            C2S_DispatchHero_10337 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DispatchHero_10337 buildPartial() {
            C2S_DispatchHero_10337 result = new C2S_DispatchHero_10337(this);
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
            if (other instanceof C2S_DispatchHero_10337) {
               return this.mergeFrom((C2S_DispatchHero_10337)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DispatchHero_10337 other) {
            if (other == ExpeditionMsg.C2S_DispatchHero_10337.getDefaultInstance()) {
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
            C2S_DispatchHero_10337 parsedMessage = null;

            try {
               parsedMessage = (C2S_DispatchHero_10337)ExpeditionMsg.C2S_DispatchHero_10337.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DispatchHero_10337)e.getUnfinishedMessage();
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

   public static final class S2C_DispatchHero_10338 extends GeneratedMessageV3 implements S2C_DispatchHero_10338OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final S2C_DispatchHero_10338 DEFAULT_INSTANCE = new S2C_DispatchHero_10338();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DispatchHero_10338> PARSER = new AbstractParser<S2C_DispatchHero_10338>() {
         public S2C_DispatchHero_10338 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DispatchHero_10338(input, extensionRegistry);
         }
      };

      private S2C_DispatchHero_10338(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DispatchHero_10338() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DispatchHero_10338();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DispatchHero_10338(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_DispatchHero_10338_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_DispatchHero_10338_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DispatchHero_10338.class, Builder.class);
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
         } else if (!(obj instanceof S2C_DispatchHero_10338)) {
            return super.equals(obj);
         } else {
            S2C_DispatchHero_10338 other = (S2C_DispatchHero_10338)obj;
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

      public static S2C_DispatchHero_10338 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DispatchHero_10338)PARSER.parseFrom(data);
      }

      public static S2C_DispatchHero_10338 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DispatchHero_10338)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DispatchHero_10338 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DispatchHero_10338)PARSER.parseFrom(data);
      }

      public static S2C_DispatchHero_10338 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DispatchHero_10338)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DispatchHero_10338 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DispatchHero_10338)PARSER.parseFrom(data);
      }

      public static S2C_DispatchHero_10338 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DispatchHero_10338)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DispatchHero_10338 parseFrom(InputStream input) throws IOException {
         return (S2C_DispatchHero_10338)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DispatchHero_10338 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DispatchHero_10338)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DispatchHero_10338 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DispatchHero_10338)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DispatchHero_10338 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DispatchHero_10338)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DispatchHero_10338 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DispatchHero_10338)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DispatchHero_10338 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DispatchHero_10338)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DispatchHero_10338 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DispatchHero_10338 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DispatchHero_10338> parser() {
         return PARSER;
      }

      public Parser<S2C_DispatchHero_10338> getParserForType() {
         return PARSER;
      }

      public S2C_DispatchHero_10338 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DispatchHero_10338OrBuilder {
         private int bitField0_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_DispatchHero_10338_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_DispatchHero_10338_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DispatchHero_10338.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.S2C_DispatchHero_10338.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_DispatchHero_10338_descriptor;
         }

         public S2C_DispatchHero_10338 getDefaultInstanceForType() {
            return ExpeditionMsg.S2C_DispatchHero_10338.getDefaultInstance();
         }

         public S2C_DispatchHero_10338 build() {
            S2C_DispatchHero_10338 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DispatchHero_10338 buildPartial() {
            S2C_DispatchHero_10338 result = new S2C_DispatchHero_10338(this);
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
            if (other instanceof S2C_DispatchHero_10338) {
               return this.mergeFrom((S2C_DispatchHero_10338)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DispatchHero_10338 other) {
            if (other == ExpeditionMsg.S2C_DispatchHero_10338.getDefaultInstance()) {
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
            S2C_DispatchHero_10338 parsedMessage = null;

            try {
               parsedMessage = (S2C_DispatchHero_10338)ExpeditionMsg.S2C_DispatchHero_10338.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DispatchHero_10338)e.getUnfinishedMessage();
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

   public static final class C2S_EmployHero_10339 extends GeneratedMessageV3 implements C2S_EmployHero_10339OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int DISPATCHCODE_FIELD_NUMBER = 2;
      private int dispatchCode_;
      private byte memoizedIsInitialized;
      private static final C2S_EmployHero_10339 DEFAULT_INSTANCE = new C2S_EmployHero_10339();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_EmployHero_10339> PARSER = new AbstractParser<C2S_EmployHero_10339>() {
         public C2S_EmployHero_10339 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_EmployHero_10339(input, extensionRegistry);
         }
      };

      private C2S_EmployHero_10339(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_EmployHero_10339() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_EmployHero_10339();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_EmployHero_10339(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.dispatchCode_ = input.readInt32();
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_EmployHero_10339_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_EmployHero_10339_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EmployHero_10339.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasDispatchCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDispatchCode() {
         return this.dispatchCode_;
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
         } else if (!this.hasDispatchCode()) {
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
            output.writeInt32(2, this.dispatchCode_);
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
               size += CodedOutputStream.computeInt32Size(2, this.dispatchCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_EmployHero_10339)) {
            return super.equals(obj);
         } else {
            C2S_EmployHero_10339 other = (C2S_EmployHero_10339)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasDispatchCode() != other.hasDispatchCode()) {
               return false;
            } else if (this.hasDispatchCode() && this.getDispatchCode() != other.getDispatchCode()) {
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

            if (this.hasDispatchCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDispatchCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_EmployHero_10339 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_EmployHero_10339)PARSER.parseFrom(data);
      }

      public static C2S_EmployHero_10339 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EmployHero_10339)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EmployHero_10339 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_EmployHero_10339)PARSER.parseFrom(data);
      }

      public static C2S_EmployHero_10339 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EmployHero_10339)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EmployHero_10339 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_EmployHero_10339)PARSER.parseFrom(data);
      }

      public static C2S_EmployHero_10339 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EmployHero_10339)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EmployHero_10339 parseFrom(InputStream input) throws IOException {
         return (C2S_EmployHero_10339)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EmployHero_10339 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EmployHero_10339)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EmployHero_10339 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_EmployHero_10339)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_EmployHero_10339 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EmployHero_10339)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EmployHero_10339 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_EmployHero_10339)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EmployHero_10339 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EmployHero_10339)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_EmployHero_10339 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_EmployHero_10339 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_EmployHero_10339> parser() {
         return PARSER;
      }

      public Parser<C2S_EmployHero_10339> getParserForType() {
         return PARSER;
      }

      public C2S_EmployHero_10339 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_EmployHero_10339OrBuilder {
         private int bitField0_;
         private int playerId_;
         private int dispatchCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_EmployHero_10339_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_EmployHero_10339_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EmployHero_10339.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.C2S_EmployHero_10339.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.dispatchCode_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_EmployHero_10339_descriptor;
         }

         public C2S_EmployHero_10339 getDefaultInstanceForType() {
            return ExpeditionMsg.C2S_EmployHero_10339.getDefaultInstance();
         }

         public C2S_EmployHero_10339 build() {
            C2S_EmployHero_10339 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_EmployHero_10339 buildPartial() {
            C2S_EmployHero_10339 result = new C2S_EmployHero_10339(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.dispatchCode_ = this.dispatchCode_;
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
            if (other instanceof C2S_EmployHero_10339) {
               return this.mergeFrom((C2S_EmployHero_10339)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_EmployHero_10339 other) {
            if (other == ExpeditionMsg.C2S_EmployHero_10339.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasDispatchCode()) {
                  this.setDispatchCode(other.getDispatchCode());
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
               return this.hasDispatchCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_EmployHero_10339 parsedMessage = null;

            try {
               parsedMessage = (C2S_EmployHero_10339)ExpeditionMsg.C2S_EmployHero_10339.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_EmployHero_10339)e.getUnfinishedMessage();
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

         public boolean hasDispatchCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDispatchCode() {
            return this.dispatchCode_;
         }

         public Builder setDispatchCode(int value) {
            this.bitField0_ |= 2;
            this.dispatchCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDispatchCode() {
            this.bitField0_ &= -3;
            this.dispatchCode_ = 0;
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

   public static final class S2C_EmployHero_10340 extends GeneratedMessageV3 implements S2C_EmployHero_10340OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int DISPATCHCODE_FIELD_NUMBER = 2;
      private int dispatchCode_;
      private byte memoizedIsInitialized;
      private static final S2C_EmployHero_10340 DEFAULT_INSTANCE = new S2C_EmployHero_10340();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_EmployHero_10340> PARSER = new AbstractParser<S2C_EmployHero_10340>() {
         public S2C_EmployHero_10340 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_EmployHero_10340(input, extensionRegistry);
         }
      };

      private S2C_EmployHero_10340(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_EmployHero_10340() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_EmployHero_10340();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_EmployHero_10340(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.dispatchCode_ = input.readInt32();
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_EmployHero_10340_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_EmployHero_10340_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EmployHero_10340.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasDispatchCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDispatchCode() {
         return this.dispatchCode_;
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
         } else if (!this.hasDispatchCode()) {
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
            output.writeInt32(2, this.dispatchCode_);
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
               size += CodedOutputStream.computeInt32Size(2, this.dispatchCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_EmployHero_10340)) {
            return super.equals(obj);
         } else {
            S2C_EmployHero_10340 other = (S2C_EmployHero_10340)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasDispatchCode() != other.hasDispatchCode()) {
               return false;
            } else if (this.hasDispatchCode() && this.getDispatchCode() != other.getDispatchCode()) {
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

            if (this.hasDispatchCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDispatchCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_EmployHero_10340 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_EmployHero_10340)PARSER.parseFrom(data);
      }

      public static S2C_EmployHero_10340 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EmployHero_10340)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EmployHero_10340 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_EmployHero_10340)PARSER.parseFrom(data);
      }

      public static S2C_EmployHero_10340 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EmployHero_10340)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EmployHero_10340 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_EmployHero_10340)PARSER.parseFrom(data);
      }

      public static S2C_EmployHero_10340 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EmployHero_10340)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EmployHero_10340 parseFrom(InputStream input) throws IOException {
         return (S2C_EmployHero_10340)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EmployHero_10340 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EmployHero_10340)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EmployHero_10340 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_EmployHero_10340)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_EmployHero_10340 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EmployHero_10340)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EmployHero_10340 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_EmployHero_10340)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EmployHero_10340 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EmployHero_10340)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_EmployHero_10340 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_EmployHero_10340 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_EmployHero_10340> parser() {
         return PARSER;
      }

      public Parser<S2C_EmployHero_10340> getParserForType() {
         return PARSER;
      }

      public S2C_EmployHero_10340 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_EmployHero_10340OrBuilder {
         private int bitField0_;
         private int playerId_;
         private int dispatchCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_EmployHero_10340_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_EmployHero_10340_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EmployHero_10340.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.S2C_EmployHero_10340.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.dispatchCode_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_EmployHero_10340_descriptor;
         }

         public S2C_EmployHero_10340 getDefaultInstanceForType() {
            return ExpeditionMsg.S2C_EmployHero_10340.getDefaultInstance();
         }

         public S2C_EmployHero_10340 build() {
            S2C_EmployHero_10340 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_EmployHero_10340 buildPartial() {
            S2C_EmployHero_10340 result = new S2C_EmployHero_10340(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.dispatchCode_ = this.dispatchCode_;
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
            if (other instanceof S2C_EmployHero_10340) {
               return this.mergeFrom((S2C_EmployHero_10340)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_EmployHero_10340 other) {
            if (other == ExpeditionMsg.S2C_EmployHero_10340.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasDispatchCode()) {
                  this.setDispatchCode(other.getDispatchCode());
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
               return this.hasDispatchCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_EmployHero_10340 parsedMessage = null;

            try {
               parsedMessage = (S2C_EmployHero_10340)ExpeditionMsg.S2C_EmployHero_10340.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_EmployHero_10340)e.getUnfinishedMessage();
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

         public boolean hasDispatchCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDispatchCode() {
            return this.dispatchCode_;
         }

         public Builder setDispatchCode(int value) {
            this.bitField0_ |= 2;
            this.dispatchCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDispatchCode() {
            this.bitField0_ &= -3;
            this.dispatchCode_ = 0;
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

   public static final class C2S_DispatchList_10341 extends GeneratedMessageV3 implements C2S_DispatchList_10341OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DispatchList_10341 DEFAULT_INSTANCE = new C2S_DispatchList_10341();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DispatchList_10341> PARSER = new AbstractParser<C2S_DispatchList_10341>() {
         public C2S_DispatchList_10341 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DispatchList_10341(input, extensionRegistry);
         }
      };

      private C2S_DispatchList_10341(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DispatchList_10341() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DispatchList_10341();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DispatchList_10341(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_DispatchList_10341_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_DispatchList_10341_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DispatchList_10341.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DispatchList_10341)) {
            return super.equals(obj);
         } else {
            C2S_DispatchList_10341 other = (C2S_DispatchList_10341)obj;
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

      public static C2S_DispatchList_10341 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DispatchList_10341)PARSER.parseFrom(data);
      }

      public static C2S_DispatchList_10341 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DispatchList_10341)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DispatchList_10341 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DispatchList_10341)PARSER.parseFrom(data);
      }

      public static C2S_DispatchList_10341 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DispatchList_10341)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DispatchList_10341 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DispatchList_10341)PARSER.parseFrom(data);
      }

      public static C2S_DispatchList_10341 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DispatchList_10341)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DispatchList_10341 parseFrom(InputStream input) throws IOException {
         return (C2S_DispatchList_10341)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DispatchList_10341 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DispatchList_10341)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DispatchList_10341 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DispatchList_10341)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DispatchList_10341 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DispatchList_10341)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DispatchList_10341 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DispatchList_10341)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DispatchList_10341 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DispatchList_10341)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DispatchList_10341 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DispatchList_10341 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DispatchList_10341> parser() {
         return PARSER;
      }

      public Parser<C2S_DispatchList_10341> getParserForType() {
         return PARSER;
      }

      public C2S_DispatchList_10341 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DispatchList_10341OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_DispatchList_10341_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_DispatchList_10341_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DispatchList_10341.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.C2S_DispatchList_10341.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_C2S_DispatchList_10341_descriptor;
         }

         public C2S_DispatchList_10341 getDefaultInstanceForType() {
            return ExpeditionMsg.C2S_DispatchList_10341.getDefaultInstance();
         }

         public C2S_DispatchList_10341 build() {
            C2S_DispatchList_10341 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DispatchList_10341 buildPartial() {
            C2S_DispatchList_10341 result = new C2S_DispatchList_10341(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_DispatchList_10341) {
               return this.mergeFrom((C2S_DispatchList_10341)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DispatchList_10341 other) {
            if (other == ExpeditionMsg.C2S_DispatchList_10341.getDefaultInstance()) {
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
            C2S_DispatchList_10341 parsedMessage = null;

            try {
               parsedMessage = (C2S_DispatchList_10341)ExpeditionMsg.C2S_DispatchList_10341.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DispatchList_10341)e.getUnfinishedMessage();
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

   public static final class S2C_DispatchList_10342 extends GeneratedMessageV3 implements S2C_DispatchList_10342OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MERCENARYINFO_FIELD_NUMBER = 1;
      private List<MercenaryInfo> mercenaryInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_DispatchList_10342 DEFAULT_INSTANCE = new S2C_DispatchList_10342();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DispatchList_10342> PARSER = new AbstractParser<S2C_DispatchList_10342>() {
         public S2C_DispatchList_10342 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DispatchList_10342(input, extensionRegistry);
         }
      };

      private S2C_DispatchList_10342(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DispatchList_10342() {
         this.memoizedIsInitialized = -1;
         this.mercenaryInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DispatchList_10342();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DispatchList_10342(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.mercenaryInfo_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.mercenaryInfo_.add(input.readMessage(ExpeditionMsg.MercenaryInfo.PARSER, extensionRegistry));
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
                  this.mercenaryInfo_ = Collections.unmodifiableList(this.mercenaryInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_DispatchList_10342_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_DispatchList_10342_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DispatchList_10342.class, Builder.class);
      }

      public List<MercenaryInfo> getMercenaryInfoList() {
         return this.mercenaryInfo_;
      }

      public List<? extends MercenaryInfoOrBuilder> getMercenaryInfoOrBuilderList() {
         return this.mercenaryInfo_;
      }

      public int getMercenaryInfoCount() {
         return this.mercenaryInfo_.size();
      }

      public MercenaryInfo getMercenaryInfo(int index) {
         return (MercenaryInfo)this.mercenaryInfo_.get(index);
      }

      public MercenaryInfoOrBuilder getMercenaryInfoOrBuilder(int index) {
         return (MercenaryInfoOrBuilder)this.mercenaryInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getMercenaryInfoCount(); ++i) {
               if (!this.getMercenaryInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.mercenaryInfo_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.mercenaryInfo_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.mercenaryInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.mercenaryInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DispatchList_10342)) {
            return super.equals(obj);
         } else {
            S2C_DispatchList_10342 other = (S2C_DispatchList_10342)obj;
            if (!this.getMercenaryInfoList().equals(other.getMercenaryInfoList())) {
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
            if (this.getMercenaryInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMercenaryInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DispatchList_10342 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DispatchList_10342)PARSER.parseFrom(data);
      }

      public static S2C_DispatchList_10342 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DispatchList_10342)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DispatchList_10342 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DispatchList_10342)PARSER.parseFrom(data);
      }

      public static S2C_DispatchList_10342 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DispatchList_10342)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DispatchList_10342 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DispatchList_10342)PARSER.parseFrom(data);
      }

      public static S2C_DispatchList_10342 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DispatchList_10342)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DispatchList_10342 parseFrom(InputStream input) throws IOException {
         return (S2C_DispatchList_10342)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DispatchList_10342 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DispatchList_10342)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DispatchList_10342 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DispatchList_10342)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DispatchList_10342 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DispatchList_10342)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DispatchList_10342 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DispatchList_10342)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DispatchList_10342 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DispatchList_10342)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DispatchList_10342 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DispatchList_10342 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DispatchList_10342> parser() {
         return PARSER;
      }

      public Parser<S2C_DispatchList_10342> getParserForType() {
         return PARSER;
      }

      public S2C_DispatchList_10342 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DispatchList_10342OrBuilder {
         private int bitField0_;
         private List<MercenaryInfo> mercenaryInfo_;
         private RepeatedFieldBuilderV3<MercenaryInfo, MercenaryInfo.Builder, MercenaryInfoOrBuilder> mercenaryInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_DispatchList_10342_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_DispatchList_10342_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DispatchList_10342.class, Builder.class);
         }

         private Builder() {
            this.mercenaryInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.mercenaryInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.S2C_DispatchList_10342.alwaysUseFieldBuilders) {
               this.getMercenaryInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.mercenaryInfoBuilder_ == null) {
               this.mercenaryInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.mercenaryInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_DispatchList_10342_descriptor;
         }

         public S2C_DispatchList_10342 getDefaultInstanceForType() {
            return ExpeditionMsg.S2C_DispatchList_10342.getDefaultInstance();
         }

         public S2C_DispatchList_10342 build() {
            S2C_DispatchList_10342 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DispatchList_10342 buildPartial() {
            S2C_DispatchList_10342 result = new S2C_DispatchList_10342(this);
            int from_bitField0_ = this.bitField0_;
            if (this.mercenaryInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.mercenaryInfo_ = Collections.unmodifiableList(this.mercenaryInfo_);
                  this.bitField0_ &= -2;
               }

               result.mercenaryInfo_ = this.mercenaryInfo_;
            } else {
               result.mercenaryInfo_ = this.mercenaryInfoBuilder_.build();
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
            if (other instanceof S2C_DispatchList_10342) {
               return this.mergeFrom((S2C_DispatchList_10342)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DispatchList_10342 other) {
            if (other == ExpeditionMsg.S2C_DispatchList_10342.getDefaultInstance()) {
               return this;
            } else {
               if (this.mercenaryInfoBuilder_ == null) {
                  if (!other.mercenaryInfo_.isEmpty()) {
                     if (this.mercenaryInfo_.isEmpty()) {
                        this.mercenaryInfo_ = other.mercenaryInfo_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureMercenaryInfoIsMutable();
                        this.mercenaryInfo_.addAll(other.mercenaryInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.mercenaryInfo_.isEmpty()) {
                  if (this.mercenaryInfoBuilder_.isEmpty()) {
                     this.mercenaryInfoBuilder_.dispose();
                     this.mercenaryInfoBuilder_ = null;
                     this.mercenaryInfo_ = other.mercenaryInfo_;
                     this.bitField0_ &= -2;
                     this.mercenaryInfoBuilder_ = ExpeditionMsg.S2C_DispatchList_10342.alwaysUseFieldBuilders ? this.getMercenaryInfoFieldBuilder() : null;
                  } else {
                     this.mercenaryInfoBuilder_.addAllMessages(other.mercenaryInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getMercenaryInfoCount(); ++i) {
               if (!this.getMercenaryInfo(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DispatchList_10342 parsedMessage = null;

            try {
               parsedMessage = (S2C_DispatchList_10342)ExpeditionMsg.S2C_DispatchList_10342.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DispatchList_10342)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureMercenaryInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.mercenaryInfo_ = new ArrayList(this.mercenaryInfo_);
               this.bitField0_ |= 1;
            }

         }

         public List<MercenaryInfo> getMercenaryInfoList() {
            return this.mercenaryInfoBuilder_ == null ? Collections.unmodifiableList(this.mercenaryInfo_) : this.mercenaryInfoBuilder_.getMessageList();
         }

         public int getMercenaryInfoCount() {
            return this.mercenaryInfoBuilder_ == null ? this.mercenaryInfo_.size() : this.mercenaryInfoBuilder_.getCount();
         }

         public MercenaryInfo getMercenaryInfo(int index) {
            return this.mercenaryInfoBuilder_ == null ? (MercenaryInfo)this.mercenaryInfo_.get(index) : (MercenaryInfo)this.mercenaryInfoBuilder_.getMessage(index);
         }

         public Builder setMercenaryInfo(int index, MercenaryInfo value) {
            if (this.mercenaryInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMercenaryInfoIsMutable();
               this.mercenaryInfo_.set(index, value);
               this.onChanged();
            } else {
               this.mercenaryInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setMercenaryInfo(int index, MercenaryInfo.Builder builderForValue) {
            if (this.mercenaryInfoBuilder_ == null) {
               this.ensureMercenaryInfoIsMutable();
               this.mercenaryInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.mercenaryInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMercenaryInfo(MercenaryInfo value) {
            if (this.mercenaryInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMercenaryInfoIsMutable();
               this.mercenaryInfo_.add(value);
               this.onChanged();
            } else {
               this.mercenaryInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addMercenaryInfo(int index, MercenaryInfo value) {
            if (this.mercenaryInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMercenaryInfoIsMutable();
               this.mercenaryInfo_.add(index, value);
               this.onChanged();
            } else {
               this.mercenaryInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addMercenaryInfo(MercenaryInfo.Builder builderForValue) {
            if (this.mercenaryInfoBuilder_ == null) {
               this.ensureMercenaryInfoIsMutable();
               this.mercenaryInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.mercenaryInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMercenaryInfo(int index, MercenaryInfo.Builder builderForValue) {
            if (this.mercenaryInfoBuilder_ == null) {
               this.ensureMercenaryInfoIsMutable();
               this.mercenaryInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.mercenaryInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMercenaryInfo(Iterable<? extends MercenaryInfo> values) {
            if (this.mercenaryInfoBuilder_ == null) {
               this.ensureMercenaryInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.mercenaryInfo_);
               this.onChanged();
            } else {
               this.mercenaryInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearMercenaryInfo() {
            if (this.mercenaryInfoBuilder_ == null) {
               this.mercenaryInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.mercenaryInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeMercenaryInfo(int index) {
            if (this.mercenaryInfoBuilder_ == null) {
               this.ensureMercenaryInfoIsMutable();
               this.mercenaryInfo_.remove(index);
               this.onChanged();
            } else {
               this.mercenaryInfoBuilder_.remove(index);
            }

            return this;
         }

         public MercenaryInfo.Builder getMercenaryInfoBuilder(int index) {
            return (MercenaryInfo.Builder)this.getMercenaryInfoFieldBuilder().getBuilder(index);
         }

         public MercenaryInfoOrBuilder getMercenaryInfoOrBuilder(int index) {
            return this.mercenaryInfoBuilder_ == null ? (MercenaryInfoOrBuilder)this.mercenaryInfo_.get(index) : (MercenaryInfoOrBuilder)this.mercenaryInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MercenaryInfoOrBuilder> getMercenaryInfoOrBuilderList() {
            return this.mercenaryInfoBuilder_ != null ? this.mercenaryInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.mercenaryInfo_);
         }

         public MercenaryInfo.Builder addMercenaryInfoBuilder() {
            return (MercenaryInfo.Builder)this.getMercenaryInfoFieldBuilder().addBuilder(ExpeditionMsg.MercenaryInfo.getDefaultInstance());
         }

         public MercenaryInfo.Builder addMercenaryInfoBuilder(int index) {
            return (MercenaryInfo.Builder)this.getMercenaryInfoFieldBuilder().addBuilder(index, ExpeditionMsg.MercenaryInfo.getDefaultInstance());
         }

         public List<MercenaryInfo.Builder> getMercenaryInfoBuilderList() {
            return this.getMercenaryInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MercenaryInfo, MercenaryInfo.Builder, MercenaryInfoOrBuilder> getMercenaryInfoFieldBuilder() {
            if (this.mercenaryInfoBuilder_ == null) {
               this.mercenaryInfoBuilder_ = new RepeatedFieldBuilderV3(this.mercenaryInfo_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.mercenaryInfo_ = null;
            }

            return this.mercenaryInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_ChangeHeroIdle_10344 extends GeneratedMessageV3 implements S2C_ChangeHeroIdle_10344OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROID_FIELD_NUMBER = 1;
      private int heroId_;
      private byte memoizedIsInitialized;
      private static final S2C_ChangeHeroIdle_10344 DEFAULT_INSTANCE = new S2C_ChangeHeroIdle_10344();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ChangeHeroIdle_10344> PARSER = new AbstractParser<S2C_ChangeHeroIdle_10344>() {
         public S2C_ChangeHeroIdle_10344 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ChangeHeroIdle_10344(input, extensionRegistry);
         }
      };

      private S2C_ChangeHeroIdle_10344(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ChangeHeroIdle_10344() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ChangeHeroIdle_10344();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ChangeHeroIdle_10344(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroId_ = input.readInt32();
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_ChangeHeroIdle_10344_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_ChangeHeroIdle_10344_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChangeHeroIdle_10344.class, Builder.class);
      }

      public boolean hasHeroId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroId() {
         return this.heroId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ChangeHeroIdle_10344)) {
            return super.equals(obj);
         } else {
            S2C_ChangeHeroIdle_10344 other = (S2C_ChangeHeroIdle_10344)obj;
            if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
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
            if (this.hasHeroId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ChangeHeroIdle_10344 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ChangeHeroIdle_10344)PARSER.parseFrom(data);
      }

      public static S2C_ChangeHeroIdle_10344 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChangeHeroIdle_10344)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChangeHeroIdle_10344 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ChangeHeroIdle_10344)PARSER.parseFrom(data);
      }

      public static S2C_ChangeHeroIdle_10344 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChangeHeroIdle_10344)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChangeHeroIdle_10344 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ChangeHeroIdle_10344)PARSER.parseFrom(data);
      }

      public static S2C_ChangeHeroIdle_10344 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChangeHeroIdle_10344)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChangeHeroIdle_10344 parseFrom(InputStream input) throws IOException {
         return (S2C_ChangeHeroIdle_10344)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChangeHeroIdle_10344 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChangeHeroIdle_10344)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChangeHeroIdle_10344 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ChangeHeroIdle_10344)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ChangeHeroIdle_10344 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChangeHeroIdle_10344)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChangeHeroIdle_10344 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ChangeHeroIdle_10344)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChangeHeroIdle_10344 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChangeHeroIdle_10344)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ChangeHeroIdle_10344 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ChangeHeroIdle_10344 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ChangeHeroIdle_10344> parser() {
         return PARSER;
      }

      public Parser<S2C_ChangeHeroIdle_10344> getParserForType() {
         return PARSER;
      }

      public S2C_ChangeHeroIdle_10344 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ChangeHeroIdle_10344OrBuilder {
         private int bitField0_;
         private int heroId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_ChangeHeroIdle_10344_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_ChangeHeroIdle_10344_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChangeHeroIdle_10344.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.S2C_ChangeHeroIdle_10344.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_ChangeHeroIdle_10344_descriptor;
         }

         public S2C_ChangeHeroIdle_10344 getDefaultInstanceForType() {
            return ExpeditionMsg.S2C_ChangeHeroIdle_10344.getDefaultInstance();
         }

         public S2C_ChangeHeroIdle_10344 build() {
            S2C_ChangeHeroIdle_10344 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ChangeHeroIdle_10344 buildPartial() {
            S2C_ChangeHeroIdle_10344 result = new S2C_ChangeHeroIdle_10344(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroId_ = this.heroId_;
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
            if (other instanceof S2C_ChangeHeroIdle_10344) {
               return this.mergeFrom((S2C_ChangeHeroIdle_10344)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ChangeHeroIdle_10344 other) {
            if (other == ExpeditionMsg.S2C_ChangeHeroIdle_10344.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasHeroId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ChangeHeroIdle_10344 parsedMessage = null;

            try {
               parsedMessage = (S2C_ChangeHeroIdle_10344)ExpeditionMsg.S2C_ChangeHeroIdle_10344.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ChangeHeroIdle_10344)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroId() {
            return this.heroId_;
         }

         public Builder setHeroId(int value) {
            this.bitField0_ |= 1;
            this.heroId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroId() {
            this.bitField0_ &= -2;
            this.heroId_ = 0;
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

   public static final class S2C_TempProps_10346 extends GeneratedMessageV3 implements S2C_TempProps_10346OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TEMPPROPS_FIELD_NUMBER = 1;
      private List<CommonMsg.ItemInfo> tempProps_;
      private byte memoizedIsInitialized;
      private static final S2C_TempProps_10346 DEFAULT_INSTANCE = new S2C_TempProps_10346();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TempProps_10346> PARSER = new AbstractParser<S2C_TempProps_10346>() {
         public S2C_TempProps_10346 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TempProps_10346(input, extensionRegistry);
         }
      };

      private S2C_TempProps_10346(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TempProps_10346() {
         this.memoizedIsInitialized = -1;
         this.tempProps_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TempProps_10346();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TempProps_10346(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.tempProps_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.tempProps_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
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
                  this.tempProps_ = Collections.unmodifiableList(this.tempProps_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_TempProps_10346_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_TempProps_10346_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TempProps_10346.class, Builder.class);
      }

      public List<CommonMsg.ItemInfo> getTempPropsList() {
         return this.tempProps_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getTempPropsOrBuilderList() {
         return this.tempProps_;
      }

      public int getTempPropsCount() {
         return this.tempProps_.size();
      }

      public CommonMsg.ItemInfo getTempProps(int index) {
         return (CommonMsg.ItemInfo)this.tempProps_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getTempPropsOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.tempProps_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTempPropsCount(); ++i) {
               if (!this.getTempProps(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.tempProps_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.tempProps_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.tempProps_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.tempProps_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TempProps_10346)) {
            return super.equals(obj);
         } else {
            S2C_TempProps_10346 other = (S2C_TempProps_10346)obj;
            if (!this.getTempPropsList().equals(other.getTempPropsList())) {
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
            if (this.getTempPropsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTempPropsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TempProps_10346 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TempProps_10346)PARSER.parseFrom(data);
      }

      public static S2C_TempProps_10346 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TempProps_10346)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TempProps_10346 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TempProps_10346)PARSER.parseFrom(data);
      }

      public static S2C_TempProps_10346 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TempProps_10346)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TempProps_10346 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TempProps_10346)PARSER.parseFrom(data);
      }

      public static S2C_TempProps_10346 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TempProps_10346)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TempProps_10346 parseFrom(InputStream input) throws IOException {
         return (S2C_TempProps_10346)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TempProps_10346 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TempProps_10346)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TempProps_10346 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TempProps_10346)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TempProps_10346 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TempProps_10346)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TempProps_10346 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TempProps_10346)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TempProps_10346 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TempProps_10346)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TempProps_10346 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TempProps_10346 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TempProps_10346> parser() {
         return PARSER;
      }

      public Parser<S2C_TempProps_10346> getParserForType() {
         return PARSER;
      }

      public S2C_TempProps_10346 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TempProps_10346OrBuilder {
         private int bitField0_;
         private List<CommonMsg.ItemInfo> tempProps_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> tempPropsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_TempProps_10346_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_TempProps_10346_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TempProps_10346.class, Builder.class);
         }

         private Builder() {
            this.tempProps_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.tempProps_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.S2C_TempProps_10346.alwaysUseFieldBuilders) {
               this.getTempPropsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.tempPropsBuilder_ == null) {
               this.tempProps_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.tempPropsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_TempProps_10346_descriptor;
         }

         public S2C_TempProps_10346 getDefaultInstanceForType() {
            return ExpeditionMsg.S2C_TempProps_10346.getDefaultInstance();
         }

         public S2C_TempProps_10346 build() {
            S2C_TempProps_10346 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TempProps_10346 buildPartial() {
            S2C_TempProps_10346 result = new S2C_TempProps_10346(this);
            int from_bitField0_ = this.bitField0_;
            if (this.tempPropsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.tempProps_ = Collections.unmodifiableList(this.tempProps_);
                  this.bitField0_ &= -2;
               }

               result.tempProps_ = this.tempProps_;
            } else {
               result.tempProps_ = this.tempPropsBuilder_.build();
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
            if (other instanceof S2C_TempProps_10346) {
               return this.mergeFrom((S2C_TempProps_10346)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TempProps_10346 other) {
            if (other == ExpeditionMsg.S2C_TempProps_10346.getDefaultInstance()) {
               return this;
            } else {
               if (this.tempPropsBuilder_ == null) {
                  if (!other.tempProps_.isEmpty()) {
                     if (this.tempProps_.isEmpty()) {
                        this.tempProps_ = other.tempProps_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTempPropsIsMutable();
                        this.tempProps_.addAll(other.tempProps_);
                     }

                     this.onChanged();
                  }
               } else if (!other.tempProps_.isEmpty()) {
                  if (this.tempPropsBuilder_.isEmpty()) {
                     this.tempPropsBuilder_.dispose();
                     this.tempPropsBuilder_ = null;
                     this.tempProps_ = other.tempProps_;
                     this.bitField0_ &= -2;
                     this.tempPropsBuilder_ = ExpeditionMsg.S2C_TempProps_10346.alwaysUseFieldBuilders ? this.getTempPropsFieldBuilder() : null;
                  } else {
                     this.tempPropsBuilder_.addAllMessages(other.tempProps_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTempPropsCount(); ++i) {
               if (!this.getTempProps(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TempProps_10346 parsedMessage = null;

            try {
               parsedMessage = (S2C_TempProps_10346)ExpeditionMsg.S2C_TempProps_10346.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TempProps_10346)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTempPropsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.tempProps_ = new ArrayList(this.tempProps_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.ItemInfo> getTempPropsList() {
            return this.tempPropsBuilder_ == null ? Collections.unmodifiableList(this.tempProps_) : this.tempPropsBuilder_.getMessageList();
         }

         public int getTempPropsCount() {
            return this.tempPropsBuilder_ == null ? this.tempProps_.size() : this.tempPropsBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getTempProps(int index) {
            return this.tempPropsBuilder_ == null ? (CommonMsg.ItemInfo)this.tempProps_.get(index) : (CommonMsg.ItemInfo)this.tempPropsBuilder_.getMessage(index);
         }

         public Builder setTempProps(int index, CommonMsg.ItemInfo value) {
            if (this.tempPropsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTempPropsIsMutable();
               this.tempProps_.set(index, value);
               this.onChanged();
            } else {
               this.tempPropsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTempProps(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.tempPropsBuilder_ == null) {
               this.ensureTempPropsIsMutable();
               this.tempProps_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.tempPropsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTempProps(CommonMsg.ItemInfo value) {
            if (this.tempPropsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTempPropsIsMutable();
               this.tempProps_.add(value);
               this.onChanged();
            } else {
               this.tempPropsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTempProps(int index, CommonMsg.ItemInfo value) {
            if (this.tempPropsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTempPropsIsMutable();
               this.tempProps_.add(index, value);
               this.onChanged();
            } else {
               this.tempPropsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTempProps(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.tempPropsBuilder_ == null) {
               this.ensureTempPropsIsMutable();
               this.tempProps_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.tempPropsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTempProps(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.tempPropsBuilder_ == null) {
               this.ensureTempPropsIsMutable();
               this.tempProps_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.tempPropsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTempProps(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.tempPropsBuilder_ == null) {
               this.ensureTempPropsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.tempProps_);
               this.onChanged();
            } else {
               this.tempPropsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTempProps() {
            if (this.tempPropsBuilder_ == null) {
               this.tempProps_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.tempPropsBuilder_.clear();
            }

            return this;
         }

         public Builder removeTempProps(int index) {
            if (this.tempPropsBuilder_ == null) {
               this.ensureTempPropsIsMutable();
               this.tempProps_.remove(index);
               this.onChanged();
            } else {
               this.tempPropsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getTempPropsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getTempPropsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getTempPropsOrBuilder(int index) {
            return this.tempPropsBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.tempProps_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.tempPropsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getTempPropsOrBuilderList() {
            return this.tempPropsBuilder_ != null ? this.tempPropsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.tempProps_);
         }

         public CommonMsg.ItemInfo.Builder addTempPropsBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getTempPropsFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addTempPropsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getTempPropsFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getTempPropsBuilderList() {
            return this.getTempPropsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getTempPropsFieldBuilder() {
            if (this.tempPropsBuilder_ == null) {
               this.tempPropsBuilder_ = new RepeatedFieldBuilderV3(this.tempProps_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.tempProps_ = null;
            }

            return this.tempPropsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_UpdatePassNum_10348 extends GeneratedMessageV3 implements S2C_UpdatePassNum_10348OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHAPTERID_FIELD_NUMBER = 1;
      private int chapterId_;
      public static final int PASSNUM_FIELD_NUMBER = 2;
      private int passNum_;
      public static final int FIRSTPLAYERNAME_FIELD_NUMBER = 3;
      private volatile Object firstPlayerName_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdatePassNum_10348 DEFAULT_INSTANCE = new S2C_UpdatePassNum_10348();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdatePassNum_10348> PARSER = new AbstractParser<S2C_UpdatePassNum_10348>() {
         public S2C_UpdatePassNum_10348 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdatePassNum_10348(input, extensionRegistry);
         }
      };

      private S2C_UpdatePassNum_10348(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdatePassNum_10348() {
         this.memoizedIsInitialized = -1;
         this.firstPlayerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdatePassNum_10348();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdatePassNum_10348(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.passNum_ = input.readInt32();
                        break;
                     case 26:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.firstPlayerName_ = bs;
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
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_UpdatePassNum_10348_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_UpdatePassNum_10348_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdatePassNum_10348.class, Builder.class);
      }

      public boolean hasChapterId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChapterId() {
         return this.chapterId_;
      }

      public boolean hasPassNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPassNum() {
         return this.passNum_;
      }

      public boolean hasFirstPlayerName() {
         return (this.bitField0_ & 4) != 0;
      }

      public String getFirstPlayerName() {
         Object ref = this.firstPlayerName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.firstPlayerName_ = s;
            }

            return s;
         }
      }

      public ByteString getFirstPlayerNameBytes() {
         Object ref = this.firstPlayerName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.firstPlayerName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
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
            output.writeInt32(1, this.chapterId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.passNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.firstPlayerName_);
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
               size += CodedOutputStream.computeInt32Size(2, this.passNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.firstPlayerName_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpdatePassNum_10348)) {
            return super.equals(obj);
         } else {
            S2C_UpdatePassNum_10348 other = (S2C_UpdatePassNum_10348)obj;
            if (this.hasChapterId() != other.hasChapterId()) {
               return false;
            } else if (this.hasChapterId() && this.getChapterId() != other.getChapterId()) {
               return false;
            } else if (this.hasPassNum() != other.hasPassNum()) {
               return false;
            } else if (this.hasPassNum() && this.getPassNum() != other.getPassNum()) {
               return false;
            } else if (this.hasFirstPlayerName() != other.hasFirstPlayerName()) {
               return false;
            } else if (this.hasFirstPlayerName() && !this.getFirstPlayerName().equals(other.getFirstPlayerName())) {
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

            if (this.hasPassNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPassNum();
            }

            if (this.hasFirstPlayerName()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getFirstPlayerName().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpdatePassNum_10348 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdatePassNum_10348)PARSER.parseFrom(data);
      }

      public static S2C_UpdatePassNum_10348 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdatePassNum_10348)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdatePassNum_10348 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdatePassNum_10348)PARSER.parseFrom(data);
      }

      public static S2C_UpdatePassNum_10348 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdatePassNum_10348)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdatePassNum_10348 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdatePassNum_10348)PARSER.parseFrom(data);
      }

      public static S2C_UpdatePassNum_10348 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdatePassNum_10348)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdatePassNum_10348 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdatePassNum_10348)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdatePassNum_10348 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdatePassNum_10348)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdatePassNum_10348 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdatePassNum_10348)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdatePassNum_10348 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdatePassNum_10348)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdatePassNum_10348 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdatePassNum_10348)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdatePassNum_10348 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdatePassNum_10348)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdatePassNum_10348 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdatePassNum_10348 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdatePassNum_10348> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdatePassNum_10348> getParserForType() {
         return PARSER;
      }

      public S2C_UpdatePassNum_10348 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdatePassNum_10348OrBuilder {
         private int bitField0_;
         private int chapterId_;
         private int passNum_;
         private Object firstPlayerName_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_UpdatePassNum_10348_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_UpdatePassNum_10348_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdatePassNum_10348.class, Builder.class);
         }

         private Builder() {
            this.firstPlayerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.firstPlayerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExpeditionMsg.S2C_UpdatePassNum_10348.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.chapterId_ = 0;
            this.bitField0_ &= -2;
            this.passNum_ = 0;
            this.bitField0_ &= -3;
            this.firstPlayerName_ = "";
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExpeditionMsg.internal_static_expedition_com_gzbz_protobuf_S2C_UpdatePassNum_10348_descriptor;
         }

         public S2C_UpdatePassNum_10348 getDefaultInstanceForType() {
            return ExpeditionMsg.S2C_UpdatePassNum_10348.getDefaultInstance();
         }

         public S2C_UpdatePassNum_10348 build() {
            S2C_UpdatePassNum_10348 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdatePassNum_10348 buildPartial() {
            S2C_UpdatePassNum_10348 result = new S2C_UpdatePassNum_10348(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.chapterId_ = this.chapterId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.passNum_ = this.passNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.firstPlayerName_ = this.firstPlayerName_;
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
            if (other instanceof S2C_UpdatePassNum_10348) {
               return this.mergeFrom((S2C_UpdatePassNum_10348)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdatePassNum_10348 other) {
            if (other == ExpeditionMsg.S2C_UpdatePassNum_10348.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChapterId()) {
                  this.setChapterId(other.getChapterId());
               }

               if (other.hasPassNum()) {
                  this.setPassNum(other.getPassNum());
               }

               if (other.hasFirstPlayerName()) {
                  this.bitField0_ |= 4;
                  this.firstPlayerName_ = other.firstPlayerName_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChapterId()) {
               return false;
            } else {
               return this.hasPassNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpdatePassNum_10348 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdatePassNum_10348)ExpeditionMsg.S2C_UpdatePassNum_10348.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdatePassNum_10348)e.getUnfinishedMessage();
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

         public boolean hasPassNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPassNum() {
            return this.passNum_;
         }

         public Builder setPassNum(int value) {
            this.bitField0_ |= 2;
            this.passNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPassNum() {
            this.bitField0_ &= -3;
            this.passNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFirstPlayerName() {
            return (this.bitField0_ & 4) != 0;
         }

         public String getFirstPlayerName() {
            Object ref = this.firstPlayerName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.firstPlayerName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getFirstPlayerNameBytes() {
            Object ref = this.firstPlayerName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.firstPlayerName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setFirstPlayerName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.firstPlayerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearFirstPlayerName() {
            this.bitField0_ &= -5;
            this.firstPlayerName_ = ExpeditionMsg.S2C_UpdatePassNum_10348.getDefaultInstance().getFirstPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setFirstPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.firstPlayerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_BattleRecord_10333OrBuilder extends MessageOrBuilder {
      boolean hasChapterId();

      int getChapterId();
   }

   public interface C2S_BuffList_10315OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();
   }

   public interface C2S_Chapters_10301OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_DispatchHero_10337OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_DispatchList_10341OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_EmployHero_10339OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasDispatchCode();

      int getDispatchCode();
   }

   public interface C2S_EnemyData_10323OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();
   }

   public interface C2S_EnterChapter_10303OrBuilder extends MessageOrBuilder {
      boolean hasChapterId();

      int getChapterId();

      boolean hasActivityId();

      int getActivityId();
   }

   public interface C2S_ExitChapter_10305OrBuilder extends MessageOrBuilder {
      boolean hasChapterId();

      int getChapterId();
   }

   public interface C2S_HeroHpData_10327OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Move_10307OrBuilder extends MessageOrBuilder {
      boolean hasOriGrid();

      int getOriGrid();

      boolean hasDestGrid();

      int getDestGrid();

      List<Integer> getPassGridList();

      int getPassGridCount();

      int getPassGrid(int index);
   }

   public interface C2S_OtherBuff_10317OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();
   }

   public interface C2S_RecruitHeroData_10325OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_RecruitHeroList_10319OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();
   }

   public interface C2S_RecruitHero_10321OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();

      boolean hasCodeId();

      int getCodeId();
   }

   public interface C2S_SelectBuff_10309OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();

      boolean hasBuffId();

      int getBuffId();
   }

   public interface ChapterInfoOrBuilder extends MessageOrBuilder {
      boolean hasChapterId();

      int getChapterId();

      boolean hasState();

      int getState();

      boolean hasCompleteNum();

      int getCompleteNum();

      List<CommonMsg.MapDataII> getBoxList();

      CommonMsg.MapDataII getBox(int index);

      int getBoxCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getBoxOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getBoxOrBuilder(int index);

      boolean hasFirstPlayerId();

      int getFirstPlayerId();

      boolean hasFirstPlayerName();

      String getFirstPlayerName();

      ByteString getFirstPlayerNameBytes();

      boolean hasPassNum();

      int getPassNum();
   }

   public interface HpDataOrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasHp();

      int getHp();
   }

   public interface MercenaryInfoOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasHeroInfo();

      CommonMsg.HeroInfo getHeroInfo();

      CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder();

      boolean hasBEmploy();

      boolean getBEmploy();
   }

   public interface RecordInfoOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasType();

      int getType();

      boolean hasCrossPower();

      long getCrossPower();

      boolean hasCrossTime();

      int getCrossTime();

      boolean hasHead();

      int getHead();

      boolean hasHeadFrame();

      int getHeadFrame();

      List<CommonMsg.HeroInfo> getHeroInfosList();

      CommonMsg.HeroInfo getHeroInfos(int index);

      int getHeroInfosCount();

      List<? extends CommonMsg.HeroInfoOrBuilder> getHeroInfosOrBuilderList();

      CommonMsg.HeroInfoOrBuilder getHeroInfosOrBuilder(int index);
   }

   public interface S2C_BattleRecord_10334OrBuilder extends MessageOrBuilder {
      boolean hasChapterId();

      int getChapterId();

      List<RecordInfo> getRecordsList();

      RecordInfo getRecords(int index);

      int getRecordsCount();

      List<? extends RecordInfoOrBuilder> getRecordsOrBuilderList();

      RecordInfoOrBuilder getRecordsOrBuilder(int index);
   }

   public interface S2C_BuffList_10316OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();

      List<Integer> getBuffListList();

      int getBuffListCount();

      int getBuffList(int index);
   }

   public interface S2C_ChangeHeroIdle_10344OrBuilder extends MessageOrBuilder {
      boolean hasHeroId();

      int getHeroId();
   }

   public interface S2C_Chapters_10302OrBuilder extends MessageOrBuilder {
      List<ChapterInfo> getChapterInfoList();

      ChapterInfo getChapterInfo(int index);

      int getChapterInfoCount();

      List<? extends ChapterInfoOrBuilder> getChapterInfoOrBuilderList();

      ChapterInfoOrBuilder getChapterInfoOrBuilder(int index);

      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface S2C_DispatchHero_10338OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface S2C_DispatchList_10342OrBuilder extends MessageOrBuilder {
      List<MercenaryInfo> getMercenaryInfoList();

      MercenaryInfo getMercenaryInfo(int index);

      int getMercenaryInfoCount();

      List<? extends MercenaryInfoOrBuilder> getMercenaryInfoOrBuilderList();

      MercenaryInfoOrBuilder getMercenaryInfoOrBuilder(int index);
   }

   public interface S2C_EmployHero_10340OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasDispatchCode();

      int getDispatchCode();
   }

   public interface S2C_EnemyData_10324OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();

      boolean hasPassed();

      boolean getPassed();

      List<HpData> getHpDataList();

      HpData getHpData(int index);

      int getHpDataCount();

      List<? extends HpDataOrBuilder> getHpDataOrBuilderList();

      HpDataOrBuilder getHpDataOrBuilder(int index);
   }

   public interface S2C_EnterChapter_10304OrBuilder extends MessageOrBuilder {
      boolean hasChapterId();

      int getChapterId();

      boolean hasCurGrid();

      int getCurGrid();

      List<S2C_GridInfo_10314> getGridInfoList();

      S2C_GridInfo_10314 getGridInfo(int index);

      int getGridInfoCount();

      List<? extends S2C_GridInfo_10314OrBuilder> getGridInfoOrBuilderList();

      S2C_GridInfo_10314OrBuilder getGridInfoOrBuilder(int index);

      List<Integer> getBuffsList();

      int getBuffsCount();

      int getBuffs(int index);

      boolean hasHeroId();

      int getHeroId();

      List<CommonMsg.ItemInfo> getTempPropsList();

      CommonMsg.ItemInfo getTempProps(int index);

      int getTempPropsCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getTempPropsOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getTempPropsOrBuilder(int index);
   }

   public interface S2C_ExitChapter_10306OrBuilder extends MessageOrBuilder {
      boolean hasChapterId();

      int getChapterId();
   }

   public interface S2C_GridInfo_10314OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();

      boolean hasEventIdx();

      int getEventIdx();

      boolean hasGridIcon();

      int getGridIcon();

      boolean hasGridType();

      int getGridType();
   }

   public interface S2C_HeroHpData_10328OrBuilder extends MessageOrBuilder {
      List<HpData> getHpDataList();

      HpData getHpData(int index);

      int getHpDataCount();

      List<? extends HpDataOrBuilder> getHpDataOrBuilderList();

      HpDataOrBuilder getHpDataOrBuilder(int index);
   }

   public interface S2C_Move_10308OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasDestGrid();

      int getDestGrid();
   }

   public interface S2C_OtherBuff_10318OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();
   }

   public interface S2C_RecruitHeroData_10326OrBuilder extends MessageOrBuilder {
      List<CommonMsg.HeroInfo> getHeroList();

      CommonMsg.HeroInfo getHero(int index);

      int getHeroCount();

      List<? extends CommonMsg.HeroInfoOrBuilder> getHeroOrBuilderList();

      CommonMsg.HeroInfoOrBuilder getHeroOrBuilder(int index);
   }

   public interface S2C_RecruitHeroList_10320OrBuilder extends MessageOrBuilder {
      boolean hasGird();

      int getGird();

      List<CommonMsg.HeroInfo> getHeroList();

      CommonMsg.HeroInfo getHero(int index);

      int getHeroCount();

      List<? extends CommonMsg.HeroInfoOrBuilder> getHeroOrBuilderList();

      CommonMsg.HeroInfoOrBuilder getHeroOrBuilder(int index);
   }

   public interface S2C_RecruitHero_10322OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();

      boolean hasCodeId();

      int getCodeId();
   }

   public interface S2C_SelectBuff_10310OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();

      boolean hasBuffId();

      int getBuffId();
   }

   public interface S2C_TempProps_10346OrBuilder extends MessageOrBuilder {
      List<CommonMsg.ItemInfo> getTempPropsList();

      CommonMsg.ItemInfo getTempProps(int index);

      int getTempPropsCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getTempPropsOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getTempPropsOrBuilder(int index);
   }

   public interface S2C_UnlockSeeGrids_10330OrBuilder extends MessageOrBuilder {
      List<Integer> getGridList();

      int getGridCount();

      int getGrid(int index);
   }

   public interface S2C_UpdateGridInfo_10312OrBuilder extends MessageOrBuilder {
      List<S2C_GridInfo_10314> getInfoList();

      S2C_GridInfo_10314 getInfo(int index);

      int getInfoCount();

      List<? extends S2C_GridInfo_10314OrBuilder> getInfoOrBuilderList();

      S2C_GridInfo_10314OrBuilder getInfoOrBuilder(int index);
   }

   public interface S2C_UpdateHeroPos_10332OrBuilder extends MessageOrBuilder {
      boolean hasCurGrid();

      int getCurGrid();
   }

   public interface S2C_UpdatePassNum_10348OrBuilder extends MessageOrBuilder {
      boolean hasChapterId();

      int getChapterId();

      boolean hasPassNum();

      int getPassNum();

      boolean hasFirstPlayerName();

      String getFirstPlayerName();

      ByteString getFirstPlayerNameBytes();
   }
}
