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

public final class BattleMsg {
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_C2S_Battle_6101_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_C2S_Battle_6101_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_S2C_Battle_Init_Buff_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_S2C_Battle_Init_Buff_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_S2C_Battle_Entity_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_S2C_Battle_Entity_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_S2C_Battle_PKTeam_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_S2C_Battle_PKTeam_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_S2C_Battle_Apportion_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_S2C_Battle_Apportion_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_S2C_Battle_Effect_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_S2C_Battle_Effect_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_S2C_Battle_Effects_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_S2C_Battle_Effects_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_S2C_Battle_Action_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_S2C_Battle_Action_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_S2C_Totem_Info_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_S2C_Totem_Info_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_S2C_Team_Info_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_S2C_Team_Info_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_S2C_TeamMember_Info_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_S2C_TeamMember_Info_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_S2C_Battle_Round_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_S2C_Battle_Round_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_Battle_Result_Value_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_Battle_Result_Value_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_S2C_Battle_Result_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_S2C_Battle_Result_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_S2C_BattleResult_6102_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_S2C_BattleResult_6102_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordFight_6105_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordFight_6105_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_C2S_BattleBegin_6107_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_C2S_BattleBegin_6107_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_S2C_BattleBegin_6108_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_S2C_BattleBegin_6108_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_C2S_BattleNext_6109_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_C2S_BattleNext_6109_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_S2C_BattleNext_6110_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_S2C_BattleNext_6110_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_C2S_BattleEnd_6111_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_C2S_BattleEnd_6111_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_S2C_BattleEnd_6112_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_S2C_BattleEnd_6112_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_C2S_BattleList_6113_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_C2S_BattleList_6113_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordData_6115_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordData_6115_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_S2C_BattleRecordData_6116_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_S2C_BattleRecordData_6116_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordError_6121_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordError_6121_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battle_com_gzbz_protobuf_S2C_BattleTemple_6122_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battle_com_gzbz_protobuf_S2C_BattleTemple_6122_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private BattleMsg() {
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
      String[] descriptorData = new String[]{"\n\fBattle.proto\u0012\u0018battle.com.gzbz.protobuf\u001a\fcommon.proto\u001a\fPlayer.proto\"#\n\u000fC2S_Battle_6101\u0012\u0010\n\bbattleId\u0018\u0001 \u0002(\u0005\"^\n\u0014S2C_Battle_Init_Buff\u0012\u000e\n\u0006buffId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bbuffCode\u0018\u0002 \u0002(\u0005\u0012\u0011\n\tbuffValue\u0018\u0003 \u0002(\u0005\u0012\u0011\n\tbuffRound\u0018\u0004 \u0002(\u0005\"\u009a\u0003\n\u0011S2C_Battle_Entity\u0012\u0011\n\tbattlePos\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007teamPos\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006heroId\u0018\u0003 \u0002(\u0005\u0012\r\n\u0005hpMax\u0018\u0004 \u0002(\u0003\u0012\u000e\n\u0006curMax\u0018\u0005 \u0002(\u0003\u0012\u000e\n\u0006heroLv\u0018\u0006 \u0002(\u0005\u0012@\n\binitBuff\u0018\u0007 \u0003(\u000b2..battle.com.gzbz.protobuf.S2C_Battle_Init_Buff\u00122\n\u0004type\u0018\b \u0002(\u000e2$.battle.com.gzbz.protobuf.EntityType\u0012\u0013\n\u000boriginalPos\u0018\t \u0001(\u0005\u0012\u0012\n\nheroSkills\u0018\n \u0003(\u0005\u0012\u000e\n\u0006isDead\u0018\u000b \u0001(\b\u0012\u0016\n\u000eartifactSkinId\u0018\f \u0001(\u0005\u0012\"\n\bheroInfo\u0018\r \u0001(\u000b2\u0010.common.HeroInfo\u0012\u0015\n\rsupportBelong\u0018\u000e \u0001(\t\u0012 \n\u0007petInfo\u0018\u000f \u0001(\u000b2\u000f.common.PetInfo\"ß\u0003\n\u0011S2C_Battle_PKTeam\u0012\u0010\n\bbeloogId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nbeloogName\u0018\u0002 \u0002(\t\u0012\r\n\u0005force\u0018\u0003 \u0002(\u0005\u0012<\n\u0007entites\u0018\u0004 \u0003(\u000b2+.battle.com.gzbz.protobuf.S2C_Battle_Entity\u0012@\n\u000bplotEntites\u0018\u0005 \u0003(\u000b2+.battle.com.gzbz.protobuf.S2C_Battle_Entity\u0012\u0013\n\u000bcombatPower\u0018\u0006 \u0001(\u0003\u0012\u000f\n\u0007pvpRank\u0018\u0007 \u0001(\u0005\u0012;\n\u000bplayerInfos\u0018\b \u0003(\u000b2&.player.com.gzbz.protobuf.PropertyCell\u0012\u0016\n\u000epvpScoreChange\u0018\t \u0001(\u0005\u0012\u0013\n\u000bfriendState\u0018\n \u0001(\u0005\u0012\u0017\n\u000fcooperateBeauty\u0018\u000b \u0003(\u0005\u0012\u001c\n\u0014cooperateBeautySkill\u0018\f \u0003(\u0005\u0012\u0014\n\ffriendNation\u0018\r \u0001(\u0005\u00128\n\u0003pet\u0018\u000e \u0003(\u000b2+.battle.com.gzbz.protobuf.S2C_Battle_Entity\"X\n\u0014S2C_Battle_Apportion\u0012\u0017\n\u000ftargetBattlePos\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000beffectValue\u0018\u0002 \u0001(\u0005\u0012\u0012\n\nfinalValue\u0018\u0003 \u0002(\u0005\"\u0083\u0002\n\u0011S2C_Battle_Effect\u0012\u0012\n\neffectType\u0018\u0001 \u0002(\u0005\u0012\u0017\n\u000ftargetBattlePos\u0018\u0002 \u0002(\u0005\u0012\u0010\n\beffectId\u0018\u0003 \u0001(\u0005\u0012\u0012\n\neffectCode\u0018\u0004 \u0001(\u0005\u0012\u0013\n\u000beffectValue\u0018\u0005 \u0001(\u0003\u0012\u0012\n\nfinalValue\u0018\u0006 \u0001(\u0003\u0012\f\n\u0004crit\u0018\u0007 \u0001(\u0005\u0012\f\n\u0004time\u0018\b \u0001(\u0005\u0012A\n\tapportion\u0018\t \u0003(\u000b2..battle.com.gzbz.protobuf.S2C_Battle_Apportion\u0012\u0013\n\u000beffectSetId\u0018\n \u0001(\u0005\"¶\u0001\n\u0012S2C_Battle_Effects\u0012\f\n\u0004slot\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tbattlePos\u0018\u0002 \u0003(\u0005\u0012<\n\u0007effects\u0018\u0003 \u0003(\u000b2+.battle.com.gzbz.protobuf.S2C_Battle_Effect\u0012A\n\feventEffects\u0018\u0004 \u0003(\u000b2+.battle.com.gzbz.protobuf.S2C_Battle_Effect\"\u009e\u0001\n\u0011S2C_Battle_Action\u0012\u0012\n\nactionType\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tbattlePos\u0018\u0002 \u0001(\u0005\u0012\n\n\u0002id\u0018\u0003 \u0001(\u0005\u0012>\n\beffectes\u0018\u0004 \u0003(\u000b2,.battle.com.gzbz.protobuf.S2C_Battle_Effects\u0012\u0016\n\u000eflexibleParams\u0018\u0005 \u0003(\u0005\"=\n\u000eS2C_Totem_Info\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bbreachLv\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0003 \u0002(\u0005\"ë\u0001\n\rS2C_Team_Info\u0012\u000e\n\u0006teamId\u0018\u0001 \u0001(\u0005\u0012\u0010\n\bteamName\u0018\u0002 \u0001(\t\u0012>\n\u0007members\u0018\u0003 \u0003(\u000b2-.battle.com.gzbz.protobuf.S2C_TeamMember_Info\u0012\r\n\u0005score\u0018\u0004 \u0001(\u0005\u0012\f\n\u0004rank\u0018\u0005 \u0001(\u0005\u0012\u0010\n\bintegral\u0018\u0006 \u0001(\u0005\u0012\u0012\n\nchangeRank\u0018\u0007 \u0001(\u0005\u0012\u0016\n\u000echangeIntegral\u0018\b \u0001(\u0005\u0012\u000e\n\u0006server\u0018\t \u0001(\u0005\u0012\r\n\u0005power\u0018\n \u0001(\u0003\"h\n\u0013S2C_TeamMember_Info\u0012\u0010\n\bplayerId\u0018\u0001 \u0001(\u0005\u0012\u0012\n\nplayerName\u0018\u0002 \u0001(\t\u0012\n\n\u0002lv\u0018\u0003 \u0001(\u0005\u0012\f\n\u0004head\u0018\u0004 \u0001(\u0005\u0012\u0011\n\theadFrame\u0018\u0005 \u0001(\u0005\"_\n\u0010S2C_Battle_Round\u0012\r\n\u0005round\u0018\u0001 \u0002(\u0005\u0012<\n\u0007actions\u0018\u0002 \u0003(\u000b2+.battle.com.gzbz.protobuf.S2C_Battle_Action\"/\n\u0013Battle_Result_Value\u0012\u000b\n\u0003pos\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0003\"È\u0003\n\u0011S2C_Battle_Result\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012=\n\u0006Damage\u0018\u0002 \u0003(\u000b2-.battle.com.gzbz.protobuf.Battle_Result_Value\u0012>\n\u0007Recover\u0018\u0003 \u0003(\u000b2-.battle.com.gzbz.protobuf.Battle_Result_Value\u0012;\n\u0004Hurt\u0018\u0004 \u0003(\u000b2-.battle.com.gzbz.protobuf.Battle_Result_Value\u0012\u0010\n\brecordId\u0018\u0005 \u0001(\u0005\u0012\r\n\u0005round\u0018\u0006 \u0002(\u0005\u0012\u0010\n\bplayerLv\u0018\u0007 \u0001(\u0005\u0012\u0011\n\tplayerExp\u0018\b \u0001(\u0005\u0012$\n\nawardItems\u0018\t \u0003(\u000b2\u0010.common.ItemInfo\u0012:\n\tteamInfos\u0018\n \u0003(\u000b2'.battle.com.gzbz.protobuf.S2C_Team_Info\u0012\u0014\n\fnextRecordId\u0018\u000b \u0001(\u0005\u0012\u0012\n\nsettleInfo\u0018\f \u0003(\u0003\u0012\u0015\n\risMaxRoundEnd\u0018\r \u0001(\b\"÷\u0003\n\u0015S2C_BattleResult_6102\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005setId\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bbattleId\u0018\u0003 \u0002(\u0005\u0012\u0010\n\broundMax\u0018\u0004 \u0002(\u0005\u0012\u0011\n\tstartTime\u0018\u0005 \u0002(\u0005\u0012\f\n\u0004wave\u0018\u0006 \u0001(\u0005\u0012\u0011\n\ttotalWave\u0018\u0007 \u0001(\u0005\u0012:\n\u0005teams\u0018\b \u0003(\u000b2+.battle.com.gzbz.protobuf.S2C_Battle_PKTeam\u0012:\n\u0006rounds\u0018\t \u0003(\u000b2*.battle.com.gzbz.protobuf.S2C_Battle_Round\u0012;\n\u0006result\u0018\n \u0002(\u000b2+.battle.com.gzbz.protobuf.S2C_Battle_Result\u0012\u0010\n\bisRecord\u0018\u000b \u0001(\u0005\u0012\u0010\n\bexParams\u0018\f \u0003(\u0005\u0012\f\n\u0004flag\u0018\r \u0001(\b\u0012\r\n\u0005isEnd\u0018\u000e \u0001(\b\u0012\u0010\n\bcostTime\u0018\u000f \u0001(\u0005\u0012\u000e\n\u0006isSkip\u0018\u0010 \u0002(\b\u0012\u0012\n\nbackground\u0018\u0011 \u0001(\b\u0012\u0012\n\nisNextWave\u0018\u0012 \u0001(\b\u0012\u0014\n\fisServerSkip\u0018\u0013 \u0001(\b\u0012\u0013\n\u000bisPassFloor\u0018\u0014 \u0001(\b\"\u0089\u0001\n\u001aC2S_BattleRecordFight_6105\u0012\u0010\n\brecordId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bsystemid\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bserverId\u0018\u0003 \u0002(\u0005\u0012\u0011\n\tshareType\u0018\u0004 \u0002(\u0005\u0012\u0011\n\tstartTime\u0018\u0005 \u0002(\u0005\u0012\u000f\n\u0007isCross\u0018\u0006 \u0001(\b\"\u008c\u0001\n\u0014C2S_BattleBegin_6107\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007modelId\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006isSkip\u0018\u0003 \u0001(\b\u0012\u000e\n\u0006buffId\u0018\u0004 \u0001(\u0005\u0012\u000e\n\u0006params\u0018\u0005 \u0003(\u0005\u0012\u0012\n\nbackground\u0018\u0006 \u0001(\b\u0012\u0011\n\tguideStep\u0018\u0007 \u0001(\u0005\"4\n\u0014S2C_BattleBegin_6108\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0002 \u0002(\u0005\"H\n\u0013C2S_BattleNext_6109\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nneedRecord\u0018\u0002 \u0002(\b\u0012\u000f\n\u0007modelId\u0018\u0003 \u0002(\u0005\"3\n\u0013S2C_BattleNext_6110\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0002 \u0002(\u0005\"A\n\u0012C2S_BattleEnd_6111\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005force\u0018\u0002 \u0001(\b\u0012\u000e\n\u0006params\u0018\u0003 \u0003(\u0005\"$\n\u0012S2C_BattleEnd_6112\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"\u0015\n\u0013C2S_BattleList_6113\"-\n\u0019C2S_BattleRecordData_6115\u0012\u0010\n\brecordId\u0018\u0001 \u0002(\u0005\"\\\n\u0019S2C_BattleRecordData_6116\u0012?\n\u0006result\u0018\u0001 \u0002(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\"]\n\u001aC2S_BattleRecordError_6121\u0012?\n\u0006record\u0018\u0001 \u0002(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\"#\n\u0015S2C_BattleTemple_6122\u0012\n\n\u0002id\u0018\u0001 \u0001(\u0005*«\u0001\n\nEntityType\u0012\u0013\n\u000fEntityType_Hero\u0010\u0000\u0012\u0015\n\u0011EntityType_Friend\u0010\u0001\u0012\u0016\n\u0012EntityType_Monster\u0010\u0002\u0012\u0017\n\u0013EntityType_Artifact\u0010\u0003\u0012\u0015\n\u0011EntityType_Beauty\u0010\u0004\u0012\u0015\n\u0011EntityType_Dragon\u0010\u0005\u0012\u0012\n\u000eEntityType_Pet\u0010\u0006B \n\u0011com.gzbz.protobufB\tBattleMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), PlayerMsg.getDescriptor()});
      internal_static_battle_com_gzbz_protobuf_C2S_Battle_6101_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_battle_com_gzbz_protobuf_C2S_Battle_6101_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_C2S_Battle_6101_descriptor, new String[]{"BattleId"});
      internal_static_battle_com_gzbz_protobuf_S2C_Battle_Init_Buff_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_battle_com_gzbz_protobuf_S2C_Battle_Init_Buff_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_S2C_Battle_Init_Buff_descriptor, new String[]{"BuffId", "BuffCode", "BuffValue", "BuffRound"});
      internal_static_battle_com_gzbz_protobuf_S2C_Battle_Entity_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_battle_com_gzbz_protobuf_S2C_Battle_Entity_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_S2C_Battle_Entity_descriptor, new String[]{"BattlePos", "TeamPos", "HeroId", "HpMax", "CurMax", "HeroLv", "InitBuff", "Type", "OriginalPos", "HeroSkills", "IsDead", "ArtifactSkinId", "HeroInfo", "SupportBelong", "PetInfo"});
      internal_static_battle_com_gzbz_protobuf_S2C_Battle_PKTeam_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_battle_com_gzbz_protobuf_S2C_Battle_PKTeam_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_S2C_Battle_PKTeam_descriptor, new String[]{"BeloogId", "BeloogName", "Force", "Entites", "PlotEntites", "CombatPower", "PvpRank", "PlayerInfos", "PvpScoreChange", "FriendState", "CooperateBeauty", "CooperateBeautySkill", "FriendNation", "Pet"});
      internal_static_battle_com_gzbz_protobuf_S2C_Battle_Apportion_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_battle_com_gzbz_protobuf_S2C_Battle_Apportion_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_S2C_Battle_Apportion_descriptor, new String[]{"TargetBattlePos", "EffectValue", "FinalValue"});
      internal_static_battle_com_gzbz_protobuf_S2C_Battle_Effect_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_battle_com_gzbz_protobuf_S2C_Battle_Effect_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_S2C_Battle_Effect_descriptor, new String[]{"EffectType", "TargetBattlePos", "EffectId", "EffectCode", "EffectValue", "FinalValue", "Crit", "Time", "Apportion", "EffectSetId"});
      internal_static_battle_com_gzbz_protobuf_S2C_Battle_Effects_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_battle_com_gzbz_protobuf_S2C_Battle_Effects_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_S2C_Battle_Effects_descriptor, new String[]{"Slot", "BattlePos", "Effects", "EventEffects"});
      internal_static_battle_com_gzbz_protobuf_S2C_Battle_Action_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_battle_com_gzbz_protobuf_S2C_Battle_Action_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_S2C_Battle_Action_descriptor, new String[]{"ActionType", "BattlePos", "Id", "Effectes", "FlexibleParams"});
      internal_static_battle_com_gzbz_protobuf_S2C_Totem_Info_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_battle_com_gzbz_protobuf_S2C_Totem_Info_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_S2C_Totem_Info_descriptor, new String[]{"Id", "BreachLv", "Level"});
      internal_static_battle_com_gzbz_protobuf_S2C_Team_Info_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_battle_com_gzbz_protobuf_S2C_Team_Info_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_S2C_Team_Info_descriptor, new String[]{"TeamId", "TeamName", "Members", "Score", "Rank", "Integral", "ChangeRank", "ChangeIntegral", "Server", "Power"});
      internal_static_battle_com_gzbz_protobuf_S2C_TeamMember_Info_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_battle_com_gzbz_protobuf_S2C_TeamMember_Info_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_S2C_TeamMember_Info_descriptor, new String[]{"PlayerId", "PlayerName", "Lv", "Head", "HeadFrame"});
      internal_static_battle_com_gzbz_protobuf_S2C_Battle_Round_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_battle_com_gzbz_protobuf_S2C_Battle_Round_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_S2C_Battle_Round_descriptor, new String[]{"Round", "Actions"});
      internal_static_battle_com_gzbz_protobuf_Battle_Result_Value_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_battle_com_gzbz_protobuf_Battle_Result_Value_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_Battle_Result_Value_descriptor, new String[]{"Pos", "Num"});
      internal_static_battle_com_gzbz_protobuf_S2C_Battle_Result_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_battle_com_gzbz_protobuf_S2C_Battle_Result_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_S2C_Battle_Result_descriptor, new String[]{"Result", "Damage", "Recover", "Hurt", "RecordId", "Round", "PlayerLv", "PlayerExp", "AwardItems", "TeamInfos", "NextRecordId", "SettleInfo", "IsMaxRoundEnd"});
      internal_static_battle_com_gzbz_protobuf_S2C_BattleResult_6102_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_battle_com_gzbz_protobuf_S2C_BattleResult_6102_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_S2C_BattleResult_6102_descriptor, new String[]{"Type", "SetId", "BattleId", "RoundMax", "StartTime", "Wave", "TotalWave", "Teams", "Rounds", "Result", "IsRecord", "ExParams", "Flag", "IsEnd", "CostTime", "IsSkip", "Background", "IsNextWave", "IsServerSkip", "IsPassFloor"});
      internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordFight_6105_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordFight_6105_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordFight_6105_descriptor, new String[]{"RecordId", "Systemid", "ServerId", "ShareType", "StartTime", "IsCross"});
      internal_static_battle_com_gzbz_protobuf_C2S_BattleBegin_6107_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_battle_com_gzbz_protobuf_C2S_BattleBegin_6107_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_C2S_BattleBegin_6107_descriptor, new String[]{"Type", "ModelId", "IsSkip", "BuffId", "Params", "Background", "GuideStep"});
      internal_static_battle_com_gzbz_protobuf_S2C_BattleBegin_6108_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_battle_com_gzbz_protobuf_S2C_BattleBegin_6108_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_S2C_BattleBegin_6108_descriptor, new String[]{"Result", "Type"});
      internal_static_battle_com_gzbz_protobuf_C2S_BattleNext_6109_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_battle_com_gzbz_protobuf_C2S_BattleNext_6109_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_C2S_BattleNext_6109_descriptor, new String[]{"Type", "NeedRecord", "ModelId"});
      internal_static_battle_com_gzbz_protobuf_S2C_BattleNext_6110_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_battle_com_gzbz_protobuf_S2C_BattleNext_6110_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_S2C_BattleNext_6110_descriptor, new String[]{"Result", "Type"});
      internal_static_battle_com_gzbz_protobuf_C2S_BattleEnd_6111_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_battle_com_gzbz_protobuf_C2S_BattleEnd_6111_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_C2S_BattleEnd_6111_descriptor, new String[]{"Type", "Force", "Params"});
      internal_static_battle_com_gzbz_protobuf_S2C_BattleEnd_6112_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_battle_com_gzbz_protobuf_S2C_BattleEnd_6112_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_S2C_BattleEnd_6112_descriptor, new String[]{"Result"});
      internal_static_battle_com_gzbz_protobuf_C2S_BattleList_6113_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_battle_com_gzbz_protobuf_C2S_BattleList_6113_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_C2S_BattleList_6113_descriptor, new String[0]);
      internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordData_6115_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordData_6115_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordData_6115_descriptor, new String[]{"RecordId"});
      internal_static_battle_com_gzbz_protobuf_S2C_BattleRecordData_6116_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_battle_com_gzbz_protobuf_S2C_BattleRecordData_6116_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_S2C_BattleRecordData_6116_descriptor, new String[]{"Result"});
      internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordError_6121_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordError_6121_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordError_6121_descriptor, new String[]{"Record"});
      internal_static_battle_com_gzbz_protobuf_S2C_BattleTemple_6122_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_battle_com_gzbz_protobuf_S2C_BattleTemple_6122_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battle_com_gzbz_protobuf_S2C_BattleTemple_6122_descriptor, new String[]{"Id"});
      CommonMsg.getDescriptor();
      PlayerMsg.getDescriptor();
   }

   public static enum EntityType implements ProtocolMessageEnum {
      EntityType_Hero(0),
      EntityType_Friend(1),
      EntityType_Monster(2),
      EntityType_Artifact(3),
      EntityType_Beauty(4),
      EntityType_Dragon(5),
      EntityType_Pet(6);

      public static final int EntityType_Hero_VALUE = 0;
      public static final int EntityType_Friend_VALUE = 1;
      public static final int EntityType_Monster_VALUE = 2;
      public static final int EntityType_Artifact_VALUE = 3;
      public static final int EntityType_Beauty_VALUE = 4;
      public static final int EntityType_Dragon_VALUE = 5;
      public static final int EntityType_Pet_VALUE = 6;
      private static final Internal.EnumLiteMap<EntityType> internalValueMap = new Internal.EnumLiteMap<EntityType>() {
         public EntityType findValueByNumber(int number) {
            return BattleMsg.EntityType.forNumber(number);
         }
      };
      private static final EntityType[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static EntityType valueOf(int value) {
         return forNumber(value);
      }

      public static EntityType forNumber(int value) {
         switch (value) {
            case 0:
               return EntityType_Hero;
            case 1:
               return EntityType_Friend;
            case 2:
               return EntityType_Monster;
            case 3:
               return EntityType_Artifact;
            case 4:
               return EntityType_Beauty;
            case 5:
               return EntityType_Dragon;
            case 6:
               return EntityType_Pet;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<EntityType> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)BattleMsg.getDescriptor().getEnumTypes().get(0);
      }

      public static EntityType valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private EntityType(int value) {
         this.value = value;
      }
   }

   public static final class C2S_Battle_6101 extends GeneratedMessageV3 implements C2S_Battle_6101OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BATTLEID_FIELD_NUMBER = 1;
      private int battleId_;
      private byte memoizedIsInitialized;
      private static final C2S_Battle_6101 DEFAULT_INSTANCE = new C2S_Battle_6101();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Battle_6101> PARSER = new AbstractParser<C2S_Battle_6101>() {
         public C2S_Battle_6101 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Battle_6101(input, extensionRegistry);
         }
      };

      private C2S_Battle_6101(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Battle_6101() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Battle_6101();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Battle_6101(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.battleId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_Battle_6101_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_Battle_6101_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Battle_6101.class, Builder.class);
      }

      public boolean hasBattleId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBattleId() {
         return this.battleId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBattleId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.battleId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.battleId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Battle_6101)) {
            return super.equals(obj);
         } else {
            C2S_Battle_6101 other = (C2S_Battle_6101)obj;
            if (this.hasBattleId() != other.hasBattleId()) {
               return false;
            } else if (this.hasBattleId() && this.getBattleId() != other.getBattleId()) {
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
            if (this.hasBattleId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBattleId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Battle_6101 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Battle_6101)PARSER.parseFrom(data);
      }

      public static C2S_Battle_6101 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Battle_6101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Battle_6101 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Battle_6101)PARSER.parseFrom(data);
      }

      public static C2S_Battle_6101 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Battle_6101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Battle_6101 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Battle_6101)PARSER.parseFrom(data);
      }

      public static C2S_Battle_6101 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Battle_6101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Battle_6101 parseFrom(InputStream input) throws IOException {
         return (C2S_Battle_6101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Battle_6101 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Battle_6101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Battle_6101 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Battle_6101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Battle_6101 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Battle_6101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Battle_6101 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Battle_6101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Battle_6101 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Battle_6101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Battle_6101 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Battle_6101 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Battle_6101> parser() {
         return PARSER;
      }

      public Parser<C2S_Battle_6101> getParserForType() {
         return PARSER;
      }

      public C2S_Battle_6101 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Battle_6101OrBuilder {
         private int bitField0_;
         private int battleId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_Battle_6101_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_Battle_6101_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Battle_6101.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.C2S_Battle_6101.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.battleId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_Battle_6101_descriptor;
         }

         public C2S_Battle_6101 getDefaultInstanceForType() {
            return BattleMsg.C2S_Battle_6101.getDefaultInstance();
         }

         public C2S_Battle_6101 build() {
            C2S_Battle_6101 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Battle_6101 buildPartial() {
            C2S_Battle_6101 result = new C2S_Battle_6101(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.battleId_ = this.battleId_;
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
            if (other instanceof C2S_Battle_6101) {
               return this.mergeFrom((C2S_Battle_6101)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Battle_6101 other) {
            if (other == BattleMsg.C2S_Battle_6101.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBattleId()) {
                  this.setBattleId(other.getBattleId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBattleId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Battle_6101 parsedMessage = null;

            try {
               parsedMessage = (C2S_Battle_6101)BattleMsg.C2S_Battle_6101.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Battle_6101)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBattleId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBattleId() {
            return this.battleId_;
         }

         public Builder setBattleId(int value) {
            this.bitField0_ |= 1;
            this.battleId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBattleId() {
            this.bitField0_ &= -2;
            this.battleId_ = 0;
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

   public static final class S2C_Battle_Init_Buff extends GeneratedMessageV3 implements S2C_Battle_Init_BuffOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUFFID_FIELD_NUMBER = 1;
      private int buffId_;
      public static final int BUFFCODE_FIELD_NUMBER = 2;
      private int buffCode_;
      public static final int BUFFVALUE_FIELD_NUMBER = 3;
      private int buffValue_;
      public static final int BUFFROUND_FIELD_NUMBER = 4;
      private int buffRound_;
      private byte memoizedIsInitialized;
      private static final S2C_Battle_Init_Buff DEFAULT_INSTANCE = new S2C_Battle_Init_Buff();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Battle_Init_Buff> PARSER = new AbstractParser<S2C_Battle_Init_Buff>() {
         public S2C_Battle_Init_Buff parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Battle_Init_Buff(input, extensionRegistry);
         }
      };

      private S2C_Battle_Init_Buff(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Battle_Init_Buff() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Battle_Init_Buff();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Battle_Init_Buff(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buffId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.buffCode_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.buffValue_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.buffRound_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Init_Buff_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Init_Buff_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Battle_Init_Buff.class, Builder.class);
      }

      public boolean hasBuffId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuffId() {
         return this.buffId_;
      }

      public boolean hasBuffCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBuffCode() {
         return this.buffCode_;
      }

      public boolean hasBuffValue() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getBuffValue() {
         return this.buffValue_;
      }

      public boolean hasBuffRound() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getBuffRound() {
         return this.buffRound_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBuffId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuffCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuffValue()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuffRound()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.buffId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.buffCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.buffValue_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.buffRound_);
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
               size += CodedOutputStream.computeInt32Size(1, this.buffId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.buffCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.buffValue_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.buffRound_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Battle_Init_Buff)) {
            return super.equals(obj);
         } else {
            S2C_Battle_Init_Buff other = (S2C_Battle_Init_Buff)obj;
            if (this.hasBuffId() != other.hasBuffId()) {
               return false;
            } else if (this.hasBuffId() && this.getBuffId() != other.getBuffId()) {
               return false;
            } else if (this.hasBuffCode() != other.hasBuffCode()) {
               return false;
            } else if (this.hasBuffCode() && this.getBuffCode() != other.getBuffCode()) {
               return false;
            } else if (this.hasBuffValue() != other.hasBuffValue()) {
               return false;
            } else if (this.hasBuffValue() && this.getBuffValue() != other.getBuffValue()) {
               return false;
            } else if (this.hasBuffRound() != other.hasBuffRound()) {
               return false;
            } else if (this.hasBuffRound() && this.getBuffRound() != other.getBuffRound()) {
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
            if (this.hasBuffId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuffId();
            }

            if (this.hasBuffCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuffCode();
            }

            if (this.hasBuffValue()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBuffValue();
            }

            if (this.hasBuffRound()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getBuffRound();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Battle_Init_Buff parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Battle_Init_Buff)PARSER.parseFrom(data);
      }

      public static S2C_Battle_Init_Buff parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_Init_Buff)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_Init_Buff parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Battle_Init_Buff)PARSER.parseFrom(data);
      }

      public static S2C_Battle_Init_Buff parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_Init_Buff)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_Init_Buff parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Battle_Init_Buff)PARSER.parseFrom(data);
      }

      public static S2C_Battle_Init_Buff parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_Init_Buff)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_Init_Buff parseFrom(InputStream input) throws IOException {
         return (S2C_Battle_Init_Buff)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Battle_Init_Buff parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_Init_Buff)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Battle_Init_Buff parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Battle_Init_Buff)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Battle_Init_Buff parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_Init_Buff)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Battle_Init_Buff parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Battle_Init_Buff)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Battle_Init_Buff parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_Init_Buff)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Battle_Init_Buff prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Battle_Init_Buff getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Battle_Init_Buff> parser() {
         return PARSER;
      }

      public Parser<S2C_Battle_Init_Buff> getParserForType() {
         return PARSER;
      }

      public S2C_Battle_Init_Buff getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Battle_Init_BuffOrBuilder {
         private int bitField0_;
         private int buffId_;
         private int buffCode_;
         private int buffValue_;
         private int buffRound_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Init_Buff_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Init_Buff_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Battle_Init_Buff.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.S2C_Battle_Init_Buff.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buffId_ = 0;
            this.bitField0_ &= -2;
            this.buffCode_ = 0;
            this.bitField0_ &= -3;
            this.buffValue_ = 0;
            this.bitField0_ &= -5;
            this.buffRound_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Init_Buff_descriptor;
         }

         public S2C_Battle_Init_Buff getDefaultInstanceForType() {
            return BattleMsg.S2C_Battle_Init_Buff.getDefaultInstance();
         }

         public S2C_Battle_Init_Buff build() {
            S2C_Battle_Init_Buff result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Battle_Init_Buff buildPartial() {
            S2C_Battle_Init_Buff result = new S2C_Battle_Init_Buff(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buffId_ = this.buffId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.buffCode_ = this.buffCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.buffValue_ = this.buffValue_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.buffRound_ = this.buffRound_;
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
            if (other instanceof S2C_Battle_Init_Buff) {
               return this.mergeFrom((S2C_Battle_Init_Buff)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Battle_Init_Buff other) {
            if (other == BattleMsg.S2C_Battle_Init_Buff.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuffId()) {
                  this.setBuffId(other.getBuffId());
               }

               if (other.hasBuffCode()) {
                  this.setBuffCode(other.getBuffCode());
               }

               if (other.hasBuffValue()) {
                  this.setBuffValue(other.getBuffValue());
               }

               if (other.hasBuffRound()) {
                  this.setBuffRound(other.getBuffRound());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBuffId()) {
               return false;
            } else if (!this.hasBuffCode()) {
               return false;
            } else if (!this.hasBuffValue()) {
               return false;
            } else {
               return this.hasBuffRound();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Battle_Init_Buff parsedMessage = null;

            try {
               parsedMessage = (S2C_Battle_Init_Buff)BattleMsg.S2C_Battle_Init_Buff.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Battle_Init_Buff)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuffId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuffId() {
            return this.buffId_;
         }

         public Builder setBuffId(int value) {
            this.bitField0_ |= 1;
            this.buffId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuffId() {
            this.bitField0_ &= -2;
            this.buffId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuffCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBuffCode() {
            return this.buffCode_;
         }

         public Builder setBuffCode(int value) {
            this.bitField0_ |= 2;
            this.buffCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuffCode() {
            this.bitField0_ &= -3;
            this.buffCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuffValue() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBuffValue() {
            return this.buffValue_;
         }

         public Builder setBuffValue(int value) {
            this.bitField0_ |= 4;
            this.buffValue_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuffValue() {
            this.bitField0_ &= -5;
            this.buffValue_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuffRound() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getBuffRound() {
            return this.buffRound_;
         }

         public Builder setBuffRound(int value) {
            this.bitField0_ |= 8;
            this.buffRound_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuffRound() {
            this.bitField0_ &= -9;
            this.buffRound_ = 0;
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

   public static final class S2C_Battle_Entity extends GeneratedMessageV3 implements S2C_Battle_EntityOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BATTLEPOS_FIELD_NUMBER = 1;
      private int battlePos_;
      public static final int TEAMPOS_FIELD_NUMBER = 2;
      private int teamPos_;
      public static final int HEROID_FIELD_NUMBER = 3;
      private int heroId_;
      public static final int HPMAX_FIELD_NUMBER = 4;
      private long hpMax_;
      public static final int CURMAX_FIELD_NUMBER = 5;
      private long curMax_;
      public static final int HEROLV_FIELD_NUMBER = 6;
      private int heroLv_;
      public static final int INITBUFF_FIELD_NUMBER = 7;
      private List<S2C_Battle_Init_Buff> initBuff_;
      public static final int TYPE_FIELD_NUMBER = 8;
      private int type_;
      public static final int ORIGINALPOS_FIELD_NUMBER = 9;
      private int originalPos_;
      public static final int HEROSKILLS_FIELD_NUMBER = 10;
      private Internal.IntList heroSkills_;
      public static final int ISDEAD_FIELD_NUMBER = 11;
      private boolean isDead_;
      public static final int ARTIFACTSKINID_FIELD_NUMBER = 12;
      private int artifactSkinId_;
      public static final int HEROINFO_FIELD_NUMBER = 13;
      private CommonMsg.HeroInfo heroInfo_;
      public static final int SUPPORTBELONG_FIELD_NUMBER = 14;
      private volatile Object supportBelong_;
      public static final int PETINFO_FIELD_NUMBER = 15;
      private CommonMsg.PetInfo petInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_Battle_Entity DEFAULT_INSTANCE = new S2C_Battle_Entity();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Battle_Entity> PARSER = new AbstractParser<S2C_Battle_Entity>() {
         public S2C_Battle_Entity parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Battle_Entity(input, extensionRegistry);
         }
      };

      private S2C_Battle_Entity(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Battle_Entity() {
         this.memoizedIsInitialized = -1;
         this.initBuff_ = Collections.emptyList();
         this.type_ = 0;
         this.heroSkills_ = emptyIntList();
         this.supportBelong_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Battle_Entity();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Battle_Entity(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.battlePos_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.teamPos_ = input.readInt32();
                        continue;
                     case 24:
                        this.bitField0_ |= 4;
                        this.heroId_ = input.readInt32();
                        continue;
                     case 32:
                        this.bitField0_ |= 8;
                        this.hpMax_ = input.readInt64();
                        continue;
                     case 40:
                        this.bitField0_ |= 16;
                        this.curMax_ = input.readInt64();
                        continue;
                     case 48:
                        this.bitField0_ |= 32;
                        this.heroLv_ = input.readInt32();
                        continue;
                     case 58:
                        if ((mutable_bitField0_ & 64) == 0) {
                           this.initBuff_ = new ArrayList();
                           mutable_bitField0_ |= 64;
                        }

                        this.initBuff_.add(input.readMessage(BattleMsg.S2C_Battle_Init_Buff.PARSER, extensionRegistry));
                        continue;
                     case 64:
                        int rawValue = input.readEnum();
                        EntityType value = BattleMsg.EntityType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(8, rawValue);
                        } else {
                           this.bitField0_ |= 64;
                           this.type_ = rawValue;
                        }
                        continue;
                     case 72:
                        this.bitField0_ |= 128;
                        this.originalPos_ = input.readInt32();
                        continue;
                     case 80:
                        if ((mutable_bitField0_ & 512) == 0) {
                           this.heroSkills_ = newIntList();
                           mutable_bitField0_ |= 512;
                        }

                        this.heroSkills_.addInt(input.readInt32());
                        continue;
                     case 82:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 512) == 0 && input.getBytesUntilLimit() > 0) {
                           this.heroSkills_ = newIntList();
                           mutable_bitField0_ |= 512;
                        }
                        break;
                     case 88:
                        this.bitField0_ |= 256;
                        this.isDead_ = input.readBool();
                        continue;
                     case 96:
                        this.bitField0_ |= 512;
                        this.artifactSkinId_ = input.readInt32();
                        continue;
                     case 106:
                        CommonMsg.HeroInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1024) != 0) {
                           subBuilder = this.heroInfo_.toBuilder();
                        }

                        this.heroInfo_ = (CommonMsg.HeroInfo)input.readMessage(CommonMsg.HeroInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.heroInfo_);
                           this.heroInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1024;
                        continue;
                     case 114:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2048;
                        this.supportBelong_ = bs;
                        continue;
                     case 122:
                        CommonMsg.PetInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 4096) != 0) {
                           subBuilder = this.petInfo_.toBuilder();
                        }

                        this.petInfo_ = (CommonMsg.PetInfo)input.readMessage(CommonMsg.PetInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.petInfo_);
                           this.petInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4096;
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.heroSkills_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 64) != 0) {
                  this.initBuff_ = Collections.unmodifiableList(this.initBuff_);
               }

               if ((mutable_bitField0_ & 512) != 0) {
                  this.heroSkills_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Entity_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Entity_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Battle_Entity.class, Builder.class);
      }

      public boolean hasBattlePos() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBattlePos() {
         return this.battlePos_;
      }

      public boolean hasTeamPos() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTeamPos() {
         return this.teamPos_;
      }

      public boolean hasHeroId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHeroId() {
         return this.heroId_;
      }

      public boolean hasHpMax() {
         return (this.bitField0_ & 8) != 0;
      }

      public long getHpMax() {
         return this.hpMax_;
      }

      public boolean hasCurMax() {
         return (this.bitField0_ & 16) != 0;
      }

      public long getCurMax() {
         return this.curMax_;
      }

      public boolean hasHeroLv() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getHeroLv() {
         return this.heroLv_;
      }

      public List<S2C_Battle_Init_Buff> getInitBuffList() {
         return this.initBuff_;
      }

      public List<? extends S2C_Battle_Init_BuffOrBuilder> getInitBuffOrBuilderList() {
         return this.initBuff_;
      }

      public int getInitBuffCount() {
         return this.initBuff_.size();
      }

      public S2C_Battle_Init_Buff getInitBuff(int index) {
         return (S2C_Battle_Init_Buff)this.initBuff_.get(index);
      }

      public S2C_Battle_Init_BuffOrBuilder getInitBuffOrBuilder(int index) {
         return (S2C_Battle_Init_BuffOrBuilder)this.initBuff_.get(index);
      }

      public boolean hasType() {
         return (this.bitField0_ & 64) != 0;
      }

      public EntityType getType() {
         EntityType result = BattleMsg.EntityType.valueOf(this.type_);
         return result == null ? BattleMsg.EntityType.EntityType_Hero : result;
      }

      public boolean hasOriginalPos() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getOriginalPos() {
         return this.originalPos_;
      }

      public List<Integer> getHeroSkillsList() {
         return this.heroSkills_;
      }

      public int getHeroSkillsCount() {
         return this.heroSkills_.size();
      }

      public int getHeroSkills(int index) {
         return this.heroSkills_.getInt(index);
      }

      public boolean hasIsDead() {
         return (this.bitField0_ & 256) != 0;
      }

      public boolean getIsDead() {
         return this.isDead_;
      }

      public boolean hasArtifactSkinId() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getArtifactSkinId() {
         return this.artifactSkinId_;
      }

      public boolean hasHeroInfo() {
         return (this.bitField0_ & 1024) != 0;
      }

      public CommonMsg.HeroInfo getHeroInfo() {
         return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
      }

      public CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder() {
         return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
      }

      public boolean hasSupportBelong() {
         return (this.bitField0_ & 2048) != 0;
      }

      public String getSupportBelong() {
         Object ref = this.supportBelong_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.supportBelong_ = s;
            }

            return s;
         }
      }

      public ByteString getSupportBelongBytes() {
         Object ref = this.supportBelong_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.supportBelong_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasPetInfo() {
         return (this.bitField0_ & 4096) != 0;
      }

      public CommonMsg.PetInfo getPetInfo() {
         return this.petInfo_ == null ? CommonMsg.PetInfo.getDefaultInstance() : this.petInfo_;
      }

      public CommonMsg.PetInfoOrBuilder getPetInfoOrBuilder() {
         return this.petInfo_ == null ? CommonMsg.PetInfo.getDefaultInstance() : this.petInfo_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBattlePos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTeamPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHpMax()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCurMax()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getInitBuffCount(); ++i) {
               if (!this.getInitBuff(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            if (this.hasHeroInfo() && !this.getHeroInfo().isInitialized()) {
               this.memoizedIsInitialized = 0;
               return false;
            } else if (this.hasPetInfo() && !this.getPetInfo().isInitialized()) {
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
            output.writeInt32(1, this.battlePos_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.teamPos_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.heroId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt64(4, this.hpMax_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt64(5, this.curMax_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.heroLv_);
         }

         for(int i = 0; i < this.initBuff_.size(); ++i) {
            output.writeMessage(7, (MessageLite)this.initBuff_.get(i));
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeEnum(8, this.type_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(9, this.originalPos_);
         }

         for(int i = 0; i < this.heroSkills_.size(); ++i) {
            output.writeInt32(10, this.heroSkills_.getInt(i));
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeBool(11, this.isDead_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(12, this.artifactSkinId_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            output.writeMessage(13, this.getHeroInfo());
         }

         if ((this.bitField0_ & 2048) != 0) {
            GeneratedMessageV3.writeString(output, 14, this.supportBelong_);
         }

         if ((this.bitField0_ & 4096) != 0) {
            output.writeMessage(15, this.getPetInfo());
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
               size += CodedOutputStream.computeInt32Size(1, this.battlePos_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.teamPos_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.heroId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt64Size(4, this.hpMax_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt64Size(5, this.curMax_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.heroLv_);
            }

            for(int i = 0; i < this.initBuff_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(7, (MessageLite)this.initBuff_.get(i));
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeEnumSize(8, this.type_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.originalPos_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.heroSkills_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.heroSkills_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHeroSkillsList().size();
            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeBoolSize(11, this.isDead_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(12, this.artifactSkinId_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += CodedOutputStream.computeMessageSize(13, this.getHeroInfo());
            }

            if ((this.bitField0_ & 2048) != 0) {
               size += GeneratedMessageV3.computeStringSize(14, this.supportBelong_);
            }

            if ((this.bitField0_ & 4096) != 0) {
               size += CodedOutputStream.computeMessageSize(15, this.getPetInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Battle_Entity)) {
            return super.equals(obj);
         } else {
            S2C_Battle_Entity other = (S2C_Battle_Entity)obj;
            if (this.hasBattlePos() != other.hasBattlePos()) {
               return false;
            } else if (this.hasBattlePos() && this.getBattlePos() != other.getBattlePos()) {
               return false;
            } else if (this.hasTeamPos() != other.hasTeamPos()) {
               return false;
            } else if (this.hasTeamPos() && this.getTeamPos() != other.getTeamPos()) {
               return false;
            } else if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
               return false;
            } else if (this.hasHpMax() != other.hasHpMax()) {
               return false;
            } else if (this.hasHpMax() && this.getHpMax() != other.getHpMax()) {
               return false;
            } else if (this.hasCurMax() != other.hasCurMax()) {
               return false;
            } else if (this.hasCurMax() && this.getCurMax() != other.getCurMax()) {
               return false;
            } else if (this.hasHeroLv() != other.hasHeroLv()) {
               return false;
            } else if (this.hasHeroLv() && this.getHeroLv() != other.getHeroLv()) {
               return false;
            } else if (!this.getInitBuffList().equals(other.getInitBuffList())) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.type_ != other.type_) {
               return false;
            } else if (this.hasOriginalPos() != other.hasOriginalPos()) {
               return false;
            } else if (this.hasOriginalPos() && this.getOriginalPos() != other.getOriginalPos()) {
               return false;
            } else if (!this.getHeroSkillsList().equals(other.getHeroSkillsList())) {
               return false;
            } else if (this.hasIsDead() != other.hasIsDead()) {
               return false;
            } else if (this.hasIsDead() && this.getIsDead() != other.getIsDead()) {
               return false;
            } else if (this.hasArtifactSkinId() != other.hasArtifactSkinId()) {
               return false;
            } else if (this.hasArtifactSkinId() && this.getArtifactSkinId() != other.getArtifactSkinId()) {
               return false;
            } else if (this.hasHeroInfo() != other.hasHeroInfo()) {
               return false;
            } else if (this.hasHeroInfo() && !this.getHeroInfo().equals(other.getHeroInfo())) {
               return false;
            } else if (this.hasSupportBelong() != other.hasSupportBelong()) {
               return false;
            } else if (this.hasSupportBelong() && !this.getSupportBelong().equals(other.getSupportBelong())) {
               return false;
            } else if (this.hasPetInfo() != other.hasPetInfo()) {
               return false;
            } else if (this.hasPetInfo() && !this.getPetInfo().equals(other.getPetInfo())) {
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
            if (this.hasBattlePos()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBattlePos();
            }

            if (this.hasTeamPos()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTeamPos();
            }

            if (this.hasHeroId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHeroId();
            }

            if (this.hasHpMax()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashLong(this.getHpMax());
            }

            if (this.hasCurMax()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashLong(this.getCurMax());
            }

            if (this.hasHeroLv()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getHeroLv();
            }

            if (this.getInitBuffCount() > 0) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getInitBuffList().hashCode();
            }

            if (this.hasType()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.type_;
            }

            if (this.hasOriginalPos()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getOriginalPos();
            }

            if (this.getHeroSkillsCount() > 0) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getHeroSkillsList().hashCode();
            }

            if (this.hasIsDead()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + Internal.hashBoolean(this.getIsDead());
            }

            if (this.hasArtifactSkinId()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getArtifactSkinId();
            }

            if (this.hasHeroInfo()) {
               hash = 37 * hash + 13;
               hash = 53 * hash + this.getHeroInfo().hashCode();
            }

            if (this.hasSupportBelong()) {
               hash = 37 * hash + 14;
               hash = 53 * hash + this.getSupportBelong().hashCode();
            }

            if (this.hasPetInfo()) {
               hash = 37 * hash + 15;
               hash = 53 * hash + this.getPetInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Battle_Entity parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Battle_Entity)PARSER.parseFrom(data);
      }

      public static S2C_Battle_Entity parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_Entity)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_Entity parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Battle_Entity)PARSER.parseFrom(data);
      }

      public static S2C_Battle_Entity parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_Entity)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_Entity parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Battle_Entity)PARSER.parseFrom(data);
      }

      public static S2C_Battle_Entity parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_Entity)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_Entity parseFrom(InputStream input) throws IOException {
         return (S2C_Battle_Entity)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Battle_Entity parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_Entity)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Battle_Entity parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Battle_Entity)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Battle_Entity parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_Entity)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Battle_Entity parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Battle_Entity)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Battle_Entity parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_Entity)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Battle_Entity prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Battle_Entity getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Battle_Entity> parser() {
         return PARSER;
      }

      public Parser<S2C_Battle_Entity> getParserForType() {
         return PARSER;
      }

      public S2C_Battle_Entity getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Battle_EntityOrBuilder {
         private int bitField0_;
         private int battlePos_;
         private int teamPos_;
         private int heroId_;
         private long hpMax_;
         private long curMax_;
         private int heroLv_;
         private List<S2C_Battle_Init_Buff> initBuff_;
         private RepeatedFieldBuilderV3<S2C_Battle_Init_Buff, S2C_Battle_Init_Buff.Builder, S2C_Battle_Init_BuffOrBuilder> initBuffBuilder_;
         private int type_;
         private int originalPos_;
         private Internal.IntList heroSkills_;
         private boolean isDead_;
         private int artifactSkinId_;
         private CommonMsg.HeroInfo heroInfo_;
         private SingleFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> heroInfoBuilder_;
         private Object supportBelong_;
         private CommonMsg.PetInfo petInfo_;
         private SingleFieldBuilderV3<CommonMsg.PetInfo, CommonMsg.PetInfo.Builder, CommonMsg.PetInfoOrBuilder> petInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Entity_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Entity_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Battle_Entity.class, Builder.class);
         }

         private Builder() {
            this.initBuff_ = Collections.emptyList();
            this.type_ = 0;
            this.heroSkills_ = BattleMsg.S2C_Battle_Entity.emptyIntList();
            this.supportBelong_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.initBuff_ = Collections.emptyList();
            this.type_ = 0;
            this.heroSkills_ = BattleMsg.S2C_Battle_Entity.emptyIntList();
            this.supportBelong_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.S2C_Battle_Entity.alwaysUseFieldBuilders) {
               this.getInitBuffFieldBuilder();
               this.getHeroInfoFieldBuilder();
               this.getPetInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.battlePos_ = 0;
            this.bitField0_ &= -2;
            this.teamPos_ = 0;
            this.bitField0_ &= -3;
            this.heroId_ = 0;
            this.bitField0_ &= -5;
            this.hpMax_ = 0L;
            this.bitField0_ &= -9;
            this.curMax_ = 0L;
            this.bitField0_ &= -17;
            this.heroLv_ = 0;
            this.bitField0_ &= -33;
            if (this.initBuffBuilder_ == null) {
               this.initBuff_ = Collections.emptyList();
               this.bitField0_ &= -65;
            } else {
               this.initBuffBuilder_.clear();
            }

            this.type_ = 0;
            this.bitField0_ &= -129;
            this.originalPos_ = 0;
            this.bitField0_ &= -257;
            this.heroSkills_ = BattleMsg.S2C_Battle_Entity.emptyIntList();
            this.bitField0_ &= -513;
            this.isDead_ = false;
            this.bitField0_ &= -1025;
            this.artifactSkinId_ = 0;
            this.bitField0_ &= -2049;
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -4097;
            this.supportBelong_ = "";
            this.bitField0_ &= -8193;
            if (this.petInfoBuilder_ == null) {
               this.petInfo_ = null;
            } else {
               this.petInfoBuilder_.clear();
            }

            this.bitField0_ &= -16385;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Entity_descriptor;
         }

         public S2C_Battle_Entity getDefaultInstanceForType() {
            return BattleMsg.S2C_Battle_Entity.getDefaultInstance();
         }

         public S2C_Battle_Entity build() {
            S2C_Battle_Entity result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Battle_Entity buildPartial() {
            S2C_Battle_Entity result = new S2C_Battle_Entity(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.battlePos_ = this.battlePos_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.teamPos_ = this.teamPos_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.heroId_ = this.heroId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.hpMax_ = this.hpMax_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.curMax_ = this.curMax_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.heroLv_ = this.heroLv_;
               to_bitField0_ |= 32;
            }

            if (this.initBuffBuilder_ == null) {
               if ((this.bitField0_ & 64) != 0) {
                  this.initBuff_ = Collections.unmodifiableList(this.initBuff_);
                  this.bitField0_ &= -65;
               }

               result.initBuff_ = this.initBuff_;
            } else {
               result.initBuff_ = this.initBuffBuilder_.build();
            }

            if ((from_bitField0_ & 128) != 0) {
               to_bitField0_ |= 64;
            }

            result.type_ = this.type_;
            if ((from_bitField0_ & 256) != 0) {
               result.originalPos_ = this.originalPos_;
               to_bitField0_ |= 128;
            }

            if ((this.bitField0_ & 512) != 0) {
               this.heroSkills_.makeImmutable();
               this.bitField0_ &= -513;
            }

            result.heroSkills_ = this.heroSkills_;
            if ((from_bitField0_ & 1024) != 0) {
               result.isDead_ = this.isDead_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & 2048) != 0) {
               result.artifactSkinId_ = this.artifactSkinId_;
               to_bitField0_ |= 512;
            }

            if ((from_bitField0_ & 4096) != 0) {
               if (this.heroInfoBuilder_ == null) {
                  result.heroInfo_ = this.heroInfo_;
               } else {
                  result.heroInfo_ = (CommonMsg.HeroInfo)this.heroInfoBuilder_.build();
               }

               to_bitField0_ |= 1024;
            }

            if ((from_bitField0_ & 8192) != 0) {
               to_bitField0_ |= 2048;
            }

            result.supportBelong_ = this.supportBelong_;
            if ((from_bitField0_ & 16384) != 0) {
               if (this.petInfoBuilder_ == null) {
                  result.petInfo_ = this.petInfo_;
               } else {
                  result.petInfo_ = (CommonMsg.PetInfo)this.petInfoBuilder_.build();
               }

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
            if (other instanceof S2C_Battle_Entity) {
               return this.mergeFrom((S2C_Battle_Entity)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Battle_Entity other) {
            if (other == BattleMsg.S2C_Battle_Entity.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBattlePos()) {
                  this.setBattlePos(other.getBattlePos());
               }

               if (other.hasTeamPos()) {
                  this.setTeamPos(other.getTeamPos());
               }

               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               if (other.hasHpMax()) {
                  this.setHpMax(other.getHpMax());
               }

               if (other.hasCurMax()) {
                  this.setCurMax(other.getCurMax());
               }

               if (other.hasHeroLv()) {
                  this.setHeroLv(other.getHeroLv());
               }

               if (this.initBuffBuilder_ == null) {
                  if (!other.initBuff_.isEmpty()) {
                     if (this.initBuff_.isEmpty()) {
                        this.initBuff_ = other.initBuff_;
                        this.bitField0_ &= -65;
                     } else {
                        this.ensureInitBuffIsMutable();
                        this.initBuff_.addAll(other.initBuff_);
                     }

                     this.onChanged();
                  }
               } else if (!other.initBuff_.isEmpty()) {
                  if (this.initBuffBuilder_.isEmpty()) {
                     this.initBuffBuilder_.dispose();
                     this.initBuffBuilder_ = null;
                     this.initBuff_ = other.initBuff_;
                     this.bitField0_ &= -65;
                     this.initBuffBuilder_ = BattleMsg.S2C_Battle_Entity.alwaysUseFieldBuilders ? this.getInitBuffFieldBuilder() : null;
                  } else {
                     this.initBuffBuilder_.addAllMessages(other.initBuff_);
                  }
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasOriginalPos()) {
                  this.setOriginalPos(other.getOriginalPos());
               }

               if (!other.heroSkills_.isEmpty()) {
                  if (this.heroSkills_.isEmpty()) {
                     this.heroSkills_ = other.heroSkills_;
                     this.bitField0_ &= -513;
                  } else {
                     this.ensureHeroSkillsIsMutable();
                     this.heroSkills_.addAll(other.heroSkills_);
                  }

                  this.onChanged();
               }

               if (other.hasIsDead()) {
                  this.setIsDead(other.getIsDead());
               }

               if (other.hasArtifactSkinId()) {
                  this.setArtifactSkinId(other.getArtifactSkinId());
               }

               if (other.hasHeroInfo()) {
                  this.mergeHeroInfo(other.getHeroInfo());
               }

               if (other.hasSupportBelong()) {
                  this.bitField0_ |= 8192;
                  this.supportBelong_ = other.supportBelong_;
                  this.onChanged();
               }

               if (other.hasPetInfo()) {
                  this.mergePetInfo(other.getPetInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBattlePos()) {
               return false;
            } else if (!this.hasTeamPos()) {
               return false;
            } else if (!this.hasHeroId()) {
               return false;
            } else if (!this.hasHpMax()) {
               return false;
            } else if (!this.hasCurMax()) {
               return false;
            } else if (!this.hasHeroLv()) {
               return false;
            } else if (!this.hasType()) {
               return false;
            } else {
               for(int i = 0; i < this.getInitBuffCount(); ++i) {
                  if (!this.getInitBuff(i).isInitialized()) {
                     return false;
                  }
               }

               if (this.hasHeroInfo() && !this.getHeroInfo().isInitialized()) {
                  return false;
               } else if (this.hasPetInfo() && !this.getPetInfo().isInitialized()) {
                  return false;
               } else {
                  return true;
               }
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Battle_Entity parsedMessage = null;

            try {
               parsedMessage = (S2C_Battle_Entity)BattleMsg.S2C_Battle_Entity.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Battle_Entity)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBattlePos() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBattlePos() {
            return this.battlePos_;
         }

         public Builder setBattlePos(int value) {
            this.bitField0_ |= 1;
            this.battlePos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBattlePos() {
            this.bitField0_ &= -2;
            this.battlePos_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTeamPos() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTeamPos() {
            return this.teamPos_;
         }

         public Builder setTeamPos(int value) {
            this.bitField0_ |= 2;
            this.teamPos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTeamPos() {
            this.bitField0_ &= -3;
            this.teamPos_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getHeroId() {
            return this.heroId_;
         }

         public Builder setHeroId(int value) {
            this.bitField0_ |= 4;
            this.heroId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroId() {
            this.bitField0_ &= -5;
            this.heroId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHpMax() {
            return (this.bitField0_ & 8) != 0;
         }

         public long getHpMax() {
            return this.hpMax_;
         }

         public Builder setHpMax(long value) {
            this.bitField0_ |= 8;
            this.hpMax_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHpMax() {
            this.bitField0_ &= -9;
            this.hpMax_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasCurMax() {
            return (this.bitField0_ & 16) != 0;
         }

         public long getCurMax() {
            return this.curMax_;
         }

         public Builder setCurMax(long value) {
            this.bitField0_ |= 16;
            this.curMax_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurMax() {
            this.bitField0_ &= -17;
            this.curMax_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasHeroLv() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getHeroLv() {
            return this.heroLv_;
         }

         public Builder setHeroLv(int value) {
            this.bitField0_ |= 32;
            this.heroLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroLv() {
            this.bitField0_ &= -33;
            this.heroLv_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureInitBuffIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
               this.initBuff_ = new ArrayList(this.initBuff_);
               this.bitField0_ |= 64;
            }

         }

         public List<S2C_Battle_Init_Buff> getInitBuffList() {
            return this.initBuffBuilder_ == null ? Collections.unmodifiableList(this.initBuff_) : this.initBuffBuilder_.getMessageList();
         }

         public int getInitBuffCount() {
            return this.initBuffBuilder_ == null ? this.initBuff_.size() : this.initBuffBuilder_.getCount();
         }

         public S2C_Battle_Init_Buff getInitBuff(int index) {
            return this.initBuffBuilder_ == null ? (S2C_Battle_Init_Buff)this.initBuff_.get(index) : (S2C_Battle_Init_Buff)this.initBuffBuilder_.getMessage(index);
         }

         public Builder setInitBuff(int index, S2C_Battle_Init_Buff value) {
            if (this.initBuffBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInitBuffIsMutable();
               this.initBuff_.set(index, value);
               this.onChanged();
            } else {
               this.initBuffBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setInitBuff(int index, S2C_Battle_Init_Buff.Builder builderForValue) {
            if (this.initBuffBuilder_ == null) {
               this.ensureInitBuffIsMutable();
               this.initBuff_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.initBuffBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInitBuff(S2C_Battle_Init_Buff value) {
            if (this.initBuffBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInitBuffIsMutable();
               this.initBuff_.add(value);
               this.onChanged();
            } else {
               this.initBuffBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addInitBuff(int index, S2C_Battle_Init_Buff value) {
            if (this.initBuffBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInitBuffIsMutable();
               this.initBuff_.add(index, value);
               this.onChanged();
            } else {
               this.initBuffBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addInitBuff(S2C_Battle_Init_Buff.Builder builderForValue) {
            if (this.initBuffBuilder_ == null) {
               this.ensureInitBuffIsMutable();
               this.initBuff_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.initBuffBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInitBuff(int index, S2C_Battle_Init_Buff.Builder builderForValue) {
            if (this.initBuffBuilder_ == null) {
               this.ensureInitBuffIsMutable();
               this.initBuff_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.initBuffBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInitBuff(Iterable<? extends S2C_Battle_Init_Buff> values) {
            if (this.initBuffBuilder_ == null) {
               this.ensureInitBuffIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.initBuff_);
               this.onChanged();
            } else {
               this.initBuffBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearInitBuff() {
            if (this.initBuffBuilder_ == null) {
               this.initBuff_ = Collections.emptyList();
               this.bitField0_ &= -65;
               this.onChanged();
            } else {
               this.initBuffBuilder_.clear();
            }

            return this;
         }

         public Builder removeInitBuff(int index) {
            if (this.initBuffBuilder_ == null) {
               this.ensureInitBuffIsMutable();
               this.initBuff_.remove(index);
               this.onChanged();
            } else {
               this.initBuffBuilder_.remove(index);
            }

            return this;
         }

         public S2C_Battle_Init_Buff.Builder getInitBuffBuilder(int index) {
            return (S2C_Battle_Init_Buff.Builder)this.getInitBuffFieldBuilder().getBuilder(index);
         }

         public S2C_Battle_Init_BuffOrBuilder getInitBuffOrBuilder(int index) {
            return this.initBuffBuilder_ == null ? (S2C_Battle_Init_BuffOrBuilder)this.initBuff_.get(index) : (S2C_Battle_Init_BuffOrBuilder)this.initBuffBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends S2C_Battle_Init_BuffOrBuilder> getInitBuffOrBuilderList() {
            return this.initBuffBuilder_ != null ? this.initBuffBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.initBuff_);
         }

         public S2C_Battle_Init_Buff.Builder addInitBuffBuilder() {
            return (S2C_Battle_Init_Buff.Builder)this.getInitBuffFieldBuilder().addBuilder(BattleMsg.S2C_Battle_Init_Buff.getDefaultInstance());
         }

         public S2C_Battle_Init_Buff.Builder addInitBuffBuilder(int index) {
            return (S2C_Battle_Init_Buff.Builder)this.getInitBuffFieldBuilder().addBuilder(index, BattleMsg.S2C_Battle_Init_Buff.getDefaultInstance());
         }

         public List<S2C_Battle_Init_Buff.Builder> getInitBuffBuilderList() {
            return this.getInitBuffFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<S2C_Battle_Init_Buff, S2C_Battle_Init_Buff.Builder, S2C_Battle_Init_BuffOrBuilder> getInitBuffFieldBuilder() {
            if (this.initBuffBuilder_ == null) {
               this.initBuffBuilder_ = new RepeatedFieldBuilderV3(this.initBuff_, (this.bitField0_ & 64) != 0, this.getParentForChildren(), this.isClean());
               this.initBuff_ = null;
            }

            return this.initBuffBuilder_;
         }

         public boolean hasType() {
            return (this.bitField0_ & 128) != 0;
         }

         public EntityType getType() {
            EntityType result = BattleMsg.EntityType.valueOf(this.type_);
            return result == null ? BattleMsg.EntityType.EntityType_Hero : result;
         }

         public Builder setType(EntityType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 128;
               this.type_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearType() {
            this.bitField0_ &= -129;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOriginalPos() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getOriginalPos() {
            return this.originalPos_;
         }

         public Builder setOriginalPos(int value) {
            this.bitField0_ |= 256;
            this.originalPos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOriginalPos() {
            this.bitField0_ &= -257;
            this.originalPos_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureHeroSkillsIsMutable() {
            if ((this.bitField0_ & 512) == 0) {
               this.heroSkills_ = BattleMsg.S2C_Battle_Entity.mutableCopy(this.heroSkills_);
               this.bitField0_ |= 512;
            }

         }

         public List<Integer> getHeroSkillsList() {
            return (List<Integer>)((this.bitField0_ & 512) != 0 ? Collections.unmodifiableList(this.heroSkills_) : this.heroSkills_);
         }

         public int getHeroSkillsCount() {
            return this.heroSkills_.size();
         }

         public int getHeroSkills(int index) {
            return this.heroSkills_.getInt(index);
         }

         public Builder setHeroSkills(int index, int value) {
            this.ensureHeroSkillsIsMutable();
            this.heroSkills_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHeroSkills(int value) {
            this.ensureHeroSkillsIsMutable();
            this.heroSkills_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHeroSkills(Iterable<? extends Integer> values) {
            this.ensureHeroSkillsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroSkills_);
            this.onChanged();
            return this;
         }

         public Builder clearHeroSkills() {
            this.heroSkills_ = BattleMsg.S2C_Battle_Entity.emptyIntList();
            this.bitField0_ &= -513;
            this.onChanged();
            return this;
         }

         public boolean hasIsDead() {
            return (this.bitField0_ & 1024) != 0;
         }

         public boolean getIsDead() {
            return this.isDead_;
         }

         public Builder setIsDead(boolean value) {
            this.bitField0_ |= 1024;
            this.isDead_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsDead() {
            this.bitField0_ &= -1025;
            this.isDead_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasArtifactSkinId() {
            return (this.bitField0_ & 2048) != 0;
         }

         public int getArtifactSkinId() {
            return this.artifactSkinId_;
         }

         public Builder setArtifactSkinId(int value) {
            this.bitField0_ |= 2048;
            this.artifactSkinId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearArtifactSkinId() {
            this.bitField0_ &= -2049;
            this.artifactSkinId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroInfo() {
            return (this.bitField0_ & 4096) != 0;
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

            this.bitField0_ |= 4096;
            return this;
         }

         public Builder setHeroInfo(CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.heroInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4096;
            return this;
         }

         public Builder mergeHeroInfo(CommonMsg.HeroInfo value) {
            if (this.heroInfoBuilder_ == null) {
               if ((this.bitField0_ & 4096) != 0 && this.heroInfo_ != null && this.heroInfo_ != CommonMsg.HeroInfo.getDefaultInstance()) {
                  this.heroInfo_ = CommonMsg.HeroInfo.newBuilder(this.heroInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.heroInfo_ = value;
               }

               this.onChanged();
            } else {
               this.heroInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4096;
            return this;
         }

         public Builder clearHeroInfo() {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
               this.onChanged();
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -4097;
            return this;
         }

         public CommonMsg.HeroInfo.Builder getHeroInfoBuilder() {
            this.bitField0_ |= 4096;
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

         public boolean hasSupportBelong() {
            return (this.bitField0_ & 8192) != 0;
         }

         public String getSupportBelong() {
            Object ref = this.supportBelong_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.supportBelong_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getSupportBelongBytes() {
            Object ref = this.supportBelong_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.supportBelong_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setSupportBelong(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8192;
               this.supportBelong_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearSupportBelong() {
            this.bitField0_ &= -8193;
            this.supportBelong_ = BattleMsg.S2C_Battle_Entity.getDefaultInstance().getSupportBelong();
            this.onChanged();
            return this;
         }

         public Builder setSupportBelongBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8192;
               this.supportBelong_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasPetInfo() {
            return (this.bitField0_ & 16384) != 0;
         }

         public CommonMsg.PetInfo getPetInfo() {
            if (this.petInfoBuilder_ == null) {
               return this.petInfo_ == null ? CommonMsg.PetInfo.getDefaultInstance() : this.petInfo_;
            } else {
               return (CommonMsg.PetInfo)this.petInfoBuilder_.getMessage();
            }
         }

         public Builder setPetInfo(CommonMsg.PetInfo value) {
            if (this.petInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.petInfo_ = value;
               this.onChanged();
            } else {
               this.petInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 16384;
            return this;
         }

         public Builder setPetInfo(CommonMsg.PetInfo.Builder builderForValue) {
            if (this.petInfoBuilder_ == null) {
               this.petInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.petInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 16384;
            return this;
         }

         public Builder mergePetInfo(CommonMsg.PetInfo value) {
            if (this.petInfoBuilder_ == null) {
               if ((this.bitField0_ & 16384) != 0 && this.petInfo_ != null && this.petInfo_ != CommonMsg.PetInfo.getDefaultInstance()) {
                  this.petInfo_ = CommonMsg.PetInfo.newBuilder(this.petInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.petInfo_ = value;
               }

               this.onChanged();
            } else {
               this.petInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 16384;
            return this;
         }

         public Builder clearPetInfo() {
            if (this.petInfoBuilder_ == null) {
               this.petInfo_ = null;
               this.onChanged();
            } else {
               this.petInfoBuilder_.clear();
            }

            this.bitField0_ &= -16385;
            return this;
         }

         public CommonMsg.PetInfo.Builder getPetInfoBuilder() {
            this.bitField0_ |= 16384;
            this.onChanged();
            return (CommonMsg.PetInfo.Builder)this.getPetInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.PetInfoOrBuilder getPetInfoOrBuilder() {
            if (this.petInfoBuilder_ != null) {
               return (CommonMsg.PetInfoOrBuilder)this.petInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.petInfo_ == null ? CommonMsg.PetInfo.getDefaultInstance() : this.petInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.PetInfo, CommonMsg.PetInfo.Builder, CommonMsg.PetInfoOrBuilder> getPetInfoFieldBuilder() {
            if (this.petInfoBuilder_ == null) {
               this.petInfoBuilder_ = new SingleFieldBuilderV3(this.getPetInfo(), this.getParentForChildren(), this.isClean());
               this.petInfo_ = null;
            }

            return this.petInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_Battle_PKTeam extends GeneratedMessageV3 implements S2C_Battle_PKTeamOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BELOOGID_FIELD_NUMBER = 1;
      private int beloogId_;
      public static final int BELOOGNAME_FIELD_NUMBER = 2;
      private volatile Object beloogName_;
      public static final int FORCE_FIELD_NUMBER = 3;
      private int force_;
      public static final int ENTITES_FIELD_NUMBER = 4;
      private List<S2C_Battle_Entity> entites_;
      public static final int PLOTENTITES_FIELD_NUMBER = 5;
      private List<S2C_Battle_Entity> plotEntites_;
      public static final int COMBATPOWER_FIELD_NUMBER = 6;
      private long combatPower_;
      public static final int PVPRANK_FIELD_NUMBER = 7;
      private int pvpRank_;
      public static final int PLAYERINFOS_FIELD_NUMBER = 8;
      private List<PlayerMsg.PropertyCell> playerInfos_;
      public static final int PVPSCORECHANGE_FIELD_NUMBER = 9;
      private int pvpScoreChange_;
      public static final int FRIENDSTATE_FIELD_NUMBER = 10;
      private int friendState_;
      public static final int COOPERATEBEAUTY_FIELD_NUMBER = 11;
      private Internal.IntList cooperateBeauty_;
      public static final int COOPERATEBEAUTYSKILL_FIELD_NUMBER = 12;
      private Internal.IntList cooperateBeautySkill_;
      public static final int FRIENDNATION_FIELD_NUMBER = 13;
      private int friendNation_;
      public static final int PET_FIELD_NUMBER = 14;
      private List<S2C_Battle_Entity> pet_;
      private byte memoizedIsInitialized;
      private static final S2C_Battle_PKTeam DEFAULT_INSTANCE = new S2C_Battle_PKTeam();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Battle_PKTeam> PARSER = new AbstractParser<S2C_Battle_PKTeam>() {
         public S2C_Battle_PKTeam parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Battle_PKTeam(input, extensionRegistry);
         }
      };

      private S2C_Battle_PKTeam(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Battle_PKTeam() {
         this.memoizedIsInitialized = -1;
         this.beloogName_ = "";
         this.entites_ = Collections.emptyList();
         this.plotEntites_ = Collections.emptyList();
         this.playerInfos_ = Collections.emptyList();
         this.cooperateBeauty_ = emptyIntList();
         this.cooperateBeautySkill_ = emptyIntList();
         this.pet_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Battle_PKTeam();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Battle_PKTeam(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.beloogId_ = input.readInt32();
                        continue;
                     case 18:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.beloogName_ = bs;
                        continue;
                     case 24:
                        this.bitField0_ |= 4;
                        this.force_ = input.readInt32();
                        continue;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.entites_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.entites_.add(input.readMessage(BattleMsg.S2C_Battle_Entity.PARSER, extensionRegistry));
                        continue;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.plotEntites_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.plotEntites_.add(input.readMessage(BattleMsg.S2C_Battle_Entity.PARSER, extensionRegistry));
                        continue;
                     case 48:
                        this.bitField0_ |= 8;
                        this.combatPower_ = input.readInt64();
                        continue;
                     case 56:
                        this.bitField0_ |= 16;
                        this.pvpRank_ = input.readInt32();
                        continue;
                     case 66:
                        if ((mutable_bitField0_ & 128) == 0) {
                           this.playerInfos_ = new ArrayList();
                           mutable_bitField0_ |= 128;
                        }

                        this.playerInfos_.add(input.readMessage(PlayerMsg.PropertyCell.PARSER, extensionRegistry));
                        continue;
                     case 72:
                        this.bitField0_ |= 32;
                        this.pvpScoreChange_ = input.readInt32();
                        continue;
                     case 80:
                        this.bitField0_ |= 64;
                        this.friendState_ = input.readInt32();
                        continue;
                     case 88:
                        if ((mutable_bitField0_ & 1024) == 0) {
                           this.cooperateBeauty_ = newIntList();
                           mutable_bitField0_ |= 1024;
                        }

                        this.cooperateBeauty_.addInt(input.readInt32());
                        continue;
                     case 90:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1024) == 0 && input.getBytesUntilLimit() > 0) {
                           this.cooperateBeauty_ = newIntList();
                           mutable_bitField0_ |= 1024;
                        }
                        break;
                     case 96:
                        if ((mutable_bitField0_ & 2048) == 0) {
                           this.cooperateBeautySkill_ = newIntList();
                           mutable_bitField0_ |= 2048;
                        }

                        this.cooperateBeautySkill_.addInt(input.readInt32());
                        continue;
                     case 98:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2048) == 0 && input.getBytesUntilLimit() > 0) {
                           this.cooperateBeautySkill_ = newIntList();
                           mutable_bitField0_ |= 2048;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.cooperateBeautySkill_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 104:
                        this.bitField0_ |= 128;
                        this.friendNation_ = input.readInt32();
                        continue;
                     case 114:
                        if ((mutable_bitField0_ & 8192) == 0) {
                           this.pet_ = new ArrayList();
                           mutable_bitField0_ |= 8192;
                        }

                        this.pet_.add(input.readMessage(BattleMsg.S2C_Battle_Entity.PARSER, extensionRegistry));
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.cooperateBeauty_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 8) != 0) {
                  this.entites_ = Collections.unmodifiableList(this.entites_);
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.plotEntites_ = Collections.unmodifiableList(this.plotEntites_);
               }

               if ((mutable_bitField0_ & 128) != 0) {
                  this.playerInfos_ = Collections.unmodifiableList(this.playerInfos_);
               }

               if ((mutable_bitField0_ & 1024) != 0) {
                  this.cooperateBeauty_.makeImmutable();
               }

               if ((mutable_bitField0_ & 2048) != 0) {
                  this.cooperateBeautySkill_.makeImmutable();
               }

               if ((mutable_bitField0_ & 8192) != 0) {
                  this.pet_ = Collections.unmodifiableList(this.pet_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_PKTeam_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_PKTeam_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Battle_PKTeam.class, Builder.class);
      }

      public boolean hasBeloogId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBeloogId() {
         return this.beloogId_;
      }

      public boolean hasBeloogName() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getBeloogName() {
         Object ref = this.beloogName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.beloogName_ = s;
            }

            return s;
         }
      }

      public ByteString getBeloogNameBytes() {
         Object ref = this.beloogName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.beloogName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasForce() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getForce() {
         return this.force_;
      }

      public List<S2C_Battle_Entity> getEntitesList() {
         return this.entites_;
      }

      public List<? extends S2C_Battle_EntityOrBuilder> getEntitesOrBuilderList() {
         return this.entites_;
      }

      public int getEntitesCount() {
         return this.entites_.size();
      }

      public S2C_Battle_Entity getEntites(int index) {
         return (S2C_Battle_Entity)this.entites_.get(index);
      }

      public S2C_Battle_EntityOrBuilder getEntitesOrBuilder(int index) {
         return (S2C_Battle_EntityOrBuilder)this.entites_.get(index);
      }

      public List<S2C_Battle_Entity> getPlotEntitesList() {
         return this.plotEntites_;
      }

      public List<? extends S2C_Battle_EntityOrBuilder> getPlotEntitesOrBuilderList() {
         return this.plotEntites_;
      }

      public int getPlotEntitesCount() {
         return this.plotEntites_.size();
      }

      public S2C_Battle_Entity getPlotEntites(int index) {
         return (S2C_Battle_Entity)this.plotEntites_.get(index);
      }

      public S2C_Battle_EntityOrBuilder getPlotEntitesOrBuilder(int index) {
         return (S2C_Battle_EntityOrBuilder)this.plotEntites_.get(index);
      }

      public boolean hasCombatPower() {
         return (this.bitField0_ & 8) != 0;
      }

      public long getCombatPower() {
         return this.combatPower_;
      }

      public boolean hasPvpRank() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getPvpRank() {
         return this.pvpRank_;
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

      public boolean hasPvpScoreChange() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getPvpScoreChange() {
         return this.pvpScoreChange_;
      }

      public boolean hasFriendState() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getFriendState() {
         return this.friendState_;
      }

      public List<Integer> getCooperateBeautyList() {
         return this.cooperateBeauty_;
      }

      public int getCooperateBeautyCount() {
         return this.cooperateBeauty_.size();
      }

      public int getCooperateBeauty(int index) {
         return this.cooperateBeauty_.getInt(index);
      }

      public List<Integer> getCooperateBeautySkillList() {
         return this.cooperateBeautySkill_;
      }

      public int getCooperateBeautySkillCount() {
         return this.cooperateBeautySkill_.size();
      }

      public int getCooperateBeautySkill(int index) {
         return this.cooperateBeautySkill_.getInt(index);
      }

      public boolean hasFriendNation() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getFriendNation() {
         return this.friendNation_;
      }

      public List<S2C_Battle_Entity> getPetList() {
         return this.pet_;
      }

      public List<? extends S2C_Battle_EntityOrBuilder> getPetOrBuilderList() {
         return this.pet_;
      }

      public int getPetCount() {
         return this.pet_.size();
      }

      public S2C_Battle_Entity getPet(int index) {
         return (S2C_Battle_Entity)this.pet_.get(index);
      }

      public S2C_Battle_EntityOrBuilder getPetOrBuilder(int index) {
         return (S2C_Battle_EntityOrBuilder)this.pet_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBeloogId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBeloogName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasForce()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getEntitesCount(); ++i) {
               if (!this.getEntites(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getPlotEntitesCount(); ++i) {
               if (!this.getPlotEntites(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getPlayerInfosCount(); ++i) {
               if (!this.getPlayerInfos(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getPetCount(); ++i) {
               if (!this.getPet(i).isInitialized()) {
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
            output.writeInt32(1, this.beloogId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.beloogName_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.force_);
         }

         for(int i = 0; i < this.entites_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.entites_.get(i));
         }

         for(int i = 0; i < this.plotEntites_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.plotEntites_.get(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt64(6, this.combatPower_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(7, this.pvpRank_);
         }

         for(int i = 0; i < this.playerInfos_.size(); ++i) {
            output.writeMessage(8, (MessageLite)this.playerInfos_.get(i));
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(9, this.pvpScoreChange_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(10, this.friendState_);
         }

         for(int i = 0; i < this.cooperateBeauty_.size(); ++i) {
            output.writeInt32(11, this.cooperateBeauty_.getInt(i));
         }

         for(int i = 0; i < this.cooperateBeautySkill_.size(); ++i) {
            output.writeInt32(12, this.cooperateBeautySkill_.getInt(i));
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(13, this.friendNation_);
         }

         for(int i = 0; i < this.pet_.size(); ++i) {
            output.writeMessage(14, (MessageLite)this.pet_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.beloogId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(2, this.beloogName_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.force_);
            }

            for(int i = 0; i < this.entites_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.entites_.get(i));
            }

            for(int i = 0; i < this.plotEntites_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.plotEntites_.get(i));
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt64Size(6, this.combatPower_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.pvpRank_);
            }

            for(int i = 0; i < this.playerInfos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(8, (MessageLite)this.playerInfos_.get(i));
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.pvpScoreChange_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.friendState_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.cooperateBeauty_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.cooperateBeauty_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCooperateBeautyList().size();
            dataSize = 0;

            for(int i = 0; i < this.cooperateBeautySkill_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.cooperateBeautySkill_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCooperateBeautySkillList().size();
            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(13, this.friendNation_);
            }

            for(int i = 0; i < this.pet_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(14, (MessageLite)this.pet_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Battle_PKTeam)) {
            return super.equals(obj);
         } else {
            S2C_Battle_PKTeam other = (S2C_Battle_PKTeam)obj;
            if (this.hasBeloogId() != other.hasBeloogId()) {
               return false;
            } else if (this.hasBeloogId() && this.getBeloogId() != other.getBeloogId()) {
               return false;
            } else if (this.hasBeloogName() != other.hasBeloogName()) {
               return false;
            } else if (this.hasBeloogName() && !this.getBeloogName().equals(other.getBeloogName())) {
               return false;
            } else if (this.hasForce() != other.hasForce()) {
               return false;
            } else if (this.hasForce() && this.getForce() != other.getForce()) {
               return false;
            } else if (!this.getEntitesList().equals(other.getEntitesList())) {
               return false;
            } else if (!this.getPlotEntitesList().equals(other.getPlotEntitesList())) {
               return false;
            } else if (this.hasCombatPower() != other.hasCombatPower()) {
               return false;
            } else if (this.hasCombatPower() && this.getCombatPower() != other.getCombatPower()) {
               return false;
            } else if (this.hasPvpRank() != other.hasPvpRank()) {
               return false;
            } else if (this.hasPvpRank() && this.getPvpRank() != other.getPvpRank()) {
               return false;
            } else if (!this.getPlayerInfosList().equals(other.getPlayerInfosList())) {
               return false;
            } else if (this.hasPvpScoreChange() != other.hasPvpScoreChange()) {
               return false;
            } else if (this.hasPvpScoreChange() && this.getPvpScoreChange() != other.getPvpScoreChange()) {
               return false;
            } else if (this.hasFriendState() != other.hasFriendState()) {
               return false;
            } else if (this.hasFriendState() && this.getFriendState() != other.getFriendState()) {
               return false;
            } else if (!this.getCooperateBeautyList().equals(other.getCooperateBeautyList())) {
               return false;
            } else if (!this.getCooperateBeautySkillList().equals(other.getCooperateBeautySkillList())) {
               return false;
            } else if (this.hasFriendNation() != other.hasFriendNation()) {
               return false;
            } else if (this.hasFriendNation() && this.getFriendNation() != other.getFriendNation()) {
               return false;
            } else if (!this.getPetList().equals(other.getPetList())) {
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
            if (this.hasBeloogId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBeloogId();
            }

            if (this.hasBeloogName()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBeloogName().hashCode();
            }

            if (this.hasForce()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getForce();
            }

            if (this.getEntitesCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getEntitesList().hashCode();
            }

            if (this.getPlotEntitesCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getPlotEntitesList().hashCode();
            }

            if (this.hasCombatPower()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashLong(this.getCombatPower());
            }

            if (this.hasPvpRank()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getPvpRank();
            }

            if (this.getPlayerInfosCount() > 0) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getPlayerInfosList().hashCode();
            }

            if (this.hasPvpScoreChange()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getPvpScoreChange();
            }

            if (this.hasFriendState()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getFriendState();
            }

            if (this.getCooperateBeautyCount() > 0) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getCooperateBeautyList().hashCode();
            }

            if (this.getCooperateBeautySkillCount() > 0) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getCooperateBeautySkillList().hashCode();
            }

            if (this.hasFriendNation()) {
               hash = 37 * hash + 13;
               hash = 53 * hash + this.getFriendNation();
            }

            if (this.getPetCount() > 0) {
               hash = 37 * hash + 14;
               hash = 53 * hash + this.getPetList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Battle_PKTeam parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Battle_PKTeam)PARSER.parseFrom(data);
      }

      public static S2C_Battle_PKTeam parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_PKTeam)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_PKTeam parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Battle_PKTeam)PARSER.parseFrom(data);
      }

      public static S2C_Battle_PKTeam parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_PKTeam)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_PKTeam parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Battle_PKTeam)PARSER.parseFrom(data);
      }

      public static S2C_Battle_PKTeam parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_PKTeam)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_PKTeam parseFrom(InputStream input) throws IOException {
         return (S2C_Battle_PKTeam)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Battle_PKTeam parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_PKTeam)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Battle_PKTeam parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Battle_PKTeam)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Battle_PKTeam parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_PKTeam)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Battle_PKTeam parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Battle_PKTeam)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Battle_PKTeam parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_PKTeam)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Battle_PKTeam prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Battle_PKTeam getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Battle_PKTeam> parser() {
         return PARSER;
      }

      public Parser<S2C_Battle_PKTeam> getParserForType() {
         return PARSER;
      }

      public S2C_Battle_PKTeam getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Battle_PKTeamOrBuilder {
         private int bitField0_;
         private int beloogId_;
         private Object beloogName_;
         private int force_;
         private List<S2C_Battle_Entity> entites_;
         private RepeatedFieldBuilderV3<S2C_Battle_Entity, S2C_Battle_Entity.Builder, S2C_Battle_EntityOrBuilder> entitesBuilder_;
         private List<S2C_Battle_Entity> plotEntites_;
         private RepeatedFieldBuilderV3<S2C_Battle_Entity, S2C_Battle_Entity.Builder, S2C_Battle_EntityOrBuilder> plotEntitesBuilder_;
         private long combatPower_;
         private int pvpRank_;
         private List<PlayerMsg.PropertyCell> playerInfos_;
         private RepeatedFieldBuilderV3<PlayerMsg.PropertyCell, PlayerMsg.PropertyCell.Builder, PlayerMsg.PropertyCellOrBuilder> playerInfosBuilder_;
         private int pvpScoreChange_;
         private int friendState_;
         private Internal.IntList cooperateBeauty_;
         private Internal.IntList cooperateBeautySkill_;
         private int friendNation_;
         private List<S2C_Battle_Entity> pet_;
         private RepeatedFieldBuilderV3<S2C_Battle_Entity, S2C_Battle_Entity.Builder, S2C_Battle_EntityOrBuilder> petBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_PKTeam_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_PKTeam_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Battle_PKTeam.class, Builder.class);
         }

         private Builder() {
            this.beloogName_ = "";
            this.entites_ = Collections.emptyList();
            this.plotEntites_ = Collections.emptyList();
            this.playerInfos_ = Collections.emptyList();
            this.cooperateBeauty_ = BattleMsg.S2C_Battle_PKTeam.emptyIntList();
            this.cooperateBeautySkill_ = BattleMsg.S2C_Battle_PKTeam.emptyIntList();
            this.pet_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.beloogName_ = "";
            this.entites_ = Collections.emptyList();
            this.plotEntites_ = Collections.emptyList();
            this.playerInfos_ = Collections.emptyList();
            this.cooperateBeauty_ = BattleMsg.S2C_Battle_PKTeam.emptyIntList();
            this.cooperateBeautySkill_ = BattleMsg.S2C_Battle_PKTeam.emptyIntList();
            this.pet_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.S2C_Battle_PKTeam.alwaysUseFieldBuilders) {
               this.getEntitesFieldBuilder();
               this.getPlotEntitesFieldBuilder();
               this.getPlayerInfosFieldBuilder();
               this.getPetFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.beloogId_ = 0;
            this.bitField0_ &= -2;
            this.beloogName_ = "";
            this.bitField0_ &= -3;
            this.force_ = 0;
            this.bitField0_ &= -5;
            if (this.entitesBuilder_ == null) {
               this.entites_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.entitesBuilder_.clear();
            }

            if (this.plotEntitesBuilder_ == null) {
               this.plotEntites_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.plotEntitesBuilder_.clear();
            }

            this.combatPower_ = 0L;
            this.bitField0_ &= -33;
            this.pvpRank_ = 0;
            this.bitField0_ &= -65;
            if (this.playerInfosBuilder_ == null) {
               this.playerInfos_ = Collections.emptyList();
               this.bitField0_ &= -129;
            } else {
               this.playerInfosBuilder_.clear();
            }

            this.pvpScoreChange_ = 0;
            this.bitField0_ &= -257;
            this.friendState_ = 0;
            this.bitField0_ &= -513;
            this.cooperateBeauty_ = BattleMsg.S2C_Battle_PKTeam.emptyIntList();
            this.bitField0_ &= -1025;
            this.cooperateBeautySkill_ = BattleMsg.S2C_Battle_PKTeam.emptyIntList();
            this.bitField0_ &= -2049;
            this.friendNation_ = 0;
            this.bitField0_ &= -4097;
            if (this.petBuilder_ == null) {
               this.pet_ = Collections.emptyList();
               this.bitField0_ &= -8193;
            } else {
               this.petBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_PKTeam_descriptor;
         }

         public S2C_Battle_PKTeam getDefaultInstanceForType() {
            return BattleMsg.S2C_Battle_PKTeam.getDefaultInstance();
         }

         public S2C_Battle_PKTeam build() {
            S2C_Battle_PKTeam result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Battle_PKTeam buildPartial() {
            S2C_Battle_PKTeam result = new S2C_Battle_PKTeam(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.beloogId_ = this.beloogId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.beloogName_ = this.beloogName_;
            if ((from_bitField0_ & 4) != 0) {
               result.force_ = this.force_;
               to_bitField0_ |= 4;
            }

            if (this.entitesBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.entites_ = Collections.unmodifiableList(this.entites_);
                  this.bitField0_ &= -9;
               }

               result.entites_ = this.entites_;
            } else {
               result.entites_ = this.entitesBuilder_.build();
            }

            if (this.plotEntitesBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.plotEntites_ = Collections.unmodifiableList(this.plotEntites_);
                  this.bitField0_ &= -17;
               }

               result.plotEntites_ = this.plotEntites_;
            } else {
               result.plotEntites_ = this.plotEntitesBuilder_.build();
            }

            if ((from_bitField0_ & 32) != 0) {
               result.combatPower_ = this.combatPower_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.pvpRank_ = this.pvpRank_;
               to_bitField0_ |= 16;
            }

            if (this.playerInfosBuilder_ == null) {
               if ((this.bitField0_ & 128) != 0) {
                  this.playerInfos_ = Collections.unmodifiableList(this.playerInfos_);
                  this.bitField0_ &= -129;
               }

               result.playerInfos_ = this.playerInfos_;
            } else {
               result.playerInfos_ = this.playerInfosBuilder_.build();
            }

            if ((from_bitField0_ & 256) != 0) {
               result.pvpScoreChange_ = this.pvpScoreChange_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.friendState_ = this.friendState_;
               to_bitField0_ |= 64;
            }

            if ((this.bitField0_ & 1024) != 0) {
               this.cooperateBeauty_.makeImmutable();
               this.bitField0_ &= -1025;
            }

            result.cooperateBeauty_ = this.cooperateBeauty_;
            if ((this.bitField0_ & 2048) != 0) {
               this.cooperateBeautySkill_.makeImmutable();
               this.bitField0_ &= -2049;
            }

            result.cooperateBeautySkill_ = this.cooperateBeautySkill_;
            if ((from_bitField0_ & 4096) != 0) {
               result.friendNation_ = this.friendNation_;
               to_bitField0_ |= 128;
            }

            if (this.petBuilder_ == null) {
               if ((this.bitField0_ & 8192) != 0) {
                  this.pet_ = Collections.unmodifiableList(this.pet_);
                  this.bitField0_ &= -8193;
               }

               result.pet_ = this.pet_;
            } else {
               result.pet_ = this.petBuilder_.build();
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
            if (other instanceof S2C_Battle_PKTeam) {
               return this.mergeFrom((S2C_Battle_PKTeam)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Battle_PKTeam other) {
            if (other == BattleMsg.S2C_Battle_PKTeam.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBeloogId()) {
                  this.setBeloogId(other.getBeloogId());
               }

               if (other.hasBeloogName()) {
                  this.bitField0_ |= 2;
                  this.beloogName_ = other.beloogName_;
                  this.onChanged();
               }

               if (other.hasForce()) {
                  this.setForce(other.getForce());
               }

               if (this.entitesBuilder_ == null) {
                  if (!other.entites_.isEmpty()) {
                     if (this.entites_.isEmpty()) {
                        this.entites_ = other.entites_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureEntitesIsMutable();
                        this.entites_.addAll(other.entites_);
                     }

                     this.onChanged();
                  }
               } else if (!other.entites_.isEmpty()) {
                  if (this.entitesBuilder_.isEmpty()) {
                     this.entitesBuilder_.dispose();
                     this.entitesBuilder_ = null;
                     this.entites_ = other.entites_;
                     this.bitField0_ &= -9;
                     this.entitesBuilder_ = BattleMsg.S2C_Battle_PKTeam.alwaysUseFieldBuilders ? this.getEntitesFieldBuilder() : null;
                  } else {
                     this.entitesBuilder_.addAllMessages(other.entites_);
                  }
               }

               if (this.plotEntitesBuilder_ == null) {
                  if (!other.plotEntites_.isEmpty()) {
                     if (this.plotEntites_.isEmpty()) {
                        this.plotEntites_ = other.plotEntites_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensurePlotEntitesIsMutable();
                        this.plotEntites_.addAll(other.plotEntites_);
                     }

                     this.onChanged();
                  }
               } else if (!other.plotEntites_.isEmpty()) {
                  if (this.plotEntitesBuilder_.isEmpty()) {
                     this.plotEntitesBuilder_.dispose();
                     this.plotEntitesBuilder_ = null;
                     this.plotEntites_ = other.plotEntites_;
                     this.bitField0_ &= -17;
                     this.plotEntitesBuilder_ = BattleMsg.S2C_Battle_PKTeam.alwaysUseFieldBuilders ? this.getPlotEntitesFieldBuilder() : null;
                  } else {
                     this.plotEntitesBuilder_.addAllMessages(other.plotEntites_);
                  }
               }

               if (other.hasCombatPower()) {
                  this.setCombatPower(other.getCombatPower());
               }

               if (other.hasPvpRank()) {
                  this.setPvpRank(other.getPvpRank());
               }

               if (this.playerInfosBuilder_ == null) {
                  if (!other.playerInfos_.isEmpty()) {
                     if (this.playerInfos_.isEmpty()) {
                        this.playerInfos_ = other.playerInfos_;
                        this.bitField0_ &= -129;
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
                     this.bitField0_ &= -129;
                     this.playerInfosBuilder_ = BattleMsg.S2C_Battle_PKTeam.alwaysUseFieldBuilders ? this.getPlayerInfosFieldBuilder() : null;
                  } else {
                     this.playerInfosBuilder_.addAllMessages(other.playerInfos_);
                  }
               }

               if (other.hasPvpScoreChange()) {
                  this.setPvpScoreChange(other.getPvpScoreChange());
               }

               if (other.hasFriendState()) {
                  this.setFriendState(other.getFriendState());
               }

               if (!other.cooperateBeauty_.isEmpty()) {
                  if (this.cooperateBeauty_.isEmpty()) {
                     this.cooperateBeauty_ = other.cooperateBeauty_;
                     this.bitField0_ &= -1025;
                  } else {
                     this.ensureCooperateBeautyIsMutable();
                     this.cooperateBeauty_.addAll(other.cooperateBeauty_);
                  }

                  this.onChanged();
               }

               if (!other.cooperateBeautySkill_.isEmpty()) {
                  if (this.cooperateBeautySkill_.isEmpty()) {
                     this.cooperateBeautySkill_ = other.cooperateBeautySkill_;
                     this.bitField0_ &= -2049;
                  } else {
                     this.ensureCooperateBeautySkillIsMutable();
                     this.cooperateBeautySkill_.addAll(other.cooperateBeautySkill_);
                  }

                  this.onChanged();
               }

               if (other.hasFriendNation()) {
                  this.setFriendNation(other.getFriendNation());
               }

               if (this.petBuilder_ == null) {
                  if (!other.pet_.isEmpty()) {
                     if (this.pet_.isEmpty()) {
                        this.pet_ = other.pet_;
                        this.bitField0_ &= -8193;
                     } else {
                        this.ensurePetIsMutable();
                        this.pet_.addAll(other.pet_);
                     }

                     this.onChanged();
                  }
               } else if (!other.pet_.isEmpty()) {
                  if (this.petBuilder_.isEmpty()) {
                     this.petBuilder_.dispose();
                     this.petBuilder_ = null;
                     this.pet_ = other.pet_;
                     this.bitField0_ &= -8193;
                     this.petBuilder_ = BattleMsg.S2C_Battle_PKTeam.alwaysUseFieldBuilders ? this.getPetFieldBuilder() : null;
                  } else {
                     this.petBuilder_.addAllMessages(other.pet_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBeloogId()) {
               return false;
            } else if (!this.hasBeloogName()) {
               return false;
            } else if (!this.hasForce()) {
               return false;
            } else {
               for(int i = 0; i < this.getEntitesCount(); ++i) {
                  if (!this.getEntites(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getPlotEntitesCount(); ++i) {
                  if (!this.getPlotEntites(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getPlayerInfosCount(); ++i) {
                  if (!this.getPlayerInfos(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getPetCount(); ++i) {
                  if (!this.getPet(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Battle_PKTeam parsedMessage = null;

            try {
               parsedMessage = (S2C_Battle_PKTeam)BattleMsg.S2C_Battle_PKTeam.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Battle_PKTeam)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBeloogId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBeloogId() {
            return this.beloogId_;
         }

         public Builder setBeloogId(int value) {
            this.bitField0_ |= 1;
            this.beloogId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeloogId() {
            this.bitField0_ &= -2;
            this.beloogId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBeloogName() {
            return (this.bitField0_ & 2) != 0;
         }

         public String getBeloogName() {
            Object ref = this.beloogName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.beloogName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getBeloogNameBytes() {
            Object ref = this.beloogName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.beloogName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setBeloogName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.beloogName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearBeloogName() {
            this.bitField0_ &= -3;
            this.beloogName_ = BattleMsg.S2C_Battle_PKTeam.getDefaultInstance().getBeloogName();
            this.onChanged();
            return this;
         }

         public Builder setBeloogNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.beloogName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasForce() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getForce() {
            return this.force_;
         }

         public Builder setForce(int value) {
            this.bitField0_ |= 4;
            this.force_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearForce() {
            this.bitField0_ &= -5;
            this.force_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureEntitesIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.entites_ = new ArrayList(this.entites_);
               this.bitField0_ |= 8;
            }

         }

         public List<S2C_Battle_Entity> getEntitesList() {
            return this.entitesBuilder_ == null ? Collections.unmodifiableList(this.entites_) : this.entitesBuilder_.getMessageList();
         }

         public int getEntitesCount() {
            return this.entitesBuilder_ == null ? this.entites_.size() : this.entitesBuilder_.getCount();
         }

         public S2C_Battle_Entity getEntites(int index) {
            return this.entitesBuilder_ == null ? (S2C_Battle_Entity)this.entites_.get(index) : (S2C_Battle_Entity)this.entitesBuilder_.getMessage(index);
         }

         public Builder setEntites(int index, S2C_Battle_Entity value) {
            if (this.entitesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEntitesIsMutable();
               this.entites_.set(index, value);
               this.onChanged();
            } else {
               this.entitesBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setEntites(int index, S2C_Battle_Entity.Builder builderForValue) {
            if (this.entitesBuilder_ == null) {
               this.ensureEntitesIsMutable();
               this.entites_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.entitesBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addEntites(S2C_Battle_Entity value) {
            if (this.entitesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEntitesIsMutable();
               this.entites_.add(value);
               this.onChanged();
            } else {
               this.entitesBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addEntites(int index, S2C_Battle_Entity value) {
            if (this.entitesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEntitesIsMutable();
               this.entites_.add(index, value);
               this.onChanged();
            } else {
               this.entitesBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addEntites(S2C_Battle_Entity.Builder builderForValue) {
            if (this.entitesBuilder_ == null) {
               this.ensureEntitesIsMutable();
               this.entites_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.entitesBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addEntites(int index, S2C_Battle_Entity.Builder builderForValue) {
            if (this.entitesBuilder_ == null) {
               this.ensureEntitesIsMutable();
               this.entites_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.entitesBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllEntites(Iterable<? extends S2C_Battle_Entity> values) {
            if (this.entitesBuilder_ == null) {
               this.ensureEntitesIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.entites_);
               this.onChanged();
            } else {
               this.entitesBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearEntites() {
            if (this.entitesBuilder_ == null) {
               this.entites_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.entitesBuilder_.clear();
            }

            return this;
         }

         public Builder removeEntites(int index) {
            if (this.entitesBuilder_ == null) {
               this.ensureEntitesIsMutable();
               this.entites_.remove(index);
               this.onChanged();
            } else {
               this.entitesBuilder_.remove(index);
            }

            return this;
         }

         public S2C_Battle_Entity.Builder getEntitesBuilder(int index) {
            return (S2C_Battle_Entity.Builder)this.getEntitesFieldBuilder().getBuilder(index);
         }

         public S2C_Battle_EntityOrBuilder getEntitesOrBuilder(int index) {
            return this.entitesBuilder_ == null ? (S2C_Battle_EntityOrBuilder)this.entites_.get(index) : (S2C_Battle_EntityOrBuilder)this.entitesBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends S2C_Battle_EntityOrBuilder> getEntitesOrBuilderList() {
            return this.entitesBuilder_ != null ? this.entitesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.entites_);
         }

         public S2C_Battle_Entity.Builder addEntitesBuilder() {
            return (S2C_Battle_Entity.Builder)this.getEntitesFieldBuilder().addBuilder(BattleMsg.S2C_Battle_Entity.getDefaultInstance());
         }

         public S2C_Battle_Entity.Builder addEntitesBuilder(int index) {
            return (S2C_Battle_Entity.Builder)this.getEntitesFieldBuilder().addBuilder(index, BattleMsg.S2C_Battle_Entity.getDefaultInstance());
         }

         public List<S2C_Battle_Entity.Builder> getEntitesBuilderList() {
            return this.getEntitesFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<S2C_Battle_Entity, S2C_Battle_Entity.Builder, S2C_Battle_EntityOrBuilder> getEntitesFieldBuilder() {
            if (this.entitesBuilder_ == null) {
               this.entitesBuilder_ = new RepeatedFieldBuilderV3(this.entites_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.entites_ = null;
            }

            return this.entitesBuilder_;
         }

         private void ensurePlotEntitesIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.plotEntites_ = new ArrayList(this.plotEntites_);
               this.bitField0_ |= 16;
            }

         }

         public List<S2C_Battle_Entity> getPlotEntitesList() {
            return this.plotEntitesBuilder_ == null ? Collections.unmodifiableList(this.plotEntites_) : this.plotEntitesBuilder_.getMessageList();
         }

         public int getPlotEntitesCount() {
            return this.plotEntitesBuilder_ == null ? this.plotEntites_.size() : this.plotEntitesBuilder_.getCount();
         }

         public S2C_Battle_Entity getPlotEntites(int index) {
            return this.plotEntitesBuilder_ == null ? (S2C_Battle_Entity)this.plotEntites_.get(index) : (S2C_Battle_Entity)this.plotEntitesBuilder_.getMessage(index);
         }

         public Builder setPlotEntites(int index, S2C_Battle_Entity value) {
            if (this.plotEntitesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlotEntitesIsMutable();
               this.plotEntites_.set(index, value);
               this.onChanged();
            } else {
               this.plotEntitesBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPlotEntites(int index, S2C_Battle_Entity.Builder builderForValue) {
            if (this.plotEntitesBuilder_ == null) {
               this.ensurePlotEntitesIsMutable();
               this.plotEntites_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.plotEntitesBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPlotEntites(S2C_Battle_Entity value) {
            if (this.plotEntitesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlotEntitesIsMutable();
               this.plotEntites_.add(value);
               this.onChanged();
            } else {
               this.plotEntitesBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPlotEntites(int index, S2C_Battle_Entity value) {
            if (this.plotEntitesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlotEntitesIsMutable();
               this.plotEntites_.add(index, value);
               this.onChanged();
            } else {
               this.plotEntitesBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPlotEntites(S2C_Battle_Entity.Builder builderForValue) {
            if (this.plotEntitesBuilder_ == null) {
               this.ensurePlotEntitesIsMutable();
               this.plotEntites_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.plotEntitesBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPlotEntites(int index, S2C_Battle_Entity.Builder builderForValue) {
            if (this.plotEntitesBuilder_ == null) {
               this.ensurePlotEntitesIsMutable();
               this.plotEntites_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.plotEntitesBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPlotEntites(Iterable<? extends S2C_Battle_Entity> values) {
            if (this.plotEntitesBuilder_ == null) {
               this.ensurePlotEntitesIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.plotEntites_);
               this.onChanged();
            } else {
               this.plotEntitesBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPlotEntites() {
            if (this.plotEntitesBuilder_ == null) {
               this.plotEntites_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.plotEntitesBuilder_.clear();
            }

            return this;
         }

         public Builder removePlotEntites(int index) {
            if (this.plotEntitesBuilder_ == null) {
               this.ensurePlotEntitesIsMutable();
               this.plotEntites_.remove(index);
               this.onChanged();
            } else {
               this.plotEntitesBuilder_.remove(index);
            }

            return this;
         }

         public S2C_Battle_Entity.Builder getPlotEntitesBuilder(int index) {
            return (S2C_Battle_Entity.Builder)this.getPlotEntitesFieldBuilder().getBuilder(index);
         }

         public S2C_Battle_EntityOrBuilder getPlotEntitesOrBuilder(int index) {
            return this.plotEntitesBuilder_ == null ? (S2C_Battle_EntityOrBuilder)this.plotEntites_.get(index) : (S2C_Battle_EntityOrBuilder)this.plotEntitesBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends S2C_Battle_EntityOrBuilder> getPlotEntitesOrBuilderList() {
            return this.plotEntitesBuilder_ != null ? this.plotEntitesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.plotEntites_);
         }

         public S2C_Battle_Entity.Builder addPlotEntitesBuilder() {
            return (S2C_Battle_Entity.Builder)this.getPlotEntitesFieldBuilder().addBuilder(BattleMsg.S2C_Battle_Entity.getDefaultInstance());
         }

         public S2C_Battle_Entity.Builder addPlotEntitesBuilder(int index) {
            return (S2C_Battle_Entity.Builder)this.getPlotEntitesFieldBuilder().addBuilder(index, BattleMsg.S2C_Battle_Entity.getDefaultInstance());
         }

         public List<S2C_Battle_Entity.Builder> getPlotEntitesBuilderList() {
            return this.getPlotEntitesFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<S2C_Battle_Entity, S2C_Battle_Entity.Builder, S2C_Battle_EntityOrBuilder> getPlotEntitesFieldBuilder() {
            if (this.plotEntitesBuilder_ == null) {
               this.plotEntitesBuilder_ = new RepeatedFieldBuilderV3(this.plotEntites_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.plotEntites_ = null;
            }

            return this.plotEntitesBuilder_;
         }

         public boolean hasCombatPower() {
            return (this.bitField0_ & 32) != 0;
         }

         public long getCombatPower() {
            return this.combatPower_;
         }

         public Builder setCombatPower(long value) {
            this.bitField0_ |= 32;
            this.combatPower_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCombatPower() {
            this.bitField0_ &= -33;
            this.combatPower_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasPvpRank() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getPvpRank() {
            return this.pvpRank_;
         }

         public Builder setPvpRank(int value) {
            this.bitField0_ |= 64;
            this.pvpRank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPvpRank() {
            this.bitField0_ &= -65;
            this.pvpRank_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePlayerInfosIsMutable() {
            if ((this.bitField0_ & 128) == 0) {
               this.playerInfos_ = new ArrayList(this.playerInfos_);
               this.bitField0_ |= 128;
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
               this.bitField0_ &= -129;
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
               this.playerInfosBuilder_ = new RepeatedFieldBuilderV3(this.playerInfos_, (this.bitField0_ & 128) != 0, this.getParentForChildren(), this.isClean());
               this.playerInfos_ = null;
            }

            return this.playerInfosBuilder_;
         }

         public boolean hasPvpScoreChange() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getPvpScoreChange() {
            return this.pvpScoreChange_;
         }

         public Builder setPvpScoreChange(int value) {
            this.bitField0_ |= 256;
            this.pvpScoreChange_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPvpScoreChange() {
            this.bitField0_ &= -257;
            this.pvpScoreChange_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFriendState() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getFriendState() {
            return this.friendState_;
         }

         public Builder setFriendState(int value) {
            this.bitField0_ |= 512;
            this.friendState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFriendState() {
            this.bitField0_ &= -513;
            this.friendState_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureCooperateBeautyIsMutable() {
            if ((this.bitField0_ & 1024) == 0) {
               this.cooperateBeauty_ = BattleMsg.S2C_Battle_PKTeam.mutableCopy(this.cooperateBeauty_);
               this.bitField0_ |= 1024;
            }

         }

         public List<Integer> getCooperateBeautyList() {
            return (List<Integer>)((this.bitField0_ & 1024) != 0 ? Collections.unmodifiableList(this.cooperateBeauty_) : this.cooperateBeauty_);
         }

         public int getCooperateBeautyCount() {
            return this.cooperateBeauty_.size();
         }

         public int getCooperateBeauty(int index) {
            return this.cooperateBeauty_.getInt(index);
         }

         public Builder setCooperateBeauty(int index, int value) {
            this.ensureCooperateBeautyIsMutable();
            this.cooperateBeauty_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCooperateBeauty(int value) {
            this.ensureCooperateBeautyIsMutable();
            this.cooperateBeauty_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCooperateBeauty(Iterable<? extends Integer> values) {
            this.ensureCooperateBeautyIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.cooperateBeauty_);
            this.onChanged();
            return this;
         }

         public Builder clearCooperateBeauty() {
            this.cooperateBeauty_ = BattleMsg.S2C_Battle_PKTeam.emptyIntList();
            this.bitField0_ &= -1025;
            this.onChanged();
            return this;
         }

         private void ensureCooperateBeautySkillIsMutable() {
            if ((this.bitField0_ & 2048) == 0) {
               this.cooperateBeautySkill_ = BattleMsg.S2C_Battle_PKTeam.mutableCopy(this.cooperateBeautySkill_);
               this.bitField0_ |= 2048;
            }

         }

         public List<Integer> getCooperateBeautySkillList() {
            return (List<Integer>)((this.bitField0_ & 2048) != 0 ? Collections.unmodifiableList(this.cooperateBeautySkill_) : this.cooperateBeautySkill_);
         }

         public int getCooperateBeautySkillCount() {
            return this.cooperateBeautySkill_.size();
         }

         public int getCooperateBeautySkill(int index) {
            return this.cooperateBeautySkill_.getInt(index);
         }

         public Builder setCooperateBeautySkill(int index, int value) {
            this.ensureCooperateBeautySkillIsMutable();
            this.cooperateBeautySkill_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCooperateBeautySkill(int value) {
            this.ensureCooperateBeautySkillIsMutable();
            this.cooperateBeautySkill_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCooperateBeautySkill(Iterable<? extends Integer> values) {
            this.ensureCooperateBeautySkillIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.cooperateBeautySkill_);
            this.onChanged();
            return this;
         }

         public Builder clearCooperateBeautySkill() {
            this.cooperateBeautySkill_ = BattleMsg.S2C_Battle_PKTeam.emptyIntList();
            this.bitField0_ &= -2049;
            this.onChanged();
            return this;
         }

         public boolean hasFriendNation() {
            return (this.bitField0_ & 4096) != 0;
         }

         public int getFriendNation() {
            return this.friendNation_;
         }

         public Builder setFriendNation(int value) {
            this.bitField0_ |= 4096;
            this.friendNation_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFriendNation() {
            this.bitField0_ &= -4097;
            this.friendNation_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePetIsMutable() {
            if ((this.bitField0_ & 8192) == 0) {
               this.pet_ = new ArrayList(this.pet_);
               this.bitField0_ |= 8192;
            }

         }

         public List<S2C_Battle_Entity> getPetList() {
            return this.petBuilder_ == null ? Collections.unmodifiableList(this.pet_) : this.petBuilder_.getMessageList();
         }

         public int getPetCount() {
            return this.petBuilder_ == null ? this.pet_.size() : this.petBuilder_.getCount();
         }

         public S2C_Battle_Entity getPet(int index) {
            return this.petBuilder_ == null ? (S2C_Battle_Entity)this.pet_.get(index) : (S2C_Battle_Entity)this.petBuilder_.getMessage(index);
         }

         public Builder setPet(int index, S2C_Battle_Entity value) {
            if (this.petBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePetIsMutable();
               this.pet_.set(index, value);
               this.onChanged();
            } else {
               this.petBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPet(int index, S2C_Battle_Entity.Builder builderForValue) {
            if (this.petBuilder_ == null) {
               this.ensurePetIsMutable();
               this.pet_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.petBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPet(S2C_Battle_Entity value) {
            if (this.petBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePetIsMutable();
               this.pet_.add(value);
               this.onChanged();
            } else {
               this.petBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPet(int index, S2C_Battle_Entity value) {
            if (this.petBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePetIsMutable();
               this.pet_.add(index, value);
               this.onChanged();
            } else {
               this.petBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPet(S2C_Battle_Entity.Builder builderForValue) {
            if (this.petBuilder_ == null) {
               this.ensurePetIsMutable();
               this.pet_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.petBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPet(int index, S2C_Battle_Entity.Builder builderForValue) {
            if (this.petBuilder_ == null) {
               this.ensurePetIsMutable();
               this.pet_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.petBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPet(Iterable<? extends S2C_Battle_Entity> values) {
            if (this.petBuilder_ == null) {
               this.ensurePetIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.pet_);
               this.onChanged();
            } else {
               this.petBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPet() {
            if (this.petBuilder_ == null) {
               this.pet_ = Collections.emptyList();
               this.bitField0_ &= -8193;
               this.onChanged();
            } else {
               this.petBuilder_.clear();
            }

            return this;
         }

         public Builder removePet(int index) {
            if (this.petBuilder_ == null) {
               this.ensurePetIsMutable();
               this.pet_.remove(index);
               this.onChanged();
            } else {
               this.petBuilder_.remove(index);
            }

            return this;
         }

         public S2C_Battle_Entity.Builder getPetBuilder(int index) {
            return (S2C_Battle_Entity.Builder)this.getPetFieldBuilder().getBuilder(index);
         }

         public S2C_Battle_EntityOrBuilder getPetOrBuilder(int index) {
            return this.petBuilder_ == null ? (S2C_Battle_EntityOrBuilder)this.pet_.get(index) : (S2C_Battle_EntityOrBuilder)this.petBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends S2C_Battle_EntityOrBuilder> getPetOrBuilderList() {
            return this.petBuilder_ != null ? this.petBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.pet_);
         }

         public S2C_Battle_Entity.Builder addPetBuilder() {
            return (S2C_Battle_Entity.Builder)this.getPetFieldBuilder().addBuilder(BattleMsg.S2C_Battle_Entity.getDefaultInstance());
         }

         public S2C_Battle_Entity.Builder addPetBuilder(int index) {
            return (S2C_Battle_Entity.Builder)this.getPetFieldBuilder().addBuilder(index, BattleMsg.S2C_Battle_Entity.getDefaultInstance());
         }

         public List<S2C_Battle_Entity.Builder> getPetBuilderList() {
            return this.getPetFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<S2C_Battle_Entity, S2C_Battle_Entity.Builder, S2C_Battle_EntityOrBuilder> getPetFieldBuilder() {
            if (this.petBuilder_ == null) {
               this.petBuilder_ = new RepeatedFieldBuilderV3(this.pet_, (this.bitField0_ & 8192) != 0, this.getParentForChildren(), this.isClean());
               this.pet_ = null;
            }

            return this.petBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_Battle_Apportion extends GeneratedMessageV3 implements S2C_Battle_ApportionOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TARGETBATTLEPOS_FIELD_NUMBER = 1;
      private int targetBattlePos_;
      public static final int EFFECTVALUE_FIELD_NUMBER = 2;
      private int effectValue_;
      public static final int FINALVALUE_FIELD_NUMBER = 3;
      private int finalValue_;
      private byte memoizedIsInitialized;
      private static final S2C_Battle_Apportion DEFAULT_INSTANCE = new S2C_Battle_Apportion();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Battle_Apportion> PARSER = new AbstractParser<S2C_Battle_Apportion>() {
         public S2C_Battle_Apportion parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Battle_Apportion(input, extensionRegistry);
         }
      };

      private S2C_Battle_Apportion(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Battle_Apportion() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Battle_Apportion();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Battle_Apportion(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.targetBattlePos_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.effectValue_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.finalValue_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Apportion_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Apportion_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Battle_Apportion.class, Builder.class);
      }

      public boolean hasTargetBattlePos() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTargetBattlePos() {
         return this.targetBattlePos_;
      }

      public boolean hasEffectValue() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEffectValue() {
         return this.effectValue_;
      }

      public boolean hasFinalValue() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getFinalValue() {
         return this.finalValue_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTargetBattlePos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFinalValue()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.targetBattlePos_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.effectValue_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.finalValue_);
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
               size += CodedOutputStream.computeInt32Size(1, this.targetBattlePos_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.effectValue_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.finalValue_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Battle_Apportion)) {
            return super.equals(obj);
         } else {
            S2C_Battle_Apportion other = (S2C_Battle_Apportion)obj;
            if (this.hasTargetBattlePos() != other.hasTargetBattlePos()) {
               return false;
            } else if (this.hasTargetBattlePos() && this.getTargetBattlePos() != other.getTargetBattlePos()) {
               return false;
            } else if (this.hasEffectValue() != other.hasEffectValue()) {
               return false;
            } else if (this.hasEffectValue() && this.getEffectValue() != other.getEffectValue()) {
               return false;
            } else if (this.hasFinalValue() != other.hasFinalValue()) {
               return false;
            } else if (this.hasFinalValue() && this.getFinalValue() != other.getFinalValue()) {
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
            if (this.hasTargetBattlePos()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTargetBattlePos();
            }

            if (this.hasEffectValue()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEffectValue();
            }

            if (this.hasFinalValue()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getFinalValue();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Battle_Apportion parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Battle_Apportion)PARSER.parseFrom(data);
      }

      public static S2C_Battle_Apportion parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_Apportion)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_Apportion parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Battle_Apportion)PARSER.parseFrom(data);
      }

      public static S2C_Battle_Apportion parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_Apportion)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_Apportion parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Battle_Apportion)PARSER.parseFrom(data);
      }

      public static S2C_Battle_Apportion parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_Apportion)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_Apportion parseFrom(InputStream input) throws IOException {
         return (S2C_Battle_Apportion)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Battle_Apportion parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_Apportion)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Battle_Apportion parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Battle_Apportion)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Battle_Apportion parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_Apportion)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Battle_Apportion parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Battle_Apportion)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Battle_Apportion parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_Apportion)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Battle_Apportion prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Battle_Apportion getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Battle_Apportion> parser() {
         return PARSER;
      }

      public Parser<S2C_Battle_Apportion> getParserForType() {
         return PARSER;
      }

      public S2C_Battle_Apportion getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Battle_ApportionOrBuilder {
         private int bitField0_;
         private int targetBattlePos_;
         private int effectValue_;
         private int finalValue_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Apportion_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Apportion_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Battle_Apportion.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.S2C_Battle_Apportion.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.targetBattlePos_ = 0;
            this.bitField0_ &= -2;
            this.effectValue_ = 0;
            this.bitField0_ &= -3;
            this.finalValue_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Apportion_descriptor;
         }

         public S2C_Battle_Apportion getDefaultInstanceForType() {
            return BattleMsg.S2C_Battle_Apportion.getDefaultInstance();
         }

         public S2C_Battle_Apportion build() {
            S2C_Battle_Apportion result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Battle_Apportion buildPartial() {
            S2C_Battle_Apportion result = new S2C_Battle_Apportion(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.targetBattlePos_ = this.targetBattlePos_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.effectValue_ = this.effectValue_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.finalValue_ = this.finalValue_;
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
            if (other instanceof S2C_Battle_Apportion) {
               return this.mergeFrom((S2C_Battle_Apportion)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Battle_Apportion other) {
            if (other == BattleMsg.S2C_Battle_Apportion.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTargetBattlePos()) {
                  this.setTargetBattlePos(other.getTargetBattlePos());
               }

               if (other.hasEffectValue()) {
                  this.setEffectValue(other.getEffectValue());
               }

               if (other.hasFinalValue()) {
                  this.setFinalValue(other.getFinalValue());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTargetBattlePos()) {
               return false;
            } else {
               return this.hasFinalValue();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Battle_Apportion parsedMessage = null;

            try {
               parsedMessage = (S2C_Battle_Apportion)BattleMsg.S2C_Battle_Apportion.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Battle_Apportion)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTargetBattlePos() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTargetBattlePos() {
            return this.targetBattlePos_;
         }

         public Builder setTargetBattlePos(int value) {
            this.bitField0_ |= 1;
            this.targetBattlePos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTargetBattlePos() {
            this.bitField0_ &= -2;
            this.targetBattlePos_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEffectValue() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getEffectValue() {
            return this.effectValue_;
         }

         public Builder setEffectValue(int value) {
            this.bitField0_ |= 2;
            this.effectValue_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEffectValue() {
            this.bitField0_ &= -3;
            this.effectValue_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFinalValue() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getFinalValue() {
            return this.finalValue_;
         }

         public Builder setFinalValue(int value) {
            this.bitField0_ |= 4;
            this.finalValue_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFinalValue() {
            this.bitField0_ &= -5;
            this.finalValue_ = 0;
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

   public static final class S2C_Battle_Effect extends GeneratedMessageV3 implements S2C_Battle_EffectOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int EFFECTTYPE_FIELD_NUMBER = 1;
      private int effectType_;
      public static final int TARGETBATTLEPOS_FIELD_NUMBER = 2;
      private int targetBattlePos_;
      public static final int EFFECTID_FIELD_NUMBER = 3;
      private int effectId_;
      public static final int EFFECTCODE_FIELD_NUMBER = 4;
      private int effectCode_;
      public static final int EFFECTVALUE_FIELD_NUMBER = 5;
      private long effectValue_;
      public static final int FINALVALUE_FIELD_NUMBER = 6;
      private long finalValue_;
      public static final int CRIT_FIELD_NUMBER = 7;
      private int crit_;
      public static final int TIME_FIELD_NUMBER = 8;
      private int time_;
      public static final int APPORTION_FIELD_NUMBER = 9;
      private List<S2C_Battle_Apportion> apportion_;
      public static final int EFFECTSETID_FIELD_NUMBER = 10;
      private int effectSetId_;
      private byte memoizedIsInitialized;
      private static final S2C_Battle_Effect DEFAULT_INSTANCE = new S2C_Battle_Effect();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Battle_Effect> PARSER = new AbstractParser<S2C_Battle_Effect>() {
         public S2C_Battle_Effect parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Battle_Effect(input, extensionRegistry);
         }
      };

      private S2C_Battle_Effect(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Battle_Effect() {
         this.memoizedIsInitialized = -1;
         this.apportion_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Battle_Effect();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Battle_Effect(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.effectType_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.targetBattlePos_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.effectId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.effectCode_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.effectValue_ = input.readInt64();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.finalValue_ = input.readInt64();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.crit_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.time_ = input.readInt32();
                        break;
                     case 74:
                        if ((mutable_bitField0_ & 256) == 0) {
                           this.apportion_ = new ArrayList();
                           mutable_bitField0_ |= 256;
                        }

                        this.apportion_.add(input.readMessage(BattleMsg.S2C_Battle_Apportion.PARSER, extensionRegistry));
                        break;
                     case 80:
                        this.bitField0_ |= 256;
                        this.effectSetId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 256) != 0) {
                  this.apportion_ = Collections.unmodifiableList(this.apportion_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Effect_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Effect_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Battle_Effect.class, Builder.class);
      }

      public boolean hasEffectType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getEffectType() {
         return this.effectType_;
      }

      public boolean hasTargetBattlePos() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTargetBattlePos() {
         return this.targetBattlePos_;
      }

      public boolean hasEffectId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getEffectId() {
         return this.effectId_;
      }

      public boolean hasEffectCode() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getEffectCode() {
         return this.effectCode_;
      }

      public boolean hasEffectValue() {
         return (this.bitField0_ & 16) != 0;
      }

      public long getEffectValue() {
         return this.effectValue_;
      }

      public boolean hasFinalValue() {
         return (this.bitField0_ & 32) != 0;
      }

      public long getFinalValue() {
         return this.finalValue_;
      }

      public boolean hasCrit() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getCrit() {
         return this.crit_;
      }

      public boolean hasTime() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getTime() {
         return this.time_;
      }

      public List<S2C_Battle_Apportion> getApportionList() {
         return this.apportion_;
      }

      public List<? extends S2C_Battle_ApportionOrBuilder> getApportionOrBuilderList() {
         return this.apportion_;
      }

      public int getApportionCount() {
         return this.apportion_.size();
      }

      public S2C_Battle_Apportion getApportion(int index) {
         return (S2C_Battle_Apportion)this.apportion_.get(index);
      }

      public S2C_Battle_ApportionOrBuilder getApportionOrBuilder(int index) {
         return (S2C_Battle_ApportionOrBuilder)this.apportion_.get(index);
      }

      public boolean hasEffectSetId() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getEffectSetId() {
         return this.effectSetId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasEffectType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTargetBattlePos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getApportionCount(); ++i) {
               if (!this.getApportion(i).isInitialized()) {
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
            output.writeInt32(1, this.effectType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.targetBattlePos_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.effectId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.effectCode_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt64(5, this.effectValue_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt64(6, this.finalValue_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.crit_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.time_);
         }

         for(int i = 0; i < this.apportion_.size(); ++i) {
            output.writeMessage(9, (MessageLite)this.apportion_.get(i));
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(10, this.effectSetId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.effectType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.targetBattlePos_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.effectId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.effectCode_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt64Size(5, this.effectValue_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt64Size(6, this.finalValue_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.crit_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.time_);
            }

            for(int i = 0; i < this.apportion_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(9, (MessageLite)this.apportion_.get(i));
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.effectSetId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Battle_Effect)) {
            return super.equals(obj);
         } else {
            S2C_Battle_Effect other = (S2C_Battle_Effect)obj;
            if (this.hasEffectType() != other.hasEffectType()) {
               return false;
            } else if (this.hasEffectType() && this.getEffectType() != other.getEffectType()) {
               return false;
            } else if (this.hasTargetBattlePos() != other.hasTargetBattlePos()) {
               return false;
            } else if (this.hasTargetBattlePos() && this.getTargetBattlePos() != other.getTargetBattlePos()) {
               return false;
            } else if (this.hasEffectId() != other.hasEffectId()) {
               return false;
            } else if (this.hasEffectId() && this.getEffectId() != other.getEffectId()) {
               return false;
            } else if (this.hasEffectCode() != other.hasEffectCode()) {
               return false;
            } else if (this.hasEffectCode() && this.getEffectCode() != other.getEffectCode()) {
               return false;
            } else if (this.hasEffectValue() != other.hasEffectValue()) {
               return false;
            } else if (this.hasEffectValue() && this.getEffectValue() != other.getEffectValue()) {
               return false;
            } else if (this.hasFinalValue() != other.hasFinalValue()) {
               return false;
            } else if (this.hasFinalValue() && this.getFinalValue() != other.getFinalValue()) {
               return false;
            } else if (this.hasCrit() != other.hasCrit()) {
               return false;
            } else if (this.hasCrit() && this.getCrit() != other.getCrit()) {
               return false;
            } else if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
               return false;
            } else if (!this.getApportionList().equals(other.getApportionList())) {
               return false;
            } else if (this.hasEffectSetId() != other.hasEffectSetId()) {
               return false;
            } else if (this.hasEffectSetId() && this.getEffectSetId() != other.getEffectSetId()) {
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
            if (this.hasEffectType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEffectType();
            }

            if (this.hasTargetBattlePos()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTargetBattlePos();
            }

            if (this.hasEffectId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getEffectId();
            }

            if (this.hasEffectCode()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getEffectCode();
            }

            if (this.hasEffectValue()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashLong(this.getEffectValue());
            }

            if (this.hasFinalValue()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashLong(this.getFinalValue());
            }

            if (this.hasCrit()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getCrit();
            }

            if (this.hasTime()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getTime();
            }

            if (this.getApportionCount() > 0) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getApportionList().hashCode();
            }

            if (this.hasEffectSetId()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getEffectSetId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Battle_Effect parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Battle_Effect)PARSER.parseFrom(data);
      }

      public static S2C_Battle_Effect parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_Effect)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_Effect parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Battle_Effect)PARSER.parseFrom(data);
      }

      public static S2C_Battle_Effect parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_Effect)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_Effect parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Battle_Effect)PARSER.parseFrom(data);
      }

      public static S2C_Battle_Effect parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_Effect)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_Effect parseFrom(InputStream input) throws IOException {
         return (S2C_Battle_Effect)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Battle_Effect parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_Effect)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Battle_Effect parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Battle_Effect)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Battle_Effect parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_Effect)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Battle_Effect parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Battle_Effect)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Battle_Effect parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_Effect)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Battle_Effect prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Battle_Effect getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Battle_Effect> parser() {
         return PARSER;
      }

      public Parser<S2C_Battle_Effect> getParserForType() {
         return PARSER;
      }

      public S2C_Battle_Effect getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Battle_EffectOrBuilder {
         private int bitField0_;
         private int effectType_;
         private int targetBattlePos_;
         private int effectId_;
         private int effectCode_;
         private long effectValue_;
         private long finalValue_;
         private int crit_;
         private int time_;
         private List<S2C_Battle_Apportion> apportion_;
         private RepeatedFieldBuilderV3<S2C_Battle_Apportion, S2C_Battle_Apportion.Builder, S2C_Battle_ApportionOrBuilder> apportionBuilder_;
         private int effectSetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Effect_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Effect_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Battle_Effect.class, Builder.class);
         }

         private Builder() {
            this.apportion_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.apportion_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.S2C_Battle_Effect.alwaysUseFieldBuilders) {
               this.getApportionFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.effectType_ = 0;
            this.bitField0_ &= -2;
            this.targetBattlePos_ = 0;
            this.bitField0_ &= -3;
            this.effectId_ = 0;
            this.bitField0_ &= -5;
            this.effectCode_ = 0;
            this.bitField0_ &= -9;
            this.effectValue_ = 0L;
            this.bitField0_ &= -17;
            this.finalValue_ = 0L;
            this.bitField0_ &= -33;
            this.crit_ = 0;
            this.bitField0_ &= -65;
            this.time_ = 0;
            this.bitField0_ &= -129;
            if (this.apportionBuilder_ == null) {
               this.apportion_ = Collections.emptyList();
               this.bitField0_ &= -257;
            } else {
               this.apportionBuilder_.clear();
            }

            this.effectSetId_ = 0;
            this.bitField0_ &= -513;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Effect_descriptor;
         }

         public S2C_Battle_Effect getDefaultInstanceForType() {
            return BattleMsg.S2C_Battle_Effect.getDefaultInstance();
         }

         public S2C_Battle_Effect build() {
            S2C_Battle_Effect result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Battle_Effect buildPartial() {
            S2C_Battle_Effect result = new S2C_Battle_Effect(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.effectType_ = this.effectType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.targetBattlePos_ = this.targetBattlePos_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.effectId_ = this.effectId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.effectCode_ = this.effectCode_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.effectValue_ = this.effectValue_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.finalValue_ = this.finalValue_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.crit_ = this.crit_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.time_ = this.time_;
               to_bitField0_ |= 128;
            }

            if (this.apportionBuilder_ == null) {
               if ((this.bitField0_ & 256) != 0) {
                  this.apportion_ = Collections.unmodifiableList(this.apportion_);
                  this.bitField0_ &= -257;
               }

               result.apportion_ = this.apportion_;
            } else {
               result.apportion_ = this.apportionBuilder_.build();
            }

            if ((from_bitField0_ & 512) != 0) {
               result.effectSetId_ = this.effectSetId_;
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
            if (other instanceof S2C_Battle_Effect) {
               return this.mergeFrom((S2C_Battle_Effect)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Battle_Effect other) {
            if (other == BattleMsg.S2C_Battle_Effect.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEffectType()) {
                  this.setEffectType(other.getEffectType());
               }

               if (other.hasTargetBattlePos()) {
                  this.setTargetBattlePos(other.getTargetBattlePos());
               }

               if (other.hasEffectId()) {
                  this.setEffectId(other.getEffectId());
               }

               if (other.hasEffectCode()) {
                  this.setEffectCode(other.getEffectCode());
               }

               if (other.hasEffectValue()) {
                  this.setEffectValue(other.getEffectValue());
               }

               if (other.hasFinalValue()) {
                  this.setFinalValue(other.getFinalValue());
               }

               if (other.hasCrit()) {
                  this.setCrit(other.getCrit());
               }

               if (other.hasTime()) {
                  this.setTime(other.getTime());
               }

               if (this.apportionBuilder_ == null) {
                  if (!other.apportion_.isEmpty()) {
                     if (this.apportion_.isEmpty()) {
                        this.apportion_ = other.apportion_;
                        this.bitField0_ &= -257;
                     } else {
                        this.ensureApportionIsMutable();
                        this.apportion_.addAll(other.apportion_);
                     }

                     this.onChanged();
                  }
               } else if (!other.apportion_.isEmpty()) {
                  if (this.apportionBuilder_.isEmpty()) {
                     this.apportionBuilder_.dispose();
                     this.apportionBuilder_ = null;
                     this.apportion_ = other.apportion_;
                     this.bitField0_ &= -257;
                     this.apportionBuilder_ = BattleMsg.S2C_Battle_Effect.alwaysUseFieldBuilders ? this.getApportionFieldBuilder() : null;
                  } else {
                     this.apportionBuilder_.addAllMessages(other.apportion_);
                  }
               }

               if (other.hasEffectSetId()) {
                  this.setEffectSetId(other.getEffectSetId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasEffectType()) {
               return false;
            } else if (!this.hasTargetBattlePos()) {
               return false;
            } else {
               for(int i = 0; i < this.getApportionCount(); ++i) {
                  if (!this.getApportion(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Battle_Effect parsedMessage = null;

            try {
               parsedMessage = (S2C_Battle_Effect)BattleMsg.S2C_Battle_Effect.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Battle_Effect)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasEffectType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getEffectType() {
            return this.effectType_;
         }

         public Builder setEffectType(int value) {
            this.bitField0_ |= 1;
            this.effectType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEffectType() {
            this.bitField0_ &= -2;
            this.effectType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTargetBattlePos() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTargetBattlePos() {
            return this.targetBattlePos_;
         }

         public Builder setTargetBattlePos(int value) {
            this.bitField0_ |= 2;
            this.targetBattlePos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTargetBattlePos() {
            this.bitField0_ &= -3;
            this.targetBattlePos_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEffectId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getEffectId() {
            return this.effectId_;
         }

         public Builder setEffectId(int value) {
            this.bitField0_ |= 4;
            this.effectId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEffectId() {
            this.bitField0_ &= -5;
            this.effectId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEffectCode() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getEffectCode() {
            return this.effectCode_;
         }

         public Builder setEffectCode(int value) {
            this.bitField0_ |= 8;
            this.effectCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEffectCode() {
            this.bitField0_ &= -9;
            this.effectCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEffectValue() {
            return (this.bitField0_ & 16) != 0;
         }

         public long getEffectValue() {
            return this.effectValue_;
         }

         public Builder setEffectValue(long value) {
            this.bitField0_ |= 16;
            this.effectValue_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEffectValue() {
            this.bitField0_ &= -17;
            this.effectValue_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasFinalValue() {
            return (this.bitField0_ & 32) != 0;
         }

         public long getFinalValue() {
            return this.finalValue_;
         }

         public Builder setFinalValue(long value) {
            this.bitField0_ |= 32;
            this.finalValue_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFinalValue() {
            this.bitField0_ &= -33;
            this.finalValue_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasCrit() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getCrit() {
            return this.crit_;
         }

         public Builder setCrit(int value) {
            this.bitField0_ |= 64;
            this.crit_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCrit() {
            this.bitField0_ &= -65;
            this.crit_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTime() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getTime() {
            return this.time_;
         }

         public Builder setTime(int value) {
            this.bitField0_ |= 128;
            this.time_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTime() {
            this.bitField0_ &= -129;
            this.time_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureApportionIsMutable() {
            if ((this.bitField0_ & 256) == 0) {
               this.apportion_ = new ArrayList(this.apportion_);
               this.bitField0_ |= 256;
            }

         }

         public List<S2C_Battle_Apportion> getApportionList() {
            return this.apportionBuilder_ == null ? Collections.unmodifiableList(this.apportion_) : this.apportionBuilder_.getMessageList();
         }

         public int getApportionCount() {
            return this.apportionBuilder_ == null ? this.apportion_.size() : this.apportionBuilder_.getCount();
         }

         public S2C_Battle_Apportion getApportion(int index) {
            return this.apportionBuilder_ == null ? (S2C_Battle_Apportion)this.apportion_.get(index) : (S2C_Battle_Apportion)this.apportionBuilder_.getMessage(index);
         }

         public Builder setApportion(int index, S2C_Battle_Apportion value) {
            if (this.apportionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureApportionIsMutable();
               this.apportion_.set(index, value);
               this.onChanged();
            } else {
               this.apportionBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setApportion(int index, S2C_Battle_Apportion.Builder builderForValue) {
            if (this.apportionBuilder_ == null) {
               this.ensureApportionIsMutable();
               this.apportion_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.apportionBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addApportion(S2C_Battle_Apportion value) {
            if (this.apportionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureApportionIsMutable();
               this.apportion_.add(value);
               this.onChanged();
            } else {
               this.apportionBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addApportion(int index, S2C_Battle_Apportion value) {
            if (this.apportionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureApportionIsMutable();
               this.apportion_.add(index, value);
               this.onChanged();
            } else {
               this.apportionBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addApportion(S2C_Battle_Apportion.Builder builderForValue) {
            if (this.apportionBuilder_ == null) {
               this.ensureApportionIsMutable();
               this.apportion_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.apportionBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addApportion(int index, S2C_Battle_Apportion.Builder builderForValue) {
            if (this.apportionBuilder_ == null) {
               this.ensureApportionIsMutable();
               this.apportion_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.apportionBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllApportion(Iterable<? extends S2C_Battle_Apportion> values) {
            if (this.apportionBuilder_ == null) {
               this.ensureApportionIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.apportion_);
               this.onChanged();
            } else {
               this.apportionBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearApportion() {
            if (this.apportionBuilder_ == null) {
               this.apportion_ = Collections.emptyList();
               this.bitField0_ &= -257;
               this.onChanged();
            } else {
               this.apportionBuilder_.clear();
            }

            return this;
         }

         public Builder removeApportion(int index) {
            if (this.apportionBuilder_ == null) {
               this.ensureApportionIsMutable();
               this.apportion_.remove(index);
               this.onChanged();
            } else {
               this.apportionBuilder_.remove(index);
            }

            return this;
         }

         public S2C_Battle_Apportion.Builder getApportionBuilder(int index) {
            return (S2C_Battle_Apportion.Builder)this.getApportionFieldBuilder().getBuilder(index);
         }

         public S2C_Battle_ApportionOrBuilder getApportionOrBuilder(int index) {
            return this.apportionBuilder_ == null ? (S2C_Battle_ApportionOrBuilder)this.apportion_.get(index) : (S2C_Battle_ApportionOrBuilder)this.apportionBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends S2C_Battle_ApportionOrBuilder> getApportionOrBuilderList() {
            return this.apportionBuilder_ != null ? this.apportionBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.apportion_);
         }

         public S2C_Battle_Apportion.Builder addApportionBuilder() {
            return (S2C_Battle_Apportion.Builder)this.getApportionFieldBuilder().addBuilder(BattleMsg.S2C_Battle_Apportion.getDefaultInstance());
         }

         public S2C_Battle_Apportion.Builder addApportionBuilder(int index) {
            return (S2C_Battle_Apportion.Builder)this.getApportionFieldBuilder().addBuilder(index, BattleMsg.S2C_Battle_Apportion.getDefaultInstance());
         }

         public List<S2C_Battle_Apportion.Builder> getApportionBuilderList() {
            return this.getApportionFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<S2C_Battle_Apportion, S2C_Battle_Apportion.Builder, S2C_Battle_ApportionOrBuilder> getApportionFieldBuilder() {
            if (this.apportionBuilder_ == null) {
               this.apportionBuilder_ = new RepeatedFieldBuilderV3(this.apportion_, (this.bitField0_ & 256) != 0, this.getParentForChildren(), this.isClean());
               this.apportion_ = null;
            }

            return this.apportionBuilder_;
         }

         public boolean hasEffectSetId() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getEffectSetId() {
            return this.effectSetId_;
         }

         public Builder setEffectSetId(int value) {
            this.bitField0_ |= 512;
            this.effectSetId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEffectSetId() {
            this.bitField0_ &= -513;
            this.effectSetId_ = 0;
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

   public static final class S2C_Battle_Effects extends GeneratedMessageV3 implements S2C_Battle_EffectsOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SLOT_FIELD_NUMBER = 1;
      private int slot_;
      public static final int BATTLEPOS_FIELD_NUMBER = 2;
      private Internal.IntList battlePos_;
      public static final int EFFECTS_FIELD_NUMBER = 3;
      private List<S2C_Battle_Effect> effects_;
      public static final int EVENTEFFECTS_FIELD_NUMBER = 4;
      private List<S2C_Battle_Effect> eventEffects_;
      private byte memoizedIsInitialized;
      private static final S2C_Battle_Effects DEFAULT_INSTANCE = new S2C_Battle_Effects();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Battle_Effects> PARSER = new AbstractParser<S2C_Battle_Effects>() {
         public S2C_Battle_Effects parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Battle_Effects(input, extensionRegistry);
         }
      };

      private S2C_Battle_Effects(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Battle_Effects() {
         this.memoizedIsInitialized = -1;
         this.battlePos_ = emptyIntList();
         this.effects_ = Collections.emptyList();
         this.eventEffects_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Battle_Effects();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Battle_Effects(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.slot_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.battlePos_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.battlePos_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.battlePos_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.effects_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.effects_.add(input.readMessage(BattleMsg.S2C_Battle_Effect.PARSER, extensionRegistry));
                        continue;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.eventEffects_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.eventEffects_.add(input.readMessage(BattleMsg.S2C_Battle_Effect.PARSER, extensionRegistry));
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.battlePos_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.battlePos_.makeImmutable();
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.effects_ = Collections.unmodifiableList(this.effects_);
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.eventEffects_ = Collections.unmodifiableList(this.eventEffects_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Effects_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Effects_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Battle_Effects.class, Builder.class);
      }

      public boolean hasSlot() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSlot() {
         return this.slot_;
      }

      public List<Integer> getBattlePosList() {
         return this.battlePos_;
      }

      public int getBattlePosCount() {
         return this.battlePos_.size();
      }

      public int getBattlePos(int index) {
         return this.battlePos_.getInt(index);
      }

      public List<S2C_Battle_Effect> getEffectsList() {
         return this.effects_;
      }

      public List<? extends S2C_Battle_EffectOrBuilder> getEffectsOrBuilderList() {
         return this.effects_;
      }

      public int getEffectsCount() {
         return this.effects_.size();
      }

      public S2C_Battle_Effect getEffects(int index) {
         return (S2C_Battle_Effect)this.effects_.get(index);
      }

      public S2C_Battle_EffectOrBuilder getEffectsOrBuilder(int index) {
         return (S2C_Battle_EffectOrBuilder)this.effects_.get(index);
      }

      public List<S2C_Battle_Effect> getEventEffectsList() {
         return this.eventEffects_;
      }

      public List<? extends S2C_Battle_EffectOrBuilder> getEventEffectsOrBuilderList() {
         return this.eventEffects_;
      }

      public int getEventEffectsCount() {
         return this.eventEffects_.size();
      }

      public S2C_Battle_Effect getEventEffects(int index) {
         return (S2C_Battle_Effect)this.eventEffects_.get(index);
      }

      public S2C_Battle_EffectOrBuilder getEventEffectsOrBuilder(int index) {
         return (S2C_Battle_EffectOrBuilder)this.eventEffects_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSlot()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getEffectsCount(); ++i) {
               if (!this.getEffects(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getEventEffectsCount(); ++i) {
               if (!this.getEventEffects(i).isInitialized()) {
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
            output.writeInt32(1, this.slot_);
         }

         for(int i = 0; i < this.battlePos_.size(); ++i) {
            output.writeInt32(2, this.battlePos_.getInt(i));
         }

         for(int i = 0; i < this.effects_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.effects_.get(i));
         }

         for(int i = 0; i < this.eventEffects_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.eventEffects_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.slot_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.battlePos_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.battlePos_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getBattlePosList().size();

            for(int i = 0; i < this.effects_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.effects_.get(i));
            }

            for(int i = 0; i < this.eventEffects_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.eventEffects_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Battle_Effects)) {
            return super.equals(obj);
         } else {
            S2C_Battle_Effects other = (S2C_Battle_Effects)obj;
            if (this.hasSlot() != other.hasSlot()) {
               return false;
            } else if (this.hasSlot() && this.getSlot() != other.getSlot()) {
               return false;
            } else if (!this.getBattlePosList().equals(other.getBattlePosList())) {
               return false;
            } else if (!this.getEffectsList().equals(other.getEffectsList())) {
               return false;
            } else if (!this.getEventEffectsList().equals(other.getEventEffectsList())) {
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
            if (this.hasSlot()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSlot();
            }

            if (this.getBattlePosCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBattlePosList().hashCode();
            }

            if (this.getEffectsCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getEffectsList().hashCode();
            }

            if (this.getEventEffectsCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getEventEffectsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Battle_Effects parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Battle_Effects)PARSER.parseFrom(data);
      }

      public static S2C_Battle_Effects parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_Effects)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_Effects parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Battle_Effects)PARSER.parseFrom(data);
      }

      public static S2C_Battle_Effects parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_Effects)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_Effects parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Battle_Effects)PARSER.parseFrom(data);
      }

      public static S2C_Battle_Effects parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_Effects)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_Effects parseFrom(InputStream input) throws IOException {
         return (S2C_Battle_Effects)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Battle_Effects parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_Effects)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Battle_Effects parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Battle_Effects)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Battle_Effects parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_Effects)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Battle_Effects parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Battle_Effects)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Battle_Effects parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_Effects)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Battle_Effects prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Battle_Effects getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Battle_Effects> parser() {
         return PARSER;
      }

      public Parser<S2C_Battle_Effects> getParserForType() {
         return PARSER;
      }

      public S2C_Battle_Effects getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Battle_EffectsOrBuilder {
         private int bitField0_;
         private int slot_;
         private Internal.IntList battlePos_;
         private List<S2C_Battle_Effect> effects_;
         private RepeatedFieldBuilderV3<S2C_Battle_Effect, S2C_Battle_Effect.Builder, S2C_Battle_EffectOrBuilder> effectsBuilder_;
         private List<S2C_Battle_Effect> eventEffects_;
         private RepeatedFieldBuilderV3<S2C_Battle_Effect, S2C_Battle_Effect.Builder, S2C_Battle_EffectOrBuilder> eventEffectsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Effects_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Effects_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Battle_Effects.class, Builder.class);
         }

         private Builder() {
            this.battlePos_ = BattleMsg.S2C_Battle_Effects.emptyIntList();
            this.effects_ = Collections.emptyList();
            this.eventEffects_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.battlePos_ = BattleMsg.S2C_Battle_Effects.emptyIntList();
            this.effects_ = Collections.emptyList();
            this.eventEffects_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.S2C_Battle_Effects.alwaysUseFieldBuilders) {
               this.getEffectsFieldBuilder();
               this.getEventEffectsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.slot_ = 0;
            this.bitField0_ &= -2;
            this.battlePos_ = BattleMsg.S2C_Battle_Effects.emptyIntList();
            this.bitField0_ &= -3;
            if (this.effectsBuilder_ == null) {
               this.effects_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.effectsBuilder_.clear();
            }

            if (this.eventEffectsBuilder_ == null) {
               this.eventEffects_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.eventEffectsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Effects_descriptor;
         }

         public S2C_Battle_Effects getDefaultInstanceForType() {
            return BattleMsg.S2C_Battle_Effects.getDefaultInstance();
         }

         public S2C_Battle_Effects build() {
            S2C_Battle_Effects result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Battle_Effects buildPartial() {
            S2C_Battle_Effects result = new S2C_Battle_Effects(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.slot_ = this.slot_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.battlePos_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.battlePos_ = this.battlePos_;
            if (this.effectsBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.effects_ = Collections.unmodifiableList(this.effects_);
                  this.bitField0_ &= -5;
               }

               result.effects_ = this.effects_;
            } else {
               result.effects_ = this.effectsBuilder_.build();
            }

            if (this.eventEffectsBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.eventEffects_ = Collections.unmodifiableList(this.eventEffects_);
                  this.bitField0_ &= -9;
               }

               result.eventEffects_ = this.eventEffects_;
            } else {
               result.eventEffects_ = this.eventEffectsBuilder_.build();
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
            if (other instanceof S2C_Battle_Effects) {
               return this.mergeFrom((S2C_Battle_Effects)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Battle_Effects other) {
            if (other == BattleMsg.S2C_Battle_Effects.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSlot()) {
                  this.setSlot(other.getSlot());
               }

               if (!other.battlePos_.isEmpty()) {
                  if (this.battlePos_.isEmpty()) {
                     this.battlePos_ = other.battlePos_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureBattlePosIsMutable();
                     this.battlePos_.addAll(other.battlePos_);
                  }

                  this.onChanged();
               }

               if (this.effectsBuilder_ == null) {
                  if (!other.effects_.isEmpty()) {
                     if (this.effects_.isEmpty()) {
                        this.effects_ = other.effects_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureEffectsIsMutable();
                        this.effects_.addAll(other.effects_);
                     }

                     this.onChanged();
                  }
               } else if (!other.effects_.isEmpty()) {
                  if (this.effectsBuilder_.isEmpty()) {
                     this.effectsBuilder_.dispose();
                     this.effectsBuilder_ = null;
                     this.effects_ = other.effects_;
                     this.bitField0_ &= -5;
                     this.effectsBuilder_ = BattleMsg.S2C_Battle_Effects.alwaysUseFieldBuilders ? this.getEffectsFieldBuilder() : null;
                  } else {
                     this.effectsBuilder_.addAllMessages(other.effects_);
                  }
               }

               if (this.eventEffectsBuilder_ == null) {
                  if (!other.eventEffects_.isEmpty()) {
                     if (this.eventEffects_.isEmpty()) {
                        this.eventEffects_ = other.eventEffects_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureEventEffectsIsMutable();
                        this.eventEffects_.addAll(other.eventEffects_);
                     }

                     this.onChanged();
                  }
               } else if (!other.eventEffects_.isEmpty()) {
                  if (this.eventEffectsBuilder_.isEmpty()) {
                     this.eventEffectsBuilder_.dispose();
                     this.eventEffectsBuilder_ = null;
                     this.eventEffects_ = other.eventEffects_;
                     this.bitField0_ &= -9;
                     this.eventEffectsBuilder_ = BattleMsg.S2C_Battle_Effects.alwaysUseFieldBuilders ? this.getEventEffectsFieldBuilder() : null;
                  } else {
                     this.eventEffectsBuilder_.addAllMessages(other.eventEffects_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSlot()) {
               return false;
            } else {
               for(int i = 0; i < this.getEffectsCount(); ++i) {
                  if (!this.getEffects(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getEventEffectsCount(); ++i) {
                  if (!this.getEventEffects(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Battle_Effects parsedMessage = null;

            try {
               parsedMessage = (S2C_Battle_Effects)BattleMsg.S2C_Battle_Effects.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Battle_Effects)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSlot() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSlot() {
            return this.slot_;
         }

         public Builder setSlot(int value) {
            this.bitField0_ |= 1;
            this.slot_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSlot() {
            this.bitField0_ &= -2;
            this.slot_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureBattlePosIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.battlePos_ = BattleMsg.S2C_Battle_Effects.mutableCopy(this.battlePos_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getBattlePosList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.battlePos_) : this.battlePos_);
         }

         public int getBattlePosCount() {
            return this.battlePos_.size();
         }

         public int getBattlePos(int index) {
            return this.battlePos_.getInt(index);
         }

         public Builder setBattlePos(int index, int value) {
            this.ensureBattlePosIsMutable();
            this.battlePos_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addBattlePos(int value) {
            this.ensureBattlePosIsMutable();
            this.battlePos_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllBattlePos(Iterable<? extends Integer> values) {
            this.ensureBattlePosIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.battlePos_);
            this.onChanged();
            return this;
         }

         public Builder clearBattlePos() {
            this.battlePos_ = BattleMsg.S2C_Battle_Effects.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         private void ensureEffectsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.effects_ = new ArrayList(this.effects_);
               this.bitField0_ |= 4;
            }

         }

         public List<S2C_Battle_Effect> getEffectsList() {
            return this.effectsBuilder_ == null ? Collections.unmodifiableList(this.effects_) : this.effectsBuilder_.getMessageList();
         }

         public int getEffectsCount() {
            return this.effectsBuilder_ == null ? this.effects_.size() : this.effectsBuilder_.getCount();
         }

         public S2C_Battle_Effect getEffects(int index) {
            return this.effectsBuilder_ == null ? (S2C_Battle_Effect)this.effects_.get(index) : (S2C_Battle_Effect)this.effectsBuilder_.getMessage(index);
         }

         public Builder setEffects(int index, S2C_Battle_Effect value) {
            if (this.effectsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEffectsIsMutable();
               this.effects_.set(index, value);
               this.onChanged();
            } else {
               this.effectsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setEffects(int index, S2C_Battle_Effect.Builder builderForValue) {
            if (this.effectsBuilder_ == null) {
               this.ensureEffectsIsMutable();
               this.effects_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.effectsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addEffects(S2C_Battle_Effect value) {
            if (this.effectsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEffectsIsMutable();
               this.effects_.add(value);
               this.onChanged();
            } else {
               this.effectsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addEffects(int index, S2C_Battle_Effect value) {
            if (this.effectsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEffectsIsMutable();
               this.effects_.add(index, value);
               this.onChanged();
            } else {
               this.effectsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addEffects(S2C_Battle_Effect.Builder builderForValue) {
            if (this.effectsBuilder_ == null) {
               this.ensureEffectsIsMutable();
               this.effects_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.effectsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addEffects(int index, S2C_Battle_Effect.Builder builderForValue) {
            if (this.effectsBuilder_ == null) {
               this.ensureEffectsIsMutable();
               this.effects_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.effectsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllEffects(Iterable<? extends S2C_Battle_Effect> values) {
            if (this.effectsBuilder_ == null) {
               this.ensureEffectsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.effects_);
               this.onChanged();
            } else {
               this.effectsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearEffects() {
            if (this.effectsBuilder_ == null) {
               this.effects_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.effectsBuilder_.clear();
            }

            return this;
         }

         public Builder removeEffects(int index) {
            if (this.effectsBuilder_ == null) {
               this.ensureEffectsIsMutable();
               this.effects_.remove(index);
               this.onChanged();
            } else {
               this.effectsBuilder_.remove(index);
            }

            return this;
         }

         public S2C_Battle_Effect.Builder getEffectsBuilder(int index) {
            return (S2C_Battle_Effect.Builder)this.getEffectsFieldBuilder().getBuilder(index);
         }

         public S2C_Battle_EffectOrBuilder getEffectsOrBuilder(int index) {
            return this.effectsBuilder_ == null ? (S2C_Battle_EffectOrBuilder)this.effects_.get(index) : (S2C_Battle_EffectOrBuilder)this.effectsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends S2C_Battle_EffectOrBuilder> getEffectsOrBuilderList() {
            return this.effectsBuilder_ != null ? this.effectsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.effects_);
         }

         public S2C_Battle_Effect.Builder addEffectsBuilder() {
            return (S2C_Battle_Effect.Builder)this.getEffectsFieldBuilder().addBuilder(BattleMsg.S2C_Battle_Effect.getDefaultInstance());
         }

         public S2C_Battle_Effect.Builder addEffectsBuilder(int index) {
            return (S2C_Battle_Effect.Builder)this.getEffectsFieldBuilder().addBuilder(index, BattleMsg.S2C_Battle_Effect.getDefaultInstance());
         }

         public List<S2C_Battle_Effect.Builder> getEffectsBuilderList() {
            return this.getEffectsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<S2C_Battle_Effect, S2C_Battle_Effect.Builder, S2C_Battle_EffectOrBuilder> getEffectsFieldBuilder() {
            if (this.effectsBuilder_ == null) {
               this.effectsBuilder_ = new RepeatedFieldBuilderV3(this.effects_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.effects_ = null;
            }

            return this.effectsBuilder_;
         }

         private void ensureEventEffectsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.eventEffects_ = new ArrayList(this.eventEffects_);
               this.bitField0_ |= 8;
            }

         }

         public List<S2C_Battle_Effect> getEventEffectsList() {
            return this.eventEffectsBuilder_ == null ? Collections.unmodifiableList(this.eventEffects_) : this.eventEffectsBuilder_.getMessageList();
         }

         public int getEventEffectsCount() {
            return this.eventEffectsBuilder_ == null ? this.eventEffects_.size() : this.eventEffectsBuilder_.getCount();
         }

         public S2C_Battle_Effect getEventEffects(int index) {
            return this.eventEffectsBuilder_ == null ? (S2C_Battle_Effect)this.eventEffects_.get(index) : (S2C_Battle_Effect)this.eventEffectsBuilder_.getMessage(index);
         }

         public Builder setEventEffects(int index, S2C_Battle_Effect value) {
            if (this.eventEffectsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEventEffectsIsMutable();
               this.eventEffects_.set(index, value);
               this.onChanged();
            } else {
               this.eventEffectsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setEventEffects(int index, S2C_Battle_Effect.Builder builderForValue) {
            if (this.eventEffectsBuilder_ == null) {
               this.ensureEventEffectsIsMutable();
               this.eventEffects_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.eventEffectsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addEventEffects(S2C_Battle_Effect value) {
            if (this.eventEffectsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEventEffectsIsMutable();
               this.eventEffects_.add(value);
               this.onChanged();
            } else {
               this.eventEffectsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addEventEffects(int index, S2C_Battle_Effect value) {
            if (this.eventEffectsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEventEffectsIsMutable();
               this.eventEffects_.add(index, value);
               this.onChanged();
            } else {
               this.eventEffectsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addEventEffects(S2C_Battle_Effect.Builder builderForValue) {
            if (this.eventEffectsBuilder_ == null) {
               this.ensureEventEffectsIsMutable();
               this.eventEffects_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.eventEffectsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addEventEffects(int index, S2C_Battle_Effect.Builder builderForValue) {
            if (this.eventEffectsBuilder_ == null) {
               this.ensureEventEffectsIsMutable();
               this.eventEffects_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.eventEffectsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllEventEffects(Iterable<? extends S2C_Battle_Effect> values) {
            if (this.eventEffectsBuilder_ == null) {
               this.ensureEventEffectsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.eventEffects_);
               this.onChanged();
            } else {
               this.eventEffectsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearEventEffects() {
            if (this.eventEffectsBuilder_ == null) {
               this.eventEffects_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.eventEffectsBuilder_.clear();
            }

            return this;
         }

         public Builder removeEventEffects(int index) {
            if (this.eventEffectsBuilder_ == null) {
               this.ensureEventEffectsIsMutable();
               this.eventEffects_.remove(index);
               this.onChanged();
            } else {
               this.eventEffectsBuilder_.remove(index);
            }

            return this;
         }

         public S2C_Battle_Effect.Builder getEventEffectsBuilder(int index) {
            return (S2C_Battle_Effect.Builder)this.getEventEffectsFieldBuilder().getBuilder(index);
         }

         public S2C_Battle_EffectOrBuilder getEventEffectsOrBuilder(int index) {
            return this.eventEffectsBuilder_ == null ? (S2C_Battle_EffectOrBuilder)this.eventEffects_.get(index) : (S2C_Battle_EffectOrBuilder)this.eventEffectsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends S2C_Battle_EffectOrBuilder> getEventEffectsOrBuilderList() {
            return this.eventEffectsBuilder_ != null ? this.eventEffectsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.eventEffects_);
         }

         public S2C_Battle_Effect.Builder addEventEffectsBuilder() {
            return (S2C_Battle_Effect.Builder)this.getEventEffectsFieldBuilder().addBuilder(BattleMsg.S2C_Battle_Effect.getDefaultInstance());
         }

         public S2C_Battle_Effect.Builder addEventEffectsBuilder(int index) {
            return (S2C_Battle_Effect.Builder)this.getEventEffectsFieldBuilder().addBuilder(index, BattleMsg.S2C_Battle_Effect.getDefaultInstance());
         }

         public List<S2C_Battle_Effect.Builder> getEventEffectsBuilderList() {
            return this.getEventEffectsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<S2C_Battle_Effect, S2C_Battle_Effect.Builder, S2C_Battle_EffectOrBuilder> getEventEffectsFieldBuilder() {
            if (this.eventEffectsBuilder_ == null) {
               this.eventEffectsBuilder_ = new RepeatedFieldBuilderV3(this.eventEffects_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.eventEffects_ = null;
            }

            return this.eventEffectsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_Battle_Action extends GeneratedMessageV3 implements S2C_Battle_ActionOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIONTYPE_FIELD_NUMBER = 1;
      private int actionType_;
      public static final int BATTLEPOS_FIELD_NUMBER = 2;
      private int battlePos_;
      public static final int ID_FIELD_NUMBER = 3;
      private int id_;
      public static final int EFFECTES_FIELD_NUMBER = 4;
      private List<S2C_Battle_Effects> effectes_;
      public static final int FLEXIBLEPARAMS_FIELD_NUMBER = 5;
      private Internal.IntList flexibleParams_;
      private byte memoizedIsInitialized;
      private static final S2C_Battle_Action DEFAULT_INSTANCE = new S2C_Battle_Action();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Battle_Action> PARSER = new AbstractParser<S2C_Battle_Action>() {
         public S2C_Battle_Action parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Battle_Action(input, extensionRegistry);
         }
      };

      private S2C_Battle_Action(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Battle_Action() {
         this.memoizedIsInitialized = -1;
         this.effectes_ = Collections.emptyList();
         this.flexibleParams_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Battle_Action();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Battle_Action(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.actionType_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.battlePos_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.id_ = input.readInt32();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.effectes_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.effectes_.add(input.readMessage(BattleMsg.S2C_Battle_Effects.PARSER, extensionRegistry));
                        break;
                     case 40:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.flexibleParams_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        this.flexibleParams_.addInt(input.readInt32());
                        break;
                     case 42:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 16) == 0 && input.getBytesUntilLimit() > 0) {
                           this.flexibleParams_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.flexibleParams_.addInt(input.readInt32());
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
               if ((mutable_bitField0_ & 8) != 0) {
                  this.effectes_ = Collections.unmodifiableList(this.effectes_);
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.flexibleParams_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Action_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Action_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Battle_Action.class, Builder.class);
      }

      public boolean hasActionType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActionType() {
         return this.actionType_;
      }

      public boolean hasBattlePos() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBattlePos() {
         return this.battlePos_;
      }

      public boolean hasId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public List<S2C_Battle_Effects> getEffectesList() {
         return this.effectes_;
      }

      public List<? extends S2C_Battle_EffectsOrBuilder> getEffectesOrBuilderList() {
         return this.effectes_;
      }

      public int getEffectesCount() {
         return this.effectes_.size();
      }

      public S2C_Battle_Effects getEffectes(int index) {
         return (S2C_Battle_Effects)this.effectes_.get(index);
      }

      public S2C_Battle_EffectsOrBuilder getEffectesOrBuilder(int index) {
         return (S2C_Battle_EffectsOrBuilder)this.effectes_.get(index);
      }

      public List<Integer> getFlexibleParamsList() {
         return this.flexibleParams_;
      }

      public int getFlexibleParamsCount() {
         return this.flexibleParams_.size();
      }

      public int getFlexibleParams(int index) {
         return this.flexibleParams_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasActionType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getEffectesCount(); ++i) {
               if (!this.getEffectes(i).isInitialized()) {
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
            output.writeInt32(1, this.actionType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.battlePos_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.id_);
         }

         for(int i = 0; i < this.effectes_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.effectes_.get(i));
         }

         for(int i = 0; i < this.flexibleParams_.size(); ++i) {
            output.writeInt32(5, this.flexibleParams_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.actionType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.battlePos_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.id_);
            }

            for(int i = 0; i < this.effectes_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.effectes_.get(i));
            }

            int dataSize = 0;

            for(int i = 0; i < this.flexibleParams_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.flexibleParams_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getFlexibleParamsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Battle_Action)) {
            return super.equals(obj);
         } else {
            S2C_Battle_Action other = (S2C_Battle_Action)obj;
            if (this.hasActionType() != other.hasActionType()) {
               return false;
            } else if (this.hasActionType() && this.getActionType() != other.getActionType()) {
               return false;
            } else if (this.hasBattlePos() != other.hasBattlePos()) {
               return false;
            } else if (this.hasBattlePos() && this.getBattlePos() != other.getBattlePos()) {
               return false;
            } else if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (!this.getEffectesList().equals(other.getEffectesList())) {
               return false;
            } else if (!this.getFlexibleParamsList().equals(other.getFlexibleParamsList())) {
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
            if (this.hasActionType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getActionType();
            }

            if (this.hasBattlePos()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBattlePos();
            }

            if (this.hasId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getId();
            }

            if (this.getEffectesCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getEffectesList().hashCode();
            }

            if (this.getFlexibleParamsCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getFlexibleParamsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Battle_Action parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Battle_Action)PARSER.parseFrom(data);
      }

      public static S2C_Battle_Action parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_Action)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_Action parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Battle_Action)PARSER.parseFrom(data);
      }

      public static S2C_Battle_Action parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_Action)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_Action parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Battle_Action)PARSER.parseFrom(data);
      }

      public static S2C_Battle_Action parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_Action)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_Action parseFrom(InputStream input) throws IOException {
         return (S2C_Battle_Action)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Battle_Action parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_Action)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Battle_Action parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Battle_Action)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Battle_Action parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_Action)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Battle_Action parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Battle_Action)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Battle_Action parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_Action)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Battle_Action prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Battle_Action getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Battle_Action> parser() {
         return PARSER;
      }

      public Parser<S2C_Battle_Action> getParserForType() {
         return PARSER;
      }

      public S2C_Battle_Action getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Battle_ActionOrBuilder {
         private int bitField0_;
         private int actionType_;
         private int battlePos_;
         private int id_;
         private List<S2C_Battle_Effects> effectes_;
         private RepeatedFieldBuilderV3<S2C_Battle_Effects, S2C_Battle_Effects.Builder, S2C_Battle_EffectsOrBuilder> effectesBuilder_;
         private Internal.IntList flexibleParams_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Action_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Action_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Battle_Action.class, Builder.class);
         }

         private Builder() {
            this.effectes_ = Collections.emptyList();
            this.flexibleParams_ = BattleMsg.S2C_Battle_Action.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.effectes_ = Collections.emptyList();
            this.flexibleParams_ = BattleMsg.S2C_Battle_Action.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.S2C_Battle_Action.alwaysUseFieldBuilders) {
               this.getEffectesFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.actionType_ = 0;
            this.bitField0_ &= -2;
            this.battlePos_ = 0;
            this.bitField0_ &= -3;
            this.id_ = 0;
            this.bitField0_ &= -5;
            if (this.effectesBuilder_ == null) {
               this.effectes_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.effectesBuilder_.clear();
            }

            this.flexibleParams_ = BattleMsg.S2C_Battle_Action.emptyIntList();
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Action_descriptor;
         }

         public S2C_Battle_Action getDefaultInstanceForType() {
            return BattleMsg.S2C_Battle_Action.getDefaultInstance();
         }

         public S2C_Battle_Action build() {
            S2C_Battle_Action result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Battle_Action buildPartial() {
            S2C_Battle_Action result = new S2C_Battle_Action(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.actionType_ = this.actionType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.battlePos_ = this.battlePos_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 4;
            }

            if (this.effectesBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.effectes_ = Collections.unmodifiableList(this.effectes_);
                  this.bitField0_ &= -9;
               }

               result.effectes_ = this.effectes_;
            } else {
               result.effectes_ = this.effectesBuilder_.build();
            }

            if ((this.bitField0_ & 16) != 0) {
               this.flexibleParams_.makeImmutable();
               this.bitField0_ &= -17;
            }

            result.flexibleParams_ = this.flexibleParams_;
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
            if (other instanceof S2C_Battle_Action) {
               return this.mergeFrom((S2C_Battle_Action)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Battle_Action other) {
            if (other == BattleMsg.S2C_Battle_Action.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActionType()) {
                  this.setActionType(other.getActionType());
               }

               if (other.hasBattlePos()) {
                  this.setBattlePos(other.getBattlePos());
               }

               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (this.effectesBuilder_ == null) {
                  if (!other.effectes_.isEmpty()) {
                     if (this.effectes_.isEmpty()) {
                        this.effectes_ = other.effectes_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureEffectesIsMutable();
                        this.effectes_.addAll(other.effectes_);
                     }

                     this.onChanged();
                  }
               } else if (!other.effectes_.isEmpty()) {
                  if (this.effectesBuilder_.isEmpty()) {
                     this.effectesBuilder_.dispose();
                     this.effectesBuilder_ = null;
                     this.effectes_ = other.effectes_;
                     this.bitField0_ &= -9;
                     this.effectesBuilder_ = BattleMsg.S2C_Battle_Action.alwaysUseFieldBuilders ? this.getEffectesFieldBuilder() : null;
                  } else {
                     this.effectesBuilder_.addAllMessages(other.effectes_);
                  }
               }

               if (!other.flexibleParams_.isEmpty()) {
                  if (this.flexibleParams_.isEmpty()) {
                     this.flexibleParams_ = other.flexibleParams_;
                     this.bitField0_ &= -17;
                  } else {
                     this.ensureFlexibleParamsIsMutable();
                     this.flexibleParams_.addAll(other.flexibleParams_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActionType()) {
               return false;
            } else {
               for(int i = 0; i < this.getEffectesCount(); ++i) {
                  if (!this.getEffectes(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Battle_Action parsedMessage = null;

            try {
               parsedMessage = (S2C_Battle_Action)BattleMsg.S2C_Battle_Action.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Battle_Action)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasActionType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getActionType() {
            return this.actionType_;
         }

         public Builder setActionType(int value) {
            this.bitField0_ |= 1;
            this.actionType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActionType() {
            this.bitField0_ &= -2;
            this.actionType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBattlePos() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBattlePos() {
            return this.battlePos_;
         }

         public Builder setBattlePos(int value) {
            this.bitField0_ |= 2;
            this.battlePos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBattlePos() {
            this.bitField0_ &= -3;
            this.battlePos_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getId() {
            return this.id_;
         }

         public Builder setId(int value) {
            this.bitField0_ |= 4;
            this.id_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearId() {
            this.bitField0_ &= -5;
            this.id_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureEffectesIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.effectes_ = new ArrayList(this.effectes_);
               this.bitField0_ |= 8;
            }

         }

         public List<S2C_Battle_Effects> getEffectesList() {
            return this.effectesBuilder_ == null ? Collections.unmodifiableList(this.effectes_) : this.effectesBuilder_.getMessageList();
         }

         public int getEffectesCount() {
            return this.effectesBuilder_ == null ? this.effectes_.size() : this.effectesBuilder_.getCount();
         }

         public S2C_Battle_Effects getEffectes(int index) {
            return this.effectesBuilder_ == null ? (S2C_Battle_Effects)this.effectes_.get(index) : (S2C_Battle_Effects)this.effectesBuilder_.getMessage(index);
         }

         public Builder setEffectes(int index, S2C_Battle_Effects value) {
            if (this.effectesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEffectesIsMutable();
               this.effectes_.set(index, value);
               this.onChanged();
            } else {
               this.effectesBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setEffectes(int index, S2C_Battle_Effects.Builder builderForValue) {
            if (this.effectesBuilder_ == null) {
               this.ensureEffectesIsMutable();
               this.effectes_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.effectesBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addEffectes(S2C_Battle_Effects value) {
            if (this.effectesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEffectesIsMutable();
               this.effectes_.add(value);
               this.onChanged();
            } else {
               this.effectesBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addEffectes(int index, S2C_Battle_Effects value) {
            if (this.effectesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEffectesIsMutable();
               this.effectes_.add(index, value);
               this.onChanged();
            } else {
               this.effectesBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addEffectes(S2C_Battle_Effects.Builder builderForValue) {
            if (this.effectesBuilder_ == null) {
               this.ensureEffectesIsMutable();
               this.effectes_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.effectesBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addEffectes(int index, S2C_Battle_Effects.Builder builderForValue) {
            if (this.effectesBuilder_ == null) {
               this.ensureEffectesIsMutable();
               this.effectes_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.effectesBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllEffectes(Iterable<? extends S2C_Battle_Effects> values) {
            if (this.effectesBuilder_ == null) {
               this.ensureEffectesIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.effectes_);
               this.onChanged();
            } else {
               this.effectesBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearEffectes() {
            if (this.effectesBuilder_ == null) {
               this.effectes_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.effectesBuilder_.clear();
            }

            return this;
         }

         public Builder removeEffectes(int index) {
            if (this.effectesBuilder_ == null) {
               this.ensureEffectesIsMutable();
               this.effectes_.remove(index);
               this.onChanged();
            } else {
               this.effectesBuilder_.remove(index);
            }

            return this;
         }

         public S2C_Battle_Effects.Builder getEffectesBuilder(int index) {
            return (S2C_Battle_Effects.Builder)this.getEffectesFieldBuilder().getBuilder(index);
         }

         public S2C_Battle_EffectsOrBuilder getEffectesOrBuilder(int index) {
            return this.effectesBuilder_ == null ? (S2C_Battle_EffectsOrBuilder)this.effectes_.get(index) : (S2C_Battle_EffectsOrBuilder)this.effectesBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends S2C_Battle_EffectsOrBuilder> getEffectesOrBuilderList() {
            return this.effectesBuilder_ != null ? this.effectesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.effectes_);
         }

         public S2C_Battle_Effects.Builder addEffectesBuilder() {
            return (S2C_Battle_Effects.Builder)this.getEffectesFieldBuilder().addBuilder(BattleMsg.S2C_Battle_Effects.getDefaultInstance());
         }

         public S2C_Battle_Effects.Builder addEffectesBuilder(int index) {
            return (S2C_Battle_Effects.Builder)this.getEffectesFieldBuilder().addBuilder(index, BattleMsg.S2C_Battle_Effects.getDefaultInstance());
         }

         public List<S2C_Battle_Effects.Builder> getEffectesBuilderList() {
            return this.getEffectesFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<S2C_Battle_Effects, S2C_Battle_Effects.Builder, S2C_Battle_EffectsOrBuilder> getEffectesFieldBuilder() {
            if (this.effectesBuilder_ == null) {
               this.effectesBuilder_ = new RepeatedFieldBuilderV3(this.effectes_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.effectes_ = null;
            }

            return this.effectesBuilder_;
         }

         private void ensureFlexibleParamsIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.flexibleParams_ = BattleMsg.S2C_Battle_Action.mutableCopy(this.flexibleParams_);
               this.bitField0_ |= 16;
            }

         }

         public List<Integer> getFlexibleParamsList() {
            return (List<Integer>)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.flexibleParams_) : this.flexibleParams_);
         }

         public int getFlexibleParamsCount() {
            return this.flexibleParams_.size();
         }

         public int getFlexibleParams(int index) {
            return this.flexibleParams_.getInt(index);
         }

         public Builder setFlexibleParams(int index, int value) {
            this.ensureFlexibleParamsIsMutable();
            this.flexibleParams_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addFlexibleParams(int value) {
            this.ensureFlexibleParamsIsMutable();
            this.flexibleParams_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllFlexibleParams(Iterable<? extends Integer> values) {
            this.ensureFlexibleParamsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.flexibleParams_);
            this.onChanged();
            return this;
         }

         public Builder clearFlexibleParams() {
            this.flexibleParams_ = BattleMsg.S2C_Battle_Action.emptyIntList();
            this.bitField0_ &= -17;
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

   public static final class S2C_Totem_Info extends GeneratedMessageV3 implements S2C_Totem_InfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int BREACHLV_FIELD_NUMBER = 2;
      private int breachLv_;
      public static final int LEVEL_FIELD_NUMBER = 3;
      private int level_;
      private byte memoizedIsInitialized;
      private static final S2C_Totem_Info DEFAULT_INSTANCE = new S2C_Totem_Info();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Totem_Info> PARSER = new AbstractParser<S2C_Totem_Info>() {
         public S2C_Totem_Info parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Totem_Info(input, extensionRegistry);
         }
      };

      private S2C_Totem_Info(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Totem_Info() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Totem_Info();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Totem_Info(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.breachLv_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.level_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Totem_Info_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Totem_Info_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Totem_Info.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasBreachLv() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBreachLv() {
         return this.breachLv_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLevel() {
         return this.level_;
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
         } else if (!this.hasBreachLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
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
            output.writeInt32(2, this.breachLv_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.level_);
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
               size += CodedOutputStream.computeInt32Size(2, this.breachLv_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.level_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Totem_Info)) {
            return super.equals(obj);
         } else {
            S2C_Totem_Info other = (S2C_Totem_Info)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasBreachLv() != other.hasBreachLv()) {
               return false;
            } else if (this.hasBreachLv() && this.getBreachLv() != other.getBreachLv()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
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

            if (this.hasBreachLv()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBreachLv();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLevel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Totem_Info parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Totem_Info)PARSER.parseFrom(data);
      }

      public static S2C_Totem_Info parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Totem_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Totem_Info parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Totem_Info)PARSER.parseFrom(data);
      }

      public static S2C_Totem_Info parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Totem_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Totem_Info parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Totem_Info)PARSER.parseFrom(data);
      }

      public static S2C_Totem_Info parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Totem_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Totem_Info parseFrom(InputStream input) throws IOException {
         return (S2C_Totem_Info)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Totem_Info parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Totem_Info)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Totem_Info parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Totem_Info)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Totem_Info parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Totem_Info)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Totem_Info parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Totem_Info)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Totem_Info parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Totem_Info)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Totem_Info prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Totem_Info getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Totem_Info> parser() {
         return PARSER;
      }

      public Parser<S2C_Totem_Info> getParserForType() {
         return PARSER;
      }

      public S2C_Totem_Info getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Totem_InfoOrBuilder {
         private int bitField0_;
         private int id_;
         private int breachLv_;
         private int level_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Totem_Info_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Totem_Info_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Totem_Info.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.S2C_Totem_Info.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.breachLv_ = 0;
            this.bitField0_ &= -3;
            this.level_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Totem_Info_descriptor;
         }

         public S2C_Totem_Info getDefaultInstanceForType() {
            return BattleMsg.S2C_Totem_Info.getDefaultInstance();
         }

         public S2C_Totem_Info build() {
            S2C_Totem_Info result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Totem_Info buildPartial() {
            S2C_Totem_Info result = new S2C_Totem_Info(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.breachLv_ = this.breachLv_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.level_ = this.level_;
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
            if (other instanceof S2C_Totem_Info) {
               return this.mergeFrom((S2C_Totem_Info)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Totem_Info other) {
            if (other == BattleMsg.S2C_Totem_Info.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasBreachLv()) {
                  this.setBreachLv(other.getBreachLv());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else if (!this.hasBreachLv()) {
               return false;
            } else {
               return this.hasLevel();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Totem_Info parsedMessage = null;

            try {
               parsedMessage = (S2C_Totem_Info)BattleMsg.S2C_Totem_Info.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Totem_Info)e.getUnfinishedMessage();
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

         public boolean hasBreachLv() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBreachLv() {
            return this.breachLv_;
         }

         public Builder setBreachLv(int value) {
            this.bitField0_ |= 2;
            this.breachLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBreachLv() {
            this.bitField0_ &= -3;
            this.breachLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 4;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -5;
            this.level_ = 0;
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

   public static final class S2C_Team_Info extends GeneratedMessageV3 implements S2C_Team_InfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TEAMID_FIELD_NUMBER = 1;
      private int teamId_;
      public static final int TEAMNAME_FIELD_NUMBER = 2;
      private volatile Object teamName_;
      public static final int MEMBERS_FIELD_NUMBER = 3;
      private List<S2C_TeamMember_Info> members_;
      public static final int SCORE_FIELD_NUMBER = 4;
      private int score_;
      public static final int RANK_FIELD_NUMBER = 5;
      private int rank_;
      public static final int INTEGRAL_FIELD_NUMBER = 6;
      private int integral_;
      public static final int CHANGERANK_FIELD_NUMBER = 7;
      private int changeRank_;
      public static final int CHANGEINTEGRAL_FIELD_NUMBER = 8;
      private int changeIntegral_;
      public static final int SERVER_FIELD_NUMBER = 9;
      private int server_;
      public static final int POWER_FIELD_NUMBER = 10;
      private long power_;
      private byte memoizedIsInitialized;
      private static final S2C_Team_Info DEFAULT_INSTANCE = new S2C_Team_Info();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Team_Info> PARSER = new AbstractParser<S2C_Team_Info>() {
         public S2C_Team_Info parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Team_Info(input, extensionRegistry);
         }
      };

      private S2C_Team_Info(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Team_Info() {
         this.memoizedIsInitialized = -1;
         this.teamName_ = "";
         this.members_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Team_Info();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Team_Info(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.teamId_ = input.readInt32();
                        break;
                     case 18:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.teamName_ = bs;
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.members_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.members_.add(input.readMessage(BattleMsg.S2C_TeamMember_Info.PARSER, extensionRegistry));
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.score_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.rank_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 16;
                        this.integral_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 32;
                        this.changeRank_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 64;
                        this.changeIntegral_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 128;
                        this.server_ = input.readInt32();
                        break;
                     case 80:
                        this.bitField0_ |= 256;
                        this.power_ = input.readInt64();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.members_ = Collections.unmodifiableList(this.members_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Team_Info_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Team_Info_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Team_Info.class, Builder.class);
      }

      public boolean hasTeamId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTeamId() {
         return this.teamId_;
      }

      public boolean hasTeamName() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getTeamName() {
         Object ref = this.teamName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.teamName_ = s;
            }

            return s;
         }
      }

      public ByteString getTeamNameBytes() {
         Object ref = this.teamName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.teamName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public List<S2C_TeamMember_Info> getMembersList() {
         return this.members_;
      }

      public List<? extends S2C_TeamMember_InfoOrBuilder> getMembersOrBuilderList() {
         return this.members_;
      }

      public int getMembersCount() {
         return this.members_.size();
      }

      public S2C_TeamMember_Info getMembers(int index) {
         return (S2C_TeamMember_Info)this.members_.get(index);
      }

      public S2C_TeamMember_InfoOrBuilder getMembersOrBuilder(int index) {
         return (S2C_TeamMember_InfoOrBuilder)this.members_.get(index);
      }

      public boolean hasScore() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getScore() {
         return this.score_;
      }

      public boolean hasRank() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasIntegral() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getIntegral() {
         return this.integral_;
      }

      public boolean hasChangeRank() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getChangeRank() {
         return this.changeRank_;
      }

      public boolean hasChangeIntegral() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getChangeIntegral() {
         return this.changeIntegral_;
      }

      public boolean hasServer() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getServer() {
         return this.server_;
      }

      public boolean hasPower() {
         return (this.bitField0_ & 256) != 0;
      }

      public long getPower() {
         return this.power_;
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
            output.writeInt32(1, this.teamId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.teamName_);
         }

         for(int i = 0; i < this.members_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.members_.get(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.score_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.rank_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(6, this.integral_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(7, this.changeRank_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(8, this.changeIntegral_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(9, this.server_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt64(10, this.power_);
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
               size += CodedOutputStream.computeInt32Size(1, this.teamId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(2, this.teamName_);
            }

            for(int i = 0; i < this.members_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.members_.get(i));
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.score_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.rank_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.integral_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.changeRank_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.changeIntegral_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.server_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt64Size(10, this.power_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Team_Info)) {
            return super.equals(obj);
         } else {
            S2C_Team_Info other = (S2C_Team_Info)obj;
            if (this.hasTeamId() != other.hasTeamId()) {
               return false;
            } else if (this.hasTeamId() && this.getTeamId() != other.getTeamId()) {
               return false;
            } else if (this.hasTeamName() != other.hasTeamName()) {
               return false;
            } else if (this.hasTeamName() && !this.getTeamName().equals(other.getTeamName())) {
               return false;
            } else if (!this.getMembersList().equals(other.getMembersList())) {
               return false;
            } else if (this.hasScore() != other.hasScore()) {
               return false;
            } else if (this.hasScore() && this.getScore() != other.getScore()) {
               return false;
            } else if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasIntegral() != other.hasIntegral()) {
               return false;
            } else if (this.hasIntegral() && this.getIntegral() != other.getIntegral()) {
               return false;
            } else if (this.hasChangeRank() != other.hasChangeRank()) {
               return false;
            } else if (this.hasChangeRank() && this.getChangeRank() != other.getChangeRank()) {
               return false;
            } else if (this.hasChangeIntegral() != other.hasChangeIntegral()) {
               return false;
            } else if (this.hasChangeIntegral() && this.getChangeIntegral() != other.getChangeIntegral()) {
               return false;
            } else if (this.hasServer() != other.hasServer()) {
               return false;
            } else if (this.hasServer() && this.getServer() != other.getServer()) {
               return false;
            } else if (this.hasPower() != other.hasPower()) {
               return false;
            } else if (this.hasPower() && this.getPower() != other.getPower()) {
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
            if (this.hasTeamId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTeamId();
            }

            if (this.hasTeamName()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTeamName().hashCode();
            }

            if (this.getMembersCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getMembersList().hashCode();
            }

            if (this.hasScore()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getScore();
            }

            if (this.hasRank()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getRank();
            }

            if (this.hasIntegral()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getIntegral();
            }

            if (this.hasChangeRank()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getChangeRank();
            }

            if (this.hasChangeIntegral()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getChangeIntegral();
            }

            if (this.hasServer()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getServer();
            }

            if (this.hasPower()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + Internal.hashLong(this.getPower());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Team_Info parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Team_Info)PARSER.parseFrom(data);
      }

      public static S2C_Team_Info parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Team_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Team_Info parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Team_Info)PARSER.parseFrom(data);
      }

      public static S2C_Team_Info parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Team_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Team_Info parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Team_Info)PARSER.parseFrom(data);
      }

      public static S2C_Team_Info parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Team_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Team_Info parseFrom(InputStream input) throws IOException {
         return (S2C_Team_Info)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Team_Info parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Team_Info)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Team_Info parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Team_Info)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Team_Info parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Team_Info)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Team_Info parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Team_Info)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Team_Info parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Team_Info)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Team_Info prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Team_Info getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Team_Info> parser() {
         return PARSER;
      }

      public Parser<S2C_Team_Info> getParserForType() {
         return PARSER;
      }

      public S2C_Team_Info getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Team_InfoOrBuilder {
         private int bitField0_;
         private int teamId_;
         private Object teamName_;
         private List<S2C_TeamMember_Info> members_;
         private RepeatedFieldBuilderV3<S2C_TeamMember_Info, S2C_TeamMember_Info.Builder, S2C_TeamMember_InfoOrBuilder> membersBuilder_;
         private int score_;
         private int rank_;
         private int integral_;
         private int changeRank_;
         private int changeIntegral_;
         private int server_;
         private long power_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Team_Info_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Team_Info_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Team_Info.class, Builder.class);
         }

         private Builder() {
            this.teamName_ = "";
            this.members_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.teamName_ = "";
            this.members_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.S2C_Team_Info.alwaysUseFieldBuilders) {
               this.getMembersFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.teamId_ = 0;
            this.bitField0_ &= -2;
            this.teamName_ = "";
            this.bitField0_ &= -3;
            if (this.membersBuilder_ == null) {
               this.members_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.membersBuilder_.clear();
            }

            this.score_ = 0;
            this.bitField0_ &= -9;
            this.rank_ = 0;
            this.bitField0_ &= -17;
            this.integral_ = 0;
            this.bitField0_ &= -33;
            this.changeRank_ = 0;
            this.bitField0_ &= -65;
            this.changeIntegral_ = 0;
            this.bitField0_ &= -129;
            this.server_ = 0;
            this.bitField0_ &= -257;
            this.power_ = 0L;
            this.bitField0_ &= -513;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Team_Info_descriptor;
         }

         public S2C_Team_Info getDefaultInstanceForType() {
            return BattleMsg.S2C_Team_Info.getDefaultInstance();
         }

         public S2C_Team_Info build() {
            S2C_Team_Info result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Team_Info buildPartial() {
            S2C_Team_Info result = new S2C_Team_Info(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.teamId_ = this.teamId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.teamName_ = this.teamName_;
            if (this.membersBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.members_ = Collections.unmodifiableList(this.members_);
                  this.bitField0_ &= -5;
               }

               result.members_ = this.members_;
            } else {
               result.members_ = this.membersBuilder_.build();
            }

            if ((from_bitField0_ & 8) != 0) {
               result.score_ = this.score_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.integral_ = this.integral_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.changeRank_ = this.changeRank_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.changeIntegral_ = this.changeIntegral_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.server_ = this.server_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.power_ = this.power_;
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
            if (other instanceof S2C_Team_Info) {
               return this.mergeFrom((S2C_Team_Info)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Team_Info other) {
            if (other == BattleMsg.S2C_Team_Info.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTeamId()) {
                  this.setTeamId(other.getTeamId());
               }

               if (other.hasTeamName()) {
                  this.bitField0_ |= 2;
                  this.teamName_ = other.teamName_;
                  this.onChanged();
               }

               if (this.membersBuilder_ == null) {
                  if (!other.members_.isEmpty()) {
                     if (this.members_.isEmpty()) {
                        this.members_ = other.members_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureMembersIsMutable();
                        this.members_.addAll(other.members_);
                     }

                     this.onChanged();
                  }
               } else if (!other.members_.isEmpty()) {
                  if (this.membersBuilder_.isEmpty()) {
                     this.membersBuilder_.dispose();
                     this.membersBuilder_ = null;
                     this.members_ = other.members_;
                     this.bitField0_ &= -5;
                     this.membersBuilder_ = BattleMsg.S2C_Team_Info.alwaysUseFieldBuilders ? this.getMembersFieldBuilder() : null;
                  } else {
                     this.membersBuilder_.addAllMessages(other.members_);
                  }
               }

               if (other.hasScore()) {
                  this.setScore(other.getScore());
               }

               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasIntegral()) {
                  this.setIntegral(other.getIntegral());
               }

               if (other.hasChangeRank()) {
                  this.setChangeRank(other.getChangeRank());
               }

               if (other.hasChangeIntegral()) {
                  this.setChangeIntegral(other.getChangeIntegral());
               }

               if (other.hasServer()) {
                  this.setServer(other.getServer());
               }

               if (other.hasPower()) {
                  this.setPower(other.getPower());
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
            S2C_Team_Info parsedMessage = null;

            try {
               parsedMessage = (S2C_Team_Info)BattleMsg.S2C_Team_Info.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Team_Info)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTeamId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTeamId() {
            return this.teamId_;
         }

         public Builder setTeamId(int value) {
            this.bitField0_ |= 1;
            this.teamId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTeamId() {
            this.bitField0_ &= -2;
            this.teamId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTeamName() {
            return (this.bitField0_ & 2) != 0;
         }

         public String getTeamName() {
            Object ref = this.teamName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.teamName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getTeamNameBytes() {
            Object ref = this.teamName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.teamName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setTeamName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.teamName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearTeamName() {
            this.bitField0_ &= -3;
            this.teamName_ = BattleMsg.S2C_Team_Info.getDefaultInstance().getTeamName();
            this.onChanged();
            return this;
         }

         public Builder setTeamNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.teamName_ = value;
               this.onChanged();
               return this;
            }
         }

         private void ensureMembersIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.members_ = new ArrayList(this.members_);
               this.bitField0_ |= 4;
            }

         }

         public List<S2C_TeamMember_Info> getMembersList() {
            return this.membersBuilder_ == null ? Collections.unmodifiableList(this.members_) : this.membersBuilder_.getMessageList();
         }

         public int getMembersCount() {
            return this.membersBuilder_ == null ? this.members_.size() : this.membersBuilder_.getCount();
         }

         public S2C_TeamMember_Info getMembers(int index) {
            return this.membersBuilder_ == null ? (S2C_TeamMember_Info)this.members_.get(index) : (S2C_TeamMember_Info)this.membersBuilder_.getMessage(index);
         }

         public Builder setMembers(int index, S2C_TeamMember_Info value) {
            if (this.membersBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMembersIsMutable();
               this.members_.set(index, value);
               this.onChanged();
            } else {
               this.membersBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setMembers(int index, S2C_TeamMember_Info.Builder builderForValue) {
            if (this.membersBuilder_ == null) {
               this.ensureMembersIsMutable();
               this.members_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.membersBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMembers(S2C_TeamMember_Info value) {
            if (this.membersBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMembersIsMutable();
               this.members_.add(value);
               this.onChanged();
            } else {
               this.membersBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addMembers(int index, S2C_TeamMember_Info value) {
            if (this.membersBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMembersIsMutable();
               this.members_.add(index, value);
               this.onChanged();
            } else {
               this.membersBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addMembers(S2C_TeamMember_Info.Builder builderForValue) {
            if (this.membersBuilder_ == null) {
               this.ensureMembersIsMutable();
               this.members_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.membersBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMembers(int index, S2C_TeamMember_Info.Builder builderForValue) {
            if (this.membersBuilder_ == null) {
               this.ensureMembersIsMutable();
               this.members_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.membersBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMembers(Iterable<? extends S2C_TeamMember_Info> values) {
            if (this.membersBuilder_ == null) {
               this.ensureMembersIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.members_);
               this.onChanged();
            } else {
               this.membersBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearMembers() {
            if (this.membersBuilder_ == null) {
               this.members_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.membersBuilder_.clear();
            }

            return this;
         }

         public Builder removeMembers(int index) {
            if (this.membersBuilder_ == null) {
               this.ensureMembersIsMutable();
               this.members_.remove(index);
               this.onChanged();
            } else {
               this.membersBuilder_.remove(index);
            }

            return this;
         }

         public S2C_TeamMember_Info.Builder getMembersBuilder(int index) {
            return (S2C_TeamMember_Info.Builder)this.getMembersFieldBuilder().getBuilder(index);
         }

         public S2C_TeamMember_InfoOrBuilder getMembersOrBuilder(int index) {
            return this.membersBuilder_ == null ? (S2C_TeamMember_InfoOrBuilder)this.members_.get(index) : (S2C_TeamMember_InfoOrBuilder)this.membersBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends S2C_TeamMember_InfoOrBuilder> getMembersOrBuilderList() {
            return this.membersBuilder_ != null ? this.membersBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.members_);
         }

         public S2C_TeamMember_Info.Builder addMembersBuilder() {
            return (S2C_TeamMember_Info.Builder)this.getMembersFieldBuilder().addBuilder(BattleMsg.S2C_TeamMember_Info.getDefaultInstance());
         }

         public S2C_TeamMember_Info.Builder addMembersBuilder(int index) {
            return (S2C_TeamMember_Info.Builder)this.getMembersFieldBuilder().addBuilder(index, BattleMsg.S2C_TeamMember_Info.getDefaultInstance());
         }

         public List<S2C_TeamMember_Info.Builder> getMembersBuilderList() {
            return this.getMembersFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<S2C_TeamMember_Info, S2C_TeamMember_Info.Builder, S2C_TeamMember_InfoOrBuilder> getMembersFieldBuilder() {
            if (this.membersBuilder_ == null) {
               this.membersBuilder_ = new RepeatedFieldBuilderV3(this.members_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.members_ = null;
            }

            return this.membersBuilder_;
         }

         public boolean hasScore() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getScore() {
            return this.score_;
         }

         public Builder setScore(int value) {
            this.bitField0_ |= 8;
            this.score_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearScore() {
            this.bitField0_ &= -9;
            this.score_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRank() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getRank() {
            return this.rank_;
         }

         public Builder setRank(int value) {
            this.bitField0_ |= 16;
            this.rank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRank() {
            this.bitField0_ &= -17;
            this.rank_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIntegral() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getIntegral() {
            return this.integral_;
         }

         public Builder setIntegral(int value) {
            this.bitField0_ |= 32;
            this.integral_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIntegral() {
            this.bitField0_ &= -33;
            this.integral_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasChangeRank() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getChangeRank() {
            return this.changeRank_;
         }

         public Builder setChangeRank(int value) {
            this.bitField0_ |= 64;
            this.changeRank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChangeRank() {
            this.bitField0_ &= -65;
            this.changeRank_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasChangeIntegral() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getChangeIntegral() {
            return this.changeIntegral_;
         }

         public Builder setChangeIntegral(int value) {
            this.bitField0_ |= 128;
            this.changeIntegral_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChangeIntegral() {
            this.bitField0_ &= -129;
            this.changeIntegral_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasServer() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getServer() {
            return this.server_;
         }

         public Builder setServer(int value) {
            this.bitField0_ |= 256;
            this.server_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServer() {
            this.bitField0_ &= -257;
            this.server_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPower() {
            return (this.bitField0_ & 512) != 0;
         }

         public long getPower() {
            return this.power_;
         }

         public Builder setPower(long value) {
            this.bitField0_ |= 512;
            this.power_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPower() {
            this.bitField0_ &= -513;
            this.power_ = 0L;
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

   public static final class S2C_TeamMember_Info extends GeneratedMessageV3 implements S2C_TeamMember_InfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 2;
      private volatile Object playerName_;
      public static final int LV_FIELD_NUMBER = 3;
      private int lv_;
      public static final int HEAD_FIELD_NUMBER = 4;
      private int head_;
      public static final int HEADFRAME_FIELD_NUMBER = 5;
      private int headFrame_;
      private byte memoizedIsInitialized;
      private static final S2C_TeamMember_Info DEFAULT_INSTANCE = new S2C_TeamMember_Info();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TeamMember_Info> PARSER = new AbstractParser<S2C_TeamMember_Info>() {
         public S2C_TeamMember_Info parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TeamMember_Info(input, extensionRegistry);
         }
      };

      private S2C_TeamMember_Info(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TeamMember_Info() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TeamMember_Info();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TeamMember_Info(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_TeamMember_Info_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_TeamMember_Info_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TeamMember_Info.class, Builder.class);
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
            output.writeInt32(1, this.playerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.playerName_);
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
               size += CodedOutputStream.computeInt32Size(3, this.lv_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.head_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.headFrame_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TeamMember_Info)) {
            return super.equals(obj);
         } else {
            S2C_TeamMember_Info other = (S2C_TeamMember_Info)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TeamMember_Info parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TeamMember_Info)PARSER.parseFrom(data);
      }

      public static S2C_TeamMember_Info parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TeamMember_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TeamMember_Info parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TeamMember_Info)PARSER.parseFrom(data);
      }

      public static S2C_TeamMember_Info parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TeamMember_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TeamMember_Info parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TeamMember_Info)PARSER.parseFrom(data);
      }

      public static S2C_TeamMember_Info parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TeamMember_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TeamMember_Info parseFrom(InputStream input) throws IOException {
         return (S2C_TeamMember_Info)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TeamMember_Info parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TeamMember_Info)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TeamMember_Info parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TeamMember_Info)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TeamMember_Info parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TeamMember_Info)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TeamMember_Info parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TeamMember_Info)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TeamMember_Info parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TeamMember_Info)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TeamMember_Info prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TeamMember_Info getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TeamMember_Info> parser() {
         return PARSER;
      }

      public Parser<S2C_TeamMember_Info> getParserForType() {
         return PARSER;
      }

      public S2C_TeamMember_Info getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TeamMember_InfoOrBuilder {
         private int bitField0_;
         private int playerId_;
         private Object playerName_;
         private int lv_;
         private int head_;
         private int headFrame_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_TeamMember_Info_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_TeamMember_Info_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TeamMember_Info.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.S2C_TeamMember_Info.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.playerName_ = "";
            this.bitField0_ &= -3;
            this.lv_ = 0;
            this.bitField0_ &= -5;
            this.head_ = 0;
            this.bitField0_ &= -9;
            this.headFrame_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_TeamMember_Info_descriptor;
         }

         public S2C_TeamMember_Info getDefaultInstanceForType() {
            return BattleMsg.S2C_TeamMember_Info.getDefaultInstance();
         }

         public S2C_TeamMember_Info build() {
            S2C_TeamMember_Info result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TeamMember_Info buildPartial() {
            S2C_TeamMember_Info result = new S2C_TeamMember_Info(this);
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
            if (other instanceof S2C_TeamMember_Info) {
               return this.mergeFrom((S2C_TeamMember_Info)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TeamMember_Info other) {
            if (other == BattleMsg.S2C_TeamMember_Info.getDefaultInstance()) {
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

               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
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
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TeamMember_Info parsedMessage = null;

            try {
               parsedMessage = (S2C_TeamMember_Info)BattleMsg.S2C_TeamMember_Info.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TeamMember_Info)e.getUnfinishedMessage();
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
            this.playerName_ = BattleMsg.S2C_TeamMember_Info.getDefaultInstance().getPlayerName();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_Battle_Round extends GeneratedMessageV3 implements S2C_Battle_RoundOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ROUND_FIELD_NUMBER = 1;
      private int round_;
      public static final int ACTIONS_FIELD_NUMBER = 2;
      private List<S2C_Battle_Action> actions_;
      private byte memoizedIsInitialized;
      private static final S2C_Battle_Round DEFAULT_INSTANCE = new S2C_Battle_Round();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Battle_Round> PARSER = new AbstractParser<S2C_Battle_Round>() {
         public S2C_Battle_Round parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Battle_Round(input, extensionRegistry);
         }
      };

      private S2C_Battle_Round(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Battle_Round() {
         this.memoizedIsInitialized = -1;
         this.actions_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Battle_Round();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Battle_Round(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.actions_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.actions_.add(input.readMessage(BattleMsg.S2C_Battle_Action.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.actions_ = Collections.unmodifiableList(this.actions_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Round_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Round_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Battle_Round.class, Builder.class);
      }

      public boolean hasRound() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRound() {
         return this.round_;
      }

      public List<S2C_Battle_Action> getActionsList() {
         return this.actions_;
      }

      public List<? extends S2C_Battle_ActionOrBuilder> getActionsOrBuilderList() {
         return this.actions_;
      }

      public int getActionsCount() {
         return this.actions_.size();
      }

      public S2C_Battle_Action getActions(int index) {
         return (S2C_Battle_Action)this.actions_.get(index);
      }

      public S2C_Battle_ActionOrBuilder getActionsOrBuilder(int index) {
         return (S2C_Battle_ActionOrBuilder)this.actions_.get(index);
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
         } else {
            for(int i = 0; i < this.getActionsCount(); ++i) {
               if (!this.getActions(i).isInitialized()) {
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

         for(int i = 0; i < this.actions_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.actions_.get(i));
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

            for(int i = 0; i < this.actions_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.actions_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Battle_Round)) {
            return super.equals(obj);
         } else {
            S2C_Battle_Round other = (S2C_Battle_Round)obj;
            if (this.hasRound() != other.hasRound()) {
               return false;
            } else if (this.hasRound() && this.getRound() != other.getRound()) {
               return false;
            } else if (!this.getActionsList().equals(other.getActionsList())) {
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

            if (this.getActionsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getActionsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Battle_Round parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Battle_Round)PARSER.parseFrom(data);
      }

      public static S2C_Battle_Round parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_Round)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_Round parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Battle_Round)PARSER.parseFrom(data);
      }

      public static S2C_Battle_Round parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_Round)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_Round parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Battle_Round)PARSER.parseFrom(data);
      }

      public static S2C_Battle_Round parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_Round)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_Round parseFrom(InputStream input) throws IOException {
         return (S2C_Battle_Round)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Battle_Round parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_Round)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Battle_Round parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Battle_Round)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Battle_Round parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_Round)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Battle_Round parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Battle_Round)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Battle_Round parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_Round)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Battle_Round prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Battle_Round getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Battle_Round> parser() {
         return PARSER;
      }

      public Parser<S2C_Battle_Round> getParserForType() {
         return PARSER;
      }

      public S2C_Battle_Round getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Battle_RoundOrBuilder {
         private int bitField0_;
         private int round_;
         private List<S2C_Battle_Action> actions_;
         private RepeatedFieldBuilderV3<S2C_Battle_Action, S2C_Battle_Action.Builder, S2C_Battle_ActionOrBuilder> actionsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Round_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Round_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Battle_Round.class, Builder.class);
         }

         private Builder() {
            this.actions_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.actions_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.S2C_Battle_Round.alwaysUseFieldBuilders) {
               this.getActionsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.round_ = 0;
            this.bitField0_ &= -2;
            if (this.actionsBuilder_ == null) {
               this.actions_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.actionsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Round_descriptor;
         }

         public S2C_Battle_Round getDefaultInstanceForType() {
            return BattleMsg.S2C_Battle_Round.getDefaultInstance();
         }

         public S2C_Battle_Round build() {
            S2C_Battle_Round result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Battle_Round buildPartial() {
            S2C_Battle_Round result = new S2C_Battle_Round(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.round_ = this.round_;
               to_bitField0_ |= 1;
            }

            if (this.actionsBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.actions_ = Collections.unmodifiableList(this.actions_);
                  this.bitField0_ &= -3;
               }

               result.actions_ = this.actions_;
            } else {
               result.actions_ = this.actionsBuilder_.build();
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
            if (other instanceof S2C_Battle_Round) {
               return this.mergeFrom((S2C_Battle_Round)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Battle_Round other) {
            if (other == BattleMsg.S2C_Battle_Round.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRound()) {
                  this.setRound(other.getRound());
               }

               if (this.actionsBuilder_ == null) {
                  if (!other.actions_.isEmpty()) {
                     if (this.actions_.isEmpty()) {
                        this.actions_ = other.actions_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureActionsIsMutable();
                        this.actions_.addAll(other.actions_);
                     }

                     this.onChanged();
                  }
               } else if (!other.actions_.isEmpty()) {
                  if (this.actionsBuilder_.isEmpty()) {
                     this.actionsBuilder_.dispose();
                     this.actionsBuilder_ = null;
                     this.actions_ = other.actions_;
                     this.bitField0_ &= -3;
                     this.actionsBuilder_ = BattleMsg.S2C_Battle_Round.alwaysUseFieldBuilders ? this.getActionsFieldBuilder() : null;
                  } else {
                     this.actionsBuilder_.addAllMessages(other.actions_);
                  }
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
               for(int i = 0; i < this.getActionsCount(); ++i) {
                  if (!this.getActions(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Battle_Round parsedMessage = null;

            try {
               parsedMessage = (S2C_Battle_Round)BattleMsg.S2C_Battle_Round.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Battle_Round)e.getUnfinishedMessage();
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

         private void ensureActionsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.actions_ = new ArrayList(this.actions_);
               this.bitField0_ |= 2;
            }

         }

         public List<S2C_Battle_Action> getActionsList() {
            return this.actionsBuilder_ == null ? Collections.unmodifiableList(this.actions_) : this.actionsBuilder_.getMessageList();
         }

         public int getActionsCount() {
            return this.actionsBuilder_ == null ? this.actions_.size() : this.actionsBuilder_.getCount();
         }

         public S2C_Battle_Action getActions(int index) {
            return this.actionsBuilder_ == null ? (S2C_Battle_Action)this.actions_.get(index) : (S2C_Battle_Action)this.actionsBuilder_.getMessage(index);
         }

         public Builder setActions(int index, S2C_Battle_Action value) {
            if (this.actionsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureActionsIsMutable();
               this.actions_.set(index, value);
               this.onChanged();
            } else {
               this.actionsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setActions(int index, S2C_Battle_Action.Builder builderForValue) {
            if (this.actionsBuilder_ == null) {
               this.ensureActionsIsMutable();
               this.actions_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.actionsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addActions(S2C_Battle_Action value) {
            if (this.actionsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureActionsIsMutable();
               this.actions_.add(value);
               this.onChanged();
            } else {
               this.actionsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addActions(int index, S2C_Battle_Action value) {
            if (this.actionsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureActionsIsMutable();
               this.actions_.add(index, value);
               this.onChanged();
            } else {
               this.actionsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addActions(S2C_Battle_Action.Builder builderForValue) {
            if (this.actionsBuilder_ == null) {
               this.ensureActionsIsMutable();
               this.actions_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.actionsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addActions(int index, S2C_Battle_Action.Builder builderForValue) {
            if (this.actionsBuilder_ == null) {
               this.ensureActionsIsMutable();
               this.actions_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.actionsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllActions(Iterable<? extends S2C_Battle_Action> values) {
            if (this.actionsBuilder_ == null) {
               this.ensureActionsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.actions_);
               this.onChanged();
            } else {
               this.actionsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearActions() {
            if (this.actionsBuilder_ == null) {
               this.actions_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.actionsBuilder_.clear();
            }

            return this;
         }

         public Builder removeActions(int index) {
            if (this.actionsBuilder_ == null) {
               this.ensureActionsIsMutable();
               this.actions_.remove(index);
               this.onChanged();
            } else {
               this.actionsBuilder_.remove(index);
            }

            return this;
         }

         public S2C_Battle_Action.Builder getActionsBuilder(int index) {
            return (S2C_Battle_Action.Builder)this.getActionsFieldBuilder().getBuilder(index);
         }

         public S2C_Battle_ActionOrBuilder getActionsOrBuilder(int index) {
            return this.actionsBuilder_ == null ? (S2C_Battle_ActionOrBuilder)this.actions_.get(index) : (S2C_Battle_ActionOrBuilder)this.actionsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends S2C_Battle_ActionOrBuilder> getActionsOrBuilderList() {
            return this.actionsBuilder_ != null ? this.actionsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.actions_);
         }

         public S2C_Battle_Action.Builder addActionsBuilder() {
            return (S2C_Battle_Action.Builder)this.getActionsFieldBuilder().addBuilder(BattleMsg.S2C_Battle_Action.getDefaultInstance());
         }

         public S2C_Battle_Action.Builder addActionsBuilder(int index) {
            return (S2C_Battle_Action.Builder)this.getActionsFieldBuilder().addBuilder(index, BattleMsg.S2C_Battle_Action.getDefaultInstance());
         }

         public List<S2C_Battle_Action.Builder> getActionsBuilderList() {
            return this.getActionsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<S2C_Battle_Action, S2C_Battle_Action.Builder, S2C_Battle_ActionOrBuilder> getActionsFieldBuilder() {
            if (this.actionsBuilder_ == null) {
               this.actionsBuilder_ = new RepeatedFieldBuilderV3(this.actions_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.actions_ = null;
            }

            return this.actionsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class Battle_Result_Value extends GeneratedMessageV3 implements Battle_Result_ValueOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POS_FIELD_NUMBER = 1;
      private int pos_;
      public static final int NUM_FIELD_NUMBER = 2;
      private long num_;
      private byte memoizedIsInitialized;
      private static final Battle_Result_Value DEFAULT_INSTANCE = new Battle_Result_Value();
      /** @deprecated */
      @Deprecated
      public static final Parser<Battle_Result_Value> PARSER = new AbstractParser<Battle_Result_Value>() {
         public Battle_Result_Value parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new Battle_Result_Value(input, extensionRegistry);
         }
      };

      private Battle_Result_Value(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private Battle_Result_Value() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new Battle_Result_Value();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private Battle_Result_Value(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.pos_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.num_ = input.readInt64();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_Battle_Result_Value_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_Battle_Result_Value_fieldAccessorTable.ensureFieldAccessorsInitialized(Battle_Result_Value.class, Builder.class);
      }

      public boolean hasPos() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPos() {
         return this.pos_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getNum() {
         return this.num_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPos()) {
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
            output.writeInt32(1, this.pos_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.num_);
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
               size += CodedOutputStream.computeInt32Size(1, this.pos_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(2, this.num_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof Battle_Result_Value)) {
            return super.equals(obj);
         } else {
            Battle_Result_Value other = (Battle_Result_Value)obj;
            if (this.hasPos() != other.hasPos()) {
               return false;
            } else if (this.hasPos() && this.getPos() != other.getPos()) {
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
            if (this.hasPos()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPos();
            }

            if (this.hasNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getNum());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static Battle_Result_Value parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (Battle_Result_Value)PARSER.parseFrom(data);
      }

      public static Battle_Result_Value parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Battle_Result_Value)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Battle_Result_Value parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (Battle_Result_Value)PARSER.parseFrom(data);
      }

      public static Battle_Result_Value parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Battle_Result_Value)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Battle_Result_Value parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (Battle_Result_Value)PARSER.parseFrom(data);
      }

      public static Battle_Result_Value parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Battle_Result_Value)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Battle_Result_Value parseFrom(InputStream input) throws IOException {
         return (Battle_Result_Value)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static Battle_Result_Value parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Battle_Result_Value)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static Battle_Result_Value parseDelimitedFrom(InputStream input) throws IOException {
         return (Battle_Result_Value)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static Battle_Result_Value parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Battle_Result_Value)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static Battle_Result_Value parseFrom(CodedInputStream input) throws IOException {
         return (Battle_Result_Value)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static Battle_Result_Value parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Battle_Result_Value)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(Battle_Result_Value prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static Battle_Result_Value getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<Battle_Result_Value> parser() {
         return PARSER;
      }

      public Parser<Battle_Result_Value> getParserForType() {
         return PARSER;
      }

      public Battle_Result_Value getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Battle_Result_ValueOrBuilder {
         private int bitField0_;
         private int pos_;
         private long num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_Battle_Result_Value_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_Battle_Result_Value_fieldAccessorTable.ensureFieldAccessorsInitialized(Battle_Result_Value.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.Battle_Result_Value.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.pos_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0L;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_Battle_Result_Value_descriptor;
         }

         public Battle_Result_Value getDefaultInstanceForType() {
            return BattleMsg.Battle_Result_Value.getDefaultInstance();
         }

         public Battle_Result_Value build() {
            Battle_Result_Value result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public Battle_Result_Value buildPartial() {
            Battle_Result_Value result = new Battle_Result_Value(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.pos_ = this.pos_;
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
            if (other instanceof Battle_Result_Value) {
               return this.mergeFrom((Battle_Result_Value)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(Battle_Result_Value other) {
            if (other == BattleMsg.Battle_Result_Value.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPos()) {
                  this.setPos(other.getPos());
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
            if (!this.hasPos()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            Battle_Result_Value parsedMessage = null;

            try {
               parsedMessage = (Battle_Result_Value)BattleMsg.Battle_Result_Value.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (Battle_Result_Value)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPos() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPos() {
            return this.pos_;
         }

         public Builder setPos(int value) {
            this.bitField0_ |= 1;
            this.pos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPos() {
            this.bitField0_ &= -2;
            this.pos_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getNum() {
            return this.num_;
         }

         public Builder setNum(long value) {
            this.bitField0_ |= 2;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -3;
            this.num_ = 0L;
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

   public static final class S2C_Battle_Result extends GeneratedMessageV3 implements S2C_Battle_ResultOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int DAMAGE_FIELD_NUMBER = 2;
      private List<Battle_Result_Value> damage_;
      public static final int RECOVER_FIELD_NUMBER = 3;
      private List<Battle_Result_Value> recover_;
      public static final int HURT_FIELD_NUMBER = 4;
      private List<Battle_Result_Value> hurt_;
      public static final int RECORDID_FIELD_NUMBER = 5;
      private int recordId_;
      public static final int ROUND_FIELD_NUMBER = 6;
      private int round_;
      public static final int PLAYERLV_FIELD_NUMBER = 7;
      private int playerLv_;
      public static final int PLAYEREXP_FIELD_NUMBER = 8;
      private int playerExp_;
      public static final int AWARDITEMS_FIELD_NUMBER = 9;
      private List<CommonMsg.ItemInfo> awardItems_;
      public static final int TEAMINFOS_FIELD_NUMBER = 10;
      private List<S2C_Team_Info> teamInfos_;
      public static final int NEXTRECORDID_FIELD_NUMBER = 11;
      private int nextRecordId_;
      public static final int SETTLEINFO_FIELD_NUMBER = 12;
      private Internal.LongList settleInfo_;
      public static final int ISMAXROUNDEND_FIELD_NUMBER = 13;
      private boolean isMaxRoundEnd_;
      private byte memoizedIsInitialized;
      private static final S2C_Battle_Result DEFAULT_INSTANCE = new S2C_Battle_Result();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Battle_Result> PARSER = new AbstractParser<S2C_Battle_Result>() {
         public S2C_Battle_Result parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Battle_Result(input, extensionRegistry);
         }
      };

      private S2C_Battle_Result(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Battle_Result() {
         this.memoizedIsInitialized = -1;
         this.damage_ = Collections.emptyList();
         this.recover_ = Collections.emptyList();
         this.hurt_ = Collections.emptyList();
         this.awardItems_ = Collections.emptyList();
         this.teamInfos_ = Collections.emptyList();
         this.settleInfo_ = emptyLongList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Battle_Result();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Battle_Result(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.result_ = input.readInt32();
                        continue;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.damage_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.damage_.add(input.readMessage(BattleMsg.Battle_Result_Value.PARSER, extensionRegistry));
                        continue;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.recover_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.recover_.add(input.readMessage(BattleMsg.Battle_Result_Value.PARSER, extensionRegistry));
                        continue;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.hurt_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.hurt_.add(input.readMessage(BattleMsg.Battle_Result_Value.PARSER, extensionRegistry));
                        continue;
                     case 40:
                        this.bitField0_ |= 2;
                        this.recordId_ = input.readInt32();
                        continue;
                     case 48:
                        this.bitField0_ |= 4;
                        this.round_ = input.readInt32();
                        continue;
                     case 56:
                        this.bitField0_ |= 8;
                        this.playerLv_ = input.readInt32();
                        continue;
                     case 64:
                        this.bitField0_ |= 16;
                        this.playerExp_ = input.readInt32();
                        continue;
                     case 74:
                        if ((mutable_bitField0_ & 256) == 0) {
                           this.awardItems_ = new ArrayList();
                           mutable_bitField0_ |= 256;
                        }

                        this.awardItems_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        continue;
                     case 82:
                        if ((mutable_bitField0_ & 512) == 0) {
                           this.teamInfos_ = new ArrayList();
                           mutable_bitField0_ |= 512;
                        }

                        this.teamInfos_.add(input.readMessage(BattleMsg.S2C_Team_Info.PARSER, extensionRegistry));
                        continue;
                     case 88:
                        this.bitField0_ |= 32;
                        this.nextRecordId_ = input.readInt32();
                        continue;
                     case 96:
                        if ((mutable_bitField0_ & 2048) == 0) {
                           this.settleInfo_ = newLongList();
                           mutable_bitField0_ |= 2048;
                        }

                        this.settleInfo_.addLong(input.readInt64());
                        continue;
                     case 98:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2048) == 0 && input.getBytesUntilLimit() > 0) {
                           this.settleInfo_ = newLongList();
                           mutable_bitField0_ |= 2048;
                        }
                        break;
                     case 104:
                        this.bitField0_ |= 64;
                        this.isMaxRoundEnd_ = input.readBool();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.settleInfo_.addLong(input.readInt64());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.damage_ = Collections.unmodifiableList(this.damage_);
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.recover_ = Collections.unmodifiableList(this.recover_);
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.hurt_ = Collections.unmodifiableList(this.hurt_);
               }

               if ((mutable_bitField0_ & 256) != 0) {
                  this.awardItems_ = Collections.unmodifiableList(this.awardItems_);
               }

               if ((mutable_bitField0_ & 512) != 0) {
                  this.teamInfos_ = Collections.unmodifiableList(this.teamInfos_);
               }

               if ((mutable_bitField0_ & 2048) != 0) {
                  this.settleInfo_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Result_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Result_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Battle_Result.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public List<Battle_Result_Value> getDamageList() {
         return this.damage_;
      }

      public List<? extends Battle_Result_ValueOrBuilder> getDamageOrBuilderList() {
         return this.damage_;
      }

      public int getDamageCount() {
         return this.damage_.size();
      }

      public Battle_Result_Value getDamage(int index) {
         return (Battle_Result_Value)this.damage_.get(index);
      }

      public Battle_Result_ValueOrBuilder getDamageOrBuilder(int index) {
         return (Battle_Result_ValueOrBuilder)this.damage_.get(index);
      }

      public List<Battle_Result_Value> getRecoverList() {
         return this.recover_;
      }

      public List<? extends Battle_Result_ValueOrBuilder> getRecoverOrBuilderList() {
         return this.recover_;
      }

      public int getRecoverCount() {
         return this.recover_.size();
      }

      public Battle_Result_Value getRecover(int index) {
         return (Battle_Result_Value)this.recover_.get(index);
      }

      public Battle_Result_ValueOrBuilder getRecoverOrBuilder(int index) {
         return (Battle_Result_ValueOrBuilder)this.recover_.get(index);
      }

      public List<Battle_Result_Value> getHurtList() {
         return this.hurt_;
      }

      public List<? extends Battle_Result_ValueOrBuilder> getHurtOrBuilderList() {
         return this.hurt_;
      }

      public int getHurtCount() {
         return this.hurt_.size();
      }

      public Battle_Result_Value getHurt(int index) {
         return (Battle_Result_Value)this.hurt_.get(index);
      }

      public Battle_Result_ValueOrBuilder getHurtOrBuilder(int index) {
         return (Battle_Result_ValueOrBuilder)this.hurt_.get(index);
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRecordId() {
         return this.recordId_;
      }

      public boolean hasRound() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getRound() {
         return this.round_;
      }

      public boolean hasPlayerLv() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getPlayerLv() {
         return this.playerLv_;
      }

      public boolean hasPlayerExp() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getPlayerExp() {
         return this.playerExp_;
      }

      public List<CommonMsg.ItemInfo> getAwardItemsList() {
         return this.awardItems_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getAwardItemsOrBuilderList() {
         return this.awardItems_;
      }

      public int getAwardItemsCount() {
         return this.awardItems_.size();
      }

      public CommonMsg.ItemInfo getAwardItems(int index) {
         return (CommonMsg.ItemInfo)this.awardItems_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getAwardItemsOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.awardItems_.get(index);
      }

      public List<S2C_Team_Info> getTeamInfosList() {
         return this.teamInfos_;
      }

      public List<? extends S2C_Team_InfoOrBuilder> getTeamInfosOrBuilderList() {
         return this.teamInfos_;
      }

      public int getTeamInfosCount() {
         return this.teamInfos_.size();
      }

      public S2C_Team_Info getTeamInfos(int index) {
         return (S2C_Team_Info)this.teamInfos_.get(index);
      }

      public S2C_Team_InfoOrBuilder getTeamInfosOrBuilder(int index) {
         return (S2C_Team_InfoOrBuilder)this.teamInfos_.get(index);
      }

      public boolean hasNextRecordId() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getNextRecordId() {
         return this.nextRecordId_;
      }

      public List<Long> getSettleInfoList() {
         return this.settleInfo_;
      }

      public int getSettleInfoCount() {
         return this.settleInfo_.size();
      }

      public long getSettleInfo(int index) {
         return this.settleInfo_.getLong(index);
      }

      public boolean hasIsMaxRoundEnd() {
         return (this.bitField0_ & 64) != 0;
      }

      public boolean getIsMaxRoundEnd() {
         return this.isMaxRoundEnd_;
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
         } else if (!this.hasRound()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getDamageCount(); ++i) {
               if (!this.getDamage(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getRecoverCount(); ++i) {
               if (!this.getRecover(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getHurtCount(); ++i) {
               if (!this.getHurt(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getAwardItemsCount(); ++i) {
               if (!this.getAwardItems(i).isInitialized()) {
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

         for(int i = 0; i < this.damage_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.damage_.get(i));
         }

         for(int i = 0; i < this.recover_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.recover_.get(i));
         }

         for(int i = 0; i < this.hurt_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.hurt_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(5, this.recordId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(6, this.round_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(7, this.playerLv_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(8, this.playerExp_);
         }

         for(int i = 0; i < this.awardItems_.size(); ++i) {
            output.writeMessage(9, (MessageLite)this.awardItems_.get(i));
         }

         for(int i = 0; i < this.teamInfos_.size(); ++i) {
            output.writeMessage(10, (MessageLite)this.teamInfos_.get(i));
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(11, this.nextRecordId_);
         }

         for(int i = 0; i < this.settleInfo_.size(); ++i) {
            output.writeInt64(12, this.settleInfo_.getLong(i));
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeBool(13, this.isMaxRoundEnd_);
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

            for(int i = 0; i < this.damage_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.damage_.get(i));
            }

            for(int i = 0; i < this.recover_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.recover_.get(i));
            }

            for(int i = 0; i < this.hurt_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.hurt_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.recordId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.round_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.playerLv_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.playerExp_);
            }

            for(int i = 0; i < this.awardItems_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(9, (MessageLite)this.awardItems_.get(i));
            }

            for(int i = 0; i < this.teamInfos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(10, (MessageLite)this.teamInfos_.get(i));
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.nextRecordId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.settleInfo_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt64SizeNoTag(this.settleInfo_.getLong(i));
            }

            size += dataSize;
            size += 1 * this.getSettleInfoList().size();
            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeBoolSize(13, this.isMaxRoundEnd_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Battle_Result)) {
            return super.equals(obj);
         } else {
            S2C_Battle_Result other = (S2C_Battle_Result)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (!this.getDamageList().equals(other.getDamageList())) {
               return false;
            } else if (!this.getRecoverList().equals(other.getRecoverList())) {
               return false;
            } else if (!this.getHurtList().equals(other.getHurtList())) {
               return false;
            } else if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
               return false;
            } else if (this.hasRound() != other.hasRound()) {
               return false;
            } else if (this.hasRound() && this.getRound() != other.getRound()) {
               return false;
            } else if (this.hasPlayerLv() != other.hasPlayerLv()) {
               return false;
            } else if (this.hasPlayerLv() && this.getPlayerLv() != other.getPlayerLv()) {
               return false;
            } else if (this.hasPlayerExp() != other.hasPlayerExp()) {
               return false;
            } else if (this.hasPlayerExp() && this.getPlayerExp() != other.getPlayerExp()) {
               return false;
            } else if (!this.getAwardItemsList().equals(other.getAwardItemsList())) {
               return false;
            } else if (!this.getTeamInfosList().equals(other.getTeamInfosList())) {
               return false;
            } else if (this.hasNextRecordId() != other.hasNextRecordId()) {
               return false;
            } else if (this.hasNextRecordId() && this.getNextRecordId() != other.getNextRecordId()) {
               return false;
            } else if (!this.getSettleInfoList().equals(other.getSettleInfoList())) {
               return false;
            } else if (this.hasIsMaxRoundEnd() != other.hasIsMaxRoundEnd()) {
               return false;
            } else if (this.hasIsMaxRoundEnd() && this.getIsMaxRoundEnd() != other.getIsMaxRoundEnd()) {
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

            if (this.getDamageCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDamageList().hashCode();
            }

            if (this.getRecoverCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRecoverList().hashCode();
            }

            if (this.getHurtCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHurtList().hashCode();
            }

            if (this.hasRecordId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getRecordId();
            }

            if (this.hasRound()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getRound();
            }

            if (this.hasPlayerLv()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getPlayerLv();
            }

            if (this.hasPlayerExp()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getPlayerExp();
            }

            if (this.getAwardItemsCount() > 0) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getAwardItemsList().hashCode();
            }

            if (this.getTeamInfosCount() > 0) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getTeamInfosList().hashCode();
            }

            if (this.hasNextRecordId()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getNextRecordId();
            }

            if (this.getSettleInfoCount() > 0) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getSettleInfoList().hashCode();
            }

            if (this.hasIsMaxRoundEnd()) {
               hash = 37 * hash + 13;
               hash = 53 * hash + Internal.hashBoolean(this.getIsMaxRoundEnd());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Battle_Result parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Battle_Result)PARSER.parseFrom(data);
      }

      public static S2C_Battle_Result parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_Result)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_Result parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Battle_Result)PARSER.parseFrom(data);
      }

      public static S2C_Battle_Result parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_Result)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_Result parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Battle_Result)PARSER.parseFrom(data);
      }

      public static S2C_Battle_Result parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Battle_Result)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Battle_Result parseFrom(InputStream input) throws IOException {
         return (S2C_Battle_Result)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Battle_Result parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_Result)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Battle_Result parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Battle_Result)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Battle_Result parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_Result)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Battle_Result parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Battle_Result)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Battle_Result parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Battle_Result)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Battle_Result prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Battle_Result getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Battle_Result> parser() {
         return PARSER;
      }

      public Parser<S2C_Battle_Result> getParserForType() {
         return PARSER;
      }

      public S2C_Battle_Result getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Battle_ResultOrBuilder {
         private int bitField0_;
         private int result_;
         private List<Battle_Result_Value> damage_;
         private RepeatedFieldBuilderV3<Battle_Result_Value, Battle_Result_Value.Builder, Battle_Result_ValueOrBuilder> damageBuilder_;
         private List<Battle_Result_Value> recover_;
         private RepeatedFieldBuilderV3<Battle_Result_Value, Battle_Result_Value.Builder, Battle_Result_ValueOrBuilder> recoverBuilder_;
         private List<Battle_Result_Value> hurt_;
         private RepeatedFieldBuilderV3<Battle_Result_Value, Battle_Result_Value.Builder, Battle_Result_ValueOrBuilder> hurtBuilder_;
         private int recordId_;
         private int round_;
         private int playerLv_;
         private int playerExp_;
         private List<CommonMsg.ItemInfo> awardItems_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> awardItemsBuilder_;
         private List<S2C_Team_Info> teamInfos_;
         private RepeatedFieldBuilderV3<S2C_Team_Info, S2C_Team_Info.Builder, S2C_Team_InfoOrBuilder> teamInfosBuilder_;
         private int nextRecordId_;
         private Internal.LongList settleInfo_;
         private boolean isMaxRoundEnd_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Result_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Result_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Battle_Result.class, Builder.class);
         }

         private Builder() {
            this.damage_ = Collections.emptyList();
            this.recover_ = Collections.emptyList();
            this.hurt_ = Collections.emptyList();
            this.awardItems_ = Collections.emptyList();
            this.teamInfos_ = Collections.emptyList();
            this.settleInfo_ = BattleMsg.S2C_Battle_Result.emptyLongList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.damage_ = Collections.emptyList();
            this.recover_ = Collections.emptyList();
            this.hurt_ = Collections.emptyList();
            this.awardItems_ = Collections.emptyList();
            this.teamInfos_ = Collections.emptyList();
            this.settleInfo_ = BattleMsg.S2C_Battle_Result.emptyLongList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.S2C_Battle_Result.alwaysUseFieldBuilders) {
               this.getDamageFieldBuilder();
               this.getRecoverFieldBuilder();
               this.getHurtFieldBuilder();
               this.getAwardItemsFieldBuilder();
               this.getTeamInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            if (this.damageBuilder_ == null) {
               this.damage_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.damageBuilder_.clear();
            }

            if (this.recoverBuilder_ == null) {
               this.recover_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.recoverBuilder_.clear();
            }

            if (this.hurtBuilder_ == null) {
               this.hurt_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.hurtBuilder_.clear();
            }

            this.recordId_ = 0;
            this.bitField0_ &= -17;
            this.round_ = 0;
            this.bitField0_ &= -33;
            this.playerLv_ = 0;
            this.bitField0_ &= -65;
            this.playerExp_ = 0;
            this.bitField0_ &= -129;
            if (this.awardItemsBuilder_ == null) {
               this.awardItems_ = Collections.emptyList();
               this.bitField0_ &= -257;
            } else {
               this.awardItemsBuilder_.clear();
            }

            if (this.teamInfosBuilder_ == null) {
               this.teamInfos_ = Collections.emptyList();
               this.bitField0_ &= -513;
            } else {
               this.teamInfosBuilder_.clear();
            }

            this.nextRecordId_ = 0;
            this.bitField0_ &= -1025;
            this.settleInfo_ = BattleMsg.S2C_Battle_Result.emptyLongList();
            this.bitField0_ &= -2049;
            this.isMaxRoundEnd_ = false;
            this.bitField0_ &= -4097;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_Battle_Result_descriptor;
         }

         public S2C_Battle_Result getDefaultInstanceForType() {
            return BattleMsg.S2C_Battle_Result.getDefaultInstance();
         }

         public S2C_Battle_Result build() {
            S2C_Battle_Result result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Battle_Result buildPartial() {
            S2C_Battle_Result result = new S2C_Battle_Result(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if (this.damageBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.damage_ = Collections.unmodifiableList(this.damage_);
                  this.bitField0_ &= -3;
               }

               result.damage_ = this.damage_;
            } else {
               result.damage_ = this.damageBuilder_.build();
            }

            if (this.recoverBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.recover_ = Collections.unmodifiableList(this.recover_);
                  this.bitField0_ &= -5;
               }

               result.recover_ = this.recover_;
            } else {
               result.recover_ = this.recoverBuilder_.build();
            }

            if (this.hurtBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.hurt_ = Collections.unmodifiableList(this.hurt_);
                  this.bitField0_ &= -9;
               }

               result.hurt_ = this.hurt_;
            } else {
               result.hurt_ = this.hurtBuilder_.build();
            }

            if ((from_bitField0_ & 16) != 0) {
               result.recordId_ = this.recordId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.round_ = this.round_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.playerLv_ = this.playerLv_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.playerExp_ = this.playerExp_;
               to_bitField0_ |= 16;
            }

            if (this.awardItemsBuilder_ == null) {
               if ((this.bitField0_ & 256) != 0) {
                  this.awardItems_ = Collections.unmodifiableList(this.awardItems_);
                  this.bitField0_ &= -257;
               }

               result.awardItems_ = this.awardItems_;
            } else {
               result.awardItems_ = this.awardItemsBuilder_.build();
            }

            if (this.teamInfosBuilder_ == null) {
               if ((this.bitField0_ & 512) != 0) {
                  this.teamInfos_ = Collections.unmodifiableList(this.teamInfos_);
                  this.bitField0_ &= -513;
               }

               result.teamInfos_ = this.teamInfos_;
            } else {
               result.teamInfos_ = this.teamInfosBuilder_.build();
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.nextRecordId_ = this.nextRecordId_;
               to_bitField0_ |= 32;
            }

            if ((this.bitField0_ & 2048) != 0) {
               this.settleInfo_.makeImmutable();
               this.bitField0_ &= -2049;
            }

            result.settleInfo_ = this.settleInfo_;
            if ((from_bitField0_ & 4096) != 0) {
               result.isMaxRoundEnd_ = this.isMaxRoundEnd_;
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
            if (other instanceof S2C_Battle_Result) {
               return this.mergeFrom((S2C_Battle_Result)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Battle_Result other) {
            if (other == BattleMsg.S2C_Battle_Result.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (this.damageBuilder_ == null) {
                  if (!other.damage_.isEmpty()) {
                     if (this.damage_.isEmpty()) {
                        this.damage_ = other.damage_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureDamageIsMutable();
                        this.damage_.addAll(other.damage_);
                     }

                     this.onChanged();
                  }
               } else if (!other.damage_.isEmpty()) {
                  if (this.damageBuilder_.isEmpty()) {
                     this.damageBuilder_.dispose();
                     this.damageBuilder_ = null;
                     this.damage_ = other.damage_;
                     this.bitField0_ &= -3;
                     this.damageBuilder_ = BattleMsg.S2C_Battle_Result.alwaysUseFieldBuilders ? this.getDamageFieldBuilder() : null;
                  } else {
                     this.damageBuilder_.addAllMessages(other.damage_);
                  }
               }

               if (this.recoverBuilder_ == null) {
                  if (!other.recover_.isEmpty()) {
                     if (this.recover_.isEmpty()) {
                        this.recover_ = other.recover_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureRecoverIsMutable();
                        this.recover_.addAll(other.recover_);
                     }

                     this.onChanged();
                  }
               } else if (!other.recover_.isEmpty()) {
                  if (this.recoverBuilder_.isEmpty()) {
                     this.recoverBuilder_.dispose();
                     this.recoverBuilder_ = null;
                     this.recover_ = other.recover_;
                     this.bitField0_ &= -5;
                     this.recoverBuilder_ = BattleMsg.S2C_Battle_Result.alwaysUseFieldBuilders ? this.getRecoverFieldBuilder() : null;
                  } else {
                     this.recoverBuilder_.addAllMessages(other.recover_);
                  }
               }

               if (this.hurtBuilder_ == null) {
                  if (!other.hurt_.isEmpty()) {
                     if (this.hurt_.isEmpty()) {
                        this.hurt_ = other.hurt_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureHurtIsMutable();
                        this.hurt_.addAll(other.hurt_);
                     }

                     this.onChanged();
                  }
               } else if (!other.hurt_.isEmpty()) {
                  if (this.hurtBuilder_.isEmpty()) {
                     this.hurtBuilder_.dispose();
                     this.hurtBuilder_ = null;
                     this.hurt_ = other.hurt_;
                     this.bitField0_ &= -9;
                     this.hurtBuilder_ = BattleMsg.S2C_Battle_Result.alwaysUseFieldBuilders ? this.getHurtFieldBuilder() : null;
                  } else {
                     this.hurtBuilder_.addAllMessages(other.hurt_);
                  }
               }

               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               if (other.hasRound()) {
                  this.setRound(other.getRound());
               }

               if (other.hasPlayerLv()) {
                  this.setPlayerLv(other.getPlayerLv());
               }

               if (other.hasPlayerExp()) {
                  this.setPlayerExp(other.getPlayerExp());
               }

               if (this.awardItemsBuilder_ == null) {
                  if (!other.awardItems_.isEmpty()) {
                     if (this.awardItems_.isEmpty()) {
                        this.awardItems_ = other.awardItems_;
                        this.bitField0_ &= -257;
                     } else {
                        this.ensureAwardItemsIsMutable();
                        this.awardItems_.addAll(other.awardItems_);
                     }

                     this.onChanged();
                  }
               } else if (!other.awardItems_.isEmpty()) {
                  if (this.awardItemsBuilder_.isEmpty()) {
                     this.awardItemsBuilder_.dispose();
                     this.awardItemsBuilder_ = null;
                     this.awardItems_ = other.awardItems_;
                     this.bitField0_ &= -257;
                     this.awardItemsBuilder_ = BattleMsg.S2C_Battle_Result.alwaysUseFieldBuilders ? this.getAwardItemsFieldBuilder() : null;
                  } else {
                     this.awardItemsBuilder_.addAllMessages(other.awardItems_);
                  }
               }

               if (this.teamInfosBuilder_ == null) {
                  if (!other.teamInfos_.isEmpty()) {
                     if (this.teamInfos_.isEmpty()) {
                        this.teamInfos_ = other.teamInfos_;
                        this.bitField0_ &= -513;
                     } else {
                        this.ensureTeamInfosIsMutable();
                        this.teamInfos_.addAll(other.teamInfos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.teamInfos_.isEmpty()) {
                  if (this.teamInfosBuilder_.isEmpty()) {
                     this.teamInfosBuilder_.dispose();
                     this.teamInfosBuilder_ = null;
                     this.teamInfos_ = other.teamInfos_;
                     this.bitField0_ &= -513;
                     this.teamInfosBuilder_ = BattleMsg.S2C_Battle_Result.alwaysUseFieldBuilders ? this.getTeamInfosFieldBuilder() : null;
                  } else {
                     this.teamInfosBuilder_.addAllMessages(other.teamInfos_);
                  }
               }

               if (other.hasNextRecordId()) {
                  this.setNextRecordId(other.getNextRecordId());
               }

               if (!other.settleInfo_.isEmpty()) {
                  if (this.settleInfo_.isEmpty()) {
                     this.settleInfo_ = other.settleInfo_;
                     this.bitField0_ &= -2049;
                  } else {
                     this.ensureSettleInfoIsMutable();
                     this.settleInfo_.addAll(other.settleInfo_);
                  }

                  this.onChanged();
               }

               if (other.hasIsMaxRoundEnd()) {
                  this.setIsMaxRoundEnd(other.getIsMaxRoundEnd());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasRound()) {
               return false;
            } else {
               for(int i = 0; i < this.getDamageCount(); ++i) {
                  if (!this.getDamage(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getRecoverCount(); ++i) {
                  if (!this.getRecover(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getHurtCount(); ++i) {
                  if (!this.getHurt(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getAwardItemsCount(); ++i) {
                  if (!this.getAwardItems(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Battle_Result parsedMessage = null;

            try {
               parsedMessage = (S2C_Battle_Result)BattleMsg.S2C_Battle_Result.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Battle_Result)e.getUnfinishedMessage();
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

         private void ensureDamageIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.damage_ = new ArrayList(this.damage_);
               this.bitField0_ |= 2;
            }

         }

         public List<Battle_Result_Value> getDamageList() {
            return this.damageBuilder_ == null ? Collections.unmodifiableList(this.damage_) : this.damageBuilder_.getMessageList();
         }

         public int getDamageCount() {
            return this.damageBuilder_ == null ? this.damage_.size() : this.damageBuilder_.getCount();
         }

         public Battle_Result_Value getDamage(int index) {
            return this.damageBuilder_ == null ? (Battle_Result_Value)this.damage_.get(index) : (Battle_Result_Value)this.damageBuilder_.getMessage(index);
         }

         public Builder setDamage(int index, Battle_Result_Value value) {
            if (this.damageBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDamageIsMutable();
               this.damage_.set(index, value);
               this.onChanged();
            } else {
               this.damageBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setDamage(int index, Battle_Result_Value.Builder builderForValue) {
            if (this.damageBuilder_ == null) {
               this.ensureDamageIsMutable();
               this.damage_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.damageBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addDamage(Battle_Result_Value value) {
            if (this.damageBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDamageIsMutable();
               this.damage_.add(value);
               this.onChanged();
            } else {
               this.damageBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addDamage(int index, Battle_Result_Value value) {
            if (this.damageBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDamageIsMutable();
               this.damage_.add(index, value);
               this.onChanged();
            } else {
               this.damageBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addDamage(Battle_Result_Value.Builder builderForValue) {
            if (this.damageBuilder_ == null) {
               this.ensureDamageIsMutable();
               this.damage_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.damageBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addDamage(int index, Battle_Result_Value.Builder builderForValue) {
            if (this.damageBuilder_ == null) {
               this.ensureDamageIsMutable();
               this.damage_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.damageBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllDamage(Iterable<? extends Battle_Result_Value> values) {
            if (this.damageBuilder_ == null) {
               this.ensureDamageIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.damage_);
               this.onChanged();
            } else {
               this.damageBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearDamage() {
            if (this.damageBuilder_ == null) {
               this.damage_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.damageBuilder_.clear();
            }

            return this;
         }

         public Builder removeDamage(int index) {
            if (this.damageBuilder_ == null) {
               this.ensureDamageIsMutable();
               this.damage_.remove(index);
               this.onChanged();
            } else {
               this.damageBuilder_.remove(index);
            }

            return this;
         }

         public Battle_Result_Value.Builder getDamageBuilder(int index) {
            return (Battle_Result_Value.Builder)this.getDamageFieldBuilder().getBuilder(index);
         }

         public Battle_Result_ValueOrBuilder getDamageOrBuilder(int index) {
            return this.damageBuilder_ == null ? (Battle_Result_ValueOrBuilder)this.damage_.get(index) : (Battle_Result_ValueOrBuilder)this.damageBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends Battle_Result_ValueOrBuilder> getDamageOrBuilderList() {
            return this.damageBuilder_ != null ? this.damageBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.damage_);
         }

         public Battle_Result_Value.Builder addDamageBuilder() {
            return (Battle_Result_Value.Builder)this.getDamageFieldBuilder().addBuilder(BattleMsg.Battle_Result_Value.getDefaultInstance());
         }

         public Battle_Result_Value.Builder addDamageBuilder(int index) {
            return (Battle_Result_Value.Builder)this.getDamageFieldBuilder().addBuilder(index, BattleMsg.Battle_Result_Value.getDefaultInstance());
         }

         public List<Battle_Result_Value.Builder> getDamageBuilderList() {
            return this.getDamageFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<Battle_Result_Value, Battle_Result_Value.Builder, Battle_Result_ValueOrBuilder> getDamageFieldBuilder() {
            if (this.damageBuilder_ == null) {
               this.damageBuilder_ = new RepeatedFieldBuilderV3(this.damage_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.damage_ = null;
            }

            return this.damageBuilder_;
         }

         private void ensureRecoverIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.recover_ = new ArrayList(this.recover_);
               this.bitField0_ |= 4;
            }

         }

         public List<Battle_Result_Value> getRecoverList() {
            return this.recoverBuilder_ == null ? Collections.unmodifiableList(this.recover_) : this.recoverBuilder_.getMessageList();
         }

         public int getRecoverCount() {
            return this.recoverBuilder_ == null ? this.recover_.size() : this.recoverBuilder_.getCount();
         }

         public Battle_Result_Value getRecover(int index) {
            return this.recoverBuilder_ == null ? (Battle_Result_Value)this.recover_.get(index) : (Battle_Result_Value)this.recoverBuilder_.getMessage(index);
         }

         public Builder setRecover(int index, Battle_Result_Value value) {
            if (this.recoverBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecoverIsMutable();
               this.recover_.set(index, value);
               this.onChanged();
            } else {
               this.recoverBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRecover(int index, Battle_Result_Value.Builder builderForValue) {
            if (this.recoverBuilder_ == null) {
               this.ensureRecoverIsMutable();
               this.recover_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recoverBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRecover(Battle_Result_Value value) {
            if (this.recoverBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecoverIsMutable();
               this.recover_.add(value);
               this.onChanged();
            } else {
               this.recoverBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRecover(int index, Battle_Result_Value value) {
            if (this.recoverBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecoverIsMutable();
               this.recover_.add(index, value);
               this.onChanged();
            } else {
               this.recoverBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRecover(Battle_Result_Value.Builder builderForValue) {
            if (this.recoverBuilder_ == null) {
               this.ensureRecoverIsMutable();
               this.recover_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.recoverBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRecover(int index, Battle_Result_Value.Builder builderForValue) {
            if (this.recoverBuilder_ == null) {
               this.ensureRecoverIsMutable();
               this.recover_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recoverBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecover(Iterable<? extends Battle_Result_Value> values) {
            if (this.recoverBuilder_ == null) {
               this.ensureRecoverIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recover_);
               this.onChanged();
            } else {
               this.recoverBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRecover() {
            if (this.recoverBuilder_ == null) {
               this.recover_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.recoverBuilder_.clear();
            }

            return this;
         }

         public Builder removeRecover(int index) {
            if (this.recoverBuilder_ == null) {
               this.ensureRecoverIsMutable();
               this.recover_.remove(index);
               this.onChanged();
            } else {
               this.recoverBuilder_.remove(index);
            }

            return this;
         }

         public Battle_Result_Value.Builder getRecoverBuilder(int index) {
            return (Battle_Result_Value.Builder)this.getRecoverFieldBuilder().getBuilder(index);
         }

         public Battle_Result_ValueOrBuilder getRecoverOrBuilder(int index) {
            return this.recoverBuilder_ == null ? (Battle_Result_ValueOrBuilder)this.recover_.get(index) : (Battle_Result_ValueOrBuilder)this.recoverBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends Battle_Result_ValueOrBuilder> getRecoverOrBuilderList() {
            return this.recoverBuilder_ != null ? this.recoverBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.recover_);
         }

         public Battle_Result_Value.Builder addRecoverBuilder() {
            return (Battle_Result_Value.Builder)this.getRecoverFieldBuilder().addBuilder(BattleMsg.Battle_Result_Value.getDefaultInstance());
         }

         public Battle_Result_Value.Builder addRecoverBuilder(int index) {
            return (Battle_Result_Value.Builder)this.getRecoverFieldBuilder().addBuilder(index, BattleMsg.Battle_Result_Value.getDefaultInstance());
         }

         public List<Battle_Result_Value.Builder> getRecoverBuilderList() {
            return this.getRecoverFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<Battle_Result_Value, Battle_Result_Value.Builder, Battle_Result_ValueOrBuilder> getRecoverFieldBuilder() {
            if (this.recoverBuilder_ == null) {
               this.recoverBuilder_ = new RepeatedFieldBuilderV3(this.recover_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.recover_ = null;
            }

            return this.recoverBuilder_;
         }

         private void ensureHurtIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.hurt_ = new ArrayList(this.hurt_);
               this.bitField0_ |= 8;
            }

         }

         public List<Battle_Result_Value> getHurtList() {
            return this.hurtBuilder_ == null ? Collections.unmodifiableList(this.hurt_) : this.hurtBuilder_.getMessageList();
         }

         public int getHurtCount() {
            return this.hurtBuilder_ == null ? this.hurt_.size() : this.hurtBuilder_.getCount();
         }

         public Battle_Result_Value getHurt(int index) {
            return this.hurtBuilder_ == null ? (Battle_Result_Value)this.hurt_.get(index) : (Battle_Result_Value)this.hurtBuilder_.getMessage(index);
         }

         public Builder setHurt(int index, Battle_Result_Value value) {
            if (this.hurtBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHurtIsMutable();
               this.hurt_.set(index, value);
               this.onChanged();
            } else {
               this.hurtBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setHurt(int index, Battle_Result_Value.Builder builderForValue) {
            if (this.hurtBuilder_ == null) {
               this.ensureHurtIsMutable();
               this.hurt_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.hurtBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHurt(Battle_Result_Value value) {
            if (this.hurtBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHurtIsMutable();
               this.hurt_.add(value);
               this.onChanged();
            } else {
               this.hurtBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addHurt(int index, Battle_Result_Value value) {
            if (this.hurtBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHurtIsMutable();
               this.hurt_.add(index, value);
               this.onChanged();
            } else {
               this.hurtBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addHurt(Battle_Result_Value.Builder builderForValue) {
            if (this.hurtBuilder_ == null) {
               this.ensureHurtIsMutable();
               this.hurt_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.hurtBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHurt(int index, Battle_Result_Value.Builder builderForValue) {
            if (this.hurtBuilder_ == null) {
               this.ensureHurtIsMutable();
               this.hurt_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.hurtBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHurt(Iterable<? extends Battle_Result_Value> values) {
            if (this.hurtBuilder_ == null) {
               this.ensureHurtIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.hurt_);
               this.onChanged();
            } else {
               this.hurtBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearHurt() {
            if (this.hurtBuilder_ == null) {
               this.hurt_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.hurtBuilder_.clear();
            }

            return this;
         }

         public Builder removeHurt(int index) {
            if (this.hurtBuilder_ == null) {
               this.ensureHurtIsMutable();
               this.hurt_.remove(index);
               this.onChanged();
            } else {
               this.hurtBuilder_.remove(index);
            }

            return this;
         }

         public Battle_Result_Value.Builder getHurtBuilder(int index) {
            return (Battle_Result_Value.Builder)this.getHurtFieldBuilder().getBuilder(index);
         }

         public Battle_Result_ValueOrBuilder getHurtOrBuilder(int index) {
            return this.hurtBuilder_ == null ? (Battle_Result_ValueOrBuilder)this.hurt_.get(index) : (Battle_Result_ValueOrBuilder)this.hurtBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends Battle_Result_ValueOrBuilder> getHurtOrBuilderList() {
            return this.hurtBuilder_ != null ? this.hurtBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.hurt_);
         }

         public Battle_Result_Value.Builder addHurtBuilder() {
            return (Battle_Result_Value.Builder)this.getHurtFieldBuilder().addBuilder(BattleMsg.Battle_Result_Value.getDefaultInstance());
         }

         public Battle_Result_Value.Builder addHurtBuilder(int index) {
            return (Battle_Result_Value.Builder)this.getHurtFieldBuilder().addBuilder(index, BattleMsg.Battle_Result_Value.getDefaultInstance());
         }

         public List<Battle_Result_Value.Builder> getHurtBuilderList() {
            return this.getHurtFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<Battle_Result_Value, Battle_Result_Value.Builder, Battle_Result_ValueOrBuilder> getHurtFieldBuilder() {
            if (this.hurtBuilder_ == null) {
               this.hurtBuilder_ = new RepeatedFieldBuilderV3(this.hurt_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.hurt_ = null;
            }

            return this.hurtBuilder_;
         }

         public boolean hasRecordId() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getRecordId() {
            return this.recordId_;
         }

         public Builder setRecordId(int value) {
            this.bitField0_ |= 16;
            this.recordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecordId() {
            this.bitField0_ &= -17;
            this.recordId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRound() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getRound() {
            return this.round_;
         }

         public Builder setRound(int value) {
            this.bitField0_ |= 32;
            this.round_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRound() {
            this.bitField0_ &= -33;
            this.round_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerLv() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getPlayerLv() {
            return this.playerLv_;
         }

         public Builder setPlayerLv(int value) {
            this.bitField0_ |= 64;
            this.playerLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerLv() {
            this.bitField0_ &= -65;
            this.playerLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerExp() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getPlayerExp() {
            return this.playerExp_;
         }

         public Builder setPlayerExp(int value) {
            this.bitField0_ |= 128;
            this.playerExp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerExp() {
            this.bitField0_ &= -129;
            this.playerExp_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureAwardItemsIsMutable() {
            if ((this.bitField0_ & 256) == 0) {
               this.awardItems_ = new ArrayList(this.awardItems_);
               this.bitField0_ |= 256;
            }

         }

         public List<CommonMsg.ItemInfo> getAwardItemsList() {
            return this.awardItemsBuilder_ == null ? Collections.unmodifiableList(this.awardItems_) : this.awardItemsBuilder_.getMessageList();
         }

         public int getAwardItemsCount() {
            return this.awardItemsBuilder_ == null ? this.awardItems_.size() : this.awardItemsBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getAwardItems(int index) {
            return this.awardItemsBuilder_ == null ? (CommonMsg.ItemInfo)this.awardItems_.get(index) : (CommonMsg.ItemInfo)this.awardItemsBuilder_.getMessage(index);
         }

         public Builder setAwardItems(int index, CommonMsg.ItemInfo value) {
            if (this.awardItemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAwardItemsIsMutable();
               this.awardItems_.set(index, value);
               this.onChanged();
            } else {
               this.awardItemsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAwardItems(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.awardItemsBuilder_ == null) {
               this.ensureAwardItemsIsMutable();
               this.awardItems_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.awardItemsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAwardItems(CommonMsg.ItemInfo value) {
            if (this.awardItemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAwardItemsIsMutable();
               this.awardItems_.add(value);
               this.onChanged();
            } else {
               this.awardItemsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAwardItems(int index, CommonMsg.ItemInfo value) {
            if (this.awardItemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAwardItemsIsMutable();
               this.awardItems_.add(index, value);
               this.onChanged();
            } else {
               this.awardItemsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAwardItems(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.awardItemsBuilder_ == null) {
               this.ensureAwardItemsIsMutable();
               this.awardItems_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.awardItemsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAwardItems(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.awardItemsBuilder_ == null) {
               this.ensureAwardItemsIsMutable();
               this.awardItems_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.awardItemsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAwardItems(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.awardItemsBuilder_ == null) {
               this.ensureAwardItemsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.awardItems_);
               this.onChanged();
            } else {
               this.awardItemsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAwardItems() {
            if (this.awardItemsBuilder_ == null) {
               this.awardItems_ = Collections.emptyList();
               this.bitField0_ &= -257;
               this.onChanged();
            } else {
               this.awardItemsBuilder_.clear();
            }

            return this;
         }

         public Builder removeAwardItems(int index) {
            if (this.awardItemsBuilder_ == null) {
               this.ensureAwardItemsIsMutable();
               this.awardItems_.remove(index);
               this.onChanged();
            } else {
               this.awardItemsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getAwardItemsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getAwardItemsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getAwardItemsOrBuilder(int index) {
            return this.awardItemsBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.awardItems_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.awardItemsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getAwardItemsOrBuilderList() {
            return this.awardItemsBuilder_ != null ? this.awardItemsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.awardItems_);
         }

         public CommonMsg.ItemInfo.Builder addAwardItemsBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getAwardItemsFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addAwardItemsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getAwardItemsFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getAwardItemsBuilderList() {
            return this.getAwardItemsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getAwardItemsFieldBuilder() {
            if (this.awardItemsBuilder_ == null) {
               this.awardItemsBuilder_ = new RepeatedFieldBuilderV3(this.awardItems_, (this.bitField0_ & 256) != 0, this.getParentForChildren(), this.isClean());
               this.awardItems_ = null;
            }

            return this.awardItemsBuilder_;
         }

         private void ensureTeamInfosIsMutable() {
            if ((this.bitField0_ & 512) == 0) {
               this.teamInfos_ = new ArrayList(this.teamInfos_);
               this.bitField0_ |= 512;
            }

         }

         public List<S2C_Team_Info> getTeamInfosList() {
            return this.teamInfosBuilder_ == null ? Collections.unmodifiableList(this.teamInfos_) : this.teamInfosBuilder_.getMessageList();
         }

         public int getTeamInfosCount() {
            return this.teamInfosBuilder_ == null ? this.teamInfos_.size() : this.teamInfosBuilder_.getCount();
         }

         public S2C_Team_Info getTeamInfos(int index) {
            return this.teamInfosBuilder_ == null ? (S2C_Team_Info)this.teamInfos_.get(index) : (S2C_Team_Info)this.teamInfosBuilder_.getMessage(index);
         }

         public Builder setTeamInfos(int index, S2C_Team_Info value) {
            if (this.teamInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTeamInfosIsMutable();
               this.teamInfos_.set(index, value);
               this.onChanged();
            } else {
               this.teamInfosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTeamInfos(int index, S2C_Team_Info.Builder builderForValue) {
            if (this.teamInfosBuilder_ == null) {
               this.ensureTeamInfosIsMutable();
               this.teamInfos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.teamInfosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTeamInfos(S2C_Team_Info value) {
            if (this.teamInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTeamInfosIsMutable();
               this.teamInfos_.add(value);
               this.onChanged();
            } else {
               this.teamInfosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTeamInfos(int index, S2C_Team_Info value) {
            if (this.teamInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTeamInfosIsMutable();
               this.teamInfos_.add(index, value);
               this.onChanged();
            } else {
               this.teamInfosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTeamInfos(S2C_Team_Info.Builder builderForValue) {
            if (this.teamInfosBuilder_ == null) {
               this.ensureTeamInfosIsMutable();
               this.teamInfos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.teamInfosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTeamInfos(int index, S2C_Team_Info.Builder builderForValue) {
            if (this.teamInfosBuilder_ == null) {
               this.ensureTeamInfosIsMutable();
               this.teamInfos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.teamInfosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTeamInfos(Iterable<? extends S2C_Team_Info> values) {
            if (this.teamInfosBuilder_ == null) {
               this.ensureTeamInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.teamInfos_);
               this.onChanged();
            } else {
               this.teamInfosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTeamInfos() {
            if (this.teamInfosBuilder_ == null) {
               this.teamInfos_ = Collections.emptyList();
               this.bitField0_ &= -513;
               this.onChanged();
            } else {
               this.teamInfosBuilder_.clear();
            }

            return this;
         }

         public Builder removeTeamInfos(int index) {
            if (this.teamInfosBuilder_ == null) {
               this.ensureTeamInfosIsMutable();
               this.teamInfos_.remove(index);
               this.onChanged();
            } else {
               this.teamInfosBuilder_.remove(index);
            }

            return this;
         }

         public S2C_Team_Info.Builder getTeamInfosBuilder(int index) {
            return (S2C_Team_Info.Builder)this.getTeamInfosFieldBuilder().getBuilder(index);
         }

         public S2C_Team_InfoOrBuilder getTeamInfosOrBuilder(int index) {
            return this.teamInfosBuilder_ == null ? (S2C_Team_InfoOrBuilder)this.teamInfos_.get(index) : (S2C_Team_InfoOrBuilder)this.teamInfosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends S2C_Team_InfoOrBuilder> getTeamInfosOrBuilderList() {
            return this.teamInfosBuilder_ != null ? this.teamInfosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.teamInfos_);
         }

         public S2C_Team_Info.Builder addTeamInfosBuilder() {
            return (S2C_Team_Info.Builder)this.getTeamInfosFieldBuilder().addBuilder(BattleMsg.S2C_Team_Info.getDefaultInstance());
         }

         public S2C_Team_Info.Builder addTeamInfosBuilder(int index) {
            return (S2C_Team_Info.Builder)this.getTeamInfosFieldBuilder().addBuilder(index, BattleMsg.S2C_Team_Info.getDefaultInstance());
         }

         public List<S2C_Team_Info.Builder> getTeamInfosBuilderList() {
            return this.getTeamInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<S2C_Team_Info, S2C_Team_Info.Builder, S2C_Team_InfoOrBuilder> getTeamInfosFieldBuilder() {
            if (this.teamInfosBuilder_ == null) {
               this.teamInfosBuilder_ = new RepeatedFieldBuilderV3(this.teamInfos_, (this.bitField0_ & 512) != 0, this.getParentForChildren(), this.isClean());
               this.teamInfos_ = null;
            }

            return this.teamInfosBuilder_;
         }

         public boolean hasNextRecordId() {
            return (this.bitField0_ & 1024) != 0;
         }

         public int getNextRecordId() {
            return this.nextRecordId_;
         }

         public Builder setNextRecordId(int value) {
            this.bitField0_ |= 1024;
            this.nextRecordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNextRecordId() {
            this.bitField0_ &= -1025;
            this.nextRecordId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureSettleInfoIsMutable() {
            if ((this.bitField0_ & 2048) == 0) {
               this.settleInfo_ = BattleMsg.S2C_Battle_Result.mutableCopy(this.settleInfo_);
               this.bitField0_ |= 2048;
            }

         }

         public List<Long> getSettleInfoList() {
            return (List<Long>)((this.bitField0_ & 2048) != 0 ? Collections.unmodifiableList(this.settleInfo_) : this.settleInfo_);
         }

         public int getSettleInfoCount() {
            return this.settleInfo_.size();
         }

         public long getSettleInfo(int index) {
            return this.settleInfo_.getLong(index);
         }

         public Builder setSettleInfo(int index, long value) {
            this.ensureSettleInfoIsMutable();
            this.settleInfo_.setLong(index, value);
            this.onChanged();
            return this;
         }

         public Builder addSettleInfo(long value) {
            this.ensureSettleInfoIsMutable();
            this.settleInfo_.addLong(value);
            this.onChanged();
            return this;
         }

         public Builder addAllSettleInfo(Iterable<? extends Long> values) {
            this.ensureSettleInfoIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.settleInfo_);
            this.onChanged();
            return this;
         }

         public Builder clearSettleInfo() {
            this.settleInfo_ = BattleMsg.S2C_Battle_Result.emptyLongList();
            this.bitField0_ &= -2049;
            this.onChanged();
            return this;
         }

         public boolean hasIsMaxRoundEnd() {
            return (this.bitField0_ & 4096) != 0;
         }

         public boolean getIsMaxRoundEnd() {
            return this.isMaxRoundEnd_;
         }

         public Builder setIsMaxRoundEnd(boolean value) {
            this.bitField0_ |= 4096;
            this.isMaxRoundEnd_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsMaxRoundEnd() {
            this.bitField0_ &= -4097;
            this.isMaxRoundEnd_ = false;
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

   public static final class S2C_BattleResult_6102 extends GeneratedMessageV3 implements S2C_BattleResult_6102OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int SETID_FIELD_NUMBER = 2;
      private int setId_;
      public static final int BATTLEID_FIELD_NUMBER = 3;
      private int battleId_;
      public static final int ROUNDMAX_FIELD_NUMBER = 4;
      private int roundMax_;
      public static final int STARTTIME_FIELD_NUMBER = 5;
      private int startTime_;
      public static final int WAVE_FIELD_NUMBER = 6;
      private int wave_;
      public static final int TOTALWAVE_FIELD_NUMBER = 7;
      private int totalWave_;
      public static final int TEAMS_FIELD_NUMBER = 8;
      private List<S2C_Battle_PKTeam> teams_;
      public static final int ROUNDS_FIELD_NUMBER = 9;
      private List<S2C_Battle_Round> rounds_;
      public static final int RESULT_FIELD_NUMBER = 10;
      private S2C_Battle_Result result_;
      public static final int ISRECORD_FIELD_NUMBER = 11;
      private int isRecord_;
      public static final int EXPARAMS_FIELD_NUMBER = 12;
      private Internal.IntList exParams_;
      public static final int FLAG_FIELD_NUMBER = 13;
      private boolean flag_;
      public static final int ISEND_FIELD_NUMBER = 14;
      private boolean isEnd_;
      public static final int COSTTIME_FIELD_NUMBER = 15;
      private int costTime_;
      public static final int ISSKIP_FIELD_NUMBER = 16;
      private boolean isSkip_;
      public static final int BACKGROUND_FIELD_NUMBER = 17;
      private boolean background_;
      public static final int ISNEXTWAVE_FIELD_NUMBER = 18;
      private boolean isNextWave_;
      public static final int ISSERVERSKIP_FIELD_NUMBER = 19;
      private boolean isServerSkip_;
      public static final int ISPASSFLOOR_FIELD_NUMBER = 20;
      private boolean isPassFloor_;
      private byte memoizedIsInitialized;
      private static final S2C_BattleResult_6102 DEFAULT_INSTANCE = new S2C_BattleResult_6102();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BattleResult_6102> PARSER = new AbstractParser<S2C_BattleResult_6102>() {
         public S2C_BattleResult_6102 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BattleResult_6102(input, extensionRegistry);
         }
      };

      private S2C_BattleResult_6102(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BattleResult_6102() {
         this.memoizedIsInitialized = -1;
         this.teams_ = Collections.emptyList();
         this.rounds_ = Collections.emptyList();
         this.exParams_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BattleResult_6102();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BattleResult_6102(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bitField0_ |= 2;
                        this.setId_ = input.readInt32();
                        continue;
                     case 24:
                        this.bitField0_ |= 4;
                        this.battleId_ = input.readInt32();
                        continue;
                     case 32:
                        this.bitField0_ |= 8;
                        this.roundMax_ = input.readInt32();
                        continue;
                     case 40:
                        this.bitField0_ |= 16;
                        this.startTime_ = input.readInt32();
                        continue;
                     case 48:
                        this.bitField0_ |= 32;
                        this.wave_ = input.readInt32();
                        continue;
                     case 56:
                        this.bitField0_ |= 64;
                        this.totalWave_ = input.readInt32();
                        continue;
                     case 66:
                        if ((mutable_bitField0_ & 128) == 0) {
                           this.teams_ = new ArrayList();
                           mutable_bitField0_ |= 128;
                        }

                        this.teams_.add(input.readMessage(BattleMsg.S2C_Battle_PKTeam.PARSER, extensionRegistry));
                        continue;
                     case 74:
                        if ((mutable_bitField0_ & 256) == 0) {
                           this.rounds_ = new ArrayList();
                           mutable_bitField0_ |= 256;
                        }

                        this.rounds_.add(input.readMessage(BattleMsg.S2C_Battle_Round.PARSER, extensionRegistry));
                        continue;
                     case 82:
                        S2C_Battle_Result.Builder subBuilder = null;
                        if ((this.bitField0_ & 128) != 0) {
                           subBuilder = this.result_.toBuilder();
                        }

                        this.result_ = (S2C_Battle_Result)input.readMessage(BattleMsg.S2C_Battle_Result.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.result_);
                           this.result_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 128;
                        continue;
                     case 88:
                        this.bitField0_ |= 256;
                        this.isRecord_ = input.readInt32();
                        continue;
                     case 96:
                        if ((mutable_bitField0_ & 2048) == 0) {
                           this.exParams_ = newIntList();
                           mutable_bitField0_ |= 2048;
                        }

                        this.exParams_.addInt(input.readInt32());
                        continue;
                     case 98:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2048) == 0 && input.getBytesUntilLimit() > 0) {
                           this.exParams_ = newIntList();
                           mutable_bitField0_ |= 2048;
                        }
                        break;
                     case 104:
                        this.bitField0_ |= 512;
                        this.flag_ = input.readBool();
                        continue;
                     case 112:
                        this.bitField0_ |= 1024;
                        this.isEnd_ = input.readBool();
                        continue;
                     case 120:
                        this.bitField0_ |= 2048;
                        this.costTime_ = input.readInt32();
                        continue;
                     case 128:
                        this.bitField0_ |= 4096;
                        this.isSkip_ = input.readBool();
                        continue;
                     case 136:
                        this.bitField0_ |= 8192;
                        this.background_ = input.readBool();
                        continue;
                     case 144:
                        this.bitField0_ |= 16384;
                        this.isNextWave_ = input.readBool();
                        continue;
                     case 152:
                        this.bitField0_ |= 32768;
                        this.isServerSkip_ = input.readBool();
                        continue;
                     case 160:
                        this.bitField0_ |= 65536;
                        this.isPassFloor_ = input.readBool();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.exParams_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 128) != 0) {
                  this.teams_ = Collections.unmodifiableList(this.teams_);
               }

               if ((mutable_bitField0_ & 256) != 0) {
                  this.rounds_ = Collections.unmodifiableList(this.rounds_);
               }

               if ((mutable_bitField0_ & 2048) != 0) {
                  this.exParams_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleResult_6102_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleResult_6102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleResult_6102.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasSetId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSetId() {
         return this.setId_;
      }

      public boolean hasBattleId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getBattleId() {
         return this.battleId_;
      }

      public boolean hasRoundMax() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getRoundMax() {
         return this.roundMax_;
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
      }

      public boolean hasWave() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getWave() {
         return this.wave_;
      }

      public boolean hasTotalWave() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getTotalWave() {
         return this.totalWave_;
      }

      public List<S2C_Battle_PKTeam> getTeamsList() {
         return this.teams_;
      }

      public List<? extends S2C_Battle_PKTeamOrBuilder> getTeamsOrBuilderList() {
         return this.teams_;
      }

      public int getTeamsCount() {
         return this.teams_.size();
      }

      public S2C_Battle_PKTeam getTeams(int index) {
         return (S2C_Battle_PKTeam)this.teams_.get(index);
      }

      public S2C_Battle_PKTeamOrBuilder getTeamsOrBuilder(int index) {
         return (S2C_Battle_PKTeamOrBuilder)this.teams_.get(index);
      }

      public List<S2C_Battle_Round> getRoundsList() {
         return this.rounds_;
      }

      public List<? extends S2C_Battle_RoundOrBuilder> getRoundsOrBuilderList() {
         return this.rounds_;
      }

      public int getRoundsCount() {
         return this.rounds_.size();
      }

      public S2C_Battle_Round getRounds(int index) {
         return (S2C_Battle_Round)this.rounds_.get(index);
      }

      public S2C_Battle_RoundOrBuilder getRoundsOrBuilder(int index) {
         return (S2C_Battle_RoundOrBuilder)this.rounds_.get(index);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 128) != 0;
      }

      public S2C_Battle_Result getResult() {
         return this.result_ == null ? BattleMsg.S2C_Battle_Result.getDefaultInstance() : this.result_;
      }

      public S2C_Battle_ResultOrBuilder getResultOrBuilder() {
         return this.result_ == null ? BattleMsg.S2C_Battle_Result.getDefaultInstance() : this.result_;
      }

      public boolean hasIsRecord() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getIsRecord() {
         return this.isRecord_;
      }

      public List<Integer> getExParamsList() {
         return this.exParams_;
      }

      public int getExParamsCount() {
         return this.exParams_.size();
      }

      public int getExParams(int index) {
         return this.exParams_.getInt(index);
      }

      public boolean hasFlag() {
         return (this.bitField0_ & 512) != 0;
      }

      public boolean getFlag() {
         return this.flag_;
      }

      public boolean hasIsEnd() {
         return (this.bitField0_ & 1024) != 0;
      }

      public boolean getIsEnd() {
         return this.isEnd_;
      }

      public boolean hasCostTime() {
         return (this.bitField0_ & 2048) != 0;
      }

      public int getCostTime() {
         return this.costTime_;
      }

      public boolean hasIsSkip() {
         return (this.bitField0_ & 4096) != 0;
      }

      public boolean getIsSkip() {
         return this.isSkip_;
      }

      public boolean hasBackground() {
         return (this.bitField0_ & 8192) != 0;
      }

      public boolean getBackground() {
         return this.background_;
      }

      public boolean hasIsNextWave() {
         return (this.bitField0_ & 16384) != 0;
      }

      public boolean getIsNextWave() {
         return this.isNextWave_;
      }

      public boolean hasIsServerSkip() {
         return (this.bitField0_ & '耀') != 0;
      }

      public boolean getIsServerSkip() {
         return this.isServerSkip_;
      }

      public boolean hasIsPassFloor() {
         return (this.bitField0_ & 65536) != 0;
      }

      public boolean getIsPassFloor() {
         return this.isPassFloor_;
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
         } else if (!this.hasSetId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBattleId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRoundMax()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStartTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsSkip()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getTeamsCount(); ++i) {
               if (!this.getTeams(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getRoundsCount(); ++i) {
               if (!this.getRounds(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            if (!this.getResult().isInitialized()) {
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
            output.writeInt32(1, this.type_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.setId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.battleId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.roundMax_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.startTime_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.wave_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.totalWave_);
         }

         for(int i = 0; i < this.teams_.size(); ++i) {
            output.writeMessage(8, (MessageLite)this.teams_.get(i));
         }

         for(int i = 0; i < this.rounds_.size(); ++i) {
            output.writeMessage(9, (MessageLite)this.rounds_.get(i));
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeMessage(10, this.getResult());
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(11, this.isRecord_);
         }

         for(int i = 0; i < this.exParams_.size(); ++i) {
            output.writeInt32(12, this.exParams_.getInt(i));
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeBool(13, this.flag_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            output.writeBool(14, this.isEnd_);
         }

         if ((this.bitField0_ & 2048) != 0) {
            output.writeInt32(15, this.costTime_);
         }

         if ((this.bitField0_ & 4096) != 0) {
            output.writeBool(16, this.isSkip_);
         }

         if ((this.bitField0_ & 8192) != 0) {
            output.writeBool(17, this.background_);
         }

         if ((this.bitField0_ & 16384) != 0) {
            output.writeBool(18, this.isNextWave_);
         }

         if ((this.bitField0_ & '耀') != 0) {
            output.writeBool(19, this.isServerSkip_);
         }

         if ((this.bitField0_ & 65536) != 0) {
            output.writeBool(20, this.isPassFloor_);
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
               size += CodedOutputStream.computeInt32Size(2, this.setId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.battleId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.roundMax_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.startTime_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.wave_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.totalWave_);
            }

            for(int i = 0; i < this.teams_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(8, (MessageLite)this.teams_.get(i));
            }

            for(int i = 0; i < this.rounds_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(9, (MessageLite)this.rounds_.get(i));
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeMessageSize(10, this.getResult());
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.isRecord_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.exParams_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.exParams_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getExParamsList().size();
            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeBoolSize(13, this.flag_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += CodedOutputStream.computeBoolSize(14, this.isEnd_);
            }

            if ((this.bitField0_ & 2048) != 0) {
               size += CodedOutputStream.computeInt32Size(15, this.costTime_);
            }

            if ((this.bitField0_ & 4096) != 0) {
               size += CodedOutputStream.computeBoolSize(16, this.isSkip_);
            }

            if ((this.bitField0_ & 8192) != 0) {
               size += CodedOutputStream.computeBoolSize(17, this.background_);
            }

            if ((this.bitField0_ & 16384) != 0) {
               size += CodedOutputStream.computeBoolSize(18, this.isNextWave_);
            }

            if ((this.bitField0_ & '耀') != 0) {
               size += CodedOutputStream.computeBoolSize(19, this.isServerSkip_);
            }

            if ((this.bitField0_ & 65536) != 0) {
               size += CodedOutputStream.computeBoolSize(20, this.isPassFloor_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BattleResult_6102)) {
            return super.equals(obj);
         } else {
            S2C_BattleResult_6102 other = (S2C_BattleResult_6102)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasSetId() != other.hasSetId()) {
               return false;
            } else if (this.hasSetId() && this.getSetId() != other.getSetId()) {
               return false;
            } else if (this.hasBattleId() != other.hasBattleId()) {
               return false;
            } else if (this.hasBattleId() && this.getBattleId() != other.getBattleId()) {
               return false;
            } else if (this.hasRoundMax() != other.hasRoundMax()) {
               return false;
            } else if (this.hasRoundMax() && this.getRoundMax() != other.getRoundMax()) {
               return false;
            } else if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else if (this.hasWave() != other.hasWave()) {
               return false;
            } else if (this.hasWave() && this.getWave() != other.getWave()) {
               return false;
            } else if (this.hasTotalWave() != other.hasTotalWave()) {
               return false;
            } else if (this.hasTotalWave() && this.getTotalWave() != other.getTotalWave()) {
               return false;
            } else if (!this.getTeamsList().equals(other.getTeamsList())) {
               return false;
            } else if (!this.getRoundsList().equals(other.getRoundsList())) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && !this.getResult().equals(other.getResult())) {
               return false;
            } else if (this.hasIsRecord() != other.hasIsRecord()) {
               return false;
            } else if (this.hasIsRecord() && this.getIsRecord() != other.getIsRecord()) {
               return false;
            } else if (!this.getExParamsList().equals(other.getExParamsList())) {
               return false;
            } else if (this.hasFlag() != other.hasFlag()) {
               return false;
            } else if (this.hasFlag() && this.getFlag() != other.getFlag()) {
               return false;
            } else if (this.hasIsEnd() != other.hasIsEnd()) {
               return false;
            } else if (this.hasIsEnd() && this.getIsEnd() != other.getIsEnd()) {
               return false;
            } else if (this.hasCostTime() != other.hasCostTime()) {
               return false;
            } else if (this.hasCostTime() && this.getCostTime() != other.getCostTime()) {
               return false;
            } else if (this.hasIsSkip() != other.hasIsSkip()) {
               return false;
            } else if (this.hasIsSkip() && this.getIsSkip() != other.getIsSkip()) {
               return false;
            } else if (this.hasBackground() != other.hasBackground()) {
               return false;
            } else if (this.hasBackground() && this.getBackground() != other.getBackground()) {
               return false;
            } else if (this.hasIsNextWave() != other.hasIsNextWave()) {
               return false;
            } else if (this.hasIsNextWave() && this.getIsNextWave() != other.getIsNextWave()) {
               return false;
            } else if (this.hasIsServerSkip() != other.hasIsServerSkip()) {
               return false;
            } else if (this.hasIsServerSkip() && this.getIsServerSkip() != other.getIsServerSkip()) {
               return false;
            } else if (this.hasIsPassFloor() != other.hasIsPassFloor()) {
               return false;
            } else if (this.hasIsPassFloor() && this.getIsPassFloor() != other.getIsPassFloor()) {
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

            if (this.hasSetId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSetId();
            }

            if (this.hasBattleId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBattleId();
            }

            if (this.hasRoundMax()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getRoundMax();
            }

            if (this.hasStartTime()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getStartTime();
            }

            if (this.hasWave()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getWave();
            }

            if (this.hasTotalWave()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getTotalWave();
            }

            if (this.getTeamsCount() > 0) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getTeamsList().hashCode();
            }

            if (this.getRoundsCount() > 0) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getRoundsList().hashCode();
            }

            if (this.hasResult()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getResult().hashCode();
            }

            if (this.hasIsRecord()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getIsRecord();
            }

            if (this.getExParamsCount() > 0) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getExParamsList().hashCode();
            }

            if (this.hasFlag()) {
               hash = 37 * hash + 13;
               hash = 53 * hash + Internal.hashBoolean(this.getFlag());
            }

            if (this.hasIsEnd()) {
               hash = 37 * hash + 14;
               hash = 53 * hash + Internal.hashBoolean(this.getIsEnd());
            }

            if (this.hasCostTime()) {
               hash = 37 * hash + 15;
               hash = 53 * hash + this.getCostTime();
            }

            if (this.hasIsSkip()) {
               hash = 37 * hash + 16;
               hash = 53 * hash + Internal.hashBoolean(this.getIsSkip());
            }

            if (this.hasBackground()) {
               hash = 37 * hash + 17;
               hash = 53 * hash + Internal.hashBoolean(this.getBackground());
            }

            if (this.hasIsNextWave()) {
               hash = 37 * hash + 18;
               hash = 53 * hash + Internal.hashBoolean(this.getIsNextWave());
            }

            if (this.hasIsServerSkip()) {
               hash = 37 * hash + 19;
               hash = 53 * hash + Internal.hashBoolean(this.getIsServerSkip());
            }

            if (this.hasIsPassFloor()) {
               hash = 37 * hash + 20;
               hash = 53 * hash + Internal.hashBoolean(this.getIsPassFloor());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BattleResult_6102 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BattleResult_6102)PARSER.parseFrom(data);
      }

      public static S2C_BattleResult_6102 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleResult_6102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleResult_6102 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BattleResult_6102)PARSER.parseFrom(data);
      }

      public static S2C_BattleResult_6102 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleResult_6102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleResult_6102 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BattleResult_6102)PARSER.parseFrom(data);
      }

      public static S2C_BattleResult_6102 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleResult_6102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleResult_6102 parseFrom(InputStream input) throws IOException {
         return (S2C_BattleResult_6102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleResult_6102 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleResult_6102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleResult_6102 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BattleResult_6102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BattleResult_6102 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleResult_6102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleResult_6102 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BattleResult_6102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleResult_6102 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleResult_6102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BattleResult_6102 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BattleResult_6102 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BattleResult_6102> parser() {
         return PARSER;
      }

      public Parser<S2C_BattleResult_6102> getParserForType() {
         return PARSER;
      }

      public S2C_BattleResult_6102 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BattleResult_6102OrBuilder {
         private int bitField0_;
         private int type_;
         private int setId_;
         private int battleId_;
         private int roundMax_;
         private int startTime_;
         private int wave_;
         private int totalWave_;
         private List<S2C_Battle_PKTeam> teams_;
         private RepeatedFieldBuilderV3<S2C_Battle_PKTeam, S2C_Battle_PKTeam.Builder, S2C_Battle_PKTeamOrBuilder> teamsBuilder_;
         private List<S2C_Battle_Round> rounds_;
         private RepeatedFieldBuilderV3<S2C_Battle_Round, S2C_Battle_Round.Builder, S2C_Battle_RoundOrBuilder> roundsBuilder_;
         private S2C_Battle_Result result_;
         private SingleFieldBuilderV3<S2C_Battle_Result, S2C_Battle_Result.Builder, S2C_Battle_ResultOrBuilder> resultBuilder_;
         private int isRecord_;
         private Internal.IntList exParams_;
         private boolean flag_;
         private boolean isEnd_;
         private int costTime_;
         private boolean isSkip_;
         private boolean background_;
         private boolean isNextWave_;
         private boolean isServerSkip_;
         private boolean isPassFloor_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleResult_6102_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleResult_6102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleResult_6102.class, Builder.class);
         }

         private Builder() {
            this.teams_ = Collections.emptyList();
            this.rounds_ = Collections.emptyList();
            this.exParams_ = BattleMsg.S2C_BattleResult_6102.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.teams_ = Collections.emptyList();
            this.rounds_ = Collections.emptyList();
            this.exParams_ = BattleMsg.S2C_BattleResult_6102.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.S2C_BattleResult_6102.alwaysUseFieldBuilders) {
               this.getTeamsFieldBuilder();
               this.getRoundsFieldBuilder();
               this.getResultFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.setId_ = 0;
            this.bitField0_ &= -3;
            this.battleId_ = 0;
            this.bitField0_ &= -5;
            this.roundMax_ = 0;
            this.bitField0_ &= -9;
            this.startTime_ = 0;
            this.bitField0_ &= -17;
            this.wave_ = 0;
            this.bitField0_ &= -33;
            this.totalWave_ = 0;
            this.bitField0_ &= -65;
            if (this.teamsBuilder_ == null) {
               this.teams_ = Collections.emptyList();
               this.bitField0_ &= -129;
            } else {
               this.teamsBuilder_.clear();
            }

            if (this.roundsBuilder_ == null) {
               this.rounds_ = Collections.emptyList();
               this.bitField0_ &= -257;
            } else {
               this.roundsBuilder_.clear();
            }

            if (this.resultBuilder_ == null) {
               this.result_ = null;
            } else {
               this.resultBuilder_.clear();
            }

            this.bitField0_ &= -513;
            this.isRecord_ = 0;
            this.bitField0_ &= -1025;
            this.exParams_ = BattleMsg.S2C_BattleResult_6102.emptyIntList();
            this.bitField0_ &= -2049;
            this.flag_ = false;
            this.bitField0_ &= -4097;
            this.isEnd_ = false;
            this.bitField0_ &= -8193;
            this.costTime_ = 0;
            this.bitField0_ &= -16385;
            this.isSkip_ = false;
            this.bitField0_ &= -32769;
            this.background_ = false;
            this.bitField0_ &= -65537;
            this.isNextWave_ = false;
            this.bitField0_ &= -131073;
            this.isServerSkip_ = false;
            this.bitField0_ &= -262145;
            this.isPassFloor_ = false;
            this.bitField0_ &= -524289;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleResult_6102_descriptor;
         }

         public S2C_BattleResult_6102 getDefaultInstanceForType() {
            return BattleMsg.S2C_BattleResult_6102.getDefaultInstance();
         }

         public S2C_BattleResult_6102 build() {
            S2C_BattleResult_6102 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BattleResult_6102 buildPartial() {
            S2C_BattleResult_6102 result = new S2C_BattleResult_6102(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.setId_ = this.setId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.battleId_ = this.battleId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.roundMax_ = this.roundMax_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.startTime_ = this.startTime_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.wave_ = this.wave_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.totalWave_ = this.totalWave_;
               to_bitField0_ |= 64;
            }

            if (this.teamsBuilder_ == null) {
               if ((this.bitField0_ & 128) != 0) {
                  this.teams_ = Collections.unmodifiableList(this.teams_);
                  this.bitField0_ &= -129;
               }

               result.teams_ = this.teams_;
            } else {
               result.teams_ = this.teamsBuilder_.build();
            }

            if (this.roundsBuilder_ == null) {
               if ((this.bitField0_ & 256) != 0) {
                  this.rounds_ = Collections.unmodifiableList(this.rounds_);
                  this.bitField0_ &= -257;
               }

               result.rounds_ = this.rounds_;
            } else {
               result.rounds_ = this.roundsBuilder_.build();
            }

            if ((from_bitField0_ & 512) != 0) {
               if (this.resultBuilder_ == null) {
                  result.result_ = this.result_;
               } else {
                  result.result_ = (S2C_Battle_Result)this.resultBuilder_.build();
               }

               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.isRecord_ = this.isRecord_;
               to_bitField0_ |= 256;
            }

            if ((this.bitField0_ & 2048) != 0) {
               this.exParams_.makeImmutable();
               this.bitField0_ &= -2049;
            }

            result.exParams_ = this.exParams_;
            if ((from_bitField0_ & 4096) != 0) {
               result.flag_ = this.flag_;
               to_bitField0_ |= 512;
            }

            if ((from_bitField0_ & 8192) != 0) {
               result.isEnd_ = this.isEnd_;
               to_bitField0_ |= 1024;
            }

            if ((from_bitField0_ & 16384) != 0) {
               result.costTime_ = this.costTime_;
               to_bitField0_ |= 2048;
            }

            if ((from_bitField0_ & '耀') != 0) {
               result.isSkip_ = this.isSkip_;
               to_bitField0_ |= 4096;
            }

            if ((from_bitField0_ & 65536) != 0) {
               result.background_ = this.background_;
               to_bitField0_ |= 8192;
            }

            if ((from_bitField0_ & 131072) != 0) {
               result.isNextWave_ = this.isNextWave_;
               to_bitField0_ |= 16384;
            }

            if ((from_bitField0_ & 262144) != 0) {
               result.isServerSkip_ = this.isServerSkip_;
               to_bitField0_ |= 32768;
            }

            if ((from_bitField0_ & 524288) != 0) {
               result.isPassFloor_ = this.isPassFloor_;
               to_bitField0_ |= 65536;
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
            if (other instanceof S2C_BattleResult_6102) {
               return this.mergeFrom((S2C_BattleResult_6102)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BattleResult_6102 other) {
            if (other == BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasSetId()) {
                  this.setSetId(other.getSetId());
               }

               if (other.hasBattleId()) {
                  this.setBattleId(other.getBattleId());
               }

               if (other.hasRoundMax()) {
                  this.setRoundMax(other.getRoundMax());
               }

               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               if (other.hasWave()) {
                  this.setWave(other.getWave());
               }

               if (other.hasTotalWave()) {
                  this.setTotalWave(other.getTotalWave());
               }

               if (this.teamsBuilder_ == null) {
                  if (!other.teams_.isEmpty()) {
                     if (this.teams_.isEmpty()) {
                        this.teams_ = other.teams_;
                        this.bitField0_ &= -129;
                     } else {
                        this.ensureTeamsIsMutable();
                        this.teams_.addAll(other.teams_);
                     }

                     this.onChanged();
                  }
               } else if (!other.teams_.isEmpty()) {
                  if (this.teamsBuilder_.isEmpty()) {
                     this.teamsBuilder_.dispose();
                     this.teamsBuilder_ = null;
                     this.teams_ = other.teams_;
                     this.bitField0_ &= -129;
                     this.teamsBuilder_ = BattleMsg.S2C_BattleResult_6102.alwaysUseFieldBuilders ? this.getTeamsFieldBuilder() : null;
                  } else {
                     this.teamsBuilder_.addAllMessages(other.teams_);
                  }
               }

               if (this.roundsBuilder_ == null) {
                  if (!other.rounds_.isEmpty()) {
                     if (this.rounds_.isEmpty()) {
                        this.rounds_ = other.rounds_;
                        this.bitField0_ &= -257;
                     } else {
                        this.ensureRoundsIsMutable();
                        this.rounds_.addAll(other.rounds_);
                     }

                     this.onChanged();
                  }
               } else if (!other.rounds_.isEmpty()) {
                  if (this.roundsBuilder_.isEmpty()) {
                     this.roundsBuilder_.dispose();
                     this.roundsBuilder_ = null;
                     this.rounds_ = other.rounds_;
                     this.bitField0_ &= -257;
                     this.roundsBuilder_ = BattleMsg.S2C_BattleResult_6102.alwaysUseFieldBuilders ? this.getRoundsFieldBuilder() : null;
                  } else {
                     this.roundsBuilder_.addAllMessages(other.rounds_);
                  }
               }

               if (other.hasResult()) {
                  this.mergeResult(other.getResult());
               }

               if (other.hasIsRecord()) {
                  this.setIsRecord(other.getIsRecord());
               }

               if (!other.exParams_.isEmpty()) {
                  if (this.exParams_.isEmpty()) {
                     this.exParams_ = other.exParams_;
                     this.bitField0_ &= -2049;
                  } else {
                     this.ensureExParamsIsMutable();
                     this.exParams_.addAll(other.exParams_);
                  }

                  this.onChanged();
               }

               if (other.hasFlag()) {
                  this.setFlag(other.getFlag());
               }

               if (other.hasIsEnd()) {
                  this.setIsEnd(other.getIsEnd());
               }

               if (other.hasCostTime()) {
                  this.setCostTime(other.getCostTime());
               }

               if (other.hasIsSkip()) {
                  this.setIsSkip(other.getIsSkip());
               }

               if (other.hasBackground()) {
                  this.setBackground(other.getBackground());
               }

               if (other.hasIsNextWave()) {
                  this.setIsNextWave(other.getIsNextWave());
               }

               if (other.hasIsServerSkip()) {
                  this.setIsServerSkip(other.getIsServerSkip());
               }

               if (other.hasIsPassFloor()) {
                  this.setIsPassFloor(other.getIsPassFloor());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else if (!this.hasSetId()) {
               return false;
            } else if (!this.hasBattleId()) {
               return false;
            } else if (!this.hasRoundMax()) {
               return false;
            } else if (!this.hasStartTime()) {
               return false;
            } else if (!this.hasResult()) {
               return false;
            } else if (!this.hasIsSkip()) {
               return false;
            } else {
               for(int i = 0; i < this.getTeamsCount(); ++i) {
                  if (!this.getTeams(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getRoundsCount(); ++i) {
                  if (!this.getRounds(i).isInitialized()) {
                     return false;
                  }
               }

               if (!this.getResult().isInitialized()) {
                  return false;
               } else {
                  return true;
               }
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BattleResult_6102 parsedMessage = null;

            try {
               parsedMessage = (S2C_BattleResult_6102)BattleMsg.S2C_BattleResult_6102.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BattleResult_6102)e.getUnfinishedMessage();
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

         public boolean hasSetId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSetId() {
            return this.setId_;
         }

         public Builder setSetId(int value) {
            this.bitField0_ |= 2;
            this.setId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSetId() {
            this.bitField0_ &= -3;
            this.setId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBattleId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBattleId() {
            return this.battleId_;
         }

         public Builder setBattleId(int value) {
            this.bitField0_ |= 4;
            this.battleId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBattleId() {
            this.bitField0_ &= -5;
            this.battleId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRoundMax() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getRoundMax() {
            return this.roundMax_;
         }

         public Builder setRoundMax(int value) {
            this.bitField0_ |= 8;
            this.roundMax_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRoundMax() {
            this.bitField0_ &= -9;
            this.roundMax_ = 0;
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

         public boolean hasWave() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getWave() {
            return this.wave_;
         }

         public Builder setWave(int value) {
            this.bitField0_ |= 32;
            this.wave_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWave() {
            this.bitField0_ &= -33;
            this.wave_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTotalWave() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getTotalWave() {
            return this.totalWave_;
         }

         public Builder setTotalWave(int value) {
            this.bitField0_ |= 64;
            this.totalWave_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalWave() {
            this.bitField0_ &= -65;
            this.totalWave_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureTeamsIsMutable() {
            if ((this.bitField0_ & 128) == 0) {
               this.teams_ = new ArrayList(this.teams_);
               this.bitField0_ |= 128;
            }

         }

         public List<S2C_Battle_PKTeam> getTeamsList() {
            return this.teamsBuilder_ == null ? Collections.unmodifiableList(this.teams_) : this.teamsBuilder_.getMessageList();
         }

         public int getTeamsCount() {
            return this.teamsBuilder_ == null ? this.teams_.size() : this.teamsBuilder_.getCount();
         }

         public S2C_Battle_PKTeam getTeams(int index) {
            return this.teamsBuilder_ == null ? (S2C_Battle_PKTeam)this.teams_.get(index) : (S2C_Battle_PKTeam)this.teamsBuilder_.getMessage(index);
         }

         public Builder setTeams(int index, S2C_Battle_PKTeam value) {
            if (this.teamsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTeamsIsMutable();
               this.teams_.set(index, value);
               this.onChanged();
            } else {
               this.teamsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTeams(int index, S2C_Battle_PKTeam.Builder builderForValue) {
            if (this.teamsBuilder_ == null) {
               this.ensureTeamsIsMutable();
               this.teams_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.teamsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTeams(S2C_Battle_PKTeam value) {
            if (this.teamsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTeamsIsMutable();
               this.teams_.add(value);
               this.onChanged();
            } else {
               this.teamsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTeams(int index, S2C_Battle_PKTeam value) {
            if (this.teamsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTeamsIsMutable();
               this.teams_.add(index, value);
               this.onChanged();
            } else {
               this.teamsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTeams(S2C_Battle_PKTeam.Builder builderForValue) {
            if (this.teamsBuilder_ == null) {
               this.ensureTeamsIsMutable();
               this.teams_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.teamsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTeams(int index, S2C_Battle_PKTeam.Builder builderForValue) {
            if (this.teamsBuilder_ == null) {
               this.ensureTeamsIsMutable();
               this.teams_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.teamsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTeams(Iterable<? extends S2C_Battle_PKTeam> values) {
            if (this.teamsBuilder_ == null) {
               this.ensureTeamsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.teams_);
               this.onChanged();
            } else {
               this.teamsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTeams() {
            if (this.teamsBuilder_ == null) {
               this.teams_ = Collections.emptyList();
               this.bitField0_ &= -129;
               this.onChanged();
            } else {
               this.teamsBuilder_.clear();
            }

            return this;
         }

         public Builder removeTeams(int index) {
            if (this.teamsBuilder_ == null) {
               this.ensureTeamsIsMutable();
               this.teams_.remove(index);
               this.onChanged();
            } else {
               this.teamsBuilder_.remove(index);
            }

            return this;
         }

         public S2C_Battle_PKTeam.Builder getTeamsBuilder(int index) {
            return (S2C_Battle_PKTeam.Builder)this.getTeamsFieldBuilder().getBuilder(index);
         }

         public S2C_Battle_PKTeamOrBuilder getTeamsOrBuilder(int index) {
            return this.teamsBuilder_ == null ? (S2C_Battle_PKTeamOrBuilder)this.teams_.get(index) : (S2C_Battle_PKTeamOrBuilder)this.teamsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends S2C_Battle_PKTeamOrBuilder> getTeamsOrBuilderList() {
            return this.teamsBuilder_ != null ? this.teamsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.teams_);
         }

         public S2C_Battle_PKTeam.Builder addTeamsBuilder() {
            return (S2C_Battle_PKTeam.Builder)this.getTeamsFieldBuilder().addBuilder(BattleMsg.S2C_Battle_PKTeam.getDefaultInstance());
         }

         public S2C_Battle_PKTeam.Builder addTeamsBuilder(int index) {
            return (S2C_Battle_PKTeam.Builder)this.getTeamsFieldBuilder().addBuilder(index, BattleMsg.S2C_Battle_PKTeam.getDefaultInstance());
         }

         public List<S2C_Battle_PKTeam.Builder> getTeamsBuilderList() {
            return this.getTeamsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<S2C_Battle_PKTeam, S2C_Battle_PKTeam.Builder, S2C_Battle_PKTeamOrBuilder> getTeamsFieldBuilder() {
            if (this.teamsBuilder_ == null) {
               this.teamsBuilder_ = new RepeatedFieldBuilderV3(this.teams_, (this.bitField0_ & 128) != 0, this.getParentForChildren(), this.isClean());
               this.teams_ = null;
            }

            return this.teamsBuilder_;
         }

         private void ensureRoundsIsMutable() {
            if ((this.bitField0_ & 256) == 0) {
               this.rounds_ = new ArrayList(this.rounds_);
               this.bitField0_ |= 256;
            }

         }

         public List<S2C_Battle_Round> getRoundsList() {
            return this.roundsBuilder_ == null ? Collections.unmodifiableList(this.rounds_) : this.roundsBuilder_.getMessageList();
         }

         public int getRoundsCount() {
            return this.roundsBuilder_ == null ? this.rounds_.size() : this.roundsBuilder_.getCount();
         }

         public S2C_Battle_Round getRounds(int index) {
            return this.roundsBuilder_ == null ? (S2C_Battle_Round)this.rounds_.get(index) : (S2C_Battle_Round)this.roundsBuilder_.getMessage(index);
         }

         public Builder setRounds(int index, S2C_Battle_Round value) {
            if (this.roundsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRoundsIsMutable();
               this.rounds_.set(index, value);
               this.onChanged();
            } else {
               this.roundsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRounds(int index, S2C_Battle_Round.Builder builderForValue) {
            if (this.roundsBuilder_ == null) {
               this.ensureRoundsIsMutable();
               this.rounds_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.roundsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRounds(S2C_Battle_Round value) {
            if (this.roundsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRoundsIsMutable();
               this.rounds_.add(value);
               this.onChanged();
            } else {
               this.roundsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRounds(int index, S2C_Battle_Round value) {
            if (this.roundsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRoundsIsMutable();
               this.rounds_.add(index, value);
               this.onChanged();
            } else {
               this.roundsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRounds(S2C_Battle_Round.Builder builderForValue) {
            if (this.roundsBuilder_ == null) {
               this.ensureRoundsIsMutable();
               this.rounds_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.roundsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRounds(int index, S2C_Battle_Round.Builder builderForValue) {
            if (this.roundsBuilder_ == null) {
               this.ensureRoundsIsMutable();
               this.rounds_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.roundsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRounds(Iterable<? extends S2C_Battle_Round> values) {
            if (this.roundsBuilder_ == null) {
               this.ensureRoundsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rounds_);
               this.onChanged();
            } else {
               this.roundsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRounds() {
            if (this.roundsBuilder_ == null) {
               this.rounds_ = Collections.emptyList();
               this.bitField0_ &= -257;
               this.onChanged();
            } else {
               this.roundsBuilder_.clear();
            }

            return this;
         }

         public Builder removeRounds(int index) {
            if (this.roundsBuilder_ == null) {
               this.ensureRoundsIsMutable();
               this.rounds_.remove(index);
               this.onChanged();
            } else {
               this.roundsBuilder_.remove(index);
            }

            return this;
         }

         public S2C_Battle_Round.Builder getRoundsBuilder(int index) {
            return (S2C_Battle_Round.Builder)this.getRoundsFieldBuilder().getBuilder(index);
         }

         public S2C_Battle_RoundOrBuilder getRoundsOrBuilder(int index) {
            return this.roundsBuilder_ == null ? (S2C_Battle_RoundOrBuilder)this.rounds_.get(index) : (S2C_Battle_RoundOrBuilder)this.roundsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends S2C_Battle_RoundOrBuilder> getRoundsOrBuilderList() {
            return this.roundsBuilder_ != null ? this.roundsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rounds_);
         }

         public S2C_Battle_Round.Builder addRoundsBuilder() {
            return (S2C_Battle_Round.Builder)this.getRoundsFieldBuilder().addBuilder(BattleMsg.S2C_Battle_Round.getDefaultInstance());
         }

         public S2C_Battle_Round.Builder addRoundsBuilder(int index) {
            return (S2C_Battle_Round.Builder)this.getRoundsFieldBuilder().addBuilder(index, BattleMsg.S2C_Battle_Round.getDefaultInstance());
         }

         public List<S2C_Battle_Round.Builder> getRoundsBuilderList() {
            return this.getRoundsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<S2C_Battle_Round, S2C_Battle_Round.Builder, S2C_Battle_RoundOrBuilder> getRoundsFieldBuilder() {
            if (this.roundsBuilder_ == null) {
               this.roundsBuilder_ = new RepeatedFieldBuilderV3(this.rounds_, (this.bitField0_ & 256) != 0, this.getParentForChildren(), this.isClean());
               this.rounds_ = null;
            }

            return this.roundsBuilder_;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 512) != 0;
         }

         public S2C_Battle_Result getResult() {
            if (this.resultBuilder_ == null) {
               return this.result_ == null ? BattleMsg.S2C_Battle_Result.getDefaultInstance() : this.result_;
            } else {
               return (S2C_Battle_Result)this.resultBuilder_.getMessage();
            }
         }

         public Builder setResult(S2C_Battle_Result value) {
            if (this.resultBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.result_ = value;
               this.onChanged();
            } else {
               this.resultBuilder_.setMessage(value);
            }

            this.bitField0_ |= 512;
            return this;
         }

         public Builder setResult(S2C_Battle_Result.Builder builderForValue) {
            if (this.resultBuilder_ == null) {
               this.result_ = builderForValue.build();
               this.onChanged();
            } else {
               this.resultBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 512;
            return this;
         }

         public Builder mergeResult(S2C_Battle_Result value) {
            if (this.resultBuilder_ == null) {
               if ((this.bitField0_ & 512) != 0 && this.result_ != null && this.result_ != BattleMsg.S2C_Battle_Result.getDefaultInstance()) {
                  this.result_ = BattleMsg.S2C_Battle_Result.newBuilder(this.result_).mergeFrom(value).buildPartial();
               } else {
                  this.result_ = value;
               }

               this.onChanged();
            } else {
               this.resultBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 512;
            return this;
         }

         public Builder clearResult() {
            if (this.resultBuilder_ == null) {
               this.result_ = null;
               this.onChanged();
            } else {
               this.resultBuilder_.clear();
            }

            this.bitField0_ &= -513;
            return this;
         }

         public S2C_Battle_Result.Builder getResultBuilder() {
            this.bitField0_ |= 512;
            this.onChanged();
            return (S2C_Battle_Result.Builder)this.getResultFieldBuilder().getBuilder();
         }

         public S2C_Battle_ResultOrBuilder getResultOrBuilder() {
            if (this.resultBuilder_ != null) {
               return (S2C_Battle_ResultOrBuilder)this.resultBuilder_.getMessageOrBuilder();
            } else {
               return this.result_ == null ? BattleMsg.S2C_Battle_Result.getDefaultInstance() : this.result_;
            }
         }

         private SingleFieldBuilderV3<S2C_Battle_Result, S2C_Battle_Result.Builder, S2C_Battle_ResultOrBuilder> getResultFieldBuilder() {
            if (this.resultBuilder_ == null) {
               this.resultBuilder_ = new SingleFieldBuilderV3(this.getResult(), this.getParentForChildren(), this.isClean());
               this.result_ = null;
            }

            return this.resultBuilder_;
         }

         public boolean hasIsRecord() {
            return (this.bitField0_ & 1024) != 0;
         }

         public int getIsRecord() {
            return this.isRecord_;
         }

         public Builder setIsRecord(int value) {
            this.bitField0_ |= 1024;
            this.isRecord_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsRecord() {
            this.bitField0_ &= -1025;
            this.isRecord_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureExParamsIsMutable() {
            if ((this.bitField0_ & 2048) == 0) {
               this.exParams_ = BattleMsg.S2C_BattleResult_6102.mutableCopy(this.exParams_);
               this.bitField0_ |= 2048;
            }

         }

         public List<Integer> getExParamsList() {
            return (List<Integer>)((this.bitField0_ & 2048) != 0 ? Collections.unmodifiableList(this.exParams_) : this.exParams_);
         }

         public int getExParamsCount() {
            return this.exParams_.size();
         }

         public int getExParams(int index) {
            return this.exParams_.getInt(index);
         }

         public Builder setExParams(int index, int value) {
            this.ensureExParamsIsMutable();
            this.exParams_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addExParams(int value) {
            this.ensureExParamsIsMutable();
            this.exParams_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllExParams(Iterable<? extends Integer> values) {
            this.ensureExParamsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.exParams_);
            this.onChanged();
            return this;
         }

         public Builder clearExParams() {
            this.exParams_ = BattleMsg.S2C_BattleResult_6102.emptyIntList();
            this.bitField0_ &= -2049;
            this.onChanged();
            return this;
         }

         public boolean hasFlag() {
            return (this.bitField0_ & 4096) != 0;
         }

         public boolean getFlag() {
            return this.flag_;
         }

         public Builder setFlag(boolean value) {
            this.bitField0_ |= 4096;
            this.flag_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFlag() {
            this.bitField0_ &= -4097;
            this.flag_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasIsEnd() {
            return (this.bitField0_ & 8192) != 0;
         }

         public boolean getIsEnd() {
            return this.isEnd_;
         }

         public Builder setIsEnd(boolean value) {
            this.bitField0_ |= 8192;
            this.isEnd_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsEnd() {
            this.bitField0_ &= -8193;
            this.isEnd_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasCostTime() {
            return (this.bitField0_ & 16384) != 0;
         }

         public int getCostTime() {
            return this.costTime_;
         }

         public Builder setCostTime(int value) {
            this.bitField0_ |= 16384;
            this.costTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCostTime() {
            this.bitField0_ &= -16385;
            this.costTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsSkip() {
            return (this.bitField0_ & '耀') != 0;
         }

         public boolean getIsSkip() {
            return this.isSkip_;
         }

         public Builder setIsSkip(boolean value) {
            this.bitField0_ |= 32768;
            this.isSkip_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsSkip() {
            this.bitField0_ &= -32769;
            this.isSkip_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasBackground() {
            return (this.bitField0_ & 65536) != 0;
         }

         public boolean getBackground() {
            return this.background_;
         }

         public Builder setBackground(boolean value) {
            this.bitField0_ |= 65536;
            this.background_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBackground() {
            this.bitField0_ &= -65537;
            this.background_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasIsNextWave() {
            return (this.bitField0_ & 131072) != 0;
         }

         public boolean getIsNextWave() {
            return this.isNextWave_;
         }

         public Builder setIsNextWave(boolean value) {
            this.bitField0_ |= 131072;
            this.isNextWave_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsNextWave() {
            this.bitField0_ &= -131073;
            this.isNextWave_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasIsServerSkip() {
            return (this.bitField0_ & 262144) != 0;
         }

         public boolean getIsServerSkip() {
            return this.isServerSkip_;
         }

         public Builder setIsServerSkip(boolean value) {
            this.bitField0_ |= 262144;
            this.isServerSkip_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsServerSkip() {
            this.bitField0_ &= -262145;
            this.isServerSkip_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasIsPassFloor() {
            return (this.bitField0_ & 524288) != 0;
         }

         public boolean getIsPassFloor() {
            return this.isPassFloor_;
         }

         public Builder setIsPassFloor(boolean value) {
            this.bitField0_ |= 524288;
            this.isPassFloor_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsPassFloor() {
            this.bitField0_ &= -524289;
            this.isPassFloor_ = false;
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

   public static final class C2S_BattleRecordFight_6105 extends GeneratedMessageV3 implements C2S_BattleRecordFight_6105OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECORDID_FIELD_NUMBER = 1;
      private int recordId_;
      public static final int SYSTEMID_FIELD_NUMBER = 2;
      private int systemid_;
      public static final int SERVERID_FIELD_NUMBER = 3;
      private int serverId_;
      public static final int SHARETYPE_FIELD_NUMBER = 4;
      private int shareType_;
      public static final int STARTTIME_FIELD_NUMBER = 5;
      private int startTime_;
      public static final int ISCROSS_FIELD_NUMBER = 6;
      private boolean isCross_;
      private byte memoizedIsInitialized;
      private static final C2S_BattleRecordFight_6105 DEFAULT_INSTANCE = new C2S_BattleRecordFight_6105();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BattleRecordFight_6105> PARSER = new AbstractParser<C2S_BattleRecordFight_6105>() {
         public C2S_BattleRecordFight_6105 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BattleRecordFight_6105(input, extensionRegistry);
         }
      };

      private C2S_BattleRecordFight_6105(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BattleRecordFight_6105() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BattleRecordFight_6105();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BattleRecordFight_6105(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.systemid_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.serverId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.shareType_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.startTime_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.isCross_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordFight_6105_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordFight_6105_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleRecordFight_6105.class, Builder.class);
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRecordId() {
         return this.recordId_;
      }

      public boolean hasSystemid() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSystemid() {
         return this.systemid_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasShareType() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getShareType() {
         return this.shareType_;
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
      }

      public boolean hasIsCross() {
         return (this.bitField0_ & 32) != 0;
      }

      public boolean getIsCross() {
         return this.isCross_;
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
         } else if (!this.hasSystemid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasShareType()) {
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
            output.writeInt32(1, this.recordId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.systemid_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.serverId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.shareType_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.startTime_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeBool(6, this.isCross_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.systemid_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.serverId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.shareType_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.startTime_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeBoolSize(6, this.isCross_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_BattleRecordFight_6105)) {
            return super.equals(obj);
         } else {
            C2S_BattleRecordFight_6105 other = (C2S_BattleRecordFight_6105)obj;
            if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
               return false;
            } else if (this.hasSystemid() != other.hasSystemid()) {
               return false;
            } else if (this.hasSystemid() && this.getSystemid() != other.getSystemid()) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasShareType() != other.hasShareType()) {
               return false;
            } else if (this.hasShareType() && this.getShareType() != other.getShareType()) {
               return false;
            } else if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else if (this.hasIsCross() != other.hasIsCross()) {
               return false;
            } else if (this.hasIsCross() && this.getIsCross() != other.getIsCross()) {
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

            if (this.hasSystemid()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSystemid();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasShareType()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getShareType();
            }

            if (this.hasStartTime()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getStartTime();
            }

            if (this.hasIsCross()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashBoolean(this.getIsCross());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_BattleRecordFight_6105 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BattleRecordFight_6105)PARSER.parseFrom(data);
      }

      public static C2S_BattleRecordFight_6105 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleRecordFight_6105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleRecordFight_6105 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BattleRecordFight_6105)PARSER.parseFrom(data);
      }

      public static C2S_BattleRecordFight_6105 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleRecordFight_6105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleRecordFight_6105 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BattleRecordFight_6105)PARSER.parseFrom(data);
      }

      public static C2S_BattleRecordFight_6105 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleRecordFight_6105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleRecordFight_6105 parseFrom(InputStream input) throws IOException {
         return (C2S_BattleRecordFight_6105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleRecordFight_6105 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleRecordFight_6105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleRecordFight_6105 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BattleRecordFight_6105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BattleRecordFight_6105 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleRecordFight_6105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleRecordFight_6105 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BattleRecordFight_6105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleRecordFight_6105 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleRecordFight_6105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BattleRecordFight_6105 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BattleRecordFight_6105 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BattleRecordFight_6105> parser() {
         return PARSER;
      }

      public Parser<C2S_BattleRecordFight_6105> getParserForType() {
         return PARSER;
      }

      public C2S_BattleRecordFight_6105 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BattleRecordFight_6105OrBuilder {
         private int bitField0_;
         private int recordId_;
         private int systemid_;
         private int serverId_;
         private int shareType_;
         private int startTime_;
         private boolean isCross_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordFight_6105_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordFight_6105_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleRecordFight_6105.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.C2S_BattleRecordFight_6105.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.recordId_ = 0;
            this.bitField0_ &= -2;
            this.systemid_ = 0;
            this.bitField0_ &= -3;
            this.serverId_ = 0;
            this.bitField0_ &= -5;
            this.shareType_ = 0;
            this.bitField0_ &= -9;
            this.startTime_ = 0;
            this.bitField0_ &= -17;
            this.isCross_ = false;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordFight_6105_descriptor;
         }

         public C2S_BattleRecordFight_6105 getDefaultInstanceForType() {
            return BattleMsg.C2S_BattleRecordFight_6105.getDefaultInstance();
         }

         public C2S_BattleRecordFight_6105 build() {
            C2S_BattleRecordFight_6105 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BattleRecordFight_6105 buildPartial() {
            C2S_BattleRecordFight_6105 result = new C2S_BattleRecordFight_6105(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.recordId_ = this.recordId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.systemid_ = this.systemid_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.shareType_ = this.shareType_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.startTime_ = this.startTime_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.isCross_ = this.isCross_;
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
            if (other instanceof C2S_BattleRecordFight_6105) {
               return this.mergeFrom((C2S_BattleRecordFight_6105)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BattleRecordFight_6105 other) {
            if (other == BattleMsg.C2S_BattleRecordFight_6105.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               if (other.hasSystemid()) {
                  this.setSystemid(other.getSystemid());
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasShareType()) {
                  this.setShareType(other.getShareType());
               }

               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               if (other.hasIsCross()) {
                  this.setIsCross(other.getIsCross());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRecordId()) {
               return false;
            } else if (!this.hasSystemid()) {
               return false;
            } else if (!this.hasServerId()) {
               return false;
            } else if (!this.hasShareType()) {
               return false;
            } else {
               return this.hasStartTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_BattleRecordFight_6105 parsedMessage = null;

            try {
               parsedMessage = (C2S_BattleRecordFight_6105)BattleMsg.C2S_BattleRecordFight_6105.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BattleRecordFight_6105)e.getUnfinishedMessage();
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

         public boolean hasSystemid() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSystemid() {
            return this.systemid_;
         }

         public Builder setSystemid(int value) {
            this.bitField0_ |= 2;
            this.systemid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSystemid() {
            this.bitField0_ &= -3;
            this.systemid_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 4;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -5;
            this.serverId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasShareType() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getShareType() {
            return this.shareType_;
         }

         public Builder setShareType(int value) {
            this.bitField0_ |= 8;
            this.shareType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShareType() {
            this.bitField0_ &= -9;
            this.shareType_ = 0;
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

         public boolean hasIsCross() {
            return (this.bitField0_ & 32) != 0;
         }

         public boolean getIsCross() {
            return this.isCross_;
         }

         public Builder setIsCross(boolean value) {
            this.bitField0_ |= 32;
            this.isCross_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsCross() {
            this.bitField0_ &= -33;
            this.isCross_ = false;
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

   public static final class C2S_BattleBegin_6107 extends GeneratedMessageV3 implements C2S_BattleBegin_6107OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int MODELID_FIELD_NUMBER = 2;
      private int modelId_;
      public static final int ISSKIP_FIELD_NUMBER = 3;
      private boolean isSkip_;
      public static final int BUFFID_FIELD_NUMBER = 4;
      private int buffId_;
      public static final int PARAMS_FIELD_NUMBER = 5;
      private Internal.IntList params_;
      public static final int BACKGROUND_FIELD_NUMBER = 6;
      private boolean background_;
      public static final int GUIDESTEP_FIELD_NUMBER = 7;
      private int guideStep_;
      private byte memoizedIsInitialized;
      private static final C2S_BattleBegin_6107 DEFAULT_INSTANCE = new C2S_BattleBegin_6107();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BattleBegin_6107> PARSER = new AbstractParser<C2S_BattleBegin_6107>() {
         public C2S_BattleBegin_6107 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BattleBegin_6107(input, extensionRegistry);
         }
      };

      private C2S_BattleBegin_6107(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BattleBegin_6107() {
         this.memoizedIsInitialized = -1;
         this.params_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BattleBegin_6107();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BattleBegin_6107(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bitField0_ |= 2;
                        this.modelId_ = input.readInt32();
                        continue;
                     case 24:
                        this.bitField0_ |= 4;
                        this.isSkip_ = input.readBool();
                        continue;
                     case 32:
                        this.bitField0_ |= 8;
                        this.buffId_ = input.readInt32();
                        continue;
                     case 40:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.params_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        this.params_.addInt(input.readInt32());
                        continue;
                     case 42:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 16) == 0 && input.getBytesUntilLimit() > 0) {
                           this.params_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }
                        break;
                     case 48:
                        this.bitField0_ |= 16;
                        this.background_ = input.readBool();
                        continue;
                     case 56:
                        this.bitField0_ |= 32;
                        this.guideStep_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.params_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 16) != 0) {
                  this.params_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleBegin_6107_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleBegin_6107_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleBegin_6107.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasModelId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getModelId() {
         return this.modelId_;
      }

      public boolean hasIsSkip() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsSkip() {
         return this.isSkip_;
      }

      public boolean hasBuffId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getBuffId() {
         return this.buffId_;
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

      public boolean hasBackground() {
         return (this.bitField0_ & 16) != 0;
      }

      public boolean getBackground() {
         return this.background_;
      }

      public boolean hasGuideStep() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getGuideStep() {
         return this.guideStep_;
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
         } else if (!this.hasModelId()) {
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
            output.writeInt32(2, this.modelId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.isSkip_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.buffId_);
         }

         for(int i = 0; i < this.params_.size(); ++i) {
            output.writeInt32(5, this.params_.getInt(i));
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeBool(6, this.background_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(7, this.guideStep_);
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
               size += CodedOutputStream.computeInt32Size(2, this.modelId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.isSkip_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.buffId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.params_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.params_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getParamsList().size();
            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeBoolSize(6, this.background_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.guideStep_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_BattleBegin_6107)) {
            return super.equals(obj);
         } else {
            C2S_BattleBegin_6107 other = (C2S_BattleBegin_6107)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasModelId() != other.hasModelId()) {
               return false;
            } else if (this.hasModelId() && this.getModelId() != other.getModelId()) {
               return false;
            } else if (this.hasIsSkip() != other.hasIsSkip()) {
               return false;
            } else if (this.hasIsSkip() && this.getIsSkip() != other.getIsSkip()) {
               return false;
            } else if (this.hasBuffId() != other.hasBuffId()) {
               return false;
            } else if (this.hasBuffId() && this.getBuffId() != other.getBuffId()) {
               return false;
            } else if (!this.getParamsList().equals(other.getParamsList())) {
               return false;
            } else if (this.hasBackground() != other.hasBackground()) {
               return false;
            } else if (this.hasBackground() && this.getBackground() != other.getBackground()) {
               return false;
            } else if (this.hasGuideStep() != other.hasGuideStep()) {
               return false;
            } else if (this.hasGuideStep() && this.getGuideStep() != other.getGuideStep()) {
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

            if (this.hasModelId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getModelId();
            }

            if (this.hasIsSkip()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getIsSkip());
            }

            if (this.hasBuffId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getBuffId();
            }

            if (this.getParamsCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getParamsList().hashCode();
            }

            if (this.hasBackground()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashBoolean(this.getBackground());
            }

            if (this.hasGuideStep()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getGuideStep();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_BattleBegin_6107 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BattleBegin_6107)PARSER.parseFrom(data);
      }

      public static C2S_BattleBegin_6107 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleBegin_6107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleBegin_6107 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BattleBegin_6107)PARSER.parseFrom(data);
      }

      public static C2S_BattleBegin_6107 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleBegin_6107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleBegin_6107 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BattleBegin_6107)PARSER.parseFrom(data);
      }

      public static C2S_BattleBegin_6107 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleBegin_6107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleBegin_6107 parseFrom(InputStream input) throws IOException {
         return (C2S_BattleBegin_6107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleBegin_6107 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleBegin_6107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleBegin_6107 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BattleBegin_6107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BattleBegin_6107 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleBegin_6107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleBegin_6107 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BattleBegin_6107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleBegin_6107 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleBegin_6107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BattleBegin_6107 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BattleBegin_6107 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BattleBegin_6107> parser() {
         return PARSER;
      }

      public Parser<C2S_BattleBegin_6107> getParserForType() {
         return PARSER;
      }

      public C2S_BattleBegin_6107 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BattleBegin_6107OrBuilder {
         private int bitField0_;
         private int type_;
         private int modelId_;
         private boolean isSkip_;
         private int buffId_;
         private Internal.IntList params_;
         private boolean background_;
         private int guideStep_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleBegin_6107_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleBegin_6107_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleBegin_6107.class, Builder.class);
         }

         private Builder() {
            this.params_ = BattleMsg.C2S_BattleBegin_6107.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.params_ = BattleMsg.C2S_BattleBegin_6107.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.C2S_BattleBegin_6107.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.modelId_ = 0;
            this.bitField0_ &= -3;
            this.isSkip_ = false;
            this.bitField0_ &= -5;
            this.buffId_ = 0;
            this.bitField0_ &= -9;
            this.params_ = BattleMsg.C2S_BattleBegin_6107.emptyIntList();
            this.bitField0_ &= -17;
            this.background_ = false;
            this.bitField0_ &= -33;
            this.guideStep_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleBegin_6107_descriptor;
         }

         public C2S_BattleBegin_6107 getDefaultInstanceForType() {
            return BattleMsg.C2S_BattleBegin_6107.getDefaultInstance();
         }

         public C2S_BattleBegin_6107 build() {
            C2S_BattleBegin_6107 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BattleBegin_6107 buildPartial() {
            C2S_BattleBegin_6107 result = new C2S_BattleBegin_6107(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.modelId_ = this.modelId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.isSkip_ = this.isSkip_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.buffId_ = this.buffId_;
               to_bitField0_ |= 8;
            }

            if ((this.bitField0_ & 16) != 0) {
               this.params_.makeImmutable();
               this.bitField0_ &= -17;
            }

            result.params_ = this.params_;
            if ((from_bitField0_ & 32) != 0) {
               result.background_ = this.background_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.guideStep_ = this.guideStep_;
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
            if (other instanceof C2S_BattleBegin_6107) {
               return this.mergeFrom((C2S_BattleBegin_6107)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BattleBegin_6107 other) {
            if (other == BattleMsg.C2S_BattleBegin_6107.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasModelId()) {
                  this.setModelId(other.getModelId());
               }

               if (other.hasIsSkip()) {
                  this.setIsSkip(other.getIsSkip());
               }

               if (other.hasBuffId()) {
                  this.setBuffId(other.getBuffId());
               }

               if (!other.params_.isEmpty()) {
                  if (this.params_.isEmpty()) {
                     this.params_ = other.params_;
                     this.bitField0_ &= -17;
                  } else {
                     this.ensureParamsIsMutable();
                     this.params_.addAll(other.params_);
                  }

                  this.onChanged();
               }

               if (other.hasBackground()) {
                  this.setBackground(other.getBackground());
               }

               if (other.hasGuideStep()) {
                  this.setGuideStep(other.getGuideStep());
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
               return this.hasModelId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_BattleBegin_6107 parsedMessage = null;

            try {
               parsedMessage = (C2S_BattleBegin_6107)BattleMsg.C2S_BattleBegin_6107.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BattleBegin_6107)e.getUnfinishedMessage();
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

         public boolean hasModelId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getModelId() {
            return this.modelId_;
         }

         public Builder setModelId(int value) {
            this.bitField0_ |= 2;
            this.modelId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModelId() {
            this.bitField0_ &= -3;
            this.modelId_ = 0;
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

         public boolean hasBuffId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getBuffId() {
            return this.buffId_;
         }

         public Builder setBuffId(int value) {
            this.bitField0_ |= 8;
            this.buffId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuffId() {
            this.bitField0_ &= -9;
            this.buffId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureParamsIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.params_ = BattleMsg.C2S_BattleBegin_6107.mutableCopy(this.params_);
               this.bitField0_ |= 16;
            }

         }

         public List<Integer> getParamsList() {
            return (List<Integer>)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.params_) : this.params_);
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
            this.params_ = BattleMsg.C2S_BattleBegin_6107.emptyIntList();
            this.bitField0_ &= -17;
            this.onChanged();
            return this;
         }

         public boolean hasBackground() {
            return (this.bitField0_ & 32) != 0;
         }

         public boolean getBackground() {
            return this.background_;
         }

         public Builder setBackground(boolean value) {
            this.bitField0_ |= 32;
            this.background_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBackground() {
            this.bitField0_ &= -33;
            this.background_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasGuideStep() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getGuideStep() {
            return this.guideStep_;
         }

         public Builder setGuideStep(int value) {
            this.bitField0_ |= 64;
            this.guideStep_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGuideStep() {
            this.bitField0_ &= -65;
            this.guideStep_ = 0;
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

   public static final class S2C_BattleBegin_6108 extends GeneratedMessageV3 implements S2C_BattleBegin_6108OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      private byte memoizedIsInitialized;
      private static final S2C_BattleBegin_6108 DEFAULT_INSTANCE = new S2C_BattleBegin_6108();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BattleBegin_6108> PARSER = new AbstractParser<S2C_BattleBegin_6108>() {
         public S2C_BattleBegin_6108 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BattleBegin_6108(input, extensionRegistry);
         }
      };

      private S2C_BattleBegin_6108(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BattleBegin_6108() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BattleBegin_6108();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BattleBegin_6108(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleBegin_6108_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleBegin_6108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleBegin_6108.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.type_);
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
               size += CodedOutputStream.computeInt32Size(2, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BattleBegin_6108)) {
            return super.equals(obj);
         } else {
            S2C_BattleBegin_6108 other = (S2C_BattleBegin_6108)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BattleBegin_6108 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BattleBegin_6108)PARSER.parseFrom(data);
      }

      public static S2C_BattleBegin_6108 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleBegin_6108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleBegin_6108 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BattleBegin_6108)PARSER.parseFrom(data);
      }

      public static S2C_BattleBegin_6108 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleBegin_6108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleBegin_6108 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BattleBegin_6108)PARSER.parseFrom(data);
      }

      public static S2C_BattleBegin_6108 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleBegin_6108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleBegin_6108 parseFrom(InputStream input) throws IOException {
         return (S2C_BattleBegin_6108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleBegin_6108 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleBegin_6108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleBegin_6108 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BattleBegin_6108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BattleBegin_6108 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleBegin_6108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleBegin_6108 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BattleBegin_6108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleBegin_6108 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleBegin_6108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BattleBegin_6108 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BattleBegin_6108 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BattleBegin_6108> parser() {
         return PARSER;
      }

      public Parser<S2C_BattleBegin_6108> getParserForType() {
         return PARSER;
      }

      public S2C_BattleBegin_6108 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BattleBegin_6108OrBuilder {
         private int bitField0_;
         private int result_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleBegin_6108_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleBegin_6108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleBegin_6108.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.S2C_BattleBegin_6108.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleBegin_6108_descriptor;
         }

         public S2C_BattleBegin_6108 getDefaultInstanceForType() {
            return BattleMsg.S2C_BattleBegin_6108.getDefaultInstance();
         }

         public S2C_BattleBegin_6108 build() {
            S2C_BattleBegin_6108 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BattleBegin_6108 buildPartial() {
            S2C_BattleBegin_6108 result = new S2C_BattleBegin_6108(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof S2C_BattleBegin_6108) {
               return this.mergeFrom((S2C_BattleBegin_6108)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BattleBegin_6108 other) {
            if (other == BattleMsg.S2C_BattleBegin_6108.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
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
            if (!this.hasResult()) {
               return false;
            } else {
               return this.hasType();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BattleBegin_6108 parsedMessage = null;

            try {
               parsedMessage = (S2C_BattleBegin_6108)BattleMsg.S2C_BattleBegin_6108.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BattleBegin_6108)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_BattleNext_6109 extends GeneratedMessageV3 implements C2S_BattleNext_6109OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int NEEDRECORD_FIELD_NUMBER = 2;
      private boolean needRecord_;
      public static final int MODELID_FIELD_NUMBER = 3;
      private int modelId_;
      private byte memoizedIsInitialized;
      private static final C2S_BattleNext_6109 DEFAULT_INSTANCE = new C2S_BattleNext_6109();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BattleNext_6109> PARSER = new AbstractParser<C2S_BattleNext_6109>() {
         public C2S_BattleNext_6109 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BattleNext_6109(input, extensionRegistry);
         }
      };

      private C2S_BattleNext_6109(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BattleNext_6109() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BattleNext_6109();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BattleNext_6109(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.needRecord_ = input.readBool();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.modelId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleNext_6109_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleNext_6109_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleNext_6109.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasNeedRecord() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getNeedRecord() {
         return this.needRecord_;
      }

      public boolean hasModelId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getModelId() {
         return this.modelId_;
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
         } else if (!this.hasNeedRecord()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasModelId()) {
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
            output.writeBool(2, this.needRecord_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.modelId_);
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
               size += CodedOutputStream.computeBoolSize(2, this.needRecord_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.modelId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_BattleNext_6109)) {
            return super.equals(obj);
         } else {
            C2S_BattleNext_6109 other = (C2S_BattleNext_6109)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasNeedRecord() != other.hasNeedRecord()) {
               return false;
            } else if (this.hasNeedRecord() && this.getNeedRecord() != other.getNeedRecord()) {
               return false;
            } else if (this.hasModelId() != other.hasModelId()) {
               return false;
            } else if (this.hasModelId() && this.getModelId() != other.getModelId()) {
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

            if (this.hasNeedRecord()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getNeedRecord());
            }

            if (this.hasModelId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getModelId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_BattleNext_6109 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BattleNext_6109)PARSER.parseFrom(data);
      }

      public static C2S_BattleNext_6109 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleNext_6109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleNext_6109 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BattleNext_6109)PARSER.parseFrom(data);
      }

      public static C2S_BattleNext_6109 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleNext_6109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleNext_6109 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BattleNext_6109)PARSER.parseFrom(data);
      }

      public static C2S_BattleNext_6109 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleNext_6109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleNext_6109 parseFrom(InputStream input) throws IOException {
         return (C2S_BattleNext_6109)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleNext_6109 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleNext_6109)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleNext_6109 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BattleNext_6109)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BattleNext_6109 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleNext_6109)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleNext_6109 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BattleNext_6109)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleNext_6109 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleNext_6109)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BattleNext_6109 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BattleNext_6109 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BattleNext_6109> parser() {
         return PARSER;
      }

      public Parser<C2S_BattleNext_6109> getParserForType() {
         return PARSER;
      }

      public C2S_BattleNext_6109 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BattleNext_6109OrBuilder {
         private int bitField0_;
         private int type_;
         private boolean needRecord_;
         private int modelId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleNext_6109_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleNext_6109_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleNext_6109.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.C2S_BattleNext_6109.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.needRecord_ = false;
            this.bitField0_ &= -3;
            this.modelId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleNext_6109_descriptor;
         }

         public C2S_BattleNext_6109 getDefaultInstanceForType() {
            return BattleMsg.C2S_BattleNext_6109.getDefaultInstance();
         }

         public C2S_BattleNext_6109 build() {
            C2S_BattleNext_6109 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BattleNext_6109 buildPartial() {
            C2S_BattleNext_6109 result = new C2S_BattleNext_6109(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.needRecord_ = this.needRecord_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.modelId_ = this.modelId_;
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
            if (other instanceof C2S_BattleNext_6109) {
               return this.mergeFrom((C2S_BattleNext_6109)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BattleNext_6109 other) {
            if (other == BattleMsg.C2S_BattleNext_6109.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasNeedRecord()) {
                  this.setNeedRecord(other.getNeedRecord());
               }

               if (other.hasModelId()) {
                  this.setModelId(other.getModelId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else if (!this.hasNeedRecord()) {
               return false;
            } else {
               return this.hasModelId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_BattleNext_6109 parsedMessage = null;

            try {
               parsedMessage = (C2S_BattleNext_6109)BattleMsg.C2S_BattleNext_6109.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BattleNext_6109)e.getUnfinishedMessage();
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

         public boolean hasNeedRecord() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getNeedRecord() {
            return this.needRecord_;
         }

         public Builder setNeedRecord(boolean value) {
            this.bitField0_ |= 2;
            this.needRecord_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNeedRecord() {
            this.bitField0_ &= -3;
            this.needRecord_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasModelId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getModelId() {
            return this.modelId_;
         }

         public Builder setModelId(int value) {
            this.bitField0_ |= 4;
            this.modelId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModelId() {
            this.bitField0_ &= -5;
            this.modelId_ = 0;
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

   public static final class S2C_BattleNext_6110 extends GeneratedMessageV3 implements S2C_BattleNext_6110OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      private byte memoizedIsInitialized;
      private static final S2C_BattleNext_6110 DEFAULT_INSTANCE = new S2C_BattleNext_6110();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BattleNext_6110> PARSER = new AbstractParser<S2C_BattleNext_6110>() {
         public S2C_BattleNext_6110 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BattleNext_6110(input, extensionRegistry);
         }
      };

      private S2C_BattleNext_6110(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BattleNext_6110() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BattleNext_6110();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BattleNext_6110(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleNext_6110_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleNext_6110_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleNext_6110.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.type_);
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
               size += CodedOutputStream.computeInt32Size(2, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BattleNext_6110)) {
            return super.equals(obj);
         } else {
            S2C_BattleNext_6110 other = (S2C_BattleNext_6110)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BattleNext_6110 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BattleNext_6110)PARSER.parseFrom(data);
      }

      public static S2C_BattleNext_6110 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleNext_6110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleNext_6110 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BattleNext_6110)PARSER.parseFrom(data);
      }

      public static S2C_BattleNext_6110 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleNext_6110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleNext_6110 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BattleNext_6110)PARSER.parseFrom(data);
      }

      public static S2C_BattleNext_6110 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleNext_6110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleNext_6110 parseFrom(InputStream input) throws IOException {
         return (S2C_BattleNext_6110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleNext_6110 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleNext_6110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleNext_6110 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BattleNext_6110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BattleNext_6110 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleNext_6110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleNext_6110 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BattleNext_6110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleNext_6110 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleNext_6110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BattleNext_6110 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BattleNext_6110 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BattleNext_6110> parser() {
         return PARSER;
      }

      public Parser<S2C_BattleNext_6110> getParserForType() {
         return PARSER;
      }

      public S2C_BattleNext_6110 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BattleNext_6110OrBuilder {
         private int bitField0_;
         private int result_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleNext_6110_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleNext_6110_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleNext_6110.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.S2C_BattleNext_6110.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleNext_6110_descriptor;
         }

         public S2C_BattleNext_6110 getDefaultInstanceForType() {
            return BattleMsg.S2C_BattleNext_6110.getDefaultInstance();
         }

         public S2C_BattleNext_6110 build() {
            S2C_BattleNext_6110 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BattleNext_6110 buildPartial() {
            S2C_BattleNext_6110 result = new S2C_BattleNext_6110(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof S2C_BattleNext_6110) {
               return this.mergeFrom((S2C_BattleNext_6110)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BattleNext_6110 other) {
            if (other == BattleMsg.S2C_BattleNext_6110.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
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
            if (!this.hasResult()) {
               return false;
            } else {
               return this.hasType();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BattleNext_6110 parsedMessage = null;

            try {
               parsedMessage = (S2C_BattleNext_6110)BattleMsg.S2C_BattleNext_6110.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BattleNext_6110)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_BattleEnd_6111 extends GeneratedMessageV3 implements C2S_BattleEnd_6111OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int FORCE_FIELD_NUMBER = 2;
      private boolean force_;
      public static final int PARAMS_FIELD_NUMBER = 3;
      private Internal.IntList params_;
      private byte memoizedIsInitialized;
      private static final C2S_BattleEnd_6111 DEFAULT_INSTANCE = new C2S_BattleEnd_6111();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BattleEnd_6111> PARSER = new AbstractParser<C2S_BattleEnd_6111>() {
         public C2S_BattleEnd_6111 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BattleEnd_6111(input, extensionRegistry);
         }
      };

      private C2S_BattleEnd_6111(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BattleEnd_6111() {
         this.memoizedIsInitialized = -1;
         this.params_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BattleEnd_6111();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BattleEnd_6111(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.force_ = input.readBool();
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.params_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.params_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.params_ = newIntList();
                           mutable_bitField0_ |= 4;
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
               if ((mutable_bitField0_ & 4) != 0) {
                  this.params_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleEnd_6111_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleEnd_6111_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleEnd_6111.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasForce() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getForce() {
         return this.force_;
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
            output.writeBool(2, this.force_);
         }

         for(int i = 0; i < this.params_.size(); ++i) {
            output.writeInt32(3, this.params_.getInt(i));
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
               size += CodedOutputStream.computeBoolSize(2, this.force_);
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
         } else if (!(obj instanceof C2S_BattleEnd_6111)) {
            return super.equals(obj);
         } else {
            C2S_BattleEnd_6111 other = (C2S_BattleEnd_6111)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasForce() != other.hasForce()) {
               return false;
            } else if (this.hasForce() && this.getForce() != other.getForce()) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            if (this.hasForce()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getForce());
            }

            if (this.getParamsCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getParamsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_BattleEnd_6111 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BattleEnd_6111)PARSER.parseFrom(data);
      }

      public static C2S_BattleEnd_6111 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleEnd_6111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleEnd_6111 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BattleEnd_6111)PARSER.parseFrom(data);
      }

      public static C2S_BattleEnd_6111 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleEnd_6111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleEnd_6111 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BattleEnd_6111)PARSER.parseFrom(data);
      }

      public static C2S_BattleEnd_6111 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleEnd_6111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleEnd_6111 parseFrom(InputStream input) throws IOException {
         return (C2S_BattleEnd_6111)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleEnd_6111 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleEnd_6111)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleEnd_6111 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BattleEnd_6111)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BattleEnd_6111 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleEnd_6111)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleEnd_6111 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BattleEnd_6111)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleEnd_6111 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleEnd_6111)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BattleEnd_6111 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BattleEnd_6111 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BattleEnd_6111> parser() {
         return PARSER;
      }

      public Parser<C2S_BattleEnd_6111> getParserForType() {
         return PARSER;
      }

      public C2S_BattleEnd_6111 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BattleEnd_6111OrBuilder {
         private int bitField0_;
         private int type_;
         private boolean force_;
         private Internal.IntList params_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleEnd_6111_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleEnd_6111_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleEnd_6111.class, Builder.class);
         }

         private Builder() {
            this.params_ = BattleMsg.C2S_BattleEnd_6111.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.params_ = BattleMsg.C2S_BattleEnd_6111.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.C2S_BattleEnd_6111.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.force_ = false;
            this.bitField0_ &= -3;
            this.params_ = BattleMsg.C2S_BattleEnd_6111.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleEnd_6111_descriptor;
         }

         public C2S_BattleEnd_6111 getDefaultInstanceForType() {
            return BattleMsg.C2S_BattleEnd_6111.getDefaultInstance();
         }

         public C2S_BattleEnd_6111 build() {
            C2S_BattleEnd_6111 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BattleEnd_6111 buildPartial() {
            C2S_BattleEnd_6111 result = new C2S_BattleEnd_6111(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.force_ = this.force_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.params_.makeImmutable();
               this.bitField0_ &= -5;
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
            if (other instanceof C2S_BattleEnd_6111) {
               return this.mergeFrom((C2S_BattleEnd_6111)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BattleEnd_6111 other) {
            if (other == BattleMsg.C2S_BattleEnd_6111.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasForce()) {
                  this.setForce(other.getForce());
               }

               if (!other.params_.isEmpty()) {
                  if (this.params_.isEmpty()) {
                     this.params_ = other.params_;
                     this.bitField0_ &= -5;
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
            return this.hasType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_BattleEnd_6111 parsedMessage = null;

            try {
               parsedMessage = (C2S_BattleEnd_6111)BattleMsg.C2S_BattleEnd_6111.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BattleEnd_6111)e.getUnfinishedMessage();
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

         public boolean hasForce() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getForce() {
            return this.force_;
         }

         public Builder setForce(boolean value) {
            this.bitField0_ |= 2;
            this.force_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearForce() {
            this.bitField0_ &= -3;
            this.force_ = false;
            this.onChanged();
            return this;
         }

         private void ensureParamsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.params_ = BattleMsg.C2S_BattleEnd_6111.mutableCopy(this.params_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getParamsList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.params_) : this.params_);
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
            this.params_ = BattleMsg.C2S_BattleEnd_6111.emptyIntList();
            this.bitField0_ &= -5;
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

   public static final class S2C_BattleEnd_6112 extends GeneratedMessageV3 implements S2C_BattleEnd_6112OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_BattleEnd_6112 DEFAULT_INSTANCE = new S2C_BattleEnd_6112();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BattleEnd_6112> PARSER = new AbstractParser<S2C_BattleEnd_6112>() {
         public S2C_BattleEnd_6112 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BattleEnd_6112(input, extensionRegistry);
         }
      };

      private S2C_BattleEnd_6112(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BattleEnd_6112() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BattleEnd_6112();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BattleEnd_6112(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleEnd_6112_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleEnd_6112_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleEnd_6112.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BattleEnd_6112)) {
            return super.equals(obj);
         } else {
            S2C_BattleEnd_6112 other = (S2C_BattleEnd_6112)obj;
            if (this.hasResult() != other.hasResult()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BattleEnd_6112 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BattleEnd_6112)PARSER.parseFrom(data);
      }

      public static S2C_BattleEnd_6112 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleEnd_6112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleEnd_6112 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BattleEnd_6112)PARSER.parseFrom(data);
      }

      public static S2C_BattleEnd_6112 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleEnd_6112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleEnd_6112 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BattleEnd_6112)PARSER.parseFrom(data);
      }

      public static S2C_BattleEnd_6112 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleEnd_6112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleEnd_6112 parseFrom(InputStream input) throws IOException {
         return (S2C_BattleEnd_6112)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleEnd_6112 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleEnd_6112)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleEnd_6112 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BattleEnd_6112)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BattleEnd_6112 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleEnd_6112)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleEnd_6112 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BattleEnd_6112)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleEnd_6112 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleEnd_6112)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BattleEnd_6112 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BattleEnd_6112 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BattleEnd_6112> parser() {
         return PARSER;
      }

      public Parser<S2C_BattleEnd_6112> getParserForType() {
         return PARSER;
      }

      public S2C_BattleEnd_6112 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BattleEnd_6112OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleEnd_6112_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleEnd_6112_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleEnd_6112.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.S2C_BattleEnd_6112.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleEnd_6112_descriptor;
         }

         public S2C_BattleEnd_6112 getDefaultInstanceForType() {
            return BattleMsg.S2C_BattleEnd_6112.getDefaultInstance();
         }

         public S2C_BattleEnd_6112 build() {
            S2C_BattleEnd_6112 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BattleEnd_6112 buildPartial() {
            S2C_BattleEnd_6112 result = new S2C_BattleEnd_6112(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
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
            if (other instanceof S2C_BattleEnd_6112) {
               return this.mergeFrom((S2C_BattleEnd_6112)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BattleEnd_6112 other) {
            if (other == BattleMsg.S2C_BattleEnd_6112.getDefaultInstance()) {
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
            S2C_BattleEnd_6112 parsedMessage = null;

            try {
               parsedMessage = (S2C_BattleEnd_6112)BattleMsg.S2C_BattleEnd_6112.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BattleEnd_6112)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_BattleList_6113 extends GeneratedMessageV3 implements C2S_BattleList_6113OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_BattleList_6113 DEFAULT_INSTANCE = new C2S_BattleList_6113();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BattleList_6113> PARSER = new AbstractParser<C2S_BattleList_6113>() {
         public C2S_BattleList_6113 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BattleList_6113(input, extensionRegistry);
         }
      };

      private C2S_BattleList_6113(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BattleList_6113() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BattleList_6113();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BattleList_6113(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleList_6113_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleList_6113_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleList_6113.class, Builder.class);
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
         } else if (!(obj instanceof C2S_BattleList_6113)) {
            return super.equals(obj);
         } else {
            C2S_BattleList_6113 other = (C2S_BattleList_6113)obj;
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

      public static C2S_BattleList_6113 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BattleList_6113)PARSER.parseFrom(data);
      }

      public static C2S_BattleList_6113 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleList_6113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleList_6113 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BattleList_6113)PARSER.parseFrom(data);
      }

      public static C2S_BattleList_6113 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleList_6113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleList_6113 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BattleList_6113)PARSER.parseFrom(data);
      }

      public static C2S_BattleList_6113 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleList_6113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleList_6113 parseFrom(InputStream input) throws IOException {
         return (C2S_BattleList_6113)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleList_6113 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleList_6113)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleList_6113 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BattleList_6113)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BattleList_6113 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleList_6113)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleList_6113 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BattleList_6113)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleList_6113 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleList_6113)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BattleList_6113 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BattleList_6113 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BattleList_6113> parser() {
         return PARSER;
      }

      public Parser<C2S_BattleList_6113> getParserForType() {
         return PARSER;
      }

      public C2S_BattleList_6113 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BattleList_6113OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleList_6113_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleList_6113_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleList_6113.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.C2S_BattleList_6113.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleList_6113_descriptor;
         }

         public C2S_BattleList_6113 getDefaultInstanceForType() {
            return BattleMsg.C2S_BattleList_6113.getDefaultInstance();
         }

         public C2S_BattleList_6113 build() {
            C2S_BattleList_6113 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BattleList_6113 buildPartial() {
            C2S_BattleList_6113 result = new C2S_BattleList_6113(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_BattleList_6113) {
               return this.mergeFrom((C2S_BattleList_6113)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BattleList_6113 other) {
            if (other == BattleMsg.C2S_BattleList_6113.getDefaultInstance()) {
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
            C2S_BattleList_6113 parsedMessage = null;

            try {
               parsedMessage = (C2S_BattleList_6113)BattleMsg.C2S_BattleList_6113.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BattleList_6113)e.getUnfinishedMessage();
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

   public static final class C2S_BattleRecordData_6115 extends GeneratedMessageV3 implements C2S_BattleRecordData_6115OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECORDID_FIELD_NUMBER = 1;
      private int recordId_;
      private byte memoizedIsInitialized;
      private static final C2S_BattleRecordData_6115 DEFAULT_INSTANCE = new C2S_BattleRecordData_6115();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BattleRecordData_6115> PARSER = new AbstractParser<C2S_BattleRecordData_6115>() {
         public C2S_BattleRecordData_6115 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BattleRecordData_6115(input, extensionRegistry);
         }
      };

      private C2S_BattleRecordData_6115(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BattleRecordData_6115() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BattleRecordData_6115();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BattleRecordData_6115(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordData_6115_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordData_6115_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleRecordData_6115.class, Builder.class);
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
         } else if (!(obj instanceof C2S_BattleRecordData_6115)) {
            return super.equals(obj);
         } else {
            C2S_BattleRecordData_6115 other = (C2S_BattleRecordData_6115)obj;
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

      public static C2S_BattleRecordData_6115 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BattleRecordData_6115)PARSER.parseFrom(data);
      }

      public static C2S_BattleRecordData_6115 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleRecordData_6115)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleRecordData_6115 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BattleRecordData_6115)PARSER.parseFrom(data);
      }

      public static C2S_BattleRecordData_6115 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleRecordData_6115)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleRecordData_6115 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BattleRecordData_6115)PARSER.parseFrom(data);
      }

      public static C2S_BattleRecordData_6115 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleRecordData_6115)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleRecordData_6115 parseFrom(InputStream input) throws IOException {
         return (C2S_BattleRecordData_6115)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleRecordData_6115 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleRecordData_6115)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleRecordData_6115 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BattleRecordData_6115)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BattleRecordData_6115 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleRecordData_6115)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleRecordData_6115 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BattleRecordData_6115)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleRecordData_6115 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleRecordData_6115)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BattleRecordData_6115 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BattleRecordData_6115 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BattleRecordData_6115> parser() {
         return PARSER;
      }

      public Parser<C2S_BattleRecordData_6115> getParserForType() {
         return PARSER;
      }

      public C2S_BattleRecordData_6115 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BattleRecordData_6115OrBuilder {
         private int bitField0_;
         private int recordId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordData_6115_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordData_6115_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleRecordData_6115.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.C2S_BattleRecordData_6115.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.recordId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordData_6115_descriptor;
         }

         public C2S_BattleRecordData_6115 getDefaultInstanceForType() {
            return BattleMsg.C2S_BattleRecordData_6115.getDefaultInstance();
         }

         public C2S_BattleRecordData_6115 build() {
            C2S_BattleRecordData_6115 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BattleRecordData_6115 buildPartial() {
            C2S_BattleRecordData_6115 result = new C2S_BattleRecordData_6115(this);
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
            if (other instanceof C2S_BattleRecordData_6115) {
               return this.mergeFrom((C2S_BattleRecordData_6115)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BattleRecordData_6115 other) {
            if (other == BattleMsg.C2S_BattleRecordData_6115.getDefaultInstance()) {
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
            C2S_BattleRecordData_6115 parsedMessage = null;

            try {
               parsedMessage = (C2S_BattleRecordData_6115)BattleMsg.C2S_BattleRecordData_6115.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BattleRecordData_6115)e.getUnfinishedMessage();
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

   public static final class S2C_BattleRecordData_6116 extends GeneratedMessageV3 implements S2C_BattleRecordData_6116OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private S2C_BattleResult_6102 result_;
      private byte memoizedIsInitialized;
      private static final S2C_BattleRecordData_6116 DEFAULT_INSTANCE = new S2C_BattleRecordData_6116();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BattleRecordData_6116> PARSER = new AbstractParser<S2C_BattleRecordData_6116>() {
         public S2C_BattleRecordData_6116 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BattleRecordData_6116(input, extensionRegistry);
         }
      };

      private S2C_BattleRecordData_6116(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BattleRecordData_6116() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BattleRecordData_6116();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BattleRecordData_6116(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.result_.toBuilder();
                        }

                        this.result_ = (S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.result_);
                           this.result_ = subBuilder.buildPartial();
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
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleRecordData_6116_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleRecordData_6116_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleRecordData_6116.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public S2C_BattleResult_6102 getResult() {
         return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
      }

      public S2C_BattleResult_6102OrBuilder getResultOrBuilder() {
         return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
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
         } else if (!this.getResult().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getResult());
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
               size += CodedOutputStream.computeMessageSize(1, this.getResult());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BattleRecordData_6116)) {
            return super.equals(obj);
         } else {
            S2C_BattleRecordData_6116 other = (S2C_BattleRecordData_6116)obj;
            if (this.hasResult() != other.hasResult()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BattleRecordData_6116 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BattleRecordData_6116)PARSER.parseFrom(data);
      }

      public static S2C_BattleRecordData_6116 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleRecordData_6116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleRecordData_6116 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BattleRecordData_6116)PARSER.parseFrom(data);
      }

      public static S2C_BattleRecordData_6116 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleRecordData_6116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleRecordData_6116 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BattleRecordData_6116)PARSER.parseFrom(data);
      }

      public static S2C_BattleRecordData_6116 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleRecordData_6116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleRecordData_6116 parseFrom(InputStream input) throws IOException {
         return (S2C_BattleRecordData_6116)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleRecordData_6116 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleRecordData_6116)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleRecordData_6116 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BattleRecordData_6116)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BattleRecordData_6116 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleRecordData_6116)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleRecordData_6116 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BattleRecordData_6116)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleRecordData_6116 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleRecordData_6116)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BattleRecordData_6116 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BattleRecordData_6116 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BattleRecordData_6116> parser() {
         return PARSER;
      }

      public Parser<S2C_BattleRecordData_6116> getParserForType() {
         return PARSER;
      }

      public S2C_BattleRecordData_6116 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BattleRecordData_6116OrBuilder {
         private int bitField0_;
         private S2C_BattleResult_6102 result_;
         private SingleFieldBuilderV3<S2C_BattleResult_6102, S2C_BattleResult_6102.Builder, S2C_BattleResult_6102OrBuilder> resultBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleRecordData_6116_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleRecordData_6116_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleRecordData_6116.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.S2C_BattleRecordData_6116.alwaysUseFieldBuilders) {
               this.getResultFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.resultBuilder_ == null) {
               this.result_ = null;
            } else {
               this.resultBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleRecordData_6116_descriptor;
         }

         public S2C_BattleRecordData_6116 getDefaultInstanceForType() {
            return BattleMsg.S2C_BattleRecordData_6116.getDefaultInstance();
         }

         public S2C_BattleRecordData_6116 build() {
            S2C_BattleRecordData_6116 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BattleRecordData_6116 buildPartial() {
            S2C_BattleRecordData_6116 result = new S2C_BattleRecordData_6116(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.resultBuilder_ == null) {
                  result.result_ = this.result_;
               } else {
                  result.result_ = (S2C_BattleResult_6102)this.resultBuilder_.build();
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
            if (other instanceof S2C_BattleRecordData_6116) {
               return this.mergeFrom((S2C_BattleRecordData_6116)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BattleRecordData_6116 other) {
            if (other == BattleMsg.S2C_BattleRecordData_6116.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.mergeResult(other.getResult());
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
               return this.getResult().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BattleRecordData_6116 parsedMessage = null;

            try {
               parsedMessage = (S2C_BattleRecordData_6116)BattleMsg.S2C_BattleRecordData_6116.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BattleRecordData_6116)e.getUnfinishedMessage();
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

         public S2C_BattleResult_6102 getResult() {
            if (this.resultBuilder_ == null) {
               return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
            } else {
               return (S2C_BattleResult_6102)this.resultBuilder_.getMessage();
            }
         }

         public Builder setResult(S2C_BattleResult_6102 value) {
            if (this.resultBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.result_ = value;
               this.onChanged();
            } else {
               this.resultBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setResult(S2C_BattleResult_6102.Builder builderForValue) {
            if (this.resultBuilder_ == null) {
               this.result_ = builderForValue.build();
               this.onChanged();
            } else {
               this.resultBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeResult(S2C_BattleResult_6102 value) {
            if (this.resultBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.result_ != null && this.result_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.result_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.result_).mergeFrom(value).buildPartial();
               } else {
                  this.result_ = value;
               }

               this.onChanged();
            } else {
               this.resultBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearResult() {
            if (this.resultBuilder_ == null) {
               this.result_ = null;
               this.onChanged();
            } else {
               this.resultBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public S2C_BattleResult_6102.Builder getResultBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (S2C_BattleResult_6102.Builder)this.getResultFieldBuilder().getBuilder();
         }

         public S2C_BattleResult_6102OrBuilder getResultOrBuilder() {
            if (this.resultBuilder_ != null) {
               return (S2C_BattleResult_6102OrBuilder)this.resultBuilder_.getMessageOrBuilder();
            } else {
               return this.result_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.result_;
            }
         }

         private SingleFieldBuilderV3<S2C_BattleResult_6102, S2C_BattleResult_6102.Builder, S2C_BattleResult_6102OrBuilder> getResultFieldBuilder() {
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

   public static final class C2S_BattleRecordError_6121 extends GeneratedMessageV3 implements C2S_BattleRecordError_6121OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECORD_FIELD_NUMBER = 1;
      private S2C_BattleResult_6102 record_;
      private byte memoizedIsInitialized;
      private static final C2S_BattleRecordError_6121 DEFAULT_INSTANCE = new C2S_BattleRecordError_6121();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BattleRecordError_6121> PARSER = new AbstractParser<C2S_BattleRecordError_6121>() {
         public C2S_BattleRecordError_6121 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BattleRecordError_6121(input, extensionRegistry);
         }
      };

      private C2S_BattleRecordError_6121(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BattleRecordError_6121() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BattleRecordError_6121();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BattleRecordError_6121(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.record_.toBuilder();
                        }

                        this.record_ = (S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.record_);
                           this.record_ = subBuilder.buildPartial();
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
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordError_6121_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordError_6121_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleRecordError_6121.class, Builder.class);
      }

      public boolean hasRecord() {
         return (this.bitField0_ & 1) != 0;
      }

      public S2C_BattleResult_6102 getRecord() {
         return this.record_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.record_;
      }

      public S2C_BattleResult_6102OrBuilder getRecordOrBuilder() {
         return this.record_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.record_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRecord()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getRecord().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getRecord());
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
               size += CodedOutputStream.computeMessageSize(1, this.getRecord());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_BattleRecordError_6121)) {
            return super.equals(obj);
         } else {
            C2S_BattleRecordError_6121 other = (C2S_BattleRecordError_6121)obj;
            if (this.hasRecord() != other.hasRecord()) {
               return false;
            } else if (this.hasRecord() && !this.getRecord().equals(other.getRecord())) {
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
            if (this.hasRecord()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecord().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_BattleRecordError_6121 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BattleRecordError_6121)PARSER.parseFrom(data);
      }

      public static C2S_BattleRecordError_6121 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleRecordError_6121)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleRecordError_6121 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BattleRecordError_6121)PARSER.parseFrom(data);
      }

      public static C2S_BattleRecordError_6121 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleRecordError_6121)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleRecordError_6121 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BattleRecordError_6121)PARSER.parseFrom(data);
      }

      public static C2S_BattleRecordError_6121 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleRecordError_6121)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleRecordError_6121 parseFrom(InputStream input) throws IOException {
         return (C2S_BattleRecordError_6121)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleRecordError_6121 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleRecordError_6121)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleRecordError_6121 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BattleRecordError_6121)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BattleRecordError_6121 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleRecordError_6121)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleRecordError_6121 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BattleRecordError_6121)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleRecordError_6121 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleRecordError_6121)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BattleRecordError_6121 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BattleRecordError_6121 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BattleRecordError_6121> parser() {
         return PARSER;
      }

      public Parser<C2S_BattleRecordError_6121> getParserForType() {
         return PARSER;
      }

      public C2S_BattleRecordError_6121 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BattleRecordError_6121OrBuilder {
         private int bitField0_;
         private S2C_BattleResult_6102 record_;
         private SingleFieldBuilderV3<S2C_BattleResult_6102, S2C_BattleResult_6102.Builder, S2C_BattleResult_6102OrBuilder> recordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordError_6121_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordError_6121_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleRecordError_6121.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.C2S_BattleRecordError_6121.alwaysUseFieldBuilders) {
               this.getRecordFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.recordBuilder_ == null) {
               this.record_ = null;
            } else {
               this.recordBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_C2S_BattleRecordError_6121_descriptor;
         }

         public C2S_BattleRecordError_6121 getDefaultInstanceForType() {
            return BattleMsg.C2S_BattleRecordError_6121.getDefaultInstance();
         }

         public C2S_BattleRecordError_6121 build() {
            C2S_BattleRecordError_6121 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BattleRecordError_6121 buildPartial() {
            C2S_BattleRecordError_6121 result = new C2S_BattleRecordError_6121(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.recordBuilder_ == null) {
                  result.record_ = this.record_;
               } else {
                  result.record_ = (S2C_BattleResult_6102)this.recordBuilder_.build();
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
            if (other instanceof C2S_BattleRecordError_6121) {
               return this.mergeFrom((C2S_BattleRecordError_6121)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BattleRecordError_6121 other) {
            if (other == BattleMsg.C2S_BattleRecordError_6121.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRecord()) {
                  this.mergeRecord(other.getRecord());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRecord()) {
               return false;
            } else {
               return this.getRecord().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_BattleRecordError_6121 parsedMessage = null;

            try {
               parsedMessage = (C2S_BattleRecordError_6121)BattleMsg.C2S_BattleRecordError_6121.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BattleRecordError_6121)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRecord() {
            return (this.bitField0_ & 1) != 0;
         }

         public S2C_BattleResult_6102 getRecord() {
            if (this.recordBuilder_ == null) {
               return this.record_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.record_;
            } else {
               return (S2C_BattleResult_6102)this.recordBuilder_.getMessage();
            }
         }

         public Builder setRecord(S2C_BattleResult_6102 value) {
            if (this.recordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.record_ = value;
               this.onChanged();
            } else {
               this.recordBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setRecord(S2C_BattleResult_6102.Builder builderForValue) {
            if (this.recordBuilder_ == null) {
               this.record_ = builderForValue.build();
               this.onChanged();
            } else {
               this.recordBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeRecord(S2C_BattleResult_6102 value) {
            if (this.recordBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.record_ != null && this.record_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.record_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.record_).mergeFrom(value).buildPartial();
               } else {
                  this.record_ = value;
               }

               this.onChanged();
            } else {
               this.recordBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearRecord() {
            if (this.recordBuilder_ == null) {
               this.record_ = null;
               this.onChanged();
            } else {
               this.recordBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public S2C_BattleResult_6102.Builder getRecordBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (S2C_BattleResult_6102.Builder)this.getRecordFieldBuilder().getBuilder();
         }

         public S2C_BattleResult_6102OrBuilder getRecordOrBuilder() {
            if (this.recordBuilder_ != null) {
               return (S2C_BattleResult_6102OrBuilder)this.recordBuilder_.getMessageOrBuilder();
            } else {
               return this.record_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.record_;
            }
         }

         private SingleFieldBuilderV3<S2C_BattleResult_6102, S2C_BattleResult_6102.Builder, S2C_BattleResult_6102OrBuilder> getRecordFieldBuilder() {
            if (this.recordBuilder_ == null) {
               this.recordBuilder_ = new SingleFieldBuilderV3(this.getRecord(), this.getParentForChildren(), this.isClean());
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

   public static final class S2C_BattleTemple_6122 extends GeneratedMessageV3 implements S2C_BattleTemple_6122OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_BattleTemple_6122 DEFAULT_INSTANCE = new S2C_BattleTemple_6122();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BattleTemple_6122> PARSER = new AbstractParser<S2C_BattleTemple_6122>() {
         public S2C_BattleTemple_6122 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BattleTemple_6122(input, extensionRegistry);
         }
      };

      private S2C_BattleTemple_6122(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BattleTemple_6122() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BattleTemple_6122();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BattleTemple_6122(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleTemple_6122_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleTemple_6122_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleTemple_6122.class, Builder.class);
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
         } else if (!(obj instanceof S2C_BattleTemple_6122)) {
            return super.equals(obj);
         } else {
            S2C_BattleTemple_6122 other = (S2C_BattleTemple_6122)obj;
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

      public static S2C_BattleTemple_6122 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BattleTemple_6122)PARSER.parseFrom(data);
      }

      public static S2C_BattleTemple_6122 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleTemple_6122)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleTemple_6122 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BattleTemple_6122)PARSER.parseFrom(data);
      }

      public static S2C_BattleTemple_6122 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleTemple_6122)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleTemple_6122 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BattleTemple_6122)PARSER.parseFrom(data);
      }

      public static S2C_BattleTemple_6122 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleTemple_6122)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleTemple_6122 parseFrom(InputStream input) throws IOException {
         return (S2C_BattleTemple_6122)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleTemple_6122 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleTemple_6122)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleTemple_6122 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BattleTemple_6122)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BattleTemple_6122 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleTemple_6122)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleTemple_6122 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BattleTemple_6122)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleTemple_6122 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleTemple_6122)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BattleTemple_6122 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BattleTemple_6122 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BattleTemple_6122> parser() {
         return PARSER;
      }

      public Parser<S2C_BattleTemple_6122> getParserForType() {
         return PARSER;
      }

      public S2C_BattleTemple_6122 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BattleTemple_6122OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleTemple_6122_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleTemple_6122_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleTemple_6122.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleMsg.S2C_BattleTemple_6122.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleMsg.internal_static_battle_com_gzbz_protobuf_S2C_BattleTemple_6122_descriptor;
         }

         public S2C_BattleTemple_6122 getDefaultInstanceForType() {
            return BattleMsg.S2C_BattleTemple_6122.getDefaultInstance();
         }

         public S2C_BattleTemple_6122 build() {
            S2C_BattleTemple_6122 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BattleTemple_6122 buildPartial() {
            S2C_BattleTemple_6122 result = new S2C_BattleTemple_6122(this);
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
            if (other instanceof S2C_BattleTemple_6122) {
               return this.mergeFrom((S2C_BattleTemple_6122)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BattleTemple_6122 other) {
            if (other == BattleMsg.S2C_BattleTemple_6122.getDefaultInstance()) {
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
            S2C_BattleTemple_6122 parsedMessage = null;

            try {
               parsedMessage = (S2C_BattleTemple_6122)BattleMsg.S2C_BattleTemple_6122.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BattleTemple_6122)e.getUnfinishedMessage();
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

   public interface Battle_Result_ValueOrBuilder extends MessageOrBuilder {
      boolean hasPos();

      int getPos();

      boolean hasNum();

      long getNum();
   }

   public interface C2S_BattleBegin_6107OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasModelId();

      int getModelId();

      boolean hasIsSkip();

      boolean getIsSkip();

      boolean hasBuffId();

      int getBuffId();

      List<Integer> getParamsList();

      int getParamsCount();

      int getParams(int index);

      boolean hasBackground();

      boolean getBackground();

      boolean hasGuideStep();

      int getGuideStep();
   }

   public interface C2S_BattleEnd_6111OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasForce();

      boolean getForce();

      List<Integer> getParamsList();

      int getParamsCount();

      int getParams(int index);
   }

   public interface C2S_BattleList_6113OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_BattleNext_6109OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasNeedRecord();

      boolean getNeedRecord();

      boolean hasModelId();

      int getModelId();
   }

   public interface C2S_BattleRecordData_6115OrBuilder extends MessageOrBuilder {
      boolean hasRecordId();

      int getRecordId();
   }

   public interface C2S_BattleRecordError_6121OrBuilder extends MessageOrBuilder {
      boolean hasRecord();

      S2C_BattleResult_6102 getRecord();

      S2C_BattleResult_6102OrBuilder getRecordOrBuilder();
   }

   public interface C2S_BattleRecordFight_6105OrBuilder extends MessageOrBuilder {
      boolean hasRecordId();

      int getRecordId();

      boolean hasSystemid();

      int getSystemid();

      boolean hasServerId();

      int getServerId();

      boolean hasShareType();

      int getShareType();

      boolean hasStartTime();

      int getStartTime();

      boolean hasIsCross();

      boolean getIsCross();
   }

   public interface C2S_Battle_6101OrBuilder extends MessageOrBuilder {
      boolean hasBattleId();

      int getBattleId();
   }

   public interface S2C_BattleBegin_6108OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasType();

      int getType();
   }

   public interface S2C_BattleEnd_6112OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_BattleNext_6110OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasType();

      int getType();
   }

   public interface S2C_BattleRecordData_6116OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      S2C_BattleResult_6102 getResult();

      S2C_BattleResult_6102OrBuilder getResultOrBuilder();
   }

   public interface S2C_BattleResult_6102OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasSetId();

      int getSetId();

      boolean hasBattleId();

      int getBattleId();

      boolean hasRoundMax();

      int getRoundMax();

      boolean hasStartTime();

      int getStartTime();

      boolean hasWave();

      int getWave();

      boolean hasTotalWave();

      int getTotalWave();

      List<S2C_Battle_PKTeam> getTeamsList();

      S2C_Battle_PKTeam getTeams(int index);

      int getTeamsCount();

      List<? extends S2C_Battle_PKTeamOrBuilder> getTeamsOrBuilderList();

      S2C_Battle_PKTeamOrBuilder getTeamsOrBuilder(int index);

      List<S2C_Battle_Round> getRoundsList();

      S2C_Battle_Round getRounds(int index);

      int getRoundsCount();

      List<? extends S2C_Battle_RoundOrBuilder> getRoundsOrBuilderList();

      S2C_Battle_RoundOrBuilder getRoundsOrBuilder(int index);

      boolean hasResult();

      S2C_Battle_Result getResult();

      S2C_Battle_ResultOrBuilder getResultOrBuilder();

      boolean hasIsRecord();

      int getIsRecord();

      List<Integer> getExParamsList();

      int getExParamsCount();

      int getExParams(int index);

      boolean hasFlag();

      boolean getFlag();

      boolean hasIsEnd();

      boolean getIsEnd();

      boolean hasCostTime();

      int getCostTime();

      boolean hasIsSkip();

      boolean getIsSkip();

      boolean hasBackground();

      boolean getBackground();

      boolean hasIsNextWave();

      boolean getIsNextWave();

      boolean hasIsServerSkip();

      boolean getIsServerSkip();

      boolean hasIsPassFloor();

      boolean getIsPassFloor();
   }

   public interface S2C_BattleTemple_6122OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_Battle_ActionOrBuilder extends MessageOrBuilder {
      boolean hasActionType();

      int getActionType();

      boolean hasBattlePos();

      int getBattlePos();

      boolean hasId();

      int getId();

      List<S2C_Battle_Effects> getEffectesList();

      S2C_Battle_Effects getEffectes(int index);

      int getEffectesCount();

      List<? extends S2C_Battle_EffectsOrBuilder> getEffectesOrBuilderList();

      S2C_Battle_EffectsOrBuilder getEffectesOrBuilder(int index);

      List<Integer> getFlexibleParamsList();

      int getFlexibleParamsCount();

      int getFlexibleParams(int index);
   }

   public interface S2C_Battle_ApportionOrBuilder extends MessageOrBuilder {
      boolean hasTargetBattlePos();

      int getTargetBattlePos();

      boolean hasEffectValue();

      int getEffectValue();

      boolean hasFinalValue();

      int getFinalValue();
   }

   public interface S2C_Battle_EffectOrBuilder extends MessageOrBuilder {
      boolean hasEffectType();

      int getEffectType();

      boolean hasTargetBattlePos();

      int getTargetBattlePos();

      boolean hasEffectId();

      int getEffectId();

      boolean hasEffectCode();

      int getEffectCode();

      boolean hasEffectValue();

      long getEffectValue();

      boolean hasFinalValue();

      long getFinalValue();

      boolean hasCrit();

      int getCrit();

      boolean hasTime();

      int getTime();

      List<S2C_Battle_Apportion> getApportionList();

      S2C_Battle_Apportion getApportion(int index);

      int getApportionCount();

      List<? extends S2C_Battle_ApportionOrBuilder> getApportionOrBuilderList();

      S2C_Battle_ApportionOrBuilder getApportionOrBuilder(int index);

      boolean hasEffectSetId();

      int getEffectSetId();
   }

   public interface S2C_Battle_EffectsOrBuilder extends MessageOrBuilder {
      boolean hasSlot();

      int getSlot();

      List<Integer> getBattlePosList();

      int getBattlePosCount();

      int getBattlePos(int index);

      List<S2C_Battle_Effect> getEffectsList();

      S2C_Battle_Effect getEffects(int index);

      int getEffectsCount();

      List<? extends S2C_Battle_EffectOrBuilder> getEffectsOrBuilderList();

      S2C_Battle_EffectOrBuilder getEffectsOrBuilder(int index);

      List<S2C_Battle_Effect> getEventEffectsList();

      S2C_Battle_Effect getEventEffects(int index);

      int getEventEffectsCount();

      List<? extends S2C_Battle_EffectOrBuilder> getEventEffectsOrBuilderList();

      S2C_Battle_EffectOrBuilder getEventEffectsOrBuilder(int index);
   }

   public interface S2C_Battle_EntityOrBuilder extends MessageOrBuilder {
      boolean hasBattlePos();

      int getBattlePos();

      boolean hasTeamPos();

      int getTeamPos();

      boolean hasHeroId();

      int getHeroId();

      boolean hasHpMax();

      long getHpMax();

      boolean hasCurMax();

      long getCurMax();

      boolean hasHeroLv();

      int getHeroLv();

      List<S2C_Battle_Init_Buff> getInitBuffList();

      S2C_Battle_Init_Buff getInitBuff(int index);

      int getInitBuffCount();

      List<? extends S2C_Battle_Init_BuffOrBuilder> getInitBuffOrBuilderList();

      S2C_Battle_Init_BuffOrBuilder getInitBuffOrBuilder(int index);

      boolean hasType();

      EntityType getType();

      boolean hasOriginalPos();

      int getOriginalPos();

      List<Integer> getHeroSkillsList();

      int getHeroSkillsCount();

      int getHeroSkills(int index);

      boolean hasIsDead();

      boolean getIsDead();

      boolean hasArtifactSkinId();

      int getArtifactSkinId();

      boolean hasHeroInfo();

      CommonMsg.HeroInfo getHeroInfo();

      CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder();

      boolean hasSupportBelong();

      String getSupportBelong();

      ByteString getSupportBelongBytes();

      boolean hasPetInfo();

      CommonMsg.PetInfo getPetInfo();

      CommonMsg.PetInfoOrBuilder getPetInfoOrBuilder();
   }

   public interface S2C_Battle_Init_BuffOrBuilder extends MessageOrBuilder {
      boolean hasBuffId();

      int getBuffId();

      boolean hasBuffCode();

      int getBuffCode();

      boolean hasBuffValue();

      int getBuffValue();

      boolean hasBuffRound();

      int getBuffRound();
   }

   public interface S2C_Battle_PKTeamOrBuilder extends MessageOrBuilder {
      boolean hasBeloogId();

      int getBeloogId();

      boolean hasBeloogName();

      String getBeloogName();

      ByteString getBeloogNameBytes();

      boolean hasForce();

      int getForce();

      List<S2C_Battle_Entity> getEntitesList();

      S2C_Battle_Entity getEntites(int index);

      int getEntitesCount();

      List<? extends S2C_Battle_EntityOrBuilder> getEntitesOrBuilderList();

      S2C_Battle_EntityOrBuilder getEntitesOrBuilder(int index);

      List<S2C_Battle_Entity> getPlotEntitesList();

      S2C_Battle_Entity getPlotEntites(int index);

      int getPlotEntitesCount();

      List<? extends S2C_Battle_EntityOrBuilder> getPlotEntitesOrBuilderList();

      S2C_Battle_EntityOrBuilder getPlotEntitesOrBuilder(int index);

      boolean hasCombatPower();

      long getCombatPower();

      boolean hasPvpRank();

      int getPvpRank();

      List<PlayerMsg.PropertyCell> getPlayerInfosList();

      PlayerMsg.PropertyCell getPlayerInfos(int index);

      int getPlayerInfosCount();

      List<? extends PlayerMsg.PropertyCellOrBuilder> getPlayerInfosOrBuilderList();

      PlayerMsg.PropertyCellOrBuilder getPlayerInfosOrBuilder(int index);

      boolean hasPvpScoreChange();

      int getPvpScoreChange();

      boolean hasFriendState();

      int getFriendState();

      List<Integer> getCooperateBeautyList();

      int getCooperateBeautyCount();

      int getCooperateBeauty(int index);

      List<Integer> getCooperateBeautySkillList();

      int getCooperateBeautySkillCount();

      int getCooperateBeautySkill(int index);

      boolean hasFriendNation();

      int getFriendNation();

      List<S2C_Battle_Entity> getPetList();

      S2C_Battle_Entity getPet(int index);

      int getPetCount();

      List<? extends S2C_Battle_EntityOrBuilder> getPetOrBuilderList();

      S2C_Battle_EntityOrBuilder getPetOrBuilder(int index);
   }

   public interface S2C_Battle_ResultOrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      List<Battle_Result_Value> getDamageList();

      Battle_Result_Value getDamage(int index);

      int getDamageCount();

      List<? extends Battle_Result_ValueOrBuilder> getDamageOrBuilderList();

      Battle_Result_ValueOrBuilder getDamageOrBuilder(int index);

      List<Battle_Result_Value> getRecoverList();

      Battle_Result_Value getRecover(int index);

      int getRecoverCount();

      List<? extends Battle_Result_ValueOrBuilder> getRecoverOrBuilderList();

      Battle_Result_ValueOrBuilder getRecoverOrBuilder(int index);

      List<Battle_Result_Value> getHurtList();

      Battle_Result_Value getHurt(int index);

      int getHurtCount();

      List<? extends Battle_Result_ValueOrBuilder> getHurtOrBuilderList();

      Battle_Result_ValueOrBuilder getHurtOrBuilder(int index);

      boolean hasRecordId();

      int getRecordId();

      boolean hasRound();

      int getRound();

      boolean hasPlayerLv();

      int getPlayerLv();

      boolean hasPlayerExp();

      int getPlayerExp();

      List<CommonMsg.ItemInfo> getAwardItemsList();

      CommonMsg.ItemInfo getAwardItems(int index);

      int getAwardItemsCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getAwardItemsOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getAwardItemsOrBuilder(int index);

      List<S2C_Team_Info> getTeamInfosList();

      S2C_Team_Info getTeamInfos(int index);

      int getTeamInfosCount();

      List<? extends S2C_Team_InfoOrBuilder> getTeamInfosOrBuilderList();

      S2C_Team_InfoOrBuilder getTeamInfosOrBuilder(int index);

      boolean hasNextRecordId();

      int getNextRecordId();

      List<Long> getSettleInfoList();

      int getSettleInfoCount();

      long getSettleInfo(int index);

      boolean hasIsMaxRoundEnd();

      boolean getIsMaxRoundEnd();
   }

   public interface S2C_Battle_RoundOrBuilder extends MessageOrBuilder {
      boolean hasRound();

      int getRound();

      List<S2C_Battle_Action> getActionsList();

      S2C_Battle_Action getActions(int index);

      int getActionsCount();

      List<? extends S2C_Battle_ActionOrBuilder> getActionsOrBuilderList();

      S2C_Battle_ActionOrBuilder getActionsOrBuilder(int index);
   }

   public interface S2C_TeamMember_InfoOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasLv();

      int getLv();

      boolean hasHead();

      int getHead();

      boolean hasHeadFrame();

      int getHeadFrame();
   }

   public interface S2C_Team_InfoOrBuilder extends MessageOrBuilder {
      boolean hasTeamId();

      int getTeamId();

      boolean hasTeamName();

      String getTeamName();

      ByteString getTeamNameBytes();

      List<S2C_TeamMember_Info> getMembersList();

      S2C_TeamMember_Info getMembers(int index);

      int getMembersCount();

      List<? extends S2C_TeamMember_InfoOrBuilder> getMembersOrBuilderList();

      S2C_TeamMember_InfoOrBuilder getMembersOrBuilder(int index);

      boolean hasScore();

      int getScore();

      boolean hasRank();

      int getRank();

      boolean hasIntegral();

      int getIntegral();

      boolean hasChangeRank();

      int getChangeRank();

      boolean hasChangeIntegral();

      int getChangeIntegral();

      boolean hasServer();

      int getServer();

      boolean hasPower();

      long getPower();
   }

   public interface S2C_Totem_InfoOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasBreachLv();

      int getBreachLv();

      boolean hasLevel();

      int getLevel();
   }
}
