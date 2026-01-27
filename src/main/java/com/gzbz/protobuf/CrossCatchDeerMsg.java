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
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class CrossCatchDeerMsg {
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_MyFightUi_15401_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_MyFightUi_15401_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_MyFight_15402_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_MyFight_15402_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_MyRecordUi_15403_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_MyRecordUi_15403_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessUi_15411_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessUi_15411_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Guess_15413_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Guess_15413_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessRecord_15417_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessRecord_15417_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessRecordAll_15419_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessRecordAll_15419_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Rank32Ui_15431_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Rank32Ui_15431_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_RankUi_15441_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_RankUi_15441_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_SeasonTopThree_15443_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_SeasonTopThree_15443_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ActivityState_15451_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ActivityState_15451_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerKCPSettle_15461_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerKCPSettle_15461_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ThumbsUp_15465_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ThumbsUp_15465_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerInfo_15466_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerInfo_15466_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerInfo_15467_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerInfo_15467_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_BattleRecordData_15469_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_BattleRecordData_15469_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_CatchDeerPlayerArraying_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_CatchDeerPlayerArraying_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_NoticeGameServerUpload_15471_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_NoticeGameServerUpload_15471_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_NoticeGameServerUpload_15472_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_NoticeGameServerUpload_15472_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ActivityState_15473_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ActivityState_15473_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_ActivityState_15474_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_ActivityState_15474_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_RoundAndState_15475_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_RoundAndState_15475_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_RoundAndState_15476_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_RoundAndState_15476_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessOdds_15477_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessOdds_15477_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessOdds_15478_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessOdds_15478_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessFightRecord_15479_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessFightRecord_15479_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessFightRecord_15480_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessFightRecord_15480_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettlePlains_15481_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettlePlains_15481_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettlePlains_15482_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettlePlains_15482_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettleRank_15483_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettleRank_15483_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettleRank_15484_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettleRank_15484_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettlePrestige_15485_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettlePrestige_15485_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettlePrestige_15486_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettlePrestige_15486_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerArraying_15487_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerArraying_15487_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_ActivityPlayer_15488_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_ActivityPlayer_15488_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessSuccess_15490_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessSuccess_15490_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Gm_15499_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Gm_15499_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private CrossCatchDeerMsg() {
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
      String[] descriptorData = new String[]{"\n\u0014CrossCatchDeer.proto\u0012 crossCatchDeer.com.gzbz.protobuf\u001a\fcommon.proto\"\u0016\n\u0014S2CR_MyFightUi_15401\"\u0014\n\u0012CR2S_MyFight_15402\"\u0017\n\u0015S2CR_MyRecordUi_15403\"\u0014\n\u0012S2CR_GuessUi_15411\"7\n\u0010S2CR_Guess_15413\u0012\u0011\n\twagerSide\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bwagerNum\u0018\u0002 \u0002(\u0005\"\u0018\n\u0016S2CR_GuessRecord_15417\"\u001b\n\u0019S2CR_GuessRecordAll_15419\"\u0015\n\u0013S2CR_Rank32Ui_15431\"&\n\u0011S2CR_RankUi_15441\u0012\u0011\n\tthumbsUps\u0018\u0001 \u0003(\u0005\"U\n\u0019S2CR_SeasonTopThree_15443\u0012\u000f\n\u0007maxRank\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tthumbsUps\u0018\u0002 \u0003(\u0005\u0012\u0014\n\fisOpenServer\u0018\u0003 \u0001(\b\"0\n\u0018S2CR_ActivityState_15451\u0012\u0014\n\fisOpenServer\u0018\u0001 \u0001(\b\"\u001c\n\u001aS2CR_PlayerKCPSettle_15461\"+\n\u0013S2CR_ThumbsUp_15465\u0012\u0014\n\fbeThumbsUpId\u0018\u0001 \u0002(\u0005\"O\n\u0015CR2S_PlayerInfo_15466\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\u0014\n\fbeThumbsUpId\u0018\u0003 \u0002(\u0005\";\n\u0015S2CR_PlayerInfo_15467\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bserverId\u0018\u0002 \u0001(\u0005\"/\n\u001bS2CR_BattleRecordData_15469\u0012\u0010\n\brecordId\u0018\u0001 \u0002(\u0005\"T\n\u0017CatchDeerPlayerArraying\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005power\u0018\u0002 \u0002(\u0003\u0012\u0018\n\u0010heroArrayingData\u0018\u0003 \u0002(\f\"w\n!S2CR_NoticeGameServerUpload_15471\u0012R\n\u000fplayerArrayings\u0018\u0001 \u0003(\u000b29.crossCatchDeer.com.gzbz.protobuf.CatchDeerPlayerArraying\"F\n!CR2S_NoticeGameServerUpload_15472\u0012\u0014\n\fisMoveServer\u0018\u0001 \u0002(\b\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\"\u001a\n\u0018S2CR_ActivityState_15473\"e\n\u0018CR2S_ActivityState_15474\u0012\r\n\u0005state\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bdownTime\u0018\u0003 \u0002(\u0005\u0012\u0015\n\risActivityDay\u0018\u0004 \u0002(\b\"\u001a\n\u0018S2CR_RoundAndState_15475\"o\n\u0018CR2S_RoundAndState_15476\u0012\r\n\u0005round\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005state\u0018\u0002 \u0002(\u0005\u0012\u0011\n\tstartTime\u0018\u0003 \u0001(\u0005\u0012\u0010\n\bdownTime\u0018\u0004 \u0001(\u0005\u0012\u0010\n\bnextTime\u0018\u0005 \u0001(\u0005\"\u0016\n\u0014S2CR_GuessOdds_15477\";\n\u0014CR2S_GuessOdds_15478\u0012\u0010\n\bleftOdds\u0018\u0001 \u0002(\u0001\u0012\u0011\n\trightOdds\u0018\u0002 \u0002(\u0001\"\u001d\n\u001bS2CR_GuessFightRecord_15479\"4\n\u001bCR2S_GuessFightRecord_15480\u0012\u0015\n\rguessRecordId\u0018\u0001 \u0002(\u0005\"\u001f\n\u001dS2CR_PlayerSettlePlains_15481\"B\n\u001dCR2S_PlayerSettlePlains_15482\u0012!\n\u0006plains\u0018\u0001 \u0003(\u000b2\u0011.common.MapDataII\"\u001d\n\u001bS2CR_PlayerSettleRank_15483\">\n\u001bCR2S_PlayerSettleRank_15484\u0012\u001f\n\u0004rank\u0018\u0001 \u0003(\u000b2\u0011.common.MapDataII\"!\n\u001fS2CR_PlayerSettlePrestige_15485\"F\n\u001fCR2S_PlayerSettlePrestige_15486\u0012#\n\bprestige\u0018\u0001 \u0003(\u000b2\u0011.common.MapDataII\"-\n\u0019S2CR_PlayerArraying_15487\u0012\u0010\n\barraying\u0018\u0001 \u0002(\f\"-\n\u0019CR2S_ActivityPlayer_15488\u0012\u0010\n\bplayerId\u0018\u0001 \u0003(\u0005\",\n\u0017CR2S_GuessSuccess_15490\u0012\u0011\n\tplayerIds\u0018\u0001 \u0003(\u0005\"\u001e\n\rS2CR_Gm_15499\u0012\r\n\u0005order\u0018\u0001 \u0002(\tB(\n\u0011com.gzbz.protobufB\u0011CrossCatchDeerMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_MyFightUi_15401_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_MyFightUi_15401_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_MyFightUi_15401_descriptor, new String[0]);
      internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_MyFight_15402_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_MyFight_15402_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_MyFight_15402_descriptor, new String[0]);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_MyRecordUi_15403_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_MyRecordUi_15403_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_MyRecordUi_15403_descriptor, new String[0]);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessUi_15411_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessUi_15411_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessUi_15411_descriptor, new String[0]);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Guess_15413_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Guess_15413_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Guess_15413_descriptor, new String[]{"WagerSide", "WagerNum"});
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessRecord_15417_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessRecord_15417_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessRecord_15417_descriptor, new String[0]);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessRecordAll_15419_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessRecordAll_15419_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessRecordAll_15419_descriptor, new String[0]);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Rank32Ui_15431_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Rank32Ui_15431_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Rank32Ui_15431_descriptor, new String[0]);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_RankUi_15441_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_RankUi_15441_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_RankUi_15441_descriptor, new String[]{"ThumbsUps"});
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_SeasonTopThree_15443_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_SeasonTopThree_15443_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_SeasonTopThree_15443_descriptor, new String[]{"MaxRank", "ThumbsUps", "IsOpenServer"});
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ActivityState_15451_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ActivityState_15451_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ActivityState_15451_descriptor, new String[]{"IsOpenServer"});
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerKCPSettle_15461_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerKCPSettle_15461_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerKCPSettle_15461_descriptor, new String[0]);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ThumbsUp_15465_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ThumbsUp_15465_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ThumbsUp_15465_descriptor, new String[]{"BeThumbsUpId"});
      internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerInfo_15466_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerInfo_15466_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerInfo_15466_descriptor, new String[]{"Result", "PlayerId", "BeThumbsUpId"});
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerInfo_15467_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerInfo_15467_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerInfo_15467_descriptor, new String[]{"PlayerId", "ServerId"});
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_BattleRecordData_15469_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_BattleRecordData_15469_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_BattleRecordData_15469_descriptor, new String[]{"RecordId"});
      internal_static_crossCatchDeer_com_gzbz_protobuf_CatchDeerPlayerArraying_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_crossCatchDeer_com_gzbz_protobuf_CatchDeerPlayerArraying_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_CatchDeerPlayerArraying_descriptor, new String[]{"PlayerId", "Power", "HeroArrayingData"});
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_NoticeGameServerUpload_15471_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_NoticeGameServerUpload_15471_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_NoticeGameServerUpload_15471_descriptor, new String[]{"PlayerArrayings"});
      internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_NoticeGameServerUpload_15472_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_NoticeGameServerUpload_15472_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_NoticeGameServerUpload_15472_descriptor, new String[]{"IsMoveServer", "Num"});
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ActivityState_15473_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ActivityState_15473_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ActivityState_15473_descriptor, new String[0]);
      internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_ActivityState_15474_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_ActivityState_15474_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_ActivityState_15474_descriptor, new String[]{"State", "StartTime", "DownTime", "IsActivityDay"});
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_RoundAndState_15475_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_RoundAndState_15475_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_RoundAndState_15475_descriptor, new String[0]);
      internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_RoundAndState_15476_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_RoundAndState_15476_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_RoundAndState_15476_descriptor, new String[]{"Round", "State", "StartTime", "DownTime", "NextTime"});
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessOdds_15477_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessOdds_15477_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessOdds_15477_descriptor, new String[0]);
      internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessOdds_15478_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessOdds_15478_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessOdds_15478_descriptor, new String[]{"LeftOdds", "RightOdds"});
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessFightRecord_15479_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessFightRecord_15479_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessFightRecord_15479_descriptor, new String[0]);
      internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessFightRecord_15480_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessFightRecord_15480_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessFightRecord_15480_descriptor, new String[]{"GuessRecordId"});
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettlePlains_15481_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettlePlains_15481_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettlePlains_15481_descriptor, new String[0]);
      internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettlePlains_15482_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettlePlains_15482_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettlePlains_15482_descriptor, new String[]{"Plains"});
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettleRank_15483_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettleRank_15483_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettleRank_15483_descriptor, new String[0]);
      internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettleRank_15484_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettleRank_15484_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettleRank_15484_descriptor, new String[]{"Rank"});
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettlePrestige_15485_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettlePrestige_15485_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettlePrestige_15485_descriptor, new String[0]);
      internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettlePrestige_15486_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettlePrestige_15486_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettlePrestige_15486_descriptor, new String[]{"Prestige"});
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerArraying_15487_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerArraying_15487_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerArraying_15487_descriptor, new String[]{"Arraying"});
      internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_ActivityPlayer_15488_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_ActivityPlayer_15488_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_ActivityPlayer_15488_descriptor, new String[]{"PlayerId"});
      internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessSuccess_15490_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(35);
      internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessSuccess_15490_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessSuccess_15490_descriptor, new String[]{"PlayerIds"});
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Gm_15499_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(36);
      internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Gm_15499_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Gm_15499_descriptor, new String[]{"Order"});
      CommonMsg.getDescriptor();
   }

   public static final class S2CR_MyFightUi_15401 extends GeneratedMessageV3 implements S2CR_MyFightUi_15401OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_MyFightUi_15401 DEFAULT_INSTANCE = new S2CR_MyFightUi_15401();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_MyFightUi_15401> PARSER = new AbstractParser<S2CR_MyFightUi_15401>() {
         public S2CR_MyFightUi_15401 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_MyFightUi_15401(input, extensionRegistry);
         }
      };

      private S2CR_MyFightUi_15401(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_MyFightUi_15401() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_MyFightUi_15401();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_MyFightUi_15401(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_MyFightUi_15401_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_MyFightUi_15401_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MyFightUi_15401.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_MyFightUi_15401)) {
            return super.equals(obj);
         } else {
            S2CR_MyFightUi_15401 other = (S2CR_MyFightUi_15401)obj;
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

      public static S2CR_MyFightUi_15401 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_MyFightUi_15401)PARSER.parseFrom(data);
      }

      public static S2CR_MyFightUi_15401 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MyFightUi_15401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MyFightUi_15401 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_MyFightUi_15401)PARSER.parseFrom(data);
      }

      public static S2CR_MyFightUi_15401 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MyFightUi_15401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MyFightUi_15401 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_MyFightUi_15401)PARSER.parseFrom(data);
      }

      public static S2CR_MyFightUi_15401 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MyFightUi_15401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MyFightUi_15401 parseFrom(InputStream input) throws IOException {
         return (S2CR_MyFightUi_15401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MyFightUi_15401 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MyFightUi_15401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MyFightUi_15401 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_MyFightUi_15401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_MyFightUi_15401 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MyFightUi_15401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MyFightUi_15401 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_MyFightUi_15401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MyFightUi_15401 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MyFightUi_15401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_MyFightUi_15401 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_MyFightUi_15401 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_MyFightUi_15401> parser() {
         return PARSER;
      }

      public Parser<S2CR_MyFightUi_15401> getParserForType() {
         return PARSER;
      }

      public S2CR_MyFightUi_15401 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_MyFightUi_15401OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_MyFightUi_15401_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_MyFightUi_15401_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MyFightUi_15401.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.S2CR_MyFightUi_15401.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_MyFightUi_15401_descriptor;
         }

         public S2CR_MyFightUi_15401 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.S2CR_MyFightUi_15401.getDefaultInstance();
         }

         public S2CR_MyFightUi_15401 build() {
            S2CR_MyFightUi_15401 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_MyFightUi_15401 buildPartial() {
            S2CR_MyFightUi_15401 result = new S2CR_MyFightUi_15401(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_MyFightUi_15401) {
               return this.mergeFrom((S2CR_MyFightUi_15401)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_MyFightUi_15401 other) {
            if (other == CrossCatchDeerMsg.S2CR_MyFightUi_15401.getDefaultInstance()) {
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
            S2CR_MyFightUi_15401 parsedMessage = null;

            try {
               parsedMessage = (S2CR_MyFightUi_15401)CrossCatchDeerMsg.S2CR_MyFightUi_15401.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_MyFightUi_15401)e.getUnfinishedMessage();
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

   public static final class CR2S_MyFight_15402 extends GeneratedMessageV3 implements CR2S_MyFight_15402OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final CR2S_MyFight_15402 DEFAULT_INSTANCE = new CR2S_MyFight_15402();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_MyFight_15402> PARSER = new AbstractParser<CR2S_MyFight_15402>() {
         public CR2S_MyFight_15402 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_MyFight_15402(input, extensionRegistry);
         }
      };

      private CR2S_MyFight_15402(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_MyFight_15402() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_MyFight_15402();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_MyFight_15402(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_MyFight_15402_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_MyFight_15402_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_MyFight_15402.class, Builder.class);
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
         } else if (!(obj instanceof CR2S_MyFight_15402)) {
            return super.equals(obj);
         } else {
            CR2S_MyFight_15402 other = (CR2S_MyFight_15402)obj;
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

      public static CR2S_MyFight_15402 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_MyFight_15402)PARSER.parseFrom(data);
      }

      public static CR2S_MyFight_15402 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_MyFight_15402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_MyFight_15402 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_MyFight_15402)PARSER.parseFrom(data);
      }

      public static CR2S_MyFight_15402 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_MyFight_15402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_MyFight_15402 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_MyFight_15402)PARSER.parseFrom(data);
      }

      public static CR2S_MyFight_15402 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_MyFight_15402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_MyFight_15402 parseFrom(InputStream input) throws IOException {
         return (CR2S_MyFight_15402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_MyFight_15402 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_MyFight_15402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_MyFight_15402 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_MyFight_15402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_MyFight_15402 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_MyFight_15402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_MyFight_15402 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_MyFight_15402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_MyFight_15402 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_MyFight_15402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_MyFight_15402 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_MyFight_15402 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_MyFight_15402> parser() {
         return PARSER;
      }

      public Parser<CR2S_MyFight_15402> getParserForType() {
         return PARSER;
      }

      public CR2S_MyFight_15402 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_MyFight_15402OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_MyFight_15402_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_MyFight_15402_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_MyFight_15402.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.CR2S_MyFight_15402.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_MyFight_15402_descriptor;
         }

         public CR2S_MyFight_15402 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.CR2S_MyFight_15402.getDefaultInstance();
         }

         public CR2S_MyFight_15402 build() {
            CR2S_MyFight_15402 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_MyFight_15402 buildPartial() {
            CR2S_MyFight_15402 result = new CR2S_MyFight_15402(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_MyFight_15402) {
               return this.mergeFrom((CR2S_MyFight_15402)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_MyFight_15402 other) {
            if (other == CrossCatchDeerMsg.CR2S_MyFight_15402.getDefaultInstance()) {
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
            CR2S_MyFight_15402 parsedMessage = null;

            try {
               parsedMessage = (CR2S_MyFight_15402)CrossCatchDeerMsg.CR2S_MyFight_15402.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_MyFight_15402)e.getUnfinishedMessage();
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

   public static final class S2CR_MyRecordUi_15403 extends GeneratedMessageV3 implements S2CR_MyRecordUi_15403OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_MyRecordUi_15403 DEFAULT_INSTANCE = new S2CR_MyRecordUi_15403();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_MyRecordUi_15403> PARSER = new AbstractParser<S2CR_MyRecordUi_15403>() {
         public S2CR_MyRecordUi_15403 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_MyRecordUi_15403(input, extensionRegistry);
         }
      };

      private S2CR_MyRecordUi_15403(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_MyRecordUi_15403() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_MyRecordUi_15403();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_MyRecordUi_15403(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_MyRecordUi_15403_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_MyRecordUi_15403_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MyRecordUi_15403.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_MyRecordUi_15403)) {
            return super.equals(obj);
         } else {
            S2CR_MyRecordUi_15403 other = (S2CR_MyRecordUi_15403)obj;
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

      public static S2CR_MyRecordUi_15403 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_MyRecordUi_15403)PARSER.parseFrom(data);
      }

      public static S2CR_MyRecordUi_15403 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MyRecordUi_15403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MyRecordUi_15403 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_MyRecordUi_15403)PARSER.parseFrom(data);
      }

      public static S2CR_MyRecordUi_15403 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MyRecordUi_15403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MyRecordUi_15403 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_MyRecordUi_15403)PARSER.parseFrom(data);
      }

      public static S2CR_MyRecordUi_15403 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MyRecordUi_15403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MyRecordUi_15403 parseFrom(InputStream input) throws IOException {
         return (S2CR_MyRecordUi_15403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MyRecordUi_15403 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MyRecordUi_15403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MyRecordUi_15403 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_MyRecordUi_15403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_MyRecordUi_15403 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MyRecordUi_15403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MyRecordUi_15403 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_MyRecordUi_15403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MyRecordUi_15403 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MyRecordUi_15403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_MyRecordUi_15403 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_MyRecordUi_15403 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_MyRecordUi_15403> parser() {
         return PARSER;
      }

      public Parser<S2CR_MyRecordUi_15403> getParserForType() {
         return PARSER;
      }

      public S2CR_MyRecordUi_15403 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_MyRecordUi_15403OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_MyRecordUi_15403_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_MyRecordUi_15403_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MyRecordUi_15403.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.S2CR_MyRecordUi_15403.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_MyRecordUi_15403_descriptor;
         }

         public S2CR_MyRecordUi_15403 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.S2CR_MyRecordUi_15403.getDefaultInstance();
         }

         public S2CR_MyRecordUi_15403 build() {
            S2CR_MyRecordUi_15403 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_MyRecordUi_15403 buildPartial() {
            S2CR_MyRecordUi_15403 result = new S2CR_MyRecordUi_15403(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_MyRecordUi_15403) {
               return this.mergeFrom((S2CR_MyRecordUi_15403)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_MyRecordUi_15403 other) {
            if (other == CrossCatchDeerMsg.S2CR_MyRecordUi_15403.getDefaultInstance()) {
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
            S2CR_MyRecordUi_15403 parsedMessage = null;

            try {
               parsedMessage = (S2CR_MyRecordUi_15403)CrossCatchDeerMsg.S2CR_MyRecordUi_15403.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_MyRecordUi_15403)e.getUnfinishedMessage();
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

   public static final class S2CR_GuessUi_15411 extends GeneratedMessageV3 implements S2CR_GuessUi_15411OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_GuessUi_15411 DEFAULT_INSTANCE = new S2CR_GuessUi_15411();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_GuessUi_15411> PARSER = new AbstractParser<S2CR_GuessUi_15411>() {
         public S2CR_GuessUi_15411 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_GuessUi_15411(input, extensionRegistry);
         }
      };

      private S2CR_GuessUi_15411(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_GuessUi_15411() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_GuessUi_15411();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_GuessUi_15411(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessUi_15411_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessUi_15411_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GuessUi_15411.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_GuessUi_15411)) {
            return super.equals(obj);
         } else {
            S2CR_GuessUi_15411 other = (S2CR_GuessUi_15411)obj;
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

      public static S2CR_GuessUi_15411 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_GuessUi_15411)PARSER.parseFrom(data);
      }

      public static S2CR_GuessUi_15411 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GuessUi_15411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GuessUi_15411 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_GuessUi_15411)PARSER.parseFrom(data);
      }

      public static S2CR_GuessUi_15411 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GuessUi_15411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GuessUi_15411 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_GuessUi_15411)PARSER.parseFrom(data);
      }

      public static S2CR_GuessUi_15411 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GuessUi_15411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GuessUi_15411 parseFrom(InputStream input) throws IOException {
         return (S2CR_GuessUi_15411)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GuessUi_15411 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GuessUi_15411)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GuessUi_15411 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_GuessUi_15411)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_GuessUi_15411 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GuessUi_15411)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GuessUi_15411 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_GuessUi_15411)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GuessUi_15411 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GuessUi_15411)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_GuessUi_15411 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_GuessUi_15411 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_GuessUi_15411> parser() {
         return PARSER;
      }

      public Parser<S2CR_GuessUi_15411> getParserForType() {
         return PARSER;
      }

      public S2CR_GuessUi_15411 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_GuessUi_15411OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessUi_15411_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessUi_15411_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GuessUi_15411.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.S2CR_GuessUi_15411.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessUi_15411_descriptor;
         }

         public S2CR_GuessUi_15411 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.S2CR_GuessUi_15411.getDefaultInstance();
         }

         public S2CR_GuessUi_15411 build() {
            S2CR_GuessUi_15411 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_GuessUi_15411 buildPartial() {
            S2CR_GuessUi_15411 result = new S2CR_GuessUi_15411(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_GuessUi_15411) {
               return this.mergeFrom((S2CR_GuessUi_15411)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_GuessUi_15411 other) {
            if (other == CrossCatchDeerMsg.S2CR_GuessUi_15411.getDefaultInstance()) {
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
            S2CR_GuessUi_15411 parsedMessage = null;

            try {
               parsedMessage = (S2CR_GuessUi_15411)CrossCatchDeerMsg.S2CR_GuessUi_15411.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_GuessUi_15411)e.getUnfinishedMessage();
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

   public static final class S2CR_Guess_15413 extends GeneratedMessageV3 implements S2CR_Guess_15413OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int WAGERSIDE_FIELD_NUMBER = 1;
      private int wagerSide_;
      public static final int WAGERNUM_FIELD_NUMBER = 2;
      private int wagerNum_;
      private byte memoizedIsInitialized;
      private static final S2CR_Guess_15413 DEFAULT_INSTANCE = new S2CR_Guess_15413();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Guess_15413> PARSER = new AbstractParser<S2CR_Guess_15413>() {
         public S2CR_Guess_15413 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Guess_15413(input, extensionRegistry);
         }
      };

      private S2CR_Guess_15413(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Guess_15413() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Guess_15413();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Guess_15413(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Guess_15413_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Guess_15413_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Guess_15413.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_Guess_15413)) {
            return super.equals(obj);
         } else {
            S2CR_Guess_15413 other = (S2CR_Guess_15413)obj;
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

      public static S2CR_Guess_15413 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Guess_15413)PARSER.parseFrom(data);
      }

      public static S2CR_Guess_15413 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Guess_15413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Guess_15413 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Guess_15413)PARSER.parseFrom(data);
      }

      public static S2CR_Guess_15413 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Guess_15413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Guess_15413 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Guess_15413)PARSER.parseFrom(data);
      }

      public static S2CR_Guess_15413 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Guess_15413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Guess_15413 parseFrom(InputStream input) throws IOException {
         return (S2CR_Guess_15413)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Guess_15413 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Guess_15413)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Guess_15413 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Guess_15413)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Guess_15413 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Guess_15413)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Guess_15413 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Guess_15413)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Guess_15413 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Guess_15413)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Guess_15413 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Guess_15413 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Guess_15413> parser() {
         return PARSER;
      }

      public Parser<S2CR_Guess_15413> getParserForType() {
         return PARSER;
      }

      public S2CR_Guess_15413 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Guess_15413OrBuilder {
         private int bitField0_;
         private int wagerSide_;
         private int wagerNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Guess_15413_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Guess_15413_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Guess_15413.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.S2CR_Guess_15413.alwaysUseFieldBuilders) {
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
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Guess_15413_descriptor;
         }

         public S2CR_Guess_15413 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.S2CR_Guess_15413.getDefaultInstance();
         }

         public S2CR_Guess_15413 build() {
            S2CR_Guess_15413 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Guess_15413 buildPartial() {
            S2CR_Guess_15413 result = new S2CR_Guess_15413(this);
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
            if (other instanceof S2CR_Guess_15413) {
               return this.mergeFrom((S2CR_Guess_15413)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Guess_15413 other) {
            if (other == CrossCatchDeerMsg.S2CR_Guess_15413.getDefaultInstance()) {
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
            S2CR_Guess_15413 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Guess_15413)CrossCatchDeerMsg.S2CR_Guess_15413.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Guess_15413)e.getUnfinishedMessage();
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

   public static final class S2CR_GuessRecord_15417 extends GeneratedMessageV3 implements S2CR_GuessRecord_15417OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_GuessRecord_15417 DEFAULT_INSTANCE = new S2CR_GuessRecord_15417();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_GuessRecord_15417> PARSER = new AbstractParser<S2CR_GuessRecord_15417>() {
         public S2CR_GuessRecord_15417 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_GuessRecord_15417(input, extensionRegistry);
         }
      };

      private S2CR_GuessRecord_15417(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_GuessRecord_15417() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_GuessRecord_15417();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_GuessRecord_15417(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessRecord_15417_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessRecord_15417_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GuessRecord_15417.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_GuessRecord_15417)) {
            return super.equals(obj);
         } else {
            S2CR_GuessRecord_15417 other = (S2CR_GuessRecord_15417)obj;
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

      public static S2CR_GuessRecord_15417 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_GuessRecord_15417)PARSER.parseFrom(data);
      }

      public static S2CR_GuessRecord_15417 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GuessRecord_15417)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GuessRecord_15417 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_GuessRecord_15417)PARSER.parseFrom(data);
      }

      public static S2CR_GuessRecord_15417 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GuessRecord_15417)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GuessRecord_15417 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_GuessRecord_15417)PARSER.parseFrom(data);
      }

      public static S2CR_GuessRecord_15417 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GuessRecord_15417)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GuessRecord_15417 parseFrom(InputStream input) throws IOException {
         return (S2CR_GuessRecord_15417)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GuessRecord_15417 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GuessRecord_15417)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GuessRecord_15417 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_GuessRecord_15417)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_GuessRecord_15417 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GuessRecord_15417)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GuessRecord_15417 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_GuessRecord_15417)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GuessRecord_15417 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GuessRecord_15417)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_GuessRecord_15417 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_GuessRecord_15417 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_GuessRecord_15417> parser() {
         return PARSER;
      }

      public Parser<S2CR_GuessRecord_15417> getParserForType() {
         return PARSER;
      }

      public S2CR_GuessRecord_15417 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_GuessRecord_15417OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessRecord_15417_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessRecord_15417_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GuessRecord_15417.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.S2CR_GuessRecord_15417.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessRecord_15417_descriptor;
         }

         public S2CR_GuessRecord_15417 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.S2CR_GuessRecord_15417.getDefaultInstance();
         }

         public S2CR_GuessRecord_15417 build() {
            S2CR_GuessRecord_15417 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_GuessRecord_15417 buildPartial() {
            S2CR_GuessRecord_15417 result = new S2CR_GuessRecord_15417(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_GuessRecord_15417) {
               return this.mergeFrom((S2CR_GuessRecord_15417)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_GuessRecord_15417 other) {
            if (other == CrossCatchDeerMsg.S2CR_GuessRecord_15417.getDefaultInstance()) {
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
            S2CR_GuessRecord_15417 parsedMessage = null;

            try {
               parsedMessage = (S2CR_GuessRecord_15417)CrossCatchDeerMsg.S2CR_GuessRecord_15417.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_GuessRecord_15417)e.getUnfinishedMessage();
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

   public static final class S2CR_GuessRecordAll_15419 extends GeneratedMessageV3 implements S2CR_GuessRecordAll_15419OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_GuessRecordAll_15419 DEFAULT_INSTANCE = new S2CR_GuessRecordAll_15419();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_GuessRecordAll_15419> PARSER = new AbstractParser<S2CR_GuessRecordAll_15419>() {
         public S2CR_GuessRecordAll_15419 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_GuessRecordAll_15419(input, extensionRegistry);
         }
      };

      private S2CR_GuessRecordAll_15419(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_GuessRecordAll_15419() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_GuessRecordAll_15419();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_GuessRecordAll_15419(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessRecordAll_15419_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessRecordAll_15419_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GuessRecordAll_15419.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_GuessRecordAll_15419)) {
            return super.equals(obj);
         } else {
            S2CR_GuessRecordAll_15419 other = (S2CR_GuessRecordAll_15419)obj;
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

      public static S2CR_GuessRecordAll_15419 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_GuessRecordAll_15419)PARSER.parseFrom(data);
      }

      public static S2CR_GuessRecordAll_15419 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GuessRecordAll_15419)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GuessRecordAll_15419 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_GuessRecordAll_15419)PARSER.parseFrom(data);
      }

      public static S2CR_GuessRecordAll_15419 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GuessRecordAll_15419)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GuessRecordAll_15419 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_GuessRecordAll_15419)PARSER.parseFrom(data);
      }

      public static S2CR_GuessRecordAll_15419 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GuessRecordAll_15419)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GuessRecordAll_15419 parseFrom(InputStream input) throws IOException {
         return (S2CR_GuessRecordAll_15419)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GuessRecordAll_15419 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GuessRecordAll_15419)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GuessRecordAll_15419 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_GuessRecordAll_15419)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_GuessRecordAll_15419 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GuessRecordAll_15419)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GuessRecordAll_15419 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_GuessRecordAll_15419)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GuessRecordAll_15419 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GuessRecordAll_15419)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_GuessRecordAll_15419 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_GuessRecordAll_15419 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_GuessRecordAll_15419> parser() {
         return PARSER;
      }

      public Parser<S2CR_GuessRecordAll_15419> getParserForType() {
         return PARSER;
      }

      public S2CR_GuessRecordAll_15419 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_GuessRecordAll_15419OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessRecordAll_15419_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessRecordAll_15419_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GuessRecordAll_15419.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.S2CR_GuessRecordAll_15419.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessRecordAll_15419_descriptor;
         }

         public S2CR_GuessRecordAll_15419 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.S2CR_GuessRecordAll_15419.getDefaultInstance();
         }

         public S2CR_GuessRecordAll_15419 build() {
            S2CR_GuessRecordAll_15419 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_GuessRecordAll_15419 buildPartial() {
            S2CR_GuessRecordAll_15419 result = new S2CR_GuessRecordAll_15419(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_GuessRecordAll_15419) {
               return this.mergeFrom((S2CR_GuessRecordAll_15419)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_GuessRecordAll_15419 other) {
            if (other == CrossCatchDeerMsg.S2CR_GuessRecordAll_15419.getDefaultInstance()) {
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
            S2CR_GuessRecordAll_15419 parsedMessage = null;

            try {
               parsedMessage = (S2CR_GuessRecordAll_15419)CrossCatchDeerMsg.S2CR_GuessRecordAll_15419.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_GuessRecordAll_15419)e.getUnfinishedMessage();
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

   public static final class S2CR_Rank32Ui_15431 extends GeneratedMessageV3 implements S2CR_Rank32Ui_15431OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_Rank32Ui_15431 DEFAULT_INSTANCE = new S2CR_Rank32Ui_15431();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Rank32Ui_15431> PARSER = new AbstractParser<S2CR_Rank32Ui_15431>() {
         public S2CR_Rank32Ui_15431 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Rank32Ui_15431(input, extensionRegistry);
         }
      };

      private S2CR_Rank32Ui_15431(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Rank32Ui_15431() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Rank32Ui_15431();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Rank32Ui_15431(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Rank32Ui_15431_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Rank32Ui_15431_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Rank32Ui_15431.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_Rank32Ui_15431)) {
            return super.equals(obj);
         } else {
            S2CR_Rank32Ui_15431 other = (S2CR_Rank32Ui_15431)obj;
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

      public static S2CR_Rank32Ui_15431 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Rank32Ui_15431)PARSER.parseFrom(data);
      }

      public static S2CR_Rank32Ui_15431 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Rank32Ui_15431)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Rank32Ui_15431 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Rank32Ui_15431)PARSER.parseFrom(data);
      }

      public static S2CR_Rank32Ui_15431 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Rank32Ui_15431)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Rank32Ui_15431 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Rank32Ui_15431)PARSER.parseFrom(data);
      }

      public static S2CR_Rank32Ui_15431 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Rank32Ui_15431)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Rank32Ui_15431 parseFrom(InputStream input) throws IOException {
         return (S2CR_Rank32Ui_15431)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Rank32Ui_15431 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Rank32Ui_15431)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Rank32Ui_15431 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Rank32Ui_15431)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Rank32Ui_15431 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Rank32Ui_15431)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Rank32Ui_15431 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Rank32Ui_15431)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Rank32Ui_15431 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Rank32Ui_15431)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Rank32Ui_15431 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Rank32Ui_15431 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Rank32Ui_15431> parser() {
         return PARSER;
      }

      public Parser<S2CR_Rank32Ui_15431> getParserForType() {
         return PARSER;
      }

      public S2CR_Rank32Ui_15431 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Rank32Ui_15431OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Rank32Ui_15431_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Rank32Ui_15431_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Rank32Ui_15431.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.S2CR_Rank32Ui_15431.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Rank32Ui_15431_descriptor;
         }

         public S2CR_Rank32Ui_15431 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.S2CR_Rank32Ui_15431.getDefaultInstance();
         }

         public S2CR_Rank32Ui_15431 build() {
            S2CR_Rank32Ui_15431 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Rank32Ui_15431 buildPartial() {
            S2CR_Rank32Ui_15431 result = new S2CR_Rank32Ui_15431(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_Rank32Ui_15431) {
               return this.mergeFrom((S2CR_Rank32Ui_15431)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Rank32Ui_15431 other) {
            if (other == CrossCatchDeerMsg.S2CR_Rank32Ui_15431.getDefaultInstance()) {
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
            S2CR_Rank32Ui_15431 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Rank32Ui_15431)CrossCatchDeerMsg.S2CR_Rank32Ui_15431.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Rank32Ui_15431)e.getUnfinishedMessage();
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

   public static final class S2CR_RankUi_15441 extends GeneratedMessageV3 implements S2CR_RankUi_15441OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int THUMBSUPS_FIELD_NUMBER = 1;
      private Internal.IntList thumbsUps_;
      private byte memoizedIsInitialized;
      private static final S2CR_RankUi_15441 DEFAULT_INSTANCE = new S2CR_RankUi_15441();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_RankUi_15441> PARSER = new AbstractParser<S2CR_RankUi_15441>() {
         public S2CR_RankUi_15441 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_RankUi_15441(input, extensionRegistry);
         }
      };

      private S2CR_RankUi_15441(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_RankUi_15441() {
         this.memoizedIsInitialized = -1;
         this.thumbsUps_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_RankUi_15441();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_RankUi_15441(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                           this.thumbsUps_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.thumbsUps_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.thumbsUps_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.thumbsUps_.addInt(input.readInt32());
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
                  this.thumbsUps_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_RankUi_15441_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_RankUi_15441_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_RankUi_15441.class, Builder.class);
      }

      public List<Integer> getThumbsUpsList() {
         return this.thumbsUps_;
      }

      public int getThumbsUpsCount() {
         return this.thumbsUps_.size();
      }

      public int getThumbsUps(int index) {
         return this.thumbsUps_.getInt(index);
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
         for(int i = 0; i < this.thumbsUps_.size(); ++i) {
            output.writeInt32(1, this.thumbsUps_.getInt(i));
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

            for(int i = 0; i < this.thumbsUps_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.thumbsUps_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getThumbsUpsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_RankUi_15441)) {
            return super.equals(obj);
         } else {
            S2CR_RankUi_15441 other = (S2CR_RankUi_15441)obj;
            if (!this.getThumbsUpsList().equals(other.getThumbsUpsList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getThumbsUpsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getThumbsUpsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_RankUi_15441 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_RankUi_15441)PARSER.parseFrom(data);
      }

      public static S2CR_RankUi_15441 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RankUi_15441)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RankUi_15441 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_RankUi_15441)PARSER.parseFrom(data);
      }

      public static S2CR_RankUi_15441 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RankUi_15441)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RankUi_15441 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_RankUi_15441)PARSER.parseFrom(data);
      }

      public static S2CR_RankUi_15441 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RankUi_15441)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RankUi_15441 parseFrom(InputStream input) throws IOException {
         return (S2CR_RankUi_15441)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_RankUi_15441 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RankUi_15441)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_RankUi_15441 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_RankUi_15441)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_RankUi_15441 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RankUi_15441)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_RankUi_15441 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_RankUi_15441)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_RankUi_15441 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RankUi_15441)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_RankUi_15441 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_RankUi_15441 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_RankUi_15441> parser() {
         return PARSER;
      }

      public Parser<S2CR_RankUi_15441> getParserForType() {
         return PARSER;
      }

      public S2CR_RankUi_15441 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_RankUi_15441OrBuilder {
         private int bitField0_;
         private Internal.IntList thumbsUps_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_RankUi_15441_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_RankUi_15441_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_RankUi_15441.class, Builder.class);
         }

         private Builder() {
            this.thumbsUps_ = CrossCatchDeerMsg.S2CR_RankUi_15441.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.thumbsUps_ = CrossCatchDeerMsg.S2CR_RankUi_15441.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.S2CR_RankUi_15441.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.thumbsUps_ = CrossCatchDeerMsg.S2CR_RankUi_15441.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_RankUi_15441_descriptor;
         }

         public S2CR_RankUi_15441 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.S2CR_RankUi_15441.getDefaultInstance();
         }

         public S2CR_RankUi_15441 build() {
            S2CR_RankUi_15441 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_RankUi_15441 buildPartial() {
            S2CR_RankUi_15441 result = new S2CR_RankUi_15441(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.thumbsUps_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.thumbsUps_ = this.thumbsUps_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_RankUi_15441) {
               return this.mergeFrom((S2CR_RankUi_15441)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_RankUi_15441 other) {
            if (other == CrossCatchDeerMsg.S2CR_RankUi_15441.getDefaultInstance()) {
               return this;
            } else {
               if (!other.thumbsUps_.isEmpty()) {
                  if (this.thumbsUps_.isEmpty()) {
                     this.thumbsUps_ = other.thumbsUps_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureThumbsUpsIsMutable();
                     this.thumbsUps_.addAll(other.thumbsUps_);
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
            S2CR_RankUi_15441 parsedMessage = null;

            try {
               parsedMessage = (S2CR_RankUi_15441)CrossCatchDeerMsg.S2CR_RankUi_15441.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_RankUi_15441)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureThumbsUpsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.thumbsUps_ = CrossCatchDeerMsg.S2CR_RankUi_15441.mutableCopy(this.thumbsUps_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getThumbsUpsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.thumbsUps_) : this.thumbsUps_);
         }

         public int getThumbsUpsCount() {
            return this.thumbsUps_.size();
         }

         public int getThumbsUps(int index) {
            return this.thumbsUps_.getInt(index);
         }

         public Builder setThumbsUps(int index, int value) {
            this.ensureThumbsUpsIsMutable();
            this.thumbsUps_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addThumbsUps(int value) {
            this.ensureThumbsUpsIsMutable();
            this.thumbsUps_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllThumbsUps(Iterable<? extends Integer> values) {
            this.ensureThumbsUpsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.thumbsUps_);
            this.onChanged();
            return this;
         }

         public Builder clearThumbsUps() {
            this.thumbsUps_ = CrossCatchDeerMsg.S2CR_RankUi_15441.emptyIntList();
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

   public static final class S2CR_SeasonTopThree_15443 extends GeneratedMessageV3 implements S2CR_SeasonTopThree_15443OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MAXRANK_FIELD_NUMBER = 1;
      private int maxRank_;
      public static final int THUMBSUPS_FIELD_NUMBER = 2;
      private Internal.IntList thumbsUps_;
      public static final int ISOPENSERVER_FIELD_NUMBER = 3;
      private boolean isOpenServer_;
      private byte memoizedIsInitialized;
      private static final S2CR_SeasonTopThree_15443 DEFAULT_INSTANCE = new S2CR_SeasonTopThree_15443();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_SeasonTopThree_15443> PARSER = new AbstractParser<S2CR_SeasonTopThree_15443>() {
         public S2CR_SeasonTopThree_15443 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_SeasonTopThree_15443(input, extensionRegistry);
         }
      };

      private S2CR_SeasonTopThree_15443(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_SeasonTopThree_15443() {
         this.memoizedIsInitialized = -1;
         this.thumbsUps_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_SeasonTopThree_15443();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_SeasonTopThree_15443(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.maxRank_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.thumbsUps_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.thumbsUps_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.thumbsUps_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.isOpenServer_ = input.readBool();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.thumbsUps_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.thumbsUps_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_SeasonTopThree_15443_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_SeasonTopThree_15443_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_SeasonTopThree_15443.class, Builder.class);
      }

      public boolean hasMaxRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getMaxRank() {
         return this.maxRank_;
      }

      public List<Integer> getThumbsUpsList() {
         return this.thumbsUps_;
      }

      public int getThumbsUpsCount() {
         return this.thumbsUps_.size();
      }

      public int getThumbsUps(int index) {
         return this.thumbsUps_.getInt(index);
      }

      public boolean hasIsOpenServer() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsOpenServer() {
         return this.isOpenServer_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMaxRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.maxRank_);
         }

         for(int i = 0; i < this.thumbsUps_.size(); ++i) {
            output.writeInt32(2, this.thumbsUps_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(3, this.isOpenServer_);
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
               size += CodedOutputStream.computeInt32Size(1, this.maxRank_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.thumbsUps_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.thumbsUps_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getThumbsUpsList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.isOpenServer_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_SeasonTopThree_15443)) {
            return super.equals(obj);
         } else {
            S2CR_SeasonTopThree_15443 other = (S2CR_SeasonTopThree_15443)obj;
            if (this.hasMaxRank() != other.hasMaxRank()) {
               return false;
            } else if (this.hasMaxRank() && this.getMaxRank() != other.getMaxRank()) {
               return false;
            } else if (!this.getThumbsUpsList().equals(other.getThumbsUpsList())) {
               return false;
            } else if (this.hasIsOpenServer() != other.hasIsOpenServer()) {
               return false;
            } else if (this.hasIsOpenServer() && this.getIsOpenServer() != other.getIsOpenServer()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasMaxRank()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMaxRank();
            }

            if (this.getThumbsUpsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getThumbsUpsList().hashCode();
            }

            if (this.hasIsOpenServer()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getIsOpenServer());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_SeasonTopThree_15443 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_SeasonTopThree_15443)PARSER.parseFrom(data);
      }

      public static S2CR_SeasonTopThree_15443 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SeasonTopThree_15443)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SeasonTopThree_15443 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_SeasonTopThree_15443)PARSER.parseFrom(data);
      }

      public static S2CR_SeasonTopThree_15443 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SeasonTopThree_15443)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SeasonTopThree_15443 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_SeasonTopThree_15443)PARSER.parseFrom(data);
      }

      public static S2CR_SeasonTopThree_15443 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SeasonTopThree_15443)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SeasonTopThree_15443 parseFrom(InputStream input) throws IOException {
         return (S2CR_SeasonTopThree_15443)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_SeasonTopThree_15443 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SeasonTopThree_15443)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_SeasonTopThree_15443 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_SeasonTopThree_15443)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_SeasonTopThree_15443 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SeasonTopThree_15443)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_SeasonTopThree_15443 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_SeasonTopThree_15443)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_SeasonTopThree_15443 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SeasonTopThree_15443)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_SeasonTopThree_15443 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_SeasonTopThree_15443 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_SeasonTopThree_15443> parser() {
         return PARSER;
      }

      public Parser<S2CR_SeasonTopThree_15443> getParserForType() {
         return PARSER;
      }

      public S2CR_SeasonTopThree_15443 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_SeasonTopThree_15443OrBuilder {
         private int bitField0_;
         private int maxRank_;
         private Internal.IntList thumbsUps_;
         private boolean isOpenServer_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_SeasonTopThree_15443_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_SeasonTopThree_15443_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_SeasonTopThree_15443.class, Builder.class);
         }

         private Builder() {
            this.thumbsUps_ = CrossCatchDeerMsg.S2CR_SeasonTopThree_15443.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.thumbsUps_ = CrossCatchDeerMsg.S2CR_SeasonTopThree_15443.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.S2CR_SeasonTopThree_15443.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.maxRank_ = 0;
            this.bitField0_ &= -2;
            this.thumbsUps_ = CrossCatchDeerMsg.S2CR_SeasonTopThree_15443.emptyIntList();
            this.bitField0_ &= -3;
            this.isOpenServer_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_SeasonTopThree_15443_descriptor;
         }

         public S2CR_SeasonTopThree_15443 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.S2CR_SeasonTopThree_15443.getDefaultInstance();
         }

         public S2CR_SeasonTopThree_15443 build() {
            S2CR_SeasonTopThree_15443 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_SeasonTopThree_15443 buildPartial() {
            S2CR_SeasonTopThree_15443 result = new S2CR_SeasonTopThree_15443(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.maxRank_ = this.maxRank_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.thumbsUps_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.thumbsUps_ = this.thumbsUps_;
            if ((from_bitField0_ & 4) != 0) {
               result.isOpenServer_ = this.isOpenServer_;
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
            if (other instanceof S2CR_SeasonTopThree_15443) {
               return this.mergeFrom((S2CR_SeasonTopThree_15443)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_SeasonTopThree_15443 other) {
            if (other == CrossCatchDeerMsg.S2CR_SeasonTopThree_15443.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMaxRank()) {
                  this.setMaxRank(other.getMaxRank());
               }

               if (!other.thumbsUps_.isEmpty()) {
                  if (this.thumbsUps_.isEmpty()) {
                     this.thumbsUps_ = other.thumbsUps_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureThumbsUpsIsMutable();
                     this.thumbsUps_.addAll(other.thumbsUps_);
                  }

                  this.onChanged();
               }

               if (other.hasIsOpenServer()) {
                  this.setIsOpenServer(other.getIsOpenServer());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasMaxRank();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_SeasonTopThree_15443 parsedMessage = null;

            try {
               parsedMessage = (S2CR_SeasonTopThree_15443)CrossCatchDeerMsg.S2CR_SeasonTopThree_15443.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_SeasonTopThree_15443)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMaxRank() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getMaxRank() {
            return this.maxRank_;
         }

         public Builder setMaxRank(int value) {
            this.bitField0_ |= 1;
            this.maxRank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMaxRank() {
            this.bitField0_ &= -2;
            this.maxRank_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureThumbsUpsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.thumbsUps_ = CrossCatchDeerMsg.S2CR_SeasonTopThree_15443.mutableCopy(this.thumbsUps_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getThumbsUpsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.thumbsUps_) : this.thumbsUps_);
         }

         public int getThumbsUpsCount() {
            return this.thumbsUps_.size();
         }

         public int getThumbsUps(int index) {
            return this.thumbsUps_.getInt(index);
         }

         public Builder setThumbsUps(int index, int value) {
            this.ensureThumbsUpsIsMutable();
            this.thumbsUps_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addThumbsUps(int value) {
            this.ensureThumbsUpsIsMutable();
            this.thumbsUps_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllThumbsUps(Iterable<? extends Integer> values) {
            this.ensureThumbsUpsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.thumbsUps_);
            this.onChanged();
            return this;
         }

         public Builder clearThumbsUps() {
            this.thumbsUps_ = CrossCatchDeerMsg.S2CR_SeasonTopThree_15443.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasIsOpenServer() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getIsOpenServer() {
            return this.isOpenServer_;
         }

         public Builder setIsOpenServer(boolean value) {
            this.bitField0_ |= 4;
            this.isOpenServer_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsOpenServer() {
            this.bitField0_ &= -5;
            this.isOpenServer_ = false;
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

   public static final class S2CR_ActivityState_15451 extends GeneratedMessageV3 implements S2CR_ActivityState_15451OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ISOPENSERVER_FIELD_NUMBER = 1;
      private boolean isOpenServer_;
      private byte memoizedIsInitialized;
      private static final S2CR_ActivityState_15451 DEFAULT_INSTANCE = new S2CR_ActivityState_15451();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_ActivityState_15451> PARSER = new AbstractParser<S2CR_ActivityState_15451>() {
         public S2CR_ActivityState_15451 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_ActivityState_15451(input, extensionRegistry);
         }
      };

      private S2CR_ActivityState_15451(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_ActivityState_15451() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_ActivityState_15451();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_ActivityState_15451(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.isOpenServer_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ActivityState_15451_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ActivityState_15451_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ActivityState_15451.class, Builder.class);
      }

      public boolean hasIsOpenServer() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsOpenServer() {
         return this.isOpenServer_;
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
            output.writeBool(1, this.isOpenServer_);
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
               size += CodedOutputStream.computeBoolSize(1, this.isOpenServer_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_ActivityState_15451)) {
            return super.equals(obj);
         } else {
            S2CR_ActivityState_15451 other = (S2CR_ActivityState_15451)obj;
            if (this.hasIsOpenServer() != other.hasIsOpenServer()) {
               return false;
            } else if (this.hasIsOpenServer() && this.getIsOpenServer() != other.getIsOpenServer()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasIsOpenServer()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getIsOpenServer());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_ActivityState_15451 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_ActivityState_15451)PARSER.parseFrom(data);
      }

      public static S2CR_ActivityState_15451 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ActivityState_15451)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ActivityState_15451 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_ActivityState_15451)PARSER.parseFrom(data);
      }

      public static S2CR_ActivityState_15451 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ActivityState_15451)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ActivityState_15451 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_ActivityState_15451)PARSER.parseFrom(data);
      }

      public static S2CR_ActivityState_15451 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ActivityState_15451)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ActivityState_15451 parseFrom(InputStream input) throws IOException {
         return (S2CR_ActivityState_15451)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ActivityState_15451 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ActivityState_15451)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ActivityState_15451 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_ActivityState_15451)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_ActivityState_15451 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ActivityState_15451)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ActivityState_15451 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_ActivityState_15451)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ActivityState_15451 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ActivityState_15451)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_ActivityState_15451 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_ActivityState_15451 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_ActivityState_15451> parser() {
         return PARSER;
      }

      public Parser<S2CR_ActivityState_15451> getParserForType() {
         return PARSER;
      }

      public S2CR_ActivityState_15451 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_ActivityState_15451OrBuilder {
         private int bitField0_;
         private boolean isOpenServer_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ActivityState_15451_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ActivityState_15451_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ActivityState_15451.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.S2CR_ActivityState_15451.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.isOpenServer_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ActivityState_15451_descriptor;
         }

         public S2CR_ActivityState_15451 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.S2CR_ActivityState_15451.getDefaultInstance();
         }

         public S2CR_ActivityState_15451 build() {
            S2CR_ActivityState_15451 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_ActivityState_15451 buildPartial() {
            S2CR_ActivityState_15451 result = new S2CR_ActivityState_15451(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.isOpenServer_ = this.isOpenServer_;
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
            if (other instanceof S2CR_ActivityState_15451) {
               return this.mergeFrom((S2CR_ActivityState_15451)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_ActivityState_15451 other) {
            if (other == CrossCatchDeerMsg.S2CR_ActivityState_15451.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIsOpenServer()) {
                  this.setIsOpenServer(other.getIsOpenServer());
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
            S2CR_ActivityState_15451 parsedMessage = null;

            try {
               parsedMessage = (S2CR_ActivityState_15451)CrossCatchDeerMsg.S2CR_ActivityState_15451.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_ActivityState_15451)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIsOpenServer() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getIsOpenServer() {
            return this.isOpenServer_;
         }

         public Builder setIsOpenServer(boolean value) {
            this.bitField0_ |= 1;
            this.isOpenServer_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsOpenServer() {
            this.bitField0_ &= -2;
            this.isOpenServer_ = false;
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

   public static final class S2CR_PlayerKCPSettle_15461 extends GeneratedMessageV3 implements S2CR_PlayerKCPSettle_15461OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_PlayerKCPSettle_15461 DEFAULT_INSTANCE = new S2CR_PlayerKCPSettle_15461();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_PlayerKCPSettle_15461> PARSER = new AbstractParser<S2CR_PlayerKCPSettle_15461>() {
         public S2CR_PlayerKCPSettle_15461 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_PlayerKCPSettle_15461(input, extensionRegistry);
         }
      };

      private S2CR_PlayerKCPSettle_15461(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_PlayerKCPSettle_15461() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_PlayerKCPSettle_15461();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_PlayerKCPSettle_15461(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerKCPSettle_15461_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerKCPSettle_15461_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerKCPSettle_15461.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_PlayerKCPSettle_15461)) {
            return super.equals(obj);
         } else {
            S2CR_PlayerKCPSettle_15461 other = (S2CR_PlayerKCPSettle_15461)obj;
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

      public static S2CR_PlayerKCPSettle_15461 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerKCPSettle_15461)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerKCPSettle_15461 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerKCPSettle_15461)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerKCPSettle_15461 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerKCPSettle_15461)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerKCPSettle_15461 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerKCPSettle_15461)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerKCPSettle_15461 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerKCPSettle_15461)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerKCPSettle_15461 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerKCPSettle_15461)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerKCPSettle_15461 parseFrom(InputStream input) throws IOException {
         return (S2CR_PlayerKCPSettle_15461)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerKCPSettle_15461 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerKCPSettle_15461)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerKCPSettle_15461 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_PlayerKCPSettle_15461)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_PlayerKCPSettle_15461 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerKCPSettle_15461)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerKCPSettle_15461 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_PlayerKCPSettle_15461)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerKCPSettle_15461 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerKCPSettle_15461)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_PlayerKCPSettle_15461 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_PlayerKCPSettle_15461 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_PlayerKCPSettle_15461> parser() {
         return PARSER;
      }

      public Parser<S2CR_PlayerKCPSettle_15461> getParserForType() {
         return PARSER;
      }

      public S2CR_PlayerKCPSettle_15461 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_PlayerKCPSettle_15461OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerKCPSettle_15461_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerKCPSettle_15461_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerKCPSettle_15461.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.S2CR_PlayerKCPSettle_15461.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerKCPSettle_15461_descriptor;
         }

         public S2CR_PlayerKCPSettle_15461 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.S2CR_PlayerKCPSettle_15461.getDefaultInstance();
         }

         public S2CR_PlayerKCPSettle_15461 build() {
            S2CR_PlayerKCPSettle_15461 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_PlayerKCPSettle_15461 buildPartial() {
            S2CR_PlayerKCPSettle_15461 result = new S2CR_PlayerKCPSettle_15461(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_PlayerKCPSettle_15461) {
               return this.mergeFrom((S2CR_PlayerKCPSettle_15461)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_PlayerKCPSettle_15461 other) {
            if (other == CrossCatchDeerMsg.S2CR_PlayerKCPSettle_15461.getDefaultInstance()) {
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
            S2CR_PlayerKCPSettle_15461 parsedMessage = null;

            try {
               parsedMessage = (S2CR_PlayerKCPSettle_15461)CrossCatchDeerMsg.S2CR_PlayerKCPSettle_15461.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_PlayerKCPSettle_15461)e.getUnfinishedMessage();
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

   public static final class S2CR_ThumbsUp_15465 extends GeneratedMessageV3 implements S2CR_ThumbsUp_15465OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BETHUMBSUPID_FIELD_NUMBER = 1;
      private int beThumbsUpId_;
      private byte memoizedIsInitialized;
      private static final S2CR_ThumbsUp_15465 DEFAULT_INSTANCE = new S2CR_ThumbsUp_15465();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_ThumbsUp_15465> PARSER = new AbstractParser<S2CR_ThumbsUp_15465>() {
         public S2CR_ThumbsUp_15465 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_ThumbsUp_15465(input, extensionRegistry);
         }
      };

      private S2CR_ThumbsUp_15465(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_ThumbsUp_15465() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_ThumbsUp_15465();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_ThumbsUp_15465(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ThumbsUp_15465_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ThumbsUp_15465_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ThumbsUp_15465.class, Builder.class);
      }

      public boolean hasBeThumbsUpId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBeThumbsUpId() {
         return this.beThumbsUpId_;
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_ThumbsUp_15465)) {
            return super.equals(obj);
         } else {
            S2CR_ThumbsUp_15465 other = (S2CR_ThumbsUp_15465)obj;
            if (this.hasBeThumbsUpId() != other.hasBeThumbsUpId()) {
               return false;
            } else if (this.hasBeThumbsUpId() && this.getBeThumbsUpId() != other.getBeThumbsUpId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_ThumbsUp_15465 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_ThumbsUp_15465)PARSER.parseFrom(data);
      }

      public static S2CR_ThumbsUp_15465 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ThumbsUp_15465)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ThumbsUp_15465 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_ThumbsUp_15465)PARSER.parseFrom(data);
      }

      public static S2CR_ThumbsUp_15465 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ThumbsUp_15465)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ThumbsUp_15465 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_ThumbsUp_15465)PARSER.parseFrom(data);
      }

      public static S2CR_ThumbsUp_15465 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ThumbsUp_15465)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ThumbsUp_15465 parseFrom(InputStream input) throws IOException {
         return (S2CR_ThumbsUp_15465)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ThumbsUp_15465 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ThumbsUp_15465)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ThumbsUp_15465 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_ThumbsUp_15465)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_ThumbsUp_15465 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ThumbsUp_15465)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ThumbsUp_15465 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_ThumbsUp_15465)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ThumbsUp_15465 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ThumbsUp_15465)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_ThumbsUp_15465 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_ThumbsUp_15465 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_ThumbsUp_15465> parser() {
         return PARSER;
      }

      public Parser<S2CR_ThumbsUp_15465> getParserForType() {
         return PARSER;
      }

      public S2CR_ThumbsUp_15465 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_ThumbsUp_15465OrBuilder {
         private int bitField0_;
         private int beThumbsUpId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ThumbsUp_15465_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ThumbsUp_15465_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ThumbsUp_15465.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.S2CR_ThumbsUp_15465.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.beThumbsUpId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ThumbsUp_15465_descriptor;
         }

         public S2CR_ThumbsUp_15465 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.S2CR_ThumbsUp_15465.getDefaultInstance();
         }

         public S2CR_ThumbsUp_15465 build() {
            S2CR_ThumbsUp_15465 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_ThumbsUp_15465 buildPartial() {
            S2CR_ThumbsUp_15465 result = new S2CR_ThumbsUp_15465(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.beThumbsUpId_ = this.beThumbsUpId_;
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
            if (other instanceof S2CR_ThumbsUp_15465) {
               return this.mergeFrom((S2CR_ThumbsUp_15465)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_ThumbsUp_15465 other) {
            if (other == CrossCatchDeerMsg.S2CR_ThumbsUp_15465.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBeThumbsUpId()) {
                  this.setBeThumbsUpId(other.getBeThumbsUpId());
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
            S2CR_ThumbsUp_15465 parsedMessage = null;

            try {
               parsedMessage = (S2CR_ThumbsUp_15465)CrossCatchDeerMsg.S2CR_ThumbsUp_15465.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_ThumbsUp_15465)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_PlayerInfo_15466 extends GeneratedMessageV3 implements CR2S_PlayerInfo_15466OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int BETHUMBSUPID_FIELD_NUMBER = 3;
      private int beThumbsUpId_;
      private byte memoizedIsInitialized;
      private static final CR2S_PlayerInfo_15466 DEFAULT_INSTANCE = new CR2S_PlayerInfo_15466();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_PlayerInfo_15466> PARSER = new AbstractParser<CR2S_PlayerInfo_15466>() {
         public CR2S_PlayerInfo_15466 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_PlayerInfo_15466(input, extensionRegistry);
         }
      };

      private CR2S_PlayerInfo_15466(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_PlayerInfo_15466() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_PlayerInfo_15466();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_PlayerInfo_15466(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.playerId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.beThumbsUpId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerInfo_15466_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerInfo_15466_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_PlayerInfo_15466.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasBeThumbsUpId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getBeThumbsUpId() {
         return this.beThumbsUpId_;
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
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.beThumbsUpId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.beThumbsUpId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_PlayerInfo_15466)) {
            return super.equals(obj);
         } else {
            CR2S_PlayerInfo_15466 other = (CR2S_PlayerInfo_15466)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasBeThumbsUpId() != other.hasBeThumbsUpId()) {
               return false;
            } else if (this.hasBeThumbsUpId() && this.getBeThumbsUpId() != other.getBeThumbsUpId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasBeThumbsUpId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBeThumbsUpId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_PlayerInfo_15466 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_PlayerInfo_15466)PARSER.parseFrom(data);
      }

      public static CR2S_PlayerInfo_15466 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayerInfo_15466)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayerInfo_15466 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_PlayerInfo_15466)PARSER.parseFrom(data);
      }

      public static CR2S_PlayerInfo_15466 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayerInfo_15466)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayerInfo_15466 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_PlayerInfo_15466)PARSER.parseFrom(data);
      }

      public static CR2S_PlayerInfo_15466 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayerInfo_15466)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayerInfo_15466 parseFrom(InputStream input) throws IOException {
         return (CR2S_PlayerInfo_15466)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_PlayerInfo_15466 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayerInfo_15466)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_PlayerInfo_15466 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_PlayerInfo_15466)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_PlayerInfo_15466 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayerInfo_15466)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_PlayerInfo_15466 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_PlayerInfo_15466)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_PlayerInfo_15466 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayerInfo_15466)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_PlayerInfo_15466 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_PlayerInfo_15466 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_PlayerInfo_15466> parser() {
         return PARSER;
      }

      public Parser<CR2S_PlayerInfo_15466> getParserForType() {
         return PARSER;
      }

      public CR2S_PlayerInfo_15466 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_PlayerInfo_15466OrBuilder {
         private int bitField0_;
         private int result_;
         private int playerId_;
         private int beThumbsUpId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerInfo_15466_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerInfo_15466_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_PlayerInfo_15466.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.CR2S_PlayerInfo_15466.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.beThumbsUpId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerInfo_15466_descriptor;
         }

         public CR2S_PlayerInfo_15466 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.CR2S_PlayerInfo_15466.getDefaultInstance();
         }

         public CR2S_PlayerInfo_15466 build() {
            CR2S_PlayerInfo_15466 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_PlayerInfo_15466 buildPartial() {
            CR2S_PlayerInfo_15466 result = new CR2S_PlayerInfo_15466(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.beThumbsUpId_ = this.beThumbsUpId_;
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
            if (other instanceof CR2S_PlayerInfo_15466) {
               return this.mergeFrom((CR2S_PlayerInfo_15466)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_PlayerInfo_15466 other) {
            if (other == CrossCatchDeerMsg.CR2S_PlayerInfo_15466.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasBeThumbsUpId()) {
                  this.setBeThumbsUpId(other.getBeThumbsUpId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasPlayerId()) {
               return false;
            } else {
               return this.hasBeThumbsUpId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_PlayerInfo_15466 parsedMessage = null;

            try {
               parsedMessage = (CR2S_PlayerInfo_15466)CrossCatchDeerMsg.CR2S_PlayerInfo_15466.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_PlayerInfo_15466)e.getUnfinishedMessage();
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

         public boolean hasBeThumbsUpId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBeThumbsUpId() {
            return this.beThumbsUpId_;
         }

         public Builder setBeThumbsUpId(int value) {
            this.bitField0_ |= 4;
            this.beThumbsUpId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeThumbsUpId() {
            this.bitField0_ &= -5;
            this.beThumbsUpId_ = 0;
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

   public static final class S2CR_PlayerInfo_15467 extends GeneratedMessageV3 implements S2CR_PlayerInfo_15467OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int SERVERID_FIELD_NUMBER = 2;
      private int serverId_;
      private byte memoizedIsInitialized;
      private static final S2CR_PlayerInfo_15467 DEFAULT_INSTANCE = new S2CR_PlayerInfo_15467();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_PlayerInfo_15467> PARSER = new AbstractParser<S2CR_PlayerInfo_15467>() {
         public S2CR_PlayerInfo_15467 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_PlayerInfo_15467(input, extensionRegistry);
         }
      };

      private S2CR_PlayerInfo_15467(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_PlayerInfo_15467() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_PlayerInfo_15467();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_PlayerInfo_15467(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerInfo_15467_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerInfo_15467_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerInfo_15467.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 2) != 0;
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.serverId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.serverId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_PlayerInfo_15467)) {
            return super.equals(obj);
         } else {
            S2CR_PlayerInfo_15467 other = (S2CR_PlayerInfo_15467)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
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
            if (this.hasPlayerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getServerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_PlayerInfo_15467 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerInfo_15467)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerInfo_15467 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerInfo_15467)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerInfo_15467 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerInfo_15467)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerInfo_15467 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerInfo_15467)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerInfo_15467 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerInfo_15467)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerInfo_15467 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerInfo_15467)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerInfo_15467 parseFrom(InputStream input) throws IOException {
         return (S2CR_PlayerInfo_15467)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerInfo_15467 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerInfo_15467)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerInfo_15467 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_PlayerInfo_15467)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_PlayerInfo_15467 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerInfo_15467)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerInfo_15467 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_PlayerInfo_15467)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerInfo_15467 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerInfo_15467)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_PlayerInfo_15467 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_PlayerInfo_15467 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_PlayerInfo_15467> parser() {
         return PARSER;
      }

      public Parser<S2CR_PlayerInfo_15467> getParserForType() {
         return PARSER;
      }

      public S2CR_PlayerInfo_15467 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_PlayerInfo_15467OrBuilder {
         private int bitField0_;
         private int playerId_;
         private int serverId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerInfo_15467_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerInfo_15467_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerInfo_15467.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.S2CR_PlayerInfo_15467.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.serverId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerInfo_15467_descriptor;
         }

         public S2CR_PlayerInfo_15467 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.S2CR_PlayerInfo_15467.getDefaultInstance();
         }

         public S2CR_PlayerInfo_15467 build() {
            S2CR_PlayerInfo_15467 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_PlayerInfo_15467 buildPartial() {
            S2CR_PlayerInfo_15467 result = new S2CR_PlayerInfo_15467(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.serverId_ = this.serverId_;
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
            if (other instanceof S2CR_PlayerInfo_15467) {
               return this.mergeFrom((S2CR_PlayerInfo_15467)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_PlayerInfo_15467 other) {
            if (other == CrossCatchDeerMsg.S2CR_PlayerInfo_15467.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
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
            return this.hasPlayerId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_PlayerInfo_15467 parsedMessage = null;

            try {
               parsedMessage = (S2CR_PlayerInfo_15467)CrossCatchDeerMsg.S2CR_PlayerInfo_15467.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_PlayerInfo_15467)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_BattleRecordData_15469 extends GeneratedMessageV3 implements S2CR_BattleRecordData_15469OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECORDID_FIELD_NUMBER = 1;
      private int recordId_;
      private byte memoizedIsInitialized;
      private static final S2CR_BattleRecordData_15469 DEFAULT_INSTANCE = new S2CR_BattleRecordData_15469();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_BattleRecordData_15469> PARSER = new AbstractParser<S2CR_BattleRecordData_15469>() {
         public S2CR_BattleRecordData_15469 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_BattleRecordData_15469(input, extensionRegistry);
         }
      };

      private S2CR_BattleRecordData_15469(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_BattleRecordData_15469() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_BattleRecordData_15469();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_BattleRecordData_15469(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_BattleRecordData_15469_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_BattleRecordData_15469_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_BattleRecordData_15469.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_BattleRecordData_15469)) {
            return super.equals(obj);
         } else {
            S2CR_BattleRecordData_15469 other = (S2CR_BattleRecordData_15469)obj;
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

      public static S2CR_BattleRecordData_15469 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_BattleRecordData_15469)PARSER.parseFrom(data);
      }

      public static S2CR_BattleRecordData_15469 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BattleRecordData_15469)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BattleRecordData_15469 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_BattleRecordData_15469)PARSER.parseFrom(data);
      }

      public static S2CR_BattleRecordData_15469 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BattleRecordData_15469)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BattleRecordData_15469 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_BattleRecordData_15469)PARSER.parseFrom(data);
      }

      public static S2CR_BattleRecordData_15469 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BattleRecordData_15469)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BattleRecordData_15469 parseFrom(InputStream input) throws IOException {
         return (S2CR_BattleRecordData_15469)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_BattleRecordData_15469 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BattleRecordData_15469)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_BattleRecordData_15469 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_BattleRecordData_15469)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_BattleRecordData_15469 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BattleRecordData_15469)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_BattleRecordData_15469 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_BattleRecordData_15469)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_BattleRecordData_15469 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BattleRecordData_15469)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_BattleRecordData_15469 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_BattleRecordData_15469 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_BattleRecordData_15469> parser() {
         return PARSER;
      }

      public Parser<S2CR_BattleRecordData_15469> getParserForType() {
         return PARSER;
      }

      public S2CR_BattleRecordData_15469 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_BattleRecordData_15469OrBuilder {
         private int bitField0_;
         private int recordId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_BattleRecordData_15469_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_BattleRecordData_15469_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_BattleRecordData_15469.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.S2CR_BattleRecordData_15469.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.recordId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_BattleRecordData_15469_descriptor;
         }

         public S2CR_BattleRecordData_15469 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.S2CR_BattleRecordData_15469.getDefaultInstance();
         }

         public S2CR_BattleRecordData_15469 build() {
            S2CR_BattleRecordData_15469 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_BattleRecordData_15469 buildPartial() {
            S2CR_BattleRecordData_15469 result = new S2CR_BattleRecordData_15469(this);
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
            if (other instanceof S2CR_BattleRecordData_15469) {
               return this.mergeFrom((S2CR_BattleRecordData_15469)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_BattleRecordData_15469 other) {
            if (other == CrossCatchDeerMsg.S2CR_BattleRecordData_15469.getDefaultInstance()) {
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
            S2CR_BattleRecordData_15469 parsedMessage = null;

            try {
               parsedMessage = (S2CR_BattleRecordData_15469)CrossCatchDeerMsg.S2CR_BattleRecordData_15469.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_BattleRecordData_15469)e.getUnfinishedMessage();
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

   public static final class CatchDeerPlayerArraying extends GeneratedMessageV3 implements CatchDeerPlayerArrayingOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int POWER_FIELD_NUMBER = 2;
      private long power_;
      public static final int HEROARRAYINGDATA_FIELD_NUMBER = 3;
      private ByteString heroArrayingData_;
      private byte memoizedIsInitialized;
      private static final CatchDeerPlayerArraying DEFAULT_INSTANCE = new CatchDeerPlayerArraying();
      /** @deprecated */
      @Deprecated
      public static final Parser<CatchDeerPlayerArraying> PARSER = new AbstractParser<CatchDeerPlayerArraying>() {
         public CatchDeerPlayerArraying parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CatchDeerPlayerArraying(input, extensionRegistry);
         }
      };

      private CatchDeerPlayerArraying(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CatchDeerPlayerArraying() {
         this.memoizedIsInitialized = -1;
         this.heroArrayingData_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CatchDeerPlayerArraying();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CatchDeerPlayerArraying(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.power_ = input.readInt64();
                        break;
                     case 26:
                        this.bitField0_ |= 4;
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CatchDeerPlayerArraying_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CatchDeerPlayerArraying_fieldAccessorTable.ensureFieldAccessorsInitialized(CatchDeerPlayerArraying.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasPower() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getPower() {
         return this.power_;
      }

      public boolean hasHeroArrayingData() {
         return (this.bitField0_ & 4) != 0;
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
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPower()) {
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
            output.writeInt32(1, this.playerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.power_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBytes(3, this.heroArrayingData_);
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
               size += CodedOutputStream.computeInt64Size(2, this.power_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBytesSize(3, this.heroArrayingData_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CatchDeerPlayerArraying)) {
            return super.equals(obj);
         } else {
            CatchDeerPlayerArraying other = (CatchDeerPlayerArraying)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasPower() != other.hasPower()) {
               return false;
            } else if (this.hasPower() && this.getPower() != other.getPower()) {
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
            if (this.hasPlayerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasPower()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getPower());
            }

            if (this.hasHeroArrayingData()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHeroArrayingData().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CatchDeerPlayerArraying parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CatchDeerPlayerArraying)PARSER.parseFrom(data);
      }

      public static CatchDeerPlayerArraying parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CatchDeerPlayerArraying)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CatchDeerPlayerArraying parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CatchDeerPlayerArraying)PARSER.parseFrom(data);
      }

      public static CatchDeerPlayerArraying parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CatchDeerPlayerArraying)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CatchDeerPlayerArraying parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CatchDeerPlayerArraying)PARSER.parseFrom(data);
      }

      public static CatchDeerPlayerArraying parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CatchDeerPlayerArraying)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CatchDeerPlayerArraying parseFrom(InputStream input) throws IOException {
         return (CatchDeerPlayerArraying)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CatchDeerPlayerArraying parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CatchDeerPlayerArraying)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CatchDeerPlayerArraying parseDelimitedFrom(InputStream input) throws IOException {
         return (CatchDeerPlayerArraying)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CatchDeerPlayerArraying parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CatchDeerPlayerArraying)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CatchDeerPlayerArraying parseFrom(CodedInputStream input) throws IOException {
         return (CatchDeerPlayerArraying)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CatchDeerPlayerArraying parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CatchDeerPlayerArraying)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CatchDeerPlayerArraying prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CatchDeerPlayerArraying getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CatchDeerPlayerArraying> parser() {
         return PARSER;
      }

      public Parser<CatchDeerPlayerArraying> getParserForType() {
         return PARSER;
      }

      public CatchDeerPlayerArraying getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CatchDeerPlayerArrayingOrBuilder {
         private int bitField0_;
         private int playerId_;
         private long power_;
         private ByteString heroArrayingData_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CatchDeerPlayerArraying_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CatchDeerPlayerArraying_fieldAccessorTable.ensureFieldAccessorsInitialized(CatchDeerPlayerArraying.class, Builder.class);
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
            if (CrossCatchDeerMsg.CatchDeerPlayerArraying.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.power_ = 0L;
            this.bitField0_ &= -3;
            this.heroArrayingData_ = ByteString.EMPTY;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CatchDeerPlayerArraying_descriptor;
         }

         public CatchDeerPlayerArraying getDefaultInstanceForType() {
            return CrossCatchDeerMsg.CatchDeerPlayerArraying.getDefaultInstance();
         }

         public CatchDeerPlayerArraying build() {
            CatchDeerPlayerArraying result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CatchDeerPlayerArraying buildPartial() {
            CatchDeerPlayerArraying result = new CatchDeerPlayerArraying(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.power_ = this.power_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
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
            if (other instanceof CatchDeerPlayerArraying) {
               return this.mergeFrom((CatchDeerPlayerArraying)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CatchDeerPlayerArraying other) {
            if (other == CrossCatchDeerMsg.CatchDeerPlayerArraying.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasPower()) {
                  this.setPower(other.getPower());
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
            if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasPower()) {
               return false;
            } else {
               return this.hasHeroArrayingData();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CatchDeerPlayerArraying parsedMessage = null;

            try {
               parsedMessage = (CatchDeerPlayerArraying)CrossCatchDeerMsg.CatchDeerPlayerArraying.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CatchDeerPlayerArraying)e.getUnfinishedMessage();
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

         public boolean hasPower() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getPower() {
            return this.power_;
         }

         public Builder setPower(long value) {
            this.bitField0_ |= 2;
            this.power_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPower() {
            this.bitField0_ &= -3;
            this.power_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasHeroArrayingData() {
            return (this.bitField0_ & 4) != 0;
         }

         public ByteString getHeroArrayingData() {
            return this.heroArrayingData_;
         }

         public Builder setHeroArrayingData(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.heroArrayingData_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearHeroArrayingData() {
            this.bitField0_ &= -5;
            this.heroArrayingData_ = CrossCatchDeerMsg.CatchDeerPlayerArraying.getDefaultInstance().getHeroArrayingData();
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

   public static final class S2CR_NoticeGameServerUpload_15471 extends GeneratedMessageV3 implements S2CR_NoticeGameServerUpload_15471OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int PLAYERARRAYINGS_FIELD_NUMBER = 1;
      private List<CatchDeerPlayerArraying> playerArrayings_;
      private byte memoizedIsInitialized;
      private static final S2CR_NoticeGameServerUpload_15471 DEFAULT_INSTANCE = new S2CR_NoticeGameServerUpload_15471();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_NoticeGameServerUpload_15471> PARSER = new AbstractParser<S2CR_NoticeGameServerUpload_15471>() {
         public S2CR_NoticeGameServerUpload_15471 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_NoticeGameServerUpload_15471(input, extensionRegistry);
         }
      };

      private S2CR_NoticeGameServerUpload_15471(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_NoticeGameServerUpload_15471() {
         this.memoizedIsInitialized = -1;
         this.playerArrayings_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_NoticeGameServerUpload_15471();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_NoticeGameServerUpload_15471(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                           this.playerArrayings_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.playerArrayings_.add(input.readMessage(CrossCatchDeerMsg.CatchDeerPlayerArraying.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.playerArrayings_ = Collections.unmodifiableList(this.playerArrayings_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_NoticeGameServerUpload_15471_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_NoticeGameServerUpload_15471_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_NoticeGameServerUpload_15471.class, Builder.class);
      }

      public List<CatchDeerPlayerArraying> getPlayerArrayingsList() {
         return this.playerArrayings_;
      }

      public List<? extends CatchDeerPlayerArrayingOrBuilder> getPlayerArrayingsOrBuilderList() {
         return this.playerArrayings_;
      }

      public int getPlayerArrayingsCount() {
         return this.playerArrayings_.size();
      }

      public CatchDeerPlayerArraying getPlayerArrayings(int index) {
         return (CatchDeerPlayerArraying)this.playerArrayings_.get(index);
      }

      public CatchDeerPlayerArrayingOrBuilder getPlayerArrayingsOrBuilder(int index) {
         return (CatchDeerPlayerArrayingOrBuilder)this.playerArrayings_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getPlayerArrayingsCount(); ++i) {
               if (!this.getPlayerArrayings(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.playerArrayings_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.playerArrayings_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.playerArrayings_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.playerArrayings_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_NoticeGameServerUpload_15471)) {
            return super.equals(obj);
         } else {
            S2CR_NoticeGameServerUpload_15471 other = (S2CR_NoticeGameServerUpload_15471)obj;
            if (!this.getPlayerArrayingsList().equals(other.getPlayerArrayingsList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getPlayerArrayingsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerArrayingsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_NoticeGameServerUpload_15471 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_NoticeGameServerUpload_15471)PARSER.parseFrom(data);
      }

      public static S2CR_NoticeGameServerUpload_15471 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_NoticeGameServerUpload_15471)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_NoticeGameServerUpload_15471 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_NoticeGameServerUpload_15471)PARSER.parseFrom(data);
      }

      public static S2CR_NoticeGameServerUpload_15471 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_NoticeGameServerUpload_15471)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_NoticeGameServerUpload_15471 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_NoticeGameServerUpload_15471)PARSER.parseFrom(data);
      }

      public static S2CR_NoticeGameServerUpload_15471 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_NoticeGameServerUpload_15471)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_NoticeGameServerUpload_15471 parseFrom(InputStream input) throws IOException {
         return (S2CR_NoticeGameServerUpload_15471)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_NoticeGameServerUpload_15471 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_NoticeGameServerUpload_15471)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_NoticeGameServerUpload_15471 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_NoticeGameServerUpload_15471)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_NoticeGameServerUpload_15471 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_NoticeGameServerUpload_15471)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_NoticeGameServerUpload_15471 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_NoticeGameServerUpload_15471)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_NoticeGameServerUpload_15471 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_NoticeGameServerUpload_15471)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_NoticeGameServerUpload_15471 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_NoticeGameServerUpload_15471 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_NoticeGameServerUpload_15471> parser() {
         return PARSER;
      }

      public Parser<S2CR_NoticeGameServerUpload_15471> getParserForType() {
         return PARSER;
      }

      public S2CR_NoticeGameServerUpload_15471 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_NoticeGameServerUpload_15471OrBuilder {
         private int bitField0_;
         private List<CatchDeerPlayerArraying> playerArrayings_;
         private RepeatedFieldBuilderV3<CatchDeerPlayerArraying, CatchDeerPlayerArraying.Builder, CatchDeerPlayerArrayingOrBuilder> playerArrayingsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_NoticeGameServerUpload_15471_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_NoticeGameServerUpload_15471_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_NoticeGameServerUpload_15471.class, Builder.class);
         }

         private Builder() {
            this.playerArrayings_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerArrayings_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.S2CR_NoticeGameServerUpload_15471.alwaysUseFieldBuilders) {
               this.getPlayerArrayingsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.playerArrayingsBuilder_ == null) {
               this.playerArrayings_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.playerArrayingsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_NoticeGameServerUpload_15471_descriptor;
         }

         public S2CR_NoticeGameServerUpload_15471 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.S2CR_NoticeGameServerUpload_15471.getDefaultInstance();
         }

         public S2CR_NoticeGameServerUpload_15471 build() {
            S2CR_NoticeGameServerUpload_15471 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_NoticeGameServerUpload_15471 buildPartial() {
            S2CR_NoticeGameServerUpload_15471 result = new S2CR_NoticeGameServerUpload_15471(this);
            int from_bitField0_ = this.bitField0_;
            if (this.playerArrayingsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.playerArrayings_ = Collections.unmodifiableList(this.playerArrayings_);
                  this.bitField0_ &= -2;
               }

               result.playerArrayings_ = this.playerArrayings_;
            } else {
               result.playerArrayings_ = this.playerArrayingsBuilder_.build();
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
            if (other instanceof S2CR_NoticeGameServerUpload_15471) {
               return this.mergeFrom((S2CR_NoticeGameServerUpload_15471)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_NoticeGameServerUpload_15471 other) {
            if (other == CrossCatchDeerMsg.S2CR_NoticeGameServerUpload_15471.getDefaultInstance()) {
               return this;
            } else {
               if (this.playerArrayingsBuilder_ == null) {
                  if (!other.playerArrayings_.isEmpty()) {
                     if (this.playerArrayings_.isEmpty()) {
                        this.playerArrayings_ = other.playerArrayings_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensurePlayerArrayingsIsMutable();
                        this.playerArrayings_.addAll(other.playerArrayings_);
                     }

                     this.onChanged();
                  }
               } else if (!other.playerArrayings_.isEmpty()) {
                  if (this.playerArrayingsBuilder_.isEmpty()) {
                     this.playerArrayingsBuilder_.dispose();
                     this.playerArrayingsBuilder_ = null;
                     this.playerArrayings_ = other.playerArrayings_;
                     this.bitField0_ &= -2;
                     this.playerArrayingsBuilder_ = CrossCatchDeerMsg.S2CR_NoticeGameServerUpload_15471.alwaysUseFieldBuilders ? this.getPlayerArrayingsFieldBuilder() : null;
                  } else {
                     this.playerArrayingsBuilder_.addAllMessages(other.playerArrayings_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getPlayerArrayingsCount(); ++i) {
               if (!this.getPlayerArrayings(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_NoticeGameServerUpload_15471 parsedMessage = null;

            try {
               parsedMessage = (S2CR_NoticeGameServerUpload_15471)CrossCatchDeerMsg.S2CR_NoticeGameServerUpload_15471.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_NoticeGameServerUpload_15471)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensurePlayerArrayingsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.playerArrayings_ = new ArrayList(this.playerArrayings_);
               this.bitField0_ |= 1;
            }

         }

         public List<CatchDeerPlayerArraying> getPlayerArrayingsList() {
            return this.playerArrayingsBuilder_ == null ? Collections.unmodifiableList(this.playerArrayings_) : this.playerArrayingsBuilder_.getMessageList();
         }

         public int getPlayerArrayingsCount() {
            return this.playerArrayingsBuilder_ == null ? this.playerArrayings_.size() : this.playerArrayingsBuilder_.getCount();
         }

         public CatchDeerPlayerArraying getPlayerArrayings(int index) {
            return this.playerArrayingsBuilder_ == null ? (CatchDeerPlayerArraying)this.playerArrayings_.get(index) : (CatchDeerPlayerArraying)this.playerArrayingsBuilder_.getMessage(index);
         }

         public Builder setPlayerArrayings(int index, CatchDeerPlayerArraying value) {
            if (this.playerArrayingsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerArrayingsIsMutable();
               this.playerArrayings_.set(index, value);
               this.onChanged();
            } else {
               this.playerArrayingsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPlayerArrayings(int index, CatchDeerPlayerArraying.Builder builderForValue) {
            if (this.playerArrayingsBuilder_ == null) {
               this.ensurePlayerArrayingsIsMutable();
               this.playerArrayings_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerArrayingsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPlayerArrayings(CatchDeerPlayerArraying value) {
            if (this.playerArrayingsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerArrayingsIsMutable();
               this.playerArrayings_.add(value);
               this.onChanged();
            } else {
               this.playerArrayingsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPlayerArrayings(int index, CatchDeerPlayerArraying value) {
            if (this.playerArrayingsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerArrayingsIsMutable();
               this.playerArrayings_.add(index, value);
               this.onChanged();
            } else {
               this.playerArrayingsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPlayerArrayings(CatchDeerPlayerArraying.Builder builderForValue) {
            if (this.playerArrayingsBuilder_ == null) {
               this.ensurePlayerArrayingsIsMutable();
               this.playerArrayings_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.playerArrayingsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPlayerArrayings(int index, CatchDeerPlayerArraying.Builder builderForValue) {
            if (this.playerArrayingsBuilder_ == null) {
               this.ensurePlayerArrayingsIsMutable();
               this.playerArrayings_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerArrayingsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPlayerArrayings(Iterable<? extends CatchDeerPlayerArraying> values) {
            if (this.playerArrayingsBuilder_ == null) {
               this.ensurePlayerArrayingsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.playerArrayings_);
               this.onChanged();
            } else {
               this.playerArrayingsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPlayerArrayings() {
            if (this.playerArrayingsBuilder_ == null) {
               this.playerArrayings_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.playerArrayingsBuilder_.clear();
            }

            return this;
         }

         public Builder removePlayerArrayings(int index) {
            if (this.playerArrayingsBuilder_ == null) {
               this.ensurePlayerArrayingsIsMutable();
               this.playerArrayings_.remove(index);
               this.onChanged();
            } else {
               this.playerArrayingsBuilder_.remove(index);
            }

            return this;
         }

         public CatchDeerPlayerArraying.Builder getPlayerArrayingsBuilder(int index) {
            return (CatchDeerPlayerArraying.Builder)this.getPlayerArrayingsFieldBuilder().getBuilder(index);
         }

         public CatchDeerPlayerArrayingOrBuilder getPlayerArrayingsOrBuilder(int index) {
            return this.playerArrayingsBuilder_ == null ? (CatchDeerPlayerArrayingOrBuilder)this.playerArrayings_.get(index) : (CatchDeerPlayerArrayingOrBuilder)this.playerArrayingsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CatchDeerPlayerArrayingOrBuilder> getPlayerArrayingsOrBuilderList() {
            return this.playerArrayingsBuilder_ != null ? this.playerArrayingsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.playerArrayings_);
         }

         public CatchDeerPlayerArraying.Builder addPlayerArrayingsBuilder() {
            return (CatchDeerPlayerArraying.Builder)this.getPlayerArrayingsFieldBuilder().addBuilder(CrossCatchDeerMsg.CatchDeerPlayerArraying.getDefaultInstance());
         }

         public CatchDeerPlayerArraying.Builder addPlayerArrayingsBuilder(int index) {
            return (CatchDeerPlayerArraying.Builder)this.getPlayerArrayingsFieldBuilder().addBuilder(index, CrossCatchDeerMsg.CatchDeerPlayerArraying.getDefaultInstance());
         }

         public List<CatchDeerPlayerArraying.Builder> getPlayerArrayingsBuilderList() {
            return this.getPlayerArrayingsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CatchDeerPlayerArraying, CatchDeerPlayerArraying.Builder, CatchDeerPlayerArrayingOrBuilder> getPlayerArrayingsFieldBuilder() {
            if (this.playerArrayingsBuilder_ == null) {
               this.playerArrayingsBuilder_ = new RepeatedFieldBuilderV3(this.playerArrayings_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.playerArrayings_ = null;
            }

            return this.playerArrayingsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_NoticeGameServerUpload_15472 extends GeneratedMessageV3 implements CR2S_NoticeGameServerUpload_15472OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ISMOVESERVER_FIELD_NUMBER = 1;
      private boolean isMoveServer_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final CR2S_NoticeGameServerUpload_15472 DEFAULT_INSTANCE = new CR2S_NoticeGameServerUpload_15472();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_NoticeGameServerUpload_15472> PARSER = new AbstractParser<CR2S_NoticeGameServerUpload_15472>() {
         public CR2S_NoticeGameServerUpload_15472 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_NoticeGameServerUpload_15472(input, extensionRegistry);
         }
      };

      private CR2S_NoticeGameServerUpload_15472(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_NoticeGameServerUpload_15472() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_NoticeGameServerUpload_15472();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_NoticeGameServerUpload_15472(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.isMoveServer_ = input.readBool();
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_NoticeGameServerUpload_15472_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_NoticeGameServerUpload_15472_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_NoticeGameServerUpload_15472.class, Builder.class);
      }

      public boolean hasIsMoveServer() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsMoveServer() {
         return this.isMoveServer_;
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
         } else if (!this.hasIsMoveServer()) {
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
            output.writeBool(1, this.isMoveServer_);
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
               size += CodedOutputStream.computeBoolSize(1, this.isMoveServer_);
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
         } else if (!(obj instanceof CR2S_NoticeGameServerUpload_15472)) {
            return super.equals(obj);
         } else {
            CR2S_NoticeGameServerUpload_15472 other = (CR2S_NoticeGameServerUpload_15472)obj;
            if (this.hasIsMoveServer() != other.hasIsMoveServer()) {
               return false;
            } else if (this.hasIsMoveServer() && this.getIsMoveServer() != other.getIsMoveServer()) {
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
            if (this.hasIsMoveServer()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getIsMoveServer());
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

      public static CR2S_NoticeGameServerUpload_15472 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_NoticeGameServerUpload_15472)PARSER.parseFrom(data);
      }

      public static CR2S_NoticeGameServerUpload_15472 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_NoticeGameServerUpload_15472)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_NoticeGameServerUpload_15472 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_NoticeGameServerUpload_15472)PARSER.parseFrom(data);
      }

      public static CR2S_NoticeGameServerUpload_15472 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_NoticeGameServerUpload_15472)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_NoticeGameServerUpload_15472 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_NoticeGameServerUpload_15472)PARSER.parseFrom(data);
      }

      public static CR2S_NoticeGameServerUpload_15472 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_NoticeGameServerUpload_15472)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_NoticeGameServerUpload_15472 parseFrom(InputStream input) throws IOException {
         return (CR2S_NoticeGameServerUpload_15472)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_NoticeGameServerUpload_15472 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_NoticeGameServerUpload_15472)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_NoticeGameServerUpload_15472 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_NoticeGameServerUpload_15472)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_NoticeGameServerUpload_15472 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_NoticeGameServerUpload_15472)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_NoticeGameServerUpload_15472 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_NoticeGameServerUpload_15472)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_NoticeGameServerUpload_15472 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_NoticeGameServerUpload_15472)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_NoticeGameServerUpload_15472 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_NoticeGameServerUpload_15472 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_NoticeGameServerUpload_15472> parser() {
         return PARSER;
      }

      public Parser<CR2S_NoticeGameServerUpload_15472> getParserForType() {
         return PARSER;
      }

      public CR2S_NoticeGameServerUpload_15472 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_NoticeGameServerUpload_15472OrBuilder {
         private int bitField0_;
         private boolean isMoveServer_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_NoticeGameServerUpload_15472_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_NoticeGameServerUpload_15472_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_NoticeGameServerUpload_15472.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.CR2S_NoticeGameServerUpload_15472.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.isMoveServer_ = false;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_NoticeGameServerUpload_15472_descriptor;
         }

         public CR2S_NoticeGameServerUpload_15472 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.CR2S_NoticeGameServerUpload_15472.getDefaultInstance();
         }

         public CR2S_NoticeGameServerUpload_15472 build() {
            CR2S_NoticeGameServerUpload_15472 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_NoticeGameServerUpload_15472 buildPartial() {
            CR2S_NoticeGameServerUpload_15472 result = new CR2S_NoticeGameServerUpload_15472(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.isMoveServer_ = this.isMoveServer_;
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
            if (other instanceof CR2S_NoticeGameServerUpload_15472) {
               return this.mergeFrom((CR2S_NoticeGameServerUpload_15472)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_NoticeGameServerUpload_15472 other) {
            if (other == CrossCatchDeerMsg.CR2S_NoticeGameServerUpload_15472.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIsMoveServer()) {
                  this.setIsMoveServer(other.getIsMoveServer());
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
            if (!this.hasIsMoveServer()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_NoticeGameServerUpload_15472 parsedMessage = null;

            try {
               parsedMessage = (CR2S_NoticeGameServerUpload_15472)CrossCatchDeerMsg.CR2S_NoticeGameServerUpload_15472.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_NoticeGameServerUpload_15472)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIsMoveServer() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getIsMoveServer() {
            return this.isMoveServer_;
         }

         public Builder setIsMoveServer(boolean value) {
            this.bitField0_ |= 1;
            this.isMoveServer_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsMoveServer() {
            this.bitField0_ &= -2;
            this.isMoveServer_ = false;
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

   public static final class S2CR_ActivityState_15473 extends GeneratedMessageV3 implements S2CR_ActivityState_15473OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_ActivityState_15473 DEFAULT_INSTANCE = new S2CR_ActivityState_15473();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_ActivityState_15473> PARSER = new AbstractParser<S2CR_ActivityState_15473>() {
         public S2CR_ActivityState_15473 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_ActivityState_15473(input, extensionRegistry);
         }
      };

      private S2CR_ActivityState_15473(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_ActivityState_15473() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_ActivityState_15473();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_ActivityState_15473(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ActivityState_15473_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ActivityState_15473_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ActivityState_15473.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_ActivityState_15473)) {
            return super.equals(obj);
         } else {
            S2CR_ActivityState_15473 other = (S2CR_ActivityState_15473)obj;
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

      public static S2CR_ActivityState_15473 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_ActivityState_15473)PARSER.parseFrom(data);
      }

      public static S2CR_ActivityState_15473 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ActivityState_15473)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ActivityState_15473 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_ActivityState_15473)PARSER.parseFrom(data);
      }

      public static S2CR_ActivityState_15473 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ActivityState_15473)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ActivityState_15473 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_ActivityState_15473)PARSER.parseFrom(data);
      }

      public static S2CR_ActivityState_15473 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ActivityState_15473)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ActivityState_15473 parseFrom(InputStream input) throws IOException {
         return (S2CR_ActivityState_15473)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ActivityState_15473 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ActivityState_15473)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ActivityState_15473 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_ActivityState_15473)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_ActivityState_15473 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ActivityState_15473)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ActivityState_15473 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_ActivityState_15473)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ActivityState_15473 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ActivityState_15473)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_ActivityState_15473 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_ActivityState_15473 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_ActivityState_15473> parser() {
         return PARSER;
      }

      public Parser<S2CR_ActivityState_15473> getParserForType() {
         return PARSER;
      }

      public S2CR_ActivityState_15473 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_ActivityState_15473OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ActivityState_15473_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ActivityState_15473_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ActivityState_15473.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.S2CR_ActivityState_15473.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_ActivityState_15473_descriptor;
         }

         public S2CR_ActivityState_15473 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.S2CR_ActivityState_15473.getDefaultInstance();
         }

         public S2CR_ActivityState_15473 build() {
            S2CR_ActivityState_15473 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_ActivityState_15473 buildPartial() {
            S2CR_ActivityState_15473 result = new S2CR_ActivityState_15473(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_ActivityState_15473) {
               return this.mergeFrom((S2CR_ActivityState_15473)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_ActivityState_15473 other) {
            if (other == CrossCatchDeerMsg.S2CR_ActivityState_15473.getDefaultInstance()) {
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
            S2CR_ActivityState_15473 parsedMessage = null;

            try {
               parsedMessage = (S2CR_ActivityState_15473)CrossCatchDeerMsg.S2CR_ActivityState_15473.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_ActivityState_15473)e.getUnfinishedMessage();
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

   public static final class CR2S_ActivityState_15474 extends GeneratedMessageV3 implements CR2S_ActivityState_15474OrBuilder {
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
      private byte memoizedIsInitialized;
      private static final CR2S_ActivityState_15474 DEFAULT_INSTANCE = new CR2S_ActivityState_15474();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_ActivityState_15474> PARSER = new AbstractParser<CR2S_ActivityState_15474>() {
         public CR2S_ActivityState_15474 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_ActivityState_15474(input, extensionRegistry);
         }
      };

      private CR2S_ActivityState_15474(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_ActivityState_15474() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_ActivityState_15474();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_ActivityState_15474(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_ActivityState_15474_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_ActivityState_15474_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ActivityState_15474.class, Builder.class);
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
         } else if (!this.hasDownTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsActivityDay()) {
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_ActivityState_15474)) {
            return super.equals(obj);
         } else {
            CR2S_ActivityState_15474 other = (CR2S_ActivityState_15474)obj;
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
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_ActivityState_15474 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_ActivityState_15474)PARSER.parseFrom(data);
      }

      public static CR2S_ActivityState_15474 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ActivityState_15474)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ActivityState_15474 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_ActivityState_15474)PARSER.parseFrom(data);
      }

      public static CR2S_ActivityState_15474 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ActivityState_15474)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ActivityState_15474 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_ActivityState_15474)PARSER.parseFrom(data);
      }

      public static CR2S_ActivityState_15474 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ActivityState_15474)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ActivityState_15474 parseFrom(InputStream input) throws IOException {
         return (CR2S_ActivityState_15474)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ActivityState_15474 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ActivityState_15474)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ActivityState_15474 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_ActivityState_15474)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_ActivityState_15474 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ActivityState_15474)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ActivityState_15474 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_ActivityState_15474)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ActivityState_15474 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ActivityState_15474)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_ActivityState_15474 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_ActivityState_15474 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_ActivityState_15474> parser() {
         return PARSER;
      }

      public Parser<CR2S_ActivityState_15474> getParserForType() {
         return PARSER;
      }

      public CR2S_ActivityState_15474 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_ActivityState_15474OrBuilder {
         private int bitField0_;
         private int state_;
         private int startTime_;
         private int downTime_;
         private boolean isActivityDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_ActivityState_15474_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_ActivityState_15474_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ActivityState_15474.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.CR2S_ActivityState_15474.alwaysUseFieldBuilders) {
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
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_ActivityState_15474_descriptor;
         }

         public CR2S_ActivityState_15474 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.CR2S_ActivityState_15474.getDefaultInstance();
         }

         public CR2S_ActivityState_15474 build() {
            CR2S_ActivityState_15474 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_ActivityState_15474 buildPartial() {
            CR2S_ActivityState_15474 result = new CR2S_ActivityState_15474(this);
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
            if (other instanceof CR2S_ActivityState_15474) {
               return this.mergeFrom((CR2S_ActivityState_15474)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_ActivityState_15474 other) {
            if (other == CrossCatchDeerMsg.CR2S_ActivityState_15474.getDefaultInstance()) {
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
            } else if (!this.hasDownTime()) {
               return false;
            } else {
               return this.hasIsActivityDay();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_ActivityState_15474 parsedMessage = null;

            try {
               parsedMessage = (CR2S_ActivityState_15474)CrossCatchDeerMsg.CR2S_ActivityState_15474.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_ActivityState_15474)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_RoundAndState_15475 extends GeneratedMessageV3 implements S2CR_RoundAndState_15475OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_RoundAndState_15475 DEFAULT_INSTANCE = new S2CR_RoundAndState_15475();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_RoundAndState_15475> PARSER = new AbstractParser<S2CR_RoundAndState_15475>() {
         public S2CR_RoundAndState_15475 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_RoundAndState_15475(input, extensionRegistry);
         }
      };

      private S2CR_RoundAndState_15475(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_RoundAndState_15475() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_RoundAndState_15475();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_RoundAndState_15475(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_RoundAndState_15475_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_RoundAndState_15475_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_RoundAndState_15475.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_RoundAndState_15475)) {
            return super.equals(obj);
         } else {
            S2CR_RoundAndState_15475 other = (S2CR_RoundAndState_15475)obj;
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

      public static S2CR_RoundAndState_15475 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_RoundAndState_15475)PARSER.parseFrom(data);
      }

      public static S2CR_RoundAndState_15475 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RoundAndState_15475)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RoundAndState_15475 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_RoundAndState_15475)PARSER.parseFrom(data);
      }

      public static S2CR_RoundAndState_15475 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RoundAndState_15475)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RoundAndState_15475 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_RoundAndState_15475)PARSER.parseFrom(data);
      }

      public static S2CR_RoundAndState_15475 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RoundAndState_15475)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RoundAndState_15475 parseFrom(InputStream input) throws IOException {
         return (S2CR_RoundAndState_15475)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_RoundAndState_15475 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RoundAndState_15475)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_RoundAndState_15475 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_RoundAndState_15475)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_RoundAndState_15475 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RoundAndState_15475)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_RoundAndState_15475 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_RoundAndState_15475)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_RoundAndState_15475 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RoundAndState_15475)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_RoundAndState_15475 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_RoundAndState_15475 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_RoundAndState_15475> parser() {
         return PARSER;
      }

      public Parser<S2CR_RoundAndState_15475> getParserForType() {
         return PARSER;
      }

      public S2CR_RoundAndState_15475 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_RoundAndState_15475OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_RoundAndState_15475_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_RoundAndState_15475_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_RoundAndState_15475.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.S2CR_RoundAndState_15475.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_RoundAndState_15475_descriptor;
         }

         public S2CR_RoundAndState_15475 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.S2CR_RoundAndState_15475.getDefaultInstance();
         }

         public S2CR_RoundAndState_15475 build() {
            S2CR_RoundAndState_15475 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_RoundAndState_15475 buildPartial() {
            S2CR_RoundAndState_15475 result = new S2CR_RoundAndState_15475(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_RoundAndState_15475) {
               return this.mergeFrom((S2CR_RoundAndState_15475)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_RoundAndState_15475 other) {
            if (other == CrossCatchDeerMsg.S2CR_RoundAndState_15475.getDefaultInstance()) {
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
            S2CR_RoundAndState_15475 parsedMessage = null;

            try {
               parsedMessage = (S2CR_RoundAndState_15475)CrossCatchDeerMsg.S2CR_RoundAndState_15475.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_RoundAndState_15475)e.getUnfinishedMessage();
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

   public static final class CR2S_RoundAndState_15476 extends GeneratedMessageV3 implements CR2S_RoundAndState_15476OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ROUND_FIELD_NUMBER = 1;
      private int round_;
      public static final int STATE_FIELD_NUMBER = 2;
      private int state_;
      public static final int STARTTIME_FIELD_NUMBER = 3;
      private int startTime_;
      public static final int DOWNTIME_FIELD_NUMBER = 4;
      private int downTime_;
      public static final int NEXTTIME_FIELD_NUMBER = 5;
      private int nextTime_;
      private byte memoizedIsInitialized;
      private static final CR2S_RoundAndState_15476 DEFAULT_INSTANCE = new CR2S_RoundAndState_15476();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_RoundAndState_15476> PARSER = new AbstractParser<CR2S_RoundAndState_15476>() {
         public CR2S_RoundAndState_15476 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_RoundAndState_15476(input, extensionRegistry);
         }
      };

      private CR2S_RoundAndState_15476(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_RoundAndState_15476() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_RoundAndState_15476();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_RoundAndState_15476(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.startTime_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.downTime_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_RoundAndState_15476_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_RoundAndState_15476_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_RoundAndState_15476.class, Builder.class);
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

      public boolean hasStartTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
      }

      public boolean hasDownTime() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getDownTime() {
         return this.downTime_;
      }

      public boolean hasNextTime() {
         return (this.bitField0_ & 16) != 0;
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
            output.writeInt32(1, this.round_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.state_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.startTime_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.downTime_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.nextTime_);
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
               size += CodedOutputStream.computeInt32Size(3, this.startTime_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.downTime_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.nextTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_RoundAndState_15476)) {
            return super.equals(obj);
         } else {
            CR2S_RoundAndState_15476 other = (CR2S_RoundAndState_15476)obj;
            if (this.hasRound() != other.hasRound()) {
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
            if (this.hasRound()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRound();
            }

            if (this.hasState()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getState();
            }

            if (this.hasStartTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getStartTime();
            }

            if (this.hasDownTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getDownTime();
            }

            if (this.hasNextTime()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getNextTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_RoundAndState_15476 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_RoundAndState_15476)PARSER.parseFrom(data);
      }

      public static CR2S_RoundAndState_15476 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RoundAndState_15476)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RoundAndState_15476 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_RoundAndState_15476)PARSER.parseFrom(data);
      }

      public static CR2S_RoundAndState_15476 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RoundAndState_15476)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RoundAndState_15476 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_RoundAndState_15476)PARSER.parseFrom(data);
      }

      public static CR2S_RoundAndState_15476 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RoundAndState_15476)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RoundAndState_15476 parseFrom(InputStream input) throws IOException {
         return (CR2S_RoundAndState_15476)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_RoundAndState_15476 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RoundAndState_15476)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_RoundAndState_15476 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_RoundAndState_15476)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_RoundAndState_15476 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RoundAndState_15476)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_RoundAndState_15476 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_RoundAndState_15476)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_RoundAndState_15476 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RoundAndState_15476)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_RoundAndState_15476 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_RoundAndState_15476 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_RoundAndState_15476> parser() {
         return PARSER;
      }

      public Parser<CR2S_RoundAndState_15476> getParserForType() {
         return PARSER;
      }

      public CR2S_RoundAndState_15476 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_RoundAndState_15476OrBuilder {
         private int bitField0_;
         private int round_;
         private int state_;
         private int startTime_;
         private int downTime_;
         private int nextTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_RoundAndState_15476_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_RoundAndState_15476_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_RoundAndState_15476.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.CR2S_RoundAndState_15476.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.round_ = 0;
            this.bitField0_ &= -2;
            this.state_ = 0;
            this.bitField0_ &= -3;
            this.startTime_ = 0;
            this.bitField0_ &= -5;
            this.downTime_ = 0;
            this.bitField0_ &= -9;
            this.nextTime_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_RoundAndState_15476_descriptor;
         }

         public CR2S_RoundAndState_15476 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.CR2S_RoundAndState_15476.getDefaultInstance();
         }

         public CR2S_RoundAndState_15476 build() {
            CR2S_RoundAndState_15476 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_RoundAndState_15476 buildPartial() {
            CR2S_RoundAndState_15476 result = new CR2S_RoundAndState_15476(this);
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
               result.startTime_ = this.startTime_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.downTime_ = this.downTime_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.nextTime_ = this.nextTime_;
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
            if (other instanceof CR2S_RoundAndState_15476) {
               return this.mergeFrom((CR2S_RoundAndState_15476)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_RoundAndState_15476 other) {
            if (other == CrossCatchDeerMsg.CR2S_RoundAndState_15476.getDefaultInstance()) {
               return this;
            } else {
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
            if (!this.hasRound()) {
               return false;
            } else {
               return this.hasState();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_RoundAndState_15476 parsedMessage = null;

            try {
               parsedMessage = (CR2S_RoundAndState_15476)CrossCatchDeerMsg.CR2S_RoundAndState_15476.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_RoundAndState_15476)e.getUnfinishedMessage();
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

         public boolean hasStartTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getStartTime() {
            return this.startTime_;
         }

         public Builder setStartTime(int value) {
            this.bitField0_ |= 4;
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTime() {
            this.bitField0_ &= -5;
            this.startTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDownTime() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getDownTime() {
            return this.downTime_;
         }

         public Builder setDownTime(int value) {
            this.bitField0_ |= 8;
            this.downTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDownTime() {
            this.bitField0_ &= -9;
            this.downTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasNextTime() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getNextTime() {
            return this.nextTime_;
         }

         public Builder setNextTime(int value) {
            this.bitField0_ |= 16;
            this.nextTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNextTime() {
            this.bitField0_ &= -17;
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

   public static final class S2CR_GuessOdds_15477 extends GeneratedMessageV3 implements S2CR_GuessOdds_15477OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_GuessOdds_15477 DEFAULT_INSTANCE = new S2CR_GuessOdds_15477();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_GuessOdds_15477> PARSER = new AbstractParser<S2CR_GuessOdds_15477>() {
         public S2CR_GuessOdds_15477 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_GuessOdds_15477(input, extensionRegistry);
         }
      };

      private S2CR_GuessOdds_15477(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_GuessOdds_15477() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_GuessOdds_15477();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_GuessOdds_15477(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessOdds_15477_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessOdds_15477_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GuessOdds_15477.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_GuessOdds_15477)) {
            return super.equals(obj);
         } else {
            S2CR_GuessOdds_15477 other = (S2CR_GuessOdds_15477)obj;
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

      public static S2CR_GuessOdds_15477 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_GuessOdds_15477)PARSER.parseFrom(data);
      }

      public static S2CR_GuessOdds_15477 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GuessOdds_15477)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GuessOdds_15477 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_GuessOdds_15477)PARSER.parseFrom(data);
      }

      public static S2CR_GuessOdds_15477 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GuessOdds_15477)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GuessOdds_15477 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_GuessOdds_15477)PARSER.parseFrom(data);
      }

      public static S2CR_GuessOdds_15477 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GuessOdds_15477)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GuessOdds_15477 parseFrom(InputStream input) throws IOException {
         return (S2CR_GuessOdds_15477)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GuessOdds_15477 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GuessOdds_15477)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GuessOdds_15477 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_GuessOdds_15477)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_GuessOdds_15477 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GuessOdds_15477)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GuessOdds_15477 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_GuessOdds_15477)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GuessOdds_15477 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GuessOdds_15477)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_GuessOdds_15477 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_GuessOdds_15477 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_GuessOdds_15477> parser() {
         return PARSER;
      }

      public Parser<S2CR_GuessOdds_15477> getParserForType() {
         return PARSER;
      }

      public S2CR_GuessOdds_15477 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_GuessOdds_15477OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessOdds_15477_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessOdds_15477_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GuessOdds_15477.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.S2CR_GuessOdds_15477.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessOdds_15477_descriptor;
         }

         public S2CR_GuessOdds_15477 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.S2CR_GuessOdds_15477.getDefaultInstance();
         }

         public S2CR_GuessOdds_15477 build() {
            S2CR_GuessOdds_15477 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_GuessOdds_15477 buildPartial() {
            S2CR_GuessOdds_15477 result = new S2CR_GuessOdds_15477(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_GuessOdds_15477) {
               return this.mergeFrom((S2CR_GuessOdds_15477)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_GuessOdds_15477 other) {
            if (other == CrossCatchDeerMsg.S2CR_GuessOdds_15477.getDefaultInstance()) {
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
            S2CR_GuessOdds_15477 parsedMessage = null;

            try {
               parsedMessage = (S2CR_GuessOdds_15477)CrossCatchDeerMsg.S2CR_GuessOdds_15477.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_GuessOdds_15477)e.getUnfinishedMessage();
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

   public static final class CR2S_GuessOdds_15478 extends GeneratedMessageV3 implements CR2S_GuessOdds_15478OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LEFTODDS_FIELD_NUMBER = 1;
      private double leftOdds_;
      public static final int RIGHTODDS_FIELD_NUMBER = 2;
      private double rightOdds_;
      private byte memoizedIsInitialized;
      private static final CR2S_GuessOdds_15478 DEFAULT_INSTANCE = new CR2S_GuessOdds_15478();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_GuessOdds_15478> PARSER = new AbstractParser<CR2S_GuessOdds_15478>() {
         public CR2S_GuessOdds_15478 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_GuessOdds_15478(input, extensionRegistry);
         }
      };

      private CR2S_GuessOdds_15478(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_GuessOdds_15478() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_GuessOdds_15478();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_GuessOdds_15478(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessOdds_15478_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessOdds_15478_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_GuessOdds_15478.class, Builder.class);
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
         } else if (!(obj instanceof CR2S_GuessOdds_15478)) {
            return super.equals(obj);
         } else {
            CR2S_GuessOdds_15478 other = (CR2S_GuessOdds_15478)obj;
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

      public static CR2S_GuessOdds_15478 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_GuessOdds_15478)PARSER.parseFrom(data);
      }

      public static CR2S_GuessOdds_15478 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GuessOdds_15478)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GuessOdds_15478 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_GuessOdds_15478)PARSER.parseFrom(data);
      }

      public static CR2S_GuessOdds_15478 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GuessOdds_15478)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GuessOdds_15478 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_GuessOdds_15478)PARSER.parseFrom(data);
      }

      public static CR2S_GuessOdds_15478 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GuessOdds_15478)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GuessOdds_15478 parseFrom(InputStream input) throws IOException {
         return (CR2S_GuessOdds_15478)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_GuessOdds_15478 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GuessOdds_15478)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_GuessOdds_15478 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_GuessOdds_15478)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_GuessOdds_15478 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GuessOdds_15478)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_GuessOdds_15478 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_GuessOdds_15478)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_GuessOdds_15478 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GuessOdds_15478)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_GuessOdds_15478 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_GuessOdds_15478 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_GuessOdds_15478> parser() {
         return PARSER;
      }

      public Parser<CR2S_GuessOdds_15478> getParserForType() {
         return PARSER;
      }

      public CR2S_GuessOdds_15478 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_GuessOdds_15478OrBuilder {
         private int bitField0_;
         private double leftOdds_;
         private double rightOdds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessOdds_15478_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessOdds_15478_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_GuessOdds_15478.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.CR2S_GuessOdds_15478.alwaysUseFieldBuilders) {
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
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessOdds_15478_descriptor;
         }

         public CR2S_GuessOdds_15478 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.CR2S_GuessOdds_15478.getDefaultInstance();
         }

         public CR2S_GuessOdds_15478 build() {
            CR2S_GuessOdds_15478 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_GuessOdds_15478 buildPartial() {
            CR2S_GuessOdds_15478 result = new CR2S_GuessOdds_15478(this);
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
            if (other instanceof CR2S_GuessOdds_15478) {
               return this.mergeFrom((CR2S_GuessOdds_15478)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_GuessOdds_15478 other) {
            if (other == CrossCatchDeerMsg.CR2S_GuessOdds_15478.getDefaultInstance()) {
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
            CR2S_GuessOdds_15478 parsedMessage = null;

            try {
               parsedMessage = (CR2S_GuessOdds_15478)CrossCatchDeerMsg.CR2S_GuessOdds_15478.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_GuessOdds_15478)e.getUnfinishedMessage();
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

   public static final class S2CR_GuessFightRecord_15479 extends GeneratedMessageV3 implements S2CR_GuessFightRecord_15479OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_GuessFightRecord_15479 DEFAULT_INSTANCE = new S2CR_GuessFightRecord_15479();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_GuessFightRecord_15479> PARSER = new AbstractParser<S2CR_GuessFightRecord_15479>() {
         public S2CR_GuessFightRecord_15479 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_GuessFightRecord_15479(input, extensionRegistry);
         }
      };

      private S2CR_GuessFightRecord_15479(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_GuessFightRecord_15479() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_GuessFightRecord_15479();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_GuessFightRecord_15479(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessFightRecord_15479_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessFightRecord_15479_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GuessFightRecord_15479.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_GuessFightRecord_15479)) {
            return super.equals(obj);
         } else {
            S2CR_GuessFightRecord_15479 other = (S2CR_GuessFightRecord_15479)obj;
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

      public static S2CR_GuessFightRecord_15479 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_GuessFightRecord_15479)PARSER.parseFrom(data);
      }

      public static S2CR_GuessFightRecord_15479 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GuessFightRecord_15479)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GuessFightRecord_15479 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_GuessFightRecord_15479)PARSER.parseFrom(data);
      }

      public static S2CR_GuessFightRecord_15479 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GuessFightRecord_15479)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GuessFightRecord_15479 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_GuessFightRecord_15479)PARSER.parseFrom(data);
      }

      public static S2CR_GuessFightRecord_15479 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GuessFightRecord_15479)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GuessFightRecord_15479 parseFrom(InputStream input) throws IOException {
         return (S2CR_GuessFightRecord_15479)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GuessFightRecord_15479 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GuessFightRecord_15479)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GuessFightRecord_15479 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_GuessFightRecord_15479)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_GuessFightRecord_15479 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GuessFightRecord_15479)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GuessFightRecord_15479 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_GuessFightRecord_15479)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GuessFightRecord_15479 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GuessFightRecord_15479)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_GuessFightRecord_15479 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_GuessFightRecord_15479 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_GuessFightRecord_15479> parser() {
         return PARSER;
      }

      public Parser<S2CR_GuessFightRecord_15479> getParserForType() {
         return PARSER;
      }

      public S2CR_GuessFightRecord_15479 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_GuessFightRecord_15479OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessFightRecord_15479_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessFightRecord_15479_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GuessFightRecord_15479.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.S2CR_GuessFightRecord_15479.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_GuessFightRecord_15479_descriptor;
         }

         public S2CR_GuessFightRecord_15479 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.S2CR_GuessFightRecord_15479.getDefaultInstance();
         }

         public S2CR_GuessFightRecord_15479 build() {
            S2CR_GuessFightRecord_15479 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_GuessFightRecord_15479 buildPartial() {
            S2CR_GuessFightRecord_15479 result = new S2CR_GuessFightRecord_15479(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_GuessFightRecord_15479) {
               return this.mergeFrom((S2CR_GuessFightRecord_15479)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_GuessFightRecord_15479 other) {
            if (other == CrossCatchDeerMsg.S2CR_GuessFightRecord_15479.getDefaultInstance()) {
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
            S2CR_GuessFightRecord_15479 parsedMessage = null;

            try {
               parsedMessage = (S2CR_GuessFightRecord_15479)CrossCatchDeerMsg.S2CR_GuessFightRecord_15479.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_GuessFightRecord_15479)e.getUnfinishedMessage();
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

   public static final class CR2S_GuessFightRecord_15480 extends GeneratedMessageV3 implements CR2S_GuessFightRecord_15480OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GUESSRECORDID_FIELD_NUMBER = 1;
      private int guessRecordId_;
      private byte memoizedIsInitialized;
      private static final CR2S_GuessFightRecord_15480 DEFAULT_INSTANCE = new CR2S_GuessFightRecord_15480();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_GuessFightRecord_15480> PARSER = new AbstractParser<CR2S_GuessFightRecord_15480>() {
         public CR2S_GuessFightRecord_15480 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_GuessFightRecord_15480(input, extensionRegistry);
         }
      };

      private CR2S_GuessFightRecord_15480(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_GuessFightRecord_15480() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_GuessFightRecord_15480();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_GuessFightRecord_15480(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.guessRecordId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessFightRecord_15480_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessFightRecord_15480_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_GuessFightRecord_15480.class, Builder.class);
      }

      public boolean hasGuessRecordId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGuessRecordId() {
         return this.guessRecordId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGuessRecordId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.guessRecordId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.guessRecordId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_GuessFightRecord_15480)) {
            return super.equals(obj);
         } else {
            CR2S_GuessFightRecord_15480 other = (CR2S_GuessFightRecord_15480)obj;
            if (this.hasGuessRecordId() != other.hasGuessRecordId()) {
               return false;
            } else if (this.hasGuessRecordId() && this.getGuessRecordId() != other.getGuessRecordId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasGuessRecordId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGuessRecordId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_GuessFightRecord_15480 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_GuessFightRecord_15480)PARSER.parseFrom(data);
      }

      public static CR2S_GuessFightRecord_15480 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GuessFightRecord_15480)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GuessFightRecord_15480 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_GuessFightRecord_15480)PARSER.parseFrom(data);
      }

      public static CR2S_GuessFightRecord_15480 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GuessFightRecord_15480)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GuessFightRecord_15480 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_GuessFightRecord_15480)PARSER.parseFrom(data);
      }

      public static CR2S_GuessFightRecord_15480 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GuessFightRecord_15480)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GuessFightRecord_15480 parseFrom(InputStream input) throws IOException {
         return (CR2S_GuessFightRecord_15480)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_GuessFightRecord_15480 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GuessFightRecord_15480)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_GuessFightRecord_15480 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_GuessFightRecord_15480)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_GuessFightRecord_15480 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GuessFightRecord_15480)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_GuessFightRecord_15480 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_GuessFightRecord_15480)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_GuessFightRecord_15480 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GuessFightRecord_15480)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_GuessFightRecord_15480 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_GuessFightRecord_15480 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_GuessFightRecord_15480> parser() {
         return PARSER;
      }

      public Parser<CR2S_GuessFightRecord_15480> getParserForType() {
         return PARSER;
      }

      public CR2S_GuessFightRecord_15480 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_GuessFightRecord_15480OrBuilder {
         private int bitField0_;
         private int guessRecordId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessFightRecord_15480_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessFightRecord_15480_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_GuessFightRecord_15480.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.CR2S_GuessFightRecord_15480.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.guessRecordId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessFightRecord_15480_descriptor;
         }

         public CR2S_GuessFightRecord_15480 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.CR2S_GuessFightRecord_15480.getDefaultInstance();
         }

         public CR2S_GuessFightRecord_15480 build() {
            CR2S_GuessFightRecord_15480 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_GuessFightRecord_15480 buildPartial() {
            CR2S_GuessFightRecord_15480 result = new CR2S_GuessFightRecord_15480(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.guessRecordId_ = this.guessRecordId_;
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
            if (other instanceof CR2S_GuessFightRecord_15480) {
               return this.mergeFrom((CR2S_GuessFightRecord_15480)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_GuessFightRecord_15480 other) {
            if (other == CrossCatchDeerMsg.CR2S_GuessFightRecord_15480.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGuessRecordId()) {
                  this.setGuessRecordId(other.getGuessRecordId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGuessRecordId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_GuessFightRecord_15480 parsedMessage = null;

            try {
               parsedMessage = (CR2S_GuessFightRecord_15480)CrossCatchDeerMsg.CR2S_GuessFightRecord_15480.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_GuessFightRecord_15480)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGuessRecordId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGuessRecordId() {
            return this.guessRecordId_;
         }

         public Builder setGuessRecordId(int value) {
            this.bitField0_ |= 1;
            this.guessRecordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGuessRecordId() {
            this.bitField0_ &= -2;
            this.guessRecordId_ = 0;
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

   public static final class S2CR_PlayerSettlePlains_15481 extends GeneratedMessageV3 implements S2CR_PlayerSettlePlains_15481OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_PlayerSettlePlains_15481 DEFAULT_INSTANCE = new S2CR_PlayerSettlePlains_15481();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_PlayerSettlePlains_15481> PARSER = new AbstractParser<S2CR_PlayerSettlePlains_15481>() {
         public S2CR_PlayerSettlePlains_15481 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_PlayerSettlePlains_15481(input, extensionRegistry);
         }
      };

      private S2CR_PlayerSettlePlains_15481(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_PlayerSettlePlains_15481() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_PlayerSettlePlains_15481();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_PlayerSettlePlains_15481(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettlePlains_15481_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettlePlains_15481_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerSettlePlains_15481.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_PlayerSettlePlains_15481)) {
            return super.equals(obj);
         } else {
            S2CR_PlayerSettlePlains_15481 other = (S2CR_PlayerSettlePlains_15481)obj;
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

      public static S2CR_PlayerSettlePlains_15481 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerSettlePlains_15481)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerSettlePlains_15481 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerSettlePlains_15481)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerSettlePlains_15481 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerSettlePlains_15481)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerSettlePlains_15481 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerSettlePlains_15481)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerSettlePlains_15481 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerSettlePlains_15481)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerSettlePlains_15481 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerSettlePlains_15481)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerSettlePlains_15481 parseFrom(InputStream input) throws IOException {
         return (S2CR_PlayerSettlePlains_15481)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerSettlePlains_15481 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerSettlePlains_15481)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerSettlePlains_15481 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_PlayerSettlePlains_15481)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_PlayerSettlePlains_15481 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerSettlePlains_15481)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerSettlePlains_15481 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_PlayerSettlePlains_15481)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerSettlePlains_15481 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerSettlePlains_15481)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_PlayerSettlePlains_15481 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_PlayerSettlePlains_15481 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_PlayerSettlePlains_15481> parser() {
         return PARSER;
      }

      public Parser<S2CR_PlayerSettlePlains_15481> getParserForType() {
         return PARSER;
      }

      public S2CR_PlayerSettlePlains_15481 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_PlayerSettlePlains_15481OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettlePlains_15481_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettlePlains_15481_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerSettlePlains_15481.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.S2CR_PlayerSettlePlains_15481.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettlePlains_15481_descriptor;
         }

         public S2CR_PlayerSettlePlains_15481 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.S2CR_PlayerSettlePlains_15481.getDefaultInstance();
         }

         public S2CR_PlayerSettlePlains_15481 build() {
            S2CR_PlayerSettlePlains_15481 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_PlayerSettlePlains_15481 buildPartial() {
            S2CR_PlayerSettlePlains_15481 result = new S2CR_PlayerSettlePlains_15481(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_PlayerSettlePlains_15481) {
               return this.mergeFrom((S2CR_PlayerSettlePlains_15481)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_PlayerSettlePlains_15481 other) {
            if (other == CrossCatchDeerMsg.S2CR_PlayerSettlePlains_15481.getDefaultInstance()) {
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
            S2CR_PlayerSettlePlains_15481 parsedMessage = null;

            try {
               parsedMessage = (S2CR_PlayerSettlePlains_15481)CrossCatchDeerMsg.S2CR_PlayerSettlePlains_15481.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_PlayerSettlePlains_15481)e.getUnfinishedMessage();
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

   public static final class CR2S_PlayerSettlePlains_15482 extends GeneratedMessageV3 implements CR2S_PlayerSettlePlains_15482OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int PLAINS_FIELD_NUMBER = 1;
      private List<CommonMsg.MapDataII> plains_;
      private byte memoizedIsInitialized;
      private static final CR2S_PlayerSettlePlains_15482 DEFAULT_INSTANCE = new CR2S_PlayerSettlePlains_15482();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_PlayerSettlePlains_15482> PARSER = new AbstractParser<CR2S_PlayerSettlePlains_15482>() {
         public CR2S_PlayerSettlePlains_15482 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_PlayerSettlePlains_15482(input, extensionRegistry);
         }
      };

      private CR2S_PlayerSettlePlains_15482(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_PlayerSettlePlains_15482() {
         this.memoizedIsInitialized = -1;
         this.plains_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_PlayerSettlePlains_15482();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_PlayerSettlePlains_15482(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                           this.plains_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.plains_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.plains_ = Collections.unmodifiableList(this.plains_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettlePlains_15482_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettlePlains_15482_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_PlayerSettlePlains_15482.class, Builder.class);
      }

      public List<CommonMsg.MapDataII> getPlainsList() {
         return this.plains_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getPlainsOrBuilderList() {
         return this.plains_;
      }

      public int getPlainsCount() {
         return this.plains_.size();
      }

      public CommonMsg.MapDataII getPlains(int index) {
         return (CommonMsg.MapDataII)this.plains_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getPlainsOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.plains_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getPlainsCount(); ++i) {
               if (!this.getPlains(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.plains_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.plains_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.plains_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.plains_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_PlayerSettlePlains_15482)) {
            return super.equals(obj);
         } else {
            CR2S_PlayerSettlePlains_15482 other = (CR2S_PlayerSettlePlains_15482)obj;
            if (!this.getPlainsList().equals(other.getPlainsList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getPlainsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlainsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_PlayerSettlePlains_15482 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_PlayerSettlePlains_15482)PARSER.parseFrom(data);
      }

      public static CR2S_PlayerSettlePlains_15482 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayerSettlePlains_15482)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayerSettlePlains_15482 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_PlayerSettlePlains_15482)PARSER.parseFrom(data);
      }

      public static CR2S_PlayerSettlePlains_15482 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayerSettlePlains_15482)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayerSettlePlains_15482 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_PlayerSettlePlains_15482)PARSER.parseFrom(data);
      }

      public static CR2S_PlayerSettlePlains_15482 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayerSettlePlains_15482)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayerSettlePlains_15482 parseFrom(InputStream input) throws IOException {
         return (CR2S_PlayerSettlePlains_15482)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_PlayerSettlePlains_15482 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayerSettlePlains_15482)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_PlayerSettlePlains_15482 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_PlayerSettlePlains_15482)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_PlayerSettlePlains_15482 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayerSettlePlains_15482)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_PlayerSettlePlains_15482 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_PlayerSettlePlains_15482)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_PlayerSettlePlains_15482 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayerSettlePlains_15482)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_PlayerSettlePlains_15482 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_PlayerSettlePlains_15482 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_PlayerSettlePlains_15482> parser() {
         return PARSER;
      }

      public Parser<CR2S_PlayerSettlePlains_15482> getParserForType() {
         return PARSER;
      }

      public CR2S_PlayerSettlePlains_15482 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_PlayerSettlePlains_15482OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MapDataII> plains_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> plainsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettlePlains_15482_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettlePlains_15482_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_PlayerSettlePlains_15482.class, Builder.class);
         }

         private Builder() {
            this.plains_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.plains_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.CR2S_PlayerSettlePlains_15482.alwaysUseFieldBuilders) {
               this.getPlainsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.plainsBuilder_ == null) {
               this.plains_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.plainsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettlePlains_15482_descriptor;
         }

         public CR2S_PlayerSettlePlains_15482 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.CR2S_PlayerSettlePlains_15482.getDefaultInstance();
         }

         public CR2S_PlayerSettlePlains_15482 build() {
            CR2S_PlayerSettlePlains_15482 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_PlayerSettlePlains_15482 buildPartial() {
            CR2S_PlayerSettlePlains_15482 result = new CR2S_PlayerSettlePlains_15482(this);
            int from_bitField0_ = this.bitField0_;
            if (this.plainsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.plains_ = Collections.unmodifiableList(this.plains_);
                  this.bitField0_ &= -2;
               }

               result.plains_ = this.plains_;
            } else {
               result.plains_ = this.plainsBuilder_.build();
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
            if (other instanceof CR2S_PlayerSettlePlains_15482) {
               return this.mergeFrom((CR2S_PlayerSettlePlains_15482)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_PlayerSettlePlains_15482 other) {
            if (other == CrossCatchDeerMsg.CR2S_PlayerSettlePlains_15482.getDefaultInstance()) {
               return this;
            } else {
               if (this.plainsBuilder_ == null) {
                  if (!other.plains_.isEmpty()) {
                     if (this.plains_.isEmpty()) {
                        this.plains_ = other.plains_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensurePlainsIsMutable();
                        this.plains_.addAll(other.plains_);
                     }

                     this.onChanged();
                  }
               } else if (!other.plains_.isEmpty()) {
                  if (this.plainsBuilder_.isEmpty()) {
                     this.plainsBuilder_.dispose();
                     this.plainsBuilder_ = null;
                     this.plains_ = other.plains_;
                     this.bitField0_ &= -2;
                     this.plainsBuilder_ = CrossCatchDeerMsg.CR2S_PlayerSettlePlains_15482.alwaysUseFieldBuilders ? this.getPlainsFieldBuilder() : null;
                  } else {
                     this.plainsBuilder_.addAllMessages(other.plains_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getPlainsCount(); ++i) {
               if (!this.getPlains(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_PlayerSettlePlains_15482 parsedMessage = null;

            try {
               parsedMessage = (CR2S_PlayerSettlePlains_15482)CrossCatchDeerMsg.CR2S_PlayerSettlePlains_15482.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_PlayerSettlePlains_15482)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensurePlainsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.plains_ = new ArrayList(this.plains_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MapDataII> getPlainsList() {
            return this.plainsBuilder_ == null ? Collections.unmodifiableList(this.plains_) : this.plainsBuilder_.getMessageList();
         }

         public int getPlainsCount() {
            return this.plainsBuilder_ == null ? this.plains_.size() : this.plainsBuilder_.getCount();
         }

         public CommonMsg.MapDataII getPlains(int index) {
            return this.plainsBuilder_ == null ? (CommonMsg.MapDataII)this.plains_.get(index) : (CommonMsg.MapDataII)this.plainsBuilder_.getMessage(index);
         }

         public Builder setPlains(int index, CommonMsg.MapDataII value) {
            if (this.plainsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlainsIsMutable();
               this.plains_.set(index, value);
               this.onChanged();
            } else {
               this.plainsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPlains(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.plainsBuilder_ == null) {
               this.ensurePlainsIsMutable();
               this.plains_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.plainsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPlains(CommonMsg.MapDataII value) {
            if (this.plainsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlainsIsMutable();
               this.plains_.add(value);
               this.onChanged();
            } else {
               this.plainsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPlains(int index, CommonMsg.MapDataII value) {
            if (this.plainsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlainsIsMutable();
               this.plains_.add(index, value);
               this.onChanged();
            } else {
               this.plainsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPlains(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.plainsBuilder_ == null) {
               this.ensurePlainsIsMutable();
               this.plains_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.plainsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPlains(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.plainsBuilder_ == null) {
               this.ensurePlainsIsMutable();
               this.plains_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.plainsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPlains(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.plainsBuilder_ == null) {
               this.ensurePlainsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.plains_);
               this.onChanged();
            } else {
               this.plainsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPlains() {
            if (this.plainsBuilder_ == null) {
               this.plains_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.plainsBuilder_.clear();
            }

            return this;
         }

         public Builder removePlains(int index) {
            if (this.plainsBuilder_ == null) {
               this.ensurePlainsIsMutable();
               this.plains_.remove(index);
               this.onChanged();
            } else {
               this.plainsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getPlainsBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getPlainsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getPlainsOrBuilder(int index) {
            return this.plainsBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.plains_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.plainsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getPlainsOrBuilderList() {
            return this.plainsBuilder_ != null ? this.plainsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.plains_);
         }

         public CommonMsg.MapDataII.Builder addPlainsBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getPlainsFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addPlainsBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getPlainsFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getPlainsBuilderList() {
            return this.getPlainsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getPlainsFieldBuilder() {
            if (this.plainsBuilder_ == null) {
               this.plainsBuilder_ = new RepeatedFieldBuilderV3(this.plains_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.plains_ = null;
            }

            return this.plainsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_PlayerSettleRank_15483 extends GeneratedMessageV3 implements S2CR_PlayerSettleRank_15483OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_PlayerSettleRank_15483 DEFAULT_INSTANCE = new S2CR_PlayerSettleRank_15483();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_PlayerSettleRank_15483> PARSER = new AbstractParser<S2CR_PlayerSettleRank_15483>() {
         public S2CR_PlayerSettleRank_15483 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_PlayerSettleRank_15483(input, extensionRegistry);
         }
      };

      private S2CR_PlayerSettleRank_15483(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_PlayerSettleRank_15483() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_PlayerSettleRank_15483();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_PlayerSettleRank_15483(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettleRank_15483_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettleRank_15483_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerSettleRank_15483.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_PlayerSettleRank_15483)) {
            return super.equals(obj);
         } else {
            S2CR_PlayerSettleRank_15483 other = (S2CR_PlayerSettleRank_15483)obj;
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

      public static S2CR_PlayerSettleRank_15483 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerSettleRank_15483)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerSettleRank_15483 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerSettleRank_15483)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerSettleRank_15483 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerSettleRank_15483)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerSettleRank_15483 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerSettleRank_15483)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerSettleRank_15483 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerSettleRank_15483)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerSettleRank_15483 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerSettleRank_15483)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerSettleRank_15483 parseFrom(InputStream input) throws IOException {
         return (S2CR_PlayerSettleRank_15483)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerSettleRank_15483 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerSettleRank_15483)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerSettleRank_15483 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_PlayerSettleRank_15483)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_PlayerSettleRank_15483 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerSettleRank_15483)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerSettleRank_15483 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_PlayerSettleRank_15483)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerSettleRank_15483 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerSettleRank_15483)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_PlayerSettleRank_15483 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_PlayerSettleRank_15483 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_PlayerSettleRank_15483> parser() {
         return PARSER;
      }

      public Parser<S2CR_PlayerSettleRank_15483> getParserForType() {
         return PARSER;
      }

      public S2CR_PlayerSettleRank_15483 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_PlayerSettleRank_15483OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettleRank_15483_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettleRank_15483_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerSettleRank_15483.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.S2CR_PlayerSettleRank_15483.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettleRank_15483_descriptor;
         }

         public S2CR_PlayerSettleRank_15483 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.S2CR_PlayerSettleRank_15483.getDefaultInstance();
         }

         public S2CR_PlayerSettleRank_15483 build() {
            S2CR_PlayerSettleRank_15483 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_PlayerSettleRank_15483 buildPartial() {
            S2CR_PlayerSettleRank_15483 result = new S2CR_PlayerSettleRank_15483(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_PlayerSettleRank_15483) {
               return this.mergeFrom((S2CR_PlayerSettleRank_15483)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_PlayerSettleRank_15483 other) {
            if (other == CrossCatchDeerMsg.S2CR_PlayerSettleRank_15483.getDefaultInstance()) {
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
            S2CR_PlayerSettleRank_15483 parsedMessage = null;

            try {
               parsedMessage = (S2CR_PlayerSettleRank_15483)CrossCatchDeerMsg.S2CR_PlayerSettleRank_15483.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_PlayerSettleRank_15483)e.getUnfinishedMessage();
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

   public static final class CR2S_PlayerSettleRank_15484 extends GeneratedMessageV3 implements CR2S_PlayerSettleRank_15484OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RANK_FIELD_NUMBER = 1;
      private List<CommonMsg.MapDataII> rank_;
      private byte memoizedIsInitialized;
      private static final CR2S_PlayerSettleRank_15484 DEFAULT_INSTANCE = new CR2S_PlayerSettleRank_15484();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_PlayerSettleRank_15484> PARSER = new AbstractParser<CR2S_PlayerSettleRank_15484>() {
         public CR2S_PlayerSettleRank_15484 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_PlayerSettleRank_15484(input, extensionRegistry);
         }
      };

      private CR2S_PlayerSettleRank_15484(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_PlayerSettleRank_15484() {
         this.memoizedIsInitialized = -1;
         this.rank_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_PlayerSettleRank_15484();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_PlayerSettleRank_15484(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                           this.rank_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.rank_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.rank_ = Collections.unmodifiableList(this.rank_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettleRank_15484_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettleRank_15484_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_PlayerSettleRank_15484.class, Builder.class);
      }

      public List<CommonMsg.MapDataII> getRankList() {
         return this.rank_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getRankOrBuilderList() {
         return this.rank_;
      }

      public int getRankCount() {
         return this.rank_.size();
      }

      public CommonMsg.MapDataII getRank(int index) {
         return (CommonMsg.MapDataII)this.rank_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getRankOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.rank_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getRankCount(); ++i) {
               if (!this.getRank(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.rank_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.rank_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.rank_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.rank_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_PlayerSettleRank_15484)) {
            return super.equals(obj);
         } else {
            CR2S_PlayerSettleRank_15484 other = (CR2S_PlayerSettleRank_15484)obj;
            if (!this.getRankList().equals(other.getRankList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getRankCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRankList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_PlayerSettleRank_15484 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_PlayerSettleRank_15484)PARSER.parseFrom(data);
      }

      public static CR2S_PlayerSettleRank_15484 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayerSettleRank_15484)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayerSettleRank_15484 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_PlayerSettleRank_15484)PARSER.parseFrom(data);
      }

      public static CR2S_PlayerSettleRank_15484 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayerSettleRank_15484)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayerSettleRank_15484 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_PlayerSettleRank_15484)PARSER.parseFrom(data);
      }

      public static CR2S_PlayerSettleRank_15484 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayerSettleRank_15484)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayerSettleRank_15484 parseFrom(InputStream input) throws IOException {
         return (CR2S_PlayerSettleRank_15484)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_PlayerSettleRank_15484 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayerSettleRank_15484)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_PlayerSettleRank_15484 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_PlayerSettleRank_15484)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_PlayerSettleRank_15484 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayerSettleRank_15484)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_PlayerSettleRank_15484 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_PlayerSettleRank_15484)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_PlayerSettleRank_15484 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayerSettleRank_15484)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_PlayerSettleRank_15484 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_PlayerSettleRank_15484 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_PlayerSettleRank_15484> parser() {
         return PARSER;
      }

      public Parser<CR2S_PlayerSettleRank_15484> getParserForType() {
         return PARSER;
      }

      public CR2S_PlayerSettleRank_15484 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_PlayerSettleRank_15484OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MapDataII> rank_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> rankBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettleRank_15484_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettleRank_15484_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_PlayerSettleRank_15484.class, Builder.class);
         }

         private Builder() {
            this.rank_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rank_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.CR2S_PlayerSettleRank_15484.alwaysUseFieldBuilders) {
               this.getRankFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.rankBuilder_ == null) {
               this.rank_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.rankBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettleRank_15484_descriptor;
         }

         public CR2S_PlayerSettleRank_15484 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.CR2S_PlayerSettleRank_15484.getDefaultInstance();
         }

         public CR2S_PlayerSettleRank_15484 build() {
            CR2S_PlayerSettleRank_15484 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_PlayerSettleRank_15484 buildPartial() {
            CR2S_PlayerSettleRank_15484 result = new CR2S_PlayerSettleRank_15484(this);
            int from_bitField0_ = this.bitField0_;
            if (this.rankBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.rank_ = Collections.unmodifiableList(this.rank_);
                  this.bitField0_ &= -2;
               }

               result.rank_ = this.rank_;
            } else {
               result.rank_ = this.rankBuilder_.build();
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
            if (other instanceof CR2S_PlayerSettleRank_15484) {
               return this.mergeFrom((CR2S_PlayerSettleRank_15484)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_PlayerSettleRank_15484 other) {
            if (other == CrossCatchDeerMsg.CR2S_PlayerSettleRank_15484.getDefaultInstance()) {
               return this;
            } else {
               if (this.rankBuilder_ == null) {
                  if (!other.rank_.isEmpty()) {
                     if (this.rank_.isEmpty()) {
                        this.rank_ = other.rank_;
                        this.bitField0_ &= -2;
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
                     this.bitField0_ &= -2;
                     this.rankBuilder_ = CrossCatchDeerMsg.CR2S_PlayerSettleRank_15484.alwaysUseFieldBuilders ? this.getRankFieldBuilder() : null;
                  } else {
                     this.rankBuilder_.addAllMessages(other.rank_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getRankCount(); ++i) {
               if (!this.getRank(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_PlayerSettleRank_15484 parsedMessage = null;

            try {
               parsedMessage = (CR2S_PlayerSettleRank_15484)CrossCatchDeerMsg.CR2S_PlayerSettleRank_15484.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_PlayerSettleRank_15484)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRankIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.rank_ = new ArrayList(this.rank_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MapDataII> getRankList() {
            return this.rankBuilder_ == null ? Collections.unmodifiableList(this.rank_) : this.rankBuilder_.getMessageList();
         }

         public int getRankCount() {
            return this.rankBuilder_ == null ? this.rank_.size() : this.rankBuilder_.getCount();
         }

         public CommonMsg.MapDataII getRank(int index) {
            return this.rankBuilder_ == null ? (CommonMsg.MapDataII)this.rank_.get(index) : (CommonMsg.MapDataII)this.rankBuilder_.getMessage(index);
         }

         public Builder setRank(int index, CommonMsg.MapDataII value) {
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

         public Builder setRank(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.rankBuilder_ == null) {
               this.ensureRankIsMutable();
               this.rank_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRank(CommonMsg.MapDataII value) {
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

         public Builder addRank(int index, CommonMsg.MapDataII value) {
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

         public Builder addRank(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.rankBuilder_ == null) {
               this.ensureRankIsMutable();
               this.rank_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rankBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRank(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.rankBuilder_ == null) {
               this.ensureRankIsMutable();
               this.rank_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRank(Iterable<? extends CommonMsg.MapDataII> values) {
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
               this.bitField0_ &= -2;
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

         public CommonMsg.MapDataII.Builder getRankBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getRankFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getRankOrBuilder(int index) {
            return this.rankBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.rank_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.rankBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getRankOrBuilderList() {
            return this.rankBuilder_ != null ? this.rankBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rank_);
         }

         public CommonMsg.MapDataII.Builder addRankBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getRankFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addRankBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getRankFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getRankBuilderList() {
            return this.getRankFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getRankFieldBuilder() {
            if (this.rankBuilder_ == null) {
               this.rankBuilder_ = new RepeatedFieldBuilderV3(this.rank_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.rank_ = null;
            }

            return this.rankBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_PlayerSettlePrestige_15485 extends GeneratedMessageV3 implements S2CR_PlayerSettlePrestige_15485OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_PlayerSettlePrestige_15485 DEFAULT_INSTANCE = new S2CR_PlayerSettlePrestige_15485();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_PlayerSettlePrestige_15485> PARSER = new AbstractParser<S2CR_PlayerSettlePrestige_15485>() {
         public S2CR_PlayerSettlePrestige_15485 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_PlayerSettlePrestige_15485(input, extensionRegistry);
         }
      };

      private S2CR_PlayerSettlePrestige_15485(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_PlayerSettlePrestige_15485() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_PlayerSettlePrestige_15485();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_PlayerSettlePrestige_15485(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettlePrestige_15485_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettlePrestige_15485_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerSettlePrestige_15485.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_PlayerSettlePrestige_15485)) {
            return super.equals(obj);
         } else {
            S2CR_PlayerSettlePrestige_15485 other = (S2CR_PlayerSettlePrestige_15485)obj;
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

      public static S2CR_PlayerSettlePrestige_15485 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerSettlePrestige_15485)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerSettlePrestige_15485 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerSettlePrestige_15485)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerSettlePrestige_15485 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerSettlePrestige_15485)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerSettlePrestige_15485 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerSettlePrestige_15485)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerSettlePrestige_15485 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerSettlePrestige_15485)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerSettlePrestige_15485 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerSettlePrestige_15485)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerSettlePrestige_15485 parseFrom(InputStream input) throws IOException {
         return (S2CR_PlayerSettlePrestige_15485)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerSettlePrestige_15485 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerSettlePrestige_15485)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerSettlePrestige_15485 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_PlayerSettlePrestige_15485)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_PlayerSettlePrestige_15485 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerSettlePrestige_15485)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerSettlePrestige_15485 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_PlayerSettlePrestige_15485)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerSettlePrestige_15485 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerSettlePrestige_15485)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_PlayerSettlePrestige_15485 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_PlayerSettlePrestige_15485 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_PlayerSettlePrestige_15485> parser() {
         return PARSER;
      }

      public Parser<S2CR_PlayerSettlePrestige_15485> getParserForType() {
         return PARSER;
      }

      public S2CR_PlayerSettlePrestige_15485 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_PlayerSettlePrestige_15485OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettlePrestige_15485_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettlePrestige_15485_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerSettlePrestige_15485.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.S2CR_PlayerSettlePrestige_15485.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerSettlePrestige_15485_descriptor;
         }

         public S2CR_PlayerSettlePrestige_15485 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.S2CR_PlayerSettlePrestige_15485.getDefaultInstance();
         }

         public S2CR_PlayerSettlePrestige_15485 build() {
            S2CR_PlayerSettlePrestige_15485 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_PlayerSettlePrestige_15485 buildPartial() {
            S2CR_PlayerSettlePrestige_15485 result = new S2CR_PlayerSettlePrestige_15485(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_PlayerSettlePrestige_15485) {
               return this.mergeFrom((S2CR_PlayerSettlePrestige_15485)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_PlayerSettlePrestige_15485 other) {
            if (other == CrossCatchDeerMsg.S2CR_PlayerSettlePrestige_15485.getDefaultInstance()) {
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
            S2CR_PlayerSettlePrestige_15485 parsedMessage = null;

            try {
               parsedMessage = (S2CR_PlayerSettlePrestige_15485)CrossCatchDeerMsg.S2CR_PlayerSettlePrestige_15485.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_PlayerSettlePrestige_15485)e.getUnfinishedMessage();
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

   public static final class CR2S_PlayerSettlePrestige_15486 extends GeneratedMessageV3 implements CR2S_PlayerSettlePrestige_15486OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int PRESTIGE_FIELD_NUMBER = 1;
      private List<CommonMsg.MapDataII> prestige_;
      private byte memoizedIsInitialized;
      private static final CR2S_PlayerSettlePrestige_15486 DEFAULT_INSTANCE = new CR2S_PlayerSettlePrestige_15486();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_PlayerSettlePrestige_15486> PARSER = new AbstractParser<CR2S_PlayerSettlePrestige_15486>() {
         public CR2S_PlayerSettlePrestige_15486 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_PlayerSettlePrestige_15486(input, extensionRegistry);
         }
      };

      private CR2S_PlayerSettlePrestige_15486(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_PlayerSettlePrestige_15486() {
         this.memoizedIsInitialized = -1;
         this.prestige_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_PlayerSettlePrestige_15486();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_PlayerSettlePrestige_15486(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                           this.prestige_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.prestige_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.prestige_ = Collections.unmodifiableList(this.prestige_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettlePrestige_15486_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettlePrestige_15486_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_PlayerSettlePrestige_15486.class, Builder.class);
      }

      public List<CommonMsg.MapDataII> getPrestigeList() {
         return this.prestige_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getPrestigeOrBuilderList() {
         return this.prestige_;
      }

      public int getPrestigeCount() {
         return this.prestige_.size();
      }

      public CommonMsg.MapDataII getPrestige(int index) {
         return (CommonMsg.MapDataII)this.prestige_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getPrestigeOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.prestige_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getPrestigeCount(); ++i) {
               if (!this.getPrestige(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.prestige_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.prestige_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.prestige_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.prestige_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_PlayerSettlePrestige_15486)) {
            return super.equals(obj);
         } else {
            CR2S_PlayerSettlePrestige_15486 other = (CR2S_PlayerSettlePrestige_15486)obj;
            if (!this.getPrestigeList().equals(other.getPrestigeList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getPrestigeCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPrestigeList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_PlayerSettlePrestige_15486 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_PlayerSettlePrestige_15486)PARSER.parseFrom(data);
      }

      public static CR2S_PlayerSettlePrestige_15486 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayerSettlePrestige_15486)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayerSettlePrestige_15486 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_PlayerSettlePrestige_15486)PARSER.parseFrom(data);
      }

      public static CR2S_PlayerSettlePrestige_15486 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayerSettlePrestige_15486)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayerSettlePrestige_15486 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_PlayerSettlePrestige_15486)PARSER.parseFrom(data);
      }

      public static CR2S_PlayerSettlePrestige_15486 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayerSettlePrestige_15486)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayerSettlePrestige_15486 parseFrom(InputStream input) throws IOException {
         return (CR2S_PlayerSettlePrestige_15486)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_PlayerSettlePrestige_15486 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayerSettlePrestige_15486)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_PlayerSettlePrestige_15486 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_PlayerSettlePrestige_15486)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_PlayerSettlePrestige_15486 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayerSettlePrestige_15486)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_PlayerSettlePrestige_15486 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_PlayerSettlePrestige_15486)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_PlayerSettlePrestige_15486 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayerSettlePrestige_15486)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_PlayerSettlePrestige_15486 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_PlayerSettlePrestige_15486 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_PlayerSettlePrestige_15486> parser() {
         return PARSER;
      }

      public Parser<CR2S_PlayerSettlePrestige_15486> getParserForType() {
         return PARSER;
      }

      public CR2S_PlayerSettlePrestige_15486 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_PlayerSettlePrestige_15486OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MapDataII> prestige_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> prestigeBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettlePrestige_15486_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettlePrestige_15486_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_PlayerSettlePrestige_15486.class, Builder.class);
         }

         private Builder() {
            this.prestige_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.prestige_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.CR2S_PlayerSettlePrestige_15486.alwaysUseFieldBuilders) {
               this.getPrestigeFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.prestigeBuilder_ == null) {
               this.prestige_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.prestigeBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_PlayerSettlePrestige_15486_descriptor;
         }

         public CR2S_PlayerSettlePrestige_15486 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.CR2S_PlayerSettlePrestige_15486.getDefaultInstance();
         }

         public CR2S_PlayerSettlePrestige_15486 build() {
            CR2S_PlayerSettlePrestige_15486 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_PlayerSettlePrestige_15486 buildPartial() {
            CR2S_PlayerSettlePrestige_15486 result = new CR2S_PlayerSettlePrestige_15486(this);
            int from_bitField0_ = this.bitField0_;
            if (this.prestigeBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.prestige_ = Collections.unmodifiableList(this.prestige_);
                  this.bitField0_ &= -2;
               }

               result.prestige_ = this.prestige_;
            } else {
               result.prestige_ = this.prestigeBuilder_.build();
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
            if (other instanceof CR2S_PlayerSettlePrestige_15486) {
               return this.mergeFrom((CR2S_PlayerSettlePrestige_15486)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_PlayerSettlePrestige_15486 other) {
            if (other == CrossCatchDeerMsg.CR2S_PlayerSettlePrestige_15486.getDefaultInstance()) {
               return this;
            } else {
               if (this.prestigeBuilder_ == null) {
                  if (!other.prestige_.isEmpty()) {
                     if (this.prestige_.isEmpty()) {
                        this.prestige_ = other.prestige_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensurePrestigeIsMutable();
                        this.prestige_.addAll(other.prestige_);
                     }

                     this.onChanged();
                  }
               } else if (!other.prestige_.isEmpty()) {
                  if (this.prestigeBuilder_.isEmpty()) {
                     this.prestigeBuilder_.dispose();
                     this.prestigeBuilder_ = null;
                     this.prestige_ = other.prestige_;
                     this.bitField0_ &= -2;
                     this.prestigeBuilder_ = CrossCatchDeerMsg.CR2S_PlayerSettlePrestige_15486.alwaysUseFieldBuilders ? this.getPrestigeFieldBuilder() : null;
                  } else {
                     this.prestigeBuilder_.addAllMessages(other.prestige_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getPrestigeCount(); ++i) {
               if (!this.getPrestige(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_PlayerSettlePrestige_15486 parsedMessage = null;

            try {
               parsedMessage = (CR2S_PlayerSettlePrestige_15486)CrossCatchDeerMsg.CR2S_PlayerSettlePrestige_15486.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_PlayerSettlePrestige_15486)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensurePrestigeIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.prestige_ = new ArrayList(this.prestige_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MapDataII> getPrestigeList() {
            return this.prestigeBuilder_ == null ? Collections.unmodifiableList(this.prestige_) : this.prestigeBuilder_.getMessageList();
         }

         public int getPrestigeCount() {
            return this.prestigeBuilder_ == null ? this.prestige_.size() : this.prestigeBuilder_.getCount();
         }

         public CommonMsg.MapDataII getPrestige(int index) {
            return this.prestigeBuilder_ == null ? (CommonMsg.MapDataII)this.prestige_.get(index) : (CommonMsg.MapDataII)this.prestigeBuilder_.getMessage(index);
         }

         public Builder setPrestige(int index, CommonMsg.MapDataII value) {
            if (this.prestigeBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePrestigeIsMutable();
               this.prestige_.set(index, value);
               this.onChanged();
            } else {
               this.prestigeBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPrestige(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.prestigeBuilder_ == null) {
               this.ensurePrestigeIsMutable();
               this.prestige_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.prestigeBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPrestige(CommonMsg.MapDataII value) {
            if (this.prestigeBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePrestigeIsMutable();
               this.prestige_.add(value);
               this.onChanged();
            } else {
               this.prestigeBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPrestige(int index, CommonMsg.MapDataII value) {
            if (this.prestigeBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePrestigeIsMutable();
               this.prestige_.add(index, value);
               this.onChanged();
            } else {
               this.prestigeBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPrestige(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.prestigeBuilder_ == null) {
               this.ensurePrestigeIsMutable();
               this.prestige_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.prestigeBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPrestige(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.prestigeBuilder_ == null) {
               this.ensurePrestigeIsMutable();
               this.prestige_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.prestigeBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPrestige(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.prestigeBuilder_ == null) {
               this.ensurePrestigeIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.prestige_);
               this.onChanged();
            } else {
               this.prestigeBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPrestige() {
            if (this.prestigeBuilder_ == null) {
               this.prestige_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.prestigeBuilder_.clear();
            }

            return this;
         }

         public Builder removePrestige(int index) {
            if (this.prestigeBuilder_ == null) {
               this.ensurePrestigeIsMutable();
               this.prestige_.remove(index);
               this.onChanged();
            } else {
               this.prestigeBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getPrestigeBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getPrestigeFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getPrestigeOrBuilder(int index) {
            return this.prestigeBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.prestige_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.prestigeBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getPrestigeOrBuilderList() {
            return this.prestigeBuilder_ != null ? this.prestigeBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.prestige_);
         }

         public CommonMsg.MapDataII.Builder addPrestigeBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getPrestigeFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addPrestigeBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getPrestigeFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getPrestigeBuilderList() {
            return this.getPrestigeFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getPrestigeFieldBuilder() {
            if (this.prestigeBuilder_ == null) {
               this.prestigeBuilder_ = new RepeatedFieldBuilderV3(this.prestige_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.prestige_ = null;
            }

            return this.prestigeBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_PlayerArraying_15487 extends GeneratedMessageV3 implements S2CR_PlayerArraying_15487OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ARRAYING_FIELD_NUMBER = 1;
      private ByteString arraying_;
      private byte memoizedIsInitialized;
      private static final S2CR_PlayerArraying_15487 DEFAULT_INSTANCE = new S2CR_PlayerArraying_15487();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_PlayerArraying_15487> PARSER = new AbstractParser<S2CR_PlayerArraying_15487>() {
         public S2CR_PlayerArraying_15487 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_PlayerArraying_15487(input, extensionRegistry);
         }
      };

      private S2CR_PlayerArraying_15487(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_PlayerArraying_15487() {
         this.memoizedIsInitialized = -1;
         this.arraying_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_PlayerArraying_15487();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_PlayerArraying_15487(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerArraying_15487_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerArraying_15487_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerArraying_15487.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_PlayerArraying_15487)) {
            return super.equals(obj);
         } else {
            S2CR_PlayerArraying_15487 other = (S2CR_PlayerArraying_15487)obj;
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

      public static S2CR_PlayerArraying_15487 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerArraying_15487)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerArraying_15487 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerArraying_15487)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerArraying_15487 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerArraying_15487)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerArraying_15487 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerArraying_15487)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerArraying_15487 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerArraying_15487)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerArraying_15487 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerArraying_15487)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerArraying_15487 parseFrom(InputStream input) throws IOException {
         return (S2CR_PlayerArraying_15487)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerArraying_15487 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerArraying_15487)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerArraying_15487 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_PlayerArraying_15487)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_PlayerArraying_15487 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerArraying_15487)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerArraying_15487 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_PlayerArraying_15487)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerArraying_15487 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerArraying_15487)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_PlayerArraying_15487 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_PlayerArraying_15487 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_PlayerArraying_15487> parser() {
         return PARSER;
      }

      public Parser<S2CR_PlayerArraying_15487> getParserForType() {
         return PARSER;
      }

      public S2CR_PlayerArraying_15487 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_PlayerArraying_15487OrBuilder {
         private int bitField0_;
         private ByteString arraying_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerArraying_15487_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerArraying_15487_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerArraying_15487.class, Builder.class);
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
            if (CrossCatchDeerMsg.S2CR_PlayerArraying_15487.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.arraying_ = ByteString.EMPTY;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_PlayerArraying_15487_descriptor;
         }

         public S2CR_PlayerArraying_15487 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.S2CR_PlayerArraying_15487.getDefaultInstance();
         }

         public S2CR_PlayerArraying_15487 build() {
            S2CR_PlayerArraying_15487 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_PlayerArraying_15487 buildPartial() {
            S2CR_PlayerArraying_15487 result = new S2CR_PlayerArraying_15487(this);
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
            if (other instanceof S2CR_PlayerArraying_15487) {
               return this.mergeFrom((S2CR_PlayerArraying_15487)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_PlayerArraying_15487 other) {
            if (other == CrossCatchDeerMsg.S2CR_PlayerArraying_15487.getDefaultInstance()) {
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
            S2CR_PlayerArraying_15487 parsedMessage = null;

            try {
               parsedMessage = (S2CR_PlayerArraying_15487)CrossCatchDeerMsg.S2CR_PlayerArraying_15487.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_PlayerArraying_15487)e.getUnfinishedMessage();
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
            this.arraying_ = CrossCatchDeerMsg.S2CR_PlayerArraying_15487.getDefaultInstance().getArraying();
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

   public static final class CR2S_ActivityPlayer_15488 extends GeneratedMessageV3 implements CR2S_ActivityPlayer_15488OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private Internal.IntList playerId_;
      private byte memoizedIsInitialized;
      private static final CR2S_ActivityPlayer_15488 DEFAULT_INSTANCE = new CR2S_ActivityPlayer_15488();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_ActivityPlayer_15488> PARSER = new AbstractParser<CR2S_ActivityPlayer_15488>() {
         public CR2S_ActivityPlayer_15488 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_ActivityPlayer_15488(input, extensionRegistry);
         }
      };

      private CR2S_ActivityPlayer_15488(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_ActivityPlayer_15488() {
         this.memoizedIsInitialized = -1;
         this.playerId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_ActivityPlayer_15488();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_ActivityPlayer_15488(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_ActivityPlayer_15488_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_ActivityPlayer_15488_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ActivityPlayer_15488.class, Builder.class);
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
         } else if (!(obj instanceof CR2S_ActivityPlayer_15488)) {
            return super.equals(obj);
         } else {
            CR2S_ActivityPlayer_15488 other = (CR2S_ActivityPlayer_15488)obj;
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

      public static CR2S_ActivityPlayer_15488 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_ActivityPlayer_15488)PARSER.parseFrom(data);
      }

      public static CR2S_ActivityPlayer_15488 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ActivityPlayer_15488)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ActivityPlayer_15488 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_ActivityPlayer_15488)PARSER.parseFrom(data);
      }

      public static CR2S_ActivityPlayer_15488 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ActivityPlayer_15488)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ActivityPlayer_15488 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_ActivityPlayer_15488)PARSER.parseFrom(data);
      }

      public static CR2S_ActivityPlayer_15488 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ActivityPlayer_15488)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ActivityPlayer_15488 parseFrom(InputStream input) throws IOException {
         return (CR2S_ActivityPlayer_15488)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ActivityPlayer_15488 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ActivityPlayer_15488)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ActivityPlayer_15488 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_ActivityPlayer_15488)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_ActivityPlayer_15488 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ActivityPlayer_15488)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ActivityPlayer_15488 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_ActivityPlayer_15488)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ActivityPlayer_15488 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ActivityPlayer_15488)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_ActivityPlayer_15488 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_ActivityPlayer_15488 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_ActivityPlayer_15488> parser() {
         return PARSER;
      }

      public Parser<CR2S_ActivityPlayer_15488> getParserForType() {
         return PARSER;
      }

      public CR2S_ActivityPlayer_15488 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_ActivityPlayer_15488OrBuilder {
         private int bitField0_;
         private Internal.IntList playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_ActivityPlayer_15488_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_ActivityPlayer_15488_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ActivityPlayer_15488.class, Builder.class);
         }

         private Builder() {
            this.playerId_ = CrossCatchDeerMsg.CR2S_ActivityPlayer_15488.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerId_ = CrossCatchDeerMsg.CR2S_ActivityPlayer_15488.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.CR2S_ActivityPlayer_15488.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = CrossCatchDeerMsg.CR2S_ActivityPlayer_15488.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_ActivityPlayer_15488_descriptor;
         }

         public CR2S_ActivityPlayer_15488 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.CR2S_ActivityPlayer_15488.getDefaultInstance();
         }

         public CR2S_ActivityPlayer_15488 build() {
            CR2S_ActivityPlayer_15488 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_ActivityPlayer_15488 buildPartial() {
            CR2S_ActivityPlayer_15488 result = new CR2S_ActivityPlayer_15488(this);
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
            if (other instanceof CR2S_ActivityPlayer_15488) {
               return this.mergeFrom((CR2S_ActivityPlayer_15488)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_ActivityPlayer_15488 other) {
            if (other == CrossCatchDeerMsg.CR2S_ActivityPlayer_15488.getDefaultInstance()) {
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
            CR2S_ActivityPlayer_15488 parsedMessage = null;

            try {
               parsedMessage = (CR2S_ActivityPlayer_15488)CrossCatchDeerMsg.CR2S_ActivityPlayer_15488.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_ActivityPlayer_15488)e.getUnfinishedMessage();
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
               this.playerId_ = CrossCatchDeerMsg.CR2S_ActivityPlayer_15488.mutableCopy(this.playerId_);
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
            this.playerId_ = CrossCatchDeerMsg.CR2S_ActivityPlayer_15488.emptyIntList();
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

   public static final class CR2S_GuessSuccess_15490 extends GeneratedMessageV3 implements CR2S_GuessSuccess_15490OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int PLAYERIDS_FIELD_NUMBER = 1;
      private Internal.IntList playerIds_;
      private byte memoizedIsInitialized;
      private static final CR2S_GuessSuccess_15490 DEFAULT_INSTANCE = new CR2S_GuessSuccess_15490();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_GuessSuccess_15490> PARSER = new AbstractParser<CR2S_GuessSuccess_15490>() {
         public CR2S_GuessSuccess_15490 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_GuessSuccess_15490(input, extensionRegistry);
         }
      };

      private CR2S_GuessSuccess_15490(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_GuessSuccess_15490() {
         this.memoizedIsInitialized = -1;
         this.playerIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_GuessSuccess_15490();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_GuessSuccess_15490(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                           this.playerIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.playerIds_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.playerIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.playerIds_.addInt(input.readInt32());
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
                  this.playerIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessSuccess_15490_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessSuccess_15490_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_GuessSuccess_15490.class, Builder.class);
      }

      public List<Integer> getPlayerIdsList() {
         return this.playerIds_;
      }

      public int getPlayerIdsCount() {
         return this.playerIds_.size();
      }

      public int getPlayerIds(int index) {
         return this.playerIds_.getInt(index);
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
         for(int i = 0; i < this.playerIds_.size(); ++i) {
            output.writeInt32(1, this.playerIds_.getInt(i));
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

            for(int i = 0; i < this.playerIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.playerIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPlayerIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_GuessSuccess_15490)) {
            return super.equals(obj);
         } else {
            CR2S_GuessSuccess_15490 other = (CR2S_GuessSuccess_15490)obj;
            if (!this.getPlayerIdsList().equals(other.getPlayerIdsList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getPlayerIdsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_GuessSuccess_15490 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_GuessSuccess_15490)PARSER.parseFrom(data);
      }

      public static CR2S_GuessSuccess_15490 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GuessSuccess_15490)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GuessSuccess_15490 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_GuessSuccess_15490)PARSER.parseFrom(data);
      }

      public static CR2S_GuessSuccess_15490 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GuessSuccess_15490)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GuessSuccess_15490 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_GuessSuccess_15490)PARSER.parseFrom(data);
      }

      public static CR2S_GuessSuccess_15490 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GuessSuccess_15490)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GuessSuccess_15490 parseFrom(InputStream input) throws IOException {
         return (CR2S_GuessSuccess_15490)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_GuessSuccess_15490 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GuessSuccess_15490)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_GuessSuccess_15490 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_GuessSuccess_15490)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_GuessSuccess_15490 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GuessSuccess_15490)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_GuessSuccess_15490 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_GuessSuccess_15490)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_GuessSuccess_15490 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GuessSuccess_15490)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_GuessSuccess_15490 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_GuessSuccess_15490 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_GuessSuccess_15490> parser() {
         return PARSER;
      }

      public Parser<CR2S_GuessSuccess_15490> getParserForType() {
         return PARSER;
      }

      public CR2S_GuessSuccess_15490 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_GuessSuccess_15490OrBuilder {
         private int bitField0_;
         private Internal.IntList playerIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessSuccess_15490_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessSuccess_15490_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_GuessSuccess_15490.class, Builder.class);
         }

         private Builder() {
            this.playerIds_ = CrossCatchDeerMsg.CR2S_GuessSuccess_15490.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerIds_ = CrossCatchDeerMsg.CR2S_GuessSuccess_15490.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.CR2S_GuessSuccess_15490.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerIds_ = CrossCatchDeerMsg.CR2S_GuessSuccess_15490.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_CR2S_GuessSuccess_15490_descriptor;
         }

         public CR2S_GuessSuccess_15490 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.CR2S_GuessSuccess_15490.getDefaultInstance();
         }

         public CR2S_GuessSuccess_15490 build() {
            CR2S_GuessSuccess_15490 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_GuessSuccess_15490 buildPartial() {
            CR2S_GuessSuccess_15490 result = new CR2S_GuessSuccess_15490(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.playerIds_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.playerIds_ = this.playerIds_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_GuessSuccess_15490) {
               return this.mergeFrom((CR2S_GuessSuccess_15490)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_GuessSuccess_15490 other) {
            if (other == CrossCatchDeerMsg.CR2S_GuessSuccess_15490.getDefaultInstance()) {
               return this;
            } else {
               if (!other.playerIds_.isEmpty()) {
                  if (this.playerIds_.isEmpty()) {
                     this.playerIds_ = other.playerIds_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensurePlayerIdsIsMutable();
                     this.playerIds_.addAll(other.playerIds_);
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
            CR2S_GuessSuccess_15490 parsedMessage = null;

            try {
               parsedMessage = (CR2S_GuessSuccess_15490)CrossCatchDeerMsg.CR2S_GuessSuccess_15490.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_GuessSuccess_15490)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensurePlayerIdsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.playerIds_ = CrossCatchDeerMsg.CR2S_GuessSuccess_15490.mutableCopy(this.playerIds_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getPlayerIdsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.playerIds_) : this.playerIds_);
         }

         public int getPlayerIdsCount() {
            return this.playerIds_.size();
         }

         public int getPlayerIds(int index) {
            return this.playerIds_.getInt(index);
         }

         public Builder setPlayerIds(int index, int value) {
            this.ensurePlayerIdsIsMutable();
            this.playerIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPlayerIds(int value) {
            this.ensurePlayerIdsIsMutable();
            this.playerIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPlayerIds(Iterable<? extends Integer> values) {
            this.ensurePlayerIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.playerIds_);
            this.onChanged();
            return this;
         }

         public Builder clearPlayerIds() {
            this.playerIds_ = CrossCatchDeerMsg.CR2S_GuessSuccess_15490.emptyIntList();
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

   public static final class S2CR_Gm_15499 extends GeneratedMessageV3 implements S2CR_Gm_15499OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ORDER_FIELD_NUMBER = 1;
      private volatile Object order_;
      private byte memoizedIsInitialized;
      private static final S2CR_Gm_15499 DEFAULT_INSTANCE = new S2CR_Gm_15499();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Gm_15499> PARSER = new AbstractParser<S2CR_Gm_15499>() {
         public S2CR_Gm_15499 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Gm_15499(input, extensionRegistry);
         }
      };

      private S2CR_Gm_15499(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Gm_15499() {
         this.memoizedIsInitialized = -1;
         this.order_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Gm_15499();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Gm_15499(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.order_ = bs;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Gm_15499_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Gm_15499_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Gm_15499.class, Builder.class);
      }

      public boolean hasOrder() {
         return (this.bitField0_ & 1) != 0;
      }

      public String getOrder() {
         Object ref = this.order_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.order_ = s;
            }

            return s;
         }
      }

      public ByteString getOrderBytes() {
         Object ref = this.order_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.order_ = b;
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
         } else if (!this.hasOrder()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.order_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.order_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_Gm_15499)) {
            return super.equals(obj);
         } else {
            S2CR_Gm_15499 other = (S2CR_Gm_15499)obj;
            if (this.hasOrder() != other.hasOrder()) {
               return false;
            } else if (this.hasOrder() && !this.getOrder().equals(other.getOrder())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasOrder()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOrder().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_Gm_15499 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Gm_15499)PARSER.parseFrom(data);
      }

      public static S2CR_Gm_15499 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Gm_15499)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Gm_15499 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Gm_15499)PARSER.parseFrom(data);
      }

      public static S2CR_Gm_15499 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Gm_15499)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Gm_15499 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Gm_15499)PARSER.parseFrom(data);
      }

      public static S2CR_Gm_15499 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Gm_15499)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Gm_15499 parseFrom(InputStream input) throws IOException {
         return (S2CR_Gm_15499)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Gm_15499 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Gm_15499)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Gm_15499 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Gm_15499)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Gm_15499 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Gm_15499)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Gm_15499 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Gm_15499)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Gm_15499 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Gm_15499)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Gm_15499 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Gm_15499 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Gm_15499> parser() {
         return PARSER;
      }

      public Parser<S2CR_Gm_15499> getParserForType() {
         return PARSER;
      }

      public S2CR_Gm_15499 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Gm_15499OrBuilder {
         private int bitField0_;
         private Object order_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Gm_15499_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Gm_15499_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Gm_15499.class, Builder.class);
         }

         private Builder() {
            this.order_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.order_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCatchDeerMsg.S2CR_Gm_15499.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.order_ = "";
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCatchDeerMsg.internal_static_crossCatchDeer_com_gzbz_protobuf_S2CR_Gm_15499_descriptor;
         }

         public S2CR_Gm_15499 getDefaultInstanceForType() {
            return CrossCatchDeerMsg.S2CR_Gm_15499.getDefaultInstance();
         }

         public S2CR_Gm_15499 build() {
            S2CR_Gm_15499 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Gm_15499 buildPartial() {
            S2CR_Gm_15499 result = new S2CR_Gm_15499(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.order_ = this.order_;
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
            if (other instanceof S2CR_Gm_15499) {
               return this.mergeFrom((S2CR_Gm_15499)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Gm_15499 other) {
            if (other == CrossCatchDeerMsg.S2CR_Gm_15499.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOrder()) {
                  this.bitField0_ |= 1;
                  this.order_ = other.order_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasOrder();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_Gm_15499 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Gm_15499)CrossCatchDeerMsg.S2CR_Gm_15499.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Gm_15499)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOrder() {
            return (this.bitField0_ & 1) != 0;
         }

         public String getOrder() {
            Object ref = this.order_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.order_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getOrderBytes() {
            Object ref = this.order_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.order_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setOrder(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.order_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearOrder() {
            this.bitField0_ &= -2;
            this.order_ = CrossCatchDeerMsg.S2CR_Gm_15499.getDefaultInstance().getOrder();
            this.onChanged();
            return this;
         }

         public Builder setOrderBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.order_ = value;
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

   public interface CR2S_ActivityPlayer_15488OrBuilder extends MessageOrBuilder {
      List<Integer> getPlayerIdList();

      int getPlayerIdCount();

      int getPlayerId(int index);
   }

   public interface CR2S_ActivityState_15474OrBuilder extends MessageOrBuilder {
      boolean hasState();

      int getState();

      boolean hasStartTime();

      int getStartTime();

      boolean hasDownTime();

      int getDownTime();

      boolean hasIsActivityDay();

      boolean getIsActivityDay();
   }

   public interface CR2S_GuessFightRecord_15480OrBuilder extends MessageOrBuilder {
      boolean hasGuessRecordId();

      int getGuessRecordId();
   }

   public interface CR2S_GuessOdds_15478OrBuilder extends MessageOrBuilder {
      boolean hasLeftOdds();

      double getLeftOdds();

      boolean hasRightOdds();

      double getRightOdds();
   }

   public interface CR2S_GuessSuccess_15490OrBuilder extends MessageOrBuilder {
      List<Integer> getPlayerIdsList();

      int getPlayerIdsCount();

      int getPlayerIds(int index);
   }

   public interface CR2S_MyFight_15402OrBuilder extends MessageOrBuilder {
   }

   public interface CR2S_NoticeGameServerUpload_15472OrBuilder extends MessageOrBuilder {
      boolean hasIsMoveServer();

      boolean getIsMoveServer();

      boolean hasNum();

      int getNum();
   }

   public interface CR2S_PlayerInfo_15466OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasBeThumbsUpId();

      int getBeThumbsUpId();
   }

   public interface CR2S_PlayerSettlePlains_15482OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MapDataII> getPlainsList();

      CommonMsg.MapDataII getPlains(int index);

      int getPlainsCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getPlainsOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getPlainsOrBuilder(int index);
   }

   public interface CR2S_PlayerSettlePrestige_15486OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MapDataII> getPrestigeList();

      CommonMsg.MapDataII getPrestige(int index);

      int getPrestigeCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getPrestigeOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getPrestigeOrBuilder(int index);
   }

   public interface CR2S_PlayerSettleRank_15484OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MapDataII> getRankList();

      CommonMsg.MapDataII getRank(int index);

      int getRankCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getRankOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getRankOrBuilder(int index);
   }

   public interface CR2S_RoundAndState_15476OrBuilder extends MessageOrBuilder {
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

   public interface CatchDeerPlayerArrayingOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPower();

      long getPower();

      boolean hasHeroArrayingData();

      ByteString getHeroArrayingData();
   }

   public interface S2CR_ActivityState_15451OrBuilder extends MessageOrBuilder {
      boolean hasIsOpenServer();

      boolean getIsOpenServer();
   }

   public interface S2CR_ActivityState_15473OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_BattleRecordData_15469OrBuilder extends MessageOrBuilder {
      boolean hasRecordId();

      int getRecordId();
   }

   public interface S2CR_Gm_15499OrBuilder extends MessageOrBuilder {
      boolean hasOrder();

      String getOrder();

      ByteString getOrderBytes();
   }

   public interface S2CR_GuessFightRecord_15479OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_GuessOdds_15477OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_GuessRecordAll_15419OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_GuessRecord_15417OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_GuessUi_15411OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_Guess_15413OrBuilder extends MessageOrBuilder {
      boolean hasWagerSide();

      int getWagerSide();

      boolean hasWagerNum();

      int getWagerNum();
   }

   public interface S2CR_MyFightUi_15401OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_MyRecordUi_15403OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_NoticeGameServerUpload_15471OrBuilder extends MessageOrBuilder {
      List<CatchDeerPlayerArraying> getPlayerArrayingsList();

      CatchDeerPlayerArraying getPlayerArrayings(int index);

      int getPlayerArrayingsCount();

      List<? extends CatchDeerPlayerArrayingOrBuilder> getPlayerArrayingsOrBuilderList();

      CatchDeerPlayerArrayingOrBuilder getPlayerArrayingsOrBuilder(int index);
   }

   public interface S2CR_PlayerArraying_15487OrBuilder extends MessageOrBuilder {
      boolean hasArraying();

      ByteString getArraying();
   }

   public interface S2CR_PlayerInfo_15467OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasServerId();

      int getServerId();
   }

   public interface S2CR_PlayerKCPSettle_15461OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_PlayerSettlePlains_15481OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_PlayerSettlePrestige_15485OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_PlayerSettleRank_15483OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_Rank32Ui_15431OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_RankUi_15441OrBuilder extends MessageOrBuilder {
      List<Integer> getThumbsUpsList();

      int getThumbsUpsCount();

      int getThumbsUps(int index);
   }

   public interface S2CR_RoundAndState_15475OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_SeasonTopThree_15443OrBuilder extends MessageOrBuilder {
      boolean hasMaxRank();

      int getMaxRank();

      List<Integer> getThumbsUpsList();

      int getThumbsUpsCount();

      int getThumbsUps(int index);

      boolean hasIsOpenServer();

      boolean getIsOpenServer();
   }

   public interface S2CR_ThumbsUp_15465OrBuilder extends MessageOrBuilder {
      boolean hasBeThumbsUpId();

      int getBeThumbsUpId();
   }
}
