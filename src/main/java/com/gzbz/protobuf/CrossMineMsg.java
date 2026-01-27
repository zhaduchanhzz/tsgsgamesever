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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
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

public final class CrossMineMsg {
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_S2CR_PlayerEnter_12301_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_S2CR_PlayerEnter_12301_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_S2CR_MineInfo_12303_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_S2CR_MineInfo_12303_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateMineInfo_12306_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateMineInfo_12306_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_S2CR_RewardPreview_12309_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_S2CR_RewardPreview_12309_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_S2CR_GetMineRewards_12311_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_S2CR_GetMineRewards_12311_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_CR2S_GetMineRewards_12312_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_CR2S_GetMineRewards_12312_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_S2CR_MyMineInfo_12315_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_S2CR_MyMineInfo_12315_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_S2CR_MineDetail_12319_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_S2CR_MineDetail_12319_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_S2CR_ATK_12321_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_S2CR_ATK_12321_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_CR2S_ATK_12322_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_CR2S_ATK_12322_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdatePerson_12324_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdatePerson_12324_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_CR2S_MailResource_12326_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_CR2S_MailResource_12326_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateHillInfo_12330_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateHillInfo_12330_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_S2CR_MineNote_12331_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_S2CR_MineNote_12331_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_S2CR_ArrayingDef_12333_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_S2CR_ArrayingDef_12333_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_CR2S_LoseMineVein_12336_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_CR2S_LoseMineVein_12336_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_CR2S_UseEnergy_12338_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_CR2S_UseEnergy_12338_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_CR2S_ClearRevenge_12340_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_CR2S_ClearRevenge_12340_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_S2CR_MineRank_12341_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_S2CR_MineRank_12341_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_CR2S_NotifyState_12344_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_CR2S_NotifyState_12344_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_S2CR_DefArraying_12345_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_S2CR_DefArraying_12345_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_CR2S_DefArraying_12346_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_CR2S_DefArraying_12346_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_CR2S_RankReward_12348_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_CR2S_RankReward_12348_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_S2CR_ChangeLine_12349_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_S2CR_ChangeLine_12349_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_CR2S_AddLine_12352_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_CR2S_AddLine_12352_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_S2CR_RedDotState_12353_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_S2CR_RedDotState_12353_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_CR2S_ChangInfo_12358_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_CR2S_ChangInfo_12358_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_CR2S_MineAcrossDay_12360_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_CR2S_MineAcrossDay_12360_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_S2CR_SetMineState_12361_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_S2CR_SetMineState_12361_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_S2CR_UpdateLine_12363_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_S2CR_UpdateLine_12363_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateLine_12364_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateLine_12364_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_CR2S_LogOperate_12366_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_CR2S_LogOperate_12366_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_S2CR_CheckEmptyVein_12367_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_S2CR_CheckEmptyVein_12367_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_S2CR_HillEvent_12369_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_S2CR_HillEvent_12369_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_CR2S_HillEvent_12370_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_CR2S_HillEvent_12370_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_S2CR_SetDefNum_12371_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_S2CR_SetDefNum_12371_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_S2CR_UpdateDefPos_12373_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_S2CR_UpdateDefPos_12373_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_S2CR_SpecialRedState_12375_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_S2CR_SpecialRedState_12375_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_S2CR_GetMineVein_12377_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_S2CR_GetMineVein_12377_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_S2CR_GuanJiaOperate_12379_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_S2CR_GuanJiaOperate_12379_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_CR2S_GuanJiaOperate_12380_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_CR2S_GuanJiaOperate_12380_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMine_com_gzbz_protobuf_CR2S_MergeMine_12382_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMine_com_gzbz_protobuf_CR2S_MergeMine_12382_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private CrossMineMsg() {
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
      String[] descriptorData = new String[]{"\n\u000fCrossMine.proto\u0012\u001bcrossMine.com.gzbz.protobuf\u001a\fcommon.proto\u001a\nMine.proto\u001a\fBattle.proto\"Ð\u0002\n\u0016S2CR_PlayerEnter_12301\u0012\u0011\n\tuseEnergy\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nresumeTime\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007buyTime\u0018\u0003 \u0002(\u0005\u0012\u0010\n\bmyHillId\u0018\u0004 \u0002(\u0005\u0012\u0010\n\bmyVeinId\u0018\u0005 \u0002(\u0005\u0012\u000f\n\u0007fallNum\u0018\u0006 \u0002(\u0005\u0012\u0011\n\trevengeId\u0018\u0007 \u0002(\u0005\u0012>\n\u000bsupportHero\u0018\b \u0001(\u000b2).mine.com.gzbz.protobuf.FriendSupportHero\u0012\u0015\n\rfightCollTime\u0018\t \u0002(\u0005\u0012\u0012\n\natkHeroPos\u0018\n \u0002(\u0005\u0012\u0014\n\fdurationTime\u0018\u000b \u0002(\u0005\u0012\u001c\n\u0014higestOccupyMineType\u0018\f \u0001(\u0005\u0012\u0017\n\u000femployNunOfWeek\u0018\r \u0001(\u0005\"3\n\u0013S2CR_MineInfo_12303\u0012\f\n\u0004line\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006hillId\u0018\u0002 \u0002(\u0005\"W\n\u0019CR2S_UpdateMineInfo_12306\u0012:\n\fmineVeinInfo\u0018\u0001 \u0003(\u000b2$.mine.com.gzbz.protobuf.MineVeinInfo\"\u001a\n\u0018S2CR_RewardPreview_12309\"\u001b\n\u0019S2CR_GetMineRewards_12311\"T\n\u0019CR2S_GetMineRewards_12312\u0012!\n\u0007rewards\u0018\u0001 \u0003(\u000b2\u0010.common.ItemInfo\u0012\u0014\n\fdurationTime\u0018\u0002 \u0002(\u0005\"\u007f\n\u0015S2CR_MyMineInfo_12315\u0012\f\n\u0004line\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006hillId\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006veinId\u0018\u0003 \u0002(\u0005\u0012\u000f\n\u0007fallNum\u0018\u0004 \u0002(\u0005\u0012\u0011\n\trevengeId\u0018\u0005 \u0002(\u0005\u0012\u0014\n\fdurationTime\u0018\u0006 \u0002(\u0005\"T\n\u0015S2CR_MineDetail_12319\u0012\f\n\u0004line\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006hillId\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006veinId\u0018\u0003 \u0002(\u0005\u0012\r\n\u0005fight\u0018\u0004 \u0002(\u0003\"ê\u0001\n\u000eS2CR_ATK_12321\u0012\u000f\n\u0007atkType\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004line\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006hillId\u0018\u0003 \u0002(\u0005\u0012\u0012\n\nmineVeinId\u0018\u0004 \u0001(\u0005\u0012\u0018\n\u0010heroArrayingData\u0018\u0005 \u0002(\f\u0012\u0012\n\nheroMirror\u0018\u0006 \u0001(\f\u0012\u000f\n\u0007heroPos\u0018\u0007 \u0001(\u0005\u0012\u0011\n\trevengeId\u0018\b \u0001(\u0005\u0012\u0011\n\tcurEnergy\u0018\t \u0001(\u0005\u0012\u0016\n\u000ehigestMineType\u0018\n \u0001(\u0005\u0012\u0018\n\u0010atkWithEmployNum\u0018\u000b \u0001(\u0005\"y\n\u000eCR2S_ATK_12322\u0012\u000e\n\u0006hillId\u0018\u0001 \u0002(\u0005\u0012B\n\tbattleMsg\u0018\u0002 \u0002(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\u0012\u0013\n\u000bisAtkPlayer\u0018\u0003 \u0001(\b\"\u008f\u0001\n\u0017CR2S_UpdatePerson_12324\u0012\f\n\u0004line\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006hillId\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006veinId\u0018\u0003 \u0002(\u0005\u0012\u0011\n\tstartTime\u0018\u0004 \u0001(\u0005\u0012\u000e\n\u0006having\u0018\u0005 \u0002(\b\u0012\u000f\n\u0007eventId\u0018\u0006 \u0003(\u0005\u0012\u0012\n\nhitMonster\u0018\u0007 \u0002(\b\"H\n\u0017CR2S_MailResource_12326\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u001f\n\u0005items\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\"Q\n\u0019CR2S_UpdateHillInfo_12330\u00124\n\u0004info\u0018\u0001 \u0003(\u000b2&.mine.com.gzbz.protobuf.HillUnionEvent\"\u0015\n\u0013S2CR_MineNote_12331\"*\n\u0016S2CR_ArrayingDef_12333\u0012\u0010\n\barraying\u0018\u0001 \u0002(\f\"\u0099\u0001\n\u0017CR2S_LoseMineVein_12336\u0012\u0011\n\trevengeId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bloseTime\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007fallNum\u0018\u0003 \u0002(\u0005\u0012!\n\u0007rewards\u0018\u0004 \u0003(\u000b2\u0010.common.ItemInfo\u0012\u0014\n\fdurationTime\u0018\u0005 \u0002(\u0005\u0012\u000f\n\u0007special\u0018\u0006 \u0002(\b\"%\n\u0014CR2S_UseEnergy_12338\u0012\r\n\u0005bFree\u0018\u0001 \u0002(\b\"\u0019\n\u0017CR2S_ClearRevenge_12340\"#\n\u0013S2CR_MineRank_12341\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"'\n\u0016CR2S_NotifyState_12344\u0012\r\n\u0005state\u0018\u0001 \u0002(\u0005\"W\n\u0016S2CR_DefArraying_12345\u0012\u0018\n\u0010heroArrayingData\u0018\u0001 \u0002(\f\u0012\u0012\n\nheroMirror\u0018\u0002 \u0001(\f\u0012\u000f\n\u0007heroPos\u0018\u0003 \u0002(\u0005\"9\n\u0016CR2S_DefArraying_12346\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007heroPos\u0018\u0002 \u0002(\u0005\"7\n\u0015CR2S_RankReward_12348\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u0010\n\brankInfo\u0018\u0002 \u0003(\t\"%\n\u0015S2CR_ChangeLine_12349\u0012\f\n\u0004line\u0018\u0001 \u0002(\u0005\"'\n\u0012CR2S_AddLine_12352\u0012\u0011\n\ttotalLine\u0018\u0001 \u0002(\u0005\"L\n\u0016S2CR_RedDotState_12353\u00122\n\bredState\u0018\u0001 \u0003(\u000e2 .mine.com.gzbz.protobuf.RedState\"O\n\u0014CR2S_ChangInfo_12358\u00127\n\nchangeInfo\u0018\u0001 \u0003(\u000b2#.mine.com.gzbz.protobuf.Chaneg_Info\"\u001a\n\u0018CR2S_MineAcrossDay_12360\"(\n\u0017S2CR_SetMineState_12361\u0012\r\n\u0005state\u0018\u0001 \u0002(\u0005\")\n\u0015S2CR_UpdateLine_12363\u0012\u0010\n\boffValue\u0018\u0001 \u0002(\u0005\"3\n\u0015CR2S_UpdateLine_12364\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004line\u0018\u0002 \u0003(\u0005\"|\n\u0015CR2S_LogOperate_12366\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005fight\u0018\u0002 \u0002(\u0003\u0012\u0011\n\tunionName\u0018\u0003 \u0001(\t\u0012\u000e\n\u0006veinId\u0018\u0004 \u0002(\u0005\u0012\u000f\n\u0007atkType\u0018\u0005 \u0002(\u0005\u0012\u000e\n\u0006result\u0018\u0006 \u0002(\b\"9\n\u0019S2CR_CheckEmptyVein_12367\u0012\f\n\u0004line\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006hillId\u0018\u0002 \u0002(\u0005\"E\n\u0014S2CR_HillEvent_12369\u0012\f\n\u0004line\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006hillId\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007unionId\u0018\u0003 \u0002(\u0005\"l\n\u0014CR2S_HillEvent_12370\u0012\f\n\u0004line\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006hillId\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007unionId\u0018\u0003 \u0002(\u0005\u0012\u000f\n\u0007eventId\u0018\u0004 \u0003(\u0005\u0012\u0014\n\fdurationTime\u0018\u0005 \u0001(\u0005\"&\n\u0014S2CR_SetDefNum_12371\u0012\u000e\n\u0006defNum\u0018\u0001 \u0002(\u0005\"*\n\u0017S2CR_UpdateDefPos_12373\u0012\u000f\n\u0007heroPos\u0018\u0001 \u0002(\u0005\"\u001c\n\u001aS2CR_SpecialRedState_12375\"_\n\u0016S2CR_GetMineVein_12377\u0012\r\n\u0005force\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004line\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006hillId\u0018\u0003 \u0002(\u0005\u0012\u0018\n\u0010heroArrayingData\u0018\u0004 \u0002(\f\"\u001b\n\u0019S2CR_GuanJiaOperate_12379\">\n\u0019CR2S_GuanJiaOperate_12380\u0012!\n\u0007rewards\u0018\u0003 \u0003(\u000b2\u0010.common.ItemInfo\"(\n\u0014CR2S_MergeMine_12382\u0012\u0010\n\bplayerId\u0018\u0001 \u0003(\u0005B#\n\u0011com.gzbz.protobufB\fCrossMineMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), MineMsg.getDescriptor(), BattleMsg.getDescriptor()});
      internal_static_crossMine_com_gzbz_protobuf_S2CR_PlayerEnter_12301_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_PlayerEnter_12301_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_S2CR_PlayerEnter_12301_descriptor, new String[]{"UseEnergy", "ResumeTime", "BuyTime", "MyHillId", "MyVeinId", "FallNum", "RevengeId", "SupportHero", "FightCollTime", "AtkHeroPos", "DurationTime", "HigestOccupyMineType", "EmployNunOfWeek"});
      internal_static_crossMine_com_gzbz_protobuf_S2CR_MineInfo_12303_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_MineInfo_12303_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_S2CR_MineInfo_12303_descriptor, new String[]{"Line", "HillId"});
      internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateMineInfo_12306_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateMineInfo_12306_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateMineInfo_12306_descriptor, new String[]{"MineVeinInfo"});
      internal_static_crossMine_com_gzbz_protobuf_S2CR_RewardPreview_12309_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_RewardPreview_12309_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_S2CR_RewardPreview_12309_descriptor, new String[0]);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_GetMineRewards_12311_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_GetMineRewards_12311_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_S2CR_GetMineRewards_12311_descriptor, new String[0]);
      internal_static_crossMine_com_gzbz_protobuf_CR2S_GetMineRewards_12312_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_crossMine_com_gzbz_protobuf_CR2S_GetMineRewards_12312_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_CR2S_GetMineRewards_12312_descriptor, new String[]{"Rewards", "DurationTime"});
      internal_static_crossMine_com_gzbz_protobuf_S2CR_MyMineInfo_12315_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_MyMineInfo_12315_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_S2CR_MyMineInfo_12315_descriptor, new String[]{"Line", "HillId", "VeinId", "FallNum", "RevengeId", "DurationTime"});
      internal_static_crossMine_com_gzbz_protobuf_S2CR_MineDetail_12319_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_MineDetail_12319_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_S2CR_MineDetail_12319_descriptor, new String[]{"Line", "HillId", "VeinId", "Fight"});
      internal_static_crossMine_com_gzbz_protobuf_S2CR_ATK_12321_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_ATK_12321_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_S2CR_ATK_12321_descriptor, new String[]{"AtkType", "Line", "HillId", "MineVeinId", "HeroArrayingData", "HeroMirror", "HeroPos", "RevengeId", "CurEnergy", "HigestMineType", "AtkWithEmployNum"});
      internal_static_crossMine_com_gzbz_protobuf_CR2S_ATK_12322_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_crossMine_com_gzbz_protobuf_CR2S_ATK_12322_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_CR2S_ATK_12322_descriptor, new String[]{"HillId", "BattleMsg", "IsAtkPlayer"});
      internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdatePerson_12324_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdatePerson_12324_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdatePerson_12324_descriptor, new String[]{"Line", "HillId", "VeinId", "StartTime", "Having", "EventId", "HitMonster"});
      internal_static_crossMine_com_gzbz_protobuf_CR2S_MailResource_12326_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_crossMine_com_gzbz_protobuf_CR2S_MailResource_12326_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_CR2S_MailResource_12326_descriptor, new String[]{"Type", "Items"});
      internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateHillInfo_12330_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateHillInfo_12330_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateHillInfo_12330_descriptor, new String[]{"Info"});
      internal_static_crossMine_com_gzbz_protobuf_S2CR_MineNote_12331_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_MineNote_12331_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_S2CR_MineNote_12331_descriptor, new String[0]);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_ArrayingDef_12333_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_ArrayingDef_12333_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_S2CR_ArrayingDef_12333_descriptor, new String[]{"Arraying"});
      internal_static_crossMine_com_gzbz_protobuf_CR2S_LoseMineVein_12336_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_crossMine_com_gzbz_protobuf_CR2S_LoseMineVein_12336_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_CR2S_LoseMineVein_12336_descriptor, new String[]{"RevengeId", "LoseTime", "FallNum", "Rewards", "DurationTime", "Special"});
      internal_static_crossMine_com_gzbz_protobuf_CR2S_UseEnergy_12338_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_crossMine_com_gzbz_protobuf_CR2S_UseEnergy_12338_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_CR2S_UseEnergy_12338_descriptor, new String[]{"BFree"});
      internal_static_crossMine_com_gzbz_protobuf_CR2S_ClearRevenge_12340_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_crossMine_com_gzbz_protobuf_CR2S_ClearRevenge_12340_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_CR2S_ClearRevenge_12340_descriptor, new String[0]);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_MineRank_12341_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_MineRank_12341_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_S2CR_MineRank_12341_descriptor, new String[]{"Type"});
      internal_static_crossMine_com_gzbz_protobuf_CR2S_NotifyState_12344_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_crossMine_com_gzbz_protobuf_CR2S_NotifyState_12344_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_CR2S_NotifyState_12344_descriptor, new String[]{"State"});
      internal_static_crossMine_com_gzbz_protobuf_S2CR_DefArraying_12345_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_DefArraying_12345_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_S2CR_DefArraying_12345_descriptor, new String[]{"HeroArrayingData", "HeroMirror", "HeroPos"});
      internal_static_crossMine_com_gzbz_protobuf_CR2S_DefArraying_12346_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_crossMine_com_gzbz_protobuf_CR2S_DefArraying_12346_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_CR2S_DefArraying_12346_descriptor, new String[]{"Result", "HeroPos"});
      internal_static_crossMine_com_gzbz_protobuf_CR2S_RankReward_12348_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_crossMine_com_gzbz_protobuf_CR2S_RankReward_12348_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_CR2S_RankReward_12348_descriptor, new String[]{"Type", "RankInfo"});
      internal_static_crossMine_com_gzbz_protobuf_S2CR_ChangeLine_12349_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_ChangeLine_12349_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_S2CR_ChangeLine_12349_descriptor, new String[]{"Line"});
      internal_static_crossMine_com_gzbz_protobuf_CR2S_AddLine_12352_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_crossMine_com_gzbz_protobuf_CR2S_AddLine_12352_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_CR2S_AddLine_12352_descriptor, new String[]{"TotalLine"});
      internal_static_crossMine_com_gzbz_protobuf_S2CR_RedDotState_12353_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_RedDotState_12353_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_S2CR_RedDotState_12353_descriptor, new String[]{"RedState"});
      internal_static_crossMine_com_gzbz_protobuf_CR2S_ChangInfo_12358_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_crossMine_com_gzbz_protobuf_CR2S_ChangInfo_12358_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_CR2S_ChangInfo_12358_descriptor, new String[]{"ChangeInfo"});
      internal_static_crossMine_com_gzbz_protobuf_CR2S_MineAcrossDay_12360_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_crossMine_com_gzbz_protobuf_CR2S_MineAcrossDay_12360_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_CR2S_MineAcrossDay_12360_descriptor, new String[0]);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_SetMineState_12361_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_SetMineState_12361_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_S2CR_SetMineState_12361_descriptor, new String[]{"State"});
      internal_static_crossMine_com_gzbz_protobuf_S2CR_UpdateLine_12363_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_UpdateLine_12363_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_S2CR_UpdateLine_12363_descriptor, new String[]{"OffValue"});
      internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateLine_12364_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateLine_12364_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateLine_12364_descriptor, new String[]{"Type", "Line"});
      internal_static_crossMine_com_gzbz_protobuf_CR2S_LogOperate_12366_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_crossMine_com_gzbz_protobuf_CR2S_LogOperate_12366_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_CR2S_LogOperate_12366_descriptor, new String[]{"PlayerId", "Fight", "UnionName", "VeinId", "AtkType", "Result"});
      internal_static_crossMine_com_gzbz_protobuf_S2CR_CheckEmptyVein_12367_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_CheckEmptyVein_12367_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_S2CR_CheckEmptyVein_12367_descriptor, new String[]{"Line", "HillId"});
      internal_static_crossMine_com_gzbz_protobuf_S2CR_HillEvent_12369_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_HillEvent_12369_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_S2CR_HillEvent_12369_descriptor, new String[]{"Line", "HillId", "UnionId"});
      internal_static_crossMine_com_gzbz_protobuf_CR2S_HillEvent_12370_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_crossMine_com_gzbz_protobuf_CR2S_HillEvent_12370_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_CR2S_HillEvent_12370_descriptor, new String[]{"Line", "HillId", "UnionId", "EventId", "DurationTime"});
      internal_static_crossMine_com_gzbz_protobuf_S2CR_SetDefNum_12371_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(35);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_SetDefNum_12371_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_S2CR_SetDefNum_12371_descriptor, new String[]{"DefNum"});
      internal_static_crossMine_com_gzbz_protobuf_S2CR_UpdateDefPos_12373_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(36);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_UpdateDefPos_12373_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_S2CR_UpdateDefPos_12373_descriptor, new String[]{"HeroPos"});
      internal_static_crossMine_com_gzbz_protobuf_S2CR_SpecialRedState_12375_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(37);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_SpecialRedState_12375_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_S2CR_SpecialRedState_12375_descriptor, new String[0]);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_GetMineVein_12377_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(38);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_GetMineVein_12377_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_S2CR_GetMineVein_12377_descriptor, new String[]{"Force", "Line", "HillId", "HeroArrayingData"});
      internal_static_crossMine_com_gzbz_protobuf_S2CR_GuanJiaOperate_12379_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(39);
      internal_static_crossMine_com_gzbz_protobuf_S2CR_GuanJiaOperate_12379_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_S2CR_GuanJiaOperate_12379_descriptor, new String[0]);
      internal_static_crossMine_com_gzbz_protobuf_CR2S_GuanJiaOperate_12380_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(40);
      internal_static_crossMine_com_gzbz_protobuf_CR2S_GuanJiaOperate_12380_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_CR2S_GuanJiaOperate_12380_descriptor, new String[]{"Rewards"});
      internal_static_crossMine_com_gzbz_protobuf_CR2S_MergeMine_12382_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(41);
      internal_static_crossMine_com_gzbz_protobuf_CR2S_MergeMine_12382_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMine_com_gzbz_protobuf_CR2S_MergeMine_12382_descriptor, new String[]{"PlayerId"});
      CommonMsg.getDescriptor();
      MineMsg.getDescriptor();
      BattleMsg.getDescriptor();
   }

   public static final class S2CR_PlayerEnter_12301 extends GeneratedMessageV3 implements S2CR_PlayerEnter_12301OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int USEENERGY_FIELD_NUMBER = 1;
      private int useEnergy_;
      public static final int RESUMETIME_FIELD_NUMBER = 2;
      private int resumeTime_;
      public static final int BUYTIME_FIELD_NUMBER = 3;
      private int buyTime_;
      public static final int MYHILLID_FIELD_NUMBER = 4;
      private int myHillId_;
      public static final int MYVEINID_FIELD_NUMBER = 5;
      private int myVeinId_;
      public static final int FALLNUM_FIELD_NUMBER = 6;
      private int fallNum_;
      public static final int REVENGEID_FIELD_NUMBER = 7;
      private int revengeId_;
      public static final int SUPPORTHERO_FIELD_NUMBER = 8;
      private MineMsg.FriendSupportHero supportHero_;
      public static final int FIGHTCOLLTIME_FIELD_NUMBER = 9;
      private int fightCollTime_;
      public static final int ATKHEROPOS_FIELD_NUMBER = 10;
      private int atkHeroPos_;
      public static final int DURATIONTIME_FIELD_NUMBER = 11;
      private int durationTime_;
      public static final int HIGESTOCCUPYMINETYPE_FIELD_NUMBER = 12;
      private int higestOccupyMineType_;
      public static final int EMPLOYNUNOFWEEK_FIELD_NUMBER = 13;
      private int employNunOfWeek_;
      private byte memoizedIsInitialized;
      private static final S2CR_PlayerEnter_12301 DEFAULT_INSTANCE = new S2CR_PlayerEnter_12301();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_PlayerEnter_12301> PARSER = new AbstractParser<S2CR_PlayerEnter_12301>() {
         public S2CR_PlayerEnter_12301 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_PlayerEnter_12301(input, extensionRegistry);
         }
      };

      private S2CR_PlayerEnter_12301(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_PlayerEnter_12301() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_PlayerEnter_12301();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_PlayerEnter_12301(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.useEnergy_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.resumeTime_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.buyTime_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.myHillId_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.myVeinId_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.fallNum_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.revengeId_ = input.readInt32();
                        break;
                     case 66:
                        MineMsg.FriendSupportHero.Builder subBuilder = null;
                        if ((this.bitField0_ & 128) != 0) {
                           subBuilder = this.supportHero_.toBuilder();
                        }

                        this.supportHero_ = (MineMsg.FriendSupportHero)input.readMessage(MineMsg.FriendSupportHero.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.supportHero_);
                           this.supportHero_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 128;
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.fightCollTime_ = input.readInt32();
                        break;
                     case 80:
                        this.bitField0_ |= 512;
                        this.atkHeroPos_ = input.readInt32();
                        break;
                     case 88:
                        this.bitField0_ |= 1024;
                        this.durationTime_ = input.readInt32();
                        break;
                     case 96:
                        this.bitField0_ |= 2048;
                        this.higestOccupyMineType_ = input.readInt32();
                        break;
                     case 104:
                        this.bitField0_ |= 4096;
                        this.employNunOfWeek_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_PlayerEnter_12301_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_PlayerEnter_12301_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerEnter_12301.class, Builder.class);
      }

      public boolean hasUseEnergy() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getUseEnergy() {
         return this.useEnergy_;
      }

      public boolean hasResumeTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getResumeTime() {
         return this.resumeTime_;
      }

      public boolean hasBuyTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getBuyTime() {
         return this.buyTime_;
      }

      public boolean hasMyHillId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getMyHillId() {
         return this.myHillId_;
      }

      public boolean hasMyVeinId() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getMyVeinId() {
         return this.myVeinId_;
      }

      public boolean hasFallNum() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getFallNum() {
         return this.fallNum_;
      }

      public boolean hasRevengeId() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getRevengeId() {
         return this.revengeId_;
      }

      public boolean hasSupportHero() {
         return (this.bitField0_ & 128) != 0;
      }

      public MineMsg.FriendSupportHero getSupportHero() {
         return this.supportHero_ == null ? MineMsg.FriendSupportHero.getDefaultInstance() : this.supportHero_;
      }

      public MineMsg.FriendSupportHeroOrBuilder getSupportHeroOrBuilder() {
         return this.supportHero_ == null ? MineMsg.FriendSupportHero.getDefaultInstance() : this.supportHero_;
      }

      public boolean hasFightCollTime() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getFightCollTime() {
         return this.fightCollTime_;
      }

      public boolean hasAtkHeroPos() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getAtkHeroPos() {
         return this.atkHeroPos_;
      }

      public boolean hasDurationTime() {
         return (this.bitField0_ & 1024) != 0;
      }

      public int getDurationTime() {
         return this.durationTime_;
      }

      public boolean hasHigestOccupyMineType() {
         return (this.bitField0_ & 2048) != 0;
      }

      public int getHigestOccupyMineType() {
         return this.higestOccupyMineType_;
      }

      public boolean hasEmployNunOfWeek() {
         return (this.bitField0_ & 4096) != 0;
      }

      public int getEmployNunOfWeek() {
         return this.employNunOfWeek_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasUseEnergy()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResumeTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuyTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMyHillId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMyVeinId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFallNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRevengeId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFightCollTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAtkHeroPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDurationTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasSupportHero() && !this.getSupportHero().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.useEnergy_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.resumeTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.buyTime_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.myHillId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.myVeinId_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.fallNum_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.revengeId_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeMessage(8, this.getSupportHero());
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.fightCollTime_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(10, this.atkHeroPos_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            output.writeInt32(11, this.durationTime_);
         }

         if ((this.bitField0_ & 2048) != 0) {
            output.writeInt32(12, this.higestOccupyMineType_);
         }

         if ((this.bitField0_ & 4096) != 0) {
            output.writeInt32(13, this.employNunOfWeek_);
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
               size += CodedOutputStream.computeInt32Size(1, this.useEnergy_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.resumeTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.buyTime_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.myHillId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.myVeinId_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.fallNum_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.revengeId_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeMessageSize(8, this.getSupportHero());
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.fightCollTime_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.atkHeroPos_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.durationTime_);
            }

            if ((this.bitField0_ & 2048) != 0) {
               size += CodedOutputStream.computeInt32Size(12, this.higestOccupyMineType_);
            }

            if ((this.bitField0_ & 4096) != 0) {
               size += CodedOutputStream.computeInt32Size(13, this.employNunOfWeek_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_PlayerEnter_12301)) {
            return super.equals(obj);
         } else {
            S2CR_PlayerEnter_12301 other = (S2CR_PlayerEnter_12301)obj;
            if (this.hasUseEnergy() != other.hasUseEnergy()) {
               return false;
            } else if (this.hasUseEnergy() && this.getUseEnergy() != other.getUseEnergy()) {
               return false;
            } else if (this.hasResumeTime() != other.hasResumeTime()) {
               return false;
            } else if (this.hasResumeTime() && this.getResumeTime() != other.getResumeTime()) {
               return false;
            } else if (this.hasBuyTime() != other.hasBuyTime()) {
               return false;
            } else if (this.hasBuyTime() && this.getBuyTime() != other.getBuyTime()) {
               return false;
            } else if (this.hasMyHillId() != other.hasMyHillId()) {
               return false;
            } else if (this.hasMyHillId() && this.getMyHillId() != other.getMyHillId()) {
               return false;
            } else if (this.hasMyVeinId() != other.hasMyVeinId()) {
               return false;
            } else if (this.hasMyVeinId() && this.getMyVeinId() != other.getMyVeinId()) {
               return false;
            } else if (this.hasFallNum() != other.hasFallNum()) {
               return false;
            } else if (this.hasFallNum() && this.getFallNum() != other.getFallNum()) {
               return false;
            } else if (this.hasRevengeId() != other.hasRevengeId()) {
               return false;
            } else if (this.hasRevengeId() && this.getRevengeId() != other.getRevengeId()) {
               return false;
            } else if (this.hasSupportHero() != other.hasSupportHero()) {
               return false;
            } else if (this.hasSupportHero() && !this.getSupportHero().equals(other.getSupportHero())) {
               return false;
            } else if (this.hasFightCollTime() != other.hasFightCollTime()) {
               return false;
            } else if (this.hasFightCollTime() && this.getFightCollTime() != other.getFightCollTime()) {
               return false;
            } else if (this.hasAtkHeroPos() != other.hasAtkHeroPos()) {
               return false;
            } else if (this.hasAtkHeroPos() && this.getAtkHeroPos() != other.getAtkHeroPos()) {
               return false;
            } else if (this.hasDurationTime() != other.hasDurationTime()) {
               return false;
            } else if (this.hasDurationTime() && this.getDurationTime() != other.getDurationTime()) {
               return false;
            } else if (this.hasHigestOccupyMineType() != other.hasHigestOccupyMineType()) {
               return false;
            } else if (this.hasHigestOccupyMineType() && this.getHigestOccupyMineType() != other.getHigestOccupyMineType()) {
               return false;
            } else if (this.hasEmployNunOfWeek() != other.hasEmployNunOfWeek()) {
               return false;
            } else if (this.hasEmployNunOfWeek() && this.getEmployNunOfWeek() != other.getEmployNunOfWeek()) {
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
            if (this.hasUseEnergy()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUseEnergy();
            }

            if (this.hasResumeTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getResumeTime();
            }

            if (this.hasBuyTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBuyTime();
            }

            if (this.hasMyHillId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getMyHillId();
            }

            if (this.hasMyVeinId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getMyVeinId();
            }

            if (this.hasFallNum()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getFallNum();
            }

            if (this.hasRevengeId()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getRevengeId();
            }

            if (this.hasSupportHero()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getSupportHero().hashCode();
            }

            if (this.hasFightCollTime()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getFightCollTime();
            }

            if (this.hasAtkHeroPos()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getAtkHeroPos();
            }

            if (this.hasDurationTime()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getDurationTime();
            }

            if (this.hasHigestOccupyMineType()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getHigestOccupyMineType();
            }

            if (this.hasEmployNunOfWeek()) {
               hash = 37 * hash + 13;
               hash = 53 * hash + this.getEmployNunOfWeek();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_PlayerEnter_12301 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerEnter_12301)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerEnter_12301 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerEnter_12301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerEnter_12301 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerEnter_12301)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerEnter_12301 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerEnter_12301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerEnter_12301 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerEnter_12301)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerEnter_12301 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerEnter_12301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerEnter_12301 parseFrom(InputStream input) throws IOException {
         return (S2CR_PlayerEnter_12301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerEnter_12301 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerEnter_12301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerEnter_12301 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_PlayerEnter_12301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_PlayerEnter_12301 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerEnter_12301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerEnter_12301 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_PlayerEnter_12301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerEnter_12301 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerEnter_12301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_PlayerEnter_12301 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_PlayerEnter_12301 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_PlayerEnter_12301> parser() {
         return PARSER;
      }

      public Parser<S2CR_PlayerEnter_12301> getParserForType() {
         return PARSER;
      }

      public S2CR_PlayerEnter_12301 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_PlayerEnter_12301OrBuilder {
         private int bitField0_;
         private int useEnergy_;
         private int resumeTime_;
         private int buyTime_;
         private int myHillId_;
         private int myVeinId_;
         private int fallNum_;
         private int revengeId_;
         private MineMsg.FriendSupportHero supportHero_;
         private SingleFieldBuilderV3<MineMsg.FriendSupportHero, MineMsg.FriendSupportHero.Builder, MineMsg.FriendSupportHeroOrBuilder> supportHeroBuilder_;
         private int fightCollTime_;
         private int atkHeroPos_;
         private int durationTime_;
         private int higestOccupyMineType_;
         private int employNunOfWeek_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_PlayerEnter_12301_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_PlayerEnter_12301_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerEnter_12301.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.S2CR_PlayerEnter_12301.alwaysUseFieldBuilders) {
               this.getSupportHeroFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.useEnergy_ = 0;
            this.bitField0_ &= -2;
            this.resumeTime_ = 0;
            this.bitField0_ &= -3;
            this.buyTime_ = 0;
            this.bitField0_ &= -5;
            this.myHillId_ = 0;
            this.bitField0_ &= -9;
            this.myVeinId_ = 0;
            this.bitField0_ &= -17;
            this.fallNum_ = 0;
            this.bitField0_ &= -33;
            this.revengeId_ = 0;
            this.bitField0_ &= -65;
            if (this.supportHeroBuilder_ == null) {
               this.supportHero_ = null;
            } else {
               this.supportHeroBuilder_.clear();
            }

            this.bitField0_ &= -129;
            this.fightCollTime_ = 0;
            this.bitField0_ &= -257;
            this.atkHeroPos_ = 0;
            this.bitField0_ &= -513;
            this.durationTime_ = 0;
            this.bitField0_ &= -1025;
            this.higestOccupyMineType_ = 0;
            this.bitField0_ &= -2049;
            this.employNunOfWeek_ = 0;
            this.bitField0_ &= -4097;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_PlayerEnter_12301_descriptor;
         }

         public S2CR_PlayerEnter_12301 getDefaultInstanceForType() {
            return CrossMineMsg.S2CR_PlayerEnter_12301.getDefaultInstance();
         }

         public S2CR_PlayerEnter_12301 build() {
            S2CR_PlayerEnter_12301 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_PlayerEnter_12301 buildPartial() {
            S2CR_PlayerEnter_12301 result = new S2CR_PlayerEnter_12301(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.useEnergy_ = this.useEnergy_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.resumeTime_ = this.resumeTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.buyTime_ = this.buyTime_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.myHillId_ = this.myHillId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.myVeinId_ = this.myVeinId_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.fallNum_ = this.fallNum_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.revengeId_ = this.revengeId_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               if (this.supportHeroBuilder_ == null) {
                  result.supportHero_ = this.supportHero_;
               } else {
                  result.supportHero_ = (MineMsg.FriendSupportHero)this.supportHeroBuilder_.build();
               }

               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.fightCollTime_ = this.fightCollTime_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.atkHeroPos_ = this.atkHeroPos_;
               to_bitField0_ |= 512;
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.durationTime_ = this.durationTime_;
               to_bitField0_ |= 1024;
            }

            if ((from_bitField0_ & 2048) != 0) {
               result.higestOccupyMineType_ = this.higestOccupyMineType_;
               to_bitField0_ |= 2048;
            }

            if ((from_bitField0_ & 4096) != 0) {
               result.employNunOfWeek_ = this.employNunOfWeek_;
               to_bitField0_ |= 4096;
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
            if (other instanceof S2CR_PlayerEnter_12301) {
               return this.mergeFrom((S2CR_PlayerEnter_12301)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_PlayerEnter_12301 other) {
            if (other == CrossMineMsg.S2CR_PlayerEnter_12301.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasUseEnergy()) {
                  this.setUseEnergy(other.getUseEnergy());
               }

               if (other.hasResumeTime()) {
                  this.setResumeTime(other.getResumeTime());
               }

               if (other.hasBuyTime()) {
                  this.setBuyTime(other.getBuyTime());
               }

               if (other.hasMyHillId()) {
                  this.setMyHillId(other.getMyHillId());
               }

               if (other.hasMyVeinId()) {
                  this.setMyVeinId(other.getMyVeinId());
               }

               if (other.hasFallNum()) {
                  this.setFallNum(other.getFallNum());
               }

               if (other.hasRevengeId()) {
                  this.setRevengeId(other.getRevengeId());
               }

               if (other.hasSupportHero()) {
                  this.mergeSupportHero(other.getSupportHero());
               }

               if (other.hasFightCollTime()) {
                  this.setFightCollTime(other.getFightCollTime());
               }

               if (other.hasAtkHeroPos()) {
                  this.setAtkHeroPos(other.getAtkHeroPos());
               }

               if (other.hasDurationTime()) {
                  this.setDurationTime(other.getDurationTime());
               }

               if (other.hasHigestOccupyMineType()) {
                  this.setHigestOccupyMineType(other.getHigestOccupyMineType());
               }

               if (other.hasEmployNunOfWeek()) {
                  this.setEmployNunOfWeek(other.getEmployNunOfWeek());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasUseEnergy()) {
               return false;
            } else if (!this.hasResumeTime()) {
               return false;
            } else if (!this.hasBuyTime()) {
               return false;
            } else if (!this.hasMyHillId()) {
               return false;
            } else if (!this.hasMyVeinId()) {
               return false;
            } else if (!this.hasFallNum()) {
               return false;
            } else if (!this.hasRevengeId()) {
               return false;
            } else if (!this.hasFightCollTime()) {
               return false;
            } else if (!this.hasAtkHeroPos()) {
               return false;
            } else if (!this.hasDurationTime()) {
               return false;
            } else {
               return !this.hasSupportHero() || this.getSupportHero().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_PlayerEnter_12301 parsedMessage = null;

            try {
               parsedMessage = (S2CR_PlayerEnter_12301)CrossMineMsg.S2CR_PlayerEnter_12301.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_PlayerEnter_12301)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasUseEnergy() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getUseEnergy() {
            return this.useEnergy_;
         }

         public Builder setUseEnergy(int value) {
            this.bitField0_ |= 1;
            this.useEnergy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUseEnergy() {
            this.bitField0_ &= -2;
            this.useEnergy_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasResumeTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getResumeTime() {
            return this.resumeTime_;
         }

         public Builder setResumeTime(int value) {
            this.bitField0_ |= 2;
            this.resumeTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResumeTime() {
            this.bitField0_ &= -3;
            this.resumeTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuyTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBuyTime() {
            return this.buyTime_;
         }

         public Builder setBuyTime(int value) {
            this.bitField0_ |= 4;
            this.buyTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyTime() {
            this.bitField0_ &= -5;
            this.buyTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMyHillId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getMyHillId() {
            return this.myHillId_;
         }

         public Builder setMyHillId(int value) {
            this.bitField0_ |= 8;
            this.myHillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMyHillId() {
            this.bitField0_ &= -9;
            this.myHillId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMyVeinId() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getMyVeinId() {
            return this.myVeinId_;
         }

         public Builder setMyVeinId(int value) {
            this.bitField0_ |= 16;
            this.myVeinId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMyVeinId() {
            this.bitField0_ &= -17;
            this.myVeinId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFallNum() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getFallNum() {
            return this.fallNum_;
         }

         public Builder setFallNum(int value) {
            this.bitField0_ |= 32;
            this.fallNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFallNum() {
            this.bitField0_ &= -33;
            this.fallNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRevengeId() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getRevengeId() {
            return this.revengeId_;
         }

         public Builder setRevengeId(int value) {
            this.bitField0_ |= 64;
            this.revengeId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRevengeId() {
            this.bitField0_ &= -65;
            this.revengeId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSupportHero() {
            return (this.bitField0_ & 128) != 0;
         }

         public MineMsg.FriendSupportHero getSupportHero() {
            if (this.supportHeroBuilder_ == null) {
               return this.supportHero_ == null ? MineMsg.FriendSupportHero.getDefaultInstance() : this.supportHero_;
            } else {
               return (MineMsg.FriendSupportHero)this.supportHeroBuilder_.getMessage();
            }
         }

         public Builder setSupportHero(MineMsg.FriendSupportHero value) {
            if (this.supportHeroBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.supportHero_ = value;
               this.onChanged();
            } else {
               this.supportHeroBuilder_.setMessage(value);
            }

            this.bitField0_ |= 128;
            return this;
         }

         public Builder setSupportHero(MineMsg.FriendSupportHero.Builder builderForValue) {
            if (this.supportHeroBuilder_ == null) {
               this.supportHero_ = builderForValue.build();
               this.onChanged();
            } else {
               this.supportHeroBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 128;
            return this;
         }

         public Builder mergeSupportHero(MineMsg.FriendSupportHero value) {
            if (this.supportHeroBuilder_ == null) {
               if ((this.bitField0_ & 128) != 0 && this.supportHero_ != null && this.supportHero_ != MineMsg.FriendSupportHero.getDefaultInstance()) {
                  this.supportHero_ = MineMsg.FriendSupportHero.newBuilder(this.supportHero_).mergeFrom(value).buildPartial();
               } else {
                  this.supportHero_ = value;
               }

               this.onChanged();
            } else {
               this.supportHeroBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 128;
            return this;
         }

         public Builder clearSupportHero() {
            if (this.supportHeroBuilder_ == null) {
               this.supportHero_ = null;
               this.onChanged();
            } else {
               this.supportHeroBuilder_.clear();
            }

            this.bitField0_ &= -129;
            return this;
         }

         public MineMsg.FriendSupportHero.Builder getSupportHeroBuilder() {
            this.bitField0_ |= 128;
            this.onChanged();
            return (MineMsg.FriendSupportHero.Builder)this.getSupportHeroFieldBuilder().getBuilder();
         }

         public MineMsg.FriendSupportHeroOrBuilder getSupportHeroOrBuilder() {
            if (this.supportHeroBuilder_ != null) {
               return (MineMsg.FriendSupportHeroOrBuilder)this.supportHeroBuilder_.getMessageOrBuilder();
            } else {
               return this.supportHero_ == null ? MineMsg.FriendSupportHero.getDefaultInstance() : this.supportHero_;
            }
         }

         private SingleFieldBuilderV3<MineMsg.FriendSupportHero, MineMsg.FriendSupportHero.Builder, MineMsg.FriendSupportHeroOrBuilder> getSupportHeroFieldBuilder() {
            if (this.supportHeroBuilder_ == null) {
               this.supportHeroBuilder_ = new SingleFieldBuilderV3(this.getSupportHero(), this.getParentForChildren(), this.isClean());
               this.supportHero_ = null;
            }

            return this.supportHeroBuilder_;
         }

         public boolean hasFightCollTime() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getFightCollTime() {
            return this.fightCollTime_;
         }

         public Builder setFightCollTime(int value) {
            this.bitField0_ |= 256;
            this.fightCollTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFightCollTime() {
            this.bitField0_ &= -257;
            this.fightCollTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAtkHeroPos() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getAtkHeroPos() {
            return this.atkHeroPos_;
         }

         public Builder setAtkHeroPos(int value) {
            this.bitField0_ |= 512;
            this.atkHeroPos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAtkHeroPos() {
            this.bitField0_ &= -513;
            this.atkHeroPos_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDurationTime() {
            return (this.bitField0_ & 1024) != 0;
         }

         public int getDurationTime() {
            return this.durationTime_;
         }

         public Builder setDurationTime(int value) {
            this.bitField0_ |= 1024;
            this.durationTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDurationTime() {
            this.bitField0_ &= -1025;
            this.durationTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHigestOccupyMineType() {
            return (this.bitField0_ & 2048) != 0;
         }

         public int getHigestOccupyMineType() {
            return this.higestOccupyMineType_;
         }

         public Builder setHigestOccupyMineType(int value) {
            this.bitField0_ |= 2048;
            this.higestOccupyMineType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHigestOccupyMineType() {
            this.bitField0_ &= -2049;
            this.higestOccupyMineType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEmployNunOfWeek() {
            return (this.bitField0_ & 4096) != 0;
         }

         public int getEmployNunOfWeek() {
            return this.employNunOfWeek_;
         }

         public Builder setEmployNunOfWeek(int value) {
            this.bitField0_ |= 4096;
            this.employNunOfWeek_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEmployNunOfWeek() {
            this.bitField0_ &= -4097;
            this.employNunOfWeek_ = 0;
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

   public static final class S2CR_MineInfo_12303 extends GeneratedMessageV3 implements S2CR_MineInfo_12303OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LINE_FIELD_NUMBER = 1;
      private int line_;
      public static final int HILLID_FIELD_NUMBER = 2;
      private int hillId_;
      private byte memoizedIsInitialized;
      private static final S2CR_MineInfo_12303 DEFAULT_INSTANCE = new S2CR_MineInfo_12303();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_MineInfo_12303> PARSER = new AbstractParser<S2CR_MineInfo_12303>() {
         public S2CR_MineInfo_12303 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_MineInfo_12303(input, extensionRegistry);
         }
      };

      private S2CR_MineInfo_12303(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_MineInfo_12303() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_MineInfo_12303();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_MineInfo_12303(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.line_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.hillId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MineInfo_12303_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MineInfo_12303_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MineInfo_12303.class, Builder.class);
      }

      public boolean hasLine() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLine() {
         return this.line_;
      }

      public boolean hasHillId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHillId() {
         return this.hillId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLine()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHillId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.line_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.hillId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.line_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.hillId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_MineInfo_12303)) {
            return super.equals(obj);
         } else {
            S2CR_MineInfo_12303 other = (S2CR_MineInfo_12303)obj;
            if (this.hasLine() != other.hasLine()) {
               return false;
            } else if (this.hasLine() && this.getLine() != other.getLine()) {
               return false;
            } else if (this.hasHillId() != other.hasHillId()) {
               return false;
            } else if (this.hasHillId() && this.getHillId() != other.getHillId()) {
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
            if (this.hasLine()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLine();
            }

            if (this.hasHillId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHillId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_MineInfo_12303 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_MineInfo_12303)PARSER.parseFrom(data);
      }

      public static S2CR_MineInfo_12303 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MineInfo_12303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MineInfo_12303 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_MineInfo_12303)PARSER.parseFrom(data);
      }

      public static S2CR_MineInfo_12303 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MineInfo_12303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MineInfo_12303 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_MineInfo_12303)PARSER.parseFrom(data);
      }

      public static S2CR_MineInfo_12303 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MineInfo_12303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MineInfo_12303 parseFrom(InputStream input) throws IOException {
         return (S2CR_MineInfo_12303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MineInfo_12303 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MineInfo_12303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MineInfo_12303 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_MineInfo_12303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_MineInfo_12303 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MineInfo_12303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MineInfo_12303 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_MineInfo_12303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MineInfo_12303 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MineInfo_12303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_MineInfo_12303 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_MineInfo_12303 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_MineInfo_12303> parser() {
         return PARSER;
      }

      public Parser<S2CR_MineInfo_12303> getParserForType() {
         return PARSER;
      }

      public S2CR_MineInfo_12303 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_MineInfo_12303OrBuilder {
         private int bitField0_;
         private int line_;
         private int hillId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MineInfo_12303_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MineInfo_12303_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MineInfo_12303.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.S2CR_MineInfo_12303.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.line_ = 0;
            this.bitField0_ &= -2;
            this.hillId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MineInfo_12303_descriptor;
         }

         public S2CR_MineInfo_12303 getDefaultInstanceForType() {
            return CrossMineMsg.S2CR_MineInfo_12303.getDefaultInstance();
         }

         public S2CR_MineInfo_12303 build() {
            S2CR_MineInfo_12303 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_MineInfo_12303 buildPartial() {
            S2CR_MineInfo_12303 result = new S2CR_MineInfo_12303(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.line_ = this.line_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.hillId_ = this.hillId_;
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
            if (other instanceof S2CR_MineInfo_12303) {
               return this.mergeFrom((S2CR_MineInfo_12303)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_MineInfo_12303 other) {
            if (other == CrossMineMsg.S2CR_MineInfo_12303.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLine()) {
                  this.setLine(other.getLine());
               }

               if (other.hasHillId()) {
                  this.setHillId(other.getHillId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasLine()) {
               return false;
            } else {
               return this.hasHillId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_MineInfo_12303 parsedMessage = null;

            try {
               parsedMessage = (S2CR_MineInfo_12303)CrossMineMsg.S2CR_MineInfo_12303.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_MineInfo_12303)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLine() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getLine() {
            return this.line_;
         }

         public Builder setLine(int value) {
            this.bitField0_ |= 1;
            this.line_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLine() {
            this.bitField0_ &= -2;
            this.line_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHillId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHillId() {
            return this.hillId_;
         }

         public Builder setHillId(int value) {
            this.bitField0_ |= 2;
            this.hillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHillId() {
            this.bitField0_ &= -3;
            this.hillId_ = 0;
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

   public static final class CR2S_UpdateMineInfo_12306 extends GeneratedMessageV3 implements CR2S_UpdateMineInfo_12306OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MINEVEININFO_FIELD_NUMBER = 1;
      private List<MineMsg.MineVeinInfo> mineVeinInfo_;
      private byte memoizedIsInitialized;
      private static final CR2S_UpdateMineInfo_12306 DEFAULT_INSTANCE = new CR2S_UpdateMineInfo_12306();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UpdateMineInfo_12306> PARSER = new AbstractParser<CR2S_UpdateMineInfo_12306>() {
         public CR2S_UpdateMineInfo_12306 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UpdateMineInfo_12306(input, extensionRegistry);
         }
      };

      private CR2S_UpdateMineInfo_12306(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UpdateMineInfo_12306() {
         this.memoizedIsInitialized = -1;
         this.mineVeinInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UpdateMineInfo_12306();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UpdateMineInfo_12306(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.mineVeinInfo_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.mineVeinInfo_.add(input.readMessage(MineMsg.MineVeinInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.mineVeinInfo_ = Collections.unmodifiableList(this.mineVeinInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateMineInfo_12306_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateMineInfo_12306_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpdateMineInfo_12306.class, Builder.class);
      }

      public List<MineMsg.MineVeinInfo> getMineVeinInfoList() {
         return this.mineVeinInfo_;
      }

      public List<? extends MineMsg.MineVeinInfoOrBuilder> getMineVeinInfoOrBuilderList() {
         return this.mineVeinInfo_;
      }

      public int getMineVeinInfoCount() {
         return this.mineVeinInfo_.size();
      }

      public MineMsg.MineVeinInfo getMineVeinInfo(int index) {
         return (MineMsg.MineVeinInfo)this.mineVeinInfo_.get(index);
      }

      public MineMsg.MineVeinInfoOrBuilder getMineVeinInfoOrBuilder(int index) {
         return (MineMsg.MineVeinInfoOrBuilder)this.mineVeinInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getMineVeinInfoCount(); ++i) {
               if (!this.getMineVeinInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.mineVeinInfo_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.mineVeinInfo_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.mineVeinInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.mineVeinInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_UpdateMineInfo_12306)) {
            return super.equals(obj);
         } else {
            CR2S_UpdateMineInfo_12306 other = (CR2S_UpdateMineInfo_12306)obj;
            if (!this.getMineVeinInfoList().equals(other.getMineVeinInfoList())) {
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
            if (this.getMineVeinInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMineVeinInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_UpdateMineInfo_12306 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateMineInfo_12306)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateMineInfo_12306 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateMineInfo_12306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateMineInfo_12306 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateMineInfo_12306)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateMineInfo_12306 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateMineInfo_12306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateMineInfo_12306 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateMineInfo_12306)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateMineInfo_12306 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateMineInfo_12306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateMineInfo_12306 parseFrom(InputStream input) throws IOException {
         return (CR2S_UpdateMineInfo_12306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpdateMineInfo_12306 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateMineInfo_12306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpdateMineInfo_12306 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UpdateMineInfo_12306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UpdateMineInfo_12306 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateMineInfo_12306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpdateMineInfo_12306 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UpdateMineInfo_12306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpdateMineInfo_12306 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateMineInfo_12306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UpdateMineInfo_12306 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UpdateMineInfo_12306 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UpdateMineInfo_12306> parser() {
         return PARSER;
      }

      public Parser<CR2S_UpdateMineInfo_12306> getParserForType() {
         return PARSER;
      }

      public CR2S_UpdateMineInfo_12306 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UpdateMineInfo_12306OrBuilder {
         private int bitField0_;
         private List<MineMsg.MineVeinInfo> mineVeinInfo_;
         private RepeatedFieldBuilderV3<MineMsg.MineVeinInfo, MineMsg.MineVeinInfo.Builder, MineMsg.MineVeinInfoOrBuilder> mineVeinInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateMineInfo_12306_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateMineInfo_12306_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpdateMineInfo_12306.class, Builder.class);
         }

         private Builder() {
            this.mineVeinInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.mineVeinInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.CR2S_UpdateMineInfo_12306.alwaysUseFieldBuilders) {
               this.getMineVeinInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.mineVeinInfoBuilder_ == null) {
               this.mineVeinInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.mineVeinInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateMineInfo_12306_descriptor;
         }

         public CR2S_UpdateMineInfo_12306 getDefaultInstanceForType() {
            return CrossMineMsg.CR2S_UpdateMineInfo_12306.getDefaultInstance();
         }

         public CR2S_UpdateMineInfo_12306 build() {
            CR2S_UpdateMineInfo_12306 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UpdateMineInfo_12306 buildPartial() {
            CR2S_UpdateMineInfo_12306 result = new CR2S_UpdateMineInfo_12306(this);
            int from_bitField0_ = this.bitField0_;
            if (this.mineVeinInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.mineVeinInfo_ = Collections.unmodifiableList(this.mineVeinInfo_);
                  this.bitField0_ &= -2;
               }

               result.mineVeinInfo_ = this.mineVeinInfo_;
            } else {
               result.mineVeinInfo_ = this.mineVeinInfoBuilder_.build();
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
            if (other instanceof CR2S_UpdateMineInfo_12306) {
               return this.mergeFrom((CR2S_UpdateMineInfo_12306)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UpdateMineInfo_12306 other) {
            if (other == CrossMineMsg.CR2S_UpdateMineInfo_12306.getDefaultInstance()) {
               return this;
            } else {
               if (this.mineVeinInfoBuilder_ == null) {
                  if (!other.mineVeinInfo_.isEmpty()) {
                     if (this.mineVeinInfo_.isEmpty()) {
                        this.mineVeinInfo_ = other.mineVeinInfo_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureMineVeinInfoIsMutable();
                        this.mineVeinInfo_.addAll(other.mineVeinInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.mineVeinInfo_.isEmpty()) {
                  if (this.mineVeinInfoBuilder_.isEmpty()) {
                     this.mineVeinInfoBuilder_.dispose();
                     this.mineVeinInfoBuilder_ = null;
                     this.mineVeinInfo_ = other.mineVeinInfo_;
                     this.bitField0_ &= -2;
                     this.mineVeinInfoBuilder_ = CrossMineMsg.CR2S_UpdateMineInfo_12306.alwaysUseFieldBuilders ? this.getMineVeinInfoFieldBuilder() : null;
                  } else {
                     this.mineVeinInfoBuilder_.addAllMessages(other.mineVeinInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getMineVeinInfoCount(); ++i) {
               if (!this.getMineVeinInfo(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_UpdateMineInfo_12306 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UpdateMineInfo_12306)CrossMineMsg.CR2S_UpdateMineInfo_12306.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UpdateMineInfo_12306)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureMineVeinInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.mineVeinInfo_ = new ArrayList(this.mineVeinInfo_);
               this.bitField0_ |= 1;
            }

         }

         public List<MineMsg.MineVeinInfo> getMineVeinInfoList() {
            return this.mineVeinInfoBuilder_ == null ? Collections.unmodifiableList(this.mineVeinInfo_) : this.mineVeinInfoBuilder_.getMessageList();
         }

         public int getMineVeinInfoCount() {
            return this.mineVeinInfoBuilder_ == null ? this.mineVeinInfo_.size() : this.mineVeinInfoBuilder_.getCount();
         }

         public MineMsg.MineVeinInfo getMineVeinInfo(int index) {
            return this.mineVeinInfoBuilder_ == null ? (MineMsg.MineVeinInfo)this.mineVeinInfo_.get(index) : (MineMsg.MineVeinInfo)this.mineVeinInfoBuilder_.getMessage(index);
         }

         public Builder setMineVeinInfo(int index, MineMsg.MineVeinInfo value) {
            if (this.mineVeinInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMineVeinInfoIsMutable();
               this.mineVeinInfo_.set(index, value);
               this.onChanged();
            } else {
               this.mineVeinInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setMineVeinInfo(int index, MineMsg.MineVeinInfo.Builder builderForValue) {
            if (this.mineVeinInfoBuilder_ == null) {
               this.ensureMineVeinInfoIsMutable();
               this.mineVeinInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.mineVeinInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMineVeinInfo(MineMsg.MineVeinInfo value) {
            if (this.mineVeinInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMineVeinInfoIsMutable();
               this.mineVeinInfo_.add(value);
               this.onChanged();
            } else {
               this.mineVeinInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addMineVeinInfo(int index, MineMsg.MineVeinInfo value) {
            if (this.mineVeinInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMineVeinInfoIsMutable();
               this.mineVeinInfo_.add(index, value);
               this.onChanged();
            } else {
               this.mineVeinInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addMineVeinInfo(MineMsg.MineVeinInfo.Builder builderForValue) {
            if (this.mineVeinInfoBuilder_ == null) {
               this.ensureMineVeinInfoIsMutable();
               this.mineVeinInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.mineVeinInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMineVeinInfo(int index, MineMsg.MineVeinInfo.Builder builderForValue) {
            if (this.mineVeinInfoBuilder_ == null) {
               this.ensureMineVeinInfoIsMutable();
               this.mineVeinInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.mineVeinInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMineVeinInfo(Iterable<? extends MineMsg.MineVeinInfo> values) {
            if (this.mineVeinInfoBuilder_ == null) {
               this.ensureMineVeinInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.mineVeinInfo_);
               this.onChanged();
            } else {
               this.mineVeinInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearMineVeinInfo() {
            if (this.mineVeinInfoBuilder_ == null) {
               this.mineVeinInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.mineVeinInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeMineVeinInfo(int index) {
            if (this.mineVeinInfoBuilder_ == null) {
               this.ensureMineVeinInfoIsMutable();
               this.mineVeinInfo_.remove(index);
               this.onChanged();
            } else {
               this.mineVeinInfoBuilder_.remove(index);
            }

            return this;
         }

         public MineMsg.MineVeinInfo.Builder getMineVeinInfoBuilder(int index) {
            return (MineMsg.MineVeinInfo.Builder)this.getMineVeinInfoFieldBuilder().getBuilder(index);
         }

         public MineMsg.MineVeinInfoOrBuilder getMineVeinInfoOrBuilder(int index) {
            return this.mineVeinInfoBuilder_ == null ? (MineMsg.MineVeinInfoOrBuilder)this.mineVeinInfo_.get(index) : (MineMsg.MineVeinInfoOrBuilder)this.mineVeinInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MineMsg.MineVeinInfoOrBuilder> getMineVeinInfoOrBuilderList() {
            return this.mineVeinInfoBuilder_ != null ? this.mineVeinInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.mineVeinInfo_);
         }

         public MineMsg.MineVeinInfo.Builder addMineVeinInfoBuilder() {
            return (MineMsg.MineVeinInfo.Builder)this.getMineVeinInfoFieldBuilder().addBuilder(MineMsg.MineVeinInfo.getDefaultInstance());
         }

         public MineMsg.MineVeinInfo.Builder addMineVeinInfoBuilder(int index) {
            return (MineMsg.MineVeinInfo.Builder)this.getMineVeinInfoFieldBuilder().addBuilder(index, MineMsg.MineVeinInfo.getDefaultInstance());
         }

         public List<MineMsg.MineVeinInfo.Builder> getMineVeinInfoBuilderList() {
            return this.getMineVeinInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MineMsg.MineVeinInfo, MineMsg.MineVeinInfo.Builder, MineMsg.MineVeinInfoOrBuilder> getMineVeinInfoFieldBuilder() {
            if (this.mineVeinInfoBuilder_ == null) {
               this.mineVeinInfoBuilder_ = new RepeatedFieldBuilderV3(this.mineVeinInfo_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.mineVeinInfo_ = null;
            }

            return this.mineVeinInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_RewardPreview_12309 extends GeneratedMessageV3 implements S2CR_RewardPreview_12309OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_RewardPreview_12309 DEFAULT_INSTANCE = new S2CR_RewardPreview_12309();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_RewardPreview_12309> PARSER = new AbstractParser<S2CR_RewardPreview_12309>() {
         public S2CR_RewardPreview_12309 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_RewardPreview_12309(input, extensionRegistry);
         }
      };

      private S2CR_RewardPreview_12309(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_RewardPreview_12309() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_RewardPreview_12309();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_RewardPreview_12309(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_RewardPreview_12309_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_RewardPreview_12309_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_RewardPreview_12309.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_RewardPreview_12309)) {
            return super.equals(obj);
         } else {
            S2CR_RewardPreview_12309 other = (S2CR_RewardPreview_12309)obj;
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

      public static S2CR_RewardPreview_12309 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_RewardPreview_12309)PARSER.parseFrom(data);
      }

      public static S2CR_RewardPreview_12309 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RewardPreview_12309)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RewardPreview_12309 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_RewardPreview_12309)PARSER.parseFrom(data);
      }

      public static S2CR_RewardPreview_12309 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RewardPreview_12309)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RewardPreview_12309 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_RewardPreview_12309)PARSER.parseFrom(data);
      }

      public static S2CR_RewardPreview_12309 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RewardPreview_12309)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RewardPreview_12309 parseFrom(InputStream input) throws IOException {
         return (S2CR_RewardPreview_12309)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_RewardPreview_12309 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RewardPreview_12309)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_RewardPreview_12309 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_RewardPreview_12309)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_RewardPreview_12309 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RewardPreview_12309)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_RewardPreview_12309 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_RewardPreview_12309)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_RewardPreview_12309 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RewardPreview_12309)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_RewardPreview_12309 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_RewardPreview_12309 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_RewardPreview_12309> parser() {
         return PARSER;
      }

      public Parser<S2CR_RewardPreview_12309> getParserForType() {
         return PARSER;
      }

      public S2CR_RewardPreview_12309 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_RewardPreview_12309OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_RewardPreview_12309_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_RewardPreview_12309_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_RewardPreview_12309.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.S2CR_RewardPreview_12309.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_RewardPreview_12309_descriptor;
         }

         public S2CR_RewardPreview_12309 getDefaultInstanceForType() {
            return CrossMineMsg.S2CR_RewardPreview_12309.getDefaultInstance();
         }

         public S2CR_RewardPreview_12309 build() {
            S2CR_RewardPreview_12309 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_RewardPreview_12309 buildPartial() {
            S2CR_RewardPreview_12309 result = new S2CR_RewardPreview_12309(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_RewardPreview_12309) {
               return this.mergeFrom((S2CR_RewardPreview_12309)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_RewardPreview_12309 other) {
            if (other == CrossMineMsg.S2CR_RewardPreview_12309.getDefaultInstance()) {
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
            S2CR_RewardPreview_12309 parsedMessage = null;

            try {
               parsedMessage = (S2CR_RewardPreview_12309)CrossMineMsg.S2CR_RewardPreview_12309.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_RewardPreview_12309)e.getUnfinishedMessage();
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

   public static final class S2CR_GetMineRewards_12311 extends GeneratedMessageV3 implements S2CR_GetMineRewards_12311OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_GetMineRewards_12311 DEFAULT_INSTANCE = new S2CR_GetMineRewards_12311();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_GetMineRewards_12311> PARSER = new AbstractParser<S2CR_GetMineRewards_12311>() {
         public S2CR_GetMineRewards_12311 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_GetMineRewards_12311(input, extensionRegistry);
         }
      };

      private S2CR_GetMineRewards_12311(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_GetMineRewards_12311() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_GetMineRewards_12311();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_GetMineRewards_12311(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_GetMineRewards_12311_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_GetMineRewards_12311_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GetMineRewards_12311.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_GetMineRewards_12311)) {
            return super.equals(obj);
         } else {
            S2CR_GetMineRewards_12311 other = (S2CR_GetMineRewards_12311)obj;
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

      public static S2CR_GetMineRewards_12311 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_GetMineRewards_12311)PARSER.parseFrom(data);
      }

      public static S2CR_GetMineRewards_12311 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GetMineRewards_12311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GetMineRewards_12311 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_GetMineRewards_12311)PARSER.parseFrom(data);
      }

      public static S2CR_GetMineRewards_12311 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GetMineRewards_12311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GetMineRewards_12311 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_GetMineRewards_12311)PARSER.parseFrom(data);
      }

      public static S2CR_GetMineRewards_12311 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GetMineRewards_12311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GetMineRewards_12311 parseFrom(InputStream input) throws IOException {
         return (S2CR_GetMineRewards_12311)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GetMineRewards_12311 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GetMineRewards_12311)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GetMineRewards_12311 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_GetMineRewards_12311)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_GetMineRewards_12311 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GetMineRewards_12311)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GetMineRewards_12311 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_GetMineRewards_12311)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GetMineRewards_12311 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GetMineRewards_12311)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_GetMineRewards_12311 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_GetMineRewards_12311 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_GetMineRewards_12311> parser() {
         return PARSER;
      }

      public Parser<S2CR_GetMineRewards_12311> getParserForType() {
         return PARSER;
      }

      public S2CR_GetMineRewards_12311 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_GetMineRewards_12311OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_GetMineRewards_12311_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_GetMineRewards_12311_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GetMineRewards_12311.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.S2CR_GetMineRewards_12311.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_GetMineRewards_12311_descriptor;
         }

         public S2CR_GetMineRewards_12311 getDefaultInstanceForType() {
            return CrossMineMsg.S2CR_GetMineRewards_12311.getDefaultInstance();
         }

         public S2CR_GetMineRewards_12311 build() {
            S2CR_GetMineRewards_12311 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_GetMineRewards_12311 buildPartial() {
            S2CR_GetMineRewards_12311 result = new S2CR_GetMineRewards_12311(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_GetMineRewards_12311) {
               return this.mergeFrom((S2CR_GetMineRewards_12311)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_GetMineRewards_12311 other) {
            if (other == CrossMineMsg.S2CR_GetMineRewards_12311.getDefaultInstance()) {
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
            S2CR_GetMineRewards_12311 parsedMessage = null;

            try {
               parsedMessage = (S2CR_GetMineRewards_12311)CrossMineMsg.S2CR_GetMineRewards_12311.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_GetMineRewards_12311)e.getUnfinishedMessage();
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

   public static final class CR2S_GetMineRewards_12312 extends GeneratedMessageV3 implements CR2S_GetMineRewards_12312OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDS_FIELD_NUMBER = 1;
      private List<CommonMsg.ItemInfo> rewards_;
      public static final int DURATIONTIME_FIELD_NUMBER = 2;
      private int durationTime_;
      private byte memoizedIsInitialized;
      private static final CR2S_GetMineRewards_12312 DEFAULT_INSTANCE = new CR2S_GetMineRewards_12312();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_GetMineRewards_12312> PARSER = new AbstractParser<CR2S_GetMineRewards_12312>() {
         public CR2S_GetMineRewards_12312 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_GetMineRewards_12312(input, extensionRegistry);
         }
      };

      private CR2S_GetMineRewards_12312(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_GetMineRewards_12312() {
         this.memoizedIsInitialized = -1;
         this.rewards_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_GetMineRewards_12312();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_GetMineRewards_12312(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.rewards_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.rewards_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.durationTime_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.rewards_ = Collections.unmodifiableList(this.rewards_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_GetMineRewards_12312_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_GetMineRewards_12312_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_GetMineRewards_12312.class, Builder.class);
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

      public boolean hasDurationTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDurationTime() {
         return this.durationTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDurationTime()) {
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
         for(int i = 0; i < this.rewards_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.rewards_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.durationTime_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.rewards_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.rewards_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.durationTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_GetMineRewards_12312)) {
            return super.equals(obj);
         } else {
            CR2S_GetMineRewards_12312 other = (CR2S_GetMineRewards_12312)obj;
            if (!this.getRewardsList().equals(other.getRewardsList())) {
               return false;
            } else if (this.hasDurationTime() != other.hasDurationTime()) {
               return false;
            } else if (this.hasDurationTime() && this.getDurationTime() != other.getDurationTime()) {
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
            if (this.getRewardsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRewardsList().hashCode();
            }

            if (this.hasDurationTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDurationTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_GetMineRewards_12312 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_GetMineRewards_12312)PARSER.parseFrom(data);
      }

      public static CR2S_GetMineRewards_12312 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GetMineRewards_12312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GetMineRewards_12312 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_GetMineRewards_12312)PARSER.parseFrom(data);
      }

      public static CR2S_GetMineRewards_12312 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GetMineRewards_12312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GetMineRewards_12312 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_GetMineRewards_12312)PARSER.parseFrom(data);
      }

      public static CR2S_GetMineRewards_12312 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GetMineRewards_12312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GetMineRewards_12312 parseFrom(InputStream input) throws IOException {
         return (CR2S_GetMineRewards_12312)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_GetMineRewards_12312 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GetMineRewards_12312)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_GetMineRewards_12312 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_GetMineRewards_12312)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_GetMineRewards_12312 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GetMineRewards_12312)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_GetMineRewards_12312 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_GetMineRewards_12312)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_GetMineRewards_12312 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GetMineRewards_12312)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_GetMineRewards_12312 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_GetMineRewards_12312 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_GetMineRewards_12312> parser() {
         return PARSER;
      }

      public Parser<CR2S_GetMineRewards_12312> getParserForType() {
         return PARSER;
      }

      public CR2S_GetMineRewards_12312 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_GetMineRewards_12312OrBuilder {
         private int bitField0_;
         private List<CommonMsg.ItemInfo> rewards_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> rewardsBuilder_;
         private int durationTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_GetMineRewards_12312_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_GetMineRewards_12312_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_GetMineRewards_12312.class, Builder.class);
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
            if (CrossMineMsg.CR2S_GetMineRewards_12312.alwaysUseFieldBuilders) {
               this.getRewardsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.rewardsBuilder_ == null) {
               this.rewards_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.rewardsBuilder_.clear();
            }

            this.durationTime_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_GetMineRewards_12312_descriptor;
         }

         public CR2S_GetMineRewards_12312 getDefaultInstanceForType() {
            return CrossMineMsg.CR2S_GetMineRewards_12312.getDefaultInstance();
         }

         public CR2S_GetMineRewards_12312 build() {
            CR2S_GetMineRewards_12312 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_GetMineRewards_12312 buildPartial() {
            CR2S_GetMineRewards_12312 result = new CR2S_GetMineRewards_12312(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.rewardsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.rewards_ = Collections.unmodifiableList(this.rewards_);
                  this.bitField0_ &= -2;
               }

               result.rewards_ = this.rewards_;
            } else {
               result.rewards_ = this.rewardsBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               result.durationTime_ = this.durationTime_;
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
            if (other instanceof CR2S_GetMineRewards_12312) {
               return this.mergeFrom((CR2S_GetMineRewards_12312)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_GetMineRewards_12312 other) {
            if (other == CrossMineMsg.CR2S_GetMineRewards_12312.getDefaultInstance()) {
               return this;
            } else {
               if (this.rewardsBuilder_ == null) {
                  if (!other.rewards_.isEmpty()) {
                     if (this.rewards_.isEmpty()) {
                        this.rewards_ = other.rewards_;
                        this.bitField0_ &= -2;
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
                     this.bitField0_ &= -2;
                     this.rewardsBuilder_ = CrossMineMsg.CR2S_GetMineRewards_12312.alwaysUseFieldBuilders ? this.getRewardsFieldBuilder() : null;
                  } else {
                     this.rewardsBuilder_.addAllMessages(other.rewards_);
                  }
               }

               if (other.hasDurationTime()) {
                  this.setDurationTime(other.getDurationTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDurationTime()) {
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
            CR2S_GetMineRewards_12312 parsedMessage = null;

            try {
               parsedMessage = (CR2S_GetMineRewards_12312)CrossMineMsg.CR2S_GetMineRewards_12312.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_GetMineRewards_12312)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRewardsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.rewards_ = new ArrayList(this.rewards_);
               this.bitField0_ |= 1;
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
               this.bitField0_ &= -2;
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
               this.rewardsBuilder_ = new RepeatedFieldBuilderV3(this.rewards_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.rewards_ = null;
            }

            return this.rewardsBuilder_;
         }

         public boolean hasDurationTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDurationTime() {
            return this.durationTime_;
         }

         public Builder setDurationTime(int value) {
            this.bitField0_ |= 2;
            this.durationTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDurationTime() {
            this.bitField0_ &= -3;
            this.durationTime_ = 0;
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

   public static final class S2CR_MyMineInfo_12315 extends GeneratedMessageV3 implements S2CR_MyMineInfo_12315OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LINE_FIELD_NUMBER = 1;
      private int line_;
      public static final int HILLID_FIELD_NUMBER = 2;
      private int hillId_;
      public static final int VEINID_FIELD_NUMBER = 3;
      private int veinId_;
      public static final int FALLNUM_FIELD_NUMBER = 4;
      private int fallNum_;
      public static final int REVENGEID_FIELD_NUMBER = 5;
      private int revengeId_;
      public static final int DURATIONTIME_FIELD_NUMBER = 6;
      private int durationTime_;
      private byte memoizedIsInitialized;
      private static final S2CR_MyMineInfo_12315 DEFAULT_INSTANCE = new S2CR_MyMineInfo_12315();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_MyMineInfo_12315> PARSER = new AbstractParser<S2CR_MyMineInfo_12315>() {
         public S2CR_MyMineInfo_12315 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_MyMineInfo_12315(input, extensionRegistry);
         }
      };

      private S2CR_MyMineInfo_12315(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_MyMineInfo_12315() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_MyMineInfo_12315();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_MyMineInfo_12315(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.line_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.hillId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.veinId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.fallNum_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.revengeId_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.durationTime_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MyMineInfo_12315_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MyMineInfo_12315_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MyMineInfo_12315.class, Builder.class);
      }

      public boolean hasLine() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLine() {
         return this.line_;
      }

      public boolean hasHillId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHillId() {
         return this.hillId_;
      }

      public boolean hasVeinId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getVeinId() {
         return this.veinId_;
      }

      public boolean hasFallNum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getFallNum() {
         return this.fallNum_;
      }

      public boolean hasRevengeId() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getRevengeId() {
         return this.revengeId_;
      }

      public boolean hasDurationTime() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getDurationTime() {
         return this.durationTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLine()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHillId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasVeinId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFallNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRevengeId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDurationTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.line_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.hillId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.veinId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.fallNum_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.revengeId_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.durationTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.line_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.hillId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.veinId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.fallNum_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.revengeId_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.durationTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_MyMineInfo_12315)) {
            return super.equals(obj);
         } else {
            S2CR_MyMineInfo_12315 other = (S2CR_MyMineInfo_12315)obj;
            if (this.hasLine() != other.hasLine()) {
               return false;
            } else if (this.hasLine() && this.getLine() != other.getLine()) {
               return false;
            } else if (this.hasHillId() != other.hasHillId()) {
               return false;
            } else if (this.hasHillId() && this.getHillId() != other.getHillId()) {
               return false;
            } else if (this.hasVeinId() != other.hasVeinId()) {
               return false;
            } else if (this.hasVeinId() && this.getVeinId() != other.getVeinId()) {
               return false;
            } else if (this.hasFallNum() != other.hasFallNum()) {
               return false;
            } else if (this.hasFallNum() && this.getFallNum() != other.getFallNum()) {
               return false;
            } else if (this.hasRevengeId() != other.hasRevengeId()) {
               return false;
            } else if (this.hasRevengeId() && this.getRevengeId() != other.getRevengeId()) {
               return false;
            } else if (this.hasDurationTime() != other.hasDurationTime()) {
               return false;
            } else if (this.hasDurationTime() && this.getDurationTime() != other.getDurationTime()) {
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
            if (this.hasLine()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLine();
            }

            if (this.hasHillId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHillId();
            }

            if (this.hasVeinId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getVeinId();
            }

            if (this.hasFallNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getFallNum();
            }

            if (this.hasRevengeId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getRevengeId();
            }

            if (this.hasDurationTime()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getDurationTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_MyMineInfo_12315 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_MyMineInfo_12315)PARSER.parseFrom(data);
      }

      public static S2CR_MyMineInfo_12315 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MyMineInfo_12315)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MyMineInfo_12315 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_MyMineInfo_12315)PARSER.parseFrom(data);
      }

      public static S2CR_MyMineInfo_12315 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MyMineInfo_12315)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MyMineInfo_12315 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_MyMineInfo_12315)PARSER.parseFrom(data);
      }

      public static S2CR_MyMineInfo_12315 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MyMineInfo_12315)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MyMineInfo_12315 parseFrom(InputStream input) throws IOException {
         return (S2CR_MyMineInfo_12315)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MyMineInfo_12315 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MyMineInfo_12315)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MyMineInfo_12315 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_MyMineInfo_12315)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_MyMineInfo_12315 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MyMineInfo_12315)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MyMineInfo_12315 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_MyMineInfo_12315)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MyMineInfo_12315 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MyMineInfo_12315)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_MyMineInfo_12315 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_MyMineInfo_12315 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_MyMineInfo_12315> parser() {
         return PARSER;
      }

      public Parser<S2CR_MyMineInfo_12315> getParserForType() {
         return PARSER;
      }

      public S2CR_MyMineInfo_12315 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_MyMineInfo_12315OrBuilder {
         private int bitField0_;
         private int line_;
         private int hillId_;
         private int veinId_;
         private int fallNum_;
         private int revengeId_;
         private int durationTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MyMineInfo_12315_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MyMineInfo_12315_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MyMineInfo_12315.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.S2CR_MyMineInfo_12315.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.line_ = 0;
            this.bitField0_ &= -2;
            this.hillId_ = 0;
            this.bitField0_ &= -3;
            this.veinId_ = 0;
            this.bitField0_ &= -5;
            this.fallNum_ = 0;
            this.bitField0_ &= -9;
            this.revengeId_ = 0;
            this.bitField0_ &= -17;
            this.durationTime_ = 0;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MyMineInfo_12315_descriptor;
         }

         public S2CR_MyMineInfo_12315 getDefaultInstanceForType() {
            return CrossMineMsg.S2CR_MyMineInfo_12315.getDefaultInstance();
         }

         public S2CR_MyMineInfo_12315 build() {
            S2CR_MyMineInfo_12315 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_MyMineInfo_12315 buildPartial() {
            S2CR_MyMineInfo_12315 result = new S2CR_MyMineInfo_12315(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.line_ = this.line_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.hillId_ = this.hillId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.veinId_ = this.veinId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.fallNum_ = this.fallNum_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.revengeId_ = this.revengeId_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.durationTime_ = this.durationTime_;
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
            if (other instanceof S2CR_MyMineInfo_12315) {
               return this.mergeFrom((S2CR_MyMineInfo_12315)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_MyMineInfo_12315 other) {
            if (other == CrossMineMsg.S2CR_MyMineInfo_12315.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLine()) {
                  this.setLine(other.getLine());
               }

               if (other.hasHillId()) {
                  this.setHillId(other.getHillId());
               }

               if (other.hasVeinId()) {
                  this.setVeinId(other.getVeinId());
               }

               if (other.hasFallNum()) {
                  this.setFallNum(other.getFallNum());
               }

               if (other.hasRevengeId()) {
                  this.setRevengeId(other.getRevengeId());
               }

               if (other.hasDurationTime()) {
                  this.setDurationTime(other.getDurationTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasLine()) {
               return false;
            } else if (!this.hasHillId()) {
               return false;
            } else if (!this.hasVeinId()) {
               return false;
            } else if (!this.hasFallNum()) {
               return false;
            } else if (!this.hasRevengeId()) {
               return false;
            } else {
               return this.hasDurationTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_MyMineInfo_12315 parsedMessage = null;

            try {
               parsedMessage = (S2CR_MyMineInfo_12315)CrossMineMsg.S2CR_MyMineInfo_12315.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_MyMineInfo_12315)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLine() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getLine() {
            return this.line_;
         }

         public Builder setLine(int value) {
            this.bitField0_ |= 1;
            this.line_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLine() {
            this.bitField0_ &= -2;
            this.line_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHillId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHillId() {
            return this.hillId_;
         }

         public Builder setHillId(int value) {
            this.bitField0_ |= 2;
            this.hillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHillId() {
            this.bitField0_ &= -3;
            this.hillId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasVeinId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getVeinId() {
            return this.veinId_;
         }

         public Builder setVeinId(int value) {
            this.bitField0_ |= 4;
            this.veinId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearVeinId() {
            this.bitField0_ &= -5;
            this.veinId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFallNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getFallNum() {
            return this.fallNum_;
         }

         public Builder setFallNum(int value) {
            this.bitField0_ |= 8;
            this.fallNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFallNum() {
            this.bitField0_ &= -9;
            this.fallNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRevengeId() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getRevengeId() {
            return this.revengeId_;
         }

         public Builder setRevengeId(int value) {
            this.bitField0_ |= 16;
            this.revengeId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRevengeId() {
            this.bitField0_ &= -17;
            this.revengeId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDurationTime() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getDurationTime() {
            return this.durationTime_;
         }

         public Builder setDurationTime(int value) {
            this.bitField0_ |= 32;
            this.durationTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDurationTime() {
            this.bitField0_ &= -33;
            this.durationTime_ = 0;
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

   public static final class S2CR_MineDetail_12319 extends GeneratedMessageV3 implements S2CR_MineDetail_12319OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LINE_FIELD_NUMBER = 1;
      private int line_;
      public static final int HILLID_FIELD_NUMBER = 2;
      private int hillId_;
      public static final int VEINID_FIELD_NUMBER = 3;
      private int veinId_;
      public static final int FIGHT_FIELD_NUMBER = 4;
      private long fight_;
      private byte memoizedIsInitialized;
      private static final S2CR_MineDetail_12319 DEFAULT_INSTANCE = new S2CR_MineDetail_12319();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_MineDetail_12319> PARSER = new AbstractParser<S2CR_MineDetail_12319>() {
         public S2CR_MineDetail_12319 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_MineDetail_12319(input, extensionRegistry);
         }
      };

      private S2CR_MineDetail_12319(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_MineDetail_12319() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_MineDetail_12319();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_MineDetail_12319(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.line_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.hillId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.veinId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.fight_ = input.readInt64();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MineDetail_12319_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MineDetail_12319_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MineDetail_12319.class, Builder.class);
      }

      public boolean hasLine() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLine() {
         return this.line_;
      }

      public boolean hasHillId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHillId() {
         return this.hillId_;
      }

      public boolean hasVeinId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getVeinId() {
         return this.veinId_;
      }

      public boolean hasFight() {
         return (this.bitField0_ & 8) != 0;
      }

      public long getFight() {
         return this.fight_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLine()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHillId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasVeinId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFight()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.line_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.hillId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.veinId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt64(4, this.fight_);
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
               size += CodedOutputStream.computeInt32Size(1, this.line_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.hillId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.veinId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt64Size(4, this.fight_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_MineDetail_12319)) {
            return super.equals(obj);
         } else {
            S2CR_MineDetail_12319 other = (S2CR_MineDetail_12319)obj;
            if (this.hasLine() != other.hasLine()) {
               return false;
            } else if (this.hasLine() && this.getLine() != other.getLine()) {
               return false;
            } else if (this.hasHillId() != other.hasHillId()) {
               return false;
            } else if (this.hasHillId() && this.getHillId() != other.getHillId()) {
               return false;
            } else if (this.hasVeinId() != other.hasVeinId()) {
               return false;
            } else if (this.hasVeinId() && this.getVeinId() != other.getVeinId()) {
               return false;
            } else if (this.hasFight() != other.hasFight()) {
               return false;
            } else if (this.hasFight() && this.getFight() != other.getFight()) {
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
            if (this.hasLine()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLine();
            }

            if (this.hasHillId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHillId();
            }

            if (this.hasVeinId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getVeinId();
            }

            if (this.hasFight()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashLong(this.getFight());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_MineDetail_12319 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_MineDetail_12319)PARSER.parseFrom(data);
      }

      public static S2CR_MineDetail_12319 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MineDetail_12319)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MineDetail_12319 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_MineDetail_12319)PARSER.parseFrom(data);
      }

      public static S2CR_MineDetail_12319 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MineDetail_12319)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MineDetail_12319 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_MineDetail_12319)PARSER.parseFrom(data);
      }

      public static S2CR_MineDetail_12319 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MineDetail_12319)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MineDetail_12319 parseFrom(InputStream input) throws IOException {
         return (S2CR_MineDetail_12319)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MineDetail_12319 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MineDetail_12319)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MineDetail_12319 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_MineDetail_12319)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_MineDetail_12319 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MineDetail_12319)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MineDetail_12319 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_MineDetail_12319)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MineDetail_12319 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MineDetail_12319)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_MineDetail_12319 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_MineDetail_12319 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_MineDetail_12319> parser() {
         return PARSER;
      }

      public Parser<S2CR_MineDetail_12319> getParserForType() {
         return PARSER;
      }

      public S2CR_MineDetail_12319 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_MineDetail_12319OrBuilder {
         private int bitField0_;
         private int line_;
         private int hillId_;
         private int veinId_;
         private long fight_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MineDetail_12319_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MineDetail_12319_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MineDetail_12319.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.S2CR_MineDetail_12319.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.line_ = 0;
            this.bitField0_ &= -2;
            this.hillId_ = 0;
            this.bitField0_ &= -3;
            this.veinId_ = 0;
            this.bitField0_ &= -5;
            this.fight_ = 0L;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MineDetail_12319_descriptor;
         }

         public S2CR_MineDetail_12319 getDefaultInstanceForType() {
            return CrossMineMsg.S2CR_MineDetail_12319.getDefaultInstance();
         }

         public S2CR_MineDetail_12319 build() {
            S2CR_MineDetail_12319 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_MineDetail_12319 buildPartial() {
            S2CR_MineDetail_12319 result = new S2CR_MineDetail_12319(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.line_ = this.line_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.hillId_ = this.hillId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.veinId_ = this.veinId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.fight_ = this.fight_;
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
            if (other instanceof S2CR_MineDetail_12319) {
               return this.mergeFrom((S2CR_MineDetail_12319)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_MineDetail_12319 other) {
            if (other == CrossMineMsg.S2CR_MineDetail_12319.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLine()) {
                  this.setLine(other.getLine());
               }

               if (other.hasHillId()) {
                  this.setHillId(other.getHillId());
               }

               if (other.hasVeinId()) {
                  this.setVeinId(other.getVeinId());
               }

               if (other.hasFight()) {
                  this.setFight(other.getFight());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasLine()) {
               return false;
            } else if (!this.hasHillId()) {
               return false;
            } else if (!this.hasVeinId()) {
               return false;
            } else {
               return this.hasFight();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_MineDetail_12319 parsedMessage = null;

            try {
               parsedMessage = (S2CR_MineDetail_12319)CrossMineMsg.S2CR_MineDetail_12319.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_MineDetail_12319)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLine() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getLine() {
            return this.line_;
         }

         public Builder setLine(int value) {
            this.bitField0_ |= 1;
            this.line_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLine() {
            this.bitField0_ &= -2;
            this.line_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHillId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHillId() {
            return this.hillId_;
         }

         public Builder setHillId(int value) {
            this.bitField0_ |= 2;
            this.hillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHillId() {
            this.bitField0_ &= -3;
            this.hillId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasVeinId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getVeinId() {
            return this.veinId_;
         }

         public Builder setVeinId(int value) {
            this.bitField0_ |= 4;
            this.veinId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearVeinId() {
            this.bitField0_ &= -5;
            this.veinId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFight() {
            return (this.bitField0_ & 8) != 0;
         }

         public long getFight() {
            return this.fight_;
         }

         public Builder setFight(long value) {
            this.bitField0_ |= 8;
            this.fight_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFight() {
            this.bitField0_ &= -9;
            this.fight_ = 0L;
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

   public static final class S2CR_ATK_12321 extends GeneratedMessageV3 implements S2CR_ATK_12321OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ATKTYPE_FIELD_NUMBER = 1;
      private int atkType_;
      public static final int LINE_FIELD_NUMBER = 2;
      private int line_;
      public static final int HILLID_FIELD_NUMBER = 3;
      private int hillId_;
      public static final int MINEVEINID_FIELD_NUMBER = 4;
      private int mineVeinId_;
      public static final int HEROARRAYINGDATA_FIELD_NUMBER = 5;
      private ByteString heroArrayingData_;
      public static final int HEROMIRROR_FIELD_NUMBER = 6;
      private ByteString heroMirror_;
      public static final int HEROPOS_FIELD_NUMBER = 7;
      private int heroPos_;
      public static final int REVENGEID_FIELD_NUMBER = 8;
      private int revengeId_;
      public static final int CURENERGY_FIELD_NUMBER = 9;
      private int curEnergy_;
      public static final int HIGESTMINETYPE_FIELD_NUMBER = 10;
      private int higestMineType_;
      public static final int ATKWITHEMPLOYNUM_FIELD_NUMBER = 11;
      private int atkWithEmployNum_;
      private byte memoizedIsInitialized;
      private static final S2CR_ATK_12321 DEFAULT_INSTANCE = new S2CR_ATK_12321();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_ATK_12321> PARSER = new AbstractParser<S2CR_ATK_12321>() {
         public S2CR_ATK_12321 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_ATK_12321(input, extensionRegistry);
         }
      };

      private S2CR_ATK_12321(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_ATK_12321() {
         this.memoizedIsInitialized = -1;
         this.heroArrayingData_ = ByteString.EMPTY;
         this.heroMirror_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_ATK_12321();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_ATK_12321(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.atkType_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.line_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.hillId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.mineVeinId_ = input.readInt32();
                        break;
                     case 42:
                        this.bitField0_ |= 16;
                        this.heroArrayingData_ = input.readBytes();
                        break;
                     case 50:
                        this.bitField0_ |= 32;
                        this.heroMirror_ = input.readBytes();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.heroPos_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.revengeId_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.curEnergy_ = input.readInt32();
                        break;
                     case 80:
                        this.bitField0_ |= 512;
                        this.higestMineType_ = input.readInt32();
                        break;
                     case 88:
                        this.bitField0_ |= 1024;
                        this.atkWithEmployNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_ATK_12321_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_ATK_12321_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ATK_12321.class, Builder.class);
      }

      public boolean hasAtkType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getAtkType() {
         return this.atkType_;
      }

      public boolean hasLine() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLine() {
         return this.line_;
      }

      public boolean hasHillId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHillId() {
         return this.hillId_;
      }

      public boolean hasMineVeinId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getMineVeinId() {
         return this.mineVeinId_;
      }

      public boolean hasHeroArrayingData() {
         return (this.bitField0_ & 16) != 0;
      }

      public ByteString getHeroArrayingData() {
         return this.heroArrayingData_;
      }

      public boolean hasHeroMirror() {
         return (this.bitField0_ & 32) != 0;
      }

      public ByteString getHeroMirror() {
         return this.heroMirror_;
      }

      public boolean hasHeroPos() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getHeroPos() {
         return this.heroPos_;
      }

      public boolean hasRevengeId() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getRevengeId() {
         return this.revengeId_;
      }

      public boolean hasCurEnergy() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getCurEnergy() {
         return this.curEnergy_;
      }

      public boolean hasHigestMineType() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getHigestMineType() {
         return this.higestMineType_;
      }

      public boolean hasAtkWithEmployNum() {
         return (this.bitField0_ & 1024) != 0;
      }

      public int getAtkWithEmployNum() {
         return this.atkWithEmployNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasAtkType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLine()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHillId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroArrayingData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.atkType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.line_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.hillId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.mineVeinId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeBytes(5, this.heroArrayingData_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeBytes(6, this.heroMirror_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.heroPos_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.revengeId_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.curEnergy_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(10, this.higestMineType_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            output.writeInt32(11, this.atkWithEmployNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.atkType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.line_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.hillId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.mineVeinId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeBytesSize(5, this.heroArrayingData_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeBytesSize(6, this.heroMirror_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.heroPos_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.revengeId_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.curEnergy_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.higestMineType_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.atkWithEmployNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_ATK_12321)) {
            return super.equals(obj);
         } else {
            S2CR_ATK_12321 other = (S2CR_ATK_12321)obj;
            if (this.hasAtkType() != other.hasAtkType()) {
               return false;
            } else if (this.hasAtkType() && this.getAtkType() != other.getAtkType()) {
               return false;
            } else if (this.hasLine() != other.hasLine()) {
               return false;
            } else if (this.hasLine() && this.getLine() != other.getLine()) {
               return false;
            } else if (this.hasHillId() != other.hasHillId()) {
               return false;
            } else if (this.hasHillId() && this.getHillId() != other.getHillId()) {
               return false;
            } else if (this.hasMineVeinId() != other.hasMineVeinId()) {
               return false;
            } else if (this.hasMineVeinId() && this.getMineVeinId() != other.getMineVeinId()) {
               return false;
            } else if (this.hasHeroArrayingData() != other.hasHeroArrayingData()) {
               return false;
            } else if (this.hasHeroArrayingData() && !this.getHeroArrayingData().equals(other.getHeroArrayingData())) {
               return false;
            } else if (this.hasHeroMirror() != other.hasHeroMirror()) {
               return false;
            } else if (this.hasHeroMirror() && !this.getHeroMirror().equals(other.getHeroMirror())) {
               return false;
            } else if (this.hasHeroPos() != other.hasHeroPos()) {
               return false;
            } else if (this.hasHeroPos() && this.getHeroPos() != other.getHeroPos()) {
               return false;
            } else if (this.hasRevengeId() != other.hasRevengeId()) {
               return false;
            } else if (this.hasRevengeId() && this.getRevengeId() != other.getRevengeId()) {
               return false;
            } else if (this.hasCurEnergy() != other.hasCurEnergy()) {
               return false;
            } else if (this.hasCurEnergy() && this.getCurEnergy() != other.getCurEnergy()) {
               return false;
            } else if (this.hasHigestMineType() != other.hasHigestMineType()) {
               return false;
            } else if (this.hasHigestMineType() && this.getHigestMineType() != other.getHigestMineType()) {
               return false;
            } else if (this.hasAtkWithEmployNum() != other.hasAtkWithEmployNum()) {
               return false;
            } else if (this.hasAtkWithEmployNum() && this.getAtkWithEmployNum() != other.getAtkWithEmployNum()) {
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
            if (this.hasAtkType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAtkType();
            }

            if (this.hasLine()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLine();
            }

            if (this.hasHillId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHillId();
            }

            if (this.hasMineVeinId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getMineVeinId();
            }

            if (this.hasHeroArrayingData()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getHeroArrayingData().hashCode();
            }

            if (this.hasHeroMirror()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getHeroMirror().hashCode();
            }

            if (this.hasHeroPos()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getHeroPos();
            }

            if (this.hasRevengeId()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getRevengeId();
            }

            if (this.hasCurEnergy()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getCurEnergy();
            }

            if (this.hasHigestMineType()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getHigestMineType();
            }

            if (this.hasAtkWithEmployNum()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getAtkWithEmployNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_ATK_12321 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_ATK_12321)PARSER.parseFrom(data);
      }

      public static S2CR_ATK_12321 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ATK_12321)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ATK_12321 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_ATK_12321)PARSER.parseFrom(data);
      }

      public static S2CR_ATK_12321 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ATK_12321)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ATK_12321 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_ATK_12321)PARSER.parseFrom(data);
      }

      public static S2CR_ATK_12321 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ATK_12321)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ATK_12321 parseFrom(InputStream input) throws IOException {
         return (S2CR_ATK_12321)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ATK_12321 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ATK_12321)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ATK_12321 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_ATK_12321)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_ATK_12321 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ATK_12321)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ATK_12321 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_ATK_12321)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ATK_12321 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ATK_12321)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_ATK_12321 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_ATK_12321 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_ATK_12321> parser() {
         return PARSER;
      }

      public Parser<S2CR_ATK_12321> getParserForType() {
         return PARSER;
      }

      public S2CR_ATK_12321 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_ATK_12321OrBuilder {
         private int bitField0_;
         private int atkType_;
         private int line_;
         private int hillId_;
         private int mineVeinId_;
         private ByteString heroArrayingData_;
         private ByteString heroMirror_;
         private int heroPos_;
         private int revengeId_;
         private int curEnergy_;
         private int higestMineType_;
         private int atkWithEmployNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_ATK_12321_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_ATK_12321_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ATK_12321.class, Builder.class);
         }

         private Builder() {
            this.heroArrayingData_ = ByteString.EMPTY;
            this.heroMirror_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroArrayingData_ = ByteString.EMPTY;
            this.heroMirror_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.S2CR_ATK_12321.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.atkType_ = 0;
            this.bitField0_ &= -2;
            this.line_ = 0;
            this.bitField0_ &= -3;
            this.hillId_ = 0;
            this.bitField0_ &= -5;
            this.mineVeinId_ = 0;
            this.bitField0_ &= -9;
            this.heroArrayingData_ = ByteString.EMPTY;
            this.bitField0_ &= -17;
            this.heroMirror_ = ByteString.EMPTY;
            this.bitField0_ &= -33;
            this.heroPos_ = 0;
            this.bitField0_ &= -65;
            this.revengeId_ = 0;
            this.bitField0_ &= -129;
            this.curEnergy_ = 0;
            this.bitField0_ &= -257;
            this.higestMineType_ = 0;
            this.bitField0_ &= -513;
            this.atkWithEmployNum_ = 0;
            this.bitField0_ &= -1025;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_ATK_12321_descriptor;
         }

         public S2CR_ATK_12321 getDefaultInstanceForType() {
            return CrossMineMsg.S2CR_ATK_12321.getDefaultInstance();
         }

         public S2CR_ATK_12321 build() {
            S2CR_ATK_12321 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_ATK_12321 buildPartial() {
            S2CR_ATK_12321 result = new S2CR_ATK_12321(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.atkType_ = this.atkType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.line_ = this.line_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.hillId_ = this.hillId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.mineVeinId_ = this.mineVeinId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               to_bitField0_ |= 16;
            }

            result.heroArrayingData_ = this.heroArrayingData_;
            if ((from_bitField0_ & 32) != 0) {
               to_bitField0_ |= 32;
            }

            result.heroMirror_ = this.heroMirror_;
            if ((from_bitField0_ & 64) != 0) {
               result.heroPos_ = this.heroPos_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.revengeId_ = this.revengeId_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.curEnergy_ = this.curEnergy_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.higestMineType_ = this.higestMineType_;
               to_bitField0_ |= 512;
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.atkWithEmployNum_ = this.atkWithEmployNum_;
               to_bitField0_ |= 1024;
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
            if (other instanceof S2CR_ATK_12321) {
               return this.mergeFrom((S2CR_ATK_12321)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_ATK_12321 other) {
            if (other == CrossMineMsg.S2CR_ATK_12321.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasAtkType()) {
                  this.setAtkType(other.getAtkType());
               }

               if (other.hasLine()) {
                  this.setLine(other.getLine());
               }

               if (other.hasHillId()) {
                  this.setHillId(other.getHillId());
               }

               if (other.hasMineVeinId()) {
                  this.setMineVeinId(other.getMineVeinId());
               }

               if (other.hasHeroArrayingData()) {
                  this.setHeroArrayingData(other.getHeroArrayingData());
               }

               if (other.hasHeroMirror()) {
                  this.setHeroMirror(other.getHeroMirror());
               }

               if (other.hasHeroPos()) {
                  this.setHeroPos(other.getHeroPos());
               }

               if (other.hasRevengeId()) {
                  this.setRevengeId(other.getRevengeId());
               }

               if (other.hasCurEnergy()) {
                  this.setCurEnergy(other.getCurEnergy());
               }

               if (other.hasHigestMineType()) {
                  this.setHigestMineType(other.getHigestMineType());
               }

               if (other.hasAtkWithEmployNum()) {
                  this.setAtkWithEmployNum(other.getAtkWithEmployNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasAtkType()) {
               return false;
            } else if (!this.hasLine()) {
               return false;
            } else if (!this.hasHillId()) {
               return false;
            } else {
               return this.hasHeroArrayingData();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_ATK_12321 parsedMessage = null;

            try {
               parsedMessage = (S2CR_ATK_12321)CrossMineMsg.S2CR_ATK_12321.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_ATK_12321)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasAtkType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getAtkType() {
            return this.atkType_;
         }

         public Builder setAtkType(int value) {
            this.bitField0_ |= 1;
            this.atkType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAtkType() {
            this.bitField0_ &= -2;
            this.atkType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLine() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLine() {
            return this.line_;
         }

         public Builder setLine(int value) {
            this.bitField0_ |= 2;
            this.line_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLine() {
            this.bitField0_ &= -3;
            this.line_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHillId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getHillId() {
            return this.hillId_;
         }

         public Builder setHillId(int value) {
            this.bitField0_ |= 4;
            this.hillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHillId() {
            this.bitField0_ &= -5;
            this.hillId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMineVeinId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getMineVeinId() {
            return this.mineVeinId_;
         }

         public Builder setMineVeinId(int value) {
            this.bitField0_ |= 8;
            this.mineVeinId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMineVeinId() {
            this.bitField0_ &= -9;
            this.mineVeinId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroArrayingData() {
            return (this.bitField0_ & 16) != 0;
         }

         public ByteString getHeroArrayingData() {
            return this.heroArrayingData_;
         }

         public Builder setHeroArrayingData(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16;
               this.heroArrayingData_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearHeroArrayingData() {
            this.bitField0_ &= -17;
            this.heroArrayingData_ = CrossMineMsg.S2CR_ATK_12321.getDefaultInstance().getHeroArrayingData();
            this.onChanged();
            return this;
         }

         public boolean hasHeroMirror() {
            return (this.bitField0_ & 32) != 0;
         }

         public ByteString getHeroMirror() {
            return this.heroMirror_;
         }

         public Builder setHeroMirror(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 32;
               this.heroMirror_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearHeroMirror() {
            this.bitField0_ &= -33;
            this.heroMirror_ = CrossMineMsg.S2CR_ATK_12321.getDefaultInstance().getHeroMirror();
            this.onChanged();
            return this;
         }

         public boolean hasHeroPos() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getHeroPos() {
            return this.heroPos_;
         }

         public Builder setHeroPos(int value) {
            this.bitField0_ |= 64;
            this.heroPos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroPos() {
            this.bitField0_ &= -65;
            this.heroPos_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRevengeId() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getRevengeId() {
            return this.revengeId_;
         }

         public Builder setRevengeId(int value) {
            this.bitField0_ |= 128;
            this.revengeId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRevengeId() {
            this.bitField0_ &= -129;
            this.revengeId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCurEnergy() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getCurEnergy() {
            return this.curEnergy_;
         }

         public Builder setCurEnergy(int value) {
            this.bitField0_ |= 256;
            this.curEnergy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurEnergy() {
            this.bitField0_ &= -257;
            this.curEnergy_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHigestMineType() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getHigestMineType() {
            return this.higestMineType_;
         }

         public Builder setHigestMineType(int value) {
            this.bitField0_ |= 512;
            this.higestMineType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHigestMineType() {
            this.bitField0_ &= -513;
            this.higestMineType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAtkWithEmployNum() {
            return (this.bitField0_ & 1024) != 0;
         }

         public int getAtkWithEmployNum() {
            return this.atkWithEmployNum_;
         }

         public Builder setAtkWithEmployNum(int value) {
            this.bitField0_ |= 1024;
            this.atkWithEmployNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAtkWithEmployNum() {
            this.bitField0_ &= -1025;
            this.atkWithEmployNum_ = 0;
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

   public static final class CR2S_ATK_12322 extends GeneratedMessageV3 implements CR2S_ATK_12322OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HILLID_FIELD_NUMBER = 1;
      private int hillId_;
      public static final int BATTLEMSG_FIELD_NUMBER = 2;
      private BattleMsg.S2C_BattleResult_6102 battleMsg_;
      public static final int ISATKPLAYER_FIELD_NUMBER = 3;
      private boolean isAtkPlayer_;
      private byte memoizedIsInitialized;
      private static final CR2S_ATK_12322 DEFAULT_INSTANCE = new CR2S_ATK_12322();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_ATK_12322> PARSER = new AbstractParser<CR2S_ATK_12322>() {
         public CR2S_ATK_12322 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_ATK_12322(input, extensionRegistry);
         }
      };

      private CR2S_ATK_12322(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_ATK_12322() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_ATK_12322();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_ATK_12322(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.hillId_ = input.readInt32();
                        break;
                     case 18:
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.battleMsg_.toBuilder();
                        }

                        this.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.battleMsg_);
                           this.battleMsg_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.isAtkPlayer_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_ATK_12322_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_ATK_12322_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ATK_12322.class, Builder.class);
      }

      public boolean hasHillId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHillId() {
         return this.hillId_;
      }

      public boolean hasBattleMsg() {
         return (this.bitField0_ & 2) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getBattleMsg() {
         return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder() {
         return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
      }

      public boolean hasIsAtkPlayer() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsAtkPlayer() {
         return this.isAtkPlayer_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHillId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBattleMsg()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getBattleMsg().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.hillId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getBattleMsg());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.isAtkPlayer_);
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
               size += CodedOutputStream.computeInt32Size(1, this.hillId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getBattleMsg());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.isAtkPlayer_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_ATK_12322)) {
            return super.equals(obj);
         } else {
            CR2S_ATK_12322 other = (CR2S_ATK_12322)obj;
            if (this.hasHillId() != other.hasHillId()) {
               return false;
            } else if (this.hasHillId() && this.getHillId() != other.getHillId()) {
               return false;
            } else if (this.hasBattleMsg() != other.hasBattleMsg()) {
               return false;
            } else if (this.hasBattleMsg() && !this.getBattleMsg().equals(other.getBattleMsg())) {
               return false;
            } else if (this.hasIsAtkPlayer() != other.hasIsAtkPlayer()) {
               return false;
            } else if (this.hasIsAtkPlayer() && this.getIsAtkPlayer() != other.getIsAtkPlayer()) {
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
            if (this.hasHillId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHillId();
            }

            if (this.hasBattleMsg()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBattleMsg().hashCode();
            }

            if (this.hasIsAtkPlayer()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getIsAtkPlayer());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_ATK_12322 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_ATK_12322)PARSER.parseFrom(data);
      }

      public static CR2S_ATK_12322 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ATK_12322)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ATK_12322 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_ATK_12322)PARSER.parseFrom(data);
      }

      public static CR2S_ATK_12322 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ATK_12322)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ATK_12322 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_ATK_12322)PARSER.parseFrom(data);
      }

      public static CR2S_ATK_12322 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ATK_12322)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ATK_12322 parseFrom(InputStream input) throws IOException {
         return (CR2S_ATK_12322)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ATK_12322 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ATK_12322)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ATK_12322 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_ATK_12322)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_ATK_12322 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ATK_12322)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ATK_12322 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_ATK_12322)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ATK_12322 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ATK_12322)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_ATK_12322 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_ATK_12322 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_ATK_12322> parser() {
         return PARSER;
      }

      public Parser<CR2S_ATK_12322> getParserForType() {
         return PARSER;
      }

      public CR2S_ATK_12322 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_ATK_12322OrBuilder {
         private int bitField0_;
         private int hillId_;
         private BattleMsg.S2C_BattleResult_6102 battleMsg_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> battleMsgBuilder_;
         private boolean isAtkPlayer_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_ATK_12322_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_ATK_12322_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ATK_12322.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.CR2S_ATK_12322.alwaysUseFieldBuilders) {
               this.getBattleMsgFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.hillId_ = 0;
            this.bitField0_ &= -2;
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -3;
            this.isAtkPlayer_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_ATK_12322_descriptor;
         }

         public CR2S_ATK_12322 getDefaultInstanceForType() {
            return CrossMineMsg.CR2S_ATK_12322.getDefaultInstance();
         }

         public CR2S_ATK_12322 build() {
            CR2S_ATK_12322 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_ATK_12322 buildPartial() {
            CR2S_ATK_12322 result = new CR2S_ATK_12322(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.hillId_ = this.hillId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.battleMsgBuilder_ == null) {
                  result.battleMsg_ = this.battleMsg_;
               } else {
                  result.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)this.battleMsgBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.isAtkPlayer_ = this.isAtkPlayer_;
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
            if (other instanceof CR2S_ATK_12322) {
               return this.mergeFrom((CR2S_ATK_12322)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_ATK_12322 other) {
            if (other == CrossMineMsg.CR2S_ATK_12322.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHillId()) {
                  this.setHillId(other.getHillId());
               }

               if (other.hasBattleMsg()) {
                  this.mergeBattleMsg(other.getBattleMsg());
               }

               if (other.hasIsAtkPlayer()) {
                  this.setIsAtkPlayer(other.getIsAtkPlayer());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHillId()) {
               return false;
            } else if (!this.hasBattleMsg()) {
               return false;
            } else {
               return this.getBattleMsg().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_ATK_12322 parsedMessage = null;

            try {
               parsedMessage = (CR2S_ATK_12322)CrossMineMsg.CR2S_ATK_12322.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_ATK_12322)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHillId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHillId() {
            return this.hillId_;
         }

         public Builder setHillId(int value) {
            this.bitField0_ |= 1;
            this.hillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHillId() {
            this.bitField0_ &= -2;
            this.hillId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBattleMsg() {
            return (this.bitField0_ & 2) != 0;
         }

         public BattleMsg.S2C_BattleResult_6102 getBattleMsg() {
            if (this.battleMsgBuilder_ == null) {
               return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
            } else {
               return (BattleMsg.S2C_BattleResult_6102)this.battleMsgBuilder_.getMessage();
            }
         }

         public Builder setBattleMsg(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleMsgBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.battleMsg_ = value;
               this.onChanged();
            } else {
               this.battleMsgBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setBattleMsg(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = builderForValue.build();
               this.onChanged();
            } else {
               this.battleMsgBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeBattleMsg(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleMsgBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.battleMsg_ != null && this.battleMsg_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.battleMsg_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.battleMsg_).mergeFrom(value).buildPartial();
               } else {
                  this.battleMsg_ = value;
               }

               this.onChanged();
            } else {
               this.battleMsgBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearBattleMsg() {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
               this.onChanged();
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getBattleMsgBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (BattleMsg.S2C_BattleResult_6102.Builder)this.getBattleMsgFieldBuilder().getBuilder();
         }

         public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder() {
            if (this.battleMsgBuilder_ != null) {
               return (BattleMsg.S2C_BattleResult_6102OrBuilder)this.battleMsgBuilder_.getMessageOrBuilder();
            } else {
               return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
            }
         }

         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> getBattleMsgFieldBuilder() {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsgBuilder_ = new SingleFieldBuilderV3(this.getBattleMsg(), this.getParentForChildren(), this.isClean());
               this.battleMsg_ = null;
            }

            return this.battleMsgBuilder_;
         }

         public boolean hasIsAtkPlayer() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getIsAtkPlayer() {
            return this.isAtkPlayer_;
         }

         public Builder setIsAtkPlayer(boolean value) {
            this.bitField0_ |= 4;
            this.isAtkPlayer_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsAtkPlayer() {
            this.bitField0_ &= -5;
            this.isAtkPlayer_ = false;
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

   public static final class CR2S_UpdatePerson_12324 extends GeneratedMessageV3 implements CR2S_UpdatePerson_12324OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LINE_FIELD_NUMBER = 1;
      private int line_;
      public static final int HILLID_FIELD_NUMBER = 2;
      private int hillId_;
      public static final int VEINID_FIELD_NUMBER = 3;
      private int veinId_;
      public static final int STARTTIME_FIELD_NUMBER = 4;
      private int startTime_;
      public static final int HAVING_FIELD_NUMBER = 5;
      private boolean having_;
      public static final int EVENTID_FIELD_NUMBER = 6;
      private Internal.IntList eventId_;
      public static final int HITMONSTER_FIELD_NUMBER = 7;
      private boolean hitMonster_;
      private byte memoizedIsInitialized;
      private static final CR2S_UpdatePerson_12324 DEFAULT_INSTANCE = new CR2S_UpdatePerson_12324();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UpdatePerson_12324> PARSER = new AbstractParser<CR2S_UpdatePerson_12324>() {
         public CR2S_UpdatePerson_12324 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UpdatePerson_12324(input, extensionRegistry);
         }
      };

      private CR2S_UpdatePerson_12324(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UpdatePerson_12324() {
         this.memoizedIsInitialized = -1;
         this.eventId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UpdatePerson_12324();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UpdatePerson_12324(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.line_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.hillId_ = input.readInt32();
                        continue;
                     case 24:
                        this.bitField0_ |= 4;
                        this.veinId_ = input.readInt32();
                        continue;
                     case 32:
                        this.bitField0_ |= 8;
                        this.startTime_ = input.readInt32();
                        continue;
                     case 40:
                        this.bitField0_ |= 16;
                        this.having_ = input.readBool();
                        continue;
                     case 48:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.eventId_ = newIntList();
                           mutable_bitField0_ |= 32;
                        }

                        this.eventId_.addInt(input.readInt32());
                        continue;
                     case 50:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 32) == 0 && input.getBytesUntilLimit() > 0) {
                           this.eventId_ = newIntList();
                           mutable_bitField0_ |= 32;
                        }
                        break;
                     case 56:
                        this.bitField0_ |= 32;
                        this.hitMonster_ = input.readBool();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.eventId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 32) != 0) {
                  this.eventId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdatePerson_12324_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdatePerson_12324_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpdatePerson_12324.class, Builder.class);
      }

      public boolean hasLine() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLine() {
         return this.line_;
      }

      public boolean hasHillId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHillId() {
         return this.hillId_;
      }

      public boolean hasVeinId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getVeinId() {
         return this.veinId_;
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
      }

      public boolean hasHaving() {
         return (this.bitField0_ & 16) != 0;
      }

      public boolean getHaving() {
         return this.having_;
      }

      public List<Integer> getEventIdList() {
         return this.eventId_;
      }

      public int getEventIdCount() {
         return this.eventId_.size();
      }

      public int getEventId(int index) {
         return this.eventId_.getInt(index);
      }

      public boolean hasHitMonster() {
         return (this.bitField0_ & 32) != 0;
      }

      public boolean getHitMonster() {
         return this.hitMonster_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLine()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHillId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasVeinId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHaving()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHitMonster()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.line_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.hillId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.veinId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.startTime_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeBool(5, this.having_);
         }

         for(int i = 0; i < this.eventId_.size(); ++i) {
            output.writeInt32(6, this.eventId_.getInt(i));
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeBool(7, this.hitMonster_);
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
               size += CodedOutputStream.computeInt32Size(1, this.line_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.hillId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.veinId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.startTime_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeBoolSize(5, this.having_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.eventId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.eventId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getEventIdList().size();
            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeBoolSize(7, this.hitMonster_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_UpdatePerson_12324)) {
            return super.equals(obj);
         } else {
            CR2S_UpdatePerson_12324 other = (CR2S_UpdatePerson_12324)obj;
            if (this.hasLine() != other.hasLine()) {
               return false;
            } else if (this.hasLine() && this.getLine() != other.getLine()) {
               return false;
            } else if (this.hasHillId() != other.hasHillId()) {
               return false;
            } else if (this.hasHillId() && this.getHillId() != other.getHillId()) {
               return false;
            } else if (this.hasVeinId() != other.hasVeinId()) {
               return false;
            } else if (this.hasVeinId() && this.getVeinId() != other.getVeinId()) {
               return false;
            } else if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else if (this.hasHaving() != other.hasHaving()) {
               return false;
            } else if (this.hasHaving() && this.getHaving() != other.getHaving()) {
               return false;
            } else if (!this.getEventIdList().equals(other.getEventIdList())) {
               return false;
            } else if (this.hasHitMonster() != other.hasHitMonster()) {
               return false;
            } else if (this.hasHitMonster() && this.getHitMonster() != other.getHitMonster()) {
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
            if (this.hasLine()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLine();
            }

            if (this.hasHillId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHillId();
            }

            if (this.hasVeinId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getVeinId();
            }

            if (this.hasStartTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getStartTime();
            }

            if (this.hasHaving()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashBoolean(this.getHaving());
            }

            if (this.getEventIdCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getEventIdList().hashCode();
            }

            if (this.hasHitMonster()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + Internal.hashBoolean(this.getHitMonster());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_UpdatePerson_12324 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UpdatePerson_12324)PARSER.parseFrom(data);
      }

      public static CR2S_UpdatePerson_12324 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdatePerson_12324)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdatePerson_12324 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UpdatePerson_12324)PARSER.parseFrom(data);
      }

      public static CR2S_UpdatePerson_12324 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdatePerson_12324)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdatePerson_12324 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UpdatePerson_12324)PARSER.parseFrom(data);
      }

      public static CR2S_UpdatePerson_12324 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdatePerson_12324)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdatePerson_12324 parseFrom(InputStream input) throws IOException {
         return (CR2S_UpdatePerson_12324)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpdatePerson_12324 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdatePerson_12324)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpdatePerson_12324 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UpdatePerson_12324)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UpdatePerson_12324 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdatePerson_12324)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpdatePerson_12324 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UpdatePerson_12324)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpdatePerson_12324 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdatePerson_12324)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UpdatePerson_12324 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UpdatePerson_12324 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UpdatePerson_12324> parser() {
         return PARSER;
      }

      public Parser<CR2S_UpdatePerson_12324> getParserForType() {
         return PARSER;
      }

      public CR2S_UpdatePerson_12324 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UpdatePerson_12324OrBuilder {
         private int bitField0_;
         private int line_;
         private int hillId_;
         private int veinId_;
         private int startTime_;
         private boolean having_;
         private Internal.IntList eventId_;
         private boolean hitMonster_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdatePerson_12324_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdatePerson_12324_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpdatePerson_12324.class, Builder.class);
         }

         private Builder() {
            this.eventId_ = CrossMineMsg.CR2S_UpdatePerson_12324.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.eventId_ = CrossMineMsg.CR2S_UpdatePerson_12324.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.CR2S_UpdatePerson_12324.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.line_ = 0;
            this.bitField0_ &= -2;
            this.hillId_ = 0;
            this.bitField0_ &= -3;
            this.veinId_ = 0;
            this.bitField0_ &= -5;
            this.startTime_ = 0;
            this.bitField0_ &= -9;
            this.having_ = false;
            this.bitField0_ &= -17;
            this.eventId_ = CrossMineMsg.CR2S_UpdatePerson_12324.emptyIntList();
            this.bitField0_ &= -33;
            this.hitMonster_ = false;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdatePerson_12324_descriptor;
         }

         public CR2S_UpdatePerson_12324 getDefaultInstanceForType() {
            return CrossMineMsg.CR2S_UpdatePerson_12324.getDefaultInstance();
         }

         public CR2S_UpdatePerson_12324 build() {
            CR2S_UpdatePerson_12324 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UpdatePerson_12324 buildPartial() {
            CR2S_UpdatePerson_12324 result = new CR2S_UpdatePerson_12324(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.line_ = this.line_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.hillId_ = this.hillId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.veinId_ = this.veinId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.startTime_ = this.startTime_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.having_ = this.having_;
               to_bitField0_ |= 16;
            }

            if ((this.bitField0_ & 32) != 0) {
               this.eventId_.makeImmutable();
               this.bitField0_ &= -33;
            }

            result.eventId_ = this.eventId_;
            if ((from_bitField0_ & 64) != 0) {
               result.hitMonster_ = this.hitMonster_;
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
            if (other instanceof CR2S_UpdatePerson_12324) {
               return this.mergeFrom((CR2S_UpdatePerson_12324)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UpdatePerson_12324 other) {
            if (other == CrossMineMsg.CR2S_UpdatePerson_12324.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLine()) {
                  this.setLine(other.getLine());
               }

               if (other.hasHillId()) {
                  this.setHillId(other.getHillId());
               }

               if (other.hasVeinId()) {
                  this.setVeinId(other.getVeinId());
               }

               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               if (other.hasHaving()) {
                  this.setHaving(other.getHaving());
               }

               if (!other.eventId_.isEmpty()) {
                  if (this.eventId_.isEmpty()) {
                     this.eventId_ = other.eventId_;
                     this.bitField0_ &= -33;
                  } else {
                     this.ensureEventIdIsMutable();
                     this.eventId_.addAll(other.eventId_);
                  }

                  this.onChanged();
               }

               if (other.hasHitMonster()) {
                  this.setHitMonster(other.getHitMonster());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasLine()) {
               return false;
            } else if (!this.hasHillId()) {
               return false;
            } else if (!this.hasVeinId()) {
               return false;
            } else if (!this.hasHaving()) {
               return false;
            } else {
               return this.hasHitMonster();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_UpdatePerson_12324 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UpdatePerson_12324)CrossMineMsg.CR2S_UpdatePerson_12324.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UpdatePerson_12324)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLine() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getLine() {
            return this.line_;
         }

         public Builder setLine(int value) {
            this.bitField0_ |= 1;
            this.line_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLine() {
            this.bitField0_ &= -2;
            this.line_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHillId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHillId() {
            return this.hillId_;
         }

         public Builder setHillId(int value) {
            this.bitField0_ |= 2;
            this.hillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHillId() {
            this.bitField0_ &= -3;
            this.hillId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasVeinId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getVeinId() {
            return this.veinId_;
         }

         public Builder setVeinId(int value) {
            this.bitField0_ |= 4;
            this.veinId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearVeinId() {
            this.bitField0_ &= -5;
            this.veinId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStartTime() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getStartTime() {
            return this.startTime_;
         }

         public Builder setStartTime(int value) {
            this.bitField0_ |= 8;
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTime() {
            this.bitField0_ &= -9;
            this.startTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHaving() {
            return (this.bitField0_ & 16) != 0;
         }

         public boolean getHaving() {
            return this.having_;
         }

         public Builder setHaving(boolean value) {
            this.bitField0_ |= 16;
            this.having_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHaving() {
            this.bitField0_ &= -17;
            this.having_ = false;
            this.onChanged();
            return this;
         }

         private void ensureEventIdIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.eventId_ = CrossMineMsg.CR2S_UpdatePerson_12324.mutableCopy(this.eventId_);
               this.bitField0_ |= 32;
            }

         }

         public List<Integer> getEventIdList() {
            return (List<Integer>)((this.bitField0_ & 32) != 0 ? Collections.unmodifiableList(this.eventId_) : this.eventId_);
         }

         public int getEventIdCount() {
            return this.eventId_.size();
         }

         public int getEventId(int index) {
            return this.eventId_.getInt(index);
         }

         public Builder setEventId(int index, int value) {
            this.ensureEventIdIsMutable();
            this.eventId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addEventId(int value) {
            this.ensureEventIdIsMutable();
            this.eventId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllEventId(Iterable<? extends Integer> values) {
            this.ensureEventIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.eventId_);
            this.onChanged();
            return this;
         }

         public Builder clearEventId() {
            this.eventId_ = CrossMineMsg.CR2S_UpdatePerson_12324.emptyIntList();
            this.bitField0_ &= -33;
            this.onChanged();
            return this;
         }

         public boolean hasHitMonster() {
            return (this.bitField0_ & 64) != 0;
         }

         public boolean getHitMonster() {
            return this.hitMonster_;
         }

         public Builder setHitMonster(boolean value) {
            this.bitField0_ |= 64;
            this.hitMonster_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHitMonster() {
            this.bitField0_ &= -65;
            this.hitMonster_ = false;
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

   public static final class CR2S_MailResource_12326 extends GeneratedMessageV3 implements CR2S_MailResource_12326OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int ITEMS_FIELD_NUMBER = 2;
      private List<CommonMsg.ItemInfo> items_;
      private byte memoizedIsInitialized;
      private static final CR2S_MailResource_12326 DEFAULT_INSTANCE = new CR2S_MailResource_12326();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_MailResource_12326> PARSER = new AbstractParser<CR2S_MailResource_12326>() {
         public CR2S_MailResource_12326 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_MailResource_12326(input, extensionRegistry);
         }
      };

      private CR2S_MailResource_12326(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_MailResource_12326() {
         this.memoizedIsInitialized = -1;
         this.items_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_MailResource_12326();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_MailResource_12326(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.items_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.items_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.items_ = Collections.unmodifiableList(this.items_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_MailResource_12326_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_MailResource_12326_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_MailResource_12326.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
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
            output.writeInt32(1, this.type_);
         }

         for(int i = 0; i < this.items_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.items_.get(i));
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

            for(int i = 0; i < this.items_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.items_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_MailResource_12326)) {
            return super.equals(obj);
         } else {
            CR2S_MailResource_12326 other = (CR2S_MailResource_12326)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (!this.getItemsList().equals(other.getItemsList())) {
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

            if (this.getItemsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_MailResource_12326 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_MailResource_12326)PARSER.parseFrom(data);
      }

      public static CR2S_MailResource_12326 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_MailResource_12326)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_MailResource_12326 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_MailResource_12326)PARSER.parseFrom(data);
      }

      public static CR2S_MailResource_12326 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_MailResource_12326)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_MailResource_12326 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_MailResource_12326)PARSER.parseFrom(data);
      }

      public static CR2S_MailResource_12326 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_MailResource_12326)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_MailResource_12326 parseFrom(InputStream input) throws IOException {
         return (CR2S_MailResource_12326)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_MailResource_12326 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_MailResource_12326)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_MailResource_12326 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_MailResource_12326)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_MailResource_12326 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_MailResource_12326)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_MailResource_12326 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_MailResource_12326)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_MailResource_12326 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_MailResource_12326)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_MailResource_12326 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_MailResource_12326 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_MailResource_12326> parser() {
         return PARSER;
      }

      public Parser<CR2S_MailResource_12326> getParserForType() {
         return PARSER;
      }

      public CR2S_MailResource_12326 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_MailResource_12326OrBuilder {
         private int bitField0_;
         private int type_;
         private List<CommonMsg.ItemInfo> items_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_MailResource_12326_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_MailResource_12326_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_MailResource_12326.class, Builder.class);
         }

         private Builder() {
            this.items_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.items_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.CR2S_MailResource_12326.alwaysUseFieldBuilders) {
               this.getItemsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            if (this.itemsBuilder_ == null) {
               this.items_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.itemsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_MailResource_12326_descriptor;
         }

         public CR2S_MailResource_12326 getDefaultInstanceForType() {
            return CrossMineMsg.CR2S_MailResource_12326.getDefaultInstance();
         }

         public CR2S_MailResource_12326 build() {
            CR2S_MailResource_12326 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_MailResource_12326 buildPartial() {
            CR2S_MailResource_12326 result = new CR2S_MailResource_12326(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof CR2S_MailResource_12326) {
               return this.mergeFrom((CR2S_MailResource_12326)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_MailResource_12326 other) {
            if (other == CrossMineMsg.CR2S_MailResource_12326.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
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
                     this.itemsBuilder_ = CrossMineMsg.CR2S_MailResource_12326.alwaysUseFieldBuilders ? this.getItemsFieldBuilder() : null;
                  } else {
                     this.itemsBuilder_.addAllMessages(other.items_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
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
            CR2S_MailResource_12326 parsedMessage = null;

            try {
               parsedMessage = (CR2S_MailResource_12326)CrossMineMsg.CR2S_MailResource_12326.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_MailResource_12326)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_UpdateHillInfo_12330 extends GeneratedMessageV3 implements CR2S_UpdateHillInfo_12330OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFO_FIELD_NUMBER = 1;
      private List<MineMsg.HillUnionEvent> info_;
      private byte memoizedIsInitialized;
      private static final CR2S_UpdateHillInfo_12330 DEFAULT_INSTANCE = new CR2S_UpdateHillInfo_12330();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UpdateHillInfo_12330> PARSER = new AbstractParser<CR2S_UpdateHillInfo_12330>() {
         public CR2S_UpdateHillInfo_12330 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UpdateHillInfo_12330(input, extensionRegistry);
         }
      };

      private CR2S_UpdateHillInfo_12330(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UpdateHillInfo_12330() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UpdateHillInfo_12330();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UpdateHillInfo_12330(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.info_.add(input.readMessage(MineMsg.HillUnionEvent.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateHillInfo_12330_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateHillInfo_12330_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpdateHillInfo_12330.class, Builder.class);
      }

      public List<MineMsg.HillUnionEvent> getInfoList() {
         return this.info_;
      }

      public List<? extends MineMsg.HillUnionEventOrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public MineMsg.HillUnionEvent getInfo(int index) {
         return (MineMsg.HillUnionEvent)this.info_.get(index);
      }

      public MineMsg.HillUnionEventOrBuilder getInfoOrBuilder(int index) {
         return (MineMsg.HillUnionEventOrBuilder)this.info_.get(index);
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
         } else if (!(obj instanceof CR2S_UpdateHillInfo_12330)) {
            return super.equals(obj);
         } else {
            CR2S_UpdateHillInfo_12330 other = (CR2S_UpdateHillInfo_12330)obj;
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

      public static CR2S_UpdateHillInfo_12330 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateHillInfo_12330)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateHillInfo_12330 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateHillInfo_12330)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateHillInfo_12330 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateHillInfo_12330)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateHillInfo_12330 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateHillInfo_12330)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateHillInfo_12330 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateHillInfo_12330)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateHillInfo_12330 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateHillInfo_12330)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateHillInfo_12330 parseFrom(InputStream input) throws IOException {
         return (CR2S_UpdateHillInfo_12330)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpdateHillInfo_12330 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateHillInfo_12330)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpdateHillInfo_12330 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UpdateHillInfo_12330)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UpdateHillInfo_12330 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateHillInfo_12330)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpdateHillInfo_12330 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UpdateHillInfo_12330)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpdateHillInfo_12330 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateHillInfo_12330)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UpdateHillInfo_12330 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UpdateHillInfo_12330 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UpdateHillInfo_12330> parser() {
         return PARSER;
      }

      public Parser<CR2S_UpdateHillInfo_12330> getParserForType() {
         return PARSER;
      }

      public CR2S_UpdateHillInfo_12330 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UpdateHillInfo_12330OrBuilder {
         private int bitField0_;
         private List<MineMsg.HillUnionEvent> info_;
         private RepeatedFieldBuilderV3<MineMsg.HillUnionEvent, MineMsg.HillUnionEvent.Builder, MineMsg.HillUnionEventOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateHillInfo_12330_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateHillInfo_12330_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpdateHillInfo_12330.class, Builder.class);
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
            if (CrossMineMsg.CR2S_UpdateHillInfo_12330.alwaysUseFieldBuilders) {
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
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateHillInfo_12330_descriptor;
         }

         public CR2S_UpdateHillInfo_12330 getDefaultInstanceForType() {
            return CrossMineMsg.CR2S_UpdateHillInfo_12330.getDefaultInstance();
         }

         public CR2S_UpdateHillInfo_12330 build() {
            CR2S_UpdateHillInfo_12330 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UpdateHillInfo_12330 buildPartial() {
            CR2S_UpdateHillInfo_12330 result = new CR2S_UpdateHillInfo_12330(this);
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
            if (other instanceof CR2S_UpdateHillInfo_12330) {
               return this.mergeFrom((CR2S_UpdateHillInfo_12330)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UpdateHillInfo_12330 other) {
            if (other == CrossMineMsg.CR2S_UpdateHillInfo_12330.getDefaultInstance()) {
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
                     this.infoBuilder_ = CrossMineMsg.CR2S_UpdateHillInfo_12330.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
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
            CR2S_UpdateHillInfo_12330 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UpdateHillInfo_12330)CrossMineMsg.CR2S_UpdateHillInfo_12330.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UpdateHillInfo_12330)e.getUnfinishedMessage();
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

         public List<MineMsg.HillUnionEvent> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public MineMsg.HillUnionEvent getInfo(int index) {
            return this.infoBuilder_ == null ? (MineMsg.HillUnionEvent)this.info_.get(index) : (MineMsg.HillUnionEvent)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, MineMsg.HillUnionEvent value) {
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

         public Builder setInfo(int index, MineMsg.HillUnionEvent.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(MineMsg.HillUnionEvent value) {
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

         public Builder addInfo(int index, MineMsg.HillUnionEvent value) {
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

         public Builder addInfo(MineMsg.HillUnionEvent.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, MineMsg.HillUnionEvent.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends MineMsg.HillUnionEvent> values) {
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

         public MineMsg.HillUnionEvent.Builder getInfoBuilder(int index) {
            return (MineMsg.HillUnionEvent.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public MineMsg.HillUnionEventOrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (MineMsg.HillUnionEventOrBuilder)this.info_.get(index) : (MineMsg.HillUnionEventOrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MineMsg.HillUnionEventOrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public MineMsg.HillUnionEvent.Builder addInfoBuilder() {
            return (MineMsg.HillUnionEvent.Builder)this.getInfoFieldBuilder().addBuilder(MineMsg.HillUnionEvent.getDefaultInstance());
         }

         public MineMsg.HillUnionEvent.Builder addInfoBuilder(int index) {
            return (MineMsg.HillUnionEvent.Builder)this.getInfoFieldBuilder().addBuilder(index, MineMsg.HillUnionEvent.getDefaultInstance());
         }

         public List<MineMsg.HillUnionEvent.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MineMsg.HillUnionEvent, MineMsg.HillUnionEvent.Builder, MineMsg.HillUnionEventOrBuilder> getInfoFieldBuilder() {
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

   public static final class S2CR_MineNote_12331 extends GeneratedMessageV3 implements S2CR_MineNote_12331OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_MineNote_12331 DEFAULT_INSTANCE = new S2CR_MineNote_12331();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_MineNote_12331> PARSER = new AbstractParser<S2CR_MineNote_12331>() {
         public S2CR_MineNote_12331 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_MineNote_12331(input, extensionRegistry);
         }
      };

      private S2CR_MineNote_12331(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_MineNote_12331() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_MineNote_12331();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_MineNote_12331(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MineNote_12331_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MineNote_12331_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MineNote_12331.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_MineNote_12331)) {
            return super.equals(obj);
         } else {
            S2CR_MineNote_12331 other = (S2CR_MineNote_12331)obj;
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

      public static S2CR_MineNote_12331 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_MineNote_12331)PARSER.parseFrom(data);
      }

      public static S2CR_MineNote_12331 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MineNote_12331)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MineNote_12331 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_MineNote_12331)PARSER.parseFrom(data);
      }

      public static S2CR_MineNote_12331 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MineNote_12331)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MineNote_12331 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_MineNote_12331)PARSER.parseFrom(data);
      }

      public static S2CR_MineNote_12331 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MineNote_12331)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MineNote_12331 parseFrom(InputStream input) throws IOException {
         return (S2CR_MineNote_12331)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MineNote_12331 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MineNote_12331)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MineNote_12331 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_MineNote_12331)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_MineNote_12331 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MineNote_12331)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MineNote_12331 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_MineNote_12331)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MineNote_12331 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MineNote_12331)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_MineNote_12331 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_MineNote_12331 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_MineNote_12331> parser() {
         return PARSER;
      }

      public Parser<S2CR_MineNote_12331> getParserForType() {
         return PARSER;
      }

      public S2CR_MineNote_12331 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_MineNote_12331OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MineNote_12331_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MineNote_12331_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MineNote_12331.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.S2CR_MineNote_12331.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MineNote_12331_descriptor;
         }

         public S2CR_MineNote_12331 getDefaultInstanceForType() {
            return CrossMineMsg.S2CR_MineNote_12331.getDefaultInstance();
         }

         public S2CR_MineNote_12331 build() {
            S2CR_MineNote_12331 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_MineNote_12331 buildPartial() {
            S2CR_MineNote_12331 result = new S2CR_MineNote_12331(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_MineNote_12331) {
               return this.mergeFrom((S2CR_MineNote_12331)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_MineNote_12331 other) {
            if (other == CrossMineMsg.S2CR_MineNote_12331.getDefaultInstance()) {
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
            S2CR_MineNote_12331 parsedMessage = null;

            try {
               parsedMessage = (S2CR_MineNote_12331)CrossMineMsg.S2CR_MineNote_12331.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_MineNote_12331)e.getUnfinishedMessage();
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

   public static final class S2CR_ArrayingDef_12333 extends GeneratedMessageV3 implements S2CR_ArrayingDef_12333OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ARRAYING_FIELD_NUMBER = 1;
      private ByteString arraying_;
      private byte memoizedIsInitialized;
      private static final S2CR_ArrayingDef_12333 DEFAULT_INSTANCE = new S2CR_ArrayingDef_12333();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_ArrayingDef_12333> PARSER = new AbstractParser<S2CR_ArrayingDef_12333>() {
         public S2CR_ArrayingDef_12333 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_ArrayingDef_12333(input, extensionRegistry);
         }
      };

      private S2CR_ArrayingDef_12333(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_ArrayingDef_12333() {
         this.memoizedIsInitialized = -1;
         this.arraying_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_ArrayingDef_12333();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_ArrayingDef_12333(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.arraying_ = input.readBytes();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_ArrayingDef_12333_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_ArrayingDef_12333_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ArrayingDef_12333.class, Builder.class);
      }

      public boolean hasArraying() {
         return (this.bitField0_ & 1) != 0;
      }

      public ByteString getArraying() {
         return this.arraying_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasArraying()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBytes(1, this.arraying_);
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
               size += CodedOutputStream.computeBytesSize(1, this.arraying_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_ArrayingDef_12333)) {
            return super.equals(obj);
         } else {
            S2CR_ArrayingDef_12333 other = (S2CR_ArrayingDef_12333)obj;
            if (this.hasArraying() != other.hasArraying()) {
               return false;
            } else if (this.hasArraying() && !this.getArraying().equals(other.getArraying())) {
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
            if (this.hasArraying()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getArraying().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_ArrayingDef_12333 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_ArrayingDef_12333)PARSER.parseFrom(data);
      }

      public static S2CR_ArrayingDef_12333 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ArrayingDef_12333)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ArrayingDef_12333 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_ArrayingDef_12333)PARSER.parseFrom(data);
      }

      public static S2CR_ArrayingDef_12333 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ArrayingDef_12333)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ArrayingDef_12333 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_ArrayingDef_12333)PARSER.parseFrom(data);
      }

      public static S2CR_ArrayingDef_12333 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ArrayingDef_12333)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ArrayingDef_12333 parseFrom(InputStream input) throws IOException {
         return (S2CR_ArrayingDef_12333)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ArrayingDef_12333 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ArrayingDef_12333)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ArrayingDef_12333 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_ArrayingDef_12333)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_ArrayingDef_12333 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ArrayingDef_12333)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ArrayingDef_12333 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_ArrayingDef_12333)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ArrayingDef_12333 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ArrayingDef_12333)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_ArrayingDef_12333 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_ArrayingDef_12333 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_ArrayingDef_12333> parser() {
         return PARSER;
      }

      public Parser<S2CR_ArrayingDef_12333> getParserForType() {
         return PARSER;
      }

      public S2CR_ArrayingDef_12333 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_ArrayingDef_12333OrBuilder {
         private int bitField0_;
         private ByteString arraying_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_ArrayingDef_12333_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_ArrayingDef_12333_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ArrayingDef_12333.class, Builder.class);
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
            if (CrossMineMsg.S2CR_ArrayingDef_12333.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.arraying_ = ByteString.EMPTY;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_ArrayingDef_12333_descriptor;
         }

         public S2CR_ArrayingDef_12333 getDefaultInstanceForType() {
            return CrossMineMsg.S2CR_ArrayingDef_12333.getDefaultInstance();
         }

         public S2CR_ArrayingDef_12333 build() {
            S2CR_ArrayingDef_12333 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_ArrayingDef_12333 buildPartial() {
            S2CR_ArrayingDef_12333 result = new S2CR_ArrayingDef_12333(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.arraying_ = this.arraying_;
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
            if (other instanceof S2CR_ArrayingDef_12333) {
               return this.mergeFrom((S2CR_ArrayingDef_12333)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_ArrayingDef_12333 other) {
            if (other == CrossMineMsg.S2CR_ArrayingDef_12333.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasArraying()) {
                  this.setArraying(other.getArraying());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasArraying();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_ArrayingDef_12333 parsedMessage = null;

            try {
               parsedMessage = (S2CR_ArrayingDef_12333)CrossMineMsg.S2CR_ArrayingDef_12333.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_ArrayingDef_12333)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasArraying() {
            return (this.bitField0_ & 1) != 0;
         }

         public ByteString getArraying() {
            return this.arraying_;
         }

         public Builder setArraying(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.arraying_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearArraying() {
            this.bitField0_ &= -2;
            this.arraying_ = CrossMineMsg.S2CR_ArrayingDef_12333.getDefaultInstance().getArraying();
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

   public static final class CR2S_LoseMineVein_12336 extends GeneratedMessageV3 implements CR2S_LoseMineVein_12336OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REVENGEID_FIELD_NUMBER = 1;
      private int revengeId_;
      public static final int LOSETIME_FIELD_NUMBER = 2;
      private int loseTime_;
      public static final int FALLNUM_FIELD_NUMBER = 3;
      private int fallNum_;
      public static final int REWARDS_FIELD_NUMBER = 4;
      private List<CommonMsg.ItemInfo> rewards_;
      public static final int DURATIONTIME_FIELD_NUMBER = 5;
      private int durationTime_;
      public static final int SPECIAL_FIELD_NUMBER = 6;
      private boolean special_;
      private byte memoizedIsInitialized;
      private static final CR2S_LoseMineVein_12336 DEFAULT_INSTANCE = new CR2S_LoseMineVein_12336();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_LoseMineVein_12336> PARSER = new AbstractParser<CR2S_LoseMineVein_12336>() {
         public CR2S_LoseMineVein_12336 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_LoseMineVein_12336(input, extensionRegistry);
         }
      };

      private CR2S_LoseMineVein_12336(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_LoseMineVein_12336() {
         this.memoizedIsInitialized = -1;
         this.rewards_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_LoseMineVein_12336();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_LoseMineVein_12336(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.revengeId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.loseTime_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.fallNum_ = input.readInt32();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.rewards_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.rewards_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.durationTime_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 16;
                        this.special_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.rewards_ = Collections.unmodifiableList(this.rewards_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_LoseMineVein_12336_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_LoseMineVein_12336_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_LoseMineVein_12336.class, Builder.class);
      }

      public boolean hasRevengeId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRevengeId() {
         return this.revengeId_;
      }

      public boolean hasLoseTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLoseTime() {
         return this.loseTime_;
      }

      public boolean hasFallNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getFallNum() {
         return this.fallNum_;
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

      public boolean hasDurationTime() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getDurationTime() {
         return this.durationTime_;
      }

      public boolean hasSpecial() {
         return (this.bitField0_ & 16) != 0;
      }

      public boolean getSpecial() {
         return this.special_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRevengeId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLoseTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFallNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDurationTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSpecial()) {
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
            output.writeInt32(1, this.revengeId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.loseTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.fallNum_);
         }

         for(int i = 0; i < this.rewards_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.rewards_.get(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.durationTime_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeBool(6, this.special_);
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
               size += CodedOutputStream.computeInt32Size(1, this.revengeId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.loseTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.fallNum_);
            }

            for(int i = 0; i < this.rewards_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.rewards_.get(i));
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.durationTime_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeBoolSize(6, this.special_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_LoseMineVein_12336)) {
            return super.equals(obj);
         } else {
            CR2S_LoseMineVein_12336 other = (CR2S_LoseMineVein_12336)obj;
            if (this.hasRevengeId() != other.hasRevengeId()) {
               return false;
            } else if (this.hasRevengeId() && this.getRevengeId() != other.getRevengeId()) {
               return false;
            } else if (this.hasLoseTime() != other.hasLoseTime()) {
               return false;
            } else if (this.hasLoseTime() && this.getLoseTime() != other.getLoseTime()) {
               return false;
            } else if (this.hasFallNum() != other.hasFallNum()) {
               return false;
            } else if (this.hasFallNum() && this.getFallNum() != other.getFallNum()) {
               return false;
            } else if (!this.getRewardsList().equals(other.getRewardsList())) {
               return false;
            } else if (this.hasDurationTime() != other.hasDurationTime()) {
               return false;
            } else if (this.hasDurationTime() && this.getDurationTime() != other.getDurationTime()) {
               return false;
            } else if (this.hasSpecial() != other.hasSpecial()) {
               return false;
            } else if (this.hasSpecial() && this.getSpecial() != other.getSpecial()) {
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
            if (this.hasRevengeId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRevengeId();
            }

            if (this.hasLoseTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLoseTime();
            }

            if (this.hasFallNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getFallNum();
            }

            if (this.getRewardsCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getRewardsList().hashCode();
            }

            if (this.hasDurationTime()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getDurationTime();
            }

            if (this.hasSpecial()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashBoolean(this.getSpecial());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_LoseMineVein_12336 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_LoseMineVein_12336)PARSER.parseFrom(data);
      }

      public static CR2S_LoseMineVein_12336 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_LoseMineVein_12336)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_LoseMineVein_12336 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_LoseMineVein_12336)PARSER.parseFrom(data);
      }

      public static CR2S_LoseMineVein_12336 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_LoseMineVein_12336)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_LoseMineVein_12336 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_LoseMineVein_12336)PARSER.parseFrom(data);
      }

      public static CR2S_LoseMineVein_12336 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_LoseMineVein_12336)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_LoseMineVein_12336 parseFrom(InputStream input) throws IOException {
         return (CR2S_LoseMineVein_12336)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_LoseMineVein_12336 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_LoseMineVein_12336)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_LoseMineVein_12336 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_LoseMineVein_12336)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_LoseMineVein_12336 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_LoseMineVein_12336)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_LoseMineVein_12336 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_LoseMineVein_12336)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_LoseMineVein_12336 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_LoseMineVein_12336)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_LoseMineVein_12336 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_LoseMineVein_12336 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_LoseMineVein_12336> parser() {
         return PARSER;
      }

      public Parser<CR2S_LoseMineVein_12336> getParserForType() {
         return PARSER;
      }

      public CR2S_LoseMineVein_12336 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_LoseMineVein_12336OrBuilder {
         private int bitField0_;
         private int revengeId_;
         private int loseTime_;
         private int fallNum_;
         private List<CommonMsg.ItemInfo> rewards_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> rewardsBuilder_;
         private int durationTime_;
         private boolean special_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_LoseMineVein_12336_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_LoseMineVein_12336_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_LoseMineVein_12336.class, Builder.class);
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
            if (CrossMineMsg.CR2S_LoseMineVein_12336.alwaysUseFieldBuilders) {
               this.getRewardsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.revengeId_ = 0;
            this.bitField0_ &= -2;
            this.loseTime_ = 0;
            this.bitField0_ &= -3;
            this.fallNum_ = 0;
            this.bitField0_ &= -5;
            if (this.rewardsBuilder_ == null) {
               this.rewards_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.rewardsBuilder_.clear();
            }

            this.durationTime_ = 0;
            this.bitField0_ &= -17;
            this.special_ = false;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_LoseMineVein_12336_descriptor;
         }

         public CR2S_LoseMineVein_12336 getDefaultInstanceForType() {
            return CrossMineMsg.CR2S_LoseMineVein_12336.getDefaultInstance();
         }

         public CR2S_LoseMineVein_12336 build() {
            CR2S_LoseMineVein_12336 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_LoseMineVein_12336 buildPartial() {
            CR2S_LoseMineVein_12336 result = new CR2S_LoseMineVein_12336(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.revengeId_ = this.revengeId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.loseTime_ = this.loseTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.fallNum_ = this.fallNum_;
               to_bitField0_ |= 4;
            }

            if (this.rewardsBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.rewards_ = Collections.unmodifiableList(this.rewards_);
                  this.bitField0_ &= -9;
               }

               result.rewards_ = this.rewards_;
            } else {
               result.rewards_ = this.rewardsBuilder_.build();
            }

            if ((from_bitField0_ & 16) != 0) {
               result.durationTime_ = this.durationTime_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.special_ = this.special_;
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
            if (other instanceof CR2S_LoseMineVein_12336) {
               return this.mergeFrom((CR2S_LoseMineVein_12336)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_LoseMineVein_12336 other) {
            if (other == CrossMineMsg.CR2S_LoseMineVein_12336.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRevengeId()) {
                  this.setRevengeId(other.getRevengeId());
               }

               if (other.hasLoseTime()) {
                  this.setLoseTime(other.getLoseTime());
               }

               if (other.hasFallNum()) {
                  this.setFallNum(other.getFallNum());
               }

               if (this.rewardsBuilder_ == null) {
                  if (!other.rewards_.isEmpty()) {
                     if (this.rewards_.isEmpty()) {
                        this.rewards_ = other.rewards_;
                        this.bitField0_ &= -9;
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
                     this.bitField0_ &= -9;
                     this.rewardsBuilder_ = CrossMineMsg.CR2S_LoseMineVein_12336.alwaysUseFieldBuilders ? this.getRewardsFieldBuilder() : null;
                  } else {
                     this.rewardsBuilder_.addAllMessages(other.rewards_);
                  }
               }

               if (other.hasDurationTime()) {
                  this.setDurationTime(other.getDurationTime());
               }

               if (other.hasSpecial()) {
                  this.setSpecial(other.getSpecial());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRevengeId()) {
               return false;
            } else if (!this.hasLoseTime()) {
               return false;
            } else if (!this.hasFallNum()) {
               return false;
            } else if (!this.hasDurationTime()) {
               return false;
            } else if (!this.hasSpecial()) {
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
            CR2S_LoseMineVein_12336 parsedMessage = null;

            try {
               parsedMessage = (CR2S_LoseMineVein_12336)CrossMineMsg.CR2S_LoseMineVein_12336.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_LoseMineVein_12336)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRevengeId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRevengeId() {
            return this.revengeId_;
         }

         public Builder setRevengeId(int value) {
            this.bitField0_ |= 1;
            this.revengeId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRevengeId() {
            this.bitField0_ &= -2;
            this.revengeId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLoseTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLoseTime() {
            return this.loseTime_;
         }

         public Builder setLoseTime(int value) {
            this.bitField0_ |= 2;
            this.loseTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLoseTime() {
            this.bitField0_ &= -3;
            this.loseTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFallNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getFallNum() {
            return this.fallNum_;
         }

         public Builder setFallNum(int value) {
            this.bitField0_ |= 4;
            this.fallNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFallNum() {
            this.bitField0_ &= -5;
            this.fallNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRewardsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.rewards_ = new ArrayList(this.rewards_);
               this.bitField0_ |= 8;
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
               this.bitField0_ &= -9;
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
               this.rewardsBuilder_ = new RepeatedFieldBuilderV3(this.rewards_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.rewards_ = null;
            }

            return this.rewardsBuilder_;
         }

         public boolean hasDurationTime() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getDurationTime() {
            return this.durationTime_;
         }

         public Builder setDurationTime(int value) {
            this.bitField0_ |= 16;
            this.durationTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDurationTime() {
            this.bitField0_ &= -17;
            this.durationTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSpecial() {
            return (this.bitField0_ & 32) != 0;
         }

         public boolean getSpecial() {
            return this.special_;
         }

         public Builder setSpecial(boolean value) {
            this.bitField0_ |= 32;
            this.special_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSpecial() {
            this.bitField0_ &= -33;
            this.special_ = false;
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

   public static final class CR2S_UseEnergy_12338 extends GeneratedMessageV3 implements CR2S_UseEnergy_12338OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BFREE_FIELD_NUMBER = 1;
      private boolean bFree_;
      private byte memoizedIsInitialized;
      private static final CR2S_UseEnergy_12338 DEFAULT_INSTANCE = new CR2S_UseEnergy_12338();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UseEnergy_12338> PARSER = new AbstractParser<CR2S_UseEnergy_12338>() {
         public CR2S_UseEnergy_12338 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UseEnergy_12338(input, extensionRegistry);
         }
      };

      private CR2S_UseEnergy_12338(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UseEnergy_12338() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UseEnergy_12338();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UseEnergy_12338(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bFree_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UseEnergy_12338_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UseEnergy_12338_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UseEnergy_12338.class, Builder.class);
      }

      public boolean hasBFree() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getBFree() {
         return this.bFree_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBFree()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.bFree_);
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
               size += CodedOutputStream.computeBoolSize(1, this.bFree_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_UseEnergy_12338)) {
            return super.equals(obj);
         } else {
            CR2S_UseEnergy_12338 other = (CR2S_UseEnergy_12338)obj;
            if (this.hasBFree() != other.hasBFree()) {
               return false;
            } else if (this.hasBFree() && this.getBFree() != other.getBFree()) {
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
            if (this.hasBFree()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getBFree());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_UseEnergy_12338 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UseEnergy_12338)PARSER.parseFrom(data);
      }

      public static CR2S_UseEnergy_12338 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UseEnergy_12338)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UseEnergy_12338 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UseEnergy_12338)PARSER.parseFrom(data);
      }

      public static CR2S_UseEnergy_12338 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UseEnergy_12338)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UseEnergy_12338 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UseEnergy_12338)PARSER.parseFrom(data);
      }

      public static CR2S_UseEnergy_12338 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UseEnergy_12338)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UseEnergy_12338 parseFrom(InputStream input) throws IOException {
         return (CR2S_UseEnergy_12338)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UseEnergy_12338 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UseEnergy_12338)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UseEnergy_12338 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UseEnergy_12338)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UseEnergy_12338 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UseEnergy_12338)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UseEnergy_12338 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UseEnergy_12338)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UseEnergy_12338 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UseEnergy_12338)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UseEnergy_12338 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UseEnergy_12338 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UseEnergy_12338> parser() {
         return PARSER;
      }

      public Parser<CR2S_UseEnergy_12338> getParserForType() {
         return PARSER;
      }

      public CR2S_UseEnergy_12338 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UseEnergy_12338OrBuilder {
         private int bitField0_;
         private boolean bFree_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UseEnergy_12338_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UseEnergy_12338_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UseEnergy_12338.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.CR2S_UseEnergy_12338.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.bFree_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UseEnergy_12338_descriptor;
         }

         public CR2S_UseEnergy_12338 getDefaultInstanceForType() {
            return CrossMineMsg.CR2S_UseEnergy_12338.getDefaultInstance();
         }

         public CR2S_UseEnergy_12338 build() {
            CR2S_UseEnergy_12338 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UseEnergy_12338 buildPartial() {
            CR2S_UseEnergy_12338 result = new CR2S_UseEnergy_12338(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.bFree_ = this.bFree_;
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
            if (other instanceof CR2S_UseEnergy_12338) {
               return this.mergeFrom((CR2S_UseEnergy_12338)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UseEnergy_12338 other) {
            if (other == CrossMineMsg.CR2S_UseEnergy_12338.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBFree()) {
                  this.setBFree(other.getBFree());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBFree();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_UseEnergy_12338 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UseEnergy_12338)CrossMineMsg.CR2S_UseEnergy_12338.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UseEnergy_12338)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBFree() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getBFree() {
            return this.bFree_;
         }

         public Builder setBFree(boolean value) {
            this.bitField0_ |= 1;
            this.bFree_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBFree() {
            this.bitField0_ &= -2;
            this.bFree_ = false;
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

   public static final class CR2S_ClearRevenge_12340 extends GeneratedMessageV3 implements CR2S_ClearRevenge_12340OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final CR2S_ClearRevenge_12340 DEFAULT_INSTANCE = new CR2S_ClearRevenge_12340();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_ClearRevenge_12340> PARSER = new AbstractParser<CR2S_ClearRevenge_12340>() {
         public CR2S_ClearRevenge_12340 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_ClearRevenge_12340(input, extensionRegistry);
         }
      };

      private CR2S_ClearRevenge_12340(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_ClearRevenge_12340() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_ClearRevenge_12340();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_ClearRevenge_12340(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_ClearRevenge_12340_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_ClearRevenge_12340_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ClearRevenge_12340.class, Builder.class);
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
         } else if (!(obj instanceof CR2S_ClearRevenge_12340)) {
            return super.equals(obj);
         } else {
            CR2S_ClearRevenge_12340 other = (CR2S_ClearRevenge_12340)obj;
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

      public static CR2S_ClearRevenge_12340 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_ClearRevenge_12340)PARSER.parseFrom(data);
      }

      public static CR2S_ClearRevenge_12340 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ClearRevenge_12340)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ClearRevenge_12340 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_ClearRevenge_12340)PARSER.parseFrom(data);
      }

      public static CR2S_ClearRevenge_12340 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ClearRevenge_12340)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ClearRevenge_12340 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_ClearRevenge_12340)PARSER.parseFrom(data);
      }

      public static CR2S_ClearRevenge_12340 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ClearRevenge_12340)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ClearRevenge_12340 parseFrom(InputStream input) throws IOException {
         return (CR2S_ClearRevenge_12340)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ClearRevenge_12340 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ClearRevenge_12340)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ClearRevenge_12340 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_ClearRevenge_12340)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_ClearRevenge_12340 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ClearRevenge_12340)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ClearRevenge_12340 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_ClearRevenge_12340)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ClearRevenge_12340 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ClearRevenge_12340)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_ClearRevenge_12340 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_ClearRevenge_12340 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_ClearRevenge_12340> parser() {
         return PARSER;
      }

      public Parser<CR2S_ClearRevenge_12340> getParserForType() {
         return PARSER;
      }

      public CR2S_ClearRevenge_12340 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_ClearRevenge_12340OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_ClearRevenge_12340_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_ClearRevenge_12340_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ClearRevenge_12340.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.CR2S_ClearRevenge_12340.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_ClearRevenge_12340_descriptor;
         }

         public CR2S_ClearRevenge_12340 getDefaultInstanceForType() {
            return CrossMineMsg.CR2S_ClearRevenge_12340.getDefaultInstance();
         }

         public CR2S_ClearRevenge_12340 build() {
            CR2S_ClearRevenge_12340 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_ClearRevenge_12340 buildPartial() {
            CR2S_ClearRevenge_12340 result = new CR2S_ClearRevenge_12340(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_ClearRevenge_12340) {
               return this.mergeFrom((CR2S_ClearRevenge_12340)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_ClearRevenge_12340 other) {
            if (other == CrossMineMsg.CR2S_ClearRevenge_12340.getDefaultInstance()) {
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
            CR2S_ClearRevenge_12340 parsedMessage = null;

            try {
               parsedMessage = (CR2S_ClearRevenge_12340)CrossMineMsg.CR2S_ClearRevenge_12340.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_ClearRevenge_12340)e.getUnfinishedMessage();
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

   public static final class S2CR_MineRank_12341 extends GeneratedMessageV3 implements S2CR_MineRank_12341OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final S2CR_MineRank_12341 DEFAULT_INSTANCE = new S2CR_MineRank_12341();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_MineRank_12341> PARSER = new AbstractParser<S2CR_MineRank_12341>() {
         public S2CR_MineRank_12341 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_MineRank_12341(input, extensionRegistry);
         }
      };

      private S2CR_MineRank_12341(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_MineRank_12341() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_MineRank_12341();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_MineRank_12341(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MineRank_12341_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MineRank_12341_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MineRank_12341.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_MineRank_12341)) {
            return super.equals(obj);
         } else {
            S2CR_MineRank_12341 other = (S2CR_MineRank_12341)obj;
            if (this.hasType() != other.hasType()) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_MineRank_12341 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_MineRank_12341)PARSER.parseFrom(data);
      }

      public static S2CR_MineRank_12341 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MineRank_12341)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MineRank_12341 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_MineRank_12341)PARSER.parseFrom(data);
      }

      public static S2CR_MineRank_12341 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MineRank_12341)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MineRank_12341 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_MineRank_12341)PARSER.parseFrom(data);
      }

      public static S2CR_MineRank_12341 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MineRank_12341)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MineRank_12341 parseFrom(InputStream input) throws IOException {
         return (S2CR_MineRank_12341)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MineRank_12341 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MineRank_12341)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MineRank_12341 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_MineRank_12341)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_MineRank_12341 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MineRank_12341)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MineRank_12341 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_MineRank_12341)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MineRank_12341 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MineRank_12341)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_MineRank_12341 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_MineRank_12341 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_MineRank_12341> parser() {
         return PARSER;
      }

      public Parser<S2CR_MineRank_12341> getParserForType() {
         return PARSER;
      }

      public S2CR_MineRank_12341 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_MineRank_12341OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MineRank_12341_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MineRank_12341_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MineRank_12341.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.S2CR_MineRank_12341.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_MineRank_12341_descriptor;
         }

         public S2CR_MineRank_12341 getDefaultInstanceForType() {
            return CrossMineMsg.S2CR_MineRank_12341.getDefaultInstance();
         }

         public S2CR_MineRank_12341 build() {
            S2CR_MineRank_12341 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_MineRank_12341 buildPartial() {
            S2CR_MineRank_12341 result = new S2CR_MineRank_12341(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof S2CR_MineRank_12341) {
               return this.mergeFrom((S2CR_MineRank_12341)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_MineRank_12341 other) {
            if (other == CrossMineMsg.S2CR_MineRank_12341.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
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
            S2CR_MineRank_12341 parsedMessage = null;

            try {
               parsedMessage = (S2CR_MineRank_12341)CrossMineMsg.S2CR_MineRank_12341.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_MineRank_12341)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_NotifyState_12344 extends GeneratedMessageV3 implements CR2S_NotifyState_12344OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STATE_FIELD_NUMBER = 1;
      private int state_;
      private byte memoizedIsInitialized;
      private static final CR2S_NotifyState_12344 DEFAULT_INSTANCE = new CR2S_NotifyState_12344();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_NotifyState_12344> PARSER = new AbstractParser<CR2S_NotifyState_12344>() {
         public CR2S_NotifyState_12344 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_NotifyState_12344(input, extensionRegistry);
         }
      };

      private CR2S_NotifyState_12344(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_NotifyState_12344() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_NotifyState_12344();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_NotifyState_12344(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_NotifyState_12344_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_NotifyState_12344_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_NotifyState_12344.class, Builder.class);
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
         } else if (!(obj instanceof CR2S_NotifyState_12344)) {
            return super.equals(obj);
         } else {
            CR2S_NotifyState_12344 other = (CR2S_NotifyState_12344)obj;
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

      public static CR2S_NotifyState_12344 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_NotifyState_12344)PARSER.parseFrom(data);
      }

      public static CR2S_NotifyState_12344 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_NotifyState_12344)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_NotifyState_12344 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_NotifyState_12344)PARSER.parseFrom(data);
      }

      public static CR2S_NotifyState_12344 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_NotifyState_12344)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_NotifyState_12344 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_NotifyState_12344)PARSER.parseFrom(data);
      }

      public static CR2S_NotifyState_12344 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_NotifyState_12344)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_NotifyState_12344 parseFrom(InputStream input) throws IOException {
         return (CR2S_NotifyState_12344)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_NotifyState_12344 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_NotifyState_12344)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_NotifyState_12344 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_NotifyState_12344)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_NotifyState_12344 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_NotifyState_12344)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_NotifyState_12344 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_NotifyState_12344)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_NotifyState_12344 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_NotifyState_12344)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_NotifyState_12344 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_NotifyState_12344 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_NotifyState_12344> parser() {
         return PARSER;
      }

      public Parser<CR2S_NotifyState_12344> getParserForType() {
         return PARSER;
      }

      public CR2S_NotifyState_12344 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_NotifyState_12344OrBuilder {
         private int bitField0_;
         private int state_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_NotifyState_12344_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_NotifyState_12344_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_NotifyState_12344.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.CR2S_NotifyState_12344.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.state_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_NotifyState_12344_descriptor;
         }

         public CR2S_NotifyState_12344 getDefaultInstanceForType() {
            return CrossMineMsg.CR2S_NotifyState_12344.getDefaultInstance();
         }

         public CR2S_NotifyState_12344 build() {
            CR2S_NotifyState_12344 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_NotifyState_12344 buildPartial() {
            CR2S_NotifyState_12344 result = new CR2S_NotifyState_12344(this);
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
            if (other instanceof CR2S_NotifyState_12344) {
               return this.mergeFrom((CR2S_NotifyState_12344)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_NotifyState_12344 other) {
            if (other == CrossMineMsg.CR2S_NotifyState_12344.getDefaultInstance()) {
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
            CR2S_NotifyState_12344 parsedMessage = null;

            try {
               parsedMessage = (CR2S_NotifyState_12344)CrossMineMsg.CR2S_NotifyState_12344.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_NotifyState_12344)e.getUnfinishedMessage();
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

   public static final class S2CR_DefArraying_12345 extends GeneratedMessageV3 implements S2CR_DefArraying_12345OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROARRAYINGDATA_FIELD_NUMBER = 1;
      private ByteString heroArrayingData_;
      public static final int HEROMIRROR_FIELD_NUMBER = 2;
      private ByteString heroMirror_;
      public static final int HEROPOS_FIELD_NUMBER = 3;
      private int heroPos_;
      private byte memoizedIsInitialized;
      private static final S2CR_DefArraying_12345 DEFAULT_INSTANCE = new S2CR_DefArraying_12345();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_DefArraying_12345> PARSER = new AbstractParser<S2CR_DefArraying_12345>() {
         public S2CR_DefArraying_12345 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_DefArraying_12345(input, extensionRegistry);
         }
      };

      private S2CR_DefArraying_12345(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_DefArraying_12345() {
         this.memoizedIsInitialized = -1;
         this.heroArrayingData_ = ByteString.EMPTY;
         this.heroMirror_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_DefArraying_12345();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_DefArraying_12345(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroArrayingData_ = input.readBytes();
                        break;
                     case 18:
                        this.bitField0_ |= 2;
                        this.heroMirror_ = input.readBytes();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.heroPos_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_DefArraying_12345_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_DefArraying_12345_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_DefArraying_12345.class, Builder.class);
      }

      public boolean hasHeroArrayingData() {
         return (this.bitField0_ & 1) != 0;
      }

      public ByteString getHeroArrayingData() {
         return this.heroArrayingData_;
      }

      public boolean hasHeroMirror() {
         return (this.bitField0_ & 2) != 0;
      }

      public ByteString getHeroMirror() {
         return this.heroMirror_;
      }

      public boolean hasHeroPos() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHeroPos() {
         return this.heroPos_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroArrayingData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBytes(1, this.heroArrayingData_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBytes(2, this.heroMirror_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.heroPos_);
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
               size += CodedOutputStream.computeBytesSize(1, this.heroArrayingData_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBytesSize(2, this.heroMirror_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.heroPos_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_DefArraying_12345)) {
            return super.equals(obj);
         } else {
            S2CR_DefArraying_12345 other = (S2CR_DefArraying_12345)obj;
            if (this.hasHeroArrayingData() != other.hasHeroArrayingData()) {
               return false;
            } else if (this.hasHeroArrayingData() && !this.getHeroArrayingData().equals(other.getHeroArrayingData())) {
               return false;
            } else if (this.hasHeroMirror() != other.hasHeroMirror()) {
               return false;
            } else if (this.hasHeroMirror() && !this.getHeroMirror().equals(other.getHeroMirror())) {
               return false;
            } else if (this.hasHeroPos() != other.hasHeroPos()) {
               return false;
            } else if (this.hasHeroPos() && this.getHeroPos() != other.getHeroPos()) {
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
            if (this.hasHeroArrayingData()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroArrayingData().hashCode();
            }

            if (this.hasHeroMirror()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroMirror().hashCode();
            }

            if (this.hasHeroPos()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHeroPos();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_DefArraying_12345 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_DefArraying_12345)PARSER.parseFrom(data);
      }

      public static S2CR_DefArraying_12345 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DefArraying_12345)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DefArraying_12345 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_DefArraying_12345)PARSER.parseFrom(data);
      }

      public static S2CR_DefArraying_12345 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DefArraying_12345)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DefArraying_12345 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_DefArraying_12345)PARSER.parseFrom(data);
      }

      public static S2CR_DefArraying_12345 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DefArraying_12345)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DefArraying_12345 parseFrom(InputStream input) throws IOException {
         return (S2CR_DefArraying_12345)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_DefArraying_12345 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DefArraying_12345)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_DefArraying_12345 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_DefArraying_12345)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_DefArraying_12345 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DefArraying_12345)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_DefArraying_12345 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_DefArraying_12345)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_DefArraying_12345 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DefArraying_12345)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_DefArraying_12345 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_DefArraying_12345 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_DefArraying_12345> parser() {
         return PARSER;
      }

      public Parser<S2CR_DefArraying_12345> getParserForType() {
         return PARSER;
      }

      public S2CR_DefArraying_12345 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_DefArraying_12345OrBuilder {
         private int bitField0_;
         private ByteString heroArrayingData_;
         private ByteString heroMirror_;
         private int heroPos_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_DefArraying_12345_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_DefArraying_12345_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_DefArraying_12345.class, Builder.class);
         }

         private Builder() {
            this.heroArrayingData_ = ByteString.EMPTY;
            this.heroMirror_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroArrayingData_ = ByteString.EMPTY;
            this.heroMirror_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.S2CR_DefArraying_12345.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroArrayingData_ = ByteString.EMPTY;
            this.bitField0_ &= -2;
            this.heroMirror_ = ByteString.EMPTY;
            this.bitField0_ &= -3;
            this.heroPos_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_DefArraying_12345_descriptor;
         }

         public S2CR_DefArraying_12345 getDefaultInstanceForType() {
            return CrossMineMsg.S2CR_DefArraying_12345.getDefaultInstance();
         }

         public S2CR_DefArraying_12345 build() {
            S2CR_DefArraying_12345 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_DefArraying_12345 buildPartial() {
            S2CR_DefArraying_12345 result = new S2CR_DefArraying_12345(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.heroArrayingData_ = this.heroArrayingData_;
            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.heroMirror_ = this.heroMirror_;
            if ((from_bitField0_ & 4) != 0) {
               result.heroPos_ = this.heroPos_;
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
            if (other instanceof S2CR_DefArraying_12345) {
               return this.mergeFrom((S2CR_DefArraying_12345)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_DefArraying_12345 other) {
            if (other == CrossMineMsg.S2CR_DefArraying_12345.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroArrayingData()) {
                  this.setHeroArrayingData(other.getHeroArrayingData());
               }

               if (other.hasHeroMirror()) {
                  this.setHeroMirror(other.getHeroMirror());
               }

               if (other.hasHeroPos()) {
                  this.setHeroPos(other.getHeroPos());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroArrayingData()) {
               return false;
            } else {
               return this.hasHeroPos();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_DefArraying_12345 parsedMessage = null;

            try {
               parsedMessage = (S2CR_DefArraying_12345)CrossMineMsg.S2CR_DefArraying_12345.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_DefArraying_12345)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroArrayingData() {
            return (this.bitField0_ & 1) != 0;
         }

         public ByteString getHeroArrayingData() {
            return this.heroArrayingData_;
         }

         public Builder setHeroArrayingData(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.heroArrayingData_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearHeroArrayingData() {
            this.bitField0_ &= -2;
            this.heroArrayingData_ = CrossMineMsg.S2CR_DefArraying_12345.getDefaultInstance().getHeroArrayingData();
            this.onChanged();
            return this;
         }

         public boolean hasHeroMirror() {
            return (this.bitField0_ & 2) != 0;
         }

         public ByteString getHeroMirror() {
            return this.heroMirror_;
         }

         public Builder setHeroMirror(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.heroMirror_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearHeroMirror() {
            this.bitField0_ &= -3;
            this.heroMirror_ = CrossMineMsg.S2CR_DefArraying_12345.getDefaultInstance().getHeroMirror();
            this.onChanged();
            return this;
         }

         public boolean hasHeroPos() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getHeroPos() {
            return this.heroPos_;
         }

         public Builder setHeroPos(int value) {
            this.bitField0_ |= 4;
            this.heroPos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroPos() {
            this.bitField0_ &= -5;
            this.heroPos_ = 0;
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

   public static final class CR2S_DefArraying_12346 extends GeneratedMessageV3 implements CR2S_DefArraying_12346OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int HEROPOS_FIELD_NUMBER = 2;
      private int heroPos_;
      private byte memoizedIsInitialized;
      private static final CR2S_DefArraying_12346 DEFAULT_INSTANCE = new CR2S_DefArraying_12346();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_DefArraying_12346> PARSER = new AbstractParser<CR2S_DefArraying_12346>() {
         public CR2S_DefArraying_12346 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_DefArraying_12346(input, extensionRegistry);
         }
      };

      private CR2S_DefArraying_12346(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_DefArraying_12346() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_DefArraying_12346();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_DefArraying_12346(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroPos_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_DefArraying_12346_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_DefArraying_12346_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_DefArraying_12346.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasHeroPos() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHeroPos() {
         return this.heroPos_;
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
         } else if (!this.hasHeroPos()) {
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
            output.writeInt32(2, this.heroPos_);
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
               size += CodedOutputStream.computeInt32Size(2, this.heroPos_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_DefArraying_12346)) {
            return super.equals(obj);
         } else {
            CR2S_DefArraying_12346 other = (CR2S_DefArraying_12346)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasHeroPos() != other.hasHeroPos()) {
               return false;
            } else if (this.hasHeroPos() && this.getHeroPos() != other.getHeroPos()) {
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

            if (this.hasHeroPos()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroPos();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_DefArraying_12346 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_DefArraying_12346)PARSER.parseFrom(data);
      }

      public static CR2S_DefArraying_12346 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_DefArraying_12346)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_DefArraying_12346 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_DefArraying_12346)PARSER.parseFrom(data);
      }

      public static CR2S_DefArraying_12346 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_DefArraying_12346)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_DefArraying_12346 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_DefArraying_12346)PARSER.parseFrom(data);
      }

      public static CR2S_DefArraying_12346 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_DefArraying_12346)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_DefArraying_12346 parseFrom(InputStream input) throws IOException {
         return (CR2S_DefArraying_12346)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_DefArraying_12346 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_DefArraying_12346)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_DefArraying_12346 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_DefArraying_12346)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_DefArraying_12346 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_DefArraying_12346)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_DefArraying_12346 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_DefArraying_12346)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_DefArraying_12346 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_DefArraying_12346)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_DefArraying_12346 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_DefArraying_12346 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_DefArraying_12346> parser() {
         return PARSER;
      }

      public Parser<CR2S_DefArraying_12346> getParserForType() {
         return PARSER;
      }

      public CR2S_DefArraying_12346 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_DefArraying_12346OrBuilder {
         private int bitField0_;
         private int result_;
         private int heroPos_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_DefArraying_12346_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_DefArraying_12346_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_DefArraying_12346.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.CR2S_DefArraying_12346.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.heroPos_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_DefArraying_12346_descriptor;
         }

         public CR2S_DefArraying_12346 getDefaultInstanceForType() {
            return CrossMineMsg.CR2S_DefArraying_12346.getDefaultInstance();
         }

         public CR2S_DefArraying_12346 build() {
            CR2S_DefArraying_12346 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_DefArraying_12346 buildPartial() {
            CR2S_DefArraying_12346 result = new CR2S_DefArraying_12346(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.heroPos_ = this.heroPos_;
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
            if (other instanceof CR2S_DefArraying_12346) {
               return this.mergeFrom((CR2S_DefArraying_12346)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_DefArraying_12346 other) {
            if (other == CrossMineMsg.CR2S_DefArraying_12346.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasHeroPos()) {
                  this.setHeroPos(other.getHeroPos());
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
               return this.hasHeroPos();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_DefArraying_12346 parsedMessage = null;

            try {
               parsedMessage = (CR2S_DefArraying_12346)CrossMineMsg.CR2S_DefArraying_12346.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_DefArraying_12346)e.getUnfinishedMessage();
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

         public boolean hasHeroPos() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHeroPos() {
            return this.heroPos_;
         }

         public Builder setHeroPos(int value) {
            this.bitField0_ |= 2;
            this.heroPos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroPos() {
            this.bitField0_ &= -3;
            this.heroPos_ = 0;
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

   public static final class CR2S_RankReward_12348 extends GeneratedMessageV3 implements CR2S_RankReward_12348OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int RANKINFO_FIELD_NUMBER = 2;
      private LazyStringList rankInfo_;
      private byte memoizedIsInitialized;
      private static final CR2S_RankReward_12348 DEFAULT_INSTANCE = new CR2S_RankReward_12348();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_RankReward_12348> PARSER = new AbstractParser<CR2S_RankReward_12348>() {
         public CR2S_RankReward_12348 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_RankReward_12348(input, extensionRegistry);
         }
      };

      private CR2S_RankReward_12348(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_RankReward_12348() {
         this.memoizedIsInitialized = -1;
         this.rankInfo_ = LazyStringArrayList.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_RankReward_12348();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_RankReward_12348(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        ByteString bs = input.readBytes();
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.rankInfo_ = new LazyStringArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.rankInfo_.add(bs);
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.rankInfo_ = this.rankInfo_.getUnmodifiableView();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_RankReward_12348_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_RankReward_12348_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_RankReward_12348.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public ProtocolStringList getRankInfoList() {
         return this.rankInfo_;
      }

      public int getRankInfoCount() {
         return this.rankInfo_.size();
      }

      public String getRankInfo(int index) {
         return (String)this.rankInfo_.get(index);
      }

      public ByteString getRankInfoBytes(int index) {
         return this.rankInfo_.getByteString(index);
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

         for(int i = 0; i < this.rankInfo_.size(); ++i) {
            GeneratedMessageV3.writeString(output, 2, this.rankInfo_.getRaw(i));
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

            int dataSize = 0;

            for(int i = 0; i < this.rankInfo_.size(); ++i) {
               dataSize += computeStringSizeNoTag(this.rankInfo_.getRaw(i));
            }

            size += dataSize;
            size += 1 * this.getRankInfoList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_RankReward_12348)) {
            return super.equals(obj);
         } else {
            CR2S_RankReward_12348 other = (CR2S_RankReward_12348)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (!this.getRankInfoList().equals(other.getRankInfoList())) {
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

            if (this.getRankInfoCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRankInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_RankReward_12348 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_RankReward_12348)PARSER.parseFrom(data);
      }

      public static CR2S_RankReward_12348 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RankReward_12348)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RankReward_12348 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_RankReward_12348)PARSER.parseFrom(data);
      }

      public static CR2S_RankReward_12348 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RankReward_12348)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RankReward_12348 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_RankReward_12348)PARSER.parseFrom(data);
      }

      public static CR2S_RankReward_12348 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RankReward_12348)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RankReward_12348 parseFrom(InputStream input) throws IOException {
         return (CR2S_RankReward_12348)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_RankReward_12348 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RankReward_12348)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_RankReward_12348 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_RankReward_12348)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_RankReward_12348 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RankReward_12348)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_RankReward_12348 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_RankReward_12348)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_RankReward_12348 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RankReward_12348)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_RankReward_12348 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_RankReward_12348 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_RankReward_12348> parser() {
         return PARSER;
      }

      public Parser<CR2S_RankReward_12348> getParserForType() {
         return PARSER;
      }

      public CR2S_RankReward_12348 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_RankReward_12348OrBuilder {
         private int bitField0_;
         private int type_;
         private LazyStringList rankInfo_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_RankReward_12348_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_RankReward_12348_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_RankReward_12348.class, Builder.class);
         }

         private Builder() {
            this.rankInfo_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rankInfo_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.CR2S_RankReward_12348.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.rankInfo_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_RankReward_12348_descriptor;
         }

         public CR2S_RankReward_12348 getDefaultInstanceForType() {
            return CrossMineMsg.CR2S_RankReward_12348.getDefaultInstance();
         }

         public CR2S_RankReward_12348 build() {
            CR2S_RankReward_12348 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_RankReward_12348 buildPartial() {
            CR2S_RankReward_12348 result = new CR2S_RankReward_12348(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.rankInfo_ = this.rankInfo_.getUnmodifiableView();
               this.bitField0_ &= -3;
            }

            result.rankInfo_ = this.rankInfo_;
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
            if (other instanceof CR2S_RankReward_12348) {
               return this.mergeFrom((CR2S_RankReward_12348)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_RankReward_12348 other) {
            if (other == CrossMineMsg.CR2S_RankReward_12348.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (!other.rankInfo_.isEmpty()) {
                  if (this.rankInfo_.isEmpty()) {
                     this.rankInfo_ = other.rankInfo_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureRankInfoIsMutable();
                     this.rankInfo_.addAll(other.rankInfo_);
                  }

                  this.onChanged();
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
            CR2S_RankReward_12348 parsedMessage = null;

            try {
               parsedMessage = (CR2S_RankReward_12348)CrossMineMsg.CR2S_RankReward_12348.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_RankReward_12348)e.getUnfinishedMessage();
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

         private void ensureRankInfoIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.rankInfo_ = new LazyStringArrayList(this.rankInfo_);
               this.bitField0_ |= 2;
            }

         }

         public ProtocolStringList getRankInfoList() {
            return this.rankInfo_.getUnmodifiableView();
         }

         public int getRankInfoCount() {
            return this.rankInfo_.size();
         }

         public String getRankInfo(int index) {
            return (String)this.rankInfo_.get(index);
         }

         public ByteString getRankInfoBytes(int index) {
            return this.rankInfo_.getByteString(index);
         }

         public Builder setRankInfo(int index, String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRankInfoIsMutable();
               this.rankInfo_.set(index, value);
               this.onChanged();
               return this;
            }
         }

         public Builder addRankInfo(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRankInfoIsMutable();
               this.rankInfo_.add(value);
               this.onChanged();
               return this;
            }
         }

         public Builder addAllRankInfo(Iterable<String> values) {
            this.ensureRankInfoIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rankInfo_);
            this.onChanged();
            return this;
         }

         public Builder clearRankInfo() {
            this.rankInfo_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public Builder addRankInfoBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRankInfoIsMutable();
               this.rankInfo_.add(value);
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

   public static final class S2CR_ChangeLine_12349 extends GeneratedMessageV3 implements S2CR_ChangeLine_12349OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LINE_FIELD_NUMBER = 1;
      private int line_;
      private byte memoizedIsInitialized;
      private static final S2CR_ChangeLine_12349 DEFAULT_INSTANCE = new S2CR_ChangeLine_12349();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_ChangeLine_12349> PARSER = new AbstractParser<S2CR_ChangeLine_12349>() {
         public S2CR_ChangeLine_12349 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_ChangeLine_12349(input, extensionRegistry);
         }
      };

      private S2CR_ChangeLine_12349(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_ChangeLine_12349() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_ChangeLine_12349();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_ChangeLine_12349(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.line_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_ChangeLine_12349_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_ChangeLine_12349_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ChangeLine_12349.class, Builder.class);
      }

      public boolean hasLine() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLine() {
         return this.line_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLine()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.line_);
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
               size += CodedOutputStream.computeInt32Size(1, this.line_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_ChangeLine_12349)) {
            return super.equals(obj);
         } else {
            S2CR_ChangeLine_12349 other = (S2CR_ChangeLine_12349)obj;
            if (this.hasLine() != other.hasLine()) {
               return false;
            } else if (this.hasLine() && this.getLine() != other.getLine()) {
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
            if (this.hasLine()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLine();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_ChangeLine_12349 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_ChangeLine_12349)PARSER.parseFrom(data);
      }

      public static S2CR_ChangeLine_12349 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ChangeLine_12349)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ChangeLine_12349 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_ChangeLine_12349)PARSER.parseFrom(data);
      }

      public static S2CR_ChangeLine_12349 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ChangeLine_12349)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ChangeLine_12349 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_ChangeLine_12349)PARSER.parseFrom(data);
      }

      public static S2CR_ChangeLine_12349 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ChangeLine_12349)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ChangeLine_12349 parseFrom(InputStream input) throws IOException {
         return (S2CR_ChangeLine_12349)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ChangeLine_12349 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ChangeLine_12349)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ChangeLine_12349 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_ChangeLine_12349)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_ChangeLine_12349 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ChangeLine_12349)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ChangeLine_12349 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_ChangeLine_12349)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ChangeLine_12349 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ChangeLine_12349)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_ChangeLine_12349 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_ChangeLine_12349 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_ChangeLine_12349> parser() {
         return PARSER;
      }

      public Parser<S2CR_ChangeLine_12349> getParserForType() {
         return PARSER;
      }

      public S2CR_ChangeLine_12349 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_ChangeLine_12349OrBuilder {
         private int bitField0_;
         private int line_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_ChangeLine_12349_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_ChangeLine_12349_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ChangeLine_12349.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.S2CR_ChangeLine_12349.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.line_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_ChangeLine_12349_descriptor;
         }

         public S2CR_ChangeLine_12349 getDefaultInstanceForType() {
            return CrossMineMsg.S2CR_ChangeLine_12349.getDefaultInstance();
         }

         public S2CR_ChangeLine_12349 build() {
            S2CR_ChangeLine_12349 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_ChangeLine_12349 buildPartial() {
            S2CR_ChangeLine_12349 result = new S2CR_ChangeLine_12349(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.line_ = this.line_;
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
            if (other instanceof S2CR_ChangeLine_12349) {
               return this.mergeFrom((S2CR_ChangeLine_12349)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_ChangeLine_12349 other) {
            if (other == CrossMineMsg.S2CR_ChangeLine_12349.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLine()) {
                  this.setLine(other.getLine());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasLine();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_ChangeLine_12349 parsedMessage = null;

            try {
               parsedMessage = (S2CR_ChangeLine_12349)CrossMineMsg.S2CR_ChangeLine_12349.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_ChangeLine_12349)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLine() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getLine() {
            return this.line_;
         }

         public Builder setLine(int value) {
            this.bitField0_ |= 1;
            this.line_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLine() {
            this.bitField0_ &= -2;
            this.line_ = 0;
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

   public static final class CR2S_AddLine_12352 extends GeneratedMessageV3 implements CR2S_AddLine_12352OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TOTALLINE_FIELD_NUMBER = 1;
      private int totalLine_;
      private byte memoizedIsInitialized;
      private static final CR2S_AddLine_12352 DEFAULT_INSTANCE = new CR2S_AddLine_12352();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_AddLine_12352> PARSER = new AbstractParser<CR2S_AddLine_12352>() {
         public CR2S_AddLine_12352 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_AddLine_12352(input, extensionRegistry);
         }
      };

      private CR2S_AddLine_12352(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_AddLine_12352() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_AddLine_12352();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_AddLine_12352(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.totalLine_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_AddLine_12352_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_AddLine_12352_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_AddLine_12352.class, Builder.class);
      }

      public boolean hasTotalLine() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTotalLine() {
         return this.totalLine_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTotalLine()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.totalLine_);
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
               size += CodedOutputStream.computeInt32Size(1, this.totalLine_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_AddLine_12352)) {
            return super.equals(obj);
         } else {
            CR2S_AddLine_12352 other = (CR2S_AddLine_12352)obj;
            if (this.hasTotalLine() != other.hasTotalLine()) {
               return false;
            } else if (this.hasTotalLine() && this.getTotalLine() != other.getTotalLine()) {
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
            if (this.hasTotalLine()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTotalLine();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_AddLine_12352 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_AddLine_12352)PARSER.parseFrom(data);
      }

      public static CR2S_AddLine_12352 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_AddLine_12352)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_AddLine_12352 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_AddLine_12352)PARSER.parseFrom(data);
      }

      public static CR2S_AddLine_12352 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_AddLine_12352)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_AddLine_12352 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_AddLine_12352)PARSER.parseFrom(data);
      }

      public static CR2S_AddLine_12352 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_AddLine_12352)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_AddLine_12352 parseFrom(InputStream input) throws IOException {
         return (CR2S_AddLine_12352)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_AddLine_12352 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_AddLine_12352)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_AddLine_12352 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_AddLine_12352)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_AddLine_12352 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_AddLine_12352)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_AddLine_12352 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_AddLine_12352)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_AddLine_12352 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_AddLine_12352)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_AddLine_12352 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_AddLine_12352 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_AddLine_12352> parser() {
         return PARSER;
      }

      public Parser<CR2S_AddLine_12352> getParserForType() {
         return PARSER;
      }

      public CR2S_AddLine_12352 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_AddLine_12352OrBuilder {
         private int bitField0_;
         private int totalLine_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_AddLine_12352_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_AddLine_12352_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_AddLine_12352.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.CR2S_AddLine_12352.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.totalLine_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_AddLine_12352_descriptor;
         }

         public CR2S_AddLine_12352 getDefaultInstanceForType() {
            return CrossMineMsg.CR2S_AddLine_12352.getDefaultInstance();
         }

         public CR2S_AddLine_12352 build() {
            CR2S_AddLine_12352 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_AddLine_12352 buildPartial() {
            CR2S_AddLine_12352 result = new CR2S_AddLine_12352(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.totalLine_ = this.totalLine_;
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
            if (other instanceof CR2S_AddLine_12352) {
               return this.mergeFrom((CR2S_AddLine_12352)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_AddLine_12352 other) {
            if (other == CrossMineMsg.CR2S_AddLine_12352.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTotalLine()) {
                  this.setTotalLine(other.getTotalLine());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTotalLine();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_AddLine_12352 parsedMessage = null;

            try {
               parsedMessage = (CR2S_AddLine_12352)CrossMineMsg.CR2S_AddLine_12352.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_AddLine_12352)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTotalLine() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTotalLine() {
            return this.totalLine_;
         }

         public Builder setTotalLine(int value) {
            this.bitField0_ |= 1;
            this.totalLine_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalLine() {
            this.bitField0_ &= -2;
            this.totalLine_ = 0;
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

   public static final class S2CR_RedDotState_12353 extends GeneratedMessageV3 implements S2CR_RedDotState_12353OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int REDSTATE_FIELD_NUMBER = 1;
      private List<Integer> redState_;
      private static final Internal.ListAdapter.Converter<Integer, MineMsg.RedState> redState_converter_ = new Internal.ListAdapter.Converter<Integer, MineMsg.RedState>() {
         public MineMsg.RedState convert(Integer from) {
            MineMsg.RedState result = MineMsg.RedState.valueOf(from);
            return result == null ? MineMsg.RedState.SUPPORT : result;
         }
      };
      private byte memoizedIsInitialized;
      private static final S2CR_RedDotState_12353 DEFAULT_INSTANCE = new S2CR_RedDotState_12353();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_RedDotState_12353> PARSER = new AbstractParser<S2CR_RedDotState_12353>() {
         public S2CR_RedDotState_12353 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_RedDotState_12353(input, extensionRegistry);
         }
      };

      private S2CR_RedDotState_12353(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_RedDotState_12353() {
         this.memoizedIsInitialized = -1;
         this.redState_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_RedDotState_12353();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_RedDotState_12353(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        int rawValue = input.readEnum();
                        MineMsg.RedState value = MineMsg.RedState.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           if ((mutable_bitField0_ & 1) == 0) {
                              this.redState_ = new ArrayList();
                              mutable_bitField0_ |= 1;
                           }

                           this.redState_.add(rawValue);
                        }
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int oldLimit = input.pushLimit(length);

                        while(input.getBytesUntilLimit() > 0) {
                           int rawValue = input.readEnum();
                           MineMsg.RedState value = MineMsg.RedState.valueOf(rawValue);
                           if (value == null) {
                              unknownFields.mergeVarintField(1, rawValue);
                           } else {
                              if ((mutable_bitField0_ & 1) == 0) {
                                 this.redState_ = new ArrayList();
                                 mutable_bitField0_ |= 1;
                              }

                              this.redState_.add(rawValue);
                           }
                        }

                        input.popLimit(oldLimit);
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.redState_ = Collections.unmodifiableList(this.redState_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_RedDotState_12353_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_RedDotState_12353_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_RedDotState_12353.class, Builder.class);
      }

      public List<MineMsg.RedState> getRedStateList() {
         return new Internal.ListAdapter(this.redState_, redState_converter_);
      }

      public int getRedStateCount() {
         return this.redState_.size();
      }

      public MineMsg.RedState getRedState(int index) {
         return (MineMsg.RedState)redState_converter_.convert(this.redState_.get(index));
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
         for(int i = 0; i < this.redState_.size(); ++i) {
            output.writeEnum(1, (Integer)this.redState_.get(i));
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

            for(int i = 0; i < this.redState_.size(); ++i) {
               dataSize += CodedOutputStream.computeEnumSizeNoTag((Integer)this.redState_.get(i));
            }

            size += dataSize;
            size += 1 * this.redState_.size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_RedDotState_12353)) {
            return super.equals(obj);
         } else {
            S2CR_RedDotState_12353 other = (S2CR_RedDotState_12353)obj;
            if (!this.redState_.equals(other.redState_)) {
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
            if (this.getRedStateCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.redState_.hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_RedDotState_12353 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_RedDotState_12353)PARSER.parseFrom(data);
      }

      public static S2CR_RedDotState_12353 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RedDotState_12353)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RedDotState_12353 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_RedDotState_12353)PARSER.parseFrom(data);
      }

      public static S2CR_RedDotState_12353 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RedDotState_12353)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RedDotState_12353 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_RedDotState_12353)PARSER.parseFrom(data);
      }

      public static S2CR_RedDotState_12353 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RedDotState_12353)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RedDotState_12353 parseFrom(InputStream input) throws IOException {
         return (S2CR_RedDotState_12353)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_RedDotState_12353 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RedDotState_12353)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_RedDotState_12353 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_RedDotState_12353)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_RedDotState_12353 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RedDotState_12353)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_RedDotState_12353 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_RedDotState_12353)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_RedDotState_12353 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RedDotState_12353)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_RedDotState_12353 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_RedDotState_12353 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_RedDotState_12353> parser() {
         return PARSER;
      }

      public Parser<S2CR_RedDotState_12353> getParserForType() {
         return PARSER;
      }

      public S2CR_RedDotState_12353 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_RedDotState_12353OrBuilder {
         private int bitField0_;
         private List<Integer> redState_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_RedDotState_12353_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_RedDotState_12353_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_RedDotState_12353.class, Builder.class);
         }

         private Builder() {
            this.redState_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.redState_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.S2CR_RedDotState_12353.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.redState_ = Collections.emptyList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_RedDotState_12353_descriptor;
         }

         public S2CR_RedDotState_12353 getDefaultInstanceForType() {
            return CrossMineMsg.S2CR_RedDotState_12353.getDefaultInstance();
         }

         public S2CR_RedDotState_12353 build() {
            S2CR_RedDotState_12353 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_RedDotState_12353 buildPartial() {
            S2CR_RedDotState_12353 result = new S2CR_RedDotState_12353(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.redState_ = Collections.unmodifiableList(this.redState_);
               this.bitField0_ &= -2;
            }

            result.redState_ = this.redState_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_RedDotState_12353) {
               return this.mergeFrom((S2CR_RedDotState_12353)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_RedDotState_12353 other) {
            if (other == CrossMineMsg.S2CR_RedDotState_12353.getDefaultInstance()) {
               return this;
            } else {
               if (!other.redState_.isEmpty()) {
                  if (this.redState_.isEmpty()) {
                     this.redState_ = other.redState_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureRedStateIsMutable();
                     this.redState_.addAll(other.redState_);
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
            S2CR_RedDotState_12353 parsedMessage = null;

            try {
               parsedMessage = (S2CR_RedDotState_12353)CrossMineMsg.S2CR_RedDotState_12353.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_RedDotState_12353)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRedStateIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.redState_ = new ArrayList(this.redState_);
               this.bitField0_ |= 1;
            }

         }

         public List<MineMsg.RedState> getRedStateList() {
            return new Internal.ListAdapter(this.redState_, CrossMineMsg.S2CR_RedDotState_12353.redState_converter_);
         }

         public int getRedStateCount() {
            return this.redState_.size();
         }

         public MineMsg.RedState getRedState(int index) {
            return (MineMsg.RedState)CrossMineMsg.S2CR_RedDotState_12353.redState_converter_.convert(this.redState_.get(index));
         }

         public Builder setRedState(int index, MineMsg.RedState value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRedStateIsMutable();
               this.redState_.set(index, value.getNumber());
               this.onChanged();
               return this;
            }
         }

         public Builder addRedState(MineMsg.RedState value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRedStateIsMutable();
               this.redState_.add(value.getNumber());
               this.onChanged();
               return this;
            }
         }

         public Builder addAllRedState(Iterable<? extends MineMsg.RedState> values) {
            this.ensureRedStateIsMutable();

            for(MineMsg.RedState value : values) {
               this.redState_.add(value.getNumber());
            }

            this.onChanged();
            return this;
         }

         public Builder clearRedState() {
            this.redState_ = Collections.emptyList();
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

   public static final class CR2S_ChangInfo_12358 extends GeneratedMessageV3 implements CR2S_ChangInfo_12358OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int CHANGEINFO_FIELD_NUMBER = 1;
      private List<MineMsg.Chaneg_Info> changeInfo_;
      private byte memoizedIsInitialized;
      private static final CR2S_ChangInfo_12358 DEFAULT_INSTANCE = new CR2S_ChangInfo_12358();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_ChangInfo_12358> PARSER = new AbstractParser<CR2S_ChangInfo_12358>() {
         public CR2S_ChangInfo_12358 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_ChangInfo_12358(input, extensionRegistry);
         }
      };

      private CR2S_ChangInfo_12358(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_ChangInfo_12358() {
         this.memoizedIsInitialized = -1;
         this.changeInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_ChangInfo_12358();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_ChangInfo_12358(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.changeInfo_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.changeInfo_.add(input.readMessage(MineMsg.Chaneg_Info.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.changeInfo_ = Collections.unmodifiableList(this.changeInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_ChangInfo_12358_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_ChangInfo_12358_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ChangInfo_12358.class, Builder.class);
      }

      public List<MineMsg.Chaneg_Info> getChangeInfoList() {
         return this.changeInfo_;
      }

      public List<? extends MineMsg.Chaneg_InfoOrBuilder> getChangeInfoOrBuilderList() {
         return this.changeInfo_;
      }

      public int getChangeInfoCount() {
         return this.changeInfo_.size();
      }

      public MineMsg.Chaneg_Info getChangeInfo(int index) {
         return (MineMsg.Chaneg_Info)this.changeInfo_.get(index);
      }

      public MineMsg.Chaneg_InfoOrBuilder getChangeInfoOrBuilder(int index) {
         return (MineMsg.Chaneg_InfoOrBuilder)this.changeInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getChangeInfoCount(); ++i) {
               if (!this.getChangeInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.changeInfo_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.changeInfo_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.changeInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.changeInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_ChangInfo_12358)) {
            return super.equals(obj);
         } else {
            CR2S_ChangInfo_12358 other = (CR2S_ChangInfo_12358)obj;
            if (!this.getChangeInfoList().equals(other.getChangeInfoList())) {
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
            if (this.getChangeInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChangeInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_ChangInfo_12358 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_ChangInfo_12358)PARSER.parseFrom(data);
      }

      public static CR2S_ChangInfo_12358 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ChangInfo_12358)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ChangInfo_12358 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_ChangInfo_12358)PARSER.parseFrom(data);
      }

      public static CR2S_ChangInfo_12358 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ChangInfo_12358)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ChangInfo_12358 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_ChangInfo_12358)PARSER.parseFrom(data);
      }

      public static CR2S_ChangInfo_12358 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ChangInfo_12358)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ChangInfo_12358 parseFrom(InputStream input) throws IOException {
         return (CR2S_ChangInfo_12358)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ChangInfo_12358 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ChangInfo_12358)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ChangInfo_12358 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_ChangInfo_12358)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_ChangInfo_12358 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ChangInfo_12358)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ChangInfo_12358 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_ChangInfo_12358)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ChangInfo_12358 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ChangInfo_12358)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_ChangInfo_12358 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_ChangInfo_12358 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_ChangInfo_12358> parser() {
         return PARSER;
      }

      public Parser<CR2S_ChangInfo_12358> getParserForType() {
         return PARSER;
      }

      public CR2S_ChangInfo_12358 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_ChangInfo_12358OrBuilder {
         private int bitField0_;
         private List<MineMsg.Chaneg_Info> changeInfo_;
         private RepeatedFieldBuilderV3<MineMsg.Chaneg_Info, MineMsg.Chaneg_Info.Builder, MineMsg.Chaneg_InfoOrBuilder> changeInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_ChangInfo_12358_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_ChangInfo_12358_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ChangInfo_12358.class, Builder.class);
         }

         private Builder() {
            this.changeInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.changeInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.CR2S_ChangInfo_12358.alwaysUseFieldBuilders) {
               this.getChangeInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.changeInfoBuilder_ == null) {
               this.changeInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.changeInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_ChangInfo_12358_descriptor;
         }

         public CR2S_ChangInfo_12358 getDefaultInstanceForType() {
            return CrossMineMsg.CR2S_ChangInfo_12358.getDefaultInstance();
         }

         public CR2S_ChangInfo_12358 build() {
            CR2S_ChangInfo_12358 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_ChangInfo_12358 buildPartial() {
            CR2S_ChangInfo_12358 result = new CR2S_ChangInfo_12358(this);
            int from_bitField0_ = this.bitField0_;
            if (this.changeInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.changeInfo_ = Collections.unmodifiableList(this.changeInfo_);
                  this.bitField0_ &= -2;
               }

               result.changeInfo_ = this.changeInfo_;
            } else {
               result.changeInfo_ = this.changeInfoBuilder_.build();
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
            if (other instanceof CR2S_ChangInfo_12358) {
               return this.mergeFrom((CR2S_ChangInfo_12358)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_ChangInfo_12358 other) {
            if (other == CrossMineMsg.CR2S_ChangInfo_12358.getDefaultInstance()) {
               return this;
            } else {
               if (this.changeInfoBuilder_ == null) {
                  if (!other.changeInfo_.isEmpty()) {
                     if (this.changeInfo_.isEmpty()) {
                        this.changeInfo_ = other.changeInfo_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureChangeInfoIsMutable();
                        this.changeInfo_.addAll(other.changeInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.changeInfo_.isEmpty()) {
                  if (this.changeInfoBuilder_.isEmpty()) {
                     this.changeInfoBuilder_.dispose();
                     this.changeInfoBuilder_ = null;
                     this.changeInfo_ = other.changeInfo_;
                     this.bitField0_ &= -2;
                     this.changeInfoBuilder_ = CrossMineMsg.CR2S_ChangInfo_12358.alwaysUseFieldBuilders ? this.getChangeInfoFieldBuilder() : null;
                  } else {
                     this.changeInfoBuilder_.addAllMessages(other.changeInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getChangeInfoCount(); ++i) {
               if (!this.getChangeInfo(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_ChangInfo_12358 parsedMessage = null;

            try {
               parsedMessage = (CR2S_ChangInfo_12358)CrossMineMsg.CR2S_ChangInfo_12358.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_ChangInfo_12358)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureChangeInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.changeInfo_ = new ArrayList(this.changeInfo_);
               this.bitField0_ |= 1;
            }

         }

         public List<MineMsg.Chaneg_Info> getChangeInfoList() {
            return this.changeInfoBuilder_ == null ? Collections.unmodifiableList(this.changeInfo_) : this.changeInfoBuilder_.getMessageList();
         }

         public int getChangeInfoCount() {
            return this.changeInfoBuilder_ == null ? this.changeInfo_.size() : this.changeInfoBuilder_.getCount();
         }

         public MineMsg.Chaneg_Info getChangeInfo(int index) {
            return this.changeInfoBuilder_ == null ? (MineMsg.Chaneg_Info)this.changeInfo_.get(index) : (MineMsg.Chaneg_Info)this.changeInfoBuilder_.getMessage(index);
         }

         public Builder setChangeInfo(int index, MineMsg.Chaneg_Info value) {
            if (this.changeInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChangeInfoIsMutable();
               this.changeInfo_.set(index, value);
               this.onChanged();
            } else {
               this.changeInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setChangeInfo(int index, MineMsg.Chaneg_Info.Builder builderForValue) {
            if (this.changeInfoBuilder_ == null) {
               this.ensureChangeInfoIsMutable();
               this.changeInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.changeInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addChangeInfo(MineMsg.Chaneg_Info value) {
            if (this.changeInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChangeInfoIsMutable();
               this.changeInfo_.add(value);
               this.onChanged();
            } else {
               this.changeInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addChangeInfo(int index, MineMsg.Chaneg_Info value) {
            if (this.changeInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChangeInfoIsMutable();
               this.changeInfo_.add(index, value);
               this.onChanged();
            } else {
               this.changeInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addChangeInfo(MineMsg.Chaneg_Info.Builder builderForValue) {
            if (this.changeInfoBuilder_ == null) {
               this.ensureChangeInfoIsMutable();
               this.changeInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.changeInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addChangeInfo(int index, MineMsg.Chaneg_Info.Builder builderForValue) {
            if (this.changeInfoBuilder_ == null) {
               this.ensureChangeInfoIsMutable();
               this.changeInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.changeInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllChangeInfo(Iterable<? extends MineMsg.Chaneg_Info> values) {
            if (this.changeInfoBuilder_ == null) {
               this.ensureChangeInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.changeInfo_);
               this.onChanged();
            } else {
               this.changeInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearChangeInfo() {
            if (this.changeInfoBuilder_ == null) {
               this.changeInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.changeInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeChangeInfo(int index) {
            if (this.changeInfoBuilder_ == null) {
               this.ensureChangeInfoIsMutable();
               this.changeInfo_.remove(index);
               this.onChanged();
            } else {
               this.changeInfoBuilder_.remove(index);
            }

            return this;
         }

         public MineMsg.Chaneg_Info.Builder getChangeInfoBuilder(int index) {
            return (MineMsg.Chaneg_Info.Builder)this.getChangeInfoFieldBuilder().getBuilder(index);
         }

         public MineMsg.Chaneg_InfoOrBuilder getChangeInfoOrBuilder(int index) {
            return this.changeInfoBuilder_ == null ? (MineMsg.Chaneg_InfoOrBuilder)this.changeInfo_.get(index) : (MineMsg.Chaneg_InfoOrBuilder)this.changeInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MineMsg.Chaneg_InfoOrBuilder> getChangeInfoOrBuilderList() {
            return this.changeInfoBuilder_ != null ? this.changeInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.changeInfo_);
         }

         public MineMsg.Chaneg_Info.Builder addChangeInfoBuilder() {
            return (MineMsg.Chaneg_Info.Builder)this.getChangeInfoFieldBuilder().addBuilder(MineMsg.Chaneg_Info.getDefaultInstance());
         }

         public MineMsg.Chaneg_Info.Builder addChangeInfoBuilder(int index) {
            return (MineMsg.Chaneg_Info.Builder)this.getChangeInfoFieldBuilder().addBuilder(index, MineMsg.Chaneg_Info.getDefaultInstance());
         }

         public List<MineMsg.Chaneg_Info.Builder> getChangeInfoBuilderList() {
            return this.getChangeInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MineMsg.Chaneg_Info, MineMsg.Chaneg_Info.Builder, MineMsg.Chaneg_InfoOrBuilder> getChangeInfoFieldBuilder() {
            if (this.changeInfoBuilder_ == null) {
               this.changeInfoBuilder_ = new RepeatedFieldBuilderV3(this.changeInfo_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.changeInfo_ = null;
            }

            return this.changeInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_MineAcrossDay_12360 extends GeneratedMessageV3 implements CR2S_MineAcrossDay_12360OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final CR2S_MineAcrossDay_12360 DEFAULT_INSTANCE = new CR2S_MineAcrossDay_12360();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_MineAcrossDay_12360> PARSER = new AbstractParser<CR2S_MineAcrossDay_12360>() {
         public CR2S_MineAcrossDay_12360 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_MineAcrossDay_12360(input, extensionRegistry);
         }
      };

      private CR2S_MineAcrossDay_12360(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_MineAcrossDay_12360() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_MineAcrossDay_12360();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_MineAcrossDay_12360(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_MineAcrossDay_12360_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_MineAcrossDay_12360_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_MineAcrossDay_12360.class, Builder.class);
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
         } else if (!(obj instanceof CR2S_MineAcrossDay_12360)) {
            return super.equals(obj);
         } else {
            CR2S_MineAcrossDay_12360 other = (CR2S_MineAcrossDay_12360)obj;
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

      public static CR2S_MineAcrossDay_12360 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_MineAcrossDay_12360)PARSER.parseFrom(data);
      }

      public static CR2S_MineAcrossDay_12360 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_MineAcrossDay_12360)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_MineAcrossDay_12360 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_MineAcrossDay_12360)PARSER.parseFrom(data);
      }

      public static CR2S_MineAcrossDay_12360 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_MineAcrossDay_12360)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_MineAcrossDay_12360 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_MineAcrossDay_12360)PARSER.parseFrom(data);
      }

      public static CR2S_MineAcrossDay_12360 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_MineAcrossDay_12360)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_MineAcrossDay_12360 parseFrom(InputStream input) throws IOException {
         return (CR2S_MineAcrossDay_12360)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_MineAcrossDay_12360 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_MineAcrossDay_12360)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_MineAcrossDay_12360 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_MineAcrossDay_12360)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_MineAcrossDay_12360 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_MineAcrossDay_12360)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_MineAcrossDay_12360 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_MineAcrossDay_12360)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_MineAcrossDay_12360 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_MineAcrossDay_12360)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_MineAcrossDay_12360 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_MineAcrossDay_12360 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_MineAcrossDay_12360> parser() {
         return PARSER;
      }

      public Parser<CR2S_MineAcrossDay_12360> getParserForType() {
         return PARSER;
      }

      public CR2S_MineAcrossDay_12360 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_MineAcrossDay_12360OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_MineAcrossDay_12360_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_MineAcrossDay_12360_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_MineAcrossDay_12360.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.CR2S_MineAcrossDay_12360.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_MineAcrossDay_12360_descriptor;
         }

         public CR2S_MineAcrossDay_12360 getDefaultInstanceForType() {
            return CrossMineMsg.CR2S_MineAcrossDay_12360.getDefaultInstance();
         }

         public CR2S_MineAcrossDay_12360 build() {
            CR2S_MineAcrossDay_12360 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_MineAcrossDay_12360 buildPartial() {
            CR2S_MineAcrossDay_12360 result = new CR2S_MineAcrossDay_12360(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_MineAcrossDay_12360) {
               return this.mergeFrom((CR2S_MineAcrossDay_12360)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_MineAcrossDay_12360 other) {
            if (other == CrossMineMsg.CR2S_MineAcrossDay_12360.getDefaultInstance()) {
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
            CR2S_MineAcrossDay_12360 parsedMessage = null;

            try {
               parsedMessage = (CR2S_MineAcrossDay_12360)CrossMineMsg.CR2S_MineAcrossDay_12360.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_MineAcrossDay_12360)e.getUnfinishedMessage();
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

   public static final class S2CR_SetMineState_12361 extends GeneratedMessageV3 implements S2CR_SetMineState_12361OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STATE_FIELD_NUMBER = 1;
      private int state_;
      private byte memoizedIsInitialized;
      private static final S2CR_SetMineState_12361 DEFAULT_INSTANCE = new S2CR_SetMineState_12361();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_SetMineState_12361> PARSER = new AbstractParser<S2CR_SetMineState_12361>() {
         public S2CR_SetMineState_12361 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_SetMineState_12361(input, extensionRegistry);
         }
      };

      private S2CR_SetMineState_12361(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_SetMineState_12361() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_SetMineState_12361();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_SetMineState_12361(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_SetMineState_12361_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_SetMineState_12361_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_SetMineState_12361.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_SetMineState_12361)) {
            return super.equals(obj);
         } else {
            S2CR_SetMineState_12361 other = (S2CR_SetMineState_12361)obj;
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

      public static S2CR_SetMineState_12361 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_SetMineState_12361)PARSER.parseFrom(data);
      }

      public static S2CR_SetMineState_12361 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SetMineState_12361)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SetMineState_12361 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_SetMineState_12361)PARSER.parseFrom(data);
      }

      public static S2CR_SetMineState_12361 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SetMineState_12361)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SetMineState_12361 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_SetMineState_12361)PARSER.parseFrom(data);
      }

      public static S2CR_SetMineState_12361 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SetMineState_12361)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SetMineState_12361 parseFrom(InputStream input) throws IOException {
         return (S2CR_SetMineState_12361)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_SetMineState_12361 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SetMineState_12361)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_SetMineState_12361 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_SetMineState_12361)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_SetMineState_12361 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SetMineState_12361)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_SetMineState_12361 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_SetMineState_12361)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_SetMineState_12361 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SetMineState_12361)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_SetMineState_12361 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_SetMineState_12361 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_SetMineState_12361> parser() {
         return PARSER;
      }

      public Parser<S2CR_SetMineState_12361> getParserForType() {
         return PARSER;
      }

      public S2CR_SetMineState_12361 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_SetMineState_12361OrBuilder {
         private int bitField0_;
         private int state_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_SetMineState_12361_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_SetMineState_12361_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_SetMineState_12361.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.S2CR_SetMineState_12361.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.state_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_SetMineState_12361_descriptor;
         }

         public S2CR_SetMineState_12361 getDefaultInstanceForType() {
            return CrossMineMsg.S2CR_SetMineState_12361.getDefaultInstance();
         }

         public S2CR_SetMineState_12361 build() {
            S2CR_SetMineState_12361 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_SetMineState_12361 buildPartial() {
            S2CR_SetMineState_12361 result = new S2CR_SetMineState_12361(this);
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
            if (other instanceof S2CR_SetMineState_12361) {
               return this.mergeFrom((S2CR_SetMineState_12361)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_SetMineState_12361 other) {
            if (other == CrossMineMsg.S2CR_SetMineState_12361.getDefaultInstance()) {
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
            S2CR_SetMineState_12361 parsedMessage = null;

            try {
               parsedMessage = (S2CR_SetMineState_12361)CrossMineMsg.S2CR_SetMineState_12361.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_SetMineState_12361)e.getUnfinishedMessage();
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

   public static final class S2CR_UpdateLine_12363 extends GeneratedMessageV3 implements S2CR_UpdateLine_12363OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OFFVALUE_FIELD_NUMBER = 1;
      private int offValue_;
      private byte memoizedIsInitialized;
      private static final S2CR_UpdateLine_12363 DEFAULT_INSTANCE = new S2CR_UpdateLine_12363();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UpdateLine_12363> PARSER = new AbstractParser<S2CR_UpdateLine_12363>() {
         public S2CR_UpdateLine_12363 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UpdateLine_12363(input, extensionRegistry);
         }
      };

      private S2CR_UpdateLine_12363(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UpdateLine_12363() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UpdateLine_12363();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UpdateLine_12363(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.offValue_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_UpdateLine_12363_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_UpdateLine_12363_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UpdateLine_12363.class, Builder.class);
      }

      public boolean hasOffValue() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getOffValue() {
         return this.offValue_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasOffValue()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.offValue_);
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
               size += CodedOutputStream.computeInt32Size(1, this.offValue_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UpdateLine_12363)) {
            return super.equals(obj);
         } else {
            S2CR_UpdateLine_12363 other = (S2CR_UpdateLine_12363)obj;
            if (this.hasOffValue() != other.hasOffValue()) {
               return false;
            } else if (this.hasOffValue() && this.getOffValue() != other.getOffValue()) {
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
            if (this.hasOffValue()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOffValue();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UpdateLine_12363 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UpdateLine_12363)PARSER.parseFrom(data);
      }

      public static S2CR_UpdateLine_12363 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UpdateLine_12363)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UpdateLine_12363 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UpdateLine_12363)PARSER.parseFrom(data);
      }

      public static S2CR_UpdateLine_12363 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UpdateLine_12363)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UpdateLine_12363 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UpdateLine_12363)PARSER.parseFrom(data);
      }

      public static S2CR_UpdateLine_12363 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UpdateLine_12363)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UpdateLine_12363 parseFrom(InputStream input) throws IOException {
         return (S2CR_UpdateLine_12363)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UpdateLine_12363 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UpdateLine_12363)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UpdateLine_12363 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UpdateLine_12363)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UpdateLine_12363 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UpdateLine_12363)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UpdateLine_12363 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UpdateLine_12363)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UpdateLine_12363 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UpdateLine_12363)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UpdateLine_12363 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UpdateLine_12363 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UpdateLine_12363> parser() {
         return PARSER;
      }

      public Parser<S2CR_UpdateLine_12363> getParserForType() {
         return PARSER;
      }

      public S2CR_UpdateLine_12363 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UpdateLine_12363OrBuilder {
         private int bitField0_;
         private int offValue_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_UpdateLine_12363_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_UpdateLine_12363_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UpdateLine_12363.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.S2CR_UpdateLine_12363.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.offValue_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_UpdateLine_12363_descriptor;
         }

         public S2CR_UpdateLine_12363 getDefaultInstanceForType() {
            return CrossMineMsg.S2CR_UpdateLine_12363.getDefaultInstance();
         }

         public S2CR_UpdateLine_12363 build() {
            S2CR_UpdateLine_12363 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UpdateLine_12363 buildPartial() {
            S2CR_UpdateLine_12363 result = new S2CR_UpdateLine_12363(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.offValue_ = this.offValue_;
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
            if (other instanceof S2CR_UpdateLine_12363) {
               return this.mergeFrom((S2CR_UpdateLine_12363)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UpdateLine_12363 other) {
            if (other == CrossMineMsg.S2CR_UpdateLine_12363.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOffValue()) {
                  this.setOffValue(other.getOffValue());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasOffValue();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UpdateLine_12363 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UpdateLine_12363)CrossMineMsg.S2CR_UpdateLine_12363.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UpdateLine_12363)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOffValue() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getOffValue() {
            return this.offValue_;
         }

         public Builder setOffValue(int value) {
            this.bitField0_ |= 1;
            this.offValue_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOffValue() {
            this.bitField0_ &= -2;
            this.offValue_ = 0;
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

   public static final class CR2S_UpdateLine_12364 extends GeneratedMessageV3 implements CR2S_UpdateLine_12364OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int LINE_FIELD_NUMBER = 2;
      private Internal.IntList line_;
      private byte memoizedIsInitialized;
      private static final CR2S_UpdateLine_12364 DEFAULT_INSTANCE = new CR2S_UpdateLine_12364();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UpdateLine_12364> PARSER = new AbstractParser<CR2S_UpdateLine_12364>() {
         public CR2S_UpdateLine_12364 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UpdateLine_12364(input, extensionRegistry);
         }
      };

      private CR2S_UpdateLine_12364(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UpdateLine_12364() {
         this.memoizedIsInitialized = -1;
         this.line_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UpdateLine_12364();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UpdateLine_12364(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.line_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.line_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.line_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.line_.addInt(input.readInt32());
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
                  this.line_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateLine_12364_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateLine_12364_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpdateLine_12364.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public List<Integer> getLineList() {
         return this.line_;
      }

      public int getLineCount() {
         return this.line_.size();
      }

      public int getLine(int index) {
         return this.line_.getInt(index);
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

         for(int i = 0; i < this.line_.size(); ++i) {
            output.writeInt32(2, this.line_.getInt(i));
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

            int dataSize = 0;

            for(int i = 0; i < this.line_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.line_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getLineList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_UpdateLine_12364)) {
            return super.equals(obj);
         } else {
            CR2S_UpdateLine_12364 other = (CR2S_UpdateLine_12364)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (!this.getLineList().equals(other.getLineList())) {
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

            if (this.getLineCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLineList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_UpdateLine_12364 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateLine_12364)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateLine_12364 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateLine_12364)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateLine_12364 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateLine_12364)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateLine_12364 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateLine_12364)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateLine_12364 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateLine_12364)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateLine_12364 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateLine_12364)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateLine_12364 parseFrom(InputStream input) throws IOException {
         return (CR2S_UpdateLine_12364)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpdateLine_12364 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateLine_12364)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpdateLine_12364 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UpdateLine_12364)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UpdateLine_12364 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateLine_12364)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpdateLine_12364 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UpdateLine_12364)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpdateLine_12364 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateLine_12364)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UpdateLine_12364 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UpdateLine_12364 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UpdateLine_12364> parser() {
         return PARSER;
      }

      public Parser<CR2S_UpdateLine_12364> getParserForType() {
         return PARSER;
      }

      public CR2S_UpdateLine_12364 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UpdateLine_12364OrBuilder {
         private int bitField0_;
         private int type_;
         private Internal.IntList line_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateLine_12364_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateLine_12364_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpdateLine_12364.class, Builder.class);
         }

         private Builder() {
            this.line_ = CrossMineMsg.CR2S_UpdateLine_12364.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.line_ = CrossMineMsg.CR2S_UpdateLine_12364.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.CR2S_UpdateLine_12364.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.line_ = CrossMineMsg.CR2S_UpdateLine_12364.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_UpdateLine_12364_descriptor;
         }

         public CR2S_UpdateLine_12364 getDefaultInstanceForType() {
            return CrossMineMsg.CR2S_UpdateLine_12364.getDefaultInstance();
         }

         public CR2S_UpdateLine_12364 build() {
            CR2S_UpdateLine_12364 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UpdateLine_12364 buildPartial() {
            CR2S_UpdateLine_12364 result = new CR2S_UpdateLine_12364(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.line_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.line_ = this.line_;
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
            if (other instanceof CR2S_UpdateLine_12364) {
               return this.mergeFrom((CR2S_UpdateLine_12364)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UpdateLine_12364 other) {
            if (other == CrossMineMsg.CR2S_UpdateLine_12364.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (!other.line_.isEmpty()) {
                  if (this.line_.isEmpty()) {
                     this.line_ = other.line_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureLineIsMutable();
                     this.line_.addAll(other.line_);
                  }

                  this.onChanged();
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
            CR2S_UpdateLine_12364 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UpdateLine_12364)CrossMineMsg.CR2S_UpdateLine_12364.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UpdateLine_12364)e.getUnfinishedMessage();
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

         private void ensureLineIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.line_ = CrossMineMsg.CR2S_UpdateLine_12364.mutableCopy(this.line_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getLineList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.line_) : this.line_);
         }

         public int getLineCount() {
            return this.line_.size();
         }

         public int getLine(int index) {
            return this.line_.getInt(index);
         }

         public Builder setLine(int index, int value) {
            this.ensureLineIsMutable();
            this.line_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addLine(int value) {
            this.ensureLineIsMutable();
            this.line_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllLine(Iterable<? extends Integer> values) {
            this.ensureLineIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.line_);
            this.onChanged();
            return this;
         }

         public Builder clearLine() {
            this.line_ = CrossMineMsg.CR2S_UpdateLine_12364.emptyIntList();
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

   public static final class CR2S_LogOperate_12366 extends GeneratedMessageV3 implements CR2S_LogOperate_12366OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int FIGHT_FIELD_NUMBER = 2;
      private long fight_;
      public static final int UNIONNAME_FIELD_NUMBER = 3;
      private volatile Object unionName_;
      public static final int VEINID_FIELD_NUMBER = 4;
      private int veinId_;
      public static final int ATKTYPE_FIELD_NUMBER = 5;
      private int atkType_;
      public static final int RESULT_FIELD_NUMBER = 6;
      private boolean result_;
      private byte memoizedIsInitialized;
      private static final CR2S_LogOperate_12366 DEFAULT_INSTANCE = new CR2S_LogOperate_12366();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_LogOperate_12366> PARSER = new AbstractParser<CR2S_LogOperate_12366>() {
         public CR2S_LogOperate_12366 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_LogOperate_12366(input, extensionRegistry);
         }
      };

      private CR2S_LogOperate_12366(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_LogOperate_12366() {
         this.memoizedIsInitialized = -1;
         this.unionName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_LogOperate_12366();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_LogOperate_12366(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.fight_ = input.readInt64();
                        break;
                     case 26:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.unionName_ = bs;
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.veinId_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.atkType_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.result_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_LogOperate_12366_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_LogOperate_12366_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_LogOperate_12366.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasFight() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getFight() {
         return this.fight_;
      }

      public boolean hasUnionName() {
         return (this.bitField0_ & 4) != 0;
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

      public boolean hasVeinId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getVeinId() {
         return this.veinId_;
      }

      public boolean hasAtkType() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getAtkType() {
         return this.atkType_;
      }

      public boolean hasResult() {
         return (this.bitField0_ & 32) != 0;
      }

      public boolean getResult() {
         return this.result_;
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
         } else if (!this.hasFight()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasVeinId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAtkType()) {
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
            output.writeInt32(1, this.playerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.fight_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.unionName_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.veinId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.atkType_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeBool(6, this.result_);
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
               size += CodedOutputStream.computeInt64Size(2, this.fight_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.unionName_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.veinId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.atkType_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeBoolSize(6, this.result_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_LogOperate_12366)) {
            return super.equals(obj);
         } else {
            CR2S_LogOperate_12366 other = (CR2S_LogOperate_12366)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasFight() != other.hasFight()) {
               return false;
            } else if (this.hasFight() && this.getFight() != other.getFight()) {
               return false;
            } else if (this.hasUnionName() != other.hasUnionName()) {
               return false;
            } else if (this.hasUnionName() && !this.getUnionName().equals(other.getUnionName())) {
               return false;
            } else if (this.hasVeinId() != other.hasVeinId()) {
               return false;
            } else if (this.hasVeinId() && this.getVeinId() != other.getVeinId()) {
               return false;
            } else if (this.hasAtkType() != other.hasAtkType()) {
               return false;
            } else if (this.hasAtkType() && this.getAtkType() != other.getAtkType()) {
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
            if (this.hasPlayerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasFight()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getFight());
            }

            if (this.hasUnionName()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getUnionName().hashCode();
            }

            if (this.hasVeinId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getVeinId();
            }

            if (this.hasAtkType()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getAtkType();
            }

            if (this.hasResult()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashBoolean(this.getResult());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_LogOperate_12366 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_LogOperate_12366)PARSER.parseFrom(data);
      }

      public static CR2S_LogOperate_12366 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_LogOperate_12366)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_LogOperate_12366 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_LogOperate_12366)PARSER.parseFrom(data);
      }

      public static CR2S_LogOperate_12366 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_LogOperate_12366)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_LogOperate_12366 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_LogOperate_12366)PARSER.parseFrom(data);
      }

      public static CR2S_LogOperate_12366 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_LogOperate_12366)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_LogOperate_12366 parseFrom(InputStream input) throws IOException {
         return (CR2S_LogOperate_12366)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_LogOperate_12366 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_LogOperate_12366)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_LogOperate_12366 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_LogOperate_12366)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_LogOperate_12366 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_LogOperate_12366)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_LogOperate_12366 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_LogOperate_12366)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_LogOperate_12366 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_LogOperate_12366)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_LogOperate_12366 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_LogOperate_12366 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_LogOperate_12366> parser() {
         return PARSER;
      }

      public Parser<CR2S_LogOperate_12366> getParserForType() {
         return PARSER;
      }

      public CR2S_LogOperate_12366 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_LogOperate_12366OrBuilder {
         private int bitField0_;
         private int playerId_;
         private long fight_;
         private Object unionName_;
         private int veinId_;
         private int atkType_;
         private boolean result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_LogOperate_12366_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_LogOperate_12366_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_LogOperate_12366.class, Builder.class);
         }

         private Builder() {
            this.unionName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.unionName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.CR2S_LogOperate_12366.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.fight_ = 0L;
            this.bitField0_ &= -3;
            this.unionName_ = "";
            this.bitField0_ &= -5;
            this.veinId_ = 0;
            this.bitField0_ &= -9;
            this.atkType_ = 0;
            this.bitField0_ &= -17;
            this.result_ = false;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_LogOperate_12366_descriptor;
         }

         public CR2S_LogOperate_12366 getDefaultInstanceForType() {
            return CrossMineMsg.CR2S_LogOperate_12366.getDefaultInstance();
         }

         public CR2S_LogOperate_12366 build() {
            CR2S_LogOperate_12366 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_LogOperate_12366 buildPartial() {
            CR2S_LogOperate_12366 result = new CR2S_LogOperate_12366(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.fight_ = this.fight_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.unionName_ = this.unionName_;
            if ((from_bitField0_ & 8) != 0) {
               result.veinId_ = this.veinId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.atkType_ = this.atkType_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.result_ = this.result_;
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
            if (other instanceof CR2S_LogOperate_12366) {
               return this.mergeFrom((CR2S_LogOperate_12366)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_LogOperate_12366 other) {
            if (other == CrossMineMsg.CR2S_LogOperate_12366.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasFight()) {
                  this.setFight(other.getFight());
               }

               if (other.hasUnionName()) {
                  this.bitField0_ |= 4;
                  this.unionName_ = other.unionName_;
                  this.onChanged();
               }

               if (other.hasVeinId()) {
                  this.setVeinId(other.getVeinId());
               }

               if (other.hasAtkType()) {
                  this.setAtkType(other.getAtkType());
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
            if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasFight()) {
               return false;
            } else if (!this.hasVeinId()) {
               return false;
            } else if (!this.hasAtkType()) {
               return false;
            } else {
               return this.hasResult();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_LogOperate_12366 parsedMessage = null;

            try {
               parsedMessage = (CR2S_LogOperate_12366)CrossMineMsg.CR2S_LogOperate_12366.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_LogOperate_12366)e.getUnfinishedMessage();
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

         public boolean hasFight() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getFight() {
            return this.fight_;
         }

         public Builder setFight(long value) {
            this.bitField0_ |= 2;
            this.fight_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFight() {
            this.bitField0_ &= -3;
            this.fight_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasUnionName() {
            return (this.bitField0_ & 4) != 0;
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
               this.bitField0_ |= 4;
               this.unionName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearUnionName() {
            this.bitField0_ &= -5;
            this.unionName_ = CrossMineMsg.CR2S_LogOperate_12366.getDefaultInstance().getUnionName();
            this.onChanged();
            return this;
         }

         public Builder setUnionNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.unionName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasVeinId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getVeinId() {
            return this.veinId_;
         }

         public Builder setVeinId(int value) {
            this.bitField0_ |= 8;
            this.veinId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearVeinId() {
            this.bitField0_ &= -9;
            this.veinId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAtkType() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getAtkType() {
            return this.atkType_;
         }

         public Builder setAtkType(int value) {
            this.bitField0_ |= 16;
            this.atkType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAtkType() {
            this.bitField0_ &= -17;
            this.atkType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 32) != 0;
         }

         public boolean getResult() {
            return this.result_;
         }

         public Builder setResult(boolean value) {
            this.bitField0_ |= 32;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -33;
            this.result_ = false;
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

   public static final class S2CR_CheckEmptyVein_12367 extends GeneratedMessageV3 implements S2CR_CheckEmptyVein_12367OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LINE_FIELD_NUMBER = 1;
      private int line_;
      public static final int HILLID_FIELD_NUMBER = 2;
      private int hillId_;
      private byte memoizedIsInitialized;
      private static final S2CR_CheckEmptyVein_12367 DEFAULT_INSTANCE = new S2CR_CheckEmptyVein_12367();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_CheckEmptyVein_12367> PARSER = new AbstractParser<S2CR_CheckEmptyVein_12367>() {
         public S2CR_CheckEmptyVein_12367 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_CheckEmptyVein_12367(input, extensionRegistry);
         }
      };

      private S2CR_CheckEmptyVein_12367(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_CheckEmptyVein_12367() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_CheckEmptyVein_12367();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_CheckEmptyVein_12367(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.line_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.hillId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_CheckEmptyVein_12367_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_CheckEmptyVein_12367_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_CheckEmptyVein_12367.class, Builder.class);
      }

      public boolean hasLine() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLine() {
         return this.line_;
      }

      public boolean hasHillId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHillId() {
         return this.hillId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLine()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHillId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.line_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.hillId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.line_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.hillId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_CheckEmptyVein_12367)) {
            return super.equals(obj);
         } else {
            S2CR_CheckEmptyVein_12367 other = (S2CR_CheckEmptyVein_12367)obj;
            if (this.hasLine() != other.hasLine()) {
               return false;
            } else if (this.hasLine() && this.getLine() != other.getLine()) {
               return false;
            } else if (this.hasHillId() != other.hasHillId()) {
               return false;
            } else if (this.hasHillId() && this.getHillId() != other.getHillId()) {
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
            if (this.hasLine()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLine();
            }

            if (this.hasHillId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHillId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_CheckEmptyVein_12367 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_CheckEmptyVein_12367)PARSER.parseFrom(data);
      }

      public static S2CR_CheckEmptyVein_12367 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CheckEmptyVein_12367)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CheckEmptyVein_12367 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_CheckEmptyVein_12367)PARSER.parseFrom(data);
      }

      public static S2CR_CheckEmptyVein_12367 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CheckEmptyVein_12367)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CheckEmptyVein_12367 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_CheckEmptyVein_12367)PARSER.parseFrom(data);
      }

      public static S2CR_CheckEmptyVein_12367 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CheckEmptyVein_12367)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CheckEmptyVein_12367 parseFrom(InputStream input) throws IOException {
         return (S2CR_CheckEmptyVein_12367)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_CheckEmptyVein_12367 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CheckEmptyVein_12367)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_CheckEmptyVein_12367 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_CheckEmptyVein_12367)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_CheckEmptyVein_12367 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CheckEmptyVein_12367)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_CheckEmptyVein_12367 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_CheckEmptyVein_12367)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_CheckEmptyVein_12367 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CheckEmptyVein_12367)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_CheckEmptyVein_12367 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_CheckEmptyVein_12367 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_CheckEmptyVein_12367> parser() {
         return PARSER;
      }

      public Parser<S2CR_CheckEmptyVein_12367> getParserForType() {
         return PARSER;
      }

      public S2CR_CheckEmptyVein_12367 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_CheckEmptyVein_12367OrBuilder {
         private int bitField0_;
         private int line_;
         private int hillId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_CheckEmptyVein_12367_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_CheckEmptyVein_12367_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_CheckEmptyVein_12367.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.S2CR_CheckEmptyVein_12367.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.line_ = 0;
            this.bitField0_ &= -2;
            this.hillId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_CheckEmptyVein_12367_descriptor;
         }

         public S2CR_CheckEmptyVein_12367 getDefaultInstanceForType() {
            return CrossMineMsg.S2CR_CheckEmptyVein_12367.getDefaultInstance();
         }

         public S2CR_CheckEmptyVein_12367 build() {
            S2CR_CheckEmptyVein_12367 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_CheckEmptyVein_12367 buildPartial() {
            S2CR_CheckEmptyVein_12367 result = new S2CR_CheckEmptyVein_12367(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.line_ = this.line_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.hillId_ = this.hillId_;
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
            if (other instanceof S2CR_CheckEmptyVein_12367) {
               return this.mergeFrom((S2CR_CheckEmptyVein_12367)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_CheckEmptyVein_12367 other) {
            if (other == CrossMineMsg.S2CR_CheckEmptyVein_12367.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLine()) {
                  this.setLine(other.getLine());
               }

               if (other.hasHillId()) {
                  this.setHillId(other.getHillId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasLine()) {
               return false;
            } else {
               return this.hasHillId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_CheckEmptyVein_12367 parsedMessage = null;

            try {
               parsedMessage = (S2CR_CheckEmptyVein_12367)CrossMineMsg.S2CR_CheckEmptyVein_12367.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_CheckEmptyVein_12367)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLine() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getLine() {
            return this.line_;
         }

         public Builder setLine(int value) {
            this.bitField0_ |= 1;
            this.line_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLine() {
            this.bitField0_ &= -2;
            this.line_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHillId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHillId() {
            return this.hillId_;
         }

         public Builder setHillId(int value) {
            this.bitField0_ |= 2;
            this.hillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHillId() {
            this.bitField0_ &= -3;
            this.hillId_ = 0;
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

   public static final class S2CR_HillEvent_12369 extends GeneratedMessageV3 implements S2CR_HillEvent_12369OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LINE_FIELD_NUMBER = 1;
      private int line_;
      public static final int HILLID_FIELD_NUMBER = 2;
      private int hillId_;
      public static final int UNIONID_FIELD_NUMBER = 3;
      private int unionId_;
      private byte memoizedIsInitialized;
      private static final S2CR_HillEvent_12369 DEFAULT_INSTANCE = new S2CR_HillEvent_12369();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_HillEvent_12369> PARSER = new AbstractParser<S2CR_HillEvent_12369>() {
         public S2CR_HillEvent_12369 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_HillEvent_12369(input, extensionRegistry);
         }
      };

      private S2CR_HillEvent_12369(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_HillEvent_12369() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_HillEvent_12369();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_HillEvent_12369(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.line_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.hillId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.unionId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_HillEvent_12369_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_HillEvent_12369_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_HillEvent_12369.class, Builder.class);
      }

      public boolean hasLine() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLine() {
         return this.line_;
      }

      public boolean hasHillId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHillId() {
         return this.hillId_;
      }

      public boolean hasUnionId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getUnionId() {
         return this.unionId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLine()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHillId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasUnionId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.line_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.hillId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.unionId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.line_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.hillId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.unionId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_HillEvent_12369)) {
            return super.equals(obj);
         } else {
            S2CR_HillEvent_12369 other = (S2CR_HillEvent_12369)obj;
            if (this.hasLine() != other.hasLine()) {
               return false;
            } else if (this.hasLine() && this.getLine() != other.getLine()) {
               return false;
            } else if (this.hasHillId() != other.hasHillId()) {
               return false;
            } else if (this.hasHillId() && this.getHillId() != other.getHillId()) {
               return false;
            } else if (this.hasUnionId() != other.hasUnionId()) {
               return false;
            } else if (this.hasUnionId() && this.getUnionId() != other.getUnionId()) {
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
            if (this.hasLine()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLine();
            }

            if (this.hasHillId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHillId();
            }

            if (this.hasUnionId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getUnionId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_HillEvent_12369 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_HillEvent_12369)PARSER.parseFrom(data);
      }

      public static S2CR_HillEvent_12369 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_HillEvent_12369)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_HillEvent_12369 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_HillEvent_12369)PARSER.parseFrom(data);
      }

      public static S2CR_HillEvent_12369 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_HillEvent_12369)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_HillEvent_12369 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_HillEvent_12369)PARSER.parseFrom(data);
      }

      public static S2CR_HillEvent_12369 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_HillEvent_12369)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_HillEvent_12369 parseFrom(InputStream input) throws IOException {
         return (S2CR_HillEvent_12369)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_HillEvent_12369 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_HillEvent_12369)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_HillEvent_12369 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_HillEvent_12369)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_HillEvent_12369 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_HillEvent_12369)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_HillEvent_12369 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_HillEvent_12369)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_HillEvent_12369 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_HillEvent_12369)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_HillEvent_12369 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_HillEvent_12369 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_HillEvent_12369> parser() {
         return PARSER;
      }

      public Parser<S2CR_HillEvent_12369> getParserForType() {
         return PARSER;
      }

      public S2CR_HillEvent_12369 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_HillEvent_12369OrBuilder {
         private int bitField0_;
         private int line_;
         private int hillId_;
         private int unionId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_HillEvent_12369_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_HillEvent_12369_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_HillEvent_12369.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.S2CR_HillEvent_12369.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.line_ = 0;
            this.bitField0_ &= -2;
            this.hillId_ = 0;
            this.bitField0_ &= -3;
            this.unionId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_HillEvent_12369_descriptor;
         }

         public S2CR_HillEvent_12369 getDefaultInstanceForType() {
            return CrossMineMsg.S2CR_HillEvent_12369.getDefaultInstance();
         }

         public S2CR_HillEvent_12369 build() {
            S2CR_HillEvent_12369 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_HillEvent_12369 buildPartial() {
            S2CR_HillEvent_12369 result = new S2CR_HillEvent_12369(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.line_ = this.line_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.hillId_ = this.hillId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.unionId_ = this.unionId_;
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
            if (other instanceof S2CR_HillEvent_12369) {
               return this.mergeFrom((S2CR_HillEvent_12369)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_HillEvent_12369 other) {
            if (other == CrossMineMsg.S2CR_HillEvent_12369.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLine()) {
                  this.setLine(other.getLine());
               }

               if (other.hasHillId()) {
                  this.setHillId(other.getHillId());
               }

               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasLine()) {
               return false;
            } else if (!this.hasHillId()) {
               return false;
            } else {
               return this.hasUnionId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_HillEvent_12369 parsedMessage = null;

            try {
               parsedMessage = (S2CR_HillEvent_12369)CrossMineMsg.S2CR_HillEvent_12369.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_HillEvent_12369)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLine() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getLine() {
            return this.line_;
         }

         public Builder setLine(int value) {
            this.bitField0_ |= 1;
            this.line_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLine() {
            this.bitField0_ &= -2;
            this.line_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHillId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHillId() {
            return this.hillId_;
         }

         public Builder setHillId(int value) {
            this.bitField0_ |= 2;
            this.hillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHillId() {
            this.bitField0_ &= -3;
            this.hillId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getUnionId() {
            return this.unionId_;
         }

         public Builder setUnionId(int value) {
            this.bitField0_ |= 4;
            this.unionId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionId() {
            this.bitField0_ &= -5;
            this.unionId_ = 0;
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

   public static final class CR2S_HillEvent_12370 extends GeneratedMessageV3 implements CR2S_HillEvent_12370OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LINE_FIELD_NUMBER = 1;
      private int line_;
      public static final int HILLID_FIELD_NUMBER = 2;
      private int hillId_;
      public static final int UNIONID_FIELD_NUMBER = 3;
      private int unionId_;
      public static final int EVENTID_FIELD_NUMBER = 4;
      private Internal.IntList eventId_;
      public static final int DURATIONTIME_FIELD_NUMBER = 5;
      private int durationTime_;
      private byte memoizedIsInitialized;
      private static final CR2S_HillEvent_12370 DEFAULT_INSTANCE = new CR2S_HillEvent_12370();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_HillEvent_12370> PARSER = new AbstractParser<CR2S_HillEvent_12370>() {
         public CR2S_HillEvent_12370 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_HillEvent_12370(input, extensionRegistry);
         }
      };

      private CR2S_HillEvent_12370(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_HillEvent_12370() {
         this.memoizedIsInitialized = -1;
         this.eventId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_HillEvent_12370();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_HillEvent_12370(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.line_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.hillId_ = input.readInt32();
                        continue;
                     case 24:
                        this.bitField0_ |= 4;
                        this.unionId_ = input.readInt32();
                        continue;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.eventId_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.eventId_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.eventId_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.durationTime_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.eventId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 8) != 0) {
                  this.eventId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_HillEvent_12370_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_HillEvent_12370_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_HillEvent_12370.class, Builder.class);
      }

      public boolean hasLine() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLine() {
         return this.line_;
      }

      public boolean hasHillId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHillId() {
         return this.hillId_;
      }

      public boolean hasUnionId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getUnionId() {
         return this.unionId_;
      }

      public List<Integer> getEventIdList() {
         return this.eventId_;
      }

      public int getEventIdCount() {
         return this.eventId_.size();
      }

      public int getEventId(int index) {
         return this.eventId_.getInt(index);
      }

      public boolean hasDurationTime() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getDurationTime() {
         return this.durationTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLine()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHillId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasUnionId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.line_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.hillId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.unionId_);
         }

         for(int i = 0; i < this.eventId_.size(); ++i) {
            output.writeInt32(4, this.eventId_.getInt(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.durationTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.line_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.hillId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.unionId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.eventId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.eventId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getEventIdList().size();
            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.durationTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_HillEvent_12370)) {
            return super.equals(obj);
         } else {
            CR2S_HillEvent_12370 other = (CR2S_HillEvent_12370)obj;
            if (this.hasLine() != other.hasLine()) {
               return false;
            } else if (this.hasLine() && this.getLine() != other.getLine()) {
               return false;
            } else if (this.hasHillId() != other.hasHillId()) {
               return false;
            } else if (this.hasHillId() && this.getHillId() != other.getHillId()) {
               return false;
            } else if (this.hasUnionId() != other.hasUnionId()) {
               return false;
            } else if (this.hasUnionId() && this.getUnionId() != other.getUnionId()) {
               return false;
            } else if (!this.getEventIdList().equals(other.getEventIdList())) {
               return false;
            } else if (this.hasDurationTime() != other.hasDurationTime()) {
               return false;
            } else if (this.hasDurationTime() && this.getDurationTime() != other.getDurationTime()) {
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
            if (this.hasLine()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLine();
            }

            if (this.hasHillId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHillId();
            }

            if (this.hasUnionId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getUnionId();
            }

            if (this.getEventIdCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getEventIdList().hashCode();
            }

            if (this.hasDurationTime()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getDurationTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_HillEvent_12370 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_HillEvent_12370)PARSER.parseFrom(data);
      }

      public static CR2S_HillEvent_12370 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_HillEvent_12370)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_HillEvent_12370 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_HillEvent_12370)PARSER.parseFrom(data);
      }

      public static CR2S_HillEvent_12370 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_HillEvent_12370)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_HillEvent_12370 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_HillEvent_12370)PARSER.parseFrom(data);
      }

      public static CR2S_HillEvent_12370 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_HillEvent_12370)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_HillEvent_12370 parseFrom(InputStream input) throws IOException {
         return (CR2S_HillEvent_12370)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_HillEvent_12370 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_HillEvent_12370)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_HillEvent_12370 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_HillEvent_12370)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_HillEvent_12370 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_HillEvent_12370)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_HillEvent_12370 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_HillEvent_12370)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_HillEvent_12370 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_HillEvent_12370)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_HillEvent_12370 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_HillEvent_12370 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_HillEvent_12370> parser() {
         return PARSER;
      }

      public Parser<CR2S_HillEvent_12370> getParserForType() {
         return PARSER;
      }

      public CR2S_HillEvent_12370 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_HillEvent_12370OrBuilder {
         private int bitField0_;
         private int line_;
         private int hillId_;
         private int unionId_;
         private Internal.IntList eventId_;
         private int durationTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_HillEvent_12370_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_HillEvent_12370_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_HillEvent_12370.class, Builder.class);
         }

         private Builder() {
            this.eventId_ = CrossMineMsg.CR2S_HillEvent_12370.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.eventId_ = CrossMineMsg.CR2S_HillEvent_12370.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.CR2S_HillEvent_12370.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.line_ = 0;
            this.bitField0_ &= -2;
            this.hillId_ = 0;
            this.bitField0_ &= -3;
            this.unionId_ = 0;
            this.bitField0_ &= -5;
            this.eventId_ = CrossMineMsg.CR2S_HillEvent_12370.emptyIntList();
            this.bitField0_ &= -9;
            this.durationTime_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_HillEvent_12370_descriptor;
         }

         public CR2S_HillEvent_12370 getDefaultInstanceForType() {
            return CrossMineMsg.CR2S_HillEvent_12370.getDefaultInstance();
         }

         public CR2S_HillEvent_12370 build() {
            CR2S_HillEvent_12370 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_HillEvent_12370 buildPartial() {
            CR2S_HillEvent_12370 result = new CR2S_HillEvent_12370(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.line_ = this.line_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.hillId_ = this.hillId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.unionId_ = this.unionId_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.eventId_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.eventId_ = this.eventId_;
            if ((from_bitField0_ & 16) != 0) {
               result.durationTime_ = this.durationTime_;
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
            if (other instanceof CR2S_HillEvent_12370) {
               return this.mergeFrom((CR2S_HillEvent_12370)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_HillEvent_12370 other) {
            if (other == CrossMineMsg.CR2S_HillEvent_12370.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLine()) {
                  this.setLine(other.getLine());
               }

               if (other.hasHillId()) {
                  this.setHillId(other.getHillId());
               }

               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               if (!other.eventId_.isEmpty()) {
                  if (this.eventId_.isEmpty()) {
                     this.eventId_ = other.eventId_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureEventIdIsMutable();
                     this.eventId_.addAll(other.eventId_);
                  }

                  this.onChanged();
               }

               if (other.hasDurationTime()) {
                  this.setDurationTime(other.getDurationTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasLine()) {
               return false;
            } else if (!this.hasHillId()) {
               return false;
            } else {
               return this.hasUnionId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_HillEvent_12370 parsedMessage = null;

            try {
               parsedMessage = (CR2S_HillEvent_12370)CrossMineMsg.CR2S_HillEvent_12370.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_HillEvent_12370)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLine() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getLine() {
            return this.line_;
         }

         public Builder setLine(int value) {
            this.bitField0_ |= 1;
            this.line_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLine() {
            this.bitField0_ &= -2;
            this.line_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHillId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHillId() {
            return this.hillId_;
         }

         public Builder setHillId(int value) {
            this.bitField0_ |= 2;
            this.hillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHillId() {
            this.bitField0_ &= -3;
            this.hillId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getUnionId() {
            return this.unionId_;
         }

         public Builder setUnionId(int value) {
            this.bitField0_ |= 4;
            this.unionId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionId() {
            this.bitField0_ &= -5;
            this.unionId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureEventIdIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.eventId_ = CrossMineMsg.CR2S_HillEvent_12370.mutableCopy(this.eventId_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getEventIdList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.eventId_) : this.eventId_);
         }

         public int getEventIdCount() {
            return this.eventId_.size();
         }

         public int getEventId(int index) {
            return this.eventId_.getInt(index);
         }

         public Builder setEventId(int index, int value) {
            this.ensureEventIdIsMutable();
            this.eventId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addEventId(int value) {
            this.ensureEventIdIsMutable();
            this.eventId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllEventId(Iterable<? extends Integer> values) {
            this.ensureEventIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.eventId_);
            this.onChanged();
            return this;
         }

         public Builder clearEventId() {
            this.eventId_ = CrossMineMsg.CR2S_HillEvent_12370.emptyIntList();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         public boolean hasDurationTime() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getDurationTime() {
            return this.durationTime_;
         }

         public Builder setDurationTime(int value) {
            this.bitField0_ |= 16;
            this.durationTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDurationTime() {
            this.bitField0_ &= -17;
            this.durationTime_ = 0;
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

   public static final class S2CR_SetDefNum_12371 extends GeneratedMessageV3 implements S2CR_SetDefNum_12371OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DEFNUM_FIELD_NUMBER = 1;
      private int defNum_;
      private byte memoizedIsInitialized;
      private static final S2CR_SetDefNum_12371 DEFAULT_INSTANCE = new S2CR_SetDefNum_12371();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_SetDefNum_12371> PARSER = new AbstractParser<S2CR_SetDefNum_12371>() {
         public S2CR_SetDefNum_12371 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_SetDefNum_12371(input, extensionRegistry);
         }
      };

      private S2CR_SetDefNum_12371(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_SetDefNum_12371() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_SetDefNum_12371();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_SetDefNum_12371(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.defNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_SetDefNum_12371_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_SetDefNum_12371_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_SetDefNum_12371.class, Builder.class);
      }

      public boolean hasDefNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDefNum() {
         return this.defNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDefNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.defNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.defNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_SetDefNum_12371)) {
            return super.equals(obj);
         } else {
            S2CR_SetDefNum_12371 other = (S2CR_SetDefNum_12371)obj;
            if (this.hasDefNum() != other.hasDefNum()) {
               return false;
            } else if (this.hasDefNum() && this.getDefNum() != other.getDefNum()) {
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
            if (this.hasDefNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDefNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_SetDefNum_12371 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_SetDefNum_12371)PARSER.parseFrom(data);
      }

      public static S2CR_SetDefNum_12371 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SetDefNum_12371)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SetDefNum_12371 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_SetDefNum_12371)PARSER.parseFrom(data);
      }

      public static S2CR_SetDefNum_12371 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SetDefNum_12371)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SetDefNum_12371 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_SetDefNum_12371)PARSER.parseFrom(data);
      }

      public static S2CR_SetDefNum_12371 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SetDefNum_12371)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SetDefNum_12371 parseFrom(InputStream input) throws IOException {
         return (S2CR_SetDefNum_12371)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_SetDefNum_12371 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SetDefNum_12371)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_SetDefNum_12371 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_SetDefNum_12371)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_SetDefNum_12371 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SetDefNum_12371)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_SetDefNum_12371 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_SetDefNum_12371)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_SetDefNum_12371 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SetDefNum_12371)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_SetDefNum_12371 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_SetDefNum_12371 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_SetDefNum_12371> parser() {
         return PARSER;
      }

      public Parser<S2CR_SetDefNum_12371> getParserForType() {
         return PARSER;
      }

      public S2CR_SetDefNum_12371 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_SetDefNum_12371OrBuilder {
         private int bitField0_;
         private int defNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_SetDefNum_12371_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_SetDefNum_12371_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_SetDefNum_12371.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.S2CR_SetDefNum_12371.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.defNum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_SetDefNum_12371_descriptor;
         }

         public S2CR_SetDefNum_12371 getDefaultInstanceForType() {
            return CrossMineMsg.S2CR_SetDefNum_12371.getDefaultInstance();
         }

         public S2CR_SetDefNum_12371 build() {
            S2CR_SetDefNum_12371 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_SetDefNum_12371 buildPartial() {
            S2CR_SetDefNum_12371 result = new S2CR_SetDefNum_12371(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.defNum_ = this.defNum_;
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
            if (other instanceof S2CR_SetDefNum_12371) {
               return this.mergeFrom((S2CR_SetDefNum_12371)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_SetDefNum_12371 other) {
            if (other == CrossMineMsg.S2CR_SetDefNum_12371.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDefNum()) {
                  this.setDefNum(other.getDefNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasDefNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_SetDefNum_12371 parsedMessage = null;

            try {
               parsedMessage = (S2CR_SetDefNum_12371)CrossMineMsg.S2CR_SetDefNum_12371.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_SetDefNum_12371)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDefNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDefNum() {
            return this.defNum_;
         }

         public Builder setDefNum(int value) {
            this.bitField0_ |= 1;
            this.defNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDefNum() {
            this.bitField0_ &= -2;
            this.defNum_ = 0;
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

   public static final class S2CR_UpdateDefPos_12373 extends GeneratedMessageV3 implements S2CR_UpdateDefPos_12373OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROPOS_FIELD_NUMBER = 1;
      private int heroPos_;
      private byte memoizedIsInitialized;
      private static final S2CR_UpdateDefPos_12373 DEFAULT_INSTANCE = new S2CR_UpdateDefPos_12373();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UpdateDefPos_12373> PARSER = new AbstractParser<S2CR_UpdateDefPos_12373>() {
         public S2CR_UpdateDefPos_12373 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UpdateDefPos_12373(input, extensionRegistry);
         }
      };

      private S2CR_UpdateDefPos_12373(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UpdateDefPos_12373() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UpdateDefPos_12373();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UpdateDefPos_12373(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroPos_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_UpdateDefPos_12373_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_UpdateDefPos_12373_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UpdateDefPos_12373.class, Builder.class);
      }

      public boolean hasHeroPos() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroPos() {
         return this.heroPos_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroPos_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroPos_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UpdateDefPos_12373)) {
            return super.equals(obj);
         } else {
            S2CR_UpdateDefPos_12373 other = (S2CR_UpdateDefPos_12373)obj;
            if (this.hasHeroPos() != other.hasHeroPos()) {
               return false;
            } else if (this.hasHeroPos() && this.getHeroPos() != other.getHeroPos()) {
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
            if (this.hasHeroPos()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroPos();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UpdateDefPos_12373 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UpdateDefPos_12373)PARSER.parseFrom(data);
      }

      public static S2CR_UpdateDefPos_12373 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UpdateDefPos_12373)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UpdateDefPos_12373 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UpdateDefPos_12373)PARSER.parseFrom(data);
      }

      public static S2CR_UpdateDefPos_12373 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UpdateDefPos_12373)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UpdateDefPos_12373 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UpdateDefPos_12373)PARSER.parseFrom(data);
      }

      public static S2CR_UpdateDefPos_12373 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UpdateDefPos_12373)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UpdateDefPos_12373 parseFrom(InputStream input) throws IOException {
         return (S2CR_UpdateDefPos_12373)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UpdateDefPos_12373 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UpdateDefPos_12373)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UpdateDefPos_12373 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UpdateDefPos_12373)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UpdateDefPos_12373 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UpdateDefPos_12373)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UpdateDefPos_12373 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UpdateDefPos_12373)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UpdateDefPos_12373 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UpdateDefPos_12373)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UpdateDefPos_12373 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UpdateDefPos_12373 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UpdateDefPos_12373> parser() {
         return PARSER;
      }

      public Parser<S2CR_UpdateDefPos_12373> getParserForType() {
         return PARSER;
      }

      public S2CR_UpdateDefPos_12373 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UpdateDefPos_12373OrBuilder {
         private int bitField0_;
         private int heroPos_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_UpdateDefPos_12373_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_UpdateDefPos_12373_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UpdateDefPos_12373.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.S2CR_UpdateDefPos_12373.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroPos_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_UpdateDefPos_12373_descriptor;
         }

         public S2CR_UpdateDefPos_12373 getDefaultInstanceForType() {
            return CrossMineMsg.S2CR_UpdateDefPos_12373.getDefaultInstance();
         }

         public S2CR_UpdateDefPos_12373 build() {
            S2CR_UpdateDefPos_12373 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UpdateDefPos_12373 buildPartial() {
            S2CR_UpdateDefPos_12373 result = new S2CR_UpdateDefPos_12373(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroPos_ = this.heroPos_;
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
            if (other instanceof S2CR_UpdateDefPos_12373) {
               return this.mergeFrom((S2CR_UpdateDefPos_12373)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UpdateDefPos_12373 other) {
            if (other == CrossMineMsg.S2CR_UpdateDefPos_12373.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroPos()) {
                  this.setHeroPos(other.getHeroPos());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasHeroPos();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UpdateDefPos_12373 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UpdateDefPos_12373)CrossMineMsg.S2CR_UpdateDefPos_12373.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UpdateDefPos_12373)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroPos() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroPos() {
            return this.heroPos_;
         }

         public Builder setHeroPos(int value) {
            this.bitField0_ |= 1;
            this.heroPos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroPos() {
            this.bitField0_ &= -2;
            this.heroPos_ = 0;
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

   public static final class S2CR_SpecialRedState_12375 extends GeneratedMessageV3 implements S2CR_SpecialRedState_12375OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_SpecialRedState_12375 DEFAULT_INSTANCE = new S2CR_SpecialRedState_12375();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_SpecialRedState_12375> PARSER = new AbstractParser<S2CR_SpecialRedState_12375>() {
         public S2CR_SpecialRedState_12375 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_SpecialRedState_12375(input, extensionRegistry);
         }
      };

      private S2CR_SpecialRedState_12375(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_SpecialRedState_12375() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_SpecialRedState_12375();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_SpecialRedState_12375(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_SpecialRedState_12375_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_SpecialRedState_12375_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_SpecialRedState_12375.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_SpecialRedState_12375)) {
            return super.equals(obj);
         } else {
            S2CR_SpecialRedState_12375 other = (S2CR_SpecialRedState_12375)obj;
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

      public static S2CR_SpecialRedState_12375 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_SpecialRedState_12375)PARSER.parseFrom(data);
      }

      public static S2CR_SpecialRedState_12375 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SpecialRedState_12375)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SpecialRedState_12375 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_SpecialRedState_12375)PARSER.parseFrom(data);
      }

      public static S2CR_SpecialRedState_12375 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SpecialRedState_12375)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SpecialRedState_12375 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_SpecialRedState_12375)PARSER.parseFrom(data);
      }

      public static S2CR_SpecialRedState_12375 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SpecialRedState_12375)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SpecialRedState_12375 parseFrom(InputStream input) throws IOException {
         return (S2CR_SpecialRedState_12375)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_SpecialRedState_12375 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SpecialRedState_12375)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_SpecialRedState_12375 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_SpecialRedState_12375)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_SpecialRedState_12375 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SpecialRedState_12375)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_SpecialRedState_12375 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_SpecialRedState_12375)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_SpecialRedState_12375 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SpecialRedState_12375)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_SpecialRedState_12375 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_SpecialRedState_12375 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_SpecialRedState_12375> parser() {
         return PARSER;
      }

      public Parser<S2CR_SpecialRedState_12375> getParserForType() {
         return PARSER;
      }

      public S2CR_SpecialRedState_12375 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_SpecialRedState_12375OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_SpecialRedState_12375_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_SpecialRedState_12375_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_SpecialRedState_12375.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.S2CR_SpecialRedState_12375.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_SpecialRedState_12375_descriptor;
         }

         public S2CR_SpecialRedState_12375 getDefaultInstanceForType() {
            return CrossMineMsg.S2CR_SpecialRedState_12375.getDefaultInstance();
         }

         public S2CR_SpecialRedState_12375 build() {
            S2CR_SpecialRedState_12375 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_SpecialRedState_12375 buildPartial() {
            S2CR_SpecialRedState_12375 result = new S2CR_SpecialRedState_12375(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_SpecialRedState_12375) {
               return this.mergeFrom((S2CR_SpecialRedState_12375)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_SpecialRedState_12375 other) {
            if (other == CrossMineMsg.S2CR_SpecialRedState_12375.getDefaultInstance()) {
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
            S2CR_SpecialRedState_12375 parsedMessage = null;

            try {
               parsedMessage = (S2CR_SpecialRedState_12375)CrossMineMsg.S2CR_SpecialRedState_12375.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_SpecialRedState_12375)e.getUnfinishedMessage();
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

   public static final class S2CR_GetMineVein_12377 extends GeneratedMessageV3 implements S2CR_GetMineVein_12377OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FORCE_FIELD_NUMBER = 1;
      private int force_;
      public static final int LINE_FIELD_NUMBER = 2;
      private int line_;
      public static final int HILLID_FIELD_NUMBER = 3;
      private int hillId_;
      public static final int HEROARRAYINGDATA_FIELD_NUMBER = 4;
      private ByteString heroArrayingData_;
      private byte memoizedIsInitialized;
      private static final S2CR_GetMineVein_12377 DEFAULT_INSTANCE = new S2CR_GetMineVein_12377();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_GetMineVein_12377> PARSER = new AbstractParser<S2CR_GetMineVein_12377>() {
         public S2CR_GetMineVein_12377 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_GetMineVein_12377(input, extensionRegistry);
         }
      };

      private S2CR_GetMineVein_12377(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_GetMineVein_12377() {
         this.memoizedIsInitialized = -1;
         this.heroArrayingData_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_GetMineVein_12377();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_GetMineVein_12377(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.force_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.line_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.hillId_ = input.readInt32();
                        break;
                     case 34:
                        this.bitField0_ |= 8;
                        this.heroArrayingData_ = input.readBytes();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_GetMineVein_12377_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_GetMineVein_12377_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GetMineVein_12377.class, Builder.class);
      }

      public boolean hasForce() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getForce() {
         return this.force_;
      }

      public boolean hasLine() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLine() {
         return this.line_;
      }

      public boolean hasHillId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHillId() {
         return this.hillId_;
      }

      public boolean hasHeroArrayingData() {
         return (this.bitField0_ & 8) != 0;
      }

      public ByteString getHeroArrayingData() {
         return this.heroArrayingData_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasForce()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLine()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHillId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroArrayingData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.force_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.line_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.hillId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBytes(4, this.heroArrayingData_);
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
               size += CodedOutputStream.computeInt32Size(1, this.force_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.line_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.hillId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBytesSize(4, this.heroArrayingData_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_GetMineVein_12377)) {
            return super.equals(obj);
         } else {
            S2CR_GetMineVein_12377 other = (S2CR_GetMineVein_12377)obj;
            if (this.hasForce() != other.hasForce()) {
               return false;
            } else if (this.hasForce() && this.getForce() != other.getForce()) {
               return false;
            } else if (this.hasLine() != other.hasLine()) {
               return false;
            } else if (this.hasLine() && this.getLine() != other.getLine()) {
               return false;
            } else if (this.hasHillId() != other.hasHillId()) {
               return false;
            } else if (this.hasHillId() && this.getHillId() != other.getHillId()) {
               return false;
            } else if (this.hasHeroArrayingData() != other.hasHeroArrayingData()) {
               return false;
            } else if (this.hasHeroArrayingData() && !this.getHeroArrayingData().equals(other.getHeroArrayingData())) {
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
            if (this.hasForce()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getForce();
            }

            if (this.hasLine()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLine();
            }

            if (this.hasHillId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHillId();
            }

            if (this.hasHeroArrayingData()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHeroArrayingData().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_GetMineVein_12377 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_GetMineVein_12377)PARSER.parseFrom(data);
      }

      public static S2CR_GetMineVein_12377 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GetMineVein_12377)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GetMineVein_12377 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_GetMineVein_12377)PARSER.parseFrom(data);
      }

      public static S2CR_GetMineVein_12377 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GetMineVein_12377)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GetMineVein_12377 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_GetMineVein_12377)PARSER.parseFrom(data);
      }

      public static S2CR_GetMineVein_12377 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GetMineVein_12377)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GetMineVein_12377 parseFrom(InputStream input) throws IOException {
         return (S2CR_GetMineVein_12377)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GetMineVein_12377 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GetMineVein_12377)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GetMineVein_12377 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_GetMineVein_12377)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_GetMineVein_12377 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GetMineVein_12377)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GetMineVein_12377 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_GetMineVein_12377)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GetMineVein_12377 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GetMineVein_12377)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_GetMineVein_12377 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_GetMineVein_12377 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_GetMineVein_12377> parser() {
         return PARSER;
      }

      public Parser<S2CR_GetMineVein_12377> getParserForType() {
         return PARSER;
      }

      public S2CR_GetMineVein_12377 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_GetMineVein_12377OrBuilder {
         private int bitField0_;
         private int force_;
         private int line_;
         private int hillId_;
         private ByteString heroArrayingData_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_GetMineVein_12377_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_GetMineVein_12377_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GetMineVein_12377.class, Builder.class);
         }

         private Builder() {
            this.heroArrayingData_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroArrayingData_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.S2CR_GetMineVein_12377.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.force_ = 0;
            this.bitField0_ &= -2;
            this.line_ = 0;
            this.bitField0_ &= -3;
            this.hillId_ = 0;
            this.bitField0_ &= -5;
            this.heroArrayingData_ = ByteString.EMPTY;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_GetMineVein_12377_descriptor;
         }

         public S2CR_GetMineVein_12377 getDefaultInstanceForType() {
            return CrossMineMsg.S2CR_GetMineVein_12377.getDefaultInstance();
         }

         public S2CR_GetMineVein_12377 build() {
            S2CR_GetMineVein_12377 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_GetMineVein_12377 buildPartial() {
            S2CR_GetMineVein_12377 result = new S2CR_GetMineVein_12377(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.force_ = this.force_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.line_ = this.line_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.hillId_ = this.hillId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.heroArrayingData_ = this.heroArrayingData_;
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
            if (other instanceof S2CR_GetMineVein_12377) {
               return this.mergeFrom((S2CR_GetMineVein_12377)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_GetMineVein_12377 other) {
            if (other == CrossMineMsg.S2CR_GetMineVein_12377.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasForce()) {
                  this.setForce(other.getForce());
               }

               if (other.hasLine()) {
                  this.setLine(other.getLine());
               }

               if (other.hasHillId()) {
                  this.setHillId(other.getHillId());
               }

               if (other.hasHeroArrayingData()) {
                  this.setHeroArrayingData(other.getHeroArrayingData());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasForce()) {
               return false;
            } else if (!this.hasLine()) {
               return false;
            } else if (!this.hasHillId()) {
               return false;
            } else {
               return this.hasHeroArrayingData();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_GetMineVein_12377 parsedMessage = null;

            try {
               parsedMessage = (S2CR_GetMineVein_12377)CrossMineMsg.S2CR_GetMineVein_12377.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_GetMineVein_12377)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasForce() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getForce() {
            return this.force_;
         }

         public Builder setForce(int value) {
            this.bitField0_ |= 1;
            this.force_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearForce() {
            this.bitField0_ &= -2;
            this.force_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLine() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLine() {
            return this.line_;
         }

         public Builder setLine(int value) {
            this.bitField0_ |= 2;
            this.line_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLine() {
            this.bitField0_ &= -3;
            this.line_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHillId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getHillId() {
            return this.hillId_;
         }

         public Builder setHillId(int value) {
            this.bitField0_ |= 4;
            this.hillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHillId() {
            this.bitField0_ &= -5;
            this.hillId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroArrayingData() {
            return (this.bitField0_ & 8) != 0;
         }

         public ByteString getHeroArrayingData() {
            return this.heroArrayingData_;
         }

         public Builder setHeroArrayingData(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.heroArrayingData_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearHeroArrayingData() {
            this.bitField0_ &= -9;
            this.heroArrayingData_ = CrossMineMsg.S2CR_GetMineVein_12377.getDefaultInstance().getHeroArrayingData();
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

   public static final class S2CR_GuanJiaOperate_12379 extends GeneratedMessageV3 implements S2CR_GuanJiaOperate_12379OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_GuanJiaOperate_12379 DEFAULT_INSTANCE = new S2CR_GuanJiaOperate_12379();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_GuanJiaOperate_12379> PARSER = new AbstractParser<S2CR_GuanJiaOperate_12379>() {
         public S2CR_GuanJiaOperate_12379 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_GuanJiaOperate_12379(input, extensionRegistry);
         }
      };

      private S2CR_GuanJiaOperate_12379(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_GuanJiaOperate_12379() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_GuanJiaOperate_12379();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_GuanJiaOperate_12379(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_GuanJiaOperate_12379_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_GuanJiaOperate_12379_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GuanJiaOperate_12379.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_GuanJiaOperate_12379)) {
            return super.equals(obj);
         } else {
            S2CR_GuanJiaOperate_12379 other = (S2CR_GuanJiaOperate_12379)obj;
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

      public static S2CR_GuanJiaOperate_12379 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_GuanJiaOperate_12379)PARSER.parseFrom(data);
      }

      public static S2CR_GuanJiaOperate_12379 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GuanJiaOperate_12379)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GuanJiaOperate_12379 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_GuanJiaOperate_12379)PARSER.parseFrom(data);
      }

      public static S2CR_GuanJiaOperate_12379 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GuanJiaOperate_12379)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GuanJiaOperate_12379 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_GuanJiaOperate_12379)PARSER.parseFrom(data);
      }

      public static S2CR_GuanJiaOperate_12379 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GuanJiaOperate_12379)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GuanJiaOperate_12379 parseFrom(InputStream input) throws IOException {
         return (S2CR_GuanJiaOperate_12379)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GuanJiaOperate_12379 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GuanJiaOperate_12379)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GuanJiaOperate_12379 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_GuanJiaOperate_12379)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_GuanJiaOperate_12379 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GuanJiaOperate_12379)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GuanJiaOperate_12379 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_GuanJiaOperate_12379)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GuanJiaOperate_12379 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GuanJiaOperate_12379)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_GuanJiaOperate_12379 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_GuanJiaOperate_12379 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_GuanJiaOperate_12379> parser() {
         return PARSER;
      }

      public Parser<S2CR_GuanJiaOperate_12379> getParserForType() {
         return PARSER;
      }

      public S2CR_GuanJiaOperate_12379 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_GuanJiaOperate_12379OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_GuanJiaOperate_12379_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_GuanJiaOperate_12379_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GuanJiaOperate_12379.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.S2CR_GuanJiaOperate_12379.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_S2CR_GuanJiaOperate_12379_descriptor;
         }

         public S2CR_GuanJiaOperate_12379 getDefaultInstanceForType() {
            return CrossMineMsg.S2CR_GuanJiaOperate_12379.getDefaultInstance();
         }

         public S2CR_GuanJiaOperate_12379 build() {
            S2CR_GuanJiaOperate_12379 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_GuanJiaOperate_12379 buildPartial() {
            S2CR_GuanJiaOperate_12379 result = new S2CR_GuanJiaOperate_12379(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_GuanJiaOperate_12379) {
               return this.mergeFrom((S2CR_GuanJiaOperate_12379)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_GuanJiaOperate_12379 other) {
            if (other == CrossMineMsg.S2CR_GuanJiaOperate_12379.getDefaultInstance()) {
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
            S2CR_GuanJiaOperate_12379 parsedMessage = null;

            try {
               parsedMessage = (S2CR_GuanJiaOperate_12379)CrossMineMsg.S2CR_GuanJiaOperate_12379.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_GuanJiaOperate_12379)e.getUnfinishedMessage();
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

   public static final class CR2S_GuanJiaOperate_12380 extends GeneratedMessageV3 implements CR2S_GuanJiaOperate_12380OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int REWARDS_FIELD_NUMBER = 3;
      private List<CommonMsg.ItemInfo> rewards_;
      private byte memoizedIsInitialized;
      private static final CR2S_GuanJiaOperate_12380 DEFAULT_INSTANCE = new CR2S_GuanJiaOperate_12380();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_GuanJiaOperate_12380> PARSER = new AbstractParser<CR2S_GuanJiaOperate_12380>() {
         public CR2S_GuanJiaOperate_12380 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_GuanJiaOperate_12380(input, extensionRegistry);
         }
      };

      private CR2S_GuanJiaOperate_12380(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_GuanJiaOperate_12380() {
         this.memoizedIsInitialized = -1;
         this.rewards_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_GuanJiaOperate_12380();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_GuanJiaOperate_12380(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 26:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.rewards_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.rewards_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.rewards_ = Collections.unmodifiableList(this.rewards_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_GuanJiaOperate_12380_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_GuanJiaOperate_12380_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_GuanJiaOperate_12380.class, Builder.class);
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

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
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
         for(int i = 0; i < this.rewards_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.rewards_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.rewards_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.rewards_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_GuanJiaOperate_12380)) {
            return super.equals(obj);
         } else {
            CR2S_GuanJiaOperate_12380 other = (CR2S_GuanJiaOperate_12380)obj;
            if (!this.getRewardsList().equals(other.getRewardsList())) {
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
            if (this.getRewardsCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRewardsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_GuanJiaOperate_12380 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_GuanJiaOperate_12380)PARSER.parseFrom(data);
      }

      public static CR2S_GuanJiaOperate_12380 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GuanJiaOperate_12380)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GuanJiaOperate_12380 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_GuanJiaOperate_12380)PARSER.parseFrom(data);
      }

      public static CR2S_GuanJiaOperate_12380 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GuanJiaOperate_12380)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GuanJiaOperate_12380 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_GuanJiaOperate_12380)PARSER.parseFrom(data);
      }

      public static CR2S_GuanJiaOperate_12380 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GuanJiaOperate_12380)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GuanJiaOperate_12380 parseFrom(InputStream input) throws IOException {
         return (CR2S_GuanJiaOperate_12380)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_GuanJiaOperate_12380 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GuanJiaOperate_12380)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_GuanJiaOperate_12380 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_GuanJiaOperate_12380)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_GuanJiaOperate_12380 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GuanJiaOperate_12380)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_GuanJiaOperate_12380 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_GuanJiaOperate_12380)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_GuanJiaOperate_12380 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GuanJiaOperate_12380)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_GuanJiaOperate_12380 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_GuanJiaOperate_12380 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_GuanJiaOperate_12380> parser() {
         return PARSER;
      }

      public Parser<CR2S_GuanJiaOperate_12380> getParserForType() {
         return PARSER;
      }

      public CR2S_GuanJiaOperate_12380 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_GuanJiaOperate_12380OrBuilder {
         private int bitField0_;
         private List<CommonMsg.ItemInfo> rewards_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> rewardsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_GuanJiaOperate_12380_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_GuanJiaOperate_12380_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_GuanJiaOperate_12380.class, Builder.class);
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
            if (CrossMineMsg.CR2S_GuanJiaOperate_12380.alwaysUseFieldBuilders) {
               this.getRewardsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.rewardsBuilder_ == null) {
               this.rewards_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.rewardsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_GuanJiaOperate_12380_descriptor;
         }

         public CR2S_GuanJiaOperate_12380 getDefaultInstanceForType() {
            return CrossMineMsg.CR2S_GuanJiaOperate_12380.getDefaultInstance();
         }

         public CR2S_GuanJiaOperate_12380 build() {
            CR2S_GuanJiaOperate_12380 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_GuanJiaOperate_12380 buildPartial() {
            CR2S_GuanJiaOperate_12380 result = new CR2S_GuanJiaOperate_12380(this);
            int from_bitField0_ = this.bitField0_;
            if (this.rewardsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.rewards_ = Collections.unmodifiableList(this.rewards_);
                  this.bitField0_ &= -2;
               }

               result.rewards_ = this.rewards_;
            } else {
               result.rewards_ = this.rewardsBuilder_.build();
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
            if (other instanceof CR2S_GuanJiaOperate_12380) {
               return this.mergeFrom((CR2S_GuanJiaOperate_12380)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_GuanJiaOperate_12380 other) {
            if (other == CrossMineMsg.CR2S_GuanJiaOperate_12380.getDefaultInstance()) {
               return this;
            } else {
               if (this.rewardsBuilder_ == null) {
                  if (!other.rewards_.isEmpty()) {
                     if (this.rewards_.isEmpty()) {
                        this.rewards_ = other.rewards_;
                        this.bitField0_ &= -2;
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
                     this.bitField0_ &= -2;
                     this.rewardsBuilder_ = CrossMineMsg.CR2S_GuanJiaOperate_12380.alwaysUseFieldBuilders ? this.getRewardsFieldBuilder() : null;
                  } else {
                     this.rewardsBuilder_.addAllMessages(other.rewards_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getRewardsCount(); ++i) {
               if (!this.getRewards(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_GuanJiaOperate_12380 parsedMessage = null;

            try {
               parsedMessage = (CR2S_GuanJiaOperate_12380)CrossMineMsg.CR2S_GuanJiaOperate_12380.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_GuanJiaOperate_12380)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRewardsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.rewards_ = new ArrayList(this.rewards_);
               this.bitField0_ |= 1;
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
               this.bitField0_ &= -2;
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
               this.rewardsBuilder_ = new RepeatedFieldBuilderV3(this.rewards_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.rewards_ = null;
            }

            return this.rewardsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_MergeMine_12382 extends GeneratedMessageV3 implements CR2S_MergeMine_12382OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private Internal.IntList playerId_;
      private byte memoizedIsInitialized;
      private static final CR2S_MergeMine_12382 DEFAULT_INSTANCE = new CR2S_MergeMine_12382();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_MergeMine_12382> PARSER = new AbstractParser<CR2S_MergeMine_12382>() {
         public CR2S_MergeMine_12382 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_MergeMine_12382(input, extensionRegistry);
         }
      };

      private CR2S_MergeMine_12382(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_MergeMine_12382() {
         this.memoizedIsInitialized = -1;
         this.playerId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_MergeMine_12382();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_MergeMine_12382(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.playerId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.playerId_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.playerId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.playerId_.addInt(input.readInt32());
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
                  this.playerId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_MergeMine_12382_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_MergeMine_12382_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_MergeMine_12382.class, Builder.class);
      }

      public List<Integer> getPlayerIdList() {
         return this.playerId_;
      }

      public int getPlayerIdCount() {
         return this.playerId_.size();
      }

      public int getPlayerId(int index) {
         return this.playerId_.getInt(index);
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
         for(int i = 0; i < this.playerId_.size(); ++i) {
            output.writeInt32(1, this.playerId_.getInt(i));
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

            for(int i = 0; i < this.playerId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.playerId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPlayerIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_MergeMine_12382)) {
            return super.equals(obj);
         } else {
            CR2S_MergeMine_12382 other = (CR2S_MergeMine_12382)obj;
            if (!this.getPlayerIdList().equals(other.getPlayerIdList())) {
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
            if (this.getPlayerIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_MergeMine_12382 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_MergeMine_12382)PARSER.parseFrom(data);
      }

      public static CR2S_MergeMine_12382 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_MergeMine_12382)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_MergeMine_12382 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_MergeMine_12382)PARSER.parseFrom(data);
      }

      public static CR2S_MergeMine_12382 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_MergeMine_12382)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_MergeMine_12382 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_MergeMine_12382)PARSER.parseFrom(data);
      }

      public static CR2S_MergeMine_12382 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_MergeMine_12382)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_MergeMine_12382 parseFrom(InputStream input) throws IOException {
         return (CR2S_MergeMine_12382)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_MergeMine_12382 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_MergeMine_12382)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_MergeMine_12382 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_MergeMine_12382)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_MergeMine_12382 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_MergeMine_12382)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_MergeMine_12382 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_MergeMine_12382)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_MergeMine_12382 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_MergeMine_12382)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_MergeMine_12382 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_MergeMine_12382 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_MergeMine_12382> parser() {
         return PARSER;
      }

      public Parser<CR2S_MergeMine_12382> getParserForType() {
         return PARSER;
      }

      public CR2S_MergeMine_12382 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_MergeMine_12382OrBuilder {
         private int bitField0_;
         private Internal.IntList playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_MergeMine_12382_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_MergeMine_12382_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_MergeMine_12382.class, Builder.class);
         }

         private Builder() {
            this.playerId_ = CrossMineMsg.CR2S_MergeMine_12382.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerId_ = CrossMineMsg.CR2S_MergeMine_12382.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMineMsg.CR2S_MergeMine_12382.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = CrossMineMsg.CR2S_MergeMine_12382.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMineMsg.internal_static_crossMine_com_gzbz_protobuf_CR2S_MergeMine_12382_descriptor;
         }

         public CR2S_MergeMine_12382 getDefaultInstanceForType() {
            return CrossMineMsg.CR2S_MergeMine_12382.getDefaultInstance();
         }

         public CR2S_MergeMine_12382 build() {
            CR2S_MergeMine_12382 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_MergeMine_12382 buildPartial() {
            CR2S_MergeMine_12382 result = new CR2S_MergeMine_12382(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.playerId_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.playerId_ = this.playerId_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_MergeMine_12382) {
               return this.mergeFrom((CR2S_MergeMine_12382)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_MergeMine_12382 other) {
            if (other == CrossMineMsg.CR2S_MergeMine_12382.getDefaultInstance()) {
               return this;
            } else {
               if (!other.playerId_.isEmpty()) {
                  if (this.playerId_.isEmpty()) {
                     this.playerId_ = other.playerId_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensurePlayerIdIsMutable();
                     this.playerId_.addAll(other.playerId_);
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
            CR2S_MergeMine_12382 parsedMessage = null;

            try {
               parsedMessage = (CR2S_MergeMine_12382)CrossMineMsg.CR2S_MergeMine_12382.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_MergeMine_12382)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensurePlayerIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.playerId_ = CrossMineMsg.CR2S_MergeMine_12382.mutableCopy(this.playerId_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getPlayerIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.playerId_) : this.playerId_);
         }

         public int getPlayerIdCount() {
            return this.playerId_.size();
         }

         public int getPlayerId(int index) {
            return this.playerId_.getInt(index);
         }

         public Builder setPlayerId(int index, int value) {
            this.ensurePlayerIdIsMutable();
            this.playerId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPlayerId(int value) {
            this.ensurePlayerIdIsMutable();
            this.playerId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPlayerId(Iterable<? extends Integer> values) {
            this.ensurePlayerIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.playerId_);
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.playerId_ = CrossMineMsg.CR2S_MergeMine_12382.emptyIntList();
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

   public interface CR2S_ATK_12322OrBuilder extends MessageOrBuilder {
      boolean hasHillId();

      int getHillId();

      boolean hasBattleMsg();

      BattleMsg.S2C_BattleResult_6102 getBattleMsg();

      BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder();

      boolean hasIsAtkPlayer();

      boolean getIsAtkPlayer();
   }

   public interface CR2S_AddLine_12352OrBuilder extends MessageOrBuilder {
      boolean hasTotalLine();

      int getTotalLine();
   }

   public interface CR2S_ChangInfo_12358OrBuilder extends MessageOrBuilder {
      List<MineMsg.Chaneg_Info> getChangeInfoList();

      MineMsg.Chaneg_Info getChangeInfo(int index);

      int getChangeInfoCount();

      List<? extends MineMsg.Chaneg_InfoOrBuilder> getChangeInfoOrBuilderList();

      MineMsg.Chaneg_InfoOrBuilder getChangeInfoOrBuilder(int index);
   }

   public interface CR2S_ClearRevenge_12340OrBuilder extends MessageOrBuilder {
   }

   public interface CR2S_DefArraying_12346OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasHeroPos();

      int getHeroPos();
   }

   public interface CR2S_GetMineRewards_12312OrBuilder extends MessageOrBuilder {
      List<CommonMsg.ItemInfo> getRewardsList();

      CommonMsg.ItemInfo getRewards(int index);

      int getRewardsCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getRewardsOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getRewardsOrBuilder(int index);

      boolean hasDurationTime();

      int getDurationTime();
   }

   public interface CR2S_GuanJiaOperate_12380OrBuilder extends MessageOrBuilder {
      List<CommonMsg.ItemInfo> getRewardsList();

      CommonMsg.ItemInfo getRewards(int index);

      int getRewardsCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getRewardsOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getRewardsOrBuilder(int index);
   }

   public interface CR2S_HillEvent_12370OrBuilder extends MessageOrBuilder {
      boolean hasLine();

      int getLine();

      boolean hasHillId();

      int getHillId();

      boolean hasUnionId();

      int getUnionId();

      List<Integer> getEventIdList();

      int getEventIdCount();

      int getEventId(int index);

      boolean hasDurationTime();

      int getDurationTime();
   }

   public interface CR2S_LogOperate_12366OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasFight();

      long getFight();

      boolean hasUnionName();

      String getUnionName();

      ByteString getUnionNameBytes();

      boolean hasVeinId();

      int getVeinId();

      boolean hasAtkType();

      int getAtkType();

      boolean hasResult();

      boolean getResult();
   }

   public interface CR2S_LoseMineVein_12336OrBuilder extends MessageOrBuilder {
      boolean hasRevengeId();

      int getRevengeId();

      boolean hasLoseTime();

      int getLoseTime();

      boolean hasFallNum();

      int getFallNum();

      List<CommonMsg.ItemInfo> getRewardsList();

      CommonMsg.ItemInfo getRewards(int index);

      int getRewardsCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getRewardsOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getRewardsOrBuilder(int index);

      boolean hasDurationTime();

      int getDurationTime();

      boolean hasSpecial();

      boolean getSpecial();
   }

   public interface CR2S_MailResource_12326OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      List<CommonMsg.ItemInfo> getItemsList();

      CommonMsg.ItemInfo getItems(int index);

      int getItemsCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index);
   }

   public interface CR2S_MergeMine_12382OrBuilder extends MessageOrBuilder {
      List<Integer> getPlayerIdList();

      int getPlayerIdCount();

      int getPlayerId(int index);
   }

   public interface CR2S_MineAcrossDay_12360OrBuilder extends MessageOrBuilder {
   }

   public interface CR2S_NotifyState_12344OrBuilder extends MessageOrBuilder {
      boolean hasState();

      int getState();
   }

   public interface CR2S_RankReward_12348OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      List<String> getRankInfoList();

      int getRankInfoCount();

      String getRankInfo(int index);

      ByteString getRankInfoBytes(int index);
   }

   public interface CR2S_UpdateHillInfo_12330OrBuilder extends MessageOrBuilder {
      List<MineMsg.HillUnionEvent> getInfoList();

      MineMsg.HillUnionEvent getInfo(int index);

      int getInfoCount();

      List<? extends MineMsg.HillUnionEventOrBuilder> getInfoOrBuilderList();

      MineMsg.HillUnionEventOrBuilder getInfoOrBuilder(int index);
   }

   public interface CR2S_UpdateLine_12364OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      List<Integer> getLineList();

      int getLineCount();

      int getLine(int index);
   }

   public interface CR2S_UpdateMineInfo_12306OrBuilder extends MessageOrBuilder {
      List<MineMsg.MineVeinInfo> getMineVeinInfoList();

      MineMsg.MineVeinInfo getMineVeinInfo(int index);

      int getMineVeinInfoCount();

      List<? extends MineMsg.MineVeinInfoOrBuilder> getMineVeinInfoOrBuilderList();

      MineMsg.MineVeinInfoOrBuilder getMineVeinInfoOrBuilder(int index);
   }

   public interface CR2S_UpdatePerson_12324OrBuilder extends MessageOrBuilder {
      boolean hasLine();

      int getLine();

      boolean hasHillId();

      int getHillId();

      boolean hasVeinId();

      int getVeinId();

      boolean hasStartTime();

      int getStartTime();

      boolean hasHaving();

      boolean getHaving();

      List<Integer> getEventIdList();

      int getEventIdCount();

      int getEventId(int index);

      boolean hasHitMonster();

      boolean getHitMonster();
   }

   public interface CR2S_UseEnergy_12338OrBuilder extends MessageOrBuilder {
      boolean hasBFree();

      boolean getBFree();
   }

   public interface S2CR_ATK_12321OrBuilder extends MessageOrBuilder {
      boolean hasAtkType();

      int getAtkType();

      boolean hasLine();

      int getLine();

      boolean hasHillId();

      int getHillId();

      boolean hasMineVeinId();

      int getMineVeinId();

      boolean hasHeroArrayingData();

      ByteString getHeroArrayingData();

      boolean hasHeroMirror();

      ByteString getHeroMirror();

      boolean hasHeroPos();

      int getHeroPos();

      boolean hasRevengeId();

      int getRevengeId();

      boolean hasCurEnergy();

      int getCurEnergy();

      boolean hasHigestMineType();

      int getHigestMineType();

      boolean hasAtkWithEmployNum();

      int getAtkWithEmployNum();
   }

   public interface S2CR_ArrayingDef_12333OrBuilder extends MessageOrBuilder {
      boolean hasArraying();

      ByteString getArraying();
   }

   public interface S2CR_ChangeLine_12349OrBuilder extends MessageOrBuilder {
      boolean hasLine();

      int getLine();
   }

   public interface S2CR_CheckEmptyVein_12367OrBuilder extends MessageOrBuilder {
      boolean hasLine();

      int getLine();

      boolean hasHillId();

      int getHillId();
   }

   public interface S2CR_DefArraying_12345OrBuilder extends MessageOrBuilder {
      boolean hasHeroArrayingData();

      ByteString getHeroArrayingData();

      boolean hasHeroMirror();

      ByteString getHeroMirror();

      boolean hasHeroPos();

      int getHeroPos();
   }

   public interface S2CR_GetMineRewards_12311OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_GetMineVein_12377OrBuilder extends MessageOrBuilder {
      boolean hasForce();

      int getForce();

      boolean hasLine();

      int getLine();

      boolean hasHillId();

      int getHillId();

      boolean hasHeroArrayingData();

      ByteString getHeroArrayingData();
   }

   public interface S2CR_GuanJiaOperate_12379OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_HillEvent_12369OrBuilder extends MessageOrBuilder {
      boolean hasLine();

      int getLine();

      boolean hasHillId();

      int getHillId();

      boolean hasUnionId();

      int getUnionId();
   }

   public interface S2CR_MineDetail_12319OrBuilder extends MessageOrBuilder {
      boolean hasLine();

      int getLine();

      boolean hasHillId();

      int getHillId();

      boolean hasVeinId();

      int getVeinId();

      boolean hasFight();

      long getFight();
   }

   public interface S2CR_MineInfo_12303OrBuilder extends MessageOrBuilder {
      boolean hasLine();

      int getLine();

      boolean hasHillId();

      int getHillId();
   }

   public interface S2CR_MineNote_12331OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_MineRank_12341OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface S2CR_MyMineInfo_12315OrBuilder extends MessageOrBuilder {
      boolean hasLine();

      int getLine();

      boolean hasHillId();

      int getHillId();

      boolean hasVeinId();

      int getVeinId();

      boolean hasFallNum();

      int getFallNum();

      boolean hasRevengeId();

      int getRevengeId();

      boolean hasDurationTime();

      int getDurationTime();
   }

   public interface S2CR_PlayerEnter_12301OrBuilder extends MessageOrBuilder {
      boolean hasUseEnergy();

      int getUseEnergy();

      boolean hasResumeTime();

      int getResumeTime();

      boolean hasBuyTime();

      int getBuyTime();

      boolean hasMyHillId();

      int getMyHillId();

      boolean hasMyVeinId();

      int getMyVeinId();

      boolean hasFallNum();

      int getFallNum();

      boolean hasRevengeId();

      int getRevengeId();

      boolean hasSupportHero();

      MineMsg.FriendSupportHero getSupportHero();

      MineMsg.FriendSupportHeroOrBuilder getSupportHeroOrBuilder();

      boolean hasFightCollTime();

      int getFightCollTime();

      boolean hasAtkHeroPos();

      int getAtkHeroPos();

      boolean hasDurationTime();

      int getDurationTime();

      boolean hasHigestOccupyMineType();

      int getHigestOccupyMineType();

      boolean hasEmployNunOfWeek();

      int getEmployNunOfWeek();
   }

   public interface S2CR_RedDotState_12353OrBuilder extends MessageOrBuilder {
      List<MineMsg.RedState> getRedStateList();

      int getRedStateCount();

      MineMsg.RedState getRedState(int index);
   }

   public interface S2CR_RewardPreview_12309OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_SetDefNum_12371OrBuilder extends MessageOrBuilder {
      boolean hasDefNum();

      int getDefNum();
   }

   public interface S2CR_SetMineState_12361OrBuilder extends MessageOrBuilder {
      boolean hasState();

      int getState();
   }

   public interface S2CR_SpecialRedState_12375OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_UpdateDefPos_12373OrBuilder extends MessageOrBuilder {
      boolean hasHeroPos();

      int getHeroPos();
   }

   public interface S2CR_UpdateLine_12363OrBuilder extends MessageOrBuilder {
      boolean hasOffValue();

      int getOffValue();
   }
}
