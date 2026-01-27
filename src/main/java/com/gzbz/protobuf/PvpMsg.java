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

public final class PvpMsg {
   private static final Descriptors.Descriptor internal_static_pvp_com_gzbz_protobuf_PvpPlayerInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pvp_com_gzbz_protobuf_PvpPlayerInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pvp_com_gzbz_protobuf_PvpRankInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pvp_com_gzbz_protobuf_PvpRankInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pvp_com_gzbz_protobuf_PvpRecordInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pvp_com_gzbz_protobuf_PvpRecordInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pvp_com_gzbz_protobuf_C2S_OpenPvpUi_6801_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pvp_com_gzbz_protobuf_C2S_OpenPvpUi_6801_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pvp_com_gzbz_protobuf_S2C_OpenPvpUiResult_6802_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pvp_com_gzbz_protobuf_S2C_OpenPvpUiResult_6802_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pvp_com_gzbz_protobuf_C2S_FlushPvpList_6803_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pvp_com_gzbz_protobuf_C2S_FlushPvpList_6803_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pvp_com_gzbz_protobuf_S2C_FlushPvpListResult_6804_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pvp_com_gzbz_protobuf_S2C_FlushPvpListResult_6804_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pvp_com_gzbz_protobuf_FightPlayerInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pvp_com_gzbz_protobuf_FightPlayerInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pvp_com_gzbz_protobuf_S2C_TakeAwardsResult_6806_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pvp_com_gzbz_protobuf_S2C_TakeAwardsResult_6806_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pvp_com_gzbz_protobuf_C2S_PvpRank_6807_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pvp_com_gzbz_protobuf_C2S_PvpRank_6807_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pvp_com_gzbz_protobuf_S2C_PvpRankResult_6808_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pvp_com_gzbz_protobuf_S2C_PvpRankResult_6808_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pvp_com_gzbz_protobuf_C2S_PvpFightRecord_6809_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pvp_com_gzbz_protobuf_C2S_PvpFightRecord_6809_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pvp_com_gzbz_protobuf_S2C_PvpFightRecordResult_6810_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pvp_com_gzbz_protobuf_S2C_PvpFightRecordResult_6810_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pvp_com_gzbz_protobuf_C2S_PvpThumbsUp_6811_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pvp_com_gzbz_protobuf_C2S_PvpThumbsUp_6811_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pvp_com_gzbz_protobuf_S2C_PvpThumbsUpResult_6812_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pvp_com_gzbz_protobuf_S2C_PvpThumbsUpResult_6812_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pvp_com_gzbz_protobuf_C2S_ShowPlayerInfo_6813_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pvp_com_gzbz_protobuf_C2S_ShowPlayerInfo_6813_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pvp_com_gzbz_protobuf_S2C_ShowPlayerInfoResult_6814_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pvp_com_gzbz_protobuf_S2C_ShowPlayerInfoResult_6814_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pvp_com_gzbz_protobuf_C2S_TakeFightNumAward_6815_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pvp_com_gzbz_protobuf_C2S_TakeFightNumAward_6815_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pvp_com_gzbz_protobuf_S2C_TakeFightNumAward_6816_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pvp_com_gzbz_protobuf_S2C_TakeFightNumAward_6816_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private PvpMsg() {
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
      String[] descriptorData = new String[]{"\n\tPvp.proto\u0012\u0015pvp.com.gzbz.protobuf\u001a\fcommon.proto\"¦\u0001\n\rPvpPlayerInfo\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0002 \u0002(\t\u0012\n\n\u0002lv\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000bcombatPower\u0018\u0004 \u0002(\u0003\u0012\u000e\n\u0006headId\u0018\u0005 \u0002(\u0005\u0012\r\n\u0005score\u0018\u0006 \u0002(\u0005\u0012\u0010\n\bprestige\u0018\u0007 \u0001(\u0005\u0012\u0010\n\bserverId\u0018\b \u0002(\u0005\u0012\u0011\n\theadFrame\u0018\t \u0001(\u0005\"ò\u0001\n\u000bPvpRankInfo\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0003 \u0002(\t\u0012\n\n\u0002lv\u0018\u0004 \u0002(\u0005\u0012\u0013\n\u000bcombatPower\u0018\u0005 \u0002(\u0003\u0012\u0011\n\tpvpPoints\u0018\u0006 \u0002(\u0003\u0012\u000e\n\u0006headId\u0018\u0007 \u0002(\u0005\u0012\u0013\n\u000bthumbsUpNum\u0018\b \u0002(\u0005\u0012\u0012\n\nisThumbsUp\u0018\t \u0002(\b\u0012\u0010\n\bprestige\u0018\n \u0001(\u0005\u0012\u0011\n\tmonarchid\u0018\u000b \u0001(\u0005\u0012\u0011\n\theadFrame\u0018\f \u0001(\u0005\u0012\u0010\n\bserverId\u0018\r \u0001(\u0005\"\u008e\u0002\n\rPvpRecordInfo\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0002 \u0002(\t\u0012\u0010\n\bplayerLv\u0018\u0003 \u0002(\u0005\u0012\u0012\n\nplayerHead\u0018\u0004 \u0002(\u0005\u0012\u000f\n\u0007attType\u0018\u0005 \u0002(\u0005\u0012\u000b\n\u0003win\u0018\u0006 \u0002(\u0005\u0012\f\n\u0004time\u0018\u0007 \u0002(\u0005\u0012\u0013\n\u000bscoreChange\u0018\b \u0002(\u0005\u0012\u0010\n\breocrdId\u0018\t \u0002(\u0005\u0012\u0015\n\rfightPlayerId\u0018\n \u0002(\u0005\u0012\u0017\n\u000ffightPlayerName\u0018\u000b \u0002(\t\u0012\u0015\n\rfightPlayerLv\u0018\f \u0002(\u0005\u0012\u0017\n\u000ffightPlayerHead\u0018\r \u0002(\u0005\"\u0014\n\u0012C2S_OpenPvpUi_6801\"\u0080\u0002\n\u0018S2C_OpenPvpUiResult_6802\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005point\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bfightNum\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000bdrawFreeNum\u0018\u0004 \u0002(\u0005\u0012\u0011\n\tstartTime\u0018\u0005 \u0002(\u0003\u0012\u000f\n\u0007endTime\u0018\u0006 \u0002(\u0003\u0012\u0010\n\bdownTime\u0018\u0007 \u0002(\u0003\u00123\n\u0005infos\u0018\b \u0003(\u000b2$.pvp.com.gzbz.protobuf.PvpPlayerInfo\u0012\u000e\n\u0006isSkip\u0018\t \u0002(\b\u0012\u0010\n\btakedIds\u0018\n \u0003(\u0005\u0012\u0013\n\u000bthumbsUpNum\u0018\u000b \u0002(\u0005\"\u0017\n\u0015C2S_FlushPvpList_6803\"R\n\u001bS2C_FlushPvpListResult_6804\u00123\n\u0005infos\u0018\u0001 \u0003(\u000b2$.pvp.com.gzbz.protobuf.PvpPlayerInfo\"}\n\u000fFightPlayerInfo\u0012\f\n\u0004left\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0003 \u0002(\t\u0012\f\n\u0004head\u0018\u0004 \u0002(\u0005\u0012\n\n\u0002lv\u0018\u0005 \u0002(\u0005\u0012\r\n\u0005score\u0018\u0006 \u0002(\u0005\u0012\u0013\n\u000bscoreChange\u0018\u0007 \u0001(\u0005\"¤\u0001\n\u0019S2C_TakeAwardsResult_6806\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005point\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bfightNum\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000bdrawFreeNum\u0018\u0004 \u0002(\u0005\u00123\n\u0005infos\u0018\b \u0003(\u000b2$.pvp.com.gzbz.protobuf.PvpPlayerInfo\u0012\u000e\n\u0006isSkip\u0018\t \u0002(\b\"D\n\u0010C2S_PvpRank_6807\u00120\n\u0004type\u0018\u0001 \u0002(\u000e2\".pvp.com.gzbz.protobuf.PvpRankType\"³\u0001\n\u0016S2C_PvpRankResult_6808\u00120\n\u0004type\u0018\u0001 \u0002(\u000e2\".pvp.com.gzbz.protobuf.PvpRankType\u00122\n\u0006myInfo\u0018\u0002 \u0002(\u000b2\".pvp.com.gzbz.protobuf.PvpRankInfo\u00123\n\u0007players\u0018\u0003 \u0003(\u000b2\".pvp.com.gzbz.protobuf.PvpRankInfo\"\u0019\n\u0017C2S_PvpFightRecord_6809\"T\n\u001dS2C_PvpFightRecordResult_6810\u00123\n\u0005infos\u0018\u0001 \u0003(\u000b2$.pvp.com.gzbz.protobuf.PvpRecordInfo\"@\n\u0014C2S_PvpThumbsUp_6811\u0012\u0014\n\fbeThumbsUpId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nisKingOfCP\u0018\u0002 \u0001(\b\"k\n\u001aS2C_PvpThumbsUpResult_6812\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0014\n\fbeThumbsUpId\u0018\u0002 \u0002(\u0005\u0012\u0013\n\u000bthumbsUpNum\u0018\u0003 \u0002(\u0005\u0012\u0012\n\nisKingOfCP\u0018\u0004 \u0001(\b\"+\n\u0017C2S_ShowPlayerInfo_6813\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\"¤\u0001\n\u001dS2C_ShowPlayerInfoResult_6814\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0002 \u0002(\t\u0012\n\n\u0002lv\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004head\u0018\u0004 \u0002(\u0005\u0012\u0011\n\theadFrame\u0018\u0005 \u0002(\u0005\u0012\r\n\u0005power\u0018\u0006 \u0002(\u0003\u0012\r\n\u0005score\u0018\u0007 \u0002(\u0005\u0012\u001e\n\u0004hero\u0018\b \u0003(\u000b2\u0010.common.HeroInfo\"(\n\u001aC2S_TakeFightNumAward_6815\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\">\n\u001aS2C_TakeFightNumAward_6816\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0010\n\btakedIds\u0018\u0002 \u0003(\u0005*=\n\u000bPvpRankType\u0012\u0017\n\u0013PvpRankType_Rank100\u0010\u0000\u0012\u0015\n\u0011PvpRankType_Rank3\u0010\u0001B\u001d\n\u0011com.gzbz.protobufB\u0006PvpMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_pvp_com_gzbz_protobuf_PvpPlayerInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_pvp_com_gzbz_protobuf_PvpPlayerInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pvp_com_gzbz_protobuf_PvpPlayerInfo_descriptor, new String[]{"PlayerId", "Name", "Lv", "CombatPower", "HeadId", "Score", "Prestige", "ServerId", "HeadFrame"});
      internal_static_pvp_com_gzbz_protobuf_PvpRankInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_pvp_com_gzbz_protobuf_PvpRankInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pvp_com_gzbz_protobuf_PvpRankInfo_descriptor, new String[]{"Rank", "PlayerId", "Name", "Lv", "CombatPower", "PvpPoints", "HeadId", "ThumbsUpNum", "IsThumbsUp", "Prestige", "Monarchid", "HeadFrame", "ServerId"});
      internal_static_pvp_com_gzbz_protobuf_PvpRecordInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_pvp_com_gzbz_protobuf_PvpRecordInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pvp_com_gzbz_protobuf_PvpRecordInfo_descriptor, new String[]{"PlayerId", "PlayerName", "PlayerLv", "PlayerHead", "AttType", "Win", "Time", "ScoreChange", "ReocrdId", "FightPlayerId", "FightPlayerName", "FightPlayerLv", "FightPlayerHead"});
      internal_static_pvp_com_gzbz_protobuf_C2S_OpenPvpUi_6801_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_pvp_com_gzbz_protobuf_C2S_OpenPvpUi_6801_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pvp_com_gzbz_protobuf_C2S_OpenPvpUi_6801_descriptor, new String[0]);
      internal_static_pvp_com_gzbz_protobuf_S2C_OpenPvpUiResult_6802_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_pvp_com_gzbz_protobuf_S2C_OpenPvpUiResult_6802_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pvp_com_gzbz_protobuf_S2C_OpenPvpUiResult_6802_descriptor, new String[]{"Rank", "Point", "FightNum", "DrawFreeNum", "StartTime", "EndTime", "DownTime", "Infos", "IsSkip", "TakedIds", "ThumbsUpNum"});
      internal_static_pvp_com_gzbz_protobuf_C2S_FlushPvpList_6803_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_pvp_com_gzbz_protobuf_C2S_FlushPvpList_6803_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pvp_com_gzbz_protobuf_C2S_FlushPvpList_6803_descriptor, new String[0]);
      internal_static_pvp_com_gzbz_protobuf_S2C_FlushPvpListResult_6804_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_pvp_com_gzbz_protobuf_S2C_FlushPvpListResult_6804_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pvp_com_gzbz_protobuf_S2C_FlushPvpListResult_6804_descriptor, new String[]{"Infos"});
      internal_static_pvp_com_gzbz_protobuf_FightPlayerInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_pvp_com_gzbz_protobuf_FightPlayerInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pvp_com_gzbz_protobuf_FightPlayerInfo_descriptor, new String[]{"Left", "PlayerId", "Name", "Head", "Lv", "Score", "ScoreChange"});
      internal_static_pvp_com_gzbz_protobuf_S2C_TakeAwardsResult_6806_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_pvp_com_gzbz_protobuf_S2C_TakeAwardsResult_6806_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pvp_com_gzbz_protobuf_S2C_TakeAwardsResult_6806_descriptor, new String[]{"Rank", "Point", "FightNum", "DrawFreeNum", "Infos", "IsSkip"});
      internal_static_pvp_com_gzbz_protobuf_C2S_PvpRank_6807_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_pvp_com_gzbz_protobuf_C2S_PvpRank_6807_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pvp_com_gzbz_protobuf_C2S_PvpRank_6807_descriptor, new String[]{"Type"});
      internal_static_pvp_com_gzbz_protobuf_S2C_PvpRankResult_6808_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_pvp_com_gzbz_protobuf_S2C_PvpRankResult_6808_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pvp_com_gzbz_protobuf_S2C_PvpRankResult_6808_descriptor, new String[]{"Type", "MyInfo", "Players"});
      internal_static_pvp_com_gzbz_protobuf_C2S_PvpFightRecord_6809_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_pvp_com_gzbz_protobuf_C2S_PvpFightRecord_6809_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pvp_com_gzbz_protobuf_C2S_PvpFightRecord_6809_descriptor, new String[0]);
      internal_static_pvp_com_gzbz_protobuf_S2C_PvpFightRecordResult_6810_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_pvp_com_gzbz_protobuf_S2C_PvpFightRecordResult_6810_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pvp_com_gzbz_protobuf_S2C_PvpFightRecordResult_6810_descriptor, new String[]{"Infos"});
      internal_static_pvp_com_gzbz_protobuf_C2S_PvpThumbsUp_6811_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_pvp_com_gzbz_protobuf_C2S_PvpThumbsUp_6811_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pvp_com_gzbz_protobuf_C2S_PvpThumbsUp_6811_descriptor, new String[]{"BeThumbsUpId", "IsKingOfCP"});
      internal_static_pvp_com_gzbz_protobuf_S2C_PvpThumbsUpResult_6812_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_pvp_com_gzbz_protobuf_S2C_PvpThumbsUpResult_6812_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pvp_com_gzbz_protobuf_S2C_PvpThumbsUpResult_6812_descriptor, new String[]{"Result", "BeThumbsUpId", "ThumbsUpNum", "IsKingOfCP"});
      internal_static_pvp_com_gzbz_protobuf_C2S_ShowPlayerInfo_6813_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_pvp_com_gzbz_protobuf_C2S_ShowPlayerInfo_6813_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pvp_com_gzbz_protobuf_C2S_ShowPlayerInfo_6813_descriptor, new String[]{"PlayerId"});
      internal_static_pvp_com_gzbz_protobuf_S2C_ShowPlayerInfoResult_6814_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_pvp_com_gzbz_protobuf_S2C_ShowPlayerInfoResult_6814_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pvp_com_gzbz_protobuf_S2C_ShowPlayerInfoResult_6814_descriptor, new String[]{"Id", "Name", "Lv", "Head", "HeadFrame", "Power", "Score", "Hero"});
      internal_static_pvp_com_gzbz_protobuf_C2S_TakeFightNumAward_6815_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_pvp_com_gzbz_protobuf_C2S_TakeFightNumAward_6815_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pvp_com_gzbz_protobuf_C2S_TakeFightNumAward_6815_descriptor, new String[]{"Id"});
      internal_static_pvp_com_gzbz_protobuf_S2C_TakeFightNumAward_6816_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_pvp_com_gzbz_protobuf_S2C_TakeFightNumAward_6816_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pvp_com_gzbz_protobuf_S2C_TakeFightNumAward_6816_descriptor, new String[]{"Result", "TakedIds"});
      CommonMsg.getDescriptor();
   }

   public static enum PvpRankType implements ProtocolMessageEnum {
      PvpRankType_Rank100(0),
      PvpRankType_Rank3(1);

      public static final int PvpRankType_Rank100_VALUE = 0;
      public static final int PvpRankType_Rank3_VALUE = 1;
      private static final Internal.EnumLiteMap<PvpRankType> internalValueMap = new Internal.EnumLiteMap<PvpRankType>() {
         public PvpRankType findValueByNumber(int number) {
            return PvpMsg.PvpRankType.forNumber(number);
         }
      };
      private static final PvpRankType[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static PvpRankType valueOf(int value) {
         return forNumber(value);
      }

      public static PvpRankType forNumber(int value) {
         switch (value) {
            case 0:
               return PvpRankType_Rank100;
            case 1:
               return PvpRankType_Rank3;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<PvpRankType> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)PvpMsg.getDescriptor().getEnumTypes().get(0);
      }

      public static PvpRankType valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private PvpRankType(int value) {
         this.value = value;
      }
   }

   public static final class PvpPlayerInfo extends GeneratedMessageV3 implements PvpPlayerInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int NAME_FIELD_NUMBER = 2;
      private volatile Object name_;
      public static final int LV_FIELD_NUMBER = 3;
      private int lv_;
      public static final int COMBATPOWER_FIELD_NUMBER = 4;
      private long combatPower_;
      public static final int HEADID_FIELD_NUMBER = 5;
      private int headId_;
      public static final int SCORE_FIELD_NUMBER = 6;
      private int score_;
      public static final int PRESTIGE_FIELD_NUMBER = 7;
      private int prestige_;
      public static final int SERVERID_FIELD_NUMBER = 8;
      private int serverId_;
      public static final int HEADFRAME_FIELD_NUMBER = 9;
      private int headFrame_;
      private byte memoizedIsInitialized;
      private static final PvpPlayerInfo DEFAULT_INSTANCE = new PvpPlayerInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<PvpPlayerInfo> PARSER = new AbstractParser<PvpPlayerInfo>() {
         public PvpPlayerInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new PvpPlayerInfo(input, extensionRegistry);
         }
      };

      private PvpPlayerInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private PvpPlayerInfo() {
         this.memoizedIsInitialized = -1;
         this.name_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new PvpPlayerInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private PvpPlayerInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.name_ = bs;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.lv_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.combatPower_ = input.readInt64();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.headId_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.score_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.prestige_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.serverId_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.headFrame_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_PvpPlayerInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_PvpPlayerInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PvpPlayerInfo.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
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

      public boolean hasLv() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLv() {
         return this.lv_;
      }

      public boolean hasCombatPower() {
         return (this.bitField0_ & 8) != 0;
      }

      public long getCombatPower() {
         return this.combatPower_;
      }

      public boolean hasHeadId() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getHeadId() {
         return this.headId_;
      }

      public boolean hasScore() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getScore() {
         return this.score_;
      }

      public boolean hasPrestige() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getPrestige() {
         return this.prestige_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
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
         } else if (!this.hasName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCombatPower()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeadId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasScore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasServerId()) {
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
            GeneratedMessageV3.writeString(output, 2, this.name_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.lv_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt64(4, this.combatPower_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.headId_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.score_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.prestige_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.serverId_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.headFrame_);
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
               size += GeneratedMessageV3.computeStringSize(2, this.name_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.lv_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt64Size(4, this.combatPower_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.headId_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.score_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.prestige_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.serverId_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.headFrame_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof PvpPlayerInfo)) {
            return super.equals(obj);
         } else {
            PvpPlayerInfo other = (PvpPlayerInfo)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
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
            } else if (this.hasHeadId() != other.hasHeadId()) {
               return false;
            } else if (this.hasHeadId() && this.getHeadId() != other.getHeadId()) {
               return false;
            } else if (this.hasScore() != other.hasScore()) {
               return false;
            } else if (this.hasScore() && this.getScore() != other.getScore()) {
               return false;
            } else if (this.hasPrestige() != other.hasPrestige()) {
               return false;
            } else if (this.hasPrestige() && this.getPrestige() != other.getPrestige()) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasName()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getName().hashCode();
            }

            if (this.hasLv()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLv();
            }

            if (this.hasCombatPower()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashLong(this.getCombatPower());
            }

            if (this.hasHeadId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getHeadId();
            }

            if (this.hasScore()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getScore();
            }

            if (this.hasPrestige()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getPrestige();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getHeadFrame();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static PvpPlayerInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (PvpPlayerInfo)PARSER.parseFrom(data);
      }

      public static PvpPlayerInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PvpPlayerInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PvpPlayerInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (PvpPlayerInfo)PARSER.parseFrom(data);
      }

      public static PvpPlayerInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PvpPlayerInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PvpPlayerInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (PvpPlayerInfo)PARSER.parseFrom(data);
      }

      public static PvpPlayerInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PvpPlayerInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PvpPlayerInfo parseFrom(InputStream input) throws IOException {
         return (PvpPlayerInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PvpPlayerInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PvpPlayerInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static PvpPlayerInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (PvpPlayerInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static PvpPlayerInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PvpPlayerInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static PvpPlayerInfo parseFrom(CodedInputStream input) throws IOException {
         return (PvpPlayerInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PvpPlayerInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PvpPlayerInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(PvpPlayerInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static PvpPlayerInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<PvpPlayerInfo> parser() {
         return PARSER;
      }

      public Parser<PvpPlayerInfo> getParserForType() {
         return PARSER;
      }

      public PvpPlayerInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PvpPlayerInfoOrBuilder {
         private int bitField0_;
         private int playerId_;
         private Object name_;
         private int lv_;
         private long combatPower_;
         private int headId_;
         private int score_;
         private int prestige_;
         private int serverId_;
         private int headFrame_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_PvpPlayerInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_PvpPlayerInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PvpPlayerInfo.class, Builder.class);
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
            if (PvpMsg.PvpPlayerInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.name_ = "";
            this.bitField0_ &= -3;
            this.lv_ = 0;
            this.bitField0_ &= -5;
            this.combatPower_ = 0L;
            this.bitField0_ &= -9;
            this.headId_ = 0;
            this.bitField0_ &= -17;
            this.score_ = 0;
            this.bitField0_ &= -33;
            this.prestige_ = 0;
            this.bitField0_ &= -65;
            this.serverId_ = 0;
            this.bitField0_ &= -129;
            this.headFrame_ = 0;
            this.bitField0_ &= -257;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_PvpPlayerInfo_descriptor;
         }

         public PvpPlayerInfo getDefaultInstanceForType() {
            return PvpMsg.PvpPlayerInfo.getDefaultInstance();
         }

         public PvpPlayerInfo build() {
            PvpPlayerInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public PvpPlayerInfo buildPartial() {
            PvpPlayerInfo result = new PvpPlayerInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.name_ = this.name_;
            if ((from_bitField0_ & 4) != 0) {
               result.lv_ = this.lv_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.combatPower_ = this.combatPower_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.headId_ = this.headId_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.score_ = this.score_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.prestige_ = this.prestige_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.headFrame_ = this.headFrame_;
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
            if (other instanceof PvpPlayerInfo) {
               return this.mergeFrom((PvpPlayerInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(PvpPlayerInfo other) {
            if (other == PvpMsg.PvpPlayerInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasName()) {
                  this.bitField0_ |= 2;
                  this.name_ = other.name_;
                  this.onChanged();
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

               if (other.hasScore()) {
                  this.setScore(other.getScore());
               }

               if (other.hasPrestige()) {
                  this.setPrestige(other.getPrestige());
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasName()) {
               return false;
            } else if (!this.hasLv()) {
               return false;
            } else if (!this.hasCombatPower()) {
               return false;
            } else if (!this.hasHeadId()) {
               return false;
            } else if (!this.hasScore()) {
               return false;
            } else {
               return this.hasServerId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            PvpPlayerInfo parsedMessage = null;

            try {
               parsedMessage = (PvpPlayerInfo)PvpMsg.PvpPlayerInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (PvpPlayerInfo)e.getUnfinishedMessage();
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
            this.name_ = PvpMsg.PvpPlayerInfo.getDefaultInstance().getName();
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

         public boolean hasCombatPower() {
            return (this.bitField0_ & 8) != 0;
         }

         public long getCombatPower() {
            return this.combatPower_;
         }

         public Builder setCombatPower(long value) {
            this.bitField0_ |= 8;
            this.combatPower_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCombatPower() {
            this.bitField0_ &= -9;
            this.combatPower_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasHeadId() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getHeadId() {
            return this.headId_;
         }

         public Builder setHeadId(int value) {
            this.bitField0_ |= 16;
            this.headId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadId() {
            this.bitField0_ &= -17;
            this.headId_ = 0;
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

         public boolean hasPrestige() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getPrestige() {
            return this.prestige_;
         }

         public Builder setPrestige(int value) {
            this.bitField0_ |= 64;
            this.prestige_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrestige() {
            this.bitField0_ &= -65;
            this.prestige_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 128;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -129;
            this.serverId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeadFrame() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getHeadFrame() {
            return this.headFrame_;
         }

         public Builder setHeadFrame(int value) {
            this.bitField0_ |= 256;
            this.headFrame_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadFrame() {
            this.bitField0_ &= -257;
            this.headFrame_ = 0;
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

   public static final class PvpRankInfo extends GeneratedMessageV3 implements PvpRankInfoOrBuilder {
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
      public static final int PVPPOINTS_FIELD_NUMBER = 6;
      private long pvpPoints_;
      public static final int HEADID_FIELD_NUMBER = 7;
      private int headId_;
      public static final int THUMBSUPNUM_FIELD_NUMBER = 8;
      private int thumbsUpNum_;
      public static final int ISTHUMBSUP_FIELD_NUMBER = 9;
      private boolean isThumbsUp_;
      public static final int PRESTIGE_FIELD_NUMBER = 10;
      private int prestige_;
      public static final int MONARCHID_FIELD_NUMBER = 11;
      private int monarchid_;
      public static final int HEADFRAME_FIELD_NUMBER = 12;
      private int headFrame_;
      public static final int SERVERID_FIELD_NUMBER = 13;
      private int serverId_;
      private byte memoizedIsInitialized;
      private static final PvpRankInfo DEFAULT_INSTANCE = new PvpRankInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<PvpRankInfo> PARSER = new AbstractParser<PvpRankInfo>() {
         public PvpRankInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new PvpRankInfo(input, extensionRegistry);
         }
      };

      private PvpRankInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private PvpRankInfo() {
         this.memoizedIsInitialized = -1;
         this.name_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new PvpRankInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private PvpRankInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.pvpPoints_ = input.readInt64();
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
                        this.isThumbsUp_ = input.readBool();
                        break;
                     case 80:
                        this.bitField0_ |= 512;
                        this.prestige_ = input.readInt32();
                        break;
                     case 88:
                        this.bitField0_ |= 1024;
                        this.monarchid_ = input.readInt32();
                        break;
                     case 96:
                        this.bitField0_ |= 2048;
                        this.headFrame_ = input.readInt32();
                        break;
                     case 104:
                        this.bitField0_ |= 4096;
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
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_PvpRankInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_PvpRankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PvpRankInfo.class, Builder.class);
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

      public boolean hasPvpPoints() {
         return (this.bitField0_ & 32) != 0;
      }

      public long getPvpPoints() {
         return this.pvpPoints_;
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

      public boolean hasIsThumbsUp() {
         return (this.bitField0_ & 256) != 0;
      }

      public boolean getIsThumbsUp() {
         return this.isThumbsUp_;
      }

      public boolean hasPrestige() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getPrestige() {
         return this.prestige_;
      }

      public boolean hasMonarchid() {
         return (this.bitField0_ & 1024) != 0;
      }

      public int getMonarchid() {
         return this.monarchid_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 2048) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 4096) != 0;
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
         } else if (!this.hasPvpPoints()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeadId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasThumbsUpNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsThumbsUp()) {
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
            output.writeInt64(6, this.pvpPoints_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.headId_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.thumbsUpNum_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeBool(9, this.isThumbsUp_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(10, this.prestige_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            output.writeInt32(11, this.monarchid_);
         }

         if ((this.bitField0_ & 2048) != 0) {
            output.writeInt32(12, this.headFrame_);
         }

         if ((this.bitField0_ & 4096) != 0) {
            output.writeInt32(13, this.serverId_);
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
               size += CodedOutputStream.computeInt64Size(6, this.pvpPoints_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.headId_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.thumbsUpNum_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeBoolSize(9, this.isThumbsUp_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.prestige_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.monarchid_);
            }

            if ((this.bitField0_ & 2048) != 0) {
               size += CodedOutputStream.computeInt32Size(12, this.headFrame_);
            }

            if ((this.bitField0_ & 4096) != 0) {
               size += CodedOutputStream.computeInt32Size(13, this.serverId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof PvpRankInfo)) {
            return super.equals(obj);
         } else {
            PvpRankInfo other = (PvpRankInfo)obj;
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
            } else if (this.hasPvpPoints() != other.hasPvpPoints()) {
               return false;
            } else if (this.hasPvpPoints() && this.getPvpPoints() != other.getPvpPoints()) {
               return false;
            } else if (this.hasHeadId() != other.hasHeadId()) {
               return false;
            } else if (this.hasHeadId() && this.getHeadId() != other.getHeadId()) {
               return false;
            } else if (this.hasThumbsUpNum() != other.hasThumbsUpNum()) {
               return false;
            } else if (this.hasThumbsUpNum() && this.getThumbsUpNum() != other.getThumbsUpNum()) {
               return false;
            } else if (this.hasIsThumbsUp() != other.hasIsThumbsUp()) {
               return false;
            } else if (this.hasIsThumbsUp() && this.getIsThumbsUp() != other.getIsThumbsUp()) {
               return false;
            } else if (this.hasPrestige() != other.hasPrestige()) {
               return false;
            } else if (this.hasPrestige() && this.getPrestige() != other.getPrestige()) {
               return false;
            } else if (this.hasMonarchid() != other.hasMonarchid()) {
               return false;
            } else if (this.hasMonarchid() && this.getMonarchid() != other.getMonarchid()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
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

            if (this.hasPvpPoints()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashLong(this.getPvpPoints());
            }

            if (this.hasHeadId()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getHeadId();
            }

            if (this.hasThumbsUpNum()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getThumbsUpNum();
            }

            if (this.hasIsThumbsUp()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + Internal.hashBoolean(this.getIsThumbsUp());
            }

            if (this.hasPrestige()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getPrestige();
            }

            if (this.hasMonarchid()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getMonarchid();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 13;
               hash = 53 * hash + this.getServerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static PvpRankInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (PvpRankInfo)PARSER.parseFrom(data);
      }

      public static PvpRankInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PvpRankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PvpRankInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (PvpRankInfo)PARSER.parseFrom(data);
      }

      public static PvpRankInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PvpRankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PvpRankInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (PvpRankInfo)PARSER.parseFrom(data);
      }

      public static PvpRankInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PvpRankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PvpRankInfo parseFrom(InputStream input) throws IOException {
         return (PvpRankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PvpRankInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PvpRankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static PvpRankInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (PvpRankInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static PvpRankInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PvpRankInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static PvpRankInfo parseFrom(CodedInputStream input) throws IOException {
         return (PvpRankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PvpRankInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PvpRankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(PvpRankInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static PvpRankInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<PvpRankInfo> parser() {
         return PARSER;
      }

      public Parser<PvpRankInfo> getParserForType() {
         return PARSER;
      }

      public PvpRankInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PvpRankInfoOrBuilder {
         private int bitField0_;
         private int rank_;
         private int playerId_;
         private Object name_;
         private int lv_;
         private long combatPower_;
         private long pvpPoints_;
         private int headId_;
         private int thumbsUpNum_;
         private boolean isThumbsUp_;
         private int prestige_;
         private int monarchid_;
         private int headFrame_;
         private int serverId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_PvpRankInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_PvpRankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PvpRankInfo.class, Builder.class);
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
            if (PvpMsg.PvpRankInfo.alwaysUseFieldBuilders) {
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
            this.pvpPoints_ = 0L;
            this.bitField0_ &= -33;
            this.headId_ = 0;
            this.bitField0_ &= -65;
            this.thumbsUpNum_ = 0;
            this.bitField0_ &= -129;
            this.isThumbsUp_ = false;
            this.bitField0_ &= -257;
            this.prestige_ = 0;
            this.bitField0_ &= -513;
            this.monarchid_ = 0;
            this.bitField0_ &= -1025;
            this.headFrame_ = 0;
            this.bitField0_ &= -2049;
            this.serverId_ = 0;
            this.bitField0_ &= -4097;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_PvpRankInfo_descriptor;
         }

         public PvpRankInfo getDefaultInstanceForType() {
            return PvpMsg.PvpRankInfo.getDefaultInstance();
         }

         public PvpRankInfo build() {
            PvpRankInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public PvpRankInfo buildPartial() {
            PvpRankInfo result = new PvpRankInfo(this);
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
               result.pvpPoints_ = this.pvpPoints_;
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
               result.isThumbsUp_ = this.isThumbsUp_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.prestige_ = this.prestige_;
               to_bitField0_ |= 512;
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.monarchid_ = this.monarchid_;
               to_bitField0_ |= 1024;
            }

            if ((from_bitField0_ & 2048) != 0) {
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 2048;
            }

            if ((from_bitField0_ & 4096) != 0) {
               result.serverId_ = this.serverId_;
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
            if (other instanceof PvpRankInfo) {
               return this.mergeFrom((PvpRankInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(PvpRankInfo other) {
            if (other == PvpMsg.PvpRankInfo.getDefaultInstance()) {
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

               if (other.hasPvpPoints()) {
                  this.setPvpPoints(other.getPvpPoints());
               }

               if (other.hasHeadId()) {
                  this.setHeadId(other.getHeadId());
               }

               if (other.hasThumbsUpNum()) {
                  this.setThumbsUpNum(other.getThumbsUpNum());
               }

               if (other.hasIsThumbsUp()) {
                  this.setIsThumbsUp(other.getIsThumbsUp());
               }

               if (other.hasPrestige()) {
                  this.setPrestige(other.getPrestige());
               }

               if (other.hasMonarchid()) {
                  this.setMonarchid(other.getMonarchid());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
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
            } else if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasName()) {
               return false;
            } else if (!this.hasLv()) {
               return false;
            } else if (!this.hasCombatPower()) {
               return false;
            } else if (!this.hasPvpPoints()) {
               return false;
            } else if (!this.hasHeadId()) {
               return false;
            } else if (!this.hasThumbsUpNum()) {
               return false;
            } else {
               return this.hasIsThumbsUp();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            PvpRankInfo parsedMessage = null;

            try {
               parsedMessage = (PvpRankInfo)PvpMsg.PvpRankInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (PvpRankInfo)e.getUnfinishedMessage();
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
            this.name_ = PvpMsg.PvpRankInfo.getDefaultInstance().getName();
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

         public boolean hasPvpPoints() {
            return (this.bitField0_ & 32) != 0;
         }

         public long getPvpPoints() {
            return this.pvpPoints_;
         }

         public Builder setPvpPoints(long value) {
            this.bitField0_ |= 32;
            this.pvpPoints_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPvpPoints() {
            this.bitField0_ &= -33;
            this.pvpPoints_ = 0L;
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

         public boolean hasIsThumbsUp() {
            return (this.bitField0_ & 256) != 0;
         }

         public boolean getIsThumbsUp() {
            return this.isThumbsUp_;
         }

         public Builder setIsThumbsUp(boolean value) {
            this.bitField0_ |= 256;
            this.isThumbsUp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsThumbsUp() {
            this.bitField0_ &= -257;
            this.isThumbsUp_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasPrestige() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getPrestige() {
            return this.prestige_;
         }

         public Builder setPrestige(int value) {
            this.bitField0_ |= 512;
            this.prestige_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrestige() {
            this.bitField0_ &= -513;
            this.prestige_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMonarchid() {
            return (this.bitField0_ & 1024) != 0;
         }

         public int getMonarchid() {
            return this.monarchid_;
         }

         public Builder setMonarchid(int value) {
            this.bitField0_ |= 1024;
            this.monarchid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMonarchid() {
            this.bitField0_ &= -1025;
            this.monarchid_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeadFrame() {
            return (this.bitField0_ & 2048) != 0;
         }

         public int getHeadFrame() {
            return this.headFrame_;
         }

         public Builder setHeadFrame(int value) {
            this.bitField0_ |= 2048;
            this.headFrame_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadFrame() {
            this.bitField0_ &= -2049;
            this.headFrame_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 4096) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 4096;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -4097;
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

   public static final class PvpRecordInfo extends GeneratedMessageV3 implements PvpRecordInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 2;
      private volatile Object playerName_;
      public static final int PLAYERLV_FIELD_NUMBER = 3;
      private int playerLv_;
      public static final int PLAYERHEAD_FIELD_NUMBER = 4;
      private int playerHead_;
      public static final int ATTTYPE_FIELD_NUMBER = 5;
      private int attType_;
      public static final int WIN_FIELD_NUMBER = 6;
      private int win_;
      public static final int TIME_FIELD_NUMBER = 7;
      private int time_;
      public static final int SCORECHANGE_FIELD_NUMBER = 8;
      private int scoreChange_;
      public static final int REOCRDID_FIELD_NUMBER = 9;
      private int reocrdId_;
      public static final int FIGHTPLAYERID_FIELD_NUMBER = 10;
      private int fightPlayerId_;
      public static final int FIGHTPLAYERNAME_FIELD_NUMBER = 11;
      private volatile Object fightPlayerName_;
      public static final int FIGHTPLAYERLV_FIELD_NUMBER = 12;
      private int fightPlayerLv_;
      public static final int FIGHTPLAYERHEAD_FIELD_NUMBER = 13;
      private int fightPlayerHead_;
      private byte memoizedIsInitialized;
      private static final PvpRecordInfo DEFAULT_INSTANCE = new PvpRecordInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<PvpRecordInfo> PARSER = new AbstractParser<PvpRecordInfo>() {
         public PvpRecordInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new PvpRecordInfo(input, extensionRegistry);
         }
      };

      private PvpRecordInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private PvpRecordInfo() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
         this.fightPlayerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new PvpRecordInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private PvpRecordInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.playerLv_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.playerHead_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.attType_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.win_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.time_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.scoreChange_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.reocrdId_ = input.readInt32();
                        break;
                     case 80:
                        this.bitField0_ |= 512;
                        this.fightPlayerId_ = input.readInt32();
                        break;
                     case 90:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 1024;
                        this.fightPlayerName_ = bs;
                        break;
                     case 96:
                        this.bitField0_ |= 2048;
                        this.fightPlayerLv_ = input.readInt32();
                        break;
                     case 104:
                        this.bitField0_ |= 4096;
                        this.fightPlayerHead_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_PvpRecordInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_PvpRecordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PvpRecordInfo.class, Builder.class);
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

      public boolean hasPlayerLv() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPlayerLv() {
         return this.playerLv_;
      }

      public boolean hasPlayerHead() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getPlayerHead() {
         return this.playerHead_;
      }

      public boolean hasAttType() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getAttType() {
         return this.attType_;
      }

      public boolean hasWin() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getWin() {
         return this.win_;
      }

      public boolean hasTime() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getTime() {
         return this.time_;
      }

      public boolean hasScoreChange() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getScoreChange() {
         return this.scoreChange_;
      }

      public boolean hasReocrdId() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getReocrdId() {
         return this.reocrdId_;
      }

      public boolean hasFightPlayerId() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getFightPlayerId() {
         return this.fightPlayerId_;
      }

      public boolean hasFightPlayerName() {
         return (this.bitField0_ & 1024) != 0;
      }

      public String getFightPlayerName() {
         Object ref = this.fightPlayerName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.fightPlayerName_ = s;
            }

            return s;
         }
      }

      public ByteString getFightPlayerNameBytes() {
         Object ref = this.fightPlayerName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.fightPlayerName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasFightPlayerLv() {
         return (this.bitField0_ & 2048) != 0;
      }

      public int getFightPlayerLv() {
         return this.fightPlayerLv_;
      }

      public boolean hasFightPlayerHead() {
         return (this.bitField0_ & 4096) != 0;
      }

      public int getFightPlayerHead() {
         return this.fightPlayerHead_;
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
         } else if (!this.hasPlayerLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAttType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasWin()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasScoreChange()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasReocrdId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFightPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFightPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFightPlayerLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFightPlayerHead()) {
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
            GeneratedMessageV3.writeString(output, 2, this.playerName_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.playerLv_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.playerHead_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.attType_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.win_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.time_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.scoreChange_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.reocrdId_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(10, this.fightPlayerId_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            GeneratedMessageV3.writeString(output, 11, this.fightPlayerName_);
         }

         if ((this.bitField0_ & 2048) != 0) {
            output.writeInt32(12, this.fightPlayerLv_);
         }

         if ((this.bitField0_ & 4096) != 0) {
            output.writeInt32(13, this.fightPlayerHead_);
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
               size += CodedOutputStream.computeInt32Size(3, this.playerLv_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.playerHead_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.attType_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.win_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.time_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.scoreChange_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.reocrdId_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.fightPlayerId_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += GeneratedMessageV3.computeStringSize(11, this.fightPlayerName_);
            }

            if ((this.bitField0_ & 2048) != 0) {
               size += CodedOutputStream.computeInt32Size(12, this.fightPlayerLv_);
            }

            if ((this.bitField0_ & 4096) != 0) {
               size += CodedOutputStream.computeInt32Size(13, this.fightPlayerHead_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof PvpRecordInfo)) {
            return super.equals(obj);
         } else {
            PvpRecordInfo other = (PvpRecordInfo)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasPlayerLv() != other.hasPlayerLv()) {
               return false;
            } else if (this.hasPlayerLv() && this.getPlayerLv() != other.getPlayerLv()) {
               return false;
            } else if (this.hasPlayerHead() != other.hasPlayerHead()) {
               return false;
            } else if (this.hasPlayerHead() && this.getPlayerHead() != other.getPlayerHead()) {
               return false;
            } else if (this.hasAttType() != other.hasAttType()) {
               return false;
            } else if (this.hasAttType() && this.getAttType() != other.getAttType()) {
               return false;
            } else if (this.hasWin() != other.hasWin()) {
               return false;
            } else if (this.hasWin() && this.getWin() != other.getWin()) {
               return false;
            } else if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
               return false;
            } else if (this.hasScoreChange() != other.hasScoreChange()) {
               return false;
            } else if (this.hasScoreChange() && this.getScoreChange() != other.getScoreChange()) {
               return false;
            } else if (this.hasReocrdId() != other.hasReocrdId()) {
               return false;
            } else if (this.hasReocrdId() && this.getReocrdId() != other.getReocrdId()) {
               return false;
            } else if (this.hasFightPlayerId() != other.hasFightPlayerId()) {
               return false;
            } else if (this.hasFightPlayerId() && this.getFightPlayerId() != other.getFightPlayerId()) {
               return false;
            } else if (this.hasFightPlayerName() != other.hasFightPlayerName()) {
               return false;
            } else if (this.hasFightPlayerName() && !this.getFightPlayerName().equals(other.getFightPlayerName())) {
               return false;
            } else if (this.hasFightPlayerLv() != other.hasFightPlayerLv()) {
               return false;
            } else if (this.hasFightPlayerLv() && this.getFightPlayerLv() != other.getFightPlayerLv()) {
               return false;
            } else if (this.hasFightPlayerHead() != other.hasFightPlayerHead()) {
               return false;
            } else if (this.hasFightPlayerHead() && this.getFightPlayerHead() != other.getFightPlayerHead()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasPlayerLv()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerLv();
            }

            if (this.hasPlayerHead()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPlayerHead();
            }

            if (this.hasAttType()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getAttType();
            }

            if (this.hasWin()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getWin();
            }

            if (this.hasTime()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getTime();
            }

            if (this.hasScoreChange()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getScoreChange();
            }

            if (this.hasReocrdId()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getReocrdId();
            }

            if (this.hasFightPlayerId()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getFightPlayerId();
            }

            if (this.hasFightPlayerName()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getFightPlayerName().hashCode();
            }

            if (this.hasFightPlayerLv()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getFightPlayerLv();
            }

            if (this.hasFightPlayerHead()) {
               hash = 37 * hash + 13;
               hash = 53 * hash + this.getFightPlayerHead();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static PvpRecordInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (PvpRecordInfo)PARSER.parseFrom(data);
      }

      public static PvpRecordInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PvpRecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PvpRecordInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (PvpRecordInfo)PARSER.parseFrom(data);
      }

      public static PvpRecordInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PvpRecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PvpRecordInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (PvpRecordInfo)PARSER.parseFrom(data);
      }

      public static PvpRecordInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PvpRecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PvpRecordInfo parseFrom(InputStream input) throws IOException {
         return (PvpRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PvpRecordInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PvpRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static PvpRecordInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (PvpRecordInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static PvpRecordInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PvpRecordInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static PvpRecordInfo parseFrom(CodedInputStream input) throws IOException {
         return (PvpRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PvpRecordInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PvpRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(PvpRecordInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static PvpRecordInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<PvpRecordInfo> parser() {
         return PARSER;
      }

      public Parser<PvpRecordInfo> getParserForType() {
         return PARSER;
      }

      public PvpRecordInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PvpRecordInfoOrBuilder {
         private int bitField0_;
         private int playerId_;
         private Object playerName_;
         private int playerLv_;
         private int playerHead_;
         private int attType_;
         private int win_;
         private int time_;
         private int scoreChange_;
         private int reocrdId_;
         private int fightPlayerId_;
         private Object fightPlayerName_;
         private int fightPlayerLv_;
         private int fightPlayerHead_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_PvpRecordInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_PvpRecordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PvpRecordInfo.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.fightPlayerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.fightPlayerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PvpMsg.PvpRecordInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.playerName_ = "";
            this.bitField0_ &= -3;
            this.playerLv_ = 0;
            this.bitField0_ &= -5;
            this.playerHead_ = 0;
            this.bitField0_ &= -9;
            this.attType_ = 0;
            this.bitField0_ &= -17;
            this.win_ = 0;
            this.bitField0_ &= -33;
            this.time_ = 0;
            this.bitField0_ &= -65;
            this.scoreChange_ = 0;
            this.bitField0_ &= -129;
            this.reocrdId_ = 0;
            this.bitField0_ &= -257;
            this.fightPlayerId_ = 0;
            this.bitField0_ &= -513;
            this.fightPlayerName_ = "";
            this.bitField0_ &= -1025;
            this.fightPlayerLv_ = 0;
            this.bitField0_ &= -2049;
            this.fightPlayerHead_ = 0;
            this.bitField0_ &= -4097;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_PvpRecordInfo_descriptor;
         }

         public PvpRecordInfo getDefaultInstanceForType() {
            return PvpMsg.PvpRecordInfo.getDefaultInstance();
         }

         public PvpRecordInfo build() {
            PvpRecordInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public PvpRecordInfo buildPartial() {
            PvpRecordInfo result = new PvpRecordInfo(this);
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
               result.playerLv_ = this.playerLv_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.playerHead_ = this.playerHead_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.attType_ = this.attType_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.win_ = this.win_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.time_ = this.time_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.scoreChange_ = this.scoreChange_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.reocrdId_ = this.reocrdId_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.fightPlayerId_ = this.fightPlayerId_;
               to_bitField0_ |= 512;
            }

            if ((from_bitField0_ & 1024) != 0) {
               to_bitField0_ |= 1024;
            }

            result.fightPlayerName_ = this.fightPlayerName_;
            if ((from_bitField0_ & 2048) != 0) {
               result.fightPlayerLv_ = this.fightPlayerLv_;
               to_bitField0_ |= 2048;
            }

            if ((from_bitField0_ & 4096) != 0) {
               result.fightPlayerHead_ = this.fightPlayerHead_;
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
            if (other instanceof PvpRecordInfo) {
               return this.mergeFrom((PvpRecordInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(PvpRecordInfo other) {
            if (other == PvpMsg.PvpRecordInfo.getDefaultInstance()) {
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

               if (other.hasPlayerLv()) {
                  this.setPlayerLv(other.getPlayerLv());
               }

               if (other.hasPlayerHead()) {
                  this.setPlayerHead(other.getPlayerHead());
               }

               if (other.hasAttType()) {
                  this.setAttType(other.getAttType());
               }

               if (other.hasWin()) {
                  this.setWin(other.getWin());
               }

               if (other.hasTime()) {
                  this.setTime(other.getTime());
               }

               if (other.hasScoreChange()) {
                  this.setScoreChange(other.getScoreChange());
               }

               if (other.hasReocrdId()) {
                  this.setReocrdId(other.getReocrdId());
               }

               if (other.hasFightPlayerId()) {
                  this.setFightPlayerId(other.getFightPlayerId());
               }

               if (other.hasFightPlayerName()) {
                  this.bitField0_ |= 1024;
                  this.fightPlayerName_ = other.fightPlayerName_;
                  this.onChanged();
               }

               if (other.hasFightPlayerLv()) {
                  this.setFightPlayerLv(other.getFightPlayerLv());
               }

               if (other.hasFightPlayerHead()) {
                  this.setFightPlayerHead(other.getFightPlayerHead());
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
            } else if (!this.hasPlayerLv()) {
               return false;
            } else if (!this.hasPlayerHead()) {
               return false;
            } else if (!this.hasAttType()) {
               return false;
            } else if (!this.hasWin()) {
               return false;
            } else if (!this.hasTime()) {
               return false;
            } else if (!this.hasScoreChange()) {
               return false;
            } else if (!this.hasReocrdId()) {
               return false;
            } else if (!this.hasFightPlayerId()) {
               return false;
            } else if (!this.hasFightPlayerName()) {
               return false;
            } else if (!this.hasFightPlayerLv()) {
               return false;
            } else {
               return this.hasFightPlayerHead();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            PvpRecordInfo parsedMessage = null;

            try {
               parsedMessage = (PvpRecordInfo)PvpMsg.PvpRecordInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (PvpRecordInfo)e.getUnfinishedMessage();
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
            this.playerName_ = PvpMsg.PvpRecordInfo.getDefaultInstance().getPlayerName();
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

         public boolean hasPlayerLv() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getPlayerLv() {
            return this.playerLv_;
         }

         public Builder setPlayerLv(int value) {
            this.bitField0_ |= 4;
            this.playerLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerLv() {
            this.bitField0_ &= -5;
            this.playerLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerHead() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getPlayerHead() {
            return this.playerHead_;
         }

         public Builder setPlayerHead(int value) {
            this.bitField0_ |= 8;
            this.playerHead_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerHead() {
            this.bitField0_ &= -9;
            this.playerHead_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAttType() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getAttType() {
            return this.attType_;
         }

         public Builder setAttType(int value) {
            this.bitField0_ |= 16;
            this.attType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAttType() {
            this.bitField0_ &= -17;
            this.attType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasWin() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getWin() {
            return this.win_;
         }

         public Builder setWin(int value) {
            this.bitField0_ |= 32;
            this.win_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWin() {
            this.bitField0_ &= -33;
            this.win_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTime() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getTime() {
            return this.time_;
         }

         public Builder setTime(int value) {
            this.bitField0_ |= 64;
            this.time_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTime() {
            this.bitField0_ &= -65;
            this.time_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasScoreChange() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getScoreChange() {
            return this.scoreChange_;
         }

         public Builder setScoreChange(int value) {
            this.bitField0_ |= 128;
            this.scoreChange_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearScoreChange() {
            this.bitField0_ &= -129;
            this.scoreChange_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasReocrdId() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getReocrdId() {
            return this.reocrdId_;
         }

         public Builder setReocrdId(int value) {
            this.bitField0_ |= 256;
            this.reocrdId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearReocrdId() {
            this.bitField0_ &= -257;
            this.reocrdId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFightPlayerId() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getFightPlayerId() {
            return this.fightPlayerId_;
         }

         public Builder setFightPlayerId(int value) {
            this.bitField0_ |= 512;
            this.fightPlayerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFightPlayerId() {
            this.bitField0_ &= -513;
            this.fightPlayerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFightPlayerName() {
            return (this.bitField0_ & 1024) != 0;
         }

         public String getFightPlayerName() {
            Object ref = this.fightPlayerName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.fightPlayerName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getFightPlayerNameBytes() {
            Object ref = this.fightPlayerName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.fightPlayerName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setFightPlayerName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1024;
               this.fightPlayerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearFightPlayerName() {
            this.bitField0_ &= -1025;
            this.fightPlayerName_ = PvpMsg.PvpRecordInfo.getDefaultInstance().getFightPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setFightPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1024;
               this.fightPlayerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasFightPlayerLv() {
            return (this.bitField0_ & 2048) != 0;
         }

         public int getFightPlayerLv() {
            return this.fightPlayerLv_;
         }

         public Builder setFightPlayerLv(int value) {
            this.bitField0_ |= 2048;
            this.fightPlayerLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFightPlayerLv() {
            this.bitField0_ &= -2049;
            this.fightPlayerLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFightPlayerHead() {
            return (this.bitField0_ & 4096) != 0;
         }

         public int getFightPlayerHead() {
            return this.fightPlayerHead_;
         }

         public Builder setFightPlayerHead(int value) {
            this.bitField0_ |= 4096;
            this.fightPlayerHead_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFightPlayerHead() {
            this.bitField0_ &= -4097;
            this.fightPlayerHead_ = 0;
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

   public static final class C2S_OpenPvpUi_6801 extends GeneratedMessageV3 implements C2S_OpenPvpUi_6801OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OpenPvpUi_6801 DEFAULT_INSTANCE = new C2S_OpenPvpUi_6801();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenPvpUi_6801> PARSER = new AbstractParser<C2S_OpenPvpUi_6801>() {
         public C2S_OpenPvpUi_6801 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenPvpUi_6801(input, extensionRegistry);
         }
      };

      private C2S_OpenPvpUi_6801(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenPvpUi_6801() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenPvpUi_6801();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenPvpUi_6801(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_OpenPvpUi_6801_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_OpenPvpUi_6801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenPvpUi_6801.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenPvpUi_6801)) {
            return super.equals(obj);
         } else {
            C2S_OpenPvpUi_6801 other = (C2S_OpenPvpUi_6801)obj;
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

      public static C2S_OpenPvpUi_6801 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenPvpUi_6801)PARSER.parseFrom(data);
      }

      public static C2S_OpenPvpUi_6801 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenPvpUi_6801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenPvpUi_6801 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenPvpUi_6801)PARSER.parseFrom(data);
      }

      public static C2S_OpenPvpUi_6801 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenPvpUi_6801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenPvpUi_6801 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenPvpUi_6801)PARSER.parseFrom(data);
      }

      public static C2S_OpenPvpUi_6801 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenPvpUi_6801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenPvpUi_6801 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenPvpUi_6801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenPvpUi_6801 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenPvpUi_6801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenPvpUi_6801 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenPvpUi_6801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenPvpUi_6801 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenPvpUi_6801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenPvpUi_6801 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenPvpUi_6801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenPvpUi_6801 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenPvpUi_6801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenPvpUi_6801 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenPvpUi_6801 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenPvpUi_6801> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenPvpUi_6801> getParserForType() {
         return PARSER;
      }

      public C2S_OpenPvpUi_6801 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenPvpUi_6801OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_OpenPvpUi_6801_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_OpenPvpUi_6801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenPvpUi_6801.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PvpMsg.C2S_OpenPvpUi_6801.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_OpenPvpUi_6801_descriptor;
         }

         public C2S_OpenPvpUi_6801 getDefaultInstanceForType() {
            return PvpMsg.C2S_OpenPvpUi_6801.getDefaultInstance();
         }

         public C2S_OpenPvpUi_6801 build() {
            C2S_OpenPvpUi_6801 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenPvpUi_6801 buildPartial() {
            C2S_OpenPvpUi_6801 result = new C2S_OpenPvpUi_6801(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_OpenPvpUi_6801) {
               return this.mergeFrom((C2S_OpenPvpUi_6801)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenPvpUi_6801 other) {
            if (other == PvpMsg.C2S_OpenPvpUi_6801.getDefaultInstance()) {
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
            C2S_OpenPvpUi_6801 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenPvpUi_6801)PvpMsg.C2S_OpenPvpUi_6801.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenPvpUi_6801)e.getUnfinishedMessage();
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

   public static final class S2C_OpenPvpUiResult_6802 extends GeneratedMessageV3 implements S2C_OpenPvpUiResult_6802OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int POINT_FIELD_NUMBER = 2;
      private int point_;
      public static final int FIGHTNUM_FIELD_NUMBER = 3;
      private int fightNum_;
      public static final int DRAWFREENUM_FIELD_NUMBER = 4;
      private int drawFreeNum_;
      public static final int STARTTIME_FIELD_NUMBER = 5;
      private long startTime_;
      public static final int ENDTIME_FIELD_NUMBER = 6;
      private long endTime_;
      public static final int DOWNTIME_FIELD_NUMBER = 7;
      private long downTime_;
      public static final int INFOS_FIELD_NUMBER = 8;
      private List<PvpPlayerInfo> infos_;
      public static final int ISSKIP_FIELD_NUMBER = 9;
      private boolean isSkip_;
      public static final int TAKEDIDS_FIELD_NUMBER = 10;
      private Internal.IntList takedIds_;
      public static final int THUMBSUPNUM_FIELD_NUMBER = 11;
      private int thumbsUpNum_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenPvpUiResult_6802 DEFAULT_INSTANCE = new S2C_OpenPvpUiResult_6802();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenPvpUiResult_6802> PARSER = new AbstractParser<S2C_OpenPvpUiResult_6802>() {
         public S2C_OpenPvpUiResult_6802 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenPvpUiResult_6802(input, extensionRegistry);
         }
      };

      private S2C_OpenPvpUiResult_6802(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenPvpUiResult_6802() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
         this.takedIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenPvpUiResult_6802();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenPvpUiResult_6802(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.rank_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.point_ = input.readInt32();
                        continue;
                     case 24:
                        this.bitField0_ |= 4;
                        this.fightNum_ = input.readInt32();
                        continue;
                     case 32:
                        this.bitField0_ |= 8;
                        this.drawFreeNum_ = input.readInt32();
                        continue;
                     case 40:
                        this.bitField0_ |= 16;
                        this.startTime_ = input.readInt64();
                        continue;
                     case 48:
                        this.bitField0_ |= 32;
                        this.endTime_ = input.readInt64();
                        continue;
                     case 56:
                        this.bitField0_ |= 64;
                        this.downTime_ = input.readInt64();
                        continue;
                     case 66:
                        if ((mutable_bitField0_ & 128) == 0) {
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 128;
                        }

                        this.infos_.add(input.readMessage(PvpMsg.PvpPlayerInfo.PARSER, extensionRegistry));
                        continue;
                     case 72:
                        this.bitField0_ |= 128;
                        this.isSkip_ = input.readBool();
                        continue;
                     case 80:
                        if ((mutable_bitField0_ & 512) == 0) {
                           this.takedIds_ = newIntList();
                           mutable_bitField0_ |= 512;
                        }

                        this.takedIds_.addInt(input.readInt32());
                        continue;
                     case 82:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 512) == 0 && input.getBytesUntilLimit() > 0) {
                           this.takedIds_ = newIntList();
                           mutable_bitField0_ |= 512;
                        }
                        break;
                     case 88:
                        this.bitField0_ |= 256;
                        this.thumbsUpNum_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.takedIds_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 128) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               if ((mutable_bitField0_ & 512) != 0) {
                  this.takedIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_OpenPvpUiResult_6802_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_OpenPvpUiResult_6802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenPvpUiResult_6802.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasPoint() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPoint() {
         return this.point_;
      }

      public boolean hasFightNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getFightNum() {
         return this.fightNum_;
      }

      public boolean hasDrawFreeNum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getDrawFreeNum() {
         return this.drawFreeNum_;
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public long getStartTime() {
         return this.startTime_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 32) != 0;
      }

      public long getEndTime() {
         return this.endTime_;
      }

      public boolean hasDownTime() {
         return (this.bitField0_ & 64) != 0;
      }

      public long getDownTime() {
         return this.downTime_;
      }

      public List<PvpPlayerInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends PvpPlayerInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public PvpPlayerInfo getInfos(int index) {
         return (PvpPlayerInfo)this.infos_.get(index);
      }

      public PvpPlayerInfoOrBuilder getInfosOrBuilder(int index) {
         return (PvpPlayerInfoOrBuilder)this.infos_.get(index);
      }

      public boolean hasIsSkip() {
         return (this.bitField0_ & 128) != 0;
      }

      public boolean getIsSkip() {
         return this.isSkip_;
      }

      public List<Integer> getTakedIdsList() {
         return this.takedIds_;
      }

      public int getTakedIdsCount() {
         return this.takedIds_.size();
      }

      public int getTakedIds(int index) {
         return this.takedIds_.getInt(index);
      }

      public boolean hasThumbsUpNum() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getThumbsUpNum() {
         return this.thumbsUpNum_;
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
         } else if (!this.hasPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFightNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDrawFreeNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStartTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDownTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsSkip()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasThumbsUpNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
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
            output.writeInt32(1, this.rank_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.point_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.fightNum_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.drawFreeNum_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt64(5, this.startTime_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt64(6, this.endTime_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt64(7, this.downTime_);
         }

         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(8, (MessageLite)this.infos_.get(i));
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeBool(9, this.isSkip_);
         }

         for(int i = 0; i < this.takedIds_.size(); ++i) {
            output.writeInt32(10, this.takedIds_.getInt(i));
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(11, this.thumbsUpNum_);
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
               size += CodedOutputStream.computeInt32Size(2, this.point_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.fightNum_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.drawFreeNum_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt64Size(5, this.startTime_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt64Size(6, this.endTime_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt64Size(7, this.downTime_);
            }

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(8, (MessageLite)this.infos_.get(i));
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeBoolSize(9, this.isSkip_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.takedIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.takedIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTakedIdsList().size();
            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.thumbsUpNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OpenPvpUiResult_6802)) {
            return super.equals(obj);
         } else {
            S2C_OpenPvpUiResult_6802 other = (S2C_OpenPvpUiResult_6802)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasPoint() != other.hasPoint()) {
               return false;
            } else if (this.hasPoint() && this.getPoint() != other.getPoint()) {
               return false;
            } else if (this.hasFightNum() != other.hasFightNum()) {
               return false;
            } else if (this.hasFightNum() && this.getFightNum() != other.getFightNum()) {
               return false;
            } else if (this.hasDrawFreeNum() != other.hasDrawFreeNum()) {
               return false;
            } else if (this.hasDrawFreeNum() && this.getDrawFreeNum() != other.getDrawFreeNum()) {
               return false;
            } else if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (this.hasDownTime() != other.hasDownTime()) {
               return false;
            } else if (this.hasDownTime() && this.getDownTime() != other.getDownTime()) {
               return false;
            } else if (!this.getInfosList().equals(other.getInfosList())) {
               return false;
            } else if (this.hasIsSkip() != other.hasIsSkip()) {
               return false;
            } else if (this.hasIsSkip() && this.getIsSkip() != other.getIsSkip()) {
               return false;
            } else if (!this.getTakedIdsList().equals(other.getTakedIdsList())) {
               return false;
            } else if (this.hasThumbsUpNum() != other.hasThumbsUpNum()) {
               return false;
            } else if (this.hasThumbsUpNum() && this.getThumbsUpNum() != other.getThumbsUpNum()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasPoint()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPoint();
            }

            if (this.hasFightNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getFightNum();
            }

            if (this.hasDrawFreeNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getDrawFreeNum();
            }

            if (this.hasStartTime()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashLong(this.getStartTime());
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashLong(this.getEndTime());
            }

            if (this.hasDownTime()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + Internal.hashLong(this.getDownTime());
            }

            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            if (this.hasIsSkip()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + Internal.hashBoolean(this.getIsSkip());
            }

            if (this.getTakedIdsCount() > 0) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getTakedIdsList().hashCode();
            }

            if (this.hasThumbsUpNum()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getThumbsUpNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OpenPvpUiResult_6802 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenPvpUiResult_6802)PARSER.parseFrom(data);
      }

      public static S2C_OpenPvpUiResult_6802 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenPvpUiResult_6802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenPvpUiResult_6802 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenPvpUiResult_6802)PARSER.parseFrom(data);
      }

      public static S2C_OpenPvpUiResult_6802 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenPvpUiResult_6802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenPvpUiResult_6802 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenPvpUiResult_6802)PARSER.parseFrom(data);
      }

      public static S2C_OpenPvpUiResult_6802 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenPvpUiResult_6802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenPvpUiResult_6802 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenPvpUiResult_6802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenPvpUiResult_6802 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenPvpUiResult_6802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenPvpUiResult_6802 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenPvpUiResult_6802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenPvpUiResult_6802 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenPvpUiResult_6802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenPvpUiResult_6802 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenPvpUiResult_6802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenPvpUiResult_6802 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenPvpUiResult_6802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenPvpUiResult_6802 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenPvpUiResult_6802 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenPvpUiResult_6802> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenPvpUiResult_6802> getParserForType() {
         return PARSER;
      }

      public S2C_OpenPvpUiResult_6802 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenPvpUiResult_6802OrBuilder {
         private int bitField0_;
         private int rank_;
         private int point_;
         private int fightNum_;
         private int drawFreeNum_;
         private long startTime_;
         private long endTime_;
         private long downTime_;
         private List<PvpPlayerInfo> infos_;
         private RepeatedFieldBuilderV3<PvpPlayerInfo, PvpPlayerInfo.Builder, PvpPlayerInfoOrBuilder> infosBuilder_;
         private boolean isSkip_;
         private Internal.IntList takedIds_;
         private int thumbsUpNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_OpenPvpUiResult_6802_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_OpenPvpUiResult_6802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenPvpUiResult_6802.class, Builder.class);
         }

         private Builder() {
            this.infos_ = Collections.emptyList();
            this.takedIds_ = PvpMsg.S2C_OpenPvpUiResult_6802.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.infos_ = Collections.emptyList();
            this.takedIds_ = PvpMsg.S2C_OpenPvpUiResult_6802.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PvpMsg.S2C_OpenPvpUiResult_6802.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.point_ = 0;
            this.bitField0_ &= -3;
            this.fightNum_ = 0;
            this.bitField0_ &= -5;
            this.drawFreeNum_ = 0;
            this.bitField0_ &= -9;
            this.startTime_ = 0L;
            this.bitField0_ &= -17;
            this.endTime_ = 0L;
            this.bitField0_ &= -33;
            this.downTime_ = 0L;
            this.bitField0_ &= -65;
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -129;
            } else {
               this.infosBuilder_.clear();
            }

            this.isSkip_ = false;
            this.bitField0_ &= -257;
            this.takedIds_ = PvpMsg.S2C_OpenPvpUiResult_6802.emptyIntList();
            this.bitField0_ &= -513;
            this.thumbsUpNum_ = 0;
            this.bitField0_ &= -1025;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_OpenPvpUiResult_6802_descriptor;
         }

         public S2C_OpenPvpUiResult_6802 getDefaultInstanceForType() {
            return PvpMsg.S2C_OpenPvpUiResult_6802.getDefaultInstance();
         }

         public S2C_OpenPvpUiResult_6802 build() {
            S2C_OpenPvpUiResult_6802 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenPvpUiResult_6802 buildPartial() {
            S2C_OpenPvpUiResult_6802 result = new S2C_OpenPvpUiResult_6802(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.point_ = this.point_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.fightNum_ = this.fightNum_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.drawFreeNum_ = this.drawFreeNum_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.startTime_ = this.startTime_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.downTime_ = this.downTime_;
               to_bitField0_ |= 64;
            }

            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 128) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -129;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
            }

            if ((from_bitField0_ & 256) != 0) {
               result.isSkip_ = this.isSkip_;
               to_bitField0_ |= 128;
            }

            if ((this.bitField0_ & 512) != 0) {
               this.takedIds_.makeImmutable();
               this.bitField0_ &= -513;
            }

            result.takedIds_ = this.takedIds_;
            if ((from_bitField0_ & 1024) != 0) {
               result.thumbsUpNum_ = this.thumbsUpNum_;
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
            if (other instanceof S2C_OpenPvpUiResult_6802) {
               return this.mergeFrom((S2C_OpenPvpUiResult_6802)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenPvpUiResult_6802 other) {
            if (other == PvpMsg.S2C_OpenPvpUiResult_6802.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasPoint()) {
                  this.setPoint(other.getPoint());
               }

               if (other.hasFightNum()) {
                  this.setFightNum(other.getFightNum());
               }

               if (other.hasDrawFreeNum()) {
                  this.setDrawFreeNum(other.getDrawFreeNum());
               }

               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasDownTime()) {
                  this.setDownTime(other.getDownTime());
               }

               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -129;
                     } else {
                        this.ensureInfosIsMutable();
                        this.infos_.addAll(other.infos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.infos_.isEmpty()) {
                  if (this.infosBuilder_.isEmpty()) {
                     this.infosBuilder_.dispose();
                     this.infosBuilder_ = null;
                     this.infos_ = other.infos_;
                     this.bitField0_ &= -129;
                     this.infosBuilder_ = PvpMsg.S2C_OpenPvpUiResult_6802.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               if (other.hasIsSkip()) {
                  this.setIsSkip(other.getIsSkip());
               }

               if (!other.takedIds_.isEmpty()) {
                  if (this.takedIds_.isEmpty()) {
                     this.takedIds_ = other.takedIds_;
                     this.bitField0_ &= -513;
                  } else {
                     this.ensureTakedIdsIsMutable();
                     this.takedIds_.addAll(other.takedIds_);
                  }

                  this.onChanged();
               }

               if (other.hasThumbsUpNum()) {
                  this.setThumbsUpNum(other.getThumbsUpNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRank()) {
               return false;
            } else if (!this.hasPoint()) {
               return false;
            } else if (!this.hasFightNum()) {
               return false;
            } else if (!this.hasDrawFreeNum()) {
               return false;
            } else if (!this.hasStartTime()) {
               return false;
            } else if (!this.hasEndTime()) {
               return false;
            } else if (!this.hasDownTime()) {
               return false;
            } else if (!this.hasIsSkip()) {
               return false;
            } else if (!this.hasThumbsUpNum()) {
               return false;
            } else {
               for(int i = 0; i < this.getInfosCount(); ++i) {
                  if (!this.getInfos(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OpenPvpUiResult_6802 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenPvpUiResult_6802)PvpMsg.S2C_OpenPvpUiResult_6802.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenPvpUiResult_6802)e.getUnfinishedMessage();
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

         public boolean hasPoint() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPoint() {
            return this.point_;
         }

         public Builder setPoint(int value) {
            this.bitField0_ |= 2;
            this.point_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPoint() {
            this.bitField0_ &= -3;
            this.point_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFightNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getFightNum() {
            return this.fightNum_;
         }

         public Builder setFightNum(int value) {
            this.bitField0_ |= 4;
            this.fightNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFightNum() {
            this.bitField0_ &= -5;
            this.fightNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDrawFreeNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getDrawFreeNum() {
            return this.drawFreeNum_;
         }

         public Builder setDrawFreeNum(int value) {
            this.bitField0_ |= 8;
            this.drawFreeNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDrawFreeNum() {
            this.bitField0_ &= -9;
            this.drawFreeNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStartTime() {
            return (this.bitField0_ & 16) != 0;
         }

         public long getStartTime() {
            return this.startTime_;
         }

         public Builder setStartTime(long value) {
            this.bitField0_ |= 16;
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTime() {
            this.bitField0_ &= -17;
            this.startTime_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 32) != 0;
         }

         public long getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(long value) {
            this.bitField0_ |= 32;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -33;
            this.endTime_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasDownTime() {
            return (this.bitField0_ & 64) != 0;
         }

         public long getDownTime() {
            return this.downTime_;
         }

         public Builder setDownTime(long value) {
            this.bitField0_ |= 64;
            this.downTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDownTime() {
            this.bitField0_ &= -65;
            this.downTime_ = 0L;
            this.onChanged();
            return this;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 128) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 128;
            }

         }

         public List<PvpPlayerInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public PvpPlayerInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (PvpPlayerInfo)this.infos_.get(index) : (PvpPlayerInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, PvpPlayerInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.set(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setInfos(int index, PvpPlayerInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(PvpPlayerInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addInfos(int index, PvpPlayerInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addInfos(PvpPlayerInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, PvpPlayerInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends PvpPlayerInfo> values) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.infos_);
               this.onChanged();
            } else {
               this.infosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearInfos() {
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -129;
               this.onChanged();
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Builder removeInfos(int index) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.remove(index);
               this.onChanged();
            } else {
               this.infosBuilder_.remove(index);
            }

            return this;
         }

         public PvpPlayerInfo.Builder getInfosBuilder(int index) {
            return (PvpPlayerInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public PvpPlayerInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (PvpPlayerInfoOrBuilder)this.infos_.get(index) : (PvpPlayerInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends PvpPlayerInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public PvpPlayerInfo.Builder addInfosBuilder() {
            return (PvpPlayerInfo.Builder)this.getInfosFieldBuilder().addBuilder(PvpMsg.PvpPlayerInfo.getDefaultInstance());
         }

         public PvpPlayerInfo.Builder addInfosBuilder(int index) {
            return (PvpPlayerInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, PvpMsg.PvpPlayerInfo.getDefaultInstance());
         }

         public List<PvpPlayerInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PvpPlayerInfo, PvpPlayerInfo.Builder, PvpPlayerInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 128) != 0, this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         public boolean hasIsSkip() {
            return (this.bitField0_ & 256) != 0;
         }

         public boolean getIsSkip() {
            return this.isSkip_;
         }

         public Builder setIsSkip(boolean value) {
            this.bitField0_ |= 256;
            this.isSkip_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsSkip() {
            this.bitField0_ &= -257;
            this.isSkip_ = false;
            this.onChanged();
            return this;
         }

         private void ensureTakedIdsIsMutable() {
            if ((this.bitField0_ & 512) == 0) {
               this.takedIds_ = PvpMsg.S2C_OpenPvpUiResult_6802.mutableCopy(this.takedIds_);
               this.bitField0_ |= 512;
            }

         }

         public List<Integer> getTakedIdsList() {
            return (List<Integer>)((this.bitField0_ & 512) != 0 ? Collections.unmodifiableList(this.takedIds_) : this.takedIds_);
         }

         public int getTakedIdsCount() {
            return this.takedIds_.size();
         }

         public int getTakedIds(int index) {
            return this.takedIds_.getInt(index);
         }

         public Builder setTakedIds(int index, int value) {
            this.ensureTakedIdsIsMutable();
            this.takedIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTakedIds(int value) {
            this.ensureTakedIdsIsMutable();
            this.takedIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTakedIds(Iterable<? extends Integer> values) {
            this.ensureTakedIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.takedIds_);
            this.onChanged();
            return this;
         }

         public Builder clearTakedIds() {
            this.takedIds_ = PvpMsg.S2C_OpenPvpUiResult_6802.emptyIntList();
            this.bitField0_ &= -513;
            this.onChanged();
            return this;
         }

         public boolean hasThumbsUpNum() {
            return (this.bitField0_ & 1024) != 0;
         }

         public int getThumbsUpNum() {
            return this.thumbsUpNum_;
         }

         public Builder setThumbsUpNum(int value) {
            this.bitField0_ |= 1024;
            this.thumbsUpNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearThumbsUpNum() {
            this.bitField0_ &= -1025;
            this.thumbsUpNum_ = 0;
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

   public static final class C2S_FlushPvpList_6803 extends GeneratedMessageV3 implements C2S_FlushPvpList_6803OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_FlushPvpList_6803 DEFAULT_INSTANCE = new C2S_FlushPvpList_6803();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FlushPvpList_6803> PARSER = new AbstractParser<C2S_FlushPvpList_6803>() {
         public C2S_FlushPvpList_6803 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FlushPvpList_6803(input, extensionRegistry);
         }
      };

      private C2S_FlushPvpList_6803(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FlushPvpList_6803() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FlushPvpList_6803();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FlushPvpList_6803(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_FlushPvpList_6803_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_FlushPvpList_6803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FlushPvpList_6803.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FlushPvpList_6803)) {
            return super.equals(obj);
         } else {
            C2S_FlushPvpList_6803 other = (C2S_FlushPvpList_6803)obj;
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

      public static C2S_FlushPvpList_6803 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FlushPvpList_6803)PARSER.parseFrom(data);
      }

      public static C2S_FlushPvpList_6803 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FlushPvpList_6803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FlushPvpList_6803 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FlushPvpList_6803)PARSER.parseFrom(data);
      }

      public static C2S_FlushPvpList_6803 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FlushPvpList_6803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FlushPvpList_6803 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FlushPvpList_6803)PARSER.parseFrom(data);
      }

      public static C2S_FlushPvpList_6803 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FlushPvpList_6803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FlushPvpList_6803 parseFrom(InputStream input) throws IOException {
         return (C2S_FlushPvpList_6803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FlushPvpList_6803 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FlushPvpList_6803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FlushPvpList_6803 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FlushPvpList_6803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FlushPvpList_6803 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FlushPvpList_6803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FlushPvpList_6803 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FlushPvpList_6803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FlushPvpList_6803 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FlushPvpList_6803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FlushPvpList_6803 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FlushPvpList_6803 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FlushPvpList_6803> parser() {
         return PARSER;
      }

      public Parser<C2S_FlushPvpList_6803> getParserForType() {
         return PARSER;
      }

      public C2S_FlushPvpList_6803 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FlushPvpList_6803OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_FlushPvpList_6803_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_FlushPvpList_6803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FlushPvpList_6803.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PvpMsg.C2S_FlushPvpList_6803.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_FlushPvpList_6803_descriptor;
         }

         public C2S_FlushPvpList_6803 getDefaultInstanceForType() {
            return PvpMsg.C2S_FlushPvpList_6803.getDefaultInstance();
         }

         public C2S_FlushPvpList_6803 build() {
            C2S_FlushPvpList_6803 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FlushPvpList_6803 buildPartial() {
            C2S_FlushPvpList_6803 result = new C2S_FlushPvpList_6803(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_FlushPvpList_6803) {
               return this.mergeFrom((C2S_FlushPvpList_6803)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FlushPvpList_6803 other) {
            if (other == PvpMsg.C2S_FlushPvpList_6803.getDefaultInstance()) {
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
            C2S_FlushPvpList_6803 parsedMessage = null;

            try {
               parsedMessage = (C2S_FlushPvpList_6803)PvpMsg.C2S_FlushPvpList_6803.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FlushPvpList_6803)e.getUnfinishedMessage();
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

   public static final class S2C_FlushPvpListResult_6804 extends GeneratedMessageV3 implements S2C_FlushPvpListResult_6804OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<PvpPlayerInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_FlushPvpListResult_6804 DEFAULT_INSTANCE = new S2C_FlushPvpListResult_6804();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FlushPvpListResult_6804> PARSER = new AbstractParser<S2C_FlushPvpListResult_6804>() {
         public S2C_FlushPvpListResult_6804 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FlushPvpListResult_6804(input, extensionRegistry);
         }
      };

      private S2C_FlushPvpListResult_6804(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FlushPvpListResult_6804() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FlushPvpListResult_6804();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FlushPvpListResult_6804(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.infos_.add(input.readMessage(PvpMsg.PvpPlayerInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_FlushPvpListResult_6804_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_FlushPvpListResult_6804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FlushPvpListResult_6804.class, Builder.class);
      }

      public List<PvpPlayerInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends PvpPlayerInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public PvpPlayerInfo getInfos(int index) {
         return (PvpPlayerInfo)this.infos_.get(index);
      }

      public PvpPlayerInfoOrBuilder getInfosOrBuilder(int index) {
         return (PvpPlayerInfoOrBuilder)this.infos_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.infos_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.infos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FlushPvpListResult_6804)) {
            return super.equals(obj);
         } else {
            S2C_FlushPvpListResult_6804 other = (S2C_FlushPvpListResult_6804)obj;
            if (!this.getInfosList().equals(other.getInfosList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FlushPvpListResult_6804 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FlushPvpListResult_6804)PARSER.parseFrom(data);
      }

      public static S2C_FlushPvpListResult_6804 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FlushPvpListResult_6804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FlushPvpListResult_6804 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FlushPvpListResult_6804)PARSER.parseFrom(data);
      }

      public static S2C_FlushPvpListResult_6804 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FlushPvpListResult_6804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FlushPvpListResult_6804 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FlushPvpListResult_6804)PARSER.parseFrom(data);
      }

      public static S2C_FlushPvpListResult_6804 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FlushPvpListResult_6804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FlushPvpListResult_6804 parseFrom(InputStream input) throws IOException {
         return (S2C_FlushPvpListResult_6804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FlushPvpListResult_6804 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FlushPvpListResult_6804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FlushPvpListResult_6804 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FlushPvpListResult_6804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FlushPvpListResult_6804 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FlushPvpListResult_6804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FlushPvpListResult_6804 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FlushPvpListResult_6804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FlushPvpListResult_6804 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FlushPvpListResult_6804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FlushPvpListResult_6804 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FlushPvpListResult_6804 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FlushPvpListResult_6804> parser() {
         return PARSER;
      }

      public Parser<S2C_FlushPvpListResult_6804> getParserForType() {
         return PARSER;
      }

      public S2C_FlushPvpListResult_6804 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FlushPvpListResult_6804OrBuilder {
         private int bitField0_;
         private List<PvpPlayerInfo> infos_;
         private RepeatedFieldBuilderV3<PvpPlayerInfo, PvpPlayerInfo.Builder, PvpPlayerInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_FlushPvpListResult_6804_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_FlushPvpListResult_6804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FlushPvpListResult_6804.class, Builder.class);
         }

         private Builder() {
            this.infos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.infos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PvpMsg.S2C_FlushPvpListResult_6804.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_FlushPvpListResult_6804_descriptor;
         }

         public S2C_FlushPvpListResult_6804 getDefaultInstanceForType() {
            return PvpMsg.S2C_FlushPvpListResult_6804.getDefaultInstance();
         }

         public S2C_FlushPvpListResult_6804 build() {
            S2C_FlushPvpListResult_6804 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FlushPvpListResult_6804 buildPartial() {
            S2C_FlushPvpListResult_6804 result = new S2C_FlushPvpListResult_6804(this);
            int from_bitField0_ = this.bitField0_;
            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -2;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
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
            if (other instanceof S2C_FlushPvpListResult_6804) {
               return this.mergeFrom((S2C_FlushPvpListResult_6804)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FlushPvpListResult_6804 other) {
            if (other == PvpMsg.S2C_FlushPvpListResult_6804.getDefaultInstance()) {
               return this;
            } else {
               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureInfosIsMutable();
                        this.infos_.addAll(other.infos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.infos_.isEmpty()) {
                  if (this.infosBuilder_.isEmpty()) {
                     this.infosBuilder_.dispose();
                     this.infosBuilder_ = null;
                     this.infos_ = other.infos_;
                     this.bitField0_ &= -2;
                     this.infosBuilder_ = PvpMsg.S2C_FlushPvpListResult_6804.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FlushPvpListResult_6804 parsedMessage = null;

            try {
               parsedMessage = (S2C_FlushPvpListResult_6804)PvpMsg.S2C_FlushPvpListResult_6804.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FlushPvpListResult_6804)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 1;
            }

         }

         public List<PvpPlayerInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public PvpPlayerInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (PvpPlayerInfo)this.infos_.get(index) : (PvpPlayerInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, PvpPlayerInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.set(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setInfos(int index, PvpPlayerInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(PvpPlayerInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addInfos(int index, PvpPlayerInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addInfos(PvpPlayerInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, PvpPlayerInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends PvpPlayerInfo> values) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.infos_);
               this.onChanged();
            } else {
               this.infosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearInfos() {
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Builder removeInfos(int index) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.remove(index);
               this.onChanged();
            } else {
               this.infosBuilder_.remove(index);
            }

            return this;
         }

         public PvpPlayerInfo.Builder getInfosBuilder(int index) {
            return (PvpPlayerInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public PvpPlayerInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (PvpPlayerInfoOrBuilder)this.infos_.get(index) : (PvpPlayerInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends PvpPlayerInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public PvpPlayerInfo.Builder addInfosBuilder() {
            return (PvpPlayerInfo.Builder)this.getInfosFieldBuilder().addBuilder(PvpMsg.PvpPlayerInfo.getDefaultInstance());
         }

         public PvpPlayerInfo.Builder addInfosBuilder(int index) {
            return (PvpPlayerInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, PvpMsg.PvpPlayerInfo.getDefaultInstance());
         }

         public List<PvpPlayerInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PvpPlayerInfo, PvpPlayerInfo.Builder, PvpPlayerInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class FightPlayerInfo extends GeneratedMessageV3 implements FightPlayerInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LEFT_FIELD_NUMBER = 1;
      private int left_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int NAME_FIELD_NUMBER = 3;
      private volatile Object name_;
      public static final int HEAD_FIELD_NUMBER = 4;
      private int head_;
      public static final int LV_FIELD_NUMBER = 5;
      private int lv_;
      public static final int SCORE_FIELD_NUMBER = 6;
      private int score_;
      public static final int SCORECHANGE_FIELD_NUMBER = 7;
      private int scoreChange_;
      private byte memoizedIsInitialized;
      private static final FightPlayerInfo DEFAULT_INSTANCE = new FightPlayerInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<FightPlayerInfo> PARSER = new AbstractParser<FightPlayerInfo>() {
         public FightPlayerInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new FightPlayerInfo(input, extensionRegistry);
         }
      };

      private FightPlayerInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private FightPlayerInfo() {
         this.memoizedIsInitialized = -1;
         this.name_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new FightPlayerInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private FightPlayerInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.left_ = input.readInt32();
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
                        this.head_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.lv_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.score_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.scoreChange_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_FightPlayerInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_FightPlayerInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(FightPlayerInfo.class, Builder.class);
      }

      public boolean hasLeft() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLeft() {
         return this.left_;
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

      public boolean hasHead() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasLv() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getLv() {
         return this.lv_;
      }

      public boolean hasScore() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getScore() {
         return this.score_;
      }

      public boolean hasScoreChange() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getScoreChange() {
         return this.scoreChange_;
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
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasScore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.left_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.name_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.head_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.lv_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.score_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.scoreChange_);
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
               size += CodedOutputStream.computeInt32Size(1, this.left_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.name_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.head_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.lv_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.score_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.scoreChange_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof FightPlayerInfo)) {
            return super.equals(obj);
         } else {
            FightPlayerInfo other = (FightPlayerInfo)obj;
            if (this.hasLeft() != other.hasLeft()) {
               return false;
            } else if (this.hasLeft() && this.getLeft() != other.getLeft()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasName() != other.hasName()) {
               return false;
            } else if (this.hasName() && !this.getName().equals(other.getName())) {
               return false;
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
               return false;
            } else if (this.hasScore() != other.hasScore()) {
               return false;
            } else if (this.hasScore() && this.getScore() != other.getScore()) {
               return false;
            } else if (this.hasScoreChange() != other.hasScoreChange()) {
               return false;
            } else if (this.hasScoreChange() && this.getScoreChange() != other.getScoreChange()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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
               hash = 53 * hash + this.getLeft();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasName()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getName().hashCode();
            }

            if (this.hasHead()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasLv()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getLv();
            }

            if (this.hasScore()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getScore();
            }

            if (this.hasScoreChange()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getScoreChange();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static FightPlayerInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (FightPlayerInfo)PARSER.parseFrom(data);
      }

      public static FightPlayerInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FightPlayerInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FightPlayerInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (FightPlayerInfo)PARSER.parseFrom(data);
      }

      public static FightPlayerInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FightPlayerInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FightPlayerInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (FightPlayerInfo)PARSER.parseFrom(data);
      }

      public static FightPlayerInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FightPlayerInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FightPlayerInfo parseFrom(InputStream input) throws IOException {
         return (FightPlayerInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static FightPlayerInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FightPlayerInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static FightPlayerInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (FightPlayerInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static FightPlayerInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FightPlayerInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static FightPlayerInfo parseFrom(CodedInputStream input) throws IOException {
         return (FightPlayerInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static FightPlayerInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FightPlayerInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(FightPlayerInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static FightPlayerInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<FightPlayerInfo> parser() {
         return PARSER;
      }

      public Parser<FightPlayerInfo> getParserForType() {
         return PARSER;
      }

      public FightPlayerInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FightPlayerInfoOrBuilder {
         private int bitField0_;
         private int left_;
         private int playerId_;
         private Object name_;
         private int head_;
         private int lv_;
         private int score_;
         private int scoreChange_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_FightPlayerInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_FightPlayerInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(FightPlayerInfo.class, Builder.class);
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
            if (PvpMsg.FightPlayerInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.left_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.name_ = "";
            this.bitField0_ &= -5;
            this.head_ = 0;
            this.bitField0_ &= -9;
            this.lv_ = 0;
            this.bitField0_ &= -17;
            this.score_ = 0;
            this.bitField0_ &= -33;
            this.scoreChange_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_FightPlayerInfo_descriptor;
         }

         public FightPlayerInfo getDefaultInstanceForType() {
            return PvpMsg.FightPlayerInfo.getDefaultInstance();
         }

         public FightPlayerInfo build() {
            FightPlayerInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public FightPlayerInfo buildPartial() {
            FightPlayerInfo result = new FightPlayerInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.left_ = this.left_;
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
               result.head_ = this.head_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.lv_ = this.lv_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.score_ = this.score_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.scoreChange_ = this.scoreChange_;
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
            if (other instanceof FightPlayerInfo) {
               return this.mergeFrom((FightPlayerInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(FightPlayerInfo other) {
            if (other == PvpMsg.FightPlayerInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLeft()) {
                  this.setLeft(other.getLeft());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasName()) {
                  this.bitField0_ |= 4;
                  this.name_ = other.name_;
                  this.onChanged();
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               if (other.hasScore()) {
                  this.setScore(other.getScore());
               }

               if (other.hasScoreChange()) {
                  this.setScoreChange(other.getScoreChange());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasLeft()) {
               return false;
            } else if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasName()) {
               return false;
            } else if (!this.hasHead()) {
               return false;
            } else if (!this.hasLv()) {
               return false;
            } else {
               return this.hasScore();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            FightPlayerInfo parsedMessage = null;

            try {
               parsedMessage = (FightPlayerInfo)PvpMsg.FightPlayerInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (FightPlayerInfo)e.getUnfinishedMessage();
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

         public int getLeft() {
            return this.left_;
         }

         public Builder setLeft(int value) {
            this.bitField0_ |= 1;
            this.left_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLeft() {
            this.bitField0_ &= -2;
            this.left_ = 0;
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
            this.name_ = PvpMsg.FightPlayerInfo.getDefaultInstance().getName();
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

         public boolean hasScoreChange() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getScoreChange() {
            return this.scoreChange_;
         }

         public Builder setScoreChange(int value) {
            this.bitField0_ |= 64;
            this.scoreChange_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearScoreChange() {
            this.bitField0_ &= -65;
            this.scoreChange_ = 0;
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

   public static final class S2C_TakeAwardsResult_6806 extends GeneratedMessageV3 implements S2C_TakeAwardsResult_6806OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int POINT_FIELD_NUMBER = 2;
      private int point_;
      public static final int FIGHTNUM_FIELD_NUMBER = 3;
      private int fightNum_;
      public static final int DRAWFREENUM_FIELD_NUMBER = 4;
      private int drawFreeNum_;
      public static final int INFOS_FIELD_NUMBER = 8;
      private List<PvpPlayerInfo> infos_;
      public static final int ISSKIP_FIELD_NUMBER = 9;
      private boolean isSkip_;
      private byte memoizedIsInitialized;
      private static final S2C_TakeAwardsResult_6806 DEFAULT_INSTANCE = new S2C_TakeAwardsResult_6806();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TakeAwardsResult_6806> PARSER = new AbstractParser<S2C_TakeAwardsResult_6806>() {
         public S2C_TakeAwardsResult_6806 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TakeAwardsResult_6806(input, extensionRegistry);
         }
      };

      private S2C_TakeAwardsResult_6806(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TakeAwardsResult_6806() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TakeAwardsResult_6806();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TakeAwardsResult_6806(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.point_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.fightNum_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.drawFreeNum_ = input.readInt32();
                        break;
                     case 66:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.infos_.add(input.readMessage(PvpMsg.PvpPlayerInfo.PARSER, extensionRegistry));
                        break;
                     case 72:
                        this.bitField0_ |= 16;
                        this.isSkip_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 16) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_TakeAwardsResult_6806_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_TakeAwardsResult_6806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeAwardsResult_6806.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasPoint() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPoint() {
         return this.point_;
      }

      public boolean hasFightNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getFightNum() {
         return this.fightNum_;
      }

      public boolean hasDrawFreeNum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getDrawFreeNum() {
         return this.drawFreeNum_;
      }

      public List<PvpPlayerInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends PvpPlayerInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public PvpPlayerInfo getInfos(int index) {
         return (PvpPlayerInfo)this.infos_.get(index);
      }

      public PvpPlayerInfoOrBuilder getInfosOrBuilder(int index) {
         return (PvpPlayerInfoOrBuilder)this.infos_.get(index);
      }

      public boolean hasIsSkip() {
         return (this.bitField0_ & 16) != 0;
      }

      public boolean getIsSkip() {
         return this.isSkip_;
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
         } else if (!this.hasPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFightNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDrawFreeNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsSkip()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
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
            output.writeInt32(1, this.rank_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.point_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.fightNum_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.drawFreeNum_);
         }

         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(8, (MessageLite)this.infos_.get(i));
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeBool(9, this.isSkip_);
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
               size += CodedOutputStream.computeInt32Size(2, this.point_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.fightNum_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.drawFreeNum_);
            }

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(8, (MessageLite)this.infos_.get(i));
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeBoolSize(9, this.isSkip_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TakeAwardsResult_6806)) {
            return super.equals(obj);
         } else {
            S2C_TakeAwardsResult_6806 other = (S2C_TakeAwardsResult_6806)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasPoint() != other.hasPoint()) {
               return false;
            } else if (this.hasPoint() && this.getPoint() != other.getPoint()) {
               return false;
            } else if (this.hasFightNum() != other.hasFightNum()) {
               return false;
            } else if (this.hasFightNum() && this.getFightNum() != other.getFightNum()) {
               return false;
            } else if (this.hasDrawFreeNum() != other.hasDrawFreeNum()) {
               return false;
            } else if (this.hasDrawFreeNum() && this.getDrawFreeNum() != other.getDrawFreeNum()) {
               return false;
            } else if (!this.getInfosList().equals(other.getInfosList())) {
               return false;
            } else if (this.hasIsSkip() != other.hasIsSkip()) {
               return false;
            } else if (this.hasIsSkip() && this.getIsSkip() != other.getIsSkip()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasPoint()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPoint();
            }

            if (this.hasFightNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getFightNum();
            }

            if (this.hasDrawFreeNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getDrawFreeNum();
            }

            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            if (this.hasIsSkip()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + Internal.hashBoolean(this.getIsSkip());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TakeAwardsResult_6806 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TakeAwardsResult_6806)PARSER.parseFrom(data);
      }

      public static S2C_TakeAwardsResult_6806 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeAwardsResult_6806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeAwardsResult_6806 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TakeAwardsResult_6806)PARSER.parseFrom(data);
      }

      public static S2C_TakeAwardsResult_6806 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeAwardsResult_6806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeAwardsResult_6806 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TakeAwardsResult_6806)PARSER.parseFrom(data);
      }

      public static S2C_TakeAwardsResult_6806 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeAwardsResult_6806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeAwardsResult_6806 parseFrom(InputStream input) throws IOException {
         return (S2C_TakeAwardsResult_6806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeAwardsResult_6806 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeAwardsResult_6806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeAwardsResult_6806 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TakeAwardsResult_6806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TakeAwardsResult_6806 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeAwardsResult_6806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeAwardsResult_6806 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TakeAwardsResult_6806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeAwardsResult_6806 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeAwardsResult_6806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TakeAwardsResult_6806 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TakeAwardsResult_6806 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TakeAwardsResult_6806> parser() {
         return PARSER;
      }

      public Parser<S2C_TakeAwardsResult_6806> getParserForType() {
         return PARSER;
      }

      public S2C_TakeAwardsResult_6806 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TakeAwardsResult_6806OrBuilder {
         private int bitField0_;
         private int rank_;
         private int point_;
         private int fightNum_;
         private int drawFreeNum_;
         private List<PvpPlayerInfo> infos_;
         private RepeatedFieldBuilderV3<PvpPlayerInfo, PvpPlayerInfo.Builder, PvpPlayerInfoOrBuilder> infosBuilder_;
         private boolean isSkip_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_TakeAwardsResult_6806_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_TakeAwardsResult_6806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeAwardsResult_6806.class, Builder.class);
         }

         private Builder() {
            this.infos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.infos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PvpMsg.S2C_TakeAwardsResult_6806.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.point_ = 0;
            this.bitField0_ &= -3;
            this.fightNum_ = 0;
            this.bitField0_ &= -5;
            this.drawFreeNum_ = 0;
            this.bitField0_ &= -9;
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.infosBuilder_.clear();
            }

            this.isSkip_ = false;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_TakeAwardsResult_6806_descriptor;
         }

         public S2C_TakeAwardsResult_6806 getDefaultInstanceForType() {
            return PvpMsg.S2C_TakeAwardsResult_6806.getDefaultInstance();
         }

         public S2C_TakeAwardsResult_6806 build() {
            S2C_TakeAwardsResult_6806 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TakeAwardsResult_6806 buildPartial() {
            S2C_TakeAwardsResult_6806 result = new S2C_TakeAwardsResult_6806(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.point_ = this.point_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.fightNum_ = this.fightNum_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.drawFreeNum_ = this.drawFreeNum_;
               to_bitField0_ |= 8;
            }

            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -17;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
            }

            if ((from_bitField0_ & 32) != 0) {
               result.isSkip_ = this.isSkip_;
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
            if (other instanceof S2C_TakeAwardsResult_6806) {
               return this.mergeFrom((S2C_TakeAwardsResult_6806)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TakeAwardsResult_6806 other) {
            if (other == PvpMsg.S2C_TakeAwardsResult_6806.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasPoint()) {
                  this.setPoint(other.getPoint());
               }

               if (other.hasFightNum()) {
                  this.setFightNum(other.getFightNum());
               }

               if (other.hasDrawFreeNum()) {
                  this.setDrawFreeNum(other.getDrawFreeNum());
               }

               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureInfosIsMutable();
                        this.infos_.addAll(other.infos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.infos_.isEmpty()) {
                  if (this.infosBuilder_.isEmpty()) {
                     this.infosBuilder_.dispose();
                     this.infosBuilder_ = null;
                     this.infos_ = other.infos_;
                     this.bitField0_ &= -17;
                     this.infosBuilder_ = PvpMsg.S2C_TakeAwardsResult_6806.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               if (other.hasIsSkip()) {
                  this.setIsSkip(other.getIsSkip());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRank()) {
               return false;
            } else if (!this.hasPoint()) {
               return false;
            } else if (!this.hasFightNum()) {
               return false;
            } else if (!this.hasDrawFreeNum()) {
               return false;
            } else if (!this.hasIsSkip()) {
               return false;
            } else {
               for(int i = 0; i < this.getInfosCount(); ++i) {
                  if (!this.getInfos(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TakeAwardsResult_6806 parsedMessage = null;

            try {
               parsedMessage = (S2C_TakeAwardsResult_6806)PvpMsg.S2C_TakeAwardsResult_6806.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TakeAwardsResult_6806)e.getUnfinishedMessage();
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

         public boolean hasPoint() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPoint() {
            return this.point_;
         }

         public Builder setPoint(int value) {
            this.bitField0_ |= 2;
            this.point_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPoint() {
            this.bitField0_ &= -3;
            this.point_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFightNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getFightNum() {
            return this.fightNum_;
         }

         public Builder setFightNum(int value) {
            this.bitField0_ |= 4;
            this.fightNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFightNum() {
            this.bitField0_ &= -5;
            this.fightNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDrawFreeNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getDrawFreeNum() {
            return this.drawFreeNum_;
         }

         public Builder setDrawFreeNum(int value) {
            this.bitField0_ |= 8;
            this.drawFreeNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDrawFreeNum() {
            this.bitField0_ &= -9;
            this.drawFreeNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 16;
            }

         }

         public List<PvpPlayerInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public PvpPlayerInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (PvpPlayerInfo)this.infos_.get(index) : (PvpPlayerInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, PvpPlayerInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.set(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setInfos(int index, PvpPlayerInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(PvpPlayerInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addInfos(int index, PvpPlayerInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addInfos(PvpPlayerInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, PvpPlayerInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends PvpPlayerInfo> values) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.infos_);
               this.onChanged();
            } else {
               this.infosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearInfos() {
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Builder removeInfos(int index) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.remove(index);
               this.onChanged();
            } else {
               this.infosBuilder_.remove(index);
            }

            return this;
         }

         public PvpPlayerInfo.Builder getInfosBuilder(int index) {
            return (PvpPlayerInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public PvpPlayerInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (PvpPlayerInfoOrBuilder)this.infos_.get(index) : (PvpPlayerInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends PvpPlayerInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public PvpPlayerInfo.Builder addInfosBuilder() {
            return (PvpPlayerInfo.Builder)this.getInfosFieldBuilder().addBuilder(PvpMsg.PvpPlayerInfo.getDefaultInstance());
         }

         public PvpPlayerInfo.Builder addInfosBuilder(int index) {
            return (PvpPlayerInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, PvpMsg.PvpPlayerInfo.getDefaultInstance());
         }

         public List<PvpPlayerInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PvpPlayerInfo, PvpPlayerInfo.Builder, PvpPlayerInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         public boolean hasIsSkip() {
            return (this.bitField0_ & 32) != 0;
         }

         public boolean getIsSkip() {
            return this.isSkip_;
         }

         public Builder setIsSkip(boolean value) {
            this.bitField0_ |= 32;
            this.isSkip_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsSkip() {
            this.bitField0_ &= -33;
            this.isSkip_ = false;
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

   public static final class C2S_PvpRank_6807 extends GeneratedMessageV3 implements C2S_PvpRank_6807OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_PvpRank_6807 DEFAULT_INSTANCE = new C2S_PvpRank_6807();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PvpRank_6807> PARSER = new AbstractParser<C2S_PvpRank_6807>() {
         public C2S_PvpRank_6807 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PvpRank_6807(input, extensionRegistry);
         }
      };

      private C2S_PvpRank_6807(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PvpRank_6807() {
         this.memoizedIsInitialized = -1;
         this.type_ = 0;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PvpRank_6807();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PvpRank_6807(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        PvpRankType value = PvpMsg.PvpRankType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.type_ = rawValue;
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
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_PvpRank_6807_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_PvpRank_6807_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PvpRank_6807.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public PvpRankType getType() {
         PvpRankType result = PvpMsg.PvpRankType.valueOf(this.type_);
         return result == null ? PvpMsg.PvpRankType.PvpRankType_Rank100 : result;
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
            output.writeEnum(1, this.type_);
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
               size += CodedOutputStream.computeEnumSize(1, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PvpRank_6807)) {
            return super.equals(obj);
         } else {
            C2S_PvpRank_6807 other = (C2S_PvpRank_6807)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.type_ != other.type_) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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
               hash = 53 * hash + this.type_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PvpRank_6807 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PvpRank_6807)PARSER.parseFrom(data);
      }

      public static C2S_PvpRank_6807 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PvpRank_6807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PvpRank_6807 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PvpRank_6807)PARSER.parseFrom(data);
      }

      public static C2S_PvpRank_6807 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PvpRank_6807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PvpRank_6807 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PvpRank_6807)PARSER.parseFrom(data);
      }

      public static C2S_PvpRank_6807 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PvpRank_6807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PvpRank_6807 parseFrom(InputStream input) throws IOException {
         return (C2S_PvpRank_6807)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PvpRank_6807 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PvpRank_6807)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PvpRank_6807 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PvpRank_6807)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PvpRank_6807 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PvpRank_6807)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PvpRank_6807 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PvpRank_6807)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PvpRank_6807 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PvpRank_6807)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PvpRank_6807 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PvpRank_6807 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PvpRank_6807> parser() {
         return PARSER;
      }

      public Parser<C2S_PvpRank_6807> getParserForType() {
         return PARSER;
      }

      public C2S_PvpRank_6807 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PvpRank_6807OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_PvpRank_6807_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_PvpRank_6807_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PvpRank_6807.class, Builder.class);
         }

         private Builder() {
            this.type_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.type_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PvpMsg.C2S_PvpRank_6807.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_PvpRank_6807_descriptor;
         }

         public C2S_PvpRank_6807 getDefaultInstanceForType() {
            return PvpMsg.C2S_PvpRank_6807.getDefaultInstance();
         }

         public C2S_PvpRank_6807 build() {
            C2S_PvpRank_6807 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PvpRank_6807 buildPartial() {
            C2S_PvpRank_6807 result = new C2S_PvpRank_6807(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.type_ = this.type_;
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
            if (other instanceof C2S_PvpRank_6807) {
               return this.mergeFrom((C2S_PvpRank_6807)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PvpRank_6807 other) {
            if (other == PvpMsg.C2S_PvpRank_6807.getDefaultInstance()) {
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
            C2S_PvpRank_6807 parsedMessage = null;

            try {
               parsedMessage = (C2S_PvpRank_6807)PvpMsg.C2S_PvpRank_6807.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PvpRank_6807)e.getUnfinishedMessage();
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

         public PvpRankType getType() {
            PvpRankType result = PvpMsg.PvpRankType.valueOf(this.type_);
            return result == null ? PvpMsg.PvpRankType.PvpRankType_Rank100 : result;
         }

         public Builder setType(PvpRankType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.type_ = value.getNumber();
               this.onChanged();
               return this;
            }
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

   public static final class S2C_PvpRankResult_6808 extends GeneratedMessageV3 implements S2C_PvpRankResult_6808OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int MYINFO_FIELD_NUMBER = 2;
      private PvpRankInfo myInfo_;
      public static final int PLAYERS_FIELD_NUMBER = 3;
      private List<PvpRankInfo> players_;
      private byte memoizedIsInitialized;
      private static final S2C_PvpRankResult_6808 DEFAULT_INSTANCE = new S2C_PvpRankResult_6808();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PvpRankResult_6808> PARSER = new AbstractParser<S2C_PvpRankResult_6808>() {
         public S2C_PvpRankResult_6808 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PvpRankResult_6808(input, extensionRegistry);
         }
      };

      private S2C_PvpRankResult_6808(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PvpRankResult_6808() {
         this.memoizedIsInitialized = -1;
         this.type_ = 0;
         this.players_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PvpRankResult_6808();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PvpRankResult_6808(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        PvpRankType value = PvpMsg.PvpRankType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.type_ = rawValue;
                        }
                        break;
                     case 18:
                        PvpRankInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.myInfo_.toBuilder();
                        }

                        this.myInfo_ = (PvpRankInfo)input.readMessage(PvpMsg.PvpRankInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.myInfo_);
                           this.myInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.players_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.players_.add(input.readMessage(PvpMsg.PvpRankInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.players_ = Collections.unmodifiableList(this.players_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_PvpRankResult_6808_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_PvpRankResult_6808_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PvpRankResult_6808.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public PvpRankType getType() {
         PvpRankType result = PvpMsg.PvpRankType.valueOf(this.type_);
         return result == null ? PvpMsg.PvpRankType.PvpRankType_Rank100 : result;
      }

      public boolean hasMyInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public PvpRankInfo getMyInfo() {
         return this.myInfo_ == null ? PvpMsg.PvpRankInfo.getDefaultInstance() : this.myInfo_;
      }

      public PvpRankInfoOrBuilder getMyInfoOrBuilder() {
         return this.myInfo_ == null ? PvpMsg.PvpRankInfo.getDefaultInstance() : this.myInfo_;
      }

      public List<PvpRankInfo> getPlayersList() {
         return this.players_;
      }

      public List<? extends PvpRankInfoOrBuilder> getPlayersOrBuilderList() {
         return this.players_;
      }

      public int getPlayersCount() {
         return this.players_.size();
      }

      public PvpRankInfo getPlayers(int index) {
         return (PvpRankInfo)this.players_.get(index);
      }

      public PvpRankInfoOrBuilder getPlayersOrBuilder(int index) {
         return (PvpRankInfoOrBuilder)this.players_.get(index);
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
         } else if (!this.hasMyInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getMyInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getPlayersCount(); ++i) {
               if (!this.getPlayers(i).isInitialized()) {
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
            output.writeEnum(1, this.type_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getMyInfo());
         }

         for(int i = 0; i < this.players_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.players_.get(i));
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
               size += CodedOutputStream.computeEnumSize(1, this.type_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getMyInfo());
            }

            for(int i = 0; i < this.players_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.players_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PvpRankResult_6808)) {
            return super.equals(obj);
         } else {
            S2C_PvpRankResult_6808 other = (S2C_PvpRankResult_6808)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.type_ != other.type_) {
               return false;
            } else if (this.hasMyInfo() != other.hasMyInfo()) {
               return false;
            } else if (this.hasMyInfo() && !this.getMyInfo().equals(other.getMyInfo())) {
               return false;
            } else if (!this.getPlayersList().equals(other.getPlayersList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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
               hash = 53 * hash + this.type_;
            }

            if (this.hasMyInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMyInfo().hashCode();
            }

            if (this.getPlayersCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayersList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PvpRankResult_6808 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PvpRankResult_6808)PARSER.parseFrom(data);
      }

      public static S2C_PvpRankResult_6808 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PvpRankResult_6808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PvpRankResult_6808 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PvpRankResult_6808)PARSER.parseFrom(data);
      }

      public static S2C_PvpRankResult_6808 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PvpRankResult_6808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PvpRankResult_6808 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PvpRankResult_6808)PARSER.parseFrom(data);
      }

      public static S2C_PvpRankResult_6808 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PvpRankResult_6808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PvpRankResult_6808 parseFrom(InputStream input) throws IOException {
         return (S2C_PvpRankResult_6808)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PvpRankResult_6808 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PvpRankResult_6808)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PvpRankResult_6808 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PvpRankResult_6808)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PvpRankResult_6808 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PvpRankResult_6808)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PvpRankResult_6808 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PvpRankResult_6808)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PvpRankResult_6808 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PvpRankResult_6808)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PvpRankResult_6808 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PvpRankResult_6808 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PvpRankResult_6808> parser() {
         return PARSER;
      }

      public Parser<S2C_PvpRankResult_6808> getParserForType() {
         return PARSER;
      }

      public S2C_PvpRankResult_6808 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PvpRankResult_6808OrBuilder {
         private int bitField0_;
         private int type_;
         private PvpRankInfo myInfo_;
         private SingleFieldBuilderV3<PvpRankInfo, PvpRankInfo.Builder, PvpRankInfoOrBuilder> myInfoBuilder_;
         private List<PvpRankInfo> players_;
         private RepeatedFieldBuilderV3<PvpRankInfo, PvpRankInfo.Builder, PvpRankInfoOrBuilder> playersBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_PvpRankResult_6808_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_PvpRankResult_6808_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PvpRankResult_6808.class, Builder.class);
         }

         private Builder() {
            this.type_ = 0;
            this.players_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.type_ = 0;
            this.players_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PvpMsg.S2C_PvpRankResult_6808.alwaysUseFieldBuilders) {
               this.getMyInfoFieldBuilder();
               this.getPlayersFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            if (this.myInfoBuilder_ == null) {
               this.myInfo_ = null;
            } else {
               this.myInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            if (this.playersBuilder_ == null) {
               this.players_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.playersBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_PvpRankResult_6808_descriptor;
         }

         public S2C_PvpRankResult_6808 getDefaultInstanceForType() {
            return PvpMsg.S2C_PvpRankResult_6808.getDefaultInstance();
         }

         public S2C_PvpRankResult_6808 build() {
            S2C_PvpRankResult_6808 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PvpRankResult_6808 buildPartial() {
            S2C_PvpRankResult_6808 result = new S2C_PvpRankResult_6808(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.type_ = this.type_;
            if ((from_bitField0_ & 2) != 0) {
               if (this.myInfoBuilder_ == null) {
                  result.myInfo_ = this.myInfo_;
               } else {
                  result.myInfo_ = (PvpRankInfo)this.myInfoBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if (this.playersBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.players_ = Collections.unmodifiableList(this.players_);
                  this.bitField0_ &= -5;
               }

               result.players_ = this.players_;
            } else {
               result.players_ = this.playersBuilder_.build();
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
            if (other instanceof S2C_PvpRankResult_6808) {
               return this.mergeFrom((S2C_PvpRankResult_6808)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PvpRankResult_6808 other) {
            if (other == PvpMsg.S2C_PvpRankResult_6808.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasMyInfo()) {
                  this.mergeMyInfo(other.getMyInfo());
               }

               if (this.playersBuilder_ == null) {
                  if (!other.players_.isEmpty()) {
                     if (this.players_.isEmpty()) {
                        this.players_ = other.players_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensurePlayersIsMutable();
                        this.players_.addAll(other.players_);
                     }

                     this.onChanged();
                  }
               } else if (!other.players_.isEmpty()) {
                  if (this.playersBuilder_.isEmpty()) {
                     this.playersBuilder_.dispose();
                     this.playersBuilder_ = null;
                     this.players_ = other.players_;
                     this.bitField0_ &= -5;
                     this.playersBuilder_ = PvpMsg.S2C_PvpRankResult_6808.alwaysUseFieldBuilders ? this.getPlayersFieldBuilder() : null;
                  } else {
                     this.playersBuilder_.addAllMessages(other.players_);
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
            } else if (!this.hasMyInfo()) {
               return false;
            } else if (!this.getMyInfo().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getPlayersCount(); ++i) {
                  if (!this.getPlayers(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PvpRankResult_6808 parsedMessage = null;

            try {
               parsedMessage = (S2C_PvpRankResult_6808)PvpMsg.S2C_PvpRankResult_6808.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PvpRankResult_6808)e.getUnfinishedMessage();
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

         public PvpRankType getType() {
            PvpRankType result = PvpMsg.PvpRankType.valueOf(this.type_);
            return result == null ? PvpMsg.PvpRankType.PvpRankType_Rank100 : result;
         }

         public Builder setType(PvpRankType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.type_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMyInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public PvpRankInfo getMyInfo() {
            if (this.myInfoBuilder_ == null) {
               return this.myInfo_ == null ? PvpMsg.PvpRankInfo.getDefaultInstance() : this.myInfo_;
            } else {
               return (PvpRankInfo)this.myInfoBuilder_.getMessage();
            }
         }

         public Builder setMyInfo(PvpRankInfo value) {
            if (this.myInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.myInfo_ = value;
               this.onChanged();
            } else {
               this.myInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setMyInfo(PvpRankInfo.Builder builderForValue) {
            if (this.myInfoBuilder_ == null) {
               this.myInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.myInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeMyInfo(PvpRankInfo value) {
            if (this.myInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.myInfo_ != null && this.myInfo_ != PvpMsg.PvpRankInfo.getDefaultInstance()) {
                  this.myInfo_ = PvpMsg.PvpRankInfo.newBuilder(this.myInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.myInfo_ = value;
               }

               this.onChanged();
            } else {
               this.myInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearMyInfo() {
            if (this.myInfoBuilder_ == null) {
               this.myInfo_ = null;
               this.onChanged();
            } else {
               this.myInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public PvpRankInfo.Builder getMyInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (PvpRankInfo.Builder)this.getMyInfoFieldBuilder().getBuilder();
         }

         public PvpRankInfoOrBuilder getMyInfoOrBuilder() {
            if (this.myInfoBuilder_ != null) {
               return (PvpRankInfoOrBuilder)this.myInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.myInfo_ == null ? PvpMsg.PvpRankInfo.getDefaultInstance() : this.myInfo_;
            }
         }

         private SingleFieldBuilderV3<PvpRankInfo, PvpRankInfo.Builder, PvpRankInfoOrBuilder> getMyInfoFieldBuilder() {
            if (this.myInfoBuilder_ == null) {
               this.myInfoBuilder_ = new SingleFieldBuilderV3(this.getMyInfo(), this.getParentForChildren(), this.isClean());
               this.myInfo_ = null;
            }

            return this.myInfoBuilder_;
         }

         private void ensurePlayersIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.players_ = new ArrayList(this.players_);
               this.bitField0_ |= 4;
            }

         }

         public List<PvpRankInfo> getPlayersList() {
            return this.playersBuilder_ == null ? Collections.unmodifiableList(this.players_) : this.playersBuilder_.getMessageList();
         }

         public int getPlayersCount() {
            return this.playersBuilder_ == null ? this.players_.size() : this.playersBuilder_.getCount();
         }

         public PvpRankInfo getPlayers(int index) {
            return this.playersBuilder_ == null ? (PvpRankInfo)this.players_.get(index) : (PvpRankInfo)this.playersBuilder_.getMessage(index);
         }

         public Builder setPlayers(int index, PvpRankInfo value) {
            if (this.playersBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayersIsMutable();
               this.players_.set(index, value);
               this.onChanged();
            } else {
               this.playersBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPlayers(int index, PvpRankInfo.Builder builderForValue) {
            if (this.playersBuilder_ == null) {
               this.ensurePlayersIsMutable();
               this.players_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playersBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPlayers(PvpRankInfo value) {
            if (this.playersBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayersIsMutable();
               this.players_.add(value);
               this.onChanged();
            } else {
               this.playersBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPlayers(int index, PvpRankInfo value) {
            if (this.playersBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayersIsMutable();
               this.players_.add(index, value);
               this.onChanged();
            } else {
               this.playersBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPlayers(PvpRankInfo.Builder builderForValue) {
            if (this.playersBuilder_ == null) {
               this.ensurePlayersIsMutable();
               this.players_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.playersBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPlayers(int index, PvpRankInfo.Builder builderForValue) {
            if (this.playersBuilder_ == null) {
               this.ensurePlayersIsMutable();
               this.players_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playersBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPlayers(Iterable<? extends PvpRankInfo> values) {
            if (this.playersBuilder_ == null) {
               this.ensurePlayersIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.players_);
               this.onChanged();
            } else {
               this.playersBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPlayers() {
            if (this.playersBuilder_ == null) {
               this.players_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.playersBuilder_.clear();
            }

            return this;
         }

         public Builder removePlayers(int index) {
            if (this.playersBuilder_ == null) {
               this.ensurePlayersIsMutable();
               this.players_.remove(index);
               this.onChanged();
            } else {
               this.playersBuilder_.remove(index);
            }

            return this;
         }

         public PvpRankInfo.Builder getPlayersBuilder(int index) {
            return (PvpRankInfo.Builder)this.getPlayersFieldBuilder().getBuilder(index);
         }

         public PvpRankInfoOrBuilder getPlayersOrBuilder(int index) {
            return this.playersBuilder_ == null ? (PvpRankInfoOrBuilder)this.players_.get(index) : (PvpRankInfoOrBuilder)this.playersBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends PvpRankInfoOrBuilder> getPlayersOrBuilderList() {
            return this.playersBuilder_ != null ? this.playersBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.players_);
         }

         public PvpRankInfo.Builder addPlayersBuilder() {
            return (PvpRankInfo.Builder)this.getPlayersFieldBuilder().addBuilder(PvpMsg.PvpRankInfo.getDefaultInstance());
         }

         public PvpRankInfo.Builder addPlayersBuilder(int index) {
            return (PvpRankInfo.Builder)this.getPlayersFieldBuilder().addBuilder(index, PvpMsg.PvpRankInfo.getDefaultInstance());
         }

         public List<PvpRankInfo.Builder> getPlayersBuilderList() {
            return this.getPlayersFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PvpRankInfo, PvpRankInfo.Builder, PvpRankInfoOrBuilder> getPlayersFieldBuilder() {
            if (this.playersBuilder_ == null) {
               this.playersBuilder_ = new RepeatedFieldBuilderV3(this.players_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.players_ = null;
            }

            return this.playersBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_PvpFightRecord_6809 extends GeneratedMessageV3 implements C2S_PvpFightRecord_6809OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_PvpFightRecord_6809 DEFAULT_INSTANCE = new C2S_PvpFightRecord_6809();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PvpFightRecord_6809> PARSER = new AbstractParser<C2S_PvpFightRecord_6809>() {
         public C2S_PvpFightRecord_6809 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PvpFightRecord_6809(input, extensionRegistry);
         }
      };

      private C2S_PvpFightRecord_6809(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PvpFightRecord_6809() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PvpFightRecord_6809();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PvpFightRecord_6809(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_PvpFightRecord_6809_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_PvpFightRecord_6809_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PvpFightRecord_6809.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PvpFightRecord_6809)) {
            return super.equals(obj);
         } else {
            C2S_PvpFightRecord_6809 other = (C2S_PvpFightRecord_6809)obj;
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

      public static C2S_PvpFightRecord_6809 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PvpFightRecord_6809)PARSER.parseFrom(data);
      }

      public static C2S_PvpFightRecord_6809 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PvpFightRecord_6809)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PvpFightRecord_6809 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PvpFightRecord_6809)PARSER.parseFrom(data);
      }

      public static C2S_PvpFightRecord_6809 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PvpFightRecord_6809)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PvpFightRecord_6809 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PvpFightRecord_6809)PARSER.parseFrom(data);
      }

      public static C2S_PvpFightRecord_6809 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PvpFightRecord_6809)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PvpFightRecord_6809 parseFrom(InputStream input) throws IOException {
         return (C2S_PvpFightRecord_6809)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PvpFightRecord_6809 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PvpFightRecord_6809)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PvpFightRecord_6809 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PvpFightRecord_6809)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PvpFightRecord_6809 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PvpFightRecord_6809)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PvpFightRecord_6809 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PvpFightRecord_6809)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PvpFightRecord_6809 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PvpFightRecord_6809)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PvpFightRecord_6809 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PvpFightRecord_6809 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PvpFightRecord_6809> parser() {
         return PARSER;
      }

      public Parser<C2S_PvpFightRecord_6809> getParserForType() {
         return PARSER;
      }

      public C2S_PvpFightRecord_6809 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PvpFightRecord_6809OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_PvpFightRecord_6809_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_PvpFightRecord_6809_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PvpFightRecord_6809.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PvpMsg.C2S_PvpFightRecord_6809.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_PvpFightRecord_6809_descriptor;
         }

         public C2S_PvpFightRecord_6809 getDefaultInstanceForType() {
            return PvpMsg.C2S_PvpFightRecord_6809.getDefaultInstance();
         }

         public C2S_PvpFightRecord_6809 build() {
            C2S_PvpFightRecord_6809 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PvpFightRecord_6809 buildPartial() {
            C2S_PvpFightRecord_6809 result = new C2S_PvpFightRecord_6809(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_PvpFightRecord_6809) {
               return this.mergeFrom((C2S_PvpFightRecord_6809)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PvpFightRecord_6809 other) {
            if (other == PvpMsg.C2S_PvpFightRecord_6809.getDefaultInstance()) {
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
            C2S_PvpFightRecord_6809 parsedMessage = null;

            try {
               parsedMessage = (C2S_PvpFightRecord_6809)PvpMsg.C2S_PvpFightRecord_6809.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PvpFightRecord_6809)e.getUnfinishedMessage();
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

   public static final class S2C_PvpFightRecordResult_6810 extends GeneratedMessageV3 implements S2C_PvpFightRecordResult_6810OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<PvpRecordInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_PvpFightRecordResult_6810 DEFAULT_INSTANCE = new S2C_PvpFightRecordResult_6810();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PvpFightRecordResult_6810> PARSER = new AbstractParser<S2C_PvpFightRecordResult_6810>() {
         public S2C_PvpFightRecordResult_6810 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PvpFightRecordResult_6810(input, extensionRegistry);
         }
      };

      private S2C_PvpFightRecordResult_6810(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PvpFightRecordResult_6810() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PvpFightRecordResult_6810();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PvpFightRecordResult_6810(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.infos_.add(input.readMessage(PvpMsg.PvpRecordInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_PvpFightRecordResult_6810_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_PvpFightRecordResult_6810_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PvpFightRecordResult_6810.class, Builder.class);
      }

      public List<PvpRecordInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends PvpRecordInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public PvpRecordInfo getInfos(int index) {
         return (PvpRecordInfo)this.infos_.get(index);
      }

      public PvpRecordInfoOrBuilder getInfosOrBuilder(int index) {
         return (PvpRecordInfoOrBuilder)this.infos_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.infos_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.infos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PvpFightRecordResult_6810)) {
            return super.equals(obj);
         } else {
            S2C_PvpFightRecordResult_6810 other = (S2C_PvpFightRecordResult_6810)obj;
            if (!this.getInfosList().equals(other.getInfosList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PvpFightRecordResult_6810 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PvpFightRecordResult_6810)PARSER.parseFrom(data);
      }

      public static S2C_PvpFightRecordResult_6810 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PvpFightRecordResult_6810)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PvpFightRecordResult_6810 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PvpFightRecordResult_6810)PARSER.parseFrom(data);
      }

      public static S2C_PvpFightRecordResult_6810 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PvpFightRecordResult_6810)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PvpFightRecordResult_6810 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PvpFightRecordResult_6810)PARSER.parseFrom(data);
      }

      public static S2C_PvpFightRecordResult_6810 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PvpFightRecordResult_6810)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PvpFightRecordResult_6810 parseFrom(InputStream input) throws IOException {
         return (S2C_PvpFightRecordResult_6810)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PvpFightRecordResult_6810 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PvpFightRecordResult_6810)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PvpFightRecordResult_6810 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PvpFightRecordResult_6810)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PvpFightRecordResult_6810 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PvpFightRecordResult_6810)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PvpFightRecordResult_6810 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PvpFightRecordResult_6810)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PvpFightRecordResult_6810 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PvpFightRecordResult_6810)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PvpFightRecordResult_6810 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PvpFightRecordResult_6810 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PvpFightRecordResult_6810> parser() {
         return PARSER;
      }

      public Parser<S2C_PvpFightRecordResult_6810> getParserForType() {
         return PARSER;
      }

      public S2C_PvpFightRecordResult_6810 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PvpFightRecordResult_6810OrBuilder {
         private int bitField0_;
         private List<PvpRecordInfo> infos_;
         private RepeatedFieldBuilderV3<PvpRecordInfo, PvpRecordInfo.Builder, PvpRecordInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_PvpFightRecordResult_6810_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_PvpFightRecordResult_6810_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PvpFightRecordResult_6810.class, Builder.class);
         }

         private Builder() {
            this.infos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.infos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PvpMsg.S2C_PvpFightRecordResult_6810.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_PvpFightRecordResult_6810_descriptor;
         }

         public S2C_PvpFightRecordResult_6810 getDefaultInstanceForType() {
            return PvpMsg.S2C_PvpFightRecordResult_6810.getDefaultInstance();
         }

         public S2C_PvpFightRecordResult_6810 build() {
            S2C_PvpFightRecordResult_6810 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PvpFightRecordResult_6810 buildPartial() {
            S2C_PvpFightRecordResult_6810 result = new S2C_PvpFightRecordResult_6810(this);
            int from_bitField0_ = this.bitField0_;
            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -2;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
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
            if (other instanceof S2C_PvpFightRecordResult_6810) {
               return this.mergeFrom((S2C_PvpFightRecordResult_6810)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PvpFightRecordResult_6810 other) {
            if (other == PvpMsg.S2C_PvpFightRecordResult_6810.getDefaultInstance()) {
               return this;
            } else {
               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureInfosIsMutable();
                        this.infos_.addAll(other.infos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.infos_.isEmpty()) {
                  if (this.infosBuilder_.isEmpty()) {
                     this.infosBuilder_.dispose();
                     this.infosBuilder_ = null;
                     this.infos_ = other.infos_;
                     this.bitField0_ &= -2;
                     this.infosBuilder_ = PvpMsg.S2C_PvpFightRecordResult_6810.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PvpFightRecordResult_6810 parsedMessage = null;

            try {
               parsedMessage = (S2C_PvpFightRecordResult_6810)PvpMsg.S2C_PvpFightRecordResult_6810.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PvpFightRecordResult_6810)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 1;
            }

         }

         public List<PvpRecordInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public PvpRecordInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (PvpRecordInfo)this.infos_.get(index) : (PvpRecordInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, PvpRecordInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.set(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setInfos(int index, PvpRecordInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(PvpRecordInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addInfos(int index, PvpRecordInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addInfos(PvpRecordInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, PvpRecordInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends PvpRecordInfo> values) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.infos_);
               this.onChanged();
            } else {
               this.infosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearInfos() {
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Builder removeInfos(int index) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.remove(index);
               this.onChanged();
            } else {
               this.infosBuilder_.remove(index);
            }

            return this;
         }

         public PvpRecordInfo.Builder getInfosBuilder(int index) {
            return (PvpRecordInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public PvpRecordInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (PvpRecordInfoOrBuilder)this.infos_.get(index) : (PvpRecordInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends PvpRecordInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public PvpRecordInfo.Builder addInfosBuilder() {
            return (PvpRecordInfo.Builder)this.getInfosFieldBuilder().addBuilder(PvpMsg.PvpRecordInfo.getDefaultInstance());
         }

         public PvpRecordInfo.Builder addInfosBuilder(int index) {
            return (PvpRecordInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, PvpMsg.PvpRecordInfo.getDefaultInstance());
         }

         public List<PvpRecordInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PvpRecordInfo, PvpRecordInfo.Builder, PvpRecordInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_PvpThumbsUp_6811 extends GeneratedMessageV3 implements C2S_PvpThumbsUp_6811OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BETHUMBSUPID_FIELD_NUMBER = 1;
      private int beThumbsUpId_;
      public static final int ISKINGOFCP_FIELD_NUMBER = 2;
      private boolean isKingOfCP_;
      private byte memoizedIsInitialized;
      private static final C2S_PvpThumbsUp_6811 DEFAULT_INSTANCE = new C2S_PvpThumbsUp_6811();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PvpThumbsUp_6811> PARSER = new AbstractParser<C2S_PvpThumbsUp_6811>() {
         public C2S_PvpThumbsUp_6811 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PvpThumbsUp_6811(input, extensionRegistry);
         }
      };

      private C2S_PvpThumbsUp_6811(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PvpThumbsUp_6811() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PvpThumbsUp_6811();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PvpThumbsUp_6811(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.beThumbsUpId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.isKingOfCP_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_PvpThumbsUp_6811_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_PvpThumbsUp_6811_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PvpThumbsUp_6811.class, Builder.class);
      }

      public boolean hasBeThumbsUpId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBeThumbsUpId() {
         return this.beThumbsUpId_;
      }

      public boolean hasIsKingOfCP() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsKingOfCP() {
         return this.isKingOfCP_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBeThumbsUpId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.beThumbsUpId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.isKingOfCP_);
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
               size += CodedOutputStream.computeInt32Size(1, this.beThumbsUpId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.isKingOfCP_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PvpThumbsUp_6811)) {
            return super.equals(obj);
         } else {
            C2S_PvpThumbsUp_6811 other = (C2S_PvpThumbsUp_6811)obj;
            if (this.hasBeThumbsUpId() != other.hasBeThumbsUpId()) {
               return false;
            } else if (this.hasBeThumbsUpId() && this.getBeThumbsUpId() != other.getBeThumbsUpId()) {
               return false;
            } else if (this.hasIsKingOfCP() != other.hasIsKingOfCP()) {
               return false;
            } else if (this.hasIsKingOfCP() && this.getIsKingOfCP() != other.getIsKingOfCP()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasBeThumbsUpId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBeThumbsUpId();
            }

            if (this.hasIsKingOfCP()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsKingOfCP());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PvpThumbsUp_6811 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PvpThumbsUp_6811)PARSER.parseFrom(data);
      }

      public static C2S_PvpThumbsUp_6811 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PvpThumbsUp_6811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PvpThumbsUp_6811 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PvpThumbsUp_6811)PARSER.parseFrom(data);
      }

      public static C2S_PvpThumbsUp_6811 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PvpThumbsUp_6811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PvpThumbsUp_6811 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PvpThumbsUp_6811)PARSER.parseFrom(data);
      }

      public static C2S_PvpThumbsUp_6811 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PvpThumbsUp_6811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PvpThumbsUp_6811 parseFrom(InputStream input) throws IOException {
         return (C2S_PvpThumbsUp_6811)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PvpThumbsUp_6811 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PvpThumbsUp_6811)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PvpThumbsUp_6811 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PvpThumbsUp_6811)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PvpThumbsUp_6811 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PvpThumbsUp_6811)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PvpThumbsUp_6811 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PvpThumbsUp_6811)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PvpThumbsUp_6811 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PvpThumbsUp_6811)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PvpThumbsUp_6811 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PvpThumbsUp_6811 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PvpThumbsUp_6811> parser() {
         return PARSER;
      }

      public Parser<C2S_PvpThumbsUp_6811> getParserForType() {
         return PARSER;
      }

      public C2S_PvpThumbsUp_6811 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PvpThumbsUp_6811OrBuilder {
         private int bitField0_;
         private int beThumbsUpId_;
         private boolean isKingOfCP_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_PvpThumbsUp_6811_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_PvpThumbsUp_6811_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PvpThumbsUp_6811.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PvpMsg.C2S_PvpThumbsUp_6811.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.beThumbsUpId_ = 0;
            this.bitField0_ &= -2;
            this.isKingOfCP_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_PvpThumbsUp_6811_descriptor;
         }

         public C2S_PvpThumbsUp_6811 getDefaultInstanceForType() {
            return PvpMsg.C2S_PvpThumbsUp_6811.getDefaultInstance();
         }

         public C2S_PvpThumbsUp_6811 build() {
            C2S_PvpThumbsUp_6811 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PvpThumbsUp_6811 buildPartial() {
            C2S_PvpThumbsUp_6811 result = new C2S_PvpThumbsUp_6811(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.beThumbsUpId_ = this.beThumbsUpId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isKingOfCP_ = this.isKingOfCP_;
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
            if (other instanceof C2S_PvpThumbsUp_6811) {
               return this.mergeFrom((C2S_PvpThumbsUp_6811)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PvpThumbsUp_6811 other) {
            if (other == PvpMsg.C2S_PvpThumbsUp_6811.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBeThumbsUpId()) {
                  this.setBeThumbsUpId(other.getBeThumbsUpId());
               }

               if (other.hasIsKingOfCP()) {
                  this.setIsKingOfCP(other.getIsKingOfCP());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBeThumbsUpId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_PvpThumbsUp_6811 parsedMessage = null;

            try {
               parsedMessage = (C2S_PvpThumbsUp_6811)PvpMsg.C2S_PvpThumbsUp_6811.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PvpThumbsUp_6811)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBeThumbsUpId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBeThumbsUpId() {
            return this.beThumbsUpId_;
         }

         public Builder setBeThumbsUpId(int value) {
            this.bitField0_ |= 1;
            this.beThumbsUpId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeThumbsUpId() {
            this.bitField0_ &= -2;
            this.beThumbsUpId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsKingOfCP() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsKingOfCP() {
            return this.isKingOfCP_;
         }

         public Builder setIsKingOfCP(boolean value) {
            this.bitField0_ |= 2;
            this.isKingOfCP_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsKingOfCP() {
            this.bitField0_ &= -3;
            this.isKingOfCP_ = false;
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

   public static final class S2C_PvpThumbsUpResult_6812 extends GeneratedMessageV3 implements S2C_PvpThumbsUpResult_6812OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int BETHUMBSUPID_FIELD_NUMBER = 2;
      private int beThumbsUpId_;
      public static final int THUMBSUPNUM_FIELD_NUMBER = 3;
      private int thumbsUpNum_;
      public static final int ISKINGOFCP_FIELD_NUMBER = 4;
      private boolean isKingOfCP_;
      private byte memoizedIsInitialized;
      private static final S2C_PvpThumbsUpResult_6812 DEFAULT_INSTANCE = new S2C_PvpThumbsUpResult_6812();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PvpThumbsUpResult_6812> PARSER = new AbstractParser<S2C_PvpThumbsUpResult_6812>() {
         public S2C_PvpThumbsUpResult_6812 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PvpThumbsUpResult_6812(input, extensionRegistry);
         }
      };

      private S2C_PvpThumbsUpResult_6812(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PvpThumbsUpResult_6812() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PvpThumbsUpResult_6812();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PvpThumbsUpResult_6812(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.beThumbsUpId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.thumbsUpNum_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.isKingOfCP_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_PvpThumbsUpResult_6812_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_PvpThumbsUpResult_6812_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PvpThumbsUpResult_6812.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasBeThumbsUpId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBeThumbsUpId() {
         return this.beThumbsUpId_;
      }

      public boolean hasThumbsUpNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getThumbsUpNum() {
         return this.thumbsUpNum_;
      }

      public boolean hasIsKingOfCP() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getIsKingOfCP() {
         return this.isKingOfCP_;
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
         } else if (!this.hasBeThumbsUpId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasThumbsUpNum()) {
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
            output.writeInt32(2, this.beThumbsUpId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.thumbsUpNum_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBool(4, this.isKingOfCP_);
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
               size += CodedOutputStream.computeInt32Size(2, this.beThumbsUpId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.thumbsUpNum_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.isKingOfCP_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PvpThumbsUpResult_6812)) {
            return super.equals(obj);
         } else {
            S2C_PvpThumbsUpResult_6812 other = (S2C_PvpThumbsUpResult_6812)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasBeThumbsUpId() != other.hasBeThumbsUpId()) {
               return false;
            } else if (this.hasBeThumbsUpId() && this.getBeThumbsUpId() != other.getBeThumbsUpId()) {
               return false;
            } else if (this.hasThumbsUpNum() != other.hasThumbsUpNum()) {
               return false;
            } else if (this.hasThumbsUpNum() && this.getThumbsUpNum() != other.getThumbsUpNum()) {
               return false;
            } else if (this.hasIsKingOfCP() != other.hasIsKingOfCP()) {
               return false;
            } else if (this.hasIsKingOfCP() && this.getIsKingOfCP() != other.getIsKingOfCP()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasBeThumbsUpId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBeThumbsUpId();
            }

            if (this.hasThumbsUpNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getThumbsUpNum();
            }

            if (this.hasIsKingOfCP()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getIsKingOfCP());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PvpThumbsUpResult_6812 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PvpThumbsUpResult_6812)PARSER.parseFrom(data);
      }

      public static S2C_PvpThumbsUpResult_6812 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PvpThumbsUpResult_6812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PvpThumbsUpResult_6812 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PvpThumbsUpResult_6812)PARSER.parseFrom(data);
      }

      public static S2C_PvpThumbsUpResult_6812 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PvpThumbsUpResult_6812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PvpThumbsUpResult_6812 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PvpThumbsUpResult_6812)PARSER.parseFrom(data);
      }

      public static S2C_PvpThumbsUpResult_6812 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PvpThumbsUpResult_6812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PvpThumbsUpResult_6812 parseFrom(InputStream input) throws IOException {
         return (S2C_PvpThumbsUpResult_6812)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PvpThumbsUpResult_6812 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PvpThumbsUpResult_6812)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PvpThumbsUpResult_6812 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PvpThumbsUpResult_6812)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PvpThumbsUpResult_6812 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PvpThumbsUpResult_6812)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PvpThumbsUpResult_6812 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PvpThumbsUpResult_6812)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PvpThumbsUpResult_6812 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PvpThumbsUpResult_6812)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PvpThumbsUpResult_6812 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PvpThumbsUpResult_6812 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PvpThumbsUpResult_6812> parser() {
         return PARSER;
      }

      public Parser<S2C_PvpThumbsUpResult_6812> getParserForType() {
         return PARSER;
      }

      public S2C_PvpThumbsUpResult_6812 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PvpThumbsUpResult_6812OrBuilder {
         private int bitField0_;
         private int result_;
         private int beThumbsUpId_;
         private int thumbsUpNum_;
         private boolean isKingOfCP_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_PvpThumbsUpResult_6812_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_PvpThumbsUpResult_6812_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PvpThumbsUpResult_6812.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PvpMsg.S2C_PvpThumbsUpResult_6812.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.beThumbsUpId_ = 0;
            this.bitField0_ &= -3;
            this.thumbsUpNum_ = 0;
            this.bitField0_ &= -5;
            this.isKingOfCP_ = false;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_PvpThumbsUpResult_6812_descriptor;
         }

         public S2C_PvpThumbsUpResult_6812 getDefaultInstanceForType() {
            return PvpMsg.S2C_PvpThumbsUpResult_6812.getDefaultInstance();
         }

         public S2C_PvpThumbsUpResult_6812 build() {
            S2C_PvpThumbsUpResult_6812 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PvpThumbsUpResult_6812 buildPartial() {
            S2C_PvpThumbsUpResult_6812 result = new S2C_PvpThumbsUpResult_6812(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.beThumbsUpId_ = this.beThumbsUpId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.thumbsUpNum_ = this.thumbsUpNum_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.isKingOfCP_ = this.isKingOfCP_;
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
            if (other instanceof S2C_PvpThumbsUpResult_6812) {
               return this.mergeFrom((S2C_PvpThumbsUpResult_6812)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PvpThumbsUpResult_6812 other) {
            if (other == PvpMsg.S2C_PvpThumbsUpResult_6812.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasBeThumbsUpId()) {
                  this.setBeThumbsUpId(other.getBeThumbsUpId());
               }

               if (other.hasThumbsUpNum()) {
                  this.setThumbsUpNum(other.getThumbsUpNum());
               }

               if (other.hasIsKingOfCP()) {
                  this.setIsKingOfCP(other.getIsKingOfCP());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasBeThumbsUpId()) {
               return false;
            } else {
               return this.hasThumbsUpNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PvpThumbsUpResult_6812 parsedMessage = null;

            try {
               parsedMessage = (S2C_PvpThumbsUpResult_6812)PvpMsg.S2C_PvpThumbsUpResult_6812.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PvpThumbsUpResult_6812)e.getUnfinishedMessage();
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

         public boolean hasBeThumbsUpId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBeThumbsUpId() {
            return this.beThumbsUpId_;
         }

         public Builder setBeThumbsUpId(int value) {
            this.bitField0_ |= 2;
            this.beThumbsUpId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeThumbsUpId() {
            this.bitField0_ &= -3;
            this.beThumbsUpId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasThumbsUpNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getThumbsUpNum() {
            return this.thumbsUpNum_;
         }

         public Builder setThumbsUpNum(int value) {
            this.bitField0_ |= 4;
            this.thumbsUpNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearThumbsUpNum() {
            this.bitField0_ &= -5;
            this.thumbsUpNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsKingOfCP() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getIsKingOfCP() {
            return this.isKingOfCP_;
         }

         public Builder setIsKingOfCP(boolean value) {
            this.bitField0_ |= 8;
            this.isKingOfCP_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsKingOfCP() {
            this.bitField0_ &= -9;
            this.isKingOfCP_ = false;
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

   public static final class C2S_ShowPlayerInfo_6813 extends GeneratedMessageV3 implements C2S_ShowPlayerInfo_6813OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      private byte memoizedIsInitialized;
      private static final C2S_ShowPlayerInfo_6813 DEFAULT_INSTANCE = new C2S_ShowPlayerInfo_6813();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ShowPlayerInfo_6813> PARSER = new AbstractParser<C2S_ShowPlayerInfo_6813>() {
         public C2S_ShowPlayerInfo_6813 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ShowPlayerInfo_6813(input, extensionRegistry);
         }
      };

      private C2S_ShowPlayerInfo_6813(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ShowPlayerInfo_6813() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ShowPlayerInfo_6813();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ShowPlayerInfo_6813(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_ShowPlayerInfo_6813_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_ShowPlayerInfo_6813_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShowPlayerInfo_6813.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
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
            output.writeInt32(1, this.playerId_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ShowPlayerInfo_6813)) {
            return super.equals(obj);
         } else {
            C2S_ShowPlayerInfo_6813 other = (C2S_ShowPlayerInfo_6813)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
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
            if (this.hasPlayerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ShowPlayerInfo_6813 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ShowPlayerInfo_6813)PARSER.parseFrom(data);
      }

      public static C2S_ShowPlayerInfo_6813 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShowPlayerInfo_6813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShowPlayerInfo_6813 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ShowPlayerInfo_6813)PARSER.parseFrom(data);
      }

      public static C2S_ShowPlayerInfo_6813 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShowPlayerInfo_6813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShowPlayerInfo_6813 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ShowPlayerInfo_6813)PARSER.parseFrom(data);
      }

      public static C2S_ShowPlayerInfo_6813 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShowPlayerInfo_6813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShowPlayerInfo_6813 parseFrom(InputStream input) throws IOException {
         return (C2S_ShowPlayerInfo_6813)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShowPlayerInfo_6813 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShowPlayerInfo_6813)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShowPlayerInfo_6813 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ShowPlayerInfo_6813)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ShowPlayerInfo_6813 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShowPlayerInfo_6813)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShowPlayerInfo_6813 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ShowPlayerInfo_6813)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShowPlayerInfo_6813 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShowPlayerInfo_6813)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ShowPlayerInfo_6813 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ShowPlayerInfo_6813 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ShowPlayerInfo_6813> parser() {
         return PARSER;
      }

      public Parser<C2S_ShowPlayerInfo_6813> getParserForType() {
         return PARSER;
      }

      public C2S_ShowPlayerInfo_6813 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ShowPlayerInfo_6813OrBuilder {
         private int bitField0_;
         private int playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_ShowPlayerInfo_6813_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_ShowPlayerInfo_6813_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShowPlayerInfo_6813.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PvpMsg.C2S_ShowPlayerInfo_6813.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_ShowPlayerInfo_6813_descriptor;
         }

         public C2S_ShowPlayerInfo_6813 getDefaultInstanceForType() {
            return PvpMsg.C2S_ShowPlayerInfo_6813.getDefaultInstance();
         }

         public C2S_ShowPlayerInfo_6813 build() {
            C2S_ShowPlayerInfo_6813 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ShowPlayerInfo_6813 buildPartial() {
            C2S_ShowPlayerInfo_6813 result = new C2S_ShowPlayerInfo_6813(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
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
            if (other instanceof C2S_ShowPlayerInfo_6813) {
               return this.mergeFrom((C2S_ShowPlayerInfo_6813)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ShowPlayerInfo_6813 other) {
            if (other == PvpMsg.C2S_ShowPlayerInfo_6813.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPlayerId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ShowPlayerInfo_6813 parsedMessage = null;

            try {
               parsedMessage = (C2S_ShowPlayerInfo_6813)PvpMsg.C2S_ShowPlayerInfo_6813.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ShowPlayerInfo_6813)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_ShowPlayerInfoResult_6814 extends GeneratedMessageV3 implements S2C_ShowPlayerInfoResult_6814OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int NAME_FIELD_NUMBER = 2;
      private volatile Object name_;
      public static final int LV_FIELD_NUMBER = 3;
      private int lv_;
      public static final int HEAD_FIELD_NUMBER = 4;
      private int head_;
      public static final int HEADFRAME_FIELD_NUMBER = 5;
      private int headFrame_;
      public static final int POWER_FIELD_NUMBER = 6;
      private long power_;
      public static final int SCORE_FIELD_NUMBER = 7;
      private int score_;
      public static final int HERO_FIELD_NUMBER = 8;
      private List<CommonMsg.HeroInfo> hero_;
      private byte memoizedIsInitialized;
      private static final S2C_ShowPlayerInfoResult_6814 DEFAULT_INSTANCE = new S2C_ShowPlayerInfoResult_6814();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ShowPlayerInfoResult_6814> PARSER = new AbstractParser<S2C_ShowPlayerInfoResult_6814>() {
         public S2C_ShowPlayerInfoResult_6814 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ShowPlayerInfoResult_6814(input, extensionRegistry);
         }
      };

      private S2C_ShowPlayerInfoResult_6814(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ShowPlayerInfoResult_6814() {
         this.memoizedIsInitialized = -1;
         this.name_ = "";
         this.hero_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ShowPlayerInfoResult_6814();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ShowPlayerInfoResult_6814(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.lv_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.head_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.headFrame_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.power_ = input.readInt64();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.score_ = input.readInt32();
                        break;
                     case 66:
                        if ((mutable_bitField0_ & 128) == 0) {
                           this.hero_ = new ArrayList();
                           mutable_bitField0_ |= 128;
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
               if ((mutable_bitField0_ & 128) != 0) {
                  this.hero_ = Collections.unmodifiableList(this.hero_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_ShowPlayerInfoResult_6814_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_ShowPlayerInfoResult_6814_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShowPlayerInfoResult_6814.class, Builder.class);
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

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public boolean hasPower() {
         return (this.bitField0_ & 32) != 0;
      }

      public long getPower() {
         return this.power_;
      }

      public boolean hasScore() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getScore() {
         return this.score_;
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
         } else if (!this.hasId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeadFrame()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPower()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasScore()) {
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
            output.writeInt32(1, this.id_);
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.name_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.lv_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.head_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.headFrame_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt64(6, this.power_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.score_);
         }

         for(int i = 0; i < this.hero_.size(); ++i) {
            output.writeMessage(8, (MessageLite)this.hero_.get(i));
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
               size += CodedOutputStream.computeInt32Size(3, this.lv_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.head_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.headFrame_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt64Size(6, this.power_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.score_);
            }

            for(int i = 0; i < this.hero_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(8, (MessageLite)this.hero_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ShowPlayerInfoResult_6814)) {
            return super.equals(obj);
         } else {
            S2C_ShowPlayerInfoResult_6814 other = (S2C_ShowPlayerInfoResult_6814)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasName() != other.hasName()) {
               return false;
            } else if (this.hasName() && !this.getName().equals(other.getName())) {
               return false;
            } else if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
               return false;
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
               return false;
            } else if (this.hasPower() != other.hasPower()) {
               return false;
            } else if (this.hasPower() && this.getPower() != other.getPower()) {
               return false;
            } else if (this.hasScore() != other.hasScore()) {
               return false;
            } else if (this.hasScore() && this.getScore() != other.getScore()) {
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
            if (this.hasId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getId();
            }

            if (this.hasName()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getName().hashCode();
            }

            if (this.hasLv()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLv();
            }

            if (this.hasHead()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasPower()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashLong(this.getPower());
            }

            if (this.hasScore()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getScore();
            }

            if (this.getHeroCount() > 0) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getHeroList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ShowPlayerInfoResult_6814 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ShowPlayerInfoResult_6814)PARSER.parseFrom(data);
      }

      public static S2C_ShowPlayerInfoResult_6814 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShowPlayerInfoResult_6814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShowPlayerInfoResult_6814 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ShowPlayerInfoResult_6814)PARSER.parseFrom(data);
      }

      public static S2C_ShowPlayerInfoResult_6814 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShowPlayerInfoResult_6814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShowPlayerInfoResult_6814 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ShowPlayerInfoResult_6814)PARSER.parseFrom(data);
      }

      public static S2C_ShowPlayerInfoResult_6814 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShowPlayerInfoResult_6814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShowPlayerInfoResult_6814 parseFrom(InputStream input) throws IOException {
         return (S2C_ShowPlayerInfoResult_6814)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShowPlayerInfoResult_6814 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShowPlayerInfoResult_6814)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShowPlayerInfoResult_6814 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ShowPlayerInfoResult_6814)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ShowPlayerInfoResult_6814 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShowPlayerInfoResult_6814)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShowPlayerInfoResult_6814 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ShowPlayerInfoResult_6814)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShowPlayerInfoResult_6814 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShowPlayerInfoResult_6814)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ShowPlayerInfoResult_6814 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ShowPlayerInfoResult_6814 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ShowPlayerInfoResult_6814> parser() {
         return PARSER;
      }

      public Parser<S2C_ShowPlayerInfoResult_6814> getParserForType() {
         return PARSER;
      }

      public S2C_ShowPlayerInfoResult_6814 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ShowPlayerInfoResult_6814OrBuilder {
         private int bitField0_;
         private int id_;
         private Object name_;
         private int lv_;
         private int head_;
         private int headFrame_;
         private long power_;
         private int score_;
         private List<CommonMsg.HeroInfo> hero_;
         private RepeatedFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> heroBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_ShowPlayerInfoResult_6814_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_ShowPlayerInfoResult_6814_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShowPlayerInfoResult_6814.class, Builder.class);
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
            if (PvpMsg.S2C_ShowPlayerInfoResult_6814.alwaysUseFieldBuilders) {
               this.getHeroFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.name_ = "";
            this.bitField0_ &= -3;
            this.lv_ = 0;
            this.bitField0_ &= -5;
            this.head_ = 0;
            this.bitField0_ &= -9;
            this.headFrame_ = 0;
            this.bitField0_ &= -17;
            this.power_ = 0L;
            this.bitField0_ &= -33;
            this.score_ = 0;
            this.bitField0_ &= -65;
            if (this.heroBuilder_ == null) {
               this.hero_ = Collections.emptyList();
               this.bitField0_ &= -129;
            } else {
               this.heroBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_ShowPlayerInfoResult_6814_descriptor;
         }

         public S2C_ShowPlayerInfoResult_6814 getDefaultInstanceForType() {
            return PvpMsg.S2C_ShowPlayerInfoResult_6814.getDefaultInstance();
         }

         public S2C_ShowPlayerInfoResult_6814 build() {
            S2C_ShowPlayerInfoResult_6814 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ShowPlayerInfoResult_6814 buildPartial() {
            S2C_ShowPlayerInfoResult_6814 result = new S2C_ShowPlayerInfoResult_6814(this);
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
               result.lv_ = this.lv_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.head_ = this.head_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.power_ = this.power_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.score_ = this.score_;
               to_bitField0_ |= 64;
            }

            if (this.heroBuilder_ == null) {
               if ((this.bitField0_ & 128) != 0) {
                  this.hero_ = Collections.unmodifiableList(this.hero_);
                  this.bitField0_ &= -129;
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
            if (other instanceof S2C_ShowPlayerInfoResult_6814) {
               return this.mergeFrom((S2C_ShowPlayerInfoResult_6814)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ShowPlayerInfoResult_6814 other) {
            if (other == PvpMsg.S2C_ShowPlayerInfoResult_6814.getDefaultInstance()) {
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

               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               if (other.hasPower()) {
                  this.setPower(other.getPower());
               }

               if (other.hasScore()) {
                  this.setScore(other.getScore());
               }

               if (this.heroBuilder_ == null) {
                  if (!other.hero_.isEmpty()) {
                     if (this.hero_.isEmpty()) {
                        this.hero_ = other.hero_;
                        this.bitField0_ &= -129;
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
                     this.bitField0_ &= -129;
                     this.heroBuilder_ = PvpMsg.S2C_ShowPlayerInfoResult_6814.alwaysUseFieldBuilders ? this.getHeroFieldBuilder() : null;
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
            if (!this.hasId()) {
               return false;
            } else if (!this.hasName()) {
               return false;
            } else if (!this.hasLv()) {
               return false;
            } else if (!this.hasHead()) {
               return false;
            } else if (!this.hasHeadFrame()) {
               return false;
            } else if (!this.hasPower()) {
               return false;
            } else if (!this.hasScore()) {
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
            S2C_ShowPlayerInfoResult_6814 parsedMessage = null;

            try {
               parsedMessage = (S2C_ShowPlayerInfoResult_6814)PvpMsg.S2C_ShowPlayerInfoResult_6814.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ShowPlayerInfoResult_6814)e.getUnfinishedMessage();
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
            this.name_ = PvpMsg.S2C_ShowPlayerInfoResult_6814.getDefaultInstance().getName();
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

         public boolean hasPower() {
            return (this.bitField0_ & 32) != 0;
         }

         public long getPower() {
            return this.power_;
         }

         public Builder setPower(long value) {
            this.bitField0_ |= 32;
            this.power_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPower() {
            this.bitField0_ &= -33;
            this.power_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasScore() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getScore() {
            return this.score_;
         }

         public Builder setScore(int value) {
            this.bitField0_ |= 64;
            this.score_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearScore() {
            this.bitField0_ &= -65;
            this.score_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureHeroIsMutable() {
            if ((this.bitField0_ & 128) == 0) {
               this.hero_ = new ArrayList(this.hero_);
               this.bitField0_ |= 128;
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
               this.bitField0_ &= -129;
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
               this.heroBuilder_ = new RepeatedFieldBuilderV3(this.hero_, (this.bitField0_ & 128) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class C2S_TakeFightNumAward_6815 extends GeneratedMessageV3 implements C2S_TakeFightNumAward_6815OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_TakeFightNumAward_6815 DEFAULT_INSTANCE = new C2S_TakeFightNumAward_6815();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TakeFightNumAward_6815> PARSER = new AbstractParser<C2S_TakeFightNumAward_6815>() {
         public C2S_TakeFightNumAward_6815 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TakeFightNumAward_6815(input, extensionRegistry);
         }
      };

      private C2S_TakeFightNumAward_6815(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TakeFightNumAward_6815() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TakeFightNumAward_6815();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TakeFightNumAward_6815(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_TakeFightNumAward_6815_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_TakeFightNumAward_6815_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeFightNumAward_6815.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TakeFightNumAward_6815)) {
            return super.equals(obj);
         } else {
            C2S_TakeFightNumAward_6815 other = (C2S_TakeFightNumAward_6815)obj;
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

      public static C2S_TakeFightNumAward_6815 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TakeFightNumAward_6815)PARSER.parseFrom(data);
      }

      public static C2S_TakeFightNumAward_6815 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeFightNumAward_6815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeFightNumAward_6815 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TakeFightNumAward_6815)PARSER.parseFrom(data);
      }

      public static C2S_TakeFightNumAward_6815 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeFightNumAward_6815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeFightNumAward_6815 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TakeFightNumAward_6815)PARSER.parseFrom(data);
      }

      public static C2S_TakeFightNumAward_6815 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeFightNumAward_6815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeFightNumAward_6815 parseFrom(InputStream input) throws IOException {
         return (C2S_TakeFightNumAward_6815)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeFightNumAward_6815 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeFightNumAward_6815)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeFightNumAward_6815 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TakeFightNumAward_6815)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TakeFightNumAward_6815 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeFightNumAward_6815)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeFightNumAward_6815 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TakeFightNumAward_6815)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeFightNumAward_6815 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeFightNumAward_6815)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TakeFightNumAward_6815 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TakeFightNumAward_6815 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TakeFightNumAward_6815> parser() {
         return PARSER;
      }

      public Parser<C2S_TakeFightNumAward_6815> getParserForType() {
         return PARSER;
      }

      public C2S_TakeFightNumAward_6815 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TakeFightNumAward_6815OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_TakeFightNumAward_6815_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_TakeFightNumAward_6815_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeFightNumAward_6815.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PvpMsg.C2S_TakeFightNumAward_6815.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_C2S_TakeFightNumAward_6815_descriptor;
         }

         public C2S_TakeFightNumAward_6815 getDefaultInstanceForType() {
            return PvpMsg.C2S_TakeFightNumAward_6815.getDefaultInstance();
         }

         public C2S_TakeFightNumAward_6815 build() {
            C2S_TakeFightNumAward_6815 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TakeFightNumAward_6815 buildPartial() {
            C2S_TakeFightNumAward_6815 result = new C2S_TakeFightNumAward_6815(this);
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
            if (other instanceof C2S_TakeFightNumAward_6815) {
               return this.mergeFrom((C2S_TakeFightNumAward_6815)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TakeFightNumAward_6815 other) {
            if (other == PvpMsg.C2S_TakeFightNumAward_6815.getDefaultInstance()) {
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
            C2S_TakeFightNumAward_6815 parsedMessage = null;

            try {
               parsedMessage = (C2S_TakeFightNumAward_6815)PvpMsg.C2S_TakeFightNumAward_6815.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TakeFightNumAward_6815)e.getUnfinishedMessage();
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

   public static final class S2C_TakeFightNumAward_6816 extends GeneratedMessageV3 implements S2C_TakeFightNumAward_6816OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TAKEDIDS_FIELD_NUMBER = 2;
      private Internal.IntList takedIds_;
      private byte memoizedIsInitialized;
      private static final S2C_TakeFightNumAward_6816 DEFAULT_INSTANCE = new S2C_TakeFightNumAward_6816();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TakeFightNumAward_6816> PARSER = new AbstractParser<S2C_TakeFightNumAward_6816>() {
         public S2C_TakeFightNumAward_6816 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TakeFightNumAward_6816(input, extensionRegistry);
         }
      };

      private S2C_TakeFightNumAward_6816(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TakeFightNumAward_6816() {
         this.memoizedIsInitialized = -1;
         this.takedIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TakeFightNumAward_6816();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TakeFightNumAward_6816(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.takedIds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.takedIds_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.takedIds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.takedIds_.addInt(input.readInt32());
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
                  this.takedIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_TakeFightNumAward_6816_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_TakeFightNumAward_6816_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeFightNumAward_6816.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public List<Integer> getTakedIdsList() {
         return this.takedIds_;
      }

      public int getTakedIdsCount() {
         return this.takedIds_.size();
      }

      public int getTakedIds(int index) {
         return this.takedIds_.getInt(index);
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
            output.writeInt32(1, this.result_);
         }

         for(int i = 0; i < this.takedIds_.size(); ++i) {
            output.writeInt32(2, this.takedIds_.getInt(i));
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

            int dataSize = 0;

            for(int i = 0; i < this.takedIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.takedIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTakedIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TakeFightNumAward_6816)) {
            return super.equals(obj);
         } else {
            S2C_TakeFightNumAward_6816 other = (S2C_TakeFightNumAward_6816)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (!this.getTakedIdsList().equals(other.getTakedIdsList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.getTakedIdsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTakedIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TakeFightNumAward_6816 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TakeFightNumAward_6816)PARSER.parseFrom(data);
      }

      public static S2C_TakeFightNumAward_6816 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeFightNumAward_6816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeFightNumAward_6816 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TakeFightNumAward_6816)PARSER.parseFrom(data);
      }

      public static S2C_TakeFightNumAward_6816 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeFightNumAward_6816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeFightNumAward_6816 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TakeFightNumAward_6816)PARSER.parseFrom(data);
      }

      public static S2C_TakeFightNumAward_6816 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeFightNumAward_6816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeFightNumAward_6816 parseFrom(InputStream input) throws IOException {
         return (S2C_TakeFightNumAward_6816)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeFightNumAward_6816 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeFightNumAward_6816)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeFightNumAward_6816 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TakeFightNumAward_6816)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TakeFightNumAward_6816 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeFightNumAward_6816)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeFightNumAward_6816 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TakeFightNumAward_6816)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeFightNumAward_6816 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeFightNumAward_6816)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TakeFightNumAward_6816 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TakeFightNumAward_6816 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TakeFightNumAward_6816> parser() {
         return PARSER;
      }

      public Parser<S2C_TakeFightNumAward_6816> getParserForType() {
         return PARSER;
      }

      public S2C_TakeFightNumAward_6816 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TakeFightNumAward_6816OrBuilder {
         private int bitField0_;
         private int result_;
         private Internal.IntList takedIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_TakeFightNumAward_6816_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_TakeFightNumAward_6816_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeFightNumAward_6816.class, Builder.class);
         }

         private Builder() {
            this.takedIds_ = PvpMsg.S2C_TakeFightNumAward_6816.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.takedIds_ = PvpMsg.S2C_TakeFightNumAward_6816.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PvpMsg.S2C_TakeFightNumAward_6816.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.takedIds_ = PvpMsg.S2C_TakeFightNumAward_6816.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PvpMsg.internal_static_pvp_com_gzbz_protobuf_S2C_TakeFightNumAward_6816_descriptor;
         }

         public S2C_TakeFightNumAward_6816 getDefaultInstanceForType() {
            return PvpMsg.S2C_TakeFightNumAward_6816.getDefaultInstance();
         }

         public S2C_TakeFightNumAward_6816 build() {
            S2C_TakeFightNumAward_6816 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TakeFightNumAward_6816 buildPartial() {
            S2C_TakeFightNumAward_6816 result = new S2C_TakeFightNumAward_6816(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.takedIds_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.takedIds_ = this.takedIds_;
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
            if (other instanceof S2C_TakeFightNumAward_6816) {
               return this.mergeFrom((S2C_TakeFightNumAward_6816)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TakeFightNumAward_6816 other) {
            if (other == PvpMsg.S2C_TakeFightNumAward_6816.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (!other.takedIds_.isEmpty()) {
                  if (this.takedIds_.isEmpty()) {
                     this.takedIds_ = other.takedIds_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureTakedIdsIsMutable();
                     this.takedIds_.addAll(other.takedIds_);
                  }

                  this.onChanged();
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
            S2C_TakeFightNumAward_6816 parsedMessage = null;

            try {
               parsedMessage = (S2C_TakeFightNumAward_6816)PvpMsg.S2C_TakeFightNumAward_6816.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TakeFightNumAward_6816)e.getUnfinishedMessage();
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

         private void ensureTakedIdsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.takedIds_ = PvpMsg.S2C_TakeFightNumAward_6816.mutableCopy(this.takedIds_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getTakedIdsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.takedIds_) : this.takedIds_);
         }

         public int getTakedIdsCount() {
            return this.takedIds_.size();
         }

         public int getTakedIds(int index) {
            return this.takedIds_.getInt(index);
         }

         public Builder setTakedIds(int index, int value) {
            this.ensureTakedIdsIsMutable();
            this.takedIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTakedIds(int value) {
            this.ensureTakedIdsIsMutable();
            this.takedIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTakedIds(Iterable<? extends Integer> values) {
            this.ensureTakedIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.takedIds_);
            this.onChanged();
            return this;
         }

         public Builder clearTakedIds() {
            this.takedIds_ = PvpMsg.S2C_TakeFightNumAward_6816.emptyIntList();
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

   public interface C2S_FlushPvpList_6803OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenPvpUi_6801OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_PvpFightRecord_6809OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_PvpRank_6807OrBuilder extends MessageOrBuilder {
      boolean hasType();

      PvpRankType getType();
   }

   public interface C2S_PvpThumbsUp_6811OrBuilder extends MessageOrBuilder {
      boolean hasBeThumbsUpId();

      int getBeThumbsUpId();

      boolean hasIsKingOfCP();

      boolean getIsKingOfCP();
   }

   public interface C2S_ShowPlayerInfo_6813OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();
   }

   public interface C2S_TakeFightNumAward_6815OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface FightPlayerInfoOrBuilder extends MessageOrBuilder {
      boolean hasLeft();

      int getLeft();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasName();

      String getName();

      ByteString getNameBytes();

      boolean hasHead();

      int getHead();

      boolean hasLv();

      int getLv();

      boolean hasScore();

      int getScore();

      boolean hasScoreChange();

      int getScoreChange();
   }

   public interface PvpPlayerInfoOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasName();

      String getName();

      ByteString getNameBytes();

      boolean hasLv();

      int getLv();

      boolean hasCombatPower();

      long getCombatPower();

      boolean hasHeadId();

      int getHeadId();

      boolean hasScore();

      int getScore();

      boolean hasPrestige();

      int getPrestige();

      boolean hasServerId();

      int getServerId();

      boolean hasHeadFrame();

      int getHeadFrame();
   }

   public interface PvpRankInfoOrBuilder extends MessageOrBuilder {
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

      boolean hasPvpPoints();

      long getPvpPoints();

      boolean hasHeadId();

      int getHeadId();

      boolean hasThumbsUpNum();

      int getThumbsUpNum();

      boolean hasIsThumbsUp();

      boolean getIsThumbsUp();

      boolean hasPrestige();

      int getPrestige();

      boolean hasMonarchid();

      int getMonarchid();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasServerId();

      int getServerId();
   }

   public interface PvpRecordInfoOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasPlayerLv();

      int getPlayerLv();

      boolean hasPlayerHead();

      int getPlayerHead();

      boolean hasAttType();

      int getAttType();

      boolean hasWin();

      int getWin();

      boolean hasTime();

      int getTime();

      boolean hasScoreChange();

      int getScoreChange();

      boolean hasReocrdId();

      int getReocrdId();

      boolean hasFightPlayerId();

      int getFightPlayerId();

      boolean hasFightPlayerName();

      String getFightPlayerName();

      ByteString getFightPlayerNameBytes();

      boolean hasFightPlayerLv();

      int getFightPlayerLv();

      boolean hasFightPlayerHead();

      int getFightPlayerHead();
   }

   public interface S2C_FlushPvpListResult_6804OrBuilder extends MessageOrBuilder {
      List<PvpPlayerInfo> getInfosList();

      PvpPlayerInfo getInfos(int index);

      int getInfosCount();

      List<? extends PvpPlayerInfoOrBuilder> getInfosOrBuilderList();

      PvpPlayerInfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2C_OpenPvpUiResult_6802OrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasPoint();

      int getPoint();

      boolean hasFightNum();

      int getFightNum();

      boolean hasDrawFreeNum();

      int getDrawFreeNum();

      boolean hasStartTime();

      long getStartTime();

      boolean hasEndTime();

      long getEndTime();

      boolean hasDownTime();

      long getDownTime();

      List<PvpPlayerInfo> getInfosList();

      PvpPlayerInfo getInfos(int index);

      int getInfosCount();

      List<? extends PvpPlayerInfoOrBuilder> getInfosOrBuilderList();

      PvpPlayerInfoOrBuilder getInfosOrBuilder(int index);

      boolean hasIsSkip();

      boolean getIsSkip();

      List<Integer> getTakedIdsList();

      int getTakedIdsCount();

      int getTakedIds(int index);

      boolean hasThumbsUpNum();

      int getThumbsUpNum();
   }

   public interface S2C_PvpFightRecordResult_6810OrBuilder extends MessageOrBuilder {
      List<PvpRecordInfo> getInfosList();

      PvpRecordInfo getInfos(int index);

      int getInfosCount();

      List<? extends PvpRecordInfoOrBuilder> getInfosOrBuilderList();

      PvpRecordInfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2C_PvpRankResult_6808OrBuilder extends MessageOrBuilder {
      boolean hasType();

      PvpRankType getType();

      boolean hasMyInfo();

      PvpRankInfo getMyInfo();

      PvpRankInfoOrBuilder getMyInfoOrBuilder();

      List<PvpRankInfo> getPlayersList();

      PvpRankInfo getPlayers(int index);

      int getPlayersCount();

      List<? extends PvpRankInfoOrBuilder> getPlayersOrBuilderList();

      PvpRankInfoOrBuilder getPlayersOrBuilder(int index);
   }

   public interface S2C_PvpThumbsUpResult_6812OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasBeThumbsUpId();

      int getBeThumbsUpId();

      boolean hasThumbsUpNum();

      int getThumbsUpNum();

      boolean hasIsKingOfCP();

      boolean getIsKingOfCP();
   }

   public interface S2C_ShowPlayerInfoResult_6814OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasName();

      String getName();

      ByteString getNameBytes();

      boolean hasLv();

      int getLv();

      boolean hasHead();

      int getHead();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasPower();

      long getPower();

      boolean hasScore();

      int getScore();

      List<CommonMsg.HeroInfo> getHeroList();

      CommonMsg.HeroInfo getHero(int index);

      int getHeroCount();

      List<? extends CommonMsg.HeroInfoOrBuilder> getHeroOrBuilderList();

      CommonMsg.HeroInfoOrBuilder getHeroOrBuilder(int index);
   }

   public interface S2C_TakeAwardsResult_6806OrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasPoint();

      int getPoint();

      boolean hasFightNum();

      int getFightNum();

      boolean hasDrawFreeNum();

      int getDrawFreeNum();

      List<PvpPlayerInfo> getInfosList();

      PvpPlayerInfo getInfos(int index);

      int getInfosCount();

      List<? extends PvpPlayerInfoOrBuilder> getInfosOrBuilderList();

      PvpPlayerInfoOrBuilder getInfosOrBuilder(int index);

      boolean hasIsSkip();

      boolean getIsSkip();
   }

   public interface S2C_TakeFightNumAward_6816OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      List<Integer> getTakedIdsList();

      int getTakedIdsCount();

      int getTakedIds(int index);
   }
}
