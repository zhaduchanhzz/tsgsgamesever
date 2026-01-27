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

public final class ChatMsg {
   private static final Descriptors.Descriptor internal_static_chat_com_gzbz_protobuf_Chat_Info_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chat_com_gzbz_protobuf_Chat_Info_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chat_com_gzbz_protobuf_Chat_Condition_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chat_com_gzbz_protobuf_Chat_Condition_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chat_com_gzbz_protobuf_C2S_Chat_6003_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chat_com_gzbz_protobuf_C2S_Chat_6003_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chat_com_gzbz_protobuf_S2C_Chat_6004_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chat_com_gzbz_protobuf_S2C_Chat_6004_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chat_com_gzbz_protobuf_C2S_DelRecord_6005_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chat_com_gzbz_protobuf_C2S_DelRecord_6005_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chat_com_gzbz_protobuf_S2C_DelRecord_6006_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chat_com_gzbz_protobuf_S2C_DelRecord_6006_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chat_com_gzbz_protobuf_C2S_FightToFriend_6007_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chat_com_gzbz_protobuf_C2S_FightToFriend_6007_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chat_com_gzbz_protobuf_C2S_PlayerDetailInfo_6009_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chat_com_gzbz_protobuf_C2S_PlayerDetailInfo_6009_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chat_com_gzbz_protobuf_S2C_PlayerDetailInfo_6010_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chat_com_gzbz_protobuf_S2C_PlayerDetailInfo_6010_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chat_com_gzbz_protobuf_C2S_ChatDistory_6011_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chat_com_gzbz_protobuf_C2S_ChatDistory_6011_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chat_com_gzbz_protobuf_S2C_ChatDistory_6012_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chat_com_gzbz_protobuf_S2C_ChatDistory_6012_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chat_com_gzbz_protobuf_C2S_ChatLogin_6013_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chat_com_gzbz_protobuf_C2S_ChatLogin_6013_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chat_com_gzbz_protobuf_S2C_ChatLogin_6014_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chat_com_gzbz_protobuf_S2C_ChatLogin_6014_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chat_com_gzbz_protobuf_S2C_ChatCondition_6016_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chat_com_gzbz_protobuf_S2C_ChatCondition_6016_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chat_com_gzbz_protobuf_S2C_RemoveMessage_6018_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chat_com_gzbz_protobuf_S2C_RemoveMessage_6018_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chat_com_gzbz_protobuf_C2S_ChoiceBubble_6019_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chat_com_gzbz_protobuf_C2S_ChoiceBubble_6019_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chat_com_gzbz_protobuf_S2C_ChoiceBubble_6020_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chat_com_gzbz_protobuf_S2C_ChoiceBubble_6020_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chat_com_gzbz_protobuf_C2S_KingOfChallenge_6021_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chat_com_gzbz_protobuf_C2S_KingOfChallenge_6021_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ChatMsg() {
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
      String[] descriptorData = new String[]{"\n\nChat.proto\u0012\u0016chat.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u000bUnion.proto\u001a\tBag.proto\u001a\fBattle.proto\"\u008d\u0005\n\tChat_Info\u0012\u000f\n\u0007channel\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007content\u0018\u0002 \u0002(\t\u0012\u0010\n\bplayerId\u0018\u0003 \u0001(\u0005\u0012\u0012\n\nplayerName\u0018\u0004 \u0001(\t\u0012\u000b\n\u0003sex\u0018\u0005 \u0001(\u0005\u0012\r\n\u0005level\u0018\u0006 \u0001(\u0005\u0012\r\n\u0005vipLv\u0018\u0007 \u0001(\u0005\u0012\f\n\u0004head\u0018\b \u0001(\u0005\u0012\u0011\n\theadFrame\u0018\t \u0001(\u0005\u0012\u0010\n\bprestige\u0018\n \u0001(\u0005\u0012\u0010\n\bserverId\u0018\u000b \u0001(\u0005\u0012\u0010\n\bprovince\u0018\f \u0001(\t\u0012\f\n\u0004city\u0018\r \u0001(\t\u0012\u0010\n\bsubclass\u0018\u000e \u0001(\u0005\u0012\u000e\n\u0006extra1\u0018\u000f \u0001(\u0005\u0012\u000e\n\u0006extra2\u0018\u0010 \u0001(\t\u0012\"\n\bheroInfo\u0018\u0011 \u0001(\u000b2\u0010.common.HeroInfo\u0012\u0010\n\bchatTime\u0018\u0012 \u0001(\u0005\u0012\u000e\n\u0006chatId\u0018\u0013 \u0001(\u0005\u0012\u000f\n\u0007showVip\u0018\u0014 \u0001(\b\u0012\u0011\n\tappointId\u0018\u0015 \u0001(\u0005\u0012\u0013\n\u000bsecondTitle\u0018\u0016 \u0001(\u0005\u0012\u000f\n\u0007unionId\u0018\u0017 \u0001(\u0005\u00122\n\bitemInfo\u0018\u0018 \u0001(\u000b2 .bag.com.gzbz.protobuf.Item_Info\u0012\u0011\n\tshareTips\u0018\u0019 \u0001(\t\u0012\u000e\n\u0006bubble\u0018\u001a \u0001(\u0005\u0012\u000e\n\u0006areaId\u0018\u001b \u0001(\u0005\u0012\u0012\n\nprovinceId\u0018\u001c \u0001(\u0005\u0012\u000e\n\u0006cityId\u0018\u001d \u0001(\u0005\u0012\r\n\u0005medal\u0018\u001e \u0003(\u0005\u0012)\n\u000ecustomPrestige\u0018\u001f \u0003(\u000b2\u0011.common.MapDataIS\u0012\u000e\n\u0006qqLogo\u0018  \u0001(\t\u0012\u0011\n\tqqWanKaLv\u0018! \u0001(\u0005\"]\n\u000eChat_Condition\u0012\u000f\n\u0007channel\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bcoolTime\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004bAll\u0018\u0003 \u0002(\b\u0012\r\n\u0005level\u0018\u0004 \u0002(\u0005\u0012\u000b\n\u0003vip\u0018\u0005 \u0002(\u0005\"z\n\rC2S_Chat_6003\u0012\u000f\n\u0007channel\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007content\u0018\u0002 \u0002(\t\u0012\u0010\n\bsubclass\u0018\u0003 \u0001(\u0005\u0012\u0014\n\fdestPlayerId\u0018\u0004 \u0001(\u0005\u0012\f\n\u0004code\u0018\u0005 \u0001(\u0005\u0012\u0011\n\tshareTips\u0018\u0006 \u0001(\t\"A\n\rS2C_Chat_6004\u00120\n\u0005infos\u0018\u0001 \u0003(\u000b2!.chat.com.gzbz.protobuf.Chat_Info\"&\n\u0012C2S_DelRecord_6005\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\"6\n\u0012S2C_DelRecord_6006\u0012\u000e\n\u0006result\u0018\u0001 \u0001(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0001(\u0005\"K\n\u0016C2S_FightToFriend_6007\u0012\u0010\n\bserverId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005cross\u0018\u0003 \u0001(\b\"s\n\u0019C2S_PlayerDetailInfo_6009\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bserverId\u0018\u0002 \u0001(\u0005\u0012#\n\barraying\u0018\u0003 \u0001(\u000e2\u0011.common.HeroState\u0012\r\n\u0005cross\u0018\u0004 \u0001(\b\"x\n\u0019S2C_PlayerDetailInfo_6010\u0012&\n\nplayerInfo\u0018\u0001 \u0002(\u000b2\u0012.common.PlayerInfo\u0012#\n\barraying\u0018\u0002 \u0001(\u000e2\u0011.common.HeroState\u0012\u000e\n\u0006report\u0018\u0003 \u0001(\b\"M\n\u0014C2S_ChatDistory_6011\u0012\u000f\n\u0007channel\u0018\u0001 \u0002(\u0005\u0012\u0014\n\fdestPlayerId\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006chatId\u0018\u0003 \u0002(\u0005\"H\n\u0014S2C_ChatDistory_6012\u00120\n\u0005infos\u0018\u0001 \u0003(\u000b2!.chat.com.gzbz.protobuf.Chat_Info\"\u0014\n\u0012C2S_ChatLogin_6013\"F\n\u0012S2C_ChatLogin_6014\u00120\n\u0005infos\u0018\u0001 \u0003(\u000b2!.chat.com.gzbz.protobuf.Chat_Info\"T\n\u0016S2C_ChatCondition_6016\u0012:\n\nconditions\u0018\u0001 \u0003(\u000b2&.chat.com.gzbz.protobuf.Chat_Condition\"*\n\u0016S2C_RemoveMessage_6018\u0012\u0010\n\bplayerId\u0018\u0001 \u0003(\u0005\")\n\u0015C2S_ChoiceBubble_6019\u0012\u0010\n\bbubbleId\u0018\u0001 \u0002(\u0005\")\n\u0015S2C_ChoiceBubble_6020\u0012\u0010\n\bbubbleId\u0018\u0001 \u0002(\u0005\">\n\u0018C2S_KingOfChallenge_6021\u0012\u0010\n\bserverId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005B\u001e\n\u0011com.gzbz.protobufB\u0007ChatMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), UnionMsg.getDescriptor(), BagMsg.getDescriptor(), BattleMsg.getDescriptor()});
      internal_static_chat_com_gzbz_protobuf_Chat_Info_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_chat_com_gzbz_protobuf_Chat_Info_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chat_com_gzbz_protobuf_Chat_Info_descriptor, new String[]{"Channel", "Content", "PlayerId", "PlayerName", "Sex", "Level", "VipLv", "Head", "HeadFrame", "Prestige", "ServerId", "Province", "City", "Subclass", "Extra1", "Extra2", "HeroInfo", "ChatTime", "ChatId", "ShowVip", "AppointId", "SecondTitle", "UnionId", "ItemInfo", "ShareTips", "Bubble", "AreaId", "ProvinceId", "CityId", "Medal", "CustomPrestige", "QqLogo", "QqWanKaLv"});
      internal_static_chat_com_gzbz_protobuf_Chat_Condition_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_chat_com_gzbz_protobuf_Chat_Condition_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chat_com_gzbz_protobuf_Chat_Condition_descriptor, new String[]{"Channel", "CoolTime", "BAll", "Level", "Vip"});
      internal_static_chat_com_gzbz_protobuf_C2S_Chat_6003_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_chat_com_gzbz_protobuf_C2S_Chat_6003_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chat_com_gzbz_protobuf_C2S_Chat_6003_descriptor, new String[]{"Channel", "Content", "Subclass", "DestPlayerId", "Code", "ShareTips"});
      internal_static_chat_com_gzbz_protobuf_S2C_Chat_6004_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_chat_com_gzbz_protobuf_S2C_Chat_6004_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chat_com_gzbz_protobuf_S2C_Chat_6004_descriptor, new String[]{"Infos"});
      internal_static_chat_com_gzbz_protobuf_C2S_DelRecord_6005_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_chat_com_gzbz_protobuf_C2S_DelRecord_6005_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chat_com_gzbz_protobuf_C2S_DelRecord_6005_descriptor, new String[]{"PlayerId"});
      internal_static_chat_com_gzbz_protobuf_S2C_DelRecord_6006_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_chat_com_gzbz_protobuf_S2C_DelRecord_6006_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chat_com_gzbz_protobuf_S2C_DelRecord_6006_descriptor, new String[]{"Result", "PlayerId"});
      internal_static_chat_com_gzbz_protobuf_C2S_FightToFriend_6007_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_chat_com_gzbz_protobuf_C2S_FightToFriend_6007_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chat_com_gzbz_protobuf_C2S_FightToFriend_6007_descriptor, new String[]{"ServerId", "PlayerId", "Cross"});
      internal_static_chat_com_gzbz_protobuf_C2S_PlayerDetailInfo_6009_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_chat_com_gzbz_protobuf_C2S_PlayerDetailInfo_6009_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chat_com_gzbz_protobuf_C2S_PlayerDetailInfo_6009_descriptor, new String[]{"PlayerId", "ServerId", "Arraying", "Cross"});
      internal_static_chat_com_gzbz_protobuf_S2C_PlayerDetailInfo_6010_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_chat_com_gzbz_protobuf_S2C_PlayerDetailInfo_6010_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chat_com_gzbz_protobuf_S2C_PlayerDetailInfo_6010_descriptor, new String[]{"PlayerInfo", "Arraying", "Report"});
      internal_static_chat_com_gzbz_protobuf_C2S_ChatDistory_6011_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_chat_com_gzbz_protobuf_C2S_ChatDistory_6011_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chat_com_gzbz_protobuf_C2S_ChatDistory_6011_descriptor, new String[]{"Channel", "DestPlayerId", "ChatId"});
      internal_static_chat_com_gzbz_protobuf_S2C_ChatDistory_6012_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_chat_com_gzbz_protobuf_S2C_ChatDistory_6012_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chat_com_gzbz_protobuf_S2C_ChatDistory_6012_descriptor, new String[]{"Infos"});
      internal_static_chat_com_gzbz_protobuf_C2S_ChatLogin_6013_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_chat_com_gzbz_protobuf_C2S_ChatLogin_6013_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chat_com_gzbz_protobuf_C2S_ChatLogin_6013_descriptor, new String[0]);
      internal_static_chat_com_gzbz_protobuf_S2C_ChatLogin_6014_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_chat_com_gzbz_protobuf_S2C_ChatLogin_6014_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chat_com_gzbz_protobuf_S2C_ChatLogin_6014_descriptor, new String[]{"Infos"});
      internal_static_chat_com_gzbz_protobuf_S2C_ChatCondition_6016_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_chat_com_gzbz_protobuf_S2C_ChatCondition_6016_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chat_com_gzbz_protobuf_S2C_ChatCondition_6016_descriptor, new String[]{"Conditions"});
      internal_static_chat_com_gzbz_protobuf_S2C_RemoveMessage_6018_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_chat_com_gzbz_protobuf_S2C_RemoveMessage_6018_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chat_com_gzbz_protobuf_S2C_RemoveMessage_6018_descriptor, new String[]{"PlayerId"});
      internal_static_chat_com_gzbz_protobuf_C2S_ChoiceBubble_6019_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_chat_com_gzbz_protobuf_C2S_ChoiceBubble_6019_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chat_com_gzbz_protobuf_C2S_ChoiceBubble_6019_descriptor, new String[]{"BubbleId"});
      internal_static_chat_com_gzbz_protobuf_S2C_ChoiceBubble_6020_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_chat_com_gzbz_protobuf_S2C_ChoiceBubble_6020_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chat_com_gzbz_protobuf_S2C_ChoiceBubble_6020_descriptor, new String[]{"BubbleId"});
      internal_static_chat_com_gzbz_protobuf_C2S_KingOfChallenge_6021_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_chat_com_gzbz_protobuf_C2S_KingOfChallenge_6021_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chat_com_gzbz_protobuf_C2S_KingOfChallenge_6021_descriptor, new String[]{"ServerId", "PlayerId"});
      CommonMsg.getDescriptor();
      UnionMsg.getDescriptor();
      BagMsg.getDescriptor();
      BattleMsg.getDescriptor();
   }

   public static final class Chat_Info extends GeneratedMessageV3 implements Chat_InfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHANNEL_FIELD_NUMBER = 1;
      private int channel_;
      public static final int CONTENT_FIELD_NUMBER = 2;
      private volatile Object content_;
      public static final int PLAYERID_FIELD_NUMBER = 3;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 4;
      private volatile Object playerName_;
      public static final int SEX_FIELD_NUMBER = 5;
      private int sex_;
      public static final int LEVEL_FIELD_NUMBER = 6;
      private int level_;
      public static final int VIPLV_FIELD_NUMBER = 7;
      private int vipLv_;
      public static final int HEAD_FIELD_NUMBER = 8;
      private int head_;
      public static final int HEADFRAME_FIELD_NUMBER = 9;
      private int headFrame_;
      public static final int PRESTIGE_FIELD_NUMBER = 10;
      private int prestige_;
      public static final int SERVERID_FIELD_NUMBER = 11;
      private int serverId_;
      public static final int PROVINCE_FIELD_NUMBER = 12;
      private volatile Object province_;
      public static final int CITY_FIELD_NUMBER = 13;
      private volatile Object city_;
      public static final int SUBCLASS_FIELD_NUMBER = 14;
      private int subclass_;
      public static final int EXTRA1_FIELD_NUMBER = 15;
      private int extra1_;
      public static final int EXTRA2_FIELD_NUMBER = 16;
      private volatile Object extra2_;
      public static final int HEROINFO_FIELD_NUMBER = 17;
      private CommonMsg.HeroInfo heroInfo_;
      public static final int CHATTIME_FIELD_NUMBER = 18;
      private int chatTime_;
      public static final int CHATID_FIELD_NUMBER = 19;
      private int chatId_;
      public static final int SHOWVIP_FIELD_NUMBER = 20;
      private boolean showVip_;
      public static final int APPOINTID_FIELD_NUMBER = 21;
      private int appointId_;
      public static final int SECONDTITLE_FIELD_NUMBER = 22;
      private int secondTitle_;
      public static final int UNIONID_FIELD_NUMBER = 23;
      private int unionId_;
      public static final int ITEMINFO_FIELD_NUMBER = 24;
      private BagMsg.Item_Info itemInfo_;
      public static final int SHARETIPS_FIELD_NUMBER = 25;
      private volatile Object shareTips_;
      public static final int BUBBLE_FIELD_NUMBER = 26;
      private int bubble_;
      public static final int AREAID_FIELD_NUMBER = 27;
      private int areaId_;
      public static final int PROVINCEID_FIELD_NUMBER = 28;
      private int provinceId_;
      public static final int CITYID_FIELD_NUMBER = 29;
      private int cityId_;
      public static final int MEDAL_FIELD_NUMBER = 30;
      private Internal.IntList medal_;
      public static final int CUSTOMPRESTIGE_FIELD_NUMBER = 31;
      private List<CommonMsg.MapDataIS> customPrestige_;
      public static final int QQLOGO_FIELD_NUMBER = 32;
      private volatile Object qqLogo_;
      public static final int QQWANKALV_FIELD_NUMBER = 33;
      private int qqWanKaLv_;
      private byte memoizedIsInitialized;
      private static final Chat_Info DEFAULT_INSTANCE = new Chat_Info();
      /** @deprecated */
      @Deprecated
      public static final Parser<Chat_Info> PARSER = new AbstractParser<Chat_Info>() {
         public Chat_Info parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new Chat_Info(input, extensionRegistry);
         }
      };

      private Chat_Info(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private Chat_Info() {
         this.memoizedIsInitialized = -1;
         this.content_ = "";
         this.playerName_ = "";
         this.province_ = "";
         this.city_ = "";
         this.extra2_ = "";
         this.shareTips_ = "";
         this.medal_ = emptyIntList();
         this.customPrestige_ = Collections.emptyList();
         this.qqLogo_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new Chat_Info();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private Chat_Info(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            int mutable_bitField1_ = 0;
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
                        this.channel_ = input.readInt32();
                        continue;
                     case 18:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.content_ = bs;
                        continue;
                     case 24:
                        this.bitField0_ |= 4;
                        this.playerId_ = input.readInt32();
                        continue;
                     case 34:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 8;
                        this.playerName_ = bs;
                        continue;
                     case 40:
                        this.bitField0_ |= 16;
                        this.sex_ = input.readInt32();
                        continue;
                     case 48:
                        this.bitField0_ |= 32;
                        this.level_ = input.readInt32();
                        continue;
                     case 56:
                        this.bitField0_ |= 64;
                        this.vipLv_ = input.readInt32();
                        continue;
                     case 64:
                        this.bitField0_ |= 128;
                        this.head_ = input.readInt32();
                        continue;
                     case 72:
                        this.bitField0_ |= 256;
                        this.headFrame_ = input.readInt32();
                        continue;
                     case 80:
                        this.bitField0_ |= 512;
                        this.prestige_ = input.readInt32();
                        continue;
                     case 88:
                        this.bitField0_ |= 1024;
                        this.serverId_ = input.readInt32();
                        continue;
                     case 98:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2048;
                        this.province_ = bs;
                        continue;
                     case 106:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4096;
                        this.city_ = bs;
                        continue;
                     case 112:
                        this.bitField0_ |= 8192;
                        this.subclass_ = input.readInt32();
                        continue;
                     case 120:
                        this.bitField0_ |= 16384;
                        this.extra1_ = input.readInt32();
                        continue;
                     case 130:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 32768;
                        this.extra2_ = bs;
                        continue;
                     case 138:
                        CommonMsg.HeroInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 65536) != 0) {
                           subBuilder = this.heroInfo_.toBuilder();
                        }

                        this.heroInfo_ = (CommonMsg.HeroInfo)input.readMessage(CommonMsg.HeroInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.heroInfo_);
                           this.heroInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 65536;
                        continue;
                     case 144:
                        this.bitField0_ |= 131072;
                        this.chatTime_ = input.readInt32();
                        continue;
                     case 152:
                        this.bitField0_ |= 262144;
                        this.chatId_ = input.readInt32();
                        continue;
                     case 160:
                        this.bitField0_ |= 524288;
                        this.showVip_ = input.readBool();
                        continue;
                     case 168:
                        this.bitField0_ |= 1048576;
                        this.appointId_ = input.readInt32();
                        continue;
                     case 176:
                        this.bitField0_ |= 2097152;
                        this.secondTitle_ = input.readInt32();
                        continue;
                     case 184:
                        this.bitField0_ |= 4194304;
                        this.unionId_ = input.readInt32();
                        continue;
                     case 194:
                        BagMsg.Item_Info.Builder subBuilder = null;
                        if ((this.bitField0_ & 8388608) != 0) {
                           subBuilder = this.itemInfo_.toBuilder();
                        }

                        this.itemInfo_ = (BagMsg.Item_Info)input.readMessage(BagMsg.Item_Info.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.itemInfo_);
                           this.itemInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 8388608;
                        continue;
                     case 202:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 16777216;
                        this.shareTips_ = bs;
                        continue;
                     case 208:
                        this.bitField0_ |= 33554432;
                        this.bubble_ = input.readInt32();
                        continue;
                     case 216:
                        this.bitField0_ |= 67108864;
                        this.areaId_ = input.readInt32();
                        continue;
                     case 224:
                        this.bitField0_ |= 134217728;
                        this.provinceId_ = input.readInt32();
                        continue;
                     case 232:
                        this.bitField0_ |= 268435456;
                        this.cityId_ = input.readInt32();
                        continue;
                     case 240:
                        if ((mutable_bitField0_ & 536870912) == 0) {
                           this.medal_ = newIntList();
                           mutable_bitField0_ |= 536870912;
                        }

                        this.medal_.addInt(input.readInt32());
                        continue;
                     case 242:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 536870912) == 0 && input.getBytesUntilLimit() > 0) {
                           this.medal_ = newIntList();
                           mutable_bitField0_ |= 536870912;
                        }
                        break;
                     case 250:
                        if ((mutable_bitField0_ & 1073741824) == 0) {
                           this.customPrestige_ = new ArrayList();
                           mutable_bitField0_ |= 1073741824;
                        }

                        this.customPrestige_.add(input.readMessage(CommonMsg.MapDataIS.PARSER, extensionRegistry));
                        continue;
                     case 258:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 536870912;
                        this.qqLogo_ = bs;
                        continue;
                     case 264:
                        this.bitField0_ |= 1073741824;
                        this.qqWanKaLv_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.medal_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 536870912) != 0) {
                  this.medal_.makeImmutable();
               }

               if ((mutable_bitField0_ & 1073741824) != 0) {
                  this.customPrestige_ = Collections.unmodifiableList(this.customPrestige_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_Chat_Info_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_Chat_Info_fieldAccessorTable.ensureFieldAccessorsInitialized(Chat_Info.class, Builder.class);
      }

      public boolean hasChannel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChannel() {
         return this.channel_;
      }

      public boolean hasContent() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getContent() {
         Object ref = this.content_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.content_ = s;
            }

            return s;
         }
      }

      public ByteString getContentBytes() {
         Object ref = this.content_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.content_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
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

      public boolean hasSex() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getSex() {
         return this.sex_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public boolean hasVipLv() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getVipLv() {
         return this.vipLv_;
      }

      public boolean hasHead() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public boolean hasPrestige() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getPrestige() {
         return this.prestige_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 1024) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasProvince() {
         return (this.bitField0_ & 2048) != 0;
      }

      public String getProvince() {
         Object ref = this.province_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.province_ = s;
            }

            return s;
         }
      }

      public ByteString getProvinceBytes() {
         Object ref = this.province_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.province_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasCity() {
         return (this.bitField0_ & 4096) != 0;
      }

      public String getCity() {
         Object ref = this.city_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.city_ = s;
            }

            return s;
         }
      }

      public ByteString getCityBytes() {
         Object ref = this.city_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.city_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasSubclass() {
         return (this.bitField0_ & 8192) != 0;
      }

      public int getSubclass() {
         return this.subclass_;
      }

      public boolean hasExtra1() {
         return (this.bitField0_ & 16384) != 0;
      }

      public int getExtra1() {
         return this.extra1_;
      }

      public boolean hasExtra2() {
         return (this.bitField0_ & '耀') != 0;
      }

      public String getExtra2() {
         Object ref = this.extra2_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.extra2_ = s;
            }

            return s;
         }
      }

      public ByteString getExtra2Bytes() {
         Object ref = this.extra2_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.extra2_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasHeroInfo() {
         return (this.bitField0_ & 65536) != 0;
      }

      public CommonMsg.HeroInfo getHeroInfo() {
         return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
      }

      public CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder() {
         return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
      }

      public boolean hasChatTime() {
         return (this.bitField0_ & 131072) != 0;
      }

      public int getChatTime() {
         return this.chatTime_;
      }

      public boolean hasChatId() {
         return (this.bitField0_ & 262144) != 0;
      }

      public int getChatId() {
         return this.chatId_;
      }

      public boolean hasShowVip() {
         return (this.bitField0_ & 524288) != 0;
      }

      public boolean getShowVip() {
         return this.showVip_;
      }

      public boolean hasAppointId() {
         return (this.bitField0_ & 1048576) != 0;
      }

      public int getAppointId() {
         return this.appointId_;
      }

      public boolean hasSecondTitle() {
         return (this.bitField0_ & 2097152) != 0;
      }

      public int getSecondTitle() {
         return this.secondTitle_;
      }

      public boolean hasUnionId() {
         return (this.bitField0_ & 4194304) != 0;
      }

      public int getUnionId() {
         return this.unionId_;
      }

      public boolean hasItemInfo() {
         return (this.bitField0_ & 8388608) != 0;
      }

      public BagMsg.Item_Info getItemInfo() {
         return this.itemInfo_ == null ? BagMsg.Item_Info.getDefaultInstance() : this.itemInfo_;
      }

      public BagMsg.Item_InfoOrBuilder getItemInfoOrBuilder() {
         return this.itemInfo_ == null ? BagMsg.Item_Info.getDefaultInstance() : this.itemInfo_;
      }

      public boolean hasShareTips() {
         return (this.bitField0_ & 16777216) != 0;
      }

      public String getShareTips() {
         Object ref = this.shareTips_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.shareTips_ = s;
            }

            return s;
         }
      }

      public ByteString getShareTipsBytes() {
         Object ref = this.shareTips_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.shareTips_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasBubble() {
         return (this.bitField0_ & 33554432) != 0;
      }

      public int getBubble() {
         return this.bubble_;
      }

      public boolean hasAreaId() {
         return (this.bitField0_ & 67108864) != 0;
      }

      public int getAreaId() {
         return this.areaId_;
      }

      public boolean hasProvinceId() {
         return (this.bitField0_ & 134217728) != 0;
      }

      public int getProvinceId() {
         return this.provinceId_;
      }

      public boolean hasCityId() {
         return (this.bitField0_ & 268435456) != 0;
      }

      public int getCityId() {
         return this.cityId_;
      }

      public List<Integer> getMedalList() {
         return this.medal_;
      }

      public int getMedalCount() {
         return this.medal_.size();
      }

      public int getMedal(int index) {
         return this.medal_.getInt(index);
      }

      public List<CommonMsg.MapDataIS> getCustomPrestigeList() {
         return this.customPrestige_;
      }

      public List<? extends CommonMsg.MapDataISOrBuilder> getCustomPrestigeOrBuilderList() {
         return this.customPrestige_;
      }

      public int getCustomPrestigeCount() {
         return this.customPrestige_.size();
      }

      public CommonMsg.MapDataIS getCustomPrestige(int index) {
         return (CommonMsg.MapDataIS)this.customPrestige_.get(index);
      }

      public CommonMsg.MapDataISOrBuilder getCustomPrestigeOrBuilder(int index) {
         return (CommonMsg.MapDataISOrBuilder)this.customPrestige_.get(index);
      }

      public boolean hasQqLogo() {
         return (this.bitField0_ & 536870912) != 0;
      }

      public String getQqLogo() {
         Object ref = this.qqLogo_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.qqLogo_ = s;
            }

            return s;
         }
      }

      public ByteString getQqLogoBytes() {
         Object ref = this.qqLogo_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.qqLogo_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasQqWanKaLv() {
         return (this.bitField0_ & 1073741824) != 0;
      }

      public int getQqWanKaLv() {
         return this.qqWanKaLv_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChannel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasContent()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasHeroInfo() && !this.getHeroInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasItemInfo() && !this.getItemInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getCustomPrestigeCount(); ++i) {
               if (!this.getCustomPrestige(i).isInitialized()) {
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
            output.writeInt32(1, this.channel_);
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.content_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.playerId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            GeneratedMessageV3.writeString(output, 4, this.playerName_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.sex_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.level_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.vipLv_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.head_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.headFrame_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(10, this.prestige_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            output.writeInt32(11, this.serverId_);
         }

         if ((this.bitField0_ & 2048) != 0) {
            GeneratedMessageV3.writeString(output, 12, this.province_);
         }

         if ((this.bitField0_ & 4096) != 0) {
            GeneratedMessageV3.writeString(output, 13, this.city_);
         }

         if ((this.bitField0_ & 8192) != 0) {
            output.writeInt32(14, this.subclass_);
         }

         if ((this.bitField0_ & 16384) != 0) {
            output.writeInt32(15, this.extra1_);
         }

         if ((this.bitField0_ & '耀') != 0) {
            GeneratedMessageV3.writeString(output, 16, this.extra2_);
         }

         if ((this.bitField0_ & 65536) != 0) {
            output.writeMessage(17, this.getHeroInfo());
         }

         if ((this.bitField0_ & 131072) != 0) {
            output.writeInt32(18, this.chatTime_);
         }

         if ((this.bitField0_ & 262144) != 0) {
            output.writeInt32(19, this.chatId_);
         }

         if ((this.bitField0_ & 524288) != 0) {
            output.writeBool(20, this.showVip_);
         }

         if ((this.bitField0_ & 1048576) != 0) {
            output.writeInt32(21, this.appointId_);
         }

         if ((this.bitField0_ & 2097152) != 0) {
            output.writeInt32(22, this.secondTitle_);
         }

         if ((this.bitField0_ & 4194304) != 0) {
            output.writeInt32(23, this.unionId_);
         }

         if ((this.bitField0_ & 8388608) != 0) {
            output.writeMessage(24, this.getItemInfo());
         }

         if ((this.bitField0_ & 16777216) != 0) {
            GeneratedMessageV3.writeString(output, 25, this.shareTips_);
         }

         if ((this.bitField0_ & 33554432) != 0) {
            output.writeInt32(26, this.bubble_);
         }

         if ((this.bitField0_ & 67108864) != 0) {
            output.writeInt32(27, this.areaId_);
         }

         if ((this.bitField0_ & 134217728) != 0) {
            output.writeInt32(28, this.provinceId_);
         }

         if ((this.bitField0_ & 268435456) != 0) {
            output.writeInt32(29, this.cityId_);
         }

         for(int i = 0; i < this.medal_.size(); ++i) {
            output.writeInt32(30, this.medal_.getInt(i));
         }

         for(int i = 0; i < this.customPrestige_.size(); ++i) {
            output.writeMessage(31, (MessageLite)this.customPrestige_.get(i));
         }

         if ((this.bitField0_ & 536870912) != 0) {
            GeneratedMessageV3.writeString(output, 32, this.qqLogo_);
         }

         if ((this.bitField0_ & 1073741824) != 0) {
            output.writeInt32(33, this.qqWanKaLv_);
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
               size += CodedOutputStream.computeInt32Size(1, this.channel_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(2, this.content_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.playerId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += GeneratedMessageV3.computeStringSize(4, this.playerName_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.sex_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.level_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.vipLv_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.head_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.headFrame_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.prestige_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.serverId_);
            }

            if ((this.bitField0_ & 2048) != 0) {
               size += GeneratedMessageV3.computeStringSize(12, this.province_);
            }

            if ((this.bitField0_ & 4096) != 0) {
               size += GeneratedMessageV3.computeStringSize(13, this.city_);
            }

            if ((this.bitField0_ & 8192) != 0) {
               size += CodedOutputStream.computeInt32Size(14, this.subclass_);
            }

            if ((this.bitField0_ & 16384) != 0) {
               size += CodedOutputStream.computeInt32Size(15, this.extra1_);
            }

            if ((this.bitField0_ & '耀') != 0) {
               size += GeneratedMessageV3.computeStringSize(16, this.extra2_);
            }

            if ((this.bitField0_ & 65536) != 0) {
               size += CodedOutputStream.computeMessageSize(17, this.getHeroInfo());
            }

            if ((this.bitField0_ & 131072) != 0) {
               size += CodedOutputStream.computeInt32Size(18, this.chatTime_);
            }

            if ((this.bitField0_ & 262144) != 0) {
               size += CodedOutputStream.computeInt32Size(19, this.chatId_);
            }

            if ((this.bitField0_ & 524288) != 0) {
               size += CodedOutputStream.computeBoolSize(20, this.showVip_);
            }

            if ((this.bitField0_ & 1048576) != 0) {
               size += CodedOutputStream.computeInt32Size(21, this.appointId_);
            }

            if ((this.bitField0_ & 2097152) != 0) {
               size += CodedOutputStream.computeInt32Size(22, this.secondTitle_);
            }

            if ((this.bitField0_ & 4194304) != 0) {
               size += CodedOutputStream.computeInt32Size(23, this.unionId_);
            }

            if ((this.bitField0_ & 8388608) != 0) {
               size += CodedOutputStream.computeMessageSize(24, this.getItemInfo());
            }

            if ((this.bitField0_ & 16777216) != 0) {
               size += GeneratedMessageV3.computeStringSize(25, this.shareTips_);
            }

            if ((this.bitField0_ & 33554432) != 0) {
               size += CodedOutputStream.computeInt32Size(26, this.bubble_);
            }

            if ((this.bitField0_ & 67108864) != 0) {
               size += CodedOutputStream.computeInt32Size(27, this.areaId_);
            }

            if ((this.bitField0_ & 134217728) != 0) {
               size += CodedOutputStream.computeInt32Size(28, this.provinceId_);
            }

            if ((this.bitField0_ & 268435456) != 0) {
               size += CodedOutputStream.computeInt32Size(29, this.cityId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.medal_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.medal_.getInt(i));
            }

            size += dataSize;
            size += 2 * this.getMedalList().size();

            for(int i = 0; i < this.customPrestige_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(31, (MessageLite)this.customPrestige_.get(i));
            }

            if ((this.bitField0_ & 536870912) != 0) {
               size += GeneratedMessageV3.computeStringSize(32, this.qqLogo_);
            }

            if ((this.bitField0_ & 1073741824) != 0) {
               size += CodedOutputStream.computeInt32Size(33, this.qqWanKaLv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof Chat_Info)) {
            return super.equals(obj);
         } else {
            Chat_Info other = (Chat_Info)obj;
            if (this.hasChannel() != other.hasChannel()) {
               return false;
            } else if (this.hasChannel() && this.getChannel() != other.getChannel()) {
               return false;
            } else if (this.hasContent() != other.hasContent()) {
               return false;
            } else if (this.hasContent() && !this.getContent().equals(other.getContent())) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasSex() != other.hasSex()) {
               return false;
            } else if (this.hasSex() && this.getSex() != other.getSex()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (this.hasVipLv() != other.hasVipLv()) {
               return false;
            } else if (this.hasVipLv() && this.getVipLv() != other.getVipLv()) {
               return false;
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
               return false;
            } else if (this.hasPrestige() != other.hasPrestige()) {
               return false;
            } else if (this.hasPrestige() && this.getPrestige() != other.getPrestige()) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasProvince() != other.hasProvince()) {
               return false;
            } else if (this.hasProvince() && !this.getProvince().equals(other.getProvince())) {
               return false;
            } else if (this.hasCity() != other.hasCity()) {
               return false;
            } else if (this.hasCity() && !this.getCity().equals(other.getCity())) {
               return false;
            } else if (this.hasSubclass() != other.hasSubclass()) {
               return false;
            } else if (this.hasSubclass() && this.getSubclass() != other.getSubclass()) {
               return false;
            } else if (this.hasExtra1() != other.hasExtra1()) {
               return false;
            } else if (this.hasExtra1() && this.getExtra1() != other.getExtra1()) {
               return false;
            } else if (this.hasExtra2() != other.hasExtra2()) {
               return false;
            } else if (this.hasExtra2() && !this.getExtra2().equals(other.getExtra2())) {
               return false;
            } else if (this.hasHeroInfo() != other.hasHeroInfo()) {
               return false;
            } else if (this.hasHeroInfo() && !this.getHeroInfo().equals(other.getHeroInfo())) {
               return false;
            } else if (this.hasChatTime() != other.hasChatTime()) {
               return false;
            } else if (this.hasChatTime() && this.getChatTime() != other.getChatTime()) {
               return false;
            } else if (this.hasChatId() != other.hasChatId()) {
               return false;
            } else if (this.hasChatId() && this.getChatId() != other.getChatId()) {
               return false;
            } else if (this.hasShowVip() != other.hasShowVip()) {
               return false;
            } else if (this.hasShowVip() && this.getShowVip() != other.getShowVip()) {
               return false;
            } else if (this.hasAppointId() != other.hasAppointId()) {
               return false;
            } else if (this.hasAppointId() && this.getAppointId() != other.getAppointId()) {
               return false;
            } else if (this.hasSecondTitle() != other.hasSecondTitle()) {
               return false;
            } else if (this.hasSecondTitle() && this.getSecondTitle() != other.getSecondTitle()) {
               return false;
            } else if (this.hasUnionId() != other.hasUnionId()) {
               return false;
            } else if (this.hasUnionId() && this.getUnionId() != other.getUnionId()) {
               return false;
            } else if (this.hasItemInfo() != other.hasItemInfo()) {
               return false;
            } else if (this.hasItemInfo() && !this.getItemInfo().equals(other.getItemInfo())) {
               return false;
            } else if (this.hasShareTips() != other.hasShareTips()) {
               return false;
            } else if (this.hasShareTips() && !this.getShareTips().equals(other.getShareTips())) {
               return false;
            } else if (this.hasBubble() != other.hasBubble()) {
               return false;
            } else if (this.hasBubble() && this.getBubble() != other.getBubble()) {
               return false;
            } else if (this.hasAreaId() != other.hasAreaId()) {
               return false;
            } else if (this.hasAreaId() && this.getAreaId() != other.getAreaId()) {
               return false;
            } else if (this.hasProvinceId() != other.hasProvinceId()) {
               return false;
            } else if (this.hasProvinceId() && this.getProvinceId() != other.getProvinceId()) {
               return false;
            } else if (this.hasCityId() != other.hasCityId()) {
               return false;
            } else if (this.hasCityId() && this.getCityId() != other.getCityId()) {
               return false;
            } else if (!this.getMedalList().equals(other.getMedalList())) {
               return false;
            } else if (!this.getCustomPrestigeList().equals(other.getCustomPrestigeList())) {
               return false;
            } else if (this.hasQqLogo() != other.hasQqLogo()) {
               return false;
            } else if (this.hasQqLogo() && !this.getQqLogo().equals(other.getQqLogo())) {
               return false;
            } else if (this.hasQqWanKaLv() != other.hasQqWanKaLv()) {
               return false;
            } else if (this.hasQqWanKaLv() && this.getQqWanKaLv() != other.getQqWanKaLv()) {
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
            if (this.hasChannel()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChannel();
            }

            if (this.hasContent()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getContent().hashCode();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasSex()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getSex();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getLevel();
            }

            if (this.hasVipLv()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getVipLv();
            }

            if (this.hasHead()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasPrestige()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getPrestige();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasProvince()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getProvince().hashCode();
            }

            if (this.hasCity()) {
               hash = 37 * hash + 13;
               hash = 53 * hash + this.getCity().hashCode();
            }

            if (this.hasSubclass()) {
               hash = 37 * hash + 14;
               hash = 53 * hash + this.getSubclass();
            }

            if (this.hasExtra1()) {
               hash = 37 * hash + 15;
               hash = 53 * hash + this.getExtra1();
            }

            if (this.hasExtra2()) {
               hash = 37 * hash + 16;
               hash = 53 * hash + this.getExtra2().hashCode();
            }

            if (this.hasHeroInfo()) {
               hash = 37 * hash + 17;
               hash = 53 * hash + this.getHeroInfo().hashCode();
            }

            if (this.hasChatTime()) {
               hash = 37 * hash + 18;
               hash = 53 * hash + this.getChatTime();
            }

            if (this.hasChatId()) {
               hash = 37 * hash + 19;
               hash = 53 * hash + this.getChatId();
            }

            if (this.hasShowVip()) {
               hash = 37 * hash + 20;
               hash = 53 * hash + Internal.hashBoolean(this.getShowVip());
            }

            if (this.hasAppointId()) {
               hash = 37 * hash + 21;
               hash = 53 * hash + this.getAppointId();
            }

            if (this.hasSecondTitle()) {
               hash = 37 * hash + 22;
               hash = 53 * hash + this.getSecondTitle();
            }

            if (this.hasUnionId()) {
               hash = 37 * hash + 23;
               hash = 53 * hash + this.getUnionId();
            }

            if (this.hasItemInfo()) {
               hash = 37 * hash + 24;
               hash = 53 * hash + this.getItemInfo().hashCode();
            }

            if (this.hasShareTips()) {
               hash = 37 * hash + 25;
               hash = 53 * hash + this.getShareTips().hashCode();
            }

            if (this.hasBubble()) {
               hash = 37 * hash + 26;
               hash = 53 * hash + this.getBubble();
            }

            if (this.hasAreaId()) {
               hash = 37 * hash + 27;
               hash = 53 * hash + this.getAreaId();
            }

            if (this.hasProvinceId()) {
               hash = 37 * hash + 28;
               hash = 53 * hash + this.getProvinceId();
            }

            if (this.hasCityId()) {
               hash = 37 * hash + 29;
               hash = 53 * hash + this.getCityId();
            }

            if (this.getMedalCount() > 0) {
               hash = 37 * hash + 30;
               hash = 53 * hash + this.getMedalList().hashCode();
            }

            if (this.getCustomPrestigeCount() > 0) {
               hash = 37 * hash + 31;
               hash = 53 * hash + this.getCustomPrestigeList().hashCode();
            }

            if (this.hasQqLogo()) {
               hash = 37 * hash + 32;
               hash = 53 * hash + this.getQqLogo().hashCode();
            }

            if (this.hasQqWanKaLv()) {
               hash = 37 * hash + 33;
               hash = 53 * hash + this.getQqWanKaLv();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static Chat_Info parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (Chat_Info)PARSER.parseFrom(data);
      }

      public static Chat_Info parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Chat_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Chat_Info parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (Chat_Info)PARSER.parseFrom(data);
      }

      public static Chat_Info parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Chat_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Chat_Info parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (Chat_Info)PARSER.parseFrom(data);
      }

      public static Chat_Info parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Chat_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Chat_Info parseFrom(InputStream input) throws IOException {
         return (Chat_Info)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static Chat_Info parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Chat_Info)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static Chat_Info parseDelimitedFrom(InputStream input) throws IOException {
         return (Chat_Info)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static Chat_Info parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Chat_Info)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static Chat_Info parseFrom(CodedInputStream input) throws IOException {
         return (Chat_Info)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static Chat_Info parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Chat_Info)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(Chat_Info prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static Chat_Info getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<Chat_Info> parser() {
         return PARSER;
      }

      public Parser<Chat_Info> getParserForType() {
         return PARSER;
      }

      public Chat_Info getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Chat_InfoOrBuilder {
         private int bitField0_;
         private int bitField1_;
         private int channel_;
         private Object content_;
         private int playerId_;
         private Object playerName_;
         private int sex_;
         private int level_;
         private int vipLv_;
         private int head_;
         private int headFrame_;
         private int prestige_;
         private int serverId_;
         private Object province_;
         private Object city_;
         private int subclass_;
         private int extra1_;
         private Object extra2_;
         private CommonMsg.HeroInfo heroInfo_;
         private SingleFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> heroInfoBuilder_;
         private int chatTime_;
         private int chatId_;
         private boolean showVip_;
         private int appointId_;
         private int secondTitle_;
         private int unionId_;
         private BagMsg.Item_Info itemInfo_;
         private SingleFieldBuilderV3<BagMsg.Item_Info, BagMsg.Item_Info.Builder, BagMsg.Item_InfoOrBuilder> itemInfoBuilder_;
         private Object shareTips_;
         private int bubble_;
         private int areaId_;
         private int provinceId_;
         private int cityId_;
         private Internal.IntList medal_;
         private List<CommonMsg.MapDataIS> customPrestige_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataIS, CommonMsg.MapDataIS.Builder, CommonMsg.MapDataISOrBuilder> customPrestigeBuilder_;
         private Object qqLogo_;
         private int qqWanKaLv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_Chat_Info_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_Chat_Info_fieldAccessorTable.ensureFieldAccessorsInitialized(Chat_Info.class, Builder.class);
         }

         private Builder() {
            this.content_ = "";
            this.playerName_ = "";
            this.province_ = "";
            this.city_ = "";
            this.extra2_ = "";
            this.shareTips_ = "";
            this.medal_ = ChatMsg.Chat_Info.emptyIntList();
            this.customPrestige_ = Collections.emptyList();
            this.qqLogo_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.content_ = "";
            this.playerName_ = "";
            this.province_ = "";
            this.city_ = "";
            this.extra2_ = "";
            this.shareTips_ = "";
            this.medal_ = ChatMsg.Chat_Info.emptyIntList();
            this.customPrestige_ = Collections.emptyList();
            this.qqLogo_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChatMsg.Chat_Info.alwaysUseFieldBuilders) {
               this.getHeroInfoFieldBuilder();
               this.getItemInfoFieldBuilder();
               this.getCustomPrestigeFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.channel_ = 0;
            this.bitField0_ &= -2;
            this.content_ = "";
            this.bitField0_ &= -3;
            this.playerId_ = 0;
            this.bitField0_ &= -5;
            this.playerName_ = "";
            this.bitField0_ &= -9;
            this.sex_ = 0;
            this.bitField0_ &= -17;
            this.level_ = 0;
            this.bitField0_ &= -33;
            this.vipLv_ = 0;
            this.bitField0_ &= -65;
            this.head_ = 0;
            this.bitField0_ &= -129;
            this.headFrame_ = 0;
            this.bitField0_ &= -257;
            this.prestige_ = 0;
            this.bitField0_ &= -513;
            this.serverId_ = 0;
            this.bitField0_ &= -1025;
            this.province_ = "";
            this.bitField0_ &= -2049;
            this.city_ = "";
            this.bitField0_ &= -4097;
            this.subclass_ = 0;
            this.bitField0_ &= -8193;
            this.extra1_ = 0;
            this.bitField0_ &= -16385;
            this.extra2_ = "";
            this.bitField0_ &= -32769;
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -65537;
            this.chatTime_ = 0;
            this.bitField0_ &= -131073;
            this.chatId_ = 0;
            this.bitField0_ &= -262145;
            this.showVip_ = false;
            this.bitField0_ &= -524289;
            this.appointId_ = 0;
            this.bitField0_ &= -1048577;
            this.secondTitle_ = 0;
            this.bitField0_ &= -2097153;
            this.unionId_ = 0;
            this.bitField0_ &= -4194305;
            if (this.itemInfoBuilder_ == null) {
               this.itemInfo_ = null;
            } else {
               this.itemInfoBuilder_.clear();
            }

            this.bitField0_ &= -8388609;
            this.shareTips_ = "";
            this.bitField0_ &= -16777217;
            this.bubble_ = 0;
            this.bitField0_ &= -33554433;
            this.areaId_ = 0;
            this.bitField0_ &= -67108865;
            this.provinceId_ = 0;
            this.bitField0_ &= -134217729;
            this.cityId_ = 0;
            this.bitField0_ &= -268435457;
            this.medal_ = ChatMsg.Chat_Info.emptyIntList();
            this.bitField0_ &= -536870913;
            if (this.customPrestigeBuilder_ == null) {
               this.customPrestige_ = Collections.emptyList();
               this.bitField0_ &= -1073741825;
            } else {
               this.customPrestigeBuilder_.clear();
            }

            this.qqLogo_ = "";
            this.bitField0_ &= Integer.MAX_VALUE;
            this.qqWanKaLv_ = 0;
            this.bitField1_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_Chat_Info_descriptor;
         }

         public Chat_Info getDefaultInstanceForType() {
            return ChatMsg.Chat_Info.getDefaultInstance();
         }

         public Chat_Info build() {
            Chat_Info result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public Chat_Info buildPartial() {
            Chat_Info result = new Chat_Info(this);
            int from_bitField0_ = this.bitField0_;
            int from_bitField1_ = this.bitField1_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.channel_ = this.channel_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.content_ = this.content_;
            if ((from_bitField0_ & 4) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 16) != 0) {
               result.sex_ = this.sex_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.vipLv_ = this.vipLv_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.head_ = this.head_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.prestige_ = this.prestige_;
               to_bitField0_ |= 512;
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 1024;
            }

            if ((from_bitField0_ & 2048) != 0) {
               to_bitField0_ |= 2048;
            }

            result.province_ = this.province_;
            if ((from_bitField0_ & 4096) != 0) {
               to_bitField0_ |= 4096;
            }

            result.city_ = this.city_;
            if ((from_bitField0_ & 8192) != 0) {
               result.subclass_ = this.subclass_;
               to_bitField0_ |= 8192;
            }

            if ((from_bitField0_ & 16384) != 0) {
               result.extra1_ = this.extra1_;
               to_bitField0_ |= 16384;
            }

            if ((from_bitField0_ & '耀') != 0) {
               to_bitField0_ |= 32768;
            }

            result.extra2_ = this.extra2_;
            if ((from_bitField0_ & 65536) != 0) {
               if (this.heroInfoBuilder_ == null) {
                  result.heroInfo_ = this.heroInfo_;
               } else {
                  result.heroInfo_ = (CommonMsg.HeroInfo)this.heroInfoBuilder_.build();
               }

               to_bitField0_ |= 65536;
            }

            if ((from_bitField0_ & 131072) != 0) {
               result.chatTime_ = this.chatTime_;
               to_bitField0_ |= 131072;
            }

            if ((from_bitField0_ & 262144) != 0) {
               result.chatId_ = this.chatId_;
               to_bitField0_ |= 262144;
            }

            if ((from_bitField0_ & 524288) != 0) {
               result.showVip_ = this.showVip_;
               to_bitField0_ |= 524288;
            }

            if ((from_bitField0_ & 1048576) != 0) {
               result.appointId_ = this.appointId_;
               to_bitField0_ |= 1048576;
            }

            if ((from_bitField0_ & 2097152) != 0) {
               result.secondTitle_ = this.secondTitle_;
               to_bitField0_ |= 2097152;
            }

            if ((from_bitField0_ & 4194304) != 0) {
               result.unionId_ = this.unionId_;
               to_bitField0_ |= 4194304;
            }

            if ((from_bitField0_ & 8388608) != 0) {
               if (this.itemInfoBuilder_ == null) {
                  result.itemInfo_ = this.itemInfo_;
               } else {
                  result.itemInfo_ = (BagMsg.Item_Info)this.itemInfoBuilder_.build();
               }

               to_bitField0_ |= 8388608;
            }

            if ((from_bitField0_ & 16777216) != 0) {
               to_bitField0_ |= 16777216;
            }

            result.shareTips_ = this.shareTips_;
            if ((from_bitField0_ & 33554432) != 0) {
               result.bubble_ = this.bubble_;
               to_bitField0_ |= 33554432;
            }

            if ((from_bitField0_ & 67108864) != 0) {
               result.areaId_ = this.areaId_;
               to_bitField0_ |= 67108864;
            }

            if ((from_bitField0_ & 134217728) != 0) {
               result.provinceId_ = this.provinceId_;
               to_bitField0_ |= 134217728;
            }

            if ((from_bitField0_ & 268435456) != 0) {
               result.cityId_ = this.cityId_;
               to_bitField0_ |= 268435456;
            }

            if ((this.bitField0_ & 536870912) != 0) {
               this.medal_.makeImmutable();
               this.bitField0_ &= -536870913;
            }

            result.medal_ = this.medal_;
            if (this.customPrestigeBuilder_ == null) {
               if ((this.bitField0_ & 1073741824) != 0) {
                  this.customPrestige_ = Collections.unmodifiableList(this.customPrestige_);
                  this.bitField0_ &= -1073741825;
               }

               result.customPrestige_ = this.customPrestige_;
            } else {
               result.customPrestige_ = this.customPrestigeBuilder_.build();
            }

            if ((from_bitField0_ & Integer.MIN_VALUE) != 0) {
               to_bitField0_ |= 536870912;
            }

            result.qqLogo_ = this.qqLogo_;
            if ((from_bitField1_ & 1) != 0) {
               result.qqWanKaLv_ = this.qqWanKaLv_;
               to_bitField0_ |= 1073741824;
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
            if (other instanceof Chat_Info) {
               return this.mergeFrom((Chat_Info)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(Chat_Info other) {
            if (other == ChatMsg.Chat_Info.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChannel()) {
                  this.setChannel(other.getChannel());
               }

               if (other.hasContent()) {
                  this.bitField0_ |= 2;
                  this.content_ = other.content_;
                  this.onChanged();
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 8;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasSex()) {
                  this.setSex(other.getSex());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (other.hasVipLv()) {
                  this.setVipLv(other.getVipLv());
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               if (other.hasPrestige()) {
                  this.setPrestige(other.getPrestige());
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasProvince()) {
                  this.bitField0_ |= 2048;
                  this.province_ = other.province_;
                  this.onChanged();
               }

               if (other.hasCity()) {
                  this.bitField0_ |= 4096;
                  this.city_ = other.city_;
                  this.onChanged();
               }

               if (other.hasSubclass()) {
                  this.setSubclass(other.getSubclass());
               }

               if (other.hasExtra1()) {
                  this.setExtra1(other.getExtra1());
               }

               if (other.hasExtra2()) {
                  this.bitField0_ |= 32768;
                  this.extra2_ = other.extra2_;
                  this.onChanged();
               }

               if (other.hasHeroInfo()) {
                  this.mergeHeroInfo(other.getHeroInfo());
               }

               if (other.hasChatTime()) {
                  this.setChatTime(other.getChatTime());
               }

               if (other.hasChatId()) {
                  this.setChatId(other.getChatId());
               }

               if (other.hasShowVip()) {
                  this.setShowVip(other.getShowVip());
               }

               if (other.hasAppointId()) {
                  this.setAppointId(other.getAppointId());
               }

               if (other.hasSecondTitle()) {
                  this.setSecondTitle(other.getSecondTitle());
               }

               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               if (other.hasItemInfo()) {
                  this.mergeItemInfo(other.getItemInfo());
               }

               if (other.hasShareTips()) {
                  this.bitField0_ |= 16777216;
                  this.shareTips_ = other.shareTips_;
                  this.onChanged();
               }

               if (other.hasBubble()) {
                  this.setBubble(other.getBubble());
               }

               if (other.hasAreaId()) {
                  this.setAreaId(other.getAreaId());
               }

               if (other.hasProvinceId()) {
                  this.setProvinceId(other.getProvinceId());
               }

               if (other.hasCityId()) {
                  this.setCityId(other.getCityId());
               }

               if (!other.medal_.isEmpty()) {
                  if (this.medal_.isEmpty()) {
                     this.medal_ = other.medal_;
                     this.bitField0_ &= -536870913;
                  } else {
                     this.ensureMedalIsMutable();
                     this.medal_.addAll(other.medal_);
                  }

                  this.onChanged();
               }

               if (this.customPrestigeBuilder_ == null) {
                  if (!other.customPrestige_.isEmpty()) {
                     if (this.customPrestige_.isEmpty()) {
                        this.customPrestige_ = other.customPrestige_;
                        this.bitField0_ &= -1073741825;
                     } else {
                        this.ensureCustomPrestigeIsMutable();
                        this.customPrestige_.addAll(other.customPrestige_);
                     }

                     this.onChanged();
                  }
               } else if (!other.customPrestige_.isEmpty()) {
                  if (this.customPrestigeBuilder_.isEmpty()) {
                     this.customPrestigeBuilder_.dispose();
                     this.customPrestigeBuilder_ = null;
                     this.customPrestige_ = other.customPrestige_;
                     this.bitField0_ &= -1073741825;
                     this.customPrestigeBuilder_ = ChatMsg.Chat_Info.alwaysUseFieldBuilders ? this.getCustomPrestigeFieldBuilder() : null;
                  } else {
                     this.customPrestigeBuilder_.addAllMessages(other.customPrestige_);
                  }
               }

               if (other.hasQqLogo()) {
                  this.bitField0_ |= Integer.MIN_VALUE;
                  this.qqLogo_ = other.qqLogo_;
                  this.onChanged();
               }

               if (other.hasQqWanKaLv()) {
                  this.setQqWanKaLv(other.getQqWanKaLv());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChannel()) {
               return false;
            } else if (!this.hasContent()) {
               return false;
            } else if (this.hasHeroInfo() && !this.getHeroInfo().isInitialized()) {
               return false;
            } else if (this.hasItemInfo() && !this.getItemInfo().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getCustomPrestigeCount(); ++i) {
                  if (!this.getCustomPrestige(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            Chat_Info parsedMessage = null;

            try {
               parsedMessage = (Chat_Info)ChatMsg.Chat_Info.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (Chat_Info)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChannel() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getChannel() {
            return this.channel_;
         }

         public Builder setChannel(int value) {
            this.bitField0_ |= 1;
            this.channel_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChannel() {
            this.bitField0_ &= -2;
            this.channel_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasContent() {
            return (this.bitField0_ & 2) != 0;
         }

         public String getContent() {
            Object ref = this.content_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.content_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getContentBytes() {
            Object ref = this.content_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.content_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setContent(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.content_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearContent() {
            this.bitField0_ &= -3;
            this.content_ = ChatMsg.Chat_Info.getDefaultInstance().getContent();
            this.onChanged();
            return this;
         }

         public Builder setContentBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.content_ = value;
               this.onChanged();
               return this;
            }
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
            this.playerName_ = ChatMsg.Chat_Info.getDefaultInstance().getPlayerName();
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

         public boolean hasSex() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getSex() {
            return this.sex_;
         }

         public Builder setSex(int value) {
            this.bitField0_ |= 16;
            this.sex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSex() {
            this.bitField0_ &= -17;
            this.sex_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 32;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -33;
            this.level_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasVipLv() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getVipLv() {
            return this.vipLv_;
         }

         public Builder setVipLv(int value) {
            this.bitField0_ |= 64;
            this.vipLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearVipLv() {
            this.bitField0_ &= -65;
            this.vipLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHead() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getHead() {
            return this.head_;
         }

         public Builder setHead(int value) {
            this.bitField0_ |= 128;
            this.head_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHead() {
            this.bitField0_ &= -129;
            this.head_ = 0;
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

         public boolean hasProvince() {
            return (this.bitField0_ & 2048) != 0;
         }

         public String getProvince() {
            Object ref = this.province_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.province_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getProvinceBytes() {
            Object ref = this.province_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.province_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setProvince(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2048;
               this.province_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearProvince() {
            this.bitField0_ &= -2049;
            this.province_ = ChatMsg.Chat_Info.getDefaultInstance().getProvince();
            this.onChanged();
            return this;
         }

         public Builder setProvinceBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2048;
               this.province_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasCity() {
            return (this.bitField0_ & 4096) != 0;
         }

         public String getCity() {
            Object ref = this.city_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.city_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getCityBytes() {
            Object ref = this.city_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.city_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setCity(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4096;
               this.city_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearCity() {
            this.bitField0_ &= -4097;
            this.city_ = ChatMsg.Chat_Info.getDefaultInstance().getCity();
            this.onChanged();
            return this;
         }

         public Builder setCityBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4096;
               this.city_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasSubclass() {
            return (this.bitField0_ & 8192) != 0;
         }

         public int getSubclass() {
            return this.subclass_;
         }

         public Builder setSubclass(int value) {
            this.bitField0_ |= 8192;
            this.subclass_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSubclass() {
            this.bitField0_ &= -8193;
            this.subclass_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasExtra1() {
            return (this.bitField0_ & 16384) != 0;
         }

         public int getExtra1() {
            return this.extra1_;
         }

         public Builder setExtra1(int value) {
            this.bitField0_ |= 16384;
            this.extra1_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearExtra1() {
            this.bitField0_ &= -16385;
            this.extra1_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasExtra2() {
            return (this.bitField0_ & '耀') != 0;
         }

         public String getExtra2() {
            Object ref = this.extra2_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.extra2_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getExtra2Bytes() {
            Object ref = this.extra2_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.extra2_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setExtra2(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 32768;
               this.extra2_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearExtra2() {
            this.bitField0_ &= -32769;
            this.extra2_ = ChatMsg.Chat_Info.getDefaultInstance().getExtra2();
            this.onChanged();
            return this;
         }

         public Builder setExtra2Bytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 32768;
               this.extra2_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasHeroInfo() {
            return (this.bitField0_ & 65536) != 0;
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

            this.bitField0_ |= 65536;
            return this;
         }

         public Builder setHeroInfo(CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.heroInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 65536;
            return this;
         }

         public Builder mergeHeroInfo(CommonMsg.HeroInfo value) {
            if (this.heroInfoBuilder_ == null) {
               if ((this.bitField0_ & 65536) != 0 && this.heroInfo_ != null && this.heroInfo_ != CommonMsg.HeroInfo.getDefaultInstance()) {
                  this.heroInfo_ = CommonMsg.HeroInfo.newBuilder(this.heroInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.heroInfo_ = value;
               }

               this.onChanged();
            } else {
               this.heroInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 65536;
            return this;
         }

         public Builder clearHeroInfo() {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
               this.onChanged();
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -65537;
            return this;
         }

         public CommonMsg.HeroInfo.Builder getHeroInfoBuilder() {
            this.bitField0_ |= 65536;
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

         public boolean hasChatTime() {
            return (this.bitField0_ & 131072) != 0;
         }

         public int getChatTime() {
            return this.chatTime_;
         }

         public Builder setChatTime(int value) {
            this.bitField0_ |= 131072;
            this.chatTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChatTime() {
            this.bitField0_ &= -131073;
            this.chatTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasChatId() {
            return (this.bitField0_ & 262144) != 0;
         }

         public int getChatId() {
            return this.chatId_;
         }

         public Builder setChatId(int value) {
            this.bitField0_ |= 262144;
            this.chatId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChatId() {
            this.bitField0_ &= -262145;
            this.chatId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasShowVip() {
            return (this.bitField0_ & 524288) != 0;
         }

         public boolean getShowVip() {
            return this.showVip_;
         }

         public Builder setShowVip(boolean value) {
            this.bitField0_ |= 524288;
            this.showVip_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShowVip() {
            this.bitField0_ &= -524289;
            this.showVip_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasAppointId() {
            return (this.bitField0_ & 1048576) != 0;
         }

         public int getAppointId() {
            return this.appointId_;
         }

         public Builder setAppointId(int value) {
            this.bitField0_ |= 1048576;
            this.appointId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAppointId() {
            this.bitField0_ &= -1048577;
            this.appointId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSecondTitle() {
            return (this.bitField0_ & 2097152) != 0;
         }

         public int getSecondTitle() {
            return this.secondTitle_;
         }

         public Builder setSecondTitle(int value) {
            this.bitField0_ |= 2097152;
            this.secondTitle_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSecondTitle() {
            this.bitField0_ &= -2097153;
            this.secondTitle_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionId() {
            return (this.bitField0_ & 4194304) != 0;
         }

         public int getUnionId() {
            return this.unionId_;
         }

         public Builder setUnionId(int value) {
            this.bitField0_ |= 4194304;
            this.unionId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionId() {
            this.bitField0_ &= -4194305;
            this.unionId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasItemInfo() {
            return (this.bitField0_ & 8388608) != 0;
         }

         public BagMsg.Item_Info getItemInfo() {
            if (this.itemInfoBuilder_ == null) {
               return this.itemInfo_ == null ? BagMsg.Item_Info.getDefaultInstance() : this.itemInfo_;
            } else {
               return (BagMsg.Item_Info)this.itemInfoBuilder_.getMessage();
            }
         }

         public Builder setItemInfo(BagMsg.Item_Info value) {
            if (this.itemInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.itemInfo_ = value;
               this.onChanged();
            } else {
               this.itemInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 8388608;
            return this;
         }

         public Builder setItemInfo(BagMsg.Item_Info.Builder builderForValue) {
            if (this.itemInfoBuilder_ == null) {
               this.itemInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.itemInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 8388608;
            return this;
         }

         public Builder mergeItemInfo(BagMsg.Item_Info value) {
            if (this.itemInfoBuilder_ == null) {
               if ((this.bitField0_ & 8388608) != 0 && this.itemInfo_ != null && this.itemInfo_ != BagMsg.Item_Info.getDefaultInstance()) {
                  this.itemInfo_ = BagMsg.Item_Info.newBuilder(this.itemInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.itemInfo_ = value;
               }

               this.onChanged();
            } else {
               this.itemInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 8388608;
            return this;
         }

         public Builder clearItemInfo() {
            if (this.itemInfoBuilder_ == null) {
               this.itemInfo_ = null;
               this.onChanged();
            } else {
               this.itemInfoBuilder_.clear();
            }

            this.bitField0_ &= -8388609;
            return this;
         }

         public BagMsg.Item_Info.Builder getItemInfoBuilder() {
            this.bitField0_ |= 8388608;
            this.onChanged();
            return (BagMsg.Item_Info.Builder)this.getItemInfoFieldBuilder().getBuilder();
         }

         public BagMsg.Item_InfoOrBuilder getItemInfoOrBuilder() {
            if (this.itemInfoBuilder_ != null) {
               return (BagMsg.Item_InfoOrBuilder)this.itemInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.itemInfo_ == null ? BagMsg.Item_Info.getDefaultInstance() : this.itemInfo_;
            }
         }

         private SingleFieldBuilderV3<BagMsg.Item_Info, BagMsg.Item_Info.Builder, BagMsg.Item_InfoOrBuilder> getItemInfoFieldBuilder() {
            if (this.itemInfoBuilder_ == null) {
               this.itemInfoBuilder_ = new SingleFieldBuilderV3(this.getItemInfo(), this.getParentForChildren(), this.isClean());
               this.itemInfo_ = null;
            }

            return this.itemInfoBuilder_;
         }

         public boolean hasShareTips() {
            return (this.bitField0_ & 16777216) != 0;
         }

         public String getShareTips() {
            Object ref = this.shareTips_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.shareTips_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getShareTipsBytes() {
            Object ref = this.shareTips_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.shareTips_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setShareTips(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16777216;
               this.shareTips_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearShareTips() {
            this.bitField0_ &= -16777217;
            this.shareTips_ = ChatMsg.Chat_Info.getDefaultInstance().getShareTips();
            this.onChanged();
            return this;
         }

         public Builder setShareTipsBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16777216;
               this.shareTips_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasBubble() {
            return (this.bitField0_ & 33554432) != 0;
         }

         public int getBubble() {
            return this.bubble_;
         }

         public Builder setBubble(int value) {
            this.bitField0_ |= 33554432;
            this.bubble_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBubble() {
            this.bitField0_ &= -33554433;
            this.bubble_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAreaId() {
            return (this.bitField0_ & 67108864) != 0;
         }

         public int getAreaId() {
            return this.areaId_;
         }

         public Builder setAreaId(int value) {
            this.bitField0_ |= 67108864;
            this.areaId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAreaId() {
            this.bitField0_ &= -67108865;
            this.areaId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasProvinceId() {
            return (this.bitField0_ & 134217728) != 0;
         }

         public int getProvinceId() {
            return this.provinceId_;
         }

         public Builder setProvinceId(int value) {
            this.bitField0_ |= 134217728;
            this.provinceId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearProvinceId() {
            this.bitField0_ &= -134217729;
            this.provinceId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCityId() {
            return (this.bitField0_ & 268435456) != 0;
         }

         public int getCityId() {
            return this.cityId_;
         }

         public Builder setCityId(int value) {
            this.bitField0_ |= 268435456;
            this.cityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCityId() {
            this.bitField0_ &= -268435457;
            this.cityId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureMedalIsMutable() {
            if ((this.bitField0_ & 536870912) == 0) {
               this.medal_ = ChatMsg.Chat_Info.mutableCopy(this.medal_);
               this.bitField0_ |= 536870912;
            }

         }

         public List<Integer> getMedalList() {
            return (List<Integer>)((this.bitField0_ & 536870912) != 0 ? Collections.unmodifiableList(this.medal_) : this.medal_);
         }

         public int getMedalCount() {
            return this.medal_.size();
         }

         public int getMedal(int index) {
            return this.medal_.getInt(index);
         }

         public Builder setMedal(int index, int value) {
            this.ensureMedalIsMutable();
            this.medal_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addMedal(int value) {
            this.ensureMedalIsMutable();
            this.medal_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllMedal(Iterable<? extends Integer> values) {
            this.ensureMedalIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.medal_);
            this.onChanged();
            return this;
         }

         public Builder clearMedal() {
            this.medal_ = ChatMsg.Chat_Info.emptyIntList();
            this.bitField0_ &= -536870913;
            this.onChanged();
            return this;
         }

         private void ensureCustomPrestigeIsMutable() {
            if ((this.bitField0_ & 1073741824) == 0) {
               this.customPrestige_ = new ArrayList(this.customPrestige_);
               this.bitField0_ |= 1073741824;
            }

         }

         public List<CommonMsg.MapDataIS> getCustomPrestigeList() {
            return this.customPrestigeBuilder_ == null ? Collections.unmodifiableList(this.customPrestige_) : this.customPrestigeBuilder_.getMessageList();
         }

         public int getCustomPrestigeCount() {
            return this.customPrestigeBuilder_ == null ? this.customPrestige_.size() : this.customPrestigeBuilder_.getCount();
         }

         public CommonMsg.MapDataIS getCustomPrestige(int index) {
            return this.customPrestigeBuilder_ == null ? (CommonMsg.MapDataIS)this.customPrestige_.get(index) : (CommonMsg.MapDataIS)this.customPrestigeBuilder_.getMessage(index);
         }

         public Builder setCustomPrestige(int index, CommonMsg.MapDataIS value) {
            if (this.customPrestigeBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCustomPrestigeIsMutable();
               this.customPrestige_.set(index, value);
               this.onChanged();
            } else {
               this.customPrestigeBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setCustomPrestige(int index, CommonMsg.MapDataIS.Builder builderForValue) {
            if (this.customPrestigeBuilder_ == null) {
               this.ensureCustomPrestigeIsMutable();
               this.customPrestige_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.customPrestigeBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addCustomPrestige(CommonMsg.MapDataIS value) {
            if (this.customPrestigeBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCustomPrestigeIsMutable();
               this.customPrestige_.add(value);
               this.onChanged();
            } else {
               this.customPrestigeBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addCustomPrestige(int index, CommonMsg.MapDataIS value) {
            if (this.customPrestigeBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCustomPrestigeIsMutable();
               this.customPrestige_.add(index, value);
               this.onChanged();
            } else {
               this.customPrestigeBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addCustomPrestige(CommonMsg.MapDataIS.Builder builderForValue) {
            if (this.customPrestigeBuilder_ == null) {
               this.ensureCustomPrestigeIsMutable();
               this.customPrestige_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.customPrestigeBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addCustomPrestige(int index, CommonMsg.MapDataIS.Builder builderForValue) {
            if (this.customPrestigeBuilder_ == null) {
               this.ensureCustomPrestigeIsMutable();
               this.customPrestige_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.customPrestigeBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllCustomPrestige(Iterable<? extends CommonMsg.MapDataIS> values) {
            if (this.customPrestigeBuilder_ == null) {
               this.ensureCustomPrestigeIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.customPrestige_);
               this.onChanged();
            } else {
               this.customPrestigeBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearCustomPrestige() {
            if (this.customPrestigeBuilder_ == null) {
               this.customPrestige_ = Collections.emptyList();
               this.bitField0_ &= -1073741825;
               this.onChanged();
            } else {
               this.customPrestigeBuilder_.clear();
            }

            return this;
         }

         public Builder removeCustomPrestige(int index) {
            if (this.customPrestigeBuilder_ == null) {
               this.ensureCustomPrestigeIsMutable();
               this.customPrestige_.remove(index);
               this.onChanged();
            } else {
               this.customPrestigeBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataIS.Builder getCustomPrestigeBuilder(int index) {
            return (CommonMsg.MapDataIS.Builder)this.getCustomPrestigeFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataISOrBuilder getCustomPrestigeOrBuilder(int index) {
            return this.customPrestigeBuilder_ == null ? (CommonMsg.MapDataISOrBuilder)this.customPrestige_.get(index) : (CommonMsg.MapDataISOrBuilder)this.customPrestigeBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataISOrBuilder> getCustomPrestigeOrBuilderList() {
            return this.customPrestigeBuilder_ != null ? this.customPrestigeBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.customPrestige_);
         }

         public CommonMsg.MapDataIS.Builder addCustomPrestigeBuilder() {
            return (CommonMsg.MapDataIS.Builder)this.getCustomPrestigeFieldBuilder().addBuilder(CommonMsg.MapDataIS.getDefaultInstance());
         }

         public CommonMsg.MapDataIS.Builder addCustomPrestigeBuilder(int index) {
            return (CommonMsg.MapDataIS.Builder)this.getCustomPrestigeFieldBuilder().addBuilder(index, CommonMsg.MapDataIS.getDefaultInstance());
         }

         public List<CommonMsg.MapDataIS.Builder> getCustomPrestigeBuilderList() {
            return this.getCustomPrestigeFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataIS, CommonMsg.MapDataIS.Builder, CommonMsg.MapDataISOrBuilder> getCustomPrestigeFieldBuilder() {
            if (this.customPrestigeBuilder_ == null) {
               this.customPrestigeBuilder_ = new RepeatedFieldBuilderV3(this.customPrestige_, (this.bitField0_ & 1073741824) != 0, this.getParentForChildren(), this.isClean());
               this.customPrestige_ = null;
            }

            return this.customPrestigeBuilder_;
         }

         public boolean hasQqLogo() {
            return (this.bitField0_ & Integer.MIN_VALUE) != 0;
         }

         public String getQqLogo() {
            Object ref = this.qqLogo_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.qqLogo_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getQqLogoBytes() {
            Object ref = this.qqLogo_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.qqLogo_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setQqLogo(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= Integer.MIN_VALUE;
               this.qqLogo_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearQqLogo() {
            this.bitField0_ &= Integer.MAX_VALUE;
            this.qqLogo_ = ChatMsg.Chat_Info.getDefaultInstance().getQqLogo();
            this.onChanged();
            return this;
         }

         public Builder setQqLogoBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= Integer.MIN_VALUE;
               this.qqLogo_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasQqWanKaLv() {
            return (this.bitField1_ & 1) != 0;
         }

         public int getQqWanKaLv() {
            return this.qqWanKaLv_;
         }

         public Builder setQqWanKaLv(int value) {
            this.bitField1_ |= 1;
            this.qqWanKaLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearQqWanKaLv() {
            this.bitField1_ &= -2;
            this.qqWanKaLv_ = 0;
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

   public static final class Chat_Condition extends GeneratedMessageV3 implements Chat_ConditionOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHANNEL_FIELD_NUMBER = 1;
      private int channel_;
      public static final int COOLTIME_FIELD_NUMBER = 2;
      private int coolTime_;
      public static final int BALL_FIELD_NUMBER = 3;
      private boolean bAll_;
      public static final int LEVEL_FIELD_NUMBER = 4;
      private int level_;
      public static final int VIP_FIELD_NUMBER = 5;
      private int vip_;
      private byte memoizedIsInitialized;
      private static final Chat_Condition DEFAULT_INSTANCE = new Chat_Condition();
      /** @deprecated */
      @Deprecated
      public static final Parser<Chat_Condition> PARSER = new AbstractParser<Chat_Condition>() {
         public Chat_Condition parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new Chat_Condition(input, extensionRegistry);
         }
      };

      private Chat_Condition(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private Chat_Condition() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new Chat_Condition();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private Chat_Condition(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.channel_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.coolTime_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.bAll_ = input.readBool();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.level_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.vip_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_Chat_Condition_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_Chat_Condition_fieldAccessorTable.ensureFieldAccessorsInitialized(Chat_Condition.class, Builder.class);
      }

      public boolean hasChannel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChannel() {
         return this.channel_;
      }

      public boolean hasCoolTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCoolTime() {
         return this.coolTime_;
      }

      public boolean hasBAll() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getBAll() {
         return this.bAll_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public boolean hasVip() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getVip() {
         return this.vip_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChannel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCoolTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBAll()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasVip()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.channel_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.coolTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.bAll_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.level_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.vip_);
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
               size += CodedOutputStream.computeInt32Size(1, this.channel_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.coolTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.bAll_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.level_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.vip_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof Chat_Condition)) {
            return super.equals(obj);
         } else {
            Chat_Condition other = (Chat_Condition)obj;
            if (this.hasChannel() != other.hasChannel()) {
               return false;
            } else if (this.hasChannel() && this.getChannel() != other.getChannel()) {
               return false;
            } else if (this.hasCoolTime() != other.hasCoolTime()) {
               return false;
            } else if (this.hasCoolTime() && this.getCoolTime() != other.getCoolTime()) {
               return false;
            } else if (this.hasBAll() != other.hasBAll()) {
               return false;
            } else if (this.hasBAll() && this.getBAll() != other.getBAll()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (this.hasVip() != other.hasVip()) {
               return false;
            } else if (this.hasVip() && this.getVip() != other.getVip()) {
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
            if (this.hasChannel()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChannel();
            }

            if (this.hasCoolTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCoolTime();
            }

            if (this.hasBAll()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getBAll());
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getLevel();
            }

            if (this.hasVip()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getVip();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static Chat_Condition parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (Chat_Condition)PARSER.parseFrom(data);
      }

      public static Chat_Condition parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Chat_Condition)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Chat_Condition parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (Chat_Condition)PARSER.parseFrom(data);
      }

      public static Chat_Condition parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Chat_Condition)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Chat_Condition parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (Chat_Condition)PARSER.parseFrom(data);
      }

      public static Chat_Condition parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Chat_Condition)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Chat_Condition parseFrom(InputStream input) throws IOException {
         return (Chat_Condition)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static Chat_Condition parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Chat_Condition)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static Chat_Condition parseDelimitedFrom(InputStream input) throws IOException {
         return (Chat_Condition)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static Chat_Condition parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Chat_Condition)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static Chat_Condition parseFrom(CodedInputStream input) throws IOException {
         return (Chat_Condition)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static Chat_Condition parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Chat_Condition)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(Chat_Condition prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static Chat_Condition getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<Chat_Condition> parser() {
         return PARSER;
      }

      public Parser<Chat_Condition> getParserForType() {
         return PARSER;
      }

      public Chat_Condition getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Chat_ConditionOrBuilder {
         private int bitField0_;
         private int channel_;
         private int coolTime_;
         private boolean bAll_;
         private int level_;
         private int vip_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_Chat_Condition_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_Chat_Condition_fieldAccessorTable.ensureFieldAccessorsInitialized(Chat_Condition.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChatMsg.Chat_Condition.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.channel_ = 0;
            this.bitField0_ &= -2;
            this.coolTime_ = 0;
            this.bitField0_ &= -3;
            this.bAll_ = false;
            this.bitField0_ &= -5;
            this.level_ = 0;
            this.bitField0_ &= -9;
            this.vip_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_Chat_Condition_descriptor;
         }

         public Chat_Condition getDefaultInstanceForType() {
            return ChatMsg.Chat_Condition.getDefaultInstance();
         }

         public Chat_Condition build() {
            Chat_Condition result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public Chat_Condition buildPartial() {
            Chat_Condition result = new Chat_Condition(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.channel_ = this.channel_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.coolTime_ = this.coolTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.bAll_ = this.bAll_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.vip_ = this.vip_;
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
            if (other instanceof Chat_Condition) {
               return this.mergeFrom((Chat_Condition)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(Chat_Condition other) {
            if (other == ChatMsg.Chat_Condition.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChannel()) {
                  this.setChannel(other.getChannel());
               }

               if (other.hasCoolTime()) {
                  this.setCoolTime(other.getCoolTime());
               }

               if (other.hasBAll()) {
                  this.setBAll(other.getBAll());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (other.hasVip()) {
                  this.setVip(other.getVip());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChannel()) {
               return false;
            } else if (!this.hasCoolTime()) {
               return false;
            } else if (!this.hasBAll()) {
               return false;
            } else if (!this.hasLevel()) {
               return false;
            } else {
               return this.hasVip();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            Chat_Condition parsedMessage = null;

            try {
               parsedMessage = (Chat_Condition)ChatMsg.Chat_Condition.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (Chat_Condition)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChannel() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getChannel() {
            return this.channel_;
         }

         public Builder setChannel(int value) {
            this.bitField0_ |= 1;
            this.channel_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChannel() {
            this.bitField0_ &= -2;
            this.channel_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCoolTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCoolTime() {
            return this.coolTime_;
         }

         public Builder setCoolTime(int value) {
            this.bitField0_ |= 2;
            this.coolTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCoolTime() {
            this.bitField0_ &= -3;
            this.coolTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBAll() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getBAll() {
            return this.bAll_;
         }

         public Builder setBAll(boolean value) {
            this.bitField0_ |= 4;
            this.bAll_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBAll() {
            this.bitField0_ &= -5;
            this.bAll_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 8;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -9;
            this.level_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasVip() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getVip() {
            return this.vip_;
         }

         public Builder setVip(int value) {
            this.bitField0_ |= 16;
            this.vip_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearVip() {
            this.bitField0_ &= -17;
            this.vip_ = 0;
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

   public static final class C2S_Chat_6003 extends GeneratedMessageV3 implements C2S_Chat_6003OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHANNEL_FIELD_NUMBER = 1;
      private int channel_;
      public static final int CONTENT_FIELD_NUMBER = 2;
      private volatile Object content_;
      public static final int SUBCLASS_FIELD_NUMBER = 3;
      private int subclass_;
      public static final int DESTPLAYERID_FIELD_NUMBER = 4;
      private int destPlayerId_;
      public static final int CODE_FIELD_NUMBER = 5;
      private int code_;
      public static final int SHARETIPS_FIELD_NUMBER = 6;
      private volatile Object shareTips_;
      private byte memoizedIsInitialized;
      private static final C2S_Chat_6003 DEFAULT_INSTANCE = new C2S_Chat_6003();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Chat_6003> PARSER = new AbstractParser<C2S_Chat_6003>() {
         public C2S_Chat_6003 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Chat_6003(input, extensionRegistry);
         }
      };

      private C2S_Chat_6003(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Chat_6003() {
         this.memoizedIsInitialized = -1;
         this.content_ = "";
         this.shareTips_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Chat_6003();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Chat_6003(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.channel_ = input.readInt32();
                        break;
                     case 18:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.content_ = bs;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.subclass_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.destPlayerId_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.code_ = input.readInt32();
                        break;
                     case 50:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 32;
                        this.shareTips_ = bs;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_Chat_6003_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_Chat_6003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Chat_6003.class, Builder.class);
      }

      public boolean hasChannel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChannel() {
         return this.channel_;
      }

      public boolean hasContent() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getContent() {
         Object ref = this.content_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.content_ = s;
            }

            return s;
         }
      }

      public ByteString getContentBytes() {
         Object ref = this.content_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.content_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasSubclass() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSubclass() {
         return this.subclass_;
      }

      public boolean hasDestPlayerId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getDestPlayerId() {
         return this.destPlayerId_;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasShareTips() {
         return (this.bitField0_ & 32) != 0;
      }

      public String getShareTips() {
         Object ref = this.shareTips_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.shareTips_ = s;
            }

            return s;
         }
      }

      public ByteString getShareTipsBytes() {
         Object ref = this.shareTips_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.shareTips_ = b;
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
         } else if (!this.hasChannel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasContent()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.channel_);
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.content_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.subclass_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.destPlayerId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.code_);
         }

         if ((this.bitField0_ & 32) != 0) {
            GeneratedMessageV3.writeString(output, 6, this.shareTips_);
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
               size += CodedOutputStream.computeInt32Size(1, this.channel_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(2, this.content_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.subclass_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.destPlayerId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.code_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += GeneratedMessageV3.computeStringSize(6, this.shareTips_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Chat_6003)) {
            return super.equals(obj);
         } else {
            C2S_Chat_6003 other = (C2S_Chat_6003)obj;
            if (this.hasChannel() != other.hasChannel()) {
               return false;
            } else if (this.hasChannel() && this.getChannel() != other.getChannel()) {
               return false;
            } else if (this.hasContent() != other.hasContent()) {
               return false;
            } else if (this.hasContent() && !this.getContent().equals(other.getContent())) {
               return false;
            } else if (this.hasSubclass() != other.hasSubclass()) {
               return false;
            } else if (this.hasSubclass() && this.getSubclass() != other.getSubclass()) {
               return false;
            } else if (this.hasDestPlayerId() != other.hasDestPlayerId()) {
               return false;
            } else if (this.hasDestPlayerId() && this.getDestPlayerId() != other.getDestPlayerId()) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasShareTips() != other.hasShareTips()) {
               return false;
            } else if (this.hasShareTips() && !this.getShareTips().equals(other.getShareTips())) {
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
            if (this.hasChannel()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChannel();
            }

            if (this.hasContent()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getContent().hashCode();
            }

            if (this.hasSubclass()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSubclass();
            }

            if (this.hasDestPlayerId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getDestPlayerId();
            }

            if (this.hasCode()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasShareTips()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getShareTips().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Chat_6003 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Chat_6003)PARSER.parseFrom(data);
      }

      public static C2S_Chat_6003 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Chat_6003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Chat_6003 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Chat_6003)PARSER.parseFrom(data);
      }

      public static C2S_Chat_6003 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Chat_6003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Chat_6003 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Chat_6003)PARSER.parseFrom(data);
      }

      public static C2S_Chat_6003 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Chat_6003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Chat_6003 parseFrom(InputStream input) throws IOException {
         return (C2S_Chat_6003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Chat_6003 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Chat_6003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Chat_6003 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Chat_6003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Chat_6003 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Chat_6003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Chat_6003 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Chat_6003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Chat_6003 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Chat_6003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Chat_6003 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Chat_6003 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Chat_6003> parser() {
         return PARSER;
      }

      public Parser<C2S_Chat_6003> getParserForType() {
         return PARSER;
      }

      public C2S_Chat_6003 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Chat_6003OrBuilder {
         private int bitField0_;
         private int channel_;
         private Object content_;
         private int subclass_;
         private int destPlayerId_;
         private int code_;
         private Object shareTips_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_Chat_6003_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_Chat_6003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Chat_6003.class, Builder.class);
         }

         private Builder() {
            this.content_ = "";
            this.shareTips_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.content_ = "";
            this.shareTips_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChatMsg.C2S_Chat_6003.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.channel_ = 0;
            this.bitField0_ &= -2;
            this.content_ = "";
            this.bitField0_ &= -3;
            this.subclass_ = 0;
            this.bitField0_ &= -5;
            this.destPlayerId_ = 0;
            this.bitField0_ &= -9;
            this.code_ = 0;
            this.bitField0_ &= -17;
            this.shareTips_ = "";
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_Chat_6003_descriptor;
         }

         public C2S_Chat_6003 getDefaultInstanceForType() {
            return ChatMsg.C2S_Chat_6003.getDefaultInstance();
         }

         public C2S_Chat_6003 build() {
            C2S_Chat_6003 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Chat_6003 buildPartial() {
            C2S_Chat_6003 result = new C2S_Chat_6003(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.channel_ = this.channel_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.content_ = this.content_;
            if ((from_bitField0_ & 4) != 0) {
               result.subclass_ = this.subclass_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.destPlayerId_ = this.destPlayerId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               to_bitField0_ |= 32;
            }

            result.shareTips_ = this.shareTips_;
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
            if (other instanceof C2S_Chat_6003) {
               return this.mergeFrom((C2S_Chat_6003)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Chat_6003 other) {
            if (other == ChatMsg.C2S_Chat_6003.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChannel()) {
                  this.setChannel(other.getChannel());
               }

               if (other.hasContent()) {
                  this.bitField0_ |= 2;
                  this.content_ = other.content_;
                  this.onChanged();
               }

               if (other.hasSubclass()) {
                  this.setSubclass(other.getSubclass());
               }

               if (other.hasDestPlayerId()) {
                  this.setDestPlayerId(other.getDestPlayerId());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasShareTips()) {
                  this.bitField0_ |= 32;
                  this.shareTips_ = other.shareTips_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChannel()) {
               return false;
            } else {
               return this.hasContent();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Chat_6003 parsedMessage = null;

            try {
               parsedMessage = (C2S_Chat_6003)ChatMsg.C2S_Chat_6003.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Chat_6003)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChannel() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getChannel() {
            return this.channel_;
         }

         public Builder setChannel(int value) {
            this.bitField0_ |= 1;
            this.channel_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChannel() {
            this.bitField0_ &= -2;
            this.channel_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasContent() {
            return (this.bitField0_ & 2) != 0;
         }

         public String getContent() {
            Object ref = this.content_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.content_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getContentBytes() {
            Object ref = this.content_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.content_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setContent(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.content_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearContent() {
            this.bitField0_ &= -3;
            this.content_ = ChatMsg.C2S_Chat_6003.getDefaultInstance().getContent();
            this.onChanged();
            return this;
         }

         public Builder setContentBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.content_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasSubclass() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSubclass() {
            return this.subclass_;
         }

         public Builder setSubclass(int value) {
            this.bitField0_ |= 4;
            this.subclass_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSubclass() {
            this.bitField0_ &= -5;
            this.subclass_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDestPlayerId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getDestPlayerId() {
            return this.destPlayerId_;
         }

         public Builder setDestPlayerId(int value) {
            this.bitField0_ |= 8;
            this.destPlayerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDestPlayerId() {
            this.bitField0_ &= -9;
            this.destPlayerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 16;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -17;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasShareTips() {
            return (this.bitField0_ & 32) != 0;
         }

         public String getShareTips() {
            Object ref = this.shareTips_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.shareTips_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getShareTipsBytes() {
            Object ref = this.shareTips_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.shareTips_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setShareTips(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 32;
               this.shareTips_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearShareTips() {
            this.bitField0_ &= -33;
            this.shareTips_ = ChatMsg.C2S_Chat_6003.getDefaultInstance().getShareTips();
            this.onChanged();
            return this;
         }

         public Builder setShareTipsBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 32;
               this.shareTips_ = value;
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

   public static final class S2C_Chat_6004 extends GeneratedMessageV3 implements S2C_Chat_6004OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<Chat_Info> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_Chat_6004 DEFAULT_INSTANCE = new S2C_Chat_6004();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Chat_6004> PARSER = new AbstractParser<S2C_Chat_6004>() {
         public S2C_Chat_6004 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Chat_6004(input, extensionRegistry);
         }
      };

      private S2C_Chat_6004(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Chat_6004() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Chat_6004();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Chat_6004(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.infos_.add(input.readMessage(ChatMsg.Chat_Info.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_Chat_6004_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_Chat_6004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Chat_6004.class, Builder.class);
      }

      public List<Chat_Info> getInfosList() {
         return this.infos_;
      }

      public List<? extends Chat_InfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public Chat_Info getInfos(int index) {
         return (Chat_Info)this.infos_.get(index);
      }

      public Chat_InfoOrBuilder getInfosOrBuilder(int index) {
         return (Chat_InfoOrBuilder)this.infos_.get(index);
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
         } else if (!(obj instanceof S2C_Chat_6004)) {
            return super.equals(obj);
         } else {
            S2C_Chat_6004 other = (S2C_Chat_6004)obj;
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

      public static S2C_Chat_6004 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Chat_6004)PARSER.parseFrom(data);
      }

      public static S2C_Chat_6004 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Chat_6004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Chat_6004 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Chat_6004)PARSER.parseFrom(data);
      }

      public static S2C_Chat_6004 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Chat_6004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Chat_6004 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Chat_6004)PARSER.parseFrom(data);
      }

      public static S2C_Chat_6004 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Chat_6004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Chat_6004 parseFrom(InputStream input) throws IOException {
         return (S2C_Chat_6004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Chat_6004 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Chat_6004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Chat_6004 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Chat_6004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Chat_6004 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Chat_6004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Chat_6004 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Chat_6004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Chat_6004 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Chat_6004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Chat_6004 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Chat_6004 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Chat_6004> parser() {
         return PARSER;
      }

      public Parser<S2C_Chat_6004> getParserForType() {
         return PARSER;
      }

      public S2C_Chat_6004 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Chat_6004OrBuilder {
         private int bitField0_;
         private List<Chat_Info> infos_;
         private RepeatedFieldBuilderV3<Chat_Info, Chat_Info.Builder, Chat_InfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_Chat_6004_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_Chat_6004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Chat_6004.class, Builder.class);
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
            if (ChatMsg.S2C_Chat_6004.alwaysUseFieldBuilders) {
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
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_Chat_6004_descriptor;
         }

         public S2C_Chat_6004 getDefaultInstanceForType() {
            return ChatMsg.S2C_Chat_6004.getDefaultInstance();
         }

         public S2C_Chat_6004 build() {
            S2C_Chat_6004 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Chat_6004 buildPartial() {
            S2C_Chat_6004 result = new S2C_Chat_6004(this);
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
            if (other instanceof S2C_Chat_6004) {
               return this.mergeFrom((S2C_Chat_6004)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Chat_6004 other) {
            if (other == ChatMsg.S2C_Chat_6004.getDefaultInstance()) {
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
                     this.infosBuilder_ = ChatMsg.S2C_Chat_6004.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
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
            S2C_Chat_6004 parsedMessage = null;

            try {
               parsedMessage = (S2C_Chat_6004)ChatMsg.S2C_Chat_6004.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Chat_6004)e.getUnfinishedMessage();
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

         public List<Chat_Info> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public Chat_Info getInfos(int index) {
            return this.infosBuilder_ == null ? (Chat_Info)this.infos_.get(index) : (Chat_Info)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, Chat_Info value) {
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

         public Builder setInfos(int index, Chat_Info.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(Chat_Info value) {
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

         public Builder addInfos(int index, Chat_Info value) {
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

         public Builder addInfos(Chat_Info.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, Chat_Info.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends Chat_Info> values) {
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

         public Chat_Info.Builder getInfosBuilder(int index) {
            return (Chat_Info.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public Chat_InfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (Chat_InfoOrBuilder)this.infos_.get(index) : (Chat_InfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends Chat_InfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public Chat_Info.Builder addInfosBuilder() {
            return (Chat_Info.Builder)this.getInfosFieldBuilder().addBuilder(ChatMsg.Chat_Info.getDefaultInstance());
         }

         public Chat_Info.Builder addInfosBuilder(int index) {
            return (Chat_Info.Builder)this.getInfosFieldBuilder().addBuilder(index, ChatMsg.Chat_Info.getDefaultInstance());
         }

         public List<Chat_Info.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<Chat_Info, Chat_Info.Builder, Chat_InfoOrBuilder> getInfosFieldBuilder() {
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

   public static final class C2S_DelRecord_6005 extends GeneratedMessageV3 implements C2S_DelRecord_6005OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      private byte memoizedIsInitialized;
      private static final C2S_DelRecord_6005 DEFAULT_INSTANCE = new C2S_DelRecord_6005();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DelRecord_6005> PARSER = new AbstractParser<C2S_DelRecord_6005>() {
         public C2S_DelRecord_6005 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DelRecord_6005(input, extensionRegistry);
         }
      };

      private C2S_DelRecord_6005(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DelRecord_6005() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DelRecord_6005();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DelRecord_6005(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_DelRecord_6005_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_DelRecord_6005_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DelRecord_6005.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DelRecord_6005)) {
            return super.equals(obj);
         } else {
            C2S_DelRecord_6005 other = (C2S_DelRecord_6005)obj;
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

      public static C2S_DelRecord_6005 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DelRecord_6005)PARSER.parseFrom(data);
      }

      public static C2S_DelRecord_6005 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DelRecord_6005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DelRecord_6005 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DelRecord_6005)PARSER.parseFrom(data);
      }

      public static C2S_DelRecord_6005 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DelRecord_6005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DelRecord_6005 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DelRecord_6005)PARSER.parseFrom(data);
      }

      public static C2S_DelRecord_6005 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DelRecord_6005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DelRecord_6005 parseFrom(InputStream input) throws IOException {
         return (C2S_DelRecord_6005)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DelRecord_6005 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DelRecord_6005)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DelRecord_6005 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DelRecord_6005)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DelRecord_6005 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DelRecord_6005)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DelRecord_6005 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DelRecord_6005)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DelRecord_6005 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DelRecord_6005)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DelRecord_6005 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DelRecord_6005 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DelRecord_6005> parser() {
         return PARSER;
      }

      public Parser<C2S_DelRecord_6005> getParserForType() {
         return PARSER;
      }

      public C2S_DelRecord_6005 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DelRecord_6005OrBuilder {
         private int bitField0_;
         private int playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_DelRecord_6005_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_DelRecord_6005_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DelRecord_6005.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChatMsg.C2S_DelRecord_6005.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_DelRecord_6005_descriptor;
         }

         public C2S_DelRecord_6005 getDefaultInstanceForType() {
            return ChatMsg.C2S_DelRecord_6005.getDefaultInstance();
         }

         public C2S_DelRecord_6005 build() {
            C2S_DelRecord_6005 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DelRecord_6005 buildPartial() {
            C2S_DelRecord_6005 result = new C2S_DelRecord_6005(this);
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
            if (other instanceof C2S_DelRecord_6005) {
               return this.mergeFrom((C2S_DelRecord_6005)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DelRecord_6005 other) {
            if (other == ChatMsg.C2S_DelRecord_6005.getDefaultInstance()) {
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
            C2S_DelRecord_6005 parsedMessage = null;

            try {
               parsedMessage = (C2S_DelRecord_6005)ChatMsg.C2S_DelRecord_6005.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DelRecord_6005)e.getUnfinishedMessage();
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

   public static final class S2C_DelRecord_6006 extends GeneratedMessageV3 implements S2C_DelRecord_6006OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      private byte memoizedIsInitialized;
      private static final S2C_DelRecord_6006 DEFAULT_INSTANCE = new S2C_DelRecord_6006();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DelRecord_6006> PARSER = new AbstractParser<S2C_DelRecord_6006>() {
         public S2C_DelRecord_6006 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DelRecord_6006(input, extensionRegistry);
         }
      };

      private S2C_DelRecord_6006(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DelRecord_6006() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DelRecord_6006();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DelRecord_6006(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_DelRecord_6006_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_DelRecord_6006_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DelRecord_6006.class, Builder.class);
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
            output.writeInt32(1, this.result_);
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
               size += CodedOutputStream.computeInt32Size(1, this.result_);
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
         } else if (!(obj instanceof S2C_DelRecord_6006)) {
            return super.equals(obj);
         } else {
            S2C_DelRecord_6006 other = (S2C_DelRecord_6006)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
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

      public static S2C_DelRecord_6006 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DelRecord_6006)PARSER.parseFrom(data);
      }

      public static S2C_DelRecord_6006 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DelRecord_6006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DelRecord_6006 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DelRecord_6006)PARSER.parseFrom(data);
      }

      public static S2C_DelRecord_6006 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DelRecord_6006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DelRecord_6006 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DelRecord_6006)PARSER.parseFrom(data);
      }

      public static S2C_DelRecord_6006 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DelRecord_6006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DelRecord_6006 parseFrom(InputStream input) throws IOException {
         return (S2C_DelRecord_6006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DelRecord_6006 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DelRecord_6006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DelRecord_6006 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DelRecord_6006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DelRecord_6006 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DelRecord_6006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DelRecord_6006 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DelRecord_6006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DelRecord_6006 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DelRecord_6006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DelRecord_6006 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DelRecord_6006 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DelRecord_6006> parser() {
         return PARSER;
      }

      public Parser<S2C_DelRecord_6006> getParserForType() {
         return PARSER;
      }

      public S2C_DelRecord_6006 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DelRecord_6006OrBuilder {
         private int bitField0_;
         private int result_;
         private int playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_DelRecord_6006_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_DelRecord_6006_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DelRecord_6006.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChatMsg.S2C_DelRecord_6006.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_DelRecord_6006_descriptor;
         }

         public S2C_DelRecord_6006 getDefaultInstanceForType() {
            return ChatMsg.S2C_DelRecord_6006.getDefaultInstance();
         }

         public S2C_DelRecord_6006 build() {
            S2C_DelRecord_6006 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DelRecord_6006 buildPartial() {
            S2C_DelRecord_6006 result = new S2C_DelRecord_6006(this);
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
            if (other instanceof S2C_DelRecord_6006) {
               return this.mergeFrom((S2C_DelRecord_6006)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DelRecord_6006 other) {
            if (other == ChatMsg.S2C_DelRecord_6006.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
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
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DelRecord_6006 parsedMessage = null;

            try {
               parsedMessage = (S2C_DelRecord_6006)ChatMsg.S2C_DelRecord_6006.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DelRecord_6006)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_FightToFriend_6007 extends GeneratedMessageV3 implements C2S_FightToFriend_6007OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SERVERID_FIELD_NUMBER = 1;
      private int serverId_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int CROSS_FIELD_NUMBER = 3;
      private boolean cross_;
      private byte memoizedIsInitialized;
      private static final C2S_FightToFriend_6007 DEFAULT_INSTANCE = new C2S_FightToFriend_6007();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FightToFriend_6007> PARSER = new AbstractParser<C2S_FightToFriend_6007>() {
         public C2S_FightToFriend_6007 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FightToFriend_6007(input, extensionRegistry);
         }
      };

      private C2S_FightToFriend_6007(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FightToFriend_6007() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FightToFriend_6007();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FightToFriend_6007(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.serverId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.playerId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.cross_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_FightToFriend_6007_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_FightToFriend_6007_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FightToFriend_6007.class, Builder.class);
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasCross() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getCross() {
         return this.cross_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasServerId()) {
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
            output.writeInt32(1, this.serverId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.cross_);
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
               size += CodedOutputStream.computeInt32Size(1, this.serverId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.cross_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FightToFriend_6007)) {
            return super.equals(obj);
         } else {
            C2S_FightToFriend_6007 other = (C2S_FightToFriend_6007)obj;
            if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasCross() != other.hasCross()) {
               return false;
            } else if (this.hasCross() && this.getCross() != other.getCross()) {
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
            if (this.hasServerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasCross()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getCross());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FightToFriend_6007 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FightToFriend_6007)PARSER.parseFrom(data);
      }

      public static C2S_FightToFriend_6007 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FightToFriend_6007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FightToFriend_6007 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FightToFriend_6007)PARSER.parseFrom(data);
      }

      public static C2S_FightToFriend_6007 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FightToFriend_6007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FightToFriend_6007 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FightToFriend_6007)PARSER.parseFrom(data);
      }

      public static C2S_FightToFriend_6007 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FightToFriend_6007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FightToFriend_6007 parseFrom(InputStream input) throws IOException {
         return (C2S_FightToFriend_6007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FightToFriend_6007 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FightToFriend_6007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FightToFriend_6007 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FightToFriend_6007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FightToFriend_6007 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FightToFriend_6007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FightToFriend_6007 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FightToFriend_6007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FightToFriend_6007 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FightToFriend_6007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FightToFriend_6007 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FightToFriend_6007 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FightToFriend_6007> parser() {
         return PARSER;
      }

      public Parser<C2S_FightToFriend_6007> getParserForType() {
         return PARSER;
      }

      public C2S_FightToFriend_6007 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FightToFriend_6007OrBuilder {
         private int bitField0_;
         private int serverId_;
         private int playerId_;
         private boolean cross_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_FightToFriend_6007_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_FightToFriend_6007_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FightToFriend_6007.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChatMsg.C2S_FightToFriend_6007.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.serverId_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.cross_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_FightToFriend_6007_descriptor;
         }

         public C2S_FightToFriend_6007 getDefaultInstanceForType() {
            return ChatMsg.C2S_FightToFriend_6007.getDefaultInstance();
         }

         public C2S_FightToFriend_6007 build() {
            C2S_FightToFriend_6007 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FightToFriend_6007 buildPartial() {
            C2S_FightToFriend_6007 result = new C2S_FightToFriend_6007(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.cross_ = this.cross_;
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
            if (other instanceof C2S_FightToFriend_6007) {
               return this.mergeFrom((C2S_FightToFriend_6007)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FightToFriend_6007 other) {
            if (other == ChatMsg.C2S_FightToFriend_6007.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasCross()) {
                  this.setCross(other.getCross());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasServerId()) {
               return false;
            } else {
               return this.hasPlayerId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_FightToFriend_6007 parsedMessage = null;

            try {
               parsedMessage = (C2S_FightToFriend_6007)ChatMsg.C2S_FightToFriend_6007.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FightToFriend_6007)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 1;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -2;
            this.serverId_ = 0;
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

         public boolean hasCross() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getCross() {
            return this.cross_;
         }

         public Builder setCross(boolean value) {
            this.bitField0_ |= 4;
            this.cross_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCross() {
            this.bitField0_ &= -5;
            this.cross_ = false;
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

   public static final class C2S_PlayerDetailInfo_6009 extends GeneratedMessageV3 implements C2S_PlayerDetailInfo_6009OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int SERVERID_FIELD_NUMBER = 2;
      private int serverId_;
      public static final int ARRAYING_FIELD_NUMBER = 3;
      private int arraying_;
      public static final int CROSS_FIELD_NUMBER = 4;
      private boolean cross_;
      private byte memoizedIsInitialized;
      private static final C2S_PlayerDetailInfo_6009 DEFAULT_INSTANCE = new C2S_PlayerDetailInfo_6009();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PlayerDetailInfo_6009> PARSER = new AbstractParser<C2S_PlayerDetailInfo_6009>() {
         public C2S_PlayerDetailInfo_6009 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PlayerDetailInfo_6009(input, extensionRegistry);
         }
      };

      private C2S_PlayerDetailInfo_6009(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PlayerDetailInfo_6009() {
         this.memoizedIsInitialized = -1;
         this.arraying_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PlayerDetailInfo_6009();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PlayerDetailInfo_6009(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 24:
                        int rawValue = input.readEnum();
                        CommonMsg.HeroState value = CommonMsg.HeroState.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(3, rawValue);
                        } else {
                           this.bitField0_ |= 4;
                           this.arraying_ = rawValue;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.cross_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_PlayerDetailInfo_6009_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_PlayerDetailInfo_6009_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PlayerDetailInfo_6009.class, Builder.class);
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

      public boolean hasArraying() {
         return (this.bitField0_ & 4) != 0;
      }

      public CommonMsg.HeroState getArraying() {
         CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arraying_);
         return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
      }

      public boolean hasCross() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getCross() {
         return this.cross_;
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

         if ((this.bitField0_ & 4) != 0) {
            output.writeEnum(3, this.arraying_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBool(4, this.cross_);
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

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeEnumSize(3, this.arraying_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.cross_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PlayerDetailInfo_6009)) {
            return super.equals(obj);
         } else {
            C2S_PlayerDetailInfo_6009 other = (C2S_PlayerDetailInfo_6009)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasArraying() != other.hasArraying()) {
               return false;
            } else if (this.hasArraying() && this.arraying_ != other.arraying_) {
               return false;
            } else if (this.hasCross() != other.hasCross()) {
               return false;
            } else if (this.hasCross() && this.getCross() != other.getCross()) {
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

            if (this.hasArraying()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.arraying_;
            }

            if (this.hasCross()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getCross());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PlayerDetailInfo_6009 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PlayerDetailInfo_6009)PARSER.parseFrom(data);
      }

      public static C2S_PlayerDetailInfo_6009 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PlayerDetailInfo_6009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PlayerDetailInfo_6009 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PlayerDetailInfo_6009)PARSER.parseFrom(data);
      }

      public static C2S_PlayerDetailInfo_6009 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PlayerDetailInfo_6009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PlayerDetailInfo_6009 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PlayerDetailInfo_6009)PARSER.parseFrom(data);
      }

      public static C2S_PlayerDetailInfo_6009 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PlayerDetailInfo_6009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PlayerDetailInfo_6009 parseFrom(InputStream input) throws IOException {
         return (C2S_PlayerDetailInfo_6009)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PlayerDetailInfo_6009 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PlayerDetailInfo_6009)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PlayerDetailInfo_6009 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PlayerDetailInfo_6009)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PlayerDetailInfo_6009 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PlayerDetailInfo_6009)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PlayerDetailInfo_6009 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PlayerDetailInfo_6009)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PlayerDetailInfo_6009 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PlayerDetailInfo_6009)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PlayerDetailInfo_6009 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PlayerDetailInfo_6009 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PlayerDetailInfo_6009> parser() {
         return PARSER;
      }

      public Parser<C2S_PlayerDetailInfo_6009> getParserForType() {
         return PARSER;
      }

      public C2S_PlayerDetailInfo_6009 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PlayerDetailInfo_6009OrBuilder {
         private int bitField0_;
         private int playerId_;
         private int serverId_;
         private int arraying_;
         private boolean cross_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_PlayerDetailInfo_6009_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_PlayerDetailInfo_6009_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PlayerDetailInfo_6009.class, Builder.class);
         }

         private Builder() {
            this.arraying_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.arraying_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChatMsg.C2S_PlayerDetailInfo_6009.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.serverId_ = 0;
            this.bitField0_ &= -3;
            this.arraying_ = 1;
            this.bitField0_ &= -5;
            this.cross_ = false;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_PlayerDetailInfo_6009_descriptor;
         }

         public C2S_PlayerDetailInfo_6009 getDefaultInstanceForType() {
            return ChatMsg.C2S_PlayerDetailInfo_6009.getDefaultInstance();
         }

         public C2S_PlayerDetailInfo_6009 build() {
            C2S_PlayerDetailInfo_6009 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PlayerDetailInfo_6009 buildPartial() {
            C2S_PlayerDetailInfo_6009 result = new C2S_PlayerDetailInfo_6009(this);
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

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.arraying_ = this.arraying_;
            if ((from_bitField0_ & 8) != 0) {
               result.cross_ = this.cross_;
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
            if (other instanceof C2S_PlayerDetailInfo_6009) {
               return this.mergeFrom((C2S_PlayerDetailInfo_6009)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PlayerDetailInfo_6009 other) {
            if (other == ChatMsg.C2S_PlayerDetailInfo_6009.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasArraying()) {
                  this.setArraying(other.getArraying());
               }

               if (other.hasCross()) {
                  this.setCross(other.getCross());
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
            C2S_PlayerDetailInfo_6009 parsedMessage = null;

            try {
               parsedMessage = (C2S_PlayerDetailInfo_6009)ChatMsg.C2S_PlayerDetailInfo_6009.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PlayerDetailInfo_6009)e.getUnfinishedMessage();
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

         public boolean hasArraying() {
            return (this.bitField0_ & 4) != 0;
         }

         public CommonMsg.HeroState getArraying() {
            CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arraying_);
            return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
         }

         public Builder setArraying(CommonMsg.HeroState value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.arraying_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearArraying() {
            this.bitField0_ &= -5;
            this.arraying_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasCross() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getCross() {
            return this.cross_;
         }

         public Builder setCross(boolean value) {
            this.bitField0_ |= 8;
            this.cross_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCross() {
            this.bitField0_ &= -9;
            this.cross_ = false;
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

   public static final class S2C_PlayerDetailInfo_6010 extends GeneratedMessageV3 implements S2C_PlayerDetailInfo_6010OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERINFO_FIELD_NUMBER = 1;
      private CommonMsg.PlayerInfo playerInfo_;
      public static final int ARRAYING_FIELD_NUMBER = 2;
      private int arraying_;
      public static final int REPORT_FIELD_NUMBER = 3;
      private boolean report_;
      private byte memoizedIsInitialized;
      private static final S2C_PlayerDetailInfo_6010 DEFAULT_INSTANCE = new S2C_PlayerDetailInfo_6010();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PlayerDetailInfo_6010> PARSER = new AbstractParser<S2C_PlayerDetailInfo_6010>() {
         public S2C_PlayerDetailInfo_6010 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PlayerDetailInfo_6010(input, extensionRegistry);
         }
      };

      private S2C_PlayerDetailInfo_6010(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PlayerDetailInfo_6010() {
         this.memoizedIsInitialized = -1;
         this.arraying_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PlayerDetailInfo_6010();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PlayerDetailInfo_6010(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           subBuilder = this.playerInfo_.toBuilder();
                        }

                        this.playerInfo_ = (CommonMsg.PlayerInfo)input.readMessage(CommonMsg.PlayerInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.playerInfo_);
                           this.playerInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        int rawValue = input.readEnum();
                        CommonMsg.HeroState value = CommonMsg.HeroState.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.arraying_ = rawValue;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.report_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_PlayerDetailInfo_6010_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_PlayerDetailInfo_6010_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PlayerDetailInfo_6010.class, Builder.class);
      }

      public boolean hasPlayerInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public CommonMsg.PlayerInfo getPlayerInfo() {
         return this.playerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.playerInfo_;
      }

      public CommonMsg.PlayerInfoOrBuilder getPlayerInfoOrBuilder() {
         return this.playerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.playerInfo_;
      }

      public boolean hasArraying() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.HeroState getArraying() {
         CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arraying_);
         return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
      }

      public boolean hasReport() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getReport() {
         return this.report_;
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.arraying_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.report_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(2, this.arraying_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.report_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PlayerDetailInfo_6010)) {
            return super.equals(obj);
         } else {
            S2C_PlayerDetailInfo_6010 other = (S2C_PlayerDetailInfo_6010)obj;
            if (this.hasPlayerInfo() != other.hasPlayerInfo()) {
               return false;
            } else if (this.hasPlayerInfo() && !this.getPlayerInfo().equals(other.getPlayerInfo())) {
               return false;
            } else if (this.hasArraying() != other.hasArraying()) {
               return false;
            } else if (this.hasArraying() && this.arraying_ != other.arraying_) {
               return false;
            } else if (this.hasReport() != other.hasReport()) {
               return false;
            } else if (this.hasReport() && this.getReport() != other.getReport()) {
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

            if (this.hasArraying()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.arraying_;
            }

            if (this.hasReport()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getReport());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PlayerDetailInfo_6010 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PlayerDetailInfo_6010)PARSER.parseFrom(data);
      }

      public static S2C_PlayerDetailInfo_6010 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PlayerDetailInfo_6010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PlayerDetailInfo_6010 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PlayerDetailInfo_6010)PARSER.parseFrom(data);
      }

      public static S2C_PlayerDetailInfo_6010 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PlayerDetailInfo_6010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PlayerDetailInfo_6010 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PlayerDetailInfo_6010)PARSER.parseFrom(data);
      }

      public static S2C_PlayerDetailInfo_6010 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PlayerDetailInfo_6010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PlayerDetailInfo_6010 parseFrom(InputStream input) throws IOException {
         return (S2C_PlayerDetailInfo_6010)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PlayerDetailInfo_6010 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PlayerDetailInfo_6010)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PlayerDetailInfo_6010 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PlayerDetailInfo_6010)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PlayerDetailInfo_6010 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PlayerDetailInfo_6010)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PlayerDetailInfo_6010 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PlayerDetailInfo_6010)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PlayerDetailInfo_6010 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PlayerDetailInfo_6010)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PlayerDetailInfo_6010 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PlayerDetailInfo_6010 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PlayerDetailInfo_6010> parser() {
         return PARSER;
      }

      public Parser<S2C_PlayerDetailInfo_6010> getParserForType() {
         return PARSER;
      }

      public S2C_PlayerDetailInfo_6010 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PlayerDetailInfo_6010OrBuilder {
         private int bitField0_;
         private CommonMsg.PlayerInfo playerInfo_;
         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> playerInfoBuilder_;
         private int arraying_;
         private boolean report_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_PlayerDetailInfo_6010_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_PlayerDetailInfo_6010_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PlayerDetailInfo_6010.class, Builder.class);
         }

         private Builder() {
            this.arraying_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.arraying_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChatMsg.S2C_PlayerDetailInfo_6010.alwaysUseFieldBuilders) {
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
            this.arraying_ = 1;
            this.bitField0_ &= -3;
            this.report_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_PlayerDetailInfo_6010_descriptor;
         }

         public S2C_PlayerDetailInfo_6010 getDefaultInstanceForType() {
            return ChatMsg.S2C_PlayerDetailInfo_6010.getDefaultInstance();
         }

         public S2C_PlayerDetailInfo_6010 build() {
            S2C_PlayerDetailInfo_6010 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PlayerDetailInfo_6010 buildPartial() {
            S2C_PlayerDetailInfo_6010 result = new S2C_PlayerDetailInfo_6010(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.playerInfoBuilder_ == null) {
                  result.playerInfo_ = this.playerInfo_;
               } else {
                  result.playerInfo_ = (CommonMsg.PlayerInfo)this.playerInfoBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.arraying_ = this.arraying_;
            if ((from_bitField0_ & 4) != 0) {
               result.report_ = this.report_;
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
            if (other instanceof S2C_PlayerDetailInfo_6010) {
               return this.mergeFrom((S2C_PlayerDetailInfo_6010)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PlayerDetailInfo_6010 other) {
            if (other == ChatMsg.S2C_PlayerDetailInfo_6010.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerInfo()) {
                  this.mergePlayerInfo(other.getPlayerInfo());
               }

               if (other.hasArraying()) {
                  this.setArraying(other.getArraying());
               }

               if (other.hasReport()) {
                  this.setReport(other.getReport());
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
            S2C_PlayerDetailInfo_6010 parsedMessage = null;

            try {
               parsedMessage = (S2C_PlayerDetailInfo_6010)ChatMsg.S2C_PlayerDetailInfo_6010.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PlayerDetailInfo_6010)e.getUnfinishedMessage();
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

         public CommonMsg.PlayerInfo getPlayerInfo() {
            if (this.playerInfoBuilder_ == null) {
               return this.playerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.playerInfo_;
            } else {
               return (CommonMsg.PlayerInfo)this.playerInfoBuilder_.getMessage();
            }
         }

         public Builder setPlayerInfo(CommonMsg.PlayerInfo value) {
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

         public Builder setPlayerInfo(CommonMsg.PlayerInfo.Builder builderForValue) {
            if (this.playerInfoBuilder_ == null) {
               this.playerInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.playerInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergePlayerInfo(CommonMsg.PlayerInfo value) {
            if (this.playerInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.playerInfo_ != null && this.playerInfo_ != CommonMsg.PlayerInfo.getDefaultInstance()) {
                  this.playerInfo_ = CommonMsg.PlayerInfo.newBuilder(this.playerInfo_).mergeFrom(value).buildPartial();
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

         public CommonMsg.PlayerInfo.Builder getPlayerInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (CommonMsg.PlayerInfo.Builder)this.getPlayerInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.PlayerInfoOrBuilder getPlayerInfoOrBuilder() {
            if (this.playerInfoBuilder_ != null) {
               return (CommonMsg.PlayerInfoOrBuilder)this.playerInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.playerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.playerInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> getPlayerInfoFieldBuilder() {
            if (this.playerInfoBuilder_ == null) {
               this.playerInfoBuilder_ = new SingleFieldBuilderV3(this.getPlayerInfo(), this.getParentForChildren(), this.isClean());
               this.playerInfo_ = null;
            }

            return this.playerInfoBuilder_;
         }

         public boolean hasArraying() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.HeroState getArraying() {
            CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arraying_);
            return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
         }

         public Builder setArraying(CommonMsg.HeroState value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.arraying_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearArraying() {
            this.bitField0_ &= -3;
            this.arraying_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasReport() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getReport() {
            return this.report_;
         }

         public Builder setReport(boolean value) {
            this.bitField0_ |= 4;
            this.report_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearReport() {
            this.bitField0_ &= -5;
            this.report_ = false;
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

   public static final class C2S_ChatDistory_6011 extends GeneratedMessageV3 implements C2S_ChatDistory_6011OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHANNEL_FIELD_NUMBER = 1;
      private int channel_;
      public static final int DESTPLAYERID_FIELD_NUMBER = 2;
      private int destPlayerId_;
      public static final int CHATID_FIELD_NUMBER = 3;
      private int chatId_;
      private byte memoizedIsInitialized;
      private static final C2S_ChatDistory_6011 DEFAULT_INSTANCE = new C2S_ChatDistory_6011();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ChatDistory_6011> PARSER = new AbstractParser<C2S_ChatDistory_6011>() {
         public C2S_ChatDistory_6011 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ChatDistory_6011(input, extensionRegistry);
         }
      };

      private C2S_ChatDistory_6011(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ChatDistory_6011() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ChatDistory_6011();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ChatDistory_6011(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.channel_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.destPlayerId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.chatId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_ChatDistory_6011_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_ChatDistory_6011_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChatDistory_6011.class, Builder.class);
      }

      public boolean hasChannel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChannel() {
         return this.channel_;
      }

      public boolean hasDestPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDestPlayerId() {
         return this.destPlayerId_;
      }

      public boolean hasChatId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getChatId() {
         return this.chatId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChannel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDestPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasChatId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.channel_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.destPlayerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.chatId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.channel_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.destPlayerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.chatId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ChatDistory_6011)) {
            return super.equals(obj);
         } else {
            C2S_ChatDistory_6011 other = (C2S_ChatDistory_6011)obj;
            if (this.hasChannel() != other.hasChannel()) {
               return false;
            } else if (this.hasChannel() && this.getChannel() != other.getChannel()) {
               return false;
            } else if (this.hasDestPlayerId() != other.hasDestPlayerId()) {
               return false;
            } else if (this.hasDestPlayerId() && this.getDestPlayerId() != other.getDestPlayerId()) {
               return false;
            } else if (this.hasChatId() != other.hasChatId()) {
               return false;
            } else if (this.hasChatId() && this.getChatId() != other.getChatId()) {
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
            if (this.hasChannel()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChannel();
            }

            if (this.hasDestPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDestPlayerId();
            }

            if (this.hasChatId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getChatId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ChatDistory_6011 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ChatDistory_6011)PARSER.parseFrom(data);
      }

      public static C2S_ChatDistory_6011 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChatDistory_6011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChatDistory_6011 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ChatDistory_6011)PARSER.parseFrom(data);
      }

      public static C2S_ChatDistory_6011 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChatDistory_6011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChatDistory_6011 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ChatDistory_6011)PARSER.parseFrom(data);
      }

      public static C2S_ChatDistory_6011 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChatDistory_6011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChatDistory_6011 parseFrom(InputStream input) throws IOException {
         return (C2S_ChatDistory_6011)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChatDistory_6011 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChatDistory_6011)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChatDistory_6011 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ChatDistory_6011)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ChatDistory_6011 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChatDistory_6011)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChatDistory_6011 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ChatDistory_6011)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChatDistory_6011 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChatDistory_6011)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ChatDistory_6011 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ChatDistory_6011 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ChatDistory_6011> parser() {
         return PARSER;
      }

      public Parser<C2S_ChatDistory_6011> getParserForType() {
         return PARSER;
      }

      public C2S_ChatDistory_6011 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ChatDistory_6011OrBuilder {
         private int bitField0_;
         private int channel_;
         private int destPlayerId_;
         private int chatId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_ChatDistory_6011_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_ChatDistory_6011_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChatDistory_6011.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChatMsg.C2S_ChatDistory_6011.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.channel_ = 0;
            this.bitField0_ &= -2;
            this.destPlayerId_ = 0;
            this.bitField0_ &= -3;
            this.chatId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_ChatDistory_6011_descriptor;
         }

         public C2S_ChatDistory_6011 getDefaultInstanceForType() {
            return ChatMsg.C2S_ChatDistory_6011.getDefaultInstance();
         }

         public C2S_ChatDistory_6011 build() {
            C2S_ChatDistory_6011 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ChatDistory_6011 buildPartial() {
            C2S_ChatDistory_6011 result = new C2S_ChatDistory_6011(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.channel_ = this.channel_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.destPlayerId_ = this.destPlayerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.chatId_ = this.chatId_;
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
            if (other instanceof C2S_ChatDistory_6011) {
               return this.mergeFrom((C2S_ChatDistory_6011)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ChatDistory_6011 other) {
            if (other == ChatMsg.C2S_ChatDistory_6011.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChannel()) {
                  this.setChannel(other.getChannel());
               }

               if (other.hasDestPlayerId()) {
                  this.setDestPlayerId(other.getDestPlayerId());
               }

               if (other.hasChatId()) {
                  this.setChatId(other.getChatId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChannel()) {
               return false;
            } else if (!this.hasDestPlayerId()) {
               return false;
            } else {
               return this.hasChatId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ChatDistory_6011 parsedMessage = null;

            try {
               parsedMessage = (C2S_ChatDistory_6011)ChatMsg.C2S_ChatDistory_6011.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ChatDistory_6011)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChannel() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getChannel() {
            return this.channel_;
         }

         public Builder setChannel(int value) {
            this.bitField0_ |= 1;
            this.channel_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChannel() {
            this.bitField0_ &= -2;
            this.channel_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDestPlayerId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDestPlayerId() {
            return this.destPlayerId_;
         }

         public Builder setDestPlayerId(int value) {
            this.bitField0_ |= 2;
            this.destPlayerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDestPlayerId() {
            this.bitField0_ &= -3;
            this.destPlayerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasChatId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getChatId() {
            return this.chatId_;
         }

         public Builder setChatId(int value) {
            this.bitField0_ |= 4;
            this.chatId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChatId() {
            this.bitField0_ &= -5;
            this.chatId_ = 0;
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

   public static final class S2C_ChatDistory_6012 extends GeneratedMessageV3 implements S2C_ChatDistory_6012OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<Chat_Info> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_ChatDistory_6012 DEFAULT_INSTANCE = new S2C_ChatDistory_6012();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ChatDistory_6012> PARSER = new AbstractParser<S2C_ChatDistory_6012>() {
         public S2C_ChatDistory_6012 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ChatDistory_6012(input, extensionRegistry);
         }
      };

      private S2C_ChatDistory_6012(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ChatDistory_6012() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ChatDistory_6012();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ChatDistory_6012(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.infos_.add(input.readMessage(ChatMsg.Chat_Info.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_ChatDistory_6012_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_ChatDistory_6012_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChatDistory_6012.class, Builder.class);
      }

      public List<Chat_Info> getInfosList() {
         return this.infos_;
      }

      public List<? extends Chat_InfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public Chat_Info getInfos(int index) {
         return (Chat_Info)this.infos_.get(index);
      }

      public Chat_InfoOrBuilder getInfosOrBuilder(int index) {
         return (Chat_InfoOrBuilder)this.infos_.get(index);
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
         } else if (!(obj instanceof S2C_ChatDistory_6012)) {
            return super.equals(obj);
         } else {
            S2C_ChatDistory_6012 other = (S2C_ChatDistory_6012)obj;
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

      public static S2C_ChatDistory_6012 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ChatDistory_6012)PARSER.parseFrom(data);
      }

      public static S2C_ChatDistory_6012 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChatDistory_6012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChatDistory_6012 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ChatDistory_6012)PARSER.parseFrom(data);
      }

      public static S2C_ChatDistory_6012 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChatDistory_6012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChatDistory_6012 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ChatDistory_6012)PARSER.parseFrom(data);
      }

      public static S2C_ChatDistory_6012 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChatDistory_6012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChatDistory_6012 parseFrom(InputStream input) throws IOException {
         return (S2C_ChatDistory_6012)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChatDistory_6012 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChatDistory_6012)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChatDistory_6012 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ChatDistory_6012)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ChatDistory_6012 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChatDistory_6012)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChatDistory_6012 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ChatDistory_6012)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChatDistory_6012 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChatDistory_6012)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ChatDistory_6012 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ChatDistory_6012 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ChatDistory_6012> parser() {
         return PARSER;
      }

      public Parser<S2C_ChatDistory_6012> getParserForType() {
         return PARSER;
      }

      public S2C_ChatDistory_6012 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ChatDistory_6012OrBuilder {
         private int bitField0_;
         private List<Chat_Info> infos_;
         private RepeatedFieldBuilderV3<Chat_Info, Chat_Info.Builder, Chat_InfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_ChatDistory_6012_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_ChatDistory_6012_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChatDistory_6012.class, Builder.class);
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
            if (ChatMsg.S2C_ChatDistory_6012.alwaysUseFieldBuilders) {
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
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_ChatDistory_6012_descriptor;
         }

         public S2C_ChatDistory_6012 getDefaultInstanceForType() {
            return ChatMsg.S2C_ChatDistory_6012.getDefaultInstance();
         }

         public S2C_ChatDistory_6012 build() {
            S2C_ChatDistory_6012 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ChatDistory_6012 buildPartial() {
            S2C_ChatDistory_6012 result = new S2C_ChatDistory_6012(this);
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
            if (other instanceof S2C_ChatDistory_6012) {
               return this.mergeFrom((S2C_ChatDistory_6012)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ChatDistory_6012 other) {
            if (other == ChatMsg.S2C_ChatDistory_6012.getDefaultInstance()) {
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
                     this.infosBuilder_ = ChatMsg.S2C_ChatDistory_6012.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
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
            S2C_ChatDistory_6012 parsedMessage = null;

            try {
               parsedMessage = (S2C_ChatDistory_6012)ChatMsg.S2C_ChatDistory_6012.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ChatDistory_6012)e.getUnfinishedMessage();
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

         public List<Chat_Info> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public Chat_Info getInfos(int index) {
            return this.infosBuilder_ == null ? (Chat_Info)this.infos_.get(index) : (Chat_Info)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, Chat_Info value) {
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

         public Builder setInfos(int index, Chat_Info.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(Chat_Info value) {
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

         public Builder addInfos(int index, Chat_Info value) {
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

         public Builder addInfos(Chat_Info.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, Chat_Info.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends Chat_Info> values) {
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

         public Chat_Info.Builder getInfosBuilder(int index) {
            return (Chat_Info.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public Chat_InfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (Chat_InfoOrBuilder)this.infos_.get(index) : (Chat_InfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends Chat_InfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public Chat_Info.Builder addInfosBuilder() {
            return (Chat_Info.Builder)this.getInfosFieldBuilder().addBuilder(ChatMsg.Chat_Info.getDefaultInstance());
         }

         public Chat_Info.Builder addInfosBuilder(int index) {
            return (Chat_Info.Builder)this.getInfosFieldBuilder().addBuilder(index, ChatMsg.Chat_Info.getDefaultInstance());
         }

         public List<Chat_Info.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<Chat_Info, Chat_Info.Builder, Chat_InfoOrBuilder> getInfosFieldBuilder() {
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

   public static final class C2S_ChatLogin_6013 extends GeneratedMessageV3 implements C2S_ChatLogin_6013OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ChatLogin_6013 DEFAULT_INSTANCE = new C2S_ChatLogin_6013();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ChatLogin_6013> PARSER = new AbstractParser<C2S_ChatLogin_6013>() {
         public C2S_ChatLogin_6013 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ChatLogin_6013(input, extensionRegistry);
         }
      };

      private C2S_ChatLogin_6013(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ChatLogin_6013() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ChatLogin_6013();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ChatLogin_6013(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_ChatLogin_6013_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_ChatLogin_6013_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChatLogin_6013.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ChatLogin_6013)) {
            return super.equals(obj);
         } else {
            C2S_ChatLogin_6013 other = (C2S_ChatLogin_6013)obj;
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

      public static C2S_ChatLogin_6013 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ChatLogin_6013)PARSER.parseFrom(data);
      }

      public static C2S_ChatLogin_6013 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChatLogin_6013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChatLogin_6013 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ChatLogin_6013)PARSER.parseFrom(data);
      }

      public static C2S_ChatLogin_6013 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChatLogin_6013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChatLogin_6013 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ChatLogin_6013)PARSER.parseFrom(data);
      }

      public static C2S_ChatLogin_6013 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChatLogin_6013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChatLogin_6013 parseFrom(InputStream input) throws IOException {
         return (C2S_ChatLogin_6013)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChatLogin_6013 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChatLogin_6013)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChatLogin_6013 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ChatLogin_6013)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ChatLogin_6013 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChatLogin_6013)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChatLogin_6013 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ChatLogin_6013)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChatLogin_6013 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChatLogin_6013)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ChatLogin_6013 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ChatLogin_6013 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ChatLogin_6013> parser() {
         return PARSER;
      }

      public Parser<C2S_ChatLogin_6013> getParserForType() {
         return PARSER;
      }

      public C2S_ChatLogin_6013 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ChatLogin_6013OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_ChatLogin_6013_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_ChatLogin_6013_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChatLogin_6013.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChatMsg.C2S_ChatLogin_6013.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_ChatLogin_6013_descriptor;
         }

         public C2S_ChatLogin_6013 getDefaultInstanceForType() {
            return ChatMsg.C2S_ChatLogin_6013.getDefaultInstance();
         }

         public C2S_ChatLogin_6013 build() {
            C2S_ChatLogin_6013 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ChatLogin_6013 buildPartial() {
            C2S_ChatLogin_6013 result = new C2S_ChatLogin_6013(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ChatLogin_6013) {
               return this.mergeFrom((C2S_ChatLogin_6013)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ChatLogin_6013 other) {
            if (other == ChatMsg.C2S_ChatLogin_6013.getDefaultInstance()) {
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
            C2S_ChatLogin_6013 parsedMessage = null;

            try {
               parsedMessage = (C2S_ChatLogin_6013)ChatMsg.C2S_ChatLogin_6013.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ChatLogin_6013)e.getUnfinishedMessage();
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

   public static final class S2C_ChatLogin_6014 extends GeneratedMessageV3 implements S2C_ChatLogin_6014OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<Chat_Info> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_ChatLogin_6014 DEFAULT_INSTANCE = new S2C_ChatLogin_6014();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ChatLogin_6014> PARSER = new AbstractParser<S2C_ChatLogin_6014>() {
         public S2C_ChatLogin_6014 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ChatLogin_6014(input, extensionRegistry);
         }
      };

      private S2C_ChatLogin_6014(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ChatLogin_6014() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ChatLogin_6014();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ChatLogin_6014(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.infos_.add(input.readMessage(ChatMsg.Chat_Info.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_ChatLogin_6014_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_ChatLogin_6014_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChatLogin_6014.class, Builder.class);
      }

      public List<Chat_Info> getInfosList() {
         return this.infos_;
      }

      public List<? extends Chat_InfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public Chat_Info getInfos(int index) {
         return (Chat_Info)this.infos_.get(index);
      }

      public Chat_InfoOrBuilder getInfosOrBuilder(int index) {
         return (Chat_InfoOrBuilder)this.infos_.get(index);
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
         } else if (!(obj instanceof S2C_ChatLogin_6014)) {
            return super.equals(obj);
         } else {
            S2C_ChatLogin_6014 other = (S2C_ChatLogin_6014)obj;
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

      public static S2C_ChatLogin_6014 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ChatLogin_6014)PARSER.parseFrom(data);
      }

      public static S2C_ChatLogin_6014 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChatLogin_6014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChatLogin_6014 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ChatLogin_6014)PARSER.parseFrom(data);
      }

      public static S2C_ChatLogin_6014 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChatLogin_6014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChatLogin_6014 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ChatLogin_6014)PARSER.parseFrom(data);
      }

      public static S2C_ChatLogin_6014 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChatLogin_6014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChatLogin_6014 parseFrom(InputStream input) throws IOException {
         return (S2C_ChatLogin_6014)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChatLogin_6014 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChatLogin_6014)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChatLogin_6014 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ChatLogin_6014)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ChatLogin_6014 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChatLogin_6014)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChatLogin_6014 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ChatLogin_6014)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChatLogin_6014 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChatLogin_6014)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ChatLogin_6014 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ChatLogin_6014 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ChatLogin_6014> parser() {
         return PARSER;
      }

      public Parser<S2C_ChatLogin_6014> getParserForType() {
         return PARSER;
      }

      public S2C_ChatLogin_6014 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ChatLogin_6014OrBuilder {
         private int bitField0_;
         private List<Chat_Info> infos_;
         private RepeatedFieldBuilderV3<Chat_Info, Chat_Info.Builder, Chat_InfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_ChatLogin_6014_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_ChatLogin_6014_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChatLogin_6014.class, Builder.class);
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
            if (ChatMsg.S2C_ChatLogin_6014.alwaysUseFieldBuilders) {
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
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_ChatLogin_6014_descriptor;
         }

         public S2C_ChatLogin_6014 getDefaultInstanceForType() {
            return ChatMsg.S2C_ChatLogin_6014.getDefaultInstance();
         }

         public S2C_ChatLogin_6014 build() {
            S2C_ChatLogin_6014 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ChatLogin_6014 buildPartial() {
            S2C_ChatLogin_6014 result = new S2C_ChatLogin_6014(this);
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
            if (other instanceof S2C_ChatLogin_6014) {
               return this.mergeFrom((S2C_ChatLogin_6014)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ChatLogin_6014 other) {
            if (other == ChatMsg.S2C_ChatLogin_6014.getDefaultInstance()) {
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
                     this.infosBuilder_ = ChatMsg.S2C_ChatLogin_6014.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
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
            S2C_ChatLogin_6014 parsedMessage = null;

            try {
               parsedMessage = (S2C_ChatLogin_6014)ChatMsg.S2C_ChatLogin_6014.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ChatLogin_6014)e.getUnfinishedMessage();
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

         public List<Chat_Info> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public Chat_Info getInfos(int index) {
            return this.infosBuilder_ == null ? (Chat_Info)this.infos_.get(index) : (Chat_Info)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, Chat_Info value) {
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

         public Builder setInfos(int index, Chat_Info.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(Chat_Info value) {
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

         public Builder addInfos(int index, Chat_Info value) {
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

         public Builder addInfos(Chat_Info.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, Chat_Info.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends Chat_Info> values) {
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

         public Chat_Info.Builder getInfosBuilder(int index) {
            return (Chat_Info.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public Chat_InfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (Chat_InfoOrBuilder)this.infos_.get(index) : (Chat_InfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends Chat_InfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public Chat_Info.Builder addInfosBuilder() {
            return (Chat_Info.Builder)this.getInfosFieldBuilder().addBuilder(ChatMsg.Chat_Info.getDefaultInstance());
         }

         public Chat_Info.Builder addInfosBuilder(int index) {
            return (Chat_Info.Builder)this.getInfosFieldBuilder().addBuilder(index, ChatMsg.Chat_Info.getDefaultInstance());
         }

         public List<Chat_Info.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<Chat_Info, Chat_Info.Builder, Chat_InfoOrBuilder> getInfosFieldBuilder() {
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

   public static final class S2C_ChatCondition_6016 extends GeneratedMessageV3 implements S2C_ChatCondition_6016OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int CONDITIONS_FIELD_NUMBER = 1;
      private List<Chat_Condition> conditions_;
      private byte memoizedIsInitialized;
      private static final S2C_ChatCondition_6016 DEFAULT_INSTANCE = new S2C_ChatCondition_6016();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ChatCondition_6016> PARSER = new AbstractParser<S2C_ChatCondition_6016>() {
         public S2C_ChatCondition_6016 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ChatCondition_6016(input, extensionRegistry);
         }
      };

      private S2C_ChatCondition_6016(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ChatCondition_6016() {
         this.memoizedIsInitialized = -1;
         this.conditions_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ChatCondition_6016();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ChatCondition_6016(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.conditions_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.conditions_.add(input.readMessage(ChatMsg.Chat_Condition.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.conditions_ = Collections.unmodifiableList(this.conditions_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_ChatCondition_6016_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_ChatCondition_6016_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChatCondition_6016.class, Builder.class);
      }

      public List<Chat_Condition> getConditionsList() {
         return this.conditions_;
      }

      public List<? extends Chat_ConditionOrBuilder> getConditionsOrBuilderList() {
         return this.conditions_;
      }

      public int getConditionsCount() {
         return this.conditions_.size();
      }

      public Chat_Condition getConditions(int index) {
         return (Chat_Condition)this.conditions_.get(index);
      }

      public Chat_ConditionOrBuilder getConditionsOrBuilder(int index) {
         return (Chat_ConditionOrBuilder)this.conditions_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getConditionsCount(); ++i) {
               if (!this.getConditions(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.conditions_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.conditions_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.conditions_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.conditions_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ChatCondition_6016)) {
            return super.equals(obj);
         } else {
            S2C_ChatCondition_6016 other = (S2C_ChatCondition_6016)obj;
            if (!this.getConditionsList().equals(other.getConditionsList())) {
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
            if (this.getConditionsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getConditionsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ChatCondition_6016 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ChatCondition_6016)PARSER.parseFrom(data);
      }

      public static S2C_ChatCondition_6016 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChatCondition_6016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChatCondition_6016 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ChatCondition_6016)PARSER.parseFrom(data);
      }

      public static S2C_ChatCondition_6016 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChatCondition_6016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChatCondition_6016 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ChatCondition_6016)PARSER.parseFrom(data);
      }

      public static S2C_ChatCondition_6016 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChatCondition_6016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChatCondition_6016 parseFrom(InputStream input) throws IOException {
         return (S2C_ChatCondition_6016)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChatCondition_6016 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChatCondition_6016)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChatCondition_6016 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ChatCondition_6016)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ChatCondition_6016 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChatCondition_6016)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChatCondition_6016 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ChatCondition_6016)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChatCondition_6016 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChatCondition_6016)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ChatCondition_6016 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ChatCondition_6016 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ChatCondition_6016> parser() {
         return PARSER;
      }

      public Parser<S2C_ChatCondition_6016> getParserForType() {
         return PARSER;
      }

      public S2C_ChatCondition_6016 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ChatCondition_6016OrBuilder {
         private int bitField0_;
         private List<Chat_Condition> conditions_;
         private RepeatedFieldBuilderV3<Chat_Condition, Chat_Condition.Builder, Chat_ConditionOrBuilder> conditionsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_ChatCondition_6016_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_ChatCondition_6016_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChatCondition_6016.class, Builder.class);
         }

         private Builder() {
            this.conditions_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.conditions_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChatMsg.S2C_ChatCondition_6016.alwaysUseFieldBuilders) {
               this.getConditionsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.conditionsBuilder_ == null) {
               this.conditions_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.conditionsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_ChatCondition_6016_descriptor;
         }

         public S2C_ChatCondition_6016 getDefaultInstanceForType() {
            return ChatMsg.S2C_ChatCondition_6016.getDefaultInstance();
         }

         public S2C_ChatCondition_6016 build() {
            S2C_ChatCondition_6016 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ChatCondition_6016 buildPartial() {
            S2C_ChatCondition_6016 result = new S2C_ChatCondition_6016(this);
            int from_bitField0_ = this.bitField0_;
            if (this.conditionsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.conditions_ = Collections.unmodifiableList(this.conditions_);
                  this.bitField0_ &= -2;
               }

               result.conditions_ = this.conditions_;
            } else {
               result.conditions_ = this.conditionsBuilder_.build();
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
            if (other instanceof S2C_ChatCondition_6016) {
               return this.mergeFrom((S2C_ChatCondition_6016)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ChatCondition_6016 other) {
            if (other == ChatMsg.S2C_ChatCondition_6016.getDefaultInstance()) {
               return this;
            } else {
               if (this.conditionsBuilder_ == null) {
                  if (!other.conditions_.isEmpty()) {
                     if (this.conditions_.isEmpty()) {
                        this.conditions_ = other.conditions_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureConditionsIsMutable();
                        this.conditions_.addAll(other.conditions_);
                     }

                     this.onChanged();
                  }
               } else if (!other.conditions_.isEmpty()) {
                  if (this.conditionsBuilder_.isEmpty()) {
                     this.conditionsBuilder_.dispose();
                     this.conditionsBuilder_ = null;
                     this.conditions_ = other.conditions_;
                     this.bitField0_ &= -2;
                     this.conditionsBuilder_ = ChatMsg.S2C_ChatCondition_6016.alwaysUseFieldBuilders ? this.getConditionsFieldBuilder() : null;
                  } else {
                     this.conditionsBuilder_.addAllMessages(other.conditions_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getConditionsCount(); ++i) {
               if (!this.getConditions(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ChatCondition_6016 parsedMessage = null;

            try {
               parsedMessage = (S2C_ChatCondition_6016)ChatMsg.S2C_ChatCondition_6016.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ChatCondition_6016)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureConditionsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.conditions_ = new ArrayList(this.conditions_);
               this.bitField0_ |= 1;
            }

         }

         public List<Chat_Condition> getConditionsList() {
            return this.conditionsBuilder_ == null ? Collections.unmodifiableList(this.conditions_) : this.conditionsBuilder_.getMessageList();
         }

         public int getConditionsCount() {
            return this.conditionsBuilder_ == null ? this.conditions_.size() : this.conditionsBuilder_.getCount();
         }

         public Chat_Condition getConditions(int index) {
            return this.conditionsBuilder_ == null ? (Chat_Condition)this.conditions_.get(index) : (Chat_Condition)this.conditionsBuilder_.getMessage(index);
         }

         public Builder setConditions(int index, Chat_Condition value) {
            if (this.conditionsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureConditionsIsMutable();
               this.conditions_.set(index, value);
               this.onChanged();
            } else {
               this.conditionsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setConditions(int index, Chat_Condition.Builder builderForValue) {
            if (this.conditionsBuilder_ == null) {
               this.ensureConditionsIsMutable();
               this.conditions_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.conditionsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addConditions(Chat_Condition value) {
            if (this.conditionsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureConditionsIsMutable();
               this.conditions_.add(value);
               this.onChanged();
            } else {
               this.conditionsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addConditions(int index, Chat_Condition value) {
            if (this.conditionsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureConditionsIsMutable();
               this.conditions_.add(index, value);
               this.onChanged();
            } else {
               this.conditionsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addConditions(Chat_Condition.Builder builderForValue) {
            if (this.conditionsBuilder_ == null) {
               this.ensureConditionsIsMutable();
               this.conditions_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.conditionsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addConditions(int index, Chat_Condition.Builder builderForValue) {
            if (this.conditionsBuilder_ == null) {
               this.ensureConditionsIsMutable();
               this.conditions_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.conditionsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllConditions(Iterable<? extends Chat_Condition> values) {
            if (this.conditionsBuilder_ == null) {
               this.ensureConditionsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.conditions_);
               this.onChanged();
            } else {
               this.conditionsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearConditions() {
            if (this.conditionsBuilder_ == null) {
               this.conditions_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.conditionsBuilder_.clear();
            }

            return this;
         }

         public Builder removeConditions(int index) {
            if (this.conditionsBuilder_ == null) {
               this.ensureConditionsIsMutable();
               this.conditions_.remove(index);
               this.onChanged();
            } else {
               this.conditionsBuilder_.remove(index);
            }

            return this;
         }

         public Chat_Condition.Builder getConditionsBuilder(int index) {
            return (Chat_Condition.Builder)this.getConditionsFieldBuilder().getBuilder(index);
         }

         public Chat_ConditionOrBuilder getConditionsOrBuilder(int index) {
            return this.conditionsBuilder_ == null ? (Chat_ConditionOrBuilder)this.conditions_.get(index) : (Chat_ConditionOrBuilder)this.conditionsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends Chat_ConditionOrBuilder> getConditionsOrBuilderList() {
            return this.conditionsBuilder_ != null ? this.conditionsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.conditions_);
         }

         public Chat_Condition.Builder addConditionsBuilder() {
            return (Chat_Condition.Builder)this.getConditionsFieldBuilder().addBuilder(ChatMsg.Chat_Condition.getDefaultInstance());
         }

         public Chat_Condition.Builder addConditionsBuilder(int index) {
            return (Chat_Condition.Builder)this.getConditionsFieldBuilder().addBuilder(index, ChatMsg.Chat_Condition.getDefaultInstance());
         }

         public List<Chat_Condition.Builder> getConditionsBuilderList() {
            return this.getConditionsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<Chat_Condition, Chat_Condition.Builder, Chat_ConditionOrBuilder> getConditionsFieldBuilder() {
            if (this.conditionsBuilder_ == null) {
               this.conditionsBuilder_ = new RepeatedFieldBuilderV3(this.conditions_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.conditions_ = null;
            }

            return this.conditionsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_RemoveMessage_6018 extends GeneratedMessageV3 implements S2C_RemoveMessage_6018OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private Internal.IntList playerId_;
      private byte memoizedIsInitialized;
      private static final S2C_RemoveMessage_6018 DEFAULT_INSTANCE = new S2C_RemoveMessage_6018();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RemoveMessage_6018> PARSER = new AbstractParser<S2C_RemoveMessage_6018>() {
         public S2C_RemoveMessage_6018 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RemoveMessage_6018(input, extensionRegistry);
         }
      };

      private S2C_RemoveMessage_6018(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RemoveMessage_6018() {
         this.memoizedIsInitialized = -1;
         this.playerId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RemoveMessage_6018();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RemoveMessage_6018(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_RemoveMessage_6018_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_RemoveMessage_6018_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RemoveMessage_6018.class, Builder.class);
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
         } else if (!(obj instanceof S2C_RemoveMessage_6018)) {
            return super.equals(obj);
         } else {
            S2C_RemoveMessage_6018 other = (S2C_RemoveMessage_6018)obj;
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

      public static S2C_RemoveMessage_6018 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RemoveMessage_6018)PARSER.parseFrom(data);
      }

      public static S2C_RemoveMessage_6018 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RemoveMessage_6018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RemoveMessage_6018 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RemoveMessage_6018)PARSER.parseFrom(data);
      }

      public static S2C_RemoveMessage_6018 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RemoveMessage_6018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RemoveMessage_6018 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RemoveMessage_6018)PARSER.parseFrom(data);
      }

      public static S2C_RemoveMessage_6018 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RemoveMessage_6018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RemoveMessage_6018 parseFrom(InputStream input) throws IOException {
         return (S2C_RemoveMessage_6018)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RemoveMessage_6018 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RemoveMessage_6018)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RemoveMessage_6018 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RemoveMessage_6018)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RemoveMessage_6018 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RemoveMessage_6018)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RemoveMessage_6018 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RemoveMessage_6018)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RemoveMessage_6018 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RemoveMessage_6018)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RemoveMessage_6018 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RemoveMessage_6018 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RemoveMessage_6018> parser() {
         return PARSER;
      }

      public Parser<S2C_RemoveMessage_6018> getParserForType() {
         return PARSER;
      }

      public S2C_RemoveMessage_6018 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RemoveMessage_6018OrBuilder {
         private int bitField0_;
         private Internal.IntList playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_RemoveMessage_6018_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_RemoveMessage_6018_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RemoveMessage_6018.class, Builder.class);
         }

         private Builder() {
            this.playerId_ = ChatMsg.S2C_RemoveMessage_6018.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerId_ = ChatMsg.S2C_RemoveMessage_6018.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChatMsg.S2C_RemoveMessage_6018.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = ChatMsg.S2C_RemoveMessage_6018.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_RemoveMessage_6018_descriptor;
         }

         public S2C_RemoveMessage_6018 getDefaultInstanceForType() {
            return ChatMsg.S2C_RemoveMessage_6018.getDefaultInstance();
         }

         public S2C_RemoveMessage_6018 build() {
            S2C_RemoveMessage_6018 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RemoveMessage_6018 buildPartial() {
            S2C_RemoveMessage_6018 result = new S2C_RemoveMessage_6018(this);
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
            if (other instanceof S2C_RemoveMessage_6018) {
               return this.mergeFrom((S2C_RemoveMessage_6018)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RemoveMessage_6018 other) {
            if (other == ChatMsg.S2C_RemoveMessage_6018.getDefaultInstance()) {
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
            S2C_RemoveMessage_6018 parsedMessage = null;

            try {
               parsedMessage = (S2C_RemoveMessage_6018)ChatMsg.S2C_RemoveMessage_6018.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RemoveMessage_6018)e.getUnfinishedMessage();
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
               this.playerId_ = ChatMsg.S2C_RemoveMessage_6018.mutableCopy(this.playerId_);
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
            this.playerId_ = ChatMsg.S2C_RemoveMessage_6018.emptyIntList();
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

   public static final class C2S_ChoiceBubble_6019 extends GeneratedMessageV3 implements C2S_ChoiceBubble_6019OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUBBLEID_FIELD_NUMBER = 1;
      private int bubbleId_;
      private byte memoizedIsInitialized;
      private static final C2S_ChoiceBubble_6019 DEFAULT_INSTANCE = new C2S_ChoiceBubble_6019();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ChoiceBubble_6019> PARSER = new AbstractParser<C2S_ChoiceBubble_6019>() {
         public C2S_ChoiceBubble_6019 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ChoiceBubble_6019(input, extensionRegistry);
         }
      };

      private C2S_ChoiceBubble_6019(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ChoiceBubble_6019() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ChoiceBubble_6019();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ChoiceBubble_6019(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bubbleId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_ChoiceBubble_6019_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_ChoiceBubble_6019_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChoiceBubble_6019.class, Builder.class);
      }

      public boolean hasBubbleId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBubbleId() {
         return this.bubbleId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBubbleId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.bubbleId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.bubbleId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ChoiceBubble_6019)) {
            return super.equals(obj);
         } else {
            C2S_ChoiceBubble_6019 other = (C2S_ChoiceBubble_6019)obj;
            if (this.hasBubbleId() != other.hasBubbleId()) {
               return false;
            } else if (this.hasBubbleId() && this.getBubbleId() != other.getBubbleId()) {
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
            if (this.hasBubbleId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBubbleId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ChoiceBubble_6019 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ChoiceBubble_6019)PARSER.parseFrom(data);
      }

      public static C2S_ChoiceBubble_6019 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChoiceBubble_6019)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChoiceBubble_6019 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ChoiceBubble_6019)PARSER.parseFrom(data);
      }

      public static C2S_ChoiceBubble_6019 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChoiceBubble_6019)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChoiceBubble_6019 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ChoiceBubble_6019)PARSER.parseFrom(data);
      }

      public static C2S_ChoiceBubble_6019 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChoiceBubble_6019)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChoiceBubble_6019 parseFrom(InputStream input) throws IOException {
         return (C2S_ChoiceBubble_6019)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChoiceBubble_6019 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChoiceBubble_6019)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChoiceBubble_6019 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ChoiceBubble_6019)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ChoiceBubble_6019 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChoiceBubble_6019)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChoiceBubble_6019 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ChoiceBubble_6019)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChoiceBubble_6019 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChoiceBubble_6019)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ChoiceBubble_6019 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ChoiceBubble_6019 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ChoiceBubble_6019> parser() {
         return PARSER;
      }

      public Parser<C2S_ChoiceBubble_6019> getParserForType() {
         return PARSER;
      }

      public C2S_ChoiceBubble_6019 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ChoiceBubble_6019OrBuilder {
         private int bitField0_;
         private int bubbleId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_ChoiceBubble_6019_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_ChoiceBubble_6019_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChoiceBubble_6019.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChatMsg.C2S_ChoiceBubble_6019.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.bubbleId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_ChoiceBubble_6019_descriptor;
         }

         public C2S_ChoiceBubble_6019 getDefaultInstanceForType() {
            return ChatMsg.C2S_ChoiceBubble_6019.getDefaultInstance();
         }

         public C2S_ChoiceBubble_6019 build() {
            C2S_ChoiceBubble_6019 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ChoiceBubble_6019 buildPartial() {
            C2S_ChoiceBubble_6019 result = new C2S_ChoiceBubble_6019(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.bubbleId_ = this.bubbleId_;
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
            if (other instanceof C2S_ChoiceBubble_6019) {
               return this.mergeFrom((C2S_ChoiceBubble_6019)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ChoiceBubble_6019 other) {
            if (other == ChatMsg.C2S_ChoiceBubble_6019.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBubbleId()) {
                  this.setBubbleId(other.getBubbleId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBubbleId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ChoiceBubble_6019 parsedMessage = null;

            try {
               parsedMessage = (C2S_ChoiceBubble_6019)ChatMsg.C2S_ChoiceBubble_6019.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ChoiceBubble_6019)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBubbleId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBubbleId() {
            return this.bubbleId_;
         }

         public Builder setBubbleId(int value) {
            this.bitField0_ |= 1;
            this.bubbleId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBubbleId() {
            this.bitField0_ &= -2;
            this.bubbleId_ = 0;
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

   public static final class S2C_ChoiceBubble_6020 extends GeneratedMessageV3 implements S2C_ChoiceBubble_6020OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUBBLEID_FIELD_NUMBER = 1;
      private int bubbleId_;
      private byte memoizedIsInitialized;
      private static final S2C_ChoiceBubble_6020 DEFAULT_INSTANCE = new S2C_ChoiceBubble_6020();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ChoiceBubble_6020> PARSER = new AbstractParser<S2C_ChoiceBubble_6020>() {
         public S2C_ChoiceBubble_6020 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ChoiceBubble_6020(input, extensionRegistry);
         }
      };

      private S2C_ChoiceBubble_6020(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ChoiceBubble_6020() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ChoiceBubble_6020();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ChoiceBubble_6020(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bubbleId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_ChoiceBubble_6020_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_ChoiceBubble_6020_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChoiceBubble_6020.class, Builder.class);
      }

      public boolean hasBubbleId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBubbleId() {
         return this.bubbleId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBubbleId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.bubbleId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.bubbleId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ChoiceBubble_6020)) {
            return super.equals(obj);
         } else {
            S2C_ChoiceBubble_6020 other = (S2C_ChoiceBubble_6020)obj;
            if (this.hasBubbleId() != other.hasBubbleId()) {
               return false;
            } else if (this.hasBubbleId() && this.getBubbleId() != other.getBubbleId()) {
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
            if (this.hasBubbleId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBubbleId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ChoiceBubble_6020 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ChoiceBubble_6020)PARSER.parseFrom(data);
      }

      public static S2C_ChoiceBubble_6020 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChoiceBubble_6020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChoiceBubble_6020 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ChoiceBubble_6020)PARSER.parseFrom(data);
      }

      public static S2C_ChoiceBubble_6020 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChoiceBubble_6020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChoiceBubble_6020 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ChoiceBubble_6020)PARSER.parseFrom(data);
      }

      public static S2C_ChoiceBubble_6020 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChoiceBubble_6020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChoiceBubble_6020 parseFrom(InputStream input) throws IOException {
         return (S2C_ChoiceBubble_6020)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChoiceBubble_6020 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChoiceBubble_6020)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChoiceBubble_6020 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ChoiceBubble_6020)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ChoiceBubble_6020 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChoiceBubble_6020)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChoiceBubble_6020 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ChoiceBubble_6020)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChoiceBubble_6020 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChoiceBubble_6020)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ChoiceBubble_6020 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ChoiceBubble_6020 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ChoiceBubble_6020> parser() {
         return PARSER;
      }

      public Parser<S2C_ChoiceBubble_6020> getParserForType() {
         return PARSER;
      }

      public S2C_ChoiceBubble_6020 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ChoiceBubble_6020OrBuilder {
         private int bitField0_;
         private int bubbleId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_ChoiceBubble_6020_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_ChoiceBubble_6020_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChoiceBubble_6020.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChatMsg.S2C_ChoiceBubble_6020.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.bubbleId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_S2C_ChoiceBubble_6020_descriptor;
         }

         public S2C_ChoiceBubble_6020 getDefaultInstanceForType() {
            return ChatMsg.S2C_ChoiceBubble_6020.getDefaultInstance();
         }

         public S2C_ChoiceBubble_6020 build() {
            S2C_ChoiceBubble_6020 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ChoiceBubble_6020 buildPartial() {
            S2C_ChoiceBubble_6020 result = new S2C_ChoiceBubble_6020(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.bubbleId_ = this.bubbleId_;
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
            if (other instanceof S2C_ChoiceBubble_6020) {
               return this.mergeFrom((S2C_ChoiceBubble_6020)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ChoiceBubble_6020 other) {
            if (other == ChatMsg.S2C_ChoiceBubble_6020.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBubbleId()) {
                  this.setBubbleId(other.getBubbleId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBubbleId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ChoiceBubble_6020 parsedMessage = null;

            try {
               parsedMessage = (S2C_ChoiceBubble_6020)ChatMsg.S2C_ChoiceBubble_6020.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ChoiceBubble_6020)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBubbleId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBubbleId() {
            return this.bubbleId_;
         }

         public Builder setBubbleId(int value) {
            this.bitField0_ |= 1;
            this.bubbleId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBubbleId() {
            this.bitField0_ &= -2;
            this.bubbleId_ = 0;
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

   public static final class C2S_KingOfChallenge_6021 extends GeneratedMessageV3 implements C2S_KingOfChallenge_6021OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SERVERID_FIELD_NUMBER = 1;
      private int serverId_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      private byte memoizedIsInitialized;
      private static final C2S_KingOfChallenge_6021 DEFAULT_INSTANCE = new C2S_KingOfChallenge_6021();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_KingOfChallenge_6021> PARSER = new AbstractParser<C2S_KingOfChallenge_6021>() {
         public C2S_KingOfChallenge_6021 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_KingOfChallenge_6021(input, extensionRegistry);
         }
      };

      private C2S_KingOfChallenge_6021(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_KingOfChallenge_6021() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_KingOfChallenge_6021();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_KingOfChallenge_6021(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.serverId_ = input.readInt32();
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
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_KingOfChallenge_6021_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_KingOfChallenge_6021_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_KingOfChallenge_6021.class, Builder.class);
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getServerId() {
         return this.serverId_;
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
         } else if (!this.hasServerId()) {
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
            output.writeInt32(1, this.serverId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.serverId_);
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
         } else if (!(obj instanceof C2S_KingOfChallenge_6021)) {
            return super.equals(obj);
         } else {
            C2S_KingOfChallenge_6021 other = (C2S_KingOfChallenge_6021)obj;
            if (this.hasServerId() != other.hasServerId()) {
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
            if (this.hasServerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getServerId();
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

      public static C2S_KingOfChallenge_6021 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_KingOfChallenge_6021)PARSER.parseFrom(data);
      }

      public static C2S_KingOfChallenge_6021 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_KingOfChallenge_6021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_KingOfChallenge_6021 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_KingOfChallenge_6021)PARSER.parseFrom(data);
      }

      public static C2S_KingOfChallenge_6021 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_KingOfChallenge_6021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_KingOfChallenge_6021 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_KingOfChallenge_6021)PARSER.parseFrom(data);
      }

      public static C2S_KingOfChallenge_6021 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_KingOfChallenge_6021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_KingOfChallenge_6021 parseFrom(InputStream input) throws IOException {
         return (C2S_KingOfChallenge_6021)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_KingOfChallenge_6021 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_KingOfChallenge_6021)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_KingOfChallenge_6021 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_KingOfChallenge_6021)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_KingOfChallenge_6021 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_KingOfChallenge_6021)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_KingOfChallenge_6021 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_KingOfChallenge_6021)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_KingOfChallenge_6021 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_KingOfChallenge_6021)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_KingOfChallenge_6021 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_KingOfChallenge_6021 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_KingOfChallenge_6021> parser() {
         return PARSER;
      }

      public Parser<C2S_KingOfChallenge_6021> getParserForType() {
         return PARSER;
      }

      public C2S_KingOfChallenge_6021 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_KingOfChallenge_6021OrBuilder {
         private int bitField0_;
         private int serverId_;
         private int playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_KingOfChallenge_6021_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_KingOfChallenge_6021_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_KingOfChallenge_6021.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChatMsg.C2S_KingOfChallenge_6021.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.serverId_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChatMsg.internal_static_chat_com_gzbz_protobuf_C2S_KingOfChallenge_6021_descriptor;
         }

         public C2S_KingOfChallenge_6021 getDefaultInstanceForType() {
            return ChatMsg.C2S_KingOfChallenge_6021.getDefaultInstance();
         }

         public C2S_KingOfChallenge_6021 build() {
            C2S_KingOfChallenge_6021 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_KingOfChallenge_6021 buildPartial() {
            C2S_KingOfChallenge_6021 result = new C2S_KingOfChallenge_6021(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.serverId_ = this.serverId_;
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
            if (other instanceof C2S_KingOfChallenge_6021) {
               return this.mergeFrom((C2S_KingOfChallenge_6021)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_KingOfChallenge_6021 other) {
            if (other == ChatMsg.C2S_KingOfChallenge_6021.getDefaultInstance()) {
               return this;
            } else {
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
            if (!this.hasServerId()) {
               return false;
            } else {
               return this.hasPlayerId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_KingOfChallenge_6021 parsedMessage = null;

            try {
               parsedMessage = (C2S_KingOfChallenge_6021)ChatMsg.C2S_KingOfChallenge_6021.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_KingOfChallenge_6021)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 1;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -2;
            this.serverId_ = 0;
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

   public interface C2S_ChatDistory_6011OrBuilder extends MessageOrBuilder {
      boolean hasChannel();

      int getChannel();

      boolean hasDestPlayerId();

      int getDestPlayerId();

      boolean hasChatId();

      int getChatId();
   }

   public interface C2S_ChatLogin_6013OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Chat_6003OrBuilder extends MessageOrBuilder {
      boolean hasChannel();

      int getChannel();

      boolean hasContent();

      String getContent();

      ByteString getContentBytes();

      boolean hasSubclass();

      int getSubclass();

      boolean hasDestPlayerId();

      int getDestPlayerId();

      boolean hasCode();

      int getCode();

      boolean hasShareTips();

      String getShareTips();

      ByteString getShareTipsBytes();
   }

   public interface C2S_ChoiceBubble_6019OrBuilder extends MessageOrBuilder {
      boolean hasBubbleId();

      int getBubbleId();
   }

   public interface C2S_DelRecord_6005OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();
   }

   public interface C2S_FightToFriend_6007OrBuilder extends MessageOrBuilder {
      boolean hasServerId();

      int getServerId();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasCross();

      boolean getCross();
   }

   public interface C2S_KingOfChallenge_6021OrBuilder extends MessageOrBuilder {
      boolean hasServerId();

      int getServerId();

      boolean hasPlayerId();

      int getPlayerId();
   }

   public interface C2S_PlayerDetailInfo_6009OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasServerId();

      int getServerId();

      boolean hasArraying();

      CommonMsg.HeroState getArraying();

      boolean hasCross();

      boolean getCross();
   }

   public interface Chat_ConditionOrBuilder extends MessageOrBuilder {
      boolean hasChannel();

      int getChannel();

      boolean hasCoolTime();

      int getCoolTime();

      boolean hasBAll();

      boolean getBAll();

      boolean hasLevel();

      int getLevel();

      boolean hasVip();

      int getVip();
   }

   public interface Chat_InfoOrBuilder extends MessageOrBuilder {
      boolean hasChannel();

      int getChannel();

      boolean hasContent();

      String getContent();

      ByteString getContentBytes();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasSex();

      int getSex();

      boolean hasLevel();

      int getLevel();

      boolean hasVipLv();

      int getVipLv();

      boolean hasHead();

      int getHead();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasPrestige();

      int getPrestige();

      boolean hasServerId();

      int getServerId();

      boolean hasProvince();

      String getProvince();

      ByteString getProvinceBytes();

      boolean hasCity();

      String getCity();

      ByteString getCityBytes();

      boolean hasSubclass();

      int getSubclass();

      boolean hasExtra1();

      int getExtra1();

      boolean hasExtra2();

      String getExtra2();

      ByteString getExtra2Bytes();

      boolean hasHeroInfo();

      CommonMsg.HeroInfo getHeroInfo();

      CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder();

      boolean hasChatTime();

      int getChatTime();

      boolean hasChatId();

      int getChatId();

      boolean hasShowVip();

      boolean getShowVip();

      boolean hasAppointId();

      int getAppointId();

      boolean hasSecondTitle();

      int getSecondTitle();

      boolean hasUnionId();

      int getUnionId();

      boolean hasItemInfo();

      BagMsg.Item_Info getItemInfo();

      BagMsg.Item_InfoOrBuilder getItemInfoOrBuilder();

      boolean hasShareTips();

      String getShareTips();

      ByteString getShareTipsBytes();

      boolean hasBubble();

      int getBubble();

      boolean hasAreaId();

      int getAreaId();

      boolean hasProvinceId();

      int getProvinceId();

      boolean hasCityId();

      int getCityId();

      List<Integer> getMedalList();

      int getMedalCount();

      int getMedal(int index);

      List<CommonMsg.MapDataIS> getCustomPrestigeList();

      CommonMsg.MapDataIS getCustomPrestige(int index);

      int getCustomPrestigeCount();

      List<? extends CommonMsg.MapDataISOrBuilder> getCustomPrestigeOrBuilderList();

      CommonMsg.MapDataISOrBuilder getCustomPrestigeOrBuilder(int index);

      boolean hasQqLogo();

      String getQqLogo();

      ByteString getQqLogoBytes();

      boolean hasQqWanKaLv();

      int getQqWanKaLv();
   }

   public interface S2C_ChatCondition_6016OrBuilder extends MessageOrBuilder {
      List<Chat_Condition> getConditionsList();

      Chat_Condition getConditions(int index);

      int getConditionsCount();

      List<? extends Chat_ConditionOrBuilder> getConditionsOrBuilderList();

      Chat_ConditionOrBuilder getConditionsOrBuilder(int index);
   }

   public interface S2C_ChatDistory_6012OrBuilder extends MessageOrBuilder {
      List<Chat_Info> getInfosList();

      Chat_Info getInfos(int index);

      int getInfosCount();

      List<? extends Chat_InfoOrBuilder> getInfosOrBuilderList();

      Chat_InfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2C_ChatLogin_6014OrBuilder extends MessageOrBuilder {
      List<Chat_Info> getInfosList();

      Chat_Info getInfos(int index);

      int getInfosCount();

      List<? extends Chat_InfoOrBuilder> getInfosOrBuilderList();

      Chat_InfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2C_Chat_6004OrBuilder extends MessageOrBuilder {
      List<Chat_Info> getInfosList();

      Chat_Info getInfos(int index);

      int getInfosCount();

      List<? extends Chat_InfoOrBuilder> getInfosOrBuilderList();

      Chat_InfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2C_ChoiceBubble_6020OrBuilder extends MessageOrBuilder {
      boolean hasBubbleId();

      int getBubbleId();
   }

   public interface S2C_DelRecord_6006OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasPlayerId();

      int getPlayerId();
   }

   public interface S2C_PlayerDetailInfo_6010OrBuilder extends MessageOrBuilder {
      boolean hasPlayerInfo();

      CommonMsg.PlayerInfo getPlayerInfo();

      CommonMsg.PlayerInfoOrBuilder getPlayerInfoOrBuilder();

      boolean hasArraying();

      CommonMsg.HeroState getArraying();

      boolean hasReport();

      boolean getReport();
   }

   public interface S2C_RemoveMessage_6018OrBuilder extends MessageOrBuilder {
      List<Integer> getPlayerIdList();

      int getPlayerIdCount();

      int getPlayerId(int index);
   }
}
