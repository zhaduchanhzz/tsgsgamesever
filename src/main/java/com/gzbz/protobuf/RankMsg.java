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
import com.google.protobuf.ProtocolMessageEnum;
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

public final class RankMsg {
   private static final Descriptors.Descriptor internal_static_rank_com_gzbz_protobuf_TypeRanks_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rank_com_gzbz_protobuf_TypeRanks_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rank_com_gzbz_protobuf_RankData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rank_com_gzbz_protobuf_RankData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rank_com_gzbz_protobuf_RankUnionData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rank_com_gzbz_protobuf_RankUnionData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rank_com_gzbz_protobuf_RankRewardData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rank_com_gzbz_protobuf_RankRewardData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rank_com_gzbz_protobuf_C2S_UnionCopyRank_8801_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rank_com_gzbz_protobuf_C2S_UnionCopyRank_8801_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rank_com_gzbz_protobuf_S2C_UnionCopyRank_8802_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rank_com_gzbz_protobuf_S2C_UnionCopyRank_8802_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rank_com_gzbz_protobuf_C2S_TrainingRank_8803_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rank_com_gzbz_protobuf_C2S_TrainingRank_8803_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rank_com_gzbz_protobuf_S2C_TrainingRank_8804_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rank_com_gzbz_protobuf_S2C_TrainingRank_8804_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rank_com_gzbz_protobuf_C2S_KindsOfRank_8807_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rank_com_gzbz_protobuf_C2S_KindsOfRank_8807_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rank_com_gzbz_protobuf_S2C_KindsOfRank_8808_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rank_com_gzbz_protobuf_S2C_KindsOfRank_8808_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rank_com_gzbz_protobuf_C2S_RankModule_8809_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rank_com_gzbz_protobuf_C2S_RankModule_8809_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rank_com_gzbz_protobuf_S2C_RankModule_8810_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rank_com_gzbz_protobuf_S2C_RankModule_8810_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rank_com_gzbz_protobuf_C2S_RankRewardInfo_8811_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rank_com_gzbz_protobuf_C2S_RankRewardInfo_8811_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rank_com_gzbz_protobuf_S2C_RankRewardInfo_8812_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rank_com_gzbz_protobuf_S2C_RankRewardInfo_8812_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rank_com_gzbz_protobuf_C2S_RankReward_8813_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rank_com_gzbz_protobuf_C2S_RankReward_8813_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rank_com_gzbz_protobuf_S2C_RankReward_8814_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rank_com_gzbz_protobuf_S2C_RankReward_8814_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rank_com_gzbz_protobuf_C2S_OpenServerRank_8815_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rank_com_gzbz_protobuf_C2S_OpenServerRank_8815_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rank_com_gzbz_protobuf_S2C_OpenServerRank_8816_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rank_com_gzbz_protobuf_S2C_OpenServerRank_8816_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rank_com_gzbz_protobuf_C2S_RankRewardOneKey_8817_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rank_com_gzbz_protobuf_C2S_RankRewardOneKey_8817_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rank_com_gzbz_protobuf_S2C_RankRewardOneKey_8818_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rank_com_gzbz_protobuf_S2C_RankRewardOneKey_8818_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private RankMsg() {
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
      String[] descriptorData = new String[]{"\n\nRank.proto\u0012\u0016rank.com.gzbz.protobuf\u001a\fPlayer.proto\u001a\fcommon.proto\"}\n\tTypeRanks\u0012\u0010\n\bmoduleId\u0018\u0001 \u0002(\u0005\u0012/\n\u0005rands\u0018\u0002 \u0003(\u000b2 .rank.com.gzbz.protobuf.RankData\u0012-\n\u0004type\u0018\u0003 \u0001(\u000e2\u001f.rank.com.gzbz.protobuf.SubType\"÷\u0002\n\bRankData\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005score\u0018\u0002 \u0002(\u0003\u0012\u0010\n\bplayerId\u0018\u0003 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0004 \u0001(\t\u0012\f\n\u0004head\u0018\u0005 \u0001(\u0005\u0012\u0011\n\theadFrame\u0018\u0006 \u0001(\u0005\u0012\r\n\u0005level\u0018\u0007 \u0001(\u0005\u0012\r\n\u0005power\u0018\b \u0001(\u0003\u0012\u0011\n\tmonarchId\u0018\t \u0001(\u0005\u0012;\n\u000bplayerInfos\u0018\n \u0003(\u000b2&.player.com.gzbz.protobuf.PropertyCell\u0012\u0010\n\bserverId\u0018\u000b \u0001(\u0005\u0012\u0011\n\tunionName\u0018\f \u0001(\t\u0012\u000f\n\u0007unionId\u0018\r \u0001(\u0005\u0012\"\n\bheroInfo\u0018\u000e \u0001(\u000b2\u0010.common.HeroInfo\u0012\u001c\n\u0014firstYearTreasureNum\u0018\u000f \u0001(\u0003\u0012!\n\u0019chineseNewYearTreasureNum\u0018\u0010 \u0001(\u0003\"å\u0001\n\rRankUnionData\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005score\u0018\u0002 \u0002(\u0003\u0012\u000f\n\u0007unionId\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004head\u0018\u0004 \u0001(\u0005\u0012\u0011\n\theadFrame\u0018\u0005 \u0001(\u0005\u0012\u0011\n\tunionName\u0018\u0006 \u0002(\t\u0012\r\n\u0005level\u0018\u0007 \u0002(\u0005\u0012\u0010\n\bleaderId\u0018\b \u0002(\u0005\u0012\u0012\n\nleaderName\u0018\t \u0002(\t\u0012\r\n\u0005count\u0018\n \u0002(\u0005\u0012\u0011\n\tunionHead\u0018\u000b \u0001(\u0005\u0012\u001b\n\u0013curUnionAddNumberId\u0018\f \u0001(\u0005\"_\n\u000eRankRewardData\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u00122\n\brankData\u0018\u0002 \u0003(\u000b2 .rank.com.gzbz.protobuf.RankData\u0012\r\n\u0005isGot\u0018\u0003 \u0002(\b\"(\n\u0016C2S_UnionCopyRank_8801\u0012\u000e\n\u0006copyId\u0018\u0001 \u0002(\u0005\"¿\u0001\n\u0016S2C_UnionCopyRank_8802\u0012/\n\u0005ranks\u0018\u0001 \u0003(\u000b2 .rank.com.gzbz.protobuf.RankData\u00120\n\u0006myRank\u0018\u0002 \u0001(\u000b2 .rank.com.gzbz.protobuf.RankData\u0012\u000e\n\u0006copyId\u0018\u0003 \u0001(\u0005\u00122\n\bpreRanks\u0018\u0004 \u0003(\u000b2 .rank.com.gzbz.protobuf.RankData\"\u0017\n\u0015C2S_TrainingRank_8803\"z\n\u0015S2C_TrainingRank_8804\u0012/\n\u0005ranks\u0018\u0001 \u0003(\u000b2 .rank.com.gzbz.protobuf.RankData\u00120\n\u0006myRank\u0018\u0002 \u0002(\u000b2 .rank.com.gzbz.protobuf.RankData\"\u0016\n\u0014C2S_KindsOfRank_8807\"r\n\u0014S2C_KindsOfRank_8808\u00124\n\ttypeRanks\u0018\u0001 \u0003(\u000b2!.rank.com.gzbz.protobuf.TypeRanks\u0012\u0011\n\tunionName\u0018\u0002 \u0001(\t\u0012\u0011\n\tunionHead\u0018\u0003 \u0001(\u0005\"F\n\u0013C2S_RankModule_8809\u0012\u0010\n\bmoduleId\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006params\u0018\u0002 \u0003(\t\u0012\r\n\u0005limit\u0018\u0003 \u0001(\u0005\"\u0091\u0002\n\u0013S2C_RankModule_8810\u0012\u0010\n\bmoduleId\u0018\u0001 \u0002(\u0005\u00120\n\u0006myRank\u0018\u0002 \u0001(\u000b2 .rank.com.gzbz.protobuf.RankData\u0012/\n\u0005ranks\u0018\u0003 \u0003(\u000b2 .rank.com.gzbz.protobuf.RankData\u0012:\n\u000bmyUnionRank\u0018\u0004 \u0001(\u000b2%.rank.com.gzbz.protobuf.RankUnionData\u00129\n\nunionRanks\u0018\u0005 \u0003(\u000b2%.rank.com.gzbz.protobuf.RankUnionData\u0012\u000e\n\u0006params\u0018\u0006 \u0003(\t\"'\n\u0017C2S_RankRewardInfo_8811\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"g\n\u0017S2C_RankRewardInfo_8812\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012>\n\u000erewardDataList\u0018\u0002 \u0003(\u000b2&.rank.com.gzbz.protobuf.RankRewardData\"!\n\u0013C2S_RankReward_8813\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"!\n\u0013S2C_RankReward_8814\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"+\n\u0017C2S_OpenServerRank_8815\u0012\u0010\n\bmoduleId\u0018\u0001 \u0002(\u0005\"\u009c\u0001\n\u0017S2C_OpenServerRank_8816\u0012\u0010\n\bmoduleId\u0018\u0001 \u0002(\u0005\u00120\n\u0006myRank\u0018\u0002 \u0001(\u000b2 .rank.com.gzbz.protobuf.RankData\u0012/\n\u0005ranks\u0018\u0003 \u0003(\u000b2 .rank.com.gzbz.protobuf.RankData\u0012\f\n\u0004time\u0018\u0004 \u0001(\u0005\")\n\u0019C2S_RankRewardOneKey_8817\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"5\n\u0019S2C_RankRewardOneKey_8818\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0003(\u0005*(\n\u0007SubType\u0012\f\n\bPROGRESS\u0010\u0001\u0012\u000f\n\u000bCULTIVATION\u0010\u0002B\u001e\n\u0011com.gzbz.protobufB\u0007RankMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{PlayerMsg.getDescriptor(), CommonMsg.getDescriptor()});
      internal_static_rank_com_gzbz_protobuf_TypeRanks_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_rank_com_gzbz_protobuf_TypeRanks_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rank_com_gzbz_protobuf_TypeRanks_descriptor, new String[]{"ModuleId", "Rands", "Type"});
      internal_static_rank_com_gzbz_protobuf_RankData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_rank_com_gzbz_protobuf_RankData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rank_com_gzbz_protobuf_RankData_descriptor, new String[]{"Rank", "Score", "PlayerId", "PlayerName", "Head", "HeadFrame", "Level", "Power", "MonarchId", "PlayerInfos", "ServerId", "UnionName", "UnionId", "HeroInfo", "FirstYearTreasureNum", "ChineseNewYearTreasureNum"});
      internal_static_rank_com_gzbz_protobuf_RankUnionData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_rank_com_gzbz_protobuf_RankUnionData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rank_com_gzbz_protobuf_RankUnionData_descriptor, new String[]{"Rank", "Score", "UnionId", "Head", "HeadFrame", "UnionName", "Level", "LeaderId", "LeaderName", "Count", "UnionHead", "CurUnionAddNumberId"});
      internal_static_rank_com_gzbz_protobuf_RankRewardData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_rank_com_gzbz_protobuf_RankRewardData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rank_com_gzbz_protobuf_RankRewardData_descriptor, new String[]{"Id", "RankData", "IsGot"});
      internal_static_rank_com_gzbz_protobuf_C2S_UnionCopyRank_8801_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_rank_com_gzbz_protobuf_C2S_UnionCopyRank_8801_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rank_com_gzbz_protobuf_C2S_UnionCopyRank_8801_descriptor, new String[]{"CopyId"});
      internal_static_rank_com_gzbz_protobuf_S2C_UnionCopyRank_8802_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_rank_com_gzbz_protobuf_S2C_UnionCopyRank_8802_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rank_com_gzbz_protobuf_S2C_UnionCopyRank_8802_descriptor, new String[]{"Ranks", "MyRank", "CopyId", "PreRanks"});
      internal_static_rank_com_gzbz_protobuf_C2S_TrainingRank_8803_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_rank_com_gzbz_protobuf_C2S_TrainingRank_8803_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rank_com_gzbz_protobuf_C2S_TrainingRank_8803_descriptor, new String[0]);
      internal_static_rank_com_gzbz_protobuf_S2C_TrainingRank_8804_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_rank_com_gzbz_protobuf_S2C_TrainingRank_8804_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rank_com_gzbz_protobuf_S2C_TrainingRank_8804_descriptor, new String[]{"Ranks", "MyRank"});
      internal_static_rank_com_gzbz_protobuf_C2S_KindsOfRank_8807_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_rank_com_gzbz_protobuf_C2S_KindsOfRank_8807_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rank_com_gzbz_protobuf_C2S_KindsOfRank_8807_descriptor, new String[0]);
      internal_static_rank_com_gzbz_protobuf_S2C_KindsOfRank_8808_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_rank_com_gzbz_protobuf_S2C_KindsOfRank_8808_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rank_com_gzbz_protobuf_S2C_KindsOfRank_8808_descriptor, new String[]{"TypeRanks", "UnionName", "UnionHead"});
      internal_static_rank_com_gzbz_protobuf_C2S_RankModule_8809_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_rank_com_gzbz_protobuf_C2S_RankModule_8809_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rank_com_gzbz_protobuf_C2S_RankModule_8809_descriptor, new String[]{"ModuleId", "Params", "Limit"});
      internal_static_rank_com_gzbz_protobuf_S2C_RankModule_8810_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_rank_com_gzbz_protobuf_S2C_RankModule_8810_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rank_com_gzbz_protobuf_S2C_RankModule_8810_descriptor, new String[]{"ModuleId", "MyRank", "Ranks", "MyUnionRank", "UnionRanks", "Params"});
      internal_static_rank_com_gzbz_protobuf_C2S_RankRewardInfo_8811_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_rank_com_gzbz_protobuf_C2S_RankRewardInfo_8811_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rank_com_gzbz_protobuf_C2S_RankRewardInfo_8811_descriptor, new String[]{"Type"});
      internal_static_rank_com_gzbz_protobuf_S2C_RankRewardInfo_8812_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_rank_com_gzbz_protobuf_S2C_RankRewardInfo_8812_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rank_com_gzbz_protobuf_S2C_RankRewardInfo_8812_descriptor, new String[]{"Type", "RewardDataList"});
      internal_static_rank_com_gzbz_protobuf_C2S_RankReward_8813_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_rank_com_gzbz_protobuf_C2S_RankReward_8813_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rank_com_gzbz_protobuf_C2S_RankReward_8813_descriptor, new String[]{"Id"});
      internal_static_rank_com_gzbz_protobuf_S2C_RankReward_8814_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_rank_com_gzbz_protobuf_S2C_RankReward_8814_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rank_com_gzbz_protobuf_S2C_RankReward_8814_descriptor, new String[]{"Id"});
      internal_static_rank_com_gzbz_protobuf_C2S_OpenServerRank_8815_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_rank_com_gzbz_protobuf_C2S_OpenServerRank_8815_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rank_com_gzbz_protobuf_C2S_OpenServerRank_8815_descriptor, new String[]{"ModuleId"});
      internal_static_rank_com_gzbz_protobuf_S2C_OpenServerRank_8816_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_rank_com_gzbz_protobuf_S2C_OpenServerRank_8816_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rank_com_gzbz_protobuf_S2C_OpenServerRank_8816_descriptor, new String[]{"ModuleId", "MyRank", "Ranks", "Time"});
      internal_static_rank_com_gzbz_protobuf_C2S_RankRewardOneKey_8817_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_rank_com_gzbz_protobuf_C2S_RankRewardOneKey_8817_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rank_com_gzbz_protobuf_C2S_RankRewardOneKey_8817_descriptor, new String[]{"Type"});
      internal_static_rank_com_gzbz_protobuf_S2C_RankRewardOneKey_8818_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_rank_com_gzbz_protobuf_S2C_RankRewardOneKey_8818_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rank_com_gzbz_protobuf_S2C_RankRewardOneKey_8818_descriptor, new String[]{"Type", "Id"});
      PlayerMsg.getDescriptor();
      CommonMsg.getDescriptor();
   }

   public static enum SubType implements ProtocolMessageEnum {
      PROGRESS(1),
      CULTIVATION(2);

      public static final int PROGRESS_VALUE = 1;
      public static final int CULTIVATION_VALUE = 2;
      private static final Internal.EnumLiteMap<SubType> internalValueMap = new Internal.EnumLiteMap<SubType>() {
         public SubType findValueByNumber(int number) {
            return RankMsg.SubType.forNumber(number);
         }
      };
      private static final SubType[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static SubType valueOf(int value) {
         return forNumber(value);
      }

      public static SubType forNumber(int value) {
         switch (value) {
            case 1:
               return PROGRESS;
            case 2:
               return CULTIVATION;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<SubType> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)RankMsg.getDescriptor().getEnumTypes().get(0);
      }

      public static SubType valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private SubType(int value) {
         this.value = value;
      }
   }

   public static final class TypeRanks extends GeneratedMessageV3 implements TypeRanksOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MODULEID_FIELD_NUMBER = 1;
      private int moduleId_;
      public static final int RANDS_FIELD_NUMBER = 2;
      private List<RankData> rands_;
      public static final int TYPE_FIELD_NUMBER = 3;
      private int type_;
      private byte memoizedIsInitialized;
      private static final TypeRanks DEFAULT_INSTANCE = new TypeRanks();
      /** @deprecated */
      @Deprecated
      public static final Parser<TypeRanks> PARSER = new AbstractParser<TypeRanks>() {
         public TypeRanks parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new TypeRanks(input, extensionRegistry);
         }
      };

      private TypeRanks(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private TypeRanks() {
         this.memoizedIsInitialized = -1;
         this.rands_ = Collections.emptyList();
         this.type_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new TypeRanks();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private TypeRanks(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.moduleId_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.rands_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.rands_.add(input.readMessage(RankMsg.RankData.PARSER, extensionRegistry));
                        break;
                     case 24:
                        int rawValue = input.readEnum();
                        SubType value = RankMsg.SubType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(3, rawValue);
                        } else {
                           this.bitField0_ |= 2;
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
               if ((mutable_bitField0_ & 2) != 0) {
                  this.rands_ = Collections.unmodifiableList(this.rands_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_TypeRanks_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_TypeRanks_fieldAccessorTable.ensureFieldAccessorsInitialized(TypeRanks.class, Builder.class);
      }

      public boolean hasModuleId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getModuleId() {
         return this.moduleId_;
      }

      public List<RankData> getRandsList() {
         return this.rands_;
      }

      public List<? extends RankDataOrBuilder> getRandsOrBuilderList() {
         return this.rands_;
      }

      public int getRandsCount() {
         return this.rands_.size();
      }

      public RankData getRands(int index) {
         return (RankData)this.rands_.get(index);
      }

      public RankDataOrBuilder getRandsOrBuilder(int index) {
         return (RankDataOrBuilder)this.rands_.get(index);
      }

      public boolean hasType() {
         return (this.bitField0_ & 2) != 0;
      }

      public SubType getType() {
         SubType result = RankMsg.SubType.valueOf(this.type_);
         return result == null ? RankMsg.SubType.PROGRESS : result;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasModuleId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRandsCount(); ++i) {
               if (!this.getRands(i).isInitialized()) {
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
            output.writeInt32(1, this.moduleId_);
         }

         for(int i = 0; i < this.rands_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.rands_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(3, this.type_);
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
               size += CodedOutputStream.computeInt32Size(1, this.moduleId_);
            }

            for(int i = 0; i < this.rands_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.rands_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(3, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof TypeRanks)) {
            return super.equals(obj);
         } else {
            TypeRanks other = (TypeRanks)obj;
            if (this.hasModuleId() != other.hasModuleId()) {
               return false;
            } else if (this.hasModuleId() && this.getModuleId() != other.getModuleId()) {
               return false;
            } else if (!this.getRandsList().equals(other.getRandsList())) {
               return false;
            } else if (this.hasType() != other.hasType()) {
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
            if (this.hasModuleId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getModuleId();
            }

            if (this.getRandsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRandsList().hashCode();
            }

            if (this.hasType()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.type_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static TypeRanks parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (TypeRanks)PARSER.parseFrom(data);
      }

      public static TypeRanks parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TypeRanks)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TypeRanks parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (TypeRanks)PARSER.parseFrom(data);
      }

      public static TypeRanks parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TypeRanks)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TypeRanks parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (TypeRanks)PARSER.parseFrom(data);
      }

      public static TypeRanks parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TypeRanks)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TypeRanks parseFrom(InputStream input) throws IOException {
         return (TypeRanks)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TypeRanks parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TypeRanks)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static TypeRanks parseDelimitedFrom(InputStream input) throws IOException {
         return (TypeRanks)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static TypeRanks parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TypeRanks)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static TypeRanks parseFrom(CodedInputStream input) throws IOException {
         return (TypeRanks)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TypeRanks parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TypeRanks)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(TypeRanks prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static TypeRanks getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<TypeRanks> parser() {
         return PARSER;
      }

      public Parser<TypeRanks> getParserForType() {
         return PARSER;
      }

      public TypeRanks getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TypeRanksOrBuilder {
         private int bitField0_;
         private int moduleId_;
         private List<RankData> rands_;
         private RepeatedFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> randsBuilder_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_TypeRanks_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_TypeRanks_fieldAccessorTable.ensureFieldAccessorsInitialized(TypeRanks.class, Builder.class);
         }

         private Builder() {
            this.rands_ = Collections.emptyList();
            this.type_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rands_ = Collections.emptyList();
            this.type_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RankMsg.TypeRanks.alwaysUseFieldBuilders) {
               this.getRandsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.moduleId_ = 0;
            this.bitField0_ &= -2;
            if (this.randsBuilder_ == null) {
               this.rands_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.randsBuilder_.clear();
            }

            this.type_ = 1;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_TypeRanks_descriptor;
         }

         public TypeRanks getDefaultInstanceForType() {
            return RankMsg.TypeRanks.getDefaultInstance();
         }

         public TypeRanks build() {
            TypeRanks result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public TypeRanks buildPartial() {
            TypeRanks result = new TypeRanks(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.moduleId_ = this.moduleId_;
               to_bitField0_ |= 1;
            }

            if (this.randsBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.rands_ = Collections.unmodifiableList(this.rands_);
                  this.bitField0_ &= -3;
               }

               result.rands_ = this.rands_;
            } else {
               result.rands_ = this.randsBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 2;
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
            if (other instanceof TypeRanks) {
               return this.mergeFrom((TypeRanks)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(TypeRanks other) {
            if (other == RankMsg.TypeRanks.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasModuleId()) {
                  this.setModuleId(other.getModuleId());
               }

               if (this.randsBuilder_ == null) {
                  if (!other.rands_.isEmpty()) {
                     if (this.rands_.isEmpty()) {
                        this.rands_ = other.rands_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureRandsIsMutable();
                        this.rands_.addAll(other.rands_);
                     }

                     this.onChanged();
                  }
               } else if (!other.rands_.isEmpty()) {
                  if (this.randsBuilder_.isEmpty()) {
                     this.randsBuilder_.dispose();
                     this.randsBuilder_ = null;
                     this.rands_ = other.rands_;
                     this.bitField0_ &= -3;
                     this.randsBuilder_ = RankMsg.TypeRanks.alwaysUseFieldBuilders ? this.getRandsFieldBuilder() : null;
                  } else {
                     this.randsBuilder_.addAllMessages(other.rands_);
                  }
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
            if (!this.hasModuleId()) {
               return false;
            } else {
               for(int i = 0; i < this.getRandsCount(); ++i) {
                  if (!this.getRands(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            TypeRanks parsedMessage = null;

            try {
               parsedMessage = (TypeRanks)RankMsg.TypeRanks.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (TypeRanks)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasModuleId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getModuleId() {
            return this.moduleId_;
         }

         public Builder setModuleId(int value) {
            this.bitField0_ |= 1;
            this.moduleId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModuleId() {
            this.bitField0_ &= -2;
            this.moduleId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRandsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.rands_ = new ArrayList(this.rands_);
               this.bitField0_ |= 2;
            }

         }

         public List<RankData> getRandsList() {
            return this.randsBuilder_ == null ? Collections.unmodifiableList(this.rands_) : this.randsBuilder_.getMessageList();
         }

         public int getRandsCount() {
            return this.randsBuilder_ == null ? this.rands_.size() : this.randsBuilder_.getCount();
         }

         public RankData getRands(int index) {
            return this.randsBuilder_ == null ? (RankData)this.rands_.get(index) : (RankData)this.randsBuilder_.getMessage(index);
         }

         public Builder setRands(int index, RankData value) {
            if (this.randsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRandsIsMutable();
               this.rands_.set(index, value);
               this.onChanged();
            } else {
               this.randsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRands(int index, RankData.Builder builderForValue) {
            if (this.randsBuilder_ == null) {
               this.ensureRandsIsMutable();
               this.rands_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.randsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRands(RankData value) {
            if (this.randsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRandsIsMutable();
               this.rands_.add(value);
               this.onChanged();
            } else {
               this.randsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRands(int index, RankData value) {
            if (this.randsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRandsIsMutable();
               this.rands_.add(index, value);
               this.onChanged();
            } else {
               this.randsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRands(RankData.Builder builderForValue) {
            if (this.randsBuilder_ == null) {
               this.ensureRandsIsMutable();
               this.rands_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.randsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRands(int index, RankData.Builder builderForValue) {
            if (this.randsBuilder_ == null) {
               this.ensureRandsIsMutable();
               this.rands_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.randsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRands(Iterable<? extends RankData> values) {
            if (this.randsBuilder_ == null) {
               this.ensureRandsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rands_);
               this.onChanged();
            } else {
               this.randsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRands() {
            if (this.randsBuilder_ == null) {
               this.rands_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.randsBuilder_.clear();
            }

            return this;
         }

         public Builder removeRands(int index) {
            if (this.randsBuilder_ == null) {
               this.ensureRandsIsMutable();
               this.rands_.remove(index);
               this.onChanged();
            } else {
               this.randsBuilder_.remove(index);
            }

            return this;
         }

         public RankData.Builder getRandsBuilder(int index) {
            return (RankData.Builder)this.getRandsFieldBuilder().getBuilder(index);
         }

         public RankDataOrBuilder getRandsOrBuilder(int index) {
            return this.randsBuilder_ == null ? (RankDataOrBuilder)this.rands_.get(index) : (RankDataOrBuilder)this.randsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankDataOrBuilder> getRandsOrBuilderList() {
            return this.randsBuilder_ != null ? this.randsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rands_);
         }

         public RankData.Builder addRandsBuilder() {
            return (RankData.Builder)this.getRandsFieldBuilder().addBuilder(RankMsg.RankData.getDefaultInstance());
         }

         public RankData.Builder addRandsBuilder(int index) {
            return (RankData.Builder)this.getRandsFieldBuilder().addBuilder(index, RankMsg.RankData.getDefaultInstance());
         }

         public List<RankData.Builder> getRandsBuilderList() {
            return this.getRandsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> getRandsFieldBuilder() {
            if (this.randsBuilder_ == null) {
               this.randsBuilder_ = new RepeatedFieldBuilderV3(this.rands_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.rands_ = null;
            }

            return this.randsBuilder_;
         }

         public boolean hasType() {
            return (this.bitField0_ & 4) != 0;
         }

         public SubType getType() {
            SubType result = RankMsg.SubType.valueOf(this.type_);
            return result == null ? RankMsg.SubType.PROGRESS : result;
         }

         public Builder setType(SubType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.type_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearType() {
            this.bitField0_ &= -5;
            this.type_ = 1;
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

   public static final class RankData extends GeneratedMessageV3 implements RankDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int SCORE_FIELD_NUMBER = 2;
      private long score_;
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
      public static final int PLAYERINFOS_FIELD_NUMBER = 10;
      private List<PlayerMsg.PropertyCell> playerInfos_;
      public static final int SERVERID_FIELD_NUMBER = 11;
      private int serverId_;
      public static final int UNIONNAME_FIELD_NUMBER = 12;
      private volatile Object unionName_;
      public static final int UNIONID_FIELD_NUMBER = 13;
      private int unionId_;
      public static final int HEROINFO_FIELD_NUMBER = 14;
      private CommonMsg.HeroInfo heroInfo_;
      public static final int FIRSTYEARTREASURENUM_FIELD_NUMBER = 15;
      private long firstYearTreasureNum_;
      public static final int CHINESENEWYEARTREASURENUM_FIELD_NUMBER = 16;
      private long chineseNewYearTreasureNum_;
      private byte memoizedIsInitialized;
      private static final RankData DEFAULT_INSTANCE = new RankData();
      /** @deprecated */
      @Deprecated
      public static final Parser<RankData> PARSER = new AbstractParser<RankData>() {
         public RankData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RankData(input, extensionRegistry);
         }
      };

      private RankData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RankData() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
         this.playerInfos_ = Collections.emptyList();
         this.unionName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RankData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RankData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 82:
                        if ((mutable_bitField0_ & 512) == 0) {
                           this.playerInfos_ = new ArrayList();
                           mutable_bitField0_ |= 512;
                        }

                        this.playerInfos_.add(input.readMessage(PlayerMsg.PropertyCell.PARSER, extensionRegistry));
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
                     case 104:
                        this.bitField0_ |= 2048;
                        this.unionId_ = input.readInt32();
                        break;
                     case 114:
                        CommonMsg.HeroInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 4096) != 0) {
                           subBuilder = this.heroInfo_.toBuilder();
                        }

                        this.heroInfo_ = (CommonMsg.HeroInfo)input.readMessage(CommonMsg.HeroInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.heroInfo_);
                           this.heroInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4096;
                        break;
                     case 120:
                        this.bitField0_ |= 8192;
                        this.firstYearTreasureNum_ = input.readInt64();
                        break;
                     case 128:
                        this.bitField0_ |= 16384;
                        this.chineseNewYearTreasureNum_ = input.readInt64();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 512) != 0) {
                  this.playerInfos_ = Collections.unmodifiableList(this.playerInfos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_RankData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_RankData_fieldAccessorTable.ensureFieldAccessorsInitialized(RankData.class, Builder.class);
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

      public List<PlayerMsg.PropertyCell> getPlayerInfosList() {
         return this.playerInfos_;
      }

      public List<? extends PlayerMsg.PropertyCellOrBuilder> getPlayerInfosOrBuilderList() {
         return this.playerInfos_;
      }

      public int getPlayerInfosCount() {
         return this.playerInfos_.size();
      }

      public PlayerMsg.PropertyCell getPlayerInfos(int index) {
         return (PlayerMsg.PropertyCell)this.playerInfos_.get(index);
      }

      public PlayerMsg.PropertyCellOrBuilder getPlayerInfosOrBuilder(int index) {
         return (PlayerMsg.PropertyCellOrBuilder)this.playerInfos_.get(index);
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

      public boolean hasUnionId() {
         return (this.bitField0_ & 2048) != 0;
      }

      public int getUnionId() {
         return this.unionId_;
      }

      public boolean hasHeroInfo() {
         return (this.bitField0_ & 4096) != 0;
      }

      public CommonMsg.HeroInfo getHeroInfo() {
         return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
      }

      public CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder() {
         return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
      }

      public boolean hasFirstYearTreasureNum() {
         return (this.bitField0_ & 8192) != 0;
      }

      public long getFirstYearTreasureNum() {
         return this.firstYearTreasureNum_;
      }

      public boolean hasChineseNewYearTreasureNum() {
         return (this.bitField0_ & 16384) != 0;
      }

      public long getChineseNewYearTreasureNum() {
         return this.chineseNewYearTreasureNum_;
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
         } else {
            for(int i = 0; i < this.getPlayerInfosCount(); ++i) {
               if (!this.getPlayerInfos(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            if (this.hasHeroInfo() && !this.getHeroInfo().isInitialized()) {
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
            output.writeInt32(1, this.rank_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.score_);
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

         for(int i = 0; i < this.playerInfos_.size(); ++i) {
            output.writeMessage(10, (MessageLite)this.playerInfos_.get(i));
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(11, this.serverId_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            GeneratedMessageV3.writeString(output, 12, this.unionName_);
         }

         if ((this.bitField0_ & 2048) != 0) {
            output.writeInt32(13, this.unionId_);
         }

         if ((this.bitField0_ & 4096) != 0) {
            output.writeMessage(14, this.getHeroInfo());
         }

         if ((this.bitField0_ & 8192) != 0) {
            output.writeInt64(15, this.firstYearTreasureNum_);
         }

         if ((this.bitField0_ & 16384) != 0) {
            output.writeInt64(16, this.chineseNewYearTreasureNum_);
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

            for(int i = 0; i < this.playerInfos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(10, (MessageLite)this.playerInfos_.get(i));
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.serverId_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += GeneratedMessageV3.computeStringSize(12, this.unionName_);
            }

            if ((this.bitField0_ & 2048) != 0) {
               size += CodedOutputStream.computeInt32Size(13, this.unionId_);
            }

            if ((this.bitField0_ & 4096) != 0) {
               size += CodedOutputStream.computeMessageSize(14, this.getHeroInfo());
            }

            if ((this.bitField0_ & 8192) != 0) {
               size += CodedOutputStream.computeInt64Size(15, this.firstYearTreasureNum_);
            }

            if ((this.bitField0_ & 16384) != 0) {
               size += CodedOutputStream.computeInt64Size(16, this.chineseNewYearTreasureNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RankData)) {
            return super.equals(obj);
         } else {
            RankData other = (RankData)obj;
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
            } else if (!this.getPlayerInfosList().equals(other.getPlayerInfosList())) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasUnionName() != other.hasUnionName()) {
               return false;
            } else if (this.hasUnionName() && !this.getUnionName().equals(other.getUnionName())) {
               return false;
            } else if (this.hasUnionId() != other.hasUnionId()) {
               return false;
            } else if (this.hasUnionId() && this.getUnionId() != other.getUnionId()) {
               return false;
            } else if (this.hasHeroInfo() != other.hasHeroInfo()) {
               return false;
            } else if (this.hasHeroInfo() && !this.getHeroInfo().equals(other.getHeroInfo())) {
               return false;
            } else if (this.hasFirstYearTreasureNum() != other.hasFirstYearTreasureNum()) {
               return false;
            } else if (this.hasFirstYearTreasureNum() && this.getFirstYearTreasureNum() != other.getFirstYearTreasureNum()) {
               return false;
            } else if (this.hasChineseNewYearTreasureNum() != other.hasChineseNewYearTreasureNum()) {
               return false;
            } else if (this.hasChineseNewYearTreasureNum() && this.getChineseNewYearTreasureNum() != other.getChineseNewYearTreasureNum()) {
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

            if (this.getPlayerInfosCount() > 0) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getPlayerInfosList().hashCode();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasUnionName()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getUnionName().hashCode();
            }

            if (this.hasUnionId()) {
               hash = 37 * hash + 13;
               hash = 53 * hash + this.getUnionId();
            }

            if (this.hasHeroInfo()) {
               hash = 37 * hash + 14;
               hash = 53 * hash + this.getHeroInfo().hashCode();
            }

            if (this.hasFirstYearTreasureNum()) {
               hash = 37 * hash + 15;
               hash = 53 * hash + Internal.hashLong(this.getFirstYearTreasureNum());
            }

            if (this.hasChineseNewYearTreasureNum()) {
               hash = 37 * hash + 16;
               hash = 53 * hash + Internal.hashLong(this.getChineseNewYearTreasureNum());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RankData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RankData)PARSER.parseFrom(data);
      }

      public static RankData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RankData)PARSER.parseFrom(data);
      }

      public static RankData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RankData)PARSER.parseFrom(data);
      }

      public static RankData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankData parseFrom(InputStream input) throws IOException {
         return (RankData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RankData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RankData parseDelimitedFrom(InputStream input) throws IOException {
         return (RankData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RankData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RankData parseFrom(CodedInputStream input) throws IOException {
         return (RankData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RankData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RankData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RankData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RankData> parser() {
         return PARSER;
      }

      public Parser<RankData> getParserForType() {
         return PARSER;
      }

      public RankData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RankDataOrBuilder {
         private int bitField0_;
         private int rank_;
         private long score_;
         private int playerId_;
         private Object playerName_;
         private int head_;
         private int headFrame_;
         private int level_;
         private long power_;
         private int monarchId_;
         private List<PlayerMsg.PropertyCell> playerInfos_;
         private RepeatedFieldBuilderV3<PlayerMsg.PropertyCell, PlayerMsg.PropertyCell.Builder, PlayerMsg.PropertyCellOrBuilder> playerInfosBuilder_;
         private int serverId_;
         private Object unionName_;
         private int unionId_;
         private CommonMsg.HeroInfo heroInfo_;
         private SingleFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> heroInfoBuilder_;
         private long firstYearTreasureNum_;
         private long chineseNewYearTreasureNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_RankData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_RankData_fieldAccessorTable.ensureFieldAccessorsInitialized(RankData.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.playerInfos_ = Collections.emptyList();
            this.unionName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.playerInfos_ = Collections.emptyList();
            this.unionName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RankMsg.RankData.alwaysUseFieldBuilders) {
               this.getPlayerInfosFieldBuilder();
               this.getHeroInfoFieldBuilder();
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
            if (this.playerInfosBuilder_ == null) {
               this.playerInfos_ = Collections.emptyList();
               this.bitField0_ &= -513;
            } else {
               this.playerInfosBuilder_.clear();
            }

            this.serverId_ = 0;
            this.bitField0_ &= -1025;
            this.unionName_ = "";
            this.bitField0_ &= -2049;
            this.unionId_ = 0;
            this.bitField0_ &= -4097;
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -8193;
            this.firstYearTreasureNum_ = 0L;
            this.bitField0_ &= -16385;
            this.chineseNewYearTreasureNum_ = 0L;
            this.bitField0_ &= -32769;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_RankData_descriptor;
         }

         public RankData getDefaultInstanceForType() {
            return RankMsg.RankData.getDefaultInstance();
         }

         public RankData build() {
            RankData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RankData buildPartial() {
            RankData result = new RankData(this);
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

            if (this.playerInfosBuilder_ == null) {
               if ((this.bitField0_ & 512) != 0) {
                  this.playerInfos_ = Collections.unmodifiableList(this.playerInfos_);
                  this.bitField0_ &= -513;
               }

               result.playerInfos_ = this.playerInfos_;
            } else {
               result.playerInfos_ = this.playerInfosBuilder_.build();
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 512;
            }

            if ((from_bitField0_ & 2048) != 0) {
               to_bitField0_ |= 1024;
            }

            result.unionName_ = this.unionName_;
            if ((from_bitField0_ & 4096) != 0) {
               result.unionId_ = this.unionId_;
               to_bitField0_ |= 2048;
            }

            if ((from_bitField0_ & 8192) != 0) {
               if (this.heroInfoBuilder_ == null) {
                  result.heroInfo_ = this.heroInfo_;
               } else {
                  result.heroInfo_ = (CommonMsg.HeroInfo)this.heroInfoBuilder_.build();
               }

               to_bitField0_ |= 4096;
            }

            if ((from_bitField0_ & 16384) != 0) {
               result.firstYearTreasureNum_ = this.firstYearTreasureNum_;
               to_bitField0_ |= 8192;
            }

            if ((from_bitField0_ & '耀') != 0) {
               result.chineseNewYearTreasureNum_ = this.chineseNewYearTreasureNum_;
               to_bitField0_ |= 16384;
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
            if (other instanceof RankData) {
               return this.mergeFrom((RankData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RankData other) {
            if (other == RankMsg.RankData.getDefaultInstance()) {
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

               if (this.playerInfosBuilder_ == null) {
                  if (!other.playerInfos_.isEmpty()) {
                     if (this.playerInfos_.isEmpty()) {
                        this.playerInfos_ = other.playerInfos_;
                        this.bitField0_ &= -513;
                     } else {
                        this.ensurePlayerInfosIsMutable();
                        this.playerInfos_.addAll(other.playerInfos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.playerInfos_.isEmpty()) {
                  if (this.playerInfosBuilder_.isEmpty()) {
                     this.playerInfosBuilder_.dispose();
                     this.playerInfosBuilder_ = null;
                     this.playerInfos_ = other.playerInfos_;
                     this.bitField0_ &= -513;
                     this.playerInfosBuilder_ = RankMsg.RankData.alwaysUseFieldBuilders ? this.getPlayerInfosFieldBuilder() : null;
                  } else {
                     this.playerInfosBuilder_.addAllMessages(other.playerInfos_);
                  }
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasUnionName()) {
                  this.bitField0_ |= 2048;
                  this.unionName_ = other.unionName_;
                  this.onChanged();
               }

               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               if (other.hasHeroInfo()) {
                  this.mergeHeroInfo(other.getHeroInfo());
               }

               if (other.hasFirstYearTreasureNum()) {
                  this.setFirstYearTreasureNum(other.getFirstYearTreasureNum());
               }

               if (other.hasChineseNewYearTreasureNum()) {
                  this.setChineseNewYearTreasureNum(other.getChineseNewYearTreasureNum());
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
               for(int i = 0; i < this.getPlayerInfosCount(); ++i) {
                  if (!this.getPlayerInfos(i).isInitialized()) {
                     return false;
                  }
               }

               if (this.hasHeroInfo() && !this.getHeroInfo().isInitialized()) {
                  return false;
               } else {
                  return true;
               }
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RankData parsedMessage = null;

            try {
               parsedMessage = (RankData)RankMsg.RankData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RankData)e.getUnfinishedMessage();
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
            this.playerName_ = RankMsg.RankData.getDefaultInstance().getPlayerName();
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

         private void ensurePlayerInfosIsMutable() {
            if ((this.bitField0_ & 512) == 0) {
               this.playerInfos_ = new ArrayList(this.playerInfos_);
               this.bitField0_ |= 512;
            }

         }

         public List<PlayerMsg.PropertyCell> getPlayerInfosList() {
            return this.playerInfosBuilder_ == null ? Collections.unmodifiableList(this.playerInfos_) : this.playerInfosBuilder_.getMessageList();
         }

         public int getPlayerInfosCount() {
            return this.playerInfosBuilder_ == null ? this.playerInfos_.size() : this.playerInfosBuilder_.getCount();
         }

         public PlayerMsg.PropertyCell getPlayerInfos(int index) {
            return this.playerInfosBuilder_ == null ? (PlayerMsg.PropertyCell)this.playerInfos_.get(index) : (PlayerMsg.PropertyCell)this.playerInfosBuilder_.getMessage(index);
         }

         public Builder setPlayerInfos(int index, PlayerMsg.PropertyCell value) {
            if (this.playerInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerInfosIsMutable();
               this.playerInfos_.set(index, value);
               this.onChanged();
            } else {
               this.playerInfosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPlayerInfos(int index, PlayerMsg.PropertyCell.Builder builderForValue) {
            if (this.playerInfosBuilder_ == null) {
               this.ensurePlayerInfosIsMutable();
               this.playerInfos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerInfosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPlayerInfos(PlayerMsg.PropertyCell value) {
            if (this.playerInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerInfosIsMutable();
               this.playerInfos_.add(value);
               this.onChanged();
            } else {
               this.playerInfosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPlayerInfos(int index, PlayerMsg.PropertyCell value) {
            if (this.playerInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerInfosIsMutable();
               this.playerInfos_.add(index, value);
               this.onChanged();
            } else {
               this.playerInfosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPlayerInfos(PlayerMsg.PropertyCell.Builder builderForValue) {
            if (this.playerInfosBuilder_ == null) {
               this.ensurePlayerInfosIsMutable();
               this.playerInfos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.playerInfosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPlayerInfos(int index, PlayerMsg.PropertyCell.Builder builderForValue) {
            if (this.playerInfosBuilder_ == null) {
               this.ensurePlayerInfosIsMutable();
               this.playerInfos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerInfosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPlayerInfos(Iterable<? extends PlayerMsg.PropertyCell> values) {
            if (this.playerInfosBuilder_ == null) {
               this.ensurePlayerInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.playerInfos_);
               this.onChanged();
            } else {
               this.playerInfosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPlayerInfos() {
            if (this.playerInfosBuilder_ == null) {
               this.playerInfos_ = Collections.emptyList();
               this.bitField0_ &= -513;
               this.onChanged();
            } else {
               this.playerInfosBuilder_.clear();
            }

            return this;
         }

         public Builder removePlayerInfos(int index) {
            if (this.playerInfosBuilder_ == null) {
               this.ensurePlayerInfosIsMutable();
               this.playerInfos_.remove(index);
               this.onChanged();
            } else {
               this.playerInfosBuilder_.remove(index);
            }

            return this;
         }

         public PlayerMsg.PropertyCell.Builder getPlayerInfosBuilder(int index) {
            return (PlayerMsg.PropertyCell.Builder)this.getPlayerInfosFieldBuilder().getBuilder(index);
         }

         public PlayerMsg.PropertyCellOrBuilder getPlayerInfosOrBuilder(int index) {
            return this.playerInfosBuilder_ == null ? (PlayerMsg.PropertyCellOrBuilder)this.playerInfos_.get(index) : (PlayerMsg.PropertyCellOrBuilder)this.playerInfosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends PlayerMsg.PropertyCellOrBuilder> getPlayerInfosOrBuilderList() {
            return this.playerInfosBuilder_ != null ? this.playerInfosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.playerInfos_);
         }

         public PlayerMsg.PropertyCell.Builder addPlayerInfosBuilder() {
            return (PlayerMsg.PropertyCell.Builder)this.getPlayerInfosFieldBuilder().addBuilder(PlayerMsg.PropertyCell.getDefaultInstance());
         }

         public PlayerMsg.PropertyCell.Builder addPlayerInfosBuilder(int index) {
            return (PlayerMsg.PropertyCell.Builder)this.getPlayerInfosFieldBuilder().addBuilder(index, PlayerMsg.PropertyCell.getDefaultInstance());
         }

         public List<PlayerMsg.PropertyCell.Builder> getPlayerInfosBuilderList() {
            return this.getPlayerInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PlayerMsg.PropertyCell, PlayerMsg.PropertyCell.Builder, PlayerMsg.PropertyCellOrBuilder> getPlayerInfosFieldBuilder() {
            if (this.playerInfosBuilder_ == null) {
               this.playerInfosBuilder_ = new RepeatedFieldBuilderV3(this.playerInfos_, (this.bitField0_ & 512) != 0, this.getParentForChildren(), this.isClean());
               this.playerInfos_ = null;
            }

            return this.playerInfosBuilder_;
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 1024) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 1024;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -1025;
            this.serverId_ = 0;
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
            this.unionName_ = RankMsg.RankData.getDefaultInstance().getUnionName();
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

         public boolean hasUnionId() {
            return (this.bitField0_ & 4096) != 0;
         }

         public int getUnionId() {
            return this.unionId_;
         }

         public Builder setUnionId(int value) {
            this.bitField0_ |= 4096;
            this.unionId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionId() {
            this.bitField0_ &= -4097;
            this.unionId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroInfo() {
            return (this.bitField0_ & 8192) != 0;
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

            this.bitField0_ |= 8192;
            return this;
         }

         public Builder setHeroInfo(CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.heroInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 8192;
            return this;
         }

         public Builder mergeHeroInfo(CommonMsg.HeroInfo value) {
            if (this.heroInfoBuilder_ == null) {
               if ((this.bitField0_ & 8192) != 0 && this.heroInfo_ != null && this.heroInfo_ != CommonMsg.HeroInfo.getDefaultInstance()) {
                  this.heroInfo_ = CommonMsg.HeroInfo.newBuilder(this.heroInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.heroInfo_ = value;
               }

               this.onChanged();
            } else {
               this.heroInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 8192;
            return this;
         }

         public Builder clearHeroInfo() {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
               this.onChanged();
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -8193;
            return this;
         }

         public CommonMsg.HeroInfo.Builder getHeroInfoBuilder() {
            this.bitField0_ |= 8192;
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

         public boolean hasFirstYearTreasureNum() {
            return (this.bitField0_ & 16384) != 0;
         }

         public long getFirstYearTreasureNum() {
            return this.firstYearTreasureNum_;
         }

         public Builder setFirstYearTreasureNum(long value) {
            this.bitField0_ |= 16384;
            this.firstYearTreasureNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFirstYearTreasureNum() {
            this.bitField0_ &= -16385;
            this.firstYearTreasureNum_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasChineseNewYearTreasureNum() {
            return (this.bitField0_ & '耀') != 0;
         }

         public long getChineseNewYearTreasureNum() {
            return this.chineseNewYearTreasureNum_;
         }

         public Builder setChineseNewYearTreasureNum(long value) {
            this.bitField0_ |= 32768;
            this.chineseNewYearTreasureNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChineseNewYearTreasureNum() {
            this.bitField0_ &= -32769;
            this.chineseNewYearTreasureNum_ = 0L;
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

   public static final class RankUnionData extends GeneratedMessageV3 implements RankUnionDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int SCORE_FIELD_NUMBER = 2;
      private long score_;
      public static final int UNIONID_FIELD_NUMBER = 3;
      private int unionId_;
      public static final int HEAD_FIELD_NUMBER = 4;
      private int head_;
      public static final int HEADFRAME_FIELD_NUMBER = 5;
      private int headFrame_;
      public static final int UNIONNAME_FIELD_NUMBER = 6;
      private volatile Object unionName_;
      public static final int LEVEL_FIELD_NUMBER = 7;
      private int level_;
      public static final int LEADERID_FIELD_NUMBER = 8;
      private int leaderId_;
      public static final int LEADERNAME_FIELD_NUMBER = 9;
      private volatile Object leaderName_;
      public static final int COUNT_FIELD_NUMBER = 10;
      private int count_;
      public static final int UNIONHEAD_FIELD_NUMBER = 11;
      private int unionHead_;
      public static final int CURUNIONADDNUMBERID_FIELD_NUMBER = 12;
      private int curUnionAddNumberId_;
      private byte memoizedIsInitialized;
      private static final RankUnionData DEFAULT_INSTANCE = new RankUnionData();
      /** @deprecated */
      @Deprecated
      public static final Parser<RankUnionData> PARSER = new AbstractParser<RankUnionData>() {
         public RankUnionData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RankUnionData(input, extensionRegistry);
         }
      };

      private RankUnionData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RankUnionData() {
         this.memoizedIsInitialized = -1;
         this.unionName_ = "";
         this.leaderName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RankUnionData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RankUnionData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.unionId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.head_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.headFrame_ = input.readInt32();
                        break;
                     case 50:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 32;
                        this.unionName_ = bs;
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.level_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.leaderId_ = input.readInt32();
                        break;
                     case 74:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 256;
                        this.leaderName_ = bs;
                        break;
                     case 80:
                        this.bitField0_ |= 512;
                        this.count_ = input.readInt32();
                        break;
                     case 88:
                        this.bitField0_ |= 1024;
                        this.unionHead_ = input.readInt32();
                        break;
                     case 96:
                        this.bitField0_ |= 2048;
                        this.curUnionAddNumberId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return RankMsg.internal_static_rank_com_gzbz_protobuf_RankUnionData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_RankUnionData_fieldAccessorTable.ensureFieldAccessorsInitialized(RankUnionData.class, Builder.class);
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

      public boolean hasUnionId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getUnionId() {
         return this.unionId_;
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

      public boolean hasUnionName() {
         return (this.bitField0_ & 32) != 0;
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

      public boolean hasLevel() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public boolean hasLeaderId() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getLeaderId() {
         return this.leaderId_;
      }

      public boolean hasLeaderName() {
         return (this.bitField0_ & 256) != 0;
      }

      public String getLeaderName() {
         Object ref = this.leaderName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.leaderName_ = s;
            }

            return s;
         }
      }

      public ByteString getLeaderNameBytes() {
         Object ref = this.leaderName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.leaderName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasCount() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getCount() {
         return this.count_;
      }

      public boolean hasUnionHead() {
         return (this.bitField0_ & 1024) != 0;
      }

      public int getUnionHead() {
         return this.unionHead_;
      }

      public boolean hasCurUnionAddNumberId() {
         return (this.bitField0_ & 2048) != 0;
      }

      public int getCurUnionAddNumberId() {
         return this.curUnionAddNumberId_;
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
         } else if (!this.hasUnionId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasUnionName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLeaderId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLeaderName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCount()) {
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
            output.writeInt32(3, this.unionId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.head_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.headFrame_);
         }

         if ((this.bitField0_ & 32) != 0) {
            GeneratedMessageV3.writeString(output, 6, this.unionName_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.level_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.leaderId_);
         }

         if ((this.bitField0_ & 256) != 0) {
            GeneratedMessageV3.writeString(output, 9, this.leaderName_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(10, this.count_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            output.writeInt32(11, this.unionHead_);
         }

         if ((this.bitField0_ & 2048) != 0) {
            output.writeInt32(12, this.curUnionAddNumberId_);
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
               size += CodedOutputStream.computeInt32Size(3, this.unionId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.head_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.headFrame_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += GeneratedMessageV3.computeStringSize(6, this.unionName_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.level_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.leaderId_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += GeneratedMessageV3.computeStringSize(9, this.leaderName_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.count_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.unionHead_);
            }

            if ((this.bitField0_ & 2048) != 0) {
               size += CodedOutputStream.computeInt32Size(12, this.curUnionAddNumberId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RankUnionData)) {
            return super.equals(obj);
         } else {
            RankUnionData other = (RankUnionData)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasScore() != other.hasScore()) {
               return false;
            } else if (this.hasScore() && this.getScore() != other.getScore()) {
               return false;
            } else if (this.hasUnionId() != other.hasUnionId()) {
               return false;
            } else if (this.hasUnionId() && this.getUnionId() != other.getUnionId()) {
               return false;
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
               return false;
            } else if (this.hasUnionName() != other.hasUnionName()) {
               return false;
            } else if (this.hasUnionName() && !this.getUnionName().equals(other.getUnionName())) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (this.hasLeaderId() != other.hasLeaderId()) {
               return false;
            } else if (this.hasLeaderId() && this.getLeaderId() != other.getLeaderId()) {
               return false;
            } else if (this.hasLeaderName() != other.hasLeaderName()) {
               return false;
            } else if (this.hasLeaderName() && !this.getLeaderName().equals(other.getLeaderName())) {
               return false;
            } else if (this.hasCount() != other.hasCount()) {
               return false;
            } else if (this.hasCount() && this.getCount() != other.getCount()) {
               return false;
            } else if (this.hasUnionHead() != other.hasUnionHead()) {
               return false;
            } else if (this.hasUnionHead() && this.getUnionHead() != other.getUnionHead()) {
               return false;
            } else if (this.hasCurUnionAddNumberId() != other.hasCurUnionAddNumberId()) {
               return false;
            } else if (this.hasCurUnionAddNumberId() && this.getCurUnionAddNumberId() != other.getCurUnionAddNumberId()) {
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

            if (this.hasUnionId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getUnionId();
            }

            if (this.hasHead()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasUnionName()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getUnionName().hashCode();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getLevel();
            }

            if (this.hasLeaderId()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getLeaderId();
            }

            if (this.hasLeaderName()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getLeaderName().hashCode();
            }

            if (this.hasCount()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getCount();
            }

            if (this.hasUnionHead()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getUnionHead();
            }

            if (this.hasCurUnionAddNumberId()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getCurUnionAddNumberId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RankUnionData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RankUnionData)PARSER.parseFrom(data);
      }

      public static RankUnionData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankUnionData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankUnionData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RankUnionData)PARSER.parseFrom(data);
      }

      public static RankUnionData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankUnionData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankUnionData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RankUnionData)PARSER.parseFrom(data);
      }

      public static RankUnionData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankUnionData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankUnionData parseFrom(InputStream input) throws IOException {
         return (RankUnionData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RankUnionData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankUnionData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RankUnionData parseDelimitedFrom(InputStream input) throws IOException {
         return (RankUnionData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RankUnionData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankUnionData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RankUnionData parseFrom(CodedInputStream input) throws IOException {
         return (RankUnionData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RankUnionData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankUnionData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RankUnionData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RankUnionData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RankUnionData> parser() {
         return PARSER;
      }

      public Parser<RankUnionData> getParserForType() {
         return PARSER;
      }

      public RankUnionData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RankUnionDataOrBuilder {
         private int bitField0_;
         private int rank_;
         private long score_;
         private int unionId_;
         private int head_;
         private int headFrame_;
         private Object unionName_;
         private int level_;
         private int leaderId_;
         private Object leaderName_;
         private int count_;
         private int unionHead_;
         private int curUnionAddNumberId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_RankUnionData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_RankUnionData_fieldAccessorTable.ensureFieldAccessorsInitialized(RankUnionData.class, Builder.class);
         }

         private Builder() {
            this.unionName_ = "";
            this.leaderName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.unionName_ = "";
            this.leaderName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RankMsg.RankUnionData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.score_ = 0L;
            this.bitField0_ &= -3;
            this.unionId_ = 0;
            this.bitField0_ &= -5;
            this.head_ = 0;
            this.bitField0_ &= -9;
            this.headFrame_ = 0;
            this.bitField0_ &= -17;
            this.unionName_ = "";
            this.bitField0_ &= -33;
            this.level_ = 0;
            this.bitField0_ &= -65;
            this.leaderId_ = 0;
            this.bitField0_ &= -129;
            this.leaderName_ = "";
            this.bitField0_ &= -257;
            this.count_ = 0;
            this.bitField0_ &= -513;
            this.unionHead_ = 0;
            this.bitField0_ &= -1025;
            this.curUnionAddNumberId_ = 0;
            this.bitField0_ &= -2049;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_RankUnionData_descriptor;
         }

         public RankUnionData getDefaultInstanceForType() {
            return RankMsg.RankUnionData.getDefaultInstance();
         }

         public RankUnionData build() {
            RankUnionData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RankUnionData buildPartial() {
            RankUnionData result = new RankUnionData(this);
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
               result.unionId_ = this.unionId_;
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
               to_bitField0_ |= 32;
            }

            result.unionName_ = this.unionName_;
            if ((from_bitField0_ & 64) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.leaderId_ = this.leaderId_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               to_bitField0_ |= 256;
            }

            result.leaderName_ = this.leaderName_;
            if ((from_bitField0_ & 512) != 0) {
               result.count_ = this.count_;
               to_bitField0_ |= 512;
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.unionHead_ = this.unionHead_;
               to_bitField0_ |= 1024;
            }

            if ((from_bitField0_ & 2048) != 0) {
               result.curUnionAddNumberId_ = this.curUnionAddNumberId_;
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
            if (other instanceof RankUnionData) {
               return this.mergeFrom((RankUnionData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RankUnionData other) {
            if (other == RankMsg.RankUnionData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasScore()) {
                  this.setScore(other.getScore());
               }

               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               if (other.hasUnionName()) {
                  this.bitField0_ |= 32;
                  this.unionName_ = other.unionName_;
                  this.onChanged();
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (other.hasLeaderId()) {
                  this.setLeaderId(other.getLeaderId());
               }

               if (other.hasLeaderName()) {
                  this.bitField0_ |= 256;
                  this.leaderName_ = other.leaderName_;
                  this.onChanged();
               }

               if (other.hasCount()) {
                  this.setCount(other.getCount());
               }

               if (other.hasUnionHead()) {
                  this.setUnionHead(other.getUnionHead());
               }

               if (other.hasCurUnionAddNumberId()) {
                  this.setCurUnionAddNumberId(other.getCurUnionAddNumberId());
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
            } else if (!this.hasUnionId()) {
               return false;
            } else if (!this.hasUnionName()) {
               return false;
            } else if (!this.hasLevel()) {
               return false;
            } else if (!this.hasLeaderId()) {
               return false;
            } else if (!this.hasLeaderName()) {
               return false;
            } else {
               return this.hasCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RankUnionData parsedMessage = null;

            try {
               parsedMessage = (RankUnionData)RankMsg.RankUnionData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RankUnionData)e.getUnfinishedMessage();
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

         public boolean hasUnionName() {
            return (this.bitField0_ & 32) != 0;
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
               this.bitField0_ |= 32;
               this.unionName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearUnionName() {
            this.bitField0_ &= -33;
            this.unionName_ = RankMsg.RankUnionData.getDefaultInstance().getUnionName();
            this.onChanged();
            return this;
         }

         public Builder setUnionNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 32;
               this.unionName_ = value;
               this.onChanged();
               return this;
            }
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

         public boolean hasLeaderId() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getLeaderId() {
            return this.leaderId_;
         }

         public Builder setLeaderId(int value) {
            this.bitField0_ |= 128;
            this.leaderId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLeaderId() {
            this.bitField0_ &= -129;
            this.leaderId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLeaderName() {
            return (this.bitField0_ & 256) != 0;
         }

         public String getLeaderName() {
            Object ref = this.leaderName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.leaderName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getLeaderNameBytes() {
            Object ref = this.leaderName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.leaderName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setLeaderName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 256;
               this.leaderName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearLeaderName() {
            this.bitField0_ &= -257;
            this.leaderName_ = RankMsg.RankUnionData.getDefaultInstance().getLeaderName();
            this.onChanged();
            return this;
         }

         public Builder setLeaderNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 256;
               this.leaderName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasCount() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getCount() {
            return this.count_;
         }

         public Builder setCount(int value) {
            this.bitField0_ |= 512;
            this.count_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCount() {
            this.bitField0_ &= -513;
            this.count_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionHead() {
            return (this.bitField0_ & 1024) != 0;
         }

         public int getUnionHead() {
            return this.unionHead_;
         }

         public Builder setUnionHead(int value) {
            this.bitField0_ |= 1024;
            this.unionHead_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionHead() {
            this.bitField0_ &= -1025;
            this.unionHead_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCurUnionAddNumberId() {
            return (this.bitField0_ & 2048) != 0;
         }

         public int getCurUnionAddNumberId() {
            return this.curUnionAddNumberId_;
         }

         public Builder setCurUnionAddNumberId(int value) {
            this.bitField0_ |= 2048;
            this.curUnionAddNumberId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurUnionAddNumberId() {
            this.bitField0_ &= -2049;
            this.curUnionAddNumberId_ = 0;
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

   public static final class RankRewardData extends GeneratedMessageV3 implements RankRewardDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int RANKDATA_FIELD_NUMBER = 2;
      private List<RankData> rankData_;
      public static final int ISGOT_FIELD_NUMBER = 3;
      private boolean isGot_;
      private byte memoizedIsInitialized;
      private static final RankRewardData DEFAULT_INSTANCE = new RankRewardData();
      /** @deprecated */
      @Deprecated
      public static final Parser<RankRewardData> PARSER = new AbstractParser<RankRewardData>() {
         public RankRewardData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RankRewardData(input, extensionRegistry);
         }
      };

      private RankRewardData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RankRewardData() {
         this.memoizedIsInitialized = -1;
         this.rankData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RankRewardData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RankRewardData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.rankData_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.rankData_.add(input.readMessage(RankMsg.RankData.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.isGot_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return RankMsg.internal_static_rank_com_gzbz_protobuf_RankRewardData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_RankRewardData_fieldAccessorTable.ensureFieldAccessorsInitialized(RankRewardData.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public List<RankData> getRankDataList() {
         return this.rankData_;
      }

      public List<? extends RankDataOrBuilder> getRankDataOrBuilderList() {
         return this.rankData_;
      }

      public int getRankDataCount() {
         return this.rankData_.size();
      }

      public RankData getRankData(int index) {
         return (RankData)this.rankData_.get(index);
      }

      public RankDataOrBuilder getRankDataOrBuilder(int index) {
         return (RankDataOrBuilder)this.rankData_.get(index);
      }

      public boolean hasIsGot() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsGot() {
         return this.isGot_;
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
         } else if (!this.hasIsGot()) {
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
            output.writeInt32(1, this.id_);
         }

         for(int i = 0; i < this.rankData_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.rankData_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(3, this.isGot_);
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

            for(int i = 0; i < this.rankData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.rankData_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.isGot_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RankRewardData)) {
            return super.equals(obj);
         } else {
            RankRewardData other = (RankRewardData)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (!this.getRankDataList().equals(other.getRankDataList())) {
               return false;
            } else if (this.hasIsGot() != other.hasIsGot()) {
               return false;
            } else if (this.hasIsGot() && this.getIsGot() != other.getIsGot()) {
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

            if (this.getRankDataCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRankDataList().hashCode();
            }

            if (this.hasIsGot()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getIsGot());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RankRewardData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RankRewardData)PARSER.parseFrom(data);
      }

      public static RankRewardData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankRewardData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankRewardData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RankRewardData)PARSER.parseFrom(data);
      }

      public static RankRewardData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankRewardData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankRewardData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RankRewardData)PARSER.parseFrom(data);
      }

      public static RankRewardData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankRewardData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankRewardData parseFrom(InputStream input) throws IOException {
         return (RankRewardData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RankRewardData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankRewardData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RankRewardData parseDelimitedFrom(InputStream input) throws IOException {
         return (RankRewardData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RankRewardData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankRewardData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RankRewardData parseFrom(CodedInputStream input) throws IOException {
         return (RankRewardData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RankRewardData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankRewardData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RankRewardData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RankRewardData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RankRewardData> parser() {
         return PARSER;
      }

      public Parser<RankRewardData> getParserForType() {
         return PARSER;
      }

      public RankRewardData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RankRewardDataOrBuilder {
         private int bitField0_;
         private int id_;
         private List<RankData> rankData_;
         private RepeatedFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> rankDataBuilder_;
         private boolean isGot_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_RankRewardData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_RankRewardData_fieldAccessorTable.ensureFieldAccessorsInitialized(RankRewardData.class, Builder.class);
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
            if (RankMsg.RankRewardData.alwaysUseFieldBuilders) {
               this.getRankDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            if (this.rankDataBuilder_ == null) {
               this.rankData_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.rankDataBuilder_.clear();
            }

            this.isGot_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_RankRewardData_descriptor;
         }

         public RankRewardData getDefaultInstanceForType() {
            return RankMsg.RankRewardData.getDefaultInstance();
         }

         public RankRewardData build() {
            RankRewardData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RankRewardData buildPartial() {
            RankRewardData result = new RankRewardData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
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

            if ((from_bitField0_ & 4) != 0) {
               result.isGot_ = this.isGot_;
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
            if (other instanceof RankRewardData) {
               return this.mergeFrom((RankRewardData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RankRewardData other) {
            if (other == RankMsg.RankRewardData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
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
                     this.rankDataBuilder_ = RankMsg.RankRewardData.alwaysUseFieldBuilders ? this.getRankDataFieldBuilder() : null;
                  } else {
                     this.rankDataBuilder_.addAllMessages(other.rankData_);
                  }
               }

               if (other.hasIsGot()) {
                  this.setIsGot(other.getIsGot());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else if (!this.hasIsGot()) {
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
            RankRewardData parsedMessage = null;

            try {
               parsedMessage = (RankRewardData)RankMsg.RankRewardData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RankRewardData)e.getUnfinishedMessage();
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

         private void ensureRankDataIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.rankData_ = new ArrayList(this.rankData_);
               this.bitField0_ |= 2;
            }

         }

         public List<RankData> getRankDataList() {
            return this.rankDataBuilder_ == null ? Collections.unmodifiableList(this.rankData_) : this.rankDataBuilder_.getMessageList();
         }

         public int getRankDataCount() {
            return this.rankDataBuilder_ == null ? this.rankData_.size() : this.rankDataBuilder_.getCount();
         }

         public RankData getRankData(int index) {
            return this.rankDataBuilder_ == null ? (RankData)this.rankData_.get(index) : (RankData)this.rankDataBuilder_.getMessage(index);
         }

         public Builder setRankData(int index, RankData value) {
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

         public Builder setRankData(int index, RankData.Builder builderForValue) {
            if (this.rankDataBuilder_ == null) {
               this.ensureRankDataIsMutable();
               this.rankData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRankData(RankData value) {
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

         public Builder addRankData(int index, RankData value) {
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

         public Builder addRankData(RankData.Builder builderForValue) {
            if (this.rankDataBuilder_ == null) {
               this.ensureRankDataIsMutable();
               this.rankData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rankDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRankData(int index, RankData.Builder builderForValue) {
            if (this.rankDataBuilder_ == null) {
               this.ensureRankDataIsMutable();
               this.rankData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRankData(Iterable<? extends RankData> values) {
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

         public RankData.Builder getRankDataBuilder(int index) {
            return (RankData.Builder)this.getRankDataFieldBuilder().getBuilder(index);
         }

         public RankDataOrBuilder getRankDataOrBuilder(int index) {
            return this.rankDataBuilder_ == null ? (RankDataOrBuilder)this.rankData_.get(index) : (RankDataOrBuilder)this.rankDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankDataOrBuilder> getRankDataOrBuilderList() {
            return this.rankDataBuilder_ != null ? this.rankDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rankData_);
         }

         public RankData.Builder addRankDataBuilder() {
            return (RankData.Builder)this.getRankDataFieldBuilder().addBuilder(RankMsg.RankData.getDefaultInstance());
         }

         public RankData.Builder addRankDataBuilder(int index) {
            return (RankData.Builder)this.getRankDataFieldBuilder().addBuilder(index, RankMsg.RankData.getDefaultInstance());
         }

         public List<RankData.Builder> getRankDataBuilderList() {
            return this.getRankDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> getRankDataFieldBuilder() {
            if (this.rankDataBuilder_ == null) {
               this.rankDataBuilder_ = new RepeatedFieldBuilderV3(this.rankData_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.rankData_ = null;
            }

            return this.rankDataBuilder_;
         }

         public boolean hasIsGot() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getIsGot() {
            return this.isGot_;
         }

         public Builder setIsGot(boolean value) {
            this.bitField0_ |= 4;
            this.isGot_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsGot() {
            this.bitField0_ &= -5;
            this.isGot_ = false;
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

   public static final class C2S_UnionCopyRank_8801 extends GeneratedMessageV3 implements C2S_UnionCopyRank_8801OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int COPYID_FIELD_NUMBER = 1;
      private int copyId_;
      private byte memoizedIsInitialized;
      private static final C2S_UnionCopyRank_8801 DEFAULT_INSTANCE = new C2S_UnionCopyRank_8801();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UnionCopyRank_8801> PARSER = new AbstractParser<C2S_UnionCopyRank_8801>() {
         public C2S_UnionCopyRank_8801 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UnionCopyRank_8801(input, extensionRegistry);
         }
      };

      private C2S_UnionCopyRank_8801(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UnionCopyRank_8801() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UnionCopyRank_8801();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UnionCopyRank_8801(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.copyId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_UnionCopyRank_8801_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_UnionCopyRank_8801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnionCopyRank_8801.class, Builder.class);
      }

      public boolean hasCopyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCopyId() {
         return this.copyId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCopyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.copyId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.copyId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_UnionCopyRank_8801)) {
            return super.equals(obj);
         } else {
            C2S_UnionCopyRank_8801 other = (C2S_UnionCopyRank_8801)obj;
            if (this.hasCopyId() != other.hasCopyId()) {
               return false;
            } else if (this.hasCopyId() && this.getCopyId() != other.getCopyId()) {
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
            if (this.hasCopyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCopyId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_UnionCopyRank_8801 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UnionCopyRank_8801)PARSER.parseFrom(data);
      }

      public static C2S_UnionCopyRank_8801 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnionCopyRank_8801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnionCopyRank_8801 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UnionCopyRank_8801)PARSER.parseFrom(data);
      }

      public static C2S_UnionCopyRank_8801 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnionCopyRank_8801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnionCopyRank_8801 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UnionCopyRank_8801)PARSER.parseFrom(data);
      }

      public static C2S_UnionCopyRank_8801 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnionCopyRank_8801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnionCopyRank_8801 parseFrom(InputStream input) throws IOException {
         return (C2S_UnionCopyRank_8801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnionCopyRank_8801 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnionCopyRank_8801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnionCopyRank_8801 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UnionCopyRank_8801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UnionCopyRank_8801 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnionCopyRank_8801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnionCopyRank_8801 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UnionCopyRank_8801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnionCopyRank_8801 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnionCopyRank_8801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UnionCopyRank_8801 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UnionCopyRank_8801 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UnionCopyRank_8801> parser() {
         return PARSER;
      }

      public Parser<C2S_UnionCopyRank_8801> getParserForType() {
         return PARSER;
      }

      public C2S_UnionCopyRank_8801 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UnionCopyRank_8801OrBuilder {
         private int bitField0_;
         private int copyId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_UnionCopyRank_8801_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_UnionCopyRank_8801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnionCopyRank_8801.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RankMsg.C2S_UnionCopyRank_8801.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.copyId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_UnionCopyRank_8801_descriptor;
         }

         public C2S_UnionCopyRank_8801 getDefaultInstanceForType() {
            return RankMsg.C2S_UnionCopyRank_8801.getDefaultInstance();
         }

         public C2S_UnionCopyRank_8801 build() {
            C2S_UnionCopyRank_8801 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UnionCopyRank_8801 buildPartial() {
            C2S_UnionCopyRank_8801 result = new C2S_UnionCopyRank_8801(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.copyId_ = this.copyId_;
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
            if (other instanceof C2S_UnionCopyRank_8801) {
               return this.mergeFrom((C2S_UnionCopyRank_8801)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UnionCopyRank_8801 other) {
            if (other == RankMsg.C2S_UnionCopyRank_8801.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCopyId()) {
                  this.setCopyId(other.getCopyId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCopyId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_UnionCopyRank_8801 parsedMessage = null;

            try {
               parsedMessage = (C2S_UnionCopyRank_8801)RankMsg.C2S_UnionCopyRank_8801.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UnionCopyRank_8801)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCopyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCopyId() {
            return this.copyId_;
         }

         public Builder setCopyId(int value) {
            this.bitField0_ |= 1;
            this.copyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCopyId() {
            this.bitField0_ &= -2;
            this.copyId_ = 0;
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

   public static final class S2C_UnionCopyRank_8802 extends GeneratedMessageV3 implements S2C_UnionCopyRank_8802OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANKS_FIELD_NUMBER = 1;
      private List<RankData> ranks_;
      public static final int MYRANK_FIELD_NUMBER = 2;
      private RankData myRank_;
      public static final int COPYID_FIELD_NUMBER = 3;
      private int copyId_;
      public static final int PRERANKS_FIELD_NUMBER = 4;
      private List<RankData> preRanks_;
      private byte memoizedIsInitialized;
      private static final S2C_UnionCopyRank_8802 DEFAULT_INSTANCE = new S2C_UnionCopyRank_8802();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UnionCopyRank_8802> PARSER = new AbstractParser<S2C_UnionCopyRank_8802>() {
         public S2C_UnionCopyRank_8802 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UnionCopyRank_8802(input, extensionRegistry);
         }
      };

      private S2C_UnionCopyRank_8802(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UnionCopyRank_8802() {
         this.memoizedIsInitialized = -1;
         this.ranks_ = Collections.emptyList();
         this.preRanks_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UnionCopyRank_8802();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UnionCopyRank_8802(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.ranks_.add(input.readMessage(RankMsg.RankData.PARSER, extensionRegistry));
                        break;
                     case 18:
                        RankData.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.myRank_.toBuilder();
                        }

                        this.myRank_ = (RankData)input.readMessage(RankMsg.RankData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.myRank_);
                           this.myRank_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.copyId_ = input.readInt32();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.preRanks_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.preRanks_.add(input.readMessage(RankMsg.RankData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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

               if ((mutable_bitField0_ & 8) != 0) {
                  this.preRanks_ = Collections.unmodifiableList(this.preRanks_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_UnionCopyRank_8802_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_UnionCopyRank_8802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnionCopyRank_8802.class, Builder.class);
      }

      public List<RankData> getRanksList() {
         return this.ranks_;
      }

      public List<? extends RankDataOrBuilder> getRanksOrBuilderList() {
         return this.ranks_;
      }

      public int getRanksCount() {
         return this.ranks_.size();
      }

      public RankData getRanks(int index) {
         return (RankData)this.ranks_.get(index);
      }

      public RankDataOrBuilder getRanksOrBuilder(int index) {
         return (RankDataOrBuilder)this.ranks_.get(index);
      }

      public boolean hasMyRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public RankData getMyRank() {
         return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
      }

      public RankDataOrBuilder getMyRankOrBuilder() {
         return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
      }

      public boolean hasCopyId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCopyId() {
         return this.copyId_;
      }

      public List<RankData> getPreRanksList() {
         return this.preRanks_;
      }

      public List<? extends RankDataOrBuilder> getPreRanksOrBuilderList() {
         return this.preRanks_;
      }

      public int getPreRanksCount() {
         return this.preRanks_.size();
      }

      public RankData getPreRanks(int index) {
         return (RankData)this.preRanks_.get(index);
      }

      public RankDataOrBuilder getPreRanksOrBuilder(int index) {
         return (RankDataOrBuilder)this.preRanks_.get(index);
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

            if (this.hasMyRank() && !this.getMyRank().isInitialized()) {
               this.memoizedIsInitialized = 0;
               return false;
            } else {
               for(int i = 0; i < this.getPreRanksCount(); ++i) {
                  if (!this.getPreRanks(i).isInitialized()) {
                     this.memoizedIsInitialized = 0;
                     return false;
                  }
               }

               this.memoizedIsInitialized = 1;
               return true;
            }
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.ranks_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.ranks_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(2, this.getMyRank());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.copyId_);
         }

         for(int i = 0; i < this.preRanks_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.preRanks_.get(i));
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

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getMyRank());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.copyId_);
            }

            for(int i = 0; i < this.preRanks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.preRanks_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UnionCopyRank_8802)) {
            return super.equals(obj);
         } else {
            S2C_UnionCopyRank_8802 other = (S2C_UnionCopyRank_8802)obj;
            if (!this.getRanksList().equals(other.getRanksList())) {
               return false;
            } else if (this.hasMyRank() != other.hasMyRank()) {
               return false;
            } else if (this.hasMyRank() && !this.getMyRank().equals(other.getMyRank())) {
               return false;
            } else if (this.hasCopyId() != other.hasCopyId()) {
               return false;
            } else if (this.hasCopyId() && this.getCopyId() != other.getCopyId()) {
               return false;
            } else if (!this.getPreRanksList().equals(other.getPreRanksList())) {
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

            if (this.hasMyRank()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMyRank().hashCode();
            }

            if (this.hasCopyId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCopyId();
            }

            if (this.getPreRanksCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPreRanksList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UnionCopyRank_8802 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UnionCopyRank_8802)PARSER.parseFrom(data);
      }

      public static S2C_UnionCopyRank_8802 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnionCopyRank_8802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnionCopyRank_8802 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UnionCopyRank_8802)PARSER.parseFrom(data);
      }

      public static S2C_UnionCopyRank_8802 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnionCopyRank_8802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnionCopyRank_8802 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UnionCopyRank_8802)PARSER.parseFrom(data);
      }

      public static S2C_UnionCopyRank_8802 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnionCopyRank_8802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnionCopyRank_8802 parseFrom(InputStream input) throws IOException {
         return (S2C_UnionCopyRank_8802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnionCopyRank_8802 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnionCopyRank_8802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnionCopyRank_8802 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UnionCopyRank_8802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UnionCopyRank_8802 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnionCopyRank_8802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnionCopyRank_8802 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UnionCopyRank_8802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnionCopyRank_8802 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnionCopyRank_8802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UnionCopyRank_8802 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UnionCopyRank_8802 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UnionCopyRank_8802> parser() {
         return PARSER;
      }

      public Parser<S2C_UnionCopyRank_8802> getParserForType() {
         return PARSER;
      }

      public S2C_UnionCopyRank_8802 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UnionCopyRank_8802OrBuilder {
         private int bitField0_;
         private List<RankData> ranks_;
         private RepeatedFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> ranksBuilder_;
         private RankData myRank_;
         private SingleFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> myRankBuilder_;
         private int copyId_;
         private List<RankData> preRanks_;
         private RepeatedFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> preRanksBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_UnionCopyRank_8802_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_UnionCopyRank_8802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnionCopyRank_8802.class, Builder.class);
         }

         private Builder() {
            this.ranks_ = Collections.emptyList();
            this.preRanks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.ranks_ = Collections.emptyList();
            this.preRanks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RankMsg.S2C_UnionCopyRank_8802.alwaysUseFieldBuilders) {
               this.getRanksFieldBuilder();
               this.getMyRankFieldBuilder();
               this.getPreRanksFieldBuilder();
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

            if (this.myRankBuilder_ == null) {
               this.myRank_ = null;
            } else {
               this.myRankBuilder_.clear();
            }

            this.bitField0_ &= -3;
            this.copyId_ = 0;
            this.bitField0_ &= -5;
            if (this.preRanksBuilder_ == null) {
               this.preRanks_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.preRanksBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_UnionCopyRank_8802_descriptor;
         }

         public S2C_UnionCopyRank_8802 getDefaultInstanceForType() {
            return RankMsg.S2C_UnionCopyRank_8802.getDefaultInstance();
         }

         public S2C_UnionCopyRank_8802 build() {
            S2C_UnionCopyRank_8802 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UnionCopyRank_8802 buildPartial() {
            S2C_UnionCopyRank_8802 result = new S2C_UnionCopyRank_8802(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.ranksBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
                  this.bitField0_ &= -2;
               }

               result.ranks_ = this.ranks_;
            } else {
               result.ranks_ = this.ranksBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.myRankBuilder_ == null) {
                  result.myRank_ = this.myRank_;
               } else {
                  result.myRank_ = (RankData)this.myRankBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.copyId_ = this.copyId_;
               to_bitField0_ |= 2;
            }

            if (this.preRanksBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.preRanks_ = Collections.unmodifiableList(this.preRanks_);
                  this.bitField0_ &= -9;
               }

               result.preRanks_ = this.preRanks_;
            } else {
               result.preRanks_ = this.preRanksBuilder_.build();
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
            if (other instanceof S2C_UnionCopyRank_8802) {
               return this.mergeFrom((S2C_UnionCopyRank_8802)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UnionCopyRank_8802 other) {
            if (other == RankMsg.S2C_UnionCopyRank_8802.getDefaultInstance()) {
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
                     this.ranksBuilder_ = RankMsg.S2C_UnionCopyRank_8802.alwaysUseFieldBuilders ? this.getRanksFieldBuilder() : null;
                  } else {
                     this.ranksBuilder_.addAllMessages(other.ranks_);
                  }
               }

               if (other.hasMyRank()) {
                  this.mergeMyRank(other.getMyRank());
               }

               if (other.hasCopyId()) {
                  this.setCopyId(other.getCopyId());
               }

               if (this.preRanksBuilder_ == null) {
                  if (!other.preRanks_.isEmpty()) {
                     if (this.preRanks_.isEmpty()) {
                        this.preRanks_ = other.preRanks_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensurePreRanksIsMutable();
                        this.preRanks_.addAll(other.preRanks_);
                     }

                     this.onChanged();
                  }
               } else if (!other.preRanks_.isEmpty()) {
                  if (this.preRanksBuilder_.isEmpty()) {
                     this.preRanksBuilder_.dispose();
                     this.preRanksBuilder_ = null;
                     this.preRanks_ = other.preRanks_;
                     this.bitField0_ &= -9;
                     this.preRanksBuilder_ = RankMsg.S2C_UnionCopyRank_8802.alwaysUseFieldBuilders ? this.getPreRanksFieldBuilder() : null;
                  } else {
                     this.preRanksBuilder_.addAllMessages(other.preRanks_);
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

            if (this.hasMyRank() && !this.getMyRank().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getPreRanksCount(); ++i) {
                  if (!this.getPreRanks(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UnionCopyRank_8802 parsedMessage = null;

            try {
               parsedMessage = (S2C_UnionCopyRank_8802)RankMsg.S2C_UnionCopyRank_8802.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UnionCopyRank_8802)e.getUnfinishedMessage();
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

         public List<RankData> getRanksList() {
            return this.ranksBuilder_ == null ? Collections.unmodifiableList(this.ranks_) : this.ranksBuilder_.getMessageList();
         }

         public int getRanksCount() {
            return this.ranksBuilder_ == null ? this.ranks_.size() : this.ranksBuilder_.getCount();
         }

         public RankData getRanks(int index) {
            return this.ranksBuilder_ == null ? (RankData)this.ranks_.get(index) : (RankData)this.ranksBuilder_.getMessage(index);
         }

         public Builder setRanks(int index, RankData value) {
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

         public Builder setRanks(int index, RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(RankData value) {
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

         public Builder addRanks(int index, RankData value) {
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

         public Builder addRanks(RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(int index, RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRanks(Iterable<? extends RankData> values) {
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

         public RankData.Builder getRanksBuilder(int index) {
            return (RankData.Builder)this.getRanksFieldBuilder().getBuilder(index);
         }

         public RankDataOrBuilder getRanksOrBuilder(int index) {
            return this.ranksBuilder_ == null ? (RankDataOrBuilder)this.ranks_.get(index) : (RankDataOrBuilder)this.ranksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankDataOrBuilder> getRanksOrBuilderList() {
            return this.ranksBuilder_ != null ? this.ranksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.ranks_);
         }

         public RankData.Builder addRanksBuilder() {
            return (RankData.Builder)this.getRanksFieldBuilder().addBuilder(RankMsg.RankData.getDefaultInstance());
         }

         public RankData.Builder addRanksBuilder(int index) {
            return (RankData.Builder)this.getRanksFieldBuilder().addBuilder(index, RankMsg.RankData.getDefaultInstance());
         }

         public List<RankData.Builder> getRanksBuilderList() {
            return this.getRanksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> getRanksFieldBuilder() {
            if (this.ranksBuilder_ == null) {
               this.ranksBuilder_ = new RepeatedFieldBuilderV3(this.ranks_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.ranks_ = null;
            }

            return this.ranksBuilder_;
         }

         public boolean hasMyRank() {
            return (this.bitField0_ & 2) != 0;
         }

         public RankData getMyRank() {
            if (this.myRankBuilder_ == null) {
               return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
            } else {
               return (RankData)this.myRankBuilder_.getMessage();
            }
         }

         public Builder setMyRank(RankData value) {
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

         public Builder setMyRank(RankData.Builder builderForValue) {
            if (this.myRankBuilder_ == null) {
               this.myRank_ = builderForValue.build();
               this.onChanged();
            } else {
               this.myRankBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeMyRank(RankData value) {
            if (this.myRankBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.myRank_ != null && this.myRank_ != RankMsg.RankData.getDefaultInstance()) {
                  this.myRank_ = RankMsg.RankData.newBuilder(this.myRank_).mergeFrom(value).buildPartial();
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

         public RankData.Builder getMyRankBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (RankData.Builder)this.getMyRankFieldBuilder().getBuilder();
         }

         public RankDataOrBuilder getMyRankOrBuilder() {
            if (this.myRankBuilder_ != null) {
               return (RankDataOrBuilder)this.myRankBuilder_.getMessageOrBuilder();
            } else {
               return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
            }
         }

         private SingleFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> getMyRankFieldBuilder() {
            if (this.myRankBuilder_ == null) {
               this.myRankBuilder_ = new SingleFieldBuilderV3(this.getMyRank(), this.getParentForChildren(), this.isClean());
               this.myRank_ = null;
            }

            return this.myRankBuilder_;
         }

         public boolean hasCopyId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getCopyId() {
            return this.copyId_;
         }

         public Builder setCopyId(int value) {
            this.bitField0_ |= 4;
            this.copyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCopyId() {
            this.bitField0_ &= -5;
            this.copyId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePreRanksIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.preRanks_ = new ArrayList(this.preRanks_);
               this.bitField0_ |= 8;
            }

         }

         public List<RankData> getPreRanksList() {
            return this.preRanksBuilder_ == null ? Collections.unmodifiableList(this.preRanks_) : this.preRanksBuilder_.getMessageList();
         }

         public int getPreRanksCount() {
            return this.preRanksBuilder_ == null ? this.preRanks_.size() : this.preRanksBuilder_.getCount();
         }

         public RankData getPreRanks(int index) {
            return this.preRanksBuilder_ == null ? (RankData)this.preRanks_.get(index) : (RankData)this.preRanksBuilder_.getMessage(index);
         }

         public Builder setPreRanks(int index, RankData value) {
            if (this.preRanksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePreRanksIsMutable();
               this.preRanks_.set(index, value);
               this.onChanged();
            } else {
               this.preRanksBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPreRanks(int index, RankData.Builder builderForValue) {
            if (this.preRanksBuilder_ == null) {
               this.ensurePreRanksIsMutable();
               this.preRanks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.preRanksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPreRanks(RankData value) {
            if (this.preRanksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePreRanksIsMutable();
               this.preRanks_.add(value);
               this.onChanged();
            } else {
               this.preRanksBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPreRanks(int index, RankData value) {
            if (this.preRanksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePreRanksIsMutable();
               this.preRanks_.add(index, value);
               this.onChanged();
            } else {
               this.preRanksBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPreRanks(RankData.Builder builderForValue) {
            if (this.preRanksBuilder_ == null) {
               this.ensurePreRanksIsMutable();
               this.preRanks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.preRanksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPreRanks(int index, RankData.Builder builderForValue) {
            if (this.preRanksBuilder_ == null) {
               this.ensurePreRanksIsMutable();
               this.preRanks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.preRanksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPreRanks(Iterable<? extends RankData> values) {
            if (this.preRanksBuilder_ == null) {
               this.ensurePreRanksIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.preRanks_);
               this.onChanged();
            } else {
               this.preRanksBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPreRanks() {
            if (this.preRanksBuilder_ == null) {
               this.preRanks_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.preRanksBuilder_.clear();
            }

            return this;
         }

         public Builder removePreRanks(int index) {
            if (this.preRanksBuilder_ == null) {
               this.ensurePreRanksIsMutable();
               this.preRanks_.remove(index);
               this.onChanged();
            } else {
               this.preRanksBuilder_.remove(index);
            }

            return this;
         }

         public RankData.Builder getPreRanksBuilder(int index) {
            return (RankData.Builder)this.getPreRanksFieldBuilder().getBuilder(index);
         }

         public RankDataOrBuilder getPreRanksOrBuilder(int index) {
            return this.preRanksBuilder_ == null ? (RankDataOrBuilder)this.preRanks_.get(index) : (RankDataOrBuilder)this.preRanksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankDataOrBuilder> getPreRanksOrBuilderList() {
            return this.preRanksBuilder_ != null ? this.preRanksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.preRanks_);
         }

         public RankData.Builder addPreRanksBuilder() {
            return (RankData.Builder)this.getPreRanksFieldBuilder().addBuilder(RankMsg.RankData.getDefaultInstance());
         }

         public RankData.Builder addPreRanksBuilder(int index) {
            return (RankData.Builder)this.getPreRanksFieldBuilder().addBuilder(index, RankMsg.RankData.getDefaultInstance());
         }

         public List<RankData.Builder> getPreRanksBuilderList() {
            return this.getPreRanksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> getPreRanksFieldBuilder() {
            if (this.preRanksBuilder_ == null) {
               this.preRanksBuilder_ = new RepeatedFieldBuilderV3(this.preRanks_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.preRanks_ = null;
            }

            return this.preRanksBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_TrainingRank_8803 extends GeneratedMessageV3 implements C2S_TrainingRank_8803OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TrainingRank_8803 DEFAULT_INSTANCE = new C2S_TrainingRank_8803();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TrainingRank_8803> PARSER = new AbstractParser<C2S_TrainingRank_8803>() {
         public C2S_TrainingRank_8803 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TrainingRank_8803(input, extensionRegistry);
         }
      };

      private C2S_TrainingRank_8803(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TrainingRank_8803() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TrainingRank_8803();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TrainingRank_8803(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_TrainingRank_8803_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_TrainingRank_8803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TrainingRank_8803.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TrainingRank_8803)) {
            return super.equals(obj);
         } else {
            C2S_TrainingRank_8803 other = (C2S_TrainingRank_8803)obj;
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

      public static C2S_TrainingRank_8803 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TrainingRank_8803)PARSER.parseFrom(data);
      }

      public static C2S_TrainingRank_8803 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TrainingRank_8803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TrainingRank_8803 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TrainingRank_8803)PARSER.parseFrom(data);
      }

      public static C2S_TrainingRank_8803 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TrainingRank_8803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TrainingRank_8803 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TrainingRank_8803)PARSER.parseFrom(data);
      }

      public static C2S_TrainingRank_8803 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TrainingRank_8803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TrainingRank_8803 parseFrom(InputStream input) throws IOException {
         return (C2S_TrainingRank_8803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TrainingRank_8803 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TrainingRank_8803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TrainingRank_8803 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TrainingRank_8803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TrainingRank_8803 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TrainingRank_8803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TrainingRank_8803 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TrainingRank_8803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TrainingRank_8803 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TrainingRank_8803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TrainingRank_8803 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TrainingRank_8803 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TrainingRank_8803> parser() {
         return PARSER;
      }

      public Parser<C2S_TrainingRank_8803> getParserForType() {
         return PARSER;
      }

      public C2S_TrainingRank_8803 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TrainingRank_8803OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_TrainingRank_8803_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_TrainingRank_8803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TrainingRank_8803.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RankMsg.C2S_TrainingRank_8803.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_TrainingRank_8803_descriptor;
         }

         public C2S_TrainingRank_8803 getDefaultInstanceForType() {
            return RankMsg.C2S_TrainingRank_8803.getDefaultInstance();
         }

         public C2S_TrainingRank_8803 build() {
            C2S_TrainingRank_8803 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TrainingRank_8803 buildPartial() {
            C2S_TrainingRank_8803 result = new C2S_TrainingRank_8803(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TrainingRank_8803) {
               return this.mergeFrom((C2S_TrainingRank_8803)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TrainingRank_8803 other) {
            if (other == RankMsg.C2S_TrainingRank_8803.getDefaultInstance()) {
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
            C2S_TrainingRank_8803 parsedMessage = null;

            try {
               parsedMessage = (C2S_TrainingRank_8803)RankMsg.C2S_TrainingRank_8803.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TrainingRank_8803)e.getUnfinishedMessage();
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

   public static final class S2C_TrainingRank_8804 extends GeneratedMessageV3 implements S2C_TrainingRank_8804OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANKS_FIELD_NUMBER = 1;
      private List<RankData> ranks_;
      public static final int MYRANK_FIELD_NUMBER = 2;
      private RankData myRank_;
      private byte memoizedIsInitialized;
      private static final S2C_TrainingRank_8804 DEFAULT_INSTANCE = new S2C_TrainingRank_8804();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TrainingRank_8804> PARSER = new AbstractParser<S2C_TrainingRank_8804>() {
         public S2C_TrainingRank_8804 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TrainingRank_8804(input, extensionRegistry);
         }
      };

      private S2C_TrainingRank_8804(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TrainingRank_8804() {
         this.memoizedIsInitialized = -1;
         this.ranks_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TrainingRank_8804();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TrainingRank_8804(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.ranks_.add(input.readMessage(RankMsg.RankData.PARSER, extensionRegistry));
                        break;
                     case 18:
                        RankData.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.myRank_.toBuilder();
                        }

                        this.myRank_ = (RankData)input.readMessage(RankMsg.RankData.PARSER, extensionRegistry);
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
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_TrainingRank_8804_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_TrainingRank_8804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TrainingRank_8804.class, Builder.class);
      }

      public List<RankData> getRanksList() {
         return this.ranks_;
      }

      public List<? extends RankDataOrBuilder> getRanksOrBuilderList() {
         return this.ranks_;
      }

      public int getRanksCount() {
         return this.ranks_.size();
      }

      public RankData getRanks(int index) {
         return (RankData)this.ranks_.get(index);
      }

      public RankDataOrBuilder getRanksOrBuilder(int index) {
         return (RankDataOrBuilder)this.ranks_.get(index);
      }

      public boolean hasMyRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public RankData getMyRank() {
         return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
      }

      public RankDataOrBuilder getMyRankOrBuilder() {
         return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
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
            for(int i = 0; i < this.getRanksCount(); ++i) {
               if (!this.getRanks(i).isInitialized()) {
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
         for(int i = 0; i < this.ranks_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.ranks_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(2, this.getMyRank());
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

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getMyRank());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TrainingRank_8804)) {
            return super.equals(obj);
         } else {
            S2C_TrainingRank_8804 other = (S2C_TrainingRank_8804)obj;
            if (!this.getRanksList().equals(other.getRanksList())) {
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
            if (this.getRanksCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRanksList().hashCode();
            }

            if (this.hasMyRank()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMyRank().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TrainingRank_8804 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TrainingRank_8804)PARSER.parseFrom(data);
      }

      public static S2C_TrainingRank_8804 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TrainingRank_8804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TrainingRank_8804 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TrainingRank_8804)PARSER.parseFrom(data);
      }

      public static S2C_TrainingRank_8804 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TrainingRank_8804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TrainingRank_8804 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TrainingRank_8804)PARSER.parseFrom(data);
      }

      public static S2C_TrainingRank_8804 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TrainingRank_8804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TrainingRank_8804 parseFrom(InputStream input) throws IOException {
         return (S2C_TrainingRank_8804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TrainingRank_8804 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TrainingRank_8804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TrainingRank_8804 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TrainingRank_8804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TrainingRank_8804 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TrainingRank_8804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TrainingRank_8804 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TrainingRank_8804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TrainingRank_8804 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TrainingRank_8804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TrainingRank_8804 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TrainingRank_8804 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TrainingRank_8804> parser() {
         return PARSER;
      }

      public Parser<S2C_TrainingRank_8804> getParserForType() {
         return PARSER;
      }

      public S2C_TrainingRank_8804 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TrainingRank_8804OrBuilder {
         private int bitField0_;
         private List<RankData> ranks_;
         private RepeatedFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> ranksBuilder_;
         private RankData myRank_;
         private SingleFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> myRankBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_TrainingRank_8804_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_TrainingRank_8804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TrainingRank_8804.class, Builder.class);
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
            if (RankMsg.S2C_TrainingRank_8804.alwaysUseFieldBuilders) {
               this.getRanksFieldBuilder();
               this.getMyRankFieldBuilder();
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

            if (this.myRankBuilder_ == null) {
               this.myRank_ = null;
            } else {
               this.myRankBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_TrainingRank_8804_descriptor;
         }

         public S2C_TrainingRank_8804 getDefaultInstanceForType() {
            return RankMsg.S2C_TrainingRank_8804.getDefaultInstance();
         }

         public S2C_TrainingRank_8804 build() {
            S2C_TrainingRank_8804 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TrainingRank_8804 buildPartial() {
            S2C_TrainingRank_8804 result = new S2C_TrainingRank_8804(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.ranksBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
                  this.bitField0_ &= -2;
               }

               result.ranks_ = this.ranks_;
            } else {
               result.ranks_ = this.ranksBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.myRankBuilder_ == null) {
                  result.myRank_ = this.myRank_;
               } else {
                  result.myRank_ = (RankData)this.myRankBuilder_.build();
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
            if (other instanceof S2C_TrainingRank_8804) {
               return this.mergeFrom((S2C_TrainingRank_8804)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TrainingRank_8804 other) {
            if (other == RankMsg.S2C_TrainingRank_8804.getDefaultInstance()) {
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
                     this.ranksBuilder_ = RankMsg.S2C_TrainingRank_8804.alwaysUseFieldBuilders ? this.getRanksFieldBuilder() : null;
                  } else {
                     this.ranksBuilder_.addAllMessages(other.ranks_);
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
               for(int i = 0; i < this.getRanksCount(); ++i) {
                  if (!this.getRanks(i).isInitialized()) {
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
            S2C_TrainingRank_8804 parsedMessage = null;

            try {
               parsedMessage = (S2C_TrainingRank_8804)RankMsg.S2C_TrainingRank_8804.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TrainingRank_8804)e.getUnfinishedMessage();
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

         public List<RankData> getRanksList() {
            return this.ranksBuilder_ == null ? Collections.unmodifiableList(this.ranks_) : this.ranksBuilder_.getMessageList();
         }

         public int getRanksCount() {
            return this.ranksBuilder_ == null ? this.ranks_.size() : this.ranksBuilder_.getCount();
         }

         public RankData getRanks(int index) {
            return this.ranksBuilder_ == null ? (RankData)this.ranks_.get(index) : (RankData)this.ranksBuilder_.getMessage(index);
         }

         public Builder setRanks(int index, RankData value) {
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

         public Builder setRanks(int index, RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(RankData value) {
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

         public Builder addRanks(int index, RankData value) {
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

         public Builder addRanks(RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(int index, RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRanks(Iterable<? extends RankData> values) {
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

         public RankData.Builder getRanksBuilder(int index) {
            return (RankData.Builder)this.getRanksFieldBuilder().getBuilder(index);
         }

         public RankDataOrBuilder getRanksOrBuilder(int index) {
            return this.ranksBuilder_ == null ? (RankDataOrBuilder)this.ranks_.get(index) : (RankDataOrBuilder)this.ranksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankDataOrBuilder> getRanksOrBuilderList() {
            return this.ranksBuilder_ != null ? this.ranksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.ranks_);
         }

         public RankData.Builder addRanksBuilder() {
            return (RankData.Builder)this.getRanksFieldBuilder().addBuilder(RankMsg.RankData.getDefaultInstance());
         }

         public RankData.Builder addRanksBuilder(int index) {
            return (RankData.Builder)this.getRanksFieldBuilder().addBuilder(index, RankMsg.RankData.getDefaultInstance());
         }

         public List<RankData.Builder> getRanksBuilderList() {
            return this.getRanksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> getRanksFieldBuilder() {
            if (this.ranksBuilder_ == null) {
               this.ranksBuilder_ = new RepeatedFieldBuilderV3(this.ranks_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.ranks_ = null;
            }

            return this.ranksBuilder_;
         }

         public boolean hasMyRank() {
            return (this.bitField0_ & 2) != 0;
         }

         public RankData getMyRank() {
            if (this.myRankBuilder_ == null) {
               return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
            } else {
               return (RankData)this.myRankBuilder_.getMessage();
            }
         }

         public Builder setMyRank(RankData value) {
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

         public Builder setMyRank(RankData.Builder builderForValue) {
            if (this.myRankBuilder_ == null) {
               this.myRank_ = builderForValue.build();
               this.onChanged();
            } else {
               this.myRankBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeMyRank(RankData value) {
            if (this.myRankBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.myRank_ != null && this.myRank_ != RankMsg.RankData.getDefaultInstance()) {
                  this.myRank_ = RankMsg.RankData.newBuilder(this.myRank_).mergeFrom(value).buildPartial();
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

         public RankData.Builder getMyRankBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (RankData.Builder)this.getMyRankFieldBuilder().getBuilder();
         }

         public RankDataOrBuilder getMyRankOrBuilder() {
            if (this.myRankBuilder_ != null) {
               return (RankDataOrBuilder)this.myRankBuilder_.getMessageOrBuilder();
            } else {
               return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
            }
         }

         private SingleFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> getMyRankFieldBuilder() {
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

   public static final class C2S_KindsOfRank_8807 extends GeneratedMessageV3 implements C2S_KindsOfRank_8807OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_KindsOfRank_8807 DEFAULT_INSTANCE = new C2S_KindsOfRank_8807();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_KindsOfRank_8807> PARSER = new AbstractParser<C2S_KindsOfRank_8807>() {
         public C2S_KindsOfRank_8807 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_KindsOfRank_8807(input, extensionRegistry);
         }
      };

      private C2S_KindsOfRank_8807(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_KindsOfRank_8807() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_KindsOfRank_8807();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_KindsOfRank_8807(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_KindsOfRank_8807_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_KindsOfRank_8807_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_KindsOfRank_8807.class, Builder.class);
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
         } else if (!(obj instanceof C2S_KindsOfRank_8807)) {
            return super.equals(obj);
         } else {
            C2S_KindsOfRank_8807 other = (C2S_KindsOfRank_8807)obj;
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

      public static C2S_KindsOfRank_8807 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_KindsOfRank_8807)PARSER.parseFrom(data);
      }

      public static C2S_KindsOfRank_8807 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_KindsOfRank_8807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_KindsOfRank_8807 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_KindsOfRank_8807)PARSER.parseFrom(data);
      }

      public static C2S_KindsOfRank_8807 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_KindsOfRank_8807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_KindsOfRank_8807 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_KindsOfRank_8807)PARSER.parseFrom(data);
      }

      public static C2S_KindsOfRank_8807 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_KindsOfRank_8807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_KindsOfRank_8807 parseFrom(InputStream input) throws IOException {
         return (C2S_KindsOfRank_8807)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_KindsOfRank_8807 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_KindsOfRank_8807)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_KindsOfRank_8807 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_KindsOfRank_8807)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_KindsOfRank_8807 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_KindsOfRank_8807)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_KindsOfRank_8807 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_KindsOfRank_8807)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_KindsOfRank_8807 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_KindsOfRank_8807)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_KindsOfRank_8807 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_KindsOfRank_8807 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_KindsOfRank_8807> parser() {
         return PARSER;
      }

      public Parser<C2S_KindsOfRank_8807> getParserForType() {
         return PARSER;
      }

      public C2S_KindsOfRank_8807 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_KindsOfRank_8807OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_KindsOfRank_8807_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_KindsOfRank_8807_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_KindsOfRank_8807.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RankMsg.C2S_KindsOfRank_8807.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_KindsOfRank_8807_descriptor;
         }

         public C2S_KindsOfRank_8807 getDefaultInstanceForType() {
            return RankMsg.C2S_KindsOfRank_8807.getDefaultInstance();
         }

         public C2S_KindsOfRank_8807 build() {
            C2S_KindsOfRank_8807 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_KindsOfRank_8807 buildPartial() {
            C2S_KindsOfRank_8807 result = new C2S_KindsOfRank_8807(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_KindsOfRank_8807) {
               return this.mergeFrom((C2S_KindsOfRank_8807)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_KindsOfRank_8807 other) {
            if (other == RankMsg.C2S_KindsOfRank_8807.getDefaultInstance()) {
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
            C2S_KindsOfRank_8807 parsedMessage = null;

            try {
               parsedMessage = (C2S_KindsOfRank_8807)RankMsg.C2S_KindsOfRank_8807.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_KindsOfRank_8807)e.getUnfinishedMessage();
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

   public static final class S2C_KindsOfRank_8808 extends GeneratedMessageV3 implements S2C_KindsOfRank_8808OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPERANKS_FIELD_NUMBER = 1;
      private List<TypeRanks> typeRanks_;
      public static final int UNIONNAME_FIELD_NUMBER = 2;
      private volatile Object unionName_;
      public static final int UNIONHEAD_FIELD_NUMBER = 3;
      private int unionHead_;
      private byte memoizedIsInitialized;
      private static final S2C_KindsOfRank_8808 DEFAULT_INSTANCE = new S2C_KindsOfRank_8808();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_KindsOfRank_8808> PARSER = new AbstractParser<S2C_KindsOfRank_8808>() {
         public S2C_KindsOfRank_8808 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_KindsOfRank_8808(input, extensionRegistry);
         }
      };

      private S2C_KindsOfRank_8808(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_KindsOfRank_8808() {
         this.memoizedIsInitialized = -1;
         this.typeRanks_ = Collections.emptyList();
         this.unionName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_KindsOfRank_8808();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_KindsOfRank_8808(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.typeRanks_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.typeRanks_.add(input.readMessage(RankMsg.TypeRanks.PARSER, extensionRegistry));
                        break;
                     case 18:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 1;
                        this.unionName_ = bs;
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.unionHead_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.typeRanks_ = Collections.unmodifiableList(this.typeRanks_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_KindsOfRank_8808_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_KindsOfRank_8808_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_KindsOfRank_8808.class, Builder.class);
      }

      public List<TypeRanks> getTypeRanksList() {
         return this.typeRanks_;
      }

      public List<? extends TypeRanksOrBuilder> getTypeRanksOrBuilderList() {
         return this.typeRanks_;
      }

      public int getTypeRanksCount() {
         return this.typeRanks_.size();
      }

      public TypeRanks getTypeRanks(int index) {
         return (TypeRanks)this.typeRanks_.get(index);
      }

      public TypeRanksOrBuilder getTypeRanksOrBuilder(int index) {
         return (TypeRanksOrBuilder)this.typeRanks_.get(index);
      }

      public boolean hasUnionName() {
         return (this.bitField0_ & 1) != 0;
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

      public boolean hasUnionHead() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getUnionHead() {
         return this.unionHead_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTypeRanksCount(); ++i) {
               if (!this.getTypeRanks(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.typeRanks_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.typeRanks_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.unionName_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.unionHead_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.typeRanks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.typeRanks_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += GeneratedMessageV3.computeStringSize(2, this.unionName_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.unionHead_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_KindsOfRank_8808)) {
            return super.equals(obj);
         } else {
            S2C_KindsOfRank_8808 other = (S2C_KindsOfRank_8808)obj;
            if (!this.getTypeRanksList().equals(other.getTypeRanksList())) {
               return false;
            } else if (this.hasUnionName() != other.hasUnionName()) {
               return false;
            } else if (this.hasUnionName() && !this.getUnionName().equals(other.getUnionName())) {
               return false;
            } else if (this.hasUnionHead() != other.hasUnionHead()) {
               return false;
            } else if (this.hasUnionHead() && this.getUnionHead() != other.getUnionHead()) {
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
            if (this.getTypeRanksCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTypeRanksList().hashCode();
            }

            if (this.hasUnionName()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getUnionName().hashCode();
            }

            if (this.hasUnionHead()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getUnionHead();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_KindsOfRank_8808 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_KindsOfRank_8808)PARSER.parseFrom(data);
      }

      public static S2C_KindsOfRank_8808 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_KindsOfRank_8808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_KindsOfRank_8808 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_KindsOfRank_8808)PARSER.parseFrom(data);
      }

      public static S2C_KindsOfRank_8808 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_KindsOfRank_8808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_KindsOfRank_8808 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_KindsOfRank_8808)PARSER.parseFrom(data);
      }

      public static S2C_KindsOfRank_8808 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_KindsOfRank_8808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_KindsOfRank_8808 parseFrom(InputStream input) throws IOException {
         return (S2C_KindsOfRank_8808)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_KindsOfRank_8808 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_KindsOfRank_8808)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_KindsOfRank_8808 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_KindsOfRank_8808)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_KindsOfRank_8808 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_KindsOfRank_8808)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_KindsOfRank_8808 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_KindsOfRank_8808)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_KindsOfRank_8808 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_KindsOfRank_8808)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_KindsOfRank_8808 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_KindsOfRank_8808 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_KindsOfRank_8808> parser() {
         return PARSER;
      }

      public Parser<S2C_KindsOfRank_8808> getParserForType() {
         return PARSER;
      }

      public S2C_KindsOfRank_8808 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_KindsOfRank_8808OrBuilder {
         private int bitField0_;
         private List<TypeRanks> typeRanks_;
         private RepeatedFieldBuilderV3<TypeRanks, TypeRanks.Builder, TypeRanksOrBuilder> typeRanksBuilder_;
         private Object unionName_;
         private int unionHead_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_KindsOfRank_8808_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_KindsOfRank_8808_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_KindsOfRank_8808.class, Builder.class);
         }

         private Builder() {
            this.typeRanks_ = Collections.emptyList();
            this.unionName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.typeRanks_ = Collections.emptyList();
            this.unionName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RankMsg.S2C_KindsOfRank_8808.alwaysUseFieldBuilders) {
               this.getTypeRanksFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.typeRanksBuilder_ == null) {
               this.typeRanks_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.typeRanksBuilder_.clear();
            }

            this.unionName_ = "";
            this.bitField0_ &= -3;
            this.unionHead_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_KindsOfRank_8808_descriptor;
         }

         public S2C_KindsOfRank_8808 getDefaultInstanceForType() {
            return RankMsg.S2C_KindsOfRank_8808.getDefaultInstance();
         }

         public S2C_KindsOfRank_8808 build() {
            S2C_KindsOfRank_8808 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_KindsOfRank_8808 buildPartial() {
            S2C_KindsOfRank_8808 result = new S2C_KindsOfRank_8808(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.typeRanksBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.typeRanks_ = Collections.unmodifiableList(this.typeRanks_);
                  this.bitField0_ &= -2;
               }

               result.typeRanks_ = this.typeRanks_;
            } else {
               result.typeRanks_ = this.typeRanksBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 1;
            }

            result.unionName_ = this.unionName_;
            if ((from_bitField0_ & 4) != 0) {
               result.unionHead_ = this.unionHead_;
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
            if (other instanceof S2C_KindsOfRank_8808) {
               return this.mergeFrom((S2C_KindsOfRank_8808)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_KindsOfRank_8808 other) {
            if (other == RankMsg.S2C_KindsOfRank_8808.getDefaultInstance()) {
               return this;
            } else {
               if (this.typeRanksBuilder_ == null) {
                  if (!other.typeRanks_.isEmpty()) {
                     if (this.typeRanks_.isEmpty()) {
                        this.typeRanks_ = other.typeRanks_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTypeRanksIsMutable();
                        this.typeRanks_.addAll(other.typeRanks_);
                     }

                     this.onChanged();
                  }
               } else if (!other.typeRanks_.isEmpty()) {
                  if (this.typeRanksBuilder_.isEmpty()) {
                     this.typeRanksBuilder_.dispose();
                     this.typeRanksBuilder_ = null;
                     this.typeRanks_ = other.typeRanks_;
                     this.bitField0_ &= -2;
                     this.typeRanksBuilder_ = RankMsg.S2C_KindsOfRank_8808.alwaysUseFieldBuilders ? this.getTypeRanksFieldBuilder() : null;
                  } else {
                     this.typeRanksBuilder_.addAllMessages(other.typeRanks_);
                  }
               }

               if (other.hasUnionName()) {
                  this.bitField0_ |= 2;
                  this.unionName_ = other.unionName_;
                  this.onChanged();
               }

               if (other.hasUnionHead()) {
                  this.setUnionHead(other.getUnionHead());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTypeRanksCount(); ++i) {
               if (!this.getTypeRanks(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_KindsOfRank_8808 parsedMessage = null;

            try {
               parsedMessage = (S2C_KindsOfRank_8808)RankMsg.S2C_KindsOfRank_8808.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_KindsOfRank_8808)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTypeRanksIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.typeRanks_ = new ArrayList(this.typeRanks_);
               this.bitField0_ |= 1;
            }

         }

         public List<TypeRanks> getTypeRanksList() {
            return this.typeRanksBuilder_ == null ? Collections.unmodifiableList(this.typeRanks_) : this.typeRanksBuilder_.getMessageList();
         }

         public int getTypeRanksCount() {
            return this.typeRanksBuilder_ == null ? this.typeRanks_.size() : this.typeRanksBuilder_.getCount();
         }

         public TypeRanks getTypeRanks(int index) {
            return this.typeRanksBuilder_ == null ? (TypeRanks)this.typeRanks_.get(index) : (TypeRanks)this.typeRanksBuilder_.getMessage(index);
         }

         public Builder setTypeRanks(int index, TypeRanks value) {
            if (this.typeRanksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTypeRanksIsMutable();
               this.typeRanks_.set(index, value);
               this.onChanged();
            } else {
               this.typeRanksBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTypeRanks(int index, TypeRanks.Builder builderForValue) {
            if (this.typeRanksBuilder_ == null) {
               this.ensureTypeRanksIsMutable();
               this.typeRanks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.typeRanksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTypeRanks(TypeRanks value) {
            if (this.typeRanksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTypeRanksIsMutable();
               this.typeRanks_.add(value);
               this.onChanged();
            } else {
               this.typeRanksBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTypeRanks(int index, TypeRanks value) {
            if (this.typeRanksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTypeRanksIsMutable();
               this.typeRanks_.add(index, value);
               this.onChanged();
            } else {
               this.typeRanksBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTypeRanks(TypeRanks.Builder builderForValue) {
            if (this.typeRanksBuilder_ == null) {
               this.ensureTypeRanksIsMutable();
               this.typeRanks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.typeRanksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTypeRanks(int index, TypeRanks.Builder builderForValue) {
            if (this.typeRanksBuilder_ == null) {
               this.ensureTypeRanksIsMutable();
               this.typeRanks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.typeRanksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTypeRanks(Iterable<? extends TypeRanks> values) {
            if (this.typeRanksBuilder_ == null) {
               this.ensureTypeRanksIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.typeRanks_);
               this.onChanged();
            } else {
               this.typeRanksBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTypeRanks() {
            if (this.typeRanksBuilder_ == null) {
               this.typeRanks_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.typeRanksBuilder_.clear();
            }

            return this;
         }

         public Builder removeTypeRanks(int index) {
            if (this.typeRanksBuilder_ == null) {
               this.ensureTypeRanksIsMutable();
               this.typeRanks_.remove(index);
               this.onChanged();
            } else {
               this.typeRanksBuilder_.remove(index);
            }

            return this;
         }

         public TypeRanks.Builder getTypeRanksBuilder(int index) {
            return (TypeRanks.Builder)this.getTypeRanksFieldBuilder().getBuilder(index);
         }

         public TypeRanksOrBuilder getTypeRanksOrBuilder(int index) {
            return this.typeRanksBuilder_ == null ? (TypeRanksOrBuilder)this.typeRanks_.get(index) : (TypeRanksOrBuilder)this.typeRanksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends TypeRanksOrBuilder> getTypeRanksOrBuilderList() {
            return this.typeRanksBuilder_ != null ? this.typeRanksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.typeRanks_);
         }

         public TypeRanks.Builder addTypeRanksBuilder() {
            return (TypeRanks.Builder)this.getTypeRanksFieldBuilder().addBuilder(RankMsg.TypeRanks.getDefaultInstance());
         }

         public TypeRanks.Builder addTypeRanksBuilder(int index) {
            return (TypeRanks.Builder)this.getTypeRanksFieldBuilder().addBuilder(index, RankMsg.TypeRanks.getDefaultInstance());
         }

         public List<TypeRanks.Builder> getTypeRanksBuilderList() {
            return this.getTypeRanksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<TypeRanks, TypeRanks.Builder, TypeRanksOrBuilder> getTypeRanksFieldBuilder() {
            if (this.typeRanksBuilder_ == null) {
               this.typeRanksBuilder_ = new RepeatedFieldBuilderV3(this.typeRanks_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.typeRanks_ = null;
            }

            return this.typeRanksBuilder_;
         }

         public boolean hasUnionName() {
            return (this.bitField0_ & 2) != 0;
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
               this.bitField0_ |= 2;
               this.unionName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearUnionName() {
            this.bitField0_ &= -3;
            this.unionName_ = RankMsg.S2C_KindsOfRank_8808.getDefaultInstance().getUnionName();
            this.onChanged();
            return this;
         }

         public Builder setUnionNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.unionName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasUnionHead() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getUnionHead() {
            return this.unionHead_;
         }

         public Builder setUnionHead(int value) {
            this.bitField0_ |= 4;
            this.unionHead_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionHead() {
            this.bitField0_ &= -5;
            this.unionHead_ = 0;
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

   public static final class C2S_RankModule_8809 extends GeneratedMessageV3 implements C2S_RankModule_8809OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MODULEID_FIELD_NUMBER = 1;
      private int moduleId_;
      public static final int PARAMS_FIELD_NUMBER = 2;
      private LazyStringList params_;
      public static final int LIMIT_FIELD_NUMBER = 3;
      private int limit_;
      private byte memoizedIsInitialized;
      private static final C2S_RankModule_8809 DEFAULT_INSTANCE = new C2S_RankModule_8809();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RankModule_8809> PARSER = new AbstractParser<C2S_RankModule_8809>() {
         public C2S_RankModule_8809 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RankModule_8809(input, extensionRegistry);
         }
      };

      private C2S_RankModule_8809(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RankModule_8809() {
         this.memoizedIsInitialized = -1;
         this.params_ = LazyStringArrayList.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RankModule_8809();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RankModule_8809(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.moduleId_ = input.readInt32();
                        break;
                     case 18:
                        ByteString bs = input.readBytes();
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.params_ = new LazyStringArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.params_.add(bs);
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.limit_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.params_ = this.params_.getUnmodifiableView();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_RankModule_8809_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_RankModule_8809_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RankModule_8809.class, Builder.class);
      }

      public boolean hasModuleId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getModuleId() {
         return this.moduleId_;
      }

      public ProtocolStringList getParamsList() {
         return this.params_;
      }

      public int getParamsCount() {
         return this.params_.size();
      }

      public String getParams(int index) {
         return (String)this.params_.get(index);
      }

      public ByteString getParamsBytes(int index) {
         return this.params_.getByteString(index);
      }

      public boolean hasLimit() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLimit() {
         return this.limit_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasModuleId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.moduleId_);
         }

         for(int i = 0; i < this.params_.size(); ++i) {
            GeneratedMessageV3.writeString(output, 2, this.params_.getRaw(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.limit_);
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
               size += CodedOutputStream.computeInt32Size(1, this.moduleId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.params_.size(); ++i) {
               dataSize += computeStringSizeNoTag(this.params_.getRaw(i));
            }

            size += dataSize;
            size += 1 * this.getParamsList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.limit_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RankModule_8809)) {
            return super.equals(obj);
         } else {
            C2S_RankModule_8809 other = (C2S_RankModule_8809)obj;
            if (this.hasModuleId() != other.hasModuleId()) {
               return false;
            } else if (this.hasModuleId() && this.getModuleId() != other.getModuleId()) {
               return false;
            } else if (!this.getParamsList().equals(other.getParamsList())) {
               return false;
            } else if (this.hasLimit() != other.hasLimit()) {
               return false;
            } else if (this.hasLimit() && this.getLimit() != other.getLimit()) {
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
            if (this.hasModuleId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getModuleId();
            }

            if (this.getParamsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getParamsList().hashCode();
            }

            if (this.hasLimit()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLimit();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RankModule_8809 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RankModule_8809)PARSER.parseFrom(data);
      }

      public static C2S_RankModule_8809 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RankModule_8809)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RankModule_8809 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RankModule_8809)PARSER.parseFrom(data);
      }

      public static C2S_RankModule_8809 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RankModule_8809)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RankModule_8809 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RankModule_8809)PARSER.parseFrom(data);
      }

      public static C2S_RankModule_8809 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RankModule_8809)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RankModule_8809 parseFrom(InputStream input) throws IOException {
         return (C2S_RankModule_8809)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RankModule_8809 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RankModule_8809)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RankModule_8809 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RankModule_8809)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RankModule_8809 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RankModule_8809)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RankModule_8809 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RankModule_8809)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RankModule_8809 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RankModule_8809)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RankModule_8809 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RankModule_8809 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RankModule_8809> parser() {
         return PARSER;
      }

      public Parser<C2S_RankModule_8809> getParserForType() {
         return PARSER;
      }

      public C2S_RankModule_8809 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RankModule_8809OrBuilder {
         private int bitField0_;
         private int moduleId_;
         private LazyStringList params_;
         private int limit_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_RankModule_8809_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_RankModule_8809_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RankModule_8809.class, Builder.class);
         }

         private Builder() {
            this.params_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.params_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RankMsg.C2S_RankModule_8809.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.moduleId_ = 0;
            this.bitField0_ &= -2;
            this.params_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            this.limit_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_RankModule_8809_descriptor;
         }

         public C2S_RankModule_8809 getDefaultInstanceForType() {
            return RankMsg.C2S_RankModule_8809.getDefaultInstance();
         }

         public C2S_RankModule_8809 build() {
            C2S_RankModule_8809 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RankModule_8809 buildPartial() {
            C2S_RankModule_8809 result = new C2S_RankModule_8809(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.moduleId_ = this.moduleId_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.params_ = this.params_.getUnmodifiableView();
               this.bitField0_ &= -3;
            }

            result.params_ = this.params_;
            if ((from_bitField0_ & 4) != 0) {
               result.limit_ = this.limit_;
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
            if (other instanceof C2S_RankModule_8809) {
               return this.mergeFrom((C2S_RankModule_8809)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RankModule_8809 other) {
            if (other == RankMsg.C2S_RankModule_8809.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasModuleId()) {
                  this.setModuleId(other.getModuleId());
               }

               if (!other.params_.isEmpty()) {
                  if (this.params_.isEmpty()) {
                     this.params_ = other.params_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureParamsIsMutable();
                     this.params_.addAll(other.params_);
                  }

                  this.onChanged();
               }

               if (other.hasLimit()) {
                  this.setLimit(other.getLimit());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasModuleId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RankModule_8809 parsedMessage = null;

            try {
               parsedMessage = (C2S_RankModule_8809)RankMsg.C2S_RankModule_8809.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RankModule_8809)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasModuleId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getModuleId() {
            return this.moduleId_;
         }

         public Builder setModuleId(int value) {
            this.bitField0_ |= 1;
            this.moduleId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModuleId() {
            this.bitField0_ &= -2;
            this.moduleId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureParamsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.params_ = new LazyStringArrayList(this.params_);
               this.bitField0_ |= 2;
            }

         }

         public ProtocolStringList getParamsList() {
            return this.params_.getUnmodifiableView();
         }

         public int getParamsCount() {
            return this.params_.size();
         }

         public String getParams(int index) {
            return (String)this.params_.get(index);
         }

         public ByteString getParamsBytes(int index) {
            return this.params_.getByteString(index);
         }

         public Builder setParams(int index, String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureParamsIsMutable();
               this.params_.set(index, value);
               this.onChanged();
               return this;
            }
         }

         public Builder addParams(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureParamsIsMutable();
               this.params_.add(value);
               this.onChanged();
               return this;
            }
         }

         public Builder addAllParams(Iterable<String> values) {
            this.ensureParamsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.params_);
            this.onChanged();
            return this;
         }

         public Builder clearParams() {
            this.params_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public Builder addParamsBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureParamsIsMutable();
               this.params_.add(value);
               this.onChanged();
               return this;
            }
         }

         public boolean hasLimit() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLimit() {
            return this.limit_;
         }

         public Builder setLimit(int value) {
            this.bitField0_ |= 4;
            this.limit_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLimit() {
            this.bitField0_ &= -5;
            this.limit_ = 0;
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

   public static final class S2C_RankModule_8810 extends GeneratedMessageV3 implements S2C_RankModule_8810OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MODULEID_FIELD_NUMBER = 1;
      private int moduleId_;
      public static final int MYRANK_FIELD_NUMBER = 2;
      private RankData myRank_;
      public static final int RANKS_FIELD_NUMBER = 3;
      private List<RankData> ranks_;
      public static final int MYUNIONRANK_FIELD_NUMBER = 4;
      private RankUnionData myUnionRank_;
      public static final int UNIONRANKS_FIELD_NUMBER = 5;
      private List<RankUnionData> unionRanks_;
      public static final int PARAMS_FIELD_NUMBER = 6;
      private LazyStringList params_;
      private byte memoizedIsInitialized;
      private static final S2C_RankModule_8810 DEFAULT_INSTANCE = new S2C_RankModule_8810();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RankModule_8810> PARSER = new AbstractParser<S2C_RankModule_8810>() {
         public S2C_RankModule_8810 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RankModule_8810(input, extensionRegistry);
         }
      };

      private S2C_RankModule_8810(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RankModule_8810() {
         this.memoizedIsInitialized = -1;
         this.ranks_ = Collections.emptyList();
         this.unionRanks_ = Collections.emptyList();
         this.params_ = LazyStringArrayList.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RankModule_8810();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RankModule_8810(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.moduleId_ = input.readInt32();
                        break;
                     case 18:
                        RankData.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.myRank_.toBuilder();
                        }

                        this.myRank_ = (RankData)input.readMessage(RankMsg.RankData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.myRank_);
                           this.myRank_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.ranks_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.ranks_.add(input.readMessage(RankMsg.RankData.PARSER, extensionRegistry));
                        break;
                     case 34:
                        RankUnionData.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.myUnionRank_.toBuilder();
                        }

                        this.myUnionRank_ = (RankUnionData)input.readMessage(RankMsg.RankUnionData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.myUnionRank_);
                           this.myUnionRank_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4;
                        break;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.unionRanks_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.unionRanks_.add(input.readMessage(RankMsg.RankUnionData.PARSER, extensionRegistry));
                        break;
                     case 50:
                        ByteString bs = input.readBytes();
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.params_ = new LazyStringArrayList();
                           mutable_bitField0_ |= 32;
                        }

                        this.params_.add(bs);
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.unionRanks_ = Collections.unmodifiableList(this.unionRanks_);
               }

               if ((mutable_bitField0_ & 32) != 0) {
                  this.params_ = this.params_.getUnmodifiableView();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_RankModule_8810_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_RankModule_8810_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RankModule_8810.class, Builder.class);
      }

      public boolean hasModuleId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getModuleId() {
         return this.moduleId_;
      }

      public boolean hasMyRank() {
         return (this.bitField0_ & 2) != 0;
      }

      public RankData getMyRank() {
         return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
      }

      public RankDataOrBuilder getMyRankOrBuilder() {
         return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
      }

      public List<RankData> getRanksList() {
         return this.ranks_;
      }

      public List<? extends RankDataOrBuilder> getRanksOrBuilderList() {
         return this.ranks_;
      }

      public int getRanksCount() {
         return this.ranks_.size();
      }

      public RankData getRanks(int index) {
         return (RankData)this.ranks_.get(index);
      }

      public RankDataOrBuilder getRanksOrBuilder(int index) {
         return (RankDataOrBuilder)this.ranks_.get(index);
      }

      public boolean hasMyUnionRank() {
         return (this.bitField0_ & 4) != 0;
      }

      public RankUnionData getMyUnionRank() {
         return this.myUnionRank_ == null ? RankMsg.RankUnionData.getDefaultInstance() : this.myUnionRank_;
      }

      public RankUnionDataOrBuilder getMyUnionRankOrBuilder() {
         return this.myUnionRank_ == null ? RankMsg.RankUnionData.getDefaultInstance() : this.myUnionRank_;
      }

      public List<RankUnionData> getUnionRanksList() {
         return this.unionRanks_;
      }

      public List<? extends RankUnionDataOrBuilder> getUnionRanksOrBuilderList() {
         return this.unionRanks_;
      }

      public int getUnionRanksCount() {
         return this.unionRanks_.size();
      }

      public RankUnionData getUnionRanks(int index) {
         return (RankUnionData)this.unionRanks_.get(index);
      }

      public RankUnionDataOrBuilder getUnionRanksOrBuilder(int index) {
         return (RankUnionDataOrBuilder)this.unionRanks_.get(index);
      }

      public ProtocolStringList getParamsList() {
         return this.params_;
      }

      public int getParamsCount() {
         return this.params_.size();
      }

      public String getParams(int index) {
         return (String)this.params_.get(index);
      }

      public ByteString getParamsBytes(int index) {
         return this.params_.getByteString(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasModuleId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasMyRank() && !this.getMyRank().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRanksCount(); ++i) {
               if (!this.getRanks(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            if (this.hasMyUnionRank() && !this.getMyUnionRank().isInitialized()) {
               this.memoizedIsInitialized = 0;
               return false;
            } else {
               for(int i = 0; i < this.getUnionRanksCount(); ++i) {
                  if (!this.getUnionRanks(i).isInitialized()) {
                     this.memoizedIsInitialized = 0;
                     return false;
                  }
               }

               this.memoizedIsInitialized = 1;
               return true;
            }
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.moduleId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getMyRank());
         }

         for(int i = 0; i < this.ranks_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.ranks_.get(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(4, this.getMyUnionRank());
         }

         for(int i = 0; i < this.unionRanks_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.unionRanks_.get(i));
         }

         for(int i = 0; i < this.params_.size(); ++i) {
            GeneratedMessageV3.writeString(output, 6, this.params_.getRaw(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.moduleId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getMyRank());
            }

            for(int i = 0; i < this.ranks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.ranks_.get(i));
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(4, this.getMyUnionRank());
            }

            for(int i = 0; i < this.unionRanks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.unionRanks_.get(i));
            }

            int dataSize = 0;

            for(int i = 0; i < this.params_.size(); ++i) {
               dataSize += computeStringSizeNoTag(this.params_.getRaw(i));
            }

            size += dataSize;
            size += 1 * this.getParamsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RankModule_8810)) {
            return super.equals(obj);
         } else {
            S2C_RankModule_8810 other = (S2C_RankModule_8810)obj;
            if (this.hasModuleId() != other.hasModuleId()) {
               return false;
            } else if (this.hasModuleId() && this.getModuleId() != other.getModuleId()) {
               return false;
            } else if (this.hasMyRank() != other.hasMyRank()) {
               return false;
            } else if (this.hasMyRank() && !this.getMyRank().equals(other.getMyRank())) {
               return false;
            } else if (!this.getRanksList().equals(other.getRanksList())) {
               return false;
            } else if (this.hasMyUnionRank() != other.hasMyUnionRank()) {
               return false;
            } else if (this.hasMyUnionRank() && !this.getMyUnionRank().equals(other.getMyUnionRank())) {
               return false;
            } else if (!this.getUnionRanksList().equals(other.getUnionRanksList())) {
               return false;
            } else if (!this.getParamsList().equals(other.getParamsList())) {
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
            if (this.hasModuleId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getModuleId();
            }

            if (this.hasMyRank()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMyRank().hashCode();
            }

            if (this.getRanksCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRanksList().hashCode();
            }

            if (this.hasMyUnionRank()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getMyUnionRank().hashCode();
            }

            if (this.getUnionRanksCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getUnionRanksList().hashCode();
            }

            if (this.getParamsCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getParamsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RankModule_8810 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RankModule_8810)PARSER.parseFrom(data);
      }

      public static S2C_RankModule_8810 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RankModule_8810)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RankModule_8810 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RankModule_8810)PARSER.parseFrom(data);
      }

      public static S2C_RankModule_8810 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RankModule_8810)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RankModule_8810 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RankModule_8810)PARSER.parseFrom(data);
      }

      public static S2C_RankModule_8810 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RankModule_8810)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RankModule_8810 parseFrom(InputStream input) throws IOException {
         return (S2C_RankModule_8810)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RankModule_8810 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RankModule_8810)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RankModule_8810 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RankModule_8810)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RankModule_8810 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RankModule_8810)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RankModule_8810 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RankModule_8810)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RankModule_8810 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RankModule_8810)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RankModule_8810 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RankModule_8810 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RankModule_8810> parser() {
         return PARSER;
      }

      public Parser<S2C_RankModule_8810> getParserForType() {
         return PARSER;
      }

      public S2C_RankModule_8810 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RankModule_8810OrBuilder {
         private int bitField0_;
         private int moduleId_;
         private RankData myRank_;
         private SingleFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> myRankBuilder_;
         private List<RankData> ranks_;
         private RepeatedFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> ranksBuilder_;
         private RankUnionData myUnionRank_;
         private SingleFieldBuilderV3<RankUnionData, RankUnionData.Builder, RankUnionDataOrBuilder> myUnionRankBuilder_;
         private List<RankUnionData> unionRanks_;
         private RepeatedFieldBuilderV3<RankUnionData, RankUnionData.Builder, RankUnionDataOrBuilder> unionRanksBuilder_;
         private LazyStringList params_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_RankModule_8810_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_RankModule_8810_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RankModule_8810.class, Builder.class);
         }

         private Builder() {
            this.ranks_ = Collections.emptyList();
            this.unionRanks_ = Collections.emptyList();
            this.params_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.ranks_ = Collections.emptyList();
            this.unionRanks_ = Collections.emptyList();
            this.params_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RankMsg.S2C_RankModule_8810.alwaysUseFieldBuilders) {
               this.getMyRankFieldBuilder();
               this.getRanksFieldBuilder();
               this.getMyUnionRankFieldBuilder();
               this.getUnionRanksFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.moduleId_ = 0;
            this.bitField0_ &= -2;
            if (this.myRankBuilder_ == null) {
               this.myRank_ = null;
            } else {
               this.myRankBuilder_.clear();
            }

            this.bitField0_ &= -3;
            if (this.ranksBuilder_ == null) {
               this.ranks_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.ranksBuilder_.clear();
            }

            if (this.myUnionRankBuilder_ == null) {
               this.myUnionRank_ = null;
            } else {
               this.myUnionRankBuilder_.clear();
            }

            this.bitField0_ &= -9;
            if (this.unionRanksBuilder_ == null) {
               this.unionRanks_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.unionRanksBuilder_.clear();
            }

            this.params_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_RankModule_8810_descriptor;
         }

         public S2C_RankModule_8810 getDefaultInstanceForType() {
            return RankMsg.S2C_RankModule_8810.getDefaultInstance();
         }

         public S2C_RankModule_8810 build() {
            S2C_RankModule_8810 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RankModule_8810 buildPartial() {
            S2C_RankModule_8810 result = new S2C_RankModule_8810(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.moduleId_ = this.moduleId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.myRankBuilder_ == null) {
                  result.myRank_ = this.myRank_;
               } else {
                  result.myRank_ = (RankData)this.myRankBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if (this.ranksBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
                  this.bitField0_ &= -5;
               }

               result.ranks_ = this.ranks_;
            } else {
               result.ranks_ = this.ranksBuilder_.build();
            }

            if ((from_bitField0_ & 8) != 0) {
               if (this.myUnionRankBuilder_ == null) {
                  result.myUnionRank_ = this.myUnionRank_;
               } else {
                  result.myUnionRank_ = (RankUnionData)this.myUnionRankBuilder_.build();
               }

               to_bitField0_ |= 4;
            }

            if (this.unionRanksBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.unionRanks_ = Collections.unmodifiableList(this.unionRanks_);
                  this.bitField0_ &= -17;
               }

               result.unionRanks_ = this.unionRanks_;
            } else {
               result.unionRanks_ = this.unionRanksBuilder_.build();
            }

            if ((this.bitField0_ & 32) != 0) {
               this.params_ = this.params_.getUnmodifiableView();
               this.bitField0_ &= -33;
            }

            result.params_ = this.params_;
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
            if (other instanceof S2C_RankModule_8810) {
               return this.mergeFrom((S2C_RankModule_8810)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RankModule_8810 other) {
            if (other == RankMsg.S2C_RankModule_8810.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasModuleId()) {
                  this.setModuleId(other.getModuleId());
               }

               if (other.hasMyRank()) {
                  this.mergeMyRank(other.getMyRank());
               }

               if (this.ranksBuilder_ == null) {
                  if (!other.ranks_.isEmpty()) {
                     if (this.ranks_.isEmpty()) {
                        this.ranks_ = other.ranks_;
                        this.bitField0_ &= -5;
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
                     this.bitField0_ &= -5;
                     this.ranksBuilder_ = RankMsg.S2C_RankModule_8810.alwaysUseFieldBuilders ? this.getRanksFieldBuilder() : null;
                  } else {
                     this.ranksBuilder_.addAllMessages(other.ranks_);
                  }
               }

               if (other.hasMyUnionRank()) {
                  this.mergeMyUnionRank(other.getMyUnionRank());
               }

               if (this.unionRanksBuilder_ == null) {
                  if (!other.unionRanks_.isEmpty()) {
                     if (this.unionRanks_.isEmpty()) {
                        this.unionRanks_ = other.unionRanks_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureUnionRanksIsMutable();
                        this.unionRanks_.addAll(other.unionRanks_);
                     }

                     this.onChanged();
                  }
               } else if (!other.unionRanks_.isEmpty()) {
                  if (this.unionRanksBuilder_.isEmpty()) {
                     this.unionRanksBuilder_.dispose();
                     this.unionRanksBuilder_ = null;
                     this.unionRanks_ = other.unionRanks_;
                     this.bitField0_ &= -17;
                     this.unionRanksBuilder_ = RankMsg.S2C_RankModule_8810.alwaysUseFieldBuilders ? this.getUnionRanksFieldBuilder() : null;
                  } else {
                     this.unionRanksBuilder_.addAllMessages(other.unionRanks_);
                  }
               }

               if (!other.params_.isEmpty()) {
                  if (this.params_.isEmpty()) {
                     this.params_ = other.params_;
                     this.bitField0_ &= -33;
                  } else {
                     this.ensureParamsIsMutable();
                     this.params_.addAll(other.params_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasModuleId()) {
               return false;
            } else if (this.hasMyRank() && !this.getMyRank().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getRanksCount(); ++i) {
                  if (!this.getRanks(i).isInitialized()) {
                     return false;
                  }
               }

               if (this.hasMyUnionRank() && !this.getMyUnionRank().isInitialized()) {
                  return false;
               } else {
                  for(int i = 0; i < this.getUnionRanksCount(); ++i) {
                     if (!this.getUnionRanks(i).isInitialized()) {
                        return false;
                     }
                  }

                  return true;
               }
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RankModule_8810 parsedMessage = null;

            try {
               parsedMessage = (S2C_RankModule_8810)RankMsg.S2C_RankModule_8810.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RankModule_8810)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasModuleId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getModuleId() {
            return this.moduleId_;
         }

         public Builder setModuleId(int value) {
            this.bitField0_ |= 1;
            this.moduleId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModuleId() {
            this.bitField0_ &= -2;
            this.moduleId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMyRank() {
            return (this.bitField0_ & 2) != 0;
         }

         public RankData getMyRank() {
            if (this.myRankBuilder_ == null) {
               return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
            } else {
               return (RankData)this.myRankBuilder_.getMessage();
            }
         }

         public Builder setMyRank(RankData value) {
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

         public Builder setMyRank(RankData.Builder builderForValue) {
            if (this.myRankBuilder_ == null) {
               this.myRank_ = builderForValue.build();
               this.onChanged();
            } else {
               this.myRankBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeMyRank(RankData value) {
            if (this.myRankBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.myRank_ != null && this.myRank_ != RankMsg.RankData.getDefaultInstance()) {
                  this.myRank_ = RankMsg.RankData.newBuilder(this.myRank_).mergeFrom(value).buildPartial();
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

         public RankData.Builder getMyRankBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (RankData.Builder)this.getMyRankFieldBuilder().getBuilder();
         }

         public RankDataOrBuilder getMyRankOrBuilder() {
            if (this.myRankBuilder_ != null) {
               return (RankDataOrBuilder)this.myRankBuilder_.getMessageOrBuilder();
            } else {
               return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
            }
         }

         private SingleFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> getMyRankFieldBuilder() {
            if (this.myRankBuilder_ == null) {
               this.myRankBuilder_ = new SingleFieldBuilderV3(this.getMyRank(), this.getParentForChildren(), this.isClean());
               this.myRank_ = null;
            }

            return this.myRankBuilder_;
         }

         private void ensureRanksIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.ranks_ = new ArrayList(this.ranks_);
               this.bitField0_ |= 4;
            }

         }

         public List<RankData> getRanksList() {
            return this.ranksBuilder_ == null ? Collections.unmodifiableList(this.ranks_) : this.ranksBuilder_.getMessageList();
         }

         public int getRanksCount() {
            return this.ranksBuilder_ == null ? this.ranks_.size() : this.ranksBuilder_.getCount();
         }

         public RankData getRanks(int index) {
            return this.ranksBuilder_ == null ? (RankData)this.ranks_.get(index) : (RankData)this.ranksBuilder_.getMessage(index);
         }

         public Builder setRanks(int index, RankData value) {
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

         public Builder setRanks(int index, RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(RankData value) {
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

         public Builder addRanks(int index, RankData value) {
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

         public Builder addRanks(RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(int index, RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRanks(Iterable<? extends RankData> values) {
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
               this.bitField0_ &= -5;
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

         public RankData.Builder getRanksBuilder(int index) {
            return (RankData.Builder)this.getRanksFieldBuilder().getBuilder(index);
         }

         public RankDataOrBuilder getRanksOrBuilder(int index) {
            return this.ranksBuilder_ == null ? (RankDataOrBuilder)this.ranks_.get(index) : (RankDataOrBuilder)this.ranksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankDataOrBuilder> getRanksOrBuilderList() {
            return this.ranksBuilder_ != null ? this.ranksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.ranks_);
         }

         public RankData.Builder addRanksBuilder() {
            return (RankData.Builder)this.getRanksFieldBuilder().addBuilder(RankMsg.RankData.getDefaultInstance());
         }

         public RankData.Builder addRanksBuilder(int index) {
            return (RankData.Builder)this.getRanksFieldBuilder().addBuilder(index, RankMsg.RankData.getDefaultInstance());
         }

         public List<RankData.Builder> getRanksBuilderList() {
            return this.getRanksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> getRanksFieldBuilder() {
            if (this.ranksBuilder_ == null) {
               this.ranksBuilder_ = new RepeatedFieldBuilderV3(this.ranks_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.ranks_ = null;
            }

            return this.ranksBuilder_;
         }

         public boolean hasMyUnionRank() {
            return (this.bitField0_ & 8) != 0;
         }

         public RankUnionData getMyUnionRank() {
            if (this.myUnionRankBuilder_ == null) {
               return this.myUnionRank_ == null ? RankMsg.RankUnionData.getDefaultInstance() : this.myUnionRank_;
            } else {
               return (RankUnionData)this.myUnionRankBuilder_.getMessage();
            }
         }

         public Builder setMyUnionRank(RankUnionData value) {
            if (this.myUnionRankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.myUnionRank_ = value;
               this.onChanged();
            } else {
               this.myUnionRankBuilder_.setMessage(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder setMyUnionRank(RankUnionData.Builder builderForValue) {
            if (this.myUnionRankBuilder_ == null) {
               this.myUnionRank_ = builderForValue.build();
               this.onChanged();
            } else {
               this.myUnionRankBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder mergeMyUnionRank(RankUnionData value) {
            if (this.myUnionRankBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0 && this.myUnionRank_ != null && this.myUnionRank_ != RankMsg.RankUnionData.getDefaultInstance()) {
                  this.myUnionRank_ = RankMsg.RankUnionData.newBuilder(this.myUnionRank_).mergeFrom(value).buildPartial();
               } else {
                  this.myUnionRank_ = value;
               }

               this.onChanged();
            } else {
               this.myUnionRankBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder clearMyUnionRank() {
            if (this.myUnionRankBuilder_ == null) {
               this.myUnionRank_ = null;
               this.onChanged();
            } else {
               this.myUnionRankBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public RankUnionData.Builder getMyUnionRankBuilder() {
            this.bitField0_ |= 8;
            this.onChanged();
            return (RankUnionData.Builder)this.getMyUnionRankFieldBuilder().getBuilder();
         }

         public RankUnionDataOrBuilder getMyUnionRankOrBuilder() {
            if (this.myUnionRankBuilder_ != null) {
               return (RankUnionDataOrBuilder)this.myUnionRankBuilder_.getMessageOrBuilder();
            } else {
               return this.myUnionRank_ == null ? RankMsg.RankUnionData.getDefaultInstance() : this.myUnionRank_;
            }
         }

         private SingleFieldBuilderV3<RankUnionData, RankUnionData.Builder, RankUnionDataOrBuilder> getMyUnionRankFieldBuilder() {
            if (this.myUnionRankBuilder_ == null) {
               this.myUnionRankBuilder_ = new SingleFieldBuilderV3(this.getMyUnionRank(), this.getParentForChildren(), this.isClean());
               this.myUnionRank_ = null;
            }

            return this.myUnionRankBuilder_;
         }

         private void ensureUnionRanksIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.unionRanks_ = new ArrayList(this.unionRanks_);
               this.bitField0_ |= 16;
            }

         }

         public List<RankUnionData> getUnionRanksList() {
            return this.unionRanksBuilder_ == null ? Collections.unmodifiableList(this.unionRanks_) : this.unionRanksBuilder_.getMessageList();
         }

         public int getUnionRanksCount() {
            return this.unionRanksBuilder_ == null ? this.unionRanks_.size() : this.unionRanksBuilder_.getCount();
         }

         public RankUnionData getUnionRanks(int index) {
            return this.unionRanksBuilder_ == null ? (RankUnionData)this.unionRanks_.get(index) : (RankUnionData)this.unionRanksBuilder_.getMessage(index);
         }

         public Builder setUnionRanks(int index, RankUnionData value) {
            if (this.unionRanksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureUnionRanksIsMutable();
               this.unionRanks_.set(index, value);
               this.onChanged();
            } else {
               this.unionRanksBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setUnionRanks(int index, RankUnionData.Builder builderForValue) {
            if (this.unionRanksBuilder_ == null) {
               this.ensureUnionRanksIsMutable();
               this.unionRanks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.unionRanksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addUnionRanks(RankUnionData value) {
            if (this.unionRanksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureUnionRanksIsMutable();
               this.unionRanks_.add(value);
               this.onChanged();
            } else {
               this.unionRanksBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addUnionRanks(int index, RankUnionData value) {
            if (this.unionRanksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureUnionRanksIsMutable();
               this.unionRanks_.add(index, value);
               this.onChanged();
            } else {
               this.unionRanksBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addUnionRanks(RankUnionData.Builder builderForValue) {
            if (this.unionRanksBuilder_ == null) {
               this.ensureUnionRanksIsMutable();
               this.unionRanks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.unionRanksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addUnionRanks(int index, RankUnionData.Builder builderForValue) {
            if (this.unionRanksBuilder_ == null) {
               this.ensureUnionRanksIsMutable();
               this.unionRanks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.unionRanksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllUnionRanks(Iterable<? extends RankUnionData> values) {
            if (this.unionRanksBuilder_ == null) {
               this.ensureUnionRanksIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.unionRanks_);
               this.onChanged();
            } else {
               this.unionRanksBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearUnionRanks() {
            if (this.unionRanksBuilder_ == null) {
               this.unionRanks_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.unionRanksBuilder_.clear();
            }

            return this;
         }

         public Builder removeUnionRanks(int index) {
            if (this.unionRanksBuilder_ == null) {
               this.ensureUnionRanksIsMutable();
               this.unionRanks_.remove(index);
               this.onChanged();
            } else {
               this.unionRanksBuilder_.remove(index);
            }

            return this;
         }

         public RankUnionData.Builder getUnionRanksBuilder(int index) {
            return (RankUnionData.Builder)this.getUnionRanksFieldBuilder().getBuilder(index);
         }

         public RankUnionDataOrBuilder getUnionRanksOrBuilder(int index) {
            return this.unionRanksBuilder_ == null ? (RankUnionDataOrBuilder)this.unionRanks_.get(index) : (RankUnionDataOrBuilder)this.unionRanksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankUnionDataOrBuilder> getUnionRanksOrBuilderList() {
            return this.unionRanksBuilder_ != null ? this.unionRanksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.unionRanks_);
         }

         public RankUnionData.Builder addUnionRanksBuilder() {
            return (RankUnionData.Builder)this.getUnionRanksFieldBuilder().addBuilder(RankMsg.RankUnionData.getDefaultInstance());
         }

         public RankUnionData.Builder addUnionRanksBuilder(int index) {
            return (RankUnionData.Builder)this.getUnionRanksFieldBuilder().addBuilder(index, RankMsg.RankUnionData.getDefaultInstance());
         }

         public List<RankUnionData.Builder> getUnionRanksBuilderList() {
            return this.getUnionRanksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankUnionData, RankUnionData.Builder, RankUnionDataOrBuilder> getUnionRanksFieldBuilder() {
            if (this.unionRanksBuilder_ == null) {
               this.unionRanksBuilder_ = new RepeatedFieldBuilderV3(this.unionRanks_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.unionRanks_ = null;
            }

            return this.unionRanksBuilder_;
         }

         private void ensureParamsIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.params_ = new LazyStringArrayList(this.params_);
               this.bitField0_ |= 32;
            }

         }

         public ProtocolStringList getParamsList() {
            return this.params_.getUnmodifiableView();
         }

         public int getParamsCount() {
            return this.params_.size();
         }

         public String getParams(int index) {
            return (String)this.params_.get(index);
         }

         public ByteString getParamsBytes(int index) {
            return this.params_.getByteString(index);
         }

         public Builder setParams(int index, String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureParamsIsMutable();
               this.params_.set(index, value);
               this.onChanged();
               return this;
            }
         }

         public Builder addParams(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureParamsIsMutable();
               this.params_.add(value);
               this.onChanged();
               return this;
            }
         }

         public Builder addAllParams(Iterable<String> values) {
            this.ensureParamsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.params_);
            this.onChanged();
            return this;
         }

         public Builder clearParams() {
            this.params_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -33;
            this.onChanged();
            return this;
         }

         public Builder addParamsBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureParamsIsMutable();
               this.params_.add(value);
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

   public static final class C2S_RankRewardInfo_8811 extends GeneratedMessageV3 implements C2S_RankRewardInfo_8811OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_RankRewardInfo_8811 DEFAULT_INSTANCE = new C2S_RankRewardInfo_8811();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RankRewardInfo_8811> PARSER = new AbstractParser<C2S_RankRewardInfo_8811>() {
         public C2S_RankRewardInfo_8811 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RankRewardInfo_8811(input, extensionRegistry);
         }
      };

      private C2S_RankRewardInfo_8811(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RankRewardInfo_8811() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RankRewardInfo_8811();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RankRewardInfo_8811(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_RankRewardInfo_8811_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_RankRewardInfo_8811_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RankRewardInfo_8811.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RankRewardInfo_8811)) {
            return super.equals(obj);
         } else {
            C2S_RankRewardInfo_8811 other = (C2S_RankRewardInfo_8811)obj;
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

      public static C2S_RankRewardInfo_8811 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RankRewardInfo_8811)PARSER.parseFrom(data);
      }

      public static C2S_RankRewardInfo_8811 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RankRewardInfo_8811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RankRewardInfo_8811 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RankRewardInfo_8811)PARSER.parseFrom(data);
      }

      public static C2S_RankRewardInfo_8811 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RankRewardInfo_8811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RankRewardInfo_8811 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RankRewardInfo_8811)PARSER.parseFrom(data);
      }

      public static C2S_RankRewardInfo_8811 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RankRewardInfo_8811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RankRewardInfo_8811 parseFrom(InputStream input) throws IOException {
         return (C2S_RankRewardInfo_8811)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RankRewardInfo_8811 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RankRewardInfo_8811)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RankRewardInfo_8811 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RankRewardInfo_8811)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RankRewardInfo_8811 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RankRewardInfo_8811)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RankRewardInfo_8811 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RankRewardInfo_8811)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RankRewardInfo_8811 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RankRewardInfo_8811)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RankRewardInfo_8811 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RankRewardInfo_8811 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RankRewardInfo_8811> parser() {
         return PARSER;
      }

      public Parser<C2S_RankRewardInfo_8811> getParserForType() {
         return PARSER;
      }

      public C2S_RankRewardInfo_8811 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RankRewardInfo_8811OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_RankRewardInfo_8811_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_RankRewardInfo_8811_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RankRewardInfo_8811.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RankMsg.C2S_RankRewardInfo_8811.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_RankRewardInfo_8811_descriptor;
         }

         public C2S_RankRewardInfo_8811 getDefaultInstanceForType() {
            return RankMsg.C2S_RankRewardInfo_8811.getDefaultInstance();
         }

         public C2S_RankRewardInfo_8811 build() {
            C2S_RankRewardInfo_8811 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RankRewardInfo_8811 buildPartial() {
            C2S_RankRewardInfo_8811 result = new C2S_RankRewardInfo_8811(this);
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
            if (other instanceof C2S_RankRewardInfo_8811) {
               return this.mergeFrom((C2S_RankRewardInfo_8811)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RankRewardInfo_8811 other) {
            if (other == RankMsg.C2S_RankRewardInfo_8811.getDefaultInstance()) {
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
            C2S_RankRewardInfo_8811 parsedMessage = null;

            try {
               parsedMessage = (C2S_RankRewardInfo_8811)RankMsg.C2S_RankRewardInfo_8811.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RankRewardInfo_8811)e.getUnfinishedMessage();
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

   public static final class S2C_RankRewardInfo_8812 extends GeneratedMessageV3 implements S2C_RankRewardInfo_8812OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int REWARDDATALIST_FIELD_NUMBER = 2;
      private List<RankRewardData> rewardDataList_;
      private byte memoizedIsInitialized;
      private static final S2C_RankRewardInfo_8812 DEFAULT_INSTANCE = new S2C_RankRewardInfo_8812();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RankRewardInfo_8812> PARSER = new AbstractParser<S2C_RankRewardInfo_8812>() {
         public S2C_RankRewardInfo_8812 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RankRewardInfo_8812(input, extensionRegistry);
         }
      };

      private S2C_RankRewardInfo_8812(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RankRewardInfo_8812() {
         this.memoizedIsInitialized = -1;
         this.rewardDataList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RankRewardInfo_8812();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RankRewardInfo_8812(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.rewardDataList_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.rewardDataList_.add(input.readMessage(RankMsg.RankRewardData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.rewardDataList_ = Collections.unmodifiableList(this.rewardDataList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_RankRewardInfo_8812_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_RankRewardInfo_8812_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RankRewardInfo_8812.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public List<RankRewardData> getRewardDataListList() {
         return this.rewardDataList_;
      }

      public List<? extends RankRewardDataOrBuilder> getRewardDataListOrBuilderList() {
         return this.rewardDataList_;
      }

      public int getRewardDataListCount() {
         return this.rewardDataList_.size();
      }

      public RankRewardData getRewardDataList(int index) {
         return (RankRewardData)this.rewardDataList_.get(index);
      }

      public RankRewardDataOrBuilder getRewardDataListOrBuilder(int index) {
         return (RankRewardDataOrBuilder)this.rewardDataList_.get(index);
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
            for(int i = 0; i < this.getRewardDataListCount(); ++i) {
               if (!this.getRewardDataList(i).isInitialized()) {
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

         for(int i = 0; i < this.rewardDataList_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.rewardDataList_.get(i));
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

            for(int i = 0; i < this.rewardDataList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.rewardDataList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RankRewardInfo_8812)) {
            return super.equals(obj);
         } else {
            S2C_RankRewardInfo_8812 other = (S2C_RankRewardInfo_8812)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (!this.getRewardDataListList().equals(other.getRewardDataListList())) {
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

            if (this.getRewardDataListCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRewardDataListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RankRewardInfo_8812 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RankRewardInfo_8812)PARSER.parseFrom(data);
      }

      public static S2C_RankRewardInfo_8812 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RankRewardInfo_8812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RankRewardInfo_8812 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RankRewardInfo_8812)PARSER.parseFrom(data);
      }

      public static S2C_RankRewardInfo_8812 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RankRewardInfo_8812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RankRewardInfo_8812 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RankRewardInfo_8812)PARSER.parseFrom(data);
      }

      public static S2C_RankRewardInfo_8812 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RankRewardInfo_8812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RankRewardInfo_8812 parseFrom(InputStream input) throws IOException {
         return (S2C_RankRewardInfo_8812)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RankRewardInfo_8812 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RankRewardInfo_8812)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RankRewardInfo_8812 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RankRewardInfo_8812)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RankRewardInfo_8812 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RankRewardInfo_8812)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RankRewardInfo_8812 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RankRewardInfo_8812)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RankRewardInfo_8812 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RankRewardInfo_8812)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RankRewardInfo_8812 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RankRewardInfo_8812 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RankRewardInfo_8812> parser() {
         return PARSER;
      }

      public Parser<S2C_RankRewardInfo_8812> getParserForType() {
         return PARSER;
      }

      public S2C_RankRewardInfo_8812 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RankRewardInfo_8812OrBuilder {
         private int bitField0_;
         private int type_;
         private List<RankRewardData> rewardDataList_;
         private RepeatedFieldBuilderV3<RankRewardData, RankRewardData.Builder, RankRewardDataOrBuilder> rewardDataListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_RankRewardInfo_8812_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_RankRewardInfo_8812_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RankRewardInfo_8812.class, Builder.class);
         }

         private Builder() {
            this.rewardDataList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardDataList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RankMsg.S2C_RankRewardInfo_8812.alwaysUseFieldBuilders) {
               this.getRewardDataListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            if (this.rewardDataListBuilder_ == null) {
               this.rewardDataList_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.rewardDataListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_RankRewardInfo_8812_descriptor;
         }

         public S2C_RankRewardInfo_8812 getDefaultInstanceForType() {
            return RankMsg.S2C_RankRewardInfo_8812.getDefaultInstance();
         }

         public S2C_RankRewardInfo_8812 build() {
            S2C_RankRewardInfo_8812 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RankRewardInfo_8812 buildPartial() {
            S2C_RankRewardInfo_8812 result = new S2C_RankRewardInfo_8812(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if (this.rewardDataListBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.rewardDataList_ = Collections.unmodifiableList(this.rewardDataList_);
                  this.bitField0_ &= -3;
               }

               result.rewardDataList_ = this.rewardDataList_;
            } else {
               result.rewardDataList_ = this.rewardDataListBuilder_.build();
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
            if (other instanceof S2C_RankRewardInfo_8812) {
               return this.mergeFrom((S2C_RankRewardInfo_8812)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RankRewardInfo_8812 other) {
            if (other == RankMsg.S2C_RankRewardInfo_8812.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (this.rewardDataListBuilder_ == null) {
                  if (!other.rewardDataList_.isEmpty()) {
                     if (this.rewardDataList_.isEmpty()) {
                        this.rewardDataList_ = other.rewardDataList_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureRewardDataListIsMutable();
                        this.rewardDataList_.addAll(other.rewardDataList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.rewardDataList_.isEmpty()) {
                  if (this.rewardDataListBuilder_.isEmpty()) {
                     this.rewardDataListBuilder_.dispose();
                     this.rewardDataListBuilder_ = null;
                     this.rewardDataList_ = other.rewardDataList_;
                     this.bitField0_ &= -3;
                     this.rewardDataListBuilder_ = RankMsg.S2C_RankRewardInfo_8812.alwaysUseFieldBuilders ? this.getRewardDataListFieldBuilder() : null;
                  } else {
                     this.rewardDataListBuilder_.addAllMessages(other.rewardDataList_);
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
               for(int i = 0; i < this.getRewardDataListCount(); ++i) {
                  if (!this.getRewardDataList(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RankRewardInfo_8812 parsedMessage = null;

            try {
               parsedMessage = (S2C_RankRewardInfo_8812)RankMsg.S2C_RankRewardInfo_8812.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RankRewardInfo_8812)e.getUnfinishedMessage();
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

         private void ensureRewardDataListIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.rewardDataList_ = new ArrayList(this.rewardDataList_);
               this.bitField0_ |= 2;
            }

         }

         public List<RankRewardData> getRewardDataListList() {
            return this.rewardDataListBuilder_ == null ? Collections.unmodifiableList(this.rewardDataList_) : this.rewardDataListBuilder_.getMessageList();
         }

         public int getRewardDataListCount() {
            return this.rewardDataListBuilder_ == null ? this.rewardDataList_.size() : this.rewardDataListBuilder_.getCount();
         }

         public RankRewardData getRewardDataList(int index) {
            return this.rewardDataListBuilder_ == null ? (RankRewardData)this.rewardDataList_.get(index) : (RankRewardData)this.rewardDataListBuilder_.getMessage(index);
         }

         public Builder setRewardDataList(int index, RankRewardData value) {
            if (this.rewardDataListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardDataListIsMutable();
               this.rewardDataList_.set(index, value);
               this.onChanged();
            } else {
               this.rewardDataListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRewardDataList(int index, RankRewardData.Builder builderForValue) {
            if (this.rewardDataListBuilder_ == null) {
               this.ensureRewardDataListIsMutable();
               this.rewardDataList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardDataListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRewardDataList(RankRewardData value) {
            if (this.rewardDataListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardDataListIsMutable();
               this.rewardDataList_.add(value);
               this.onChanged();
            } else {
               this.rewardDataListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRewardDataList(int index, RankRewardData value) {
            if (this.rewardDataListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardDataListIsMutable();
               this.rewardDataList_.add(index, value);
               this.onChanged();
            } else {
               this.rewardDataListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRewardDataList(RankRewardData.Builder builderForValue) {
            if (this.rewardDataListBuilder_ == null) {
               this.ensureRewardDataListIsMutable();
               this.rewardDataList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rewardDataListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRewardDataList(int index, RankRewardData.Builder builderForValue) {
            if (this.rewardDataListBuilder_ == null) {
               this.ensureRewardDataListIsMutable();
               this.rewardDataList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardDataListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRewardDataList(Iterable<? extends RankRewardData> values) {
            if (this.rewardDataListBuilder_ == null) {
               this.ensureRewardDataListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rewardDataList_);
               this.onChanged();
            } else {
               this.rewardDataListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRewardDataList() {
            if (this.rewardDataListBuilder_ == null) {
               this.rewardDataList_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.rewardDataListBuilder_.clear();
            }

            return this;
         }

         public Builder removeRewardDataList(int index) {
            if (this.rewardDataListBuilder_ == null) {
               this.ensureRewardDataListIsMutable();
               this.rewardDataList_.remove(index);
               this.onChanged();
            } else {
               this.rewardDataListBuilder_.remove(index);
            }

            return this;
         }

         public RankRewardData.Builder getRewardDataListBuilder(int index) {
            return (RankRewardData.Builder)this.getRewardDataListFieldBuilder().getBuilder(index);
         }

         public RankRewardDataOrBuilder getRewardDataListOrBuilder(int index) {
            return this.rewardDataListBuilder_ == null ? (RankRewardDataOrBuilder)this.rewardDataList_.get(index) : (RankRewardDataOrBuilder)this.rewardDataListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankRewardDataOrBuilder> getRewardDataListOrBuilderList() {
            return this.rewardDataListBuilder_ != null ? this.rewardDataListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rewardDataList_);
         }

         public RankRewardData.Builder addRewardDataListBuilder() {
            return (RankRewardData.Builder)this.getRewardDataListFieldBuilder().addBuilder(RankMsg.RankRewardData.getDefaultInstance());
         }

         public RankRewardData.Builder addRewardDataListBuilder(int index) {
            return (RankRewardData.Builder)this.getRewardDataListFieldBuilder().addBuilder(index, RankMsg.RankRewardData.getDefaultInstance());
         }

         public List<RankRewardData.Builder> getRewardDataListBuilderList() {
            return this.getRewardDataListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankRewardData, RankRewardData.Builder, RankRewardDataOrBuilder> getRewardDataListFieldBuilder() {
            if (this.rewardDataListBuilder_ == null) {
               this.rewardDataListBuilder_ = new RepeatedFieldBuilderV3(this.rewardDataList_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.rewardDataList_ = null;
            }

            return this.rewardDataListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_RankReward_8813 extends GeneratedMessageV3 implements C2S_RankReward_8813OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_RankReward_8813 DEFAULT_INSTANCE = new C2S_RankReward_8813();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RankReward_8813> PARSER = new AbstractParser<C2S_RankReward_8813>() {
         public C2S_RankReward_8813 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RankReward_8813(input, extensionRegistry);
         }
      };

      private C2S_RankReward_8813(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RankReward_8813() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RankReward_8813();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RankReward_8813(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_RankReward_8813_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_RankReward_8813_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RankReward_8813.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RankReward_8813)) {
            return super.equals(obj);
         } else {
            C2S_RankReward_8813 other = (C2S_RankReward_8813)obj;
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

      public static C2S_RankReward_8813 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RankReward_8813)PARSER.parseFrom(data);
      }

      public static C2S_RankReward_8813 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RankReward_8813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RankReward_8813 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RankReward_8813)PARSER.parseFrom(data);
      }

      public static C2S_RankReward_8813 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RankReward_8813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RankReward_8813 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RankReward_8813)PARSER.parseFrom(data);
      }

      public static C2S_RankReward_8813 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RankReward_8813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RankReward_8813 parseFrom(InputStream input) throws IOException {
         return (C2S_RankReward_8813)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RankReward_8813 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RankReward_8813)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RankReward_8813 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RankReward_8813)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RankReward_8813 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RankReward_8813)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RankReward_8813 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RankReward_8813)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RankReward_8813 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RankReward_8813)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RankReward_8813 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RankReward_8813 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RankReward_8813> parser() {
         return PARSER;
      }

      public Parser<C2S_RankReward_8813> getParserForType() {
         return PARSER;
      }

      public C2S_RankReward_8813 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RankReward_8813OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_RankReward_8813_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_RankReward_8813_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RankReward_8813.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RankMsg.C2S_RankReward_8813.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_RankReward_8813_descriptor;
         }

         public C2S_RankReward_8813 getDefaultInstanceForType() {
            return RankMsg.C2S_RankReward_8813.getDefaultInstance();
         }

         public C2S_RankReward_8813 build() {
            C2S_RankReward_8813 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RankReward_8813 buildPartial() {
            C2S_RankReward_8813 result = new C2S_RankReward_8813(this);
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
            if (other instanceof C2S_RankReward_8813) {
               return this.mergeFrom((C2S_RankReward_8813)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RankReward_8813 other) {
            if (other == RankMsg.C2S_RankReward_8813.getDefaultInstance()) {
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
            C2S_RankReward_8813 parsedMessage = null;

            try {
               parsedMessage = (C2S_RankReward_8813)RankMsg.C2S_RankReward_8813.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RankReward_8813)e.getUnfinishedMessage();
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

   public static final class S2C_RankReward_8814 extends GeneratedMessageV3 implements S2C_RankReward_8814OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_RankReward_8814 DEFAULT_INSTANCE = new S2C_RankReward_8814();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RankReward_8814> PARSER = new AbstractParser<S2C_RankReward_8814>() {
         public S2C_RankReward_8814 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RankReward_8814(input, extensionRegistry);
         }
      };

      private S2C_RankReward_8814(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RankReward_8814() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RankReward_8814();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RankReward_8814(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_RankReward_8814_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_RankReward_8814_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RankReward_8814.class, Builder.class);
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
         } else if (!(obj instanceof S2C_RankReward_8814)) {
            return super.equals(obj);
         } else {
            S2C_RankReward_8814 other = (S2C_RankReward_8814)obj;
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

      public static S2C_RankReward_8814 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RankReward_8814)PARSER.parseFrom(data);
      }

      public static S2C_RankReward_8814 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RankReward_8814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RankReward_8814 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RankReward_8814)PARSER.parseFrom(data);
      }

      public static S2C_RankReward_8814 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RankReward_8814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RankReward_8814 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RankReward_8814)PARSER.parseFrom(data);
      }

      public static S2C_RankReward_8814 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RankReward_8814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RankReward_8814 parseFrom(InputStream input) throws IOException {
         return (S2C_RankReward_8814)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RankReward_8814 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RankReward_8814)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RankReward_8814 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RankReward_8814)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RankReward_8814 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RankReward_8814)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RankReward_8814 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RankReward_8814)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RankReward_8814 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RankReward_8814)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RankReward_8814 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RankReward_8814 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RankReward_8814> parser() {
         return PARSER;
      }

      public Parser<S2C_RankReward_8814> getParserForType() {
         return PARSER;
      }

      public S2C_RankReward_8814 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RankReward_8814OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_RankReward_8814_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_RankReward_8814_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RankReward_8814.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RankMsg.S2C_RankReward_8814.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_RankReward_8814_descriptor;
         }

         public S2C_RankReward_8814 getDefaultInstanceForType() {
            return RankMsg.S2C_RankReward_8814.getDefaultInstance();
         }

         public S2C_RankReward_8814 build() {
            S2C_RankReward_8814 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RankReward_8814 buildPartial() {
            S2C_RankReward_8814 result = new S2C_RankReward_8814(this);
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
            if (other instanceof S2C_RankReward_8814) {
               return this.mergeFrom((S2C_RankReward_8814)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RankReward_8814 other) {
            if (other == RankMsg.S2C_RankReward_8814.getDefaultInstance()) {
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
            S2C_RankReward_8814 parsedMessage = null;

            try {
               parsedMessage = (S2C_RankReward_8814)RankMsg.S2C_RankReward_8814.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RankReward_8814)e.getUnfinishedMessage();
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

   public static final class C2S_OpenServerRank_8815 extends GeneratedMessageV3 implements C2S_OpenServerRank_8815OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MODULEID_FIELD_NUMBER = 1;
      private int moduleId_;
      private byte memoizedIsInitialized;
      private static final C2S_OpenServerRank_8815 DEFAULT_INSTANCE = new C2S_OpenServerRank_8815();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenServerRank_8815> PARSER = new AbstractParser<C2S_OpenServerRank_8815>() {
         public C2S_OpenServerRank_8815 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenServerRank_8815(input, extensionRegistry);
         }
      };

      private C2S_OpenServerRank_8815(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenServerRank_8815() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenServerRank_8815();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenServerRank_8815(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.moduleId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_OpenServerRank_8815_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_OpenServerRank_8815_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenServerRank_8815.class, Builder.class);
      }

      public boolean hasModuleId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getModuleId() {
         return this.moduleId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasModuleId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.moduleId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.moduleId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_OpenServerRank_8815)) {
            return super.equals(obj);
         } else {
            C2S_OpenServerRank_8815 other = (C2S_OpenServerRank_8815)obj;
            if (this.hasModuleId() != other.hasModuleId()) {
               return false;
            } else if (this.hasModuleId() && this.getModuleId() != other.getModuleId()) {
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
            if (this.hasModuleId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getModuleId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_OpenServerRank_8815 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenServerRank_8815)PARSER.parseFrom(data);
      }

      public static C2S_OpenServerRank_8815 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenServerRank_8815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenServerRank_8815 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenServerRank_8815)PARSER.parseFrom(data);
      }

      public static C2S_OpenServerRank_8815 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenServerRank_8815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenServerRank_8815 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenServerRank_8815)PARSER.parseFrom(data);
      }

      public static C2S_OpenServerRank_8815 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenServerRank_8815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenServerRank_8815 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenServerRank_8815)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenServerRank_8815 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenServerRank_8815)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenServerRank_8815 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenServerRank_8815)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenServerRank_8815 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenServerRank_8815)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenServerRank_8815 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenServerRank_8815)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenServerRank_8815 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenServerRank_8815)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenServerRank_8815 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenServerRank_8815 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenServerRank_8815> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenServerRank_8815> getParserForType() {
         return PARSER;
      }

      public C2S_OpenServerRank_8815 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenServerRank_8815OrBuilder {
         private int bitField0_;
         private int moduleId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_OpenServerRank_8815_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_OpenServerRank_8815_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenServerRank_8815.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RankMsg.C2S_OpenServerRank_8815.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.moduleId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_OpenServerRank_8815_descriptor;
         }

         public C2S_OpenServerRank_8815 getDefaultInstanceForType() {
            return RankMsg.C2S_OpenServerRank_8815.getDefaultInstance();
         }

         public C2S_OpenServerRank_8815 build() {
            C2S_OpenServerRank_8815 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenServerRank_8815 buildPartial() {
            C2S_OpenServerRank_8815 result = new C2S_OpenServerRank_8815(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.moduleId_ = this.moduleId_;
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
            if (other instanceof C2S_OpenServerRank_8815) {
               return this.mergeFrom((C2S_OpenServerRank_8815)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenServerRank_8815 other) {
            if (other == RankMsg.C2S_OpenServerRank_8815.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasModuleId()) {
                  this.setModuleId(other.getModuleId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasModuleId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_OpenServerRank_8815 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenServerRank_8815)RankMsg.C2S_OpenServerRank_8815.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenServerRank_8815)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasModuleId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getModuleId() {
            return this.moduleId_;
         }

         public Builder setModuleId(int value) {
            this.bitField0_ |= 1;
            this.moduleId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModuleId() {
            this.bitField0_ &= -2;
            this.moduleId_ = 0;
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

   public static final class S2C_OpenServerRank_8816 extends GeneratedMessageV3 implements S2C_OpenServerRank_8816OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MODULEID_FIELD_NUMBER = 1;
      private int moduleId_;
      public static final int MYRANK_FIELD_NUMBER = 2;
      private RankData myRank_;
      public static final int RANKS_FIELD_NUMBER = 3;
      private List<RankData> ranks_;
      public static final int TIME_FIELD_NUMBER = 4;
      private int time_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenServerRank_8816 DEFAULT_INSTANCE = new S2C_OpenServerRank_8816();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenServerRank_8816> PARSER = new AbstractParser<S2C_OpenServerRank_8816>() {
         public S2C_OpenServerRank_8816 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenServerRank_8816(input, extensionRegistry);
         }
      };

      private S2C_OpenServerRank_8816(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenServerRank_8816() {
         this.memoizedIsInitialized = -1;
         this.ranks_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenServerRank_8816();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenServerRank_8816(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.moduleId_ = input.readInt32();
                        break;
                     case 18:
                        RankData.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.myRank_.toBuilder();
                        }

                        this.myRank_ = (RankData)input.readMessage(RankMsg.RankData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.myRank_);
                           this.myRank_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.ranks_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.ranks_.add(input.readMessage(RankMsg.RankData.PARSER, extensionRegistry));
                        break;
                     case 32:
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
               if ((mutable_bitField0_ & 4) != 0) {
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_OpenServerRank_8816_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_OpenServerRank_8816_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenServerRank_8816.class, Builder.class);
      }

      public boolean hasModuleId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getModuleId() {
         return this.moduleId_;
      }

      public boolean hasMyRank() {
         return (this.bitField0_ & 2) != 0;
      }

      public RankData getMyRank() {
         return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
      }

      public RankDataOrBuilder getMyRankOrBuilder() {
         return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
      }

      public List<RankData> getRanksList() {
         return this.ranks_;
      }

      public List<? extends RankDataOrBuilder> getRanksOrBuilderList() {
         return this.ranks_;
      }

      public int getRanksCount() {
         return this.ranks_.size();
      }

      public RankData getRanks(int index) {
         return (RankData)this.ranks_.get(index);
      }

      public RankDataOrBuilder getRanksOrBuilder(int index) {
         return (RankDataOrBuilder)this.ranks_.get(index);
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
         } else if (!this.hasModuleId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasMyRank() && !this.getMyRank().isInitialized()) {
            this.memoizedIsInitialized = 0;
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
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.moduleId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getMyRank());
         }

         for(int i = 0; i < this.ranks_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.ranks_.get(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.time_);
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
               size += CodedOutputStream.computeInt32Size(1, this.moduleId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getMyRank());
            }

            for(int i = 0; i < this.ranks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.ranks_.get(i));
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.time_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OpenServerRank_8816)) {
            return super.equals(obj);
         } else {
            S2C_OpenServerRank_8816 other = (S2C_OpenServerRank_8816)obj;
            if (this.hasModuleId() != other.hasModuleId()) {
               return false;
            } else if (this.hasModuleId() && this.getModuleId() != other.getModuleId()) {
               return false;
            } else if (this.hasMyRank() != other.hasMyRank()) {
               return false;
            } else if (this.hasMyRank() && !this.getMyRank().equals(other.getMyRank())) {
               return false;
            } else if (!this.getRanksList().equals(other.getRanksList())) {
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
            if (this.hasModuleId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getModuleId();
            }

            if (this.hasMyRank()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMyRank().hashCode();
            }

            if (this.getRanksCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRanksList().hashCode();
            }

            if (this.hasTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OpenServerRank_8816 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenServerRank_8816)PARSER.parseFrom(data);
      }

      public static S2C_OpenServerRank_8816 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenServerRank_8816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenServerRank_8816 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenServerRank_8816)PARSER.parseFrom(data);
      }

      public static S2C_OpenServerRank_8816 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenServerRank_8816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenServerRank_8816 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenServerRank_8816)PARSER.parseFrom(data);
      }

      public static S2C_OpenServerRank_8816 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenServerRank_8816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenServerRank_8816 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenServerRank_8816)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenServerRank_8816 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenServerRank_8816)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenServerRank_8816 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenServerRank_8816)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenServerRank_8816 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenServerRank_8816)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenServerRank_8816 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenServerRank_8816)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenServerRank_8816 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenServerRank_8816)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenServerRank_8816 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenServerRank_8816 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenServerRank_8816> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenServerRank_8816> getParserForType() {
         return PARSER;
      }

      public S2C_OpenServerRank_8816 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenServerRank_8816OrBuilder {
         private int bitField0_;
         private int moduleId_;
         private RankData myRank_;
         private SingleFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> myRankBuilder_;
         private List<RankData> ranks_;
         private RepeatedFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> ranksBuilder_;
         private int time_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_OpenServerRank_8816_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_OpenServerRank_8816_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenServerRank_8816.class, Builder.class);
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
            if (RankMsg.S2C_OpenServerRank_8816.alwaysUseFieldBuilders) {
               this.getMyRankFieldBuilder();
               this.getRanksFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.moduleId_ = 0;
            this.bitField0_ &= -2;
            if (this.myRankBuilder_ == null) {
               this.myRank_ = null;
            } else {
               this.myRankBuilder_.clear();
            }

            this.bitField0_ &= -3;
            if (this.ranksBuilder_ == null) {
               this.ranks_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.ranksBuilder_.clear();
            }

            this.time_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_OpenServerRank_8816_descriptor;
         }

         public S2C_OpenServerRank_8816 getDefaultInstanceForType() {
            return RankMsg.S2C_OpenServerRank_8816.getDefaultInstance();
         }

         public S2C_OpenServerRank_8816 build() {
            S2C_OpenServerRank_8816 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenServerRank_8816 buildPartial() {
            S2C_OpenServerRank_8816 result = new S2C_OpenServerRank_8816(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.moduleId_ = this.moduleId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.myRankBuilder_ == null) {
                  result.myRank_ = this.myRank_;
               } else {
                  result.myRank_ = (RankData)this.myRankBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if (this.ranksBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
                  this.bitField0_ &= -5;
               }

               result.ranks_ = this.ranks_;
            } else {
               result.ranks_ = this.ranksBuilder_.build();
            }

            if ((from_bitField0_ & 8) != 0) {
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
            if (other instanceof S2C_OpenServerRank_8816) {
               return this.mergeFrom((S2C_OpenServerRank_8816)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenServerRank_8816 other) {
            if (other == RankMsg.S2C_OpenServerRank_8816.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasModuleId()) {
                  this.setModuleId(other.getModuleId());
               }

               if (other.hasMyRank()) {
                  this.mergeMyRank(other.getMyRank());
               }

               if (this.ranksBuilder_ == null) {
                  if (!other.ranks_.isEmpty()) {
                     if (this.ranks_.isEmpty()) {
                        this.ranks_ = other.ranks_;
                        this.bitField0_ &= -5;
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
                     this.bitField0_ &= -5;
                     this.ranksBuilder_ = RankMsg.S2C_OpenServerRank_8816.alwaysUseFieldBuilders ? this.getRanksFieldBuilder() : null;
                  } else {
                     this.ranksBuilder_.addAllMessages(other.ranks_);
                  }
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
            if (!this.hasModuleId()) {
               return false;
            } else if (this.hasMyRank() && !this.getMyRank().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getRanksCount(); ++i) {
                  if (!this.getRanks(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OpenServerRank_8816 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenServerRank_8816)RankMsg.S2C_OpenServerRank_8816.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenServerRank_8816)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasModuleId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getModuleId() {
            return this.moduleId_;
         }

         public Builder setModuleId(int value) {
            this.bitField0_ |= 1;
            this.moduleId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModuleId() {
            this.bitField0_ &= -2;
            this.moduleId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMyRank() {
            return (this.bitField0_ & 2) != 0;
         }

         public RankData getMyRank() {
            if (this.myRankBuilder_ == null) {
               return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
            } else {
               return (RankData)this.myRankBuilder_.getMessage();
            }
         }

         public Builder setMyRank(RankData value) {
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

         public Builder setMyRank(RankData.Builder builderForValue) {
            if (this.myRankBuilder_ == null) {
               this.myRank_ = builderForValue.build();
               this.onChanged();
            } else {
               this.myRankBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeMyRank(RankData value) {
            if (this.myRankBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.myRank_ != null && this.myRank_ != RankMsg.RankData.getDefaultInstance()) {
                  this.myRank_ = RankMsg.RankData.newBuilder(this.myRank_).mergeFrom(value).buildPartial();
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

         public RankData.Builder getMyRankBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (RankData.Builder)this.getMyRankFieldBuilder().getBuilder();
         }

         public RankDataOrBuilder getMyRankOrBuilder() {
            if (this.myRankBuilder_ != null) {
               return (RankDataOrBuilder)this.myRankBuilder_.getMessageOrBuilder();
            } else {
               return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
            }
         }

         private SingleFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> getMyRankFieldBuilder() {
            if (this.myRankBuilder_ == null) {
               this.myRankBuilder_ = new SingleFieldBuilderV3(this.getMyRank(), this.getParentForChildren(), this.isClean());
               this.myRank_ = null;
            }

            return this.myRankBuilder_;
         }

         private void ensureRanksIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.ranks_ = new ArrayList(this.ranks_);
               this.bitField0_ |= 4;
            }

         }

         public List<RankData> getRanksList() {
            return this.ranksBuilder_ == null ? Collections.unmodifiableList(this.ranks_) : this.ranksBuilder_.getMessageList();
         }

         public int getRanksCount() {
            return this.ranksBuilder_ == null ? this.ranks_.size() : this.ranksBuilder_.getCount();
         }

         public RankData getRanks(int index) {
            return this.ranksBuilder_ == null ? (RankData)this.ranks_.get(index) : (RankData)this.ranksBuilder_.getMessage(index);
         }

         public Builder setRanks(int index, RankData value) {
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

         public Builder setRanks(int index, RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(RankData value) {
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

         public Builder addRanks(int index, RankData value) {
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

         public Builder addRanks(RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(int index, RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRanks(Iterable<? extends RankData> values) {
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
               this.bitField0_ &= -5;
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

         public RankData.Builder getRanksBuilder(int index) {
            return (RankData.Builder)this.getRanksFieldBuilder().getBuilder(index);
         }

         public RankDataOrBuilder getRanksOrBuilder(int index) {
            return this.ranksBuilder_ == null ? (RankDataOrBuilder)this.ranks_.get(index) : (RankDataOrBuilder)this.ranksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankDataOrBuilder> getRanksOrBuilderList() {
            return this.ranksBuilder_ != null ? this.ranksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.ranks_);
         }

         public RankData.Builder addRanksBuilder() {
            return (RankData.Builder)this.getRanksFieldBuilder().addBuilder(RankMsg.RankData.getDefaultInstance());
         }

         public RankData.Builder addRanksBuilder(int index) {
            return (RankData.Builder)this.getRanksFieldBuilder().addBuilder(index, RankMsg.RankData.getDefaultInstance());
         }

         public List<RankData.Builder> getRanksBuilderList() {
            return this.getRanksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> getRanksFieldBuilder() {
            if (this.ranksBuilder_ == null) {
               this.ranksBuilder_ = new RepeatedFieldBuilderV3(this.ranks_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.ranks_ = null;
            }

            return this.ranksBuilder_;
         }

         public boolean hasTime() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getTime() {
            return this.time_;
         }

         public Builder setTime(int value) {
            this.bitField0_ |= 8;
            this.time_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTime() {
            this.bitField0_ &= -9;
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

   public static final class C2S_RankRewardOneKey_8817 extends GeneratedMessageV3 implements C2S_RankRewardOneKey_8817OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_RankRewardOneKey_8817 DEFAULT_INSTANCE = new C2S_RankRewardOneKey_8817();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RankRewardOneKey_8817> PARSER = new AbstractParser<C2S_RankRewardOneKey_8817>() {
         public C2S_RankRewardOneKey_8817 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RankRewardOneKey_8817(input, extensionRegistry);
         }
      };

      private C2S_RankRewardOneKey_8817(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RankRewardOneKey_8817() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RankRewardOneKey_8817();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RankRewardOneKey_8817(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_RankRewardOneKey_8817_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_RankRewardOneKey_8817_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RankRewardOneKey_8817.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RankRewardOneKey_8817)) {
            return super.equals(obj);
         } else {
            C2S_RankRewardOneKey_8817 other = (C2S_RankRewardOneKey_8817)obj;
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

      public static C2S_RankRewardOneKey_8817 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RankRewardOneKey_8817)PARSER.parseFrom(data);
      }

      public static C2S_RankRewardOneKey_8817 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RankRewardOneKey_8817)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RankRewardOneKey_8817 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RankRewardOneKey_8817)PARSER.parseFrom(data);
      }

      public static C2S_RankRewardOneKey_8817 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RankRewardOneKey_8817)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RankRewardOneKey_8817 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RankRewardOneKey_8817)PARSER.parseFrom(data);
      }

      public static C2S_RankRewardOneKey_8817 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RankRewardOneKey_8817)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RankRewardOneKey_8817 parseFrom(InputStream input) throws IOException {
         return (C2S_RankRewardOneKey_8817)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RankRewardOneKey_8817 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RankRewardOneKey_8817)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RankRewardOneKey_8817 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RankRewardOneKey_8817)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RankRewardOneKey_8817 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RankRewardOneKey_8817)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RankRewardOneKey_8817 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RankRewardOneKey_8817)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RankRewardOneKey_8817 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RankRewardOneKey_8817)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RankRewardOneKey_8817 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RankRewardOneKey_8817 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RankRewardOneKey_8817> parser() {
         return PARSER;
      }

      public Parser<C2S_RankRewardOneKey_8817> getParserForType() {
         return PARSER;
      }

      public C2S_RankRewardOneKey_8817 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RankRewardOneKey_8817OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_RankRewardOneKey_8817_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_RankRewardOneKey_8817_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RankRewardOneKey_8817.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RankMsg.C2S_RankRewardOneKey_8817.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_C2S_RankRewardOneKey_8817_descriptor;
         }

         public C2S_RankRewardOneKey_8817 getDefaultInstanceForType() {
            return RankMsg.C2S_RankRewardOneKey_8817.getDefaultInstance();
         }

         public C2S_RankRewardOneKey_8817 build() {
            C2S_RankRewardOneKey_8817 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RankRewardOneKey_8817 buildPartial() {
            C2S_RankRewardOneKey_8817 result = new C2S_RankRewardOneKey_8817(this);
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
            if (other instanceof C2S_RankRewardOneKey_8817) {
               return this.mergeFrom((C2S_RankRewardOneKey_8817)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RankRewardOneKey_8817 other) {
            if (other == RankMsg.C2S_RankRewardOneKey_8817.getDefaultInstance()) {
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
            C2S_RankRewardOneKey_8817 parsedMessage = null;

            try {
               parsedMessage = (C2S_RankRewardOneKey_8817)RankMsg.C2S_RankRewardOneKey_8817.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RankRewardOneKey_8817)e.getUnfinishedMessage();
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

   public static final class S2C_RankRewardOneKey_8818 extends GeneratedMessageV3 implements S2C_RankRewardOneKey_8818OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int ID_FIELD_NUMBER = 2;
      private Internal.IntList id_;
      private byte memoizedIsInitialized;
      private static final S2C_RankRewardOneKey_8818 DEFAULT_INSTANCE = new S2C_RankRewardOneKey_8818();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RankRewardOneKey_8818> PARSER = new AbstractParser<S2C_RankRewardOneKey_8818>() {
         public S2C_RankRewardOneKey_8818 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RankRewardOneKey_8818(input, extensionRegistry);
         }
      };

      private S2C_RankRewardOneKey_8818(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RankRewardOneKey_8818() {
         this.memoizedIsInitialized = -1;
         this.id_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RankRewardOneKey_8818();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RankRewardOneKey_8818(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.id_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.id_.addInt(input.readInt32());
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
                  this.id_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_RankRewardOneKey_8818_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_RankRewardOneKey_8818_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RankRewardOneKey_8818.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public List<Integer> getIdList() {
         return this.id_;
      }

      public int getIdCount() {
         return this.id_.size();
      }

      public int getId(int index) {
         return this.id_.getInt(index);
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

         for(int i = 0; i < this.id_.size(); ++i) {
            output.writeInt32(2, this.id_.getInt(i));
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

            for(int i = 0; i < this.id_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.id_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RankRewardOneKey_8818)) {
            return super.equals(obj);
         } else {
            S2C_RankRewardOneKey_8818 other = (S2C_RankRewardOneKey_8818)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (!this.getIdList().equals(other.getIdList())) {
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

            if (this.getIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RankRewardOneKey_8818 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RankRewardOneKey_8818)PARSER.parseFrom(data);
      }

      public static S2C_RankRewardOneKey_8818 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RankRewardOneKey_8818)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RankRewardOneKey_8818 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RankRewardOneKey_8818)PARSER.parseFrom(data);
      }

      public static S2C_RankRewardOneKey_8818 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RankRewardOneKey_8818)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RankRewardOneKey_8818 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RankRewardOneKey_8818)PARSER.parseFrom(data);
      }

      public static S2C_RankRewardOneKey_8818 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RankRewardOneKey_8818)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RankRewardOneKey_8818 parseFrom(InputStream input) throws IOException {
         return (S2C_RankRewardOneKey_8818)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RankRewardOneKey_8818 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RankRewardOneKey_8818)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RankRewardOneKey_8818 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RankRewardOneKey_8818)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RankRewardOneKey_8818 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RankRewardOneKey_8818)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RankRewardOneKey_8818 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RankRewardOneKey_8818)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RankRewardOneKey_8818 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RankRewardOneKey_8818)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RankRewardOneKey_8818 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RankRewardOneKey_8818 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RankRewardOneKey_8818> parser() {
         return PARSER;
      }

      public Parser<S2C_RankRewardOneKey_8818> getParserForType() {
         return PARSER;
      }

      public S2C_RankRewardOneKey_8818 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RankRewardOneKey_8818OrBuilder {
         private int bitField0_;
         private int type_;
         private Internal.IntList id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_RankRewardOneKey_8818_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_RankRewardOneKey_8818_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RankRewardOneKey_8818.class, Builder.class);
         }

         private Builder() {
            this.id_ = RankMsg.S2C_RankRewardOneKey_8818.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.id_ = RankMsg.S2C_RankRewardOneKey_8818.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RankMsg.S2C_RankRewardOneKey_8818.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.id_ = RankMsg.S2C_RankRewardOneKey_8818.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RankMsg.internal_static_rank_com_gzbz_protobuf_S2C_RankRewardOneKey_8818_descriptor;
         }

         public S2C_RankRewardOneKey_8818 getDefaultInstanceForType() {
            return RankMsg.S2C_RankRewardOneKey_8818.getDefaultInstance();
         }

         public S2C_RankRewardOneKey_8818 build() {
            S2C_RankRewardOneKey_8818 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RankRewardOneKey_8818 buildPartial() {
            S2C_RankRewardOneKey_8818 result = new S2C_RankRewardOneKey_8818(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.id_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.id_ = this.id_;
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
            if (other instanceof S2C_RankRewardOneKey_8818) {
               return this.mergeFrom((S2C_RankRewardOneKey_8818)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RankRewardOneKey_8818 other) {
            if (other == RankMsg.S2C_RankRewardOneKey_8818.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (!other.id_.isEmpty()) {
                  if (this.id_.isEmpty()) {
                     this.id_ = other.id_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureIdIsMutable();
                     this.id_.addAll(other.id_);
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
            S2C_RankRewardOneKey_8818 parsedMessage = null;

            try {
               parsedMessage = (S2C_RankRewardOneKey_8818)RankMsg.S2C_RankRewardOneKey_8818.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RankRewardOneKey_8818)e.getUnfinishedMessage();
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

         private void ensureIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.id_ = RankMsg.S2C_RankRewardOneKey_8818.mutableCopy(this.id_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.id_) : this.id_);
         }

         public int getIdCount() {
            return this.id_.size();
         }

         public int getId(int index) {
            return this.id_.getInt(index);
         }

         public Builder setId(int index, int value) {
            this.ensureIdIsMutable();
            this.id_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addId(int value) {
            this.ensureIdIsMutable();
            this.id_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllId(Iterable<? extends Integer> values) {
            this.ensureIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.id_);
            this.onChanged();
            return this;
         }

         public Builder clearId() {
            this.id_ = RankMsg.S2C_RankRewardOneKey_8818.emptyIntList();
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

   public interface C2S_KindsOfRank_8807OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenServerRank_8815OrBuilder extends MessageOrBuilder {
      boolean hasModuleId();

      int getModuleId();
   }

   public interface C2S_RankModule_8809OrBuilder extends MessageOrBuilder {
      boolean hasModuleId();

      int getModuleId();

      List<String> getParamsList();

      int getParamsCount();

      String getParams(int index);

      ByteString getParamsBytes(int index);

      boolean hasLimit();

      int getLimit();
   }

   public interface C2S_RankRewardInfo_8811OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_RankRewardOneKey_8817OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_RankReward_8813OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_TrainingRank_8803OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_UnionCopyRank_8801OrBuilder extends MessageOrBuilder {
      boolean hasCopyId();

      int getCopyId();
   }

   public interface RankDataOrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasScore();

      long getScore();

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

      List<PlayerMsg.PropertyCell> getPlayerInfosList();

      PlayerMsg.PropertyCell getPlayerInfos(int index);

      int getPlayerInfosCount();

      List<? extends PlayerMsg.PropertyCellOrBuilder> getPlayerInfosOrBuilderList();

      PlayerMsg.PropertyCellOrBuilder getPlayerInfosOrBuilder(int index);

      boolean hasServerId();

      int getServerId();

      boolean hasUnionName();

      String getUnionName();

      ByteString getUnionNameBytes();

      boolean hasUnionId();

      int getUnionId();

      boolean hasHeroInfo();

      CommonMsg.HeroInfo getHeroInfo();

      CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder();

      boolean hasFirstYearTreasureNum();

      long getFirstYearTreasureNum();

      boolean hasChineseNewYearTreasureNum();

      long getChineseNewYearTreasureNum();
   }

   public interface RankRewardDataOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      List<RankData> getRankDataList();

      RankData getRankData(int index);

      int getRankDataCount();

      List<? extends RankDataOrBuilder> getRankDataOrBuilderList();

      RankDataOrBuilder getRankDataOrBuilder(int index);

      boolean hasIsGot();

      boolean getIsGot();
   }

   public interface RankUnionDataOrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasScore();

      long getScore();

      boolean hasUnionId();

      int getUnionId();

      boolean hasHead();

      int getHead();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasUnionName();

      String getUnionName();

      ByteString getUnionNameBytes();

      boolean hasLevel();

      int getLevel();

      boolean hasLeaderId();

      int getLeaderId();

      boolean hasLeaderName();

      String getLeaderName();

      ByteString getLeaderNameBytes();

      boolean hasCount();

      int getCount();

      boolean hasUnionHead();

      int getUnionHead();

      boolean hasCurUnionAddNumberId();

      int getCurUnionAddNumberId();
   }

   public interface S2C_KindsOfRank_8808OrBuilder extends MessageOrBuilder {
      List<TypeRanks> getTypeRanksList();

      TypeRanks getTypeRanks(int index);

      int getTypeRanksCount();

      List<? extends TypeRanksOrBuilder> getTypeRanksOrBuilderList();

      TypeRanksOrBuilder getTypeRanksOrBuilder(int index);

      boolean hasUnionName();

      String getUnionName();

      ByteString getUnionNameBytes();

      boolean hasUnionHead();

      int getUnionHead();
   }

   public interface S2C_OpenServerRank_8816OrBuilder extends MessageOrBuilder {
      boolean hasModuleId();

      int getModuleId();

      boolean hasMyRank();

      RankData getMyRank();

      RankDataOrBuilder getMyRankOrBuilder();

      List<RankData> getRanksList();

      RankData getRanks(int index);

      int getRanksCount();

      List<? extends RankDataOrBuilder> getRanksOrBuilderList();

      RankDataOrBuilder getRanksOrBuilder(int index);

      boolean hasTime();

      int getTime();
   }

   public interface S2C_RankModule_8810OrBuilder extends MessageOrBuilder {
      boolean hasModuleId();

      int getModuleId();

      boolean hasMyRank();

      RankData getMyRank();

      RankDataOrBuilder getMyRankOrBuilder();

      List<RankData> getRanksList();

      RankData getRanks(int index);

      int getRanksCount();

      List<? extends RankDataOrBuilder> getRanksOrBuilderList();

      RankDataOrBuilder getRanksOrBuilder(int index);

      boolean hasMyUnionRank();

      RankUnionData getMyUnionRank();

      RankUnionDataOrBuilder getMyUnionRankOrBuilder();

      List<RankUnionData> getUnionRanksList();

      RankUnionData getUnionRanks(int index);

      int getUnionRanksCount();

      List<? extends RankUnionDataOrBuilder> getUnionRanksOrBuilderList();

      RankUnionDataOrBuilder getUnionRanksOrBuilder(int index);

      List<String> getParamsList();

      int getParamsCount();

      String getParams(int index);

      ByteString getParamsBytes(int index);
   }

   public interface S2C_RankRewardInfo_8812OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      List<RankRewardData> getRewardDataListList();

      RankRewardData getRewardDataList(int index);

      int getRewardDataListCount();

      List<? extends RankRewardDataOrBuilder> getRewardDataListOrBuilderList();

      RankRewardDataOrBuilder getRewardDataListOrBuilder(int index);
   }

   public interface S2C_RankRewardOneKey_8818OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      List<Integer> getIdList();

      int getIdCount();

      int getId(int index);
   }

   public interface S2C_RankReward_8814OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_TrainingRank_8804OrBuilder extends MessageOrBuilder {
      List<RankData> getRanksList();

      RankData getRanks(int index);

      int getRanksCount();

      List<? extends RankDataOrBuilder> getRanksOrBuilderList();

      RankDataOrBuilder getRanksOrBuilder(int index);

      boolean hasMyRank();

      RankData getMyRank();

      RankDataOrBuilder getMyRankOrBuilder();
   }

   public interface S2C_UnionCopyRank_8802OrBuilder extends MessageOrBuilder {
      List<RankData> getRanksList();

      RankData getRanks(int index);

      int getRanksCount();

      List<? extends RankDataOrBuilder> getRanksOrBuilderList();

      RankDataOrBuilder getRanksOrBuilder(int index);

      boolean hasMyRank();

      RankData getMyRank();

      RankDataOrBuilder getMyRankOrBuilder();

      boolean hasCopyId();

      int getCopyId();

      List<RankData> getPreRanksList();

      RankData getPreRanks(int index);

      int getPreRanksCount();

      List<? extends RankDataOrBuilder> getPreRanksOrBuilderList();

      RankDataOrBuilder getPreRanksOrBuilder(int index);
   }

   public interface TypeRanksOrBuilder extends MessageOrBuilder {
      boolean hasModuleId();

      int getModuleId();

      List<RankData> getRandsList();

      RankData getRands(int index);

      int getRandsCount();

      List<? extends RankDataOrBuilder> getRandsOrBuilderList();

      RankDataOrBuilder getRandsOrBuilder(int index);

      boolean hasType();

      SubType getType();
   }
}
