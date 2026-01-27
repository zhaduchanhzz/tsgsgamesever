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

public final class KingOfCentralPlainsMsg {
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_GroupFightData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_GroupFightData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_MyFightUi_9601_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_MyFightUi_9601_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_MyFightResult_9602_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_MyFightResult_9602_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightRecordInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightRecordInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_MyRecordUi_9603_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_MyRecordUi_9603_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_MyRecordResult_9604_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_MyRecordResult_9604_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessUi_9611_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessUi_9611_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessUiResult_9612_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessUiResult_9612_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_Guess_9613_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_Guess_9613_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessResult_9614_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessResult_9614_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessPush_9616_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessPush_9616_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessRecordInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessRecordInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessRecord_9617_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessRecord_9617_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessRecordResult_9618_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessRecordResult_9618_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessRecordAll_9619_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessRecordAll_9619_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessRecordAll_9620_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessRecordAll_9620_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightMap32_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightMap32_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightMap4_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightMap4_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_Rank32Ui_9631_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_Rank32Ui_9631_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_Rank32UiResult_9632_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_Rank32UiResult_9632_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_RankInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_RankInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_RankUi_9641_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_RankUi_9641_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_RankUiResult_9642_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_RankUiResult_9642_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_SeasonTopThree_9643_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_SeasonTopThree_9643_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_SeasonTopThreeResult_9644_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_SeasonTopThreeResult_9644_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_RoundAndState_9649_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_RoundAndState_9649_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_RoundAndState_9650_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_RoundAndState_9650_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_ActivityState_9651_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_ActivityState_9651_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_ActivityState_9652_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_ActivityState_9652_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_FightRecord_9654_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_FightRecord_9654_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_PlayerKCPSettle_9661_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_PlayerKCPSettle_9661_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_PlayerKCPSettle_9662_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_PlayerKCPSettle_9662_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_PopRankInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_PopRankInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_PopThreeRank_9664_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_PopThreeRank_9664_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private KingOfCentralPlainsMsg() {
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
      String[] descriptorData = new String[]{"\n\u0019KingOfCentralPlains.proto\u0012%kingOfCentralPlains.com.gzbz.protobuf\u001a\fcommon.proto\u001a\fBattle.proto\"×\u0001\n\tFightData\u0012*\n\u000eleftPlayerInfo\u0018\u0001 \u0001(\u000b2\u0012.common.PlayerInfo\u0012+\n\u000frightPlayerInfo\u0018\u0002 \u0001(\u000b2\u0012.common.PlayerInfo\u0012\u0010\n\brecordId\u0018\u0003 \u0001(\u0005\u0012\u000b\n\u0003win\u0018\u0004 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0005 \u0001(\u0005\u0012?\n\u0006result\u0018\u0006 \u0001(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\"õ\u0001\n\u000eGroupFightData\u0012\r\n\u0005index\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bleftName\u0018\u0002 \u0002(\t\u0012\u0011\n\trightName\u0018\u0003 \u0002(\t\u0012\u0010\n\brecordId\u0018\u0004 \u0001(\u0005\u0012\u000b\n\u0003win\u0018\u0005 \u0001(\u0005\u0012\u0010\n\bleftHead\u0018\u0006 \u0001(\u0005\u0012\u0011\n\trightHead\u0018\u0007 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\b \u0001(\u0005\u0012\u0014\n\fleftServerId\u0018\t \u0001(\u0005\u0012\u0014\n\fleftPlayerId\u0018\n \u0001(\u0005\u0012\u0015\n\rrightServerId\u0018\u000b \u0001(\u0005\u0012\u0015\n\rrightPlayerId\u0018\f \u0001(\u0005\"\u0014\n\u0012C2S_MyFightUi_9601\"Y\n\u0016S2C_MyFightResult_9602\u0012?\n\u0005fight\u0018\u0001 \u0002(\u000b20.kingOfCentralPlains.com.gzbz.protobuf.FightData\"Ë\u0001\n\u000fFightRecordInfo\u0012\f\n\u0004rond\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006leftId\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007rightId\u0018\u0003 \u0002(\u0005\u0012\u0010\n\bleftName\u0018\u0004 \u0002(\t\u0012\u0011\n\trightName\u0018\u0005 \u0002(\t\u0012\u0010\n\bleftHead\u0018\u0006 \u0002(\u0005\u0012\u0011\n\trightHead\u0018\u0007 \u0002(\u0005\u0012\u000b\n\u0003win\u0018\b \u0002(\u0005\u0012\r\n\u0005socre\u0018\t \u0002(\u0005\u0012\u0010\n\brecordId\u0018\n \u0002(\u0005\u0012\u0011\n\tstartTime\u0018\u000b \u0002(\u0005\"\u0015\n\u0013C2S_MyRecordUi_9603\"`\n\u0017S2C_MyRecordResult_9604\u0012E\n\u0005infos\u0018\u0001 \u0003(\u000b26.kingOfCentralPlains.com.gzbz.protobuf.FightRecordInfo\"0\n\tGuessInfo\u0012\u0011\n\twagerSide\u0018\u0003 \u0001(\u0005\u0012\u0010\n\bwagerNum\u0018\u0004 \u0001(\u0005\"\u0012\n\u0010C2S_GuessUi_9611\"Ã\u0001\n\u0016S2C_GuessUiResult_9612\u0012?\n\u0005fight\u0018\u0001 \u0001(\u000b20.kingOfCentralPlains.com.gzbz.protobuf.FightData\u0012\u0010\n\bleftOdds\u0018\u0002 \u0002(\u0001\u0012\u0011\n\trightOdds\u0018\u0003 \u0002(\u0001\u0012C\n\tguessInfo\u0018\u0004 \u0001(\u000b20.kingOfCentralPlains.com.gzbz.protobuf.GuessInfo\"5\n\u000eC2S_Guess_9613\u0012\u0011\n\twagerSide\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bwagerNum\u0018\u0002 \u0002(\u0005\"`\n\u0014S2C_GuessResult_9614\u0012\u0010\n\bleftOdds\u0018\u0001 \u0002(\u0001\u0012\u0011\n\trightOdds\u0018\u0002 \u0002(\u0001\u0012\u0011\n\twagerSide\u0018\u0003 \u0002(\u0005\u0012\u0010\n\bwagerNum\u0018\u0004 \u0002(\u0005\"9\n\u0012S2C_GuessPush_9616\u0012\u0010\n\bleftOdds\u0018\u0001 \u0002(\u0001\u0012\u0011\n\trightOdds\u0018\u0002 \u0002(\u0001\"\u0090\u0002\n\u000fGuessRecordInfo\u0012\r\n\u0005round\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006leftId\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007rightId\u0018\u0003 \u0002(\u0005\u0012\u0010\n\bleftName\u0018\u0004 \u0002(\t\u0012\u0011\n\trightName\u0018\u0005 \u0002(\t\u0012\u0010\n\bleftHead\u0018\u0006 \u0002(\u0005\u0012\u0011\n\trightHead\u0018\u0007 \u0002(\u0005\u0012\u000b\n\u0003win\u0018\b \u0002(\u0005\u0012\u0011\n\twagerName\u0018\t \u0002(\t\u0012\r\n\u0005socre\u0018\n \u0002(\u0005\u0012\u0010\n\brecordId\u0018\u000b \u0002(\u0005\u0012\u000e\n\u0006winNum\u0018\f \u0002(\u0005\u0012\u000e\n\u0006leftLv\u0018\r \u0001(\u0005\u0012\u000f\n\u0007rightLv\u0018\u000e \u0001(\u0005\u0012\u0011\n\tstartTIme\u0018\u000f \u0002(\u0005\"\u0016\n\u0014C2S_GuessRecord_9617\"c\n\u001aS2C_GuessRecordResult_9618\u0012E\n\u0005infos\u0018\u0001 \u0003(\u000b26.kingOfCentralPlains.com.gzbz.protobuf.GuessRecordInfo\"\u0019\n\u0017C2S_GuessRecordAll_9619\"\\\n\u0017S2C_GuessRecordAll_9620\u0012A\n\u0005infos\u0018\u0001 \u0003(\u000b22.kingOfCentralPlains.com.gzbz.protobuf.GuessRecord\"\u008d\u0001\n\u000bGuessRecord\u0012\r\n\u0005round\u0018\u0001 \u0002(\u0005\u0012?\n\u0005fight\u0018\u0002 \u0002(\u000b20.kingOfCentralPlains.com.gzbz.protobuf.FightData\u0012\u000f\n\u0007wagerId\u0018\u0003 \u0001(\u0005\u0012\r\n\u0005socre\u0018\u0004 \u0001(\u0005\u0012\u000e\n\u0006winNum\u0018\u0005 \u0001(\u0005\"ò\u0001\n\nFightMap32\u0012\r\n\u0005group\u0018\u0001 \u0002(\u0005\u0012F\n\u0007fight32\u0018\u0002 \u0003(\u000b25.kingOfCentralPlains.com.gzbz.protobuf.GroupFightData\u0012F\n\u0007fight16\u0018\u0003 \u0003(\u000b25.kingOfCentralPlains.com.gzbz.protobuf.GroupFightData\u0012E\n\u0006fight8\u0018\u0004 \u0003(\u000b25.kingOfCentralPlains.com.gzbz.protobuf.GroupFightData\"\u0099\u0001\n\tFightMap4\u0012E\n\u0006fight4\u0018\u0001 \u0003(\u000b25.kingOfCentralPlains.com.gzbz.protobuf.GroupFightData\u0012E\n\u0006fight2\u0018\u0002 \u0003(\u000b25.kingOfCentralPlains.com.gzbz.protobuf.GroupFightData\"\u0013\n\u0011C2S_Rank32Ui_9631\"\u009b\u0001\n\u0017S2C_Rank32UiResult_9632\u0012@\n\u0005map32\u0018\u0001 \u0003(\u000b21.kingOfCentralPlains.com.gzbz.protobuf.FightMap32\u0012>\n\u0004map4\u0018\u0002 \u0001(\u000b20.kingOfCentralPlains.com.gzbz.protobuf.FightMap4\"Ï\u0001\n\bRankInfo\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004head\u0018\u0002 \u0002(\u0005\u0012\u0011\n\theadFrame\u0018\u0003 \u0002(\u0005\u0012\n\n\u0002lv\u0018\u0004 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0005 \u0002(\t\u0012\r\n\u0005power\u0018\u0006 \u0002(\u0003\u0012\u0011\n\tthumbsNum\u0018\u0007 \u0002(\u0005\u0012\u0012\n\nisThumbsUp\u0018\b \u0002(\b\u0012\r\n\u0005socre\u0018\t \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\n \u0002(\u0005\u0012\u0010\n\bprestige\u0018\u000b \u0001(\u0005\u0012\u0011\n\tmonarchid\u0018\f \u0001(\u0005\"\u0011\n\u000fC2S_RankUi_9641\"\u00ad\u0001\n\u0015S2C_RankUiResult_9642\u0012\u0013\n\u000bthumbsUpNum\u0018\u0001 \u0002(\u0005\u0012?\n\u0006myInfo\u0018\u0002 \u0001(\u000b2/.kingOfCentralPlains.com.gzbz.protobuf.RankInfo\u0012>\n\u0005infos\u0018\u0003 \u0003(\u000b2/.kingOfCentralPlains.com.gzbz.protobuf.RankInfo\"\u0019\n\u0017C2S_SeasonTopThree_9643\"\u008a\u0002\n\u001dS2C_SeasonTopThreeResult_9644\u0012\r\n\u0005round\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005state\u0018\u0002 \u0002(\u0005\u0012\u0013\n\u000bthumbsUpNum\u0018\u0003 \u0002(\u0005\u0012?\n\u0006myInfo\u0018\u0004 \u0001(\u000b2/.kingOfCentralPlains.com.gzbz.protobuf.RankInfo\u0012>\n\u0005infos\u0018\u0005 \u0003(\u000b2/.kingOfCentralPlains.com.gzbz.protobuf.RankInfo\u0012\u000f\n\u0007topRank\u0018\u0006 \u0002(\u0005\u0012\u0012\n\nseasonTime\u0018\u0007 \u0002(\t\u0012\u0010\n\bdownTime\u0018\b \u0002(\u0005\"\u0018\n\u0016C2S_RoundAndState_9649\"\u007f\n\u0016S2C_RoundAndState_9650\u0012\u0010\n\bisEnable\u0018\u0001 \u0002(\b\u0012\r\n\u0005round\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005state\u0018\u0003 \u0002(\u0005\u0012\u0011\n\tstartTime\u0018\u0004 \u0001(\u0005\u0012\u0010\n\bdownTime\u0018\u0005 \u0001(\u0005\u0012\u0010\n\bnextTime\u0018\u0006 \u0001(\u0005\"\u0018\n\u0016C2S_ActivityState_9651\"v\n\u0016S2C_ActivityState_9652\u0012\r\n\u0005state\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0005\u0012\u0010\n\bdownTime\u0018\u0003 \u0001(\u0005\u0012\u0015\n\risActivityDay\u0018\u0004 \u0001(\b\u0012\u0011\n\tisOpenDay\u0018\u0005 \u0001(\b\"v\n\u0014S2C_FightRecord_9654\u0012\u0015\n\rfightRecordId\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rguessRecordId\u0018\u0002 \u0002(\u0005\u0012\u0017\n\u000ffightRecordTime\u0018\u0003 \u0002(\u0005\u0012\u0017\n\u000fguessRecordTime\u0018\u0004 \u0002(\u0005\"\u001a\n\u0018C2S_PlayerKCPSettle_9661\"D\n\u0018S2C_PlayerKCPSettle_9662\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005fight\u0018\u0002 \u0001(\u0005\u0012\u000b\n\u0003win\u0018\u0003 \u0001(\u0005\"\u009f\u0001\n\u000bPopRankInfo\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004head\u0018\u0002 \u0002(\u0005\u0012\u0011\n\theadFrame\u0018\u0003 \u0002(\u0005\u0012\n\n\u0002lv\u0018\u0004 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0005 \u0002(\t\u0012\u0010\n\bprestige\u0018\u0006 \u0001(\u0005\u0012\u0011\n\tmonarchid\u0018\u0007 \u0001(\u0005\u0012\u0010\n\bserverId\u0018\b \u0001(\u0005\u0012\u0010\n\bplayerId\u0018\t \u0001(\u0005\"m\n\u0015S2C_PopThreeRank_9664\u0012\u0011\n\tstartTime\u0018\u0001 \u0002(\u0005\u0012A\n\u0005infos\u0018\u0002 \u0003(\u000b22.kingOfCentralPlains.com.gzbz.protobuf.PopRankInfoB-\n\u0011com.gzbz.protobufB\u0016KingOfCentralPlainsMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), BattleMsg.getDescriptor()});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightData_descriptor, new String[]{"LeftPlayerInfo", "RightPlayerInfo", "RecordId", "Win", "StartTime", "Result"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_GroupFightData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_GroupFightData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_GroupFightData_descriptor, new String[]{"Index", "LeftName", "RightName", "RecordId", "Win", "LeftHead", "RightHead", "StartTime", "LeftServerId", "LeftPlayerId", "RightServerId", "RightPlayerId"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_MyFightUi_9601_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_MyFightUi_9601_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_MyFightUi_9601_descriptor, new String[0]);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_MyFightResult_9602_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_MyFightResult_9602_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_MyFightResult_9602_descriptor, new String[]{"Fight"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightRecordInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightRecordInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightRecordInfo_descriptor, new String[]{"Rond", "LeftId", "RightId", "LeftName", "RightName", "LeftHead", "RightHead", "Win", "Socre", "RecordId", "StartTime"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_MyRecordUi_9603_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_MyRecordUi_9603_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_MyRecordUi_9603_descriptor, new String[0]);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_MyRecordResult_9604_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_MyRecordResult_9604_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_MyRecordResult_9604_descriptor, new String[]{"Infos"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessInfo_descriptor, new String[]{"WagerSide", "WagerNum"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessUi_9611_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessUi_9611_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessUi_9611_descriptor, new String[0]);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessUiResult_9612_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessUiResult_9612_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessUiResult_9612_descriptor, new String[]{"Fight", "LeftOdds", "RightOdds", "GuessInfo"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_Guess_9613_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_Guess_9613_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_Guess_9613_descriptor, new String[]{"WagerSide", "WagerNum"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessResult_9614_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessResult_9614_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessResult_9614_descriptor, new String[]{"LeftOdds", "RightOdds", "WagerSide", "WagerNum"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessPush_9616_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessPush_9616_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessPush_9616_descriptor, new String[]{"LeftOdds", "RightOdds"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessRecordInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessRecordInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessRecordInfo_descriptor, new String[]{"Round", "LeftId", "RightId", "LeftName", "RightName", "LeftHead", "RightHead", "Win", "WagerName", "Socre", "RecordId", "WinNum", "LeftLv", "RightLv", "StartTIme"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessRecord_9617_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessRecord_9617_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessRecord_9617_descriptor, new String[0]);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessRecordResult_9618_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessRecordResult_9618_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessRecordResult_9618_descriptor, new String[]{"Infos"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessRecordAll_9619_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessRecordAll_9619_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessRecordAll_9619_descriptor, new String[0]);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessRecordAll_9620_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessRecordAll_9620_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessRecordAll_9620_descriptor, new String[]{"Infos"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessRecord_descriptor, new String[]{"Round", "Fight", "WagerId", "Socre", "WinNum"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightMap32_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightMap32_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightMap32_descriptor, new String[]{"Group", "Fight32", "Fight16", "Fight8"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightMap4_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightMap4_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightMap4_descriptor, new String[]{"Fight4", "Fight2"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_Rank32Ui_9631_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_Rank32Ui_9631_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_Rank32Ui_9631_descriptor, new String[0]);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_Rank32UiResult_9632_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_Rank32UiResult_9632_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_Rank32UiResult_9632_descriptor, new String[]{"Map32", "Map4"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_RankInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_RankInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_RankInfo_descriptor, new String[]{"Rank", "Head", "HeadFrame", "Lv", "Name", "Power", "ThumbsNum", "IsThumbsUp", "Socre", "PlayerId", "Prestige", "Monarchid"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_RankUi_9641_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_RankUi_9641_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_RankUi_9641_descriptor, new String[0]);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_RankUiResult_9642_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_RankUiResult_9642_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_RankUiResult_9642_descriptor, new String[]{"ThumbsUpNum", "MyInfo", "Infos"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_SeasonTopThree_9643_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_SeasonTopThree_9643_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_SeasonTopThree_9643_descriptor, new String[0]);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_SeasonTopThreeResult_9644_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_SeasonTopThreeResult_9644_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_SeasonTopThreeResult_9644_descriptor, new String[]{"Round", "State", "ThumbsUpNum", "MyInfo", "Infos", "TopRank", "SeasonTime", "DownTime"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_RoundAndState_9649_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_RoundAndState_9649_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_RoundAndState_9649_descriptor, new String[0]);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_RoundAndState_9650_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_RoundAndState_9650_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_RoundAndState_9650_descriptor, new String[]{"IsEnable", "Round", "State", "StartTime", "DownTime", "NextTime"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_ActivityState_9651_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_ActivityState_9651_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_ActivityState_9651_descriptor, new String[0]);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_ActivityState_9652_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_ActivityState_9652_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_ActivityState_9652_descriptor, new String[]{"State", "StartTime", "DownTime", "IsActivityDay", "IsOpenDay"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_FightRecord_9654_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_FightRecord_9654_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_FightRecord_9654_descriptor, new String[]{"FightRecordId", "GuessRecordId", "FightRecordTime", "GuessRecordTime"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_PlayerKCPSettle_9661_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_PlayerKCPSettle_9661_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_PlayerKCPSettle_9661_descriptor, new String[0]);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_PlayerKCPSettle_9662_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_PlayerKCPSettle_9662_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_PlayerKCPSettle_9662_descriptor, new String[]{"Rank", "Fight", "Win"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_PopRankInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(35);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_PopRankInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_PopRankInfo_descriptor, new String[]{"Rank", "Head", "HeadFrame", "Lv", "Name", "Prestige", "Monarchid", "ServerId", "PlayerId"});
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_PopThreeRank_9664_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(36);
      internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_PopThreeRank_9664_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_PopThreeRank_9664_descriptor, new String[]{"StartTime", "Infos"});
      CommonMsg.getDescriptor();
      BattleMsg.getDescriptor();
   }

   public static final class FightData extends GeneratedMessageV3 implements FightDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LEFTPLAYERINFO_FIELD_NUMBER = 1;
      private CommonMsg.PlayerInfo leftPlayerInfo_;
      public static final int RIGHTPLAYERINFO_FIELD_NUMBER = 2;
      private CommonMsg.PlayerInfo rightPlayerInfo_;
      public static final int RECORDID_FIELD_NUMBER = 3;
      private int recordId_;
      public static final int WIN_FIELD_NUMBER = 4;
      private int win_;
      public static final int STARTTIME_FIELD_NUMBER = 5;
      private int startTime_;
      public static final int RESULT_FIELD_NUMBER = 6;
      private BattleMsg.S2C_BattleResult_6102 result_;
      private byte memoizedIsInitialized;
      private static final FightData DEFAULT_INSTANCE = new FightData();
      /** @deprecated */
      @Deprecated
      public static final Parser<FightData> PARSER = new AbstractParser<FightData>() {
         public FightData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new FightData(input, extensionRegistry);
         }
      };

      private FightData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private FightData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new FightData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private FightData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                           subBuilder = this.leftPlayerInfo_.toBuilder();
                        }

                        this.leftPlayerInfo_ = (CommonMsg.PlayerInfo)input.readMessage(CommonMsg.PlayerInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.leftPlayerInfo_);
                           this.leftPlayerInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        CommonMsg.PlayerInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.rightPlayerInfo_.toBuilder();
                        }

                        this.rightPlayerInfo_ = (CommonMsg.PlayerInfo)input.readMessage(CommonMsg.PlayerInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.rightPlayerInfo_);
                           this.rightPlayerInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.recordId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.win_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.startTime_ = input.readInt32();
                        break;
                     case 50:
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 32) != 0) {
                           subBuilder = this.result_.toBuilder();
                        }

                        this.result_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.result_);
                           this.result_ = subBuilder.buildPartial();
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightData_fieldAccessorTable.ensureFieldAccessorsInitialized(FightData.class, Builder.class);
      }

      public boolean hasLeftPlayerInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public CommonMsg.PlayerInfo getLeftPlayerInfo() {
         return this.leftPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.leftPlayerInfo_;
      }

      public CommonMsg.PlayerInfoOrBuilder getLeftPlayerInfoOrBuilder() {
         return this.leftPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.leftPlayerInfo_;
      }

      public boolean hasRightPlayerInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.PlayerInfo getRightPlayerInfo() {
         return this.rightPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.rightPlayerInfo_;
      }

      public CommonMsg.PlayerInfoOrBuilder getRightPlayerInfoOrBuilder() {
         return this.rightPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.rightPlayerInfo_;
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getRecordId() {
         return this.recordId_;
      }

      public boolean hasWin() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getWin() {
         return this.win_;
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
      }

      public boolean hasResult() {
         return (this.bitField0_ & 32) != 0;
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
         } else if (this.hasLeftPlayerInfo() && !this.getLeftPlayerInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasRightPlayerInfo() && !this.getRightPlayerInfo().isInitialized()) {
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
            output.writeMessage(1, this.getLeftPlayerInfo());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getRightPlayerInfo());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.recordId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.win_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.startTime_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeMessage(6, this.getResult());
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
               size += CodedOutputStream.computeMessageSize(1, this.getLeftPlayerInfo());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getRightPlayerInfo());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.recordId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.win_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.startTime_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeMessageSize(6, this.getResult());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof FightData)) {
            return super.equals(obj);
         } else {
            FightData other = (FightData)obj;
            if (this.hasLeftPlayerInfo() != other.hasLeftPlayerInfo()) {
               return false;
            } else if (this.hasLeftPlayerInfo() && !this.getLeftPlayerInfo().equals(other.getLeftPlayerInfo())) {
               return false;
            } else if (this.hasRightPlayerInfo() != other.hasRightPlayerInfo()) {
               return false;
            } else if (this.hasRightPlayerInfo() && !this.getRightPlayerInfo().equals(other.getRightPlayerInfo())) {
               return false;
            } else if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
               return false;
            } else if (this.hasWin() != other.hasWin()) {
               return false;
            } else if (this.hasWin() && this.getWin() != other.getWin()) {
               return false;
            } else if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
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
            if (this.hasLeftPlayerInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLeftPlayerInfo().hashCode();
            }

            if (this.hasRightPlayerInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRightPlayerInfo().hashCode();
            }

            if (this.hasRecordId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRecordId();
            }

            if (this.hasWin()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getWin();
            }

            if (this.hasStartTime()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getStartTime();
            }

            if (this.hasResult()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getResult().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static FightData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (FightData)PARSER.parseFrom(data);
      }

      public static FightData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FightData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FightData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (FightData)PARSER.parseFrom(data);
      }

      public static FightData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FightData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FightData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (FightData)PARSER.parseFrom(data);
      }

      public static FightData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FightData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FightData parseFrom(InputStream input) throws IOException {
         return (FightData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static FightData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FightData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static FightData parseDelimitedFrom(InputStream input) throws IOException {
         return (FightData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static FightData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FightData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static FightData parseFrom(CodedInputStream input) throws IOException {
         return (FightData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static FightData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FightData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(FightData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static FightData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<FightData> parser() {
         return PARSER;
      }

      public Parser<FightData> getParserForType() {
         return PARSER;
      }

      public FightData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FightDataOrBuilder {
         private int bitField0_;
         private CommonMsg.PlayerInfo leftPlayerInfo_;
         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> leftPlayerInfoBuilder_;
         private CommonMsg.PlayerInfo rightPlayerInfo_;
         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> rightPlayerInfoBuilder_;
         private int recordId_;
         private int win_;
         private int startTime_;
         private BattleMsg.S2C_BattleResult_6102 result_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> resultBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightData_fieldAccessorTable.ensureFieldAccessorsInitialized(FightData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.FightData.alwaysUseFieldBuilders) {
               this.getLeftPlayerInfoFieldBuilder();
               this.getRightPlayerInfoFieldBuilder();
               this.getResultFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.leftPlayerInfoBuilder_ == null) {
               this.leftPlayerInfo_ = null;
            } else {
               this.leftPlayerInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            if (this.rightPlayerInfoBuilder_ == null) {
               this.rightPlayerInfo_ = null;
            } else {
               this.rightPlayerInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            this.recordId_ = 0;
            this.bitField0_ &= -5;
            this.win_ = 0;
            this.bitField0_ &= -9;
            this.startTime_ = 0;
            this.bitField0_ &= -17;
            if (this.resultBuilder_ == null) {
               this.result_ = null;
            } else {
               this.resultBuilder_.clear();
            }

            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightData_descriptor;
         }

         public FightData getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.FightData.getDefaultInstance();
         }

         public FightData build() {
            FightData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public FightData buildPartial() {
            FightData result = new FightData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.leftPlayerInfoBuilder_ == null) {
                  result.leftPlayerInfo_ = this.leftPlayerInfo_;
               } else {
                  result.leftPlayerInfo_ = (CommonMsg.PlayerInfo)this.leftPlayerInfoBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.rightPlayerInfoBuilder_ == null) {
                  result.rightPlayerInfo_ = this.rightPlayerInfo_;
               } else {
                  result.rightPlayerInfo_ = (CommonMsg.PlayerInfo)this.rightPlayerInfoBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.recordId_ = this.recordId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.win_ = this.win_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.startTime_ = this.startTime_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               if (this.resultBuilder_ == null) {
                  result.result_ = this.result_;
               } else {
                  result.result_ = (BattleMsg.S2C_BattleResult_6102)this.resultBuilder_.build();
               }

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
            if (other instanceof FightData) {
               return this.mergeFrom((FightData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(FightData other) {
            if (other == KingOfCentralPlainsMsg.FightData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLeftPlayerInfo()) {
                  this.mergeLeftPlayerInfo(other.getLeftPlayerInfo());
               }

               if (other.hasRightPlayerInfo()) {
                  this.mergeRightPlayerInfo(other.getRightPlayerInfo());
               }

               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               if (other.hasWin()) {
                  this.setWin(other.getWin());
               }

               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
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
            if (this.hasLeftPlayerInfo() && !this.getLeftPlayerInfo().isInitialized()) {
               return false;
            } else if (this.hasRightPlayerInfo() && !this.getRightPlayerInfo().isInitialized()) {
               return false;
            } else {
               return !this.hasResult() || this.getResult().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            FightData parsedMessage = null;

            try {
               parsedMessage = (FightData)KingOfCentralPlainsMsg.FightData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (FightData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLeftPlayerInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public CommonMsg.PlayerInfo getLeftPlayerInfo() {
            if (this.leftPlayerInfoBuilder_ == null) {
               return this.leftPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.leftPlayerInfo_;
            } else {
               return (CommonMsg.PlayerInfo)this.leftPlayerInfoBuilder_.getMessage();
            }
         }

         public Builder setLeftPlayerInfo(CommonMsg.PlayerInfo value) {
            if (this.leftPlayerInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.leftPlayerInfo_ = value;
               this.onChanged();
            } else {
               this.leftPlayerInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setLeftPlayerInfo(CommonMsg.PlayerInfo.Builder builderForValue) {
            if (this.leftPlayerInfoBuilder_ == null) {
               this.leftPlayerInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.leftPlayerInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeLeftPlayerInfo(CommonMsg.PlayerInfo value) {
            if (this.leftPlayerInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.leftPlayerInfo_ != null && this.leftPlayerInfo_ != CommonMsg.PlayerInfo.getDefaultInstance()) {
                  this.leftPlayerInfo_ = CommonMsg.PlayerInfo.newBuilder(this.leftPlayerInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.leftPlayerInfo_ = value;
               }

               this.onChanged();
            } else {
               this.leftPlayerInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearLeftPlayerInfo() {
            if (this.leftPlayerInfoBuilder_ == null) {
               this.leftPlayerInfo_ = null;
               this.onChanged();
            } else {
               this.leftPlayerInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public CommonMsg.PlayerInfo.Builder getLeftPlayerInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (CommonMsg.PlayerInfo.Builder)this.getLeftPlayerInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.PlayerInfoOrBuilder getLeftPlayerInfoOrBuilder() {
            if (this.leftPlayerInfoBuilder_ != null) {
               return (CommonMsg.PlayerInfoOrBuilder)this.leftPlayerInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.leftPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.leftPlayerInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> getLeftPlayerInfoFieldBuilder() {
            if (this.leftPlayerInfoBuilder_ == null) {
               this.leftPlayerInfoBuilder_ = new SingleFieldBuilderV3(this.getLeftPlayerInfo(), this.getParentForChildren(), this.isClean());
               this.leftPlayerInfo_ = null;
            }

            return this.leftPlayerInfoBuilder_;
         }

         public boolean hasRightPlayerInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.PlayerInfo getRightPlayerInfo() {
            if (this.rightPlayerInfoBuilder_ == null) {
               return this.rightPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.rightPlayerInfo_;
            } else {
               return (CommonMsg.PlayerInfo)this.rightPlayerInfoBuilder_.getMessage();
            }
         }

         public Builder setRightPlayerInfo(CommonMsg.PlayerInfo value) {
            if (this.rightPlayerInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.rightPlayerInfo_ = value;
               this.onChanged();
            } else {
               this.rightPlayerInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setRightPlayerInfo(CommonMsg.PlayerInfo.Builder builderForValue) {
            if (this.rightPlayerInfoBuilder_ == null) {
               this.rightPlayerInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.rightPlayerInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeRightPlayerInfo(CommonMsg.PlayerInfo value) {
            if (this.rightPlayerInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.rightPlayerInfo_ != null && this.rightPlayerInfo_ != CommonMsg.PlayerInfo.getDefaultInstance()) {
                  this.rightPlayerInfo_ = CommonMsg.PlayerInfo.newBuilder(this.rightPlayerInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.rightPlayerInfo_ = value;
               }

               this.onChanged();
            } else {
               this.rightPlayerInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearRightPlayerInfo() {
            if (this.rightPlayerInfoBuilder_ == null) {
               this.rightPlayerInfo_ = null;
               this.onChanged();
            } else {
               this.rightPlayerInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.PlayerInfo.Builder getRightPlayerInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.PlayerInfo.Builder)this.getRightPlayerInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.PlayerInfoOrBuilder getRightPlayerInfoOrBuilder() {
            if (this.rightPlayerInfoBuilder_ != null) {
               return (CommonMsg.PlayerInfoOrBuilder)this.rightPlayerInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.rightPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.rightPlayerInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> getRightPlayerInfoFieldBuilder() {
            if (this.rightPlayerInfoBuilder_ == null) {
               this.rightPlayerInfoBuilder_ = new SingleFieldBuilderV3(this.getRightPlayerInfo(), this.getParentForChildren(), this.isClean());
               this.rightPlayerInfo_ = null;
            }

            return this.rightPlayerInfoBuilder_;
         }

         public boolean hasRecordId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getRecordId() {
            return this.recordId_;
         }

         public Builder setRecordId(int value) {
            this.bitField0_ |= 4;
            this.recordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecordId() {
            this.bitField0_ &= -5;
            this.recordId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasWin() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getWin() {
            return this.win_;
         }

         public Builder setWin(int value) {
            this.bitField0_ |= 8;
            this.win_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWin() {
            this.bitField0_ &= -9;
            this.win_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStartTime() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getStartTime() {
            return this.startTime_;
         }

         public Builder setStartTime(int value) {
            this.bitField0_ |= 16;
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTime() {
            this.bitField0_ &= -17;
            this.startTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 32) != 0;
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

            this.bitField0_ |= 32;
            return this;
         }

         public Builder setResult(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.resultBuilder_ == null) {
               this.result_ = builderForValue.build();
               this.onChanged();
            } else {
               this.resultBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder mergeResult(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.resultBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0 && this.result_ != null && this.result_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.result_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.result_).mergeFrom(value).buildPartial();
               } else {
                  this.result_ = value;
               }

               this.onChanged();
            } else {
               this.resultBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder clearResult() {
            if (this.resultBuilder_ == null) {
               this.result_ = null;
               this.onChanged();
            } else {
               this.resultBuilder_.clear();
            }

            this.bitField0_ &= -33;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getResultBuilder() {
            this.bitField0_ |= 32;
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

   public static final class GroupFightData extends GeneratedMessageV3 implements GroupFightDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INDEX_FIELD_NUMBER = 1;
      private int index_;
      public static final int LEFTNAME_FIELD_NUMBER = 2;
      private volatile Object leftName_;
      public static final int RIGHTNAME_FIELD_NUMBER = 3;
      private volatile Object rightName_;
      public static final int RECORDID_FIELD_NUMBER = 4;
      private int recordId_;
      public static final int WIN_FIELD_NUMBER = 5;
      private int win_;
      public static final int LEFTHEAD_FIELD_NUMBER = 6;
      private int leftHead_;
      public static final int RIGHTHEAD_FIELD_NUMBER = 7;
      private int rightHead_;
      public static final int STARTTIME_FIELD_NUMBER = 8;
      private int startTime_;
      public static final int LEFTSERVERID_FIELD_NUMBER = 9;
      private int leftServerId_;
      public static final int LEFTPLAYERID_FIELD_NUMBER = 10;
      private int leftPlayerId_;
      public static final int RIGHTSERVERID_FIELD_NUMBER = 11;
      private int rightServerId_;
      public static final int RIGHTPLAYERID_FIELD_NUMBER = 12;
      private int rightPlayerId_;
      private byte memoizedIsInitialized;
      private static final GroupFightData DEFAULT_INSTANCE = new GroupFightData();
      /** @deprecated */
      @Deprecated
      public static final Parser<GroupFightData> PARSER = new AbstractParser<GroupFightData>() {
         public GroupFightData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new GroupFightData(input, extensionRegistry);
         }
      };

      private GroupFightData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private GroupFightData() {
         this.memoizedIsInitialized = -1;
         this.leftName_ = "";
         this.rightName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new GroupFightData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private GroupFightData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.index_ = input.readInt32();
                        break;
                     case 18:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.leftName_ = bs;
                        break;
                     case 26:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.rightName_ = bs;
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.recordId_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.win_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.leftHead_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.rightHead_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.startTime_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.leftServerId_ = input.readInt32();
                        break;
                     case 80:
                        this.bitField0_ |= 512;
                        this.leftPlayerId_ = input.readInt32();
                        break;
                     case 88:
                        this.bitField0_ |= 1024;
                        this.rightServerId_ = input.readInt32();
                        break;
                     case 96:
                        this.bitField0_ |= 2048;
                        this.rightPlayerId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_GroupFightData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_GroupFightData_fieldAccessorTable.ensureFieldAccessorsInitialized(GroupFightData.class, Builder.class);
      }

      public boolean hasIndex() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getIndex() {
         return this.index_;
      }

      public boolean hasLeftName() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getLeftName() {
         Object ref = this.leftName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.leftName_ = s;
            }

            return s;
         }
      }

      public ByteString getLeftNameBytes() {
         Object ref = this.leftName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.leftName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasRightName() {
         return (this.bitField0_ & 4) != 0;
      }

      public String getRightName() {
         Object ref = this.rightName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.rightName_ = s;
            }

            return s;
         }
      }

      public ByteString getRightNameBytes() {
         Object ref = this.rightName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.rightName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getRecordId() {
         return this.recordId_;
      }

      public boolean hasWin() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getWin() {
         return this.win_;
      }

      public boolean hasLeftHead() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getLeftHead() {
         return this.leftHead_;
      }

      public boolean hasRightHead() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getRightHead() {
         return this.rightHead_;
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
      }

      public boolean hasLeftServerId() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getLeftServerId() {
         return this.leftServerId_;
      }

      public boolean hasLeftPlayerId() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getLeftPlayerId() {
         return this.leftPlayerId_;
      }

      public boolean hasRightServerId() {
         return (this.bitField0_ & 1024) != 0;
      }

      public int getRightServerId() {
         return this.rightServerId_;
      }

      public boolean hasRightPlayerId() {
         return (this.bitField0_ & 2048) != 0;
      }

      public int getRightPlayerId() {
         return this.rightPlayerId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIndex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLeftName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRightName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.index_);
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.leftName_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.rightName_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.recordId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.win_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.leftHead_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.rightHead_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.startTime_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.leftServerId_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(10, this.leftPlayerId_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            output.writeInt32(11, this.rightServerId_);
         }

         if ((this.bitField0_ & 2048) != 0) {
            output.writeInt32(12, this.rightPlayerId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.index_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(2, this.leftName_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.rightName_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.recordId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.win_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.leftHead_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.rightHead_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.startTime_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.leftServerId_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.leftPlayerId_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.rightServerId_);
            }

            if ((this.bitField0_ & 2048) != 0) {
               size += CodedOutputStream.computeInt32Size(12, this.rightPlayerId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof GroupFightData)) {
            return super.equals(obj);
         } else {
            GroupFightData other = (GroupFightData)obj;
            if (this.hasIndex() != other.hasIndex()) {
               return false;
            } else if (this.hasIndex() && this.getIndex() != other.getIndex()) {
               return false;
            } else if (this.hasLeftName() != other.hasLeftName()) {
               return false;
            } else if (this.hasLeftName() && !this.getLeftName().equals(other.getLeftName())) {
               return false;
            } else if (this.hasRightName() != other.hasRightName()) {
               return false;
            } else if (this.hasRightName() && !this.getRightName().equals(other.getRightName())) {
               return false;
            } else if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
               return false;
            } else if (this.hasWin() != other.hasWin()) {
               return false;
            } else if (this.hasWin() && this.getWin() != other.getWin()) {
               return false;
            } else if (this.hasLeftHead() != other.hasLeftHead()) {
               return false;
            } else if (this.hasLeftHead() && this.getLeftHead() != other.getLeftHead()) {
               return false;
            } else if (this.hasRightHead() != other.hasRightHead()) {
               return false;
            } else if (this.hasRightHead() && this.getRightHead() != other.getRightHead()) {
               return false;
            } else if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else if (this.hasLeftServerId() != other.hasLeftServerId()) {
               return false;
            } else if (this.hasLeftServerId() && this.getLeftServerId() != other.getLeftServerId()) {
               return false;
            } else if (this.hasLeftPlayerId() != other.hasLeftPlayerId()) {
               return false;
            } else if (this.hasLeftPlayerId() && this.getLeftPlayerId() != other.getLeftPlayerId()) {
               return false;
            } else if (this.hasRightServerId() != other.hasRightServerId()) {
               return false;
            } else if (this.hasRightServerId() && this.getRightServerId() != other.getRightServerId()) {
               return false;
            } else if (this.hasRightPlayerId() != other.hasRightPlayerId()) {
               return false;
            } else if (this.hasRightPlayerId() && this.getRightPlayerId() != other.getRightPlayerId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasIndex()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIndex();
            }

            if (this.hasLeftName()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLeftName().hashCode();
            }

            if (this.hasRightName()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRightName().hashCode();
            }

            if (this.hasRecordId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getRecordId();
            }

            if (this.hasWin()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getWin();
            }

            if (this.hasLeftHead()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getLeftHead();
            }

            if (this.hasRightHead()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getRightHead();
            }

            if (this.hasStartTime()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getStartTime();
            }

            if (this.hasLeftServerId()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getLeftServerId();
            }

            if (this.hasLeftPlayerId()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getLeftPlayerId();
            }

            if (this.hasRightServerId()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getRightServerId();
            }

            if (this.hasRightPlayerId()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getRightPlayerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static GroupFightData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (GroupFightData)PARSER.parseFrom(data);
      }

      public static GroupFightData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GroupFightData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GroupFightData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (GroupFightData)PARSER.parseFrom(data);
      }

      public static GroupFightData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GroupFightData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GroupFightData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (GroupFightData)PARSER.parseFrom(data);
      }

      public static GroupFightData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GroupFightData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GroupFightData parseFrom(InputStream input) throws IOException {
         return (GroupFightData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GroupFightData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GroupFightData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static GroupFightData parseDelimitedFrom(InputStream input) throws IOException {
         return (GroupFightData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static GroupFightData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GroupFightData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static GroupFightData parseFrom(CodedInputStream input) throws IOException {
         return (GroupFightData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GroupFightData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GroupFightData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(GroupFightData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static GroupFightData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<GroupFightData> parser() {
         return PARSER;
      }

      public Parser<GroupFightData> getParserForType() {
         return PARSER;
      }

      public GroupFightData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GroupFightDataOrBuilder {
         private int bitField0_;
         private int index_;
         private Object leftName_;
         private Object rightName_;
         private int recordId_;
         private int win_;
         private int leftHead_;
         private int rightHead_;
         private int startTime_;
         private int leftServerId_;
         private int leftPlayerId_;
         private int rightServerId_;
         private int rightPlayerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_GroupFightData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_GroupFightData_fieldAccessorTable.ensureFieldAccessorsInitialized(GroupFightData.class, Builder.class);
         }

         private Builder() {
            this.leftName_ = "";
            this.rightName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.leftName_ = "";
            this.rightName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.GroupFightData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.index_ = 0;
            this.bitField0_ &= -2;
            this.leftName_ = "";
            this.bitField0_ &= -3;
            this.rightName_ = "";
            this.bitField0_ &= -5;
            this.recordId_ = 0;
            this.bitField0_ &= -9;
            this.win_ = 0;
            this.bitField0_ &= -17;
            this.leftHead_ = 0;
            this.bitField0_ &= -33;
            this.rightHead_ = 0;
            this.bitField0_ &= -65;
            this.startTime_ = 0;
            this.bitField0_ &= -129;
            this.leftServerId_ = 0;
            this.bitField0_ &= -257;
            this.leftPlayerId_ = 0;
            this.bitField0_ &= -513;
            this.rightServerId_ = 0;
            this.bitField0_ &= -1025;
            this.rightPlayerId_ = 0;
            this.bitField0_ &= -2049;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_GroupFightData_descriptor;
         }

         public GroupFightData getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.GroupFightData.getDefaultInstance();
         }

         public GroupFightData build() {
            GroupFightData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public GroupFightData buildPartial() {
            GroupFightData result = new GroupFightData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.index_ = this.index_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.leftName_ = this.leftName_;
            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.rightName_ = this.rightName_;
            if ((from_bitField0_ & 8) != 0) {
               result.recordId_ = this.recordId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.win_ = this.win_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.leftHead_ = this.leftHead_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.rightHead_ = this.rightHead_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.startTime_ = this.startTime_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.leftServerId_ = this.leftServerId_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.leftPlayerId_ = this.leftPlayerId_;
               to_bitField0_ |= 512;
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.rightServerId_ = this.rightServerId_;
               to_bitField0_ |= 1024;
            }

            if ((from_bitField0_ & 2048) != 0) {
               result.rightPlayerId_ = this.rightPlayerId_;
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
            if (other instanceof GroupFightData) {
               return this.mergeFrom((GroupFightData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(GroupFightData other) {
            if (other == KingOfCentralPlainsMsg.GroupFightData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIndex()) {
                  this.setIndex(other.getIndex());
               }

               if (other.hasLeftName()) {
                  this.bitField0_ |= 2;
                  this.leftName_ = other.leftName_;
                  this.onChanged();
               }

               if (other.hasRightName()) {
                  this.bitField0_ |= 4;
                  this.rightName_ = other.rightName_;
                  this.onChanged();
               }

               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               if (other.hasWin()) {
                  this.setWin(other.getWin());
               }

               if (other.hasLeftHead()) {
                  this.setLeftHead(other.getLeftHead());
               }

               if (other.hasRightHead()) {
                  this.setRightHead(other.getRightHead());
               }

               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               if (other.hasLeftServerId()) {
                  this.setLeftServerId(other.getLeftServerId());
               }

               if (other.hasLeftPlayerId()) {
                  this.setLeftPlayerId(other.getLeftPlayerId());
               }

               if (other.hasRightServerId()) {
                  this.setRightServerId(other.getRightServerId());
               }

               if (other.hasRightPlayerId()) {
                  this.setRightPlayerId(other.getRightPlayerId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasIndex()) {
               return false;
            } else if (!this.hasLeftName()) {
               return false;
            } else {
               return this.hasRightName();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            GroupFightData parsedMessage = null;

            try {
               parsedMessage = (GroupFightData)KingOfCentralPlainsMsg.GroupFightData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (GroupFightData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIndex() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getIndex() {
            return this.index_;
         }

         public Builder setIndex(int value) {
            this.bitField0_ |= 1;
            this.index_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIndex() {
            this.bitField0_ &= -2;
            this.index_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLeftName() {
            return (this.bitField0_ & 2) != 0;
         }

         public String getLeftName() {
            Object ref = this.leftName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.leftName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getLeftNameBytes() {
            Object ref = this.leftName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.leftName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setLeftName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.leftName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearLeftName() {
            this.bitField0_ &= -3;
            this.leftName_ = KingOfCentralPlainsMsg.GroupFightData.getDefaultInstance().getLeftName();
            this.onChanged();
            return this;
         }

         public Builder setLeftNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.leftName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasRightName() {
            return (this.bitField0_ & 4) != 0;
         }

         public String getRightName() {
            Object ref = this.rightName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.rightName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getRightNameBytes() {
            Object ref = this.rightName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.rightName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setRightName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.rightName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearRightName() {
            this.bitField0_ &= -5;
            this.rightName_ = KingOfCentralPlainsMsg.GroupFightData.getDefaultInstance().getRightName();
            this.onChanged();
            return this;
         }

         public Builder setRightNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.rightName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasRecordId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getRecordId() {
            return this.recordId_;
         }

         public Builder setRecordId(int value) {
            this.bitField0_ |= 8;
            this.recordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecordId() {
            this.bitField0_ &= -9;
            this.recordId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasWin() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getWin() {
            return this.win_;
         }

         public Builder setWin(int value) {
            this.bitField0_ |= 16;
            this.win_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWin() {
            this.bitField0_ &= -17;
            this.win_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLeftHead() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getLeftHead() {
            return this.leftHead_;
         }

         public Builder setLeftHead(int value) {
            this.bitField0_ |= 32;
            this.leftHead_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLeftHead() {
            this.bitField0_ &= -33;
            this.leftHead_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRightHead() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getRightHead() {
            return this.rightHead_;
         }

         public Builder setRightHead(int value) {
            this.bitField0_ |= 64;
            this.rightHead_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRightHead() {
            this.bitField0_ &= -65;
            this.rightHead_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStartTime() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getStartTime() {
            return this.startTime_;
         }

         public Builder setStartTime(int value) {
            this.bitField0_ |= 128;
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTime() {
            this.bitField0_ &= -129;
            this.startTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLeftServerId() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getLeftServerId() {
            return this.leftServerId_;
         }

         public Builder setLeftServerId(int value) {
            this.bitField0_ |= 256;
            this.leftServerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLeftServerId() {
            this.bitField0_ &= -257;
            this.leftServerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLeftPlayerId() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getLeftPlayerId() {
            return this.leftPlayerId_;
         }

         public Builder setLeftPlayerId(int value) {
            this.bitField0_ |= 512;
            this.leftPlayerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLeftPlayerId() {
            this.bitField0_ &= -513;
            this.leftPlayerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRightServerId() {
            return (this.bitField0_ & 1024) != 0;
         }

         public int getRightServerId() {
            return this.rightServerId_;
         }

         public Builder setRightServerId(int value) {
            this.bitField0_ |= 1024;
            this.rightServerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRightServerId() {
            this.bitField0_ &= -1025;
            this.rightServerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRightPlayerId() {
            return (this.bitField0_ & 2048) != 0;
         }

         public int getRightPlayerId() {
            return this.rightPlayerId_;
         }

         public Builder setRightPlayerId(int value) {
            this.bitField0_ |= 2048;
            this.rightPlayerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRightPlayerId() {
            this.bitField0_ &= -2049;
            this.rightPlayerId_ = 0;
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

   public static final class C2S_MyFightUi_9601 extends GeneratedMessageV3 implements C2S_MyFightUi_9601OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_MyFightUi_9601 DEFAULT_INSTANCE = new C2S_MyFightUi_9601();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MyFightUi_9601> PARSER = new AbstractParser<C2S_MyFightUi_9601>() {
         public C2S_MyFightUi_9601 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MyFightUi_9601(input, extensionRegistry);
         }
      };

      private C2S_MyFightUi_9601(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MyFightUi_9601() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MyFightUi_9601();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MyFightUi_9601(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_MyFightUi_9601_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_MyFightUi_9601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MyFightUi_9601.class, Builder.class);
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
         } else if (!(obj instanceof C2S_MyFightUi_9601)) {
            return super.equals(obj);
         } else {
            C2S_MyFightUi_9601 other = (C2S_MyFightUi_9601)obj;
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

      public static C2S_MyFightUi_9601 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MyFightUi_9601)PARSER.parseFrom(data);
      }

      public static C2S_MyFightUi_9601 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MyFightUi_9601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MyFightUi_9601 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MyFightUi_9601)PARSER.parseFrom(data);
      }

      public static C2S_MyFightUi_9601 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MyFightUi_9601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MyFightUi_9601 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MyFightUi_9601)PARSER.parseFrom(data);
      }

      public static C2S_MyFightUi_9601 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MyFightUi_9601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MyFightUi_9601 parseFrom(InputStream input) throws IOException {
         return (C2S_MyFightUi_9601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MyFightUi_9601 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MyFightUi_9601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MyFightUi_9601 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MyFightUi_9601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MyFightUi_9601 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MyFightUi_9601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MyFightUi_9601 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MyFightUi_9601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MyFightUi_9601 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MyFightUi_9601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MyFightUi_9601 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MyFightUi_9601 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MyFightUi_9601> parser() {
         return PARSER;
      }

      public Parser<C2S_MyFightUi_9601> getParserForType() {
         return PARSER;
      }

      public C2S_MyFightUi_9601 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MyFightUi_9601OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_MyFightUi_9601_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_MyFightUi_9601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MyFightUi_9601.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.C2S_MyFightUi_9601.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_MyFightUi_9601_descriptor;
         }

         public C2S_MyFightUi_9601 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.C2S_MyFightUi_9601.getDefaultInstance();
         }

         public C2S_MyFightUi_9601 build() {
            C2S_MyFightUi_9601 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MyFightUi_9601 buildPartial() {
            C2S_MyFightUi_9601 result = new C2S_MyFightUi_9601(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_MyFightUi_9601) {
               return this.mergeFrom((C2S_MyFightUi_9601)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MyFightUi_9601 other) {
            if (other == KingOfCentralPlainsMsg.C2S_MyFightUi_9601.getDefaultInstance()) {
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
            C2S_MyFightUi_9601 parsedMessage = null;

            try {
               parsedMessage = (C2S_MyFightUi_9601)KingOfCentralPlainsMsg.C2S_MyFightUi_9601.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MyFightUi_9601)e.getUnfinishedMessage();
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

   public static final class S2C_MyFightResult_9602 extends GeneratedMessageV3 implements S2C_MyFightResult_9602OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FIGHT_FIELD_NUMBER = 1;
      private FightData fight_;
      private byte memoizedIsInitialized;
      private static final S2C_MyFightResult_9602 DEFAULT_INSTANCE = new S2C_MyFightResult_9602();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MyFightResult_9602> PARSER = new AbstractParser<S2C_MyFightResult_9602>() {
         public S2C_MyFightResult_9602 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MyFightResult_9602(input, extensionRegistry);
         }
      };

      private S2C_MyFightResult_9602(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MyFightResult_9602() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MyFightResult_9602();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MyFightResult_9602(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        FightData.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.fight_.toBuilder();
                        }

                        this.fight_ = (FightData)input.readMessage(KingOfCentralPlainsMsg.FightData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.fight_);
                           this.fight_ = subBuilder.buildPartial();
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_MyFightResult_9602_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_MyFightResult_9602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MyFightResult_9602.class, Builder.class);
      }

      public boolean hasFight() {
         return (this.bitField0_ & 1) != 0;
      }

      public FightData getFight() {
         return this.fight_ == null ? KingOfCentralPlainsMsg.FightData.getDefaultInstance() : this.fight_;
      }

      public FightDataOrBuilder getFightOrBuilder() {
         return this.fight_ == null ? KingOfCentralPlainsMsg.FightData.getDefaultInstance() : this.fight_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFight()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getFight().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getFight());
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
               size += CodedOutputStream.computeMessageSize(1, this.getFight());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MyFightResult_9602)) {
            return super.equals(obj);
         } else {
            S2C_MyFightResult_9602 other = (S2C_MyFightResult_9602)obj;
            if (this.hasFight() != other.hasFight()) {
               return false;
            } else if (this.hasFight() && !this.getFight().equals(other.getFight())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasFight()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFight().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MyFightResult_9602 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MyFightResult_9602)PARSER.parseFrom(data);
      }

      public static S2C_MyFightResult_9602 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MyFightResult_9602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MyFightResult_9602 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MyFightResult_9602)PARSER.parseFrom(data);
      }

      public static S2C_MyFightResult_9602 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MyFightResult_9602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MyFightResult_9602 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MyFightResult_9602)PARSER.parseFrom(data);
      }

      public static S2C_MyFightResult_9602 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MyFightResult_9602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MyFightResult_9602 parseFrom(InputStream input) throws IOException {
         return (S2C_MyFightResult_9602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MyFightResult_9602 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MyFightResult_9602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MyFightResult_9602 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MyFightResult_9602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MyFightResult_9602 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MyFightResult_9602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MyFightResult_9602 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MyFightResult_9602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MyFightResult_9602 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MyFightResult_9602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MyFightResult_9602 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MyFightResult_9602 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MyFightResult_9602> parser() {
         return PARSER;
      }

      public Parser<S2C_MyFightResult_9602> getParserForType() {
         return PARSER;
      }

      public S2C_MyFightResult_9602 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MyFightResult_9602OrBuilder {
         private int bitField0_;
         private FightData fight_;
         private SingleFieldBuilderV3<FightData, FightData.Builder, FightDataOrBuilder> fightBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_MyFightResult_9602_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_MyFightResult_9602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MyFightResult_9602.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.S2C_MyFightResult_9602.alwaysUseFieldBuilders) {
               this.getFightFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.fightBuilder_ == null) {
               this.fight_ = null;
            } else {
               this.fightBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_MyFightResult_9602_descriptor;
         }

         public S2C_MyFightResult_9602 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.S2C_MyFightResult_9602.getDefaultInstance();
         }

         public S2C_MyFightResult_9602 build() {
            S2C_MyFightResult_9602 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MyFightResult_9602 buildPartial() {
            S2C_MyFightResult_9602 result = new S2C_MyFightResult_9602(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.fightBuilder_ == null) {
                  result.fight_ = this.fight_;
               } else {
                  result.fight_ = (FightData)this.fightBuilder_.build();
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
            if (other instanceof S2C_MyFightResult_9602) {
               return this.mergeFrom((S2C_MyFightResult_9602)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MyFightResult_9602 other) {
            if (other == KingOfCentralPlainsMsg.S2C_MyFightResult_9602.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFight()) {
                  this.mergeFight(other.getFight());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFight()) {
               return false;
            } else {
               return this.getFight().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MyFightResult_9602 parsedMessage = null;

            try {
               parsedMessage = (S2C_MyFightResult_9602)KingOfCentralPlainsMsg.S2C_MyFightResult_9602.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MyFightResult_9602)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFight() {
            return (this.bitField0_ & 1) != 0;
         }

         public FightData getFight() {
            if (this.fightBuilder_ == null) {
               return this.fight_ == null ? KingOfCentralPlainsMsg.FightData.getDefaultInstance() : this.fight_;
            } else {
               return (FightData)this.fightBuilder_.getMessage();
            }
         }

         public Builder setFight(FightData value) {
            if (this.fightBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.fight_ = value;
               this.onChanged();
            } else {
               this.fightBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setFight(FightData.Builder builderForValue) {
            if (this.fightBuilder_ == null) {
               this.fight_ = builderForValue.build();
               this.onChanged();
            } else {
               this.fightBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeFight(FightData value) {
            if (this.fightBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.fight_ != null && this.fight_ != KingOfCentralPlainsMsg.FightData.getDefaultInstance()) {
                  this.fight_ = KingOfCentralPlainsMsg.FightData.newBuilder(this.fight_).mergeFrom(value).buildPartial();
               } else {
                  this.fight_ = value;
               }

               this.onChanged();
            } else {
               this.fightBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearFight() {
            if (this.fightBuilder_ == null) {
               this.fight_ = null;
               this.onChanged();
            } else {
               this.fightBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public FightData.Builder getFightBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (FightData.Builder)this.getFightFieldBuilder().getBuilder();
         }

         public FightDataOrBuilder getFightOrBuilder() {
            if (this.fightBuilder_ != null) {
               return (FightDataOrBuilder)this.fightBuilder_.getMessageOrBuilder();
            } else {
               return this.fight_ == null ? KingOfCentralPlainsMsg.FightData.getDefaultInstance() : this.fight_;
            }
         }

         private SingleFieldBuilderV3<FightData, FightData.Builder, FightDataOrBuilder> getFightFieldBuilder() {
            if (this.fightBuilder_ == null) {
               this.fightBuilder_ = new SingleFieldBuilderV3(this.getFight(), this.getParentForChildren(), this.isClean());
               this.fight_ = null;
            }

            return this.fightBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class FightRecordInfo extends GeneratedMessageV3 implements FightRecordInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ROND_FIELD_NUMBER = 1;
      private int rond_;
      public static final int LEFTID_FIELD_NUMBER = 2;
      private int leftId_;
      public static final int RIGHTID_FIELD_NUMBER = 3;
      private int rightId_;
      public static final int LEFTNAME_FIELD_NUMBER = 4;
      private volatile Object leftName_;
      public static final int RIGHTNAME_FIELD_NUMBER = 5;
      private volatile Object rightName_;
      public static final int LEFTHEAD_FIELD_NUMBER = 6;
      private int leftHead_;
      public static final int RIGHTHEAD_FIELD_NUMBER = 7;
      private int rightHead_;
      public static final int WIN_FIELD_NUMBER = 8;
      private int win_;
      public static final int SOCRE_FIELD_NUMBER = 9;
      private int socre_;
      public static final int RECORDID_FIELD_NUMBER = 10;
      private int recordId_;
      public static final int STARTTIME_FIELD_NUMBER = 11;
      private int startTime_;
      private byte memoizedIsInitialized;
      private static final FightRecordInfo DEFAULT_INSTANCE = new FightRecordInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<FightRecordInfo> PARSER = new AbstractParser<FightRecordInfo>() {
         public FightRecordInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new FightRecordInfo(input, extensionRegistry);
         }
      };

      private FightRecordInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private FightRecordInfo() {
         this.memoizedIsInitialized = -1;
         this.leftName_ = "";
         this.rightName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new FightRecordInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private FightRecordInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.rond_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.leftId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.rightId_ = input.readInt32();
                        break;
                     case 34:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 8;
                        this.leftName_ = bs;
                        break;
                     case 42:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 16;
                        this.rightName_ = bs;
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.leftHead_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.rightHead_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.win_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.socre_ = input.readInt32();
                        break;
                     case 80:
                        this.bitField0_ |= 512;
                        this.recordId_ = input.readInt32();
                        break;
                     case 88:
                        this.bitField0_ |= 1024;
                        this.startTime_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightRecordInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightRecordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(FightRecordInfo.class, Builder.class);
      }

      public boolean hasRond() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRond() {
         return this.rond_;
      }

      public boolean hasLeftId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLeftId() {
         return this.leftId_;
      }

      public boolean hasRightId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getRightId() {
         return this.rightId_;
      }

      public boolean hasLeftName() {
         return (this.bitField0_ & 8) != 0;
      }

      public String getLeftName() {
         Object ref = this.leftName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.leftName_ = s;
            }

            return s;
         }
      }

      public ByteString getLeftNameBytes() {
         Object ref = this.leftName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.leftName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasRightName() {
         return (this.bitField0_ & 16) != 0;
      }

      public String getRightName() {
         Object ref = this.rightName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.rightName_ = s;
            }

            return s;
         }
      }

      public ByteString getRightNameBytes() {
         Object ref = this.rightName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.rightName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasLeftHead() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getLeftHead() {
         return this.leftHead_;
      }

      public boolean hasRightHead() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getRightHead() {
         return this.rightHead_;
      }

      public boolean hasWin() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getWin() {
         return this.win_;
      }

      public boolean hasSocre() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getSocre() {
         return this.socre_;
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getRecordId() {
         return this.recordId_;
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 1024) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRond()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLeftId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRightId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLeftName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRightName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLeftHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRightHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasWin()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSocre()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRecordId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStartTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.rond_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.leftId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.rightId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            GeneratedMessageV3.writeString(output, 4, this.leftName_);
         }

         if ((this.bitField0_ & 16) != 0) {
            GeneratedMessageV3.writeString(output, 5, this.rightName_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.leftHead_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.rightHead_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.win_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.socre_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(10, this.recordId_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            output.writeInt32(11, this.startTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.rond_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.leftId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.rightId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += GeneratedMessageV3.computeStringSize(4, this.leftName_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += GeneratedMessageV3.computeStringSize(5, this.rightName_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.leftHead_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.rightHead_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.win_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.socre_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.recordId_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.startTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof FightRecordInfo)) {
            return super.equals(obj);
         } else {
            FightRecordInfo other = (FightRecordInfo)obj;
            if (this.hasRond() != other.hasRond()) {
               return false;
            } else if (this.hasRond() && this.getRond() != other.getRond()) {
               return false;
            } else if (this.hasLeftId() != other.hasLeftId()) {
               return false;
            } else if (this.hasLeftId() && this.getLeftId() != other.getLeftId()) {
               return false;
            } else if (this.hasRightId() != other.hasRightId()) {
               return false;
            } else if (this.hasRightId() && this.getRightId() != other.getRightId()) {
               return false;
            } else if (this.hasLeftName() != other.hasLeftName()) {
               return false;
            } else if (this.hasLeftName() && !this.getLeftName().equals(other.getLeftName())) {
               return false;
            } else if (this.hasRightName() != other.hasRightName()) {
               return false;
            } else if (this.hasRightName() && !this.getRightName().equals(other.getRightName())) {
               return false;
            } else if (this.hasLeftHead() != other.hasLeftHead()) {
               return false;
            } else if (this.hasLeftHead() && this.getLeftHead() != other.getLeftHead()) {
               return false;
            } else if (this.hasRightHead() != other.hasRightHead()) {
               return false;
            } else if (this.hasRightHead() && this.getRightHead() != other.getRightHead()) {
               return false;
            } else if (this.hasWin() != other.hasWin()) {
               return false;
            } else if (this.hasWin() && this.getWin() != other.getWin()) {
               return false;
            } else if (this.hasSocre() != other.hasSocre()) {
               return false;
            } else if (this.hasSocre() && this.getSocre() != other.getSocre()) {
               return false;
            } else if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
               return false;
            } else if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasRond()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRond();
            }

            if (this.hasLeftId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLeftId();
            }

            if (this.hasRightId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRightId();
            }

            if (this.hasLeftName()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getLeftName().hashCode();
            }

            if (this.hasRightName()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getRightName().hashCode();
            }

            if (this.hasLeftHead()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getLeftHead();
            }

            if (this.hasRightHead()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getRightHead();
            }

            if (this.hasWin()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getWin();
            }

            if (this.hasSocre()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getSocre();
            }

            if (this.hasRecordId()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getRecordId();
            }

            if (this.hasStartTime()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getStartTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static FightRecordInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (FightRecordInfo)PARSER.parseFrom(data);
      }

      public static FightRecordInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FightRecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FightRecordInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (FightRecordInfo)PARSER.parseFrom(data);
      }

      public static FightRecordInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FightRecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FightRecordInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (FightRecordInfo)PARSER.parseFrom(data);
      }

      public static FightRecordInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FightRecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FightRecordInfo parseFrom(InputStream input) throws IOException {
         return (FightRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static FightRecordInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FightRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static FightRecordInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (FightRecordInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static FightRecordInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FightRecordInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static FightRecordInfo parseFrom(CodedInputStream input) throws IOException {
         return (FightRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static FightRecordInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FightRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(FightRecordInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static FightRecordInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<FightRecordInfo> parser() {
         return PARSER;
      }

      public Parser<FightRecordInfo> getParserForType() {
         return PARSER;
      }

      public FightRecordInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FightRecordInfoOrBuilder {
         private int bitField0_;
         private int rond_;
         private int leftId_;
         private int rightId_;
         private Object leftName_;
         private Object rightName_;
         private int leftHead_;
         private int rightHead_;
         private int win_;
         private int socre_;
         private int recordId_;
         private int startTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightRecordInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightRecordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(FightRecordInfo.class, Builder.class);
         }

         private Builder() {
            this.leftName_ = "";
            this.rightName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.leftName_ = "";
            this.rightName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.FightRecordInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rond_ = 0;
            this.bitField0_ &= -2;
            this.leftId_ = 0;
            this.bitField0_ &= -3;
            this.rightId_ = 0;
            this.bitField0_ &= -5;
            this.leftName_ = "";
            this.bitField0_ &= -9;
            this.rightName_ = "";
            this.bitField0_ &= -17;
            this.leftHead_ = 0;
            this.bitField0_ &= -33;
            this.rightHead_ = 0;
            this.bitField0_ &= -65;
            this.win_ = 0;
            this.bitField0_ &= -129;
            this.socre_ = 0;
            this.bitField0_ &= -257;
            this.recordId_ = 0;
            this.bitField0_ &= -513;
            this.startTime_ = 0;
            this.bitField0_ &= -1025;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightRecordInfo_descriptor;
         }

         public FightRecordInfo getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.FightRecordInfo.getDefaultInstance();
         }

         public FightRecordInfo build() {
            FightRecordInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public FightRecordInfo buildPartial() {
            FightRecordInfo result = new FightRecordInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rond_ = this.rond_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.leftId_ = this.leftId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.rightId_ = this.rightId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.leftName_ = this.leftName_;
            if ((from_bitField0_ & 16) != 0) {
               to_bitField0_ |= 16;
            }

            result.rightName_ = this.rightName_;
            if ((from_bitField0_ & 32) != 0) {
               result.leftHead_ = this.leftHead_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.rightHead_ = this.rightHead_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.win_ = this.win_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.socre_ = this.socre_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.recordId_ = this.recordId_;
               to_bitField0_ |= 512;
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.startTime_ = this.startTime_;
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
            if (other instanceof FightRecordInfo) {
               return this.mergeFrom((FightRecordInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(FightRecordInfo other) {
            if (other == KingOfCentralPlainsMsg.FightRecordInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRond()) {
                  this.setRond(other.getRond());
               }

               if (other.hasLeftId()) {
                  this.setLeftId(other.getLeftId());
               }

               if (other.hasRightId()) {
                  this.setRightId(other.getRightId());
               }

               if (other.hasLeftName()) {
                  this.bitField0_ |= 8;
                  this.leftName_ = other.leftName_;
                  this.onChanged();
               }

               if (other.hasRightName()) {
                  this.bitField0_ |= 16;
                  this.rightName_ = other.rightName_;
                  this.onChanged();
               }

               if (other.hasLeftHead()) {
                  this.setLeftHead(other.getLeftHead());
               }

               if (other.hasRightHead()) {
                  this.setRightHead(other.getRightHead());
               }

               if (other.hasWin()) {
                  this.setWin(other.getWin());
               }

               if (other.hasSocre()) {
                  this.setSocre(other.getSocre());
               }

               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRond()) {
               return false;
            } else if (!this.hasLeftId()) {
               return false;
            } else if (!this.hasRightId()) {
               return false;
            } else if (!this.hasLeftName()) {
               return false;
            } else if (!this.hasRightName()) {
               return false;
            } else if (!this.hasLeftHead()) {
               return false;
            } else if (!this.hasRightHead()) {
               return false;
            } else if (!this.hasWin()) {
               return false;
            } else if (!this.hasSocre()) {
               return false;
            } else if (!this.hasRecordId()) {
               return false;
            } else {
               return this.hasStartTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            FightRecordInfo parsedMessage = null;

            try {
               parsedMessage = (FightRecordInfo)KingOfCentralPlainsMsg.FightRecordInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (FightRecordInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRond() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRond() {
            return this.rond_;
         }

         public Builder setRond(int value) {
            this.bitField0_ |= 1;
            this.rond_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRond() {
            this.bitField0_ &= -2;
            this.rond_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLeftId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLeftId() {
            return this.leftId_;
         }

         public Builder setLeftId(int value) {
            this.bitField0_ |= 2;
            this.leftId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLeftId() {
            this.bitField0_ &= -3;
            this.leftId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRightId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getRightId() {
            return this.rightId_;
         }

         public Builder setRightId(int value) {
            this.bitField0_ |= 4;
            this.rightId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRightId() {
            this.bitField0_ &= -5;
            this.rightId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLeftName() {
            return (this.bitField0_ & 8) != 0;
         }

         public String getLeftName() {
            Object ref = this.leftName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.leftName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getLeftNameBytes() {
            Object ref = this.leftName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.leftName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setLeftName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.leftName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearLeftName() {
            this.bitField0_ &= -9;
            this.leftName_ = KingOfCentralPlainsMsg.FightRecordInfo.getDefaultInstance().getLeftName();
            this.onChanged();
            return this;
         }

         public Builder setLeftNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.leftName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasRightName() {
            return (this.bitField0_ & 16) != 0;
         }

         public String getRightName() {
            Object ref = this.rightName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.rightName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getRightNameBytes() {
            Object ref = this.rightName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.rightName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setRightName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16;
               this.rightName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearRightName() {
            this.bitField0_ &= -17;
            this.rightName_ = KingOfCentralPlainsMsg.FightRecordInfo.getDefaultInstance().getRightName();
            this.onChanged();
            return this;
         }

         public Builder setRightNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16;
               this.rightName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasLeftHead() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getLeftHead() {
            return this.leftHead_;
         }

         public Builder setLeftHead(int value) {
            this.bitField0_ |= 32;
            this.leftHead_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLeftHead() {
            this.bitField0_ &= -33;
            this.leftHead_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRightHead() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getRightHead() {
            return this.rightHead_;
         }

         public Builder setRightHead(int value) {
            this.bitField0_ |= 64;
            this.rightHead_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRightHead() {
            this.bitField0_ &= -65;
            this.rightHead_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasWin() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getWin() {
            return this.win_;
         }

         public Builder setWin(int value) {
            this.bitField0_ |= 128;
            this.win_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWin() {
            this.bitField0_ &= -129;
            this.win_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSocre() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getSocre() {
            return this.socre_;
         }

         public Builder setSocre(int value) {
            this.bitField0_ |= 256;
            this.socre_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSocre() {
            this.bitField0_ &= -257;
            this.socre_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRecordId() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getRecordId() {
            return this.recordId_;
         }

         public Builder setRecordId(int value) {
            this.bitField0_ |= 512;
            this.recordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecordId() {
            this.bitField0_ &= -513;
            this.recordId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStartTime() {
            return (this.bitField0_ & 1024) != 0;
         }

         public int getStartTime() {
            return this.startTime_;
         }

         public Builder setStartTime(int value) {
            this.bitField0_ |= 1024;
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTime() {
            this.bitField0_ &= -1025;
            this.startTime_ = 0;
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

   public static final class C2S_MyRecordUi_9603 extends GeneratedMessageV3 implements C2S_MyRecordUi_9603OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_MyRecordUi_9603 DEFAULT_INSTANCE = new C2S_MyRecordUi_9603();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MyRecordUi_9603> PARSER = new AbstractParser<C2S_MyRecordUi_9603>() {
         public C2S_MyRecordUi_9603 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MyRecordUi_9603(input, extensionRegistry);
         }
      };

      private C2S_MyRecordUi_9603(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MyRecordUi_9603() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MyRecordUi_9603();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MyRecordUi_9603(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_MyRecordUi_9603_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_MyRecordUi_9603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MyRecordUi_9603.class, Builder.class);
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
         } else if (!(obj instanceof C2S_MyRecordUi_9603)) {
            return super.equals(obj);
         } else {
            C2S_MyRecordUi_9603 other = (C2S_MyRecordUi_9603)obj;
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

      public static C2S_MyRecordUi_9603 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MyRecordUi_9603)PARSER.parseFrom(data);
      }

      public static C2S_MyRecordUi_9603 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MyRecordUi_9603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MyRecordUi_9603 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MyRecordUi_9603)PARSER.parseFrom(data);
      }

      public static C2S_MyRecordUi_9603 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MyRecordUi_9603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MyRecordUi_9603 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MyRecordUi_9603)PARSER.parseFrom(data);
      }

      public static C2S_MyRecordUi_9603 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MyRecordUi_9603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MyRecordUi_9603 parseFrom(InputStream input) throws IOException {
         return (C2S_MyRecordUi_9603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MyRecordUi_9603 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MyRecordUi_9603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MyRecordUi_9603 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MyRecordUi_9603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MyRecordUi_9603 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MyRecordUi_9603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MyRecordUi_9603 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MyRecordUi_9603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MyRecordUi_9603 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MyRecordUi_9603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MyRecordUi_9603 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MyRecordUi_9603 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MyRecordUi_9603> parser() {
         return PARSER;
      }

      public Parser<C2S_MyRecordUi_9603> getParserForType() {
         return PARSER;
      }

      public C2S_MyRecordUi_9603 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MyRecordUi_9603OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_MyRecordUi_9603_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_MyRecordUi_9603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MyRecordUi_9603.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.C2S_MyRecordUi_9603.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_MyRecordUi_9603_descriptor;
         }

         public C2S_MyRecordUi_9603 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.C2S_MyRecordUi_9603.getDefaultInstance();
         }

         public C2S_MyRecordUi_9603 build() {
            C2S_MyRecordUi_9603 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MyRecordUi_9603 buildPartial() {
            C2S_MyRecordUi_9603 result = new C2S_MyRecordUi_9603(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_MyRecordUi_9603) {
               return this.mergeFrom((C2S_MyRecordUi_9603)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MyRecordUi_9603 other) {
            if (other == KingOfCentralPlainsMsg.C2S_MyRecordUi_9603.getDefaultInstance()) {
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
            C2S_MyRecordUi_9603 parsedMessage = null;

            try {
               parsedMessage = (C2S_MyRecordUi_9603)KingOfCentralPlainsMsg.C2S_MyRecordUi_9603.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MyRecordUi_9603)e.getUnfinishedMessage();
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

   public static final class S2C_MyRecordResult_9604 extends GeneratedMessageV3 implements S2C_MyRecordResult_9604OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<FightRecordInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_MyRecordResult_9604 DEFAULT_INSTANCE = new S2C_MyRecordResult_9604();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MyRecordResult_9604> PARSER = new AbstractParser<S2C_MyRecordResult_9604>() {
         public S2C_MyRecordResult_9604 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MyRecordResult_9604(input, extensionRegistry);
         }
      };

      private S2C_MyRecordResult_9604(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MyRecordResult_9604() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MyRecordResult_9604();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MyRecordResult_9604(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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

                        this.infos_.add(input.readMessage(KingOfCentralPlainsMsg.FightRecordInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_MyRecordResult_9604_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_MyRecordResult_9604_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MyRecordResult_9604.class, Builder.class);
      }

      public List<FightRecordInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends FightRecordInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public FightRecordInfo getInfos(int index) {
         return (FightRecordInfo)this.infos_.get(index);
      }

      public FightRecordInfoOrBuilder getInfosOrBuilder(int index) {
         return (FightRecordInfoOrBuilder)this.infos_.get(index);
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
         } else if (!(obj instanceof S2C_MyRecordResult_9604)) {
            return super.equals(obj);
         } else {
            S2C_MyRecordResult_9604 other = (S2C_MyRecordResult_9604)obj;
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

      public static S2C_MyRecordResult_9604 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MyRecordResult_9604)PARSER.parseFrom(data);
      }

      public static S2C_MyRecordResult_9604 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MyRecordResult_9604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MyRecordResult_9604 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MyRecordResult_9604)PARSER.parseFrom(data);
      }

      public static S2C_MyRecordResult_9604 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MyRecordResult_9604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MyRecordResult_9604 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MyRecordResult_9604)PARSER.parseFrom(data);
      }

      public static S2C_MyRecordResult_9604 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MyRecordResult_9604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MyRecordResult_9604 parseFrom(InputStream input) throws IOException {
         return (S2C_MyRecordResult_9604)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MyRecordResult_9604 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MyRecordResult_9604)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MyRecordResult_9604 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MyRecordResult_9604)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MyRecordResult_9604 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MyRecordResult_9604)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MyRecordResult_9604 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MyRecordResult_9604)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MyRecordResult_9604 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MyRecordResult_9604)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MyRecordResult_9604 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MyRecordResult_9604 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MyRecordResult_9604> parser() {
         return PARSER;
      }

      public Parser<S2C_MyRecordResult_9604> getParserForType() {
         return PARSER;
      }

      public S2C_MyRecordResult_9604 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MyRecordResult_9604OrBuilder {
         private int bitField0_;
         private List<FightRecordInfo> infos_;
         private RepeatedFieldBuilderV3<FightRecordInfo, FightRecordInfo.Builder, FightRecordInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_MyRecordResult_9604_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_MyRecordResult_9604_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MyRecordResult_9604.class, Builder.class);
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
            if (KingOfCentralPlainsMsg.S2C_MyRecordResult_9604.alwaysUseFieldBuilders) {
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
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_MyRecordResult_9604_descriptor;
         }

         public S2C_MyRecordResult_9604 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.S2C_MyRecordResult_9604.getDefaultInstance();
         }

         public S2C_MyRecordResult_9604 build() {
            S2C_MyRecordResult_9604 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MyRecordResult_9604 buildPartial() {
            S2C_MyRecordResult_9604 result = new S2C_MyRecordResult_9604(this);
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
            if (other instanceof S2C_MyRecordResult_9604) {
               return this.mergeFrom((S2C_MyRecordResult_9604)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MyRecordResult_9604 other) {
            if (other == KingOfCentralPlainsMsg.S2C_MyRecordResult_9604.getDefaultInstance()) {
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
                     this.infosBuilder_ = KingOfCentralPlainsMsg.S2C_MyRecordResult_9604.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
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
            S2C_MyRecordResult_9604 parsedMessage = null;

            try {
               parsedMessage = (S2C_MyRecordResult_9604)KingOfCentralPlainsMsg.S2C_MyRecordResult_9604.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MyRecordResult_9604)e.getUnfinishedMessage();
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

         public List<FightRecordInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public FightRecordInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (FightRecordInfo)this.infos_.get(index) : (FightRecordInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, FightRecordInfo value) {
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

         public Builder setInfos(int index, FightRecordInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(FightRecordInfo value) {
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

         public Builder addInfos(int index, FightRecordInfo value) {
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

         public Builder addInfos(FightRecordInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, FightRecordInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends FightRecordInfo> values) {
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

         public FightRecordInfo.Builder getInfosBuilder(int index) {
            return (FightRecordInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public FightRecordInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (FightRecordInfoOrBuilder)this.infos_.get(index) : (FightRecordInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends FightRecordInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public FightRecordInfo.Builder addInfosBuilder() {
            return (FightRecordInfo.Builder)this.getInfosFieldBuilder().addBuilder(KingOfCentralPlainsMsg.FightRecordInfo.getDefaultInstance());
         }

         public FightRecordInfo.Builder addInfosBuilder(int index) {
            return (FightRecordInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, KingOfCentralPlainsMsg.FightRecordInfo.getDefaultInstance());
         }

         public List<FightRecordInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<FightRecordInfo, FightRecordInfo.Builder, FightRecordInfoOrBuilder> getInfosFieldBuilder() {
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

   public static final class GuessInfo extends GeneratedMessageV3 implements GuessInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int WAGERSIDE_FIELD_NUMBER = 3;
      private int wagerSide_;
      public static final int WAGERNUM_FIELD_NUMBER = 4;
      private int wagerNum_;
      private byte memoizedIsInitialized;
      private static final GuessInfo DEFAULT_INSTANCE = new GuessInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<GuessInfo> PARSER = new AbstractParser<GuessInfo>() {
         public GuessInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new GuessInfo(input, extensionRegistry);
         }
      };

      private GuessInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private GuessInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new GuessInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private GuessInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                     case 24:
                        this.bitField0_ |= 1;
                        this.wagerSide_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 2;
                        this.wagerNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GuessInfo.class, Builder.class);
      }

      public boolean hasWagerSide() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getWagerSide() {
         return this.wagerSide_;
      }

      public boolean hasWagerNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getWagerNum() {
         return this.wagerNum_;
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
            output.writeInt32(3, this.wagerSide_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(4, this.wagerNum_);
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
               size += CodedOutputStream.computeInt32Size(3, this.wagerSide_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.wagerNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof GuessInfo)) {
            return super.equals(obj);
         } else {
            GuessInfo other = (GuessInfo)obj;
            if (this.hasWagerSide() != other.hasWagerSide()) {
               return false;
            } else if (this.hasWagerSide() && this.getWagerSide() != other.getWagerSide()) {
               return false;
            } else if (this.hasWagerNum() != other.hasWagerNum()) {
               return false;
            } else if (this.hasWagerNum() && this.getWagerNum() != other.getWagerNum()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasWagerSide()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getWagerSide();
            }

            if (this.hasWagerNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getWagerNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static GuessInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (GuessInfo)PARSER.parseFrom(data);
      }

      public static GuessInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GuessInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GuessInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (GuessInfo)PARSER.parseFrom(data);
      }

      public static GuessInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GuessInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GuessInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (GuessInfo)PARSER.parseFrom(data);
      }

      public static GuessInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GuessInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GuessInfo parseFrom(InputStream input) throws IOException {
         return (GuessInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GuessInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GuessInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static GuessInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (GuessInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static GuessInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GuessInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static GuessInfo parseFrom(CodedInputStream input) throws IOException {
         return (GuessInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GuessInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GuessInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(GuessInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static GuessInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<GuessInfo> parser() {
         return PARSER;
      }

      public Parser<GuessInfo> getParserForType() {
         return PARSER;
      }

      public GuessInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GuessInfoOrBuilder {
         private int bitField0_;
         private int wagerSide_;
         private int wagerNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GuessInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.GuessInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.wagerSide_ = 0;
            this.bitField0_ &= -2;
            this.wagerNum_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessInfo_descriptor;
         }

         public GuessInfo getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.GuessInfo.getDefaultInstance();
         }

         public GuessInfo build() {
            GuessInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public GuessInfo buildPartial() {
            GuessInfo result = new GuessInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.wagerSide_ = this.wagerSide_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.wagerNum_ = this.wagerNum_;
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
            if (other instanceof GuessInfo) {
               return this.mergeFrom((GuessInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(GuessInfo other) {
            if (other == KingOfCentralPlainsMsg.GuessInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasWagerSide()) {
                  this.setWagerSide(other.getWagerSide());
               }

               if (other.hasWagerNum()) {
                  this.setWagerNum(other.getWagerNum());
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
            GuessInfo parsedMessage = null;

            try {
               parsedMessage = (GuessInfo)KingOfCentralPlainsMsg.GuessInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (GuessInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasWagerSide() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getWagerSide() {
            return this.wagerSide_;
         }

         public Builder setWagerSide(int value) {
            this.bitField0_ |= 1;
            this.wagerSide_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWagerSide() {
            this.bitField0_ &= -2;
            this.wagerSide_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasWagerNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getWagerNum() {
            return this.wagerNum_;
         }

         public Builder setWagerNum(int value) {
            this.bitField0_ |= 2;
            this.wagerNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWagerNum() {
            this.bitField0_ &= -3;
            this.wagerNum_ = 0;
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

   public static final class C2S_GuessUi_9611 extends GeneratedMessageV3 implements C2S_GuessUi_9611OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GuessUi_9611 DEFAULT_INSTANCE = new C2S_GuessUi_9611();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GuessUi_9611> PARSER = new AbstractParser<C2S_GuessUi_9611>() {
         public C2S_GuessUi_9611 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GuessUi_9611(input, extensionRegistry);
         }
      };

      private C2S_GuessUi_9611(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GuessUi_9611() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GuessUi_9611();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GuessUi_9611(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessUi_9611_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessUi_9611_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GuessUi_9611.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GuessUi_9611)) {
            return super.equals(obj);
         } else {
            C2S_GuessUi_9611 other = (C2S_GuessUi_9611)obj;
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

      public static C2S_GuessUi_9611 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GuessUi_9611)PARSER.parseFrom(data);
      }

      public static C2S_GuessUi_9611 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GuessUi_9611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GuessUi_9611 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GuessUi_9611)PARSER.parseFrom(data);
      }

      public static C2S_GuessUi_9611 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GuessUi_9611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GuessUi_9611 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GuessUi_9611)PARSER.parseFrom(data);
      }

      public static C2S_GuessUi_9611 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GuessUi_9611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GuessUi_9611 parseFrom(InputStream input) throws IOException {
         return (C2S_GuessUi_9611)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GuessUi_9611 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GuessUi_9611)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GuessUi_9611 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GuessUi_9611)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GuessUi_9611 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GuessUi_9611)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GuessUi_9611 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GuessUi_9611)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GuessUi_9611 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GuessUi_9611)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GuessUi_9611 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GuessUi_9611 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GuessUi_9611> parser() {
         return PARSER;
      }

      public Parser<C2S_GuessUi_9611> getParserForType() {
         return PARSER;
      }

      public C2S_GuessUi_9611 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GuessUi_9611OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessUi_9611_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessUi_9611_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GuessUi_9611.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.C2S_GuessUi_9611.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessUi_9611_descriptor;
         }

         public C2S_GuessUi_9611 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.C2S_GuessUi_9611.getDefaultInstance();
         }

         public C2S_GuessUi_9611 build() {
            C2S_GuessUi_9611 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GuessUi_9611 buildPartial() {
            C2S_GuessUi_9611 result = new C2S_GuessUi_9611(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_GuessUi_9611) {
               return this.mergeFrom((C2S_GuessUi_9611)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GuessUi_9611 other) {
            if (other == KingOfCentralPlainsMsg.C2S_GuessUi_9611.getDefaultInstance()) {
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
            C2S_GuessUi_9611 parsedMessage = null;

            try {
               parsedMessage = (C2S_GuessUi_9611)KingOfCentralPlainsMsg.C2S_GuessUi_9611.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GuessUi_9611)e.getUnfinishedMessage();
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

   public static final class S2C_GuessUiResult_9612 extends GeneratedMessageV3 implements S2C_GuessUiResult_9612OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FIGHT_FIELD_NUMBER = 1;
      private FightData fight_;
      public static final int LEFTODDS_FIELD_NUMBER = 2;
      private double leftOdds_;
      public static final int RIGHTODDS_FIELD_NUMBER = 3;
      private double rightOdds_;
      public static final int GUESSINFO_FIELD_NUMBER = 4;
      private GuessInfo guessInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_GuessUiResult_9612 DEFAULT_INSTANCE = new S2C_GuessUiResult_9612();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GuessUiResult_9612> PARSER = new AbstractParser<S2C_GuessUiResult_9612>() {
         public S2C_GuessUiResult_9612 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GuessUiResult_9612(input, extensionRegistry);
         }
      };

      private S2C_GuessUiResult_9612(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GuessUiResult_9612() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GuessUiResult_9612();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GuessUiResult_9612(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        FightData.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.fight_.toBuilder();
                        }

                        this.fight_ = (FightData)input.readMessage(KingOfCentralPlainsMsg.FightData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.fight_);
                           this.fight_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 17:
                        this.bitField0_ |= 2;
                        this.leftOdds_ = input.readDouble();
                        break;
                     case 25:
                        this.bitField0_ |= 4;
                        this.rightOdds_ = input.readDouble();
                        break;
                     case 34:
                        GuessInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 8) != 0) {
                           subBuilder = this.guessInfo_.toBuilder();
                        }

                        this.guessInfo_ = (GuessInfo)input.readMessage(KingOfCentralPlainsMsg.GuessInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.guessInfo_);
                           this.guessInfo_ = subBuilder.buildPartial();
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessUiResult_9612_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessUiResult_9612_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GuessUiResult_9612.class, Builder.class);
      }

      public boolean hasFight() {
         return (this.bitField0_ & 1) != 0;
      }

      public FightData getFight() {
         return this.fight_ == null ? KingOfCentralPlainsMsg.FightData.getDefaultInstance() : this.fight_;
      }

      public FightDataOrBuilder getFightOrBuilder() {
         return this.fight_ == null ? KingOfCentralPlainsMsg.FightData.getDefaultInstance() : this.fight_;
      }

      public boolean hasLeftOdds() {
         return (this.bitField0_ & 2) != 0;
      }

      public double getLeftOdds() {
         return this.leftOdds_;
      }

      public boolean hasRightOdds() {
         return (this.bitField0_ & 4) != 0;
      }

      public double getRightOdds() {
         return this.rightOdds_;
      }

      public boolean hasGuessInfo() {
         return (this.bitField0_ & 8) != 0;
      }

      public GuessInfo getGuessInfo() {
         return this.guessInfo_ == null ? KingOfCentralPlainsMsg.GuessInfo.getDefaultInstance() : this.guessInfo_;
      }

      public GuessInfoOrBuilder getGuessInfoOrBuilder() {
         return this.guessInfo_ == null ? KingOfCentralPlainsMsg.GuessInfo.getDefaultInstance() : this.guessInfo_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLeftOdds()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRightOdds()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasFight() && !this.getFight().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getFight());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeDouble(2, this.leftOdds_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeDouble(3, this.rightOdds_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeMessage(4, this.getGuessInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getFight());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeDoubleSize(2, this.leftOdds_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeDoubleSize(3, this.rightOdds_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeMessageSize(4, this.getGuessInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GuessUiResult_9612)) {
            return super.equals(obj);
         } else {
            S2C_GuessUiResult_9612 other = (S2C_GuessUiResult_9612)obj;
            if (this.hasFight() != other.hasFight()) {
               return false;
            } else if (this.hasFight() && !this.getFight().equals(other.getFight())) {
               return false;
            } else if (this.hasLeftOdds() != other.hasLeftOdds()) {
               return false;
            } else if (this.hasLeftOdds() && Double.doubleToLongBits(this.getLeftOdds()) != Double.doubleToLongBits(other.getLeftOdds())) {
               return false;
            } else if (this.hasRightOdds() != other.hasRightOdds()) {
               return false;
            } else if (this.hasRightOdds() && Double.doubleToLongBits(this.getRightOdds()) != Double.doubleToLongBits(other.getRightOdds())) {
               return false;
            } else if (this.hasGuessInfo() != other.hasGuessInfo()) {
               return false;
            } else if (this.hasGuessInfo() && !this.getGuessInfo().equals(other.getGuessInfo())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasFight()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFight().hashCode();
            }

            if (this.hasLeftOdds()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(Double.doubleToLongBits(this.getLeftOdds()));
            }

            if (this.hasRightOdds()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashLong(Double.doubleToLongBits(this.getRightOdds()));
            }

            if (this.hasGuessInfo()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getGuessInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GuessUiResult_9612 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GuessUiResult_9612)PARSER.parseFrom(data);
      }

      public static S2C_GuessUiResult_9612 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GuessUiResult_9612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GuessUiResult_9612 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GuessUiResult_9612)PARSER.parseFrom(data);
      }

      public static S2C_GuessUiResult_9612 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GuessUiResult_9612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GuessUiResult_9612 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GuessUiResult_9612)PARSER.parseFrom(data);
      }

      public static S2C_GuessUiResult_9612 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GuessUiResult_9612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GuessUiResult_9612 parseFrom(InputStream input) throws IOException {
         return (S2C_GuessUiResult_9612)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GuessUiResult_9612 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GuessUiResult_9612)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GuessUiResult_9612 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GuessUiResult_9612)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GuessUiResult_9612 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GuessUiResult_9612)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GuessUiResult_9612 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GuessUiResult_9612)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GuessUiResult_9612 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GuessUiResult_9612)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GuessUiResult_9612 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GuessUiResult_9612 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GuessUiResult_9612> parser() {
         return PARSER;
      }

      public Parser<S2C_GuessUiResult_9612> getParserForType() {
         return PARSER;
      }

      public S2C_GuessUiResult_9612 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GuessUiResult_9612OrBuilder {
         private int bitField0_;
         private FightData fight_;
         private SingleFieldBuilderV3<FightData, FightData.Builder, FightDataOrBuilder> fightBuilder_;
         private double leftOdds_;
         private double rightOdds_;
         private GuessInfo guessInfo_;
         private SingleFieldBuilderV3<GuessInfo, GuessInfo.Builder, GuessInfoOrBuilder> guessInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessUiResult_9612_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessUiResult_9612_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GuessUiResult_9612.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.S2C_GuessUiResult_9612.alwaysUseFieldBuilders) {
               this.getFightFieldBuilder();
               this.getGuessInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.fightBuilder_ == null) {
               this.fight_ = null;
            } else {
               this.fightBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.leftOdds_ = (double)0.0F;
            this.bitField0_ &= -3;
            this.rightOdds_ = (double)0.0F;
            this.bitField0_ &= -5;
            if (this.guessInfoBuilder_ == null) {
               this.guessInfo_ = null;
            } else {
               this.guessInfoBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessUiResult_9612_descriptor;
         }

         public S2C_GuessUiResult_9612 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.S2C_GuessUiResult_9612.getDefaultInstance();
         }

         public S2C_GuessUiResult_9612 build() {
            S2C_GuessUiResult_9612 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GuessUiResult_9612 buildPartial() {
            S2C_GuessUiResult_9612 result = new S2C_GuessUiResult_9612(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.fightBuilder_ == null) {
                  result.fight_ = this.fight_;
               } else {
                  result.fight_ = (FightData)this.fightBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.leftOdds_ = this.leftOdds_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.rightOdds_ = this.rightOdds_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               if (this.guessInfoBuilder_ == null) {
                  result.guessInfo_ = this.guessInfo_;
               } else {
                  result.guessInfo_ = (GuessInfo)this.guessInfoBuilder_.build();
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
            if (other instanceof S2C_GuessUiResult_9612) {
               return this.mergeFrom((S2C_GuessUiResult_9612)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GuessUiResult_9612 other) {
            if (other == KingOfCentralPlainsMsg.S2C_GuessUiResult_9612.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFight()) {
                  this.mergeFight(other.getFight());
               }

               if (other.hasLeftOdds()) {
                  this.setLeftOdds(other.getLeftOdds());
               }

               if (other.hasRightOdds()) {
                  this.setRightOdds(other.getRightOdds());
               }

               if (other.hasGuessInfo()) {
                  this.mergeGuessInfo(other.getGuessInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasLeftOdds()) {
               return false;
            } else if (!this.hasRightOdds()) {
               return false;
            } else {
               return !this.hasFight() || this.getFight().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GuessUiResult_9612 parsedMessage = null;

            try {
               parsedMessage = (S2C_GuessUiResult_9612)KingOfCentralPlainsMsg.S2C_GuessUiResult_9612.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GuessUiResult_9612)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFight() {
            return (this.bitField0_ & 1) != 0;
         }

         public FightData getFight() {
            if (this.fightBuilder_ == null) {
               return this.fight_ == null ? KingOfCentralPlainsMsg.FightData.getDefaultInstance() : this.fight_;
            } else {
               return (FightData)this.fightBuilder_.getMessage();
            }
         }

         public Builder setFight(FightData value) {
            if (this.fightBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.fight_ = value;
               this.onChanged();
            } else {
               this.fightBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setFight(FightData.Builder builderForValue) {
            if (this.fightBuilder_ == null) {
               this.fight_ = builderForValue.build();
               this.onChanged();
            } else {
               this.fightBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeFight(FightData value) {
            if (this.fightBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.fight_ != null && this.fight_ != KingOfCentralPlainsMsg.FightData.getDefaultInstance()) {
                  this.fight_ = KingOfCentralPlainsMsg.FightData.newBuilder(this.fight_).mergeFrom(value).buildPartial();
               } else {
                  this.fight_ = value;
               }

               this.onChanged();
            } else {
               this.fightBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearFight() {
            if (this.fightBuilder_ == null) {
               this.fight_ = null;
               this.onChanged();
            } else {
               this.fightBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public FightData.Builder getFightBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (FightData.Builder)this.getFightFieldBuilder().getBuilder();
         }

         public FightDataOrBuilder getFightOrBuilder() {
            if (this.fightBuilder_ != null) {
               return (FightDataOrBuilder)this.fightBuilder_.getMessageOrBuilder();
            } else {
               return this.fight_ == null ? KingOfCentralPlainsMsg.FightData.getDefaultInstance() : this.fight_;
            }
         }

         private SingleFieldBuilderV3<FightData, FightData.Builder, FightDataOrBuilder> getFightFieldBuilder() {
            if (this.fightBuilder_ == null) {
               this.fightBuilder_ = new SingleFieldBuilderV3(this.getFight(), this.getParentForChildren(), this.isClean());
               this.fight_ = null;
            }

            return this.fightBuilder_;
         }

         public boolean hasLeftOdds() {
            return (this.bitField0_ & 2) != 0;
         }

         public double getLeftOdds() {
            return this.leftOdds_;
         }

         public Builder setLeftOdds(double value) {
            this.bitField0_ |= 2;
            this.leftOdds_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLeftOdds() {
            this.bitField0_ &= -3;
            this.leftOdds_ = (double)0.0F;
            this.onChanged();
            return this;
         }

         public boolean hasRightOdds() {
            return (this.bitField0_ & 4) != 0;
         }

         public double getRightOdds() {
            return this.rightOdds_;
         }

         public Builder setRightOdds(double value) {
            this.bitField0_ |= 4;
            this.rightOdds_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRightOdds() {
            this.bitField0_ &= -5;
            this.rightOdds_ = (double)0.0F;
            this.onChanged();
            return this;
         }

         public boolean hasGuessInfo() {
            return (this.bitField0_ & 8) != 0;
         }

         public GuessInfo getGuessInfo() {
            if (this.guessInfoBuilder_ == null) {
               return this.guessInfo_ == null ? KingOfCentralPlainsMsg.GuessInfo.getDefaultInstance() : this.guessInfo_;
            } else {
               return (GuessInfo)this.guessInfoBuilder_.getMessage();
            }
         }

         public Builder setGuessInfo(GuessInfo value) {
            if (this.guessInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.guessInfo_ = value;
               this.onChanged();
            } else {
               this.guessInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder setGuessInfo(GuessInfo.Builder builderForValue) {
            if (this.guessInfoBuilder_ == null) {
               this.guessInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.guessInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder mergeGuessInfo(GuessInfo value) {
            if (this.guessInfoBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0 && this.guessInfo_ != null && this.guessInfo_ != KingOfCentralPlainsMsg.GuessInfo.getDefaultInstance()) {
                  this.guessInfo_ = KingOfCentralPlainsMsg.GuessInfo.newBuilder(this.guessInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.guessInfo_ = value;
               }

               this.onChanged();
            } else {
               this.guessInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder clearGuessInfo() {
            if (this.guessInfoBuilder_ == null) {
               this.guessInfo_ = null;
               this.onChanged();
            } else {
               this.guessInfoBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public GuessInfo.Builder getGuessInfoBuilder() {
            this.bitField0_ |= 8;
            this.onChanged();
            return (GuessInfo.Builder)this.getGuessInfoFieldBuilder().getBuilder();
         }

         public GuessInfoOrBuilder getGuessInfoOrBuilder() {
            if (this.guessInfoBuilder_ != null) {
               return (GuessInfoOrBuilder)this.guessInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.guessInfo_ == null ? KingOfCentralPlainsMsg.GuessInfo.getDefaultInstance() : this.guessInfo_;
            }
         }

         private SingleFieldBuilderV3<GuessInfo, GuessInfo.Builder, GuessInfoOrBuilder> getGuessInfoFieldBuilder() {
            if (this.guessInfoBuilder_ == null) {
               this.guessInfoBuilder_ = new SingleFieldBuilderV3(this.getGuessInfo(), this.getParentForChildren(), this.isClean());
               this.guessInfo_ = null;
            }

            return this.guessInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_Guess_9613 extends GeneratedMessageV3 implements C2S_Guess_9613OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int WAGERSIDE_FIELD_NUMBER = 1;
      private int wagerSide_;
      public static final int WAGERNUM_FIELD_NUMBER = 2;
      private int wagerNum_;
      private byte memoizedIsInitialized;
      private static final C2S_Guess_9613 DEFAULT_INSTANCE = new C2S_Guess_9613();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Guess_9613> PARSER = new AbstractParser<C2S_Guess_9613>() {
         public C2S_Guess_9613 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Guess_9613(input, extensionRegistry);
         }
      };

      private C2S_Guess_9613(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Guess_9613() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Guess_9613();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Guess_9613(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.wagerSide_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.wagerNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_Guess_9613_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_Guess_9613_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Guess_9613.class, Builder.class);
      }

      public boolean hasWagerSide() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getWagerSide() {
         return this.wagerSide_;
      }

      public boolean hasWagerNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getWagerNum() {
         return this.wagerNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasWagerSide()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasWagerNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.wagerSide_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.wagerNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.wagerSide_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.wagerNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Guess_9613)) {
            return super.equals(obj);
         } else {
            C2S_Guess_9613 other = (C2S_Guess_9613)obj;
            if (this.hasWagerSide() != other.hasWagerSide()) {
               return false;
            } else if (this.hasWagerSide() && this.getWagerSide() != other.getWagerSide()) {
               return false;
            } else if (this.hasWagerNum() != other.hasWagerNum()) {
               return false;
            } else if (this.hasWagerNum() && this.getWagerNum() != other.getWagerNum()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasWagerSide()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getWagerSide();
            }

            if (this.hasWagerNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getWagerNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Guess_9613 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Guess_9613)PARSER.parseFrom(data);
      }

      public static C2S_Guess_9613 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Guess_9613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Guess_9613 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Guess_9613)PARSER.parseFrom(data);
      }

      public static C2S_Guess_9613 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Guess_9613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Guess_9613 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Guess_9613)PARSER.parseFrom(data);
      }

      public static C2S_Guess_9613 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Guess_9613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Guess_9613 parseFrom(InputStream input) throws IOException {
         return (C2S_Guess_9613)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Guess_9613 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Guess_9613)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Guess_9613 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Guess_9613)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Guess_9613 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Guess_9613)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Guess_9613 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Guess_9613)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Guess_9613 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Guess_9613)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Guess_9613 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Guess_9613 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Guess_9613> parser() {
         return PARSER;
      }

      public Parser<C2S_Guess_9613> getParserForType() {
         return PARSER;
      }

      public C2S_Guess_9613 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Guess_9613OrBuilder {
         private int bitField0_;
         private int wagerSide_;
         private int wagerNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_Guess_9613_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_Guess_9613_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Guess_9613.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.C2S_Guess_9613.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.wagerSide_ = 0;
            this.bitField0_ &= -2;
            this.wagerNum_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_Guess_9613_descriptor;
         }

         public C2S_Guess_9613 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.C2S_Guess_9613.getDefaultInstance();
         }

         public C2S_Guess_9613 build() {
            C2S_Guess_9613 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Guess_9613 buildPartial() {
            C2S_Guess_9613 result = new C2S_Guess_9613(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.wagerSide_ = this.wagerSide_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.wagerNum_ = this.wagerNum_;
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
            if (other instanceof C2S_Guess_9613) {
               return this.mergeFrom((C2S_Guess_9613)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Guess_9613 other) {
            if (other == KingOfCentralPlainsMsg.C2S_Guess_9613.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasWagerSide()) {
                  this.setWagerSide(other.getWagerSide());
               }

               if (other.hasWagerNum()) {
                  this.setWagerNum(other.getWagerNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasWagerSide()) {
               return false;
            } else {
               return this.hasWagerNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Guess_9613 parsedMessage = null;

            try {
               parsedMessage = (C2S_Guess_9613)KingOfCentralPlainsMsg.C2S_Guess_9613.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Guess_9613)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasWagerSide() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getWagerSide() {
            return this.wagerSide_;
         }

         public Builder setWagerSide(int value) {
            this.bitField0_ |= 1;
            this.wagerSide_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWagerSide() {
            this.bitField0_ &= -2;
            this.wagerSide_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasWagerNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getWagerNum() {
            return this.wagerNum_;
         }

         public Builder setWagerNum(int value) {
            this.bitField0_ |= 2;
            this.wagerNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWagerNum() {
            this.bitField0_ &= -3;
            this.wagerNum_ = 0;
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

   public static final class S2C_GuessResult_9614 extends GeneratedMessageV3 implements S2C_GuessResult_9614OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LEFTODDS_FIELD_NUMBER = 1;
      private double leftOdds_;
      public static final int RIGHTODDS_FIELD_NUMBER = 2;
      private double rightOdds_;
      public static final int WAGERSIDE_FIELD_NUMBER = 3;
      private int wagerSide_;
      public static final int WAGERNUM_FIELD_NUMBER = 4;
      private int wagerNum_;
      private byte memoizedIsInitialized;
      private static final S2C_GuessResult_9614 DEFAULT_INSTANCE = new S2C_GuessResult_9614();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GuessResult_9614> PARSER = new AbstractParser<S2C_GuessResult_9614>() {
         public S2C_GuessResult_9614 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GuessResult_9614(input, extensionRegistry);
         }
      };

      private S2C_GuessResult_9614(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GuessResult_9614() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GuessResult_9614();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GuessResult_9614(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                     case 9:
                        this.bitField0_ |= 1;
                        this.leftOdds_ = input.readDouble();
                        break;
                     case 17:
                        this.bitField0_ |= 2;
                        this.rightOdds_ = input.readDouble();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.wagerSide_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.wagerNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessResult_9614_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessResult_9614_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GuessResult_9614.class, Builder.class);
      }

      public boolean hasLeftOdds() {
         return (this.bitField0_ & 1) != 0;
      }

      public double getLeftOdds() {
         return this.leftOdds_;
      }

      public boolean hasRightOdds() {
         return (this.bitField0_ & 2) != 0;
      }

      public double getRightOdds() {
         return this.rightOdds_;
      }

      public boolean hasWagerSide() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getWagerSide() {
         return this.wagerSide_;
      }

      public boolean hasWagerNum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getWagerNum() {
         return this.wagerNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLeftOdds()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRightOdds()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasWagerSide()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasWagerNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeDouble(1, this.leftOdds_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeDouble(2, this.rightOdds_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.wagerSide_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.wagerNum_);
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
               size += CodedOutputStream.computeDoubleSize(1, this.leftOdds_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeDoubleSize(2, this.rightOdds_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.wagerSide_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.wagerNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GuessResult_9614)) {
            return super.equals(obj);
         } else {
            S2C_GuessResult_9614 other = (S2C_GuessResult_9614)obj;
            if (this.hasLeftOdds() != other.hasLeftOdds()) {
               return false;
            } else if (this.hasLeftOdds() && Double.doubleToLongBits(this.getLeftOdds()) != Double.doubleToLongBits(other.getLeftOdds())) {
               return false;
            } else if (this.hasRightOdds() != other.hasRightOdds()) {
               return false;
            } else if (this.hasRightOdds() && Double.doubleToLongBits(this.getRightOdds()) != Double.doubleToLongBits(other.getRightOdds())) {
               return false;
            } else if (this.hasWagerSide() != other.hasWagerSide()) {
               return false;
            } else if (this.hasWagerSide() && this.getWagerSide() != other.getWagerSide()) {
               return false;
            } else if (this.hasWagerNum() != other.hasWagerNum()) {
               return false;
            } else if (this.hasWagerNum() && this.getWagerNum() != other.getWagerNum()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasLeftOdds()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashLong(Double.doubleToLongBits(this.getLeftOdds()));
            }

            if (this.hasRightOdds()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(Double.doubleToLongBits(this.getRightOdds()));
            }

            if (this.hasWagerSide()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getWagerSide();
            }

            if (this.hasWagerNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getWagerNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GuessResult_9614 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GuessResult_9614)PARSER.parseFrom(data);
      }

      public static S2C_GuessResult_9614 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GuessResult_9614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GuessResult_9614 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GuessResult_9614)PARSER.parseFrom(data);
      }

      public static S2C_GuessResult_9614 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GuessResult_9614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GuessResult_9614 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GuessResult_9614)PARSER.parseFrom(data);
      }

      public static S2C_GuessResult_9614 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GuessResult_9614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GuessResult_9614 parseFrom(InputStream input) throws IOException {
         return (S2C_GuessResult_9614)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GuessResult_9614 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GuessResult_9614)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GuessResult_9614 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GuessResult_9614)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GuessResult_9614 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GuessResult_9614)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GuessResult_9614 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GuessResult_9614)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GuessResult_9614 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GuessResult_9614)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GuessResult_9614 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GuessResult_9614 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GuessResult_9614> parser() {
         return PARSER;
      }

      public Parser<S2C_GuessResult_9614> getParserForType() {
         return PARSER;
      }

      public S2C_GuessResult_9614 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GuessResult_9614OrBuilder {
         private int bitField0_;
         private double leftOdds_;
         private double rightOdds_;
         private int wagerSide_;
         private int wagerNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessResult_9614_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessResult_9614_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GuessResult_9614.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.S2C_GuessResult_9614.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.leftOdds_ = (double)0.0F;
            this.bitField0_ &= -2;
            this.rightOdds_ = (double)0.0F;
            this.bitField0_ &= -3;
            this.wagerSide_ = 0;
            this.bitField0_ &= -5;
            this.wagerNum_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessResult_9614_descriptor;
         }

         public S2C_GuessResult_9614 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.S2C_GuessResult_9614.getDefaultInstance();
         }

         public S2C_GuessResult_9614 build() {
            S2C_GuessResult_9614 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GuessResult_9614 buildPartial() {
            S2C_GuessResult_9614 result = new S2C_GuessResult_9614(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.leftOdds_ = this.leftOdds_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.rightOdds_ = this.rightOdds_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.wagerSide_ = this.wagerSide_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.wagerNum_ = this.wagerNum_;
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
            if (other instanceof S2C_GuessResult_9614) {
               return this.mergeFrom((S2C_GuessResult_9614)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GuessResult_9614 other) {
            if (other == KingOfCentralPlainsMsg.S2C_GuessResult_9614.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLeftOdds()) {
                  this.setLeftOdds(other.getLeftOdds());
               }

               if (other.hasRightOdds()) {
                  this.setRightOdds(other.getRightOdds());
               }

               if (other.hasWagerSide()) {
                  this.setWagerSide(other.getWagerSide());
               }

               if (other.hasWagerNum()) {
                  this.setWagerNum(other.getWagerNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasLeftOdds()) {
               return false;
            } else if (!this.hasRightOdds()) {
               return false;
            } else if (!this.hasWagerSide()) {
               return false;
            } else {
               return this.hasWagerNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GuessResult_9614 parsedMessage = null;

            try {
               parsedMessage = (S2C_GuessResult_9614)KingOfCentralPlainsMsg.S2C_GuessResult_9614.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GuessResult_9614)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLeftOdds() {
            return (this.bitField0_ & 1) != 0;
         }

         public double getLeftOdds() {
            return this.leftOdds_;
         }

         public Builder setLeftOdds(double value) {
            this.bitField0_ |= 1;
            this.leftOdds_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLeftOdds() {
            this.bitField0_ &= -2;
            this.leftOdds_ = (double)0.0F;
            this.onChanged();
            return this;
         }

         public boolean hasRightOdds() {
            return (this.bitField0_ & 2) != 0;
         }

         public double getRightOdds() {
            return this.rightOdds_;
         }

         public Builder setRightOdds(double value) {
            this.bitField0_ |= 2;
            this.rightOdds_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRightOdds() {
            this.bitField0_ &= -3;
            this.rightOdds_ = (double)0.0F;
            this.onChanged();
            return this;
         }

         public boolean hasWagerSide() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getWagerSide() {
            return this.wagerSide_;
         }

         public Builder setWagerSide(int value) {
            this.bitField0_ |= 4;
            this.wagerSide_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWagerSide() {
            this.bitField0_ &= -5;
            this.wagerSide_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasWagerNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getWagerNum() {
            return this.wagerNum_;
         }

         public Builder setWagerNum(int value) {
            this.bitField0_ |= 8;
            this.wagerNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWagerNum() {
            this.bitField0_ &= -9;
            this.wagerNum_ = 0;
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

   public static final class S2C_GuessPush_9616 extends GeneratedMessageV3 implements S2C_GuessPush_9616OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LEFTODDS_FIELD_NUMBER = 1;
      private double leftOdds_;
      public static final int RIGHTODDS_FIELD_NUMBER = 2;
      private double rightOdds_;
      private byte memoizedIsInitialized;
      private static final S2C_GuessPush_9616 DEFAULT_INSTANCE = new S2C_GuessPush_9616();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GuessPush_9616> PARSER = new AbstractParser<S2C_GuessPush_9616>() {
         public S2C_GuessPush_9616 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GuessPush_9616(input, extensionRegistry);
         }
      };

      private S2C_GuessPush_9616(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GuessPush_9616() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GuessPush_9616();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GuessPush_9616(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                     case 9:
                        this.bitField0_ |= 1;
                        this.leftOdds_ = input.readDouble();
                        break;
                     case 17:
                        this.bitField0_ |= 2;
                        this.rightOdds_ = input.readDouble();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessPush_9616_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessPush_9616_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GuessPush_9616.class, Builder.class);
      }

      public boolean hasLeftOdds() {
         return (this.bitField0_ & 1) != 0;
      }

      public double getLeftOdds() {
         return this.leftOdds_;
      }

      public boolean hasRightOdds() {
         return (this.bitField0_ & 2) != 0;
      }

      public double getRightOdds() {
         return this.rightOdds_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLeftOdds()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRightOdds()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeDouble(1, this.leftOdds_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeDouble(2, this.rightOdds_);
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
               size += CodedOutputStream.computeDoubleSize(1, this.leftOdds_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeDoubleSize(2, this.rightOdds_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GuessPush_9616)) {
            return super.equals(obj);
         } else {
            S2C_GuessPush_9616 other = (S2C_GuessPush_9616)obj;
            if (this.hasLeftOdds() != other.hasLeftOdds()) {
               return false;
            } else if (this.hasLeftOdds() && Double.doubleToLongBits(this.getLeftOdds()) != Double.doubleToLongBits(other.getLeftOdds())) {
               return false;
            } else if (this.hasRightOdds() != other.hasRightOdds()) {
               return false;
            } else if (this.hasRightOdds() && Double.doubleToLongBits(this.getRightOdds()) != Double.doubleToLongBits(other.getRightOdds())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasLeftOdds()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashLong(Double.doubleToLongBits(this.getLeftOdds()));
            }

            if (this.hasRightOdds()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(Double.doubleToLongBits(this.getRightOdds()));
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GuessPush_9616 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GuessPush_9616)PARSER.parseFrom(data);
      }

      public static S2C_GuessPush_9616 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GuessPush_9616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GuessPush_9616 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GuessPush_9616)PARSER.parseFrom(data);
      }

      public static S2C_GuessPush_9616 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GuessPush_9616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GuessPush_9616 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GuessPush_9616)PARSER.parseFrom(data);
      }

      public static S2C_GuessPush_9616 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GuessPush_9616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GuessPush_9616 parseFrom(InputStream input) throws IOException {
         return (S2C_GuessPush_9616)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GuessPush_9616 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GuessPush_9616)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GuessPush_9616 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GuessPush_9616)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GuessPush_9616 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GuessPush_9616)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GuessPush_9616 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GuessPush_9616)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GuessPush_9616 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GuessPush_9616)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GuessPush_9616 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GuessPush_9616 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GuessPush_9616> parser() {
         return PARSER;
      }

      public Parser<S2C_GuessPush_9616> getParserForType() {
         return PARSER;
      }

      public S2C_GuessPush_9616 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GuessPush_9616OrBuilder {
         private int bitField0_;
         private double leftOdds_;
         private double rightOdds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessPush_9616_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessPush_9616_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GuessPush_9616.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.S2C_GuessPush_9616.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.leftOdds_ = (double)0.0F;
            this.bitField0_ &= -2;
            this.rightOdds_ = (double)0.0F;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessPush_9616_descriptor;
         }

         public S2C_GuessPush_9616 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.S2C_GuessPush_9616.getDefaultInstance();
         }

         public S2C_GuessPush_9616 build() {
            S2C_GuessPush_9616 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GuessPush_9616 buildPartial() {
            S2C_GuessPush_9616 result = new S2C_GuessPush_9616(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.leftOdds_ = this.leftOdds_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.rightOdds_ = this.rightOdds_;
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
            if (other instanceof S2C_GuessPush_9616) {
               return this.mergeFrom((S2C_GuessPush_9616)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GuessPush_9616 other) {
            if (other == KingOfCentralPlainsMsg.S2C_GuessPush_9616.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLeftOdds()) {
                  this.setLeftOdds(other.getLeftOdds());
               }

               if (other.hasRightOdds()) {
                  this.setRightOdds(other.getRightOdds());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasLeftOdds()) {
               return false;
            } else {
               return this.hasRightOdds();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GuessPush_9616 parsedMessage = null;

            try {
               parsedMessage = (S2C_GuessPush_9616)KingOfCentralPlainsMsg.S2C_GuessPush_9616.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GuessPush_9616)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLeftOdds() {
            return (this.bitField0_ & 1) != 0;
         }

         public double getLeftOdds() {
            return this.leftOdds_;
         }

         public Builder setLeftOdds(double value) {
            this.bitField0_ |= 1;
            this.leftOdds_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLeftOdds() {
            this.bitField0_ &= -2;
            this.leftOdds_ = (double)0.0F;
            this.onChanged();
            return this;
         }

         public boolean hasRightOdds() {
            return (this.bitField0_ & 2) != 0;
         }

         public double getRightOdds() {
            return this.rightOdds_;
         }

         public Builder setRightOdds(double value) {
            this.bitField0_ |= 2;
            this.rightOdds_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRightOdds() {
            this.bitField0_ &= -3;
            this.rightOdds_ = (double)0.0F;
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

   public static final class GuessRecordInfo extends GeneratedMessageV3 implements GuessRecordInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ROUND_FIELD_NUMBER = 1;
      private int round_;
      public static final int LEFTID_FIELD_NUMBER = 2;
      private int leftId_;
      public static final int RIGHTID_FIELD_NUMBER = 3;
      private int rightId_;
      public static final int LEFTNAME_FIELD_NUMBER = 4;
      private volatile Object leftName_;
      public static final int RIGHTNAME_FIELD_NUMBER = 5;
      private volatile Object rightName_;
      public static final int LEFTHEAD_FIELD_NUMBER = 6;
      private int leftHead_;
      public static final int RIGHTHEAD_FIELD_NUMBER = 7;
      private int rightHead_;
      public static final int WIN_FIELD_NUMBER = 8;
      private int win_;
      public static final int WAGERNAME_FIELD_NUMBER = 9;
      private volatile Object wagerName_;
      public static final int SOCRE_FIELD_NUMBER = 10;
      private int socre_;
      public static final int RECORDID_FIELD_NUMBER = 11;
      private int recordId_;
      public static final int WINNUM_FIELD_NUMBER = 12;
      private int winNum_;
      public static final int LEFTLV_FIELD_NUMBER = 13;
      private int leftLv_;
      public static final int RIGHTLV_FIELD_NUMBER = 14;
      private int rightLv_;
      public static final int STARTTIME_FIELD_NUMBER = 15;
      private int startTIme_;
      private byte memoizedIsInitialized;
      private static final GuessRecordInfo DEFAULT_INSTANCE = new GuessRecordInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<GuessRecordInfo> PARSER = new AbstractParser<GuessRecordInfo>() {
         public GuessRecordInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new GuessRecordInfo(input, extensionRegistry);
         }
      };

      private GuessRecordInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private GuessRecordInfo() {
         this.memoizedIsInitialized = -1;
         this.leftName_ = "";
         this.rightName_ = "";
         this.wagerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new GuessRecordInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private GuessRecordInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.round_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.leftId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.rightId_ = input.readInt32();
                        break;
                     case 34:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 8;
                        this.leftName_ = bs;
                        break;
                     case 42:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 16;
                        this.rightName_ = bs;
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.leftHead_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.rightHead_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.win_ = input.readInt32();
                        break;
                     case 74:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 256;
                        this.wagerName_ = bs;
                        break;
                     case 80:
                        this.bitField0_ |= 512;
                        this.socre_ = input.readInt32();
                        break;
                     case 88:
                        this.bitField0_ |= 1024;
                        this.recordId_ = input.readInt32();
                        break;
                     case 96:
                        this.bitField0_ |= 2048;
                        this.winNum_ = input.readInt32();
                        break;
                     case 104:
                        this.bitField0_ |= 4096;
                        this.leftLv_ = input.readInt32();
                        break;
                     case 112:
                        this.bitField0_ |= 8192;
                        this.rightLv_ = input.readInt32();
                        break;
                     case 120:
                        this.bitField0_ |= 16384;
                        this.startTIme_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessRecordInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessRecordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GuessRecordInfo.class, Builder.class);
      }

      public boolean hasRound() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRound() {
         return this.round_;
      }

      public boolean hasLeftId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLeftId() {
         return this.leftId_;
      }

      public boolean hasRightId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getRightId() {
         return this.rightId_;
      }

      public boolean hasLeftName() {
         return (this.bitField0_ & 8) != 0;
      }

      public String getLeftName() {
         Object ref = this.leftName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.leftName_ = s;
            }

            return s;
         }
      }

      public ByteString getLeftNameBytes() {
         Object ref = this.leftName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.leftName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasRightName() {
         return (this.bitField0_ & 16) != 0;
      }

      public String getRightName() {
         Object ref = this.rightName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.rightName_ = s;
            }

            return s;
         }
      }

      public ByteString getRightNameBytes() {
         Object ref = this.rightName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.rightName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasLeftHead() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getLeftHead() {
         return this.leftHead_;
      }

      public boolean hasRightHead() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getRightHead() {
         return this.rightHead_;
      }

      public boolean hasWin() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getWin() {
         return this.win_;
      }

      public boolean hasWagerName() {
         return (this.bitField0_ & 256) != 0;
      }

      public String getWagerName() {
         Object ref = this.wagerName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.wagerName_ = s;
            }

            return s;
         }
      }

      public ByteString getWagerNameBytes() {
         Object ref = this.wagerName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.wagerName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasSocre() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getSocre() {
         return this.socre_;
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 1024) != 0;
      }

      public int getRecordId() {
         return this.recordId_;
      }

      public boolean hasWinNum() {
         return (this.bitField0_ & 2048) != 0;
      }

      public int getWinNum() {
         return this.winNum_;
      }

      public boolean hasLeftLv() {
         return (this.bitField0_ & 4096) != 0;
      }

      public int getLeftLv() {
         return this.leftLv_;
      }

      public boolean hasRightLv() {
         return (this.bitField0_ & 8192) != 0;
      }

      public int getRightLv() {
         return this.rightLv_;
      }

      public boolean hasStartTIme() {
         return (this.bitField0_ & 16384) != 0;
      }

      public int getStartTIme() {
         return this.startTIme_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRound()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLeftId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRightId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLeftName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRightName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLeftHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRightHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasWin()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasWagerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSocre()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRecordId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasWinNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStartTIme()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.round_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.leftId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.rightId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            GeneratedMessageV3.writeString(output, 4, this.leftName_);
         }

         if ((this.bitField0_ & 16) != 0) {
            GeneratedMessageV3.writeString(output, 5, this.rightName_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.leftHead_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.rightHead_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.win_);
         }

         if ((this.bitField0_ & 256) != 0) {
            GeneratedMessageV3.writeString(output, 9, this.wagerName_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(10, this.socre_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            output.writeInt32(11, this.recordId_);
         }

         if ((this.bitField0_ & 2048) != 0) {
            output.writeInt32(12, this.winNum_);
         }

         if ((this.bitField0_ & 4096) != 0) {
            output.writeInt32(13, this.leftLv_);
         }

         if ((this.bitField0_ & 8192) != 0) {
            output.writeInt32(14, this.rightLv_);
         }

         if ((this.bitField0_ & 16384) != 0) {
            output.writeInt32(15, this.startTIme_);
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
               size += CodedOutputStream.computeInt32Size(1, this.round_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.leftId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.rightId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += GeneratedMessageV3.computeStringSize(4, this.leftName_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += GeneratedMessageV3.computeStringSize(5, this.rightName_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.leftHead_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.rightHead_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.win_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += GeneratedMessageV3.computeStringSize(9, this.wagerName_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.socre_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.recordId_);
            }

            if ((this.bitField0_ & 2048) != 0) {
               size += CodedOutputStream.computeInt32Size(12, this.winNum_);
            }

            if ((this.bitField0_ & 4096) != 0) {
               size += CodedOutputStream.computeInt32Size(13, this.leftLv_);
            }

            if ((this.bitField0_ & 8192) != 0) {
               size += CodedOutputStream.computeInt32Size(14, this.rightLv_);
            }

            if ((this.bitField0_ & 16384) != 0) {
               size += CodedOutputStream.computeInt32Size(15, this.startTIme_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof GuessRecordInfo)) {
            return super.equals(obj);
         } else {
            GuessRecordInfo other = (GuessRecordInfo)obj;
            if (this.hasRound() != other.hasRound()) {
               return false;
            } else if (this.hasRound() && this.getRound() != other.getRound()) {
               return false;
            } else if (this.hasLeftId() != other.hasLeftId()) {
               return false;
            } else if (this.hasLeftId() && this.getLeftId() != other.getLeftId()) {
               return false;
            } else if (this.hasRightId() != other.hasRightId()) {
               return false;
            } else if (this.hasRightId() && this.getRightId() != other.getRightId()) {
               return false;
            } else if (this.hasLeftName() != other.hasLeftName()) {
               return false;
            } else if (this.hasLeftName() && !this.getLeftName().equals(other.getLeftName())) {
               return false;
            } else if (this.hasRightName() != other.hasRightName()) {
               return false;
            } else if (this.hasRightName() && !this.getRightName().equals(other.getRightName())) {
               return false;
            } else if (this.hasLeftHead() != other.hasLeftHead()) {
               return false;
            } else if (this.hasLeftHead() && this.getLeftHead() != other.getLeftHead()) {
               return false;
            } else if (this.hasRightHead() != other.hasRightHead()) {
               return false;
            } else if (this.hasRightHead() && this.getRightHead() != other.getRightHead()) {
               return false;
            } else if (this.hasWin() != other.hasWin()) {
               return false;
            } else if (this.hasWin() && this.getWin() != other.getWin()) {
               return false;
            } else if (this.hasWagerName() != other.hasWagerName()) {
               return false;
            } else if (this.hasWagerName() && !this.getWagerName().equals(other.getWagerName())) {
               return false;
            } else if (this.hasSocre() != other.hasSocre()) {
               return false;
            } else if (this.hasSocre() && this.getSocre() != other.getSocre()) {
               return false;
            } else if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
               return false;
            } else if (this.hasWinNum() != other.hasWinNum()) {
               return false;
            } else if (this.hasWinNum() && this.getWinNum() != other.getWinNum()) {
               return false;
            } else if (this.hasLeftLv() != other.hasLeftLv()) {
               return false;
            } else if (this.hasLeftLv() && this.getLeftLv() != other.getLeftLv()) {
               return false;
            } else if (this.hasRightLv() != other.hasRightLv()) {
               return false;
            } else if (this.hasRightLv() && this.getRightLv() != other.getRightLv()) {
               return false;
            } else if (this.hasStartTIme() != other.hasStartTIme()) {
               return false;
            } else if (this.hasStartTIme() && this.getStartTIme() != other.getStartTIme()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasRound()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRound();
            }

            if (this.hasLeftId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLeftId();
            }

            if (this.hasRightId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRightId();
            }

            if (this.hasLeftName()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getLeftName().hashCode();
            }

            if (this.hasRightName()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getRightName().hashCode();
            }

            if (this.hasLeftHead()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getLeftHead();
            }

            if (this.hasRightHead()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getRightHead();
            }

            if (this.hasWin()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getWin();
            }

            if (this.hasWagerName()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getWagerName().hashCode();
            }

            if (this.hasSocre()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getSocre();
            }

            if (this.hasRecordId()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getRecordId();
            }

            if (this.hasWinNum()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getWinNum();
            }

            if (this.hasLeftLv()) {
               hash = 37 * hash + 13;
               hash = 53 * hash + this.getLeftLv();
            }

            if (this.hasRightLv()) {
               hash = 37 * hash + 14;
               hash = 53 * hash + this.getRightLv();
            }

            if (this.hasStartTIme()) {
               hash = 37 * hash + 15;
               hash = 53 * hash + this.getStartTIme();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static GuessRecordInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (GuessRecordInfo)PARSER.parseFrom(data);
      }

      public static GuessRecordInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GuessRecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GuessRecordInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (GuessRecordInfo)PARSER.parseFrom(data);
      }

      public static GuessRecordInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GuessRecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GuessRecordInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (GuessRecordInfo)PARSER.parseFrom(data);
      }

      public static GuessRecordInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GuessRecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GuessRecordInfo parseFrom(InputStream input) throws IOException {
         return (GuessRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GuessRecordInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GuessRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static GuessRecordInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (GuessRecordInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static GuessRecordInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GuessRecordInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static GuessRecordInfo parseFrom(CodedInputStream input) throws IOException {
         return (GuessRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GuessRecordInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GuessRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(GuessRecordInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static GuessRecordInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<GuessRecordInfo> parser() {
         return PARSER;
      }

      public Parser<GuessRecordInfo> getParserForType() {
         return PARSER;
      }

      public GuessRecordInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GuessRecordInfoOrBuilder {
         private int bitField0_;
         private int round_;
         private int leftId_;
         private int rightId_;
         private Object leftName_;
         private Object rightName_;
         private int leftHead_;
         private int rightHead_;
         private int win_;
         private Object wagerName_;
         private int socre_;
         private int recordId_;
         private int winNum_;
         private int leftLv_;
         private int rightLv_;
         private int startTIme_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessRecordInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessRecordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GuessRecordInfo.class, Builder.class);
         }

         private Builder() {
            this.leftName_ = "";
            this.rightName_ = "";
            this.wagerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.leftName_ = "";
            this.rightName_ = "";
            this.wagerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.GuessRecordInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.round_ = 0;
            this.bitField0_ &= -2;
            this.leftId_ = 0;
            this.bitField0_ &= -3;
            this.rightId_ = 0;
            this.bitField0_ &= -5;
            this.leftName_ = "";
            this.bitField0_ &= -9;
            this.rightName_ = "";
            this.bitField0_ &= -17;
            this.leftHead_ = 0;
            this.bitField0_ &= -33;
            this.rightHead_ = 0;
            this.bitField0_ &= -65;
            this.win_ = 0;
            this.bitField0_ &= -129;
            this.wagerName_ = "";
            this.bitField0_ &= -257;
            this.socre_ = 0;
            this.bitField0_ &= -513;
            this.recordId_ = 0;
            this.bitField0_ &= -1025;
            this.winNum_ = 0;
            this.bitField0_ &= -2049;
            this.leftLv_ = 0;
            this.bitField0_ &= -4097;
            this.rightLv_ = 0;
            this.bitField0_ &= -8193;
            this.startTIme_ = 0;
            this.bitField0_ &= -16385;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessRecordInfo_descriptor;
         }

         public GuessRecordInfo getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.GuessRecordInfo.getDefaultInstance();
         }

         public GuessRecordInfo build() {
            GuessRecordInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public GuessRecordInfo buildPartial() {
            GuessRecordInfo result = new GuessRecordInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.round_ = this.round_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.leftId_ = this.leftId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.rightId_ = this.rightId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.leftName_ = this.leftName_;
            if ((from_bitField0_ & 16) != 0) {
               to_bitField0_ |= 16;
            }

            result.rightName_ = this.rightName_;
            if ((from_bitField0_ & 32) != 0) {
               result.leftHead_ = this.leftHead_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.rightHead_ = this.rightHead_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.win_ = this.win_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               to_bitField0_ |= 256;
            }

            result.wagerName_ = this.wagerName_;
            if ((from_bitField0_ & 512) != 0) {
               result.socre_ = this.socre_;
               to_bitField0_ |= 512;
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.recordId_ = this.recordId_;
               to_bitField0_ |= 1024;
            }

            if ((from_bitField0_ & 2048) != 0) {
               result.winNum_ = this.winNum_;
               to_bitField0_ |= 2048;
            }

            if ((from_bitField0_ & 4096) != 0) {
               result.leftLv_ = this.leftLv_;
               to_bitField0_ |= 4096;
            }

            if ((from_bitField0_ & 8192) != 0) {
               result.rightLv_ = this.rightLv_;
               to_bitField0_ |= 8192;
            }

            if ((from_bitField0_ & 16384) != 0) {
               result.startTIme_ = this.startTIme_;
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
            if (other instanceof GuessRecordInfo) {
               return this.mergeFrom((GuessRecordInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(GuessRecordInfo other) {
            if (other == KingOfCentralPlainsMsg.GuessRecordInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRound()) {
                  this.setRound(other.getRound());
               }

               if (other.hasLeftId()) {
                  this.setLeftId(other.getLeftId());
               }

               if (other.hasRightId()) {
                  this.setRightId(other.getRightId());
               }

               if (other.hasLeftName()) {
                  this.bitField0_ |= 8;
                  this.leftName_ = other.leftName_;
                  this.onChanged();
               }

               if (other.hasRightName()) {
                  this.bitField0_ |= 16;
                  this.rightName_ = other.rightName_;
                  this.onChanged();
               }

               if (other.hasLeftHead()) {
                  this.setLeftHead(other.getLeftHead());
               }

               if (other.hasRightHead()) {
                  this.setRightHead(other.getRightHead());
               }

               if (other.hasWin()) {
                  this.setWin(other.getWin());
               }

               if (other.hasWagerName()) {
                  this.bitField0_ |= 256;
                  this.wagerName_ = other.wagerName_;
                  this.onChanged();
               }

               if (other.hasSocre()) {
                  this.setSocre(other.getSocre());
               }

               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               if (other.hasWinNum()) {
                  this.setWinNum(other.getWinNum());
               }

               if (other.hasLeftLv()) {
                  this.setLeftLv(other.getLeftLv());
               }

               if (other.hasRightLv()) {
                  this.setRightLv(other.getRightLv());
               }

               if (other.hasStartTIme()) {
                  this.setStartTIme(other.getStartTIme());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRound()) {
               return false;
            } else if (!this.hasLeftId()) {
               return false;
            } else if (!this.hasRightId()) {
               return false;
            } else if (!this.hasLeftName()) {
               return false;
            } else if (!this.hasRightName()) {
               return false;
            } else if (!this.hasLeftHead()) {
               return false;
            } else if (!this.hasRightHead()) {
               return false;
            } else if (!this.hasWin()) {
               return false;
            } else if (!this.hasWagerName()) {
               return false;
            } else if (!this.hasSocre()) {
               return false;
            } else if (!this.hasRecordId()) {
               return false;
            } else if (!this.hasWinNum()) {
               return false;
            } else {
               return this.hasStartTIme();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            GuessRecordInfo parsedMessage = null;

            try {
               parsedMessage = (GuessRecordInfo)KingOfCentralPlainsMsg.GuessRecordInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (GuessRecordInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRound() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRound() {
            return this.round_;
         }

         public Builder setRound(int value) {
            this.bitField0_ |= 1;
            this.round_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRound() {
            this.bitField0_ &= -2;
            this.round_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLeftId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLeftId() {
            return this.leftId_;
         }

         public Builder setLeftId(int value) {
            this.bitField0_ |= 2;
            this.leftId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLeftId() {
            this.bitField0_ &= -3;
            this.leftId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRightId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getRightId() {
            return this.rightId_;
         }

         public Builder setRightId(int value) {
            this.bitField0_ |= 4;
            this.rightId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRightId() {
            this.bitField0_ &= -5;
            this.rightId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLeftName() {
            return (this.bitField0_ & 8) != 0;
         }

         public String getLeftName() {
            Object ref = this.leftName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.leftName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getLeftNameBytes() {
            Object ref = this.leftName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.leftName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setLeftName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.leftName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearLeftName() {
            this.bitField0_ &= -9;
            this.leftName_ = KingOfCentralPlainsMsg.GuessRecordInfo.getDefaultInstance().getLeftName();
            this.onChanged();
            return this;
         }

         public Builder setLeftNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.leftName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasRightName() {
            return (this.bitField0_ & 16) != 0;
         }

         public String getRightName() {
            Object ref = this.rightName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.rightName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getRightNameBytes() {
            Object ref = this.rightName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.rightName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setRightName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16;
               this.rightName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearRightName() {
            this.bitField0_ &= -17;
            this.rightName_ = KingOfCentralPlainsMsg.GuessRecordInfo.getDefaultInstance().getRightName();
            this.onChanged();
            return this;
         }

         public Builder setRightNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16;
               this.rightName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasLeftHead() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getLeftHead() {
            return this.leftHead_;
         }

         public Builder setLeftHead(int value) {
            this.bitField0_ |= 32;
            this.leftHead_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLeftHead() {
            this.bitField0_ &= -33;
            this.leftHead_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRightHead() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getRightHead() {
            return this.rightHead_;
         }

         public Builder setRightHead(int value) {
            this.bitField0_ |= 64;
            this.rightHead_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRightHead() {
            this.bitField0_ &= -65;
            this.rightHead_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasWin() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getWin() {
            return this.win_;
         }

         public Builder setWin(int value) {
            this.bitField0_ |= 128;
            this.win_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWin() {
            this.bitField0_ &= -129;
            this.win_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasWagerName() {
            return (this.bitField0_ & 256) != 0;
         }

         public String getWagerName() {
            Object ref = this.wagerName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.wagerName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getWagerNameBytes() {
            Object ref = this.wagerName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.wagerName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setWagerName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 256;
               this.wagerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearWagerName() {
            this.bitField0_ &= -257;
            this.wagerName_ = KingOfCentralPlainsMsg.GuessRecordInfo.getDefaultInstance().getWagerName();
            this.onChanged();
            return this;
         }

         public Builder setWagerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 256;
               this.wagerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasSocre() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getSocre() {
            return this.socre_;
         }

         public Builder setSocre(int value) {
            this.bitField0_ |= 512;
            this.socre_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSocre() {
            this.bitField0_ &= -513;
            this.socre_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRecordId() {
            return (this.bitField0_ & 1024) != 0;
         }

         public int getRecordId() {
            return this.recordId_;
         }

         public Builder setRecordId(int value) {
            this.bitField0_ |= 1024;
            this.recordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecordId() {
            this.bitField0_ &= -1025;
            this.recordId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasWinNum() {
            return (this.bitField0_ & 2048) != 0;
         }

         public int getWinNum() {
            return this.winNum_;
         }

         public Builder setWinNum(int value) {
            this.bitField0_ |= 2048;
            this.winNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWinNum() {
            this.bitField0_ &= -2049;
            this.winNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLeftLv() {
            return (this.bitField0_ & 4096) != 0;
         }

         public int getLeftLv() {
            return this.leftLv_;
         }

         public Builder setLeftLv(int value) {
            this.bitField0_ |= 4096;
            this.leftLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLeftLv() {
            this.bitField0_ &= -4097;
            this.leftLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRightLv() {
            return (this.bitField0_ & 8192) != 0;
         }

         public int getRightLv() {
            return this.rightLv_;
         }

         public Builder setRightLv(int value) {
            this.bitField0_ |= 8192;
            this.rightLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRightLv() {
            this.bitField0_ &= -8193;
            this.rightLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStartTIme() {
            return (this.bitField0_ & 16384) != 0;
         }

         public int getStartTIme() {
            return this.startTIme_;
         }

         public Builder setStartTIme(int value) {
            this.bitField0_ |= 16384;
            this.startTIme_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTIme() {
            this.bitField0_ &= -16385;
            this.startTIme_ = 0;
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

   public static final class C2S_GuessRecord_9617 extends GeneratedMessageV3 implements C2S_GuessRecord_9617OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GuessRecord_9617 DEFAULT_INSTANCE = new C2S_GuessRecord_9617();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GuessRecord_9617> PARSER = new AbstractParser<C2S_GuessRecord_9617>() {
         public C2S_GuessRecord_9617 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GuessRecord_9617(input, extensionRegistry);
         }
      };

      private C2S_GuessRecord_9617(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GuessRecord_9617() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GuessRecord_9617();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GuessRecord_9617(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessRecord_9617_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessRecord_9617_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GuessRecord_9617.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GuessRecord_9617)) {
            return super.equals(obj);
         } else {
            C2S_GuessRecord_9617 other = (C2S_GuessRecord_9617)obj;
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

      public static C2S_GuessRecord_9617 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GuessRecord_9617)PARSER.parseFrom(data);
      }

      public static C2S_GuessRecord_9617 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GuessRecord_9617)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GuessRecord_9617 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GuessRecord_9617)PARSER.parseFrom(data);
      }

      public static C2S_GuessRecord_9617 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GuessRecord_9617)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GuessRecord_9617 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GuessRecord_9617)PARSER.parseFrom(data);
      }

      public static C2S_GuessRecord_9617 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GuessRecord_9617)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GuessRecord_9617 parseFrom(InputStream input) throws IOException {
         return (C2S_GuessRecord_9617)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GuessRecord_9617 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GuessRecord_9617)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GuessRecord_9617 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GuessRecord_9617)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GuessRecord_9617 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GuessRecord_9617)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GuessRecord_9617 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GuessRecord_9617)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GuessRecord_9617 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GuessRecord_9617)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GuessRecord_9617 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GuessRecord_9617 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GuessRecord_9617> parser() {
         return PARSER;
      }

      public Parser<C2S_GuessRecord_9617> getParserForType() {
         return PARSER;
      }

      public C2S_GuessRecord_9617 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GuessRecord_9617OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessRecord_9617_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessRecord_9617_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GuessRecord_9617.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.C2S_GuessRecord_9617.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessRecord_9617_descriptor;
         }

         public C2S_GuessRecord_9617 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.C2S_GuessRecord_9617.getDefaultInstance();
         }

         public C2S_GuessRecord_9617 build() {
            C2S_GuessRecord_9617 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GuessRecord_9617 buildPartial() {
            C2S_GuessRecord_9617 result = new C2S_GuessRecord_9617(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_GuessRecord_9617) {
               return this.mergeFrom((C2S_GuessRecord_9617)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GuessRecord_9617 other) {
            if (other == KingOfCentralPlainsMsg.C2S_GuessRecord_9617.getDefaultInstance()) {
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
            C2S_GuessRecord_9617 parsedMessage = null;

            try {
               parsedMessage = (C2S_GuessRecord_9617)KingOfCentralPlainsMsg.C2S_GuessRecord_9617.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GuessRecord_9617)e.getUnfinishedMessage();
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

   public static final class S2C_GuessRecordResult_9618 extends GeneratedMessageV3 implements S2C_GuessRecordResult_9618OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<GuessRecordInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_GuessRecordResult_9618 DEFAULT_INSTANCE = new S2C_GuessRecordResult_9618();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GuessRecordResult_9618> PARSER = new AbstractParser<S2C_GuessRecordResult_9618>() {
         public S2C_GuessRecordResult_9618 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GuessRecordResult_9618(input, extensionRegistry);
         }
      };

      private S2C_GuessRecordResult_9618(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GuessRecordResult_9618() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GuessRecordResult_9618();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GuessRecordResult_9618(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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

                        this.infos_.add(input.readMessage(KingOfCentralPlainsMsg.GuessRecordInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessRecordResult_9618_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessRecordResult_9618_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GuessRecordResult_9618.class, Builder.class);
      }

      public List<GuessRecordInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends GuessRecordInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public GuessRecordInfo getInfos(int index) {
         return (GuessRecordInfo)this.infos_.get(index);
      }

      public GuessRecordInfoOrBuilder getInfosOrBuilder(int index) {
         return (GuessRecordInfoOrBuilder)this.infos_.get(index);
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
         } else if (!(obj instanceof S2C_GuessRecordResult_9618)) {
            return super.equals(obj);
         } else {
            S2C_GuessRecordResult_9618 other = (S2C_GuessRecordResult_9618)obj;
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

      public static S2C_GuessRecordResult_9618 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GuessRecordResult_9618)PARSER.parseFrom(data);
      }

      public static S2C_GuessRecordResult_9618 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GuessRecordResult_9618)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GuessRecordResult_9618 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GuessRecordResult_9618)PARSER.parseFrom(data);
      }

      public static S2C_GuessRecordResult_9618 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GuessRecordResult_9618)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GuessRecordResult_9618 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GuessRecordResult_9618)PARSER.parseFrom(data);
      }

      public static S2C_GuessRecordResult_9618 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GuessRecordResult_9618)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GuessRecordResult_9618 parseFrom(InputStream input) throws IOException {
         return (S2C_GuessRecordResult_9618)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GuessRecordResult_9618 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GuessRecordResult_9618)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GuessRecordResult_9618 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GuessRecordResult_9618)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GuessRecordResult_9618 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GuessRecordResult_9618)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GuessRecordResult_9618 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GuessRecordResult_9618)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GuessRecordResult_9618 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GuessRecordResult_9618)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GuessRecordResult_9618 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GuessRecordResult_9618 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GuessRecordResult_9618> parser() {
         return PARSER;
      }

      public Parser<S2C_GuessRecordResult_9618> getParserForType() {
         return PARSER;
      }

      public S2C_GuessRecordResult_9618 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GuessRecordResult_9618OrBuilder {
         private int bitField0_;
         private List<GuessRecordInfo> infos_;
         private RepeatedFieldBuilderV3<GuessRecordInfo, GuessRecordInfo.Builder, GuessRecordInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessRecordResult_9618_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessRecordResult_9618_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GuessRecordResult_9618.class, Builder.class);
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
            if (KingOfCentralPlainsMsg.S2C_GuessRecordResult_9618.alwaysUseFieldBuilders) {
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
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessRecordResult_9618_descriptor;
         }

         public S2C_GuessRecordResult_9618 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.S2C_GuessRecordResult_9618.getDefaultInstance();
         }

         public S2C_GuessRecordResult_9618 build() {
            S2C_GuessRecordResult_9618 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GuessRecordResult_9618 buildPartial() {
            S2C_GuessRecordResult_9618 result = new S2C_GuessRecordResult_9618(this);
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
            if (other instanceof S2C_GuessRecordResult_9618) {
               return this.mergeFrom((S2C_GuessRecordResult_9618)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GuessRecordResult_9618 other) {
            if (other == KingOfCentralPlainsMsg.S2C_GuessRecordResult_9618.getDefaultInstance()) {
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
                     this.infosBuilder_ = KingOfCentralPlainsMsg.S2C_GuessRecordResult_9618.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
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
            S2C_GuessRecordResult_9618 parsedMessage = null;

            try {
               parsedMessage = (S2C_GuessRecordResult_9618)KingOfCentralPlainsMsg.S2C_GuessRecordResult_9618.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GuessRecordResult_9618)e.getUnfinishedMessage();
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

         public List<GuessRecordInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public GuessRecordInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (GuessRecordInfo)this.infos_.get(index) : (GuessRecordInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, GuessRecordInfo value) {
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

         public Builder setInfos(int index, GuessRecordInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(GuessRecordInfo value) {
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

         public Builder addInfos(int index, GuessRecordInfo value) {
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

         public Builder addInfos(GuessRecordInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, GuessRecordInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends GuessRecordInfo> values) {
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

         public GuessRecordInfo.Builder getInfosBuilder(int index) {
            return (GuessRecordInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public GuessRecordInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (GuessRecordInfoOrBuilder)this.infos_.get(index) : (GuessRecordInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends GuessRecordInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public GuessRecordInfo.Builder addInfosBuilder() {
            return (GuessRecordInfo.Builder)this.getInfosFieldBuilder().addBuilder(KingOfCentralPlainsMsg.GuessRecordInfo.getDefaultInstance());
         }

         public GuessRecordInfo.Builder addInfosBuilder(int index) {
            return (GuessRecordInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, KingOfCentralPlainsMsg.GuessRecordInfo.getDefaultInstance());
         }

         public List<GuessRecordInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<GuessRecordInfo, GuessRecordInfo.Builder, GuessRecordInfoOrBuilder> getInfosFieldBuilder() {
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

   public static final class C2S_GuessRecordAll_9619 extends GeneratedMessageV3 implements C2S_GuessRecordAll_9619OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GuessRecordAll_9619 DEFAULT_INSTANCE = new C2S_GuessRecordAll_9619();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GuessRecordAll_9619> PARSER = new AbstractParser<C2S_GuessRecordAll_9619>() {
         public C2S_GuessRecordAll_9619 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GuessRecordAll_9619(input, extensionRegistry);
         }
      };

      private C2S_GuessRecordAll_9619(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GuessRecordAll_9619() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GuessRecordAll_9619();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GuessRecordAll_9619(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessRecordAll_9619_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessRecordAll_9619_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GuessRecordAll_9619.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GuessRecordAll_9619)) {
            return super.equals(obj);
         } else {
            C2S_GuessRecordAll_9619 other = (C2S_GuessRecordAll_9619)obj;
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

      public static C2S_GuessRecordAll_9619 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GuessRecordAll_9619)PARSER.parseFrom(data);
      }

      public static C2S_GuessRecordAll_9619 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GuessRecordAll_9619)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GuessRecordAll_9619 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GuessRecordAll_9619)PARSER.parseFrom(data);
      }

      public static C2S_GuessRecordAll_9619 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GuessRecordAll_9619)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GuessRecordAll_9619 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GuessRecordAll_9619)PARSER.parseFrom(data);
      }

      public static C2S_GuessRecordAll_9619 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GuessRecordAll_9619)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GuessRecordAll_9619 parseFrom(InputStream input) throws IOException {
         return (C2S_GuessRecordAll_9619)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GuessRecordAll_9619 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GuessRecordAll_9619)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GuessRecordAll_9619 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GuessRecordAll_9619)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GuessRecordAll_9619 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GuessRecordAll_9619)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GuessRecordAll_9619 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GuessRecordAll_9619)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GuessRecordAll_9619 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GuessRecordAll_9619)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GuessRecordAll_9619 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GuessRecordAll_9619 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GuessRecordAll_9619> parser() {
         return PARSER;
      }

      public Parser<C2S_GuessRecordAll_9619> getParserForType() {
         return PARSER;
      }

      public C2S_GuessRecordAll_9619 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GuessRecordAll_9619OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessRecordAll_9619_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessRecordAll_9619_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GuessRecordAll_9619.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.C2S_GuessRecordAll_9619.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_GuessRecordAll_9619_descriptor;
         }

         public C2S_GuessRecordAll_9619 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.C2S_GuessRecordAll_9619.getDefaultInstance();
         }

         public C2S_GuessRecordAll_9619 build() {
            C2S_GuessRecordAll_9619 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GuessRecordAll_9619 buildPartial() {
            C2S_GuessRecordAll_9619 result = new C2S_GuessRecordAll_9619(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_GuessRecordAll_9619) {
               return this.mergeFrom((C2S_GuessRecordAll_9619)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GuessRecordAll_9619 other) {
            if (other == KingOfCentralPlainsMsg.C2S_GuessRecordAll_9619.getDefaultInstance()) {
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
            C2S_GuessRecordAll_9619 parsedMessage = null;

            try {
               parsedMessage = (C2S_GuessRecordAll_9619)KingOfCentralPlainsMsg.C2S_GuessRecordAll_9619.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GuessRecordAll_9619)e.getUnfinishedMessage();
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

   public static final class S2C_GuessRecordAll_9620 extends GeneratedMessageV3 implements S2C_GuessRecordAll_9620OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<GuessRecord> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_GuessRecordAll_9620 DEFAULT_INSTANCE = new S2C_GuessRecordAll_9620();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GuessRecordAll_9620> PARSER = new AbstractParser<S2C_GuessRecordAll_9620>() {
         public S2C_GuessRecordAll_9620 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GuessRecordAll_9620(input, extensionRegistry);
         }
      };

      private S2C_GuessRecordAll_9620(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GuessRecordAll_9620() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GuessRecordAll_9620();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GuessRecordAll_9620(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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

                        this.infos_.add(input.readMessage(KingOfCentralPlainsMsg.GuessRecord.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessRecordAll_9620_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessRecordAll_9620_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GuessRecordAll_9620.class, Builder.class);
      }

      public List<GuessRecord> getInfosList() {
         return this.infos_;
      }

      public List<? extends GuessRecordOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public GuessRecord getInfos(int index) {
         return (GuessRecord)this.infos_.get(index);
      }

      public GuessRecordOrBuilder getInfosOrBuilder(int index) {
         return (GuessRecordOrBuilder)this.infos_.get(index);
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
         } else if (!(obj instanceof S2C_GuessRecordAll_9620)) {
            return super.equals(obj);
         } else {
            S2C_GuessRecordAll_9620 other = (S2C_GuessRecordAll_9620)obj;
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

      public static S2C_GuessRecordAll_9620 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GuessRecordAll_9620)PARSER.parseFrom(data);
      }

      public static S2C_GuessRecordAll_9620 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GuessRecordAll_9620)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GuessRecordAll_9620 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GuessRecordAll_9620)PARSER.parseFrom(data);
      }

      public static S2C_GuessRecordAll_9620 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GuessRecordAll_9620)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GuessRecordAll_9620 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GuessRecordAll_9620)PARSER.parseFrom(data);
      }

      public static S2C_GuessRecordAll_9620 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GuessRecordAll_9620)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GuessRecordAll_9620 parseFrom(InputStream input) throws IOException {
         return (S2C_GuessRecordAll_9620)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GuessRecordAll_9620 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GuessRecordAll_9620)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GuessRecordAll_9620 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GuessRecordAll_9620)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GuessRecordAll_9620 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GuessRecordAll_9620)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GuessRecordAll_9620 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GuessRecordAll_9620)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GuessRecordAll_9620 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GuessRecordAll_9620)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GuessRecordAll_9620 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GuessRecordAll_9620 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GuessRecordAll_9620> parser() {
         return PARSER;
      }

      public Parser<S2C_GuessRecordAll_9620> getParserForType() {
         return PARSER;
      }

      public S2C_GuessRecordAll_9620 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GuessRecordAll_9620OrBuilder {
         private int bitField0_;
         private List<GuessRecord> infos_;
         private RepeatedFieldBuilderV3<GuessRecord, GuessRecord.Builder, GuessRecordOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessRecordAll_9620_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessRecordAll_9620_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GuessRecordAll_9620.class, Builder.class);
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
            if (KingOfCentralPlainsMsg.S2C_GuessRecordAll_9620.alwaysUseFieldBuilders) {
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
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_GuessRecordAll_9620_descriptor;
         }

         public S2C_GuessRecordAll_9620 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.S2C_GuessRecordAll_9620.getDefaultInstance();
         }

         public S2C_GuessRecordAll_9620 build() {
            S2C_GuessRecordAll_9620 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GuessRecordAll_9620 buildPartial() {
            S2C_GuessRecordAll_9620 result = new S2C_GuessRecordAll_9620(this);
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
            if (other instanceof S2C_GuessRecordAll_9620) {
               return this.mergeFrom((S2C_GuessRecordAll_9620)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GuessRecordAll_9620 other) {
            if (other == KingOfCentralPlainsMsg.S2C_GuessRecordAll_9620.getDefaultInstance()) {
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
                     this.infosBuilder_ = KingOfCentralPlainsMsg.S2C_GuessRecordAll_9620.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
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
            S2C_GuessRecordAll_9620 parsedMessage = null;

            try {
               parsedMessage = (S2C_GuessRecordAll_9620)KingOfCentralPlainsMsg.S2C_GuessRecordAll_9620.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GuessRecordAll_9620)e.getUnfinishedMessage();
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

         public List<GuessRecord> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public GuessRecord getInfos(int index) {
            return this.infosBuilder_ == null ? (GuessRecord)this.infos_.get(index) : (GuessRecord)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, GuessRecord value) {
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

         public Builder setInfos(int index, GuessRecord.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(GuessRecord value) {
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

         public Builder addInfos(int index, GuessRecord value) {
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

         public Builder addInfos(GuessRecord.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, GuessRecord.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends GuessRecord> values) {
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

         public GuessRecord.Builder getInfosBuilder(int index) {
            return (GuessRecord.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public GuessRecordOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (GuessRecordOrBuilder)this.infos_.get(index) : (GuessRecordOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends GuessRecordOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public GuessRecord.Builder addInfosBuilder() {
            return (GuessRecord.Builder)this.getInfosFieldBuilder().addBuilder(KingOfCentralPlainsMsg.GuessRecord.getDefaultInstance());
         }

         public GuessRecord.Builder addInfosBuilder(int index) {
            return (GuessRecord.Builder)this.getInfosFieldBuilder().addBuilder(index, KingOfCentralPlainsMsg.GuessRecord.getDefaultInstance());
         }

         public List<GuessRecord.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<GuessRecord, GuessRecord.Builder, GuessRecordOrBuilder> getInfosFieldBuilder() {
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

   public static final class GuessRecord extends GeneratedMessageV3 implements GuessRecordOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ROUND_FIELD_NUMBER = 1;
      private int round_;
      public static final int FIGHT_FIELD_NUMBER = 2;
      private FightData fight_;
      public static final int WAGERID_FIELD_NUMBER = 3;
      private int wagerId_;
      public static final int SOCRE_FIELD_NUMBER = 4;
      private int socre_;
      public static final int WINNUM_FIELD_NUMBER = 5;
      private int winNum_;
      private byte memoizedIsInitialized;
      private static final GuessRecord DEFAULT_INSTANCE = new GuessRecord();
      /** @deprecated */
      @Deprecated
      public static final Parser<GuessRecord> PARSER = new AbstractParser<GuessRecord>() {
         public GuessRecord parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new GuessRecord(input, extensionRegistry);
         }
      };

      private GuessRecord(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private GuessRecord() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new GuessRecord();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private GuessRecord(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.round_ = input.readInt32();
                        break;
                     case 18:
                        FightData.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.fight_.toBuilder();
                        }

                        this.fight_ = (FightData)input.readMessage(KingOfCentralPlainsMsg.FightData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.fight_);
                           this.fight_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.wagerId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.socre_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(GuessRecord.class, Builder.class);
      }

      public boolean hasRound() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRound() {
         return this.round_;
      }

      public boolean hasFight() {
         return (this.bitField0_ & 2) != 0;
      }

      public FightData getFight() {
         return this.fight_ == null ? KingOfCentralPlainsMsg.FightData.getDefaultInstance() : this.fight_;
      }

      public FightDataOrBuilder getFightOrBuilder() {
         return this.fight_ == null ? KingOfCentralPlainsMsg.FightData.getDefaultInstance() : this.fight_;
      }

      public boolean hasWagerId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getWagerId() {
         return this.wagerId_;
      }

      public boolean hasSocre() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getSocre() {
         return this.socre_;
      }

      public boolean hasWinNum() {
         return (this.bitField0_ & 16) != 0;
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
         } else if (!this.hasRound()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFight()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getFight().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.round_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getFight());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.wagerId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.socre_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.winNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.round_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getFight());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.wagerId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.socre_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.winNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof GuessRecord)) {
            return super.equals(obj);
         } else {
            GuessRecord other = (GuessRecord)obj;
            if (this.hasRound() != other.hasRound()) {
               return false;
            } else if (this.hasRound() && this.getRound() != other.getRound()) {
               return false;
            } else if (this.hasFight() != other.hasFight()) {
               return false;
            } else if (this.hasFight() && !this.getFight().equals(other.getFight())) {
               return false;
            } else if (this.hasWagerId() != other.hasWagerId()) {
               return false;
            } else if (this.hasWagerId() && this.getWagerId() != other.getWagerId()) {
               return false;
            } else if (this.hasSocre() != other.hasSocre()) {
               return false;
            } else if (this.hasSocre() && this.getSocre() != other.getSocre()) {
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
            if (this.hasRound()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRound();
            }

            if (this.hasFight()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getFight().hashCode();
            }

            if (this.hasWagerId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getWagerId();
            }

            if (this.hasSocre()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSocre();
            }

            if (this.hasWinNum()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getWinNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static GuessRecord parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (GuessRecord)PARSER.parseFrom(data);
      }

      public static GuessRecord parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GuessRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GuessRecord parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (GuessRecord)PARSER.parseFrom(data);
      }

      public static GuessRecord parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GuessRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GuessRecord parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (GuessRecord)PARSER.parseFrom(data);
      }

      public static GuessRecord parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GuessRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GuessRecord parseFrom(InputStream input) throws IOException {
         return (GuessRecord)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GuessRecord parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GuessRecord)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static GuessRecord parseDelimitedFrom(InputStream input) throws IOException {
         return (GuessRecord)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static GuessRecord parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GuessRecord)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static GuessRecord parseFrom(CodedInputStream input) throws IOException {
         return (GuessRecord)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GuessRecord parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GuessRecord)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(GuessRecord prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static GuessRecord getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<GuessRecord> parser() {
         return PARSER;
      }

      public Parser<GuessRecord> getParserForType() {
         return PARSER;
      }

      public GuessRecord getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GuessRecordOrBuilder {
         private int bitField0_;
         private int round_;
         private FightData fight_;
         private SingleFieldBuilderV3<FightData, FightData.Builder, FightDataOrBuilder> fightBuilder_;
         private int wagerId_;
         private int socre_;
         private int winNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(GuessRecord.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.GuessRecord.alwaysUseFieldBuilders) {
               this.getFightFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.round_ = 0;
            this.bitField0_ &= -2;
            if (this.fightBuilder_ == null) {
               this.fight_ = null;
            } else {
               this.fightBuilder_.clear();
            }

            this.bitField0_ &= -3;
            this.wagerId_ = 0;
            this.bitField0_ &= -5;
            this.socre_ = 0;
            this.bitField0_ &= -9;
            this.winNum_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_GuessRecord_descriptor;
         }

         public GuessRecord getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.GuessRecord.getDefaultInstance();
         }

         public GuessRecord build() {
            GuessRecord result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public GuessRecord buildPartial() {
            GuessRecord result = new GuessRecord(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.round_ = this.round_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.fightBuilder_ == null) {
                  result.fight_ = this.fight_;
               } else {
                  result.fight_ = (FightData)this.fightBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.wagerId_ = this.wagerId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.socre_ = this.socre_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.winNum_ = this.winNum_;
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
            if (other instanceof GuessRecord) {
               return this.mergeFrom((GuessRecord)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(GuessRecord other) {
            if (other == KingOfCentralPlainsMsg.GuessRecord.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRound()) {
                  this.setRound(other.getRound());
               }

               if (other.hasFight()) {
                  this.mergeFight(other.getFight());
               }

               if (other.hasWagerId()) {
                  this.setWagerId(other.getWagerId());
               }

               if (other.hasSocre()) {
                  this.setSocre(other.getSocre());
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
            if (!this.hasRound()) {
               return false;
            } else if (!this.hasFight()) {
               return false;
            } else {
               return this.getFight().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            GuessRecord parsedMessage = null;

            try {
               parsedMessage = (GuessRecord)KingOfCentralPlainsMsg.GuessRecord.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (GuessRecord)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRound() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRound() {
            return this.round_;
         }

         public Builder setRound(int value) {
            this.bitField0_ |= 1;
            this.round_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRound() {
            this.bitField0_ &= -2;
            this.round_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFight() {
            return (this.bitField0_ & 2) != 0;
         }

         public FightData getFight() {
            if (this.fightBuilder_ == null) {
               return this.fight_ == null ? KingOfCentralPlainsMsg.FightData.getDefaultInstance() : this.fight_;
            } else {
               return (FightData)this.fightBuilder_.getMessage();
            }
         }

         public Builder setFight(FightData value) {
            if (this.fightBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.fight_ = value;
               this.onChanged();
            } else {
               this.fightBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setFight(FightData.Builder builderForValue) {
            if (this.fightBuilder_ == null) {
               this.fight_ = builderForValue.build();
               this.onChanged();
            } else {
               this.fightBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeFight(FightData value) {
            if (this.fightBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.fight_ != null && this.fight_ != KingOfCentralPlainsMsg.FightData.getDefaultInstance()) {
                  this.fight_ = KingOfCentralPlainsMsg.FightData.newBuilder(this.fight_).mergeFrom(value).buildPartial();
               } else {
                  this.fight_ = value;
               }

               this.onChanged();
            } else {
               this.fightBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearFight() {
            if (this.fightBuilder_ == null) {
               this.fight_ = null;
               this.onChanged();
            } else {
               this.fightBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public FightData.Builder getFightBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (FightData.Builder)this.getFightFieldBuilder().getBuilder();
         }

         public FightDataOrBuilder getFightOrBuilder() {
            if (this.fightBuilder_ != null) {
               return (FightDataOrBuilder)this.fightBuilder_.getMessageOrBuilder();
            } else {
               return this.fight_ == null ? KingOfCentralPlainsMsg.FightData.getDefaultInstance() : this.fight_;
            }
         }

         private SingleFieldBuilderV3<FightData, FightData.Builder, FightDataOrBuilder> getFightFieldBuilder() {
            if (this.fightBuilder_ == null) {
               this.fightBuilder_ = new SingleFieldBuilderV3(this.getFight(), this.getParentForChildren(), this.isClean());
               this.fight_ = null;
            }

            return this.fightBuilder_;
         }

         public boolean hasWagerId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getWagerId() {
            return this.wagerId_;
         }

         public Builder setWagerId(int value) {
            this.bitField0_ |= 4;
            this.wagerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWagerId() {
            this.bitField0_ &= -5;
            this.wagerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSocre() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getSocre() {
            return this.socre_;
         }

         public Builder setSocre(int value) {
            this.bitField0_ |= 8;
            this.socre_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSocre() {
            this.bitField0_ &= -9;
            this.socre_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasWinNum() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getWinNum() {
            return this.winNum_;
         }

         public Builder setWinNum(int value) {
            this.bitField0_ |= 16;
            this.winNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWinNum() {
            this.bitField0_ &= -17;
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

   public static final class FightMap32 extends GeneratedMessageV3 implements FightMap32OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GROUP_FIELD_NUMBER = 1;
      private int group_;
      public static final int FIGHT32_FIELD_NUMBER = 2;
      private List<GroupFightData> fight32_;
      public static final int FIGHT16_FIELD_NUMBER = 3;
      private List<GroupFightData> fight16_;
      public static final int FIGHT8_FIELD_NUMBER = 4;
      private List<GroupFightData> fight8_;
      private byte memoizedIsInitialized;
      private static final FightMap32 DEFAULT_INSTANCE = new FightMap32();
      /** @deprecated */
      @Deprecated
      public static final Parser<FightMap32> PARSER = new AbstractParser<FightMap32>() {
         public FightMap32 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new FightMap32(input, extensionRegistry);
         }
      };

      private FightMap32(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private FightMap32() {
         this.memoizedIsInitialized = -1;
         this.fight32_ = Collections.emptyList();
         this.fight16_ = Collections.emptyList();
         this.fight8_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new FightMap32();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private FightMap32(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.group_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.fight32_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.fight32_.add(input.readMessage(KingOfCentralPlainsMsg.GroupFightData.PARSER, extensionRegistry));
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.fight16_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.fight16_.add(input.readMessage(KingOfCentralPlainsMsg.GroupFightData.PARSER, extensionRegistry));
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.fight8_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.fight8_.add(input.readMessage(KingOfCentralPlainsMsg.GroupFightData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.fight32_ = Collections.unmodifiableList(this.fight32_);
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.fight16_ = Collections.unmodifiableList(this.fight16_);
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.fight8_ = Collections.unmodifiableList(this.fight8_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightMap32_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightMap32_fieldAccessorTable.ensureFieldAccessorsInitialized(FightMap32.class, Builder.class);
      }

      public boolean hasGroup() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGroup() {
         return this.group_;
      }

      public List<GroupFightData> getFight32List() {
         return this.fight32_;
      }

      public List<? extends GroupFightDataOrBuilder> getFight32OrBuilderList() {
         return this.fight32_;
      }

      public int getFight32Count() {
         return this.fight32_.size();
      }

      public GroupFightData getFight32(int index) {
         return (GroupFightData)this.fight32_.get(index);
      }

      public GroupFightDataOrBuilder getFight32OrBuilder(int index) {
         return (GroupFightDataOrBuilder)this.fight32_.get(index);
      }

      public List<GroupFightData> getFight16List() {
         return this.fight16_;
      }

      public List<? extends GroupFightDataOrBuilder> getFight16OrBuilderList() {
         return this.fight16_;
      }

      public int getFight16Count() {
         return this.fight16_.size();
      }

      public GroupFightData getFight16(int index) {
         return (GroupFightData)this.fight16_.get(index);
      }

      public GroupFightDataOrBuilder getFight16OrBuilder(int index) {
         return (GroupFightDataOrBuilder)this.fight16_.get(index);
      }

      public List<GroupFightData> getFight8List() {
         return this.fight8_;
      }

      public List<? extends GroupFightDataOrBuilder> getFight8OrBuilderList() {
         return this.fight8_;
      }

      public int getFight8Count() {
         return this.fight8_.size();
      }

      public GroupFightData getFight8(int index) {
         return (GroupFightData)this.fight8_.get(index);
      }

      public GroupFightDataOrBuilder getFight8OrBuilder(int index) {
         return (GroupFightDataOrBuilder)this.fight8_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGroup()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getFight32Count(); ++i) {
               if (!this.getFight32(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getFight16Count(); ++i) {
               if (!this.getFight16(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getFight8Count(); ++i) {
               if (!this.getFight8(i).isInitialized()) {
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
            output.writeInt32(1, this.group_);
         }

         for(int i = 0; i < this.fight32_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.fight32_.get(i));
         }

         for(int i = 0; i < this.fight16_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.fight16_.get(i));
         }

         for(int i = 0; i < this.fight8_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.fight8_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.group_);
            }

            for(int i = 0; i < this.fight32_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.fight32_.get(i));
            }

            for(int i = 0; i < this.fight16_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.fight16_.get(i));
            }

            for(int i = 0; i < this.fight8_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.fight8_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof FightMap32)) {
            return super.equals(obj);
         } else {
            FightMap32 other = (FightMap32)obj;
            if (this.hasGroup() != other.hasGroup()) {
               return false;
            } else if (this.hasGroup() && this.getGroup() != other.getGroup()) {
               return false;
            } else if (!this.getFight32List().equals(other.getFight32List())) {
               return false;
            } else if (!this.getFight16List().equals(other.getFight16List())) {
               return false;
            } else if (!this.getFight8List().equals(other.getFight8List())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasGroup()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGroup();
            }

            if (this.getFight32Count() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getFight32List().hashCode();
            }

            if (this.getFight16Count() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getFight16List().hashCode();
            }

            if (this.getFight8Count() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getFight8List().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static FightMap32 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (FightMap32)PARSER.parseFrom(data);
      }

      public static FightMap32 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FightMap32)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FightMap32 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (FightMap32)PARSER.parseFrom(data);
      }

      public static FightMap32 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FightMap32)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FightMap32 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (FightMap32)PARSER.parseFrom(data);
      }

      public static FightMap32 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FightMap32)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FightMap32 parseFrom(InputStream input) throws IOException {
         return (FightMap32)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static FightMap32 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FightMap32)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static FightMap32 parseDelimitedFrom(InputStream input) throws IOException {
         return (FightMap32)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static FightMap32 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FightMap32)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static FightMap32 parseFrom(CodedInputStream input) throws IOException {
         return (FightMap32)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static FightMap32 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FightMap32)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(FightMap32 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static FightMap32 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<FightMap32> parser() {
         return PARSER;
      }

      public Parser<FightMap32> getParserForType() {
         return PARSER;
      }

      public FightMap32 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FightMap32OrBuilder {
         private int bitField0_;
         private int group_;
         private List<GroupFightData> fight32_;
         private RepeatedFieldBuilderV3<GroupFightData, GroupFightData.Builder, GroupFightDataOrBuilder> fight32Builder_;
         private List<GroupFightData> fight16_;
         private RepeatedFieldBuilderV3<GroupFightData, GroupFightData.Builder, GroupFightDataOrBuilder> fight16Builder_;
         private List<GroupFightData> fight8_;
         private RepeatedFieldBuilderV3<GroupFightData, GroupFightData.Builder, GroupFightDataOrBuilder> fight8Builder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightMap32_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightMap32_fieldAccessorTable.ensureFieldAccessorsInitialized(FightMap32.class, Builder.class);
         }

         private Builder() {
            this.fight32_ = Collections.emptyList();
            this.fight16_ = Collections.emptyList();
            this.fight8_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.fight32_ = Collections.emptyList();
            this.fight16_ = Collections.emptyList();
            this.fight8_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.FightMap32.alwaysUseFieldBuilders) {
               this.getFight32FieldBuilder();
               this.getFight16FieldBuilder();
               this.getFight8FieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.group_ = 0;
            this.bitField0_ &= -2;
            if (this.fight32Builder_ == null) {
               this.fight32_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.fight32Builder_.clear();
            }

            if (this.fight16Builder_ == null) {
               this.fight16_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.fight16Builder_.clear();
            }

            if (this.fight8Builder_ == null) {
               this.fight8_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.fight8Builder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightMap32_descriptor;
         }

         public FightMap32 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.FightMap32.getDefaultInstance();
         }

         public FightMap32 build() {
            FightMap32 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public FightMap32 buildPartial() {
            FightMap32 result = new FightMap32(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.group_ = this.group_;
               to_bitField0_ |= 1;
            }

            if (this.fight32Builder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.fight32_ = Collections.unmodifiableList(this.fight32_);
                  this.bitField0_ &= -3;
               }

               result.fight32_ = this.fight32_;
            } else {
               result.fight32_ = this.fight32Builder_.build();
            }

            if (this.fight16Builder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.fight16_ = Collections.unmodifiableList(this.fight16_);
                  this.bitField0_ &= -5;
               }

               result.fight16_ = this.fight16_;
            } else {
               result.fight16_ = this.fight16Builder_.build();
            }

            if (this.fight8Builder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.fight8_ = Collections.unmodifiableList(this.fight8_);
                  this.bitField0_ &= -9;
               }

               result.fight8_ = this.fight8_;
            } else {
               result.fight8_ = this.fight8Builder_.build();
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
            if (other instanceof FightMap32) {
               return this.mergeFrom((FightMap32)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(FightMap32 other) {
            if (other == KingOfCentralPlainsMsg.FightMap32.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGroup()) {
                  this.setGroup(other.getGroup());
               }

               if (this.fight32Builder_ == null) {
                  if (!other.fight32_.isEmpty()) {
                     if (this.fight32_.isEmpty()) {
                        this.fight32_ = other.fight32_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureFight32IsMutable();
                        this.fight32_.addAll(other.fight32_);
                     }

                     this.onChanged();
                  }
               } else if (!other.fight32_.isEmpty()) {
                  if (this.fight32Builder_.isEmpty()) {
                     this.fight32Builder_.dispose();
                     this.fight32Builder_ = null;
                     this.fight32_ = other.fight32_;
                     this.bitField0_ &= -3;
                     this.fight32Builder_ = KingOfCentralPlainsMsg.FightMap32.alwaysUseFieldBuilders ? this.getFight32FieldBuilder() : null;
                  } else {
                     this.fight32Builder_.addAllMessages(other.fight32_);
                  }
               }

               if (this.fight16Builder_ == null) {
                  if (!other.fight16_.isEmpty()) {
                     if (this.fight16_.isEmpty()) {
                        this.fight16_ = other.fight16_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureFight16IsMutable();
                        this.fight16_.addAll(other.fight16_);
                     }

                     this.onChanged();
                  }
               } else if (!other.fight16_.isEmpty()) {
                  if (this.fight16Builder_.isEmpty()) {
                     this.fight16Builder_.dispose();
                     this.fight16Builder_ = null;
                     this.fight16_ = other.fight16_;
                     this.bitField0_ &= -5;
                     this.fight16Builder_ = KingOfCentralPlainsMsg.FightMap32.alwaysUseFieldBuilders ? this.getFight16FieldBuilder() : null;
                  } else {
                     this.fight16Builder_.addAllMessages(other.fight16_);
                  }
               }

               if (this.fight8Builder_ == null) {
                  if (!other.fight8_.isEmpty()) {
                     if (this.fight8_.isEmpty()) {
                        this.fight8_ = other.fight8_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureFight8IsMutable();
                        this.fight8_.addAll(other.fight8_);
                     }

                     this.onChanged();
                  }
               } else if (!other.fight8_.isEmpty()) {
                  if (this.fight8Builder_.isEmpty()) {
                     this.fight8Builder_.dispose();
                     this.fight8Builder_ = null;
                     this.fight8_ = other.fight8_;
                     this.bitField0_ &= -9;
                     this.fight8Builder_ = KingOfCentralPlainsMsg.FightMap32.alwaysUseFieldBuilders ? this.getFight8FieldBuilder() : null;
                  } else {
                     this.fight8Builder_.addAllMessages(other.fight8_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGroup()) {
               return false;
            } else {
               for(int i = 0; i < this.getFight32Count(); ++i) {
                  if (!this.getFight32(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getFight16Count(); ++i) {
                  if (!this.getFight16(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getFight8Count(); ++i) {
                  if (!this.getFight8(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            FightMap32 parsedMessage = null;

            try {
               parsedMessage = (FightMap32)KingOfCentralPlainsMsg.FightMap32.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (FightMap32)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGroup() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGroup() {
            return this.group_;
         }

         public Builder setGroup(int value) {
            this.bitField0_ |= 1;
            this.group_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGroup() {
            this.bitField0_ &= -2;
            this.group_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureFight32IsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.fight32_ = new ArrayList(this.fight32_);
               this.bitField0_ |= 2;
            }

         }

         public List<GroupFightData> getFight32List() {
            return this.fight32Builder_ == null ? Collections.unmodifiableList(this.fight32_) : this.fight32Builder_.getMessageList();
         }

         public int getFight32Count() {
            return this.fight32Builder_ == null ? this.fight32_.size() : this.fight32Builder_.getCount();
         }

         public GroupFightData getFight32(int index) {
            return this.fight32Builder_ == null ? (GroupFightData)this.fight32_.get(index) : (GroupFightData)this.fight32Builder_.getMessage(index);
         }

         public Builder setFight32(int index, GroupFightData value) {
            if (this.fight32Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFight32IsMutable();
               this.fight32_.set(index, value);
               this.onChanged();
            } else {
               this.fight32Builder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setFight32(int index, GroupFightData.Builder builderForValue) {
            if (this.fight32Builder_ == null) {
               this.ensureFight32IsMutable();
               this.fight32_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.fight32Builder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addFight32(GroupFightData value) {
            if (this.fight32Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFight32IsMutable();
               this.fight32_.add(value);
               this.onChanged();
            } else {
               this.fight32Builder_.addMessage(value);
            }

            return this;
         }

         public Builder addFight32(int index, GroupFightData value) {
            if (this.fight32Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFight32IsMutable();
               this.fight32_.add(index, value);
               this.onChanged();
            } else {
               this.fight32Builder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addFight32(GroupFightData.Builder builderForValue) {
            if (this.fight32Builder_ == null) {
               this.ensureFight32IsMutable();
               this.fight32_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.fight32Builder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addFight32(int index, GroupFightData.Builder builderForValue) {
            if (this.fight32Builder_ == null) {
               this.ensureFight32IsMutable();
               this.fight32_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.fight32Builder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllFight32(Iterable<? extends GroupFightData> values) {
            if (this.fight32Builder_ == null) {
               this.ensureFight32IsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.fight32_);
               this.onChanged();
            } else {
               this.fight32Builder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearFight32() {
            if (this.fight32Builder_ == null) {
               this.fight32_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.fight32Builder_.clear();
            }

            return this;
         }

         public Builder removeFight32(int index) {
            if (this.fight32Builder_ == null) {
               this.ensureFight32IsMutable();
               this.fight32_.remove(index);
               this.onChanged();
            } else {
               this.fight32Builder_.remove(index);
            }

            return this;
         }

         public GroupFightData.Builder getFight32Builder(int index) {
            return (GroupFightData.Builder)this.getFight32FieldBuilder().getBuilder(index);
         }

         public GroupFightDataOrBuilder getFight32OrBuilder(int index) {
            return this.fight32Builder_ == null ? (GroupFightDataOrBuilder)this.fight32_.get(index) : (GroupFightDataOrBuilder)this.fight32Builder_.getMessageOrBuilder(index);
         }

         public List<? extends GroupFightDataOrBuilder> getFight32OrBuilderList() {
            return this.fight32Builder_ != null ? this.fight32Builder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.fight32_);
         }

         public GroupFightData.Builder addFight32Builder() {
            return (GroupFightData.Builder)this.getFight32FieldBuilder().addBuilder(KingOfCentralPlainsMsg.GroupFightData.getDefaultInstance());
         }

         public GroupFightData.Builder addFight32Builder(int index) {
            return (GroupFightData.Builder)this.getFight32FieldBuilder().addBuilder(index, KingOfCentralPlainsMsg.GroupFightData.getDefaultInstance());
         }

         public List<GroupFightData.Builder> getFight32BuilderList() {
            return this.getFight32FieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<GroupFightData, GroupFightData.Builder, GroupFightDataOrBuilder> getFight32FieldBuilder() {
            if (this.fight32Builder_ == null) {
               this.fight32Builder_ = new RepeatedFieldBuilderV3(this.fight32_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.fight32_ = null;
            }

            return this.fight32Builder_;
         }

         private void ensureFight16IsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.fight16_ = new ArrayList(this.fight16_);
               this.bitField0_ |= 4;
            }

         }

         public List<GroupFightData> getFight16List() {
            return this.fight16Builder_ == null ? Collections.unmodifiableList(this.fight16_) : this.fight16Builder_.getMessageList();
         }

         public int getFight16Count() {
            return this.fight16Builder_ == null ? this.fight16_.size() : this.fight16Builder_.getCount();
         }

         public GroupFightData getFight16(int index) {
            return this.fight16Builder_ == null ? (GroupFightData)this.fight16_.get(index) : (GroupFightData)this.fight16Builder_.getMessage(index);
         }

         public Builder setFight16(int index, GroupFightData value) {
            if (this.fight16Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFight16IsMutable();
               this.fight16_.set(index, value);
               this.onChanged();
            } else {
               this.fight16Builder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setFight16(int index, GroupFightData.Builder builderForValue) {
            if (this.fight16Builder_ == null) {
               this.ensureFight16IsMutable();
               this.fight16_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.fight16Builder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addFight16(GroupFightData value) {
            if (this.fight16Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFight16IsMutable();
               this.fight16_.add(value);
               this.onChanged();
            } else {
               this.fight16Builder_.addMessage(value);
            }

            return this;
         }

         public Builder addFight16(int index, GroupFightData value) {
            if (this.fight16Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFight16IsMutable();
               this.fight16_.add(index, value);
               this.onChanged();
            } else {
               this.fight16Builder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addFight16(GroupFightData.Builder builderForValue) {
            if (this.fight16Builder_ == null) {
               this.ensureFight16IsMutable();
               this.fight16_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.fight16Builder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addFight16(int index, GroupFightData.Builder builderForValue) {
            if (this.fight16Builder_ == null) {
               this.ensureFight16IsMutable();
               this.fight16_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.fight16Builder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllFight16(Iterable<? extends GroupFightData> values) {
            if (this.fight16Builder_ == null) {
               this.ensureFight16IsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.fight16_);
               this.onChanged();
            } else {
               this.fight16Builder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearFight16() {
            if (this.fight16Builder_ == null) {
               this.fight16_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.fight16Builder_.clear();
            }

            return this;
         }

         public Builder removeFight16(int index) {
            if (this.fight16Builder_ == null) {
               this.ensureFight16IsMutable();
               this.fight16_.remove(index);
               this.onChanged();
            } else {
               this.fight16Builder_.remove(index);
            }

            return this;
         }

         public GroupFightData.Builder getFight16Builder(int index) {
            return (GroupFightData.Builder)this.getFight16FieldBuilder().getBuilder(index);
         }

         public GroupFightDataOrBuilder getFight16OrBuilder(int index) {
            return this.fight16Builder_ == null ? (GroupFightDataOrBuilder)this.fight16_.get(index) : (GroupFightDataOrBuilder)this.fight16Builder_.getMessageOrBuilder(index);
         }

         public List<? extends GroupFightDataOrBuilder> getFight16OrBuilderList() {
            return this.fight16Builder_ != null ? this.fight16Builder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.fight16_);
         }

         public GroupFightData.Builder addFight16Builder() {
            return (GroupFightData.Builder)this.getFight16FieldBuilder().addBuilder(KingOfCentralPlainsMsg.GroupFightData.getDefaultInstance());
         }

         public GroupFightData.Builder addFight16Builder(int index) {
            return (GroupFightData.Builder)this.getFight16FieldBuilder().addBuilder(index, KingOfCentralPlainsMsg.GroupFightData.getDefaultInstance());
         }

         public List<GroupFightData.Builder> getFight16BuilderList() {
            return this.getFight16FieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<GroupFightData, GroupFightData.Builder, GroupFightDataOrBuilder> getFight16FieldBuilder() {
            if (this.fight16Builder_ == null) {
               this.fight16Builder_ = new RepeatedFieldBuilderV3(this.fight16_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.fight16_ = null;
            }

            return this.fight16Builder_;
         }

         private void ensureFight8IsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.fight8_ = new ArrayList(this.fight8_);
               this.bitField0_ |= 8;
            }

         }

         public List<GroupFightData> getFight8List() {
            return this.fight8Builder_ == null ? Collections.unmodifiableList(this.fight8_) : this.fight8Builder_.getMessageList();
         }

         public int getFight8Count() {
            return this.fight8Builder_ == null ? this.fight8_.size() : this.fight8Builder_.getCount();
         }

         public GroupFightData getFight8(int index) {
            return this.fight8Builder_ == null ? (GroupFightData)this.fight8_.get(index) : (GroupFightData)this.fight8Builder_.getMessage(index);
         }

         public Builder setFight8(int index, GroupFightData value) {
            if (this.fight8Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFight8IsMutable();
               this.fight8_.set(index, value);
               this.onChanged();
            } else {
               this.fight8Builder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setFight8(int index, GroupFightData.Builder builderForValue) {
            if (this.fight8Builder_ == null) {
               this.ensureFight8IsMutable();
               this.fight8_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.fight8Builder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addFight8(GroupFightData value) {
            if (this.fight8Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFight8IsMutable();
               this.fight8_.add(value);
               this.onChanged();
            } else {
               this.fight8Builder_.addMessage(value);
            }

            return this;
         }

         public Builder addFight8(int index, GroupFightData value) {
            if (this.fight8Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFight8IsMutable();
               this.fight8_.add(index, value);
               this.onChanged();
            } else {
               this.fight8Builder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addFight8(GroupFightData.Builder builderForValue) {
            if (this.fight8Builder_ == null) {
               this.ensureFight8IsMutable();
               this.fight8_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.fight8Builder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addFight8(int index, GroupFightData.Builder builderForValue) {
            if (this.fight8Builder_ == null) {
               this.ensureFight8IsMutable();
               this.fight8_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.fight8Builder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllFight8(Iterable<? extends GroupFightData> values) {
            if (this.fight8Builder_ == null) {
               this.ensureFight8IsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.fight8_);
               this.onChanged();
            } else {
               this.fight8Builder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearFight8() {
            if (this.fight8Builder_ == null) {
               this.fight8_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.fight8Builder_.clear();
            }

            return this;
         }

         public Builder removeFight8(int index) {
            if (this.fight8Builder_ == null) {
               this.ensureFight8IsMutable();
               this.fight8_.remove(index);
               this.onChanged();
            } else {
               this.fight8Builder_.remove(index);
            }

            return this;
         }

         public GroupFightData.Builder getFight8Builder(int index) {
            return (GroupFightData.Builder)this.getFight8FieldBuilder().getBuilder(index);
         }

         public GroupFightDataOrBuilder getFight8OrBuilder(int index) {
            return this.fight8Builder_ == null ? (GroupFightDataOrBuilder)this.fight8_.get(index) : (GroupFightDataOrBuilder)this.fight8Builder_.getMessageOrBuilder(index);
         }

         public List<? extends GroupFightDataOrBuilder> getFight8OrBuilderList() {
            return this.fight8Builder_ != null ? this.fight8Builder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.fight8_);
         }

         public GroupFightData.Builder addFight8Builder() {
            return (GroupFightData.Builder)this.getFight8FieldBuilder().addBuilder(KingOfCentralPlainsMsg.GroupFightData.getDefaultInstance());
         }

         public GroupFightData.Builder addFight8Builder(int index) {
            return (GroupFightData.Builder)this.getFight8FieldBuilder().addBuilder(index, KingOfCentralPlainsMsg.GroupFightData.getDefaultInstance());
         }

         public List<GroupFightData.Builder> getFight8BuilderList() {
            return this.getFight8FieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<GroupFightData, GroupFightData.Builder, GroupFightDataOrBuilder> getFight8FieldBuilder() {
            if (this.fight8Builder_ == null) {
               this.fight8Builder_ = new RepeatedFieldBuilderV3(this.fight8_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.fight8_ = null;
            }

            return this.fight8Builder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class FightMap4 extends GeneratedMessageV3 implements FightMap4OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int FIGHT4_FIELD_NUMBER = 1;
      private List<GroupFightData> fight4_;
      public static final int FIGHT2_FIELD_NUMBER = 2;
      private List<GroupFightData> fight2_;
      private byte memoizedIsInitialized;
      private static final FightMap4 DEFAULT_INSTANCE = new FightMap4();
      /** @deprecated */
      @Deprecated
      public static final Parser<FightMap4> PARSER = new AbstractParser<FightMap4>() {
         public FightMap4 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new FightMap4(input, extensionRegistry);
         }
      };

      private FightMap4(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private FightMap4() {
         this.memoizedIsInitialized = -1;
         this.fight4_ = Collections.emptyList();
         this.fight2_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new FightMap4();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private FightMap4(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                           this.fight4_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.fight4_.add(input.readMessage(KingOfCentralPlainsMsg.GroupFightData.PARSER, extensionRegistry));
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.fight2_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.fight2_.add(input.readMessage(KingOfCentralPlainsMsg.GroupFightData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.fight4_ = Collections.unmodifiableList(this.fight4_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.fight2_ = Collections.unmodifiableList(this.fight2_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightMap4_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightMap4_fieldAccessorTable.ensureFieldAccessorsInitialized(FightMap4.class, Builder.class);
      }

      public List<GroupFightData> getFight4List() {
         return this.fight4_;
      }

      public List<? extends GroupFightDataOrBuilder> getFight4OrBuilderList() {
         return this.fight4_;
      }

      public int getFight4Count() {
         return this.fight4_.size();
      }

      public GroupFightData getFight4(int index) {
         return (GroupFightData)this.fight4_.get(index);
      }

      public GroupFightDataOrBuilder getFight4OrBuilder(int index) {
         return (GroupFightDataOrBuilder)this.fight4_.get(index);
      }

      public List<GroupFightData> getFight2List() {
         return this.fight2_;
      }

      public List<? extends GroupFightDataOrBuilder> getFight2OrBuilderList() {
         return this.fight2_;
      }

      public int getFight2Count() {
         return this.fight2_.size();
      }

      public GroupFightData getFight2(int index) {
         return (GroupFightData)this.fight2_.get(index);
      }

      public GroupFightDataOrBuilder getFight2OrBuilder(int index) {
         return (GroupFightDataOrBuilder)this.fight2_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getFight4Count(); ++i) {
               if (!this.getFight4(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getFight2Count(); ++i) {
               if (!this.getFight2(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.fight4_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.fight4_.get(i));
         }

         for(int i = 0; i < this.fight2_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.fight2_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.fight4_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.fight4_.get(i));
            }

            for(int i = 0; i < this.fight2_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.fight2_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof FightMap4)) {
            return super.equals(obj);
         } else {
            FightMap4 other = (FightMap4)obj;
            if (!this.getFight4List().equals(other.getFight4List())) {
               return false;
            } else if (!this.getFight2List().equals(other.getFight2List())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getFight4Count() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFight4List().hashCode();
            }

            if (this.getFight2Count() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getFight2List().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static FightMap4 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (FightMap4)PARSER.parseFrom(data);
      }

      public static FightMap4 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FightMap4)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FightMap4 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (FightMap4)PARSER.parseFrom(data);
      }

      public static FightMap4 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FightMap4)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FightMap4 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (FightMap4)PARSER.parseFrom(data);
      }

      public static FightMap4 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (FightMap4)PARSER.parseFrom(data, extensionRegistry);
      }

      public static FightMap4 parseFrom(InputStream input) throws IOException {
         return (FightMap4)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static FightMap4 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FightMap4)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static FightMap4 parseDelimitedFrom(InputStream input) throws IOException {
         return (FightMap4)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static FightMap4 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FightMap4)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static FightMap4 parseFrom(CodedInputStream input) throws IOException {
         return (FightMap4)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static FightMap4 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (FightMap4)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(FightMap4 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static FightMap4 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<FightMap4> parser() {
         return PARSER;
      }

      public Parser<FightMap4> getParserForType() {
         return PARSER;
      }

      public FightMap4 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FightMap4OrBuilder {
         private int bitField0_;
         private List<GroupFightData> fight4_;
         private RepeatedFieldBuilderV3<GroupFightData, GroupFightData.Builder, GroupFightDataOrBuilder> fight4Builder_;
         private List<GroupFightData> fight2_;
         private RepeatedFieldBuilderV3<GroupFightData, GroupFightData.Builder, GroupFightDataOrBuilder> fight2Builder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightMap4_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightMap4_fieldAccessorTable.ensureFieldAccessorsInitialized(FightMap4.class, Builder.class);
         }

         private Builder() {
            this.fight4_ = Collections.emptyList();
            this.fight2_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.fight4_ = Collections.emptyList();
            this.fight2_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.FightMap4.alwaysUseFieldBuilders) {
               this.getFight4FieldBuilder();
               this.getFight2FieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.fight4Builder_ == null) {
               this.fight4_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.fight4Builder_.clear();
            }

            if (this.fight2Builder_ == null) {
               this.fight2_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.fight2Builder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_FightMap4_descriptor;
         }

         public FightMap4 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.FightMap4.getDefaultInstance();
         }

         public FightMap4 build() {
            FightMap4 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public FightMap4 buildPartial() {
            FightMap4 result = new FightMap4(this);
            int from_bitField0_ = this.bitField0_;
            if (this.fight4Builder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.fight4_ = Collections.unmodifiableList(this.fight4_);
                  this.bitField0_ &= -2;
               }

               result.fight4_ = this.fight4_;
            } else {
               result.fight4_ = this.fight4Builder_.build();
            }

            if (this.fight2Builder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.fight2_ = Collections.unmodifiableList(this.fight2_);
                  this.bitField0_ &= -3;
               }

               result.fight2_ = this.fight2_;
            } else {
               result.fight2_ = this.fight2Builder_.build();
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
            if (other instanceof FightMap4) {
               return this.mergeFrom((FightMap4)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(FightMap4 other) {
            if (other == KingOfCentralPlainsMsg.FightMap4.getDefaultInstance()) {
               return this;
            } else {
               if (this.fight4Builder_ == null) {
                  if (!other.fight4_.isEmpty()) {
                     if (this.fight4_.isEmpty()) {
                        this.fight4_ = other.fight4_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureFight4IsMutable();
                        this.fight4_.addAll(other.fight4_);
                     }

                     this.onChanged();
                  }
               } else if (!other.fight4_.isEmpty()) {
                  if (this.fight4Builder_.isEmpty()) {
                     this.fight4Builder_.dispose();
                     this.fight4Builder_ = null;
                     this.fight4_ = other.fight4_;
                     this.bitField0_ &= -2;
                     this.fight4Builder_ = KingOfCentralPlainsMsg.FightMap4.alwaysUseFieldBuilders ? this.getFight4FieldBuilder() : null;
                  } else {
                     this.fight4Builder_.addAllMessages(other.fight4_);
                  }
               }

               if (this.fight2Builder_ == null) {
                  if (!other.fight2_.isEmpty()) {
                     if (this.fight2_.isEmpty()) {
                        this.fight2_ = other.fight2_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureFight2IsMutable();
                        this.fight2_.addAll(other.fight2_);
                     }

                     this.onChanged();
                  }
               } else if (!other.fight2_.isEmpty()) {
                  if (this.fight2Builder_.isEmpty()) {
                     this.fight2Builder_.dispose();
                     this.fight2Builder_ = null;
                     this.fight2_ = other.fight2_;
                     this.bitField0_ &= -3;
                     this.fight2Builder_ = KingOfCentralPlainsMsg.FightMap4.alwaysUseFieldBuilders ? this.getFight2FieldBuilder() : null;
                  } else {
                     this.fight2Builder_.addAllMessages(other.fight2_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getFight4Count(); ++i) {
               if (!this.getFight4(i).isInitialized()) {
                  return false;
               }
            }

            for(int i = 0; i < this.getFight2Count(); ++i) {
               if (!this.getFight2(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            FightMap4 parsedMessage = null;

            try {
               parsedMessage = (FightMap4)KingOfCentralPlainsMsg.FightMap4.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (FightMap4)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureFight4IsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.fight4_ = new ArrayList(this.fight4_);
               this.bitField0_ |= 1;
            }

         }

         public List<GroupFightData> getFight4List() {
            return this.fight4Builder_ == null ? Collections.unmodifiableList(this.fight4_) : this.fight4Builder_.getMessageList();
         }

         public int getFight4Count() {
            return this.fight4Builder_ == null ? this.fight4_.size() : this.fight4Builder_.getCount();
         }

         public GroupFightData getFight4(int index) {
            return this.fight4Builder_ == null ? (GroupFightData)this.fight4_.get(index) : (GroupFightData)this.fight4Builder_.getMessage(index);
         }

         public Builder setFight4(int index, GroupFightData value) {
            if (this.fight4Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFight4IsMutable();
               this.fight4_.set(index, value);
               this.onChanged();
            } else {
               this.fight4Builder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setFight4(int index, GroupFightData.Builder builderForValue) {
            if (this.fight4Builder_ == null) {
               this.ensureFight4IsMutable();
               this.fight4_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.fight4Builder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addFight4(GroupFightData value) {
            if (this.fight4Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFight4IsMutable();
               this.fight4_.add(value);
               this.onChanged();
            } else {
               this.fight4Builder_.addMessage(value);
            }

            return this;
         }

         public Builder addFight4(int index, GroupFightData value) {
            if (this.fight4Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFight4IsMutable();
               this.fight4_.add(index, value);
               this.onChanged();
            } else {
               this.fight4Builder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addFight4(GroupFightData.Builder builderForValue) {
            if (this.fight4Builder_ == null) {
               this.ensureFight4IsMutable();
               this.fight4_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.fight4Builder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addFight4(int index, GroupFightData.Builder builderForValue) {
            if (this.fight4Builder_ == null) {
               this.ensureFight4IsMutable();
               this.fight4_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.fight4Builder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllFight4(Iterable<? extends GroupFightData> values) {
            if (this.fight4Builder_ == null) {
               this.ensureFight4IsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.fight4_);
               this.onChanged();
            } else {
               this.fight4Builder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearFight4() {
            if (this.fight4Builder_ == null) {
               this.fight4_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.fight4Builder_.clear();
            }

            return this;
         }

         public Builder removeFight4(int index) {
            if (this.fight4Builder_ == null) {
               this.ensureFight4IsMutable();
               this.fight4_.remove(index);
               this.onChanged();
            } else {
               this.fight4Builder_.remove(index);
            }

            return this;
         }

         public GroupFightData.Builder getFight4Builder(int index) {
            return (GroupFightData.Builder)this.getFight4FieldBuilder().getBuilder(index);
         }

         public GroupFightDataOrBuilder getFight4OrBuilder(int index) {
            return this.fight4Builder_ == null ? (GroupFightDataOrBuilder)this.fight4_.get(index) : (GroupFightDataOrBuilder)this.fight4Builder_.getMessageOrBuilder(index);
         }

         public List<? extends GroupFightDataOrBuilder> getFight4OrBuilderList() {
            return this.fight4Builder_ != null ? this.fight4Builder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.fight4_);
         }

         public GroupFightData.Builder addFight4Builder() {
            return (GroupFightData.Builder)this.getFight4FieldBuilder().addBuilder(KingOfCentralPlainsMsg.GroupFightData.getDefaultInstance());
         }

         public GroupFightData.Builder addFight4Builder(int index) {
            return (GroupFightData.Builder)this.getFight4FieldBuilder().addBuilder(index, KingOfCentralPlainsMsg.GroupFightData.getDefaultInstance());
         }

         public List<GroupFightData.Builder> getFight4BuilderList() {
            return this.getFight4FieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<GroupFightData, GroupFightData.Builder, GroupFightDataOrBuilder> getFight4FieldBuilder() {
            if (this.fight4Builder_ == null) {
               this.fight4Builder_ = new RepeatedFieldBuilderV3(this.fight4_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.fight4_ = null;
            }

            return this.fight4Builder_;
         }

         private void ensureFight2IsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.fight2_ = new ArrayList(this.fight2_);
               this.bitField0_ |= 2;
            }

         }

         public List<GroupFightData> getFight2List() {
            return this.fight2Builder_ == null ? Collections.unmodifiableList(this.fight2_) : this.fight2Builder_.getMessageList();
         }

         public int getFight2Count() {
            return this.fight2Builder_ == null ? this.fight2_.size() : this.fight2Builder_.getCount();
         }

         public GroupFightData getFight2(int index) {
            return this.fight2Builder_ == null ? (GroupFightData)this.fight2_.get(index) : (GroupFightData)this.fight2Builder_.getMessage(index);
         }

         public Builder setFight2(int index, GroupFightData value) {
            if (this.fight2Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFight2IsMutable();
               this.fight2_.set(index, value);
               this.onChanged();
            } else {
               this.fight2Builder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setFight2(int index, GroupFightData.Builder builderForValue) {
            if (this.fight2Builder_ == null) {
               this.ensureFight2IsMutable();
               this.fight2_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.fight2Builder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addFight2(GroupFightData value) {
            if (this.fight2Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFight2IsMutable();
               this.fight2_.add(value);
               this.onChanged();
            } else {
               this.fight2Builder_.addMessage(value);
            }

            return this;
         }

         public Builder addFight2(int index, GroupFightData value) {
            if (this.fight2Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFight2IsMutable();
               this.fight2_.add(index, value);
               this.onChanged();
            } else {
               this.fight2Builder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addFight2(GroupFightData.Builder builderForValue) {
            if (this.fight2Builder_ == null) {
               this.ensureFight2IsMutable();
               this.fight2_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.fight2Builder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addFight2(int index, GroupFightData.Builder builderForValue) {
            if (this.fight2Builder_ == null) {
               this.ensureFight2IsMutable();
               this.fight2_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.fight2Builder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllFight2(Iterable<? extends GroupFightData> values) {
            if (this.fight2Builder_ == null) {
               this.ensureFight2IsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.fight2_);
               this.onChanged();
            } else {
               this.fight2Builder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearFight2() {
            if (this.fight2Builder_ == null) {
               this.fight2_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.fight2Builder_.clear();
            }

            return this;
         }

         public Builder removeFight2(int index) {
            if (this.fight2Builder_ == null) {
               this.ensureFight2IsMutable();
               this.fight2_.remove(index);
               this.onChanged();
            } else {
               this.fight2Builder_.remove(index);
            }

            return this;
         }

         public GroupFightData.Builder getFight2Builder(int index) {
            return (GroupFightData.Builder)this.getFight2FieldBuilder().getBuilder(index);
         }

         public GroupFightDataOrBuilder getFight2OrBuilder(int index) {
            return this.fight2Builder_ == null ? (GroupFightDataOrBuilder)this.fight2_.get(index) : (GroupFightDataOrBuilder)this.fight2Builder_.getMessageOrBuilder(index);
         }

         public List<? extends GroupFightDataOrBuilder> getFight2OrBuilderList() {
            return this.fight2Builder_ != null ? this.fight2Builder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.fight2_);
         }

         public GroupFightData.Builder addFight2Builder() {
            return (GroupFightData.Builder)this.getFight2FieldBuilder().addBuilder(KingOfCentralPlainsMsg.GroupFightData.getDefaultInstance());
         }

         public GroupFightData.Builder addFight2Builder(int index) {
            return (GroupFightData.Builder)this.getFight2FieldBuilder().addBuilder(index, KingOfCentralPlainsMsg.GroupFightData.getDefaultInstance());
         }

         public List<GroupFightData.Builder> getFight2BuilderList() {
            return this.getFight2FieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<GroupFightData, GroupFightData.Builder, GroupFightDataOrBuilder> getFight2FieldBuilder() {
            if (this.fight2Builder_ == null) {
               this.fight2Builder_ = new RepeatedFieldBuilderV3(this.fight2_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.fight2_ = null;
            }

            return this.fight2Builder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_Rank32Ui_9631 extends GeneratedMessageV3 implements C2S_Rank32Ui_9631OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Rank32Ui_9631 DEFAULT_INSTANCE = new C2S_Rank32Ui_9631();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Rank32Ui_9631> PARSER = new AbstractParser<C2S_Rank32Ui_9631>() {
         public C2S_Rank32Ui_9631 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Rank32Ui_9631(input, extensionRegistry);
         }
      };

      private C2S_Rank32Ui_9631(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Rank32Ui_9631() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Rank32Ui_9631();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Rank32Ui_9631(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_Rank32Ui_9631_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_Rank32Ui_9631_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Rank32Ui_9631.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Rank32Ui_9631)) {
            return super.equals(obj);
         } else {
            C2S_Rank32Ui_9631 other = (C2S_Rank32Ui_9631)obj;
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

      public static C2S_Rank32Ui_9631 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Rank32Ui_9631)PARSER.parseFrom(data);
      }

      public static C2S_Rank32Ui_9631 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Rank32Ui_9631)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Rank32Ui_9631 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Rank32Ui_9631)PARSER.parseFrom(data);
      }

      public static C2S_Rank32Ui_9631 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Rank32Ui_9631)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Rank32Ui_9631 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Rank32Ui_9631)PARSER.parseFrom(data);
      }

      public static C2S_Rank32Ui_9631 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Rank32Ui_9631)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Rank32Ui_9631 parseFrom(InputStream input) throws IOException {
         return (C2S_Rank32Ui_9631)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Rank32Ui_9631 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Rank32Ui_9631)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Rank32Ui_9631 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Rank32Ui_9631)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Rank32Ui_9631 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Rank32Ui_9631)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Rank32Ui_9631 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Rank32Ui_9631)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Rank32Ui_9631 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Rank32Ui_9631)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Rank32Ui_9631 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Rank32Ui_9631 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Rank32Ui_9631> parser() {
         return PARSER;
      }

      public Parser<C2S_Rank32Ui_9631> getParserForType() {
         return PARSER;
      }

      public C2S_Rank32Ui_9631 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Rank32Ui_9631OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_Rank32Ui_9631_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_Rank32Ui_9631_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Rank32Ui_9631.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.C2S_Rank32Ui_9631.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_Rank32Ui_9631_descriptor;
         }

         public C2S_Rank32Ui_9631 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.C2S_Rank32Ui_9631.getDefaultInstance();
         }

         public C2S_Rank32Ui_9631 build() {
            C2S_Rank32Ui_9631 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Rank32Ui_9631 buildPartial() {
            C2S_Rank32Ui_9631 result = new C2S_Rank32Ui_9631(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_Rank32Ui_9631) {
               return this.mergeFrom((C2S_Rank32Ui_9631)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Rank32Ui_9631 other) {
            if (other == KingOfCentralPlainsMsg.C2S_Rank32Ui_9631.getDefaultInstance()) {
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
            C2S_Rank32Ui_9631 parsedMessage = null;

            try {
               parsedMessage = (C2S_Rank32Ui_9631)KingOfCentralPlainsMsg.C2S_Rank32Ui_9631.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Rank32Ui_9631)e.getUnfinishedMessage();
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

   public static final class S2C_Rank32UiResult_9632 extends GeneratedMessageV3 implements S2C_Rank32UiResult_9632OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MAP32_FIELD_NUMBER = 1;
      private List<FightMap32> map32_;
      public static final int MAP4_FIELD_NUMBER = 2;
      private FightMap4 map4_;
      private byte memoizedIsInitialized;
      private static final S2C_Rank32UiResult_9632 DEFAULT_INSTANCE = new S2C_Rank32UiResult_9632();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Rank32UiResult_9632> PARSER = new AbstractParser<S2C_Rank32UiResult_9632>() {
         public S2C_Rank32UiResult_9632 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Rank32UiResult_9632(input, extensionRegistry);
         }
      };

      private S2C_Rank32UiResult_9632(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Rank32UiResult_9632() {
         this.memoizedIsInitialized = -1;
         this.map32_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Rank32UiResult_9632();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Rank32UiResult_9632(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                           this.map32_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.map32_.add(input.readMessage(KingOfCentralPlainsMsg.FightMap32.PARSER, extensionRegistry));
                        break;
                     case 18:
                        FightMap4.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.map4_.toBuilder();
                        }

                        this.map4_ = (FightMap4)input.readMessage(KingOfCentralPlainsMsg.FightMap4.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.map4_);
                           this.map4_ = subBuilder.buildPartial();
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
                  this.map32_ = Collections.unmodifiableList(this.map32_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_Rank32UiResult_9632_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_Rank32UiResult_9632_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Rank32UiResult_9632.class, Builder.class);
      }

      public List<FightMap32> getMap32List() {
         return this.map32_;
      }

      public List<? extends FightMap32OrBuilder> getMap32OrBuilderList() {
         return this.map32_;
      }

      public int getMap32Count() {
         return this.map32_.size();
      }

      public FightMap32 getMap32(int index) {
         return (FightMap32)this.map32_.get(index);
      }

      public FightMap32OrBuilder getMap32OrBuilder(int index) {
         return (FightMap32OrBuilder)this.map32_.get(index);
      }

      public boolean hasMap4() {
         return (this.bitField0_ & 1) != 0;
      }

      public FightMap4 getMap4() {
         return this.map4_ == null ? KingOfCentralPlainsMsg.FightMap4.getDefaultInstance() : this.map4_;
      }

      public FightMap4OrBuilder getMap4OrBuilder() {
         return this.map4_ == null ? KingOfCentralPlainsMsg.FightMap4.getDefaultInstance() : this.map4_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getMap32Count(); ++i) {
               if (!this.getMap32(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            if (this.hasMap4() && !this.getMap4().isInitialized()) {
               this.memoizedIsInitialized = 0;
               return false;
            } else {
               this.memoizedIsInitialized = 1;
               return true;
            }
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.map32_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.map32_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(2, this.getMap4());
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.map32_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.map32_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getMap4());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Rank32UiResult_9632)) {
            return super.equals(obj);
         } else {
            S2C_Rank32UiResult_9632 other = (S2C_Rank32UiResult_9632)obj;
            if (!this.getMap32List().equals(other.getMap32List())) {
               return false;
            } else if (this.hasMap4() != other.hasMap4()) {
               return false;
            } else if (this.hasMap4() && !this.getMap4().equals(other.getMap4())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getMap32Count() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMap32List().hashCode();
            }

            if (this.hasMap4()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMap4().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Rank32UiResult_9632 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Rank32UiResult_9632)PARSER.parseFrom(data);
      }

      public static S2C_Rank32UiResult_9632 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Rank32UiResult_9632)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Rank32UiResult_9632 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Rank32UiResult_9632)PARSER.parseFrom(data);
      }

      public static S2C_Rank32UiResult_9632 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Rank32UiResult_9632)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Rank32UiResult_9632 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Rank32UiResult_9632)PARSER.parseFrom(data);
      }

      public static S2C_Rank32UiResult_9632 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Rank32UiResult_9632)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Rank32UiResult_9632 parseFrom(InputStream input) throws IOException {
         return (S2C_Rank32UiResult_9632)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Rank32UiResult_9632 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Rank32UiResult_9632)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Rank32UiResult_9632 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Rank32UiResult_9632)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Rank32UiResult_9632 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Rank32UiResult_9632)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Rank32UiResult_9632 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Rank32UiResult_9632)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Rank32UiResult_9632 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Rank32UiResult_9632)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Rank32UiResult_9632 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Rank32UiResult_9632 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Rank32UiResult_9632> parser() {
         return PARSER;
      }

      public Parser<S2C_Rank32UiResult_9632> getParserForType() {
         return PARSER;
      }

      public S2C_Rank32UiResult_9632 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Rank32UiResult_9632OrBuilder {
         private int bitField0_;
         private List<FightMap32> map32_;
         private RepeatedFieldBuilderV3<FightMap32, FightMap32.Builder, FightMap32OrBuilder> map32Builder_;
         private FightMap4 map4_;
         private SingleFieldBuilderV3<FightMap4, FightMap4.Builder, FightMap4OrBuilder> map4Builder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_Rank32UiResult_9632_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_Rank32UiResult_9632_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Rank32UiResult_9632.class, Builder.class);
         }

         private Builder() {
            this.map32_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.map32_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.S2C_Rank32UiResult_9632.alwaysUseFieldBuilders) {
               this.getMap32FieldBuilder();
               this.getMap4FieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.map32Builder_ == null) {
               this.map32_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.map32Builder_.clear();
            }

            if (this.map4Builder_ == null) {
               this.map4_ = null;
            } else {
               this.map4Builder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_Rank32UiResult_9632_descriptor;
         }

         public S2C_Rank32UiResult_9632 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.S2C_Rank32UiResult_9632.getDefaultInstance();
         }

         public S2C_Rank32UiResult_9632 build() {
            S2C_Rank32UiResult_9632 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Rank32UiResult_9632 buildPartial() {
            S2C_Rank32UiResult_9632 result = new S2C_Rank32UiResult_9632(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.map32Builder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.map32_ = Collections.unmodifiableList(this.map32_);
                  this.bitField0_ &= -2;
               }

               result.map32_ = this.map32_;
            } else {
               result.map32_ = this.map32Builder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.map4Builder_ == null) {
                  result.map4_ = this.map4_;
               } else {
                  result.map4_ = (FightMap4)this.map4Builder_.build();
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
            if (other instanceof S2C_Rank32UiResult_9632) {
               return this.mergeFrom((S2C_Rank32UiResult_9632)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Rank32UiResult_9632 other) {
            if (other == KingOfCentralPlainsMsg.S2C_Rank32UiResult_9632.getDefaultInstance()) {
               return this;
            } else {
               if (this.map32Builder_ == null) {
                  if (!other.map32_.isEmpty()) {
                     if (this.map32_.isEmpty()) {
                        this.map32_ = other.map32_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureMap32IsMutable();
                        this.map32_.addAll(other.map32_);
                     }

                     this.onChanged();
                  }
               } else if (!other.map32_.isEmpty()) {
                  if (this.map32Builder_.isEmpty()) {
                     this.map32Builder_.dispose();
                     this.map32Builder_ = null;
                     this.map32_ = other.map32_;
                     this.bitField0_ &= -2;
                     this.map32Builder_ = KingOfCentralPlainsMsg.S2C_Rank32UiResult_9632.alwaysUseFieldBuilders ? this.getMap32FieldBuilder() : null;
                  } else {
                     this.map32Builder_.addAllMessages(other.map32_);
                  }
               }

               if (other.hasMap4()) {
                  this.mergeMap4(other.getMap4());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getMap32Count(); ++i) {
               if (!this.getMap32(i).isInitialized()) {
                  return false;
               }
            }

            if (this.hasMap4() && !this.getMap4().isInitialized()) {
               return false;
            } else {
               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Rank32UiResult_9632 parsedMessage = null;

            try {
               parsedMessage = (S2C_Rank32UiResult_9632)KingOfCentralPlainsMsg.S2C_Rank32UiResult_9632.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Rank32UiResult_9632)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureMap32IsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.map32_ = new ArrayList(this.map32_);
               this.bitField0_ |= 1;
            }

         }

         public List<FightMap32> getMap32List() {
            return this.map32Builder_ == null ? Collections.unmodifiableList(this.map32_) : this.map32Builder_.getMessageList();
         }

         public int getMap32Count() {
            return this.map32Builder_ == null ? this.map32_.size() : this.map32Builder_.getCount();
         }

         public FightMap32 getMap32(int index) {
            return this.map32Builder_ == null ? (FightMap32)this.map32_.get(index) : (FightMap32)this.map32Builder_.getMessage(index);
         }

         public Builder setMap32(int index, FightMap32 value) {
            if (this.map32Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMap32IsMutable();
               this.map32_.set(index, value);
               this.onChanged();
            } else {
               this.map32Builder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setMap32(int index, FightMap32.Builder builderForValue) {
            if (this.map32Builder_ == null) {
               this.ensureMap32IsMutable();
               this.map32_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.map32Builder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMap32(FightMap32 value) {
            if (this.map32Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMap32IsMutable();
               this.map32_.add(value);
               this.onChanged();
            } else {
               this.map32Builder_.addMessage(value);
            }

            return this;
         }

         public Builder addMap32(int index, FightMap32 value) {
            if (this.map32Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMap32IsMutable();
               this.map32_.add(index, value);
               this.onChanged();
            } else {
               this.map32Builder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addMap32(FightMap32.Builder builderForValue) {
            if (this.map32Builder_ == null) {
               this.ensureMap32IsMutable();
               this.map32_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.map32Builder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMap32(int index, FightMap32.Builder builderForValue) {
            if (this.map32Builder_ == null) {
               this.ensureMap32IsMutable();
               this.map32_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.map32Builder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMap32(Iterable<? extends FightMap32> values) {
            if (this.map32Builder_ == null) {
               this.ensureMap32IsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.map32_);
               this.onChanged();
            } else {
               this.map32Builder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearMap32() {
            if (this.map32Builder_ == null) {
               this.map32_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.map32Builder_.clear();
            }

            return this;
         }

         public Builder removeMap32(int index) {
            if (this.map32Builder_ == null) {
               this.ensureMap32IsMutable();
               this.map32_.remove(index);
               this.onChanged();
            } else {
               this.map32Builder_.remove(index);
            }

            return this;
         }

         public FightMap32.Builder getMap32Builder(int index) {
            return (FightMap32.Builder)this.getMap32FieldBuilder().getBuilder(index);
         }

         public FightMap32OrBuilder getMap32OrBuilder(int index) {
            return this.map32Builder_ == null ? (FightMap32OrBuilder)this.map32_.get(index) : (FightMap32OrBuilder)this.map32Builder_.getMessageOrBuilder(index);
         }

         public List<? extends FightMap32OrBuilder> getMap32OrBuilderList() {
            return this.map32Builder_ != null ? this.map32Builder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.map32_);
         }

         public FightMap32.Builder addMap32Builder() {
            return (FightMap32.Builder)this.getMap32FieldBuilder().addBuilder(KingOfCentralPlainsMsg.FightMap32.getDefaultInstance());
         }

         public FightMap32.Builder addMap32Builder(int index) {
            return (FightMap32.Builder)this.getMap32FieldBuilder().addBuilder(index, KingOfCentralPlainsMsg.FightMap32.getDefaultInstance());
         }

         public List<FightMap32.Builder> getMap32BuilderList() {
            return this.getMap32FieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<FightMap32, FightMap32.Builder, FightMap32OrBuilder> getMap32FieldBuilder() {
            if (this.map32Builder_ == null) {
               this.map32Builder_ = new RepeatedFieldBuilderV3(this.map32_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.map32_ = null;
            }

            return this.map32Builder_;
         }

         public boolean hasMap4() {
            return (this.bitField0_ & 2) != 0;
         }

         public FightMap4 getMap4() {
            if (this.map4Builder_ == null) {
               return this.map4_ == null ? KingOfCentralPlainsMsg.FightMap4.getDefaultInstance() : this.map4_;
            } else {
               return (FightMap4)this.map4Builder_.getMessage();
            }
         }

         public Builder setMap4(FightMap4 value) {
            if (this.map4Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.map4_ = value;
               this.onChanged();
            } else {
               this.map4Builder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setMap4(FightMap4.Builder builderForValue) {
            if (this.map4Builder_ == null) {
               this.map4_ = builderForValue.build();
               this.onChanged();
            } else {
               this.map4Builder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeMap4(FightMap4 value) {
            if (this.map4Builder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.map4_ != null && this.map4_ != KingOfCentralPlainsMsg.FightMap4.getDefaultInstance()) {
                  this.map4_ = KingOfCentralPlainsMsg.FightMap4.newBuilder(this.map4_).mergeFrom(value).buildPartial();
               } else {
                  this.map4_ = value;
               }

               this.onChanged();
            } else {
               this.map4Builder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearMap4() {
            if (this.map4Builder_ == null) {
               this.map4_ = null;
               this.onChanged();
            } else {
               this.map4Builder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public FightMap4.Builder getMap4Builder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (FightMap4.Builder)this.getMap4FieldBuilder().getBuilder();
         }

         public FightMap4OrBuilder getMap4OrBuilder() {
            if (this.map4Builder_ != null) {
               return (FightMap4OrBuilder)this.map4Builder_.getMessageOrBuilder();
            } else {
               return this.map4_ == null ? KingOfCentralPlainsMsg.FightMap4.getDefaultInstance() : this.map4_;
            }
         }

         private SingleFieldBuilderV3<FightMap4, FightMap4.Builder, FightMap4OrBuilder> getMap4FieldBuilder() {
            if (this.map4Builder_ == null) {
               this.map4Builder_ = new SingleFieldBuilderV3(this.getMap4(), this.getParentForChildren(), this.isClean());
               this.map4_ = null;
            }

            return this.map4Builder_;
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
      public static final int HEAD_FIELD_NUMBER = 2;
      private int head_;
      public static final int HEADFRAME_FIELD_NUMBER = 3;
      private int headFrame_;
      public static final int LV_FIELD_NUMBER = 4;
      private int lv_;
      public static final int NAME_FIELD_NUMBER = 5;
      private volatile Object name_;
      public static final int POWER_FIELD_NUMBER = 6;
      private long power_;
      public static final int THUMBSNUM_FIELD_NUMBER = 7;
      private int thumbsNum_;
      public static final int ISTHUMBSUP_FIELD_NUMBER = 8;
      private boolean isThumbsUp_;
      public static final int SOCRE_FIELD_NUMBER = 9;
      private int socre_;
      public static final int PLAYERID_FIELD_NUMBER = 10;
      private int playerId_;
      public static final int PRESTIGE_FIELD_NUMBER = 11;
      private int prestige_;
      public static final int MONARCHID_FIELD_NUMBER = 12;
      private int monarchid_;
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
                        this.head_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.headFrame_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.lv_ = input.readInt32();
                        break;
                     case 42:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 16;
                        this.name_ = bs;
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.power_ = input.readInt64();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.thumbsNum_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.isThumbsUp_ = input.readBool();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.socre_ = input.readInt32();
                        break;
                     case 80:
                        this.bitField0_ |= 512;
                        this.playerId_ = input.readInt32();
                        break;
                     case 88:
                        this.bitField0_ |= 1024;
                        this.prestige_ = input.readInt32();
                        break;
                     case 96:
                        this.bitField0_ |= 2048;
                        this.monarchid_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_RankInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_RankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RankInfo.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasHead() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public boolean hasLv() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getLv() {
         return this.lv_;
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

      public boolean hasPower() {
         return (this.bitField0_ & 32) != 0;
      }

      public long getPower() {
         return this.power_;
      }

      public boolean hasThumbsNum() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getThumbsNum() {
         return this.thumbsNum_;
      }

      public boolean hasIsThumbsUp() {
         return (this.bitField0_ & 128) != 0;
      }

      public boolean getIsThumbsUp() {
         return this.isThumbsUp_;
      }

      public boolean hasSocre() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getSocre() {
         return this.socre_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasPrestige() {
         return (this.bitField0_ & 1024) != 0;
      }

      public int getPrestige() {
         return this.prestige_;
      }

      public boolean hasMonarchid() {
         return (this.bitField0_ & 2048) != 0;
      }

      public int getMonarchid() {
         return this.monarchid_;
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
         } else if (!this.hasHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeadFrame()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPower()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasThumbsNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsThumbsUp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSocre()) {
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
            output.writeInt32(2, this.head_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.headFrame_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.lv_);
         }

         if ((this.bitField0_ & 16) != 0) {
            GeneratedMessageV3.writeString(output, 5, this.name_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt64(6, this.power_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.thumbsNum_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeBool(8, this.isThumbsUp_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.socre_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(10, this.playerId_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            output.writeInt32(11, this.prestige_);
         }

         if ((this.bitField0_ & 2048) != 0) {
            output.writeInt32(12, this.monarchid_);
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
               size += CodedOutputStream.computeInt32Size(2, this.head_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.headFrame_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.lv_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += GeneratedMessageV3.computeStringSize(5, this.name_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt64Size(6, this.power_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.thumbsNum_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeBoolSize(8, this.isThumbsUp_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.socre_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.playerId_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.prestige_);
            }

            if ((this.bitField0_ & 2048) != 0) {
               size += CodedOutputStream.computeInt32Size(12, this.monarchid_);
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
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
               return false;
            } else if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
               return false;
            } else if (this.hasName() != other.hasName()) {
               return false;
            } else if (this.hasName() && !this.getName().equals(other.getName())) {
               return false;
            } else if (this.hasPower() != other.hasPower()) {
               return false;
            } else if (this.hasPower() && this.getPower() != other.getPower()) {
               return false;
            } else if (this.hasThumbsNum() != other.hasThumbsNum()) {
               return false;
            } else if (this.hasThumbsNum() && this.getThumbsNum() != other.getThumbsNum()) {
               return false;
            } else if (this.hasIsThumbsUp() != other.hasIsThumbsUp()) {
               return false;
            } else if (this.hasIsThumbsUp() && this.getIsThumbsUp() != other.getIsThumbsUp()) {
               return false;
            } else if (this.hasSocre() != other.hasSocre()) {
               return false;
            } else if (this.hasSocre() && this.getSocre() != other.getSocre()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasPrestige() != other.hasPrestige()) {
               return false;
            } else if (this.hasPrestige() && this.getPrestige() != other.getPrestige()) {
               return false;
            } else if (this.hasMonarchid() != other.hasMonarchid()) {
               return false;
            } else if (this.hasMonarchid() && this.getMonarchid() != other.getMonarchid()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasHead()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasLv()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getLv();
            }

            if (this.hasName()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getName().hashCode();
            }

            if (this.hasPower()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashLong(this.getPower());
            }

            if (this.hasThumbsNum()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getThumbsNum();
            }

            if (this.hasIsThumbsUp()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + Internal.hashBoolean(this.getIsThumbsUp());
            }

            if (this.hasSocre()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getSocre();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasPrestige()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getPrestige();
            }

            if (this.hasMonarchid()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getMonarchid();
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
         private int head_;
         private int headFrame_;
         private int lv_;
         private Object name_;
         private long power_;
         private int thumbsNum_;
         private boolean isThumbsUp_;
         private int socre_;
         private int playerId_;
         private int prestige_;
         private int monarchid_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_RankInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_RankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RankInfo.class, Builder.class);
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
            if (KingOfCentralPlainsMsg.RankInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.head_ = 0;
            this.bitField0_ &= -3;
            this.headFrame_ = 0;
            this.bitField0_ &= -5;
            this.lv_ = 0;
            this.bitField0_ &= -9;
            this.name_ = "";
            this.bitField0_ &= -17;
            this.power_ = 0L;
            this.bitField0_ &= -33;
            this.thumbsNum_ = 0;
            this.bitField0_ &= -65;
            this.isThumbsUp_ = false;
            this.bitField0_ &= -129;
            this.socre_ = 0;
            this.bitField0_ &= -257;
            this.playerId_ = 0;
            this.bitField0_ &= -513;
            this.prestige_ = 0;
            this.bitField0_ &= -1025;
            this.monarchid_ = 0;
            this.bitField0_ &= -2049;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_RankInfo_descriptor;
         }

         public RankInfo getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.RankInfo.getDefaultInstance();
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
               result.head_ = this.head_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.lv_ = this.lv_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               to_bitField0_ |= 16;
            }

            result.name_ = this.name_;
            if ((from_bitField0_ & 32) != 0) {
               result.power_ = this.power_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.thumbsNum_ = this.thumbsNum_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.isThumbsUp_ = this.isThumbsUp_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.socre_ = this.socre_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 512;
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.prestige_ = this.prestige_;
               to_bitField0_ |= 1024;
            }

            if ((from_bitField0_ & 2048) != 0) {
               result.monarchid_ = this.monarchid_;
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
            if (other instanceof RankInfo) {
               return this.mergeFrom((RankInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RankInfo other) {
            if (other == KingOfCentralPlainsMsg.RankInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               if (other.hasName()) {
                  this.bitField0_ |= 16;
                  this.name_ = other.name_;
                  this.onChanged();
               }

               if (other.hasPower()) {
                  this.setPower(other.getPower());
               }

               if (other.hasThumbsNum()) {
                  this.setThumbsNum(other.getThumbsNum());
               }

               if (other.hasIsThumbsUp()) {
                  this.setIsThumbsUp(other.getIsThumbsUp());
               }

               if (other.hasSocre()) {
                  this.setSocre(other.getSocre());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasPrestige()) {
                  this.setPrestige(other.getPrestige());
               }

               if (other.hasMonarchid()) {
                  this.setMonarchid(other.getMonarchid());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRank()) {
               return false;
            } else if (!this.hasHead()) {
               return false;
            } else if (!this.hasHeadFrame()) {
               return false;
            } else if (!this.hasLv()) {
               return false;
            } else if (!this.hasName()) {
               return false;
            } else if (!this.hasPower()) {
               return false;
            } else if (!this.hasThumbsNum()) {
               return false;
            } else if (!this.hasIsThumbsUp()) {
               return false;
            } else if (!this.hasSocre()) {
               return false;
            } else {
               return this.hasPlayerId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RankInfo parsedMessage = null;

            try {
               parsedMessage = (RankInfo)KingOfCentralPlainsMsg.RankInfo.PARSER.parsePartialFrom(input, extensionRegistry);
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

         public boolean hasHead() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHead() {
            return this.head_;
         }

         public Builder setHead(int value) {
            this.bitField0_ |= 2;
            this.head_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHead() {
            this.bitField0_ &= -3;
            this.head_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeadFrame() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getHeadFrame() {
            return this.headFrame_;
         }

         public Builder setHeadFrame(int value) {
            this.bitField0_ |= 4;
            this.headFrame_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadFrame() {
            this.bitField0_ &= -5;
            this.headFrame_ = 0;
            this.onChanged();
            return this;
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
            this.name_ = KingOfCentralPlainsMsg.RankInfo.getDefaultInstance().getName();
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

         public boolean hasThumbsNum() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getThumbsNum() {
            return this.thumbsNum_;
         }

         public Builder setThumbsNum(int value) {
            this.bitField0_ |= 64;
            this.thumbsNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearThumbsNum() {
            this.bitField0_ &= -65;
            this.thumbsNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsThumbsUp() {
            return (this.bitField0_ & 128) != 0;
         }

         public boolean getIsThumbsUp() {
            return this.isThumbsUp_;
         }

         public Builder setIsThumbsUp(boolean value) {
            this.bitField0_ |= 128;
            this.isThumbsUp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsThumbsUp() {
            this.bitField0_ &= -129;
            this.isThumbsUp_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasSocre() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getSocre() {
            return this.socre_;
         }

         public Builder setSocre(int value) {
            this.bitField0_ |= 256;
            this.socre_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSocre() {
            this.bitField0_ &= -257;
            this.socre_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerId() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getPlayerId() {
            return this.playerId_;
         }

         public Builder setPlayerId(int value) {
            this.bitField0_ |= 512;
            this.playerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.bitField0_ &= -513;
            this.playerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPrestige() {
            return (this.bitField0_ & 1024) != 0;
         }

         public int getPrestige() {
            return this.prestige_;
         }

         public Builder setPrestige(int value) {
            this.bitField0_ |= 1024;
            this.prestige_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrestige() {
            this.bitField0_ &= -1025;
            this.prestige_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMonarchid() {
            return (this.bitField0_ & 2048) != 0;
         }

         public int getMonarchid() {
            return this.monarchid_;
         }

         public Builder setMonarchid(int value) {
            this.bitField0_ |= 2048;
            this.monarchid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMonarchid() {
            this.bitField0_ &= -2049;
            this.monarchid_ = 0;
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

   public static final class C2S_RankUi_9641 extends GeneratedMessageV3 implements C2S_RankUi_9641OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_RankUi_9641 DEFAULT_INSTANCE = new C2S_RankUi_9641();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RankUi_9641> PARSER = new AbstractParser<C2S_RankUi_9641>() {
         public C2S_RankUi_9641 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RankUi_9641(input, extensionRegistry);
         }
      };

      private C2S_RankUi_9641(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RankUi_9641() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RankUi_9641();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RankUi_9641(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_RankUi_9641_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_RankUi_9641_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RankUi_9641.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RankUi_9641)) {
            return super.equals(obj);
         } else {
            C2S_RankUi_9641 other = (C2S_RankUi_9641)obj;
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

      public static C2S_RankUi_9641 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RankUi_9641)PARSER.parseFrom(data);
      }

      public static C2S_RankUi_9641 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RankUi_9641)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RankUi_9641 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RankUi_9641)PARSER.parseFrom(data);
      }

      public static C2S_RankUi_9641 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RankUi_9641)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RankUi_9641 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RankUi_9641)PARSER.parseFrom(data);
      }

      public static C2S_RankUi_9641 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RankUi_9641)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RankUi_9641 parseFrom(InputStream input) throws IOException {
         return (C2S_RankUi_9641)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RankUi_9641 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RankUi_9641)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RankUi_9641 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RankUi_9641)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RankUi_9641 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RankUi_9641)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RankUi_9641 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RankUi_9641)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RankUi_9641 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RankUi_9641)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RankUi_9641 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RankUi_9641 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RankUi_9641> parser() {
         return PARSER;
      }

      public Parser<C2S_RankUi_9641> getParserForType() {
         return PARSER;
      }

      public C2S_RankUi_9641 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RankUi_9641OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_RankUi_9641_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_RankUi_9641_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RankUi_9641.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.C2S_RankUi_9641.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_RankUi_9641_descriptor;
         }

         public C2S_RankUi_9641 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.C2S_RankUi_9641.getDefaultInstance();
         }

         public C2S_RankUi_9641 build() {
            C2S_RankUi_9641 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RankUi_9641 buildPartial() {
            C2S_RankUi_9641 result = new C2S_RankUi_9641(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_RankUi_9641) {
               return this.mergeFrom((C2S_RankUi_9641)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RankUi_9641 other) {
            if (other == KingOfCentralPlainsMsg.C2S_RankUi_9641.getDefaultInstance()) {
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
            C2S_RankUi_9641 parsedMessage = null;

            try {
               parsedMessage = (C2S_RankUi_9641)KingOfCentralPlainsMsg.C2S_RankUi_9641.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RankUi_9641)e.getUnfinishedMessage();
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

   public static final class S2C_RankUiResult_9642 extends GeneratedMessageV3 implements S2C_RankUiResult_9642OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int THUMBSUPNUM_FIELD_NUMBER = 1;
      private int thumbsUpNum_;
      public static final int MYINFO_FIELD_NUMBER = 2;
      private RankInfo myInfo_;
      public static final int INFOS_FIELD_NUMBER = 3;
      private List<RankInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_RankUiResult_9642 DEFAULT_INSTANCE = new S2C_RankUiResult_9642();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RankUiResult_9642> PARSER = new AbstractParser<S2C_RankUiResult_9642>() {
         public S2C_RankUiResult_9642 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RankUiResult_9642(input, extensionRegistry);
         }
      };

      private S2C_RankUiResult_9642(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RankUiResult_9642() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RankUiResult_9642();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RankUiResult_9642(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.thumbsUpNum_ = input.readInt32();
                        break;
                     case 18:
                        RankInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.myInfo_.toBuilder();
                        }

                        this.myInfo_ = (RankInfo)input.readMessage(KingOfCentralPlainsMsg.RankInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.myInfo_);
                           this.myInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.infos_.add(input.readMessage(KingOfCentralPlainsMsg.RankInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_RankUiResult_9642_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_RankUiResult_9642_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RankUiResult_9642.class, Builder.class);
      }

      public boolean hasThumbsUpNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getThumbsUpNum() {
         return this.thumbsUpNum_;
      }

      public boolean hasMyInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public RankInfo getMyInfo() {
         return this.myInfo_ == null ? KingOfCentralPlainsMsg.RankInfo.getDefaultInstance() : this.myInfo_;
      }

      public RankInfoOrBuilder getMyInfoOrBuilder() {
         return this.myInfo_ == null ? KingOfCentralPlainsMsg.RankInfo.getDefaultInstance() : this.myInfo_;
      }

      public List<RankInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends RankInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public RankInfo getInfos(int index) {
         return (RankInfo)this.infos_.get(index);
      }

      public RankInfoOrBuilder getInfosOrBuilder(int index) {
         return (RankInfoOrBuilder)this.infos_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasThumbsUpNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasMyInfo() && !this.getMyInfo().isInitialized()) {
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
            output.writeInt32(1, this.thumbsUpNum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getMyInfo());
         }

         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.infos_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.thumbsUpNum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getMyInfo());
            }

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.infos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RankUiResult_9642)) {
            return super.equals(obj);
         } else {
            S2C_RankUiResult_9642 other = (S2C_RankUiResult_9642)obj;
            if (this.hasThumbsUpNum() != other.hasThumbsUpNum()) {
               return false;
            } else if (this.hasThumbsUpNum() && this.getThumbsUpNum() != other.getThumbsUpNum()) {
               return false;
            } else if (this.hasMyInfo() != other.hasMyInfo()) {
               return false;
            } else if (this.hasMyInfo() && !this.getMyInfo().equals(other.getMyInfo())) {
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
            if (this.hasThumbsUpNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getThumbsUpNum();
            }

            if (this.hasMyInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMyInfo().hashCode();
            }

            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RankUiResult_9642 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RankUiResult_9642)PARSER.parseFrom(data);
      }

      public static S2C_RankUiResult_9642 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RankUiResult_9642)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RankUiResult_9642 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RankUiResult_9642)PARSER.parseFrom(data);
      }

      public static S2C_RankUiResult_9642 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RankUiResult_9642)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RankUiResult_9642 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RankUiResult_9642)PARSER.parseFrom(data);
      }

      public static S2C_RankUiResult_9642 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RankUiResult_9642)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RankUiResult_9642 parseFrom(InputStream input) throws IOException {
         return (S2C_RankUiResult_9642)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RankUiResult_9642 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RankUiResult_9642)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RankUiResult_9642 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RankUiResult_9642)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RankUiResult_9642 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RankUiResult_9642)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RankUiResult_9642 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RankUiResult_9642)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RankUiResult_9642 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RankUiResult_9642)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RankUiResult_9642 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RankUiResult_9642 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RankUiResult_9642> parser() {
         return PARSER;
      }

      public Parser<S2C_RankUiResult_9642> getParserForType() {
         return PARSER;
      }

      public S2C_RankUiResult_9642 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RankUiResult_9642OrBuilder {
         private int bitField0_;
         private int thumbsUpNum_;
         private RankInfo myInfo_;
         private SingleFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> myInfoBuilder_;
         private List<RankInfo> infos_;
         private RepeatedFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_RankUiResult_9642_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_RankUiResult_9642_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RankUiResult_9642.class, Builder.class);
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
            if (KingOfCentralPlainsMsg.S2C_RankUiResult_9642.alwaysUseFieldBuilders) {
               this.getMyInfoFieldBuilder();
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.thumbsUpNum_ = 0;
            this.bitField0_ &= -2;
            if (this.myInfoBuilder_ == null) {
               this.myInfo_ = null;
            } else {
               this.myInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_RankUiResult_9642_descriptor;
         }

         public S2C_RankUiResult_9642 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.S2C_RankUiResult_9642.getDefaultInstance();
         }

         public S2C_RankUiResult_9642 build() {
            S2C_RankUiResult_9642 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RankUiResult_9642 buildPartial() {
            S2C_RankUiResult_9642 result = new S2C_RankUiResult_9642(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.thumbsUpNum_ = this.thumbsUpNum_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.myInfoBuilder_ == null) {
                  result.myInfo_ = this.myInfo_;
               } else {
                  result.myInfo_ = (RankInfo)this.myInfoBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -5;
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
            if (other instanceof S2C_RankUiResult_9642) {
               return this.mergeFrom((S2C_RankUiResult_9642)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RankUiResult_9642 other) {
            if (other == KingOfCentralPlainsMsg.S2C_RankUiResult_9642.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasThumbsUpNum()) {
                  this.setThumbsUpNum(other.getThumbsUpNum());
               }

               if (other.hasMyInfo()) {
                  this.mergeMyInfo(other.getMyInfo());
               }

               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -5;
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
                     this.bitField0_ &= -5;
                     this.infosBuilder_ = KingOfCentralPlainsMsg.S2C_RankUiResult_9642.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
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
            if (!this.hasThumbsUpNum()) {
               return false;
            } else if (this.hasMyInfo() && !this.getMyInfo().isInitialized()) {
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
            S2C_RankUiResult_9642 parsedMessage = null;

            try {
               parsedMessage = (S2C_RankUiResult_9642)KingOfCentralPlainsMsg.S2C_RankUiResult_9642.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RankUiResult_9642)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasThumbsUpNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getThumbsUpNum() {
            return this.thumbsUpNum_;
         }

         public Builder setThumbsUpNum(int value) {
            this.bitField0_ |= 1;
            this.thumbsUpNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearThumbsUpNum() {
            this.bitField0_ &= -2;
            this.thumbsUpNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMyInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public RankInfo getMyInfo() {
            if (this.myInfoBuilder_ == null) {
               return this.myInfo_ == null ? KingOfCentralPlainsMsg.RankInfo.getDefaultInstance() : this.myInfo_;
            } else {
               return (RankInfo)this.myInfoBuilder_.getMessage();
            }
         }

         public Builder setMyInfo(RankInfo value) {
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

         public Builder setMyInfo(RankInfo.Builder builderForValue) {
            if (this.myInfoBuilder_ == null) {
               this.myInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.myInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeMyInfo(RankInfo value) {
            if (this.myInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.myInfo_ != null && this.myInfo_ != KingOfCentralPlainsMsg.RankInfo.getDefaultInstance()) {
                  this.myInfo_ = KingOfCentralPlainsMsg.RankInfo.newBuilder(this.myInfo_).mergeFrom(value).buildPartial();
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

         public RankInfo.Builder getMyInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (RankInfo.Builder)this.getMyInfoFieldBuilder().getBuilder();
         }

         public RankInfoOrBuilder getMyInfoOrBuilder() {
            if (this.myInfoBuilder_ != null) {
               return (RankInfoOrBuilder)this.myInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.myInfo_ == null ? KingOfCentralPlainsMsg.RankInfo.getDefaultInstance() : this.myInfo_;
            }
         }

         private SingleFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> getMyInfoFieldBuilder() {
            if (this.myInfoBuilder_ == null) {
               this.myInfoBuilder_ = new SingleFieldBuilderV3(this.getMyInfo(), this.getParentForChildren(), this.isClean());
               this.myInfo_ = null;
            }

            return this.myInfoBuilder_;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 4;
            }

         }

         public List<RankInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public RankInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (RankInfo)this.infos_.get(index) : (RankInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, RankInfo value) {
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

         public Builder setInfos(int index, RankInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(RankInfo value) {
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

         public Builder addInfos(int index, RankInfo value) {
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

         public Builder addInfos(RankInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, RankInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends RankInfo> values) {
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
               this.bitField0_ &= -5;
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

         public RankInfo.Builder getInfosBuilder(int index) {
            return (RankInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public RankInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (RankInfoOrBuilder)this.infos_.get(index) : (RankInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public RankInfo.Builder addInfosBuilder() {
            return (RankInfo.Builder)this.getInfosFieldBuilder().addBuilder(KingOfCentralPlainsMsg.RankInfo.getDefaultInstance());
         }

         public RankInfo.Builder addInfosBuilder(int index) {
            return (RankInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, KingOfCentralPlainsMsg.RankInfo.getDefaultInstance());
         }

         public List<RankInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class C2S_SeasonTopThree_9643 extends GeneratedMessageV3 implements C2S_SeasonTopThree_9643OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_SeasonTopThree_9643 DEFAULT_INSTANCE = new C2S_SeasonTopThree_9643();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SeasonTopThree_9643> PARSER = new AbstractParser<C2S_SeasonTopThree_9643>() {
         public C2S_SeasonTopThree_9643 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SeasonTopThree_9643(input, extensionRegistry);
         }
      };

      private C2S_SeasonTopThree_9643(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SeasonTopThree_9643() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SeasonTopThree_9643();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SeasonTopThree_9643(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_SeasonTopThree_9643_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_SeasonTopThree_9643_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SeasonTopThree_9643.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SeasonTopThree_9643)) {
            return super.equals(obj);
         } else {
            C2S_SeasonTopThree_9643 other = (C2S_SeasonTopThree_9643)obj;
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

      public static C2S_SeasonTopThree_9643 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SeasonTopThree_9643)PARSER.parseFrom(data);
      }

      public static C2S_SeasonTopThree_9643 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SeasonTopThree_9643)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SeasonTopThree_9643 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SeasonTopThree_9643)PARSER.parseFrom(data);
      }

      public static C2S_SeasonTopThree_9643 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SeasonTopThree_9643)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SeasonTopThree_9643 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SeasonTopThree_9643)PARSER.parseFrom(data);
      }

      public static C2S_SeasonTopThree_9643 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SeasonTopThree_9643)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SeasonTopThree_9643 parseFrom(InputStream input) throws IOException {
         return (C2S_SeasonTopThree_9643)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SeasonTopThree_9643 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SeasonTopThree_9643)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SeasonTopThree_9643 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SeasonTopThree_9643)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SeasonTopThree_9643 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SeasonTopThree_9643)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SeasonTopThree_9643 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SeasonTopThree_9643)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SeasonTopThree_9643 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SeasonTopThree_9643)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SeasonTopThree_9643 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SeasonTopThree_9643 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SeasonTopThree_9643> parser() {
         return PARSER;
      }

      public Parser<C2S_SeasonTopThree_9643> getParserForType() {
         return PARSER;
      }

      public C2S_SeasonTopThree_9643 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SeasonTopThree_9643OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_SeasonTopThree_9643_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_SeasonTopThree_9643_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SeasonTopThree_9643.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.C2S_SeasonTopThree_9643.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_SeasonTopThree_9643_descriptor;
         }

         public C2S_SeasonTopThree_9643 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.C2S_SeasonTopThree_9643.getDefaultInstance();
         }

         public C2S_SeasonTopThree_9643 build() {
            C2S_SeasonTopThree_9643 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SeasonTopThree_9643 buildPartial() {
            C2S_SeasonTopThree_9643 result = new C2S_SeasonTopThree_9643(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_SeasonTopThree_9643) {
               return this.mergeFrom((C2S_SeasonTopThree_9643)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SeasonTopThree_9643 other) {
            if (other == KingOfCentralPlainsMsg.C2S_SeasonTopThree_9643.getDefaultInstance()) {
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
            C2S_SeasonTopThree_9643 parsedMessage = null;

            try {
               parsedMessage = (C2S_SeasonTopThree_9643)KingOfCentralPlainsMsg.C2S_SeasonTopThree_9643.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SeasonTopThree_9643)e.getUnfinishedMessage();
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

   public static final class S2C_SeasonTopThreeResult_9644 extends GeneratedMessageV3 implements S2C_SeasonTopThreeResult_9644OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ROUND_FIELD_NUMBER = 1;
      private int round_;
      public static final int STATE_FIELD_NUMBER = 2;
      private int state_;
      public static final int THUMBSUPNUM_FIELD_NUMBER = 3;
      private int thumbsUpNum_;
      public static final int MYINFO_FIELD_NUMBER = 4;
      private RankInfo myInfo_;
      public static final int INFOS_FIELD_NUMBER = 5;
      private List<RankInfo> infos_;
      public static final int TOPRANK_FIELD_NUMBER = 6;
      private int topRank_;
      public static final int SEASONTIME_FIELD_NUMBER = 7;
      private volatile Object seasonTime_;
      public static final int DOWNTIME_FIELD_NUMBER = 8;
      private int downTime_;
      private byte memoizedIsInitialized;
      private static final S2C_SeasonTopThreeResult_9644 DEFAULT_INSTANCE = new S2C_SeasonTopThreeResult_9644();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SeasonTopThreeResult_9644> PARSER = new AbstractParser<S2C_SeasonTopThreeResult_9644>() {
         public S2C_SeasonTopThreeResult_9644 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SeasonTopThreeResult_9644(input, extensionRegistry);
         }
      };

      private S2C_SeasonTopThreeResult_9644(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SeasonTopThreeResult_9644() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
         this.seasonTime_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SeasonTopThreeResult_9644();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SeasonTopThreeResult_9644(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.round_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.state_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.thumbsUpNum_ = input.readInt32();
                        break;
                     case 34:
                        RankInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 8) != 0) {
                           subBuilder = this.myInfo_.toBuilder();
                        }

                        this.myInfo_ = (RankInfo)input.readMessage(KingOfCentralPlainsMsg.RankInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.myInfo_);
                           this.myInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 8;
                        break;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.infos_.add(input.readMessage(KingOfCentralPlainsMsg.RankInfo.PARSER, extensionRegistry));
                        break;
                     case 48:
                        this.bitField0_ |= 16;
                        this.topRank_ = input.readInt32();
                        break;
                     case 58:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 32;
                        this.seasonTime_ = bs;
                        break;
                     case 64:
                        this.bitField0_ |= 64;
                        this.downTime_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_SeasonTopThreeResult_9644_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_SeasonTopThreeResult_9644_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SeasonTopThreeResult_9644.class, Builder.class);
      }

      public boolean hasRound() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRound() {
         return this.round_;
      }

      public boolean hasState() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getState() {
         return this.state_;
      }

      public boolean hasThumbsUpNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getThumbsUpNum() {
         return this.thumbsUpNum_;
      }

      public boolean hasMyInfo() {
         return (this.bitField0_ & 8) != 0;
      }

      public RankInfo getMyInfo() {
         return this.myInfo_ == null ? KingOfCentralPlainsMsg.RankInfo.getDefaultInstance() : this.myInfo_;
      }

      public RankInfoOrBuilder getMyInfoOrBuilder() {
         return this.myInfo_ == null ? KingOfCentralPlainsMsg.RankInfo.getDefaultInstance() : this.myInfo_;
      }

      public List<RankInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends RankInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public RankInfo getInfos(int index) {
         return (RankInfo)this.infos_.get(index);
      }

      public RankInfoOrBuilder getInfosOrBuilder(int index) {
         return (RankInfoOrBuilder)this.infos_.get(index);
      }

      public boolean hasTopRank() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getTopRank() {
         return this.topRank_;
      }

      public boolean hasSeasonTime() {
         return (this.bitField0_ & 32) != 0;
      }

      public String getSeasonTime() {
         Object ref = this.seasonTime_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.seasonTime_ = s;
            }

            return s;
         }
      }

      public ByteString getSeasonTimeBytes() {
         Object ref = this.seasonTime_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.seasonTime_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasDownTime() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getDownTime() {
         return this.downTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRound()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasThumbsUpNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTopRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSeasonTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDownTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasMyInfo() && !this.getMyInfo().isInitialized()) {
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
            output.writeInt32(1, this.round_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.state_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.thumbsUpNum_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeMessage(4, this.getMyInfo());
         }

         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.infos_.get(i));
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(6, this.topRank_);
         }

         if ((this.bitField0_ & 32) != 0) {
            GeneratedMessageV3.writeString(output, 7, this.seasonTime_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(8, this.downTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.round_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.state_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.thumbsUpNum_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeMessageSize(4, this.getMyInfo());
            }

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.infos_.get(i));
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.topRank_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += GeneratedMessageV3.computeStringSize(7, this.seasonTime_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.downTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SeasonTopThreeResult_9644)) {
            return super.equals(obj);
         } else {
            S2C_SeasonTopThreeResult_9644 other = (S2C_SeasonTopThreeResult_9644)obj;
            if (this.hasRound() != other.hasRound()) {
               return false;
            } else if (this.hasRound() && this.getRound() != other.getRound()) {
               return false;
            } else if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
               return false;
            } else if (this.hasThumbsUpNum() != other.hasThumbsUpNum()) {
               return false;
            } else if (this.hasThumbsUpNum() && this.getThumbsUpNum() != other.getThumbsUpNum()) {
               return false;
            } else if (this.hasMyInfo() != other.hasMyInfo()) {
               return false;
            } else if (this.hasMyInfo() && !this.getMyInfo().equals(other.getMyInfo())) {
               return false;
            } else if (!this.getInfosList().equals(other.getInfosList())) {
               return false;
            } else if (this.hasTopRank() != other.hasTopRank()) {
               return false;
            } else if (this.hasTopRank() && this.getTopRank() != other.getTopRank()) {
               return false;
            } else if (this.hasSeasonTime() != other.hasSeasonTime()) {
               return false;
            } else if (this.hasSeasonTime() && !this.getSeasonTime().equals(other.getSeasonTime())) {
               return false;
            } else if (this.hasDownTime() != other.hasDownTime()) {
               return false;
            } else if (this.hasDownTime() && this.getDownTime() != other.getDownTime()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasRound()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRound();
            }

            if (this.hasState()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getState();
            }

            if (this.hasThumbsUpNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getThumbsUpNum();
            }

            if (this.hasMyInfo()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getMyInfo().hashCode();
            }

            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            if (this.hasTopRank()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getTopRank();
            }

            if (this.hasSeasonTime()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getSeasonTime().hashCode();
            }

            if (this.hasDownTime()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getDownTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SeasonTopThreeResult_9644 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SeasonTopThreeResult_9644)PARSER.parseFrom(data);
      }

      public static S2C_SeasonTopThreeResult_9644 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SeasonTopThreeResult_9644)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SeasonTopThreeResult_9644 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SeasonTopThreeResult_9644)PARSER.parseFrom(data);
      }

      public static S2C_SeasonTopThreeResult_9644 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SeasonTopThreeResult_9644)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SeasonTopThreeResult_9644 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SeasonTopThreeResult_9644)PARSER.parseFrom(data);
      }

      public static S2C_SeasonTopThreeResult_9644 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SeasonTopThreeResult_9644)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SeasonTopThreeResult_9644 parseFrom(InputStream input) throws IOException {
         return (S2C_SeasonTopThreeResult_9644)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SeasonTopThreeResult_9644 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SeasonTopThreeResult_9644)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SeasonTopThreeResult_9644 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SeasonTopThreeResult_9644)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SeasonTopThreeResult_9644 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SeasonTopThreeResult_9644)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SeasonTopThreeResult_9644 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SeasonTopThreeResult_9644)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SeasonTopThreeResult_9644 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SeasonTopThreeResult_9644)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SeasonTopThreeResult_9644 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SeasonTopThreeResult_9644 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SeasonTopThreeResult_9644> parser() {
         return PARSER;
      }

      public Parser<S2C_SeasonTopThreeResult_9644> getParserForType() {
         return PARSER;
      }

      public S2C_SeasonTopThreeResult_9644 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SeasonTopThreeResult_9644OrBuilder {
         private int bitField0_;
         private int round_;
         private int state_;
         private int thumbsUpNum_;
         private RankInfo myInfo_;
         private SingleFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> myInfoBuilder_;
         private List<RankInfo> infos_;
         private RepeatedFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> infosBuilder_;
         private int topRank_;
         private Object seasonTime_;
         private int downTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_SeasonTopThreeResult_9644_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_SeasonTopThreeResult_9644_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SeasonTopThreeResult_9644.class, Builder.class);
         }

         private Builder() {
            this.infos_ = Collections.emptyList();
            this.seasonTime_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.infos_ = Collections.emptyList();
            this.seasonTime_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.S2C_SeasonTopThreeResult_9644.alwaysUseFieldBuilders) {
               this.getMyInfoFieldBuilder();
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.round_ = 0;
            this.bitField0_ &= -2;
            this.state_ = 0;
            this.bitField0_ &= -3;
            this.thumbsUpNum_ = 0;
            this.bitField0_ &= -5;
            if (this.myInfoBuilder_ == null) {
               this.myInfo_ = null;
            } else {
               this.myInfoBuilder_.clear();
            }

            this.bitField0_ &= -9;
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.infosBuilder_.clear();
            }

            this.topRank_ = 0;
            this.bitField0_ &= -33;
            this.seasonTime_ = "";
            this.bitField0_ &= -65;
            this.downTime_ = 0;
            this.bitField0_ &= -129;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_SeasonTopThreeResult_9644_descriptor;
         }

         public S2C_SeasonTopThreeResult_9644 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.S2C_SeasonTopThreeResult_9644.getDefaultInstance();
         }

         public S2C_SeasonTopThreeResult_9644 build() {
            S2C_SeasonTopThreeResult_9644 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SeasonTopThreeResult_9644 buildPartial() {
            S2C_SeasonTopThreeResult_9644 result = new S2C_SeasonTopThreeResult_9644(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.round_ = this.round_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.state_ = this.state_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.thumbsUpNum_ = this.thumbsUpNum_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               if (this.myInfoBuilder_ == null) {
                  result.myInfo_ = this.myInfo_;
               } else {
                  result.myInfo_ = (RankInfo)this.myInfoBuilder_.build();
               }

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
               result.topRank_ = this.topRank_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 64) != 0) {
               to_bitField0_ |= 32;
            }

            result.seasonTime_ = this.seasonTime_;
            if ((from_bitField0_ & 128) != 0) {
               result.downTime_ = this.downTime_;
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
            if (other instanceof S2C_SeasonTopThreeResult_9644) {
               return this.mergeFrom((S2C_SeasonTopThreeResult_9644)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SeasonTopThreeResult_9644 other) {
            if (other == KingOfCentralPlainsMsg.S2C_SeasonTopThreeResult_9644.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRound()) {
                  this.setRound(other.getRound());
               }

               if (other.hasState()) {
                  this.setState(other.getState());
               }

               if (other.hasThumbsUpNum()) {
                  this.setThumbsUpNum(other.getThumbsUpNum());
               }

               if (other.hasMyInfo()) {
                  this.mergeMyInfo(other.getMyInfo());
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
                     this.infosBuilder_ = KingOfCentralPlainsMsg.S2C_SeasonTopThreeResult_9644.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               if (other.hasTopRank()) {
                  this.setTopRank(other.getTopRank());
               }

               if (other.hasSeasonTime()) {
                  this.bitField0_ |= 64;
                  this.seasonTime_ = other.seasonTime_;
                  this.onChanged();
               }

               if (other.hasDownTime()) {
                  this.setDownTime(other.getDownTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRound()) {
               return false;
            } else if (!this.hasState()) {
               return false;
            } else if (!this.hasThumbsUpNum()) {
               return false;
            } else if (!this.hasTopRank()) {
               return false;
            } else if (!this.hasSeasonTime()) {
               return false;
            } else if (!this.hasDownTime()) {
               return false;
            } else if (this.hasMyInfo() && !this.getMyInfo().isInitialized()) {
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
            S2C_SeasonTopThreeResult_9644 parsedMessage = null;

            try {
               parsedMessage = (S2C_SeasonTopThreeResult_9644)KingOfCentralPlainsMsg.S2C_SeasonTopThreeResult_9644.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SeasonTopThreeResult_9644)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRound() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRound() {
            return this.round_;
         }

         public Builder setRound(int value) {
            this.bitField0_ |= 1;
            this.round_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRound() {
            this.bitField0_ &= -2;
            this.round_ = 0;
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

         public boolean hasMyInfo() {
            return (this.bitField0_ & 8) != 0;
         }

         public RankInfo getMyInfo() {
            if (this.myInfoBuilder_ == null) {
               return this.myInfo_ == null ? KingOfCentralPlainsMsg.RankInfo.getDefaultInstance() : this.myInfo_;
            } else {
               return (RankInfo)this.myInfoBuilder_.getMessage();
            }
         }

         public Builder setMyInfo(RankInfo value) {
            if (this.myInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.myInfo_ = value;
               this.onChanged();
            } else {
               this.myInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder setMyInfo(RankInfo.Builder builderForValue) {
            if (this.myInfoBuilder_ == null) {
               this.myInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.myInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder mergeMyInfo(RankInfo value) {
            if (this.myInfoBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0 && this.myInfo_ != null && this.myInfo_ != KingOfCentralPlainsMsg.RankInfo.getDefaultInstance()) {
                  this.myInfo_ = KingOfCentralPlainsMsg.RankInfo.newBuilder(this.myInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.myInfo_ = value;
               }

               this.onChanged();
            } else {
               this.myInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder clearMyInfo() {
            if (this.myInfoBuilder_ == null) {
               this.myInfo_ = null;
               this.onChanged();
            } else {
               this.myInfoBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public RankInfo.Builder getMyInfoBuilder() {
            this.bitField0_ |= 8;
            this.onChanged();
            return (RankInfo.Builder)this.getMyInfoFieldBuilder().getBuilder();
         }

         public RankInfoOrBuilder getMyInfoOrBuilder() {
            if (this.myInfoBuilder_ != null) {
               return (RankInfoOrBuilder)this.myInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.myInfo_ == null ? KingOfCentralPlainsMsg.RankInfo.getDefaultInstance() : this.myInfo_;
            }
         }

         private SingleFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> getMyInfoFieldBuilder() {
            if (this.myInfoBuilder_ == null) {
               this.myInfoBuilder_ = new SingleFieldBuilderV3(this.getMyInfo(), this.getParentForChildren(), this.isClean());
               this.myInfo_ = null;
            }

            return this.myInfoBuilder_;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 16;
            }

         }

         public List<RankInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public RankInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (RankInfo)this.infos_.get(index) : (RankInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, RankInfo value) {
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

         public Builder setInfos(int index, RankInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(RankInfo value) {
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

         public Builder addInfos(int index, RankInfo value) {
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

         public Builder addInfos(RankInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, RankInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends RankInfo> values) {
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

         public RankInfo.Builder getInfosBuilder(int index) {
            return (RankInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public RankInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (RankInfoOrBuilder)this.infos_.get(index) : (RankInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public RankInfo.Builder addInfosBuilder() {
            return (RankInfo.Builder)this.getInfosFieldBuilder().addBuilder(KingOfCentralPlainsMsg.RankInfo.getDefaultInstance());
         }

         public RankInfo.Builder addInfosBuilder(int index) {
            return (RankInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, KingOfCentralPlainsMsg.RankInfo.getDefaultInstance());
         }

         public List<RankInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         public boolean hasTopRank() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getTopRank() {
            return this.topRank_;
         }

         public Builder setTopRank(int value) {
            this.bitField0_ |= 32;
            this.topRank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTopRank() {
            this.bitField0_ &= -33;
            this.topRank_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSeasonTime() {
            return (this.bitField0_ & 64) != 0;
         }

         public String getSeasonTime() {
            Object ref = this.seasonTime_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.seasonTime_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getSeasonTimeBytes() {
            Object ref = this.seasonTime_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.seasonTime_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setSeasonTime(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 64;
               this.seasonTime_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearSeasonTime() {
            this.bitField0_ &= -65;
            this.seasonTime_ = KingOfCentralPlainsMsg.S2C_SeasonTopThreeResult_9644.getDefaultInstance().getSeasonTime();
            this.onChanged();
            return this;
         }

         public Builder setSeasonTimeBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 64;
               this.seasonTime_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasDownTime() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getDownTime() {
            return this.downTime_;
         }

         public Builder setDownTime(int value) {
            this.bitField0_ |= 128;
            this.downTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDownTime() {
            this.bitField0_ &= -129;
            this.downTime_ = 0;
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

   public static final class C2S_RoundAndState_9649 extends GeneratedMessageV3 implements C2S_RoundAndState_9649OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_RoundAndState_9649 DEFAULT_INSTANCE = new C2S_RoundAndState_9649();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RoundAndState_9649> PARSER = new AbstractParser<C2S_RoundAndState_9649>() {
         public C2S_RoundAndState_9649 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RoundAndState_9649(input, extensionRegistry);
         }
      };

      private C2S_RoundAndState_9649(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RoundAndState_9649() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RoundAndState_9649();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RoundAndState_9649(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_RoundAndState_9649_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_RoundAndState_9649_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RoundAndState_9649.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RoundAndState_9649)) {
            return super.equals(obj);
         } else {
            C2S_RoundAndState_9649 other = (C2S_RoundAndState_9649)obj;
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

      public static C2S_RoundAndState_9649 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RoundAndState_9649)PARSER.parseFrom(data);
      }

      public static C2S_RoundAndState_9649 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RoundAndState_9649)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RoundAndState_9649 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RoundAndState_9649)PARSER.parseFrom(data);
      }

      public static C2S_RoundAndState_9649 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RoundAndState_9649)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RoundAndState_9649 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RoundAndState_9649)PARSER.parseFrom(data);
      }

      public static C2S_RoundAndState_9649 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RoundAndState_9649)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RoundAndState_9649 parseFrom(InputStream input) throws IOException {
         return (C2S_RoundAndState_9649)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RoundAndState_9649 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RoundAndState_9649)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RoundAndState_9649 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RoundAndState_9649)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RoundAndState_9649 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RoundAndState_9649)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RoundAndState_9649 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RoundAndState_9649)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RoundAndState_9649 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RoundAndState_9649)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RoundAndState_9649 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RoundAndState_9649 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RoundAndState_9649> parser() {
         return PARSER;
      }

      public Parser<C2S_RoundAndState_9649> getParserForType() {
         return PARSER;
      }

      public C2S_RoundAndState_9649 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RoundAndState_9649OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_RoundAndState_9649_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_RoundAndState_9649_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RoundAndState_9649.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.C2S_RoundAndState_9649.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_RoundAndState_9649_descriptor;
         }

         public C2S_RoundAndState_9649 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.C2S_RoundAndState_9649.getDefaultInstance();
         }

         public C2S_RoundAndState_9649 build() {
            C2S_RoundAndState_9649 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RoundAndState_9649 buildPartial() {
            C2S_RoundAndState_9649 result = new C2S_RoundAndState_9649(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_RoundAndState_9649) {
               return this.mergeFrom((C2S_RoundAndState_9649)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RoundAndState_9649 other) {
            if (other == KingOfCentralPlainsMsg.C2S_RoundAndState_9649.getDefaultInstance()) {
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
            C2S_RoundAndState_9649 parsedMessage = null;

            try {
               parsedMessage = (C2S_RoundAndState_9649)KingOfCentralPlainsMsg.C2S_RoundAndState_9649.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RoundAndState_9649)e.getUnfinishedMessage();
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

   public static final class S2C_RoundAndState_9650 extends GeneratedMessageV3 implements S2C_RoundAndState_9650OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ISENABLE_FIELD_NUMBER = 1;
      private boolean isEnable_;
      public static final int ROUND_FIELD_NUMBER = 2;
      private int round_;
      public static final int STATE_FIELD_NUMBER = 3;
      private int state_;
      public static final int STARTTIME_FIELD_NUMBER = 4;
      private int startTime_;
      public static final int DOWNTIME_FIELD_NUMBER = 5;
      private int downTime_;
      public static final int NEXTTIME_FIELD_NUMBER = 6;
      private int nextTime_;
      private byte memoizedIsInitialized;
      private static final S2C_RoundAndState_9650 DEFAULT_INSTANCE = new S2C_RoundAndState_9650();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RoundAndState_9650> PARSER = new AbstractParser<S2C_RoundAndState_9650>() {
         public S2C_RoundAndState_9650 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RoundAndState_9650(input, extensionRegistry);
         }
      };

      private S2C_RoundAndState_9650(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RoundAndState_9650() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RoundAndState_9650();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RoundAndState_9650(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.isEnable_ = input.readBool();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.round_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.state_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.startTime_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.downTime_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.nextTime_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_RoundAndState_9650_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_RoundAndState_9650_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RoundAndState_9650.class, Builder.class);
      }

      public boolean hasIsEnable() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsEnable() {
         return this.isEnable_;
      }

      public boolean hasRound() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRound() {
         return this.round_;
      }

      public boolean hasState() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getState() {
         return this.state_;
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
      }

      public boolean hasDownTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getDownTime() {
         return this.downTime_;
      }

      public boolean hasNextTime() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getNextTime() {
         return this.nextTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIsEnable()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRound()) {
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
            output.writeBool(1, this.isEnable_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.round_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.state_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.startTime_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.downTime_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.nextTime_);
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
               size += CodedOutputStream.computeBoolSize(1, this.isEnable_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.round_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.state_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.startTime_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.downTime_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.nextTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RoundAndState_9650)) {
            return super.equals(obj);
         } else {
            S2C_RoundAndState_9650 other = (S2C_RoundAndState_9650)obj;
            if (this.hasIsEnable() != other.hasIsEnable()) {
               return false;
            } else if (this.hasIsEnable() && this.getIsEnable() != other.getIsEnable()) {
               return false;
            } else if (this.hasRound() != other.hasRound()) {
               return false;
            } else if (this.hasRound() && this.getRound() != other.getRound()) {
               return false;
            } else if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
               return false;
            } else if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else if (this.hasDownTime() != other.hasDownTime()) {
               return false;
            } else if (this.hasDownTime() && this.getDownTime() != other.getDownTime()) {
               return false;
            } else if (this.hasNextTime() != other.hasNextTime()) {
               return false;
            } else if (this.hasNextTime() && this.getNextTime() != other.getNextTime()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasIsEnable()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getIsEnable());
            }

            if (this.hasRound()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRound();
            }

            if (this.hasState()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getState();
            }

            if (this.hasStartTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getStartTime();
            }

            if (this.hasDownTime()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getDownTime();
            }

            if (this.hasNextTime()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getNextTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RoundAndState_9650 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RoundAndState_9650)PARSER.parseFrom(data);
      }

      public static S2C_RoundAndState_9650 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RoundAndState_9650)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RoundAndState_9650 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RoundAndState_9650)PARSER.parseFrom(data);
      }

      public static S2C_RoundAndState_9650 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RoundAndState_9650)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RoundAndState_9650 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RoundAndState_9650)PARSER.parseFrom(data);
      }

      public static S2C_RoundAndState_9650 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RoundAndState_9650)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RoundAndState_9650 parseFrom(InputStream input) throws IOException {
         return (S2C_RoundAndState_9650)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RoundAndState_9650 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RoundAndState_9650)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RoundAndState_9650 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RoundAndState_9650)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RoundAndState_9650 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RoundAndState_9650)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RoundAndState_9650 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RoundAndState_9650)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RoundAndState_9650 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RoundAndState_9650)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RoundAndState_9650 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RoundAndState_9650 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RoundAndState_9650> parser() {
         return PARSER;
      }

      public Parser<S2C_RoundAndState_9650> getParserForType() {
         return PARSER;
      }

      public S2C_RoundAndState_9650 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RoundAndState_9650OrBuilder {
         private int bitField0_;
         private boolean isEnable_;
         private int round_;
         private int state_;
         private int startTime_;
         private int downTime_;
         private int nextTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_RoundAndState_9650_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_RoundAndState_9650_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RoundAndState_9650.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.S2C_RoundAndState_9650.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.isEnable_ = false;
            this.bitField0_ &= -2;
            this.round_ = 0;
            this.bitField0_ &= -3;
            this.state_ = 0;
            this.bitField0_ &= -5;
            this.startTime_ = 0;
            this.bitField0_ &= -9;
            this.downTime_ = 0;
            this.bitField0_ &= -17;
            this.nextTime_ = 0;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_RoundAndState_9650_descriptor;
         }

         public S2C_RoundAndState_9650 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.S2C_RoundAndState_9650.getDefaultInstance();
         }

         public S2C_RoundAndState_9650 build() {
            S2C_RoundAndState_9650 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RoundAndState_9650 buildPartial() {
            S2C_RoundAndState_9650 result = new S2C_RoundAndState_9650(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.isEnable_ = this.isEnable_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.round_ = this.round_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.state_ = this.state_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.startTime_ = this.startTime_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.downTime_ = this.downTime_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.nextTime_ = this.nextTime_;
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
            if (other instanceof S2C_RoundAndState_9650) {
               return this.mergeFrom((S2C_RoundAndState_9650)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RoundAndState_9650 other) {
            if (other == KingOfCentralPlainsMsg.S2C_RoundAndState_9650.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIsEnable()) {
                  this.setIsEnable(other.getIsEnable());
               }

               if (other.hasRound()) {
                  this.setRound(other.getRound());
               }

               if (other.hasState()) {
                  this.setState(other.getState());
               }

               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               if (other.hasDownTime()) {
                  this.setDownTime(other.getDownTime());
               }

               if (other.hasNextTime()) {
                  this.setNextTime(other.getNextTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasIsEnable()) {
               return false;
            } else if (!this.hasRound()) {
               return false;
            } else {
               return this.hasState();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RoundAndState_9650 parsedMessage = null;

            try {
               parsedMessage = (S2C_RoundAndState_9650)KingOfCentralPlainsMsg.S2C_RoundAndState_9650.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RoundAndState_9650)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIsEnable() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getIsEnable() {
            return this.isEnable_;
         }

         public Builder setIsEnable(boolean value) {
            this.bitField0_ |= 1;
            this.isEnable_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsEnable() {
            this.bitField0_ &= -2;
            this.isEnable_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasRound() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRound() {
            return this.round_;
         }

         public Builder setRound(int value) {
            this.bitField0_ |= 2;
            this.round_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRound() {
            this.bitField0_ &= -3;
            this.round_ = 0;
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

         public boolean hasDownTime() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getDownTime() {
            return this.downTime_;
         }

         public Builder setDownTime(int value) {
            this.bitField0_ |= 16;
            this.downTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDownTime() {
            this.bitField0_ &= -17;
            this.downTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasNextTime() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getNextTime() {
            return this.nextTime_;
         }

         public Builder setNextTime(int value) {
            this.bitField0_ |= 32;
            this.nextTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNextTime() {
            this.bitField0_ &= -33;
            this.nextTime_ = 0;
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

   public static final class C2S_ActivityState_9651 extends GeneratedMessageV3 implements C2S_ActivityState_9651OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ActivityState_9651 DEFAULT_INSTANCE = new C2S_ActivityState_9651();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ActivityState_9651> PARSER = new AbstractParser<C2S_ActivityState_9651>() {
         public C2S_ActivityState_9651 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ActivityState_9651(input, extensionRegistry);
         }
      };

      private C2S_ActivityState_9651(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ActivityState_9651() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ActivityState_9651();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ActivityState_9651(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_ActivityState_9651_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_ActivityState_9651_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityState_9651.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ActivityState_9651)) {
            return super.equals(obj);
         } else {
            C2S_ActivityState_9651 other = (C2S_ActivityState_9651)obj;
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

      public static C2S_ActivityState_9651 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ActivityState_9651)PARSER.parseFrom(data);
      }

      public static C2S_ActivityState_9651 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityState_9651)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityState_9651 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ActivityState_9651)PARSER.parseFrom(data);
      }

      public static C2S_ActivityState_9651 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityState_9651)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityState_9651 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ActivityState_9651)PARSER.parseFrom(data);
      }

      public static C2S_ActivityState_9651 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityState_9651)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityState_9651 parseFrom(InputStream input) throws IOException {
         return (C2S_ActivityState_9651)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityState_9651 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityState_9651)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityState_9651 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ActivityState_9651)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ActivityState_9651 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityState_9651)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityState_9651 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ActivityState_9651)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityState_9651 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityState_9651)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ActivityState_9651 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ActivityState_9651 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ActivityState_9651> parser() {
         return PARSER;
      }

      public Parser<C2S_ActivityState_9651> getParserForType() {
         return PARSER;
      }

      public C2S_ActivityState_9651 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ActivityState_9651OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_ActivityState_9651_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_ActivityState_9651_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityState_9651.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.C2S_ActivityState_9651.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_ActivityState_9651_descriptor;
         }

         public C2S_ActivityState_9651 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.C2S_ActivityState_9651.getDefaultInstance();
         }

         public C2S_ActivityState_9651 build() {
            C2S_ActivityState_9651 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ActivityState_9651 buildPartial() {
            C2S_ActivityState_9651 result = new C2S_ActivityState_9651(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ActivityState_9651) {
               return this.mergeFrom((C2S_ActivityState_9651)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ActivityState_9651 other) {
            if (other == KingOfCentralPlainsMsg.C2S_ActivityState_9651.getDefaultInstance()) {
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
            C2S_ActivityState_9651 parsedMessage = null;

            try {
               parsedMessage = (C2S_ActivityState_9651)KingOfCentralPlainsMsg.C2S_ActivityState_9651.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ActivityState_9651)e.getUnfinishedMessage();
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

   public static final class S2C_ActivityState_9652 extends GeneratedMessageV3 implements S2C_ActivityState_9652OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STATE_FIELD_NUMBER = 1;
      private int state_;
      public static final int STARTTIME_FIELD_NUMBER = 2;
      private int startTime_;
      public static final int DOWNTIME_FIELD_NUMBER = 3;
      private int downTime_;
      public static final int ISACTIVITYDAY_FIELD_NUMBER = 4;
      private boolean isActivityDay_;
      public static final int ISOPENDAY_FIELD_NUMBER = 5;
      private boolean isOpenDay_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivityState_9652 DEFAULT_INSTANCE = new S2C_ActivityState_9652();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivityState_9652> PARSER = new AbstractParser<S2C_ActivityState_9652>() {
         public S2C_ActivityState_9652 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivityState_9652(input, extensionRegistry);
         }
      };

      private S2C_ActivityState_9652(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivityState_9652() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivityState_9652();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivityState_9652(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.startTime_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.downTime_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.isActivityDay_ = input.readBool();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.isOpenDay_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_ActivityState_9652_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_ActivityState_9652_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityState_9652.class, Builder.class);
      }

      public boolean hasState() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getState() {
         return this.state_;
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
      }

      public boolean hasDownTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getDownTime() {
         return this.downTime_;
      }

      public boolean hasIsActivityDay() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getIsActivityDay() {
         return this.isActivityDay_;
      }

      public boolean hasIsOpenDay() {
         return (this.bitField0_ & 16) != 0;
      }

      public boolean getIsOpenDay() {
         return this.isOpenDay_;
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.startTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.downTime_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBool(4, this.isActivityDay_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeBool(5, this.isOpenDay_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.startTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.downTime_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.isActivityDay_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeBoolSize(5, this.isOpenDay_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ActivityState_9652)) {
            return super.equals(obj);
         } else {
            S2C_ActivityState_9652 other = (S2C_ActivityState_9652)obj;
            if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
               return false;
            } else if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else if (this.hasDownTime() != other.hasDownTime()) {
               return false;
            } else if (this.hasDownTime() && this.getDownTime() != other.getDownTime()) {
               return false;
            } else if (this.hasIsActivityDay() != other.hasIsActivityDay()) {
               return false;
            } else if (this.hasIsActivityDay() && this.getIsActivityDay() != other.getIsActivityDay()) {
               return false;
            } else if (this.hasIsOpenDay() != other.hasIsOpenDay()) {
               return false;
            } else if (this.hasIsOpenDay() && this.getIsOpenDay() != other.getIsOpenDay()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasStartTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStartTime();
            }

            if (this.hasDownTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getDownTime();
            }

            if (this.hasIsActivityDay()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getIsActivityDay());
            }

            if (this.hasIsOpenDay()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashBoolean(this.getIsOpenDay());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ActivityState_9652 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivityState_9652)PARSER.parseFrom(data);
      }

      public static S2C_ActivityState_9652 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityState_9652)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityState_9652 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivityState_9652)PARSER.parseFrom(data);
      }

      public static S2C_ActivityState_9652 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityState_9652)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityState_9652 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivityState_9652)PARSER.parseFrom(data);
      }

      public static S2C_ActivityState_9652 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityState_9652)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityState_9652 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivityState_9652)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityState_9652 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityState_9652)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityState_9652 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivityState_9652)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivityState_9652 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityState_9652)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityState_9652 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivityState_9652)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityState_9652 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityState_9652)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivityState_9652 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivityState_9652 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivityState_9652> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivityState_9652> getParserForType() {
         return PARSER;
      }

      public S2C_ActivityState_9652 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivityState_9652OrBuilder {
         private int bitField0_;
         private int state_;
         private int startTime_;
         private int downTime_;
         private boolean isActivityDay_;
         private boolean isOpenDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_ActivityState_9652_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_ActivityState_9652_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityState_9652.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.S2C_ActivityState_9652.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.state_ = 0;
            this.bitField0_ &= -2;
            this.startTime_ = 0;
            this.bitField0_ &= -3;
            this.downTime_ = 0;
            this.bitField0_ &= -5;
            this.isActivityDay_ = false;
            this.bitField0_ &= -9;
            this.isOpenDay_ = false;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_ActivityState_9652_descriptor;
         }

         public S2C_ActivityState_9652 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.S2C_ActivityState_9652.getDefaultInstance();
         }

         public S2C_ActivityState_9652 build() {
            S2C_ActivityState_9652 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivityState_9652 buildPartial() {
            S2C_ActivityState_9652 result = new S2C_ActivityState_9652(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.state_ = this.state_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.startTime_ = this.startTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.downTime_ = this.downTime_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.isActivityDay_ = this.isActivityDay_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.isOpenDay_ = this.isOpenDay_;
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
            if (other instanceof S2C_ActivityState_9652) {
               return this.mergeFrom((S2C_ActivityState_9652)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivityState_9652 other) {
            if (other == KingOfCentralPlainsMsg.S2C_ActivityState_9652.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasState()) {
                  this.setState(other.getState());
               }

               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               if (other.hasDownTime()) {
                  this.setDownTime(other.getDownTime());
               }

               if (other.hasIsActivityDay()) {
                  this.setIsActivityDay(other.getIsActivityDay());
               }

               if (other.hasIsOpenDay()) {
                  this.setIsOpenDay(other.getIsOpenDay());
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
            S2C_ActivityState_9652 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivityState_9652)KingOfCentralPlainsMsg.S2C_ActivityState_9652.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivityState_9652)e.getUnfinishedMessage();
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

         public boolean hasDownTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getDownTime() {
            return this.downTime_;
         }

         public Builder setDownTime(int value) {
            this.bitField0_ |= 4;
            this.downTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDownTime() {
            this.bitField0_ &= -5;
            this.downTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsActivityDay() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getIsActivityDay() {
            return this.isActivityDay_;
         }

         public Builder setIsActivityDay(boolean value) {
            this.bitField0_ |= 8;
            this.isActivityDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsActivityDay() {
            this.bitField0_ &= -9;
            this.isActivityDay_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasIsOpenDay() {
            return (this.bitField0_ & 16) != 0;
         }

         public boolean getIsOpenDay() {
            return this.isOpenDay_;
         }

         public Builder setIsOpenDay(boolean value) {
            this.bitField0_ |= 16;
            this.isOpenDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsOpenDay() {
            this.bitField0_ &= -17;
            this.isOpenDay_ = false;
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

   public static final class S2C_FightRecord_9654 extends GeneratedMessageV3 implements S2C_FightRecord_9654OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FIGHTRECORDID_FIELD_NUMBER = 1;
      private int fightRecordId_;
      public static final int GUESSRECORDID_FIELD_NUMBER = 2;
      private int guessRecordId_;
      public static final int FIGHTRECORDTIME_FIELD_NUMBER = 3;
      private int fightRecordTime_;
      public static final int GUESSRECORDTIME_FIELD_NUMBER = 4;
      private int guessRecordTime_;
      private byte memoizedIsInitialized;
      private static final S2C_FightRecord_9654 DEFAULT_INSTANCE = new S2C_FightRecord_9654();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FightRecord_9654> PARSER = new AbstractParser<S2C_FightRecord_9654>() {
         public S2C_FightRecord_9654 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FightRecord_9654(input, extensionRegistry);
         }
      };

      private S2C_FightRecord_9654(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FightRecord_9654() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FightRecord_9654();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FightRecord_9654(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.fightRecordId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.guessRecordId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.fightRecordTime_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.guessRecordTime_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_FightRecord_9654_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_FightRecord_9654_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FightRecord_9654.class, Builder.class);
      }

      public boolean hasFightRecordId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFightRecordId() {
         return this.fightRecordId_;
      }

      public boolean hasGuessRecordId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getGuessRecordId() {
         return this.guessRecordId_;
      }

      public boolean hasFightRecordTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getFightRecordTime() {
         return this.fightRecordTime_;
      }

      public boolean hasGuessRecordTime() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getGuessRecordTime() {
         return this.guessRecordTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFightRecordId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGuessRecordId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFightRecordTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGuessRecordTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.fightRecordId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.guessRecordId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.fightRecordTime_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.guessRecordTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.fightRecordId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.guessRecordId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.fightRecordTime_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.guessRecordTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FightRecord_9654)) {
            return super.equals(obj);
         } else {
            S2C_FightRecord_9654 other = (S2C_FightRecord_9654)obj;
            if (this.hasFightRecordId() != other.hasFightRecordId()) {
               return false;
            } else if (this.hasFightRecordId() && this.getFightRecordId() != other.getFightRecordId()) {
               return false;
            } else if (this.hasGuessRecordId() != other.hasGuessRecordId()) {
               return false;
            } else if (this.hasGuessRecordId() && this.getGuessRecordId() != other.getGuessRecordId()) {
               return false;
            } else if (this.hasFightRecordTime() != other.hasFightRecordTime()) {
               return false;
            } else if (this.hasFightRecordTime() && this.getFightRecordTime() != other.getFightRecordTime()) {
               return false;
            } else if (this.hasGuessRecordTime() != other.hasGuessRecordTime()) {
               return false;
            } else if (this.hasGuessRecordTime() && this.getGuessRecordTime() != other.getGuessRecordTime()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasFightRecordId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFightRecordId();
            }

            if (this.hasGuessRecordId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGuessRecordId();
            }

            if (this.hasFightRecordTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getFightRecordTime();
            }

            if (this.hasGuessRecordTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getGuessRecordTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FightRecord_9654 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FightRecord_9654)PARSER.parseFrom(data);
      }

      public static S2C_FightRecord_9654 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FightRecord_9654)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FightRecord_9654 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FightRecord_9654)PARSER.parseFrom(data);
      }

      public static S2C_FightRecord_9654 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FightRecord_9654)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FightRecord_9654 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FightRecord_9654)PARSER.parseFrom(data);
      }

      public static S2C_FightRecord_9654 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FightRecord_9654)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FightRecord_9654 parseFrom(InputStream input) throws IOException {
         return (S2C_FightRecord_9654)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FightRecord_9654 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FightRecord_9654)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FightRecord_9654 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FightRecord_9654)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FightRecord_9654 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FightRecord_9654)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FightRecord_9654 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FightRecord_9654)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FightRecord_9654 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FightRecord_9654)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FightRecord_9654 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FightRecord_9654 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FightRecord_9654> parser() {
         return PARSER;
      }

      public Parser<S2C_FightRecord_9654> getParserForType() {
         return PARSER;
      }

      public S2C_FightRecord_9654 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FightRecord_9654OrBuilder {
         private int bitField0_;
         private int fightRecordId_;
         private int guessRecordId_;
         private int fightRecordTime_;
         private int guessRecordTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_FightRecord_9654_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_FightRecord_9654_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FightRecord_9654.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.S2C_FightRecord_9654.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.fightRecordId_ = 0;
            this.bitField0_ &= -2;
            this.guessRecordId_ = 0;
            this.bitField0_ &= -3;
            this.fightRecordTime_ = 0;
            this.bitField0_ &= -5;
            this.guessRecordTime_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_FightRecord_9654_descriptor;
         }

         public S2C_FightRecord_9654 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.S2C_FightRecord_9654.getDefaultInstance();
         }

         public S2C_FightRecord_9654 build() {
            S2C_FightRecord_9654 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FightRecord_9654 buildPartial() {
            S2C_FightRecord_9654 result = new S2C_FightRecord_9654(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.fightRecordId_ = this.fightRecordId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.guessRecordId_ = this.guessRecordId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.fightRecordTime_ = this.fightRecordTime_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.guessRecordTime_ = this.guessRecordTime_;
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
            if (other instanceof S2C_FightRecord_9654) {
               return this.mergeFrom((S2C_FightRecord_9654)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FightRecord_9654 other) {
            if (other == KingOfCentralPlainsMsg.S2C_FightRecord_9654.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFightRecordId()) {
                  this.setFightRecordId(other.getFightRecordId());
               }

               if (other.hasGuessRecordId()) {
                  this.setGuessRecordId(other.getGuessRecordId());
               }

               if (other.hasFightRecordTime()) {
                  this.setFightRecordTime(other.getFightRecordTime());
               }

               if (other.hasGuessRecordTime()) {
                  this.setGuessRecordTime(other.getGuessRecordTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFightRecordId()) {
               return false;
            } else if (!this.hasGuessRecordId()) {
               return false;
            } else if (!this.hasFightRecordTime()) {
               return false;
            } else {
               return this.hasGuessRecordTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FightRecord_9654 parsedMessage = null;

            try {
               parsedMessage = (S2C_FightRecord_9654)KingOfCentralPlainsMsg.S2C_FightRecord_9654.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FightRecord_9654)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFightRecordId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFightRecordId() {
            return this.fightRecordId_;
         }

         public Builder setFightRecordId(int value) {
            this.bitField0_ |= 1;
            this.fightRecordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFightRecordId() {
            this.bitField0_ &= -2;
            this.fightRecordId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGuessRecordId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getGuessRecordId() {
            return this.guessRecordId_;
         }

         public Builder setGuessRecordId(int value) {
            this.bitField0_ |= 2;
            this.guessRecordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGuessRecordId() {
            this.bitField0_ &= -3;
            this.guessRecordId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFightRecordTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getFightRecordTime() {
            return this.fightRecordTime_;
         }

         public Builder setFightRecordTime(int value) {
            this.bitField0_ |= 4;
            this.fightRecordTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFightRecordTime() {
            this.bitField0_ &= -5;
            this.fightRecordTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGuessRecordTime() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getGuessRecordTime() {
            return this.guessRecordTime_;
         }

         public Builder setGuessRecordTime(int value) {
            this.bitField0_ |= 8;
            this.guessRecordTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGuessRecordTime() {
            this.bitField0_ &= -9;
            this.guessRecordTime_ = 0;
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

   public static final class C2S_PlayerKCPSettle_9661 extends GeneratedMessageV3 implements C2S_PlayerKCPSettle_9661OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_PlayerKCPSettle_9661 DEFAULT_INSTANCE = new C2S_PlayerKCPSettle_9661();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PlayerKCPSettle_9661> PARSER = new AbstractParser<C2S_PlayerKCPSettle_9661>() {
         public C2S_PlayerKCPSettle_9661 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PlayerKCPSettle_9661(input, extensionRegistry);
         }
      };

      private C2S_PlayerKCPSettle_9661(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PlayerKCPSettle_9661() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PlayerKCPSettle_9661();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PlayerKCPSettle_9661(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_PlayerKCPSettle_9661_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_PlayerKCPSettle_9661_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PlayerKCPSettle_9661.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PlayerKCPSettle_9661)) {
            return super.equals(obj);
         } else {
            C2S_PlayerKCPSettle_9661 other = (C2S_PlayerKCPSettle_9661)obj;
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

      public static C2S_PlayerKCPSettle_9661 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PlayerKCPSettle_9661)PARSER.parseFrom(data);
      }

      public static C2S_PlayerKCPSettle_9661 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PlayerKCPSettle_9661)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PlayerKCPSettle_9661 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PlayerKCPSettle_9661)PARSER.parseFrom(data);
      }

      public static C2S_PlayerKCPSettle_9661 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PlayerKCPSettle_9661)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PlayerKCPSettle_9661 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PlayerKCPSettle_9661)PARSER.parseFrom(data);
      }

      public static C2S_PlayerKCPSettle_9661 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PlayerKCPSettle_9661)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PlayerKCPSettle_9661 parseFrom(InputStream input) throws IOException {
         return (C2S_PlayerKCPSettle_9661)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PlayerKCPSettle_9661 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PlayerKCPSettle_9661)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PlayerKCPSettle_9661 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PlayerKCPSettle_9661)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PlayerKCPSettle_9661 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PlayerKCPSettle_9661)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PlayerKCPSettle_9661 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PlayerKCPSettle_9661)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PlayerKCPSettle_9661 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PlayerKCPSettle_9661)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PlayerKCPSettle_9661 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PlayerKCPSettle_9661 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PlayerKCPSettle_9661> parser() {
         return PARSER;
      }

      public Parser<C2S_PlayerKCPSettle_9661> getParserForType() {
         return PARSER;
      }

      public C2S_PlayerKCPSettle_9661 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PlayerKCPSettle_9661OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_PlayerKCPSettle_9661_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_PlayerKCPSettle_9661_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PlayerKCPSettle_9661.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.C2S_PlayerKCPSettle_9661.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_C2S_PlayerKCPSettle_9661_descriptor;
         }

         public C2S_PlayerKCPSettle_9661 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.C2S_PlayerKCPSettle_9661.getDefaultInstance();
         }

         public C2S_PlayerKCPSettle_9661 build() {
            C2S_PlayerKCPSettle_9661 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PlayerKCPSettle_9661 buildPartial() {
            C2S_PlayerKCPSettle_9661 result = new C2S_PlayerKCPSettle_9661(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_PlayerKCPSettle_9661) {
               return this.mergeFrom((C2S_PlayerKCPSettle_9661)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PlayerKCPSettle_9661 other) {
            if (other == KingOfCentralPlainsMsg.C2S_PlayerKCPSettle_9661.getDefaultInstance()) {
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
            C2S_PlayerKCPSettle_9661 parsedMessage = null;

            try {
               parsedMessage = (C2S_PlayerKCPSettle_9661)KingOfCentralPlainsMsg.C2S_PlayerKCPSettle_9661.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PlayerKCPSettle_9661)e.getUnfinishedMessage();
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

   public static final class S2C_PlayerKCPSettle_9662 extends GeneratedMessageV3 implements S2C_PlayerKCPSettle_9662OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int FIGHT_FIELD_NUMBER = 2;
      private int fight_;
      public static final int WIN_FIELD_NUMBER = 3;
      private int win_;
      private byte memoizedIsInitialized;
      private static final S2C_PlayerKCPSettle_9662 DEFAULT_INSTANCE = new S2C_PlayerKCPSettle_9662();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PlayerKCPSettle_9662> PARSER = new AbstractParser<S2C_PlayerKCPSettle_9662>() {
         public S2C_PlayerKCPSettle_9662 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PlayerKCPSettle_9662(input, extensionRegistry);
         }
      };

      private S2C_PlayerKCPSettle_9662(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PlayerKCPSettle_9662() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PlayerKCPSettle_9662();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PlayerKCPSettle_9662(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.fight_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.win_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_PlayerKCPSettle_9662_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_PlayerKCPSettle_9662_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PlayerKCPSettle_9662.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasFight() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getFight() {
         return this.fight_;
      }

      public boolean hasWin() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getWin() {
         return this.win_;
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
            output.writeInt32(2, this.fight_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.win_);
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
               size += CodedOutputStream.computeInt32Size(2, this.fight_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.win_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PlayerKCPSettle_9662)) {
            return super.equals(obj);
         } else {
            S2C_PlayerKCPSettle_9662 other = (S2C_PlayerKCPSettle_9662)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasFight() != other.hasFight()) {
               return false;
            } else if (this.hasFight() && this.getFight() != other.getFight()) {
               return false;
            } else if (this.hasWin() != other.hasWin()) {
               return false;
            } else if (this.hasWin() && this.getWin() != other.getWin()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasFight()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getFight();
            }

            if (this.hasWin()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getWin();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PlayerKCPSettle_9662 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PlayerKCPSettle_9662)PARSER.parseFrom(data);
      }

      public static S2C_PlayerKCPSettle_9662 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PlayerKCPSettle_9662)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PlayerKCPSettle_9662 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PlayerKCPSettle_9662)PARSER.parseFrom(data);
      }

      public static S2C_PlayerKCPSettle_9662 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PlayerKCPSettle_9662)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PlayerKCPSettle_9662 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PlayerKCPSettle_9662)PARSER.parseFrom(data);
      }

      public static S2C_PlayerKCPSettle_9662 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PlayerKCPSettle_9662)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PlayerKCPSettle_9662 parseFrom(InputStream input) throws IOException {
         return (S2C_PlayerKCPSettle_9662)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PlayerKCPSettle_9662 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PlayerKCPSettle_9662)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PlayerKCPSettle_9662 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PlayerKCPSettle_9662)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PlayerKCPSettle_9662 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PlayerKCPSettle_9662)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PlayerKCPSettle_9662 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PlayerKCPSettle_9662)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PlayerKCPSettle_9662 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PlayerKCPSettle_9662)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PlayerKCPSettle_9662 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PlayerKCPSettle_9662 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PlayerKCPSettle_9662> parser() {
         return PARSER;
      }

      public Parser<S2C_PlayerKCPSettle_9662> getParserForType() {
         return PARSER;
      }

      public S2C_PlayerKCPSettle_9662 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PlayerKCPSettle_9662OrBuilder {
         private int bitField0_;
         private int rank_;
         private int fight_;
         private int win_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_PlayerKCPSettle_9662_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_PlayerKCPSettle_9662_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PlayerKCPSettle_9662.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KingOfCentralPlainsMsg.S2C_PlayerKCPSettle_9662.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.fight_ = 0;
            this.bitField0_ &= -3;
            this.win_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_PlayerKCPSettle_9662_descriptor;
         }

         public S2C_PlayerKCPSettle_9662 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.S2C_PlayerKCPSettle_9662.getDefaultInstance();
         }

         public S2C_PlayerKCPSettle_9662 build() {
            S2C_PlayerKCPSettle_9662 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PlayerKCPSettle_9662 buildPartial() {
            S2C_PlayerKCPSettle_9662 result = new S2C_PlayerKCPSettle_9662(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.fight_ = this.fight_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.win_ = this.win_;
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
            if (other instanceof S2C_PlayerKCPSettle_9662) {
               return this.mergeFrom((S2C_PlayerKCPSettle_9662)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PlayerKCPSettle_9662 other) {
            if (other == KingOfCentralPlainsMsg.S2C_PlayerKCPSettle_9662.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasFight()) {
                  this.setFight(other.getFight());
               }

               if (other.hasWin()) {
                  this.setWin(other.getWin());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRank();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PlayerKCPSettle_9662 parsedMessage = null;

            try {
               parsedMessage = (S2C_PlayerKCPSettle_9662)KingOfCentralPlainsMsg.S2C_PlayerKCPSettle_9662.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PlayerKCPSettle_9662)e.getUnfinishedMessage();
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

         public boolean hasFight() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getFight() {
            return this.fight_;
         }

         public Builder setFight(int value) {
            this.bitField0_ |= 2;
            this.fight_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFight() {
            this.bitField0_ &= -3;
            this.fight_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasWin() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getWin() {
            return this.win_;
         }

         public Builder setWin(int value) {
            this.bitField0_ |= 4;
            this.win_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWin() {
            this.bitField0_ &= -5;
            this.win_ = 0;
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

   public static final class PopRankInfo extends GeneratedMessageV3 implements PopRankInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int HEAD_FIELD_NUMBER = 2;
      private int head_;
      public static final int HEADFRAME_FIELD_NUMBER = 3;
      private int headFrame_;
      public static final int LV_FIELD_NUMBER = 4;
      private int lv_;
      public static final int NAME_FIELD_NUMBER = 5;
      private volatile Object name_;
      public static final int PRESTIGE_FIELD_NUMBER = 6;
      private int prestige_;
      public static final int MONARCHID_FIELD_NUMBER = 7;
      private int monarchid_;
      public static final int SERVERID_FIELD_NUMBER = 8;
      private int serverId_;
      public static final int PLAYERID_FIELD_NUMBER = 9;
      private int playerId_;
      private byte memoizedIsInitialized;
      private static final PopRankInfo DEFAULT_INSTANCE = new PopRankInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<PopRankInfo> PARSER = new AbstractParser<PopRankInfo>() {
         public PopRankInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new PopRankInfo(input, extensionRegistry);
         }
      };

      private PopRankInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private PopRankInfo() {
         this.memoizedIsInitialized = -1;
         this.name_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new PopRankInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private PopRankInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.head_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.headFrame_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.lv_ = input.readInt32();
                        break;
                     case 42:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 16;
                        this.name_ = bs;
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.prestige_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.monarchid_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.serverId_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_PopRankInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_PopRankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PopRankInfo.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasHead() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public boolean hasLv() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getLv() {
         return this.lv_;
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

      public boolean hasPrestige() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getPrestige() {
         return this.prestige_;
      }

      public boolean hasMonarchid() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getMonarchid() {
         return this.monarchid_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 256) != 0;
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
         } else if (!this.hasRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeadFrame()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasName()) {
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
            output.writeInt32(2, this.head_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.headFrame_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.lv_);
         }

         if ((this.bitField0_ & 16) != 0) {
            GeneratedMessageV3.writeString(output, 5, this.name_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.prestige_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.monarchid_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.serverId_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.playerId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.head_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.headFrame_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.lv_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += GeneratedMessageV3.computeStringSize(5, this.name_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.prestige_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.monarchid_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.serverId_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.playerId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof PopRankInfo)) {
            return super.equals(obj);
         } else {
            PopRankInfo other = (PopRankInfo)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
               return false;
            } else if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
               return false;
            } else if (this.hasName() != other.hasName()) {
               return false;
            } else if (this.hasName() && !this.getName().equals(other.getName())) {
               return false;
            } else if (this.hasPrestige() != other.hasPrestige()) {
               return false;
            } else if (this.hasPrestige() && this.getPrestige() != other.getPrestige()) {
               return false;
            } else if (this.hasMonarchid() != other.hasMonarchid()) {
               return false;
            } else if (this.hasMonarchid() && this.getMonarchid() != other.getMonarchid()) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
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
            if (this.hasRank()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRank();
            }

            if (this.hasHead()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasLv()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getLv();
            }

            if (this.hasName()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getName().hashCode();
            }

            if (this.hasPrestige()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getPrestige();
            }

            if (this.hasMonarchid()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getMonarchid();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getPlayerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static PopRankInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (PopRankInfo)PARSER.parseFrom(data);
      }

      public static PopRankInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PopRankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PopRankInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (PopRankInfo)PARSER.parseFrom(data);
      }

      public static PopRankInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PopRankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PopRankInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (PopRankInfo)PARSER.parseFrom(data);
      }

      public static PopRankInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PopRankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PopRankInfo parseFrom(InputStream input) throws IOException {
         return (PopRankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PopRankInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PopRankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static PopRankInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (PopRankInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static PopRankInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PopRankInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static PopRankInfo parseFrom(CodedInputStream input) throws IOException {
         return (PopRankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PopRankInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PopRankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(PopRankInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static PopRankInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<PopRankInfo> parser() {
         return PARSER;
      }

      public Parser<PopRankInfo> getParserForType() {
         return PARSER;
      }

      public PopRankInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PopRankInfoOrBuilder {
         private int bitField0_;
         private int rank_;
         private int head_;
         private int headFrame_;
         private int lv_;
         private Object name_;
         private int prestige_;
         private int monarchid_;
         private int serverId_;
         private int playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_PopRankInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_PopRankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PopRankInfo.class, Builder.class);
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
            if (KingOfCentralPlainsMsg.PopRankInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.head_ = 0;
            this.bitField0_ &= -3;
            this.headFrame_ = 0;
            this.bitField0_ &= -5;
            this.lv_ = 0;
            this.bitField0_ &= -9;
            this.name_ = "";
            this.bitField0_ &= -17;
            this.prestige_ = 0;
            this.bitField0_ &= -33;
            this.monarchid_ = 0;
            this.bitField0_ &= -65;
            this.serverId_ = 0;
            this.bitField0_ &= -129;
            this.playerId_ = 0;
            this.bitField0_ &= -257;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_PopRankInfo_descriptor;
         }

         public PopRankInfo getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.PopRankInfo.getDefaultInstance();
         }

         public PopRankInfo build() {
            PopRankInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public PopRankInfo buildPartial() {
            PopRankInfo result = new PopRankInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.head_ = this.head_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.lv_ = this.lv_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               to_bitField0_ |= 16;
            }

            result.name_ = this.name_;
            if ((from_bitField0_ & 32) != 0) {
               result.prestige_ = this.prestige_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.monarchid_ = this.monarchid_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.playerId_ = this.playerId_;
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
            if (other instanceof PopRankInfo) {
               return this.mergeFrom((PopRankInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(PopRankInfo other) {
            if (other == KingOfCentralPlainsMsg.PopRankInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               if (other.hasName()) {
                  this.bitField0_ |= 16;
                  this.name_ = other.name_;
                  this.onChanged();
               }

               if (other.hasPrestige()) {
                  this.setPrestige(other.getPrestige());
               }

               if (other.hasMonarchid()) {
                  this.setMonarchid(other.getMonarchid());
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
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
            if (!this.hasRank()) {
               return false;
            } else if (!this.hasHead()) {
               return false;
            } else if (!this.hasHeadFrame()) {
               return false;
            } else if (!this.hasLv()) {
               return false;
            } else {
               return this.hasName();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            PopRankInfo parsedMessage = null;

            try {
               parsedMessage = (PopRankInfo)KingOfCentralPlainsMsg.PopRankInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (PopRankInfo)e.getUnfinishedMessage();
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

         public boolean hasHead() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHead() {
            return this.head_;
         }

         public Builder setHead(int value) {
            this.bitField0_ |= 2;
            this.head_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHead() {
            this.bitField0_ &= -3;
            this.head_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeadFrame() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getHeadFrame() {
            return this.headFrame_;
         }

         public Builder setHeadFrame(int value) {
            this.bitField0_ |= 4;
            this.headFrame_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadFrame() {
            this.bitField0_ &= -5;
            this.headFrame_ = 0;
            this.onChanged();
            return this;
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
            this.name_ = KingOfCentralPlainsMsg.PopRankInfo.getDefaultInstance().getName();
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

         public boolean hasPrestige() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getPrestige() {
            return this.prestige_;
         }

         public Builder setPrestige(int value) {
            this.bitField0_ |= 32;
            this.prestige_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrestige() {
            this.bitField0_ &= -33;
            this.prestige_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMonarchid() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getMonarchid() {
            return this.monarchid_;
         }

         public Builder setMonarchid(int value) {
            this.bitField0_ |= 64;
            this.monarchid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMonarchid() {
            this.bitField0_ &= -65;
            this.monarchid_ = 0;
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

         public boolean hasPlayerId() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getPlayerId() {
            return this.playerId_;
         }

         public Builder setPlayerId(int value) {
            this.bitField0_ |= 256;
            this.playerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.bitField0_ &= -257;
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

   public static final class S2C_PopThreeRank_9664 extends GeneratedMessageV3 implements S2C_PopThreeRank_9664OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STARTTIME_FIELD_NUMBER = 1;
      private int startTime_;
      public static final int INFOS_FIELD_NUMBER = 2;
      private List<PopRankInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_PopThreeRank_9664 DEFAULT_INSTANCE = new S2C_PopThreeRank_9664();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PopThreeRank_9664> PARSER = new AbstractParser<S2C_PopThreeRank_9664>() {
         public S2C_PopThreeRank_9664 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PopThreeRank_9664(input, extensionRegistry);
         }
      };

      private S2C_PopThreeRank_9664(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PopThreeRank_9664() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PopThreeRank_9664();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PopThreeRank_9664(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.startTime_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.infos_.add(input.readMessage(KingOfCentralPlainsMsg.PopRankInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_PopThreeRank_9664_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_PopThreeRank_9664_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PopThreeRank_9664.class, Builder.class);
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
      }

      public List<PopRankInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends PopRankInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public PopRankInfo getInfos(int index) {
         return (PopRankInfo)this.infos_.get(index);
      }

      public PopRankInfoOrBuilder getInfosOrBuilder(int index) {
         return (PopRankInfoOrBuilder)this.infos_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStartTime()) {
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
            output.writeInt32(1, this.startTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.startTime_);
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
         } else if (!(obj instanceof S2C_PopThreeRank_9664)) {
            return super.equals(obj);
         } else {
            S2C_PopThreeRank_9664 other = (S2C_PopThreeRank_9664)obj;
            if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
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
            if (this.hasStartTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStartTime();
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

      public static S2C_PopThreeRank_9664 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PopThreeRank_9664)PARSER.parseFrom(data);
      }

      public static S2C_PopThreeRank_9664 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PopThreeRank_9664)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PopThreeRank_9664 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PopThreeRank_9664)PARSER.parseFrom(data);
      }

      public static S2C_PopThreeRank_9664 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PopThreeRank_9664)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PopThreeRank_9664 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PopThreeRank_9664)PARSER.parseFrom(data);
      }

      public static S2C_PopThreeRank_9664 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PopThreeRank_9664)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PopThreeRank_9664 parseFrom(InputStream input) throws IOException {
         return (S2C_PopThreeRank_9664)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PopThreeRank_9664 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PopThreeRank_9664)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PopThreeRank_9664 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PopThreeRank_9664)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PopThreeRank_9664 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PopThreeRank_9664)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PopThreeRank_9664 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PopThreeRank_9664)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PopThreeRank_9664 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PopThreeRank_9664)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PopThreeRank_9664 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PopThreeRank_9664 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PopThreeRank_9664> parser() {
         return PARSER;
      }

      public Parser<S2C_PopThreeRank_9664> getParserForType() {
         return PARSER;
      }

      public S2C_PopThreeRank_9664 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PopThreeRank_9664OrBuilder {
         private int bitField0_;
         private int startTime_;
         private List<PopRankInfo> infos_;
         private RepeatedFieldBuilderV3<PopRankInfo, PopRankInfo.Builder, PopRankInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_PopThreeRank_9664_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_PopThreeRank_9664_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PopThreeRank_9664.class, Builder.class);
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
            if (KingOfCentralPlainsMsg.S2C_PopThreeRank_9664.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.startTime_ = 0;
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
            return KingOfCentralPlainsMsg.internal_static_kingOfCentralPlains_com_gzbz_protobuf_S2C_PopThreeRank_9664_descriptor;
         }

         public S2C_PopThreeRank_9664 getDefaultInstanceForType() {
            return KingOfCentralPlainsMsg.S2C_PopThreeRank_9664.getDefaultInstance();
         }

         public S2C_PopThreeRank_9664 build() {
            S2C_PopThreeRank_9664 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PopThreeRank_9664 buildPartial() {
            S2C_PopThreeRank_9664 result = new S2C_PopThreeRank_9664(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.startTime_ = this.startTime_;
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
            if (other instanceof S2C_PopThreeRank_9664) {
               return this.mergeFrom((S2C_PopThreeRank_9664)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PopThreeRank_9664 other) {
            if (other == KingOfCentralPlainsMsg.S2C_PopThreeRank_9664.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
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
                     this.infosBuilder_ = KingOfCentralPlainsMsg.S2C_PopThreeRank_9664.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
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
            if (!this.hasStartTime()) {
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
            S2C_PopThreeRank_9664 parsedMessage = null;

            try {
               parsedMessage = (S2C_PopThreeRank_9664)KingOfCentralPlainsMsg.S2C_PopThreeRank_9664.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PopThreeRank_9664)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStartTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStartTime() {
            return this.startTime_;
         }

         public Builder setStartTime(int value) {
            this.bitField0_ |= 1;
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTime() {
            this.bitField0_ &= -2;
            this.startTime_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 2;
            }

         }

         public List<PopRankInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public PopRankInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (PopRankInfo)this.infos_.get(index) : (PopRankInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, PopRankInfo value) {
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

         public Builder setInfos(int index, PopRankInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(PopRankInfo value) {
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

         public Builder addInfos(int index, PopRankInfo value) {
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

         public Builder addInfos(PopRankInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, PopRankInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends PopRankInfo> values) {
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

         public PopRankInfo.Builder getInfosBuilder(int index) {
            return (PopRankInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public PopRankInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (PopRankInfoOrBuilder)this.infos_.get(index) : (PopRankInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends PopRankInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public PopRankInfo.Builder addInfosBuilder() {
            return (PopRankInfo.Builder)this.getInfosFieldBuilder().addBuilder(KingOfCentralPlainsMsg.PopRankInfo.getDefaultInstance());
         }

         public PopRankInfo.Builder addInfosBuilder(int index) {
            return (PopRankInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, KingOfCentralPlainsMsg.PopRankInfo.getDefaultInstance());
         }

         public List<PopRankInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PopRankInfo, PopRankInfo.Builder, PopRankInfoOrBuilder> getInfosFieldBuilder() {
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

   public interface C2S_ActivityState_9651OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GuessRecordAll_9619OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GuessRecord_9617OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GuessUi_9611OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Guess_9613OrBuilder extends MessageOrBuilder {
      boolean hasWagerSide();

      int getWagerSide();

      boolean hasWagerNum();

      int getWagerNum();
   }

   public interface C2S_MyFightUi_9601OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_MyRecordUi_9603OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_PlayerKCPSettle_9661OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Rank32Ui_9631OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_RankUi_9641OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_RoundAndState_9649OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SeasonTopThree_9643OrBuilder extends MessageOrBuilder {
   }

   public interface FightDataOrBuilder extends MessageOrBuilder {
      boolean hasLeftPlayerInfo();

      CommonMsg.PlayerInfo getLeftPlayerInfo();

      CommonMsg.PlayerInfoOrBuilder getLeftPlayerInfoOrBuilder();

      boolean hasRightPlayerInfo();

      CommonMsg.PlayerInfo getRightPlayerInfo();

      CommonMsg.PlayerInfoOrBuilder getRightPlayerInfoOrBuilder();

      boolean hasRecordId();

      int getRecordId();

      boolean hasWin();

      int getWin();

      boolean hasStartTime();

      int getStartTime();

      boolean hasResult();

      BattleMsg.S2C_BattleResult_6102 getResult();

      BattleMsg.S2C_BattleResult_6102OrBuilder getResultOrBuilder();
   }

   public interface FightMap32OrBuilder extends MessageOrBuilder {
      boolean hasGroup();

      int getGroup();

      List<GroupFightData> getFight32List();

      GroupFightData getFight32(int index);

      int getFight32Count();

      List<? extends GroupFightDataOrBuilder> getFight32OrBuilderList();

      GroupFightDataOrBuilder getFight32OrBuilder(int index);

      List<GroupFightData> getFight16List();

      GroupFightData getFight16(int index);

      int getFight16Count();

      List<? extends GroupFightDataOrBuilder> getFight16OrBuilderList();

      GroupFightDataOrBuilder getFight16OrBuilder(int index);

      List<GroupFightData> getFight8List();

      GroupFightData getFight8(int index);

      int getFight8Count();

      List<? extends GroupFightDataOrBuilder> getFight8OrBuilderList();

      GroupFightDataOrBuilder getFight8OrBuilder(int index);
   }

   public interface FightMap4OrBuilder extends MessageOrBuilder {
      List<GroupFightData> getFight4List();

      GroupFightData getFight4(int index);

      int getFight4Count();

      List<? extends GroupFightDataOrBuilder> getFight4OrBuilderList();

      GroupFightDataOrBuilder getFight4OrBuilder(int index);

      List<GroupFightData> getFight2List();

      GroupFightData getFight2(int index);

      int getFight2Count();

      List<? extends GroupFightDataOrBuilder> getFight2OrBuilderList();

      GroupFightDataOrBuilder getFight2OrBuilder(int index);
   }

   public interface FightRecordInfoOrBuilder extends MessageOrBuilder {
      boolean hasRond();

      int getRond();

      boolean hasLeftId();

      int getLeftId();

      boolean hasRightId();

      int getRightId();

      boolean hasLeftName();

      String getLeftName();

      ByteString getLeftNameBytes();

      boolean hasRightName();

      String getRightName();

      ByteString getRightNameBytes();

      boolean hasLeftHead();

      int getLeftHead();

      boolean hasRightHead();

      int getRightHead();

      boolean hasWin();

      int getWin();

      boolean hasSocre();

      int getSocre();

      boolean hasRecordId();

      int getRecordId();

      boolean hasStartTime();

      int getStartTime();
   }

   public interface GroupFightDataOrBuilder extends MessageOrBuilder {
      boolean hasIndex();

      int getIndex();

      boolean hasLeftName();

      String getLeftName();

      ByteString getLeftNameBytes();

      boolean hasRightName();

      String getRightName();

      ByteString getRightNameBytes();

      boolean hasRecordId();

      int getRecordId();

      boolean hasWin();

      int getWin();

      boolean hasLeftHead();

      int getLeftHead();

      boolean hasRightHead();

      int getRightHead();

      boolean hasStartTime();

      int getStartTime();

      boolean hasLeftServerId();

      int getLeftServerId();

      boolean hasLeftPlayerId();

      int getLeftPlayerId();

      boolean hasRightServerId();

      int getRightServerId();

      boolean hasRightPlayerId();

      int getRightPlayerId();
   }

   public interface GuessInfoOrBuilder extends MessageOrBuilder {
      boolean hasWagerSide();

      int getWagerSide();

      boolean hasWagerNum();

      int getWagerNum();
   }

   public interface GuessRecordInfoOrBuilder extends MessageOrBuilder {
      boolean hasRound();

      int getRound();

      boolean hasLeftId();

      int getLeftId();

      boolean hasRightId();

      int getRightId();

      boolean hasLeftName();

      String getLeftName();

      ByteString getLeftNameBytes();

      boolean hasRightName();

      String getRightName();

      ByteString getRightNameBytes();

      boolean hasLeftHead();

      int getLeftHead();

      boolean hasRightHead();

      int getRightHead();

      boolean hasWin();

      int getWin();

      boolean hasWagerName();

      String getWagerName();

      ByteString getWagerNameBytes();

      boolean hasSocre();

      int getSocre();

      boolean hasRecordId();

      int getRecordId();

      boolean hasWinNum();

      int getWinNum();

      boolean hasLeftLv();

      int getLeftLv();

      boolean hasRightLv();

      int getRightLv();

      boolean hasStartTIme();

      int getStartTIme();
   }

   public interface GuessRecordOrBuilder extends MessageOrBuilder {
      boolean hasRound();

      int getRound();

      boolean hasFight();

      FightData getFight();

      FightDataOrBuilder getFightOrBuilder();

      boolean hasWagerId();

      int getWagerId();

      boolean hasSocre();

      int getSocre();

      boolean hasWinNum();

      int getWinNum();
   }

   public interface PopRankInfoOrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasHead();

      int getHead();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasLv();

      int getLv();

      boolean hasName();

      String getName();

      ByteString getNameBytes();

      boolean hasPrestige();

      int getPrestige();

      boolean hasMonarchid();

      int getMonarchid();

      boolean hasServerId();

      int getServerId();

      boolean hasPlayerId();

      int getPlayerId();
   }

   public interface RankInfoOrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasHead();

      int getHead();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasLv();

      int getLv();

      boolean hasName();

      String getName();

      ByteString getNameBytes();

      boolean hasPower();

      long getPower();

      boolean hasThumbsNum();

      int getThumbsNum();

      boolean hasIsThumbsUp();

      boolean getIsThumbsUp();

      boolean hasSocre();

      int getSocre();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPrestige();

      int getPrestige();

      boolean hasMonarchid();

      int getMonarchid();
   }

   public interface S2C_ActivityState_9652OrBuilder extends MessageOrBuilder {
      boolean hasState();

      int getState();

      boolean hasStartTime();

      int getStartTime();

      boolean hasDownTime();

      int getDownTime();

      boolean hasIsActivityDay();

      boolean getIsActivityDay();

      boolean hasIsOpenDay();

      boolean getIsOpenDay();
   }

   public interface S2C_FightRecord_9654OrBuilder extends MessageOrBuilder {
      boolean hasFightRecordId();

      int getFightRecordId();

      boolean hasGuessRecordId();

      int getGuessRecordId();

      boolean hasFightRecordTime();

      int getFightRecordTime();

      boolean hasGuessRecordTime();

      int getGuessRecordTime();
   }

   public interface S2C_GuessPush_9616OrBuilder extends MessageOrBuilder {
      boolean hasLeftOdds();

      double getLeftOdds();

      boolean hasRightOdds();

      double getRightOdds();
   }

   public interface S2C_GuessRecordAll_9620OrBuilder extends MessageOrBuilder {
      List<GuessRecord> getInfosList();

      GuessRecord getInfos(int index);

      int getInfosCount();

      List<? extends GuessRecordOrBuilder> getInfosOrBuilderList();

      GuessRecordOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2C_GuessRecordResult_9618OrBuilder extends MessageOrBuilder {
      List<GuessRecordInfo> getInfosList();

      GuessRecordInfo getInfos(int index);

      int getInfosCount();

      List<? extends GuessRecordInfoOrBuilder> getInfosOrBuilderList();

      GuessRecordInfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2C_GuessResult_9614OrBuilder extends MessageOrBuilder {
      boolean hasLeftOdds();

      double getLeftOdds();

      boolean hasRightOdds();

      double getRightOdds();

      boolean hasWagerSide();

      int getWagerSide();

      boolean hasWagerNum();

      int getWagerNum();
   }

   public interface S2C_GuessUiResult_9612OrBuilder extends MessageOrBuilder {
      boolean hasFight();

      FightData getFight();

      FightDataOrBuilder getFightOrBuilder();

      boolean hasLeftOdds();

      double getLeftOdds();

      boolean hasRightOdds();

      double getRightOdds();

      boolean hasGuessInfo();

      GuessInfo getGuessInfo();

      GuessInfoOrBuilder getGuessInfoOrBuilder();
   }

   public interface S2C_MyFightResult_9602OrBuilder extends MessageOrBuilder {
      boolean hasFight();

      FightData getFight();

      FightDataOrBuilder getFightOrBuilder();
   }

   public interface S2C_MyRecordResult_9604OrBuilder extends MessageOrBuilder {
      List<FightRecordInfo> getInfosList();

      FightRecordInfo getInfos(int index);

      int getInfosCount();

      List<? extends FightRecordInfoOrBuilder> getInfosOrBuilderList();

      FightRecordInfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2C_PlayerKCPSettle_9662OrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasFight();

      int getFight();

      boolean hasWin();

      int getWin();
   }

   public interface S2C_PopThreeRank_9664OrBuilder extends MessageOrBuilder {
      boolean hasStartTime();

      int getStartTime();

      List<PopRankInfo> getInfosList();

      PopRankInfo getInfos(int index);

      int getInfosCount();

      List<? extends PopRankInfoOrBuilder> getInfosOrBuilderList();

      PopRankInfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2C_Rank32UiResult_9632OrBuilder extends MessageOrBuilder {
      List<FightMap32> getMap32List();

      FightMap32 getMap32(int index);

      int getMap32Count();

      List<? extends FightMap32OrBuilder> getMap32OrBuilderList();

      FightMap32OrBuilder getMap32OrBuilder(int index);

      boolean hasMap4();

      FightMap4 getMap4();

      FightMap4OrBuilder getMap4OrBuilder();
   }

   public interface S2C_RankUiResult_9642OrBuilder extends MessageOrBuilder {
      boolean hasThumbsUpNum();

      int getThumbsUpNum();

      boolean hasMyInfo();

      RankInfo getMyInfo();

      RankInfoOrBuilder getMyInfoOrBuilder();

      List<RankInfo> getInfosList();

      RankInfo getInfos(int index);

      int getInfosCount();

      List<? extends RankInfoOrBuilder> getInfosOrBuilderList();

      RankInfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2C_RoundAndState_9650OrBuilder extends MessageOrBuilder {
      boolean hasIsEnable();

      boolean getIsEnable();

      boolean hasRound();

      int getRound();

      boolean hasState();

      int getState();

      boolean hasStartTime();

      int getStartTime();

      boolean hasDownTime();

      int getDownTime();

      boolean hasNextTime();

      int getNextTime();
   }

   public interface S2C_SeasonTopThreeResult_9644OrBuilder extends MessageOrBuilder {
      boolean hasRound();

      int getRound();

      boolean hasState();

      int getState();

      boolean hasThumbsUpNum();

      int getThumbsUpNum();

      boolean hasMyInfo();

      RankInfo getMyInfo();

      RankInfoOrBuilder getMyInfoOrBuilder();

      List<RankInfo> getInfosList();

      RankInfo getInfos(int index);

      int getInfosCount();

      List<? extends RankInfoOrBuilder> getInfosOrBuilderList();

      RankInfoOrBuilder getInfosOrBuilder(int index);

      boolean hasTopRank();

      int getTopRank();

      boolean hasSeasonTime();

      String getSeasonTime();

      ByteString getSeasonTimeBytes();

      boolean hasDownTime();

      int getDownTime();
   }
}
