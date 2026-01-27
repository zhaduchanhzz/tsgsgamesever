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
import com.google.protobuf.ProtocolMessageEnum;
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

public final class SupremePvpMsg {
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_RankInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_RankInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_SettleInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_SettleInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_C2S_Main_28501_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_C2S_Main_28501_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_S2C_Main_28502_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_S2C_Main_28502_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_C2S_Rank_28503_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_C2S_Rank_28503_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_S2C_Rank_28504_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_S2C_Rank_28504_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_C2S_ChallengeList_28505_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_C2S_ChallengeList_28505_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_S2C_ChallengeList_28506_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_S2C_ChallengeList_28506_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_C2S_FightRecord_28507_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_C2S_FightRecord_28507_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_S2C_FightRecord_28508_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_S2C_FightRecord_28508_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrderBuy_28509_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrderBuy_28509_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderBuy_28510_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderBuy_28510_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderLv_28512_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderLv_28512_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrder_28513_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrder_28513_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrder_28514_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrder_28514_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrderRewardAll_28515_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrderRewardAll_28515_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderRewardAll_28516_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderRewardAll_28516_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_S2C_SeasonSettle_28518_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_S2C_SeasonSettle_28518_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_S2C_CloseUi_28520_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_S2C_CloseUi_28520_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_S2CR_CrossFight_28531_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_S2CR_CrossFight_28531_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_CR2S_CrossFight_28532_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_CR2S_CrossFight_28532_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_S2CR_UpdateDefArray_28533_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_S2CR_UpdateDefArray_28533_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_CR2S_UpdateDefArray_28534_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_CR2S_UpdateDefArray_28534_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_CR2S_Settle_28535_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_CR2S_Settle_28535_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_CR2S_NotifySettle_28538_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_CR2S_NotifySettle_28538_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_S2CR_ChallengeList_28539_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_S2CR_ChallengeList_28539_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_CR2S_ChallengeList_28540_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_CR2S_ChallengeList_28540_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_S2CR_Rank_28541_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_S2CR_Rank_28541_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_S2CR_FightRecord_28542_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_S2CR_FightRecord_28542_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_CR2S_PrestigeReward_28543_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_CR2S_PrestigeReward_28543_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_supremePvp_com_gzbz_protobuf_S2CR_PvpGm_28600_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_supremePvp_com_gzbz_protobuf_S2CR_PvpGm_28600_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private SupremePvpMsg() {
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
      String[] descriptorData = new String[]{"\n\u0010SupremePvp.proto\u0012\u001csupremePvp.com.gzbz.protobuf\u001a\fcommon.proto\u001a\fBattle.proto\u001a\tPvp.proto\"æ\u0001\n\bRankInfo\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0003 \u0002(\t\u0012\n\n\u0002lv\u0018\u0004 \u0002(\u0005\u0012\u0013\n\u000bcombatPower\u0018\u0005 \u0002(\u0003\u0012\r\n\u0005score\u0018\u0006 \u0002(\u0005\u0012\u000e\n\u0006headId\u0018\u0007 \u0002(\u0005\u0012\u0013\n\u000bthumbsUpNum\u0018\b \u0001(\u0005\u0012\u0010\n\bprestige\u0018\t \u0001(\u0005\u0012\u0011\n\tmonarchId\u0018\n \u0001(\u0005\u0012\u0011\n\theadFrame\u0018\u000b \u0001(\u0005\u0012\u0010\n\bserverId\u0018\f \u0001(\u0005\u0012\r\n\u0005grade\u0018\r \u0001(\u0005\"]\n\nSettleInfo\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005score\u0018\u0002 \u0002(\u0003\u0012\u0010\n\bplayerId\u0018\u0003 \u0002(\u0005\u0012\u000e\n\u0006teamId\u0018\u0004 \u0002(\u0005\u0012\u0010\n\bnewGrade\u0018\u0005 \u0001(\u0005\"\u0010\n\u000eC2S_Main_28501\"l\n\u000eS2C_Main_28502\u0012\u0010\n\bfightNum\u0018\u0001 \u0002(\u0005\u0012\u0017\n\u000fdailyFlushTimes\u0018\u0002 \u0002(\u0005\u0012\u0015\n\rdailyFightNum\u0018\u0003 \u0002(\u0005\u0012\u0018\n\u0010dailyIntegralNum\u0018\u0004 \u0002(\u0005\"J\n\u000eC2S_Rank_28503\u00128\n\brankType\u0018\u0001 \u0002(\u000e2&.supremePvp.com.gzbz.protobuf.RankType\"\u0098\u0002\n\u000eS2C_Rank_28504\u00128\n\brankType\u0018\u0001 \u0002(\u000e2&.supremePvp.com.gzbz.protobuf.RankType\u00124\n\u0004rank\u0018\u0002 \u0003(\u000b2&.supremePvp.com.gzbz.protobuf.RankInfo\u00126\n\u0006myRank\u0018\u0003 \u0001(\u000b2&.supremePvp.com.gzbz.protobuf.RankInfo\u0012\r\n\u0005grade\u0018\u0004 \u0001(\u0005\u0012>\n\u000bsettleGrade\u0018\u0005 \u0001(\u000e2).supremePvp.com.gzbz.protobuf.SettleGrade\u0012\u000f\n\u0007endTime\u0018\u0006 \u0001(\u0005\"(\n\u0017C2S_ChallengeList_28505\u0012\r\n\u0005flush\u0018\u0001 \u0002(\b\"w\n\u0017S2C_ChallengeList_28506\u0012\r\n\u0005flush\u0018\u0001 \u0002(\b\u0012\u0017\n\u000fdailyFlushTimes\u0018\u0002 \u0002(\u0005\u00124\n\u0006player\u0018\u0004 \u0003(\u000b2$.pvp.com.gzbz.protobuf.PvpPlayerInfo\"\u0017\n\u0015C2S_FightRecord_28507\"M\n\u0015S2C_FightRecord_28508\u00124\n\u0006record\u0018\u0001 \u0003(\u000b2$.pvp.com.gzbz.protobuf.PvpRecordInfo\"\\\n\u0015C2S_WarOrderBuy_28509\u00126\n\u0007buyType\u0018\u0001 \u0002(\u000e2%.supremePvp.com.gzbz.protobuf.BuyType\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\"\\\n\u0015S2C_WarOrderBuy_28510\u00126\n\u0007buyType\u0018\u0001 \u0002(\u000e2%.supremePvp.com.gzbz.protobuf.BuyType\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\"*\n\u0014S2C_WarOrderLv_28512\u0012\u0012\n\nwarOrderLv\u0018\u0001 \u0002(\u0005\"\u0014\n\u0012C2S_WarOrder_28513\"l\n\u0012S2C_WarOrder_28514\u0012\u0013\n\u000bwarOrderEnd\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nwarOrderLv\u0018\u0002 \u0002(\u0005\u0012\u0016\n\u000egotCommonMaxLv\u0018\u0003 \u0002(\u0005\u0012\u0015\n\rgotSuperMaxLv\u0018\u0004 \u0002(\u0005\"\u001d\n\u001bC2S_WarOrderRewardAll_28515\"L\n\u001bS2C_WarOrderRewardAll_28516\u0012\u0016\n\u000egotCommonMaxLv\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rgotSuperMaxLv\u0018\u0002 \u0002(\u0005\"\\\n\u0016S2C_SeasonSettle_28518\u0012\u0010\n\bpreGrade\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bpreScore\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007preRank\u0018\u0003 \u0002(\u0005\u0012\r\n\u0005grade\u0018\u0004 \u0002(\u0005\"P\n\u0011S2C_CloseUi_28520\u0012;\n\u0006result\u0018\u0001 \u0002(\u000e2+.supremePvp.com.gzbz.protobuf.CloseUiResult\"K\n\u0015S2CR_CrossFight_28531\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006isSkip\u0018\u0002 \u0002(\b\u0012\u0010\n\batkArray\u0018\u0003 \u0002(\f\"\u0096\u0001\n\u0015CR2S_CrossFight_28532\u0012B\n\tbattleMsg\u0018\u0001 \u0002(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\u0013\n\u000bbeforeScore\u0018\u0003 \u0002(\u0005\u0012\u0012\n\nafterScore\u0018\u0004 \u0002(\u0005\"?\n\u0019S2CR_UpdateDefArray_28533\u0012\u0010\n\bdefArray\u0018\u0001 \u0002(\f\u0012\u0010\n\bdefPower\u0018\u0002 \u0002(\u0003\"-\n\u0019CR2S_UpdateDefArray_28534\u0012\u0010\n\bplayerId\u0018\u0001 \u0003(\u0005\"n\n\u0011CR2S_Settle_28535\u0012\r\n\u0005grade\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0002 \u0002(\u0005\u0012<\n\nsettleInfo\u0018\u0003 \u0003(\u000b2(.supremePvp.com.gzbz.protobuf.SettleInfo\"/\n\u0017CR2S_NotifySettle_28538\u0012\u0014\n\fseasonChange\u0018\u0001 \u0002(\b\")\n\u0018S2CR_ChallengeList_28539\u0012\r\n\u0005flush\u0018\u0001 \u0002(\b\"_\n\u0018CR2S_ChallengeList_28540\u0012\r\n\u0005flush\u0018\u0001 \u0002(\b\u00124\n\u0006player\u0018\u0002 \u0003(\u000b2$.pvp.com.gzbz.protobuf.PvpPlayerInfo\"K\n\u000fS2CR_Rank_28541\u00128\n\brankType\u0018\u0001 \u0002(\u000e2&.supremePvp.com.gzbz.protobuf.RankType\"\u0018\n\u0016S2CR_FightRecord_28542\"<\n\u0019CR2S_PrestigeReward_28543\u0012\r\n\u0005grade\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0003(\u0005\"\"\n\u0010S2CR_PvpGm_28600\u0012\u000e\n\u0006string\u0018\u0001 \u0002(\t*8\n\bRankType\u0012\r\n\tTYPE_MAIN\u0010\u0000\u0012\u000e\n\nTYPE_CROSS\u0010\u0001\u0012\r\n\tTYPE_HIGH\u0010\u0002*F\n\u000bSettleGrade\u0012\u0019\n\fGRADE_REDUCE\u0010ÿÿÿÿÿÿÿÿÿ\u0001\u0012\u000e\n\nGRADE_KEEP\u0010\u0000\u0012\f\n\bGRADE_UP\u0010\u0001*\"\n\u0007BuyType\u0012\f\n\bINTEGRAL\u0010\u0001\u0012\t\n\u0005LEVEL\u0010\u0002*1\n\rCloseUiResult\u0012\u0014\n\u0010CROSS_DISCONNECT\u0010\u0001\u0012\n\n\u0006SETTLE\u0010\u0002B$\n\u0011com.gzbz.protobufB\rSupremePvpMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), BattleMsg.getDescriptor(), PvpMsg.getDescriptor()});
      internal_static_supremePvp_com_gzbz_protobuf_RankInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_supremePvp_com_gzbz_protobuf_RankInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_RankInfo_descriptor, new String[]{"Rank", "PlayerId", "Name", "Lv", "CombatPower", "Score", "HeadId", "ThumbsUpNum", "Prestige", "MonarchId", "HeadFrame", "ServerId", "Grade"});
      internal_static_supremePvp_com_gzbz_protobuf_SettleInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_supremePvp_com_gzbz_protobuf_SettleInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_SettleInfo_descriptor, new String[]{"Rank", "Score", "PlayerId", "TeamId", "NewGrade"});
      internal_static_supremePvp_com_gzbz_protobuf_C2S_Main_28501_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_supremePvp_com_gzbz_protobuf_C2S_Main_28501_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_C2S_Main_28501_descriptor, new String[0]);
      internal_static_supremePvp_com_gzbz_protobuf_S2C_Main_28502_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_supremePvp_com_gzbz_protobuf_S2C_Main_28502_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_S2C_Main_28502_descriptor, new String[]{"FightNum", "DailyFlushTimes", "DailyFightNum", "DailyIntegralNum"});
      internal_static_supremePvp_com_gzbz_protobuf_C2S_Rank_28503_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_supremePvp_com_gzbz_protobuf_C2S_Rank_28503_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_C2S_Rank_28503_descriptor, new String[]{"RankType"});
      internal_static_supremePvp_com_gzbz_protobuf_S2C_Rank_28504_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_supremePvp_com_gzbz_protobuf_S2C_Rank_28504_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_S2C_Rank_28504_descriptor, new String[]{"RankType", "Rank", "MyRank", "Grade", "SettleGrade", "EndTime"});
      internal_static_supremePvp_com_gzbz_protobuf_C2S_ChallengeList_28505_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_supremePvp_com_gzbz_protobuf_C2S_ChallengeList_28505_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_C2S_ChallengeList_28505_descriptor, new String[]{"Flush"});
      internal_static_supremePvp_com_gzbz_protobuf_S2C_ChallengeList_28506_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_supremePvp_com_gzbz_protobuf_S2C_ChallengeList_28506_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_S2C_ChallengeList_28506_descriptor, new String[]{"Flush", "DailyFlushTimes", "Player"});
      internal_static_supremePvp_com_gzbz_protobuf_C2S_FightRecord_28507_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_supremePvp_com_gzbz_protobuf_C2S_FightRecord_28507_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_C2S_FightRecord_28507_descriptor, new String[0]);
      internal_static_supremePvp_com_gzbz_protobuf_S2C_FightRecord_28508_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_supremePvp_com_gzbz_protobuf_S2C_FightRecord_28508_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_S2C_FightRecord_28508_descriptor, new String[]{"Record"});
      internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrderBuy_28509_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrderBuy_28509_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrderBuy_28509_descriptor, new String[]{"BuyType", "Num"});
      internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderBuy_28510_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderBuy_28510_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderBuy_28510_descriptor, new String[]{"BuyType", "Num"});
      internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderLv_28512_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderLv_28512_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderLv_28512_descriptor, new String[]{"WarOrderLv"});
      internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrder_28513_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrder_28513_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrder_28513_descriptor, new String[0]);
      internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrder_28514_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrder_28514_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrder_28514_descriptor, new String[]{"WarOrderEnd", "WarOrderLv", "GotCommonMaxLv", "GotSuperMaxLv"});
      internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrderRewardAll_28515_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrderRewardAll_28515_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrderRewardAll_28515_descriptor, new String[0]);
      internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderRewardAll_28516_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderRewardAll_28516_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderRewardAll_28516_descriptor, new String[]{"GotCommonMaxLv", "GotSuperMaxLv"});
      internal_static_supremePvp_com_gzbz_protobuf_S2C_SeasonSettle_28518_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_supremePvp_com_gzbz_protobuf_S2C_SeasonSettle_28518_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_S2C_SeasonSettle_28518_descriptor, new String[]{"PreGrade", "PreScore", "PreRank", "Grade"});
      internal_static_supremePvp_com_gzbz_protobuf_S2C_CloseUi_28520_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_supremePvp_com_gzbz_protobuf_S2C_CloseUi_28520_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_S2C_CloseUi_28520_descriptor, new String[]{"Result"});
      internal_static_supremePvp_com_gzbz_protobuf_S2CR_CrossFight_28531_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_supremePvp_com_gzbz_protobuf_S2CR_CrossFight_28531_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_S2CR_CrossFight_28531_descriptor, new String[]{"PlayerId", "IsSkip", "AtkArray"});
      internal_static_supremePvp_com_gzbz_protobuf_CR2S_CrossFight_28532_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_supremePvp_com_gzbz_protobuf_CR2S_CrossFight_28532_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_CR2S_CrossFight_28532_descriptor, new String[]{"BattleMsg", "PlayerId", "BeforeScore", "AfterScore"});
      internal_static_supremePvp_com_gzbz_protobuf_S2CR_UpdateDefArray_28533_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_supremePvp_com_gzbz_protobuf_S2CR_UpdateDefArray_28533_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_S2CR_UpdateDefArray_28533_descriptor, new String[]{"DefArray", "DefPower"});
      internal_static_supremePvp_com_gzbz_protobuf_CR2S_UpdateDefArray_28534_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_supremePvp_com_gzbz_protobuf_CR2S_UpdateDefArray_28534_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_CR2S_UpdateDefArray_28534_descriptor, new String[]{"PlayerId"});
      internal_static_supremePvp_com_gzbz_protobuf_CR2S_Settle_28535_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_supremePvp_com_gzbz_protobuf_CR2S_Settle_28535_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_CR2S_Settle_28535_descriptor, new String[]{"Grade", "Type", "SettleInfo"});
      internal_static_supremePvp_com_gzbz_protobuf_CR2S_NotifySettle_28538_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_supremePvp_com_gzbz_protobuf_CR2S_NotifySettle_28538_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_CR2S_NotifySettle_28538_descriptor, new String[]{"SeasonChange"});
      internal_static_supremePvp_com_gzbz_protobuf_S2CR_ChallengeList_28539_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_supremePvp_com_gzbz_protobuf_S2CR_ChallengeList_28539_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_S2CR_ChallengeList_28539_descriptor, new String[]{"Flush"});
      internal_static_supremePvp_com_gzbz_protobuf_CR2S_ChallengeList_28540_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_supremePvp_com_gzbz_protobuf_CR2S_ChallengeList_28540_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_CR2S_ChallengeList_28540_descriptor, new String[]{"Flush", "Player"});
      internal_static_supremePvp_com_gzbz_protobuf_S2CR_Rank_28541_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_supremePvp_com_gzbz_protobuf_S2CR_Rank_28541_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_S2CR_Rank_28541_descriptor, new String[]{"RankType"});
      internal_static_supremePvp_com_gzbz_protobuf_S2CR_FightRecord_28542_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_supremePvp_com_gzbz_protobuf_S2CR_FightRecord_28542_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_S2CR_FightRecord_28542_descriptor, new String[0]);
      internal_static_supremePvp_com_gzbz_protobuf_CR2S_PrestigeReward_28543_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_supremePvp_com_gzbz_protobuf_CR2S_PrestigeReward_28543_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_CR2S_PrestigeReward_28543_descriptor, new String[]{"Grade", "PlayerId"});
      internal_static_supremePvp_com_gzbz_protobuf_S2CR_PvpGm_28600_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_supremePvp_com_gzbz_protobuf_S2CR_PvpGm_28600_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_supremePvp_com_gzbz_protobuf_S2CR_PvpGm_28600_descriptor, new String[]{"String"});
      CommonMsg.getDescriptor();
      BattleMsg.getDescriptor();
      PvpMsg.getDescriptor();
   }

   public static enum RankType implements ProtocolMessageEnum {
      TYPE_MAIN(0),
      TYPE_CROSS(1),
      TYPE_HIGH(2);

      public static final int TYPE_MAIN_VALUE = 0;
      public static final int TYPE_CROSS_VALUE = 1;
      public static final int TYPE_HIGH_VALUE = 2;
      private static final Internal.EnumLiteMap<RankType> internalValueMap = new Internal.EnumLiteMap<RankType>() {
         public RankType findValueByNumber(int number) {
            return SupremePvpMsg.RankType.forNumber(number);
         }
      };
      private static final RankType[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static RankType valueOf(int value) {
         return forNumber(value);
      }

      public static RankType forNumber(int value) {
         switch (value) {
            case 0:
               return TYPE_MAIN;
            case 1:
               return TYPE_CROSS;
            case 2:
               return TYPE_HIGH;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<RankType> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)SupremePvpMsg.getDescriptor().getEnumTypes().get(0);
      }

      public static RankType valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private RankType(int value) {
         this.value = value;
      }
   }

   public static enum SettleGrade implements ProtocolMessageEnum {
      GRADE_REDUCE(-1),
      GRADE_KEEP(0),
      GRADE_UP(1);

      public static final int GRADE_REDUCE_VALUE = -1;
      public static final int GRADE_KEEP_VALUE = 0;
      public static final int GRADE_UP_VALUE = 1;
      private static final Internal.EnumLiteMap<SettleGrade> internalValueMap = new Internal.EnumLiteMap<SettleGrade>() {
         public SettleGrade findValueByNumber(int number) {
            return SupremePvpMsg.SettleGrade.forNumber(number);
         }
      };
      private static final SettleGrade[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static SettleGrade valueOf(int value) {
         return forNumber(value);
      }

      public static SettleGrade forNumber(int value) {
         switch (value) {
            case -1:
               return GRADE_REDUCE;
            case 0:
               return GRADE_KEEP;
            case 1:
               return GRADE_UP;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<SettleGrade> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)SupremePvpMsg.getDescriptor().getEnumTypes().get(1);
      }

      public static SettleGrade valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private SettleGrade(int value) {
         this.value = value;
      }
   }

   public static enum BuyType implements ProtocolMessageEnum {
      INTEGRAL(1),
      LEVEL(2);

      public static final int INTEGRAL_VALUE = 1;
      public static final int LEVEL_VALUE = 2;
      private static final Internal.EnumLiteMap<BuyType> internalValueMap = new Internal.EnumLiteMap<BuyType>() {
         public BuyType findValueByNumber(int number) {
            return SupremePvpMsg.BuyType.forNumber(number);
         }
      };
      private static final BuyType[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static BuyType valueOf(int value) {
         return forNumber(value);
      }

      public static BuyType forNumber(int value) {
         switch (value) {
            case 1:
               return INTEGRAL;
            case 2:
               return LEVEL;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<BuyType> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)SupremePvpMsg.getDescriptor().getEnumTypes().get(2);
      }

      public static BuyType valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private BuyType(int value) {
         this.value = value;
      }
   }

   public static enum CloseUiResult implements ProtocolMessageEnum {
      CROSS_DISCONNECT(1),
      SETTLE(2);

      public static final int CROSS_DISCONNECT_VALUE = 1;
      public static final int SETTLE_VALUE = 2;
      private static final Internal.EnumLiteMap<CloseUiResult> internalValueMap = new Internal.EnumLiteMap<CloseUiResult>() {
         public CloseUiResult findValueByNumber(int number) {
            return SupremePvpMsg.CloseUiResult.forNumber(number);
         }
      };
      private static final CloseUiResult[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static CloseUiResult valueOf(int value) {
         return forNumber(value);
      }

      public static CloseUiResult forNumber(int value) {
         switch (value) {
            case 1:
               return CROSS_DISCONNECT;
            case 2:
               return SETTLE;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<CloseUiResult> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)SupremePvpMsg.getDescriptor().getEnumTypes().get(3);
      }

      public static CloseUiResult valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private CloseUiResult(int value) {
         this.value = value;
      }
   }

   public static final class RankInfo extends GeneratedMessageV3 implements RankInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int NAME_FIELD_NUMBER = 3;
      private volatile Object name_;
      public static final int LV_FIELD_NUMBER = 4;
      private int lv_;
      public static final int COMBATPOWER_FIELD_NUMBER = 5;
      private long combatPower_;
      public static final int SCORE_FIELD_NUMBER = 6;
      private int score_;
      public static final int HEADID_FIELD_NUMBER = 7;
      private int headId_;
      public static final int THUMBSUPNUM_FIELD_NUMBER = 8;
      private int thumbsUpNum_;
      public static final int PRESTIGE_FIELD_NUMBER = 9;
      private int prestige_;
      public static final int MONARCHID_FIELD_NUMBER = 10;
      private int monarchId_;
      public static final int HEADFRAME_FIELD_NUMBER = 11;
      private int headFrame_;
      public static final int SERVERID_FIELD_NUMBER = 12;
      private int serverId_;
      public static final int GRADE_FIELD_NUMBER = 13;
      private int grade_;
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
                     case 26:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.name_ = bs;
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.lv_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.combatPower_ = input.readInt64();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.score_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.headId_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.thumbsUpNum_ = input.readInt32();
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
                        this.headFrame_ = input.readInt32();
                        break;
                     case 96:
                        this.bitField0_ |= 2048;
                        this.serverId_ = input.readInt32();
                        break;
                     case 104:
                        this.bitField0_ |= 4096;
                        this.grade_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_RankInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_RankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RankInfo.class, Builder.class);
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

      public boolean hasLv() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getLv() {
         return this.lv_;
      }

      public boolean hasCombatPower() {
         return (this.bitField0_ & 16) != 0;
      }

      public long getCombatPower() {
         return this.combatPower_;
      }

      public boolean hasScore() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getScore() {
         return this.score_;
      }

      public boolean hasHeadId() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getHeadId() {
         return this.headId_;
      }

      public boolean hasThumbsUpNum() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getThumbsUpNum() {
         return this.thumbsUpNum_;
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

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 1024) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 2048) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasGrade() {
         return (this.bitField0_ & 4096) != 0;
      }

      public int getGrade() {
         return this.grade_;
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
         } else if (!this.hasName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCombatPower()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasScore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeadId()) {
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
            GeneratedMessageV3.writeString(output, 3, this.name_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.lv_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt64(5, this.combatPower_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.score_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.headId_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.thumbsUpNum_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.prestige_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(10, this.monarchId_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            output.writeInt32(11, this.headFrame_);
         }

         if ((this.bitField0_ & 2048) != 0) {
            output.writeInt32(12, this.serverId_);
         }

         if ((this.bitField0_ & 4096) != 0) {
            output.writeInt32(13, this.grade_);
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
               size += GeneratedMessageV3.computeStringSize(3, this.name_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.lv_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt64Size(5, this.combatPower_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.score_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.headId_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.thumbsUpNum_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.prestige_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.monarchId_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.headFrame_);
            }

            if ((this.bitField0_ & 2048) != 0) {
               size += CodedOutputStream.computeInt32Size(12, this.serverId_);
            }

            if ((this.bitField0_ & 4096) != 0) {
               size += CodedOutputStream.computeInt32Size(13, this.grade_);
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
            } else if (this.hasName() != other.hasName()) {
               return false;
            } else if (this.hasName() && !this.getName().equals(other.getName())) {
               return false;
            } else if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
               return false;
            } else if (this.hasCombatPower() != other.hasCombatPower()) {
               return false;
            } else if (this.hasCombatPower() && this.getCombatPower() != other.getCombatPower()) {
               return false;
            } else if (this.hasScore() != other.hasScore()) {
               return false;
            } else if (this.hasScore() && this.getScore() != other.getScore()) {
               return false;
            } else if (this.hasHeadId() != other.hasHeadId()) {
               return false;
            } else if (this.hasHeadId() && this.getHeadId() != other.getHeadId()) {
               return false;
            } else if (this.hasThumbsUpNum() != other.hasThumbsUpNum()) {
               return false;
            } else if (this.hasThumbsUpNum() && this.getThumbsUpNum() != other.getThumbsUpNum()) {
               return false;
            } else if (this.hasPrestige() != other.hasPrestige()) {
               return false;
            } else if (this.hasPrestige() && this.getPrestige() != other.getPrestige()) {
               return false;
            } else if (this.hasMonarchId() != other.hasMonarchId()) {
               return false;
            } else if (this.hasMonarchId() && this.getMonarchId() != other.getMonarchId()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasGrade() != other.hasGrade()) {
               return false;
            } else if (this.hasGrade() && this.getGrade() != other.getGrade()) {
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

            if (this.hasName()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getName().hashCode();
            }

            if (this.hasLv()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getLv();
            }

            if (this.hasCombatPower()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashLong(this.getCombatPower());
            }

            if (this.hasScore()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getScore();
            }

            if (this.hasHeadId()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getHeadId();
            }

            if (this.hasThumbsUpNum()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getThumbsUpNum();
            }

            if (this.hasPrestige()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getPrestige();
            }

            if (this.hasMonarchId()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getMonarchId();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasGrade()) {
               hash = 37 * hash + 13;
               hash = 53 * hash + this.getGrade();
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
         private Object name_;
         private int lv_;
         private long combatPower_;
         private int score_;
         private int headId_;
         private int thumbsUpNum_;
         private int prestige_;
         private int monarchId_;
         private int headFrame_;
         private int serverId_;
         private int grade_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_RankInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_RankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RankInfo.class, Builder.class);
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
            if (SupremePvpMsg.RankInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.name_ = "";
            this.bitField0_ &= -5;
            this.lv_ = 0;
            this.bitField0_ &= -9;
            this.combatPower_ = 0L;
            this.bitField0_ &= -17;
            this.score_ = 0;
            this.bitField0_ &= -33;
            this.headId_ = 0;
            this.bitField0_ &= -65;
            this.thumbsUpNum_ = 0;
            this.bitField0_ &= -129;
            this.prestige_ = 0;
            this.bitField0_ &= -257;
            this.monarchId_ = 0;
            this.bitField0_ &= -513;
            this.headFrame_ = 0;
            this.bitField0_ &= -1025;
            this.serverId_ = 0;
            this.bitField0_ &= -2049;
            this.grade_ = 0;
            this.bitField0_ &= -4097;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_RankInfo_descriptor;
         }

         public RankInfo getDefaultInstanceForType() {
            return SupremePvpMsg.RankInfo.getDefaultInstance();
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
               to_bitField0_ |= 4;
            }

            result.name_ = this.name_;
            if ((from_bitField0_ & 8) != 0) {
               result.lv_ = this.lv_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.combatPower_ = this.combatPower_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.score_ = this.score_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.headId_ = this.headId_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.thumbsUpNum_ = this.thumbsUpNum_;
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
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 1024;
            }

            if ((from_bitField0_ & 2048) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 2048;
            }

            if ((from_bitField0_ & 4096) != 0) {
               result.grade_ = this.grade_;
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
            if (other instanceof RankInfo) {
               return this.mergeFrom((RankInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RankInfo other) {
            if (other == SupremePvpMsg.RankInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasName()) {
                  this.bitField0_ |= 4;
                  this.name_ = other.name_;
                  this.onChanged();
               }

               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               if (other.hasCombatPower()) {
                  this.setCombatPower(other.getCombatPower());
               }

               if (other.hasScore()) {
                  this.setScore(other.getScore());
               }

               if (other.hasHeadId()) {
                  this.setHeadId(other.getHeadId());
               }

               if (other.hasThumbsUpNum()) {
                  this.setThumbsUpNum(other.getThumbsUpNum());
               }

               if (other.hasPrestige()) {
                  this.setPrestige(other.getPrestige());
               }

               if (other.hasMonarchId()) {
                  this.setMonarchId(other.getMonarchId());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasGrade()) {
                  this.setGrade(other.getGrade());
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
            } else if (!this.hasName()) {
               return false;
            } else if (!this.hasLv()) {
               return false;
            } else if (!this.hasCombatPower()) {
               return false;
            } else if (!this.hasScore()) {
               return false;
            } else {
               return this.hasHeadId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RankInfo parsedMessage = null;

            try {
               parsedMessage = (RankInfo)SupremePvpMsg.RankInfo.PARSER.parsePartialFrom(input, extensionRegistry);
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
            this.name_ = SupremePvpMsg.RankInfo.getDefaultInstance().getName();
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

         public boolean hasLv() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getLv() {
            return this.lv_;
         }

         public Builder setLv(int value) {
            this.bitField0_ |= 8;
            this.lv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLv() {
            this.bitField0_ &= -9;
            this.lv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCombatPower() {
            return (this.bitField0_ & 16) != 0;
         }

         public long getCombatPower() {
            return this.combatPower_;
         }

         public Builder setCombatPower(long value) {
            this.bitField0_ |= 16;
            this.combatPower_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCombatPower() {
            this.bitField0_ &= -17;
            this.combatPower_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasScore() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getScore() {
            return this.score_;
         }

         public Builder setScore(int value) {
            this.bitField0_ |= 32;
            this.score_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearScore() {
            this.bitField0_ &= -33;
            this.score_ = 0;
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

         public boolean hasThumbsUpNum() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getThumbsUpNum() {
            return this.thumbsUpNum_;
         }

         public Builder setThumbsUpNum(int value) {
            this.bitField0_ |= 128;
            this.thumbsUpNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearThumbsUpNum() {
            this.bitField0_ &= -129;
            this.thumbsUpNum_ = 0;
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

         public boolean hasHeadFrame() {
            return (this.bitField0_ & 1024) != 0;
         }

         public int getHeadFrame() {
            return this.headFrame_;
         }

         public Builder setHeadFrame(int value) {
            this.bitField0_ |= 1024;
            this.headFrame_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadFrame() {
            this.bitField0_ &= -1025;
            this.headFrame_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 2048) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 2048;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -2049;
            this.serverId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGrade() {
            return (this.bitField0_ & 4096) != 0;
         }

         public int getGrade() {
            return this.grade_;
         }

         public Builder setGrade(int value) {
            this.bitField0_ |= 4096;
            this.grade_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGrade() {
            this.bitField0_ &= -4097;
            this.grade_ = 0;
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

   public static final class SettleInfo extends GeneratedMessageV3 implements SettleInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int SCORE_FIELD_NUMBER = 2;
      private long score_;
      public static final int PLAYERID_FIELD_NUMBER = 3;
      private int playerId_;
      public static final int TEAMID_FIELD_NUMBER = 4;
      private int teamId_;
      public static final int NEWGRADE_FIELD_NUMBER = 5;
      private int newGrade_;
      private byte memoizedIsInitialized;
      private static final SettleInfo DEFAULT_INSTANCE = new SettleInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<SettleInfo> PARSER = new AbstractParser<SettleInfo>() {
         public SettleInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new SettleInfo(input, extensionRegistry);
         }
      };

      private SettleInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private SettleInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new SettleInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private SettleInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.score_ = input.readInt64();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.playerId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.teamId_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.newGrade_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_SettleInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_SettleInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SettleInfo.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasScore() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getScore() {
         return this.score_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasTeamId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getTeamId() {
         return this.teamId_;
      }

      public boolean hasNewGrade() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getNewGrade() {
         return this.newGrade_;
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
         } else if (!this.hasScore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTeamId()) {
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
            output.writeInt64(2, this.score_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.playerId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.teamId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.newGrade_);
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
               size += CodedOutputStream.computeInt64Size(2, this.score_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.playerId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.teamId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.newGrade_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof SettleInfo)) {
            return super.equals(obj);
         } else {
            SettleInfo other = (SettleInfo)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasScore() != other.hasScore()) {
               return false;
            } else if (this.hasScore() && this.getScore() != other.getScore()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasTeamId() != other.hasTeamId()) {
               return false;
            } else if (this.hasTeamId() && this.getTeamId() != other.getTeamId()) {
               return false;
            } else if (this.hasNewGrade() != other.hasNewGrade()) {
               return false;
            } else if (this.hasNewGrade() && this.getNewGrade() != other.getNewGrade()) {
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

            if (this.hasScore()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getScore());
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasTeamId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTeamId();
            }

            if (this.hasNewGrade()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getNewGrade();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static SettleInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (SettleInfo)PARSER.parseFrom(data);
      }

      public static SettleInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SettleInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SettleInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (SettleInfo)PARSER.parseFrom(data);
      }

      public static SettleInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SettleInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SettleInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (SettleInfo)PARSER.parseFrom(data);
      }

      public static SettleInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SettleInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SettleInfo parseFrom(InputStream input) throws IOException {
         return (SettleInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SettleInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SettleInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static SettleInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (SettleInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static SettleInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SettleInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static SettleInfo parseFrom(CodedInputStream input) throws IOException {
         return (SettleInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SettleInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SettleInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(SettleInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static SettleInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<SettleInfo> parser() {
         return PARSER;
      }

      public Parser<SettleInfo> getParserForType() {
         return PARSER;
      }

      public SettleInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SettleInfoOrBuilder {
         private int bitField0_;
         private int rank_;
         private long score_;
         private int playerId_;
         private int teamId_;
         private int newGrade_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_SettleInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_SettleInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SettleInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.SettleInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.score_ = 0L;
            this.bitField0_ &= -3;
            this.playerId_ = 0;
            this.bitField0_ &= -5;
            this.teamId_ = 0;
            this.bitField0_ &= -9;
            this.newGrade_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_SettleInfo_descriptor;
         }

         public SettleInfo getDefaultInstanceForType() {
            return SupremePvpMsg.SettleInfo.getDefaultInstance();
         }

         public SettleInfo build() {
            SettleInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public SettleInfo buildPartial() {
            SettleInfo result = new SettleInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.score_ = this.score_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.teamId_ = this.teamId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.newGrade_ = this.newGrade_;
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
            if (other instanceof SettleInfo) {
               return this.mergeFrom((SettleInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(SettleInfo other) {
            if (other == SupremePvpMsg.SettleInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasScore()) {
                  this.setScore(other.getScore());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasTeamId()) {
                  this.setTeamId(other.getTeamId());
               }

               if (other.hasNewGrade()) {
                  this.setNewGrade(other.getNewGrade());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRank()) {
               return false;
            } else if (!this.hasScore()) {
               return false;
            } else if (!this.hasPlayerId()) {
               return false;
            } else {
               return this.hasTeamId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            SettleInfo parsedMessage = null;

            try {
               parsedMessage = (SettleInfo)SupremePvpMsg.SettleInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (SettleInfo)e.getUnfinishedMessage();
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

         public boolean hasScore() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getScore() {
            return this.score_;
         }

         public Builder setScore(long value) {
            this.bitField0_ |= 2;
            this.score_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearScore() {
            this.bitField0_ &= -3;
            this.score_ = 0L;
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

         public boolean hasTeamId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getTeamId() {
            return this.teamId_;
         }

         public Builder setTeamId(int value) {
            this.bitField0_ |= 8;
            this.teamId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTeamId() {
            this.bitField0_ &= -9;
            this.teamId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasNewGrade() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getNewGrade() {
            return this.newGrade_;
         }

         public Builder setNewGrade(int value) {
            this.bitField0_ |= 16;
            this.newGrade_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNewGrade() {
            this.bitField0_ &= -17;
            this.newGrade_ = 0;
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

   public static final class C2S_Main_28501 extends GeneratedMessageV3 implements C2S_Main_28501OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Main_28501 DEFAULT_INSTANCE = new C2S_Main_28501();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Main_28501> PARSER = new AbstractParser<C2S_Main_28501>() {
         public C2S_Main_28501 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Main_28501(input, extensionRegistry);
         }
      };

      private C2S_Main_28501(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Main_28501() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Main_28501();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Main_28501(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_Main_28501_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_Main_28501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Main_28501.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Main_28501)) {
            return super.equals(obj);
         } else {
            C2S_Main_28501 other = (C2S_Main_28501)obj;
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

      public static C2S_Main_28501 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Main_28501)PARSER.parseFrom(data);
      }

      public static C2S_Main_28501 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_28501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_28501 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Main_28501)PARSER.parseFrom(data);
      }

      public static C2S_Main_28501 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_28501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_28501 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Main_28501)PARSER.parseFrom(data);
      }

      public static C2S_Main_28501 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_28501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_28501 parseFrom(InputStream input) throws IOException {
         return (C2S_Main_28501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Main_28501 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_28501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Main_28501 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Main_28501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Main_28501 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_28501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Main_28501 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Main_28501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Main_28501 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_28501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Main_28501 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Main_28501 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Main_28501> parser() {
         return PARSER;
      }

      public Parser<C2S_Main_28501> getParserForType() {
         return PARSER;
      }

      public C2S_Main_28501 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Main_28501OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_Main_28501_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_Main_28501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Main_28501.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.C2S_Main_28501.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_Main_28501_descriptor;
         }

         public C2S_Main_28501 getDefaultInstanceForType() {
            return SupremePvpMsg.C2S_Main_28501.getDefaultInstance();
         }

         public C2S_Main_28501 build() {
            C2S_Main_28501 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Main_28501 buildPartial() {
            C2S_Main_28501 result = new C2S_Main_28501(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_Main_28501) {
               return this.mergeFrom((C2S_Main_28501)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Main_28501 other) {
            if (other == SupremePvpMsg.C2S_Main_28501.getDefaultInstance()) {
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
            C2S_Main_28501 parsedMessage = null;

            try {
               parsedMessage = (C2S_Main_28501)SupremePvpMsg.C2S_Main_28501.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Main_28501)e.getUnfinishedMessage();
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

   public static final class S2C_Main_28502 extends GeneratedMessageV3 implements S2C_Main_28502OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FIGHTNUM_FIELD_NUMBER = 1;
      private int fightNum_;
      public static final int DAILYFLUSHTIMES_FIELD_NUMBER = 2;
      private int dailyFlushTimes_;
      public static final int DAILYFIGHTNUM_FIELD_NUMBER = 3;
      private int dailyFightNum_;
      public static final int DAILYINTEGRALNUM_FIELD_NUMBER = 4;
      private int dailyIntegralNum_;
      private byte memoizedIsInitialized;
      private static final S2C_Main_28502 DEFAULT_INSTANCE = new S2C_Main_28502();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Main_28502> PARSER = new AbstractParser<S2C_Main_28502>() {
         public S2C_Main_28502 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Main_28502(input, extensionRegistry);
         }
      };

      private S2C_Main_28502(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Main_28502() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Main_28502();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Main_28502(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.fightNum_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.dailyFlushTimes_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.dailyFightNum_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.dailyIntegralNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_Main_28502_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_Main_28502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Main_28502.class, Builder.class);
      }

      public boolean hasFightNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFightNum() {
         return this.fightNum_;
      }

      public boolean hasDailyFlushTimes() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDailyFlushTimes() {
         return this.dailyFlushTimes_;
      }

      public boolean hasDailyFightNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getDailyFightNum() {
         return this.dailyFightNum_;
      }

      public boolean hasDailyIntegralNum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getDailyIntegralNum() {
         return this.dailyIntegralNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFightNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDailyFlushTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDailyFightNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDailyIntegralNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.fightNum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.dailyFlushTimes_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.dailyFightNum_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.dailyIntegralNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.fightNum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.dailyFlushTimes_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.dailyFightNum_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.dailyIntegralNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Main_28502)) {
            return super.equals(obj);
         } else {
            S2C_Main_28502 other = (S2C_Main_28502)obj;
            if (this.hasFightNum() != other.hasFightNum()) {
               return false;
            } else if (this.hasFightNum() && this.getFightNum() != other.getFightNum()) {
               return false;
            } else if (this.hasDailyFlushTimes() != other.hasDailyFlushTimes()) {
               return false;
            } else if (this.hasDailyFlushTimes() && this.getDailyFlushTimes() != other.getDailyFlushTimes()) {
               return false;
            } else if (this.hasDailyFightNum() != other.hasDailyFightNum()) {
               return false;
            } else if (this.hasDailyFightNum() && this.getDailyFightNum() != other.getDailyFightNum()) {
               return false;
            } else if (this.hasDailyIntegralNum() != other.hasDailyIntegralNum()) {
               return false;
            } else if (this.hasDailyIntegralNum() && this.getDailyIntegralNum() != other.getDailyIntegralNum()) {
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
            if (this.hasFightNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFightNum();
            }

            if (this.hasDailyFlushTimes()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDailyFlushTimes();
            }

            if (this.hasDailyFightNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getDailyFightNum();
            }

            if (this.hasDailyIntegralNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getDailyIntegralNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Main_28502 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Main_28502)PARSER.parseFrom(data);
      }

      public static S2C_Main_28502 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_28502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_28502 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Main_28502)PARSER.parseFrom(data);
      }

      public static S2C_Main_28502 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_28502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_28502 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Main_28502)PARSER.parseFrom(data);
      }

      public static S2C_Main_28502 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_28502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_28502 parseFrom(InputStream input) throws IOException {
         return (S2C_Main_28502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Main_28502 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_28502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Main_28502 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Main_28502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Main_28502 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_28502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Main_28502 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Main_28502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Main_28502 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_28502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Main_28502 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Main_28502 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Main_28502> parser() {
         return PARSER;
      }

      public Parser<S2C_Main_28502> getParserForType() {
         return PARSER;
      }

      public S2C_Main_28502 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Main_28502OrBuilder {
         private int bitField0_;
         private int fightNum_;
         private int dailyFlushTimes_;
         private int dailyFightNum_;
         private int dailyIntegralNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_Main_28502_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_Main_28502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Main_28502.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.S2C_Main_28502.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.fightNum_ = 0;
            this.bitField0_ &= -2;
            this.dailyFlushTimes_ = 0;
            this.bitField0_ &= -3;
            this.dailyFightNum_ = 0;
            this.bitField0_ &= -5;
            this.dailyIntegralNum_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_Main_28502_descriptor;
         }

         public S2C_Main_28502 getDefaultInstanceForType() {
            return SupremePvpMsg.S2C_Main_28502.getDefaultInstance();
         }

         public S2C_Main_28502 build() {
            S2C_Main_28502 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Main_28502 buildPartial() {
            S2C_Main_28502 result = new S2C_Main_28502(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.fightNum_ = this.fightNum_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.dailyFlushTimes_ = this.dailyFlushTimes_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.dailyFightNum_ = this.dailyFightNum_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.dailyIntegralNum_ = this.dailyIntegralNum_;
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
            if (other instanceof S2C_Main_28502) {
               return this.mergeFrom((S2C_Main_28502)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Main_28502 other) {
            if (other == SupremePvpMsg.S2C_Main_28502.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFightNum()) {
                  this.setFightNum(other.getFightNum());
               }

               if (other.hasDailyFlushTimes()) {
                  this.setDailyFlushTimes(other.getDailyFlushTimes());
               }

               if (other.hasDailyFightNum()) {
                  this.setDailyFightNum(other.getDailyFightNum());
               }

               if (other.hasDailyIntegralNum()) {
                  this.setDailyIntegralNum(other.getDailyIntegralNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFightNum()) {
               return false;
            } else if (!this.hasDailyFlushTimes()) {
               return false;
            } else if (!this.hasDailyFightNum()) {
               return false;
            } else {
               return this.hasDailyIntegralNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Main_28502 parsedMessage = null;

            try {
               parsedMessage = (S2C_Main_28502)SupremePvpMsg.S2C_Main_28502.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Main_28502)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFightNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFightNum() {
            return this.fightNum_;
         }

         public Builder setFightNum(int value) {
            this.bitField0_ |= 1;
            this.fightNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFightNum() {
            this.bitField0_ &= -2;
            this.fightNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDailyFlushTimes() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDailyFlushTimes() {
            return this.dailyFlushTimes_;
         }

         public Builder setDailyFlushTimes(int value) {
            this.bitField0_ |= 2;
            this.dailyFlushTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyFlushTimes() {
            this.bitField0_ &= -3;
            this.dailyFlushTimes_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDailyFightNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getDailyFightNum() {
            return this.dailyFightNum_;
         }

         public Builder setDailyFightNum(int value) {
            this.bitField0_ |= 4;
            this.dailyFightNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyFightNum() {
            this.bitField0_ &= -5;
            this.dailyFightNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDailyIntegralNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getDailyIntegralNum() {
            return this.dailyIntegralNum_;
         }

         public Builder setDailyIntegralNum(int value) {
            this.bitField0_ |= 8;
            this.dailyIntegralNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyIntegralNum() {
            this.bitField0_ &= -9;
            this.dailyIntegralNum_ = 0;
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

   public static final class C2S_Rank_28503 extends GeneratedMessageV3 implements C2S_Rank_28503OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANKTYPE_FIELD_NUMBER = 1;
      private int rankType_;
      private byte memoizedIsInitialized;
      private static final C2S_Rank_28503 DEFAULT_INSTANCE = new C2S_Rank_28503();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Rank_28503> PARSER = new AbstractParser<C2S_Rank_28503>() {
         public C2S_Rank_28503 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Rank_28503(input, extensionRegistry);
         }
      };

      private C2S_Rank_28503(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Rank_28503() {
         this.memoizedIsInitialized = -1;
         this.rankType_ = 0;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Rank_28503();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Rank_28503(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        RankType value = SupremePvpMsg.RankType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.rankType_ = rawValue;
                        }
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_Rank_28503_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_Rank_28503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Rank_28503.class, Builder.class);
      }

      public boolean hasRankType() {
         return (this.bitField0_ & 1) != 0;
      }

      public RankType getRankType() {
         RankType result = SupremePvpMsg.RankType.valueOf(this.rankType_);
         return result == null ? SupremePvpMsg.RankType.TYPE_MAIN : result;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRankType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.rankType_);
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
               size += CodedOutputStream.computeEnumSize(1, this.rankType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Rank_28503)) {
            return super.equals(obj);
         } else {
            C2S_Rank_28503 other = (C2S_Rank_28503)obj;
            if (this.hasRankType() != other.hasRankType()) {
               return false;
            } else if (this.hasRankType() && this.rankType_ != other.rankType_) {
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
            if (this.hasRankType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.rankType_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Rank_28503 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Rank_28503)PARSER.parseFrom(data);
      }

      public static C2S_Rank_28503 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Rank_28503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Rank_28503 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Rank_28503)PARSER.parseFrom(data);
      }

      public static C2S_Rank_28503 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Rank_28503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Rank_28503 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Rank_28503)PARSER.parseFrom(data);
      }

      public static C2S_Rank_28503 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Rank_28503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Rank_28503 parseFrom(InputStream input) throws IOException {
         return (C2S_Rank_28503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Rank_28503 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Rank_28503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Rank_28503 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Rank_28503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Rank_28503 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Rank_28503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Rank_28503 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Rank_28503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Rank_28503 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Rank_28503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Rank_28503 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Rank_28503 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Rank_28503> parser() {
         return PARSER;
      }

      public Parser<C2S_Rank_28503> getParserForType() {
         return PARSER;
      }

      public C2S_Rank_28503 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Rank_28503OrBuilder {
         private int bitField0_;
         private int rankType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_Rank_28503_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_Rank_28503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Rank_28503.class, Builder.class);
         }

         private Builder() {
            this.rankType_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rankType_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.C2S_Rank_28503.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rankType_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_Rank_28503_descriptor;
         }

         public C2S_Rank_28503 getDefaultInstanceForType() {
            return SupremePvpMsg.C2S_Rank_28503.getDefaultInstance();
         }

         public C2S_Rank_28503 build() {
            C2S_Rank_28503 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Rank_28503 buildPartial() {
            C2S_Rank_28503 result = new C2S_Rank_28503(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.rankType_ = this.rankType_;
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
            if (other instanceof C2S_Rank_28503) {
               return this.mergeFrom((C2S_Rank_28503)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Rank_28503 other) {
            if (other == SupremePvpMsg.C2S_Rank_28503.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRankType()) {
                  this.setRankType(other.getRankType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRankType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Rank_28503 parsedMessage = null;

            try {
               parsedMessage = (C2S_Rank_28503)SupremePvpMsg.C2S_Rank_28503.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Rank_28503)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRankType() {
            return (this.bitField0_ & 1) != 0;
         }

         public RankType getRankType() {
            RankType result = SupremePvpMsg.RankType.valueOf(this.rankType_);
            return result == null ? SupremePvpMsg.RankType.TYPE_MAIN : result;
         }

         public Builder setRankType(RankType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.rankType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearRankType() {
            this.bitField0_ &= -2;
            this.rankType_ = 0;
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

   public static final class S2C_Rank_28504 extends GeneratedMessageV3 implements S2C_Rank_28504OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANKTYPE_FIELD_NUMBER = 1;
      private int rankType_;
      public static final int RANK_FIELD_NUMBER = 2;
      private List<RankInfo> rank_;
      public static final int MYRANK_FIELD_NUMBER = 3;
      private RankInfo myRank_;
      public static final int GRADE_FIELD_NUMBER = 4;
      private int grade_;
      public static final int SETTLEGRADE_FIELD_NUMBER = 5;
      private int settleGrade_;
      public static final int ENDTIME_FIELD_NUMBER = 6;
      private int endTime_;
      private byte memoizedIsInitialized;
      private static final S2C_Rank_28504 DEFAULT_INSTANCE = new S2C_Rank_28504();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Rank_28504> PARSER = new AbstractParser<S2C_Rank_28504>() {
         public S2C_Rank_28504 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Rank_28504(input, extensionRegistry);
         }
      };

      private S2C_Rank_28504(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Rank_28504() {
         this.memoizedIsInitialized = -1;
         this.rankType_ = 0;
         this.rank_ = Collections.emptyList();
         this.settleGrade_ = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Rank_28504();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Rank_28504(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        RankType value = SupremePvpMsg.RankType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.rankType_ = rawValue;
                        }
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.rank_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.rank_.add(input.readMessage(SupremePvpMsg.RankInfo.PARSER, extensionRegistry));
                        break;
                     case 26:
                        RankInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.myRank_.toBuilder();
                        }

                        this.myRank_ = (RankInfo)input.readMessage(SupremePvpMsg.RankInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.myRank_);
                           this.myRank_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.grade_ = input.readInt32();
                        break;
                     case 40:
                        int rawValue = input.readEnum();
                        SettleGrade value = SupremePvpMsg.SettleGrade.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(5, rawValue);
                        } else {
                           this.bitField0_ |= 8;
                           this.settleGrade_ = rawValue;
                        }
                        break;
                     case 48:
                        this.bitField0_ |= 16;
                        this.endTime_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.rank_ = Collections.unmodifiableList(this.rank_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_Rank_28504_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_Rank_28504_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Rank_28504.class, Builder.class);
      }

      public boolean hasRankType() {
         return (this.bitField0_ & 1) != 0;
      }

      public RankType getRankType() {
         RankType result = SupremePvpMsg.RankType.valueOf(this.rankType_);
         return result == null ? SupremePvpMsg.RankType.TYPE_MAIN : result;
      }

      public List<RankInfo> getRankList() {
         return this.rank_;
      }

      public List<? extends RankInfoOrBuilder> getRankOrBuilderList() {
         return this.rank_;
      }

      public int getRankCount() {
         return this.rank_.size();
      }

      public RankInfo getRank(int index) {
         return (RankInfo)this.rank_.get(index);
      }

      public RankInfoOrBuilder getRankOrBuilder(int index) {
         return (RankInfoOrBuilder)this.rank_.get(index);
      }

      public boolean hasMyRank() {
         return (this.bitField0_ & 2) != 0;
      }

      public RankInfo getMyRank() {
         return this.myRank_ == null ? SupremePvpMsg.RankInfo.getDefaultInstance() : this.myRank_;
      }

      public RankInfoOrBuilder getMyRankOrBuilder() {
         return this.myRank_ == null ? SupremePvpMsg.RankInfo.getDefaultInstance() : this.myRank_;
      }

      public boolean hasGrade() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getGrade() {
         return this.grade_;
      }

      public boolean hasSettleGrade() {
         return (this.bitField0_ & 8) != 0;
      }

      public SettleGrade getSettleGrade() {
         SettleGrade result = SupremePvpMsg.SettleGrade.valueOf(this.settleGrade_);
         return result == null ? SupremePvpMsg.SettleGrade.GRADE_REDUCE : result;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRankType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRankCount(); ++i) {
               if (!this.getRank(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            if (this.hasMyRank() && !this.getMyRank().isInitialized()) {
               this.memoizedIsInitialized = 0;
               return false;
            } else {
               this.memoizedIsInitialized = 1;
               return true;
            }
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.rankType_);
         }

         for(int i = 0; i < this.rank_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.rank_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(3, this.getMyRank());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.grade_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeEnum(5, this.settleGrade_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(6, this.endTime_);
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
               size += CodedOutputStream.computeEnumSize(1, this.rankType_);
            }

            for(int i = 0; i < this.rank_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.rank_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getMyRank());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.grade_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeEnumSize(5, this.settleGrade_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.endTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Rank_28504)) {
            return super.equals(obj);
         } else {
            S2C_Rank_28504 other = (S2C_Rank_28504)obj;
            if (this.hasRankType() != other.hasRankType()) {
               return false;
            } else if (this.hasRankType() && this.rankType_ != other.rankType_) {
               return false;
            } else if (!this.getRankList().equals(other.getRankList())) {
               return false;
            } else if (this.hasMyRank() != other.hasMyRank()) {
               return false;
            } else if (this.hasMyRank() && !this.getMyRank().equals(other.getMyRank())) {
               return false;
            } else if (this.hasGrade() != other.hasGrade()) {
               return false;
            } else if (this.hasGrade() && this.getGrade() != other.getGrade()) {
               return false;
            } else if (this.hasSettleGrade() != other.hasSettleGrade()) {
               return false;
            } else if (this.hasSettleGrade() && this.settleGrade_ != other.settleGrade_) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
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
            if (this.hasRankType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.rankType_;
            }

            if (this.getRankCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRankList().hashCode();
            }

            if (this.hasMyRank()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getMyRank().hashCode();
            }

            if (this.hasGrade()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getGrade();
            }

            if (this.hasSettleGrade()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.settleGrade_;
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getEndTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Rank_28504 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Rank_28504)PARSER.parseFrom(data);
      }

      public static S2C_Rank_28504 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Rank_28504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Rank_28504 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Rank_28504)PARSER.parseFrom(data);
      }

      public static S2C_Rank_28504 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Rank_28504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Rank_28504 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Rank_28504)PARSER.parseFrom(data);
      }

      public static S2C_Rank_28504 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Rank_28504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Rank_28504 parseFrom(InputStream input) throws IOException {
         return (S2C_Rank_28504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Rank_28504 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Rank_28504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Rank_28504 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Rank_28504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Rank_28504 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Rank_28504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Rank_28504 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Rank_28504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Rank_28504 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Rank_28504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Rank_28504 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Rank_28504 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Rank_28504> parser() {
         return PARSER;
      }

      public Parser<S2C_Rank_28504> getParserForType() {
         return PARSER;
      }

      public S2C_Rank_28504 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Rank_28504OrBuilder {
         private int bitField0_;
         private int rankType_;
         private List<RankInfo> rank_;
         private RepeatedFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> rankBuilder_;
         private RankInfo myRank_;
         private SingleFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> myRankBuilder_;
         private int grade_;
         private int settleGrade_;
         private int endTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_Rank_28504_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_Rank_28504_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Rank_28504.class, Builder.class);
         }

         private Builder() {
            this.rankType_ = 0;
            this.rank_ = Collections.emptyList();
            this.settleGrade_ = -1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rankType_ = 0;
            this.rank_ = Collections.emptyList();
            this.settleGrade_ = -1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.S2C_Rank_28504.alwaysUseFieldBuilders) {
               this.getRankFieldBuilder();
               this.getMyRankFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.rankType_ = 0;
            this.bitField0_ &= -2;
            if (this.rankBuilder_ == null) {
               this.rank_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.rankBuilder_.clear();
            }

            if (this.myRankBuilder_ == null) {
               this.myRank_ = null;
            } else {
               this.myRankBuilder_.clear();
            }

            this.bitField0_ &= -5;
            this.grade_ = 0;
            this.bitField0_ &= -9;
            this.settleGrade_ = -1;
            this.bitField0_ &= -17;
            this.endTime_ = 0;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_Rank_28504_descriptor;
         }

         public S2C_Rank_28504 getDefaultInstanceForType() {
            return SupremePvpMsg.S2C_Rank_28504.getDefaultInstance();
         }

         public S2C_Rank_28504 build() {
            S2C_Rank_28504 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Rank_28504 buildPartial() {
            S2C_Rank_28504 result = new S2C_Rank_28504(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.rankType_ = this.rankType_;
            if (this.rankBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.rank_ = Collections.unmodifiableList(this.rank_);
                  this.bitField0_ &= -3;
               }

               result.rank_ = this.rank_;
            } else {
               result.rank_ = this.rankBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.myRankBuilder_ == null) {
                  result.myRank_ = this.myRank_;
               } else {
                  result.myRank_ = (RankInfo)this.myRankBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.grade_ = this.grade_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 16) != 0) {
               to_bitField0_ |= 8;
            }

            result.settleGrade_ = this.settleGrade_;
            if ((from_bitField0_ & 32) != 0) {
               result.endTime_ = this.endTime_;
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
            if (other instanceof S2C_Rank_28504) {
               return this.mergeFrom((S2C_Rank_28504)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Rank_28504 other) {
            if (other == SupremePvpMsg.S2C_Rank_28504.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRankType()) {
                  this.setRankType(other.getRankType());
               }

               if (this.rankBuilder_ == null) {
                  if (!other.rank_.isEmpty()) {
                     if (this.rank_.isEmpty()) {
                        this.rank_ = other.rank_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureRankIsMutable();
                        this.rank_.addAll(other.rank_);
                     }

                     this.onChanged();
                  }
               } else if (!other.rank_.isEmpty()) {
                  if (this.rankBuilder_.isEmpty()) {
                     this.rankBuilder_.dispose();
                     this.rankBuilder_ = null;
                     this.rank_ = other.rank_;
                     this.bitField0_ &= -3;
                     this.rankBuilder_ = SupremePvpMsg.S2C_Rank_28504.alwaysUseFieldBuilders ? this.getRankFieldBuilder() : null;
                  } else {
                     this.rankBuilder_.addAllMessages(other.rank_);
                  }
               }

               if (other.hasMyRank()) {
                  this.mergeMyRank(other.getMyRank());
               }

               if (other.hasGrade()) {
                  this.setGrade(other.getGrade());
               }

               if (other.hasSettleGrade()) {
                  this.setSettleGrade(other.getSettleGrade());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRankType()) {
               return false;
            } else {
               for(int i = 0; i < this.getRankCount(); ++i) {
                  if (!this.getRank(i).isInitialized()) {
                     return false;
                  }
               }

               if (this.hasMyRank() && !this.getMyRank().isInitialized()) {
                  return false;
               } else {
                  return true;
               }
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Rank_28504 parsedMessage = null;

            try {
               parsedMessage = (S2C_Rank_28504)SupremePvpMsg.S2C_Rank_28504.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Rank_28504)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRankType() {
            return (this.bitField0_ & 1) != 0;
         }

         public RankType getRankType() {
            RankType result = SupremePvpMsg.RankType.valueOf(this.rankType_);
            return result == null ? SupremePvpMsg.RankType.TYPE_MAIN : result;
         }

         public Builder setRankType(RankType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.rankType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearRankType() {
            this.bitField0_ &= -2;
            this.rankType_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRankIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.rank_ = new ArrayList(this.rank_);
               this.bitField0_ |= 2;
            }

         }

         public List<RankInfo> getRankList() {
            return this.rankBuilder_ == null ? Collections.unmodifiableList(this.rank_) : this.rankBuilder_.getMessageList();
         }

         public int getRankCount() {
            return this.rankBuilder_ == null ? this.rank_.size() : this.rankBuilder_.getCount();
         }

         public RankInfo getRank(int index) {
            return this.rankBuilder_ == null ? (RankInfo)this.rank_.get(index) : (RankInfo)this.rankBuilder_.getMessage(index);
         }

         public Builder setRank(int index, RankInfo value) {
            if (this.rankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankIsMutable();
               this.rank_.set(index, value);
               this.onChanged();
            } else {
               this.rankBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRank(int index, RankInfo.Builder builderForValue) {
            if (this.rankBuilder_ == null) {
               this.ensureRankIsMutable();
               this.rank_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRank(RankInfo value) {
            if (this.rankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankIsMutable();
               this.rank_.add(value);
               this.onChanged();
            } else {
               this.rankBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRank(int index, RankInfo value) {
            if (this.rankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankIsMutable();
               this.rank_.add(index, value);
               this.onChanged();
            } else {
               this.rankBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRank(RankInfo.Builder builderForValue) {
            if (this.rankBuilder_ == null) {
               this.ensureRankIsMutable();
               this.rank_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rankBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRank(int index, RankInfo.Builder builderForValue) {
            if (this.rankBuilder_ == null) {
               this.ensureRankIsMutable();
               this.rank_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRank(Iterable<? extends RankInfo> values) {
            if (this.rankBuilder_ == null) {
               this.ensureRankIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rank_);
               this.onChanged();
            } else {
               this.rankBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRank() {
            if (this.rankBuilder_ == null) {
               this.rank_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.rankBuilder_.clear();
            }

            return this;
         }

         public Builder removeRank(int index) {
            if (this.rankBuilder_ == null) {
               this.ensureRankIsMutable();
               this.rank_.remove(index);
               this.onChanged();
            } else {
               this.rankBuilder_.remove(index);
            }

            return this;
         }

         public RankInfo.Builder getRankBuilder(int index) {
            return (RankInfo.Builder)this.getRankFieldBuilder().getBuilder(index);
         }

         public RankInfoOrBuilder getRankOrBuilder(int index) {
            return this.rankBuilder_ == null ? (RankInfoOrBuilder)this.rank_.get(index) : (RankInfoOrBuilder)this.rankBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankInfoOrBuilder> getRankOrBuilderList() {
            return this.rankBuilder_ != null ? this.rankBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rank_);
         }

         public RankInfo.Builder addRankBuilder() {
            return (RankInfo.Builder)this.getRankFieldBuilder().addBuilder(SupremePvpMsg.RankInfo.getDefaultInstance());
         }

         public RankInfo.Builder addRankBuilder(int index) {
            return (RankInfo.Builder)this.getRankFieldBuilder().addBuilder(index, SupremePvpMsg.RankInfo.getDefaultInstance());
         }

         public List<RankInfo.Builder> getRankBuilderList() {
            return this.getRankFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> getRankFieldBuilder() {
            if (this.rankBuilder_ == null) {
               this.rankBuilder_ = new RepeatedFieldBuilderV3(this.rank_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.rank_ = null;
            }

            return this.rankBuilder_;
         }

         public boolean hasMyRank() {
            return (this.bitField0_ & 4) != 0;
         }

         public RankInfo getMyRank() {
            if (this.myRankBuilder_ == null) {
               return this.myRank_ == null ? SupremePvpMsg.RankInfo.getDefaultInstance() : this.myRank_;
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

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setMyRank(RankInfo.Builder builderForValue) {
            if (this.myRankBuilder_ == null) {
               this.myRank_ = builderForValue.build();
               this.onChanged();
            } else {
               this.myRankBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeMyRank(RankInfo value) {
            if (this.myRankBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.myRank_ != null && this.myRank_ != SupremePvpMsg.RankInfo.getDefaultInstance()) {
                  this.myRank_ = SupremePvpMsg.RankInfo.newBuilder(this.myRank_).mergeFrom(value).buildPartial();
               } else {
                  this.myRank_ = value;
               }

               this.onChanged();
            } else {
               this.myRankBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearMyRank() {
            if (this.myRankBuilder_ == null) {
               this.myRank_ = null;
               this.onChanged();
            } else {
               this.myRankBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public RankInfo.Builder getMyRankBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (RankInfo.Builder)this.getMyRankFieldBuilder().getBuilder();
         }

         public RankInfoOrBuilder getMyRankOrBuilder() {
            if (this.myRankBuilder_ != null) {
               return (RankInfoOrBuilder)this.myRankBuilder_.getMessageOrBuilder();
            } else {
               return this.myRank_ == null ? SupremePvpMsg.RankInfo.getDefaultInstance() : this.myRank_;
            }
         }

         private SingleFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> getMyRankFieldBuilder() {
            if (this.myRankBuilder_ == null) {
               this.myRankBuilder_ = new SingleFieldBuilderV3(this.getMyRank(), this.getParentForChildren(), this.isClean());
               this.myRank_ = null;
            }

            return this.myRankBuilder_;
         }

         public boolean hasGrade() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getGrade() {
            return this.grade_;
         }

         public Builder setGrade(int value) {
            this.bitField0_ |= 8;
            this.grade_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGrade() {
            this.bitField0_ &= -9;
            this.grade_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSettleGrade() {
            return (this.bitField0_ & 16) != 0;
         }

         public SettleGrade getSettleGrade() {
            SettleGrade result = SupremePvpMsg.SettleGrade.valueOf(this.settleGrade_);
            return result == null ? SupremePvpMsg.SettleGrade.GRADE_REDUCE : result;
         }

         public Builder setSettleGrade(SettleGrade value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16;
               this.settleGrade_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearSettleGrade() {
            this.bitField0_ &= -17;
            this.settleGrade_ = -1;
            this.onChanged();
            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(int value) {
            this.bitField0_ |= 32;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -33;
            this.endTime_ = 0;
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

   public static final class C2S_ChallengeList_28505 extends GeneratedMessageV3 implements C2S_ChallengeList_28505OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FLUSH_FIELD_NUMBER = 1;
      private boolean flush_;
      private byte memoizedIsInitialized;
      private static final C2S_ChallengeList_28505 DEFAULT_INSTANCE = new C2S_ChallengeList_28505();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ChallengeList_28505> PARSER = new AbstractParser<C2S_ChallengeList_28505>() {
         public C2S_ChallengeList_28505 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ChallengeList_28505(input, extensionRegistry);
         }
      };

      private C2S_ChallengeList_28505(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ChallengeList_28505() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ChallengeList_28505();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ChallengeList_28505(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.flush_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_ChallengeList_28505_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_ChallengeList_28505_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChallengeList_28505.class, Builder.class);
      }

      public boolean hasFlush() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getFlush() {
         return this.flush_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFlush()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.flush_);
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
               size += CodedOutputStream.computeBoolSize(1, this.flush_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ChallengeList_28505)) {
            return super.equals(obj);
         } else {
            C2S_ChallengeList_28505 other = (C2S_ChallengeList_28505)obj;
            if (this.hasFlush() != other.hasFlush()) {
               return false;
            } else if (this.hasFlush() && this.getFlush() != other.getFlush()) {
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
            if (this.hasFlush()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getFlush());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ChallengeList_28505 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ChallengeList_28505)PARSER.parseFrom(data);
      }

      public static C2S_ChallengeList_28505 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChallengeList_28505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChallengeList_28505 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ChallengeList_28505)PARSER.parseFrom(data);
      }

      public static C2S_ChallengeList_28505 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChallengeList_28505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChallengeList_28505 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ChallengeList_28505)PARSER.parseFrom(data);
      }

      public static C2S_ChallengeList_28505 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChallengeList_28505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChallengeList_28505 parseFrom(InputStream input) throws IOException {
         return (C2S_ChallengeList_28505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChallengeList_28505 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChallengeList_28505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChallengeList_28505 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ChallengeList_28505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ChallengeList_28505 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChallengeList_28505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChallengeList_28505 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ChallengeList_28505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChallengeList_28505 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChallengeList_28505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ChallengeList_28505 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ChallengeList_28505 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ChallengeList_28505> parser() {
         return PARSER;
      }

      public Parser<C2S_ChallengeList_28505> getParserForType() {
         return PARSER;
      }

      public C2S_ChallengeList_28505 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ChallengeList_28505OrBuilder {
         private int bitField0_;
         private boolean flush_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_ChallengeList_28505_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_ChallengeList_28505_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChallengeList_28505.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.C2S_ChallengeList_28505.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.flush_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_ChallengeList_28505_descriptor;
         }

         public C2S_ChallengeList_28505 getDefaultInstanceForType() {
            return SupremePvpMsg.C2S_ChallengeList_28505.getDefaultInstance();
         }

         public C2S_ChallengeList_28505 build() {
            C2S_ChallengeList_28505 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ChallengeList_28505 buildPartial() {
            C2S_ChallengeList_28505 result = new C2S_ChallengeList_28505(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.flush_ = this.flush_;
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
            if (other instanceof C2S_ChallengeList_28505) {
               return this.mergeFrom((C2S_ChallengeList_28505)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ChallengeList_28505 other) {
            if (other == SupremePvpMsg.C2S_ChallengeList_28505.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFlush()) {
                  this.setFlush(other.getFlush());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasFlush();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ChallengeList_28505 parsedMessage = null;

            try {
               parsedMessage = (C2S_ChallengeList_28505)SupremePvpMsg.C2S_ChallengeList_28505.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ChallengeList_28505)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFlush() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getFlush() {
            return this.flush_;
         }

         public Builder setFlush(boolean value) {
            this.bitField0_ |= 1;
            this.flush_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFlush() {
            this.bitField0_ &= -2;
            this.flush_ = false;
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

   public static final class S2C_ChallengeList_28506 extends GeneratedMessageV3 implements S2C_ChallengeList_28506OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FLUSH_FIELD_NUMBER = 1;
      private boolean flush_;
      public static final int DAILYFLUSHTIMES_FIELD_NUMBER = 2;
      private int dailyFlushTimes_;
      public static final int PLAYER_FIELD_NUMBER = 4;
      private List<PvpMsg.PvpPlayerInfo> player_;
      private byte memoizedIsInitialized;
      private static final S2C_ChallengeList_28506 DEFAULT_INSTANCE = new S2C_ChallengeList_28506();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ChallengeList_28506> PARSER = new AbstractParser<S2C_ChallengeList_28506>() {
         public S2C_ChallengeList_28506 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ChallengeList_28506(input, extensionRegistry);
         }
      };

      private S2C_ChallengeList_28506(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ChallengeList_28506() {
         this.memoizedIsInitialized = -1;
         this.player_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ChallengeList_28506();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ChallengeList_28506(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.flush_ = input.readBool();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.dailyFlushTimes_ = input.readInt32();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.player_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.player_.add(input.readMessage(PvpMsg.PvpPlayerInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.player_ = Collections.unmodifiableList(this.player_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_ChallengeList_28506_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_ChallengeList_28506_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChallengeList_28506.class, Builder.class);
      }

      public boolean hasFlush() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getFlush() {
         return this.flush_;
      }

      public boolean hasDailyFlushTimes() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDailyFlushTimes() {
         return this.dailyFlushTimes_;
      }

      public List<PvpMsg.PvpPlayerInfo> getPlayerList() {
         return this.player_;
      }

      public List<? extends PvpMsg.PvpPlayerInfoOrBuilder> getPlayerOrBuilderList() {
         return this.player_;
      }

      public int getPlayerCount() {
         return this.player_.size();
      }

      public PvpMsg.PvpPlayerInfo getPlayer(int index) {
         return (PvpMsg.PvpPlayerInfo)this.player_.get(index);
      }

      public PvpMsg.PvpPlayerInfoOrBuilder getPlayerOrBuilder(int index) {
         return (PvpMsg.PvpPlayerInfoOrBuilder)this.player_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFlush()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDailyFlushTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getPlayerCount(); ++i) {
               if (!this.getPlayer(i).isInitialized()) {
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
            output.writeBool(1, this.flush_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.dailyFlushTimes_);
         }

         for(int i = 0; i < this.player_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.player_.get(i));
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
               size += CodedOutputStream.computeBoolSize(1, this.flush_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.dailyFlushTimes_);
            }

            for(int i = 0; i < this.player_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.player_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ChallengeList_28506)) {
            return super.equals(obj);
         } else {
            S2C_ChallengeList_28506 other = (S2C_ChallengeList_28506)obj;
            if (this.hasFlush() != other.hasFlush()) {
               return false;
            } else if (this.hasFlush() && this.getFlush() != other.getFlush()) {
               return false;
            } else if (this.hasDailyFlushTimes() != other.hasDailyFlushTimes()) {
               return false;
            } else if (this.hasDailyFlushTimes() && this.getDailyFlushTimes() != other.getDailyFlushTimes()) {
               return false;
            } else if (!this.getPlayerList().equals(other.getPlayerList())) {
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
            if (this.hasFlush()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getFlush());
            }

            if (this.hasDailyFlushTimes()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDailyFlushTimes();
            }

            if (this.getPlayerCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPlayerList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ChallengeList_28506 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ChallengeList_28506)PARSER.parseFrom(data);
      }

      public static S2C_ChallengeList_28506 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChallengeList_28506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChallengeList_28506 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ChallengeList_28506)PARSER.parseFrom(data);
      }

      public static S2C_ChallengeList_28506 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChallengeList_28506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChallengeList_28506 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ChallengeList_28506)PARSER.parseFrom(data);
      }

      public static S2C_ChallengeList_28506 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChallengeList_28506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChallengeList_28506 parseFrom(InputStream input) throws IOException {
         return (S2C_ChallengeList_28506)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChallengeList_28506 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChallengeList_28506)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChallengeList_28506 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ChallengeList_28506)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ChallengeList_28506 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChallengeList_28506)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChallengeList_28506 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ChallengeList_28506)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChallengeList_28506 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChallengeList_28506)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ChallengeList_28506 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ChallengeList_28506 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ChallengeList_28506> parser() {
         return PARSER;
      }

      public Parser<S2C_ChallengeList_28506> getParserForType() {
         return PARSER;
      }

      public S2C_ChallengeList_28506 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ChallengeList_28506OrBuilder {
         private int bitField0_;
         private boolean flush_;
         private int dailyFlushTimes_;
         private List<PvpMsg.PvpPlayerInfo> player_;
         private RepeatedFieldBuilderV3<PvpMsg.PvpPlayerInfo, PvpMsg.PvpPlayerInfo.Builder, PvpMsg.PvpPlayerInfoOrBuilder> playerBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_ChallengeList_28506_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_ChallengeList_28506_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChallengeList_28506.class, Builder.class);
         }

         private Builder() {
            this.player_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.player_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.S2C_ChallengeList_28506.alwaysUseFieldBuilders) {
               this.getPlayerFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.flush_ = false;
            this.bitField0_ &= -2;
            this.dailyFlushTimes_ = 0;
            this.bitField0_ &= -3;
            if (this.playerBuilder_ == null) {
               this.player_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.playerBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_ChallengeList_28506_descriptor;
         }

         public S2C_ChallengeList_28506 getDefaultInstanceForType() {
            return SupremePvpMsg.S2C_ChallengeList_28506.getDefaultInstance();
         }

         public S2C_ChallengeList_28506 build() {
            S2C_ChallengeList_28506 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ChallengeList_28506 buildPartial() {
            S2C_ChallengeList_28506 result = new S2C_ChallengeList_28506(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.flush_ = this.flush_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.dailyFlushTimes_ = this.dailyFlushTimes_;
               to_bitField0_ |= 2;
            }

            if (this.playerBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.player_ = Collections.unmodifiableList(this.player_);
                  this.bitField0_ &= -5;
               }

               result.player_ = this.player_;
            } else {
               result.player_ = this.playerBuilder_.build();
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
            if (other instanceof S2C_ChallengeList_28506) {
               return this.mergeFrom((S2C_ChallengeList_28506)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ChallengeList_28506 other) {
            if (other == SupremePvpMsg.S2C_ChallengeList_28506.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFlush()) {
                  this.setFlush(other.getFlush());
               }

               if (other.hasDailyFlushTimes()) {
                  this.setDailyFlushTimes(other.getDailyFlushTimes());
               }

               if (this.playerBuilder_ == null) {
                  if (!other.player_.isEmpty()) {
                     if (this.player_.isEmpty()) {
                        this.player_ = other.player_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensurePlayerIsMutable();
                        this.player_.addAll(other.player_);
                     }

                     this.onChanged();
                  }
               } else if (!other.player_.isEmpty()) {
                  if (this.playerBuilder_.isEmpty()) {
                     this.playerBuilder_.dispose();
                     this.playerBuilder_ = null;
                     this.player_ = other.player_;
                     this.bitField0_ &= -5;
                     this.playerBuilder_ = SupremePvpMsg.S2C_ChallengeList_28506.alwaysUseFieldBuilders ? this.getPlayerFieldBuilder() : null;
                  } else {
                     this.playerBuilder_.addAllMessages(other.player_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFlush()) {
               return false;
            } else if (!this.hasDailyFlushTimes()) {
               return false;
            } else {
               for(int i = 0; i < this.getPlayerCount(); ++i) {
                  if (!this.getPlayer(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ChallengeList_28506 parsedMessage = null;

            try {
               parsedMessage = (S2C_ChallengeList_28506)SupremePvpMsg.S2C_ChallengeList_28506.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ChallengeList_28506)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFlush() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getFlush() {
            return this.flush_;
         }

         public Builder setFlush(boolean value) {
            this.bitField0_ |= 1;
            this.flush_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFlush() {
            this.bitField0_ &= -2;
            this.flush_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasDailyFlushTimes() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDailyFlushTimes() {
            return this.dailyFlushTimes_;
         }

         public Builder setDailyFlushTimes(int value) {
            this.bitField0_ |= 2;
            this.dailyFlushTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyFlushTimes() {
            this.bitField0_ &= -3;
            this.dailyFlushTimes_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePlayerIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.player_ = new ArrayList(this.player_);
               this.bitField0_ |= 4;
            }

         }

         public List<PvpMsg.PvpPlayerInfo> getPlayerList() {
            return this.playerBuilder_ == null ? Collections.unmodifiableList(this.player_) : this.playerBuilder_.getMessageList();
         }

         public int getPlayerCount() {
            return this.playerBuilder_ == null ? this.player_.size() : this.playerBuilder_.getCount();
         }

         public PvpMsg.PvpPlayerInfo getPlayer(int index) {
            return this.playerBuilder_ == null ? (PvpMsg.PvpPlayerInfo)this.player_.get(index) : (PvpMsg.PvpPlayerInfo)this.playerBuilder_.getMessage(index);
         }

         public Builder setPlayer(int index, PvpMsg.PvpPlayerInfo value) {
            if (this.playerBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerIsMutable();
               this.player_.set(index, value);
               this.onChanged();
            } else {
               this.playerBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPlayer(int index, PvpMsg.PvpPlayerInfo.Builder builderForValue) {
            if (this.playerBuilder_ == null) {
               this.ensurePlayerIsMutable();
               this.player_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPlayer(PvpMsg.PvpPlayerInfo value) {
            if (this.playerBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerIsMutable();
               this.player_.add(value);
               this.onChanged();
            } else {
               this.playerBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPlayer(int index, PvpMsg.PvpPlayerInfo value) {
            if (this.playerBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerIsMutable();
               this.player_.add(index, value);
               this.onChanged();
            } else {
               this.playerBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPlayer(PvpMsg.PvpPlayerInfo.Builder builderForValue) {
            if (this.playerBuilder_ == null) {
               this.ensurePlayerIsMutable();
               this.player_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.playerBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPlayer(int index, PvpMsg.PvpPlayerInfo.Builder builderForValue) {
            if (this.playerBuilder_ == null) {
               this.ensurePlayerIsMutable();
               this.player_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPlayer(Iterable<? extends PvpMsg.PvpPlayerInfo> values) {
            if (this.playerBuilder_ == null) {
               this.ensurePlayerIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.player_);
               this.onChanged();
            } else {
               this.playerBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPlayer() {
            if (this.playerBuilder_ == null) {
               this.player_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.playerBuilder_.clear();
            }

            return this;
         }

         public Builder removePlayer(int index) {
            if (this.playerBuilder_ == null) {
               this.ensurePlayerIsMutable();
               this.player_.remove(index);
               this.onChanged();
            } else {
               this.playerBuilder_.remove(index);
            }

            return this;
         }

         public PvpMsg.PvpPlayerInfo.Builder getPlayerBuilder(int index) {
            return (PvpMsg.PvpPlayerInfo.Builder)this.getPlayerFieldBuilder().getBuilder(index);
         }

         public PvpMsg.PvpPlayerInfoOrBuilder getPlayerOrBuilder(int index) {
            return this.playerBuilder_ == null ? (PvpMsg.PvpPlayerInfoOrBuilder)this.player_.get(index) : (PvpMsg.PvpPlayerInfoOrBuilder)this.playerBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends PvpMsg.PvpPlayerInfoOrBuilder> getPlayerOrBuilderList() {
            return this.playerBuilder_ != null ? this.playerBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.player_);
         }

         public PvpMsg.PvpPlayerInfo.Builder addPlayerBuilder() {
            return (PvpMsg.PvpPlayerInfo.Builder)this.getPlayerFieldBuilder().addBuilder(PvpMsg.PvpPlayerInfo.getDefaultInstance());
         }

         public PvpMsg.PvpPlayerInfo.Builder addPlayerBuilder(int index) {
            return (PvpMsg.PvpPlayerInfo.Builder)this.getPlayerFieldBuilder().addBuilder(index, PvpMsg.PvpPlayerInfo.getDefaultInstance());
         }

         public List<PvpMsg.PvpPlayerInfo.Builder> getPlayerBuilderList() {
            return this.getPlayerFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PvpMsg.PvpPlayerInfo, PvpMsg.PvpPlayerInfo.Builder, PvpMsg.PvpPlayerInfoOrBuilder> getPlayerFieldBuilder() {
            if (this.playerBuilder_ == null) {
               this.playerBuilder_ = new RepeatedFieldBuilderV3(this.player_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.player_ = null;
            }

            return this.playerBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_FightRecord_28507 extends GeneratedMessageV3 implements C2S_FightRecord_28507OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_FightRecord_28507 DEFAULT_INSTANCE = new C2S_FightRecord_28507();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FightRecord_28507> PARSER = new AbstractParser<C2S_FightRecord_28507>() {
         public C2S_FightRecord_28507 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FightRecord_28507(input, extensionRegistry);
         }
      };

      private C2S_FightRecord_28507(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FightRecord_28507() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FightRecord_28507();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FightRecord_28507(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_FightRecord_28507_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_FightRecord_28507_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FightRecord_28507.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FightRecord_28507)) {
            return super.equals(obj);
         } else {
            C2S_FightRecord_28507 other = (C2S_FightRecord_28507)obj;
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

      public static C2S_FightRecord_28507 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FightRecord_28507)PARSER.parseFrom(data);
      }

      public static C2S_FightRecord_28507 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FightRecord_28507)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FightRecord_28507 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FightRecord_28507)PARSER.parseFrom(data);
      }

      public static C2S_FightRecord_28507 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FightRecord_28507)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FightRecord_28507 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FightRecord_28507)PARSER.parseFrom(data);
      }

      public static C2S_FightRecord_28507 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FightRecord_28507)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FightRecord_28507 parseFrom(InputStream input) throws IOException {
         return (C2S_FightRecord_28507)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FightRecord_28507 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FightRecord_28507)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FightRecord_28507 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FightRecord_28507)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FightRecord_28507 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FightRecord_28507)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FightRecord_28507 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FightRecord_28507)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FightRecord_28507 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FightRecord_28507)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FightRecord_28507 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FightRecord_28507 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FightRecord_28507> parser() {
         return PARSER;
      }

      public Parser<C2S_FightRecord_28507> getParserForType() {
         return PARSER;
      }

      public C2S_FightRecord_28507 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FightRecord_28507OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_FightRecord_28507_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_FightRecord_28507_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FightRecord_28507.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.C2S_FightRecord_28507.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_FightRecord_28507_descriptor;
         }

         public C2S_FightRecord_28507 getDefaultInstanceForType() {
            return SupremePvpMsg.C2S_FightRecord_28507.getDefaultInstance();
         }

         public C2S_FightRecord_28507 build() {
            C2S_FightRecord_28507 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FightRecord_28507 buildPartial() {
            C2S_FightRecord_28507 result = new C2S_FightRecord_28507(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_FightRecord_28507) {
               return this.mergeFrom((C2S_FightRecord_28507)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FightRecord_28507 other) {
            if (other == SupremePvpMsg.C2S_FightRecord_28507.getDefaultInstance()) {
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
            C2S_FightRecord_28507 parsedMessage = null;

            try {
               parsedMessage = (C2S_FightRecord_28507)SupremePvpMsg.C2S_FightRecord_28507.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FightRecord_28507)e.getUnfinishedMessage();
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

   public static final class S2C_FightRecord_28508 extends GeneratedMessageV3 implements S2C_FightRecord_28508OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECORD_FIELD_NUMBER = 1;
      private List<PvpMsg.PvpRecordInfo> record_;
      private byte memoizedIsInitialized;
      private static final S2C_FightRecord_28508 DEFAULT_INSTANCE = new S2C_FightRecord_28508();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FightRecord_28508> PARSER = new AbstractParser<S2C_FightRecord_28508>() {
         public S2C_FightRecord_28508 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FightRecord_28508(input, extensionRegistry);
         }
      };

      private S2C_FightRecord_28508(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FightRecord_28508() {
         this.memoizedIsInitialized = -1;
         this.record_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FightRecord_28508();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FightRecord_28508(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.record_.add(input.readMessage(PvpMsg.PvpRecordInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_FightRecord_28508_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_FightRecord_28508_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FightRecord_28508.class, Builder.class);
      }

      public List<PvpMsg.PvpRecordInfo> getRecordList() {
         return this.record_;
      }

      public List<? extends PvpMsg.PvpRecordInfoOrBuilder> getRecordOrBuilderList() {
         return this.record_;
      }

      public int getRecordCount() {
         return this.record_.size();
      }

      public PvpMsg.PvpRecordInfo getRecord(int index) {
         return (PvpMsg.PvpRecordInfo)this.record_.get(index);
      }

      public PvpMsg.PvpRecordInfoOrBuilder getRecordOrBuilder(int index) {
         return (PvpMsg.PvpRecordInfoOrBuilder)this.record_.get(index);
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
         } else if (!(obj instanceof S2C_FightRecord_28508)) {
            return super.equals(obj);
         } else {
            S2C_FightRecord_28508 other = (S2C_FightRecord_28508)obj;
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

      public static S2C_FightRecord_28508 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FightRecord_28508)PARSER.parseFrom(data);
      }

      public static S2C_FightRecord_28508 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FightRecord_28508)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FightRecord_28508 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FightRecord_28508)PARSER.parseFrom(data);
      }

      public static S2C_FightRecord_28508 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FightRecord_28508)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FightRecord_28508 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FightRecord_28508)PARSER.parseFrom(data);
      }

      public static S2C_FightRecord_28508 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FightRecord_28508)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FightRecord_28508 parseFrom(InputStream input) throws IOException {
         return (S2C_FightRecord_28508)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FightRecord_28508 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FightRecord_28508)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FightRecord_28508 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FightRecord_28508)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FightRecord_28508 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FightRecord_28508)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FightRecord_28508 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FightRecord_28508)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FightRecord_28508 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FightRecord_28508)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FightRecord_28508 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FightRecord_28508 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FightRecord_28508> parser() {
         return PARSER;
      }

      public Parser<S2C_FightRecord_28508> getParserForType() {
         return PARSER;
      }

      public S2C_FightRecord_28508 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FightRecord_28508OrBuilder {
         private int bitField0_;
         private List<PvpMsg.PvpRecordInfo> record_;
         private RepeatedFieldBuilderV3<PvpMsg.PvpRecordInfo, PvpMsg.PvpRecordInfo.Builder, PvpMsg.PvpRecordInfoOrBuilder> recordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_FightRecord_28508_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_FightRecord_28508_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FightRecord_28508.class, Builder.class);
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
            if (SupremePvpMsg.S2C_FightRecord_28508.alwaysUseFieldBuilders) {
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
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_FightRecord_28508_descriptor;
         }

         public S2C_FightRecord_28508 getDefaultInstanceForType() {
            return SupremePvpMsg.S2C_FightRecord_28508.getDefaultInstance();
         }

         public S2C_FightRecord_28508 build() {
            S2C_FightRecord_28508 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FightRecord_28508 buildPartial() {
            S2C_FightRecord_28508 result = new S2C_FightRecord_28508(this);
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
            if (other instanceof S2C_FightRecord_28508) {
               return this.mergeFrom((S2C_FightRecord_28508)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FightRecord_28508 other) {
            if (other == SupremePvpMsg.S2C_FightRecord_28508.getDefaultInstance()) {
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
                     this.recordBuilder_ = SupremePvpMsg.S2C_FightRecord_28508.alwaysUseFieldBuilders ? this.getRecordFieldBuilder() : null;
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
            S2C_FightRecord_28508 parsedMessage = null;

            try {
               parsedMessage = (S2C_FightRecord_28508)SupremePvpMsg.S2C_FightRecord_28508.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FightRecord_28508)e.getUnfinishedMessage();
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

         public List<PvpMsg.PvpRecordInfo> getRecordList() {
            return this.recordBuilder_ == null ? Collections.unmodifiableList(this.record_) : this.recordBuilder_.getMessageList();
         }

         public int getRecordCount() {
            return this.recordBuilder_ == null ? this.record_.size() : this.recordBuilder_.getCount();
         }

         public PvpMsg.PvpRecordInfo getRecord(int index) {
            return this.recordBuilder_ == null ? (PvpMsg.PvpRecordInfo)this.record_.get(index) : (PvpMsg.PvpRecordInfo)this.recordBuilder_.getMessage(index);
         }

         public Builder setRecord(int index, PvpMsg.PvpRecordInfo value) {
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

         public Builder setRecord(int index, PvpMsg.PvpRecordInfo.Builder builderForValue) {
            if (this.recordBuilder_ == null) {
               this.ensureRecordIsMutable();
               this.record_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRecord(PvpMsg.PvpRecordInfo value) {
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

         public Builder addRecord(int index, PvpMsg.PvpRecordInfo value) {
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

         public Builder addRecord(PvpMsg.PvpRecordInfo.Builder builderForValue) {
            if (this.recordBuilder_ == null) {
               this.ensureRecordIsMutable();
               this.record_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.recordBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRecord(int index, PvpMsg.PvpRecordInfo.Builder builderForValue) {
            if (this.recordBuilder_ == null) {
               this.ensureRecordIsMutable();
               this.record_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecord(Iterable<? extends PvpMsg.PvpRecordInfo> values) {
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

         public PvpMsg.PvpRecordInfo.Builder getRecordBuilder(int index) {
            return (PvpMsg.PvpRecordInfo.Builder)this.getRecordFieldBuilder().getBuilder(index);
         }

         public PvpMsg.PvpRecordInfoOrBuilder getRecordOrBuilder(int index) {
            return this.recordBuilder_ == null ? (PvpMsg.PvpRecordInfoOrBuilder)this.record_.get(index) : (PvpMsg.PvpRecordInfoOrBuilder)this.recordBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends PvpMsg.PvpRecordInfoOrBuilder> getRecordOrBuilderList() {
            return this.recordBuilder_ != null ? this.recordBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.record_);
         }

         public PvpMsg.PvpRecordInfo.Builder addRecordBuilder() {
            return (PvpMsg.PvpRecordInfo.Builder)this.getRecordFieldBuilder().addBuilder(PvpMsg.PvpRecordInfo.getDefaultInstance());
         }

         public PvpMsg.PvpRecordInfo.Builder addRecordBuilder(int index) {
            return (PvpMsg.PvpRecordInfo.Builder)this.getRecordFieldBuilder().addBuilder(index, PvpMsg.PvpRecordInfo.getDefaultInstance());
         }

         public List<PvpMsg.PvpRecordInfo.Builder> getRecordBuilderList() {
            return this.getRecordFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PvpMsg.PvpRecordInfo, PvpMsg.PvpRecordInfo.Builder, PvpMsg.PvpRecordInfoOrBuilder> getRecordFieldBuilder() {
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

   public static final class C2S_WarOrderBuy_28509 extends GeneratedMessageV3 implements C2S_WarOrderBuy_28509OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYTYPE_FIELD_NUMBER = 1;
      private int buyType_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_WarOrderBuy_28509 DEFAULT_INSTANCE = new C2S_WarOrderBuy_28509();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarOrderBuy_28509> PARSER = new AbstractParser<C2S_WarOrderBuy_28509>() {
         public C2S_WarOrderBuy_28509 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarOrderBuy_28509(input, extensionRegistry);
         }
      };

      private C2S_WarOrderBuy_28509(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarOrderBuy_28509() {
         this.memoizedIsInitialized = -1;
         this.buyType_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarOrderBuy_28509();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarOrderBuy_28509(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        BuyType value = SupremePvpMsg.BuyType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.buyType_ = rawValue;
                        }
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrderBuy_28509_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrderBuy_28509_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarOrderBuy_28509.class, Builder.class);
      }

      public boolean hasBuyType() {
         return (this.bitField0_ & 1) != 0;
      }

      public BuyType getBuyType() {
         BuyType result = SupremePvpMsg.BuyType.valueOf(this.buyType_);
         return result == null ? SupremePvpMsg.BuyType.INTEGRAL : result;
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
         } else if (!this.hasBuyType()) {
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
            output.writeEnum(1, this.buyType_);
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
               size += CodedOutputStream.computeEnumSize(1, this.buyType_);
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
         } else if (!(obj instanceof C2S_WarOrderBuy_28509)) {
            return super.equals(obj);
         } else {
            C2S_WarOrderBuy_28509 other = (C2S_WarOrderBuy_28509)obj;
            if (this.hasBuyType() != other.hasBuyType()) {
               return false;
            } else if (this.hasBuyType() && this.buyType_ != other.buyType_) {
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
            if (this.hasBuyType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.buyType_;
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

      public static C2S_WarOrderBuy_28509 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarOrderBuy_28509)PARSER.parseFrom(data);
      }

      public static C2S_WarOrderBuy_28509 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarOrderBuy_28509)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarOrderBuy_28509 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarOrderBuy_28509)PARSER.parseFrom(data);
      }

      public static C2S_WarOrderBuy_28509 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarOrderBuy_28509)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarOrderBuy_28509 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarOrderBuy_28509)PARSER.parseFrom(data);
      }

      public static C2S_WarOrderBuy_28509 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarOrderBuy_28509)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarOrderBuy_28509 parseFrom(InputStream input) throws IOException {
         return (C2S_WarOrderBuy_28509)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarOrderBuy_28509 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarOrderBuy_28509)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarOrderBuy_28509 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarOrderBuy_28509)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarOrderBuy_28509 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarOrderBuy_28509)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarOrderBuy_28509 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarOrderBuy_28509)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarOrderBuy_28509 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarOrderBuy_28509)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarOrderBuy_28509 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarOrderBuy_28509 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarOrderBuy_28509> parser() {
         return PARSER;
      }

      public Parser<C2S_WarOrderBuy_28509> getParserForType() {
         return PARSER;
      }

      public C2S_WarOrderBuy_28509 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarOrderBuy_28509OrBuilder {
         private int bitField0_;
         private int buyType_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrderBuy_28509_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrderBuy_28509_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarOrderBuy_28509.class, Builder.class);
         }

         private Builder() {
            this.buyType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.buyType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.C2S_WarOrderBuy_28509.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyType_ = 1;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrderBuy_28509_descriptor;
         }

         public C2S_WarOrderBuy_28509 getDefaultInstanceForType() {
            return SupremePvpMsg.C2S_WarOrderBuy_28509.getDefaultInstance();
         }

         public C2S_WarOrderBuy_28509 build() {
            C2S_WarOrderBuy_28509 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarOrderBuy_28509 buildPartial() {
            C2S_WarOrderBuy_28509 result = new C2S_WarOrderBuy_28509(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.buyType_ = this.buyType_;
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
            if (other instanceof C2S_WarOrderBuy_28509) {
               return this.mergeFrom((C2S_WarOrderBuy_28509)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarOrderBuy_28509 other) {
            if (other == SupremePvpMsg.C2S_WarOrderBuy_28509.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuyType()) {
                  this.setBuyType(other.getBuyType());
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
            if (!this.hasBuyType()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_WarOrderBuy_28509 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarOrderBuy_28509)SupremePvpMsg.C2S_WarOrderBuy_28509.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarOrderBuy_28509)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuyType() {
            return (this.bitField0_ & 1) != 0;
         }

         public BuyType getBuyType() {
            BuyType result = SupremePvpMsg.BuyType.valueOf(this.buyType_);
            return result == null ? SupremePvpMsg.BuyType.INTEGRAL : result;
         }

         public Builder setBuyType(BuyType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.buyType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearBuyType() {
            this.bitField0_ &= -2;
            this.buyType_ = 1;
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

   public static final class S2C_WarOrderBuy_28510 extends GeneratedMessageV3 implements S2C_WarOrderBuy_28510OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYTYPE_FIELD_NUMBER = 1;
      private int buyType_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final S2C_WarOrderBuy_28510 DEFAULT_INSTANCE = new S2C_WarOrderBuy_28510();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarOrderBuy_28510> PARSER = new AbstractParser<S2C_WarOrderBuy_28510>() {
         public S2C_WarOrderBuy_28510 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarOrderBuy_28510(input, extensionRegistry);
         }
      };

      private S2C_WarOrderBuy_28510(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarOrderBuy_28510() {
         this.memoizedIsInitialized = -1;
         this.buyType_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarOrderBuy_28510();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarOrderBuy_28510(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        BuyType value = SupremePvpMsg.BuyType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.buyType_ = rawValue;
                        }
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderBuy_28510_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderBuy_28510_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarOrderBuy_28510.class, Builder.class);
      }

      public boolean hasBuyType() {
         return (this.bitField0_ & 1) != 0;
      }

      public BuyType getBuyType() {
         BuyType result = SupremePvpMsg.BuyType.valueOf(this.buyType_);
         return result == null ? SupremePvpMsg.BuyType.INTEGRAL : result;
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
         } else if (!this.hasBuyType()) {
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
            output.writeEnum(1, this.buyType_);
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
               size += CodedOutputStream.computeEnumSize(1, this.buyType_);
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
         } else if (!(obj instanceof S2C_WarOrderBuy_28510)) {
            return super.equals(obj);
         } else {
            S2C_WarOrderBuy_28510 other = (S2C_WarOrderBuy_28510)obj;
            if (this.hasBuyType() != other.hasBuyType()) {
               return false;
            } else if (this.hasBuyType() && this.buyType_ != other.buyType_) {
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
            if (this.hasBuyType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.buyType_;
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

      public static S2C_WarOrderBuy_28510 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarOrderBuy_28510)PARSER.parseFrom(data);
      }

      public static S2C_WarOrderBuy_28510 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarOrderBuy_28510)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarOrderBuy_28510 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarOrderBuy_28510)PARSER.parseFrom(data);
      }

      public static S2C_WarOrderBuy_28510 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarOrderBuy_28510)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarOrderBuy_28510 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarOrderBuy_28510)PARSER.parseFrom(data);
      }

      public static S2C_WarOrderBuy_28510 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarOrderBuy_28510)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarOrderBuy_28510 parseFrom(InputStream input) throws IOException {
         return (S2C_WarOrderBuy_28510)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarOrderBuy_28510 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarOrderBuy_28510)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarOrderBuy_28510 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarOrderBuy_28510)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarOrderBuy_28510 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarOrderBuy_28510)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarOrderBuy_28510 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarOrderBuy_28510)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarOrderBuy_28510 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarOrderBuy_28510)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarOrderBuy_28510 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarOrderBuy_28510 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarOrderBuy_28510> parser() {
         return PARSER;
      }

      public Parser<S2C_WarOrderBuy_28510> getParserForType() {
         return PARSER;
      }

      public S2C_WarOrderBuy_28510 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarOrderBuy_28510OrBuilder {
         private int bitField0_;
         private int buyType_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderBuy_28510_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderBuy_28510_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarOrderBuy_28510.class, Builder.class);
         }

         private Builder() {
            this.buyType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.buyType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.S2C_WarOrderBuy_28510.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyType_ = 1;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderBuy_28510_descriptor;
         }

         public S2C_WarOrderBuy_28510 getDefaultInstanceForType() {
            return SupremePvpMsg.S2C_WarOrderBuy_28510.getDefaultInstance();
         }

         public S2C_WarOrderBuy_28510 build() {
            S2C_WarOrderBuy_28510 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarOrderBuy_28510 buildPartial() {
            S2C_WarOrderBuy_28510 result = new S2C_WarOrderBuy_28510(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.buyType_ = this.buyType_;
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
            if (other instanceof S2C_WarOrderBuy_28510) {
               return this.mergeFrom((S2C_WarOrderBuy_28510)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarOrderBuy_28510 other) {
            if (other == SupremePvpMsg.S2C_WarOrderBuy_28510.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuyType()) {
                  this.setBuyType(other.getBuyType());
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
            if (!this.hasBuyType()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarOrderBuy_28510 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarOrderBuy_28510)SupremePvpMsg.S2C_WarOrderBuy_28510.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarOrderBuy_28510)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuyType() {
            return (this.bitField0_ & 1) != 0;
         }

         public BuyType getBuyType() {
            BuyType result = SupremePvpMsg.BuyType.valueOf(this.buyType_);
            return result == null ? SupremePvpMsg.BuyType.INTEGRAL : result;
         }

         public Builder setBuyType(BuyType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.buyType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearBuyType() {
            this.bitField0_ &= -2;
            this.buyType_ = 1;
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

   public static final class S2C_WarOrderLv_28512 extends GeneratedMessageV3 implements S2C_WarOrderLv_28512OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int WARORDERLV_FIELD_NUMBER = 1;
      private int warOrderLv_;
      private byte memoizedIsInitialized;
      private static final S2C_WarOrderLv_28512 DEFAULT_INSTANCE = new S2C_WarOrderLv_28512();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarOrderLv_28512> PARSER = new AbstractParser<S2C_WarOrderLv_28512>() {
         public S2C_WarOrderLv_28512 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarOrderLv_28512(input, extensionRegistry);
         }
      };

      private S2C_WarOrderLv_28512(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarOrderLv_28512() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarOrderLv_28512();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarOrderLv_28512(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.warOrderLv_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderLv_28512_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderLv_28512_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarOrderLv_28512.class, Builder.class);
      }

      public boolean hasWarOrderLv() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getWarOrderLv() {
         return this.warOrderLv_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasWarOrderLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.warOrderLv_);
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
               size += CodedOutputStream.computeInt32Size(1, this.warOrderLv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarOrderLv_28512)) {
            return super.equals(obj);
         } else {
            S2C_WarOrderLv_28512 other = (S2C_WarOrderLv_28512)obj;
            if (this.hasWarOrderLv() != other.hasWarOrderLv()) {
               return false;
            } else if (this.hasWarOrderLv() && this.getWarOrderLv() != other.getWarOrderLv()) {
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
            if (this.hasWarOrderLv()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getWarOrderLv();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarOrderLv_28512 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarOrderLv_28512)PARSER.parseFrom(data);
      }

      public static S2C_WarOrderLv_28512 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarOrderLv_28512)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarOrderLv_28512 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarOrderLv_28512)PARSER.parseFrom(data);
      }

      public static S2C_WarOrderLv_28512 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarOrderLv_28512)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarOrderLv_28512 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarOrderLv_28512)PARSER.parseFrom(data);
      }

      public static S2C_WarOrderLv_28512 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarOrderLv_28512)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarOrderLv_28512 parseFrom(InputStream input) throws IOException {
         return (S2C_WarOrderLv_28512)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarOrderLv_28512 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarOrderLv_28512)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarOrderLv_28512 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarOrderLv_28512)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarOrderLv_28512 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarOrderLv_28512)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarOrderLv_28512 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarOrderLv_28512)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarOrderLv_28512 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarOrderLv_28512)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarOrderLv_28512 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarOrderLv_28512 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarOrderLv_28512> parser() {
         return PARSER;
      }

      public Parser<S2C_WarOrderLv_28512> getParserForType() {
         return PARSER;
      }

      public S2C_WarOrderLv_28512 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarOrderLv_28512OrBuilder {
         private int bitField0_;
         private int warOrderLv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderLv_28512_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderLv_28512_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarOrderLv_28512.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.S2C_WarOrderLv_28512.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.warOrderLv_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderLv_28512_descriptor;
         }

         public S2C_WarOrderLv_28512 getDefaultInstanceForType() {
            return SupremePvpMsg.S2C_WarOrderLv_28512.getDefaultInstance();
         }

         public S2C_WarOrderLv_28512 build() {
            S2C_WarOrderLv_28512 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarOrderLv_28512 buildPartial() {
            S2C_WarOrderLv_28512 result = new S2C_WarOrderLv_28512(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.warOrderLv_ = this.warOrderLv_;
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
            if (other instanceof S2C_WarOrderLv_28512) {
               return this.mergeFrom((S2C_WarOrderLv_28512)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarOrderLv_28512 other) {
            if (other == SupremePvpMsg.S2C_WarOrderLv_28512.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasWarOrderLv()) {
                  this.setWarOrderLv(other.getWarOrderLv());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasWarOrderLv();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarOrderLv_28512 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarOrderLv_28512)SupremePvpMsg.S2C_WarOrderLv_28512.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarOrderLv_28512)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasWarOrderLv() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getWarOrderLv() {
            return this.warOrderLv_;
         }

         public Builder setWarOrderLv(int value) {
            this.bitField0_ |= 1;
            this.warOrderLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWarOrderLv() {
            this.bitField0_ &= -2;
            this.warOrderLv_ = 0;
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

   public static final class C2S_WarOrder_28513 extends GeneratedMessageV3 implements C2S_WarOrder_28513OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_WarOrder_28513 DEFAULT_INSTANCE = new C2S_WarOrder_28513();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarOrder_28513> PARSER = new AbstractParser<C2S_WarOrder_28513>() {
         public C2S_WarOrder_28513 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarOrder_28513(input, extensionRegistry);
         }
      };

      private C2S_WarOrder_28513(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarOrder_28513() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarOrder_28513();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarOrder_28513(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrder_28513_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrder_28513_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarOrder_28513.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WarOrder_28513)) {
            return super.equals(obj);
         } else {
            C2S_WarOrder_28513 other = (C2S_WarOrder_28513)obj;
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

      public static C2S_WarOrder_28513 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarOrder_28513)PARSER.parseFrom(data);
      }

      public static C2S_WarOrder_28513 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarOrder_28513)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarOrder_28513 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarOrder_28513)PARSER.parseFrom(data);
      }

      public static C2S_WarOrder_28513 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarOrder_28513)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarOrder_28513 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarOrder_28513)PARSER.parseFrom(data);
      }

      public static C2S_WarOrder_28513 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarOrder_28513)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarOrder_28513 parseFrom(InputStream input) throws IOException {
         return (C2S_WarOrder_28513)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarOrder_28513 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarOrder_28513)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarOrder_28513 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarOrder_28513)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarOrder_28513 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarOrder_28513)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarOrder_28513 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarOrder_28513)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarOrder_28513 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarOrder_28513)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarOrder_28513 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarOrder_28513 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarOrder_28513> parser() {
         return PARSER;
      }

      public Parser<C2S_WarOrder_28513> getParserForType() {
         return PARSER;
      }

      public C2S_WarOrder_28513 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarOrder_28513OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrder_28513_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrder_28513_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarOrder_28513.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.C2S_WarOrder_28513.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrder_28513_descriptor;
         }

         public C2S_WarOrder_28513 getDefaultInstanceForType() {
            return SupremePvpMsg.C2S_WarOrder_28513.getDefaultInstance();
         }

         public C2S_WarOrder_28513 build() {
            C2S_WarOrder_28513 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarOrder_28513 buildPartial() {
            C2S_WarOrder_28513 result = new C2S_WarOrder_28513(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_WarOrder_28513) {
               return this.mergeFrom((C2S_WarOrder_28513)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarOrder_28513 other) {
            if (other == SupremePvpMsg.C2S_WarOrder_28513.getDefaultInstance()) {
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
            C2S_WarOrder_28513 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarOrder_28513)SupremePvpMsg.C2S_WarOrder_28513.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarOrder_28513)e.getUnfinishedMessage();
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

   public static final class S2C_WarOrder_28514 extends GeneratedMessageV3 implements S2C_WarOrder_28514OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int WARORDEREND_FIELD_NUMBER = 1;
      private int warOrderEnd_;
      public static final int WARORDERLV_FIELD_NUMBER = 2;
      private int warOrderLv_;
      public static final int GOTCOMMONMAXLV_FIELD_NUMBER = 3;
      private int gotCommonMaxLv_;
      public static final int GOTSUPERMAXLV_FIELD_NUMBER = 4;
      private int gotSuperMaxLv_;
      private byte memoizedIsInitialized;
      private static final S2C_WarOrder_28514 DEFAULT_INSTANCE = new S2C_WarOrder_28514();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarOrder_28514> PARSER = new AbstractParser<S2C_WarOrder_28514>() {
         public S2C_WarOrder_28514 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarOrder_28514(input, extensionRegistry);
         }
      };

      private S2C_WarOrder_28514(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarOrder_28514() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarOrder_28514();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarOrder_28514(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.warOrderEnd_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.warOrderLv_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.gotCommonMaxLv_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.gotSuperMaxLv_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrder_28514_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrder_28514_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarOrder_28514.class, Builder.class);
      }

      public boolean hasWarOrderEnd() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getWarOrderEnd() {
         return this.warOrderEnd_;
      }

      public boolean hasWarOrderLv() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getWarOrderLv() {
         return this.warOrderLv_;
      }

      public boolean hasGotCommonMaxLv() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getGotCommonMaxLv() {
         return this.gotCommonMaxLv_;
      }

      public boolean hasGotSuperMaxLv() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getGotSuperMaxLv() {
         return this.gotSuperMaxLv_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasWarOrderEnd()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasWarOrderLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGotCommonMaxLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGotSuperMaxLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.warOrderEnd_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.warOrderLv_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.gotCommonMaxLv_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.gotSuperMaxLv_);
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
               size += CodedOutputStream.computeInt32Size(1, this.warOrderEnd_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.warOrderLv_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.gotCommonMaxLv_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.gotSuperMaxLv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarOrder_28514)) {
            return super.equals(obj);
         } else {
            S2C_WarOrder_28514 other = (S2C_WarOrder_28514)obj;
            if (this.hasWarOrderEnd() != other.hasWarOrderEnd()) {
               return false;
            } else if (this.hasWarOrderEnd() && this.getWarOrderEnd() != other.getWarOrderEnd()) {
               return false;
            } else if (this.hasWarOrderLv() != other.hasWarOrderLv()) {
               return false;
            } else if (this.hasWarOrderLv() && this.getWarOrderLv() != other.getWarOrderLv()) {
               return false;
            } else if (this.hasGotCommonMaxLv() != other.hasGotCommonMaxLv()) {
               return false;
            } else if (this.hasGotCommonMaxLv() && this.getGotCommonMaxLv() != other.getGotCommonMaxLv()) {
               return false;
            } else if (this.hasGotSuperMaxLv() != other.hasGotSuperMaxLv()) {
               return false;
            } else if (this.hasGotSuperMaxLv() && this.getGotSuperMaxLv() != other.getGotSuperMaxLv()) {
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
            if (this.hasWarOrderEnd()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getWarOrderEnd();
            }

            if (this.hasWarOrderLv()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getWarOrderLv();
            }

            if (this.hasGotCommonMaxLv()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGotCommonMaxLv();
            }

            if (this.hasGotSuperMaxLv()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getGotSuperMaxLv();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarOrder_28514 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarOrder_28514)PARSER.parseFrom(data);
      }

      public static S2C_WarOrder_28514 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarOrder_28514)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarOrder_28514 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarOrder_28514)PARSER.parseFrom(data);
      }

      public static S2C_WarOrder_28514 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarOrder_28514)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarOrder_28514 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarOrder_28514)PARSER.parseFrom(data);
      }

      public static S2C_WarOrder_28514 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarOrder_28514)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarOrder_28514 parseFrom(InputStream input) throws IOException {
         return (S2C_WarOrder_28514)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarOrder_28514 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarOrder_28514)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarOrder_28514 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarOrder_28514)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarOrder_28514 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarOrder_28514)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarOrder_28514 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarOrder_28514)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarOrder_28514 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarOrder_28514)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarOrder_28514 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarOrder_28514 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarOrder_28514> parser() {
         return PARSER;
      }

      public Parser<S2C_WarOrder_28514> getParserForType() {
         return PARSER;
      }

      public S2C_WarOrder_28514 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarOrder_28514OrBuilder {
         private int bitField0_;
         private int warOrderEnd_;
         private int warOrderLv_;
         private int gotCommonMaxLv_;
         private int gotSuperMaxLv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrder_28514_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrder_28514_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarOrder_28514.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.S2C_WarOrder_28514.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.warOrderEnd_ = 0;
            this.bitField0_ &= -2;
            this.warOrderLv_ = 0;
            this.bitField0_ &= -3;
            this.gotCommonMaxLv_ = 0;
            this.bitField0_ &= -5;
            this.gotSuperMaxLv_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrder_28514_descriptor;
         }

         public S2C_WarOrder_28514 getDefaultInstanceForType() {
            return SupremePvpMsg.S2C_WarOrder_28514.getDefaultInstance();
         }

         public S2C_WarOrder_28514 build() {
            S2C_WarOrder_28514 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarOrder_28514 buildPartial() {
            S2C_WarOrder_28514 result = new S2C_WarOrder_28514(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.warOrderEnd_ = this.warOrderEnd_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.warOrderLv_ = this.warOrderLv_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.gotCommonMaxLv_ = this.gotCommonMaxLv_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.gotSuperMaxLv_ = this.gotSuperMaxLv_;
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
            if (other instanceof S2C_WarOrder_28514) {
               return this.mergeFrom((S2C_WarOrder_28514)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarOrder_28514 other) {
            if (other == SupremePvpMsg.S2C_WarOrder_28514.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasWarOrderEnd()) {
                  this.setWarOrderEnd(other.getWarOrderEnd());
               }

               if (other.hasWarOrderLv()) {
                  this.setWarOrderLv(other.getWarOrderLv());
               }

               if (other.hasGotCommonMaxLv()) {
                  this.setGotCommonMaxLv(other.getGotCommonMaxLv());
               }

               if (other.hasGotSuperMaxLv()) {
                  this.setGotSuperMaxLv(other.getGotSuperMaxLv());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasWarOrderEnd()) {
               return false;
            } else if (!this.hasWarOrderLv()) {
               return false;
            } else if (!this.hasGotCommonMaxLv()) {
               return false;
            } else {
               return this.hasGotSuperMaxLv();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarOrder_28514 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarOrder_28514)SupremePvpMsg.S2C_WarOrder_28514.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarOrder_28514)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasWarOrderEnd() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getWarOrderEnd() {
            return this.warOrderEnd_;
         }

         public Builder setWarOrderEnd(int value) {
            this.bitField0_ |= 1;
            this.warOrderEnd_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWarOrderEnd() {
            this.bitField0_ &= -2;
            this.warOrderEnd_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasWarOrderLv() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getWarOrderLv() {
            return this.warOrderLv_;
         }

         public Builder setWarOrderLv(int value) {
            this.bitField0_ |= 2;
            this.warOrderLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWarOrderLv() {
            this.bitField0_ &= -3;
            this.warOrderLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGotCommonMaxLv() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getGotCommonMaxLv() {
            return this.gotCommonMaxLv_;
         }

         public Builder setGotCommonMaxLv(int value) {
            this.bitField0_ |= 4;
            this.gotCommonMaxLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGotCommonMaxLv() {
            this.bitField0_ &= -5;
            this.gotCommonMaxLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGotSuperMaxLv() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getGotSuperMaxLv() {
            return this.gotSuperMaxLv_;
         }

         public Builder setGotSuperMaxLv(int value) {
            this.bitField0_ |= 8;
            this.gotSuperMaxLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGotSuperMaxLv() {
            this.bitField0_ &= -9;
            this.gotSuperMaxLv_ = 0;
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

   public static final class C2S_WarOrderRewardAll_28515 extends GeneratedMessageV3 implements C2S_WarOrderRewardAll_28515OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_WarOrderRewardAll_28515 DEFAULT_INSTANCE = new C2S_WarOrderRewardAll_28515();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarOrderRewardAll_28515> PARSER = new AbstractParser<C2S_WarOrderRewardAll_28515>() {
         public C2S_WarOrderRewardAll_28515 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarOrderRewardAll_28515(input, extensionRegistry);
         }
      };

      private C2S_WarOrderRewardAll_28515(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarOrderRewardAll_28515() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarOrderRewardAll_28515();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarOrderRewardAll_28515(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrderRewardAll_28515_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrderRewardAll_28515_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarOrderRewardAll_28515.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WarOrderRewardAll_28515)) {
            return super.equals(obj);
         } else {
            C2S_WarOrderRewardAll_28515 other = (C2S_WarOrderRewardAll_28515)obj;
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

      public static C2S_WarOrderRewardAll_28515 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarOrderRewardAll_28515)PARSER.parseFrom(data);
      }

      public static C2S_WarOrderRewardAll_28515 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarOrderRewardAll_28515)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarOrderRewardAll_28515 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarOrderRewardAll_28515)PARSER.parseFrom(data);
      }

      public static C2S_WarOrderRewardAll_28515 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarOrderRewardAll_28515)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarOrderRewardAll_28515 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarOrderRewardAll_28515)PARSER.parseFrom(data);
      }

      public static C2S_WarOrderRewardAll_28515 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarOrderRewardAll_28515)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarOrderRewardAll_28515 parseFrom(InputStream input) throws IOException {
         return (C2S_WarOrderRewardAll_28515)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarOrderRewardAll_28515 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarOrderRewardAll_28515)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarOrderRewardAll_28515 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarOrderRewardAll_28515)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarOrderRewardAll_28515 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarOrderRewardAll_28515)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarOrderRewardAll_28515 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarOrderRewardAll_28515)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarOrderRewardAll_28515 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarOrderRewardAll_28515)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarOrderRewardAll_28515 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarOrderRewardAll_28515 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarOrderRewardAll_28515> parser() {
         return PARSER;
      }

      public Parser<C2S_WarOrderRewardAll_28515> getParserForType() {
         return PARSER;
      }

      public C2S_WarOrderRewardAll_28515 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarOrderRewardAll_28515OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrderRewardAll_28515_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrderRewardAll_28515_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarOrderRewardAll_28515.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.C2S_WarOrderRewardAll_28515.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_C2S_WarOrderRewardAll_28515_descriptor;
         }

         public C2S_WarOrderRewardAll_28515 getDefaultInstanceForType() {
            return SupremePvpMsg.C2S_WarOrderRewardAll_28515.getDefaultInstance();
         }

         public C2S_WarOrderRewardAll_28515 build() {
            C2S_WarOrderRewardAll_28515 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarOrderRewardAll_28515 buildPartial() {
            C2S_WarOrderRewardAll_28515 result = new C2S_WarOrderRewardAll_28515(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_WarOrderRewardAll_28515) {
               return this.mergeFrom((C2S_WarOrderRewardAll_28515)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarOrderRewardAll_28515 other) {
            if (other == SupremePvpMsg.C2S_WarOrderRewardAll_28515.getDefaultInstance()) {
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
            C2S_WarOrderRewardAll_28515 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarOrderRewardAll_28515)SupremePvpMsg.C2S_WarOrderRewardAll_28515.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarOrderRewardAll_28515)e.getUnfinishedMessage();
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

   public static final class S2C_WarOrderRewardAll_28516 extends GeneratedMessageV3 implements S2C_WarOrderRewardAll_28516OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GOTCOMMONMAXLV_FIELD_NUMBER = 1;
      private int gotCommonMaxLv_;
      public static final int GOTSUPERMAXLV_FIELD_NUMBER = 2;
      private int gotSuperMaxLv_;
      private byte memoizedIsInitialized;
      private static final S2C_WarOrderRewardAll_28516 DEFAULT_INSTANCE = new S2C_WarOrderRewardAll_28516();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarOrderRewardAll_28516> PARSER = new AbstractParser<S2C_WarOrderRewardAll_28516>() {
         public S2C_WarOrderRewardAll_28516 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarOrderRewardAll_28516(input, extensionRegistry);
         }
      };

      private S2C_WarOrderRewardAll_28516(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarOrderRewardAll_28516() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarOrderRewardAll_28516();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarOrderRewardAll_28516(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.gotCommonMaxLv_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.gotSuperMaxLv_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderRewardAll_28516_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderRewardAll_28516_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarOrderRewardAll_28516.class, Builder.class);
      }

      public boolean hasGotCommonMaxLv() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGotCommonMaxLv() {
         return this.gotCommonMaxLv_;
      }

      public boolean hasGotSuperMaxLv() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getGotSuperMaxLv() {
         return this.gotSuperMaxLv_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGotCommonMaxLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGotSuperMaxLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.gotCommonMaxLv_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.gotSuperMaxLv_);
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
               size += CodedOutputStream.computeInt32Size(1, this.gotCommonMaxLv_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.gotSuperMaxLv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarOrderRewardAll_28516)) {
            return super.equals(obj);
         } else {
            S2C_WarOrderRewardAll_28516 other = (S2C_WarOrderRewardAll_28516)obj;
            if (this.hasGotCommonMaxLv() != other.hasGotCommonMaxLv()) {
               return false;
            } else if (this.hasGotCommonMaxLv() && this.getGotCommonMaxLv() != other.getGotCommonMaxLv()) {
               return false;
            } else if (this.hasGotSuperMaxLv() != other.hasGotSuperMaxLv()) {
               return false;
            } else if (this.hasGotSuperMaxLv() && this.getGotSuperMaxLv() != other.getGotSuperMaxLv()) {
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
            if (this.hasGotCommonMaxLv()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGotCommonMaxLv();
            }

            if (this.hasGotSuperMaxLv()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGotSuperMaxLv();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarOrderRewardAll_28516 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarOrderRewardAll_28516)PARSER.parseFrom(data);
      }

      public static S2C_WarOrderRewardAll_28516 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarOrderRewardAll_28516)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarOrderRewardAll_28516 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarOrderRewardAll_28516)PARSER.parseFrom(data);
      }

      public static S2C_WarOrderRewardAll_28516 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarOrderRewardAll_28516)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarOrderRewardAll_28516 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarOrderRewardAll_28516)PARSER.parseFrom(data);
      }

      public static S2C_WarOrderRewardAll_28516 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarOrderRewardAll_28516)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarOrderRewardAll_28516 parseFrom(InputStream input) throws IOException {
         return (S2C_WarOrderRewardAll_28516)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarOrderRewardAll_28516 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarOrderRewardAll_28516)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarOrderRewardAll_28516 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarOrderRewardAll_28516)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarOrderRewardAll_28516 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarOrderRewardAll_28516)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarOrderRewardAll_28516 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarOrderRewardAll_28516)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarOrderRewardAll_28516 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarOrderRewardAll_28516)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarOrderRewardAll_28516 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarOrderRewardAll_28516 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarOrderRewardAll_28516> parser() {
         return PARSER;
      }

      public Parser<S2C_WarOrderRewardAll_28516> getParserForType() {
         return PARSER;
      }

      public S2C_WarOrderRewardAll_28516 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarOrderRewardAll_28516OrBuilder {
         private int bitField0_;
         private int gotCommonMaxLv_;
         private int gotSuperMaxLv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderRewardAll_28516_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderRewardAll_28516_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarOrderRewardAll_28516.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.S2C_WarOrderRewardAll_28516.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.gotCommonMaxLv_ = 0;
            this.bitField0_ &= -2;
            this.gotSuperMaxLv_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_WarOrderRewardAll_28516_descriptor;
         }

         public S2C_WarOrderRewardAll_28516 getDefaultInstanceForType() {
            return SupremePvpMsg.S2C_WarOrderRewardAll_28516.getDefaultInstance();
         }

         public S2C_WarOrderRewardAll_28516 build() {
            S2C_WarOrderRewardAll_28516 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarOrderRewardAll_28516 buildPartial() {
            S2C_WarOrderRewardAll_28516 result = new S2C_WarOrderRewardAll_28516(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.gotCommonMaxLv_ = this.gotCommonMaxLv_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.gotSuperMaxLv_ = this.gotSuperMaxLv_;
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
            if (other instanceof S2C_WarOrderRewardAll_28516) {
               return this.mergeFrom((S2C_WarOrderRewardAll_28516)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarOrderRewardAll_28516 other) {
            if (other == SupremePvpMsg.S2C_WarOrderRewardAll_28516.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGotCommonMaxLv()) {
                  this.setGotCommonMaxLv(other.getGotCommonMaxLv());
               }

               if (other.hasGotSuperMaxLv()) {
                  this.setGotSuperMaxLv(other.getGotSuperMaxLv());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGotCommonMaxLv()) {
               return false;
            } else {
               return this.hasGotSuperMaxLv();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarOrderRewardAll_28516 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarOrderRewardAll_28516)SupremePvpMsg.S2C_WarOrderRewardAll_28516.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarOrderRewardAll_28516)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGotCommonMaxLv() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGotCommonMaxLv() {
            return this.gotCommonMaxLv_;
         }

         public Builder setGotCommonMaxLv(int value) {
            this.bitField0_ |= 1;
            this.gotCommonMaxLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGotCommonMaxLv() {
            this.bitField0_ &= -2;
            this.gotCommonMaxLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGotSuperMaxLv() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getGotSuperMaxLv() {
            return this.gotSuperMaxLv_;
         }

         public Builder setGotSuperMaxLv(int value) {
            this.bitField0_ |= 2;
            this.gotSuperMaxLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGotSuperMaxLv() {
            this.bitField0_ &= -3;
            this.gotSuperMaxLv_ = 0;
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

   public static final class S2C_SeasonSettle_28518 extends GeneratedMessageV3 implements S2C_SeasonSettle_28518OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PREGRADE_FIELD_NUMBER = 1;
      private int preGrade_;
      public static final int PRESCORE_FIELD_NUMBER = 2;
      private int preScore_;
      public static final int PRERANK_FIELD_NUMBER = 3;
      private int preRank_;
      public static final int GRADE_FIELD_NUMBER = 4;
      private int grade_;
      private byte memoizedIsInitialized;
      private static final S2C_SeasonSettle_28518 DEFAULT_INSTANCE = new S2C_SeasonSettle_28518();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SeasonSettle_28518> PARSER = new AbstractParser<S2C_SeasonSettle_28518>() {
         public S2C_SeasonSettle_28518 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SeasonSettle_28518(input, extensionRegistry);
         }
      };

      private S2C_SeasonSettle_28518(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SeasonSettle_28518() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SeasonSettle_28518();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SeasonSettle_28518(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.preGrade_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.preScore_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.preRank_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.grade_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_SeasonSettle_28518_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_SeasonSettle_28518_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SeasonSettle_28518.class, Builder.class);
      }

      public boolean hasPreGrade() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPreGrade() {
         return this.preGrade_;
      }

      public boolean hasPreScore() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPreScore() {
         return this.preScore_;
      }

      public boolean hasPreRank() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPreRank() {
         return this.preRank_;
      }

      public boolean hasGrade() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getGrade() {
         return this.grade_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPreGrade()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPreScore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPreRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGrade()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.preGrade_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.preScore_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.preRank_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.grade_);
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
               size += CodedOutputStream.computeInt32Size(1, this.preGrade_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.preScore_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.preRank_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.grade_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SeasonSettle_28518)) {
            return super.equals(obj);
         } else {
            S2C_SeasonSettle_28518 other = (S2C_SeasonSettle_28518)obj;
            if (this.hasPreGrade() != other.hasPreGrade()) {
               return false;
            } else if (this.hasPreGrade() && this.getPreGrade() != other.getPreGrade()) {
               return false;
            } else if (this.hasPreScore() != other.hasPreScore()) {
               return false;
            } else if (this.hasPreScore() && this.getPreScore() != other.getPreScore()) {
               return false;
            } else if (this.hasPreRank() != other.hasPreRank()) {
               return false;
            } else if (this.hasPreRank() && this.getPreRank() != other.getPreRank()) {
               return false;
            } else if (this.hasGrade() != other.hasGrade()) {
               return false;
            } else if (this.hasGrade() && this.getGrade() != other.getGrade()) {
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
            if (this.hasPreGrade()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPreGrade();
            }

            if (this.hasPreScore()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPreScore();
            }

            if (this.hasPreRank()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPreRank();
            }

            if (this.hasGrade()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getGrade();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SeasonSettle_28518 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SeasonSettle_28518)PARSER.parseFrom(data);
      }

      public static S2C_SeasonSettle_28518 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SeasonSettle_28518)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SeasonSettle_28518 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SeasonSettle_28518)PARSER.parseFrom(data);
      }

      public static S2C_SeasonSettle_28518 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SeasonSettle_28518)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SeasonSettle_28518 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SeasonSettle_28518)PARSER.parseFrom(data);
      }

      public static S2C_SeasonSettle_28518 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SeasonSettle_28518)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SeasonSettle_28518 parseFrom(InputStream input) throws IOException {
         return (S2C_SeasonSettle_28518)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SeasonSettle_28518 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SeasonSettle_28518)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SeasonSettle_28518 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SeasonSettle_28518)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SeasonSettle_28518 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SeasonSettle_28518)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SeasonSettle_28518 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SeasonSettle_28518)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SeasonSettle_28518 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SeasonSettle_28518)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SeasonSettle_28518 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SeasonSettle_28518 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SeasonSettle_28518> parser() {
         return PARSER;
      }

      public Parser<S2C_SeasonSettle_28518> getParserForType() {
         return PARSER;
      }

      public S2C_SeasonSettle_28518 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SeasonSettle_28518OrBuilder {
         private int bitField0_;
         private int preGrade_;
         private int preScore_;
         private int preRank_;
         private int grade_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_SeasonSettle_28518_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_SeasonSettle_28518_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SeasonSettle_28518.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.S2C_SeasonSettle_28518.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.preGrade_ = 0;
            this.bitField0_ &= -2;
            this.preScore_ = 0;
            this.bitField0_ &= -3;
            this.preRank_ = 0;
            this.bitField0_ &= -5;
            this.grade_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_SeasonSettle_28518_descriptor;
         }

         public S2C_SeasonSettle_28518 getDefaultInstanceForType() {
            return SupremePvpMsg.S2C_SeasonSettle_28518.getDefaultInstance();
         }

         public S2C_SeasonSettle_28518 build() {
            S2C_SeasonSettle_28518 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SeasonSettle_28518 buildPartial() {
            S2C_SeasonSettle_28518 result = new S2C_SeasonSettle_28518(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.preGrade_ = this.preGrade_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.preScore_ = this.preScore_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.preRank_ = this.preRank_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.grade_ = this.grade_;
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
            if (other instanceof S2C_SeasonSettle_28518) {
               return this.mergeFrom((S2C_SeasonSettle_28518)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SeasonSettle_28518 other) {
            if (other == SupremePvpMsg.S2C_SeasonSettle_28518.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPreGrade()) {
                  this.setPreGrade(other.getPreGrade());
               }

               if (other.hasPreScore()) {
                  this.setPreScore(other.getPreScore());
               }

               if (other.hasPreRank()) {
                  this.setPreRank(other.getPreRank());
               }

               if (other.hasGrade()) {
                  this.setGrade(other.getGrade());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPreGrade()) {
               return false;
            } else if (!this.hasPreScore()) {
               return false;
            } else if (!this.hasPreRank()) {
               return false;
            } else {
               return this.hasGrade();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SeasonSettle_28518 parsedMessage = null;

            try {
               parsedMessage = (S2C_SeasonSettle_28518)SupremePvpMsg.S2C_SeasonSettle_28518.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SeasonSettle_28518)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPreGrade() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPreGrade() {
            return this.preGrade_;
         }

         public Builder setPreGrade(int value) {
            this.bitField0_ |= 1;
            this.preGrade_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPreGrade() {
            this.bitField0_ &= -2;
            this.preGrade_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPreScore() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPreScore() {
            return this.preScore_;
         }

         public Builder setPreScore(int value) {
            this.bitField0_ |= 2;
            this.preScore_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPreScore() {
            this.bitField0_ &= -3;
            this.preScore_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPreRank() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getPreRank() {
            return this.preRank_;
         }

         public Builder setPreRank(int value) {
            this.bitField0_ |= 4;
            this.preRank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPreRank() {
            this.bitField0_ &= -5;
            this.preRank_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGrade() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getGrade() {
            return this.grade_;
         }

         public Builder setGrade(int value) {
            this.bitField0_ |= 8;
            this.grade_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGrade() {
            this.bitField0_ &= -9;
            this.grade_ = 0;
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

   public static final class S2C_CloseUi_28520 extends GeneratedMessageV3 implements S2C_CloseUi_28520OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_CloseUi_28520 DEFAULT_INSTANCE = new S2C_CloseUi_28520();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CloseUi_28520> PARSER = new AbstractParser<S2C_CloseUi_28520>() {
         public S2C_CloseUi_28520 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CloseUi_28520(input, extensionRegistry);
         }
      };

      private S2C_CloseUi_28520(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CloseUi_28520() {
         this.memoizedIsInitialized = -1;
         this.result_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CloseUi_28520();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CloseUi_28520(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CloseUiResult value = SupremePvpMsg.CloseUiResult.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.result_ = rawValue;
                        }
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_CloseUi_28520_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_CloseUi_28520_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CloseUi_28520.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public CloseUiResult getResult() {
         CloseUiResult result = SupremePvpMsg.CloseUiResult.valueOf(this.result_);
         return result == null ? SupremePvpMsg.CloseUiResult.CROSS_DISCONNECT : result;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.result_);
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
               size += CodedOutputStream.computeEnumSize(1, this.result_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CloseUi_28520)) {
            return super.equals(obj);
         } else {
            S2C_CloseUi_28520 other = (S2C_CloseUi_28520)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.result_ != other.result_) {
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
               hash = 53 * hash + this.result_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CloseUi_28520 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CloseUi_28520)PARSER.parseFrom(data);
      }

      public static S2C_CloseUi_28520 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CloseUi_28520)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CloseUi_28520 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CloseUi_28520)PARSER.parseFrom(data);
      }

      public static S2C_CloseUi_28520 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CloseUi_28520)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CloseUi_28520 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CloseUi_28520)PARSER.parseFrom(data);
      }

      public static S2C_CloseUi_28520 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CloseUi_28520)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CloseUi_28520 parseFrom(InputStream input) throws IOException {
         return (S2C_CloseUi_28520)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CloseUi_28520 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CloseUi_28520)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CloseUi_28520 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CloseUi_28520)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CloseUi_28520 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CloseUi_28520)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CloseUi_28520 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CloseUi_28520)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CloseUi_28520 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CloseUi_28520)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CloseUi_28520 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CloseUi_28520 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CloseUi_28520> parser() {
         return PARSER;
      }

      public Parser<S2C_CloseUi_28520> getParserForType() {
         return PARSER;
      }

      public S2C_CloseUi_28520 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CloseUi_28520OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_CloseUi_28520_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_CloseUi_28520_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CloseUi_28520.class, Builder.class);
         }

         private Builder() {
            this.result_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.result_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.S2C_CloseUi_28520.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 1;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2C_CloseUi_28520_descriptor;
         }

         public S2C_CloseUi_28520 getDefaultInstanceForType() {
            return SupremePvpMsg.S2C_CloseUi_28520.getDefaultInstance();
         }

         public S2C_CloseUi_28520 build() {
            S2C_CloseUi_28520 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CloseUi_28520 buildPartial() {
            S2C_CloseUi_28520 result = new S2C_CloseUi_28520(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.result_ = this.result_;
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
            if (other instanceof S2C_CloseUi_28520) {
               return this.mergeFrom((S2C_CloseUi_28520)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CloseUi_28520 other) {
            if (other == SupremePvpMsg.S2C_CloseUi_28520.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasResult();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CloseUi_28520 parsedMessage = null;

            try {
               parsedMessage = (S2C_CloseUi_28520)SupremePvpMsg.S2C_CloseUi_28520.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CloseUi_28520)e.getUnfinishedMessage();
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

         public CloseUiResult getResult() {
            CloseUiResult result = SupremePvpMsg.CloseUiResult.valueOf(this.result_);
            return result == null ? SupremePvpMsg.CloseUiResult.CROSS_DISCONNECT : result;
         }

         public Builder setResult(CloseUiResult value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.result_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearResult() {
            this.bitField0_ &= -2;
            this.result_ = 1;
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

   public static final class S2CR_CrossFight_28531 extends GeneratedMessageV3 implements S2CR_CrossFight_28531OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int ISSKIP_FIELD_NUMBER = 2;
      private boolean isSkip_;
      public static final int ATKARRAY_FIELD_NUMBER = 3;
      private ByteString atkArray_;
      private byte memoizedIsInitialized;
      private static final S2CR_CrossFight_28531 DEFAULT_INSTANCE = new S2CR_CrossFight_28531();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_CrossFight_28531> PARSER = new AbstractParser<S2CR_CrossFight_28531>() {
         public S2CR_CrossFight_28531 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_CrossFight_28531(input, extensionRegistry);
         }
      };

      private S2CR_CrossFight_28531(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_CrossFight_28531() {
         this.memoizedIsInitialized = -1;
         this.atkArray_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_CrossFight_28531();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_CrossFight_28531(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.isSkip_ = input.readBool();
                        break;
                     case 26:
                        this.bitField0_ |= 4;
                        this.atkArray_ = input.readBytes();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_CrossFight_28531_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_CrossFight_28531_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_CrossFight_28531.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasIsSkip() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsSkip() {
         return this.isSkip_;
      }

      public boolean hasAtkArray() {
         return (this.bitField0_ & 4) != 0;
      }

      public ByteString getAtkArray() {
         return this.atkArray_;
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
         } else if (!this.hasIsSkip()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAtkArray()) {
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
            output.writeBool(2, this.isSkip_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBytes(3, this.atkArray_);
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
               size += CodedOutputStream.computeBoolSize(2, this.isSkip_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBytesSize(3, this.atkArray_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_CrossFight_28531)) {
            return super.equals(obj);
         } else {
            S2CR_CrossFight_28531 other = (S2CR_CrossFight_28531)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasIsSkip() != other.hasIsSkip()) {
               return false;
            } else if (this.hasIsSkip() && this.getIsSkip() != other.getIsSkip()) {
               return false;
            } else if (this.hasAtkArray() != other.hasAtkArray()) {
               return false;
            } else if (this.hasAtkArray() && !this.getAtkArray().equals(other.getAtkArray())) {
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

            if (this.hasIsSkip()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsSkip());
            }

            if (this.hasAtkArray()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getAtkArray().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_CrossFight_28531 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_CrossFight_28531)PARSER.parseFrom(data);
      }

      public static S2CR_CrossFight_28531 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CrossFight_28531)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CrossFight_28531 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_CrossFight_28531)PARSER.parseFrom(data);
      }

      public static S2CR_CrossFight_28531 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CrossFight_28531)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CrossFight_28531 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_CrossFight_28531)PARSER.parseFrom(data);
      }

      public static S2CR_CrossFight_28531 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CrossFight_28531)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CrossFight_28531 parseFrom(InputStream input) throws IOException {
         return (S2CR_CrossFight_28531)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_CrossFight_28531 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CrossFight_28531)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_CrossFight_28531 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_CrossFight_28531)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_CrossFight_28531 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CrossFight_28531)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_CrossFight_28531 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_CrossFight_28531)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_CrossFight_28531 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CrossFight_28531)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_CrossFight_28531 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_CrossFight_28531 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_CrossFight_28531> parser() {
         return PARSER;
      }

      public Parser<S2CR_CrossFight_28531> getParserForType() {
         return PARSER;
      }

      public S2CR_CrossFight_28531 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_CrossFight_28531OrBuilder {
         private int bitField0_;
         private int playerId_;
         private boolean isSkip_;
         private ByteString atkArray_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_CrossFight_28531_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_CrossFight_28531_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_CrossFight_28531.class, Builder.class);
         }

         private Builder() {
            this.atkArray_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.atkArray_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.S2CR_CrossFight_28531.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.isSkip_ = false;
            this.bitField0_ &= -3;
            this.atkArray_ = ByteString.EMPTY;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_CrossFight_28531_descriptor;
         }

         public S2CR_CrossFight_28531 getDefaultInstanceForType() {
            return SupremePvpMsg.S2CR_CrossFight_28531.getDefaultInstance();
         }

         public S2CR_CrossFight_28531 build() {
            S2CR_CrossFight_28531 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_CrossFight_28531 buildPartial() {
            S2CR_CrossFight_28531 result = new S2CR_CrossFight_28531(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isSkip_ = this.isSkip_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.atkArray_ = this.atkArray_;
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
            if (other instanceof S2CR_CrossFight_28531) {
               return this.mergeFrom((S2CR_CrossFight_28531)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_CrossFight_28531 other) {
            if (other == SupremePvpMsg.S2CR_CrossFight_28531.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasIsSkip()) {
                  this.setIsSkip(other.getIsSkip());
               }

               if (other.hasAtkArray()) {
                  this.setAtkArray(other.getAtkArray());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasIsSkip()) {
               return false;
            } else {
               return this.hasAtkArray();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_CrossFight_28531 parsedMessage = null;

            try {
               parsedMessage = (S2CR_CrossFight_28531)SupremePvpMsg.S2CR_CrossFight_28531.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_CrossFight_28531)e.getUnfinishedMessage();
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

         public boolean hasIsSkip() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsSkip() {
            return this.isSkip_;
         }

         public Builder setIsSkip(boolean value) {
            this.bitField0_ |= 2;
            this.isSkip_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsSkip() {
            this.bitField0_ &= -3;
            this.isSkip_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasAtkArray() {
            return (this.bitField0_ & 4) != 0;
         }

         public ByteString getAtkArray() {
            return this.atkArray_;
         }

         public Builder setAtkArray(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.atkArray_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearAtkArray() {
            this.bitField0_ &= -5;
            this.atkArray_ = SupremePvpMsg.S2CR_CrossFight_28531.getDefaultInstance().getAtkArray();
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

   public static final class CR2S_CrossFight_28532 extends GeneratedMessageV3 implements CR2S_CrossFight_28532OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BATTLEMSG_FIELD_NUMBER = 1;
      private BattleMsg.S2C_BattleResult_6102 battleMsg_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int BEFORESCORE_FIELD_NUMBER = 3;
      private int beforeScore_;
      public static final int AFTERSCORE_FIELD_NUMBER = 4;
      private int afterScore_;
      private byte memoizedIsInitialized;
      private static final CR2S_CrossFight_28532 DEFAULT_INSTANCE = new CR2S_CrossFight_28532();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_CrossFight_28532> PARSER = new AbstractParser<CR2S_CrossFight_28532>() {
         public CR2S_CrossFight_28532 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_CrossFight_28532(input, extensionRegistry);
         }
      };

      private CR2S_CrossFight_28532(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_CrossFight_28532() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_CrossFight_28532();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_CrossFight_28532(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.battleMsg_.toBuilder();
                        }

                        this.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.battleMsg_);
                           this.battleMsg_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.playerId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.beforeScore_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.afterScore_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_CrossFight_28532_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_CrossFight_28532_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_CrossFight_28532.class, Builder.class);
      }

      public boolean hasBattleMsg() {
         return (this.bitField0_ & 1) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getBattleMsg() {
         return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder() {
         return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasBeforeScore() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getBeforeScore() {
         return this.beforeScore_;
      }

      public boolean hasAfterScore() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getAfterScore() {
         return this.afterScore_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBattleMsg()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBeforeScore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAfterScore()) {
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
            output.writeMessage(1, this.getBattleMsg());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.beforeScore_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.afterScore_);
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
               size += CodedOutputStream.computeMessageSize(1, this.getBattleMsg());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.beforeScore_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.afterScore_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_CrossFight_28532)) {
            return super.equals(obj);
         } else {
            CR2S_CrossFight_28532 other = (CR2S_CrossFight_28532)obj;
            if (this.hasBattleMsg() != other.hasBattleMsg()) {
               return false;
            } else if (this.hasBattleMsg() && !this.getBattleMsg().equals(other.getBattleMsg())) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasBeforeScore() != other.hasBeforeScore()) {
               return false;
            } else if (this.hasBeforeScore() && this.getBeforeScore() != other.getBeforeScore()) {
               return false;
            } else if (this.hasAfterScore() != other.hasAfterScore()) {
               return false;
            } else if (this.hasAfterScore() && this.getAfterScore() != other.getAfterScore()) {
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
            if (this.hasBattleMsg()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBattleMsg().hashCode();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasBeforeScore()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBeforeScore();
            }

            if (this.hasAfterScore()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getAfterScore();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_CrossFight_28532 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_CrossFight_28532)PARSER.parseFrom(data);
      }

      public static CR2S_CrossFight_28532 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_CrossFight_28532)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_CrossFight_28532 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_CrossFight_28532)PARSER.parseFrom(data);
      }

      public static CR2S_CrossFight_28532 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_CrossFight_28532)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_CrossFight_28532 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_CrossFight_28532)PARSER.parseFrom(data);
      }

      public static CR2S_CrossFight_28532 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_CrossFight_28532)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_CrossFight_28532 parseFrom(InputStream input) throws IOException {
         return (CR2S_CrossFight_28532)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_CrossFight_28532 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_CrossFight_28532)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_CrossFight_28532 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_CrossFight_28532)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_CrossFight_28532 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_CrossFight_28532)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_CrossFight_28532 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_CrossFight_28532)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_CrossFight_28532 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_CrossFight_28532)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_CrossFight_28532 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_CrossFight_28532 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_CrossFight_28532> parser() {
         return PARSER;
      }

      public Parser<CR2S_CrossFight_28532> getParserForType() {
         return PARSER;
      }

      public CR2S_CrossFight_28532 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_CrossFight_28532OrBuilder {
         private int bitField0_;
         private BattleMsg.S2C_BattleResult_6102 battleMsg_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> battleMsgBuilder_;
         private int playerId_;
         private int beforeScore_;
         private int afterScore_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_CrossFight_28532_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_CrossFight_28532_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_CrossFight_28532.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.CR2S_CrossFight_28532.alwaysUseFieldBuilders) {
               this.getBattleMsgFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.beforeScore_ = 0;
            this.bitField0_ &= -5;
            this.afterScore_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_CrossFight_28532_descriptor;
         }

         public CR2S_CrossFight_28532 getDefaultInstanceForType() {
            return SupremePvpMsg.CR2S_CrossFight_28532.getDefaultInstance();
         }

         public CR2S_CrossFight_28532 build() {
            CR2S_CrossFight_28532 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_CrossFight_28532 buildPartial() {
            CR2S_CrossFight_28532 result = new CR2S_CrossFight_28532(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.battleMsgBuilder_ == null) {
                  result.battleMsg_ = this.battleMsg_;
               } else {
                  result.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)this.battleMsgBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.beforeScore_ = this.beforeScore_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.afterScore_ = this.afterScore_;
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
            if (other instanceof CR2S_CrossFight_28532) {
               return this.mergeFrom((CR2S_CrossFight_28532)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_CrossFight_28532 other) {
            if (other == SupremePvpMsg.CR2S_CrossFight_28532.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBattleMsg()) {
                  this.mergeBattleMsg(other.getBattleMsg());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasBeforeScore()) {
                  this.setBeforeScore(other.getBeforeScore());
               }

               if (other.hasAfterScore()) {
                  this.setAfterScore(other.getAfterScore());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBattleMsg()) {
               return false;
            } else if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasBeforeScore()) {
               return false;
            } else if (!this.hasAfterScore()) {
               return false;
            } else {
               return this.getBattleMsg().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_CrossFight_28532 parsedMessage = null;

            try {
               parsedMessage = (CR2S_CrossFight_28532)SupremePvpMsg.CR2S_CrossFight_28532.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_CrossFight_28532)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBattleMsg() {
            return (this.bitField0_ & 1) != 0;
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

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setBattleMsg(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = builderForValue.build();
               this.onChanged();
            } else {
               this.battleMsgBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeBattleMsg(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleMsgBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.battleMsg_ != null && this.battleMsg_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.battleMsg_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.battleMsg_).mergeFrom(value).buildPartial();
               } else {
                  this.battleMsg_ = value;
               }

               this.onChanged();
            } else {
               this.battleMsgBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearBattleMsg() {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
               this.onChanged();
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getBattleMsgBuilder() {
            this.bitField0_ |= 1;
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

         public boolean hasBeforeScore() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBeforeScore() {
            return this.beforeScore_;
         }

         public Builder setBeforeScore(int value) {
            this.bitField0_ |= 4;
            this.beforeScore_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeforeScore() {
            this.bitField0_ &= -5;
            this.beforeScore_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAfterScore() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getAfterScore() {
            return this.afterScore_;
         }

         public Builder setAfterScore(int value) {
            this.bitField0_ |= 8;
            this.afterScore_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAfterScore() {
            this.bitField0_ &= -9;
            this.afterScore_ = 0;
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

   public static final class S2CR_UpdateDefArray_28533 extends GeneratedMessageV3 implements S2CR_UpdateDefArray_28533OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DEFARRAY_FIELD_NUMBER = 1;
      private ByteString defArray_;
      public static final int DEFPOWER_FIELD_NUMBER = 2;
      private long defPower_;
      private byte memoizedIsInitialized;
      private static final S2CR_UpdateDefArray_28533 DEFAULT_INSTANCE = new S2CR_UpdateDefArray_28533();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UpdateDefArray_28533> PARSER = new AbstractParser<S2CR_UpdateDefArray_28533>() {
         public S2CR_UpdateDefArray_28533 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UpdateDefArray_28533(input, extensionRegistry);
         }
      };

      private S2CR_UpdateDefArray_28533(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UpdateDefArray_28533() {
         this.memoizedIsInitialized = -1;
         this.defArray_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UpdateDefArray_28533();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UpdateDefArray_28533(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.defArray_ = input.readBytes();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.defPower_ = input.readInt64();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_UpdateDefArray_28533_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_UpdateDefArray_28533_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UpdateDefArray_28533.class, Builder.class);
      }

      public boolean hasDefArray() {
         return (this.bitField0_ & 1) != 0;
      }

      public ByteString getDefArray() {
         return this.defArray_;
      }

      public boolean hasDefPower() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getDefPower() {
         return this.defPower_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDefArray()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDefPower()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBytes(1, this.defArray_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.defPower_);
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
               size += CodedOutputStream.computeBytesSize(1, this.defArray_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(2, this.defPower_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UpdateDefArray_28533)) {
            return super.equals(obj);
         } else {
            S2CR_UpdateDefArray_28533 other = (S2CR_UpdateDefArray_28533)obj;
            if (this.hasDefArray() != other.hasDefArray()) {
               return false;
            } else if (this.hasDefArray() && !this.getDefArray().equals(other.getDefArray())) {
               return false;
            } else if (this.hasDefPower() != other.hasDefPower()) {
               return false;
            } else if (this.hasDefPower() && this.getDefPower() != other.getDefPower()) {
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
            if (this.hasDefArray()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDefArray().hashCode();
            }

            if (this.hasDefPower()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getDefPower());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UpdateDefArray_28533 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UpdateDefArray_28533)PARSER.parseFrom(data);
      }

      public static S2CR_UpdateDefArray_28533 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UpdateDefArray_28533)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UpdateDefArray_28533 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UpdateDefArray_28533)PARSER.parseFrom(data);
      }

      public static S2CR_UpdateDefArray_28533 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UpdateDefArray_28533)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UpdateDefArray_28533 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UpdateDefArray_28533)PARSER.parseFrom(data);
      }

      public static S2CR_UpdateDefArray_28533 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UpdateDefArray_28533)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UpdateDefArray_28533 parseFrom(InputStream input) throws IOException {
         return (S2CR_UpdateDefArray_28533)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UpdateDefArray_28533 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UpdateDefArray_28533)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UpdateDefArray_28533 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UpdateDefArray_28533)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UpdateDefArray_28533 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UpdateDefArray_28533)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UpdateDefArray_28533 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UpdateDefArray_28533)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UpdateDefArray_28533 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UpdateDefArray_28533)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UpdateDefArray_28533 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UpdateDefArray_28533 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UpdateDefArray_28533> parser() {
         return PARSER;
      }

      public Parser<S2CR_UpdateDefArray_28533> getParserForType() {
         return PARSER;
      }

      public S2CR_UpdateDefArray_28533 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UpdateDefArray_28533OrBuilder {
         private int bitField0_;
         private ByteString defArray_;
         private long defPower_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_UpdateDefArray_28533_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_UpdateDefArray_28533_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UpdateDefArray_28533.class, Builder.class);
         }

         private Builder() {
            this.defArray_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.defArray_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.S2CR_UpdateDefArray_28533.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.defArray_ = ByteString.EMPTY;
            this.bitField0_ &= -2;
            this.defPower_ = 0L;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_UpdateDefArray_28533_descriptor;
         }

         public S2CR_UpdateDefArray_28533 getDefaultInstanceForType() {
            return SupremePvpMsg.S2CR_UpdateDefArray_28533.getDefaultInstance();
         }

         public S2CR_UpdateDefArray_28533 build() {
            S2CR_UpdateDefArray_28533 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UpdateDefArray_28533 buildPartial() {
            S2CR_UpdateDefArray_28533 result = new S2CR_UpdateDefArray_28533(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.defArray_ = this.defArray_;
            if ((from_bitField0_ & 2) != 0) {
               result.defPower_ = this.defPower_;
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
            if (other instanceof S2CR_UpdateDefArray_28533) {
               return this.mergeFrom((S2CR_UpdateDefArray_28533)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UpdateDefArray_28533 other) {
            if (other == SupremePvpMsg.S2CR_UpdateDefArray_28533.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDefArray()) {
                  this.setDefArray(other.getDefArray());
               }

               if (other.hasDefPower()) {
                  this.setDefPower(other.getDefPower());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDefArray()) {
               return false;
            } else {
               return this.hasDefPower();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UpdateDefArray_28533 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UpdateDefArray_28533)SupremePvpMsg.S2CR_UpdateDefArray_28533.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UpdateDefArray_28533)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDefArray() {
            return (this.bitField0_ & 1) != 0;
         }

         public ByteString getDefArray() {
            return this.defArray_;
         }

         public Builder setDefArray(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.defArray_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearDefArray() {
            this.bitField0_ &= -2;
            this.defArray_ = SupremePvpMsg.S2CR_UpdateDefArray_28533.getDefaultInstance().getDefArray();
            this.onChanged();
            return this;
         }

         public boolean hasDefPower() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getDefPower() {
            return this.defPower_;
         }

         public Builder setDefPower(long value) {
            this.bitField0_ |= 2;
            this.defPower_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDefPower() {
            this.bitField0_ &= -3;
            this.defPower_ = 0L;
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

   public static final class CR2S_UpdateDefArray_28534 extends GeneratedMessageV3 implements CR2S_UpdateDefArray_28534OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private Internal.IntList playerId_;
      private byte memoizedIsInitialized;
      private static final CR2S_UpdateDefArray_28534 DEFAULT_INSTANCE = new CR2S_UpdateDefArray_28534();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UpdateDefArray_28534> PARSER = new AbstractParser<CR2S_UpdateDefArray_28534>() {
         public CR2S_UpdateDefArray_28534 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UpdateDefArray_28534(input, extensionRegistry);
         }
      };

      private CR2S_UpdateDefArray_28534(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UpdateDefArray_28534() {
         this.memoizedIsInitialized = -1;
         this.playerId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UpdateDefArray_28534();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UpdateDefArray_28534(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_UpdateDefArray_28534_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_UpdateDefArray_28534_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpdateDefArray_28534.class, Builder.class);
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
         } else if (!(obj instanceof CR2S_UpdateDefArray_28534)) {
            return super.equals(obj);
         } else {
            CR2S_UpdateDefArray_28534 other = (CR2S_UpdateDefArray_28534)obj;
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

      public static CR2S_UpdateDefArray_28534 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateDefArray_28534)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateDefArray_28534 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateDefArray_28534)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateDefArray_28534 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateDefArray_28534)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateDefArray_28534 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateDefArray_28534)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateDefArray_28534 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateDefArray_28534)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateDefArray_28534 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateDefArray_28534)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateDefArray_28534 parseFrom(InputStream input) throws IOException {
         return (CR2S_UpdateDefArray_28534)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpdateDefArray_28534 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateDefArray_28534)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpdateDefArray_28534 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UpdateDefArray_28534)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UpdateDefArray_28534 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateDefArray_28534)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpdateDefArray_28534 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UpdateDefArray_28534)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpdateDefArray_28534 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateDefArray_28534)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UpdateDefArray_28534 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UpdateDefArray_28534 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UpdateDefArray_28534> parser() {
         return PARSER;
      }

      public Parser<CR2S_UpdateDefArray_28534> getParserForType() {
         return PARSER;
      }

      public CR2S_UpdateDefArray_28534 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UpdateDefArray_28534OrBuilder {
         private int bitField0_;
         private Internal.IntList playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_UpdateDefArray_28534_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_UpdateDefArray_28534_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpdateDefArray_28534.class, Builder.class);
         }

         private Builder() {
            this.playerId_ = SupremePvpMsg.CR2S_UpdateDefArray_28534.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerId_ = SupremePvpMsg.CR2S_UpdateDefArray_28534.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.CR2S_UpdateDefArray_28534.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = SupremePvpMsg.CR2S_UpdateDefArray_28534.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_UpdateDefArray_28534_descriptor;
         }

         public CR2S_UpdateDefArray_28534 getDefaultInstanceForType() {
            return SupremePvpMsg.CR2S_UpdateDefArray_28534.getDefaultInstance();
         }

         public CR2S_UpdateDefArray_28534 build() {
            CR2S_UpdateDefArray_28534 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UpdateDefArray_28534 buildPartial() {
            CR2S_UpdateDefArray_28534 result = new CR2S_UpdateDefArray_28534(this);
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
            if (other instanceof CR2S_UpdateDefArray_28534) {
               return this.mergeFrom((CR2S_UpdateDefArray_28534)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UpdateDefArray_28534 other) {
            if (other == SupremePvpMsg.CR2S_UpdateDefArray_28534.getDefaultInstance()) {
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
            CR2S_UpdateDefArray_28534 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UpdateDefArray_28534)SupremePvpMsg.CR2S_UpdateDefArray_28534.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UpdateDefArray_28534)e.getUnfinishedMessage();
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
               this.playerId_ = SupremePvpMsg.CR2S_UpdateDefArray_28534.mutableCopy(this.playerId_);
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
            this.playerId_ = SupremePvpMsg.CR2S_UpdateDefArray_28534.emptyIntList();
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

   public static final class CR2S_Settle_28535 extends GeneratedMessageV3 implements CR2S_Settle_28535OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRADE_FIELD_NUMBER = 1;
      private int grade_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      public static final int SETTLEINFO_FIELD_NUMBER = 3;
      private List<SettleInfo> settleInfo_;
      private byte memoizedIsInitialized;
      private static final CR2S_Settle_28535 DEFAULT_INSTANCE = new CR2S_Settle_28535();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_Settle_28535> PARSER = new AbstractParser<CR2S_Settle_28535>() {
         public CR2S_Settle_28535 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_Settle_28535(input, extensionRegistry);
         }
      };

      private CR2S_Settle_28535(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_Settle_28535() {
         this.memoizedIsInitialized = -1;
         this.settleInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_Settle_28535();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_Settle_28535(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.grade_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.type_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.settleInfo_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.settleInfo_.add(input.readMessage(SupremePvpMsg.SettleInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.settleInfo_ = Collections.unmodifiableList(this.settleInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_Settle_28535_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_Settle_28535_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Settle_28535.class, Builder.class);
      }

      public boolean hasGrade() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGrade() {
         return this.grade_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public List<SettleInfo> getSettleInfoList() {
         return this.settleInfo_;
      }

      public List<? extends SettleInfoOrBuilder> getSettleInfoOrBuilderList() {
         return this.settleInfo_;
      }

      public int getSettleInfoCount() {
         return this.settleInfo_.size();
      }

      public SettleInfo getSettleInfo(int index) {
         return (SettleInfo)this.settleInfo_.get(index);
      }

      public SettleInfoOrBuilder getSettleInfoOrBuilder(int index) {
         return (SettleInfoOrBuilder)this.settleInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGrade()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getSettleInfoCount(); ++i) {
               if (!this.getSettleInfo(i).isInitialized()) {
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
            output.writeInt32(1, this.grade_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.type_);
         }

         for(int i = 0; i < this.settleInfo_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.settleInfo_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.grade_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.type_);
            }

            for(int i = 0; i < this.settleInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.settleInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_Settle_28535)) {
            return super.equals(obj);
         } else {
            CR2S_Settle_28535 other = (CR2S_Settle_28535)obj;
            if (this.hasGrade() != other.hasGrade()) {
               return false;
            } else if (this.hasGrade() && this.getGrade() != other.getGrade()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (!this.getSettleInfoList().equals(other.getSettleInfoList())) {
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
            if (this.hasGrade()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGrade();
            }

            if (this.hasType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getType();
            }

            if (this.getSettleInfoCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSettleInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_Settle_28535 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_Settle_28535)PARSER.parseFrom(data);
      }

      public static CR2S_Settle_28535 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Settle_28535)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Settle_28535 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_Settle_28535)PARSER.parseFrom(data);
      }

      public static CR2S_Settle_28535 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Settle_28535)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Settle_28535 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_Settle_28535)PARSER.parseFrom(data);
      }

      public static CR2S_Settle_28535 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Settle_28535)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Settle_28535 parseFrom(InputStream input) throws IOException {
         return (CR2S_Settle_28535)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Settle_28535 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Settle_28535)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Settle_28535 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_Settle_28535)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_Settle_28535 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Settle_28535)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Settle_28535 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_Settle_28535)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Settle_28535 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Settle_28535)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_Settle_28535 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_Settle_28535 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_Settle_28535> parser() {
         return PARSER;
      }

      public Parser<CR2S_Settle_28535> getParserForType() {
         return PARSER;
      }

      public CR2S_Settle_28535 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_Settle_28535OrBuilder {
         private int bitField0_;
         private int grade_;
         private int type_;
         private List<SettleInfo> settleInfo_;
         private RepeatedFieldBuilderV3<SettleInfo, SettleInfo.Builder, SettleInfoOrBuilder> settleInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_Settle_28535_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_Settle_28535_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Settle_28535.class, Builder.class);
         }

         private Builder() {
            this.settleInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.settleInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.CR2S_Settle_28535.alwaysUseFieldBuilders) {
               this.getSettleInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.grade_ = 0;
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            if (this.settleInfoBuilder_ == null) {
               this.settleInfo_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.settleInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_Settle_28535_descriptor;
         }

         public CR2S_Settle_28535 getDefaultInstanceForType() {
            return SupremePvpMsg.CR2S_Settle_28535.getDefaultInstance();
         }

         public CR2S_Settle_28535 build() {
            CR2S_Settle_28535 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_Settle_28535 buildPartial() {
            CR2S_Settle_28535 result = new CR2S_Settle_28535(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.grade_ = this.grade_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 2;
            }

            if (this.settleInfoBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.settleInfo_ = Collections.unmodifiableList(this.settleInfo_);
                  this.bitField0_ &= -5;
               }

               result.settleInfo_ = this.settleInfo_;
            } else {
               result.settleInfo_ = this.settleInfoBuilder_.build();
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
            if (other instanceof CR2S_Settle_28535) {
               return this.mergeFrom((CR2S_Settle_28535)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_Settle_28535 other) {
            if (other == SupremePvpMsg.CR2S_Settle_28535.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGrade()) {
                  this.setGrade(other.getGrade());
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (this.settleInfoBuilder_ == null) {
                  if (!other.settleInfo_.isEmpty()) {
                     if (this.settleInfo_.isEmpty()) {
                        this.settleInfo_ = other.settleInfo_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureSettleInfoIsMutable();
                        this.settleInfo_.addAll(other.settleInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.settleInfo_.isEmpty()) {
                  if (this.settleInfoBuilder_.isEmpty()) {
                     this.settleInfoBuilder_.dispose();
                     this.settleInfoBuilder_ = null;
                     this.settleInfo_ = other.settleInfo_;
                     this.bitField0_ &= -5;
                     this.settleInfoBuilder_ = SupremePvpMsg.CR2S_Settle_28535.alwaysUseFieldBuilders ? this.getSettleInfoFieldBuilder() : null;
                  } else {
                     this.settleInfoBuilder_.addAllMessages(other.settleInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGrade()) {
               return false;
            } else if (!this.hasType()) {
               return false;
            } else {
               for(int i = 0; i < this.getSettleInfoCount(); ++i) {
                  if (!this.getSettleInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_Settle_28535 parsedMessage = null;

            try {
               parsedMessage = (CR2S_Settle_28535)SupremePvpMsg.CR2S_Settle_28535.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_Settle_28535)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGrade() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGrade() {
            return this.grade_;
         }

         public Builder setGrade(int value) {
            this.bitField0_ |= 1;
            this.grade_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGrade() {
            this.bitField0_ &= -2;
            this.grade_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 2;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -3;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureSettleInfoIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.settleInfo_ = new ArrayList(this.settleInfo_);
               this.bitField0_ |= 4;
            }

         }

         public List<SettleInfo> getSettleInfoList() {
            return this.settleInfoBuilder_ == null ? Collections.unmodifiableList(this.settleInfo_) : this.settleInfoBuilder_.getMessageList();
         }

         public int getSettleInfoCount() {
            return this.settleInfoBuilder_ == null ? this.settleInfo_.size() : this.settleInfoBuilder_.getCount();
         }

         public SettleInfo getSettleInfo(int index) {
            return this.settleInfoBuilder_ == null ? (SettleInfo)this.settleInfo_.get(index) : (SettleInfo)this.settleInfoBuilder_.getMessage(index);
         }

         public Builder setSettleInfo(int index, SettleInfo value) {
            if (this.settleInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSettleInfoIsMutable();
               this.settleInfo_.set(index, value);
               this.onChanged();
            } else {
               this.settleInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setSettleInfo(int index, SettleInfo.Builder builderForValue) {
            if (this.settleInfoBuilder_ == null) {
               this.ensureSettleInfoIsMutable();
               this.settleInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.settleInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addSettleInfo(SettleInfo value) {
            if (this.settleInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSettleInfoIsMutable();
               this.settleInfo_.add(value);
               this.onChanged();
            } else {
               this.settleInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addSettleInfo(int index, SettleInfo value) {
            if (this.settleInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSettleInfoIsMutable();
               this.settleInfo_.add(index, value);
               this.onChanged();
            } else {
               this.settleInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addSettleInfo(SettleInfo.Builder builderForValue) {
            if (this.settleInfoBuilder_ == null) {
               this.ensureSettleInfoIsMutable();
               this.settleInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.settleInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addSettleInfo(int index, SettleInfo.Builder builderForValue) {
            if (this.settleInfoBuilder_ == null) {
               this.ensureSettleInfoIsMutable();
               this.settleInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.settleInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllSettleInfo(Iterable<? extends SettleInfo> values) {
            if (this.settleInfoBuilder_ == null) {
               this.ensureSettleInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.settleInfo_);
               this.onChanged();
            } else {
               this.settleInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearSettleInfo() {
            if (this.settleInfoBuilder_ == null) {
               this.settleInfo_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.settleInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeSettleInfo(int index) {
            if (this.settleInfoBuilder_ == null) {
               this.ensureSettleInfoIsMutable();
               this.settleInfo_.remove(index);
               this.onChanged();
            } else {
               this.settleInfoBuilder_.remove(index);
            }

            return this;
         }

         public SettleInfo.Builder getSettleInfoBuilder(int index) {
            return (SettleInfo.Builder)this.getSettleInfoFieldBuilder().getBuilder(index);
         }

         public SettleInfoOrBuilder getSettleInfoOrBuilder(int index) {
            return this.settleInfoBuilder_ == null ? (SettleInfoOrBuilder)this.settleInfo_.get(index) : (SettleInfoOrBuilder)this.settleInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends SettleInfoOrBuilder> getSettleInfoOrBuilderList() {
            return this.settleInfoBuilder_ != null ? this.settleInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.settleInfo_);
         }

         public SettleInfo.Builder addSettleInfoBuilder() {
            return (SettleInfo.Builder)this.getSettleInfoFieldBuilder().addBuilder(SupremePvpMsg.SettleInfo.getDefaultInstance());
         }

         public SettleInfo.Builder addSettleInfoBuilder(int index) {
            return (SettleInfo.Builder)this.getSettleInfoFieldBuilder().addBuilder(index, SupremePvpMsg.SettleInfo.getDefaultInstance());
         }

         public List<SettleInfo.Builder> getSettleInfoBuilderList() {
            return this.getSettleInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<SettleInfo, SettleInfo.Builder, SettleInfoOrBuilder> getSettleInfoFieldBuilder() {
            if (this.settleInfoBuilder_ == null) {
               this.settleInfoBuilder_ = new RepeatedFieldBuilderV3(this.settleInfo_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.settleInfo_ = null;
            }

            return this.settleInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_NotifySettle_28538 extends GeneratedMessageV3 implements CR2S_NotifySettle_28538OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SEASONCHANGE_FIELD_NUMBER = 1;
      private boolean seasonChange_;
      private byte memoizedIsInitialized;
      private static final CR2S_NotifySettle_28538 DEFAULT_INSTANCE = new CR2S_NotifySettle_28538();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_NotifySettle_28538> PARSER = new AbstractParser<CR2S_NotifySettle_28538>() {
         public CR2S_NotifySettle_28538 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_NotifySettle_28538(input, extensionRegistry);
         }
      };

      private CR2S_NotifySettle_28538(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_NotifySettle_28538() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_NotifySettle_28538();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_NotifySettle_28538(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.seasonChange_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_NotifySettle_28538_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_NotifySettle_28538_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_NotifySettle_28538.class, Builder.class);
      }

      public boolean hasSeasonChange() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getSeasonChange() {
         return this.seasonChange_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSeasonChange()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.seasonChange_);
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
               size += CodedOutputStream.computeBoolSize(1, this.seasonChange_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_NotifySettle_28538)) {
            return super.equals(obj);
         } else {
            CR2S_NotifySettle_28538 other = (CR2S_NotifySettle_28538)obj;
            if (this.hasSeasonChange() != other.hasSeasonChange()) {
               return false;
            } else if (this.hasSeasonChange() && this.getSeasonChange() != other.getSeasonChange()) {
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
            if (this.hasSeasonChange()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getSeasonChange());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_NotifySettle_28538 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_NotifySettle_28538)PARSER.parseFrom(data);
      }

      public static CR2S_NotifySettle_28538 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_NotifySettle_28538)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_NotifySettle_28538 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_NotifySettle_28538)PARSER.parseFrom(data);
      }

      public static CR2S_NotifySettle_28538 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_NotifySettle_28538)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_NotifySettle_28538 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_NotifySettle_28538)PARSER.parseFrom(data);
      }

      public static CR2S_NotifySettle_28538 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_NotifySettle_28538)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_NotifySettle_28538 parseFrom(InputStream input) throws IOException {
         return (CR2S_NotifySettle_28538)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_NotifySettle_28538 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_NotifySettle_28538)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_NotifySettle_28538 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_NotifySettle_28538)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_NotifySettle_28538 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_NotifySettle_28538)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_NotifySettle_28538 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_NotifySettle_28538)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_NotifySettle_28538 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_NotifySettle_28538)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_NotifySettle_28538 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_NotifySettle_28538 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_NotifySettle_28538> parser() {
         return PARSER;
      }

      public Parser<CR2S_NotifySettle_28538> getParserForType() {
         return PARSER;
      }

      public CR2S_NotifySettle_28538 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_NotifySettle_28538OrBuilder {
         private int bitField0_;
         private boolean seasonChange_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_NotifySettle_28538_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_NotifySettle_28538_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_NotifySettle_28538.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.CR2S_NotifySettle_28538.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.seasonChange_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_NotifySettle_28538_descriptor;
         }

         public CR2S_NotifySettle_28538 getDefaultInstanceForType() {
            return SupremePvpMsg.CR2S_NotifySettle_28538.getDefaultInstance();
         }

         public CR2S_NotifySettle_28538 build() {
            CR2S_NotifySettle_28538 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_NotifySettle_28538 buildPartial() {
            CR2S_NotifySettle_28538 result = new CR2S_NotifySettle_28538(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.seasonChange_ = this.seasonChange_;
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
            if (other instanceof CR2S_NotifySettle_28538) {
               return this.mergeFrom((CR2S_NotifySettle_28538)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_NotifySettle_28538 other) {
            if (other == SupremePvpMsg.CR2S_NotifySettle_28538.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSeasonChange()) {
                  this.setSeasonChange(other.getSeasonChange());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasSeasonChange();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_NotifySettle_28538 parsedMessage = null;

            try {
               parsedMessage = (CR2S_NotifySettle_28538)SupremePvpMsg.CR2S_NotifySettle_28538.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_NotifySettle_28538)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSeasonChange() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getSeasonChange() {
            return this.seasonChange_;
         }

         public Builder setSeasonChange(boolean value) {
            this.bitField0_ |= 1;
            this.seasonChange_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSeasonChange() {
            this.bitField0_ &= -2;
            this.seasonChange_ = false;
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

   public static final class S2CR_ChallengeList_28539 extends GeneratedMessageV3 implements S2CR_ChallengeList_28539OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FLUSH_FIELD_NUMBER = 1;
      private boolean flush_;
      private byte memoizedIsInitialized;
      private static final S2CR_ChallengeList_28539 DEFAULT_INSTANCE = new S2CR_ChallengeList_28539();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_ChallengeList_28539> PARSER = new AbstractParser<S2CR_ChallengeList_28539>() {
         public S2CR_ChallengeList_28539 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_ChallengeList_28539(input, extensionRegistry);
         }
      };

      private S2CR_ChallengeList_28539(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_ChallengeList_28539() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_ChallengeList_28539();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_ChallengeList_28539(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.flush_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_ChallengeList_28539_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_ChallengeList_28539_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ChallengeList_28539.class, Builder.class);
      }

      public boolean hasFlush() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getFlush() {
         return this.flush_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFlush()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.flush_);
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
               size += CodedOutputStream.computeBoolSize(1, this.flush_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_ChallengeList_28539)) {
            return super.equals(obj);
         } else {
            S2CR_ChallengeList_28539 other = (S2CR_ChallengeList_28539)obj;
            if (this.hasFlush() != other.hasFlush()) {
               return false;
            } else if (this.hasFlush() && this.getFlush() != other.getFlush()) {
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
            if (this.hasFlush()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getFlush());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_ChallengeList_28539 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_ChallengeList_28539)PARSER.parseFrom(data);
      }

      public static S2CR_ChallengeList_28539 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ChallengeList_28539)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ChallengeList_28539 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_ChallengeList_28539)PARSER.parseFrom(data);
      }

      public static S2CR_ChallengeList_28539 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ChallengeList_28539)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ChallengeList_28539 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_ChallengeList_28539)PARSER.parseFrom(data);
      }

      public static S2CR_ChallengeList_28539 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ChallengeList_28539)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ChallengeList_28539 parseFrom(InputStream input) throws IOException {
         return (S2CR_ChallengeList_28539)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ChallengeList_28539 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ChallengeList_28539)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ChallengeList_28539 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_ChallengeList_28539)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_ChallengeList_28539 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ChallengeList_28539)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ChallengeList_28539 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_ChallengeList_28539)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ChallengeList_28539 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ChallengeList_28539)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_ChallengeList_28539 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_ChallengeList_28539 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_ChallengeList_28539> parser() {
         return PARSER;
      }

      public Parser<S2CR_ChallengeList_28539> getParserForType() {
         return PARSER;
      }

      public S2CR_ChallengeList_28539 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_ChallengeList_28539OrBuilder {
         private int bitField0_;
         private boolean flush_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_ChallengeList_28539_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_ChallengeList_28539_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ChallengeList_28539.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.S2CR_ChallengeList_28539.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.flush_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_ChallengeList_28539_descriptor;
         }

         public S2CR_ChallengeList_28539 getDefaultInstanceForType() {
            return SupremePvpMsg.S2CR_ChallengeList_28539.getDefaultInstance();
         }

         public S2CR_ChallengeList_28539 build() {
            S2CR_ChallengeList_28539 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_ChallengeList_28539 buildPartial() {
            S2CR_ChallengeList_28539 result = new S2CR_ChallengeList_28539(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.flush_ = this.flush_;
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
            if (other instanceof S2CR_ChallengeList_28539) {
               return this.mergeFrom((S2CR_ChallengeList_28539)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_ChallengeList_28539 other) {
            if (other == SupremePvpMsg.S2CR_ChallengeList_28539.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFlush()) {
                  this.setFlush(other.getFlush());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasFlush();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_ChallengeList_28539 parsedMessage = null;

            try {
               parsedMessage = (S2CR_ChallengeList_28539)SupremePvpMsg.S2CR_ChallengeList_28539.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_ChallengeList_28539)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFlush() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getFlush() {
            return this.flush_;
         }

         public Builder setFlush(boolean value) {
            this.bitField0_ |= 1;
            this.flush_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFlush() {
            this.bitField0_ &= -2;
            this.flush_ = false;
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

   public static final class CR2S_ChallengeList_28540 extends GeneratedMessageV3 implements CR2S_ChallengeList_28540OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FLUSH_FIELD_NUMBER = 1;
      private boolean flush_;
      public static final int PLAYER_FIELD_NUMBER = 2;
      private List<PvpMsg.PvpPlayerInfo> player_;
      private byte memoizedIsInitialized;
      private static final CR2S_ChallengeList_28540 DEFAULT_INSTANCE = new CR2S_ChallengeList_28540();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_ChallengeList_28540> PARSER = new AbstractParser<CR2S_ChallengeList_28540>() {
         public CR2S_ChallengeList_28540 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_ChallengeList_28540(input, extensionRegistry);
         }
      };

      private CR2S_ChallengeList_28540(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_ChallengeList_28540() {
         this.memoizedIsInitialized = -1;
         this.player_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_ChallengeList_28540();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_ChallengeList_28540(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.flush_ = input.readBool();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.player_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.player_.add(input.readMessage(PvpMsg.PvpPlayerInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.player_ = Collections.unmodifiableList(this.player_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_ChallengeList_28540_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_ChallengeList_28540_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ChallengeList_28540.class, Builder.class);
      }

      public boolean hasFlush() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getFlush() {
         return this.flush_;
      }

      public List<PvpMsg.PvpPlayerInfo> getPlayerList() {
         return this.player_;
      }

      public List<? extends PvpMsg.PvpPlayerInfoOrBuilder> getPlayerOrBuilderList() {
         return this.player_;
      }

      public int getPlayerCount() {
         return this.player_.size();
      }

      public PvpMsg.PvpPlayerInfo getPlayer(int index) {
         return (PvpMsg.PvpPlayerInfo)this.player_.get(index);
      }

      public PvpMsg.PvpPlayerInfoOrBuilder getPlayerOrBuilder(int index) {
         return (PvpMsg.PvpPlayerInfoOrBuilder)this.player_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFlush()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getPlayerCount(); ++i) {
               if (!this.getPlayer(i).isInitialized()) {
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
            output.writeBool(1, this.flush_);
         }

         for(int i = 0; i < this.player_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.player_.get(i));
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
               size += CodedOutputStream.computeBoolSize(1, this.flush_);
            }

            for(int i = 0; i < this.player_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.player_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_ChallengeList_28540)) {
            return super.equals(obj);
         } else {
            CR2S_ChallengeList_28540 other = (CR2S_ChallengeList_28540)obj;
            if (this.hasFlush() != other.hasFlush()) {
               return false;
            } else if (this.hasFlush() && this.getFlush() != other.getFlush()) {
               return false;
            } else if (!this.getPlayerList().equals(other.getPlayerList())) {
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
            if (this.hasFlush()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getFlush());
            }

            if (this.getPlayerCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_ChallengeList_28540 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_ChallengeList_28540)PARSER.parseFrom(data);
      }

      public static CR2S_ChallengeList_28540 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ChallengeList_28540)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ChallengeList_28540 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_ChallengeList_28540)PARSER.parseFrom(data);
      }

      public static CR2S_ChallengeList_28540 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ChallengeList_28540)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ChallengeList_28540 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_ChallengeList_28540)PARSER.parseFrom(data);
      }

      public static CR2S_ChallengeList_28540 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ChallengeList_28540)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ChallengeList_28540 parseFrom(InputStream input) throws IOException {
         return (CR2S_ChallengeList_28540)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ChallengeList_28540 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ChallengeList_28540)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ChallengeList_28540 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_ChallengeList_28540)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_ChallengeList_28540 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ChallengeList_28540)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ChallengeList_28540 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_ChallengeList_28540)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ChallengeList_28540 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ChallengeList_28540)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_ChallengeList_28540 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_ChallengeList_28540 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_ChallengeList_28540> parser() {
         return PARSER;
      }

      public Parser<CR2S_ChallengeList_28540> getParserForType() {
         return PARSER;
      }

      public CR2S_ChallengeList_28540 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_ChallengeList_28540OrBuilder {
         private int bitField0_;
         private boolean flush_;
         private List<PvpMsg.PvpPlayerInfo> player_;
         private RepeatedFieldBuilderV3<PvpMsg.PvpPlayerInfo, PvpMsg.PvpPlayerInfo.Builder, PvpMsg.PvpPlayerInfoOrBuilder> playerBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_ChallengeList_28540_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_ChallengeList_28540_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ChallengeList_28540.class, Builder.class);
         }

         private Builder() {
            this.player_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.player_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.CR2S_ChallengeList_28540.alwaysUseFieldBuilders) {
               this.getPlayerFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.flush_ = false;
            this.bitField0_ &= -2;
            if (this.playerBuilder_ == null) {
               this.player_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.playerBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_ChallengeList_28540_descriptor;
         }

         public CR2S_ChallengeList_28540 getDefaultInstanceForType() {
            return SupremePvpMsg.CR2S_ChallengeList_28540.getDefaultInstance();
         }

         public CR2S_ChallengeList_28540 build() {
            CR2S_ChallengeList_28540 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_ChallengeList_28540 buildPartial() {
            CR2S_ChallengeList_28540 result = new CR2S_ChallengeList_28540(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.flush_ = this.flush_;
               to_bitField0_ |= 1;
            }

            if (this.playerBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.player_ = Collections.unmodifiableList(this.player_);
                  this.bitField0_ &= -3;
               }

               result.player_ = this.player_;
            } else {
               result.player_ = this.playerBuilder_.build();
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
            if (other instanceof CR2S_ChallengeList_28540) {
               return this.mergeFrom((CR2S_ChallengeList_28540)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_ChallengeList_28540 other) {
            if (other == SupremePvpMsg.CR2S_ChallengeList_28540.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFlush()) {
                  this.setFlush(other.getFlush());
               }

               if (this.playerBuilder_ == null) {
                  if (!other.player_.isEmpty()) {
                     if (this.player_.isEmpty()) {
                        this.player_ = other.player_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensurePlayerIsMutable();
                        this.player_.addAll(other.player_);
                     }

                     this.onChanged();
                  }
               } else if (!other.player_.isEmpty()) {
                  if (this.playerBuilder_.isEmpty()) {
                     this.playerBuilder_.dispose();
                     this.playerBuilder_ = null;
                     this.player_ = other.player_;
                     this.bitField0_ &= -3;
                     this.playerBuilder_ = SupremePvpMsg.CR2S_ChallengeList_28540.alwaysUseFieldBuilders ? this.getPlayerFieldBuilder() : null;
                  } else {
                     this.playerBuilder_.addAllMessages(other.player_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFlush()) {
               return false;
            } else {
               for(int i = 0; i < this.getPlayerCount(); ++i) {
                  if (!this.getPlayer(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_ChallengeList_28540 parsedMessage = null;

            try {
               parsedMessage = (CR2S_ChallengeList_28540)SupremePvpMsg.CR2S_ChallengeList_28540.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_ChallengeList_28540)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFlush() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getFlush() {
            return this.flush_;
         }

         public Builder setFlush(boolean value) {
            this.bitField0_ |= 1;
            this.flush_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFlush() {
            this.bitField0_ &= -2;
            this.flush_ = false;
            this.onChanged();
            return this;
         }

         private void ensurePlayerIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.player_ = new ArrayList(this.player_);
               this.bitField0_ |= 2;
            }

         }

         public List<PvpMsg.PvpPlayerInfo> getPlayerList() {
            return this.playerBuilder_ == null ? Collections.unmodifiableList(this.player_) : this.playerBuilder_.getMessageList();
         }

         public int getPlayerCount() {
            return this.playerBuilder_ == null ? this.player_.size() : this.playerBuilder_.getCount();
         }

         public PvpMsg.PvpPlayerInfo getPlayer(int index) {
            return this.playerBuilder_ == null ? (PvpMsg.PvpPlayerInfo)this.player_.get(index) : (PvpMsg.PvpPlayerInfo)this.playerBuilder_.getMessage(index);
         }

         public Builder setPlayer(int index, PvpMsg.PvpPlayerInfo value) {
            if (this.playerBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerIsMutable();
               this.player_.set(index, value);
               this.onChanged();
            } else {
               this.playerBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPlayer(int index, PvpMsg.PvpPlayerInfo.Builder builderForValue) {
            if (this.playerBuilder_ == null) {
               this.ensurePlayerIsMutable();
               this.player_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPlayer(PvpMsg.PvpPlayerInfo value) {
            if (this.playerBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerIsMutable();
               this.player_.add(value);
               this.onChanged();
            } else {
               this.playerBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPlayer(int index, PvpMsg.PvpPlayerInfo value) {
            if (this.playerBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerIsMutable();
               this.player_.add(index, value);
               this.onChanged();
            } else {
               this.playerBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPlayer(PvpMsg.PvpPlayerInfo.Builder builderForValue) {
            if (this.playerBuilder_ == null) {
               this.ensurePlayerIsMutable();
               this.player_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.playerBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPlayer(int index, PvpMsg.PvpPlayerInfo.Builder builderForValue) {
            if (this.playerBuilder_ == null) {
               this.ensurePlayerIsMutable();
               this.player_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPlayer(Iterable<? extends PvpMsg.PvpPlayerInfo> values) {
            if (this.playerBuilder_ == null) {
               this.ensurePlayerIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.player_);
               this.onChanged();
            } else {
               this.playerBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPlayer() {
            if (this.playerBuilder_ == null) {
               this.player_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.playerBuilder_.clear();
            }

            return this;
         }

         public Builder removePlayer(int index) {
            if (this.playerBuilder_ == null) {
               this.ensurePlayerIsMutable();
               this.player_.remove(index);
               this.onChanged();
            } else {
               this.playerBuilder_.remove(index);
            }

            return this;
         }

         public PvpMsg.PvpPlayerInfo.Builder getPlayerBuilder(int index) {
            return (PvpMsg.PvpPlayerInfo.Builder)this.getPlayerFieldBuilder().getBuilder(index);
         }

         public PvpMsg.PvpPlayerInfoOrBuilder getPlayerOrBuilder(int index) {
            return this.playerBuilder_ == null ? (PvpMsg.PvpPlayerInfoOrBuilder)this.player_.get(index) : (PvpMsg.PvpPlayerInfoOrBuilder)this.playerBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends PvpMsg.PvpPlayerInfoOrBuilder> getPlayerOrBuilderList() {
            return this.playerBuilder_ != null ? this.playerBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.player_);
         }

         public PvpMsg.PvpPlayerInfo.Builder addPlayerBuilder() {
            return (PvpMsg.PvpPlayerInfo.Builder)this.getPlayerFieldBuilder().addBuilder(PvpMsg.PvpPlayerInfo.getDefaultInstance());
         }

         public PvpMsg.PvpPlayerInfo.Builder addPlayerBuilder(int index) {
            return (PvpMsg.PvpPlayerInfo.Builder)this.getPlayerFieldBuilder().addBuilder(index, PvpMsg.PvpPlayerInfo.getDefaultInstance());
         }

         public List<PvpMsg.PvpPlayerInfo.Builder> getPlayerBuilderList() {
            return this.getPlayerFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PvpMsg.PvpPlayerInfo, PvpMsg.PvpPlayerInfo.Builder, PvpMsg.PvpPlayerInfoOrBuilder> getPlayerFieldBuilder() {
            if (this.playerBuilder_ == null) {
               this.playerBuilder_ = new RepeatedFieldBuilderV3(this.player_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.player_ = null;
            }

            return this.playerBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_Rank_28541 extends GeneratedMessageV3 implements S2CR_Rank_28541OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANKTYPE_FIELD_NUMBER = 1;
      private int rankType_;
      private byte memoizedIsInitialized;
      private static final S2CR_Rank_28541 DEFAULT_INSTANCE = new S2CR_Rank_28541();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Rank_28541> PARSER = new AbstractParser<S2CR_Rank_28541>() {
         public S2CR_Rank_28541 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Rank_28541(input, extensionRegistry);
         }
      };

      private S2CR_Rank_28541(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Rank_28541() {
         this.memoizedIsInitialized = -1;
         this.rankType_ = 0;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Rank_28541();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Rank_28541(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        RankType value = SupremePvpMsg.RankType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.rankType_ = rawValue;
                        }
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_Rank_28541_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_Rank_28541_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Rank_28541.class, Builder.class);
      }

      public boolean hasRankType() {
         return (this.bitField0_ & 1) != 0;
      }

      public RankType getRankType() {
         RankType result = SupremePvpMsg.RankType.valueOf(this.rankType_);
         return result == null ? SupremePvpMsg.RankType.TYPE_MAIN : result;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRankType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.rankType_);
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
               size += CodedOutputStream.computeEnumSize(1, this.rankType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_Rank_28541)) {
            return super.equals(obj);
         } else {
            S2CR_Rank_28541 other = (S2CR_Rank_28541)obj;
            if (this.hasRankType() != other.hasRankType()) {
               return false;
            } else if (this.hasRankType() && this.rankType_ != other.rankType_) {
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
            if (this.hasRankType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.rankType_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_Rank_28541 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Rank_28541)PARSER.parseFrom(data);
      }

      public static S2CR_Rank_28541 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Rank_28541)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Rank_28541 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Rank_28541)PARSER.parseFrom(data);
      }

      public static S2CR_Rank_28541 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Rank_28541)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Rank_28541 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Rank_28541)PARSER.parseFrom(data);
      }

      public static S2CR_Rank_28541 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Rank_28541)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Rank_28541 parseFrom(InputStream input) throws IOException {
         return (S2CR_Rank_28541)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Rank_28541 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Rank_28541)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Rank_28541 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Rank_28541)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Rank_28541 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Rank_28541)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Rank_28541 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Rank_28541)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Rank_28541 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Rank_28541)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Rank_28541 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Rank_28541 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Rank_28541> parser() {
         return PARSER;
      }

      public Parser<S2CR_Rank_28541> getParserForType() {
         return PARSER;
      }

      public S2CR_Rank_28541 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Rank_28541OrBuilder {
         private int bitField0_;
         private int rankType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_Rank_28541_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_Rank_28541_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Rank_28541.class, Builder.class);
         }

         private Builder() {
            this.rankType_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rankType_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.S2CR_Rank_28541.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rankType_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_Rank_28541_descriptor;
         }

         public S2CR_Rank_28541 getDefaultInstanceForType() {
            return SupremePvpMsg.S2CR_Rank_28541.getDefaultInstance();
         }

         public S2CR_Rank_28541 build() {
            S2CR_Rank_28541 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Rank_28541 buildPartial() {
            S2CR_Rank_28541 result = new S2CR_Rank_28541(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.rankType_ = this.rankType_;
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
            if (other instanceof S2CR_Rank_28541) {
               return this.mergeFrom((S2CR_Rank_28541)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Rank_28541 other) {
            if (other == SupremePvpMsg.S2CR_Rank_28541.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRankType()) {
                  this.setRankType(other.getRankType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRankType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_Rank_28541 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Rank_28541)SupremePvpMsg.S2CR_Rank_28541.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Rank_28541)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRankType() {
            return (this.bitField0_ & 1) != 0;
         }

         public RankType getRankType() {
            RankType result = SupremePvpMsg.RankType.valueOf(this.rankType_);
            return result == null ? SupremePvpMsg.RankType.TYPE_MAIN : result;
         }

         public Builder setRankType(RankType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.rankType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearRankType() {
            this.bitField0_ &= -2;
            this.rankType_ = 0;
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

   public static final class S2CR_FightRecord_28542 extends GeneratedMessageV3 implements S2CR_FightRecord_28542OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_FightRecord_28542 DEFAULT_INSTANCE = new S2CR_FightRecord_28542();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_FightRecord_28542> PARSER = new AbstractParser<S2CR_FightRecord_28542>() {
         public S2CR_FightRecord_28542 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_FightRecord_28542(input, extensionRegistry);
         }
      };

      private S2CR_FightRecord_28542(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_FightRecord_28542() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_FightRecord_28542();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_FightRecord_28542(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_FightRecord_28542_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_FightRecord_28542_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_FightRecord_28542.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_FightRecord_28542)) {
            return super.equals(obj);
         } else {
            S2CR_FightRecord_28542 other = (S2CR_FightRecord_28542)obj;
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

      public static S2CR_FightRecord_28542 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_FightRecord_28542)PARSER.parseFrom(data);
      }

      public static S2CR_FightRecord_28542 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_FightRecord_28542)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_FightRecord_28542 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_FightRecord_28542)PARSER.parseFrom(data);
      }

      public static S2CR_FightRecord_28542 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_FightRecord_28542)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_FightRecord_28542 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_FightRecord_28542)PARSER.parseFrom(data);
      }

      public static S2CR_FightRecord_28542 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_FightRecord_28542)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_FightRecord_28542 parseFrom(InputStream input) throws IOException {
         return (S2CR_FightRecord_28542)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_FightRecord_28542 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_FightRecord_28542)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_FightRecord_28542 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_FightRecord_28542)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_FightRecord_28542 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_FightRecord_28542)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_FightRecord_28542 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_FightRecord_28542)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_FightRecord_28542 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_FightRecord_28542)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_FightRecord_28542 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_FightRecord_28542 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_FightRecord_28542> parser() {
         return PARSER;
      }

      public Parser<S2CR_FightRecord_28542> getParserForType() {
         return PARSER;
      }

      public S2CR_FightRecord_28542 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_FightRecord_28542OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_FightRecord_28542_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_FightRecord_28542_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_FightRecord_28542.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.S2CR_FightRecord_28542.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_FightRecord_28542_descriptor;
         }

         public S2CR_FightRecord_28542 getDefaultInstanceForType() {
            return SupremePvpMsg.S2CR_FightRecord_28542.getDefaultInstance();
         }

         public S2CR_FightRecord_28542 build() {
            S2CR_FightRecord_28542 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_FightRecord_28542 buildPartial() {
            S2CR_FightRecord_28542 result = new S2CR_FightRecord_28542(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_FightRecord_28542) {
               return this.mergeFrom((S2CR_FightRecord_28542)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_FightRecord_28542 other) {
            if (other == SupremePvpMsg.S2CR_FightRecord_28542.getDefaultInstance()) {
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
            S2CR_FightRecord_28542 parsedMessage = null;

            try {
               parsedMessage = (S2CR_FightRecord_28542)SupremePvpMsg.S2CR_FightRecord_28542.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_FightRecord_28542)e.getUnfinishedMessage();
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

   public static final class CR2S_PrestigeReward_28543 extends GeneratedMessageV3 implements CR2S_PrestigeReward_28543OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRADE_FIELD_NUMBER = 1;
      private int grade_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private Internal.IntList playerId_;
      private byte memoizedIsInitialized;
      private static final CR2S_PrestigeReward_28543 DEFAULT_INSTANCE = new CR2S_PrestigeReward_28543();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_PrestigeReward_28543> PARSER = new AbstractParser<CR2S_PrestigeReward_28543>() {
         public CR2S_PrestigeReward_28543 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_PrestigeReward_28543(input, extensionRegistry);
         }
      };

      private CR2S_PrestigeReward_28543(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_PrestigeReward_28543() {
         this.memoizedIsInitialized = -1;
         this.playerId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_PrestigeReward_28543();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_PrestigeReward_28543(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.grade_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.playerId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.playerId_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.playerId_ = newIntList();
                           mutable_bitField0_ |= 2;
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
               if ((mutable_bitField0_ & 2) != 0) {
                  this.playerId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_PrestigeReward_28543_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_PrestigeReward_28543_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_PrestigeReward_28543.class, Builder.class);
      }

      public boolean hasGrade() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGrade() {
         return this.grade_;
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
         } else if (!this.hasGrade()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.grade_);
         }

         for(int i = 0; i < this.playerId_.size(); ++i) {
            output.writeInt32(2, this.playerId_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.grade_);
            }

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
         } else if (!(obj instanceof CR2S_PrestigeReward_28543)) {
            return super.equals(obj);
         } else {
            CR2S_PrestigeReward_28543 other = (CR2S_PrestigeReward_28543)obj;
            if (this.hasGrade() != other.hasGrade()) {
               return false;
            } else if (this.hasGrade() && this.getGrade() != other.getGrade()) {
               return false;
            } else if (!this.getPlayerIdList().equals(other.getPlayerIdList())) {
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
            if (this.hasGrade()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGrade();
            }

            if (this.getPlayerIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_PrestigeReward_28543 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_PrestigeReward_28543)PARSER.parseFrom(data);
      }

      public static CR2S_PrestigeReward_28543 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PrestigeReward_28543)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PrestigeReward_28543 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_PrestigeReward_28543)PARSER.parseFrom(data);
      }

      public static CR2S_PrestigeReward_28543 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PrestigeReward_28543)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PrestigeReward_28543 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_PrestigeReward_28543)PARSER.parseFrom(data);
      }

      public static CR2S_PrestigeReward_28543 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PrestigeReward_28543)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PrestigeReward_28543 parseFrom(InputStream input) throws IOException {
         return (CR2S_PrestigeReward_28543)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_PrestigeReward_28543 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PrestigeReward_28543)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_PrestigeReward_28543 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_PrestigeReward_28543)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_PrestigeReward_28543 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PrestigeReward_28543)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_PrestigeReward_28543 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_PrestigeReward_28543)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_PrestigeReward_28543 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PrestigeReward_28543)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_PrestigeReward_28543 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_PrestigeReward_28543 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_PrestigeReward_28543> parser() {
         return PARSER;
      }

      public Parser<CR2S_PrestigeReward_28543> getParserForType() {
         return PARSER;
      }

      public CR2S_PrestigeReward_28543 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_PrestigeReward_28543OrBuilder {
         private int bitField0_;
         private int grade_;
         private Internal.IntList playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_PrestigeReward_28543_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_PrestigeReward_28543_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_PrestigeReward_28543.class, Builder.class);
         }

         private Builder() {
            this.playerId_ = SupremePvpMsg.CR2S_PrestigeReward_28543.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerId_ = SupremePvpMsg.CR2S_PrestigeReward_28543.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.CR2S_PrestigeReward_28543.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grade_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = SupremePvpMsg.CR2S_PrestigeReward_28543.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_CR2S_PrestigeReward_28543_descriptor;
         }

         public CR2S_PrestigeReward_28543 getDefaultInstanceForType() {
            return SupremePvpMsg.CR2S_PrestigeReward_28543.getDefaultInstance();
         }

         public CR2S_PrestigeReward_28543 build() {
            CR2S_PrestigeReward_28543 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_PrestigeReward_28543 buildPartial() {
            CR2S_PrestigeReward_28543 result = new CR2S_PrestigeReward_28543(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.grade_ = this.grade_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.playerId_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.playerId_ = this.playerId_;
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
            if (other instanceof CR2S_PrestigeReward_28543) {
               return this.mergeFrom((CR2S_PrestigeReward_28543)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_PrestigeReward_28543 other) {
            if (other == SupremePvpMsg.CR2S_PrestigeReward_28543.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGrade()) {
                  this.setGrade(other.getGrade());
               }

               if (!other.playerId_.isEmpty()) {
                  if (this.playerId_.isEmpty()) {
                     this.playerId_ = other.playerId_;
                     this.bitField0_ &= -3;
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
            return this.hasGrade();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_PrestigeReward_28543 parsedMessage = null;

            try {
               parsedMessage = (CR2S_PrestigeReward_28543)SupremePvpMsg.CR2S_PrestigeReward_28543.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_PrestigeReward_28543)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGrade() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGrade() {
            return this.grade_;
         }

         public Builder setGrade(int value) {
            this.bitField0_ |= 1;
            this.grade_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGrade() {
            this.bitField0_ &= -2;
            this.grade_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePlayerIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.playerId_ = SupremePvpMsg.CR2S_PrestigeReward_28543.mutableCopy(this.playerId_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getPlayerIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.playerId_) : this.playerId_);
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
            this.playerId_ = SupremePvpMsg.CR2S_PrestigeReward_28543.emptyIntList();
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

   public static final class S2CR_PvpGm_28600 extends GeneratedMessageV3 implements S2CR_PvpGm_28600OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STRING_FIELD_NUMBER = 1;
      private volatile Object string_;
      private byte memoizedIsInitialized;
      private static final S2CR_PvpGm_28600 DEFAULT_INSTANCE = new S2CR_PvpGm_28600();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_PvpGm_28600> PARSER = new AbstractParser<S2CR_PvpGm_28600>() {
         public S2CR_PvpGm_28600 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_PvpGm_28600(input, extensionRegistry);
         }
      };

      private S2CR_PvpGm_28600(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_PvpGm_28600() {
         this.memoizedIsInitialized = -1;
         this.string_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_PvpGm_28600();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_PvpGm_28600(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 1;
                        this.string_ = bs;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_PvpGm_28600_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_PvpGm_28600_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PvpGm_28600.class, Builder.class);
      }

      public boolean hasString() {
         return (this.bitField0_ & 1) != 0;
      }

      public String getString() {
         Object ref = this.string_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.string_ = s;
            }

            return s;
         }
      }

      public ByteString getStringBytes() {
         Object ref = this.string_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.string_ = b;
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
         } else if (!this.hasString()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.string_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.string_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_PvpGm_28600)) {
            return super.equals(obj);
         } else {
            S2CR_PvpGm_28600 other = (S2CR_PvpGm_28600)obj;
            if (this.hasString() != other.hasString()) {
               return false;
            } else if (this.hasString() && !this.getString().equals(other.getString())) {
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
            if (this.hasString()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getString().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_PvpGm_28600 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_PvpGm_28600)PARSER.parseFrom(data);
      }

      public static S2CR_PvpGm_28600 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PvpGm_28600)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PvpGm_28600 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_PvpGm_28600)PARSER.parseFrom(data);
      }

      public static S2CR_PvpGm_28600 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PvpGm_28600)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PvpGm_28600 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_PvpGm_28600)PARSER.parseFrom(data);
      }

      public static S2CR_PvpGm_28600 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PvpGm_28600)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PvpGm_28600 parseFrom(InputStream input) throws IOException {
         return (S2CR_PvpGm_28600)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PvpGm_28600 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PvpGm_28600)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PvpGm_28600 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_PvpGm_28600)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_PvpGm_28600 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PvpGm_28600)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PvpGm_28600 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_PvpGm_28600)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PvpGm_28600 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PvpGm_28600)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_PvpGm_28600 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_PvpGm_28600 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_PvpGm_28600> parser() {
         return PARSER;
      }

      public Parser<S2CR_PvpGm_28600> getParserForType() {
         return PARSER;
      }

      public S2CR_PvpGm_28600 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_PvpGm_28600OrBuilder {
         private int bitField0_;
         private Object string_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_PvpGm_28600_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_PvpGm_28600_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PvpGm_28600.class, Builder.class);
         }

         private Builder() {
            this.string_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.string_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SupremePvpMsg.S2CR_PvpGm_28600.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.string_ = "";
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SupremePvpMsg.internal_static_supremePvp_com_gzbz_protobuf_S2CR_PvpGm_28600_descriptor;
         }

         public S2CR_PvpGm_28600 getDefaultInstanceForType() {
            return SupremePvpMsg.S2CR_PvpGm_28600.getDefaultInstance();
         }

         public S2CR_PvpGm_28600 build() {
            S2CR_PvpGm_28600 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_PvpGm_28600 buildPartial() {
            S2CR_PvpGm_28600 result = new S2CR_PvpGm_28600(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.string_ = this.string_;
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
            if (other instanceof S2CR_PvpGm_28600) {
               return this.mergeFrom((S2CR_PvpGm_28600)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_PvpGm_28600 other) {
            if (other == SupremePvpMsg.S2CR_PvpGm_28600.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasString()) {
                  this.bitField0_ |= 1;
                  this.string_ = other.string_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasString();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_PvpGm_28600 parsedMessage = null;

            try {
               parsedMessage = (S2CR_PvpGm_28600)SupremePvpMsg.S2CR_PvpGm_28600.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_PvpGm_28600)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasString() {
            return (this.bitField0_ & 1) != 0;
         }

         public String getString() {
            Object ref = this.string_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.string_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getStringBytes() {
            Object ref = this.string_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.string_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setString(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.string_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearString() {
            this.bitField0_ &= -2;
            this.string_ = SupremePvpMsg.S2CR_PvpGm_28600.getDefaultInstance().getString();
            this.onChanged();
            return this;
         }

         public Builder setStringBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.string_ = value;
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

   public interface C2S_ChallengeList_28505OrBuilder extends MessageOrBuilder {
      boolean hasFlush();

      boolean getFlush();
   }

   public interface C2S_FightRecord_28507OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Main_28501OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Rank_28503OrBuilder extends MessageOrBuilder {
      boolean hasRankType();

      RankType getRankType();
   }

   public interface C2S_WarOrderBuy_28509OrBuilder extends MessageOrBuilder {
      boolean hasBuyType();

      BuyType getBuyType();

      boolean hasNum();

      int getNum();
   }

   public interface C2S_WarOrderRewardAll_28515OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_WarOrder_28513OrBuilder extends MessageOrBuilder {
   }

   public interface CR2S_ChallengeList_28540OrBuilder extends MessageOrBuilder {
      boolean hasFlush();

      boolean getFlush();

      List<PvpMsg.PvpPlayerInfo> getPlayerList();

      PvpMsg.PvpPlayerInfo getPlayer(int index);

      int getPlayerCount();

      List<? extends PvpMsg.PvpPlayerInfoOrBuilder> getPlayerOrBuilderList();

      PvpMsg.PvpPlayerInfoOrBuilder getPlayerOrBuilder(int index);
   }

   public interface CR2S_CrossFight_28532OrBuilder extends MessageOrBuilder {
      boolean hasBattleMsg();

      BattleMsg.S2C_BattleResult_6102 getBattleMsg();

      BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasBeforeScore();

      int getBeforeScore();

      boolean hasAfterScore();

      int getAfterScore();
   }

   public interface CR2S_NotifySettle_28538OrBuilder extends MessageOrBuilder {
      boolean hasSeasonChange();

      boolean getSeasonChange();
   }

   public interface CR2S_PrestigeReward_28543OrBuilder extends MessageOrBuilder {
      boolean hasGrade();

      int getGrade();

      List<Integer> getPlayerIdList();

      int getPlayerIdCount();

      int getPlayerId(int index);
   }

   public interface CR2S_Settle_28535OrBuilder extends MessageOrBuilder {
      boolean hasGrade();

      int getGrade();

      boolean hasType();

      int getType();

      List<SettleInfo> getSettleInfoList();

      SettleInfo getSettleInfo(int index);

      int getSettleInfoCount();

      List<? extends SettleInfoOrBuilder> getSettleInfoOrBuilderList();

      SettleInfoOrBuilder getSettleInfoOrBuilder(int index);
   }

   public interface CR2S_UpdateDefArray_28534OrBuilder extends MessageOrBuilder {
      List<Integer> getPlayerIdList();

      int getPlayerIdCount();

      int getPlayerId(int index);
   }

   public interface RankInfoOrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasName();

      String getName();

      ByteString getNameBytes();

      boolean hasLv();

      int getLv();

      boolean hasCombatPower();

      long getCombatPower();

      boolean hasScore();

      int getScore();

      boolean hasHeadId();

      int getHeadId();

      boolean hasThumbsUpNum();

      int getThumbsUpNum();

      boolean hasPrestige();

      int getPrestige();

      boolean hasMonarchId();

      int getMonarchId();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasServerId();

      int getServerId();

      boolean hasGrade();

      int getGrade();
   }

   public interface S2CR_ChallengeList_28539OrBuilder extends MessageOrBuilder {
      boolean hasFlush();

      boolean getFlush();
   }

   public interface S2CR_CrossFight_28531OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasIsSkip();

      boolean getIsSkip();

      boolean hasAtkArray();

      ByteString getAtkArray();
   }

   public interface S2CR_FightRecord_28542OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_PvpGm_28600OrBuilder extends MessageOrBuilder {
      boolean hasString();

      String getString();

      ByteString getStringBytes();
   }

   public interface S2CR_Rank_28541OrBuilder extends MessageOrBuilder {
      boolean hasRankType();

      RankType getRankType();
   }

   public interface S2CR_UpdateDefArray_28533OrBuilder extends MessageOrBuilder {
      boolean hasDefArray();

      ByteString getDefArray();

      boolean hasDefPower();

      long getDefPower();
   }

   public interface S2C_ChallengeList_28506OrBuilder extends MessageOrBuilder {
      boolean hasFlush();

      boolean getFlush();

      boolean hasDailyFlushTimes();

      int getDailyFlushTimes();

      List<PvpMsg.PvpPlayerInfo> getPlayerList();

      PvpMsg.PvpPlayerInfo getPlayer(int index);

      int getPlayerCount();

      List<? extends PvpMsg.PvpPlayerInfoOrBuilder> getPlayerOrBuilderList();

      PvpMsg.PvpPlayerInfoOrBuilder getPlayerOrBuilder(int index);
   }

   public interface S2C_CloseUi_28520OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      CloseUiResult getResult();
   }

   public interface S2C_FightRecord_28508OrBuilder extends MessageOrBuilder {
      List<PvpMsg.PvpRecordInfo> getRecordList();

      PvpMsg.PvpRecordInfo getRecord(int index);

      int getRecordCount();

      List<? extends PvpMsg.PvpRecordInfoOrBuilder> getRecordOrBuilderList();

      PvpMsg.PvpRecordInfoOrBuilder getRecordOrBuilder(int index);
   }

   public interface S2C_Main_28502OrBuilder extends MessageOrBuilder {
      boolean hasFightNum();

      int getFightNum();

      boolean hasDailyFlushTimes();

      int getDailyFlushTimes();

      boolean hasDailyFightNum();

      int getDailyFightNum();

      boolean hasDailyIntegralNum();

      int getDailyIntegralNum();
   }

   public interface S2C_Rank_28504OrBuilder extends MessageOrBuilder {
      boolean hasRankType();

      RankType getRankType();

      List<RankInfo> getRankList();

      RankInfo getRank(int index);

      int getRankCount();

      List<? extends RankInfoOrBuilder> getRankOrBuilderList();

      RankInfoOrBuilder getRankOrBuilder(int index);

      boolean hasMyRank();

      RankInfo getMyRank();

      RankInfoOrBuilder getMyRankOrBuilder();

      boolean hasGrade();

      int getGrade();

      boolean hasSettleGrade();

      SettleGrade getSettleGrade();

      boolean hasEndTime();

      int getEndTime();
   }

   public interface S2C_SeasonSettle_28518OrBuilder extends MessageOrBuilder {
      boolean hasPreGrade();

      int getPreGrade();

      boolean hasPreScore();

      int getPreScore();

      boolean hasPreRank();

      int getPreRank();

      boolean hasGrade();

      int getGrade();
   }

   public interface S2C_WarOrderBuy_28510OrBuilder extends MessageOrBuilder {
      boolean hasBuyType();

      BuyType getBuyType();

      boolean hasNum();

      int getNum();
   }

   public interface S2C_WarOrderLv_28512OrBuilder extends MessageOrBuilder {
      boolean hasWarOrderLv();

      int getWarOrderLv();
   }

   public interface S2C_WarOrderRewardAll_28516OrBuilder extends MessageOrBuilder {
      boolean hasGotCommonMaxLv();

      int getGotCommonMaxLv();

      boolean hasGotSuperMaxLv();

      int getGotSuperMaxLv();
   }

   public interface S2C_WarOrder_28514OrBuilder extends MessageOrBuilder {
      boolean hasWarOrderEnd();

      int getWarOrderEnd();

      boolean hasWarOrderLv();

      int getWarOrderLv();

      boolean hasGotCommonMaxLv();

      int getGotCommonMaxLv();

      boolean hasGotSuperMaxLv();

      int getGotSuperMaxLv();
   }

   public interface SettleInfoOrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasScore();

      long getScore();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasTeamId();

      int getTeamId();

      boolean hasNewGrade();

      int getNewGrade();
   }
}
