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

public final class CrossDemonStrikesMsg {
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_DemonStrikes_14101_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_DemonStrikes_14101_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_DemonStrikes_14102_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_DemonStrikes_14102_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_MapInfo_14103_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_MapInfo_14103_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_CityHoldInfo_14104_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_CityHoldInfo_14104_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_MoveCity_14106_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_MoveCity_14106_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_MoveCity_14107_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_MoveCity_14107_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_TransferList_14108_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_TransferList_14108_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Transfer_14109_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Transfer_14109_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_Transfer_14110_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_Transfer_14110_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Rank_14111_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Rank_14111_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Logs_14112_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Logs_14112_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_CityReward_14113_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_CityReward_14113_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_CityReward_14114_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_CityReward_14114_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_AttackNpc_14115_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_AttackNpc_14115_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_AttackNpc_14116_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_AttackNpc_14116_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_LuckyMain_14117_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_LuckyMain_14117_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_LuckyReward_14118_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_LuckyReward_14118_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_LuckyReward_14119_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_LuckyReward_14119_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_CityChangeNotify_14120_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_CityChangeNotify_14120_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_UploadPlayerData_14121_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_UploadPlayerData_14121_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_NpcAtkPLayer_14122_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_NpcAtkPLayer_14122_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_HasRewardNotify_14123_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_HasRewardNotify_14123_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_MapInfo_14124_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_MapInfo_14124_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_GM_14125_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_GM_14125_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_BuyRandomItem_14126_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_BuyRandomItem_14126_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_RankSettleData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_RankSettleData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_RankReward_14127_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_RankReward_14127_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_BeTransfer_14128_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_BeTransfer_14128_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private CrossDemonStrikesMsg() {
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
      String[] descriptorData = new String[]{"\n\u0017CrossDemonStrikes.proto\u0012#crossDemonStrikes.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u0010CountryWar.proto\u001a\u0012DemonStrikes.proto\u001a\fBattle.proto\"\u0019\n\u0017S2CR_DemonStrikes_14101\"\u009c\u0001\n\u0017CR2S_DemonStrikes_14102\u0012:\n\u0005state\u0018\u0001 \u0002(\u000e2+.demonStrikes.com.gzbz.protobuf.SystemState\u0012\u0011\n\tstartTime\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0003 \u0002(\u0005\u0012\r\n\u0005mapId\u0018\u0004 \u0002(\u0005\u0012\u0012\n\nrewardTime\u0018\u0005 \u0002(\u0005\"\u0014\n\u0012S2CR_MapInfo_14103\"N\n\u0017S2CR_CityHoldInfo_14104\u0012\u000e\n\u0006cityId\u0018\u0001 \u0002(\u0005\u0012#\n\tpageParam\u0018\u0002 \u0002(\u000b2\u0010.common.PageInfo\"6\n\u0013S2CR_MoveCity_14106\u0012\u000e\n\u0006cityId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007moveNum\u0018\u0002 \u0002(\u0005\"6\n\u0013CR2S_MoveCity_14107\u0012\u000e\n\u0006cityId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007needFee\u0018\u0002 \u0002(\b\"L\n\u0017S2CR_TransferList_14108\u0012\r\n\u0005power\u0018\u0001 \u0002(\u0003\u0012\"\n\bpageInfo\u0018\u0002 \u0002(\u000b2\u0010.common.PageInfo\"X\n\u0013S2CR_Transfer_14109\u0012\u000e\n\u0006cityId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006atkNum\u0018\u0003 \u0002(\u0005\u0012\u000f\n\u0007moveNum\u0018\u0004 \u0002(\u0005\"\u009e\u0001\n\u0013CR2S_Transfer_14110\u0012\u000e\n\u0006cityId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\u0011\n\tatkNumFee\u0018\u0003 \u0002(\u0005\u0012\u0012\n\nmoveNumFee\u0018\u0004 \u0002(\u0005\u0012>\n\u0006result\u0018\u0005 \u0002(\u000e2..demonStrikes.com.gzbz.protobuf.TransferResult\"Q\n\u000fS2CR_Rank_14111\u0012>\n\u0006params\u0018\u0001 \u0002(\u000b2..demonStrikes.com.gzbz.protobuf.C2S_Rank_13919\"\u0011\n\u000fS2CR_Logs_14112\"\u0017\n\u0015S2CR_CityReward_14113\"c\n\u0015CR2S_CityReward_14114\u0012!\n\u0006reward\u0018\u0001 \u0003(\u000b2\u0011.common.MapDataII\u0012'\n\frandomReward\u0018\u0002 \u0003(\u000b2\u0011.common.MapDataII\"3\n\u0014S2CR_AttackNpc_14115\u0012\u000e\n\u0006cityId\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003uid\u0018\u0002 \u0002(\u0005\"Ö\u0001\n\u0014CR2S_AttackNpc_14116\u0012\u000e\n\u0006cityId\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003uid\u0018\u0002 \u0002(\u0005\u0012 \n\u0006reward\u0018\u0003 \u0003(\u000b2\u0010.common.ItemInfo\u0012?\n\u0006battle\u0018\u0004 \u0001(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\u0012>\n\u0006result\u0018\u0005 \u0002(\u000e2..crossDemonStrikes.com.gzbz.protobuf.AtkResult\"\u0016\n\u0014S2CR_LuckyMain_14117\"(\n\u0016S2CR_LuckyReward_14118\u0012\u000e\n\u0006record\u0018\u0001 \u0003(\t\"(\n\u0016CR2S_LuckyReward_14119\u0012\u000e\n\u0006record\u0018\u0001 \u0003(\t\"f\n\u001bCR2S_CityChangeNotify_14120\u0012G\n\u0003msg\u0018\u0001 \u0002(\u000b2:.demonStrikes.com.gzbz.protobuf.S2C_CityChangeNotify_13912\"/\n\u001bS2CR_UploadPlayerData_14121\u0012\u0010\n\barraying\u0018\u0001 \u0002(\f\"Z\n\u0017CR2S_NpcAtkPLayer_14122\u0012?\n\u0006battle\u0018\u0001 \u0002(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\"0\n\u001aCR2S_HasRewardNotify_14123\u0012\u0012\n\nrewardTime\u0018\u0001 \u0002(\u0005\"\\\n\u0012CR2S_MapInfo_14124\u0012\u000e\n\u0006inCity\u0018\u0001 \u0002(\u0005\u00126\n\u0004city\u0018\u0002 \u0003(\u000b2(.demonStrikes.com.gzbz.protobuf.CityInfo\",\n\rS2CR_GM_14125\u0012\u000b\n\u0003cmd\u0018\u0001 \u0002(\t\u0012\u000e\n\u0006params\u0018\u0002 \u0003(\u0003\"9\n\u0018S2CR_BuyRandomItem_14126\u0012\r\n\u0005buyId\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006buyNum\u0018\u0002 \u0002(\u0005\"K\n\u000eRankSettleData\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012'\n\frankTypeData\u0018\u0002 \u0003(\u000b2\u0011.common.MapDataII\"r\n\u0015CR2S_RankReward_14127\u0012\u0012\n\nserverRank\u0018\u0001 \u0002(\u0005\u0012E\n\brankData\u0018\u0002 \u0003(\u000b23.crossDemonStrikes.com.gzbz.protobuf.RankSettleData\"º\u0001\n\u0015CR2S_BeTransfer_14128\u0012 \n\u0006reward\u0018\u0001 \u0003(\u000b2\u0010.common.ItemInfo\u0012>\n\u0006result\u0018\u0002 \u0002(\u000e2..demonStrikes.com.gzbz.protobuf.TransferResult\u0012?\n\u0006battle\u0018\u0003 \u0001(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102*6\n\tAtkResult\u0012\u000b\n\u0007ATK_SUC\u0010\u0001\u0012\f\n\bATK_FAIL\u0010\u0002\u0012\u000e\n\nATK_OCCUPY\u0010\u0003B+\n\u0011com.gzbz.protobufB\u0014CrossDemonStrikesMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), CountryWarMsg.getDescriptor(), DemonStrikesMsg.getDescriptor(), BattleMsg.getDescriptor()});
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_DemonStrikes_14101_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_DemonStrikes_14101_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_DemonStrikes_14101_descriptor, new String[0]);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_DemonStrikes_14102_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_DemonStrikes_14102_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_DemonStrikes_14102_descriptor, new String[]{"State", "StartTime", "EndTime", "MapId", "RewardTime"});
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_MapInfo_14103_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_MapInfo_14103_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_MapInfo_14103_descriptor, new String[0]);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_CityHoldInfo_14104_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_CityHoldInfo_14104_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_CityHoldInfo_14104_descriptor, new String[]{"CityId", "PageParam"});
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_MoveCity_14106_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_MoveCity_14106_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_MoveCity_14106_descriptor, new String[]{"CityId", "MoveNum"});
      internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_MoveCity_14107_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_MoveCity_14107_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_MoveCity_14107_descriptor, new String[]{"CityId", "NeedFee"});
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_TransferList_14108_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_TransferList_14108_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_TransferList_14108_descriptor, new String[]{"Power", "PageInfo"});
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Transfer_14109_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Transfer_14109_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Transfer_14109_descriptor, new String[]{"CityId", "PlayerId", "AtkNum", "MoveNum"});
      internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_Transfer_14110_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_Transfer_14110_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_Transfer_14110_descriptor, new String[]{"CityId", "PlayerId", "AtkNumFee", "MoveNumFee", "Result"});
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Rank_14111_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Rank_14111_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Rank_14111_descriptor, new String[]{"Params"});
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Logs_14112_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Logs_14112_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Logs_14112_descriptor, new String[0]);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_CityReward_14113_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_CityReward_14113_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_CityReward_14113_descriptor, new String[0]);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_CityReward_14114_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_CityReward_14114_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_CityReward_14114_descriptor, new String[]{"Reward", "RandomReward"});
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_AttackNpc_14115_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_AttackNpc_14115_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_AttackNpc_14115_descriptor, new String[]{"CityId", "Uid"});
      internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_AttackNpc_14116_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_AttackNpc_14116_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_AttackNpc_14116_descriptor, new String[]{"CityId", "Uid", "Reward", "Battle", "Result"});
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_LuckyMain_14117_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_LuckyMain_14117_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_LuckyMain_14117_descriptor, new String[0]);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_LuckyReward_14118_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_LuckyReward_14118_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_LuckyReward_14118_descriptor, new String[]{"Record"});
      internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_LuckyReward_14119_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_LuckyReward_14119_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_LuckyReward_14119_descriptor, new String[]{"Record"});
      internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_CityChangeNotify_14120_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_CityChangeNotify_14120_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_CityChangeNotify_14120_descriptor, new String[]{"Msg"});
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_UploadPlayerData_14121_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_UploadPlayerData_14121_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_UploadPlayerData_14121_descriptor, new String[]{"Arraying"});
      internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_NpcAtkPLayer_14122_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_NpcAtkPLayer_14122_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_NpcAtkPLayer_14122_descriptor, new String[]{"Battle"});
      internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_HasRewardNotify_14123_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_HasRewardNotify_14123_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_HasRewardNotify_14123_descriptor, new String[]{"RewardTime"});
      internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_MapInfo_14124_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_MapInfo_14124_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_MapInfo_14124_descriptor, new String[]{"InCity", "City"});
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_GM_14125_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_GM_14125_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_GM_14125_descriptor, new String[]{"Cmd", "Params"});
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_BuyRandomItem_14126_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_BuyRandomItem_14126_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_BuyRandomItem_14126_descriptor, new String[]{"BuyId", "BuyNum"});
      internal_static_crossDemonStrikes_com_gzbz_protobuf_RankSettleData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_RankSettleData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_RankSettleData_descriptor, new String[]{"PlayerId", "RankTypeData"});
      internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_RankReward_14127_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_RankReward_14127_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_RankReward_14127_descriptor, new String[]{"ServerRank", "RankData"});
      internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_BeTransfer_14128_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_BeTransfer_14128_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_BeTransfer_14128_descriptor, new String[]{"Reward", "Result", "Battle"});
      CommonMsg.getDescriptor();
      CountryWarMsg.getDescriptor();
      DemonStrikesMsg.getDescriptor();
      BattleMsg.getDescriptor();
   }

   public static enum AtkResult implements ProtocolMessageEnum {
      ATK_SUC(1),
      ATK_FAIL(2),
      ATK_OCCUPY(3);

      public static final int ATK_SUC_VALUE = 1;
      public static final int ATK_FAIL_VALUE = 2;
      public static final int ATK_OCCUPY_VALUE = 3;
      private static final Internal.EnumLiteMap<AtkResult> internalValueMap = new Internal.EnumLiteMap<AtkResult>() {
         public AtkResult findValueByNumber(int number) {
            return CrossDemonStrikesMsg.AtkResult.forNumber(number);
         }
      };
      private static final AtkResult[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static AtkResult valueOf(int value) {
         return forNumber(value);
      }

      public static AtkResult forNumber(int value) {
         switch (value) {
            case 1:
               return ATK_SUC;
            case 2:
               return ATK_FAIL;
            case 3:
               return ATK_OCCUPY;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<AtkResult> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)CrossDemonStrikesMsg.getDescriptor().getEnumTypes().get(0);
      }

      public static AtkResult valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private AtkResult(int value) {
         this.value = value;
      }
   }

   public static final class S2CR_DemonStrikes_14101 extends GeneratedMessageV3 implements S2CR_DemonStrikes_14101OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_DemonStrikes_14101 DEFAULT_INSTANCE = new S2CR_DemonStrikes_14101();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_DemonStrikes_14101> PARSER = new AbstractParser<S2CR_DemonStrikes_14101>() {
         public S2CR_DemonStrikes_14101 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_DemonStrikes_14101(input, extensionRegistry);
         }
      };

      private S2CR_DemonStrikes_14101(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_DemonStrikes_14101() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_DemonStrikes_14101();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_DemonStrikes_14101(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_DemonStrikes_14101_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_DemonStrikes_14101_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_DemonStrikes_14101.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_DemonStrikes_14101)) {
            return super.equals(obj);
         } else {
            S2CR_DemonStrikes_14101 other = (S2CR_DemonStrikes_14101)obj;
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

      public static S2CR_DemonStrikes_14101 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_DemonStrikes_14101)PARSER.parseFrom(data);
      }

      public static S2CR_DemonStrikes_14101 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DemonStrikes_14101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DemonStrikes_14101 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_DemonStrikes_14101)PARSER.parseFrom(data);
      }

      public static S2CR_DemonStrikes_14101 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DemonStrikes_14101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DemonStrikes_14101 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_DemonStrikes_14101)PARSER.parseFrom(data);
      }

      public static S2CR_DemonStrikes_14101 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DemonStrikes_14101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DemonStrikes_14101 parseFrom(InputStream input) throws IOException {
         return (S2CR_DemonStrikes_14101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_DemonStrikes_14101 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DemonStrikes_14101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_DemonStrikes_14101 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_DemonStrikes_14101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_DemonStrikes_14101 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DemonStrikes_14101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_DemonStrikes_14101 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_DemonStrikes_14101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_DemonStrikes_14101 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DemonStrikes_14101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_DemonStrikes_14101 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_DemonStrikes_14101 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_DemonStrikes_14101> parser() {
         return PARSER;
      }

      public Parser<S2CR_DemonStrikes_14101> getParserForType() {
         return PARSER;
      }

      public S2CR_DemonStrikes_14101 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_DemonStrikes_14101OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_DemonStrikes_14101_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_DemonStrikes_14101_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_DemonStrikes_14101.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.S2CR_DemonStrikes_14101.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_DemonStrikes_14101_descriptor;
         }

         public S2CR_DemonStrikes_14101 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.S2CR_DemonStrikes_14101.getDefaultInstance();
         }

         public S2CR_DemonStrikes_14101 build() {
            S2CR_DemonStrikes_14101 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_DemonStrikes_14101 buildPartial() {
            S2CR_DemonStrikes_14101 result = new S2CR_DemonStrikes_14101(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_DemonStrikes_14101) {
               return this.mergeFrom((S2CR_DemonStrikes_14101)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_DemonStrikes_14101 other) {
            if (other == CrossDemonStrikesMsg.S2CR_DemonStrikes_14101.getDefaultInstance()) {
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
            S2CR_DemonStrikes_14101 parsedMessage = null;

            try {
               parsedMessage = (S2CR_DemonStrikes_14101)CrossDemonStrikesMsg.S2CR_DemonStrikes_14101.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_DemonStrikes_14101)e.getUnfinishedMessage();
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

   public static final class CR2S_DemonStrikes_14102 extends GeneratedMessageV3 implements CR2S_DemonStrikes_14102OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STATE_FIELD_NUMBER = 1;
      private int state_;
      public static final int STARTTIME_FIELD_NUMBER = 2;
      private int startTime_;
      public static final int ENDTIME_FIELD_NUMBER = 3;
      private int endTime_;
      public static final int MAPID_FIELD_NUMBER = 4;
      private int mapId_;
      public static final int REWARDTIME_FIELD_NUMBER = 5;
      private int rewardTime_;
      private byte memoizedIsInitialized;
      private static final CR2S_DemonStrikes_14102 DEFAULT_INSTANCE = new CR2S_DemonStrikes_14102();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_DemonStrikes_14102> PARSER = new AbstractParser<CR2S_DemonStrikes_14102>() {
         public CR2S_DemonStrikes_14102 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_DemonStrikes_14102(input, extensionRegistry);
         }
      };

      private CR2S_DemonStrikes_14102(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_DemonStrikes_14102() {
         this.memoizedIsInitialized = -1;
         this.state_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_DemonStrikes_14102();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_DemonStrikes_14102(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        DemonStrikesMsg.SystemState value = DemonStrikesMsg.SystemState.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.state_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.startTime_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.endTime_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.mapId_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.rewardTime_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_DemonStrikes_14102_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_DemonStrikes_14102_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_DemonStrikes_14102.class, Builder.class);
      }

      public boolean hasState() {
         return (this.bitField0_ & 1) != 0;
      }

      public DemonStrikesMsg.SystemState getState() {
         DemonStrikesMsg.SystemState result = DemonStrikesMsg.SystemState.valueOf(this.state_);
         return result == null ? DemonStrikesMsg.SystemState.OPEN : result;
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public boolean hasMapId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getMapId() {
         return this.mapId_;
      }

      public boolean hasRewardTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getRewardTime() {
         return this.rewardTime_;
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
         } else if (!this.hasStartTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMapId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRewardTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.state_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.startTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.endTime_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.mapId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.rewardTime_);
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
               size += CodedOutputStream.computeEnumSize(1, this.state_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.startTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.endTime_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.mapId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.rewardTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_DemonStrikes_14102)) {
            return super.equals(obj);
         } else {
            CR2S_DemonStrikes_14102 other = (CR2S_DemonStrikes_14102)obj;
            if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.state_ != other.state_) {
               return false;
            } else if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (this.hasMapId() != other.hasMapId()) {
               return false;
            } else if (this.hasMapId() && this.getMapId() != other.getMapId()) {
               return false;
            } else if (this.hasRewardTime() != other.hasRewardTime()) {
               return false;
            } else if (this.hasRewardTime() && this.getRewardTime() != other.getRewardTime()) {
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
               hash = 53 * hash + this.state_;
            }

            if (this.hasStartTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStartTime();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.hasMapId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getMapId();
            }

            if (this.hasRewardTime()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getRewardTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_DemonStrikes_14102 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_DemonStrikes_14102)PARSER.parseFrom(data);
      }

      public static CR2S_DemonStrikes_14102 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_DemonStrikes_14102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_DemonStrikes_14102 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_DemonStrikes_14102)PARSER.parseFrom(data);
      }

      public static CR2S_DemonStrikes_14102 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_DemonStrikes_14102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_DemonStrikes_14102 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_DemonStrikes_14102)PARSER.parseFrom(data);
      }

      public static CR2S_DemonStrikes_14102 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_DemonStrikes_14102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_DemonStrikes_14102 parseFrom(InputStream input) throws IOException {
         return (CR2S_DemonStrikes_14102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_DemonStrikes_14102 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_DemonStrikes_14102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_DemonStrikes_14102 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_DemonStrikes_14102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_DemonStrikes_14102 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_DemonStrikes_14102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_DemonStrikes_14102 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_DemonStrikes_14102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_DemonStrikes_14102 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_DemonStrikes_14102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_DemonStrikes_14102 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_DemonStrikes_14102 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_DemonStrikes_14102> parser() {
         return PARSER;
      }

      public Parser<CR2S_DemonStrikes_14102> getParserForType() {
         return PARSER;
      }

      public CR2S_DemonStrikes_14102 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_DemonStrikes_14102OrBuilder {
         private int bitField0_;
         private int state_;
         private int startTime_;
         private int endTime_;
         private int mapId_;
         private int rewardTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_DemonStrikes_14102_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_DemonStrikes_14102_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_DemonStrikes_14102.class, Builder.class);
         }

         private Builder() {
            this.state_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.state_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.CR2S_DemonStrikes_14102.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.state_ = 1;
            this.bitField0_ &= -2;
            this.startTime_ = 0;
            this.bitField0_ &= -3;
            this.endTime_ = 0;
            this.bitField0_ &= -5;
            this.mapId_ = 0;
            this.bitField0_ &= -9;
            this.rewardTime_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_DemonStrikes_14102_descriptor;
         }

         public CR2S_DemonStrikes_14102 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.CR2S_DemonStrikes_14102.getDefaultInstance();
         }

         public CR2S_DemonStrikes_14102 build() {
            CR2S_DemonStrikes_14102 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_DemonStrikes_14102 buildPartial() {
            CR2S_DemonStrikes_14102 result = new CR2S_DemonStrikes_14102(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.state_ = this.state_;
            if ((from_bitField0_ & 2) != 0) {
               result.startTime_ = this.startTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.mapId_ = this.mapId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.rewardTime_ = this.rewardTime_;
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
            if (other instanceof CR2S_DemonStrikes_14102) {
               return this.mergeFrom((CR2S_DemonStrikes_14102)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_DemonStrikes_14102 other) {
            if (other == CrossDemonStrikesMsg.CR2S_DemonStrikes_14102.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasState()) {
                  this.setState(other.getState());
               }

               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasMapId()) {
                  this.setMapId(other.getMapId());
               }

               if (other.hasRewardTime()) {
                  this.setRewardTime(other.getRewardTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasState()) {
               return false;
            } else if (!this.hasStartTime()) {
               return false;
            } else if (!this.hasEndTime()) {
               return false;
            } else if (!this.hasMapId()) {
               return false;
            } else {
               return this.hasRewardTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_DemonStrikes_14102 parsedMessage = null;

            try {
               parsedMessage = (CR2S_DemonStrikes_14102)CrossDemonStrikesMsg.CR2S_DemonStrikes_14102.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_DemonStrikes_14102)e.getUnfinishedMessage();
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

         public DemonStrikesMsg.SystemState getState() {
            DemonStrikesMsg.SystemState result = DemonStrikesMsg.SystemState.valueOf(this.state_);
            return result == null ? DemonStrikesMsg.SystemState.OPEN : result;
         }

         public Builder setState(DemonStrikesMsg.SystemState value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.state_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearState() {
            this.bitField0_ &= -2;
            this.state_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasStartTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStartTime() {
            return this.startTime_;
         }

         public Builder setStartTime(int value) {
            this.bitField0_ |= 2;
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTime() {
            this.bitField0_ &= -3;
            this.startTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(int value) {
            this.bitField0_ |= 4;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -5;
            this.endTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMapId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getMapId() {
            return this.mapId_;
         }

         public Builder setMapId(int value) {
            this.bitField0_ |= 8;
            this.mapId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMapId() {
            this.bitField0_ &= -9;
            this.mapId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRewardTime() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getRewardTime() {
            return this.rewardTime_;
         }

         public Builder setRewardTime(int value) {
            this.bitField0_ |= 16;
            this.rewardTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardTime() {
            this.bitField0_ &= -17;
            this.rewardTime_ = 0;
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

   public static final class S2CR_MapInfo_14103 extends GeneratedMessageV3 implements S2CR_MapInfo_14103OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_MapInfo_14103 DEFAULT_INSTANCE = new S2CR_MapInfo_14103();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_MapInfo_14103> PARSER = new AbstractParser<S2CR_MapInfo_14103>() {
         public S2CR_MapInfo_14103 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_MapInfo_14103(input, extensionRegistry);
         }
      };

      private S2CR_MapInfo_14103(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_MapInfo_14103() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_MapInfo_14103();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_MapInfo_14103(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_MapInfo_14103_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_MapInfo_14103_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MapInfo_14103.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_MapInfo_14103)) {
            return super.equals(obj);
         } else {
            S2CR_MapInfo_14103 other = (S2CR_MapInfo_14103)obj;
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

      public static S2CR_MapInfo_14103 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_MapInfo_14103)PARSER.parseFrom(data);
      }

      public static S2CR_MapInfo_14103 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MapInfo_14103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MapInfo_14103 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_MapInfo_14103)PARSER.parseFrom(data);
      }

      public static S2CR_MapInfo_14103 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MapInfo_14103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MapInfo_14103 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_MapInfo_14103)PARSER.parseFrom(data);
      }

      public static S2CR_MapInfo_14103 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MapInfo_14103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MapInfo_14103 parseFrom(InputStream input) throws IOException {
         return (S2CR_MapInfo_14103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MapInfo_14103 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MapInfo_14103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MapInfo_14103 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_MapInfo_14103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_MapInfo_14103 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MapInfo_14103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MapInfo_14103 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_MapInfo_14103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MapInfo_14103 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MapInfo_14103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_MapInfo_14103 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_MapInfo_14103 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_MapInfo_14103> parser() {
         return PARSER;
      }

      public Parser<S2CR_MapInfo_14103> getParserForType() {
         return PARSER;
      }

      public S2CR_MapInfo_14103 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_MapInfo_14103OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_MapInfo_14103_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_MapInfo_14103_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MapInfo_14103.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.S2CR_MapInfo_14103.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_MapInfo_14103_descriptor;
         }

         public S2CR_MapInfo_14103 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.S2CR_MapInfo_14103.getDefaultInstance();
         }

         public S2CR_MapInfo_14103 build() {
            S2CR_MapInfo_14103 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_MapInfo_14103 buildPartial() {
            S2CR_MapInfo_14103 result = new S2CR_MapInfo_14103(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_MapInfo_14103) {
               return this.mergeFrom((S2CR_MapInfo_14103)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_MapInfo_14103 other) {
            if (other == CrossDemonStrikesMsg.S2CR_MapInfo_14103.getDefaultInstance()) {
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
            S2CR_MapInfo_14103 parsedMessage = null;

            try {
               parsedMessage = (S2CR_MapInfo_14103)CrossDemonStrikesMsg.S2CR_MapInfo_14103.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_MapInfo_14103)e.getUnfinishedMessage();
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

   public static final class S2CR_CityHoldInfo_14104 extends GeneratedMessageV3 implements S2CR_CityHoldInfo_14104OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CITYID_FIELD_NUMBER = 1;
      private int cityId_;
      public static final int PAGEPARAM_FIELD_NUMBER = 2;
      private CommonMsg.PageInfo pageParam_;
      private byte memoizedIsInitialized;
      private static final S2CR_CityHoldInfo_14104 DEFAULT_INSTANCE = new S2CR_CityHoldInfo_14104();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_CityHoldInfo_14104> PARSER = new AbstractParser<S2CR_CityHoldInfo_14104>() {
         public S2CR_CityHoldInfo_14104 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_CityHoldInfo_14104(input, extensionRegistry);
         }
      };

      private S2CR_CityHoldInfo_14104(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_CityHoldInfo_14104() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_CityHoldInfo_14104();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_CityHoldInfo_14104(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.cityId_ = input.readInt32();
                        break;
                     case 18:
                        CommonMsg.PageInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.pageParam_.toBuilder();
                        }

                        this.pageParam_ = (CommonMsg.PageInfo)input.readMessage(CommonMsg.PageInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.pageParam_);
                           this.pageParam_ = subBuilder.buildPartial();
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
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_CityHoldInfo_14104_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_CityHoldInfo_14104_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_CityHoldInfo_14104.class, Builder.class);
      }

      public boolean hasCityId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCityId() {
         return this.cityId_;
      }

      public boolean hasPageParam() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.PageInfo getPageParam() {
         return this.pageParam_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageParam_;
      }

      public CommonMsg.PageInfoOrBuilder getPageParamOrBuilder() {
         return this.pageParam_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageParam_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCityId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPageParam()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getPageParam().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.cityId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getPageParam());
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
               size += CodedOutputStream.computeInt32Size(1, this.cityId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getPageParam());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_CityHoldInfo_14104)) {
            return super.equals(obj);
         } else {
            S2CR_CityHoldInfo_14104 other = (S2CR_CityHoldInfo_14104)obj;
            if (this.hasCityId() != other.hasCityId()) {
               return false;
            } else if (this.hasCityId() && this.getCityId() != other.getCityId()) {
               return false;
            } else if (this.hasPageParam() != other.hasPageParam()) {
               return false;
            } else if (this.hasPageParam() && !this.getPageParam().equals(other.getPageParam())) {
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
            if (this.hasCityId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCityId();
            }

            if (this.hasPageParam()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPageParam().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_CityHoldInfo_14104 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_CityHoldInfo_14104)PARSER.parseFrom(data);
      }

      public static S2CR_CityHoldInfo_14104 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CityHoldInfo_14104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CityHoldInfo_14104 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_CityHoldInfo_14104)PARSER.parseFrom(data);
      }

      public static S2CR_CityHoldInfo_14104 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CityHoldInfo_14104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CityHoldInfo_14104 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_CityHoldInfo_14104)PARSER.parseFrom(data);
      }

      public static S2CR_CityHoldInfo_14104 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CityHoldInfo_14104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CityHoldInfo_14104 parseFrom(InputStream input) throws IOException {
         return (S2CR_CityHoldInfo_14104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_CityHoldInfo_14104 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CityHoldInfo_14104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_CityHoldInfo_14104 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_CityHoldInfo_14104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_CityHoldInfo_14104 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CityHoldInfo_14104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_CityHoldInfo_14104 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_CityHoldInfo_14104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_CityHoldInfo_14104 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CityHoldInfo_14104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_CityHoldInfo_14104 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_CityHoldInfo_14104 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_CityHoldInfo_14104> parser() {
         return PARSER;
      }

      public Parser<S2CR_CityHoldInfo_14104> getParserForType() {
         return PARSER;
      }

      public S2CR_CityHoldInfo_14104 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_CityHoldInfo_14104OrBuilder {
         private int bitField0_;
         private int cityId_;
         private CommonMsg.PageInfo pageParam_;
         private SingleFieldBuilderV3<CommonMsg.PageInfo, CommonMsg.PageInfo.Builder, CommonMsg.PageInfoOrBuilder> pageParamBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_CityHoldInfo_14104_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_CityHoldInfo_14104_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_CityHoldInfo_14104.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.S2CR_CityHoldInfo_14104.alwaysUseFieldBuilders) {
               this.getPageParamFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.cityId_ = 0;
            this.bitField0_ &= -2;
            if (this.pageParamBuilder_ == null) {
               this.pageParam_ = null;
            } else {
               this.pageParamBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_CityHoldInfo_14104_descriptor;
         }

         public S2CR_CityHoldInfo_14104 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.S2CR_CityHoldInfo_14104.getDefaultInstance();
         }

         public S2CR_CityHoldInfo_14104 build() {
            S2CR_CityHoldInfo_14104 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_CityHoldInfo_14104 buildPartial() {
            S2CR_CityHoldInfo_14104 result = new S2CR_CityHoldInfo_14104(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.cityId_ = this.cityId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.pageParamBuilder_ == null) {
                  result.pageParam_ = this.pageParam_;
               } else {
                  result.pageParam_ = (CommonMsg.PageInfo)this.pageParamBuilder_.build();
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
            if (other instanceof S2CR_CityHoldInfo_14104) {
               return this.mergeFrom((S2CR_CityHoldInfo_14104)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_CityHoldInfo_14104 other) {
            if (other == CrossDemonStrikesMsg.S2CR_CityHoldInfo_14104.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCityId()) {
                  this.setCityId(other.getCityId());
               }

               if (other.hasPageParam()) {
                  this.mergePageParam(other.getPageParam());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCityId()) {
               return false;
            } else if (!this.hasPageParam()) {
               return false;
            } else {
               return this.getPageParam().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_CityHoldInfo_14104 parsedMessage = null;

            try {
               parsedMessage = (S2CR_CityHoldInfo_14104)CrossDemonStrikesMsg.S2CR_CityHoldInfo_14104.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_CityHoldInfo_14104)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCityId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCityId() {
            return this.cityId_;
         }

         public Builder setCityId(int value) {
            this.bitField0_ |= 1;
            this.cityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCityId() {
            this.bitField0_ &= -2;
            this.cityId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPageParam() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.PageInfo getPageParam() {
            if (this.pageParamBuilder_ == null) {
               return this.pageParam_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageParam_;
            } else {
               return (CommonMsg.PageInfo)this.pageParamBuilder_.getMessage();
            }
         }

         public Builder setPageParam(CommonMsg.PageInfo value) {
            if (this.pageParamBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.pageParam_ = value;
               this.onChanged();
            } else {
               this.pageParamBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setPageParam(CommonMsg.PageInfo.Builder builderForValue) {
            if (this.pageParamBuilder_ == null) {
               this.pageParam_ = builderForValue.build();
               this.onChanged();
            } else {
               this.pageParamBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergePageParam(CommonMsg.PageInfo value) {
            if (this.pageParamBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.pageParam_ != null && this.pageParam_ != CommonMsg.PageInfo.getDefaultInstance()) {
                  this.pageParam_ = CommonMsg.PageInfo.newBuilder(this.pageParam_).mergeFrom(value).buildPartial();
               } else {
                  this.pageParam_ = value;
               }

               this.onChanged();
            } else {
               this.pageParamBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearPageParam() {
            if (this.pageParamBuilder_ == null) {
               this.pageParam_ = null;
               this.onChanged();
            } else {
               this.pageParamBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.PageInfo.Builder getPageParamBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.PageInfo.Builder)this.getPageParamFieldBuilder().getBuilder();
         }

         public CommonMsg.PageInfoOrBuilder getPageParamOrBuilder() {
            if (this.pageParamBuilder_ != null) {
               return (CommonMsg.PageInfoOrBuilder)this.pageParamBuilder_.getMessageOrBuilder();
            } else {
               return this.pageParam_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageParam_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.PageInfo, CommonMsg.PageInfo.Builder, CommonMsg.PageInfoOrBuilder> getPageParamFieldBuilder() {
            if (this.pageParamBuilder_ == null) {
               this.pageParamBuilder_ = new SingleFieldBuilderV3(this.getPageParam(), this.getParentForChildren(), this.isClean());
               this.pageParam_ = null;
            }

            return this.pageParamBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_MoveCity_14106 extends GeneratedMessageV3 implements S2CR_MoveCity_14106OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CITYID_FIELD_NUMBER = 1;
      private int cityId_;
      public static final int MOVENUM_FIELD_NUMBER = 2;
      private int moveNum_;
      private byte memoizedIsInitialized;
      private static final S2CR_MoveCity_14106 DEFAULT_INSTANCE = new S2CR_MoveCity_14106();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_MoveCity_14106> PARSER = new AbstractParser<S2CR_MoveCity_14106>() {
         public S2CR_MoveCity_14106 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_MoveCity_14106(input, extensionRegistry);
         }
      };

      private S2CR_MoveCity_14106(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_MoveCity_14106() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_MoveCity_14106();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_MoveCity_14106(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.cityId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.moveNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_MoveCity_14106_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_MoveCity_14106_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MoveCity_14106.class, Builder.class);
      }

      public boolean hasCityId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCityId() {
         return this.cityId_;
      }

      public boolean hasMoveNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getMoveNum() {
         return this.moveNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCityId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMoveNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.cityId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.moveNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.cityId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.moveNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_MoveCity_14106)) {
            return super.equals(obj);
         } else {
            S2CR_MoveCity_14106 other = (S2CR_MoveCity_14106)obj;
            if (this.hasCityId() != other.hasCityId()) {
               return false;
            } else if (this.hasCityId() && this.getCityId() != other.getCityId()) {
               return false;
            } else if (this.hasMoveNum() != other.hasMoveNum()) {
               return false;
            } else if (this.hasMoveNum() && this.getMoveNum() != other.getMoveNum()) {
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
            if (this.hasCityId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCityId();
            }

            if (this.hasMoveNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMoveNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_MoveCity_14106 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_MoveCity_14106)PARSER.parseFrom(data);
      }

      public static S2CR_MoveCity_14106 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MoveCity_14106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MoveCity_14106 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_MoveCity_14106)PARSER.parseFrom(data);
      }

      public static S2CR_MoveCity_14106 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MoveCity_14106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MoveCity_14106 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_MoveCity_14106)PARSER.parseFrom(data);
      }

      public static S2CR_MoveCity_14106 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MoveCity_14106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MoveCity_14106 parseFrom(InputStream input) throws IOException {
         return (S2CR_MoveCity_14106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MoveCity_14106 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MoveCity_14106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MoveCity_14106 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_MoveCity_14106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_MoveCity_14106 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MoveCity_14106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MoveCity_14106 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_MoveCity_14106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MoveCity_14106 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MoveCity_14106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_MoveCity_14106 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_MoveCity_14106 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_MoveCity_14106> parser() {
         return PARSER;
      }

      public Parser<S2CR_MoveCity_14106> getParserForType() {
         return PARSER;
      }

      public S2CR_MoveCity_14106 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_MoveCity_14106OrBuilder {
         private int bitField0_;
         private int cityId_;
         private int moveNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_MoveCity_14106_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_MoveCity_14106_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MoveCity_14106.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.S2CR_MoveCity_14106.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.cityId_ = 0;
            this.bitField0_ &= -2;
            this.moveNum_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_MoveCity_14106_descriptor;
         }

         public S2CR_MoveCity_14106 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.S2CR_MoveCity_14106.getDefaultInstance();
         }

         public S2CR_MoveCity_14106 build() {
            S2CR_MoveCity_14106 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_MoveCity_14106 buildPartial() {
            S2CR_MoveCity_14106 result = new S2CR_MoveCity_14106(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.cityId_ = this.cityId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.moveNum_ = this.moveNum_;
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
            if (other instanceof S2CR_MoveCity_14106) {
               return this.mergeFrom((S2CR_MoveCity_14106)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_MoveCity_14106 other) {
            if (other == CrossDemonStrikesMsg.S2CR_MoveCity_14106.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCityId()) {
                  this.setCityId(other.getCityId());
               }

               if (other.hasMoveNum()) {
                  this.setMoveNum(other.getMoveNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCityId()) {
               return false;
            } else {
               return this.hasMoveNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_MoveCity_14106 parsedMessage = null;

            try {
               parsedMessage = (S2CR_MoveCity_14106)CrossDemonStrikesMsg.S2CR_MoveCity_14106.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_MoveCity_14106)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCityId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCityId() {
            return this.cityId_;
         }

         public Builder setCityId(int value) {
            this.bitField0_ |= 1;
            this.cityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCityId() {
            this.bitField0_ &= -2;
            this.cityId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMoveNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getMoveNum() {
            return this.moveNum_;
         }

         public Builder setMoveNum(int value) {
            this.bitField0_ |= 2;
            this.moveNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMoveNum() {
            this.bitField0_ &= -3;
            this.moveNum_ = 0;
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

   public static final class CR2S_MoveCity_14107 extends GeneratedMessageV3 implements CR2S_MoveCity_14107OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CITYID_FIELD_NUMBER = 1;
      private int cityId_;
      public static final int NEEDFEE_FIELD_NUMBER = 2;
      private boolean needFee_;
      private byte memoizedIsInitialized;
      private static final CR2S_MoveCity_14107 DEFAULT_INSTANCE = new CR2S_MoveCity_14107();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_MoveCity_14107> PARSER = new AbstractParser<CR2S_MoveCity_14107>() {
         public CR2S_MoveCity_14107 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_MoveCity_14107(input, extensionRegistry);
         }
      };

      private CR2S_MoveCity_14107(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_MoveCity_14107() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_MoveCity_14107();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_MoveCity_14107(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.cityId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.needFee_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_MoveCity_14107_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_MoveCity_14107_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_MoveCity_14107.class, Builder.class);
      }

      public boolean hasCityId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCityId() {
         return this.cityId_;
      }

      public boolean hasNeedFee() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getNeedFee() {
         return this.needFee_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCityId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasNeedFee()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.cityId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.needFee_);
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
               size += CodedOutputStream.computeInt32Size(1, this.cityId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.needFee_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_MoveCity_14107)) {
            return super.equals(obj);
         } else {
            CR2S_MoveCity_14107 other = (CR2S_MoveCity_14107)obj;
            if (this.hasCityId() != other.hasCityId()) {
               return false;
            } else if (this.hasCityId() && this.getCityId() != other.getCityId()) {
               return false;
            } else if (this.hasNeedFee() != other.hasNeedFee()) {
               return false;
            } else if (this.hasNeedFee() && this.getNeedFee() != other.getNeedFee()) {
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
            if (this.hasCityId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCityId();
            }

            if (this.hasNeedFee()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getNeedFee());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_MoveCity_14107 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_MoveCity_14107)PARSER.parseFrom(data);
      }

      public static CR2S_MoveCity_14107 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_MoveCity_14107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_MoveCity_14107 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_MoveCity_14107)PARSER.parseFrom(data);
      }

      public static CR2S_MoveCity_14107 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_MoveCity_14107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_MoveCity_14107 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_MoveCity_14107)PARSER.parseFrom(data);
      }

      public static CR2S_MoveCity_14107 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_MoveCity_14107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_MoveCity_14107 parseFrom(InputStream input) throws IOException {
         return (CR2S_MoveCity_14107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_MoveCity_14107 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_MoveCity_14107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_MoveCity_14107 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_MoveCity_14107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_MoveCity_14107 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_MoveCity_14107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_MoveCity_14107 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_MoveCity_14107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_MoveCity_14107 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_MoveCity_14107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_MoveCity_14107 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_MoveCity_14107 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_MoveCity_14107> parser() {
         return PARSER;
      }

      public Parser<CR2S_MoveCity_14107> getParserForType() {
         return PARSER;
      }

      public CR2S_MoveCity_14107 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_MoveCity_14107OrBuilder {
         private int bitField0_;
         private int cityId_;
         private boolean needFee_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_MoveCity_14107_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_MoveCity_14107_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_MoveCity_14107.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.CR2S_MoveCity_14107.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.cityId_ = 0;
            this.bitField0_ &= -2;
            this.needFee_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_MoveCity_14107_descriptor;
         }

         public CR2S_MoveCity_14107 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.CR2S_MoveCity_14107.getDefaultInstance();
         }

         public CR2S_MoveCity_14107 build() {
            CR2S_MoveCity_14107 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_MoveCity_14107 buildPartial() {
            CR2S_MoveCity_14107 result = new CR2S_MoveCity_14107(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.cityId_ = this.cityId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.needFee_ = this.needFee_;
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
            if (other instanceof CR2S_MoveCity_14107) {
               return this.mergeFrom((CR2S_MoveCity_14107)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_MoveCity_14107 other) {
            if (other == CrossDemonStrikesMsg.CR2S_MoveCity_14107.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCityId()) {
                  this.setCityId(other.getCityId());
               }

               if (other.hasNeedFee()) {
                  this.setNeedFee(other.getNeedFee());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCityId()) {
               return false;
            } else {
               return this.hasNeedFee();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_MoveCity_14107 parsedMessage = null;

            try {
               parsedMessage = (CR2S_MoveCity_14107)CrossDemonStrikesMsg.CR2S_MoveCity_14107.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_MoveCity_14107)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCityId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCityId() {
            return this.cityId_;
         }

         public Builder setCityId(int value) {
            this.bitField0_ |= 1;
            this.cityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCityId() {
            this.bitField0_ &= -2;
            this.cityId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasNeedFee() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getNeedFee() {
            return this.needFee_;
         }

         public Builder setNeedFee(boolean value) {
            this.bitField0_ |= 2;
            this.needFee_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNeedFee() {
            this.bitField0_ &= -3;
            this.needFee_ = false;
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

   public static final class S2CR_TransferList_14108 extends GeneratedMessageV3 implements S2CR_TransferList_14108OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POWER_FIELD_NUMBER = 1;
      private long power_;
      public static final int PAGEINFO_FIELD_NUMBER = 2;
      private CommonMsg.PageInfo pageInfo_;
      private byte memoizedIsInitialized;
      private static final S2CR_TransferList_14108 DEFAULT_INSTANCE = new S2CR_TransferList_14108();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_TransferList_14108> PARSER = new AbstractParser<S2CR_TransferList_14108>() {
         public S2CR_TransferList_14108 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_TransferList_14108(input, extensionRegistry);
         }
      };

      private S2CR_TransferList_14108(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_TransferList_14108() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_TransferList_14108();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_TransferList_14108(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.power_ = input.readInt64();
                        break;
                     case 18:
                        CommonMsg.PageInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.pageInfo_.toBuilder();
                        }

                        this.pageInfo_ = (CommonMsg.PageInfo)input.readMessage(CommonMsg.PageInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.pageInfo_);
                           this.pageInfo_ = subBuilder.buildPartial();
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
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_TransferList_14108_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_TransferList_14108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_TransferList_14108.class, Builder.class);
      }

      public boolean hasPower() {
         return (this.bitField0_ & 1) != 0;
      }

      public long getPower() {
         return this.power_;
      }

      public boolean hasPageInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.PageInfo getPageInfo() {
         return this.pageInfo_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageInfo_;
      }

      public CommonMsg.PageInfoOrBuilder getPageInfoOrBuilder() {
         return this.pageInfo_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageInfo_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPower()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPageInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getPageInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt64(1, this.power_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getPageInfo());
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
               size += CodedOutputStream.computeInt64Size(1, this.power_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getPageInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_TransferList_14108)) {
            return super.equals(obj);
         } else {
            S2CR_TransferList_14108 other = (S2CR_TransferList_14108)obj;
            if (this.hasPower() != other.hasPower()) {
               return false;
            } else if (this.hasPower() && this.getPower() != other.getPower()) {
               return false;
            } else if (this.hasPageInfo() != other.hasPageInfo()) {
               return false;
            } else if (this.hasPageInfo() && !this.getPageInfo().equals(other.getPageInfo())) {
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
            if (this.hasPower()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashLong(this.getPower());
            }

            if (this.hasPageInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPageInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_TransferList_14108 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_TransferList_14108)PARSER.parseFrom(data);
      }

      public static S2CR_TransferList_14108 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TransferList_14108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TransferList_14108 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_TransferList_14108)PARSER.parseFrom(data);
      }

      public static S2CR_TransferList_14108 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TransferList_14108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TransferList_14108 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_TransferList_14108)PARSER.parseFrom(data);
      }

      public static S2CR_TransferList_14108 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TransferList_14108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TransferList_14108 parseFrom(InputStream input) throws IOException {
         return (S2CR_TransferList_14108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_TransferList_14108 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TransferList_14108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_TransferList_14108 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_TransferList_14108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_TransferList_14108 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TransferList_14108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_TransferList_14108 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_TransferList_14108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_TransferList_14108 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TransferList_14108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_TransferList_14108 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_TransferList_14108 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_TransferList_14108> parser() {
         return PARSER;
      }

      public Parser<S2CR_TransferList_14108> getParserForType() {
         return PARSER;
      }

      public S2CR_TransferList_14108 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_TransferList_14108OrBuilder {
         private int bitField0_;
         private long power_;
         private CommonMsg.PageInfo pageInfo_;
         private SingleFieldBuilderV3<CommonMsg.PageInfo, CommonMsg.PageInfo.Builder, CommonMsg.PageInfoOrBuilder> pageInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_TransferList_14108_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_TransferList_14108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_TransferList_14108.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.S2CR_TransferList_14108.alwaysUseFieldBuilders) {
               this.getPageInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.power_ = 0L;
            this.bitField0_ &= -2;
            if (this.pageInfoBuilder_ == null) {
               this.pageInfo_ = null;
            } else {
               this.pageInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_TransferList_14108_descriptor;
         }

         public S2CR_TransferList_14108 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.S2CR_TransferList_14108.getDefaultInstance();
         }

         public S2CR_TransferList_14108 build() {
            S2CR_TransferList_14108 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_TransferList_14108 buildPartial() {
            S2CR_TransferList_14108 result = new S2CR_TransferList_14108(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.power_ = this.power_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.pageInfoBuilder_ == null) {
                  result.pageInfo_ = this.pageInfo_;
               } else {
                  result.pageInfo_ = (CommonMsg.PageInfo)this.pageInfoBuilder_.build();
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
            if (other instanceof S2CR_TransferList_14108) {
               return this.mergeFrom((S2CR_TransferList_14108)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_TransferList_14108 other) {
            if (other == CrossDemonStrikesMsg.S2CR_TransferList_14108.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPower()) {
                  this.setPower(other.getPower());
               }

               if (other.hasPageInfo()) {
                  this.mergePageInfo(other.getPageInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPower()) {
               return false;
            } else if (!this.hasPageInfo()) {
               return false;
            } else {
               return this.getPageInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_TransferList_14108 parsedMessage = null;

            try {
               parsedMessage = (S2CR_TransferList_14108)CrossDemonStrikesMsg.S2CR_TransferList_14108.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_TransferList_14108)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPower() {
            return (this.bitField0_ & 1) != 0;
         }

         public long getPower() {
            return this.power_;
         }

         public Builder setPower(long value) {
            this.bitField0_ |= 1;
            this.power_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPower() {
            this.bitField0_ &= -2;
            this.power_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasPageInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.PageInfo getPageInfo() {
            if (this.pageInfoBuilder_ == null) {
               return this.pageInfo_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageInfo_;
            } else {
               return (CommonMsg.PageInfo)this.pageInfoBuilder_.getMessage();
            }
         }

         public Builder setPageInfo(CommonMsg.PageInfo value) {
            if (this.pageInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.pageInfo_ = value;
               this.onChanged();
            } else {
               this.pageInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setPageInfo(CommonMsg.PageInfo.Builder builderForValue) {
            if (this.pageInfoBuilder_ == null) {
               this.pageInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.pageInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergePageInfo(CommonMsg.PageInfo value) {
            if (this.pageInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.pageInfo_ != null && this.pageInfo_ != CommonMsg.PageInfo.getDefaultInstance()) {
                  this.pageInfo_ = CommonMsg.PageInfo.newBuilder(this.pageInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.pageInfo_ = value;
               }

               this.onChanged();
            } else {
               this.pageInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearPageInfo() {
            if (this.pageInfoBuilder_ == null) {
               this.pageInfo_ = null;
               this.onChanged();
            } else {
               this.pageInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.PageInfo.Builder getPageInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.PageInfo.Builder)this.getPageInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.PageInfoOrBuilder getPageInfoOrBuilder() {
            if (this.pageInfoBuilder_ != null) {
               return (CommonMsg.PageInfoOrBuilder)this.pageInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.pageInfo_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.PageInfo, CommonMsg.PageInfo.Builder, CommonMsg.PageInfoOrBuilder> getPageInfoFieldBuilder() {
            if (this.pageInfoBuilder_ == null) {
               this.pageInfoBuilder_ = new SingleFieldBuilderV3(this.getPageInfo(), this.getParentForChildren(), this.isClean());
               this.pageInfo_ = null;
            }

            return this.pageInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_Transfer_14109 extends GeneratedMessageV3 implements S2CR_Transfer_14109OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CITYID_FIELD_NUMBER = 1;
      private int cityId_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int ATKNUM_FIELD_NUMBER = 3;
      private int atkNum_;
      public static final int MOVENUM_FIELD_NUMBER = 4;
      private int moveNum_;
      private byte memoizedIsInitialized;
      private static final S2CR_Transfer_14109 DEFAULT_INSTANCE = new S2CR_Transfer_14109();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Transfer_14109> PARSER = new AbstractParser<S2CR_Transfer_14109>() {
         public S2CR_Transfer_14109 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Transfer_14109(input, extensionRegistry);
         }
      };

      private S2CR_Transfer_14109(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Transfer_14109() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Transfer_14109();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Transfer_14109(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.cityId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.playerId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.atkNum_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.moveNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Transfer_14109_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Transfer_14109_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Transfer_14109.class, Builder.class);
      }

      public boolean hasCityId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCityId() {
         return this.cityId_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasAtkNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getAtkNum() {
         return this.atkNum_;
      }

      public boolean hasMoveNum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getMoveNum() {
         return this.moveNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCityId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAtkNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMoveNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.cityId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.atkNum_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.moveNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.cityId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.atkNum_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.moveNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_Transfer_14109)) {
            return super.equals(obj);
         } else {
            S2CR_Transfer_14109 other = (S2CR_Transfer_14109)obj;
            if (this.hasCityId() != other.hasCityId()) {
               return false;
            } else if (this.hasCityId() && this.getCityId() != other.getCityId()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasAtkNum() != other.hasAtkNum()) {
               return false;
            } else if (this.hasAtkNum() && this.getAtkNum() != other.getAtkNum()) {
               return false;
            } else if (this.hasMoveNum() != other.hasMoveNum()) {
               return false;
            } else if (this.hasMoveNum() && this.getMoveNum() != other.getMoveNum()) {
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
            if (this.hasCityId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCityId();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasAtkNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getAtkNum();
            }

            if (this.hasMoveNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getMoveNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_Transfer_14109 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Transfer_14109)PARSER.parseFrom(data);
      }

      public static S2CR_Transfer_14109 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Transfer_14109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Transfer_14109 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Transfer_14109)PARSER.parseFrom(data);
      }

      public static S2CR_Transfer_14109 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Transfer_14109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Transfer_14109 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Transfer_14109)PARSER.parseFrom(data);
      }

      public static S2CR_Transfer_14109 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Transfer_14109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Transfer_14109 parseFrom(InputStream input) throws IOException {
         return (S2CR_Transfer_14109)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Transfer_14109 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Transfer_14109)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Transfer_14109 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Transfer_14109)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Transfer_14109 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Transfer_14109)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Transfer_14109 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Transfer_14109)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Transfer_14109 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Transfer_14109)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Transfer_14109 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Transfer_14109 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Transfer_14109> parser() {
         return PARSER;
      }

      public Parser<S2CR_Transfer_14109> getParserForType() {
         return PARSER;
      }

      public S2CR_Transfer_14109 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Transfer_14109OrBuilder {
         private int bitField0_;
         private int cityId_;
         private int playerId_;
         private int atkNum_;
         private int moveNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Transfer_14109_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Transfer_14109_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Transfer_14109.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.S2CR_Transfer_14109.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.cityId_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.atkNum_ = 0;
            this.bitField0_ &= -5;
            this.moveNum_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Transfer_14109_descriptor;
         }

         public S2CR_Transfer_14109 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.S2CR_Transfer_14109.getDefaultInstance();
         }

         public S2CR_Transfer_14109 build() {
            S2CR_Transfer_14109 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Transfer_14109 buildPartial() {
            S2CR_Transfer_14109 result = new S2CR_Transfer_14109(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.cityId_ = this.cityId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.atkNum_ = this.atkNum_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.moveNum_ = this.moveNum_;
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
            if (other instanceof S2CR_Transfer_14109) {
               return this.mergeFrom((S2CR_Transfer_14109)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Transfer_14109 other) {
            if (other == CrossDemonStrikesMsg.S2CR_Transfer_14109.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCityId()) {
                  this.setCityId(other.getCityId());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasAtkNum()) {
                  this.setAtkNum(other.getAtkNum());
               }

               if (other.hasMoveNum()) {
                  this.setMoveNum(other.getMoveNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCityId()) {
               return false;
            } else if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasAtkNum()) {
               return false;
            } else {
               return this.hasMoveNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_Transfer_14109 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Transfer_14109)CrossDemonStrikesMsg.S2CR_Transfer_14109.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Transfer_14109)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCityId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCityId() {
            return this.cityId_;
         }

         public Builder setCityId(int value) {
            this.bitField0_ |= 1;
            this.cityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCityId() {
            this.bitField0_ &= -2;
            this.cityId_ = 0;
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

         public boolean hasAtkNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getAtkNum() {
            return this.atkNum_;
         }

         public Builder setAtkNum(int value) {
            this.bitField0_ |= 4;
            this.atkNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAtkNum() {
            this.bitField0_ &= -5;
            this.atkNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMoveNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getMoveNum() {
            return this.moveNum_;
         }

         public Builder setMoveNum(int value) {
            this.bitField0_ |= 8;
            this.moveNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMoveNum() {
            this.bitField0_ &= -9;
            this.moveNum_ = 0;
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

   public static final class CR2S_Transfer_14110 extends GeneratedMessageV3 implements CR2S_Transfer_14110OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CITYID_FIELD_NUMBER = 1;
      private int cityId_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int ATKNUMFEE_FIELD_NUMBER = 3;
      private int atkNumFee_;
      public static final int MOVENUMFEE_FIELD_NUMBER = 4;
      private int moveNumFee_;
      public static final int RESULT_FIELD_NUMBER = 5;
      private int result_;
      private byte memoizedIsInitialized;
      private static final CR2S_Transfer_14110 DEFAULT_INSTANCE = new CR2S_Transfer_14110();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_Transfer_14110> PARSER = new AbstractParser<CR2S_Transfer_14110>() {
         public CR2S_Transfer_14110 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_Transfer_14110(input, extensionRegistry);
         }
      };

      private CR2S_Transfer_14110(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_Transfer_14110() {
         this.memoizedIsInitialized = -1;
         this.result_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_Transfer_14110();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_Transfer_14110(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.cityId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.playerId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.atkNumFee_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.moveNumFee_ = input.readInt32();
                        break;
                     case 40:
                        int rawValue = input.readEnum();
                        DemonStrikesMsg.TransferResult value = DemonStrikesMsg.TransferResult.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(5, rawValue);
                        } else {
                           this.bitField0_ |= 16;
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
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_Transfer_14110_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_Transfer_14110_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Transfer_14110.class, Builder.class);
      }

      public boolean hasCityId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCityId() {
         return this.cityId_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasAtkNumFee() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getAtkNumFee() {
         return this.atkNumFee_;
      }

      public boolean hasMoveNumFee() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getMoveNumFee() {
         return this.moveNumFee_;
      }

      public boolean hasResult() {
         return (this.bitField0_ & 16) != 0;
      }

      public DemonStrikesMsg.TransferResult getResult() {
         DemonStrikesMsg.TransferResult result = DemonStrikesMsg.TransferResult.valueOf(this.result_);
         return result == null ? DemonStrikesMsg.TransferResult.TRANSFER_ATK_SUC : result;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCityId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAtkNumFee()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMoveNumFee()) {
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
            output.writeInt32(1, this.cityId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.atkNumFee_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.moveNumFee_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeEnum(5, this.result_);
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
               size += CodedOutputStream.computeInt32Size(1, this.cityId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.atkNumFee_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.moveNumFee_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeEnumSize(5, this.result_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_Transfer_14110)) {
            return super.equals(obj);
         } else {
            CR2S_Transfer_14110 other = (CR2S_Transfer_14110)obj;
            if (this.hasCityId() != other.hasCityId()) {
               return false;
            } else if (this.hasCityId() && this.getCityId() != other.getCityId()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasAtkNumFee() != other.hasAtkNumFee()) {
               return false;
            } else if (this.hasAtkNumFee() && this.getAtkNumFee() != other.getAtkNumFee()) {
               return false;
            } else if (this.hasMoveNumFee() != other.hasMoveNumFee()) {
               return false;
            } else if (this.hasMoveNumFee() && this.getMoveNumFee() != other.getMoveNumFee()) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
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
            if (this.hasCityId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCityId();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasAtkNumFee()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getAtkNumFee();
            }

            if (this.hasMoveNumFee()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getMoveNumFee();
            }

            if (this.hasResult()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.result_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_Transfer_14110 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_Transfer_14110)PARSER.parseFrom(data);
      }

      public static CR2S_Transfer_14110 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Transfer_14110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Transfer_14110 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_Transfer_14110)PARSER.parseFrom(data);
      }

      public static CR2S_Transfer_14110 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Transfer_14110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Transfer_14110 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_Transfer_14110)PARSER.parseFrom(data);
      }

      public static CR2S_Transfer_14110 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Transfer_14110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Transfer_14110 parseFrom(InputStream input) throws IOException {
         return (CR2S_Transfer_14110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Transfer_14110 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Transfer_14110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Transfer_14110 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_Transfer_14110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_Transfer_14110 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Transfer_14110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Transfer_14110 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_Transfer_14110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Transfer_14110 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Transfer_14110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_Transfer_14110 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_Transfer_14110 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_Transfer_14110> parser() {
         return PARSER;
      }

      public Parser<CR2S_Transfer_14110> getParserForType() {
         return PARSER;
      }

      public CR2S_Transfer_14110 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_Transfer_14110OrBuilder {
         private int bitField0_;
         private int cityId_;
         private int playerId_;
         private int atkNumFee_;
         private int moveNumFee_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_Transfer_14110_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_Transfer_14110_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Transfer_14110.class, Builder.class);
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
            if (CrossDemonStrikesMsg.CR2S_Transfer_14110.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.cityId_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.atkNumFee_ = 0;
            this.bitField0_ &= -5;
            this.moveNumFee_ = 0;
            this.bitField0_ &= -9;
            this.result_ = 1;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_Transfer_14110_descriptor;
         }

         public CR2S_Transfer_14110 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.CR2S_Transfer_14110.getDefaultInstance();
         }

         public CR2S_Transfer_14110 build() {
            CR2S_Transfer_14110 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_Transfer_14110 buildPartial() {
            CR2S_Transfer_14110 result = new CR2S_Transfer_14110(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.cityId_ = this.cityId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.atkNumFee_ = this.atkNumFee_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.moveNumFee_ = this.moveNumFee_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               to_bitField0_ |= 16;
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
            if (other instanceof CR2S_Transfer_14110) {
               return this.mergeFrom((CR2S_Transfer_14110)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_Transfer_14110 other) {
            if (other == CrossDemonStrikesMsg.CR2S_Transfer_14110.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCityId()) {
                  this.setCityId(other.getCityId());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasAtkNumFee()) {
                  this.setAtkNumFee(other.getAtkNumFee());
               }

               if (other.hasMoveNumFee()) {
                  this.setMoveNumFee(other.getMoveNumFee());
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
            if (!this.hasCityId()) {
               return false;
            } else if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasAtkNumFee()) {
               return false;
            } else if (!this.hasMoveNumFee()) {
               return false;
            } else {
               return this.hasResult();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_Transfer_14110 parsedMessage = null;

            try {
               parsedMessage = (CR2S_Transfer_14110)CrossDemonStrikesMsg.CR2S_Transfer_14110.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_Transfer_14110)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCityId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCityId() {
            return this.cityId_;
         }

         public Builder setCityId(int value) {
            this.bitField0_ |= 1;
            this.cityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCityId() {
            this.bitField0_ &= -2;
            this.cityId_ = 0;
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

         public boolean hasAtkNumFee() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getAtkNumFee() {
            return this.atkNumFee_;
         }

         public Builder setAtkNumFee(int value) {
            this.bitField0_ |= 4;
            this.atkNumFee_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAtkNumFee() {
            this.bitField0_ &= -5;
            this.atkNumFee_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMoveNumFee() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getMoveNumFee() {
            return this.moveNumFee_;
         }

         public Builder setMoveNumFee(int value) {
            this.bitField0_ |= 8;
            this.moveNumFee_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMoveNumFee() {
            this.bitField0_ &= -9;
            this.moveNumFee_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 16) != 0;
         }

         public DemonStrikesMsg.TransferResult getResult() {
            DemonStrikesMsg.TransferResult result = DemonStrikesMsg.TransferResult.valueOf(this.result_);
            return result == null ? DemonStrikesMsg.TransferResult.TRANSFER_ATK_SUC : result;
         }

         public Builder setResult(DemonStrikesMsg.TransferResult value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16;
               this.result_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearResult() {
            this.bitField0_ &= -17;
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

   public static final class S2CR_Rank_14111 extends GeneratedMessageV3 implements S2CR_Rank_14111OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PARAMS_FIELD_NUMBER = 1;
      private DemonStrikesMsg.C2S_Rank_13919 params_;
      private byte memoizedIsInitialized;
      private static final S2CR_Rank_14111 DEFAULT_INSTANCE = new S2CR_Rank_14111();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Rank_14111> PARSER = new AbstractParser<S2CR_Rank_14111>() {
         public S2CR_Rank_14111 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Rank_14111(input, extensionRegistry);
         }
      };

      private S2CR_Rank_14111(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Rank_14111() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Rank_14111();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Rank_14111(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        DemonStrikesMsg.C2S_Rank_13919.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.params_.toBuilder();
                        }

                        this.params_ = (DemonStrikesMsg.C2S_Rank_13919)input.readMessage(DemonStrikesMsg.C2S_Rank_13919.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.params_);
                           this.params_ = subBuilder.buildPartial();
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
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Rank_14111_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Rank_14111_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Rank_14111.class, Builder.class);
      }

      public boolean hasParams() {
         return (this.bitField0_ & 1) != 0;
      }

      public DemonStrikesMsg.C2S_Rank_13919 getParams() {
         return this.params_ == null ? DemonStrikesMsg.C2S_Rank_13919.getDefaultInstance() : this.params_;
      }

      public DemonStrikesMsg.C2S_Rank_13919OrBuilder getParamsOrBuilder() {
         return this.params_ == null ? DemonStrikesMsg.C2S_Rank_13919.getDefaultInstance() : this.params_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasParams()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getParams().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getParams());
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
               size += CodedOutputStream.computeMessageSize(1, this.getParams());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_Rank_14111)) {
            return super.equals(obj);
         } else {
            S2CR_Rank_14111 other = (S2CR_Rank_14111)obj;
            if (this.hasParams() != other.hasParams()) {
               return false;
            } else if (this.hasParams() && !this.getParams().equals(other.getParams())) {
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
            if (this.hasParams()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getParams().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_Rank_14111 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Rank_14111)PARSER.parseFrom(data);
      }

      public static S2CR_Rank_14111 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Rank_14111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Rank_14111 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Rank_14111)PARSER.parseFrom(data);
      }

      public static S2CR_Rank_14111 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Rank_14111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Rank_14111 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Rank_14111)PARSER.parseFrom(data);
      }

      public static S2CR_Rank_14111 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Rank_14111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Rank_14111 parseFrom(InputStream input) throws IOException {
         return (S2CR_Rank_14111)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Rank_14111 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Rank_14111)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Rank_14111 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Rank_14111)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Rank_14111 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Rank_14111)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Rank_14111 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Rank_14111)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Rank_14111 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Rank_14111)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Rank_14111 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Rank_14111 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Rank_14111> parser() {
         return PARSER;
      }

      public Parser<S2CR_Rank_14111> getParserForType() {
         return PARSER;
      }

      public S2CR_Rank_14111 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Rank_14111OrBuilder {
         private int bitField0_;
         private DemonStrikesMsg.C2S_Rank_13919 params_;
         private SingleFieldBuilderV3<DemonStrikesMsg.C2S_Rank_13919, DemonStrikesMsg.C2S_Rank_13919.Builder, DemonStrikesMsg.C2S_Rank_13919OrBuilder> paramsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Rank_14111_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Rank_14111_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Rank_14111.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.S2CR_Rank_14111.alwaysUseFieldBuilders) {
               this.getParamsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.paramsBuilder_ == null) {
               this.params_ = null;
            } else {
               this.paramsBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Rank_14111_descriptor;
         }

         public S2CR_Rank_14111 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.S2CR_Rank_14111.getDefaultInstance();
         }

         public S2CR_Rank_14111 build() {
            S2CR_Rank_14111 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Rank_14111 buildPartial() {
            S2CR_Rank_14111 result = new S2CR_Rank_14111(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.paramsBuilder_ == null) {
                  result.params_ = this.params_;
               } else {
                  result.params_ = (DemonStrikesMsg.C2S_Rank_13919)this.paramsBuilder_.build();
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
            if (other instanceof S2CR_Rank_14111) {
               return this.mergeFrom((S2CR_Rank_14111)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Rank_14111 other) {
            if (other == CrossDemonStrikesMsg.S2CR_Rank_14111.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasParams()) {
                  this.mergeParams(other.getParams());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasParams()) {
               return false;
            } else {
               return this.getParams().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_Rank_14111 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Rank_14111)CrossDemonStrikesMsg.S2CR_Rank_14111.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Rank_14111)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasParams() {
            return (this.bitField0_ & 1) != 0;
         }

         public DemonStrikesMsg.C2S_Rank_13919 getParams() {
            if (this.paramsBuilder_ == null) {
               return this.params_ == null ? DemonStrikesMsg.C2S_Rank_13919.getDefaultInstance() : this.params_;
            } else {
               return (DemonStrikesMsg.C2S_Rank_13919)this.paramsBuilder_.getMessage();
            }
         }

         public Builder setParams(DemonStrikesMsg.C2S_Rank_13919 value) {
            if (this.paramsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.params_ = value;
               this.onChanged();
            } else {
               this.paramsBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setParams(DemonStrikesMsg.C2S_Rank_13919.Builder builderForValue) {
            if (this.paramsBuilder_ == null) {
               this.params_ = builderForValue.build();
               this.onChanged();
            } else {
               this.paramsBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeParams(DemonStrikesMsg.C2S_Rank_13919 value) {
            if (this.paramsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.params_ != null && this.params_ != DemonStrikesMsg.C2S_Rank_13919.getDefaultInstance()) {
                  this.params_ = DemonStrikesMsg.C2S_Rank_13919.newBuilder(this.params_).mergeFrom(value).buildPartial();
               } else {
                  this.params_ = value;
               }

               this.onChanged();
            } else {
               this.paramsBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearParams() {
            if (this.paramsBuilder_ == null) {
               this.params_ = null;
               this.onChanged();
            } else {
               this.paramsBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public DemonStrikesMsg.C2S_Rank_13919.Builder getParamsBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (DemonStrikesMsg.C2S_Rank_13919.Builder)this.getParamsFieldBuilder().getBuilder();
         }

         public DemonStrikesMsg.C2S_Rank_13919OrBuilder getParamsOrBuilder() {
            if (this.paramsBuilder_ != null) {
               return (DemonStrikesMsg.C2S_Rank_13919OrBuilder)this.paramsBuilder_.getMessageOrBuilder();
            } else {
               return this.params_ == null ? DemonStrikesMsg.C2S_Rank_13919.getDefaultInstance() : this.params_;
            }
         }

         private SingleFieldBuilderV3<DemonStrikesMsg.C2S_Rank_13919, DemonStrikesMsg.C2S_Rank_13919.Builder, DemonStrikesMsg.C2S_Rank_13919OrBuilder> getParamsFieldBuilder() {
            if (this.paramsBuilder_ == null) {
               this.paramsBuilder_ = new SingleFieldBuilderV3(this.getParams(), this.getParentForChildren(), this.isClean());
               this.params_ = null;
            }

            return this.paramsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_Logs_14112 extends GeneratedMessageV3 implements S2CR_Logs_14112OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_Logs_14112 DEFAULT_INSTANCE = new S2CR_Logs_14112();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Logs_14112> PARSER = new AbstractParser<S2CR_Logs_14112>() {
         public S2CR_Logs_14112 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Logs_14112(input, extensionRegistry);
         }
      };

      private S2CR_Logs_14112(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Logs_14112() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Logs_14112();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Logs_14112(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Logs_14112_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Logs_14112_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Logs_14112.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_Logs_14112)) {
            return super.equals(obj);
         } else {
            S2CR_Logs_14112 other = (S2CR_Logs_14112)obj;
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

      public static S2CR_Logs_14112 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Logs_14112)PARSER.parseFrom(data);
      }

      public static S2CR_Logs_14112 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Logs_14112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Logs_14112 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Logs_14112)PARSER.parseFrom(data);
      }

      public static S2CR_Logs_14112 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Logs_14112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Logs_14112 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Logs_14112)PARSER.parseFrom(data);
      }

      public static S2CR_Logs_14112 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Logs_14112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Logs_14112 parseFrom(InputStream input) throws IOException {
         return (S2CR_Logs_14112)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Logs_14112 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Logs_14112)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Logs_14112 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Logs_14112)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Logs_14112 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Logs_14112)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Logs_14112 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Logs_14112)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Logs_14112 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Logs_14112)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Logs_14112 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Logs_14112 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Logs_14112> parser() {
         return PARSER;
      }

      public Parser<S2CR_Logs_14112> getParserForType() {
         return PARSER;
      }

      public S2CR_Logs_14112 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Logs_14112OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Logs_14112_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Logs_14112_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Logs_14112.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.S2CR_Logs_14112.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_Logs_14112_descriptor;
         }

         public S2CR_Logs_14112 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.S2CR_Logs_14112.getDefaultInstance();
         }

         public S2CR_Logs_14112 build() {
            S2CR_Logs_14112 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Logs_14112 buildPartial() {
            S2CR_Logs_14112 result = new S2CR_Logs_14112(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_Logs_14112) {
               return this.mergeFrom((S2CR_Logs_14112)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Logs_14112 other) {
            if (other == CrossDemonStrikesMsg.S2CR_Logs_14112.getDefaultInstance()) {
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
            S2CR_Logs_14112 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Logs_14112)CrossDemonStrikesMsg.S2CR_Logs_14112.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Logs_14112)e.getUnfinishedMessage();
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

   public static final class S2CR_CityReward_14113 extends GeneratedMessageV3 implements S2CR_CityReward_14113OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_CityReward_14113 DEFAULT_INSTANCE = new S2CR_CityReward_14113();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_CityReward_14113> PARSER = new AbstractParser<S2CR_CityReward_14113>() {
         public S2CR_CityReward_14113 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_CityReward_14113(input, extensionRegistry);
         }
      };

      private S2CR_CityReward_14113(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_CityReward_14113() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_CityReward_14113();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_CityReward_14113(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_CityReward_14113_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_CityReward_14113_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_CityReward_14113.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_CityReward_14113)) {
            return super.equals(obj);
         } else {
            S2CR_CityReward_14113 other = (S2CR_CityReward_14113)obj;
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

      public static S2CR_CityReward_14113 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_CityReward_14113)PARSER.parseFrom(data);
      }

      public static S2CR_CityReward_14113 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CityReward_14113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CityReward_14113 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_CityReward_14113)PARSER.parseFrom(data);
      }

      public static S2CR_CityReward_14113 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CityReward_14113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CityReward_14113 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_CityReward_14113)PARSER.parseFrom(data);
      }

      public static S2CR_CityReward_14113 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CityReward_14113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CityReward_14113 parseFrom(InputStream input) throws IOException {
         return (S2CR_CityReward_14113)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_CityReward_14113 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CityReward_14113)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_CityReward_14113 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_CityReward_14113)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_CityReward_14113 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CityReward_14113)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_CityReward_14113 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_CityReward_14113)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_CityReward_14113 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CityReward_14113)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_CityReward_14113 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_CityReward_14113 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_CityReward_14113> parser() {
         return PARSER;
      }

      public Parser<S2CR_CityReward_14113> getParserForType() {
         return PARSER;
      }

      public S2CR_CityReward_14113 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_CityReward_14113OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_CityReward_14113_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_CityReward_14113_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_CityReward_14113.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.S2CR_CityReward_14113.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_CityReward_14113_descriptor;
         }

         public S2CR_CityReward_14113 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.S2CR_CityReward_14113.getDefaultInstance();
         }

         public S2CR_CityReward_14113 build() {
            S2CR_CityReward_14113 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_CityReward_14113 buildPartial() {
            S2CR_CityReward_14113 result = new S2CR_CityReward_14113(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_CityReward_14113) {
               return this.mergeFrom((S2CR_CityReward_14113)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_CityReward_14113 other) {
            if (other == CrossDemonStrikesMsg.S2CR_CityReward_14113.getDefaultInstance()) {
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
            S2CR_CityReward_14113 parsedMessage = null;

            try {
               parsedMessage = (S2CR_CityReward_14113)CrossDemonStrikesMsg.S2CR_CityReward_14113.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_CityReward_14113)e.getUnfinishedMessage();
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

   public static final class CR2S_CityReward_14114 extends GeneratedMessageV3 implements CR2S_CityReward_14114OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int REWARD_FIELD_NUMBER = 1;
      private List<CommonMsg.MapDataII> reward_;
      public static final int RANDOMREWARD_FIELD_NUMBER = 2;
      private List<CommonMsg.MapDataII> randomReward_;
      private byte memoizedIsInitialized;
      private static final CR2S_CityReward_14114 DEFAULT_INSTANCE = new CR2S_CityReward_14114();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_CityReward_14114> PARSER = new AbstractParser<CR2S_CityReward_14114>() {
         public CR2S_CityReward_14114 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_CityReward_14114(input, extensionRegistry);
         }
      };

      private CR2S_CityReward_14114(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_CityReward_14114() {
         this.memoizedIsInitialized = -1;
         this.reward_ = Collections.emptyList();
         this.randomReward_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_CityReward_14114();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_CityReward_14114(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.reward_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.reward_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.randomReward_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.randomReward_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.reward_ = Collections.unmodifiableList(this.reward_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.randomReward_ = Collections.unmodifiableList(this.randomReward_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_CityReward_14114_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_CityReward_14114_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_CityReward_14114.class, Builder.class);
      }

      public List<CommonMsg.MapDataII> getRewardList() {
         return this.reward_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getRewardOrBuilderList() {
         return this.reward_;
      }

      public int getRewardCount() {
         return this.reward_.size();
      }

      public CommonMsg.MapDataII getReward(int index) {
         return (CommonMsg.MapDataII)this.reward_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getRewardOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.reward_.get(index);
      }

      public List<CommonMsg.MapDataII> getRandomRewardList() {
         return this.randomReward_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getRandomRewardOrBuilderList() {
         return this.randomReward_;
      }

      public int getRandomRewardCount() {
         return this.randomReward_.size();
      }

      public CommonMsg.MapDataII getRandomReward(int index) {
         return (CommonMsg.MapDataII)this.randomReward_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getRandomRewardOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.randomReward_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getRewardCount(); ++i) {
               if (!this.getReward(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getRandomRewardCount(); ++i) {
               if (!this.getRandomReward(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.reward_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.reward_.get(i));
         }

         for(int i = 0; i < this.randomReward_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.randomReward_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.reward_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.reward_.get(i));
            }

            for(int i = 0; i < this.randomReward_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.randomReward_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_CityReward_14114)) {
            return super.equals(obj);
         } else {
            CR2S_CityReward_14114 other = (CR2S_CityReward_14114)obj;
            if (!this.getRewardList().equals(other.getRewardList())) {
               return false;
            } else if (!this.getRandomRewardList().equals(other.getRandomRewardList())) {
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
            if (this.getRewardCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRewardList().hashCode();
            }

            if (this.getRandomRewardCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRandomRewardList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_CityReward_14114 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_CityReward_14114)PARSER.parseFrom(data);
      }

      public static CR2S_CityReward_14114 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_CityReward_14114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_CityReward_14114 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_CityReward_14114)PARSER.parseFrom(data);
      }

      public static CR2S_CityReward_14114 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_CityReward_14114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_CityReward_14114 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_CityReward_14114)PARSER.parseFrom(data);
      }

      public static CR2S_CityReward_14114 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_CityReward_14114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_CityReward_14114 parseFrom(InputStream input) throws IOException {
         return (CR2S_CityReward_14114)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_CityReward_14114 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_CityReward_14114)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_CityReward_14114 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_CityReward_14114)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_CityReward_14114 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_CityReward_14114)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_CityReward_14114 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_CityReward_14114)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_CityReward_14114 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_CityReward_14114)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_CityReward_14114 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_CityReward_14114 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_CityReward_14114> parser() {
         return PARSER;
      }

      public Parser<CR2S_CityReward_14114> getParserForType() {
         return PARSER;
      }

      public CR2S_CityReward_14114 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_CityReward_14114OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MapDataII> reward_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> rewardBuilder_;
         private List<CommonMsg.MapDataII> randomReward_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> randomRewardBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_CityReward_14114_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_CityReward_14114_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_CityReward_14114.class, Builder.class);
         }

         private Builder() {
            this.reward_ = Collections.emptyList();
            this.randomReward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.reward_ = Collections.emptyList();
            this.randomReward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.CR2S_CityReward_14114.alwaysUseFieldBuilders) {
               this.getRewardFieldBuilder();
               this.getRandomRewardFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.rewardBuilder_ == null) {
               this.reward_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.rewardBuilder_.clear();
            }

            if (this.randomRewardBuilder_ == null) {
               this.randomReward_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.randomRewardBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_CityReward_14114_descriptor;
         }

         public CR2S_CityReward_14114 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.CR2S_CityReward_14114.getDefaultInstance();
         }

         public CR2S_CityReward_14114 build() {
            CR2S_CityReward_14114 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_CityReward_14114 buildPartial() {
            CR2S_CityReward_14114 result = new CR2S_CityReward_14114(this);
            int from_bitField0_ = this.bitField0_;
            if (this.rewardBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.reward_ = Collections.unmodifiableList(this.reward_);
                  this.bitField0_ &= -2;
               }

               result.reward_ = this.reward_;
            } else {
               result.reward_ = this.rewardBuilder_.build();
            }

            if (this.randomRewardBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.randomReward_ = Collections.unmodifiableList(this.randomReward_);
                  this.bitField0_ &= -3;
               }

               result.randomReward_ = this.randomReward_;
            } else {
               result.randomReward_ = this.randomRewardBuilder_.build();
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
            if (other instanceof CR2S_CityReward_14114) {
               return this.mergeFrom((CR2S_CityReward_14114)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_CityReward_14114 other) {
            if (other == CrossDemonStrikesMsg.CR2S_CityReward_14114.getDefaultInstance()) {
               return this;
            } else {
               if (this.rewardBuilder_ == null) {
                  if (!other.reward_.isEmpty()) {
                     if (this.reward_.isEmpty()) {
                        this.reward_ = other.reward_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureRewardIsMutable();
                        this.reward_.addAll(other.reward_);
                     }

                     this.onChanged();
                  }
               } else if (!other.reward_.isEmpty()) {
                  if (this.rewardBuilder_.isEmpty()) {
                     this.rewardBuilder_.dispose();
                     this.rewardBuilder_ = null;
                     this.reward_ = other.reward_;
                     this.bitField0_ &= -2;
                     this.rewardBuilder_ = CrossDemonStrikesMsg.CR2S_CityReward_14114.alwaysUseFieldBuilders ? this.getRewardFieldBuilder() : null;
                  } else {
                     this.rewardBuilder_.addAllMessages(other.reward_);
                  }
               }

               if (this.randomRewardBuilder_ == null) {
                  if (!other.randomReward_.isEmpty()) {
                     if (this.randomReward_.isEmpty()) {
                        this.randomReward_ = other.randomReward_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureRandomRewardIsMutable();
                        this.randomReward_.addAll(other.randomReward_);
                     }

                     this.onChanged();
                  }
               } else if (!other.randomReward_.isEmpty()) {
                  if (this.randomRewardBuilder_.isEmpty()) {
                     this.randomRewardBuilder_.dispose();
                     this.randomRewardBuilder_ = null;
                     this.randomReward_ = other.randomReward_;
                     this.bitField0_ &= -3;
                     this.randomRewardBuilder_ = CrossDemonStrikesMsg.CR2S_CityReward_14114.alwaysUseFieldBuilders ? this.getRandomRewardFieldBuilder() : null;
                  } else {
                     this.randomRewardBuilder_.addAllMessages(other.randomReward_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getRewardCount(); ++i) {
               if (!this.getReward(i).isInitialized()) {
                  return false;
               }
            }

            for(int i = 0; i < this.getRandomRewardCount(); ++i) {
               if (!this.getRandomReward(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_CityReward_14114 parsedMessage = null;

            try {
               parsedMessage = (CR2S_CityReward_14114)CrossDemonStrikesMsg.CR2S_CityReward_14114.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_CityReward_14114)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRewardIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.reward_ = new ArrayList(this.reward_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MapDataII> getRewardList() {
            return this.rewardBuilder_ == null ? Collections.unmodifiableList(this.reward_) : this.rewardBuilder_.getMessageList();
         }

         public int getRewardCount() {
            return this.rewardBuilder_ == null ? this.reward_.size() : this.rewardBuilder_.getCount();
         }

         public CommonMsg.MapDataII getReward(int index) {
            return this.rewardBuilder_ == null ? (CommonMsg.MapDataII)this.reward_.get(index) : (CommonMsg.MapDataII)this.rewardBuilder_.getMessage(index);
         }

         public Builder setReward(int index, CommonMsg.MapDataII value) {
            if (this.rewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardIsMutable();
               this.reward_.set(index, value);
               this.onChanged();
            } else {
               this.rewardBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setReward(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addReward(CommonMsg.MapDataII value) {
            if (this.rewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardIsMutable();
               this.reward_.add(value);
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addReward(int index, CommonMsg.MapDataII value) {
            if (this.rewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardIsMutable();
               this.reward_.add(index, value);
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addReward(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addReward(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllReward(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.reward_);
               this.onChanged();
            } else {
               this.rewardBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearReward() {
            if (this.rewardBuilder_ == null) {
               this.reward_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.rewardBuilder_.clear();
            }

            return this;
         }

         public Builder removeReward(int index) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.remove(index);
               this.onChanged();
            } else {
               this.rewardBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getRewardBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getRewardFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getRewardOrBuilder(int index) {
            return this.rewardBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.reward_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.rewardBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getRewardOrBuilderList() {
            return this.rewardBuilder_ != null ? this.rewardBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.reward_);
         }

         public CommonMsg.MapDataII.Builder addRewardBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getRewardFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addRewardBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getRewardFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getRewardBuilderList() {
            return this.getRewardFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getRewardFieldBuilder() {
            if (this.rewardBuilder_ == null) {
               this.rewardBuilder_ = new RepeatedFieldBuilderV3(this.reward_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.reward_ = null;
            }

            return this.rewardBuilder_;
         }

         private void ensureRandomRewardIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.randomReward_ = new ArrayList(this.randomReward_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.MapDataII> getRandomRewardList() {
            return this.randomRewardBuilder_ == null ? Collections.unmodifiableList(this.randomReward_) : this.randomRewardBuilder_.getMessageList();
         }

         public int getRandomRewardCount() {
            return this.randomRewardBuilder_ == null ? this.randomReward_.size() : this.randomRewardBuilder_.getCount();
         }

         public CommonMsg.MapDataII getRandomReward(int index) {
            return this.randomRewardBuilder_ == null ? (CommonMsg.MapDataII)this.randomReward_.get(index) : (CommonMsg.MapDataII)this.randomRewardBuilder_.getMessage(index);
         }

         public Builder setRandomReward(int index, CommonMsg.MapDataII value) {
            if (this.randomRewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRandomRewardIsMutable();
               this.randomReward_.set(index, value);
               this.onChanged();
            } else {
               this.randomRewardBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRandomReward(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.randomRewardBuilder_ == null) {
               this.ensureRandomRewardIsMutable();
               this.randomReward_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.randomRewardBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRandomReward(CommonMsg.MapDataII value) {
            if (this.randomRewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRandomRewardIsMutable();
               this.randomReward_.add(value);
               this.onChanged();
            } else {
               this.randomRewardBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRandomReward(int index, CommonMsg.MapDataII value) {
            if (this.randomRewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRandomRewardIsMutable();
               this.randomReward_.add(index, value);
               this.onChanged();
            } else {
               this.randomRewardBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRandomReward(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.randomRewardBuilder_ == null) {
               this.ensureRandomRewardIsMutable();
               this.randomReward_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.randomRewardBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRandomReward(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.randomRewardBuilder_ == null) {
               this.ensureRandomRewardIsMutable();
               this.randomReward_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.randomRewardBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRandomReward(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.randomRewardBuilder_ == null) {
               this.ensureRandomRewardIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.randomReward_);
               this.onChanged();
            } else {
               this.randomRewardBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRandomReward() {
            if (this.randomRewardBuilder_ == null) {
               this.randomReward_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.randomRewardBuilder_.clear();
            }

            return this;
         }

         public Builder removeRandomReward(int index) {
            if (this.randomRewardBuilder_ == null) {
               this.ensureRandomRewardIsMutable();
               this.randomReward_.remove(index);
               this.onChanged();
            } else {
               this.randomRewardBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getRandomRewardBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getRandomRewardFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getRandomRewardOrBuilder(int index) {
            return this.randomRewardBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.randomReward_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.randomRewardBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getRandomRewardOrBuilderList() {
            return this.randomRewardBuilder_ != null ? this.randomRewardBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.randomReward_);
         }

         public CommonMsg.MapDataII.Builder addRandomRewardBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getRandomRewardFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addRandomRewardBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getRandomRewardFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getRandomRewardBuilderList() {
            return this.getRandomRewardFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getRandomRewardFieldBuilder() {
            if (this.randomRewardBuilder_ == null) {
               this.randomRewardBuilder_ = new RepeatedFieldBuilderV3(this.randomReward_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.randomReward_ = null;
            }

            return this.randomRewardBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_AttackNpc_14115 extends GeneratedMessageV3 implements S2CR_AttackNpc_14115OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CITYID_FIELD_NUMBER = 1;
      private int cityId_;
      public static final int UID_FIELD_NUMBER = 2;
      private int uid_;
      private byte memoizedIsInitialized;
      private static final S2CR_AttackNpc_14115 DEFAULT_INSTANCE = new S2CR_AttackNpc_14115();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_AttackNpc_14115> PARSER = new AbstractParser<S2CR_AttackNpc_14115>() {
         public S2CR_AttackNpc_14115 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_AttackNpc_14115(input, extensionRegistry);
         }
      };

      private S2CR_AttackNpc_14115(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_AttackNpc_14115() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_AttackNpc_14115();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_AttackNpc_14115(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.cityId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.uid_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_AttackNpc_14115_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_AttackNpc_14115_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_AttackNpc_14115.class, Builder.class);
      }

      public boolean hasCityId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCityId() {
         return this.cityId_;
      }

      public boolean hasUid() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getUid() {
         return this.uid_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCityId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasUid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.cityId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.uid_);
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
               size += CodedOutputStream.computeInt32Size(1, this.cityId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.uid_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_AttackNpc_14115)) {
            return super.equals(obj);
         } else {
            S2CR_AttackNpc_14115 other = (S2CR_AttackNpc_14115)obj;
            if (this.hasCityId() != other.hasCityId()) {
               return false;
            } else if (this.hasCityId() && this.getCityId() != other.getCityId()) {
               return false;
            } else if (this.hasUid() != other.hasUid()) {
               return false;
            } else if (this.hasUid() && this.getUid() != other.getUid()) {
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
            if (this.hasCityId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCityId();
            }

            if (this.hasUid()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getUid();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_AttackNpc_14115 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_AttackNpc_14115)PARSER.parseFrom(data);
      }

      public static S2CR_AttackNpc_14115 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AttackNpc_14115)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AttackNpc_14115 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_AttackNpc_14115)PARSER.parseFrom(data);
      }

      public static S2CR_AttackNpc_14115 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AttackNpc_14115)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AttackNpc_14115 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_AttackNpc_14115)PARSER.parseFrom(data);
      }

      public static S2CR_AttackNpc_14115 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AttackNpc_14115)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AttackNpc_14115 parseFrom(InputStream input) throws IOException {
         return (S2CR_AttackNpc_14115)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_AttackNpc_14115 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AttackNpc_14115)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_AttackNpc_14115 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_AttackNpc_14115)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_AttackNpc_14115 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AttackNpc_14115)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_AttackNpc_14115 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_AttackNpc_14115)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_AttackNpc_14115 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AttackNpc_14115)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_AttackNpc_14115 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_AttackNpc_14115 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_AttackNpc_14115> parser() {
         return PARSER;
      }

      public Parser<S2CR_AttackNpc_14115> getParserForType() {
         return PARSER;
      }

      public S2CR_AttackNpc_14115 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_AttackNpc_14115OrBuilder {
         private int bitField0_;
         private int cityId_;
         private int uid_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_AttackNpc_14115_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_AttackNpc_14115_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_AttackNpc_14115.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.S2CR_AttackNpc_14115.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.cityId_ = 0;
            this.bitField0_ &= -2;
            this.uid_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_AttackNpc_14115_descriptor;
         }

         public S2CR_AttackNpc_14115 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.S2CR_AttackNpc_14115.getDefaultInstance();
         }

         public S2CR_AttackNpc_14115 build() {
            S2CR_AttackNpc_14115 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_AttackNpc_14115 buildPartial() {
            S2CR_AttackNpc_14115 result = new S2CR_AttackNpc_14115(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.cityId_ = this.cityId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.uid_ = this.uid_;
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
            if (other instanceof S2CR_AttackNpc_14115) {
               return this.mergeFrom((S2CR_AttackNpc_14115)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_AttackNpc_14115 other) {
            if (other == CrossDemonStrikesMsg.S2CR_AttackNpc_14115.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCityId()) {
                  this.setCityId(other.getCityId());
               }

               if (other.hasUid()) {
                  this.setUid(other.getUid());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCityId()) {
               return false;
            } else {
               return this.hasUid();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_AttackNpc_14115 parsedMessage = null;

            try {
               parsedMessage = (S2CR_AttackNpc_14115)CrossDemonStrikesMsg.S2CR_AttackNpc_14115.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_AttackNpc_14115)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCityId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCityId() {
            return this.cityId_;
         }

         public Builder setCityId(int value) {
            this.bitField0_ |= 1;
            this.cityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCityId() {
            this.bitField0_ &= -2;
            this.cityId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUid() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getUid() {
            return this.uid_;
         }

         public Builder setUid(int value) {
            this.bitField0_ |= 2;
            this.uid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUid() {
            this.bitField0_ &= -3;
            this.uid_ = 0;
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

   public static final class CR2S_AttackNpc_14116 extends GeneratedMessageV3 implements CR2S_AttackNpc_14116OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CITYID_FIELD_NUMBER = 1;
      private int cityId_;
      public static final int UID_FIELD_NUMBER = 2;
      private int uid_;
      public static final int REWARD_FIELD_NUMBER = 3;
      private List<CommonMsg.ItemInfo> reward_;
      public static final int BATTLE_FIELD_NUMBER = 4;
      private BattleMsg.S2C_BattleResult_6102 battle_;
      public static final int RESULT_FIELD_NUMBER = 5;
      private int result_;
      private byte memoizedIsInitialized;
      private static final CR2S_AttackNpc_14116 DEFAULT_INSTANCE = new CR2S_AttackNpc_14116();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_AttackNpc_14116> PARSER = new AbstractParser<CR2S_AttackNpc_14116>() {
         public CR2S_AttackNpc_14116 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_AttackNpc_14116(input, extensionRegistry);
         }
      };

      private CR2S_AttackNpc_14116(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_AttackNpc_14116() {
         this.memoizedIsInitialized = -1;
         this.reward_ = Collections.emptyList();
         this.result_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_AttackNpc_14116();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_AttackNpc_14116(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.cityId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.uid_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.reward_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.reward_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        break;
                     case 34:
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.battle_.toBuilder();
                        }

                        this.battle_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.battle_);
                           this.battle_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4;
                        break;
                     case 40:
                        int rawValue = input.readEnum();
                        AtkResult value = CrossDemonStrikesMsg.AtkResult.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(5, rawValue);
                        } else {
                           this.bitField0_ |= 8;
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
               if ((mutable_bitField0_ & 4) != 0) {
                  this.reward_ = Collections.unmodifiableList(this.reward_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_AttackNpc_14116_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_AttackNpc_14116_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_AttackNpc_14116.class, Builder.class);
      }

      public boolean hasCityId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCityId() {
         return this.cityId_;
      }

      public boolean hasUid() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getUid() {
         return this.uid_;
      }

      public List<CommonMsg.ItemInfo> getRewardList() {
         return this.reward_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getRewardOrBuilderList() {
         return this.reward_;
      }

      public int getRewardCount() {
         return this.reward_.size();
      }

      public CommonMsg.ItemInfo getReward(int index) {
         return (CommonMsg.ItemInfo)this.reward_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getRewardOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.reward_.get(index);
      }

      public boolean hasBattle() {
         return (this.bitField0_ & 4) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getBattle() {
         return this.battle_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battle_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleOrBuilder() {
         return this.battle_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battle_;
      }

      public boolean hasResult() {
         return (this.bitField0_ & 8) != 0;
      }

      public AtkResult getResult() {
         AtkResult result = CrossDemonStrikesMsg.AtkResult.valueOf(this.result_);
         return result == null ? CrossDemonStrikesMsg.AtkResult.ATK_SUC : result;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCityId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasUid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRewardCount(); ++i) {
               if (!this.getReward(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            if (this.hasBattle() && !this.getBattle().isInitialized()) {
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
            output.writeInt32(1, this.cityId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.uid_);
         }

         for(int i = 0; i < this.reward_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.reward_.get(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(4, this.getBattle());
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeEnum(5, this.result_);
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
               size += CodedOutputStream.computeInt32Size(1, this.cityId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.uid_);
            }

            for(int i = 0; i < this.reward_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.reward_.get(i));
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(4, this.getBattle());
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeEnumSize(5, this.result_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_AttackNpc_14116)) {
            return super.equals(obj);
         } else {
            CR2S_AttackNpc_14116 other = (CR2S_AttackNpc_14116)obj;
            if (this.hasCityId() != other.hasCityId()) {
               return false;
            } else if (this.hasCityId() && this.getCityId() != other.getCityId()) {
               return false;
            } else if (this.hasUid() != other.hasUid()) {
               return false;
            } else if (this.hasUid() && this.getUid() != other.getUid()) {
               return false;
            } else if (!this.getRewardList().equals(other.getRewardList())) {
               return false;
            } else if (this.hasBattle() != other.hasBattle()) {
               return false;
            } else if (this.hasBattle() && !this.getBattle().equals(other.getBattle())) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
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
            if (this.hasCityId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCityId();
            }

            if (this.hasUid()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getUid();
            }

            if (this.getRewardCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRewardList().hashCode();
            }

            if (this.hasBattle()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getBattle().hashCode();
            }

            if (this.hasResult()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.result_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_AttackNpc_14116 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_AttackNpc_14116)PARSER.parseFrom(data);
      }

      public static CR2S_AttackNpc_14116 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_AttackNpc_14116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_AttackNpc_14116 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_AttackNpc_14116)PARSER.parseFrom(data);
      }

      public static CR2S_AttackNpc_14116 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_AttackNpc_14116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_AttackNpc_14116 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_AttackNpc_14116)PARSER.parseFrom(data);
      }

      public static CR2S_AttackNpc_14116 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_AttackNpc_14116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_AttackNpc_14116 parseFrom(InputStream input) throws IOException {
         return (CR2S_AttackNpc_14116)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_AttackNpc_14116 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_AttackNpc_14116)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_AttackNpc_14116 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_AttackNpc_14116)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_AttackNpc_14116 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_AttackNpc_14116)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_AttackNpc_14116 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_AttackNpc_14116)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_AttackNpc_14116 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_AttackNpc_14116)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_AttackNpc_14116 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_AttackNpc_14116 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_AttackNpc_14116> parser() {
         return PARSER;
      }

      public Parser<CR2S_AttackNpc_14116> getParserForType() {
         return PARSER;
      }

      public CR2S_AttackNpc_14116 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_AttackNpc_14116OrBuilder {
         private int bitField0_;
         private int cityId_;
         private int uid_;
         private List<CommonMsg.ItemInfo> reward_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> rewardBuilder_;
         private BattleMsg.S2C_BattleResult_6102 battle_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> battleBuilder_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_AttackNpc_14116_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_AttackNpc_14116_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_AttackNpc_14116.class, Builder.class);
         }

         private Builder() {
            this.reward_ = Collections.emptyList();
            this.result_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.reward_ = Collections.emptyList();
            this.result_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.CR2S_AttackNpc_14116.alwaysUseFieldBuilders) {
               this.getRewardFieldBuilder();
               this.getBattleFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.cityId_ = 0;
            this.bitField0_ &= -2;
            this.uid_ = 0;
            this.bitField0_ &= -3;
            if (this.rewardBuilder_ == null) {
               this.reward_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.rewardBuilder_.clear();
            }

            if (this.battleBuilder_ == null) {
               this.battle_ = null;
            } else {
               this.battleBuilder_.clear();
            }

            this.bitField0_ &= -9;
            this.result_ = 1;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_AttackNpc_14116_descriptor;
         }

         public CR2S_AttackNpc_14116 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.CR2S_AttackNpc_14116.getDefaultInstance();
         }

         public CR2S_AttackNpc_14116 build() {
            CR2S_AttackNpc_14116 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_AttackNpc_14116 buildPartial() {
            CR2S_AttackNpc_14116 result = new CR2S_AttackNpc_14116(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.cityId_ = this.cityId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.uid_ = this.uid_;
               to_bitField0_ |= 2;
            }

            if (this.rewardBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.reward_ = Collections.unmodifiableList(this.reward_);
                  this.bitField0_ &= -5;
               }

               result.reward_ = this.reward_;
            } else {
               result.reward_ = this.rewardBuilder_.build();
            }

            if ((from_bitField0_ & 8) != 0) {
               if (this.battleBuilder_ == null) {
                  result.battle_ = this.battle_;
               } else {
                  result.battle_ = (BattleMsg.S2C_BattleResult_6102)this.battleBuilder_.build();
               }

               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 16) != 0) {
               to_bitField0_ |= 8;
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
            if (other instanceof CR2S_AttackNpc_14116) {
               return this.mergeFrom((CR2S_AttackNpc_14116)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_AttackNpc_14116 other) {
            if (other == CrossDemonStrikesMsg.CR2S_AttackNpc_14116.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCityId()) {
                  this.setCityId(other.getCityId());
               }

               if (other.hasUid()) {
                  this.setUid(other.getUid());
               }

               if (this.rewardBuilder_ == null) {
                  if (!other.reward_.isEmpty()) {
                     if (this.reward_.isEmpty()) {
                        this.reward_ = other.reward_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureRewardIsMutable();
                        this.reward_.addAll(other.reward_);
                     }

                     this.onChanged();
                  }
               } else if (!other.reward_.isEmpty()) {
                  if (this.rewardBuilder_.isEmpty()) {
                     this.rewardBuilder_.dispose();
                     this.rewardBuilder_ = null;
                     this.reward_ = other.reward_;
                     this.bitField0_ &= -5;
                     this.rewardBuilder_ = CrossDemonStrikesMsg.CR2S_AttackNpc_14116.alwaysUseFieldBuilders ? this.getRewardFieldBuilder() : null;
                  } else {
                     this.rewardBuilder_.addAllMessages(other.reward_);
                  }
               }

               if (other.hasBattle()) {
                  this.mergeBattle(other.getBattle());
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
            if (!this.hasCityId()) {
               return false;
            } else if (!this.hasUid()) {
               return false;
            } else if (!this.hasResult()) {
               return false;
            } else {
               for(int i = 0; i < this.getRewardCount(); ++i) {
                  if (!this.getReward(i).isInitialized()) {
                     return false;
                  }
               }

               if (this.hasBattle() && !this.getBattle().isInitialized()) {
                  return false;
               } else {
                  return true;
               }
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_AttackNpc_14116 parsedMessage = null;

            try {
               parsedMessage = (CR2S_AttackNpc_14116)CrossDemonStrikesMsg.CR2S_AttackNpc_14116.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_AttackNpc_14116)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCityId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCityId() {
            return this.cityId_;
         }

         public Builder setCityId(int value) {
            this.bitField0_ |= 1;
            this.cityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCityId() {
            this.bitField0_ &= -2;
            this.cityId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUid() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getUid() {
            return this.uid_;
         }

         public Builder setUid(int value) {
            this.bitField0_ |= 2;
            this.uid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUid() {
            this.bitField0_ &= -3;
            this.uid_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRewardIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.reward_ = new ArrayList(this.reward_);
               this.bitField0_ |= 4;
            }

         }

         public List<CommonMsg.ItemInfo> getRewardList() {
            return this.rewardBuilder_ == null ? Collections.unmodifiableList(this.reward_) : this.rewardBuilder_.getMessageList();
         }

         public int getRewardCount() {
            return this.rewardBuilder_ == null ? this.reward_.size() : this.rewardBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getReward(int index) {
            return this.rewardBuilder_ == null ? (CommonMsg.ItemInfo)this.reward_.get(index) : (CommonMsg.ItemInfo)this.rewardBuilder_.getMessage(index);
         }

         public Builder setReward(int index, CommonMsg.ItemInfo value) {
            if (this.rewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardIsMutable();
               this.reward_.set(index, value);
               this.onChanged();
            } else {
               this.rewardBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setReward(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addReward(CommonMsg.ItemInfo value) {
            if (this.rewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardIsMutable();
               this.reward_.add(value);
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addReward(int index, CommonMsg.ItemInfo value) {
            if (this.rewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardIsMutable();
               this.reward_.add(index, value);
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addReward(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addReward(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllReward(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.reward_);
               this.onChanged();
            } else {
               this.rewardBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearReward() {
            if (this.rewardBuilder_ == null) {
               this.reward_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.rewardBuilder_.clear();
            }

            return this;
         }

         public Builder removeReward(int index) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.remove(index);
               this.onChanged();
            } else {
               this.rewardBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getRewardBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getRewardFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getRewardOrBuilder(int index) {
            return this.rewardBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.reward_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.rewardBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getRewardOrBuilderList() {
            return this.rewardBuilder_ != null ? this.rewardBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.reward_);
         }

         public CommonMsg.ItemInfo.Builder addRewardBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getRewardFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addRewardBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getRewardFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getRewardBuilderList() {
            return this.getRewardFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getRewardFieldBuilder() {
            if (this.rewardBuilder_ == null) {
               this.rewardBuilder_ = new RepeatedFieldBuilderV3(this.reward_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.reward_ = null;
            }

            return this.rewardBuilder_;
         }

         public boolean hasBattle() {
            return (this.bitField0_ & 8) != 0;
         }

         public BattleMsg.S2C_BattleResult_6102 getBattle() {
            if (this.battleBuilder_ == null) {
               return this.battle_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battle_;
            } else {
               return (BattleMsg.S2C_BattleResult_6102)this.battleBuilder_.getMessage();
            }
         }

         public Builder setBattle(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.battle_ = value;
               this.onChanged();
            } else {
               this.battleBuilder_.setMessage(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder setBattle(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.battleBuilder_ == null) {
               this.battle_ = builderForValue.build();
               this.onChanged();
            } else {
               this.battleBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder mergeBattle(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0 && this.battle_ != null && this.battle_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.battle_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.battle_).mergeFrom(value).buildPartial();
               } else {
                  this.battle_ = value;
               }

               this.onChanged();
            } else {
               this.battleBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder clearBattle() {
            if (this.battleBuilder_ == null) {
               this.battle_ = null;
               this.onChanged();
            } else {
               this.battleBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getBattleBuilder() {
            this.bitField0_ |= 8;
            this.onChanged();
            return (BattleMsg.S2C_BattleResult_6102.Builder)this.getBattleFieldBuilder().getBuilder();
         }

         public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleOrBuilder() {
            if (this.battleBuilder_ != null) {
               return (BattleMsg.S2C_BattleResult_6102OrBuilder)this.battleBuilder_.getMessageOrBuilder();
            } else {
               return this.battle_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battle_;
            }
         }

         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> getBattleFieldBuilder() {
            if (this.battleBuilder_ == null) {
               this.battleBuilder_ = new SingleFieldBuilderV3(this.getBattle(), this.getParentForChildren(), this.isClean());
               this.battle_ = null;
            }

            return this.battleBuilder_;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 16) != 0;
         }

         public AtkResult getResult() {
            AtkResult result = CrossDemonStrikesMsg.AtkResult.valueOf(this.result_);
            return result == null ? CrossDemonStrikesMsg.AtkResult.ATK_SUC : result;
         }

         public Builder setResult(AtkResult value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16;
               this.result_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearResult() {
            this.bitField0_ &= -17;
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

   public static final class S2CR_LuckyMain_14117 extends GeneratedMessageV3 implements S2CR_LuckyMain_14117OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_LuckyMain_14117 DEFAULT_INSTANCE = new S2CR_LuckyMain_14117();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_LuckyMain_14117> PARSER = new AbstractParser<S2CR_LuckyMain_14117>() {
         public S2CR_LuckyMain_14117 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_LuckyMain_14117(input, extensionRegistry);
         }
      };

      private S2CR_LuckyMain_14117(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_LuckyMain_14117() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_LuckyMain_14117();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_LuckyMain_14117(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_LuckyMain_14117_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_LuckyMain_14117_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_LuckyMain_14117.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_LuckyMain_14117)) {
            return super.equals(obj);
         } else {
            S2CR_LuckyMain_14117 other = (S2CR_LuckyMain_14117)obj;
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

      public static S2CR_LuckyMain_14117 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_LuckyMain_14117)PARSER.parseFrom(data);
      }

      public static S2CR_LuckyMain_14117 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_LuckyMain_14117)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_LuckyMain_14117 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_LuckyMain_14117)PARSER.parseFrom(data);
      }

      public static S2CR_LuckyMain_14117 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_LuckyMain_14117)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_LuckyMain_14117 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_LuckyMain_14117)PARSER.parseFrom(data);
      }

      public static S2CR_LuckyMain_14117 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_LuckyMain_14117)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_LuckyMain_14117 parseFrom(InputStream input) throws IOException {
         return (S2CR_LuckyMain_14117)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_LuckyMain_14117 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_LuckyMain_14117)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_LuckyMain_14117 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_LuckyMain_14117)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_LuckyMain_14117 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_LuckyMain_14117)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_LuckyMain_14117 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_LuckyMain_14117)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_LuckyMain_14117 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_LuckyMain_14117)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_LuckyMain_14117 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_LuckyMain_14117 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_LuckyMain_14117> parser() {
         return PARSER;
      }

      public Parser<S2CR_LuckyMain_14117> getParserForType() {
         return PARSER;
      }

      public S2CR_LuckyMain_14117 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_LuckyMain_14117OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_LuckyMain_14117_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_LuckyMain_14117_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_LuckyMain_14117.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.S2CR_LuckyMain_14117.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_LuckyMain_14117_descriptor;
         }

         public S2CR_LuckyMain_14117 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.S2CR_LuckyMain_14117.getDefaultInstance();
         }

         public S2CR_LuckyMain_14117 build() {
            S2CR_LuckyMain_14117 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_LuckyMain_14117 buildPartial() {
            S2CR_LuckyMain_14117 result = new S2CR_LuckyMain_14117(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_LuckyMain_14117) {
               return this.mergeFrom((S2CR_LuckyMain_14117)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_LuckyMain_14117 other) {
            if (other == CrossDemonStrikesMsg.S2CR_LuckyMain_14117.getDefaultInstance()) {
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
            S2CR_LuckyMain_14117 parsedMessage = null;

            try {
               parsedMessage = (S2CR_LuckyMain_14117)CrossDemonStrikesMsg.S2CR_LuckyMain_14117.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_LuckyMain_14117)e.getUnfinishedMessage();
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

   public static final class S2CR_LuckyReward_14118 extends GeneratedMessageV3 implements S2CR_LuckyReward_14118OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECORD_FIELD_NUMBER = 1;
      private LazyStringList record_;
      private byte memoizedIsInitialized;
      private static final S2CR_LuckyReward_14118 DEFAULT_INSTANCE = new S2CR_LuckyReward_14118();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_LuckyReward_14118> PARSER = new AbstractParser<S2CR_LuckyReward_14118>() {
         public S2CR_LuckyReward_14118 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_LuckyReward_14118(input, extensionRegistry);
         }
      };

      private S2CR_LuckyReward_14118(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_LuckyReward_14118() {
         this.memoizedIsInitialized = -1;
         this.record_ = LazyStringArrayList.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_LuckyReward_14118();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_LuckyReward_14118(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.record_ = new LazyStringArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.record_.add(bs);
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.record_ = this.record_.getUnmodifiableView();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_LuckyReward_14118_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_LuckyReward_14118_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_LuckyReward_14118.class, Builder.class);
      }

      public ProtocolStringList getRecordList() {
         return this.record_;
      }

      public int getRecordCount() {
         return this.record_.size();
      }

      public String getRecord(int index) {
         return (String)this.record_.get(index);
      }

      public ByteString getRecordBytes(int index) {
         return this.record_.getByteString(index);
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
         for(int i = 0; i < this.record_.size(); ++i) {
            GeneratedMessageV3.writeString(output, 1, this.record_.getRaw(i));
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

            for(int i = 0; i < this.record_.size(); ++i) {
               dataSize += computeStringSizeNoTag(this.record_.getRaw(i));
            }

            size += dataSize;
            size += 1 * this.getRecordList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_LuckyReward_14118)) {
            return super.equals(obj);
         } else {
            S2CR_LuckyReward_14118 other = (S2CR_LuckyReward_14118)obj;
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

      public static S2CR_LuckyReward_14118 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_LuckyReward_14118)PARSER.parseFrom(data);
      }

      public static S2CR_LuckyReward_14118 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_LuckyReward_14118)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_LuckyReward_14118 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_LuckyReward_14118)PARSER.parseFrom(data);
      }

      public static S2CR_LuckyReward_14118 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_LuckyReward_14118)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_LuckyReward_14118 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_LuckyReward_14118)PARSER.parseFrom(data);
      }

      public static S2CR_LuckyReward_14118 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_LuckyReward_14118)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_LuckyReward_14118 parseFrom(InputStream input) throws IOException {
         return (S2CR_LuckyReward_14118)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_LuckyReward_14118 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_LuckyReward_14118)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_LuckyReward_14118 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_LuckyReward_14118)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_LuckyReward_14118 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_LuckyReward_14118)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_LuckyReward_14118 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_LuckyReward_14118)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_LuckyReward_14118 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_LuckyReward_14118)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_LuckyReward_14118 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_LuckyReward_14118 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_LuckyReward_14118> parser() {
         return PARSER;
      }

      public Parser<S2CR_LuckyReward_14118> getParserForType() {
         return PARSER;
      }

      public S2CR_LuckyReward_14118 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_LuckyReward_14118OrBuilder {
         private int bitField0_;
         private LazyStringList record_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_LuckyReward_14118_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_LuckyReward_14118_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_LuckyReward_14118.class, Builder.class);
         }

         private Builder() {
            this.record_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.record_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.S2CR_LuckyReward_14118.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.record_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_LuckyReward_14118_descriptor;
         }

         public S2CR_LuckyReward_14118 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.S2CR_LuckyReward_14118.getDefaultInstance();
         }

         public S2CR_LuckyReward_14118 build() {
            S2CR_LuckyReward_14118 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_LuckyReward_14118 buildPartial() {
            S2CR_LuckyReward_14118 result = new S2CR_LuckyReward_14118(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.record_ = this.record_.getUnmodifiableView();
               this.bitField0_ &= -2;
            }

            result.record_ = this.record_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_LuckyReward_14118) {
               return this.mergeFrom((S2CR_LuckyReward_14118)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_LuckyReward_14118 other) {
            if (other == CrossDemonStrikesMsg.S2CR_LuckyReward_14118.getDefaultInstance()) {
               return this;
            } else {
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

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_LuckyReward_14118 parsedMessage = null;

            try {
               parsedMessage = (S2CR_LuckyReward_14118)CrossDemonStrikesMsg.S2CR_LuckyReward_14118.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_LuckyReward_14118)e.getUnfinishedMessage();
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
               this.record_ = new LazyStringArrayList(this.record_);
               this.bitField0_ |= 1;
            }

         }

         public ProtocolStringList getRecordList() {
            return this.record_.getUnmodifiableView();
         }

         public int getRecordCount() {
            return this.record_.size();
         }

         public String getRecord(int index) {
            return (String)this.record_.get(index);
         }

         public ByteString getRecordBytes(int index) {
            return this.record_.getByteString(index);
         }

         public Builder setRecord(int index, String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRecordIsMutable();
               this.record_.set(index, value);
               this.onChanged();
               return this;
            }
         }

         public Builder addRecord(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRecordIsMutable();
               this.record_.add(value);
               this.onChanged();
               return this;
            }
         }

         public Builder addAllRecord(Iterable<String> values) {
            this.ensureRecordIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.record_);
            this.onChanged();
            return this;
         }

         public Builder clearRecord() {
            this.record_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public Builder addRecordBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRecordIsMutable();
               this.record_.add(value);
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

   public static final class CR2S_LuckyReward_14119 extends GeneratedMessageV3 implements CR2S_LuckyReward_14119OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECORD_FIELD_NUMBER = 1;
      private LazyStringList record_;
      private byte memoizedIsInitialized;
      private static final CR2S_LuckyReward_14119 DEFAULT_INSTANCE = new CR2S_LuckyReward_14119();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_LuckyReward_14119> PARSER = new AbstractParser<CR2S_LuckyReward_14119>() {
         public CR2S_LuckyReward_14119 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_LuckyReward_14119(input, extensionRegistry);
         }
      };

      private CR2S_LuckyReward_14119(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_LuckyReward_14119() {
         this.memoizedIsInitialized = -1;
         this.record_ = LazyStringArrayList.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_LuckyReward_14119();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_LuckyReward_14119(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.record_ = new LazyStringArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.record_.add(bs);
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.record_ = this.record_.getUnmodifiableView();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_LuckyReward_14119_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_LuckyReward_14119_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_LuckyReward_14119.class, Builder.class);
      }

      public ProtocolStringList getRecordList() {
         return this.record_;
      }

      public int getRecordCount() {
         return this.record_.size();
      }

      public String getRecord(int index) {
         return (String)this.record_.get(index);
      }

      public ByteString getRecordBytes(int index) {
         return this.record_.getByteString(index);
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
         for(int i = 0; i < this.record_.size(); ++i) {
            GeneratedMessageV3.writeString(output, 1, this.record_.getRaw(i));
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

            for(int i = 0; i < this.record_.size(); ++i) {
               dataSize += computeStringSizeNoTag(this.record_.getRaw(i));
            }

            size += dataSize;
            size += 1 * this.getRecordList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_LuckyReward_14119)) {
            return super.equals(obj);
         } else {
            CR2S_LuckyReward_14119 other = (CR2S_LuckyReward_14119)obj;
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

      public static CR2S_LuckyReward_14119 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_LuckyReward_14119)PARSER.parseFrom(data);
      }

      public static CR2S_LuckyReward_14119 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_LuckyReward_14119)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_LuckyReward_14119 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_LuckyReward_14119)PARSER.parseFrom(data);
      }

      public static CR2S_LuckyReward_14119 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_LuckyReward_14119)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_LuckyReward_14119 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_LuckyReward_14119)PARSER.parseFrom(data);
      }

      public static CR2S_LuckyReward_14119 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_LuckyReward_14119)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_LuckyReward_14119 parseFrom(InputStream input) throws IOException {
         return (CR2S_LuckyReward_14119)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_LuckyReward_14119 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_LuckyReward_14119)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_LuckyReward_14119 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_LuckyReward_14119)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_LuckyReward_14119 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_LuckyReward_14119)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_LuckyReward_14119 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_LuckyReward_14119)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_LuckyReward_14119 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_LuckyReward_14119)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_LuckyReward_14119 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_LuckyReward_14119 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_LuckyReward_14119> parser() {
         return PARSER;
      }

      public Parser<CR2S_LuckyReward_14119> getParserForType() {
         return PARSER;
      }

      public CR2S_LuckyReward_14119 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_LuckyReward_14119OrBuilder {
         private int bitField0_;
         private LazyStringList record_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_LuckyReward_14119_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_LuckyReward_14119_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_LuckyReward_14119.class, Builder.class);
         }

         private Builder() {
            this.record_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.record_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.CR2S_LuckyReward_14119.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.record_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_LuckyReward_14119_descriptor;
         }

         public CR2S_LuckyReward_14119 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.CR2S_LuckyReward_14119.getDefaultInstance();
         }

         public CR2S_LuckyReward_14119 build() {
            CR2S_LuckyReward_14119 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_LuckyReward_14119 buildPartial() {
            CR2S_LuckyReward_14119 result = new CR2S_LuckyReward_14119(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.record_ = this.record_.getUnmodifiableView();
               this.bitField0_ &= -2;
            }

            result.record_ = this.record_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_LuckyReward_14119) {
               return this.mergeFrom((CR2S_LuckyReward_14119)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_LuckyReward_14119 other) {
            if (other == CrossDemonStrikesMsg.CR2S_LuckyReward_14119.getDefaultInstance()) {
               return this;
            } else {
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

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_LuckyReward_14119 parsedMessage = null;

            try {
               parsedMessage = (CR2S_LuckyReward_14119)CrossDemonStrikesMsg.CR2S_LuckyReward_14119.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_LuckyReward_14119)e.getUnfinishedMessage();
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
               this.record_ = new LazyStringArrayList(this.record_);
               this.bitField0_ |= 1;
            }

         }

         public ProtocolStringList getRecordList() {
            return this.record_.getUnmodifiableView();
         }

         public int getRecordCount() {
            return this.record_.size();
         }

         public String getRecord(int index) {
            return (String)this.record_.get(index);
         }

         public ByteString getRecordBytes(int index) {
            return this.record_.getByteString(index);
         }

         public Builder setRecord(int index, String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRecordIsMutable();
               this.record_.set(index, value);
               this.onChanged();
               return this;
            }
         }

         public Builder addRecord(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRecordIsMutable();
               this.record_.add(value);
               this.onChanged();
               return this;
            }
         }

         public Builder addAllRecord(Iterable<String> values) {
            this.ensureRecordIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.record_);
            this.onChanged();
            return this;
         }

         public Builder clearRecord() {
            this.record_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public Builder addRecordBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRecordIsMutable();
               this.record_.add(value);
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

   public static final class CR2S_CityChangeNotify_14120 extends GeneratedMessageV3 implements CR2S_CityChangeNotify_14120OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MSG_FIELD_NUMBER = 1;
      private DemonStrikesMsg.S2C_CityChangeNotify_13912 msg_;
      private byte memoizedIsInitialized;
      private static final CR2S_CityChangeNotify_14120 DEFAULT_INSTANCE = new CR2S_CityChangeNotify_14120();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_CityChangeNotify_14120> PARSER = new AbstractParser<CR2S_CityChangeNotify_14120>() {
         public CR2S_CityChangeNotify_14120 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_CityChangeNotify_14120(input, extensionRegistry);
         }
      };

      private CR2S_CityChangeNotify_14120(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_CityChangeNotify_14120() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_CityChangeNotify_14120();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_CityChangeNotify_14120(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        DemonStrikesMsg.S2C_CityChangeNotify_13912.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.msg_.toBuilder();
                        }

                        this.msg_ = (DemonStrikesMsg.S2C_CityChangeNotify_13912)input.readMessage(DemonStrikesMsg.S2C_CityChangeNotify_13912.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.msg_);
                           this.msg_ = subBuilder.buildPartial();
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
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_CityChangeNotify_14120_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_CityChangeNotify_14120_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_CityChangeNotify_14120.class, Builder.class);
      }

      public boolean hasMsg() {
         return (this.bitField0_ & 1) != 0;
      }

      public DemonStrikesMsg.S2C_CityChangeNotify_13912 getMsg() {
         return this.msg_ == null ? DemonStrikesMsg.S2C_CityChangeNotify_13912.getDefaultInstance() : this.msg_;
      }

      public DemonStrikesMsg.S2C_CityChangeNotify_13912OrBuilder getMsgOrBuilder() {
         return this.msg_ == null ? DemonStrikesMsg.S2C_CityChangeNotify_13912.getDefaultInstance() : this.msg_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMsg()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getMsg().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getMsg());
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
               size += CodedOutputStream.computeMessageSize(1, this.getMsg());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_CityChangeNotify_14120)) {
            return super.equals(obj);
         } else {
            CR2S_CityChangeNotify_14120 other = (CR2S_CityChangeNotify_14120)obj;
            if (this.hasMsg() != other.hasMsg()) {
               return false;
            } else if (this.hasMsg() && !this.getMsg().equals(other.getMsg())) {
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
            if (this.hasMsg()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMsg().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_CityChangeNotify_14120 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_CityChangeNotify_14120)PARSER.parseFrom(data);
      }

      public static CR2S_CityChangeNotify_14120 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_CityChangeNotify_14120)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_CityChangeNotify_14120 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_CityChangeNotify_14120)PARSER.parseFrom(data);
      }

      public static CR2S_CityChangeNotify_14120 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_CityChangeNotify_14120)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_CityChangeNotify_14120 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_CityChangeNotify_14120)PARSER.parseFrom(data);
      }

      public static CR2S_CityChangeNotify_14120 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_CityChangeNotify_14120)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_CityChangeNotify_14120 parseFrom(InputStream input) throws IOException {
         return (CR2S_CityChangeNotify_14120)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_CityChangeNotify_14120 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_CityChangeNotify_14120)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_CityChangeNotify_14120 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_CityChangeNotify_14120)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_CityChangeNotify_14120 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_CityChangeNotify_14120)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_CityChangeNotify_14120 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_CityChangeNotify_14120)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_CityChangeNotify_14120 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_CityChangeNotify_14120)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_CityChangeNotify_14120 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_CityChangeNotify_14120 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_CityChangeNotify_14120> parser() {
         return PARSER;
      }

      public Parser<CR2S_CityChangeNotify_14120> getParserForType() {
         return PARSER;
      }

      public CR2S_CityChangeNotify_14120 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_CityChangeNotify_14120OrBuilder {
         private int bitField0_;
         private DemonStrikesMsg.S2C_CityChangeNotify_13912 msg_;
         private SingleFieldBuilderV3<DemonStrikesMsg.S2C_CityChangeNotify_13912, DemonStrikesMsg.S2C_CityChangeNotify_13912.Builder, DemonStrikesMsg.S2C_CityChangeNotify_13912OrBuilder> msgBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_CityChangeNotify_14120_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_CityChangeNotify_14120_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_CityChangeNotify_14120.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.CR2S_CityChangeNotify_14120.alwaysUseFieldBuilders) {
               this.getMsgFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.msgBuilder_ == null) {
               this.msg_ = null;
            } else {
               this.msgBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_CityChangeNotify_14120_descriptor;
         }

         public CR2S_CityChangeNotify_14120 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.CR2S_CityChangeNotify_14120.getDefaultInstance();
         }

         public CR2S_CityChangeNotify_14120 build() {
            CR2S_CityChangeNotify_14120 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_CityChangeNotify_14120 buildPartial() {
            CR2S_CityChangeNotify_14120 result = new CR2S_CityChangeNotify_14120(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.msgBuilder_ == null) {
                  result.msg_ = this.msg_;
               } else {
                  result.msg_ = (DemonStrikesMsg.S2C_CityChangeNotify_13912)this.msgBuilder_.build();
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
            if (other instanceof CR2S_CityChangeNotify_14120) {
               return this.mergeFrom((CR2S_CityChangeNotify_14120)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_CityChangeNotify_14120 other) {
            if (other == CrossDemonStrikesMsg.CR2S_CityChangeNotify_14120.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMsg()) {
                  this.mergeMsg(other.getMsg());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasMsg()) {
               return false;
            } else {
               return this.getMsg().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_CityChangeNotify_14120 parsedMessage = null;

            try {
               parsedMessage = (CR2S_CityChangeNotify_14120)CrossDemonStrikesMsg.CR2S_CityChangeNotify_14120.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_CityChangeNotify_14120)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMsg() {
            return (this.bitField0_ & 1) != 0;
         }

         public DemonStrikesMsg.S2C_CityChangeNotify_13912 getMsg() {
            if (this.msgBuilder_ == null) {
               return this.msg_ == null ? DemonStrikesMsg.S2C_CityChangeNotify_13912.getDefaultInstance() : this.msg_;
            } else {
               return (DemonStrikesMsg.S2C_CityChangeNotify_13912)this.msgBuilder_.getMessage();
            }
         }

         public Builder setMsg(DemonStrikesMsg.S2C_CityChangeNotify_13912 value) {
            if (this.msgBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.msg_ = value;
               this.onChanged();
            } else {
               this.msgBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setMsg(DemonStrikesMsg.S2C_CityChangeNotify_13912.Builder builderForValue) {
            if (this.msgBuilder_ == null) {
               this.msg_ = builderForValue.build();
               this.onChanged();
            } else {
               this.msgBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeMsg(DemonStrikesMsg.S2C_CityChangeNotify_13912 value) {
            if (this.msgBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.msg_ != null && this.msg_ != DemonStrikesMsg.S2C_CityChangeNotify_13912.getDefaultInstance()) {
                  this.msg_ = DemonStrikesMsg.S2C_CityChangeNotify_13912.newBuilder(this.msg_).mergeFrom(value).buildPartial();
               } else {
                  this.msg_ = value;
               }

               this.onChanged();
            } else {
               this.msgBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearMsg() {
            if (this.msgBuilder_ == null) {
               this.msg_ = null;
               this.onChanged();
            } else {
               this.msgBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public DemonStrikesMsg.S2C_CityChangeNotify_13912.Builder getMsgBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (DemonStrikesMsg.S2C_CityChangeNotify_13912.Builder)this.getMsgFieldBuilder().getBuilder();
         }

         public DemonStrikesMsg.S2C_CityChangeNotify_13912OrBuilder getMsgOrBuilder() {
            if (this.msgBuilder_ != null) {
               return (DemonStrikesMsg.S2C_CityChangeNotify_13912OrBuilder)this.msgBuilder_.getMessageOrBuilder();
            } else {
               return this.msg_ == null ? DemonStrikesMsg.S2C_CityChangeNotify_13912.getDefaultInstance() : this.msg_;
            }
         }

         private SingleFieldBuilderV3<DemonStrikesMsg.S2C_CityChangeNotify_13912, DemonStrikesMsg.S2C_CityChangeNotify_13912.Builder, DemonStrikesMsg.S2C_CityChangeNotify_13912OrBuilder> getMsgFieldBuilder() {
            if (this.msgBuilder_ == null) {
               this.msgBuilder_ = new SingleFieldBuilderV3(this.getMsg(), this.getParentForChildren(), this.isClean());
               this.msg_ = null;
            }

            return this.msgBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_UploadPlayerData_14121 extends GeneratedMessageV3 implements S2CR_UploadPlayerData_14121OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ARRAYING_FIELD_NUMBER = 1;
      private ByteString arraying_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadPlayerData_14121 DEFAULT_INSTANCE = new S2CR_UploadPlayerData_14121();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadPlayerData_14121> PARSER = new AbstractParser<S2CR_UploadPlayerData_14121>() {
         public S2CR_UploadPlayerData_14121 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadPlayerData_14121(input, extensionRegistry);
         }
      };

      private S2CR_UploadPlayerData_14121(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadPlayerData_14121() {
         this.memoizedIsInitialized = -1;
         this.arraying_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadPlayerData_14121();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadPlayerData_14121(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_UploadPlayerData_14121_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_UploadPlayerData_14121_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadPlayerData_14121.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_UploadPlayerData_14121)) {
            return super.equals(obj);
         } else {
            S2CR_UploadPlayerData_14121 other = (S2CR_UploadPlayerData_14121)obj;
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

      public static S2CR_UploadPlayerData_14121 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadPlayerData_14121)PARSER.parseFrom(data);
      }

      public static S2CR_UploadPlayerData_14121 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadPlayerData_14121)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadPlayerData_14121 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadPlayerData_14121)PARSER.parseFrom(data);
      }

      public static S2CR_UploadPlayerData_14121 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadPlayerData_14121)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadPlayerData_14121 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadPlayerData_14121)PARSER.parseFrom(data);
      }

      public static S2CR_UploadPlayerData_14121 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadPlayerData_14121)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadPlayerData_14121 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadPlayerData_14121)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadPlayerData_14121 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadPlayerData_14121)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadPlayerData_14121 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadPlayerData_14121)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadPlayerData_14121 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadPlayerData_14121)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadPlayerData_14121 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadPlayerData_14121)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadPlayerData_14121 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadPlayerData_14121)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadPlayerData_14121 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadPlayerData_14121 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadPlayerData_14121> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadPlayerData_14121> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadPlayerData_14121 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadPlayerData_14121OrBuilder {
         private int bitField0_;
         private ByteString arraying_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_UploadPlayerData_14121_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_UploadPlayerData_14121_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadPlayerData_14121.class, Builder.class);
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
            if (CrossDemonStrikesMsg.S2CR_UploadPlayerData_14121.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.arraying_ = ByteString.EMPTY;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_UploadPlayerData_14121_descriptor;
         }

         public S2CR_UploadPlayerData_14121 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.S2CR_UploadPlayerData_14121.getDefaultInstance();
         }

         public S2CR_UploadPlayerData_14121 build() {
            S2CR_UploadPlayerData_14121 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadPlayerData_14121 buildPartial() {
            S2CR_UploadPlayerData_14121 result = new S2CR_UploadPlayerData_14121(this);
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
            if (other instanceof S2CR_UploadPlayerData_14121) {
               return this.mergeFrom((S2CR_UploadPlayerData_14121)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadPlayerData_14121 other) {
            if (other == CrossDemonStrikesMsg.S2CR_UploadPlayerData_14121.getDefaultInstance()) {
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
            S2CR_UploadPlayerData_14121 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadPlayerData_14121)CrossDemonStrikesMsg.S2CR_UploadPlayerData_14121.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadPlayerData_14121)e.getUnfinishedMessage();
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
            this.arraying_ = CrossDemonStrikesMsg.S2CR_UploadPlayerData_14121.getDefaultInstance().getArraying();
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

   public static final class CR2S_NpcAtkPLayer_14122 extends GeneratedMessageV3 implements CR2S_NpcAtkPLayer_14122OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BATTLE_FIELD_NUMBER = 1;
      private BattleMsg.S2C_BattleResult_6102 battle_;
      private byte memoizedIsInitialized;
      private static final CR2S_NpcAtkPLayer_14122 DEFAULT_INSTANCE = new CR2S_NpcAtkPLayer_14122();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_NpcAtkPLayer_14122> PARSER = new AbstractParser<CR2S_NpcAtkPLayer_14122>() {
         public CR2S_NpcAtkPLayer_14122 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_NpcAtkPLayer_14122(input, extensionRegistry);
         }
      };

      private CR2S_NpcAtkPLayer_14122(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_NpcAtkPLayer_14122() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_NpcAtkPLayer_14122();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_NpcAtkPLayer_14122(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           subBuilder = this.battle_.toBuilder();
                        }

                        this.battle_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.battle_);
                           this.battle_ = subBuilder.buildPartial();
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
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_NpcAtkPLayer_14122_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_NpcAtkPLayer_14122_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_NpcAtkPLayer_14122.class, Builder.class);
      }

      public boolean hasBattle() {
         return (this.bitField0_ & 1) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getBattle() {
         return this.battle_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battle_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleOrBuilder() {
         return this.battle_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battle_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBattle()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getBattle().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getBattle());
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
               size += CodedOutputStream.computeMessageSize(1, this.getBattle());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_NpcAtkPLayer_14122)) {
            return super.equals(obj);
         } else {
            CR2S_NpcAtkPLayer_14122 other = (CR2S_NpcAtkPLayer_14122)obj;
            if (this.hasBattle() != other.hasBattle()) {
               return false;
            } else if (this.hasBattle() && !this.getBattle().equals(other.getBattle())) {
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
            if (this.hasBattle()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBattle().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_NpcAtkPLayer_14122 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_NpcAtkPLayer_14122)PARSER.parseFrom(data);
      }

      public static CR2S_NpcAtkPLayer_14122 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_NpcAtkPLayer_14122)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_NpcAtkPLayer_14122 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_NpcAtkPLayer_14122)PARSER.parseFrom(data);
      }

      public static CR2S_NpcAtkPLayer_14122 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_NpcAtkPLayer_14122)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_NpcAtkPLayer_14122 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_NpcAtkPLayer_14122)PARSER.parseFrom(data);
      }

      public static CR2S_NpcAtkPLayer_14122 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_NpcAtkPLayer_14122)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_NpcAtkPLayer_14122 parseFrom(InputStream input) throws IOException {
         return (CR2S_NpcAtkPLayer_14122)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_NpcAtkPLayer_14122 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_NpcAtkPLayer_14122)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_NpcAtkPLayer_14122 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_NpcAtkPLayer_14122)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_NpcAtkPLayer_14122 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_NpcAtkPLayer_14122)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_NpcAtkPLayer_14122 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_NpcAtkPLayer_14122)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_NpcAtkPLayer_14122 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_NpcAtkPLayer_14122)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_NpcAtkPLayer_14122 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_NpcAtkPLayer_14122 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_NpcAtkPLayer_14122> parser() {
         return PARSER;
      }

      public Parser<CR2S_NpcAtkPLayer_14122> getParserForType() {
         return PARSER;
      }

      public CR2S_NpcAtkPLayer_14122 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_NpcAtkPLayer_14122OrBuilder {
         private int bitField0_;
         private BattleMsg.S2C_BattleResult_6102 battle_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> battleBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_NpcAtkPLayer_14122_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_NpcAtkPLayer_14122_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_NpcAtkPLayer_14122.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.CR2S_NpcAtkPLayer_14122.alwaysUseFieldBuilders) {
               this.getBattleFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.battleBuilder_ == null) {
               this.battle_ = null;
            } else {
               this.battleBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_NpcAtkPLayer_14122_descriptor;
         }

         public CR2S_NpcAtkPLayer_14122 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.CR2S_NpcAtkPLayer_14122.getDefaultInstance();
         }

         public CR2S_NpcAtkPLayer_14122 build() {
            CR2S_NpcAtkPLayer_14122 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_NpcAtkPLayer_14122 buildPartial() {
            CR2S_NpcAtkPLayer_14122 result = new CR2S_NpcAtkPLayer_14122(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.battleBuilder_ == null) {
                  result.battle_ = this.battle_;
               } else {
                  result.battle_ = (BattleMsg.S2C_BattleResult_6102)this.battleBuilder_.build();
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
            if (other instanceof CR2S_NpcAtkPLayer_14122) {
               return this.mergeFrom((CR2S_NpcAtkPLayer_14122)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_NpcAtkPLayer_14122 other) {
            if (other == CrossDemonStrikesMsg.CR2S_NpcAtkPLayer_14122.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBattle()) {
                  this.mergeBattle(other.getBattle());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBattle()) {
               return false;
            } else {
               return this.getBattle().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_NpcAtkPLayer_14122 parsedMessage = null;

            try {
               parsedMessage = (CR2S_NpcAtkPLayer_14122)CrossDemonStrikesMsg.CR2S_NpcAtkPLayer_14122.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_NpcAtkPLayer_14122)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBattle() {
            return (this.bitField0_ & 1) != 0;
         }

         public BattleMsg.S2C_BattleResult_6102 getBattle() {
            if (this.battleBuilder_ == null) {
               return this.battle_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battle_;
            } else {
               return (BattleMsg.S2C_BattleResult_6102)this.battleBuilder_.getMessage();
            }
         }

         public Builder setBattle(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.battle_ = value;
               this.onChanged();
            } else {
               this.battleBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setBattle(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.battleBuilder_ == null) {
               this.battle_ = builderForValue.build();
               this.onChanged();
            } else {
               this.battleBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeBattle(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.battle_ != null && this.battle_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.battle_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.battle_).mergeFrom(value).buildPartial();
               } else {
                  this.battle_ = value;
               }

               this.onChanged();
            } else {
               this.battleBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearBattle() {
            if (this.battleBuilder_ == null) {
               this.battle_ = null;
               this.onChanged();
            } else {
               this.battleBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getBattleBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (BattleMsg.S2C_BattleResult_6102.Builder)this.getBattleFieldBuilder().getBuilder();
         }

         public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleOrBuilder() {
            if (this.battleBuilder_ != null) {
               return (BattleMsg.S2C_BattleResult_6102OrBuilder)this.battleBuilder_.getMessageOrBuilder();
            } else {
               return this.battle_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battle_;
            }
         }

         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> getBattleFieldBuilder() {
            if (this.battleBuilder_ == null) {
               this.battleBuilder_ = new SingleFieldBuilderV3(this.getBattle(), this.getParentForChildren(), this.isClean());
               this.battle_ = null;
            }

            return this.battleBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_HasRewardNotify_14123 extends GeneratedMessageV3 implements CR2S_HasRewardNotify_14123OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDTIME_FIELD_NUMBER = 1;
      private int rewardTime_;
      private byte memoizedIsInitialized;
      private static final CR2S_HasRewardNotify_14123 DEFAULT_INSTANCE = new CR2S_HasRewardNotify_14123();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_HasRewardNotify_14123> PARSER = new AbstractParser<CR2S_HasRewardNotify_14123>() {
         public CR2S_HasRewardNotify_14123 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_HasRewardNotify_14123(input, extensionRegistry);
         }
      };

      private CR2S_HasRewardNotify_14123(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_HasRewardNotify_14123() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_HasRewardNotify_14123();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_HasRewardNotify_14123(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.rewardTime_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_HasRewardNotify_14123_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_HasRewardNotify_14123_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_HasRewardNotify_14123.class, Builder.class);
      }

      public boolean hasRewardTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRewardTime() {
         return this.rewardTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRewardTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.rewardTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.rewardTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_HasRewardNotify_14123)) {
            return super.equals(obj);
         } else {
            CR2S_HasRewardNotify_14123 other = (CR2S_HasRewardNotify_14123)obj;
            if (this.hasRewardTime() != other.hasRewardTime()) {
               return false;
            } else if (this.hasRewardTime() && this.getRewardTime() != other.getRewardTime()) {
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
            if (this.hasRewardTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRewardTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_HasRewardNotify_14123 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_HasRewardNotify_14123)PARSER.parseFrom(data);
      }

      public static CR2S_HasRewardNotify_14123 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_HasRewardNotify_14123)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_HasRewardNotify_14123 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_HasRewardNotify_14123)PARSER.parseFrom(data);
      }

      public static CR2S_HasRewardNotify_14123 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_HasRewardNotify_14123)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_HasRewardNotify_14123 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_HasRewardNotify_14123)PARSER.parseFrom(data);
      }

      public static CR2S_HasRewardNotify_14123 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_HasRewardNotify_14123)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_HasRewardNotify_14123 parseFrom(InputStream input) throws IOException {
         return (CR2S_HasRewardNotify_14123)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_HasRewardNotify_14123 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_HasRewardNotify_14123)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_HasRewardNotify_14123 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_HasRewardNotify_14123)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_HasRewardNotify_14123 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_HasRewardNotify_14123)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_HasRewardNotify_14123 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_HasRewardNotify_14123)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_HasRewardNotify_14123 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_HasRewardNotify_14123)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_HasRewardNotify_14123 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_HasRewardNotify_14123 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_HasRewardNotify_14123> parser() {
         return PARSER;
      }

      public Parser<CR2S_HasRewardNotify_14123> getParserForType() {
         return PARSER;
      }

      public CR2S_HasRewardNotify_14123 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_HasRewardNotify_14123OrBuilder {
         private int bitField0_;
         private int rewardTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_HasRewardNotify_14123_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_HasRewardNotify_14123_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_HasRewardNotify_14123.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.CR2S_HasRewardNotify_14123.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardTime_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_HasRewardNotify_14123_descriptor;
         }

         public CR2S_HasRewardNotify_14123 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.CR2S_HasRewardNotify_14123.getDefaultInstance();
         }

         public CR2S_HasRewardNotify_14123 build() {
            CR2S_HasRewardNotify_14123 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_HasRewardNotify_14123 buildPartial() {
            CR2S_HasRewardNotify_14123 result = new CR2S_HasRewardNotify_14123(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rewardTime_ = this.rewardTime_;
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
            if (other instanceof CR2S_HasRewardNotify_14123) {
               return this.mergeFrom((CR2S_HasRewardNotify_14123)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_HasRewardNotify_14123 other) {
            if (other == CrossDemonStrikesMsg.CR2S_HasRewardNotify_14123.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRewardTime()) {
                  this.setRewardTime(other.getRewardTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRewardTime();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_HasRewardNotify_14123 parsedMessage = null;

            try {
               parsedMessage = (CR2S_HasRewardNotify_14123)CrossDemonStrikesMsg.CR2S_HasRewardNotify_14123.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_HasRewardNotify_14123)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRewardTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRewardTime() {
            return this.rewardTime_;
         }

         public Builder setRewardTime(int value) {
            this.bitField0_ |= 1;
            this.rewardTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardTime() {
            this.bitField0_ &= -2;
            this.rewardTime_ = 0;
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

   public static final class CR2S_MapInfo_14124 extends GeneratedMessageV3 implements CR2S_MapInfo_14124OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INCITY_FIELD_NUMBER = 1;
      private int inCity_;
      public static final int CITY_FIELD_NUMBER = 2;
      private List<DemonStrikesMsg.CityInfo> city_;
      private byte memoizedIsInitialized;
      private static final CR2S_MapInfo_14124 DEFAULT_INSTANCE = new CR2S_MapInfo_14124();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_MapInfo_14124> PARSER = new AbstractParser<CR2S_MapInfo_14124>() {
         public CR2S_MapInfo_14124 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_MapInfo_14124(input, extensionRegistry);
         }
      };

      private CR2S_MapInfo_14124(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_MapInfo_14124() {
         this.memoizedIsInitialized = -1;
         this.city_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_MapInfo_14124();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_MapInfo_14124(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.inCity_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.city_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.city_.add(input.readMessage(DemonStrikesMsg.CityInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.city_ = Collections.unmodifiableList(this.city_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_MapInfo_14124_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_MapInfo_14124_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_MapInfo_14124.class, Builder.class);
      }

      public boolean hasInCity() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getInCity() {
         return this.inCity_;
      }

      public List<DemonStrikesMsg.CityInfo> getCityList() {
         return this.city_;
      }

      public List<? extends DemonStrikesMsg.CityInfoOrBuilder> getCityOrBuilderList() {
         return this.city_;
      }

      public int getCityCount() {
         return this.city_.size();
      }

      public DemonStrikesMsg.CityInfo getCity(int index) {
         return (DemonStrikesMsg.CityInfo)this.city_.get(index);
      }

      public DemonStrikesMsg.CityInfoOrBuilder getCityOrBuilder(int index) {
         return (DemonStrikesMsg.CityInfoOrBuilder)this.city_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasInCity()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getCityCount(); ++i) {
               if (!this.getCity(i).isInitialized()) {
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
            output.writeInt32(1, this.inCity_);
         }

         for(int i = 0; i < this.city_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.city_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.inCity_);
            }

            for(int i = 0; i < this.city_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.city_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_MapInfo_14124)) {
            return super.equals(obj);
         } else {
            CR2S_MapInfo_14124 other = (CR2S_MapInfo_14124)obj;
            if (this.hasInCity() != other.hasInCity()) {
               return false;
            } else if (this.hasInCity() && this.getInCity() != other.getInCity()) {
               return false;
            } else if (!this.getCityList().equals(other.getCityList())) {
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
            if (this.hasInCity()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInCity();
            }

            if (this.getCityCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCityList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_MapInfo_14124 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_MapInfo_14124)PARSER.parseFrom(data);
      }

      public static CR2S_MapInfo_14124 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_MapInfo_14124)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_MapInfo_14124 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_MapInfo_14124)PARSER.parseFrom(data);
      }

      public static CR2S_MapInfo_14124 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_MapInfo_14124)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_MapInfo_14124 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_MapInfo_14124)PARSER.parseFrom(data);
      }

      public static CR2S_MapInfo_14124 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_MapInfo_14124)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_MapInfo_14124 parseFrom(InputStream input) throws IOException {
         return (CR2S_MapInfo_14124)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_MapInfo_14124 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_MapInfo_14124)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_MapInfo_14124 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_MapInfo_14124)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_MapInfo_14124 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_MapInfo_14124)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_MapInfo_14124 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_MapInfo_14124)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_MapInfo_14124 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_MapInfo_14124)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_MapInfo_14124 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_MapInfo_14124 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_MapInfo_14124> parser() {
         return PARSER;
      }

      public Parser<CR2S_MapInfo_14124> getParserForType() {
         return PARSER;
      }

      public CR2S_MapInfo_14124 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_MapInfo_14124OrBuilder {
         private int bitField0_;
         private int inCity_;
         private List<DemonStrikesMsg.CityInfo> city_;
         private RepeatedFieldBuilderV3<DemonStrikesMsg.CityInfo, DemonStrikesMsg.CityInfo.Builder, DemonStrikesMsg.CityInfoOrBuilder> cityBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_MapInfo_14124_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_MapInfo_14124_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_MapInfo_14124.class, Builder.class);
         }

         private Builder() {
            this.city_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.city_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.CR2S_MapInfo_14124.alwaysUseFieldBuilders) {
               this.getCityFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.inCity_ = 0;
            this.bitField0_ &= -2;
            if (this.cityBuilder_ == null) {
               this.city_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.cityBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_MapInfo_14124_descriptor;
         }

         public CR2S_MapInfo_14124 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.CR2S_MapInfo_14124.getDefaultInstance();
         }

         public CR2S_MapInfo_14124 build() {
            CR2S_MapInfo_14124 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_MapInfo_14124 buildPartial() {
            CR2S_MapInfo_14124 result = new CR2S_MapInfo_14124(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.inCity_ = this.inCity_;
               to_bitField0_ |= 1;
            }

            if (this.cityBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.city_ = Collections.unmodifiableList(this.city_);
                  this.bitField0_ &= -3;
               }

               result.city_ = this.city_;
            } else {
               result.city_ = this.cityBuilder_.build();
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
            if (other instanceof CR2S_MapInfo_14124) {
               return this.mergeFrom((CR2S_MapInfo_14124)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_MapInfo_14124 other) {
            if (other == CrossDemonStrikesMsg.CR2S_MapInfo_14124.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasInCity()) {
                  this.setInCity(other.getInCity());
               }

               if (this.cityBuilder_ == null) {
                  if (!other.city_.isEmpty()) {
                     if (this.city_.isEmpty()) {
                        this.city_ = other.city_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureCityIsMutable();
                        this.city_.addAll(other.city_);
                     }

                     this.onChanged();
                  }
               } else if (!other.city_.isEmpty()) {
                  if (this.cityBuilder_.isEmpty()) {
                     this.cityBuilder_.dispose();
                     this.cityBuilder_ = null;
                     this.city_ = other.city_;
                     this.bitField0_ &= -3;
                     this.cityBuilder_ = CrossDemonStrikesMsg.CR2S_MapInfo_14124.alwaysUseFieldBuilders ? this.getCityFieldBuilder() : null;
                  } else {
                     this.cityBuilder_.addAllMessages(other.city_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasInCity()) {
               return false;
            } else {
               for(int i = 0; i < this.getCityCount(); ++i) {
                  if (!this.getCity(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_MapInfo_14124 parsedMessage = null;

            try {
               parsedMessage = (CR2S_MapInfo_14124)CrossDemonStrikesMsg.CR2S_MapInfo_14124.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_MapInfo_14124)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasInCity() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getInCity() {
            return this.inCity_;
         }

         public Builder setInCity(int value) {
            this.bitField0_ |= 1;
            this.inCity_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearInCity() {
            this.bitField0_ &= -2;
            this.inCity_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureCityIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.city_ = new ArrayList(this.city_);
               this.bitField0_ |= 2;
            }

         }

         public List<DemonStrikesMsg.CityInfo> getCityList() {
            return this.cityBuilder_ == null ? Collections.unmodifiableList(this.city_) : this.cityBuilder_.getMessageList();
         }

         public int getCityCount() {
            return this.cityBuilder_ == null ? this.city_.size() : this.cityBuilder_.getCount();
         }

         public DemonStrikesMsg.CityInfo getCity(int index) {
            return this.cityBuilder_ == null ? (DemonStrikesMsg.CityInfo)this.city_.get(index) : (DemonStrikesMsg.CityInfo)this.cityBuilder_.getMessage(index);
         }

         public Builder setCity(int index, DemonStrikesMsg.CityInfo value) {
            if (this.cityBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCityIsMutable();
               this.city_.set(index, value);
               this.onChanged();
            } else {
               this.cityBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setCity(int index, DemonStrikesMsg.CityInfo.Builder builderForValue) {
            if (this.cityBuilder_ == null) {
               this.ensureCityIsMutable();
               this.city_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.cityBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addCity(DemonStrikesMsg.CityInfo value) {
            if (this.cityBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCityIsMutable();
               this.city_.add(value);
               this.onChanged();
            } else {
               this.cityBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addCity(int index, DemonStrikesMsg.CityInfo value) {
            if (this.cityBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCityIsMutable();
               this.city_.add(index, value);
               this.onChanged();
            } else {
               this.cityBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addCity(DemonStrikesMsg.CityInfo.Builder builderForValue) {
            if (this.cityBuilder_ == null) {
               this.ensureCityIsMutable();
               this.city_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.cityBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addCity(int index, DemonStrikesMsg.CityInfo.Builder builderForValue) {
            if (this.cityBuilder_ == null) {
               this.ensureCityIsMutable();
               this.city_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.cityBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllCity(Iterable<? extends DemonStrikesMsg.CityInfo> values) {
            if (this.cityBuilder_ == null) {
               this.ensureCityIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.city_);
               this.onChanged();
            } else {
               this.cityBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearCity() {
            if (this.cityBuilder_ == null) {
               this.city_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.cityBuilder_.clear();
            }

            return this;
         }

         public Builder removeCity(int index) {
            if (this.cityBuilder_ == null) {
               this.ensureCityIsMutable();
               this.city_.remove(index);
               this.onChanged();
            } else {
               this.cityBuilder_.remove(index);
            }

            return this;
         }

         public DemonStrikesMsg.CityInfo.Builder getCityBuilder(int index) {
            return (DemonStrikesMsg.CityInfo.Builder)this.getCityFieldBuilder().getBuilder(index);
         }

         public DemonStrikesMsg.CityInfoOrBuilder getCityOrBuilder(int index) {
            return this.cityBuilder_ == null ? (DemonStrikesMsg.CityInfoOrBuilder)this.city_.get(index) : (DemonStrikesMsg.CityInfoOrBuilder)this.cityBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends DemonStrikesMsg.CityInfoOrBuilder> getCityOrBuilderList() {
            return this.cityBuilder_ != null ? this.cityBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.city_);
         }

         public DemonStrikesMsg.CityInfo.Builder addCityBuilder() {
            return (DemonStrikesMsg.CityInfo.Builder)this.getCityFieldBuilder().addBuilder(DemonStrikesMsg.CityInfo.getDefaultInstance());
         }

         public DemonStrikesMsg.CityInfo.Builder addCityBuilder(int index) {
            return (DemonStrikesMsg.CityInfo.Builder)this.getCityFieldBuilder().addBuilder(index, DemonStrikesMsg.CityInfo.getDefaultInstance());
         }

         public List<DemonStrikesMsg.CityInfo.Builder> getCityBuilderList() {
            return this.getCityFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<DemonStrikesMsg.CityInfo, DemonStrikesMsg.CityInfo.Builder, DemonStrikesMsg.CityInfoOrBuilder> getCityFieldBuilder() {
            if (this.cityBuilder_ == null) {
               this.cityBuilder_ = new RepeatedFieldBuilderV3(this.city_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.city_ = null;
            }

            return this.cityBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_GM_14125 extends GeneratedMessageV3 implements S2CR_GM_14125OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CMD_FIELD_NUMBER = 1;
      private volatile Object cmd_;
      public static final int PARAMS_FIELD_NUMBER = 2;
      private Internal.LongList params_;
      private byte memoizedIsInitialized;
      private static final S2CR_GM_14125 DEFAULT_INSTANCE = new S2CR_GM_14125();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_GM_14125> PARSER = new AbstractParser<S2CR_GM_14125>() {
         public S2CR_GM_14125 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_GM_14125(input, extensionRegistry);
         }
      };

      private S2CR_GM_14125(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_GM_14125() {
         this.memoizedIsInitialized = -1;
         this.cmd_ = "";
         this.params_ = emptyLongList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_GM_14125();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_GM_14125(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.cmd_ = bs;
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.params_ = newLongList();
                           mutable_bitField0_ |= 2;
                        }

                        this.params_.addLong(input.readInt64());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.params_ = newLongList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.params_.addLong(input.readInt64());
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
                  this.params_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_GM_14125_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_GM_14125_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GM_14125.class, Builder.class);
      }

      public boolean hasCmd() {
         return (this.bitField0_ & 1) != 0;
      }

      public String getCmd() {
         Object ref = this.cmd_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.cmd_ = s;
            }

            return s;
         }
      }

      public ByteString getCmdBytes() {
         Object ref = this.cmd_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.cmd_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public List<Long> getParamsList() {
         return this.params_;
      }

      public int getParamsCount() {
         return this.params_.size();
      }

      public long getParams(int index) {
         return this.params_.getLong(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCmd()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.cmd_);
         }

         for(int i = 0; i < this.params_.size(); ++i) {
            output.writeInt64(2, this.params_.getLong(i));
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
               size += GeneratedMessageV3.computeStringSize(1, this.cmd_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.params_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt64SizeNoTag(this.params_.getLong(i));
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
         } else if (!(obj instanceof S2CR_GM_14125)) {
            return super.equals(obj);
         } else {
            S2CR_GM_14125 other = (S2CR_GM_14125)obj;
            if (this.hasCmd() != other.hasCmd()) {
               return false;
            } else if (this.hasCmd() && !this.getCmd().equals(other.getCmd())) {
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
            if (this.hasCmd()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCmd().hashCode();
            }

            if (this.getParamsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getParamsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_GM_14125 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_GM_14125)PARSER.parseFrom(data);
      }

      public static S2CR_GM_14125 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GM_14125)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GM_14125 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_GM_14125)PARSER.parseFrom(data);
      }

      public static S2CR_GM_14125 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GM_14125)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GM_14125 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_GM_14125)PARSER.parseFrom(data);
      }

      public static S2CR_GM_14125 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GM_14125)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GM_14125 parseFrom(InputStream input) throws IOException {
         return (S2CR_GM_14125)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GM_14125 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GM_14125)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GM_14125 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_GM_14125)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_GM_14125 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GM_14125)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GM_14125 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_GM_14125)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GM_14125 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GM_14125)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_GM_14125 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_GM_14125 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_GM_14125> parser() {
         return PARSER;
      }

      public Parser<S2CR_GM_14125> getParserForType() {
         return PARSER;
      }

      public S2CR_GM_14125 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_GM_14125OrBuilder {
         private int bitField0_;
         private Object cmd_;
         private Internal.LongList params_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_GM_14125_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_GM_14125_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GM_14125.class, Builder.class);
         }

         private Builder() {
            this.cmd_ = "";
            this.params_ = CrossDemonStrikesMsg.S2CR_GM_14125.emptyLongList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.cmd_ = "";
            this.params_ = CrossDemonStrikesMsg.S2CR_GM_14125.emptyLongList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.S2CR_GM_14125.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.cmd_ = "";
            this.bitField0_ &= -2;
            this.params_ = CrossDemonStrikesMsg.S2CR_GM_14125.emptyLongList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_GM_14125_descriptor;
         }

         public S2CR_GM_14125 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.S2CR_GM_14125.getDefaultInstance();
         }

         public S2CR_GM_14125 build() {
            S2CR_GM_14125 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_GM_14125 buildPartial() {
            S2CR_GM_14125 result = new S2CR_GM_14125(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.cmd_ = this.cmd_;
            if ((this.bitField0_ & 2) != 0) {
               this.params_.makeImmutable();
               this.bitField0_ &= -3;
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
            if (other instanceof S2CR_GM_14125) {
               return this.mergeFrom((S2CR_GM_14125)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_GM_14125 other) {
            if (other == CrossDemonStrikesMsg.S2CR_GM_14125.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCmd()) {
                  this.bitField0_ |= 1;
                  this.cmd_ = other.cmd_;
                  this.onChanged();
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

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCmd();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_GM_14125 parsedMessage = null;

            try {
               parsedMessage = (S2CR_GM_14125)CrossDemonStrikesMsg.S2CR_GM_14125.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_GM_14125)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCmd() {
            return (this.bitField0_ & 1) != 0;
         }

         public String getCmd() {
            Object ref = this.cmd_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.cmd_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getCmdBytes() {
            Object ref = this.cmd_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.cmd_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setCmd(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.cmd_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearCmd() {
            this.bitField0_ &= -2;
            this.cmd_ = CrossDemonStrikesMsg.S2CR_GM_14125.getDefaultInstance().getCmd();
            this.onChanged();
            return this;
         }

         public Builder setCmdBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.cmd_ = value;
               this.onChanged();
               return this;
            }
         }

         private void ensureParamsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.params_ = CrossDemonStrikesMsg.S2CR_GM_14125.mutableCopy(this.params_);
               this.bitField0_ |= 2;
            }

         }

         public List<Long> getParamsList() {
            return (List<Long>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.params_) : this.params_);
         }

         public int getParamsCount() {
            return this.params_.size();
         }

         public long getParams(int index) {
            return this.params_.getLong(index);
         }

         public Builder setParams(int index, long value) {
            this.ensureParamsIsMutable();
            this.params_.setLong(index, value);
            this.onChanged();
            return this;
         }

         public Builder addParams(long value) {
            this.ensureParamsIsMutable();
            this.params_.addLong(value);
            this.onChanged();
            return this;
         }

         public Builder addAllParams(Iterable<? extends Long> values) {
            this.ensureParamsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.params_);
            this.onChanged();
            return this;
         }

         public Builder clearParams() {
            this.params_ = CrossDemonStrikesMsg.S2CR_GM_14125.emptyLongList();
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

   public static final class S2CR_BuyRandomItem_14126 extends GeneratedMessageV3 implements S2CR_BuyRandomItem_14126OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYID_FIELD_NUMBER = 1;
      private int buyId_;
      public static final int BUYNUM_FIELD_NUMBER = 2;
      private int buyNum_;
      private byte memoizedIsInitialized;
      private static final S2CR_BuyRandomItem_14126 DEFAULT_INSTANCE = new S2CR_BuyRandomItem_14126();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_BuyRandomItem_14126> PARSER = new AbstractParser<S2CR_BuyRandomItem_14126>() {
         public S2CR_BuyRandomItem_14126 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_BuyRandomItem_14126(input, extensionRegistry);
         }
      };

      private S2CR_BuyRandomItem_14126(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_BuyRandomItem_14126() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_BuyRandomItem_14126();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_BuyRandomItem_14126(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buyId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.buyNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_BuyRandomItem_14126_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_BuyRandomItem_14126_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_BuyRandomItem_14126.class, Builder.class);
      }

      public boolean hasBuyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuyId() {
         return this.buyId_;
      }

      public boolean hasBuyNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBuyNum() {
         return this.buyNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBuyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuyNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.buyId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.buyNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.buyId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.buyNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_BuyRandomItem_14126)) {
            return super.equals(obj);
         } else {
            S2CR_BuyRandomItem_14126 other = (S2CR_BuyRandomItem_14126)obj;
            if (this.hasBuyId() != other.hasBuyId()) {
               return false;
            } else if (this.hasBuyId() && this.getBuyId() != other.getBuyId()) {
               return false;
            } else if (this.hasBuyNum() != other.hasBuyNum()) {
               return false;
            } else if (this.hasBuyNum() && this.getBuyNum() != other.getBuyNum()) {
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
            if (this.hasBuyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuyId();
            }

            if (this.hasBuyNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuyNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_BuyRandomItem_14126 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_BuyRandomItem_14126)PARSER.parseFrom(data);
      }

      public static S2CR_BuyRandomItem_14126 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BuyRandomItem_14126)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BuyRandomItem_14126 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_BuyRandomItem_14126)PARSER.parseFrom(data);
      }

      public static S2CR_BuyRandomItem_14126 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BuyRandomItem_14126)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BuyRandomItem_14126 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_BuyRandomItem_14126)PARSER.parseFrom(data);
      }

      public static S2CR_BuyRandomItem_14126 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BuyRandomItem_14126)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BuyRandomItem_14126 parseFrom(InputStream input) throws IOException {
         return (S2CR_BuyRandomItem_14126)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_BuyRandomItem_14126 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BuyRandomItem_14126)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_BuyRandomItem_14126 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_BuyRandomItem_14126)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_BuyRandomItem_14126 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BuyRandomItem_14126)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_BuyRandomItem_14126 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_BuyRandomItem_14126)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_BuyRandomItem_14126 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BuyRandomItem_14126)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_BuyRandomItem_14126 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_BuyRandomItem_14126 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_BuyRandomItem_14126> parser() {
         return PARSER;
      }

      public Parser<S2CR_BuyRandomItem_14126> getParserForType() {
         return PARSER;
      }

      public S2CR_BuyRandomItem_14126 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_BuyRandomItem_14126OrBuilder {
         private int bitField0_;
         private int buyId_;
         private int buyNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_BuyRandomItem_14126_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_BuyRandomItem_14126_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_BuyRandomItem_14126.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.S2CR_BuyRandomItem_14126.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyId_ = 0;
            this.bitField0_ &= -2;
            this.buyNum_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_S2CR_BuyRandomItem_14126_descriptor;
         }

         public S2CR_BuyRandomItem_14126 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.S2CR_BuyRandomItem_14126.getDefaultInstance();
         }

         public S2CR_BuyRandomItem_14126 build() {
            S2CR_BuyRandomItem_14126 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_BuyRandomItem_14126 buildPartial() {
            S2CR_BuyRandomItem_14126 result = new S2CR_BuyRandomItem_14126(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buyId_ = this.buyId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.buyNum_ = this.buyNum_;
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
            if (other instanceof S2CR_BuyRandomItem_14126) {
               return this.mergeFrom((S2CR_BuyRandomItem_14126)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_BuyRandomItem_14126 other) {
            if (other == CrossDemonStrikesMsg.S2CR_BuyRandomItem_14126.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuyId()) {
                  this.setBuyId(other.getBuyId());
               }

               if (other.hasBuyNum()) {
                  this.setBuyNum(other.getBuyNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBuyId()) {
               return false;
            } else {
               return this.hasBuyNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_BuyRandomItem_14126 parsedMessage = null;

            try {
               parsedMessage = (S2CR_BuyRandomItem_14126)CrossDemonStrikesMsg.S2CR_BuyRandomItem_14126.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_BuyRandomItem_14126)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuyId() {
            return this.buyId_;
         }

         public Builder setBuyId(int value) {
            this.bitField0_ |= 1;
            this.buyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyId() {
            this.bitField0_ &= -2;
            this.buyId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuyNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBuyNum() {
            return this.buyNum_;
         }

         public Builder setBuyNum(int value) {
            this.bitField0_ |= 2;
            this.buyNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyNum() {
            this.bitField0_ &= -3;
            this.buyNum_ = 0;
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

   public static final class RankSettleData extends GeneratedMessageV3 implements RankSettleDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int RANKTYPEDATA_FIELD_NUMBER = 2;
      private List<CommonMsg.MapDataII> rankTypeData_;
      private byte memoizedIsInitialized;
      private static final RankSettleData DEFAULT_INSTANCE = new RankSettleData();
      /** @deprecated */
      @Deprecated
      public static final Parser<RankSettleData> PARSER = new AbstractParser<RankSettleData>() {
         public RankSettleData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RankSettleData(input, extensionRegistry);
         }
      };

      private RankSettleData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RankSettleData() {
         this.memoizedIsInitialized = -1;
         this.rankTypeData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RankSettleData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RankSettleData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.rankTypeData_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.rankTypeData_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.rankTypeData_ = Collections.unmodifiableList(this.rankTypeData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_RankSettleData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_RankSettleData_fieldAccessorTable.ensureFieldAccessorsInitialized(RankSettleData.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public List<CommonMsg.MapDataII> getRankTypeDataList() {
         return this.rankTypeData_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getRankTypeDataOrBuilderList() {
         return this.rankTypeData_;
      }

      public int getRankTypeDataCount() {
         return this.rankTypeData_.size();
      }

      public CommonMsg.MapDataII getRankTypeData(int index) {
         return (CommonMsg.MapDataII)this.rankTypeData_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getRankTypeDataOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.rankTypeData_.get(index);
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
            for(int i = 0; i < this.getRankTypeDataCount(); ++i) {
               if (!this.getRankTypeData(i).isInitialized()) {
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

         for(int i = 0; i < this.rankTypeData_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.rankTypeData_.get(i));
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

            for(int i = 0; i < this.rankTypeData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.rankTypeData_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RankSettleData)) {
            return super.equals(obj);
         } else {
            RankSettleData other = (RankSettleData)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (!this.getRankTypeDataList().equals(other.getRankTypeDataList())) {
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

            if (this.getRankTypeDataCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRankTypeDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RankSettleData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RankSettleData)PARSER.parseFrom(data);
      }

      public static RankSettleData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankSettleData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankSettleData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RankSettleData)PARSER.parseFrom(data);
      }

      public static RankSettleData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankSettleData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankSettleData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RankSettleData)PARSER.parseFrom(data);
      }

      public static RankSettleData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankSettleData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankSettleData parseFrom(InputStream input) throws IOException {
         return (RankSettleData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RankSettleData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankSettleData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RankSettleData parseDelimitedFrom(InputStream input) throws IOException {
         return (RankSettleData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RankSettleData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankSettleData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RankSettleData parseFrom(CodedInputStream input) throws IOException {
         return (RankSettleData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RankSettleData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankSettleData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RankSettleData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RankSettleData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RankSettleData> parser() {
         return PARSER;
      }

      public Parser<RankSettleData> getParserForType() {
         return PARSER;
      }

      public RankSettleData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RankSettleDataOrBuilder {
         private int bitField0_;
         private int playerId_;
         private List<CommonMsg.MapDataII> rankTypeData_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> rankTypeDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_RankSettleData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_RankSettleData_fieldAccessorTable.ensureFieldAccessorsInitialized(RankSettleData.class, Builder.class);
         }

         private Builder() {
            this.rankTypeData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rankTypeData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.RankSettleData.alwaysUseFieldBuilders) {
               this.getRankTypeDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            if (this.rankTypeDataBuilder_ == null) {
               this.rankTypeData_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.rankTypeDataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_RankSettleData_descriptor;
         }

         public RankSettleData getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.RankSettleData.getDefaultInstance();
         }

         public RankSettleData build() {
            RankSettleData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RankSettleData buildPartial() {
            RankSettleData result = new RankSettleData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if (this.rankTypeDataBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.rankTypeData_ = Collections.unmodifiableList(this.rankTypeData_);
                  this.bitField0_ &= -3;
               }

               result.rankTypeData_ = this.rankTypeData_;
            } else {
               result.rankTypeData_ = this.rankTypeDataBuilder_.build();
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
            if (other instanceof RankSettleData) {
               return this.mergeFrom((RankSettleData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RankSettleData other) {
            if (other == CrossDemonStrikesMsg.RankSettleData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (this.rankTypeDataBuilder_ == null) {
                  if (!other.rankTypeData_.isEmpty()) {
                     if (this.rankTypeData_.isEmpty()) {
                        this.rankTypeData_ = other.rankTypeData_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureRankTypeDataIsMutable();
                        this.rankTypeData_.addAll(other.rankTypeData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.rankTypeData_.isEmpty()) {
                  if (this.rankTypeDataBuilder_.isEmpty()) {
                     this.rankTypeDataBuilder_.dispose();
                     this.rankTypeDataBuilder_ = null;
                     this.rankTypeData_ = other.rankTypeData_;
                     this.bitField0_ &= -3;
                     this.rankTypeDataBuilder_ = CrossDemonStrikesMsg.RankSettleData.alwaysUseFieldBuilders ? this.getRankTypeDataFieldBuilder() : null;
                  } else {
                     this.rankTypeDataBuilder_.addAllMessages(other.rankTypeData_);
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
               for(int i = 0; i < this.getRankTypeDataCount(); ++i) {
                  if (!this.getRankTypeData(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RankSettleData parsedMessage = null;

            try {
               parsedMessage = (RankSettleData)CrossDemonStrikesMsg.RankSettleData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RankSettleData)e.getUnfinishedMessage();
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

         private void ensureRankTypeDataIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.rankTypeData_ = new ArrayList(this.rankTypeData_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.MapDataII> getRankTypeDataList() {
            return this.rankTypeDataBuilder_ == null ? Collections.unmodifiableList(this.rankTypeData_) : this.rankTypeDataBuilder_.getMessageList();
         }

         public int getRankTypeDataCount() {
            return this.rankTypeDataBuilder_ == null ? this.rankTypeData_.size() : this.rankTypeDataBuilder_.getCount();
         }

         public CommonMsg.MapDataII getRankTypeData(int index) {
            return this.rankTypeDataBuilder_ == null ? (CommonMsg.MapDataII)this.rankTypeData_.get(index) : (CommonMsg.MapDataII)this.rankTypeDataBuilder_.getMessage(index);
         }

         public Builder setRankTypeData(int index, CommonMsg.MapDataII value) {
            if (this.rankTypeDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankTypeDataIsMutable();
               this.rankTypeData_.set(index, value);
               this.onChanged();
            } else {
               this.rankTypeDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRankTypeData(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.rankTypeDataBuilder_ == null) {
               this.ensureRankTypeDataIsMutable();
               this.rankTypeData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankTypeDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRankTypeData(CommonMsg.MapDataII value) {
            if (this.rankTypeDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankTypeDataIsMutable();
               this.rankTypeData_.add(value);
               this.onChanged();
            } else {
               this.rankTypeDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRankTypeData(int index, CommonMsg.MapDataII value) {
            if (this.rankTypeDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankTypeDataIsMutable();
               this.rankTypeData_.add(index, value);
               this.onChanged();
            } else {
               this.rankTypeDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRankTypeData(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.rankTypeDataBuilder_ == null) {
               this.ensureRankTypeDataIsMutable();
               this.rankTypeData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rankTypeDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRankTypeData(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.rankTypeDataBuilder_ == null) {
               this.ensureRankTypeDataIsMutable();
               this.rankTypeData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankTypeDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRankTypeData(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.rankTypeDataBuilder_ == null) {
               this.ensureRankTypeDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rankTypeData_);
               this.onChanged();
            } else {
               this.rankTypeDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRankTypeData() {
            if (this.rankTypeDataBuilder_ == null) {
               this.rankTypeData_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.rankTypeDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeRankTypeData(int index) {
            if (this.rankTypeDataBuilder_ == null) {
               this.ensureRankTypeDataIsMutable();
               this.rankTypeData_.remove(index);
               this.onChanged();
            } else {
               this.rankTypeDataBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getRankTypeDataBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getRankTypeDataFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getRankTypeDataOrBuilder(int index) {
            return this.rankTypeDataBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.rankTypeData_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.rankTypeDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getRankTypeDataOrBuilderList() {
            return this.rankTypeDataBuilder_ != null ? this.rankTypeDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rankTypeData_);
         }

         public CommonMsg.MapDataII.Builder addRankTypeDataBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getRankTypeDataFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addRankTypeDataBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getRankTypeDataFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getRankTypeDataBuilderList() {
            return this.getRankTypeDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getRankTypeDataFieldBuilder() {
            if (this.rankTypeDataBuilder_ == null) {
               this.rankTypeDataBuilder_ = new RepeatedFieldBuilderV3(this.rankTypeData_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.rankTypeData_ = null;
            }

            return this.rankTypeDataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_RankReward_14127 extends GeneratedMessageV3 implements CR2S_RankReward_14127OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SERVERRANK_FIELD_NUMBER = 1;
      private int serverRank_;
      public static final int RANKDATA_FIELD_NUMBER = 2;
      private List<RankSettleData> rankData_;
      private byte memoizedIsInitialized;
      private static final CR2S_RankReward_14127 DEFAULT_INSTANCE = new CR2S_RankReward_14127();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_RankReward_14127> PARSER = new AbstractParser<CR2S_RankReward_14127>() {
         public CR2S_RankReward_14127 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_RankReward_14127(input, extensionRegistry);
         }
      };

      private CR2S_RankReward_14127(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_RankReward_14127() {
         this.memoizedIsInitialized = -1;
         this.rankData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_RankReward_14127();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_RankReward_14127(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.serverRank_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.rankData_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.rankData_.add(input.readMessage(CrossDemonStrikesMsg.RankSettleData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_RankReward_14127_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_RankReward_14127_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_RankReward_14127.class, Builder.class);
      }

      public boolean hasServerRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getServerRank() {
         return this.serverRank_;
      }

      public List<RankSettleData> getRankDataList() {
         return this.rankData_;
      }

      public List<? extends RankSettleDataOrBuilder> getRankDataOrBuilderList() {
         return this.rankData_;
      }

      public int getRankDataCount() {
         return this.rankData_.size();
      }

      public RankSettleData getRankData(int index) {
         return (RankSettleData)this.rankData_.get(index);
      }

      public RankSettleDataOrBuilder getRankDataOrBuilder(int index) {
         return (RankSettleDataOrBuilder)this.rankData_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasServerRank()) {
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
            output.writeInt32(1, this.serverRank_);
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
               size += CodedOutputStream.computeInt32Size(1, this.serverRank_);
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
         } else if (!(obj instanceof CR2S_RankReward_14127)) {
            return super.equals(obj);
         } else {
            CR2S_RankReward_14127 other = (CR2S_RankReward_14127)obj;
            if (this.hasServerRank() != other.hasServerRank()) {
               return false;
            } else if (this.hasServerRank() && this.getServerRank() != other.getServerRank()) {
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
            if (this.hasServerRank()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getServerRank();
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

      public static CR2S_RankReward_14127 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_RankReward_14127)PARSER.parseFrom(data);
      }

      public static CR2S_RankReward_14127 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RankReward_14127)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RankReward_14127 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_RankReward_14127)PARSER.parseFrom(data);
      }

      public static CR2S_RankReward_14127 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RankReward_14127)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RankReward_14127 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_RankReward_14127)PARSER.parseFrom(data);
      }

      public static CR2S_RankReward_14127 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RankReward_14127)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RankReward_14127 parseFrom(InputStream input) throws IOException {
         return (CR2S_RankReward_14127)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_RankReward_14127 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RankReward_14127)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_RankReward_14127 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_RankReward_14127)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_RankReward_14127 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RankReward_14127)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_RankReward_14127 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_RankReward_14127)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_RankReward_14127 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RankReward_14127)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_RankReward_14127 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_RankReward_14127 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_RankReward_14127> parser() {
         return PARSER;
      }

      public Parser<CR2S_RankReward_14127> getParserForType() {
         return PARSER;
      }

      public CR2S_RankReward_14127 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_RankReward_14127OrBuilder {
         private int bitField0_;
         private int serverRank_;
         private List<RankSettleData> rankData_;
         private RepeatedFieldBuilderV3<RankSettleData, RankSettleData.Builder, RankSettleDataOrBuilder> rankDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_RankReward_14127_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_RankReward_14127_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_RankReward_14127.class, Builder.class);
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
            if (CrossDemonStrikesMsg.CR2S_RankReward_14127.alwaysUseFieldBuilders) {
               this.getRankDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.serverRank_ = 0;
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
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_RankReward_14127_descriptor;
         }

         public CR2S_RankReward_14127 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.CR2S_RankReward_14127.getDefaultInstance();
         }

         public CR2S_RankReward_14127 build() {
            CR2S_RankReward_14127 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_RankReward_14127 buildPartial() {
            CR2S_RankReward_14127 result = new CR2S_RankReward_14127(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.serverRank_ = this.serverRank_;
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
            if (other instanceof CR2S_RankReward_14127) {
               return this.mergeFrom((CR2S_RankReward_14127)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_RankReward_14127 other) {
            if (other == CrossDemonStrikesMsg.CR2S_RankReward_14127.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasServerRank()) {
                  this.setServerRank(other.getServerRank());
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
                     this.rankDataBuilder_ = CrossDemonStrikesMsg.CR2S_RankReward_14127.alwaysUseFieldBuilders ? this.getRankDataFieldBuilder() : null;
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
            if (!this.hasServerRank()) {
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
            CR2S_RankReward_14127 parsedMessage = null;

            try {
               parsedMessage = (CR2S_RankReward_14127)CrossDemonStrikesMsg.CR2S_RankReward_14127.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_RankReward_14127)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasServerRank() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getServerRank() {
            return this.serverRank_;
         }

         public Builder setServerRank(int value) {
            this.bitField0_ |= 1;
            this.serverRank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerRank() {
            this.bitField0_ &= -2;
            this.serverRank_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRankDataIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.rankData_ = new ArrayList(this.rankData_);
               this.bitField0_ |= 2;
            }

         }

         public List<RankSettleData> getRankDataList() {
            return this.rankDataBuilder_ == null ? Collections.unmodifiableList(this.rankData_) : this.rankDataBuilder_.getMessageList();
         }

         public int getRankDataCount() {
            return this.rankDataBuilder_ == null ? this.rankData_.size() : this.rankDataBuilder_.getCount();
         }

         public RankSettleData getRankData(int index) {
            return this.rankDataBuilder_ == null ? (RankSettleData)this.rankData_.get(index) : (RankSettleData)this.rankDataBuilder_.getMessage(index);
         }

         public Builder setRankData(int index, RankSettleData value) {
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

         public Builder setRankData(int index, RankSettleData.Builder builderForValue) {
            if (this.rankDataBuilder_ == null) {
               this.ensureRankDataIsMutable();
               this.rankData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRankData(RankSettleData value) {
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

         public Builder addRankData(int index, RankSettleData value) {
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

         public Builder addRankData(RankSettleData.Builder builderForValue) {
            if (this.rankDataBuilder_ == null) {
               this.ensureRankDataIsMutable();
               this.rankData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rankDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRankData(int index, RankSettleData.Builder builderForValue) {
            if (this.rankDataBuilder_ == null) {
               this.ensureRankDataIsMutable();
               this.rankData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRankData(Iterable<? extends RankSettleData> values) {
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

         public RankSettleData.Builder getRankDataBuilder(int index) {
            return (RankSettleData.Builder)this.getRankDataFieldBuilder().getBuilder(index);
         }

         public RankSettleDataOrBuilder getRankDataOrBuilder(int index) {
            return this.rankDataBuilder_ == null ? (RankSettleDataOrBuilder)this.rankData_.get(index) : (RankSettleDataOrBuilder)this.rankDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankSettleDataOrBuilder> getRankDataOrBuilderList() {
            return this.rankDataBuilder_ != null ? this.rankDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rankData_);
         }

         public RankSettleData.Builder addRankDataBuilder() {
            return (RankSettleData.Builder)this.getRankDataFieldBuilder().addBuilder(CrossDemonStrikesMsg.RankSettleData.getDefaultInstance());
         }

         public RankSettleData.Builder addRankDataBuilder(int index) {
            return (RankSettleData.Builder)this.getRankDataFieldBuilder().addBuilder(index, CrossDemonStrikesMsg.RankSettleData.getDefaultInstance());
         }

         public List<RankSettleData.Builder> getRankDataBuilderList() {
            return this.getRankDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankSettleData, RankSettleData.Builder, RankSettleDataOrBuilder> getRankDataFieldBuilder() {
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

   public static final class CR2S_BeTransfer_14128 extends GeneratedMessageV3 implements CR2S_BeTransfer_14128OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARD_FIELD_NUMBER = 1;
      private List<CommonMsg.ItemInfo> reward_;
      public static final int RESULT_FIELD_NUMBER = 2;
      private int result_;
      public static final int BATTLE_FIELD_NUMBER = 3;
      private BattleMsg.S2C_BattleResult_6102 battle_;
      private byte memoizedIsInitialized;
      private static final CR2S_BeTransfer_14128 DEFAULT_INSTANCE = new CR2S_BeTransfer_14128();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_BeTransfer_14128> PARSER = new AbstractParser<CR2S_BeTransfer_14128>() {
         public CR2S_BeTransfer_14128 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_BeTransfer_14128(input, extensionRegistry);
         }
      };

      private CR2S_BeTransfer_14128(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_BeTransfer_14128() {
         this.memoizedIsInitialized = -1;
         this.reward_ = Collections.emptyList();
         this.result_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_BeTransfer_14128();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_BeTransfer_14128(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.reward_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.reward_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        break;
                     case 16:
                        int rawValue = input.readEnum();
                        DemonStrikesMsg.TransferResult value = DemonStrikesMsg.TransferResult.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.result_ = rawValue;
                        }
                        break;
                     case 26:
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.battle_.toBuilder();
                        }

                        this.battle_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.battle_);
                           this.battle_ = subBuilder.buildPartial();
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
               if ((mutable_bitField0_ & 1) != 0) {
                  this.reward_ = Collections.unmodifiableList(this.reward_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_BeTransfer_14128_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_BeTransfer_14128_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_BeTransfer_14128.class, Builder.class);
      }

      public List<CommonMsg.ItemInfo> getRewardList() {
         return this.reward_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getRewardOrBuilderList() {
         return this.reward_;
      }

      public int getRewardCount() {
         return this.reward_.size();
      }

      public CommonMsg.ItemInfo getReward(int index) {
         return (CommonMsg.ItemInfo)this.reward_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getRewardOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.reward_.get(index);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public DemonStrikesMsg.TransferResult getResult() {
         DemonStrikesMsg.TransferResult result = DemonStrikesMsg.TransferResult.valueOf(this.result_);
         return result == null ? DemonStrikesMsg.TransferResult.TRANSFER_ATK_SUC : result;
      }

      public boolean hasBattle() {
         return (this.bitField0_ & 2) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getBattle() {
         return this.battle_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battle_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleOrBuilder() {
         return this.battle_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battle_;
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
            for(int i = 0; i < this.getRewardCount(); ++i) {
               if (!this.getReward(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            if (this.hasBattle() && !this.getBattle().isInitialized()) {
               this.memoizedIsInitialized = 0;
               return false;
            } else {
               this.memoizedIsInitialized = 1;
               return true;
            }
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.reward_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.reward_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(2, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(3, this.getBattle());
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.reward_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.reward_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeEnumSize(2, this.result_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getBattle());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_BeTransfer_14128)) {
            return super.equals(obj);
         } else {
            CR2S_BeTransfer_14128 other = (CR2S_BeTransfer_14128)obj;
            if (!this.getRewardList().equals(other.getRewardList())) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.result_ != other.result_) {
               return false;
            } else if (this.hasBattle() != other.hasBattle()) {
               return false;
            } else if (this.hasBattle() && !this.getBattle().equals(other.getBattle())) {
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
            if (this.getRewardCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRewardList().hashCode();
            }

            if (this.hasResult()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.result_;
            }

            if (this.hasBattle()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBattle().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_BeTransfer_14128 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_BeTransfer_14128)PARSER.parseFrom(data);
      }

      public static CR2S_BeTransfer_14128 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BeTransfer_14128)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BeTransfer_14128 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_BeTransfer_14128)PARSER.parseFrom(data);
      }

      public static CR2S_BeTransfer_14128 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BeTransfer_14128)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BeTransfer_14128 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_BeTransfer_14128)PARSER.parseFrom(data);
      }

      public static CR2S_BeTransfer_14128 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BeTransfer_14128)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BeTransfer_14128 parseFrom(InputStream input) throws IOException {
         return (CR2S_BeTransfer_14128)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_BeTransfer_14128 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BeTransfer_14128)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_BeTransfer_14128 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_BeTransfer_14128)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_BeTransfer_14128 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BeTransfer_14128)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_BeTransfer_14128 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_BeTransfer_14128)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_BeTransfer_14128 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BeTransfer_14128)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_BeTransfer_14128 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_BeTransfer_14128 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_BeTransfer_14128> parser() {
         return PARSER;
      }

      public Parser<CR2S_BeTransfer_14128> getParserForType() {
         return PARSER;
      }

      public CR2S_BeTransfer_14128 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_BeTransfer_14128OrBuilder {
         private int bitField0_;
         private List<CommonMsg.ItemInfo> reward_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> rewardBuilder_;
         private int result_;
         private BattleMsg.S2C_BattleResult_6102 battle_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> battleBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_BeTransfer_14128_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_BeTransfer_14128_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_BeTransfer_14128.class, Builder.class);
         }

         private Builder() {
            this.reward_ = Collections.emptyList();
            this.result_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.reward_ = Collections.emptyList();
            this.result_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossDemonStrikesMsg.CR2S_BeTransfer_14128.alwaysUseFieldBuilders) {
               this.getRewardFieldBuilder();
               this.getBattleFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.rewardBuilder_ == null) {
               this.reward_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.rewardBuilder_.clear();
            }

            this.result_ = 1;
            this.bitField0_ &= -3;
            if (this.battleBuilder_ == null) {
               this.battle_ = null;
            } else {
               this.battleBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossDemonStrikesMsg.internal_static_crossDemonStrikes_com_gzbz_protobuf_CR2S_BeTransfer_14128_descriptor;
         }

         public CR2S_BeTransfer_14128 getDefaultInstanceForType() {
            return CrossDemonStrikesMsg.CR2S_BeTransfer_14128.getDefaultInstance();
         }

         public CR2S_BeTransfer_14128 build() {
            CR2S_BeTransfer_14128 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_BeTransfer_14128 buildPartial() {
            CR2S_BeTransfer_14128 result = new CR2S_BeTransfer_14128(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.rewardBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.reward_ = Collections.unmodifiableList(this.reward_);
                  this.bitField0_ &= -2;
               }

               result.reward_ = this.reward_;
            } else {
               result.reward_ = this.rewardBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 1;
            }

            result.result_ = this.result_;
            if ((from_bitField0_ & 4) != 0) {
               if (this.battleBuilder_ == null) {
                  result.battle_ = this.battle_;
               } else {
                  result.battle_ = (BattleMsg.S2C_BattleResult_6102)this.battleBuilder_.build();
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
            if (other instanceof CR2S_BeTransfer_14128) {
               return this.mergeFrom((CR2S_BeTransfer_14128)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_BeTransfer_14128 other) {
            if (other == CrossDemonStrikesMsg.CR2S_BeTransfer_14128.getDefaultInstance()) {
               return this;
            } else {
               if (this.rewardBuilder_ == null) {
                  if (!other.reward_.isEmpty()) {
                     if (this.reward_.isEmpty()) {
                        this.reward_ = other.reward_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureRewardIsMutable();
                        this.reward_.addAll(other.reward_);
                     }

                     this.onChanged();
                  }
               } else if (!other.reward_.isEmpty()) {
                  if (this.rewardBuilder_.isEmpty()) {
                     this.rewardBuilder_.dispose();
                     this.rewardBuilder_ = null;
                     this.reward_ = other.reward_;
                     this.bitField0_ &= -2;
                     this.rewardBuilder_ = CrossDemonStrikesMsg.CR2S_BeTransfer_14128.alwaysUseFieldBuilders ? this.getRewardFieldBuilder() : null;
                  } else {
                     this.rewardBuilder_.addAllMessages(other.reward_);
                  }
               }

               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasBattle()) {
                  this.mergeBattle(other.getBattle());
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
               for(int i = 0; i < this.getRewardCount(); ++i) {
                  if (!this.getReward(i).isInitialized()) {
                     return false;
                  }
               }

               if (this.hasBattle() && !this.getBattle().isInitialized()) {
                  return false;
               } else {
                  return true;
               }
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_BeTransfer_14128 parsedMessage = null;

            try {
               parsedMessage = (CR2S_BeTransfer_14128)CrossDemonStrikesMsg.CR2S_BeTransfer_14128.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_BeTransfer_14128)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRewardIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.reward_ = new ArrayList(this.reward_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.ItemInfo> getRewardList() {
            return this.rewardBuilder_ == null ? Collections.unmodifiableList(this.reward_) : this.rewardBuilder_.getMessageList();
         }

         public int getRewardCount() {
            return this.rewardBuilder_ == null ? this.reward_.size() : this.rewardBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getReward(int index) {
            return this.rewardBuilder_ == null ? (CommonMsg.ItemInfo)this.reward_.get(index) : (CommonMsg.ItemInfo)this.rewardBuilder_.getMessage(index);
         }

         public Builder setReward(int index, CommonMsg.ItemInfo value) {
            if (this.rewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardIsMutable();
               this.reward_.set(index, value);
               this.onChanged();
            } else {
               this.rewardBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setReward(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addReward(CommonMsg.ItemInfo value) {
            if (this.rewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardIsMutable();
               this.reward_.add(value);
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addReward(int index, CommonMsg.ItemInfo value) {
            if (this.rewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardIsMutable();
               this.reward_.add(index, value);
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addReward(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addReward(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllReward(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.reward_);
               this.onChanged();
            } else {
               this.rewardBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearReward() {
            if (this.rewardBuilder_ == null) {
               this.reward_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.rewardBuilder_.clear();
            }

            return this;
         }

         public Builder removeReward(int index) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.remove(index);
               this.onChanged();
            } else {
               this.rewardBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getRewardBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getRewardFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getRewardOrBuilder(int index) {
            return this.rewardBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.reward_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.rewardBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getRewardOrBuilderList() {
            return this.rewardBuilder_ != null ? this.rewardBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.reward_);
         }

         public CommonMsg.ItemInfo.Builder addRewardBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getRewardFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addRewardBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getRewardFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getRewardBuilderList() {
            return this.getRewardFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getRewardFieldBuilder() {
            if (this.rewardBuilder_ == null) {
               this.rewardBuilder_ = new RepeatedFieldBuilderV3(this.reward_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.reward_ = null;
            }

            return this.rewardBuilder_;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 2) != 0;
         }

         public DemonStrikesMsg.TransferResult getResult() {
            DemonStrikesMsg.TransferResult result = DemonStrikesMsg.TransferResult.valueOf(this.result_);
            return result == null ? DemonStrikesMsg.TransferResult.TRANSFER_ATK_SUC : result;
         }

         public Builder setResult(DemonStrikesMsg.TransferResult value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.result_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearResult() {
            this.bitField0_ &= -3;
            this.result_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasBattle() {
            return (this.bitField0_ & 4) != 0;
         }

         public BattleMsg.S2C_BattleResult_6102 getBattle() {
            if (this.battleBuilder_ == null) {
               return this.battle_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battle_;
            } else {
               return (BattleMsg.S2C_BattleResult_6102)this.battleBuilder_.getMessage();
            }
         }

         public Builder setBattle(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.battle_ = value;
               this.onChanged();
            } else {
               this.battleBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setBattle(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.battleBuilder_ == null) {
               this.battle_ = builderForValue.build();
               this.onChanged();
            } else {
               this.battleBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeBattle(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.battle_ != null && this.battle_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.battle_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.battle_).mergeFrom(value).buildPartial();
               } else {
                  this.battle_ = value;
               }

               this.onChanged();
            } else {
               this.battleBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearBattle() {
            if (this.battleBuilder_ == null) {
               this.battle_ = null;
               this.onChanged();
            } else {
               this.battleBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getBattleBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (BattleMsg.S2C_BattleResult_6102.Builder)this.getBattleFieldBuilder().getBuilder();
         }

         public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleOrBuilder() {
            if (this.battleBuilder_ != null) {
               return (BattleMsg.S2C_BattleResult_6102OrBuilder)this.battleBuilder_.getMessageOrBuilder();
            } else {
               return this.battle_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battle_;
            }
         }

         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> getBattleFieldBuilder() {
            if (this.battleBuilder_ == null) {
               this.battleBuilder_ = new SingleFieldBuilderV3(this.getBattle(), this.getParentForChildren(), this.isClean());
               this.battle_ = null;
            }

            return this.battleBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface CR2S_AttackNpc_14116OrBuilder extends MessageOrBuilder {
      boolean hasCityId();

      int getCityId();

      boolean hasUid();

      int getUid();

      List<CommonMsg.ItemInfo> getRewardList();

      CommonMsg.ItemInfo getReward(int index);

      int getRewardCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getRewardOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getRewardOrBuilder(int index);

      boolean hasBattle();

      BattleMsg.S2C_BattleResult_6102 getBattle();

      BattleMsg.S2C_BattleResult_6102OrBuilder getBattleOrBuilder();

      boolean hasResult();

      AtkResult getResult();
   }

   public interface CR2S_BeTransfer_14128OrBuilder extends MessageOrBuilder {
      List<CommonMsg.ItemInfo> getRewardList();

      CommonMsg.ItemInfo getReward(int index);

      int getRewardCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getRewardOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getRewardOrBuilder(int index);

      boolean hasResult();

      DemonStrikesMsg.TransferResult getResult();

      boolean hasBattle();

      BattleMsg.S2C_BattleResult_6102 getBattle();

      BattleMsg.S2C_BattleResult_6102OrBuilder getBattleOrBuilder();
   }

   public interface CR2S_CityChangeNotify_14120OrBuilder extends MessageOrBuilder {
      boolean hasMsg();

      DemonStrikesMsg.S2C_CityChangeNotify_13912 getMsg();

      DemonStrikesMsg.S2C_CityChangeNotify_13912OrBuilder getMsgOrBuilder();
   }

   public interface CR2S_CityReward_14114OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MapDataII> getRewardList();

      CommonMsg.MapDataII getReward(int index);

      int getRewardCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getRewardOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getRewardOrBuilder(int index);

      List<CommonMsg.MapDataII> getRandomRewardList();

      CommonMsg.MapDataII getRandomReward(int index);

      int getRandomRewardCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getRandomRewardOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getRandomRewardOrBuilder(int index);
   }

   public interface CR2S_DemonStrikes_14102OrBuilder extends MessageOrBuilder {
      boolean hasState();

      DemonStrikesMsg.SystemState getState();

      boolean hasStartTime();

      int getStartTime();

      boolean hasEndTime();

      int getEndTime();

      boolean hasMapId();

      int getMapId();

      boolean hasRewardTime();

      int getRewardTime();
   }

   public interface CR2S_HasRewardNotify_14123OrBuilder extends MessageOrBuilder {
      boolean hasRewardTime();

      int getRewardTime();
   }

   public interface CR2S_LuckyReward_14119OrBuilder extends MessageOrBuilder {
      List<String> getRecordList();

      int getRecordCount();

      String getRecord(int index);

      ByteString getRecordBytes(int index);
   }

   public interface CR2S_MapInfo_14124OrBuilder extends MessageOrBuilder {
      boolean hasInCity();

      int getInCity();

      List<DemonStrikesMsg.CityInfo> getCityList();

      DemonStrikesMsg.CityInfo getCity(int index);

      int getCityCount();

      List<? extends DemonStrikesMsg.CityInfoOrBuilder> getCityOrBuilderList();

      DemonStrikesMsg.CityInfoOrBuilder getCityOrBuilder(int index);
   }

   public interface CR2S_MoveCity_14107OrBuilder extends MessageOrBuilder {
      boolean hasCityId();

      int getCityId();

      boolean hasNeedFee();

      boolean getNeedFee();
   }

   public interface CR2S_NpcAtkPLayer_14122OrBuilder extends MessageOrBuilder {
      boolean hasBattle();

      BattleMsg.S2C_BattleResult_6102 getBattle();

      BattleMsg.S2C_BattleResult_6102OrBuilder getBattleOrBuilder();
   }

   public interface CR2S_RankReward_14127OrBuilder extends MessageOrBuilder {
      boolean hasServerRank();

      int getServerRank();

      List<RankSettleData> getRankDataList();

      RankSettleData getRankData(int index);

      int getRankDataCount();

      List<? extends RankSettleDataOrBuilder> getRankDataOrBuilderList();

      RankSettleDataOrBuilder getRankDataOrBuilder(int index);
   }

   public interface CR2S_Transfer_14110OrBuilder extends MessageOrBuilder {
      boolean hasCityId();

      int getCityId();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasAtkNumFee();

      int getAtkNumFee();

      boolean hasMoveNumFee();

      int getMoveNumFee();

      boolean hasResult();

      DemonStrikesMsg.TransferResult getResult();
   }

   public interface RankSettleDataOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      List<CommonMsg.MapDataII> getRankTypeDataList();

      CommonMsg.MapDataII getRankTypeData(int index);

      int getRankTypeDataCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getRankTypeDataOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getRankTypeDataOrBuilder(int index);
   }

   public interface S2CR_AttackNpc_14115OrBuilder extends MessageOrBuilder {
      boolean hasCityId();

      int getCityId();

      boolean hasUid();

      int getUid();
   }

   public interface S2CR_BuyRandomItem_14126OrBuilder extends MessageOrBuilder {
      boolean hasBuyId();

      int getBuyId();

      boolean hasBuyNum();

      int getBuyNum();
   }

   public interface S2CR_CityHoldInfo_14104OrBuilder extends MessageOrBuilder {
      boolean hasCityId();

      int getCityId();

      boolean hasPageParam();

      CommonMsg.PageInfo getPageParam();

      CommonMsg.PageInfoOrBuilder getPageParamOrBuilder();
   }

   public interface S2CR_CityReward_14113OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_DemonStrikes_14101OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_GM_14125OrBuilder extends MessageOrBuilder {
      boolean hasCmd();

      String getCmd();

      ByteString getCmdBytes();

      List<Long> getParamsList();

      int getParamsCount();

      long getParams(int index);
   }

   public interface S2CR_Logs_14112OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_LuckyMain_14117OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_LuckyReward_14118OrBuilder extends MessageOrBuilder {
      List<String> getRecordList();

      int getRecordCount();

      String getRecord(int index);

      ByteString getRecordBytes(int index);
   }

   public interface S2CR_MapInfo_14103OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_MoveCity_14106OrBuilder extends MessageOrBuilder {
      boolean hasCityId();

      int getCityId();

      boolean hasMoveNum();

      int getMoveNum();
   }

   public interface S2CR_Rank_14111OrBuilder extends MessageOrBuilder {
      boolean hasParams();

      DemonStrikesMsg.C2S_Rank_13919 getParams();

      DemonStrikesMsg.C2S_Rank_13919OrBuilder getParamsOrBuilder();
   }

   public interface S2CR_TransferList_14108OrBuilder extends MessageOrBuilder {
      boolean hasPower();

      long getPower();

      boolean hasPageInfo();

      CommonMsg.PageInfo getPageInfo();

      CommonMsg.PageInfoOrBuilder getPageInfoOrBuilder();
   }

   public interface S2CR_Transfer_14109OrBuilder extends MessageOrBuilder {
      boolean hasCityId();

      int getCityId();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasAtkNum();

      int getAtkNum();

      boolean hasMoveNum();

      int getMoveNum();
   }

   public interface S2CR_UploadPlayerData_14121OrBuilder extends MessageOrBuilder {
      boolean hasArraying();

      ByteString getArraying();
   }
}
