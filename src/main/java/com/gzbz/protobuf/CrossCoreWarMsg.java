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

public final class CrossCoreWarMsg {
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_WarInfo_21101_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_WarInfo_21101_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_WarInfo_21102_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_WarInfo_21102_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_Move_21103_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_Move_21103_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Move_21104_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Move_21104_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_AtkBuilding_21105_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_AtkBuilding_21105_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_AtkPlayer_21107_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_AtkPlayer_21107_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateBuildingInfo_21110_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateBuildingInfo_21110_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ScoreReward_21111_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ScoreReward_21111_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_ScoreReward_21112_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_ScoreReward_21112_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PlayerEnter_21114_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PlayerEnter_21114_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UnionCoreHurt_21116_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UnionCoreHurt_21116_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Log_21118_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Log_21118_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_LogLamp_21120_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_LogLamp_21120_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_SetDestGrid_21121_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_SetDestGrid_21121_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SetDestGrid_21122_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SetDestGrid_21122_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UnionWarEnd_21126_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UnionWarEnd_21126_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ActRank_21127_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ActRank_21127_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateState_21130_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateState_21130_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_BaseInfo_21131_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_BaseInfo_21131_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_PlayerArraying_21133_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_PlayerArraying_21133_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PlayerArraying_21134_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PlayerArraying_21134_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateProperty_21136_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateProperty_21136_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_TriggerTask_21138_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_TriggerTask_21138_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_GameRank_21140_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_GameRank_21140_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_PromoteUnion_21143_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_PromoteUnion_21143_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PromoteUnion_21144_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PromoteUnion_21144_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_SynchronizeOpen_21145_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_SynchronizeOpen_21145_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SynchronizeOpen_21146_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SynchronizeOpen_21146_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SendBossReward_21148_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SendBossReward_21148_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ChangeMove_21151_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ChangeMove_21151_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Termination_21154_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Termination_21154_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_EntranceInfo_21155_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_EntranceInfo_21155_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_EntranceInfo_21156_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_EntranceInfo_21156_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_EarliestOpenDay_21157_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_EarliestOpenDay_21157_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_EarliestOpenDay_21158_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_EarliestOpenDay_21158_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_GM_21171_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_GM_21171_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_GM_21172_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_GM_21172_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private CrossCoreWarMsg() {
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
      String[] descriptorData = new String[]{"\n\u0012CrossCoreWar.proto\u0012\u001ecrossCoreWar.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u0012MergeWarGame.proto\u001a\nRank.proto\"3\n\u0012S2CR_WarInfo_21101\u0012\r\n\u0005leave\u0018\u0001 \u0002(\b\u0012\u000e\n\u0006isJoin\u0018\u0002 \u0002(\b\"g\n\u0012CR2S_WarInfo_21102\u0012\r\n\u0005leave\u0018\u0001 \u0002(\b\u0012B\n\u0007warInfo\u0018\u0002 \u0001(\u000b21.mergeWarGame.com.gzbz.protobuf.S2C_WarInfo_19502\"/\n\u000fS2CR_Move_21103\u0012\u000e\n\u0006gridId\u0018\u0001 \u0003(\u0005\u0012\f\n\u0004auto\u0018\u0002 \u0001(\b\"W\n\u000fCR2S_Move_21104\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006gridId\u0018\u0002 \u0003(\u0005\u0012\u0010\n\btransfer\u0018\u0003 \u0001(\b\u0012\u0010\n\bserverId\u0018\u0004 \u0001(\u0005\"<\n\u0016S2CR_AtkBuilding_21105\u0012\u000e\n\u0006gridId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nskipBattle\u0018\u0002 \u0001(\u0005\"L\n\u0014S2CR_AtkPlayer_21107\u0012\u000e\n\u0006gridId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nskipBattle\u0018\u0003 \u0001(\u0005\"c\n\u001dCR2S_UpdateBuildingInfo_21110\u0012B\n\fbuildingInfo\u0018\u0001 \u0003(\u000b2,.mergeWarGame.com.gzbz.protobuf.BuildingInfo\")\n\u0016S2CR_ScoreReward_21111\u0012\u000f\n\u0007scoreId\u0018\u0001 \u0002(\u0005\")\n\u0016CR2S_ScoreReward_21112\u0012\u000f\n\u0007scoreId\u0018\u0001 \u0002(\u0005\"X\n\u0016CR2S_PlayerEnter_21114\u0012>\n\nplayerInfo\u0018\u0001 \u0002(\u000b2*.mergeWarGame.com.gzbz.protobuf.PlayerInfo\"]\n\u0018CR2S_UnionCoreHurt_21116\u0012A\n\u0004info\u0018\u0001 \u0003(\u000b23.mergeWarGame.com.gzbz.protobuf.UnionCoreDamageInfo\"L\n\u000eCR2S_Log_21118\u0012:\n\u0003msg\u0018\u0001 \u0002(\u000b2-.mergeWarGame.com.gzbz.protobuf.S2C_Log_19532\"T\n\u0012CR2S_LogLamp_21120\u0012>\n\u0003msg\u0018\u0001 \u0002(\u000b21.mergeWarGame.com.gzbz.protobuf.S2C_LogLamp_19534\"6\n\u0016S2CR_SetDestGrid_21121\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006gridId\u0018\u0002 \u0001(\u0005\"H\n\u0016CR2S_SetDestGrid_21122\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006gridId\u0018\u0002 \u0003(\u0005\u0012\u0010\n\bplayerId\u0018\u0003 \u0002(\u0005\")\n\u0016CR2S_UnionWarEnd_21126\u0012\u000f\n\u0007unionId\u0018\u0001 \u0003(\u0005\"\u0014\n\u0012S2CR_ActRank_21127\"9\n\u0016CR2S_UpdateState_21130\u0012\r\n\u0005stage\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bsubState\u0018\u0002 \u0002(\u0005\"\u0015\n\u0013S2CR_BaseInfo_21131\"-\n\u0019S2CR_PlayerArraying_21133\u0012\u0010\n\barraying\u0018\u0001 \u0002(\f\"-\n\u0019CR2S_PlayerArraying_21134\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\"Y\n\u0019CR2S_UpdateProperty_21136\u0012<\n\u0004data\u0018\u0001 \u0003(\u000b2..mergeWarGame.com.gzbz.protobuf.PlayerProperty\"p\n\u0016CR2S_TriggerTask_21138\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ntargetType\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007targetX\u0018\u0003 \u0002(\u0005\u0012\u000f\n\u0007opValue\u0018\u0004 \u0002(\u0003\u0012\u000e\n\u0006opType\u0018\u0005 \u0002(\u0005\"x\n\u0013CR2S_GameRank_21140\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007unionId\u0018\u0002 \u0002(\u0005\u0012\u0011\n\tchapterId\u0018\u0003 \u0002(\u0005\u0012/\n\u0005ranks\u0018\u0004 \u0003(\u000b2 .rank.com.gzbz.protobuf.RankData\"J\n\u0017S2CR_PromoteUnion_21143\u0012\u000f\n\u0007unionId\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006damage\u0018\u0002 \u0002(\u0003\u0012\u000e\n\u0006formal\u0018\u0003 \u0002(\b\"\u0019\n\u0017CR2S_PromoteUnion_21144\"G\n\u001aS2CR_SynchronizeOpen_21145\u0012\u0012\n\nmodelGroup\u0018\u0001 \u0002(\u0005\u0012\u0015\n\ropenTimestamp\u0018\u0002 \u0002(\u0003\"´\u0001\n\u001aCR2S_SynchronizeOpen_21146\u0012\u0015\n\rfirstOpenTime\u0018\u0001 \u0001(\u0005\u0012\u0016\n\u000esecondOpenTime\u0018\u0002 \u0001(\u0005\u0012\u000f\n\u0007endTime\u0018\u0003 \u0001(\u0005\u0012\r\n\u0005stage\u0018\u0004 \u0001(\u0005\u0012\u0010\n\bsubState\u0018\u0005 \u0001(\u0005\u0012\u0012\n\nmodelGroup\u0018\u0006 \u0001(\u0005\u0012\u0011\n\tisConnect\u0018\u0007 \u0001(\b\u0012\u000e\n\u0006isOpen\u0018\b \u0002(\b\"/\n\u0019CR2S_SendBossReward_21148\u0012\u0012\n\ndeleteData\u0018\u0001 \u0001(\b\"%\n\u0015S2CR_ChangeMove_21151\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\"\u0018\n\u0016CR2S_Termination_21154\"\u0019\n\u0017S2CR_EntranceInfo_21155\"(\n\u0017CR2S_EntranceInfo_21156\u0012\r\n\u0005state\u0018\u0001 \u0002(\b\"\u001c\n\u001aS2CR_EarliestOpenDay_21157\"-\n\u001aCR2S_EarliestOpenDay_21158\u0012\u000f\n\u0007openDay\u0018\u0001 \u0002(\u0005\"\u001c\n\rS2CR_GM_21171\u0012\u000b\n\u0003str\u0018\u0001 \u0002(\t\"\u001c\n\rCR2S_GM_21172\u0012\u000b\n\u0003str\u0018\u0001 \u0002(\tB&\n\u0011com.gzbz.protobufB\u000fCrossCoreWarMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), MergeWarGameMsg.getDescriptor(), RankMsg.getDescriptor()});
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_WarInfo_21101_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_WarInfo_21101_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_WarInfo_21101_descriptor, new String[]{"Leave", "IsJoin"});
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_WarInfo_21102_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_WarInfo_21102_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_WarInfo_21102_descriptor, new String[]{"Leave", "WarInfo"});
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_Move_21103_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_Move_21103_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_Move_21103_descriptor, new String[]{"GridId", "Auto"});
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Move_21104_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Move_21104_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Move_21104_descriptor, new String[]{"PlayerId", "GridId", "Transfer", "ServerId"});
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_AtkBuilding_21105_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_AtkBuilding_21105_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_AtkBuilding_21105_descriptor, new String[]{"GridId", "SkipBattle"});
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_AtkPlayer_21107_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_AtkPlayer_21107_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_AtkPlayer_21107_descriptor, new String[]{"GridId", "PlayerId", "SkipBattle"});
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateBuildingInfo_21110_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateBuildingInfo_21110_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateBuildingInfo_21110_descriptor, new String[]{"BuildingInfo"});
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ScoreReward_21111_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ScoreReward_21111_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ScoreReward_21111_descriptor, new String[]{"ScoreId"});
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_ScoreReward_21112_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_ScoreReward_21112_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_ScoreReward_21112_descriptor, new String[]{"ScoreId"});
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PlayerEnter_21114_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PlayerEnter_21114_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PlayerEnter_21114_descriptor, new String[]{"PlayerInfo"});
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UnionCoreHurt_21116_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UnionCoreHurt_21116_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UnionCoreHurt_21116_descriptor, new String[]{"Info"});
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Log_21118_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Log_21118_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Log_21118_descriptor, new String[]{"Msg"});
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_LogLamp_21120_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_LogLamp_21120_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_LogLamp_21120_descriptor, new String[]{"Msg"});
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_SetDestGrid_21121_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_SetDestGrid_21121_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_SetDestGrid_21121_descriptor, new String[]{"Type", "GridId"});
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SetDestGrid_21122_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SetDestGrid_21122_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SetDestGrid_21122_descriptor, new String[]{"Type", "GridId", "PlayerId"});
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UnionWarEnd_21126_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UnionWarEnd_21126_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UnionWarEnd_21126_descriptor, new String[]{"UnionId"});
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ActRank_21127_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ActRank_21127_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ActRank_21127_descriptor, new String[0]);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateState_21130_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateState_21130_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateState_21130_descriptor, new String[]{"Stage", "SubState"});
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_BaseInfo_21131_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_BaseInfo_21131_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_BaseInfo_21131_descriptor, new String[0]);
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_PlayerArraying_21133_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_PlayerArraying_21133_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_PlayerArraying_21133_descriptor, new String[]{"Arraying"});
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PlayerArraying_21134_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PlayerArraying_21134_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PlayerArraying_21134_descriptor, new String[]{"PlayerId"});
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateProperty_21136_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateProperty_21136_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateProperty_21136_descriptor, new String[]{"Data"});
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_TriggerTask_21138_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_TriggerTask_21138_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_TriggerTask_21138_descriptor, new String[]{"PlayerId", "TargetType", "TargetX", "OpValue", "OpType"});
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_GameRank_21140_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_GameRank_21140_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_GameRank_21140_descriptor, new String[]{"Rank", "UnionId", "ChapterId", "Ranks"});
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_PromoteUnion_21143_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_PromoteUnion_21143_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_PromoteUnion_21143_descriptor, new String[]{"UnionId", "Damage", "Formal"});
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PromoteUnion_21144_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PromoteUnion_21144_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PromoteUnion_21144_descriptor, new String[0]);
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_SynchronizeOpen_21145_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_SynchronizeOpen_21145_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_SynchronizeOpen_21145_descriptor, new String[]{"ModelGroup", "OpenTimestamp"});
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SynchronizeOpen_21146_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SynchronizeOpen_21146_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SynchronizeOpen_21146_descriptor, new String[]{"FirstOpenTime", "SecondOpenTime", "EndTime", "Stage", "SubState", "ModelGroup", "IsConnect", "IsOpen"});
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SendBossReward_21148_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SendBossReward_21148_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SendBossReward_21148_descriptor, new String[]{"DeleteData"});
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ChangeMove_21151_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ChangeMove_21151_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ChangeMove_21151_descriptor, new String[]{"Grid"});
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Termination_21154_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Termination_21154_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Termination_21154_descriptor, new String[0]);
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_EntranceInfo_21155_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_EntranceInfo_21155_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_EntranceInfo_21155_descriptor, new String[0]);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_EntranceInfo_21156_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_EntranceInfo_21156_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_EntranceInfo_21156_descriptor, new String[]{"State"});
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_EarliestOpenDay_21157_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_EarliestOpenDay_21157_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_EarliestOpenDay_21157_descriptor, new String[0]);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_EarliestOpenDay_21158_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_EarliestOpenDay_21158_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_EarliestOpenDay_21158_descriptor, new String[]{"OpenDay"});
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_GM_21171_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(35);
      internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_GM_21171_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_GM_21171_descriptor, new String[]{"Str"});
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_GM_21172_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(36);
      internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_GM_21172_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_GM_21172_descriptor, new String[]{"Str"});
      CommonMsg.getDescriptor();
      MergeWarGameMsg.getDescriptor();
      RankMsg.getDescriptor();
   }

   public static final class S2CR_WarInfo_21101 extends GeneratedMessageV3 implements S2CR_WarInfo_21101OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LEAVE_FIELD_NUMBER = 1;
      private boolean leave_;
      public static final int ISJOIN_FIELD_NUMBER = 2;
      private boolean isJoin_;
      private byte memoizedIsInitialized;
      private static final S2CR_WarInfo_21101 DEFAULT_INSTANCE = new S2CR_WarInfo_21101();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_WarInfo_21101> PARSER = new AbstractParser<S2CR_WarInfo_21101>() {
         public S2CR_WarInfo_21101 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_WarInfo_21101(input, extensionRegistry);
         }
      };

      private S2CR_WarInfo_21101(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_WarInfo_21101() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_WarInfo_21101();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_WarInfo_21101(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.leave_ = input.readBool();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.isJoin_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_WarInfo_21101_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_WarInfo_21101_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_WarInfo_21101.class, Builder.class);
      }

      public boolean hasLeave() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getLeave() {
         return this.leave_;
      }

      public boolean hasIsJoin() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsJoin() {
         return this.isJoin_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLeave()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsJoin()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.leave_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.isJoin_);
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
               size += CodedOutputStream.computeBoolSize(1, this.leave_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.isJoin_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_WarInfo_21101)) {
            return super.equals(obj);
         } else {
            S2CR_WarInfo_21101 other = (S2CR_WarInfo_21101)obj;
            if (this.hasLeave() != other.hasLeave()) {
               return false;
            } else if (this.hasLeave() && this.getLeave() != other.getLeave()) {
               return false;
            } else if (this.hasIsJoin() != other.hasIsJoin()) {
               return false;
            } else if (this.hasIsJoin() && this.getIsJoin() != other.getIsJoin()) {
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
            if (this.hasLeave()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getLeave());
            }

            if (this.hasIsJoin()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsJoin());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_WarInfo_21101 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_WarInfo_21101)PARSER.parseFrom(data);
      }

      public static S2CR_WarInfo_21101 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_WarInfo_21101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_WarInfo_21101 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_WarInfo_21101)PARSER.parseFrom(data);
      }

      public static S2CR_WarInfo_21101 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_WarInfo_21101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_WarInfo_21101 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_WarInfo_21101)PARSER.parseFrom(data);
      }

      public static S2CR_WarInfo_21101 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_WarInfo_21101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_WarInfo_21101 parseFrom(InputStream input) throws IOException {
         return (S2CR_WarInfo_21101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_WarInfo_21101 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_WarInfo_21101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_WarInfo_21101 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_WarInfo_21101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_WarInfo_21101 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_WarInfo_21101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_WarInfo_21101 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_WarInfo_21101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_WarInfo_21101 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_WarInfo_21101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_WarInfo_21101 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_WarInfo_21101 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_WarInfo_21101> parser() {
         return PARSER;
      }

      public Parser<S2CR_WarInfo_21101> getParserForType() {
         return PARSER;
      }

      public S2CR_WarInfo_21101 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_WarInfo_21101OrBuilder {
         private int bitField0_;
         private boolean leave_;
         private boolean isJoin_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_WarInfo_21101_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_WarInfo_21101_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_WarInfo_21101.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.S2CR_WarInfo_21101.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.leave_ = false;
            this.bitField0_ &= -2;
            this.isJoin_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_WarInfo_21101_descriptor;
         }

         public S2CR_WarInfo_21101 getDefaultInstanceForType() {
            return CrossCoreWarMsg.S2CR_WarInfo_21101.getDefaultInstance();
         }

         public S2CR_WarInfo_21101 build() {
            S2CR_WarInfo_21101 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_WarInfo_21101 buildPartial() {
            S2CR_WarInfo_21101 result = new S2CR_WarInfo_21101(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.leave_ = this.leave_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isJoin_ = this.isJoin_;
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
            if (other instanceof S2CR_WarInfo_21101) {
               return this.mergeFrom((S2CR_WarInfo_21101)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_WarInfo_21101 other) {
            if (other == CrossCoreWarMsg.S2CR_WarInfo_21101.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLeave()) {
                  this.setLeave(other.getLeave());
               }

               if (other.hasIsJoin()) {
                  this.setIsJoin(other.getIsJoin());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasLeave()) {
               return false;
            } else {
               return this.hasIsJoin();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_WarInfo_21101 parsedMessage = null;

            try {
               parsedMessage = (S2CR_WarInfo_21101)CrossCoreWarMsg.S2CR_WarInfo_21101.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_WarInfo_21101)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLeave() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getLeave() {
            return this.leave_;
         }

         public Builder setLeave(boolean value) {
            this.bitField0_ |= 1;
            this.leave_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLeave() {
            this.bitField0_ &= -2;
            this.leave_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasIsJoin() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsJoin() {
            return this.isJoin_;
         }

         public Builder setIsJoin(boolean value) {
            this.bitField0_ |= 2;
            this.isJoin_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsJoin() {
            this.bitField0_ &= -3;
            this.isJoin_ = false;
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

   public static final class CR2S_WarInfo_21102 extends GeneratedMessageV3 implements CR2S_WarInfo_21102OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LEAVE_FIELD_NUMBER = 1;
      private boolean leave_;
      public static final int WARINFO_FIELD_NUMBER = 2;
      private MergeWarGameMsg.S2C_WarInfo_19502 warInfo_;
      private byte memoizedIsInitialized;
      private static final CR2S_WarInfo_21102 DEFAULT_INSTANCE = new CR2S_WarInfo_21102();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_WarInfo_21102> PARSER = new AbstractParser<CR2S_WarInfo_21102>() {
         public CR2S_WarInfo_21102 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_WarInfo_21102(input, extensionRegistry);
         }
      };

      private CR2S_WarInfo_21102(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_WarInfo_21102() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_WarInfo_21102();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_WarInfo_21102(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.leave_ = input.readBool();
                        break;
                     case 18:
                        MergeWarGameMsg.S2C_WarInfo_19502.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.warInfo_.toBuilder();
                        }

                        this.warInfo_ = (MergeWarGameMsg.S2C_WarInfo_19502)input.readMessage(MergeWarGameMsg.S2C_WarInfo_19502.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.warInfo_);
                           this.warInfo_ = subBuilder.buildPartial();
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_WarInfo_21102_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_WarInfo_21102_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_WarInfo_21102.class, Builder.class);
      }

      public boolean hasLeave() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getLeave() {
         return this.leave_;
      }

      public boolean hasWarInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public MergeWarGameMsg.S2C_WarInfo_19502 getWarInfo() {
         return this.warInfo_ == null ? MergeWarGameMsg.S2C_WarInfo_19502.getDefaultInstance() : this.warInfo_;
      }

      public MergeWarGameMsg.S2C_WarInfo_19502OrBuilder getWarInfoOrBuilder() {
         return this.warInfo_ == null ? MergeWarGameMsg.S2C_WarInfo_19502.getDefaultInstance() : this.warInfo_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLeave()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasWarInfo() && !this.getWarInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.leave_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getWarInfo());
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
               size += CodedOutputStream.computeBoolSize(1, this.leave_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getWarInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_WarInfo_21102)) {
            return super.equals(obj);
         } else {
            CR2S_WarInfo_21102 other = (CR2S_WarInfo_21102)obj;
            if (this.hasLeave() != other.hasLeave()) {
               return false;
            } else if (this.hasLeave() && this.getLeave() != other.getLeave()) {
               return false;
            } else if (this.hasWarInfo() != other.hasWarInfo()) {
               return false;
            } else if (this.hasWarInfo() && !this.getWarInfo().equals(other.getWarInfo())) {
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
            if (this.hasLeave()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getLeave());
            }

            if (this.hasWarInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getWarInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_WarInfo_21102 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_WarInfo_21102)PARSER.parseFrom(data);
      }

      public static CR2S_WarInfo_21102 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_WarInfo_21102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_WarInfo_21102 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_WarInfo_21102)PARSER.parseFrom(data);
      }

      public static CR2S_WarInfo_21102 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_WarInfo_21102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_WarInfo_21102 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_WarInfo_21102)PARSER.parseFrom(data);
      }

      public static CR2S_WarInfo_21102 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_WarInfo_21102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_WarInfo_21102 parseFrom(InputStream input) throws IOException {
         return (CR2S_WarInfo_21102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_WarInfo_21102 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_WarInfo_21102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_WarInfo_21102 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_WarInfo_21102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_WarInfo_21102 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_WarInfo_21102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_WarInfo_21102 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_WarInfo_21102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_WarInfo_21102 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_WarInfo_21102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_WarInfo_21102 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_WarInfo_21102 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_WarInfo_21102> parser() {
         return PARSER;
      }

      public Parser<CR2S_WarInfo_21102> getParserForType() {
         return PARSER;
      }

      public CR2S_WarInfo_21102 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_WarInfo_21102OrBuilder {
         private int bitField0_;
         private boolean leave_;
         private MergeWarGameMsg.S2C_WarInfo_19502 warInfo_;
         private SingleFieldBuilderV3<MergeWarGameMsg.S2C_WarInfo_19502, MergeWarGameMsg.S2C_WarInfo_19502.Builder, MergeWarGameMsg.S2C_WarInfo_19502OrBuilder> warInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_WarInfo_21102_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_WarInfo_21102_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_WarInfo_21102.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.CR2S_WarInfo_21102.alwaysUseFieldBuilders) {
               this.getWarInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.leave_ = false;
            this.bitField0_ &= -2;
            if (this.warInfoBuilder_ == null) {
               this.warInfo_ = null;
            } else {
               this.warInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_WarInfo_21102_descriptor;
         }

         public CR2S_WarInfo_21102 getDefaultInstanceForType() {
            return CrossCoreWarMsg.CR2S_WarInfo_21102.getDefaultInstance();
         }

         public CR2S_WarInfo_21102 build() {
            CR2S_WarInfo_21102 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_WarInfo_21102 buildPartial() {
            CR2S_WarInfo_21102 result = new CR2S_WarInfo_21102(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.leave_ = this.leave_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.warInfoBuilder_ == null) {
                  result.warInfo_ = this.warInfo_;
               } else {
                  result.warInfo_ = (MergeWarGameMsg.S2C_WarInfo_19502)this.warInfoBuilder_.build();
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
            if (other instanceof CR2S_WarInfo_21102) {
               return this.mergeFrom((CR2S_WarInfo_21102)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_WarInfo_21102 other) {
            if (other == CrossCoreWarMsg.CR2S_WarInfo_21102.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLeave()) {
                  this.setLeave(other.getLeave());
               }

               if (other.hasWarInfo()) {
                  this.mergeWarInfo(other.getWarInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasLeave()) {
               return false;
            } else {
               return !this.hasWarInfo() || this.getWarInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_WarInfo_21102 parsedMessage = null;

            try {
               parsedMessage = (CR2S_WarInfo_21102)CrossCoreWarMsg.CR2S_WarInfo_21102.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_WarInfo_21102)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLeave() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getLeave() {
            return this.leave_;
         }

         public Builder setLeave(boolean value) {
            this.bitField0_ |= 1;
            this.leave_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLeave() {
            this.bitField0_ &= -2;
            this.leave_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasWarInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public MergeWarGameMsg.S2C_WarInfo_19502 getWarInfo() {
            if (this.warInfoBuilder_ == null) {
               return this.warInfo_ == null ? MergeWarGameMsg.S2C_WarInfo_19502.getDefaultInstance() : this.warInfo_;
            } else {
               return (MergeWarGameMsg.S2C_WarInfo_19502)this.warInfoBuilder_.getMessage();
            }
         }

         public Builder setWarInfo(MergeWarGameMsg.S2C_WarInfo_19502 value) {
            if (this.warInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.warInfo_ = value;
               this.onChanged();
            } else {
               this.warInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setWarInfo(MergeWarGameMsg.S2C_WarInfo_19502.Builder builderForValue) {
            if (this.warInfoBuilder_ == null) {
               this.warInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.warInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeWarInfo(MergeWarGameMsg.S2C_WarInfo_19502 value) {
            if (this.warInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.warInfo_ != null && this.warInfo_ != MergeWarGameMsg.S2C_WarInfo_19502.getDefaultInstance()) {
                  this.warInfo_ = MergeWarGameMsg.S2C_WarInfo_19502.newBuilder(this.warInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.warInfo_ = value;
               }

               this.onChanged();
            } else {
               this.warInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearWarInfo() {
            if (this.warInfoBuilder_ == null) {
               this.warInfo_ = null;
               this.onChanged();
            } else {
               this.warInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public MergeWarGameMsg.S2C_WarInfo_19502.Builder getWarInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (MergeWarGameMsg.S2C_WarInfo_19502.Builder)this.getWarInfoFieldBuilder().getBuilder();
         }

         public MergeWarGameMsg.S2C_WarInfo_19502OrBuilder getWarInfoOrBuilder() {
            if (this.warInfoBuilder_ != null) {
               return (MergeWarGameMsg.S2C_WarInfo_19502OrBuilder)this.warInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.warInfo_ == null ? MergeWarGameMsg.S2C_WarInfo_19502.getDefaultInstance() : this.warInfo_;
            }
         }

         private SingleFieldBuilderV3<MergeWarGameMsg.S2C_WarInfo_19502, MergeWarGameMsg.S2C_WarInfo_19502.Builder, MergeWarGameMsg.S2C_WarInfo_19502OrBuilder> getWarInfoFieldBuilder() {
            if (this.warInfoBuilder_ == null) {
               this.warInfoBuilder_ = new SingleFieldBuilderV3(this.getWarInfo(), this.getParentForChildren(), this.isClean());
               this.warInfo_ = null;
            }

            return this.warInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_Move_21103 extends GeneratedMessageV3 implements S2CR_Move_21103OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRIDID_FIELD_NUMBER = 1;
      private Internal.IntList gridId_;
      public static final int AUTO_FIELD_NUMBER = 2;
      private boolean auto_;
      private byte memoizedIsInitialized;
      private static final S2CR_Move_21103 DEFAULT_INSTANCE = new S2CR_Move_21103();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Move_21103> PARSER = new AbstractParser<S2CR_Move_21103>() {
         public S2CR_Move_21103 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Move_21103(input, extensionRegistry);
         }
      };

      private S2CR_Move_21103(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Move_21103() {
         this.memoizedIsInitialized = -1;
         this.gridId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Move_21103();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Move_21103(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.gridId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.gridId_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gridId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.auto_ = input.readBool();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.gridId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.gridId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_Move_21103_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_Move_21103_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Move_21103.class, Builder.class);
      }

      public List<Integer> getGridIdList() {
         return this.gridId_;
      }

      public int getGridIdCount() {
         return this.gridId_.size();
      }

      public int getGridId(int index) {
         return this.gridId_.getInt(index);
      }

      public boolean hasAuto() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getAuto() {
         return this.auto_;
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
         for(int i = 0; i < this.gridId_.size(); ++i) {
            output.writeInt32(1, this.gridId_.getInt(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(2, this.auto_);
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

            for(int i = 0; i < this.gridId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gridId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGridIdList().size();
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.auto_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_Move_21103)) {
            return super.equals(obj);
         } else {
            S2CR_Move_21103 other = (S2CR_Move_21103)obj;
            if (!this.getGridIdList().equals(other.getGridIdList())) {
               return false;
            } else if (this.hasAuto() != other.hasAuto()) {
               return false;
            } else if (this.hasAuto() && this.getAuto() != other.getAuto()) {
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
            if (this.getGridIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGridIdList().hashCode();
            }

            if (this.hasAuto()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getAuto());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_Move_21103 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Move_21103)PARSER.parseFrom(data);
      }

      public static S2CR_Move_21103 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Move_21103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Move_21103 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Move_21103)PARSER.parseFrom(data);
      }

      public static S2CR_Move_21103 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Move_21103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Move_21103 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Move_21103)PARSER.parseFrom(data);
      }

      public static S2CR_Move_21103 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Move_21103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Move_21103 parseFrom(InputStream input) throws IOException {
         return (S2CR_Move_21103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Move_21103 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Move_21103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Move_21103 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Move_21103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Move_21103 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Move_21103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Move_21103 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Move_21103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Move_21103 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Move_21103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Move_21103 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Move_21103 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Move_21103> parser() {
         return PARSER;
      }

      public Parser<S2CR_Move_21103> getParserForType() {
         return PARSER;
      }

      public S2CR_Move_21103 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Move_21103OrBuilder {
         private int bitField0_;
         private Internal.IntList gridId_;
         private boolean auto_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_Move_21103_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_Move_21103_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Move_21103.class, Builder.class);
         }

         private Builder() {
            this.gridId_ = CrossCoreWarMsg.S2CR_Move_21103.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gridId_ = CrossCoreWarMsg.S2CR_Move_21103.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.S2CR_Move_21103.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.gridId_ = CrossCoreWarMsg.S2CR_Move_21103.emptyIntList();
            this.bitField0_ &= -2;
            this.auto_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_Move_21103_descriptor;
         }

         public S2CR_Move_21103 getDefaultInstanceForType() {
            return CrossCoreWarMsg.S2CR_Move_21103.getDefaultInstance();
         }

         public S2CR_Move_21103 build() {
            S2CR_Move_21103 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Move_21103 buildPartial() {
            S2CR_Move_21103 result = new S2CR_Move_21103(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.gridId_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.gridId_ = this.gridId_;
            if ((from_bitField0_ & 2) != 0) {
               result.auto_ = this.auto_;
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
            if (other instanceof S2CR_Move_21103) {
               return this.mergeFrom((S2CR_Move_21103)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Move_21103 other) {
            if (other == CrossCoreWarMsg.S2CR_Move_21103.getDefaultInstance()) {
               return this;
            } else {
               if (!other.gridId_.isEmpty()) {
                  if (this.gridId_.isEmpty()) {
                     this.gridId_ = other.gridId_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureGridIdIsMutable();
                     this.gridId_.addAll(other.gridId_);
                  }

                  this.onChanged();
               }

               if (other.hasAuto()) {
                  this.setAuto(other.getAuto());
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
            S2CR_Move_21103 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Move_21103)CrossCoreWarMsg.S2CR_Move_21103.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Move_21103)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureGridIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.gridId_ = CrossCoreWarMsg.S2CR_Move_21103.mutableCopy(this.gridId_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getGridIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.gridId_) : this.gridId_);
         }

         public int getGridIdCount() {
            return this.gridId_.size();
         }

         public int getGridId(int index) {
            return this.gridId_.getInt(index);
         }

         public Builder setGridId(int index, int value) {
            this.ensureGridIdIsMutable();
            this.gridId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGridId(int value) {
            this.ensureGridIdIsMutable();
            this.gridId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGridId(Iterable<? extends Integer> values) {
            this.ensureGridIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gridId_);
            this.onChanged();
            return this;
         }

         public Builder clearGridId() {
            this.gridId_ = CrossCoreWarMsg.S2CR_Move_21103.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public boolean hasAuto() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getAuto() {
            return this.auto_;
         }

         public Builder setAuto(boolean value) {
            this.bitField0_ |= 2;
            this.auto_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAuto() {
            this.bitField0_ &= -3;
            this.auto_ = false;
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

   public static final class CR2S_Move_21104 extends GeneratedMessageV3 implements CR2S_Move_21104OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int GRIDID_FIELD_NUMBER = 2;
      private Internal.IntList gridId_;
      public static final int TRANSFER_FIELD_NUMBER = 3;
      private boolean transfer_;
      public static final int SERVERID_FIELD_NUMBER = 4;
      private int serverId_;
      private byte memoizedIsInitialized;
      private static final CR2S_Move_21104 DEFAULT_INSTANCE = new CR2S_Move_21104();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_Move_21104> PARSER = new AbstractParser<CR2S_Move_21104>() {
         public CR2S_Move_21104 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_Move_21104(input, extensionRegistry);
         }
      };

      private CR2S_Move_21104(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_Move_21104() {
         this.memoizedIsInitialized = -1;
         this.gridId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_Move_21104();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_Move_21104(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.playerId_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.gridId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.gridId_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gridId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.transfer_ = input.readBool();
                        continue;
                     case 32:
                        this.bitField0_ |= 4;
                        this.serverId_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.gridId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.gridId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Move_21104_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Move_21104_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Move_21104.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public List<Integer> getGridIdList() {
         return this.gridId_;
      }

      public int getGridIdCount() {
         return this.gridId_.size();
      }

      public int getGridId(int index) {
         return this.gridId_.getInt(index);
      }

      public boolean hasTransfer() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getTransfer() {
         return this.transfer_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 4) != 0;
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

         for(int i = 0; i < this.gridId_.size(); ++i) {
            output.writeInt32(2, this.gridId_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(3, this.transfer_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.serverId_);
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

            for(int i = 0; i < this.gridId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gridId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGridIdList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.transfer_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.serverId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_Move_21104)) {
            return super.equals(obj);
         } else {
            CR2S_Move_21104 other = (CR2S_Move_21104)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (!this.getGridIdList().equals(other.getGridIdList())) {
               return false;
            } else if (this.hasTransfer() != other.hasTransfer()) {
               return false;
            } else if (this.hasTransfer() && this.getTransfer() != other.getTransfer()) {
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

            if (this.getGridIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGridIdList().hashCode();
            }

            if (this.hasTransfer()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getTransfer());
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getServerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_Move_21104 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_Move_21104)PARSER.parseFrom(data);
      }

      public static CR2S_Move_21104 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Move_21104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Move_21104 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_Move_21104)PARSER.parseFrom(data);
      }

      public static CR2S_Move_21104 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Move_21104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Move_21104 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_Move_21104)PARSER.parseFrom(data);
      }

      public static CR2S_Move_21104 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Move_21104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Move_21104 parseFrom(InputStream input) throws IOException {
         return (CR2S_Move_21104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Move_21104 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Move_21104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Move_21104 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_Move_21104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_Move_21104 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Move_21104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Move_21104 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_Move_21104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Move_21104 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Move_21104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_Move_21104 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_Move_21104 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_Move_21104> parser() {
         return PARSER;
      }

      public Parser<CR2S_Move_21104> getParserForType() {
         return PARSER;
      }

      public CR2S_Move_21104 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_Move_21104OrBuilder {
         private int bitField0_;
         private int playerId_;
         private Internal.IntList gridId_;
         private boolean transfer_;
         private int serverId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Move_21104_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Move_21104_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Move_21104.class, Builder.class);
         }

         private Builder() {
            this.gridId_ = CrossCoreWarMsg.CR2S_Move_21104.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gridId_ = CrossCoreWarMsg.CR2S_Move_21104.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.CR2S_Move_21104.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.gridId_ = CrossCoreWarMsg.CR2S_Move_21104.emptyIntList();
            this.bitField0_ &= -3;
            this.transfer_ = false;
            this.bitField0_ &= -5;
            this.serverId_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Move_21104_descriptor;
         }

         public CR2S_Move_21104 getDefaultInstanceForType() {
            return CrossCoreWarMsg.CR2S_Move_21104.getDefaultInstance();
         }

         public CR2S_Move_21104 build() {
            CR2S_Move_21104 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_Move_21104 buildPartial() {
            CR2S_Move_21104 result = new CR2S_Move_21104(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.gridId_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.gridId_ = this.gridId_;
            if ((from_bitField0_ & 4) != 0) {
               result.transfer_ = this.transfer_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.serverId_ = this.serverId_;
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
            if (other instanceof CR2S_Move_21104) {
               return this.mergeFrom((CR2S_Move_21104)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_Move_21104 other) {
            if (other == CrossCoreWarMsg.CR2S_Move_21104.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (!other.gridId_.isEmpty()) {
                  if (this.gridId_.isEmpty()) {
                     this.gridId_ = other.gridId_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureGridIdIsMutable();
                     this.gridId_.addAll(other.gridId_);
                  }

                  this.onChanged();
               }

               if (other.hasTransfer()) {
                  this.setTransfer(other.getTransfer());
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
            CR2S_Move_21104 parsedMessage = null;

            try {
               parsedMessage = (CR2S_Move_21104)CrossCoreWarMsg.CR2S_Move_21104.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_Move_21104)e.getUnfinishedMessage();
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

         private void ensureGridIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.gridId_ = CrossCoreWarMsg.CR2S_Move_21104.mutableCopy(this.gridId_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getGridIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.gridId_) : this.gridId_);
         }

         public int getGridIdCount() {
            return this.gridId_.size();
         }

         public int getGridId(int index) {
            return this.gridId_.getInt(index);
         }

         public Builder setGridId(int index, int value) {
            this.ensureGridIdIsMutable();
            this.gridId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGridId(int value) {
            this.ensureGridIdIsMutable();
            this.gridId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGridId(Iterable<? extends Integer> values) {
            this.ensureGridIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gridId_);
            this.onChanged();
            return this;
         }

         public Builder clearGridId() {
            this.gridId_ = CrossCoreWarMsg.CR2S_Move_21104.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasTransfer() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getTransfer() {
            return this.transfer_;
         }

         public Builder setTransfer(boolean value) {
            this.bitField0_ |= 4;
            this.transfer_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTransfer() {
            this.bitField0_ &= -5;
            this.transfer_ = false;
            this.onChanged();
            return this;
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_AtkBuilding_21105 extends GeneratedMessageV3 implements S2CR_AtkBuilding_21105OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRIDID_FIELD_NUMBER = 1;
      private int gridId_;
      public static final int SKIPBATTLE_FIELD_NUMBER = 2;
      private int skipBattle_;
      private byte memoizedIsInitialized;
      private static final S2CR_AtkBuilding_21105 DEFAULT_INSTANCE = new S2CR_AtkBuilding_21105();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_AtkBuilding_21105> PARSER = new AbstractParser<S2CR_AtkBuilding_21105>() {
         public S2CR_AtkBuilding_21105 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_AtkBuilding_21105(input, extensionRegistry);
         }
      };

      private S2CR_AtkBuilding_21105(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_AtkBuilding_21105() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_AtkBuilding_21105();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_AtkBuilding_21105(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.gridId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.skipBattle_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_AtkBuilding_21105_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_AtkBuilding_21105_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_AtkBuilding_21105.class, Builder.class);
      }

      public boolean hasGridId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGridId() {
         return this.gridId_;
      }

      public boolean hasSkipBattle() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSkipBattle() {
         return this.skipBattle_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGridId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.gridId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.skipBattle_);
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
               size += CodedOutputStream.computeInt32Size(1, this.gridId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.skipBattle_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_AtkBuilding_21105)) {
            return super.equals(obj);
         } else {
            S2CR_AtkBuilding_21105 other = (S2CR_AtkBuilding_21105)obj;
            if (this.hasGridId() != other.hasGridId()) {
               return false;
            } else if (this.hasGridId() && this.getGridId() != other.getGridId()) {
               return false;
            } else if (this.hasSkipBattle() != other.hasSkipBattle()) {
               return false;
            } else if (this.hasSkipBattle() && this.getSkipBattle() != other.getSkipBattle()) {
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
            if (this.hasGridId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGridId();
            }

            if (this.hasSkipBattle()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSkipBattle();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_AtkBuilding_21105 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_AtkBuilding_21105)PARSER.parseFrom(data);
      }

      public static S2CR_AtkBuilding_21105 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AtkBuilding_21105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AtkBuilding_21105 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_AtkBuilding_21105)PARSER.parseFrom(data);
      }

      public static S2CR_AtkBuilding_21105 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AtkBuilding_21105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AtkBuilding_21105 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_AtkBuilding_21105)PARSER.parseFrom(data);
      }

      public static S2CR_AtkBuilding_21105 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AtkBuilding_21105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AtkBuilding_21105 parseFrom(InputStream input) throws IOException {
         return (S2CR_AtkBuilding_21105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_AtkBuilding_21105 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AtkBuilding_21105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_AtkBuilding_21105 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_AtkBuilding_21105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_AtkBuilding_21105 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AtkBuilding_21105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_AtkBuilding_21105 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_AtkBuilding_21105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_AtkBuilding_21105 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AtkBuilding_21105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_AtkBuilding_21105 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_AtkBuilding_21105 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_AtkBuilding_21105> parser() {
         return PARSER;
      }

      public Parser<S2CR_AtkBuilding_21105> getParserForType() {
         return PARSER;
      }

      public S2CR_AtkBuilding_21105 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_AtkBuilding_21105OrBuilder {
         private int bitField0_;
         private int gridId_;
         private int skipBattle_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_AtkBuilding_21105_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_AtkBuilding_21105_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_AtkBuilding_21105.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.S2CR_AtkBuilding_21105.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.gridId_ = 0;
            this.bitField0_ &= -2;
            this.skipBattle_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_AtkBuilding_21105_descriptor;
         }

         public S2CR_AtkBuilding_21105 getDefaultInstanceForType() {
            return CrossCoreWarMsg.S2CR_AtkBuilding_21105.getDefaultInstance();
         }

         public S2CR_AtkBuilding_21105 build() {
            S2CR_AtkBuilding_21105 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_AtkBuilding_21105 buildPartial() {
            S2CR_AtkBuilding_21105 result = new S2CR_AtkBuilding_21105(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.gridId_ = this.gridId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.skipBattle_ = this.skipBattle_;
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
            if (other instanceof S2CR_AtkBuilding_21105) {
               return this.mergeFrom((S2CR_AtkBuilding_21105)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_AtkBuilding_21105 other) {
            if (other == CrossCoreWarMsg.S2CR_AtkBuilding_21105.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGridId()) {
                  this.setGridId(other.getGridId());
               }

               if (other.hasSkipBattle()) {
                  this.setSkipBattle(other.getSkipBattle());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGridId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_AtkBuilding_21105 parsedMessage = null;

            try {
               parsedMessage = (S2CR_AtkBuilding_21105)CrossCoreWarMsg.S2CR_AtkBuilding_21105.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_AtkBuilding_21105)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGridId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGridId() {
            return this.gridId_;
         }

         public Builder setGridId(int value) {
            this.bitField0_ |= 1;
            this.gridId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGridId() {
            this.bitField0_ &= -2;
            this.gridId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSkipBattle() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSkipBattle() {
            return this.skipBattle_;
         }

         public Builder setSkipBattle(int value) {
            this.bitField0_ |= 2;
            this.skipBattle_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSkipBattle() {
            this.bitField0_ &= -3;
            this.skipBattle_ = 0;
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

   public static final class S2CR_AtkPlayer_21107 extends GeneratedMessageV3 implements S2CR_AtkPlayer_21107OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRIDID_FIELD_NUMBER = 1;
      private int gridId_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int SKIPBATTLE_FIELD_NUMBER = 3;
      private int skipBattle_;
      private byte memoizedIsInitialized;
      private static final S2CR_AtkPlayer_21107 DEFAULT_INSTANCE = new S2CR_AtkPlayer_21107();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_AtkPlayer_21107> PARSER = new AbstractParser<S2CR_AtkPlayer_21107>() {
         public S2CR_AtkPlayer_21107 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_AtkPlayer_21107(input, extensionRegistry);
         }
      };

      private S2CR_AtkPlayer_21107(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_AtkPlayer_21107() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_AtkPlayer_21107();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_AtkPlayer_21107(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.gridId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.playerId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.skipBattle_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_AtkPlayer_21107_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_AtkPlayer_21107_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_AtkPlayer_21107.class, Builder.class);
      }

      public boolean hasGridId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGridId() {
         return this.gridId_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasSkipBattle() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSkipBattle() {
         return this.skipBattle_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGridId()) {
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
            output.writeInt32(1, this.gridId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.skipBattle_);
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
               size += CodedOutputStream.computeInt32Size(1, this.gridId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.skipBattle_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_AtkPlayer_21107)) {
            return super.equals(obj);
         } else {
            S2CR_AtkPlayer_21107 other = (S2CR_AtkPlayer_21107)obj;
            if (this.hasGridId() != other.hasGridId()) {
               return false;
            } else if (this.hasGridId() && this.getGridId() != other.getGridId()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasSkipBattle() != other.hasSkipBattle()) {
               return false;
            } else if (this.hasSkipBattle() && this.getSkipBattle() != other.getSkipBattle()) {
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
            if (this.hasGridId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGridId();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasSkipBattle()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSkipBattle();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_AtkPlayer_21107 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_AtkPlayer_21107)PARSER.parseFrom(data);
      }

      public static S2CR_AtkPlayer_21107 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AtkPlayer_21107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AtkPlayer_21107 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_AtkPlayer_21107)PARSER.parseFrom(data);
      }

      public static S2CR_AtkPlayer_21107 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AtkPlayer_21107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AtkPlayer_21107 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_AtkPlayer_21107)PARSER.parseFrom(data);
      }

      public static S2CR_AtkPlayer_21107 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AtkPlayer_21107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AtkPlayer_21107 parseFrom(InputStream input) throws IOException {
         return (S2CR_AtkPlayer_21107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_AtkPlayer_21107 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AtkPlayer_21107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_AtkPlayer_21107 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_AtkPlayer_21107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_AtkPlayer_21107 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AtkPlayer_21107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_AtkPlayer_21107 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_AtkPlayer_21107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_AtkPlayer_21107 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AtkPlayer_21107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_AtkPlayer_21107 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_AtkPlayer_21107 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_AtkPlayer_21107> parser() {
         return PARSER;
      }

      public Parser<S2CR_AtkPlayer_21107> getParserForType() {
         return PARSER;
      }

      public S2CR_AtkPlayer_21107 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_AtkPlayer_21107OrBuilder {
         private int bitField0_;
         private int gridId_;
         private int playerId_;
         private int skipBattle_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_AtkPlayer_21107_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_AtkPlayer_21107_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_AtkPlayer_21107.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.S2CR_AtkPlayer_21107.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.gridId_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.skipBattle_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_AtkPlayer_21107_descriptor;
         }

         public S2CR_AtkPlayer_21107 getDefaultInstanceForType() {
            return CrossCoreWarMsg.S2CR_AtkPlayer_21107.getDefaultInstance();
         }

         public S2CR_AtkPlayer_21107 build() {
            S2CR_AtkPlayer_21107 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_AtkPlayer_21107 buildPartial() {
            S2CR_AtkPlayer_21107 result = new S2CR_AtkPlayer_21107(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.gridId_ = this.gridId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.skipBattle_ = this.skipBattle_;
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
            if (other instanceof S2CR_AtkPlayer_21107) {
               return this.mergeFrom((S2CR_AtkPlayer_21107)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_AtkPlayer_21107 other) {
            if (other == CrossCoreWarMsg.S2CR_AtkPlayer_21107.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGridId()) {
                  this.setGridId(other.getGridId());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasSkipBattle()) {
                  this.setSkipBattle(other.getSkipBattle());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGridId()) {
               return false;
            } else {
               return this.hasPlayerId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_AtkPlayer_21107 parsedMessage = null;

            try {
               parsedMessage = (S2CR_AtkPlayer_21107)CrossCoreWarMsg.S2CR_AtkPlayer_21107.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_AtkPlayer_21107)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGridId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGridId() {
            return this.gridId_;
         }

         public Builder setGridId(int value) {
            this.bitField0_ |= 1;
            this.gridId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGridId() {
            this.bitField0_ &= -2;
            this.gridId_ = 0;
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

         public boolean hasSkipBattle() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSkipBattle() {
            return this.skipBattle_;
         }

         public Builder setSkipBattle(int value) {
            this.bitField0_ |= 4;
            this.skipBattle_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSkipBattle() {
            this.bitField0_ &= -5;
            this.skipBattle_ = 0;
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

   public static final class CR2S_UpdateBuildingInfo_21110 extends GeneratedMessageV3 implements CR2S_UpdateBuildingInfo_21110OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int BUILDINGINFO_FIELD_NUMBER = 1;
      private List<MergeWarGameMsg.BuildingInfo> buildingInfo_;
      private byte memoizedIsInitialized;
      private static final CR2S_UpdateBuildingInfo_21110 DEFAULT_INSTANCE = new CR2S_UpdateBuildingInfo_21110();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UpdateBuildingInfo_21110> PARSER = new AbstractParser<CR2S_UpdateBuildingInfo_21110>() {
         public CR2S_UpdateBuildingInfo_21110 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UpdateBuildingInfo_21110(input, extensionRegistry);
         }
      };

      private CR2S_UpdateBuildingInfo_21110(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UpdateBuildingInfo_21110() {
         this.memoizedIsInitialized = -1;
         this.buildingInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UpdateBuildingInfo_21110();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UpdateBuildingInfo_21110(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.buildingInfo_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.buildingInfo_.add(input.readMessage(MergeWarGameMsg.BuildingInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.buildingInfo_ = Collections.unmodifiableList(this.buildingInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateBuildingInfo_21110_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateBuildingInfo_21110_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpdateBuildingInfo_21110.class, Builder.class);
      }

      public List<MergeWarGameMsg.BuildingInfo> getBuildingInfoList() {
         return this.buildingInfo_;
      }

      public List<? extends MergeWarGameMsg.BuildingInfoOrBuilder> getBuildingInfoOrBuilderList() {
         return this.buildingInfo_;
      }

      public int getBuildingInfoCount() {
         return this.buildingInfo_.size();
      }

      public MergeWarGameMsg.BuildingInfo getBuildingInfo(int index) {
         return (MergeWarGameMsg.BuildingInfo)this.buildingInfo_.get(index);
      }

      public MergeWarGameMsg.BuildingInfoOrBuilder getBuildingInfoOrBuilder(int index) {
         return (MergeWarGameMsg.BuildingInfoOrBuilder)this.buildingInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getBuildingInfoCount(); ++i) {
               if (!this.getBuildingInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.buildingInfo_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.buildingInfo_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.buildingInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.buildingInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_UpdateBuildingInfo_21110)) {
            return super.equals(obj);
         } else {
            CR2S_UpdateBuildingInfo_21110 other = (CR2S_UpdateBuildingInfo_21110)obj;
            if (!this.getBuildingInfoList().equals(other.getBuildingInfoList())) {
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
            if (this.getBuildingInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuildingInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_UpdateBuildingInfo_21110 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateBuildingInfo_21110)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateBuildingInfo_21110 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateBuildingInfo_21110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateBuildingInfo_21110 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateBuildingInfo_21110)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateBuildingInfo_21110 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateBuildingInfo_21110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateBuildingInfo_21110 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateBuildingInfo_21110)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateBuildingInfo_21110 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateBuildingInfo_21110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateBuildingInfo_21110 parseFrom(InputStream input) throws IOException {
         return (CR2S_UpdateBuildingInfo_21110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpdateBuildingInfo_21110 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateBuildingInfo_21110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpdateBuildingInfo_21110 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UpdateBuildingInfo_21110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UpdateBuildingInfo_21110 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateBuildingInfo_21110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpdateBuildingInfo_21110 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UpdateBuildingInfo_21110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpdateBuildingInfo_21110 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateBuildingInfo_21110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UpdateBuildingInfo_21110 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UpdateBuildingInfo_21110 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UpdateBuildingInfo_21110> parser() {
         return PARSER;
      }

      public Parser<CR2S_UpdateBuildingInfo_21110> getParserForType() {
         return PARSER;
      }

      public CR2S_UpdateBuildingInfo_21110 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UpdateBuildingInfo_21110OrBuilder {
         private int bitField0_;
         private List<MergeWarGameMsg.BuildingInfo> buildingInfo_;
         private RepeatedFieldBuilderV3<MergeWarGameMsg.BuildingInfo, MergeWarGameMsg.BuildingInfo.Builder, MergeWarGameMsg.BuildingInfoOrBuilder> buildingInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateBuildingInfo_21110_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateBuildingInfo_21110_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpdateBuildingInfo_21110.class, Builder.class);
         }

         private Builder() {
            this.buildingInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.buildingInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.CR2S_UpdateBuildingInfo_21110.alwaysUseFieldBuilders) {
               this.getBuildingInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.buildingInfoBuilder_ == null) {
               this.buildingInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.buildingInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateBuildingInfo_21110_descriptor;
         }

         public CR2S_UpdateBuildingInfo_21110 getDefaultInstanceForType() {
            return CrossCoreWarMsg.CR2S_UpdateBuildingInfo_21110.getDefaultInstance();
         }

         public CR2S_UpdateBuildingInfo_21110 build() {
            CR2S_UpdateBuildingInfo_21110 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UpdateBuildingInfo_21110 buildPartial() {
            CR2S_UpdateBuildingInfo_21110 result = new CR2S_UpdateBuildingInfo_21110(this);
            int from_bitField0_ = this.bitField0_;
            if (this.buildingInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.buildingInfo_ = Collections.unmodifiableList(this.buildingInfo_);
                  this.bitField0_ &= -2;
               }

               result.buildingInfo_ = this.buildingInfo_;
            } else {
               result.buildingInfo_ = this.buildingInfoBuilder_.build();
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
            if (other instanceof CR2S_UpdateBuildingInfo_21110) {
               return this.mergeFrom((CR2S_UpdateBuildingInfo_21110)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UpdateBuildingInfo_21110 other) {
            if (other == CrossCoreWarMsg.CR2S_UpdateBuildingInfo_21110.getDefaultInstance()) {
               return this;
            } else {
               if (this.buildingInfoBuilder_ == null) {
                  if (!other.buildingInfo_.isEmpty()) {
                     if (this.buildingInfo_.isEmpty()) {
                        this.buildingInfo_ = other.buildingInfo_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureBuildingInfoIsMutable();
                        this.buildingInfo_.addAll(other.buildingInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.buildingInfo_.isEmpty()) {
                  if (this.buildingInfoBuilder_.isEmpty()) {
                     this.buildingInfoBuilder_.dispose();
                     this.buildingInfoBuilder_ = null;
                     this.buildingInfo_ = other.buildingInfo_;
                     this.bitField0_ &= -2;
                     this.buildingInfoBuilder_ = CrossCoreWarMsg.CR2S_UpdateBuildingInfo_21110.alwaysUseFieldBuilders ? this.getBuildingInfoFieldBuilder() : null;
                  } else {
                     this.buildingInfoBuilder_.addAllMessages(other.buildingInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getBuildingInfoCount(); ++i) {
               if (!this.getBuildingInfo(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_UpdateBuildingInfo_21110 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UpdateBuildingInfo_21110)CrossCoreWarMsg.CR2S_UpdateBuildingInfo_21110.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UpdateBuildingInfo_21110)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureBuildingInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.buildingInfo_ = new ArrayList(this.buildingInfo_);
               this.bitField0_ |= 1;
            }

         }

         public List<MergeWarGameMsg.BuildingInfo> getBuildingInfoList() {
            return this.buildingInfoBuilder_ == null ? Collections.unmodifiableList(this.buildingInfo_) : this.buildingInfoBuilder_.getMessageList();
         }

         public int getBuildingInfoCount() {
            return this.buildingInfoBuilder_ == null ? this.buildingInfo_.size() : this.buildingInfoBuilder_.getCount();
         }

         public MergeWarGameMsg.BuildingInfo getBuildingInfo(int index) {
            return this.buildingInfoBuilder_ == null ? (MergeWarGameMsg.BuildingInfo)this.buildingInfo_.get(index) : (MergeWarGameMsg.BuildingInfo)this.buildingInfoBuilder_.getMessage(index);
         }

         public Builder setBuildingInfo(int index, MergeWarGameMsg.BuildingInfo value) {
            if (this.buildingInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBuildingInfoIsMutable();
               this.buildingInfo_.set(index, value);
               this.onChanged();
            } else {
               this.buildingInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setBuildingInfo(int index, MergeWarGameMsg.BuildingInfo.Builder builderForValue) {
            if (this.buildingInfoBuilder_ == null) {
               this.ensureBuildingInfoIsMutable();
               this.buildingInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.buildingInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addBuildingInfo(MergeWarGameMsg.BuildingInfo value) {
            if (this.buildingInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBuildingInfoIsMutable();
               this.buildingInfo_.add(value);
               this.onChanged();
            } else {
               this.buildingInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addBuildingInfo(int index, MergeWarGameMsg.BuildingInfo value) {
            if (this.buildingInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBuildingInfoIsMutable();
               this.buildingInfo_.add(index, value);
               this.onChanged();
            } else {
               this.buildingInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addBuildingInfo(MergeWarGameMsg.BuildingInfo.Builder builderForValue) {
            if (this.buildingInfoBuilder_ == null) {
               this.ensureBuildingInfoIsMutable();
               this.buildingInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.buildingInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addBuildingInfo(int index, MergeWarGameMsg.BuildingInfo.Builder builderForValue) {
            if (this.buildingInfoBuilder_ == null) {
               this.ensureBuildingInfoIsMutable();
               this.buildingInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.buildingInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllBuildingInfo(Iterable<? extends MergeWarGameMsg.BuildingInfo> values) {
            if (this.buildingInfoBuilder_ == null) {
               this.ensureBuildingInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.buildingInfo_);
               this.onChanged();
            } else {
               this.buildingInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearBuildingInfo() {
            if (this.buildingInfoBuilder_ == null) {
               this.buildingInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.buildingInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeBuildingInfo(int index) {
            if (this.buildingInfoBuilder_ == null) {
               this.ensureBuildingInfoIsMutable();
               this.buildingInfo_.remove(index);
               this.onChanged();
            } else {
               this.buildingInfoBuilder_.remove(index);
            }

            return this;
         }

         public MergeWarGameMsg.BuildingInfo.Builder getBuildingInfoBuilder(int index) {
            return (MergeWarGameMsg.BuildingInfo.Builder)this.getBuildingInfoFieldBuilder().getBuilder(index);
         }

         public MergeWarGameMsg.BuildingInfoOrBuilder getBuildingInfoOrBuilder(int index) {
            return this.buildingInfoBuilder_ == null ? (MergeWarGameMsg.BuildingInfoOrBuilder)this.buildingInfo_.get(index) : (MergeWarGameMsg.BuildingInfoOrBuilder)this.buildingInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MergeWarGameMsg.BuildingInfoOrBuilder> getBuildingInfoOrBuilderList() {
            return this.buildingInfoBuilder_ != null ? this.buildingInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.buildingInfo_);
         }

         public MergeWarGameMsg.BuildingInfo.Builder addBuildingInfoBuilder() {
            return (MergeWarGameMsg.BuildingInfo.Builder)this.getBuildingInfoFieldBuilder().addBuilder(MergeWarGameMsg.BuildingInfo.getDefaultInstance());
         }

         public MergeWarGameMsg.BuildingInfo.Builder addBuildingInfoBuilder(int index) {
            return (MergeWarGameMsg.BuildingInfo.Builder)this.getBuildingInfoFieldBuilder().addBuilder(index, MergeWarGameMsg.BuildingInfo.getDefaultInstance());
         }

         public List<MergeWarGameMsg.BuildingInfo.Builder> getBuildingInfoBuilderList() {
            return this.getBuildingInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MergeWarGameMsg.BuildingInfo, MergeWarGameMsg.BuildingInfo.Builder, MergeWarGameMsg.BuildingInfoOrBuilder> getBuildingInfoFieldBuilder() {
            if (this.buildingInfoBuilder_ == null) {
               this.buildingInfoBuilder_ = new RepeatedFieldBuilderV3(this.buildingInfo_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.buildingInfo_ = null;
            }

            return this.buildingInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_ScoreReward_21111 extends GeneratedMessageV3 implements S2CR_ScoreReward_21111OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SCOREID_FIELD_NUMBER = 1;
      private int scoreId_;
      private byte memoizedIsInitialized;
      private static final S2CR_ScoreReward_21111 DEFAULT_INSTANCE = new S2CR_ScoreReward_21111();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_ScoreReward_21111> PARSER = new AbstractParser<S2CR_ScoreReward_21111>() {
         public S2CR_ScoreReward_21111 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_ScoreReward_21111(input, extensionRegistry);
         }
      };

      private S2CR_ScoreReward_21111(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_ScoreReward_21111() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_ScoreReward_21111();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_ScoreReward_21111(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.scoreId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ScoreReward_21111_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ScoreReward_21111_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ScoreReward_21111.class, Builder.class);
      }

      public boolean hasScoreId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getScoreId() {
         return this.scoreId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasScoreId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.scoreId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.scoreId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_ScoreReward_21111)) {
            return super.equals(obj);
         } else {
            S2CR_ScoreReward_21111 other = (S2CR_ScoreReward_21111)obj;
            if (this.hasScoreId() != other.hasScoreId()) {
               return false;
            } else if (this.hasScoreId() && this.getScoreId() != other.getScoreId()) {
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
            if (this.hasScoreId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getScoreId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_ScoreReward_21111 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_ScoreReward_21111)PARSER.parseFrom(data);
      }

      public static S2CR_ScoreReward_21111 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ScoreReward_21111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ScoreReward_21111 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_ScoreReward_21111)PARSER.parseFrom(data);
      }

      public static S2CR_ScoreReward_21111 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ScoreReward_21111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ScoreReward_21111 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_ScoreReward_21111)PARSER.parseFrom(data);
      }

      public static S2CR_ScoreReward_21111 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ScoreReward_21111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ScoreReward_21111 parseFrom(InputStream input) throws IOException {
         return (S2CR_ScoreReward_21111)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ScoreReward_21111 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ScoreReward_21111)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ScoreReward_21111 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_ScoreReward_21111)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_ScoreReward_21111 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ScoreReward_21111)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ScoreReward_21111 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_ScoreReward_21111)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ScoreReward_21111 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ScoreReward_21111)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_ScoreReward_21111 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_ScoreReward_21111 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_ScoreReward_21111> parser() {
         return PARSER;
      }

      public Parser<S2CR_ScoreReward_21111> getParserForType() {
         return PARSER;
      }

      public S2CR_ScoreReward_21111 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_ScoreReward_21111OrBuilder {
         private int bitField0_;
         private int scoreId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ScoreReward_21111_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ScoreReward_21111_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ScoreReward_21111.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.S2CR_ScoreReward_21111.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.scoreId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ScoreReward_21111_descriptor;
         }

         public S2CR_ScoreReward_21111 getDefaultInstanceForType() {
            return CrossCoreWarMsg.S2CR_ScoreReward_21111.getDefaultInstance();
         }

         public S2CR_ScoreReward_21111 build() {
            S2CR_ScoreReward_21111 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_ScoreReward_21111 buildPartial() {
            S2CR_ScoreReward_21111 result = new S2CR_ScoreReward_21111(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.scoreId_ = this.scoreId_;
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
            if (other instanceof S2CR_ScoreReward_21111) {
               return this.mergeFrom((S2CR_ScoreReward_21111)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_ScoreReward_21111 other) {
            if (other == CrossCoreWarMsg.S2CR_ScoreReward_21111.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasScoreId()) {
                  this.setScoreId(other.getScoreId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasScoreId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_ScoreReward_21111 parsedMessage = null;

            try {
               parsedMessage = (S2CR_ScoreReward_21111)CrossCoreWarMsg.S2CR_ScoreReward_21111.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_ScoreReward_21111)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasScoreId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getScoreId() {
            return this.scoreId_;
         }

         public Builder setScoreId(int value) {
            this.bitField0_ |= 1;
            this.scoreId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearScoreId() {
            this.bitField0_ &= -2;
            this.scoreId_ = 0;
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

   public static final class CR2S_ScoreReward_21112 extends GeneratedMessageV3 implements CR2S_ScoreReward_21112OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SCOREID_FIELD_NUMBER = 1;
      private int scoreId_;
      private byte memoizedIsInitialized;
      private static final CR2S_ScoreReward_21112 DEFAULT_INSTANCE = new CR2S_ScoreReward_21112();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_ScoreReward_21112> PARSER = new AbstractParser<CR2S_ScoreReward_21112>() {
         public CR2S_ScoreReward_21112 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_ScoreReward_21112(input, extensionRegistry);
         }
      };

      private CR2S_ScoreReward_21112(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_ScoreReward_21112() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_ScoreReward_21112();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_ScoreReward_21112(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.scoreId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_ScoreReward_21112_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_ScoreReward_21112_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ScoreReward_21112.class, Builder.class);
      }

      public boolean hasScoreId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getScoreId() {
         return this.scoreId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasScoreId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.scoreId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.scoreId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_ScoreReward_21112)) {
            return super.equals(obj);
         } else {
            CR2S_ScoreReward_21112 other = (CR2S_ScoreReward_21112)obj;
            if (this.hasScoreId() != other.hasScoreId()) {
               return false;
            } else if (this.hasScoreId() && this.getScoreId() != other.getScoreId()) {
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
            if (this.hasScoreId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getScoreId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_ScoreReward_21112 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_ScoreReward_21112)PARSER.parseFrom(data);
      }

      public static CR2S_ScoreReward_21112 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ScoreReward_21112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ScoreReward_21112 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_ScoreReward_21112)PARSER.parseFrom(data);
      }

      public static CR2S_ScoreReward_21112 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ScoreReward_21112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ScoreReward_21112 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_ScoreReward_21112)PARSER.parseFrom(data);
      }

      public static CR2S_ScoreReward_21112 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ScoreReward_21112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ScoreReward_21112 parseFrom(InputStream input) throws IOException {
         return (CR2S_ScoreReward_21112)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ScoreReward_21112 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ScoreReward_21112)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ScoreReward_21112 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_ScoreReward_21112)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_ScoreReward_21112 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ScoreReward_21112)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ScoreReward_21112 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_ScoreReward_21112)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ScoreReward_21112 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ScoreReward_21112)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_ScoreReward_21112 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_ScoreReward_21112 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_ScoreReward_21112> parser() {
         return PARSER;
      }

      public Parser<CR2S_ScoreReward_21112> getParserForType() {
         return PARSER;
      }

      public CR2S_ScoreReward_21112 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_ScoreReward_21112OrBuilder {
         private int bitField0_;
         private int scoreId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_ScoreReward_21112_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_ScoreReward_21112_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ScoreReward_21112.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.CR2S_ScoreReward_21112.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.scoreId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_ScoreReward_21112_descriptor;
         }

         public CR2S_ScoreReward_21112 getDefaultInstanceForType() {
            return CrossCoreWarMsg.CR2S_ScoreReward_21112.getDefaultInstance();
         }

         public CR2S_ScoreReward_21112 build() {
            CR2S_ScoreReward_21112 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_ScoreReward_21112 buildPartial() {
            CR2S_ScoreReward_21112 result = new CR2S_ScoreReward_21112(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.scoreId_ = this.scoreId_;
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
            if (other instanceof CR2S_ScoreReward_21112) {
               return this.mergeFrom((CR2S_ScoreReward_21112)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_ScoreReward_21112 other) {
            if (other == CrossCoreWarMsg.CR2S_ScoreReward_21112.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasScoreId()) {
                  this.setScoreId(other.getScoreId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasScoreId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_ScoreReward_21112 parsedMessage = null;

            try {
               parsedMessage = (CR2S_ScoreReward_21112)CrossCoreWarMsg.CR2S_ScoreReward_21112.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_ScoreReward_21112)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasScoreId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getScoreId() {
            return this.scoreId_;
         }

         public Builder setScoreId(int value) {
            this.bitField0_ |= 1;
            this.scoreId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearScoreId() {
            this.bitField0_ &= -2;
            this.scoreId_ = 0;
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

   public static final class CR2S_PlayerEnter_21114 extends GeneratedMessageV3 implements CR2S_PlayerEnter_21114OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERINFO_FIELD_NUMBER = 1;
      private MergeWarGameMsg.PlayerInfo playerInfo_;
      private byte memoizedIsInitialized;
      private static final CR2S_PlayerEnter_21114 DEFAULT_INSTANCE = new CR2S_PlayerEnter_21114();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_PlayerEnter_21114> PARSER = new AbstractParser<CR2S_PlayerEnter_21114>() {
         public CR2S_PlayerEnter_21114 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_PlayerEnter_21114(input, extensionRegistry);
         }
      };

      private CR2S_PlayerEnter_21114(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_PlayerEnter_21114() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_PlayerEnter_21114();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_PlayerEnter_21114(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        MergeWarGameMsg.PlayerInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.playerInfo_.toBuilder();
                        }

                        this.playerInfo_ = (MergeWarGameMsg.PlayerInfo)input.readMessage(MergeWarGameMsg.PlayerInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.playerInfo_);
                           this.playerInfo_ = subBuilder.buildPartial();
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PlayerEnter_21114_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PlayerEnter_21114_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_PlayerEnter_21114.class, Builder.class);
      }

      public boolean hasPlayerInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public MergeWarGameMsg.PlayerInfo getPlayerInfo() {
         return this.playerInfo_ == null ? MergeWarGameMsg.PlayerInfo.getDefaultInstance() : this.playerInfo_;
      }

      public MergeWarGameMsg.PlayerInfoOrBuilder getPlayerInfoOrBuilder() {
         return this.playerInfo_ == null ? MergeWarGameMsg.PlayerInfo.getDefaultInstance() : this.playerInfo_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getPlayerInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getPlayerInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getPlayerInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_PlayerEnter_21114)) {
            return super.equals(obj);
         } else {
            CR2S_PlayerEnter_21114 other = (CR2S_PlayerEnter_21114)obj;
            if (this.hasPlayerInfo() != other.hasPlayerInfo()) {
               return false;
            } else if (this.hasPlayerInfo() && !this.getPlayerInfo().equals(other.getPlayerInfo())) {
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
            if (this.hasPlayerInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_PlayerEnter_21114 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_PlayerEnter_21114)PARSER.parseFrom(data);
      }

      public static CR2S_PlayerEnter_21114 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayerEnter_21114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayerEnter_21114 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_PlayerEnter_21114)PARSER.parseFrom(data);
      }

      public static CR2S_PlayerEnter_21114 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayerEnter_21114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayerEnter_21114 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_PlayerEnter_21114)PARSER.parseFrom(data);
      }

      public static CR2S_PlayerEnter_21114 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayerEnter_21114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayerEnter_21114 parseFrom(InputStream input) throws IOException {
         return (CR2S_PlayerEnter_21114)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_PlayerEnter_21114 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayerEnter_21114)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_PlayerEnter_21114 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_PlayerEnter_21114)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_PlayerEnter_21114 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayerEnter_21114)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_PlayerEnter_21114 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_PlayerEnter_21114)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_PlayerEnter_21114 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayerEnter_21114)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_PlayerEnter_21114 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_PlayerEnter_21114 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_PlayerEnter_21114> parser() {
         return PARSER;
      }

      public Parser<CR2S_PlayerEnter_21114> getParserForType() {
         return PARSER;
      }

      public CR2S_PlayerEnter_21114 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_PlayerEnter_21114OrBuilder {
         private int bitField0_;
         private MergeWarGameMsg.PlayerInfo playerInfo_;
         private SingleFieldBuilderV3<MergeWarGameMsg.PlayerInfo, MergeWarGameMsg.PlayerInfo.Builder, MergeWarGameMsg.PlayerInfoOrBuilder> playerInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PlayerEnter_21114_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PlayerEnter_21114_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_PlayerEnter_21114.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.CR2S_PlayerEnter_21114.alwaysUseFieldBuilders) {
               this.getPlayerInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.playerInfoBuilder_ == null) {
               this.playerInfo_ = null;
            } else {
               this.playerInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PlayerEnter_21114_descriptor;
         }

         public CR2S_PlayerEnter_21114 getDefaultInstanceForType() {
            return CrossCoreWarMsg.CR2S_PlayerEnter_21114.getDefaultInstance();
         }

         public CR2S_PlayerEnter_21114 build() {
            CR2S_PlayerEnter_21114 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_PlayerEnter_21114 buildPartial() {
            CR2S_PlayerEnter_21114 result = new CR2S_PlayerEnter_21114(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.playerInfoBuilder_ == null) {
                  result.playerInfo_ = this.playerInfo_;
               } else {
                  result.playerInfo_ = (MergeWarGameMsg.PlayerInfo)this.playerInfoBuilder_.build();
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
            if (other instanceof CR2S_PlayerEnter_21114) {
               return this.mergeFrom((CR2S_PlayerEnter_21114)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_PlayerEnter_21114 other) {
            if (other == CrossCoreWarMsg.CR2S_PlayerEnter_21114.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerInfo()) {
                  this.mergePlayerInfo(other.getPlayerInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerInfo()) {
               return false;
            } else {
               return this.getPlayerInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_PlayerEnter_21114 parsedMessage = null;

            try {
               parsedMessage = (CR2S_PlayerEnter_21114)CrossCoreWarMsg.CR2S_PlayerEnter_21114.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_PlayerEnter_21114)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public MergeWarGameMsg.PlayerInfo getPlayerInfo() {
            if (this.playerInfoBuilder_ == null) {
               return this.playerInfo_ == null ? MergeWarGameMsg.PlayerInfo.getDefaultInstance() : this.playerInfo_;
            } else {
               return (MergeWarGameMsg.PlayerInfo)this.playerInfoBuilder_.getMessage();
            }
         }

         public Builder setPlayerInfo(MergeWarGameMsg.PlayerInfo value) {
            if (this.playerInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.playerInfo_ = value;
               this.onChanged();
            } else {
               this.playerInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setPlayerInfo(MergeWarGameMsg.PlayerInfo.Builder builderForValue) {
            if (this.playerInfoBuilder_ == null) {
               this.playerInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.playerInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergePlayerInfo(MergeWarGameMsg.PlayerInfo value) {
            if (this.playerInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.playerInfo_ != null && this.playerInfo_ != MergeWarGameMsg.PlayerInfo.getDefaultInstance()) {
                  this.playerInfo_ = MergeWarGameMsg.PlayerInfo.newBuilder(this.playerInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.playerInfo_ = value;
               }

               this.onChanged();
            } else {
               this.playerInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearPlayerInfo() {
            if (this.playerInfoBuilder_ == null) {
               this.playerInfo_ = null;
               this.onChanged();
            } else {
               this.playerInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public MergeWarGameMsg.PlayerInfo.Builder getPlayerInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (MergeWarGameMsg.PlayerInfo.Builder)this.getPlayerInfoFieldBuilder().getBuilder();
         }

         public MergeWarGameMsg.PlayerInfoOrBuilder getPlayerInfoOrBuilder() {
            if (this.playerInfoBuilder_ != null) {
               return (MergeWarGameMsg.PlayerInfoOrBuilder)this.playerInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.playerInfo_ == null ? MergeWarGameMsg.PlayerInfo.getDefaultInstance() : this.playerInfo_;
            }
         }

         private SingleFieldBuilderV3<MergeWarGameMsg.PlayerInfo, MergeWarGameMsg.PlayerInfo.Builder, MergeWarGameMsg.PlayerInfoOrBuilder> getPlayerInfoFieldBuilder() {
            if (this.playerInfoBuilder_ == null) {
               this.playerInfoBuilder_ = new SingleFieldBuilderV3(this.getPlayerInfo(), this.getParentForChildren(), this.isClean());
               this.playerInfo_ = null;
            }

            return this.playerInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_UnionCoreHurt_21116 extends GeneratedMessageV3 implements CR2S_UnionCoreHurt_21116OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFO_FIELD_NUMBER = 1;
      private List<MergeWarGameMsg.UnionCoreDamageInfo> info_;
      private byte memoizedIsInitialized;
      private static final CR2S_UnionCoreHurt_21116 DEFAULT_INSTANCE = new CR2S_UnionCoreHurt_21116();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UnionCoreHurt_21116> PARSER = new AbstractParser<CR2S_UnionCoreHurt_21116>() {
         public CR2S_UnionCoreHurt_21116 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UnionCoreHurt_21116(input, extensionRegistry);
         }
      };

      private CR2S_UnionCoreHurt_21116(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UnionCoreHurt_21116() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UnionCoreHurt_21116();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UnionCoreHurt_21116(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.info_.add(input.readMessage(MergeWarGameMsg.UnionCoreDamageInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UnionCoreHurt_21116_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UnionCoreHurt_21116_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnionCoreHurt_21116.class, Builder.class);
      }

      public List<MergeWarGameMsg.UnionCoreDamageInfo> getInfoList() {
         return this.info_;
      }

      public List<? extends MergeWarGameMsg.UnionCoreDamageInfoOrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public MergeWarGameMsg.UnionCoreDamageInfo getInfo(int index) {
         return (MergeWarGameMsg.UnionCoreDamageInfo)this.info_.get(index);
      }

      public MergeWarGameMsg.UnionCoreDamageInfoOrBuilder getInfoOrBuilder(int index) {
         return (MergeWarGameMsg.UnionCoreDamageInfoOrBuilder)this.info_.get(index);
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
         } else if (!(obj instanceof CR2S_UnionCoreHurt_21116)) {
            return super.equals(obj);
         } else {
            CR2S_UnionCoreHurt_21116 other = (CR2S_UnionCoreHurt_21116)obj;
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

      public static CR2S_UnionCoreHurt_21116 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UnionCoreHurt_21116)PARSER.parseFrom(data);
      }

      public static CR2S_UnionCoreHurt_21116 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionCoreHurt_21116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionCoreHurt_21116 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UnionCoreHurt_21116)PARSER.parseFrom(data);
      }

      public static CR2S_UnionCoreHurt_21116 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionCoreHurt_21116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionCoreHurt_21116 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UnionCoreHurt_21116)PARSER.parseFrom(data);
      }

      public static CR2S_UnionCoreHurt_21116 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionCoreHurt_21116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionCoreHurt_21116 parseFrom(InputStream input) throws IOException {
         return (CR2S_UnionCoreHurt_21116)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnionCoreHurt_21116 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionCoreHurt_21116)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnionCoreHurt_21116 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UnionCoreHurt_21116)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UnionCoreHurt_21116 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionCoreHurt_21116)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnionCoreHurt_21116 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UnionCoreHurt_21116)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnionCoreHurt_21116 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionCoreHurt_21116)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UnionCoreHurt_21116 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UnionCoreHurt_21116 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UnionCoreHurt_21116> parser() {
         return PARSER;
      }

      public Parser<CR2S_UnionCoreHurt_21116> getParserForType() {
         return PARSER;
      }

      public CR2S_UnionCoreHurt_21116 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UnionCoreHurt_21116OrBuilder {
         private int bitField0_;
         private List<MergeWarGameMsg.UnionCoreDamageInfo> info_;
         private RepeatedFieldBuilderV3<MergeWarGameMsg.UnionCoreDamageInfo, MergeWarGameMsg.UnionCoreDamageInfo.Builder, MergeWarGameMsg.UnionCoreDamageInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UnionCoreHurt_21116_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UnionCoreHurt_21116_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnionCoreHurt_21116.class, Builder.class);
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
            if (CrossCoreWarMsg.CR2S_UnionCoreHurt_21116.alwaysUseFieldBuilders) {
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
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UnionCoreHurt_21116_descriptor;
         }

         public CR2S_UnionCoreHurt_21116 getDefaultInstanceForType() {
            return CrossCoreWarMsg.CR2S_UnionCoreHurt_21116.getDefaultInstance();
         }

         public CR2S_UnionCoreHurt_21116 build() {
            CR2S_UnionCoreHurt_21116 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UnionCoreHurt_21116 buildPartial() {
            CR2S_UnionCoreHurt_21116 result = new CR2S_UnionCoreHurt_21116(this);
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
            if (other instanceof CR2S_UnionCoreHurt_21116) {
               return this.mergeFrom((CR2S_UnionCoreHurt_21116)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UnionCoreHurt_21116 other) {
            if (other == CrossCoreWarMsg.CR2S_UnionCoreHurt_21116.getDefaultInstance()) {
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
                     this.infoBuilder_ = CrossCoreWarMsg.CR2S_UnionCoreHurt_21116.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
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
            CR2S_UnionCoreHurt_21116 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UnionCoreHurt_21116)CrossCoreWarMsg.CR2S_UnionCoreHurt_21116.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UnionCoreHurt_21116)e.getUnfinishedMessage();
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

         public List<MergeWarGameMsg.UnionCoreDamageInfo> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public MergeWarGameMsg.UnionCoreDamageInfo getInfo(int index) {
            return this.infoBuilder_ == null ? (MergeWarGameMsg.UnionCoreDamageInfo)this.info_.get(index) : (MergeWarGameMsg.UnionCoreDamageInfo)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, MergeWarGameMsg.UnionCoreDamageInfo value) {
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

         public Builder setInfo(int index, MergeWarGameMsg.UnionCoreDamageInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(MergeWarGameMsg.UnionCoreDamageInfo value) {
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

         public Builder addInfo(int index, MergeWarGameMsg.UnionCoreDamageInfo value) {
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

         public Builder addInfo(MergeWarGameMsg.UnionCoreDamageInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, MergeWarGameMsg.UnionCoreDamageInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends MergeWarGameMsg.UnionCoreDamageInfo> values) {
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

         public MergeWarGameMsg.UnionCoreDamageInfo.Builder getInfoBuilder(int index) {
            return (MergeWarGameMsg.UnionCoreDamageInfo.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public MergeWarGameMsg.UnionCoreDamageInfoOrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (MergeWarGameMsg.UnionCoreDamageInfoOrBuilder)this.info_.get(index) : (MergeWarGameMsg.UnionCoreDamageInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MergeWarGameMsg.UnionCoreDamageInfoOrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public MergeWarGameMsg.UnionCoreDamageInfo.Builder addInfoBuilder() {
            return (MergeWarGameMsg.UnionCoreDamageInfo.Builder)this.getInfoFieldBuilder().addBuilder(MergeWarGameMsg.UnionCoreDamageInfo.getDefaultInstance());
         }

         public MergeWarGameMsg.UnionCoreDamageInfo.Builder addInfoBuilder(int index) {
            return (MergeWarGameMsg.UnionCoreDamageInfo.Builder)this.getInfoFieldBuilder().addBuilder(index, MergeWarGameMsg.UnionCoreDamageInfo.getDefaultInstance());
         }

         public List<MergeWarGameMsg.UnionCoreDamageInfo.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MergeWarGameMsg.UnionCoreDamageInfo, MergeWarGameMsg.UnionCoreDamageInfo.Builder, MergeWarGameMsg.UnionCoreDamageInfoOrBuilder> getInfoFieldBuilder() {
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

   public static final class CR2S_Log_21118 extends GeneratedMessageV3 implements CR2S_Log_21118OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MSG_FIELD_NUMBER = 1;
      private MergeWarGameMsg.S2C_Log_19532 msg_;
      private byte memoizedIsInitialized;
      private static final CR2S_Log_21118 DEFAULT_INSTANCE = new CR2S_Log_21118();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_Log_21118> PARSER = new AbstractParser<CR2S_Log_21118>() {
         public CR2S_Log_21118 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_Log_21118(input, extensionRegistry);
         }
      };

      private CR2S_Log_21118(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_Log_21118() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_Log_21118();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_Log_21118(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        MergeWarGameMsg.S2C_Log_19532.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.msg_.toBuilder();
                        }

                        this.msg_ = (MergeWarGameMsg.S2C_Log_19532)input.readMessage(MergeWarGameMsg.S2C_Log_19532.PARSER, extensionRegistry);
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Log_21118_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Log_21118_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Log_21118.class, Builder.class);
      }

      public boolean hasMsg() {
         return (this.bitField0_ & 1) != 0;
      }

      public MergeWarGameMsg.S2C_Log_19532 getMsg() {
         return this.msg_ == null ? MergeWarGameMsg.S2C_Log_19532.getDefaultInstance() : this.msg_;
      }

      public MergeWarGameMsg.S2C_Log_19532OrBuilder getMsgOrBuilder() {
         return this.msg_ == null ? MergeWarGameMsg.S2C_Log_19532.getDefaultInstance() : this.msg_;
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
         } else if (!(obj instanceof CR2S_Log_21118)) {
            return super.equals(obj);
         } else {
            CR2S_Log_21118 other = (CR2S_Log_21118)obj;
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

      public static CR2S_Log_21118 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_Log_21118)PARSER.parseFrom(data);
      }

      public static CR2S_Log_21118 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Log_21118)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Log_21118 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_Log_21118)PARSER.parseFrom(data);
      }

      public static CR2S_Log_21118 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Log_21118)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Log_21118 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_Log_21118)PARSER.parseFrom(data);
      }

      public static CR2S_Log_21118 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Log_21118)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Log_21118 parseFrom(InputStream input) throws IOException {
         return (CR2S_Log_21118)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Log_21118 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Log_21118)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Log_21118 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_Log_21118)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_Log_21118 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Log_21118)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Log_21118 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_Log_21118)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Log_21118 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Log_21118)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_Log_21118 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_Log_21118 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_Log_21118> parser() {
         return PARSER;
      }

      public Parser<CR2S_Log_21118> getParserForType() {
         return PARSER;
      }

      public CR2S_Log_21118 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_Log_21118OrBuilder {
         private int bitField0_;
         private MergeWarGameMsg.S2C_Log_19532 msg_;
         private SingleFieldBuilderV3<MergeWarGameMsg.S2C_Log_19532, MergeWarGameMsg.S2C_Log_19532.Builder, MergeWarGameMsg.S2C_Log_19532OrBuilder> msgBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Log_21118_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Log_21118_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Log_21118.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.CR2S_Log_21118.alwaysUseFieldBuilders) {
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
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Log_21118_descriptor;
         }

         public CR2S_Log_21118 getDefaultInstanceForType() {
            return CrossCoreWarMsg.CR2S_Log_21118.getDefaultInstance();
         }

         public CR2S_Log_21118 build() {
            CR2S_Log_21118 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_Log_21118 buildPartial() {
            CR2S_Log_21118 result = new CR2S_Log_21118(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.msgBuilder_ == null) {
                  result.msg_ = this.msg_;
               } else {
                  result.msg_ = (MergeWarGameMsg.S2C_Log_19532)this.msgBuilder_.build();
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
            if (other instanceof CR2S_Log_21118) {
               return this.mergeFrom((CR2S_Log_21118)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_Log_21118 other) {
            if (other == CrossCoreWarMsg.CR2S_Log_21118.getDefaultInstance()) {
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
            CR2S_Log_21118 parsedMessage = null;

            try {
               parsedMessage = (CR2S_Log_21118)CrossCoreWarMsg.CR2S_Log_21118.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_Log_21118)e.getUnfinishedMessage();
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

         public MergeWarGameMsg.S2C_Log_19532 getMsg() {
            if (this.msgBuilder_ == null) {
               return this.msg_ == null ? MergeWarGameMsg.S2C_Log_19532.getDefaultInstance() : this.msg_;
            } else {
               return (MergeWarGameMsg.S2C_Log_19532)this.msgBuilder_.getMessage();
            }
         }

         public Builder setMsg(MergeWarGameMsg.S2C_Log_19532 value) {
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

         public Builder setMsg(MergeWarGameMsg.S2C_Log_19532.Builder builderForValue) {
            if (this.msgBuilder_ == null) {
               this.msg_ = builderForValue.build();
               this.onChanged();
            } else {
               this.msgBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeMsg(MergeWarGameMsg.S2C_Log_19532 value) {
            if (this.msgBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.msg_ != null && this.msg_ != MergeWarGameMsg.S2C_Log_19532.getDefaultInstance()) {
                  this.msg_ = MergeWarGameMsg.S2C_Log_19532.newBuilder(this.msg_).mergeFrom(value).buildPartial();
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

         public MergeWarGameMsg.S2C_Log_19532.Builder getMsgBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (MergeWarGameMsg.S2C_Log_19532.Builder)this.getMsgFieldBuilder().getBuilder();
         }

         public MergeWarGameMsg.S2C_Log_19532OrBuilder getMsgOrBuilder() {
            if (this.msgBuilder_ != null) {
               return (MergeWarGameMsg.S2C_Log_19532OrBuilder)this.msgBuilder_.getMessageOrBuilder();
            } else {
               return this.msg_ == null ? MergeWarGameMsg.S2C_Log_19532.getDefaultInstance() : this.msg_;
            }
         }

         private SingleFieldBuilderV3<MergeWarGameMsg.S2C_Log_19532, MergeWarGameMsg.S2C_Log_19532.Builder, MergeWarGameMsg.S2C_Log_19532OrBuilder> getMsgFieldBuilder() {
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

   public static final class CR2S_LogLamp_21120 extends GeneratedMessageV3 implements CR2S_LogLamp_21120OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MSG_FIELD_NUMBER = 1;
      private MergeWarGameMsg.S2C_LogLamp_19534 msg_;
      private byte memoizedIsInitialized;
      private static final CR2S_LogLamp_21120 DEFAULT_INSTANCE = new CR2S_LogLamp_21120();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_LogLamp_21120> PARSER = new AbstractParser<CR2S_LogLamp_21120>() {
         public CR2S_LogLamp_21120 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_LogLamp_21120(input, extensionRegistry);
         }
      };

      private CR2S_LogLamp_21120(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_LogLamp_21120() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_LogLamp_21120();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_LogLamp_21120(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        MergeWarGameMsg.S2C_LogLamp_19534.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.msg_.toBuilder();
                        }

                        this.msg_ = (MergeWarGameMsg.S2C_LogLamp_19534)input.readMessage(MergeWarGameMsg.S2C_LogLamp_19534.PARSER, extensionRegistry);
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_LogLamp_21120_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_LogLamp_21120_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_LogLamp_21120.class, Builder.class);
      }

      public boolean hasMsg() {
         return (this.bitField0_ & 1) != 0;
      }

      public MergeWarGameMsg.S2C_LogLamp_19534 getMsg() {
         return this.msg_ == null ? MergeWarGameMsg.S2C_LogLamp_19534.getDefaultInstance() : this.msg_;
      }

      public MergeWarGameMsg.S2C_LogLamp_19534OrBuilder getMsgOrBuilder() {
         return this.msg_ == null ? MergeWarGameMsg.S2C_LogLamp_19534.getDefaultInstance() : this.msg_;
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
         } else if (!(obj instanceof CR2S_LogLamp_21120)) {
            return super.equals(obj);
         } else {
            CR2S_LogLamp_21120 other = (CR2S_LogLamp_21120)obj;
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

      public static CR2S_LogLamp_21120 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_LogLamp_21120)PARSER.parseFrom(data);
      }

      public static CR2S_LogLamp_21120 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_LogLamp_21120)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_LogLamp_21120 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_LogLamp_21120)PARSER.parseFrom(data);
      }

      public static CR2S_LogLamp_21120 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_LogLamp_21120)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_LogLamp_21120 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_LogLamp_21120)PARSER.parseFrom(data);
      }

      public static CR2S_LogLamp_21120 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_LogLamp_21120)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_LogLamp_21120 parseFrom(InputStream input) throws IOException {
         return (CR2S_LogLamp_21120)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_LogLamp_21120 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_LogLamp_21120)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_LogLamp_21120 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_LogLamp_21120)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_LogLamp_21120 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_LogLamp_21120)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_LogLamp_21120 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_LogLamp_21120)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_LogLamp_21120 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_LogLamp_21120)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_LogLamp_21120 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_LogLamp_21120 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_LogLamp_21120> parser() {
         return PARSER;
      }

      public Parser<CR2S_LogLamp_21120> getParserForType() {
         return PARSER;
      }

      public CR2S_LogLamp_21120 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_LogLamp_21120OrBuilder {
         private int bitField0_;
         private MergeWarGameMsg.S2C_LogLamp_19534 msg_;
         private SingleFieldBuilderV3<MergeWarGameMsg.S2C_LogLamp_19534, MergeWarGameMsg.S2C_LogLamp_19534.Builder, MergeWarGameMsg.S2C_LogLamp_19534OrBuilder> msgBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_LogLamp_21120_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_LogLamp_21120_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_LogLamp_21120.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.CR2S_LogLamp_21120.alwaysUseFieldBuilders) {
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
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_LogLamp_21120_descriptor;
         }

         public CR2S_LogLamp_21120 getDefaultInstanceForType() {
            return CrossCoreWarMsg.CR2S_LogLamp_21120.getDefaultInstance();
         }

         public CR2S_LogLamp_21120 build() {
            CR2S_LogLamp_21120 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_LogLamp_21120 buildPartial() {
            CR2S_LogLamp_21120 result = new CR2S_LogLamp_21120(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.msgBuilder_ == null) {
                  result.msg_ = this.msg_;
               } else {
                  result.msg_ = (MergeWarGameMsg.S2C_LogLamp_19534)this.msgBuilder_.build();
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
            if (other instanceof CR2S_LogLamp_21120) {
               return this.mergeFrom((CR2S_LogLamp_21120)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_LogLamp_21120 other) {
            if (other == CrossCoreWarMsg.CR2S_LogLamp_21120.getDefaultInstance()) {
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
            CR2S_LogLamp_21120 parsedMessage = null;

            try {
               parsedMessage = (CR2S_LogLamp_21120)CrossCoreWarMsg.CR2S_LogLamp_21120.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_LogLamp_21120)e.getUnfinishedMessage();
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

         public MergeWarGameMsg.S2C_LogLamp_19534 getMsg() {
            if (this.msgBuilder_ == null) {
               return this.msg_ == null ? MergeWarGameMsg.S2C_LogLamp_19534.getDefaultInstance() : this.msg_;
            } else {
               return (MergeWarGameMsg.S2C_LogLamp_19534)this.msgBuilder_.getMessage();
            }
         }

         public Builder setMsg(MergeWarGameMsg.S2C_LogLamp_19534 value) {
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

         public Builder setMsg(MergeWarGameMsg.S2C_LogLamp_19534.Builder builderForValue) {
            if (this.msgBuilder_ == null) {
               this.msg_ = builderForValue.build();
               this.onChanged();
            } else {
               this.msgBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeMsg(MergeWarGameMsg.S2C_LogLamp_19534 value) {
            if (this.msgBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.msg_ != null && this.msg_ != MergeWarGameMsg.S2C_LogLamp_19534.getDefaultInstance()) {
                  this.msg_ = MergeWarGameMsg.S2C_LogLamp_19534.newBuilder(this.msg_).mergeFrom(value).buildPartial();
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

         public MergeWarGameMsg.S2C_LogLamp_19534.Builder getMsgBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (MergeWarGameMsg.S2C_LogLamp_19534.Builder)this.getMsgFieldBuilder().getBuilder();
         }

         public MergeWarGameMsg.S2C_LogLamp_19534OrBuilder getMsgOrBuilder() {
            if (this.msgBuilder_ != null) {
               return (MergeWarGameMsg.S2C_LogLamp_19534OrBuilder)this.msgBuilder_.getMessageOrBuilder();
            } else {
               return this.msg_ == null ? MergeWarGameMsg.S2C_LogLamp_19534.getDefaultInstance() : this.msg_;
            }
         }

         private SingleFieldBuilderV3<MergeWarGameMsg.S2C_LogLamp_19534, MergeWarGameMsg.S2C_LogLamp_19534.Builder, MergeWarGameMsg.S2C_LogLamp_19534OrBuilder> getMsgFieldBuilder() {
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

   public static final class S2CR_SetDestGrid_21121 extends GeneratedMessageV3 implements S2CR_SetDestGrid_21121OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int GRIDID_FIELD_NUMBER = 2;
      private int gridId_;
      private byte memoizedIsInitialized;
      private static final S2CR_SetDestGrid_21121 DEFAULT_INSTANCE = new S2CR_SetDestGrid_21121();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_SetDestGrid_21121> PARSER = new AbstractParser<S2CR_SetDestGrid_21121>() {
         public S2CR_SetDestGrid_21121 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_SetDestGrid_21121(input, extensionRegistry);
         }
      };

      private S2CR_SetDestGrid_21121(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_SetDestGrid_21121() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_SetDestGrid_21121();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_SetDestGrid_21121(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bitField0_ |= 2;
                        this.gridId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_SetDestGrid_21121_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_SetDestGrid_21121_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_SetDestGrid_21121.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasGridId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getGridId() {
         return this.gridId_;
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.gridId_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.gridId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_SetDestGrid_21121)) {
            return super.equals(obj);
         } else {
            S2CR_SetDestGrid_21121 other = (S2CR_SetDestGrid_21121)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasGridId() != other.hasGridId()) {
               return false;
            } else if (this.hasGridId() && this.getGridId() != other.getGridId()) {
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

            if (this.hasGridId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGridId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_SetDestGrid_21121 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_SetDestGrid_21121)PARSER.parseFrom(data);
      }

      public static S2CR_SetDestGrid_21121 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SetDestGrid_21121)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SetDestGrid_21121 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_SetDestGrid_21121)PARSER.parseFrom(data);
      }

      public static S2CR_SetDestGrid_21121 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SetDestGrid_21121)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SetDestGrid_21121 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_SetDestGrid_21121)PARSER.parseFrom(data);
      }

      public static S2CR_SetDestGrid_21121 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SetDestGrid_21121)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SetDestGrid_21121 parseFrom(InputStream input) throws IOException {
         return (S2CR_SetDestGrid_21121)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_SetDestGrid_21121 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SetDestGrid_21121)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_SetDestGrid_21121 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_SetDestGrid_21121)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_SetDestGrid_21121 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SetDestGrid_21121)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_SetDestGrid_21121 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_SetDestGrid_21121)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_SetDestGrid_21121 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SetDestGrid_21121)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_SetDestGrid_21121 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_SetDestGrid_21121 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_SetDestGrid_21121> parser() {
         return PARSER;
      }

      public Parser<S2CR_SetDestGrid_21121> getParserForType() {
         return PARSER;
      }

      public S2CR_SetDestGrid_21121 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_SetDestGrid_21121OrBuilder {
         private int bitField0_;
         private int type_;
         private int gridId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_SetDestGrid_21121_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_SetDestGrid_21121_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_SetDestGrid_21121.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.S2CR_SetDestGrid_21121.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.gridId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_SetDestGrid_21121_descriptor;
         }

         public S2CR_SetDestGrid_21121 getDefaultInstanceForType() {
            return CrossCoreWarMsg.S2CR_SetDestGrid_21121.getDefaultInstance();
         }

         public S2CR_SetDestGrid_21121 build() {
            S2CR_SetDestGrid_21121 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_SetDestGrid_21121 buildPartial() {
            S2CR_SetDestGrid_21121 result = new S2CR_SetDestGrid_21121(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.gridId_ = this.gridId_;
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
            if (other instanceof S2CR_SetDestGrid_21121) {
               return this.mergeFrom((S2CR_SetDestGrid_21121)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_SetDestGrid_21121 other) {
            if (other == CrossCoreWarMsg.S2CR_SetDestGrid_21121.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasGridId()) {
                  this.setGridId(other.getGridId());
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
            S2CR_SetDestGrid_21121 parsedMessage = null;

            try {
               parsedMessage = (S2CR_SetDestGrid_21121)CrossCoreWarMsg.S2CR_SetDestGrid_21121.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_SetDestGrid_21121)e.getUnfinishedMessage();
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

         public boolean hasGridId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getGridId() {
            return this.gridId_;
         }

         public Builder setGridId(int value) {
            this.bitField0_ |= 2;
            this.gridId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGridId() {
            this.bitField0_ &= -3;
            this.gridId_ = 0;
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

   public static final class CR2S_SetDestGrid_21122 extends GeneratedMessageV3 implements CR2S_SetDestGrid_21122OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int GRIDID_FIELD_NUMBER = 2;
      private Internal.IntList gridId_;
      public static final int PLAYERID_FIELD_NUMBER = 3;
      private int playerId_;
      private byte memoizedIsInitialized;
      private static final CR2S_SetDestGrid_21122 DEFAULT_INSTANCE = new CR2S_SetDestGrid_21122();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_SetDestGrid_21122> PARSER = new AbstractParser<CR2S_SetDestGrid_21122>() {
         public CR2S_SetDestGrid_21122 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_SetDestGrid_21122(input, extensionRegistry);
         }
      };

      private CR2S_SetDestGrid_21122(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_SetDestGrid_21122() {
         this.memoizedIsInitialized = -1;
         this.gridId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_SetDestGrid_21122();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_SetDestGrid_21122(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.type_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.gridId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.gridId_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gridId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.playerId_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.gridId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.gridId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SetDestGrid_21122_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SetDestGrid_21122_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_SetDestGrid_21122.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public List<Integer> getGridIdList() {
         return this.gridId_;
      }

      public int getGridIdCount() {
         return this.gridId_.size();
      }

      public int getGridId(int index) {
         return this.gridId_.getInt(index);
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
         } else if (!this.hasType()) {
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
            output.writeInt32(1, this.type_);
         }

         for(int i = 0; i < this.gridId_.size(); ++i) {
            output.writeInt32(2, this.gridId_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.playerId_);
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

            for(int i = 0; i < this.gridId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gridId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGridIdList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.playerId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_SetDestGrid_21122)) {
            return super.equals(obj);
         } else {
            CR2S_SetDestGrid_21122 other = (CR2S_SetDestGrid_21122)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (!this.getGridIdList().equals(other.getGridIdList())) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            if (this.getGridIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGridIdList().hashCode();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_SetDestGrid_21122 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_SetDestGrid_21122)PARSER.parseFrom(data);
      }

      public static CR2S_SetDestGrid_21122 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_SetDestGrid_21122)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_SetDestGrid_21122 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_SetDestGrid_21122)PARSER.parseFrom(data);
      }

      public static CR2S_SetDestGrid_21122 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_SetDestGrid_21122)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_SetDestGrid_21122 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_SetDestGrid_21122)PARSER.parseFrom(data);
      }

      public static CR2S_SetDestGrid_21122 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_SetDestGrid_21122)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_SetDestGrid_21122 parseFrom(InputStream input) throws IOException {
         return (CR2S_SetDestGrid_21122)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_SetDestGrid_21122 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_SetDestGrid_21122)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_SetDestGrid_21122 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_SetDestGrid_21122)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_SetDestGrid_21122 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_SetDestGrid_21122)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_SetDestGrid_21122 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_SetDestGrid_21122)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_SetDestGrid_21122 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_SetDestGrid_21122)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_SetDestGrid_21122 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_SetDestGrid_21122 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_SetDestGrid_21122> parser() {
         return PARSER;
      }

      public Parser<CR2S_SetDestGrid_21122> getParserForType() {
         return PARSER;
      }

      public CR2S_SetDestGrid_21122 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_SetDestGrid_21122OrBuilder {
         private int bitField0_;
         private int type_;
         private Internal.IntList gridId_;
         private int playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SetDestGrid_21122_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SetDestGrid_21122_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_SetDestGrid_21122.class, Builder.class);
         }

         private Builder() {
            this.gridId_ = CrossCoreWarMsg.CR2S_SetDestGrid_21122.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gridId_ = CrossCoreWarMsg.CR2S_SetDestGrid_21122.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.CR2S_SetDestGrid_21122.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.gridId_ = CrossCoreWarMsg.CR2S_SetDestGrid_21122.emptyIntList();
            this.bitField0_ &= -3;
            this.playerId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SetDestGrid_21122_descriptor;
         }

         public CR2S_SetDestGrid_21122 getDefaultInstanceForType() {
            return CrossCoreWarMsg.CR2S_SetDestGrid_21122.getDefaultInstance();
         }

         public CR2S_SetDestGrid_21122 build() {
            CR2S_SetDestGrid_21122 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_SetDestGrid_21122 buildPartial() {
            CR2S_SetDestGrid_21122 result = new CR2S_SetDestGrid_21122(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.gridId_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.gridId_ = this.gridId_;
            if ((from_bitField0_ & 4) != 0) {
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
            if (other instanceof CR2S_SetDestGrid_21122) {
               return this.mergeFrom((CR2S_SetDestGrid_21122)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_SetDestGrid_21122 other) {
            if (other == CrossCoreWarMsg.CR2S_SetDestGrid_21122.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (!other.gridId_.isEmpty()) {
                  if (this.gridId_.isEmpty()) {
                     this.gridId_ = other.gridId_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureGridIdIsMutable();
                     this.gridId_.addAll(other.gridId_);
                  }

                  this.onChanged();
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
            if (!this.hasType()) {
               return false;
            } else {
               return this.hasPlayerId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_SetDestGrid_21122 parsedMessage = null;

            try {
               parsedMessage = (CR2S_SetDestGrid_21122)CrossCoreWarMsg.CR2S_SetDestGrid_21122.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_SetDestGrid_21122)e.getUnfinishedMessage();
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

         private void ensureGridIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.gridId_ = CrossCoreWarMsg.CR2S_SetDestGrid_21122.mutableCopy(this.gridId_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getGridIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.gridId_) : this.gridId_);
         }

         public int getGridIdCount() {
            return this.gridId_.size();
         }

         public int getGridId(int index) {
            return this.gridId_.getInt(index);
         }

         public Builder setGridId(int index, int value) {
            this.ensureGridIdIsMutable();
            this.gridId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGridId(int value) {
            this.ensureGridIdIsMutable();
            this.gridId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGridId(Iterable<? extends Integer> values) {
            this.ensureGridIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gridId_);
            this.onChanged();
            return this;
         }

         public Builder clearGridId() {
            this.gridId_ = CrossCoreWarMsg.CR2S_SetDestGrid_21122.emptyIntList();
            this.bitField0_ &= -3;
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_UnionWarEnd_21126 extends GeneratedMessageV3 implements CR2S_UnionWarEnd_21126OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int UNIONID_FIELD_NUMBER = 1;
      private Internal.IntList unionId_;
      private byte memoizedIsInitialized;
      private static final CR2S_UnionWarEnd_21126 DEFAULT_INSTANCE = new CR2S_UnionWarEnd_21126();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UnionWarEnd_21126> PARSER = new AbstractParser<CR2S_UnionWarEnd_21126>() {
         public CR2S_UnionWarEnd_21126 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UnionWarEnd_21126(input, extensionRegistry);
         }
      };

      private CR2S_UnionWarEnd_21126(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UnionWarEnd_21126() {
         this.memoizedIsInitialized = -1;
         this.unionId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UnionWarEnd_21126();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UnionWarEnd_21126(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.unionId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.unionId_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.unionId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.unionId_.addInt(input.readInt32());
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
                  this.unionId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UnionWarEnd_21126_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UnionWarEnd_21126_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnionWarEnd_21126.class, Builder.class);
      }

      public List<Integer> getUnionIdList() {
         return this.unionId_;
      }

      public int getUnionIdCount() {
         return this.unionId_.size();
      }

      public int getUnionId(int index) {
         return this.unionId_.getInt(index);
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
         for(int i = 0; i < this.unionId_.size(); ++i) {
            output.writeInt32(1, this.unionId_.getInt(i));
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

            for(int i = 0; i < this.unionId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.unionId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getUnionIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_UnionWarEnd_21126)) {
            return super.equals(obj);
         } else {
            CR2S_UnionWarEnd_21126 other = (CR2S_UnionWarEnd_21126)obj;
            if (!this.getUnionIdList().equals(other.getUnionIdList())) {
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
            if (this.getUnionIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUnionIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_UnionWarEnd_21126 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarEnd_21126)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarEnd_21126 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarEnd_21126)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarEnd_21126 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarEnd_21126)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarEnd_21126 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarEnd_21126)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarEnd_21126 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarEnd_21126)PARSER.parseFrom(data);
      }

      public static CR2S_UnionWarEnd_21126 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionWarEnd_21126)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionWarEnd_21126 parseFrom(InputStream input) throws IOException {
         return (CR2S_UnionWarEnd_21126)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarEnd_21126 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarEnd_21126)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnionWarEnd_21126 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UnionWarEnd_21126)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarEnd_21126 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarEnd_21126)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnionWarEnd_21126 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UnionWarEnd_21126)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnionWarEnd_21126 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionWarEnd_21126)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UnionWarEnd_21126 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UnionWarEnd_21126 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UnionWarEnd_21126> parser() {
         return PARSER;
      }

      public Parser<CR2S_UnionWarEnd_21126> getParserForType() {
         return PARSER;
      }

      public CR2S_UnionWarEnd_21126 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UnionWarEnd_21126OrBuilder {
         private int bitField0_;
         private Internal.IntList unionId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UnionWarEnd_21126_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UnionWarEnd_21126_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnionWarEnd_21126.class, Builder.class);
         }

         private Builder() {
            this.unionId_ = CrossCoreWarMsg.CR2S_UnionWarEnd_21126.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.unionId_ = CrossCoreWarMsg.CR2S_UnionWarEnd_21126.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.CR2S_UnionWarEnd_21126.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.unionId_ = CrossCoreWarMsg.CR2S_UnionWarEnd_21126.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UnionWarEnd_21126_descriptor;
         }

         public CR2S_UnionWarEnd_21126 getDefaultInstanceForType() {
            return CrossCoreWarMsg.CR2S_UnionWarEnd_21126.getDefaultInstance();
         }

         public CR2S_UnionWarEnd_21126 build() {
            CR2S_UnionWarEnd_21126 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UnionWarEnd_21126 buildPartial() {
            CR2S_UnionWarEnd_21126 result = new CR2S_UnionWarEnd_21126(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.unionId_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.unionId_ = this.unionId_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_UnionWarEnd_21126) {
               return this.mergeFrom((CR2S_UnionWarEnd_21126)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UnionWarEnd_21126 other) {
            if (other == CrossCoreWarMsg.CR2S_UnionWarEnd_21126.getDefaultInstance()) {
               return this;
            } else {
               if (!other.unionId_.isEmpty()) {
                  if (this.unionId_.isEmpty()) {
                     this.unionId_ = other.unionId_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureUnionIdIsMutable();
                     this.unionId_.addAll(other.unionId_);
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
            CR2S_UnionWarEnd_21126 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UnionWarEnd_21126)CrossCoreWarMsg.CR2S_UnionWarEnd_21126.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UnionWarEnd_21126)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureUnionIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.unionId_ = CrossCoreWarMsg.CR2S_UnionWarEnd_21126.mutableCopy(this.unionId_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getUnionIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.unionId_) : this.unionId_);
         }

         public int getUnionIdCount() {
            return this.unionId_.size();
         }

         public int getUnionId(int index) {
            return this.unionId_.getInt(index);
         }

         public Builder setUnionId(int index, int value) {
            this.ensureUnionIdIsMutable();
            this.unionId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addUnionId(int value) {
            this.ensureUnionIdIsMutable();
            this.unionId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllUnionId(Iterable<? extends Integer> values) {
            this.ensureUnionIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.unionId_);
            this.onChanged();
            return this;
         }

         public Builder clearUnionId() {
            this.unionId_ = CrossCoreWarMsg.CR2S_UnionWarEnd_21126.emptyIntList();
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

   public static final class S2CR_ActRank_21127 extends GeneratedMessageV3 implements S2CR_ActRank_21127OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_ActRank_21127 DEFAULT_INSTANCE = new S2CR_ActRank_21127();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_ActRank_21127> PARSER = new AbstractParser<S2CR_ActRank_21127>() {
         public S2CR_ActRank_21127 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_ActRank_21127(input, extensionRegistry);
         }
      };

      private S2CR_ActRank_21127(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_ActRank_21127() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_ActRank_21127();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_ActRank_21127(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ActRank_21127_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ActRank_21127_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ActRank_21127.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_ActRank_21127)) {
            return super.equals(obj);
         } else {
            S2CR_ActRank_21127 other = (S2CR_ActRank_21127)obj;
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

      public static S2CR_ActRank_21127 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_ActRank_21127)PARSER.parseFrom(data);
      }

      public static S2CR_ActRank_21127 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ActRank_21127)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ActRank_21127 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_ActRank_21127)PARSER.parseFrom(data);
      }

      public static S2CR_ActRank_21127 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ActRank_21127)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ActRank_21127 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_ActRank_21127)PARSER.parseFrom(data);
      }

      public static S2CR_ActRank_21127 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ActRank_21127)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ActRank_21127 parseFrom(InputStream input) throws IOException {
         return (S2CR_ActRank_21127)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ActRank_21127 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ActRank_21127)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ActRank_21127 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_ActRank_21127)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_ActRank_21127 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ActRank_21127)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ActRank_21127 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_ActRank_21127)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ActRank_21127 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ActRank_21127)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_ActRank_21127 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_ActRank_21127 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_ActRank_21127> parser() {
         return PARSER;
      }

      public Parser<S2CR_ActRank_21127> getParserForType() {
         return PARSER;
      }

      public S2CR_ActRank_21127 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_ActRank_21127OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ActRank_21127_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ActRank_21127_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ActRank_21127.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.S2CR_ActRank_21127.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ActRank_21127_descriptor;
         }

         public S2CR_ActRank_21127 getDefaultInstanceForType() {
            return CrossCoreWarMsg.S2CR_ActRank_21127.getDefaultInstance();
         }

         public S2CR_ActRank_21127 build() {
            S2CR_ActRank_21127 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_ActRank_21127 buildPartial() {
            S2CR_ActRank_21127 result = new S2CR_ActRank_21127(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_ActRank_21127) {
               return this.mergeFrom((S2CR_ActRank_21127)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_ActRank_21127 other) {
            if (other == CrossCoreWarMsg.S2CR_ActRank_21127.getDefaultInstance()) {
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
            S2CR_ActRank_21127 parsedMessage = null;

            try {
               parsedMessage = (S2CR_ActRank_21127)CrossCoreWarMsg.S2CR_ActRank_21127.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_ActRank_21127)e.getUnfinishedMessage();
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

   public static final class CR2S_UpdateState_21130 extends GeneratedMessageV3 implements CR2S_UpdateState_21130OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGE_FIELD_NUMBER = 1;
      private int stage_;
      public static final int SUBSTATE_FIELD_NUMBER = 2;
      private int subState_;
      private byte memoizedIsInitialized;
      private static final CR2S_UpdateState_21130 DEFAULT_INSTANCE = new CR2S_UpdateState_21130();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UpdateState_21130> PARSER = new AbstractParser<CR2S_UpdateState_21130>() {
         public CR2S_UpdateState_21130 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UpdateState_21130(input, extensionRegistry);
         }
      };

      private CR2S_UpdateState_21130(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UpdateState_21130() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UpdateState_21130();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UpdateState_21130(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.stage_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.subState_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateState_21130_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateState_21130_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpdateState_21130.class, Builder.class);
      }

      public boolean hasStage() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public boolean hasSubState() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSubState() {
         return this.subState_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSubState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.stage_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.subState_);
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
               size += CodedOutputStream.computeInt32Size(1, this.stage_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.subState_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_UpdateState_21130)) {
            return super.equals(obj);
         } else {
            CR2S_UpdateState_21130 other = (CR2S_UpdateState_21130)obj;
            if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else if (this.hasSubState() != other.hasSubState()) {
               return false;
            } else if (this.hasSubState() && this.getSubState() != other.getSubState()) {
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
            if (this.hasStage()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStage();
            }

            if (this.hasSubState()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSubState();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_UpdateState_21130 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateState_21130)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateState_21130 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateState_21130)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateState_21130 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateState_21130)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateState_21130 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateState_21130)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateState_21130 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateState_21130)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateState_21130 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateState_21130)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateState_21130 parseFrom(InputStream input) throws IOException {
         return (CR2S_UpdateState_21130)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpdateState_21130 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateState_21130)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpdateState_21130 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UpdateState_21130)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UpdateState_21130 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateState_21130)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpdateState_21130 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UpdateState_21130)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpdateState_21130 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateState_21130)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UpdateState_21130 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UpdateState_21130 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UpdateState_21130> parser() {
         return PARSER;
      }

      public Parser<CR2S_UpdateState_21130> getParserForType() {
         return PARSER;
      }

      public CR2S_UpdateState_21130 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UpdateState_21130OrBuilder {
         private int bitField0_;
         private int stage_;
         private int subState_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateState_21130_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateState_21130_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpdateState_21130.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.CR2S_UpdateState_21130.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.stage_ = 0;
            this.bitField0_ &= -2;
            this.subState_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateState_21130_descriptor;
         }

         public CR2S_UpdateState_21130 getDefaultInstanceForType() {
            return CrossCoreWarMsg.CR2S_UpdateState_21130.getDefaultInstance();
         }

         public CR2S_UpdateState_21130 build() {
            CR2S_UpdateState_21130 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UpdateState_21130 buildPartial() {
            CR2S_UpdateState_21130 result = new CR2S_UpdateState_21130(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stage_ = this.stage_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.subState_ = this.subState_;
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
            if (other instanceof CR2S_UpdateState_21130) {
               return this.mergeFrom((CR2S_UpdateState_21130)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UpdateState_21130 other) {
            if (other == CrossCoreWarMsg.CR2S_UpdateState_21130.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               if (other.hasSubState()) {
                  this.setSubState(other.getSubState());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStage()) {
               return false;
            } else {
               return this.hasSubState();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_UpdateState_21130 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UpdateState_21130)CrossCoreWarMsg.CR2S_UpdateState_21130.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UpdateState_21130)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 1;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -2;
            this.stage_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSubState() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSubState() {
            return this.subState_;
         }

         public Builder setSubState(int value) {
            this.bitField0_ |= 2;
            this.subState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSubState() {
            this.bitField0_ &= -3;
            this.subState_ = 0;
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

   public static final class S2CR_BaseInfo_21131 extends GeneratedMessageV3 implements S2CR_BaseInfo_21131OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_BaseInfo_21131 DEFAULT_INSTANCE = new S2CR_BaseInfo_21131();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_BaseInfo_21131> PARSER = new AbstractParser<S2CR_BaseInfo_21131>() {
         public S2CR_BaseInfo_21131 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_BaseInfo_21131(input, extensionRegistry);
         }
      };

      private S2CR_BaseInfo_21131(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_BaseInfo_21131() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_BaseInfo_21131();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_BaseInfo_21131(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_BaseInfo_21131_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_BaseInfo_21131_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_BaseInfo_21131.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_BaseInfo_21131)) {
            return super.equals(obj);
         } else {
            S2CR_BaseInfo_21131 other = (S2CR_BaseInfo_21131)obj;
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

      public static S2CR_BaseInfo_21131 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_BaseInfo_21131)PARSER.parseFrom(data);
      }

      public static S2CR_BaseInfo_21131 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BaseInfo_21131)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BaseInfo_21131 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_BaseInfo_21131)PARSER.parseFrom(data);
      }

      public static S2CR_BaseInfo_21131 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BaseInfo_21131)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BaseInfo_21131 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_BaseInfo_21131)PARSER.parseFrom(data);
      }

      public static S2CR_BaseInfo_21131 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BaseInfo_21131)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BaseInfo_21131 parseFrom(InputStream input) throws IOException {
         return (S2CR_BaseInfo_21131)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_BaseInfo_21131 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BaseInfo_21131)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_BaseInfo_21131 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_BaseInfo_21131)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_BaseInfo_21131 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BaseInfo_21131)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_BaseInfo_21131 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_BaseInfo_21131)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_BaseInfo_21131 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BaseInfo_21131)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_BaseInfo_21131 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_BaseInfo_21131 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_BaseInfo_21131> parser() {
         return PARSER;
      }

      public Parser<S2CR_BaseInfo_21131> getParserForType() {
         return PARSER;
      }

      public S2CR_BaseInfo_21131 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_BaseInfo_21131OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_BaseInfo_21131_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_BaseInfo_21131_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_BaseInfo_21131.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.S2CR_BaseInfo_21131.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_BaseInfo_21131_descriptor;
         }

         public S2CR_BaseInfo_21131 getDefaultInstanceForType() {
            return CrossCoreWarMsg.S2CR_BaseInfo_21131.getDefaultInstance();
         }

         public S2CR_BaseInfo_21131 build() {
            S2CR_BaseInfo_21131 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_BaseInfo_21131 buildPartial() {
            S2CR_BaseInfo_21131 result = new S2CR_BaseInfo_21131(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_BaseInfo_21131) {
               return this.mergeFrom((S2CR_BaseInfo_21131)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_BaseInfo_21131 other) {
            if (other == CrossCoreWarMsg.S2CR_BaseInfo_21131.getDefaultInstance()) {
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
            S2CR_BaseInfo_21131 parsedMessage = null;

            try {
               parsedMessage = (S2CR_BaseInfo_21131)CrossCoreWarMsg.S2CR_BaseInfo_21131.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_BaseInfo_21131)e.getUnfinishedMessage();
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

   public static final class S2CR_PlayerArraying_21133 extends GeneratedMessageV3 implements S2CR_PlayerArraying_21133OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ARRAYING_FIELD_NUMBER = 1;
      private ByteString arraying_;
      private byte memoizedIsInitialized;
      private static final S2CR_PlayerArraying_21133 DEFAULT_INSTANCE = new S2CR_PlayerArraying_21133();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_PlayerArraying_21133> PARSER = new AbstractParser<S2CR_PlayerArraying_21133>() {
         public S2CR_PlayerArraying_21133 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_PlayerArraying_21133(input, extensionRegistry);
         }
      };

      private S2CR_PlayerArraying_21133(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_PlayerArraying_21133() {
         this.memoizedIsInitialized = -1;
         this.arraying_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_PlayerArraying_21133();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_PlayerArraying_21133(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_PlayerArraying_21133_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_PlayerArraying_21133_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerArraying_21133.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_PlayerArraying_21133)) {
            return super.equals(obj);
         } else {
            S2CR_PlayerArraying_21133 other = (S2CR_PlayerArraying_21133)obj;
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

      public static S2CR_PlayerArraying_21133 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerArraying_21133)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerArraying_21133 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerArraying_21133)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerArraying_21133 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerArraying_21133)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerArraying_21133 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerArraying_21133)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerArraying_21133 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerArraying_21133)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerArraying_21133 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerArraying_21133)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerArraying_21133 parseFrom(InputStream input) throws IOException {
         return (S2CR_PlayerArraying_21133)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerArraying_21133 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerArraying_21133)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerArraying_21133 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_PlayerArraying_21133)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_PlayerArraying_21133 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerArraying_21133)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerArraying_21133 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_PlayerArraying_21133)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerArraying_21133 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerArraying_21133)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_PlayerArraying_21133 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_PlayerArraying_21133 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_PlayerArraying_21133> parser() {
         return PARSER;
      }

      public Parser<S2CR_PlayerArraying_21133> getParserForType() {
         return PARSER;
      }

      public S2CR_PlayerArraying_21133 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_PlayerArraying_21133OrBuilder {
         private int bitField0_;
         private ByteString arraying_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_PlayerArraying_21133_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_PlayerArraying_21133_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerArraying_21133.class, Builder.class);
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
            if (CrossCoreWarMsg.S2CR_PlayerArraying_21133.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.arraying_ = ByteString.EMPTY;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_PlayerArraying_21133_descriptor;
         }

         public S2CR_PlayerArraying_21133 getDefaultInstanceForType() {
            return CrossCoreWarMsg.S2CR_PlayerArraying_21133.getDefaultInstance();
         }

         public S2CR_PlayerArraying_21133 build() {
            S2CR_PlayerArraying_21133 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_PlayerArraying_21133 buildPartial() {
            S2CR_PlayerArraying_21133 result = new S2CR_PlayerArraying_21133(this);
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
            if (other instanceof S2CR_PlayerArraying_21133) {
               return this.mergeFrom((S2CR_PlayerArraying_21133)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_PlayerArraying_21133 other) {
            if (other == CrossCoreWarMsg.S2CR_PlayerArraying_21133.getDefaultInstance()) {
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
            S2CR_PlayerArraying_21133 parsedMessage = null;

            try {
               parsedMessage = (S2CR_PlayerArraying_21133)CrossCoreWarMsg.S2CR_PlayerArraying_21133.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_PlayerArraying_21133)e.getUnfinishedMessage();
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
            this.arraying_ = CrossCoreWarMsg.S2CR_PlayerArraying_21133.getDefaultInstance().getArraying();
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

   public static final class CR2S_PlayerArraying_21134 extends GeneratedMessageV3 implements CR2S_PlayerArraying_21134OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      private byte memoizedIsInitialized;
      private static final CR2S_PlayerArraying_21134 DEFAULT_INSTANCE = new CR2S_PlayerArraying_21134();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_PlayerArraying_21134> PARSER = new AbstractParser<CR2S_PlayerArraying_21134>() {
         public CR2S_PlayerArraying_21134 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_PlayerArraying_21134(input, extensionRegistry);
         }
      };

      private CR2S_PlayerArraying_21134(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_PlayerArraying_21134() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_PlayerArraying_21134();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_PlayerArraying_21134(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PlayerArraying_21134_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PlayerArraying_21134_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_PlayerArraying_21134.class, Builder.class);
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
         } else if (!(obj instanceof CR2S_PlayerArraying_21134)) {
            return super.equals(obj);
         } else {
            CR2S_PlayerArraying_21134 other = (CR2S_PlayerArraying_21134)obj;
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

      public static CR2S_PlayerArraying_21134 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_PlayerArraying_21134)PARSER.parseFrom(data);
      }

      public static CR2S_PlayerArraying_21134 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayerArraying_21134)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayerArraying_21134 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_PlayerArraying_21134)PARSER.parseFrom(data);
      }

      public static CR2S_PlayerArraying_21134 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayerArraying_21134)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayerArraying_21134 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_PlayerArraying_21134)PARSER.parseFrom(data);
      }

      public static CR2S_PlayerArraying_21134 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayerArraying_21134)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayerArraying_21134 parseFrom(InputStream input) throws IOException {
         return (CR2S_PlayerArraying_21134)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_PlayerArraying_21134 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayerArraying_21134)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_PlayerArraying_21134 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_PlayerArraying_21134)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_PlayerArraying_21134 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayerArraying_21134)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_PlayerArraying_21134 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_PlayerArraying_21134)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_PlayerArraying_21134 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayerArraying_21134)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_PlayerArraying_21134 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_PlayerArraying_21134 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_PlayerArraying_21134> parser() {
         return PARSER;
      }

      public Parser<CR2S_PlayerArraying_21134> getParserForType() {
         return PARSER;
      }

      public CR2S_PlayerArraying_21134 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_PlayerArraying_21134OrBuilder {
         private int bitField0_;
         private int playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PlayerArraying_21134_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PlayerArraying_21134_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_PlayerArraying_21134.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.CR2S_PlayerArraying_21134.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PlayerArraying_21134_descriptor;
         }

         public CR2S_PlayerArraying_21134 getDefaultInstanceForType() {
            return CrossCoreWarMsg.CR2S_PlayerArraying_21134.getDefaultInstance();
         }

         public CR2S_PlayerArraying_21134 build() {
            CR2S_PlayerArraying_21134 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_PlayerArraying_21134 buildPartial() {
            CR2S_PlayerArraying_21134 result = new CR2S_PlayerArraying_21134(this);
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
            if (other instanceof CR2S_PlayerArraying_21134) {
               return this.mergeFrom((CR2S_PlayerArraying_21134)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_PlayerArraying_21134 other) {
            if (other == CrossCoreWarMsg.CR2S_PlayerArraying_21134.getDefaultInstance()) {
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
            CR2S_PlayerArraying_21134 parsedMessage = null;

            try {
               parsedMessage = (CR2S_PlayerArraying_21134)CrossCoreWarMsg.CR2S_PlayerArraying_21134.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_PlayerArraying_21134)e.getUnfinishedMessage();
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

   public static final class CR2S_UpdateProperty_21136 extends GeneratedMessageV3 implements CR2S_UpdateProperty_21136OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int DATA_FIELD_NUMBER = 1;
      private List<MergeWarGameMsg.PlayerProperty> data_;
      private byte memoizedIsInitialized;
      private static final CR2S_UpdateProperty_21136 DEFAULT_INSTANCE = new CR2S_UpdateProperty_21136();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UpdateProperty_21136> PARSER = new AbstractParser<CR2S_UpdateProperty_21136>() {
         public CR2S_UpdateProperty_21136 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UpdateProperty_21136(input, extensionRegistry);
         }
      };

      private CR2S_UpdateProperty_21136(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UpdateProperty_21136() {
         this.memoizedIsInitialized = -1;
         this.data_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UpdateProperty_21136();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UpdateProperty_21136(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.data_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.data_.add(input.readMessage(MergeWarGameMsg.PlayerProperty.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.data_ = Collections.unmodifiableList(this.data_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateProperty_21136_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateProperty_21136_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpdateProperty_21136.class, Builder.class);
      }

      public List<MergeWarGameMsg.PlayerProperty> getDataList() {
         return this.data_;
      }

      public List<? extends MergeWarGameMsg.PlayerPropertyOrBuilder> getDataOrBuilderList() {
         return this.data_;
      }

      public int getDataCount() {
         return this.data_.size();
      }

      public MergeWarGameMsg.PlayerProperty getData(int index) {
         return (MergeWarGameMsg.PlayerProperty)this.data_.get(index);
      }

      public MergeWarGameMsg.PlayerPropertyOrBuilder getDataOrBuilder(int index) {
         return (MergeWarGameMsg.PlayerPropertyOrBuilder)this.data_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getDataCount(); ++i) {
               if (!this.getData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.data_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.data_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.data_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.data_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_UpdateProperty_21136)) {
            return super.equals(obj);
         } else {
            CR2S_UpdateProperty_21136 other = (CR2S_UpdateProperty_21136)obj;
            if (!this.getDataList().equals(other.getDataList())) {
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
            if (this.getDataCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_UpdateProperty_21136 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateProperty_21136)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateProperty_21136 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateProperty_21136)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateProperty_21136 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateProperty_21136)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateProperty_21136 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateProperty_21136)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateProperty_21136 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateProperty_21136)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateProperty_21136 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateProperty_21136)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateProperty_21136 parseFrom(InputStream input) throws IOException {
         return (CR2S_UpdateProperty_21136)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpdateProperty_21136 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateProperty_21136)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpdateProperty_21136 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UpdateProperty_21136)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UpdateProperty_21136 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateProperty_21136)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpdateProperty_21136 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UpdateProperty_21136)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpdateProperty_21136 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateProperty_21136)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UpdateProperty_21136 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UpdateProperty_21136 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UpdateProperty_21136> parser() {
         return PARSER;
      }

      public Parser<CR2S_UpdateProperty_21136> getParserForType() {
         return PARSER;
      }

      public CR2S_UpdateProperty_21136 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UpdateProperty_21136OrBuilder {
         private int bitField0_;
         private List<MergeWarGameMsg.PlayerProperty> data_;
         private RepeatedFieldBuilderV3<MergeWarGameMsg.PlayerProperty, MergeWarGameMsg.PlayerProperty.Builder, MergeWarGameMsg.PlayerPropertyOrBuilder> dataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateProperty_21136_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateProperty_21136_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpdateProperty_21136.class, Builder.class);
         }

         private Builder() {
            this.data_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.data_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.CR2S_UpdateProperty_21136.alwaysUseFieldBuilders) {
               this.getDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.dataBuilder_ == null) {
               this.data_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.dataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_UpdateProperty_21136_descriptor;
         }

         public CR2S_UpdateProperty_21136 getDefaultInstanceForType() {
            return CrossCoreWarMsg.CR2S_UpdateProperty_21136.getDefaultInstance();
         }

         public CR2S_UpdateProperty_21136 build() {
            CR2S_UpdateProperty_21136 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UpdateProperty_21136 buildPartial() {
            CR2S_UpdateProperty_21136 result = new CR2S_UpdateProperty_21136(this);
            int from_bitField0_ = this.bitField0_;
            if (this.dataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.data_ = Collections.unmodifiableList(this.data_);
                  this.bitField0_ &= -2;
               }

               result.data_ = this.data_;
            } else {
               result.data_ = this.dataBuilder_.build();
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
            if (other instanceof CR2S_UpdateProperty_21136) {
               return this.mergeFrom((CR2S_UpdateProperty_21136)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UpdateProperty_21136 other) {
            if (other == CrossCoreWarMsg.CR2S_UpdateProperty_21136.getDefaultInstance()) {
               return this;
            } else {
               if (this.dataBuilder_ == null) {
                  if (!other.data_.isEmpty()) {
                     if (this.data_.isEmpty()) {
                        this.data_ = other.data_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureDataIsMutable();
                        this.data_.addAll(other.data_);
                     }

                     this.onChanged();
                  }
               } else if (!other.data_.isEmpty()) {
                  if (this.dataBuilder_.isEmpty()) {
                     this.dataBuilder_.dispose();
                     this.dataBuilder_ = null;
                     this.data_ = other.data_;
                     this.bitField0_ &= -2;
                     this.dataBuilder_ = CrossCoreWarMsg.CR2S_UpdateProperty_21136.alwaysUseFieldBuilders ? this.getDataFieldBuilder() : null;
                  } else {
                     this.dataBuilder_.addAllMessages(other.data_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getDataCount(); ++i) {
               if (!this.getData(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_UpdateProperty_21136 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UpdateProperty_21136)CrossCoreWarMsg.CR2S_UpdateProperty_21136.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UpdateProperty_21136)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureDataIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.data_ = new ArrayList(this.data_);
               this.bitField0_ |= 1;
            }

         }

         public List<MergeWarGameMsg.PlayerProperty> getDataList() {
            return this.dataBuilder_ == null ? Collections.unmodifiableList(this.data_) : this.dataBuilder_.getMessageList();
         }

         public int getDataCount() {
            return this.dataBuilder_ == null ? this.data_.size() : this.dataBuilder_.getCount();
         }

         public MergeWarGameMsg.PlayerProperty getData(int index) {
            return this.dataBuilder_ == null ? (MergeWarGameMsg.PlayerProperty)this.data_.get(index) : (MergeWarGameMsg.PlayerProperty)this.dataBuilder_.getMessage(index);
         }

         public Builder setData(int index, MergeWarGameMsg.PlayerProperty value) {
            if (this.dataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDataIsMutable();
               this.data_.set(index, value);
               this.onChanged();
            } else {
               this.dataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setData(int index, MergeWarGameMsg.PlayerProperty.Builder builderForValue) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addData(MergeWarGameMsg.PlayerProperty value) {
            if (this.dataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDataIsMutable();
               this.data_.add(value);
               this.onChanged();
            } else {
               this.dataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addData(int index, MergeWarGameMsg.PlayerProperty value) {
            if (this.dataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDataIsMutable();
               this.data_.add(index, value);
               this.onChanged();
            } else {
               this.dataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addData(MergeWarGameMsg.PlayerProperty.Builder builderForValue) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.dataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addData(int index, MergeWarGameMsg.PlayerProperty.Builder builderForValue) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllData(Iterable<? extends MergeWarGameMsg.PlayerProperty> values) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.data_);
               this.onChanged();
            } else {
               this.dataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearData() {
            if (this.dataBuilder_ == null) {
               this.data_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.dataBuilder_.clear();
            }

            return this;
         }

         public Builder removeData(int index) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.remove(index);
               this.onChanged();
            } else {
               this.dataBuilder_.remove(index);
            }

            return this;
         }

         public MergeWarGameMsg.PlayerProperty.Builder getDataBuilder(int index) {
            return (MergeWarGameMsg.PlayerProperty.Builder)this.getDataFieldBuilder().getBuilder(index);
         }

         public MergeWarGameMsg.PlayerPropertyOrBuilder getDataOrBuilder(int index) {
            return this.dataBuilder_ == null ? (MergeWarGameMsg.PlayerPropertyOrBuilder)this.data_.get(index) : (MergeWarGameMsg.PlayerPropertyOrBuilder)this.dataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MergeWarGameMsg.PlayerPropertyOrBuilder> getDataOrBuilderList() {
            return this.dataBuilder_ != null ? this.dataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.data_);
         }

         public MergeWarGameMsg.PlayerProperty.Builder addDataBuilder() {
            return (MergeWarGameMsg.PlayerProperty.Builder)this.getDataFieldBuilder().addBuilder(MergeWarGameMsg.PlayerProperty.getDefaultInstance());
         }

         public MergeWarGameMsg.PlayerProperty.Builder addDataBuilder(int index) {
            return (MergeWarGameMsg.PlayerProperty.Builder)this.getDataFieldBuilder().addBuilder(index, MergeWarGameMsg.PlayerProperty.getDefaultInstance());
         }

         public List<MergeWarGameMsg.PlayerProperty.Builder> getDataBuilderList() {
            return this.getDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MergeWarGameMsg.PlayerProperty, MergeWarGameMsg.PlayerProperty.Builder, MergeWarGameMsg.PlayerPropertyOrBuilder> getDataFieldBuilder() {
            if (this.dataBuilder_ == null) {
               this.dataBuilder_ = new RepeatedFieldBuilderV3(this.data_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.data_ = null;
            }

            return this.dataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_TriggerTask_21138 extends GeneratedMessageV3 implements CR2S_TriggerTask_21138OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int TARGETTYPE_FIELD_NUMBER = 2;
      private int targetType_;
      public static final int TARGETX_FIELD_NUMBER = 3;
      private int targetX_;
      public static final int OPVALUE_FIELD_NUMBER = 4;
      private long opValue_;
      public static final int OPTYPE_FIELD_NUMBER = 5;
      private int opType_;
      private byte memoizedIsInitialized;
      private static final CR2S_TriggerTask_21138 DEFAULT_INSTANCE = new CR2S_TriggerTask_21138();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_TriggerTask_21138> PARSER = new AbstractParser<CR2S_TriggerTask_21138>() {
         public CR2S_TriggerTask_21138 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_TriggerTask_21138(input, extensionRegistry);
         }
      };

      private CR2S_TriggerTask_21138(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_TriggerTask_21138() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_TriggerTask_21138();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_TriggerTask_21138(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.targetType_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.targetX_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.opValue_ = input.readInt64();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.opType_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_TriggerTask_21138_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_TriggerTask_21138_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_TriggerTask_21138.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasTargetType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTargetType() {
         return this.targetType_;
      }

      public boolean hasTargetX() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getTargetX() {
         return this.targetX_;
      }

      public boolean hasOpValue() {
         return (this.bitField0_ & 8) != 0;
      }

      public long getOpValue() {
         return this.opValue_;
      }

      public boolean hasOpType() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getOpType() {
         return this.opType_;
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
         } else if (!this.hasTargetType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTargetX()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOpValue()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOpType()) {
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
            output.writeInt32(2, this.targetType_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.targetX_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt64(4, this.opValue_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.opType_);
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
               size += CodedOutputStream.computeInt32Size(2, this.targetType_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.targetX_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt64Size(4, this.opValue_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.opType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_TriggerTask_21138)) {
            return super.equals(obj);
         } else {
            CR2S_TriggerTask_21138 other = (CR2S_TriggerTask_21138)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasTargetType() != other.hasTargetType()) {
               return false;
            } else if (this.hasTargetType() && this.getTargetType() != other.getTargetType()) {
               return false;
            } else if (this.hasTargetX() != other.hasTargetX()) {
               return false;
            } else if (this.hasTargetX() && this.getTargetX() != other.getTargetX()) {
               return false;
            } else if (this.hasOpValue() != other.hasOpValue()) {
               return false;
            } else if (this.hasOpValue() && this.getOpValue() != other.getOpValue()) {
               return false;
            } else if (this.hasOpType() != other.hasOpType()) {
               return false;
            } else if (this.hasOpType() && this.getOpType() != other.getOpType()) {
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

            if (this.hasTargetType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTargetType();
            }

            if (this.hasTargetX()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTargetX();
            }

            if (this.hasOpValue()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashLong(this.getOpValue());
            }

            if (this.hasOpType()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getOpType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_TriggerTask_21138 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_TriggerTask_21138)PARSER.parseFrom(data);
      }

      public static CR2S_TriggerTask_21138 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_TriggerTask_21138)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_TriggerTask_21138 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_TriggerTask_21138)PARSER.parseFrom(data);
      }

      public static CR2S_TriggerTask_21138 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_TriggerTask_21138)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_TriggerTask_21138 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_TriggerTask_21138)PARSER.parseFrom(data);
      }

      public static CR2S_TriggerTask_21138 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_TriggerTask_21138)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_TriggerTask_21138 parseFrom(InputStream input) throws IOException {
         return (CR2S_TriggerTask_21138)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_TriggerTask_21138 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_TriggerTask_21138)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_TriggerTask_21138 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_TriggerTask_21138)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_TriggerTask_21138 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_TriggerTask_21138)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_TriggerTask_21138 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_TriggerTask_21138)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_TriggerTask_21138 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_TriggerTask_21138)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_TriggerTask_21138 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_TriggerTask_21138 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_TriggerTask_21138> parser() {
         return PARSER;
      }

      public Parser<CR2S_TriggerTask_21138> getParserForType() {
         return PARSER;
      }

      public CR2S_TriggerTask_21138 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_TriggerTask_21138OrBuilder {
         private int bitField0_;
         private int playerId_;
         private int targetType_;
         private int targetX_;
         private long opValue_;
         private int opType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_TriggerTask_21138_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_TriggerTask_21138_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_TriggerTask_21138.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.CR2S_TriggerTask_21138.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.targetType_ = 0;
            this.bitField0_ &= -3;
            this.targetX_ = 0;
            this.bitField0_ &= -5;
            this.opValue_ = 0L;
            this.bitField0_ &= -9;
            this.opType_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_TriggerTask_21138_descriptor;
         }

         public CR2S_TriggerTask_21138 getDefaultInstanceForType() {
            return CrossCoreWarMsg.CR2S_TriggerTask_21138.getDefaultInstance();
         }

         public CR2S_TriggerTask_21138 build() {
            CR2S_TriggerTask_21138 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_TriggerTask_21138 buildPartial() {
            CR2S_TriggerTask_21138 result = new CR2S_TriggerTask_21138(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.targetType_ = this.targetType_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.targetX_ = this.targetX_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.opValue_ = this.opValue_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.opType_ = this.opType_;
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
            if (other instanceof CR2S_TriggerTask_21138) {
               return this.mergeFrom((CR2S_TriggerTask_21138)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_TriggerTask_21138 other) {
            if (other == CrossCoreWarMsg.CR2S_TriggerTask_21138.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasTargetType()) {
                  this.setTargetType(other.getTargetType());
               }

               if (other.hasTargetX()) {
                  this.setTargetX(other.getTargetX());
               }

               if (other.hasOpValue()) {
                  this.setOpValue(other.getOpValue());
               }

               if (other.hasOpType()) {
                  this.setOpType(other.getOpType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasTargetType()) {
               return false;
            } else if (!this.hasTargetX()) {
               return false;
            } else if (!this.hasOpValue()) {
               return false;
            } else {
               return this.hasOpType();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_TriggerTask_21138 parsedMessage = null;

            try {
               parsedMessage = (CR2S_TriggerTask_21138)CrossCoreWarMsg.CR2S_TriggerTask_21138.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_TriggerTask_21138)e.getUnfinishedMessage();
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

         public boolean hasTargetType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTargetType() {
            return this.targetType_;
         }

         public Builder setTargetType(int value) {
            this.bitField0_ |= 2;
            this.targetType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTargetType() {
            this.bitField0_ &= -3;
            this.targetType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTargetX() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getTargetX() {
            return this.targetX_;
         }

         public Builder setTargetX(int value) {
            this.bitField0_ |= 4;
            this.targetX_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTargetX() {
            this.bitField0_ &= -5;
            this.targetX_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOpValue() {
            return (this.bitField0_ & 8) != 0;
         }

         public long getOpValue() {
            return this.opValue_;
         }

         public Builder setOpValue(long value) {
            this.bitField0_ |= 8;
            this.opValue_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpValue() {
            this.bitField0_ &= -9;
            this.opValue_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasOpType() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getOpType() {
            return this.opType_;
         }

         public Builder setOpType(int value) {
            this.bitField0_ |= 16;
            this.opType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpType() {
            this.bitField0_ &= -17;
            this.opType_ = 0;
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

   public static final class CR2S_GameRank_21140 extends GeneratedMessageV3 implements CR2S_GameRank_21140OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int UNIONID_FIELD_NUMBER = 2;
      private int unionId_;
      public static final int CHAPTERID_FIELD_NUMBER = 3;
      private int chapterId_;
      public static final int RANKS_FIELD_NUMBER = 4;
      private List<RankMsg.RankData> ranks_;
      private byte memoizedIsInitialized;
      private static final CR2S_GameRank_21140 DEFAULT_INSTANCE = new CR2S_GameRank_21140();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_GameRank_21140> PARSER = new AbstractParser<CR2S_GameRank_21140>() {
         public CR2S_GameRank_21140 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_GameRank_21140(input, extensionRegistry);
         }
      };

      private CR2S_GameRank_21140(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_GameRank_21140() {
         this.memoizedIsInitialized = -1;
         this.ranks_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_GameRank_21140();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_GameRank_21140(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.unionId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.chapterId_ = input.readInt32();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.ranks_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.ranks_.add(input.readMessage(RankMsg.RankData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_GameRank_21140_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_GameRank_21140_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_GameRank_21140.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasUnionId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getUnionId() {
         return this.unionId_;
      }

      public boolean hasChapterId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getChapterId() {
         return this.chapterId_;
      }

      public List<RankMsg.RankData> getRanksList() {
         return this.ranks_;
      }

      public List<? extends RankMsg.RankDataOrBuilder> getRanksOrBuilderList() {
         return this.ranks_;
      }

      public int getRanksCount() {
         return this.ranks_.size();
      }

      public RankMsg.RankData getRanks(int index) {
         return (RankMsg.RankData)this.ranks_.get(index);
      }

      public RankMsg.RankDataOrBuilder getRanksOrBuilder(int index) {
         return (RankMsg.RankDataOrBuilder)this.ranks_.get(index);
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
         } else if (!this.hasUnionId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasChapterId()) {
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
            output.writeInt32(1, this.rank_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.unionId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.chapterId_);
         }

         for(int i = 0; i < this.ranks_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.ranks_.get(i));
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
               size += CodedOutputStream.computeInt32Size(2, this.unionId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.chapterId_);
            }

            for(int i = 0; i < this.ranks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.ranks_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_GameRank_21140)) {
            return super.equals(obj);
         } else {
            CR2S_GameRank_21140 other = (CR2S_GameRank_21140)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasUnionId() != other.hasUnionId()) {
               return false;
            } else if (this.hasUnionId() && this.getUnionId() != other.getUnionId()) {
               return false;
            } else if (this.hasChapterId() != other.hasChapterId()) {
               return false;
            } else if (this.hasChapterId() && this.getChapterId() != other.getChapterId()) {
               return false;
            } else if (!this.getRanksList().equals(other.getRanksList())) {
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

            if (this.hasUnionId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getUnionId();
            }

            if (this.hasChapterId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getChapterId();
            }

            if (this.getRanksCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getRanksList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_GameRank_21140 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_GameRank_21140)PARSER.parseFrom(data);
      }

      public static CR2S_GameRank_21140 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GameRank_21140)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GameRank_21140 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_GameRank_21140)PARSER.parseFrom(data);
      }

      public static CR2S_GameRank_21140 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GameRank_21140)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GameRank_21140 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_GameRank_21140)PARSER.parseFrom(data);
      }

      public static CR2S_GameRank_21140 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GameRank_21140)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GameRank_21140 parseFrom(InputStream input) throws IOException {
         return (CR2S_GameRank_21140)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_GameRank_21140 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GameRank_21140)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_GameRank_21140 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_GameRank_21140)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_GameRank_21140 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GameRank_21140)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_GameRank_21140 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_GameRank_21140)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_GameRank_21140 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GameRank_21140)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_GameRank_21140 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_GameRank_21140 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_GameRank_21140> parser() {
         return PARSER;
      }

      public Parser<CR2S_GameRank_21140> getParserForType() {
         return PARSER;
      }

      public CR2S_GameRank_21140 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_GameRank_21140OrBuilder {
         private int bitField0_;
         private int rank_;
         private int unionId_;
         private int chapterId_;
         private List<RankMsg.RankData> ranks_;
         private RepeatedFieldBuilderV3<RankMsg.RankData, RankMsg.RankData.Builder, RankMsg.RankDataOrBuilder> ranksBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_GameRank_21140_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_GameRank_21140_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_GameRank_21140.class, Builder.class);
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
            if (CrossCoreWarMsg.CR2S_GameRank_21140.alwaysUseFieldBuilders) {
               this.getRanksFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.unionId_ = 0;
            this.bitField0_ &= -3;
            this.chapterId_ = 0;
            this.bitField0_ &= -5;
            if (this.ranksBuilder_ == null) {
               this.ranks_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.ranksBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_GameRank_21140_descriptor;
         }

         public CR2S_GameRank_21140 getDefaultInstanceForType() {
            return CrossCoreWarMsg.CR2S_GameRank_21140.getDefaultInstance();
         }

         public CR2S_GameRank_21140 build() {
            CR2S_GameRank_21140 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_GameRank_21140 buildPartial() {
            CR2S_GameRank_21140 result = new CR2S_GameRank_21140(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.unionId_ = this.unionId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.chapterId_ = this.chapterId_;
               to_bitField0_ |= 4;
            }

            if (this.ranksBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
                  this.bitField0_ &= -9;
               }

               result.ranks_ = this.ranks_;
            } else {
               result.ranks_ = this.ranksBuilder_.build();
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
            if (other instanceof CR2S_GameRank_21140) {
               return this.mergeFrom((CR2S_GameRank_21140)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_GameRank_21140 other) {
            if (other == CrossCoreWarMsg.CR2S_GameRank_21140.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               if (other.hasChapterId()) {
                  this.setChapterId(other.getChapterId());
               }

               if (this.ranksBuilder_ == null) {
                  if (!other.ranks_.isEmpty()) {
                     if (this.ranks_.isEmpty()) {
                        this.ranks_ = other.ranks_;
                        this.bitField0_ &= -9;
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
                     this.bitField0_ &= -9;
                     this.ranksBuilder_ = CrossCoreWarMsg.CR2S_GameRank_21140.alwaysUseFieldBuilders ? this.getRanksFieldBuilder() : null;
                  } else {
                     this.ranksBuilder_.addAllMessages(other.ranks_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRank()) {
               return false;
            } else if (!this.hasUnionId()) {
               return false;
            } else if (!this.hasChapterId()) {
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
            CR2S_GameRank_21140 parsedMessage = null;

            try {
               parsedMessage = (CR2S_GameRank_21140)CrossCoreWarMsg.CR2S_GameRank_21140.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_GameRank_21140)e.getUnfinishedMessage();
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

         public boolean hasUnionId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getUnionId() {
            return this.unionId_;
         }

         public Builder setUnionId(int value) {
            this.bitField0_ |= 2;
            this.unionId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionId() {
            this.bitField0_ &= -3;
            this.unionId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasChapterId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getChapterId() {
            return this.chapterId_;
         }

         public Builder setChapterId(int value) {
            this.bitField0_ |= 4;
            this.chapterId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChapterId() {
            this.bitField0_ &= -5;
            this.chapterId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRanksIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.ranks_ = new ArrayList(this.ranks_);
               this.bitField0_ |= 8;
            }

         }

         public List<RankMsg.RankData> getRanksList() {
            return this.ranksBuilder_ == null ? Collections.unmodifiableList(this.ranks_) : this.ranksBuilder_.getMessageList();
         }

         public int getRanksCount() {
            return this.ranksBuilder_ == null ? this.ranks_.size() : this.ranksBuilder_.getCount();
         }

         public RankMsg.RankData getRanks(int index) {
            return this.ranksBuilder_ == null ? (RankMsg.RankData)this.ranks_.get(index) : (RankMsg.RankData)this.ranksBuilder_.getMessage(index);
         }

         public Builder setRanks(int index, RankMsg.RankData value) {
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

         public Builder setRanks(int index, RankMsg.RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(RankMsg.RankData value) {
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

         public Builder addRanks(int index, RankMsg.RankData value) {
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

         public Builder addRanks(RankMsg.RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(int index, RankMsg.RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRanks(Iterable<? extends RankMsg.RankData> values) {
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
               this.bitField0_ &= -9;
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

         public RankMsg.RankData.Builder getRanksBuilder(int index) {
            return (RankMsg.RankData.Builder)this.getRanksFieldBuilder().getBuilder(index);
         }

         public RankMsg.RankDataOrBuilder getRanksOrBuilder(int index) {
            return this.ranksBuilder_ == null ? (RankMsg.RankDataOrBuilder)this.ranks_.get(index) : (RankMsg.RankDataOrBuilder)this.ranksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankMsg.RankDataOrBuilder> getRanksOrBuilderList() {
            return this.ranksBuilder_ != null ? this.ranksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.ranks_);
         }

         public RankMsg.RankData.Builder addRanksBuilder() {
            return (RankMsg.RankData.Builder)this.getRanksFieldBuilder().addBuilder(RankMsg.RankData.getDefaultInstance());
         }

         public RankMsg.RankData.Builder addRanksBuilder(int index) {
            return (RankMsg.RankData.Builder)this.getRanksFieldBuilder().addBuilder(index, RankMsg.RankData.getDefaultInstance());
         }

         public List<RankMsg.RankData.Builder> getRanksBuilderList() {
            return this.getRanksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankMsg.RankData, RankMsg.RankData.Builder, RankMsg.RankDataOrBuilder> getRanksFieldBuilder() {
            if (this.ranksBuilder_ == null) {
               this.ranksBuilder_ = new RepeatedFieldBuilderV3(this.ranks_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.ranks_ = null;
            }

            return this.ranksBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_PromoteUnion_21143 extends GeneratedMessageV3 implements S2CR_PromoteUnion_21143OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int UNIONID_FIELD_NUMBER = 1;
      private int unionId_;
      public static final int DAMAGE_FIELD_NUMBER = 2;
      private long damage_;
      public static final int FORMAL_FIELD_NUMBER = 3;
      private boolean formal_;
      private byte memoizedIsInitialized;
      private static final S2CR_PromoteUnion_21143 DEFAULT_INSTANCE = new S2CR_PromoteUnion_21143();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_PromoteUnion_21143> PARSER = new AbstractParser<S2CR_PromoteUnion_21143>() {
         public S2CR_PromoteUnion_21143 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_PromoteUnion_21143(input, extensionRegistry);
         }
      };

      private S2CR_PromoteUnion_21143(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_PromoteUnion_21143() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_PromoteUnion_21143();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_PromoteUnion_21143(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.unionId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.damage_ = input.readInt64();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.formal_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_PromoteUnion_21143_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_PromoteUnion_21143_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PromoteUnion_21143.class, Builder.class);
      }

      public boolean hasUnionId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getUnionId() {
         return this.unionId_;
      }

      public boolean hasDamage() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getDamage() {
         return this.damage_;
      }

      public boolean hasFormal() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getFormal() {
         return this.formal_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasUnionId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDamage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFormal()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.unionId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.damage_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.formal_);
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
               size += CodedOutputStream.computeInt32Size(1, this.unionId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(2, this.damage_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.formal_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_PromoteUnion_21143)) {
            return super.equals(obj);
         } else {
            S2CR_PromoteUnion_21143 other = (S2CR_PromoteUnion_21143)obj;
            if (this.hasUnionId() != other.hasUnionId()) {
               return false;
            } else if (this.hasUnionId() && this.getUnionId() != other.getUnionId()) {
               return false;
            } else if (this.hasDamage() != other.hasDamage()) {
               return false;
            } else if (this.hasDamage() && this.getDamage() != other.getDamage()) {
               return false;
            } else if (this.hasFormal() != other.hasFormal()) {
               return false;
            } else if (this.hasFormal() && this.getFormal() != other.getFormal()) {
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
            if (this.hasUnionId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUnionId();
            }

            if (this.hasDamage()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getDamage());
            }

            if (this.hasFormal()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getFormal());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_PromoteUnion_21143 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_PromoteUnion_21143)PARSER.parseFrom(data);
      }

      public static S2CR_PromoteUnion_21143 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PromoteUnion_21143)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PromoteUnion_21143 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_PromoteUnion_21143)PARSER.parseFrom(data);
      }

      public static S2CR_PromoteUnion_21143 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PromoteUnion_21143)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PromoteUnion_21143 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_PromoteUnion_21143)PARSER.parseFrom(data);
      }

      public static S2CR_PromoteUnion_21143 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PromoteUnion_21143)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PromoteUnion_21143 parseFrom(InputStream input) throws IOException {
         return (S2CR_PromoteUnion_21143)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PromoteUnion_21143 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PromoteUnion_21143)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PromoteUnion_21143 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_PromoteUnion_21143)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_PromoteUnion_21143 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PromoteUnion_21143)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PromoteUnion_21143 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_PromoteUnion_21143)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PromoteUnion_21143 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PromoteUnion_21143)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_PromoteUnion_21143 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_PromoteUnion_21143 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_PromoteUnion_21143> parser() {
         return PARSER;
      }

      public Parser<S2CR_PromoteUnion_21143> getParserForType() {
         return PARSER;
      }

      public S2CR_PromoteUnion_21143 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_PromoteUnion_21143OrBuilder {
         private int bitField0_;
         private int unionId_;
         private long damage_;
         private boolean formal_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_PromoteUnion_21143_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_PromoteUnion_21143_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PromoteUnion_21143.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.S2CR_PromoteUnion_21143.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.unionId_ = 0;
            this.bitField0_ &= -2;
            this.damage_ = 0L;
            this.bitField0_ &= -3;
            this.formal_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_PromoteUnion_21143_descriptor;
         }

         public S2CR_PromoteUnion_21143 getDefaultInstanceForType() {
            return CrossCoreWarMsg.S2CR_PromoteUnion_21143.getDefaultInstance();
         }

         public S2CR_PromoteUnion_21143 build() {
            S2CR_PromoteUnion_21143 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_PromoteUnion_21143 buildPartial() {
            S2CR_PromoteUnion_21143 result = new S2CR_PromoteUnion_21143(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.unionId_ = this.unionId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.damage_ = this.damage_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.formal_ = this.formal_;
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
            if (other instanceof S2CR_PromoteUnion_21143) {
               return this.mergeFrom((S2CR_PromoteUnion_21143)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_PromoteUnion_21143 other) {
            if (other == CrossCoreWarMsg.S2CR_PromoteUnion_21143.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               if (other.hasDamage()) {
                  this.setDamage(other.getDamage());
               }

               if (other.hasFormal()) {
                  this.setFormal(other.getFormal());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasUnionId()) {
               return false;
            } else if (!this.hasDamage()) {
               return false;
            } else {
               return this.hasFormal();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_PromoteUnion_21143 parsedMessage = null;

            try {
               parsedMessage = (S2CR_PromoteUnion_21143)CrossCoreWarMsg.S2CR_PromoteUnion_21143.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_PromoteUnion_21143)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasUnionId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getUnionId() {
            return this.unionId_;
         }

         public Builder setUnionId(int value) {
            this.bitField0_ |= 1;
            this.unionId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionId() {
            this.bitField0_ &= -2;
            this.unionId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDamage() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getDamage() {
            return this.damage_;
         }

         public Builder setDamage(long value) {
            this.bitField0_ |= 2;
            this.damage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDamage() {
            this.bitField0_ &= -3;
            this.damage_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasFormal() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getFormal() {
            return this.formal_;
         }

         public Builder setFormal(boolean value) {
            this.bitField0_ |= 4;
            this.formal_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFormal() {
            this.bitField0_ &= -5;
            this.formal_ = false;
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

   public static final class CR2S_PromoteUnion_21144 extends GeneratedMessageV3 implements CR2S_PromoteUnion_21144OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final CR2S_PromoteUnion_21144 DEFAULT_INSTANCE = new CR2S_PromoteUnion_21144();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_PromoteUnion_21144> PARSER = new AbstractParser<CR2S_PromoteUnion_21144>() {
         public CR2S_PromoteUnion_21144 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_PromoteUnion_21144(input, extensionRegistry);
         }
      };

      private CR2S_PromoteUnion_21144(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_PromoteUnion_21144() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_PromoteUnion_21144();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_PromoteUnion_21144(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PromoteUnion_21144_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PromoteUnion_21144_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_PromoteUnion_21144.class, Builder.class);
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
         } else if (!(obj instanceof CR2S_PromoteUnion_21144)) {
            return super.equals(obj);
         } else {
            CR2S_PromoteUnion_21144 other = (CR2S_PromoteUnion_21144)obj;
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

      public static CR2S_PromoteUnion_21144 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_PromoteUnion_21144)PARSER.parseFrom(data);
      }

      public static CR2S_PromoteUnion_21144 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PromoteUnion_21144)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PromoteUnion_21144 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_PromoteUnion_21144)PARSER.parseFrom(data);
      }

      public static CR2S_PromoteUnion_21144 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PromoteUnion_21144)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PromoteUnion_21144 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_PromoteUnion_21144)PARSER.parseFrom(data);
      }

      public static CR2S_PromoteUnion_21144 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PromoteUnion_21144)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PromoteUnion_21144 parseFrom(InputStream input) throws IOException {
         return (CR2S_PromoteUnion_21144)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_PromoteUnion_21144 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PromoteUnion_21144)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_PromoteUnion_21144 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_PromoteUnion_21144)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_PromoteUnion_21144 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PromoteUnion_21144)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_PromoteUnion_21144 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_PromoteUnion_21144)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_PromoteUnion_21144 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PromoteUnion_21144)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_PromoteUnion_21144 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_PromoteUnion_21144 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_PromoteUnion_21144> parser() {
         return PARSER;
      }

      public Parser<CR2S_PromoteUnion_21144> getParserForType() {
         return PARSER;
      }

      public CR2S_PromoteUnion_21144 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_PromoteUnion_21144OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PromoteUnion_21144_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PromoteUnion_21144_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_PromoteUnion_21144.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.CR2S_PromoteUnion_21144.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_PromoteUnion_21144_descriptor;
         }

         public CR2S_PromoteUnion_21144 getDefaultInstanceForType() {
            return CrossCoreWarMsg.CR2S_PromoteUnion_21144.getDefaultInstance();
         }

         public CR2S_PromoteUnion_21144 build() {
            CR2S_PromoteUnion_21144 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_PromoteUnion_21144 buildPartial() {
            CR2S_PromoteUnion_21144 result = new CR2S_PromoteUnion_21144(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_PromoteUnion_21144) {
               return this.mergeFrom((CR2S_PromoteUnion_21144)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_PromoteUnion_21144 other) {
            if (other == CrossCoreWarMsg.CR2S_PromoteUnion_21144.getDefaultInstance()) {
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
            CR2S_PromoteUnion_21144 parsedMessage = null;

            try {
               parsedMessage = (CR2S_PromoteUnion_21144)CrossCoreWarMsg.CR2S_PromoteUnion_21144.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_PromoteUnion_21144)e.getUnfinishedMessage();
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

   public static final class S2CR_SynchronizeOpen_21145 extends GeneratedMessageV3 implements S2CR_SynchronizeOpen_21145OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MODELGROUP_FIELD_NUMBER = 1;
      private int modelGroup_;
      public static final int OPENTIMESTAMP_FIELD_NUMBER = 2;
      private long openTimestamp_;
      private byte memoizedIsInitialized;
      private static final S2CR_SynchronizeOpen_21145 DEFAULT_INSTANCE = new S2CR_SynchronizeOpen_21145();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_SynchronizeOpen_21145> PARSER = new AbstractParser<S2CR_SynchronizeOpen_21145>() {
         public S2CR_SynchronizeOpen_21145 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_SynchronizeOpen_21145(input, extensionRegistry);
         }
      };

      private S2CR_SynchronizeOpen_21145(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_SynchronizeOpen_21145() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_SynchronizeOpen_21145();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_SynchronizeOpen_21145(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.modelGroup_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.openTimestamp_ = input.readInt64();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_SynchronizeOpen_21145_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_SynchronizeOpen_21145_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_SynchronizeOpen_21145.class, Builder.class);
      }

      public boolean hasModelGroup() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getModelGroup() {
         return this.modelGroup_;
      }

      public boolean hasOpenTimestamp() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getOpenTimestamp() {
         return this.openTimestamp_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasModelGroup()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOpenTimestamp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.modelGroup_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.openTimestamp_);
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
               size += CodedOutputStream.computeInt32Size(1, this.modelGroup_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(2, this.openTimestamp_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_SynchronizeOpen_21145)) {
            return super.equals(obj);
         } else {
            S2CR_SynchronizeOpen_21145 other = (S2CR_SynchronizeOpen_21145)obj;
            if (this.hasModelGroup() != other.hasModelGroup()) {
               return false;
            } else if (this.hasModelGroup() && this.getModelGroup() != other.getModelGroup()) {
               return false;
            } else if (this.hasOpenTimestamp() != other.hasOpenTimestamp()) {
               return false;
            } else if (this.hasOpenTimestamp() && this.getOpenTimestamp() != other.getOpenTimestamp()) {
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
            if (this.hasModelGroup()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getModelGroup();
            }

            if (this.hasOpenTimestamp()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getOpenTimestamp());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_SynchronizeOpen_21145 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_SynchronizeOpen_21145)PARSER.parseFrom(data);
      }

      public static S2CR_SynchronizeOpen_21145 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SynchronizeOpen_21145)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SynchronizeOpen_21145 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_SynchronizeOpen_21145)PARSER.parseFrom(data);
      }

      public static S2CR_SynchronizeOpen_21145 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SynchronizeOpen_21145)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SynchronizeOpen_21145 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_SynchronizeOpen_21145)PARSER.parseFrom(data);
      }

      public static S2CR_SynchronizeOpen_21145 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SynchronizeOpen_21145)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SynchronizeOpen_21145 parseFrom(InputStream input) throws IOException {
         return (S2CR_SynchronizeOpen_21145)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_SynchronizeOpen_21145 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SynchronizeOpen_21145)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_SynchronizeOpen_21145 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_SynchronizeOpen_21145)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_SynchronizeOpen_21145 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SynchronizeOpen_21145)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_SynchronizeOpen_21145 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_SynchronizeOpen_21145)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_SynchronizeOpen_21145 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SynchronizeOpen_21145)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_SynchronizeOpen_21145 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_SynchronizeOpen_21145 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_SynchronizeOpen_21145> parser() {
         return PARSER;
      }

      public Parser<S2CR_SynchronizeOpen_21145> getParserForType() {
         return PARSER;
      }

      public S2CR_SynchronizeOpen_21145 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_SynchronizeOpen_21145OrBuilder {
         private int bitField0_;
         private int modelGroup_;
         private long openTimestamp_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_SynchronizeOpen_21145_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_SynchronizeOpen_21145_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_SynchronizeOpen_21145.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.S2CR_SynchronizeOpen_21145.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.modelGroup_ = 0;
            this.bitField0_ &= -2;
            this.openTimestamp_ = 0L;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_SynchronizeOpen_21145_descriptor;
         }

         public S2CR_SynchronizeOpen_21145 getDefaultInstanceForType() {
            return CrossCoreWarMsg.S2CR_SynchronizeOpen_21145.getDefaultInstance();
         }

         public S2CR_SynchronizeOpen_21145 build() {
            S2CR_SynchronizeOpen_21145 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_SynchronizeOpen_21145 buildPartial() {
            S2CR_SynchronizeOpen_21145 result = new S2CR_SynchronizeOpen_21145(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.modelGroup_ = this.modelGroup_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.openTimestamp_ = this.openTimestamp_;
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
            if (other instanceof S2CR_SynchronizeOpen_21145) {
               return this.mergeFrom((S2CR_SynchronizeOpen_21145)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_SynchronizeOpen_21145 other) {
            if (other == CrossCoreWarMsg.S2CR_SynchronizeOpen_21145.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasModelGroup()) {
                  this.setModelGroup(other.getModelGroup());
               }

               if (other.hasOpenTimestamp()) {
                  this.setOpenTimestamp(other.getOpenTimestamp());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasModelGroup()) {
               return false;
            } else {
               return this.hasOpenTimestamp();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_SynchronizeOpen_21145 parsedMessage = null;

            try {
               parsedMessage = (S2CR_SynchronizeOpen_21145)CrossCoreWarMsg.S2CR_SynchronizeOpen_21145.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_SynchronizeOpen_21145)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasModelGroup() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getModelGroup() {
            return this.modelGroup_;
         }

         public Builder setModelGroup(int value) {
            this.bitField0_ |= 1;
            this.modelGroup_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModelGroup() {
            this.bitField0_ &= -2;
            this.modelGroup_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOpenTimestamp() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getOpenTimestamp() {
            return this.openTimestamp_;
         }

         public Builder setOpenTimestamp(long value) {
            this.bitField0_ |= 2;
            this.openTimestamp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpenTimestamp() {
            this.bitField0_ &= -3;
            this.openTimestamp_ = 0L;
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

   public static final class CR2S_SynchronizeOpen_21146 extends GeneratedMessageV3 implements CR2S_SynchronizeOpen_21146OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FIRSTOPENTIME_FIELD_NUMBER = 1;
      private int firstOpenTime_;
      public static final int SECONDOPENTIME_FIELD_NUMBER = 2;
      private int secondOpenTime_;
      public static final int ENDTIME_FIELD_NUMBER = 3;
      private int endTime_;
      public static final int STAGE_FIELD_NUMBER = 4;
      private int stage_;
      public static final int SUBSTATE_FIELD_NUMBER = 5;
      private int subState_;
      public static final int MODELGROUP_FIELD_NUMBER = 6;
      private int modelGroup_;
      public static final int ISCONNECT_FIELD_NUMBER = 7;
      private boolean isConnect_;
      public static final int ISOPEN_FIELD_NUMBER = 8;
      private boolean isOpen_;
      private byte memoizedIsInitialized;
      private static final CR2S_SynchronizeOpen_21146 DEFAULT_INSTANCE = new CR2S_SynchronizeOpen_21146();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_SynchronizeOpen_21146> PARSER = new AbstractParser<CR2S_SynchronizeOpen_21146>() {
         public CR2S_SynchronizeOpen_21146 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_SynchronizeOpen_21146(input, extensionRegistry);
         }
      };

      private CR2S_SynchronizeOpen_21146(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_SynchronizeOpen_21146() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_SynchronizeOpen_21146();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_SynchronizeOpen_21146(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.firstOpenTime_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.secondOpenTime_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.endTime_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.stage_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.subState_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.modelGroup_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.isConnect_ = input.readBool();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.isOpen_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SynchronizeOpen_21146_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SynchronizeOpen_21146_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_SynchronizeOpen_21146.class, Builder.class);
      }

      public boolean hasFirstOpenTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFirstOpenTime() {
         return this.firstOpenTime_;
      }

      public boolean hasSecondOpenTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSecondOpenTime() {
         return this.secondOpenTime_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public boolean hasStage() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public boolean hasSubState() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getSubState() {
         return this.subState_;
      }

      public boolean hasModelGroup() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getModelGroup() {
         return this.modelGroup_;
      }

      public boolean hasIsConnect() {
         return (this.bitField0_ & 64) != 0;
      }

      public boolean getIsConnect() {
         return this.isConnect_;
      }

      public boolean hasIsOpen() {
         return (this.bitField0_ & 128) != 0;
      }

      public boolean getIsOpen() {
         return this.isOpen_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIsOpen()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.firstOpenTime_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.secondOpenTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.endTime_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.stage_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.subState_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.modelGroup_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeBool(7, this.isConnect_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeBool(8, this.isOpen_);
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
               size += CodedOutputStream.computeInt32Size(1, this.firstOpenTime_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.secondOpenTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.endTime_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.stage_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.subState_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.modelGroup_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeBoolSize(7, this.isConnect_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeBoolSize(8, this.isOpen_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_SynchronizeOpen_21146)) {
            return super.equals(obj);
         } else {
            CR2S_SynchronizeOpen_21146 other = (CR2S_SynchronizeOpen_21146)obj;
            if (this.hasFirstOpenTime() != other.hasFirstOpenTime()) {
               return false;
            } else if (this.hasFirstOpenTime() && this.getFirstOpenTime() != other.getFirstOpenTime()) {
               return false;
            } else if (this.hasSecondOpenTime() != other.hasSecondOpenTime()) {
               return false;
            } else if (this.hasSecondOpenTime() && this.getSecondOpenTime() != other.getSecondOpenTime()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else if (this.hasSubState() != other.hasSubState()) {
               return false;
            } else if (this.hasSubState() && this.getSubState() != other.getSubState()) {
               return false;
            } else if (this.hasModelGroup() != other.hasModelGroup()) {
               return false;
            } else if (this.hasModelGroup() && this.getModelGroup() != other.getModelGroup()) {
               return false;
            } else if (this.hasIsConnect() != other.hasIsConnect()) {
               return false;
            } else if (this.hasIsConnect() && this.getIsConnect() != other.getIsConnect()) {
               return false;
            } else if (this.hasIsOpen() != other.hasIsOpen()) {
               return false;
            } else if (this.hasIsOpen() && this.getIsOpen() != other.getIsOpen()) {
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
            if (this.hasFirstOpenTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFirstOpenTime();
            }

            if (this.hasSecondOpenTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSecondOpenTime();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.hasStage()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getStage();
            }

            if (this.hasSubState()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getSubState();
            }

            if (this.hasModelGroup()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getModelGroup();
            }

            if (this.hasIsConnect()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + Internal.hashBoolean(this.getIsConnect());
            }

            if (this.hasIsOpen()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + Internal.hashBoolean(this.getIsOpen());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_SynchronizeOpen_21146 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_SynchronizeOpen_21146)PARSER.parseFrom(data);
      }

      public static CR2S_SynchronizeOpen_21146 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_SynchronizeOpen_21146)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_SynchronizeOpen_21146 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_SynchronizeOpen_21146)PARSER.parseFrom(data);
      }

      public static CR2S_SynchronizeOpen_21146 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_SynchronizeOpen_21146)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_SynchronizeOpen_21146 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_SynchronizeOpen_21146)PARSER.parseFrom(data);
      }

      public static CR2S_SynchronizeOpen_21146 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_SynchronizeOpen_21146)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_SynchronizeOpen_21146 parseFrom(InputStream input) throws IOException {
         return (CR2S_SynchronizeOpen_21146)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_SynchronizeOpen_21146 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_SynchronizeOpen_21146)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_SynchronizeOpen_21146 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_SynchronizeOpen_21146)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_SynchronizeOpen_21146 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_SynchronizeOpen_21146)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_SynchronizeOpen_21146 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_SynchronizeOpen_21146)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_SynchronizeOpen_21146 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_SynchronizeOpen_21146)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_SynchronizeOpen_21146 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_SynchronizeOpen_21146 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_SynchronizeOpen_21146> parser() {
         return PARSER;
      }

      public Parser<CR2S_SynchronizeOpen_21146> getParserForType() {
         return PARSER;
      }

      public CR2S_SynchronizeOpen_21146 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_SynchronizeOpen_21146OrBuilder {
         private int bitField0_;
         private int firstOpenTime_;
         private int secondOpenTime_;
         private int endTime_;
         private int stage_;
         private int subState_;
         private int modelGroup_;
         private boolean isConnect_;
         private boolean isOpen_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SynchronizeOpen_21146_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SynchronizeOpen_21146_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_SynchronizeOpen_21146.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.CR2S_SynchronizeOpen_21146.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.firstOpenTime_ = 0;
            this.bitField0_ &= -2;
            this.secondOpenTime_ = 0;
            this.bitField0_ &= -3;
            this.endTime_ = 0;
            this.bitField0_ &= -5;
            this.stage_ = 0;
            this.bitField0_ &= -9;
            this.subState_ = 0;
            this.bitField0_ &= -17;
            this.modelGroup_ = 0;
            this.bitField0_ &= -33;
            this.isConnect_ = false;
            this.bitField0_ &= -65;
            this.isOpen_ = false;
            this.bitField0_ &= -129;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SynchronizeOpen_21146_descriptor;
         }

         public CR2S_SynchronizeOpen_21146 getDefaultInstanceForType() {
            return CrossCoreWarMsg.CR2S_SynchronizeOpen_21146.getDefaultInstance();
         }

         public CR2S_SynchronizeOpen_21146 build() {
            CR2S_SynchronizeOpen_21146 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_SynchronizeOpen_21146 buildPartial() {
            CR2S_SynchronizeOpen_21146 result = new CR2S_SynchronizeOpen_21146(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.firstOpenTime_ = this.firstOpenTime_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.secondOpenTime_ = this.secondOpenTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.stage_ = this.stage_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.subState_ = this.subState_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.modelGroup_ = this.modelGroup_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.isConnect_ = this.isConnect_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.isOpen_ = this.isOpen_;
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
            if (other instanceof CR2S_SynchronizeOpen_21146) {
               return this.mergeFrom((CR2S_SynchronizeOpen_21146)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_SynchronizeOpen_21146 other) {
            if (other == CrossCoreWarMsg.CR2S_SynchronizeOpen_21146.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFirstOpenTime()) {
                  this.setFirstOpenTime(other.getFirstOpenTime());
               }

               if (other.hasSecondOpenTime()) {
                  this.setSecondOpenTime(other.getSecondOpenTime());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               if (other.hasSubState()) {
                  this.setSubState(other.getSubState());
               }

               if (other.hasModelGroup()) {
                  this.setModelGroup(other.getModelGroup());
               }

               if (other.hasIsConnect()) {
                  this.setIsConnect(other.getIsConnect());
               }

               if (other.hasIsOpen()) {
                  this.setIsOpen(other.getIsOpen());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasIsOpen();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_SynchronizeOpen_21146 parsedMessage = null;

            try {
               parsedMessage = (CR2S_SynchronizeOpen_21146)CrossCoreWarMsg.CR2S_SynchronizeOpen_21146.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_SynchronizeOpen_21146)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFirstOpenTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFirstOpenTime() {
            return this.firstOpenTime_;
         }

         public Builder setFirstOpenTime(int value) {
            this.bitField0_ |= 1;
            this.firstOpenTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFirstOpenTime() {
            this.bitField0_ &= -2;
            this.firstOpenTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSecondOpenTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSecondOpenTime() {
            return this.secondOpenTime_;
         }

         public Builder setSecondOpenTime(int value) {
            this.bitField0_ |= 2;
            this.secondOpenTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSecondOpenTime() {
            this.bitField0_ &= -3;
            this.secondOpenTime_ = 0;
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

         public boolean hasStage() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 8;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -9;
            this.stage_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSubState() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getSubState() {
            return this.subState_;
         }

         public Builder setSubState(int value) {
            this.bitField0_ |= 16;
            this.subState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSubState() {
            this.bitField0_ &= -17;
            this.subState_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasModelGroup() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getModelGroup() {
            return this.modelGroup_;
         }

         public Builder setModelGroup(int value) {
            this.bitField0_ |= 32;
            this.modelGroup_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModelGroup() {
            this.bitField0_ &= -33;
            this.modelGroup_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsConnect() {
            return (this.bitField0_ & 64) != 0;
         }

         public boolean getIsConnect() {
            return this.isConnect_;
         }

         public Builder setIsConnect(boolean value) {
            this.bitField0_ |= 64;
            this.isConnect_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsConnect() {
            this.bitField0_ &= -65;
            this.isConnect_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasIsOpen() {
            return (this.bitField0_ & 128) != 0;
         }

         public boolean getIsOpen() {
            return this.isOpen_;
         }

         public Builder setIsOpen(boolean value) {
            this.bitField0_ |= 128;
            this.isOpen_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsOpen() {
            this.bitField0_ &= -129;
            this.isOpen_ = false;
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

   public static final class CR2S_SendBossReward_21148 extends GeneratedMessageV3 implements CR2S_SendBossReward_21148OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DELETEDATA_FIELD_NUMBER = 1;
      private boolean deleteData_;
      private byte memoizedIsInitialized;
      private static final CR2S_SendBossReward_21148 DEFAULT_INSTANCE = new CR2S_SendBossReward_21148();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_SendBossReward_21148> PARSER = new AbstractParser<CR2S_SendBossReward_21148>() {
         public CR2S_SendBossReward_21148 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_SendBossReward_21148(input, extensionRegistry);
         }
      };

      private CR2S_SendBossReward_21148(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_SendBossReward_21148() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_SendBossReward_21148();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_SendBossReward_21148(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.deleteData_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SendBossReward_21148_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SendBossReward_21148_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_SendBossReward_21148.class, Builder.class);
      }

      public boolean hasDeleteData() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getDeleteData() {
         return this.deleteData_;
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
            output.writeBool(1, this.deleteData_);
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
               size += CodedOutputStream.computeBoolSize(1, this.deleteData_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_SendBossReward_21148)) {
            return super.equals(obj);
         } else {
            CR2S_SendBossReward_21148 other = (CR2S_SendBossReward_21148)obj;
            if (this.hasDeleteData() != other.hasDeleteData()) {
               return false;
            } else if (this.hasDeleteData() && this.getDeleteData() != other.getDeleteData()) {
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
            if (this.hasDeleteData()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getDeleteData());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_SendBossReward_21148 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_SendBossReward_21148)PARSER.parseFrom(data);
      }

      public static CR2S_SendBossReward_21148 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_SendBossReward_21148)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_SendBossReward_21148 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_SendBossReward_21148)PARSER.parseFrom(data);
      }

      public static CR2S_SendBossReward_21148 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_SendBossReward_21148)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_SendBossReward_21148 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_SendBossReward_21148)PARSER.parseFrom(data);
      }

      public static CR2S_SendBossReward_21148 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_SendBossReward_21148)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_SendBossReward_21148 parseFrom(InputStream input) throws IOException {
         return (CR2S_SendBossReward_21148)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_SendBossReward_21148 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_SendBossReward_21148)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_SendBossReward_21148 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_SendBossReward_21148)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_SendBossReward_21148 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_SendBossReward_21148)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_SendBossReward_21148 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_SendBossReward_21148)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_SendBossReward_21148 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_SendBossReward_21148)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_SendBossReward_21148 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_SendBossReward_21148 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_SendBossReward_21148> parser() {
         return PARSER;
      }

      public Parser<CR2S_SendBossReward_21148> getParserForType() {
         return PARSER;
      }

      public CR2S_SendBossReward_21148 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_SendBossReward_21148OrBuilder {
         private int bitField0_;
         private boolean deleteData_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SendBossReward_21148_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SendBossReward_21148_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_SendBossReward_21148.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.CR2S_SendBossReward_21148.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.deleteData_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_SendBossReward_21148_descriptor;
         }

         public CR2S_SendBossReward_21148 getDefaultInstanceForType() {
            return CrossCoreWarMsg.CR2S_SendBossReward_21148.getDefaultInstance();
         }

         public CR2S_SendBossReward_21148 build() {
            CR2S_SendBossReward_21148 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_SendBossReward_21148 buildPartial() {
            CR2S_SendBossReward_21148 result = new CR2S_SendBossReward_21148(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.deleteData_ = this.deleteData_;
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
            if (other instanceof CR2S_SendBossReward_21148) {
               return this.mergeFrom((CR2S_SendBossReward_21148)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_SendBossReward_21148 other) {
            if (other == CrossCoreWarMsg.CR2S_SendBossReward_21148.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDeleteData()) {
                  this.setDeleteData(other.getDeleteData());
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
            CR2S_SendBossReward_21148 parsedMessage = null;

            try {
               parsedMessage = (CR2S_SendBossReward_21148)CrossCoreWarMsg.CR2S_SendBossReward_21148.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_SendBossReward_21148)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDeleteData() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getDeleteData() {
            return this.deleteData_;
         }

         public Builder setDeleteData(boolean value) {
            this.bitField0_ |= 1;
            this.deleteData_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDeleteData() {
            this.bitField0_ &= -2;
            this.deleteData_ = false;
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

   public static final class S2CR_ChangeMove_21151 extends GeneratedMessageV3 implements S2CR_ChangeMove_21151OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      private byte memoizedIsInitialized;
      private static final S2CR_ChangeMove_21151 DEFAULT_INSTANCE = new S2CR_ChangeMove_21151();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_ChangeMove_21151> PARSER = new AbstractParser<S2CR_ChangeMove_21151>() {
         public S2CR_ChangeMove_21151 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_ChangeMove_21151(input, extensionRegistry);
         }
      };

      private S2CR_ChangeMove_21151(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_ChangeMove_21151() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_ChangeMove_21151();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_ChangeMove_21151(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ChangeMove_21151_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ChangeMove_21151_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ChangeMove_21151.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_ChangeMove_21151)) {
            return super.equals(obj);
         } else {
            S2CR_ChangeMove_21151 other = (S2CR_ChangeMove_21151)obj;
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

      public static S2CR_ChangeMove_21151 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_ChangeMove_21151)PARSER.parseFrom(data);
      }

      public static S2CR_ChangeMove_21151 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ChangeMove_21151)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ChangeMove_21151 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_ChangeMove_21151)PARSER.parseFrom(data);
      }

      public static S2CR_ChangeMove_21151 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ChangeMove_21151)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ChangeMove_21151 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_ChangeMove_21151)PARSER.parseFrom(data);
      }

      public static S2CR_ChangeMove_21151 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ChangeMove_21151)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ChangeMove_21151 parseFrom(InputStream input) throws IOException {
         return (S2CR_ChangeMove_21151)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ChangeMove_21151 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ChangeMove_21151)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ChangeMove_21151 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_ChangeMove_21151)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_ChangeMove_21151 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ChangeMove_21151)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ChangeMove_21151 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_ChangeMove_21151)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ChangeMove_21151 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ChangeMove_21151)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_ChangeMove_21151 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_ChangeMove_21151 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_ChangeMove_21151> parser() {
         return PARSER;
      }

      public Parser<S2CR_ChangeMove_21151> getParserForType() {
         return PARSER;
      }

      public S2CR_ChangeMove_21151 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_ChangeMove_21151OrBuilder {
         private int bitField0_;
         private int grid_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ChangeMove_21151_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ChangeMove_21151_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ChangeMove_21151.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.S2CR_ChangeMove_21151.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_ChangeMove_21151_descriptor;
         }

         public S2CR_ChangeMove_21151 getDefaultInstanceForType() {
            return CrossCoreWarMsg.S2CR_ChangeMove_21151.getDefaultInstance();
         }

         public S2CR_ChangeMove_21151 build() {
            S2CR_ChangeMove_21151 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_ChangeMove_21151 buildPartial() {
            S2CR_ChangeMove_21151 result = new S2CR_ChangeMove_21151(this);
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
            if (other instanceof S2CR_ChangeMove_21151) {
               return this.mergeFrom((S2CR_ChangeMove_21151)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_ChangeMove_21151 other) {
            if (other == CrossCoreWarMsg.S2CR_ChangeMove_21151.getDefaultInstance()) {
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
            S2CR_ChangeMove_21151 parsedMessage = null;

            try {
               parsedMessage = (S2CR_ChangeMove_21151)CrossCoreWarMsg.S2CR_ChangeMove_21151.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_ChangeMove_21151)e.getUnfinishedMessage();
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

   public static final class CR2S_Termination_21154 extends GeneratedMessageV3 implements CR2S_Termination_21154OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final CR2S_Termination_21154 DEFAULT_INSTANCE = new CR2S_Termination_21154();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_Termination_21154> PARSER = new AbstractParser<CR2S_Termination_21154>() {
         public CR2S_Termination_21154 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_Termination_21154(input, extensionRegistry);
         }
      };

      private CR2S_Termination_21154(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_Termination_21154() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_Termination_21154();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_Termination_21154(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Termination_21154_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Termination_21154_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Termination_21154.class, Builder.class);
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
         } else if (!(obj instanceof CR2S_Termination_21154)) {
            return super.equals(obj);
         } else {
            CR2S_Termination_21154 other = (CR2S_Termination_21154)obj;
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

      public static CR2S_Termination_21154 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_Termination_21154)PARSER.parseFrom(data);
      }

      public static CR2S_Termination_21154 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Termination_21154)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Termination_21154 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_Termination_21154)PARSER.parseFrom(data);
      }

      public static CR2S_Termination_21154 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Termination_21154)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Termination_21154 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_Termination_21154)PARSER.parseFrom(data);
      }

      public static CR2S_Termination_21154 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Termination_21154)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Termination_21154 parseFrom(InputStream input) throws IOException {
         return (CR2S_Termination_21154)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Termination_21154 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Termination_21154)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Termination_21154 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_Termination_21154)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_Termination_21154 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Termination_21154)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Termination_21154 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_Termination_21154)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Termination_21154 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Termination_21154)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_Termination_21154 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_Termination_21154 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_Termination_21154> parser() {
         return PARSER;
      }

      public Parser<CR2S_Termination_21154> getParserForType() {
         return PARSER;
      }

      public CR2S_Termination_21154 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_Termination_21154OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Termination_21154_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Termination_21154_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Termination_21154.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.CR2S_Termination_21154.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_Termination_21154_descriptor;
         }

         public CR2S_Termination_21154 getDefaultInstanceForType() {
            return CrossCoreWarMsg.CR2S_Termination_21154.getDefaultInstance();
         }

         public CR2S_Termination_21154 build() {
            CR2S_Termination_21154 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_Termination_21154 buildPartial() {
            CR2S_Termination_21154 result = new CR2S_Termination_21154(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_Termination_21154) {
               return this.mergeFrom((CR2S_Termination_21154)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_Termination_21154 other) {
            if (other == CrossCoreWarMsg.CR2S_Termination_21154.getDefaultInstance()) {
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
            CR2S_Termination_21154 parsedMessage = null;

            try {
               parsedMessage = (CR2S_Termination_21154)CrossCoreWarMsg.CR2S_Termination_21154.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_Termination_21154)e.getUnfinishedMessage();
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

   public static final class S2CR_EntranceInfo_21155 extends GeneratedMessageV3 implements S2CR_EntranceInfo_21155OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_EntranceInfo_21155 DEFAULT_INSTANCE = new S2CR_EntranceInfo_21155();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_EntranceInfo_21155> PARSER = new AbstractParser<S2CR_EntranceInfo_21155>() {
         public S2CR_EntranceInfo_21155 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_EntranceInfo_21155(input, extensionRegistry);
         }
      };

      private S2CR_EntranceInfo_21155(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_EntranceInfo_21155() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_EntranceInfo_21155();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_EntranceInfo_21155(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_EntranceInfo_21155_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_EntranceInfo_21155_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_EntranceInfo_21155.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_EntranceInfo_21155)) {
            return super.equals(obj);
         } else {
            S2CR_EntranceInfo_21155 other = (S2CR_EntranceInfo_21155)obj;
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

      public static S2CR_EntranceInfo_21155 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_EntranceInfo_21155)PARSER.parseFrom(data);
      }

      public static S2CR_EntranceInfo_21155 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_EntranceInfo_21155)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_EntranceInfo_21155 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_EntranceInfo_21155)PARSER.parseFrom(data);
      }

      public static S2CR_EntranceInfo_21155 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_EntranceInfo_21155)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_EntranceInfo_21155 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_EntranceInfo_21155)PARSER.parseFrom(data);
      }

      public static S2CR_EntranceInfo_21155 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_EntranceInfo_21155)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_EntranceInfo_21155 parseFrom(InputStream input) throws IOException {
         return (S2CR_EntranceInfo_21155)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_EntranceInfo_21155 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_EntranceInfo_21155)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_EntranceInfo_21155 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_EntranceInfo_21155)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_EntranceInfo_21155 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_EntranceInfo_21155)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_EntranceInfo_21155 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_EntranceInfo_21155)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_EntranceInfo_21155 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_EntranceInfo_21155)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_EntranceInfo_21155 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_EntranceInfo_21155 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_EntranceInfo_21155> parser() {
         return PARSER;
      }

      public Parser<S2CR_EntranceInfo_21155> getParserForType() {
         return PARSER;
      }

      public S2CR_EntranceInfo_21155 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_EntranceInfo_21155OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_EntranceInfo_21155_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_EntranceInfo_21155_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_EntranceInfo_21155.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.S2CR_EntranceInfo_21155.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_EntranceInfo_21155_descriptor;
         }

         public S2CR_EntranceInfo_21155 getDefaultInstanceForType() {
            return CrossCoreWarMsg.S2CR_EntranceInfo_21155.getDefaultInstance();
         }

         public S2CR_EntranceInfo_21155 build() {
            S2CR_EntranceInfo_21155 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_EntranceInfo_21155 buildPartial() {
            S2CR_EntranceInfo_21155 result = new S2CR_EntranceInfo_21155(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_EntranceInfo_21155) {
               return this.mergeFrom((S2CR_EntranceInfo_21155)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_EntranceInfo_21155 other) {
            if (other == CrossCoreWarMsg.S2CR_EntranceInfo_21155.getDefaultInstance()) {
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
            S2CR_EntranceInfo_21155 parsedMessage = null;

            try {
               parsedMessage = (S2CR_EntranceInfo_21155)CrossCoreWarMsg.S2CR_EntranceInfo_21155.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_EntranceInfo_21155)e.getUnfinishedMessage();
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

   public static final class CR2S_EntranceInfo_21156 extends GeneratedMessageV3 implements CR2S_EntranceInfo_21156OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STATE_FIELD_NUMBER = 1;
      private boolean state_;
      private byte memoizedIsInitialized;
      private static final CR2S_EntranceInfo_21156 DEFAULT_INSTANCE = new CR2S_EntranceInfo_21156();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_EntranceInfo_21156> PARSER = new AbstractParser<CR2S_EntranceInfo_21156>() {
         public CR2S_EntranceInfo_21156 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_EntranceInfo_21156(input, extensionRegistry);
         }
      };

      private CR2S_EntranceInfo_21156(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_EntranceInfo_21156() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_EntranceInfo_21156();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_EntranceInfo_21156(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.state_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_EntranceInfo_21156_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_EntranceInfo_21156_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_EntranceInfo_21156.class, Builder.class);
      }

      public boolean hasState() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getState() {
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
            output.writeBool(1, this.state_);
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
               size += CodedOutputStream.computeBoolSize(1, this.state_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_EntranceInfo_21156)) {
            return super.equals(obj);
         } else {
            CR2S_EntranceInfo_21156 other = (CR2S_EntranceInfo_21156)obj;
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
               hash = 53 * hash + Internal.hashBoolean(this.getState());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_EntranceInfo_21156 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_EntranceInfo_21156)PARSER.parseFrom(data);
      }

      public static CR2S_EntranceInfo_21156 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_EntranceInfo_21156)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_EntranceInfo_21156 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_EntranceInfo_21156)PARSER.parseFrom(data);
      }

      public static CR2S_EntranceInfo_21156 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_EntranceInfo_21156)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_EntranceInfo_21156 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_EntranceInfo_21156)PARSER.parseFrom(data);
      }

      public static CR2S_EntranceInfo_21156 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_EntranceInfo_21156)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_EntranceInfo_21156 parseFrom(InputStream input) throws IOException {
         return (CR2S_EntranceInfo_21156)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_EntranceInfo_21156 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_EntranceInfo_21156)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_EntranceInfo_21156 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_EntranceInfo_21156)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_EntranceInfo_21156 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_EntranceInfo_21156)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_EntranceInfo_21156 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_EntranceInfo_21156)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_EntranceInfo_21156 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_EntranceInfo_21156)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_EntranceInfo_21156 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_EntranceInfo_21156 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_EntranceInfo_21156> parser() {
         return PARSER;
      }

      public Parser<CR2S_EntranceInfo_21156> getParserForType() {
         return PARSER;
      }

      public CR2S_EntranceInfo_21156 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_EntranceInfo_21156OrBuilder {
         private int bitField0_;
         private boolean state_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_EntranceInfo_21156_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_EntranceInfo_21156_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_EntranceInfo_21156.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.CR2S_EntranceInfo_21156.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.state_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_EntranceInfo_21156_descriptor;
         }

         public CR2S_EntranceInfo_21156 getDefaultInstanceForType() {
            return CrossCoreWarMsg.CR2S_EntranceInfo_21156.getDefaultInstance();
         }

         public CR2S_EntranceInfo_21156 build() {
            CR2S_EntranceInfo_21156 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_EntranceInfo_21156 buildPartial() {
            CR2S_EntranceInfo_21156 result = new CR2S_EntranceInfo_21156(this);
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
            if (other instanceof CR2S_EntranceInfo_21156) {
               return this.mergeFrom((CR2S_EntranceInfo_21156)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_EntranceInfo_21156 other) {
            if (other == CrossCoreWarMsg.CR2S_EntranceInfo_21156.getDefaultInstance()) {
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
            CR2S_EntranceInfo_21156 parsedMessage = null;

            try {
               parsedMessage = (CR2S_EntranceInfo_21156)CrossCoreWarMsg.CR2S_EntranceInfo_21156.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_EntranceInfo_21156)e.getUnfinishedMessage();
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

         public boolean getState() {
            return this.state_;
         }

         public Builder setState(boolean value) {
            this.bitField0_ |= 1;
            this.state_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearState() {
            this.bitField0_ &= -2;
            this.state_ = false;
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

   public static final class S2CR_EarliestOpenDay_21157 extends GeneratedMessageV3 implements S2CR_EarliestOpenDay_21157OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_EarliestOpenDay_21157 DEFAULT_INSTANCE = new S2CR_EarliestOpenDay_21157();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_EarliestOpenDay_21157> PARSER = new AbstractParser<S2CR_EarliestOpenDay_21157>() {
         public S2CR_EarliestOpenDay_21157 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_EarliestOpenDay_21157(input, extensionRegistry);
         }
      };

      private S2CR_EarliestOpenDay_21157(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_EarliestOpenDay_21157() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_EarliestOpenDay_21157();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_EarliestOpenDay_21157(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_EarliestOpenDay_21157_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_EarliestOpenDay_21157_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_EarliestOpenDay_21157.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_EarliestOpenDay_21157)) {
            return super.equals(obj);
         } else {
            S2CR_EarliestOpenDay_21157 other = (S2CR_EarliestOpenDay_21157)obj;
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

      public static S2CR_EarliestOpenDay_21157 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_EarliestOpenDay_21157)PARSER.parseFrom(data);
      }

      public static S2CR_EarliestOpenDay_21157 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_EarliestOpenDay_21157)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_EarliestOpenDay_21157 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_EarliestOpenDay_21157)PARSER.parseFrom(data);
      }

      public static S2CR_EarliestOpenDay_21157 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_EarliestOpenDay_21157)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_EarliestOpenDay_21157 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_EarliestOpenDay_21157)PARSER.parseFrom(data);
      }

      public static S2CR_EarliestOpenDay_21157 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_EarliestOpenDay_21157)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_EarliestOpenDay_21157 parseFrom(InputStream input) throws IOException {
         return (S2CR_EarliestOpenDay_21157)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_EarliestOpenDay_21157 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_EarliestOpenDay_21157)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_EarliestOpenDay_21157 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_EarliestOpenDay_21157)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_EarliestOpenDay_21157 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_EarliestOpenDay_21157)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_EarliestOpenDay_21157 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_EarliestOpenDay_21157)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_EarliestOpenDay_21157 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_EarliestOpenDay_21157)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_EarliestOpenDay_21157 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_EarliestOpenDay_21157 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_EarliestOpenDay_21157> parser() {
         return PARSER;
      }

      public Parser<S2CR_EarliestOpenDay_21157> getParserForType() {
         return PARSER;
      }

      public S2CR_EarliestOpenDay_21157 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_EarliestOpenDay_21157OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_EarliestOpenDay_21157_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_EarliestOpenDay_21157_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_EarliestOpenDay_21157.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.S2CR_EarliestOpenDay_21157.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_EarliestOpenDay_21157_descriptor;
         }

         public S2CR_EarliestOpenDay_21157 getDefaultInstanceForType() {
            return CrossCoreWarMsg.S2CR_EarliestOpenDay_21157.getDefaultInstance();
         }

         public S2CR_EarliestOpenDay_21157 build() {
            S2CR_EarliestOpenDay_21157 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_EarliestOpenDay_21157 buildPartial() {
            S2CR_EarliestOpenDay_21157 result = new S2CR_EarliestOpenDay_21157(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_EarliestOpenDay_21157) {
               return this.mergeFrom((S2CR_EarliestOpenDay_21157)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_EarliestOpenDay_21157 other) {
            if (other == CrossCoreWarMsg.S2CR_EarliestOpenDay_21157.getDefaultInstance()) {
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
            S2CR_EarliestOpenDay_21157 parsedMessage = null;

            try {
               parsedMessage = (S2CR_EarliestOpenDay_21157)CrossCoreWarMsg.S2CR_EarliestOpenDay_21157.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_EarliestOpenDay_21157)e.getUnfinishedMessage();
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

   public static final class CR2S_EarliestOpenDay_21158 extends GeneratedMessageV3 implements CR2S_EarliestOpenDay_21158OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OPENDAY_FIELD_NUMBER = 1;
      private int openDay_;
      private byte memoizedIsInitialized;
      private static final CR2S_EarliestOpenDay_21158 DEFAULT_INSTANCE = new CR2S_EarliestOpenDay_21158();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_EarliestOpenDay_21158> PARSER = new AbstractParser<CR2S_EarliestOpenDay_21158>() {
         public CR2S_EarliestOpenDay_21158 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_EarliestOpenDay_21158(input, extensionRegistry);
         }
      };

      private CR2S_EarliestOpenDay_21158(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_EarliestOpenDay_21158() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_EarliestOpenDay_21158();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_EarliestOpenDay_21158(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.openDay_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_EarliestOpenDay_21158_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_EarliestOpenDay_21158_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_EarliestOpenDay_21158.class, Builder.class);
      }

      public boolean hasOpenDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getOpenDay() {
         return this.openDay_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasOpenDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.openDay_);
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
               size += CodedOutputStream.computeInt32Size(1, this.openDay_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_EarliestOpenDay_21158)) {
            return super.equals(obj);
         } else {
            CR2S_EarliestOpenDay_21158 other = (CR2S_EarliestOpenDay_21158)obj;
            if (this.hasOpenDay() != other.hasOpenDay()) {
               return false;
            } else if (this.hasOpenDay() && this.getOpenDay() != other.getOpenDay()) {
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
            if (this.hasOpenDay()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOpenDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_EarliestOpenDay_21158 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_EarliestOpenDay_21158)PARSER.parseFrom(data);
      }

      public static CR2S_EarliestOpenDay_21158 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_EarliestOpenDay_21158)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_EarliestOpenDay_21158 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_EarliestOpenDay_21158)PARSER.parseFrom(data);
      }

      public static CR2S_EarliestOpenDay_21158 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_EarliestOpenDay_21158)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_EarliestOpenDay_21158 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_EarliestOpenDay_21158)PARSER.parseFrom(data);
      }

      public static CR2S_EarliestOpenDay_21158 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_EarliestOpenDay_21158)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_EarliestOpenDay_21158 parseFrom(InputStream input) throws IOException {
         return (CR2S_EarliestOpenDay_21158)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_EarliestOpenDay_21158 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_EarliestOpenDay_21158)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_EarliestOpenDay_21158 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_EarliestOpenDay_21158)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_EarliestOpenDay_21158 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_EarliestOpenDay_21158)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_EarliestOpenDay_21158 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_EarliestOpenDay_21158)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_EarliestOpenDay_21158 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_EarliestOpenDay_21158)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_EarliestOpenDay_21158 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_EarliestOpenDay_21158 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_EarliestOpenDay_21158> parser() {
         return PARSER;
      }

      public Parser<CR2S_EarliestOpenDay_21158> getParserForType() {
         return PARSER;
      }

      public CR2S_EarliestOpenDay_21158 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_EarliestOpenDay_21158OrBuilder {
         private int bitField0_;
         private int openDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_EarliestOpenDay_21158_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_EarliestOpenDay_21158_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_EarliestOpenDay_21158.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.CR2S_EarliestOpenDay_21158.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.openDay_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_EarliestOpenDay_21158_descriptor;
         }

         public CR2S_EarliestOpenDay_21158 getDefaultInstanceForType() {
            return CrossCoreWarMsg.CR2S_EarliestOpenDay_21158.getDefaultInstance();
         }

         public CR2S_EarliestOpenDay_21158 build() {
            CR2S_EarliestOpenDay_21158 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_EarliestOpenDay_21158 buildPartial() {
            CR2S_EarliestOpenDay_21158 result = new CR2S_EarliestOpenDay_21158(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.openDay_ = this.openDay_;
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
            if (other instanceof CR2S_EarliestOpenDay_21158) {
               return this.mergeFrom((CR2S_EarliestOpenDay_21158)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_EarliestOpenDay_21158 other) {
            if (other == CrossCoreWarMsg.CR2S_EarliestOpenDay_21158.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOpenDay()) {
                  this.setOpenDay(other.getOpenDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasOpenDay();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_EarliestOpenDay_21158 parsedMessage = null;

            try {
               parsedMessage = (CR2S_EarliestOpenDay_21158)CrossCoreWarMsg.CR2S_EarliestOpenDay_21158.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_EarliestOpenDay_21158)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOpenDay() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getOpenDay() {
            return this.openDay_;
         }

         public Builder setOpenDay(int value) {
            this.bitField0_ |= 1;
            this.openDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpenDay() {
            this.bitField0_ &= -2;
            this.openDay_ = 0;
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

   public static final class S2CR_GM_21171 extends GeneratedMessageV3 implements S2CR_GM_21171OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STR_FIELD_NUMBER = 1;
      private volatile Object str_;
      private byte memoizedIsInitialized;
      private static final S2CR_GM_21171 DEFAULT_INSTANCE = new S2CR_GM_21171();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_GM_21171> PARSER = new AbstractParser<S2CR_GM_21171>() {
         public S2CR_GM_21171 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_GM_21171(input, extensionRegistry);
         }
      };

      private S2CR_GM_21171(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_GM_21171() {
         this.memoizedIsInitialized = -1;
         this.str_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_GM_21171();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_GM_21171(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.str_ = bs;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_GM_21171_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_GM_21171_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GM_21171.class, Builder.class);
      }

      public boolean hasStr() {
         return (this.bitField0_ & 1) != 0;
      }

      public String getStr() {
         Object ref = this.str_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.str_ = s;
            }

            return s;
         }
      }

      public ByteString getStrBytes() {
         Object ref = this.str_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.str_ = b;
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
         } else if (!this.hasStr()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.str_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.str_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_GM_21171)) {
            return super.equals(obj);
         } else {
            S2CR_GM_21171 other = (S2CR_GM_21171)obj;
            if (this.hasStr() != other.hasStr()) {
               return false;
            } else if (this.hasStr() && !this.getStr().equals(other.getStr())) {
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
            if (this.hasStr()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStr().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_GM_21171 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_GM_21171)PARSER.parseFrom(data);
      }

      public static S2CR_GM_21171 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GM_21171)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GM_21171 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_GM_21171)PARSER.parseFrom(data);
      }

      public static S2CR_GM_21171 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GM_21171)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GM_21171 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_GM_21171)PARSER.parseFrom(data);
      }

      public static S2CR_GM_21171 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GM_21171)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GM_21171 parseFrom(InputStream input) throws IOException {
         return (S2CR_GM_21171)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GM_21171 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GM_21171)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GM_21171 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_GM_21171)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_GM_21171 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GM_21171)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GM_21171 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_GM_21171)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GM_21171 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GM_21171)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_GM_21171 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_GM_21171 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_GM_21171> parser() {
         return PARSER;
      }

      public Parser<S2CR_GM_21171> getParserForType() {
         return PARSER;
      }

      public S2CR_GM_21171 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_GM_21171OrBuilder {
         private int bitField0_;
         private Object str_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_GM_21171_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_GM_21171_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GM_21171.class, Builder.class);
         }

         private Builder() {
            this.str_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.str_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.S2CR_GM_21171.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.str_ = "";
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_S2CR_GM_21171_descriptor;
         }

         public S2CR_GM_21171 getDefaultInstanceForType() {
            return CrossCoreWarMsg.S2CR_GM_21171.getDefaultInstance();
         }

         public S2CR_GM_21171 build() {
            S2CR_GM_21171 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_GM_21171 buildPartial() {
            S2CR_GM_21171 result = new S2CR_GM_21171(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.str_ = this.str_;
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
            if (other instanceof S2CR_GM_21171) {
               return this.mergeFrom((S2CR_GM_21171)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_GM_21171 other) {
            if (other == CrossCoreWarMsg.S2CR_GM_21171.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStr()) {
                  this.bitField0_ |= 1;
                  this.str_ = other.str_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasStr();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_GM_21171 parsedMessage = null;

            try {
               parsedMessage = (S2CR_GM_21171)CrossCoreWarMsg.S2CR_GM_21171.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_GM_21171)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStr() {
            return (this.bitField0_ & 1) != 0;
         }

         public String getStr() {
            Object ref = this.str_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.str_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getStrBytes() {
            Object ref = this.str_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.str_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setStr(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.str_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearStr() {
            this.bitField0_ &= -2;
            this.str_ = CrossCoreWarMsg.S2CR_GM_21171.getDefaultInstance().getStr();
            this.onChanged();
            return this;
         }

         public Builder setStrBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.str_ = value;
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

   public static final class CR2S_GM_21172 extends GeneratedMessageV3 implements CR2S_GM_21172OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STR_FIELD_NUMBER = 1;
      private volatile Object str_;
      private byte memoizedIsInitialized;
      private static final CR2S_GM_21172 DEFAULT_INSTANCE = new CR2S_GM_21172();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_GM_21172> PARSER = new AbstractParser<CR2S_GM_21172>() {
         public CR2S_GM_21172 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_GM_21172(input, extensionRegistry);
         }
      };

      private CR2S_GM_21172(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_GM_21172() {
         this.memoizedIsInitialized = -1;
         this.str_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_GM_21172();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_GM_21172(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.str_ = bs;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_GM_21172_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_GM_21172_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_GM_21172.class, Builder.class);
      }

      public boolean hasStr() {
         return (this.bitField0_ & 1) != 0;
      }

      public String getStr() {
         Object ref = this.str_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.str_ = s;
            }

            return s;
         }
      }

      public ByteString getStrBytes() {
         Object ref = this.str_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.str_ = b;
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
         } else if (!this.hasStr()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.str_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.str_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_GM_21172)) {
            return super.equals(obj);
         } else {
            CR2S_GM_21172 other = (CR2S_GM_21172)obj;
            if (this.hasStr() != other.hasStr()) {
               return false;
            } else if (this.hasStr() && !this.getStr().equals(other.getStr())) {
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
            if (this.hasStr()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStr().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_GM_21172 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_GM_21172)PARSER.parseFrom(data);
      }

      public static CR2S_GM_21172 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GM_21172)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GM_21172 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_GM_21172)PARSER.parseFrom(data);
      }

      public static CR2S_GM_21172 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GM_21172)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GM_21172 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_GM_21172)PARSER.parseFrom(data);
      }

      public static CR2S_GM_21172 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GM_21172)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GM_21172 parseFrom(InputStream input) throws IOException {
         return (CR2S_GM_21172)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_GM_21172 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GM_21172)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_GM_21172 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_GM_21172)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_GM_21172 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GM_21172)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_GM_21172 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_GM_21172)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_GM_21172 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GM_21172)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_GM_21172 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_GM_21172 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_GM_21172> parser() {
         return PARSER;
      }

      public Parser<CR2S_GM_21172> getParserForType() {
         return PARSER;
      }

      public CR2S_GM_21172 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_GM_21172OrBuilder {
         private int bitField0_;
         private Object str_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_GM_21172_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_GM_21172_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_GM_21172.class, Builder.class);
         }

         private Builder() {
            this.str_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.str_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossCoreWarMsg.CR2S_GM_21172.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.str_ = "";
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossCoreWarMsg.internal_static_crossCoreWar_com_gzbz_protobuf_CR2S_GM_21172_descriptor;
         }

         public CR2S_GM_21172 getDefaultInstanceForType() {
            return CrossCoreWarMsg.CR2S_GM_21172.getDefaultInstance();
         }

         public CR2S_GM_21172 build() {
            CR2S_GM_21172 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_GM_21172 buildPartial() {
            CR2S_GM_21172 result = new CR2S_GM_21172(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.str_ = this.str_;
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
            if (other instanceof CR2S_GM_21172) {
               return this.mergeFrom((CR2S_GM_21172)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_GM_21172 other) {
            if (other == CrossCoreWarMsg.CR2S_GM_21172.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStr()) {
                  this.bitField0_ |= 1;
                  this.str_ = other.str_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasStr();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_GM_21172 parsedMessage = null;

            try {
               parsedMessage = (CR2S_GM_21172)CrossCoreWarMsg.CR2S_GM_21172.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_GM_21172)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStr() {
            return (this.bitField0_ & 1) != 0;
         }

         public String getStr() {
            Object ref = this.str_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.str_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getStrBytes() {
            Object ref = this.str_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.str_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setStr(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.str_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearStr() {
            this.bitField0_ &= -2;
            this.str_ = CrossCoreWarMsg.CR2S_GM_21172.getDefaultInstance().getStr();
            this.onChanged();
            return this;
         }

         public Builder setStrBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.str_ = value;
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

   public interface CR2S_EarliestOpenDay_21158OrBuilder extends MessageOrBuilder {
      boolean hasOpenDay();

      int getOpenDay();
   }

   public interface CR2S_EntranceInfo_21156OrBuilder extends MessageOrBuilder {
      boolean hasState();

      boolean getState();
   }

   public interface CR2S_GM_21172OrBuilder extends MessageOrBuilder {
      boolean hasStr();

      String getStr();

      ByteString getStrBytes();
   }

   public interface CR2S_GameRank_21140OrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasUnionId();

      int getUnionId();

      boolean hasChapterId();

      int getChapterId();

      List<RankMsg.RankData> getRanksList();

      RankMsg.RankData getRanks(int index);

      int getRanksCount();

      List<? extends RankMsg.RankDataOrBuilder> getRanksOrBuilderList();

      RankMsg.RankDataOrBuilder getRanksOrBuilder(int index);
   }

   public interface CR2S_LogLamp_21120OrBuilder extends MessageOrBuilder {
      boolean hasMsg();

      MergeWarGameMsg.S2C_LogLamp_19534 getMsg();

      MergeWarGameMsg.S2C_LogLamp_19534OrBuilder getMsgOrBuilder();
   }

   public interface CR2S_Log_21118OrBuilder extends MessageOrBuilder {
      boolean hasMsg();

      MergeWarGameMsg.S2C_Log_19532 getMsg();

      MergeWarGameMsg.S2C_Log_19532OrBuilder getMsgOrBuilder();
   }

   public interface CR2S_Move_21104OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      List<Integer> getGridIdList();

      int getGridIdCount();

      int getGridId(int index);

      boolean hasTransfer();

      boolean getTransfer();

      boolean hasServerId();

      int getServerId();
   }

   public interface CR2S_PlayerArraying_21134OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();
   }

   public interface CR2S_PlayerEnter_21114OrBuilder extends MessageOrBuilder {
      boolean hasPlayerInfo();

      MergeWarGameMsg.PlayerInfo getPlayerInfo();

      MergeWarGameMsg.PlayerInfoOrBuilder getPlayerInfoOrBuilder();
   }

   public interface CR2S_PromoteUnion_21144OrBuilder extends MessageOrBuilder {
   }

   public interface CR2S_ScoreReward_21112OrBuilder extends MessageOrBuilder {
      boolean hasScoreId();

      int getScoreId();
   }

   public interface CR2S_SendBossReward_21148OrBuilder extends MessageOrBuilder {
      boolean hasDeleteData();

      boolean getDeleteData();
   }

   public interface CR2S_SetDestGrid_21122OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      List<Integer> getGridIdList();

      int getGridIdCount();

      int getGridId(int index);

      boolean hasPlayerId();

      int getPlayerId();
   }

   public interface CR2S_SynchronizeOpen_21146OrBuilder extends MessageOrBuilder {
      boolean hasFirstOpenTime();

      int getFirstOpenTime();

      boolean hasSecondOpenTime();

      int getSecondOpenTime();

      boolean hasEndTime();

      int getEndTime();

      boolean hasStage();

      int getStage();

      boolean hasSubState();

      int getSubState();

      boolean hasModelGroup();

      int getModelGroup();

      boolean hasIsConnect();

      boolean getIsConnect();

      boolean hasIsOpen();

      boolean getIsOpen();
   }

   public interface CR2S_Termination_21154OrBuilder extends MessageOrBuilder {
   }

   public interface CR2S_TriggerTask_21138OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasTargetType();

      int getTargetType();

      boolean hasTargetX();

      int getTargetX();

      boolean hasOpValue();

      long getOpValue();

      boolean hasOpType();

      int getOpType();
   }

   public interface CR2S_UnionCoreHurt_21116OrBuilder extends MessageOrBuilder {
      List<MergeWarGameMsg.UnionCoreDamageInfo> getInfoList();

      MergeWarGameMsg.UnionCoreDamageInfo getInfo(int index);

      int getInfoCount();

      List<? extends MergeWarGameMsg.UnionCoreDamageInfoOrBuilder> getInfoOrBuilderList();

      MergeWarGameMsg.UnionCoreDamageInfoOrBuilder getInfoOrBuilder(int index);
   }

   public interface CR2S_UnionWarEnd_21126OrBuilder extends MessageOrBuilder {
      List<Integer> getUnionIdList();

      int getUnionIdCount();

      int getUnionId(int index);
   }

   public interface CR2S_UpdateBuildingInfo_21110OrBuilder extends MessageOrBuilder {
      List<MergeWarGameMsg.BuildingInfo> getBuildingInfoList();

      MergeWarGameMsg.BuildingInfo getBuildingInfo(int index);

      int getBuildingInfoCount();

      List<? extends MergeWarGameMsg.BuildingInfoOrBuilder> getBuildingInfoOrBuilderList();

      MergeWarGameMsg.BuildingInfoOrBuilder getBuildingInfoOrBuilder(int index);
   }

   public interface CR2S_UpdateProperty_21136OrBuilder extends MessageOrBuilder {
      List<MergeWarGameMsg.PlayerProperty> getDataList();

      MergeWarGameMsg.PlayerProperty getData(int index);

      int getDataCount();

      List<? extends MergeWarGameMsg.PlayerPropertyOrBuilder> getDataOrBuilderList();

      MergeWarGameMsg.PlayerPropertyOrBuilder getDataOrBuilder(int index);
   }

   public interface CR2S_UpdateState_21130OrBuilder extends MessageOrBuilder {
      boolean hasStage();

      int getStage();

      boolean hasSubState();

      int getSubState();
   }

   public interface CR2S_WarInfo_21102OrBuilder extends MessageOrBuilder {
      boolean hasLeave();

      boolean getLeave();

      boolean hasWarInfo();

      MergeWarGameMsg.S2C_WarInfo_19502 getWarInfo();

      MergeWarGameMsg.S2C_WarInfo_19502OrBuilder getWarInfoOrBuilder();
   }

   public interface S2CR_ActRank_21127OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_AtkBuilding_21105OrBuilder extends MessageOrBuilder {
      boolean hasGridId();

      int getGridId();

      boolean hasSkipBattle();

      int getSkipBattle();
   }

   public interface S2CR_AtkPlayer_21107OrBuilder extends MessageOrBuilder {
      boolean hasGridId();

      int getGridId();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasSkipBattle();

      int getSkipBattle();
   }

   public interface S2CR_BaseInfo_21131OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_ChangeMove_21151OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();
   }

   public interface S2CR_EarliestOpenDay_21157OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_EntranceInfo_21155OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_GM_21171OrBuilder extends MessageOrBuilder {
      boolean hasStr();

      String getStr();

      ByteString getStrBytes();
   }

   public interface S2CR_Move_21103OrBuilder extends MessageOrBuilder {
      List<Integer> getGridIdList();

      int getGridIdCount();

      int getGridId(int index);

      boolean hasAuto();

      boolean getAuto();
   }

   public interface S2CR_PlayerArraying_21133OrBuilder extends MessageOrBuilder {
      boolean hasArraying();

      ByteString getArraying();
   }

   public interface S2CR_PromoteUnion_21143OrBuilder extends MessageOrBuilder {
      boolean hasUnionId();

      int getUnionId();

      boolean hasDamage();

      long getDamage();

      boolean hasFormal();

      boolean getFormal();
   }

   public interface S2CR_ScoreReward_21111OrBuilder extends MessageOrBuilder {
      boolean hasScoreId();

      int getScoreId();
   }

   public interface S2CR_SetDestGrid_21121OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasGridId();

      int getGridId();
   }

   public interface S2CR_SynchronizeOpen_21145OrBuilder extends MessageOrBuilder {
      boolean hasModelGroup();

      int getModelGroup();

      boolean hasOpenTimestamp();

      long getOpenTimestamp();
   }

   public interface S2CR_WarInfo_21101OrBuilder extends MessageOrBuilder {
      boolean hasLeave();

      boolean getLeave();

      boolean hasIsJoin();

      boolean getIsJoin();
   }
}
