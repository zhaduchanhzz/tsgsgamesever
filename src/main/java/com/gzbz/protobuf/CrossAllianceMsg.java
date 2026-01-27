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

public final class CrossAllianceMsg {
   private static final Descriptors.Descriptor internal_static_crossAlliance_com_gzbz_protobuf_SignArrayingInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossAlliance_com_gzbz_protobuf_SignArrayingInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceSign_11801_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceSign_11801_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossAlliance_com_gzbz_protobuf_CR2S_AllianceSign_11802_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossAlliance_com_gzbz_protobuf_CR2S_AllianceSign_11802_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceChallengeTeams_11803_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceChallengeTeams_11803_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceTeamInfo_11804_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceTeamInfo_11804_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceRank_11805_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceRank_11805_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossAlliance_com_gzbz_protobuf_S2CR_ServerInit_11806_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossAlliance_com_gzbz_protobuf_S2CR_ServerInit_11806_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossAlliance_com_gzbz_protobuf_CR2S_ServerInit_11807_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossAlliance_com_gzbz_protobuf_CR2S_ServerInit_11807_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamArrayingSave_11808_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamArrayingSave_11808_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamArrayingSave_11809_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamArrayingSave_11809_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamChallenge_11810_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamChallenge_11810_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamChallenge_11811_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamChallenge_11811_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceGm_11812_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceGm_11812_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamBeChallenge_11813_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamBeChallenge_11813_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamInfo_11814_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamInfo_11814_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamInfo_11815_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamInfo_11815_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossAlliance_com_gzbz_protobuf_CR2S_RankReward_11816_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossAlliance_com_gzbz_protobuf_CR2S_RankReward_11816_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossAlliance_com_gzbz_protobuf_S2CR_RankReward_11817_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossAlliance_com_gzbz_protobuf_S2CR_RankReward_11817_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossAlliance_com_gzbz_protobuf_CR2S_CreateRobot_11818_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossAlliance_com_gzbz_protobuf_CR2S_CreateRobot_11818_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamNameChange_11819_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamNameChange_11819_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossAlliance_com_gzbz_protobuf_S2CR_UploadArraying_11820_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossAlliance_com_gzbz_protobuf_S2CR_UploadArraying_11820_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private CrossAllianceMsg() {
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
      String[] descriptorData = new String[]{"\n\u0013CrossAlliance.proto\u0012\u001fcrossAlliance.com.gzbz.protobuf\u001a\u000eAlliance.proto\u001a\fBattle.proto\u001a\nRank.proto\"\u0085\u0001\n\u0010SignArrayingInfo\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006isHide\u0018\u0002 \u0002(\b\u0012\u0014\n\farrayingData\u0018\u0003 \u0002(\f\u00129\n\u0005robot\u0018\u0004 \u0001(\u000b2*.alliance.com.gzbz.protobuf.TeamPlayerInfo\"È\u0001\n\u0017S2CR_AllianceSign_11801\u0012\u000e\n\u0006teamId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007captain\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bteamName\u0018\u0003 \u0002(\t\u0012\r\n\u0005power\u0018\u0004 \u0002(\u0003\u0012\u0010\n\bisCancel\u0018\u0005 \u0002(\b\u0012\u0010\n\bintegral\u0018\u0006 \u0002(\u0005\u0012G\n\farrayingList\u0018\u0007 \u0003(\u000b21.crossAlliance.com.gzbz.protobuf.SignArrayingInfo\";\n\u0017CR2S_AllianceSign_11802\u0012\u000e\n\u0006teamId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bisCancel\u0018\u0002 \u0002(\b\"3\n!S2CR_AllianceChallengeTeams_11803\u0012\u000e\n\u0006teamId\u0018\u0001 \u0002(\u0005\"-\n\u001bS2CR_AllianceTeamInfo_11804\u0012\u000e\n\u0006teamId\u0018\u0001 \u0002(\u0005\")\n\u0017S2CR_AllianceRank_11805\u0012\u000e\n\u0006teamId\u0018\u0001 \u0002(\u0005\"\u0017\n\u0015S2CR_ServerInit_11806\"v\n\u0015CR2S_ServerInit_11807\u0012\u000e\n\u0006status\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0002 \u0002(\u0005\u0012\u0017\n\u000fseasonStartTime\u0018\u0003 \u0002(\u0005\u0012\u0015\n\rseasonEndTime\u0018\u0004 \u0002(\u0005\u0012\f\n\u0004isGm\u0018\u0005 \u0002(\b\"q\n\u001bS2CR_TeamArrayingSave_11808\u0012\u000e\n\u0006teamId\u0018\u0001 \u0002(\u0005\u0012B\n\nplayerList\u0018\u0002 \u0003(\u000b2..alliance.com.gzbz.protobuf.TeamPlayerHideInfo\"q\n\u001bCR2S_TeamArrayingSave_11809\u0012\u000e\n\u0006teamId\u0018\u0001 \u0002(\u0005\u0012B\n\nplayerList\u0018\u0002 \u0003(\u000b2..alliance.com.gzbz.protobuf.TeamPlayerHideInfo\"\u008c\u0001\n\u0018S2CR_TeamChallenge_11810\u0012\u000e\n\u0006teamId\u0018\u0001 \u0002(\u0005\u0012\u0017\n\u000fchallengeTeamId\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006isSkip\u0018\u0003 \u0002(\b\u0012\u0014\n\farrayingList\u0018\u0004 \u0003(\f\u0012\u000f\n\u0007groupId\u0018\u0005 \u0002(\u0005\u0012\u0010\n\brecordId\u0018\u0006 \u0001(\u0005\"ô\u0001\n\u0018CR2S_TeamChallenge_11811\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006teamId\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006isSkip\u0018\u0003 \u0001(\b\u0012B\n\tbattleMsg\u0018\u0004 \u0001(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\u0012D\n\nrecordInfo\u0018\u0005 \u0001(\u000b20.alliance.com.gzbz.protobuf.TeamBattleRecordInfo\u0012\f\n\u0004rank\u0018\u0006 \u0001(\u0005\u0012\u0010\n\bintegral\u0018\u0007 \u0001(\u0005\"4\n\u0015S2CR_AllianceGm_11812\u0012\u000b\n\u0003cmd\u0018\u0001 \u0002(\t\u0012\u000e\n\u0006params\u0018\u0002 \u0003(\u0005\"\u0092\u0001\n\u001aCR2S_TeamBeChallenge_11813\u0012\u000e\n\u0006teamId\u0018\u0001 \u0002(\u0005\u0012D\n\nrecordInfo\u0018\u0002 \u0002(\u000b20.alliance.com.gzbz.protobuf.TeamBattleRecordInfo\u0012\f\n\u0004rank\u0018\u0003 \u0002(\u0005\u0012\u0010\n\bintegral\u0018\u0004 \u0002(\u0005\"%\n\u0013S2CR_TeamInfo_11814\u0012\u000e\n\u0006teamId\u0018\u0001 \u0002(\u0005\"M\n\u0013CR2S_TeamInfo_11815\u00126\n\bteamInfo\u0018\u0001 \u0001(\u000b2$.alliance.com.gzbz.protobuf.TeamInfo\"X\n\u0015CR2S_RankReward_11816\u0012/\n\u0005ranks\u0018\u0001 \u0003(\u000b2 .rank.com.gzbz.protobuf.RankData\u0012\u000e\n\u0006normal\u0018\u0002 \u0002(\b\"(\n\u0015S2CR_RankReward_11817\u0012\u000f\n\u0007teamIds\u0018\u0001 \u0003(\u0005\"\u0018\n\u0016CR2S_CreateRobot_11818\"=\n\u0019S2CR_TeamNameChange_11819\u0012\u000e\n\u0006teamId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bteamName\u0018\u0002 \u0002(\t\"A\n\u0019S2CR_UploadArraying_11820\u0012\u000e\n\u0006teamId\u0018\u0001 \u0002(\u0005\u0012\u0014\n\farrayingData\u0018\u0002 \u0002(\fB'\n\u0011com.gzbz.protobufB\u0010CrossAllianceMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{AllianceMsg.getDescriptor(), BattleMsg.getDescriptor(), RankMsg.getDescriptor()});
      internal_static_crossAlliance_com_gzbz_protobuf_SignArrayingInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_crossAlliance_com_gzbz_protobuf_SignArrayingInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossAlliance_com_gzbz_protobuf_SignArrayingInfo_descriptor, new String[]{"PlayerId", "IsHide", "ArrayingData", "Robot"});
      internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceSign_11801_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceSign_11801_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceSign_11801_descriptor, new String[]{"TeamId", "Captain", "TeamName", "Power", "IsCancel", "Integral", "ArrayingList"});
      internal_static_crossAlliance_com_gzbz_protobuf_CR2S_AllianceSign_11802_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_crossAlliance_com_gzbz_protobuf_CR2S_AllianceSign_11802_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossAlliance_com_gzbz_protobuf_CR2S_AllianceSign_11802_descriptor, new String[]{"TeamId", "IsCancel"});
      internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceChallengeTeams_11803_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceChallengeTeams_11803_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceChallengeTeams_11803_descriptor, new String[]{"TeamId"});
      internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceTeamInfo_11804_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceTeamInfo_11804_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceTeamInfo_11804_descriptor, new String[]{"TeamId"});
      internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceRank_11805_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceRank_11805_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceRank_11805_descriptor, new String[]{"TeamId"});
      internal_static_crossAlliance_com_gzbz_protobuf_S2CR_ServerInit_11806_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_crossAlliance_com_gzbz_protobuf_S2CR_ServerInit_11806_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossAlliance_com_gzbz_protobuf_S2CR_ServerInit_11806_descriptor, new String[0]);
      internal_static_crossAlliance_com_gzbz_protobuf_CR2S_ServerInit_11807_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_crossAlliance_com_gzbz_protobuf_CR2S_ServerInit_11807_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossAlliance_com_gzbz_protobuf_CR2S_ServerInit_11807_descriptor, new String[]{"Status", "EndTime", "SeasonStartTime", "SeasonEndTime", "IsGm"});
      internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamArrayingSave_11808_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamArrayingSave_11808_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamArrayingSave_11808_descriptor, new String[]{"TeamId", "PlayerList"});
      internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamArrayingSave_11809_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamArrayingSave_11809_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamArrayingSave_11809_descriptor, new String[]{"TeamId", "PlayerList"});
      internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamChallenge_11810_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamChallenge_11810_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamChallenge_11810_descriptor, new String[]{"TeamId", "ChallengeTeamId", "IsSkip", "ArrayingList", "GroupId", "RecordId"});
      internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamChallenge_11811_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamChallenge_11811_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamChallenge_11811_descriptor, new String[]{"Result", "TeamId", "IsSkip", "BattleMsg", "RecordInfo", "Rank", "Integral"});
      internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceGm_11812_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceGm_11812_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceGm_11812_descriptor, new String[]{"Cmd", "Params"});
      internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamBeChallenge_11813_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamBeChallenge_11813_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamBeChallenge_11813_descriptor, new String[]{"TeamId", "RecordInfo", "Rank", "Integral"});
      internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamInfo_11814_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamInfo_11814_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamInfo_11814_descriptor, new String[]{"TeamId"});
      internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamInfo_11815_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamInfo_11815_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamInfo_11815_descriptor, new String[]{"TeamInfo"});
      internal_static_crossAlliance_com_gzbz_protobuf_CR2S_RankReward_11816_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_crossAlliance_com_gzbz_protobuf_CR2S_RankReward_11816_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossAlliance_com_gzbz_protobuf_CR2S_RankReward_11816_descriptor, new String[]{"Ranks", "Normal"});
      internal_static_crossAlliance_com_gzbz_protobuf_S2CR_RankReward_11817_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_crossAlliance_com_gzbz_protobuf_S2CR_RankReward_11817_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossAlliance_com_gzbz_protobuf_S2CR_RankReward_11817_descriptor, new String[]{"TeamIds"});
      internal_static_crossAlliance_com_gzbz_protobuf_CR2S_CreateRobot_11818_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_crossAlliance_com_gzbz_protobuf_CR2S_CreateRobot_11818_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossAlliance_com_gzbz_protobuf_CR2S_CreateRobot_11818_descriptor, new String[0]);
      internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamNameChange_11819_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamNameChange_11819_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamNameChange_11819_descriptor, new String[]{"TeamId", "TeamName"});
      internal_static_crossAlliance_com_gzbz_protobuf_S2CR_UploadArraying_11820_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_crossAlliance_com_gzbz_protobuf_S2CR_UploadArraying_11820_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossAlliance_com_gzbz_protobuf_S2CR_UploadArraying_11820_descriptor, new String[]{"TeamId", "ArrayingData"});
      AllianceMsg.getDescriptor();
      BattleMsg.getDescriptor();
      RankMsg.getDescriptor();
   }

   public static final class SignArrayingInfo extends GeneratedMessageV3 implements SignArrayingInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int ISHIDE_FIELD_NUMBER = 2;
      private boolean isHide_;
      public static final int ARRAYINGDATA_FIELD_NUMBER = 3;
      private ByteString arrayingData_;
      public static final int ROBOT_FIELD_NUMBER = 4;
      private AllianceMsg.TeamPlayerInfo robot_;
      private byte memoizedIsInitialized;
      private static final SignArrayingInfo DEFAULT_INSTANCE = new SignArrayingInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<SignArrayingInfo> PARSER = new AbstractParser<SignArrayingInfo>() {
         public SignArrayingInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new SignArrayingInfo(input, extensionRegistry);
         }
      };

      private SignArrayingInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private SignArrayingInfo() {
         this.memoizedIsInitialized = -1;
         this.arrayingData_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new SignArrayingInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private SignArrayingInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.isHide_ = input.readBool();
                        break;
                     case 26:
                        this.bitField0_ |= 4;
                        this.arrayingData_ = input.readBytes();
                        break;
                     case 34:
                        AllianceMsg.TeamPlayerInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 8) != 0) {
                           subBuilder = this.robot_.toBuilder();
                        }

                        this.robot_ = (AllianceMsg.TeamPlayerInfo)input.readMessage(AllianceMsg.TeamPlayerInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.robot_);
                           this.robot_ = subBuilder.buildPartial();
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
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_SignArrayingInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_SignArrayingInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SignArrayingInfo.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasIsHide() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsHide() {
         return this.isHide_;
      }

      public boolean hasArrayingData() {
         return (this.bitField0_ & 4) != 0;
      }

      public ByteString getArrayingData() {
         return this.arrayingData_;
      }

      public boolean hasRobot() {
         return (this.bitField0_ & 8) != 0;
      }

      public AllianceMsg.TeamPlayerInfo getRobot() {
         return this.robot_ == null ? AllianceMsg.TeamPlayerInfo.getDefaultInstance() : this.robot_;
      }

      public AllianceMsg.TeamPlayerInfoOrBuilder getRobotOrBuilder() {
         return this.robot_ == null ? AllianceMsg.TeamPlayerInfo.getDefaultInstance() : this.robot_;
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
         } else if (!this.hasIsHide()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasArrayingData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasRobot() && !this.getRobot().isInitialized()) {
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
            output.writeBool(2, this.isHide_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBytes(3, this.arrayingData_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeMessage(4, this.getRobot());
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
               size += CodedOutputStream.computeBoolSize(2, this.isHide_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBytesSize(3, this.arrayingData_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeMessageSize(4, this.getRobot());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof SignArrayingInfo)) {
            return super.equals(obj);
         } else {
            SignArrayingInfo other = (SignArrayingInfo)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasIsHide() != other.hasIsHide()) {
               return false;
            } else if (this.hasIsHide() && this.getIsHide() != other.getIsHide()) {
               return false;
            } else if (this.hasArrayingData() != other.hasArrayingData()) {
               return false;
            } else if (this.hasArrayingData() && !this.getArrayingData().equals(other.getArrayingData())) {
               return false;
            } else if (this.hasRobot() != other.hasRobot()) {
               return false;
            } else if (this.hasRobot() && !this.getRobot().equals(other.getRobot())) {
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

            if (this.hasIsHide()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsHide());
            }

            if (this.hasArrayingData()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getArrayingData().hashCode();
            }

            if (this.hasRobot()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getRobot().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static SignArrayingInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (SignArrayingInfo)PARSER.parseFrom(data);
      }

      public static SignArrayingInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SignArrayingInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SignArrayingInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (SignArrayingInfo)PARSER.parseFrom(data);
      }

      public static SignArrayingInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SignArrayingInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SignArrayingInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (SignArrayingInfo)PARSER.parseFrom(data);
      }

      public static SignArrayingInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SignArrayingInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SignArrayingInfo parseFrom(InputStream input) throws IOException {
         return (SignArrayingInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SignArrayingInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SignArrayingInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static SignArrayingInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (SignArrayingInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static SignArrayingInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SignArrayingInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static SignArrayingInfo parseFrom(CodedInputStream input) throws IOException {
         return (SignArrayingInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SignArrayingInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SignArrayingInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(SignArrayingInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static SignArrayingInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<SignArrayingInfo> parser() {
         return PARSER;
      }

      public Parser<SignArrayingInfo> getParserForType() {
         return PARSER;
      }

      public SignArrayingInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SignArrayingInfoOrBuilder {
         private int bitField0_;
         private int playerId_;
         private boolean isHide_;
         private ByteString arrayingData_;
         private AllianceMsg.TeamPlayerInfo robot_;
         private SingleFieldBuilderV3<AllianceMsg.TeamPlayerInfo, AllianceMsg.TeamPlayerInfo.Builder, AllianceMsg.TeamPlayerInfoOrBuilder> robotBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_SignArrayingInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_SignArrayingInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SignArrayingInfo.class, Builder.class);
         }

         private Builder() {
            this.arrayingData_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.arrayingData_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossAllianceMsg.SignArrayingInfo.alwaysUseFieldBuilders) {
               this.getRobotFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.isHide_ = false;
            this.bitField0_ &= -3;
            this.arrayingData_ = ByteString.EMPTY;
            this.bitField0_ &= -5;
            if (this.robotBuilder_ == null) {
               this.robot_ = null;
            } else {
               this.robotBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_SignArrayingInfo_descriptor;
         }

         public SignArrayingInfo getDefaultInstanceForType() {
            return CrossAllianceMsg.SignArrayingInfo.getDefaultInstance();
         }

         public SignArrayingInfo build() {
            SignArrayingInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public SignArrayingInfo buildPartial() {
            SignArrayingInfo result = new SignArrayingInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isHide_ = this.isHide_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.arrayingData_ = this.arrayingData_;
            if ((from_bitField0_ & 8) != 0) {
               if (this.robotBuilder_ == null) {
                  result.robot_ = this.robot_;
               } else {
                  result.robot_ = (AllianceMsg.TeamPlayerInfo)this.robotBuilder_.build();
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
            if (other instanceof SignArrayingInfo) {
               return this.mergeFrom((SignArrayingInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(SignArrayingInfo other) {
            if (other == CrossAllianceMsg.SignArrayingInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasIsHide()) {
                  this.setIsHide(other.getIsHide());
               }

               if (other.hasArrayingData()) {
                  this.setArrayingData(other.getArrayingData());
               }

               if (other.hasRobot()) {
                  this.mergeRobot(other.getRobot());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasIsHide()) {
               return false;
            } else if (!this.hasArrayingData()) {
               return false;
            } else {
               return !this.hasRobot() || this.getRobot().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            SignArrayingInfo parsedMessage = null;

            try {
               parsedMessage = (SignArrayingInfo)CrossAllianceMsg.SignArrayingInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (SignArrayingInfo)e.getUnfinishedMessage();
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

         public boolean hasIsHide() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsHide() {
            return this.isHide_;
         }

         public Builder setIsHide(boolean value) {
            this.bitField0_ |= 2;
            this.isHide_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsHide() {
            this.bitField0_ &= -3;
            this.isHide_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasArrayingData() {
            return (this.bitField0_ & 4) != 0;
         }

         public ByteString getArrayingData() {
            return this.arrayingData_;
         }

         public Builder setArrayingData(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.arrayingData_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearArrayingData() {
            this.bitField0_ &= -5;
            this.arrayingData_ = CrossAllianceMsg.SignArrayingInfo.getDefaultInstance().getArrayingData();
            this.onChanged();
            return this;
         }

         public boolean hasRobot() {
            return (this.bitField0_ & 8) != 0;
         }

         public AllianceMsg.TeamPlayerInfo getRobot() {
            if (this.robotBuilder_ == null) {
               return this.robot_ == null ? AllianceMsg.TeamPlayerInfo.getDefaultInstance() : this.robot_;
            } else {
               return (AllianceMsg.TeamPlayerInfo)this.robotBuilder_.getMessage();
            }
         }

         public Builder setRobot(AllianceMsg.TeamPlayerInfo value) {
            if (this.robotBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.robot_ = value;
               this.onChanged();
            } else {
               this.robotBuilder_.setMessage(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder setRobot(AllianceMsg.TeamPlayerInfo.Builder builderForValue) {
            if (this.robotBuilder_ == null) {
               this.robot_ = builderForValue.build();
               this.onChanged();
            } else {
               this.robotBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder mergeRobot(AllianceMsg.TeamPlayerInfo value) {
            if (this.robotBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0 && this.robot_ != null && this.robot_ != AllianceMsg.TeamPlayerInfo.getDefaultInstance()) {
                  this.robot_ = AllianceMsg.TeamPlayerInfo.newBuilder(this.robot_).mergeFrom(value).buildPartial();
               } else {
                  this.robot_ = value;
               }

               this.onChanged();
            } else {
               this.robotBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder clearRobot() {
            if (this.robotBuilder_ == null) {
               this.robot_ = null;
               this.onChanged();
            } else {
               this.robotBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public AllianceMsg.TeamPlayerInfo.Builder getRobotBuilder() {
            this.bitField0_ |= 8;
            this.onChanged();
            return (AllianceMsg.TeamPlayerInfo.Builder)this.getRobotFieldBuilder().getBuilder();
         }

         public AllianceMsg.TeamPlayerInfoOrBuilder getRobotOrBuilder() {
            if (this.robotBuilder_ != null) {
               return (AllianceMsg.TeamPlayerInfoOrBuilder)this.robotBuilder_.getMessageOrBuilder();
            } else {
               return this.robot_ == null ? AllianceMsg.TeamPlayerInfo.getDefaultInstance() : this.robot_;
            }
         }

         private SingleFieldBuilderV3<AllianceMsg.TeamPlayerInfo, AllianceMsg.TeamPlayerInfo.Builder, AllianceMsg.TeamPlayerInfoOrBuilder> getRobotFieldBuilder() {
            if (this.robotBuilder_ == null) {
               this.robotBuilder_ = new SingleFieldBuilderV3(this.getRobot(), this.getParentForChildren(), this.isClean());
               this.robot_ = null;
            }

            return this.robotBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_AllianceSign_11801 extends GeneratedMessageV3 implements S2CR_AllianceSign_11801OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TEAMID_FIELD_NUMBER = 1;
      private int teamId_;
      public static final int CAPTAIN_FIELD_NUMBER = 2;
      private int captain_;
      public static final int TEAMNAME_FIELD_NUMBER = 3;
      private volatile Object teamName_;
      public static final int POWER_FIELD_NUMBER = 4;
      private long power_;
      public static final int ISCANCEL_FIELD_NUMBER = 5;
      private boolean isCancel_;
      public static final int INTEGRAL_FIELD_NUMBER = 6;
      private int integral_;
      public static final int ARRAYINGLIST_FIELD_NUMBER = 7;
      private List<SignArrayingInfo> arrayingList_;
      private byte memoizedIsInitialized;
      private static final S2CR_AllianceSign_11801 DEFAULT_INSTANCE = new S2CR_AllianceSign_11801();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_AllianceSign_11801> PARSER = new AbstractParser<S2CR_AllianceSign_11801>() {
         public S2CR_AllianceSign_11801 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_AllianceSign_11801(input, extensionRegistry);
         }
      };

      private S2CR_AllianceSign_11801(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_AllianceSign_11801() {
         this.memoizedIsInitialized = -1;
         this.teamName_ = "";
         this.arrayingList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_AllianceSign_11801();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_AllianceSign_11801(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.captain_ = input.readInt32();
                        break;
                     case 26:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.teamName_ = bs;
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.power_ = input.readInt64();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.isCancel_ = input.readBool();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.integral_ = input.readInt32();
                        break;
                     case 58:
                        if ((mutable_bitField0_ & 64) == 0) {
                           this.arrayingList_ = new ArrayList();
                           mutable_bitField0_ |= 64;
                        }

                        this.arrayingList_.add(input.readMessage(CrossAllianceMsg.SignArrayingInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 64) != 0) {
                  this.arrayingList_ = Collections.unmodifiableList(this.arrayingList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceSign_11801_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceSign_11801_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_AllianceSign_11801.class, Builder.class);
      }

      public boolean hasTeamId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTeamId() {
         return this.teamId_;
      }

      public boolean hasCaptain() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCaptain() {
         return this.captain_;
      }

      public boolean hasTeamName() {
         return (this.bitField0_ & 4) != 0;
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

      public boolean hasPower() {
         return (this.bitField0_ & 8) != 0;
      }

      public long getPower() {
         return this.power_;
      }

      public boolean hasIsCancel() {
         return (this.bitField0_ & 16) != 0;
      }

      public boolean getIsCancel() {
         return this.isCancel_;
      }

      public boolean hasIntegral() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getIntegral() {
         return this.integral_;
      }

      public List<SignArrayingInfo> getArrayingListList() {
         return this.arrayingList_;
      }

      public List<? extends SignArrayingInfoOrBuilder> getArrayingListOrBuilderList() {
         return this.arrayingList_;
      }

      public int getArrayingListCount() {
         return this.arrayingList_.size();
      }

      public SignArrayingInfo getArrayingList(int index) {
         return (SignArrayingInfo)this.arrayingList_.get(index);
      }

      public SignArrayingInfoOrBuilder getArrayingListOrBuilder(int index) {
         return (SignArrayingInfoOrBuilder)this.arrayingList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTeamId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCaptain()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTeamName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPower()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsCancel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIntegral()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getArrayingListCount(); ++i) {
               if (!this.getArrayingList(i).isInitialized()) {
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
            output.writeInt32(1, this.teamId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.captain_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.teamName_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt64(4, this.power_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeBool(5, this.isCancel_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.integral_);
         }

         for(int i = 0; i < this.arrayingList_.size(); ++i) {
            output.writeMessage(7, (MessageLite)this.arrayingList_.get(i));
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
               size += CodedOutputStream.computeInt32Size(2, this.captain_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.teamName_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt64Size(4, this.power_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeBoolSize(5, this.isCancel_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.integral_);
            }

            for(int i = 0; i < this.arrayingList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(7, (MessageLite)this.arrayingList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_AllianceSign_11801)) {
            return super.equals(obj);
         } else {
            S2CR_AllianceSign_11801 other = (S2CR_AllianceSign_11801)obj;
            if (this.hasTeamId() != other.hasTeamId()) {
               return false;
            } else if (this.hasTeamId() && this.getTeamId() != other.getTeamId()) {
               return false;
            } else if (this.hasCaptain() != other.hasCaptain()) {
               return false;
            } else if (this.hasCaptain() && this.getCaptain() != other.getCaptain()) {
               return false;
            } else if (this.hasTeamName() != other.hasTeamName()) {
               return false;
            } else if (this.hasTeamName() && !this.getTeamName().equals(other.getTeamName())) {
               return false;
            } else if (this.hasPower() != other.hasPower()) {
               return false;
            } else if (this.hasPower() && this.getPower() != other.getPower()) {
               return false;
            } else if (this.hasIsCancel() != other.hasIsCancel()) {
               return false;
            } else if (this.hasIsCancel() && this.getIsCancel() != other.getIsCancel()) {
               return false;
            } else if (this.hasIntegral() != other.hasIntegral()) {
               return false;
            } else if (this.hasIntegral() && this.getIntegral() != other.getIntegral()) {
               return false;
            } else if (!this.getArrayingListList().equals(other.getArrayingListList())) {
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

            if (this.hasCaptain()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCaptain();
            }

            if (this.hasTeamName()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTeamName().hashCode();
            }

            if (this.hasPower()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashLong(this.getPower());
            }

            if (this.hasIsCancel()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashBoolean(this.getIsCancel());
            }

            if (this.hasIntegral()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getIntegral();
            }

            if (this.getArrayingListCount() > 0) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getArrayingListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_AllianceSign_11801 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_AllianceSign_11801)PARSER.parseFrom(data);
      }

      public static S2CR_AllianceSign_11801 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AllianceSign_11801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AllianceSign_11801 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_AllianceSign_11801)PARSER.parseFrom(data);
      }

      public static S2CR_AllianceSign_11801 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AllianceSign_11801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AllianceSign_11801 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_AllianceSign_11801)PARSER.parseFrom(data);
      }

      public static S2CR_AllianceSign_11801 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AllianceSign_11801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AllianceSign_11801 parseFrom(InputStream input) throws IOException {
         return (S2CR_AllianceSign_11801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_AllianceSign_11801 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AllianceSign_11801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_AllianceSign_11801 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_AllianceSign_11801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_AllianceSign_11801 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AllianceSign_11801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_AllianceSign_11801 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_AllianceSign_11801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_AllianceSign_11801 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AllianceSign_11801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_AllianceSign_11801 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_AllianceSign_11801 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_AllianceSign_11801> parser() {
         return PARSER;
      }

      public Parser<S2CR_AllianceSign_11801> getParserForType() {
         return PARSER;
      }

      public S2CR_AllianceSign_11801 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_AllianceSign_11801OrBuilder {
         private int bitField0_;
         private int teamId_;
         private int captain_;
         private Object teamName_;
         private long power_;
         private boolean isCancel_;
         private int integral_;
         private List<SignArrayingInfo> arrayingList_;
         private RepeatedFieldBuilderV3<SignArrayingInfo, SignArrayingInfo.Builder, SignArrayingInfoOrBuilder> arrayingListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceSign_11801_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceSign_11801_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_AllianceSign_11801.class, Builder.class);
         }

         private Builder() {
            this.teamName_ = "";
            this.arrayingList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.teamName_ = "";
            this.arrayingList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossAllianceMsg.S2CR_AllianceSign_11801.alwaysUseFieldBuilders) {
               this.getArrayingListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.teamId_ = 0;
            this.bitField0_ &= -2;
            this.captain_ = 0;
            this.bitField0_ &= -3;
            this.teamName_ = "";
            this.bitField0_ &= -5;
            this.power_ = 0L;
            this.bitField0_ &= -9;
            this.isCancel_ = false;
            this.bitField0_ &= -17;
            this.integral_ = 0;
            this.bitField0_ &= -33;
            if (this.arrayingListBuilder_ == null) {
               this.arrayingList_ = Collections.emptyList();
               this.bitField0_ &= -65;
            } else {
               this.arrayingListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceSign_11801_descriptor;
         }

         public S2CR_AllianceSign_11801 getDefaultInstanceForType() {
            return CrossAllianceMsg.S2CR_AllianceSign_11801.getDefaultInstance();
         }

         public S2CR_AllianceSign_11801 build() {
            S2CR_AllianceSign_11801 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_AllianceSign_11801 buildPartial() {
            S2CR_AllianceSign_11801 result = new S2CR_AllianceSign_11801(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.teamId_ = this.teamId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.captain_ = this.captain_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.teamName_ = this.teamName_;
            if ((from_bitField0_ & 8) != 0) {
               result.power_ = this.power_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.isCancel_ = this.isCancel_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.integral_ = this.integral_;
               to_bitField0_ |= 32;
            }

            if (this.arrayingListBuilder_ == null) {
               if ((this.bitField0_ & 64) != 0) {
                  this.arrayingList_ = Collections.unmodifiableList(this.arrayingList_);
                  this.bitField0_ &= -65;
               }

               result.arrayingList_ = this.arrayingList_;
            } else {
               result.arrayingList_ = this.arrayingListBuilder_.build();
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
            if (other instanceof S2CR_AllianceSign_11801) {
               return this.mergeFrom((S2CR_AllianceSign_11801)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_AllianceSign_11801 other) {
            if (other == CrossAllianceMsg.S2CR_AllianceSign_11801.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTeamId()) {
                  this.setTeamId(other.getTeamId());
               }

               if (other.hasCaptain()) {
                  this.setCaptain(other.getCaptain());
               }

               if (other.hasTeamName()) {
                  this.bitField0_ |= 4;
                  this.teamName_ = other.teamName_;
                  this.onChanged();
               }

               if (other.hasPower()) {
                  this.setPower(other.getPower());
               }

               if (other.hasIsCancel()) {
                  this.setIsCancel(other.getIsCancel());
               }

               if (other.hasIntegral()) {
                  this.setIntegral(other.getIntegral());
               }

               if (this.arrayingListBuilder_ == null) {
                  if (!other.arrayingList_.isEmpty()) {
                     if (this.arrayingList_.isEmpty()) {
                        this.arrayingList_ = other.arrayingList_;
                        this.bitField0_ &= -65;
                     } else {
                        this.ensureArrayingListIsMutable();
                        this.arrayingList_.addAll(other.arrayingList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.arrayingList_.isEmpty()) {
                  if (this.arrayingListBuilder_.isEmpty()) {
                     this.arrayingListBuilder_.dispose();
                     this.arrayingListBuilder_ = null;
                     this.arrayingList_ = other.arrayingList_;
                     this.bitField0_ &= -65;
                     this.arrayingListBuilder_ = CrossAllianceMsg.S2CR_AllianceSign_11801.alwaysUseFieldBuilders ? this.getArrayingListFieldBuilder() : null;
                  } else {
                     this.arrayingListBuilder_.addAllMessages(other.arrayingList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTeamId()) {
               return false;
            } else if (!this.hasCaptain()) {
               return false;
            } else if (!this.hasTeamName()) {
               return false;
            } else if (!this.hasPower()) {
               return false;
            } else if (!this.hasIsCancel()) {
               return false;
            } else if (!this.hasIntegral()) {
               return false;
            } else {
               for(int i = 0; i < this.getArrayingListCount(); ++i) {
                  if (!this.getArrayingList(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_AllianceSign_11801 parsedMessage = null;

            try {
               parsedMessage = (S2CR_AllianceSign_11801)CrossAllianceMsg.S2CR_AllianceSign_11801.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_AllianceSign_11801)e.getUnfinishedMessage();
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

         public boolean hasCaptain() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCaptain() {
            return this.captain_;
         }

         public Builder setCaptain(int value) {
            this.bitField0_ |= 2;
            this.captain_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCaptain() {
            this.bitField0_ &= -3;
            this.captain_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTeamName() {
            return (this.bitField0_ & 4) != 0;
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
               this.bitField0_ |= 4;
               this.teamName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearTeamName() {
            this.bitField0_ &= -5;
            this.teamName_ = CrossAllianceMsg.S2CR_AllianceSign_11801.getDefaultInstance().getTeamName();
            this.onChanged();
            return this;
         }

         public Builder setTeamNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.teamName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasPower() {
            return (this.bitField0_ & 8) != 0;
         }

         public long getPower() {
            return this.power_;
         }

         public Builder setPower(long value) {
            this.bitField0_ |= 8;
            this.power_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPower() {
            this.bitField0_ &= -9;
            this.power_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasIsCancel() {
            return (this.bitField0_ & 16) != 0;
         }

         public boolean getIsCancel() {
            return this.isCancel_;
         }

         public Builder setIsCancel(boolean value) {
            this.bitField0_ |= 16;
            this.isCancel_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsCancel() {
            this.bitField0_ &= -17;
            this.isCancel_ = false;
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

         private void ensureArrayingListIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
               this.arrayingList_ = new ArrayList(this.arrayingList_);
               this.bitField0_ |= 64;
            }

         }

         public List<SignArrayingInfo> getArrayingListList() {
            return this.arrayingListBuilder_ == null ? Collections.unmodifiableList(this.arrayingList_) : this.arrayingListBuilder_.getMessageList();
         }

         public int getArrayingListCount() {
            return this.arrayingListBuilder_ == null ? this.arrayingList_.size() : this.arrayingListBuilder_.getCount();
         }

         public SignArrayingInfo getArrayingList(int index) {
            return this.arrayingListBuilder_ == null ? (SignArrayingInfo)this.arrayingList_.get(index) : (SignArrayingInfo)this.arrayingListBuilder_.getMessage(index);
         }

         public Builder setArrayingList(int index, SignArrayingInfo value) {
            if (this.arrayingListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureArrayingListIsMutable();
               this.arrayingList_.set(index, value);
               this.onChanged();
            } else {
               this.arrayingListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setArrayingList(int index, SignArrayingInfo.Builder builderForValue) {
            if (this.arrayingListBuilder_ == null) {
               this.ensureArrayingListIsMutable();
               this.arrayingList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.arrayingListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addArrayingList(SignArrayingInfo value) {
            if (this.arrayingListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureArrayingListIsMutable();
               this.arrayingList_.add(value);
               this.onChanged();
            } else {
               this.arrayingListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addArrayingList(int index, SignArrayingInfo value) {
            if (this.arrayingListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureArrayingListIsMutable();
               this.arrayingList_.add(index, value);
               this.onChanged();
            } else {
               this.arrayingListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addArrayingList(SignArrayingInfo.Builder builderForValue) {
            if (this.arrayingListBuilder_ == null) {
               this.ensureArrayingListIsMutable();
               this.arrayingList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.arrayingListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addArrayingList(int index, SignArrayingInfo.Builder builderForValue) {
            if (this.arrayingListBuilder_ == null) {
               this.ensureArrayingListIsMutable();
               this.arrayingList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.arrayingListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllArrayingList(Iterable<? extends SignArrayingInfo> values) {
            if (this.arrayingListBuilder_ == null) {
               this.ensureArrayingListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.arrayingList_);
               this.onChanged();
            } else {
               this.arrayingListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearArrayingList() {
            if (this.arrayingListBuilder_ == null) {
               this.arrayingList_ = Collections.emptyList();
               this.bitField0_ &= -65;
               this.onChanged();
            } else {
               this.arrayingListBuilder_.clear();
            }

            return this;
         }

         public Builder removeArrayingList(int index) {
            if (this.arrayingListBuilder_ == null) {
               this.ensureArrayingListIsMutable();
               this.arrayingList_.remove(index);
               this.onChanged();
            } else {
               this.arrayingListBuilder_.remove(index);
            }

            return this;
         }

         public SignArrayingInfo.Builder getArrayingListBuilder(int index) {
            return (SignArrayingInfo.Builder)this.getArrayingListFieldBuilder().getBuilder(index);
         }

         public SignArrayingInfoOrBuilder getArrayingListOrBuilder(int index) {
            return this.arrayingListBuilder_ == null ? (SignArrayingInfoOrBuilder)this.arrayingList_.get(index) : (SignArrayingInfoOrBuilder)this.arrayingListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends SignArrayingInfoOrBuilder> getArrayingListOrBuilderList() {
            return this.arrayingListBuilder_ != null ? this.arrayingListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.arrayingList_);
         }

         public SignArrayingInfo.Builder addArrayingListBuilder() {
            return (SignArrayingInfo.Builder)this.getArrayingListFieldBuilder().addBuilder(CrossAllianceMsg.SignArrayingInfo.getDefaultInstance());
         }

         public SignArrayingInfo.Builder addArrayingListBuilder(int index) {
            return (SignArrayingInfo.Builder)this.getArrayingListFieldBuilder().addBuilder(index, CrossAllianceMsg.SignArrayingInfo.getDefaultInstance());
         }

         public List<SignArrayingInfo.Builder> getArrayingListBuilderList() {
            return this.getArrayingListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<SignArrayingInfo, SignArrayingInfo.Builder, SignArrayingInfoOrBuilder> getArrayingListFieldBuilder() {
            if (this.arrayingListBuilder_ == null) {
               this.arrayingListBuilder_ = new RepeatedFieldBuilderV3(this.arrayingList_, (this.bitField0_ & 64) != 0, this.getParentForChildren(), this.isClean());
               this.arrayingList_ = null;
            }

            return this.arrayingListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_AllianceSign_11802 extends GeneratedMessageV3 implements CR2S_AllianceSign_11802OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TEAMID_FIELD_NUMBER = 1;
      private int teamId_;
      public static final int ISCANCEL_FIELD_NUMBER = 2;
      private boolean isCancel_;
      private byte memoizedIsInitialized;
      private static final CR2S_AllianceSign_11802 DEFAULT_INSTANCE = new CR2S_AllianceSign_11802();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_AllianceSign_11802> PARSER = new AbstractParser<CR2S_AllianceSign_11802>() {
         public CR2S_AllianceSign_11802 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_AllianceSign_11802(input, extensionRegistry);
         }
      };

      private CR2S_AllianceSign_11802(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_AllianceSign_11802() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_AllianceSign_11802();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_AllianceSign_11802(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.isCancel_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_AllianceSign_11802_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_AllianceSign_11802_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_AllianceSign_11802.class, Builder.class);
      }

      public boolean hasTeamId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTeamId() {
         return this.teamId_;
      }

      public boolean hasIsCancel() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsCancel() {
         return this.isCancel_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTeamId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsCancel()) {
            this.memoizedIsInitialized = 0;
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
            output.writeBool(2, this.isCancel_);
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
               size += CodedOutputStream.computeBoolSize(2, this.isCancel_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_AllianceSign_11802)) {
            return super.equals(obj);
         } else {
            CR2S_AllianceSign_11802 other = (CR2S_AllianceSign_11802)obj;
            if (this.hasTeamId() != other.hasTeamId()) {
               return false;
            } else if (this.hasTeamId() && this.getTeamId() != other.getTeamId()) {
               return false;
            } else if (this.hasIsCancel() != other.hasIsCancel()) {
               return false;
            } else if (this.hasIsCancel() && this.getIsCancel() != other.getIsCancel()) {
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

            if (this.hasIsCancel()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsCancel());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_AllianceSign_11802 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_AllianceSign_11802)PARSER.parseFrom(data);
      }

      public static CR2S_AllianceSign_11802 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_AllianceSign_11802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_AllianceSign_11802 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_AllianceSign_11802)PARSER.parseFrom(data);
      }

      public static CR2S_AllianceSign_11802 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_AllianceSign_11802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_AllianceSign_11802 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_AllianceSign_11802)PARSER.parseFrom(data);
      }

      public static CR2S_AllianceSign_11802 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_AllianceSign_11802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_AllianceSign_11802 parseFrom(InputStream input) throws IOException {
         return (CR2S_AllianceSign_11802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_AllianceSign_11802 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_AllianceSign_11802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_AllianceSign_11802 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_AllianceSign_11802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_AllianceSign_11802 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_AllianceSign_11802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_AllianceSign_11802 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_AllianceSign_11802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_AllianceSign_11802 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_AllianceSign_11802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_AllianceSign_11802 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_AllianceSign_11802 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_AllianceSign_11802> parser() {
         return PARSER;
      }

      public Parser<CR2S_AllianceSign_11802> getParserForType() {
         return PARSER;
      }

      public CR2S_AllianceSign_11802 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_AllianceSign_11802OrBuilder {
         private int bitField0_;
         private int teamId_;
         private boolean isCancel_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_AllianceSign_11802_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_AllianceSign_11802_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_AllianceSign_11802.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossAllianceMsg.CR2S_AllianceSign_11802.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.teamId_ = 0;
            this.bitField0_ &= -2;
            this.isCancel_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_AllianceSign_11802_descriptor;
         }

         public CR2S_AllianceSign_11802 getDefaultInstanceForType() {
            return CrossAllianceMsg.CR2S_AllianceSign_11802.getDefaultInstance();
         }

         public CR2S_AllianceSign_11802 build() {
            CR2S_AllianceSign_11802 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_AllianceSign_11802 buildPartial() {
            CR2S_AllianceSign_11802 result = new CR2S_AllianceSign_11802(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.teamId_ = this.teamId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isCancel_ = this.isCancel_;
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
            if (other instanceof CR2S_AllianceSign_11802) {
               return this.mergeFrom((CR2S_AllianceSign_11802)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_AllianceSign_11802 other) {
            if (other == CrossAllianceMsg.CR2S_AllianceSign_11802.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTeamId()) {
                  this.setTeamId(other.getTeamId());
               }

               if (other.hasIsCancel()) {
                  this.setIsCancel(other.getIsCancel());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTeamId()) {
               return false;
            } else {
               return this.hasIsCancel();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_AllianceSign_11802 parsedMessage = null;

            try {
               parsedMessage = (CR2S_AllianceSign_11802)CrossAllianceMsg.CR2S_AllianceSign_11802.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_AllianceSign_11802)e.getUnfinishedMessage();
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

         public boolean hasIsCancel() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsCancel() {
            return this.isCancel_;
         }

         public Builder setIsCancel(boolean value) {
            this.bitField0_ |= 2;
            this.isCancel_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsCancel() {
            this.bitField0_ &= -3;
            this.isCancel_ = false;
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

   public static final class S2CR_AllianceChallengeTeams_11803 extends GeneratedMessageV3 implements S2CR_AllianceChallengeTeams_11803OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TEAMID_FIELD_NUMBER = 1;
      private int teamId_;
      private byte memoizedIsInitialized;
      private static final S2CR_AllianceChallengeTeams_11803 DEFAULT_INSTANCE = new S2CR_AllianceChallengeTeams_11803();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_AllianceChallengeTeams_11803> PARSER = new AbstractParser<S2CR_AllianceChallengeTeams_11803>() {
         public S2CR_AllianceChallengeTeams_11803 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_AllianceChallengeTeams_11803(input, extensionRegistry);
         }
      };

      private S2CR_AllianceChallengeTeams_11803(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_AllianceChallengeTeams_11803() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_AllianceChallengeTeams_11803();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_AllianceChallengeTeams_11803(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceChallengeTeams_11803_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceChallengeTeams_11803_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_AllianceChallengeTeams_11803.class, Builder.class);
      }

      public boolean hasTeamId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTeamId() {
         return this.teamId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
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
            output.writeInt32(1, this.teamId_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_AllianceChallengeTeams_11803)) {
            return super.equals(obj);
         } else {
            S2CR_AllianceChallengeTeams_11803 other = (S2CR_AllianceChallengeTeams_11803)obj;
            if (this.hasTeamId() != other.hasTeamId()) {
               return false;
            } else if (this.hasTeamId() && this.getTeamId() != other.getTeamId()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_AllianceChallengeTeams_11803 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_AllianceChallengeTeams_11803)PARSER.parseFrom(data);
      }

      public static S2CR_AllianceChallengeTeams_11803 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AllianceChallengeTeams_11803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AllianceChallengeTeams_11803 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_AllianceChallengeTeams_11803)PARSER.parseFrom(data);
      }

      public static S2CR_AllianceChallengeTeams_11803 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AllianceChallengeTeams_11803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AllianceChallengeTeams_11803 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_AllianceChallengeTeams_11803)PARSER.parseFrom(data);
      }

      public static S2CR_AllianceChallengeTeams_11803 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AllianceChallengeTeams_11803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AllianceChallengeTeams_11803 parseFrom(InputStream input) throws IOException {
         return (S2CR_AllianceChallengeTeams_11803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_AllianceChallengeTeams_11803 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AllianceChallengeTeams_11803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_AllianceChallengeTeams_11803 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_AllianceChallengeTeams_11803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_AllianceChallengeTeams_11803 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AllianceChallengeTeams_11803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_AllianceChallengeTeams_11803 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_AllianceChallengeTeams_11803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_AllianceChallengeTeams_11803 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AllianceChallengeTeams_11803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_AllianceChallengeTeams_11803 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_AllianceChallengeTeams_11803 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_AllianceChallengeTeams_11803> parser() {
         return PARSER;
      }

      public Parser<S2CR_AllianceChallengeTeams_11803> getParserForType() {
         return PARSER;
      }

      public S2CR_AllianceChallengeTeams_11803 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_AllianceChallengeTeams_11803OrBuilder {
         private int bitField0_;
         private int teamId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceChallengeTeams_11803_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceChallengeTeams_11803_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_AllianceChallengeTeams_11803.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossAllianceMsg.S2CR_AllianceChallengeTeams_11803.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.teamId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceChallengeTeams_11803_descriptor;
         }

         public S2CR_AllianceChallengeTeams_11803 getDefaultInstanceForType() {
            return CrossAllianceMsg.S2CR_AllianceChallengeTeams_11803.getDefaultInstance();
         }

         public S2CR_AllianceChallengeTeams_11803 build() {
            S2CR_AllianceChallengeTeams_11803 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_AllianceChallengeTeams_11803 buildPartial() {
            S2CR_AllianceChallengeTeams_11803 result = new S2CR_AllianceChallengeTeams_11803(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.teamId_ = this.teamId_;
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
            if (other instanceof S2CR_AllianceChallengeTeams_11803) {
               return this.mergeFrom((S2CR_AllianceChallengeTeams_11803)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_AllianceChallengeTeams_11803 other) {
            if (other == CrossAllianceMsg.S2CR_AllianceChallengeTeams_11803.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTeamId()) {
                  this.setTeamId(other.getTeamId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTeamId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_AllianceChallengeTeams_11803 parsedMessage = null;

            try {
               parsedMessage = (S2CR_AllianceChallengeTeams_11803)CrossAllianceMsg.S2CR_AllianceChallengeTeams_11803.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_AllianceChallengeTeams_11803)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_AllianceTeamInfo_11804 extends GeneratedMessageV3 implements S2CR_AllianceTeamInfo_11804OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TEAMID_FIELD_NUMBER = 1;
      private int teamId_;
      private byte memoizedIsInitialized;
      private static final S2CR_AllianceTeamInfo_11804 DEFAULT_INSTANCE = new S2CR_AllianceTeamInfo_11804();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_AllianceTeamInfo_11804> PARSER = new AbstractParser<S2CR_AllianceTeamInfo_11804>() {
         public S2CR_AllianceTeamInfo_11804 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_AllianceTeamInfo_11804(input, extensionRegistry);
         }
      };

      private S2CR_AllianceTeamInfo_11804(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_AllianceTeamInfo_11804() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_AllianceTeamInfo_11804();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_AllianceTeamInfo_11804(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceTeamInfo_11804_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceTeamInfo_11804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_AllianceTeamInfo_11804.class, Builder.class);
      }

      public boolean hasTeamId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTeamId() {
         return this.teamId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
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
            output.writeInt32(1, this.teamId_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_AllianceTeamInfo_11804)) {
            return super.equals(obj);
         } else {
            S2CR_AllianceTeamInfo_11804 other = (S2CR_AllianceTeamInfo_11804)obj;
            if (this.hasTeamId() != other.hasTeamId()) {
               return false;
            } else if (this.hasTeamId() && this.getTeamId() != other.getTeamId()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_AllianceTeamInfo_11804 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_AllianceTeamInfo_11804)PARSER.parseFrom(data);
      }

      public static S2CR_AllianceTeamInfo_11804 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AllianceTeamInfo_11804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AllianceTeamInfo_11804 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_AllianceTeamInfo_11804)PARSER.parseFrom(data);
      }

      public static S2CR_AllianceTeamInfo_11804 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AllianceTeamInfo_11804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AllianceTeamInfo_11804 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_AllianceTeamInfo_11804)PARSER.parseFrom(data);
      }

      public static S2CR_AllianceTeamInfo_11804 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AllianceTeamInfo_11804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AllianceTeamInfo_11804 parseFrom(InputStream input) throws IOException {
         return (S2CR_AllianceTeamInfo_11804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_AllianceTeamInfo_11804 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AllianceTeamInfo_11804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_AllianceTeamInfo_11804 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_AllianceTeamInfo_11804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_AllianceTeamInfo_11804 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AllianceTeamInfo_11804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_AllianceTeamInfo_11804 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_AllianceTeamInfo_11804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_AllianceTeamInfo_11804 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AllianceTeamInfo_11804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_AllianceTeamInfo_11804 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_AllianceTeamInfo_11804 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_AllianceTeamInfo_11804> parser() {
         return PARSER;
      }

      public Parser<S2CR_AllianceTeamInfo_11804> getParserForType() {
         return PARSER;
      }

      public S2CR_AllianceTeamInfo_11804 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_AllianceTeamInfo_11804OrBuilder {
         private int bitField0_;
         private int teamId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceTeamInfo_11804_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceTeamInfo_11804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_AllianceTeamInfo_11804.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossAllianceMsg.S2CR_AllianceTeamInfo_11804.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.teamId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceTeamInfo_11804_descriptor;
         }

         public S2CR_AllianceTeamInfo_11804 getDefaultInstanceForType() {
            return CrossAllianceMsg.S2CR_AllianceTeamInfo_11804.getDefaultInstance();
         }

         public S2CR_AllianceTeamInfo_11804 build() {
            S2CR_AllianceTeamInfo_11804 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_AllianceTeamInfo_11804 buildPartial() {
            S2CR_AllianceTeamInfo_11804 result = new S2CR_AllianceTeamInfo_11804(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.teamId_ = this.teamId_;
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
            if (other instanceof S2CR_AllianceTeamInfo_11804) {
               return this.mergeFrom((S2CR_AllianceTeamInfo_11804)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_AllianceTeamInfo_11804 other) {
            if (other == CrossAllianceMsg.S2CR_AllianceTeamInfo_11804.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTeamId()) {
                  this.setTeamId(other.getTeamId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTeamId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_AllianceTeamInfo_11804 parsedMessage = null;

            try {
               parsedMessage = (S2CR_AllianceTeamInfo_11804)CrossAllianceMsg.S2CR_AllianceTeamInfo_11804.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_AllianceTeamInfo_11804)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_AllianceRank_11805 extends GeneratedMessageV3 implements S2CR_AllianceRank_11805OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TEAMID_FIELD_NUMBER = 1;
      private int teamId_;
      private byte memoizedIsInitialized;
      private static final S2CR_AllianceRank_11805 DEFAULT_INSTANCE = new S2CR_AllianceRank_11805();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_AllianceRank_11805> PARSER = new AbstractParser<S2CR_AllianceRank_11805>() {
         public S2CR_AllianceRank_11805 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_AllianceRank_11805(input, extensionRegistry);
         }
      };

      private S2CR_AllianceRank_11805(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_AllianceRank_11805() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_AllianceRank_11805();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_AllianceRank_11805(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceRank_11805_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceRank_11805_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_AllianceRank_11805.class, Builder.class);
      }

      public boolean hasTeamId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTeamId() {
         return this.teamId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
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
            output.writeInt32(1, this.teamId_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_AllianceRank_11805)) {
            return super.equals(obj);
         } else {
            S2CR_AllianceRank_11805 other = (S2CR_AllianceRank_11805)obj;
            if (this.hasTeamId() != other.hasTeamId()) {
               return false;
            } else if (this.hasTeamId() && this.getTeamId() != other.getTeamId()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_AllianceRank_11805 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_AllianceRank_11805)PARSER.parseFrom(data);
      }

      public static S2CR_AllianceRank_11805 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AllianceRank_11805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AllianceRank_11805 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_AllianceRank_11805)PARSER.parseFrom(data);
      }

      public static S2CR_AllianceRank_11805 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AllianceRank_11805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AllianceRank_11805 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_AllianceRank_11805)PARSER.parseFrom(data);
      }

      public static S2CR_AllianceRank_11805 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AllianceRank_11805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AllianceRank_11805 parseFrom(InputStream input) throws IOException {
         return (S2CR_AllianceRank_11805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_AllianceRank_11805 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AllianceRank_11805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_AllianceRank_11805 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_AllianceRank_11805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_AllianceRank_11805 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AllianceRank_11805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_AllianceRank_11805 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_AllianceRank_11805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_AllianceRank_11805 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AllianceRank_11805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_AllianceRank_11805 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_AllianceRank_11805 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_AllianceRank_11805> parser() {
         return PARSER;
      }

      public Parser<S2CR_AllianceRank_11805> getParserForType() {
         return PARSER;
      }

      public S2CR_AllianceRank_11805 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_AllianceRank_11805OrBuilder {
         private int bitField0_;
         private int teamId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceRank_11805_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceRank_11805_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_AllianceRank_11805.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossAllianceMsg.S2CR_AllianceRank_11805.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.teamId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceRank_11805_descriptor;
         }

         public S2CR_AllianceRank_11805 getDefaultInstanceForType() {
            return CrossAllianceMsg.S2CR_AllianceRank_11805.getDefaultInstance();
         }

         public S2CR_AllianceRank_11805 build() {
            S2CR_AllianceRank_11805 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_AllianceRank_11805 buildPartial() {
            S2CR_AllianceRank_11805 result = new S2CR_AllianceRank_11805(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.teamId_ = this.teamId_;
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
            if (other instanceof S2CR_AllianceRank_11805) {
               return this.mergeFrom((S2CR_AllianceRank_11805)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_AllianceRank_11805 other) {
            if (other == CrossAllianceMsg.S2CR_AllianceRank_11805.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTeamId()) {
                  this.setTeamId(other.getTeamId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTeamId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_AllianceRank_11805 parsedMessage = null;

            try {
               parsedMessage = (S2CR_AllianceRank_11805)CrossAllianceMsg.S2CR_AllianceRank_11805.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_AllianceRank_11805)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_ServerInit_11806 extends GeneratedMessageV3 implements S2CR_ServerInit_11806OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_ServerInit_11806 DEFAULT_INSTANCE = new S2CR_ServerInit_11806();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_ServerInit_11806> PARSER = new AbstractParser<S2CR_ServerInit_11806>() {
         public S2CR_ServerInit_11806 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_ServerInit_11806(input, extensionRegistry);
         }
      };

      private S2CR_ServerInit_11806(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_ServerInit_11806() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_ServerInit_11806();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_ServerInit_11806(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_ServerInit_11806_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_ServerInit_11806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ServerInit_11806.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_ServerInit_11806)) {
            return super.equals(obj);
         } else {
            S2CR_ServerInit_11806 other = (S2CR_ServerInit_11806)obj;
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

      public static S2CR_ServerInit_11806 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_ServerInit_11806)PARSER.parseFrom(data);
      }

      public static S2CR_ServerInit_11806 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ServerInit_11806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ServerInit_11806 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_ServerInit_11806)PARSER.parseFrom(data);
      }

      public static S2CR_ServerInit_11806 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ServerInit_11806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ServerInit_11806 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_ServerInit_11806)PARSER.parseFrom(data);
      }

      public static S2CR_ServerInit_11806 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ServerInit_11806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ServerInit_11806 parseFrom(InputStream input) throws IOException {
         return (S2CR_ServerInit_11806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ServerInit_11806 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ServerInit_11806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ServerInit_11806 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_ServerInit_11806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_ServerInit_11806 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ServerInit_11806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ServerInit_11806 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_ServerInit_11806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ServerInit_11806 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ServerInit_11806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_ServerInit_11806 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_ServerInit_11806 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_ServerInit_11806> parser() {
         return PARSER;
      }

      public Parser<S2CR_ServerInit_11806> getParserForType() {
         return PARSER;
      }

      public S2CR_ServerInit_11806 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_ServerInit_11806OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_ServerInit_11806_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_ServerInit_11806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ServerInit_11806.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossAllianceMsg.S2CR_ServerInit_11806.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_ServerInit_11806_descriptor;
         }

         public S2CR_ServerInit_11806 getDefaultInstanceForType() {
            return CrossAllianceMsg.S2CR_ServerInit_11806.getDefaultInstance();
         }

         public S2CR_ServerInit_11806 build() {
            S2CR_ServerInit_11806 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_ServerInit_11806 buildPartial() {
            S2CR_ServerInit_11806 result = new S2CR_ServerInit_11806(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_ServerInit_11806) {
               return this.mergeFrom((S2CR_ServerInit_11806)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_ServerInit_11806 other) {
            if (other == CrossAllianceMsg.S2CR_ServerInit_11806.getDefaultInstance()) {
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
            S2CR_ServerInit_11806 parsedMessage = null;

            try {
               parsedMessage = (S2CR_ServerInit_11806)CrossAllianceMsg.S2CR_ServerInit_11806.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_ServerInit_11806)e.getUnfinishedMessage();
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

   public static final class CR2S_ServerInit_11807 extends GeneratedMessageV3 implements CR2S_ServerInit_11807OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STATUS_FIELD_NUMBER = 1;
      private int status_;
      public static final int ENDTIME_FIELD_NUMBER = 2;
      private int endTime_;
      public static final int SEASONSTARTTIME_FIELD_NUMBER = 3;
      private int seasonStartTime_;
      public static final int SEASONENDTIME_FIELD_NUMBER = 4;
      private int seasonEndTime_;
      public static final int ISGM_FIELD_NUMBER = 5;
      private boolean isGm_;
      private byte memoizedIsInitialized;
      private static final CR2S_ServerInit_11807 DEFAULT_INSTANCE = new CR2S_ServerInit_11807();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_ServerInit_11807> PARSER = new AbstractParser<CR2S_ServerInit_11807>() {
         public CR2S_ServerInit_11807 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_ServerInit_11807(input, extensionRegistry);
         }
      };

      private CR2S_ServerInit_11807(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_ServerInit_11807() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_ServerInit_11807();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_ServerInit_11807(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.status_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.endTime_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.seasonStartTime_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.seasonEndTime_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.isGm_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_ServerInit_11807_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_ServerInit_11807_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ServerInit_11807.class, Builder.class);
      }

      public boolean hasStatus() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStatus() {
         return this.status_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public boolean hasSeasonStartTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSeasonStartTime() {
         return this.seasonStartTime_;
      }

      public boolean hasSeasonEndTime() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getSeasonEndTime() {
         return this.seasonEndTime_;
      }

      public boolean hasIsGm() {
         return (this.bitField0_ & 16) != 0;
      }

      public boolean getIsGm() {
         return this.isGm_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStatus()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSeasonStartTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSeasonEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsGm()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.status_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.endTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.seasonStartTime_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.seasonEndTime_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeBool(5, this.isGm_);
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
               size += CodedOutputStream.computeInt32Size(1, this.status_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.endTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.seasonStartTime_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.seasonEndTime_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeBoolSize(5, this.isGm_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_ServerInit_11807)) {
            return super.equals(obj);
         } else {
            CR2S_ServerInit_11807 other = (CR2S_ServerInit_11807)obj;
            if (this.hasStatus() != other.hasStatus()) {
               return false;
            } else if (this.hasStatus() && this.getStatus() != other.getStatus()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (this.hasSeasonStartTime() != other.hasSeasonStartTime()) {
               return false;
            } else if (this.hasSeasonStartTime() && this.getSeasonStartTime() != other.getSeasonStartTime()) {
               return false;
            } else if (this.hasSeasonEndTime() != other.hasSeasonEndTime()) {
               return false;
            } else if (this.hasSeasonEndTime() && this.getSeasonEndTime() != other.getSeasonEndTime()) {
               return false;
            } else if (this.hasIsGm() != other.hasIsGm()) {
               return false;
            } else if (this.hasIsGm() && this.getIsGm() != other.getIsGm()) {
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
            if (this.hasStatus()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStatus();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.hasSeasonStartTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSeasonStartTime();
            }

            if (this.hasSeasonEndTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSeasonEndTime();
            }

            if (this.hasIsGm()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashBoolean(this.getIsGm());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_ServerInit_11807 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_ServerInit_11807)PARSER.parseFrom(data);
      }

      public static CR2S_ServerInit_11807 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ServerInit_11807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ServerInit_11807 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_ServerInit_11807)PARSER.parseFrom(data);
      }

      public static CR2S_ServerInit_11807 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ServerInit_11807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ServerInit_11807 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_ServerInit_11807)PARSER.parseFrom(data);
      }

      public static CR2S_ServerInit_11807 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ServerInit_11807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ServerInit_11807 parseFrom(InputStream input) throws IOException {
         return (CR2S_ServerInit_11807)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ServerInit_11807 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ServerInit_11807)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ServerInit_11807 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_ServerInit_11807)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_ServerInit_11807 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ServerInit_11807)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ServerInit_11807 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_ServerInit_11807)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ServerInit_11807 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ServerInit_11807)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_ServerInit_11807 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_ServerInit_11807 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_ServerInit_11807> parser() {
         return PARSER;
      }

      public Parser<CR2S_ServerInit_11807> getParserForType() {
         return PARSER;
      }

      public CR2S_ServerInit_11807 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_ServerInit_11807OrBuilder {
         private int bitField0_;
         private int status_;
         private int endTime_;
         private int seasonStartTime_;
         private int seasonEndTime_;
         private boolean isGm_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_ServerInit_11807_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_ServerInit_11807_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ServerInit_11807.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossAllianceMsg.CR2S_ServerInit_11807.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.status_ = 0;
            this.bitField0_ &= -2;
            this.endTime_ = 0;
            this.bitField0_ &= -3;
            this.seasonStartTime_ = 0;
            this.bitField0_ &= -5;
            this.seasonEndTime_ = 0;
            this.bitField0_ &= -9;
            this.isGm_ = false;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_ServerInit_11807_descriptor;
         }

         public CR2S_ServerInit_11807 getDefaultInstanceForType() {
            return CrossAllianceMsg.CR2S_ServerInit_11807.getDefaultInstance();
         }

         public CR2S_ServerInit_11807 build() {
            CR2S_ServerInit_11807 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_ServerInit_11807 buildPartial() {
            CR2S_ServerInit_11807 result = new CR2S_ServerInit_11807(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.status_ = this.status_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.seasonStartTime_ = this.seasonStartTime_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.seasonEndTime_ = this.seasonEndTime_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.isGm_ = this.isGm_;
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
            if (other instanceof CR2S_ServerInit_11807) {
               return this.mergeFrom((CR2S_ServerInit_11807)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_ServerInit_11807 other) {
            if (other == CrossAllianceMsg.CR2S_ServerInit_11807.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStatus()) {
                  this.setStatus(other.getStatus());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasSeasonStartTime()) {
                  this.setSeasonStartTime(other.getSeasonStartTime());
               }

               if (other.hasSeasonEndTime()) {
                  this.setSeasonEndTime(other.getSeasonEndTime());
               }

               if (other.hasIsGm()) {
                  this.setIsGm(other.getIsGm());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStatus()) {
               return false;
            } else if (!this.hasEndTime()) {
               return false;
            } else if (!this.hasSeasonStartTime()) {
               return false;
            } else if (!this.hasSeasonEndTime()) {
               return false;
            } else {
               return this.hasIsGm();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_ServerInit_11807 parsedMessage = null;

            try {
               parsedMessage = (CR2S_ServerInit_11807)CrossAllianceMsg.CR2S_ServerInit_11807.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_ServerInit_11807)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStatus() {
            return this.status_;
         }

         public Builder setStatus(int value) {
            this.bitField0_ |= 1;
            this.status_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStatus() {
            this.bitField0_ &= -2;
            this.status_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(int value) {
            this.bitField0_ |= 2;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -3;
            this.endTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSeasonStartTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSeasonStartTime() {
            return this.seasonStartTime_;
         }

         public Builder setSeasonStartTime(int value) {
            this.bitField0_ |= 4;
            this.seasonStartTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSeasonStartTime() {
            this.bitField0_ &= -5;
            this.seasonStartTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSeasonEndTime() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getSeasonEndTime() {
            return this.seasonEndTime_;
         }

         public Builder setSeasonEndTime(int value) {
            this.bitField0_ |= 8;
            this.seasonEndTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSeasonEndTime() {
            this.bitField0_ &= -9;
            this.seasonEndTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsGm() {
            return (this.bitField0_ & 16) != 0;
         }

         public boolean getIsGm() {
            return this.isGm_;
         }

         public Builder setIsGm(boolean value) {
            this.bitField0_ |= 16;
            this.isGm_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsGm() {
            this.bitField0_ &= -17;
            this.isGm_ = false;
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

   public static final class S2CR_TeamArrayingSave_11808 extends GeneratedMessageV3 implements S2CR_TeamArrayingSave_11808OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TEAMID_FIELD_NUMBER = 1;
      private int teamId_;
      public static final int PLAYERLIST_FIELD_NUMBER = 2;
      private List<AllianceMsg.TeamPlayerHideInfo> playerList_;
      private byte memoizedIsInitialized;
      private static final S2CR_TeamArrayingSave_11808 DEFAULT_INSTANCE = new S2CR_TeamArrayingSave_11808();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_TeamArrayingSave_11808> PARSER = new AbstractParser<S2CR_TeamArrayingSave_11808>() {
         public S2CR_TeamArrayingSave_11808 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_TeamArrayingSave_11808(input, extensionRegistry);
         }
      };

      private S2CR_TeamArrayingSave_11808(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_TeamArrayingSave_11808() {
         this.memoizedIsInitialized = -1;
         this.playerList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_TeamArrayingSave_11808();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_TeamArrayingSave_11808(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.playerList_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.playerList_.add(input.readMessage(AllianceMsg.TeamPlayerHideInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.playerList_ = Collections.unmodifiableList(this.playerList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamArrayingSave_11808_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamArrayingSave_11808_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_TeamArrayingSave_11808.class, Builder.class);
      }

      public boolean hasTeamId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTeamId() {
         return this.teamId_;
      }

      public List<AllianceMsg.TeamPlayerHideInfo> getPlayerListList() {
         return this.playerList_;
      }

      public List<? extends AllianceMsg.TeamPlayerHideInfoOrBuilder> getPlayerListOrBuilderList() {
         return this.playerList_;
      }

      public int getPlayerListCount() {
         return this.playerList_.size();
      }

      public AllianceMsg.TeamPlayerHideInfo getPlayerList(int index) {
         return (AllianceMsg.TeamPlayerHideInfo)this.playerList_.get(index);
      }

      public AllianceMsg.TeamPlayerHideInfoOrBuilder getPlayerListOrBuilder(int index) {
         return (AllianceMsg.TeamPlayerHideInfoOrBuilder)this.playerList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTeamId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getPlayerListCount(); ++i) {
               if (!this.getPlayerList(i).isInitialized()) {
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
            output.writeInt32(1, this.teamId_);
         }

         for(int i = 0; i < this.playerList_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.playerList_.get(i));
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

            for(int i = 0; i < this.playerList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.playerList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_TeamArrayingSave_11808)) {
            return super.equals(obj);
         } else {
            S2CR_TeamArrayingSave_11808 other = (S2CR_TeamArrayingSave_11808)obj;
            if (this.hasTeamId() != other.hasTeamId()) {
               return false;
            } else if (this.hasTeamId() && this.getTeamId() != other.getTeamId()) {
               return false;
            } else if (!this.getPlayerListList().equals(other.getPlayerListList())) {
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

            if (this.getPlayerListCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_TeamArrayingSave_11808 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_TeamArrayingSave_11808)PARSER.parseFrom(data);
      }

      public static S2CR_TeamArrayingSave_11808 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TeamArrayingSave_11808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TeamArrayingSave_11808 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_TeamArrayingSave_11808)PARSER.parseFrom(data);
      }

      public static S2CR_TeamArrayingSave_11808 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TeamArrayingSave_11808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TeamArrayingSave_11808 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_TeamArrayingSave_11808)PARSER.parseFrom(data);
      }

      public static S2CR_TeamArrayingSave_11808 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TeamArrayingSave_11808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TeamArrayingSave_11808 parseFrom(InputStream input) throws IOException {
         return (S2CR_TeamArrayingSave_11808)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_TeamArrayingSave_11808 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TeamArrayingSave_11808)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_TeamArrayingSave_11808 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_TeamArrayingSave_11808)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_TeamArrayingSave_11808 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TeamArrayingSave_11808)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_TeamArrayingSave_11808 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_TeamArrayingSave_11808)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_TeamArrayingSave_11808 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TeamArrayingSave_11808)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_TeamArrayingSave_11808 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_TeamArrayingSave_11808 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_TeamArrayingSave_11808> parser() {
         return PARSER;
      }

      public Parser<S2CR_TeamArrayingSave_11808> getParserForType() {
         return PARSER;
      }

      public S2CR_TeamArrayingSave_11808 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_TeamArrayingSave_11808OrBuilder {
         private int bitField0_;
         private int teamId_;
         private List<AllianceMsg.TeamPlayerHideInfo> playerList_;
         private RepeatedFieldBuilderV3<AllianceMsg.TeamPlayerHideInfo, AllianceMsg.TeamPlayerHideInfo.Builder, AllianceMsg.TeamPlayerHideInfoOrBuilder> playerListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamArrayingSave_11808_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamArrayingSave_11808_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_TeamArrayingSave_11808.class, Builder.class);
         }

         private Builder() {
            this.playerList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossAllianceMsg.S2CR_TeamArrayingSave_11808.alwaysUseFieldBuilders) {
               this.getPlayerListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.teamId_ = 0;
            this.bitField0_ &= -2;
            if (this.playerListBuilder_ == null) {
               this.playerList_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.playerListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamArrayingSave_11808_descriptor;
         }

         public S2CR_TeamArrayingSave_11808 getDefaultInstanceForType() {
            return CrossAllianceMsg.S2CR_TeamArrayingSave_11808.getDefaultInstance();
         }

         public S2CR_TeamArrayingSave_11808 build() {
            S2CR_TeamArrayingSave_11808 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_TeamArrayingSave_11808 buildPartial() {
            S2CR_TeamArrayingSave_11808 result = new S2CR_TeamArrayingSave_11808(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.teamId_ = this.teamId_;
               to_bitField0_ |= 1;
            }

            if (this.playerListBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.playerList_ = Collections.unmodifiableList(this.playerList_);
                  this.bitField0_ &= -3;
               }

               result.playerList_ = this.playerList_;
            } else {
               result.playerList_ = this.playerListBuilder_.build();
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
            if (other instanceof S2CR_TeamArrayingSave_11808) {
               return this.mergeFrom((S2CR_TeamArrayingSave_11808)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_TeamArrayingSave_11808 other) {
            if (other == CrossAllianceMsg.S2CR_TeamArrayingSave_11808.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTeamId()) {
                  this.setTeamId(other.getTeamId());
               }

               if (this.playerListBuilder_ == null) {
                  if (!other.playerList_.isEmpty()) {
                     if (this.playerList_.isEmpty()) {
                        this.playerList_ = other.playerList_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensurePlayerListIsMutable();
                        this.playerList_.addAll(other.playerList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.playerList_.isEmpty()) {
                  if (this.playerListBuilder_.isEmpty()) {
                     this.playerListBuilder_.dispose();
                     this.playerListBuilder_ = null;
                     this.playerList_ = other.playerList_;
                     this.bitField0_ &= -3;
                     this.playerListBuilder_ = CrossAllianceMsg.S2CR_TeamArrayingSave_11808.alwaysUseFieldBuilders ? this.getPlayerListFieldBuilder() : null;
                  } else {
                     this.playerListBuilder_.addAllMessages(other.playerList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTeamId()) {
               return false;
            } else {
               for(int i = 0; i < this.getPlayerListCount(); ++i) {
                  if (!this.getPlayerList(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_TeamArrayingSave_11808 parsedMessage = null;

            try {
               parsedMessage = (S2CR_TeamArrayingSave_11808)CrossAllianceMsg.S2CR_TeamArrayingSave_11808.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_TeamArrayingSave_11808)e.getUnfinishedMessage();
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

         private void ensurePlayerListIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.playerList_ = new ArrayList(this.playerList_);
               this.bitField0_ |= 2;
            }

         }

         public List<AllianceMsg.TeamPlayerHideInfo> getPlayerListList() {
            return this.playerListBuilder_ == null ? Collections.unmodifiableList(this.playerList_) : this.playerListBuilder_.getMessageList();
         }

         public int getPlayerListCount() {
            return this.playerListBuilder_ == null ? this.playerList_.size() : this.playerListBuilder_.getCount();
         }

         public AllianceMsg.TeamPlayerHideInfo getPlayerList(int index) {
            return this.playerListBuilder_ == null ? (AllianceMsg.TeamPlayerHideInfo)this.playerList_.get(index) : (AllianceMsg.TeamPlayerHideInfo)this.playerListBuilder_.getMessage(index);
         }

         public Builder setPlayerList(int index, AllianceMsg.TeamPlayerHideInfo value) {
            if (this.playerListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerListIsMutable();
               this.playerList_.set(index, value);
               this.onChanged();
            } else {
               this.playerListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPlayerList(int index, AllianceMsg.TeamPlayerHideInfo.Builder builderForValue) {
            if (this.playerListBuilder_ == null) {
               this.ensurePlayerListIsMutable();
               this.playerList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPlayerList(AllianceMsg.TeamPlayerHideInfo value) {
            if (this.playerListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerListIsMutable();
               this.playerList_.add(value);
               this.onChanged();
            } else {
               this.playerListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPlayerList(int index, AllianceMsg.TeamPlayerHideInfo value) {
            if (this.playerListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerListIsMutable();
               this.playerList_.add(index, value);
               this.onChanged();
            } else {
               this.playerListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPlayerList(AllianceMsg.TeamPlayerHideInfo.Builder builderForValue) {
            if (this.playerListBuilder_ == null) {
               this.ensurePlayerListIsMutable();
               this.playerList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.playerListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPlayerList(int index, AllianceMsg.TeamPlayerHideInfo.Builder builderForValue) {
            if (this.playerListBuilder_ == null) {
               this.ensurePlayerListIsMutable();
               this.playerList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPlayerList(Iterable<? extends AllianceMsg.TeamPlayerHideInfo> values) {
            if (this.playerListBuilder_ == null) {
               this.ensurePlayerListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.playerList_);
               this.onChanged();
            } else {
               this.playerListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPlayerList() {
            if (this.playerListBuilder_ == null) {
               this.playerList_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.playerListBuilder_.clear();
            }

            return this;
         }

         public Builder removePlayerList(int index) {
            if (this.playerListBuilder_ == null) {
               this.ensurePlayerListIsMutable();
               this.playerList_.remove(index);
               this.onChanged();
            } else {
               this.playerListBuilder_.remove(index);
            }

            return this;
         }

         public AllianceMsg.TeamPlayerHideInfo.Builder getPlayerListBuilder(int index) {
            return (AllianceMsg.TeamPlayerHideInfo.Builder)this.getPlayerListFieldBuilder().getBuilder(index);
         }

         public AllianceMsg.TeamPlayerHideInfoOrBuilder getPlayerListOrBuilder(int index) {
            return this.playerListBuilder_ == null ? (AllianceMsg.TeamPlayerHideInfoOrBuilder)this.playerList_.get(index) : (AllianceMsg.TeamPlayerHideInfoOrBuilder)this.playerListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends AllianceMsg.TeamPlayerHideInfoOrBuilder> getPlayerListOrBuilderList() {
            return this.playerListBuilder_ != null ? this.playerListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.playerList_);
         }

         public AllianceMsg.TeamPlayerHideInfo.Builder addPlayerListBuilder() {
            return (AllianceMsg.TeamPlayerHideInfo.Builder)this.getPlayerListFieldBuilder().addBuilder(AllianceMsg.TeamPlayerHideInfo.getDefaultInstance());
         }

         public AllianceMsg.TeamPlayerHideInfo.Builder addPlayerListBuilder(int index) {
            return (AllianceMsg.TeamPlayerHideInfo.Builder)this.getPlayerListFieldBuilder().addBuilder(index, AllianceMsg.TeamPlayerHideInfo.getDefaultInstance());
         }

         public List<AllianceMsg.TeamPlayerHideInfo.Builder> getPlayerListBuilderList() {
            return this.getPlayerListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<AllianceMsg.TeamPlayerHideInfo, AllianceMsg.TeamPlayerHideInfo.Builder, AllianceMsg.TeamPlayerHideInfoOrBuilder> getPlayerListFieldBuilder() {
            if (this.playerListBuilder_ == null) {
               this.playerListBuilder_ = new RepeatedFieldBuilderV3(this.playerList_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.playerList_ = null;
            }

            return this.playerListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_TeamArrayingSave_11809 extends GeneratedMessageV3 implements CR2S_TeamArrayingSave_11809OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TEAMID_FIELD_NUMBER = 1;
      private int teamId_;
      public static final int PLAYERLIST_FIELD_NUMBER = 2;
      private List<AllianceMsg.TeamPlayerHideInfo> playerList_;
      private byte memoizedIsInitialized;
      private static final CR2S_TeamArrayingSave_11809 DEFAULT_INSTANCE = new CR2S_TeamArrayingSave_11809();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_TeamArrayingSave_11809> PARSER = new AbstractParser<CR2S_TeamArrayingSave_11809>() {
         public CR2S_TeamArrayingSave_11809 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_TeamArrayingSave_11809(input, extensionRegistry);
         }
      };

      private CR2S_TeamArrayingSave_11809(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_TeamArrayingSave_11809() {
         this.memoizedIsInitialized = -1;
         this.playerList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_TeamArrayingSave_11809();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_TeamArrayingSave_11809(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.playerList_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.playerList_.add(input.readMessage(AllianceMsg.TeamPlayerHideInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.playerList_ = Collections.unmodifiableList(this.playerList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamArrayingSave_11809_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamArrayingSave_11809_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_TeamArrayingSave_11809.class, Builder.class);
      }

      public boolean hasTeamId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTeamId() {
         return this.teamId_;
      }

      public List<AllianceMsg.TeamPlayerHideInfo> getPlayerListList() {
         return this.playerList_;
      }

      public List<? extends AllianceMsg.TeamPlayerHideInfoOrBuilder> getPlayerListOrBuilderList() {
         return this.playerList_;
      }

      public int getPlayerListCount() {
         return this.playerList_.size();
      }

      public AllianceMsg.TeamPlayerHideInfo getPlayerList(int index) {
         return (AllianceMsg.TeamPlayerHideInfo)this.playerList_.get(index);
      }

      public AllianceMsg.TeamPlayerHideInfoOrBuilder getPlayerListOrBuilder(int index) {
         return (AllianceMsg.TeamPlayerHideInfoOrBuilder)this.playerList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTeamId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getPlayerListCount(); ++i) {
               if (!this.getPlayerList(i).isInitialized()) {
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
            output.writeInt32(1, this.teamId_);
         }

         for(int i = 0; i < this.playerList_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.playerList_.get(i));
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

            for(int i = 0; i < this.playerList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.playerList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_TeamArrayingSave_11809)) {
            return super.equals(obj);
         } else {
            CR2S_TeamArrayingSave_11809 other = (CR2S_TeamArrayingSave_11809)obj;
            if (this.hasTeamId() != other.hasTeamId()) {
               return false;
            } else if (this.hasTeamId() && this.getTeamId() != other.getTeamId()) {
               return false;
            } else if (!this.getPlayerListList().equals(other.getPlayerListList())) {
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

            if (this.getPlayerListCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_TeamArrayingSave_11809 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_TeamArrayingSave_11809)PARSER.parseFrom(data);
      }

      public static CR2S_TeamArrayingSave_11809 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_TeamArrayingSave_11809)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_TeamArrayingSave_11809 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_TeamArrayingSave_11809)PARSER.parseFrom(data);
      }

      public static CR2S_TeamArrayingSave_11809 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_TeamArrayingSave_11809)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_TeamArrayingSave_11809 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_TeamArrayingSave_11809)PARSER.parseFrom(data);
      }

      public static CR2S_TeamArrayingSave_11809 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_TeamArrayingSave_11809)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_TeamArrayingSave_11809 parseFrom(InputStream input) throws IOException {
         return (CR2S_TeamArrayingSave_11809)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_TeamArrayingSave_11809 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_TeamArrayingSave_11809)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_TeamArrayingSave_11809 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_TeamArrayingSave_11809)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_TeamArrayingSave_11809 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_TeamArrayingSave_11809)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_TeamArrayingSave_11809 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_TeamArrayingSave_11809)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_TeamArrayingSave_11809 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_TeamArrayingSave_11809)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_TeamArrayingSave_11809 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_TeamArrayingSave_11809 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_TeamArrayingSave_11809> parser() {
         return PARSER;
      }

      public Parser<CR2S_TeamArrayingSave_11809> getParserForType() {
         return PARSER;
      }

      public CR2S_TeamArrayingSave_11809 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_TeamArrayingSave_11809OrBuilder {
         private int bitField0_;
         private int teamId_;
         private List<AllianceMsg.TeamPlayerHideInfo> playerList_;
         private RepeatedFieldBuilderV3<AllianceMsg.TeamPlayerHideInfo, AllianceMsg.TeamPlayerHideInfo.Builder, AllianceMsg.TeamPlayerHideInfoOrBuilder> playerListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamArrayingSave_11809_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamArrayingSave_11809_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_TeamArrayingSave_11809.class, Builder.class);
         }

         private Builder() {
            this.playerList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossAllianceMsg.CR2S_TeamArrayingSave_11809.alwaysUseFieldBuilders) {
               this.getPlayerListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.teamId_ = 0;
            this.bitField0_ &= -2;
            if (this.playerListBuilder_ == null) {
               this.playerList_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.playerListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamArrayingSave_11809_descriptor;
         }

         public CR2S_TeamArrayingSave_11809 getDefaultInstanceForType() {
            return CrossAllianceMsg.CR2S_TeamArrayingSave_11809.getDefaultInstance();
         }

         public CR2S_TeamArrayingSave_11809 build() {
            CR2S_TeamArrayingSave_11809 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_TeamArrayingSave_11809 buildPartial() {
            CR2S_TeamArrayingSave_11809 result = new CR2S_TeamArrayingSave_11809(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.teamId_ = this.teamId_;
               to_bitField0_ |= 1;
            }

            if (this.playerListBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.playerList_ = Collections.unmodifiableList(this.playerList_);
                  this.bitField0_ &= -3;
               }

               result.playerList_ = this.playerList_;
            } else {
               result.playerList_ = this.playerListBuilder_.build();
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
            if (other instanceof CR2S_TeamArrayingSave_11809) {
               return this.mergeFrom((CR2S_TeamArrayingSave_11809)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_TeamArrayingSave_11809 other) {
            if (other == CrossAllianceMsg.CR2S_TeamArrayingSave_11809.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTeamId()) {
                  this.setTeamId(other.getTeamId());
               }

               if (this.playerListBuilder_ == null) {
                  if (!other.playerList_.isEmpty()) {
                     if (this.playerList_.isEmpty()) {
                        this.playerList_ = other.playerList_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensurePlayerListIsMutable();
                        this.playerList_.addAll(other.playerList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.playerList_.isEmpty()) {
                  if (this.playerListBuilder_.isEmpty()) {
                     this.playerListBuilder_.dispose();
                     this.playerListBuilder_ = null;
                     this.playerList_ = other.playerList_;
                     this.bitField0_ &= -3;
                     this.playerListBuilder_ = CrossAllianceMsg.CR2S_TeamArrayingSave_11809.alwaysUseFieldBuilders ? this.getPlayerListFieldBuilder() : null;
                  } else {
                     this.playerListBuilder_.addAllMessages(other.playerList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTeamId()) {
               return false;
            } else {
               for(int i = 0; i < this.getPlayerListCount(); ++i) {
                  if (!this.getPlayerList(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_TeamArrayingSave_11809 parsedMessage = null;

            try {
               parsedMessage = (CR2S_TeamArrayingSave_11809)CrossAllianceMsg.CR2S_TeamArrayingSave_11809.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_TeamArrayingSave_11809)e.getUnfinishedMessage();
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

         private void ensurePlayerListIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.playerList_ = new ArrayList(this.playerList_);
               this.bitField0_ |= 2;
            }

         }

         public List<AllianceMsg.TeamPlayerHideInfo> getPlayerListList() {
            return this.playerListBuilder_ == null ? Collections.unmodifiableList(this.playerList_) : this.playerListBuilder_.getMessageList();
         }

         public int getPlayerListCount() {
            return this.playerListBuilder_ == null ? this.playerList_.size() : this.playerListBuilder_.getCount();
         }

         public AllianceMsg.TeamPlayerHideInfo getPlayerList(int index) {
            return this.playerListBuilder_ == null ? (AllianceMsg.TeamPlayerHideInfo)this.playerList_.get(index) : (AllianceMsg.TeamPlayerHideInfo)this.playerListBuilder_.getMessage(index);
         }

         public Builder setPlayerList(int index, AllianceMsg.TeamPlayerHideInfo value) {
            if (this.playerListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerListIsMutable();
               this.playerList_.set(index, value);
               this.onChanged();
            } else {
               this.playerListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPlayerList(int index, AllianceMsg.TeamPlayerHideInfo.Builder builderForValue) {
            if (this.playerListBuilder_ == null) {
               this.ensurePlayerListIsMutable();
               this.playerList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPlayerList(AllianceMsg.TeamPlayerHideInfo value) {
            if (this.playerListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerListIsMutable();
               this.playerList_.add(value);
               this.onChanged();
            } else {
               this.playerListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPlayerList(int index, AllianceMsg.TeamPlayerHideInfo value) {
            if (this.playerListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerListIsMutable();
               this.playerList_.add(index, value);
               this.onChanged();
            } else {
               this.playerListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPlayerList(AllianceMsg.TeamPlayerHideInfo.Builder builderForValue) {
            if (this.playerListBuilder_ == null) {
               this.ensurePlayerListIsMutable();
               this.playerList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.playerListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPlayerList(int index, AllianceMsg.TeamPlayerHideInfo.Builder builderForValue) {
            if (this.playerListBuilder_ == null) {
               this.ensurePlayerListIsMutable();
               this.playerList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPlayerList(Iterable<? extends AllianceMsg.TeamPlayerHideInfo> values) {
            if (this.playerListBuilder_ == null) {
               this.ensurePlayerListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.playerList_);
               this.onChanged();
            } else {
               this.playerListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPlayerList() {
            if (this.playerListBuilder_ == null) {
               this.playerList_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.playerListBuilder_.clear();
            }

            return this;
         }

         public Builder removePlayerList(int index) {
            if (this.playerListBuilder_ == null) {
               this.ensurePlayerListIsMutable();
               this.playerList_.remove(index);
               this.onChanged();
            } else {
               this.playerListBuilder_.remove(index);
            }

            return this;
         }

         public AllianceMsg.TeamPlayerHideInfo.Builder getPlayerListBuilder(int index) {
            return (AllianceMsg.TeamPlayerHideInfo.Builder)this.getPlayerListFieldBuilder().getBuilder(index);
         }

         public AllianceMsg.TeamPlayerHideInfoOrBuilder getPlayerListOrBuilder(int index) {
            return this.playerListBuilder_ == null ? (AllianceMsg.TeamPlayerHideInfoOrBuilder)this.playerList_.get(index) : (AllianceMsg.TeamPlayerHideInfoOrBuilder)this.playerListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends AllianceMsg.TeamPlayerHideInfoOrBuilder> getPlayerListOrBuilderList() {
            return this.playerListBuilder_ != null ? this.playerListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.playerList_);
         }

         public AllianceMsg.TeamPlayerHideInfo.Builder addPlayerListBuilder() {
            return (AllianceMsg.TeamPlayerHideInfo.Builder)this.getPlayerListFieldBuilder().addBuilder(AllianceMsg.TeamPlayerHideInfo.getDefaultInstance());
         }

         public AllianceMsg.TeamPlayerHideInfo.Builder addPlayerListBuilder(int index) {
            return (AllianceMsg.TeamPlayerHideInfo.Builder)this.getPlayerListFieldBuilder().addBuilder(index, AllianceMsg.TeamPlayerHideInfo.getDefaultInstance());
         }

         public List<AllianceMsg.TeamPlayerHideInfo.Builder> getPlayerListBuilderList() {
            return this.getPlayerListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<AllianceMsg.TeamPlayerHideInfo, AllianceMsg.TeamPlayerHideInfo.Builder, AllianceMsg.TeamPlayerHideInfoOrBuilder> getPlayerListFieldBuilder() {
            if (this.playerListBuilder_ == null) {
               this.playerListBuilder_ = new RepeatedFieldBuilderV3(this.playerList_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.playerList_ = null;
            }

            return this.playerListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_TeamChallenge_11810 extends GeneratedMessageV3 implements S2CR_TeamChallenge_11810OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TEAMID_FIELD_NUMBER = 1;
      private int teamId_;
      public static final int CHALLENGETEAMID_FIELD_NUMBER = 2;
      private int challengeTeamId_;
      public static final int ISSKIP_FIELD_NUMBER = 3;
      private boolean isSkip_;
      public static final int ARRAYINGLIST_FIELD_NUMBER = 4;
      private List<ByteString> arrayingList_;
      public static final int GROUPID_FIELD_NUMBER = 5;
      private int groupId_;
      public static final int RECORDID_FIELD_NUMBER = 6;
      private int recordId_;
      private byte memoizedIsInitialized;
      private static final S2CR_TeamChallenge_11810 DEFAULT_INSTANCE = new S2CR_TeamChallenge_11810();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_TeamChallenge_11810> PARSER = new AbstractParser<S2CR_TeamChallenge_11810>() {
         public S2CR_TeamChallenge_11810 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_TeamChallenge_11810(input, extensionRegistry);
         }
      };

      private S2CR_TeamChallenge_11810(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_TeamChallenge_11810() {
         this.memoizedIsInitialized = -1;
         this.arrayingList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_TeamChallenge_11810();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_TeamChallenge_11810(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.challengeTeamId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.isSkip_ = input.readBool();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.arrayingList_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.arrayingList_.add(input.readBytes());
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.groupId_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 16;
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
               if ((mutable_bitField0_ & 8) != 0) {
                  this.arrayingList_ = Collections.unmodifiableList(this.arrayingList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamChallenge_11810_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamChallenge_11810_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_TeamChallenge_11810.class, Builder.class);
      }

      public boolean hasTeamId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTeamId() {
         return this.teamId_;
      }

      public boolean hasChallengeTeamId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getChallengeTeamId() {
         return this.challengeTeamId_;
      }

      public boolean hasIsSkip() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsSkip() {
         return this.isSkip_;
      }

      public List<ByteString> getArrayingListList() {
         return this.arrayingList_;
      }

      public int getArrayingListCount() {
         return this.arrayingList_.size();
      }

      public ByteString getArrayingList(int index) {
         return (ByteString)this.arrayingList_.get(index);
      }

      public boolean hasGroupId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getGroupId() {
         return this.groupId_;
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 16) != 0;
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
         } else if (!this.hasTeamId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasChallengeTeamId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsSkip()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGroupId()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(2, this.challengeTeamId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.isSkip_);
         }

         for(int i = 0; i < this.arrayingList_.size(); ++i) {
            output.writeBytes(4, (ByteString)this.arrayingList_.get(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.groupId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(6, this.recordId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.challengeTeamId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.isSkip_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.arrayingList_.size(); ++i) {
               dataSize += CodedOutputStream.computeBytesSizeNoTag((ByteString)this.arrayingList_.get(i));
            }

            size += dataSize;
            size += 1 * this.getArrayingListList().size();
            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.groupId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.recordId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_TeamChallenge_11810)) {
            return super.equals(obj);
         } else {
            S2CR_TeamChallenge_11810 other = (S2CR_TeamChallenge_11810)obj;
            if (this.hasTeamId() != other.hasTeamId()) {
               return false;
            } else if (this.hasTeamId() && this.getTeamId() != other.getTeamId()) {
               return false;
            } else if (this.hasChallengeTeamId() != other.hasChallengeTeamId()) {
               return false;
            } else if (this.hasChallengeTeamId() && this.getChallengeTeamId() != other.getChallengeTeamId()) {
               return false;
            } else if (this.hasIsSkip() != other.hasIsSkip()) {
               return false;
            } else if (this.hasIsSkip() && this.getIsSkip() != other.getIsSkip()) {
               return false;
            } else if (!this.getArrayingListList().equals(other.getArrayingListList())) {
               return false;
            } else if (this.hasGroupId() != other.hasGroupId()) {
               return false;
            } else if (this.hasGroupId() && this.getGroupId() != other.getGroupId()) {
               return false;
            } else if (this.hasRecordId() != other.hasRecordId()) {
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
            if (this.hasTeamId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTeamId();
            }

            if (this.hasChallengeTeamId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getChallengeTeamId();
            }

            if (this.hasIsSkip()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getIsSkip());
            }

            if (this.getArrayingListCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getArrayingListList().hashCode();
            }

            if (this.hasGroupId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getGroupId();
            }

            if (this.hasRecordId()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getRecordId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_TeamChallenge_11810 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_TeamChallenge_11810)PARSER.parseFrom(data);
      }

      public static S2CR_TeamChallenge_11810 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TeamChallenge_11810)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TeamChallenge_11810 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_TeamChallenge_11810)PARSER.parseFrom(data);
      }

      public static S2CR_TeamChallenge_11810 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TeamChallenge_11810)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TeamChallenge_11810 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_TeamChallenge_11810)PARSER.parseFrom(data);
      }

      public static S2CR_TeamChallenge_11810 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TeamChallenge_11810)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TeamChallenge_11810 parseFrom(InputStream input) throws IOException {
         return (S2CR_TeamChallenge_11810)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_TeamChallenge_11810 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TeamChallenge_11810)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_TeamChallenge_11810 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_TeamChallenge_11810)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_TeamChallenge_11810 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TeamChallenge_11810)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_TeamChallenge_11810 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_TeamChallenge_11810)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_TeamChallenge_11810 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TeamChallenge_11810)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_TeamChallenge_11810 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_TeamChallenge_11810 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_TeamChallenge_11810> parser() {
         return PARSER;
      }

      public Parser<S2CR_TeamChallenge_11810> getParserForType() {
         return PARSER;
      }

      public S2CR_TeamChallenge_11810 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_TeamChallenge_11810OrBuilder {
         private int bitField0_;
         private int teamId_;
         private int challengeTeamId_;
         private boolean isSkip_;
         private List<ByteString> arrayingList_;
         private int groupId_;
         private int recordId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamChallenge_11810_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamChallenge_11810_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_TeamChallenge_11810.class, Builder.class);
         }

         private Builder() {
            this.arrayingList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.arrayingList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossAllianceMsg.S2CR_TeamChallenge_11810.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.teamId_ = 0;
            this.bitField0_ &= -2;
            this.challengeTeamId_ = 0;
            this.bitField0_ &= -3;
            this.isSkip_ = false;
            this.bitField0_ &= -5;
            this.arrayingList_ = Collections.emptyList();
            this.bitField0_ &= -9;
            this.groupId_ = 0;
            this.bitField0_ &= -17;
            this.recordId_ = 0;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamChallenge_11810_descriptor;
         }

         public S2CR_TeamChallenge_11810 getDefaultInstanceForType() {
            return CrossAllianceMsg.S2CR_TeamChallenge_11810.getDefaultInstance();
         }

         public S2CR_TeamChallenge_11810 build() {
            S2CR_TeamChallenge_11810 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_TeamChallenge_11810 buildPartial() {
            S2CR_TeamChallenge_11810 result = new S2CR_TeamChallenge_11810(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.teamId_ = this.teamId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.challengeTeamId_ = this.challengeTeamId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.isSkip_ = this.isSkip_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.arrayingList_ = Collections.unmodifiableList(this.arrayingList_);
               this.bitField0_ &= -9;
            }

            result.arrayingList_ = this.arrayingList_;
            if ((from_bitField0_ & 16) != 0) {
               result.groupId_ = this.groupId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.recordId_ = this.recordId_;
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
            if (other instanceof S2CR_TeamChallenge_11810) {
               return this.mergeFrom((S2CR_TeamChallenge_11810)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_TeamChallenge_11810 other) {
            if (other == CrossAllianceMsg.S2CR_TeamChallenge_11810.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTeamId()) {
                  this.setTeamId(other.getTeamId());
               }

               if (other.hasChallengeTeamId()) {
                  this.setChallengeTeamId(other.getChallengeTeamId());
               }

               if (other.hasIsSkip()) {
                  this.setIsSkip(other.getIsSkip());
               }

               if (!other.arrayingList_.isEmpty()) {
                  if (this.arrayingList_.isEmpty()) {
                     this.arrayingList_ = other.arrayingList_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureArrayingListIsMutable();
                     this.arrayingList_.addAll(other.arrayingList_);
                  }

                  this.onChanged();
               }

               if (other.hasGroupId()) {
                  this.setGroupId(other.getGroupId());
               }

               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTeamId()) {
               return false;
            } else if (!this.hasChallengeTeamId()) {
               return false;
            } else if (!this.hasIsSkip()) {
               return false;
            } else {
               return this.hasGroupId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_TeamChallenge_11810 parsedMessage = null;

            try {
               parsedMessage = (S2CR_TeamChallenge_11810)CrossAllianceMsg.S2CR_TeamChallenge_11810.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_TeamChallenge_11810)e.getUnfinishedMessage();
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

         public boolean hasChallengeTeamId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getChallengeTeamId() {
            return this.challengeTeamId_;
         }

         public Builder setChallengeTeamId(int value) {
            this.bitField0_ |= 2;
            this.challengeTeamId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChallengeTeamId() {
            this.bitField0_ &= -3;
            this.challengeTeamId_ = 0;
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

         private void ensureArrayingListIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.arrayingList_ = new ArrayList(this.arrayingList_);
               this.bitField0_ |= 8;
            }

         }

         public List<ByteString> getArrayingListList() {
            return (this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.arrayingList_) : this.arrayingList_;
         }

         public int getArrayingListCount() {
            return this.arrayingList_.size();
         }

         public ByteString getArrayingList(int index) {
            return (ByteString)this.arrayingList_.get(index);
         }

         public Builder setArrayingList(int index, ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureArrayingListIsMutable();
               this.arrayingList_.set(index, value);
               this.onChanged();
               return this;
            }
         }

         public Builder addArrayingList(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureArrayingListIsMutable();
               this.arrayingList_.add(value);
               this.onChanged();
               return this;
            }
         }

         public Builder addAllArrayingList(Iterable<? extends ByteString> values) {
            this.ensureArrayingListIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.arrayingList_);
            this.onChanged();
            return this;
         }

         public Builder clearArrayingList() {
            this.arrayingList_ = Collections.emptyList();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         public boolean hasGroupId() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getGroupId() {
            return this.groupId_;
         }

         public Builder setGroupId(int value) {
            this.bitField0_ |= 16;
            this.groupId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGroupId() {
            this.bitField0_ &= -17;
            this.groupId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRecordId() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getRecordId() {
            return this.recordId_;
         }

         public Builder setRecordId(int value) {
            this.bitField0_ |= 32;
            this.recordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecordId() {
            this.bitField0_ &= -33;
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

   public static final class CR2S_TeamChallenge_11811 extends GeneratedMessageV3 implements CR2S_TeamChallenge_11811OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TEAMID_FIELD_NUMBER = 2;
      private int teamId_;
      public static final int ISSKIP_FIELD_NUMBER = 3;
      private boolean isSkip_;
      public static final int BATTLEMSG_FIELD_NUMBER = 4;
      private BattleMsg.S2C_BattleResult_6102 battleMsg_;
      public static final int RECORDINFO_FIELD_NUMBER = 5;
      private AllianceMsg.TeamBattleRecordInfo recordInfo_;
      public static final int RANK_FIELD_NUMBER = 6;
      private int rank_;
      public static final int INTEGRAL_FIELD_NUMBER = 7;
      private int integral_;
      private byte memoizedIsInitialized;
      private static final CR2S_TeamChallenge_11811 DEFAULT_INSTANCE = new CR2S_TeamChallenge_11811();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_TeamChallenge_11811> PARSER = new AbstractParser<CR2S_TeamChallenge_11811>() {
         public CR2S_TeamChallenge_11811 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_TeamChallenge_11811(input, extensionRegistry);
         }
      };

      private CR2S_TeamChallenge_11811(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_TeamChallenge_11811() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_TeamChallenge_11811();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_TeamChallenge_11811(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.teamId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.isSkip_ = input.readBool();
                        break;
                     case 34:
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 8) != 0) {
                           subBuilder = this.battleMsg_.toBuilder();
                        }

                        this.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.battleMsg_);
                           this.battleMsg_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 8;
                        break;
                     case 42:
                        AllianceMsg.TeamBattleRecordInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 16) != 0) {
                           subBuilder = this.recordInfo_.toBuilder();
                        }

                        this.recordInfo_ = (AllianceMsg.TeamBattleRecordInfo)input.readMessage(AllianceMsg.TeamBattleRecordInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.recordInfo_);
                           this.recordInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 16;
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.rank_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.integral_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamChallenge_11811_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamChallenge_11811_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_TeamChallenge_11811.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasTeamId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTeamId() {
         return this.teamId_;
      }

      public boolean hasIsSkip() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsSkip() {
         return this.isSkip_;
      }

      public boolean hasBattleMsg() {
         return (this.bitField0_ & 8) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getBattleMsg() {
         return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder() {
         return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
      }

      public boolean hasRecordInfo() {
         return (this.bitField0_ & 16) != 0;
      }

      public AllianceMsg.TeamBattleRecordInfo getRecordInfo() {
         return this.recordInfo_ == null ? AllianceMsg.TeamBattleRecordInfo.getDefaultInstance() : this.recordInfo_;
      }

      public AllianceMsg.TeamBattleRecordInfoOrBuilder getRecordInfoOrBuilder() {
         return this.recordInfo_ == null ? AllianceMsg.TeamBattleRecordInfo.getDefaultInstance() : this.recordInfo_;
      }

      public boolean hasRank() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasIntegral() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getIntegral() {
         return this.integral_;
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
         } else if (!this.hasTeamId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasBattleMsg() && !this.getBattleMsg().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasRecordInfo() && !this.getRecordInfo().isInitialized()) {
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
            output.writeInt32(2, this.teamId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.isSkip_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeMessage(4, this.getBattleMsg());
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeMessage(5, this.getRecordInfo());
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.rank_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.integral_);
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
               size += CodedOutputStream.computeInt32Size(2, this.teamId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.isSkip_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeMessageSize(4, this.getBattleMsg());
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeMessageSize(5, this.getRecordInfo());
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.rank_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.integral_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_TeamChallenge_11811)) {
            return super.equals(obj);
         } else {
            CR2S_TeamChallenge_11811 other = (CR2S_TeamChallenge_11811)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasTeamId() != other.hasTeamId()) {
               return false;
            } else if (this.hasTeamId() && this.getTeamId() != other.getTeamId()) {
               return false;
            } else if (this.hasIsSkip() != other.hasIsSkip()) {
               return false;
            } else if (this.hasIsSkip() && this.getIsSkip() != other.getIsSkip()) {
               return false;
            } else if (this.hasBattleMsg() != other.hasBattleMsg()) {
               return false;
            } else if (this.hasBattleMsg() && !this.getBattleMsg().equals(other.getBattleMsg())) {
               return false;
            } else if (this.hasRecordInfo() != other.hasRecordInfo()) {
               return false;
            } else if (this.hasRecordInfo() && !this.getRecordInfo().equals(other.getRecordInfo())) {
               return false;
            } else if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasIntegral() != other.hasIntegral()) {
               return false;
            } else if (this.hasIntegral() && this.getIntegral() != other.getIntegral()) {
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

            if (this.hasTeamId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTeamId();
            }

            if (this.hasIsSkip()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getIsSkip());
            }

            if (this.hasBattleMsg()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getBattleMsg().hashCode();
            }

            if (this.hasRecordInfo()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getRecordInfo().hashCode();
            }

            if (this.hasRank()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getRank();
            }

            if (this.hasIntegral()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getIntegral();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_TeamChallenge_11811 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_TeamChallenge_11811)PARSER.parseFrom(data);
      }

      public static CR2S_TeamChallenge_11811 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_TeamChallenge_11811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_TeamChallenge_11811 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_TeamChallenge_11811)PARSER.parseFrom(data);
      }

      public static CR2S_TeamChallenge_11811 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_TeamChallenge_11811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_TeamChallenge_11811 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_TeamChallenge_11811)PARSER.parseFrom(data);
      }

      public static CR2S_TeamChallenge_11811 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_TeamChallenge_11811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_TeamChallenge_11811 parseFrom(InputStream input) throws IOException {
         return (CR2S_TeamChallenge_11811)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_TeamChallenge_11811 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_TeamChallenge_11811)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_TeamChallenge_11811 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_TeamChallenge_11811)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_TeamChallenge_11811 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_TeamChallenge_11811)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_TeamChallenge_11811 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_TeamChallenge_11811)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_TeamChallenge_11811 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_TeamChallenge_11811)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_TeamChallenge_11811 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_TeamChallenge_11811 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_TeamChallenge_11811> parser() {
         return PARSER;
      }

      public Parser<CR2S_TeamChallenge_11811> getParserForType() {
         return PARSER;
      }

      public CR2S_TeamChallenge_11811 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_TeamChallenge_11811OrBuilder {
         private int bitField0_;
         private int result_;
         private int teamId_;
         private boolean isSkip_;
         private BattleMsg.S2C_BattleResult_6102 battleMsg_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> battleMsgBuilder_;
         private AllianceMsg.TeamBattleRecordInfo recordInfo_;
         private SingleFieldBuilderV3<AllianceMsg.TeamBattleRecordInfo, AllianceMsg.TeamBattleRecordInfo.Builder, AllianceMsg.TeamBattleRecordInfoOrBuilder> recordInfoBuilder_;
         private int rank_;
         private int integral_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamChallenge_11811_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamChallenge_11811_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_TeamChallenge_11811.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossAllianceMsg.CR2S_TeamChallenge_11811.alwaysUseFieldBuilders) {
               this.getBattleMsgFieldBuilder();
               this.getRecordInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.teamId_ = 0;
            this.bitField0_ &= -3;
            this.isSkip_ = false;
            this.bitField0_ &= -5;
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -9;
            if (this.recordInfoBuilder_ == null) {
               this.recordInfo_ = null;
            } else {
               this.recordInfoBuilder_.clear();
            }

            this.bitField0_ &= -17;
            this.rank_ = 0;
            this.bitField0_ &= -33;
            this.integral_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamChallenge_11811_descriptor;
         }

         public CR2S_TeamChallenge_11811 getDefaultInstanceForType() {
            return CrossAllianceMsg.CR2S_TeamChallenge_11811.getDefaultInstance();
         }

         public CR2S_TeamChallenge_11811 build() {
            CR2S_TeamChallenge_11811 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_TeamChallenge_11811 buildPartial() {
            CR2S_TeamChallenge_11811 result = new CR2S_TeamChallenge_11811(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.teamId_ = this.teamId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.isSkip_ = this.isSkip_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               if (this.battleMsgBuilder_ == null) {
                  result.battleMsg_ = this.battleMsg_;
               } else {
                  result.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)this.battleMsgBuilder_.build();
               }

               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               if (this.recordInfoBuilder_ == null) {
                  result.recordInfo_ = this.recordInfo_;
               } else {
                  result.recordInfo_ = (AllianceMsg.TeamBattleRecordInfo)this.recordInfoBuilder_.build();
               }

               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.integral_ = this.integral_;
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
            if (other instanceof CR2S_TeamChallenge_11811) {
               return this.mergeFrom((CR2S_TeamChallenge_11811)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_TeamChallenge_11811 other) {
            if (other == CrossAllianceMsg.CR2S_TeamChallenge_11811.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasTeamId()) {
                  this.setTeamId(other.getTeamId());
               }

               if (other.hasIsSkip()) {
                  this.setIsSkip(other.getIsSkip());
               }

               if (other.hasBattleMsg()) {
                  this.mergeBattleMsg(other.getBattleMsg());
               }

               if (other.hasRecordInfo()) {
                  this.mergeRecordInfo(other.getRecordInfo());
               }

               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasIntegral()) {
                  this.setIntegral(other.getIntegral());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasTeamId()) {
               return false;
            } else if (this.hasBattleMsg() && !this.getBattleMsg().isInitialized()) {
               return false;
            } else {
               return !this.hasRecordInfo() || this.getRecordInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_TeamChallenge_11811 parsedMessage = null;

            try {
               parsedMessage = (CR2S_TeamChallenge_11811)CrossAllianceMsg.CR2S_TeamChallenge_11811.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_TeamChallenge_11811)e.getUnfinishedMessage();
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

         public boolean hasTeamId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTeamId() {
            return this.teamId_;
         }

         public Builder setTeamId(int value) {
            this.bitField0_ |= 2;
            this.teamId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTeamId() {
            this.bitField0_ &= -3;
            this.teamId_ = 0;
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

         public boolean hasBattleMsg() {
            return (this.bitField0_ & 8) != 0;
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

            this.bitField0_ |= 8;
            return this;
         }

         public Builder setBattleMsg(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = builderForValue.build();
               this.onChanged();
            } else {
               this.battleMsgBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder mergeBattleMsg(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleMsgBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0 && this.battleMsg_ != null && this.battleMsg_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.battleMsg_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.battleMsg_).mergeFrom(value).buildPartial();
               } else {
                  this.battleMsg_ = value;
               }

               this.onChanged();
            } else {
               this.battleMsgBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder clearBattleMsg() {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
               this.onChanged();
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getBattleMsgBuilder() {
            this.bitField0_ |= 8;
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

         public boolean hasRecordInfo() {
            return (this.bitField0_ & 16) != 0;
         }

         public AllianceMsg.TeamBattleRecordInfo getRecordInfo() {
            if (this.recordInfoBuilder_ == null) {
               return this.recordInfo_ == null ? AllianceMsg.TeamBattleRecordInfo.getDefaultInstance() : this.recordInfo_;
            } else {
               return (AllianceMsg.TeamBattleRecordInfo)this.recordInfoBuilder_.getMessage();
            }
         }

         public Builder setRecordInfo(AllianceMsg.TeamBattleRecordInfo value) {
            if (this.recordInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.recordInfo_ = value;
               this.onChanged();
            } else {
               this.recordInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder setRecordInfo(AllianceMsg.TeamBattleRecordInfo.Builder builderForValue) {
            if (this.recordInfoBuilder_ == null) {
               this.recordInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.recordInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder mergeRecordInfo(AllianceMsg.TeamBattleRecordInfo value) {
            if (this.recordInfoBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0 && this.recordInfo_ != null && this.recordInfo_ != AllianceMsg.TeamBattleRecordInfo.getDefaultInstance()) {
                  this.recordInfo_ = AllianceMsg.TeamBattleRecordInfo.newBuilder(this.recordInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.recordInfo_ = value;
               }

               this.onChanged();
            } else {
               this.recordInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder clearRecordInfo() {
            if (this.recordInfoBuilder_ == null) {
               this.recordInfo_ = null;
               this.onChanged();
            } else {
               this.recordInfoBuilder_.clear();
            }

            this.bitField0_ &= -17;
            return this;
         }

         public AllianceMsg.TeamBattleRecordInfo.Builder getRecordInfoBuilder() {
            this.bitField0_ |= 16;
            this.onChanged();
            return (AllianceMsg.TeamBattleRecordInfo.Builder)this.getRecordInfoFieldBuilder().getBuilder();
         }

         public AllianceMsg.TeamBattleRecordInfoOrBuilder getRecordInfoOrBuilder() {
            if (this.recordInfoBuilder_ != null) {
               return (AllianceMsg.TeamBattleRecordInfoOrBuilder)this.recordInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.recordInfo_ == null ? AllianceMsg.TeamBattleRecordInfo.getDefaultInstance() : this.recordInfo_;
            }
         }

         private SingleFieldBuilderV3<AllianceMsg.TeamBattleRecordInfo, AllianceMsg.TeamBattleRecordInfo.Builder, AllianceMsg.TeamBattleRecordInfoOrBuilder> getRecordInfoFieldBuilder() {
            if (this.recordInfoBuilder_ == null) {
               this.recordInfoBuilder_ = new SingleFieldBuilderV3(this.getRecordInfo(), this.getParentForChildren(), this.isClean());
               this.recordInfo_ = null;
            }

            return this.recordInfoBuilder_;
         }

         public boolean hasRank() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getRank() {
            return this.rank_;
         }

         public Builder setRank(int value) {
            this.bitField0_ |= 32;
            this.rank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRank() {
            this.bitField0_ &= -33;
            this.rank_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIntegral() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getIntegral() {
            return this.integral_;
         }

         public Builder setIntegral(int value) {
            this.bitField0_ |= 64;
            this.integral_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIntegral() {
            this.bitField0_ &= -65;
            this.integral_ = 0;
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

   public static final class S2CR_AllianceGm_11812 extends GeneratedMessageV3 implements S2CR_AllianceGm_11812OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CMD_FIELD_NUMBER = 1;
      private volatile Object cmd_;
      public static final int PARAMS_FIELD_NUMBER = 2;
      private Internal.IntList params_;
      private byte memoizedIsInitialized;
      private static final S2CR_AllianceGm_11812 DEFAULT_INSTANCE = new S2CR_AllianceGm_11812();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_AllianceGm_11812> PARSER = new AbstractParser<S2CR_AllianceGm_11812>() {
         public S2CR_AllianceGm_11812 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_AllianceGm_11812(input, extensionRegistry);
         }
      };

      private S2CR_AllianceGm_11812(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_AllianceGm_11812() {
         this.memoizedIsInitialized = -1;
         this.cmd_ = "";
         this.params_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_AllianceGm_11812();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_AllianceGm_11812(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceGm_11812_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceGm_11812_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_AllianceGm_11812.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_AllianceGm_11812)) {
            return super.equals(obj);
         } else {
            S2CR_AllianceGm_11812 other = (S2CR_AllianceGm_11812)obj;
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

      public static S2CR_AllianceGm_11812 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_AllianceGm_11812)PARSER.parseFrom(data);
      }

      public static S2CR_AllianceGm_11812 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AllianceGm_11812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AllianceGm_11812 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_AllianceGm_11812)PARSER.parseFrom(data);
      }

      public static S2CR_AllianceGm_11812 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AllianceGm_11812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AllianceGm_11812 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_AllianceGm_11812)PARSER.parseFrom(data);
      }

      public static S2CR_AllianceGm_11812 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_AllianceGm_11812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_AllianceGm_11812 parseFrom(InputStream input) throws IOException {
         return (S2CR_AllianceGm_11812)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_AllianceGm_11812 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AllianceGm_11812)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_AllianceGm_11812 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_AllianceGm_11812)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_AllianceGm_11812 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AllianceGm_11812)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_AllianceGm_11812 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_AllianceGm_11812)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_AllianceGm_11812 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_AllianceGm_11812)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_AllianceGm_11812 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_AllianceGm_11812 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_AllianceGm_11812> parser() {
         return PARSER;
      }

      public Parser<S2CR_AllianceGm_11812> getParserForType() {
         return PARSER;
      }

      public S2CR_AllianceGm_11812 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_AllianceGm_11812OrBuilder {
         private int bitField0_;
         private Object cmd_;
         private Internal.IntList params_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceGm_11812_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceGm_11812_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_AllianceGm_11812.class, Builder.class);
         }

         private Builder() {
            this.cmd_ = "";
            this.params_ = CrossAllianceMsg.S2CR_AllianceGm_11812.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.cmd_ = "";
            this.params_ = CrossAllianceMsg.S2CR_AllianceGm_11812.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossAllianceMsg.S2CR_AllianceGm_11812.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.cmd_ = "";
            this.bitField0_ &= -2;
            this.params_ = CrossAllianceMsg.S2CR_AllianceGm_11812.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_AllianceGm_11812_descriptor;
         }

         public S2CR_AllianceGm_11812 getDefaultInstanceForType() {
            return CrossAllianceMsg.S2CR_AllianceGm_11812.getDefaultInstance();
         }

         public S2CR_AllianceGm_11812 build() {
            S2CR_AllianceGm_11812 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_AllianceGm_11812 buildPartial() {
            S2CR_AllianceGm_11812 result = new S2CR_AllianceGm_11812(this);
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
            if (other instanceof S2CR_AllianceGm_11812) {
               return this.mergeFrom((S2CR_AllianceGm_11812)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_AllianceGm_11812 other) {
            if (other == CrossAllianceMsg.S2CR_AllianceGm_11812.getDefaultInstance()) {
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
            S2CR_AllianceGm_11812 parsedMessage = null;

            try {
               parsedMessage = (S2CR_AllianceGm_11812)CrossAllianceMsg.S2CR_AllianceGm_11812.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_AllianceGm_11812)e.getUnfinishedMessage();
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
            this.cmd_ = CrossAllianceMsg.S2CR_AllianceGm_11812.getDefaultInstance().getCmd();
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
               this.params_ = CrossAllianceMsg.S2CR_AllianceGm_11812.mutableCopy(this.params_);
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
            this.params_ = CrossAllianceMsg.S2CR_AllianceGm_11812.emptyIntList();
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

   public static final class CR2S_TeamBeChallenge_11813 extends GeneratedMessageV3 implements CR2S_TeamBeChallenge_11813OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TEAMID_FIELD_NUMBER = 1;
      private int teamId_;
      public static final int RECORDINFO_FIELD_NUMBER = 2;
      private AllianceMsg.TeamBattleRecordInfo recordInfo_;
      public static final int RANK_FIELD_NUMBER = 3;
      private int rank_;
      public static final int INTEGRAL_FIELD_NUMBER = 4;
      private int integral_;
      private byte memoizedIsInitialized;
      private static final CR2S_TeamBeChallenge_11813 DEFAULT_INSTANCE = new CR2S_TeamBeChallenge_11813();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_TeamBeChallenge_11813> PARSER = new AbstractParser<CR2S_TeamBeChallenge_11813>() {
         public CR2S_TeamBeChallenge_11813 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_TeamBeChallenge_11813(input, extensionRegistry);
         }
      };

      private CR2S_TeamBeChallenge_11813(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_TeamBeChallenge_11813() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_TeamBeChallenge_11813();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_TeamBeChallenge_11813(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        AllianceMsg.TeamBattleRecordInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.recordInfo_.toBuilder();
                        }

                        this.recordInfo_ = (AllianceMsg.TeamBattleRecordInfo)input.readMessage(AllianceMsg.TeamBattleRecordInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.recordInfo_);
                           this.recordInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.rank_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.integral_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamBeChallenge_11813_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamBeChallenge_11813_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_TeamBeChallenge_11813.class, Builder.class);
      }

      public boolean hasTeamId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTeamId() {
         return this.teamId_;
      }

      public boolean hasRecordInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public AllianceMsg.TeamBattleRecordInfo getRecordInfo() {
         return this.recordInfo_ == null ? AllianceMsg.TeamBattleRecordInfo.getDefaultInstance() : this.recordInfo_;
      }

      public AllianceMsg.TeamBattleRecordInfoOrBuilder getRecordInfoOrBuilder() {
         return this.recordInfo_ == null ? AllianceMsg.TeamBattleRecordInfo.getDefaultInstance() : this.recordInfo_;
      }

      public boolean hasRank() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasIntegral() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getIntegral() {
         return this.integral_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTeamId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRecordInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIntegral()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getRecordInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
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
            output.writeMessage(2, this.getRecordInfo());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.rank_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.integral_);
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
               size += CodedOutputStream.computeMessageSize(2, this.getRecordInfo());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.rank_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.integral_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_TeamBeChallenge_11813)) {
            return super.equals(obj);
         } else {
            CR2S_TeamBeChallenge_11813 other = (CR2S_TeamBeChallenge_11813)obj;
            if (this.hasTeamId() != other.hasTeamId()) {
               return false;
            } else if (this.hasTeamId() && this.getTeamId() != other.getTeamId()) {
               return false;
            } else if (this.hasRecordInfo() != other.hasRecordInfo()) {
               return false;
            } else if (this.hasRecordInfo() && !this.getRecordInfo().equals(other.getRecordInfo())) {
               return false;
            } else if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasIntegral() != other.hasIntegral()) {
               return false;
            } else if (this.hasIntegral() && this.getIntegral() != other.getIntegral()) {
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

            if (this.hasRecordInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRecordInfo().hashCode();
            }

            if (this.hasRank()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRank();
            }

            if (this.hasIntegral()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getIntegral();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_TeamBeChallenge_11813 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_TeamBeChallenge_11813)PARSER.parseFrom(data);
      }

      public static CR2S_TeamBeChallenge_11813 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_TeamBeChallenge_11813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_TeamBeChallenge_11813 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_TeamBeChallenge_11813)PARSER.parseFrom(data);
      }

      public static CR2S_TeamBeChallenge_11813 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_TeamBeChallenge_11813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_TeamBeChallenge_11813 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_TeamBeChallenge_11813)PARSER.parseFrom(data);
      }

      public static CR2S_TeamBeChallenge_11813 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_TeamBeChallenge_11813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_TeamBeChallenge_11813 parseFrom(InputStream input) throws IOException {
         return (CR2S_TeamBeChallenge_11813)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_TeamBeChallenge_11813 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_TeamBeChallenge_11813)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_TeamBeChallenge_11813 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_TeamBeChallenge_11813)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_TeamBeChallenge_11813 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_TeamBeChallenge_11813)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_TeamBeChallenge_11813 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_TeamBeChallenge_11813)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_TeamBeChallenge_11813 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_TeamBeChallenge_11813)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_TeamBeChallenge_11813 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_TeamBeChallenge_11813 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_TeamBeChallenge_11813> parser() {
         return PARSER;
      }

      public Parser<CR2S_TeamBeChallenge_11813> getParserForType() {
         return PARSER;
      }

      public CR2S_TeamBeChallenge_11813 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_TeamBeChallenge_11813OrBuilder {
         private int bitField0_;
         private int teamId_;
         private AllianceMsg.TeamBattleRecordInfo recordInfo_;
         private SingleFieldBuilderV3<AllianceMsg.TeamBattleRecordInfo, AllianceMsg.TeamBattleRecordInfo.Builder, AllianceMsg.TeamBattleRecordInfoOrBuilder> recordInfoBuilder_;
         private int rank_;
         private int integral_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamBeChallenge_11813_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamBeChallenge_11813_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_TeamBeChallenge_11813.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossAllianceMsg.CR2S_TeamBeChallenge_11813.alwaysUseFieldBuilders) {
               this.getRecordInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.teamId_ = 0;
            this.bitField0_ &= -2;
            if (this.recordInfoBuilder_ == null) {
               this.recordInfo_ = null;
            } else {
               this.recordInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            this.rank_ = 0;
            this.bitField0_ &= -5;
            this.integral_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamBeChallenge_11813_descriptor;
         }

         public CR2S_TeamBeChallenge_11813 getDefaultInstanceForType() {
            return CrossAllianceMsg.CR2S_TeamBeChallenge_11813.getDefaultInstance();
         }

         public CR2S_TeamBeChallenge_11813 build() {
            CR2S_TeamBeChallenge_11813 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_TeamBeChallenge_11813 buildPartial() {
            CR2S_TeamBeChallenge_11813 result = new CR2S_TeamBeChallenge_11813(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.teamId_ = this.teamId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.recordInfoBuilder_ == null) {
                  result.recordInfo_ = this.recordInfo_;
               } else {
                  result.recordInfo_ = (AllianceMsg.TeamBattleRecordInfo)this.recordInfoBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.integral_ = this.integral_;
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
            if (other instanceof CR2S_TeamBeChallenge_11813) {
               return this.mergeFrom((CR2S_TeamBeChallenge_11813)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_TeamBeChallenge_11813 other) {
            if (other == CrossAllianceMsg.CR2S_TeamBeChallenge_11813.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTeamId()) {
                  this.setTeamId(other.getTeamId());
               }

               if (other.hasRecordInfo()) {
                  this.mergeRecordInfo(other.getRecordInfo());
               }

               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasIntegral()) {
                  this.setIntegral(other.getIntegral());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTeamId()) {
               return false;
            } else if (!this.hasRecordInfo()) {
               return false;
            } else if (!this.hasRank()) {
               return false;
            } else if (!this.hasIntegral()) {
               return false;
            } else {
               return this.getRecordInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_TeamBeChallenge_11813 parsedMessage = null;

            try {
               parsedMessage = (CR2S_TeamBeChallenge_11813)CrossAllianceMsg.CR2S_TeamBeChallenge_11813.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_TeamBeChallenge_11813)e.getUnfinishedMessage();
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

         public boolean hasRecordInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public AllianceMsg.TeamBattleRecordInfo getRecordInfo() {
            if (this.recordInfoBuilder_ == null) {
               return this.recordInfo_ == null ? AllianceMsg.TeamBattleRecordInfo.getDefaultInstance() : this.recordInfo_;
            } else {
               return (AllianceMsg.TeamBattleRecordInfo)this.recordInfoBuilder_.getMessage();
            }
         }

         public Builder setRecordInfo(AllianceMsg.TeamBattleRecordInfo value) {
            if (this.recordInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.recordInfo_ = value;
               this.onChanged();
            } else {
               this.recordInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setRecordInfo(AllianceMsg.TeamBattleRecordInfo.Builder builderForValue) {
            if (this.recordInfoBuilder_ == null) {
               this.recordInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.recordInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeRecordInfo(AllianceMsg.TeamBattleRecordInfo value) {
            if (this.recordInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.recordInfo_ != null && this.recordInfo_ != AllianceMsg.TeamBattleRecordInfo.getDefaultInstance()) {
                  this.recordInfo_ = AllianceMsg.TeamBattleRecordInfo.newBuilder(this.recordInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.recordInfo_ = value;
               }

               this.onChanged();
            } else {
               this.recordInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearRecordInfo() {
            if (this.recordInfoBuilder_ == null) {
               this.recordInfo_ = null;
               this.onChanged();
            } else {
               this.recordInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public AllianceMsg.TeamBattleRecordInfo.Builder getRecordInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (AllianceMsg.TeamBattleRecordInfo.Builder)this.getRecordInfoFieldBuilder().getBuilder();
         }

         public AllianceMsg.TeamBattleRecordInfoOrBuilder getRecordInfoOrBuilder() {
            if (this.recordInfoBuilder_ != null) {
               return (AllianceMsg.TeamBattleRecordInfoOrBuilder)this.recordInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.recordInfo_ == null ? AllianceMsg.TeamBattleRecordInfo.getDefaultInstance() : this.recordInfo_;
            }
         }

         private SingleFieldBuilderV3<AllianceMsg.TeamBattleRecordInfo, AllianceMsg.TeamBattleRecordInfo.Builder, AllianceMsg.TeamBattleRecordInfoOrBuilder> getRecordInfoFieldBuilder() {
            if (this.recordInfoBuilder_ == null) {
               this.recordInfoBuilder_ = new SingleFieldBuilderV3(this.getRecordInfo(), this.getParentForChildren(), this.isClean());
               this.recordInfo_ = null;
            }

            return this.recordInfoBuilder_;
         }

         public boolean hasRank() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getRank() {
            return this.rank_;
         }

         public Builder setRank(int value) {
            this.bitField0_ |= 4;
            this.rank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRank() {
            this.bitField0_ &= -5;
            this.rank_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIntegral() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getIntegral() {
            return this.integral_;
         }

         public Builder setIntegral(int value) {
            this.bitField0_ |= 8;
            this.integral_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIntegral() {
            this.bitField0_ &= -9;
            this.integral_ = 0;
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

   public static final class S2CR_TeamInfo_11814 extends GeneratedMessageV3 implements S2CR_TeamInfo_11814OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TEAMID_FIELD_NUMBER = 1;
      private int teamId_;
      private byte memoizedIsInitialized;
      private static final S2CR_TeamInfo_11814 DEFAULT_INSTANCE = new S2CR_TeamInfo_11814();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_TeamInfo_11814> PARSER = new AbstractParser<S2CR_TeamInfo_11814>() {
         public S2CR_TeamInfo_11814 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_TeamInfo_11814(input, extensionRegistry);
         }
      };

      private S2CR_TeamInfo_11814(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_TeamInfo_11814() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_TeamInfo_11814();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_TeamInfo_11814(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamInfo_11814_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamInfo_11814_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_TeamInfo_11814.class, Builder.class);
      }

      public boolean hasTeamId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTeamId() {
         return this.teamId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
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
            output.writeInt32(1, this.teamId_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_TeamInfo_11814)) {
            return super.equals(obj);
         } else {
            S2CR_TeamInfo_11814 other = (S2CR_TeamInfo_11814)obj;
            if (this.hasTeamId() != other.hasTeamId()) {
               return false;
            } else if (this.hasTeamId() && this.getTeamId() != other.getTeamId()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_TeamInfo_11814 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_TeamInfo_11814)PARSER.parseFrom(data);
      }

      public static S2CR_TeamInfo_11814 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TeamInfo_11814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TeamInfo_11814 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_TeamInfo_11814)PARSER.parseFrom(data);
      }

      public static S2CR_TeamInfo_11814 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TeamInfo_11814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TeamInfo_11814 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_TeamInfo_11814)PARSER.parseFrom(data);
      }

      public static S2CR_TeamInfo_11814 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TeamInfo_11814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TeamInfo_11814 parseFrom(InputStream input) throws IOException {
         return (S2CR_TeamInfo_11814)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_TeamInfo_11814 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TeamInfo_11814)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_TeamInfo_11814 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_TeamInfo_11814)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_TeamInfo_11814 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TeamInfo_11814)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_TeamInfo_11814 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_TeamInfo_11814)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_TeamInfo_11814 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TeamInfo_11814)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_TeamInfo_11814 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_TeamInfo_11814 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_TeamInfo_11814> parser() {
         return PARSER;
      }

      public Parser<S2CR_TeamInfo_11814> getParserForType() {
         return PARSER;
      }

      public S2CR_TeamInfo_11814 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_TeamInfo_11814OrBuilder {
         private int bitField0_;
         private int teamId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamInfo_11814_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamInfo_11814_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_TeamInfo_11814.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossAllianceMsg.S2CR_TeamInfo_11814.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.teamId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamInfo_11814_descriptor;
         }

         public S2CR_TeamInfo_11814 getDefaultInstanceForType() {
            return CrossAllianceMsg.S2CR_TeamInfo_11814.getDefaultInstance();
         }

         public S2CR_TeamInfo_11814 build() {
            S2CR_TeamInfo_11814 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_TeamInfo_11814 buildPartial() {
            S2CR_TeamInfo_11814 result = new S2CR_TeamInfo_11814(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.teamId_ = this.teamId_;
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
            if (other instanceof S2CR_TeamInfo_11814) {
               return this.mergeFrom((S2CR_TeamInfo_11814)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_TeamInfo_11814 other) {
            if (other == CrossAllianceMsg.S2CR_TeamInfo_11814.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTeamId()) {
                  this.setTeamId(other.getTeamId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTeamId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_TeamInfo_11814 parsedMessage = null;

            try {
               parsedMessage = (S2CR_TeamInfo_11814)CrossAllianceMsg.S2CR_TeamInfo_11814.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_TeamInfo_11814)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_TeamInfo_11815 extends GeneratedMessageV3 implements CR2S_TeamInfo_11815OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TEAMINFO_FIELD_NUMBER = 1;
      private AllianceMsg.TeamInfo teamInfo_;
      private byte memoizedIsInitialized;
      private static final CR2S_TeamInfo_11815 DEFAULT_INSTANCE = new CR2S_TeamInfo_11815();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_TeamInfo_11815> PARSER = new AbstractParser<CR2S_TeamInfo_11815>() {
         public CR2S_TeamInfo_11815 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_TeamInfo_11815(input, extensionRegistry);
         }
      };

      private CR2S_TeamInfo_11815(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_TeamInfo_11815() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_TeamInfo_11815();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_TeamInfo_11815(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        AllianceMsg.TeamInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.teamInfo_.toBuilder();
                        }

                        this.teamInfo_ = (AllianceMsg.TeamInfo)input.readMessage(AllianceMsg.TeamInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.teamInfo_);
                           this.teamInfo_ = subBuilder.buildPartial();
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
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamInfo_11815_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamInfo_11815_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_TeamInfo_11815.class, Builder.class);
      }

      public boolean hasTeamInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public AllianceMsg.TeamInfo getTeamInfo() {
         return this.teamInfo_ == null ? AllianceMsg.TeamInfo.getDefaultInstance() : this.teamInfo_;
      }

      public AllianceMsg.TeamInfoOrBuilder getTeamInfoOrBuilder() {
         return this.teamInfo_ == null ? AllianceMsg.TeamInfo.getDefaultInstance() : this.teamInfo_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (this.hasTeamInfo() && !this.getTeamInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getTeamInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getTeamInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_TeamInfo_11815)) {
            return super.equals(obj);
         } else {
            CR2S_TeamInfo_11815 other = (CR2S_TeamInfo_11815)obj;
            if (this.hasTeamInfo() != other.hasTeamInfo()) {
               return false;
            } else if (this.hasTeamInfo() && !this.getTeamInfo().equals(other.getTeamInfo())) {
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
            if (this.hasTeamInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTeamInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_TeamInfo_11815 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_TeamInfo_11815)PARSER.parseFrom(data);
      }

      public static CR2S_TeamInfo_11815 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_TeamInfo_11815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_TeamInfo_11815 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_TeamInfo_11815)PARSER.parseFrom(data);
      }

      public static CR2S_TeamInfo_11815 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_TeamInfo_11815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_TeamInfo_11815 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_TeamInfo_11815)PARSER.parseFrom(data);
      }

      public static CR2S_TeamInfo_11815 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_TeamInfo_11815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_TeamInfo_11815 parseFrom(InputStream input) throws IOException {
         return (CR2S_TeamInfo_11815)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_TeamInfo_11815 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_TeamInfo_11815)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_TeamInfo_11815 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_TeamInfo_11815)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_TeamInfo_11815 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_TeamInfo_11815)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_TeamInfo_11815 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_TeamInfo_11815)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_TeamInfo_11815 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_TeamInfo_11815)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_TeamInfo_11815 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_TeamInfo_11815 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_TeamInfo_11815> parser() {
         return PARSER;
      }

      public Parser<CR2S_TeamInfo_11815> getParserForType() {
         return PARSER;
      }

      public CR2S_TeamInfo_11815 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_TeamInfo_11815OrBuilder {
         private int bitField0_;
         private AllianceMsg.TeamInfo teamInfo_;
         private SingleFieldBuilderV3<AllianceMsg.TeamInfo, AllianceMsg.TeamInfo.Builder, AllianceMsg.TeamInfoOrBuilder> teamInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamInfo_11815_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamInfo_11815_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_TeamInfo_11815.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossAllianceMsg.CR2S_TeamInfo_11815.alwaysUseFieldBuilders) {
               this.getTeamInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.teamInfoBuilder_ == null) {
               this.teamInfo_ = null;
            } else {
               this.teamInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_TeamInfo_11815_descriptor;
         }

         public CR2S_TeamInfo_11815 getDefaultInstanceForType() {
            return CrossAllianceMsg.CR2S_TeamInfo_11815.getDefaultInstance();
         }

         public CR2S_TeamInfo_11815 build() {
            CR2S_TeamInfo_11815 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_TeamInfo_11815 buildPartial() {
            CR2S_TeamInfo_11815 result = new CR2S_TeamInfo_11815(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.teamInfoBuilder_ == null) {
                  result.teamInfo_ = this.teamInfo_;
               } else {
                  result.teamInfo_ = (AllianceMsg.TeamInfo)this.teamInfoBuilder_.build();
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
            if (other instanceof CR2S_TeamInfo_11815) {
               return this.mergeFrom((CR2S_TeamInfo_11815)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_TeamInfo_11815 other) {
            if (other == CrossAllianceMsg.CR2S_TeamInfo_11815.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTeamInfo()) {
                  this.mergeTeamInfo(other.getTeamInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return !this.hasTeamInfo() || this.getTeamInfo().isInitialized();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_TeamInfo_11815 parsedMessage = null;

            try {
               parsedMessage = (CR2S_TeamInfo_11815)CrossAllianceMsg.CR2S_TeamInfo_11815.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_TeamInfo_11815)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTeamInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public AllianceMsg.TeamInfo getTeamInfo() {
            if (this.teamInfoBuilder_ == null) {
               return this.teamInfo_ == null ? AllianceMsg.TeamInfo.getDefaultInstance() : this.teamInfo_;
            } else {
               return (AllianceMsg.TeamInfo)this.teamInfoBuilder_.getMessage();
            }
         }

         public Builder setTeamInfo(AllianceMsg.TeamInfo value) {
            if (this.teamInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.teamInfo_ = value;
               this.onChanged();
            } else {
               this.teamInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setTeamInfo(AllianceMsg.TeamInfo.Builder builderForValue) {
            if (this.teamInfoBuilder_ == null) {
               this.teamInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.teamInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeTeamInfo(AllianceMsg.TeamInfo value) {
            if (this.teamInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.teamInfo_ != null && this.teamInfo_ != AllianceMsg.TeamInfo.getDefaultInstance()) {
                  this.teamInfo_ = AllianceMsg.TeamInfo.newBuilder(this.teamInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.teamInfo_ = value;
               }

               this.onChanged();
            } else {
               this.teamInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearTeamInfo() {
            if (this.teamInfoBuilder_ == null) {
               this.teamInfo_ = null;
               this.onChanged();
            } else {
               this.teamInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public AllianceMsg.TeamInfo.Builder getTeamInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (AllianceMsg.TeamInfo.Builder)this.getTeamInfoFieldBuilder().getBuilder();
         }

         public AllianceMsg.TeamInfoOrBuilder getTeamInfoOrBuilder() {
            if (this.teamInfoBuilder_ != null) {
               return (AllianceMsg.TeamInfoOrBuilder)this.teamInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.teamInfo_ == null ? AllianceMsg.TeamInfo.getDefaultInstance() : this.teamInfo_;
            }
         }

         private SingleFieldBuilderV3<AllianceMsg.TeamInfo, AllianceMsg.TeamInfo.Builder, AllianceMsg.TeamInfoOrBuilder> getTeamInfoFieldBuilder() {
            if (this.teamInfoBuilder_ == null) {
               this.teamInfoBuilder_ = new SingleFieldBuilderV3(this.getTeamInfo(), this.getParentForChildren(), this.isClean());
               this.teamInfo_ = null;
            }

            return this.teamInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_RankReward_11816 extends GeneratedMessageV3 implements CR2S_RankReward_11816OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANKS_FIELD_NUMBER = 1;
      private List<RankMsg.RankData> ranks_;
      public static final int NORMAL_FIELD_NUMBER = 2;
      private boolean normal_;
      private byte memoizedIsInitialized;
      private static final CR2S_RankReward_11816 DEFAULT_INSTANCE = new CR2S_RankReward_11816();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_RankReward_11816> PARSER = new AbstractParser<CR2S_RankReward_11816>() {
         public CR2S_RankReward_11816 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_RankReward_11816(input, extensionRegistry);
         }
      };

      private CR2S_RankReward_11816(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_RankReward_11816() {
         this.memoizedIsInitialized = -1;
         this.ranks_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_RankReward_11816();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_RankReward_11816(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 1;
                        this.normal_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_RankReward_11816_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_RankReward_11816_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_RankReward_11816.class, Builder.class);
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

      public boolean hasNormal() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getNormal() {
         return this.normal_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasNormal()) {
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
         for(int i = 0; i < this.ranks_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.ranks_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(2, this.normal_);
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
               size += CodedOutputStream.computeBoolSize(2, this.normal_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_RankReward_11816)) {
            return super.equals(obj);
         } else {
            CR2S_RankReward_11816 other = (CR2S_RankReward_11816)obj;
            if (!this.getRanksList().equals(other.getRanksList())) {
               return false;
            } else if (this.hasNormal() != other.hasNormal()) {
               return false;
            } else if (this.hasNormal() && this.getNormal() != other.getNormal()) {
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

            if (this.hasNormal()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getNormal());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_RankReward_11816 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_RankReward_11816)PARSER.parseFrom(data);
      }

      public static CR2S_RankReward_11816 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RankReward_11816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RankReward_11816 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_RankReward_11816)PARSER.parseFrom(data);
      }

      public static CR2S_RankReward_11816 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RankReward_11816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RankReward_11816 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_RankReward_11816)PARSER.parseFrom(data);
      }

      public static CR2S_RankReward_11816 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RankReward_11816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RankReward_11816 parseFrom(InputStream input) throws IOException {
         return (CR2S_RankReward_11816)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_RankReward_11816 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RankReward_11816)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_RankReward_11816 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_RankReward_11816)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_RankReward_11816 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RankReward_11816)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_RankReward_11816 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_RankReward_11816)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_RankReward_11816 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RankReward_11816)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_RankReward_11816 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_RankReward_11816 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_RankReward_11816> parser() {
         return PARSER;
      }

      public Parser<CR2S_RankReward_11816> getParserForType() {
         return PARSER;
      }

      public CR2S_RankReward_11816 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_RankReward_11816OrBuilder {
         private int bitField0_;
         private List<RankMsg.RankData> ranks_;
         private RepeatedFieldBuilderV3<RankMsg.RankData, RankMsg.RankData.Builder, RankMsg.RankDataOrBuilder> ranksBuilder_;
         private boolean normal_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_RankReward_11816_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_RankReward_11816_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_RankReward_11816.class, Builder.class);
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
            if (CrossAllianceMsg.CR2S_RankReward_11816.alwaysUseFieldBuilders) {
               this.getRanksFieldBuilder();
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

            this.normal_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_RankReward_11816_descriptor;
         }

         public CR2S_RankReward_11816 getDefaultInstanceForType() {
            return CrossAllianceMsg.CR2S_RankReward_11816.getDefaultInstance();
         }

         public CR2S_RankReward_11816 build() {
            CR2S_RankReward_11816 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_RankReward_11816 buildPartial() {
            CR2S_RankReward_11816 result = new CR2S_RankReward_11816(this);
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
               result.normal_ = this.normal_;
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
            if (other instanceof CR2S_RankReward_11816) {
               return this.mergeFrom((CR2S_RankReward_11816)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_RankReward_11816 other) {
            if (other == CrossAllianceMsg.CR2S_RankReward_11816.getDefaultInstance()) {
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
                     this.ranksBuilder_ = CrossAllianceMsg.CR2S_RankReward_11816.alwaysUseFieldBuilders ? this.getRanksFieldBuilder() : null;
                  } else {
                     this.ranksBuilder_.addAllMessages(other.ranks_);
                  }
               }

               if (other.hasNormal()) {
                  this.setNormal(other.getNormal());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasNormal()) {
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
            CR2S_RankReward_11816 parsedMessage = null;

            try {
               parsedMessage = (CR2S_RankReward_11816)CrossAllianceMsg.CR2S_RankReward_11816.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_RankReward_11816)e.getUnfinishedMessage();
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
               this.ranksBuilder_ = new RepeatedFieldBuilderV3(this.ranks_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.ranks_ = null;
            }

            return this.ranksBuilder_;
         }

         public boolean hasNormal() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getNormal() {
            return this.normal_;
         }

         public Builder setNormal(boolean value) {
            this.bitField0_ |= 2;
            this.normal_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNormal() {
            this.bitField0_ &= -3;
            this.normal_ = false;
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

   public static final class S2CR_RankReward_11817 extends GeneratedMessageV3 implements S2CR_RankReward_11817OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TEAMIDS_FIELD_NUMBER = 1;
      private Internal.IntList teamIds_;
      private byte memoizedIsInitialized;
      private static final S2CR_RankReward_11817 DEFAULT_INSTANCE = new S2CR_RankReward_11817();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_RankReward_11817> PARSER = new AbstractParser<S2CR_RankReward_11817>() {
         public S2CR_RankReward_11817 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_RankReward_11817(input, extensionRegistry);
         }
      };

      private S2CR_RankReward_11817(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_RankReward_11817() {
         this.memoizedIsInitialized = -1;
         this.teamIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_RankReward_11817();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_RankReward_11817(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.teamIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.teamIds_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.teamIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.teamIds_.addInt(input.readInt32());
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
                  this.teamIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_RankReward_11817_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_RankReward_11817_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_RankReward_11817.class, Builder.class);
      }

      public List<Integer> getTeamIdsList() {
         return this.teamIds_;
      }

      public int getTeamIdsCount() {
         return this.teamIds_.size();
      }

      public int getTeamIds(int index) {
         return this.teamIds_.getInt(index);
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
         for(int i = 0; i < this.teamIds_.size(); ++i) {
            output.writeInt32(1, this.teamIds_.getInt(i));
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

            for(int i = 0; i < this.teamIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.teamIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTeamIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_RankReward_11817)) {
            return super.equals(obj);
         } else {
            S2CR_RankReward_11817 other = (S2CR_RankReward_11817)obj;
            if (!this.getTeamIdsList().equals(other.getTeamIdsList())) {
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
            if (this.getTeamIdsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTeamIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_RankReward_11817 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_RankReward_11817)PARSER.parseFrom(data);
      }

      public static S2CR_RankReward_11817 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RankReward_11817)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RankReward_11817 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_RankReward_11817)PARSER.parseFrom(data);
      }

      public static S2CR_RankReward_11817 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RankReward_11817)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RankReward_11817 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_RankReward_11817)PARSER.parseFrom(data);
      }

      public static S2CR_RankReward_11817 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RankReward_11817)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RankReward_11817 parseFrom(InputStream input) throws IOException {
         return (S2CR_RankReward_11817)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_RankReward_11817 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RankReward_11817)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_RankReward_11817 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_RankReward_11817)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_RankReward_11817 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RankReward_11817)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_RankReward_11817 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_RankReward_11817)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_RankReward_11817 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RankReward_11817)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_RankReward_11817 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_RankReward_11817 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_RankReward_11817> parser() {
         return PARSER;
      }

      public Parser<S2CR_RankReward_11817> getParserForType() {
         return PARSER;
      }

      public S2CR_RankReward_11817 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_RankReward_11817OrBuilder {
         private int bitField0_;
         private Internal.IntList teamIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_RankReward_11817_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_RankReward_11817_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_RankReward_11817.class, Builder.class);
         }

         private Builder() {
            this.teamIds_ = CrossAllianceMsg.S2CR_RankReward_11817.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.teamIds_ = CrossAllianceMsg.S2CR_RankReward_11817.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossAllianceMsg.S2CR_RankReward_11817.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.teamIds_ = CrossAllianceMsg.S2CR_RankReward_11817.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_RankReward_11817_descriptor;
         }

         public S2CR_RankReward_11817 getDefaultInstanceForType() {
            return CrossAllianceMsg.S2CR_RankReward_11817.getDefaultInstance();
         }

         public S2CR_RankReward_11817 build() {
            S2CR_RankReward_11817 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_RankReward_11817 buildPartial() {
            S2CR_RankReward_11817 result = new S2CR_RankReward_11817(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.teamIds_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.teamIds_ = this.teamIds_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_RankReward_11817) {
               return this.mergeFrom((S2CR_RankReward_11817)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_RankReward_11817 other) {
            if (other == CrossAllianceMsg.S2CR_RankReward_11817.getDefaultInstance()) {
               return this;
            } else {
               if (!other.teamIds_.isEmpty()) {
                  if (this.teamIds_.isEmpty()) {
                     this.teamIds_ = other.teamIds_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureTeamIdsIsMutable();
                     this.teamIds_.addAll(other.teamIds_);
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
            S2CR_RankReward_11817 parsedMessage = null;

            try {
               parsedMessage = (S2CR_RankReward_11817)CrossAllianceMsg.S2CR_RankReward_11817.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_RankReward_11817)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTeamIdsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.teamIds_ = CrossAllianceMsg.S2CR_RankReward_11817.mutableCopy(this.teamIds_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getTeamIdsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.teamIds_) : this.teamIds_);
         }

         public int getTeamIdsCount() {
            return this.teamIds_.size();
         }

         public int getTeamIds(int index) {
            return this.teamIds_.getInt(index);
         }

         public Builder setTeamIds(int index, int value) {
            this.ensureTeamIdsIsMutable();
            this.teamIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTeamIds(int value) {
            this.ensureTeamIdsIsMutable();
            this.teamIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTeamIds(Iterable<? extends Integer> values) {
            this.ensureTeamIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.teamIds_);
            this.onChanged();
            return this;
         }

         public Builder clearTeamIds() {
            this.teamIds_ = CrossAllianceMsg.S2CR_RankReward_11817.emptyIntList();
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

   public static final class CR2S_CreateRobot_11818 extends GeneratedMessageV3 implements CR2S_CreateRobot_11818OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final CR2S_CreateRobot_11818 DEFAULT_INSTANCE = new CR2S_CreateRobot_11818();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_CreateRobot_11818> PARSER = new AbstractParser<CR2S_CreateRobot_11818>() {
         public CR2S_CreateRobot_11818 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_CreateRobot_11818(input, extensionRegistry);
         }
      };

      private CR2S_CreateRobot_11818(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_CreateRobot_11818() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_CreateRobot_11818();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_CreateRobot_11818(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_CreateRobot_11818_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_CreateRobot_11818_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_CreateRobot_11818.class, Builder.class);
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
         } else if (!(obj instanceof CR2S_CreateRobot_11818)) {
            return super.equals(obj);
         } else {
            CR2S_CreateRobot_11818 other = (CR2S_CreateRobot_11818)obj;
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

      public static CR2S_CreateRobot_11818 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_CreateRobot_11818)PARSER.parseFrom(data);
      }

      public static CR2S_CreateRobot_11818 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_CreateRobot_11818)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_CreateRobot_11818 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_CreateRobot_11818)PARSER.parseFrom(data);
      }

      public static CR2S_CreateRobot_11818 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_CreateRobot_11818)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_CreateRobot_11818 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_CreateRobot_11818)PARSER.parseFrom(data);
      }

      public static CR2S_CreateRobot_11818 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_CreateRobot_11818)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_CreateRobot_11818 parseFrom(InputStream input) throws IOException {
         return (CR2S_CreateRobot_11818)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_CreateRobot_11818 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_CreateRobot_11818)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_CreateRobot_11818 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_CreateRobot_11818)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_CreateRobot_11818 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_CreateRobot_11818)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_CreateRobot_11818 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_CreateRobot_11818)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_CreateRobot_11818 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_CreateRobot_11818)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_CreateRobot_11818 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_CreateRobot_11818 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_CreateRobot_11818> parser() {
         return PARSER;
      }

      public Parser<CR2S_CreateRobot_11818> getParserForType() {
         return PARSER;
      }

      public CR2S_CreateRobot_11818 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_CreateRobot_11818OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_CreateRobot_11818_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_CreateRobot_11818_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_CreateRobot_11818.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossAllianceMsg.CR2S_CreateRobot_11818.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_CR2S_CreateRobot_11818_descriptor;
         }

         public CR2S_CreateRobot_11818 getDefaultInstanceForType() {
            return CrossAllianceMsg.CR2S_CreateRobot_11818.getDefaultInstance();
         }

         public CR2S_CreateRobot_11818 build() {
            CR2S_CreateRobot_11818 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_CreateRobot_11818 buildPartial() {
            CR2S_CreateRobot_11818 result = new CR2S_CreateRobot_11818(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_CreateRobot_11818) {
               return this.mergeFrom((CR2S_CreateRobot_11818)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_CreateRobot_11818 other) {
            if (other == CrossAllianceMsg.CR2S_CreateRobot_11818.getDefaultInstance()) {
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
            CR2S_CreateRobot_11818 parsedMessage = null;

            try {
               parsedMessage = (CR2S_CreateRobot_11818)CrossAllianceMsg.CR2S_CreateRobot_11818.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_CreateRobot_11818)e.getUnfinishedMessage();
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

   public static final class S2CR_TeamNameChange_11819 extends GeneratedMessageV3 implements S2CR_TeamNameChange_11819OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TEAMID_FIELD_NUMBER = 1;
      private int teamId_;
      public static final int TEAMNAME_FIELD_NUMBER = 2;
      private volatile Object teamName_;
      private byte memoizedIsInitialized;
      private static final S2CR_TeamNameChange_11819 DEFAULT_INSTANCE = new S2CR_TeamNameChange_11819();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_TeamNameChange_11819> PARSER = new AbstractParser<S2CR_TeamNameChange_11819>() {
         public S2CR_TeamNameChange_11819 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_TeamNameChange_11819(input, extensionRegistry);
         }
      };

      private S2CR_TeamNameChange_11819(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_TeamNameChange_11819() {
         this.memoizedIsInitialized = -1;
         this.teamName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_TeamNameChange_11819();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_TeamNameChange_11819(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamNameChange_11819_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamNameChange_11819_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_TeamNameChange_11819.class, Builder.class);
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

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTeamId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTeamName()) {
            this.memoizedIsInitialized = 0;
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_TeamNameChange_11819)) {
            return super.equals(obj);
         } else {
            S2CR_TeamNameChange_11819 other = (S2CR_TeamNameChange_11819)obj;
            if (this.hasTeamId() != other.hasTeamId()) {
               return false;
            } else if (this.hasTeamId() && this.getTeamId() != other.getTeamId()) {
               return false;
            } else if (this.hasTeamName() != other.hasTeamName()) {
               return false;
            } else if (this.hasTeamName() && !this.getTeamName().equals(other.getTeamName())) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_TeamNameChange_11819 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_TeamNameChange_11819)PARSER.parseFrom(data);
      }

      public static S2CR_TeamNameChange_11819 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TeamNameChange_11819)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TeamNameChange_11819 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_TeamNameChange_11819)PARSER.parseFrom(data);
      }

      public static S2CR_TeamNameChange_11819 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TeamNameChange_11819)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TeamNameChange_11819 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_TeamNameChange_11819)PARSER.parseFrom(data);
      }

      public static S2CR_TeamNameChange_11819 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_TeamNameChange_11819)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_TeamNameChange_11819 parseFrom(InputStream input) throws IOException {
         return (S2CR_TeamNameChange_11819)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_TeamNameChange_11819 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TeamNameChange_11819)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_TeamNameChange_11819 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_TeamNameChange_11819)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_TeamNameChange_11819 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TeamNameChange_11819)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_TeamNameChange_11819 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_TeamNameChange_11819)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_TeamNameChange_11819 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_TeamNameChange_11819)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_TeamNameChange_11819 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_TeamNameChange_11819 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_TeamNameChange_11819> parser() {
         return PARSER;
      }

      public Parser<S2CR_TeamNameChange_11819> getParserForType() {
         return PARSER;
      }

      public S2CR_TeamNameChange_11819 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_TeamNameChange_11819OrBuilder {
         private int bitField0_;
         private int teamId_;
         private Object teamName_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamNameChange_11819_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamNameChange_11819_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_TeamNameChange_11819.class, Builder.class);
         }

         private Builder() {
            this.teamName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.teamName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossAllianceMsg.S2CR_TeamNameChange_11819.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.teamId_ = 0;
            this.bitField0_ &= -2;
            this.teamName_ = "";
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_TeamNameChange_11819_descriptor;
         }

         public S2CR_TeamNameChange_11819 getDefaultInstanceForType() {
            return CrossAllianceMsg.S2CR_TeamNameChange_11819.getDefaultInstance();
         }

         public S2CR_TeamNameChange_11819 build() {
            S2CR_TeamNameChange_11819 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_TeamNameChange_11819 buildPartial() {
            S2CR_TeamNameChange_11819 result = new S2CR_TeamNameChange_11819(this);
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
            if (other instanceof S2CR_TeamNameChange_11819) {
               return this.mergeFrom((S2CR_TeamNameChange_11819)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_TeamNameChange_11819 other) {
            if (other == CrossAllianceMsg.S2CR_TeamNameChange_11819.getDefaultInstance()) {
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

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTeamId()) {
               return false;
            } else {
               return this.hasTeamName();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_TeamNameChange_11819 parsedMessage = null;

            try {
               parsedMessage = (S2CR_TeamNameChange_11819)CrossAllianceMsg.S2CR_TeamNameChange_11819.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_TeamNameChange_11819)e.getUnfinishedMessage();
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
            this.teamName_ = CrossAllianceMsg.S2CR_TeamNameChange_11819.getDefaultInstance().getTeamName();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_UploadArraying_11820 extends GeneratedMessageV3 implements S2CR_UploadArraying_11820OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TEAMID_FIELD_NUMBER = 1;
      private int teamId_;
      public static final int ARRAYINGDATA_FIELD_NUMBER = 2;
      private ByteString arrayingData_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadArraying_11820 DEFAULT_INSTANCE = new S2CR_UploadArraying_11820();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadArraying_11820> PARSER = new AbstractParser<S2CR_UploadArraying_11820>() {
         public S2CR_UploadArraying_11820 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadArraying_11820(input, extensionRegistry);
         }
      };

      private S2CR_UploadArraying_11820(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadArraying_11820() {
         this.memoizedIsInitialized = -1;
         this.arrayingData_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadArraying_11820();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadArraying_11820(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bitField0_ |= 2;
                        this.arrayingData_ = input.readBytes();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_UploadArraying_11820_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_UploadArraying_11820_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadArraying_11820.class, Builder.class);
      }

      public boolean hasTeamId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTeamId() {
         return this.teamId_;
      }

      public boolean hasArrayingData() {
         return (this.bitField0_ & 2) != 0;
      }

      public ByteString getArrayingData() {
         return this.arrayingData_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTeamId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasArrayingData()) {
            this.memoizedIsInitialized = 0;
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
            output.writeBytes(2, this.arrayingData_);
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
               size += CodedOutputStream.computeBytesSize(2, this.arrayingData_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadArraying_11820)) {
            return super.equals(obj);
         } else {
            S2CR_UploadArraying_11820 other = (S2CR_UploadArraying_11820)obj;
            if (this.hasTeamId() != other.hasTeamId()) {
               return false;
            } else if (this.hasTeamId() && this.getTeamId() != other.getTeamId()) {
               return false;
            } else if (this.hasArrayingData() != other.hasArrayingData()) {
               return false;
            } else if (this.hasArrayingData() && !this.getArrayingData().equals(other.getArrayingData())) {
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

            if (this.hasArrayingData()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getArrayingData().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadArraying_11820 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadArraying_11820)PARSER.parseFrom(data);
      }

      public static S2CR_UploadArraying_11820 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadArraying_11820)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadArraying_11820 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadArraying_11820)PARSER.parseFrom(data);
      }

      public static S2CR_UploadArraying_11820 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadArraying_11820)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadArraying_11820 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadArraying_11820)PARSER.parseFrom(data);
      }

      public static S2CR_UploadArraying_11820 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadArraying_11820)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadArraying_11820 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadArraying_11820)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadArraying_11820 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadArraying_11820)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadArraying_11820 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadArraying_11820)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadArraying_11820 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadArraying_11820)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadArraying_11820 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadArraying_11820)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadArraying_11820 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadArraying_11820)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadArraying_11820 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadArraying_11820 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadArraying_11820> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadArraying_11820> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadArraying_11820 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadArraying_11820OrBuilder {
         private int bitField0_;
         private int teamId_;
         private ByteString arrayingData_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_UploadArraying_11820_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_UploadArraying_11820_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadArraying_11820.class, Builder.class);
         }

         private Builder() {
            this.arrayingData_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.arrayingData_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossAllianceMsg.S2CR_UploadArraying_11820.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.teamId_ = 0;
            this.bitField0_ &= -2;
            this.arrayingData_ = ByteString.EMPTY;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossAllianceMsg.internal_static_crossAlliance_com_gzbz_protobuf_S2CR_UploadArraying_11820_descriptor;
         }

         public S2CR_UploadArraying_11820 getDefaultInstanceForType() {
            return CrossAllianceMsg.S2CR_UploadArraying_11820.getDefaultInstance();
         }

         public S2CR_UploadArraying_11820 build() {
            S2CR_UploadArraying_11820 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadArraying_11820 buildPartial() {
            S2CR_UploadArraying_11820 result = new S2CR_UploadArraying_11820(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.teamId_ = this.teamId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.arrayingData_ = this.arrayingData_;
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
            if (other instanceof S2CR_UploadArraying_11820) {
               return this.mergeFrom((S2CR_UploadArraying_11820)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadArraying_11820 other) {
            if (other == CrossAllianceMsg.S2CR_UploadArraying_11820.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTeamId()) {
                  this.setTeamId(other.getTeamId());
               }

               if (other.hasArrayingData()) {
                  this.setArrayingData(other.getArrayingData());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTeamId()) {
               return false;
            } else {
               return this.hasArrayingData();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadArraying_11820 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadArraying_11820)CrossAllianceMsg.S2CR_UploadArraying_11820.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadArraying_11820)e.getUnfinishedMessage();
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

         public boolean hasArrayingData() {
            return (this.bitField0_ & 2) != 0;
         }

         public ByteString getArrayingData() {
            return this.arrayingData_;
         }

         public Builder setArrayingData(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.arrayingData_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearArrayingData() {
            this.bitField0_ &= -3;
            this.arrayingData_ = CrossAllianceMsg.S2CR_UploadArraying_11820.getDefaultInstance().getArrayingData();
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

   public interface CR2S_AllianceSign_11802OrBuilder extends MessageOrBuilder {
      boolean hasTeamId();

      int getTeamId();

      boolean hasIsCancel();

      boolean getIsCancel();
   }

   public interface CR2S_CreateRobot_11818OrBuilder extends MessageOrBuilder {
   }

   public interface CR2S_RankReward_11816OrBuilder extends MessageOrBuilder {
      List<RankMsg.RankData> getRanksList();

      RankMsg.RankData getRanks(int index);

      int getRanksCount();

      List<? extends RankMsg.RankDataOrBuilder> getRanksOrBuilderList();

      RankMsg.RankDataOrBuilder getRanksOrBuilder(int index);

      boolean hasNormal();

      boolean getNormal();
   }

   public interface CR2S_ServerInit_11807OrBuilder extends MessageOrBuilder {
      boolean hasStatus();

      int getStatus();

      boolean hasEndTime();

      int getEndTime();

      boolean hasSeasonStartTime();

      int getSeasonStartTime();

      boolean hasSeasonEndTime();

      int getSeasonEndTime();

      boolean hasIsGm();

      boolean getIsGm();
   }

   public interface CR2S_TeamArrayingSave_11809OrBuilder extends MessageOrBuilder {
      boolean hasTeamId();

      int getTeamId();

      List<AllianceMsg.TeamPlayerHideInfo> getPlayerListList();

      AllianceMsg.TeamPlayerHideInfo getPlayerList(int index);

      int getPlayerListCount();

      List<? extends AllianceMsg.TeamPlayerHideInfoOrBuilder> getPlayerListOrBuilderList();

      AllianceMsg.TeamPlayerHideInfoOrBuilder getPlayerListOrBuilder(int index);
   }

   public interface CR2S_TeamBeChallenge_11813OrBuilder extends MessageOrBuilder {
      boolean hasTeamId();

      int getTeamId();

      boolean hasRecordInfo();

      AllianceMsg.TeamBattleRecordInfo getRecordInfo();

      AllianceMsg.TeamBattleRecordInfoOrBuilder getRecordInfoOrBuilder();

      boolean hasRank();

      int getRank();

      boolean hasIntegral();

      int getIntegral();
   }

   public interface CR2S_TeamChallenge_11811OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasTeamId();

      int getTeamId();

      boolean hasIsSkip();

      boolean getIsSkip();

      boolean hasBattleMsg();

      BattleMsg.S2C_BattleResult_6102 getBattleMsg();

      BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder();

      boolean hasRecordInfo();

      AllianceMsg.TeamBattleRecordInfo getRecordInfo();

      AllianceMsg.TeamBattleRecordInfoOrBuilder getRecordInfoOrBuilder();

      boolean hasRank();

      int getRank();

      boolean hasIntegral();

      int getIntegral();
   }

   public interface CR2S_TeamInfo_11815OrBuilder extends MessageOrBuilder {
      boolean hasTeamInfo();

      AllianceMsg.TeamInfo getTeamInfo();

      AllianceMsg.TeamInfoOrBuilder getTeamInfoOrBuilder();
   }

   public interface S2CR_AllianceChallengeTeams_11803OrBuilder extends MessageOrBuilder {
      boolean hasTeamId();

      int getTeamId();
   }

   public interface S2CR_AllianceGm_11812OrBuilder extends MessageOrBuilder {
      boolean hasCmd();

      String getCmd();

      ByteString getCmdBytes();

      List<Integer> getParamsList();

      int getParamsCount();

      int getParams(int index);
   }

   public interface S2CR_AllianceRank_11805OrBuilder extends MessageOrBuilder {
      boolean hasTeamId();

      int getTeamId();
   }

   public interface S2CR_AllianceSign_11801OrBuilder extends MessageOrBuilder {
      boolean hasTeamId();

      int getTeamId();

      boolean hasCaptain();

      int getCaptain();

      boolean hasTeamName();

      String getTeamName();

      ByteString getTeamNameBytes();

      boolean hasPower();

      long getPower();

      boolean hasIsCancel();

      boolean getIsCancel();

      boolean hasIntegral();

      int getIntegral();

      List<SignArrayingInfo> getArrayingListList();

      SignArrayingInfo getArrayingList(int index);

      int getArrayingListCount();

      List<? extends SignArrayingInfoOrBuilder> getArrayingListOrBuilderList();

      SignArrayingInfoOrBuilder getArrayingListOrBuilder(int index);
   }

   public interface S2CR_AllianceTeamInfo_11804OrBuilder extends MessageOrBuilder {
      boolean hasTeamId();

      int getTeamId();
   }

   public interface S2CR_RankReward_11817OrBuilder extends MessageOrBuilder {
      List<Integer> getTeamIdsList();

      int getTeamIdsCount();

      int getTeamIds(int index);
   }

   public interface S2CR_ServerInit_11806OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_TeamArrayingSave_11808OrBuilder extends MessageOrBuilder {
      boolean hasTeamId();

      int getTeamId();

      List<AllianceMsg.TeamPlayerHideInfo> getPlayerListList();

      AllianceMsg.TeamPlayerHideInfo getPlayerList(int index);

      int getPlayerListCount();

      List<? extends AllianceMsg.TeamPlayerHideInfoOrBuilder> getPlayerListOrBuilderList();

      AllianceMsg.TeamPlayerHideInfoOrBuilder getPlayerListOrBuilder(int index);
   }

   public interface S2CR_TeamChallenge_11810OrBuilder extends MessageOrBuilder {
      boolean hasTeamId();

      int getTeamId();

      boolean hasChallengeTeamId();

      int getChallengeTeamId();

      boolean hasIsSkip();

      boolean getIsSkip();

      List<ByteString> getArrayingListList();

      int getArrayingListCount();

      ByteString getArrayingList(int index);

      boolean hasGroupId();

      int getGroupId();

      boolean hasRecordId();

      int getRecordId();
   }

   public interface S2CR_TeamInfo_11814OrBuilder extends MessageOrBuilder {
      boolean hasTeamId();

      int getTeamId();
   }

   public interface S2CR_TeamNameChange_11819OrBuilder extends MessageOrBuilder {
      boolean hasTeamId();

      int getTeamId();

      boolean hasTeamName();

      String getTeamName();

      ByteString getTeamNameBytes();
   }

   public interface S2CR_UploadArraying_11820OrBuilder extends MessageOrBuilder {
      boolean hasTeamId();

      int getTeamId();

      boolean hasArrayingData();

      ByteString getArrayingData();
   }

   public interface SignArrayingInfoOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasIsHide();

      boolean getIsHide();

      boolean hasArrayingData();

      ByteString getArrayingData();

      boolean hasRobot();

      AllianceMsg.TeamPlayerInfo getRobot();

      AllianceMsg.TeamPlayerInfoOrBuilder getRobotOrBuilder();
   }
}
