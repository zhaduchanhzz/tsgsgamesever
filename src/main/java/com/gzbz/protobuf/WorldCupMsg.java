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

public final class WorldCupMsg {
   private static final Descriptors.Descriptor internal_static_worldCup_com_gzbz_protobuf_GuessInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldCup_com_gzbz_protobuf_GuessInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldCup_com_gzbz_protobuf_CellMatchInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldCup_com_gzbz_protobuf_CellMatchInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldCup_com_gzbz_protobuf_C2S_ActInfo_23001_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldCup_com_gzbz_protobuf_C2S_ActInfo_23001_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldCup_com_gzbz_protobuf_S2C_ActInfo_23002_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldCup_com_gzbz_protobuf_S2C_ActInfo_23002_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldCup_com_gzbz_protobuf_C2S_GuessWin_23003_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldCup_com_gzbz_protobuf_C2S_GuessWin_23003_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldCup_com_gzbz_protobuf_S2C_GuessWin_23004_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldCup_com_gzbz_protobuf_S2C_GuessWin_23004_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldCup_com_gzbz_protobuf_C2S_GetCoin_23005_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldCup_com_gzbz_protobuf_C2S_GetCoin_23005_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldCup_com_gzbz_protobuf_S2C_GetCoin_23006_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldCup_com_gzbz_protobuf_S2C_GetCoin_23006_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldCup_com_gzbz_protobuf_C2S_MatchInfos_23007_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldCup_com_gzbz_protobuf_C2S_MatchInfos_23007_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldCup_com_gzbz_protobuf_S2C_MatchInfos_23008_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldCup_com_gzbz_protobuf_S2C_MatchInfos_23008_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldCup_com_gzbz_protobuf_C2S_ExchangeCoin_23009_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldCup_com_gzbz_protobuf_C2S_ExchangeCoin_23009_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldCup_com_gzbz_protobuf_S2C_ExchangeCoin_23010_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldCup_com_gzbz_protobuf_S2C_ExchangeCoin_23010_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldCup_com_gzbz_protobuf_C2S_TaskList_23011_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldCup_com_gzbz_protobuf_C2S_TaskList_23011_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldCup_com_gzbz_protobuf_S2C_TaskList_23012_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldCup_com_gzbz_protobuf_S2C_TaskList_23012_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldCup_com_gzbz_protobuf_C2S_TaskReward_23013_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldCup_com_gzbz_protobuf_C2S_TaskReward_23013_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldCup_com_gzbz_protobuf_S2C_TaskReward_23014_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldCup_com_gzbz_protobuf_S2C_TaskReward_23014_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldCup_com_gzbz_protobuf_S2C_TaskNotify_23016_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldCup_com_gzbz_protobuf_S2C_TaskNotify_23016_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldCup_com_gzbz_protobuf_S2C_NewMatchInfo_23018_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldCup_com_gzbz_protobuf_S2C_NewMatchInfo_23018_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldCup_com_gzbz_protobuf_S2C_UpdateOdds_23020_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldCup_com_gzbz_protobuf_S2C_UpdateOdds_23020_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldCup_com_gzbz_protobuf_C2S_GuessRecord_23021_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldCup_com_gzbz_protobuf_C2S_GuessRecord_23021_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldCup_com_gzbz_protobuf_S2C_GuessRecord_23022_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldCup_com_gzbz_protobuf_S2C_GuessRecord_23022_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldCup_com_gzbz_protobuf_S2C_UpdateResult_23024_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldCup_com_gzbz_protobuf_S2C_UpdateResult_23024_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_worldCup_com_gzbz_protobuf_S2C_UpateTotalGuessCoin_23026_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_worldCup_com_gzbz_protobuf_S2C_UpateTotalGuessCoin_23026_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private WorldCupMsg() {
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
      String[] descriptorData = new String[]{"\n\u000eWorldCup.proto\u0012\u001aworldCup.com.gzbz.protobuf\u001a\fcommon.proto\"5\n\tGuessInfo\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005winId\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005wager\u0018\u0003 \u0002(\u0005\"¯\u0001\n\rCellMatchInfo\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005teams\u0018\u0002 \u0003(\u0005\u0012\f\n\u0004odds\u0018\u0003 \u0003(\u0005\u0012\u0014\n\fguessEndTime\u0018\u0004 \u0002(\u0005\u00128\n\tguessInfo\u0018\u0005 \u0001(\u000b2%.worldCup.com.gzbz.protobuf.GuessInfo\u0012\u0016\n\u000etotalGuessCoin\u0018\u0006 \u0003(\u0003\u0012\r\n\u0005winId\u0018\u0007 \u0001(\u0005\"\u0013\n\u0011C2S_ActInfo_23001\"V\n\u0011S2C_ActInfo_23002\u0012\u0013\n\u000bgetCoinTime\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rtotalExchange\u0018\u0002 \u0002(\u0005\u0012\u0015\n\rexchangeReset\u0018\u0003 \u0002(\u0005\"N\n\u0012C2S_GuessWin_23003\u00128\n\tguessInfo\u0018\u0001 \u0002(\u000b2%.worldCup.com.gzbz.protobuf.GuessInfo\"N\n\u0012S2C_GuessWin_23004\u00128\n\tguessInfo\u0018\u0001 \u0002(\u000b2%.worldCup.com.gzbz.protobuf.GuessInfo\"\u0013\n\u0011C2S_GetCoin_23005\"(\n\u0011S2C_GetCoin_23006\u0012\u0013\n\u000bgetCoinTime\u0018\u0001 \u0002(\u0005\"\"\n\u0014C2S_MatchInfos_23007\u0012\n\n\u0002id\u0018\u0001 \u0001(\u0005\"O\n\u0014S2C_MatchInfos_23008\u00127\n\u0004info\u0018\u0001 \u0003(\u000b2).worldCup.com.gzbz.protobuf.CellMatchInfo\"'\n\u0016C2S_ExchangeCoin_23009\u0012\r\n\u0005count\u0018\u0001 \u0002(\u0005\"F\n\u0016S2C_ExchangeCoin_23010\u0012\u0015\n\rtotalExchange\u0018\u0002 \u0002(\u0005\u0012\u0015\n\rexchangeReset\u0018\u0003 \u0002(\u0005\"\u0014\n\u0012C2S_TaskList_23011\"0\n\u0012S2C_TaskList_23012\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\"$\n\u0014C2S_TaskReward_23013\u0012\f\n\u0004task\u0018\u0001 \u0002(\u0005\"$\n\u0014S2C_TaskReward_23014\u0012\f\n\u0004task\u0018\u0001 \u0002(\u0005\"2\n\u0014S2C_TaskNotify_23016\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\"Q\n\u0016S2C_NewMatchInfo_23018\u00127\n\u0004info\u0018\u0001 \u0003(\u000b2).worldCup.com.gzbz.protobuf.CellMatchInfo\"0\n\u0014S2C_UpdateOdds_23020\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004odds\u0018\u0002 \u0003(\u0005\"\u0017\n\u0015C2S_GuessRecord_23021\"P\n\u0015S2C_GuessRecord_23022\u00127\n\u0004info\u0018\u0001 \u0003(\u000b2).worldCup.com.gzbz.protobuf.CellMatchInfo\";\n\u0016S2C_UpdateResult_23024\u0012!\n\u0006result\u0018\u0001 \u0003(\u000b2\u0011.common.MapDataII\"C\n\u001dS2C_UpateTotalGuessCoin_23026\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000etotalGuessCoin\u0018\u0002 \u0003(\u0003*_\n\nGuessState\u0012\u000f\n\u000bSTATE_DOING\u0010\u0000\u0012\u000e\n\nSTATE_COOL\u0010\u0001\u0012\u000e\n\nSTATE_WIAT\u0010\u0002\u0012\u0010\n\fSTATE_FINISH\u0010\u0003\u0012\u000e\n\nSTATE_STOP\u0010\u0004B\"\n\u0011com.gzbz.protobufB\u000bWorldCupMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_worldCup_com_gzbz_protobuf_GuessInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_worldCup_com_gzbz_protobuf_GuessInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldCup_com_gzbz_protobuf_GuessInfo_descriptor, new String[]{"Id", "WinId", "Wager"});
      internal_static_worldCup_com_gzbz_protobuf_CellMatchInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_worldCup_com_gzbz_protobuf_CellMatchInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldCup_com_gzbz_protobuf_CellMatchInfo_descriptor, new String[]{"Id", "Teams", "Odds", "GuessEndTime", "GuessInfo", "TotalGuessCoin", "WinId"});
      internal_static_worldCup_com_gzbz_protobuf_C2S_ActInfo_23001_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_worldCup_com_gzbz_protobuf_C2S_ActInfo_23001_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldCup_com_gzbz_protobuf_C2S_ActInfo_23001_descriptor, new String[0]);
      internal_static_worldCup_com_gzbz_protobuf_S2C_ActInfo_23002_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_worldCup_com_gzbz_protobuf_S2C_ActInfo_23002_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldCup_com_gzbz_protobuf_S2C_ActInfo_23002_descriptor, new String[]{"GetCoinTime", "TotalExchange", "ExchangeReset"});
      internal_static_worldCup_com_gzbz_protobuf_C2S_GuessWin_23003_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_worldCup_com_gzbz_protobuf_C2S_GuessWin_23003_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldCup_com_gzbz_protobuf_C2S_GuessWin_23003_descriptor, new String[]{"GuessInfo"});
      internal_static_worldCup_com_gzbz_protobuf_S2C_GuessWin_23004_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_worldCup_com_gzbz_protobuf_S2C_GuessWin_23004_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldCup_com_gzbz_protobuf_S2C_GuessWin_23004_descriptor, new String[]{"GuessInfo"});
      internal_static_worldCup_com_gzbz_protobuf_C2S_GetCoin_23005_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_worldCup_com_gzbz_protobuf_C2S_GetCoin_23005_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldCup_com_gzbz_protobuf_C2S_GetCoin_23005_descriptor, new String[0]);
      internal_static_worldCup_com_gzbz_protobuf_S2C_GetCoin_23006_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_worldCup_com_gzbz_protobuf_S2C_GetCoin_23006_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldCup_com_gzbz_protobuf_S2C_GetCoin_23006_descriptor, new String[]{"GetCoinTime"});
      internal_static_worldCup_com_gzbz_protobuf_C2S_MatchInfos_23007_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_worldCup_com_gzbz_protobuf_C2S_MatchInfos_23007_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldCup_com_gzbz_protobuf_C2S_MatchInfos_23007_descriptor, new String[]{"Id"});
      internal_static_worldCup_com_gzbz_protobuf_S2C_MatchInfos_23008_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_worldCup_com_gzbz_protobuf_S2C_MatchInfos_23008_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldCup_com_gzbz_protobuf_S2C_MatchInfos_23008_descriptor, new String[]{"Info"});
      internal_static_worldCup_com_gzbz_protobuf_C2S_ExchangeCoin_23009_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_worldCup_com_gzbz_protobuf_C2S_ExchangeCoin_23009_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldCup_com_gzbz_protobuf_C2S_ExchangeCoin_23009_descriptor, new String[]{"Count"});
      internal_static_worldCup_com_gzbz_protobuf_S2C_ExchangeCoin_23010_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_worldCup_com_gzbz_protobuf_S2C_ExchangeCoin_23010_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldCup_com_gzbz_protobuf_S2C_ExchangeCoin_23010_descriptor, new String[]{"TotalExchange", "ExchangeReset"});
      internal_static_worldCup_com_gzbz_protobuf_C2S_TaskList_23011_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_worldCup_com_gzbz_protobuf_C2S_TaskList_23011_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldCup_com_gzbz_protobuf_C2S_TaskList_23011_descriptor, new String[0]);
      internal_static_worldCup_com_gzbz_protobuf_S2C_TaskList_23012_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_worldCup_com_gzbz_protobuf_S2C_TaskList_23012_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldCup_com_gzbz_protobuf_S2C_TaskList_23012_descriptor, new String[]{"Task"});
      internal_static_worldCup_com_gzbz_protobuf_C2S_TaskReward_23013_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_worldCup_com_gzbz_protobuf_C2S_TaskReward_23013_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldCup_com_gzbz_protobuf_C2S_TaskReward_23013_descriptor, new String[]{"Task"});
      internal_static_worldCup_com_gzbz_protobuf_S2C_TaskReward_23014_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_worldCup_com_gzbz_protobuf_S2C_TaskReward_23014_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldCup_com_gzbz_protobuf_S2C_TaskReward_23014_descriptor, new String[]{"Task"});
      internal_static_worldCup_com_gzbz_protobuf_S2C_TaskNotify_23016_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_worldCup_com_gzbz_protobuf_S2C_TaskNotify_23016_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldCup_com_gzbz_protobuf_S2C_TaskNotify_23016_descriptor, new String[]{"Task"});
      internal_static_worldCup_com_gzbz_protobuf_S2C_NewMatchInfo_23018_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_worldCup_com_gzbz_protobuf_S2C_NewMatchInfo_23018_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldCup_com_gzbz_protobuf_S2C_NewMatchInfo_23018_descriptor, new String[]{"Info"});
      internal_static_worldCup_com_gzbz_protobuf_S2C_UpdateOdds_23020_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_worldCup_com_gzbz_protobuf_S2C_UpdateOdds_23020_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldCup_com_gzbz_protobuf_S2C_UpdateOdds_23020_descriptor, new String[]{"Id", "Odds"});
      internal_static_worldCup_com_gzbz_protobuf_C2S_GuessRecord_23021_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_worldCup_com_gzbz_protobuf_C2S_GuessRecord_23021_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldCup_com_gzbz_protobuf_C2S_GuessRecord_23021_descriptor, new String[0]);
      internal_static_worldCup_com_gzbz_protobuf_S2C_GuessRecord_23022_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_worldCup_com_gzbz_protobuf_S2C_GuessRecord_23022_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldCup_com_gzbz_protobuf_S2C_GuessRecord_23022_descriptor, new String[]{"Info"});
      internal_static_worldCup_com_gzbz_protobuf_S2C_UpdateResult_23024_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_worldCup_com_gzbz_protobuf_S2C_UpdateResult_23024_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldCup_com_gzbz_protobuf_S2C_UpdateResult_23024_descriptor, new String[]{"Result"});
      internal_static_worldCup_com_gzbz_protobuf_S2C_UpateTotalGuessCoin_23026_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_worldCup_com_gzbz_protobuf_S2C_UpateTotalGuessCoin_23026_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_worldCup_com_gzbz_protobuf_S2C_UpateTotalGuessCoin_23026_descriptor, new String[]{"Id", "TotalGuessCoin"});
      CommonMsg.getDescriptor();
   }

   public static enum GuessState implements ProtocolMessageEnum {
      STATE_DOING(0),
      STATE_COOL(1),
      STATE_WIAT(2),
      STATE_FINISH(3),
      STATE_STOP(4);

      public static final int STATE_DOING_VALUE = 0;
      public static final int STATE_COOL_VALUE = 1;
      public static final int STATE_WIAT_VALUE = 2;
      public static final int STATE_FINISH_VALUE = 3;
      public static final int STATE_STOP_VALUE = 4;
      private static final Internal.EnumLiteMap<GuessState> internalValueMap = new Internal.EnumLiteMap<GuessState>() {
         public GuessState findValueByNumber(int number) {
            return WorldCupMsg.GuessState.forNumber(number);
         }
      };
      private static final GuessState[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static GuessState valueOf(int value) {
         return forNumber(value);
      }

      public static GuessState forNumber(int value) {
         switch (value) {
            case 0:
               return STATE_DOING;
            case 1:
               return STATE_COOL;
            case 2:
               return STATE_WIAT;
            case 3:
               return STATE_FINISH;
            case 4:
               return STATE_STOP;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<GuessState> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)WorldCupMsg.getDescriptor().getEnumTypes().get(0);
      }

      public static GuessState valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private GuessState(int value) {
         this.value = value;
      }
   }

   public static final class GuessInfo extends GeneratedMessageV3 implements GuessInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int WINID_FIELD_NUMBER = 2;
      private int winId_;
      public static final int WAGER_FIELD_NUMBER = 3;
      private int wager_;
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
                     case 8:
                        this.bitField0_ |= 1;
                        this.id_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.winId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.wager_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_GuessInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_GuessInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GuessInfo.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasWinId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getWinId() {
         return this.winId_;
      }

      public boolean hasWager() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getWager() {
         return this.wager_;
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
         } else if (!this.hasWinId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasWager()) {
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
            output.writeInt32(2, this.winId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.wager_);
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
               size += CodedOutputStream.computeInt32Size(2, this.winId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.wager_);
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
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasWinId() != other.hasWinId()) {
               return false;
            } else if (this.hasWinId() && this.getWinId() != other.getWinId()) {
               return false;
            } else if (this.hasWager() != other.hasWager()) {
               return false;
            } else if (this.hasWager() && this.getWager() != other.getWager()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasWinId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getWinId();
            }

            if (this.hasWager()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getWager();
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
         private int id_;
         private int winId_;
         private int wager_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_GuessInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_GuessInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GuessInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldCupMsg.GuessInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.winId_ = 0;
            this.bitField0_ &= -3;
            this.wager_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_GuessInfo_descriptor;
         }

         public GuessInfo getDefaultInstanceForType() {
            return WorldCupMsg.GuessInfo.getDefaultInstance();
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
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.winId_ = this.winId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.wager_ = this.wager_;
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
            if (other instanceof GuessInfo) {
               return this.mergeFrom((GuessInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(GuessInfo other) {
            if (other == WorldCupMsg.GuessInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasWinId()) {
                  this.setWinId(other.getWinId());
               }

               if (other.hasWager()) {
                  this.setWager(other.getWager());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else if (!this.hasWinId()) {
               return false;
            } else {
               return this.hasWager();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            GuessInfo parsedMessage = null;

            try {
               parsedMessage = (GuessInfo)WorldCupMsg.GuessInfo.PARSER.parsePartialFrom(input, extensionRegistry);
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

         public boolean hasWinId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getWinId() {
            return this.winId_;
         }

         public Builder setWinId(int value) {
            this.bitField0_ |= 2;
            this.winId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWinId() {
            this.bitField0_ &= -3;
            this.winId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasWager() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getWager() {
            return this.wager_;
         }

         public Builder setWager(int value) {
            this.bitField0_ |= 4;
            this.wager_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWager() {
            this.bitField0_ &= -5;
            this.wager_ = 0;
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

   public static final class CellMatchInfo extends GeneratedMessageV3 implements CellMatchInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int TEAMS_FIELD_NUMBER = 2;
      private Internal.IntList teams_;
      public static final int ODDS_FIELD_NUMBER = 3;
      private Internal.IntList odds_;
      public static final int GUESSENDTIME_FIELD_NUMBER = 4;
      private int guessEndTime_;
      public static final int GUESSINFO_FIELD_NUMBER = 5;
      private GuessInfo guessInfo_;
      public static final int TOTALGUESSCOIN_FIELD_NUMBER = 6;
      private Internal.LongList totalGuessCoin_;
      public static final int WINID_FIELD_NUMBER = 7;
      private int winId_;
      private byte memoizedIsInitialized;
      private static final CellMatchInfo DEFAULT_INSTANCE = new CellMatchInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<CellMatchInfo> PARSER = new AbstractParser<CellMatchInfo>() {
         public CellMatchInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CellMatchInfo(input, extensionRegistry);
         }
      };

      private CellMatchInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CellMatchInfo() {
         this.memoizedIsInitialized = -1;
         this.teams_ = emptyIntList();
         this.odds_ = emptyIntList();
         this.totalGuessCoin_ = emptyLongList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CellMatchInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CellMatchInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.id_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.teams_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.teams_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.teams_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.odds_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.odds_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.odds_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.odds_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 32:
                        this.bitField0_ |= 2;
                        this.guessEndTime_ = input.readInt32();
                        continue;
                     case 42:
                        GuessInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.guessInfo_.toBuilder();
                        }

                        this.guessInfo_ = (GuessInfo)input.readMessage(WorldCupMsg.GuessInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.guessInfo_);
                           this.guessInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4;
                        continue;
                     case 48:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.totalGuessCoin_ = newLongList();
                           mutable_bitField0_ |= 32;
                        }

                        this.totalGuessCoin_.addLong(input.readInt64());
                        continue;
                     case 50:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 32) == 0 && input.getBytesUntilLimit() > 0) {
                           this.totalGuessCoin_ = newLongList();
                           mutable_bitField0_ |= 32;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.totalGuessCoin_.addLong(input.readInt64());
                        }

                        input.popLimit(limit);
                        continue;
                     case 56:
                        this.bitField0_ |= 8;
                        this.winId_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.teams_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.teams_.makeImmutable();
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.odds_.makeImmutable();
               }

               if ((mutable_bitField0_ & 32) != 0) {
                  this.totalGuessCoin_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_CellMatchInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_CellMatchInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CellMatchInfo.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public List<Integer> getTeamsList() {
         return this.teams_;
      }

      public int getTeamsCount() {
         return this.teams_.size();
      }

      public int getTeams(int index) {
         return this.teams_.getInt(index);
      }

      public List<Integer> getOddsList() {
         return this.odds_;
      }

      public int getOddsCount() {
         return this.odds_.size();
      }

      public int getOdds(int index) {
         return this.odds_.getInt(index);
      }

      public boolean hasGuessEndTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getGuessEndTime() {
         return this.guessEndTime_;
      }

      public boolean hasGuessInfo() {
         return (this.bitField0_ & 4) != 0;
      }

      public GuessInfo getGuessInfo() {
         return this.guessInfo_ == null ? WorldCupMsg.GuessInfo.getDefaultInstance() : this.guessInfo_;
      }

      public GuessInfoOrBuilder getGuessInfoOrBuilder() {
         return this.guessInfo_ == null ? WorldCupMsg.GuessInfo.getDefaultInstance() : this.guessInfo_;
      }

      public List<Long> getTotalGuessCoinList() {
         return this.totalGuessCoin_;
      }

      public int getTotalGuessCoinCount() {
         return this.totalGuessCoin_.size();
      }

      public long getTotalGuessCoin(int index) {
         return this.totalGuessCoin_.getLong(index);
      }

      public boolean hasWinId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getWinId() {
         return this.winId_;
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
         } else if (!this.hasGuessEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasGuessInfo() && !this.getGuessInfo().isInitialized()) {
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

         for(int i = 0; i < this.teams_.size(); ++i) {
            output.writeInt32(2, this.teams_.getInt(i));
         }

         for(int i = 0; i < this.odds_.size(); ++i) {
            output.writeInt32(3, this.odds_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(4, this.guessEndTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(5, this.getGuessInfo());
         }

         for(int i = 0; i < this.totalGuessCoin_.size(); ++i) {
            output.writeInt64(6, this.totalGuessCoin_.getLong(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(7, this.winId_);
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

            int dataSize = 0;

            for(int i = 0; i < this.teams_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.teams_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTeamsList().size();
            dataSize = 0;

            for(int i = 0; i < this.odds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.odds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getOddsList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.guessEndTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(5, this.getGuessInfo());
            }

            dataSize = 0;

            for(int i = 0; i < this.totalGuessCoin_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt64SizeNoTag(this.totalGuessCoin_.getLong(i));
            }

            size += dataSize;
            size += 1 * this.getTotalGuessCoinList().size();
            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.winId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CellMatchInfo)) {
            return super.equals(obj);
         } else {
            CellMatchInfo other = (CellMatchInfo)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (!this.getTeamsList().equals(other.getTeamsList())) {
               return false;
            } else if (!this.getOddsList().equals(other.getOddsList())) {
               return false;
            } else if (this.hasGuessEndTime() != other.hasGuessEndTime()) {
               return false;
            } else if (this.hasGuessEndTime() && this.getGuessEndTime() != other.getGuessEndTime()) {
               return false;
            } else if (this.hasGuessInfo() != other.hasGuessInfo()) {
               return false;
            } else if (this.hasGuessInfo() && !this.getGuessInfo().equals(other.getGuessInfo())) {
               return false;
            } else if (!this.getTotalGuessCoinList().equals(other.getTotalGuessCoinList())) {
               return false;
            } else if (this.hasWinId() != other.hasWinId()) {
               return false;
            } else if (this.hasWinId() && this.getWinId() != other.getWinId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.getTeamsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTeamsList().hashCode();
            }

            if (this.getOddsCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getOddsList().hashCode();
            }

            if (this.hasGuessEndTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getGuessEndTime();
            }

            if (this.hasGuessInfo()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getGuessInfo().hashCode();
            }

            if (this.getTotalGuessCoinCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getTotalGuessCoinList().hashCode();
            }

            if (this.hasWinId()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getWinId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CellMatchInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CellMatchInfo)PARSER.parseFrom(data);
      }

      public static CellMatchInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CellMatchInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CellMatchInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CellMatchInfo)PARSER.parseFrom(data);
      }

      public static CellMatchInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CellMatchInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CellMatchInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CellMatchInfo)PARSER.parseFrom(data);
      }

      public static CellMatchInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CellMatchInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CellMatchInfo parseFrom(InputStream input) throws IOException {
         return (CellMatchInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CellMatchInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CellMatchInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CellMatchInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (CellMatchInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CellMatchInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CellMatchInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CellMatchInfo parseFrom(CodedInputStream input) throws IOException {
         return (CellMatchInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CellMatchInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CellMatchInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CellMatchInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CellMatchInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CellMatchInfo> parser() {
         return PARSER;
      }

      public Parser<CellMatchInfo> getParserForType() {
         return PARSER;
      }

      public CellMatchInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CellMatchInfoOrBuilder {
         private int bitField0_;
         private int id_;
         private Internal.IntList teams_;
         private Internal.IntList odds_;
         private int guessEndTime_;
         private GuessInfo guessInfo_;
         private SingleFieldBuilderV3<GuessInfo, GuessInfo.Builder, GuessInfoOrBuilder> guessInfoBuilder_;
         private Internal.LongList totalGuessCoin_;
         private int winId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_CellMatchInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_CellMatchInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CellMatchInfo.class, Builder.class);
         }

         private Builder() {
            this.teams_ = WorldCupMsg.CellMatchInfo.emptyIntList();
            this.odds_ = WorldCupMsg.CellMatchInfo.emptyIntList();
            this.totalGuessCoin_ = WorldCupMsg.CellMatchInfo.emptyLongList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.teams_ = WorldCupMsg.CellMatchInfo.emptyIntList();
            this.odds_ = WorldCupMsg.CellMatchInfo.emptyIntList();
            this.totalGuessCoin_ = WorldCupMsg.CellMatchInfo.emptyLongList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldCupMsg.CellMatchInfo.alwaysUseFieldBuilders) {
               this.getGuessInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.teams_ = WorldCupMsg.CellMatchInfo.emptyIntList();
            this.bitField0_ &= -3;
            this.odds_ = WorldCupMsg.CellMatchInfo.emptyIntList();
            this.bitField0_ &= -5;
            this.guessEndTime_ = 0;
            this.bitField0_ &= -9;
            if (this.guessInfoBuilder_ == null) {
               this.guessInfo_ = null;
            } else {
               this.guessInfoBuilder_.clear();
            }

            this.bitField0_ &= -17;
            this.totalGuessCoin_ = WorldCupMsg.CellMatchInfo.emptyLongList();
            this.bitField0_ &= -33;
            this.winId_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_CellMatchInfo_descriptor;
         }

         public CellMatchInfo getDefaultInstanceForType() {
            return WorldCupMsg.CellMatchInfo.getDefaultInstance();
         }

         public CellMatchInfo build() {
            CellMatchInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CellMatchInfo buildPartial() {
            CellMatchInfo result = new CellMatchInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.teams_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.teams_ = this.teams_;
            if ((this.bitField0_ & 4) != 0) {
               this.odds_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.odds_ = this.odds_;
            if ((from_bitField0_ & 8) != 0) {
               result.guessEndTime_ = this.guessEndTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 16) != 0) {
               if (this.guessInfoBuilder_ == null) {
                  result.guessInfo_ = this.guessInfo_;
               } else {
                  result.guessInfo_ = (GuessInfo)this.guessInfoBuilder_.build();
               }

               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 32) != 0) {
               this.totalGuessCoin_.makeImmutable();
               this.bitField0_ &= -33;
            }

            result.totalGuessCoin_ = this.totalGuessCoin_;
            if ((from_bitField0_ & 64) != 0) {
               result.winId_ = this.winId_;
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
            if (other instanceof CellMatchInfo) {
               return this.mergeFrom((CellMatchInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CellMatchInfo other) {
            if (other == WorldCupMsg.CellMatchInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (!other.teams_.isEmpty()) {
                  if (this.teams_.isEmpty()) {
                     this.teams_ = other.teams_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureTeamsIsMutable();
                     this.teams_.addAll(other.teams_);
                  }

                  this.onChanged();
               }

               if (!other.odds_.isEmpty()) {
                  if (this.odds_.isEmpty()) {
                     this.odds_ = other.odds_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureOddsIsMutable();
                     this.odds_.addAll(other.odds_);
                  }

                  this.onChanged();
               }

               if (other.hasGuessEndTime()) {
                  this.setGuessEndTime(other.getGuessEndTime());
               }

               if (other.hasGuessInfo()) {
                  this.mergeGuessInfo(other.getGuessInfo());
               }

               if (!other.totalGuessCoin_.isEmpty()) {
                  if (this.totalGuessCoin_.isEmpty()) {
                     this.totalGuessCoin_ = other.totalGuessCoin_;
                     this.bitField0_ &= -33;
                  } else {
                     this.ensureTotalGuessCoinIsMutable();
                     this.totalGuessCoin_.addAll(other.totalGuessCoin_);
                  }

                  this.onChanged();
               }

               if (other.hasWinId()) {
                  this.setWinId(other.getWinId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else if (!this.hasGuessEndTime()) {
               return false;
            } else {
               return !this.hasGuessInfo() || this.getGuessInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CellMatchInfo parsedMessage = null;

            try {
               parsedMessage = (CellMatchInfo)WorldCupMsg.CellMatchInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CellMatchInfo)e.getUnfinishedMessage();
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

         private void ensureTeamsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.teams_ = WorldCupMsg.CellMatchInfo.mutableCopy(this.teams_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getTeamsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.teams_) : this.teams_);
         }

         public int getTeamsCount() {
            return this.teams_.size();
         }

         public int getTeams(int index) {
            return this.teams_.getInt(index);
         }

         public Builder setTeams(int index, int value) {
            this.ensureTeamsIsMutable();
            this.teams_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTeams(int value) {
            this.ensureTeamsIsMutable();
            this.teams_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTeams(Iterable<? extends Integer> values) {
            this.ensureTeamsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.teams_);
            this.onChanged();
            return this;
         }

         public Builder clearTeams() {
            this.teams_ = WorldCupMsg.CellMatchInfo.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         private void ensureOddsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.odds_ = WorldCupMsg.CellMatchInfo.mutableCopy(this.odds_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getOddsList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.odds_) : this.odds_);
         }

         public int getOddsCount() {
            return this.odds_.size();
         }

         public int getOdds(int index) {
            return this.odds_.getInt(index);
         }

         public Builder setOdds(int index, int value) {
            this.ensureOddsIsMutable();
            this.odds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addOdds(int value) {
            this.ensureOddsIsMutable();
            this.odds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllOdds(Iterable<? extends Integer> values) {
            this.ensureOddsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.odds_);
            this.onChanged();
            return this;
         }

         public Builder clearOdds() {
            this.odds_ = WorldCupMsg.CellMatchInfo.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         public boolean hasGuessEndTime() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getGuessEndTime() {
            return this.guessEndTime_;
         }

         public Builder setGuessEndTime(int value) {
            this.bitField0_ |= 8;
            this.guessEndTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGuessEndTime() {
            this.bitField0_ &= -9;
            this.guessEndTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGuessInfo() {
            return (this.bitField0_ & 16) != 0;
         }

         public GuessInfo getGuessInfo() {
            if (this.guessInfoBuilder_ == null) {
               return this.guessInfo_ == null ? WorldCupMsg.GuessInfo.getDefaultInstance() : this.guessInfo_;
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

            this.bitField0_ |= 16;
            return this;
         }

         public Builder setGuessInfo(GuessInfo.Builder builderForValue) {
            if (this.guessInfoBuilder_ == null) {
               this.guessInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.guessInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder mergeGuessInfo(GuessInfo value) {
            if (this.guessInfoBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0 && this.guessInfo_ != null && this.guessInfo_ != WorldCupMsg.GuessInfo.getDefaultInstance()) {
                  this.guessInfo_ = WorldCupMsg.GuessInfo.newBuilder(this.guessInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.guessInfo_ = value;
               }

               this.onChanged();
            } else {
               this.guessInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder clearGuessInfo() {
            if (this.guessInfoBuilder_ == null) {
               this.guessInfo_ = null;
               this.onChanged();
            } else {
               this.guessInfoBuilder_.clear();
            }

            this.bitField0_ &= -17;
            return this;
         }

         public GuessInfo.Builder getGuessInfoBuilder() {
            this.bitField0_ |= 16;
            this.onChanged();
            return (GuessInfo.Builder)this.getGuessInfoFieldBuilder().getBuilder();
         }

         public GuessInfoOrBuilder getGuessInfoOrBuilder() {
            if (this.guessInfoBuilder_ != null) {
               return (GuessInfoOrBuilder)this.guessInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.guessInfo_ == null ? WorldCupMsg.GuessInfo.getDefaultInstance() : this.guessInfo_;
            }
         }

         private SingleFieldBuilderV3<GuessInfo, GuessInfo.Builder, GuessInfoOrBuilder> getGuessInfoFieldBuilder() {
            if (this.guessInfoBuilder_ == null) {
               this.guessInfoBuilder_ = new SingleFieldBuilderV3(this.getGuessInfo(), this.getParentForChildren(), this.isClean());
               this.guessInfo_ = null;
            }

            return this.guessInfoBuilder_;
         }

         private void ensureTotalGuessCoinIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.totalGuessCoin_ = WorldCupMsg.CellMatchInfo.mutableCopy(this.totalGuessCoin_);
               this.bitField0_ |= 32;
            }

         }

         public List<Long> getTotalGuessCoinList() {
            return (List<Long>)((this.bitField0_ & 32) != 0 ? Collections.unmodifiableList(this.totalGuessCoin_) : this.totalGuessCoin_);
         }

         public int getTotalGuessCoinCount() {
            return this.totalGuessCoin_.size();
         }

         public long getTotalGuessCoin(int index) {
            return this.totalGuessCoin_.getLong(index);
         }

         public Builder setTotalGuessCoin(int index, long value) {
            this.ensureTotalGuessCoinIsMutable();
            this.totalGuessCoin_.setLong(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTotalGuessCoin(long value) {
            this.ensureTotalGuessCoinIsMutable();
            this.totalGuessCoin_.addLong(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTotalGuessCoin(Iterable<? extends Long> values) {
            this.ensureTotalGuessCoinIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.totalGuessCoin_);
            this.onChanged();
            return this;
         }

         public Builder clearTotalGuessCoin() {
            this.totalGuessCoin_ = WorldCupMsg.CellMatchInfo.emptyLongList();
            this.bitField0_ &= -33;
            this.onChanged();
            return this;
         }

         public boolean hasWinId() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getWinId() {
            return this.winId_;
         }

         public Builder setWinId(int value) {
            this.bitField0_ |= 64;
            this.winId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWinId() {
            this.bitField0_ &= -65;
            this.winId_ = 0;
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

   public static final class C2S_ActInfo_23001 extends GeneratedMessageV3 implements C2S_ActInfo_23001OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ActInfo_23001 DEFAULT_INSTANCE = new C2S_ActInfo_23001();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ActInfo_23001> PARSER = new AbstractParser<C2S_ActInfo_23001>() {
         public C2S_ActInfo_23001 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ActInfo_23001(input, extensionRegistry);
         }
      };

      private C2S_ActInfo_23001(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ActInfo_23001() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ActInfo_23001();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ActInfo_23001(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_ActInfo_23001_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_ActInfo_23001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActInfo_23001.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ActInfo_23001)) {
            return super.equals(obj);
         } else {
            C2S_ActInfo_23001 other = (C2S_ActInfo_23001)obj;
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

      public static C2S_ActInfo_23001 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ActInfo_23001)PARSER.parseFrom(data);
      }

      public static C2S_ActInfo_23001 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActInfo_23001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActInfo_23001 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ActInfo_23001)PARSER.parseFrom(data);
      }

      public static C2S_ActInfo_23001 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActInfo_23001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActInfo_23001 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ActInfo_23001)PARSER.parseFrom(data);
      }

      public static C2S_ActInfo_23001 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActInfo_23001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActInfo_23001 parseFrom(InputStream input) throws IOException {
         return (C2S_ActInfo_23001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActInfo_23001 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActInfo_23001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActInfo_23001 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ActInfo_23001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ActInfo_23001 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActInfo_23001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActInfo_23001 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ActInfo_23001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActInfo_23001 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActInfo_23001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ActInfo_23001 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ActInfo_23001 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ActInfo_23001> parser() {
         return PARSER;
      }

      public Parser<C2S_ActInfo_23001> getParserForType() {
         return PARSER;
      }

      public C2S_ActInfo_23001 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ActInfo_23001OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_ActInfo_23001_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_ActInfo_23001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActInfo_23001.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldCupMsg.C2S_ActInfo_23001.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_ActInfo_23001_descriptor;
         }

         public C2S_ActInfo_23001 getDefaultInstanceForType() {
            return WorldCupMsg.C2S_ActInfo_23001.getDefaultInstance();
         }

         public C2S_ActInfo_23001 build() {
            C2S_ActInfo_23001 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ActInfo_23001 buildPartial() {
            C2S_ActInfo_23001 result = new C2S_ActInfo_23001(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ActInfo_23001) {
               return this.mergeFrom((C2S_ActInfo_23001)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ActInfo_23001 other) {
            if (other == WorldCupMsg.C2S_ActInfo_23001.getDefaultInstance()) {
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
            C2S_ActInfo_23001 parsedMessage = null;

            try {
               parsedMessage = (C2S_ActInfo_23001)WorldCupMsg.C2S_ActInfo_23001.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ActInfo_23001)e.getUnfinishedMessage();
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

   public static final class S2C_ActInfo_23002 extends GeneratedMessageV3 implements S2C_ActInfo_23002OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GETCOINTIME_FIELD_NUMBER = 1;
      private int getCoinTime_;
      public static final int TOTALEXCHANGE_FIELD_NUMBER = 2;
      private int totalExchange_;
      public static final int EXCHANGERESET_FIELD_NUMBER = 3;
      private int exchangeReset_;
      private byte memoizedIsInitialized;
      private static final S2C_ActInfo_23002 DEFAULT_INSTANCE = new S2C_ActInfo_23002();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActInfo_23002> PARSER = new AbstractParser<S2C_ActInfo_23002>() {
         public S2C_ActInfo_23002 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActInfo_23002(input, extensionRegistry);
         }
      };

      private S2C_ActInfo_23002(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActInfo_23002() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActInfo_23002();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActInfo_23002(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.getCoinTime_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.totalExchange_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.exchangeReset_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_ActInfo_23002_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_ActInfo_23002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActInfo_23002.class, Builder.class);
      }

      public boolean hasGetCoinTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGetCoinTime() {
         return this.getCoinTime_;
      }

      public boolean hasTotalExchange() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTotalExchange() {
         return this.totalExchange_;
      }

      public boolean hasExchangeReset() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getExchangeReset() {
         return this.exchangeReset_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGetCoinTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalExchange()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasExchangeReset()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.getCoinTime_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.totalExchange_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.exchangeReset_);
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
               size += CodedOutputStream.computeInt32Size(1, this.getCoinTime_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.totalExchange_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.exchangeReset_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ActInfo_23002)) {
            return super.equals(obj);
         } else {
            S2C_ActInfo_23002 other = (S2C_ActInfo_23002)obj;
            if (this.hasGetCoinTime() != other.hasGetCoinTime()) {
               return false;
            } else if (this.hasGetCoinTime() && this.getGetCoinTime() != other.getGetCoinTime()) {
               return false;
            } else if (this.hasTotalExchange() != other.hasTotalExchange()) {
               return false;
            } else if (this.hasTotalExchange() && this.getTotalExchange() != other.getTotalExchange()) {
               return false;
            } else if (this.hasExchangeReset() != other.hasExchangeReset()) {
               return false;
            } else if (this.hasExchangeReset() && this.getExchangeReset() != other.getExchangeReset()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasGetCoinTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGetCoinTime();
            }

            if (this.hasTotalExchange()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTotalExchange();
            }

            if (this.hasExchangeReset()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getExchangeReset();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ActInfo_23002 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActInfo_23002)PARSER.parseFrom(data);
      }

      public static S2C_ActInfo_23002 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActInfo_23002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActInfo_23002 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActInfo_23002)PARSER.parseFrom(data);
      }

      public static S2C_ActInfo_23002 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActInfo_23002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActInfo_23002 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActInfo_23002)PARSER.parseFrom(data);
      }

      public static S2C_ActInfo_23002 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActInfo_23002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActInfo_23002 parseFrom(InputStream input) throws IOException {
         return (S2C_ActInfo_23002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActInfo_23002 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActInfo_23002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActInfo_23002 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActInfo_23002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActInfo_23002 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActInfo_23002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActInfo_23002 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActInfo_23002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActInfo_23002 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActInfo_23002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActInfo_23002 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActInfo_23002 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActInfo_23002> parser() {
         return PARSER;
      }

      public Parser<S2C_ActInfo_23002> getParserForType() {
         return PARSER;
      }

      public S2C_ActInfo_23002 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActInfo_23002OrBuilder {
         private int bitField0_;
         private int getCoinTime_;
         private int totalExchange_;
         private int exchangeReset_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_ActInfo_23002_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_ActInfo_23002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActInfo_23002.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldCupMsg.S2C_ActInfo_23002.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.getCoinTime_ = 0;
            this.bitField0_ &= -2;
            this.totalExchange_ = 0;
            this.bitField0_ &= -3;
            this.exchangeReset_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_ActInfo_23002_descriptor;
         }

         public S2C_ActInfo_23002 getDefaultInstanceForType() {
            return WorldCupMsg.S2C_ActInfo_23002.getDefaultInstance();
         }

         public S2C_ActInfo_23002 build() {
            S2C_ActInfo_23002 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActInfo_23002 buildPartial() {
            S2C_ActInfo_23002 result = new S2C_ActInfo_23002(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.getCoinTime_ = this.getCoinTime_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.totalExchange_ = this.totalExchange_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.exchangeReset_ = this.exchangeReset_;
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
            if (other instanceof S2C_ActInfo_23002) {
               return this.mergeFrom((S2C_ActInfo_23002)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActInfo_23002 other) {
            if (other == WorldCupMsg.S2C_ActInfo_23002.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGetCoinTime()) {
                  this.setGetCoinTime(other.getGetCoinTime());
               }

               if (other.hasTotalExchange()) {
                  this.setTotalExchange(other.getTotalExchange());
               }

               if (other.hasExchangeReset()) {
                  this.setExchangeReset(other.getExchangeReset());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGetCoinTime()) {
               return false;
            } else if (!this.hasTotalExchange()) {
               return false;
            } else {
               return this.hasExchangeReset();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ActInfo_23002 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActInfo_23002)WorldCupMsg.S2C_ActInfo_23002.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActInfo_23002)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGetCoinTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGetCoinTime() {
            return this.getCoinTime_;
         }

         public Builder setGetCoinTime(int value) {
            this.bitField0_ |= 1;
            this.getCoinTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGetCoinTime() {
            this.bitField0_ &= -2;
            this.getCoinTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTotalExchange() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTotalExchange() {
            return this.totalExchange_;
         }

         public Builder setTotalExchange(int value) {
            this.bitField0_ |= 2;
            this.totalExchange_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalExchange() {
            this.bitField0_ &= -3;
            this.totalExchange_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasExchangeReset() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getExchangeReset() {
            return this.exchangeReset_;
         }

         public Builder setExchangeReset(int value) {
            this.bitField0_ |= 4;
            this.exchangeReset_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearExchangeReset() {
            this.bitField0_ &= -5;
            this.exchangeReset_ = 0;
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

   public static final class C2S_GuessWin_23003 extends GeneratedMessageV3 implements C2S_GuessWin_23003OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GUESSINFO_FIELD_NUMBER = 1;
      private GuessInfo guessInfo_;
      private byte memoizedIsInitialized;
      private static final C2S_GuessWin_23003 DEFAULT_INSTANCE = new C2S_GuessWin_23003();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GuessWin_23003> PARSER = new AbstractParser<C2S_GuessWin_23003>() {
         public C2S_GuessWin_23003 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GuessWin_23003(input, extensionRegistry);
         }
      };

      private C2S_GuessWin_23003(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GuessWin_23003() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GuessWin_23003();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GuessWin_23003(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        GuessInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.guessInfo_.toBuilder();
                        }

                        this.guessInfo_ = (GuessInfo)input.readMessage(WorldCupMsg.GuessInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.guessInfo_);
                           this.guessInfo_ = subBuilder.buildPartial();
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
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_GuessWin_23003_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_GuessWin_23003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GuessWin_23003.class, Builder.class);
      }

      public boolean hasGuessInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public GuessInfo getGuessInfo() {
         return this.guessInfo_ == null ? WorldCupMsg.GuessInfo.getDefaultInstance() : this.guessInfo_;
      }

      public GuessInfoOrBuilder getGuessInfoOrBuilder() {
         return this.guessInfo_ == null ? WorldCupMsg.GuessInfo.getDefaultInstance() : this.guessInfo_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGuessInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getGuessInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getGuessInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getGuessInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_GuessWin_23003)) {
            return super.equals(obj);
         } else {
            C2S_GuessWin_23003 other = (C2S_GuessWin_23003)obj;
            if (this.hasGuessInfo() != other.hasGuessInfo()) {
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
            if (this.hasGuessInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGuessInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_GuessWin_23003 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GuessWin_23003)PARSER.parseFrom(data);
      }

      public static C2S_GuessWin_23003 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GuessWin_23003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GuessWin_23003 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GuessWin_23003)PARSER.parseFrom(data);
      }

      public static C2S_GuessWin_23003 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GuessWin_23003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GuessWin_23003 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GuessWin_23003)PARSER.parseFrom(data);
      }

      public static C2S_GuessWin_23003 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GuessWin_23003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GuessWin_23003 parseFrom(InputStream input) throws IOException {
         return (C2S_GuessWin_23003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GuessWin_23003 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GuessWin_23003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GuessWin_23003 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GuessWin_23003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GuessWin_23003 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GuessWin_23003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GuessWin_23003 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GuessWin_23003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GuessWin_23003 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GuessWin_23003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GuessWin_23003 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GuessWin_23003 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GuessWin_23003> parser() {
         return PARSER;
      }

      public Parser<C2S_GuessWin_23003> getParserForType() {
         return PARSER;
      }

      public C2S_GuessWin_23003 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GuessWin_23003OrBuilder {
         private int bitField0_;
         private GuessInfo guessInfo_;
         private SingleFieldBuilderV3<GuessInfo, GuessInfo.Builder, GuessInfoOrBuilder> guessInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_GuessWin_23003_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_GuessWin_23003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GuessWin_23003.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldCupMsg.C2S_GuessWin_23003.alwaysUseFieldBuilders) {
               this.getGuessInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.guessInfoBuilder_ == null) {
               this.guessInfo_ = null;
            } else {
               this.guessInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_GuessWin_23003_descriptor;
         }

         public C2S_GuessWin_23003 getDefaultInstanceForType() {
            return WorldCupMsg.C2S_GuessWin_23003.getDefaultInstance();
         }

         public C2S_GuessWin_23003 build() {
            C2S_GuessWin_23003 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GuessWin_23003 buildPartial() {
            C2S_GuessWin_23003 result = new C2S_GuessWin_23003(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.guessInfoBuilder_ == null) {
                  result.guessInfo_ = this.guessInfo_;
               } else {
                  result.guessInfo_ = (GuessInfo)this.guessInfoBuilder_.build();
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
            if (other instanceof C2S_GuessWin_23003) {
               return this.mergeFrom((C2S_GuessWin_23003)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GuessWin_23003 other) {
            if (other == WorldCupMsg.C2S_GuessWin_23003.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGuessInfo()) {
                  this.mergeGuessInfo(other.getGuessInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGuessInfo()) {
               return false;
            } else {
               return this.getGuessInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_GuessWin_23003 parsedMessage = null;

            try {
               parsedMessage = (C2S_GuessWin_23003)WorldCupMsg.C2S_GuessWin_23003.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GuessWin_23003)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGuessInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public GuessInfo getGuessInfo() {
            if (this.guessInfoBuilder_ == null) {
               return this.guessInfo_ == null ? WorldCupMsg.GuessInfo.getDefaultInstance() : this.guessInfo_;
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

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setGuessInfo(GuessInfo.Builder builderForValue) {
            if (this.guessInfoBuilder_ == null) {
               this.guessInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.guessInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeGuessInfo(GuessInfo value) {
            if (this.guessInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.guessInfo_ != null && this.guessInfo_ != WorldCupMsg.GuessInfo.getDefaultInstance()) {
                  this.guessInfo_ = WorldCupMsg.GuessInfo.newBuilder(this.guessInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.guessInfo_ = value;
               }

               this.onChanged();
            } else {
               this.guessInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearGuessInfo() {
            if (this.guessInfoBuilder_ == null) {
               this.guessInfo_ = null;
               this.onChanged();
            } else {
               this.guessInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public GuessInfo.Builder getGuessInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (GuessInfo.Builder)this.getGuessInfoFieldBuilder().getBuilder();
         }

         public GuessInfoOrBuilder getGuessInfoOrBuilder() {
            if (this.guessInfoBuilder_ != null) {
               return (GuessInfoOrBuilder)this.guessInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.guessInfo_ == null ? WorldCupMsg.GuessInfo.getDefaultInstance() : this.guessInfo_;
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

   public static final class S2C_GuessWin_23004 extends GeneratedMessageV3 implements S2C_GuessWin_23004OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GUESSINFO_FIELD_NUMBER = 1;
      private GuessInfo guessInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_GuessWin_23004 DEFAULT_INSTANCE = new S2C_GuessWin_23004();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GuessWin_23004> PARSER = new AbstractParser<S2C_GuessWin_23004>() {
         public S2C_GuessWin_23004 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GuessWin_23004(input, extensionRegistry);
         }
      };

      private S2C_GuessWin_23004(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GuessWin_23004() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GuessWin_23004();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GuessWin_23004(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        GuessInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.guessInfo_.toBuilder();
                        }

                        this.guessInfo_ = (GuessInfo)input.readMessage(WorldCupMsg.GuessInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.guessInfo_);
                           this.guessInfo_ = subBuilder.buildPartial();
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
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_GuessWin_23004_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_GuessWin_23004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GuessWin_23004.class, Builder.class);
      }

      public boolean hasGuessInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public GuessInfo getGuessInfo() {
         return this.guessInfo_ == null ? WorldCupMsg.GuessInfo.getDefaultInstance() : this.guessInfo_;
      }

      public GuessInfoOrBuilder getGuessInfoOrBuilder() {
         return this.guessInfo_ == null ? WorldCupMsg.GuessInfo.getDefaultInstance() : this.guessInfo_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGuessInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getGuessInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getGuessInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getGuessInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GuessWin_23004)) {
            return super.equals(obj);
         } else {
            S2C_GuessWin_23004 other = (S2C_GuessWin_23004)obj;
            if (this.hasGuessInfo() != other.hasGuessInfo()) {
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
            if (this.hasGuessInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGuessInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GuessWin_23004 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GuessWin_23004)PARSER.parseFrom(data);
      }

      public static S2C_GuessWin_23004 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GuessWin_23004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GuessWin_23004 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GuessWin_23004)PARSER.parseFrom(data);
      }

      public static S2C_GuessWin_23004 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GuessWin_23004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GuessWin_23004 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GuessWin_23004)PARSER.parseFrom(data);
      }

      public static S2C_GuessWin_23004 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GuessWin_23004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GuessWin_23004 parseFrom(InputStream input) throws IOException {
         return (S2C_GuessWin_23004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GuessWin_23004 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GuessWin_23004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GuessWin_23004 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GuessWin_23004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GuessWin_23004 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GuessWin_23004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GuessWin_23004 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GuessWin_23004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GuessWin_23004 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GuessWin_23004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GuessWin_23004 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GuessWin_23004 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GuessWin_23004> parser() {
         return PARSER;
      }

      public Parser<S2C_GuessWin_23004> getParserForType() {
         return PARSER;
      }

      public S2C_GuessWin_23004 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GuessWin_23004OrBuilder {
         private int bitField0_;
         private GuessInfo guessInfo_;
         private SingleFieldBuilderV3<GuessInfo, GuessInfo.Builder, GuessInfoOrBuilder> guessInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_GuessWin_23004_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_GuessWin_23004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GuessWin_23004.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldCupMsg.S2C_GuessWin_23004.alwaysUseFieldBuilders) {
               this.getGuessInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.guessInfoBuilder_ == null) {
               this.guessInfo_ = null;
            } else {
               this.guessInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_GuessWin_23004_descriptor;
         }

         public S2C_GuessWin_23004 getDefaultInstanceForType() {
            return WorldCupMsg.S2C_GuessWin_23004.getDefaultInstance();
         }

         public S2C_GuessWin_23004 build() {
            S2C_GuessWin_23004 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GuessWin_23004 buildPartial() {
            S2C_GuessWin_23004 result = new S2C_GuessWin_23004(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.guessInfoBuilder_ == null) {
                  result.guessInfo_ = this.guessInfo_;
               } else {
                  result.guessInfo_ = (GuessInfo)this.guessInfoBuilder_.build();
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
            if (other instanceof S2C_GuessWin_23004) {
               return this.mergeFrom((S2C_GuessWin_23004)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GuessWin_23004 other) {
            if (other == WorldCupMsg.S2C_GuessWin_23004.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGuessInfo()) {
                  this.mergeGuessInfo(other.getGuessInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGuessInfo()) {
               return false;
            } else {
               return this.getGuessInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GuessWin_23004 parsedMessage = null;

            try {
               parsedMessage = (S2C_GuessWin_23004)WorldCupMsg.S2C_GuessWin_23004.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GuessWin_23004)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGuessInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public GuessInfo getGuessInfo() {
            if (this.guessInfoBuilder_ == null) {
               return this.guessInfo_ == null ? WorldCupMsg.GuessInfo.getDefaultInstance() : this.guessInfo_;
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

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setGuessInfo(GuessInfo.Builder builderForValue) {
            if (this.guessInfoBuilder_ == null) {
               this.guessInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.guessInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeGuessInfo(GuessInfo value) {
            if (this.guessInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.guessInfo_ != null && this.guessInfo_ != WorldCupMsg.GuessInfo.getDefaultInstance()) {
                  this.guessInfo_ = WorldCupMsg.GuessInfo.newBuilder(this.guessInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.guessInfo_ = value;
               }

               this.onChanged();
            } else {
               this.guessInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearGuessInfo() {
            if (this.guessInfoBuilder_ == null) {
               this.guessInfo_ = null;
               this.onChanged();
            } else {
               this.guessInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public GuessInfo.Builder getGuessInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (GuessInfo.Builder)this.getGuessInfoFieldBuilder().getBuilder();
         }

         public GuessInfoOrBuilder getGuessInfoOrBuilder() {
            if (this.guessInfoBuilder_ != null) {
               return (GuessInfoOrBuilder)this.guessInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.guessInfo_ == null ? WorldCupMsg.GuessInfo.getDefaultInstance() : this.guessInfo_;
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

   public static final class C2S_GetCoin_23005 extends GeneratedMessageV3 implements C2S_GetCoin_23005OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GetCoin_23005 DEFAULT_INSTANCE = new C2S_GetCoin_23005();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GetCoin_23005> PARSER = new AbstractParser<C2S_GetCoin_23005>() {
         public C2S_GetCoin_23005 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GetCoin_23005(input, extensionRegistry);
         }
      };

      private C2S_GetCoin_23005(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GetCoin_23005() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GetCoin_23005();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GetCoin_23005(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_GetCoin_23005_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_GetCoin_23005_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetCoin_23005.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GetCoin_23005)) {
            return super.equals(obj);
         } else {
            C2S_GetCoin_23005 other = (C2S_GetCoin_23005)obj;
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

      public static C2S_GetCoin_23005 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GetCoin_23005)PARSER.parseFrom(data);
      }

      public static C2S_GetCoin_23005 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetCoin_23005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetCoin_23005 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GetCoin_23005)PARSER.parseFrom(data);
      }

      public static C2S_GetCoin_23005 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetCoin_23005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetCoin_23005 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GetCoin_23005)PARSER.parseFrom(data);
      }

      public static C2S_GetCoin_23005 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetCoin_23005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetCoin_23005 parseFrom(InputStream input) throws IOException {
         return (C2S_GetCoin_23005)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetCoin_23005 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetCoin_23005)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetCoin_23005 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GetCoin_23005)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GetCoin_23005 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetCoin_23005)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetCoin_23005 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GetCoin_23005)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetCoin_23005 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetCoin_23005)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GetCoin_23005 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GetCoin_23005 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GetCoin_23005> parser() {
         return PARSER;
      }

      public Parser<C2S_GetCoin_23005> getParserForType() {
         return PARSER;
      }

      public C2S_GetCoin_23005 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GetCoin_23005OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_GetCoin_23005_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_GetCoin_23005_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetCoin_23005.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldCupMsg.C2S_GetCoin_23005.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_GetCoin_23005_descriptor;
         }

         public C2S_GetCoin_23005 getDefaultInstanceForType() {
            return WorldCupMsg.C2S_GetCoin_23005.getDefaultInstance();
         }

         public C2S_GetCoin_23005 build() {
            C2S_GetCoin_23005 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GetCoin_23005 buildPartial() {
            C2S_GetCoin_23005 result = new C2S_GetCoin_23005(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_GetCoin_23005) {
               return this.mergeFrom((C2S_GetCoin_23005)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GetCoin_23005 other) {
            if (other == WorldCupMsg.C2S_GetCoin_23005.getDefaultInstance()) {
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
            C2S_GetCoin_23005 parsedMessage = null;

            try {
               parsedMessage = (C2S_GetCoin_23005)WorldCupMsg.C2S_GetCoin_23005.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GetCoin_23005)e.getUnfinishedMessage();
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

   public static final class S2C_GetCoin_23006 extends GeneratedMessageV3 implements S2C_GetCoin_23006OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GETCOINTIME_FIELD_NUMBER = 1;
      private int getCoinTime_;
      private byte memoizedIsInitialized;
      private static final S2C_GetCoin_23006 DEFAULT_INSTANCE = new S2C_GetCoin_23006();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GetCoin_23006> PARSER = new AbstractParser<S2C_GetCoin_23006>() {
         public S2C_GetCoin_23006 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GetCoin_23006(input, extensionRegistry);
         }
      };

      private S2C_GetCoin_23006(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GetCoin_23006() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GetCoin_23006();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GetCoin_23006(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.getCoinTime_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_GetCoin_23006_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_GetCoin_23006_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetCoin_23006.class, Builder.class);
      }

      public boolean hasGetCoinTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGetCoinTime() {
         return this.getCoinTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGetCoinTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.getCoinTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.getCoinTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GetCoin_23006)) {
            return super.equals(obj);
         } else {
            S2C_GetCoin_23006 other = (S2C_GetCoin_23006)obj;
            if (this.hasGetCoinTime() != other.hasGetCoinTime()) {
               return false;
            } else if (this.hasGetCoinTime() && this.getGetCoinTime() != other.getGetCoinTime()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasGetCoinTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGetCoinTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GetCoin_23006 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GetCoin_23006)PARSER.parseFrom(data);
      }

      public static S2C_GetCoin_23006 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetCoin_23006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetCoin_23006 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GetCoin_23006)PARSER.parseFrom(data);
      }

      public static S2C_GetCoin_23006 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetCoin_23006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetCoin_23006 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GetCoin_23006)PARSER.parseFrom(data);
      }

      public static S2C_GetCoin_23006 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetCoin_23006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetCoin_23006 parseFrom(InputStream input) throws IOException {
         return (S2C_GetCoin_23006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetCoin_23006 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetCoin_23006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetCoin_23006 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GetCoin_23006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GetCoin_23006 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetCoin_23006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetCoin_23006 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GetCoin_23006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetCoin_23006 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetCoin_23006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GetCoin_23006 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GetCoin_23006 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GetCoin_23006> parser() {
         return PARSER;
      }

      public Parser<S2C_GetCoin_23006> getParserForType() {
         return PARSER;
      }

      public S2C_GetCoin_23006 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GetCoin_23006OrBuilder {
         private int bitField0_;
         private int getCoinTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_GetCoin_23006_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_GetCoin_23006_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetCoin_23006.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldCupMsg.S2C_GetCoin_23006.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.getCoinTime_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_GetCoin_23006_descriptor;
         }

         public S2C_GetCoin_23006 getDefaultInstanceForType() {
            return WorldCupMsg.S2C_GetCoin_23006.getDefaultInstance();
         }

         public S2C_GetCoin_23006 build() {
            S2C_GetCoin_23006 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GetCoin_23006 buildPartial() {
            S2C_GetCoin_23006 result = new S2C_GetCoin_23006(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.getCoinTime_ = this.getCoinTime_;
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
            if (other instanceof S2C_GetCoin_23006) {
               return this.mergeFrom((S2C_GetCoin_23006)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GetCoin_23006 other) {
            if (other == WorldCupMsg.S2C_GetCoin_23006.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGetCoinTime()) {
                  this.setGetCoinTime(other.getGetCoinTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGetCoinTime();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GetCoin_23006 parsedMessage = null;

            try {
               parsedMessage = (S2C_GetCoin_23006)WorldCupMsg.S2C_GetCoin_23006.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GetCoin_23006)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGetCoinTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGetCoinTime() {
            return this.getCoinTime_;
         }

         public Builder setGetCoinTime(int value) {
            this.bitField0_ |= 1;
            this.getCoinTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGetCoinTime() {
            this.bitField0_ &= -2;
            this.getCoinTime_ = 0;
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

   public static final class C2S_MatchInfos_23007 extends GeneratedMessageV3 implements C2S_MatchInfos_23007OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_MatchInfos_23007 DEFAULT_INSTANCE = new C2S_MatchInfos_23007();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MatchInfos_23007> PARSER = new AbstractParser<C2S_MatchInfos_23007>() {
         public C2S_MatchInfos_23007 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MatchInfos_23007(input, extensionRegistry);
         }
      };

      private C2S_MatchInfos_23007(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MatchInfos_23007() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MatchInfos_23007();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MatchInfos_23007(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_MatchInfos_23007_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_MatchInfos_23007_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MatchInfos_23007.class, Builder.class);
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
         } else if (!(obj instanceof C2S_MatchInfos_23007)) {
            return super.equals(obj);
         } else {
            C2S_MatchInfos_23007 other = (C2S_MatchInfos_23007)obj;
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

      public static C2S_MatchInfos_23007 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MatchInfos_23007)PARSER.parseFrom(data);
      }

      public static C2S_MatchInfos_23007 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MatchInfos_23007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MatchInfos_23007 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MatchInfos_23007)PARSER.parseFrom(data);
      }

      public static C2S_MatchInfos_23007 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MatchInfos_23007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MatchInfos_23007 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MatchInfos_23007)PARSER.parseFrom(data);
      }

      public static C2S_MatchInfos_23007 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MatchInfos_23007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MatchInfos_23007 parseFrom(InputStream input) throws IOException {
         return (C2S_MatchInfos_23007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MatchInfos_23007 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MatchInfos_23007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MatchInfos_23007 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MatchInfos_23007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MatchInfos_23007 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MatchInfos_23007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MatchInfos_23007 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MatchInfos_23007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MatchInfos_23007 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MatchInfos_23007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MatchInfos_23007 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MatchInfos_23007 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MatchInfos_23007> parser() {
         return PARSER;
      }

      public Parser<C2S_MatchInfos_23007> getParserForType() {
         return PARSER;
      }

      public C2S_MatchInfos_23007 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MatchInfos_23007OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_MatchInfos_23007_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_MatchInfos_23007_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MatchInfos_23007.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldCupMsg.C2S_MatchInfos_23007.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_MatchInfos_23007_descriptor;
         }

         public C2S_MatchInfos_23007 getDefaultInstanceForType() {
            return WorldCupMsg.C2S_MatchInfos_23007.getDefaultInstance();
         }

         public C2S_MatchInfos_23007 build() {
            C2S_MatchInfos_23007 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MatchInfos_23007 buildPartial() {
            C2S_MatchInfos_23007 result = new C2S_MatchInfos_23007(this);
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
            if (other instanceof C2S_MatchInfos_23007) {
               return this.mergeFrom((C2S_MatchInfos_23007)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MatchInfos_23007 other) {
            if (other == WorldCupMsg.C2S_MatchInfos_23007.getDefaultInstance()) {
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
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_MatchInfos_23007 parsedMessage = null;

            try {
               parsedMessage = (C2S_MatchInfos_23007)WorldCupMsg.C2S_MatchInfos_23007.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MatchInfos_23007)e.getUnfinishedMessage();
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

   public static final class S2C_MatchInfos_23008 extends GeneratedMessageV3 implements S2C_MatchInfos_23008OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFO_FIELD_NUMBER = 1;
      private List<CellMatchInfo> info_;
      private byte memoizedIsInitialized;
      private static final S2C_MatchInfos_23008 DEFAULT_INSTANCE = new S2C_MatchInfos_23008();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MatchInfos_23008> PARSER = new AbstractParser<S2C_MatchInfos_23008>() {
         public S2C_MatchInfos_23008 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MatchInfos_23008(input, extensionRegistry);
         }
      };

      private S2C_MatchInfos_23008(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MatchInfos_23008() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MatchInfos_23008();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MatchInfos_23008(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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

                        this.info_.add(input.readMessage(WorldCupMsg.CellMatchInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_MatchInfos_23008_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_MatchInfos_23008_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MatchInfos_23008.class, Builder.class);
      }

      public List<CellMatchInfo> getInfoList() {
         return this.info_;
      }

      public List<? extends CellMatchInfoOrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public CellMatchInfo getInfo(int index) {
         return (CellMatchInfo)this.info_.get(index);
      }

      public CellMatchInfoOrBuilder getInfoOrBuilder(int index) {
         return (CellMatchInfoOrBuilder)this.info_.get(index);
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
         } else if (!(obj instanceof S2C_MatchInfos_23008)) {
            return super.equals(obj);
         } else {
            S2C_MatchInfos_23008 other = (S2C_MatchInfos_23008)obj;
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

      public static S2C_MatchInfos_23008 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MatchInfos_23008)PARSER.parseFrom(data);
      }

      public static S2C_MatchInfos_23008 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MatchInfos_23008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MatchInfos_23008 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MatchInfos_23008)PARSER.parseFrom(data);
      }

      public static S2C_MatchInfos_23008 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MatchInfos_23008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MatchInfos_23008 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MatchInfos_23008)PARSER.parseFrom(data);
      }

      public static S2C_MatchInfos_23008 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MatchInfos_23008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MatchInfos_23008 parseFrom(InputStream input) throws IOException {
         return (S2C_MatchInfos_23008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MatchInfos_23008 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MatchInfos_23008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MatchInfos_23008 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MatchInfos_23008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MatchInfos_23008 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MatchInfos_23008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MatchInfos_23008 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MatchInfos_23008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MatchInfos_23008 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MatchInfos_23008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MatchInfos_23008 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MatchInfos_23008 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MatchInfos_23008> parser() {
         return PARSER;
      }

      public Parser<S2C_MatchInfos_23008> getParserForType() {
         return PARSER;
      }

      public S2C_MatchInfos_23008 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MatchInfos_23008OrBuilder {
         private int bitField0_;
         private List<CellMatchInfo> info_;
         private RepeatedFieldBuilderV3<CellMatchInfo, CellMatchInfo.Builder, CellMatchInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_MatchInfos_23008_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_MatchInfos_23008_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MatchInfos_23008.class, Builder.class);
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
            if (WorldCupMsg.S2C_MatchInfos_23008.alwaysUseFieldBuilders) {
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
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_MatchInfos_23008_descriptor;
         }

         public S2C_MatchInfos_23008 getDefaultInstanceForType() {
            return WorldCupMsg.S2C_MatchInfos_23008.getDefaultInstance();
         }

         public S2C_MatchInfos_23008 build() {
            S2C_MatchInfos_23008 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MatchInfos_23008 buildPartial() {
            S2C_MatchInfos_23008 result = new S2C_MatchInfos_23008(this);
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
            if (other instanceof S2C_MatchInfos_23008) {
               return this.mergeFrom((S2C_MatchInfos_23008)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MatchInfos_23008 other) {
            if (other == WorldCupMsg.S2C_MatchInfos_23008.getDefaultInstance()) {
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
                     this.infoBuilder_ = WorldCupMsg.S2C_MatchInfos_23008.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
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
            S2C_MatchInfos_23008 parsedMessage = null;

            try {
               parsedMessage = (S2C_MatchInfos_23008)WorldCupMsg.S2C_MatchInfos_23008.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MatchInfos_23008)e.getUnfinishedMessage();
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

         public List<CellMatchInfo> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public CellMatchInfo getInfo(int index) {
            return this.infoBuilder_ == null ? (CellMatchInfo)this.info_.get(index) : (CellMatchInfo)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, CellMatchInfo value) {
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

         public Builder setInfo(int index, CellMatchInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(CellMatchInfo value) {
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

         public Builder addInfo(int index, CellMatchInfo value) {
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

         public Builder addInfo(CellMatchInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, CellMatchInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends CellMatchInfo> values) {
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

         public CellMatchInfo.Builder getInfoBuilder(int index) {
            return (CellMatchInfo.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public CellMatchInfoOrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (CellMatchInfoOrBuilder)this.info_.get(index) : (CellMatchInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CellMatchInfoOrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public CellMatchInfo.Builder addInfoBuilder() {
            return (CellMatchInfo.Builder)this.getInfoFieldBuilder().addBuilder(WorldCupMsg.CellMatchInfo.getDefaultInstance());
         }

         public CellMatchInfo.Builder addInfoBuilder(int index) {
            return (CellMatchInfo.Builder)this.getInfoFieldBuilder().addBuilder(index, WorldCupMsg.CellMatchInfo.getDefaultInstance());
         }

         public List<CellMatchInfo.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CellMatchInfo, CellMatchInfo.Builder, CellMatchInfoOrBuilder> getInfoFieldBuilder() {
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

   public static final class C2S_ExchangeCoin_23009 extends GeneratedMessageV3 implements C2S_ExchangeCoin_23009OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int COUNT_FIELD_NUMBER = 1;
      private int count_;
      private byte memoizedIsInitialized;
      private static final C2S_ExchangeCoin_23009 DEFAULT_INSTANCE = new C2S_ExchangeCoin_23009();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ExchangeCoin_23009> PARSER = new AbstractParser<C2S_ExchangeCoin_23009>() {
         public C2S_ExchangeCoin_23009 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ExchangeCoin_23009(input, extensionRegistry);
         }
      };

      private C2S_ExchangeCoin_23009(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ExchangeCoin_23009() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ExchangeCoin_23009();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ExchangeCoin_23009(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.count_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_ExchangeCoin_23009_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_ExchangeCoin_23009_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ExchangeCoin_23009.class, Builder.class);
      }

      public boolean hasCount() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCount() {
         return this.count_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
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
            output.writeInt32(1, this.count_);
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
               size += CodedOutputStream.computeInt32Size(1, this.count_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ExchangeCoin_23009)) {
            return super.equals(obj);
         } else {
            C2S_ExchangeCoin_23009 other = (C2S_ExchangeCoin_23009)obj;
            if (this.hasCount() != other.hasCount()) {
               return false;
            } else if (this.hasCount() && this.getCount() != other.getCount()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasCount()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ExchangeCoin_23009 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ExchangeCoin_23009)PARSER.parseFrom(data);
      }

      public static C2S_ExchangeCoin_23009 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ExchangeCoin_23009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ExchangeCoin_23009 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ExchangeCoin_23009)PARSER.parseFrom(data);
      }

      public static C2S_ExchangeCoin_23009 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ExchangeCoin_23009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ExchangeCoin_23009 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ExchangeCoin_23009)PARSER.parseFrom(data);
      }

      public static C2S_ExchangeCoin_23009 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ExchangeCoin_23009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ExchangeCoin_23009 parseFrom(InputStream input) throws IOException {
         return (C2S_ExchangeCoin_23009)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ExchangeCoin_23009 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ExchangeCoin_23009)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ExchangeCoin_23009 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ExchangeCoin_23009)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ExchangeCoin_23009 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ExchangeCoin_23009)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ExchangeCoin_23009 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ExchangeCoin_23009)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ExchangeCoin_23009 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ExchangeCoin_23009)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ExchangeCoin_23009 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ExchangeCoin_23009 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ExchangeCoin_23009> parser() {
         return PARSER;
      }

      public Parser<C2S_ExchangeCoin_23009> getParserForType() {
         return PARSER;
      }

      public C2S_ExchangeCoin_23009 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ExchangeCoin_23009OrBuilder {
         private int bitField0_;
         private int count_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_ExchangeCoin_23009_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_ExchangeCoin_23009_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ExchangeCoin_23009.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldCupMsg.C2S_ExchangeCoin_23009.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.count_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_ExchangeCoin_23009_descriptor;
         }

         public C2S_ExchangeCoin_23009 getDefaultInstanceForType() {
            return WorldCupMsg.C2S_ExchangeCoin_23009.getDefaultInstance();
         }

         public C2S_ExchangeCoin_23009 build() {
            C2S_ExchangeCoin_23009 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ExchangeCoin_23009 buildPartial() {
            C2S_ExchangeCoin_23009 result = new C2S_ExchangeCoin_23009(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.count_ = this.count_;
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
            if (other instanceof C2S_ExchangeCoin_23009) {
               return this.mergeFrom((C2S_ExchangeCoin_23009)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ExchangeCoin_23009 other) {
            if (other == WorldCupMsg.C2S_ExchangeCoin_23009.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCount()) {
                  this.setCount(other.getCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCount();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ExchangeCoin_23009 parsedMessage = null;

            try {
               parsedMessage = (C2S_ExchangeCoin_23009)WorldCupMsg.C2S_ExchangeCoin_23009.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ExchangeCoin_23009)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCount() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCount() {
            return this.count_;
         }

         public Builder setCount(int value) {
            this.bitField0_ |= 1;
            this.count_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCount() {
            this.bitField0_ &= -2;
            this.count_ = 0;
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

   public static final class S2C_ExchangeCoin_23010 extends GeneratedMessageV3 implements S2C_ExchangeCoin_23010OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TOTALEXCHANGE_FIELD_NUMBER = 2;
      private int totalExchange_;
      public static final int EXCHANGERESET_FIELD_NUMBER = 3;
      private int exchangeReset_;
      private byte memoizedIsInitialized;
      private static final S2C_ExchangeCoin_23010 DEFAULT_INSTANCE = new S2C_ExchangeCoin_23010();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ExchangeCoin_23010> PARSER = new AbstractParser<S2C_ExchangeCoin_23010>() {
         public S2C_ExchangeCoin_23010 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ExchangeCoin_23010(input, extensionRegistry);
         }
      };

      private S2C_ExchangeCoin_23010(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ExchangeCoin_23010() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ExchangeCoin_23010();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ExchangeCoin_23010(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.totalExchange_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.exchangeReset_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_ExchangeCoin_23010_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_ExchangeCoin_23010_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ExchangeCoin_23010.class, Builder.class);
      }

      public boolean hasTotalExchange() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTotalExchange() {
         return this.totalExchange_;
      }

      public boolean hasExchangeReset() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getExchangeReset() {
         return this.exchangeReset_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTotalExchange()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasExchangeReset()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.totalExchange_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.exchangeReset_);
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
               size += CodedOutputStream.computeInt32Size(2, this.totalExchange_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.exchangeReset_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ExchangeCoin_23010)) {
            return super.equals(obj);
         } else {
            S2C_ExchangeCoin_23010 other = (S2C_ExchangeCoin_23010)obj;
            if (this.hasTotalExchange() != other.hasTotalExchange()) {
               return false;
            } else if (this.hasTotalExchange() && this.getTotalExchange() != other.getTotalExchange()) {
               return false;
            } else if (this.hasExchangeReset() != other.hasExchangeReset()) {
               return false;
            } else if (this.hasExchangeReset() && this.getExchangeReset() != other.getExchangeReset()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasTotalExchange()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTotalExchange();
            }

            if (this.hasExchangeReset()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getExchangeReset();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ExchangeCoin_23010 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ExchangeCoin_23010)PARSER.parseFrom(data);
      }

      public static S2C_ExchangeCoin_23010 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ExchangeCoin_23010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ExchangeCoin_23010 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ExchangeCoin_23010)PARSER.parseFrom(data);
      }

      public static S2C_ExchangeCoin_23010 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ExchangeCoin_23010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ExchangeCoin_23010 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ExchangeCoin_23010)PARSER.parseFrom(data);
      }

      public static S2C_ExchangeCoin_23010 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ExchangeCoin_23010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ExchangeCoin_23010 parseFrom(InputStream input) throws IOException {
         return (S2C_ExchangeCoin_23010)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ExchangeCoin_23010 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ExchangeCoin_23010)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ExchangeCoin_23010 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ExchangeCoin_23010)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ExchangeCoin_23010 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ExchangeCoin_23010)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ExchangeCoin_23010 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ExchangeCoin_23010)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ExchangeCoin_23010 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ExchangeCoin_23010)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ExchangeCoin_23010 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ExchangeCoin_23010 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ExchangeCoin_23010> parser() {
         return PARSER;
      }

      public Parser<S2C_ExchangeCoin_23010> getParserForType() {
         return PARSER;
      }

      public S2C_ExchangeCoin_23010 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ExchangeCoin_23010OrBuilder {
         private int bitField0_;
         private int totalExchange_;
         private int exchangeReset_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_ExchangeCoin_23010_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_ExchangeCoin_23010_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ExchangeCoin_23010.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldCupMsg.S2C_ExchangeCoin_23010.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.totalExchange_ = 0;
            this.bitField0_ &= -2;
            this.exchangeReset_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_ExchangeCoin_23010_descriptor;
         }

         public S2C_ExchangeCoin_23010 getDefaultInstanceForType() {
            return WorldCupMsg.S2C_ExchangeCoin_23010.getDefaultInstance();
         }

         public S2C_ExchangeCoin_23010 build() {
            S2C_ExchangeCoin_23010 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ExchangeCoin_23010 buildPartial() {
            S2C_ExchangeCoin_23010 result = new S2C_ExchangeCoin_23010(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.totalExchange_ = this.totalExchange_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.exchangeReset_ = this.exchangeReset_;
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
            if (other instanceof S2C_ExchangeCoin_23010) {
               return this.mergeFrom((S2C_ExchangeCoin_23010)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ExchangeCoin_23010 other) {
            if (other == WorldCupMsg.S2C_ExchangeCoin_23010.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTotalExchange()) {
                  this.setTotalExchange(other.getTotalExchange());
               }

               if (other.hasExchangeReset()) {
                  this.setExchangeReset(other.getExchangeReset());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTotalExchange()) {
               return false;
            } else {
               return this.hasExchangeReset();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ExchangeCoin_23010 parsedMessage = null;

            try {
               parsedMessage = (S2C_ExchangeCoin_23010)WorldCupMsg.S2C_ExchangeCoin_23010.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ExchangeCoin_23010)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTotalExchange() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTotalExchange() {
            return this.totalExchange_;
         }

         public Builder setTotalExchange(int value) {
            this.bitField0_ |= 1;
            this.totalExchange_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalExchange() {
            this.bitField0_ &= -2;
            this.totalExchange_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasExchangeReset() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getExchangeReset() {
            return this.exchangeReset_;
         }

         public Builder setExchangeReset(int value) {
            this.bitField0_ |= 2;
            this.exchangeReset_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearExchangeReset() {
            this.bitField0_ &= -3;
            this.exchangeReset_ = 0;
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

   public static final class C2S_TaskList_23011 extends GeneratedMessageV3 implements C2S_TaskList_23011OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TaskList_23011 DEFAULT_INSTANCE = new C2S_TaskList_23011();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TaskList_23011> PARSER = new AbstractParser<C2S_TaskList_23011>() {
         public C2S_TaskList_23011 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TaskList_23011(input, extensionRegistry);
         }
      };

      private C2S_TaskList_23011(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TaskList_23011() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TaskList_23011();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TaskList_23011(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_TaskList_23011_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_TaskList_23011_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskList_23011.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TaskList_23011)) {
            return super.equals(obj);
         } else {
            C2S_TaskList_23011 other = (C2S_TaskList_23011)obj;
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

      public static C2S_TaskList_23011 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TaskList_23011)PARSER.parseFrom(data);
      }

      public static C2S_TaskList_23011 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskList_23011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskList_23011 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TaskList_23011)PARSER.parseFrom(data);
      }

      public static C2S_TaskList_23011 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskList_23011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskList_23011 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TaskList_23011)PARSER.parseFrom(data);
      }

      public static C2S_TaskList_23011 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskList_23011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskList_23011 parseFrom(InputStream input) throws IOException {
         return (C2S_TaskList_23011)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskList_23011 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskList_23011)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskList_23011 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TaskList_23011)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TaskList_23011 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskList_23011)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskList_23011 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TaskList_23011)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskList_23011 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskList_23011)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TaskList_23011 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TaskList_23011 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TaskList_23011> parser() {
         return PARSER;
      }

      public Parser<C2S_TaskList_23011> getParserForType() {
         return PARSER;
      }

      public C2S_TaskList_23011 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TaskList_23011OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_TaskList_23011_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_TaskList_23011_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskList_23011.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldCupMsg.C2S_TaskList_23011.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_TaskList_23011_descriptor;
         }

         public C2S_TaskList_23011 getDefaultInstanceForType() {
            return WorldCupMsg.C2S_TaskList_23011.getDefaultInstance();
         }

         public C2S_TaskList_23011 build() {
            C2S_TaskList_23011 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TaskList_23011 buildPartial() {
            C2S_TaskList_23011 result = new C2S_TaskList_23011(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TaskList_23011) {
               return this.mergeFrom((C2S_TaskList_23011)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TaskList_23011 other) {
            if (other == WorldCupMsg.C2S_TaskList_23011.getDefaultInstance()) {
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
            C2S_TaskList_23011 parsedMessage = null;

            try {
               parsedMessage = (C2S_TaskList_23011)WorldCupMsg.C2S_TaskList_23011.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TaskList_23011)e.getUnfinishedMessage();
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

   public static final class S2C_TaskList_23012 extends GeneratedMessageV3 implements S2C_TaskList_23012OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_TaskList_23012 DEFAULT_INSTANCE = new S2C_TaskList_23012();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TaskList_23012> PARSER = new AbstractParser<S2C_TaskList_23012>() {
         public S2C_TaskList_23012 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TaskList_23012(input, extensionRegistry);
         }
      };

      private S2C_TaskList_23012(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TaskList_23012() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TaskList_23012();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TaskList_23012(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                           this.task_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.task_.add(input.readMessage(CommonMsg.Task.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.task_ = Collections.unmodifiableList(this.task_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_TaskList_23012_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_TaskList_23012_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskList_23012.class, Builder.class);
      }

      public List<CommonMsg.Task> getTaskList() {
         return this.task_;
      }

      public List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList() {
         return this.task_;
      }

      public int getTaskCount() {
         return this.task_.size();
      }

      public CommonMsg.Task getTask(int index) {
         return (CommonMsg.Task)this.task_.get(index);
      }

      public CommonMsg.TaskOrBuilder getTaskOrBuilder(int index) {
         return (CommonMsg.TaskOrBuilder)this.task_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.task_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.task_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.task_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.task_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TaskList_23012)) {
            return super.equals(obj);
         } else {
            S2C_TaskList_23012 other = (S2C_TaskList_23012)obj;
            if (!this.getTaskList().equals(other.getTaskList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getTaskCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TaskList_23012 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TaskList_23012)PARSER.parseFrom(data);
      }

      public static S2C_TaskList_23012 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskList_23012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskList_23012 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TaskList_23012)PARSER.parseFrom(data);
      }

      public static S2C_TaskList_23012 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskList_23012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskList_23012 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TaskList_23012)PARSER.parseFrom(data);
      }

      public static S2C_TaskList_23012 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskList_23012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskList_23012 parseFrom(InputStream input) throws IOException {
         return (S2C_TaskList_23012)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskList_23012 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskList_23012)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskList_23012 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TaskList_23012)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TaskList_23012 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskList_23012)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskList_23012 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TaskList_23012)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskList_23012 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskList_23012)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TaskList_23012 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TaskList_23012 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TaskList_23012> parser() {
         return PARSER;
      }

      public Parser<S2C_TaskList_23012> getParserForType() {
         return PARSER;
      }

      public S2C_TaskList_23012 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TaskList_23012OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_TaskList_23012_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_TaskList_23012_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskList_23012.class, Builder.class);
         }

         private Builder() {
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldCupMsg.S2C_TaskList_23012.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_TaskList_23012_descriptor;
         }

         public S2C_TaskList_23012 getDefaultInstanceForType() {
            return WorldCupMsg.S2C_TaskList_23012.getDefaultInstance();
         }

         public S2C_TaskList_23012 build() {
            S2C_TaskList_23012 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TaskList_23012 buildPartial() {
            S2C_TaskList_23012 result = new S2C_TaskList_23012(this);
            int from_bitField0_ = this.bitField0_;
            if (this.taskBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
                  this.bitField0_ &= -2;
               }

               result.task_ = this.task_;
            } else {
               result.task_ = this.taskBuilder_.build();
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
            if (other instanceof S2C_TaskList_23012) {
               return this.mergeFrom((S2C_TaskList_23012)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TaskList_23012 other) {
            if (other == WorldCupMsg.S2C_TaskList_23012.getDefaultInstance()) {
               return this;
            } else {
               if (this.taskBuilder_ == null) {
                  if (!other.task_.isEmpty()) {
                     if (this.task_.isEmpty()) {
                        this.task_ = other.task_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTaskIsMutable();
                        this.task_.addAll(other.task_);
                     }

                     this.onChanged();
                  }
               } else if (!other.task_.isEmpty()) {
                  if (this.taskBuilder_.isEmpty()) {
                     this.taskBuilder_.dispose();
                     this.taskBuilder_ = null;
                     this.task_ = other.task_;
                     this.bitField0_ &= -2;
                     this.taskBuilder_ = WorldCupMsg.S2C_TaskList_23012.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
                  } else {
                     this.taskBuilder_.addAllMessages(other.task_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TaskList_23012 parsedMessage = null;

            try {
               parsedMessage = (S2C_TaskList_23012)WorldCupMsg.S2C_TaskList_23012.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TaskList_23012)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTaskIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.task_ = new ArrayList(this.task_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.Task> getTaskList() {
            return this.taskBuilder_ == null ? Collections.unmodifiableList(this.task_) : this.taskBuilder_.getMessageList();
         }

         public int getTaskCount() {
            return this.taskBuilder_ == null ? this.task_.size() : this.taskBuilder_.getCount();
         }

         public CommonMsg.Task getTask(int index) {
            return this.taskBuilder_ == null ? (CommonMsg.Task)this.task_.get(index) : (CommonMsg.Task)this.taskBuilder_.getMessage(index);
         }

         public Builder setTask(int index, CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.set(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTask(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTask(CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTask(int index, CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTask(CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTask(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTask(Iterable<? extends CommonMsg.Task> values) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.task_);
               this.onChanged();
            } else {
               this.taskBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTask() {
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Builder removeTask(int index) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.remove(index);
               this.onChanged();
            } else {
               this.taskBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.Task.Builder getTaskBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TaskOrBuilder getTaskOrBuilder(int index) {
            return this.taskBuilder_ == null ? (CommonMsg.TaskOrBuilder)this.task_.get(index) : (CommonMsg.TaskOrBuilder)this.taskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList() {
            return this.taskBuilder_ != null ? this.taskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.task_);
         }

         public CommonMsg.Task.Builder addTaskBuilder() {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().addBuilder(CommonMsg.Task.getDefaultInstance());
         }

         public CommonMsg.Task.Builder addTaskBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().addBuilder(index, CommonMsg.Task.getDefaultInstance());
         }

         public List<CommonMsg.Task.Builder> getTaskBuilderList() {
            return this.getTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> getTaskFieldBuilder() {
            if (this.taskBuilder_ == null) {
               this.taskBuilder_ = new RepeatedFieldBuilderV3(this.task_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.task_ = null;
            }

            return this.taskBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_TaskReward_23013 extends GeneratedMessageV3 implements C2S_TaskReward_23013OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASK_FIELD_NUMBER = 1;
      private int task_;
      private byte memoizedIsInitialized;
      private static final C2S_TaskReward_23013 DEFAULT_INSTANCE = new C2S_TaskReward_23013();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TaskReward_23013> PARSER = new AbstractParser<C2S_TaskReward_23013>() {
         public C2S_TaskReward_23013 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TaskReward_23013(input, extensionRegistry);
         }
      };

      private C2S_TaskReward_23013(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TaskReward_23013() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TaskReward_23013();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TaskReward_23013(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.task_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_TaskReward_23013_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_TaskReward_23013_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskReward_23013.class, Builder.class);
      }

      public boolean hasTask() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTask() {
         return this.task_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTask()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.task_);
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
               size += CodedOutputStream.computeInt32Size(1, this.task_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TaskReward_23013)) {
            return super.equals(obj);
         } else {
            C2S_TaskReward_23013 other = (C2S_TaskReward_23013)obj;
            if (this.hasTask() != other.hasTask()) {
               return false;
            } else if (this.hasTask() && this.getTask() != other.getTask()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasTask()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTask();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TaskReward_23013 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TaskReward_23013)PARSER.parseFrom(data);
      }

      public static C2S_TaskReward_23013 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskReward_23013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskReward_23013 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TaskReward_23013)PARSER.parseFrom(data);
      }

      public static C2S_TaskReward_23013 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskReward_23013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskReward_23013 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TaskReward_23013)PARSER.parseFrom(data);
      }

      public static C2S_TaskReward_23013 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskReward_23013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskReward_23013 parseFrom(InputStream input) throws IOException {
         return (C2S_TaskReward_23013)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskReward_23013 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskReward_23013)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskReward_23013 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TaskReward_23013)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TaskReward_23013 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskReward_23013)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskReward_23013 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TaskReward_23013)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskReward_23013 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskReward_23013)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TaskReward_23013 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TaskReward_23013 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TaskReward_23013> parser() {
         return PARSER;
      }

      public Parser<C2S_TaskReward_23013> getParserForType() {
         return PARSER;
      }

      public C2S_TaskReward_23013 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TaskReward_23013OrBuilder {
         private int bitField0_;
         private int task_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_TaskReward_23013_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_TaskReward_23013_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskReward_23013.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldCupMsg.C2S_TaskReward_23013.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.task_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_TaskReward_23013_descriptor;
         }

         public C2S_TaskReward_23013 getDefaultInstanceForType() {
            return WorldCupMsg.C2S_TaskReward_23013.getDefaultInstance();
         }

         public C2S_TaskReward_23013 build() {
            C2S_TaskReward_23013 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TaskReward_23013 buildPartial() {
            C2S_TaskReward_23013 result = new C2S_TaskReward_23013(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.task_ = this.task_;
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
            if (other instanceof C2S_TaskReward_23013) {
               return this.mergeFrom((C2S_TaskReward_23013)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TaskReward_23013 other) {
            if (other == WorldCupMsg.C2S_TaskReward_23013.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTask()) {
                  this.setTask(other.getTask());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTask();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TaskReward_23013 parsedMessage = null;

            try {
               parsedMessage = (C2S_TaskReward_23013)WorldCupMsg.C2S_TaskReward_23013.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TaskReward_23013)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTask() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTask() {
            return this.task_;
         }

         public Builder setTask(int value) {
            this.bitField0_ |= 1;
            this.task_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTask() {
            this.bitField0_ &= -2;
            this.task_ = 0;
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

   public static final class S2C_TaskReward_23014 extends GeneratedMessageV3 implements S2C_TaskReward_23014OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASK_FIELD_NUMBER = 1;
      private int task_;
      private byte memoizedIsInitialized;
      private static final S2C_TaskReward_23014 DEFAULT_INSTANCE = new S2C_TaskReward_23014();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TaskReward_23014> PARSER = new AbstractParser<S2C_TaskReward_23014>() {
         public S2C_TaskReward_23014 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TaskReward_23014(input, extensionRegistry);
         }
      };

      private S2C_TaskReward_23014(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TaskReward_23014() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TaskReward_23014();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TaskReward_23014(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.task_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_TaskReward_23014_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_TaskReward_23014_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskReward_23014.class, Builder.class);
      }

      public boolean hasTask() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTask() {
         return this.task_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTask()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.task_);
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
               size += CodedOutputStream.computeInt32Size(1, this.task_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TaskReward_23014)) {
            return super.equals(obj);
         } else {
            S2C_TaskReward_23014 other = (S2C_TaskReward_23014)obj;
            if (this.hasTask() != other.hasTask()) {
               return false;
            } else if (this.hasTask() && this.getTask() != other.getTask()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasTask()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTask();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TaskReward_23014 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TaskReward_23014)PARSER.parseFrom(data);
      }

      public static S2C_TaskReward_23014 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskReward_23014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskReward_23014 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TaskReward_23014)PARSER.parseFrom(data);
      }

      public static S2C_TaskReward_23014 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskReward_23014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskReward_23014 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TaskReward_23014)PARSER.parseFrom(data);
      }

      public static S2C_TaskReward_23014 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskReward_23014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskReward_23014 parseFrom(InputStream input) throws IOException {
         return (S2C_TaskReward_23014)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskReward_23014 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskReward_23014)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskReward_23014 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TaskReward_23014)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TaskReward_23014 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskReward_23014)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskReward_23014 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TaskReward_23014)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskReward_23014 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskReward_23014)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TaskReward_23014 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TaskReward_23014 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TaskReward_23014> parser() {
         return PARSER;
      }

      public Parser<S2C_TaskReward_23014> getParserForType() {
         return PARSER;
      }

      public S2C_TaskReward_23014 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TaskReward_23014OrBuilder {
         private int bitField0_;
         private int task_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_TaskReward_23014_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_TaskReward_23014_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskReward_23014.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldCupMsg.S2C_TaskReward_23014.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.task_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_TaskReward_23014_descriptor;
         }

         public S2C_TaskReward_23014 getDefaultInstanceForType() {
            return WorldCupMsg.S2C_TaskReward_23014.getDefaultInstance();
         }

         public S2C_TaskReward_23014 build() {
            S2C_TaskReward_23014 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TaskReward_23014 buildPartial() {
            S2C_TaskReward_23014 result = new S2C_TaskReward_23014(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.task_ = this.task_;
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
            if (other instanceof S2C_TaskReward_23014) {
               return this.mergeFrom((S2C_TaskReward_23014)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TaskReward_23014 other) {
            if (other == WorldCupMsg.S2C_TaskReward_23014.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTask()) {
                  this.setTask(other.getTask());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTask();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TaskReward_23014 parsedMessage = null;

            try {
               parsedMessage = (S2C_TaskReward_23014)WorldCupMsg.S2C_TaskReward_23014.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TaskReward_23014)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTask() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTask() {
            return this.task_;
         }

         public Builder setTask(int value) {
            this.bitField0_ |= 1;
            this.task_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTask() {
            this.bitField0_ &= -2;
            this.task_ = 0;
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

   public static final class S2C_TaskNotify_23016 extends GeneratedMessageV3 implements S2C_TaskNotify_23016OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_TaskNotify_23016 DEFAULT_INSTANCE = new S2C_TaskNotify_23016();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TaskNotify_23016> PARSER = new AbstractParser<S2C_TaskNotify_23016>() {
         public S2C_TaskNotify_23016 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TaskNotify_23016(input, extensionRegistry);
         }
      };

      private S2C_TaskNotify_23016(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TaskNotify_23016() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TaskNotify_23016();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TaskNotify_23016(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                           this.task_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.task_.add(input.readMessage(CommonMsg.Task.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.task_ = Collections.unmodifiableList(this.task_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_TaskNotify_23016_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_TaskNotify_23016_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskNotify_23016.class, Builder.class);
      }

      public List<CommonMsg.Task> getTaskList() {
         return this.task_;
      }

      public List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList() {
         return this.task_;
      }

      public int getTaskCount() {
         return this.task_.size();
      }

      public CommonMsg.Task getTask(int index) {
         return (CommonMsg.Task)this.task_.get(index);
      }

      public CommonMsg.TaskOrBuilder getTaskOrBuilder(int index) {
         return (CommonMsg.TaskOrBuilder)this.task_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.task_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.task_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.task_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.task_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TaskNotify_23016)) {
            return super.equals(obj);
         } else {
            S2C_TaskNotify_23016 other = (S2C_TaskNotify_23016)obj;
            if (!this.getTaskList().equals(other.getTaskList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getTaskCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TaskNotify_23016 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_23016)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotify_23016 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_23016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotify_23016 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_23016)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotify_23016 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_23016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotify_23016 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_23016)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotify_23016 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_23016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotify_23016 parseFrom(InputStream input) throws IOException {
         return (S2C_TaskNotify_23016)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskNotify_23016 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotify_23016)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskNotify_23016 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TaskNotify_23016)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TaskNotify_23016 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotify_23016)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskNotify_23016 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TaskNotify_23016)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskNotify_23016 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotify_23016)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TaskNotify_23016 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TaskNotify_23016 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TaskNotify_23016> parser() {
         return PARSER;
      }

      public Parser<S2C_TaskNotify_23016> getParserForType() {
         return PARSER;
      }

      public S2C_TaskNotify_23016 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TaskNotify_23016OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_TaskNotify_23016_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_TaskNotify_23016_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskNotify_23016.class, Builder.class);
         }

         private Builder() {
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldCupMsg.S2C_TaskNotify_23016.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_TaskNotify_23016_descriptor;
         }

         public S2C_TaskNotify_23016 getDefaultInstanceForType() {
            return WorldCupMsg.S2C_TaskNotify_23016.getDefaultInstance();
         }

         public S2C_TaskNotify_23016 build() {
            S2C_TaskNotify_23016 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TaskNotify_23016 buildPartial() {
            S2C_TaskNotify_23016 result = new S2C_TaskNotify_23016(this);
            int from_bitField0_ = this.bitField0_;
            if (this.taskBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
                  this.bitField0_ &= -2;
               }

               result.task_ = this.task_;
            } else {
               result.task_ = this.taskBuilder_.build();
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
            if (other instanceof S2C_TaskNotify_23016) {
               return this.mergeFrom((S2C_TaskNotify_23016)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TaskNotify_23016 other) {
            if (other == WorldCupMsg.S2C_TaskNotify_23016.getDefaultInstance()) {
               return this;
            } else {
               if (this.taskBuilder_ == null) {
                  if (!other.task_.isEmpty()) {
                     if (this.task_.isEmpty()) {
                        this.task_ = other.task_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTaskIsMutable();
                        this.task_.addAll(other.task_);
                     }

                     this.onChanged();
                  }
               } else if (!other.task_.isEmpty()) {
                  if (this.taskBuilder_.isEmpty()) {
                     this.taskBuilder_.dispose();
                     this.taskBuilder_ = null;
                     this.task_ = other.task_;
                     this.bitField0_ &= -2;
                     this.taskBuilder_ = WorldCupMsg.S2C_TaskNotify_23016.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
                  } else {
                     this.taskBuilder_.addAllMessages(other.task_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TaskNotify_23016 parsedMessage = null;

            try {
               parsedMessage = (S2C_TaskNotify_23016)WorldCupMsg.S2C_TaskNotify_23016.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TaskNotify_23016)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTaskIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.task_ = new ArrayList(this.task_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.Task> getTaskList() {
            return this.taskBuilder_ == null ? Collections.unmodifiableList(this.task_) : this.taskBuilder_.getMessageList();
         }

         public int getTaskCount() {
            return this.taskBuilder_ == null ? this.task_.size() : this.taskBuilder_.getCount();
         }

         public CommonMsg.Task getTask(int index) {
            return this.taskBuilder_ == null ? (CommonMsg.Task)this.task_.get(index) : (CommonMsg.Task)this.taskBuilder_.getMessage(index);
         }

         public Builder setTask(int index, CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.set(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTask(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTask(CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTask(int index, CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTask(CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTask(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTask(Iterable<? extends CommonMsg.Task> values) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.task_);
               this.onChanged();
            } else {
               this.taskBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTask() {
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Builder removeTask(int index) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.remove(index);
               this.onChanged();
            } else {
               this.taskBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.Task.Builder getTaskBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TaskOrBuilder getTaskOrBuilder(int index) {
            return this.taskBuilder_ == null ? (CommonMsg.TaskOrBuilder)this.task_.get(index) : (CommonMsg.TaskOrBuilder)this.taskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList() {
            return this.taskBuilder_ != null ? this.taskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.task_);
         }

         public CommonMsg.Task.Builder addTaskBuilder() {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().addBuilder(CommonMsg.Task.getDefaultInstance());
         }

         public CommonMsg.Task.Builder addTaskBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().addBuilder(index, CommonMsg.Task.getDefaultInstance());
         }

         public List<CommonMsg.Task.Builder> getTaskBuilderList() {
            return this.getTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> getTaskFieldBuilder() {
            if (this.taskBuilder_ == null) {
               this.taskBuilder_ = new RepeatedFieldBuilderV3(this.task_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.task_ = null;
            }

            return this.taskBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_NewMatchInfo_23018 extends GeneratedMessageV3 implements S2C_NewMatchInfo_23018OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFO_FIELD_NUMBER = 1;
      private List<CellMatchInfo> info_;
      private byte memoizedIsInitialized;
      private static final S2C_NewMatchInfo_23018 DEFAULT_INSTANCE = new S2C_NewMatchInfo_23018();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NewMatchInfo_23018> PARSER = new AbstractParser<S2C_NewMatchInfo_23018>() {
         public S2C_NewMatchInfo_23018 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NewMatchInfo_23018(input, extensionRegistry);
         }
      };

      private S2C_NewMatchInfo_23018(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NewMatchInfo_23018() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NewMatchInfo_23018();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NewMatchInfo_23018(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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

                        this.info_.add(input.readMessage(WorldCupMsg.CellMatchInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_NewMatchInfo_23018_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_NewMatchInfo_23018_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NewMatchInfo_23018.class, Builder.class);
      }

      public List<CellMatchInfo> getInfoList() {
         return this.info_;
      }

      public List<? extends CellMatchInfoOrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public CellMatchInfo getInfo(int index) {
         return (CellMatchInfo)this.info_.get(index);
      }

      public CellMatchInfoOrBuilder getInfoOrBuilder(int index) {
         return (CellMatchInfoOrBuilder)this.info_.get(index);
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
         } else if (!(obj instanceof S2C_NewMatchInfo_23018)) {
            return super.equals(obj);
         } else {
            S2C_NewMatchInfo_23018 other = (S2C_NewMatchInfo_23018)obj;
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

      public static S2C_NewMatchInfo_23018 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NewMatchInfo_23018)PARSER.parseFrom(data);
      }

      public static S2C_NewMatchInfo_23018 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewMatchInfo_23018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewMatchInfo_23018 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NewMatchInfo_23018)PARSER.parseFrom(data);
      }

      public static S2C_NewMatchInfo_23018 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewMatchInfo_23018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewMatchInfo_23018 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NewMatchInfo_23018)PARSER.parseFrom(data);
      }

      public static S2C_NewMatchInfo_23018 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewMatchInfo_23018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewMatchInfo_23018 parseFrom(InputStream input) throws IOException {
         return (S2C_NewMatchInfo_23018)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NewMatchInfo_23018 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewMatchInfo_23018)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NewMatchInfo_23018 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NewMatchInfo_23018)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NewMatchInfo_23018 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewMatchInfo_23018)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NewMatchInfo_23018 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NewMatchInfo_23018)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NewMatchInfo_23018 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewMatchInfo_23018)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NewMatchInfo_23018 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NewMatchInfo_23018 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NewMatchInfo_23018> parser() {
         return PARSER;
      }

      public Parser<S2C_NewMatchInfo_23018> getParserForType() {
         return PARSER;
      }

      public S2C_NewMatchInfo_23018 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NewMatchInfo_23018OrBuilder {
         private int bitField0_;
         private List<CellMatchInfo> info_;
         private RepeatedFieldBuilderV3<CellMatchInfo, CellMatchInfo.Builder, CellMatchInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_NewMatchInfo_23018_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_NewMatchInfo_23018_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NewMatchInfo_23018.class, Builder.class);
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
            if (WorldCupMsg.S2C_NewMatchInfo_23018.alwaysUseFieldBuilders) {
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
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_NewMatchInfo_23018_descriptor;
         }

         public S2C_NewMatchInfo_23018 getDefaultInstanceForType() {
            return WorldCupMsg.S2C_NewMatchInfo_23018.getDefaultInstance();
         }

         public S2C_NewMatchInfo_23018 build() {
            S2C_NewMatchInfo_23018 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NewMatchInfo_23018 buildPartial() {
            S2C_NewMatchInfo_23018 result = new S2C_NewMatchInfo_23018(this);
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
            if (other instanceof S2C_NewMatchInfo_23018) {
               return this.mergeFrom((S2C_NewMatchInfo_23018)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NewMatchInfo_23018 other) {
            if (other == WorldCupMsg.S2C_NewMatchInfo_23018.getDefaultInstance()) {
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
                     this.infoBuilder_ = WorldCupMsg.S2C_NewMatchInfo_23018.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
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
            S2C_NewMatchInfo_23018 parsedMessage = null;

            try {
               parsedMessage = (S2C_NewMatchInfo_23018)WorldCupMsg.S2C_NewMatchInfo_23018.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NewMatchInfo_23018)e.getUnfinishedMessage();
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

         public List<CellMatchInfo> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public CellMatchInfo getInfo(int index) {
            return this.infoBuilder_ == null ? (CellMatchInfo)this.info_.get(index) : (CellMatchInfo)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, CellMatchInfo value) {
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

         public Builder setInfo(int index, CellMatchInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(CellMatchInfo value) {
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

         public Builder addInfo(int index, CellMatchInfo value) {
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

         public Builder addInfo(CellMatchInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, CellMatchInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends CellMatchInfo> values) {
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

         public CellMatchInfo.Builder getInfoBuilder(int index) {
            return (CellMatchInfo.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public CellMatchInfoOrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (CellMatchInfoOrBuilder)this.info_.get(index) : (CellMatchInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CellMatchInfoOrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public CellMatchInfo.Builder addInfoBuilder() {
            return (CellMatchInfo.Builder)this.getInfoFieldBuilder().addBuilder(WorldCupMsg.CellMatchInfo.getDefaultInstance());
         }

         public CellMatchInfo.Builder addInfoBuilder(int index) {
            return (CellMatchInfo.Builder)this.getInfoFieldBuilder().addBuilder(index, WorldCupMsg.CellMatchInfo.getDefaultInstance());
         }

         public List<CellMatchInfo.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CellMatchInfo, CellMatchInfo.Builder, CellMatchInfoOrBuilder> getInfoFieldBuilder() {
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

   public static final class S2C_UpdateOdds_23020 extends GeneratedMessageV3 implements S2C_UpdateOdds_23020OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int ODDS_FIELD_NUMBER = 2;
      private Internal.IntList odds_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateOdds_23020 DEFAULT_INSTANCE = new S2C_UpdateOdds_23020();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateOdds_23020> PARSER = new AbstractParser<S2C_UpdateOdds_23020>() {
         public S2C_UpdateOdds_23020 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateOdds_23020(input, extensionRegistry);
         }
      };

      private S2C_UpdateOdds_23020(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateOdds_23020() {
         this.memoizedIsInitialized = -1;
         this.odds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateOdds_23020();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateOdds_23020(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.odds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.odds_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.odds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.odds_.addInt(input.readInt32());
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
                  this.odds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_UpdateOdds_23020_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_UpdateOdds_23020_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateOdds_23020.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public List<Integer> getOddsList() {
         return this.odds_;
      }

      public int getOddsCount() {
         return this.odds_.size();
      }

      public int getOdds(int index) {
         return this.odds_.getInt(index);
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

         for(int i = 0; i < this.odds_.size(); ++i) {
            output.writeInt32(2, this.odds_.getInt(i));
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

            int dataSize = 0;

            for(int i = 0; i < this.odds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.odds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getOddsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpdateOdds_23020)) {
            return super.equals(obj);
         } else {
            S2C_UpdateOdds_23020 other = (S2C_UpdateOdds_23020)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (!this.getOddsList().equals(other.getOddsList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.getOddsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getOddsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpdateOdds_23020 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateOdds_23020)PARSER.parseFrom(data);
      }

      public static S2C_UpdateOdds_23020 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateOdds_23020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateOdds_23020 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateOdds_23020)PARSER.parseFrom(data);
      }

      public static S2C_UpdateOdds_23020 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateOdds_23020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateOdds_23020 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateOdds_23020)PARSER.parseFrom(data);
      }

      public static S2C_UpdateOdds_23020 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateOdds_23020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateOdds_23020 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateOdds_23020)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateOdds_23020 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateOdds_23020)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateOdds_23020 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateOdds_23020)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateOdds_23020 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateOdds_23020)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateOdds_23020 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateOdds_23020)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateOdds_23020 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateOdds_23020)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateOdds_23020 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateOdds_23020 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateOdds_23020> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateOdds_23020> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateOdds_23020 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateOdds_23020OrBuilder {
         private int bitField0_;
         private int id_;
         private Internal.IntList odds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_UpdateOdds_23020_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_UpdateOdds_23020_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateOdds_23020.class, Builder.class);
         }

         private Builder() {
            this.odds_ = WorldCupMsg.S2C_UpdateOdds_23020.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.odds_ = WorldCupMsg.S2C_UpdateOdds_23020.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldCupMsg.S2C_UpdateOdds_23020.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.odds_ = WorldCupMsg.S2C_UpdateOdds_23020.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_UpdateOdds_23020_descriptor;
         }

         public S2C_UpdateOdds_23020 getDefaultInstanceForType() {
            return WorldCupMsg.S2C_UpdateOdds_23020.getDefaultInstance();
         }

         public S2C_UpdateOdds_23020 build() {
            S2C_UpdateOdds_23020 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateOdds_23020 buildPartial() {
            S2C_UpdateOdds_23020 result = new S2C_UpdateOdds_23020(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.odds_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.odds_ = this.odds_;
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
            if (other instanceof S2C_UpdateOdds_23020) {
               return this.mergeFrom((S2C_UpdateOdds_23020)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateOdds_23020 other) {
            if (other == WorldCupMsg.S2C_UpdateOdds_23020.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (!other.odds_.isEmpty()) {
                  if (this.odds_.isEmpty()) {
                     this.odds_ = other.odds_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureOddsIsMutable();
                     this.odds_.addAll(other.odds_);
                  }

                  this.onChanged();
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
            S2C_UpdateOdds_23020 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateOdds_23020)WorldCupMsg.S2C_UpdateOdds_23020.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateOdds_23020)e.getUnfinishedMessage();
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

         private void ensureOddsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.odds_ = WorldCupMsg.S2C_UpdateOdds_23020.mutableCopy(this.odds_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getOddsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.odds_) : this.odds_);
         }

         public int getOddsCount() {
            return this.odds_.size();
         }

         public int getOdds(int index) {
            return this.odds_.getInt(index);
         }

         public Builder setOdds(int index, int value) {
            this.ensureOddsIsMutable();
            this.odds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addOdds(int value) {
            this.ensureOddsIsMutable();
            this.odds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllOdds(Iterable<? extends Integer> values) {
            this.ensureOddsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.odds_);
            this.onChanged();
            return this;
         }

         public Builder clearOdds() {
            this.odds_ = WorldCupMsg.S2C_UpdateOdds_23020.emptyIntList();
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

   public static final class C2S_GuessRecord_23021 extends GeneratedMessageV3 implements C2S_GuessRecord_23021OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GuessRecord_23021 DEFAULT_INSTANCE = new C2S_GuessRecord_23021();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GuessRecord_23021> PARSER = new AbstractParser<C2S_GuessRecord_23021>() {
         public C2S_GuessRecord_23021 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GuessRecord_23021(input, extensionRegistry);
         }
      };

      private C2S_GuessRecord_23021(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GuessRecord_23021() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GuessRecord_23021();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GuessRecord_23021(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_GuessRecord_23021_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_GuessRecord_23021_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GuessRecord_23021.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GuessRecord_23021)) {
            return super.equals(obj);
         } else {
            C2S_GuessRecord_23021 other = (C2S_GuessRecord_23021)obj;
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

      public static C2S_GuessRecord_23021 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GuessRecord_23021)PARSER.parseFrom(data);
      }

      public static C2S_GuessRecord_23021 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GuessRecord_23021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GuessRecord_23021 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GuessRecord_23021)PARSER.parseFrom(data);
      }

      public static C2S_GuessRecord_23021 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GuessRecord_23021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GuessRecord_23021 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GuessRecord_23021)PARSER.parseFrom(data);
      }

      public static C2S_GuessRecord_23021 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GuessRecord_23021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GuessRecord_23021 parseFrom(InputStream input) throws IOException {
         return (C2S_GuessRecord_23021)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GuessRecord_23021 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GuessRecord_23021)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GuessRecord_23021 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GuessRecord_23021)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GuessRecord_23021 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GuessRecord_23021)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GuessRecord_23021 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GuessRecord_23021)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GuessRecord_23021 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GuessRecord_23021)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GuessRecord_23021 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GuessRecord_23021 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GuessRecord_23021> parser() {
         return PARSER;
      }

      public Parser<C2S_GuessRecord_23021> getParserForType() {
         return PARSER;
      }

      public C2S_GuessRecord_23021 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GuessRecord_23021OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_GuessRecord_23021_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_GuessRecord_23021_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GuessRecord_23021.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldCupMsg.C2S_GuessRecord_23021.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_C2S_GuessRecord_23021_descriptor;
         }

         public C2S_GuessRecord_23021 getDefaultInstanceForType() {
            return WorldCupMsg.C2S_GuessRecord_23021.getDefaultInstance();
         }

         public C2S_GuessRecord_23021 build() {
            C2S_GuessRecord_23021 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GuessRecord_23021 buildPartial() {
            C2S_GuessRecord_23021 result = new C2S_GuessRecord_23021(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_GuessRecord_23021) {
               return this.mergeFrom((C2S_GuessRecord_23021)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GuessRecord_23021 other) {
            if (other == WorldCupMsg.C2S_GuessRecord_23021.getDefaultInstance()) {
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
            C2S_GuessRecord_23021 parsedMessage = null;

            try {
               parsedMessage = (C2S_GuessRecord_23021)WorldCupMsg.C2S_GuessRecord_23021.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GuessRecord_23021)e.getUnfinishedMessage();
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

   public static final class S2C_GuessRecord_23022 extends GeneratedMessageV3 implements S2C_GuessRecord_23022OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFO_FIELD_NUMBER = 1;
      private List<CellMatchInfo> info_;
      private byte memoizedIsInitialized;
      private static final S2C_GuessRecord_23022 DEFAULT_INSTANCE = new S2C_GuessRecord_23022();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GuessRecord_23022> PARSER = new AbstractParser<S2C_GuessRecord_23022>() {
         public S2C_GuessRecord_23022 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GuessRecord_23022(input, extensionRegistry);
         }
      };

      private S2C_GuessRecord_23022(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GuessRecord_23022() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GuessRecord_23022();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GuessRecord_23022(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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

                        this.info_.add(input.readMessage(WorldCupMsg.CellMatchInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_GuessRecord_23022_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_GuessRecord_23022_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GuessRecord_23022.class, Builder.class);
      }

      public List<CellMatchInfo> getInfoList() {
         return this.info_;
      }

      public List<? extends CellMatchInfoOrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public CellMatchInfo getInfo(int index) {
         return (CellMatchInfo)this.info_.get(index);
      }

      public CellMatchInfoOrBuilder getInfoOrBuilder(int index) {
         return (CellMatchInfoOrBuilder)this.info_.get(index);
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
         } else if (!(obj instanceof S2C_GuessRecord_23022)) {
            return super.equals(obj);
         } else {
            S2C_GuessRecord_23022 other = (S2C_GuessRecord_23022)obj;
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

      public static S2C_GuessRecord_23022 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GuessRecord_23022)PARSER.parseFrom(data);
      }

      public static S2C_GuessRecord_23022 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GuessRecord_23022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GuessRecord_23022 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GuessRecord_23022)PARSER.parseFrom(data);
      }

      public static S2C_GuessRecord_23022 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GuessRecord_23022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GuessRecord_23022 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GuessRecord_23022)PARSER.parseFrom(data);
      }

      public static S2C_GuessRecord_23022 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GuessRecord_23022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GuessRecord_23022 parseFrom(InputStream input) throws IOException {
         return (S2C_GuessRecord_23022)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GuessRecord_23022 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GuessRecord_23022)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GuessRecord_23022 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GuessRecord_23022)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GuessRecord_23022 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GuessRecord_23022)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GuessRecord_23022 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GuessRecord_23022)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GuessRecord_23022 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GuessRecord_23022)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GuessRecord_23022 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GuessRecord_23022 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GuessRecord_23022> parser() {
         return PARSER;
      }

      public Parser<S2C_GuessRecord_23022> getParserForType() {
         return PARSER;
      }

      public S2C_GuessRecord_23022 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GuessRecord_23022OrBuilder {
         private int bitField0_;
         private List<CellMatchInfo> info_;
         private RepeatedFieldBuilderV3<CellMatchInfo, CellMatchInfo.Builder, CellMatchInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_GuessRecord_23022_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_GuessRecord_23022_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GuessRecord_23022.class, Builder.class);
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
            if (WorldCupMsg.S2C_GuessRecord_23022.alwaysUseFieldBuilders) {
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
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_GuessRecord_23022_descriptor;
         }

         public S2C_GuessRecord_23022 getDefaultInstanceForType() {
            return WorldCupMsg.S2C_GuessRecord_23022.getDefaultInstance();
         }

         public S2C_GuessRecord_23022 build() {
            S2C_GuessRecord_23022 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GuessRecord_23022 buildPartial() {
            S2C_GuessRecord_23022 result = new S2C_GuessRecord_23022(this);
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
            if (other instanceof S2C_GuessRecord_23022) {
               return this.mergeFrom((S2C_GuessRecord_23022)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GuessRecord_23022 other) {
            if (other == WorldCupMsg.S2C_GuessRecord_23022.getDefaultInstance()) {
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
                     this.infoBuilder_ = WorldCupMsg.S2C_GuessRecord_23022.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
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
            S2C_GuessRecord_23022 parsedMessage = null;

            try {
               parsedMessage = (S2C_GuessRecord_23022)WorldCupMsg.S2C_GuessRecord_23022.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GuessRecord_23022)e.getUnfinishedMessage();
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

         public List<CellMatchInfo> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public CellMatchInfo getInfo(int index) {
            return this.infoBuilder_ == null ? (CellMatchInfo)this.info_.get(index) : (CellMatchInfo)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, CellMatchInfo value) {
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

         public Builder setInfo(int index, CellMatchInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(CellMatchInfo value) {
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

         public Builder addInfo(int index, CellMatchInfo value) {
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

         public Builder addInfo(CellMatchInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, CellMatchInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends CellMatchInfo> values) {
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

         public CellMatchInfo.Builder getInfoBuilder(int index) {
            return (CellMatchInfo.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public CellMatchInfoOrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (CellMatchInfoOrBuilder)this.info_.get(index) : (CellMatchInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CellMatchInfoOrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public CellMatchInfo.Builder addInfoBuilder() {
            return (CellMatchInfo.Builder)this.getInfoFieldBuilder().addBuilder(WorldCupMsg.CellMatchInfo.getDefaultInstance());
         }

         public CellMatchInfo.Builder addInfoBuilder(int index) {
            return (CellMatchInfo.Builder)this.getInfoFieldBuilder().addBuilder(index, WorldCupMsg.CellMatchInfo.getDefaultInstance());
         }

         public List<CellMatchInfo.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CellMatchInfo, CellMatchInfo.Builder, CellMatchInfoOrBuilder> getInfoFieldBuilder() {
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

   public static final class S2C_UpdateResult_23024 extends GeneratedMessageV3 implements S2C_UpdateResult_23024OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RESULT_FIELD_NUMBER = 1;
      private List<CommonMsg.MapDataII> result_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateResult_23024 DEFAULT_INSTANCE = new S2C_UpdateResult_23024();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateResult_23024> PARSER = new AbstractParser<S2C_UpdateResult_23024>() {
         public S2C_UpdateResult_23024 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateResult_23024(input, extensionRegistry);
         }
      };

      private S2C_UpdateResult_23024(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateResult_23024() {
         this.memoizedIsInitialized = -1;
         this.result_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateResult_23024();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateResult_23024(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                           this.result_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.result_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.result_ = Collections.unmodifiableList(this.result_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_UpdateResult_23024_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_UpdateResult_23024_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateResult_23024.class, Builder.class);
      }

      public List<CommonMsg.MapDataII> getResultList() {
         return this.result_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getResultOrBuilderList() {
         return this.result_;
      }

      public int getResultCount() {
         return this.result_.size();
      }

      public CommonMsg.MapDataII getResult(int index) {
         return (CommonMsg.MapDataII)this.result_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getResultOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.result_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getResultCount(); ++i) {
               if (!this.getResult(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.result_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.result_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.result_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.result_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpdateResult_23024)) {
            return super.equals(obj);
         } else {
            S2C_UpdateResult_23024 other = (S2C_UpdateResult_23024)obj;
            if (!this.getResultList().equals(other.getResultList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getResultCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResultList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpdateResult_23024 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateResult_23024)PARSER.parseFrom(data);
      }

      public static S2C_UpdateResult_23024 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateResult_23024)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateResult_23024 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateResult_23024)PARSER.parseFrom(data);
      }

      public static S2C_UpdateResult_23024 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateResult_23024)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateResult_23024 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateResult_23024)PARSER.parseFrom(data);
      }

      public static S2C_UpdateResult_23024 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateResult_23024)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateResult_23024 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateResult_23024)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateResult_23024 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateResult_23024)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateResult_23024 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateResult_23024)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateResult_23024 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateResult_23024)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateResult_23024 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateResult_23024)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateResult_23024 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateResult_23024)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateResult_23024 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateResult_23024 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateResult_23024> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateResult_23024> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateResult_23024 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateResult_23024OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MapDataII> result_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> resultBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_UpdateResult_23024_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_UpdateResult_23024_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateResult_23024.class, Builder.class);
         }

         private Builder() {
            this.result_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.result_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldCupMsg.S2C_UpdateResult_23024.alwaysUseFieldBuilders) {
               this.getResultFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.resultBuilder_ == null) {
               this.result_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.resultBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_UpdateResult_23024_descriptor;
         }

         public S2C_UpdateResult_23024 getDefaultInstanceForType() {
            return WorldCupMsg.S2C_UpdateResult_23024.getDefaultInstance();
         }

         public S2C_UpdateResult_23024 build() {
            S2C_UpdateResult_23024 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateResult_23024 buildPartial() {
            S2C_UpdateResult_23024 result = new S2C_UpdateResult_23024(this);
            int from_bitField0_ = this.bitField0_;
            if (this.resultBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.result_ = Collections.unmodifiableList(this.result_);
                  this.bitField0_ &= -2;
               }

               result.result_ = this.result_;
            } else {
               result.result_ = this.resultBuilder_.build();
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
            if (other instanceof S2C_UpdateResult_23024) {
               return this.mergeFrom((S2C_UpdateResult_23024)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateResult_23024 other) {
            if (other == WorldCupMsg.S2C_UpdateResult_23024.getDefaultInstance()) {
               return this;
            } else {
               if (this.resultBuilder_ == null) {
                  if (!other.result_.isEmpty()) {
                     if (this.result_.isEmpty()) {
                        this.result_ = other.result_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureResultIsMutable();
                        this.result_.addAll(other.result_);
                     }

                     this.onChanged();
                  }
               } else if (!other.result_.isEmpty()) {
                  if (this.resultBuilder_.isEmpty()) {
                     this.resultBuilder_.dispose();
                     this.resultBuilder_ = null;
                     this.result_ = other.result_;
                     this.bitField0_ &= -2;
                     this.resultBuilder_ = WorldCupMsg.S2C_UpdateResult_23024.alwaysUseFieldBuilders ? this.getResultFieldBuilder() : null;
                  } else {
                     this.resultBuilder_.addAllMessages(other.result_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getResultCount(); ++i) {
               if (!this.getResult(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpdateResult_23024 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateResult_23024)WorldCupMsg.S2C_UpdateResult_23024.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateResult_23024)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureResultIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.result_ = new ArrayList(this.result_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MapDataII> getResultList() {
            return this.resultBuilder_ == null ? Collections.unmodifiableList(this.result_) : this.resultBuilder_.getMessageList();
         }

         public int getResultCount() {
            return this.resultBuilder_ == null ? this.result_.size() : this.resultBuilder_.getCount();
         }

         public CommonMsg.MapDataII getResult(int index) {
            return this.resultBuilder_ == null ? (CommonMsg.MapDataII)this.result_.get(index) : (CommonMsg.MapDataII)this.resultBuilder_.getMessage(index);
         }

         public Builder setResult(int index, CommonMsg.MapDataII value) {
            if (this.resultBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureResultIsMutable();
               this.result_.set(index, value);
               this.onChanged();
            } else {
               this.resultBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setResult(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.resultBuilder_ == null) {
               this.ensureResultIsMutable();
               this.result_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.resultBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addResult(CommonMsg.MapDataII value) {
            if (this.resultBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureResultIsMutable();
               this.result_.add(value);
               this.onChanged();
            } else {
               this.resultBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addResult(int index, CommonMsg.MapDataII value) {
            if (this.resultBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureResultIsMutable();
               this.result_.add(index, value);
               this.onChanged();
            } else {
               this.resultBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addResult(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.resultBuilder_ == null) {
               this.ensureResultIsMutable();
               this.result_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.resultBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addResult(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.resultBuilder_ == null) {
               this.ensureResultIsMutable();
               this.result_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.resultBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllResult(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.resultBuilder_ == null) {
               this.ensureResultIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.result_);
               this.onChanged();
            } else {
               this.resultBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearResult() {
            if (this.resultBuilder_ == null) {
               this.result_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.resultBuilder_.clear();
            }

            return this;
         }

         public Builder removeResult(int index) {
            if (this.resultBuilder_ == null) {
               this.ensureResultIsMutable();
               this.result_.remove(index);
               this.onChanged();
            } else {
               this.resultBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getResultBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getResultFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getResultOrBuilder(int index) {
            return this.resultBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.result_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.resultBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getResultOrBuilderList() {
            return this.resultBuilder_ != null ? this.resultBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.result_);
         }

         public CommonMsg.MapDataII.Builder addResultBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getResultFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addResultBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getResultFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getResultBuilderList() {
            return this.getResultFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getResultFieldBuilder() {
            if (this.resultBuilder_ == null) {
               this.resultBuilder_ = new RepeatedFieldBuilderV3(this.result_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class S2C_UpateTotalGuessCoin_23026 extends GeneratedMessageV3 implements S2C_UpateTotalGuessCoin_23026OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int TOTALGUESSCOIN_FIELD_NUMBER = 2;
      private Internal.LongList totalGuessCoin_;
      private byte memoizedIsInitialized;
      private static final S2C_UpateTotalGuessCoin_23026 DEFAULT_INSTANCE = new S2C_UpateTotalGuessCoin_23026();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpateTotalGuessCoin_23026> PARSER = new AbstractParser<S2C_UpateTotalGuessCoin_23026>() {
         public S2C_UpateTotalGuessCoin_23026 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpateTotalGuessCoin_23026(input, extensionRegistry);
         }
      };

      private S2C_UpateTotalGuessCoin_23026(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpateTotalGuessCoin_23026() {
         this.memoizedIsInitialized = -1;
         this.totalGuessCoin_ = emptyLongList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpateTotalGuessCoin_23026();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpateTotalGuessCoin_23026(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.totalGuessCoin_ = newLongList();
                           mutable_bitField0_ |= 2;
                        }

                        this.totalGuessCoin_.addLong(input.readInt64());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.totalGuessCoin_ = newLongList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.totalGuessCoin_.addLong(input.readInt64());
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
                  this.totalGuessCoin_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_UpateTotalGuessCoin_23026_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_UpateTotalGuessCoin_23026_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpateTotalGuessCoin_23026.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public List<Long> getTotalGuessCoinList() {
         return this.totalGuessCoin_;
      }

      public int getTotalGuessCoinCount() {
         return this.totalGuessCoin_.size();
      }

      public long getTotalGuessCoin(int index) {
         return this.totalGuessCoin_.getLong(index);
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

         for(int i = 0; i < this.totalGuessCoin_.size(); ++i) {
            output.writeInt64(2, this.totalGuessCoin_.getLong(i));
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

            int dataSize = 0;

            for(int i = 0; i < this.totalGuessCoin_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt64SizeNoTag(this.totalGuessCoin_.getLong(i));
            }

            size += dataSize;
            size += 1 * this.getTotalGuessCoinList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpateTotalGuessCoin_23026)) {
            return super.equals(obj);
         } else {
            S2C_UpateTotalGuessCoin_23026 other = (S2C_UpateTotalGuessCoin_23026)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (!this.getTotalGuessCoinList().equals(other.getTotalGuessCoinList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.getTotalGuessCoinCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTotalGuessCoinList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpateTotalGuessCoin_23026 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpateTotalGuessCoin_23026)PARSER.parseFrom(data);
      }

      public static S2C_UpateTotalGuessCoin_23026 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpateTotalGuessCoin_23026)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpateTotalGuessCoin_23026 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpateTotalGuessCoin_23026)PARSER.parseFrom(data);
      }

      public static S2C_UpateTotalGuessCoin_23026 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpateTotalGuessCoin_23026)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpateTotalGuessCoin_23026 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpateTotalGuessCoin_23026)PARSER.parseFrom(data);
      }

      public static S2C_UpateTotalGuessCoin_23026 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpateTotalGuessCoin_23026)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpateTotalGuessCoin_23026 parseFrom(InputStream input) throws IOException {
         return (S2C_UpateTotalGuessCoin_23026)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpateTotalGuessCoin_23026 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpateTotalGuessCoin_23026)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpateTotalGuessCoin_23026 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpateTotalGuessCoin_23026)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpateTotalGuessCoin_23026 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpateTotalGuessCoin_23026)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpateTotalGuessCoin_23026 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpateTotalGuessCoin_23026)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpateTotalGuessCoin_23026 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpateTotalGuessCoin_23026)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpateTotalGuessCoin_23026 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpateTotalGuessCoin_23026 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpateTotalGuessCoin_23026> parser() {
         return PARSER;
      }

      public Parser<S2C_UpateTotalGuessCoin_23026> getParserForType() {
         return PARSER;
      }

      public S2C_UpateTotalGuessCoin_23026 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpateTotalGuessCoin_23026OrBuilder {
         private int bitField0_;
         private int id_;
         private Internal.LongList totalGuessCoin_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_UpateTotalGuessCoin_23026_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_UpateTotalGuessCoin_23026_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpateTotalGuessCoin_23026.class, Builder.class);
         }

         private Builder() {
            this.totalGuessCoin_ = WorldCupMsg.S2C_UpateTotalGuessCoin_23026.emptyLongList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.totalGuessCoin_ = WorldCupMsg.S2C_UpateTotalGuessCoin_23026.emptyLongList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorldCupMsg.S2C_UpateTotalGuessCoin_23026.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.totalGuessCoin_ = WorldCupMsg.S2C_UpateTotalGuessCoin_23026.emptyLongList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorldCupMsg.internal_static_worldCup_com_gzbz_protobuf_S2C_UpateTotalGuessCoin_23026_descriptor;
         }

         public S2C_UpateTotalGuessCoin_23026 getDefaultInstanceForType() {
            return WorldCupMsg.S2C_UpateTotalGuessCoin_23026.getDefaultInstance();
         }

         public S2C_UpateTotalGuessCoin_23026 build() {
            S2C_UpateTotalGuessCoin_23026 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpateTotalGuessCoin_23026 buildPartial() {
            S2C_UpateTotalGuessCoin_23026 result = new S2C_UpateTotalGuessCoin_23026(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.totalGuessCoin_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.totalGuessCoin_ = this.totalGuessCoin_;
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
            if (other instanceof S2C_UpateTotalGuessCoin_23026) {
               return this.mergeFrom((S2C_UpateTotalGuessCoin_23026)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpateTotalGuessCoin_23026 other) {
            if (other == WorldCupMsg.S2C_UpateTotalGuessCoin_23026.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (!other.totalGuessCoin_.isEmpty()) {
                  if (this.totalGuessCoin_.isEmpty()) {
                     this.totalGuessCoin_ = other.totalGuessCoin_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureTotalGuessCoinIsMutable();
                     this.totalGuessCoin_.addAll(other.totalGuessCoin_);
                  }

                  this.onChanged();
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
            S2C_UpateTotalGuessCoin_23026 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpateTotalGuessCoin_23026)WorldCupMsg.S2C_UpateTotalGuessCoin_23026.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpateTotalGuessCoin_23026)e.getUnfinishedMessage();
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

         private void ensureTotalGuessCoinIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.totalGuessCoin_ = WorldCupMsg.S2C_UpateTotalGuessCoin_23026.mutableCopy(this.totalGuessCoin_);
               this.bitField0_ |= 2;
            }

         }

         public List<Long> getTotalGuessCoinList() {
            return (List<Long>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.totalGuessCoin_) : this.totalGuessCoin_);
         }

         public int getTotalGuessCoinCount() {
            return this.totalGuessCoin_.size();
         }

         public long getTotalGuessCoin(int index) {
            return this.totalGuessCoin_.getLong(index);
         }

         public Builder setTotalGuessCoin(int index, long value) {
            this.ensureTotalGuessCoinIsMutable();
            this.totalGuessCoin_.setLong(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTotalGuessCoin(long value) {
            this.ensureTotalGuessCoinIsMutable();
            this.totalGuessCoin_.addLong(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTotalGuessCoin(Iterable<? extends Long> values) {
            this.ensureTotalGuessCoinIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.totalGuessCoin_);
            this.onChanged();
            return this;
         }

         public Builder clearTotalGuessCoin() {
            this.totalGuessCoin_ = WorldCupMsg.S2C_UpateTotalGuessCoin_23026.emptyLongList();
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

   public interface C2S_ActInfo_23001OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ExchangeCoin_23009OrBuilder extends MessageOrBuilder {
      boolean hasCount();

      int getCount();
   }

   public interface C2S_GetCoin_23005OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GuessRecord_23021OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GuessWin_23003OrBuilder extends MessageOrBuilder {
      boolean hasGuessInfo();

      GuessInfo getGuessInfo();

      GuessInfoOrBuilder getGuessInfoOrBuilder();
   }

   public interface C2S_MatchInfos_23007OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_TaskList_23011OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TaskReward_23013OrBuilder extends MessageOrBuilder {
      boolean hasTask();

      int getTask();
   }

   public interface CellMatchInfoOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      List<Integer> getTeamsList();

      int getTeamsCount();

      int getTeams(int index);

      List<Integer> getOddsList();

      int getOddsCount();

      int getOdds(int index);

      boolean hasGuessEndTime();

      int getGuessEndTime();

      boolean hasGuessInfo();

      GuessInfo getGuessInfo();

      GuessInfoOrBuilder getGuessInfoOrBuilder();

      List<Long> getTotalGuessCoinList();

      int getTotalGuessCoinCount();

      long getTotalGuessCoin(int index);

      boolean hasWinId();

      int getWinId();
   }

   public interface GuessInfoOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasWinId();

      int getWinId();

      boolean hasWager();

      int getWager();
   }

   public interface S2C_ActInfo_23002OrBuilder extends MessageOrBuilder {
      boolean hasGetCoinTime();

      int getGetCoinTime();

      boolean hasTotalExchange();

      int getTotalExchange();

      boolean hasExchangeReset();

      int getExchangeReset();
   }

   public interface S2C_ExchangeCoin_23010OrBuilder extends MessageOrBuilder {
      boolean hasTotalExchange();

      int getTotalExchange();

      boolean hasExchangeReset();

      int getExchangeReset();
   }

   public interface S2C_GetCoin_23006OrBuilder extends MessageOrBuilder {
      boolean hasGetCoinTime();

      int getGetCoinTime();
   }

   public interface S2C_GuessRecord_23022OrBuilder extends MessageOrBuilder {
      List<CellMatchInfo> getInfoList();

      CellMatchInfo getInfo(int index);

      int getInfoCount();

      List<? extends CellMatchInfoOrBuilder> getInfoOrBuilderList();

      CellMatchInfoOrBuilder getInfoOrBuilder(int index);
   }

   public interface S2C_GuessWin_23004OrBuilder extends MessageOrBuilder {
      boolean hasGuessInfo();

      GuessInfo getGuessInfo();

      GuessInfoOrBuilder getGuessInfoOrBuilder();
   }

   public interface S2C_MatchInfos_23008OrBuilder extends MessageOrBuilder {
      List<CellMatchInfo> getInfoList();

      CellMatchInfo getInfo(int index);

      int getInfoCount();

      List<? extends CellMatchInfoOrBuilder> getInfoOrBuilderList();

      CellMatchInfoOrBuilder getInfoOrBuilder(int index);
   }

   public interface S2C_NewMatchInfo_23018OrBuilder extends MessageOrBuilder {
      List<CellMatchInfo> getInfoList();

      CellMatchInfo getInfo(int index);

      int getInfoCount();

      List<? extends CellMatchInfoOrBuilder> getInfoOrBuilderList();

      CellMatchInfoOrBuilder getInfoOrBuilder(int index);
   }

   public interface S2C_TaskList_23012OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_TaskNotify_23016OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_TaskReward_23014OrBuilder extends MessageOrBuilder {
      boolean hasTask();

      int getTask();
   }

   public interface S2C_UpateTotalGuessCoin_23026OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      List<Long> getTotalGuessCoinList();

      int getTotalGuessCoinCount();

      long getTotalGuessCoin(int index);
   }

   public interface S2C_UpdateOdds_23020OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      List<Integer> getOddsList();

      int getOddsCount();

      int getOdds(int index);
   }

   public interface S2C_UpdateResult_23024OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MapDataII> getResultList();

      CommonMsg.MapDataII getResult(int index);

      int getResultCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getResultOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getResultOrBuilder(int index);
   }
}
