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

public final class CrossCountryWarMsg {
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_MainUi_11401_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_MainUi_11401_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ChangeCityInfo_11402_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ChangeCityInfo_11402_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_ActivityState_11403_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_ActivityState_11403_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ActivityState_11404_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ActivityState_11404_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_CountryWarPlayer_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_CountryWarPlayer_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_UpLoadPlayerInfo_11405_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_UpLoadPlayerInfo_11405_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_UpLoadPlayerInfo_11406_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_UpLoadPlayerInfo_11406_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarState_11407_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarState_11407_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarRank_11409_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarRank_11409_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryLog_11411_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryLog_11411_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_UpdateCityReward_11416_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_UpdateCityReward_11416_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerInfo_11417_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerInfo_11417_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_NoticeGrantTaskReward_11420_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_NoticeGrantTaskReward_11420_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_MoveToCity_11431_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_MoveToCity_11431_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_MoveToCity_11432_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_MoveToCity_11432_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_FihtToCity_11433_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_FihtToCity_11433_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_FihtToCity_11434_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_FihtToCity_11434_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TransferToCity_11435_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TransferToCity_11435_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_TransferToCity_11436_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_TransferToCity_11436_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TransferList_11437_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TransferList_11437_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_DefSuccess_11438_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_DefSuccess_11438_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TakeCityReward_11441_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TakeCityReward_11441_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_TakeCityReward_11442_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_TakeCityReward_11442_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_OpenTurnTableUi_11461_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_OpenTurnTableUi_11461_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_OpenTurnTableUi_11462_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_OpenTurnTableUi_11462_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_LuckDrawRecord_11463_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_LuckDrawRecord_11463_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_LuckDrawRecord_11464_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_LuckDrawRecord_11464_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_BuyItem_11467_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_BuyItem_11467_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_PlayerRewardInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_PlayerRewardInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_RewardInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_RewardInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_SeasonReward_11468_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_SeasonReward_11468_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_PlayerReward_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_PlayerReward_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_SeasonCityReward_11470_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_SeasonCityReward_11470_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarGm_11471_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarGm_11471_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerLoginIn_11473_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerLoginIn_11473_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerLoginOut_11475_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerLoginOut_11475_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ServerTerminationLeave_11478_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ServerTerminationLeave_11478_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ServerTerminationJoin_11480_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ServerTerminationJoin_11480_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private CrossCountryWarMsg() {
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
      String[] descriptorData = new String[]{"\n\u0015CrossCountryWar.proto\u0012!crossCountryWar.com.gzbz.protobuf\u001a\u0010CountryWar.proto\u001a\fBattle.proto\u001a\fcommon.proto\"÷\u0001\n\u0011S2CR_MainUi_11401\u0012\u0017\n\u000fisCompletedTask\u0018\u0001 \u0002(\b\u0012\u0010\n\battToken\u0018\u0002 \u0002(\u0005\u0012\u0018\n\u0010attNextTokenTime\u0018\u0003 \u0002(\u0005\u0012\u0011\n\tmoveToken\u0018\u0004 \u0002(\u0005\u0012\u0019\n\u0011moveNextTokenTime\u0018\u0005 \u0002(\u0005\u0012\u0018\n\u0010heroArrayingData\u0018\u0006 \u0002(\f\u0012\u0013\n\u000btransferNum\u0018\u0007 \u0002(\u0005\u0012\u0015\n\rallowTransfer\u0018\b \u0002(\b\u0012\u0019\n\u0011sameUnionTransfer\u0018\t \u0002(\b\u0012\u000e\n\u0006buyNum\u0018\u0010 \u0002(\u0005\"Ì\u0001\n\u0019CR2S_ChangeCityInfo_11402\u0012\u000e\n\u0006reason\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0001(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\u0012\u0010\n\bserverId\u0018\u0004 \u0001(\u0005\u0012\u0012\n\ndestCityId\u0018\u0005 \u0001(\u0005\u00125\n\u0005infos\u0018\u0006 \u0003(\u000b2&.countryWar.com.gzbz.protobuf.CityInfo\u0012\u001c\n\u0014allianceMainServerId\u0018\u0007 \u0001(\u0005\"\u001a\n\u0018S2CR_ActivityState_11403\"L\n\u0018CR2S_ActivityState_11404\u0012\u0012\n\nactivityId\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005mapId\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005state\u0018\u0003 \u0002(\u0005\"`\n\u0010CountryWarPlayer\u0012 \n\u0004info\u0018\u0001 \u0002(\u000b2\u0012.common.PlayerInfo\u0012\u0018\n\u0010heroArrayingData\u0018\u0002 \u0002(\f\u0012\u0010\n\bisOnline\u0018\u0003 \u0002(\b\"c\n\u001bS2CR_UpLoadPlayerInfo_11405\u0012D\n\u0007players\u0018\u0001 \u0003(\u000b23.crossCountryWar.com.gzbz.protobuf.CountryWarPlayer\"e\n\u001bCR2S_UpLoadPlayerInfo_11406\u0012\u0012\n\nactivityId\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005mapId\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005state\u0018\u0003 \u0002(\u0005\u0012\u0014\n\fisNeedUpload\u0018\u0004 \u0002(\b\"Ï\u0001\n\u001aS2CR_CountryWarState_11407\u0012\u0015\n\ractivityState\u0018\u0001 \u0002(\u0005\u0012\u0010\n\battToken\u0018\u0002 \u0002(\u0005\u0012\u0018\n\u0010attNextTokenTime\u0018\u0003 \u0002(\u0005\u0012\u0011\n\tmoveToken\u0018\u0004 \u0002(\u0005\u0012\u0019\n\u0011moveNextTokenTime\u0018\u0005 \u0002(\u0005\u0012\u0017\n\u000fisCompletedTask\u0018\u0006 \u0002(\b\u0012\u0015\n\risSocreReward\u0018\u0007 \u0002(\b\u0012\u0010\n\bopenDays\u0018\b \u0001(\u0005\")\n\u0019S2CR_CountryWarRank_11409\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"%\n\u0015S2CR_CountryLog_11411\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"Z\n\u001bCR2S_UpdateCityReward_11416\u0012;\n\u0005infos\u0018\u0001 \u0003(\u000b2,.countryWar.com.gzbz.protobuf.CityRewardInfo\"A\n\u0015S2CR_PlayerInfo_11417\u0012\u0016\n\u000eslaveServierId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\"\"\n CR2S_NoticeGrantTaskReward_11420\":\n\u0015S2CR_MoveToCity_11431\u0012\u000e\n\u0006cityId\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tmoveToken\u0018\u0002 \u0002(\u0005\"@\n\u0015CR2S_MoveToCity_11432\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0017\n\u000fisNeedMoveToken\u0018\u0002 \u0002(\b\"Q\n\u0015S2CR_FihtToCity_11433\u0012\u000e\n\u0006cityId\u0018\u0001 \u0002(\u0005\u0012\u0018\n\u0010heroArrayingData\u0018\u0002 \u0002(\f\u0012\u000e\n\u0006isSkip\u0018\u0003 \u0001(\b\"§\u0001\n\u0015CR2S_FihtToCity_11434\u0012\u0016\n\u000eoptionalResult\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007isFight\u0018\u0002 \u0001(\b\u0012\r\n\u0005isWin\u0018\u0003 \u0001(\b\u0012\u0010\n\bisOccypy\u0018\u0004 \u0001(\b\u0012D\n\u000bfightResult\u0018\u0005 \u0001(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\"j\n\u0019S2CR_TransferToCity_11435\u0012\u000e\n\u0006cityId\u0018\u0001 \u0002(\u0005\u0012\u0018\n\u0010transferPlayerId\u0018\u0002 \u0002(\u0005\u0012\u0010\n\battToken\u0018\u0003 \u0002(\u0005\u0012\u0011\n\tmoveToken\u0018\u0004 \u0002(\u0005\"Ü\u0001\n\u0019CR2S_TransferToCity_11436\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012&\n\fconsumeToken\u0018\u0002 \u0001(\u000b2\u0010.common.ItemInfo\u0012\u000f\n\u0007isFight\u0018\u0003 \u0001(\b\u0012\r\n\u0005isWin\u0018\u0004 \u0001(\b\u0012\u0010\n\bisOccypy\u0018\u0005 \u0001(\b\u0012=\n\u0004info\u0018\b \u0001(\u000b2/.countryWar.com.gzbz.protobuf.CountryWarLogInfo\u0012\u0016\n\u000eisBreakDefense\u0018\u0006 \u0001(\b\"\u0019\n\u0017S2CR_TransferList_11437\"\u0017\n\u0015CR2S_DefSuccess_11438\"\u001b\n\u0019S2CR_TakeCityReward_11441\"L\n\u0019CR2S_TakeCityReward_11442\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u001f\n\u0005items\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\"\u001c\n\u001aS2CR_OpenTurnTableUi_11461\"-\n\u001aCR2S_OpenTurnTableUi_11462\u0012\u000f\n\u0007records\u0018\u0001 \u0003(\t\"+\n\u0019S2CR_LuckDrawRecord_11463\u0012\u000e\n\u0006record\u0018\u0001 \u0003(\t\">\n\u0019CR2S_LuckDrawRecord_11464\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007records\u0018\u0002 \u0003(\t\"-\n\u0012S2CR_BuyItem_11467\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\"2\n\u0010PlayerRewardInfo\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004rank\u0018\u0002 \u0002(\u0005\"^\n\nRewardInfo\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012B\n\u0005infos\u0018\u0002 \u0003(\u000b23.crossCountryWar.com.gzbz.protobuf.PlayerRewardInfo\"\u0095\u0001\n\u0017CR2S_SeasonReward_11468\u0012\u0013\n\u000bcountryRank\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007players\u0018\u0002 \u0003(\u0005\u0012B\n\u000brewardInfos\u0018\u0003 \u0003(\u000b2-.crossCountryWar.com.gzbz.protobuf.RewardInfo\u0012\u0010\n\bsendType\u0018\u0004 \u0001(\u0005\"E\n\fPlayerReward\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012#\n\titemInfos\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\"e\n\u001bCR2S_SeasonCityReward_11470\u0012F\n\rplayerRewards\u0018\u0001 \u0003(\u000b2/.crossCountryWar.com.gzbz.protobuf.PlayerReward\"6\n\u0017S2CR_CountryWarGm_11471\u0012\u000b\n\u0003cmd\u0018\u0001 \u0002(\t\u0012\u000e\n\u0006params\u0018\u0002 \u0003(\u0005\"\u001a\n\u0018S2CR_PlayerLoginIn_11473\"\u001b\n\u0019S2CR_PlayerLoginOut_11475\"=\n!CR2S_ServerTerminationLeave_11478\u0012\u0018\n\u0010isMergeServerDay\u0018\u0001 \u0001(\b\"\"\n CR2S_ServerTerminationJoin_11480B)\n\u0011com.gzbz.protobufB\u0012CrossCountryWarMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CountryWarMsg.getDescriptor(), BattleMsg.getDescriptor(), CommonMsg.getDescriptor()});
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_MainUi_11401_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_MainUi_11401_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_MainUi_11401_descriptor, new String[]{"IsCompletedTask", "AttToken", "AttNextTokenTime", "MoveToken", "MoveNextTokenTime", "HeroArrayingData", "TransferNum", "AllowTransfer", "SameUnionTransfer", "BuyNum"});
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ChangeCityInfo_11402_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ChangeCityInfo_11402_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ChangeCityInfo_11402_descriptor, new String[]{"Reason", "PlayerId", "PlayerName", "ServerId", "DestCityId", "Infos", "AllianceMainServerId"});
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_ActivityState_11403_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_ActivityState_11403_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_ActivityState_11403_descriptor, new String[0]);
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ActivityState_11404_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ActivityState_11404_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ActivityState_11404_descriptor, new String[]{"ActivityId", "MapId", "State"});
      internal_static_crossCountryWar_com_gzbz_protobuf_CountryWarPlayer_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_crossCountryWar_com_gzbz_protobuf_CountryWarPlayer_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_CountryWarPlayer_descriptor, new String[]{"Info", "HeroArrayingData", "IsOnline"});
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_UpLoadPlayerInfo_11405_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_UpLoadPlayerInfo_11405_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_UpLoadPlayerInfo_11405_descriptor, new String[]{"Players"});
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_UpLoadPlayerInfo_11406_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_UpLoadPlayerInfo_11406_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_UpLoadPlayerInfo_11406_descriptor, new String[]{"ActivityId", "MapId", "State", "IsNeedUpload"});
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarState_11407_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarState_11407_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarState_11407_descriptor, new String[]{"ActivityState", "AttToken", "AttNextTokenTime", "MoveToken", "MoveNextTokenTime", "IsCompletedTask", "IsSocreReward", "OpenDays"});
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarRank_11409_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarRank_11409_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarRank_11409_descriptor, new String[]{"Type"});
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryLog_11411_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryLog_11411_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryLog_11411_descriptor, new String[]{"Type"});
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_UpdateCityReward_11416_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_UpdateCityReward_11416_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_UpdateCityReward_11416_descriptor, new String[]{"Infos"});
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerInfo_11417_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerInfo_11417_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerInfo_11417_descriptor, new String[]{"SlaveServierId", "PlayerId"});
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_NoticeGrantTaskReward_11420_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_NoticeGrantTaskReward_11420_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_NoticeGrantTaskReward_11420_descriptor, new String[0]);
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_MoveToCity_11431_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_MoveToCity_11431_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_MoveToCity_11431_descriptor, new String[]{"CityId", "MoveToken"});
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_MoveToCity_11432_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_MoveToCity_11432_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_MoveToCity_11432_descriptor, new String[]{"Result", "IsNeedMoveToken"});
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_FihtToCity_11433_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_FihtToCity_11433_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_FihtToCity_11433_descriptor, new String[]{"CityId", "HeroArrayingData", "IsSkip"});
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_FihtToCity_11434_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_FihtToCity_11434_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_FihtToCity_11434_descriptor, new String[]{"OptionalResult", "IsFight", "IsWin", "IsOccypy", "FightResult"});
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TransferToCity_11435_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TransferToCity_11435_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TransferToCity_11435_descriptor, new String[]{"CityId", "TransferPlayerId", "AttToken", "MoveToken"});
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_TransferToCity_11436_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_TransferToCity_11436_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_TransferToCity_11436_descriptor, new String[]{"Result", "ConsumeToken", "IsFight", "IsWin", "IsOccypy", "Info", "IsBreakDefense"});
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TransferList_11437_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TransferList_11437_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TransferList_11437_descriptor, new String[0]);
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_DefSuccess_11438_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_DefSuccess_11438_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_DefSuccess_11438_descriptor, new String[0]);
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TakeCityReward_11441_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TakeCityReward_11441_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TakeCityReward_11441_descriptor, new String[0]);
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_TakeCityReward_11442_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_TakeCityReward_11442_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_TakeCityReward_11442_descriptor, new String[]{"Result", "Items"});
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_OpenTurnTableUi_11461_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_OpenTurnTableUi_11461_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_OpenTurnTableUi_11461_descriptor, new String[0]);
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_OpenTurnTableUi_11462_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_OpenTurnTableUi_11462_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_OpenTurnTableUi_11462_descriptor, new String[]{"Records"});
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_LuckDrawRecord_11463_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_LuckDrawRecord_11463_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_LuckDrawRecord_11463_descriptor, new String[]{"Record"});
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_LuckDrawRecord_11464_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_LuckDrawRecord_11464_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_LuckDrawRecord_11464_descriptor, new String[]{"PlayerId", "Records"});
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_BuyItem_11467_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_BuyItem_11467_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_BuyItem_11467_descriptor, new String[]{"Id", "Num"});
      internal_static_crossCountryWar_com_gzbz_protobuf_PlayerRewardInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_crossCountryWar_com_gzbz_protobuf_PlayerRewardInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_PlayerRewardInfo_descriptor, new String[]{"PlayerId", "Rank"});
      internal_static_crossCountryWar_com_gzbz_protobuf_RewardInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_crossCountryWar_com_gzbz_protobuf_RewardInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_RewardInfo_descriptor, new String[]{"Type", "Infos"});
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_SeasonReward_11468_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_SeasonReward_11468_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_SeasonReward_11468_descriptor, new String[]{"CountryRank", "Players", "RewardInfos", "SendType"});
      internal_static_crossCountryWar_com_gzbz_protobuf_PlayerReward_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_crossCountryWar_com_gzbz_protobuf_PlayerReward_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_PlayerReward_descriptor, new String[]{"PlayerId", "ItemInfos"});
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_SeasonCityReward_11470_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_SeasonCityReward_11470_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_SeasonCityReward_11470_descriptor, new String[]{"PlayerRewards"});
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarGm_11471_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarGm_11471_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarGm_11471_descriptor, new String[]{"Cmd", "Params"});
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerLoginIn_11473_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerLoginIn_11473_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerLoginIn_11473_descriptor, new String[0]);
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerLoginOut_11475_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(35);
      internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerLoginOut_11475_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerLoginOut_11475_descriptor, new String[0]);
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ServerTerminationLeave_11478_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(36);
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ServerTerminationLeave_11478_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ServerTerminationLeave_11478_descriptor, new String[]{"IsMergeServerDay"});
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ServerTerminationJoin_11480_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(37);
      internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ServerTerminationJoin_11480_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ServerTerminationJoin_11480_descriptor, new String[0]);
      CountryWarMsg.getDescriptor();
      BattleMsg.getDescriptor();
      CommonMsg.getDescriptor();
   }

   public static final class S2CR_MainUi_11401 extends GeneratedMessageV3 implements S2CR_MainUi_11401OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ISCOMPLETEDTASK_FIELD_NUMBER = 1;
      private boolean isCompletedTask_;
      public static final int ATTTOKEN_FIELD_NUMBER = 2;
      private int attToken_;
      public static final int ATTNEXTTOKENTIME_FIELD_NUMBER = 3;
      private int attNextTokenTime_;
      public static final int MOVETOKEN_FIELD_NUMBER = 4;
      private int moveToken_;
      public static final int MOVENEXTTOKENTIME_FIELD_NUMBER = 5;
      private int moveNextTokenTime_;
      public static final int HEROARRAYINGDATA_FIELD_NUMBER = 6;
      private ByteString heroArrayingData_;
      public static final int TRANSFERNUM_FIELD_NUMBER = 7;
      private int transferNum_;
      public static final int ALLOWTRANSFER_FIELD_NUMBER = 8;
      private boolean allowTransfer_;
      public static final int SAMEUNIONTRANSFER_FIELD_NUMBER = 9;
      private boolean sameUnionTransfer_;
      public static final int BUYNUM_FIELD_NUMBER = 16;
      private int buyNum_;
      private byte memoizedIsInitialized;
      private static final S2CR_MainUi_11401 DEFAULT_INSTANCE = new S2CR_MainUi_11401();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_MainUi_11401> PARSER = new AbstractParser<S2CR_MainUi_11401>() {
         public S2CR_MainUi_11401 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_MainUi_11401(input, extensionRegistry);
         }
      };

      private S2CR_MainUi_11401(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_MainUi_11401() {
         this.memoizedIsInitialized = -1;
         this.heroArrayingData_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_MainUi_11401();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_MainUi_11401(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.isCompletedTask_ = input.readBool();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.attToken_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.attNextTokenTime_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.moveToken_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.moveNextTokenTime_ = input.readInt32();
                        break;
                     case 50:
                        this.bitField0_ |= 32;
                        this.heroArrayingData_ = input.readBytes();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.transferNum_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.allowTransfer_ = input.readBool();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.sameUnionTransfer_ = input.readBool();
                        break;
                     case 128:
                        this.bitField0_ |= 512;
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_MainUi_11401_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_MainUi_11401_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MainUi_11401.class, Builder.class);
      }

      public boolean hasIsCompletedTask() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsCompletedTask() {
         return this.isCompletedTask_;
      }

      public boolean hasAttToken() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getAttToken() {
         return this.attToken_;
      }

      public boolean hasAttNextTokenTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getAttNextTokenTime() {
         return this.attNextTokenTime_;
      }

      public boolean hasMoveToken() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getMoveToken() {
         return this.moveToken_;
      }

      public boolean hasMoveNextTokenTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getMoveNextTokenTime() {
         return this.moveNextTokenTime_;
      }

      public boolean hasHeroArrayingData() {
         return (this.bitField0_ & 32) != 0;
      }

      public ByteString getHeroArrayingData() {
         return this.heroArrayingData_;
      }

      public boolean hasTransferNum() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getTransferNum() {
         return this.transferNum_;
      }

      public boolean hasAllowTransfer() {
         return (this.bitField0_ & 128) != 0;
      }

      public boolean getAllowTransfer() {
         return this.allowTransfer_;
      }

      public boolean hasSameUnionTransfer() {
         return (this.bitField0_ & 256) != 0;
      }

      public boolean getSameUnionTransfer() {
         return this.sameUnionTransfer_;
      }

      public boolean hasBuyNum() {
         return (this.bitField0_ & 512) != 0;
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
         } else if (!this.hasIsCompletedTask()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAttToken()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAttNextTokenTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMoveToken()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMoveNextTokenTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroArrayingData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTransferNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAllowTransfer()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSameUnionTransfer()) {
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
            output.writeBool(1, this.isCompletedTask_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.attToken_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.attNextTokenTime_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.moveToken_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.moveNextTokenTime_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeBytes(6, this.heroArrayingData_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.transferNum_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeBool(8, this.allowTransfer_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeBool(9, this.sameUnionTransfer_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(16, this.buyNum_);
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
               size += CodedOutputStream.computeBoolSize(1, this.isCompletedTask_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.attToken_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.attNextTokenTime_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.moveToken_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.moveNextTokenTime_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeBytesSize(6, this.heroArrayingData_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.transferNum_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeBoolSize(8, this.allowTransfer_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeBoolSize(9, this.sameUnionTransfer_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(16, this.buyNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_MainUi_11401)) {
            return super.equals(obj);
         } else {
            S2CR_MainUi_11401 other = (S2CR_MainUi_11401)obj;
            if (this.hasIsCompletedTask() != other.hasIsCompletedTask()) {
               return false;
            } else if (this.hasIsCompletedTask() && this.getIsCompletedTask() != other.getIsCompletedTask()) {
               return false;
            } else if (this.hasAttToken() != other.hasAttToken()) {
               return false;
            } else if (this.hasAttToken() && this.getAttToken() != other.getAttToken()) {
               return false;
            } else if (this.hasAttNextTokenTime() != other.hasAttNextTokenTime()) {
               return false;
            } else if (this.hasAttNextTokenTime() && this.getAttNextTokenTime() != other.getAttNextTokenTime()) {
               return false;
            } else if (this.hasMoveToken() != other.hasMoveToken()) {
               return false;
            } else if (this.hasMoveToken() && this.getMoveToken() != other.getMoveToken()) {
               return false;
            } else if (this.hasMoveNextTokenTime() != other.hasMoveNextTokenTime()) {
               return false;
            } else if (this.hasMoveNextTokenTime() && this.getMoveNextTokenTime() != other.getMoveNextTokenTime()) {
               return false;
            } else if (this.hasHeroArrayingData() != other.hasHeroArrayingData()) {
               return false;
            } else if (this.hasHeroArrayingData() && !this.getHeroArrayingData().equals(other.getHeroArrayingData())) {
               return false;
            } else if (this.hasTransferNum() != other.hasTransferNum()) {
               return false;
            } else if (this.hasTransferNum() && this.getTransferNum() != other.getTransferNum()) {
               return false;
            } else if (this.hasAllowTransfer() != other.hasAllowTransfer()) {
               return false;
            } else if (this.hasAllowTransfer() && this.getAllowTransfer() != other.getAllowTransfer()) {
               return false;
            } else if (this.hasSameUnionTransfer() != other.hasSameUnionTransfer()) {
               return false;
            } else if (this.hasSameUnionTransfer() && this.getSameUnionTransfer() != other.getSameUnionTransfer()) {
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
            if (this.hasIsCompletedTask()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getIsCompletedTask());
            }

            if (this.hasAttToken()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAttToken();
            }

            if (this.hasAttNextTokenTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getAttNextTokenTime();
            }

            if (this.hasMoveToken()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getMoveToken();
            }

            if (this.hasMoveNextTokenTime()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getMoveNextTokenTime();
            }

            if (this.hasHeroArrayingData()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getHeroArrayingData().hashCode();
            }

            if (this.hasTransferNum()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getTransferNum();
            }

            if (this.hasAllowTransfer()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + Internal.hashBoolean(this.getAllowTransfer());
            }

            if (this.hasSameUnionTransfer()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + Internal.hashBoolean(this.getSameUnionTransfer());
            }

            if (this.hasBuyNum()) {
               hash = 37 * hash + 16;
               hash = 53 * hash + this.getBuyNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_MainUi_11401 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_MainUi_11401)PARSER.parseFrom(data);
      }

      public static S2CR_MainUi_11401 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MainUi_11401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MainUi_11401 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_MainUi_11401)PARSER.parseFrom(data);
      }

      public static S2CR_MainUi_11401 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MainUi_11401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MainUi_11401 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_MainUi_11401)PARSER.parseFrom(data);
      }

      public static S2CR_MainUi_11401 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MainUi_11401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MainUi_11401 parseFrom(InputStream input) throws IOException {
         return (S2CR_MainUi_11401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MainUi_11401 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MainUi_11401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MainUi_11401 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_MainUi_11401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_MainUi_11401 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MainUi_11401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MainUi_11401 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_MainUi_11401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MainUi_11401 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MainUi_11401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_MainUi_11401 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_MainUi_11401 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_MainUi_11401> parser() {
         return PARSER;
      }

      public Parser<S2CR_MainUi_11401> getParserForType() {
         return PARSER;
      }

      public S2CR_MainUi_11401 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_MainUi_11401OrBuilder {
         private int bitField0_;
         private boolean isCompletedTask_;
         private int attToken_;
         private int attNextTokenTime_;
         private int moveToken_;
         private int moveNextTokenTime_;
         private ByteString heroArrayingData_;
         private int transferNum_;
         private boolean allowTransfer_;
         private boolean sameUnionTransfer_;
         private int buyNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_MainUi_11401_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_MainUi_11401_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MainUi_11401.class, Builder.class);
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
            if (CrossCountryWarMsg.S2CR_MainUi_11401.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.isCompletedTask_ = false;
            this.bitField0_ &= -2;
            this.attToken_ = 0;
            this.bitField0_ &= -3;
            this.attNextTokenTime_ = 0;
            this.bitField0_ &= -5;
            this.moveToken_ = 0;
            this.bitField0_ &= -9;
            this.moveNextTokenTime_ = 0;
            this.bitField0_ &= -17;
            this.heroArrayingData_ = ByteString.EMPTY;
            this.bitField0_ &= -33;
            this.transferNum_ = 0;
            this.bitField0_ &= -65;
            this.allowTransfer_ = false;
            this.bitField0_ &= -129;
            this.sameUnionTransfer_ = false;
            this.bitField0_ &= -257;
            this.buyNum_ = 0;
            this.bitField0_ &= -513;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_MainUi_11401_descriptor;
         }

         public S2CR_MainUi_11401 getDefaultInstanceForType() {
            return CrossCountryWarMsg.S2CR_MainUi_11401.getDefaultInstance();
         }

         public S2CR_MainUi_11401 build() {
            S2CR_MainUi_11401 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_MainUi_11401 buildPartial() {
            S2CR_MainUi_11401 result = new S2CR_MainUi_11401(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.isCompletedTask_ = this.isCompletedTask_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.attToken_ = this.attToken_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.attNextTokenTime_ = this.attNextTokenTime_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.moveToken_ = this.moveToken_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.moveNextTokenTime_ = this.moveNextTokenTime_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               to_bitField0_ |= 32;
            }

            result.heroArrayingData_ = this.heroArrayingData_;
            if ((from_bitField0_ & 64) != 0) {
               result.transferNum_ = this.transferNum_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.allowTransfer_ = this.allowTransfer_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.sameUnionTransfer_ = this.sameUnionTransfer_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.buyNum_ = this.buyNum_;
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
            if (other instanceof S2CR_MainUi_11401) {
               return this.mergeFrom((S2CR_MainUi_11401)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_MainUi_11401 other) {
            if (other == CrossCountryWarMsg.S2CR_MainUi_11401.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIsCompletedTask()) {
                  this.setIsCompletedTask(other.getIsCompletedTask());
               }

               if (other.hasAttToken()) {
                  this.setAttToken(other.getAttToken());
               }

               if (other.hasAttNextTokenTime()) {
                  this.setAttNextTokenTime(other.getAttNextTokenTime());
               }

               if (other.hasMoveToken()) {
                  this.setMoveToken(other.getMoveToken());
               }

               if (other.hasMoveNextTokenTime()) {
                  this.setMoveNextTokenTime(other.getMoveNextTokenTime());
               }

               if (other.hasHeroArrayingData()) {
                  this.setHeroArrayingData(other.getHeroArrayingData());
               }

               if (other.hasTransferNum()) {
                  this.setTransferNum(other.getTransferNum());
               }

               if (other.hasAllowTransfer()) {
                  this.setAllowTransfer(other.getAllowTransfer());
               }

               if (other.hasSameUnionTransfer()) {
                  this.setSameUnionTransfer(other.getSameUnionTransfer());
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
            if (!this.hasIsCompletedTask()) {
               return false;
            } else if (!this.hasAttToken()) {
               return false;
            } else if (!this.hasAttNextTokenTime()) {
               return false;
            } else if (!this.hasMoveToken()) {
               return false;
            } else if (!this.hasMoveNextTokenTime()) {
               return false;
            } else if (!this.hasHeroArrayingData()) {
               return false;
            } else if (!this.hasTransferNum()) {
               return false;
            } else if (!this.hasAllowTransfer()) {
               return false;
            } else if (!this.hasSameUnionTransfer()) {
               return false;
            } else {
               return this.hasBuyNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_MainUi_11401 parsedMessage = null;

            try {
               parsedMessage = (S2CR_MainUi_11401)CrossCountryWarMsg.S2CR_MainUi_11401.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_MainUi_11401)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIsCompletedTask() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getIsCompletedTask() {
            return this.isCompletedTask_;
         }

         public Builder setIsCompletedTask(boolean value) {
            this.bitField0_ |= 1;
            this.isCompletedTask_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsCompletedTask() {
            this.bitField0_ &= -2;
            this.isCompletedTask_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasAttToken() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getAttToken() {
            return this.attToken_;
         }

         public Builder setAttToken(int value) {
            this.bitField0_ |= 2;
            this.attToken_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAttToken() {
            this.bitField0_ &= -3;
            this.attToken_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAttNextTokenTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getAttNextTokenTime() {
            return this.attNextTokenTime_;
         }

         public Builder setAttNextTokenTime(int value) {
            this.bitField0_ |= 4;
            this.attNextTokenTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAttNextTokenTime() {
            this.bitField0_ &= -5;
            this.attNextTokenTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMoveToken() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getMoveToken() {
            return this.moveToken_;
         }

         public Builder setMoveToken(int value) {
            this.bitField0_ |= 8;
            this.moveToken_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMoveToken() {
            this.bitField0_ &= -9;
            this.moveToken_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMoveNextTokenTime() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getMoveNextTokenTime() {
            return this.moveNextTokenTime_;
         }

         public Builder setMoveNextTokenTime(int value) {
            this.bitField0_ |= 16;
            this.moveNextTokenTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMoveNextTokenTime() {
            this.bitField0_ &= -17;
            this.moveNextTokenTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroArrayingData() {
            return (this.bitField0_ & 32) != 0;
         }

         public ByteString getHeroArrayingData() {
            return this.heroArrayingData_;
         }

         public Builder setHeroArrayingData(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 32;
               this.heroArrayingData_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearHeroArrayingData() {
            this.bitField0_ &= -33;
            this.heroArrayingData_ = CrossCountryWarMsg.S2CR_MainUi_11401.getDefaultInstance().getHeroArrayingData();
            this.onChanged();
            return this;
         }

         public boolean hasTransferNum() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getTransferNum() {
            return this.transferNum_;
         }

         public Builder setTransferNum(int value) {
            this.bitField0_ |= 64;
            this.transferNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTransferNum() {
            this.bitField0_ &= -65;
            this.transferNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAllowTransfer() {
            return (this.bitField0_ & 128) != 0;
         }

         public boolean getAllowTransfer() {
            return this.allowTransfer_;
         }

         public Builder setAllowTransfer(boolean value) {
            this.bitField0_ |= 128;
            this.allowTransfer_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAllowTransfer() {
            this.bitField0_ &= -129;
            this.allowTransfer_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasSameUnionTransfer() {
            return (this.bitField0_ & 256) != 0;
         }

         public boolean getSameUnionTransfer() {
            return this.sameUnionTransfer_;
         }

         public Builder setSameUnionTransfer(boolean value) {
            this.bitField0_ |= 256;
            this.sameUnionTransfer_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSameUnionTransfer() {
            this.bitField0_ &= -257;
            this.sameUnionTransfer_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasBuyNum() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getBuyNum() {
            return this.buyNum_;
         }

         public Builder setBuyNum(int value) {
            this.bitField0_ |= 512;
            this.buyNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyNum() {
            this.bitField0_ &= -513;
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

   public static final class CR2S_ChangeCityInfo_11402 extends GeneratedMessageV3 implements CR2S_ChangeCityInfo_11402OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REASON_FIELD_NUMBER = 1;
      private int reason_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 3;
      private volatile Object playerName_;
      public static final int SERVERID_FIELD_NUMBER = 4;
      private int serverId_;
      public static final int DESTCITYID_FIELD_NUMBER = 5;
      private int destCityId_;
      public static final int INFOS_FIELD_NUMBER = 6;
      private List<CountryWarMsg.CityInfo> infos_;
      public static final int ALLIANCEMAINSERVERID_FIELD_NUMBER = 7;
      private int allianceMainServerId_;
      private byte memoizedIsInitialized;
      private static final CR2S_ChangeCityInfo_11402 DEFAULT_INSTANCE = new CR2S_ChangeCityInfo_11402();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_ChangeCityInfo_11402> PARSER = new AbstractParser<CR2S_ChangeCityInfo_11402>() {
         public CR2S_ChangeCityInfo_11402 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_ChangeCityInfo_11402(input, extensionRegistry);
         }
      };

      private CR2S_ChangeCityInfo_11402(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_ChangeCityInfo_11402() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_ChangeCityInfo_11402();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_ChangeCityInfo_11402(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.reason_ = input.readInt32();
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
                        this.serverId_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.destCityId_ = input.readInt32();
                        break;
                     case 50:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 32;
                        }

                        this.infos_.add(input.readMessage(CountryWarMsg.CityInfo.PARSER, extensionRegistry));
                        break;
                     case 56:
                        this.bitField0_ |= 32;
                        this.allianceMainServerId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 32) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ChangeCityInfo_11402_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ChangeCityInfo_11402_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ChangeCityInfo_11402.class, Builder.class);
      }

      public boolean hasReason() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getReason() {
         return this.reason_;
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

      public boolean hasServerId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasDestCityId() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getDestCityId() {
         return this.destCityId_;
      }

      public List<CountryWarMsg.CityInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends CountryWarMsg.CityInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public CountryWarMsg.CityInfo getInfos(int index) {
         return (CountryWarMsg.CityInfo)this.infos_.get(index);
      }

      public CountryWarMsg.CityInfoOrBuilder getInfosOrBuilder(int index) {
         return (CountryWarMsg.CityInfoOrBuilder)this.infos_.get(index);
      }

      public boolean hasAllianceMainServerId() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getAllianceMainServerId() {
         return this.allianceMainServerId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasReason()) {
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
            output.writeInt32(1, this.reason_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.playerName_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.serverId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.destCityId_);
         }

         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(6, (MessageLite)this.infos_.get(i));
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(7, this.allianceMainServerId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.reason_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.playerName_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.serverId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.destCityId_);
            }

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(6, (MessageLite)this.infos_.get(i));
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.allianceMainServerId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_ChangeCityInfo_11402)) {
            return super.equals(obj);
         } else {
            CR2S_ChangeCityInfo_11402 other = (CR2S_ChangeCityInfo_11402)obj;
            if (this.hasReason() != other.hasReason()) {
               return false;
            } else if (this.hasReason() && this.getReason() != other.getReason()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasDestCityId() != other.hasDestCityId()) {
               return false;
            } else if (this.hasDestCityId() && this.getDestCityId() != other.getDestCityId()) {
               return false;
            } else if (!this.getInfosList().equals(other.getInfosList())) {
               return false;
            } else if (this.hasAllianceMainServerId() != other.hasAllianceMainServerId()) {
               return false;
            } else if (this.hasAllianceMainServerId() && this.getAllianceMainServerId() != other.getAllianceMainServerId()) {
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
            if (this.hasReason()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getReason();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasDestCityId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getDestCityId();
            }

            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            if (this.hasAllianceMainServerId()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getAllianceMainServerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_ChangeCityInfo_11402 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_ChangeCityInfo_11402)PARSER.parseFrom(data);
      }

      public static CR2S_ChangeCityInfo_11402 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ChangeCityInfo_11402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ChangeCityInfo_11402 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_ChangeCityInfo_11402)PARSER.parseFrom(data);
      }

      public static CR2S_ChangeCityInfo_11402 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ChangeCityInfo_11402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ChangeCityInfo_11402 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_ChangeCityInfo_11402)PARSER.parseFrom(data);
      }

      public static CR2S_ChangeCityInfo_11402 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ChangeCityInfo_11402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ChangeCityInfo_11402 parseFrom(InputStream input) throws IOException {
         return (CR2S_ChangeCityInfo_11402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ChangeCityInfo_11402 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ChangeCityInfo_11402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ChangeCityInfo_11402 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_ChangeCityInfo_11402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_ChangeCityInfo_11402 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ChangeCityInfo_11402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ChangeCityInfo_11402 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_ChangeCityInfo_11402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ChangeCityInfo_11402 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ChangeCityInfo_11402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_ChangeCityInfo_11402 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_ChangeCityInfo_11402 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_ChangeCityInfo_11402> parser() {
         return PARSER;
      }

      public Parser<CR2S_ChangeCityInfo_11402> getParserForType() {
         return PARSER;
      }

      public CR2S_ChangeCityInfo_11402 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_ChangeCityInfo_11402OrBuilder {
         private int bitField0_;
         private int reason_;
         private int playerId_;
         private Object playerName_;
         private int serverId_;
         private int destCityId_;
         private List<CountryWarMsg.CityInfo> infos_;
         private RepeatedFieldBuilderV3<CountryWarMsg.CityInfo, CountryWarMsg.CityInfo.Builder, CountryWarMsg.CityInfoOrBuilder> infosBuilder_;
         private int allianceMainServerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ChangeCityInfo_11402_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ChangeCityInfo_11402_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ChangeCityInfo_11402.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.infos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.infos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.CR2S_ChangeCityInfo_11402.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.reason_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.playerName_ = "";
            this.bitField0_ &= -5;
            this.serverId_ = 0;
            this.bitField0_ &= -9;
            this.destCityId_ = 0;
            this.bitField0_ &= -17;
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -33;
            } else {
               this.infosBuilder_.clear();
            }

            this.allianceMainServerId_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ChangeCityInfo_11402_descriptor;
         }

         public CR2S_ChangeCityInfo_11402 getDefaultInstanceForType() {
            return CrossCountryWarMsg.CR2S_ChangeCityInfo_11402.getDefaultInstance();
         }

         public CR2S_ChangeCityInfo_11402 build() {
            CR2S_ChangeCityInfo_11402 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_ChangeCityInfo_11402 buildPartial() {
            CR2S_ChangeCityInfo_11402 result = new CR2S_ChangeCityInfo_11402(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.reason_ = this.reason_;
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
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.destCityId_ = this.destCityId_;
               to_bitField0_ |= 16;
            }

            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -33;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
            }

            if ((from_bitField0_ & 64) != 0) {
               result.allianceMainServerId_ = this.allianceMainServerId_;
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
            if (other instanceof CR2S_ChangeCityInfo_11402) {
               return this.mergeFrom((CR2S_ChangeCityInfo_11402)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_ChangeCityInfo_11402 other) {
            if (other == CrossCountryWarMsg.CR2S_ChangeCityInfo_11402.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasReason()) {
                  this.setReason(other.getReason());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 4;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasDestCityId()) {
                  this.setDestCityId(other.getDestCityId());
               }

               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -33;
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
                     this.bitField0_ &= -33;
                     this.infosBuilder_ = CrossCountryWarMsg.CR2S_ChangeCityInfo_11402.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               if (other.hasAllianceMainServerId()) {
                  this.setAllianceMainServerId(other.getAllianceMainServerId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasReason()) {
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
            CR2S_ChangeCityInfo_11402 parsedMessage = null;

            try {
               parsedMessage = (CR2S_ChangeCityInfo_11402)CrossCountryWarMsg.CR2S_ChangeCityInfo_11402.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_ChangeCityInfo_11402)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasReason() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getReason() {
            return this.reason_;
         }

         public Builder setReason(int value) {
            this.bitField0_ |= 1;
            this.reason_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearReason() {
            this.bitField0_ &= -2;
            this.reason_ = 0;
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
            this.playerName_ = CrossCountryWarMsg.CR2S_ChangeCityInfo_11402.getDefaultInstance().getPlayerName();
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

         public boolean hasServerId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 8;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -9;
            this.serverId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDestCityId() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getDestCityId() {
            return this.destCityId_;
         }

         public Builder setDestCityId(int value) {
            this.bitField0_ |= 16;
            this.destCityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDestCityId() {
            this.bitField0_ &= -17;
            this.destCityId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 32;
            }

         }

         public List<CountryWarMsg.CityInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public CountryWarMsg.CityInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (CountryWarMsg.CityInfo)this.infos_.get(index) : (CountryWarMsg.CityInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, CountryWarMsg.CityInfo value) {
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

         public Builder setInfos(int index, CountryWarMsg.CityInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(CountryWarMsg.CityInfo value) {
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

         public Builder addInfos(int index, CountryWarMsg.CityInfo value) {
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

         public Builder addInfos(CountryWarMsg.CityInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, CountryWarMsg.CityInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends CountryWarMsg.CityInfo> values) {
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
               this.bitField0_ &= -33;
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

         public CountryWarMsg.CityInfo.Builder getInfosBuilder(int index) {
            return (CountryWarMsg.CityInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public CountryWarMsg.CityInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (CountryWarMsg.CityInfoOrBuilder)this.infos_.get(index) : (CountryWarMsg.CityInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CountryWarMsg.CityInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public CountryWarMsg.CityInfo.Builder addInfosBuilder() {
            return (CountryWarMsg.CityInfo.Builder)this.getInfosFieldBuilder().addBuilder(CountryWarMsg.CityInfo.getDefaultInstance());
         }

         public CountryWarMsg.CityInfo.Builder addInfosBuilder(int index) {
            return (CountryWarMsg.CityInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, CountryWarMsg.CityInfo.getDefaultInstance());
         }

         public List<CountryWarMsg.CityInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CountryWarMsg.CityInfo, CountryWarMsg.CityInfo.Builder, CountryWarMsg.CityInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         public boolean hasAllianceMainServerId() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getAllianceMainServerId() {
            return this.allianceMainServerId_;
         }

         public Builder setAllianceMainServerId(int value) {
            this.bitField0_ |= 64;
            this.allianceMainServerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAllianceMainServerId() {
            this.bitField0_ &= -65;
            this.allianceMainServerId_ = 0;
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

   public static final class S2CR_ActivityState_11403 extends GeneratedMessageV3 implements S2CR_ActivityState_11403OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_ActivityState_11403 DEFAULT_INSTANCE = new S2CR_ActivityState_11403();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_ActivityState_11403> PARSER = new AbstractParser<S2CR_ActivityState_11403>() {
         public S2CR_ActivityState_11403 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_ActivityState_11403(input, extensionRegistry);
         }
      };

      private S2CR_ActivityState_11403(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_ActivityState_11403() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_ActivityState_11403();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_ActivityState_11403(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_ActivityState_11403_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_ActivityState_11403_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ActivityState_11403.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_ActivityState_11403)) {
            return super.equals(obj);
         } else {
            S2CR_ActivityState_11403 other = (S2CR_ActivityState_11403)obj;
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

      public static S2CR_ActivityState_11403 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_ActivityState_11403)PARSER.parseFrom(data);
      }

      public static S2CR_ActivityState_11403 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ActivityState_11403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ActivityState_11403 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_ActivityState_11403)PARSER.parseFrom(data);
      }

      public static S2CR_ActivityState_11403 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ActivityState_11403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ActivityState_11403 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_ActivityState_11403)PARSER.parseFrom(data);
      }

      public static S2CR_ActivityState_11403 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ActivityState_11403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ActivityState_11403 parseFrom(InputStream input) throws IOException {
         return (S2CR_ActivityState_11403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ActivityState_11403 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ActivityState_11403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ActivityState_11403 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_ActivityState_11403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_ActivityState_11403 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ActivityState_11403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ActivityState_11403 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_ActivityState_11403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ActivityState_11403 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ActivityState_11403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_ActivityState_11403 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_ActivityState_11403 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_ActivityState_11403> parser() {
         return PARSER;
      }

      public Parser<S2CR_ActivityState_11403> getParserForType() {
         return PARSER;
      }

      public S2CR_ActivityState_11403 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_ActivityState_11403OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_ActivityState_11403_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_ActivityState_11403_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ActivityState_11403.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.S2CR_ActivityState_11403.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_ActivityState_11403_descriptor;
         }

         public S2CR_ActivityState_11403 getDefaultInstanceForType() {
            return CrossCountryWarMsg.S2CR_ActivityState_11403.getDefaultInstance();
         }

         public S2CR_ActivityState_11403 build() {
            S2CR_ActivityState_11403 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_ActivityState_11403 buildPartial() {
            S2CR_ActivityState_11403 result = new S2CR_ActivityState_11403(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_ActivityState_11403) {
               return this.mergeFrom((S2CR_ActivityState_11403)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_ActivityState_11403 other) {
            if (other == CrossCountryWarMsg.S2CR_ActivityState_11403.getDefaultInstance()) {
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
            S2CR_ActivityState_11403 parsedMessage = null;

            try {
               parsedMessage = (S2CR_ActivityState_11403)CrossCountryWarMsg.S2CR_ActivityState_11403.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_ActivityState_11403)e.getUnfinishedMessage();
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

   public static final class CR2S_ActivityState_11404 extends GeneratedMessageV3 implements CR2S_ActivityState_11404OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYID_FIELD_NUMBER = 1;
      private int activityId_;
      public static final int MAPID_FIELD_NUMBER = 2;
      private int mapId_;
      public static final int STATE_FIELD_NUMBER = 3;
      private int state_;
      private byte memoizedIsInitialized;
      private static final CR2S_ActivityState_11404 DEFAULT_INSTANCE = new CR2S_ActivityState_11404();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_ActivityState_11404> PARSER = new AbstractParser<CR2S_ActivityState_11404>() {
         public CR2S_ActivityState_11404 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_ActivityState_11404(input, extensionRegistry);
         }
      };

      private CR2S_ActivityState_11404(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_ActivityState_11404() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_ActivityState_11404();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_ActivityState_11404(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.activityId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.mapId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ActivityState_11404_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ActivityState_11404_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ActivityState_11404.class, Builder.class);
      }

      public boolean hasActivityId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityId() {
         return this.activityId_;
      }

      public boolean hasMapId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getMapId() {
         return this.mapId_;
      }

      public boolean hasState() {
         return (this.bitField0_ & 4) != 0;
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
         } else if (!this.hasActivityId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMapId()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.activityId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.mapId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.state_);
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
               size += CodedOutputStream.computeInt32Size(1, this.activityId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.mapId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.state_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_ActivityState_11404)) {
            return super.equals(obj);
         } else {
            CR2S_ActivityState_11404 other = (CR2S_ActivityState_11404)obj;
            if (this.hasActivityId() != other.hasActivityId()) {
               return false;
            } else if (this.hasActivityId() && this.getActivityId() != other.getActivityId()) {
               return false;
            } else if (this.hasMapId() != other.hasMapId()) {
               return false;
            } else if (this.hasMapId() && this.getMapId() != other.getMapId()) {
               return false;
            } else if (this.hasState() != other.hasState()) {
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
            if (this.hasActivityId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getActivityId();
            }

            if (this.hasMapId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMapId();
            }

            if (this.hasState()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getState();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_ActivityState_11404 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_ActivityState_11404)PARSER.parseFrom(data);
      }

      public static CR2S_ActivityState_11404 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ActivityState_11404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ActivityState_11404 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_ActivityState_11404)PARSER.parseFrom(data);
      }

      public static CR2S_ActivityState_11404 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ActivityState_11404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ActivityState_11404 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_ActivityState_11404)PARSER.parseFrom(data);
      }

      public static CR2S_ActivityState_11404 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ActivityState_11404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ActivityState_11404 parseFrom(InputStream input) throws IOException {
         return (CR2S_ActivityState_11404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ActivityState_11404 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ActivityState_11404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ActivityState_11404 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_ActivityState_11404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_ActivityState_11404 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ActivityState_11404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ActivityState_11404 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_ActivityState_11404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ActivityState_11404 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ActivityState_11404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_ActivityState_11404 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_ActivityState_11404 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_ActivityState_11404> parser() {
         return PARSER;
      }

      public Parser<CR2S_ActivityState_11404> getParserForType() {
         return PARSER;
      }

      public CR2S_ActivityState_11404 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_ActivityState_11404OrBuilder {
         private int bitField0_;
         private int activityId_;
         private int mapId_;
         private int state_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ActivityState_11404_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ActivityState_11404_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ActivityState_11404.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.CR2S_ActivityState_11404.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityId_ = 0;
            this.bitField0_ &= -2;
            this.mapId_ = 0;
            this.bitField0_ &= -3;
            this.state_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ActivityState_11404_descriptor;
         }

         public CR2S_ActivityState_11404 getDefaultInstanceForType() {
            return CrossCountryWarMsg.CR2S_ActivityState_11404.getDefaultInstance();
         }

         public CR2S_ActivityState_11404 build() {
            CR2S_ActivityState_11404 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_ActivityState_11404 buildPartial() {
            CR2S_ActivityState_11404 result = new CR2S_ActivityState_11404(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityId_ = this.activityId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.mapId_ = this.mapId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.state_ = this.state_;
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
            if (other instanceof CR2S_ActivityState_11404) {
               return this.mergeFrom((CR2S_ActivityState_11404)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_ActivityState_11404 other) {
            if (other == CrossCountryWarMsg.CR2S_ActivityState_11404.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityId()) {
                  this.setActivityId(other.getActivityId());
               }

               if (other.hasMapId()) {
                  this.setMapId(other.getMapId());
               }

               if (other.hasState()) {
                  this.setState(other.getState());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActivityId()) {
               return false;
            } else if (!this.hasMapId()) {
               return false;
            } else {
               return this.hasState();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_ActivityState_11404 parsedMessage = null;

            try {
               parsedMessage = (CR2S_ActivityState_11404)CrossCountryWarMsg.CR2S_ActivityState_11404.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_ActivityState_11404)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasActivityId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getActivityId() {
            return this.activityId_;
         }

         public Builder setActivityId(int value) {
            this.bitField0_ |= 1;
            this.activityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityId() {
            this.bitField0_ &= -2;
            this.activityId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMapId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getMapId() {
            return this.mapId_;
         }

         public Builder setMapId(int value) {
            this.bitField0_ |= 2;
            this.mapId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMapId() {
            this.bitField0_ &= -3;
            this.mapId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasState() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getState() {
            return this.state_;
         }

         public Builder setState(int value) {
            this.bitField0_ |= 4;
            this.state_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearState() {
            this.bitField0_ &= -5;
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

   public static final class CountryWarPlayer extends GeneratedMessageV3 implements CountryWarPlayerOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private CommonMsg.PlayerInfo info_;
      public static final int HEROARRAYINGDATA_FIELD_NUMBER = 2;
      private ByteString heroArrayingData_;
      public static final int ISONLINE_FIELD_NUMBER = 3;
      private boolean isOnline_;
      private byte memoizedIsInitialized;
      private static final CountryWarPlayer DEFAULT_INSTANCE = new CountryWarPlayer();
      /** @deprecated */
      @Deprecated
      public static final Parser<CountryWarPlayer> PARSER = new AbstractParser<CountryWarPlayer>() {
         public CountryWarPlayer parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CountryWarPlayer(input, extensionRegistry);
         }
      };

      private CountryWarPlayer(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CountryWarPlayer() {
         this.memoizedIsInitialized = -1;
         this.heroArrayingData_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CountryWarPlayer();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CountryWarPlayer(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.PlayerInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (CommonMsg.PlayerInfo)input.readMessage(CommonMsg.PlayerInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        this.bitField0_ |= 2;
                        this.heroArrayingData_ = input.readBytes();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.isOnline_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CountryWarPlayer_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CountryWarPlayer_fieldAccessorTable.ensureFieldAccessorsInitialized(CountryWarPlayer.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public CommonMsg.PlayerInfo getInfo() {
         return this.info_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.info_;
      }

      public CommonMsg.PlayerInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.info_;
      }

      public boolean hasHeroArrayingData() {
         return (this.bitField0_ & 2) != 0;
      }

      public ByteString getHeroArrayingData() {
         return this.heroArrayingData_;
      }

      public boolean hasIsOnline() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsOnline() {
         return this.isOnline_;
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
         } else if (!this.hasHeroArrayingData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsOnline()) {
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
            output.writeBytes(2, this.heroArrayingData_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.isOnline_);
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
               size += CodedOutputStream.computeBytesSize(2, this.heroArrayingData_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.isOnline_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CountryWarPlayer)) {
            return super.equals(obj);
         } else {
            CountryWarPlayer other = (CountryWarPlayer)obj;
            if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
               return false;
            } else if (this.hasHeroArrayingData() != other.hasHeroArrayingData()) {
               return false;
            } else if (this.hasHeroArrayingData() && !this.getHeroArrayingData().equals(other.getHeroArrayingData())) {
               return false;
            } else if (this.hasIsOnline() != other.hasIsOnline()) {
               return false;
            } else if (this.hasIsOnline() && this.getIsOnline() != other.getIsOnline()) {
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

            if (this.hasHeroArrayingData()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroArrayingData().hashCode();
            }

            if (this.hasIsOnline()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getIsOnline());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CountryWarPlayer parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CountryWarPlayer)PARSER.parseFrom(data);
      }

      public static CountryWarPlayer parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CountryWarPlayer)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CountryWarPlayer parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CountryWarPlayer)PARSER.parseFrom(data);
      }

      public static CountryWarPlayer parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CountryWarPlayer)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CountryWarPlayer parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CountryWarPlayer)PARSER.parseFrom(data);
      }

      public static CountryWarPlayer parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CountryWarPlayer)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CountryWarPlayer parseFrom(InputStream input) throws IOException {
         return (CountryWarPlayer)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CountryWarPlayer parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CountryWarPlayer)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CountryWarPlayer parseDelimitedFrom(InputStream input) throws IOException {
         return (CountryWarPlayer)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CountryWarPlayer parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CountryWarPlayer)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CountryWarPlayer parseFrom(CodedInputStream input) throws IOException {
         return (CountryWarPlayer)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CountryWarPlayer parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CountryWarPlayer)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CountryWarPlayer prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CountryWarPlayer getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CountryWarPlayer> parser() {
         return PARSER;
      }

      public Parser<CountryWarPlayer> getParserForType() {
         return PARSER;
      }

      public CountryWarPlayer getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CountryWarPlayerOrBuilder {
         private int bitField0_;
         private CommonMsg.PlayerInfo info_;
         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> infoBuilder_;
         private ByteString heroArrayingData_;
         private boolean isOnline_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CountryWarPlayer_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CountryWarPlayer_fieldAccessorTable.ensureFieldAccessorsInitialized(CountryWarPlayer.class, Builder.class);
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
            if (CrossCountryWarMsg.CountryWarPlayer.alwaysUseFieldBuilders) {
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
            this.heroArrayingData_ = ByteString.EMPTY;
            this.bitField0_ &= -3;
            this.isOnline_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CountryWarPlayer_descriptor;
         }

         public CountryWarPlayer getDefaultInstanceForType() {
            return CrossCountryWarMsg.CountryWarPlayer.getDefaultInstance();
         }

         public CountryWarPlayer build() {
            CountryWarPlayer result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CountryWarPlayer buildPartial() {
            CountryWarPlayer result = new CountryWarPlayer(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (CommonMsg.PlayerInfo)this.infoBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.heroArrayingData_ = this.heroArrayingData_;
            if ((from_bitField0_ & 4) != 0) {
               result.isOnline_ = this.isOnline_;
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
            if (other instanceof CountryWarPlayer) {
               return this.mergeFrom((CountryWarPlayer)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CountryWarPlayer other) {
            if (other == CrossCountryWarMsg.CountryWarPlayer.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               if (other.hasHeroArrayingData()) {
                  this.setHeroArrayingData(other.getHeroArrayingData());
               }

               if (other.hasIsOnline()) {
                  this.setIsOnline(other.getIsOnline());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasInfo()) {
               return false;
            } else if (!this.hasHeroArrayingData()) {
               return false;
            } else if (!this.hasIsOnline()) {
               return false;
            } else {
               return this.getInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CountryWarPlayer parsedMessage = null;

            try {
               parsedMessage = (CountryWarPlayer)CrossCountryWarMsg.CountryWarPlayer.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CountryWarPlayer)e.getUnfinishedMessage();
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

         public CommonMsg.PlayerInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.info_;
            } else {
               return (CommonMsg.PlayerInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(CommonMsg.PlayerInfo value) {
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

         public Builder setInfo(CommonMsg.PlayerInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(CommonMsg.PlayerInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != CommonMsg.PlayerInfo.getDefaultInstance()) {
                  this.info_ = CommonMsg.PlayerInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public CommonMsg.PlayerInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (CommonMsg.PlayerInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.PlayerInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (CommonMsg.PlayerInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public boolean hasHeroArrayingData() {
            return (this.bitField0_ & 2) != 0;
         }

         public ByteString getHeroArrayingData() {
            return this.heroArrayingData_;
         }

         public Builder setHeroArrayingData(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.heroArrayingData_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearHeroArrayingData() {
            this.bitField0_ &= -3;
            this.heroArrayingData_ = CrossCountryWarMsg.CountryWarPlayer.getDefaultInstance().getHeroArrayingData();
            this.onChanged();
            return this;
         }

         public boolean hasIsOnline() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getIsOnline() {
            return this.isOnline_;
         }

         public Builder setIsOnline(boolean value) {
            this.bitField0_ |= 4;
            this.isOnline_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsOnline() {
            this.bitField0_ &= -5;
            this.isOnline_ = false;
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

   public static final class S2CR_UpLoadPlayerInfo_11405 extends GeneratedMessageV3 implements S2CR_UpLoadPlayerInfo_11405OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int PLAYERS_FIELD_NUMBER = 1;
      private List<CountryWarPlayer> players_;
      private byte memoizedIsInitialized;
      private static final S2CR_UpLoadPlayerInfo_11405 DEFAULT_INSTANCE = new S2CR_UpLoadPlayerInfo_11405();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UpLoadPlayerInfo_11405> PARSER = new AbstractParser<S2CR_UpLoadPlayerInfo_11405>() {
         public S2CR_UpLoadPlayerInfo_11405 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UpLoadPlayerInfo_11405(input, extensionRegistry);
         }
      };

      private S2CR_UpLoadPlayerInfo_11405(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UpLoadPlayerInfo_11405() {
         this.memoizedIsInitialized = -1;
         this.players_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UpLoadPlayerInfo_11405();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UpLoadPlayerInfo_11405(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.players_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.players_.add(input.readMessage(CrossCountryWarMsg.CountryWarPlayer.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.players_ = Collections.unmodifiableList(this.players_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_UpLoadPlayerInfo_11405_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_UpLoadPlayerInfo_11405_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UpLoadPlayerInfo_11405.class, Builder.class);
      }

      public List<CountryWarPlayer> getPlayersList() {
         return this.players_;
      }

      public List<? extends CountryWarPlayerOrBuilder> getPlayersOrBuilderList() {
         return this.players_;
      }

      public int getPlayersCount() {
         return this.players_.size();
      }

      public CountryWarPlayer getPlayers(int index) {
         return (CountryWarPlayer)this.players_.get(index);
      }

      public CountryWarPlayerOrBuilder getPlayersOrBuilder(int index) {
         return (CountryWarPlayerOrBuilder)this.players_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
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
         for(int i = 0; i < this.players_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.players_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.players_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.players_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UpLoadPlayerInfo_11405)) {
            return super.equals(obj);
         } else {
            S2CR_UpLoadPlayerInfo_11405 other = (S2CR_UpLoadPlayerInfo_11405)obj;
            if (!this.getPlayersList().equals(other.getPlayersList())) {
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
            if (this.getPlayersCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayersList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UpLoadPlayerInfo_11405 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UpLoadPlayerInfo_11405)PARSER.parseFrom(data);
      }

      public static S2CR_UpLoadPlayerInfo_11405 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UpLoadPlayerInfo_11405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UpLoadPlayerInfo_11405 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UpLoadPlayerInfo_11405)PARSER.parseFrom(data);
      }

      public static S2CR_UpLoadPlayerInfo_11405 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UpLoadPlayerInfo_11405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UpLoadPlayerInfo_11405 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UpLoadPlayerInfo_11405)PARSER.parseFrom(data);
      }

      public static S2CR_UpLoadPlayerInfo_11405 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UpLoadPlayerInfo_11405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UpLoadPlayerInfo_11405 parseFrom(InputStream input) throws IOException {
         return (S2CR_UpLoadPlayerInfo_11405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UpLoadPlayerInfo_11405 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UpLoadPlayerInfo_11405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UpLoadPlayerInfo_11405 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UpLoadPlayerInfo_11405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UpLoadPlayerInfo_11405 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UpLoadPlayerInfo_11405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UpLoadPlayerInfo_11405 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UpLoadPlayerInfo_11405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UpLoadPlayerInfo_11405 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UpLoadPlayerInfo_11405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UpLoadPlayerInfo_11405 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UpLoadPlayerInfo_11405 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UpLoadPlayerInfo_11405> parser() {
         return PARSER;
      }

      public Parser<S2CR_UpLoadPlayerInfo_11405> getParserForType() {
         return PARSER;
      }

      public S2CR_UpLoadPlayerInfo_11405 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UpLoadPlayerInfo_11405OrBuilder {
         private int bitField0_;
         private List<CountryWarPlayer> players_;
         private RepeatedFieldBuilderV3<CountryWarPlayer, CountryWarPlayer.Builder, CountryWarPlayerOrBuilder> playersBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_UpLoadPlayerInfo_11405_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_UpLoadPlayerInfo_11405_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UpLoadPlayerInfo_11405.class, Builder.class);
         }

         private Builder() {
            this.players_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.players_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.S2CR_UpLoadPlayerInfo_11405.alwaysUseFieldBuilders) {
               this.getPlayersFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.playersBuilder_ == null) {
               this.players_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.playersBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_UpLoadPlayerInfo_11405_descriptor;
         }

         public S2CR_UpLoadPlayerInfo_11405 getDefaultInstanceForType() {
            return CrossCountryWarMsg.S2CR_UpLoadPlayerInfo_11405.getDefaultInstance();
         }

         public S2CR_UpLoadPlayerInfo_11405 build() {
            S2CR_UpLoadPlayerInfo_11405 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UpLoadPlayerInfo_11405 buildPartial() {
            S2CR_UpLoadPlayerInfo_11405 result = new S2CR_UpLoadPlayerInfo_11405(this);
            int from_bitField0_ = this.bitField0_;
            if (this.playersBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.players_ = Collections.unmodifiableList(this.players_);
                  this.bitField0_ &= -2;
               }

               result.players_ = this.players_;
            } else {
               result.players_ = this.playersBuilder_.build();
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
            if (other instanceof S2CR_UpLoadPlayerInfo_11405) {
               return this.mergeFrom((S2CR_UpLoadPlayerInfo_11405)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UpLoadPlayerInfo_11405 other) {
            if (other == CrossCountryWarMsg.S2CR_UpLoadPlayerInfo_11405.getDefaultInstance()) {
               return this;
            } else {
               if (this.playersBuilder_ == null) {
                  if (!other.players_.isEmpty()) {
                     if (this.players_.isEmpty()) {
                        this.players_ = other.players_;
                        this.bitField0_ &= -2;
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
                     this.bitField0_ &= -2;
                     this.playersBuilder_ = CrossCountryWarMsg.S2CR_UpLoadPlayerInfo_11405.alwaysUseFieldBuilders ? this.getPlayersFieldBuilder() : null;
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
            for(int i = 0; i < this.getPlayersCount(); ++i) {
               if (!this.getPlayers(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UpLoadPlayerInfo_11405 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UpLoadPlayerInfo_11405)CrossCountryWarMsg.S2CR_UpLoadPlayerInfo_11405.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UpLoadPlayerInfo_11405)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensurePlayersIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.players_ = new ArrayList(this.players_);
               this.bitField0_ |= 1;
            }

         }

         public List<CountryWarPlayer> getPlayersList() {
            return this.playersBuilder_ == null ? Collections.unmodifiableList(this.players_) : this.playersBuilder_.getMessageList();
         }

         public int getPlayersCount() {
            return this.playersBuilder_ == null ? this.players_.size() : this.playersBuilder_.getCount();
         }

         public CountryWarPlayer getPlayers(int index) {
            return this.playersBuilder_ == null ? (CountryWarPlayer)this.players_.get(index) : (CountryWarPlayer)this.playersBuilder_.getMessage(index);
         }

         public Builder setPlayers(int index, CountryWarPlayer value) {
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

         public Builder setPlayers(int index, CountryWarPlayer.Builder builderForValue) {
            if (this.playersBuilder_ == null) {
               this.ensurePlayersIsMutable();
               this.players_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playersBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPlayers(CountryWarPlayer value) {
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

         public Builder addPlayers(int index, CountryWarPlayer value) {
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

         public Builder addPlayers(CountryWarPlayer.Builder builderForValue) {
            if (this.playersBuilder_ == null) {
               this.ensurePlayersIsMutable();
               this.players_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.playersBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPlayers(int index, CountryWarPlayer.Builder builderForValue) {
            if (this.playersBuilder_ == null) {
               this.ensurePlayersIsMutable();
               this.players_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playersBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPlayers(Iterable<? extends CountryWarPlayer> values) {
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
               this.bitField0_ &= -2;
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

         public CountryWarPlayer.Builder getPlayersBuilder(int index) {
            return (CountryWarPlayer.Builder)this.getPlayersFieldBuilder().getBuilder(index);
         }

         public CountryWarPlayerOrBuilder getPlayersOrBuilder(int index) {
            return this.playersBuilder_ == null ? (CountryWarPlayerOrBuilder)this.players_.get(index) : (CountryWarPlayerOrBuilder)this.playersBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CountryWarPlayerOrBuilder> getPlayersOrBuilderList() {
            return this.playersBuilder_ != null ? this.playersBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.players_);
         }

         public CountryWarPlayer.Builder addPlayersBuilder() {
            return (CountryWarPlayer.Builder)this.getPlayersFieldBuilder().addBuilder(CrossCountryWarMsg.CountryWarPlayer.getDefaultInstance());
         }

         public CountryWarPlayer.Builder addPlayersBuilder(int index) {
            return (CountryWarPlayer.Builder)this.getPlayersFieldBuilder().addBuilder(index, CrossCountryWarMsg.CountryWarPlayer.getDefaultInstance());
         }

         public List<CountryWarPlayer.Builder> getPlayersBuilderList() {
            return this.getPlayersFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CountryWarPlayer, CountryWarPlayer.Builder, CountryWarPlayerOrBuilder> getPlayersFieldBuilder() {
            if (this.playersBuilder_ == null) {
               this.playersBuilder_ = new RepeatedFieldBuilderV3(this.players_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class CR2S_UpLoadPlayerInfo_11406 extends GeneratedMessageV3 implements CR2S_UpLoadPlayerInfo_11406OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYID_FIELD_NUMBER = 1;
      private int activityId_;
      public static final int MAPID_FIELD_NUMBER = 2;
      private int mapId_;
      public static final int STATE_FIELD_NUMBER = 3;
      private int state_;
      public static final int ISNEEDUPLOAD_FIELD_NUMBER = 4;
      private boolean isNeedUpload_;
      private byte memoizedIsInitialized;
      private static final CR2S_UpLoadPlayerInfo_11406 DEFAULT_INSTANCE = new CR2S_UpLoadPlayerInfo_11406();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UpLoadPlayerInfo_11406> PARSER = new AbstractParser<CR2S_UpLoadPlayerInfo_11406>() {
         public CR2S_UpLoadPlayerInfo_11406 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UpLoadPlayerInfo_11406(input, extensionRegistry);
         }
      };

      private CR2S_UpLoadPlayerInfo_11406(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UpLoadPlayerInfo_11406() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UpLoadPlayerInfo_11406();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UpLoadPlayerInfo_11406(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.activityId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.mapId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.state_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.isNeedUpload_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_UpLoadPlayerInfo_11406_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_UpLoadPlayerInfo_11406_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpLoadPlayerInfo_11406.class, Builder.class);
      }

      public boolean hasActivityId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityId() {
         return this.activityId_;
      }

      public boolean hasMapId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getMapId() {
         return this.mapId_;
      }

      public boolean hasState() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getState() {
         return this.state_;
      }

      public boolean hasIsNeedUpload() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getIsNeedUpload() {
         return this.isNeedUpload_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasActivityId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMapId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsNeedUpload()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.activityId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.mapId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.state_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBool(4, this.isNeedUpload_);
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
               size += CodedOutputStream.computeInt32Size(1, this.activityId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.mapId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.state_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.isNeedUpload_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_UpLoadPlayerInfo_11406)) {
            return super.equals(obj);
         } else {
            CR2S_UpLoadPlayerInfo_11406 other = (CR2S_UpLoadPlayerInfo_11406)obj;
            if (this.hasActivityId() != other.hasActivityId()) {
               return false;
            } else if (this.hasActivityId() && this.getActivityId() != other.getActivityId()) {
               return false;
            } else if (this.hasMapId() != other.hasMapId()) {
               return false;
            } else if (this.hasMapId() && this.getMapId() != other.getMapId()) {
               return false;
            } else if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
               return false;
            } else if (this.hasIsNeedUpload() != other.hasIsNeedUpload()) {
               return false;
            } else if (this.hasIsNeedUpload() && this.getIsNeedUpload() != other.getIsNeedUpload()) {
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
            if (this.hasActivityId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getActivityId();
            }

            if (this.hasMapId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMapId();
            }

            if (this.hasState()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getState();
            }

            if (this.hasIsNeedUpload()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getIsNeedUpload());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_UpLoadPlayerInfo_11406 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UpLoadPlayerInfo_11406)PARSER.parseFrom(data);
      }

      public static CR2S_UpLoadPlayerInfo_11406 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpLoadPlayerInfo_11406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpLoadPlayerInfo_11406 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UpLoadPlayerInfo_11406)PARSER.parseFrom(data);
      }

      public static CR2S_UpLoadPlayerInfo_11406 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpLoadPlayerInfo_11406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpLoadPlayerInfo_11406 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UpLoadPlayerInfo_11406)PARSER.parseFrom(data);
      }

      public static CR2S_UpLoadPlayerInfo_11406 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpLoadPlayerInfo_11406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpLoadPlayerInfo_11406 parseFrom(InputStream input) throws IOException {
         return (CR2S_UpLoadPlayerInfo_11406)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpLoadPlayerInfo_11406 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpLoadPlayerInfo_11406)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpLoadPlayerInfo_11406 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UpLoadPlayerInfo_11406)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UpLoadPlayerInfo_11406 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpLoadPlayerInfo_11406)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpLoadPlayerInfo_11406 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UpLoadPlayerInfo_11406)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpLoadPlayerInfo_11406 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpLoadPlayerInfo_11406)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UpLoadPlayerInfo_11406 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UpLoadPlayerInfo_11406 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UpLoadPlayerInfo_11406> parser() {
         return PARSER;
      }

      public Parser<CR2S_UpLoadPlayerInfo_11406> getParserForType() {
         return PARSER;
      }

      public CR2S_UpLoadPlayerInfo_11406 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UpLoadPlayerInfo_11406OrBuilder {
         private int bitField0_;
         private int activityId_;
         private int mapId_;
         private int state_;
         private boolean isNeedUpload_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_UpLoadPlayerInfo_11406_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_UpLoadPlayerInfo_11406_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpLoadPlayerInfo_11406.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.CR2S_UpLoadPlayerInfo_11406.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityId_ = 0;
            this.bitField0_ &= -2;
            this.mapId_ = 0;
            this.bitField0_ &= -3;
            this.state_ = 0;
            this.bitField0_ &= -5;
            this.isNeedUpload_ = false;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_UpLoadPlayerInfo_11406_descriptor;
         }

         public CR2S_UpLoadPlayerInfo_11406 getDefaultInstanceForType() {
            return CrossCountryWarMsg.CR2S_UpLoadPlayerInfo_11406.getDefaultInstance();
         }

         public CR2S_UpLoadPlayerInfo_11406 build() {
            CR2S_UpLoadPlayerInfo_11406 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UpLoadPlayerInfo_11406 buildPartial() {
            CR2S_UpLoadPlayerInfo_11406 result = new CR2S_UpLoadPlayerInfo_11406(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityId_ = this.activityId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.mapId_ = this.mapId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.state_ = this.state_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.isNeedUpload_ = this.isNeedUpload_;
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
            if (other instanceof CR2S_UpLoadPlayerInfo_11406) {
               return this.mergeFrom((CR2S_UpLoadPlayerInfo_11406)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UpLoadPlayerInfo_11406 other) {
            if (other == CrossCountryWarMsg.CR2S_UpLoadPlayerInfo_11406.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityId()) {
                  this.setActivityId(other.getActivityId());
               }

               if (other.hasMapId()) {
                  this.setMapId(other.getMapId());
               }

               if (other.hasState()) {
                  this.setState(other.getState());
               }

               if (other.hasIsNeedUpload()) {
                  this.setIsNeedUpload(other.getIsNeedUpload());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActivityId()) {
               return false;
            } else if (!this.hasMapId()) {
               return false;
            } else if (!this.hasState()) {
               return false;
            } else {
               return this.hasIsNeedUpload();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_UpLoadPlayerInfo_11406 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UpLoadPlayerInfo_11406)CrossCountryWarMsg.CR2S_UpLoadPlayerInfo_11406.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UpLoadPlayerInfo_11406)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasActivityId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getActivityId() {
            return this.activityId_;
         }

         public Builder setActivityId(int value) {
            this.bitField0_ |= 1;
            this.activityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityId() {
            this.bitField0_ &= -2;
            this.activityId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMapId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getMapId() {
            return this.mapId_;
         }

         public Builder setMapId(int value) {
            this.bitField0_ |= 2;
            this.mapId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMapId() {
            this.bitField0_ &= -3;
            this.mapId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasState() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getState() {
            return this.state_;
         }

         public Builder setState(int value) {
            this.bitField0_ |= 4;
            this.state_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearState() {
            this.bitField0_ &= -5;
            this.state_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsNeedUpload() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getIsNeedUpload() {
            return this.isNeedUpload_;
         }

         public Builder setIsNeedUpload(boolean value) {
            this.bitField0_ |= 8;
            this.isNeedUpload_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsNeedUpload() {
            this.bitField0_ &= -9;
            this.isNeedUpload_ = false;
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

   public static final class S2CR_CountryWarState_11407 extends GeneratedMessageV3 implements S2CR_CountryWarState_11407OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYSTATE_FIELD_NUMBER = 1;
      private int activityState_;
      public static final int ATTTOKEN_FIELD_NUMBER = 2;
      private int attToken_;
      public static final int ATTNEXTTOKENTIME_FIELD_NUMBER = 3;
      private int attNextTokenTime_;
      public static final int MOVETOKEN_FIELD_NUMBER = 4;
      private int moveToken_;
      public static final int MOVENEXTTOKENTIME_FIELD_NUMBER = 5;
      private int moveNextTokenTime_;
      public static final int ISCOMPLETEDTASK_FIELD_NUMBER = 6;
      private boolean isCompletedTask_;
      public static final int ISSOCREREWARD_FIELD_NUMBER = 7;
      private boolean isSocreReward_;
      public static final int OPENDAYS_FIELD_NUMBER = 8;
      private int openDays_;
      private byte memoizedIsInitialized;
      private static final S2CR_CountryWarState_11407 DEFAULT_INSTANCE = new S2CR_CountryWarState_11407();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_CountryWarState_11407> PARSER = new AbstractParser<S2CR_CountryWarState_11407>() {
         public S2CR_CountryWarState_11407 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_CountryWarState_11407(input, extensionRegistry);
         }
      };

      private S2CR_CountryWarState_11407(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_CountryWarState_11407() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_CountryWarState_11407();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_CountryWarState_11407(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.activityState_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.attToken_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.attNextTokenTime_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.moveToken_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.moveNextTokenTime_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.isCompletedTask_ = input.readBool();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.isSocreReward_ = input.readBool();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.openDays_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarState_11407_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarState_11407_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_CountryWarState_11407.class, Builder.class);
      }

      public boolean hasActivityState() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityState() {
         return this.activityState_;
      }

      public boolean hasAttToken() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getAttToken() {
         return this.attToken_;
      }

      public boolean hasAttNextTokenTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getAttNextTokenTime() {
         return this.attNextTokenTime_;
      }

      public boolean hasMoveToken() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getMoveToken() {
         return this.moveToken_;
      }

      public boolean hasMoveNextTokenTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getMoveNextTokenTime() {
         return this.moveNextTokenTime_;
      }

      public boolean hasIsCompletedTask() {
         return (this.bitField0_ & 32) != 0;
      }

      public boolean getIsCompletedTask() {
         return this.isCompletedTask_;
      }

      public boolean hasIsSocreReward() {
         return (this.bitField0_ & 64) != 0;
      }

      public boolean getIsSocreReward() {
         return this.isSocreReward_;
      }

      public boolean hasOpenDays() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getOpenDays() {
         return this.openDays_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasActivityState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAttToken()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAttNextTokenTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMoveToken()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMoveNextTokenTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsCompletedTask()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsSocreReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.activityState_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.attToken_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.attNextTokenTime_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.moveToken_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.moveNextTokenTime_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeBool(6, this.isCompletedTask_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeBool(7, this.isSocreReward_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.openDays_);
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
               size += CodedOutputStream.computeInt32Size(1, this.activityState_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.attToken_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.attNextTokenTime_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.moveToken_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.moveNextTokenTime_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeBoolSize(6, this.isCompletedTask_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeBoolSize(7, this.isSocreReward_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.openDays_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_CountryWarState_11407)) {
            return super.equals(obj);
         } else {
            S2CR_CountryWarState_11407 other = (S2CR_CountryWarState_11407)obj;
            if (this.hasActivityState() != other.hasActivityState()) {
               return false;
            } else if (this.hasActivityState() && this.getActivityState() != other.getActivityState()) {
               return false;
            } else if (this.hasAttToken() != other.hasAttToken()) {
               return false;
            } else if (this.hasAttToken() && this.getAttToken() != other.getAttToken()) {
               return false;
            } else if (this.hasAttNextTokenTime() != other.hasAttNextTokenTime()) {
               return false;
            } else if (this.hasAttNextTokenTime() && this.getAttNextTokenTime() != other.getAttNextTokenTime()) {
               return false;
            } else if (this.hasMoveToken() != other.hasMoveToken()) {
               return false;
            } else if (this.hasMoveToken() && this.getMoveToken() != other.getMoveToken()) {
               return false;
            } else if (this.hasMoveNextTokenTime() != other.hasMoveNextTokenTime()) {
               return false;
            } else if (this.hasMoveNextTokenTime() && this.getMoveNextTokenTime() != other.getMoveNextTokenTime()) {
               return false;
            } else if (this.hasIsCompletedTask() != other.hasIsCompletedTask()) {
               return false;
            } else if (this.hasIsCompletedTask() && this.getIsCompletedTask() != other.getIsCompletedTask()) {
               return false;
            } else if (this.hasIsSocreReward() != other.hasIsSocreReward()) {
               return false;
            } else if (this.hasIsSocreReward() && this.getIsSocreReward() != other.getIsSocreReward()) {
               return false;
            } else if (this.hasOpenDays() != other.hasOpenDays()) {
               return false;
            } else if (this.hasOpenDays() && this.getOpenDays() != other.getOpenDays()) {
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
            if (this.hasActivityState()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getActivityState();
            }

            if (this.hasAttToken()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAttToken();
            }

            if (this.hasAttNextTokenTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getAttNextTokenTime();
            }

            if (this.hasMoveToken()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getMoveToken();
            }

            if (this.hasMoveNextTokenTime()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getMoveNextTokenTime();
            }

            if (this.hasIsCompletedTask()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashBoolean(this.getIsCompletedTask());
            }

            if (this.hasIsSocreReward()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + Internal.hashBoolean(this.getIsSocreReward());
            }

            if (this.hasOpenDays()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getOpenDays();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_CountryWarState_11407 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_CountryWarState_11407)PARSER.parseFrom(data);
      }

      public static S2CR_CountryWarState_11407 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CountryWarState_11407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CountryWarState_11407 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_CountryWarState_11407)PARSER.parseFrom(data);
      }

      public static S2CR_CountryWarState_11407 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CountryWarState_11407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CountryWarState_11407 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_CountryWarState_11407)PARSER.parseFrom(data);
      }

      public static S2CR_CountryWarState_11407 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CountryWarState_11407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CountryWarState_11407 parseFrom(InputStream input) throws IOException {
         return (S2CR_CountryWarState_11407)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_CountryWarState_11407 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CountryWarState_11407)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_CountryWarState_11407 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_CountryWarState_11407)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_CountryWarState_11407 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CountryWarState_11407)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_CountryWarState_11407 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_CountryWarState_11407)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_CountryWarState_11407 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CountryWarState_11407)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_CountryWarState_11407 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_CountryWarState_11407 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_CountryWarState_11407> parser() {
         return PARSER;
      }

      public Parser<S2CR_CountryWarState_11407> getParserForType() {
         return PARSER;
      }

      public S2CR_CountryWarState_11407 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_CountryWarState_11407OrBuilder {
         private int bitField0_;
         private int activityState_;
         private int attToken_;
         private int attNextTokenTime_;
         private int moveToken_;
         private int moveNextTokenTime_;
         private boolean isCompletedTask_;
         private boolean isSocreReward_;
         private int openDays_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarState_11407_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarState_11407_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_CountryWarState_11407.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.S2CR_CountryWarState_11407.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityState_ = 0;
            this.bitField0_ &= -2;
            this.attToken_ = 0;
            this.bitField0_ &= -3;
            this.attNextTokenTime_ = 0;
            this.bitField0_ &= -5;
            this.moveToken_ = 0;
            this.bitField0_ &= -9;
            this.moveNextTokenTime_ = 0;
            this.bitField0_ &= -17;
            this.isCompletedTask_ = false;
            this.bitField0_ &= -33;
            this.isSocreReward_ = false;
            this.bitField0_ &= -65;
            this.openDays_ = 0;
            this.bitField0_ &= -129;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarState_11407_descriptor;
         }

         public S2CR_CountryWarState_11407 getDefaultInstanceForType() {
            return CrossCountryWarMsg.S2CR_CountryWarState_11407.getDefaultInstance();
         }

         public S2CR_CountryWarState_11407 build() {
            S2CR_CountryWarState_11407 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_CountryWarState_11407 buildPartial() {
            S2CR_CountryWarState_11407 result = new S2CR_CountryWarState_11407(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityState_ = this.activityState_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.attToken_ = this.attToken_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.attNextTokenTime_ = this.attNextTokenTime_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.moveToken_ = this.moveToken_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.moveNextTokenTime_ = this.moveNextTokenTime_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.isCompletedTask_ = this.isCompletedTask_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.isSocreReward_ = this.isSocreReward_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.openDays_ = this.openDays_;
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
            if (other instanceof S2CR_CountryWarState_11407) {
               return this.mergeFrom((S2CR_CountryWarState_11407)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_CountryWarState_11407 other) {
            if (other == CrossCountryWarMsg.S2CR_CountryWarState_11407.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityState()) {
                  this.setActivityState(other.getActivityState());
               }

               if (other.hasAttToken()) {
                  this.setAttToken(other.getAttToken());
               }

               if (other.hasAttNextTokenTime()) {
                  this.setAttNextTokenTime(other.getAttNextTokenTime());
               }

               if (other.hasMoveToken()) {
                  this.setMoveToken(other.getMoveToken());
               }

               if (other.hasMoveNextTokenTime()) {
                  this.setMoveNextTokenTime(other.getMoveNextTokenTime());
               }

               if (other.hasIsCompletedTask()) {
                  this.setIsCompletedTask(other.getIsCompletedTask());
               }

               if (other.hasIsSocreReward()) {
                  this.setIsSocreReward(other.getIsSocreReward());
               }

               if (other.hasOpenDays()) {
                  this.setOpenDays(other.getOpenDays());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActivityState()) {
               return false;
            } else if (!this.hasAttToken()) {
               return false;
            } else if (!this.hasAttNextTokenTime()) {
               return false;
            } else if (!this.hasMoveToken()) {
               return false;
            } else if (!this.hasMoveNextTokenTime()) {
               return false;
            } else if (!this.hasIsCompletedTask()) {
               return false;
            } else {
               return this.hasIsSocreReward();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_CountryWarState_11407 parsedMessage = null;

            try {
               parsedMessage = (S2CR_CountryWarState_11407)CrossCountryWarMsg.S2CR_CountryWarState_11407.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_CountryWarState_11407)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasActivityState() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getActivityState() {
            return this.activityState_;
         }

         public Builder setActivityState(int value) {
            this.bitField0_ |= 1;
            this.activityState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityState() {
            this.bitField0_ &= -2;
            this.activityState_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAttToken() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getAttToken() {
            return this.attToken_;
         }

         public Builder setAttToken(int value) {
            this.bitField0_ |= 2;
            this.attToken_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAttToken() {
            this.bitField0_ &= -3;
            this.attToken_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAttNextTokenTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getAttNextTokenTime() {
            return this.attNextTokenTime_;
         }

         public Builder setAttNextTokenTime(int value) {
            this.bitField0_ |= 4;
            this.attNextTokenTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAttNextTokenTime() {
            this.bitField0_ &= -5;
            this.attNextTokenTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMoveToken() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getMoveToken() {
            return this.moveToken_;
         }

         public Builder setMoveToken(int value) {
            this.bitField0_ |= 8;
            this.moveToken_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMoveToken() {
            this.bitField0_ &= -9;
            this.moveToken_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMoveNextTokenTime() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getMoveNextTokenTime() {
            return this.moveNextTokenTime_;
         }

         public Builder setMoveNextTokenTime(int value) {
            this.bitField0_ |= 16;
            this.moveNextTokenTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMoveNextTokenTime() {
            this.bitField0_ &= -17;
            this.moveNextTokenTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsCompletedTask() {
            return (this.bitField0_ & 32) != 0;
         }

         public boolean getIsCompletedTask() {
            return this.isCompletedTask_;
         }

         public Builder setIsCompletedTask(boolean value) {
            this.bitField0_ |= 32;
            this.isCompletedTask_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsCompletedTask() {
            this.bitField0_ &= -33;
            this.isCompletedTask_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasIsSocreReward() {
            return (this.bitField0_ & 64) != 0;
         }

         public boolean getIsSocreReward() {
            return this.isSocreReward_;
         }

         public Builder setIsSocreReward(boolean value) {
            this.bitField0_ |= 64;
            this.isSocreReward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsSocreReward() {
            this.bitField0_ &= -65;
            this.isSocreReward_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasOpenDays() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getOpenDays() {
            return this.openDays_;
         }

         public Builder setOpenDays(int value) {
            this.bitField0_ |= 128;
            this.openDays_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpenDays() {
            this.bitField0_ &= -129;
            this.openDays_ = 0;
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

   public static final class S2CR_CountryWarRank_11409 extends GeneratedMessageV3 implements S2CR_CountryWarRank_11409OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final S2CR_CountryWarRank_11409 DEFAULT_INSTANCE = new S2CR_CountryWarRank_11409();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_CountryWarRank_11409> PARSER = new AbstractParser<S2CR_CountryWarRank_11409>() {
         public S2CR_CountryWarRank_11409 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_CountryWarRank_11409(input, extensionRegistry);
         }
      };

      private S2CR_CountryWarRank_11409(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_CountryWarRank_11409() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_CountryWarRank_11409();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_CountryWarRank_11409(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarRank_11409_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarRank_11409_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_CountryWarRank_11409.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_CountryWarRank_11409)) {
            return super.equals(obj);
         } else {
            S2CR_CountryWarRank_11409 other = (S2CR_CountryWarRank_11409)obj;
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

      public static S2CR_CountryWarRank_11409 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_CountryWarRank_11409)PARSER.parseFrom(data);
      }

      public static S2CR_CountryWarRank_11409 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CountryWarRank_11409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CountryWarRank_11409 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_CountryWarRank_11409)PARSER.parseFrom(data);
      }

      public static S2CR_CountryWarRank_11409 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CountryWarRank_11409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CountryWarRank_11409 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_CountryWarRank_11409)PARSER.parseFrom(data);
      }

      public static S2CR_CountryWarRank_11409 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CountryWarRank_11409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CountryWarRank_11409 parseFrom(InputStream input) throws IOException {
         return (S2CR_CountryWarRank_11409)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_CountryWarRank_11409 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CountryWarRank_11409)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_CountryWarRank_11409 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_CountryWarRank_11409)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_CountryWarRank_11409 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CountryWarRank_11409)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_CountryWarRank_11409 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_CountryWarRank_11409)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_CountryWarRank_11409 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CountryWarRank_11409)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_CountryWarRank_11409 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_CountryWarRank_11409 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_CountryWarRank_11409> parser() {
         return PARSER;
      }

      public Parser<S2CR_CountryWarRank_11409> getParserForType() {
         return PARSER;
      }

      public S2CR_CountryWarRank_11409 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_CountryWarRank_11409OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarRank_11409_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarRank_11409_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_CountryWarRank_11409.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.S2CR_CountryWarRank_11409.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarRank_11409_descriptor;
         }

         public S2CR_CountryWarRank_11409 getDefaultInstanceForType() {
            return CrossCountryWarMsg.S2CR_CountryWarRank_11409.getDefaultInstance();
         }

         public S2CR_CountryWarRank_11409 build() {
            S2CR_CountryWarRank_11409 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_CountryWarRank_11409 buildPartial() {
            S2CR_CountryWarRank_11409 result = new S2CR_CountryWarRank_11409(this);
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
            if (other instanceof S2CR_CountryWarRank_11409) {
               return this.mergeFrom((S2CR_CountryWarRank_11409)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_CountryWarRank_11409 other) {
            if (other == CrossCountryWarMsg.S2CR_CountryWarRank_11409.getDefaultInstance()) {
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
            S2CR_CountryWarRank_11409 parsedMessage = null;

            try {
               parsedMessage = (S2CR_CountryWarRank_11409)CrossCountryWarMsg.S2CR_CountryWarRank_11409.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_CountryWarRank_11409)e.getUnfinishedMessage();
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

   public static final class S2CR_CountryLog_11411 extends GeneratedMessageV3 implements S2CR_CountryLog_11411OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final S2CR_CountryLog_11411 DEFAULT_INSTANCE = new S2CR_CountryLog_11411();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_CountryLog_11411> PARSER = new AbstractParser<S2CR_CountryLog_11411>() {
         public S2CR_CountryLog_11411 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_CountryLog_11411(input, extensionRegistry);
         }
      };

      private S2CR_CountryLog_11411(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_CountryLog_11411() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_CountryLog_11411();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_CountryLog_11411(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryLog_11411_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryLog_11411_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_CountryLog_11411.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_CountryLog_11411)) {
            return super.equals(obj);
         } else {
            S2CR_CountryLog_11411 other = (S2CR_CountryLog_11411)obj;
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

      public static S2CR_CountryLog_11411 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_CountryLog_11411)PARSER.parseFrom(data);
      }

      public static S2CR_CountryLog_11411 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CountryLog_11411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CountryLog_11411 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_CountryLog_11411)PARSER.parseFrom(data);
      }

      public static S2CR_CountryLog_11411 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CountryLog_11411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CountryLog_11411 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_CountryLog_11411)PARSER.parseFrom(data);
      }

      public static S2CR_CountryLog_11411 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CountryLog_11411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CountryLog_11411 parseFrom(InputStream input) throws IOException {
         return (S2CR_CountryLog_11411)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_CountryLog_11411 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CountryLog_11411)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_CountryLog_11411 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_CountryLog_11411)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_CountryLog_11411 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CountryLog_11411)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_CountryLog_11411 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_CountryLog_11411)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_CountryLog_11411 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CountryLog_11411)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_CountryLog_11411 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_CountryLog_11411 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_CountryLog_11411> parser() {
         return PARSER;
      }

      public Parser<S2CR_CountryLog_11411> getParserForType() {
         return PARSER;
      }

      public S2CR_CountryLog_11411 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_CountryLog_11411OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryLog_11411_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryLog_11411_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_CountryLog_11411.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.S2CR_CountryLog_11411.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryLog_11411_descriptor;
         }

         public S2CR_CountryLog_11411 getDefaultInstanceForType() {
            return CrossCountryWarMsg.S2CR_CountryLog_11411.getDefaultInstance();
         }

         public S2CR_CountryLog_11411 build() {
            S2CR_CountryLog_11411 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_CountryLog_11411 buildPartial() {
            S2CR_CountryLog_11411 result = new S2CR_CountryLog_11411(this);
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
            if (other instanceof S2CR_CountryLog_11411) {
               return this.mergeFrom((S2CR_CountryLog_11411)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_CountryLog_11411 other) {
            if (other == CrossCountryWarMsg.S2CR_CountryLog_11411.getDefaultInstance()) {
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
            S2CR_CountryLog_11411 parsedMessage = null;

            try {
               parsedMessage = (S2CR_CountryLog_11411)CrossCountryWarMsg.S2CR_CountryLog_11411.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_CountryLog_11411)e.getUnfinishedMessage();
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

   public static final class CR2S_UpdateCityReward_11416 extends GeneratedMessageV3 implements CR2S_UpdateCityReward_11416OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<CountryWarMsg.CityRewardInfo> infos_;
      private byte memoizedIsInitialized;
      private static final CR2S_UpdateCityReward_11416 DEFAULT_INSTANCE = new CR2S_UpdateCityReward_11416();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UpdateCityReward_11416> PARSER = new AbstractParser<CR2S_UpdateCityReward_11416>() {
         public CR2S_UpdateCityReward_11416 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UpdateCityReward_11416(input, extensionRegistry);
         }
      };

      private CR2S_UpdateCityReward_11416(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UpdateCityReward_11416() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UpdateCityReward_11416();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UpdateCityReward_11416(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.infos_.add(input.readMessage(CountryWarMsg.CityRewardInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_UpdateCityReward_11416_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_UpdateCityReward_11416_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpdateCityReward_11416.class, Builder.class);
      }

      public List<CountryWarMsg.CityRewardInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends CountryWarMsg.CityRewardInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public CountryWarMsg.CityRewardInfo getInfos(int index) {
         return (CountryWarMsg.CityRewardInfo)this.infos_.get(index);
      }

      public CountryWarMsg.CityRewardInfoOrBuilder getInfosOrBuilder(int index) {
         return (CountryWarMsg.CityRewardInfoOrBuilder)this.infos_.get(index);
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
         } else if (!(obj instanceof CR2S_UpdateCityReward_11416)) {
            return super.equals(obj);
         } else {
            CR2S_UpdateCityReward_11416 other = (CR2S_UpdateCityReward_11416)obj;
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

      public static CR2S_UpdateCityReward_11416 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateCityReward_11416)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateCityReward_11416 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateCityReward_11416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateCityReward_11416 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateCityReward_11416)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateCityReward_11416 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateCityReward_11416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateCityReward_11416 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateCityReward_11416)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateCityReward_11416 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateCityReward_11416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateCityReward_11416 parseFrom(InputStream input) throws IOException {
         return (CR2S_UpdateCityReward_11416)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpdateCityReward_11416 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateCityReward_11416)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpdateCityReward_11416 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UpdateCityReward_11416)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UpdateCityReward_11416 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateCityReward_11416)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpdateCityReward_11416 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UpdateCityReward_11416)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpdateCityReward_11416 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateCityReward_11416)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UpdateCityReward_11416 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UpdateCityReward_11416 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UpdateCityReward_11416> parser() {
         return PARSER;
      }

      public Parser<CR2S_UpdateCityReward_11416> getParserForType() {
         return PARSER;
      }

      public CR2S_UpdateCityReward_11416 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UpdateCityReward_11416OrBuilder {
         private int bitField0_;
         private List<CountryWarMsg.CityRewardInfo> infos_;
         private RepeatedFieldBuilderV3<CountryWarMsg.CityRewardInfo, CountryWarMsg.CityRewardInfo.Builder, CountryWarMsg.CityRewardInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_UpdateCityReward_11416_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_UpdateCityReward_11416_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpdateCityReward_11416.class, Builder.class);
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
            if (CrossCountryWarMsg.CR2S_UpdateCityReward_11416.alwaysUseFieldBuilders) {
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
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_UpdateCityReward_11416_descriptor;
         }

         public CR2S_UpdateCityReward_11416 getDefaultInstanceForType() {
            return CrossCountryWarMsg.CR2S_UpdateCityReward_11416.getDefaultInstance();
         }

         public CR2S_UpdateCityReward_11416 build() {
            CR2S_UpdateCityReward_11416 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UpdateCityReward_11416 buildPartial() {
            CR2S_UpdateCityReward_11416 result = new CR2S_UpdateCityReward_11416(this);
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
            if (other instanceof CR2S_UpdateCityReward_11416) {
               return this.mergeFrom((CR2S_UpdateCityReward_11416)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UpdateCityReward_11416 other) {
            if (other == CrossCountryWarMsg.CR2S_UpdateCityReward_11416.getDefaultInstance()) {
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
                     this.infosBuilder_ = CrossCountryWarMsg.CR2S_UpdateCityReward_11416.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
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
            CR2S_UpdateCityReward_11416 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UpdateCityReward_11416)CrossCountryWarMsg.CR2S_UpdateCityReward_11416.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UpdateCityReward_11416)e.getUnfinishedMessage();
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

         public List<CountryWarMsg.CityRewardInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public CountryWarMsg.CityRewardInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (CountryWarMsg.CityRewardInfo)this.infos_.get(index) : (CountryWarMsg.CityRewardInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, CountryWarMsg.CityRewardInfo value) {
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

         public Builder setInfos(int index, CountryWarMsg.CityRewardInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(CountryWarMsg.CityRewardInfo value) {
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

         public Builder addInfos(int index, CountryWarMsg.CityRewardInfo value) {
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

         public Builder addInfos(CountryWarMsg.CityRewardInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, CountryWarMsg.CityRewardInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends CountryWarMsg.CityRewardInfo> values) {
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

         public CountryWarMsg.CityRewardInfo.Builder getInfosBuilder(int index) {
            return (CountryWarMsg.CityRewardInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public CountryWarMsg.CityRewardInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (CountryWarMsg.CityRewardInfoOrBuilder)this.infos_.get(index) : (CountryWarMsg.CityRewardInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CountryWarMsg.CityRewardInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public CountryWarMsg.CityRewardInfo.Builder addInfosBuilder() {
            return (CountryWarMsg.CityRewardInfo.Builder)this.getInfosFieldBuilder().addBuilder(CountryWarMsg.CityRewardInfo.getDefaultInstance());
         }

         public CountryWarMsg.CityRewardInfo.Builder addInfosBuilder(int index) {
            return (CountryWarMsg.CityRewardInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, CountryWarMsg.CityRewardInfo.getDefaultInstance());
         }

         public List<CountryWarMsg.CityRewardInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CountryWarMsg.CityRewardInfo, CountryWarMsg.CityRewardInfo.Builder, CountryWarMsg.CityRewardInfoOrBuilder> getInfosFieldBuilder() {
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

   public static final class S2CR_PlayerInfo_11417 extends GeneratedMessageV3 implements S2CR_PlayerInfo_11417OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SLAVESERVIERID_FIELD_NUMBER = 1;
      private int slaveServierId_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      private byte memoizedIsInitialized;
      private static final S2CR_PlayerInfo_11417 DEFAULT_INSTANCE = new S2CR_PlayerInfo_11417();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_PlayerInfo_11417> PARSER = new AbstractParser<S2CR_PlayerInfo_11417>() {
         public S2CR_PlayerInfo_11417 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_PlayerInfo_11417(input, extensionRegistry);
         }
      };

      private S2CR_PlayerInfo_11417(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_PlayerInfo_11417() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_PlayerInfo_11417();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_PlayerInfo_11417(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.slaveServierId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerInfo_11417_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerInfo_11417_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerInfo_11417.class, Builder.class);
      }

      public boolean hasSlaveServierId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSlaveServierId() {
         return this.slaveServierId_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasSlaveServierId()) {
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
            output.writeInt32(1, this.slaveServierId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.slaveServierId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_PlayerInfo_11417)) {
            return super.equals(obj);
         } else {
            S2CR_PlayerInfo_11417 other = (S2CR_PlayerInfo_11417)obj;
            if (this.hasSlaveServierId() != other.hasSlaveServierId()) {
               return false;
            } else if (this.hasSlaveServierId() && this.getSlaveServierId() != other.getSlaveServierId()) {
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
            if (this.hasSlaveServierId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSlaveServierId();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_PlayerInfo_11417 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerInfo_11417)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerInfo_11417 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerInfo_11417)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerInfo_11417 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerInfo_11417)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerInfo_11417 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerInfo_11417)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerInfo_11417 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerInfo_11417)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerInfo_11417 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerInfo_11417)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerInfo_11417 parseFrom(InputStream input) throws IOException {
         return (S2CR_PlayerInfo_11417)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerInfo_11417 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerInfo_11417)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerInfo_11417 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_PlayerInfo_11417)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_PlayerInfo_11417 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerInfo_11417)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerInfo_11417 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_PlayerInfo_11417)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerInfo_11417 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerInfo_11417)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_PlayerInfo_11417 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_PlayerInfo_11417 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_PlayerInfo_11417> parser() {
         return PARSER;
      }

      public Parser<S2CR_PlayerInfo_11417> getParserForType() {
         return PARSER;
      }

      public S2CR_PlayerInfo_11417 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_PlayerInfo_11417OrBuilder {
         private int bitField0_;
         private int slaveServierId_;
         private int playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerInfo_11417_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerInfo_11417_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerInfo_11417.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.S2CR_PlayerInfo_11417.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.slaveServierId_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerInfo_11417_descriptor;
         }

         public S2CR_PlayerInfo_11417 getDefaultInstanceForType() {
            return CrossCountryWarMsg.S2CR_PlayerInfo_11417.getDefaultInstance();
         }

         public S2CR_PlayerInfo_11417 build() {
            S2CR_PlayerInfo_11417 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_PlayerInfo_11417 buildPartial() {
            S2CR_PlayerInfo_11417 result = new S2CR_PlayerInfo_11417(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.slaveServierId_ = this.slaveServierId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.playerId_ = this.playerId_;
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
            if (other instanceof S2CR_PlayerInfo_11417) {
               return this.mergeFrom((S2CR_PlayerInfo_11417)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_PlayerInfo_11417 other) {
            if (other == CrossCountryWarMsg.S2CR_PlayerInfo_11417.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSlaveServierId()) {
                  this.setSlaveServierId(other.getSlaveServierId());
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
            if (!this.hasSlaveServierId()) {
               return false;
            } else {
               return this.hasPlayerId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_PlayerInfo_11417 parsedMessage = null;

            try {
               parsedMessage = (S2CR_PlayerInfo_11417)CrossCountryWarMsg.S2CR_PlayerInfo_11417.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_PlayerInfo_11417)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSlaveServierId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSlaveServierId() {
            return this.slaveServierId_;
         }

         public Builder setSlaveServierId(int value) {
            this.bitField0_ |= 1;
            this.slaveServierId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSlaveServierId() {
            this.bitField0_ &= -2;
            this.slaveServierId_ = 0;
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_NoticeGrantTaskReward_11420 extends GeneratedMessageV3 implements CR2S_NoticeGrantTaskReward_11420OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final CR2S_NoticeGrantTaskReward_11420 DEFAULT_INSTANCE = new CR2S_NoticeGrantTaskReward_11420();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_NoticeGrantTaskReward_11420> PARSER = new AbstractParser<CR2S_NoticeGrantTaskReward_11420>() {
         public CR2S_NoticeGrantTaskReward_11420 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_NoticeGrantTaskReward_11420(input, extensionRegistry);
         }
      };

      private CR2S_NoticeGrantTaskReward_11420(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_NoticeGrantTaskReward_11420() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_NoticeGrantTaskReward_11420();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_NoticeGrantTaskReward_11420(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_NoticeGrantTaskReward_11420_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_NoticeGrantTaskReward_11420_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_NoticeGrantTaskReward_11420.class, Builder.class);
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
         } else if (!(obj instanceof CR2S_NoticeGrantTaskReward_11420)) {
            return super.equals(obj);
         } else {
            CR2S_NoticeGrantTaskReward_11420 other = (CR2S_NoticeGrantTaskReward_11420)obj;
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

      public static CR2S_NoticeGrantTaskReward_11420 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_NoticeGrantTaskReward_11420)PARSER.parseFrom(data);
      }

      public static CR2S_NoticeGrantTaskReward_11420 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_NoticeGrantTaskReward_11420)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_NoticeGrantTaskReward_11420 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_NoticeGrantTaskReward_11420)PARSER.parseFrom(data);
      }

      public static CR2S_NoticeGrantTaskReward_11420 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_NoticeGrantTaskReward_11420)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_NoticeGrantTaskReward_11420 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_NoticeGrantTaskReward_11420)PARSER.parseFrom(data);
      }

      public static CR2S_NoticeGrantTaskReward_11420 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_NoticeGrantTaskReward_11420)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_NoticeGrantTaskReward_11420 parseFrom(InputStream input) throws IOException {
         return (CR2S_NoticeGrantTaskReward_11420)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_NoticeGrantTaskReward_11420 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_NoticeGrantTaskReward_11420)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_NoticeGrantTaskReward_11420 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_NoticeGrantTaskReward_11420)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_NoticeGrantTaskReward_11420 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_NoticeGrantTaskReward_11420)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_NoticeGrantTaskReward_11420 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_NoticeGrantTaskReward_11420)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_NoticeGrantTaskReward_11420 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_NoticeGrantTaskReward_11420)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_NoticeGrantTaskReward_11420 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_NoticeGrantTaskReward_11420 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_NoticeGrantTaskReward_11420> parser() {
         return PARSER;
      }

      public Parser<CR2S_NoticeGrantTaskReward_11420> getParserForType() {
         return PARSER;
      }

      public CR2S_NoticeGrantTaskReward_11420 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_NoticeGrantTaskReward_11420OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_NoticeGrantTaskReward_11420_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_NoticeGrantTaskReward_11420_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_NoticeGrantTaskReward_11420.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.CR2S_NoticeGrantTaskReward_11420.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_NoticeGrantTaskReward_11420_descriptor;
         }

         public CR2S_NoticeGrantTaskReward_11420 getDefaultInstanceForType() {
            return CrossCountryWarMsg.CR2S_NoticeGrantTaskReward_11420.getDefaultInstance();
         }

         public CR2S_NoticeGrantTaskReward_11420 build() {
            CR2S_NoticeGrantTaskReward_11420 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_NoticeGrantTaskReward_11420 buildPartial() {
            CR2S_NoticeGrantTaskReward_11420 result = new CR2S_NoticeGrantTaskReward_11420(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_NoticeGrantTaskReward_11420) {
               return this.mergeFrom((CR2S_NoticeGrantTaskReward_11420)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_NoticeGrantTaskReward_11420 other) {
            if (other == CrossCountryWarMsg.CR2S_NoticeGrantTaskReward_11420.getDefaultInstance()) {
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
            CR2S_NoticeGrantTaskReward_11420 parsedMessage = null;

            try {
               parsedMessage = (CR2S_NoticeGrantTaskReward_11420)CrossCountryWarMsg.CR2S_NoticeGrantTaskReward_11420.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_NoticeGrantTaskReward_11420)e.getUnfinishedMessage();
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

   public static final class S2CR_MoveToCity_11431 extends GeneratedMessageV3 implements S2CR_MoveToCity_11431OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CITYID_FIELD_NUMBER = 1;
      private int cityId_;
      public static final int MOVETOKEN_FIELD_NUMBER = 2;
      private int moveToken_;
      private byte memoizedIsInitialized;
      private static final S2CR_MoveToCity_11431 DEFAULT_INSTANCE = new S2CR_MoveToCity_11431();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_MoveToCity_11431> PARSER = new AbstractParser<S2CR_MoveToCity_11431>() {
         public S2CR_MoveToCity_11431 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_MoveToCity_11431(input, extensionRegistry);
         }
      };

      private S2CR_MoveToCity_11431(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_MoveToCity_11431() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_MoveToCity_11431();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_MoveToCity_11431(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.moveToken_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_MoveToCity_11431_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_MoveToCity_11431_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MoveToCity_11431.class, Builder.class);
      }

      public boolean hasCityId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCityId() {
         return this.cityId_;
      }

      public boolean hasMoveToken() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getMoveToken() {
         return this.moveToken_;
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
         } else if (!this.hasMoveToken()) {
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
            output.writeInt32(2, this.moveToken_);
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
               size += CodedOutputStream.computeInt32Size(2, this.moveToken_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_MoveToCity_11431)) {
            return super.equals(obj);
         } else {
            S2CR_MoveToCity_11431 other = (S2CR_MoveToCity_11431)obj;
            if (this.hasCityId() != other.hasCityId()) {
               return false;
            } else if (this.hasCityId() && this.getCityId() != other.getCityId()) {
               return false;
            } else if (this.hasMoveToken() != other.hasMoveToken()) {
               return false;
            } else if (this.hasMoveToken() && this.getMoveToken() != other.getMoveToken()) {
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

            if (this.hasMoveToken()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMoveToken();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_MoveToCity_11431 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_MoveToCity_11431)PARSER.parseFrom(data);
      }

      public static S2CR_MoveToCity_11431 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MoveToCity_11431)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MoveToCity_11431 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_MoveToCity_11431)PARSER.parseFrom(data);
      }

      public static S2CR_MoveToCity_11431 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MoveToCity_11431)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MoveToCity_11431 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_MoveToCity_11431)PARSER.parseFrom(data);
      }

      public static S2CR_MoveToCity_11431 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MoveToCity_11431)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MoveToCity_11431 parseFrom(InputStream input) throws IOException {
         return (S2CR_MoveToCity_11431)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MoveToCity_11431 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MoveToCity_11431)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MoveToCity_11431 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_MoveToCity_11431)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_MoveToCity_11431 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MoveToCity_11431)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MoveToCity_11431 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_MoveToCity_11431)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MoveToCity_11431 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MoveToCity_11431)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_MoveToCity_11431 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_MoveToCity_11431 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_MoveToCity_11431> parser() {
         return PARSER;
      }

      public Parser<S2CR_MoveToCity_11431> getParserForType() {
         return PARSER;
      }

      public S2CR_MoveToCity_11431 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_MoveToCity_11431OrBuilder {
         private int bitField0_;
         private int cityId_;
         private int moveToken_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_MoveToCity_11431_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_MoveToCity_11431_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MoveToCity_11431.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.S2CR_MoveToCity_11431.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.cityId_ = 0;
            this.bitField0_ &= -2;
            this.moveToken_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_MoveToCity_11431_descriptor;
         }

         public S2CR_MoveToCity_11431 getDefaultInstanceForType() {
            return CrossCountryWarMsg.S2CR_MoveToCity_11431.getDefaultInstance();
         }

         public S2CR_MoveToCity_11431 build() {
            S2CR_MoveToCity_11431 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_MoveToCity_11431 buildPartial() {
            S2CR_MoveToCity_11431 result = new S2CR_MoveToCity_11431(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.cityId_ = this.cityId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.moveToken_ = this.moveToken_;
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
            if (other instanceof S2CR_MoveToCity_11431) {
               return this.mergeFrom((S2CR_MoveToCity_11431)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_MoveToCity_11431 other) {
            if (other == CrossCountryWarMsg.S2CR_MoveToCity_11431.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCityId()) {
                  this.setCityId(other.getCityId());
               }

               if (other.hasMoveToken()) {
                  this.setMoveToken(other.getMoveToken());
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
               return this.hasMoveToken();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_MoveToCity_11431 parsedMessage = null;

            try {
               parsedMessage = (S2CR_MoveToCity_11431)CrossCountryWarMsg.S2CR_MoveToCity_11431.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_MoveToCity_11431)e.getUnfinishedMessage();
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

         public boolean hasMoveToken() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getMoveToken() {
            return this.moveToken_;
         }

         public Builder setMoveToken(int value) {
            this.bitField0_ |= 2;
            this.moveToken_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMoveToken() {
            this.bitField0_ &= -3;
            this.moveToken_ = 0;
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

   public static final class CR2S_MoveToCity_11432 extends GeneratedMessageV3 implements CR2S_MoveToCity_11432OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int ISNEEDMOVETOKEN_FIELD_NUMBER = 2;
      private boolean isNeedMoveToken_;
      private byte memoizedIsInitialized;
      private static final CR2S_MoveToCity_11432 DEFAULT_INSTANCE = new CR2S_MoveToCity_11432();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_MoveToCity_11432> PARSER = new AbstractParser<CR2S_MoveToCity_11432>() {
         public CR2S_MoveToCity_11432 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_MoveToCity_11432(input, extensionRegistry);
         }
      };

      private CR2S_MoveToCity_11432(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_MoveToCity_11432() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_MoveToCity_11432();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_MoveToCity_11432(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.isNeedMoveToken_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_MoveToCity_11432_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_MoveToCity_11432_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_MoveToCity_11432.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasIsNeedMoveToken() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsNeedMoveToken() {
         return this.isNeedMoveToken_;
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
         } else if (!this.hasIsNeedMoveToken()) {
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
            output.writeBool(2, this.isNeedMoveToken_);
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
               size += CodedOutputStream.computeBoolSize(2, this.isNeedMoveToken_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_MoveToCity_11432)) {
            return super.equals(obj);
         } else {
            CR2S_MoveToCity_11432 other = (CR2S_MoveToCity_11432)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasIsNeedMoveToken() != other.hasIsNeedMoveToken()) {
               return false;
            } else if (this.hasIsNeedMoveToken() && this.getIsNeedMoveToken() != other.getIsNeedMoveToken()) {
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

            if (this.hasIsNeedMoveToken()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsNeedMoveToken());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_MoveToCity_11432 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_MoveToCity_11432)PARSER.parseFrom(data);
      }

      public static CR2S_MoveToCity_11432 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_MoveToCity_11432)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_MoveToCity_11432 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_MoveToCity_11432)PARSER.parseFrom(data);
      }

      public static CR2S_MoveToCity_11432 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_MoveToCity_11432)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_MoveToCity_11432 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_MoveToCity_11432)PARSER.parseFrom(data);
      }

      public static CR2S_MoveToCity_11432 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_MoveToCity_11432)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_MoveToCity_11432 parseFrom(InputStream input) throws IOException {
         return (CR2S_MoveToCity_11432)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_MoveToCity_11432 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_MoveToCity_11432)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_MoveToCity_11432 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_MoveToCity_11432)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_MoveToCity_11432 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_MoveToCity_11432)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_MoveToCity_11432 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_MoveToCity_11432)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_MoveToCity_11432 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_MoveToCity_11432)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_MoveToCity_11432 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_MoveToCity_11432 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_MoveToCity_11432> parser() {
         return PARSER;
      }

      public Parser<CR2S_MoveToCity_11432> getParserForType() {
         return PARSER;
      }

      public CR2S_MoveToCity_11432 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_MoveToCity_11432OrBuilder {
         private int bitField0_;
         private int result_;
         private boolean isNeedMoveToken_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_MoveToCity_11432_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_MoveToCity_11432_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_MoveToCity_11432.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.CR2S_MoveToCity_11432.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.isNeedMoveToken_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_MoveToCity_11432_descriptor;
         }

         public CR2S_MoveToCity_11432 getDefaultInstanceForType() {
            return CrossCountryWarMsg.CR2S_MoveToCity_11432.getDefaultInstance();
         }

         public CR2S_MoveToCity_11432 build() {
            CR2S_MoveToCity_11432 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_MoveToCity_11432 buildPartial() {
            CR2S_MoveToCity_11432 result = new CR2S_MoveToCity_11432(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isNeedMoveToken_ = this.isNeedMoveToken_;
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
            if (other instanceof CR2S_MoveToCity_11432) {
               return this.mergeFrom((CR2S_MoveToCity_11432)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_MoveToCity_11432 other) {
            if (other == CrossCountryWarMsg.CR2S_MoveToCity_11432.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasIsNeedMoveToken()) {
                  this.setIsNeedMoveToken(other.getIsNeedMoveToken());
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
               return this.hasIsNeedMoveToken();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_MoveToCity_11432 parsedMessage = null;

            try {
               parsedMessage = (CR2S_MoveToCity_11432)CrossCountryWarMsg.CR2S_MoveToCity_11432.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_MoveToCity_11432)e.getUnfinishedMessage();
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

         public boolean hasIsNeedMoveToken() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsNeedMoveToken() {
            return this.isNeedMoveToken_;
         }

         public Builder setIsNeedMoveToken(boolean value) {
            this.bitField0_ |= 2;
            this.isNeedMoveToken_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsNeedMoveToken() {
            this.bitField0_ &= -3;
            this.isNeedMoveToken_ = false;
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

   public static final class S2CR_FihtToCity_11433 extends GeneratedMessageV3 implements S2CR_FihtToCity_11433OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CITYID_FIELD_NUMBER = 1;
      private int cityId_;
      public static final int HEROARRAYINGDATA_FIELD_NUMBER = 2;
      private ByteString heroArrayingData_;
      public static final int ISSKIP_FIELD_NUMBER = 3;
      private boolean isSkip_;
      private byte memoizedIsInitialized;
      private static final S2CR_FihtToCity_11433 DEFAULT_INSTANCE = new S2CR_FihtToCity_11433();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_FihtToCity_11433> PARSER = new AbstractParser<S2CR_FihtToCity_11433>() {
         public S2CR_FihtToCity_11433 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_FihtToCity_11433(input, extensionRegistry);
         }
      };

      private S2CR_FihtToCity_11433(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_FihtToCity_11433() {
         this.memoizedIsInitialized = -1;
         this.heroArrayingData_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_FihtToCity_11433();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_FihtToCity_11433(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bitField0_ |= 2;
                        this.heroArrayingData_ = input.readBytes();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
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
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_FihtToCity_11433_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_FihtToCity_11433_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_FihtToCity_11433.class, Builder.class);
      }

      public boolean hasCityId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCityId() {
         return this.cityId_;
      }

      public boolean hasHeroArrayingData() {
         return (this.bitField0_ & 2) != 0;
      }

      public ByteString getHeroArrayingData() {
         return this.heroArrayingData_;
      }

      public boolean hasIsSkip() {
         return (this.bitField0_ & 4) != 0;
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
         } else if (!this.hasCityId()) {
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
            output.writeInt32(1, this.cityId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBytes(2, this.heroArrayingData_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.isSkip_);
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
               size += CodedOutputStream.computeBytesSize(2, this.heroArrayingData_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.isSkip_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_FihtToCity_11433)) {
            return super.equals(obj);
         } else {
            S2CR_FihtToCity_11433 other = (S2CR_FihtToCity_11433)obj;
            if (this.hasCityId() != other.hasCityId()) {
               return false;
            } else if (this.hasCityId() && this.getCityId() != other.getCityId()) {
               return false;
            } else if (this.hasHeroArrayingData() != other.hasHeroArrayingData()) {
               return false;
            } else if (this.hasHeroArrayingData() && !this.getHeroArrayingData().equals(other.getHeroArrayingData())) {
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
            if (this.hasCityId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCityId();
            }

            if (this.hasHeroArrayingData()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroArrayingData().hashCode();
            }

            if (this.hasIsSkip()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getIsSkip());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_FihtToCity_11433 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_FihtToCity_11433)PARSER.parseFrom(data);
      }

      public static S2CR_FihtToCity_11433 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_FihtToCity_11433)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_FihtToCity_11433 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_FihtToCity_11433)PARSER.parseFrom(data);
      }

      public static S2CR_FihtToCity_11433 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_FihtToCity_11433)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_FihtToCity_11433 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_FihtToCity_11433)PARSER.parseFrom(data);
      }

      public static S2CR_FihtToCity_11433 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_FihtToCity_11433)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_FihtToCity_11433 parseFrom(InputStream input) throws IOException {
         return (S2CR_FihtToCity_11433)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_FihtToCity_11433 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_FihtToCity_11433)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_FihtToCity_11433 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_FihtToCity_11433)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_FihtToCity_11433 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_FihtToCity_11433)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_FihtToCity_11433 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_FihtToCity_11433)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_FihtToCity_11433 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_FihtToCity_11433)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_FihtToCity_11433 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_FihtToCity_11433 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_FihtToCity_11433> parser() {
         return PARSER;
      }

      public Parser<S2CR_FihtToCity_11433> getParserForType() {
         return PARSER;
      }

      public S2CR_FihtToCity_11433 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_FihtToCity_11433OrBuilder {
         private int bitField0_;
         private int cityId_;
         private ByteString heroArrayingData_;
         private boolean isSkip_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_FihtToCity_11433_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_FihtToCity_11433_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_FihtToCity_11433.class, Builder.class);
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
            if (CrossCountryWarMsg.S2CR_FihtToCity_11433.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.cityId_ = 0;
            this.bitField0_ &= -2;
            this.heroArrayingData_ = ByteString.EMPTY;
            this.bitField0_ &= -3;
            this.isSkip_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_FihtToCity_11433_descriptor;
         }

         public S2CR_FihtToCity_11433 getDefaultInstanceForType() {
            return CrossCountryWarMsg.S2CR_FihtToCity_11433.getDefaultInstance();
         }

         public S2CR_FihtToCity_11433 build() {
            S2CR_FihtToCity_11433 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_FihtToCity_11433 buildPartial() {
            S2CR_FihtToCity_11433 result = new S2CR_FihtToCity_11433(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.cityId_ = this.cityId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.heroArrayingData_ = this.heroArrayingData_;
            if ((from_bitField0_ & 4) != 0) {
               result.isSkip_ = this.isSkip_;
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
            if (other instanceof S2CR_FihtToCity_11433) {
               return this.mergeFrom((S2CR_FihtToCity_11433)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_FihtToCity_11433 other) {
            if (other == CrossCountryWarMsg.S2CR_FihtToCity_11433.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCityId()) {
                  this.setCityId(other.getCityId());
               }

               if (other.hasHeroArrayingData()) {
                  this.setHeroArrayingData(other.getHeroArrayingData());
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
            if (!this.hasCityId()) {
               return false;
            } else {
               return this.hasHeroArrayingData();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_FihtToCity_11433 parsedMessage = null;

            try {
               parsedMessage = (S2CR_FihtToCity_11433)CrossCountryWarMsg.S2CR_FihtToCity_11433.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_FihtToCity_11433)e.getUnfinishedMessage();
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

         public boolean hasHeroArrayingData() {
            return (this.bitField0_ & 2) != 0;
         }

         public ByteString getHeroArrayingData() {
            return this.heroArrayingData_;
         }

         public Builder setHeroArrayingData(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.heroArrayingData_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearHeroArrayingData() {
            this.bitField0_ &= -3;
            this.heroArrayingData_ = CrossCountryWarMsg.S2CR_FihtToCity_11433.getDefaultInstance().getHeroArrayingData();
            this.onChanged();
            return this;
         }

         public boolean hasIsSkip() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getIsSkip() {
            return this.isSkip_;
         }

         public Builder setIsSkip(boolean value) {
            this.bitField0_ |= 4;
            this.isSkip_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsSkip() {
            this.bitField0_ &= -5;
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

   public static final class CR2S_FihtToCity_11434 extends GeneratedMessageV3 implements CR2S_FihtToCity_11434OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OPTIONALRESULT_FIELD_NUMBER = 1;
      private int optionalResult_;
      public static final int ISFIGHT_FIELD_NUMBER = 2;
      private boolean isFight_;
      public static final int ISWIN_FIELD_NUMBER = 3;
      private boolean isWin_;
      public static final int ISOCCYPY_FIELD_NUMBER = 4;
      private boolean isOccypy_;
      public static final int FIGHTRESULT_FIELD_NUMBER = 5;
      private BattleMsg.S2C_BattleResult_6102 fightResult_;
      private byte memoizedIsInitialized;
      private static final CR2S_FihtToCity_11434 DEFAULT_INSTANCE = new CR2S_FihtToCity_11434();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_FihtToCity_11434> PARSER = new AbstractParser<CR2S_FihtToCity_11434>() {
         public CR2S_FihtToCity_11434 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_FihtToCity_11434(input, extensionRegistry);
         }
      };

      private CR2S_FihtToCity_11434(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_FihtToCity_11434() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_FihtToCity_11434();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_FihtToCity_11434(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.optionalResult_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.isFight_ = input.readBool();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.isWin_ = input.readBool();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.isOccypy_ = input.readBool();
                        break;
                     case 42:
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 16) != 0) {
                           subBuilder = this.fightResult_.toBuilder();
                        }

                        this.fightResult_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.fightResult_);
                           this.fightResult_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 16;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_FihtToCity_11434_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_FihtToCity_11434_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_FihtToCity_11434.class, Builder.class);
      }

      public boolean hasOptionalResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getOptionalResult() {
         return this.optionalResult_;
      }

      public boolean hasIsFight() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsFight() {
         return this.isFight_;
      }

      public boolean hasIsWin() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsWin() {
         return this.isWin_;
      }

      public boolean hasIsOccypy() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getIsOccypy() {
         return this.isOccypy_;
      }

      public boolean hasFightResult() {
         return (this.bitField0_ & 16) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getFightResult() {
         return this.fightResult_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.fightResult_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getFightResultOrBuilder() {
         return this.fightResult_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.fightResult_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasOptionalResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasFightResult() && !this.getFightResult().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.optionalResult_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.isFight_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.isWin_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBool(4, this.isOccypy_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeMessage(5, this.getFightResult());
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
               size += CodedOutputStream.computeInt32Size(1, this.optionalResult_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.isFight_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.isWin_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.isOccypy_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeMessageSize(5, this.getFightResult());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_FihtToCity_11434)) {
            return super.equals(obj);
         } else {
            CR2S_FihtToCity_11434 other = (CR2S_FihtToCity_11434)obj;
            if (this.hasOptionalResult() != other.hasOptionalResult()) {
               return false;
            } else if (this.hasOptionalResult() && this.getOptionalResult() != other.getOptionalResult()) {
               return false;
            } else if (this.hasIsFight() != other.hasIsFight()) {
               return false;
            } else if (this.hasIsFight() && this.getIsFight() != other.getIsFight()) {
               return false;
            } else if (this.hasIsWin() != other.hasIsWin()) {
               return false;
            } else if (this.hasIsWin() && this.getIsWin() != other.getIsWin()) {
               return false;
            } else if (this.hasIsOccypy() != other.hasIsOccypy()) {
               return false;
            } else if (this.hasIsOccypy() && this.getIsOccypy() != other.getIsOccypy()) {
               return false;
            } else if (this.hasFightResult() != other.hasFightResult()) {
               return false;
            } else if (this.hasFightResult() && !this.getFightResult().equals(other.getFightResult())) {
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
            if (this.hasOptionalResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOptionalResult();
            }

            if (this.hasIsFight()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsFight());
            }

            if (this.hasIsWin()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getIsWin());
            }

            if (this.hasIsOccypy()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getIsOccypy());
            }

            if (this.hasFightResult()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getFightResult().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_FihtToCity_11434 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_FihtToCity_11434)PARSER.parseFrom(data);
      }

      public static CR2S_FihtToCity_11434 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_FihtToCity_11434)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_FihtToCity_11434 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_FihtToCity_11434)PARSER.parseFrom(data);
      }

      public static CR2S_FihtToCity_11434 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_FihtToCity_11434)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_FihtToCity_11434 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_FihtToCity_11434)PARSER.parseFrom(data);
      }

      public static CR2S_FihtToCity_11434 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_FihtToCity_11434)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_FihtToCity_11434 parseFrom(InputStream input) throws IOException {
         return (CR2S_FihtToCity_11434)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_FihtToCity_11434 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_FihtToCity_11434)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_FihtToCity_11434 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_FihtToCity_11434)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_FihtToCity_11434 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_FihtToCity_11434)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_FihtToCity_11434 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_FihtToCity_11434)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_FihtToCity_11434 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_FihtToCity_11434)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_FihtToCity_11434 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_FihtToCity_11434 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_FihtToCity_11434> parser() {
         return PARSER;
      }

      public Parser<CR2S_FihtToCity_11434> getParserForType() {
         return PARSER;
      }

      public CR2S_FihtToCity_11434 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_FihtToCity_11434OrBuilder {
         private int bitField0_;
         private int optionalResult_;
         private boolean isFight_;
         private boolean isWin_;
         private boolean isOccypy_;
         private BattleMsg.S2C_BattleResult_6102 fightResult_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> fightResultBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_FihtToCity_11434_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_FihtToCity_11434_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_FihtToCity_11434.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.CR2S_FihtToCity_11434.alwaysUseFieldBuilders) {
               this.getFightResultFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.optionalResult_ = 0;
            this.bitField0_ &= -2;
            this.isFight_ = false;
            this.bitField0_ &= -3;
            this.isWin_ = false;
            this.bitField0_ &= -5;
            this.isOccypy_ = false;
            this.bitField0_ &= -9;
            if (this.fightResultBuilder_ == null) {
               this.fightResult_ = null;
            } else {
               this.fightResultBuilder_.clear();
            }

            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_FihtToCity_11434_descriptor;
         }

         public CR2S_FihtToCity_11434 getDefaultInstanceForType() {
            return CrossCountryWarMsg.CR2S_FihtToCity_11434.getDefaultInstance();
         }

         public CR2S_FihtToCity_11434 build() {
            CR2S_FihtToCity_11434 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_FihtToCity_11434 buildPartial() {
            CR2S_FihtToCity_11434 result = new CR2S_FihtToCity_11434(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.optionalResult_ = this.optionalResult_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isFight_ = this.isFight_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.isWin_ = this.isWin_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.isOccypy_ = this.isOccypy_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               if (this.fightResultBuilder_ == null) {
                  result.fightResult_ = this.fightResult_;
               } else {
                  result.fightResult_ = (BattleMsg.S2C_BattleResult_6102)this.fightResultBuilder_.build();
               }

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
            if (other instanceof CR2S_FihtToCity_11434) {
               return this.mergeFrom((CR2S_FihtToCity_11434)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_FihtToCity_11434 other) {
            if (other == CrossCountryWarMsg.CR2S_FihtToCity_11434.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOptionalResult()) {
                  this.setOptionalResult(other.getOptionalResult());
               }

               if (other.hasIsFight()) {
                  this.setIsFight(other.getIsFight());
               }

               if (other.hasIsWin()) {
                  this.setIsWin(other.getIsWin());
               }

               if (other.hasIsOccypy()) {
                  this.setIsOccypy(other.getIsOccypy());
               }

               if (other.hasFightResult()) {
                  this.mergeFightResult(other.getFightResult());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasOptionalResult()) {
               return false;
            } else {
               return !this.hasFightResult() || this.getFightResult().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_FihtToCity_11434 parsedMessage = null;

            try {
               parsedMessage = (CR2S_FihtToCity_11434)CrossCountryWarMsg.CR2S_FihtToCity_11434.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_FihtToCity_11434)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOptionalResult() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getOptionalResult() {
            return this.optionalResult_;
         }

         public Builder setOptionalResult(int value) {
            this.bitField0_ |= 1;
            this.optionalResult_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOptionalResult() {
            this.bitField0_ &= -2;
            this.optionalResult_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsFight() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsFight() {
            return this.isFight_;
         }

         public Builder setIsFight(boolean value) {
            this.bitField0_ |= 2;
            this.isFight_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsFight() {
            this.bitField0_ &= -3;
            this.isFight_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasIsWin() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getIsWin() {
            return this.isWin_;
         }

         public Builder setIsWin(boolean value) {
            this.bitField0_ |= 4;
            this.isWin_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsWin() {
            this.bitField0_ &= -5;
            this.isWin_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasIsOccypy() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getIsOccypy() {
            return this.isOccypy_;
         }

         public Builder setIsOccypy(boolean value) {
            this.bitField0_ |= 8;
            this.isOccypy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsOccypy() {
            this.bitField0_ &= -9;
            this.isOccypy_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasFightResult() {
            return (this.bitField0_ & 16) != 0;
         }

         public BattleMsg.S2C_BattleResult_6102 getFightResult() {
            if (this.fightResultBuilder_ == null) {
               return this.fightResult_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.fightResult_;
            } else {
               return (BattleMsg.S2C_BattleResult_6102)this.fightResultBuilder_.getMessage();
            }
         }

         public Builder setFightResult(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.fightResultBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.fightResult_ = value;
               this.onChanged();
            } else {
               this.fightResultBuilder_.setMessage(value);
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder setFightResult(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.fightResultBuilder_ == null) {
               this.fightResult_ = builderForValue.build();
               this.onChanged();
            } else {
               this.fightResultBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder mergeFightResult(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.fightResultBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0 && this.fightResult_ != null && this.fightResult_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.fightResult_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.fightResult_).mergeFrom(value).buildPartial();
               } else {
                  this.fightResult_ = value;
               }

               this.onChanged();
            } else {
               this.fightResultBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder clearFightResult() {
            if (this.fightResultBuilder_ == null) {
               this.fightResult_ = null;
               this.onChanged();
            } else {
               this.fightResultBuilder_.clear();
            }

            this.bitField0_ &= -17;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getFightResultBuilder() {
            this.bitField0_ |= 16;
            this.onChanged();
            return (BattleMsg.S2C_BattleResult_6102.Builder)this.getFightResultFieldBuilder().getBuilder();
         }

         public BattleMsg.S2C_BattleResult_6102OrBuilder getFightResultOrBuilder() {
            if (this.fightResultBuilder_ != null) {
               return (BattleMsg.S2C_BattleResult_6102OrBuilder)this.fightResultBuilder_.getMessageOrBuilder();
            } else {
               return this.fightResult_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.fightResult_;
            }
         }

         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> getFightResultFieldBuilder() {
            if (this.fightResultBuilder_ == null) {
               this.fightResultBuilder_ = new SingleFieldBuilderV3(this.getFightResult(), this.getParentForChildren(), this.isClean());
               this.fightResult_ = null;
            }

            return this.fightResultBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_TransferToCity_11435 extends GeneratedMessageV3 implements S2CR_TransferToCity_11435OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CITYID_FIELD_NUMBER = 1;
      private int cityId_;
      public static final int TRANSFERPLAYERID_FIELD_NUMBER = 2;
      private int transferPlayerId_;
      public static final int ATTTOKEN_FIELD_NUMBER = 3;
      private int attToken_;
      public static final int MOVETOKEN_FIELD_NUMBER = 4;
      private int moveToken_;
      private byte memoizedIsInitialized;
      private static final S2CR_TransferToCity_11435 DEFAULT_INSTANCE = new S2CR_TransferToCity_11435();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_TransferToCity_11435> PARSER = new AbstractParser<S2CR_TransferToCity_11435>() {
         public S2CR_TransferToCity_11435 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_TransferToCity_11435(input, extensionRegistry);
         }
      };

      private S2CR_TransferToCity_11435(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_TransferToCity_11435() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_TransferToCity_11435();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_TransferToCity_11435(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.transferPlayerId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.attToken_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.moveToken_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TransferToCity_11435_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TransferToCity_11435_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_TransferToCity_11435.class, Builder.class);
      }

      public boolean hasCityId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCityId() {
         return this.cityId_;
      }

      public boolean hasTransferPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTransferPlayerId() {
         return this.transferPlayerId_;
      }

      public boolean hasAttToken() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getAttToken() {
         return this.attToken_;
      }

      public boolean hasMoveToken() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getMoveToken() {
         return this.moveToken_;
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
         } else if (!this.hasTransferPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAttToken()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMoveToken()) {
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
            output.writeInt32(2, this.transferPlayerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.attToken_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.moveToken_);
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
               size += CodedOutputStream.computeInt32Size(2, this.transferPlayerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.attToken_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.moveToken_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_TransferToCity_11435)) {
            return super.equals(obj);
         } else {
            S2CR_TransferToCity_11435 other = (S2CR_TransferToCity_11435)obj;
            if (this.hasCityId() != other.hasCityId()) {
               return false;
            } else if (this.hasCityId() && this.getCityId() != other.getCityId()) {
               return false;
            } else if (this.hasTransferPlayerId() != other.hasTransferPlayerId()) {
               return false;
            } else if (this.hasTransferPlayerId() && this.getTransferPlayerId() != other.getTransferPlayerId()) {
               return false;
            } else if (this.hasAttToken() != other.hasAttToken()) {
               return false;
            } else if (this.hasAttToken() && this.getAttToken() != other.getAttToken()) {
               return false;
            } else if (this.hasMoveToken() != other.hasMoveToken()) {
               return false;
            } else if (this.hasMoveToken() && this.getMoveToken() != other.getMoveToken()) {
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

            if (this.hasTransferPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTransferPlayerId();
            }

            if (this.hasAttToken()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getAttToken();
            }

            if (this.hasMoveToken()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getMoveToken();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_TransferToCity_11435 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_TransferToCity_11435)PARSER.parseFrom(data);
      }

      public static S2CR_TransferToCity_11435 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TransferToCity_11435)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TransferToCity_11435 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_TransferToCity_11435)PARSER.parseFrom(data);
      }

      public static S2CR_TransferToCity_11435 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TransferToCity_11435)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TransferToCity_11435 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_TransferToCity_11435)PARSER.parseFrom(data);
      }

      public static S2CR_TransferToCity_11435 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TransferToCity_11435)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TransferToCity_11435 parseFrom(InputStream input) throws IOException {
         return (S2CR_TransferToCity_11435)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_TransferToCity_11435 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TransferToCity_11435)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_TransferToCity_11435 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_TransferToCity_11435)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_TransferToCity_11435 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TransferToCity_11435)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_TransferToCity_11435 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_TransferToCity_11435)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_TransferToCity_11435 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TransferToCity_11435)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_TransferToCity_11435 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_TransferToCity_11435 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_TransferToCity_11435> parser() {
         return PARSER;
      }

      public Parser<S2CR_TransferToCity_11435> getParserForType() {
         return PARSER;
      }

      public S2CR_TransferToCity_11435 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_TransferToCity_11435OrBuilder {
         private int bitField0_;
         private int cityId_;
         private int transferPlayerId_;
         private int attToken_;
         private int moveToken_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TransferToCity_11435_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TransferToCity_11435_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_TransferToCity_11435.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.S2CR_TransferToCity_11435.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.cityId_ = 0;
            this.bitField0_ &= -2;
            this.transferPlayerId_ = 0;
            this.bitField0_ &= -3;
            this.attToken_ = 0;
            this.bitField0_ &= -5;
            this.moveToken_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TransferToCity_11435_descriptor;
         }

         public S2CR_TransferToCity_11435 getDefaultInstanceForType() {
            return CrossCountryWarMsg.S2CR_TransferToCity_11435.getDefaultInstance();
         }

         public S2CR_TransferToCity_11435 build() {
            S2CR_TransferToCity_11435 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_TransferToCity_11435 buildPartial() {
            S2CR_TransferToCity_11435 result = new S2CR_TransferToCity_11435(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.cityId_ = this.cityId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.transferPlayerId_ = this.transferPlayerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.attToken_ = this.attToken_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.moveToken_ = this.moveToken_;
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
            if (other instanceof S2CR_TransferToCity_11435) {
               return this.mergeFrom((S2CR_TransferToCity_11435)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_TransferToCity_11435 other) {
            if (other == CrossCountryWarMsg.S2CR_TransferToCity_11435.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCityId()) {
                  this.setCityId(other.getCityId());
               }

               if (other.hasTransferPlayerId()) {
                  this.setTransferPlayerId(other.getTransferPlayerId());
               }

               if (other.hasAttToken()) {
                  this.setAttToken(other.getAttToken());
               }

               if (other.hasMoveToken()) {
                  this.setMoveToken(other.getMoveToken());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCityId()) {
               return false;
            } else if (!this.hasTransferPlayerId()) {
               return false;
            } else if (!this.hasAttToken()) {
               return false;
            } else {
               return this.hasMoveToken();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_TransferToCity_11435 parsedMessage = null;

            try {
               parsedMessage = (S2CR_TransferToCity_11435)CrossCountryWarMsg.S2CR_TransferToCity_11435.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_TransferToCity_11435)e.getUnfinishedMessage();
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

         public boolean hasTransferPlayerId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTransferPlayerId() {
            return this.transferPlayerId_;
         }

         public Builder setTransferPlayerId(int value) {
            this.bitField0_ |= 2;
            this.transferPlayerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTransferPlayerId() {
            this.bitField0_ &= -3;
            this.transferPlayerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAttToken() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getAttToken() {
            return this.attToken_;
         }

         public Builder setAttToken(int value) {
            this.bitField0_ |= 4;
            this.attToken_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAttToken() {
            this.bitField0_ &= -5;
            this.attToken_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMoveToken() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getMoveToken() {
            return this.moveToken_;
         }

         public Builder setMoveToken(int value) {
            this.bitField0_ |= 8;
            this.moveToken_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMoveToken() {
            this.bitField0_ &= -9;
            this.moveToken_ = 0;
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

   public static final class CR2S_TransferToCity_11436 extends GeneratedMessageV3 implements CR2S_TransferToCity_11436OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int CONSUMETOKEN_FIELD_NUMBER = 2;
      private CommonMsg.ItemInfo consumeToken_;
      public static final int ISFIGHT_FIELD_NUMBER = 3;
      private boolean isFight_;
      public static final int ISWIN_FIELD_NUMBER = 4;
      private boolean isWin_;
      public static final int ISOCCYPY_FIELD_NUMBER = 5;
      private boolean isOccypy_;
      public static final int INFO_FIELD_NUMBER = 8;
      private CountryWarMsg.CountryWarLogInfo info_;
      public static final int ISBREAKDEFENSE_FIELD_NUMBER = 6;
      private boolean isBreakDefense_;
      private byte memoizedIsInitialized;
      private static final CR2S_TransferToCity_11436 DEFAULT_INSTANCE = new CR2S_TransferToCity_11436();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_TransferToCity_11436> PARSER = new AbstractParser<CR2S_TransferToCity_11436>() {
         public CR2S_TransferToCity_11436 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_TransferToCity_11436(input, extensionRegistry);
         }
      };

      private CR2S_TransferToCity_11436(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_TransferToCity_11436() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_TransferToCity_11436();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_TransferToCity_11436(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        CommonMsg.ItemInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.consumeToken_.toBuilder();
                        }

                        this.consumeToken_ = (CommonMsg.ItemInfo)input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.consumeToken_);
                           this.consumeToken_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.isFight_ = input.readBool();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.isWin_ = input.readBool();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.isOccypy_ = input.readBool();
                        break;
                     case 48:
                        this.bitField0_ |= 64;
                        this.isBreakDefense_ = input.readBool();
                        break;
                     case 66:
                        CountryWarMsg.CountryWarLogInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 32) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (CountryWarMsg.CountryWarLogInfo)input.readMessage(CountryWarMsg.CountryWarLogInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 32;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_TransferToCity_11436_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_TransferToCity_11436_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_TransferToCity_11436.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasConsumeToken() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.ItemInfo getConsumeToken() {
         return this.consumeToken_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.consumeToken_;
      }

      public CommonMsg.ItemInfoOrBuilder getConsumeTokenOrBuilder() {
         return this.consumeToken_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.consumeToken_;
      }

      public boolean hasIsFight() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsFight() {
         return this.isFight_;
      }

      public boolean hasIsWin() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getIsWin() {
         return this.isWin_;
      }

      public boolean hasIsOccypy() {
         return (this.bitField0_ & 16) != 0;
      }

      public boolean getIsOccypy() {
         return this.isOccypy_;
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 32) != 0;
      }

      public CountryWarMsg.CountryWarLogInfo getInfo() {
         return this.info_ == null ? CountryWarMsg.CountryWarLogInfo.getDefaultInstance() : this.info_;
      }

      public CountryWarMsg.CountryWarLogInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? CountryWarMsg.CountryWarLogInfo.getDefaultInstance() : this.info_;
      }

      public boolean hasIsBreakDefense() {
         return (this.bitField0_ & 64) != 0;
      }

      public boolean getIsBreakDefense() {
         return this.isBreakDefense_;
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
         } else if (this.hasConsumeToken() && !this.getConsumeToken().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasInfo() && !this.getInfo().isInitialized()) {
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
            output.writeMessage(2, this.getConsumeToken());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.isFight_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBool(4, this.isWin_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeBool(5, this.isOccypy_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeBool(6, this.isBreakDefense_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeMessage(8, this.getInfo());
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
               size += CodedOutputStream.computeMessageSize(2, this.getConsumeToken());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.isFight_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.isWin_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeBoolSize(5, this.isOccypy_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeBoolSize(6, this.isBreakDefense_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeMessageSize(8, this.getInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_TransferToCity_11436)) {
            return super.equals(obj);
         } else {
            CR2S_TransferToCity_11436 other = (CR2S_TransferToCity_11436)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasConsumeToken() != other.hasConsumeToken()) {
               return false;
            } else if (this.hasConsumeToken() && !this.getConsumeToken().equals(other.getConsumeToken())) {
               return false;
            } else if (this.hasIsFight() != other.hasIsFight()) {
               return false;
            } else if (this.hasIsFight() && this.getIsFight() != other.getIsFight()) {
               return false;
            } else if (this.hasIsWin() != other.hasIsWin()) {
               return false;
            } else if (this.hasIsWin() && this.getIsWin() != other.getIsWin()) {
               return false;
            } else if (this.hasIsOccypy() != other.hasIsOccypy()) {
               return false;
            } else if (this.hasIsOccypy() && this.getIsOccypy() != other.getIsOccypy()) {
               return false;
            } else if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
               return false;
            } else if (this.hasIsBreakDefense() != other.hasIsBreakDefense()) {
               return false;
            } else if (this.hasIsBreakDefense() && this.getIsBreakDefense() != other.getIsBreakDefense()) {
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

            if (this.hasConsumeToken()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getConsumeToken().hashCode();
            }

            if (this.hasIsFight()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getIsFight());
            }

            if (this.hasIsWin()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getIsWin());
            }

            if (this.hasIsOccypy()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashBoolean(this.getIsOccypy());
            }

            if (this.hasInfo()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            if (this.hasIsBreakDefense()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashBoolean(this.getIsBreakDefense());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_TransferToCity_11436 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_TransferToCity_11436)PARSER.parseFrom(data);
      }

      public static CR2S_TransferToCity_11436 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_TransferToCity_11436)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_TransferToCity_11436 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_TransferToCity_11436)PARSER.parseFrom(data);
      }

      public static CR2S_TransferToCity_11436 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_TransferToCity_11436)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_TransferToCity_11436 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_TransferToCity_11436)PARSER.parseFrom(data);
      }

      public static CR2S_TransferToCity_11436 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_TransferToCity_11436)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_TransferToCity_11436 parseFrom(InputStream input) throws IOException {
         return (CR2S_TransferToCity_11436)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_TransferToCity_11436 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_TransferToCity_11436)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_TransferToCity_11436 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_TransferToCity_11436)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_TransferToCity_11436 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_TransferToCity_11436)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_TransferToCity_11436 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_TransferToCity_11436)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_TransferToCity_11436 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_TransferToCity_11436)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_TransferToCity_11436 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_TransferToCity_11436 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_TransferToCity_11436> parser() {
         return PARSER;
      }

      public Parser<CR2S_TransferToCity_11436> getParserForType() {
         return PARSER;
      }

      public CR2S_TransferToCity_11436 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_TransferToCity_11436OrBuilder {
         private int bitField0_;
         private int result_;
         private CommonMsg.ItemInfo consumeToken_;
         private SingleFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> consumeTokenBuilder_;
         private boolean isFight_;
         private boolean isWin_;
         private boolean isOccypy_;
         private CountryWarMsg.CountryWarLogInfo info_;
         private SingleFieldBuilderV3<CountryWarMsg.CountryWarLogInfo, CountryWarMsg.CountryWarLogInfo.Builder, CountryWarMsg.CountryWarLogInfoOrBuilder> infoBuilder_;
         private boolean isBreakDefense_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_TransferToCity_11436_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_TransferToCity_11436_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_TransferToCity_11436.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.CR2S_TransferToCity_11436.alwaysUseFieldBuilders) {
               this.getConsumeTokenFieldBuilder();
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            if (this.consumeTokenBuilder_ == null) {
               this.consumeToken_ = null;
            } else {
               this.consumeTokenBuilder_.clear();
            }

            this.bitField0_ &= -3;
            this.isFight_ = false;
            this.bitField0_ &= -5;
            this.isWin_ = false;
            this.bitField0_ &= -9;
            this.isOccypy_ = false;
            this.bitField0_ &= -17;
            if (this.infoBuilder_ == null) {
               this.info_ = null;
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -33;
            this.isBreakDefense_ = false;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_TransferToCity_11436_descriptor;
         }

         public CR2S_TransferToCity_11436 getDefaultInstanceForType() {
            return CrossCountryWarMsg.CR2S_TransferToCity_11436.getDefaultInstance();
         }

         public CR2S_TransferToCity_11436 build() {
            CR2S_TransferToCity_11436 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_TransferToCity_11436 buildPartial() {
            CR2S_TransferToCity_11436 result = new CR2S_TransferToCity_11436(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.consumeTokenBuilder_ == null) {
                  result.consumeToken_ = this.consumeToken_;
               } else {
                  result.consumeToken_ = (CommonMsg.ItemInfo)this.consumeTokenBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.isFight_ = this.isFight_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.isWin_ = this.isWin_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.isOccypy_ = this.isOccypy_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (CountryWarMsg.CountryWarLogInfo)this.infoBuilder_.build();
               }

               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.isBreakDefense_ = this.isBreakDefense_;
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
            if (other instanceof CR2S_TransferToCity_11436) {
               return this.mergeFrom((CR2S_TransferToCity_11436)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_TransferToCity_11436 other) {
            if (other == CrossCountryWarMsg.CR2S_TransferToCity_11436.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasConsumeToken()) {
                  this.mergeConsumeToken(other.getConsumeToken());
               }

               if (other.hasIsFight()) {
                  this.setIsFight(other.getIsFight());
               }

               if (other.hasIsWin()) {
                  this.setIsWin(other.getIsWin());
               }

               if (other.hasIsOccypy()) {
                  this.setIsOccypy(other.getIsOccypy());
               }

               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               if (other.hasIsBreakDefense()) {
                  this.setIsBreakDefense(other.getIsBreakDefense());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (this.hasConsumeToken() && !this.getConsumeToken().isInitialized()) {
               return false;
            } else {
               return !this.hasInfo() || this.getInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_TransferToCity_11436 parsedMessage = null;

            try {
               parsedMessage = (CR2S_TransferToCity_11436)CrossCountryWarMsg.CR2S_TransferToCity_11436.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_TransferToCity_11436)e.getUnfinishedMessage();
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

         public boolean hasConsumeToken() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.ItemInfo getConsumeToken() {
            if (this.consumeTokenBuilder_ == null) {
               return this.consumeToken_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.consumeToken_;
            } else {
               return (CommonMsg.ItemInfo)this.consumeTokenBuilder_.getMessage();
            }
         }

         public Builder setConsumeToken(CommonMsg.ItemInfo value) {
            if (this.consumeTokenBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.consumeToken_ = value;
               this.onChanged();
            } else {
               this.consumeTokenBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setConsumeToken(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.consumeTokenBuilder_ == null) {
               this.consumeToken_ = builderForValue.build();
               this.onChanged();
            } else {
               this.consumeTokenBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeConsumeToken(CommonMsg.ItemInfo value) {
            if (this.consumeTokenBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.consumeToken_ != null && this.consumeToken_ != CommonMsg.ItemInfo.getDefaultInstance()) {
                  this.consumeToken_ = CommonMsg.ItemInfo.newBuilder(this.consumeToken_).mergeFrom(value).buildPartial();
               } else {
                  this.consumeToken_ = value;
               }

               this.onChanged();
            } else {
               this.consumeTokenBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearConsumeToken() {
            if (this.consumeTokenBuilder_ == null) {
               this.consumeToken_ = null;
               this.onChanged();
            } else {
               this.consumeTokenBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.ItemInfo.Builder getConsumeTokenBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.ItemInfo.Builder)this.getConsumeTokenFieldBuilder().getBuilder();
         }

         public CommonMsg.ItemInfoOrBuilder getConsumeTokenOrBuilder() {
            if (this.consumeTokenBuilder_ != null) {
               return (CommonMsg.ItemInfoOrBuilder)this.consumeTokenBuilder_.getMessageOrBuilder();
            } else {
               return this.consumeToken_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.consumeToken_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getConsumeTokenFieldBuilder() {
            if (this.consumeTokenBuilder_ == null) {
               this.consumeTokenBuilder_ = new SingleFieldBuilderV3(this.getConsumeToken(), this.getParentForChildren(), this.isClean());
               this.consumeToken_ = null;
            }

            return this.consumeTokenBuilder_;
         }

         public boolean hasIsFight() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getIsFight() {
            return this.isFight_;
         }

         public Builder setIsFight(boolean value) {
            this.bitField0_ |= 4;
            this.isFight_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsFight() {
            this.bitField0_ &= -5;
            this.isFight_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasIsWin() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getIsWin() {
            return this.isWin_;
         }

         public Builder setIsWin(boolean value) {
            this.bitField0_ |= 8;
            this.isWin_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsWin() {
            this.bitField0_ &= -9;
            this.isWin_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasIsOccypy() {
            return (this.bitField0_ & 16) != 0;
         }

         public boolean getIsOccypy() {
            return this.isOccypy_;
         }

         public Builder setIsOccypy(boolean value) {
            this.bitField0_ |= 16;
            this.isOccypy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsOccypy() {
            this.bitField0_ &= -17;
            this.isOccypy_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasInfo() {
            return (this.bitField0_ & 32) != 0;
         }

         public CountryWarMsg.CountryWarLogInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? CountryWarMsg.CountryWarLogInfo.getDefaultInstance() : this.info_;
            } else {
               return (CountryWarMsg.CountryWarLogInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(CountryWarMsg.CountryWarLogInfo value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.info_ = value;
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder setInfo(CountryWarMsg.CountryWarLogInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder mergeInfo(CountryWarMsg.CountryWarLogInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0 && this.info_ != null && this.info_ != CountryWarMsg.CountryWarLogInfo.getDefaultInstance()) {
                  this.info_ = CountryWarMsg.CountryWarLogInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
               } else {
                  this.info_ = value;
               }

               this.onChanged();
            } else {
               this.infoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = null;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -33;
            return this;
         }

         public CountryWarMsg.CountryWarLogInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 32;
            this.onChanged();
            return (CountryWarMsg.CountryWarLogInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public CountryWarMsg.CountryWarLogInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (CountryWarMsg.CountryWarLogInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? CountryWarMsg.CountryWarLogInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<CountryWarMsg.CountryWarLogInfo, CountryWarMsg.CountryWarLogInfo.Builder, CountryWarMsg.CountryWarLogInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public boolean hasIsBreakDefense() {
            return (this.bitField0_ & 64) != 0;
         }

         public boolean getIsBreakDefense() {
            return this.isBreakDefense_;
         }

         public Builder setIsBreakDefense(boolean value) {
            this.bitField0_ |= 64;
            this.isBreakDefense_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsBreakDefense() {
            this.bitField0_ &= -65;
            this.isBreakDefense_ = false;
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

   public static final class S2CR_TransferList_11437 extends GeneratedMessageV3 implements S2CR_TransferList_11437OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_TransferList_11437 DEFAULT_INSTANCE = new S2CR_TransferList_11437();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_TransferList_11437> PARSER = new AbstractParser<S2CR_TransferList_11437>() {
         public S2CR_TransferList_11437 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_TransferList_11437(input, extensionRegistry);
         }
      };

      private S2CR_TransferList_11437(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_TransferList_11437() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_TransferList_11437();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_TransferList_11437(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TransferList_11437_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TransferList_11437_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_TransferList_11437.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_TransferList_11437)) {
            return super.equals(obj);
         } else {
            S2CR_TransferList_11437 other = (S2CR_TransferList_11437)obj;
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

      public static S2CR_TransferList_11437 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_TransferList_11437)PARSER.parseFrom(data);
      }

      public static S2CR_TransferList_11437 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TransferList_11437)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TransferList_11437 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_TransferList_11437)PARSER.parseFrom(data);
      }

      public static S2CR_TransferList_11437 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TransferList_11437)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TransferList_11437 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_TransferList_11437)PARSER.parseFrom(data);
      }

      public static S2CR_TransferList_11437 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TransferList_11437)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TransferList_11437 parseFrom(InputStream input) throws IOException {
         return (S2CR_TransferList_11437)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_TransferList_11437 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TransferList_11437)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_TransferList_11437 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_TransferList_11437)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_TransferList_11437 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TransferList_11437)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_TransferList_11437 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_TransferList_11437)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_TransferList_11437 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TransferList_11437)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_TransferList_11437 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_TransferList_11437 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_TransferList_11437> parser() {
         return PARSER;
      }

      public Parser<S2CR_TransferList_11437> getParserForType() {
         return PARSER;
      }

      public S2CR_TransferList_11437 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_TransferList_11437OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TransferList_11437_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TransferList_11437_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_TransferList_11437.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.S2CR_TransferList_11437.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TransferList_11437_descriptor;
         }

         public S2CR_TransferList_11437 getDefaultInstanceForType() {
            return CrossCountryWarMsg.S2CR_TransferList_11437.getDefaultInstance();
         }

         public S2CR_TransferList_11437 build() {
            S2CR_TransferList_11437 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_TransferList_11437 buildPartial() {
            S2CR_TransferList_11437 result = new S2CR_TransferList_11437(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_TransferList_11437) {
               return this.mergeFrom((S2CR_TransferList_11437)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_TransferList_11437 other) {
            if (other == CrossCountryWarMsg.S2CR_TransferList_11437.getDefaultInstance()) {
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
            S2CR_TransferList_11437 parsedMessage = null;

            try {
               parsedMessage = (S2CR_TransferList_11437)CrossCountryWarMsg.S2CR_TransferList_11437.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_TransferList_11437)e.getUnfinishedMessage();
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

   public static final class CR2S_DefSuccess_11438 extends GeneratedMessageV3 implements CR2S_DefSuccess_11438OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final CR2S_DefSuccess_11438 DEFAULT_INSTANCE = new CR2S_DefSuccess_11438();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_DefSuccess_11438> PARSER = new AbstractParser<CR2S_DefSuccess_11438>() {
         public CR2S_DefSuccess_11438 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_DefSuccess_11438(input, extensionRegistry);
         }
      };

      private CR2S_DefSuccess_11438(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_DefSuccess_11438() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_DefSuccess_11438();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_DefSuccess_11438(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_DefSuccess_11438_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_DefSuccess_11438_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_DefSuccess_11438.class, Builder.class);
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
         } else if (!(obj instanceof CR2S_DefSuccess_11438)) {
            return super.equals(obj);
         } else {
            CR2S_DefSuccess_11438 other = (CR2S_DefSuccess_11438)obj;
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

      public static CR2S_DefSuccess_11438 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_DefSuccess_11438)PARSER.parseFrom(data);
      }

      public static CR2S_DefSuccess_11438 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_DefSuccess_11438)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_DefSuccess_11438 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_DefSuccess_11438)PARSER.parseFrom(data);
      }

      public static CR2S_DefSuccess_11438 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_DefSuccess_11438)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_DefSuccess_11438 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_DefSuccess_11438)PARSER.parseFrom(data);
      }

      public static CR2S_DefSuccess_11438 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_DefSuccess_11438)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_DefSuccess_11438 parseFrom(InputStream input) throws IOException {
         return (CR2S_DefSuccess_11438)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_DefSuccess_11438 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_DefSuccess_11438)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_DefSuccess_11438 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_DefSuccess_11438)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_DefSuccess_11438 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_DefSuccess_11438)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_DefSuccess_11438 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_DefSuccess_11438)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_DefSuccess_11438 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_DefSuccess_11438)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_DefSuccess_11438 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_DefSuccess_11438 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_DefSuccess_11438> parser() {
         return PARSER;
      }

      public Parser<CR2S_DefSuccess_11438> getParserForType() {
         return PARSER;
      }

      public CR2S_DefSuccess_11438 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_DefSuccess_11438OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_DefSuccess_11438_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_DefSuccess_11438_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_DefSuccess_11438.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.CR2S_DefSuccess_11438.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_DefSuccess_11438_descriptor;
         }

         public CR2S_DefSuccess_11438 getDefaultInstanceForType() {
            return CrossCountryWarMsg.CR2S_DefSuccess_11438.getDefaultInstance();
         }

         public CR2S_DefSuccess_11438 build() {
            CR2S_DefSuccess_11438 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_DefSuccess_11438 buildPartial() {
            CR2S_DefSuccess_11438 result = new CR2S_DefSuccess_11438(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_DefSuccess_11438) {
               return this.mergeFrom((CR2S_DefSuccess_11438)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_DefSuccess_11438 other) {
            if (other == CrossCountryWarMsg.CR2S_DefSuccess_11438.getDefaultInstance()) {
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
            CR2S_DefSuccess_11438 parsedMessage = null;

            try {
               parsedMessage = (CR2S_DefSuccess_11438)CrossCountryWarMsg.CR2S_DefSuccess_11438.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_DefSuccess_11438)e.getUnfinishedMessage();
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

   public static final class S2CR_TakeCityReward_11441 extends GeneratedMessageV3 implements S2CR_TakeCityReward_11441OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_TakeCityReward_11441 DEFAULT_INSTANCE = new S2CR_TakeCityReward_11441();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_TakeCityReward_11441> PARSER = new AbstractParser<S2CR_TakeCityReward_11441>() {
         public S2CR_TakeCityReward_11441 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_TakeCityReward_11441(input, extensionRegistry);
         }
      };

      private S2CR_TakeCityReward_11441(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_TakeCityReward_11441() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_TakeCityReward_11441();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_TakeCityReward_11441(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TakeCityReward_11441_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TakeCityReward_11441_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_TakeCityReward_11441.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_TakeCityReward_11441)) {
            return super.equals(obj);
         } else {
            S2CR_TakeCityReward_11441 other = (S2CR_TakeCityReward_11441)obj;
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

      public static S2CR_TakeCityReward_11441 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_TakeCityReward_11441)PARSER.parseFrom(data);
      }

      public static S2CR_TakeCityReward_11441 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TakeCityReward_11441)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TakeCityReward_11441 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_TakeCityReward_11441)PARSER.parseFrom(data);
      }

      public static S2CR_TakeCityReward_11441 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TakeCityReward_11441)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TakeCityReward_11441 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_TakeCityReward_11441)PARSER.parseFrom(data);
      }

      public static S2CR_TakeCityReward_11441 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TakeCityReward_11441)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TakeCityReward_11441 parseFrom(InputStream input) throws IOException {
         return (S2CR_TakeCityReward_11441)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_TakeCityReward_11441 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TakeCityReward_11441)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_TakeCityReward_11441 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_TakeCityReward_11441)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_TakeCityReward_11441 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TakeCityReward_11441)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_TakeCityReward_11441 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_TakeCityReward_11441)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_TakeCityReward_11441 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TakeCityReward_11441)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_TakeCityReward_11441 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_TakeCityReward_11441 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_TakeCityReward_11441> parser() {
         return PARSER;
      }

      public Parser<S2CR_TakeCityReward_11441> getParserForType() {
         return PARSER;
      }

      public S2CR_TakeCityReward_11441 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_TakeCityReward_11441OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TakeCityReward_11441_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TakeCityReward_11441_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_TakeCityReward_11441.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.S2CR_TakeCityReward_11441.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_TakeCityReward_11441_descriptor;
         }

         public S2CR_TakeCityReward_11441 getDefaultInstanceForType() {
            return CrossCountryWarMsg.S2CR_TakeCityReward_11441.getDefaultInstance();
         }

         public S2CR_TakeCityReward_11441 build() {
            S2CR_TakeCityReward_11441 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_TakeCityReward_11441 buildPartial() {
            S2CR_TakeCityReward_11441 result = new S2CR_TakeCityReward_11441(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_TakeCityReward_11441) {
               return this.mergeFrom((S2CR_TakeCityReward_11441)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_TakeCityReward_11441 other) {
            if (other == CrossCountryWarMsg.S2CR_TakeCityReward_11441.getDefaultInstance()) {
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
            S2CR_TakeCityReward_11441 parsedMessage = null;

            try {
               parsedMessage = (S2CR_TakeCityReward_11441)CrossCountryWarMsg.S2CR_TakeCityReward_11441.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_TakeCityReward_11441)e.getUnfinishedMessage();
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

   public static final class CR2S_TakeCityReward_11442 extends GeneratedMessageV3 implements CR2S_TakeCityReward_11442OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int ITEMS_FIELD_NUMBER = 2;
      private List<CommonMsg.ItemInfo> items_;
      private byte memoizedIsInitialized;
      private static final CR2S_TakeCityReward_11442 DEFAULT_INSTANCE = new CR2S_TakeCityReward_11442();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_TakeCityReward_11442> PARSER = new AbstractParser<CR2S_TakeCityReward_11442>() {
         public CR2S_TakeCityReward_11442 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_TakeCityReward_11442(input, extensionRegistry);
         }
      };

      private CR2S_TakeCityReward_11442(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_TakeCityReward_11442() {
         this.memoizedIsInitialized = -1;
         this.items_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_TakeCityReward_11442();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_TakeCityReward_11442(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_TakeCityReward_11442_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_TakeCityReward_11442_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_TakeCityReward_11442.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
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
         } else if (!this.hasResult()) {
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
            output.writeInt32(1, this.result_);
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
               size += CodedOutputStream.computeInt32Size(1, this.result_);
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
         } else if (!(obj instanceof CR2S_TakeCityReward_11442)) {
            return super.equals(obj);
         } else {
            CR2S_TakeCityReward_11442 other = (CR2S_TakeCityReward_11442)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
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

      public static CR2S_TakeCityReward_11442 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_TakeCityReward_11442)PARSER.parseFrom(data);
      }

      public static CR2S_TakeCityReward_11442 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_TakeCityReward_11442)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_TakeCityReward_11442 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_TakeCityReward_11442)PARSER.parseFrom(data);
      }

      public static CR2S_TakeCityReward_11442 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_TakeCityReward_11442)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_TakeCityReward_11442 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_TakeCityReward_11442)PARSER.parseFrom(data);
      }

      public static CR2S_TakeCityReward_11442 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_TakeCityReward_11442)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_TakeCityReward_11442 parseFrom(InputStream input) throws IOException {
         return (CR2S_TakeCityReward_11442)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_TakeCityReward_11442 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_TakeCityReward_11442)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_TakeCityReward_11442 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_TakeCityReward_11442)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_TakeCityReward_11442 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_TakeCityReward_11442)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_TakeCityReward_11442 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_TakeCityReward_11442)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_TakeCityReward_11442 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_TakeCityReward_11442)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_TakeCityReward_11442 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_TakeCityReward_11442 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_TakeCityReward_11442> parser() {
         return PARSER;
      }

      public Parser<CR2S_TakeCityReward_11442> getParserForType() {
         return PARSER;
      }

      public CR2S_TakeCityReward_11442 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_TakeCityReward_11442OrBuilder {
         private int bitField0_;
         private int result_;
         private List<CommonMsg.ItemInfo> items_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_TakeCityReward_11442_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_TakeCityReward_11442_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_TakeCityReward_11442.class, Builder.class);
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
            if (CrossCountryWarMsg.CR2S_TakeCityReward_11442.alwaysUseFieldBuilders) {
               this.getItemsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
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
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_TakeCityReward_11442_descriptor;
         }

         public CR2S_TakeCityReward_11442 getDefaultInstanceForType() {
            return CrossCountryWarMsg.CR2S_TakeCityReward_11442.getDefaultInstance();
         }

         public CR2S_TakeCityReward_11442 build() {
            CR2S_TakeCityReward_11442 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_TakeCityReward_11442 buildPartial() {
            CR2S_TakeCityReward_11442 result = new CR2S_TakeCityReward_11442(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
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
            if (other instanceof CR2S_TakeCityReward_11442) {
               return this.mergeFrom((CR2S_TakeCityReward_11442)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_TakeCityReward_11442 other) {
            if (other == CrossCountryWarMsg.CR2S_TakeCityReward_11442.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
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
                     this.itemsBuilder_ = CrossCountryWarMsg.CR2S_TakeCityReward_11442.alwaysUseFieldBuilders ? this.getItemsFieldBuilder() : null;
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
            if (!this.hasResult()) {
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
            CR2S_TakeCityReward_11442 parsedMessage = null;

            try {
               parsedMessage = (CR2S_TakeCityReward_11442)CrossCountryWarMsg.CR2S_TakeCityReward_11442.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_TakeCityReward_11442)e.getUnfinishedMessage();
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

   public static final class S2CR_OpenTurnTableUi_11461 extends GeneratedMessageV3 implements S2CR_OpenTurnTableUi_11461OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_OpenTurnTableUi_11461 DEFAULT_INSTANCE = new S2CR_OpenTurnTableUi_11461();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_OpenTurnTableUi_11461> PARSER = new AbstractParser<S2CR_OpenTurnTableUi_11461>() {
         public S2CR_OpenTurnTableUi_11461 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_OpenTurnTableUi_11461(input, extensionRegistry);
         }
      };

      private S2CR_OpenTurnTableUi_11461(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_OpenTurnTableUi_11461() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_OpenTurnTableUi_11461();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_OpenTurnTableUi_11461(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_OpenTurnTableUi_11461_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_OpenTurnTableUi_11461_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_OpenTurnTableUi_11461.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_OpenTurnTableUi_11461)) {
            return super.equals(obj);
         } else {
            S2CR_OpenTurnTableUi_11461 other = (S2CR_OpenTurnTableUi_11461)obj;
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

      public static S2CR_OpenTurnTableUi_11461 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_OpenTurnTableUi_11461)PARSER.parseFrom(data);
      }

      public static S2CR_OpenTurnTableUi_11461 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_OpenTurnTableUi_11461)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_OpenTurnTableUi_11461 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_OpenTurnTableUi_11461)PARSER.parseFrom(data);
      }

      public static S2CR_OpenTurnTableUi_11461 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_OpenTurnTableUi_11461)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_OpenTurnTableUi_11461 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_OpenTurnTableUi_11461)PARSER.parseFrom(data);
      }

      public static S2CR_OpenTurnTableUi_11461 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_OpenTurnTableUi_11461)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_OpenTurnTableUi_11461 parseFrom(InputStream input) throws IOException {
         return (S2CR_OpenTurnTableUi_11461)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_OpenTurnTableUi_11461 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_OpenTurnTableUi_11461)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_OpenTurnTableUi_11461 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_OpenTurnTableUi_11461)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_OpenTurnTableUi_11461 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_OpenTurnTableUi_11461)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_OpenTurnTableUi_11461 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_OpenTurnTableUi_11461)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_OpenTurnTableUi_11461 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_OpenTurnTableUi_11461)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_OpenTurnTableUi_11461 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_OpenTurnTableUi_11461 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_OpenTurnTableUi_11461> parser() {
         return PARSER;
      }

      public Parser<S2CR_OpenTurnTableUi_11461> getParserForType() {
         return PARSER;
      }

      public S2CR_OpenTurnTableUi_11461 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_OpenTurnTableUi_11461OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_OpenTurnTableUi_11461_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_OpenTurnTableUi_11461_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_OpenTurnTableUi_11461.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.S2CR_OpenTurnTableUi_11461.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_OpenTurnTableUi_11461_descriptor;
         }

         public S2CR_OpenTurnTableUi_11461 getDefaultInstanceForType() {
            return CrossCountryWarMsg.S2CR_OpenTurnTableUi_11461.getDefaultInstance();
         }

         public S2CR_OpenTurnTableUi_11461 build() {
            S2CR_OpenTurnTableUi_11461 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_OpenTurnTableUi_11461 buildPartial() {
            S2CR_OpenTurnTableUi_11461 result = new S2CR_OpenTurnTableUi_11461(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_OpenTurnTableUi_11461) {
               return this.mergeFrom((S2CR_OpenTurnTableUi_11461)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_OpenTurnTableUi_11461 other) {
            if (other == CrossCountryWarMsg.S2CR_OpenTurnTableUi_11461.getDefaultInstance()) {
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
            S2CR_OpenTurnTableUi_11461 parsedMessage = null;

            try {
               parsedMessage = (S2CR_OpenTurnTableUi_11461)CrossCountryWarMsg.S2CR_OpenTurnTableUi_11461.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_OpenTurnTableUi_11461)e.getUnfinishedMessage();
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

   public static final class CR2S_OpenTurnTableUi_11462 extends GeneratedMessageV3 implements CR2S_OpenTurnTableUi_11462OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECORDS_FIELD_NUMBER = 1;
      private LazyStringList records_;
      private byte memoizedIsInitialized;
      private static final CR2S_OpenTurnTableUi_11462 DEFAULT_INSTANCE = new CR2S_OpenTurnTableUi_11462();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_OpenTurnTableUi_11462> PARSER = new AbstractParser<CR2S_OpenTurnTableUi_11462>() {
         public CR2S_OpenTurnTableUi_11462 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_OpenTurnTableUi_11462(input, extensionRegistry);
         }
      };

      private CR2S_OpenTurnTableUi_11462(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_OpenTurnTableUi_11462() {
         this.memoizedIsInitialized = -1;
         this.records_ = LazyStringArrayList.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_OpenTurnTableUi_11462();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_OpenTurnTableUi_11462(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.records_ = new LazyStringArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.records_.add(bs);
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.records_ = this.records_.getUnmodifiableView();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_OpenTurnTableUi_11462_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_OpenTurnTableUi_11462_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_OpenTurnTableUi_11462.class, Builder.class);
      }

      public ProtocolStringList getRecordsList() {
         return this.records_;
      }

      public int getRecordsCount() {
         return this.records_.size();
      }

      public String getRecords(int index) {
         return (String)this.records_.get(index);
      }

      public ByteString getRecordsBytes(int index) {
         return this.records_.getByteString(index);
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
         for(int i = 0; i < this.records_.size(); ++i) {
            GeneratedMessageV3.writeString(output, 1, this.records_.getRaw(i));
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

            for(int i = 0; i < this.records_.size(); ++i) {
               dataSize += computeStringSizeNoTag(this.records_.getRaw(i));
            }

            size += dataSize;
            size += 1 * this.getRecordsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_OpenTurnTableUi_11462)) {
            return super.equals(obj);
         } else {
            CR2S_OpenTurnTableUi_11462 other = (CR2S_OpenTurnTableUi_11462)obj;
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

      public static CR2S_OpenTurnTableUi_11462 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_OpenTurnTableUi_11462)PARSER.parseFrom(data);
      }

      public static CR2S_OpenTurnTableUi_11462 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_OpenTurnTableUi_11462)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_OpenTurnTableUi_11462 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_OpenTurnTableUi_11462)PARSER.parseFrom(data);
      }

      public static CR2S_OpenTurnTableUi_11462 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_OpenTurnTableUi_11462)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_OpenTurnTableUi_11462 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_OpenTurnTableUi_11462)PARSER.parseFrom(data);
      }

      public static CR2S_OpenTurnTableUi_11462 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_OpenTurnTableUi_11462)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_OpenTurnTableUi_11462 parseFrom(InputStream input) throws IOException {
         return (CR2S_OpenTurnTableUi_11462)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_OpenTurnTableUi_11462 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_OpenTurnTableUi_11462)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_OpenTurnTableUi_11462 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_OpenTurnTableUi_11462)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_OpenTurnTableUi_11462 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_OpenTurnTableUi_11462)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_OpenTurnTableUi_11462 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_OpenTurnTableUi_11462)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_OpenTurnTableUi_11462 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_OpenTurnTableUi_11462)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_OpenTurnTableUi_11462 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_OpenTurnTableUi_11462 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_OpenTurnTableUi_11462> parser() {
         return PARSER;
      }

      public Parser<CR2S_OpenTurnTableUi_11462> getParserForType() {
         return PARSER;
      }

      public CR2S_OpenTurnTableUi_11462 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_OpenTurnTableUi_11462OrBuilder {
         private int bitField0_;
         private LazyStringList records_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_OpenTurnTableUi_11462_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_OpenTurnTableUi_11462_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_OpenTurnTableUi_11462.class, Builder.class);
         }

         private Builder() {
            this.records_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.records_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.CR2S_OpenTurnTableUi_11462.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.records_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_OpenTurnTableUi_11462_descriptor;
         }

         public CR2S_OpenTurnTableUi_11462 getDefaultInstanceForType() {
            return CrossCountryWarMsg.CR2S_OpenTurnTableUi_11462.getDefaultInstance();
         }

         public CR2S_OpenTurnTableUi_11462 build() {
            CR2S_OpenTurnTableUi_11462 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_OpenTurnTableUi_11462 buildPartial() {
            CR2S_OpenTurnTableUi_11462 result = new CR2S_OpenTurnTableUi_11462(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.records_ = this.records_.getUnmodifiableView();
               this.bitField0_ &= -2;
            }

            result.records_ = this.records_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_OpenTurnTableUi_11462) {
               return this.mergeFrom((CR2S_OpenTurnTableUi_11462)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_OpenTurnTableUi_11462 other) {
            if (other == CrossCountryWarMsg.CR2S_OpenTurnTableUi_11462.getDefaultInstance()) {
               return this;
            } else {
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

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_OpenTurnTableUi_11462 parsedMessage = null;

            try {
               parsedMessage = (CR2S_OpenTurnTableUi_11462)CrossCountryWarMsg.CR2S_OpenTurnTableUi_11462.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_OpenTurnTableUi_11462)e.getUnfinishedMessage();
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
               this.records_ = new LazyStringArrayList(this.records_);
               this.bitField0_ |= 1;
            }

         }

         public ProtocolStringList getRecordsList() {
            return this.records_.getUnmodifiableView();
         }

         public int getRecordsCount() {
            return this.records_.size();
         }

         public String getRecords(int index) {
            return (String)this.records_.get(index);
         }

         public ByteString getRecordsBytes(int index) {
            return this.records_.getByteString(index);
         }

         public Builder setRecords(int index, String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRecordsIsMutable();
               this.records_.set(index, value);
               this.onChanged();
               return this;
            }
         }

         public Builder addRecords(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRecordsIsMutable();
               this.records_.add(value);
               this.onChanged();
               return this;
            }
         }

         public Builder addAllRecords(Iterable<String> values) {
            this.ensureRecordsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.records_);
            this.onChanged();
            return this;
         }

         public Builder clearRecords() {
            this.records_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public Builder addRecordsBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRecordsIsMutable();
               this.records_.add(value);
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

   public static final class S2CR_LuckDrawRecord_11463 extends GeneratedMessageV3 implements S2CR_LuckDrawRecord_11463OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECORD_FIELD_NUMBER = 1;
      private LazyStringList record_;
      private byte memoizedIsInitialized;
      private static final S2CR_LuckDrawRecord_11463 DEFAULT_INSTANCE = new S2CR_LuckDrawRecord_11463();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_LuckDrawRecord_11463> PARSER = new AbstractParser<S2CR_LuckDrawRecord_11463>() {
         public S2CR_LuckDrawRecord_11463 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_LuckDrawRecord_11463(input, extensionRegistry);
         }
      };

      private S2CR_LuckDrawRecord_11463(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_LuckDrawRecord_11463() {
         this.memoizedIsInitialized = -1;
         this.record_ = LazyStringArrayList.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_LuckDrawRecord_11463();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_LuckDrawRecord_11463(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_LuckDrawRecord_11463_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_LuckDrawRecord_11463_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_LuckDrawRecord_11463.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_LuckDrawRecord_11463)) {
            return super.equals(obj);
         } else {
            S2CR_LuckDrawRecord_11463 other = (S2CR_LuckDrawRecord_11463)obj;
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

      public static S2CR_LuckDrawRecord_11463 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_LuckDrawRecord_11463)PARSER.parseFrom(data);
      }

      public static S2CR_LuckDrawRecord_11463 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_LuckDrawRecord_11463)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_LuckDrawRecord_11463 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_LuckDrawRecord_11463)PARSER.parseFrom(data);
      }

      public static S2CR_LuckDrawRecord_11463 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_LuckDrawRecord_11463)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_LuckDrawRecord_11463 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_LuckDrawRecord_11463)PARSER.parseFrom(data);
      }

      public static S2CR_LuckDrawRecord_11463 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_LuckDrawRecord_11463)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_LuckDrawRecord_11463 parseFrom(InputStream input) throws IOException {
         return (S2CR_LuckDrawRecord_11463)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_LuckDrawRecord_11463 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_LuckDrawRecord_11463)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_LuckDrawRecord_11463 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_LuckDrawRecord_11463)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_LuckDrawRecord_11463 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_LuckDrawRecord_11463)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_LuckDrawRecord_11463 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_LuckDrawRecord_11463)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_LuckDrawRecord_11463 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_LuckDrawRecord_11463)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_LuckDrawRecord_11463 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_LuckDrawRecord_11463 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_LuckDrawRecord_11463> parser() {
         return PARSER;
      }

      public Parser<S2CR_LuckDrawRecord_11463> getParserForType() {
         return PARSER;
      }

      public S2CR_LuckDrawRecord_11463 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_LuckDrawRecord_11463OrBuilder {
         private int bitField0_;
         private LazyStringList record_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_LuckDrawRecord_11463_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_LuckDrawRecord_11463_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_LuckDrawRecord_11463.class, Builder.class);
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
            if (CrossCountryWarMsg.S2CR_LuckDrawRecord_11463.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.record_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_LuckDrawRecord_11463_descriptor;
         }

         public S2CR_LuckDrawRecord_11463 getDefaultInstanceForType() {
            return CrossCountryWarMsg.S2CR_LuckDrawRecord_11463.getDefaultInstance();
         }

         public S2CR_LuckDrawRecord_11463 build() {
            S2CR_LuckDrawRecord_11463 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_LuckDrawRecord_11463 buildPartial() {
            S2CR_LuckDrawRecord_11463 result = new S2CR_LuckDrawRecord_11463(this);
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
            if (other instanceof S2CR_LuckDrawRecord_11463) {
               return this.mergeFrom((S2CR_LuckDrawRecord_11463)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_LuckDrawRecord_11463 other) {
            if (other == CrossCountryWarMsg.S2CR_LuckDrawRecord_11463.getDefaultInstance()) {
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
            S2CR_LuckDrawRecord_11463 parsedMessage = null;

            try {
               parsedMessage = (S2CR_LuckDrawRecord_11463)CrossCountryWarMsg.S2CR_LuckDrawRecord_11463.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_LuckDrawRecord_11463)e.getUnfinishedMessage();
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

   public static final class CR2S_LuckDrawRecord_11464 extends GeneratedMessageV3 implements CR2S_LuckDrawRecord_11464OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int RECORDS_FIELD_NUMBER = 2;
      private LazyStringList records_;
      private byte memoizedIsInitialized;
      private static final CR2S_LuckDrawRecord_11464 DEFAULT_INSTANCE = new CR2S_LuckDrawRecord_11464();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_LuckDrawRecord_11464> PARSER = new AbstractParser<CR2S_LuckDrawRecord_11464>() {
         public CR2S_LuckDrawRecord_11464 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_LuckDrawRecord_11464(input, extensionRegistry);
         }
      };

      private CR2S_LuckDrawRecord_11464(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_LuckDrawRecord_11464() {
         this.memoizedIsInitialized = -1;
         this.records_ = LazyStringArrayList.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_LuckDrawRecord_11464();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_LuckDrawRecord_11464(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.records_ = new LazyStringArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.records_.add(bs);
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.records_ = this.records_.getUnmodifiableView();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_LuckDrawRecord_11464_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_LuckDrawRecord_11464_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_LuckDrawRecord_11464.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public ProtocolStringList getRecordsList() {
         return this.records_;
      }

      public int getRecordsCount() {
         return this.records_.size();
      }

      public String getRecords(int index) {
         return (String)this.records_.get(index);
      }

      public ByteString getRecordsBytes(int index) {
         return this.records_.getByteString(index);
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

         for(int i = 0; i < this.records_.size(); ++i) {
            GeneratedMessageV3.writeString(output, 2, this.records_.getRaw(i));
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

            int dataSize = 0;

            for(int i = 0; i < this.records_.size(); ++i) {
               dataSize += computeStringSizeNoTag(this.records_.getRaw(i));
            }

            size += dataSize;
            size += 1 * this.getRecordsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_LuckDrawRecord_11464)) {
            return super.equals(obj);
         } else {
            CR2S_LuckDrawRecord_11464 other = (CR2S_LuckDrawRecord_11464)obj;
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

      public static CR2S_LuckDrawRecord_11464 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_LuckDrawRecord_11464)PARSER.parseFrom(data);
      }

      public static CR2S_LuckDrawRecord_11464 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_LuckDrawRecord_11464)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_LuckDrawRecord_11464 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_LuckDrawRecord_11464)PARSER.parseFrom(data);
      }

      public static CR2S_LuckDrawRecord_11464 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_LuckDrawRecord_11464)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_LuckDrawRecord_11464 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_LuckDrawRecord_11464)PARSER.parseFrom(data);
      }

      public static CR2S_LuckDrawRecord_11464 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_LuckDrawRecord_11464)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_LuckDrawRecord_11464 parseFrom(InputStream input) throws IOException {
         return (CR2S_LuckDrawRecord_11464)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_LuckDrawRecord_11464 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_LuckDrawRecord_11464)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_LuckDrawRecord_11464 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_LuckDrawRecord_11464)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_LuckDrawRecord_11464 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_LuckDrawRecord_11464)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_LuckDrawRecord_11464 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_LuckDrawRecord_11464)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_LuckDrawRecord_11464 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_LuckDrawRecord_11464)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_LuckDrawRecord_11464 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_LuckDrawRecord_11464 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_LuckDrawRecord_11464> parser() {
         return PARSER;
      }

      public Parser<CR2S_LuckDrawRecord_11464> getParserForType() {
         return PARSER;
      }

      public CR2S_LuckDrawRecord_11464 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_LuckDrawRecord_11464OrBuilder {
         private int bitField0_;
         private int playerId_;
         private LazyStringList records_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_LuckDrawRecord_11464_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_LuckDrawRecord_11464_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_LuckDrawRecord_11464.class, Builder.class);
         }

         private Builder() {
            this.records_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.records_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.CR2S_LuckDrawRecord_11464.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.records_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_LuckDrawRecord_11464_descriptor;
         }

         public CR2S_LuckDrawRecord_11464 getDefaultInstanceForType() {
            return CrossCountryWarMsg.CR2S_LuckDrawRecord_11464.getDefaultInstance();
         }

         public CR2S_LuckDrawRecord_11464 build() {
            CR2S_LuckDrawRecord_11464 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_LuckDrawRecord_11464 buildPartial() {
            CR2S_LuckDrawRecord_11464 result = new CR2S_LuckDrawRecord_11464(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.records_ = this.records_.getUnmodifiableView();
               this.bitField0_ &= -3;
            }

            result.records_ = this.records_;
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
            if (other instanceof CR2S_LuckDrawRecord_11464) {
               return this.mergeFrom((CR2S_LuckDrawRecord_11464)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_LuckDrawRecord_11464 other) {
            if (other == CrossCountryWarMsg.CR2S_LuckDrawRecord_11464.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

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

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPlayerId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_LuckDrawRecord_11464 parsedMessage = null;

            try {
               parsedMessage = (CR2S_LuckDrawRecord_11464)CrossCountryWarMsg.CR2S_LuckDrawRecord_11464.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_LuckDrawRecord_11464)e.getUnfinishedMessage();
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
               this.records_ = new LazyStringArrayList(this.records_);
               this.bitField0_ |= 2;
            }

         }

         public ProtocolStringList getRecordsList() {
            return this.records_.getUnmodifiableView();
         }

         public int getRecordsCount() {
            return this.records_.size();
         }

         public String getRecords(int index) {
            return (String)this.records_.get(index);
         }

         public ByteString getRecordsBytes(int index) {
            return this.records_.getByteString(index);
         }

         public Builder setRecords(int index, String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRecordsIsMutable();
               this.records_.set(index, value);
               this.onChanged();
               return this;
            }
         }

         public Builder addRecords(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRecordsIsMutable();
               this.records_.add(value);
               this.onChanged();
               return this;
            }
         }

         public Builder addAllRecords(Iterable<String> values) {
            this.ensureRecordsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.records_);
            this.onChanged();
            return this;
         }

         public Builder clearRecords() {
            this.records_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public Builder addRecordsBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRecordsIsMutable();
               this.records_.add(value);
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

   public static final class S2CR_BuyItem_11467 extends GeneratedMessageV3 implements S2CR_BuyItem_11467OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final S2CR_BuyItem_11467 DEFAULT_INSTANCE = new S2CR_BuyItem_11467();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_BuyItem_11467> PARSER = new AbstractParser<S2CR_BuyItem_11467>() {
         public S2CR_BuyItem_11467 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_BuyItem_11467(input, extensionRegistry);
         }
      };

      private S2CR_BuyItem_11467(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_BuyItem_11467() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_BuyItem_11467();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_BuyItem_11467(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_BuyItem_11467_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_BuyItem_11467_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_BuyItem_11467.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
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
         } else if (!this.hasId()) {
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
            output.writeInt32(1, this.id_);
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
               size += CodedOutputStream.computeInt32Size(1, this.id_);
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
         } else if (!(obj instanceof S2CR_BuyItem_11467)) {
            return super.equals(obj);
         } else {
            S2CR_BuyItem_11467 other = (S2CR_BuyItem_11467)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
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
            if (this.hasId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getId();
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

      public static S2CR_BuyItem_11467 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_BuyItem_11467)PARSER.parseFrom(data);
      }

      public static S2CR_BuyItem_11467 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BuyItem_11467)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BuyItem_11467 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_BuyItem_11467)PARSER.parseFrom(data);
      }

      public static S2CR_BuyItem_11467 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BuyItem_11467)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BuyItem_11467 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_BuyItem_11467)PARSER.parseFrom(data);
      }

      public static S2CR_BuyItem_11467 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BuyItem_11467)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BuyItem_11467 parseFrom(InputStream input) throws IOException {
         return (S2CR_BuyItem_11467)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_BuyItem_11467 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BuyItem_11467)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_BuyItem_11467 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_BuyItem_11467)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_BuyItem_11467 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BuyItem_11467)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_BuyItem_11467 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_BuyItem_11467)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_BuyItem_11467 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BuyItem_11467)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_BuyItem_11467 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_BuyItem_11467 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_BuyItem_11467> parser() {
         return PARSER;
      }

      public Parser<S2CR_BuyItem_11467> getParserForType() {
         return PARSER;
      }

      public S2CR_BuyItem_11467 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_BuyItem_11467OrBuilder {
         private int bitField0_;
         private int id_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_BuyItem_11467_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_BuyItem_11467_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_BuyItem_11467.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.S2CR_BuyItem_11467.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_BuyItem_11467_descriptor;
         }

         public S2CR_BuyItem_11467 getDefaultInstanceForType() {
            return CrossCountryWarMsg.S2CR_BuyItem_11467.getDefaultInstance();
         }

         public S2CR_BuyItem_11467 build() {
            S2CR_BuyItem_11467 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_BuyItem_11467 buildPartial() {
            S2CR_BuyItem_11467 result = new S2CR_BuyItem_11467(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

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
            if (other instanceof S2CR_BuyItem_11467) {
               return this.mergeFrom((S2CR_BuyItem_11467)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_BuyItem_11467 other) {
            if (other == CrossCountryWarMsg.S2CR_BuyItem_11467.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
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
            if (!this.hasId()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_BuyItem_11467 parsedMessage = null;

            try {
               parsedMessage = (S2CR_BuyItem_11467)CrossCountryWarMsg.S2CR_BuyItem_11467.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_BuyItem_11467)e.getUnfinishedMessage();
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

   public static final class PlayerRewardInfo extends GeneratedMessageV3 implements PlayerRewardInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int RANK_FIELD_NUMBER = 2;
      private int rank_;
      private byte memoizedIsInitialized;
      private static final PlayerRewardInfo DEFAULT_INSTANCE = new PlayerRewardInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<PlayerRewardInfo> PARSER = new AbstractParser<PlayerRewardInfo>() {
         public PlayerRewardInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new PlayerRewardInfo(input, extensionRegistry);
         }
      };

      private PlayerRewardInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private PlayerRewardInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new PlayerRewardInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private PlayerRewardInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.rank_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_PlayerRewardInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_PlayerRewardInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerRewardInfo.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasRank() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRank() {
         return this.rank_;
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
         } else if (!this.hasRank()) {
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
            output.writeInt32(2, this.rank_);
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
               size += CodedOutputStream.computeInt32Size(2, this.rank_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof PlayerRewardInfo)) {
            return super.equals(obj);
         } else {
            PlayerRewardInfo other = (PlayerRewardInfo)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
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

            if (this.hasRank()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRank();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static PlayerRewardInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (PlayerRewardInfo)PARSER.parseFrom(data);
      }

      public static PlayerRewardInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PlayerRewardInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PlayerRewardInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (PlayerRewardInfo)PARSER.parseFrom(data);
      }

      public static PlayerRewardInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PlayerRewardInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PlayerRewardInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (PlayerRewardInfo)PARSER.parseFrom(data);
      }

      public static PlayerRewardInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PlayerRewardInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PlayerRewardInfo parseFrom(InputStream input) throws IOException {
         return (PlayerRewardInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PlayerRewardInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PlayerRewardInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static PlayerRewardInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (PlayerRewardInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static PlayerRewardInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PlayerRewardInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static PlayerRewardInfo parseFrom(CodedInputStream input) throws IOException {
         return (PlayerRewardInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PlayerRewardInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PlayerRewardInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(PlayerRewardInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static PlayerRewardInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<PlayerRewardInfo> parser() {
         return PARSER;
      }

      public Parser<PlayerRewardInfo> getParserForType() {
         return PARSER;
      }

      public PlayerRewardInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerRewardInfoOrBuilder {
         private int bitField0_;
         private int playerId_;
         private int rank_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_PlayerRewardInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_PlayerRewardInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerRewardInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.PlayerRewardInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.rank_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_PlayerRewardInfo_descriptor;
         }

         public PlayerRewardInfo getDefaultInstanceForType() {
            return CrossCountryWarMsg.PlayerRewardInfo.getDefaultInstance();
         }

         public PlayerRewardInfo build() {
            PlayerRewardInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public PlayerRewardInfo buildPartial() {
            PlayerRewardInfo result = new PlayerRewardInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.rank_ = this.rank_;
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
            if (other instanceof PlayerRewardInfo) {
               return this.mergeFrom((PlayerRewardInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(PlayerRewardInfo other) {
            if (other == CrossCountryWarMsg.PlayerRewardInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasRank()) {
                  this.setRank(other.getRank());
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
               return this.hasRank();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            PlayerRewardInfo parsedMessage = null;

            try {
               parsedMessage = (PlayerRewardInfo)CrossCountryWarMsg.PlayerRewardInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (PlayerRewardInfo)e.getUnfinishedMessage();
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

         public boolean hasRank() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRank() {
            return this.rank_;
         }

         public Builder setRank(int value) {
            this.bitField0_ |= 2;
            this.rank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRank() {
            this.bitField0_ &= -3;
            this.rank_ = 0;
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

   public static final class RewardInfo extends GeneratedMessageV3 implements RewardInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int INFOS_FIELD_NUMBER = 2;
      private List<PlayerRewardInfo> infos_;
      private byte memoizedIsInitialized;
      private static final RewardInfo DEFAULT_INSTANCE = new RewardInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<RewardInfo> PARSER = new AbstractParser<RewardInfo>() {
         public RewardInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RewardInfo(input, extensionRegistry);
         }
      };

      private RewardInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RewardInfo() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RewardInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RewardInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.infos_.add(input.readMessage(CrossCountryWarMsg.PlayerRewardInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_RewardInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_RewardInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RewardInfo.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public List<PlayerRewardInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends PlayerRewardInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public PlayerRewardInfo getInfos(int index) {
         return (PlayerRewardInfo)this.infos_.get(index);
      }

      public PlayerRewardInfoOrBuilder getInfosOrBuilder(int index) {
         return (PlayerRewardInfoOrBuilder)this.infos_.get(index);
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
            output.writeInt32(1, this.type_);
         }

         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.infos_.get(i));
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

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.infos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RewardInfo)) {
            return super.equals(obj);
         } else {
            RewardInfo other = (RewardInfo)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (!this.getInfosList().equals(other.getInfosList())) {
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

            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RewardInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RewardInfo)PARSER.parseFrom(data);
      }

      public static RewardInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RewardInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RewardInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RewardInfo)PARSER.parseFrom(data);
      }

      public static RewardInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RewardInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RewardInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RewardInfo)PARSER.parseFrom(data);
      }

      public static RewardInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RewardInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RewardInfo parseFrom(InputStream input) throws IOException {
         return (RewardInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RewardInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RewardInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RewardInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (RewardInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RewardInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RewardInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RewardInfo parseFrom(CodedInputStream input) throws IOException {
         return (RewardInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RewardInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RewardInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RewardInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RewardInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RewardInfo> parser() {
         return PARSER;
      }

      public Parser<RewardInfo> getParserForType() {
         return PARSER;
      }

      public RewardInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RewardInfoOrBuilder {
         private int bitField0_;
         private int type_;
         private List<PlayerRewardInfo> infos_;
         private RepeatedFieldBuilderV3<PlayerRewardInfo, PlayerRewardInfo.Builder, PlayerRewardInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_RewardInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_RewardInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RewardInfo.class, Builder.class);
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
            if (CrossCountryWarMsg.RewardInfo.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_RewardInfo_descriptor;
         }

         public RewardInfo getDefaultInstanceForType() {
            return CrossCountryWarMsg.RewardInfo.getDefaultInstance();
         }

         public RewardInfo build() {
            RewardInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RewardInfo buildPartial() {
            RewardInfo result = new RewardInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -3;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
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
            if (other instanceof RewardInfo) {
               return this.mergeFrom((RewardInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RewardInfo other) {
            if (other == CrossCountryWarMsg.RewardInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -3;
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
                     this.bitField0_ &= -3;
                     this.infosBuilder_ = CrossCountryWarMsg.RewardInfo.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
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
            if (!this.hasType()) {
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
            RewardInfo parsedMessage = null;

            try {
               parsedMessage = (RewardInfo)CrossCountryWarMsg.RewardInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RewardInfo)e.getUnfinishedMessage();
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

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 2;
            }

         }

         public List<PlayerRewardInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public PlayerRewardInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (PlayerRewardInfo)this.infos_.get(index) : (PlayerRewardInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, PlayerRewardInfo value) {
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

         public Builder setInfos(int index, PlayerRewardInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(PlayerRewardInfo value) {
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

         public Builder addInfos(int index, PlayerRewardInfo value) {
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

         public Builder addInfos(PlayerRewardInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, PlayerRewardInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends PlayerRewardInfo> values) {
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
               this.bitField0_ &= -3;
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

         public PlayerRewardInfo.Builder getInfosBuilder(int index) {
            return (PlayerRewardInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public PlayerRewardInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (PlayerRewardInfoOrBuilder)this.infos_.get(index) : (PlayerRewardInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends PlayerRewardInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public PlayerRewardInfo.Builder addInfosBuilder() {
            return (PlayerRewardInfo.Builder)this.getInfosFieldBuilder().addBuilder(CrossCountryWarMsg.PlayerRewardInfo.getDefaultInstance());
         }

         public PlayerRewardInfo.Builder addInfosBuilder(int index) {
            return (PlayerRewardInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, CrossCountryWarMsg.PlayerRewardInfo.getDefaultInstance());
         }

         public List<PlayerRewardInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PlayerRewardInfo, PlayerRewardInfo.Builder, PlayerRewardInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class CR2S_SeasonReward_11468 extends GeneratedMessageV3 implements CR2S_SeasonReward_11468OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int COUNTRYRANK_FIELD_NUMBER = 1;
      private int countryRank_;
      public static final int PLAYERS_FIELD_NUMBER = 2;
      private Internal.IntList players_;
      public static final int REWARDINFOS_FIELD_NUMBER = 3;
      private List<RewardInfo> rewardInfos_;
      public static final int SENDTYPE_FIELD_NUMBER = 4;
      private int sendType_;
      private byte memoizedIsInitialized;
      private static final CR2S_SeasonReward_11468 DEFAULT_INSTANCE = new CR2S_SeasonReward_11468();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_SeasonReward_11468> PARSER = new AbstractParser<CR2S_SeasonReward_11468>() {
         public CR2S_SeasonReward_11468 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_SeasonReward_11468(input, extensionRegistry);
         }
      };

      private CR2S_SeasonReward_11468(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_SeasonReward_11468() {
         this.memoizedIsInitialized = -1;
         this.players_ = emptyIntList();
         this.rewardInfos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_SeasonReward_11468();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_SeasonReward_11468(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.countryRank_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.players_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.players_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.players_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.rewardInfos_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.rewardInfos_.add(input.readMessage(CrossCountryWarMsg.RewardInfo.PARSER, extensionRegistry));
                        continue;
                     case 32:
                        this.bitField0_ |= 2;
                        this.sendType_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.players_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.players_.makeImmutable();
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.rewardInfos_ = Collections.unmodifiableList(this.rewardInfos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_SeasonReward_11468_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_SeasonReward_11468_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_SeasonReward_11468.class, Builder.class);
      }

      public boolean hasCountryRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCountryRank() {
         return this.countryRank_;
      }

      public List<Integer> getPlayersList() {
         return this.players_;
      }

      public int getPlayersCount() {
         return this.players_.size();
      }

      public int getPlayers(int index) {
         return this.players_.getInt(index);
      }

      public List<RewardInfo> getRewardInfosList() {
         return this.rewardInfos_;
      }

      public List<? extends RewardInfoOrBuilder> getRewardInfosOrBuilderList() {
         return this.rewardInfos_;
      }

      public int getRewardInfosCount() {
         return this.rewardInfos_.size();
      }

      public RewardInfo getRewardInfos(int index) {
         return (RewardInfo)this.rewardInfos_.get(index);
      }

      public RewardInfoOrBuilder getRewardInfosOrBuilder(int index) {
         return (RewardInfoOrBuilder)this.rewardInfos_.get(index);
      }

      public boolean hasSendType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSendType() {
         return this.sendType_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCountryRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRewardInfosCount(); ++i) {
               if (!this.getRewardInfos(i).isInitialized()) {
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
            output.writeInt32(1, this.countryRank_);
         }

         for(int i = 0; i < this.players_.size(); ++i) {
            output.writeInt32(2, this.players_.getInt(i));
         }

         for(int i = 0; i < this.rewardInfos_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.rewardInfos_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(4, this.sendType_);
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
               size += CodedOutputStream.computeInt32Size(1, this.countryRank_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.players_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.players_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPlayersList().size();

            for(int i = 0; i < this.rewardInfos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.rewardInfos_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.sendType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_SeasonReward_11468)) {
            return super.equals(obj);
         } else {
            CR2S_SeasonReward_11468 other = (CR2S_SeasonReward_11468)obj;
            if (this.hasCountryRank() != other.hasCountryRank()) {
               return false;
            } else if (this.hasCountryRank() && this.getCountryRank() != other.getCountryRank()) {
               return false;
            } else if (!this.getPlayersList().equals(other.getPlayersList())) {
               return false;
            } else if (!this.getRewardInfosList().equals(other.getRewardInfosList())) {
               return false;
            } else if (this.hasSendType() != other.hasSendType()) {
               return false;
            } else if (this.hasSendType() && this.getSendType() != other.getSendType()) {
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
            if (this.hasCountryRank()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCountryRank();
            }

            if (this.getPlayersCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayersList().hashCode();
            }

            if (this.getRewardInfosCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRewardInfosList().hashCode();
            }

            if (this.hasSendType()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSendType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_SeasonReward_11468 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_SeasonReward_11468)PARSER.parseFrom(data);
      }

      public static CR2S_SeasonReward_11468 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_SeasonReward_11468)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_SeasonReward_11468 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_SeasonReward_11468)PARSER.parseFrom(data);
      }

      public static CR2S_SeasonReward_11468 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_SeasonReward_11468)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_SeasonReward_11468 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_SeasonReward_11468)PARSER.parseFrom(data);
      }

      public static CR2S_SeasonReward_11468 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_SeasonReward_11468)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_SeasonReward_11468 parseFrom(InputStream input) throws IOException {
         return (CR2S_SeasonReward_11468)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_SeasonReward_11468 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_SeasonReward_11468)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_SeasonReward_11468 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_SeasonReward_11468)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_SeasonReward_11468 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_SeasonReward_11468)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_SeasonReward_11468 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_SeasonReward_11468)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_SeasonReward_11468 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_SeasonReward_11468)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_SeasonReward_11468 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_SeasonReward_11468 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_SeasonReward_11468> parser() {
         return PARSER;
      }

      public Parser<CR2S_SeasonReward_11468> getParserForType() {
         return PARSER;
      }

      public CR2S_SeasonReward_11468 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_SeasonReward_11468OrBuilder {
         private int bitField0_;
         private int countryRank_;
         private Internal.IntList players_;
         private List<RewardInfo> rewardInfos_;
         private RepeatedFieldBuilderV3<RewardInfo, RewardInfo.Builder, RewardInfoOrBuilder> rewardInfosBuilder_;
         private int sendType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_SeasonReward_11468_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_SeasonReward_11468_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_SeasonReward_11468.class, Builder.class);
         }

         private Builder() {
            this.players_ = CrossCountryWarMsg.CR2S_SeasonReward_11468.emptyIntList();
            this.rewardInfos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.players_ = CrossCountryWarMsg.CR2S_SeasonReward_11468.emptyIntList();
            this.rewardInfos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.CR2S_SeasonReward_11468.alwaysUseFieldBuilders) {
               this.getRewardInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.countryRank_ = 0;
            this.bitField0_ &= -2;
            this.players_ = CrossCountryWarMsg.CR2S_SeasonReward_11468.emptyIntList();
            this.bitField0_ &= -3;
            if (this.rewardInfosBuilder_ == null) {
               this.rewardInfos_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.rewardInfosBuilder_.clear();
            }

            this.sendType_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_SeasonReward_11468_descriptor;
         }

         public CR2S_SeasonReward_11468 getDefaultInstanceForType() {
            return CrossCountryWarMsg.CR2S_SeasonReward_11468.getDefaultInstance();
         }

         public CR2S_SeasonReward_11468 build() {
            CR2S_SeasonReward_11468 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_SeasonReward_11468 buildPartial() {
            CR2S_SeasonReward_11468 result = new CR2S_SeasonReward_11468(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.countryRank_ = this.countryRank_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.players_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.players_ = this.players_;
            if (this.rewardInfosBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.rewardInfos_ = Collections.unmodifiableList(this.rewardInfos_);
                  this.bitField0_ &= -5;
               }

               result.rewardInfos_ = this.rewardInfos_;
            } else {
               result.rewardInfos_ = this.rewardInfosBuilder_.build();
            }

            if ((from_bitField0_ & 8) != 0) {
               result.sendType_ = this.sendType_;
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
            if (other instanceof CR2S_SeasonReward_11468) {
               return this.mergeFrom((CR2S_SeasonReward_11468)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_SeasonReward_11468 other) {
            if (other == CrossCountryWarMsg.CR2S_SeasonReward_11468.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCountryRank()) {
                  this.setCountryRank(other.getCountryRank());
               }

               if (!other.players_.isEmpty()) {
                  if (this.players_.isEmpty()) {
                     this.players_ = other.players_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensurePlayersIsMutable();
                     this.players_.addAll(other.players_);
                  }

                  this.onChanged();
               }

               if (this.rewardInfosBuilder_ == null) {
                  if (!other.rewardInfos_.isEmpty()) {
                     if (this.rewardInfos_.isEmpty()) {
                        this.rewardInfos_ = other.rewardInfos_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureRewardInfosIsMutable();
                        this.rewardInfos_.addAll(other.rewardInfos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.rewardInfos_.isEmpty()) {
                  if (this.rewardInfosBuilder_.isEmpty()) {
                     this.rewardInfosBuilder_.dispose();
                     this.rewardInfosBuilder_ = null;
                     this.rewardInfos_ = other.rewardInfos_;
                     this.bitField0_ &= -5;
                     this.rewardInfosBuilder_ = CrossCountryWarMsg.CR2S_SeasonReward_11468.alwaysUseFieldBuilders ? this.getRewardInfosFieldBuilder() : null;
                  } else {
                     this.rewardInfosBuilder_.addAllMessages(other.rewardInfos_);
                  }
               }

               if (other.hasSendType()) {
                  this.setSendType(other.getSendType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCountryRank()) {
               return false;
            } else {
               for(int i = 0; i < this.getRewardInfosCount(); ++i) {
                  if (!this.getRewardInfos(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_SeasonReward_11468 parsedMessage = null;

            try {
               parsedMessage = (CR2S_SeasonReward_11468)CrossCountryWarMsg.CR2S_SeasonReward_11468.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_SeasonReward_11468)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCountryRank() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCountryRank() {
            return this.countryRank_;
         }

         public Builder setCountryRank(int value) {
            this.bitField0_ |= 1;
            this.countryRank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCountryRank() {
            this.bitField0_ &= -2;
            this.countryRank_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePlayersIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.players_ = CrossCountryWarMsg.CR2S_SeasonReward_11468.mutableCopy(this.players_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getPlayersList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.players_) : this.players_);
         }

         public int getPlayersCount() {
            return this.players_.size();
         }

         public int getPlayers(int index) {
            return this.players_.getInt(index);
         }

         public Builder setPlayers(int index, int value) {
            this.ensurePlayersIsMutable();
            this.players_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPlayers(int value) {
            this.ensurePlayersIsMutable();
            this.players_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPlayers(Iterable<? extends Integer> values) {
            this.ensurePlayersIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.players_);
            this.onChanged();
            return this;
         }

         public Builder clearPlayers() {
            this.players_ = CrossCountryWarMsg.CR2S_SeasonReward_11468.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         private void ensureRewardInfosIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.rewardInfos_ = new ArrayList(this.rewardInfos_);
               this.bitField0_ |= 4;
            }

         }

         public List<RewardInfo> getRewardInfosList() {
            return this.rewardInfosBuilder_ == null ? Collections.unmodifiableList(this.rewardInfos_) : this.rewardInfosBuilder_.getMessageList();
         }

         public int getRewardInfosCount() {
            return this.rewardInfosBuilder_ == null ? this.rewardInfos_.size() : this.rewardInfosBuilder_.getCount();
         }

         public RewardInfo getRewardInfos(int index) {
            return this.rewardInfosBuilder_ == null ? (RewardInfo)this.rewardInfos_.get(index) : (RewardInfo)this.rewardInfosBuilder_.getMessage(index);
         }

         public Builder setRewardInfos(int index, RewardInfo value) {
            if (this.rewardInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardInfosIsMutable();
               this.rewardInfos_.set(index, value);
               this.onChanged();
            } else {
               this.rewardInfosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRewardInfos(int index, RewardInfo.Builder builderForValue) {
            if (this.rewardInfosBuilder_ == null) {
               this.ensureRewardInfosIsMutable();
               this.rewardInfos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardInfosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRewardInfos(RewardInfo value) {
            if (this.rewardInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardInfosIsMutable();
               this.rewardInfos_.add(value);
               this.onChanged();
            } else {
               this.rewardInfosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRewardInfos(int index, RewardInfo value) {
            if (this.rewardInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardInfosIsMutable();
               this.rewardInfos_.add(index, value);
               this.onChanged();
            } else {
               this.rewardInfosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRewardInfos(RewardInfo.Builder builderForValue) {
            if (this.rewardInfosBuilder_ == null) {
               this.ensureRewardInfosIsMutable();
               this.rewardInfos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rewardInfosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRewardInfos(int index, RewardInfo.Builder builderForValue) {
            if (this.rewardInfosBuilder_ == null) {
               this.ensureRewardInfosIsMutable();
               this.rewardInfos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardInfosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRewardInfos(Iterable<? extends RewardInfo> values) {
            if (this.rewardInfosBuilder_ == null) {
               this.ensureRewardInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rewardInfos_);
               this.onChanged();
            } else {
               this.rewardInfosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRewardInfos() {
            if (this.rewardInfosBuilder_ == null) {
               this.rewardInfos_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.rewardInfosBuilder_.clear();
            }

            return this;
         }

         public Builder removeRewardInfos(int index) {
            if (this.rewardInfosBuilder_ == null) {
               this.ensureRewardInfosIsMutable();
               this.rewardInfos_.remove(index);
               this.onChanged();
            } else {
               this.rewardInfosBuilder_.remove(index);
            }

            return this;
         }

         public RewardInfo.Builder getRewardInfosBuilder(int index) {
            return (RewardInfo.Builder)this.getRewardInfosFieldBuilder().getBuilder(index);
         }

         public RewardInfoOrBuilder getRewardInfosOrBuilder(int index) {
            return this.rewardInfosBuilder_ == null ? (RewardInfoOrBuilder)this.rewardInfos_.get(index) : (RewardInfoOrBuilder)this.rewardInfosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RewardInfoOrBuilder> getRewardInfosOrBuilderList() {
            return this.rewardInfosBuilder_ != null ? this.rewardInfosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rewardInfos_);
         }

         public RewardInfo.Builder addRewardInfosBuilder() {
            return (RewardInfo.Builder)this.getRewardInfosFieldBuilder().addBuilder(CrossCountryWarMsg.RewardInfo.getDefaultInstance());
         }

         public RewardInfo.Builder addRewardInfosBuilder(int index) {
            return (RewardInfo.Builder)this.getRewardInfosFieldBuilder().addBuilder(index, CrossCountryWarMsg.RewardInfo.getDefaultInstance());
         }

         public List<RewardInfo.Builder> getRewardInfosBuilderList() {
            return this.getRewardInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RewardInfo, RewardInfo.Builder, RewardInfoOrBuilder> getRewardInfosFieldBuilder() {
            if (this.rewardInfosBuilder_ == null) {
               this.rewardInfosBuilder_ = new RepeatedFieldBuilderV3(this.rewardInfos_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.rewardInfos_ = null;
            }

            return this.rewardInfosBuilder_;
         }

         public boolean hasSendType() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getSendType() {
            return this.sendType_;
         }

         public Builder setSendType(int value) {
            this.bitField0_ |= 8;
            this.sendType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSendType() {
            this.bitField0_ &= -9;
            this.sendType_ = 0;
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

   public static final class PlayerReward extends GeneratedMessageV3 implements PlayerRewardOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int ITEMINFOS_FIELD_NUMBER = 2;
      private List<CommonMsg.ItemInfo> itemInfos_;
      private byte memoizedIsInitialized;
      private static final PlayerReward DEFAULT_INSTANCE = new PlayerReward();
      /** @deprecated */
      @Deprecated
      public static final Parser<PlayerReward> PARSER = new AbstractParser<PlayerReward>() {
         public PlayerReward parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new PlayerReward(input, extensionRegistry);
         }
      };

      private PlayerReward(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private PlayerReward() {
         this.memoizedIsInitialized = -1;
         this.itemInfos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new PlayerReward();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private PlayerReward(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.itemInfos_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.itemInfos_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.itemInfos_ = Collections.unmodifiableList(this.itemInfos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_PlayerReward_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_PlayerReward_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerReward.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public List<CommonMsg.ItemInfo> getItemInfosList() {
         return this.itemInfos_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getItemInfosOrBuilderList() {
         return this.itemInfos_;
      }

      public int getItemInfosCount() {
         return this.itemInfos_.size();
      }

      public CommonMsg.ItemInfo getItemInfos(int index) {
         return (CommonMsg.ItemInfo)this.itemInfos_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getItemInfosOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.itemInfos_.get(index);
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
            for(int i = 0; i < this.getItemInfosCount(); ++i) {
               if (!this.getItemInfos(i).isInitialized()) {
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

         for(int i = 0; i < this.itemInfos_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.itemInfos_.get(i));
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

            for(int i = 0; i < this.itemInfos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.itemInfos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof PlayerReward)) {
            return super.equals(obj);
         } else {
            PlayerReward other = (PlayerReward)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (!this.getItemInfosList().equals(other.getItemInfosList())) {
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

            if (this.getItemInfosCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static PlayerReward parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (PlayerReward)PARSER.parseFrom(data);
      }

      public static PlayerReward parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PlayerReward)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PlayerReward parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (PlayerReward)PARSER.parseFrom(data);
      }

      public static PlayerReward parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PlayerReward)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PlayerReward parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (PlayerReward)PARSER.parseFrom(data);
      }

      public static PlayerReward parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PlayerReward)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PlayerReward parseFrom(InputStream input) throws IOException {
         return (PlayerReward)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PlayerReward parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PlayerReward)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static PlayerReward parseDelimitedFrom(InputStream input) throws IOException {
         return (PlayerReward)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static PlayerReward parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PlayerReward)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static PlayerReward parseFrom(CodedInputStream input) throws IOException {
         return (PlayerReward)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PlayerReward parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PlayerReward)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(PlayerReward prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static PlayerReward getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<PlayerReward> parser() {
         return PARSER;
      }

      public Parser<PlayerReward> getParserForType() {
         return PARSER;
      }

      public PlayerReward getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerRewardOrBuilder {
         private int bitField0_;
         private int playerId_;
         private List<CommonMsg.ItemInfo> itemInfos_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemInfosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_PlayerReward_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_PlayerReward_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerReward.class, Builder.class);
         }

         private Builder() {
            this.itemInfos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.itemInfos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.PlayerReward.alwaysUseFieldBuilders) {
               this.getItemInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            if (this.itemInfosBuilder_ == null) {
               this.itemInfos_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.itemInfosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_PlayerReward_descriptor;
         }

         public PlayerReward getDefaultInstanceForType() {
            return CrossCountryWarMsg.PlayerReward.getDefaultInstance();
         }

         public PlayerReward build() {
            PlayerReward result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public PlayerReward buildPartial() {
            PlayerReward result = new PlayerReward(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if (this.itemInfosBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.itemInfos_ = Collections.unmodifiableList(this.itemInfos_);
                  this.bitField0_ &= -3;
               }

               result.itemInfos_ = this.itemInfos_;
            } else {
               result.itemInfos_ = this.itemInfosBuilder_.build();
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
            if (other instanceof PlayerReward) {
               return this.mergeFrom((PlayerReward)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(PlayerReward other) {
            if (other == CrossCountryWarMsg.PlayerReward.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (this.itemInfosBuilder_ == null) {
                  if (!other.itemInfos_.isEmpty()) {
                     if (this.itemInfos_.isEmpty()) {
                        this.itemInfos_ = other.itemInfos_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureItemInfosIsMutable();
                        this.itemInfos_.addAll(other.itemInfos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.itemInfos_.isEmpty()) {
                  if (this.itemInfosBuilder_.isEmpty()) {
                     this.itemInfosBuilder_.dispose();
                     this.itemInfosBuilder_ = null;
                     this.itemInfos_ = other.itemInfos_;
                     this.bitField0_ &= -3;
                     this.itemInfosBuilder_ = CrossCountryWarMsg.PlayerReward.alwaysUseFieldBuilders ? this.getItemInfosFieldBuilder() : null;
                  } else {
                     this.itemInfosBuilder_.addAllMessages(other.itemInfos_);
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
               for(int i = 0; i < this.getItemInfosCount(); ++i) {
                  if (!this.getItemInfos(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            PlayerReward parsedMessage = null;

            try {
               parsedMessage = (PlayerReward)CrossCountryWarMsg.PlayerReward.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (PlayerReward)e.getUnfinishedMessage();
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

         private void ensureItemInfosIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.itemInfos_ = new ArrayList(this.itemInfos_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.ItemInfo> getItemInfosList() {
            return this.itemInfosBuilder_ == null ? Collections.unmodifiableList(this.itemInfos_) : this.itemInfosBuilder_.getMessageList();
         }

         public int getItemInfosCount() {
            return this.itemInfosBuilder_ == null ? this.itemInfos_.size() : this.itemInfosBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getItemInfos(int index) {
            return this.itemInfosBuilder_ == null ? (CommonMsg.ItemInfo)this.itemInfos_.get(index) : (CommonMsg.ItemInfo)this.itemInfosBuilder_.getMessage(index);
         }

         public Builder setItemInfos(int index, CommonMsg.ItemInfo value) {
            if (this.itemInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemInfosIsMutable();
               this.itemInfos_.set(index, value);
               this.onChanged();
            } else {
               this.itemInfosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setItemInfos(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemInfosBuilder_ == null) {
               this.ensureItemInfosIsMutable();
               this.itemInfos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemInfosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addItemInfos(CommonMsg.ItemInfo value) {
            if (this.itemInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemInfosIsMutable();
               this.itemInfos_.add(value);
               this.onChanged();
            } else {
               this.itemInfosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addItemInfos(int index, CommonMsg.ItemInfo value) {
            if (this.itemInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemInfosIsMutable();
               this.itemInfos_.add(index, value);
               this.onChanged();
            } else {
               this.itemInfosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addItemInfos(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemInfosBuilder_ == null) {
               this.ensureItemInfosIsMutable();
               this.itemInfos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.itemInfosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addItemInfos(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemInfosBuilder_ == null) {
               this.ensureItemInfosIsMutable();
               this.itemInfos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemInfosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllItemInfos(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.itemInfosBuilder_ == null) {
               this.ensureItemInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.itemInfos_);
               this.onChanged();
            } else {
               this.itemInfosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearItemInfos() {
            if (this.itemInfosBuilder_ == null) {
               this.itemInfos_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.itemInfosBuilder_.clear();
            }

            return this;
         }

         public Builder removeItemInfos(int index) {
            if (this.itemInfosBuilder_ == null) {
               this.ensureItemInfosIsMutable();
               this.itemInfos_.remove(index);
               this.onChanged();
            } else {
               this.itemInfosBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getItemInfosBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemInfosFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getItemInfosOrBuilder(int index) {
            return this.itemInfosBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.itemInfos_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.itemInfosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getItemInfosOrBuilderList() {
            return this.itemInfosBuilder_ != null ? this.itemInfosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.itemInfos_);
         }

         public CommonMsg.ItemInfo.Builder addItemInfosBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getItemInfosFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addItemInfosBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemInfosFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getItemInfosBuilderList() {
            return this.getItemInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getItemInfosFieldBuilder() {
            if (this.itemInfosBuilder_ == null) {
               this.itemInfosBuilder_ = new RepeatedFieldBuilderV3(this.itemInfos_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.itemInfos_ = null;
            }

            return this.itemInfosBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_SeasonCityReward_11470 extends GeneratedMessageV3 implements CR2S_SeasonCityReward_11470OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int PLAYERREWARDS_FIELD_NUMBER = 1;
      private List<PlayerReward> playerRewards_;
      private byte memoizedIsInitialized;
      private static final CR2S_SeasonCityReward_11470 DEFAULT_INSTANCE = new CR2S_SeasonCityReward_11470();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_SeasonCityReward_11470> PARSER = new AbstractParser<CR2S_SeasonCityReward_11470>() {
         public CR2S_SeasonCityReward_11470 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_SeasonCityReward_11470(input, extensionRegistry);
         }
      };

      private CR2S_SeasonCityReward_11470(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_SeasonCityReward_11470() {
         this.memoizedIsInitialized = -1;
         this.playerRewards_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_SeasonCityReward_11470();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_SeasonCityReward_11470(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.playerRewards_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.playerRewards_.add(input.readMessage(CrossCountryWarMsg.PlayerReward.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.playerRewards_ = Collections.unmodifiableList(this.playerRewards_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_SeasonCityReward_11470_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_SeasonCityReward_11470_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_SeasonCityReward_11470.class, Builder.class);
      }

      public List<PlayerReward> getPlayerRewardsList() {
         return this.playerRewards_;
      }

      public List<? extends PlayerRewardOrBuilder> getPlayerRewardsOrBuilderList() {
         return this.playerRewards_;
      }

      public int getPlayerRewardsCount() {
         return this.playerRewards_.size();
      }

      public PlayerReward getPlayerRewards(int index) {
         return (PlayerReward)this.playerRewards_.get(index);
      }

      public PlayerRewardOrBuilder getPlayerRewardsOrBuilder(int index) {
         return (PlayerRewardOrBuilder)this.playerRewards_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getPlayerRewardsCount(); ++i) {
               if (!this.getPlayerRewards(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.playerRewards_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.playerRewards_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.playerRewards_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.playerRewards_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_SeasonCityReward_11470)) {
            return super.equals(obj);
         } else {
            CR2S_SeasonCityReward_11470 other = (CR2S_SeasonCityReward_11470)obj;
            if (!this.getPlayerRewardsList().equals(other.getPlayerRewardsList())) {
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
            if (this.getPlayerRewardsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerRewardsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_SeasonCityReward_11470 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_SeasonCityReward_11470)PARSER.parseFrom(data);
      }

      public static CR2S_SeasonCityReward_11470 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_SeasonCityReward_11470)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_SeasonCityReward_11470 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_SeasonCityReward_11470)PARSER.parseFrom(data);
      }

      public static CR2S_SeasonCityReward_11470 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_SeasonCityReward_11470)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_SeasonCityReward_11470 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_SeasonCityReward_11470)PARSER.parseFrom(data);
      }

      public static CR2S_SeasonCityReward_11470 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_SeasonCityReward_11470)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_SeasonCityReward_11470 parseFrom(InputStream input) throws IOException {
         return (CR2S_SeasonCityReward_11470)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_SeasonCityReward_11470 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_SeasonCityReward_11470)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_SeasonCityReward_11470 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_SeasonCityReward_11470)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_SeasonCityReward_11470 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_SeasonCityReward_11470)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_SeasonCityReward_11470 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_SeasonCityReward_11470)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_SeasonCityReward_11470 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_SeasonCityReward_11470)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_SeasonCityReward_11470 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_SeasonCityReward_11470 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_SeasonCityReward_11470> parser() {
         return PARSER;
      }

      public Parser<CR2S_SeasonCityReward_11470> getParserForType() {
         return PARSER;
      }

      public CR2S_SeasonCityReward_11470 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_SeasonCityReward_11470OrBuilder {
         private int bitField0_;
         private List<PlayerReward> playerRewards_;
         private RepeatedFieldBuilderV3<PlayerReward, PlayerReward.Builder, PlayerRewardOrBuilder> playerRewardsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_SeasonCityReward_11470_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_SeasonCityReward_11470_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_SeasonCityReward_11470.class, Builder.class);
         }

         private Builder() {
            this.playerRewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerRewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.CR2S_SeasonCityReward_11470.alwaysUseFieldBuilders) {
               this.getPlayerRewardsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.playerRewardsBuilder_ == null) {
               this.playerRewards_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.playerRewardsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_SeasonCityReward_11470_descriptor;
         }

         public CR2S_SeasonCityReward_11470 getDefaultInstanceForType() {
            return CrossCountryWarMsg.CR2S_SeasonCityReward_11470.getDefaultInstance();
         }

         public CR2S_SeasonCityReward_11470 build() {
            CR2S_SeasonCityReward_11470 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_SeasonCityReward_11470 buildPartial() {
            CR2S_SeasonCityReward_11470 result = new CR2S_SeasonCityReward_11470(this);
            int from_bitField0_ = this.bitField0_;
            if (this.playerRewardsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.playerRewards_ = Collections.unmodifiableList(this.playerRewards_);
                  this.bitField0_ &= -2;
               }

               result.playerRewards_ = this.playerRewards_;
            } else {
               result.playerRewards_ = this.playerRewardsBuilder_.build();
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
            if (other instanceof CR2S_SeasonCityReward_11470) {
               return this.mergeFrom((CR2S_SeasonCityReward_11470)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_SeasonCityReward_11470 other) {
            if (other == CrossCountryWarMsg.CR2S_SeasonCityReward_11470.getDefaultInstance()) {
               return this;
            } else {
               if (this.playerRewardsBuilder_ == null) {
                  if (!other.playerRewards_.isEmpty()) {
                     if (this.playerRewards_.isEmpty()) {
                        this.playerRewards_ = other.playerRewards_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensurePlayerRewardsIsMutable();
                        this.playerRewards_.addAll(other.playerRewards_);
                     }

                     this.onChanged();
                  }
               } else if (!other.playerRewards_.isEmpty()) {
                  if (this.playerRewardsBuilder_.isEmpty()) {
                     this.playerRewardsBuilder_.dispose();
                     this.playerRewardsBuilder_ = null;
                     this.playerRewards_ = other.playerRewards_;
                     this.bitField0_ &= -2;
                     this.playerRewardsBuilder_ = CrossCountryWarMsg.CR2S_SeasonCityReward_11470.alwaysUseFieldBuilders ? this.getPlayerRewardsFieldBuilder() : null;
                  } else {
                     this.playerRewardsBuilder_.addAllMessages(other.playerRewards_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getPlayerRewardsCount(); ++i) {
               if (!this.getPlayerRewards(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_SeasonCityReward_11470 parsedMessage = null;

            try {
               parsedMessage = (CR2S_SeasonCityReward_11470)CrossCountryWarMsg.CR2S_SeasonCityReward_11470.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_SeasonCityReward_11470)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensurePlayerRewardsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.playerRewards_ = new ArrayList(this.playerRewards_);
               this.bitField0_ |= 1;
            }

         }

         public List<PlayerReward> getPlayerRewardsList() {
            return this.playerRewardsBuilder_ == null ? Collections.unmodifiableList(this.playerRewards_) : this.playerRewardsBuilder_.getMessageList();
         }

         public int getPlayerRewardsCount() {
            return this.playerRewardsBuilder_ == null ? this.playerRewards_.size() : this.playerRewardsBuilder_.getCount();
         }

         public PlayerReward getPlayerRewards(int index) {
            return this.playerRewardsBuilder_ == null ? (PlayerReward)this.playerRewards_.get(index) : (PlayerReward)this.playerRewardsBuilder_.getMessage(index);
         }

         public Builder setPlayerRewards(int index, PlayerReward value) {
            if (this.playerRewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerRewardsIsMutable();
               this.playerRewards_.set(index, value);
               this.onChanged();
            } else {
               this.playerRewardsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPlayerRewards(int index, PlayerReward.Builder builderForValue) {
            if (this.playerRewardsBuilder_ == null) {
               this.ensurePlayerRewardsIsMutable();
               this.playerRewards_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerRewardsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPlayerRewards(PlayerReward value) {
            if (this.playerRewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerRewardsIsMutable();
               this.playerRewards_.add(value);
               this.onChanged();
            } else {
               this.playerRewardsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPlayerRewards(int index, PlayerReward value) {
            if (this.playerRewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerRewardsIsMutable();
               this.playerRewards_.add(index, value);
               this.onChanged();
            } else {
               this.playerRewardsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPlayerRewards(PlayerReward.Builder builderForValue) {
            if (this.playerRewardsBuilder_ == null) {
               this.ensurePlayerRewardsIsMutable();
               this.playerRewards_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.playerRewardsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPlayerRewards(int index, PlayerReward.Builder builderForValue) {
            if (this.playerRewardsBuilder_ == null) {
               this.ensurePlayerRewardsIsMutable();
               this.playerRewards_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerRewardsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPlayerRewards(Iterable<? extends PlayerReward> values) {
            if (this.playerRewardsBuilder_ == null) {
               this.ensurePlayerRewardsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.playerRewards_);
               this.onChanged();
            } else {
               this.playerRewardsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPlayerRewards() {
            if (this.playerRewardsBuilder_ == null) {
               this.playerRewards_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.playerRewardsBuilder_.clear();
            }

            return this;
         }

         public Builder removePlayerRewards(int index) {
            if (this.playerRewardsBuilder_ == null) {
               this.ensurePlayerRewardsIsMutable();
               this.playerRewards_.remove(index);
               this.onChanged();
            } else {
               this.playerRewardsBuilder_.remove(index);
            }

            return this;
         }

         public PlayerReward.Builder getPlayerRewardsBuilder(int index) {
            return (PlayerReward.Builder)this.getPlayerRewardsFieldBuilder().getBuilder(index);
         }

         public PlayerRewardOrBuilder getPlayerRewardsOrBuilder(int index) {
            return this.playerRewardsBuilder_ == null ? (PlayerRewardOrBuilder)this.playerRewards_.get(index) : (PlayerRewardOrBuilder)this.playerRewardsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends PlayerRewardOrBuilder> getPlayerRewardsOrBuilderList() {
            return this.playerRewardsBuilder_ != null ? this.playerRewardsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.playerRewards_);
         }

         public PlayerReward.Builder addPlayerRewardsBuilder() {
            return (PlayerReward.Builder)this.getPlayerRewardsFieldBuilder().addBuilder(CrossCountryWarMsg.PlayerReward.getDefaultInstance());
         }

         public PlayerReward.Builder addPlayerRewardsBuilder(int index) {
            return (PlayerReward.Builder)this.getPlayerRewardsFieldBuilder().addBuilder(index, CrossCountryWarMsg.PlayerReward.getDefaultInstance());
         }

         public List<PlayerReward.Builder> getPlayerRewardsBuilderList() {
            return this.getPlayerRewardsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PlayerReward, PlayerReward.Builder, PlayerRewardOrBuilder> getPlayerRewardsFieldBuilder() {
            if (this.playerRewardsBuilder_ == null) {
               this.playerRewardsBuilder_ = new RepeatedFieldBuilderV3(this.playerRewards_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.playerRewards_ = null;
            }

            return this.playerRewardsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_CountryWarGm_11471 extends GeneratedMessageV3 implements S2CR_CountryWarGm_11471OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CMD_FIELD_NUMBER = 1;
      private volatile Object cmd_;
      public static final int PARAMS_FIELD_NUMBER = 2;
      private Internal.IntList params_;
      private byte memoizedIsInitialized;
      private static final S2CR_CountryWarGm_11471 DEFAULT_INSTANCE = new S2CR_CountryWarGm_11471();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_CountryWarGm_11471> PARSER = new AbstractParser<S2CR_CountryWarGm_11471>() {
         public S2CR_CountryWarGm_11471 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_CountryWarGm_11471(input, extensionRegistry);
         }
      };

      private S2CR_CountryWarGm_11471(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_CountryWarGm_11471() {
         this.memoizedIsInitialized = -1;
         this.cmd_ = "";
         this.params_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_CountryWarGm_11471();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_CountryWarGm_11471(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.params_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.params_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.params_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.params_.addInt(input.readInt32());
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarGm_11471_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarGm_11471_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_CountryWarGm_11471.class, Builder.class);
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

      public List<Integer> getParamsList() {
         return this.params_;
      }

      public int getParamsCount() {
         return this.params_.size();
      }

      public int getParams(int index) {
         return this.params_.getInt(index);
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
            output.writeInt32(2, this.params_.getInt(i));
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
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.params_.getInt(i));
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
         } else if (!(obj instanceof S2CR_CountryWarGm_11471)) {
            return super.equals(obj);
         } else {
            S2CR_CountryWarGm_11471 other = (S2CR_CountryWarGm_11471)obj;
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

      public static S2CR_CountryWarGm_11471 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_CountryWarGm_11471)PARSER.parseFrom(data);
      }

      public static S2CR_CountryWarGm_11471 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CountryWarGm_11471)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CountryWarGm_11471 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_CountryWarGm_11471)PARSER.parseFrom(data);
      }

      public static S2CR_CountryWarGm_11471 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CountryWarGm_11471)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CountryWarGm_11471 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_CountryWarGm_11471)PARSER.parseFrom(data);
      }

      public static S2CR_CountryWarGm_11471 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CountryWarGm_11471)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CountryWarGm_11471 parseFrom(InputStream input) throws IOException {
         return (S2CR_CountryWarGm_11471)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_CountryWarGm_11471 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CountryWarGm_11471)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_CountryWarGm_11471 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_CountryWarGm_11471)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_CountryWarGm_11471 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CountryWarGm_11471)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_CountryWarGm_11471 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_CountryWarGm_11471)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_CountryWarGm_11471 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CountryWarGm_11471)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_CountryWarGm_11471 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_CountryWarGm_11471 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_CountryWarGm_11471> parser() {
         return PARSER;
      }

      public Parser<S2CR_CountryWarGm_11471> getParserForType() {
         return PARSER;
      }

      public S2CR_CountryWarGm_11471 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_CountryWarGm_11471OrBuilder {
         private int bitField0_;
         private Object cmd_;
         private Internal.IntList params_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarGm_11471_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarGm_11471_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_CountryWarGm_11471.class, Builder.class);
         }

         private Builder() {
            this.cmd_ = "";
            this.params_ = CrossCountryWarMsg.S2CR_CountryWarGm_11471.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.cmd_ = "";
            this.params_ = CrossCountryWarMsg.S2CR_CountryWarGm_11471.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.S2CR_CountryWarGm_11471.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.cmd_ = "";
            this.bitField0_ &= -2;
            this.params_ = CrossCountryWarMsg.S2CR_CountryWarGm_11471.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_CountryWarGm_11471_descriptor;
         }

         public S2CR_CountryWarGm_11471 getDefaultInstanceForType() {
            return CrossCountryWarMsg.S2CR_CountryWarGm_11471.getDefaultInstance();
         }

         public S2CR_CountryWarGm_11471 build() {
            S2CR_CountryWarGm_11471 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_CountryWarGm_11471 buildPartial() {
            S2CR_CountryWarGm_11471 result = new S2CR_CountryWarGm_11471(this);
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
            if (other instanceof S2CR_CountryWarGm_11471) {
               return this.mergeFrom((S2CR_CountryWarGm_11471)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_CountryWarGm_11471 other) {
            if (other == CrossCountryWarMsg.S2CR_CountryWarGm_11471.getDefaultInstance()) {
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
            S2CR_CountryWarGm_11471 parsedMessage = null;

            try {
               parsedMessage = (S2CR_CountryWarGm_11471)CrossCountryWarMsg.S2CR_CountryWarGm_11471.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_CountryWarGm_11471)e.getUnfinishedMessage();
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
            this.cmd_ = CrossCountryWarMsg.S2CR_CountryWarGm_11471.getDefaultInstance().getCmd();
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
               this.params_ = CrossCountryWarMsg.S2CR_CountryWarGm_11471.mutableCopy(this.params_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getParamsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.params_) : this.params_);
         }

         public int getParamsCount() {
            return this.params_.size();
         }

         public int getParams(int index) {
            return this.params_.getInt(index);
         }

         public Builder setParams(int index, int value) {
            this.ensureParamsIsMutable();
            this.params_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addParams(int value) {
            this.ensureParamsIsMutable();
            this.params_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllParams(Iterable<? extends Integer> values) {
            this.ensureParamsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.params_);
            this.onChanged();
            return this;
         }

         public Builder clearParams() {
            this.params_ = CrossCountryWarMsg.S2CR_CountryWarGm_11471.emptyIntList();
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

   public static final class S2CR_PlayerLoginIn_11473 extends GeneratedMessageV3 implements S2CR_PlayerLoginIn_11473OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_PlayerLoginIn_11473 DEFAULT_INSTANCE = new S2CR_PlayerLoginIn_11473();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_PlayerLoginIn_11473> PARSER = new AbstractParser<S2CR_PlayerLoginIn_11473>() {
         public S2CR_PlayerLoginIn_11473 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_PlayerLoginIn_11473(input, extensionRegistry);
         }
      };

      private S2CR_PlayerLoginIn_11473(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_PlayerLoginIn_11473() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_PlayerLoginIn_11473();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_PlayerLoginIn_11473(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerLoginIn_11473_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerLoginIn_11473_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerLoginIn_11473.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_PlayerLoginIn_11473)) {
            return super.equals(obj);
         } else {
            S2CR_PlayerLoginIn_11473 other = (S2CR_PlayerLoginIn_11473)obj;
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

      public static S2CR_PlayerLoginIn_11473 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerLoginIn_11473)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerLoginIn_11473 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerLoginIn_11473)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerLoginIn_11473 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerLoginIn_11473)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerLoginIn_11473 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerLoginIn_11473)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerLoginIn_11473 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerLoginIn_11473)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerLoginIn_11473 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerLoginIn_11473)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerLoginIn_11473 parseFrom(InputStream input) throws IOException {
         return (S2CR_PlayerLoginIn_11473)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerLoginIn_11473 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerLoginIn_11473)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerLoginIn_11473 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_PlayerLoginIn_11473)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_PlayerLoginIn_11473 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerLoginIn_11473)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerLoginIn_11473 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_PlayerLoginIn_11473)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerLoginIn_11473 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerLoginIn_11473)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_PlayerLoginIn_11473 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_PlayerLoginIn_11473 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_PlayerLoginIn_11473> parser() {
         return PARSER;
      }

      public Parser<S2CR_PlayerLoginIn_11473> getParserForType() {
         return PARSER;
      }

      public S2CR_PlayerLoginIn_11473 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_PlayerLoginIn_11473OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerLoginIn_11473_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerLoginIn_11473_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerLoginIn_11473.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.S2CR_PlayerLoginIn_11473.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerLoginIn_11473_descriptor;
         }

         public S2CR_PlayerLoginIn_11473 getDefaultInstanceForType() {
            return CrossCountryWarMsg.S2CR_PlayerLoginIn_11473.getDefaultInstance();
         }

         public S2CR_PlayerLoginIn_11473 build() {
            S2CR_PlayerLoginIn_11473 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_PlayerLoginIn_11473 buildPartial() {
            S2CR_PlayerLoginIn_11473 result = new S2CR_PlayerLoginIn_11473(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_PlayerLoginIn_11473) {
               return this.mergeFrom((S2CR_PlayerLoginIn_11473)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_PlayerLoginIn_11473 other) {
            if (other == CrossCountryWarMsg.S2CR_PlayerLoginIn_11473.getDefaultInstance()) {
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
            S2CR_PlayerLoginIn_11473 parsedMessage = null;

            try {
               parsedMessage = (S2CR_PlayerLoginIn_11473)CrossCountryWarMsg.S2CR_PlayerLoginIn_11473.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_PlayerLoginIn_11473)e.getUnfinishedMessage();
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

   public static final class S2CR_PlayerLoginOut_11475 extends GeneratedMessageV3 implements S2CR_PlayerLoginOut_11475OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_PlayerLoginOut_11475 DEFAULT_INSTANCE = new S2CR_PlayerLoginOut_11475();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_PlayerLoginOut_11475> PARSER = new AbstractParser<S2CR_PlayerLoginOut_11475>() {
         public S2CR_PlayerLoginOut_11475 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_PlayerLoginOut_11475(input, extensionRegistry);
         }
      };

      private S2CR_PlayerLoginOut_11475(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_PlayerLoginOut_11475() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_PlayerLoginOut_11475();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_PlayerLoginOut_11475(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerLoginOut_11475_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerLoginOut_11475_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerLoginOut_11475.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_PlayerLoginOut_11475)) {
            return super.equals(obj);
         } else {
            S2CR_PlayerLoginOut_11475 other = (S2CR_PlayerLoginOut_11475)obj;
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

      public static S2CR_PlayerLoginOut_11475 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerLoginOut_11475)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerLoginOut_11475 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerLoginOut_11475)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerLoginOut_11475 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerLoginOut_11475)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerLoginOut_11475 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerLoginOut_11475)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerLoginOut_11475 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerLoginOut_11475)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerLoginOut_11475 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerLoginOut_11475)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerLoginOut_11475 parseFrom(InputStream input) throws IOException {
         return (S2CR_PlayerLoginOut_11475)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerLoginOut_11475 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerLoginOut_11475)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerLoginOut_11475 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_PlayerLoginOut_11475)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_PlayerLoginOut_11475 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerLoginOut_11475)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerLoginOut_11475 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_PlayerLoginOut_11475)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerLoginOut_11475 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerLoginOut_11475)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_PlayerLoginOut_11475 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_PlayerLoginOut_11475 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_PlayerLoginOut_11475> parser() {
         return PARSER;
      }

      public Parser<S2CR_PlayerLoginOut_11475> getParserForType() {
         return PARSER;
      }

      public S2CR_PlayerLoginOut_11475 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_PlayerLoginOut_11475OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerLoginOut_11475_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerLoginOut_11475_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerLoginOut_11475.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.S2CR_PlayerLoginOut_11475.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_S2CR_PlayerLoginOut_11475_descriptor;
         }

         public S2CR_PlayerLoginOut_11475 getDefaultInstanceForType() {
            return CrossCountryWarMsg.S2CR_PlayerLoginOut_11475.getDefaultInstance();
         }

         public S2CR_PlayerLoginOut_11475 build() {
            S2CR_PlayerLoginOut_11475 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_PlayerLoginOut_11475 buildPartial() {
            S2CR_PlayerLoginOut_11475 result = new S2CR_PlayerLoginOut_11475(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_PlayerLoginOut_11475) {
               return this.mergeFrom((S2CR_PlayerLoginOut_11475)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_PlayerLoginOut_11475 other) {
            if (other == CrossCountryWarMsg.S2CR_PlayerLoginOut_11475.getDefaultInstance()) {
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
            S2CR_PlayerLoginOut_11475 parsedMessage = null;

            try {
               parsedMessage = (S2CR_PlayerLoginOut_11475)CrossCountryWarMsg.S2CR_PlayerLoginOut_11475.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_PlayerLoginOut_11475)e.getUnfinishedMessage();
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

   public static final class CR2S_ServerTerminationLeave_11478 extends GeneratedMessageV3 implements CR2S_ServerTerminationLeave_11478OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ISMERGESERVERDAY_FIELD_NUMBER = 1;
      private boolean isMergeServerDay_;
      private byte memoizedIsInitialized;
      private static final CR2S_ServerTerminationLeave_11478 DEFAULT_INSTANCE = new CR2S_ServerTerminationLeave_11478();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_ServerTerminationLeave_11478> PARSER = new AbstractParser<CR2S_ServerTerminationLeave_11478>() {
         public CR2S_ServerTerminationLeave_11478 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_ServerTerminationLeave_11478(input, extensionRegistry);
         }
      };

      private CR2S_ServerTerminationLeave_11478(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_ServerTerminationLeave_11478() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_ServerTerminationLeave_11478();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_ServerTerminationLeave_11478(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.isMergeServerDay_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ServerTerminationLeave_11478_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ServerTerminationLeave_11478_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ServerTerminationLeave_11478.class, Builder.class);
      }

      public boolean hasIsMergeServerDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsMergeServerDay() {
         return this.isMergeServerDay_;
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
            output.writeBool(1, this.isMergeServerDay_);
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
               size += CodedOutputStream.computeBoolSize(1, this.isMergeServerDay_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_ServerTerminationLeave_11478)) {
            return super.equals(obj);
         } else {
            CR2S_ServerTerminationLeave_11478 other = (CR2S_ServerTerminationLeave_11478)obj;
            if (this.hasIsMergeServerDay() != other.hasIsMergeServerDay()) {
               return false;
            } else if (this.hasIsMergeServerDay() && this.getIsMergeServerDay() != other.getIsMergeServerDay()) {
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
            if (this.hasIsMergeServerDay()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getIsMergeServerDay());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_ServerTerminationLeave_11478 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_ServerTerminationLeave_11478)PARSER.parseFrom(data);
      }

      public static CR2S_ServerTerminationLeave_11478 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ServerTerminationLeave_11478)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ServerTerminationLeave_11478 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_ServerTerminationLeave_11478)PARSER.parseFrom(data);
      }

      public static CR2S_ServerTerminationLeave_11478 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ServerTerminationLeave_11478)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ServerTerminationLeave_11478 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_ServerTerminationLeave_11478)PARSER.parseFrom(data);
      }

      public static CR2S_ServerTerminationLeave_11478 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ServerTerminationLeave_11478)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ServerTerminationLeave_11478 parseFrom(InputStream input) throws IOException {
         return (CR2S_ServerTerminationLeave_11478)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ServerTerminationLeave_11478 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ServerTerminationLeave_11478)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ServerTerminationLeave_11478 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_ServerTerminationLeave_11478)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_ServerTerminationLeave_11478 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ServerTerminationLeave_11478)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ServerTerminationLeave_11478 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_ServerTerminationLeave_11478)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ServerTerminationLeave_11478 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ServerTerminationLeave_11478)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_ServerTerminationLeave_11478 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_ServerTerminationLeave_11478 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_ServerTerminationLeave_11478> parser() {
         return PARSER;
      }

      public Parser<CR2S_ServerTerminationLeave_11478> getParserForType() {
         return PARSER;
      }

      public CR2S_ServerTerminationLeave_11478 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_ServerTerminationLeave_11478OrBuilder {
         private int bitField0_;
         private boolean isMergeServerDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ServerTerminationLeave_11478_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ServerTerminationLeave_11478_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ServerTerminationLeave_11478.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.CR2S_ServerTerminationLeave_11478.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.isMergeServerDay_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ServerTerminationLeave_11478_descriptor;
         }

         public CR2S_ServerTerminationLeave_11478 getDefaultInstanceForType() {
            return CrossCountryWarMsg.CR2S_ServerTerminationLeave_11478.getDefaultInstance();
         }

         public CR2S_ServerTerminationLeave_11478 build() {
            CR2S_ServerTerminationLeave_11478 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_ServerTerminationLeave_11478 buildPartial() {
            CR2S_ServerTerminationLeave_11478 result = new CR2S_ServerTerminationLeave_11478(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.isMergeServerDay_ = this.isMergeServerDay_;
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
            if (other instanceof CR2S_ServerTerminationLeave_11478) {
               return this.mergeFrom((CR2S_ServerTerminationLeave_11478)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_ServerTerminationLeave_11478 other) {
            if (other == CrossCountryWarMsg.CR2S_ServerTerminationLeave_11478.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIsMergeServerDay()) {
                  this.setIsMergeServerDay(other.getIsMergeServerDay());
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
            CR2S_ServerTerminationLeave_11478 parsedMessage = null;

            try {
               parsedMessage = (CR2S_ServerTerminationLeave_11478)CrossCountryWarMsg.CR2S_ServerTerminationLeave_11478.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_ServerTerminationLeave_11478)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIsMergeServerDay() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getIsMergeServerDay() {
            return this.isMergeServerDay_;
         }

         public Builder setIsMergeServerDay(boolean value) {
            this.bitField0_ |= 1;
            this.isMergeServerDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsMergeServerDay() {
            this.bitField0_ &= -2;
            this.isMergeServerDay_ = false;
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

   public static final class CR2S_ServerTerminationJoin_11480 extends GeneratedMessageV3 implements CR2S_ServerTerminationJoin_11480OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final CR2S_ServerTerminationJoin_11480 DEFAULT_INSTANCE = new CR2S_ServerTerminationJoin_11480();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_ServerTerminationJoin_11480> PARSER = new AbstractParser<CR2S_ServerTerminationJoin_11480>() {
         public CR2S_ServerTerminationJoin_11480 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_ServerTerminationJoin_11480(input, extensionRegistry);
         }
      };

      private CR2S_ServerTerminationJoin_11480(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_ServerTerminationJoin_11480() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_ServerTerminationJoin_11480();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_ServerTerminationJoin_11480(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ServerTerminationJoin_11480_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ServerTerminationJoin_11480_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ServerTerminationJoin_11480.class, Builder.class);
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
         } else if (!(obj instanceof CR2S_ServerTerminationJoin_11480)) {
            return super.equals(obj);
         } else {
            CR2S_ServerTerminationJoin_11480 other = (CR2S_ServerTerminationJoin_11480)obj;
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

      public static CR2S_ServerTerminationJoin_11480 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_ServerTerminationJoin_11480)PARSER.parseFrom(data);
      }

      public static CR2S_ServerTerminationJoin_11480 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ServerTerminationJoin_11480)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ServerTerminationJoin_11480 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_ServerTerminationJoin_11480)PARSER.parseFrom(data);
      }

      public static CR2S_ServerTerminationJoin_11480 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ServerTerminationJoin_11480)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ServerTerminationJoin_11480 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_ServerTerminationJoin_11480)PARSER.parseFrom(data);
      }

      public static CR2S_ServerTerminationJoin_11480 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ServerTerminationJoin_11480)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ServerTerminationJoin_11480 parseFrom(InputStream input) throws IOException {
         return (CR2S_ServerTerminationJoin_11480)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ServerTerminationJoin_11480 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ServerTerminationJoin_11480)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ServerTerminationJoin_11480 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_ServerTerminationJoin_11480)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_ServerTerminationJoin_11480 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ServerTerminationJoin_11480)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ServerTerminationJoin_11480 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_ServerTerminationJoin_11480)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ServerTerminationJoin_11480 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ServerTerminationJoin_11480)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_ServerTerminationJoin_11480 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_ServerTerminationJoin_11480 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_ServerTerminationJoin_11480> parser() {
         return PARSER;
      }

      public Parser<CR2S_ServerTerminationJoin_11480> getParserForType() {
         return PARSER;
      }

      public CR2S_ServerTerminationJoin_11480 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_ServerTerminationJoin_11480OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ServerTerminationJoin_11480_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ServerTerminationJoin_11480_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ServerTerminationJoin_11480.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCountryWarMsg.CR2S_ServerTerminationJoin_11480.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCountryWarMsg.internal_static_crossCountryWar_com_gzbz_protobuf_CR2S_ServerTerminationJoin_11480_descriptor;
         }

         public CR2S_ServerTerminationJoin_11480 getDefaultInstanceForType() {
            return CrossCountryWarMsg.CR2S_ServerTerminationJoin_11480.getDefaultInstance();
         }

         public CR2S_ServerTerminationJoin_11480 build() {
            CR2S_ServerTerminationJoin_11480 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_ServerTerminationJoin_11480 buildPartial() {
            CR2S_ServerTerminationJoin_11480 result = new CR2S_ServerTerminationJoin_11480(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_ServerTerminationJoin_11480) {
               return this.mergeFrom((CR2S_ServerTerminationJoin_11480)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_ServerTerminationJoin_11480 other) {
            if (other == CrossCountryWarMsg.CR2S_ServerTerminationJoin_11480.getDefaultInstance()) {
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
            CR2S_ServerTerminationJoin_11480 parsedMessage = null;

            try {
               parsedMessage = (CR2S_ServerTerminationJoin_11480)CrossCountryWarMsg.CR2S_ServerTerminationJoin_11480.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_ServerTerminationJoin_11480)e.getUnfinishedMessage();
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

   public interface CR2S_ActivityState_11404OrBuilder extends MessageOrBuilder {
      boolean hasActivityId();

      int getActivityId();

      boolean hasMapId();

      int getMapId();

      boolean hasState();

      int getState();
   }

   public interface CR2S_ChangeCityInfo_11402OrBuilder extends MessageOrBuilder {
      boolean hasReason();

      int getReason();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasServerId();

      int getServerId();

      boolean hasDestCityId();

      int getDestCityId();

      List<CountryWarMsg.CityInfo> getInfosList();

      CountryWarMsg.CityInfo getInfos(int index);

      int getInfosCount();

      List<? extends CountryWarMsg.CityInfoOrBuilder> getInfosOrBuilderList();

      CountryWarMsg.CityInfoOrBuilder getInfosOrBuilder(int index);

      boolean hasAllianceMainServerId();

      int getAllianceMainServerId();
   }

   public interface CR2S_DefSuccess_11438OrBuilder extends MessageOrBuilder {
   }

   public interface CR2S_FihtToCity_11434OrBuilder extends MessageOrBuilder {
      boolean hasOptionalResult();

      int getOptionalResult();

      boolean hasIsFight();

      boolean getIsFight();

      boolean hasIsWin();

      boolean getIsWin();

      boolean hasIsOccypy();

      boolean getIsOccypy();

      boolean hasFightResult();

      BattleMsg.S2C_BattleResult_6102 getFightResult();

      BattleMsg.S2C_BattleResult_6102OrBuilder getFightResultOrBuilder();
   }

   public interface CR2S_LuckDrawRecord_11464OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      List<String> getRecordsList();

      int getRecordsCount();

      String getRecords(int index);

      ByteString getRecordsBytes(int index);
   }

   public interface CR2S_MoveToCity_11432OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasIsNeedMoveToken();

      boolean getIsNeedMoveToken();
   }

   public interface CR2S_NoticeGrantTaskReward_11420OrBuilder extends MessageOrBuilder {
   }

   public interface CR2S_OpenTurnTableUi_11462OrBuilder extends MessageOrBuilder {
      List<String> getRecordsList();

      int getRecordsCount();

      String getRecords(int index);

      ByteString getRecordsBytes(int index);
   }

   public interface CR2S_SeasonCityReward_11470OrBuilder extends MessageOrBuilder {
      List<PlayerReward> getPlayerRewardsList();

      PlayerReward getPlayerRewards(int index);

      int getPlayerRewardsCount();

      List<? extends PlayerRewardOrBuilder> getPlayerRewardsOrBuilderList();

      PlayerRewardOrBuilder getPlayerRewardsOrBuilder(int index);
   }

   public interface CR2S_SeasonReward_11468OrBuilder extends MessageOrBuilder {
      boolean hasCountryRank();

      int getCountryRank();

      List<Integer> getPlayersList();

      int getPlayersCount();

      int getPlayers(int index);

      List<RewardInfo> getRewardInfosList();

      RewardInfo getRewardInfos(int index);

      int getRewardInfosCount();

      List<? extends RewardInfoOrBuilder> getRewardInfosOrBuilderList();

      RewardInfoOrBuilder getRewardInfosOrBuilder(int index);

      boolean hasSendType();

      int getSendType();
   }

   public interface CR2S_ServerTerminationJoin_11480OrBuilder extends MessageOrBuilder {
   }

   public interface CR2S_ServerTerminationLeave_11478OrBuilder extends MessageOrBuilder {
      boolean hasIsMergeServerDay();

      boolean getIsMergeServerDay();
   }

   public interface CR2S_TakeCityReward_11442OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      List<CommonMsg.ItemInfo> getItemsList();

      CommonMsg.ItemInfo getItems(int index);

      int getItemsCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index);
   }

   public interface CR2S_TransferToCity_11436OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasConsumeToken();

      CommonMsg.ItemInfo getConsumeToken();

      CommonMsg.ItemInfoOrBuilder getConsumeTokenOrBuilder();

      boolean hasIsFight();

      boolean getIsFight();

      boolean hasIsWin();

      boolean getIsWin();

      boolean hasIsOccypy();

      boolean getIsOccypy();

      boolean hasInfo();

      CountryWarMsg.CountryWarLogInfo getInfo();

      CountryWarMsg.CountryWarLogInfoOrBuilder getInfoOrBuilder();

      boolean hasIsBreakDefense();

      boolean getIsBreakDefense();
   }

   public interface CR2S_UpLoadPlayerInfo_11406OrBuilder extends MessageOrBuilder {
      boolean hasActivityId();

      int getActivityId();

      boolean hasMapId();

      int getMapId();

      boolean hasState();

      int getState();

      boolean hasIsNeedUpload();

      boolean getIsNeedUpload();
   }

   public interface CR2S_UpdateCityReward_11416OrBuilder extends MessageOrBuilder {
      List<CountryWarMsg.CityRewardInfo> getInfosList();

      CountryWarMsg.CityRewardInfo getInfos(int index);

      int getInfosCount();

      List<? extends CountryWarMsg.CityRewardInfoOrBuilder> getInfosOrBuilderList();

      CountryWarMsg.CityRewardInfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface CountryWarPlayerOrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      CommonMsg.PlayerInfo getInfo();

      CommonMsg.PlayerInfoOrBuilder getInfoOrBuilder();

      boolean hasHeroArrayingData();

      ByteString getHeroArrayingData();

      boolean hasIsOnline();

      boolean getIsOnline();
   }

   public interface PlayerRewardInfoOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasRank();

      int getRank();
   }

   public interface PlayerRewardOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      List<CommonMsg.ItemInfo> getItemInfosList();

      CommonMsg.ItemInfo getItemInfos(int index);

      int getItemInfosCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getItemInfosOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getItemInfosOrBuilder(int index);
   }

   public interface RewardInfoOrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      List<PlayerRewardInfo> getInfosList();

      PlayerRewardInfo getInfos(int index);

      int getInfosCount();

      List<? extends PlayerRewardInfoOrBuilder> getInfosOrBuilderList();

      PlayerRewardInfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2CR_ActivityState_11403OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_BuyItem_11467OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasNum();

      int getNum();
   }

   public interface S2CR_CountryLog_11411OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface S2CR_CountryWarGm_11471OrBuilder extends MessageOrBuilder {
      boolean hasCmd();

      String getCmd();

      ByteString getCmdBytes();

      List<Integer> getParamsList();

      int getParamsCount();

      int getParams(int index);
   }

   public interface S2CR_CountryWarRank_11409OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface S2CR_CountryWarState_11407OrBuilder extends MessageOrBuilder {
      boolean hasActivityState();

      int getActivityState();

      boolean hasAttToken();

      int getAttToken();

      boolean hasAttNextTokenTime();

      int getAttNextTokenTime();

      boolean hasMoveToken();

      int getMoveToken();

      boolean hasMoveNextTokenTime();

      int getMoveNextTokenTime();

      boolean hasIsCompletedTask();

      boolean getIsCompletedTask();

      boolean hasIsSocreReward();

      boolean getIsSocreReward();

      boolean hasOpenDays();

      int getOpenDays();
   }

   public interface S2CR_FihtToCity_11433OrBuilder extends MessageOrBuilder {
      boolean hasCityId();

      int getCityId();

      boolean hasHeroArrayingData();

      ByteString getHeroArrayingData();

      boolean hasIsSkip();

      boolean getIsSkip();
   }

   public interface S2CR_LuckDrawRecord_11463OrBuilder extends MessageOrBuilder {
      List<String> getRecordList();

      int getRecordCount();

      String getRecord(int index);

      ByteString getRecordBytes(int index);
   }

   public interface S2CR_MainUi_11401OrBuilder extends MessageOrBuilder {
      boolean hasIsCompletedTask();

      boolean getIsCompletedTask();

      boolean hasAttToken();

      int getAttToken();

      boolean hasAttNextTokenTime();

      int getAttNextTokenTime();

      boolean hasMoveToken();

      int getMoveToken();

      boolean hasMoveNextTokenTime();

      int getMoveNextTokenTime();

      boolean hasHeroArrayingData();

      ByteString getHeroArrayingData();

      boolean hasTransferNum();

      int getTransferNum();

      boolean hasAllowTransfer();

      boolean getAllowTransfer();

      boolean hasSameUnionTransfer();

      boolean getSameUnionTransfer();

      boolean hasBuyNum();

      int getBuyNum();
   }

   public interface S2CR_MoveToCity_11431OrBuilder extends MessageOrBuilder {
      boolean hasCityId();

      int getCityId();

      boolean hasMoveToken();

      int getMoveToken();
   }

   public interface S2CR_OpenTurnTableUi_11461OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_PlayerInfo_11417OrBuilder extends MessageOrBuilder {
      boolean hasSlaveServierId();

      int getSlaveServierId();

      boolean hasPlayerId();

      int getPlayerId();
   }

   public interface S2CR_PlayerLoginIn_11473OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_PlayerLoginOut_11475OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_TakeCityReward_11441OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_TransferList_11437OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_TransferToCity_11435OrBuilder extends MessageOrBuilder {
      boolean hasCityId();

      int getCityId();

      boolean hasTransferPlayerId();

      int getTransferPlayerId();

      boolean hasAttToken();

      int getAttToken();

      boolean hasMoveToken();

      int getMoveToken();
   }

   public interface S2CR_UpLoadPlayerInfo_11405OrBuilder extends MessageOrBuilder {
      List<CountryWarPlayer> getPlayersList();

      CountryWarPlayer getPlayers(int index);

      int getPlayersCount();

      List<? extends CountryWarPlayerOrBuilder> getPlayersOrBuilderList();

      CountryWarPlayerOrBuilder getPlayersOrBuilder(int index);
   }
}
